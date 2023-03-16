package dynamicXPath;

public class XPath {
	
	//  Tag with Single attribute  //
	
	//a[@class='bottom-left-links ']
	//input[@id='gh-search-input']
	//input[@id='cvs-search-input-homepage']
	//a[@id='sc-cvs-header-basket']
	//a[@class='menu-item-link']
	
	
	
	// Tag with Multiple attribute with 'and' logic //
	
	//input[@id='gh-search-input' and @class='search-input']
	//button[@id='Health-menu' and @class='menu-button']
	//button[@id='changeStore' and @class='sc-cvs-header-change-store']
	//input[@id='ntt-placeholder' and @class='blue-shadow']
	//a[@id='join-button' and @class='header-button']
	
	
	
	// Tag with Inner Text
	
	//h3[text()='Search Using Your Member ID Card']
	//h3[text()='Search By Location']
	//strong[text()='BOGO 50% off']
	//strong[text()='Free 1-hour Delivery']
	//span[text()='Refill prescriptions']
	
	
	
	// Tag with Partial Text //
	
	//h3[contains(text(), 'Search Using Yo')]
    //h3[contains(text(), 'Search By')]
	//strong[contains(text(), 'BOG')]
	//strong[contains(text(), 'Free 1-hour Deli')]
	//span[contains(text(), 'Refill pres')]
	
	
	
}
