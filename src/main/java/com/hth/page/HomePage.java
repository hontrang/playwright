package com.hth.page;

import com.microsoft.playwright.Page;

public class HomePage extends BasePage {

    public HomePage(Page page) {
        super(page);
    }

    public void login(String phone, String password) {
        page.locator("picture.webpimg-container img[alt='close-icon']").click();
        page.locator("img[alt='header_header_account_img']").click();
        page.locator("input[name='tel']").fill(phone);
        page.locator("//button[text()='Tiếp Tục']").click();
        page.locator("input[placeholder='Mật khẩu']").fill(password);
        page.locator("//button[text()='Đăng Nhập']").click();
        sleep(5000);
    }

    public void search(String text) {
        page.locator("input[data-view-id='main_search_form_input']").fill(text);
        page.keyboard().press("Enter");
      }
}
