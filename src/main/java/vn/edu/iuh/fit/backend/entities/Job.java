package vn.edu.iuh.fit.backend.entities;

public class Job {
    private int jobId;
    private String description;

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Job() {
    }

    public Job(int jobId) {
        this.jobId = jobId;
    }

    public Job(int jobId, String description) {
        this.jobId = jobId;
        this.description = description;
    }
}
