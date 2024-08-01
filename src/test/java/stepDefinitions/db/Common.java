package stepDefinitions.db;


import io.cucumber.java.en.Then;

public class Common {
    @Then("User prints something")
    public void user_prints_something() {
        System.out.println("Buradayim.");
    }

}
