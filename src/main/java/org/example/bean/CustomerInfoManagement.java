package org.example.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class CustomerInfoManagement implements Serializable {
    private Integer id;

    /**
     * 
     */
    private Integer contractId;

    /**
     * 
     */
    private Integer customerId;

    /**
     * 
     */
    private Integer branchCompanyId;

    /**
     * 
     */
    private Integer touristGroupId;

    

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CustomerInfoManagement other = (CustomerInfoManagement) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getContractId() == null ? other.getContractId() == null : this.getContractId().equals(other.getContractId()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getBranchCompanyId() == null ? other.getBranchCompanyId() == null : this.getBranchCompanyId().equals(other.getBranchCompanyId()))
            && (this.getTouristGroupId() == null ? other.getTouristGroupId() == null : this.getTouristGroupId().equals(other.getTouristGroupId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getContractId() == null) ? 0 : getContractId().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getBranchCompanyId() == null) ? 0 : getBranchCompanyId().hashCode());
        result = prime * result + ((getTouristGroupId() == null) ? 0 : getTouristGroupId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", contractId=").append(contractId);
        sb.append(", customerId=").append(customerId);
        sb.append(", branchCompanyId=").append(branchCompanyId);
        sb.append(", touristGroupId=").append(touristGroupId);
        
        sb.append("]");
        return sb.toString();
    }
}