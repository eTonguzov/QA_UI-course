public class Program {
    public static void main(String[] args)
    {
//        Auto sedan = new Sedan();
//        Auto hybrid = new HybridAuto();
//        Auto f1car = new F1Car();
//
//        sedan.fill();
//        hybrid.fill();
//        f1car.fill();
        String somestr = "sdsd";

        Auto f1car = new F1Car();
        if(somestr == "") {
            f1car.setFillStrategy(new StandartFillStrategy());
        } else if(somestr == "sdsd")
        {
            f1car.setFillStrategy(new HybridFillStrategy());
        }
        f1car.fill();
    }















}
