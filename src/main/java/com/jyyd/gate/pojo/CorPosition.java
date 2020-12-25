package com.jyyd.gate.pojo;

import java.io.Serializable;

public class CorPosition implements Serializable {
    private Long corPosId;

    private Long depId;

    private Long jobId;

    private static final long serialVersionUID = 1L;

    public Long getCorPosId() {
        return corPosId;
    }

    public void setCorPosId(Long corPosId) {
        this.corPosId = corPosId;
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
}