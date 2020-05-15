# Prefixer
Prefixer is a simple java program that adds a specified string to the beginning of each line of a file.

You can use this program by running it from the command line with the following arguments:
"filename/path" "Text to prefix with" "-true" 

The prefix does contain an extra whitespace after the prefix, if you do not want the whitespace added add the '-false' argument to the end of the command you are using to run the jar.

an example run of the code will look like this:
"java -jar Prefixer.jar "C:\users\user\Documents\example.txt" "ECHO" -true

(Specifying only a file name will search in the same folder that you downloaded the .jar to")

Both the file and prefix arguments can be passed without quotation marks unless you have whitespace in the file path or desired prefix string.

