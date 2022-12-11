package org.example.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class Employee implements Serializable {
    /**
     * 导游id
     */
    
    private Integer guideId;

    /**
     * 导游身份证号
     */
    private String idcard;

    /**
     * 导游姓名
     */
    private String name;

    /**
     * 导游等级
     */
    private Integer qualificationLevel;

    

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
        Employee other = (Employee) that;
        return (this.getGuideId() == null ? other.getGuideId() == null : this.getGuideId().equals(other.getGuideId()))
            && (this.getIdcard() == null ? other.getIdcard() == null : this.getIdcard().equals(other.getIdcard()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getQualificationLevel() == null ? other.getQualificationLevel() == null : this.getQualificationLevel().equals(other.getQualificationLevel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGuideId() == null) ? 0 : getGuideId().hashCode());
        result = prime * result + ((getIdcard() == null) ? 0 : getIdcard().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getQualificationLevel() == null) ? 0 : getQualificationLevel().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", guideId=").append(guideId);
        sb.append(", idcard=").append(idcard);
        sb.append(", name=").append(name);
        sb.append(", qualificationLevel=").append(qualificationLevel);
        
        sb.append("]");
        return sb.toString();
    }
}