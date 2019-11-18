package com.pluralsight.springbatch.patientbatchloader.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to Patient Batch Loader.
 * <p>
 * Properties are configured in the application.yml file.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {
    private String inputPath = "C:/Users/bhupe/IdeaProjects/spring/spring_batch/patient-batch-loader-start/data";

    public String getInputPath(){
        return this.inputPath;
    }

    public void setInputPath(String inputPath){
        this.inputPath = inputPath;
    }


}
