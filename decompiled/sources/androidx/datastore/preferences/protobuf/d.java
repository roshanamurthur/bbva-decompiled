package androidx.datastore.preferences.protobuf;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: BinaryReader.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d implements m0 {

    /* JADX INFO: compiled from: BinaryReader.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21045a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f21045a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21045a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21045a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21045a[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21045a[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21045a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21045a[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21045a[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21045a[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21045a[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21045a[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21045a[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21045a[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21045a[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f21045a[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f21045a[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f21045a[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* JADX INFO: compiled from: BinaryReader.java */
    public static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f21046a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f21047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f21048c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f21049d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f21050e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f21051f;

        public b(ByteBuffer byteBuffer) {
            this.f21047b = byteBuffer.array();
            this.f21048c = byteBuffer.position() + byteBuffer.arrayOffset();
            this.f21049d = byteBuffer.limit() + byteBuffer.arrayOffset();
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final void A(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof p)) {
                int tagWireType = WireFormat.getTagWireType(this.f21050e);
                if (tagWireType == 0) {
                    do {
                        list.add(Integer.valueOf(p()));
                        if (P()) {
                            return;
                        } else {
                            i10 = this.f21048c;
                        }
                    } while (X() == this.f21050e);
                    this.f21048c = i10;
                    return;
                }
                if (tagWireType != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iX = this.f21048c + X();
                while (this.f21048c < iX) {
                    list.add(Integer.valueOf(X()));
                }
                b0(iX);
                return;
            }
            p pVar = (p) list;
            int tagWireType2 = WireFormat.getTagWireType(this.f21050e);
            if (tagWireType2 == 0) {
                do {
                    pVar.addInt(p());
                    if (P()) {
                        return;
                    } else {
                        i11 = this.f21048c;
                    }
                } while (X() == this.f21050e);
                this.f21048c = i11;
                return;
            }
            if (tagWireType2 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iX2 = this.f21048c + X();
            while (this.f21048c < iX2) {
                pVar.addInt(X());
            }
            b0(iX2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.m0
        public final <K, V> void B(Map<K, V> map, MapEntryLite.b<K, V> bVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            c0(2);
            int iX = X();
            a0(iX);
            int i10 = this.f21049d;
            this.f21049d = this.f21048c + iX;
            try {
                Object objQ = bVar.f20973b;
                V v3 = bVar.f20975d;
                Object objQ2 = v3;
                while (true) {
                    int iF = F();
                    if (iF == Integer.MAX_VALUE) {
                        map.put(objQ, objQ2);
                        this.f21049d = i10;
                        return;
                    } else if (iF == 1) {
                        objQ = Q(bVar.f20972a, null, null);
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
                        objQ2 = Q(bVar.f20974c, v3.getClass(), extensionRegistryLite);
                    }
                }
            } catch (Throwable th2) {
                this.f21049d = i10;
                throw th2;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final void C(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof p)) {
                int tagWireType = WireFormat.getTagWireType(this.f21050e);
                if (tagWireType == 2) {
                    int iX = X();
                    d0(iX);
                    int i12 = this.f21048c + iX;
                    while (this.f21048c < i12) {
                        list.add(Integer.valueOf(S()));
                    }
                    return;
                }
                if (tagWireType != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    list.add(Integer.valueOf(x()));
                    if (P()) {
                        return;
                    } else {
                        i10 = this.f21048c;
                    }
                } while (X() == this.f21050e);
                this.f21048c = i10;
                return;
            }
            p pVar = (p) list;
            int tagWireType2 = WireFormat.getTagWireType(this.f21050e);
            if (tagWireType2 == 2) {
                int iX2 = X();
                d0(iX2);
                int i13 = this.f21048c + iX2;
                while (this.f21048c < i13) {
                    pVar.addInt(S());
                }
                return;
            }
            if (tagWireType2 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                pVar.addInt(x());
                if (P()) {
                    return;
                } else {
                    i11 = this.f21048c;
                }
            } while (X() == this.f21050e);
            this.f21048c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final long D() throws IOException {
            c0(0);
            return CodedInputStream.decodeZigZag64(Y());
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final String E() throws IOException {
            return V(false);
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final int F() throws IOException {
            if (P()) {
                return Integer.MAX_VALUE;
            }
            int iX = X();
            this.f21050e = iX;
            if (iX == this.f21051f) {
                return Integer.MAX_VALUE;
            }
            return WireFormat.getTagFieldNumber(iX);
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final void G(List<String> list) throws IOException {
            W(list, false);
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final void H(List<Float> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof n)) {
                int tagWireType = WireFormat.getTagWireType(this.f21050e);
                if (tagWireType == 2) {
                    int iX = X();
                    d0(iX);
                    int i12 = this.f21048c + iX;
                    while (this.f21048c < i12) {
                        list.add(Float.valueOf(Float.intBitsToFloat(S())));
                    }
                    return;
                }
                if (tagWireType != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (P()) {
                        return;
                    } else {
                        i10 = this.f21048c;
                    }
                } while (X() == this.f21050e);
                this.f21048c = i10;
                return;
            }
            n nVar = (n) list;
            int tagWireType2 = WireFormat.getTagWireType(this.f21050e);
            if (tagWireType2 == 2) {
                int iX2 = X();
                d0(iX2);
                int i13 = this.f21048c + iX2;
                while (this.f21048c < i13) {
                    nVar.addFloat(Float.intBitsToFloat(S()));
                }
                return;
            }
            if (tagWireType2 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                nVar.addFloat(readFloat());
                if (P()) {
                    return;
                } else {
                    i11 = this.f21048c;
                }
            } while (X() == this.f21050e);
            this.f21048c = i11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.m0
        public final <T> void I(List<T> list, o0<T> o0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int i10;
            if (WireFormat.getTagWireType(this.f21050e) != 3) {
                throw InvalidProtocolBufferException.d();
            }
            int i11 = this.f21050e;
            do {
                list.add(R(o0Var, extensionRegistryLite));
                if (P()) {
                    return;
                } else {
                    i10 = this.f21048c;
                }
            } while (X() == i11);
            this.f21048c = i10;
        }

        /* JADX WARN: Code duplicated, block: B:44:0x008f  */
        /* JADX WARN: Code duplicated, block: B:46:0x0095  */
        /* JADX WARN: Code duplicated, block: B:49:0x009e A[LOOP:2: B:43:0x008d->B:49:0x009e, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:61:0x00a1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:62:0x009d A[SYNTHETIC] */
        @Override // androidx.datastore.preferences.protobuf.m0
        public final boolean J() throws IOException {
            int i10;
            int i11;
            if (P() || (i10 = this.f21050e) == this.f21051f) {
                return false;
            }
            int tagWireType = WireFormat.getTagWireType(i10);
            if (tagWireType != 0) {
                if (tagWireType == 1) {
                    a0(8);
                    this.f21048c += 8;
                    return true;
                }
                if (tagWireType == 2) {
                    int iX = X();
                    a0(iX);
                    this.f21048c += iX;
                    return true;
                }
                if (tagWireType != 3) {
                    if (tagWireType != 5) {
                        throw InvalidProtocolBufferException.d();
                    }
                    a0(4);
                    this.f21048c += 4;
                    return true;
                }
                int i12 = this.f21051f;
                this.f21051f = 4 | (WireFormat.getTagFieldNumber(this.f21050e) << 3);
                while (F() != Integer.MAX_VALUE && J()) {
                }
                if (this.f21050e != this.f21051f) {
                    throw InvalidProtocolBufferException.g();
                }
                this.f21051f = i12;
                return true;
            }
            int i13 = this.f21049d;
            int i14 = this.f21048c;
            int i15 = i13 - i14;
            byte[] bArr = this.f21047b;
            if (i15 < 10) {
                for (int i16 = 0; i16 < 10; i16++) {
                    i11 = this.f21048c;
                    if (i11 != this.f21049d) {
                        throw InvalidProtocolBufferException.i();
                    }
                    this.f21048c = i11 + 1;
                    if (bArr[i11] >= 0) {
                    }
                }
                throw InvalidProtocolBufferException.e();
            }
            int i17 = 0;
            while (i17 < 10) {
                int i18 = i14 + 1;
                if (bArr[i14] >= 0) {
                    this.f21048c = i18;
                } else {
                    i17++;
                    i14 = i18;
                }
            }
            while (i16 < 10) {
                i11 = this.f21048c;
                if (i11 != this.f21049d) {
                    throw InvalidProtocolBufferException.i();
                }
                this.f21048c = i11 + 1;
                if (bArr[i11] >= 0) {
                }
            }
            throw InvalidProtocolBufferException.e();
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final int K() throws IOException {
            c0(5);
            a0(4);
            return S();
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final void L(List<ByteString> list) throws IOException {
            int i10;
            if (WireFormat.getTagWireType(this.f21050e) != 2) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(o());
                if (P()) {
                    return;
                } else {
                    i10 = this.f21048c;
                }
            } while (X() == this.f21050e);
            this.f21048c = i10;
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final void M(List<Double> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof i)) {
                int tagWireType = WireFormat.getTagWireType(this.f21050e);
                if (tagWireType == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (P()) {
                            return;
                        } else {
                            i10 = this.f21048c;
                        }
                    } while (X() == this.f21050e);
                    this.f21048c = i10;
                    return;
                }
                if (tagWireType != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iX = X();
                e0(iX);
                int i12 = this.f21048c + iX;
                while (this.f21048c < i12) {
                    list.add(Double.valueOf(Double.longBitsToDouble(T())));
                }
                return;
            }
            i iVar = (i) list;
            int tagWireType2 = WireFormat.getTagWireType(this.f21050e);
            if (tagWireType2 == 1) {
                do {
                    iVar.addDouble(readDouble());
                    if (P()) {
                        return;
                    } else {
                        i11 = this.f21048c;
                    }
                } while (X() == this.f21050e);
                this.f21048c = i11;
                return;
            }
            if (tagWireType2 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iX2 = X();
            e0(iX2);
            int i13 = this.f21048c + iX2;
            while (this.f21048c < i13) {
                iVar.addDouble(Double.longBitsToDouble(T()));
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final long N() throws IOException {
            c0(0);
            return Y();
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final String O() throws IOException {
            return V(true);
        }

        public final boolean P() {
            return this.f21048c == this.f21049d;
        }

        public final Object Q(WireFormat.FieldType fieldType, Class<?> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            switch (a.f21045a[fieldType.ordinal()]) {
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
                    return V(true);
                case 16:
                    return Integer.valueOf(h());
                case 17:
                    return Long.valueOf(u());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        public final <T> T R(o0<T> o0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int i10 = this.f21051f;
            this.f21051f = (WireFormat.getTagFieldNumber(this.f21050e) << 3) | 4;
            try {
                T tNewInstance = o0Var.newInstance();
                o0Var.g(tNewInstance, this, extensionRegistryLite);
                o0Var.b(tNewInstance);
                if (this.f21050e != this.f21051f) {
                    throw InvalidProtocolBufferException.g();
                }
                this.f21051f = i10;
                return tNewInstance;
            } catch (Throwable th2) {
                this.f21051f = i10;
                throw th2;
            }
        }

        public final int S() {
            int i10 = this.f21048c;
            this.f21048c = i10 + 4;
            byte[] bArr = this.f21047b;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public final long T() {
            int i10 = this.f21048c;
            this.f21048c = i10 + 8;
            byte[] bArr = this.f21047b;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public final <T> T U(o0<T> o0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int iX = X();
            a0(iX);
            int i10 = this.f21049d;
            int i11 = this.f21048c + iX;
            this.f21049d = i11;
            try {
                T tNewInstance = o0Var.newInstance();
                o0Var.g(tNewInstance, this, extensionRegistryLite);
                o0Var.b(tNewInstance);
                if (this.f21048c != i11) {
                    throw InvalidProtocolBufferException.g();
                }
                this.f21049d = i10;
                return tNewInstance;
            } catch (Throwable th2) {
                this.f21049d = i10;
                throw th2;
            }
        }

        public final String V(boolean z10) throws IOException {
            c0(2);
            int iX = X();
            if (iX == 0) {
                return "";
            }
            a0(iX);
            byte[] bArr = this.f21047b;
            if (z10) {
                int i10 = this.f21048c;
                if (!w0.f21158a.g(bArr, i10, i10 + iX)) {
                    throw InvalidProtocolBufferException.c();
                }
            }
            String str = new String(bArr, this.f21048c, iX, Internal.f20943a);
            this.f21048c += iX;
            return str;
        }

        public final void W(List<String> list, boolean z10) throws IOException {
            int i10;
            int i11;
            if (WireFormat.getTagWireType(this.f21050e) != 2) {
                throw InvalidProtocolBufferException.d();
            }
            if (!(list instanceof LazyStringList) || z10) {
                do {
                    list.add(V(z10));
                    if (P()) {
                        return;
                    } else {
                        i10 = this.f21048c;
                    }
                } while (X() == this.f21050e);
                this.f21048c = i10;
                return;
            }
            LazyStringList lazyStringList = (LazyStringList) list;
            do {
                lazyStringList.add(o());
                if (P()) {
                    return;
                } else {
                    i11 = this.f21048c;
                }
            } while (X() == this.f21050e);
            this.f21048c = i11;
        }

        public final int X() throws IOException {
            int i10;
            int i11 = this.f21048c;
            int i12 = this.f21049d;
            if (i12 == i11) {
                throw InvalidProtocolBufferException.i();
            }
            int i13 = i11 + 1;
            byte[] bArr = this.f21047b;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f21048c = i13;
                return b10;
            }
            if (i12 - i13 < 9) {
                return (int) Z();
            }
            int i14 = i11 + 2;
            int i15 = (bArr[i13] << 7) ^ b10;
            if (i15 < 0) {
                i10 = i15 ^ (-128);
            } else {
                int i16 = i11 + 3;
                int i17 = (bArr[i14] << Constants.CVR_B1b41_1110_ONLINE_PIN) ^ i15;
                if (i17 >= 0) {
                    i10 = i17 ^ 16256;
                } else {
                    int i18 = i11 + 4;
                    int i19 = i17 ^ (bArr[i16] << MessageUtils.MESSAGE_21_NAK);
                    if (i19 < 0) {
                        i10 = (-2080896) ^ i19;
                    } else {
                        i16 = i11 + 5;
                        byte b11 = bArr[i18];
                        int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                        if (b11 < 0) {
                            i18 = i11 + 6;
                            if (bArr[i16] < 0) {
                                i16 = i11 + 7;
                                if (bArr[i18] < 0) {
                                    i18 = i11 + 8;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 9;
                                        if (bArr[i18] < 0) {
                                            int i21 = i11 + 10;
                                            if (bArr[i16] < 0) {
                                                throw InvalidProtocolBufferException.e();
                                            }
                                            i14 = i21;
                                            i10 = i20;
                                        }
                                    }
                                }
                            }
                            i10 = i20;
                        }
                        i10 = i20;
                    }
                    i14 = i18;
                }
                i14 = i16;
            }
            this.f21048c = i14;
            return i10;
        }

        public final long Y() throws IOException {
            long j10;
            long j11;
            long j12;
            long j13;
            int i10 = this.f21048c;
            int i11 = this.f21049d;
            if (i11 == i10) {
                throw InvalidProtocolBufferException.i();
            }
            int i12 = i10 + 1;
            byte[] bArr = this.f21047b;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f21048c = i12;
                return b10;
            }
            if (i11 - i12 < 9) {
                return Z();
            }
            int i13 = i10 + 2;
            int i14 = (bArr[i12] << 7) ^ b10;
            if (i14 < 0) {
                j10 = i14 ^ (-128);
            } else {
                int i15 = i10 + 3;
                int i16 = (bArr[i13] << Constants.CVR_B1b41_1110_ONLINE_PIN) ^ i14;
                if (i16 >= 0) {
                    j10 = i16 ^ 16256;
                    i13 = i15;
                } else {
                    int i17 = i10 + 4;
                    int i18 = i16 ^ (bArr[i15] << MessageUtils.MESSAGE_21_NAK);
                    if (i18 < 0) {
                        j13 = (-2080896) ^ i18;
                    } else {
                        long j14 = i18;
                        i13 = i10 + 5;
                        long j15 = j14 ^ (((long) bArr[i17]) << 28);
                        if (j15 >= 0) {
                            j12 = 266354560;
                        } else {
                            i17 = i10 + 6;
                            long j16 = j15 ^ (((long) bArr[i13]) << 35);
                            if (j16 < 0) {
                                j11 = -34093383808L;
                            } else {
                                i13 = i10 + 7;
                                j15 = j16 ^ (((long) bArr[i17]) << 42);
                                if (j15 >= 0) {
                                    j12 = 4363953127296L;
                                } else {
                                    i17 = i10 + 8;
                                    j16 = j15 ^ (((long) bArr[i13]) << 49);
                                    if (j16 < 0) {
                                        j11 = -558586000294016L;
                                    } else {
                                        i13 = i10 + 9;
                                        long j17 = (j16 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                        if (j17 < 0) {
                                            int i19 = i10 + 10;
                                            if (bArr[i13] < 0) {
                                                throw InvalidProtocolBufferException.e();
                                            }
                                            i13 = i19;
                                        }
                                        j10 = j17;
                                    }
                                }
                            }
                            j13 = j11 ^ j16;
                        }
                        j10 = j12 ^ j15;
                    }
                    i13 = i17;
                    j10 = j13;
                }
            }
            this.f21048c = i13;
            return j10;
        }

        public final long Z() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                int i11 = this.f21048c;
                if (i11 == this.f21049d) {
                    throw InvalidProtocolBufferException.i();
                }
                this.f21048c = i11 + 1;
                byte b10 = this.f21047b[i11];
                j10 |= ((long) (b10 & 127)) << i10;
                if ((b10 & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final <T> T a(o0<T> o0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            c0(2);
            return (T) U(o0Var, extensionRegistryLite);
        }

        public final void a0(int i10) throws IOException {
            if (i10 < 0 || i10 > this.f21049d - this.f21048c) {
                throw InvalidProtocolBufferException.i();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final long b() throws IOException {
            c0(1);
            a0(8);
            return T();
        }

        public final void b0(int i10) throws IOException {
            if (this.f21048c != i10) {
                throw InvalidProtocolBufferException.i();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final void c(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof p)) {
                int tagWireType = WireFormat.getTagWireType(this.f21050e);
                if (tagWireType == 2) {
                    int iX = X();
                    d0(iX);
                    int i12 = this.f21048c + iX;
                    while (this.f21048c < i12) {
                        list.add(Integer.valueOf(S()));
                    }
                    return;
                }
                if (tagWireType != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    list.add(Integer.valueOf(K()));
                    if (P()) {
                        return;
                    } else {
                        i10 = this.f21048c;
                    }
                } while (X() == this.f21050e);
                this.f21048c = i10;
                return;
            }
            p pVar = (p) list;
            int tagWireType2 = WireFormat.getTagWireType(this.f21050e);
            if (tagWireType2 == 2) {
                int iX2 = X();
                d0(iX2);
                int i13 = this.f21048c + iX2;
                while (this.f21048c < i13) {
                    pVar.addInt(S());
                }
                return;
            }
            if (tagWireType2 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                pVar.addInt(K());
                if (P()) {
                    return;
                } else {
                    i11 = this.f21048c;
                }
            } while (X() == this.f21050e);
            this.f21048c = i11;
        }

        public final void c0(int i10) throws IOException {
            if (WireFormat.getTagWireType(this.f21050e) != i10) {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final void d(List<Long> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof t)) {
                int tagWireType = WireFormat.getTagWireType(this.f21050e);
                if (tagWireType != 0) {
                    if (tagWireType != 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int iX = this.f21048c + X();
                    while (this.f21048c < iX) {
                        list.add(Long.valueOf(CodedInputStream.decodeZigZag64(Y())));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(D()));
                    if (P()) {
                        return;
                    } else {
                        i10 = this.f21048c;
                    }
                } while (X() == this.f21050e);
                this.f21048c = i10;
                return;
            }
            t tVar = (t) list;
            int tagWireType2 = WireFormat.getTagWireType(this.f21050e);
            if (tagWireType2 != 0) {
                if (tagWireType2 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iX2 = this.f21048c + X();
                while (this.f21048c < iX2) {
                    tVar.addLong(CodedInputStream.decodeZigZag64(Y()));
                }
                return;
            }
            do {
                tVar.addLong(D());
                if (P()) {
                    return;
                } else {
                    i11 = this.f21048c;
                }
            } while (X() == this.f21050e);
            this.f21048c = i11;
        }

        public final void d0(int i10) throws IOException {
            a0(i10);
            if ((i10 & 3) != 0) {
                throw InvalidProtocolBufferException.g();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final boolean e() throws IOException {
            c0(0);
            return X() != 0;
        }

        public final void e0(int i10) throws IOException {
            a0(i10);
            if ((i10 & 7) != 0) {
                throw InvalidProtocolBufferException.g();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final long f() throws IOException {
            c0(1);
            a0(8);
            return T();
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final void g(List<Long> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof t)) {
                int tagWireType = WireFormat.getTagWireType(this.f21050e);
                if (tagWireType == 0) {
                    do {
                        list.add(Long.valueOf(u()));
                        if (P()) {
                            return;
                        } else {
                            i10 = this.f21048c;
                        }
                    } while (X() == this.f21050e);
                    this.f21048c = i10;
                    return;
                }
                if (tagWireType != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iX = this.f21048c + X();
                while (this.f21048c < iX) {
                    list.add(Long.valueOf(Y()));
                }
                b0(iX);
                return;
            }
            t tVar = (t) list;
            int tagWireType2 = WireFormat.getTagWireType(this.f21050e);
            if (tagWireType2 == 0) {
                do {
                    tVar.addLong(u());
                    if (P()) {
                        return;
                    } else {
                        i11 = this.f21048c;
                    }
                } while (X() == this.f21050e);
                this.f21048c = i11;
                return;
            }
            if (tagWireType2 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iX2 = this.f21048c + X();
            while (this.f21048c < iX2) {
                tVar.addLong(Y());
            }
            b0(iX2);
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final int getTag() {
            return this.f21050e;
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final int h() throws IOException {
            c0(0);
            return X();
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final void i(List<Long> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof t)) {
                int tagWireType = WireFormat.getTagWireType(this.f21050e);
                if (tagWireType == 0) {
                    do {
                        list.add(Long.valueOf(N()));
                        if (P()) {
                            return;
                        } else {
                            i10 = this.f21048c;
                        }
                    } while (X() == this.f21050e);
                    this.f21048c = i10;
                    return;
                }
                if (tagWireType != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iX = this.f21048c + X();
                while (this.f21048c < iX) {
                    list.add(Long.valueOf(Y()));
                }
                b0(iX);
                return;
            }
            t tVar = (t) list;
            int tagWireType2 = WireFormat.getTagWireType(this.f21050e);
            if (tagWireType2 == 0) {
                do {
                    tVar.addLong(N());
                    if (P()) {
                        return;
                    } else {
                        i11 = this.f21048c;
                    }
                } while (X() == this.f21050e);
                this.f21048c = i11;
                return;
            }
            if (tagWireType2 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iX2 = this.f21048c + X();
            while (this.f21048c < iX2) {
                tVar.addLong(Y());
            }
            b0(iX2);
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final void j(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof p)) {
                int tagWireType = WireFormat.getTagWireType(this.f21050e);
                if (tagWireType != 0) {
                    if (tagWireType != 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int iX = this.f21048c + X();
                    while (this.f21048c < iX) {
                        list.add(Integer.valueOf(X()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(k()));
                    if (P()) {
                        return;
                    } else {
                        i10 = this.f21048c;
                    }
                } while (X() == this.f21050e);
                this.f21048c = i10;
                return;
            }
            p pVar = (p) list;
            int tagWireType2 = WireFormat.getTagWireType(this.f21050e);
            if (tagWireType2 != 0) {
                if (tagWireType2 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iX2 = this.f21048c + X();
                while (this.f21048c < iX2) {
                    pVar.addInt(X());
                }
                return;
            }
            do {
                pVar.addInt(k());
                if (P()) {
                    return;
                } else {
                    i11 = this.f21048c;
                }
            } while (X() == this.f21050e);
            this.f21048c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final int k() throws IOException {
            c0(0);
            return X();
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final int l() throws IOException {
            c0(0);
            return CodedInputStream.decodeZigZag32(X());
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final void m(List<Boolean> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof f)) {
                int tagWireType = WireFormat.getTagWireType(this.f21050e);
                if (tagWireType != 0) {
                    if (tagWireType != 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int iX = this.f21048c + X();
                    while (this.f21048c < iX) {
                        list.add(Boolean.valueOf(X() != 0));
                    }
                    b0(iX);
                    return;
                }
                do {
                    list.add(Boolean.valueOf(e()));
                    if (P()) {
                        return;
                    } else {
                        i10 = this.f21048c;
                    }
                } while (X() == this.f21050e);
                this.f21048c = i10;
                return;
            }
            f fVar = (f) list;
            int tagWireType2 = WireFormat.getTagWireType(this.f21050e);
            if (tagWireType2 != 0) {
                if (tagWireType2 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iX2 = this.f21048c + X();
                while (this.f21048c < iX2) {
                    fVar.addBoolean(X() != 0);
                }
                b0(iX2);
                return;
            }
            do {
                fVar.addBoolean(e());
                if (P()) {
                    return;
                } else {
                    i11 = this.f21048c;
                }
            } while (X() == this.f21050e);
            this.f21048c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final void n(List<String> list) throws IOException {
            W(list, true);
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final ByteString o() throws IOException {
            ByteString byteStringCopyFrom;
            c0(2);
            int iX = X();
            if (iX == 0) {
                return ByteString.EMPTY;
            }
            a0(iX);
            boolean z10 = this.f21046a;
            byte[] bArr = this.f21047b;
            if (z10) {
                int i10 = this.f21048c;
                ByteString byteString = ByteString.EMPTY;
                byteStringCopyFrom = new ByteString.e(bArr, i10, iX);
            } else {
                byteStringCopyFrom = ByteString.copyFrom(bArr, this.f21048c, iX);
            }
            this.f21048c += iX;
            return byteStringCopyFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final int p() throws IOException {
            c0(0);
            return X();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.m0
        public final <T> void q(List<T> list, o0<T> o0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int i10;
            if (WireFormat.getTagWireType(this.f21050e) != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int i11 = this.f21050e;
            do {
                list.add(U(o0Var, extensionRegistryLite));
                if (P()) {
                    return;
                } else {
                    i10 = this.f21048c;
                }
            } while (X() == i11);
            this.f21048c = i10;
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final void r(List<Long> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof t)) {
                int tagWireType = WireFormat.getTagWireType(this.f21050e);
                if (tagWireType == 1) {
                    do {
                        list.add(Long.valueOf(b()));
                        if (P()) {
                            return;
                        } else {
                            i10 = this.f21048c;
                        }
                    } while (X() == this.f21050e);
                    this.f21048c = i10;
                    return;
                }
                if (tagWireType != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iX = X();
                e0(iX);
                int i12 = this.f21048c + iX;
                while (this.f21048c < i12) {
                    list.add(Long.valueOf(T()));
                }
                return;
            }
            t tVar = (t) list;
            int tagWireType2 = WireFormat.getTagWireType(this.f21050e);
            if (tagWireType2 == 1) {
                do {
                    tVar.addLong(b());
                    if (P()) {
                        return;
                    } else {
                        i11 = this.f21048c;
                    }
                } while (X() == this.f21050e);
                this.f21048c = i11;
                return;
            }
            if (tagWireType2 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iX2 = X();
            e0(iX2);
            int i13 = this.f21048c + iX2;
            while (this.f21048c < i13) {
                tVar.addLong(T());
            }
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final double readDouble() throws IOException {
            c0(1);
            a0(8);
            return Double.longBitsToDouble(T());
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final float readFloat() throws IOException {
            c0(5);
            a0(4);
            return Float.intBitsToFloat(S());
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final <T> T s(o0<T> o0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            c0(3);
            return (T) R(o0Var, extensionRegistryLite);
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final void t(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof p)) {
                int tagWireType = WireFormat.getTagWireType(this.f21050e);
                if (tagWireType != 0) {
                    if (tagWireType != 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int iX = this.f21048c + X();
                    while (this.f21048c < iX) {
                        list.add(Integer.valueOf(CodedInputStream.decodeZigZag32(X())));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(l()));
                    if (P()) {
                        return;
                    } else {
                        i10 = this.f21048c;
                    }
                } while (X() == this.f21050e);
                this.f21048c = i10;
                return;
            }
            p pVar = (p) list;
            int tagWireType2 = WireFormat.getTagWireType(this.f21050e);
            if (tagWireType2 != 0) {
                if (tagWireType2 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iX2 = this.f21048c + X();
                while (this.f21048c < iX2) {
                    pVar.addInt(CodedInputStream.decodeZigZag32(X()));
                }
                return;
            }
            do {
                pVar.addInt(l());
                if (P()) {
                    return;
                } else {
                    i11 = this.f21048c;
                }
            } while (X() == this.f21050e);
            this.f21048c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final long u() throws IOException {
            c0(0);
            return Y();
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final <T> T v(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            c0(2);
            return (T) U(j0.f21070c.a(cls), extensionRegistryLite);
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final void w(List<Integer> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof p)) {
                int tagWireType = WireFormat.getTagWireType(this.f21050e);
                if (tagWireType != 0) {
                    if (tagWireType != 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int iX = this.f21048c + X();
                    while (this.f21048c < iX) {
                        list.add(Integer.valueOf(X()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(h()));
                    if (P()) {
                        return;
                    } else {
                        i10 = this.f21048c;
                    }
                } while (X() == this.f21050e);
                this.f21048c = i10;
                return;
            }
            p pVar = (p) list;
            int tagWireType2 = WireFormat.getTagWireType(this.f21050e);
            if (tagWireType2 != 0) {
                if (tagWireType2 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iX2 = this.f21048c + X();
                while (this.f21048c < iX2) {
                    pVar.addInt(X());
                }
                return;
            }
            do {
                pVar.addInt(h());
                if (P()) {
                    return;
                } else {
                    i11 = this.f21048c;
                }
            } while (X() == this.f21050e);
            this.f21048c = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final int x() throws IOException {
            c0(5);
            a0(4);
            return S();
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final <T> T y(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            c0(3);
            return (T) R(j0.f21070c.a(cls), extensionRegistryLite);
        }

        @Override // androidx.datastore.preferences.protobuf.m0
        public final void z(List<Long> list) throws IOException {
            int i10;
            int i11;
            if (!(list instanceof t)) {
                int tagWireType = WireFormat.getTagWireType(this.f21050e);
                if (tagWireType == 1) {
                    do {
                        list.add(Long.valueOf(f()));
                        if (P()) {
                            return;
                        } else {
                            i10 = this.f21048c;
                        }
                    } while (X() == this.f21050e);
                    this.f21048c = i10;
                    return;
                }
                if (tagWireType != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iX = X();
                e0(iX);
                int i12 = this.f21048c + iX;
                while (this.f21048c < i12) {
                    list.add(Long.valueOf(T()));
                }
                return;
            }
            t tVar = (t) list;
            int tagWireType2 = WireFormat.getTagWireType(this.f21050e);
            if (tagWireType2 == 1) {
                do {
                    tVar.addLong(f());
                    if (P()) {
                        return;
                    } else {
                        i11 = this.f21048c;
                    }
                } while (X() == this.f21050e);
                this.f21048c = i11;
                return;
            }
            if (tagWireType2 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iX2 = X();
            e0(iX2);
            int i13 = this.f21048c + iX2;
            while (this.f21048c < i13) {
                tVar.addLong(T());
            }
        }
    }
}
