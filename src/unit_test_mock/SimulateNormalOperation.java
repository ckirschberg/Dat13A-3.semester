package unit_test_mock;

public class SimulateNormalOperation {
	public static void main(String[] args)
	{
		Student s = new Student();
		
		DbWrapperStudent db = new DbWrapperStudent();
		
		StudentController controller = new StudentController(db);
		
		controller.saveStudent(s);
		
	}
}
