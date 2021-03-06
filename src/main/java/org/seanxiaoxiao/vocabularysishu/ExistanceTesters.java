package org.seanxiaoxiao.vocabularysishu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.gson.Gson;

public class ExistanceTesters {

    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new FileReader("/Users/xiaoxiao/Downloads/GRE分类词汇记忆——GRE红宝书2005版.txt"));
//        String line = null;
//        List<String> greList = Utils.getVocabularyList();
//        while ((line = br.readLine()) != null) {
//            line = line.split(" ")[0];
//            Pattern pattern = Pattern.compile("[\u4E00-\u9FA5|、|，]*");
//            Matcher matcher = pattern.matcher(line);
//            if (!matcher.matches() && !greList.contains(line)) {
//                System.out.println(line);
//            }
//        }
//        
//        System.out.println(Utils.getGMATVocabularyList().size());
        checkSummary();
    }
    
    
    public static void checkSummary() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/xiaoxiao/workspace/vocabulary-sishu-utils/src/main/resources/cet6/target/Vocabularies.txt"));
        String line = null;
        Gson gson = new Gson();
        while ((line = br.readLine()) != null) {
            Vocabulary vocabulary = gson.fromJson(line, Vocabulary.class);
            if (vocabulary.getSummary() == null || vocabulary.getSummary().equals("")) {
                System.out.println(vocabulary.getSpell());
            }
        }
        br.close();
    }
}
