class Main {
	main():IO {
	{
		new IO.out_string("Hello world! 1\n");	--normal
		new IO.out_string("Hello\
 world! 2\n");						--escaped newline
		new IO.out_string("Hello\0 world! 3\n");--ignoring \
		new IO.out_string("Hello\ 			--string contains null along with unterminated string
 world! 4\n");	--unterminated string constant
		--unescaped newline
		new IO.out_string("Hello\\n world! 5\n")	--string containing '\'
		new IO.out_string("Hello  world! 6\n");	--string contains null character

		new IO.out_string("Hello world! 7\\\n

string: ""	--this is not an error
string: "\"
--this is an error, unterminated string

"This string contains an escaped null character\ "
"This string has eof at the end