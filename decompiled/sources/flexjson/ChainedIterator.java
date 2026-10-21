package flexjson;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class ChainedIterator implements Iterator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Iterator[] f68464p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f68465q0 = 0;

    public ChainedIterator(Set... setArr) {
        this.f68464p0 = new Iterator[setArr.length];
        for (int i10 = 0; i10 < setArr.length; i10++) {
            this.f68464p0[i10] = setArr[i10].iterator();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10 = this.f68465q0;
        Iterator[] itArr = this.f68464p0;
        if (itArr[i10].hasNext()) {
            return true;
        }
        int i11 = this.f68465q0 + 1;
        this.f68465q0 = i11;
        return i11 < itArr.length && itArr[i11].hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.f68464p0[this.f68465q0].next();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f68464p0[this.f68465q0].remove();
    }
}
