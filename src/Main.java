/*
- Tela Inicial de Bem-vindo ao Sistema.
- Menu Inicial contendo as principais funcionalidades e Informações.
- Vendas, Alugueis, Fale Conosco, Dúvidas Frequentes, Sobre.
- Sub Menu (Veículos, tipos de Veículos, valores, comprar, alugar, parcelas,
    descontos, juros, nome do cliente, idade, CNH, Categoria CNH, orçamentos,
    simular valor do aluguel).
- Caso o cliente aprove a simulação do aluguel ou tenha interesse de compra
    de um veículo, mostrar uma opção de agendamento com um dos atendentes.
- Retornar em outras partes do menu, sub menu, opção de realizar novo
    atendimento, continuar atendimento anterior e finalizar o sistema.
*/
public class Main
{
    public static void main(String[] args)
    {
        menuInic(true);
    }
    private static void menuInic(boolean saudar)
    {
        if (saudar)
        {
            Print.print("\n\t\t*============================*\n" +
                    "\t\tBem-vindo ao Sistema MaoNaRoda\n" +
                    "\t\t*============================*\n\n");
            String[] carros = new String[5];
        }

        short opc = Scan.aShort("Selecione uma opção: ");
        switch (opc)
        {
            case 1: vendas();
            case 2: alugueis();
            case 3: faleConosco();
            case 4: faq();
            case 5: sobre();
            case 6: reset();
        }
    }
    public static short catchShort(Object theShort, Object method) //work in progress
    {
        try
        {
            short ctrl = theShort;
            return theShort;
        }
        catch (Exception e)
        {
            Print.printLn("INPUT INVÁLIDO. ESPERAVA-SE short.");
            menuInic(false);

        }
    }
    private static void comprarCar()
    {

    }
    private static String[] carrosDisp()
    {
        return {"", ", ", "", "", ""};
    }
    private static void vendas()
    {
        Print.print("*====*\nVENDAS\n*====*\n\n" +
                "Carros disponíveis: \n\n");

    }
    private static void faleConosco()
    {
        //System.out.println("");
        Print.print("\n\t\t*==========*\n" +
                "\t\tFALE CONOSCO\n" +
                "\t\t*==========*\n\n" +
                "Contatos para SAC:\n" +
                "Telefone - 31 3333 3333\nWhatsApp - 31 9 9999 9999\n" +
                "Email - maonarodasac@gmail.com\n\n");
        menuInic(false);
    }
    private static void faq()
    {
        Print.print("\n\t\t*================*\n" +
                "\t\tDÚVIDAS FREQUENTES\n" +
                "\t\t*================*\n\n");
        Print.printLn("Qual é o nosso horário de funcionamento?\n" +
                "\t-> Somente de segunda a sexta das 7:00 às 20:00.\n" +
                "Qual é o estado dos nossos carros?\n" +
                "\t-> Disponibilizamos somente carros novos.\n" +
                "Quais tipos de veículos nós disponibilizamos?\n" +
                "\t-> Sim. Somente disponibilizamos carros e motos.\n" +
                "Fazemos reembolso?\n" +
                "\t-> Sim, porém apenas se for solicitado dentro do prazo de 7 dias.\n");
        menuInic(false);
    }
    private static void sobre()
    {
        Print.print("Sistema MãoNaRoda v.1.0\n" +
                "A Mão na Roda é uma empresa de venda e aluguel de carros e motos novas, " +
                "fundada em 2022 por Carlos Alberto, localizada na Av. do Contorno, " +
                "no bairro Savassi em Belo Horizonte, MG.");
        menuInic(false);
    }
}