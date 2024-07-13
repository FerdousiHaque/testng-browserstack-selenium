package com.browserstack;

import com.browserstack.objects.PageObjects;
import com.browserstack.utils.CSVReaderUtil;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Map;

public class BStackDemoTest extends SeleniumTest {

    @Parameters("environment")
    @Test
    public void addProductToCart(String environment) throws Exception {
        Map<String, String> urlMap = CSVReaderUtil.readCSV();
        String url = urlMap.get(environment);

        // navigate to the URL
        driver.get(url);

        Assert.assertTrue(driver.getTitle().matches("StackDemo"));

        String productOnScreenText = driver.findElement(PageObjects.productTitle).getText();
        driver.findElement(PageObjects.addToCartButton).click();

        Assert.assertTrue(driver.findElement(PageObjects.cartContent).isDisplayed());



    }
}
