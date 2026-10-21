package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* JADX INFO: compiled from: RopeByteString.java */
/* JADX INFO: loaded from: classes12.dex */
public final class b extends ByteString {
    public static final int[] v0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f81426p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ByteString f81427q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ByteString f81428r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f81429s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f81430t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f81431u0 = 0;

    /* JADX INFO: compiled from: RopeByteString.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Stack<ByteString> f81432a = new Stack<>();

        public final void a(ByteString byteString) {
            if (!byteString.isBalanced()) {
                if (!(byteString instanceof b)) {
                    String strValueOf = String.valueOf(byteString.getClass());
                    throw new IllegalArgumentException(ad.d.f(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
                }
                b bVar = (b) byteString;
                a(bVar.f81427q0);
                a(bVar.f81428r0);
                return;
            }
            int size = byteString.size();
            int[] iArr = b.v0;
            int iBinarySearch = Arrays.binarySearch(iArr, size);
            if (iBinarySearch < 0) {
                iBinarySearch = (-(iBinarySearch + 1)) - 1;
            }
            int i10 = iArr[iBinarySearch + 1];
            Stack<ByteString> stack = this.f81432a;
            if (stack.isEmpty() || stack.peek().size() >= i10) {
                stack.push(byteString);
                return;
            }
            int i11 = iArr[iBinarySearch];
            ByteString byteStringPop = stack.pop();
            while (!stack.isEmpty() && stack.peek().size() < i11) {
                byteStringPop = new b(stack.pop(), byteStringPop);
            }
            b bVar2 = new b(byteStringPop, byteString);
            while (!stack.isEmpty()) {
                int size2 = bVar2.size();
                int[] iArr2 = b.v0;
                int iBinarySearch2 = Arrays.binarySearch(iArr2, size2);
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
                }
                if (stack.peek().size() >= iArr2[iBinarySearch2 + 1]) {
                    break;
                } else {
                    bVar2 = new b(stack.pop(), bVar2);
                }
            }
            stack.push(bVar2);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: RopeByteString.java */
    public static class C0443b implements Iterator<kotlin.reflect.jvm.internal.impl.protobuf.a> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Stack<b> f81433p0 = new Stack<>();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public kotlin.reflect.jvm.internal.impl.protobuf.a f81434q0;

        public C0443b(ByteString byteString) {
            while (byteString instanceof b) {
                b bVar = (b) byteString;
                this.f81433p0.push(bVar);
                byteString = bVar.f81427q0;
            }
            this.f81434q0 = (kotlin.reflect.jvm.internal.impl.protobuf.a) byteString;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f81434q0 != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public kotlin.reflect.jvm.internal.impl.protobuf.a next() {
            kotlin.reflect.jvm.internal.impl.protobuf.a aVar;
            kotlin.reflect.jvm.internal.impl.protobuf.a aVar2 = this.f81434q0;
            if (aVar2 == null) {
                throw new NoSuchElementException();
            }
            do {
                Stack<b> stack = this.f81433p0;
                if (stack.isEmpty()) {
                    aVar = null;
                    break;
                }
                ByteString byteString = stack.pop().f81428r0;
                while (byteString instanceof b) {
                    b bVar = (b) byteString;
                    stack.push(bVar);
                    byteString = bVar.f81427q0;
                }
                aVar = (kotlin.reflect.jvm.internal.impl.protobuf.a) byteString;
            } while (aVar.isEmpty());
            this.f81434q0 = aVar;
            return aVar2;
        }
    }

    /* JADX INFO: compiled from: RopeByteString.java */
    public class c implements ByteString.ByteIterator {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final C0443b f81435p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public ByteString.ByteIterator f81436q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f81437r0;

        /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.reflect.jvm.internal.impl.protobuf.ByteString$ByteIterator] */
        public c(b bVar) {
            C0443b c0443b = new C0443b(bVar);
            this.f81435p0 = c0443b;
            this.f81436q0 = c0443b.next().iterator();
            this.f81437r0 = bVar.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f81437r0 > 0;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.reflect.jvm.internal.impl.protobuf.ByteString$ByteIterator] */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            if (!this.f81436q0.hasNext()) {
                this.f81436q0 = this.f81435p0.next().iterator();
            }
            this.f81437r0--;
            return this.f81436q0.nextByte();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public Byte next() {
            return Byte.valueOf(nextByte());
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 1;
        while (i10 > 0) {
            arrayList.add(Integer.valueOf(i10));
            int i12 = i11 + i10;
            i11 = i10;
            i10 = i12;
        }
        arrayList.add(Integer.MAX_VALUE);
        v0 = new int[arrayList.size()];
        int i13 = 0;
        while (true) {
            int[] iArr = v0;
            if (i13 >= iArr.length) {
                return;
            }
            iArr[i13] = ((Integer) arrayList.get(i13)).intValue();
            i13++;
        }
    }

    public b(ByteString byteString, ByteString byteString2) {
        this.f81427q0 = byteString;
        this.f81428r0 = byteString2;
        int size = byteString.size();
        this.f81429s0 = size;
        this.f81426p0 = byteString2.size() + size;
        this.f81430t0 = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final void b(OutputStream outputStream, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        ByteString byteString = this.f81427q0;
        int i13 = this.f81429s0;
        if (i12 <= i13) {
            byteString.b(outputStream, i10, i11);
            return;
        }
        ByteString byteString2 = this.f81428r0;
        if (i10 >= i13) {
            byteString2.b(outputStream, i10 - i13, i11);
            return;
        }
        int i14 = i13 - i10;
        byteString.b(outputStream, i10, i14);
        byteString2.b(outputStream, 0, i11 - i14);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        ByteString byteString = this.f81427q0;
        int i14 = this.f81429s0;
        if (i13 <= i14) {
            byteString.copyToInternal(bArr, i10, i11, i12);
            return;
        }
        ByteString byteString2 = this.f81428r0;
        if (i10 >= i14) {
            byteString2.copyToInternal(bArr, i10 - i14, i11, i12);
            return;
        }
        int i15 = i14 - i10;
        byteString.copyToInternal(bArr, i10, i11, i15);
        byteString2.copyToInternal(bArr, 0, i11 + i15, i12 - i15);
    }

    public boolean equals(Object obj) {
        int iPeekCachedHashCode;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        int size = byteString.size();
        int i10 = this.f81426p0;
        if (i10 != size) {
            return false;
        }
        if (i10 == 0) {
            return true;
        }
        if (this.f81431u0 != 0 && (iPeekCachedHashCode = byteString.peekCachedHashCode()) != 0 && this.f81431u0 != iPeekCachedHashCode) {
            return false;
        }
        C0443b c0443b = new C0443b(this);
        kotlin.reflect.jvm.internal.impl.protobuf.a next = c0443b.next();
        C0443b c0443b2 = new C0443b(byteString);
        kotlin.reflect.jvm.internal.impl.protobuf.a next2 = c0443b2.next();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int size2 = next.size() - i11;
            int size3 = next2.size() - i12;
            int iMin = Math.min(size2, size3);
            if (!(i11 == 0 ? next.c(next2, i12, iMin) : next2.c(next, i11, iMin))) {
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
                next = c0443b.next();
                i11 = 0;
            } else {
                i11 += iMin;
            }
            if (iMin == size3) {
                next2 = c0443b2.next();
                i12 = 0;
            } else {
                i12 += iMin;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int getTreeDepth() {
        return this.f81430t0;
    }

    public int hashCode() {
        int iPartialHash = this.f81431u0;
        if (iPartialHash == 0) {
            int i10 = this.f81426p0;
            iPartialHash = partialHash(i10, 0, i10);
            if (iPartialHash == 0) {
                iPartialHash = 1;
            }
            this.f81431u0 = iPartialHash;
        }
        return iPartialHash;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final boolean isBalanced() {
        return this.f81426p0 >= v0[this.f81430t0];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public boolean isValidUtf8() {
        int iPartialIsValidUtf8 = this.f81427q0.partialIsValidUtf8(0, 0, this.f81429s0);
        ByteString byteString = this.f81428r0;
        return byteString.partialIsValidUtf8(iPartialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(new d());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int partialHash(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        ByteString byteString = this.f81427q0;
        int i14 = this.f81429s0;
        if (i13 <= i14) {
            return byteString.partialHash(i10, i11, i12);
        }
        ByteString byteString2 = this.f81428r0;
        if (i11 >= i14) {
            return byteString2.partialHash(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return byteString2.partialHash(byteString.partialHash(i10, i11, i15), 0, i12 - i15);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int partialIsValidUtf8(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        ByteString byteString = this.f81427q0;
        int i14 = this.f81429s0;
        if (i13 <= i14) {
            return byteString.partialIsValidUtf8(i10, i11, i12);
        }
        ByteString byteString2 = this.f81428r0;
        if (i11 >= i14) {
            return byteString2.partialIsValidUtf8(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return byteString2.partialIsValidUtf8(byteString.partialIsValidUtf8(i10, i11, i15), 0, i12 - i15);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int peekCachedHashCode() {
        return this.f81431u0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.f81426p0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public String toString(String str) throws UnsupportedEncodingException {
        return new String(toByteArray(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new c(this);
    }

    /* JADX INFO: compiled from: RopeByteString.java */
    public class d extends InputStream {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public C0443b f81438p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public kotlin.reflect.jvm.internal.impl.protobuf.a f81439q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f81440r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f81441s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f81442t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f81443u0;

        public d() {
            C0443b c0443b = new C0443b(b.this);
            this.f81438p0 = c0443b;
            kotlin.reflect.jvm.internal.impl.protobuf.a next = c0443b.next();
            this.f81439q0 = next;
            this.f81440r0 = next.size();
            this.f81441s0 = 0;
            this.f81442t0 = 0;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return b.this.size() - (this.f81442t0 + this.f81441s0);
        }

        public final void b() {
            if (this.f81439q0 != null) {
                int i10 = this.f81441s0;
                int i11 = this.f81440r0;
                if (i10 == i11) {
                    this.f81442t0 += i11;
                    this.f81441s0 = 0;
                    if (!this.f81438p0.hasNext()) {
                        this.f81439q0 = null;
                        this.f81440r0 = 0;
                    } else {
                        kotlin.reflect.jvm.internal.impl.protobuf.a next = this.f81438p0.next();
                        this.f81439q0 = next;
                        this.f81440r0 = next.size();
                    }
                }
            }
        }

        public final int c(int i10, int i11, byte[] bArr) {
            int i12 = i11;
            while (i12 > 0) {
                b();
                if (this.f81439q0 == null) {
                    if (i12 != i11) {
                        break;
                    }
                    return -1;
                }
                int iMin = Math.min(this.f81440r0 - this.f81441s0, i12);
                if (bArr != null) {
                    this.f81439q0.copyTo(bArr, this.f81441s0, i10, iMin);
                    i10 += iMin;
                }
                this.f81441s0 += iMin;
                i12 -= iMin;
            }
            return i11 - i12;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            this.f81443u0 = this.f81442t0 + this.f81441s0;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            bArr.getClass();
            if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
                throw new IndexOutOfBoundsException();
            }
            return c(i10, i11, bArr);
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            C0443b c0443b = new C0443b(b.this);
            this.f81438p0 = c0443b;
            kotlin.reflect.jvm.internal.impl.protobuf.a next = c0443b.next();
            this.f81439q0 = next;
            this.f81440r0 = next.size();
            this.f81441s0 = 0;
            this.f81442t0 = 0;
            c(0, this.f81443u0, null);
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            if (j10 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j10 > 2147483647L) {
                j10 = 2147483647L;
            }
            return c(0, (int) j10, null);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            b();
            kotlin.reflect.jvm.internal.impl.protobuf.a aVar = this.f81439q0;
            if (aVar == null) {
                return -1;
            }
            int i10 = this.f81441s0;
            this.f81441s0 = i10 + 1;
            return aVar.byteAt(i10) & 255;
        }
    }
}
