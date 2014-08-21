package unit_test_mock;

public class StudentController {

	private DbWrapperStudent db;
	
	public StudentController(DbWrapperStudent db)
	{
		this.db = db;
	}
	
	public void saveStudent(Student s)
	{
		if (s.validateStudent())
		{
			//mere kode...
			
			
			//så gem i databasen
			db.save();
		}
	}
	
}
