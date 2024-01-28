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

// Open the browser and navigate to the Amazon website
WebUI.openBrowser('')

// Navigate to the Amazon website
WebUI.navigateToUrl('https://www.amazon.com/')

// Capture the footer element (replace with your actual object path)
WebUI.click(findTestObject('Object Repository/validating the footer links/Page_Amazon.com. Spend less. Smile more/span_Ship OrdersInternationally'))

// Validate that you are on the "Help Customer Service" page
// Add validation steps specific to that page
WebUI.delay(5 // Add a delay of 5 seconds (adjust as needed)
    )

WebUI.navigateToUrl('https://www.amazon.com/gp/browse.html?node=230659011&ref_=footer_amazonglobal')

WebUI.verifyElementVisible(findTestObject('validating the footer links/Page_Amazon International shopping and shipping made easy/b_Amazon International Shopping'))

WebUI.navigateToUrl('https://www.amazon.com/')

// Navigate back to the Amazon homepage
WebUI.closeBrowser()

