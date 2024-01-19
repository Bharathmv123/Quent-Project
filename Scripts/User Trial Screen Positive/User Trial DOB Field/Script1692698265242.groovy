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

//Mobile.startApplication(GlobalVariable.url, true)

Mobile.startApplication(GlobalVariable.url, true)

Mobile.tap(findTestObject('Object Repository/User Trial DOB Field/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial DOB Field/android.widget.CheckBox - User Trial (1)'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/User Trial DOB Field/android.widget.CheckBox (1)'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial DOB Field/android.widget.Button - Next (1)'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial DOB Field/android.widget.ImageButton (2)'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial DOB Field/android.widget.TextView - 91'), 0)

Mobile.sendKeys(findTestObject('Object Repository/User Trial DOB Field/android.widget.EditText - Phone number (1)'), '8217603935')

Mobile.sendKeys(findTestObject('Object Repository/User Trial DOB Field/android.widget.EditText - Password (1)'), 'Test@123')

Mobile.tap(findTestObject('Object Repository/User Trial DOB Field/android.widget.ImageButton (3)'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial DOB Field/android.widget.Button - Sign In (1)'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/User Trial DOB Field/android.widget.ImageButton (4)'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial DOB Field/android.widget.TextView - 2006'), 0)

Mobile.scrollToText('1997')

Mobile.tap(findTestObject('Object Repository/User Trial DOB Field/android.widget.TextView - 1997 (1)'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial DOB Field/android.view.View - 16'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial DOB Field/android.widget.Button - OK (1)'), 0)

Mobile.delay(5)

Mobile.closeApplication()