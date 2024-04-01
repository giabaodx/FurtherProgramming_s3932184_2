/**
 * @author <Do Xuan Gia Bao - s3932184>
 */

package myorg.model;

import java.util.ArrayList;
import java.util.List;

public class PolicyHolder extends Customer {
    private List<Dependent> dependents = new ArrayList<>();

    public PolicyHolder(String id, String fullName, String insuranceCardId) {
        super(id, fullName, insuranceCardId);
    }

    public void addDependent(Dependent dependent) {
        this.dependents.add(dependent);
    }

    public List<Dependent> getDependents() {
        return dependents;
    }

    @Override
    public String toString() {
        return "PolicyHolder{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", insuranceCardId='" + insuranceCardId + '\'' +
                ", dependents=" + dependents +
                '}';
    }
}
