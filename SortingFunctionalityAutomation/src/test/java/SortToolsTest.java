import com.microsoft.playwright.*;
import com.microsoft.playwright.options.LoadState;
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
                new BrowserType.LaunchOptions().setHeadless(true)
        );
        BrowserContext context = browser.newContext(new Browser.NewContextOptions()
                .setUserAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36")
        );

        Page page = context.newPage();
        page.navigate("https://practicesoftwaretesting.com/");
        page.waitForLoadState(LoadState.LOAD);

        //ascending order.
        page.waitForLoadState(LoadState.NETWORKIDLE);
        page.waitForTimeout(4000);
        Locator sortTools = page.locator("select[aria-label='sort']");
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
