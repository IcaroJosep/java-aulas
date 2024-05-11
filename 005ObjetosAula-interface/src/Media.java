/*
	uma interface define um conjunto de m�todos que um objeto deve implementar. Pense nela como um contrato entre a classe e o mundo exterior, especificando o comportamento que a classe se compromete a ter.
	
	Caracter�sticas principais das interfaces:
	
	Foco no comportamento: Definem os m�todos que um objeto deve ter, sem se preocupar com a implementa��o interna.
	Abstra��o: Ocultam os detalhes de implementa��o, promovendo o encapsulamento e a reutiliza��o de c�digo.
	Polimorfismo: Permitem que diferentes classes implementem os mesmos m�todos de maneiras distintas, proporcionando flexibilidade e extensibilidade ao c�digo.
	Declara��o de m�todos abstratos: Os m�todos em uma interface n�o possuem corpo, apenas a assinatura (nome, tipo de retorno e par�metros). A implementa��o concreta fica a cargo das classes que a implementam.
	N�o podem ser instanciadas: Interfaces servem como modelo para outras classes, n�o podendo criar objetos por si s�.
	Membros p�blicos por padr�o: Os m�todos e vari�veis declarados em uma interface s�o implicitamente p�blicos.
	Exemplos de uso de interfaces:
	
	Formas geom�tricas: Uma interface FormaGeometrica pode definir m�todos como calcularArea(), calcularPerimetro() e desenhar(), que diferentes classes como C�rculo, Ret�ngulo e Tri�ngulo
	podem implementar de acordo com suas caracter�sticas espec�ficas.
	Sistemas de pagamento: Uma interface Pagamento pode definir m�todos como autorizar(), processar() e cancelar(), que diferentes classes como PagamentoCartaoCredito, 
	PagamentoBoleto e PagamentoPix podem implementar de acordo com o m�todo de pagamento espec�fico.
*/
public interface Media {

	double getMedia();
}
