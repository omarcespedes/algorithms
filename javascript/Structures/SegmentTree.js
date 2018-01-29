class SegmentTree {
    constructor(arr = [], mergeCriteria){
        this.st = [];
        this._A = [...arr];
        this.merge = mergeCriteria;
        this.build(1, 0, arr.length -1);
    }

    build(p, L, R) {
        if(L === R) {
            this.st[p] = this._A[L];
        } else {
            let M=(L+R) >> 1;
            let left = p << 1;
            let right = (p << 1) + 1;
            this.build(left, L, M);
            this.build(right, M+1, R);
            this.st[p] = this.merge(this.st[left], this.st[right]);
        }
    }

    search(i, j, p = 1, L = 0, R = this._A.length - 1) {
        let M = (L+R) >> 1;
        let left = p << 1;
        let right = (p << 1) + 1;
        if(i <= L && j >= R ) {
            return this.st[p];
        } 
        else if(j <= M) return this.search(i, j, left, L, M);
        else if(i > M) return this.search(i, j, right, M+1, R);
        else {
            return this.merge(
                this.search(i, j, left, L, M),
                this.search(i, j, right, M+1, R)
            )
        }
    }

    update(pos, val, p = 1, L = 0, R = this._A.length - 1) {
        if(L === R) {
            this._A[pos] = val;
            this.st[p] = val;
        } else {
            let M = (L+R) >> 1;
            let left = p << 1;
            let right = (p << 1) + 1;
            if(pos <= M) this.update(pos, val, left, L, M);
            else this.update(pos, val, right, M+1, R);
            this.st[p] = this.merge(this.st[left], this.st[right]);
        }
    }

}

let a = new SegmentTree([4,2,1,5,7,5,2,3],(a,b)=>a>b?a:b);
console.log('Search [6,7]', a.search(6,7));//3
a.update(2, 6);
console.log('Search [0,3]', a.search(0,3));//6