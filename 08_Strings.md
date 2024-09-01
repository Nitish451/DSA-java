# Declaration
```
String name = "Nitish";
```

# Taking Input
```
Scanner sc = new Scanner(System.in);
String name = sc.next();
```
=> whenever you want to take a word as input then use `sc.next()` otherwise for more than one word write `sc.nextLine()`

# Concatenation ( Joining 2 Strings )
```
String firstName = "Nitish";
String lastName = "Kumar";
String fullName = firstName + " " + lastName;
System.out.print(fullName);
```

# Length of a String
```
String firstName = "Nitish";
String lastName = "Kumar";
String fullName = firstName + " " + lastName;
System.out.print(fullName.length());
```

# Access characters of a String
```
String firstName = "Nitish";
String lastName = "Kumar";
String fullName = firstName + " " + lastName;
System.out.print(fullName.length());
for(int i=0; i<fullName.length(); i++) {
    System.out.println(fullName.charAt(i));
}
```

# Compare 2 strings
```


public class Strings {
   public static void main(String args[]) {
       String name1 = "Tony";
       String name2 = "Tony";


       if(name1.equals(name2)==0) {
           System.out.println("They are the same string");
       } else {
           System.out.println("They are different strings");
       }


       //DO NOT USE == to check for string equality
       //Gives correct answer here But some time give incorrect
       if(name1 == name2) {
           System.out.println("They are the same string");
       } else {
           System.out.println("They are different strings");
       }


       //Gives incorrect answer here
       if(new String("Tony") == new String("Tony")) {
           System.out.println("They are the same string");
       } else {
           System.out.println("They are different strings");
       }
      
   }
}
```

# Access to substring
```
public class String{
    public static void main(string args[]){
String sentence="TonyStark";
String name=sentence.substring(4,sentence.length());
System.out.println(name);

    }
}
```




**NOTE: JAVA STRINGS ARE IMMUTABLE**