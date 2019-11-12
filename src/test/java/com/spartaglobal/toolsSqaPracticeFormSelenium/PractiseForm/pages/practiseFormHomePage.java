package com.spartaglobal.toolsSqaPracticeFormSelenium.PractiseForm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Date;
import java.util.List;

public class practiseFormHomePage {

    private WebDriver driver;
    private String homePageURL = "https://www.toolsqa.com/automation-practice-form/";
    private By partialLinkText = By.partialLinkText("Partial");
    private By linkTestID = By.linkText("Link Test");
    private By firstNameTextBox = By.name("firstname");
    private By lastNameTextBox = By.id("lastname");
    private By submitButton = By.id("submit");
    private By cookieButton = By.id("cookie_action_close_header");
    private By sexElements = By.name("sex");
    private By yearOfExperience = By.name("exp");
    private By dateEnterID = By.id("datepicker");
    private By professionID = By.name("profession");
    private By automationToolID = By.name("tool");
    private By continentsID = By.id("continents");
    private By multipleContinentID = By.id("continentsmultiple");


    public practiseFormHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToToolsSQAPracticeFormPage(){
        driver.navigate().to(homePageURL);
    }

    public void clickCookieButton(){driver.findElement(cookieButton).click();}

    public void clickPracticeInLink(){
        driver.findElement(partialLinkText).click();
    }

    public void clickLinkTest(){
        driver.findElement(linkTestID).click();
    }

    public void fillFirstNameBox(String firstName){
        driver.findElement(firstNameTextBox).sendKeys(firstName);
    }

    public void fillLastNameBox(String lastName){
        driver.findElement(lastNameTextBox).sendKeys(lastName);
    }

    public String getFirstNameFieldTest(){
        return driver.findElement(firstNameTextBox).getAttribute("value");
    }

    public void backBrower(){
        driver.navigate();
    }

    public String getCurrentURL(){
        return driver.getCurrentUrl();
    }

    public void closeDriver(){
        driver.close();
    }

    public void breakDriver() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void clickSubmitButton() {
        driver.findElement(submitButton).submit();
    }

    public void getSexElement(){
        List<WebElement> sexItems = driver.findElements(sexElements);
        for (org.openqa.selenium.WebElement sexItem : sexItems){
            driver.findElement(By.id(sexItem.getAttribute("id"))).click();
            driver.findElement(By.id(sexItem.getAttribute("id"))).isSelected();
        }
    }

    public void getExpElement(){
        List<WebElement> expItems = driver.findElements(yearOfExperience);
        for(org.openqa.selenium.WebElement expItem : expItems){
            driver.findElement(By.id(expItem.getAttribute("id"))).click();
            driver.findElement(By.id(expItem.getAttribute("id"))).isSelected();
        }
    }

    public void enterDate(){
        driver.findElement(dateEnterID).sendKeys("20-02-1997");
    }

    public void getProfessionClick(){
        List<WebElement> profItems = driver.findElements(professionID);
        for (org.openqa.selenium.WebElement profItem : profItems){
            System.out.println(driver.findElements(By.id(profItem.getAttribute("id"))));
//            driver.findElement(By.id(profItem.getAttribute("id"))).click();
//            driver.findElement(By.id(profItem.getAttribute("id"))).isSelected();
        }
    }

    public void getAutomationToolClickButton(){
        List<WebElement> toolItems = driver.findElements(automationToolID);
        for (org.openqa.selenium.WebElement toolItem : toolItems){
//            System.out.println(driver.findElements(By.id(toolItem.getAttribute("id"))));
            driver.findElement(By.id(toolItem.getAttribute("id"))).click();
            driver.findElement(By.id(toolItem.getAttribute("id"))).isSelected();
        }
    }

    public void getContinentsSelect (){
        /*Select continentValues = new Select(driver.findElement(continentsID));
        continentValues.selectByVisibleText("Europe");*/
        Select option = new Select(driver.findElement(continentsID));

        for (int i = 0; i < option.getOptions().size(); i++){
            option.selectByIndex(i);
            System.out.println(option.getFirstSelectedOption().getText());
        }
    }

    public void getMultipleContinentsSelect(){
        Select multiContinents = new Select(driver.findElement(multipleContinentID));

        for (int i = 0; i < multiContinents.getOptions().size(); i++){
            multiContinents.selectByIndex(i);
        }
    }


}


