/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function (x) {
    let st = x.toString();
    if (st.length == 0 || x<0) {
        return false;
    }
    function reverseString(str) {
        return str.split("").reverse().join("");
    }
    var rev=reverseString(st);
    if(rev==st){
        return true;
    }
    else return false;
}

