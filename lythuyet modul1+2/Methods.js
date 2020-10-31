// String methods
string.length : return the length of string;
string.indexOf("string1") : return the position of string1 or letter in string, search from left to right
string.lastIndexOf("string1") : return the position of string1 or letter in string, search from right to left
str.indexOf("locate", 15); index of "lacate" in str, start search from 15th position to the right
str.lastIndexOf("locate", 15); index of "lacate" in str, start search from 15th position to the left
str.search("locate") The search() method searches a string for a specified value and returns the position of the match:
    The search() method cannot take a second start position argument.
    The indexOf() method cannot take powerful search values (regular expressions).
str.slice(7, 13); extracts a part of a string and returns the extracted part in a new string.
        The method takes 2 parameters: the start position, and the end position (end not included).
    str.slice(-12, -6); If a parameter is negative, the position is counted from the end of the string.
        If you omit the second parameter, the method will slice out the rest of the string:
str.substring(7, 13);
    substring() is similar to slice().
    The difference is that substring() cannot accept negative indexes.
str.substr(7, 6);     substr() is similar to slice().
    The difference is that the second parameter specifies the length of the extracted part.
str.replace("Microsoft", "W3Schools"); replaces a specified value with another value in a string:
    To replace case insensitive, use a regular expression with an /i flag (insensitive):
    str.replace(/MICROSOFT/i, "W3Schools");
str.toUpperCase()
str.toLowerCase()
str.concat("another string") : return a new string = str + "another string", same result as str + "another string"
str.trim() : remove white space from both side of a string.
str.charAt(position) : return the character at that position of string
str.charCodeAt(position) : return the unicode of the character at that position.
str[0]
Convert string to an array:
    var txt = "a,b,c,d,e";   // String
    txt.split(",");          // Split on commas
    txt.split(" ");          // Split on spaces
    txt.split("|");          // Split on pipe
    txt.split("");           // Split in characters

// Number methods
toString(): returns a number as a string.
toExponential() returns a string, with a number rounded and written using exponential notation.
    var x = 9.656;
    x.toExponential(2);     // returns 9.66e+0
    x.toExponential(4);     // returns 9.6560e+0
    x.toExponential(6);     // returns 9.656000e+0
toFixed() returns a string, with the number written with a specified number of decimals
    var x = 9.656;
    x.toFixed(0);           // returns 10
    x.toFixed(2);           // returns 9.66
    x.toFixed(4);           // returns 9.6560
    x.toFixed(6);           // returns 9.656000
toPrecision() returns a string, with a number written with a specified length:
    var x = 9.656;
    x.toPrecision();        // returns 9.656
    x.toPrecision(2);       // returns 9.7
    x.toPrecision(4);       // returns 9.656
    x.toPrecision(6);       // returns 9.65600
valueOf() returns a number as a number.
    var x = 123;
    x.valueOf();            // returns 123 from variable x
    (123).valueOf();        // returns 123 from literal 123
    (100 + 23).valueOf();   // returns 123 from expression 100 + 23
Converting Variables to Numbers
    Number()	Returns a number, converted from its argument.
    parseFloat()	Parses its argument and returns a floating point number
    parseInt()	Parses its argument and returns an integer

//array methods
toString() converts an array to a string of (comma separated) array values.
join() method also joins all array elements into a string.
    var fruits = ["Banana", "Orange", "Apple", "Mango"];
    document.getElementById("demo").innerHTML = fruits.join(" * ");
    //Banana * Orange * Apple * Mango
pop() method removes the last element from an array:
push() method adds a new element to an array (at the end):
shift() method removes the first array element and "shifts" all other elements to a lower index.
unshift() method adds a new element to an array (at the beginning), and "unshifts" older elements:
splice() method can be used to add new items or remove to an array:
    fruits.splice(a, b, "Lemon", "Kiwi"); from index a, remove b items, then add 2 new elements lemond and kiwi
    fruits.splice(0, 1); from index 0, remove 1 item
concat() method creates a new array by merging (concatenating) existing arrays:
    myChildren = arr1.concat(arr2, arr3);   // Concatenates arr1 with arr2 and arr3
    can also take strings as arguments:
    myChildren = arr1.concat("Peter");
slice() method slices out a piece of an array into a new array, it does not remove any elements from the source array.
    var fruits = ["Banana", "Orange", "Lemon", "Apple", "Mango"];
    var citrus = fruits.slice(1);
    // Orange,Lemon,Apple,Mango
    slice() method can take two arguments like slice(1, 3).
    // Orange,Lemon
sort() method sorts an array alphabetically:
reverse() method reverses the elements in an array.
var points = [40, 100, 1, 5, 25, 10];
points.sort(function(a, b){return a - b});