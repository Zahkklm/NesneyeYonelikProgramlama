public class Daire {

    private static final double PI = 3.14;
    private final int yar��ap; // hata
    /**
     * sat�r 4�n yaz�m� hatal�d�r ��nk� de�i�keni ne kadar bo� tan�mlansada sonu� olarak default
     * olarak tan�mlan�yor ve sat�r 13te r de�eri 'yaricap' de�i�enine atan�yor. Bu da final anahtar
     * kelimesinin bize izin vermedi�i bir durumdur
     */
    private int dairecevre;

    protected static final double cevrehesapla(int r) {

        int yaricap = r;

        double daireAlan = 2 * PI * yaricap;

        return daireAlan;

    }
    public class Kup{
        /**
         * ayr�ca final tan�mlanm�� bir s�n�f�n i�ine anonim bir final veya final olmayan bir
         * s�n�f olu�turabiliriz derleyici bize herhangi bir sorun ��karmayacakt�r
         */
        public static final int KENAR = 5;
        public static final double HACIM =  KENAR*KENAR*KENAR;

        }
    }
