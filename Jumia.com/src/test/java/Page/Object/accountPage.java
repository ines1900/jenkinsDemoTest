package Page.Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driver.Driver;

public class accountPage extends Driver{

	WebDriver driver;
	//homepage
    private By btn_close= By.xpath("//*[@id=\"pop\"]/div/section/button");
    private By btn_seconnecter1=By.xpath("//label[contains(@class,'trig -df -i-ctr -fs16')]");
    private By btn_seconnecter2= By.xpath("//a[contains(@class,'btn _prim -fw _md')]");
    //email
    private By txt_email=By.xpath("//input[contains(@class,'mdc-text-field__input email-input')]");
	private By btn_continuer1=By.xpath("//span[contains(@class,'mdc-button__touch')]");
	//motpasse
	private By txt_password=By.xpath("//input[contains(@name,'password')]");
	private By txt_confpassword=By.xpath("//input[contains(@class,'mdc-text-field__input confirm-password-input')]");
	private By btn_continuer2=By.xpath("//button[contains(@class,'mdc-button mdc-button--touch mdc-button--raised to-personal-details mdc-ripple-upgraded')]");
	//personneldata
	private By txt_prenom=By.xpath("//input[contains(@id,'input_first_name')]");
	private By txt_nom=By.xpath("//input[contains(@id,'input_middle_name')]");
	private By txt_nomdefamille=By.xpath("//input[contains(@id,'input_last_name')]");
	private By txt_telephone=By.xpath("//input[contains(@class,'mdc-text-field__input phone-input')]");
	private By btn_continuer3=By.xpath("//button[contains(@class,'mdc-button mdc-button--touch mdc-button--raised to-personal-details-part-2 mdc-ripple-upgraded')]");
	private By btn_genre=By.xpath("//div[contains(@class,'select-field mdc-select mdc-select--outlined prefix-component mdc-select--required')]");
	private By btn_femme=By.xpath("//li[contains(@class,'mdc-deprecated-list-item ') and contains(@data-value,'F')]");
	private By btn_calendrier=By.xpath("//*[@id=\"card_profile_gender\"]/div/div[2]/label");
	private By btn_continuer4=By.xpath("//button[contains(@class,'mdc-button mdc-button--touch mdc-button--raised to-verification-code create-account-button mdc-ripple-upgraded')]");
	private By btn_pin1=By.xpath("//*[@id=\"pin\"]/label[1]");
	//private By btn_pin1=By.xpath("//input[contains(@id,'pin')and contains(@aria-label,'digit 1')]");
	//private By btn_pin2=By.xpath("//label[contains(@class,'mdc-text-field mdc-text-field--outlined mdc-text-field--no-label pin-code-component')]");
	//private By btn_pin3=By.xpath("//label[contains(@class,'mdc-text-field mdc-text-field--outlined mdc-text-field--no-label pin-code-component')]");
	//private By btn_pin4=By.xpath("//label[contains(@class,'')]");
	//private By btn_pin5=By.xpath("//label[contains(@class,'')]");
	//private By btn_pin6=By.xpath("//label[contains(@class,'')]");
	private By btn_continuer5=By.xpath("//button[contains(@id,'skip-pin')]");
	private By btn_seconnecter3=By.xpath("//label[contains(@class,'trig -df -i-ctr -fs16')]");
	
	public accountPage(WebDriver driver) {
		this.driver=driver;
	}
	public void popup_close() {
	 driver.findElement(btn_close).click();
	}
	public void Click_seconnecter1() {
		 driver.findElement(btn_seconnecter1).click();
		}
	public void Click_seconnecter2() {
		 driver.findElement(btn_seconnecter2).click();
		}
	public void enterEmail(String email) {
		
	     driver.findElement(txt_email).sendKeys(email);
		}
	public void Clickcontinuer1() {
		
	     driver.findElement(btn_continuer1).click();
	}
	public void enterPassword(String password) {
			
		 driver.findElement(txt_password).sendKeys(password);
		}
	public void confirmPassword(String password) {
		
		 driver.findElement(txt_confpassword).sendKeys(password);
		}
	public void Clickcontinuer2() {
		
	     driver.findElement(btn_continuer2).click();
        }
	public void enterPrenom(String prenom) {
		
		 driver.findElement(txt_prenom).sendKeys(prenom);
		}
	public void enterNom(String nom) {
		
		 driver.findElement(txt_nom).sendKeys(nom);
		}
	public void enterNDeFamille(String ndefamille) {
		
		 driver.findElement(txt_nomdefamille).sendKeys(ndefamille);
		}
	public void enterTelephone(String telephone) {
		
		 driver.findElement(txt_telephone).sendKeys(telephone);
		}
	public void Clickcontinuer3() {
		
	     driver.findElement(btn_continuer3).click();
       }
	public void selectGenre() {
	     driver.findElement(btn_genre).click();
	     driver.findElement(btn_femme).click();
      }
	public void dateDeNaissance(String datenaissance)  {
		driver.findElement(btn_calendrier).click();
		driver.findElement(btn_calendrier).sendKeys(datenaissance);
		driver.findElement(btn_continuer4).click();
	}
	public void codepin(String c1)  {
		driver.findElement(btn_pin1).click();
		driver.findElement(btn_pin1).sendKeys(c1);
		driver.findElement(btn_pin1).sendKeys(c1);
		driver.findElement(btn_pin1).sendKeys(c1);
		/*driver.findElement(btn_pin2).click();
		driver.findElement(btn_pin2).sendKeys(c2);
		driver.findElement(btn_pin3).click();
		driver.findElement(btn_pin3).sendKeys(c3);
		driver.findElement(btn_pin4).click();
		driver.findElement(btn_pin4).sendKeys(c4);
		driver.findElement(btn_pin5).click();
		driver.findElement(btn_pin5).sendKeys(c5);
		driver.findElement(btn_pin6).click();
		driver.findElement(btn_pin6).sendKeys(c6);*/
		driver.findElement(btn_continuer5).click();
	}
	public void checkuserconnected()  {
	 driver.findElement(btn_seconnecter3).isDisplayed();

}
}

