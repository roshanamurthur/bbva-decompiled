package androidx.datastore.preferences.protobuf;

import androidx.camera.camera2.internal.n1;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    public static final ByteString EMPTY = new h(Internal.EMPTY_BYTE_ARRAY);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final f f20793q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final b f20794r0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f20795p0 = 0;

    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    public class a extends c {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f20802p0 = 0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f20803q0;

        public a() {
            this.f20803q0 = ByteString.this.size();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f20802p0 < this.f20803q0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.ByteIterator
        public final byte nextByte() {
            int i10 = this.f20802p0;
            if (i10 >= this.f20803q0) {
                throw new NoSuchElementException();
            }
            this.f20802p0 = i10 + 1;
            return ByteString.this.d(i10);
        }
    }

    public static class b implements Comparator<ByteString> {
        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.ByteString$ByteIterator, java.util.Iterator] */
        /* JADX WARN: Type inference failed for: r1v0, types: [androidx.datastore.preferences.protobuf.ByteString$ByteIterator, java.util.Iterator] */
        @Override // java.util.Comparator
        public final int compare(ByteString byteString, ByteString byteString2) {
            ByteString byteString3 = byteString;
            ByteString byteString4 = byteString2;
            ?? Iterator2 = byteString3.iterator2();
            ?? Iterator3 = byteString4.iterator2();
            while (Iterator2.hasNext() && Iterator3.hasNext()) {
                int iCompare = Integer.compare(Iterator2.nextByte() & 255, Iterator3.nextByte() & 255);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return Integer.compare(byteString3.size(), byteString4.size());
        }
    }

    public static abstract class c implements ByteIterator {
        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class d implements f {
        @Override // androidx.datastore.preferences.protobuf.ByteString.f
        public final byte[] a(int i10, int i11, byte[] bArr) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    public static final class e extends h {

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final int f20805t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final int f20806u0;

        public e(byte[] bArr, int i10, int i11) {
            super(bArr);
            ByteString.c(i10, i10 + i11, bArr.length);
            this.f20805t0 = i10;
            this.f20806u0 = i11;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.h, androidx.datastore.preferences.protobuf.ByteString
        public final byte byteAt(int i10) {
            ByteString.b(i10, this.f20806u0);
            return this.f20807s0[this.f20805t0 + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.h, androidx.datastore.preferences.protobuf.ByteString
        public final void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f20807s0, this.f20805t0 + i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.h, androidx.datastore.preferences.protobuf.ByteString.g, androidx.datastore.preferences.protobuf.ByteString
        public final byte d(int i10) {
            return this.f20807s0[this.f20805t0 + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.h
        public final int h() {
            return this.f20805t0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.h, androidx.datastore.preferences.protobuf.ByteString
        public final int size() {
            return this.f20806u0;
        }

        public Object writeReplace() {
            return new h(toByteArray());
        }
    }

    public interface f {
        byte[] a(int i10, int i11, byte[] bArr);
    }

    public static abstract class g extends ByteString {
        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte d(int i10) {
            return byteAt(i10);
        }

        public abstract boolean g(ByteString byteString, int i10, int i11);

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int getTreeDepth() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean isBalanced() {
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString, java.lang.Iterable
        public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator2();
        }
    }

    public static class h extends g {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final byte[] f20807s0;

        public h(byte[] bArr) {
            bArr.getClass();
            this.f20807s0 = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteBuffer asReadOnlyByteBuffer() {
            return ByteBuffer.wrap(this.f20807s0, h(), size()).asReadOnlyBuffer();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte byteAt(int i10) {
            return this.f20807s0[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void copyTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.f20807s0, h(), size());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f20807s0, i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.g, androidx.datastore.preferences.protobuf.ByteString
        public byte d(int i10) {
            return this.f20807s0[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof h)) {
                return obj.equals(this);
            }
            h hVar = (h) obj;
            int iPeekCachedHashCode = peekCachedHashCode();
            int iPeekCachedHashCode2 = hVar.peekCachedHashCode();
            if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
                return g(hVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void f(ByteOutput byteOutput) throws IOException {
            byteOutput.writeLazy(this.f20807s0, h(), size());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.g
        public final boolean g(ByteString byteString, int i10, int i11) {
            if (i11 > byteString.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > byteString.size()) {
                StringBuilder sbE = androidx.collection.h.e("Ran off end of other: ", i10, ", ", i11, ", ");
                sbE.append(byteString.size());
                throw new IllegalArgumentException(sbE.toString());
            }
            if (!(byteString instanceof h)) {
                return byteString.substring(i10, i12).equals(substring(0, i11));
            }
            h hVar = (h) byteString;
            int iH = h() + i11;
            int iH2 = h();
            int iH3 = hVar.h() + i10;
            while (iH2 < iH) {
                if (this.f20807s0[iH2] != hVar.f20807s0[iH3]) {
                    return false;
                }
                iH2++;
                iH3++;
            }
            return true;
        }

        public int h() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean isValidUtf8() {
            int iH = h();
            return w0.f21158a.g(this.f20807s0, iH, size() + iH);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final CodedInputStream newCodedInput() {
            return CodedInputStream.a(this.f20807s0, h(), size(), true);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final InputStream newInput() {
            return new ByteArrayInputStream(this.f20807s0, h(), size());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int partialHash(int i10, int i11, int i12) {
            return Internal.b(i10, h() + i11, this.f20807s0, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final int partialIsValidUtf8(int i10, int i11, int i12) {
            int iH = h() + i11;
            return w0.f21158a.h(i10, this.f20807s0, iH, i12 + iH);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public int size() {
            return this.f20807s0.length;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteString substring(int i10, int i11) {
            int iC = ByteString.c(i10, i11, size());
            if (iC == 0) {
                return ByteString.EMPTY;
            }
            return new e(this.f20807s0, h() + i10, iC);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final String toStringInternal(Charset charset) {
            return new String(this.f20807s0, h(), size(), charset);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(toByteArray());
        }
    }

    public static final class i implements f {
        @Override // androidx.datastore.preferences.protobuf.ByteString.f
        public final byte[] a(int i10, int i11, byte[] bArr) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        f20793q0 = androidx.datastore.preferences.protobuf.b.a() ? new i() : new d();
        f20794r0 = new b();
    }

    public static ByteString a(Iterator<ByteString> it, int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i10)));
        }
        if (i10 == 1) {
            return it.next();
        }
        int i11 = i10 >>> 1;
        return a(it, i11).concat(a(it, i10 - i11));
    }

    public static void b(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 >= 0) {
                throw new ArrayIndexOutOfBoundsException(n1.e("Index > length: ", i10, ", ", i11));
            }
            throw new ArrayIndexOutOfBoundsException(androidx.appcompat.widget.g0.c("Index < 0: ", i10));
        }
    }

    public static int c(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(androidx.camera.core.impl.utils.b.a("Beginning index: ", i10, " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(n1.e("Beginning index larger than ending index: ", i10, ", ", i11));
        }
        throw new IndexOutOfBoundsException(n1.e("End index: ", i11, " >= ", i12));
    }

    public static ByteString copyFrom(byte[] bArr, int i10, int i11) {
        c(i10, i10 + i11, bArr.length);
        return new h(f20793q0.a(i10, i11, bArr));
    }

    public static ByteString copyFromUtf8(String str) {
        return new h(str.getBytes(Internal.f20943a));
    }

    public static g e(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new g0(byteBuffer);
        }
        return new e(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
    }

    public static Output newOutput(int i10) {
        return new Output(i10);
    }

    public static ByteString readFrom(InputStream inputStream) throws IOException {
        return readFrom(inputStream, 256, 8192);
    }

    public static Comparator<ByteString> unsignedLexicographicalComparator() {
        return f20794r0;
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i10);

    /* JADX WARN: Code duplicated, block: B:26:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ca A[LOOP:0: B:28:0x00c4->B:30:0x00ca, LOOP_END] */
    public final ByteString concat(ByteString byteString) {
        ArrayDeque<ByteString> arrayDeque;
        ByteString byteStringPop;
        if (Integer.MAX_VALUE - size() < byteString.size()) {
            throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + byteString.size());
        }
        if (byteString.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return byteString;
        }
        int size = byteString.size() + size();
        if (size < 128) {
            int size2 = size();
            int size3 = byteString.size();
            byte[] bArr = new byte[size2 + size3];
            copyTo(bArr, 0, 0, size2);
            byteString.copyTo(bArr, 0, size2, size3);
            return new h(bArr);
        }
        if (this instanceof n0) {
            n0 n0Var = (n0) this;
            ByteString byteString2 = n0Var.f21089u0;
            int size4 = byteString.size() + byteString2.size();
            ByteString byteString3 = n0Var.f21088t0;
            if (size4 < 128) {
                int size5 = byteString2.size();
                int size6 = byteString.size();
                byte[] bArr2 = new byte[size5 + size6];
                byteString2.copyTo(bArr2, 0, 0, size5);
                byteString.copyTo(bArr2, 0, size5, size6);
                byteStringPop = new n0(byteString3, new h(bArr2));
            } else {
                if (byteString3.getTreeDepth() > byteString2.getTreeDepth()) {
                    if (n0Var.f21090w0 > byteString.getTreeDepth()) {
                        return new n0(byteString3, new n0(byteString2, byteString));
                    }
                }
                if (size >= n0.f21086x0[Math.max(getTreeDepth(), byteString.getTreeDepth()) + 1]) {
                    byteStringPop = new n0(this, byteString);
                } else {
                    n0.b bVar = new n0.b();
                    bVar.a(this);
                    bVar.a(byteString);
                    arrayDeque = bVar.f21093a;
                    byteStringPop = arrayDeque.pop();
                    while (!arrayDeque.isEmpty()) {
                        byteStringPop = new n0(arrayDeque.pop(), byteStringPop);
                    }
                }
            }
        } else {
            if (size >= n0.f21086x0[Math.max(getTreeDepth(), byteString.getTreeDepth()) + 1]) {
                byteStringPop = new n0(this, byteString);
            } else {
                n0.b bVar2 = new n0.b();
                bVar2.a(this);
                bVar2.a(byteString);
                arrayDeque = bVar2.f21093a;
                byteStringPop = arrayDeque.pop();
                while (!arrayDeque.isEmpty()) {
                    byteStringPop = new n0(arrayDeque.pop(), byteStringPop);
                }
            }
        }
        return byteStringPop;
    }

    public abstract void copyTo(ByteBuffer byteBuffer);

    public void copyTo(byte[] bArr, int i10) {
        copyTo(bArr, 0, i10, size());
    }

    public abstract void copyToInternal(byte[] bArr, int i10, int i11, int i12);

    public abstract byte d(int i10);

    public final boolean endsWith(ByteString byteString) {
        return size() >= byteString.size() && substring(size() - byteString.size()).equals(byteString);
    }

    public abstract boolean equals(Object obj);

    public abstract void f(ByteOutput byteOutput) throws IOException;

    public abstract int getTreeDepth();

    public final int hashCode() {
        int iPartialHash = this.f20795p0;
        if (iPartialHash == 0) {
            int size = size();
            iPartialHash = partialHash(size, 0, size);
            if (iPartialHash == 0) {
                iPartialHash = 1;
            }
            this.f20795p0 = iPartialHash;
        }
        return iPartialHash;
    }

    public abstract boolean isBalanced();

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    public abstract CodedInputStream newCodedInput();

    public abstract InputStream newInput();

    public abstract int partialHash(int i10, int i11, int i12);

    public abstract int partialIsValidUtf8(int i10, int i11, int i12);

    public final int peekCachedHashCode() {
        return this.f20795p0;
    }

    public abstract int size();

    public final boolean startsWith(ByteString byteString) {
        return size() >= byteString.size() && substring(0, byteString.size()).equals(byteString);
    }

    public final ByteString substring(int i10) {
        return substring(i10, size());
    }

    public abstract ByteString substring(int i10, int i11);

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString(String str) throws UnsupportedEncodingException {
        try {
            return toString(Charset.forName(str));
        } catch (UnsupportedCharsetException e5) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e5);
            throw unsupportedEncodingException;
        }
    }

    public abstract String toStringInternal(Charset charset);

    public final String toStringUtf8() {
        return toString(Internal.f20943a);
    }

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    public static Output newOutput() {
        return new Output(128);
    }

    public static ByteString readFrom(InputStream inputStream, int i10) throws IOException {
        return readFrom(inputStream, i10, i10);
    }

    @Deprecated
    public final void copyTo(byte[] bArr, int i10, int i11, int i12) {
        c(i10, i10 + i12, size());
        c(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            copyToInternal(bArr, i10, i11, i12);
        }
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public Iterator<Byte> iterator2() {
        return new a();
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static ByteString readFrom(InputStream inputStream, int i10, int i11) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] bArr = new byte[i10];
            int i12 = 0;
            while (i12 < i10) {
                int i13 = inputStream.read(bArr, i12, i10 - i12);
                if (i13 == -1) {
                    break;
                }
                i12 += i13;
            }
            ByteString byteStringCopyFrom = i12 == 0 ? null : copyFrom(bArr, 0, i12);
            if (byteStringCopyFrom == null) {
                return copyFrom(arrayList);
            }
            arrayList.add(byteStringCopyFrom);
            i10 = Math.min(i10 * 2, i11);
        }
    }

    public static final class Output extends OutputStream {

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static final byte[] f20796u0 = new byte[0];

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final int f20797p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ArrayList<ByteString> f20798q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f20799r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public byte[] f20800s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f20801t0;

        public Output(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f20797p0 = i10;
            this.f20798q0 = new ArrayList<>();
            this.f20800s0 = new byte[i10];
        }

        public final void a(int i10) {
            this.f20798q0.add(new h(this.f20800s0));
            int length = this.f20799r0 + this.f20800s0.length;
            this.f20799r0 = length;
            this.f20800s0 = new byte[Math.max(this.f20797p0, Math.max(i10, length >>> 1))];
            this.f20801t0 = 0;
        }

        public final void b() {
            int i10 = this.f20801t0;
            byte[] bArr = this.f20800s0;
            int length = bArr.length;
            ArrayList<ByteString> arrayList = this.f20798q0;
            if (i10 >= length) {
                arrayList.add(new h(this.f20800s0));
                this.f20800s0 = f20796u0;
            } else if (i10 > 0) {
                byte[] bArr2 = new byte[i10];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
                arrayList.add(new h(bArr2));
            }
            this.f20799r0 += this.f20801t0;
            this.f20801t0 = 0;
        }

        public synchronized void reset() {
            this.f20798q0.clear();
            this.f20799r0 = 0;
            this.f20801t0 = 0;
        }

        public synchronized int size() {
            return this.f20799r0 + this.f20801t0;
        }

        public synchronized ByteString toByteString() {
            b();
            return ByteString.copyFrom(this.f20798q0);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i10) {
            try {
                if (this.f20801t0 == this.f20800s0.length) {
                    a(1);
                }
                byte[] bArr = this.f20800s0;
                int i11 = this.f20801t0;
                this.f20801t0 = i11 + 1;
                bArr[i11] = (byte) i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public void writeTo(OutputStream outputStream) throws IOException {
            ByteString[] byteStringArr;
            byte[] bArr;
            int i10;
            synchronized (this) {
                ArrayList<ByteString> arrayList = this.f20798q0;
                byteStringArr = (ByteString[]) arrayList.toArray(new ByteString[arrayList.size()]);
                bArr = this.f20800s0;
                i10 = this.f20801t0;
            }
            for (ByteString byteString : byteStringArr) {
                byteString.writeTo(outputStream);
            }
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
            outputStream.write(bArr2);
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i10, int i11) {
            try {
                byte[] bArr2 = this.f20800s0;
                int length = bArr2.length;
                int i12 = this.f20801t0;
                if (i11 <= length - i12) {
                    System.arraycopy(bArr, i10, bArr2, i12, i11);
                    this.f20801t0 += i11;
                } else {
                    int length2 = bArr2.length - i12;
                    System.arraycopy(bArr, i10, bArr2, i12, length2);
                    int i13 = i11 - length2;
                    a(i13);
                    System.arraycopy(bArr, i10 + length2, this.f20800s0, 0, i13);
                    this.f20801t0 = i13;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer, int i10) {
        c(0, i10, byteBuffer.remaining());
        byte[] bArr = new byte[i10];
        byteBuffer.get(bArr);
        return new h(bArr);
    }

    public final String toString(Charset charset) {
        return size() == 0 ? "" : toStringInternal(charset);
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public static ByteString copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static ByteString copyFrom(String str, String str2) throws UnsupportedEncodingException {
        return new h(str.getBytes(str2));
    }

    public static ByteString copyFrom(String str, Charset charset) {
        return new h(str.getBytes(charset));
    }

    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator<ByteString> it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = ((Collection) iterable).size();
        }
        if (size == 0) {
            return EMPTY;
        }
        return a(iterable.iterator(), size);
    }
}
