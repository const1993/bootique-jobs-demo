package io.bootique.linkrest.demo;

import io.bootique.job.BaseJob;
import io.bootique.job.JobMetadata;
import io.bootique.job.runnable.JobResult;

import java.util.Map;

public class SimpleJob1 extends BaseJob {

    public SimpleJob1() {
        // Pass metadata object to the super constructor. Configure metadata to use a custom job name.
        super(JobMetadata.build("job1"));
    }

    @Override
    public JobResult run(Map<String, Object> params) {

        // in a real job here you would implement your logic
        try {
            Thread.sleep(1100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return JobResult.success(getMetadata());
    }
}
