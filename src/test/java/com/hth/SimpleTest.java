package com.hth;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

/**
 * Unit test for simple App.
 */
public class SimpleTest {

    @Test
    public void shouldAnswerWithTrue() {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch();
            Page page = browser.newPage();
            page.navigate("http://playwright.dev");
            System.out.println(page.title());
        }
        assertTrue(true);
    }
}
