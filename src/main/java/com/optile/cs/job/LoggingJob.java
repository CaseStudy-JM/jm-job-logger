package com.optile.cs.job;

import com.optile.cs.client.Job;
import com.optile.cs.error.JobException;
import org.springframework.stereotype.Component;

@Component
public class LoggingJob extends Job {

    @Override
    protected void process(String jobId, String... args) throws JobException {
        this.log(jobId, "Hello Job");
    }
}
