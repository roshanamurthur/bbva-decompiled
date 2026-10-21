package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class UnknownFieldSetLite {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final UnknownFieldSetLite f47167f = new UnknownFieldSetLite(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f47169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f47170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f47171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f47172e;

    public UnknownFieldSetLite() {
        this(0, new int[8], new Object[8], true);
    }

    public static UnknownFieldSetLite d(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
        int i10 = unknownFieldSetLite.f47168a + unknownFieldSetLite2.f47168a;
        int[] iArrCopyOf = Arrays.copyOf(unknownFieldSetLite.f47169b, i10);
        System.arraycopy(unknownFieldSetLite2.f47169b, 0, iArrCopyOf, unknownFieldSetLite.f47168a, unknownFieldSetLite2.f47168a);
        Object[] objArrCopyOf = Arrays.copyOf(unknownFieldSetLite.f47170c, i10);
        System.arraycopy(unknownFieldSetLite2.f47170c, 0, objArrCopyOf, unknownFieldSetLite.f47168a, unknownFieldSetLite2.f47168a);
        return new UnknownFieldSetLite(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public static UnknownFieldSetLite getDefaultInstance() {
        return f47167f;
    }

    public final void a() {
        if (!this.f47172e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(int i10) {
        int[] iArr = this.f47169b;
        if (i10 > iArr.length) {
            int i11 = this.f47168a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f47169b = Arrays.copyOf(iArr, i10);
            this.f47170c = Arrays.copyOf(this.f47170c, i10);
        }
    }

    public final boolean c(int i10, CodedInputStream codedInputStream) throws IOException {
        int tag;
        a();
        int tagFieldNumber = WireFormat.getTagFieldNumber(i10);
        int tagWireType = WireFormat.getTagWireType(i10);
        if (tagWireType == 0) {
            e(i10, Long.valueOf(codedInputStream.readInt64()));
            return true;
        }
        if (tagWireType == 1) {
            e(i10, Long.valueOf(codedInputStream.readFixed64()));
            return true;
        }
        if (tagWireType == 2) {
            e(i10, codedInputStream.readBytes());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.d();
            }
            e(i10, Integer.valueOf(codedInputStream.readFixed32()));
            return true;
        }
        UnknownFieldSetLite unknownFieldSetLite = new UnknownFieldSetLite();
        do {
            tag = codedInputStream.readTag();
            if (tag == 0) {
                break;
            }
        } while (unknownFieldSetLite.c(tag, codedInputStream));
        codedInputStream.checkLastTagWas((tagFieldNumber << 3) | 4);
        e(i10, unknownFieldSetLite);
        return true;
    }

    public final void e(int i10, Object obj) {
        a();
        b(this.f47168a + 1);
        int[] iArr = this.f47169b;
        int i11 = this.f47168a;
        iArr[i11] = i10;
        this.f47170c[i11] = obj;
        this.f47168a = i11 + 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnknownFieldSetLite)) {
            return false;
        }
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        int i10 = this.f47168a;
        if (i10 == unknownFieldSetLite.f47168a) {
            int[] iArr = this.f47169b;
            int[] iArr2 = unknownFieldSetLite.f47169b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f47170c;
            Object[] objArr2 = unknownFieldSetLite.f47170c;
            int i12 = this.f47168a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public int getSerializedSize() {
        int iComputeUInt64Size;
        int i10 = this.f47171d;
        if (i10 != -1) {
            return i10;
        }
        int serializedSize = 0;
        for (int i11 = 0; i11 < this.f47168a; i11++) {
            int i12 = this.f47169b[i11];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i12);
            int tagWireType = WireFormat.getTagWireType(i12);
            if (tagWireType == 0) {
                iComputeUInt64Size = CodedOutputStream.computeUInt64Size(tagFieldNumber, ((Long) this.f47170c[i11]).longValue());
            } else if (tagWireType == 1) {
                iComputeUInt64Size = CodedOutputStream.computeFixed64Size(tagFieldNumber, ((Long) this.f47170c[i11]).longValue());
            } else if (tagWireType != 2) {
                if (tagWireType == 3) {
                    serializedSize = ((UnknownFieldSetLite) this.f47170c[i11]).getSerializedSize() + (CodedOutputStream.computeTagSize(tagFieldNumber) * 2) + serializedSize;
                } else {
                    if (tagWireType != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.d());
                    }
                    iComputeUInt64Size = CodedOutputStream.computeFixed32Size(tagFieldNumber, ((Integer) this.f47170c[i11]).intValue());
                }
            } else {
                iComputeUInt64Size = CodedOutputStream.computeBytesSize(tagFieldNumber, (ByteString) this.f47170c[i11]);
            }
            serializedSize = iComputeUInt64Size + serializedSize;
        }
        this.f47171d = serializedSize;
        return serializedSize;
    }

    public int getSerializedSizeAsMessageSet() {
        int i10 = this.f47171d;
        if (i10 != -1) {
            return i10;
        }
        int iComputeRawMessageSetExtensionSize = 0;
        for (int i11 = 0; i11 < this.f47168a; i11++) {
            iComputeRawMessageSetExtensionSize += CodedOutputStream.computeRawMessageSetExtensionSize(WireFormat.getTagFieldNumber(this.f47169b[i11]), (ByteString) this.f47170c[i11]);
        }
        this.f47171d = iComputeRawMessageSetExtensionSize;
        return iComputeRawMessageSetExtensionSize;
    }

    public int hashCode() {
        int i10 = this.f47168a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f47169b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f47170c;
        int i15 = this.f47168a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public void makeImmutable() {
        this.f47172e = false;
    }

    public void writeAsMessageSetTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i10 = 0; i10 < this.f47168a; i10++) {
            codedOutputStream.writeRawMessageSetExtension(WireFormat.getTagFieldNumber(this.f47169b[i10]), (ByteString) this.f47170c[i10]);
        }
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i10 = 0; i10 < this.f47168a; i10++) {
            int i11 = this.f47169b[i10];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i11);
            int tagWireType = WireFormat.getTagWireType(i11);
            if (tagWireType == 0) {
                codedOutputStream.writeUInt64(tagFieldNumber, ((Long) this.f47170c[i10]).longValue());
            } else if (tagWireType == 1) {
                codedOutputStream.writeFixed64(tagFieldNumber, ((Long) this.f47170c[i10]).longValue());
            } else if (tagWireType == 2) {
                codedOutputStream.writeBytes(tagFieldNumber, (ByteString) this.f47170c[i10]);
            } else if (tagWireType == 3) {
                codedOutputStream.writeTag(tagFieldNumber, 3);
                ((UnknownFieldSetLite) this.f47170c[i10]).writeTo(codedOutputStream);
                codedOutputStream.writeTag(tagFieldNumber, 4);
            } else {
                if (tagWireType != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                codedOutputStream.writeFixed32(tagFieldNumber, ((Integer) this.f47170c[i10]).intValue());
            }
        }
    }

    public UnknownFieldSetLite(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f47171d = -1;
        this.f47168a = i10;
        this.f47169b = iArr;
        this.f47170c = objArr;
        this.f47172e = z10;
    }

    public void writeTo(Writer writer) throws IOException {
        if (this.f47168a == 0) {
            return;
        }
        f fVar = (f) writer;
        fVar.getClass();
        for (int i10 = 0; i10 < this.f47168a; i10++) {
            int i11 = this.f47169b[i10];
            Object obj = this.f47170c[i10];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i11);
            int tagWireType = WireFormat.getTagWireType(i11);
            if (tagWireType == 0) {
                fVar.j(tagFieldNumber, ((Long) obj).longValue());
            } else if (tagWireType == 1) {
                fVar.f(tagFieldNumber, ((Long) obj).longValue());
            } else if (tagWireType == 2) {
                fVar.b(tagFieldNumber, (ByteString) obj);
            } else if (tagWireType == 3) {
                fVar.getClass();
                CodedOutputStream codedOutputStream = fVar.f47218a;
                codedOutputStream.writeTag(tagFieldNumber, 3);
                ((UnknownFieldSetLite) obj).writeTo(writer);
                codedOutputStream.writeTag(tagFieldNumber, 4);
            } else if (tagWireType == 5) {
                fVar.e(tagFieldNumber, ((Integer) obj).intValue());
            } else {
                throw new RuntimeException(InvalidProtocolBufferException.d());
            }
        }
    }
}
