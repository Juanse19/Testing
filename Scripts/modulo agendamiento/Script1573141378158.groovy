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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://gihsedev.interedes.com.co:9090/login?redirectUrl=%2Fformularios')

WebUI.setText(findTestObject('Object Repository/Page_GIHSE/input_userRequired'), 'coordinador.operaciones@interedes.com.co')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_GIHSE/input_passwordText'), 'sfwb3U1ET0+PxXpdTgPmGw==')

WebUI.click(findTestObject('Object Repository/Page_GIHSE/i_fas fa-sign-in-alt fa-2x'))

WebUI.click(findTestObject('Object Repository/Page_GIHSE/strong_Agendamiento Visitas'))

WebUI.click(findTestObject('Object Repository/Page_GIHSE/strong_Operativa'))

WebUI.closeBrowser()

