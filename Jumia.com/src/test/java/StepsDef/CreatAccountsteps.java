package StepsDef;

import Page.Object.accountPage;
import driver.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CreatAccountsteps extends Driver{
	
	accountPage creatAccount ;
	
	@Given("browser is open")
	public void browser_is_open() throws InterruptedException {
	intialization();
	creatAccount = new accountPage(driver);
	creatAccount.popup_close();
	
	}

	@When("user is on login page")
	public void user_is_on_login_page() {
		creatAccount = new accountPage(driver);
		creatAccount.Click_seconnecter1();
	    creatAccount.Click_seconnecter2();
	}

	@And("^user enter his email(.*)$")
	public void user_enter_his_email(String email) {
		creatAccount.enterEmail(email);
		creatAccount.Clickcontinuer1();
		
	}

	@And("^user enters his password(.*)$")
	public void user_enters_his_password(String password) {
		creatAccount.enterPassword(password);
	}

	@And("^user confirms his password(.*)$")
	public void user_confirms_his_password(String password) throws InterruptedException {
		creatAccount.confirmPassword(password);
		Thread.sleep(2000);
		creatAccount.Clickcontinuer2();
	}

	@And("^user enters his prenom(.*)$")
	public void user_enters_his_prenom(String prenom) {
		creatAccount.enterPrenom(prenom);
	}

	@And("^user enters his nom(.*)$")
	public void user_enters_his_nom(String nom) {
		creatAccount.enterNom(nom);
	}
	@And("^user enters his ndefamille(.*)$")
	public void user_enters_his_ndefamille(String nomdefamille) {
		creatAccount.enterNDeFamille(nomdefamille);
	}
	@And("^user enters his telephone(.*)$")
	public void user_enters_his_telephone(String telephone)throws InterruptedException {
	   creatAccount.enterTelephone(telephone);
	   Thread.sleep(2000);
	   creatAccount.Clickcontinuer3();
	  
	}
	@And("user selects genre")
	public void user_selects_genre() {
		creatAccount.selectGenre();
	}
	@And("^user enters date de naissance(.*)$")
	public void user_enters_date_de_naissance(String datenaissance) throws InterruptedException {
		creatAccount.dateDeNaissance(datenaissance);
	}

	@And("^user enters codepin(.*)$")
	public void user_enterss_codepin(String c1) {
		creatAccount.codepin(c1);
	}

	@Then("user account is created")
	public void user_account_is_created() {
		creatAccount.checkuserconnected();
	}


}
