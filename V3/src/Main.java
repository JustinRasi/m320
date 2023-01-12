public class Main {
    public static void main(String[] args) {

        IWaffenVerhalten iWaffenVerhalten = new DolchVerhalten();

        iWaffenVerhalten.verwendeWaffe();

        IWaffenVerhalten iWaffenVerhalten1 = new AxtVerhalten();
        iWaffenVerhalten1.verwendeWaffe();

    }
}