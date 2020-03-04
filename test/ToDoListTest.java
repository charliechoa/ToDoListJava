import java.util.Collection;

import org.junit.*;
import org.junit.Test;
import junit.framework.*;


public class ToDoListTest extends TestCase{
	// Define Test Fixtures

	
	public ToDoListTest() {
		super();
	}
	@Before
	 public void setUp() throws Exception{
		//Initialise Test Fixtures
	}
	@After
	 public void tearDown() throws Exception{
		// Uninitialise test Fixtures
	}

	@Test
	public void testAddTask() {
		Task testT = new Task("New Task 1");
		ToDoList TList = new ToDoList();
		TList.addTask(testT);
		assertEquals(TList.getAllTasks().size(), 1);
		//fail("Not implemented yet");
	}
	@Test
	public void testgetStatus() {
		Task testG = new Task("Get Task 2");
		testG.setComplete(true);
		ToDoList TList = new ToDoList();
		TList.addTask(testG);
		//assertFalse(TList.getStatus(testG.getDescription()));
		assertTrue(TList.getStatus(testG.getDescription()));
		//fail("Not implemented yet");
	}
	@Test
	public void testRemoveTask() {
		Task testR1 = new Task("Remove Task 1");
		Task testR2 = new Task("Remove Task 2");
		ToDoList TList = new ToDoList();
		TList.addTask(testR1);
		TList.addTask(testR2);
		TList.removeTask(testR1.getDescription());
		assertEquals(TList.getAllTasks().size(), 1);
		//fail("Not implemented yet");
	}
	@Test
	public void testGetCompletedTasks() {
		Task testGC = new Task("Completed Task 1");
		testGC.setComplete(true);
		ToDoList TList = new ToDoList();
		TList.addTask(testGC);
		//fail("Not implemented yet");
	}
	@Test
	public void testCompleteTask() {
		Task testC = new Task ("In Progress");
		testC.isComplete();
		//fail ("Not implemented yet");
	}
	@Test
	public void testEditTask() {
		Task testT1 = new Task ("Current Description");
		Task testT2 = new Task ("New Description");
		ToDoList TList = new ToDoList ();
		TList.addTask(testT1);
		//TList.editTask("New Description");
		TList.editTask(testT2.getDescription());
		//fail ("Not implemented yet");
	}
}
