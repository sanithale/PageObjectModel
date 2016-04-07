package com.morningstar.test;

import com.morningstar.pages.BookedIteneraryPage;
import com.morningstar.pages.LoginPage;
import com.morningstar.pages.SearchHotelsPage;
import com.morningstar.utility.GetExcelData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Hashtable;

public class SampleTest3 {

    @Test(dataProvider = "Loginpagedata")
    public void LoginApp(Hashtable<String, String> e) throws IOException {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        WebDriver driver = new FirefoxDriver();
        LoginPage lp = new LoginPage(driver);
        lp.setpassword(e.get("password"));
        lp.setusername(e.get("username"));
        lp.clickloginbtn();
        SearchHotelsPage sHP = new SearchHotelsPage(driver);
        BookedIteneraryPage bIP = new BookedIteneraryPage(driver);
        sHP.BookedItinerarylink().click();
        bIP.desiredItenerarycheckbox().click();
        bIP.cancelItenerarybtn().click();
        driver.quit();
    }

    @DataProvider(name = "Loginpagedata")
    public Object[][] getLoginPageData() throws IOException {
        GetExcelData ex = new GetExcelData();
        Object[][] arrayobject;
        ex.open();
        arrayobject = ex.getData();
        ex.close();
        return arrayobject;

    }


}
