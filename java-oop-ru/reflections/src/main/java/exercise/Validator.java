package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// BEGIN
public class Validator {
    public static List<String> validate(Address address){
        List<String> list = new ArrayList<>();
        for (Field field: address.getClass().getDeclaredFields()){
            if (field.isAnnotationPresent(NotNull.class)){
                field.setAccessible(true);
                try {
                    var value = field.get(address);
                    if (value == null)
                        list.add(field.getName());

                }catch (IllegalAccessException e){
                    System.out.println("error");
                }

            }
        }
        return list;
    }

    public static Map<String, List<String>> advancedValidate(Address address){
        var map = new  HashMap<String, List<String>>();
        String value = "";
        for (Field field: address.getClass().getDeclaredFields()){
            var lst = new ArrayList<String>();
            field.setAccessible(true);

            try {
                value  = (String) field.get(address);
            }catch (IllegalAccessException e) {
                System.out.println("Error");
            }

            if (field.isAnnotationPresent(NotNull.class)){
                if (value == null){
                    lst.add("can not be null");
                }
            }

            if (field.isAnnotationPresent(MinLength.class)){
                MinLength minLengthInfo = field.getAnnotation(MinLength.class);
                var param = minLengthInfo.minLength();
                if (value != null){
                    if (param > value.length()){
                        lst.add("length less than " + param);
                    }
                }
            }
            map.put(field.getName(), lst);
        }

        return map;
    }
}
// END
