public class HamburgerFactory {
    public static Hamburger createHamburger(String code) {
        Hamburger hamburger=null;
        switch (code) {
            case "cl":
                hamburger = new ClassicHamburger();
                break;
            case "sp":
                hamburger=new SpicyHamburger();
                break;
            case "la":
                hamburger=new LambHamburger();
                break;
            case "hm":
                hamburger=new HomemadeHamburger();
                break;
            default:
                throw new RuntimeException("wrong Hamburger");
        }
      return hamburger;
    }
    public static Hamburger HamburgerTopping(Hamburger hamburger,String code){
        Hamburger hamburger1=null;
        switch (code) {
            case "ch":
                hamburger1 = new Chips(hamburger);
                break;
            case "or":
                hamburger1=new OnionRings(hamburger);
                break;
            case "sa":
                hamburger1=new Salad(hamburger);
                break;
            case "fe":
                hamburger1=new FriedEgg(hamburger);
                break;
            default:
                throw new RuntimeException("wrong topping");
        }
        return hamburger1;
    }
}

