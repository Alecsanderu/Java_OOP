package com.codecool.thehistory;

import java.util.*;

public class TheHistoryArrayList implements TheHistory {
    /**
     * This implementation should use a String ArrayList so don't change that!
     */
    private List<String> wordsArrayList = new ArrayList<>();

    @Override
    public void add(String text) {
        //TODO: check the TheHistory interface for more information
        String[] newWordsTemp = text.split("\\s+");
        for (int i = 0; i < newWordsTemp.length; i++) {
            wordsArrayList.add(newWordsTemp[i]);
        }
    }

    @Override
    public void removeWord(String wordToBeRemoved) {
        //TODO: check the TheHistory interface for more information
        wordsArrayList.removeIf(word -> word.equals(wordToBeRemoved));
    }

    @Override
    public int size() {
        //TODO: check the TheHistory interface for more information
        return wordsArrayList.size();
    }

    @Override
    public void clear() {
        //TODO: check the TheHistory interface for more information
        wordsArrayList.clear();
    }

    @Override
    public void replaceOneWord(String from, String to) {
        //TODO: check the TheHistory interface for more information
        Collections.replaceAll(wordsArrayList,from,to);


    }

    @Override
    public void replaceMoreWords(String[] fromWords, String[] toWords) {
        //TODO: check the TheHistory interface for more information
        ArrayList<String> replaced = new ArrayList<>();
        int i=0;
        while (i < wordsArrayList.size()-(fromWords.length-1)) {
            int j = 0;
            while (j < fromWords.length && wordsArrayList.get(i + j).equals(fromWords[j]))
                j++;
            if (j == fromWords.length) {
                i += j;
                for (String word : toWords)
                    replaced.add(word);
            } else {
                replaced.add(wordsArrayList.get(i));
                i++;
            }
        }
        while (i<wordsArrayList.size())
            replaced.add(wordsArrayList.get(i++));

        wordsArrayList=replaced;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String word : wordsArrayList) {
            sb.append(word).append(" ");
        }
        if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1); // last space char
        return sb.toString();
    }

}
