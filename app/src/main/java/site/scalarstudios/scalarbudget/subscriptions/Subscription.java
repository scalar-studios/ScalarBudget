package site.scalarstudios.scalarbudget.subscriptions;

/**
 * The Subscription class represents a subscription with a name, cost, and recurring period.
 * It provides methods to access these properties.
 *
 * @author Lemon_Juice
 */
public class Subscription {
    private String name;
    private double cost;
    private String recurringPeriod;

    /**
     * Constructor for Subscription class.
     *
     * @param name the name of the subscription
     * @param cost the cost of the subscription
     * @param recurringPeriod the period for which the subscription recurs (e.g., monthly, yearly)
     */
    public Subscription(String name, double cost, String recurringPeriod) {
        this.name = name;
        this.cost = cost;
        this.recurringPeriod = recurringPeriod;
    }

    /**
     * Gets the name of the subscription.
     *
     * @return the name of the subscription
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the cost of the subscription.
     *
     * @return the cost of the subscription
     */
    public double getCost() {
        return cost;
    }

    /**
     * Gets the recurring period of the subscription.
     *
     * @return the recurring period of the subscription
     */
    public String getRecurringPeriod() {
        return recurringPeriod;
    }
}
