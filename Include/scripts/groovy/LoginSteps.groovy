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


public class LoginSteps {

	@Given ("user navigate to login page")
	def NavigateToLoginPage() {
		println "dalam fungsi navigate to login page"
	}

	//@When ("user enter (.*) and (.*)")
	def EnterCredentials(String uname, String pw) {
		println "dalam proses enter username and password"
		println "username: " +uname
		println "password: " +pw
	}

	@And ("user click login button")
	def ClickLoginButton() {
		println "dalam fungsi click login button"
	}

	@Then ("user navigate to homepage")
	def NavigateToHomepage() {
		println "dalam fungsi navigate to homepage"
	}
}
