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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

// Dynamic Path
String projectDir = RunConfiguration.getProjectDir()
String apkPath = projectDir + '/App/sauce-labs.2.7.1.apk'

Mobile.startApplication(apkPath, false)

Mobile.delay(5)

Mobile.setText(findTestObject('Object Repository/Mobile_Login/input_Username'), 'standard_user', 10)

Mobile.setText(findTestObject('Object Repository/Mobile_Login/input_Password'), 'secret_sauce', 10)

Mobile.tap(findTestObject('Object Repository/Mobile_Login/btn_Login'), 10)

Mobile.delay(5)

Mobile.verifyElementVisible(findTestObject('Object Repository/Mobile_Login/text_Products'), 10)

Mobile.tap(findTestObject('Object Repository/Mobile_AddToCart/btn_Add_Backpack'), 10)

Mobile.tap(findTestObject('Object Repository/Mobile_AddToCart/btn_Add_BikeLight'), 10)

Mobile.tap(findTestObject('Object Repository/Mobile_AddToCart/btn_Cart'), 10)

Mobile.verifyElementVisible(findTestObject('Object Repository/Mobile_AddToCart/text_YourCart'), 10)

Mobile.scrollToText('CHECKOUT', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Mobile_Checkout/btn_Checkout'), 10)

Mobile.tap(findTestObject('Object Repository/Mobile_Checkout/input_FirstName'), 10)

Mobile.setText(findTestObject('Object Repository/Mobile_Checkout/input_FirstName'), 'Ali', 10)

Mobile.tap(findTestObject('Object Repository/Mobile_Checkout/input_LastName'), 10)

Mobile.setText(findTestObject('Object Repository/Mobile_Checkout/input_LastName'), 'Yahya', 10)

Mobile.tap(findTestObject('Object Repository/Mobile_Checkout/input_ZipCode'), 10)

Mobile.setText(findTestObject('Object Repository/Mobile_Checkout/input_ZipCode'), '53111', 10)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Mobile_Checkout/btn_Continue'), 10)

Mobile.scrollToText('FINISH', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Mobile_Checkout/btn_Finish'), 10)

Mobile.verifyElementVisible(findTestObject('Object Repository/Mobile_Checkout/text_OrderComplete'), 15)

Mobile.closeApplication()
