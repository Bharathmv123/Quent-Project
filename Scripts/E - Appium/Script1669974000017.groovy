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

Mobile.startApplication('C:\\Users\\Linus\\Downloads\\Quent_V2022.22 V1.1.51_101120220834_staging.apk', true)

Mobile.tap(findTestObject('Object Repository/EN/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/EN/android.widget.CheckBox - User Trial'), 0)

Mobile.tap(findTestObject('Object Repository/EN/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/EN/android.widget.Button - Next'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/EN/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/EN/android.widget.TextView - 91'), 0)

Mobile.sendKeys(findTestObject('Object Repository/EN/android.widget.EditText - Phone number'), '8050694262')

Mobile.sendKeys(findTestObject('Object Repository/EN/android.widget.EditText - Password'), 'Test@123')

Mobile.tap(findTestObject('Object Repository/EN/android.widget.Button - Sign In'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/EN/android.widget.TextView - User Category'), 0)

Mobile.tap(findTestObject('Object Repository/EN/android.widget.TextView - Trail Batch 1'), 0)

Mobile.tap(findTestObject('Object Repository/EN/android.widget.EditText - First name'), 0)

Mobile.sendKeys(findTestObject('Object Repository/EN/android.widget.EditText - First name (1)'), 'Kish')

Mobile.sendKeys(findTestObject('Object Repository/EN/android.widget.EditText - Last name'), 'an')

Mobile.swipe(0, 10, 0, 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/EN/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/EN/android.widget.FrameLayout'), 0)

Mobile.swipe(0, 20, 0, 20)

Mobile.scrollToText('Hip Size')

Mobile.sendKeys(findTestObject('Object Repository/EN/android.widget.EditText - Age'), '28')

Mobile.tap(findTestObject('Object Repository/EN/android.widget.EditText - Hip Size'), 0)

Mobile.sendKeys(findTestObject('Object Repository/EN/android.widget.EditText - Weight'), '76')

Mobile.sendKeys(findTestObject('Object Repository/EN/android.widget.EditText - Height'), '164')

Mobile.sendKeys(findTestObject('Object Repository/EN/android.widget.EditText - Hip Size (1)'), '35')

Mobile.closeApplication()

