package Utility;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Reader {
    public  static class ReadTasks {
        public static Map<String,String> getAllTasks(String pathname)  {
            File file = new File(pathname);
            String result = null;
            result = readFile(file);
            String[] AlgoTasksDesc = result.split(Pattern.quote("$%$%$%$%$%$"));
            ArrayList<String> titles = new ArrayList<>();
            Map<String, String> map = new HashMap<>();


            for (int i = 0; i <AlgoTasksDesc.length; i++) {
                String[] lines = AlgoTasksDesc[i].split(System.getProperty("line.separator"));
                titles.add(lines[0]);
                System.out.println(AlgoTasksDesc[i]);
            }
            for (int i = 0; i <AlgoTasksDesc.length; i++) {
                String description = AlgoTasksDesc[i];
                String title = titles.get(i);
                map.put(title,description);
            }
            return  map;
            //System.out.println(result);
        }

        public  static String readFile(File file)  {
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            String line = null;
            StringBuilder  stringBuilder = new StringBuilder();
            String ls = System.getProperty("line.separator");

            try {
                while((line = reader.readLine()) != null) {
                    stringBuilder.append(line);
                    stringBuilder.append(ls);

                }


            } catch(IOException ex){
                ex.getMessage();
            }
            finally {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return stringBuilder.toString();
        }
    }

}
