public class Figur {

    /**
     * Defining Variables
     */
    private String characterName;
    private IWaffenVerhalten waffe;

    /**
     * Return value characterName
     * @return
     */
    public String getCharacterName() {
        return characterName;
    }

    /**
     * set String this.characterName to value of parameter characterName
     * @param characterName
     */
    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    /**
     * Walk
     */
    public void laufen() {

    }

    /**
     * fight
     */
    public void kaempfen() {

    }

    /**
     * set weapon to Waffe
     * @param waffe
     */
    public void setWaffe(IWaffenVerhalten waffe) {
        this.waffe = waffe;
    }
}
