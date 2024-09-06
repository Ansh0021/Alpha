/**
 * @param {number} x
 * @return {number}
 */
var reverse = function (x) {
    let temp = 0;
    if (x < 0) {
        temp = parseInt(String(x).slice(1).split('').reverse().join('')) * -1;
    }
    else {
        temp = parseInt(String(x).split('').reverse().join(''));
    }
    if (temp > Math.pow(2, 31) - 1 || temp < -Math.pow(2, 31)) {
        return 0;
    }
    else return temp;

};