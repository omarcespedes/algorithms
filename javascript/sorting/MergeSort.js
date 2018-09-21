const merge = (left, right) => {
    let result = [];

    while(left.length || right.length) {
        if(left.length && right.length) {
            if(left[0] > right[0]){
                result.push(right.shift())
            } else {
                result.push(left.shift())
            }
        } else if( left.length) {
            result.push(left.shift())
        } else {
            result.push(right.shift())
        }
    }
    return result;
}

const mergeSort = (list) => {
    let right;
    let left;
    if(list.length <= 1) {
        return list;
    }
    const middle = list.length/2;
    right = list.slice(0, middle)
    left = list.slice(middle, list.length);

    return merge(mergeSort(left), mergeSort(right))
}

console.log(mergeSort([5,9,8,6,4,1,0,7]))
