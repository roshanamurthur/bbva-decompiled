package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: CodedInputStreamReader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CodedInputStream f21057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21060d = 0;

    /* JADX INFO: compiled from: CodedInputStreamReader.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21061a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f21061a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21061a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21061a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21061a[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21061a[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21061a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21061a[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21061a[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21061a[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21061a[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21061a[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21061a[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21061a[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21061a[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f21061a[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f21061a[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f21061a[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public g(CodedInputStream codedInputStream) {
        Charset charset = Internal.f20943a;
        if (codedInputStream == null) {
            throw new NullPointerException("input");
        }
        this.f21057a = codedInputStream;
        codedInputStream.f20812d = this;
    }

    public static void V(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public static void W(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final void A(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof p;
        CodedInputStream codedInputStream = this.f21057a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f21058b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.readInt32()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f21058b);
                this.f21060d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Integer.valueOf(codedInputStream.readInt32()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            T(totalBytesRead);
            return;
        }
        p pVar = (p) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f21058b);
        if (tagWireType2 == 0) {
            do {
                pVar.addInt(codedInputStream.readInt32());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f21058b);
            this.f21060d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            pVar.addInt(codedInputStream.readInt32());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        T(totalBytesRead2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.m0
    public final <K, V> void B(Map<K, V> map, MapEntryLite.b<K, V> bVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        U(2);
        CodedInputStream codedInputStream = this.f21057a;
        int iPushLimit = codedInputStream.pushLimit(codedInputStream.readUInt32());
        Object objP = bVar.f20973b;
        V v3 = bVar.f20975d;
        Object objP2 = v3;
        while (true) {
            try {
                int iF = F();
                if (iF == Integer.MAX_VALUE || codedInputStream.isAtEnd()) {
                    break;
                }
                if (iF == 1) {
                    objP = P(bVar.f20972a, null, null);
                } else if (iF != 2) {
                    try {
                        if (!J()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!J()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objP2 = P(bVar.f20974c, v3.getClass(), extensionRegistryLite);
                }
            } catch (Throwable th2) {
                codedInputStream.popLimit(iPushLimit);
                throw th2;
            }
        }
        map.put(objP, objP2);
        codedInputStream.popLimit(iPushLimit);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final void C(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof p;
        CodedInputStream codedInputStream = this.f21057a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f21058b);
            if (tagWireType == 2) {
                int uInt32 = codedInputStream.readUInt32();
                V(uInt32);
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
            } while (tag == this.f21058b);
            this.f21060d = tag;
            return;
        }
        p pVar = (p) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f21058b);
        if (tagWireType2 == 2) {
            int uInt33 = codedInputStream.readUInt32();
            V(uInt33);
            int totalBytesRead2 = codedInputStream.getTotalBytesRead() + uInt33;
            do {
                pVar.addInt(codedInputStream.readFixed32());
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            pVar.addInt(codedInputStream.readFixed32());
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                tag2 = codedInputStream.readTag();
            }
        } while (tag2 == this.f21058b);
        this.f21060d = tag2;
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final long D() throws IOException {
        U(0);
        return this.f21057a.readSInt64();
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final String E() throws IOException {
        U(2);
        return this.f21057a.readString();
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final int F() throws IOException {
        int i10 = this.f21060d;
        if (i10 != 0) {
            this.f21058b = i10;
            this.f21060d = 0;
        } else {
            this.f21058b = this.f21057a.readTag();
        }
        int i11 = this.f21058b;
        if (i11 == 0 || i11 == this.f21059c) {
            return Integer.MAX_VALUE;
        }
        return WireFormat.getTagFieldNumber(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final void G(List<String> list) throws IOException {
        S(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final void H(List<Float> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof n;
        CodedInputStream codedInputStream = this.f21057a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f21058b);
            if (tagWireType == 2) {
                int uInt32 = codedInputStream.readUInt32();
                V(uInt32);
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
            } while (tag == this.f21058b);
            this.f21060d = tag;
            return;
        }
        n nVar = (n) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f21058b);
        if (tagWireType2 == 2) {
            int uInt33 = codedInputStream.readUInt32();
            V(uInt33);
            int totalBytesRead2 = codedInputStream.getTotalBytesRead() + uInt33;
            do {
                nVar.addFloat(codedInputStream.readFloat());
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            nVar.addFloat(codedInputStream.readFloat());
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                tag2 = codedInputStream.readTag();
            }
        } while (tag2 == this.f21058b);
        this.f21060d = tag2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.m0
    public final <T> void I(List<T> list, o0<T> o0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int tag;
        if (WireFormat.getTagWireType(this.f21058b) != 3) {
            throw InvalidProtocolBufferException.d();
        }
        int i10 = this.f21058b;
        do {
            list.add(Q(o0Var, extensionRegistryLite));
            CodedInputStream codedInputStream = this.f21057a;
            if (codedInputStream.isAtEnd() || this.f21060d != 0) {
                return;
            } else {
                tag = codedInputStream.readTag();
            }
        } while (tag == i10);
        this.f21060d = tag;
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final boolean J() throws IOException {
        int i10;
        CodedInputStream codedInputStream = this.f21057a;
        if (codedInputStream.isAtEnd() || (i10 = this.f21058b) == this.f21059c) {
            return false;
        }
        return codedInputStream.skipField(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final int K() throws IOException {
        U(5);
        return this.f21057a.readSFixed32();
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final void L(List<ByteString> list) throws IOException {
        int tag;
        if (WireFormat.getTagWireType(this.f21058b) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(o());
            CodedInputStream codedInputStream = this.f21057a;
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                tag = codedInputStream.readTag();
            }
        } while (tag == this.f21058b);
        this.f21060d = tag;
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final void M(List<Double> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof i;
        CodedInputStream codedInputStream = this.f21057a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f21058b);
            if (tagWireType == 1) {
                do {
                    list.add(Double.valueOf(codedInputStream.readDouble()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f21058b);
                this.f21060d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int uInt32 = codedInputStream.readUInt32();
            W(uInt32);
            int totalBytesRead = codedInputStream.getTotalBytesRead() + uInt32;
            do {
                list.add(Double.valueOf(codedInputStream.readDouble()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            return;
        }
        i iVar = (i) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f21058b);
        if (tagWireType2 == 1) {
            do {
                iVar.addDouble(codedInputStream.readDouble());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f21058b);
            this.f21060d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int uInt33 = codedInputStream.readUInt32();
        W(uInt33);
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + uInt33;
        do {
            iVar.addDouble(codedInputStream.readDouble());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final long N() throws IOException {
        U(0);
        return this.f21057a.readInt64();
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final String O() throws IOException {
        U(2);
        return this.f21057a.readStringRequireUtf8();
    }

    public final Object P(WireFormat.FieldType fieldType, Class<?> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        switch (a.f21061a[fieldType.ordinal()]) {
            case 1:
                return Boolean.valueOf(e());
            case 2:
                return o();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(k());
            case 5:
                return Integer.valueOf(x());
            case 6:
                return Long.valueOf(b());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(p());
            case 9:
                return Long.valueOf(N());
            case 10:
                return v(cls, extensionRegistryLite);
            case 11:
                return Integer.valueOf(K());
            case 12:
                return Long.valueOf(f());
            case 13:
                return Integer.valueOf(l());
            case 14:
                return Long.valueOf(D());
            case 15:
                return O();
            case 16:
                return Integer.valueOf(h());
            case 17:
                return Long.valueOf(u());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    public final <T> T Q(o0<T> o0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int i10 = this.f21059c;
        this.f21059c = (WireFormat.getTagFieldNumber(this.f21058b) << 3) | 4;
        try {
            T tNewInstance = o0Var.newInstance();
            o0Var.g(tNewInstance, this, extensionRegistryLite);
            o0Var.b(tNewInstance);
            if (this.f21058b != this.f21059c) {
                throw InvalidProtocolBufferException.g();
            }
            this.f21059c = i10;
            return tNewInstance;
        } catch (Throwable th2) {
            this.f21059c = i10;
            throw th2;
        }
    }

    public final <T> T R(o0<T> o0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        CodedInputStream codedInputStream = this.f21057a;
        int uInt32 = codedInputStream.readUInt32();
        if (codedInputStream.f20809a >= codedInputStream.f20810b) {
            throw InvalidProtocolBufferException.h();
        }
        int iPushLimit = codedInputStream.pushLimit(uInt32);
        T tNewInstance = o0Var.newInstance();
        codedInputStream.f20809a++;
        o0Var.g(tNewInstance, this, extensionRegistryLite);
        o0Var.b(tNewInstance);
        codedInputStream.checkLastTagWas(0);
        codedInputStream.f20809a--;
        codedInputStream.popLimit(iPushLimit);
        return tNewInstance;
    }

    public final void S(List<String> list, boolean z10) throws IOException {
        int tag;
        int tag2;
        if (WireFormat.getTagWireType(this.f21058b) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        boolean z11 = list instanceof LazyStringList;
        CodedInputStream codedInputStream = this.f21057a;
        if (!z11 || z10) {
            do {
                list.add(z10 ? O() : E());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag = codedInputStream.readTag();
                }
            } while (tag == this.f21058b);
            this.f21060d = tag;
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        do {
            lazyStringList.add(o());
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                tag2 = codedInputStream.readTag();
            }
        } while (tag2 == this.f21058b);
        this.f21060d = tag2;
    }

    public final void T(int i10) throws IOException {
        if (this.f21057a.getTotalBytesRead() != i10) {
            throw InvalidProtocolBufferException.i();
        }
    }

    public final void U(int i10) throws IOException {
        if (WireFormat.getTagWireType(this.f21058b) != i10) {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final <T> T a(o0<T> o0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        U(2);
        return (T) R(o0Var, extensionRegistryLite);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final long b() throws IOException {
        U(1);
        return this.f21057a.readFixed64();
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final void c(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof p;
        CodedInputStream codedInputStream = this.f21057a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f21058b);
            if (tagWireType == 2) {
                int uInt32 = codedInputStream.readUInt32();
                V(uInt32);
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
            } while (tag == this.f21058b);
            this.f21060d = tag;
            return;
        }
        p pVar = (p) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f21058b);
        if (tagWireType2 == 2) {
            int uInt33 = codedInputStream.readUInt32();
            V(uInt33);
            int totalBytesRead2 = codedInputStream.getTotalBytesRead() + uInt33;
            do {
                pVar.addInt(codedInputStream.readSFixed32());
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            pVar.addInt(codedInputStream.readSFixed32());
            if (codedInputStream.isAtEnd()) {
                return;
            } else {
                tag2 = codedInputStream.readTag();
            }
        } while (tag2 == this.f21058b);
        this.f21060d = tag2;
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final void d(List<Long> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof t;
        CodedInputStream codedInputStream = this.f21057a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f21058b);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.readSInt64()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f21058b);
                this.f21060d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Long.valueOf(codedInputStream.readSInt64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            T(totalBytesRead);
            return;
        }
        t tVar = (t) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f21058b);
        if (tagWireType2 == 0) {
            do {
                tVar.addLong(codedInputStream.readSInt64());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f21058b);
            this.f21060d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            tVar.addLong(codedInputStream.readSInt64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        T(totalBytesRead2);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final boolean e() throws IOException {
        U(0);
        return this.f21057a.readBool();
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final long f() throws IOException {
        U(1);
        return this.f21057a.readSFixed64();
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final void g(List<Long> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof t;
        CodedInputStream codedInputStream = this.f21057a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f21058b);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.readUInt64()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f21058b);
                this.f21060d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Long.valueOf(codedInputStream.readUInt64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            T(totalBytesRead);
            return;
        }
        t tVar = (t) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f21058b);
        if (tagWireType2 == 0) {
            do {
                tVar.addLong(codedInputStream.readUInt64());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f21058b);
            this.f21060d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            tVar.addLong(codedInputStream.readUInt64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        T(totalBytesRead2);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final int getTag() {
        return this.f21058b;
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final int h() throws IOException {
        U(0);
        return this.f21057a.readUInt32();
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final void i(List<Long> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof t;
        CodedInputStream codedInputStream = this.f21057a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f21058b);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.readInt64()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f21058b);
                this.f21060d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Long.valueOf(codedInputStream.readInt64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            T(totalBytesRead);
            return;
        }
        t tVar = (t) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f21058b);
        if (tagWireType2 == 0) {
            do {
                tVar.addLong(codedInputStream.readInt64());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f21058b);
            this.f21060d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            tVar.addLong(codedInputStream.readInt64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        T(totalBytesRead2);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final void j(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof p;
        CodedInputStream codedInputStream = this.f21057a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f21058b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.readEnum()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f21058b);
                this.f21060d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Integer.valueOf(codedInputStream.readEnum()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            T(totalBytesRead);
            return;
        }
        p pVar = (p) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f21058b);
        if (tagWireType2 == 0) {
            do {
                pVar.addInt(codedInputStream.readEnum());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f21058b);
            this.f21060d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            pVar.addInt(codedInputStream.readEnum());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        T(totalBytesRead2);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final int k() throws IOException {
        U(0);
        return this.f21057a.readEnum();
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final int l() throws IOException {
        U(0);
        return this.f21057a.readSInt32();
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final void m(List<Boolean> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof f;
        CodedInputStream codedInputStream = this.f21057a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f21058b);
            if (tagWireType == 0) {
                do {
                    list.add(Boolean.valueOf(codedInputStream.readBool()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f21058b);
                this.f21060d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Boolean.valueOf(codedInputStream.readBool()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            T(totalBytesRead);
            return;
        }
        f fVar = (f) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f21058b);
        if (tagWireType2 == 0) {
            do {
                fVar.addBoolean(codedInputStream.readBool());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f21058b);
            this.f21060d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            fVar.addBoolean(codedInputStream.readBool());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        T(totalBytesRead2);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final void n(List<String> list) throws IOException {
        S(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final ByteString o() throws IOException {
        U(2);
        return this.f21057a.readBytes();
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final int p() throws IOException {
        U(0);
        return this.f21057a.readInt32();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.m0
    public final <T> void q(List<T> list, o0<T> o0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int tag;
        if (WireFormat.getTagWireType(this.f21058b) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int i10 = this.f21058b;
        do {
            list.add(R(o0Var, extensionRegistryLite));
            CodedInputStream codedInputStream = this.f21057a;
            if (codedInputStream.isAtEnd() || this.f21060d != 0) {
                return;
            } else {
                tag = codedInputStream.readTag();
            }
        } while (tag == i10);
        this.f21060d = tag;
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final void r(List<Long> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof t;
        CodedInputStream codedInputStream = this.f21057a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f21058b);
            if (tagWireType == 1) {
                do {
                    list.add(Long.valueOf(codedInputStream.readFixed64()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f21058b);
                this.f21060d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int uInt32 = codedInputStream.readUInt32();
            W(uInt32);
            int totalBytesRead = codedInputStream.getTotalBytesRead() + uInt32;
            do {
                list.add(Long.valueOf(codedInputStream.readFixed64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            return;
        }
        t tVar = (t) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f21058b);
        if (tagWireType2 == 1) {
            do {
                tVar.addLong(codedInputStream.readFixed64());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f21058b);
            this.f21060d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int uInt33 = codedInputStream.readUInt32();
        W(uInt33);
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + uInt33;
        do {
            tVar.addLong(codedInputStream.readFixed64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final double readDouble() throws IOException {
        U(1);
        return this.f21057a.readDouble();
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final float readFloat() throws IOException {
        U(5);
        return this.f21057a.readFloat();
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final <T> T s(o0<T> o0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        U(3);
        return (T) Q(o0Var, extensionRegistryLite);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final void t(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof p;
        CodedInputStream codedInputStream = this.f21057a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f21058b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.readSInt32()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f21058b);
                this.f21060d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Integer.valueOf(codedInputStream.readSInt32()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            T(totalBytesRead);
            return;
        }
        p pVar = (p) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f21058b);
        if (tagWireType2 == 0) {
            do {
                pVar.addInt(codedInputStream.readSInt32());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f21058b);
            this.f21060d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            pVar.addInt(codedInputStream.readSInt32());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        T(totalBytesRead2);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final long u() throws IOException {
        U(0);
        return this.f21057a.readUInt64();
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final <T> T v(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        U(2);
        return (T) R(j0.f21070c.a(cls), extensionRegistryLite);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final void w(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof p;
        CodedInputStream codedInputStream = this.f21057a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f21058b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.readUInt32()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f21058b);
                this.f21060d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int totalBytesRead = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
            do {
                list.add(Integer.valueOf(codedInputStream.readUInt32()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            T(totalBytesRead);
            return;
        }
        p pVar = (p) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f21058b);
        if (tagWireType2 == 0) {
            do {
                pVar.addInt(codedInputStream.readUInt32());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f21058b);
            this.f21060d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + codedInputStream.readUInt32();
        do {
            pVar.addInt(codedInputStream.readUInt32());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
        T(totalBytesRead2);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final int x() throws IOException {
        U(5);
        return this.f21057a.readFixed32();
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final <T> T y(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        U(3);
        return (T) Q(j0.f21070c.a(cls), extensionRegistryLite);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final void z(List<Long> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof t;
        CodedInputStream codedInputStream = this.f21057a;
        if (!z10) {
            int tagWireType = WireFormat.getTagWireType(this.f21058b);
            if (tagWireType == 1) {
                do {
                    list.add(Long.valueOf(codedInputStream.readSFixed64()));
                    if (codedInputStream.isAtEnd()) {
                        return;
                    } else {
                        tag = codedInputStream.readTag();
                    }
                } while (tag == this.f21058b);
                this.f21060d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int uInt32 = codedInputStream.readUInt32();
            W(uInt32);
            int totalBytesRead = codedInputStream.getTotalBytesRead() + uInt32;
            do {
                list.add(Long.valueOf(codedInputStream.readSFixed64()));
            } while (codedInputStream.getTotalBytesRead() < totalBytesRead);
            return;
        }
        t tVar = (t) list;
        int tagWireType2 = WireFormat.getTagWireType(this.f21058b);
        if (tagWireType2 == 1) {
            do {
                tVar.addLong(codedInputStream.readSFixed64());
                if (codedInputStream.isAtEnd()) {
                    return;
                } else {
                    tag2 = codedInputStream.readTag();
                }
            } while (tag2 == this.f21058b);
            this.f21060d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int uInt33 = codedInputStream.readUInt32();
        W(uInt33);
        int totalBytesRead2 = codedInputStream.getTotalBytesRead() + uInt33;
        do {
            tVar.addLong(codedInputStream.readSFixed64());
        } while (codedInputStream.getTotalBytesRead() < totalBytesRead2);
    }
}
