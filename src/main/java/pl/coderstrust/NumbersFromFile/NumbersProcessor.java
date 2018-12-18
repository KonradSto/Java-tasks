package pl.coderstrust.NumbersFromFile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersProcessor {
    public String processLine(String line) {
        line = line.replaceAll("[^0-9]+", " ");
        List<String> stringList = new ArrayList<>(Arrays.asList(line.split(" ")));
        stringList.remove(0);
        List<Integer> integersList = new ArrayList<>(convertsStringArrayListToInteger(stringList));
        StringBuilder builder = buildsFinalEquation(integersList);
        return builder.toString();
    }

    private StringBuilder buildsFinalEquation(List<Integer> list) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < list.size() - 1; i++) {
            builder.append(list.get(i)).append("+");
        }
        builder.append(list.get(list.size() - 1));
        builder.append("=").append(calculatesSumOfNumbersInList(list));
        return builder;
    }

    private int calculatesSumOfNumbersInList(List<Integer> integersList) {
        int sum = 0;
        for (int i = 0; i < integersList.size(); i++) {
            sum += integersList.get(i);
        }
        return sum;
    }

    private List<Integer> convertsStringArrayListToInteger(List<String> strList) {
        List<Integer> intList = new ArrayList<>(strList.size());
        for (String numberAsString : strList) {
            intList.add(Integer.valueOf(numberAsString));
        }
        return intList;
    }
}
