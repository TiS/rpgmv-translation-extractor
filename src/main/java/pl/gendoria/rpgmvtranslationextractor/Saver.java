package pl.gendoria.rpgmvtranslationextractor;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import org.apache.commons.io.FileUtils;

/**
 *
 */
public class Saver {
    private File output;

    public Saver(File output) {
        this.output = output;
    }
    
    public void save(TreeMap<String, String> contents) throws IOException {
        TreeMap<String, String> current = parseCurrent();
        
        for (Map.Entry<String, String> next : current.entrySet()) {
            if (contents.containsKey(next.getKey())) {
                contents.put(next.getKey(), next.getValue());
            }
        }
        
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create()
                ;
        
        FileUtils.writeStringToFile(output, gson.toJson(contents), "UTF-8"); //NOI18N
    }
    
    private TreeMap<String, String> parseCurrent() throws IOException {
        TreeMap<String, String> current = new TreeMap<>();
        
        if (output.isFile()) {
            String fileContents = FileUtils.readFileToString(output, "UTF-8"); //NOI18N
            Gson gson = new Gson();
            current = gson.fromJson(fileContents, current.getClass());
        }
        
        return current;
    }
}
