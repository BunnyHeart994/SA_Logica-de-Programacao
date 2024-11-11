public class Main
{
    public static void main(String[] args)
    {
        inicio(true);
    }
    public static void inicio(boolean chamMenu)
    {
        Print.print("\t\t*============================*\n" +
                "\t\tBem-vindo ao Sistema MaoNaRoda\n" +
                "\t\t*============================*");
        if (chamMenu) menuInicial();
    }
    public static void menuInicial()
    {
        short opc = Scan.aShort();
        switch (opc)
        {
            case 1: ;
        }
    }
}