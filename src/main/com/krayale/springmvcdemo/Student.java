package krayale.springmvcdemo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.LinkedHashMap;
import java.util.List;

@Data
public class Student {
    private String  firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private String[] operatingSystems = new String[3];

    private LinkedHashMap<String,String> countryOptions;

    public Student(){
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("BR","Brazil");
        countryOptions.put("FR","France");
        countryOptions.put("RU","Russia");
        countryOptions.put("EG","Egypt");
    }
}
