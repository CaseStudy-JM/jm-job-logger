package com.payoneer.cs.job;

import org.springframework.stereotype.Component;

import com.payoneer.cs.client.Job;
import com.payoneer.cs.error.JobException;

@Component
public class LoggingJob extends Job {

    @Override
    protected void process(String jobId, String... args) throws JobException {
        this.log(jobId, "Hello Job");
    }
}
