package tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Test6Dropdown extends chromedriver {

    @Test
    public void Test6Dropdown() {
        String url = "http://localhost:7080/dropdown";
        String optionOne = "1";
        String optionTwo = "2";
        driver.get(url);

        //making use of the Selenium's Select library that provides support for select elements
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select dropDownSelect = new Select(dropDown);
        //select option 1 and check that it is currently selected
        dropDownSelect.selectByValue(optionOne);
        WebElement selected = dropDownSelect.getFirstSelectedOption();
        Assert.assertEquals(selected.getAttribute("value"),optionOne);
        //select option 2 and check that it is currently selected
        dropDownSelect.selectByValue(optionTwo);
        selected = dropDownSelect.getFirstSelectedOption();
        Assert.assertEquals(selected.getAttribute("value"),optionTwo);
    }

}