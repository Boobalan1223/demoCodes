package PracticeSession;

public class XpathAxes {
	//1.find the sign up byutton from the registration form present in the facebook app
//	//div[@class='_8fgl _9l2p']/child::form/child::div[position()=1]/child::div[position()=11]/child::button
	
	
	//2.Locate first name field from sign up button
	
	//(//button[@type='submit'])[2]/parent::div/preceding-sibling::div[10]/child::div[1]/child::div[1]
//  (//button[@type='submit'])[2]/parent::div/parent::div/child::*[1]/child::*[1]/child::*[1]
//	or
	//   (//button[@type='submit'])[2]/parent::div/parent::div/child::div[1]/div[1]/div[1]        ## this is best practice
	
	
	
	//3.Identify teh password from mobile number field in facebook
	
//    //input[@aria-label='Mobile number or email address']/parent::div/parent::div/parent::div/following-sibling::*[2]
	
	//4.Locate the mobile number from new password field in facebook
	
	
	//  (//input[@type='password'])[2]/parent::div/parent::div/parent::div/preceding-sibling::*[2]
	
//  5. Locate surrname from famale radio button in facebook
	
	//  //input[@id='u_7_4_Sq']/parent::span/parent::span/parent::div/preceding-sibling::*[6]/child::div[1]/div[2]/child::div/child::div[1]/child::input
//or
	//   //input[@id='u_7_4_Sq']/ancestor::*[4]/child::div[1]/div/div/following-sibling::*/child::div/div/input
	
	//6. identify the  search text box from google search button present in the google search home page
	
	//  (//input[@class='gNO89b'])[2]/ancestor::*[7]/child::*[3]/child::form/div/div[1]/div[1]/div/div[2]/child::input
	//or
	//   (//input[@class='gNO89b'])[2]/parent::*/parent::*/parent::*/div[1]/child::*/child::div[2]/input 
	//7. Identify the today's deals llink from the amazom=n search text box present in the amazon home page
	
	//  //input[@id='twotabsearchtextbox']/ancestor::*[6]/following-sibling::*[4]/child::div[2]/child::div/div/a[5]
	
	
	
	////div[@id='nav-xshop-container']/child::div/a[3]
}
