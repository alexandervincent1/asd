import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         try (Scanner tangentbord = new Scanner(System.in)){
        int litetTal = 10;
        int stortTal=1000;
        if(litetTal<1000)
        {
            
            System.out.println(litetTal+" är mindre än "+ stortTal);
        }
        else
        {
            System.out.println(litetTal+" är mindre än "+stortTal); //denna kod funkar inte eftersom att vi skapar stortTal i if koden ovan. För att få den och funka får vi ändra det.
        }
        System.out.println("litetTal = "+litetTal+", stortTal = "+stortTal);

        int tal1 = 10;
        int tal2 = 20;
        if(tal2>tal1)
        {
            System.out.println(tal2+" är större än "+tal1);
        }
        else
        {
            System.out.println(tal2+" är mindre än "+tal1);
        }

        System.out.println("Vad är klockna?");
        int klockan = tangentbord.nextInt();
        if(klockan >= 7 && klockan<12)
        {
            System.out.println("Dags och gå upp");
        }
        if(klockan==12)
        {
            System.out.println("Dags och äta");
        }
        if(klockan>=23)
        {
            System.out.println("Dags och gå och lägga sig");
        }

        System.out.println("Hur gammal är du?");
        int ålder = tangentbord.nextInt();
        tangentbord.nextLine();
        System.out.println("Är du medlem?");
        String medelem = tangentbord.nextLine();
        if(ålder>=18 || medelem.equalsIgnoreCase("ja"))
        {
            System.out.println("Välkommen!");
        }

        System.out.println("Ange användarnamn: ");
        String användarnamn = tangentbord.nextLine();
        System.out.println("Ange lösenord: ");
        String lösenord = tangentbord.nextLine();
        if(användarnamn.equals("root")&& lösenord.equals("passwd"))
        {
            System.out.println("Inloggad");
        }
        else
        {
            System.out.println("Fel användarnamn eller lösenord");
        }

        System.out.println("Meny Väderprogram");
        System.out.println("1. Skriv ut temperatur");
        System.out.println("2. SKriv ut vind");
        System.out.println("3. Skriv ut luftfuktighet");
        System.out.println("Ange val");
        int val = tangentbord.nextInt();

        if(val==1)
        {
            System.out.println("Det är 5 grader ute");
        }

        else if(val==2)
        {
            System.out.println("Det är 20m/s vind");
        }

        else if(val==3)
        {
            System.out.println("Det är 99% luftfuktighet utomhus");
        }
        else
        {
            System.out.println("Fel val");
        }

         }
        }
    }
