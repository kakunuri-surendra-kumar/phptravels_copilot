package hotels_stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.en.*;
import phptravels_hotelspages.PhpTravels_SearchHotels_lib;

public class StepDefinition1 {

    WebDriver wd;
    PhpTravels_SearchHotels_lib searchHotels = new PhpTravels_SearchHotels_lib();

    public void init(WebDriver wd) {
        this.wd = wd;
    }

    @Given("the user is on the PHP Travels hotels page")
    public void user_is_on_the_php_travels_hotels_page() {
        wd = new FirefoxDriver();
        searchHotels = new PhpTravels_SearchHotels_lib();
        searchHotels.init(wd);
        searchHotels.Launch_PHP_Travels();
        searchHotels.second_link();
    }

    @When("the user enters {string} as the location")
    public void user_enters_location(String location) {
        searchHotels.Search_By_City();
        // Add logic to select the location based on the input parameter
    }

    @When("selects Check-In Date {string}")
    public void selects_check_in_date(String checkInDate) {
        searchHotels.Checkin_calender();
        // Add logic to select the check-in date based on the input parameter
    }

    @When("selects Check-Out Date {string}")
    public void selects_check_out_date(String checkOutDate) {
        searchHotels.Checkout_calender();
        // Add logic to select the check-out date based on the input parameter
    }

    @When("selects Number of Rooms {string}")
    public void selects_number_of_rooms(String noOfRooms) {
        // Add logic to select the number of rooms based on the input parameter
    }

    @When("selects Number of Adults {string}")
    public void selects_number_of_adults(String noOfAdults) {
        // Add logic to select the number of adults based on the input parameter
    }

    @When("selects Number of Children {string}")
    public void selects_number_of_children(String noOfChildren) {
        // Add logic to select the number of children based on the input parameter
    }

    @When("selects Child Age {string}")
    public void selects_child_age(String childAge) {
        // Add logic to select the child age based on the input parameter
    }

    @When("clicks on Nationality")
    public void clicks_on_nationality() {
        // Add logic to click on nationality dropdown
    }

    @When("selects Nationality {string}")
    public void selects_nationality(String nationality) {
        // Add logic to select the nationality based on the input parameter
    }

    @When("clicks the search button")
    public void clicks_the_search_button() {
        searchHotels.Search();
    }

    @Then("the user should see {string} in the search box")
    public void user_should_see_in_the_search_box(String expectedResult) {
        // Add logic to verify the expected result in the search box
    }
}
