package unit_test_mock;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class TestStudentController {

	@Test
	public void test() {
		//Arrange
		Student s = new Student();
		//Mock - Fake - ikke en "rigtig" DbWrapperStudent, men en fake.
		DbWrapperStudent db = Mockito.mock(DbWrapperStudent.class);
		StudentController controller = new StudentController(db);
	
		//Act
		controller.saveStudent(s);
		
		//Assert
		Mockito.verify(db, Mockito.times(1)).save();
	}

}
