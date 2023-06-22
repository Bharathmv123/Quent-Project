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

Mobile.startApplication('C:\\Users\\Linus\\Downloads\\app-development-universal-release_v1.4.apk', true)

Mobile.tap(findTestObject('Object Repository/Club mahindra/android.widget.RelativeLayout'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/Club mahindra/android.widget.TextView - Other login options'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Club mahindra/android.widget.EditText - Member ID  Email  Phone number'), 
    '1805618')

Mobile.sendKeys(findTestObject('Object Repository/Club mahindra/android.widget.EditText - Password'), 'Web@12345')

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/Club mahindra/android.widget.TextView - Login'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Club mahindra/android.widget.TextView - Member ID  1805618'), 0)

Mobile.delay(5)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/Club mahindra/android.view.ViewGroup'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Club mahindra/android.widget.TextView - Edit details'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Club mahindra/android.view.ViewGroup (1)'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Club mahindra/android.widget.TextView - Male'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Club mahindra/android.view.ViewGroup (2)'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Club mahindra/android.widget.TextView - Single'), 0)

Mobile.delay(1)

Mobile.closeApplication()

