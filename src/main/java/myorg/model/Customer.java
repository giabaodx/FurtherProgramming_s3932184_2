/**
 * @author <Do Xuan Gia Bao - s3932184>
 */

package myorg.model;

/**
 * Abstract class representing a generic customer in the insurance system.
 * This class will be extended by specific types of customers such as PolicyHolder and Dependent.
 */
public abstract class Customer {
    protected String id;
    protected String fullName;
    protected String insuranceCardId;
    protected InsuranceCard insuranceCard;

    /**
     * Constructor to initialize a Customer object.
     *
     * @param id           The customer's ID.
     * @param fullName     The customer's full name.
     * @param insuranceCardId The insurance card associated with the customer.
     */
    public Customer(String id, String fullName, String insuranceCardId) {
        this.id = id;
        this.fullName = fullName;
        this.insuranceCardId = insuranceCardId;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setInsuranceCard(InsuranceCard insuranceCard) {
        this.insuranceCard = insuranceCard;
    }

    public String getFullName() {
        return fullName;
    }

    public InsuranceCard getInsuranceCard() {
        return insuranceCard;
    }
    public String getInsuranceCardId() {
        return insuranceCardId;
    }

    public void setInsuranceCardId(String insuranceCardId) {
        this.insuranceCardId = insuranceCardId;
    }

    /**
     * Method to return a string representation of the customer.
     *
     * @return A string representation of the customer.
     */
    @Override
    public String toString() {
        return String.format("Dependent{id='%s', fullName='%s', insuranceCard=%s}", id, fullName, insuranceCard);
    }
}