import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/')

WebUI.click(findTestObject('Object Repository/TC_01/div_Elements'))

WebUI.click(findTestObject('TC_01/div_Elements'))

WebUI.doubleClick(findTestObject('Object Repository/TC_01/input_Full Name_userName'))

WebUI.setText(findTestObject('Object Repository/TC_01/input_Full Name_userName'), 'test Name')

WebUI.setText(findTestObject('Object Repository/TC_01/input_Email_userEmail'), 'test@dispostable.com')

WebUI.setText(findTestObject('Object Repository/TC_01/textarea_Current Address_currentAddress'), 'this is current address')

WebUI.setText(findTestObject('Object Repository/TC_01/textarea_Permanent Address_permanentAddress'), 'this is permanent address')

WebUI.click(findTestObject('Object Repository/TC_01/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/TC_01/p_Nametest Name'), 'Name:test Name')

WebUI.verifyElementText(findTestObject('Object Repository/TC_01/p_Emailtestdispostable.com'), 'Email:test@dispostable.com')

WebUI.verifyElementText(findTestObject('Object Repository/TC_01/p_Current Address this is current address'), 'Current Address :this is current address')

WebUI.verifyElementText(findTestObject('Object Repository/TC_01/p_Permananet Address this is permanent address'), 'Permananet Address :this is permanent address')

WebUI.closeBrowser()

