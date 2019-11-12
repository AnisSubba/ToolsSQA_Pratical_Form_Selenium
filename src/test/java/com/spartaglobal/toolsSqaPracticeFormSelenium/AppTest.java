package com.spartaglobal.toolsSqaPracticeFormSelenium;

import static org.junit.Assert.assertTrue;

import com.spartaglobal.toolsSqaPracticeFormSelenium.PractiseForm.pages.practiseFormHomePage;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue(){
//        System.setProperty("webdriver.chrome.driver", "B:\\download\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anis Subba\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();
        practiseFormHomePage practiseFormHomePage = new practiseFormHomePage(chromeDriver);
        practiseFormHomePage.goToToolsSQAPracticeFormPage();
        practiseFormHomePage.clickCookieButton();

//        practiseFormHomePage.clickPracticeInLink();
//        practiseFormHomePage.clickLinkTest();
//        System.out.println(practiseFormHomePage.getCurrentURL());
//        practiseFormHomePage.fillFirstNameBox("Anis");
//         System.out.println(practiseFormHomePage.getFirstNameFieldTest());
//        practiseFormHomePage.fillLastNameBox();
//        practiseFormHomePage.breakDriver();
//        practiseFormHomePage.clickSubmitButton();
//        practiseFormHomePage.closeDriver();
//        practiseFormHomePage.getSexElement();
//        practiseFormHomePage.getExpElement();
//        practiseFormHomePage.enterDate();
//        practiseFormHomePage.getProfessionClick();
//        practiseFormHomePage.getAutomationToolClickButton();
//        practiseFormHomePage.getContinentsSelect();
        practiseFormHomePage.getMultipleContinentsSelect();
    }


}
