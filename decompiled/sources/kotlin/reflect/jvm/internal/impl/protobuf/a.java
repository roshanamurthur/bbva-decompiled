package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: LiteralByteString.java */
/* JADX INFO: loaded from: classes12.dex */
public class a extends ByteString {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f81421p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f81422q0 = 0;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LiteralByteString.java */
    public class C0442a implements ByteString.ByteIterator {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f81423p0 = 0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f81424q0;

        public C0442a() {
            this.f81424q0 = a.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f81423p0 < this.f81424q0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            try {
                byte[] bArr = a.this.f81421p0;
                int i10 = this.f81423p0;
                this.f81423p0 = i10 + 1;
                return bArr[i10];
            } catch (ArrayIndexOutOfBoundsException e5) {
                throw new NoSuchElementException(e5.getMessage());
            }
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

    public a(byte[] bArr) {
        this.f81421p0 = bArr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final void b(OutputStream outputStream, int i10, int i11) throws IOException {
        outputStream.write(this.f81421p0, d() + i10, i11);
    }

    public byte byteAt(int i10) {
        return this.f81421p0[i10];
    }

    public final boolean c(a aVar, int i10, int i11) {
        if (i11 > aVar.size()) {
            int size = size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(size);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i10 + i11 <= aVar.size()) {
            int iD = d() + i11;
            int iD2 = d();
            int iD3 = aVar.d() + i10;
            while (iD2 < iD) {
                if (this.f81421p0[iD2] != aVar.f81421p0[iD3]) {
                    return false;
                }
                iD2++;
                iD3++;
            }
            return true;
        }
        int size2 = aVar.size();
        StringBuilder sb3 = new StringBuilder(59);
        sb3.append("Ran off end of other: ");
        sb3.append(i10);
        sb3.append(", ");
        sb3.append(i11);
        sb3.append(", ");
        sb3.append(size2);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f81421p0, i10, bArr, i11, i12);
    }

    public int d() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof a) {
            return c((a) obj, 0, size());
        }
        if (obj instanceof b) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(ad.d.f(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int getTreeDepth() {
        return 0;
    }

    public int hashCode() {
        int iPartialHash = this.f81422q0;
        if (iPartialHash == 0) {
            int size = size();
            iPartialHash = partialHash(size, 0, size);
            if (iPartialHash == 0) {
                iPartialHash = 1;
            }
            this.f81422q0 = iPartialHash;
        }
        return iPartialHash;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final boolean isBalanced() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public boolean isValidUtf8() {
        int iD = d();
        return e.isValidUtf8(this.f81421p0, iD, size() + iD);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public CodedInputStream newCodedInput() {
        CodedInputStream codedInputStream = new CodedInputStream(this);
        try {
            codedInputStream.pushLimit(size());
            return codedInputStream;
        } catch (InvalidProtocolBufferException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int partialHash(int i10, int i11, int i12) {
        int iD = d() + i11;
        for (int i13 = iD; i13 < iD + i12; i13++) {
            i10 = (i10 * 31) + this.f81421p0[i13];
        }
        return i10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int partialIsValidUtf8(int i10, int i11, int i12) {
        int iD = d() + i11;
        return e.partialIsValidUtf8(i10, this.f81421p0, iD, i12 + iD);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int peekCachedHashCode() {
        return this.f81422q0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.f81421p0.length;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public String toString(String str) throws UnsupportedEncodingException {
        return new String(this.f81421p0, d(), size(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new C0442a();
    }
}
