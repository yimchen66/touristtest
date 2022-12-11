package org.example.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName contract
 */
@Data
public class Contract implements Serializable {
    /**
     * 合同id
     */

    private Integer id;

    /**
     * 合同版本id
     */
    private Integer contractVersionId;

    /**
     * 用户基本信息id
     */
    private Integer customerId;

    /**
     * 导游id
     */
    private Integer guideId;

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
     * 最终交易价格
     */
    private Double finialPrice;

    

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
        Contract other = (Contract) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getContractVersionId() == null ? other.getContractVersionId() == null : this.getContractVersionId().equals(other.getContractVersionId()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getGuideId() == null ? other.getGuideId() == null : this.getGuideId().equals(other.getGuideId()))
            && (this.getServiceLevel() == null ? other.getServiceLevel() == null : this.getServiceLevel().equals(other.getServiceLevel()))
            && (this.getScenicSpot() == null ? other.getScenicSpot() == null : this.getScenicSpot().equals(other.getScenicSpot()))
            && (this.getDeparture() == null ? other.getDeparture() == null : this.getDeparture().equals(other.getDeparture()))
            && (this.getDestination() == null ? other.getDestination() == null : this.getDestination().equals(other.getDestination()))
            && (this.getFinialPrice() == null ? other.getFinialPrice() == null : this.getFinialPrice().equals(other.getFinialPrice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getContractVersionId() == null) ? 0 : getContractVersionId().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getGuideId() == null) ? 0 : getGuideId().hashCode());
        result = prime * result + ((getServiceLevel() == null) ? 0 : getServiceLevel().hashCode());
        result = prime * result + ((getScenicSpot() == null) ? 0 : getScenicSpot().hashCode());
        result = prime * result + ((getDeparture() == null) ? 0 : getDeparture().hashCode());
        result = prime * result + ((getDestination() == null) ? 0 : getDestination().hashCode());
        result = prime * result + ((getFinialPrice() == null) ? 0 : getFinialPrice().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", contractVersionId=").append(contractVersionId);
        sb.append(", customerId=").append(customerId);
        sb.append(", guideId=").append(guideId);
        sb.append(", serviceLevel=").append(serviceLevel);
        sb.append(", scenicSpot=").append(scenicSpot);
        sb.append(", departure=").append(departure);
        sb.append(", destination=").append(destination);
        sb.append(", finialPrice=").append(finialPrice);
        sb.append("]");
        return sb.toString();
    }
}