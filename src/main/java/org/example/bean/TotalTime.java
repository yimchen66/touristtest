package org.example.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class TotalTime implements Serializable {
    /**
     * 总账id
     */
    private Integer id;

    /**
     * 分公司id
     */
    private Integer branchCompanyId;

    /**
     * 分公司总账年月
     */
    private String time;

    /**
     * 金额
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
        TotalTime other = (TotalTime) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBranchCompanyId() == null ? other.getBranchCompanyId() == null : this.getBranchCompanyId().equals(other.getBranchCompanyId()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBranchCompanyId() == null) ? 0 : getBranchCompanyId().hashCode());
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
        sb.append(", branchCompanyId=").append(branchCompanyId);
        sb.append(", time=").append(time);
        sb.append(", account=").append(account);
        
        sb.append("]");
        return sb.toString();
    }
}