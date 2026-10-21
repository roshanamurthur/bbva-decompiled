package com.google.crypto.tink.shaded.protobuf;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.io.IOException;

/* JADX INFO: compiled from: ArrayDecoders.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: compiled from: ArrayDecoders.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47181a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f47181a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47181a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47181a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47181a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47181a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47181a[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f47181a[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f47181a[WireFormat.FieldType.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f47181a[WireFormat.FieldType.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f47181a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f47181a[WireFormat.FieldType.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f47181a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f47181a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f47181a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f47181a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f47181a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f47181a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f47181a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: compiled from: ArrayDecoders.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f47183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f47184c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ExtensionRegistryLite f47185d;

        public b(ExtensionRegistryLite extensionRegistryLite) {
            extensionRegistryLite.getClass();
            this.f47185d = extensionRegistryLite;
        }
    }

    public static int A(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) {
        n nVar = (n) protobufList;
        int I = I(bArr, i11, bVar);
        nVar.addInt(CodedInputStream.decodeZigZag32(bVar.f47182a));
        while (I < i12) {
            int I2 = I(bArr, I, bVar);
            if (i10 != bVar.f47182a) {
                break;
            }
            I = I(bArr, I2, bVar);
            nVar.addInt(CodedInputStream.decodeZigZag32(bVar.f47182a));
        }
        return I;
    }

    public static int B(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) {
        v vVar = (v) protobufList;
        int iK = K(bArr, i11, bVar);
        vVar.addLong(CodedInputStream.decodeZigZag64(bVar.f47183b));
        while (iK < i12) {
            int I = I(bArr, iK, bVar);
            if (i10 != bVar.f47182a) {
                break;
            }
            iK = K(bArr, I, bVar);
            vVar.addLong(CodedInputStream.decodeZigZag64(bVar.f47183b));
        }
        return iK;
    }

    public static int C(byte[] bArr, int i10, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f47182a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i11 == 0) {
            bVar.f47184c = "";
            return I;
        }
        bVar.f47184c = new String(bArr, I, i11, Internal.f47106a);
        return I + i11;
    }

    public static int D(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i11, bVar);
        int i13 = bVar.f47182a;
        if (i13 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i13 == 0) {
            protobufList.add("");
        } else {
            protobufList.add(new String(bArr, I, i13, Internal.f47106a));
            I += i13;
        }
        while (I < i12) {
            int I2 = I(bArr, I, bVar);
            if (i10 != bVar.f47182a) {
                break;
            }
            I = I(bArr, I2, bVar);
            int i14 = bVar.f47182a;
            if (i14 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            if (i14 == 0) {
                protobufList.add("");
            } else {
                protobufList.add(new String(bArr, I, i14, Internal.f47106a));
                I += i14;
            }
        }
        return I;
    }

    public static int E(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i11, bVar);
        int i13 = bVar.f47182a;
        if (i13 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i13 == 0) {
            protobufList.add("");
        } else {
            int i14 = I + i13;
            if (y0.f47315a.g(0, bArr, I, i14) != 0) {
                throw InvalidProtocolBufferException.c();
            }
            protobufList.add(new String(bArr, I, i13, Internal.f47106a));
            I = i14;
        }
        while (I < i12) {
            int I2 = I(bArr, I, bVar);
            if (i10 != bVar.f47182a) {
                break;
            }
            I = I(bArr, I2, bVar);
            int i15 = bVar.f47182a;
            if (i15 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            if (i15 == 0) {
                protobufList.add("");
            } else {
                int i16 = I + i15;
                if (y0.f47315a.g(0, bArr, I, i16) != 0) {
                    throw InvalidProtocolBufferException.c();
                }
                protobufList.add(new String(bArr, I, i15, Internal.f47106a));
                I = i16;
            }
        }
        return I;
    }

    public static int F(byte[] bArr, int i10, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f47182a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i11 == 0) {
            bVar.f47184c = "";
            return I;
        }
        bVar.f47184c = y0.f47315a.a(I, i11, bArr);
        return I + i11;
    }

    public static int G(int i10, byte[] bArr, int i11, int i12, UnknownFieldSetLite unknownFieldSetLite, b bVar) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(i10) == 0) {
            throw InvalidProtocolBufferException.b();
        }
        int tagWireType = WireFormat.getTagWireType(i10);
        if (tagWireType == 0) {
            int iK = K(bArr, i11, bVar);
            unknownFieldSetLite.e(i10, Long.valueOf(bVar.f47183b));
            return iK;
        }
        if (tagWireType == 1) {
            unknownFieldSetLite.e(i10, Long.valueOf(j(i11, bArr)));
            return i11 + 8;
        }
        if (tagWireType == 2) {
            int I = I(bArr, i11, bVar);
            int i13 = bVar.f47182a;
            if (i13 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            if (i13 > bArr.length - I) {
                throw InvalidProtocolBufferException.h();
            }
            if (i13 == 0) {
                unknownFieldSetLite.e(i10, ByteString.EMPTY);
            } else {
                unknownFieldSetLite.e(i10, ByteString.copyFrom(bArr, I, i13));
            }
            return I + i13;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.b();
            }
            unknownFieldSetLite.e(i10, Integer.valueOf(h(i11, bArr)));
            return i11 + 4;
        }
        UnknownFieldSetLite unknownFieldSetLite2 = new UnknownFieldSetLite();
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            int I2 = I(bArr, i11, bVar);
            int i16 = bVar.f47182a;
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
        unknownFieldSetLite.e(i10, unknownFieldSetLite2);
        return i11;
    }

    public static int H(int i10, byte[] bArr, int i11, b bVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            bVar.f47182a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            bVar.f47182a = i14 | (b11 << Constants.CVR_B1b41_1110_ONLINE_PIN);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            bVar.f47182a = i16 | (b12 << MessageUtils.MESSAGE_21_NAK);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            bVar.f47182a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                bVar.f47182a = i20;
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
        bVar.f47182a = b10;
        return i11;
    }

    public static int J(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) {
        n nVar = (n) protobufList;
        int I = I(bArr, i11, bVar);
        nVar.addInt(bVar.f47182a);
        while (I < i12) {
            int I2 = I(bArr, I, bVar);
            if (i10 != bVar.f47182a) {
                break;
            }
            I = I(bArr, I2, bVar);
            nVar.addInt(bVar.f47182a);
        }
        return I;
    }

    public static int K(byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            bVar.f47183b = j10;
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
        bVar.f47183b = j11;
        return i12;
    }

    public static int L(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) {
        v vVar = (v) protobufList;
        int iK = K(bArr, i11, bVar);
        vVar.addLong(bVar.f47183b);
        while (iK < i12) {
            int I = I(bArr, iK, bVar);
            if (i10 != bVar.f47182a) {
                break;
            }
            iK = K(bArr, I, bVar);
            vVar.addLong(bVar.f47183b);
        }
        return iK;
    }

    public static int M(Object obj, q0 q0Var, byte[] bArr, int i10, int i11, int i12, b bVar) throws IOException {
        int iK = ((d0) q0Var).K(obj, bArr, i10, i11, i12, bVar);
        bVar.f47184c = obj;
        return iK;
    }

    public static int N(Object obj, q0 q0Var, byte[] bArr, int i10, int i11, b bVar) throws IOException {
        int iH = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iH = H(i12, bArr, iH, bVar);
            i12 = bVar.f47182a;
        }
        int i13 = iH;
        if (i12 < 0 || i12 > i11 - i13) {
            throw InvalidProtocolBufferException.h();
        }
        int i14 = i12 + i13;
        q0Var.h(obj, bArr, i13, i14, bVar);
        bVar.f47184c = obj;
        return i14;
    }

    public static int O(int i10, byte[] bArr, int i11, int i12, b bVar) throws InvalidProtocolBufferException {
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
            return I(bArr, i11, bVar) + bVar.f47182a;
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
            i14 = bVar.f47182a;
            if (i14 == i13) {
                break;
            }
            i11 = O(i14, bArr, i11, i12, bVar);
        }
        if (i11 > i12 || i14 != i13) {
            throw InvalidProtocolBufferException.g();
        }
        return i11;
    }

    public static int a(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) {
        d dVar = (d) protobufList;
        int iK = K(bArr, i11, bVar);
        dVar.addBoolean(bVar.f47183b != 0);
        while (iK < i12) {
            int I = I(bArr, iK, bVar);
            if (i10 != bVar.f47182a) {
                break;
            }
            iK = K(bArr, I, bVar);
            dVar.addBoolean(bVar.f47183b != 0);
        }
        return iK;
    }

    public static int b(byte[] bArr, int i10, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f47182a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i11 > bArr.length - I) {
            throw InvalidProtocolBufferException.h();
        }
        if (i11 == 0) {
            bVar.f47184c = ByteString.EMPTY;
            return I;
        }
        bVar.f47184c = ByteString.copyFrom(bArr, I, i11);
        return I + i11;
    }

    public static int c(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) throws InvalidProtocolBufferException {
        int I = I(bArr, i11, bVar);
        int i13 = bVar.f47182a;
        if (i13 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i13 > bArr.length - I) {
            throw InvalidProtocolBufferException.h();
        }
        if (i13 == 0) {
            protobufList.add(ByteString.EMPTY);
        } else {
            protobufList.add(ByteString.copyFrom(bArr, I, i13));
            I += i13;
        }
        while (I < i12) {
            int I2 = I(bArr, I, bVar);
            if (i10 != bVar.f47182a) {
                break;
            }
            I = I(bArr, I2, bVar);
            int i14 = bVar.f47182a;
            if (i14 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            if (i14 > bArr.length - I) {
                throw InvalidProtocolBufferException.h();
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
        g gVar = (g) protobufList;
        gVar.addDouble(Double.longBitsToDouble(j(i11, bArr)));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f47182a) {
                break;
            }
            gVar.addDouble(Double.longBitsToDouble(j(I, bArr)));
            i13 = I + 8;
        }
        return i13;
    }

    public static int f(int i10, byte[] bArr, int i11, int i12, GeneratedMessageLite.ExtendableMessage<?, ?> extendableMessage, GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension, v0<UnknownFieldSetLite, UnknownFieldSetLite> v0Var, b bVar) throws IOException {
        int iK;
        FieldSet<GeneratedMessageLite.b> fieldSet = extendableMessage.extensions;
        int i13 = i10 >>> 3;
        GeneratedMessageLite.b bVar2 = generatedExtension.f47094d;
        if (bVar2.f47102s0 && bVar2.f47103t0) {
            switch (a.f47181a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    g gVar = new g();
                    int iS = s(bArr, i11, gVar, bVar);
                    fieldSet.q(bVar2, gVar);
                    return iS;
                case 2:
                    l lVar = new l();
                    int iV = v(bArr, i11, lVar, bVar);
                    fieldSet.q(bVar2, lVar);
                    return iV;
                case 3:
                case 4:
                    v vVar = new v();
                    int iZ = z(bArr, i11, vVar, bVar);
                    fieldSet.q(bVar2, vVar);
                    return iZ;
                case 5:
                case 6:
                    n nVar = new n();
                    int iY = y(bArr, i11, nVar, bVar);
                    fieldSet.q(bVar2, nVar);
                    return iY;
                case 7:
                case 8:
                    v vVar2 = new v();
                    int iU = u(bArr, i11, vVar2, bVar);
                    fieldSet.q(bVar2, vVar2);
                    return iU;
                case 9:
                case 10:
                    n nVar2 = new n();
                    int iT = t(bArr, i11, nVar2, bVar);
                    fieldSet.q(bVar2, nVar2);
                    return iT;
                case 11:
                    d dVar = new d();
                    int iR = r(bArr, i11, dVar, bVar);
                    fieldSet.q(bVar2, dVar);
                    return iR;
                case 12:
                    n nVar3 = new n();
                    int iW = w(bArr, i11, nVar3, bVar);
                    fieldSet.q(bVar2, nVar3);
                    return iW;
                case 13:
                    v vVar3 = new v();
                    int iX = x(bArr, i11, vVar3, bVar);
                    fieldSet.q(bVar2, vVar3);
                    return iX;
                case 14:
                    n nVar4 = new n();
                    int iY2 = y(bArr, i11, nVar4, bVar);
                    r0.z(extendableMessage, i13, nVar4, bVar2.f47099p0, null, v0Var);
                    fieldSet.q(bVar2, nVar4);
                    return iY2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + bVar2.f47101r0);
            }
        }
        Object objValueOf = null;
        if (generatedExtension.getLiteType() != WireFormat.FieldType.ENUM) {
            switch (a.f47181a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(Double.longBitsToDouble(j(i11, bArr)));
                    iK = i11 + 8;
                    break;
                case 2:
                    objValueOf = Float.valueOf(Float.intBitsToFloat(h(i11, bArr)));
                    iK = i11 + 4;
                    break;
                case 3:
                case 4:
                    iK = K(bArr, i11, bVar);
                    objValueOf = Long.valueOf(bVar.f47183b);
                    break;
                case 5:
                case 6:
                    iK = I(bArr, i11, bVar);
                    objValueOf = Integer.valueOf(bVar.f47182a);
                    break;
                case 7:
                case 8:
                    objValueOf = Long.valueOf(j(i11, bArr));
                    iK = i11 + 8;
                    break;
                case 9:
                case 10:
                    objValueOf = Integer.valueOf(h(i11, bArr));
                    iK = i11 + 4;
                    break;
                case 11:
                    iK = K(bArr, i11, bVar);
                    objValueOf = Boolean.valueOf(bVar.f47183b != 0);
                    break;
                case 12:
                    iK = I(bArr, i11, bVar);
                    objValueOf = Integer.valueOf(CodedInputStream.decodeZigZag32(bVar.f47182a));
                    break;
                case 13:
                    iK = K(bArr, i11, bVar);
                    objValueOf = Long.valueOf(CodedInputStream.decodeZigZag64(bVar.f47183b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    iK = b(bArr, i11, bVar);
                    objValueOf = bVar.f47184c;
                    break;
                case 16:
                    iK = C(bArr, i11, bVar);
                    objValueOf = bVar.f47184c;
                    break;
                case 17:
                    int i14 = (i13 << 3) | 4;
                    q0 q0VarA = l0.f47234c.a(generatedExtension.getMessageDefaultInstance().getClass());
                    if (generatedExtension.isRepeated()) {
                        int iN = n(q0VarA, bArr, i11, i12, i14, bVar);
                        fieldSet.a(bVar2, bVar.f47184c);
                        return iN;
                    }
                    Object objF = fieldSet.f(bVar2);
                    if (objF == null) {
                        objF = q0VarA.newInstance();
                        fieldSet.q(bVar2, objF);
                    }
                    return M(objF, q0VarA, bArr, i11, i12, i14, bVar);
                case 18:
                    q0 q0VarA2 = l0.f47234c.a(generatedExtension.getMessageDefaultInstance().getClass());
                    if (generatedExtension.isRepeated()) {
                        int iP = p(q0VarA2, bArr, i11, i12, bVar);
                        fieldSet.a(bVar2, bVar.f47184c);
                        return iP;
                    }
                    Object objF2 = fieldSet.f(bVar2);
                    if (objF2 == null) {
                        objF2 = q0VarA2.newInstance();
                        fieldSet.q(bVar2, objF2);
                    }
                    return N(objF2, q0VarA2, bArr, i11, i12, bVar);
                default:
                    iK = i11;
                    break;
            }
        } else {
            int I = I(bArr, i11, bVar);
            if (bVar2.f47099p0.findValueByNumber(bVar.f47182a) == null) {
                r0.D(extendableMessage, i13, bVar.f47182a, null, v0Var);
                return I;
            }
            objValueOf = Integer.valueOf(bVar.f47182a);
            iK = I;
        }
        if (generatedExtension.isRepeated()) {
            fieldSet.a(bVar2, objValueOf);
        } else {
            fieldSet.q(bVar2, objValueOf);
        }
        return iK;
    }

    public static int g(int i10, byte[] bArr, int i11, int i12, Object obj, MessageLite messageLite, v0<UnknownFieldSetLite, UnknownFieldSetLite> v0Var, b bVar) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtensionFindLiteExtensionByNumber = bVar.f47185d.findLiteExtensionByNumber(messageLite, i10 >>> 3);
        if (generatedExtensionFindLiteExtensionByNumber == null) {
            return G(i10, bArr, i11, i12, d0.q(obj), bVar);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        extendableMessage.p();
        return f(i10, bArr, i11, i12, extendableMessage, generatedExtensionFindLiteExtensionByNumber, v0Var, bVar);
    }

    public static int h(int i10, byte[] bArr) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int i(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) {
        n nVar = (n) protobufList;
        nVar.addInt(h(i11, bArr));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f47182a) {
                break;
            }
            nVar.addInt(h(I, bArr));
            i13 = I + 4;
        }
        return i13;
    }

    public static long j(int i10, byte[] bArr) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public static int k(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) {
        v vVar = (v) protobufList;
        vVar.addLong(j(i11, bArr));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f47182a) {
                break;
            }
            vVar.addLong(j(I, bArr));
            i13 = I + 8;
        }
        return i13;
    }

    public static float l(int i10, byte[] bArr) {
        return Float.intBitsToFloat(h(i10, bArr));
    }

    public static int m(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) {
        l lVar = (l) protobufList;
        lVar.addFloat(Float.intBitsToFloat(h(i11, bArr)));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int I = I(bArr, i13, bVar);
            if (i10 != bVar.f47182a) {
                break;
            }
            lVar.addFloat(Float.intBitsToFloat(h(I, bArr)));
            i13 = I + 4;
        }
        return i13;
    }

    public static int n(q0 q0Var, byte[] bArr, int i10, int i11, int i12, b bVar) throws IOException {
        Object objNewInstance = q0Var.newInstance();
        int iM = M(objNewInstance, q0Var, bArr, i10, i11, i12, bVar);
        q0Var.b(objNewInstance);
        bVar.f47184c = objNewInstance;
        return iM;
    }

    public static int o(q0 q0Var, int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        int i13 = (i10 & (-8)) | 4;
        int iN = n(q0Var, bArr, i11, i12, i13, bVar);
        protobufList.add(bVar.f47184c);
        while (iN < i12) {
            int I = I(bArr, iN, bVar);
            if (i10 != bVar.f47182a) {
                break;
            }
            iN = n(q0Var, bArr, I, i12, i13, bVar);
            protobufList.add(bVar.f47184c);
        }
        return iN;
    }

    public static int p(q0 q0Var, byte[] bArr, int i10, int i11, b bVar) throws IOException {
        Object objNewInstance = q0Var.newInstance();
        int iN = N(objNewInstance, q0Var, bArr, i10, i11, bVar);
        q0Var.b(objNewInstance);
        bVar.f47184c = objNewInstance;
        return iN;
    }

    public static int q(q0<?> q0Var, int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        int iP = p(q0Var, bArr, i11, i12, bVar);
        protobufList.add(bVar.f47184c);
        while (iP < i12) {
            int I = I(bArr, iP, bVar);
            if (i10 != bVar.f47182a) {
                break;
            }
            iP = p(q0Var, bArr, I, i12, bVar);
            protobufList.add(bVar.f47184c);
        }
        return iP;
    }

    public static int r(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        d dVar = (d) protobufList;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f47182a + I;
        while (I < i11) {
            I = K(bArr, I, bVar);
            dVar.addBoolean(bVar.f47183b != 0);
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int s(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        g gVar = (g) protobufList;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f47182a + I;
        while (I < i11) {
            gVar.addDouble(Double.longBitsToDouble(j(I, bArr)));
            I += 8;
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int t(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        n nVar = (n) protobufList;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f47182a + I;
        while (I < i11) {
            nVar.addInt(h(I, bArr));
            I += 4;
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int u(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        v vVar = (v) protobufList;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f47182a + I;
        while (I < i11) {
            vVar.addLong(j(I, bArr));
            I += 8;
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int v(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        l lVar = (l) protobufList;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f47182a + I;
        while (I < i11) {
            lVar.addFloat(Float.intBitsToFloat(h(I, bArr)));
            I += 4;
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int w(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        n nVar = (n) protobufList;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f47182a + I;
        while (I < i11) {
            I = I(bArr, I, bVar);
            nVar.addInt(CodedInputStream.decodeZigZag32(bVar.f47182a));
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int x(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        v vVar = (v) protobufList;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f47182a + I;
        while (I < i11) {
            I = K(bArr, I, bVar);
            vVar.addLong(CodedInputStream.decodeZigZag64(bVar.f47183b));
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int y(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        n nVar = (n) protobufList;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f47182a + I;
        while (I < i11) {
            I = I(bArr, I, bVar);
            nVar.addInt(bVar.f47182a);
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int z(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, b bVar) throws IOException {
        v vVar = (v) protobufList;
        int I = I(bArr, i10, bVar);
        int i11 = bVar.f47182a + I;
        while (I < i11) {
            I = K(bArr, I, bVar);
            vVar.addLong(bVar.f47183b);
        }
        if (I == i11) {
            return I;
        }
        throw InvalidProtocolBufferException.h();
    }
}
