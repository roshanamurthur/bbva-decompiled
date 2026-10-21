package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ByteString implements Iterable<Byte> {
    public static final ByteString EMPTY = new a(new byte[0]);

    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    public static ByteString a(Iterator<ByteString> it, int i10) {
        if (i10 == 1) {
            return it.next();
        }
        int i11 = i10 >>> 1;
        return a(it, i11).concat(a(it, i10 - i11));
    }

    public static ByteString copyFrom(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new a(bArr2);
    }

    public static ByteString copyFromUtf8(String str) {
        try {
            return new a(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e5) {
            throw new RuntimeException("UTF-8 not supported?", e5);
        }
    }

    public static Output newOutput() {
        return new Output();
    }

    public abstract void b(OutputStream outputStream, int i10, int i11) throws IOException;

    public ByteString concat(ByteString byteString) {
        ByteString byteStringPop;
        int size = size();
        int size2 = byteString.size();
        if (((long) size) + ((long) size2) >= 2147483647L) {
            throw new IllegalArgumentException(ad.d.d(53, "ByteString would be too long: ", size, "+", size2));
        }
        int[] iArr = b.v0;
        b bVar = this instanceof b ? (b) this : null;
        if (byteString.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return byteString;
        }
        int size3 = byteString.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = byteString.size();
            byte[] bArr = new byte[size4 + size5];
            copyTo(bArr, 0, 0, size4);
            byteString.copyTo(bArr, 0, size4, size5);
            return new a(bArr);
        }
        if (bVar != null) {
            ByteString byteString2 = bVar.f81428r0;
            if (byteString.size() + byteString2.size() < 128) {
                int size6 = byteString2.size();
                int size7 = byteString.size();
                byte[] bArr2 = new byte[size6 + size7];
                byteString2.copyTo(bArr2, 0, 0, size6);
                byteString.copyTo(bArr2, 0, size6, size7);
                return new b(bVar.f81427q0, new a(bArr2));
            }
        }
        if (bVar != null) {
            ByteString byteString3 = bVar.f81427q0;
            int treeDepth = byteString3.getTreeDepth();
            ByteString byteString4 = bVar.f81428r0;
            if (treeDepth > byteString4.getTreeDepth()) {
                if (bVar.f81430t0 > byteString.getTreeDepth()) {
                    return new b(byteString3, new b(byteString4, byteString));
                }
            }
        }
        if (size3 >= b.v0[Math.max(getTreeDepth(), byteString.getTreeDepth()) + 1]) {
            byteStringPop = new b(this, byteString);
        } else {
            b.a aVar = new b.a();
            aVar.a(this);
            aVar.a(byteString);
            Stack<ByteString> stack = aVar.f81432a;
            byteStringPop = stack.pop();
            while (!stack.isEmpty()) {
                byteStringPop = new b(stack.pop(), byteStringPop);
            }
        }
        return byteStringPop;
    }

    public void copyTo(byte[] bArr, int i10, int i11, int i12) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(androidx.camera.core.imagecapture.a.a(30, "Source offset < 0: ", i10));
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException(androidx.camera.core.imagecapture.a.a(30, "Target offset < 0: ", i11));
        }
        if (i12 < 0) {
            throw new IndexOutOfBoundsException(androidx.camera.core.imagecapture.a.a(23, "Length < 0: ", i12));
        }
        int i13 = i10 + i12;
        if (i13 > size()) {
            throw new IndexOutOfBoundsException(androidx.camera.core.imagecapture.a.a(34, "Source end offset < 0: ", i13));
        }
        int i14 = i11 + i12;
        if (i14 > bArr.length) {
            throw new IndexOutOfBoundsException(androidx.camera.core.imagecapture.a.a(34, "Target end offset < 0: ", i14));
        }
        if (i12 > 0) {
            copyToInternal(bArr, i10, i11, i12);
        }
    }

    public abstract void copyToInternal(byte[] bArr, int i10, int i11, int i12);

    public abstract int getTreeDepth();

    public abstract boolean isBalanced();

    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    @Override // java.lang.Iterable
    public abstract Iterator<Byte> iterator();

    public abstract CodedInputStream newCodedInput();

    public abstract int partialHash(int i10, int i11, int i12);

    public abstract int partialIsValidUtf8(int i10, int i11, int i12);

    public abstract int peekCachedHashCode();

    public abstract int size();

    public byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract String toString(String str) throws UnsupportedEncodingException;

    public String toStringUtf8() {
        try {
            return toString("UTF-8");
        } catch (UnsupportedEncodingException e5) {
            throw new RuntimeException("UTF-8 not supported?", e5);
        }
    }

    public static final class Output extends OutputStream {

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static final byte[] f81366u0 = new byte[0];

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f81369r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f81371t0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final int f81367p0 = 128;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ArrayList<ByteString> f81368q0 = new ArrayList<>();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public byte[] f81370s0 = new byte[128];

        public final void a(int i10) {
            this.f81368q0.add(new a(this.f81370s0));
            int length = this.f81369r0 + this.f81370s0.length;
            this.f81369r0 = length;
            this.f81370s0 = new byte[Math.max(this.f81367p0, Math.max(i10, length >>> 1))];
            this.f81371t0 = 0;
        }

        public final void b() {
            int i10 = this.f81371t0;
            byte[] bArr = this.f81370s0;
            int length = bArr.length;
            ArrayList<ByteString> arrayList = this.f81368q0;
            if (i10 >= length) {
                arrayList.add(new a(this.f81370s0));
                this.f81370s0 = f81366u0;
            } else if (i10 > 0) {
                byte[] bArr2 = new byte[i10];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
                arrayList.add(new a(bArr2));
            }
            this.f81369r0 += this.f81371t0;
            this.f81371t0 = 0;
        }

        public synchronized int size() {
            return this.f81369r0 + this.f81371t0;
        }

        public synchronized ByteString toByteString() {
            b();
            return ByteString.copyFrom(this.f81368q0);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i10) {
            try {
                if (this.f81371t0 == this.f81370s0.length) {
                    a(1);
                }
                byte[] bArr = this.f81370s0;
                int i11 = this.f81371t0;
                this.f81371t0 = i11 + 1;
                bArr[i11] = (byte) i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i10, int i11) {
            try {
                byte[] bArr2 = this.f81370s0;
                int length = bArr2.length;
                int i12 = this.f81371t0;
                if (i11 <= length - i12) {
                    System.arraycopy(bArr, i10, bArr2, i12, i11);
                    this.f81371t0 += i11;
                } else {
                    int length2 = bArr2.length - i12;
                    System.arraycopy(bArr, i10, bArr2, i12, length2);
                    int i13 = i11 - length2;
                    a(i13);
                    System.arraycopy(bArr, i10 + length2, this.f81370s0, 0, i13);
                    this.f81371t0 = i13;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        ?? arrayList;
        if (!(iterable instanceof Collection)) {
            arrayList = new ArrayList();
            Iterator<ByteString> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            arrayList = (Collection) iterable;
        }
        if (arrayList.isEmpty()) {
            return EMPTY;
        }
        return a(arrayList.iterator(), arrayList.size());
    }
}
