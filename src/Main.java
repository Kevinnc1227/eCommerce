/*
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		int[] inteiros = new int[10];
		System.out.println("Valor na posição 0 = " + inteiros[0]);
		inteiros[9] = 37;
		System.out.println("Valor na posição 9 = " + inteiros[9]);
		
		Telefone[] telefones = new Telefone[5];
		telefones[4] = new Telefone();
		telefones[4].setDdd("47");
		telefones[4].setNumero("997204577");
		System.out.println("(" + telefones[4].getDdd() + ")" + telefones[4].getNumero());
		
		FormaPagamento[] pagamentos = new FormaPagamento[4];
		pagamentos[0] = new Dinheiro();
		pagamentos[0].setValor(21.56f);
		pagamentos[1] = new CartaoCredito();
		pagamentos[1].setValor(25.00f);
		/*
		pagamentos[2] = new ValeAlimentacao();
		pagamentos[2].setValor(531.84f);
		
		System.out.println("Valor no " + pagamentos[0].getDescricao() + " R$" + pagamentos[0].getValor() + "\nValor no " + pagamentos[1].getDescricao() + " R$" + pagamentos[1].getValor());
		
		
		List payments = new ArrayList();
		System.out.println( "Tamanho do arrayList = " + payments.size() );
		Dinheiro din1 = new Dinheiro();
		din1.setValor(21.56f);
		payments.add( din1 );
		System.out.println( "Tamanho do arrayList = " + payments.size() );
		CartaoCredito cart1 = new CartaoCredito();
		cart1.setValor(25.00f);
		payments.add( cart1 );
		System.out.println( "Tamanho do arrayList = " + payments.size() );
		
		System.out.println( "valor no " + ((Dinheiro)payments.get(0)).getDescricao() + " R$" + ((Dinheiro)payments.get(0)).getValor() + "\nvalor no " + ((CartaoCredito)payments.get(1)).getDescricao() + " R$" + ((CartaoCredito)payments.get(1)).getValor() );
	
		
		ArrayList<FormaPagamento> paymentsPoli = new ArrayList<FormaPagamento>();
		Dinheiro dinPoli1 = new Dinheiro();
		dinPoli1.setValor(21.56f);
		payments.add( dinPoli1 );
		
		CartaoCredito cartPoli1 = new CartaoCredito();
		cartPoli1.setValor(25.00f);
		paymentsPoli.add( cartPoli1 );
		
		System.out.println( "valor no " + paymentsPoli.get(0).getDescricao() +
				" R$" + paymentsPoli.get(0).getValor() );
		
*/


import java.io.FileNotFoundException;
import java.text.ParseException;

public class Main {
	public static void main(String[] args) {
		/*
		try{
			System.out.println( "Processo numero 1." );
			int a = 100;
			int b = 0;
			System.out.println( a / b );
		}
		//catch (ParseException e){
			//<tratamento do erro 1>
		//}
		// https://docs.oracle.com/javase/8/docs/api/java/lang/ArithmeticException.html
		catch (ArithmeticException e){
			System.out.println( "Não é permitido divisão por zero" );
		}
		// https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html
		catch (Exception e){
			System.out.println( "Tratamento de exceção genérica: " + e.getMessage() );
			//e.printStackTrace();
		}
		//finally{
		//	System.out.println( "Finalizado com sucesso." );
		//}
		*/
		System.out.println( "Inicio" );
		try {
			//Data d = new Data();
			//d.setAno( (short)2400 );
			Data d = new Data( (byte)20, (byte)12, (short)2003 );
			throw new CustomizeException("Carlos", "idade", "[18,90]");
		}
		catch (CustomizeException e){
			System.out.println( "Exception: " + e.getFullMessage() );
		}
		catch (Exception e){
			System.out.println( "Exception: " + e.getMessage() );
		}
		System.out.println( "Fim" );
	}
}

