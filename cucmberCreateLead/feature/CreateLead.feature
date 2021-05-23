Feature: Create Lead TestCase 

Background: 

Given Enter the url 'http://leaftaps.com/opentaps/'
And Type Username 'Demosalesmanager'
And Type Password 'crmsfa'
And Click On Login Button
And Click on CRMSFA link
And Click on Leads

@smoke
Scenario Outline: 

And Click on Create Leads
And Enter Company Name <compName> 
And Enter First Name <fName>
And Enter Last Name <lName>
When Click On Create Lead button
Then verify the lead is created

Examples:
|compName|fName|lName|
|Testleaf|Saheel|Khan|

