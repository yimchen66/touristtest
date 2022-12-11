package org.example.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class Customer implements Serializable {
    private Integer id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String idcard;

    /**
     * 
     */
    private String workUnit;

    /**
     * 
     */
    private String occupation;

    /**
     * 
     */
    private String phoneNumber;

    

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
        Customer other = (Customer) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getIdcard() == null ? other.getIdcard() == null : this.getIdcard().equals(other.getIdcard()))
            && (this.getWorkUnit() == null ? other.getWorkUnit() == null : this.getWorkUnit().equals(other.getWorkUnit()))
            && (this.getOccupation() == null ? other.getOccupation() == null : this.getOccupation().equals(other.getOccupation()))
            && (this.getPhoneNumber() == null ? other.getPhoneNumber() == null : this.getPhoneNumber().equals(other.getPhoneNumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getIdcard() == null) ? 0 : getIdcard().hashCode());
        result = prime * result + ((getWorkUnit() == null) ? 0 : getWorkUnit().hashCode());
        result = prime * result + ((getOccupation() == null) ? 0 : getOccupation().hashCode());
        result = prime * result + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", idcard=").append(idcard);
        sb.append(", workUnit=").append(workUnit);
        sb.append(", occupation=").append(occupation);
        sb.append(", phoneNumber=").append(phoneNumber);
        
        sb.append("]");
        return sb.toString();
    }
}