import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        String data=new String(Files.readAllBytes(Paths.get("./demo.json")));

        JSONArray jsonArray=new JSONArray(data);
        for(int i=0; i<jsonArray.length(); i++){
           // JSONObject object=jsonArray.getJSONObject(i);

            String str=jsonArray.get(i).toString();
            JSONObject object1=new JSONObject(str);

            String countryCode=object1.getString("countryCode");
            String countryName=object1.getString("countryName");
            System.out.println("countryCode: " + countryCode);
            System.out.println("countryName: " + countryName);
            System.out.println(" ");

        }


    }
}
