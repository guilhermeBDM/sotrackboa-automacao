//package br.com.sotrackboa.components;
//
//import static br.com.atomic.framework.proton.ProtonHelper.endProtonScript;
//import static br.com.atomic.framework.proton.ProtonHelper.getProtonParameter;
//import static br.com.atomic.framework.proton.ProtonHelper.isProtonExecution;
//import static br.com.atomic.framework.proton.ProtonHelper.startProtonScript;
//
//import br.com.atomic.framework.controllers.PlaywrightController;
//import br.com.sotrackboa.pages.Administracao_MultiCTE;
//import br.com.sotrackboa.pages.GerenciarEmpresas_MultiCTE;
//
//public class Acessar_MultiCTE {
//	
//	Administracao_MultiCTE administracao_MultiCTE_Playwright = new Administracao_MultiCTE(PlaywrightController.getPage());
//	GerenciarEmpresas_MultiCTE gerenciarEmpresas_MultiCTE_Playwright = new GerenciarEmpresas_MultiCTE(PlaywrightController.getPage());
//
//	public void runComponent() throws Exception
//	{
//		startProtonScript();
//		
//		String razaoSocial = "";
//		String cnpj = "02488357000196";
//		
//		if(isProtonExecution())
//		{
//			razaoSocial = getProtonParameter("in_razaoSocial");
//			cnpj = getProtonParameter("in_cnpj");
//			
//		}
//		administracao_MultiCTE_Playwright.acessarGerenciadorDeEmpresas();
//		gerenciarEmpresas_MultiCTE_Playwright.acessarMultiCTEEmpresa(razaoSocial, cnpj);
//		
//		endProtonScript();
//		
//	}
//}
