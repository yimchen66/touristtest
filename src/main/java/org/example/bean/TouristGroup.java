package org.example.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class TouristGroup implements Serializable {
    /**
     * 旅游团id
     */
    
    private Integer id;

    /**
     * 导游id
     */
    private Integer guideId;

    

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
        TouristGroup other = (TouristGroup) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGuideId() == null ? other.getGuideId() == null : this.getGuideId().equals(other.getGuideId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGuideId() == null) ? 0 : getGuideId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", guideId=").append(guideId);
        
        sb.append("]");
        return sb.toString();
    }
}