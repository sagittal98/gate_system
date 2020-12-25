package com.jyyd.gate.pojo;

import java.io.Serializable;

public class DbJob implements Serializable {
    private Long jobId;

    private String jobName;


    @Override
    public String toString() {
        return "{" + "\"jobId\":" +
                jobId +
                ",\"jobName\":\"" +
                jobName + '\"' +
                '}';
    }

    private static final long serialVersionUID = 1L;

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }
}