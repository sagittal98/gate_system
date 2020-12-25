package com.jyyd.gate.pojo;

import java.io.Serializable;

public class CorEmployee implements Serializable {
    private Long corEmpId;

    private Long depId;

    private Long jobId;

    private Long perId;



    private static final long serialVersionUID = 1L;

    public Long getCorEmpId() {
        return corEmpId;
    }

    public void setCorEmpId(Long corEmpId) {
        this.corEmpId = corEmpId;
    }

    public Long getDepId() {
        return depId;
    }

    public void setDepId(Long depId) {
        this.depId = depId;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public Long getPerId() {
        return perId;
    }

    public void setPerId(Long perId) {
        this.perId = perId;
    }
}