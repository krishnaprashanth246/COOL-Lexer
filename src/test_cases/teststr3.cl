Int a <- 5;

Bool flag <- true;

-- no error
"multiple\\\\\
finebackslash\\\\\\\
lines"

-- error unterminated string
"multiple\\\
errorbackslash\\\\\\\\\\\
lines\\\\
"
-- error contains null char
"This string is\
multiple escaped\
newline' 'string\
containing null\
character in middle"

-- error contains null char
"this string ends\
with an   unescaped\
newline but has\
null 
characters"

--end of file errors,
--special case
"
(*remove the following lines to test for the above line*)

"this has eof\
