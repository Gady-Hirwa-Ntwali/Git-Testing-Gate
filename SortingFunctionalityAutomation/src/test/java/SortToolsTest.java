import com.microsoft.playwright.*;
import com.microsoft.playwright.options.SelectOption;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class SortToolsTest {

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

        //ascending order
        Locator sortTools = page.locator("[data-test='sort']");
        sortTools.selectOption(new SelectOption().setValue("name,asc"));
        sortTools.click();

        page.waitForSelector(".card-body h5");
        Locator cardTitle = page.locator(".card-body h5");
        System.out.println("The total cards are: " + cardTitle.count());
        page.waitForTimeout(4000);

        List<String> toolNames = cardTitle.allInnerTexts();
        System.out.println("All tools: " + toolNames);
        List<String> sortedAsc = new ArrayList<>(toolNames);
        Collections.sort(sortedAsc);
        assertEquals(sortedAsc, toolNames);
        page.waitForTimeout(4000);

        // descending order
        sortTools.selectOption(new SelectOption().setValue("name,desc"));
        System.out.println("The total desc: " + cardTitle.count());
        page.waitForTimeout(4000);

        List<String> toolDesc = cardTitle.allInnerTexts();
        System.out.println("All tools: " + toolDesc);
        List<String> sortedDesc = new ArrayList<>(toolDesc);
        sortedDesc.sort(Collections.reverseOrder());
        assertEquals(sortedDesc, toolDesc);

        page.waitForTimeout(4000);


    }
}
