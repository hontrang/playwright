package com.hth;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.hth.page.HomePage;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class BaseTest {
    private Playwright playwright;
    private Browser browser;
    private BrowserContext context;
    private Page page;

    protected HomePage homePage;

    @BeforeClass
    void launchBrowser() {
        playwright = Playwright.create();
        LaunchOptions launchOptions = new BrowserType.LaunchOptions()
                .setHeadless(false)
                .setSlowMo(50);
        browser = playwright.chromium().launch(launchOptions);
    }

    @AfterClass
    void closeBrowser() {
        playwright.close();
    }

    @BeforeMethod
    void createContextAndPage() {
        context = browser.newContext();
        page = context.newPage();
        page.navigate("https://tiki.vn");
        homePage = new HomePage(page);
    }

    @AfterMethod
    void closeContext() {
        context.close();
    }
}
