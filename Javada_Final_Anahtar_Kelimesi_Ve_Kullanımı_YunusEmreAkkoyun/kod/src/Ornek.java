public class Ornek{

static double PI = 3.14; // burada pi say�s�n� 3,14 e sabitliyoruz. Program i�erisinde de�i�tirmeye �al���ld���nda hata verecektir.

int yar��ap;

static int dairecevre;

double cevrehesapla(int r) {

int yaricap = r;
PI = r;
double daireninAlan� = 2 * PI * yaricap;

return daireninAlan�;
}

public static void main(String[] args) {

Ornek d1 = new Ornek();

double sonuc = d1.cevrehesapla(3);

System.out.println(sonuc);

}
}