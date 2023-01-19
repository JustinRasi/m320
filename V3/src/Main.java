public class Main {
    public static void main(String[] args) {

        /**
         * Erzeugt ein neues Objekt WaffenVerhalten
         */
        IWaffenVerhalten iWaffenVerhalten = new DolchVerhalten();

        iWaffenVerhalten.verwendeWaffe();

        IWaffenVerhalten iWaffenVerhalten1 = new AxtVerhalten();
        iWaffenVerhalten1.verwendeWaffe();

    }
}