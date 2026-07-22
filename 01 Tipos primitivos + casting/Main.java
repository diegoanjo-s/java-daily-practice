/**
 * EXERCÍCIO 01 - Tipos Primitivos + Casting
 * Tema: Fechamento de caixa de um turno
 *
 * Objetivo: praticar declaração de variáveis com os tipos primitivos
 * do Java e entender como funciona o casting (conversão de tipos).
 *
 * Instruções:
 * 1. Declare uma variável int representando a quantidade de caixas
 *    de nuggets vendidas no turno.
 *
 * 2. Declare uma variável double representando o valor total em
 *    vendas do turno.
 *
 * 3. Declare uma variável char representando o turno trabalhado
 *    ('M' = manhã, 'T' = tarde, 'N' = noite).
 *
 * 4. Declare uma variável boolean indicando se o turno bateu a
 *    meta de vendas.
 *
 * 5. Declare uma variável long representando o faturamento anual
 *    estimado com base nesse turno (valor grande).
 *
 * 6. Dado o valor: double mediaVendaPorHora = 197.6847;
 *    Faça um CASTING desse valor para int e imprima tanto o valor
 *    original quanto o resultado do casting, pra observar que ele
 *    trunca (corta) as casas decimais, sem arredondar.
 *
 * 7. Imprima todas as informações formatadas como um relatório de
 *    fechamento de caixa, usando System.out.println.
 */
public class Main {
    public static void main(String[] args) {

     int nuggets = 556;
     double vendas = 12.156;
     char turno = 'm';
     boolean meta = true;
     long faturamento = 500000000L;
     double mediaVendaPorHora = 197.6847;
     int mediaVendaPorHoraInt = (int) mediaVendaPorHora;

        System.out.println(mediaVendaPorHora);
        System.out.println(mediaVendaPorHoraInt);
        System.out.println(nuggets);
        System.out.println(vendas);
        System.out.println(turno);
        System.out.println(meta);
        System.out.println(faturamento);
    }
}