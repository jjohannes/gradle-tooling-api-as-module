package tapi.as.module;

import org.gradle.tooling.GradleConnector;
import org.gradle.tooling.ProjectConnection;
import org.gradle.tooling.model.GradleProject;

import java.io.File;

public class App {

    public static void main(String[] args) {
        ProjectConnection conn = GradleConnector.newConnector()
                .forProjectDirectory(new File("/path/to/project"))
                .connect();
        try (conn) {
            var pj = conn.getModel(GradleProject.class);
            System.out.println(pj.getName());
        }
    }
}
