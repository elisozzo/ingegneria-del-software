import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main1 {
    public static void main(String[] args) throws IOException {
        String data=new String(Files.readAllBytes(Paths.get("demo1.json")));

        JSONArray jsonArray=new JSONArray(data);
        for(int i=0; i<jsonArray.length(); i++){
            // JSONObject object=jsonArray.getJSONObject(i);

            String str=jsonArray.get(i).toString();
            JSONObject object1=new JSONObject(str);

            String name=object1.getString("name");
            System.out.println("name: " + name);

            JSONArray qServiceTypes=object1.getJSONArray("qServiceTypes");
            System.out.println("qServiceTypes: " + qServiceTypes);

            JSONArray services=object1.getJSONArray("services");
            int j=0;
            while(j<services.length()){
                JSONObject serviceName=services.getJSONObject(j);
                String srvName=serviceName.getString("serviceName");
                System.out.println("serviceName: " + srvName);

                    JSONObject currentStatus=services.getJSONObject(j);
                    String crrStatus=currentStatus.getString("currentStatus");
                    System.out.println("currentStatus: " + crrStatus);


                ++j;
            }


            System.out.println(" ");

        }


    }
}
