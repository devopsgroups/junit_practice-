package browserInferface;

public interface BrowserAction {

	public boolean OpenBrowser();
	public boolean gotoWebpage(String message);
    public boolean Home();
	public void webpageLoadWait(int time);
	public boolean clicklink(String link);
	public boolean downloadFile(String url);
	public boolean addNewTab();
	public boolean verifyPageTitle(String title);
	public boolean addUser();




}
