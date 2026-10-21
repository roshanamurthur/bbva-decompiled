package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class UnknownFieldSetLite {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final UnknownFieldSetLite f21003f = new UnknownFieldSetLite(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f21005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f21006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21008e;

    public UnknownFieldSetLite() {
        this(0, new int[8], new Object[8], true);
    }

    public static UnknownFieldSetLite b(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
        int i10 = unknownFieldSetLite.f21004a + unknownFieldSetLite2.f21004a;
        int[] iArrCopyOf = Arrays.copyOf(unknownFieldSetLite.f21005b, i10);
        System.arraycopy(unknownFieldSetLite2.f21005b, 0, iArrCopyOf, unknownFieldSetLite.f21004a, unknownFieldSetLite2.f21004a);
        Object[] objArrCopyOf = Arrays.copyOf(unknownFieldSetLite.f21006c, i10);
        System.arraycopy(unknownFieldSetLite2.f21006c, 0, objArrCopyOf, unknownFieldSetLite.f21004a, unknownFieldSetLite2.f21004a);
        return new UnknownFieldSetLite(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public static UnknownFieldSetLite getDefaultInstance() {
        return f21003f;
    }

    public final boolean a(int i10, CodedInputStream codedInputStream) throws IOException {
        int tag;
        if (!this.f21008e) {
            throw new UnsupportedOperationException();
        }
        int tagFieldNumber = WireFormat.getTagFieldNumber(i10);
        int tagWireType = WireFormat.getTagWireType(i10);
        if (tagWireType == 0) {
            c(i10, Long.valueOf(codedInputStream.readInt64()));
            return true;
        }
        if (tagWireType == 1) {
            c(i10, Long.valueOf(codedInputStream.readFixed64()));
            return true;
        }
        if (tagWireType == 2) {
            c(i10, codedInputStream.readBytes());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.d();
            }
            c(i10, Integer.valueOf(codedInputStream.readFixed32()));
            return true;
        }
        UnknownFieldSetLite unknownFieldSetLite = new UnknownFieldSetLite();
        do {
            tag = codedInputStream.readTag();
            if (tag == 0) {
                break;
            }
        } while (unknownFieldSetLite.a(tag, codedInputStream));
        codedInputStream.checkLastTagWas((tagFieldNumber << 3) | 4);
        c(i10, unknownFieldSetLite);
        return true;
    }

    public final void c(int i10, Object obj) {
        if (!this.f21008e) {
            throw new UnsupportedOperationException();
        }
        int i11 = this.f21004a;
        int[] iArr = this.f21005b;
        if (i11 == iArr.length) {
            int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
            this.f21005b = Arrays.copyOf(iArr, i12);
            this.f21006c = Arrays.copyOf(this.f21006c, i12);
        }
        int[] iArr2 = this.f21005b;
        int i13 = this.f21004a;
        iArr2[i13] = i10;
        this.f21006c[i13] = obj;
        this.f21004a = i13 + 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnknownFieldSetLite)) {
            return false;
        }
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        int i10 = this.f21004a;
        if (i10 == unknownFieldSetLite.f21004a) {
            int[] iArr = this.f21005b;
            int[] iArr2 = unknownFieldSetLite.f21005b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f21006c;
            Object[] objArr2 = unknownFieldSetLite.f21006c;
            int i12 = this.f21004a;
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
        int i10 = this.f21007d;
        if (i10 != -1) {
            return i10;
        }
        int serializedSize = 0;
        for (int i11 = 0; i11 < this.f21004a; i11++) {
            int i12 = this.f21005b[i11];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i12);
            int tagWireType = WireFormat.getTagWireType(i12);
            if (tagWireType == 0) {
                iComputeUInt64Size = CodedOutputStream.computeUInt64Size(tagFieldNumber, ((Long) this.f21006c[i11]).longValue());
            } else if (tagWireType == 1) {
                iComputeUInt64Size = CodedOutputStream.computeFixed64Size(tagFieldNumber, ((Long) this.f21006c[i11]).longValue());
            } else if (tagWireType != 2) {
                if (tagWireType == 3) {
                    serializedSize = ((UnknownFieldSetLite) this.f21006c[i11]).getSerializedSize() + (CodedOutputStream.computeTagSize(tagFieldNumber) * 2) + serializedSize;
                } else {
                    if (tagWireType != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.d());
                    }
                    iComputeUInt64Size = CodedOutputStream.computeFixed32Size(tagFieldNumber, ((Integer) this.f21006c[i11]).intValue());
                }
            } else {
                iComputeUInt64Size = CodedOutputStream.computeBytesSize(tagFieldNumber, (ByteString) this.f21006c[i11]);
            }
            serializedSize = iComputeUInt64Size + serializedSize;
        }
        this.f21007d = serializedSize;
        return serializedSize;
    }

    public int getSerializedSizeAsMessageSet() {
        int i10 = this.f21007d;
        if (i10 != -1) {
            return i10;
        }
        int iComputeRawMessageSetExtensionSize = 0;
        for (int i11 = 0; i11 < this.f21004a; i11++) {
            iComputeRawMessageSetExtensionSize += CodedOutputStream.computeRawMessageSetExtensionSize(WireFormat.getTagFieldNumber(this.f21005b[i11]), (ByteString) this.f21006c[i11]);
        }
        this.f21007d = iComputeRawMessageSetExtensionSize;
        return iComputeRawMessageSetExtensionSize;
    }

    public int hashCode() {
        int i10 = this.f21004a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f21005b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f21006c;
        int i15 = this.f21004a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public void makeImmutable() {
        this.f21008e = false;
    }

    public void writeAsMessageSetTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i10 = 0; i10 < this.f21004a; i10++) {
            codedOutputStream.writeRawMessageSetExtension(WireFormat.getTagFieldNumber(this.f21005b[i10]), (ByteString) this.f21006c[i10]);
        }
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i10 = 0; i10 < this.f21004a; i10++) {
            int i11 = this.f21005b[i10];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i11);
            int tagWireType = WireFormat.getTagWireType(i11);
            if (tagWireType == 0) {
                codedOutputStream.writeUInt64(tagFieldNumber, ((Long) this.f21006c[i10]).longValue());
            } else if (tagWireType == 1) {
                codedOutputStream.writeFixed64(tagFieldNumber, ((Long) this.f21006c[i10]).longValue());
            } else if (tagWireType == 2) {
                codedOutputStream.writeBytes(tagFieldNumber, (ByteString) this.f21006c[i10]);
            } else if (tagWireType == 3) {
                codedOutputStream.writeTag(tagFieldNumber, 3);
                ((UnknownFieldSetLite) this.f21006c[i10]).writeTo(codedOutputStream);
                codedOutputStream.writeTag(tagFieldNumber, 4);
            } else {
                if (tagWireType != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                codedOutputStream.writeFixed32(tagFieldNumber, ((Integer) this.f21006c[i10]).intValue());
            }
        }
    }

    public UnknownFieldSetLite(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f21007d = -1;
        this.f21004a = i10;
        this.f21005b = iArr;
        this.f21006c = objArr;
        this.f21008e = z10;
    }

    public void writeTo(Writer writer) throws IOException {
        if (this.f21004a == 0) {
            return;
        }
        h hVar = (h) writer;
        hVar.getClass();
        for (int i10 = 0; i10 < this.f21004a; i10++) {
            int i11 = this.f21005b[i10];
            Object obj = this.f21006c[i10];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i11);
            int tagWireType = WireFormat.getTagWireType(i11);
            if (tagWireType == 0) {
                hVar.j(tagFieldNumber, ((Long) obj).longValue());
            } else if (tagWireType == 1) {
                hVar.f(tagFieldNumber, ((Long) obj).longValue());
            } else if (tagWireType == 2) {
                hVar.b(tagFieldNumber, (ByteString) obj);
            } else if (tagWireType == 3) {
                hVar.getClass();
                CodedOutputStream codedOutputStream = hVar.f21064a;
                codedOutputStream.writeTag(tagFieldNumber, 3);
                ((UnknownFieldSetLite) obj).writeTo(writer);
                codedOutputStream.writeTag(tagFieldNumber, 4);
            } else if (tagWireType == 5) {
                hVar.e(tagFieldNumber, ((Integer) obj).intValue());
            } else {
                throw new RuntimeException(InvalidProtocolBufferException.d());
            }
        }
    }
}
