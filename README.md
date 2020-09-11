# **COOL Compiler**

## _Lexical Analyzer using ANTLR4_

AUTHOR: T. KRISHNA PRASHANTH

ROLL NO.: CS18BTECH11045

----------------------------------------------------------------------------------------------------

FILES SUBMITTED:

Asncs18btech11045.tar.gz :

    README.md

    src/grammar/CoolLexer.g4

    src/test_cases/helloworld.cl
    src/test_cases/non-trivial1.cl
    src/test_cases/testcomment1.cl
    src/test_cases/testcomment2.cl
    src/test_cases/testkeys.cl
    src/test_cases/teststr1.cl
    src/test_cases/teststr2.cl
    src/test_cases/teststr3.cl

----------------------------------------------------------------------------------------------------
## **Overall Structure**
----------------------------------------------------------------------------------------------------

The order of tokenizing the elements :

1. Keywords
2. Boolean constants
3. Identifiers
4. Integer constants
5. Special symbols
6. Whitespaces
7. Single line comments
8. Multiline comments
9. Strings
10. Remaining invalid characters

----------------------------------------------------------------------------------------------------
## Design rules
----------------------------------------------------------------------------------------------------

### Design rules for Keywords

All the keywords are case insensitive.


### Design rules for Boolean constants

For the two boolean constants true and false,the first  
letter (t|f) must be lower case and the rest are case insensitive.


### Design rules for Identifiers

Identifiers can be combination of any letters, numbers, and    _ .  
Object identifiers should start with a lower case letter.  
Type identifiers (class names) should start with a upper case letter.


### Design rules for Integer constants

Any combination of the digits [0-9] is considered as integer constant.

Floating point numbers cannot be represented in cool directly.


### Design rules for Special symbols

Valid special symbols are :

    ; => ( ) : @ , + - * / ~ < = { } .  <= <- 


### Design rules for Whitespaces

Whitespaces : [ \t\r\n\f\b\u000b]  
skip spaces, tabs, newlines and all other whitespace characters


### Design rules for Single line comments

If ```"--"``` is encountered, it means it is a single line comment till the end of the line.  
Encountering an EOF in a single line comment is not considered an erroneous case.


### Design rules for Multiline comments

Multiline comments can be nested. To make it possible, two comment modes are used 
COMMENT_MODE and COMMENT_MODE2 . The lexer goes into COMMENT_MODE when ```(*``` is encountered. 
When another ```(*``` is encountered, the lexer goes into COMMENT_MODE2. When the lexer is in 
COMMENT_MODE2, if ```(*``` is encountered again, it goes into COMMENT_MODE2 again recursively. 
Whenever  ```*)``` is encountered the lexer pops out of the current mode and returns to the 
previous in the mode stack. While inside any mode, the lexer skips all the other characters.
While inside any of the comment modes, if at any point the lexer encounters the End of file 
character, it reports error as ```"EOF in comment"``` .


### Design rules for Strings

To handle a string a mode STRING_MODE is used. Every possibility of being a string is sent 
to ```processString()``` function along with errors. Backslash is always matched in pairs 
with any character immediately next to it. This way escaped newlines, escaped \" ,
null characters, strings that contain EOF are included and sent to ```processString()```. 

*When matching for a string and processing, logically we iterate from the start to the end 
of the string. While iterating, whichever error is encountered first, that error is reported 
using the error token indicating **at the line of starting character of the string**(I tried 
to fix this but I was unable to). Errors in string include null character, escaped null 
character, unterminated string, long string, End Of File in string, Backlash error.*

__There is an anomaly in the coolc binary compiler provided in the cases of strings of lengths 
1025,1026,1027 having multiple errors, those special cases are not generalized in my code 
instead I added them as separate miscellaneous cases.__

For the strings sent to ```processString()```, they are of mainly 3 kinds.
1. Last character is \n
2. Last character is \"
3. Last character is anything else

####  When the last character is \n: 
This is the case where the string is unterminated. The string is iterated through some 
checks for errors regarding null character, whether the string is too long or the miscellaneous 
case where the last \n is escaped and string contains EOF. Whichever error is encountered first, 
that error is only reported.

####  When the last character is \" or anything else: 
This is the case where the string is terminated or conatins EOF or has a backslash error. 
These two cases are tested together by iterating from the first to last character of the matched 
string. 

The lexer iterates from fist character to the last character of the string. 
_Because of the way we matched the string, the leading \" is not included in the string._ 
While iterating, the string is checked for errors and if at any point bachslash occurs, the 
immediate character next to it is checked whether it constitutes for a special escaped character. 
If so, the backslash and the next character is replaced with that escaped, else the backslash is 
removed and the next charcter is inserted as it is.

Ex: 
```
    Input : '\\' 'n' => Output : '\n'
    Input : '\\' 's' => Output : 's'
```
If at any point, any error occurs like null character, escaped null character or string is long, 
those errors are reported immediately and lexing resumes at the end of the string.
However EOF and Backslash errors are handled differently.

While iterating, since backslash comes in pairs, the program is bound to reach either the last 
character or the last but one character. When the last but one character is \ , the last character 
is escaped. So whatever the last character, the string contains EOF. _However if in this case 
the last character is null, escaped null is reported._ 

If the iterator reaches last character and the last character is \", then this is a terminated 
string constant, execution happens normally the last \" is stripped away and whole string is 
tokenized as STR_CONST. And lexing resumes at the end of string constant.
If the last character is null, it is reported.
If the last character is backslash, it means that this \ is not escaped by any other and it 
does not have any other character next to it for escaping. This is a backslash error and it 
is reported. If the last character is not any of the above characters, then it means that the 
lexer has hit End Of File. This is reported as EOF in string constant. 

_In this way, all the errors in a string are handled and only correct string is tokenized._


### Invalid Characters

If an input cannot be matched to any of the above rules, it means that it is an invalid  
character, an error message will be generated with just that character in it.
Processed by ``` errorChar(); ```


----------------------------------------------------------------------------------------------------
## Testing
----------------------------------------------------------------------------------------------------

I have conducted many tests on my code and compared its output with output of the binary lexer 
file provided to us. In cases where there is anomaly in the binary lexer for error recognition in
strings of length 1025,1026,1027, I have merely added separate case tasting for only these cases.

Some tests are provided for verification purpose.
Heavy tests are conducted on strings, to ensure correctness.

Two example files of correct cool programs are included.
A test file is included to test other ascepts like integers, boolean constants, identifiers, 
keywords, special symbols etc.
Three test files for testing strings and two test files for testing comments are included.
