package org.example.bean;


import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName classified_bill_employee
 */
@Data
public class ClassifiedBillEmployee implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String time;

    /**
     * 
     */
    private Integer guideId;

    /**
     * 
     */
    private Double account;


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
        ClassifiedBillEmployee other = (ClassifiedBillEmployee) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getGuideId() == null ? other.getGuideId() == null : this.getGuideId().equals(other.getGuideId()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getGuideId() == null) ? 0 : getGuideId().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", time=").append(time);
        sb.append(", guideId=").append(guideId);
        sb.append(", account=").append(account);
        sb.append("]");
        return sb.toString();
    }
}