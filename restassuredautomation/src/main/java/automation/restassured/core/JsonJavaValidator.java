package automation.restassured.core;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.MatcherAssert.assertThat;

public class JsonJavaValidator {
    public void validateSchema(String pathToSchemaFile, String responseToBeValidated) {
        assertThat(responseToBeValidated, matchesJsonSchemaInClasspath(pathToSchemaFile));
    }
}
