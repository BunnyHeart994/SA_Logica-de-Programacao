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
            case 5:;
            case 6:;
        }
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
        Print.print("\n\t\t*==========*\n" +
                "\t\tDÚVIDAS FREQUENTES\n" +
                "\t\t*==========*\n\n");
    }
}