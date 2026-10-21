package com.google.crypto.tink.shaded.protobuf;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: RopeByteString.java */
/* JADX INFO: loaded from: classes10.dex */
public final class p0 extends ByteString {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final int[] f47248x0 = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f47249s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final ByteString f47250t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final ByteString f47251u0;
    public final int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final int f47252w0;

    /* JADX INFO: compiled from: RopeByteString.java */
    public class a extends ByteString.c {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final c f47253p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public ByteString.ByteIterator f47254q0 = a();

        public a(p0 p0Var) {
            this.f47253p0 = new c(p0Var);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.google.crypto.tink.shaded.protobuf.ByteString$ByteIterator] */
        public final ByteString.ByteIterator a() {
            c cVar = this.f47253p0;
            if (cVar.hasNext()) {
                return cVar.next().iterator2();
            }
            return null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f47254q0 != null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.ByteIterator
        public final byte nextByte() {
            ByteString.ByteIterator byteIterator = this.f47254q0;
            if (byteIterator == null) {
                throw new NoSuchElementException();
            }
            byte bNextByte = byteIterator.nextByte();
            if (!this.f47254q0.hasNext()) {
                this.f47254q0 = a();
            }
            return bNextByte;
        }
    }

    /* JADX INFO: compiled from: RopeByteString.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayDeque<ByteString> f47255a = new ArrayDeque<>();

        public final void a(ByteString byteString) {
            if (!byteString.isBalanced()) {
                if (!(byteString instanceof p0)) {
                    throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
                }
                p0 p0Var = (p0) byteString;
                a(p0Var.f47250t0);
                a(p0Var.f47251u0);
                return;
            }
            int iBinarySearch = Arrays.binarySearch(p0.f47248x0, byteString.size());
            if (iBinarySearch < 0) {
                iBinarySearch = (-(iBinarySearch + 1)) - 1;
            }
            int iH = p0.h(iBinarySearch + 1);
            ArrayDeque<ByteString> arrayDeque = this.f47255a;
            if (arrayDeque.isEmpty() || arrayDeque.peek().size() >= iH) {
                arrayDeque.push(byteString);
                return;
            }
            int iH2 = p0.h(iBinarySearch);
            ByteString byteStringPop = arrayDeque.pop();
            while (!arrayDeque.isEmpty() && arrayDeque.peek().size() < iH2) {
                byteStringPop = new p0(arrayDeque.pop(), byteStringPop);
            }
            p0 p0Var2 = new p0(byteStringPop, byteString);
            while (!arrayDeque.isEmpty()) {
                int iBinarySearch2 = Arrays.binarySearch(p0.f47248x0, p0Var2.f47249s0);
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
                }
                if (arrayDeque.peek().size() >= p0.h(iBinarySearch2 + 1)) {
                    break;
                } else {
                    p0Var2 = new p0(arrayDeque.pop(), p0Var2);
                }
            }
            arrayDeque.push(p0Var2);
        }
    }

    /* JADX INFO: compiled from: RopeByteString.java */
    public static final class c implements Iterator<ByteString.g> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ArrayDeque<p0> f47256p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public ByteString.g f47257q0;

        public c(ByteString byteString) {
            if (!(byteString instanceof p0)) {
                this.f47256p0 = null;
                this.f47257q0 = (ByteString.g) byteString;
                return;
            }
            p0 p0Var = (p0) byteString;
            ArrayDeque<p0> arrayDeque = new ArrayDeque<>(p0Var.f47252w0);
            this.f47256p0 = arrayDeque;
            arrayDeque.push(p0Var);
            ByteString byteString2 = p0Var.f47250t0;
            while (byteString2 instanceof p0) {
                p0 p0Var2 = (p0) byteString2;
                this.f47256p0.push(p0Var2);
                byteString2 = p0Var2.f47250t0;
            }
            this.f47257q0 = (ByteString.g) byteString2;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ByteString.g next() {
            ByteString.g gVar;
            ByteString.g gVar2 = this.f47257q0;
            if (gVar2 == null) {
                throw new NoSuchElementException();
            }
            do {
                ArrayDeque<p0> arrayDeque = this.f47256p0;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    gVar = null;
                    break;
                }
                ByteString byteString = arrayDeque.pop().f47251u0;
                while (byteString instanceof p0) {
                    p0 p0Var = (p0) byteString;
                    arrayDeque.push(p0Var);
                    byteString = p0Var.f47250t0;
                }
                gVar = (ByteString.g) byteString;
            } while (gVar.isEmpty());
            this.f47257q0 = gVar;
            return gVar2;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f47257q0 != null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public p0(ByteString byteString, ByteString byteString2) {
        this.f47250t0 = byteString;
        this.f47251u0 = byteString2;
        int size = byteString.size();
        this.v0 = size;
        this.f47249s0 = byteString2.size() + size;
        this.f47252w0 = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    public static int h(int i10) {
        if (i10 >= 47) {
            return Integer.MAX_VALUE;
        }
        return f47248x0[i10];
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final List<ByteBuffer> asReadOnlyByteBufferList() {
        ByteString.g gVar;
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.f47252w0);
        arrayDeque.push(this);
        ByteString byteString = this.f47250t0;
        while (byteString instanceof p0) {
            p0 p0Var = (p0) byteString;
            arrayDeque.push(p0Var);
            byteString = p0Var.f47250t0;
        }
        ByteString.g gVar2 = (ByteString.g) byteString;
        while (true) {
            if (!(gVar2 != null)) {
                return arrayList;
            }
            if (gVar2 == null) {
                throw new NoSuchElementException();
            }
            do {
                if (arrayDeque.isEmpty()) {
                    gVar = null;
                    break;
                }
                ByteString byteString2 = ((p0) arrayDeque.pop()).f47251u0;
                while (byteString2 instanceof p0) {
                    p0 p0Var2 = (p0) byteString2;
                    arrayDeque.push(p0Var2);
                    byteString2 = p0Var2.f47250t0;
                }
                gVar = (ByteString.g) byteString2;
            } while (gVar.isEmpty());
            arrayList.add(gVar2.asReadOnlyByteBuffer());
            gVar2 = gVar;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final byte byteAt(int i10) {
        ByteString.b(i10, this.f47249s0);
        return e(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer) {
        this.f47250t0.copyTo(byteBuffer);
        this.f47251u0.copyTo(byteBuffer);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        ByteString byteString = this.f47250t0;
        int i14 = this.v0;
        if (i13 <= i14) {
            byteString.copyToInternal(bArr, i10, i11, i12);
            return;
        }
        ByteString byteString2 = this.f47251u0;
        if (i10 >= i14) {
            byteString2.copyToInternal(bArr, i10 - i14, i11, i12);
            return;
        }
        int i15 = i14 - i10;
        byteString.copyToInternal(bArr, i10, i11, i15);
        byteString2.copyToInternal(bArr, 0, i11 + i15, i12 - i15);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final byte e(int i10) {
        int i11 = this.v0;
        return i10 < i11 ? this.f47250t0.e(i10) : this.f47251u0.e(i10 - i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final boolean equals(Object obj) {
        ByteString.g next;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        int size = byteString.size();
        int i10 = this.f47249s0;
        if (i10 != size) {
            return false;
        }
        if (i10 == 0) {
            return true;
        }
        int iPeekCachedHashCode = peekCachedHashCode();
        int iPeekCachedHashCode2 = byteString.peekCachedHashCode();
        if (iPeekCachedHashCode != 0 && iPeekCachedHashCode2 != 0 && iPeekCachedHashCode != iPeekCachedHashCode2) {
            return false;
        }
        c cVar = new c(this);
        ByteString.g next2 = cVar.next();
        c cVar2 = new c(byteString);
        ByteString.g next3 = cVar2.next();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int size2 = next2.size() - i11;
            int size3 = next3.size() - i12;
            int iMin = Math.min(size2, size3);
            if (!(i11 == 0 ? next2.h(next3, i12, iMin) : next3.h(next2, i11, iMin))) {
                return false;
            }
            i13 += iMin;
            if (i13 >= i10) {
                if (i13 == i10) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size2) {
                next = cVar.next();
                i11 = 0;
            } else {
                i11 += iMin;
            }
            if (iMin == size3) {
                next2 = next2;
                next2 = next;
                next3 = cVar2.next();
                i12 = 0;
            } else {
                next2 = next2;
                next2 = next;
                i12 += iMin;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final void g(ByteOutput byteOutput) throws IOException {
        this.f47250t0.g(byteOutput);
        this.f47251u0.g(byteOutput);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final int getTreeDepth() {
        return this.f47252w0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final boolean isBalanced() {
        return this.f47249s0 >= h(this.f47252w0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final boolean isValidUtf8() {
        int iPartialIsValidUtf8 = this.f47250t0.partialIsValidUtf8(0, 0, this.v0);
        ByteString byteString = this.f47251u0;
        return byteString.partialIsValidUtf8(iPartialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: iterator */
    public final Iterator<Byte> iterator2() {
        return new a(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.b(asReadOnlyByteBufferList(), true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final InputStream newInput() {
        return new d();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final int partialHash(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        ByteString byteString = this.f47250t0;
        int i14 = this.v0;
        if (i13 <= i14) {
            return byteString.partialHash(i10, i11, i12);
        }
        ByteString byteString2 = this.f47251u0;
        if (i11 >= i14) {
            return byteString2.partialHash(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return byteString2.partialHash(byteString.partialHash(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final int partialIsValidUtf8(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        ByteString byteString = this.f47250t0;
        int i14 = this.v0;
        if (i13 <= i14) {
            return byteString.partialIsValidUtf8(i10, i11, i12);
        }
        ByteString byteString2 = this.f47251u0;
        if (i11 >= i14) {
            return byteString2.partialIsValidUtf8(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return byteString2.partialIsValidUtf8(byteString.partialIsValidUtf8(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final int size() {
        return this.f47249s0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final ByteString substring(int i10, int i11) {
        int i12 = this.f47249s0;
        int iC = ByteString.c(i10, i11, i12);
        if (iC == 0) {
            return ByteString.EMPTY;
        }
        if (iC == i12) {
            return this;
        }
        ByteString byteString = this.f47250t0;
        int i13 = this.v0;
        if (i11 <= i13) {
            return byteString.substring(i10, i11);
        }
        ByteString byteString2 = this.f47251u0;
        return i10 >= i13 ? byteString2.substring(i10 - i13, i11 - i13) : new p0(byteString.substring(i10), byteString2.substring(0, i11 - i13));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    public Object writeReplace() {
        return new ByteString.h(toByteArray());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final void writeTo(OutputStream outputStream) throws IOException {
        this.f47250t0.writeTo(outputStream);
        this.f47251u0.writeTo(outputStream);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
    public final Iterator<Byte> iterator2() {
        return new a(this);
    }

    /* JADX INFO: compiled from: RopeByteString.java */
    public class d extends InputStream {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public c f47258p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public ByteString.g f47259q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f47260r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f47261s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f47262t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f47263u0;

        public d() {
            c cVar = new c(p0.this);
            this.f47258p0 = cVar;
            ByteString.g next = cVar.next();
            this.f47259q0 = next;
            this.f47260r0 = next.size();
            this.f47261s0 = 0;
            this.f47262t0 = 0;
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            return p0.this.f47249s0 - (this.f47262t0 + this.f47261s0);
        }

        public final void b() {
            if (this.f47259q0 != null) {
                int i10 = this.f47261s0;
                int i11 = this.f47260r0;
                if (i10 == i11) {
                    this.f47262t0 += i11;
                    this.f47261s0 = 0;
                    if (!this.f47258p0.hasNext()) {
                        this.f47259q0 = null;
                        this.f47260r0 = 0;
                    } else {
                        ByteString.g next = this.f47258p0.next();
                        this.f47259q0 = next;
                        this.f47260r0 = next.size();
                    }
                }
            }
        }

        public final int c(int i10, int i11, byte[] bArr) {
            int i12 = i11;
            while (i12 > 0) {
                b();
                if (this.f47259q0 == null) {
                    break;
                }
                int iMin = Math.min(this.f47260r0 - this.f47261s0, i12);
                if (bArr != null) {
                    this.f47259q0.copyTo(bArr, this.f47261s0, i10, iMin);
                    i10 += iMin;
                }
                this.f47261s0 += iMin;
                i12 -= iMin;
            }
            return i11 - i12;
        }

        @Override // java.io.InputStream
        public final void mark(int i10) {
            this.f47263u0 = this.f47262t0 + this.f47261s0;
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) {
            bArr.getClass();
            if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
                throw new IndexOutOfBoundsException();
            }
            int iC = c(i10, i11, bArr);
            if (iC != 0) {
                return iC;
            }
            if (i11 <= 0) {
                if (p0.this.f47249s0 - (this.f47262t0 + this.f47261s0) != 0) {
                    return iC;
                }
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() {
            c cVar = new c(p0.this);
            this.f47258p0 = cVar;
            ByteString.g next = cVar.next();
            this.f47259q0 = next;
            this.f47260r0 = next.size();
            this.f47261s0 = 0;
            this.f47262t0 = 0;
            c(0, this.f47263u0, null);
        }

        @Override // java.io.InputStream
        public final long skip(long j10) {
            if (j10 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j10 > 2147483647L) {
                j10 = 2147483647L;
            }
            return c(0, (int) j10, null);
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            b();
            ByteString.g gVar = this.f47259q0;
            if (gVar == null) {
                return -1;
            }
            int i10 = this.f47261s0;
            this.f47261s0 = i10 + 1;
            return gVar.byteAt(i10) & 255;
        }
    }
}
