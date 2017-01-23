package singleton;

import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		Visitors visitors = Visitors.getInstance();
		visitors.addVisitor("�湮��1");
		visitors.addVisitor("�湮��2");
		visitors.addVisitor("�湮��3");
		
		System.out.println(visitors.getAllVisitorsCount());
		
		Visitors visitors2 = Visitors.getInstance();
		visitors.addVisitor("�湮��4");
		visitors.addVisitor("�湮��5");
		visitors.addVisitor("�湮��6");
		visitors.addVisitor("�湮��7");
		System.out.println(visitors2.getAllVisitorsCount());
		System.out.println(visitors.getAllVisitorsCount());
		
		List<String> visitorList = visitors2.getAllVisitors();
		for (String visitor : visitorList) {
			System.out.println(visitor);
		}
		
	}
	
}
