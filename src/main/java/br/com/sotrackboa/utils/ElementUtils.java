//package br.com.sotrackboa.utils;
//
//import java.util.ArrayList;
//
//import org.openqa.selenium.JavascriptExecutor;
//
//import br.com.atomic.framework.base.PageBase;
//import br.com.atomic.framework.base.VirtualElement;
//import br.com.atomic.framework.helpers.LoggerHelper;
//
//public class ElementUtils 
//{
//	static LoggerHelper logger = new LoggerHelper(ElementUtils.class);
//	
//	@SuppressWarnings({ "static-access", "rawtypes" })
//	public static String returnElementValueJS(PageBase page, VirtualElement element)
//	{
//		try
//		{
//			JavascriptExecutor executor = (JavascriptExecutor) page.getController().getDriver_();
//			String testJS = (String) executor.executeScript("return arguments[0].value", element.get());
//			return testJS;
//		}
//		catch(Exception e)
//		{
//			logger.error("Não foi possível acessar valor do elemento via JS.");
//			return "";
//		}
//	}
//	
//	public static void openNewTab(PageBase page)
//	{
//		try
//		{
//			((JavascriptExecutor)page.getController().getDriver_()).executeScript("window.open()");
//		}
//		catch(Exception e)
//		{
//			logger.error("Falha ao tentar criar nova aba");
//		}
//	}
//	
//	@SuppressWarnings("static-access")
//	public static void switchTabs(PageBase page, int indexPage) throws Exception
//	{
//		try
//		{
//			ArrayList<String> tabs = new ArrayList<String>(page.getController().getDriver_().getWindowHandles());
//			page.getController().getDriver_().switchTo().window(tabs.get(indexPage));
//			Thread.sleep(100);
//		}
//		catch(Exception e)
//		{
//			logger.error("Falha ao realizar a troca de aba");
//			throw new Exception("Não foi possível acessar nova aba");
//		}
//	}
//}
