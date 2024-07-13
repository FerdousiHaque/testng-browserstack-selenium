package com.browserstack.objects;

import org.openqa.selenium.By;

public class PageObjects {
    public static By productTitle = By.className("shelf-item__title");
    public static By addToCartButton = By.xpath("(//div[text()='Add to cart'])[1]");
    public static By cartContent = By.cssSelector(".float\\-cart__content");

}
