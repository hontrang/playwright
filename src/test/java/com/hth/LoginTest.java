package com.hth;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(priority = 1)
    void shouldLoginSuccess() {
        homePage.search("macbook 2024");
        homePage.login("0559975065", "Abc@12345678");
    }
}
