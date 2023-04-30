package br.com.sotrackboa.execute;
//package br.com.piracanjuba.execute;
//
//import static br.com.atomic.framework.proton.ProtonHelper.isProtonExecution;
//import static br.com.atomic.framework.proton.ProtonHelper.updateProtonRunStatus;
//import static br.com.atomic.framework.proton.ProtonHelper.getProtonCurrentComponentName;
//import static br.com.atomic.framework.proton.ProtonHelper.getProtonCurrentComponentType;
//import static br.com.atomic.framework.helpers.BrowserHelper.setBrowser;
//import static org.junit.Assert.assertTrue;
//
//import java.lang.reflect.Method;
//
//import org.junit.jupiter.api.Test;
//
//import com.google.common.base.Strings;
//
//import br.com.atomicsolutions.proton.Proton;
//import br.com.atomicsolutions.proton.RunStatus;
//import br.com.piracanjuba.scenarios.ME.ID00_DeclararInteresseCarga;
//import br.com.piracanjuba.scenarios.ME.ID014_ValidarPaginaCanhotosMultEmbarcador;
//import br.com.piracanjuba.scenarios.ME.ID016_ValidarPaginaCanhotosMultiCTE;
//import br.com.piracanjuba.scenarios.ME.ID017_ValidarPaginasFluxoMultiCTE_Legacy;
//import br.com.piracanjuba.scenarios.ME.ID01_EnviarEValidarCanhotos;
//import br.com.piracanjuba.scenarios.ME.ID02_CadastrarVeiculo;
//import br.com.piracanjuba.scenarios.ME.ID03_ConsultarDocumentosTransporte;
//import br.com.piracanjuba.scenarios.ME.ID04_SolicitarNotas;
//import br.com.piracanjuba.scenarios.ME.ID08_BaixarXML;
//import br.com.piracanjuba.scenarios.ME.ID09_VerificarDisponibilidadeCarga;
//import br.com.piracanjuba.scenarios.ME.ID15_ValidarJanelaCarregamentoMultiCTE;
//import br.com.piracanjuba.scenarios.ME.ID16_CadastroVeiculoME;
//import br.com.piracanjuba.scenarios.SalesForce.ID01_Login;
//import br.com.piracanjuba.scenarios.SalesForce.ID06_CriacaoNPedidosSalesForce;
//import br.com.piracanjuba.validations.ValidationsHelper;
//import br.com.atomic.framework.base.DefaultBaseController;
//import br.com.atomic.framework.base.PageBase;
//import br.com.atomic.framework.controllers.PlaywrightController;
//import br.com.atomic.framework.controllers.WebController;
//import br.com.atomic.framework.helpers.LoggerHelper;
//import br.com.atomic.framework.proton.ProtonHelper;
//
//
//public class TestScenario extends PageBase {
//	
//	@Test 
//	public void main() throws Exception	
//	{
//		
//		boolean isProtonStarted = false;
//		boolean isProtonFinished = false;
//		
//		LoggerHelper logger = new LoggerHelper(TestScenario.class);
//		
//		try 
//		{
//			
//			//Muda Status de execução do Proton
//			updateProtonRunStatus(RunStatus.RUNNING);
//
//			ValidationsHelper.initializeCv_();
//			
//
//			if(isProtonExecution()) 
//			{
//				
//				logger.info("----------------------- Início da execução do teste - Piracanjuba -----------------------");
//				logger.info("Execução via Proton. ID do Dataset Run: "+ProtonHelper.getDatasetRunID());
//				
//				String currentComponent = Proton.getCurrentComponentSystem();
//				while(currentComponent.toLowerCase().equals("multiembarcador") ||
//						currentComponent.toLowerCase().equals("salesforce") || 
//						currentComponent.toLowerCase().equals("sales force")) {
//
//					String className = getProtonCurrentComponentName();
//					Class<?> component = Class.forName("br.com.piracanjuba.components."+ getComponentPackage(currentComponent)+ "." + className);
//					Object componentInst  = component.newInstance();
//					Method runComponent = componentInst.getClass().getMethod("runComponent", null);
//					runComponent.invoke(componentInst, null);
//
//					currentComponent = Proton.getCurrentComponentSystem();
//				}
//				
//				if(Strings.isNullOrEmpty(Proton.getCurrentComponentSystem()))
//					isProtonFinished = true;
//
//			}
//			else
//			{
				//Execução de teste local (sem Proton)
//				logger.info("Início da execução do teste");

				//ID06_CriacaoNPedidosSalesForce scenario = new ID06_CriacaoNPedidosSalesForce();

				//ID00_DeclararInteresseCarga  scenario = new ID00_DeclararInteresseCarga();
				//ID016_ValidarPaginaCanhotosMultiCTE scenario = new ID016_ValidarPaginaCanhotosMultiCTE();
				//ID15_ValidarJanelaCarregamentoMultiCTE scenario = new ID15_ValidarJanelaCarregamentoMultiCTE();
				//ID02_CadastrarVeiculo scenario = new ID02_CadastrarVeiculo();
				//ID09_VerificarDisponibilidadeCarga scenario = new ID09_VerificarDisponibilidadeCarga();
				//ID04_SolicitarNotas scenario = new ID04_SolicitarNotas();
				//ID01_EnviarEValidarCanhotos scenario = new ID01_EnviarEValidarCanhotos();
				//ID014_ValidarPaginaCanhotosMultEmbarcador scenario = new ID014_ValidarPaginaCanhotosMultEmbarcador();
				//ID03_ConsultarDocumentosTransporte  scenario = new ID03_ConsultarDocumentosTransporte();
				//ID08_BaixarXML scenario = new ID08_BaixarXML();
//				ID16_CadastroVeiculoME scenario = new ID16_CadastroVeiculoME();
//				scenario.run();
//			}
//			
//			if(isProtonFinished)
//			{
//				updateProtonRunStatus(RunStatus.PASSED);
//				
//				logger.info("Cenário executado com sucesso.");
//				logger.info("----------------------- Fim da execução do teste - Piracanjuba  -----------------------");
//			}
//			else
//			{
//				logger.info("Parte web do cenário finalizada com sucesso. Preparado para iniciar steps do próximo sistema");
//			}
//
//			
//			PlaywrightController.closePage();
//
//		}		
//		catch(Exception e)
//		{
//
//			//Local onde o script deve ir em caso de falha
//			
//			ProtonHelper.setProtonExceptionLog(e);
//			
//			if(isProtonExecution() && !isProtonStarted)
//				ProtonHelper.startProtonScript();
//			
//			updateProtonRunStatus(RunStatus.FAILED);
//			
//			if(PlaywrightController.getPage() != null)
//				logger.takeScreenShot("FALHA - Tela de Erro", PlaywrightController.getPage());
//
//			logger.info("----------------------- Fim da execução do teste - Piracanjuba -----------------------");
//			
//			PlaywrightController.closePage();
//
//			assertTrue("Scenario Execution", false);
//		}
//	}
//	
//	private String getComponentPackage(String componentType)
//	{
//		if(componentType.toLowerCase().equals("multiembarcador"))
//			return "ME";
//		else if(componentType.toLowerCase().equals("salesforce") || componentType.toLowerCase().equals("sales force"))
//			return "SalesForce";
//		else
//			return "";
//	}
//	
//}
