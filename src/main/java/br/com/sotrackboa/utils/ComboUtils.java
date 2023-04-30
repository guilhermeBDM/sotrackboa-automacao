//package br.com.sotrackboa.utils;
//
//import static br.com.atomic.framework.helpers.base.QueryHelper.getElementByXPath;
//
//import br.com.atomic.framework.base.PageBase;
//import br.com.atomic.framework.base.VirtualElement;
//import br.com.atomic.framework.exceptions.ElementFindException;
//import br.com.atomic.framework.exceptions.GenericException;
//import br.com.atomic.framework.helpers.LoggerHelper;
//
//public class ComboUtils
//{
//	static LoggerHelper logger = new LoggerHelper(ComboUtils.class);
//
//	@SuppressWarnings("rawtypes")
//	public static void selecionarComboTipoPedido(PageBase page, VirtualElement cbxTipoPedido, String tipoPedido) throws GenericException, ElementFindException, InterruptedException
//	{
//		cbxTipoPedido.click();
//		Thread.sleep(100);
//
//		if(tipoPedido.toLowerCase().contains("zvno") || tipoPedido.toLowerCase().contains("normal"))
//		{
//			page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'ZVNO')]"));
//			logger.info("Tipo pedido: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'ZVNO')]").getAttribute("title"));
//		}
//		else if(tipoPedido.toLowerCase().contains("zbon") || tipoPedido.toLowerCase().contains("bonificação"))
//		{
//			page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'ZBON')]"));
//			logger.info("Tipo pedido: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'ZBON')]").getAttribute("title"));
//		}
//		else if(tipoPedido.toLowerCase().contains("zcoi") || tipoPedido.toLowerCase().contains("ordem ind"))
//		{
//			page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'ZCOI')]"));
//			logger.info("Tipo pedido: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'ZCOI')]").getAttribute("title"));
//		}
//		else if(tipoPedido.toLowerCase().contains("zvdf") || tipoPedido.toLowerCase().contains("dep fech"))
//		{
//			page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'ZVDF')]"));
//			logger.info("Tipo pedido: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'ZVDF')]").getAttribute("title"));
//		}
//		else if(tipoPedido.toLowerCase().contains("zdoa") || tipoPedido.toLowerCase().contains("rem doa"))
//		{
//			page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'ZDOA')]"));
//			logger.info("Tipo pedido: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'ZDOA')]").getAttribute("title"));
//		}
//		else
//			logger.error("Valor "+tipoPedido+" não mapeado. [Necessário manutenção]");
//	}
//
//	@SuppressWarnings("rawtypes")
//	public static void selecionarComboSetorAtividade(PageBase page, VirtualElement cbxSetorAtividade, String setorAtividade) throws GenericException, ElementFindException, InterruptedException
//	{
//		cbxSetorAtividade.click();
//		Thread.sleep(100);
//
//		if(setorAtividade.toLowerCase().contains("seco"))
//		{
//			page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'Seco')]"));
//			logger.info("Setor Atividade: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'Seco')]").getAttribute("title"));
//		}
//		else if(setorAtividade.toLowerCase().contains("refrigerado"))
//		{
//			page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'Refrige')]"));
//			logger.info("Setor Atividade: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'Refrige')]").getAttribute("title"));
//		}
//
//		else
//			logger.error("Valor "+setorAtividade+" não mapeado");
//	}
//
//	@SuppressWarnings("rawtypes")
//	public static void selecionarComboTipoCarga(PageBase page, VirtualElement cbxTipoCarga, String tipoCarga) throws GenericException, ElementFindException, InterruptedException
//	{
//		cbxTipoCarga.click();
//		Thread.sleep(100);
//
//		if(tipoCarga.toLowerCase().contains("fechad"))
//		{
//			page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'Fechad')]"));
//			logger.info("Tipo de Carga: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'Fechad')]").getAttribute("title"));
//		}
//		else if(tipoCarga.toLowerCase().contains("fracionad"))
//		{
//			page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'Fracionad')]"));
//			logger.info("Tipo de Carga: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'Fracionad')]").getAttribute("title"));
//		}
//		else
//			logger.error("Valor "+tipoCarga+" não mapeado");
//	}
//
//	@SuppressWarnings("rawtypes")
//	public static void selecionarComboTipoFrete(PageBase page, VirtualElement cbxTipoFrete, String tipoFrete) throws GenericException, ElementFindException, InterruptedException
//	{
//		cbxTipoFrete.click();
//		Thread.sleep(100);
//
//		if(tipoFrete.toLowerCase().contains("cif"))
//		{
//			page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'CIF')]"));
//			logger.info("Tipo de Frete: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'CIF')]").getAttribute("title"));
//		}
//		else if(tipoFrete.toLowerCase().contains("fob"))
//		{
//			page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'FOB')]"));
//			logger.info("Tipo de Frete: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'FOB')]").getAttribute("title"));
//		}
//		else
//			logger.error("Valor "+tipoFrete+" não mapeado");
//	}
//
//	@SuppressWarnings("rawtypes")
//	public static void selecionarComboCondicaoPagamento(PageBase page, VirtualElement cbxCondicaoPagamento, String condicaoPagamento) throws GenericException, ElementFindException, InterruptedException
//	{
//		cbxCondicaoPagamento.click();
//		Thread.sleep(100);
//
//		if(condicaoPagamento.toLowerCase().contains("vista"))
//		{
//			page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'A VISTA')]"));
//			logger.info("Condição de Pagamento: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'A VISTA')]").getAttribute("title"));
//		}
//		else if(condicaoPagamento.toLowerCase().contains("Natal"))
//		{
//			page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'Natal')]"));
//			logger.info("Condição de Pagamento: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'Natal')]").getAttribute("title"));
//		}
//		else if(condicaoPagamento.toLowerCase().contains("dias") || condicaoPagamento.toLowerCase().contains("parcelado") || condicaoPagamento.contains("AA"))
//		{
//			if(page.elementExists(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'DIAS')]"), 2))
//			{
//				page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'DIAS')]"));
//				logger.info("Condição de Pagamento: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'DIAS')]").getAttribute("title"));
//			}
//			else if(page.elementExists(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'AA')]"), 2))
//			{
//				page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'AA')]"));
//				logger.info("Condição de Pagamento: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'AA')]").getAttribute("title"));
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
//	public static void selecionarComboCondicaoExpedicao(PageBase page, VirtualElement cbxCondicaoExpedicao, String condicaoExpedicao) throws GenericException, ElementFindException, InterruptedException
//	{
//		cbxCondicaoExpedicao.click();
//		Thread.sleep(100);
//
//		if(condicaoExpedicao.toLowerCase().contains("paletiz"))
//		{
//			page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'Paletizada')]"));
//			logger.info("Condição de Expedição: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'Paletizada')]").getAttribute("title"));
//		}
//		else if(condicaoExpedicao.toLowerCase().contains("batida"))
//		{
//			page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'Batida')]"));
//			logger.info("Condição de Expedição: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'Batida')]").getAttribute("title"));
//		}
//		else if(condicaoExpedicao.toLowerCase().contains("paletização") || condicaoExpedicao.toLowerCase().contains("paletização"))
//		{
//			page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'Paletizacao em Terceiros')]"));
//			logger.info("Condição de Expedição: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, 'Paletizacao em Terceiros')]").getAttribute("title"));
//		}
//		else
//			logger.error("Valor "+condicaoExpedicao+" não mapeado");
//	}
//
//
//	@SuppressWarnings("rawtypes")
//	public static void selecionarComboCentro(PageBase page, VirtualElement cbxCentro, String centro) throws GenericException, ElementFindException, InterruptedException
//	{
//		cbxCentro.click();
//		Thread.sleep(100);
//
//		if(centro.toLowerCase().contains("5005") || centro.toLowerCase().contains("bela vista"))
//		{
//			page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, '5005')]"));
//			logger.info("Centro: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, '5005')]").getAttribute("title"));
//		}
//		else if(centro.toLowerCase().contains("5010") || centro.toLowerCase().contains("maravilha"))
//		{
//			page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, '5010')]"));
//			logger.info("Centro: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, '5010')]").getAttribute("title"));
//		}
//		else if(centro.toLowerCase().contains("5011") || centro.toLowerCase().contains("irai de minas"))
//		{
//			page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, '5011')]"));
//			logger.info("Centro: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, '5011')]").getAttribute("title"));
//		}
//		else if(centro.toLowerCase().contains("5013") || centro.toLowerCase().contains("governador valadares"))
//		{
//			page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, '5013')]"));
//			logger.info("Centro: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, '5013')]").getAttribute("title"));
//		}
//		else if(centro.toLowerCase().contains("5014") || centro.toLowerCase().contains("itapetininga"))
//		{
//			page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, '5014')]"));
//			logger.info("Centro: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, '5014')]").getAttribute("title"));
//		}
//		else if(centro.toLowerCase().contains("5023") || centro.toLowerCase().contains("doutor mauricio cardoso"))
//		{
//			page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, '5023')]"));
//			logger.info("Centro: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, '5023')]").getAttribute("title"));
//		}
//		else if(centro.toLowerCase().contains("5027") || centro.toLowerCase().contains("sulina"))
//		{
//			page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, '5027')]"));
//			logger.info("Centro: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, '5027')]").getAttribute("title"));
//		}
//		else if(centro.toLowerCase().contains("5031") || centro.toLowerCase().contains("ponta grossa"))
//		{
//			page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, '5031')]"));
//			logger.info("Centro: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, '5031')]").getAttribute("title"));
//		}
//		else if(centro.toLowerCase().contains("5033") || centro.toLowerCase().contains("três rios") || centro.toLowerCase().contains("tres rios"))
//		{
//			page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, '5033')]"));
//			logger.info("Centro: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, '5033')]").getAttribute("title"));
//		}
//		else if(centro.toLowerCase().contains("5034") || centro.toLowerCase().contains("araraquara"))
//		{
//			page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, '5034')]"));
//			logger.info("Centro: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, '5034')]").getAttribute("title"));
//		}
//		else if(centro.toLowerCase().contains("5035") || centro.toLowerCase().contains("carazinho"))
//		{
//			page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, '5035')]"));
//			logger.info("Centro: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, '5035')]").getAttribute("title"));
//		}
//		else if(centro.toLowerCase().contains("5037") || centro.toLowerCase().contains("riolog"))
//		{
//			page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, '5037')]"));
//			logger.info("Centro: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, '5037')]").getAttribute("title"));
//		}
//		else if(centro.toLowerCase().contains("5039") || centro.toLowerCase().contains("vilhena"))
//		{
//			page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, '5039')]"));
//			logger.info("Centro: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, '5039')]").getAttribute("title"));
//		}
//		else if(centro.toLowerCase().contains("5040") || centro.toLowerCase().contains("colatina"))
//		{
//			page.clickJavaScript(getElementByXPath("//lightning-base-combobox-item//span[contains(@title, '5040')]"));
//			logger.info("Centro: "+getElementByXPath("//lightning-base-combobox-item//span[contains(@title, '5040')]").getAttribute("title"));
//		}
//		else
//			logger.error("Valor "+centro+" não mapeado");
//	}
//
//	@SuppressWarnings("rawtypes")
//	public static void selecionarComboCentroTransferencia(PageBase page, VirtualElement cbxCentroTransf, String centroTransf) throws GenericException, ElementFindException, InterruptedException
//	{
//		cbxCentroTransf.click();
//		Thread.sleep(100);
//
//		if(centroTransf.toLowerCase().contains("5005") || centroTransf.toLowerCase().contains("bela vista"))
//		{
//			page.clickJavaScript(getElementByXPath("(//lightning-base-combobox-item//span[contains(@title, '5005')])[2]"));
//			logger.info("Centro: "+getElementByXPath("(//lightning-base-combobox-item//span[contains(@title, '5005')])[2]").getAttribute("title"));
//		}
//		else if(centroTransf.toLowerCase().contains("5010") || centroTransf.toLowerCase().contains("maravilha"))
//		{
//			page.clickJavaScript(getElementByXPath("(//lightning-base-combobox-item//span[contains(@title, '5010')])[2]"));
//			logger.info("Centro: "+getElementByXPath("(//lightning-base-combobox-item//span[contains(@title, '5010')])[2]").getAttribute("title"));
//		}
//
//		else if(centroTransf.toLowerCase().contains("5013") || centroTransf.toLowerCase().contains("governador valadares"))
//		{
//			page.clickJavaScript(getElementByXPath("(//lightning-base-combobox-item//span[contains(@title, '5013')])[2]"));
//			logger.info("Centro: "+getElementByXPath("(//lightning-base-combobox-item//span[contains(@title, '5013')])[2]").getAttribute("title"));
//		}
//
//		else if(centroTransf.toLowerCase().contains("5031") || centroTransf.toLowerCase().contains("ponta grossa"))
//		{
//			page.clickJavaScript(getElementByXPath("(//lightning-base-combobox-item//span[contains(@title, '5031')])[2]"));
//			logger.info("Centro: "+getElementByXPath("(//lightning-base-combobox-item//span[contains(@title, '5031')])[2]").getAttribute("title"));
//		}
//		else if(centroTransf.toLowerCase().contains("5035") || centroTransf.toLowerCase().contains("carazinho"))
//		{
//			page.clickJavaScript(getElementByXPath("(//lightning-base-combobox-item//span[contains(@title, '5035')])[2]"));
//			logger.info("Centro: "+getElementByXPath("(//lightning-base-combobox-item//span[contains(@title, '5035')])[2]").getAttribute("title"));
//		}
//		else if(centroTransf.toLowerCase().contains("5033") || centroTransf.toLowerCase().contains("três rios"))
//		{
//			page.clickJavaScript(getElementByXPath("(//lightning-base-combobox-item//span[contains(@title, '5033')])[2]"));
//			logger.info("Centro: "+getElementByXPath("(//lightning-base-combobox-item//span[contains(@title, '5033')])[2]").getAttribute("title"));
//		}
//		else
//			logger.error("Valor "+centroTransf+" não mapeado");
//	}
//}
