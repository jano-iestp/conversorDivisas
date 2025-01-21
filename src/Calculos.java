import java.util.Scanner;

public class Calculos {
    private String monedaBase;
    private String monedaCambio;
    private double cantidad;

    Scanner lectura = new Scanner(System.in);
    ConsultarConversion conversion;

    public Calculos(ConsultarConversion conversion) {
        this.conversion = conversion;
    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public String getMonedaCambio() {
        return monedaCambio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void almacenarValores(String monedaBase, String monedaCambio){
        this.monedaBase = monedaBase;
        this.monedaCambio = monedaCambio;

        System.out.println("Ingrese el valor que deseas convertir");

        this.cantidad = Double.parseDouble(lectura.nextLine());
    }

    public void almacenarValoresPersonalizados(){
        String menuOtrasOpciones = """
                        Code      Nombre de la moneda                  País \s
                        AED       Dirham de los EAU                   Emiratos Árabes Unidos \s
                        AFN       Afgani afgano                       Afganistán \s
                        ALL       Lek albanés                         Albania \s
                        AMD       Dram armenio                        Armenia \s
                        ANG       Florín antillano neerlandés         Antillas Neerlandesas \s
                        AOA       Kwanza angoleño                    Angola \s
                        ARS       Peso argentino                     Argentina \s
                        AUD       Dólar australiano                  Australia \s
                        AWG       Florín arubeño                     Aruba \s
                        AZN       Manat azerbaiyano                  Azerbaiyán \s
                        BAM       Marco convertible                  Bosnia y Herzegovina \s
                        BBD       Dólar barbadense                   Barbados \s
                        BDT       Taka bangladesí                    Bangladés \s
                        BGN       Lev búlgaro                        Bulgaria \s
                        BHD       Dinar bahreiní                     Baréin \s
                        BIF       Franco burundés                    Burundi \s
                        BMD       Dólar bermudeño                    Bermudas \s
                        BND       Dólar de Brunéi                    Brunéi \s
                        BOB       Boliviano                          Bolivia \s
                        BRL       Real brasileño                     Brasil \s
                        BSD       Dólar bahameño                     Bahamas \s
                        BTN       Ngultrum butanés                   Bután \s
                        BWP       Pula botsuano                      Botsuana \s
                        BYN       Rublo bielorruso                   Bielorrusia \s
                        BZD       Dólar beliceño                     Belice \s
                        CAD       Dólar canadiense                   Canadá \s
                        CDF       Franco congoleño                   República Democrática del Congo \s
                        CHF       Franco suizo                       Suiza \s
                        CLP       Peso chileno                       Chile \s
                        CNY       Yuan chino                         China \s
                        COP       Peso colombiano                    Colombia \s
                        CRC       Colón costarricense                Costa Rica \s
                        CUP       Peso cubano                        Cuba \s
                        CVE       Escudo caboverdiano                Cabo Verde \s
                        CZK       Corona checa                       República Checa \s
                        DJF       Franco yibutiano                   Yibuti \s
                        DKK       Corona danesa                      Dinamarca \s
                        DOP       Peso dominicano                    República Dominicana \s
                        DZD       Dinar argelino                     Argelia \s
                        EGP       Libra egipcia                      Egipto \s
                        ERN       Nakfa eritreo                      Eritrea \s
                        ETB       Birr etíope                        Etiopía \s
                        EUR       Euro                               Unión Europea \s
                        FJD       Dólar fiyiano                      Fiyi \s
                        FKP       Libra de las Islas Malvinas        Islas Malvinas \s
                        FOK       Corona feroesa                     Islas Feroe \s
                        GBP       Libra esterlina                    Reino Unido \s
                        GEL       Lari georgiano                     Georgia \s
                        GGP       Libra de Guernesey                 Guernesey \s
                        GHS       Cedi ghanés                        Ghana \s
                        GIP       Libra gibraltareña                 Gibraltar \s
                        GMD       Dalasi gambiano                    Gambia \s
                        GNF       Franco guineano                    Guinea \s
                        GTQ       Quetzal guatemalteco               Guatemala \s
                        GYD       Dólar guyanés                      Guyana \s
                        HKD       Dólar de Hong Kong                 Hong Kong \s
                        HNL       Lempira hondureño                  Honduras \s
                        HRK       Kuna croata                        Croacia \s
                        HTG       Gourde haitiano                    Haití \s
                        HUF       Forinto húngaro                    Hungría \s
                        IDR       Rupia indonesia                    Indonesia \s
                        ILS       Nuevo shéquel israelí              Israel \s
                        IMP       Libra de la Isla de Man            Isla de Man \s
                        INR       Rupia india                        India \s
                        IQD       Dinar iraquí                       Irak \s
                        IRR       Rial iraní                         Irán \s
                        ISK       Corona islandesa                   Islandia \s
                        JEP       Libra de Jersey                    Jersey \s
                        JMD       Dólar jamaiquino                   Jamaica \s
                        JOD       Dinar jordano                      Jordania \s
                        JPY       Yen japonés                        Japón \s
                        KES       Chelín keniano                     Kenia \s
                        KGS       Som kirguís                        Kirguistán \s
                        KHR       Riel camboyano                     Camboya \s
                        KID       Dólar de Kiribati                  Kiribati \s
                        KMF       Franco comorense                   Comoras \s
                        KRW       Won surcoreano                     Corea del Sur \s
                        KWD       Dinar kuwaití                      Kuwait \s
                        KYD       Dólar de las Islas Caimán          Islas Caimán \s
                        KZT       Tenge kazajo                       Kazajistán \s
                        LAK       Kip laosiano                       Laos \s
                        LBP       Libra libanesa                     Líbano \s
                        LKR       Rupia de Sri Lanka                 Sri Lanka \s
                        LRD       Dólar liberiano                    Liberia \s
                        LSL       Loti lesotense                     Lesoto \s
                        LYD       Dinar libio                        Libia \s
                        MAD       Dírham marroquí                    Marruecos \s
                        MDL       Leu moldavo                        Moldavia \s
                        MGA       Ariary malgache                    Madagascar \s
                        MKD       Denar macedonio                    Macedonia del Norte \s
                        MMK       Kyat birmano                       Myanmar \s
                        MNT       Tögrög mongol                      Mongolia \s
                        MOP       Pataca macanesa                    Macao \s
                        MRU       Ouguiya mauritana                  Mauritania \s
                        MUR       Rupia mauriciana                   Mauricio \s
                        MVR       Rufiyaa maldiva                    Maldivas \s
                        MWK       Kwacha malauí                      Malaui \s
                        MXN       Peso mexicano                      México \s
                        MYR       Ringgit malasio                    Malasia \s
                        MZN       Metical mozambiqueño               Mozambique \s
                        NAD       Dólar namibio                      Namibia \s
                        NGN       Naira nigeriana                    Nigeria \s
                        NIO       Córdoba nicaragüense               Nicaragua \s
                        NOK       Corona noruega                     Noruega \s
                        NPR       Rupia nepalí                       Nepal \s
                        NZD       Dólar neozelandés                  Nueva Zelanda \s
                        OMR       Rial omaní                         Omán \s
                        PAB       Balboa panameño                    Panamá \s
                        PEN       Sol peruano                        Perú \s
                        PGK       Kina de Papúa Nueva Guinea         Papúa Nueva Guinea \s
                        PHP       Peso filipino                      Filipinas \s
                        PKR       Rupia pakistaní                    Pakistán \s
                        PLN       Zloty polaco                       Polonia \s
                        PYG       Guaraní paraguayo                  Paraguay \s
                        QAR       Rial catarí                        Catar \s
                        RON       Leu rumano                         Rumania \s
                        RSD       Dinar serbio                       Serbia \s
                        RUB       Rublo ruso                         Rusia \s
                        RWF       Franco ruandés                     Ruanda \s
                        SAR       Rial saudí                         Arabia Saudita \s
                        SBD       Dólar de las Islas Salomón         Islas Salomón \s
                        SCR       Rupia seychellense                 Seychelles \s
                        SDG       Libra sudanesa                     Sudán \s
                        SEK       Corona sueca                       Suecia \s
                        SGD       Dólar singapurense                 Singapur \s
                        SHP       Libra de Santa Helena              Santa Helena \s
                        SLE       Leone de Sierra Leona              Sierra Leona \s
                        SOS       Chelín somalí                      Somalia \s
                        SRD       Dólar surinamés                    Surinam \s
                        SSP       Libra sursudanesa                  Sudán del Sur \s
                        STN       Dobra santotomense                 Santo Tomé y Príncipe \s
                        SYP       Libra siria                        Siria \s
                        SZL       Lilangeni suazi                    Esuatini \s
                        THB       Baht tailandés                    Tailandia \s
                        TJS       Somoni tayiko                     Tayikistán \s
                        TMT       Manat turcomano                   Turkmenistán \s
                        TND       Dinar tunecino                    Túnez \s
                        TOP       Paʻanga tongano                   Tonga \s
                        TRY       Lira turca                        Turquía \s
                        TTD       Dólar trinitense                  Trinidad y Tobago \s
                        TVD       Dólar tuvaluano                   Tuvalu \s
                        TWD       Nuevo dólar taiwanés              Taiwán \s
                        TZS       Chelín tanzano                    Tanzania \s
                        UAH       Grivna ucraniana                  Ucrania \s
                        UGX       Chelín ugandés                    Uganda \s
                        USD       Dólar estadounidense              Estados Unidos \s
                        UYU       Peso uruguayo                     Uruguay \s
                        UZS       Som uzbeko                        Uzbekistán \s
                        VES       Bolívar soberano                  Venezuela \s
                        VND       Dong vietnamita                   Vietnam \s
                        VUV       Vatu vanuatuense                  Vanuatu \s
                        WST       Tālā samoano                      Samoa \s
                        XAF       Franco CFA de África Central      CEMAC \s
                        XCD       Dólar del Caribe Oriental         Estados del Caribe Oriental \s
                        XDR       Derechos Especiales de Giro       Fondo Monetario Internacional \s
                        XOF       Franco CFA de África Occidental   África Occidental \s
                        XPF       Franco CFP                        Colectividades de Ultramar \s
                        YER       Rial yemení                       Yemen \s
                        ZAR       Rand sudafricano                  Sudáfrica \s
                        ZMW       Kwacha zambiano                   Zambia \s
                        ZWL       Dólar zimbabuense                 Zimbabue \s
                
                """;
        System.out.println(menuOtrasOpciones);

        System.out.println("Ingrese la moneda base con 3 letras");
        this.monedaBase = this.lectura.next().toUpperCase();
        this.lectura.nextLine(); // Limpiar el buffer después de next()

        System.out.println("Ingrese la moneda de cambio con 3 letras:");
        this.monedaCambio = this.lectura.next().toUpperCase();
        this.lectura.nextLine();

        boolean entradaValida = false;
        do {
            System.out.println("Ingrese el valor que deseas convertir");
            if (lectura.hasNextDouble()) {
                this.cantidad = lectura.nextDouble(); // Leer cantidad
                entradaValida = true;
            } else {
                System.out.println("Error. Ingrese un valor numérico.");
                lectura.next(); // Limpiar entrada no válida
            }
            this.lectura.nextLine(); // Limpiar el buffer después de leer la cantidad
        } while (!entradaValida);
    }

    public String obtenerMensajeRespuesta() {
        String mensaje = getMonedaBase().toUpperCase() + " " + getCantidad() + " equivale a: " + getMonedaCambio().toUpperCase() + " " + conversion.buscaConversion(getMonedaBase(), getMonedaCambio(), getCantidad());
        System.out.println(mensaje);
        return mensaje;
    }
}
