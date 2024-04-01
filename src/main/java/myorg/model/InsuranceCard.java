/**
 * @author <Do Xuan Gia Bao - s3932184>
 */

package myorg.model;

import java.util.Date;

/**
 * Represents an insurance card in the insurance system.
 */
public class InsuranceCard {
    private String cardNumber;
    private String cardHolderId;
    private String policyOwnerId;
    private Date expirationDate;

    /**
     * Constructor for creating an instance of InsuranceCard.
     *
     * @param cardNumber     The card's number.
     * @param cardHolderId   The ID of the customer who holds this card.
     * @param policyOwnerId  The ID of the policy owner.
     * @param expirationDate The expiration date of the card.
     */
    public InsuranceCard(String cardNumber, String cardHolderId, String policyOwnerId, Date expirationDate) {
        this.cardNumber = cardNumber;
        this.cardHolderId = cardHolderId;
        this.policyOwnerId = policyOwnerId;
        this.expirationDate = expirationDate;
    }

    // Getters
    public String getCardNumber() { return cardNumber; }
    public String getCardHolderId() { return cardHolderId; }
    public String getPolicyOwnerId() { return policyOwnerId; }
    public Date getExpirationDate() { return expirationDate; }

    // Setters
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardHolderId(String cardHolderId) {
        this.cardHolderId = cardHolderId;
    }

    public void setPolicyOwnerId(String policyOwnerId) {
        this.policyOwnerId = policyOwnerId;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "InsuranceCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", cardHolderId='" + cardHolderId + '\'' +
                ", policyOwnerId='" + policyOwnerId + '\'' +
                ", expirationDate=" + (expirationDate != null ? expirationDate.toString() : "null") +
                '}';
    }
}
