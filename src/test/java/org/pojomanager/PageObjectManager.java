package org.pojomanager;

import org.pojo.CreateNewAccount;
import org.pojo.FacebookPojo; 
import org.pojo.ForgottenPassPojo;

public class PageObjectManager {

	private PageObjectManager() {
	}

	private static PageObjectManager pageObjectManager;
	private CreateNewAccount createNewAccount;
	private FacebookPojo facebookPojo;
	private ForgottenPassPojo forgottenPassPojo;

	public static PageObjectManager getPageObjectManager() {
		return (pageObjectManager == null) ? pageObjectManager = new PageObjectManager() : pageObjectManager;
	}

	public CreateNewAccount getCreateNewAccount() {
		return (createNewAccount == null) ? createNewAccount = new CreateNewAccount() : createNewAccount;
	}

	public FacebookPojo getFacebookPojo() {
		return (facebookPojo == null) ? facebookPojo = new FacebookPojo() : facebookPojo;
	}

	public ForgottenPassPojo getForgottenPassPojo() {
		return (forgottenPassPojo == null) ? forgottenPassPojo = new ForgottenPassPojo() : forgottenPassPojo;
	}
}
