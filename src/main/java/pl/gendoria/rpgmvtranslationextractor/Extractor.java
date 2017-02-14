package pl.gendoria.rpgmvtranslationextractor;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.SuffixFileFilter;

/**
 *
 */
public class Extractor {
    private final File inputFolder;
    private final String keyFormat;
    private final Pattern keyRegexp;

    public Extractor(File inputFolder, String keyFormat) {
        this.inputFolder = inputFolder;
        this.keyFormat = keyFormat;
        String[] splitPattern = keyFormat.split("\\{key\\}"); //NOI18N
        this.keyRegexp = Pattern.compile(Pattern.quote(splitPattern[0]) + "([\\w\\.]+?)" + (splitPattern.length > 1 ? Pattern.quote(splitPattern[1]) : "")); //NOI18N
    }
    
    public TreeMap<String, String> extract() {
        System.out.println(java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("pl/gendoria/rpgmvtranslationextractor/Extractor").getString("Extractor.scanning"), new Object[] {inputFolder.getAbsolutePath()}));
        System.out.println();
        
        Iterator<File> files = FileUtils.iterateFiles(inputFolder, new SuffixFileFilter(".json"), DirectoryFileFilter.DIRECTORY); //NOI18N
        TreeMap<String, String> allMatches = new TreeMap<>();
        
        while (files.hasNext()) {
            File file = files.next();
            System.out.println(java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("pl/gendoria/rpgmvtranslationextractor/Extractor").getString("Extractor.file"), new Object[] {file.getAbsoluteFile()}));
            try {
                Matcher matcher = this.keyRegexp.matcher(FileUtils.readFileToString(file, "UTF-8")); //NOI18N
                while (matcher.find()) {
                    if (matcher.group(1).length() == 0) {
                        continue;
                    }
                    
                    System.out.println(java.text.MessageFormat.format(java.util.ResourceBundle.getBundle("pl/gendoria/rpgmvtranslationextractor/Extractor").getString("Extractor.key"), new Object[] {matcher.group(1)}));
                    allMatches.put(matcher.group(1), "__TRANSLATE__"); //NOI18N
                }
            } catch (IOException ex) {
                Logger.getLogger(Extractor.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println();
        }
        
        return allMatches;
    }
}
