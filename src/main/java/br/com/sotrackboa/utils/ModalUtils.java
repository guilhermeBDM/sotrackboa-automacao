//package br.com.sotrackboa.utils;
//
//import static br.com.atomic.framework.playwright.PlaywrightElementHelper.elementExist;
//import static br.com.atomic.framework.helpers.base.QueryHelper.getElementByXPath;
//
//import com.microsoft.playwright.Page;
//
//import br.com.atomic.framework.base.PageBase;
//import br.com.atomic.framework.helpers.LoggerHelper;
//
//public class ModalUtils 
//{
//	static LoggerHelper logger = new LoggerHelper(ModalUtils.class);
//	
//	public static void waitModalProcessandoSalesForce(PageBase page) throws InterruptedException
//	{
//		boolean flagModalDesapareceu = false;
//		int i = 0;
//		
//		while(!flagModalDesapareceu && i < 10)
//		{
//			if(page.elementExists(getElementByXPath("//div[@class='loadingCon global siteforceLoadingBalls']"), 1))
//			{
//				Thread.sleep(500);
//				logger.debug("Aguardando modal de loading - Processando, aguarde...");
//			}
//			else
//			{
//				flagModalDesapareceu = true;
//				logger.debug("Modal desapareceu - Processando, aguarde...");
//			}
//			
//			i++;
//		}
//	}
//	
//	public static void waitModalProcessandoSalesForce(Page page) throws InterruptedException
//	{
//		boolean flagModalDesapareceu = false;
//		int i = 0;
//		
//		while(!flagModalDesapareceu && i < 10)
//		{
//			if(elementExist(page, page.locator("//div[@class='loadingCon global siteforceLoadingBalls']"), 1))
//			{
//				page.waitForTimeout(500);
//				logger.debug("Aguardando modal de loading - Processando, aguarde...");
//			}
//			else
//			{
//				flagModalDesapareceu = true;
//				logger.debug("Modal desapareceu - Processando, aguarde...");
//			}
//			
//			i++;
//		}
//	}
//	
//	public static void waitModalProcessandoAguarde(PageBase page) throws InterruptedException
//	{
//		boolean flagModalDesapareceu = false;
//		int i = 0;
//		
//		while(!flagModalDesapareceu && i < 80)
//		{
//			if(page.elementExists(getElementByXPath("//*[contains(text(), 'Processando, aguarde')]"), 2))
//			{
//				Thread.sleep(500);
//				logger.debug("Aguardando modal de loading - Processando, aguarde...");
//			}
//			else
//			{
//				flagModalDesapareceu = true;
//				logger.debug("Modal desapareceu - Processando, aguarde...");
//			}
//			
//			i++;
//		}
//	}
//	
//	public static void waitModalProcessandoAguarde(Page page) throws InterruptedException
//	{
//		boolean flagModalDesapareceu = false;
//		int i = 0;
//		
//		while(!flagModalDesapareceu && i < 80)
//		{
//			if(elementExist(page, page.locator("//*[contains(text(), 'Processando, aguarde')]"), 2))
//			{
//				page.waitForTimeout(500);
//				logger.debug("Aguardando modal de loading - Processando, aguarde...");
//			}
//			else
//			{
//				flagModalDesapareceu = true;
//				logger.debug("Modal desapareceu - Processando, aguarde...");
//			}
//			
//			i++;
//		}
//	}
//}
