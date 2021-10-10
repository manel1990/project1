package datastucture;

import java.util.*;

public class UesHashMap {

    public static void main(String[] args) {
        Map<String,String> personalInfo =new HashMap<>();

        personalInfo.put("first name","john");
        personalInfo.put("last name","doe");
        personalInfo.put("cellphone","3213453290");
        personalInfo.put("email address","joedoe@gmail.com");
        System.out.println(personalInfo.get("cellphone"));

        List<String> citiesOfUSA =new ArrayList<>();
        citiesOfUSA.add("NYC");
        citiesOfUSA.add("LA");
        citiesOfUSA.add("Miami");

        List<String> citiesOfCANADA =new ArrayList<>();
        citiesOfCANADA.add("toronto");
        citiesOfCANADA.add("monteal");
        citiesOfCANADA.add("ottawa");

        List<String> citiesOfENGLAND =new ArrayList<>();
        citiesOfENGLAND.add("london");
        citiesOfENGLAND.add("manchester");
        citiesOfENGLAND.add("leeds");
        Map<String,List<String>>map=new HashMap<>();
        map.put("USA",citiesOfUSA);
        map.put("CANADA",citiesOfCANADA);
        map.put("ENGLAND",citiesOfENGLAND);

        System.out.println(map.get("USA"));
        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+""+entry.getValue());
        }




    }
}
