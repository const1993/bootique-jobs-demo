package org.objectstyle.bootique.jobs.services;

/**
 * A dummy service that "echos" its method argument.
 */
public class EchoService {

    public String echo(String in) {
        return "> " + in;
    }
}
