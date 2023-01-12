interface IWaffenVerhalten {

    default void verwendeWaffe() {

    }

    class AxtVerhalten implements IWaffenVerhalten {

        @Override
        public void verwendeWaffe() {
            System.out.println("Axt");
        }
    }

    class StabVerhalten implements IWaffenVerhalten {

        @Override
        public void verwendeWaffe() {
            System.out.println("Stab");
        }

    }

    class DolchVerhalten implements IWaffenVerhalten {

        @Override
        public void verwendeWaffe() {
            System.out.println("Dolch");
        }
    }
}
