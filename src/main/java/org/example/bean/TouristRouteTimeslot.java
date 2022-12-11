package org.example.bean;


import lombok.Data;

import java.io.Serializable;

@Data
public class TouristRouteTimeslot implements Serializable {
    /**
     * 
     */
    
    private String startTime;

    /**
     * 
     */
    
    private String endTime;

    /**
     * 
     */
    private Double priceRate;

    

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
        TouristRouteTimeslot other = (TouristRouteTimeslot) that;
        return (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getPriceRate() == null ? other.getPriceRate() == null : this.getPriceRate().equals(other.getPriceRate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getPriceRate() == null) ? 0 : getPriceRate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", priceRate=").append(priceRate);
        
        sb.append("]");
        return sb.toString();
    }
}