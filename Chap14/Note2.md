- To write a text file, start with a FileWriter 
connection stream.
- Chain the FileWriter to a BufferedWriter for 
efficiency.
- A File object represents a file at a particular 
path, but does not represent the actual 
contents of the file.
- With a File object you can create, traverse, 
and delete directories.
- Most streams that can use a String filename 
can use a File object as well, and a File object 
can be safer to use.
- To read a text file, start with a FileReader 
connection stream.
- Chain the FileReader to a BufferedReader for 
efficiency.
- To parse a text file, you need to be sure the 
file is written with some way to recognize the 
different elements. A common approach is to 
use some kind of character to separate the 
individual pieces.
- Use the String split() method to split a String 
up into individual tokens. A String with one 
separator will have two tokens, one on each 
side of the separator. The separator doesn’t 
count as a token.