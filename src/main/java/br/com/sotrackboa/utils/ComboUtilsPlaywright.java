//package br.com.sotrackboa.utils;
//
//import com.microsoft.playwright.Locator;
//import com.microsoft.playwright.Page;
//import static br.com.atomic.framework.playwright.PlaywrightElementHelper.elementExist;
//import br.com.atomic.framework.base.PageBase;
//import br.com.atomic.framework.exceptions.ElementFindException;
//import br.com.atomic.framework.exceptions.GenericException;
//import br.com.atomic.framework.helpers.LoggerHelper;
//
//public class ComboUtilsPlaywright
//{
//	static LoggerHelper logger = new LoggerHelper(ComboUtilsPlaywright.class);
//
//	@SuppressWarnings("rawtypes")
//	public static void selecionarComboTipoPedido(Page page, Locator cbxTipoPedido, String tipoPedido) throws GenericException, ElementFindException, InterruptedException
//	{
//		cbxTipoPedido.click();
//		page.waitForTimeout(1000);
//
//		if(tipoPedido.toLowerCase().contains("zvno") || tipoPedido.toLowerCase().contains("normal"))
//		{
//			page.locator("//lightning-base-combobox-item//span[contains(@title, 'ZVNO')]").dispatchEvent("click");
//			logger.info("Tipo pedido: ZVNO");
//		}
//		else if(tipoPedido.toLowerCase().contains("zbon") || tipoPedido.toLowerCase().contains("bonificação"))
//		{
//			page.locator("//lightning-base-combobox-item//span[contains(@title, 'ZBON')]").dispatchEvent("click");
//			logger.info("Tipo pedido: ZBON");
//		}
//		else if(tipoPedido.toLowerCase().contains("zcoi") || tipoPedido.toLowerCase().contains("ordem ind"))
//		{
//			page.locator("//lightning-base-combobox-item//span[contains(@title, 'ZCOI')]").dispatchEvent("click");
//			logger.info("Tipo pedido: ZCOI");
//		}
//		else if(tipoPedido.toLowerCase().contains("zvdf") || tipoPedido.toLowerCase().contains("dep fech"))
//		{
//			page.locator("//lightning-base-combobox-item//span[contains(@title, 'ZVDF')]").dispatchEvent("click");
//			logger.info("Tipo pedido: ZVDF");
//			
//		}
//		else if(tipoPedido.toLowerCase().contains("zdoa") || tipoPedido.toLowerCase().contains("rem doa"))
//		{
//			page.locator("//lightning-base-combobox-item//span[contains(@title, 'ZDOA')]").dispatchEvent("click");
//			logger.info("Tipo pedido: ZDOA");
//			
//		}
//		else
//			logger.error("Valor "+tipoPedido+" não mapeado. [Necessário manutenção]");
//	}
//
//	@SuppressWarnings("rawtypes")
//	public static void selecionarComboSetorAtividade(Page page, Locator cbxSetorAtividade, String setorAtividade) throws GenericException, ElementFindException, InterruptedException
//	{
//		cbxSetorAtividade.click();
//		page.waitForTimeout(1000);
//
//		if(setorAtividade.toLowerCase().contains("seco"))
//		{
//			page.locator("//lightning-base-combobox-item//span[contains(@title, 'Seco')]").dispatchEvent("click");
//			logger.info("Setor atividade: Seco");
//			
//		}
//		else if(setorAtividade.toLowerCase().contains("refrigerado"))
//		{
//			page.locator("//lightning-base-combobox-item//span[contains(@title, 'Refrige')]").dispatchEvent("click");
//			logger.info("Setor atividade: Refrigerado");
//			
//		
//		}
//
//		else
//			logger.error("Valor "+setorAtividade+" não mapeado");
//	}
//
//	@SuppressWarnings("rawtypes")
//	public static void selecionarComboTipoCarga(Page page, Locator cbxTipoCarga, String tipoCarga) throws GenericException, ElementFindException, InterruptedException
//	{
//		cbxTipoCarga.click();
//		page.waitForTimeout(1000);
//
//		if(tipoCarga.toLowerCase().contains("fechad"))
//		{
//			page.locator("//lightning-base-combobox-item//span[contains(@title, 'Fechad')]").dispatchEvent("click");
//			logger.info("Tipo de Carga: Fechada");
//			
//		
//		}
//		else if(tipoCarga.toLowerCase().contains("fracionad"))
//		{
//			page.locator("//lightning-base-combobox-item//span[contains(@title, 'Fracionad')]").dispatchEvent("click");
//			logger.info("Tipo de Carga: Fracionado");
//		
//		}
//		else
//			logger.error("Valor "+tipoCarga+" não mapeado");
//	}
//
//	@SuppressWarnings("rawtypes")
//	public static void selecionarComboTipoFrete(Page page, Locator cbxTipoFrete, String tipoFrete) throws GenericException, ElementFindException, InterruptedException
//	{
//		cbxTipoFrete.click();
//		page.waitForTimeout(1000);
//
//		if(tipoFrete.toLowerCase().contains("cif"))
//		{
//			page.locator("//lightning-base-combobox-item//span[contains(@title, 'CIF')]").dispatchEvent("click");
//			logger.info("Tipo de Frete: CIF");
//	
//		}
//		else if(tipoFrete.toLowerCase().contains("fob"))
//		{
//			
//			page.locator("//lightning-base-combobox-item//span[contains(@title, 'FOB')]").dispatchEvent("click");
//			logger.info("Tipo de Frete: FOB");
//			
//		}
//		else
//			logger.error("Valor "+tipoFrete+" não mapeado");
//	}
//
//	@SuppressWarnings("rawtypes")
//	public static void selecionarComboCondicaoPagamento(Page page, Locator cbxCondicaoPagamento, String condicaoPagamento) throws GenericException, ElementFindException, InterruptedException
//	{
//		cbxCondicaoPagamento.click();
//		page.waitForTimeout(1000);
//
//		if(condicaoPagamento.toLowerCase().contains("vista"))
//		{
//			page.locator("//lightning-base-combobox-item//span[contains(@title, 'A VISTA')]").dispatchEvent("click");
//			logger.info("Condição de Pagamento: A VISTA");
//		
//		}
//		else if(condicaoPagamento.toLowerCase().contains("Natal"))
//		{
//			
//			page.locator("//lightning-base-combobox-item//span[contains(@title, 'Natal')]").dispatchEvent("click");
//			logger.info("Condição de Pagamento: NATAL");
//
//		}
//		else if(condicaoPagamento.toLowerCase().contains("dias") || condicaoPagamento.toLowerCase().contains("parcelado") || condicaoPagamento.contains("AA"))
//		{
//			if(elementExist(page,page.locator("//lightning-base-combobox-item//span[contains(@title, 'DIAS')]"),1))
//			{
//				page.locator("//lightning-base-combobox-item//span[contains(@title, 'DIAS')]").dispatchEvent("click");
//				logger.info("Condição de Pagamento: DIAS");
//			}
//			else if(elementExist(page,page.locator("//lightning-base-combobox-item//span[contains(@title, 'AA')]"),1)) 
//			{
//				page.locator("//lightning-base-combobox-item//span[contains(@title, 'AA')]").dispatchEvent("click");
//				logger.info("Condição de Pagamento: AA");
//				
//			}
//			else
//			{
//				logger.info("Condição de Pagamento parcelado não contrada.");
//			}
//
//		}
//		else
//			logger.error("Valor "+condicaoPagamento+" não mapeado");
//	}
//
//	@SuppressWarnings("rawtypes")
//	public static void selecionarComboCondicaoExpedicao(Page page, Locator cbxCondicaoExpedicao, String condicaoExpedicao) throws GenericException, ElementFindException, InterruptedException
//	{
//		cbxCondicaoExpedicao.click();
//		page.waitForTimeout(1000);
//		
//		if(condicaoExpedicao.toLowerCase().contains("paletiz"))
//		{
//			page.locator("//lightning-base-combobox-item//span[contains(@title, 'Paletizada')]").dispatchEvent("click");
//			logger.info("Condição de Expedição: PALETIZADA");
//			
//		}
//		else if(condicaoExpedicao.toLowerCase().contains("batida"))
//		{
//			page.locator("//lightning-base-combobox-item//span[contains(@title, 'Batida')]").dispatchEvent("click");
//			logger.info("Condição de Expedição: BATIDA");
//			
//		}
//		else if(condicaoExpedicao.toLowerCase().contains("paletização") || condicaoExpedicao.toLowerCase().contains("paletização"))
//		{
//			page.locator("//lightning-base-combobox-item//span[contains(@title, 'Paletizacao em Terceiros')]").dispatchEvent("click");
//			logger.info("Condição de Expedição: PALETIZADA EM TERCEIROS");
//			
//		
//		}
//		else
//			logger.error("Valor "+condicaoExpedicao+" não mapeado");
//	}
//
//
//	@SuppressWarnings("rawtypes")
//	public static void selecionarComboCentro(Page page, Locator cbxCentro, String centro) throws GenericException, ElementFindException, InterruptedException
//	{
//		cbxCentro.click();
//		page.waitForTimeout(1000);
//
//		if(centro.toLowerCase().contains("5005") || centro.toLowerCase().contains("bela vista"))
//		{
//			page.locator("//lightning-base-combobox-item//span[contains(@title, '5005')]").dispatchEvent("click");
//			logger.info("Centro: 5005");
//					
//		}
//		else if(centro.toLowerCase().contains("5010") || centro.toLowerCase().contains("maravilha"))
//		{
//			page.locator("//lightning-base-combobox-item//span[contains(@title, '5010')]").dispatchEvent("click");
//			logger.info("Centro: 5010");
//
//		}
//		else if(centro.toLowerCase().contains("5011") || centro.toLowerCase().contains("irai de minas"))
//		{
//			page.locator("//lightning-base-combobox-item//span[contains(@title, '5011')]").dispatchEvent("click");
//			logger.info("Centro: 5011");
//			
//		}
//		else if(centro.toLowerCase().contains("5013") || centro.toLowerCase().contains("governador valadares"))
//		{
//			page.locator("//lightning-base-combobox-item//span[contains(@title, '5013')]").dispatchEvent("click");
//			logger.info("Centro: 5013");
//			
//		
//		}
//		else if(centro.toLowerCase().contains("5014") || centro.toLowerCase().contains("itapetininga"))
//		{
//			page.locator("//lightning-base-combobox-item//span[contains(@title, '5014')]").dispatchEvent("click");
//			logger.info("Centro: 5014");
//		}
//		else if(centro.toLowerCase().contains("5023") || centro.toLowerCase().contains("doutor mauricio cardoso"))
//		{
//			page.locator("//lightning-base-combobox-item//span[contains(@title, '5023')]").dispatchEvent("click");
//			logger.info("Centro: 5023");
//			
//		}
//		else if(centro.toLowerCase().contains("5027") || centro.toLowerCase().contains("sulina"))
//		{
//			page.locator("//lightning-base-combobox-item//span[contains(@title, '5027')]").dispatchEvent("click");
//			logger.info("Centro: 5027");
//			
//		}
//		else if(centro.toLowerCase().contains("5031") || centro.toLowerCase().contains("ponta grossa"))
//		{
//			page.locator("//lightning-base-combobox-item//span[contains(@title, '5031')]").dispatchEvent("click");
//			logger.info("Centro: 5013");
//			
//
//		}
//		else if(centro.toLowerCase().contains("5033") || centro.toLowerCase().contains("três rios") || centro.toLowerCase().contains("tres rios"))
//		{
//			page.locator("//lightning-base-combobox-item//span[contains(@title, '5033')]").dispatchEvent("click");
//			logger.info("Centro: 5033");
//		
//		}
//		else if(centro.toLowerCase().contains("5034") || centro.toLowerCase().contains("araraquara"))
//		{
//			page.locator("//lightning-base-combobox-item//span[contains(@title, '5034')]").dispatchEvent("click");
//			logger.info("Centro: 5034");
//			
//		
//		}
//		else if(centro.toLowerCase().contains("5035") || centro.toLowerCase().contains("carazinho"))
//		{
//			page.locator("//lightning-base-combobox-item//span[contains(@title, '5035')]").dispatchEvent("click");
//			logger.info("Centro: 5035");
//		}
//		else if(centro.toLowerCase().contains("5037") || centro.toLowerCase().contains("riolog"))
//		{
//			page.locator("//lightning-base-combobox-item//span[contains(@title, '5037')]").dispatchEvent("click");
//			logger.info("Centro: 5037");
//
//		}
//		else if(centro.toLowerCase().contains("5039") || centro.toLowerCase().contains("vilhena"))
//		{
//			page.locator("//lightning-base-combobox-item//span[contains(@title, '5039')]").dispatchEvent("click");
//			logger.info("Centro: 5039");
//		
//		}
//		else if(centro.toLowerCase().contains("5040") || centro.toLowerCase().contains("colatina"))
//		{
//			page.locator("//lightning-base-combobox-item//span[contains(@title, '5040')]").dispatchEvent("click");
//			logger.info("Centro: 5040");
//			
//	
//		}
//		else
//			logger.error("Valor "+centro+" não mapeado");
//	}
//
//	@SuppressWarnings("rawtypes")
//	public static void selecionarComboCentroTransferencia(Page page, Locator cbxCentroTransf, String centroTransf) throws GenericException, ElementFindException, InterruptedException
//	{
//		cbxCentroTransf.click();
//		page.waitForTimeout(1000);
//
//		if(centroTransf.toLowerCase().contains("5005") || centroTransf.toLowerCase().contains("bela vista"))
//		{
//			page.locator("(//lightning-base-combobox-item//span[contains(@title, '5005')])[2]").dispatchEvent("click");
//			logger.info("Centro transf: 5005");
//		}
//		else if(centroTransf.toLowerCase().contains("5010") || centroTransf.toLowerCase().contains("maravilha"))
//		{
//			page.locator("(//lightning-base-combobox-item//span[contains(@title, '5010')])[2]").dispatchEvent("click");
//			logger.info("Centro transf: 5010");
//			
//		}
//
//		else if(centroTransf.toLowerCase().contains("5013") || centroTransf.toLowerCase().contains("governador valadares"))
//		{
//			page.locator("(//lightning-base-combobox-item//span[contains(@title, '5013')])[2]").dispatchEvent("click");
//			logger.info("Centro transf: 5013");
//
//		}
//
//		else if(centroTransf.toLowerCase().contains("5031") || centroTransf.toLowerCase().contains("ponta grossa"))
//		{
//			page.locator("(//lightning-base-combobox-item//span[contains(@title, '5031')])[2]").dispatchEvent("click");
//			logger.info("Centro transf: 5031");
//			
//		}
//		else if(centroTransf.toLowerCase().contains("5035") || centroTransf.toLowerCase().contains("carazinho"))
//		{
//			page.locator("(//lightning-base-combobox-item//span[contains(@title, '5035')])[2]").dispatchEvent("click");
//			logger.info("Centro transf: 5035");
//		}
//		else if(centroTransf.toLowerCase().contains("5033") || centroTransf.toLowerCase().contains("três rios"))
//		{
//			page.locator("(//lightning-base-combobox-item//span[contains(@title, '5033')])[2]").dispatchEvent("click");
//			logger.info("Centro transf: 5033");
//
//		}
//		else
//			logger.error("Valor "+centroTransf+" não mapeado");
//	}
//}
