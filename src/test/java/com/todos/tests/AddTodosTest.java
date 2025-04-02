package com.todos.tests;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import com.todos.pages.TodosPage;
import com.todos.utils.Setup;


public class AddTodosTest extends Setup {

	public AddTodosTest() throws IOException {
		super();
		
	}

	TodosPage todopage;
	
	@Test
	public void iAddToDo() throws IOException {
		
		todopage = new TodosPage();
		boolean fieldToDo = todopage.isElementDisplayed(TodosPage.inputField);
		Assertions.assertTrue(fieldToDo);
		todopage.fillTodo(prop.getProperty("todo1"));
		
		String getText = todopage.checkElementContain(TodosPage.textToDo);
		Assertions.assertTrue(getText.contains(prop.getProperty("todo1")));
		
		boolean checkbox = todopage.isChekboxSelected(TodosPage.checkboxToDo);
		Assertions.assertFalse(checkbox);
	}
}
