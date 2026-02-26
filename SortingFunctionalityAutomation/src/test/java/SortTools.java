import com.microsoft.playwright.*;
import com.microsoft.playwright.options.SelectOption;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Paths;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class SortTools {

    @Test
    public void SortFunctionality(){
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions().setHeadless(false)
        );
        BrowserContext context = browser.newContext(
                new Browser.NewContextOptions()
                        .setHttpCredentials("admin", "admin")
        );
        Page page = context.newPage();
        page.navigate("https://practicesoftwaretesting.com/");

        Locator sortTools = page.locator("[data-test='sort']");
        sortTools.selectOption(new SelectOption().setValue("name,asc"));
        sortTools.click();

        page.waitForSelector(".card-body h5");
        Locator cardTitle = page.locator(".card-body h5");

        System.out.println("The total cards are: " + cardTitle.count());
        cardTitle.nth(0).isVisible();
        page.waitForTimeout(4000);
        String firstTool = cardTitle.nth(0).innerText();
        System.out.println("The first one: " + firstTool);
        char firstCharAsc = firstTool.charAt(0);
        assertEquals("A", firstCharAsc);
        page.waitForTimeout(4000);
        sortTools.selectOption(new SelectOption().setValue("name,desc"));
        System.out.println("The total cards are: " + cardTitle.count());
        cardTitle.nth(0).isVisible();

        page.waitForTimeout(4000);
        System.out.println("The first one: " + cardTitle.nth(0).innerText());
        page.waitForTimeout(4000);


    }
}
