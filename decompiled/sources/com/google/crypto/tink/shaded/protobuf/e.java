package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: compiled from: CodedInputStreamReader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CodedInputStream f47209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f47212d = 0;

    /* JADX INFO: compiled from: CodedInputStreamReader.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47213a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f47213a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47213a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47213a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47213a[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47213a[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47213a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f47213a[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f47213a[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f47213a[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f47213a[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f47213a[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f47213a[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f47213a[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f47213a[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f47213a[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f47213a[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f47213a[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public e(CodedInputStream codedInputStream) {
        Charset charset = Internal.f47106a;
        if (codedInputStream == null) {
            throw new NullPointerException("input");
        }
        this.f47209a = codedInputStream;
        codedInputStream.f46976d = this;
    }

    public static void A(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public static void z(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public final int a() throws IOException {
        int i10 = this.f47212d;
        if (i10 != 0) {
            this.f47210b = i10;
            this.f47212d = 0;
        } else {
            this.f47210b = this.f47209a.readTag();
        }
        int i11 = this.f47210b;
        if (i11 == 0 || i11 == this.f47211c) {
            return Integer.MAX_VALUE;
        }
        return WireFormat.getTagFieldNumber(i11);
    }

    public final <T> void b(T t10, q0<T> q0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int i10 = this.f47211c;
        this.f47211c = (WireFormat.getTagFieldNumber(this.f47210b) << 3) | 4;
        try {
            q0Var.i(t10, this, extensionRegistryLite);
            if (this.f47210b != this.f47211c) {
                throw InvalidProtocolBufferException.g();
            }
            this.f47211c = i10;
        } catch (Throwable th2) {
            this.f47211c = i10;
            throw th2;
        }
    }

    public final <T> void c(T t10, q0<T> q0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        CodedInputStream codedInputStream = this.f47209a;
        int uInt32 = codedInputStream.readUInt32();
        if (codedInputStream.f46973a >= codedInputStream.f46974b) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iPushLimit = codedInputStream.pushLimit(uInt32);
        codedInputStream.f46973a++;
        q0Var.i(t10, this, extensionRegistryLite);
        codedInputStream.checkLastTagWas(0);
        codedInputStream.f46973a--;
        codedInputStream.popLimit(iPushLimit);
    }

    public final void d(List<Boolean> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof d;
        CodedInputStream codedInputStream = this.f47209a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f47210b);
            if (tagWireType == 0) {
                do {
                    list.add(Boolean.valueOf(codedInputStream.readBool()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f47210b);
                this.f47212d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Boolean.valueOf(codedInputStream.readBool()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        d dVar = (d) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f47210b);
        if (tagWireType2 == 0) {
            do {
                dVar.addBoolean(codedInputStream.readBool());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f47210b);
            this.f47212d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            dVar.addBoolean(codedInputStream.readBool());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final ByteString e() throws IOException {
        x(2);
        return this.f47209a.readBytes();
    }

    public final void f(List<ByteString> list) throws IOException {
        int tag;
        if (WireFormat.getTagWireType(this.f47210b) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(e());
            CodedInputStream codedInputStream = this.f47209a;
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                tag = codedInputStream.readTag();
            }
        } while (tag == this.f47210b);
        this.f47212d = tag;
    }

    public final void g(List<Double> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof g;
        CodedInputStream codedInputStream = this.f47209a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f47210b);
            if (tagWireType == 1) {
                do {
                    list.add(Double.valueOf(codedInputStream.readDouble()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f47210b);
                this.f47212d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int uInt32 = codedInputStream.readUInt32();
            A(uInt32);
            int totalBytesRead = codedInputStream.getTotalBytesRead() + uInt32;
            do {
                list.add(Double.valueOf(codedInputStream.readDouble()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            return;
        }
        g gVar = (g) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f47210b);
        if (tagWireType2 == 1) {
            do {
                gVar.addDouble(codedInputStream.readDouble());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f47210b);
            this.f47212d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int uInt33 = codedInputStream.readUInt32();
        A(uInt33);
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + uInt33;
        do {
            gVar.addDouble(codedInputStream.readDouble());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
    }

    public final void h(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof n;
        CodedInputStream codedInputStream = this.f47209a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f47210b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.readEnum()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f47210b);
                this.f47212d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Integer.valueOf(codedInputStream.readEnum()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        n nVar = (n) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f47210b);
        if (tagWireType2 == 0) {
            do {
                nVar.addInt(codedInputStream.readEnum());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f47210b);
            this.f47212d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            nVar.addInt(codedInputStream.readEnum());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final Object i(WireFormat.FieldType fieldType, Class<?> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int i10 = a.f47213a[fieldType.ordinal()];
        CodedInputStream codedInputStream = this.f47209a;
        switch (i10) {
            case 1:
                x(0);
                return Boolean.valueOf(codedInputStream.readBool());
            case 2:
                return e();
            case 3:
                x(1);
                return Double.valueOf(codedInputStream.readDouble());
            case 4:
                x(0);
                return Integer.valueOf(codedInputStream.readEnum());
            case 5:
                x(5);
                return Integer.valueOf(codedInputStream.readFixed32());
            case 6:
                x(1);
                return Long.valueOf(codedInputStream.readFixed64());
            case 7:
                x(5);
                return Float.valueOf(codedInputStream.readFloat());
            case 8:
                x(0);
                return Integer.valueOf(codedInputStream.readInt32());
            case 9:
                x(0);
                return Long.valueOf(codedInputStream.readInt64());
            case 10:
                return o(cls, extensionRegistryLite);
            case 11:
                x(5);
                return Integer.valueOf(codedInputStream.readSFixed32());
            case 12:
                x(1);
                return Long.valueOf(codedInputStream.readSFixed64());
            case 13:
                x(0);
                return Integer.valueOf(codedInputStream.readSInt32());
            case 14:
                x(0);
                return Long.valueOf(codedInputStream.readSInt64());
            case 15:
                x(2);
                return codedInputStream.readStringRequireUtf8();
            case 16:
                x(0);
                return Integer.valueOf(codedInputStream.readUInt32());
            case 17:
                x(0);
                return Long.valueOf(codedInputStream.readUInt64());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final void j(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof n;
        CodedInputStream codedInputStream = this.f47209a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f47210b);
            if (tagWireType == 2) {
                int uInt32 = codedInputStream.readUInt32();
                z(uInt32);
                int totalBytesRead = codedInputStream.getTotalBytesRead() + uInt32;
                do {
                    list.add(Integer.valueOf(codedInputStream.readFixed32()));
                } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(codedInputStream.readFixed32()));
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag = codedInputStream.readTag();
                }
            } while (tag == this.f47210b);
            this.f47212d = tag;
            return;
        }
        n nVar = (n) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f47210b);
        if (tagWireType2 == 2) {
            int uInt33 = codedInputStream.readUInt32();
            z(uInt33);
            int totalBytesRead2 = codedInputStream.getTotalBytesRead() + uInt33;
            do {
                nVar.addInt(codedInputStream.readFixed32());
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            nVar.addInt(codedInputStream.readFixed32());
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                tag2 = codedInputStream.readTag();
            }
        } while (tag2 == this.f47210b);
        this.f47212d = tag2;
    }

    public final void k(List<Long> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof v;
        CodedInputStream codedInputStream = this.f47209a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f47210b);
            if (tagWireType == 1) {
                do {
                    list.add(Long.valueOf(codedInputStream.readFixed64()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f47210b);
                this.f47212d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int uInt32 = codedInputStream.readUInt32();
            A(uInt32);
            int totalBytesRead = codedInputStream.getTotalBytesRead() + uInt32;
            do {
                list.add(Long.valueOf(codedInputStream.readFixed64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            return;
        }
        v vVar = (v) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f47210b);
        if (tagWireType2 == 1) {
            do {
                vVar.addLong(codedInputStream.readFixed64());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f47210b);
            this.f47212d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int uInt33 = codedInputStream.readUInt32();
        A(uInt33);
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + uInt33;
        do {
            vVar.addLong(codedInputStream.readFixed64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
    }

    public final void l(List<Float> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof l;
        CodedInputStream codedInputStream = this.f47209a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f47210b);
            if (tagWireType == 2) {
                int uInt32 = codedInputStream.readUInt32();
                z(uInt32);
                int totalBytesRead = codedInputStream.getTotalBytesRead() + uInt32;
                do {
                    list.add(Float.valueOf(codedInputStream.readFloat()));
                } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Float.valueOf(codedInputStream.readFloat()));
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag = codedInputStream.readTag();
                }
            } while (tag == this.f47210b);
            this.f47212d = tag;
            return;
        }
        l lVar = (l) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f47210b);
        if (tagWireType2 == 2) {
            int uInt33 = codedInputStream.readUInt32();
            z(uInt33);
            int totalBytesRead2 = codedInputStream.getTotalBytesRead() + uInt33;
            do {
                lVar.addFloat(codedInputStream.readFloat());
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            lVar.addFloat(codedInputStream.readFloat());
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                tag2 = codedInputStream.readTag();
            }
        } while (tag2 == this.f47210b);
        this.f47212d = tag2;
    }

    public final void m(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof n;
        CodedInputStream codedInputStream = this.f47209a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f47210b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.readInt32()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f47210b);
                this.f47212d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Integer.valueOf(codedInputStream.readInt32()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        n nVar = (n) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f47210b);
        if (tagWireType2 == 0) {
            do {
                nVar.addInt(codedInputStream.readInt32());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f47210b);
            this.f47212d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            nVar.addInt(codedInputStream.readInt32());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final void n(List<Long> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof v;
        CodedInputStream codedInputStream = this.f47209a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f47210b);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.readInt64()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f47210b);
                this.f47212d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Long.valueOf(codedInputStream.readInt64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        v vVar = (v) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f47210b);
        if (tagWireType2 == 0) {
            do {
                vVar.addLong(codedInputStream.readInt64());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f47210b);
            this.f47212d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            vVar.addLong(codedInputStream.readInt64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final <T> T o(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        x(2);
        q0<T> q0VarA = l0.f47234c.a(cls);
        T tNewInstance = q0VarA.newInstance();
        c(tNewInstance, q0VarA, extensionRegistryLite);
        q0VarA.b(tNewInstance);
        return tNewInstance;
    }

    public final void p(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof n;
        CodedInputStream codedInputStream = this.f47209a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f47210b);
            if (tagWireType == 2) {
                int uInt32 = codedInputStream.readUInt32();
                z(uInt32);
                int totalBytesRead = codedInputStream.getTotalBytesRead() + uInt32;
                do {
                    list.add(Integer.valueOf(codedInputStream.readSFixed32()));
                } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(codedInputStream.readSFixed32()));
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag = codedInputStream.readTag();
                }
            } while (tag == this.f47210b);
            this.f47212d = tag;
            return;
        }
        n nVar = (n) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f47210b);
        if (tagWireType2 == 2) {
            int uInt33 = codedInputStream.readUInt32();
            z(uInt33);
            int totalBytesRead2 = codedInputStream.getTotalBytesRead() + uInt33;
            do {
                nVar.addInt(codedInputStream.readSFixed32());
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            nVar.addInt(codedInputStream.readSFixed32());
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                tag2 = codedInputStream.readTag();
            }
        } while (tag2 == this.f47210b);
        this.f47212d = tag2;
    }

    public final void q(List<Long> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof v;
        CodedInputStream codedInputStream = this.f47209a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f47210b);
            if (tagWireType == 1) {
                do {
                    list.add(Long.valueOf(codedInputStream.readSFixed64()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f47210b);
                this.f47212d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int uInt32 = codedInputStream.readUInt32();
            A(uInt32);
            int totalBytesRead = codedInputStream.getTotalBytesRead() + uInt32;
            do {
                list.add(Long.valueOf(codedInputStream.readSFixed64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            return;
        }
        v vVar = (v) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f47210b);
        if (tagWireType2 == 1) {
            do {
                vVar.addLong(codedInputStream.readSFixed64());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f47210b);
            this.f47212d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int uInt33 = codedInputStream.readUInt32();
        A(uInt33);
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + uInt33;
        do {
            vVar.addLong(codedInputStream.readSFixed64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
    }

    public final void r(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof n;
        CodedInputStream codedInputStream = this.f47209a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f47210b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.readSInt32()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f47210b);
                this.f47212d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Integer.valueOf(codedInputStream.readSInt32()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        n nVar = (n) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f47210b);
        if (tagWireType2 == 0) {
            do {
                nVar.addInt(codedInputStream.readSInt32());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f47210b);
            this.f47212d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            nVar.addInt(codedInputStream.readSInt32());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final void s(List<Long> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof v;
        CodedInputStream codedInputStream = this.f47209a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f47210b);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.readSInt64()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f47210b);
                this.f47212d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Long.valueOf(codedInputStream.readSInt64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        v vVar = (v) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f47210b);
        if (tagWireType2 == 0) {
            do {
                vVar.addLong(codedInputStream.readSInt64());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f47210b);
            this.f47212d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            vVar.addLong(codedInputStream.readSInt64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final void t(List<String> list, boolean z10) throws IOException {
        String string;
        int tag;
        int tag2;
        if (WireFormat.getTagWireType(this.f47210b) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        boolean z11 = list instanceof LazyStringList;
        CodedInputStream codedInputStream = this.f47209a;
        if (z11 && !z10) {
            LazyStringList lazyStringList = (LazyStringList) list;
            do {
                lazyStringList.add(e());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f47210b);
            this.f47212d = tag2;
            return;
        }
        do {
            if (z10) {
                x(2);
                string = codedInputStream.readStringRequireUtf8();
            } else {
                x(2);
                string = codedInputStream.readString();
            }
            list.add(string);
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                tag = codedInputStream.readTag();
            }
        } while (tag == this.f47210b);
        this.f47212d = tag;
    }

    public final void u(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof n;
        CodedInputStream codedInputStream = this.f47209a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f47210b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.readUInt32()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f47210b);
                this.f47212d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Integer.valueOf(codedInputStream.readUInt32()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        n nVar = (n) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f47210b);
        if (tagWireType2 == 0) {
            do {
                nVar.addInt(codedInputStream.readUInt32());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f47210b);
            this.f47212d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            nVar.addInt(codedInputStream.readUInt32());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final void v(List<Long> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof v;
        CodedInputStream codedInputStream = this.f47209a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f47210b);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.readUInt64()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f47210b);
                this.f47212d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Long.valueOf(codedInputStream.readUInt64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            w(totalBytesRead);
            return;
        }
        v vVar = (v) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f47210b);
        if (tagWireType2 == 0) {
            do {
                vVar.addLong(codedInputStream.readUInt64());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f47210b);
            this.f47212d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            vVar.addLong(codedInputStream.readUInt64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        w(totalBytesRead2);
    }

    public final void w(int i10) throws IOException {
        if (this.f47209a.getTotalBytesRead() != i10) {
            throw InvalidProtocolBufferException.h();
        }
    }

    public final void x(int i10) throws IOException {
        if (WireFormat.getTagWireType(this.f47210b) != i10) {
            throw InvalidProtocolBufferException.d();
        }
    }

    public final boolean y() throws IOException {
        int i10;
        CodedInputStream codedInputStream = this.f47209a;
        if (codedInputStream.isAtEnd() || (i10 = this.f47210b) == this.f47211c) {
            return false;
        }
        return codedInputStream.skipField(i10);
    }
}
