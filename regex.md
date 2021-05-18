# Regular Expressions

A Regular Expression (or Regex) is a pattern (or filter) that describes a set of strings that matches the pattern.

Regular expressions are used to search string for a specific pattern or to validate the user-input value like to validate the email address entered by the user.



## Why we use Regular Expression?

To perform certain action on a given string based on the characters present in it. It can be validation it or it can be changing certain parts of it.



## Types of Regular expression:

### 1. Character classes: 
A character class allows you to match any symbol from a certain character set. A character class is also called a character set. Suppose that you have a phone number like this:

\d    for digits (0-9)
.       for every character
\w   for white spaces
\t     for tabs

### 2. Boundary matches: 
Checks for the boundaries such as the beginning and end of a string or word.

^ starting of a string
$ ending of a string



## Examples:

### 1. Changing a certain character in a string



NOTE: Regular expression is case sensitive.


### 2. Changing all the characters of a string



‘.’ represents all the characters in a string (upper case, lower case, numeric value, white spaces etc). So here we changed all the characters in the string with X



### 3. Changing the first 4 characters of a string.



Here we are using boundary matcher (^) known as carrot. It checks if the string starts with ‘abcDeee’ then it will replace it with ‘YYY’. As we can see the number of characters in the regex need not be equal to the number of characters in the new string with which we are replacing the current one.






### 4. Checking a string starts with a certain sub string


### 5. Checking a string ends with a certain sub string



Here $ is a character class variable used to check the end of the string.



### 6. Replacing some characters in a string with a new string




It will replace all the ‘a’, ‘e’ and ‘i’ with ‘X’. It’s a kind of OR operator, If you found any of the given character then replace it with the given string.


### 7. Replacing some characters only if they are followed by certain characters.



It will check if any of the character in the first square bracket follows by any of the character from the second square bracket and replaces it with the given string (‘X’).


### 8. Handling case sensitivity using square bracket





If we want to check if a string starts with certain character irrespective of the case then we case check using square bracket condition.


### 9. Replacing all the characters except the few characters.




We will use carrot (^) in the square bracket to achieve that, it is also known as not operator.


### 10. Replacing characters of a range

If we want to replace characters like a,b,c,d,e,f and number like 1,2,3,4,5,6 with a given number. Then 1 way is to do that is




But we can write it in a better way like :




### 11. Handling case sensitivity in range regex




There are 2 ways to achieve the same thing as shown.


### 12. Replacing all the numbers in a string

We already know the one way to do it (using square brackets range value), there is another way to do so, using
character class variable (\d)




We are adding an extra (\) to escape the variable.


### 13. Replacing all the non- numeric characters in a string





### 14. Replacing all the numeric, alphabets and _ in a string





There are many other character class peremeter present, for those please refer to :
 https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html


## Quantifier : It specifies how often an element in a regular expression can occur

### 15. Replacing duplicate character in a string

As we can see in the example we can achieve the same result in 2 ways but using quantifier it is much more easier.



In the curly brackets we can add the number, it indicates the number of character prior to it in the regex.


### 16. Adding condition for one or more characters

If we want to add a condition on a character that it should be present but the count does not matter like in the previous example, if we just want to check if the ‘e’ is present and it does not matter if 3 ‘e’ are present or not then we can use ‘+’ quantifier



### 17. Setting limit on character count

If we want to replace a character if it is present in a certain limit



Like in the example above, if the number of ‘e’ is present in range between 2-5 (2,3,4,5) then only it will update the string.


### 18. Character 0 or more time present

Like for 1 or more we are using ‘+’ quantifier, we can use ‘*’ for 0 or more.




Please refer to the Pattern class to learn more about quantifier :
 https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html


## Pattern Matching

### 19. Lets suppose we have a big html code and we want to check how many <h2> tags we have and we want to extract the data present in the <h2> tags.

We can do that using the regular expression. For that we need to learn about Pattern and Matcher class. Till now we were using the matches method of string class.

Lets we want to find the number of <h2> tags in the following html code.



So how we can do that ?

First we need to check if there is any <h2> tags present in the given code




NOTE: We can use matcher object only once, So to reuse it we need to reset the matcher object. As we already used it to check if there is any <h2> tags present, we need to reset it before using it to extract the index where the data is present.



## Group Pattern

### 20. We can use group pattern to extract the data present in the <h2> tags



But if we see here we are also getting the tags with the data, So to omit the tags and to get only the data, we need to change out group pattern. Instead of 1 group we will create 3 like :




the second group is pointing to the data between the <h2> tags.


## Few tasks for practice

### TASK 1: Change all the ‘m’ present in the given string with A

	String str = “My name is maddy”;


### TASK 2: Checks if the given string starts with ‘he’

	String str = “Hello World”;


### TASK 3: Checks if the given string ends with ‘ld’

	String str = “Hello World”;


### TASK 4: Change the first 5 characters of the given string with ‘Hi’

	String str = “Hello World”;

### TASK 5: Change all the vowels with X in the given string

	String str = “Hello World”;

### TASK 6: Checks if the string contains exact 6 numbers

	String str = "712632";

### TASK 7: Checks if the given string contains no number

	String str = "Hello T0M";

### TASK 8: Extract the data present in the <p> tag using pattern and Matchers class

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");
