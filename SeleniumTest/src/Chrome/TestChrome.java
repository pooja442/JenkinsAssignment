
package Chrome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChrome {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello");
initializeWebdriver();
navigateToGoogleSearchPage();
searchText();
	}
	
	public static void initializeWebdriver() {
	// Set the path for chromeDriver
	System.setProperty(" webdriver.chrome.driver",
	"C:\\Users\\poojasharma03\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();
	}
	public static void navigateToGoogleSearchPage() {
		driver.get("http://www.amazon.com");
		}
	public static void searchText() {
		driver.findElement(By.xpath("//input[@class=\"nav-input nav-progressive-attribute\"]")).sendKeys("TShirt");
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		driver.findElement(By.xpath("//body[@class=\"a-m-us a-aui_72554-c a-aui_a11y_1_699934-c a-aui_a11y_4_835613-c a-aui_a11y_6_837773-c a-aui_a11y_sr_678508-c a-aui_amzn_img_861115-c a-aui_amzn_img_gate_861116-c a-aui_killswitch_csa_logger_372963-c a-aui_pci_risk_banner_210084-c a-aui_preload_261698-c a-aui_rel_noreferrer_noopener_309527-c a-aui_template_weblab_cache_333406-c a-aui_tnr_v2_180836-c a-meter-animate\"]")).click(); 
		
		
		}


}

