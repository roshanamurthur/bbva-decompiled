package androidx.datastore.preferences.protobuf;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.io.IOException;

/* JADX INFO: compiled from: ArrayDecoders.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: compiled from: ArrayDecoders.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21036a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f21036a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21036a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21036a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21036a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21036a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21036a[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21036a[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21036a[WireFormat.FieldType.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21036a[WireFormat.FieldType.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21036a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21036a[WireFormat.FieldType.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21036a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21036a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21036a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f21036a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f21036a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f21036a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f21036a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: compiled from: ArrayDecoders.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f21038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f21039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ExtensionRegistryLite f21040d;

        public b(ExtensionRegistryLite extensionRegistryLite) {
            extensionRegistryLite.getClass();
            this.f21040d = extensionRegistryLite;
        }
    }

    public static int A(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) {
        p pVar = (p) protobufList;
        int I = I(bArr, i11, bVar);
        pVar.addInt(CodedInputStream.decodeZigZag32(bVar.f21037a));
        while (I < i12) {
            int I2 = I(bArr, I, bVar);
            if (i10 != bVar.f21037a) {
                break;
            }
            I = I(bArr, I2, bVar);
            pVar.addInt(CodedInputStream.decodeZigZag32(bVar.f21037a));
        }
        return I;
    }

    public static int B(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) {
        t tVar = (t) protobufList;
        int iK = K(bArr, i11, bVar);
        tVar.addLong(CodedInputStream.decodeZigZag64(bVar.f21038b));
        while (iK < i12) {
            int I = I(bArr, iK, bVar);
            if (i10 != bVar.f21037a) {
                break;
            }
            iK = K(bArr, I, bVar);
            tVar.addLong(CodedInputStream.decodeZigZag64(bVar.f21038b));
        }
        return iK;
    }

    public static int C(byte[] bArr, int i10, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f21037a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i11 == 0) {
            bVar.f21039c = "";
            return I;
        }
        bVar.f21039c = new String(bArr, I, i11, Internal.f20943a);
        return I + i11;
    }

    public static int D(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i11, bVar);
        int i13 = bVar.f21037a;
        if (i13 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i13 == 0) {
            protobufList.add("");
        } else {
            protobufList.add(new String(bArr, I, i13, Internal.f20943a));
            I += i13;
        }
        while (I < i12) {
            int I2 = I(bArr, I, bVar);
            if (i10 != bVar.f21037a) {
                break;
            }
            I = I(bArr, I2, bVar);
            int i14 = bVar.f21037a;
            if (i14 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            if (i14 == 0) {
                protobufList.add("");
            } else {
                protobufList.add(new String(bArr, I, i14, Internal.f20943a));
                I += i14;
            }
        }
        return I;
    }

    public static int E(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i11, bVar);
        int i13 = bVar.f21037a;
        if (i13 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i13 == 0) {
            protobufList.add("");
        } else {
            int i14 = I + i13;
            if (!w0.f21158a.g(bArr, I, i14)) {
                throw InvalidProtocolBufferException.c();
            }
            protobufList.add(new String(bArr, I, i13, Internal.f20943a));
            I = i14;
        }
        while (I < i12) {
            int I2 = I(bArr, I, bVar);
            if (i10 != bVar.f21037a) {
                break;
            }
            I = I(bArr, I2, bVar);
            int i15 = bVar.f21037a;
            if (i15 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            if (i15 == 0) {
                protobufList.add("");
            } else {
                int i16 = I + i15;
                if (!w0.f21158a.g(bArr, I, i16)) {
                    throw InvalidProtocolBufferException.c();
                }
                protobufList.add(new String(bArr, I, i15, Internal.f20943a));
                I = i16;
            }
        }
        return I;
    }

    public static int F(byte[] bArr, int i10, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f21037a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i11 == 0) {
            bVar.f21039c = "";
            return I;
        }
        bVar.f21039c = w0.f21158a.a(I, i11, bArr);
        return I + i11;
    }

    public static int G(int i10, byte[] bArr, int i11, int i12, UnknownFieldSetLite unknownFieldSetLite, b bVar) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(i10) == 0) {
            throw InvalidProtocolBufferException.b();
        }
        int tagWireType = WireFormat.getTagWireType(i10);
        if (tagWireType == 0) {
            int iK = K(bArr, i11, bVar);
            unknownFieldSetLite.c(i10, Long.valueOf(bVar.f21038b));
            return iK;
        }
        if (tagWireType == 1) {
            unknownFieldSetLite.c(i10, Long.valueOf(j(i11, bArr)));
            return i11 + 8;
        }
        if (tagWireType == 2) {
            int I = I(bArr, i11, bVar);
            int i13 = bVar.f21037a;
            if (i13 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            if (i13 > bArr.length - I) {
                throw InvalidProtocolBufferException.i();
            }
            if (i13 == 0) {
                unknownFieldSetLite.c(i10, ByteString.EMPTY);
            } else {
                unknownFieldSetLite.c(i10, ByteString.copyFrom(bArr, I, i13));
            }
            return I + i13;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.b();
            }
            unknownFieldSetLite.c(i10, Integer.valueOf(h(i11, bArr)));
            return i11 + 4;
        }
        UnknownFieldSetLite unknownFieldSetLite2 = new UnknownFieldSetLite();
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            int I2 = I(bArr, i11, bVar);
            int i16 = bVar.f21037a;
            if (i16 == i14) {
                i15 = i16;
                i11 = I2;
                break;
            }
            i15 = i16;
            i11 = G(i16, bArr, I2, i12, unknownFieldSetLite2, bVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw InvalidProtocolBufferException.g();
        }
        unknownFieldSetLite.c(i10, unknownFieldSetLite2);
        return i11;
    }

    public static int H(int i10, byte[] bArr, int i11, b bVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            bVar.f21037a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            bVar.f21037a = i14 | (b11 << Constants.CVR_B1b41_1110_ONLINE_PIN);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            bVar.f21037a = i16 | (b12 << MessageUtils.MESSAGE_21_NAK);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            bVar.f21037a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                bVar.f21037a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int I(byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return H(b10, bArr, i11, bVar);
        }
        bVar.f21037a = b10;
        return i11;
    }

    public static int J(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) {
        p pVar = (p) protobufList;
        int I = I(bArr, i11, bVar);
        pVar.addInt(bVar.f21037a);
        while (I < i12) {
            int I2 = I(bArr, I, bVar);
            if (i10 != bVar.f21037a) {
                break;
            }
            I = I(bArr, I2, bVar);
            pVar.addInt(bVar.f21037a);
        }
        return I;
    }

    public static int K(byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            bVar.f21038b = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & 127)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & 127)) << i13;
            b10 = b11;
            i12 = i14;
        }
        bVar.f21038b = j11;
        return i12;
    }

    public static int L(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) {
        t tVar = (t) protobufList;
        int iK = K(bArr, i11, bVar);
        tVar.addLong(bVar.f21038b);
        while (iK < i12) {
            int I = I(bArr, iK, bVar);
            if (i10 != bVar.f21037a) {
                break;
            }
            iK = K(bArr, I, bVar);
            tVar.addLong(bVar.f21038b);
        }
        return iK;
    }

    public static int M(int i10, byte[] bArr, int i11, int i12, b bVar) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(i10) == 0) {
            throw InvalidProtocolBufferException.b();
        }
        int tagWireType = WireFormat.getTagWireType(i10);
        if (tagWireType == 0) {
            return K(bArr, i11, bVar);
        }
        if (tagWireType == 1) {
            return i11 + 8;
        }
        if (tagWireType == 2) {
            return I(bArr, i11, bVar) + bVar.f21037a;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                return i11 + 4;
            }
            throw InvalidProtocolBufferException.b();
        }
        int i13 = (i10 & (-8)) | 4;
        int i14 = 0;
        while (i11 < i12) {
            i11 = I(bArr, i11, bVar);
            i14 = bVar.f21037a;
            if (i14 == i13) {
                break;
            }
            i11 = M(i14, bArr, i11, i12, bVar);
        }
        if (i11 > i12 || i14 != i13) {
            throw InvalidProtocolBufferException.g();
        }
        return i11;
    }

    public static int a(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) {
        f fVar = (f) protobufList;
        int iK = K(bArr, i11, bVar);
        fVar.addBoolean(bVar.f21038b != 0);
        while (iK < i12) {
            int I = I(bArr, iK, bVar);
            if (i10 != bVar.f21037a) {
                break;
            }
            iK = K(bArr, I, bVar);
            fVar.addBoolean(bVar.f21038b != 0);
        }
        return iK;
    }

    public static int b(byte[] bArr, int i10, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f21037a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i11 > bArr.length - I) {
            throw InvalidProtocolBufferException.i();
        }
        if (i11 == 0) {
            bVar.f21039c = ByteString.EMPTY;
            return I;
        }
        bVar.f21039c = ByteString.copyFrom(bArr, I, i11);
        return I + i11;
    }

    public static int c(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i11, bVar);
        int i13 = bVar.f21037a;
        if (i13 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i13 > bArr.length - I) {
            throw InvalidProtocolBufferException.i();
        }
        if (i13 == 0) {
            protobufList.add(ByteString.EMPTY);
        } else {
            protobufList.add(ByteString.copyFrom(bArr, I, i13));
            I += i13;
        }
        while (I < i12) {
            int I2 = I(bArr, I, bVar);
            if (i10 != bVar.f21037a) {
                break;
            }
            I = I(bArr, I2, bVar);
            int i14 = bVar.f21037a;
            if (i14 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            if (i14 > bArr.length - I) {
                throw InvalidProtocolBufferException.i();
            }
            if (i14 == 0) {
                protobufList.add(ByteString.EMPTY);
            } else {
                protobufList.add(ByteString.copyFrom(bArr, I, i14));
                I += i14;
            }
        }
        return I;
    }

    public static double d(int i10, byte[] bArr) {
        return Double.longBitsToDouble(j(i10, bArr));
    }

    public static int e(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) {
        i iVar = (i) protobufList;
        iVar.addDouble(Double.longBitsToDouble(j(i11, bArr)));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f21037a) {
                break;
            }
            iVar.addDouble(Double.longBitsToDouble(j(I, bArr)));
            i13 = I + 8;
        }
        return i13;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int f(int i10, byte[] bArr, int i11, int i12, GeneratedMessageLite.ExtendableMessage<?, ?> extendableMessage, GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension, t0<UnknownFieldSetLite, UnknownFieldSetLite> t0Var, b bVar) throws IOException {
        Object objF;
        FieldSet<GeneratedMessageLite.b> fieldSet = extendableMessage.extensions;
        int i13 = i10 >>> 3;
        GeneratedMessageLite.b bVar2 = generatedExtension.f20931d;
        Object objValueOf = null;
        if (bVar2.f20939s0 && bVar2.f20940t0) {
            switch (a.f21036a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    i iVar = new i();
                    int iS = s(bArr, i11, iVar, bVar);
                    fieldSet.q(bVar2, iVar);
                    return iS;
                case 2:
                    n nVar = new n();
                    int iV = v(bArr, i11, nVar, bVar);
                    fieldSet.q(bVar2, nVar);
                    return iV;
                case 3:
                case 4:
                    t tVar = new t();
                    int iZ = z(bArr, i11, tVar, bVar);
                    fieldSet.q(bVar2, tVar);
                    return iZ;
                case 5:
                case 6:
                    p pVar = new p();
                    int iY = y(bArr, i11, pVar, bVar);
                    fieldSet.q(bVar2, pVar);
                    return iY;
                case 7:
                case 8:
                    t tVar2 = new t();
                    int iU = u(bArr, i11, tVar2, bVar);
                    fieldSet.q(bVar2, tVar2);
                    return iU;
                case 9:
                case 10:
                    p pVar2 = new p();
                    int iT = t(bArr, i11, pVar2, bVar);
                    fieldSet.q(bVar2, pVar2);
                    return iT;
                case 11:
                    f fVar = new f();
                    int iR = r(bArr, i11, fVar, bVar);
                    fieldSet.q(bVar2, fVar);
                    return iR;
                case 12:
                    p pVar3 = new p();
                    int iW = w(bArr, i11, pVar3, bVar);
                    fieldSet.q(bVar2, pVar3);
                    return iW;
                case 13:
                    t tVar3 = new t();
                    int iX = x(bArr, i11, tVar3, bVar);
                    fieldSet.q(bVar2, tVar3);
                    return iX;
                case 14:
                    p pVar4 = new p();
                    int iY2 = y(bArr, i11, pVar4, bVar);
                    UnknownFieldSetLite unknownFieldSetLite = extendableMessage.unknownFields;
                    UnknownFieldSetLite unknownFieldSetLite2 = (UnknownFieldSetLite) p0.z(i13, pVar4, bVar2.f20936p0, unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance() ? unknownFieldSetLite : null, t0Var);
                    if (unknownFieldSetLite2 != null) {
                        extendableMessage.unknownFields = unknownFieldSetLite2;
                    }
                    fieldSet.q(bVar2, pVar4);
                    return iY2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + bVar2.f20938r0);
            }
        }
        if (generatedExtension.getLiteType() != WireFormat.FieldType.ENUM) {
            switch (a.f21036a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(Double.longBitsToDouble(j(i11, bArr)));
                    i11 += 8;
                    break;
                case 2:
                    objValueOf = Float.valueOf(Float.intBitsToFloat(h(i11, bArr)));
                    i11 += 4;
                    break;
                case 3:
                case 4:
                    i11 = K(bArr, i11, bVar);
                    objValueOf = Long.valueOf(bVar.f21038b);
                    break;
                case 5:
                case 6:
                    i11 = I(bArr, i11, bVar);
                    objValueOf = Integer.valueOf(bVar.f21037a);
                    break;
                case 7:
                case 8:
                    objValueOf = Long.valueOf(j(i11, bArr));
                    i11 += 8;
                    break;
                case 9:
                case 10:
                    objValueOf = Integer.valueOf(h(i11, bArr));
                    i11 += 4;
                    break;
                case 11:
                    i11 = K(bArr, i11, bVar);
                    objValueOf = Boolean.valueOf(bVar.f21038b != 0);
                    break;
                case 12:
                    i11 = I(bArr, i11, bVar);
                    objValueOf = Integer.valueOf(CodedInputStream.decodeZigZag32(bVar.f21037a));
                    break;
                case 13:
                    i11 = K(bArr, i11, bVar);
                    objValueOf = Long.valueOf(CodedInputStream.decodeZigZag64(bVar.f21038b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i11 = b(bArr, i11, bVar);
                    objValueOf = bVar.f21039c;
                    break;
                case 16:
                    i11 = C(bArr, i11, bVar);
                    objValueOf = bVar.f21039c;
                    break;
                case 17:
                    i11 = n(j0.f21070c.a(generatedExtension.getMessageDefaultInstance().getClass()), bArr, i11, i12, (i13 << 3) | 4, bVar);
                    objValueOf = bVar.f21039c;
                    break;
                case 18:
                    i11 = p(j0.f21070c.a(generatedExtension.getMessageDefaultInstance().getClass()), bArr, i11, i12, bVar);
                    objValueOf = bVar.f21039c;
                    break;
            }
        } else {
            i11 = I(bArr, i11, bVar);
            if (bVar2.f20936p0.findValueByNumber(bVar.f21037a) == null) {
                UnknownFieldSetLite unknownFieldSetLite3 = extendableMessage.unknownFields;
                if (unknownFieldSetLite3 == UnknownFieldSetLite.getDefaultInstance()) {
                    unknownFieldSetLite3 = new UnknownFieldSetLite();
                    extendableMessage.unknownFields = unknownFieldSetLite3;
                }
                p0.D(i13, bVar.f21037a, unknownFieldSetLite3, t0Var);
                return i11;
            }
            objValueOf = Integer.valueOf(bVar.f21037a);
        }
        if (generatedExtension.isRepeated()) {
            fieldSet.a(bVar2, objValueOf);
        } else {
            int i14 = a.f21036a[generatedExtension.getLiteType().ordinal()];
            if ((i14 == 17 || i14 == 18) && (objF = fieldSet.f(bVar2)) != null) {
                objValueOf = Internal.a(objF, objValueOf);
            }
            fieldSet.q(bVar2, objValueOf);
        }
        return i11;
    }

    public static int g(int i10, byte[] bArr, int i11, int i12, Object obj, MessageLite messageLite, t0<UnknownFieldSetLite, UnknownFieldSetLite> t0Var, b bVar) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtensionFindLiteExtensionByNumber = bVar.f21040d.findLiteExtensionByNumber(messageLite, i10 >>> 3);
        if (generatedExtensionFindLiteExtensionByNumber == null) {
            return G(i10, bArr, i11, i12, b0.p(obj), bVar);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        extendableMessage.k();
        return f(i10, bArr, i11, i12, extendableMessage, generatedExtensionFindLiteExtensionByNumber, t0Var, bVar);
    }

    public static int h(int i10, byte[] bArr) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int i(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) {
        p pVar = (p) protobufList;
        pVar.addInt(h(i11, bArr));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f21037a) {
                break;
            }
            pVar.addInt(h(I, bArr));
            i13 = I + 4;
        }
        return i13;
    }

    public static long j(int i10, byte[] bArr) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public static int k(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) {
        t tVar = (t) protobufList;
        tVar.addLong(j(i11, bArr));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f21037a) {
                break;
            }
            tVar.addLong(j(I, bArr));
            i13 = I + 8;
        }
        return i13;
    }

    public static float l(int i10, byte[] bArr) {
        return Float.intBitsToFloat(h(i10, bArr));
    }

    public static int m(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) {
        n nVar = (n) protobufList;
        nVar.addFloat(Float.intBitsToFloat(h(i11, bArr)));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f21037a) {
                break;
            }
            nVar.addFloat(Float.intBitsToFloat(h(I, bArr)));
            i13 = I + 4;
        }
        return i13;
    }

    public static int n(o0 o0Var, byte[] bArr, int i10, int i11, int i12, b bVar) throws IOException {
        b0 b0Var = (b0) o0Var;
        Object objNewInstance = b0Var.newInstance();
        int iG = b0Var.G(objNewInstance, bArr, i10, i11, i12, bVar);
        b0Var.b(objNewInstance);
        bVar.f21039c = objNewInstance;
        return iG;
    }

    public static int o(o0 o0Var, int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        int i13 = (i10 & (-8)) | 4;
        int iN = n(o0Var, bArr, i11, i12, i13, bVar);
        protobufList.add(bVar.f21039c);
        while (iN < i12) {
            int I = I(bArr, iN, bVar);
            if (i10 != bVar.f21037a) {
                break;
            }
            iN = n(o0Var, bArr, I, i12, i13, bVar);
            protobufList.add(bVar.f21039c);
        }
        return iN;
    }

    public static int p(o0 o0Var, byte[] bArr, int i10, int i11, b bVar) throws IOException {
        int iH = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iH = H(i12, bArr, iH, bVar);
            i12 = bVar.f21037a;
        }
        int i13 = iH;
        if (i12 < 0 || i12 > i11 - i13) {
            throw InvalidProtocolBufferException.i();
        }
        Object objNewInstance = o0Var.newInstance();
        int i14 = i12 + i13;
        o0Var.i(objNewInstance, bArr, i13, i14, bVar);
        o0Var.b(objNewInstance);
        bVar.f21039c = objNewInstance;
        return i14;
    }

    public static int q(o0<?> o0Var, int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        int iP = p(o0Var, bArr, i11, i12, bVar);
        protobufList.add(bVar.f21039c);
        while (iP < i12) {
            int I = I(bArr, iP, bVar);
            if (i10 != bVar.f21037a) {
                break;
            }
            iP = p(o0Var, bArr, I, i12, bVar);
            protobufList.add(bVar.f21039c);
        }
        return iP;
    }

    public static int r(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        f fVar = (f) protobufList;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f21037a + I;
        while (I < i11) {
            I = K(bArr, I, bVar);
            fVar.addBoolean(bVar.f21038b != 0);
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.i();
    }

    public static int s(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        i iVar = (i) protobufList;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f21037a + I;
        while (I < i11) {
            iVar.addDouble(Double.longBitsToDouble(j(I, bArr)));
            I += 8;
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.i();
    }

    public static int t(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        p pVar = (p) protobufList;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f21037a + I;
        while (I < i11) {
            pVar.addInt(h(I, bArr));
            I += 4;
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.i();
    }

    public static int u(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        t tVar = (t) protobufList;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f21037a + I;
        while (I < i11) {
            tVar.addLong(j(I, bArr));
            I += 8;
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.i();
    }

    public static int v(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        n nVar = (n) protobufList;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f21037a + I;
        while (I < i11) {
            nVar.addFloat(Float.intBitsToFloat(h(I, bArr)));
            I += 4;
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.i();
    }

    public static int w(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        p pVar = (p) protobufList;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f21037a + I;
        while (I < i11) {
            I = I(bArr, I, bVar);
            pVar.addInt(CodedInputStream.decodeZigZag32(bVar.f21037a));
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.i();
    }

    public static int x(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        t tVar = (t) protobufList;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f21037a + I;
        while (I < i11) {
            I = K(bArr, I, bVar);
            tVar.addLong(CodedInputStream.decodeZigZag64(bVar.f21038b));
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.i();
    }

    public static int y(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        p pVar = (p) protobufList;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f21037a + I;
        while (I < i11) {
            I = I(bArr, I, bVar);
            pVar.addInt(bVar.f21037a);
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.i();
    }

    public static int z(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        t tVar = (t) protobufList;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f21037a + I;
        while (I < i11) {
            I = K(bArr, I, bVar);
            tVar.addLong(bVar.f21038b);
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.i();
    }
}
