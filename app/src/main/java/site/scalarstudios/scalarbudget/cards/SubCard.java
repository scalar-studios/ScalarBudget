package site.scalarstudios.scalarbudget.cards;

/**
 * The SubCard class represents a card with an image and a decimal value.
 * It is used to display information in the Scalar Budget application.
 *
 * @author Lemon_Juice
 */
public class SubCard {
    private int imageResID;
    private double decimalValue;

    public SubCard(int imageResID, double decimalValue) {
        this.imageResID = imageResID;
        this.decimalValue = decimalValue;
    }

    public int getImageResID() {
        return imageResID;
    }

    public double getDecimalValue() {
        return decimalValue;
    }
}
