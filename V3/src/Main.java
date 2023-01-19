public class Main {
    public static void main(String[] args) {
        /**
         * Creating new DolchVerhalten Object with name iWaffenVerhalten form IWaffenVerhalten
         */
        IWaffenVerhalten iWaffenVerhalten = new DolchVerhalten();

        /**
         * executing function verwendeWaffe from IWaffenVerhalten
         */
        iWaffenVerhalten.verwendeWaffe();

        /**
         * Creating new AxtVerhalten Object with name iWaffenVerhalten1 from IWaffenVerhalten
         */
        IWaffenVerhalten iWaffenVerhalten1 = new AxtVerhalten();

        /**
         * executing function verwendeWaffe from iWaffenVerhalten1
         */
        iWaffenVerhalten1.verwendeWaffe();

    }
}