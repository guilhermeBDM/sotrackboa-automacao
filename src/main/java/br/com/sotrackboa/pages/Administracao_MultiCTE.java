//package br.com.sotrackboa.pages;
//
//import static br.com.atomic.framework.playwright.PlaywrightElementHelper.elementExist;
//import static br.com.atomic.framework.playwright.PlaywrightElementHelper.waitUntilVisible;
//
//import com.microsoft.playwright.Locator;
//import com.microsoft.playwright.Page;
//
//import br.com.atomic.framework.helpers.LoggerHelper;
//import br.com.sotrackboa.utils.ModalUtils;
//
//public class Administracao_MultiCTE {
//
//	private Page page;
//	private Locator btnGerenciarEmpresas,
//			lblTituloPagina;
//			
//	LoggerHelper logger = new LoggerHelper(Administracao_MultiCTE.class);
//	
//	public Administracao_MultiCTE(Page page) {
//		this.page = page;
//		this.btnGerenciarEmpresas = page.locator("//ul[@id='navigation']//a[text()='Gerenciar Empresas']");
//		this.lblTituloPagina = page.locator("//div/h3");
//	}
//	
//	public void acessarGerenciadorDeEmpresas() throws Exception
//	{
//		waitUntilVisible(page, btnGerenciarEmpresas);
//		btnGerenciarEmpresas.click();
//		logger.info("MULTICTE - Acesso ao gerenciador de empresas");
//	}
//
//	public void validarPagina() throws Exception {
//
//		ModalUtils.waitModalProcessandoAguarde(page);
//		if (elementExist(page,lblTituloPagina) && lblTituloPagina.textContent().toLowerCase().equals("empresas emissoras")) {
//			logger.takeScreenShot("MULTICTE - Pagina de Janela de gerenciador de empresas", page);
//			logger.info("MULTICTE - Pagina de Janela de gerenciador de empresas");
//		} else {
//			throw new Exception("MULTICTE - Pagina de Janela de gerenciador de empresas com inconsistências");
//		}
//	}
//}
