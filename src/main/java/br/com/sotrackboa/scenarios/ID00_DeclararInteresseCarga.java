//package br.com.sotrackboa.scenarios;
//
//import static br.com.sotrackboa.validations.ValidationsHelper.getCv_;
//
//import br.com.sotrackboa.components.CadastroPlaca_MultiCTE;
//import br.com.sotrackboa.components.ConfirmarTransportadora_MultiEmbarcador;
//import br.com.sotrackboa.components.DeclararInteresse_MultiCTE;
//import br.com.sotrackboa.components.InformarDadosDeTransporte_MultiCTE;
//import br.com.sotrackboa.components.Login_MultiCTE;
//import br.com.sotrackboa.components.Login_MultiEmbarcador;
//import br.com.sotrackboa.components.SolicitarNotasFiscais_MultiEmbarcador;
//
//public class ID00_DeclararInteresseCarga 
//{
//	Login_MultiCTE loginMultiCET = new Login_MultiCTE();
//	CadastroPlaca_MultiCTE cadastroPlaca = new CadastroPlaca_MultiCTE();
//	DeclararInteresse_MultiCTE declararInteresse = new DeclararInteresse_MultiCTE();
//	Login_MultiEmbarcador login_MultiEmbarcador = new Login_MultiEmbarcador();
//	ConfirmarTransportadora_MultiEmbarcador confirmarTransportadora = new ConfirmarTransportadora_MultiEmbarcador();
//	InformarDadosDeTransporte_MultiCTE dadosDeTransporte = new InformarDadosDeTransporte_MultiCTE();
//	SolicitarNotasFiscais_MultiEmbarcador solicitarNotas = new SolicitarNotasFiscais_MultiEmbarcador();
//	
//	public void run() throws Exception
//	{
//		loginMultiCET.runComponent();
//		cadastroPlaca.runComponent();
//		declararInteresse.runComponent();
//		
//		login_MultiEmbarcador.runComponent();
//		confirmarTransportadora.runComponent();
//		
//		dadosDeTransporte.runComponent();
//		
//		solicitarNotas.runComponent();
//		
//	}
//}
