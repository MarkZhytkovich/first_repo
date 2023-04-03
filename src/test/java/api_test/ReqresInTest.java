package api_test;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import models.CreateUserRequestBody;
import models.RegisterRequestBody;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestDataGenerator;

import java.io.File;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class ReqresInTest {
    String BASE_URI = "https://reqres.in/";

    @BeforeClass
    public void setUpLogging() {
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }

    @Test
    public void getListUsersTest() {
        JsonPath userExpectedResponse = new JsonPath(new File("src/test/resources/listUsersScheme.json"));
        given()
                .baseUri(BASE_URI)
                .when()
                .get("/api/users")
                .then()
                .statusCode(200)
                .body(matchesJsonSchema(new File("src/test/resources/listUsersScheme.json")));
    }

    @Test
    public void getSingleUserTest() {
        JsonPath userExpectedResponse = new JsonPath(new File("src/test/resources/singleUserScheme.json"));
        given()
                .baseUri(BASE_URI)
                .when()
                .get("/api/users/2")
                .then()
                .statusCode(200)
                .body(matchesJsonSchema(new File("src/test/resources/singleUserScheme.json")));
    }

    @Test
    public void getListResourceTest() {
        JsonPath userExpectedResponse = new JsonPath(new File("src/test/resources/listResourceScheme.json"));
        given()
                .baseUri(BASE_URI)
                .when()
                .get("/api/unknown")
                .then()
                .statusCode(200)
                .body(matchesJsonSchema(new File("src/test/resources/listResourceScheme.json")));
    }

    @Test
    public void getSingleResourceTest() {
        JsonPath userExpectedResponse = new JsonPath(new File("src/test/resources/singleResourceScheme.json"));
        given()
                .baseUri(BASE_URI)
                .when()
                .get("/api/unknown/2")
                .then()
                .statusCode(200)
                .body(matchesJsonSchema(new File("src/test/resources/singleResourceScheme.json")));
    }

    @Test
    public void createUserTest() {
        CreateUserRequestBody createUser = CreateUserRequestBody
                .builder()
                .name(TestDataGenerator.generateUsername())
                .job(TestDataGenerator.generateLiteralPassword())
                .build();
        JsonPath userExpectedResponse = new JsonPath(new File("src/test/resources/createUserScheme.json"));
        given()
                . baseUri(BASE_URI)
                .contentType(ContentType.JSON)
                .body(createUser)
                .when()
                .post("/api/users")
                .then()
                .statusCode(201)
                .body(matchesJsonSchema(new File("src/test/resources/createUserScheme.json")));
    }

    @Test
    public void updateUserUsingPutTest() {
        CreateUserRequestBody updateUser = CreateUserRequestBody
                .builder()
                .name(TestDataGenerator.generateUsername())
                .job(TestDataGenerator.generateLiteralPassword())
                .build();
        JsonPath userExpectedResponse = new JsonPath(new File("src/test/resources/updateUserScheme.json"));
        given()
                .baseUri(BASE_URI)
                .contentType(ContentType.JSON)
                .body(updateUser)
                .when()
                .put("/api/users/2")
                .then()
                .statusCode(200)
                .body(matchesJsonSchema(new File("src/test/resources/updateUserScheme.json")));
    }

    @Test
    public void updateUserUsingPatchTest() {
        CreateUserRequestBody updateUser = CreateUserRequestBody
                .builder()
                .name(TestDataGenerator.generateUsername())
                .job(TestDataGenerator.generateLiteralPassword())
                .build();
        JsonPath userExpectedResponse = new JsonPath(new File("src/test/resources/updateUserScheme.json"));
        given()
                .baseUri(BASE_URI)
                .contentType(ContentType.JSON)
                .body(updateUser)
                .when()
                .patch("/api/users/2")
                .then()
                .statusCode(200)
                .body(matchesJsonSchema(new File("src/test/resources/updateUserScheme.json")));
    }

    @Test
    public void deleteUserTest() {
        given()
                .baseUri(BASE_URI)
                .when()
                .delete("/api/users/2")
                .then()
                .statusCode(204);
    }

    @Test
    public void registerSuccessfulTest() {
        RegisterRequestBody userRegister = RegisterRequestBody
                .builder()
                .email("eve.holt@reqres.in")
                .password("pistol")
                .build();
        JsonPath userExpectedResponse = new JsonPath(new File("src/test/resources/registerSuccessfulScheme.json"));
        given()
                .baseUri(BASE_URI)
                .contentType(ContentType.JSON)
                .body(userRegister)
                .when()
                .post("/api/register")
                .then()
                .statusCode(200)
                .body(matchesJsonSchema(new File("src/test/resources/registerSuccessfulScheme.json")));
    }

    @Test
    public void loginSuccessfulTest() {
        RegisterRequestBody userLogin = RegisterRequestBody
                .builder()
                .email("eve.holt@reqres.in")
                .password("pistol")
                .build();
        JsonPath userExpectedResponse = new JsonPath(new File("src/test/resources/loginSuccessfulScheme.json"));
        given()
                .baseUri(BASE_URI)
                .contentType(ContentType.JSON)
                .body(userLogin)
                .when()
                .post("/api/register")
                .then()
                .statusCode(200)
                .body(matchesJsonSchema(new File("src/test/resources/loginSuccessfulScheme.json")));
    }
}
