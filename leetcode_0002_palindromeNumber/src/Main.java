public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1234));
    }

    public static boolean isPalindrome(int x) {
        // 5 ms runtime on leetcode.

        //Eğer x negatif sayı ise,
        //veya
        //x'in sıfır'a eşit olmadığı durumda 10 ve katları ise.
        //10,20,30 gibi sayılar yani 10'un katları polindrom olamaz.
        //false dönüyorum.
        if(x<0 || x!=0 && x%10==0) return false;

        //Ters sayıyı temsil ediyor.
        int check = 0;
        while (x>check){
            check = check*10 + x%10;
            x/=10;
            /*
            Örneğin 1234 verildi.
            0*10 + x%10 = 0+4 -> check = 4
            Yani sayının son basamağını check'e ekliyoruz.
            Aynı zamanda x'i 10'a bölüp ilgili basamaktan kurtuluyoruz.
            Ta ki x>check koşulu sağlanmayana kadar.
            Bu koşul sayesinde 12>43 noktasına gelince
            Yani kalan yarıyı kontrol etmeye gerek kalmadan
            polindrom olma durumunu kontrol ediyoruz.
             */
        }

        /*
        Aşağıda x ile check'i karşılaştırıyoruz.
        Eğer aynıysa return dönecek.
        Veya
        tek sayılı haneli sayılar için 12345
        12 543 gibi bir durum için check'i 10'a bölüyoruz.
        Çünkü 12021 gibi tek haneli sayılarda ortadaki 0'ın önemi yok.
        Polindrom koşulunu bozmuyor. Çünkü bir tarafa dahil olamıyor.
         */
        return (x==check || x==check/10);
    }

}