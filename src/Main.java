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
    public static String[] carros;
    public static final int[] precoCars = new int[] {100_000, 80_000, 85_000, 120_000,
            90_000, 110_000};
    public static void main(String[] args)
    {
        menuInic(true);
    }
    private static void menuInic(boolean primAcesso)
    {
        if (primAcesso) //space for the reset
        {
            Print.print("\n\t\t*============================*\n" +
                    "\t\tBem-vindo ao Sistema MaoNaRoda\n" +
                    "\t\t*============================*\n\n");
            //FOR RESET
            carros = new String[] {"Ford", "Toyota", "Honda", "Lexus", "Volkswagen", null}; //Volkswagen, das auto
        }

        short opc = Scan.aShort("Selecione uma opção: ");
        switch (opc)
        {
            case 1: vendas(); break;
            case 2: //alugueis(); break;
            case 3: faleConosco(); break;
            case 4: faq(); break;
            case 5: sobre(); break;
            case 6: //reset(); break;
        }
    }
    /*public static short catchShort(Object theShort, Object method) //work in progress
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
    }*/
    private static String getElementoArrStr(Short index, String[] arr)
    {
        return (arr[index] == null) ? "VENDIDO" : arr[index];
    }
    private static Integer getPrecoCar(String carro)
    {
        for (short i = 0; i < carros.length; i++)
        {
            if (carros[i].equalsIgnoreCase(carro))
                return precoCars[i];
        }
        return null;
    }
    private static String carrosDisp()
    {
        String str = "";
        for (short i = 0; i < (carros.length / 2); i++)
        {
            str = str.concat(((carros[i] != null) ? carros[i] + "\t\t" + ((carros[carros.length / 2 + i] == null) ?
                    "VENDIDO" : carros[carros.length / 2 + i] + "\n") : "ERRO CRÍTICO. ENCERRANDO..."));
            /*EXPLAIN ABOVE*/
        }
        return str;
    }
    private static void vendas()
    {
        Print.print("*====*\nVENDAS\n*====*\n\n" +
                "Carros disponíveis: \n");

        for (short i = 0; i < carros.length; i++)
            Print.print(i + " - " + ((carros[i] == null) ? "VENDIDO" : carros[i]) + "\n");
        Print.print("\nQual você deseja comprar?\n-->");

        short opcCar = Scan.aShort();
        Print.print("Você escolheu um " + getElementoArrStr(opcCar, carros) +
                ".\nO preço é " + getPrecoCar(getElementoArrStr(opcCar, carros)) +
                "\nVocê deseja comprar (S ou N)?\n-> "); //WORK IN PROGRESS; UPDATE SCAN
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