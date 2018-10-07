import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

public class StudentDriver {

	private static DateTime startDate;
	private static List<Module> moduleList;
	private static List<Module> returnedModuleList;
	private static List<Student> returnedStudentList;
	
	public static void main(String[] args) {
		
		startDate = new DateTime();
		
		moduleList = new ArrayList<Module>();
		returnedModuleList = new ArrayList<Module>();
		returnedStudentList = new ArrayList<Student>();
		
		
		System.out.println("Joda time is " + startDate);
		Student sd1 = new Student("kevin", 1, "2018-10-5", 25);
		Student sd2 = new Student("tom", 2, "2018-10-6", 30);
		Student sd3 = new Student("ann", 3, "2018-10-7", 35);
		
		Module md1 = new Module("CT417", "10", sd1);
		Module md2 = new Module("CT421", "11", sd2);
		Module md3 = new Module("CT404", "12", sd3);
		
		moduleList.add(md1);
		moduleList.add(md2);
		moduleList.add(md3);
		
		Course cource1 = new Course("CSIT", moduleList);		
		displayResults(cource1);
		
		
		moduleList.clear();
		Student sd4 = new Student("Brendan", 1, "2018-10-1", 5);
		Student sd5 = new Student("Gerry", 2, "2018-10-2", 10);
		Student sd6 = new Student("Aoife", 3, "2018-10-3", 15);
		
		Module md4 = new Module("CT600", "10", sd4);
		Module md5 = new Module("CT601", "11", sd5);
		Module md6 = new Module("CT602", "12", sd6);
		
		moduleList.add(md4);
		moduleList.add(md5);
		moduleList.add(md6);
		
		Course cource2 = new Course("EEE", moduleList);
		displayResults(cource2);

	}
	
	
	@SuppressWarnings("unchecked")
	public static void displayResults(Course cource) {

		returnedModuleList = cource.getModuleList();
		
		for (int i = 0; i < returnedModuleList.size(); i++) {
			Module m = (Module) moduleList.get(i);
		    System.out.print("Course Name: " + cource.getCourseName() + ", Module Name: " + m.getModuleName() + ", Start Date - Month: " + cource.getStartDate().getMonthOfYear());
		    
		    returnedStudentList = m.getStudentList();
		    
		    for (int j = 0; j < returnedStudentList.size(); j++) {
		    	Student s = (Student) m.getStudentList().get(j);
		    	System.out.println(", Student Name: " + s.getUsername());
		    }	    
		}		
	}
}
