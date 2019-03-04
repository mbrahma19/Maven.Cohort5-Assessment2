package rocks.zipcode.assessment2.collections;

import java.util.Map;
import java.util.TreeMap;

/**
 * Use a map to solve
 */
public class MonthConversion {

    private TreeMap<Integer,String> monthList;

    public MonthConversion(){
        monthList = new TreeMap<>();
    }

    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        monthList.put(monthNumber,monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        if(!isValidNumber(monthNumber)){
            return null;
        }
        else {
            return monthList.get(monthNumber);
        }
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     *///TODO get the final test working
    public int getNumber(String monthName) {
        Integer numberToreturn = null;
        if(isValidMonth(monthName)){
            for(Map.Entry<Integer, String> e : monthList.entrySet()){
                if(monthName.equals(e.getValue())){
                    numberToreturn =  e.getKey();
                }
            }
        }
        return numberToreturn;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return monthList.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        Boolean value = false;
        for(String s : monthList.values()){
            if(monthName.endsWith(s)){
               value = true;
            }
        }
        return value;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return monthList.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        monthList.put(monthNumber,monthName);

    }
}
