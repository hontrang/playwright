package com.hth;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test(priority = 1)
    void shouldLoginSuccess() {
        page.navigate("https://tiki.vn");
        page.locator("picture.webpimg-container img[alt='close-icon']").click();
        page.locator("img[alt='header_header_account_img']").click();
        page.locator("input[name='tel']").fill("0559975065");
        page.locator("//button[text()='Tiếp Tục']").click();
        page.locator("input[placeholder='Mật khẩu']").fill("Abc@12345678");
        page.locator("//button[text()='Đăng Nhập']").click();
        sleep(5000);
    }
}
