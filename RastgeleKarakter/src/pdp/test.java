package pdp;

public class test {
    public static void main(String[] args) {
        RastgeleKarakter rastgeleKarakter = new RastgeleKarakter();

        System.out.println("Rastgele Karakter: " + rastgeleKarakter.rastgeleKarakter('a', 'z'));
        System.out.println("Rastgele Karakterler: " + rastgeleKarakter.rastgeleKarakterler(10));
        System.out.println("Rastgele Cümle: " + rastgeleKarakter.rastgeleCumle(5));
        System.out.println("Karakterler Arası Rastgele: " + rastgeleKarakter.karakterlerArasiRastgele('A', 'Z', 10));
    }
}

