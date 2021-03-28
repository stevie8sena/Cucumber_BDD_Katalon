import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.nio.file.attribute.UserDefinedFileAttributeView

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable


public class LoginSteps2 {

	@Given ("user navigate to login page2")
	def NavigateToLoginPage() {
		
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl("https://opensource-demo.orangehrmlive.com/")
		
		def actualResult = WebUI.getUrl()
		def expectedResult = 'https://opensource-demo.orangehrmlive.com/'
		WebUI.verifyMatch(actualResult, expectedResult, false)
		
	}

	@When ("user enter nama and pwa")
	def EnterCredentials() {
		WebUI.setText(findTestObject('OrangeHRM/Login/txt_username'), 'Admin')
		
		WebUI.setEncryptedText(findTestObject('OrangeHRM/Login/txt_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')
		
	}

	@And ("user click login button2")
	def ClickLoginButton() {
		WebUI.click(findTestObject('OrangeHRM/Login/btn_login'))
	}

	@Then ("user navigate to homepage2")
	def NavigateToHomepage() {
		def actualResult = WebUI.getUrl()
		def expectedResult = 'https://opensource-demo.orangehrmlive.com/index.php/dashboard'
		WebUI.verifyMatch(actualResult, expectedResult, false)
	}
}
