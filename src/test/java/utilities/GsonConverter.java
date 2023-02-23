package utilities;

import com.google.gson.Gson;
import models.UserDetailsModel;

import java.io.FileReader;
import java.io.IOException;

public class GsonConverter {

    private Gson gson = new Gson();

    public static void fromJsonToObject() {
        Gson gson = new Gson();
        try(FileReader fileReader = new FileReader("src/test/resources/userDetails.json")) {
            UserDetailsModel userDetailsModel = gson.fromJson(fileReader, UserDetailsModel.class);
            System.out.println(userDetailsModel.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        fromJsonToObject();
    }
}
