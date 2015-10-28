SEBASTIAN VELEZ
================

he purpose of this exercise is to build a JAVA Restful webservice which aims to help people
playing scrabble (https://en.wikipedia.org/wiki/Scrabble) by finding existing words.

The web service must take a list of letters as query parameters and return an existing word to the end user.
Example:

    /rest/scrabble?list=g,b,r,t,e,y,u could return a response with "rugby" or "grey"

The webservice must be coded in JAVA, you can use any framework you want, the IDE of your choice and don't forget to keep everything as simple as possible.


    http://localhost:8080/scrabble/rest/scrabble?list=g,b,r,t,e,y,u
    
this will return:

    [{"name":"berg"},{"name":"gebur"},{"name":"rugby"},{"name":"grub"},{"name":"beg"},{"name":"gybe"},{"name":"gub"},{"name":"gert"},{"name":"trug"},{"name":"reg"},{"name":"gyre"},{"name":"urge"},{"name":"rug"},{"name":"teg"},{"name":"gyte"},{"name":"tegu"},{"name":"tyg"},{"name":"tug"},{"name":"gey"},{"name":"gue"},{"name":"yug"},{"name":"ug"},{"name":"uberty"},{"name":"tuber"},{"name":"brut"},{"name":"reb"},{"name":"byre"},{"name":"rebuy"},{"name":"rube"},{"name":"ruby"},{"name":"urb"},{"name":"bet"},{"name":"ybet"},{"name":"tube"},{"name":"tub"},{"name":"be"},{"name":"bye"},{"name":"by"},{"name":"buy"},{"name":"ret"},{"name":"tyre"},{"name":"tuyer"},{"name":"true"},{"name":"try"},{"name":"yurt"},{"name":"rut"},{"name":"re"},{"name":"rye"},{"name":"ure"},{"name":"ur"},{"name":"te"},{"name":"yet"},{"name":"ute"},{"name":"ut"},{"name":"ye"},{"name":"uey"},{"name":"yu"}]


thanks to Kushagra Sharma and his "Scrabble Best Word Finder" (https://github.com/Kushagra8888/Scrabble)