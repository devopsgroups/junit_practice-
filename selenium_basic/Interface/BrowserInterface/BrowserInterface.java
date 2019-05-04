package BrowserInterface;

import browserInferface.BrowserAction;

public class BrowserInterface  implements BrowserAction{
	
	public boolean OpenBrowser() {
		return false;
	}
	public boolean gotoWebpage(String message) {
		return false;
	}
    public boolean Home() {
    	
    	return false;
    }
	public void webpageLoadWait(int time) {
		
		
	}
	public boolean clicklink(String link) {
		return false;
	}
	public boolean downloadFile(String url) {
		return false;
	}
	public boolean addNewTab() {
		return false;
	}
	public boolean verifyPageTitle(String title) {
		return false;
	}
	public boolean addUser() {
		return false;
	}


}
