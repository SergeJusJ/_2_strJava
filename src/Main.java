public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//1.sukurti du kintamuosius.
// Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus (Jonas Jonaitis).
// Atspausdinti trumpesnį stringą.
        System.out.println("Uzduotis Nr.1: ");
        String v = "Lui ";
        String p = "deFenes ";
        System.out.println(v + p);
       if (v.length() > p.length()){System.out.println(p);}
       else System.out.println(v);
//2.
/** Sukurti du kintamuosius.
       Jiems priskirti savo mylimo aktoriaus vardą
       ir pavardę kaip stringus.
       Vardą atspausdinti tik didžiosiom raidėm, o pavardę tik mažosioms. (LEONARDO dicaprio)
    */
      System.out.println("Uzduotis Nr.2: ");
     // String v = "Lui ";
     // String p = "deFenes ";
        System.out.println(v.toUpperCase());
        System.out.println(p.toLowerCase());

//3.
        /**Sukurti du kintamuosius.
        Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus.
         Sukurti trečią kintamąjį ir jam priskirti stringą,
          sudarytą iš pirmų vardo ir pavardės kintamųjų raidžių. Jį atspausdinti.
         * */
        System.out.println("Uzduotis Nr.3: ");

        char vP = v.charAt(0); //vardo Pirma raid.
        char pP = p.charAt(0); //pavardes Pirma raid.
        char[] tmp= {vP,pP};

        System.out.println(tmp);

//4.
        /**
         *Sukurti du kintamuosius.
         *  Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip stringus.
         *  Sukurti trečią kintamąjį ir jam
         *  priskirti stringą, sudarytą iš trijų paskutinių vardo ir pavardės kintamųjų raidžių.
         *  Jį atspausdin
         */
        System.out.println("Uzduotis Nr.4: ");

        String v3p = v.substring((v.length()-4)); //vardo pask 3 raid.
        System.out.println(v3p);
        String p3p = p.substring((p.length()-4)); //pav. pask 3 raid.
        System.out.println(v3p+p3p);


//5.
 /**
        Sukurti kintamąjį su stringu:
  “An American in Paris”.
  Jame visas “a” (didžiąsias ir mažąsias) pakeisti žvaigždutėm “*”.
  Rezultatą atspausdinti.
        */

        System.out.println("Uzduotis Nr.5: ");
        String tmp2 = "An American in Paris";
        System.out.println(tmp2);
    String aSt = tmp2.replace('a','*');
    aSt = aSt.replace('A','*');
        System.out.println(aSt);
//6.
        /**
         * Sukurti kintamąjį su stringu: “An American in Paris”.
         * Jame ištrinti visas balses. Rezultatą atspausdinti.
         * Kodą pakartoti su stringais: “Breakfast at Tiffany's”, “2001: A Space Odyssey” ir “It's a Wonderful Life”.*
         s1 = s.replaceAll("[aeiou]", "");

         */
        System.out.println("Uzduotis Nr.6: ");
        String bB = tmp2.replaceAll("[aeiou]", ""); //be balsiu
        System.out.println("Be balsiu mazu:" + bB);
        bB = bB.replaceAll("[AEIOU]", "");
        System.out.println("Be balsiu :" + bB);

//7.
        /**
         * Stringe, kurį generuoja toks kodas:
         * ""Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope"
         * Surasti ir atspausdinti epizodo numerį.
         * str = str.replaceAll("[^\\d]", " ");
         * */
        System.out.println("Uzduotis Nr.7: ");

        String episode = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
        System.out.println(episode);

                System.out.println("Episodo Nr.: "+episode.replaceAll("[^\\d]", " "));


    }
}