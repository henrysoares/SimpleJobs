package com.henrysoares.core.job.domain;

/**
 * Interface that represents the job.
 * @param <I> The input data.
 * @param <O> the output processed data.
 */
public interface Job <I,O> {

    /**
     * Represents the entrypoint of the job.
     */
    void entryPoint();

    /**
     * Method responsible for acquiring the register.
     * @return the register to be processed.
     */
    I getRegister();

    /**
     * Method responsible for processing the register.
     * @param register the register to be processed.
     * @return The processed register.
     */
    O process(I register);

    /**
     * Method responsible for returning the job's name;
     * @return the name of the job.
     */
    String getJobName();

}
