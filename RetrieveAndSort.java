// Hackerrank Challenege - Retrieve data and return in sorted way

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.net.*;
import com.google.gson.*;


public class RetrieveAndSort {

	static int total = 0;
    static URL url;
    static BufferedReader in;
    static JsonObject json;
    static ArrayList<String> list = new ArrayList<>();
	
    static String[] getMovieTitles(String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("https://jsonmock.hackerrank.com/api/movies/search/?Title=");
        sb.append(str);
        url = new URL(sb.toString());
        in = new BufferedReader(
                new InputStreamReader(url.openStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null){
            json = new Gson().fromJson(inputLine, JsonObject.class);
            total = Integer.parseInt(json.get("total_pages").toString());
        }
        sb.append("&page=");
        for(int i=1;i<=total;i++){
            String temp = sb.toString() + i;
            url = new URL(temp);
            in = new BufferedReader(
                    new InputStreamReader(url.openStream()));
            String line;
            while ((line = in.readLine()) != null) {
                json = new Gson().fromJson(line, JsonObject.class);
                JsonArray jarray = json.getAsJsonArray("data");
                for(int j=0;j<jarray.size();j++){
                    json = jarray.get(j).getAsJsonObject();
                    String result = json.get("Title").toString().replaceAll("\"", "");
                    list.add(result);
                }
            }
        }
        Collections.sort(list);
        String[] array = new String[list.size()];
        for (int i=0;i<list.size();i++){
            array[i] = list.get(i);
        }
         return array;
    }
	public static void main(String[] args) throws IOException{
		
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        String[] res;
        String _substr;
		
        try {
            _substr = in.nextLine();
        } catch (Exception e) {
            _substr = null;
        }
        
        res = getMovieTitles(_substr);
        for(int res_i=0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }
        
        bw.close();
    }
}