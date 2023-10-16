public class App {
    public static void main(String[] args) throws Exception {
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
    }
}
