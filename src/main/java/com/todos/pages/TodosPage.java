package com.todos.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.todos.utils.BasePage;

public class TodosPage extends BasePage {

	public TodosPage() throws IOException {
		
		PageFactory.initElements(driver, this);
	
	}
	
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='What needs to be done?']")
	public static WebElement inputField;
	
	@FindBy(how = How.XPATH, using = "//label[normalize-space()='Adopter de bonnes pratiques de test']")
	public static WebElement textToDo;
	
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
	public static WebElement checkboxToDo;
	
	public void fillTodo(String todo) {
		
		inputField.sendKeys(todo);
		inputField.sendKeys(Keys.ENTER);
		
	}
	
	public Boolean isElementDisplayed(WebElement element) {
		
		//Boolean isElementDisplayed = element.isDisplayed();
		//return isElementDisplayed;
		return element.isDisplayed();
	}
	
	public String checkElementContain(WebElement element) {
		
		return element.getText();
	}
	
	public Boolean isChekboxSelected(WebElement element) {
		
		return element.isSelected();
	}

}
