import java.util.Scanner;

public class Sekunder2 {
    public static void main(String[] args) {
// jeg starter med at detikere en række int variable som mit program er planlagt til at skulle bruge
        int antalSekunder;
        int minutterRes;
        int sekunderRes;
// jeg indsætter en scanner som gør at mit program kan indtage et input
        Scanner input = new Scanner(System.in);
// dette er den besked som programmet skriver lige før den indtager indputtet
        System.out.println("skriv antal sekunder til omregning: ");

// her definere jeg hvilken variable som indputtet bliver sat ind i
        antalSekunder = input.nextInt();
// her definere jeg ræsten af mine variable
        minutterRes = antalSekunder / 60;
        sekunderRes = antalSekunder % 60;
// her skriver mit program resultatet af udregningen
        System.out.println("tiden i minutter af " + antalSekunder + " vil være " + minutterRes + "," + sekunderRes + " minutter");







    }


}
