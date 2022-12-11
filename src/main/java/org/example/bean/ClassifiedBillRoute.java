package org.example.bean;


import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName classified_bill_route
 */
@Data
public class ClassifiedBillRoute implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 服务等级
     */
    private Integer serviceLevel;

    /**
     * 景点信息
     */
    private String scenicSpot;

    /**
     * 出发地
     */
    private String departure;

    /**
     * 目的地
     */
    private String destination;

    /**
     * 
     */
    private String time;

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
        ClassifiedBillRoute other = (ClassifiedBillRoute) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getServiceLevel() == null ? other.getServiceLevel() == null : this.getServiceLevel().equals(other.getServiceLevel()))
            && (this.getScenicSpot() == null ? other.getScenicSpot() == null : this.getScenicSpot().equals(other.getScenicSpot()))
            && (this.getDeparture() == null ? other.getDeparture() == null : this.getDeparture().equals(other.getDeparture()))
            && (this.getDestination() == null ? other.getDestination() == null : this.getDestination().equals(other.getDestination()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getServiceLevel() == null) ? 0 : getServiceLevel().hashCode());
        result = prime * result + ((getScenicSpot() == null) ? 0 : getScenicSpot().hashCode());
        result = prime * result + ((getDeparture() == null) ? 0 : getDeparture().hashCode());
        result = prime * result + ((getDestination() == null) ? 0 : getDestination().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
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
        sb.append(", serviceLevel=").append(serviceLevel);
        sb.append(", scenicSpot=").append(scenicSpot);
        sb.append(", departure=").append(departure);
        sb.append(", destination=").append(destination);
        sb.append(", time=").append(time);
        sb.append(", account=").append(account);
        sb.append("]");
        return sb.toString();
    }
}