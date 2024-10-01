package phptravels_hotelspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PhpTravels_SearchHotels_lib {

    WebDriver wd;
    By Hotels = By.linkText("Hotels");
    By Search_for_best_hotels = By.xpath("//strong[text()='Search for best hotels']");
    By Search_By_City = By.id("select2-hotels_city-container");
    By search_city = By.xpath("(//*[contains(text(),'Dubai')])[6]");
    By Checkin_calender = By.id("checkin");
    By Checkin_Date = By.xpath("(//td[text()='7'])[1]");
    By Checkout_Calender = By.id("checkout");
    By Checkout_Date = By.xpath("(//td[contains(text(),'15')])[2]");
    By Travellers = By.xpath("//a[@class='dropdown-toggle dropdown-btn travellers d-flex align-items-center waves-effect']");
    By Search = By.xpath("//button[contains(@class, 'search_button')]");

    public void init(WebDriver wd) {
        this.wd = wd;
    }

    public void Launch_PHP_Travels() {
        wd.get("https://www.phptravels.net/");
        wd.manage().window().maximize();
    }

    public void second_link() {
        wd.findElement(Hotels).click();
    }

    public void Search_for_best_hotels() {
        wd.findElement(Search_for_best_hotels).click();
    }

    public void Search_By_City() {
        wd.findElement(Search_By_City).click();
    }

    public void searchCity() {
        wd.findElement(search_city).click();
    }

    public void Checkin_calender() {
        wd.findElement(Checkin_calender).click();
    }

    public void Checkin_Date() {
        wd.findElement(Checkin_Date).click();
    }

    public void Checkout_calender() {
        wd.findElement(Checkout_Calender).click();
    }

    public void Checkout_Date() {
        wd.findElement(Checkout_Date).click();
    }

    public void Travellers() {
        wd.findElement(Travellers).click();
    }

    public void Search() {
        wd.findElement(Search).click();
    }
}
