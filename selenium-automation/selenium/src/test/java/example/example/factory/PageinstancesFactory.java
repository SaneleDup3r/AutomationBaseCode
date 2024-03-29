package example.example.factory;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;

import example.example.context.WebDriverContext;
import example.example.pages.BasePage;

public class PageinstancesFactory {
	public static <T extends BasePage> T getInstance(Class<T> type) {
		try {
			return type.getConstructor(WebDriver.class).newInstance(WebDriverContext.getDriver());
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
			return null;
		}
	}
}
