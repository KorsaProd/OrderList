package com.company;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    private static JSONArray jsonData;
    private static String dataFile = "src/main/java/LIB/example.json";
    private static Order order;

    public static void main(String[] args) throws Exception {
        JSONParser parser = new JSONParser();
        jsonData = (JSONArray) parser.parse(getJsonFile());
        parseItems(jsonData);
        System.out.println("event id: " + order.getEventID()
                + "\nitems:  \n\t count: "
                + ((long) order.getCount() - (long) order.getReturnCount())
                + "\n\t item id: " + order.getItemID());
    }

    private static void parseItems(JSONArray data) throws Exception {
        long maxValue = 0;

            for (int j = 0; j < data.size(); j++) {
                JSONObject objects = (JSONObject) data.get(j);
                if (maxValue <= (long) objects.get("event_id")) {
                    maxValue = (long) objects.get("event_id");
                    if (objects.get("event_id").equals(maxValue) && objects.get("status").equals("OK")) {
                        order = new Order(objects.get("event_id"), objects.get("item_id"), objects.get("count"),
                                objects.get("return_count"), objects.get("order_id"), objects.get("status"));
                    } else throw new Exception("Event ID is not maximum or status is CANCELED");
                    break;
                }
            }
        }


    private static String getJsonFile()
    {
        StringBuilder builder = new StringBuilder();
        try {
            List<String> lines = Files.readAllLines(Paths.get(dataFile));
            lines.forEach(line -> builder.append(line));
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return builder.toString();
    }
}
