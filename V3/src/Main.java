public class Main {
    public static void main(String[] args) {

        IWaffenVerhalten iWaffenVerhalten = new IWaffenVerhalten.DolchVerhalten();

        iWaffenVerhalten.verwendeWaffe();

        IWaffenVerhalten iWaffenVerhalten1 = new IWaffenVerhalten.AxtVerhalten();
        iWaffenVerhalten1.verwendeWaffe();

    }
}