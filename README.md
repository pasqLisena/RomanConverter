# RomanConverter

Java library for converting Roman numbers in integers.

## Methods

### `public static int toNumerical(@NotNull String roman)`

Method used to convert a string to a integer

 * **Parameters:** `roman` — roman numeral to be converted
 * **Returns:** integer
 * **Throws:** NumberFormatException if not allowed chars are present
 
Examples:
```java
RomanConverter.toNumerical("XVI"); // 16
RomanConverter.toNumerical("XIV"); // 14
```

### `@NotNull public static String toRoman(int num)`

Method used to convert a integer to a roman numeral

 * **Parameters:** `num` — number to be converted
 * **Returns:** roman numeral
 
Examples:
```java
RomanConverter.toRoman(16); // XVI
RomanConverter.toRoman(14); // XIV
```

## Install on gradle

Include it in `build.gradle`

```
dependencies {
    implementation 'com.github.pasqLisena:RomanConverter:1.0.0'
```

Import in your code 
```java
import io.github.pasqlisena.RomanConverter;
```
