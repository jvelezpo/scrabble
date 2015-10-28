package com.viajala.sebastian.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

@Component
public class Sowpods
{
    HashMap<String, String> sowpodAnagramMap = new HashMap<String, String>();
    public static final String fileName="sowpods.txt";

    public Sowpods() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new ClassPathResource(fileName).getInputStream()))) {	
        	
            String word;
            while ((word = br.readLine()) != null) {
                sowpodAnagramMap.put(sortWord(word), word);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String sortWord(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    private String fetchSowpodWordFor(String key) {
        return sowpodAnagramMap.get(key);
    }

    public ArrayList<String> getValidWords( String word ) {
        ArrayList<String> validWords = new ArrayList<String>();
        List<String> powerSets = new ArrayList<String>();

        powerSets = generatePowerSets(word);
        for ( String s: powerSets ) {
            String key = sortWord(s);
            validWords.add(fetchSowpodWordFor(key));
        }
        return validWords;
    }

    private List<String> generatePowerSets(String word) {
        List<String> powerSets = new ArrayList<>();
        return combo("", word, powerSets);
    }

    private List<String> combo(String prefix, String s, List<String> powerSets) {
        int N = s.length();

        if ( prefix.length() > 1 ) {
            powerSets.add(prefix);
        }

        for (int i = 0 ; i < N ; i++) {
            combo(prefix + s.charAt(i), s.substring(i+1), powerSets);
        }
        return powerSets;
    }
}
