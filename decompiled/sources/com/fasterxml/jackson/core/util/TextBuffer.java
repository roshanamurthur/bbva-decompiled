package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.io.NumberInput;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public final class TextBuffer {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final char[] f43155l = new char[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BufferRecycler f43156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public char[] f43157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<char[]> f43160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f43161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f43162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char[] f43163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f43164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f43165j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public char[] f43166k;

    public TextBuffer(BufferRecycler bufferRecycler) {
        this.f43156a = bufferRecycler;
    }

    public final char[] a(int i10) {
        BufferRecycler bufferRecycler = this.f43156a;
        return bufferRecycler != null ? bufferRecycler.allocCharBuffer(2, i10) : new char[Math.max(i10, 1000)];
    }

    public void append(char c10) {
        if (this.f43158c >= 0) {
            d(16);
        }
        this.f43165j = null;
        this.f43166k = null;
        char[] cArr = this.f43163h;
        if (this.f43164i >= cArr.length) {
            c();
            cArr = this.f43163h;
        }
        int i10 = this.f43164i;
        this.f43164i = i10 + 1;
        cArr[i10] = c10;
    }

    public final void b() {
        this.f43161f = false;
        this.f43160e.clear();
        this.f43162g = 0;
        this.f43164i = 0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026 A[PHI: r1
      0x0026: PHI (r1v8 int) = (r1v6 int), (r1v7 int) binds: [B:6:0x0024, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    public final void c() {
        if (this.f43160e == null) {
            this.f43160e = new ArrayList<>();
        }
        char[] cArr = this.f43163h;
        this.f43161f = true;
        this.f43160e.add(cArr);
        this.f43162g += cArr.length;
        this.f43164i = 0;
        int length = cArr.length;
        int i10 = length + (length >> 1);
        int i11 = 1000;
        if (i10 < 1000) {
            i10 = i11;
        } else {
            i11 = 262144;
            if (i10 > 262144) {
                i10 = i11;
            }
        }
        this.f43163h = new char[i10];
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    public char[] contentsAsArray() {
        int i10;
        char[] cArrCopyOf = this.f43166k;
        if (cArrCopyOf == null) {
            String str = this.f43165j;
            if (str != null) {
                cArrCopyOf = str.toCharArray();
            } else {
                int i11 = this.f43158c;
                char[] cArr = f43155l;
                if (i11 >= 0) {
                    int i12 = this.f43159d;
                    if (i12 < 1) {
                        cArrCopyOf = cArr;
                    } else {
                        cArrCopyOf = i11 == 0 ? Arrays.copyOf(this.f43157b, i12) : Arrays.copyOfRange(this.f43157b, i11, i12 + i11);
                    }
                } else {
                    int size = size();
                    if (size < 1) {
                        cArrCopyOf = cArr;
                    } else {
                        cArrCopyOf = new char[size];
                        ArrayList<char[]> arrayList = this.f43160e;
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            i10 = 0;
                            for (int i13 = 0; i13 < size2; i13++) {
                                char[] cArr2 = this.f43160e.get(i13);
                                int length = cArr2.length;
                                System.arraycopy(cArr2, 0, cArrCopyOf, i10, length);
                                i10 += length;
                            }
                        } else {
                            i10 = 0;
                        }
                        System.arraycopy(this.f43163h, 0, cArrCopyOf, i10, this.f43164i);
                    }
                }
            }
            this.f43166k = cArrCopyOf;
        }
        return cArrCopyOf;
    }

    public BigDecimal contentsAsDecimal() throws NumberFormatException {
        char[] cArr;
        char[] cArr2;
        char[] cArr3 = this.f43166k;
        if (cArr3 != null) {
            return NumberInput.parseBigDecimal(cArr3);
        }
        int i10 = this.f43158c;
        if (i10 < 0 || (cArr2 = this.f43157b) == null) {
            return (this.f43162g != 0 || (cArr = this.f43163h) == null) ? NumberInput.parseBigDecimal(contentsAsArray()) : NumberInput.parseBigDecimal(cArr, 0, this.f43164i);
        }
        return NumberInput.parseBigDecimal(cArr2, i10, this.f43159d);
    }

    public double contentsAsDouble() throws NumberFormatException {
        return NumberInput.parseDouble(contentsAsString());
    }

    public int contentsAsInt(boolean z10) {
        char[] cArr;
        int i10 = this.f43158c;
        if (i10 < 0 || (cArr = this.f43157b) == null) {
            return z10 ? -NumberInput.parseInt(this.f43163h, 1, this.f43164i - 1) : NumberInput.parseInt(this.f43163h, 0, this.f43164i);
        }
        return z10 ? -NumberInput.parseInt(cArr, i10 + 1, this.f43159d - 1) : NumberInput.parseInt(cArr, i10, this.f43159d);
    }

    public long contentsAsLong(boolean z10) {
        char[] cArr;
        int i10 = this.f43158c;
        if (i10 < 0 || (cArr = this.f43157b) == null) {
            return z10 ? -NumberInput.parseLong(this.f43163h, 1, this.f43164i - 1) : NumberInput.parseLong(this.f43163h, 0, this.f43164i);
        }
        return z10 ? -NumberInput.parseLong(cArr, i10 + 1, this.f43159d - 1) : NumberInput.parseLong(cArr, i10, this.f43159d);
    }

    public String contentsAsString() {
        if (this.f43165j == null) {
            char[] cArr = this.f43166k;
            if (cArr != null) {
                this.f43165j = new String(cArr);
            } else {
                int i10 = this.f43158c;
                if (i10 >= 0) {
                    int i11 = this.f43159d;
                    if (i11 < 1) {
                        this.f43165j = "";
                        return "";
                    }
                    this.f43165j = new String(this.f43157b, i10, i11);
                } else {
                    int i12 = this.f43162g;
                    int i13 = this.f43164i;
                    if (i12 == 0) {
                        this.f43165j = i13 != 0 ? new String(this.f43163h, 0, i13) : "";
                    } else {
                        StringBuilder sb2 = new StringBuilder(i12 + i13);
                        ArrayList<char[]> arrayList = this.f43160e;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i14 = 0; i14 < size; i14++) {
                                char[] cArr2 = this.f43160e.get(i14);
                                sb2.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb2.append(this.f43163h, 0, this.f43164i);
                        this.f43165j = sb2.toString();
                    }
                }
            }
        }
        return this.f43165j;
    }

    public int contentsToWriter(Writer writer) throws IOException {
        int i10;
        char[] cArr = this.f43166k;
        if (cArr != null) {
            writer.write(cArr);
            return this.f43166k.length;
        }
        String str = this.f43165j;
        if (str != null) {
            writer.write(str);
            return this.f43165j.length();
        }
        int i11 = this.f43158c;
        if (i11 >= 0) {
            int i12 = this.f43159d;
            if (i12 > 0) {
                writer.write(this.f43157b, i11, i12);
            }
            return i12;
        }
        ArrayList<char[]> arrayList = this.f43160e;
        if (arrayList != null) {
            int size = arrayList.size();
            i10 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                char[] cArr2 = this.f43160e.get(i13);
                int length = cArr2.length;
                writer.write(cArr2, 0, length);
                i10 += length;
            }
        } else {
            i10 = 0;
        }
        int i14 = this.f43164i;
        if (i14 <= 0) {
            return i10;
        }
        writer.write(this.f43163h, 0, i14);
        return i10 + i14;
    }

    public final void d(int i10) {
        int i11 = this.f43159d;
        this.f43159d = 0;
        char[] cArr = this.f43157b;
        this.f43157b = null;
        int i12 = this.f43158c;
        this.f43158c = -1;
        int i13 = i10 + i11;
        char[] cArr2 = this.f43163h;
        if (cArr2 == null || i13 > cArr2.length) {
            this.f43163h = a(i13);
        }
        if (i11 > 0) {
            System.arraycopy(cArr, i12, this.f43163h, 0, i11);
        }
        this.f43162g = 0;
        this.f43164i = i11;
    }

    public char[] emptyAndGetCurrentSegment() {
        this.f43158c = -1;
        this.f43164i = 0;
        this.f43159d = 0;
        this.f43157b = null;
        this.f43165j = null;
        this.f43166k = null;
        if (this.f43161f) {
            b();
        }
        char[] cArr = this.f43163h;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrA = a(0);
        this.f43163h = cArrA;
        return cArrA;
    }

    public void ensureNotShared() {
        if (this.f43158c >= 0) {
            d(16);
        }
    }

    public char[] expandCurrentSegment() {
        char[] cArr = this.f43163h;
        int length = cArr.length;
        int i10 = (length >> 1) + length;
        if (i10 > 262144) {
            i10 = (length >> 2) + length;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, i10);
        this.f43163h = cArrCopyOf;
        return cArrCopyOf;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0027 A[PHI: r1
      0x0027: PHI (r1v7 int) = (r1v5 int), (r1v6 int) binds: [B:6:0x0025, B:9:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    public char[] finishCurrentSegment() {
        if (this.f43160e == null) {
            this.f43160e = new ArrayList<>();
        }
        this.f43161f = true;
        this.f43160e.add(this.f43163h);
        int length = this.f43163h.length;
        this.f43162g += length;
        this.f43164i = 0;
        int i10 = length + (length >> 1);
        int i11 = 1000;
        if (i10 < 1000) {
            i10 = i11;
        } else {
            i11 = 262144;
            if (i10 > 262144) {
                i10 = i11;
            }
        }
        char[] cArr = new char[i10];
        this.f43163h = cArr;
        return cArr;
    }

    public char[] getBufferWithoutReset() {
        return this.f43163h;
    }

    public char[] getCurrentSegment() {
        if (this.f43158c >= 0) {
            d(1);
        } else {
            char[] cArr = this.f43163h;
            if (cArr == null) {
                this.f43163h = a(0);
            } else if (this.f43164i >= cArr.length) {
                c();
            }
        }
        return this.f43163h;
    }

    public int getCurrentSegmentSize() {
        return this.f43164i;
    }

    public char[] getTextBuffer() {
        if (this.f43158c >= 0) {
            return this.f43157b;
        }
        char[] cArr = this.f43166k;
        if (cArr != null) {
            return cArr;
        }
        String str = this.f43165j;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.f43166k = charArray;
            return charArray;
        }
        if (this.f43161f) {
            return contentsAsArray();
        }
        char[] cArr2 = this.f43163h;
        return cArr2 == null ? f43155l : cArr2;
    }

    public int getTextOffset() {
        int i10 = this.f43158c;
        if (i10 >= 0) {
            return i10;
        }
        return 0;
    }

    public boolean hasTextAsCharacters() {
        return this.f43158c >= 0 || this.f43166k != null || this.f43165j == null;
    }

    public void releaseBuffers() {
        BufferRecycler bufferRecycler = this.f43156a;
        if (bufferRecycler == null) {
            resetWithEmpty();
        } else if (this.f43163h != null) {
            resetWithEmpty();
            char[] cArr = this.f43163h;
            this.f43163h = null;
            bufferRecycler.releaseCharBuffer(2, cArr);
        }
    }

    public void resetWith(char c10) {
        this.f43158c = -1;
        this.f43159d = 0;
        this.f43165j = null;
        this.f43166k = null;
        if (this.f43161f) {
            b();
        } else if (this.f43163h == null) {
            this.f43163h = a(1);
        }
        this.f43163h[0] = c10;
        this.f43162g = 1;
        this.f43164i = 1;
    }

    public void resetWithCopy(char[] cArr, int i10, int i11) {
        this.f43157b = null;
        this.f43158c = -1;
        this.f43159d = 0;
        this.f43165j = null;
        this.f43166k = null;
        if (this.f43161f) {
            b();
        } else if (this.f43163h == null) {
            this.f43163h = a(i11);
        }
        this.f43162g = 0;
        this.f43164i = 0;
        append(cArr, i10, i11);
    }

    public void resetWithEmpty() {
        this.f43158c = -1;
        this.f43164i = 0;
        this.f43159d = 0;
        this.f43157b = null;
        this.f43165j = null;
        this.f43166k = null;
        if (this.f43161f) {
            b();
        }
    }

    public void resetWithShared(char[] cArr, int i10, int i11) {
        this.f43165j = null;
        this.f43166k = null;
        this.f43157b = cArr;
        this.f43158c = i10;
        this.f43159d = i11;
        if (this.f43161f) {
            b();
        }
    }

    public void resetWithString(String str) {
        this.f43157b = null;
        this.f43158c = -1;
        this.f43159d = 0;
        this.f43165j = str;
        this.f43166k = null;
        if (this.f43161f) {
            b();
        }
        this.f43164i = 0;
    }

    public String setCurrentAndReturn(int i10) {
        this.f43164i = i10;
        if (this.f43162g > 0) {
            return contentsAsString();
        }
        String str = i10 == 0 ? "" : new String(this.f43163h, 0, i10);
        this.f43165j = str;
        return str;
    }

    public void setCurrentLength(int i10) {
        this.f43164i = i10;
    }

    public int size() {
        if (this.f43158c >= 0) {
            return this.f43159d;
        }
        char[] cArr = this.f43166k;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.f43165j;
        return str != null ? str.length() : this.f43162g + this.f43164i;
    }

    public String toString() {
        return contentsAsString();
    }

    public char[] expandCurrentSegment(int i10) {
        char[] cArr = this.f43163h;
        if (cArr.length >= i10) {
            return cArr;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, i10);
        this.f43163h = cArrCopyOf;
        return cArrCopyOf;
    }

    public void append(char[] cArr, int i10, int i11) {
        if (this.f43158c >= 0) {
            d(i11);
        }
        this.f43165j = null;
        this.f43166k = null;
        char[] cArr2 = this.f43163h;
        int length = cArr2.length;
        int i12 = this.f43164i;
        int i13 = length - i12;
        if (i13 >= i11) {
            System.arraycopy(cArr, i10, cArr2, i12, i11);
            this.f43164i += i11;
            return;
        }
        if (i13 > 0) {
            System.arraycopy(cArr, i10, cArr2, i12, i13);
            i10 += i13;
            i11 -= i13;
        }
        do {
            c();
            int iMin = Math.min(this.f43163h.length, i11);
            System.arraycopy(cArr, i10, this.f43163h, 0, iMin);
            this.f43164i += iMin;
            i10 += iMin;
            i11 -= iMin;
        } while (i11 > 0);
    }

    public void resetWithCopy(String str, int i10, int i11) {
        this.f43157b = null;
        this.f43158c = -1;
        this.f43159d = 0;
        this.f43165j = null;
        this.f43166k = null;
        if (this.f43161f) {
            b();
        } else if (this.f43163h == null) {
            this.f43163h = a(i11);
        }
        this.f43162g = 0;
        this.f43164i = 0;
        append(str, i10, i11);
    }

    public void append(String str, int i10, int i11) {
        if (this.f43158c >= 0) {
            d(i11);
        }
        this.f43165j = null;
        this.f43166k = null;
        char[] cArr = this.f43163h;
        int length = cArr.length;
        int i12 = this.f43164i;
        int i13 = length - i12;
        if (i13 >= i11) {
            str.getChars(i10, i10 + i11, cArr, i12);
            this.f43164i += i11;
            return;
        }
        if (i13 > 0) {
            int i14 = i10 + i13;
            str.getChars(i10, i14, cArr, i12);
            i11 -= i13;
            i10 = i14;
        }
        while (true) {
            c();
            int iMin = Math.min(this.f43163h.length, i11);
            int i15 = i10 + iMin;
            str.getChars(i10, i15, this.f43163h, 0);
            this.f43164i += iMin;
            i11 -= iMin;
            if (i11 <= 0) {
                return;
            } else {
                i10 = i15;
            }
        }
    }
}
