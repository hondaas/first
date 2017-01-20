// 그림판 만들기

 

//이벤트 패키지

import java.awt.*;

import java.awt.event.*; 

import java.io.*;

import java.util.*; //저장

 

//저장을 위한 클래스

class Draw implements Serializable {

 private int x, y, x1, y1;

 private int dist;

 public int getDist() {return dist;}

 public void setDist(int dist) {this.dist = dist;}

 public int getX() {return x;}

 public void setX(int x) {this.x = x;}

 public int getY() {return y;}

 public void setY(int y) {this.y = y;}

 public int getX1() {return x1;}

 public void setX1(int x1) {this.x1 = x1;}

 public int getY1() {return y1;}

 public void setY1(int y1) {this.y1 = y1;}

}

 

                                                                   //메뉴이벤트구성   //마우스이벤트     //모션이벤트

class Exam_04_sub extends Frame implements ItemListener, MouseListener, MouseMotionListener {

 

 //화면구성부

 private MenuBar mb = new MenuBar(); //메뉴바

 private Menu draw = new Menu("DRAW"); //메뉴 DRAW

 

 //체크박스 서브메뉴

 private CheckboxMenuItem pen = new CheckboxMenuItem("PEN", true);  // 기본체크

 private CheckboxMenuItem line = new CheckboxMenuItem("LINE");

 private CheckboxMenuItem oval = new CheckboxMenuItem("OVAL");

 private CheckboxMenuItem rect = new CheckboxMenuItem("RECT");

 

 private int x, y, x1, y1; //마우스를 눌렀을때와 뗐을때 각 좌표값

 

 private Vector vc = new Vector();

 

 //화면분할

 private Panel p = new Panel();

 private BorderLayout bl = new BorderLayout();

 private FlowLayout fl = new FlowLayout(FlowLayout.RIGHT);

 

 public Exam_04_sub(String title) {

  super(title);

  

  //로고만드는 메소드

  Toolkit tk = Toolkit.getDefaultToolkit();

  Image img2 = tk.getImage("nex.gif");

  this.setIconImage(img2);

 

  this.init(); //화면구성용 메소드

  this.start(); //이벤트용 메소드

  

  //window의 크기 위치조정

  super.setSize(400,400);

  Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

  Dimension frm = super.getSize();

  int xpos = (int) (screen.getWidth() / 2 - frm.getWidth() / 2);

  int ypos = (int) (screen.getHeight() / 2 - frm.getHeight() / 2);

  super.setLocation(xpos, ypos);

  super.setResizable(false);

  super.setVisible(true);

 }

 

 //레이아웃 화면구성

 public void init() {

  draw.add(pen);   //pen

  draw.add(line);  //line

  draw.add(oval);  //oval

  draw.add(rect);  //rect

  mb.add(draw);    // draw

  this.setMenuBar(mb); // 메뉴바

  }

 

 //이벤트 구성

 public void start() {

  // window의 X버튼을 누르면 window를 종료하라

  this.addWindowListener(new WindowAdapter() {

    public void windowClosing(WindowEvent e) {

      System.exit(0);

      }

    });

  

  //선택된 메뉴만 체크되도록 하는 이벤트

  pen.addItemListener(this);

  line.addItemListener(this);

  oval.addItemListener(this);

  rect.addItemListener(this);

  

  this.addMouseListener(this);

  this.addMouseMotionListener(this);//마우스가 움직이는 동안 그려지는 모양을 위한 이벤트

 }

 

 //그림을 위한 메소드

 public void paint(Graphics g) {

  

  //그림그리기

  for(int i = 0; i < vc.size(); ++i) {

   Draw d = (Draw)vc.elementAt(i);

   if(d.getDist() == 1) {

    g.drawLine(d.getX(), d.getY(), d.getX1(), d.getY1());

   }

   else if(d.getDist() == 2) {

    g.drawOval(d.getX(), d.getY(), d.getX1() - d.getX(), d.getY1() - d.getY());

   }

   else if(d.getDist() == 3) {

    g.drawRect(d.getX(), d.getY(), d.getX1() - d.getX(), d.getY1() - d.getY());

   }

   

  }

  

  

  // 마우스를 눌렀다 떼었을때 

  if(line.getState() == true) {  //라인을 체크하면

   g.drawLine(x, y, x1, y1);  //x,y좌표에서 x1,y1좌표에 라인을 그려라

  }

  else if(oval.getState() == true){  //oval을 체크하면

   g.drawOval(x, y, x1 - x, y1 - y); //oval을 그려라

  }

  else if(rect.getState() == true) {    //rect를 체크하면

   g.drawRect(x, y, x1 - x, y1 - y);  //rect를 그려라

  }

 }

 

 //선택된 메뉴만 체크되도록 하는 이벤트

 public void itemStateChanged(ItemEvent e){

  pen.setState(false);

  line.setState(false);

  oval.setState(false);

  rect.setState(false);

  CheckboxMenuItem cb = (CheckboxMenuItem)e.getSource();

     cb.setState(true);

 }

 

 

 //마우스 사용을 위한 메소드

 public void mouseClicked(MouseEvent e) {}

 public void mousePressed(MouseEvent e) { //눌렀을때

  x = e.getX();       //x의 좌표값을 얻어내어

  y = e.getY();       //y의 좌표값을 얻어내어

 }

 public void mouseReleased(MouseEvent e) { //떼었을때

  x1 = e.getX();   //x1의 좌표값

  y1 = e.getY();   //y1의 좌표값

  this.repaint();  //그림을 다시 그린다

  

  //

  if(pen.getState() != true) {  //pen이 true가 아닐때에만 아래를 실행하라

   int dist = 0;

   

   if(line.getState() == true) dist =1; // line가 체크되면 1값을 대입

   else if(oval.getState() == true) dist = 2; // ovaldl 체크되면 2값을 대입

   else if(rect.getState()== true) dist = 3; // rect가 체크되면 3값을 대입

   Draw d = new Draw();  //d 객체생성

   d.setDist(dist);  //dist 값 대입

   

   //각각의 값 대입

   d.setX(x);  

   d.setY(y);

   d.setX1(x1);

   d.setY1(y1);

   vc.add(d); //vc에 값을 저장하라

  }

 }

 public void mouseEntered(MouseEvent e) {}

 public void mouseExited(MouseEvent e) {}

 

 //마우스가 움직이는 동안 그려지는 모양 보이기

 public void mouseDragged(MouseEvent e) {

  x1 = e.getX();

  y1 = e.getY();

  this.repaint(); //움직이는 동안 보여지기

  

  // pen 그려지는 이벤트

  if(pen.getState()) {  

   Draw d = new Draw();  

   d.setDist(1);

   d.setX(x);

   d.setY(y);

   d.setX1(x1);

   d.setY1(y1);

   vc.add(d);

   x = x1;

   y = y1;

  }

 }

 public void mouseMoved(MouseEvent e) {}

}

 

 

public class Exam_04 {

 public static void main(String[] ar) {

  Exam_04_sub ex = new Exam_04_sub("이미지닉스 그림판"); // 메뉴글자

 }

}


