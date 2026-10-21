package com.esotericsoftware.kryo.util;

import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.o1;
import androidx.camera.camera2.internal.n1;
import androidx.collection.h;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes9.dex */
public class IntArray {
    public int[] items;
    public boolean ordered;
    public int size;

    public IntArray() {
        this(true, 16);
    }

    public static IntArray with(int... iArr) {
        return new IntArray(iArr);
    }

    public void add(int i10) {
        int[] iArrResize = this.items;
        int i11 = this.size;
        if (i11 == iArrResize.length) {
            iArrResize = resize(Math.max(8, (int) (i11 * 1.75f)));
        }
        int i12 = this.size;
        this.size = i12 + 1;
        iArrResize[i12] = i10;
    }

    public void addAll(IntArray intArray) {
        addAll(intArray, 0, intArray.size);
    }

    public void clear() {
        this.size = 0;
    }

    public boolean contains(int i10) {
        int i11 = this.size - 1;
        int[] iArr = this.items;
        while (i11 >= 0) {
            int i12 = i11 - 1;
            if (iArr[i11] == i10) {
                return true;
            }
            i11 = i12;
        }
        return false;
    }

    public int[] ensureCapacity(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(g0.c("additionalCapacity must be >= 0: ", i10));
        }
        int i11 = this.size + i10;
        if (i11 > this.items.length) {
            resize(Math.max(8, i11));
        }
        return this.items;
    }

    public boolean equals(Object obj) {
        int i10;
        if (obj == this) {
            return true;
        }
        if (!this.ordered || !(obj instanceof IntArray)) {
            return false;
        }
        IntArray intArray = (IntArray) obj;
        if (!intArray.ordered || (i10 = this.size) != intArray.size) {
            return false;
        }
        int[] iArr = this.items;
        int[] iArr2 = intArray.items;
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public int first() {
        if (this.size != 0) {
            return this.items[0];
        }
        throw new IllegalStateException("Array is empty.");
    }

    public int get(int i10) {
        if (i10 < this.size) {
            return this.items[i10];
        }
        StringBuilder sbC = o1.c("index can't be >= size: ", i10, " >= ");
        sbC.append(this.size);
        throw new IndexOutOfBoundsException(sbC.toString());
    }

    public int hashCode() {
        if (!this.ordered) {
            return super.hashCode();
        }
        int[] iArr = this.items;
        int i10 = this.size;
        int i11 = 1;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    public void incr(int i10, int i11) {
        if (i10 < this.size) {
            int[] iArr = this.items;
            iArr[i10] = iArr[i10] + i11;
        } else {
            StringBuilder sbC = o1.c("index can't be >= size: ", i10, " >= ");
            sbC.append(this.size);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
    }

    public int indexOf(int i10) {
        int[] iArr = this.items;
        int i11 = this.size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (iArr[i12] == i10) {
                return i12;
            }
        }
        return -1;
    }

    public void insert(int i10, int i11) {
        int i12 = this.size;
        if (i10 > i12) {
            StringBuilder sbC = o1.c("index can't be > size: ", i10, " > ");
            sbC.append(this.size);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        int[] iArrResize = this.items;
        if (i12 == iArrResize.length) {
            iArrResize = resize(Math.max(8, (int) (i12 * 1.75f)));
        }
        if (this.ordered) {
            System.arraycopy(iArrResize, i10, iArrResize, i10 + 1, this.size - i10);
        } else {
            iArrResize[this.size] = iArrResize[i10];
        }
        this.size++;
        iArrResize[i10] = i11;
    }

    public int lastIndexOf(int i10) {
        int[] iArr = this.items;
        for (int i11 = this.size - 1; i11 >= 0; i11--) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public void mul(int i10, int i11) {
        if (i10 < this.size) {
            int[] iArr = this.items;
            iArr[i10] = iArr[i10] * i11;
        } else {
            StringBuilder sbC = o1.c("index can't be >= size: ", i10, " >= ");
            sbC.append(this.size);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
    }

    public int peek() {
        return this.items[this.size - 1];
    }

    public int pop() {
        int[] iArr = this.items;
        int i10 = this.size - 1;
        this.size = i10;
        return iArr[i10];
    }

    public boolean removeAll(IntArray intArray) {
        int i10 = this.size;
        int[] iArr = this.items;
        int i11 = intArray.size;
        int i12 = i10;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = intArray.get(i13);
            for (int i15 = 0; i15 < i12; i15++) {
                if (i14 == iArr[i15]) {
                    removeIndex(i15);
                    i12--;
                    break;
                }
            }
        }
        return i12 != i10;
    }

    public int removeIndex(int i10) {
        int i11 = this.size;
        if (i10 >= i11) {
            StringBuilder sbC = o1.c("index can't be >= size: ", i10, " >= ");
            sbC.append(this.size);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        int[] iArr = this.items;
        int i12 = iArr[i10];
        int i13 = i11 - 1;
        this.size = i13;
        if (this.ordered) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, i13 - i10);
        } else {
            iArr[i10] = iArr[i13];
        }
        return i12;
    }

    public void removeRange(int i10, int i11) {
        int i12 = this.size;
        if (i11 >= i12) {
            StringBuilder sbC = o1.c("end can't be >= size: ", i11, " >= ");
            sbC.append(this.size);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        if (i10 > i11) {
            throw new IndexOutOfBoundsException(n1.e("start can't be > end: ", i10, " > ", i11));
        }
        int i13 = (i11 - i10) + 1;
        int i14 = i12 - i13;
        if (this.ordered) {
            int[] iArr = this.items;
            int i15 = i13 + i10;
            System.arraycopy(iArr, i15, iArr, i10, i12 - i15);
        } else {
            int iMax = Math.max(i14, i11 + 1);
            int[] iArr2 = this.items;
            System.arraycopy(iArr2, iMax, iArr2, i10, i12 - iMax);
        }
        this.size = i14;
    }

    public boolean removeValue(int i10) {
        int[] iArr = this.items;
        int i11 = this.size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (iArr[i12] == i10) {
                removeIndex(i12);
                return true;
            }
        }
        return false;
    }

    public int[] resize(int i10) {
        int[] iArr = new int[i10];
        System.arraycopy(this.items, 0, iArr, 0, Math.min(this.size, i10));
        this.items = iArr;
        return iArr;
    }

    public void reverse() {
        int[] iArr = this.items;
        int i10 = this.size;
        int i11 = i10 - 1;
        int i12 = i10 / 2;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i11 - i13;
            int i15 = iArr[i13];
            iArr[i13] = iArr[i14];
            iArr[i14] = i15;
        }
    }

    public void set(int i10, int i11) {
        if (i10 < this.size) {
            this.items[i10] = i11;
        } else {
            StringBuilder sbC = o1.c("index can't be >= size: ", i10, " >= ");
            sbC.append(this.size);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
    }

    public int[] setSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(g0.c("newSize must be >= 0: ", i10));
        }
        if (i10 > this.items.length) {
            resize(Math.max(8, i10));
        }
        this.size = i10;
        return this.items;
    }

    public int[] shrink() {
        int length = this.items.length;
        int i10 = this.size;
        if (length != i10) {
            resize(i10);
        }
        return this.items;
    }

    public void sort() {
        Arrays.sort(this.items, 0, this.size);
    }

    public void swap(int i10, int i11) {
        int i12 = this.size;
        if (i10 >= i12) {
            StringBuilder sbC = o1.c("first can't be >= size: ", i10, " >= ");
            sbC.append(this.size);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        if (i11 >= i12) {
            StringBuilder sbC2 = o1.c("second can't be >= size: ", i11, " >= ");
            sbC2.append(this.size);
            throw new IndexOutOfBoundsException(sbC2.toString());
        }
        int[] iArr = this.items;
        int i13 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i13;
    }

    public int[] toArray() {
        int i10 = this.size;
        int[] iArr = new int[i10];
        System.arraycopy(this.items, 0, iArr, 0, i10);
        return iArr;
    }

    public String toString() {
        if (this.size == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        int[] iArr = this.items;
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb2.append(iArr[0]);
        for (int i10 = 1; i10 < this.size; i10++) {
            sb2.append(", ");
            sb2.append(iArr[i10]);
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    public void truncate(int i10) {
        if (this.size > i10) {
            this.size = i10;
        }
    }

    public IntArray(int i10) {
        this(true, i10);
    }

    public void addAll(IntArray intArray, int i10, int i11) {
        if (i10 + i11 <= intArray.size) {
            addAll(intArray.items, i10, i11);
        } else {
            StringBuilder sbE = h.e("offset + length must be <= size: ", i10, " + ", i11, " <= ");
            sbE.append(intArray.size);
            throw new IllegalArgumentException(sbE.toString());
        }
    }

    public IntArray(boolean z10, int i10) {
        this.ordered = z10;
        this.items = new int[i10];
    }

    public void add(int i10, int i11) {
        int[] iArrResize = this.items;
        int i12 = this.size;
        if (i12 + 1 >= iArrResize.length) {
            iArrResize = resize(Math.max(8, (int) (i12 * 1.75f)));
        }
        int i13 = this.size;
        iArrResize[i13] = i10;
        iArrResize[i13 + 1] = i11;
        this.size = i13 + 2;
    }

    public IntArray(IntArray intArray) {
        this.ordered = intArray.ordered;
        int i10 = intArray.size;
        this.size = i10;
        int[] iArr = new int[i10];
        this.items = iArr;
        System.arraycopy(intArray.items, 0, iArr, 0, i10);
    }

    public void add(int i10, int i11, int i12) {
        int[] iArrResize = this.items;
        int i13 = this.size;
        if (i13 + 2 >= iArrResize.length) {
            iArrResize = resize(Math.max(8, (int) (i13 * 1.75f)));
        }
        int i14 = this.size;
        iArrResize[i14] = i10;
        iArrResize[i14 + 1] = i11;
        iArrResize[i14 + 2] = i12;
        this.size = i14 + 3;
    }

    public IntArray(int[] iArr) {
        this(true, iArr, 0, iArr.length);
    }

    public String toString(String str) {
        if (this.size == 0) {
            return "";
        }
        int[] iArr = this.items;
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(iArr[0]);
        for (int i10 = 1; i10 < this.size; i10++) {
            sb2.append(str);
            sb2.append(iArr[i10]);
        }
        return sb2.toString();
    }

    public IntArray(boolean z10, int[] iArr, int i10, int i11) {
        this(z10, i11);
        this.size = i11;
        System.arraycopy(iArr, i10, this.items, 0, i11);
    }

    public void add(int i10, int i11, int i12, int i13) {
        int[] iArrResize = this.items;
        int i14 = this.size;
        if (i14 + 3 >= iArrResize.length) {
            iArrResize = resize(Math.max(8, (int) (i14 * 1.8f)));
        }
        int i15 = this.size;
        iArrResize[i15] = i10;
        iArrResize[i15 + 1] = i11;
        iArrResize[i15 + 2] = i12;
        iArrResize[i15 + 3] = i13;
        this.size = i15 + 4;
    }

    public void addAll(int... iArr) {
        addAll(iArr, 0, iArr.length);
    }

    public void addAll(int[] iArr, int i10, int i11) {
        int[] iArrResize = this.items;
        int i12 = this.size + i11;
        if (i12 > iArrResize.length) {
            iArrResize = resize(Math.max(8, (int) (i12 * 1.75f)));
        }
        System.arraycopy(iArr, i10, iArrResize, this.size, i11);
        this.size += i11;
    }
}
