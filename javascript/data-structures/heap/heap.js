
class Heap {
    constructor(comparator) {
        this.items = [];
        this.comparator = comparator;
    }

    parent(index) {
        if (!index) {
            return null;
        }
        return (index -1 ) >> 1;
    }

    add(val) {
        const {items, parent, comparator} = this;
        items.push(val);
        let index = items.length - 1;
        while(parent(index) != null && comparator(items[index], items[parent(index)])) {
            let parentIndex = parent(index);
            let temp = items[index];
            items[index] = items[parentIndex];
            items[parentIndex] = temp;
            index = parentIndex;
        }
    }

    extract() {

    }

    top() {
        return this.items[0];
    }
}

const heap = new Heap((a, b) => a > b);

heap.add(35);
heap.add(33);
heap.add(42);
heap.add(10);
heap.add(14);
heap.add(19);

console.log(heap.items);