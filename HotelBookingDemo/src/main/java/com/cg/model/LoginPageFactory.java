package com.cg.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPageFactory {
	
	@FindBy(name = "userName")
	@CacheLookup
	WebElement userNameTxt;
	
	@FindBy(name = "userPwd")
	@CacheLookup
	WebElement pwdTxt;
	
	@FindBy(className = "btn")
	@CacheLookup
	WebElement loginBtn;
	
	@FindBy(className = "userErrMsg")
	@CacheLookup
	WebElement userErrMsg;
	
	@FindBy(className = "pwdErrMsg")
	@CacheLookup
	WebElement pwdErrMsg;
	
	public void setUserName(String name) {
		userNameTxt.sendKeys(name);
	}
	public void setPassword(String pwd) {
		pwdTxt.sendKeys(pwd);
	}
	public void clickLoginButton() {
		loginBtn.click();
	}
	public String getUserNameError() {
		String error = userErrMsg.getText();
		return error;
	}
	public String getPasswordError() {
		String error = pwdErrMsg.getText();
		return error;
	}
	

}
