package pages.home;



public class HomePage {
	private HomeController step;
	private HomeVerifyController check;
	
	public HomeController step()
	{
		return step;
	}
	public HomeVerifyController check()
	{
		return check;
	}
	private HomePage()
	{
		
	}
	private HomePage(HomeController step, HomeVerifyController check)
	{
		this.step=step;
		this.check=check;
	}
	public static HomePage getHomePage()
	{
		return new HomePage(new HomeController() , new HomeVerifyController());
	}
	
	
	

	
	
}
