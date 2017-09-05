package com.marcinjc.kolekcje;

import java.util.*;

public class Lekcja15 {
    public static void main(String[] args) {
        List<String> listWithNames = new LinkedList<>();
        listWithNames.add("Piotrek");
        listWithNames.add("Krzysiek");

        List<String> otherListWithNames = new LinkedList<>();
        otherListWithNames.add("Marek");
        otherListWithNames.addAll(listWithNames);
        otherListWithNames.add("Marek");

        System.out.println(otherListWithNames.contains("Marek"));
        System.out.println(otherListWithNames.get(0));
        System.out.println(otherListWithNames.isEmpty());
        System.out.println(otherListWithNames.indexOf("Marek"));
        System.out.println(otherListWithNames.lastIndexOf("Marek"));

        System.out.println("");
        System.out.println("");

        Set<String> setWithNames = new HashSet<>();
        setWithNames.add("Marcin");
        setWithNames.add("Marek");
        setWithNames.add("Marcin");

        Set<String> otherSet = new HashSet<>();
        otherSet.add("Zenon");
        otherSet.add("Marek");

        setWithNames.addAll(otherSet);

        System.out.println(setWithNames.isEmpty());
        System.out.println(setWithNames.size());
        System.out.println(setWithNames.contains("Marcin"));
        System.out.println(setWithNames.remove("Janusz"));

        System.out.println("");
        System.out.println("");

        Map<String, String> pairsMap = new HashMap<>();
        pairsMap.put("Marcin", "Adela");
        pairsMap.put("Marek", "Magda");

        Map<String, String> otherPairsMap = new HashMap<>();
        otherPairsMap.put("Marek", "Ewa");
        otherPairsMap.put("Adam", "Ewa");

        pairsMap.putAll(otherPairsMap);

        System.out.println(pairsMap.get("Marek"));
        System.out.println(pairsMap.remove("Marek"));
        System.out.println(pairsMap.size());
        System.out.println(pairsMap.isEmpty());
        System.out.println(pairsMap.containsKey("Jan"));
        System.out.println(pairsMap.containsValue("Adela"));

        System.out.println("");
        System.out.println("");

        List<String> sampleList = new ArrayList<>();
        sampleList.add("Marcin");
        sampleList.add("Adela");
        sampleList.add("Marek");
        sampleList.add("Magda");

        System.out.println("Iterowanie po liscie (foreach)");
        for(String item : sampleList) {
            System.out.println(item);
        }

        System.out.println("Iterowanie po liscie (for)");
        for(int index = 0; index < sampleList.size(); index++) {
            System.out.println(sampleList.get(index));
        }

        System.out.println("");
        System.out.println("");

        Set<String> sampleSet = new HashSet<>();
        sampleSet.add("Marcin");
        sampleSet.add("Adela");
        sampleSet.add("Marek");
        sampleSet.add("Magda");

        System.out.println("Iterowanie po zbiorze");
        for(String item : sampleSet) {
            System.out.println(item);
        }

        System.out.println("");
        System.out.println("");

        Map<String, String> sampleMap = new HashMap<>();
        sampleMap.put("Marek", "Magda");
        sampleMap.put("Marcin", "Adela");

        System.out.println("Iterowanie po wartosciach");
        for(String value : sampleMap.values()) {
            System.out.println(value);
        }

        System.out.println("Iterowanie po kluczach i pobieranie wartosci");
        for(String key : sampleMap.keySet()) {
            String value = sampleMap.get(key);
            System.out.println(key + ": " + value);
        }

        System.out.println("Iterowanie po kluczach i wartosciach");
        for(Map.Entry<String, String> entry : sampleMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
