package com.fun.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * Created by Ira on 3/17/2017.
 */
public class EchoMojo extends AbstractMojo {

    private Object message;

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info( message.toString() );
    }
}
