# Builder Design Pattern
Suppose there is more than one field belonging to an object in object-oriented programming. 
```
public class Country {
    private String id;
    private String name;
    private String nativeName;
    private int phoneCode;
    private String continent;
    private String capital;
    private String currency;
    private List<String> languages;
}    
```

When creating the object, we pass the objects that we do not want to give a value as null.
```

Country country1 = new Country("TR", "Turkey", null, 0, null, null, null, null);

```

As the number of parameters increases, the readability will decrease. The probability of error will increase. With the Builder design pattern, if you want to set a field to null, you don't need to do anything.

```
Country country = Country.builder()
        .id("TR")
        .name("Turkey")
        .build();
```
