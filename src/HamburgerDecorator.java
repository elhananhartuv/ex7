public class HamburgerDecorator implements Hamburger {
    protected Hamburger itsHamburger;

    public HamburgerDecorator(Hamburger hamburger) {
        this.itsHamburger = hamburger;
    }

    @Override
    public String serve() {
        return itsHamburger.serve();
    }
}
