
public class Main extends Daire {

	public static void main(String[] args) {
		/**
         * Fark edildi�i �zere final de�isken isimleri class tan�mlamalar�nda
         * oldu�u gibi pascal case yaz� tipi olmay�p komple b�y�k harflerle
         * yaz�lm��lt�r ve bo�luklar� alt �izgiler olu�turmu�tur. Bu tan�mlaman�n haricinde
         * final de�i�ken isimlerini pascal case kullansayd�k derleyici sorunsuz �al��acakt� ancak
         * final anahtar kelimesi i�in b�y�k harf kullanmak t�m yaz�l�mc�lar taraf�ndan bilinen
         * ve kullan�lan yaz�l� olamyan bir kurald�r.
         */
        final int DEGISMEZ_YUKSEKLIK = 10;
        final int DEGISMEZ_EN = 20;

        int alan_hesapla = DEGISMEZ_YUKSEKLIK * DEGISMEZ_EN;
        final int ALAN_HESAPLA_FINAL = DEGISMEZ_YUKSEKLIK * DEGISMEZ_EN;
        /**
         *  fark edildi�i �zere final anahtar kelimesi ile tan�mlanan bir de�i�kenin atamas�nda
         *  farkl� di�er iki de�i�kenin �arpmas�n� yapabiliyoruz ayr�ca buna toplama ��karma b�lme
         *  ve di�er aritmatik i�lemler de dahil
         */
       // ALAN_HESAPLA_FINAL += 50; // hata
        alan_hesapla += 50;
        /** yukar�daki i�leme bakacak olursak de�i�kenlere sonradan de�er eklemeye kalk��t���m�zda
         * daha do�rusu �nceden atanm�� bir de�i�keni de�i�tirmeye kalkt���m�z zaman final tan�mlanan
         * de�i�ken bize hata f�rlat�r "java: cannot assign a value to final variable " �eklinde
         * bu y�zden sat�r 23 hata verir ancak sat�r 24 sorunsuz �al���r. K�sacas� final anahtar kelimesi
         * de�i�kenlerde bize sa�lad��� fayda 'e�er de�i�ken tan�mlanm��sa bu de�i�keni sonraki kod sat�rlar�m�zda
         * de�i�tirememize olanak sa�lar'. Bunun faydas�n� daha �ok k�t�phane olu�tururken veya b�y�k �l�ekli
         * projelerde, de�i�memesi gereken bir de�i�keni sonradan yaln��l�kla yaz�l�mc�n�n de�i�tirmemesini �nler
         * ve onu uyar�r.Bu ve benzeri durumlarda kullan�lmas� tavsiye edilir
         *
         */
        System.out.println(alan_hesapla);
        System.out.println(ALAN_HESAPLA_FINAL);
        System.out.println(Daire.cevrehesapla(5));
        System.out.println(Daire.Kup.HACIM);

	}

}
