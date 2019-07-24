package cn.chenzw.maven.example.plugin.mojo;

import org.apache.maven.model.Resource;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;
import java.util.List;

/**
 * 参数
 */
@Mojo(name = "count", defaultPhase = LifecyclePhase.COMPILE)
public class CountMojo extends AbstractMojo {

    @Parameter(defaultValue = "${basedir}")
    private File baseDir;

    @Parameter(defaultValue = "${project.build.resources}", readonly = true, required = true)
    private List<Resource> resources;

    @Parameter(defaultValue = "${project.build.sourceDirectory}", required = true, readonly = true)
    private File sourceDir;

    @Parameter(defaultValue = "${project.build.testResources}", readonly = true, required = true)
    private List<Resource> testResources;

    @Parameter(defaultValue = "${project.build.testSourceDirectory}", readonly = true, required = true)
    private File testSourceDir;

    @Parameter(property = "count.level", defaultValue = "5")
    private Integer level;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().debug("- baseDir:" + baseDir);
        getLog().debug("- resources:" + resources);
        getLog().debug("- sourceDir:" + sourceDir);
        getLog().debug("- testResources:" + testResources);
        getLog().debug("- testSourceDir:" + testSourceDir);
        getLog().warn("- level:" + level);
    }
}
