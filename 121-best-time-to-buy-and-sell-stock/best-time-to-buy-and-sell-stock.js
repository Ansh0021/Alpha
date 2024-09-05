/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    var min=prices[0], max=0;
    for(let i=1;i<prices.length;i++){
         if(min>prices[i]){
            min=prices[i];
         }
         max=Math.max(max,prices[i]-min)
    }
    return max;
};