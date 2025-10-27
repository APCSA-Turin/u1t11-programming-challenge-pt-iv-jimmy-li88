package com.example.project;

public class StringProblems {
    // empty constructor
    public StringProblems() {
    }

    // Given a string, return true if it ends in "ly".
    // endsLy("oddly") → true
    // endsLy("y") → false
    // endsLy("oddy") → false
    public boolean endsLy(String x) {
        if (x == null || x.length() < 2) {
            return false;
        }
        int lastChar = x.length() - 1;
        String lastTwoChar = x.substring(lastChar - 1);
        if (lastTwoChar.equals("ly")) {
            return true;
        } else {
            return false;
        }
    }

    // Given two strings, append them together (known as "concatenation")
    // and return the result. However, if the concatenation creates a double-char,
    // then omit one of the chars, so "abc" and "cat" yields "abcat".
    // conCat("abc", "cat") → "abcat"
    // conCat("dog", "cat") → "dogcat"
    // conCat("abc", "") → "abc"
    public String conCat(String s1, String s2) {
        if (s1 == null) s1 = "";
        if (s2 == null) s2 = "";

        if (s1.length() == 0) return s2;
        if (s2.length() == 0) return s1;

        int lastChar1 = s1.length() - 1;
        String lastChar = s1.substring(lastChar1);
        String firstChar2 = s2.substring(0, 1);
        String withoutDouble = s1.substring(0, lastChar1);

        if (lastChar.equals(firstChar2)) {
            return withoutDouble + s2;
        } else {
            return s1 + s2;
        }
    }

    // Given a string, return a version without the first 2 chars.
    // Except keep the first char if it is 'a' and keep the second char if it is
    // 'b'.
    // The string may be any length. Harder than it looks.
    // deFront("Hello") → "llo"
    // deFront("java") → "va"
    // deFront("away") → "aay"
    // deFront("aapple") ->"apple"
    // deFront("abee") - > "abee"
    // deFront("ab") -> "ab"
    // deFront("a") -> "a"
    // deFront("ba") -> ""
    public String deFront(String s1) {
        if (s1 == null || s1.length() == 0) {
            return "";
        }
        String firstLetter = s1.substring(0, 1);
        String secondLetter = s1.substring(1, 2);
        String modifiedString = s1.substring(2);
        if (firstLetter.equals("a") && secondLetter.equals("b")) {
            return s1;
        }
        if (firstLetter.equals("a")) {
            return "a" + modifiedString;
        } else if (secondLetter.equals("b")) {
            return "b" + modifiedString;
        } else if (firstLetter.equals("a") && s1.length() < 2) {
            return "a";
        } else if (firstLetter.equals("b") && s1.length() < 2) {
            return "b";
        } else {
            return modifiedString;
        }
    }

    // Given a string, if the first or last chars are 'x',
    // return the string without those 'x' chars, and otherwise
    // return the string unchanged.
    // withoutX("xHix") → "Hi"
    // withoutX("xHi") → "Hi"
    // withoutX("Hxix") → "Hxi"
    // withoutX("") → ""
    public String withoutX(String s1) {
        if (s1 == null || s1.length() == 0) {
            return "";
        }
        String firstLetter = s1.substring(0, 1);
        int lastCharIndex = s1.length() - 1;
        String lastLetter = s1.substring(lastCharIndex);
        int temp = lastCharIndex - 1;
        String ifBoth = s1.substring(1, temp + 1);
        if (firstLetter.equals("x") && lastLetter.equals("x")) {
            return ifBoth;
        } if (firstLetter.equals("x")) {
            s1 = s1.substring(1);
            return s1;
        }
        if (lastLetter.equals("x")) {
            s1 = s1.substring(0, s1.length() - 1);
        }
        return s1;
    }


    // Given a string str, if the string starts with "f" return "Fizz".
    // If the string ends with "b" return "Buzz". If both the "f" and "b"
    // conditions are true, return "FizzBuzz". In all other cases, return the
    // string unchanged. (See also: FizzBuzz Code)
    // fizzString("fig") → "Fizz"
    // fizzString("dib") → "Buzz"
    // fizzString("fib") → "FizzBuzz"
    public String fizzString(String s1) {
        if (s1 == null || s1.length() == 0) {
            return "";
        }

        int len = s1.length();
        // safe checks: string is non-empty here
        boolean startsWithF = s1.charAt(0) == 'f';
        boolean endsWithB = s1.charAt(len - 1) == 'b';

        if (startsWithF && endsWithB) return "FizzBuzz";
        if (startsWithF) return "Fizz";
        if (endsWithB) return "Buzz";
        return s1;
    }

    // Given an int n, return the string form of the number followed
    // by "!". So the int 6 yields "6!". Except if the number is
    // divisible by 3 use "Fizz" instead of the number, and if the
    // number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use
    // "FizzBuzz".
    // Note: the % "mod" operator computes the remainder after division, so 23 % 10
    // yields 3.
    // What will the remainder be when one number divides evenly into another?
    // fizzString2(1) → "1!"
    // fizzString2(2) → "2!"
    // fizzString2(3) → "Fizz!"
    public String fizzString2(int x){ 
        if (x % 3 == 0 && x % 5 == 0) {
            return "FizzBuzz!";
        } else if (x % 3 == 0) {
            return "Fizz!";
        } else if (x % 5 == 0) {
            return "Buzz!";
        } else {
            return x + "!";
        }
    }
}