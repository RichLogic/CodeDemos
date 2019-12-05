package handleJson;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.io.*;
import java.util.List;
import java.util.Map;

public class TestJson {

    @Test
    public void test() {
        String filename = "/Users/richlogic/Desktop/supplier_all.json";
        String resultName = "/Users/richlogic/Desktop/result.csv";

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
            String line = br.readLine();
            List<Map> json = JSON.parseArray(line, Map.class);

            BufferedWriter out = new BufferedWriter(new FileWriter(resultName));

            json.forEach(x -> {

                if (x.get("smgSupCollectionList") != null) {

                    List<Map<String, Object>> list = (List<Map<String, Object>>) x.get("smgSupCollectionList");

                    String supId = "";
                    String clctId = "";
                    try {
                        supId = (String) list.get(0).get("supId");
                        clctId = (String) list.get(0).get("clctId");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
//                    String address = (String) x.get("supRegistrationAddress");
                    System.out.println(supId + "|" + clctId);

                    try {
                        out.write(supId + "|" + clctId);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            });

            out.flush();
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
