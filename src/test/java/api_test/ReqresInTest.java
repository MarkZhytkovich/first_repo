package api_test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import models.CreateUserRequestBody;
import models.RegisterRequestBody;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestDataGenerator;

import static io.restassured.RestAssured.given;

public class ReqresInTest {
    String BASE_URI = "https://reqres.in/";

    @BeforeClass
    public void setUpLogging() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }

    @Test
    public void getListUsersTest() {
        given()
                .baseUri(BASE_URI)
                .when()
                .get("/api/users")
                .then()
                .statusCode(200);
    }

    @Test
    public void getSingleUserTest() {
        given()
                .baseUri(BASE_URI)
                .when()
                .get("/api/users/2")
                .then()
                .statusCode(200);
    }

    @Test
    public void getListResourceTest() {
        given()
                .baseUri(BASE_URI)
                .when()
                .get("/api/unknown")
                .then()
                .statusCode(200);
    }

    @Test
    public void getSingleResourceTest() {
        given()
                .baseUri(BASE_URI)
                .when()
                .get("/api/unknown/2")
                .then()
                .statusCode(200);
    }

    @Test
    public void createUserTest() {
        CreateUserRequestBody createUser = CreateUserRequestBody
                .builder()
                .name(TestDataGenerator.generateUsername())
                .job(TestDataGenerator.generateLiteralPassword())
                .build();
        given()
                . baseUri(BASE_URI)
                .contentType(ContentType.JSON)
                .body(createUser)
                .when()
                .post("/api/users")
                .then()
                .statusCode(201);
    }

    @Test
    public void updateUserUsingPutTest() {
        CreateUserRequestBody updateUser = CreateUserRequestBody
                .builder()
                .name(TestDataGenerator.generateUsername())
                .job(TestDataGenerator.generateLiteralPassword())
                .build();
        given()
                .baseUri(BASE_URI)
                .contentType(ContentType.JSON)
                .body(updateUser)
                .when()
                .put("/api/users/2")
                .then()
                .statusCode(200);
    }

    @Test
    public void updateUserUsingPatchTest() {
        CreateUserRequestBody updateUser = CreateUserRequestBody
                .builder()
                .name(TestDataGenerator.generateUsername())
                .job(TestDataGenerator.generateLiteralPassword())
                .build();
        given()
                .baseUri(BASE_URI)
                .contentType(ContentType.JSON)
                .body(updateUser)
                .when()
                .patch("/api/users/2")
                .then()
                .statusCode(200);
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
        given()
                .baseUri(BASE_URI)
                .contentType(ContentType.JSON)
                .body(userRegister)
                .when()
                .post("/api/register")
                .then()
                .statusCode(200);
    }

    @Test
    public void loginSuccessfulTest() {
        RegisterRequestBody userLogin = RegisterRequestBody
                .builder()
                .email("eve.holt@reqres.in")
                .password("pistol")
                .build();
        given()
                .baseUri(BASE_URI)
                .contentType(ContentType.JSON)
                .body(userLogin)
                .when()
                .post("/api/register")
                .then()
                .statusCode(200);
    }
}
