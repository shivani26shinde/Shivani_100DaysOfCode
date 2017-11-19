import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.net.*;
import com.google.gson.*;


public class SortData {
    static int totalPages = 0;
    static String[] getMovieTitles(String substr) throws IOException{
		
        String[] array;
        StringBuilder sb= new StringBuilder();
        sb.append("https://jsonmock.hackerrank.com/api/movies/search/?Title=");
        sb.append(substr);
        String s = sb.toString();
        URL url = new URL(s);
        HttpURLConnection connect = (HttpURLConnection) url.openConnection();
        connect.setRequestMethod("GET");
        int resCode = connect.getResponseCode();
		
        if(resCode == 200){	
           BufferedReader br = new BufferedReader(new InputStreamReader(connect.getInputStream()));
            String line;
			
            while((line=br.readLine())!=null){	
                JsonObject json = new Gson().fromJson(line, JsonObject.class);
                String tot = json.get("total_pages").getAsString();
                totalPages = Integer.parseInt(tot);
                JsonArray jarray = json.getAsJsonArray("data");
				
                for(int j=0;j<jarray.length;j++){		
                    json = jarray.get(j).getAsJsonObject();
                    String result = json.get("Title").toString();
                    System.out.println(result);
                }
            } 
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

