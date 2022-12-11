package org.example.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class TouristRoute implements Serializable {
    /**
     * 
     */
    
    private Integer serviceLevel;

    /**
     * 
     */
    
    private String scenicSpot;

    /**
     * 
     */
    
    private String departure;

    /**
     * 
     */
    
    private String destination;

    /**
     * 
     */
    private String transpation;

    /**
     * 
     */
    private Double priceBase;

    /**
     * 
     */
    private String startTime;

    /**
     * 
     */
    private String endTime;

    

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
        TouristRoute other = (TouristRoute) that;
        return (this.getServiceLevel() == null ? other.getServiceLevel() == null : this.getServiceLevel().equals(other.getServiceLevel()))
            && (this.getScenicSpot() == null ? other.getScenicSpot() == null : this.getScenicSpot().equals(other.getScenicSpot()))
            && (this.getDeparture() == null ? other.getDeparture() == null : this.getDeparture().equals(other.getDeparture()))
            && (this.getDestination() == null ? other.getDestination() == null : this.getDestination().equals(other.getDestination()))
            && (this.getTranspation() == null ? other.getTranspation() == null : this.getTranspation().equals(other.getTranspation()))
            && (this.getPriceBase() == null ? other.getPriceBase() == null : this.getPriceBase().equals(other.getPriceBase()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getServiceLevel() == null) ? 0 : getServiceLevel().hashCode());
        result = prime * result + ((getScenicSpot() == null) ? 0 : getScenicSpot().hashCode());
        result = prime * result + ((getDeparture() == null) ? 0 : getDeparture().hashCode());
        result = prime * result + ((getDestination() == null) ? 0 : getDestination().hashCode());
        result = prime * result + ((getTranspation() == null) ? 0 : getTranspation().hashCode());
        result = prime * result + ((getPriceBase() == null) ? 0 : getPriceBase().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serviceLevel=").append(serviceLevel);
        sb.append(", scenicSpot=").append(scenicSpot);
        sb.append(", departure=").append(departure);
        sb.append(", destination=").append(destination);
        sb.append(", transpation=").append(transpation);
        sb.append(", priceBase=").append(priceBase);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        
        sb.append("]");
        return sb.toString();
    }
}