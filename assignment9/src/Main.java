import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

void main() {
    System.out.println("---------------------------------------");
//    1. Write a Java program to get the character at the given index within the String.
//
//    Sample Output:
//
//    Original String = Java Exercises!
//    The character at position 0 is J
//    The character at position 10 is i
    String qno1 = "Java Exercises!";

    System.out.println("Qno. (1)");
    System.out.println("Original String = " + qno1);
    System.out.println("The character at position 0 is " + qno1.charAt(0));
    System.out.println("The character at position 10 is " + qno1.charAt(10));

    System.out.println("---------------------------------------");

//    2. Write a Java program to get the character (Unicode code point) at the given index within the String.
//
//    Sample Output:
//
//    Original String : google.com
//    Character(unicode point) = 51
//    Character(unicode point) = 101

    String textQno02 = "google.com";

    System.out.println("Qno. (2)");
    System.out.println("Original String : " + textQno02);
    System.out.println("Character(unicode point) = " + textQno02.codePointAt(0));
    System.out.println("Character(unicode point) = " + textQno02.codePointAt(5));

    System.out.println("---------------------------------------");

//    3. Write a Java program to get the character (Unicode code point) before the specified index within the String.
//
//    Sample Output:
//
//    Original String : ramaresource.com
//    Character(unicode point) = 119
//    Character(unicode point) = 99

    String textQno3 = "ramaresource.com";

    System.out.println("Qno. (3)");
    System.out.println("Original String : " + textQno3);
    System.out.println("Character(unicode point) = " + textQno3.codePointBefore(1));
    System.out.println("Character(unicode point) = " + textQno3.codePointBefore(11));

    System.out.println("---------------------------------------");

//    4. Write a Java program to count a number of Unicode code points in the specified text range of a String.
//
//    Sample Output:
//
//    Original String : ramaresource.com
//    Codepoint count = 9

    String textQno4 = "ramaresource.com";

    System.out.println("Qno. (4)");
    System.out.println("Original String : " + textQno4);
    // Count from index 0 (included) to index 9 (excluded): "ramaresou".
    System.out.println("Codepoint count = " + textQno4.codePointCount(0, 9));

    System.out.println("---------------------------------------");

//    5. Write a Java program to compare two strings lexicographically.
//    Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.
//
//    Sample Output:
//
//    String 1: This is Exercise 1
//    String 2: This is Exercise 2
//    "This is Exercise 1" is less than "This is Exercise 2"

    String firstQno5 = "This is Exercise 1";
    String secondQno5 = "This is Exercise 2";

    System.out.println("Qno. (5)");
    System.out.println("String 1: " + firstQno5);
    System.out.println("String 2: " + secondQno5);

    // A negative result means the first string comes before the second.
    int comparisonQno5 = firstQno5.compareTo(secondQno5);

    if (comparisonQno5 < 0) {
        System.out.println("\"" + firstQno5 + "\" is less than \"" + secondQno5 + "\"");
    } else if (comparisonQno5 > 0) {
        System.out.println("\"" + firstQno5 + "\" is greater than \"" + secondQno5 + "\"");
    } else {
        System.out.println("\"" + firstQno5 + "\" is equal to \"" + secondQno5 + "\"");
    }

    System.out.println("---------------------------------------");

//    6. Write a Java program to compare two strings lexicographically, ignoring case differences.
//
//    Sample Output:
//
//    String 1: This is exercise 1
//    String 2: This is Exercise 1
//    "This is exercise 1" is equal to "This is Exercise 1"

    String firstQno6 = "This is exercise 1";
    String secondQno6 = "This is Exercise 1";

    System.out.println("Qno. (6)");
    System.out.println("String 1: " + firstQno6);
    System.out.println("String 2: " + secondQno6);

    // Compare alphabetically without considering uppercase and lowercase differences.
    int comparisonQno6 = firstQno6.compareToIgnoreCase(secondQno6);

    if (comparisonQno6 < 0) {
        System.out.println("\"" + firstQno6 + "\" is less than \"" + secondQno6 + "\"");
    } else if (comparisonQno6 > 0) {
        System.out.println("\"" + firstQno6 + "\" is greater than \"" + secondQno6 + "\"");
    } else {
        System.out.println("\"" + firstQno6 + "\" is equal to \"" + secondQno6 + "\"");
    }

    System.out.println("---------------------------------------");

//    7. Write a Java program to concatenate a given string to the end of another string.
//
//    Sample Output:
//
//    String 1: PHP Exercises and
//    String 2: Python Exercises
//    The concatenated string: PHP Exercises and Python Exercises

    String string1Qno7 = "PHP Exercises and ";
    String string2Qno7 = "Python Exercises";

    System.out.println("Qno. (7)");
    System.out.println("The concatenated string: " + string1Qno7.concat(string2Qno7));
    System.out.println("---------------------------------------");

//    8. Write a Java program to test if a given string contains the specified sequence of char values.
//
//    Sample Output:
//
//    Original String: PHP Exercises and Python Exercises
//    Specified sequence of char values: and
//    true

    System.out.println("Qno. (8)");

    String stringQno8 = "PHP Exercises and Python Exercises";
    String grepQno8 = "and";

    System.out.println("Original string: " + stringQno8);
    System.out.println("Specified sequence of char values: " + grepQno8);

    System.out.println(stringQno8.contains(grepQno8));

    System.out.println("---------------------------------------");

//    9. Write a Java program to compare a given string to the specified character sequence.
//
//    Sample Output:
//
//    Comparing example.com and example.com: true
//    Comparing Example.com and example.com: false

    String string1Qno9 = "example.com";
    String string2Qno9 = "Example.com";
    String sequenceQno9 = "example.com";

    System.out.println("Qno. (9)");

    System.out.println("Comparing " + string1Qno9 + " and " + sequenceQno9 + ": " + string1Qno9.contentEquals(sequenceQno9));
    System.out.println("Comparing " + string2Qno9 + " and " + sequenceQno9 + ": " + string2Qno9.contentEquals(sequenceQno9));

//    10. Write a Java program to compare a given string to the specified string buffer.
//
//    Sample Output:
//
//    Comparing example.com and example.com: true
//    Comparing Example.com and example.com: false

    String string1Qno10 = "example.com";
    String string2Qno10 = "Example.com";
    StringBuffer bufferQno10 = new StringBuffer("example.com");

    System.out.println("---------------------------------------");
    System.out.println("Qno. (10)");

    System.out.println("Comparing " + string1Qno10 + " and " + bufferQno10
            + ": " + string1Qno10.contentEquals(bufferQno10));
    System.out.println("Comparing " + string2Qno10 + " and " + bufferQno10
            + ": " + string2Qno10.contentEquals(bufferQno10));

    System.out.println("---------------------------------------");

//    11. Write a Java program to create a new String object with the contents of a character array.
//
//    Sample Output:
//
//    The book contains 234 pages.

    char[] charactersQno11 = {'2', '3', '4'};
    String pagesQno11 = new String(charactersQno11);

    System.out.println("Qno. (11)");
    System.out.println("The book contains " + pagesQno11 + " pages.");
    System.out.println("---------------------------------------");

//    12. Write a Java program to check whether a given string ends with the contents of another string.
//
//    Sample Output:
//
//    "Python Exercises" ends with "se"? false
//    "Python Exercise" ends with "se"? true

    String string1Qno12 = "Python Exercises";
    String string2Qno12 = "Python Exercise";
    String suffixQno12 = "se";

    System.out.println("Qno. (12)");
    System.out.println("\"" + string1Qno12 + "\" ends with \"" + suffixQno12
            + "\"? " + string1Qno12.endsWith(suffixQno12));
    System.out.println("\"" + string2Qno12 + "\" ends with \"" + suffixQno12
            + "\"? " + string2Qno12.endsWith(suffixQno12));
    System.out.println("---------------------------------------");

//    13. Write a Java program to check whether two String objects contain the same data.
//
//    Sample Output:
//
//    "Stephen Edwin King" equals "Walter Winchell"? false
//    "Stephen Edwin King" equals "Mike Royko"? false

    String string1Qno13 = "Stephen Edwin King";
    String string2Qno13 = "Walter Winchell";
    String string3Qno13 = "Mike Royko";

    System.out.println("Qno. (13)");

    System.out.println("\"" + string1Qno13 + "\" equals \"" + string2Qno13
            + "\"? " + string1Qno13.equals(string2Qno13));

    System.out.println("\"" + string1Qno13 + "\" equals \"" + string3Qno13
            + "\"? " + string1Qno13.equals(string3Qno13));

//    14. Write a Java program to compare a given string to another string,
//        ignoring case considerations.
//
//    Sample Output:
//
//    "Stephen Edwin King" equals "Walter Winchell"? false
//    "Stephen Edwin King" equals "stephen edwin king"? true

    String string1Qno14 = "Stephen Edwin King";
    String string2Qno14 = "Walter Winchell";
    String string3Qno14 = "stephen edwin king";

    System.out.println("---------------------------------------");
    System.out.println("Qno. (14)");

    System.out.println("\"" + string1Qno14 + "\" equals \"" + string2Qno14
            + "\"? " + string1Qno14.equalsIgnoreCase(string2Qno14));
    System.out.println("\"" + string1Qno14 + "\" equals \"" + string3Qno14
            + "\"? " + string1Qno14.equalsIgnoreCase(string3Qno14));

    System.out.println("---------------------------------------");

//    15. Write a Java program to print current date and time in the specified format.
//
//    Sample Output:
//
//    Current Date and Time :
//    June 19, 2017
//    3:13 pm
//    The current date and time will change according to your system date and time.

    LocalDateTime currentQno15 = LocalDateTime.now();
    DateTimeFormatter dateFormatQno15 = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
    DateTimeFormatter timeFormatQno15 = DateTimeFormatter.ofPattern("h:mm a", Locale.ENGLISH);

    System.out.println("Qno. (15)");
    System.out.println("Current Date and Time :");
    System.out.println(currentQno15.format(dateFormatQno15));
    System.out.println(currentQno15.format(timeFormatQno15).toLowerCase(Locale.ENGLISH));
    System.out.println("---------------------------------------");

//    16. Write a Java program to get the contents of a given string as a byte array.
//
//    Sample Output:
//
//    The new String equals This is a sample String.

    String originalQno16 = "This is a sample String.";
    byte[] bytesQno16 = originalQno16.getBytes(StandardCharsets.UTF_8);
    String newStringQno16 = new String(bytesQno16, StandardCharsets.UTF_8);

    System.out.println("Qno. (16)");
    System.out.println("The new String equals " + newStringQno16);
    System.out.println("---------------------------------------");

//    17. Write a Java program to get the contents of a given string as a character array.
//
//    Sample Output:
//
//    The char array equals "[C@2a139a55"

    String originalQno17 = "This is a sample String.";
    char[] charactersQno17 = originalQno17.toCharArray();

    System.out.println("Qno. (17)");
    // Concatenating the array prints its default representation, not its characters.
    // The hexadecimal suffix can vary between runs.
    System.out.println("The char array equals \"" + charactersQno17 + "\"");
    System.out.println("---------------------------------------");

//    18. Write a Java program to create a unique identifier of a given string.
//
//    Sample Output:
//
//    The hash for Python Exercises. is 863132599

    String stringQno18 = "Python Exercises.";
    // Hash codes are not guaranteed to be unique for different strings.
    int hashQno18 = stringQno18.hashCode();

    System.out.println("Qno. (18)");
    System.out.println("The hash for " + stringQno18 + " is " + hashQno18);
    System.out.println("---------------------------------------");

//    19. Write a Java program to get the index of all the characters of the alphabet.
//
//    Sample Output:
//
//    a  b c  d e  f  g h i  j
//    =========================
//    36 10 7 40 2 16 42 1 6 20
//
//    k  l  m  n  o  p q  r  s  t
//    ===========================
//    8 35 22 14 12 23 4 11 24 31
//
//    u  v  w  x  y  z
//    ================
//    5 27 13 18 38 37
//
//    Sample string of all alphabet: "The quick brown fox jumps over the lazy dog."

    String stringQno19 = "The quick brown fox jumps over the lazy dog.";
    String alphabetQno19 = "abcdefghijklmnopqrstuvwxyz";

    System.out.println("Qno. (19)");
    // Print groups of ten letters, with each first index below its letter.
    for (int startQno19 = 0; startQno19 < alphabetQno19.length(); startQno19 += 10) {
        int endQno19 = Math.min(startQno19 + 10, alphabetQno19.length());

        for (int i = startQno19; i < endQno19; i++) {
            System.out.printf("%-3c", alphabetQno19.charAt(i));
        }
        System.out.println();
        System.out.println("=".repeat((endQno19 - startQno19) * 3));

        for (int i = startQno19; i < endQno19; i++) {
            System.out.printf("%-3d", stringQno19.indexOf(alphabetQno19.charAt(i)));
        }
        System.out.println();
        System.out.println();
    }

    System.out.println("---------------------------------------");

//    20. Write a Java program to get the canonical representation of the string object.
//
//    Sample Output:
//
//    str1 == str2? false
//    str1 == str3? true

    String str1Qno20 = "Java Exercises";
    String str2Qno20 = new String("Java Exercises");
    String str3Qno20 = str2Qno20.intern();

    System.out.println("Qno. (20)");
    // == checks whether the variables refer to the same object.
    // intern() returns the pooled string, which str1Qno20 already references.
    System.out.println("str1 == str2? " + (str1Qno20 == str2Qno20));
    System.out.println("str1 == str3? " + (str1Qno20 == str3Qno20));
    System.out.println("---------------------------------------");

//    21. Write a Java program to get the last index of a string within a string.
//
//    Sample Output:
//
//    a  b c  d  e  f  g  h i  j
//    ===========================
//    36 10 7 40 33 16 42 32 6 20
//
//    k  l  m  n  o  p q  r  s  t
//    ===========================
//    8 35 22 14 41 23 4 29 24 31
//
//    u  v  w  x  y  z
//    =================
//    21 27 13 18 38 37
//
//    Sample string of all alphabet: "The quick brown fox jumps over the lazy dog."

    String stringQno21 = "The quick brown fox jumps over the lazy dog.";
    String alphabetQno21 = "abcdefghijklmnopqrstuvwxyz";

    System.out.println("Qno. (21)");
    // Print each letter's last index, counting positions from zero.
    for (int startQno21 = 0; startQno21 < alphabetQno21.length(); startQno21 += 10) {
        int endQno21 = Math.min(startQno21 + 10, alphabetQno21.length());

        for (int i = startQno21; i < endQno21; i++) {
            System.out.printf("%-3c", alphabetQno21.charAt(i));
        }
        System.out.println();
        System.out.println("=".repeat((endQno21 - startQno21) * 3));

        for (int i = startQno21; i < endQno21; i++) {
            System.out.printf("%-3d", stringQno21.lastIndexOf(alphabetQno21.charAt(i)));
        }
        System.out.println();
        System.out.println();
    }

    System.out.println("---------------------------------------");

//    22. Write a Java program to get the length of a given string.
//
//    Sample Output:
//
//    The string length of 'example.com' is: 11

    String stringQno22 = "example.com";

    System.out.println("Qno. (22)");
    System.out.println("The string length of 'example.com' is: " + stringQno22.length());
    System.out.println("---------------------------------------");

//    23. Write a Java program to find whether a region in the current string
//        matches a region in another string.
//
//    Sample Output:
//
//    str1[0 - 7] == str2[28 - 35]? true
//    str1[9 - 15] == str2[9 - 15]? false

    String str1Qno23 = "Java programming is fun.";
    String str2Qno23 = "This example compares text: Java programming is fun.";

    System.out.println("Qno. (23)");
    // Arguments: start in this string, other string, start in other string, length.
    // Indexes 0 through 7 contain 8 characters: "Java pro".
    System.out.println("str1[0 - 7] == str2[28 - 35]? " + str1Qno23.regionMatches(0, str2Qno23, 28, 8));
    // Indexes 9 through 15 contain 7 characters; the comparison is case-sensitive.
    System.out.println("str1[9 - 15] == str2[9 - 15]? " + str1Qno23.regionMatches(9, str2Qno23, 9, 7));
    System.out.println("---------------------------------------");

//    24. Write a Java program to replace a specified character with another character.
//
//    Sample Output:
//
//    Original string: The quick brown fox jumps over the lazy dog.
//    New String: The quick brown fox jumps over the lazy fog.

    String originalQno24 = "The quick brown fox jumps over the lazy dog.";
    String newStringQno24 = originalQno24.replace('d', 'f');

    System.out.println("Qno. (24)");
    System.out.println("Original string: " + originalQno24);
    System.out.println("New String: " + newStringQno24);
    System.out.println("---------------------------------------");

//    25. Write a Java program to replace each substring that matches a given
//        regular expression with the given replacement.
//
//    Replace all occurrences of "fox" with "cat".
//
//    Sample Output:
//
//    Original string: The quick brown fox jumps over the lazy dog.
//    New String: The quick brown cat jumps over the lazy dog.

    String originalQno25 = "The quick brown fox jumps over the lazy dog.";
    String newStringQno25 = originalQno25.replaceAll("fox", "cat");

    System.out.println("Qno. (25)");
    System.out.println("Original string: " + originalQno25);
    System.out.println("New String: " + newStringQno25);
    System.out.println("---------------------------------------");

//    26. Write a Java program to check whether a given string starts with the contents of another string.
//
//    Sample Output:
//
//    Red is favorite color. starts with Red? true
//    Orange is also my favorite color. starts with Red? false

    String string1Qno26 = "Red is favorite color.";
    String string2Qno26 = "Orange is also my favorite color.";
    String prefixQno26 = "Red";

    System.out.println("Qno. (26)");
    System.out.println(string1Qno26 + " starts with " + prefixQno26 + "? "
            + string1Qno26.startsWith(prefixQno26));
    System.out.println(string2Qno26 + " starts with " + prefixQno26 + "? "
            + string2Qno26.startsWith(prefixQno26));
    System.out.println("---------------------------------------");

//    27. Write a Java program to get a substring of a given string between two specified positions.
//
//    Sample Output:
//
//    old = The quick brown fox jumps over the lazy dog.
//    new = brown fox jumps

    String originalQno27 = "The quick brown fox jumps over the lazy dog.";
    // The start index is included; the end index is excluded. Indexes start at zero.
    String substringQno27 = originalQno27.substring(10, 25);

    System.out.println("Qno. (27)");
    System.out.println("old = " + originalQno27);
    System.out.println("new = " + substringQno27);
    System.out.println("---------------------------------------");

//    28. Write a Java program to create a character array containing the contents of a string.
//
//    Sample Output:
//
//    Java Exercises.

    String stringQno28 = "Java Exercises.";
    char[] charactersQno28 = stringQno28.toCharArray();

    System.out.println("Qno. (28)");
    // Passing a char array directly to println prints its characters.
    System.out.println(charactersQno28);
    System.out.println("---------------------------------------");


//    29. Write a Java program to convert all the characters in a string to lowercase.
//
//    Sample Output:
//
//    Original String: The Quick BroWn FoX!
//    String in lowercase: the quick brown fox!

    String stringQno29 = "The Quick BroWn FoX!";

    System.out.println("Qno. (29)");
    System.out.println(stringQno29.toLowerCase());
    System.out.println("---------------------------------------");

//    30. Write a Java program to convert all the characters in a string to uppercase.
//
//    Sample Output:
//
//    Original String: The Quick BroWn FoX!
//    String in uppercase: THE QUICK BROWN FOX!

    System.out.println("Qno. (30)");
    System.out.println(stringQno29.toLowerCase());
    System.out.println("---------------------------------------");


//    31. Write a Java program to trim any leading or trailing whitespace from a given string.
//
//            Sample Output:
//
//    Original String:  Java Exercises
//    New String: Java Exercises
//.....................................................
//
//    32. Write a Java program to find longest Palindromic Substring within a string.
//
//    Sample Output:
//
//    The given string is: thequickbrownfoxxofnworbquickthe
//    The longest palindrome substring in the giv
//    en string is; brownfoxxofnworb
//    The length of the palindromic substring is: 16
//.....................................................
//
//    33. Write a Java program to find all interleavings of given strings.
//
//    Sample Output:
//
//    The given strings are: WX  YZ    -->
//    The interleavings strings are:
//    YWZX
//    WYZX
//    YWXZ
//    WXYZ
//    YZWX
//    WYXZ
//.....................................................
//
//    34. Write a Java program to find the second most frequent character in a given string.
//
//    Sample Output:
//
//    The given string is: successes
//    The second most frequent char in the string is: c
//.....................................................
//
//    35. Write a Java program to print all permutations of a given string with repetition.
//
//    Sample Output:
//
//    The given string is: PQR
//    The permuted strings are:
//    PPP
//    PPQ
//    PPR
//...
//    RRP
//    RRQ
//    RRR
//.....................................................
//
//    36. Write a Java program to check whether two strings are interliving of a given string. Assuming that the unique characters in both strings.
//
//    Sample Output:
//
//    The given string is: PMQNO
//    The interleaving strings are MNO and PQ
//    The given string is interleaving: true
//
//    The given string is: PNQMO
//    The interleaving strings are MNO and PQ
//    The given string is interleaving: false
//.....................................................
//
//    37. Write a Java program to find length of the longest substring of a given string without repeating characters.
//
//    Sample Output:
//
//    Input String : pickoutthelongestsubstring
//    The longest substring : [u, b, s, t, r, i, n, g]
//    The longest Substring Length : 8
//.....................................................
//
//    38. Write a Java program to print after removing duplicates from a given string.
//
//    Sample Output:
//
//    The given string is:  ramaresource.com
//    After removing duplicates characters the new string is:
//.....................................................
//
//    39. Write a Java program to find first non repeating character in a string.
//
//    Sample Output:
//
//    The given string is: gibblegabbler
//    The first non repeated character in String is: i
//.....................................................
//
//    40. Write a Java program to divide a string in n equal parts.
//
//    Sample Output:
//
//    The given string is: abcdefghijklmnopqrstuvwxy
//    The string divided into 5 parts and they are:
//
//    abcde
//    fghij
//    klmno
//    pqrst
//    uvwxy
//.....................................................
//
//    41. Write a Java program to remove duplicate characters from a given string presents in another given string.
//
//    Sample Output:
//
//    The given string is: the quick brown fox
//    The given mask string is: queen
//
//    The new string is:
//    th ick brow fox
//.....................................................
//
//    42. Write a Java program to print list items containing all characters of a given word.
//
//    Sample Output:
//
//    The given strings are: rabbit   bribe   dog
//    The given word is: bib
//
//    The strings containing all the letters of the given word are:
//    rabbit
//    bribe
//.....................................................
//
//    43. Write a Java program to find the maximum occurring character in a string.
//
//    Sample Output:
//
//    The given string is: test string
//    Max occurring character in the given string is: t
//.....................................................
//
//    44. Write a Java program to reverse a string using recursion.
//
//    Sample Output:
//
//    The given string is: The quick brown fox jumps
//    The string in reverse order is:
//    spmuj xof nworb kciuq ehT
//.....................................................
//
//    45. Write a Java program to reverse words in a given string.
//
//    Sample Output:
//
//    The given string is: Reverse words in a given string
//    The new string after reversed the words: string given a in words Reverse
//.....................................................
//
//    46. Write a Java program to reverse every word in a string using methods.
//
//    Sample Output:
//
//    The given string is: This is a test string
//    The string reversed word by word is:
//    sihT si a tset gnirts
//.....................................................
//
//    47. Write a Java program to rearrange a string so that all same characters become d distance away.
//
//    Sample Output:
//
//    The given string is: accessories  --
//    The string after arrange newly is:
//    secrsecisao
//
//
//.....................................................
//
//    48. Write a Java program to remove "b" and "ac" from a given string.
//
//    Sample Output:
//
//    The given string is: abrambabasc
//    After removing the new string is: aramaasc
//.....................................................
//
//    49. Write a Java program to find first non-repeating character from a stream of characters.
//
//    Sample Output:
//
//    String: godisgood
//    Reading: g
//    The first non-repeating character so far is:  g
//    Reading: o
//    The first non-repeating character so far is:  g
//    Reading: d
//    The first non-repeating character so far is:  g
//    Reading: i
//    The first non-repeating character so far is:  g
//    Reading: s
//    The first non-repeating character so far is:  g
//    Reading: g
//    The first non-repeating character so far is:  o
//    Reading: o
//    The first non-repeating character so far is:  d
//    Reading: o
//    The first non-repeating character so far is:  d
//    Reading: d
//    The first non-repeating character so far is:  i
//.....................................................
//
//
//    50. Write a Java program to count and print all the duplicates in the input string.
//
//    Sample Output:
//
//    The given string is:  ramaresource.com
//    The duplicate characters and counts are:
//    e  appears  2  times
//    r  appears  2  times
//.....................................................

}
