package com.google.crypto.tink.shaded.protobuf;

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
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    public static final ByteString EMPTY = new h(Internal.EMPTY_BYTE_ARRAY);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final f f46957q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final b f46958r0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f46959p0 = 0;

    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    public class a extends c {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f46966p0 = 0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f46967q0;

        public a() {
            this.f46967q0 = ByteString.this.size();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f46966p0 < this.f46967q0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.ByteIterator
        public final byte nextByte() {
            int i10 = this.f46966p0;
            if (i10 >= this.f46967q0) {
                throw new NoSuchElementException();
            }
            this.f46966p0 = i10 + 1;
            return ByteString.this.e(i10);
        }
    }

    public class b implements Comparator<ByteString> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.crypto.tink.shaded.protobuf.ByteString$ByteIterator, java.util.Iterator] */
        /* JADX WARN: Type inference failed for: r1v0, types: [com.google.crypto.tink.shaded.protobuf.ByteString$ByteIterator, java.util.Iterator] */
        @Override // java.util.Comparator
        public final int compare(ByteString byteString, ByteString byteString2) {
            ByteString byteString3 = byteString;
            ByteString byteString4 = byteString2;
            ?? Iterator2 = byteString3.iterator2();
            ?? Iterator3 = byteString4.iterator2();
            while (Iterator2.hasNext() && Iterator3.hasNext()) {
                int iCompareTo = Integer.valueOf(Iterator2.nextByte() & 255).compareTo(Integer.valueOf(Iterator3.nextByte() & 255));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(byteString3.size()).compareTo(Integer.valueOf(byteString4.size()));
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
        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.f
        public final byte[] a(int i10, int i11, byte[] bArr) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    public static final class e extends h {

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final int f46969t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final int f46970u0;

        public e(byte[] bArr, int i10, int i11) {
            super(bArr);
            ByteString.c(i10, i10 + i11, bArr.length);
            this.f46969t0 = i10;
            this.f46970u0 = i11;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.h, com.google.crypto.tink.shaded.protobuf.ByteString
        public final byte byteAt(int i10) {
            ByteString.b(i10, this.f46970u0);
            return this.f46971s0[this.f46969t0 + i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.h, com.google.crypto.tink.shaded.protobuf.ByteString
        public final void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f46971s0, this.f46969t0 + i10, bArr, i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.h, com.google.crypto.tink.shaded.protobuf.ByteString.g, com.google.crypto.tink.shaded.protobuf.ByteString
        public final byte e(int i10) {
            return this.f46971s0[this.f46969t0 + i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.h
        public final int i() {
            return this.f46969t0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.h, com.google.crypto.tink.shaded.protobuf.ByteString
        public final int size() {
            return this.f46970u0;
        }

        public Object writeReplace() {
            return new h(toByteArray());
        }
    }

    public interface f {
        byte[] a(int i10, int i11, byte[] bArr);
    }

    public static abstract class g extends ByteString {
        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public byte e(int i10) {
            return byteAt(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final int getTreeDepth() {
            return 0;
        }

        public abstract boolean h(ByteString byteString, int i10, int i11);

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final boolean isBalanced() {
            return true;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString, java.lang.Iterable
        public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator2();
        }
    }

    public static class h extends g {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final byte[] f46971s0;

        public h(byte[] bArr) {
            bArr.getClass();
            this.f46971s0 = bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final ByteBuffer asReadOnlyByteBuffer() {
            return ByteBuffer.wrap(this.f46971s0, i(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public byte byteAt(int i10) {
            return this.f46971s0[i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final void copyTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.f46971s0, i(), size());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f46971s0, i10, bArr, i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.g, com.google.crypto.tink.shaded.protobuf.ByteString
        public byte e(int i10) {
            return this.f46971s0[i10];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
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
                return h(hVar, 0, size());
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final void g(ByteOutput byteOutput) throws IOException {
            byteOutput.writeLazy(this.f46971s0, i(), size());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.g
        public final boolean h(ByteString byteString, int i10, int i11) {
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
            int i13 = i() + i11;
            int i14 = i();
            int i15 = hVar.i() + i10;
            while (i14 < i13) {
                if (this.f46971s0[i14] != hVar.f46971s0[i15]) {
                    return false;
                }
                i14++;
                i15++;
            }
            return true;
        }

        public int i() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final boolean isValidUtf8() {
            int i10 = i();
            return y0.f47315a.g(0, this.f46971s0, i10, size() + i10) == 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final CodedInputStream newCodedInput() {
            return CodedInputStream.a(this.f46971s0, i(), size(), true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final InputStream newInput() {
            return new ByteArrayInputStream(this.f46971s0, i(), size());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final int partialHash(int i10, int i11, int i12) {
            return Internal.a(i10, i() + i11, this.f46971s0, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final int partialIsValidUtf8(int i10, int i11, int i12) {
            int i13 = i() + i11;
            return y0.f47315a.g(i10, this.f46971s0, i13, i12 + i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public int size() {
            return this.f46971s0.length;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final ByteString substring(int i10, int i11) {
            int iC = ByteString.c(i10, i11, size());
            if (iC == 0) {
                return ByteString.EMPTY;
            }
            return new e(this.f46971s0, i() + i10, iC);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final String toStringInternal(Charset charset) {
            return new String(this.f46971s0, i(), size(), charset);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(toByteArray());
        }
    }

    public static final class i implements f {
        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.f
        public final byte[] a(int i10, int i11, byte[] bArr) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        f46957q0 = com.google.crypto.tink.shaded.protobuf.b.a() ? new i() : new d();
        f46958r0 = new b();
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
        return new h(f46957q0.a(i10, i11, bArr));
    }

    public static ByteString copyFromUtf8(String str) {
        return new h(str.getBytes(Internal.f47106a));
    }

    public static int d(int i10, String str) {
        int i11;
        char cCharAt = str.charAt(i10);
        if (cCharAt >= '0' && cCharAt <= '9') {
            i11 = cCharAt - '0';
        } else if (cCharAt < 'A' || cCharAt > 'F') {
            i11 = (cCharAt < 'a' || cCharAt > 'f') ? -1 : cCharAt - 'W';
        } else {
            i11 = cCharAt - '7';
        }
        if (i11 != -1) {
            return i11;
        }
        StringBuilder sbD = ci.a.d("Invalid hexString ", str, " must only contain [0-9a-fA-F] but contained ");
        sbD.append(str.charAt(i10));
        sbD.append(" at index ");
        sbD.append(i10);
        throw new NumberFormatException(sbD.toString());
    }

    public static final ByteString empty() {
        return EMPTY;
    }

    public static g f(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new i0(byteBuffer);
        }
        return new e(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
    }

    public static ByteString fromHex(String str) {
        if (str.length() % 2 != 0) {
            StringBuilder sbD = ci.a.d("Invalid hexString ", str, " of length ");
            sbD.append(str.length());
            sbD.append(" must be even.");
            throw new NumberFormatException(sbD.toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) (d(i11 + 1, str) | (d(i11, str) << 4));
        }
        return new h(bArr);
    }

    public static Output newOutput(int i10) {
        return new Output(i10);
    }

    public static ByteString readFrom(InputStream inputStream) throws IOException {
        return readFrom(inputStream, 256, 8192);
    }

    public static Comparator<ByteString> unsignedLexicographicalComparator() {
        return f46958r0;
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
        if (this instanceof p0) {
            p0 p0Var = (p0) this;
            ByteString byteString2 = p0Var.f47251u0;
            int size4 = byteString.size() + byteString2.size();
            ByteString byteString3 = p0Var.f47250t0;
            if (size4 < 128) {
                int size5 = byteString2.size();
                int size6 = byteString.size();
                byte[] bArr2 = new byte[size5 + size6];
                byteString2.copyTo(bArr2, 0, 0, size5);
                byteString.copyTo(bArr2, 0, size5, size6);
                byteStringPop = new p0(byteString3, new h(bArr2));
            } else {
                if (byteString3.getTreeDepth() > byteString2.getTreeDepth()) {
                    if (p0Var.f47252w0 > byteString.getTreeDepth()) {
                        return new p0(byteString3, new p0(byteString2, byteString));
                    }
                }
                if (size >= p0.h(Math.max(getTreeDepth(), byteString.getTreeDepth()) + 1)) {
                    byteStringPop = new p0(this, byteString);
                } else {
                    p0.b bVar = new p0.b();
                    bVar.a(this);
                    bVar.a(byteString);
                    arrayDeque = bVar.f47255a;
                    byteStringPop = arrayDeque.pop();
                    while (!arrayDeque.isEmpty()) {
                        byteStringPop = new p0(arrayDeque.pop(), byteStringPop);
                    }
                }
            }
        } else if (size >= p0.h(Math.max(getTreeDepth(), byteString.getTreeDepth()) + 1)) {
            byteStringPop = new p0(this, byteString);
        } else {
            p0.b bVar2 = new p0.b();
            bVar2.a(this);
            bVar2.a(byteString);
            arrayDeque = bVar2.f47255a;
            byteStringPop = arrayDeque.pop();
            while (!arrayDeque.isEmpty()) {
                byteStringPop = new p0(arrayDeque.pop(), byteStringPop);
            }
        }
        return byteStringPop;
    }

    public abstract void copyTo(ByteBuffer byteBuffer);

    public void copyTo(byte[] bArr, int i10) {
        copyTo(bArr, 0, i10, size());
    }

    public abstract void copyToInternal(byte[] bArr, int i10, int i11, int i12);

    public abstract byte e(int i10);

    public final boolean endsWith(ByteString byteString) {
        return size() >= byteString.size() && substring(size() - byteString.size()).equals(byteString);
    }

    public abstract boolean equals(Object obj);

    public abstract void g(ByteOutput byteOutput) throws IOException;

    public abstract int getTreeDepth();

    public final int hashCode() {
        int iPartialHash = this.f46959p0;
        if (iPartialHash == 0) {
            int size = size();
            iPartialHash = partialHash(size, 0, size);
            if (iPartialHash == 0) {
                iPartialHash = 1;
            }
            this.f46959p0 = iPartialHash;
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
        return this.f46959p0;
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
        return toString(Internal.f47106a);
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
        public static final byte[] f46960u0 = new byte[0];

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final int f46961p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ArrayList<ByteString> f46962q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f46963r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public byte[] f46964s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f46965t0;

        public Output(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f46961p0 = i10;
            this.f46962q0 = new ArrayList<>();
            this.f46964s0 = new byte[i10];
        }

        public final void a(int i10) {
            this.f46962q0.add(new h(this.f46964s0));
            int length = this.f46963r0 + this.f46964s0.length;
            this.f46963r0 = length;
            this.f46964s0 = new byte[Math.max(this.f46961p0, Math.max(i10, length >>> 1))];
            this.f46965t0 = 0;
        }

        public final void b() {
            int i10 = this.f46965t0;
            byte[] bArr = this.f46964s0;
            int length = bArr.length;
            ArrayList<ByteString> arrayList = this.f46962q0;
            if (i10 >= length) {
                arrayList.add(new h(this.f46964s0));
                this.f46964s0 = f46960u0;
            } else if (i10 > 0) {
                byte[] bArr2 = new byte[i10];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
                arrayList.add(new h(bArr2));
            }
            this.f46963r0 += this.f46965t0;
            this.f46965t0 = 0;
        }

        public synchronized void reset() {
            this.f46962q0.clear();
            this.f46963r0 = 0;
            this.f46965t0 = 0;
        }

        public synchronized int size() {
            return this.f46963r0 + this.f46965t0;
        }

        public synchronized ByteString toByteString() {
            b();
            return ByteString.copyFrom(this.f46962q0);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i10) {
            try {
                if (this.f46965t0 == this.f46964s0.length) {
                    a(1);
                }
                byte[] bArr = this.f46964s0;
                int i11 = this.f46965t0;
                this.f46965t0 = i11 + 1;
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
                ArrayList<ByteString> arrayList = this.f46962q0;
                byteStringArr = (ByteString[]) arrayList.toArray(new ByteString[arrayList.size()]);
                bArr = this.f46964s0;
                i10 = this.f46965t0;
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
                byte[] bArr2 = this.f46964s0;
                int length = bArr2.length;
                int i12 = this.f46965t0;
                if (i11 <= length - i12) {
                    System.arraycopy(bArr, i10, bArr2, i12, i11);
                    this.f46965t0 += i11;
                } else {
                    int length2 = bArr2.length - i12;
                    System.arraycopy(bArr, i10, bArr2, i12, length2);
                    int i13 = i11 - length2;
                    a(i13);
                    System.arraycopy(bArr, i10 + length2, this.f46964s0, 0, i13);
                    this.f46965t0 = i13;
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
        String strA;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        if (size() <= 50) {
            strA = u0.a(this);
        } else {
            strA = u0.a(substring(0, 47)) + "...";
        }
        objArr[2] = strA;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
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
