package com.hth.page;

import com.microsoft.playwright.Page;

public class BasePage {
    protected Page page;

    protected BasePage(Page page) {
        this.page = page;
    }

    protected void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
