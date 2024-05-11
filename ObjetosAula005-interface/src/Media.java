/*
	uma interface define um conjunto de métodos que um objeto deve implementar. Pense nela como um contrato entre a classe e o mundo exterior, especificando o comportamento que a classe se compromete a ter.
	
	Características principais das interfaces:
	
	Foco no comportamento: Definem os métodos que um objeto deve ter, sem se preocupar com a implementação interna.
	Abstração: Ocultam os detalhes de implementação, promovendo o encapsulamento e a reutilização de código.
	Polimorfismo: Permitem que diferentes classes implementem os mesmos métodos de maneiras distintas, proporcionando flexibilidade e extensibilidade ao código.
	Declaração de métodos abstratos: Os métodos em uma interface não possuem corpo, apenas a assinatura (nome, tipo de retorno e parâmetros). A implementação concreta fica a cargo das classes que a implementam.
	Não podem ser instanciadas: Interfaces servem como modelo para outras classes, não podendo criar objetos por si só.
	Membros públicos por padrão: Os métodos e variáveis declarados em uma interface são implicitamente públicos.
	Exemplos de uso de interfaces:
	
	Formas geométricas: Uma interface FormaGeometrica pode definir métodos como calcularArea(), calcularPerimetro() e desenhar(), que diferentes classes como Círculo, Retângulo e Triângulo
	podem implementar de acordo com suas características específicas.
	Sistemas de pagamento: Uma interface Pagamento pode definir métodos como autorizar(), processar() e cancelar(), que diferentes classes como PagamentoCartaoCredito, 
	PagamentoBoleto e PagamentoPix podem implementar de acordo com o método de pagamento específico.
*/
public interface Media {

	double getMedia();
}
