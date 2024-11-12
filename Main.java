public class Main
{
    public static void main(String[] args)
    {
        menuInic(true);
    }
    private static void menuInic(boolean saudar)
    {
        if (saudar)
            Print.print("\n\t\t*============================*\n" +
                    "\t\tBem-vindo ao Sistema MaoNaRoda\n" +
                    "\t\t*============================*\n\n");

        short opc = Scan.aShort("Selecione uma opção: ");
        switch (opc)
        {
            case 3: faleConosco();
            case 4: faq();
            case 5: sobre();
            case 6:;
        }
    }
    public static short catchShort(short theShort) //work in progress
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
    } //work in progress
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
                "A Mão na Roda é uma empresa de venda e aluguel de veículos novos," +
                "localizada na Av. do Contorno, no bairro Savassi em Belo Horizonte.");
    }
}