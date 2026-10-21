package com.google.crypto.tink.shaded.protobuf;

import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: MessageSchema.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d0<T> implements q0<T> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f47190r = new int[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Unsafe f47191s = x0.o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f47192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f47193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MessageLite f47196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f47197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f47198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f47199h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f47200i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f47201j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f47202k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f47203l;
    public final f0 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u f47204n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final v0<?, ?> f47205o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i<?> f47206p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f47207q;

    /* JADX INFO: compiled from: MessageSchema.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47208a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f47208a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47208a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47208a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47208a[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47208a[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47208a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f47208a[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f47208a[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f47208a[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f47208a[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f47208a[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f47208a[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f47208a[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f47208a[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f47208a[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f47208a[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f47208a[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public d0(int[] iArr, Object[] objArr, int i10, int i11, MessageLite messageLite, boolean z10, boolean z11, int[] iArr2, int i12, int i13, f0 f0Var, u uVar, v0<?, ?> v0Var, i<?> iVar, x xVar) {
        this.f47192a = iArr;
        this.f47193b = objArr;
        this.f47194c = i10;
        this.f47195d = i11;
        this.f47198g = messageLite instanceof GeneratedMessageLite;
        this.f47199h = z10;
        this.f47197f = iVar != null && iVar.e(messageLite);
        this.f47200i = z11;
        this.f47201j = iArr2;
        this.f47202k = i12;
        this.f47203l = i13;
        this.m = f0Var;
        this.f47204n = uVar;
        this.f47205o = v0Var;
        this.f47206p = iVar;
        this.f47196e = messageLite;
        this.f47207q = xVar;
    }

    public static d0 D(a0 a0Var, f0 f0Var, u uVar, v0 v0Var, i iVar, x xVar) {
        int i10;
        int i11;
        int iN;
        int iNumberOfTrailingZeros;
        char c10;
        if (a0Var instanceof n0) {
            return E((n0) a0Var, f0Var, uVar, v0Var, iVar, xVar);
        }
        StructuralMessageInfo structuralMessageInfo = (StructuralMessageInfo) a0Var;
        boolean z10 = structuralMessageInfo.f47150a == ProtoSyntax.PROTO3;
        FieldInfo[] fieldInfoArr = structuralMessageInfo.f47153d;
        if (fieldInfoArr.length == 0) {
            i10 = 0;
            i11 = 0;
        } else {
            i10 = fieldInfoArr[0].f47059s0;
            i11 = fieldInfoArr[fieldInfoArr.length - 1].f47059s0;
        }
        int length = fieldInfoArr.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i12 = 0;
        int i13 = 0;
        for (FieldInfo fieldInfo : fieldInfoArr) {
            FieldType fieldType = fieldInfo.f47057q0;
            if (fieldType == FieldType.MAP) {
                i12++;
            } else if (fieldType.id() >= 18 && fieldInfo.f47057q0.id() <= 49) {
                i13++;
            }
        }
        int[] iArr2 = i12 > 0 ? new int[i12] : null;
        int[] iArr3 = i13 > 0 ? new int[i13] : null;
        int[] iArr4 = f47190r;
        int[] iArr5 = structuralMessageInfo.f47152c;
        if (iArr5 == null) {
            iArr5 = iArr4;
        }
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i15 < fieldInfoArr.length) {
            FieldInfo fieldInfo2 = fieldInfoArr[i15];
            int i19 = fieldInfo2.f47059s0;
            FieldInfo[] fieldInfoArr2 = fieldInfoArr;
            x0.e eVar = x0.f47308c;
            int[] iArr6 = iArr4;
            java.lang.reflect.Field field = fieldInfo2.f47056p0;
            int i20 = i10;
            int i21 = i11;
            int iN2 = (int) eVar.n(field);
            FieldType fieldType2 = fieldInfo2.f47057q0;
            int iId = fieldType2.id();
            if (fieldType2.isList() || fieldType2.isMap()) {
                i15 = i15;
                java.lang.reflect.Field field2 = fieldInfo2.f47063x0;
                iN = field2 == null ? 0 : (int) eVar.n(field2);
                iNumberOfTrailingZeros = 0;
            } else {
                java.lang.reflect.Field field3 = fieldInfo2.f47060t0;
                iN = field3 == null ? 1048575 : (int) eVar.n(field3);
                iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(fieldInfo2.f47061u0);
                structuralMessageInfo = structuralMessageInfo;
            }
            iArr[i16] = fieldInfo2.f47059s0;
            int[] iArr7 = iArr3;
            iArr[i16 + 1] = (fieldInfo2.v0 ? 268435456 : 0) | (fieldInfo2.f47062w0 ? PKIFailureInfo.duplicateCertReq : 0) | (iId << 20) | iN2;
            iArr[i16 + 2] = (iNumberOfTrailingZeros << 20) | iN;
            int i22 = FieldInfo.a.f47075a[fieldType2.ordinal()];
            Class<?> type = (i22 == 1 || i22 == 2) ? field != null ? field.getType() : fieldInfo2.f47064y0 : (i22 == 3 || i22 == 4) ? fieldInfo2.f47058r0 : null;
            Internal.EnumVerifier enumVerifier = fieldInfo2.F0;
            Object obj = fieldInfo2.E0;
            if (obj != null) {
                int i23 = (i16 / 3) * 2;
                objArr[i23] = obj;
                if (type != null) {
                    objArr[i23 + 1] = type;
                } else if (enumVerifier != null) {
                    objArr[i23 + 1] = enumVerifier;
                }
            } else if (type != null) {
                objArr[((i16 / 3) * 2) + 1] = type;
            } else if (enumVerifier != null) {
                objArr[((i16 / 3) * 2) + 1] = enumVerifier;
            }
            if (i14 < iArr5.length && iArr5[i14] == i19) {
                iArr5[i14] = i16;
                i14++;
            }
            if (fieldType2 == FieldType.MAP) {
                iArr2[i17] = i16;
                i17++;
                c10 = 18;
            } else {
                c10 = 18;
                if (fieldType2.id() >= 18) {
                    if (fieldType2.id() <= 49) {
                        iArr7[i18] = (int) eVar.n(field);
                        i18++;
                    }
                }
                i15++;
                i16 += 3;
                fieldInfoArr = fieldInfoArr2;
                iArr4 = iArr6;
                i10 = i20;
                i11 = i21;
                z10 = z10;
                structuralMessageInfo = structuralMessageInfo;
                iArr3 = iArr7;
            }
            i15++;
            i16 += 3;
            fieldInfoArr = fieldInfoArr2;
            iArr4 = iArr6;
            i10 = i20;
            i11 = i21;
            z10 = z10;
            structuralMessageInfo = structuralMessageInfo;
            iArr3 = iArr7;
        }
        StructuralMessageInfo structuralMessageInfo2 = structuralMessageInfo;
        int[] iArr8 = iArr3;
        int[] iArr9 = iArr4;
        int i24 = i10;
        int i25 = i11;
        boolean z11 = z10;
        if (iArr2 == null) {
            iArr2 = iArr9;
        }
        int[] iArr10 = iArr8 == null ? iArr9 : iArr8;
        int[] iArr11 = new int[iArr5.length + iArr2.length + iArr10.length];
        System.arraycopy(iArr5, 0, iArr11, 0, iArr5.length);
        System.arraycopy(iArr2, 0, iArr11, iArr5.length, iArr2.length);
        System.arraycopy(iArr10, 0, iArr11, iArr5.length + iArr2.length, iArr10.length);
        return new d0(iArr, objArr, i24, i25, structuralMessageInfo2.f47154e, z11, true, iArr11, iArr5.length, iArr5.length + iArr2.length, f0Var, uVar, v0Var, iVar, xVar);
    }

    /* JADX WARN: Code duplicated, block: B:123:0x025c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0260  */
    /* JADX WARN: Code duplicated, block: B:128:0x0278  */
    /* JADX WARN: Code duplicated, block: B:129:0x027b  */
    /* JADX WARN: Code duplicated, block: B:163:0x032d  */
    /* JADX WARN: Code duplicated, block: B:179:0x0379  */
    /* JADX WARN: Code duplicated, block: B:182:0x0384  */
    public static <T> d0<T> E(n0 n0Var, f0 f0Var, u uVar, v0<?, ?> v0Var, i<?> iVar, x xVar) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int iCharAt4;
        int iCharAt5;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        char cCharAt;
        int i14;
        char cCharAt2;
        int i15;
        char cCharAt3;
        int i16;
        char cCharAt4;
        int i17;
        char cCharAt5;
        int i18;
        char cCharAt6;
        int i19;
        char cCharAt7;
        int i20;
        char cCharAt8;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i27;
        int i28;
        java.lang.reflect.Field fieldR;
        char cCharAt9;
        int i29;
        int i30;
        int i31;
        int i32;
        Object obj;
        java.lang.reflect.Field fieldR2;
        int i33;
        Object obj2;
        java.lang.reflect.Field fieldR3;
        int i34;
        char cCharAt10;
        int i35;
        char cCharAt11;
        int i36;
        char cCharAt12;
        int i37;
        char cCharAt13;
        boolean z10 = n0Var.getSyntax() == ProtoSyntax.PROTO3;
        String strD = n0Var.d();
        int length = strD.length();
        char c10 = 55296;
        if (strD.charAt(0) >= 55296) {
            int i38 = 1;
            while (true) {
                i10 = i38 + 1;
                if (strD.charAt(i38) < 55296) {
                    break;
                }
                i38 = i10;
            }
        } else {
            i10 = 1;
        }
        int i39 = i10 + 1;
        int iCharAt6 = strD.charAt(i10);
        if (iCharAt6 >= 55296) {
            int i40 = iCharAt6 & 8191;
            int i41 = 13;
            while (true) {
                i37 = i39 + 1;
                cCharAt13 = strD.charAt(i39);
                if (cCharAt13 < 55296) {
                    break;
                }
                i40 |= (cCharAt13 & 8191) << i41;
                i41 += 13;
                i39 = i37;
            }
            iCharAt6 = i40 | (cCharAt13 << i41);
            i39 = i37;
        }
        if (iCharAt6 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            iCharAt4 = 0;
            iCharAt5 = 0;
            i11 = 0;
            iArr = f47190r;
            i12 = 0;
        } else {
            int i42 = i39 + 1;
            int iCharAt7 = strD.charAt(i39);
            if (iCharAt7 >= 55296) {
                int i43 = iCharAt7 & 8191;
                int i44 = 13;
                while (true) {
                    i20 = i42 + 1;
                    cCharAt8 = strD.charAt(i42);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt8 & 8191) << i44;
                    i44 += 13;
                    i42 = i20;
                }
                iCharAt7 = i43 | (cCharAt8 << i44);
                i42 = i20;
            }
            int i45 = i42 + 1;
            int iCharAt8 = strD.charAt(i42);
            if (iCharAt8 >= 55296) {
                int i46 = iCharAt8 & 8191;
                int i47 = 13;
                while (true) {
                    i19 = i45 + 1;
                    cCharAt7 = strD.charAt(i45);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt7 & 8191) << i47;
                    i47 += 13;
                    i45 = i19;
                }
                iCharAt8 = i46 | (cCharAt7 << i47);
                i45 = i19;
            }
            int i48 = i45 + 1;
            iCharAt = strD.charAt(i45);
            if (iCharAt >= 55296) {
                int i49 = iCharAt & 8191;
                int i50 = 13;
                while (true) {
                    i18 = i48 + 1;
                    cCharAt6 = strD.charAt(i48);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt6 & 8191) << i50;
                    i50 += 13;
                    i48 = i18;
                }
                iCharAt = i49 | (cCharAt6 << i50);
                i48 = i18;
            }
            int i51 = i48 + 1;
            iCharAt2 = strD.charAt(i48);
            if (iCharAt2 >= 55296) {
                int i52 = iCharAt2 & 8191;
                int i53 = 13;
                while (true) {
                    i17 = i51 + 1;
                    cCharAt5 = strD.charAt(i51);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt5 & 8191) << i53;
                    i53 += 13;
                    i51 = i17;
                }
                iCharAt2 = i52 | (cCharAt5 << i53);
                i51 = i17;
            }
            int i54 = i51 + 1;
            iCharAt3 = strD.charAt(i51);
            if (iCharAt3 >= 55296) {
                int i55 = iCharAt3 & 8191;
                int i56 = 13;
                while (true) {
                    i16 = i54 + 1;
                    cCharAt4 = strD.charAt(i54);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt4 & 8191) << i56;
                    i56 += 13;
                    i54 = i16;
                }
                iCharAt3 = i55 | (cCharAt4 << i56);
                i54 = i16;
            }
            int i57 = i54 + 1;
            iCharAt4 = strD.charAt(i54);
            if (iCharAt4 >= 55296) {
                int i58 = iCharAt4 & 8191;
                int i59 = 13;
                while (true) {
                    i15 = i57 + 1;
                    cCharAt3 = strD.charAt(i57);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt3 & 8191) << i59;
                    i59 += 13;
                    i57 = i15;
                }
                iCharAt4 = i58 | (cCharAt3 << i59);
                i57 = i15;
            }
            int i60 = i57 + 1;
            int iCharAt9 = strD.charAt(i57);
            if (iCharAt9 >= 55296) {
                int i61 = iCharAt9 & 8191;
                int i62 = 13;
                while (true) {
                    i14 = i60 + 1;
                    cCharAt2 = strD.charAt(i60);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt2 & 8191) << i62;
                    i62 += 13;
                    i60 = i14;
                }
                iCharAt9 = i61 | (cCharAt2 << i62);
                i60 = i14;
            }
            int i63 = i60 + 1;
            iCharAt5 = strD.charAt(i60);
            if (iCharAt5 >= 55296) {
                int i64 = iCharAt5 & 8191;
                int i65 = 13;
                while (true) {
                    i13 = i63 + 1;
                    cCharAt = strD.charAt(i63);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i64 |= (cCharAt & 8191) << i65;
                    i65 += 13;
                    i63 = i13;
                }
                iCharAt5 = i64 | (cCharAt << i65);
                i63 = i13;
            }
            iArr = new int[iCharAt5 + iCharAt4 + iCharAt9];
            i11 = (iCharAt7 * 2) + iCharAt8;
            i12 = iCharAt7;
            i39 = i63;
        }
        Object[] objArrC = n0Var.c();
        Class<?> cls = n0Var.b().getClass();
        int[] iArr2 = new int[iCharAt3 * 3];
        Object[] objArr = new Object[iCharAt3 * 2];
        int i66 = iCharAt5 + iCharAt4;
        int i67 = iCharAt5;
        int i68 = i66;
        int i69 = 0;
        int i70 = 0;
        while (i39 < length) {
            int i71 = i39 + 1;
            int iCharAt10 = strD.charAt(i39);
            if (iCharAt10 >= c10) {
                int i72 = iCharAt10 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i36 = i73 + 1;
                    cCharAt12 = strD.charAt(i73);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i72 |= (cCharAt12 & 8191) << i74;
                    i74 += 13;
                    i73 = i36;
                }
                iCharAt10 = i72 | (cCharAt12 << i74);
                i21 = i36;
            } else {
                i21 = i71;
            }
            int i75 = i21 + 1;
            int iCharAt11 = strD.charAt(i21);
            if (iCharAt11 >= c10) {
                int i76 = iCharAt11 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i35 = i77 + 1;
                    cCharAt11 = strD.charAt(i77);
                    i22 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i76 |= (cCharAt11 & 8191) << i78;
                    i78 += 13;
                    i77 = i35;
                    length = i22;
                }
                iCharAt11 = i76 | (cCharAt11 << i78);
                i23 = i35;
            } else {
                i22 = length;
                i23 = i75;
            }
            int i79 = iCharAt11 & 255;
            int i80 = iCharAt5;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i69] = i70;
                i69++;
            }
            Unsafe unsafe = f47191s;
            int i81 = i69;
            if (i79 >= 51) {
                int i82 = i23 + 1;
                int iCharAt12 = strD.charAt(i23);
                if (iCharAt12 >= 55296) {
                    int i83 = iCharAt12 & 8191;
                    int i84 = i82;
                    int i85 = 13;
                    while (true) {
                        i34 = i84 + 1;
                        cCharAt10 = strD.charAt(i84);
                        i24 = iCharAt2;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i83 |= (cCharAt10 & 8191) << i85;
                        i85 += 13;
                        i84 = i34;
                        iCharAt2 = i24;
                    }
                    iCharAt12 = i83 | (cCharAt10 << i85);
                    i30 = i34;
                } else {
                    i24 = iCharAt2;
                    i30 = i82;
                }
                int i86 = i79 - 51;
                int i87 = i30;
                if (i86 == 9 || i86 == 17) {
                    i31 = i11 + 1;
                    objArr[((i70 / 3) * 2) + 1] = objArrC[i11];
                } else {
                    if (i86 == 12 && !z10) {
                        i31 = i11 + 1;
                        objArr[((i70 / 3) * 2) + 1] = objArrC[i11];
                    }
                    i32 = iCharAt12 * 2;
                    obj = objArrC[i32];
                    if (obj instanceof java.lang.reflect.Field) {
                        fieldR2 = (java.lang.reflect.Field) obj;
                    } else {
                        fieldR2 = R(cls, (String) obj);
                        objArrC[i32] = fieldR2;
                    }
                    int i88 = iCharAt;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldR2);
                    i33 = i32 + 1;
                    obj2 = objArrC[i33];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        fieldR3 = (java.lang.reflect.Field) obj2;
                    } else {
                        fieldR3 = R(cls, (String) obj2);
                        objArrC[i33] = fieldR3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldR3);
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i28 = 0;
                    i27 = i87;
                    i25 = i88;
                    objArrC = objArrC;
                }
                i11 = i31;
                i32 = iCharAt12 * 2;
                obj = objArrC[i32];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldR2 = (java.lang.reflect.Field) obj;
                } else {
                    fieldR2 = R(cls, (String) obj);
                    objArrC[i32] = fieldR2;
                }
                int i89 = iCharAt;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldR2);
                i33 = i32 + 1;
                obj2 = objArrC[i33];
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldR3 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldR3 = R(cls, (String) obj2);
                    objArrC[i33] = fieldR3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldR3);
                iObjectFieldOffset = iObjectFieldOffset4;
                i28 = 0;
                i27 = i87;
                i25 = i89;
                objArrC = objArrC;
            } else {
                int i90 = iCharAt;
                i24 = iCharAt2;
                int i91 = i11 + 1;
                java.lang.reflect.Field fieldR4 = R(cls, (String) objArrC[i11]);
                i25 = i90;
                if (i79 == 9 || i79 == 17) {
                    objArr[((i70 / 3) * 2) + 1] = fieldR4.getType();
                } else {
                    if (i79 == 27 || i79 == 49) {
                        i29 = i11 + 2;
                        objArr[((i70 / 3) * 2) + 1] = objArrC[i91];
                    } else if (i79 == 12 || i79 == 30 || i79 == 44) {
                        if (!z10) {
                            i29 = i11 + 2;
                            objArr[((i70 / 3) * 2) + 1] = objArrC[i91];
                        }
                    } else if (i79 == 50) {
                        int i92 = i67 + 1;
                        iArr[i67] = i70;
                        int i93 = (i70 / 3) * 2;
                        int i94 = i11 + 2;
                        objArr[i93] = objArrC[i91];
                        if ((iCharAt11 & 2048) != 0) {
                            i91 = i11 + 3;
                            objArr[i93 + 1] = objArrC[i94];
                            i67 = i92;
                        } else {
                            i67 = i92;
                            i26 = i94;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldR4);
                        i11 = i26;
                        if ((iCharAt11 & 4096) == 4096 || i79 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i27 = i23;
                            i28 = 0;
                        } else {
                            int i95 = i23 + 1;
                            int iCharAt13 = strD.charAt(i23);
                            if (iCharAt13 >= 55296) {
                                int i96 = iCharAt13 & 8191;
                                int i97 = 13;
                                while (true) {
                                    i27 = i95 + 1;
                                    cCharAt9 = strD.charAt(i95);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i96 |= (cCharAt9 & 8191) << i97;
                                    i97 += 13;
                                    i95 = i27;
                                }
                                iCharAt13 = i96 | (cCharAt9 << i97);
                            } else {
                                i27 = i95;
                            }
                            int i98 = (iCharAt13 / 32) + (i12 * 2);
                            Object obj3 = objArrC[i98];
                            if (obj3 instanceof java.lang.reflect.Field) {
                                fieldR = (java.lang.reflect.Field) obj3;
                            } else {
                                fieldR = R(cls, (String) obj3);
                                objArrC[i98] = fieldR;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldR);
                            i28 = iCharAt13 % 32;
                        }
                        if (i79 >= 18 && i79 <= 49) {
                            iArr[i68] = iObjectFieldOffset;
                            i68++;
                        }
                    }
                    i26 = i29;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldR4);
                    i11 = i26;
                    if ((iCharAt11 & 4096) == 4096) {
                        iObjectFieldOffset2 = 1048575;
                        i27 = i23;
                        i28 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i27 = i23;
                        i28 = 0;
                    }
                    if (i79 >= 18) {
                        iArr[i68] = iObjectFieldOffset;
                        i68++;
                    }
                }
                i26 = i91;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldR4);
                i11 = i26;
                if ((iCharAt11 & 4096) == 4096) {
                    iObjectFieldOffset2 = 1048575;
                    i27 = i23;
                    i28 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i27 = i23;
                    i28 = 0;
                }
                if (i79 >= 18) {
                    iArr[i68] = iObjectFieldOffset;
                    i68++;
                }
            }
            int i99 = i70 + 1;
            iArr2[i70] = iCharAt10;
            int i100 = i70 + 2;
            iArr2[i99] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? PKIFailureInfo.duplicateCertReq : 0) | (i79 << 20) | iObjectFieldOffset;
            i70 += 3;
            iArr2[i100] = (i28 << 20) | iObjectFieldOffset2;
            objArrC = objArrC;
            iCharAt5 = i80;
            iCharAt = i25;
            length = i22;
            i39 = i27;
            i69 = i81;
            iCharAt2 = i24;
            c10 = 55296;
        }
        return new d0<>(iArr2, objArr, iCharAt, iCharAt2, n0Var.b(), z10, false, iArr, iCharAt5, i66, f0Var, uVar, v0Var, iVar, xVar);
    }

    public static long F(int i10) {
        return i10 & 1048575;
    }

    public static int G(long j10, Object obj) {
        return ((Integer) x0.f47308c.m(j10, obj)).intValue();
    }

    public static long H(long j10, Object obj) {
        return ((Long) x0.f47308c.m(j10, obj)).longValue();
    }

    public static java.lang.reflect.Field R(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbD = ci.a.d("Field ", str, " for ");
            androidx.core.graphics.b.f(cls, sbD, " not found. Known fields are ");
            sbD.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbD.toString());
        }
    }

    public static int X(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static void b0(int i10, Object obj, f fVar) throws IOException {
        if (!(obj instanceof String)) {
            fVar.b(i10, (ByteString) obj);
        } else {
            fVar.f47218a.writeString(i10, (String) obj);
        }
    }

    public static void k(Object obj) {
        if (!u(obj)) {
            throw new IllegalArgumentException(androidx.databinding.c.c("Mutating immutable message: ", obj));
        }
    }

    public static int l(byte[] bArr, int i10, int i11, WireFormat.FieldType fieldType, Class cls, c.b bVar) throws IOException {
        switch (a.f47208a[fieldType.ordinal()]) {
            case 1:
                int iK = c.K(bArr, i10, bVar);
                bVar.f47184c = Boolean.valueOf(bVar.f47183b != 0);
                return iK;
            case 2:
                return c.b(bArr, i10, bVar);
            case 3:
                bVar.f47184c = Double.valueOf(Double.longBitsToDouble(c.j(i10, bArr)));
                return i10 + 8;
            case 4:
            case 5:
                bVar.f47184c = Integer.valueOf(c.h(i10, bArr));
                return i10 + 4;
            case 6:
            case 7:
                bVar.f47184c = Long.valueOf(c.j(i10, bArr));
                return i10 + 8;
            case 8:
                bVar.f47184c = Float.valueOf(Float.intBitsToFloat(c.h(i10, bArr)));
                return i10 + 4;
            case 9:
            case 10:
            case 11:
                int I = c.I(bArr, i10, bVar);
                bVar.f47184c = Integer.valueOf(bVar.f47182a);
                return I;
            case 12:
            case 13:
                int iK2 = c.K(bArr, i10, bVar);
                bVar.f47184c = Long.valueOf(bVar.f47183b);
                return iK2;
            case 14:
                return c.p(l0.f47234c.a(cls), bArr, i10, i11, bVar);
            case 15:
                int I2 = c.I(bArr, i10, bVar);
                bVar.f47184c = Integer.valueOf(CodedInputStream.decodeZigZag32(bVar.f47182a));
                return I2;
            case 16:
                int iK3 = c.K(bArr, i10, bVar);
                bVar.f47184c = Long.valueOf(CodedInputStream.decodeZigZag64(bVar.f47183b));
                return iK3;
            case 17:
                return c.F(bArr, i10, bVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    public static UnknownFieldSetLite q(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLite2 = new UnknownFieldSetLite();
        generatedMessageLite.unknownFields = unknownFieldSetLite2;
        return unknownFieldSetLite2;
    }

    public static boolean u(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).j();
        }
        return true;
    }

    public static List w(long j10, Object obj) {
        return (List) x0.f47308c.m(j10, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(int i10, Object obj, Object obj2) {
        int[] iArr = this.f47192a;
        int i11 = iArr[i10];
        if (v(i11, i10, obj2)) {
            long jY = Y(i10) & 1048575;
            Unsafe unsafe = f47191s;
            Object object = unsafe.getObject(obj2, jY);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2);
            }
            q0 q0VarP = p(i10);
            if (!v(i11, i10, obj)) {
                if (u(object)) {
                    Object objNewInstance = q0VarP.newInstance();
                    q0VarP.a(objNewInstance, object);
                    unsafe.putObject(obj, jY, objNewInstance);
                } else {
                    unsafe.putObject(obj, jY, object);
                }
                T(i11, i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jY);
            if (!u(object2)) {
                Object objNewInstance2 = q0VarP.newInstance();
                q0VarP.a(objNewInstance2, object2);
                unsafe.putObject(obj, jY, objNewInstance2);
                object2 = objNewInstance2;
            }
            q0VarP.a(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object B(int i10, Object obj) {
        q0 q0VarP = p(i10);
        long jY = Y(i10) & 1048575;
        if (!t(i10, obj)) {
            return q0VarP.newInstance();
        }
        Object object = f47191s.getObject(obj, jY);
        if (u(object)) {
            return object;
        }
        Object objNewInstance = q0VarP.newInstance();
        if (object != null) {
            q0VarP.a(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object C(int i10, int i11, Object obj) {
        q0 q0VarP = p(i11);
        if (!v(i10, i11, obj)) {
            return q0VarP.newInstance();
        }
        Object object = f47191s.getObject(obj, Y(i11) & 1048575);
        if (u(object)) {
            return object;
        }
        Object objNewInstance = q0VarP.newInstance();
        if (object != null) {
            q0VarP.a(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> int I(T t10, byte[] bArr, int i10, int i11, int i12, long j10, c.b bVar) throws IOException {
        Object objO = o(i12);
        Unsafe unsafe = f47191s;
        Object object = unsafe.getObject(t10, j10);
        x xVar = this.f47207q;
        if (xVar.h(object)) {
            MapFieldLite mapFieldLiteF = xVar.f();
            xVar.a(mapFieldLiteF, object);
            unsafe.putObject(t10, j10, mapFieldLiteF);
            object = mapFieldLiteF;
        }
        MapEntryLite.b<?, ?> bVarB = xVar.b(objO);
        MapFieldLite mapFieldLiteC = xVar.c(object);
        int I = c.I(bArr, i10, bVar);
        int i13 = bVar.f47182a;
        if (i13 < 0 || i13 > i11 - I) {
            throw InvalidProtocolBufferException.h();
        }
        int i14 = I + i13;
        K k10 = bVarB.f47137b;
        V v3 = bVarB.f47139d;
        Object obj = k10;
        Object obj2 = v3;
        while (I < i14) {
            int iH = I + 1;
            int i15 = bArr[I];
            if (i15 < 0) {
                iH = c.H(i15, bArr, iH, bVar);
                i15 = bVar.f47182a;
            }
            int i16 = i15 >>> 3;
            int i17 = i15 & 7;
            if (i16 != 1) {
                if (i16 == 2 && i17 == bVarB.f47138c.getWireType()) {
                    I = l(bArr, iH, i11, bVarB.f47138c, v3.getClass(), bVar);
                    obj2 = bVar.f47184c;
                } else {
                    I = c.O(i15, bArr, iH, i11, bVar);
                }
            } else if (i17 == bVarB.f47136a.getWireType()) {
                I = l(bArr, iH, i11, bVarB.f47136a, null, bVar);
                obj = bVar.f47184c;
            } else {
                I = c.O(i15, bArr, iH, i11, bVar);
            }
        }
        if (I != i14) {
            throw InvalidProtocolBufferException.g();
        }
        mapFieldLiteC.put(obj, obj2);
        return i14;
    }

    public final int J(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, c.b bVar) throws IOException {
        long j11 = this.f47192a[i17 + 2] & 1048575;
        Unsafe unsafe = f47191s;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Double.valueOf(c.d(i10, bArr)));
                int i18 = i10 + 8;
                unsafe.putInt(t10, j11, i13);
                return i18;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Float.valueOf(c.l(i10, bArr)));
                int i19 = i10 + 4;
                unsafe.putInt(t10, j11, i13);
                return i19;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iK = c.K(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Long.valueOf(bVar.f47183b));
                unsafe.putInt(t10, j11, i13);
                return iK;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int I = c.I(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Integer.valueOf(bVar.f47182a));
                unsafe.putInt(t10, j11, i13);
                return I;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Long.valueOf(c.j(i10, bArr)));
                int i20 = i10 + 8;
                unsafe.putInt(t10, j11, i13);
                return i20;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Integer.valueOf(c.h(i10, bArr)));
                int i21 = i10 + 4;
                unsafe.putInt(t10, j11, i13);
                return i21;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iK2 = c.K(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Boolean.valueOf(bVar.f47183b != 0));
                unsafe.putInt(t10, j11, i13);
                return iK2;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int I2 = c.I(bArr, i10, bVar);
                int i22 = bVar.f47182a;
                if (i22 == 0) {
                    unsafe.putObject(t10, j10, "");
                } else {
                    if ((i15 & PKIFailureInfo.duplicateCertReq) != 0 && !y0.h(bArr, I2, I2 + i22)) {
                        throw InvalidProtocolBufferException.c();
                    }
                    unsafe.putObject(t10, j10, new String(bArr, I2, i22, Internal.f47106a));
                    I2 += i22;
                }
                unsafe.putInt(t10, j11, i13);
                return I2;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                Object objC = C(i13, i17, t10);
                int iN = c.N(objC, p(i17), bArr, i10, i11, bVar);
                W(i13, t10, i17, objC);
                return iN;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iB = c.b(bArr, i10, bVar);
                unsafe.putObject(t10, j10, bVar.f47184c);
                unsafe.putInt(t10, j11, i13);
                return iB;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int I3 = c.I(bArr, i10, bVar);
                int i23 = bVar.f47182a;
                Internal.EnumVerifier enumVerifierN = n(i17);
                if (enumVerifierN == null || enumVerifierN.isInRange(i23)) {
                    unsafe.putObject(t10, j10, Integer.valueOf(i23));
                    unsafe.putInt(t10, j11, i13);
                } else {
                    q(t10).e(i12, Long.valueOf(i23));
                }
                return I3;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                int I4 = c.I(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Integer.valueOf(CodedInputStream.decodeZigZag32(bVar.f47182a)));
                unsafe.putInt(t10, j11, i13);
                return I4;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iK3 = c.K(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Long.valueOf(CodedInputStream.decodeZigZag64(bVar.f47183b)));
                unsafe.putInt(t10, j11, i13);
                return iK3;
            case 68:
                if (i14 != 3) {
                    return i10;
                }
                Object objC2 = C(i13, i17, t10);
                int iM = c.M(objC2, p(i17), bArr, i10, i11, (i12 & (-8)) | 4, bVar);
                W(i13, t10, i17, objC2);
                return iM;
            default:
                return i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x03aa A[PHI: r0 r16 r17 r26 r31
      0x03aa: PHI (r0v40 int) = (r0v35 int), (r0v37 int), (r0v42 int) binds: [B:128:0x0413, B:124:0x03f2, B:116:0x03a8] A[DONT_GENERATE, DONT_INLINE]
      0x03aa: PHI (r16v5 int) = (r16v3 int), (r16v3 int), (r16v6 int) binds: [B:128:0x0413, B:124:0x03f2, B:116:0x03a8] A[DONT_GENERATE, DONT_INLINE]
      0x03aa: PHI (r17v5 int) = (r17v3 int), (r17v3 int), (r17v6 int) binds: [B:128:0x0413, B:124:0x03f2, B:116:0x03a8] A[DONT_GENERATE, DONT_INLINE]
      0x03aa: PHI (r26v7 sun.misc.Unsafe) = (r26v5 sun.misc.Unsafe), (r26v5 sun.misc.Unsafe), (r26v8 sun.misc.Unsafe) binds: [B:128:0x0413, B:124:0x03f2, B:116:0x03a8] A[DONT_GENERATE, DONT_INLINE]
      0x03aa: PHI (r31v4 int) = (r31v2 int), (r31v2 int), (r31v5 int) binds: [B:128:0x0413, B:124:0x03f2, B:116:0x03a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:119:0x03c4 A[PHI: r0 r16 r17 r26 r31
      0x03c4: PHI (r0v38 int) = (r0v35 int), (r0v37 int), (r0v42 int) binds: [B:128:0x0413, B:124:0x03f2, B:116:0x03a8] A[DONT_GENERATE, DONT_INLINE]
      0x03c4: PHI (r16v4 int) = (r16v3 int), (r16v3 int), (r16v6 int) binds: [B:128:0x0413, B:124:0x03f2, B:116:0x03a8] A[DONT_GENERATE, DONT_INLINE]
      0x03c4: PHI (r17v4 int) = (r17v3 int), (r17v3 int), (r17v6 int) binds: [B:128:0x0413, B:124:0x03f2, B:116:0x03a8] A[DONT_GENERATE, DONT_INLINE]
      0x03c4: PHI (r26v6 sun.misc.Unsafe) = (r26v5 sun.misc.Unsafe), (r26v5 sun.misc.Unsafe), (r26v8 sun.misc.Unsafe) binds: [B:128:0x0413, B:124:0x03f2, B:116:0x03a8] A[DONT_GENERATE, DONT_INLINE]
      0x03c4: PHI (r31v3 int) = (r31v2 int), (r31v2 int), (r31v5 int) binds: [B:128:0x0413, B:124:0x03f2, B:116:0x03a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x00a8. Please report as an issue. */
    public final int K(T t10, byte[] bArr, int i10, int i11, int i12, c.b bVar) throws IOException {
        Unsafe unsafe;
        int i13;
        d0<T> d0Var;
        int i14;
        int i15;
        T t11;
        int i16;
        int iH;
        int i17;
        int iU;
        int iU2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        byte[] bArr2;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        byte[] bArr3;
        int i35;
        int iK;
        d0<T> d0Var2 = this;
        t10 = t10;
        bArr = bArr;
        i11 = i11;
        i12 = i12;
        c.b bVar2 = bVar;
        k(t10);
        Unsafe unsafe2 = f47191s;
        int iG = i10;
        int i36 = -1;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 1048575;
        while (true) {
            if (iG < i11) {
                int i41 = iG + 1;
                byte b10 = bArr[iG];
                if (b10 < 0) {
                    iH = c.H(b10, bArr, i41, bVar2);
                    i16 = bVar2.f47182a;
                } else {
                    i16 = b10;
                    iH = i41;
                }
                int i42 = i16 >>> 3;
                int i43 = i16 & 7;
                int i44 = d0Var2.f47195d;
                int i45 = iH;
                int i46 = d0Var2.f47194c;
                int i47 = i16;
                if (i42 > i36) {
                    iU2 = (i42 < i46 || i42 > i44) ? -1 : d0Var2.U(i42, i37 / 3);
                    i18 = -1;
                    i17 = 0;
                } else {
                    if (i42 < i46 || i42 > i44) {
                        i17 = 0;
                        iU = -1;
                    } else {
                        i17 = 0;
                        iU = d0Var2.U(i42, 0);
                    }
                    iU2 = iU;
                    i18 = -1;
                }
                if (iU2 == i18) {
                    i19 = i45;
                    i20 = i40;
                    i21 = i17;
                    i22 = i42;
                    unsafe = unsafe2;
                    i23 = i12;
                    i15 = i47;
                    i24 = i39;
                } else {
                    int[] iArr = d0Var2.f47192a;
                    int i48 = iArr[iU2 + 1];
                    int iX = X(i48);
                    long j10 = i48 & 1048575;
                    if (iX <= 17) {
                        int i49 = iArr[iU2 + 2];
                        int i50 = 1 << (i49 >>> 20);
                        int i51 = i49 & 1048575;
                        if (i51 != i40) {
                            if (i40 != 1048575) {
                                unsafe2.putInt(t10, i40, i39);
                            }
                            i28 = i51;
                            i27 = unsafe2.getInt(t10, i51);
                        } else {
                            i27 = i39;
                            i28 = i40;
                        }
                        switch (iX) {
                            case 0:
                                bArr3 = bArr;
                                i35 = i45;
                                i30 = i42;
                                i31 = i28;
                                i32 = i47;
                                i33 = iU2;
                                if (i43 == 1) {
                                    x0.u(t10, j10, c.d(i35, bArr3));
                                    iG = i35 + 8;
                                    i39 = i27 | i50;
                                    i40 = i31;
                                    i37 = i33;
                                    bArr = bArr3;
                                    i38 = i32;
                                    i36 = i30;
                                    i12 = i12;
                                } else {
                                    i20 = i31;
                                    i19 = i35;
                                    unsafe = unsafe2;
                                    i24 = i27;
                                    i22 = i30;
                                    i23 = i12;
                                    i21 = i33;
                                    i15 = i32;
                                }
                                break;
                            case 1:
                                bArr3 = bArr;
                                i35 = i45;
                                i30 = i42;
                                i31 = i28;
                                i32 = i47;
                                i33 = iU2;
                                if (i43 == 5) {
                                    x0.v(t10, j10, c.l(i35, bArr3));
                                    iG = i35 + 4;
                                    i39 = i27 | i50;
                                    i40 = i31;
                                    i37 = i33;
                                    bArr = bArr3;
                                    i38 = i32;
                                    i36 = i30;
                                    i12 = i12;
                                } else {
                                    i20 = i31;
                                    i19 = i35;
                                    unsafe = unsafe2;
                                    i24 = i27;
                                    i22 = i30;
                                    i23 = i12;
                                    i21 = i33;
                                    i15 = i32;
                                }
                                break;
                            case 2:
                            case 3:
                                bArr3 = bArr;
                                i35 = i45;
                                i30 = i42;
                                i31 = i28;
                                i32 = i47;
                                i33 = iU2;
                                if (i43 == 0) {
                                    iK = c.K(bArr3, i35, bVar2);
                                    unsafe2.putLong(t10, j10, bVar2.f47183b);
                                    i39 = i27 | i50;
                                    i40 = i31;
                                    iG = iK;
                                    i37 = i33;
                                    bArr = bArr3;
                                    i38 = i32;
                                    i36 = i30;
                                    i12 = i12;
                                } else {
                                    i20 = i31;
                                    i19 = i35;
                                    unsafe = unsafe2;
                                    i24 = i27;
                                    i22 = i30;
                                    i23 = i12;
                                    i21 = i33;
                                    i15 = i32;
                                }
                                break;
                            case 4:
                            case 11:
                                bArr3 = bArr;
                                i35 = i45;
                                i30 = i42;
                                i31 = i28;
                                i32 = i47;
                                i33 = iU2;
                                if (i43 == 0) {
                                    iG = c.I(bArr3, i35, bVar2);
                                    unsafe2.putInt(t10, j10, bVar2.f47182a);
                                    i39 = i27 | i50;
                                    i40 = i31;
                                    i37 = i33;
                                    bArr = bArr3;
                                    i38 = i32;
                                    i36 = i30;
                                    i12 = i12;
                                } else {
                                    i20 = i31;
                                    i19 = i35;
                                    unsafe = unsafe2;
                                    i24 = i27;
                                    i22 = i30;
                                    i23 = i12;
                                    i21 = i33;
                                    i15 = i32;
                                }
                                break;
                            case 5:
                            case 14:
                                i34 = i45;
                                i30 = i42;
                                i31 = i28;
                                i32 = i47;
                                i33 = iU2;
                                if (i43 == 1) {
                                    bArr3 = bArr;
                                    unsafe2.putLong(t10, j10, c.j(i34, bArr));
                                    iG = i34 + 8;
                                    i39 = i27 | i50;
                                    i40 = i31;
                                    i37 = i33;
                                    bArr = bArr3;
                                    i38 = i32;
                                    i36 = i30;
                                    i12 = i12;
                                } else {
                                    i35 = i34;
                                    i20 = i31;
                                    i19 = i35;
                                    unsafe = unsafe2;
                                    i24 = i27;
                                    i22 = i30;
                                    i23 = i12;
                                    i21 = i33;
                                    i15 = i32;
                                }
                                break;
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i29 = i45;
                                i30 = i42;
                                i31 = i28;
                                i32 = i47;
                                i33 = iU2;
                                if (i43 == 5) {
                                    unsafe2.putInt(t10, j10, c.h(i29, bArr2));
                                    iG = i29 + 4;
                                    i39 = i27 | i50;
                                    bArr = bArr2;
                                    i37 = i33;
                                    i38 = i32;
                                    i36 = i30;
                                    i40 = i31;
                                    i11 = i11;
                                } else {
                                    i35 = i29;
                                    i20 = i31;
                                    i19 = i35;
                                    unsafe = unsafe2;
                                    i24 = i27;
                                    i22 = i30;
                                    i23 = i12;
                                    i21 = i33;
                                    i15 = i32;
                                }
                                break;
                            case 7:
                                bArr2 = bArr;
                                i29 = i45;
                                i30 = i42;
                                i31 = i28;
                                i32 = i47;
                                i33 = iU2;
                                if (i43 == 0) {
                                    int iK2 = c.K(bArr2, i29, bVar2);
                                    x0.p(t10, j10, bVar2.f47183b != 0);
                                    int i52 = i27 | i50;
                                    i12 = i12;
                                    bArr = bArr2;
                                    i37 = i33;
                                    i38 = i32;
                                    i36 = i30;
                                    i40 = i31;
                                    i11 = i11;
                                    i39 = i52;
                                    iG = iK2;
                                } else {
                                    i35 = i29;
                                    i20 = i31;
                                    i19 = i35;
                                    unsafe = unsafe2;
                                    i24 = i27;
                                    i22 = i30;
                                    i23 = i12;
                                    i21 = i33;
                                    i15 = i32;
                                }
                                break;
                            case 8:
                                bArr2 = bArr;
                                i29 = i45;
                                i30 = i42;
                                i31 = i28;
                                i32 = i47;
                                i33 = iU2;
                                if (i43 == 2) {
                                    iG = (i48 & PKIFailureInfo.duplicateCertReq) == 0 ? c.C(bArr2, i29, bVar2) : c.F(bArr2, i29, bVar2);
                                    unsafe2.putObject(t10, j10, bVar2.f47184c);
                                    i39 = i27 | i50;
                                    bArr = bArr2;
                                    i37 = i33;
                                    i38 = i32;
                                    i36 = i30;
                                    i40 = i31;
                                    i11 = i11;
                                } else {
                                    i35 = i29;
                                    i20 = i31;
                                    i19 = i35;
                                    unsafe = unsafe2;
                                    i24 = i27;
                                    i22 = i30;
                                    i23 = i12;
                                    i21 = i33;
                                    i15 = i32;
                                }
                                break;
                            case 9:
                                bArr2 = bArr;
                                i29 = i45;
                                i30 = i42;
                                i31 = i28;
                                i32 = i47;
                                i33 = iU2;
                                if (i43 == 2) {
                                    Object objB = d0Var2.B(i33, t10);
                                    bArr3 = bArr2;
                                    iG = c.N(objB, d0Var2.p(i33), bArr, i29, i11, bVar);
                                    d0Var2.V(i33, t10, objB);
                                    i39 = i27 | i50;
                                    i40 = i31;
                                    i37 = i33;
                                    bArr = bArr3;
                                    i38 = i32;
                                    i36 = i30;
                                    i12 = i12;
                                } else {
                                    i35 = i29;
                                    i20 = i31;
                                    i19 = i35;
                                    unsafe = unsafe2;
                                    i24 = i27;
                                    i22 = i30;
                                    i23 = i12;
                                    i21 = i33;
                                    i15 = i32;
                                }
                                break;
                            case 10:
                                bArr2 = bArr;
                                i29 = i45;
                                i30 = i42;
                                i31 = i28;
                                i32 = i47;
                                i33 = iU2;
                                if (i43 == 2) {
                                    iG = c.b(bArr2, i29, bVar2);
                                    unsafe2.putObject(t10, j10, bVar2.f47184c);
                                    i39 = i27 | i50;
                                    bArr = bArr2;
                                    i37 = i33;
                                    i38 = i32;
                                    i36 = i30;
                                    i40 = i31;
                                    i11 = i11;
                                } else {
                                    i35 = i29;
                                    i20 = i31;
                                    i19 = i35;
                                    unsafe = unsafe2;
                                    i24 = i27;
                                    i22 = i30;
                                    i23 = i12;
                                    i21 = i33;
                                    i15 = i32;
                                }
                                break;
                            case 12:
                                bArr3 = bArr;
                                i34 = i45;
                                i30 = i42;
                                i31 = i28;
                                i32 = i47;
                                i33 = iU2;
                                if (i43 == 0) {
                                    iG = c.I(bArr3, i34, bVar2);
                                    int i53 = bVar2.f47182a;
                                    Internal.EnumVerifier enumVerifierN = d0Var2.n(i33);
                                    if (enumVerifierN == null || enumVerifierN.isInRange(i53)) {
                                        unsafe2.putInt(t10, j10, i53);
                                        i39 = i27 | i50;
                                        i40 = i31;
                                        i37 = i33;
                                        bArr = bArr3;
                                        i38 = i32;
                                        i36 = i30;
                                    } else {
                                        q(t10).e(i32, Long.valueOf(i53));
                                        i40 = i31;
                                        i37 = i33;
                                        i39 = i27;
                                        i38 = i32;
                                        i36 = i30;
                                        bArr = bArr3;
                                    }
                                    i12 = i12;
                                } else {
                                    i35 = i34;
                                    i20 = i31;
                                    i19 = i35;
                                    unsafe = unsafe2;
                                    i24 = i27;
                                    i22 = i30;
                                    i23 = i12;
                                    i21 = i33;
                                    i15 = i32;
                                }
                                break;
                            case 15:
                                bArr3 = bArr;
                                i34 = i45;
                                i30 = i42;
                                i31 = i28;
                                i32 = i47;
                                i33 = iU2;
                                if (i43 == 0) {
                                    iG = c.I(bArr3, i34, bVar2);
                                    unsafe2.putInt(t10, j10, CodedInputStream.decodeZigZag32(bVar2.f47182a));
                                    i39 = i27 | i50;
                                    i40 = i31;
                                    i37 = i33;
                                    bArr = bArr3;
                                    i38 = i32;
                                    i36 = i30;
                                    i12 = i12;
                                } else {
                                    i35 = i34;
                                    i20 = i31;
                                    i19 = i35;
                                    unsafe = unsafe2;
                                    i24 = i27;
                                    i22 = i30;
                                    i23 = i12;
                                    i21 = i33;
                                    i15 = i32;
                                }
                                break;
                            case 16:
                                i34 = i45;
                                i30 = i42;
                                i31 = i28;
                                i32 = i47;
                                i33 = iU2;
                                bArr3 = bArr;
                                if (i43 == 0) {
                                    iK = c.K(bArr3, i34, bVar2);
                                    unsafe2.putLong(t10, j10, CodedInputStream.decodeZigZag64(bVar2.f47183b));
                                    i39 = i27 | i50;
                                    i40 = i31;
                                    iG = iK;
                                    i37 = i33;
                                    bArr = bArr3;
                                    i38 = i32;
                                    i36 = i30;
                                    i12 = i12;
                                } else {
                                    i35 = i34;
                                    i20 = i31;
                                    i19 = i35;
                                    unsafe = unsafe2;
                                    i24 = i27;
                                    i22 = i30;
                                    i23 = i12;
                                    i21 = i33;
                                    i15 = i32;
                                }
                                break;
                            case 17:
                                if (i43 == 3) {
                                    Object objB2 = d0Var2.B(iU2, t10);
                                    int i54 = iU2;
                                    iG = c.M(objB2, d0Var2.p(iU2), bArr, i45, i11, (i42 << 3) | 4, bVar);
                                    d0Var2.V(i54, t10, objB2);
                                    i39 = i27 | i50;
                                    bArr = bArr;
                                    i40 = i28;
                                    i37 = i54;
                                    i38 = i47;
                                    i36 = i42;
                                    i11 = i11;
                                } else {
                                    i34 = i45;
                                    i30 = i42;
                                    i31 = i28;
                                    i32 = i47;
                                    i33 = iU2;
                                    i35 = i34;
                                    i20 = i31;
                                    i19 = i35;
                                    unsafe = unsafe2;
                                    i24 = i27;
                                    i22 = i30;
                                    i23 = i12;
                                    i21 = i33;
                                    i15 = i32;
                                }
                                break;
                            default:
                                i35 = i45;
                                i30 = i42;
                                i31 = i28;
                                i32 = i47;
                                i33 = iU2;
                                i20 = i31;
                                i19 = i35;
                                unsafe = unsafe2;
                                i24 = i27;
                                i22 = i30;
                                i23 = i12;
                                i21 = i33;
                                i15 = i32;
                                break;
                        }
                    } else {
                        int i55 = iU2;
                        if (iX != 27) {
                            i24 = i39;
                            i20 = i40;
                            if (iX <= 49) {
                                i22 = i42;
                                i21 = i55;
                                unsafe = unsafe2;
                                i26 = i47;
                                iG = M(t10, bArr, i45, i11, i47, i42, i43, i55, i48, iX, j10, bVar);
                                if (iG != i45) {
                                    d0Var2 = this;
                                    i38 = i26;
                                    i12 = i12;
                                    bVar2 = bVar;
                                    i36 = i22;
                                    i37 = i21;
                                    i39 = i24;
                                    i40 = i20;
                                } else {
                                    i15 = i26;
                                    i19 = iG;
                                    i23 = i12;
                                }
                                unsafe2 = unsafe;
                            } else {
                                unsafe = unsafe2;
                                i25 = i45;
                                i26 = i47;
                                i22 = i42;
                                i21 = i55;
                                if (iX != 50) {
                                    iG = J(t10, bArr, i25, i11, i26, i22, i43, i48, iX, j10, i21, bVar);
                                    if (iG != i25) {
                                        d0Var2 = this;
                                        i38 = i26;
                                        i12 = i12;
                                        bVar2 = bVar;
                                        i36 = i22;
                                        i37 = i21;
                                        i39 = i24;
                                        i40 = i20;
                                    } else {
                                        i15 = i26;
                                        i19 = iG;
                                        i23 = i12;
                                    }
                                    unsafe2 = unsafe;
                                } else if (i43 == 2) {
                                    iG = I(t10, bArr, i25, i11, i21, j10, bVar);
                                    if (iG != i25) {
                                        d0Var2 = this;
                                        i38 = i26;
                                        i12 = i12;
                                        bVar2 = bVar;
                                        i36 = i22;
                                        i37 = i21;
                                        i39 = i24;
                                        i40 = i20;
                                    } else {
                                        i15 = i26;
                                        i19 = iG;
                                        i23 = i12;
                                    }
                                    unsafe2 = unsafe;
                                }
                            }
                        } else if (i43 == 2) {
                            Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe2.getObject(t10, j10);
                            if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
                                int size = protobufListMutableCopyWithCapacity2.size();
                                protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(t10, j10, protobufListMutableCopyWithCapacity2);
                            }
                            iG = c.q(d0Var2.p(i55), i47, bArr, i45, i11, protobufListMutableCopyWithCapacity2, bVar);
                            bArr = bArr;
                            i37 = i55;
                            i38 = i47;
                            i36 = i42;
                            i39 = i39;
                            i40 = i40;
                            i11 = i11;
                        } else {
                            i24 = i39;
                            i20 = i40;
                            unsafe = unsafe2;
                            i25 = i45;
                            i26 = i47;
                            i22 = i42;
                            i21 = i55;
                        }
                        i15 = i26;
                        i23 = i12;
                        i19 = i25;
                    }
                }
                if (i15 != i23 || i23 == 0) {
                    int i56 = i23;
                    iG = (!this.f47197f || bVar.f47185d == ExtensionRegistryLite.getEmptyRegistry()) ? c.G(i15, bArr, i19, i11, q(t10), bVar) : c.g(i15, bArr, i19, i11, t10, this.f47196e, this.f47205o, bVar);
                    i38 = i15;
                    d0Var2 = this;
                    bVar2 = bVar;
                    i36 = i22;
                    i37 = i21;
                    i39 = i24;
                    i40 = i20;
                    i12 = i56;
                    unsafe2 = unsafe;
                } else {
                    d0Var = this;
                    i13 = i23;
                    i14 = i19;
                    i39 = i24;
                    i40 = i20;
                }
            } else {
                unsafe = unsafe2;
                i13 = i12;
                d0Var = d0Var2;
                i14 = iG;
                i15 = i38;
            }
        }
        if (i40 != 1048575) {
            t11 = t10;
            unsafe.putInt(t11, i40, i39);
        } else {
            t11 = t10;
        }
        UnknownFieldSetLite unknownFieldSetLite = null;
        for (int i57 = d0Var.f47202k; i57 < d0Var.f47203l; i57++) {
            unknownFieldSetLite = (UnknownFieldSetLite) m(t10, d0Var.f47201j[i57], unknownFieldSetLite, d0Var.f47205o, t10);
        }
        if (unknownFieldSetLite != null) {
            d0Var.f47205o.n(t11, unknownFieldSetLite);
        }
        if (i13 == 0) {
            if (i14 != i11) {
                throw InvalidProtocolBufferException.g();
            }
        } else if (i14 > i11 || i15 != i13) {
            throw InvalidProtocolBufferException.g();
        }
        return i14;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0275 A[PHI: r0 r18 r19 r26 r27 r28
      0x0275: PHI (r0v16 int) = (r0v11 int), (r0v14 int), (r0v18 int) binds: [B:118:0x02e1, B:114:0x02c1, B:104:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r18v4 int) = (r18v2 int), (r18v2 int), (r18v5 int) binds: [B:118:0x02e1, B:114:0x02c1, B:104:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r19v4 int) = (r19v2 int), (r19v2 int), (r19v5 int) binds: [B:118:0x02e1, B:114:0x02c1, B:104:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r26v5 int) = (r26v3 int), (r26v3 int), (r26v6 int) binds: [B:118:0x02e1, B:114:0x02c1, B:104:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r27v2 int) = (r27v0 int), (r27v0 int), (r27v3 int) binds: [B:118:0x02e1, B:114:0x02c1, B:104:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x0275: PHI (r28v6 sun.misc.Unsafe) = (r28v4 sun.misc.Unsafe), (r28v4 sun.misc.Unsafe), (r28v7 sun.misc.Unsafe) binds: [B:118:0x02e1, B:114:0x02c1, B:104:0x0273] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:107:0x028d A[PHI: r0 r18 r19 r26 r27 r28
      0x028d: PHI (r0v15 int) = (r0v11 int), (r0v14 int), (r0v18 int) binds: [B:118:0x02e1, B:114:0x02c1, B:104:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x028d: PHI (r18v3 int) = (r18v2 int), (r18v2 int), (r18v5 int) binds: [B:118:0x02e1, B:114:0x02c1, B:104:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x028d: PHI (r19v3 int) = (r19v2 int), (r19v2 int), (r19v5 int) binds: [B:118:0x02e1, B:114:0x02c1, B:104:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x028d: PHI (r26v4 int) = (r26v3 int), (r26v3 int), (r26v6 int) binds: [B:118:0x02e1, B:114:0x02c1, B:104:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x028d: PHI (r27v1 int) = (r27v0 int), (r27v0 int), (r27v3 int) binds: [B:118:0x02e1, B:114:0x02c1, B:104:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x028d: PHI (r28v5 sun.misc.Unsafe) = (r28v4 sun.misc.Unsafe), (r28v4 sun.misc.Unsafe), (r28v7 sun.misc.Unsafe) binds: [B:118:0x02e1, B:114:0x02c1, B:104:0x0273] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x00a2. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.lang.Object] */
    public final void L(Object obj, byte[] bArr, int i10, int i11, c.b bVar) throws IOException {
        int i12;
        int iH;
        int iU;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Unsafe unsafe;
        int i18;
        int i19;
        int i20;
        int i21;
        int iK;
        int i22;
        this = this;
        obj = obj;
        bArr = bArr;
        i11 = i11;
        bVar = bVar;
        k(obj);
        Unsafe unsafe2 = f47191s;
        int i23 = 0;
        int iG = i10;
        int i24 = 0;
        int i25 = 0;
        int i26 = -1;
        int i27 = 1048575;
        while (iG < i11) {
            int i28 = iG + 1;
            byte b10 = bArr[iG];
            if (b10 < 0) {
                iH = c.H(b10, bArr, i28, bVar);
                i12 = bVar.f47182a;
            } else {
                i12 = b10;
                iH = i28;
            }
            int i29 = i12 >>> 3;
            int i30 = i12 & 7;
            int i31 = this.f47195d;
            int i32 = this.f47194c;
            if (i29 > i26) {
                int i33 = i24 / 3;
                if (i29 < i32 || i29 > i31) {
                    iU = -1;
                } else {
                    iU = this.U(i29, i33);
                }
            } else if (i29 < i32 || i29 > i31) {
                iU = -1;
            } else {
                iU = this.U(i29, i23);
            }
            i24 = iU;
            if (i24 == -1) {
                i13 = i29;
                i14 = iH;
                i15 = i25;
                i16 = i23;
                i17 = i16;
                unsafe = unsafe2;
            } else {
                int[] iArr = this.f47192a;
                int i34 = iArr[i24 + 1];
                int iX = X(i34);
                long j10 = i34 & 1048575;
                if (iX <= 17) {
                    int i35 = iArr[i24 + 2];
                    int i36 = 1 << (i35 >>> 20);
                    int i37 = i35 & 1048575;
                    if (i37 != i27) {
                        if (i27 != 1048575) {
                            unsafe2.putInt((Object) obj, i27, i25);
                            i22 = i37;
                        } else {
                            i22 = i37;
                        }
                        if (i22 != 1048575) {
                            i25 = unsafe2.getInt((Object) obj, i22);
                        }
                        i20 = i22;
                    } else {
                        i20 = i27;
                    }
                    int i38 = i25;
                    switch (iX) {
                        case 0:
                            i13 = i29;
                            i21 = iH;
                            if (i30 != 1) {
                                i15 = i38;
                                unsafe = unsafe2;
                                i17 = i24;
                                i14 = i21;
                                i27 = i20;
                                i16 = 0;
                            } else {
                                x0.u((Object) obj, j10, c.d(i21, bArr));
                                iG = i21 + 8;
                                i25 = i38 | i36;
                                i27 = i20;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 1:
                            i13 = i29;
                            i21 = iH;
                            if (i30 != 5) {
                                i15 = i38;
                                unsafe = unsafe2;
                                i17 = i24;
                                i14 = i21;
                                i27 = i20;
                                i16 = 0;
                            } else {
                                x0.v((Object) obj, j10, c.l(i21, bArr));
                                iG = i21 + 4;
                                i25 = i38 | i36;
                                i27 = i20;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 2:
                        case 3:
                            i13 = i29;
                            i21 = iH;
                            if (i30 != 0) {
                                i15 = i38;
                                unsafe = unsafe2;
                                i17 = i24;
                                i14 = i21;
                                i27 = i20;
                                i16 = 0;
                            } else {
                                iK = c.K(bArr, i21, bVar);
                                unsafe2.putLong((Object) obj, j10, bVar.f47183b);
                                i25 = i38 | i36;
                                i24 = i24;
                                iG = iK;
                                i27 = i20;
                                i26 = i13;
                                i23 = 0;
                                i11 = i11;
                            }
                            break;
                        case 4:
                        case 11:
                            i13 = i29;
                            i21 = iH;
                            if (i30 != 0) {
                                i15 = i38;
                                unsafe = unsafe2;
                                i17 = i24;
                                i14 = i21;
                                i27 = i20;
                                i16 = 0;
                            } else {
                                iG = c.I(bArr, i21, bVar);
                                unsafe2.putInt((Object) obj, j10, bVar.f47182a);
                                i25 = i38 | i36;
                                i27 = i20;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 5:
                        case 14:
                            i13 = i29;
                            if (i30 != 1) {
                                i21 = iH;
                                i15 = i38;
                                unsafe = unsafe2;
                                i17 = i24;
                                i14 = i21;
                                i27 = i20;
                                i16 = 0;
                            } else {
                                i21 = iH;
                                unsafe2.putLong((Object) obj, j10, c.j(iH, bArr));
                                iG = i21 + 8;
                                i25 = i38 | i36;
                                i27 = i20;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 6:
                        case 13:
                            i13 = i29;
                            if (i30 != 5) {
                                i21 = iH;
                                i15 = i38;
                                unsafe = unsafe2;
                                i17 = i24;
                                i14 = i21;
                                i27 = i20;
                                i16 = 0;
                            } else {
                                unsafe2.putInt((Object) obj, j10, c.h(iH, bArr));
                                iG = iH + 4;
                                i25 = i38 | i36;
                                i27 = i20;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 7:
                            i13 = i29;
                            if (i30 != 0) {
                                i21 = iH;
                                i15 = i38;
                                unsafe = unsafe2;
                                i17 = i24;
                                i14 = i21;
                                i27 = i20;
                                i16 = 0;
                            } else {
                                iG = c.K(bArr, iH, bVar);
                                x0.p((Object) obj, j10, bVar.f47183b != 0);
                                i25 = i38 | i36;
                                i27 = i20;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 8:
                            i13 = i29;
                            if (i30 != 2) {
                                i21 = iH;
                                i15 = i38;
                                unsafe = unsafe2;
                                i17 = i24;
                                i14 = i21;
                                i27 = i20;
                                i16 = 0;
                            } else {
                                iG = (i34 & PKIFailureInfo.duplicateCertReq) == 0 ? c.C(bArr, iH, bVar) : c.F(bArr, iH, bVar);
                                unsafe2.putObject((Object) obj, j10, bVar.f47184c);
                                i25 = i38 | i36;
                                i27 = i20;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 9:
                            i13 = i29;
                            if (i30 != 2) {
                                i21 = iH;
                                i15 = i38;
                                unsafe = unsafe2;
                                i17 = i24;
                                i14 = i21;
                                i27 = i20;
                                i16 = 0;
                            } else {
                                Object objB = this.B(i24, (Object) obj);
                                iG = c.N(objB, this.p(i24), bArr, iH, i11, bVar);
                                this.V(i24, (Object) obj, objB);
                                i25 = i38 | i36;
                                i27 = i20;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 10:
                            i13 = i29;
                            if (i30 != 2) {
                                i21 = iH;
                                i15 = i38;
                                unsafe = unsafe2;
                                i17 = i24;
                                i14 = i21;
                                i27 = i20;
                                i16 = 0;
                            } else {
                                iG = c.b(bArr, iH, bVar);
                                unsafe2.putObject((Object) obj, j10, bVar.f47184c);
                                i25 = i38 | i36;
                                i27 = i20;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 12:
                            i13 = i29;
                            if (i30 != 0) {
                                i21 = iH;
                                i15 = i38;
                                unsafe = unsafe2;
                                i17 = i24;
                                i14 = i21;
                                i27 = i20;
                                i16 = 0;
                            } else {
                                iG = c.I(bArr, iH, bVar);
                                unsafe2.putInt((Object) obj, j10, bVar.f47182a);
                                i25 = i38 | i36;
                                i27 = i20;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 15:
                            i13 = i29;
                            if (i30 != 0) {
                                i21 = iH;
                                i15 = i38;
                                unsafe = unsafe2;
                                i17 = i24;
                                i14 = i21;
                                i27 = i20;
                                i16 = 0;
                            } else {
                                iG = c.I(bArr, iH, bVar);
                                unsafe2.putInt((Object) obj, j10, CodedInputStream.decodeZigZag32(bVar.f47182a));
                                i25 = i38 | i36;
                                i27 = i20;
                                i26 = i13;
                                i23 = 0;
                            }
                            break;
                        case 16:
                            if (i30 != 0) {
                                i13 = i29;
                                i21 = iH;
                                i15 = i38;
                                unsafe = unsafe2;
                                i17 = i24;
                                i14 = i21;
                                i27 = i20;
                                i16 = 0;
                            } else {
                                iK = c.K(bArr, iH, bVar);
                                i13 = i29;
                                unsafe2.putLong((Object) obj, j10, CodedInputStream.decodeZigZag64(bVar.f47183b));
                                i25 = i38 | i36;
                                i24 = i24;
                                iG = iK;
                                i27 = i20;
                                i26 = i13;
                                i23 = 0;
                                i11 = i11;
                            }
                            break;
                        default:
                            i13 = i29;
                            i21 = iH;
                            i15 = i38;
                            unsafe = unsafe2;
                            i17 = i24;
                            i14 = i21;
                            i27 = i20;
                            i16 = 0;
                            break;
                    }
                } else {
                    i13 = i29;
                    if (iX != 27) {
                        if (iX <= 49) {
                            int i39 = iH;
                            i15 = i25;
                            i19 = i27;
                            i16 = 0;
                            unsafe = unsafe2;
                            i17 = i24;
                            iG = M(obj, bArr, iH, i11, i12, i13, i30, i24, i34, iX, j10, bVar);
                            if (iG != i39) {
                                i23 = i16;
                                i24 = i17;
                                i26 = i13;
                                i25 = i15;
                                i27 = i19;
                            } else {
                                i14 = iG;
                                i27 = i19;
                            }
                        } else {
                            i18 = iH;
                            i15 = i25;
                            i19 = i27;
                            unsafe = unsafe2;
                            i17 = i24;
                            i16 = 0;
                            if (iX == 50) {
                                if (i30 == 2) {
                                    iG = I(obj, bArr, i18, i11, i17, j10, bVar);
                                    if (iG != i18) {
                                        i23 = i16;
                                        i24 = i17;
                                        i26 = i13;
                                        i25 = i15;
                                        i27 = i19;
                                    } else {
                                        i14 = iG;
                                    }
                                }
                                i27 = i19;
                            } else {
                                iG = J(obj, bArr, i18, i11, i12, i13, i30, i34, iX, j10, i17, bVar);
                                if (iG != i18) {
                                    i23 = i16;
                                    i24 = i17;
                                    i26 = i13;
                                    i25 = i15;
                                    i27 = i19;
                                } else {
                                    i14 = iG;
                                    i27 = i19;
                                }
                            }
                        }
                        unsafe2 = unsafe;
                    } else if (i30 == 2) {
                        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe2.getObject((Object) obj, j10);
                        if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
                            int size = protobufListMutableCopyWithCapacity2.size();
                            protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                            unsafe2.putObject((Object) obj, j10, protobufListMutableCopyWithCapacity2);
                        }
                        iG = c.q(this.p(i24), i12, bArr, iH, i11, protobufListMutableCopyWithCapacity2, bVar);
                        i27 = i27;
                        i25 = i25;
                        i26 = i13;
                        i23 = 0;
                    } else {
                        i18 = iH;
                        i15 = i25;
                        i19 = i27;
                        unsafe = unsafe2;
                        i17 = i24;
                        i16 = 0;
                    }
                    i14 = i18;
                    i27 = i19;
                }
            }
            iG = c.G(i12, bArr, i14, i11, q(obj), bVar);
            i23 = i16;
            i24 = i17;
            i26 = i13;
            i25 = i15;
            unsafe2 = unsafe;
        }
        int i40 = i25;
        int i41 = i27;
        Unsafe unsafe3 = unsafe2;
        if (i41 != 1048575) {
            unsafe3.putInt((Object) obj, i41, i40);
        }
        if (iG != i11) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public final int M(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, c.b bVar) throws IOException {
        int iJ;
        Unsafe unsafe = f47191s;
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe.getObject(t10, j11);
        if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
            int size = protobufListMutableCopyWithCapacity2.size();
            protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t10, j11, protobufListMutableCopyWithCapacity2);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    return c.s(bArr, i10, protobufListMutableCopyWithCapacity2, bVar);
                }
                return i14 == 1 ? c.e(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 19:
            case 36:
                if (i14 == 2) {
                    return c.v(bArr, i10, protobufListMutableCopyWithCapacity2, bVar);
                }
                return i14 == 5 ? c.m(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    return c.z(bArr, i10, protobufListMutableCopyWithCapacity2, bVar);
                }
                return i14 == 0 ? c.L(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return c.y(bArr, i10, protobufListMutableCopyWithCapacity2, bVar);
                }
                return i14 == 0 ? c.J(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    return c.u(bArr, i10, protobufListMutableCopyWithCapacity2, bVar);
                }
                return i14 == 1 ? c.k(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    return c.t(bArr, i10, protobufListMutableCopyWithCapacity2, bVar);
                }
                return i14 == 5 ? c.i(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 25:
            case 42:
                if (i14 == 2) {
                    return c.r(bArr, i10, protobufListMutableCopyWithCapacity2, bVar);
                }
                return i14 == 0 ? c.a(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 26:
                if (i14 == 2) {
                    return (j10 & SvgConstantsKt.SPECIFIED_CLIP_RULE) == 0 ? c.D(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : c.E(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar);
                }
                return i10;
            case 27:
                return i14 == 2 ? c.q(p(i15), i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 28:
                return i14 == 2 ? c.c(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 30:
            case 44:
                if (i14 == 2) {
                    iJ = c.y(bArr, i10, protobufListMutableCopyWithCapacity2, bVar);
                } else {
                    if (i14 != 0) {
                        return i10;
                    }
                    iJ = c.J(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar);
                }
                r0.A(t10, i13, protobufListMutableCopyWithCapacity2, n(i15), null, this.f47205o);
                return iJ;
            case 33:
            case 47:
                if (i14 == 2) {
                    return c.w(bArr, i10, protobufListMutableCopyWithCapacity2, bVar);
                }
                return i14 == 0 ? c.A(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 34:
            case 48:
                if (i14 == 2) {
                    return c.x(bArr, i10, protobufListMutableCopyWithCapacity2, bVar);
                }
                return i14 == 0 ? c.B(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 49:
                return i14 == 3 ? c.o(p(i15), i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            default:
                return i10;
        }
    }

    public final <E> void N(Object obj, long j10, o0 o0Var, q0<E> q0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int tag;
        List listC = this.f47204n.c(j10, obj);
        e eVar = (e) o0Var;
        if (WireFormat.getTagWireType(eVar.f47210b) != 3) {
            throw InvalidProtocolBufferException.d();
        }
        int i10 = eVar.f47210b;
        do {
            E eNewInstance = q0Var.newInstance();
            eVar.b(eNewInstance, q0Var, extensionRegistryLite);
            q0Var.b(eNewInstance);
            listC.add(eNewInstance);
            CodedInputStream codedInputStream = eVar.f47209a;
            if (codedInputStream.isAtEnd() || eVar.f47212d != 0) {
                return;
            } else {
                tag = codedInputStream.readTag();
            }
        } while (tag == i10);
        eVar.f47212d = tag;
    }

    public final <E> void O(Object obj, int i10, o0 o0Var, q0<E> q0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int tag;
        List listC = this.f47204n.c(i10 & 1048575, obj);
        e eVar = (e) o0Var;
        if (WireFormat.getTagWireType(eVar.f47210b) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int i11 = eVar.f47210b;
        do {
            E eNewInstance = q0Var.newInstance();
            eVar.c(eNewInstance, q0Var, extensionRegistryLite);
            q0Var.b(eNewInstance);
            listC.add(eNewInstance);
            CodedInputStream codedInputStream = eVar.f47209a;
            if (codedInputStream.isAtEnd() || eVar.f47212d != 0) {
                return;
            } else {
                tag = codedInputStream.readTag();
            }
        } while (tag == i11);
        eVar.f47212d = tag;
    }

    public final void P(Object obj, int i10, o0 o0Var) throws IOException {
        if ((536870912 & i10) != 0) {
            e eVar = (e) o0Var;
            eVar.x(2);
            x0.y(i10 & 1048575, obj, eVar.f47209a.readStringRequireUtf8());
        } else {
            if (!this.f47198g) {
                x0.y(i10 & 1048575, obj, ((e) o0Var).e());
                return;
            }
            e eVar2 = (e) o0Var;
            eVar2.x(2);
            x0.y(i10 & 1048575, obj, eVar2.f47209a.readString());
        }
    }

    public final void Q(Object obj, int i10, o0 o0Var) throws IOException {
        boolean z10 = (536870912 & i10) != 0;
        u uVar = this.f47204n;
        if (z10) {
            ((e) o0Var).t(uVar.c(i10 & 1048575, obj), true);
        } else {
            ((e) o0Var).t(uVar.c(i10 & 1048575, obj), false);
        }
    }

    public final void S(int i10, Object obj) {
        int i11 = this.f47192a[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        x0.w((1 << (i11 >>> 20)) | x0.f47308c.j(j10, obj), j10, obj);
    }

    public final void T(int i10, int i11, Object obj) {
        x0.w(i10, this.f47192a[i11 + 2] & 1048575, obj);
    }

    public final int U(int i10, int i11) {
        int[] iArr = this.f47192a;
        int length = (iArr.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = iArr[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    public final void V(int i10, Object obj, Object obj2) {
        f47191s.putObject(obj, Y(i10) & 1048575, obj2);
        S(i10, obj);
    }

    public final void W(int i10, Object obj, int i11, Object obj2) {
        f47191s.putObject(obj, Y(i11) & 1048575, obj2);
        T(i10, i11, obj);
    }

    public final int Y(int i10) {
        return this.f47192a[i10 + 1];
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final void Z(Object obj, f fVar) throws IOException {
        Iterator itM;
        Map.Entry<?, ?> entry;
        int i10;
        int i11;
        boolean z10 = this.f47197f;
        i<?> iVar = this.f47206p;
        if (z10) {
            FieldSet<T> fieldSetC = iVar.c(obj);
            if (fieldSetC.j()) {
                itM = null;
                entry = null;
            } else {
                itM = fieldSetC.m();
                entry = (Map.Entry) itM.next();
            }
        } else {
            itM = null;
            entry = null;
        }
        int[] iArr = this.f47192a;
        int length = iArr.length;
        int i12 = 0;
        int i13 = 1048575;
        int i14 = 0;
        while (i12 < length) {
            int iY = Y(i12);
            int i15 = iArr[i12];
            int iX = X(iY);
            Unsafe unsafe = f47191s;
            if (iX <= 17) {
                int i16 = iArr[i12 + 2];
                Map.Entry<?, ?> entry2 = entry;
                int i17 = i16 & 1048575;
                if (i17 != i13) {
                    i14 = unsafe.getInt(obj, i17);
                    i13 = i17;
                }
                i10 = 1 << (i16 >>> 20);
                entry = entry2;
            } else {
                i10 = 0;
            }
            while (true) {
                i11 = length;
                if (entry != null && iVar.a(entry) <= i15) {
                    iVar.j(fVar, entry);
                    entry = itM.hasNext() ? (Map.Entry) itM.next() : null;
                    length = i11;
                }
            }
            long j10 = iY & 1048575;
            switch (iX) {
                case 0:
                    if ((i14 & i10) != 0) {
                        fVar.c(i15, x0.f47308c.h(j10, obj));
                        continue;
                    }
                    i12 += 3;
                    length = i11;
                    break;
                case 1:
                    if ((i14 & i10) != 0) {
                        fVar.g(i15, x0.f47308c.i(j10, obj));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    length = i11;
                    break;
                case 2:
                    if ((i10 & i14) != 0) {
                        fVar.j(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    length = i11;
                    break;
                case 3:
                    if ((i10 & i14) != 0) {
                        fVar.r(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    length = i11;
                    break;
                case 4:
                    if ((i10 & i14) != 0) {
                        fVar.i(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    length = i11;
                    break;
                case 5:
                    if ((i10 & i14) != 0) {
                        fVar.f(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    length = i11;
                    break;
                case 6:
                    if ((i10 & i14) != 0) {
                        fVar.e(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    length = i11;
                    break;
                case 7:
                    if ((i14 & i10) != 0) {
                        fVar.a(i15, x0.f47308c.e(j10, obj));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    length = i11;
                    break;
                case 8:
                    if ((i10 & i14) != 0) {
                        b0(i15, unsafe.getObject(obj, j10), fVar);
                    } else {
                        continue;
                    }
                    i12 += 3;
                    length = i11;
                    break;
                case 9:
                    if ((i10 & i14) != 0) {
                        fVar.k(i15, p(i12), unsafe.getObject(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    length = i11;
                    break;
                case 10:
                    if ((i10 & i14) != 0) {
                        fVar.b(i15, (ByteString) unsafe.getObject(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    length = i11;
                    break;
                case 11:
                    if ((i10 & i14) != 0) {
                        fVar.q(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    length = i11;
                    break;
                case 12:
                    if ((i10 & i14) != 0) {
                        fVar.d(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    length = i11;
                    break;
                case 13:
                    if ((i10 & i14) != 0) {
                        fVar.m(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    length = i11;
                    break;
                case 14:
                    if ((i10 & i14) != 0) {
                        fVar.n(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    length = i11;
                    break;
                case 15:
                    if ((i10 & i14) != 0) {
                        fVar.o(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    length = i11;
                    break;
                case 16:
                    if ((i10 & i14) != 0) {
                        fVar.p(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    length = i11;
                    break;
                case 17:
                    if ((i10 & i14) != 0) {
                        fVar.h(i15, p(i12), unsafe.getObject(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    length = i11;
                    break;
                case 18:
                    r0.G(iArr[i12], (List) unsafe.getObject(obj, j10), fVar, false);
                    continue;
                    i12 += 3;
                    length = i11;
                    break;
                case 19:
                    r0.K(iArr[i12], (List) unsafe.getObject(obj, j10), fVar, false);
                    continue;
                    i12 += 3;
                    length = i11;
                    break;
                case 20:
                    r0.N(iArr[i12], (List) unsafe.getObject(obj, j10), fVar, false);
                    continue;
                    i12 += 3;
                    length = i11;
                    break;
                case 21:
                    r0.V(iArr[i12], (List) unsafe.getObject(obj, j10), fVar, false);
                    continue;
                    i12 += 3;
                    length = i11;
                    break;
                case 22:
                    r0.M(iArr[i12], (List) unsafe.getObject(obj, j10), fVar, false);
                    continue;
                    i12 += 3;
                    length = i11;
                    break;
                case 23:
                    r0.J(iArr[i12], (List) unsafe.getObject(obj, j10), fVar, false);
                    continue;
                    i12 += 3;
                    length = i11;
                    break;
                case 24:
                    r0.I(iArr[i12], (List) unsafe.getObject(obj, j10), fVar, false);
                    continue;
                    i12 += 3;
                    length = i11;
                    break;
                case 25:
                    r0.E(iArr[i12], (List) unsafe.getObject(obj, j10), fVar, false);
                    continue;
                    i12 += 3;
                    length = i11;
                    break;
                case 26:
                    r0.T(iArr[i12], (List) unsafe.getObject(obj, j10), fVar);
                    break;
                case 27:
                    r0.O(iArr[i12], (List) unsafe.getObject(obj, j10), fVar, p(i12));
                    break;
                case 28:
                    r0.F(iArr[i12], (List) unsafe.getObject(obj, j10), fVar);
                    break;
                case 29:
                    r0.U(iArr[i12], (List) unsafe.getObject(obj, j10), fVar, false);
                    continue;
                    i12 += 3;
                    length = i11;
                    break;
                case 30:
                    r0.H(iArr[i12], (List) unsafe.getObject(obj, j10), fVar, false);
                    continue;
                    i12 += 3;
                    length = i11;
                    break;
                case 31:
                    r0.P(iArr[i12], (List) unsafe.getObject(obj, j10), fVar, false);
                    continue;
                    i12 += 3;
                    length = i11;
                    break;
                case 32:
                    r0.Q(iArr[i12], (List) unsafe.getObject(obj, j10), fVar, false);
                    continue;
                    i12 += 3;
                    length = i11;
                    break;
                case 33:
                    r0.R(iArr[i12], (List) unsafe.getObject(obj, j10), fVar, false);
                    continue;
                    i12 += 3;
                    length = i11;
                    break;
                case 34:
                    r0.S(iArr[i12], (List) unsafe.getObject(obj, j10), fVar, false);
                    continue;
                    i12 += 3;
                    length = i11;
                    break;
                case 35:
                    r0.G(iArr[i12], (List) unsafe.getObject(obj, j10), fVar, true);
                    break;
                case 36:
                    r0.K(iArr[i12], (List) unsafe.getObject(obj, j10), fVar, true);
                    break;
                case 37:
                    r0.N(iArr[i12], (List) unsafe.getObject(obj, j10), fVar, true);
                    break;
                case 38:
                    r0.V(iArr[i12], (List) unsafe.getObject(obj, j10), fVar, true);
                    break;
                case 39:
                    r0.M(iArr[i12], (List) unsafe.getObject(obj, j10), fVar, true);
                    break;
                case 40:
                    r0.J(iArr[i12], (List) unsafe.getObject(obj, j10), fVar, true);
                    break;
                case 41:
                    r0.I(iArr[i12], (List) unsafe.getObject(obj, j10), fVar, true);
                    break;
                case 42:
                    r0.E(iArr[i12], (List) unsafe.getObject(obj, j10), fVar, true);
                    break;
                case 43:
                    r0.U(iArr[i12], (List) unsafe.getObject(obj, j10), fVar, true);
                    break;
                case 44:
                    r0.H(iArr[i12], (List) unsafe.getObject(obj, j10), fVar, true);
                    break;
                case 45:
                    r0.P(iArr[i12], (List) unsafe.getObject(obj, j10), fVar, true);
                    break;
                case 46:
                    r0.Q(iArr[i12], (List) unsafe.getObject(obj, j10), fVar, true);
                    break;
                case 47:
                    r0.R(iArr[i12], (List) unsafe.getObject(obj, j10), fVar, true);
                    break;
                case 48:
                    r0.S(iArr[i12], (List) unsafe.getObject(obj, j10), fVar, true);
                    break;
                case 49:
                    r0.L(iArr[i12], (List) unsafe.getObject(obj, j10), fVar, p(i12));
                    break;
                case 50:
                    a0(fVar, i15, unsafe.getObject(obj, j10), i12);
                    break;
                case 51:
                    if (v(i15, i12, obj)) {
                        fVar.c(i15, ((Double) x0.f47308c.m(j10, obj)).doubleValue());
                    }
                    break;
                case 52:
                    if (v(i15, i12, obj)) {
                        fVar.g(i15, ((Float) x0.f47308c.m(j10, obj)).floatValue());
                    }
                    break;
                case 53:
                    if (v(i15, i12, obj)) {
                        fVar.j(i15, H(j10, obj));
                    }
                    break;
                case 54:
                    if (v(i15, i12, obj)) {
                        fVar.r(i15, H(j10, obj));
                    }
                    break;
                case 55:
                    if (v(i15, i12, obj)) {
                        fVar.i(i15, G(j10, obj));
                    }
                    break;
                case 56:
                    if (v(i15, i12, obj)) {
                        fVar.f(i15, H(j10, obj));
                    }
                    break;
                case 57:
                    if (v(i15, i12, obj)) {
                        fVar.e(i15, G(j10, obj));
                    }
                    break;
                case 58:
                    if (v(i15, i12, obj)) {
                        fVar.a(i15, ((Boolean) x0.f47308c.m(j10, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (v(i15, i12, obj)) {
                        b0(i15, unsafe.getObject(obj, j10), fVar);
                    }
                    break;
                case 60:
                    if (v(i15, i12, obj)) {
                        fVar.k(i15, p(i12), unsafe.getObject(obj, j10));
                    }
                    break;
                case 61:
                    if (v(i15, i12, obj)) {
                        fVar.b(i15, (ByteString) unsafe.getObject(obj, j10));
                    }
                    break;
                case 62:
                    if (v(i15, i12, obj)) {
                        fVar.q(i15, G(j10, obj));
                    }
                    break;
                case 63:
                    if (v(i15, i12, obj)) {
                        fVar.d(i15, G(j10, obj));
                    }
                    break;
                case 64:
                    if (v(i15, i12, obj)) {
                        fVar.m(i15, G(j10, obj));
                    }
                    break;
                case 65:
                    if (v(i15, i12, obj)) {
                        fVar.n(i15, H(j10, obj));
                    }
                    break;
                case 66:
                    if (v(i15, i12, obj)) {
                        fVar.o(i15, G(j10, obj));
                    }
                    break;
                case 67:
                    if (v(i15, i12, obj)) {
                        fVar.p(i15, H(j10, obj));
                    }
                    break;
                case 68:
                    if (v(i15, i12, obj)) {
                        fVar.h(i15, p(i12), unsafe.getObject(obj, j10));
                    }
                    break;
            }
            i12 += 3;
            length = i11;
        }
        while (entry != null) {
            iVar.j(fVar, entry);
            entry = itM.hasNext() ? (Map.Entry) itM.next() : null;
        }
        v0<?, ?> v0Var = this.f47205o;
        v0Var.s(v0Var.g(obj), fVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public final void a(T t10, T t11) {
        k(t10);
        t11.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f47192a;
            if (i10 >= iArr.length) {
                Class<?> cls = r0.f47264a;
                v0<?, ?> v0Var = this.f47205o;
                v0Var.o(t10, v0Var.k(v0Var.g(t10), v0Var.g(t11)));
                if (this.f47197f) {
                    i<?> iVar = this.f47206p;
                    FieldSet<T> fieldSetC = iVar.c(t11);
                    if (fieldSetC.f47078a.isEmpty()) {
                        return;
                    }
                    iVar.d(t10).o(fieldSetC);
                    return;
                }
                return;
            }
            int iY = Y(i10);
            long j10 = 1048575 & iY;
            int i11 = iArr[i10];
            switch (X(iY)) {
                case 0:
                    if (t(i10, t11)) {
                        x0.u(t10, j10, x0.f47308c.h(j10, t11));
                        S(i10, t10);
                    }
                    break;
                case 1:
                    if (t(i10, t11)) {
                        x0.v(t10, j10, x0.f47308c.i(j10, t11));
                        S(i10, t10);
                    }
                    break;
                case 2:
                    if (t(i10, t11)) {
                        x0.x(t10, j10, x0.f47308c.l(j10, t11));
                        S(i10, t10);
                    }
                    break;
                case 3:
                    if (t(i10, t11)) {
                        x0.x(t10, j10, x0.f47308c.l(j10, t11));
                        S(i10, t10);
                    }
                    break;
                case 4:
                    if (t(i10, t11)) {
                        x0.w(x0.f47308c.j(j10, t11), j10, t10);
                        S(i10, t10);
                    }
                    break;
                case 5:
                    if (t(i10, t11)) {
                        x0.x(t10, j10, x0.f47308c.l(j10, t11));
                        S(i10, t10);
                    }
                    break;
                case 6:
                    if (t(i10, t11)) {
                        x0.w(x0.f47308c.j(j10, t11), j10, t10);
                        S(i10, t10);
                    }
                    break;
                case 7:
                    if (t(i10, t11)) {
                        x0.p(t10, j10, x0.f47308c.e(j10, t11));
                        S(i10, t10);
                    }
                    break;
                case 8:
                    if (t(i10, t11)) {
                        x0.y(j10, t10, x0.f47308c.m(j10, t11));
                        S(i10, t10);
                    }
                    break;
                case 9:
                    z(i10, t10, t11);
                    break;
                case 10:
                    if (t(i10, t11)) {
                        x0.y(j10, t10, x0.f47308c.m(j10, t11));
                        S(i10, t10);
                    }
                    break;
                case 11:
                    if (t(i10, t11)) {
                        x0.w(x0.f47308c.j(j10, t11), j10, t10);
                        S(i10, t10);
                    }
                    break;
                case 12:
                    if (t(i10, t11)) {
                        x0.w(x0.f47308c.j(j10, t11), j10, t10);
                        S(i10, t10);
                    }
                    break;
                case 13:
                    if (t(i10, t11)) {
                        x0.w(x0.f47308c.j(j10, t11), j10, t10);
                        S(i10, t10);
                    }
                    break;
                case 14:
                    if (t(i10, t11)) {
                        x0.x(t10, j10, x0.f47308c.l(j10, t11));
                        S(i10, t10);
                    }
                    break;
                case 15:
                    if (t(i10, t11)) {
                        x0.w(x0.f47308c.j(j10, t11), j10, t10);
                        S(i10, t10);
                    }
                    break;
                case 16:
                    if (t(i10, t11)) {
                        x0.x(t10, j10, x0.f47308c.l(j10, t11));
                        S(i10, t10);
                    }
                    break;
                case 17:
                    z(i10, t10, t11);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f47204n.b(j10, t10, t11);
                    break;
                case 50:
                    Class<?> cls2 = r0.f47264a;
                    x0.e eVar = x0.f47308c;
                    x0.y(j10, t10, this.f47207q.a(eVar.m(j10, t10), eVar.m(j10, t11)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (v(i11, i10, t11)) {
                        x0.y(j10, t10, x0.f47308c.m(j10, t11));
                        T(i11, i10, t10);
                    }
                    break;
                case 60:
                    A(i10, t10, t11);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (v(i11, i10, t11)) {
                        x0.y(j10, t10, x0.f47308c.m(j10, t11));
                        T(i11, i10, t10);
                    }
                    break;
                case 68:
                    A(i10, t10, t11);
                    break;
            }
            i10 += 3;
        }
    }

    public final void a0(f fVar, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            Object objO = o(i11);
            x xVar = this.f47207q;
            MapEntryLite.b<?, ?> bVarB = xVar.b(objO);
            MapFieldLite mapFieldLiteD = xVar.d(obj);
            CodedOutputStream codedOutputStream = fVar.f47218a;
            if (!codedOutputStream.f47019b) {
                Iterator it = mapFieldLiteD.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    codedOutputStream.writeTag(i10, 2);
                    codedOutputStream.writeUInt32NoTag(MapEntryLite.a(bVarB, entry.getKey(), entry.getValue()));
                    MapEntryLite.c(codedOutputStream, bVarB, entry.getKey(), entry.getValue());
                }
                return;
            }
            int i12 = 0;
            switch (f.a.f47219a[bVarB.f47136a.ordinal()]) {
                case 1:
                    Boolean bool = Boolean.FALSE;
                    V v3 = mapFieldLiteD.get(bool);
                    CodedOutputStream codedOutputStream2 = fVar.f47218a;
                    if (v3 != 0) {
                        codedOutputStream2.writeTag(i10, 2);
                        codedOutputStream2.writeUInt32NoTag(MapEntryLite.a(bVarB, bool, v3));
                        MapEntryLite.c(codedOutputStream2, bVarB, bool, v3);
                    }
                    Boolean bool2 = Boolean.TRUE;
                    V v6 = mapFieldLiteD.get(bool2);
                    if (v6 != 0) {
                        codedOutputStream2.writeTag(i10, 2);
                        codedOutputStream2.writeUInt32NoTag(MapEntryLite.a(bVarB, bool2, v6));
                        MapEntryLite.c(codedOutputStream2, bVarB, bool2, v6);
                        return;
                    }
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    int size = mapFieldLiteD.size();
                    int[] iArr = new int[size];
                    Iterator it2 = mapFieldLiteD.keySet().iterator();
                    int i13 = 0;
                    while (it2.hasNext()) {
                        iArr[i13] = ((Integer) it2.next()).intValue();
                        i13++;
                    }
                    Arrays.sort(iArr);
                    while (i12 < size) {
                        int i14 = iArr[i12];
                        V v10 = mapFieldLiteD.get(Integer.valueOf(i14));
                        codedOutputStream.writeTag(i10, 2);
                        codedOutputStream.writeUInt32NoTag(MapEntryLite.a(bVarB, Integer.valueOf(i14), v10));
                        MapEntryLite.c(codedOutputStream, bVarB, Integer.valueOf(i14), v10);
                        i12++;
                    }
                    return;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    int size2 = mapFieldLiteD.size();
                    long[] jArr = new long[size2];
                    Iterator it3 = mapFieldLiteD.keySet().iterator();
                    int i15 = 0;
                    while (it3.hasNext()) {
                        jArr[i15] = ((Long) it3.next()).longValue();
                        i15++;
                    }
                    Arrays.sort(jArr);
                    while (i12 < size2) {
                        long j10 = jArr[i12];
                        V v11 = mapFieldLiteD.get(Long.valueOf(j10));
                        codedOutputStream.writeTag(i10, 2);
                        codedOutputStream.writeUInt32NoTag(MapEntryLite.a(bVarB, Long.valueOf(j10), v11));
                        MapEntryLite.c(codedOutputStream, bVarB, Long.valueOf(j10), v11);
                        i12++;
                    }
                    return;
                case 12:
                    int size3 = mapFieldLiteD.size();
                    String[] strArr = new String[size3];
                    Iterator it4 = mapFieldLiteD.keySet().iterator();
                    int i16 = 0;
                    while (it4.hasNext()) {
                        strArr[i16] = (String) it4.next();
                        i16++;
                    }
                    Arrays.sort(strArr);
                    while (i12 < size3) {
                        String str = strArr[i12];
                        V v12 = mapFieldLiteD.get(str);
                        codedOutputStream.writeTag(i10, 2);
                        codedOutputStream.writeUInt32NoTag(MapEntryLite.a(bVarB, str, v12));
                        MapEntryLite.c(codedOutputStream, bVarB, str, v12);
                        i12++;
                    }
                    return;
                default:
                    throw new IllegalArgumentException("does not support key type: " + bVarB.f47136a);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public final void b(T t10) {
        if (u(t10)) {
            if (t10 instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t10;
                generatedMessageLite.g();
                generatedMessageLite.f();
                generatedMessageLite.k();
            }
            int length = this.f47192a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iY = Y(i10);
                long j10 = 1048575 & iY;
                int iX = X(iY);
                Unsafe unsafe = f47191s;
                if (iX != 9) {
                    switch (iX) {
                        case 17:
                            if (t(i10, t10)) {
                                p(i10).b(unsafe.getObject(t10, j10));
                            }
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.f47204n.a(j10, t10);
                            break;
                        case 50:
                            Object object = unsafe.getObject(t10, j10);
                            if (object != null) {
                                unsafe.putObject(t10, j10, this.f47207q.e(object));
                            }
                            break;
                    }
                } else if (t(i10, t10)) {
                    p(i10).b(unsafe.getObject(t10, j10));
                }
            }
            this.f47205o.j(t10);
            if (this.f47197f) {
                this.f47206p.f(t10);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f6 A[LOOP:2: B:59:0x00e5->B:64:0x00f6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x0105  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.crypto.tink.shaded.protobuf.q0] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.crypto.tink.shaded.protobuf.q0] */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.crypto.tink.shaded.protobuf.q0] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26, types: [com.google.crypto.tink.shaded.protobuf.q0] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public final boolean c(T t10) {
        List list;
        ?? P;
        int i10;
        int i11 = 1048575;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f47202k; i13++) {
            int i14 = this.f47201j[i13];
            int[] iArr = this.f47192a;
            int i15 = iArr[i14];
            int iY = Y(i14);
            int i16 = iArr[i14 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i11) {
                if (i17 != 1048575) {
                    i12 = f47191s.getInt(t10, i17);
                }
                i11 = i17;
            }
            if ((268435456 & iY) != 0) {
                if (i11 == 1048575) {
                    if (!t(i14, t10)) {
                        return false;
                    }
                } else if ((i12 & i18) == 0) {
                    return false;
                }
            }
            int iX = X(iY);
            if (iX == 9 || iX == 17) {
                if (i11 == 1048575) {
                    if (t(i14, t10)) {
                        if (!p(i14).c(x0.f47308c.m(iY & 1048575, t10))) {
                            return false;
                        }
                    } else {
                        continue;
                    }
                } else if ((i18 & i12) != 0) {
                    if (!p(i14).c(x0.f47308c.m(iY & 1048575, t10))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (iX == 27) {
                list = (List) x0.f47308c.m(iY & 1048575, t10);
                if (list.isEmpty()) {
                    continue;
                } else {
                    P = p(i14);
                    for (i10 = 0; i10 < list.size(); i10++) {
                        if (!P.c(list.get(i10))) {
                            return false;
                        }
                    }
                }
            } else if (iX == 60 || iX == 68) {
                if (v(i15, i14, t10)) {
                    if (!p(i14).c(x0.f47308c.m(iY & 1048575, t10))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (iX == 49) {
                list = (List) x0.f47308c.m(iY & 1048575, t10);
                if (list.isEmpty()) {
                    continue;
                } else {
                    P = p(i14);
                    while (i10 < list.size()) {
                        if (!P.c(list.get(i10))) {
                            return false;
                        }
                    }
                }
            } else if (iX != 50) {
                continue;
            } else {
                Object objM = x0.f47308c.m(iY & 1048575, t10);
                x xVar = this.f47207q;
                MapFieldLite mapFieldLiteD = xVar.d(objM);
                if (!mapFieldLiteD.isEmpty() && xVar.b(o(i14)).f47138c.getJavaType() == WireFormat.JavaType.MESSAGE) {
                    ?? A = 0;
                    for (Object obj : mapFieldLiteD.values()) {
                        if (A == 0) {
                            A = A;
                            A = l0.f47234c.a(obj.getClass());
                        }
                        A = A;
                        if (!A.c(obj)) {
                            return false;
                        }
                    }
                }
            }
        }
        return !this.f47197f || this.f47206p.c(t10).k();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public final int d(T t10) {
        return this.f47199h ? s(t10) : r(t10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public final int e(T t10) {
        int i10;
        int iHashLong;
        int[] iArr = this.f47192a;
        int length = iArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iY = Y(i12);
            int i13 = iArr[i12];
            long j10 = 1048575 & iY;
            int iHashCode = 37;
            switch (X(iY)) {
                case 0:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(Double.doubleToLongBits(x0.f47308c.h(j10, t10)));
                    i11 = iHashLong + i10;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iHashLong = Float.floatToIntBits(x0.f47308c.i(j10, t10));
                    i11 = iHashLong + i10;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(x0.f47308c.l(j10, t10));
                    i11 = iHashLong + i10;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(x0.f47308c.l(j10, t10));
                    i11 = iHashLong + i10;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iHashLong = x0.f47308c.j(j10, t10);
                    i11 = iHashLong + i10;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(x0.f47308c.l(j10, t10));
                    i11 = iHashLong + i10;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iHashLong = x0.f47308c.j(j10, t10);
                    i11 = iHashLong + i10;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashBoolean(x0.f47308c.e(j10, t10));
                    i11 = iHashLong + i10;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iHashLong = ((String) x0.f47308c.m(j10, t10)).hashCode();
                    i11 = iHashLong + i10;
                    break;
                case 9:
                    Object objM = x0.f47308c.m(j10, t10);
                    if (objM != null) {
                        iHashCode = objM.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iHashLong = x0.f47308c.m(j10, t10).hashCode();
                    i11 = iHashLong + i10;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iHashLong = x0.f47308c.j(j10, t10);
                    i11 = iHashLong + i10;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iHashLong = x0.f47308c.j(j10, t10);
                    i11 = iHashLong + i10;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iHashLong = x0.f47308c.j(j10, t10);
                    i11 = iHashLong + i10;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(x0.f47308c.l(j10, t10));
                    i11 = iHashLong + i10;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iHashLong = x0.f47308c.j(j10, t10);
                    i11 = iHashLong + i10;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(x0.f47308c.l(j10, t10));
                    i11 = iHashLong + i10;
                    break;
                case 17:
                    Object objM2 = x0.f47308c.m(j10, t10);
                    if (objM2 != null) {
                        iHashCode = objM2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    iHashLong = x0.f47308c.m(j10, t10).hashCode();
                    i11 = iHashLong + i10;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iHashLong = x0.f47308c.m(j10, t10).hashCode();
                    i11 = iHashLong + i10;
                    break;
                case 51:
                    if (v(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(Double.doubleToLongBits(((Double) x0.f47308c.m(j10, t10)).doubleValue()));
                        i11 = iHashLong + i10;
                    }
                    break;
                case 52:
                    if (v(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = Float.floatToIntBits(((Float) x0.f47308c.m(j10, t10)).floatValue());
                        i11 = iHashLong + i10;
                    }
                    break;
                case 53:
                    if (v(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(H(j10, t10));
                        i11 = iHashLong + i10;
                    }
                    break;
                case 54:
                    if (v(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(H(j10, t10));
                        i11 = iHashLong + i10;
                    }
                    break;
                case 55:
                    if (v(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = G(j10, t10);
                        i11 = iHashLong + i10;
                    }
                    break;
                case 56:
                    if (v(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(H(j10, t10));
                        i11 = iHashLong + i10;
                    }
                    break;
                case 57:
                    if (v(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = G(j10, t10);
                        i11 = iHashLong + i10;
                    }
                    break;
                case 58:
                    if (v(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashBoolean(((Boolean) x0.f47308c.m(j10, t10)).booleanValue());
                        i11 = iHashLong + i10;
                    }
                    break;
                case 59:
                    if (v(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = ((String) x0.f47308c.m(j10, t10)).hashCode();
                        i11 = iHashLong + i10;
                    }
                    break;
                case 60:
                    if (v(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = x0.f47308c.m(j10, t10).hashCode();
                        i11 = iHashLong + i10;
                    }
                    break;
                case 61:
                    if (v(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = x0.f47308c.m(j10, t10).hashCode();
                        i11 = iHashLong + i10;
                    }
                    break;
                case 62:
                    if (v(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = G(j10, t10);
                        i11 = iHashLong + i10;
                    }
                    break;
                case 63:
                    if (v(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = G(j10, t10);
                        i11 = iHashLong + i10;
                    }
                    break;
                case 64:
                    if (v(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = G(j10, t10);
                        i11 = iHashLong + i10;
                    }
                    break;
                case 65:
                    if (v(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(H(j10, t10));
                        i11 = iHashLong + i10;
                    }
                    break;
                case 66:
                    if (v(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = G(j10, t10);
                        i11 = iHashLong + i10;
                    }
                    break;
                case 67:
                    if (v(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(H(j10, t10));
                        i11 = iHashLong + i10;
                    }
                    break;
                case 68:
                    if (v(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = x0.f47308c.m(j10, t10).hashCode();
                        i11 = iHashLong + i10;
                    }
                    break;
            }
        }
        int iHashCode2 = this.f47205o.g(t10).hashCode() + (i11 * 53);
        return this.f47197f ? (iHashCode2 * 53) + this.f47206p.c(t10).f47078a.hashCode() : iHashCode2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public final boolean f(T t10, T t11) {
        boolean zC;
        int[] iArr = this.f47192a;
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iY = Y(i10);
            long j10 = iY & 1048575;
            switch (X(iY)) {
                case 0:
                    if (j(i10, t10, t11)) {
                        x0.e eVar = x0.f47308c;
                        if (Double.doubleToLongBits(eVar.h(j10, t10)) == Double.doubleToLongBits(eVar.h(j10, t11))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 1:
                    if (j(i10, t10, t11)) {
                        x0.e eVar2 = x0.f47308c;
                        if (Float.floatToIntBits(eVar2.i(j10, t10)) == Float.floatToIntBits(eVar2.i(j10, t11))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 2:
                    if (j(i10, t10, t11)) {
                        x0.e eVar3 = x0.f47308c;
                        if (eVar3.l(j10, t10) == eVar3.l(j10, t11)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 3:
                    if (j(i10, t10, t11)) {
                        x0.e eVar4 = x0.f47308c;
                        if (eVar4.l(j10, t10) == eVar4.l(j10, t11)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 4:
                    if (j(i10, t10, t11)) {
                        x0.e eVar5 = x0.f47308c;
                        if (eVar5.j(j10, t10) == eVar5.j(j10, t11)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 5:
                    if (j(i10, t10, t11)) {
                        x0.e eVar6 = x0.f47308c;
                        if (eVar6.l(j10, t10) == eVar6.l(j10, t11)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 6:
                    if (j(i10, t10, t11)) {
                        x0.e eVar7 = x0.f47308c;
                        if (eVar7.j(j10, t10) == eVar7.j(j10, t11)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 7:
                    if (j(i10, t10, t11)) {
                        x0.e eVar8 = x0.f47308c;
                        if (eVar8.e(j10, t10) == eVar8.e(j10, t11)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 8:
                    if (j(i10, t10, t11)) {
                        x0.e eVar9 = x0.f47308c;
                        if (r0.C(eVar9.m(j10, t10), eVar9.m(j10, t11))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 9:
                    if (j(i10, t10, t11)) {
                        x0.e eVar10 = x0.f47308c;
                        if (r0.C(eVar10.m(j10, t10), eVar10.m(j10, t11))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 10:
                    if (j(i10, t10, t11)) {
                        x0.e eVar11 = x0.f47308c;
                        if (r0.C(eVar11.m(j10, t10), eVar11.m(j10, t11))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 11:
                    if (j(i10, t10, t11)) {
                        x0.e eVar12 = x0.f47308c;
                        if (eVar12.j(j10, t10) == eVar12.j(j10, t11)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 12:
                    if (j(i10, t10, t11)) {
                        x0.e eVar13 = x0.f47308c;
                        if (eVar13.j(j10, t10) == eVar13.j(j10, t11)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 13:
                    if (j(i10, t10, t11)) {
                        x0.e eVar14 = x0.f47308c;
                        if (eVar14.j(j10, t10) == eVar14.j(j10, t11)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 14:
                    if (j(i10, t10, t11)) {
                        x0.e eVar15 = x0.f47308c;
                        if (eVar15.l(j10, t10) == eVar15.l(j10, t11)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 15:
                    if (j(i10, t10, t11)) {
                        x0.e eVar16 = x0.f47308c;
                        if (eVar16.j(j10, t10) == eVar16.j(j10, t11)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 16:
                    if (j(i10, t10, t11)) {
                        x0.e eVar17 = x0.f47308c;
                        if (eVar17.l(j10, t10) == eVar17.l(j10, t11)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 17:
                    if (j(i10, t10, t11)) {
                        x0.e eVar18 = x0.f47308c;
                        if (r0.C(eVar18.m(j10, t10), eVar18.m(j10, t11))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    x0.e eVar19 = x0.f47308c;
                    zC = r0.C(eVar19.m(j10, t10), eVar19.m(j10, t11));
                    break;
                case 50:
                    x0.e eVar20 = x0.f47308c;
                    zC = r0.C(eVar20.m(j10, t10), eVar20.m(j10, t11));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j11 = iArr[i10 + 2] & 1048575;
                    x0.e eVar21 = x0.f47308c;
                    if (eVar21.j(j11, t10) != eVar21.j(j11, t11) || !r0.C(eVar21.m(j10, t10), eVar21.m(j10, t11))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zC) {
                return false;
            }
        }
        v0<?, ?> v0Var = this.f47205o;
        if (!v0Var.g(t10).equals(v0Var.g(t11))) {
            return false;
        }
        if (!this.f47197f) {
            return true;
        }
        i<?> iVar = this.f47206p;
        return iVar.c(t10).equals(iVar.c(t11));
    }

    /* JADX WARN: Code duplicated, block: B:186:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    /* JADX WARN: Code duplicated, block: B:274:0x0893 A[PHI: r12
      0x0893: PHI (r12v29 boolean) = 
      (r12v9 boolean)
      (r12v10 boolean)
      (r12v10 boolean)
      (r12v11 boolean)
      (r12v17 boolean)
      (r12v18 boolean)
      (r12v32 boolean)
     binds: [B:321:0x0a97, B:318:0x0a7b, B:319:0x0a7d, B:316:0x0a66, B:297:0x09e3, B:295:0x09cc, B:273:0x0881] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public final void g(Object obj, f fVar) throws IOException {
        Iterator itM;
        Map.Entry<?, ?> entry;
        boolean z10;
        int i10;
        int i11;
        int i12;
        boolean z11;
        Map.Entry<?, ?> entry2;
        Iterator it;
        fVar.getClass();
        Writer.FieldOrder fieldOrder = Writer.FieldOrder.ASCENDING;
        Writer.FieldOrder fieldOrder2 = Writer.FieldOrder.DESCENDING;
        int[] iArr = this.f47192a;
        i<?> iVar = this.f47206p;
        boolean z12 = this.f47197f;
        v0<?, ?> v0Var = this.f47205o;
        int i13 = 1048575;
        boolean z13 = true;
        boolean z14 = false;
        if (fieldOrder == fieldOrder2) {
            v0Var.s(v0Var.g(obj), fVar);
            if (z12) {
                FieldSet<T> fieldSetC = iVar.c(obj);
                if (fieldSetC.f47078a.isEmpty()) {
                    entry2 = null;
                    it = null;
                } else {
                    boolean z15 = fieldSetC.f47080c;
                    t0<T, Object> t0Var = fieldSetC.f47078a;
                    if (z15) {
                        if (t0Var.v0 == null) {
                            t0Var.v0 = new t0.b();
                        }
                        it = new LazyField.b(t0Var.v0.iterator());
                    } else {
                        if (t0Var.v0 == null) {
                            t0Var.v0 = new t0.b();
                        }
                        it = t0Var.v0.iterator();
                    }
                    entry2 = (Map.Entry) it.next();
                }
            } else {
                entry2 = null;
                it = null;
            }
            for (int length = iArr.length - 3; length >= 0; length -= 3) {
                int iY = Y(length);
                int i14 = iArr[length];
                while (entry2 != null && iVar.a(entry2) > i14) {
                    iVar.j(fVar, entry2);
                    entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                switch (X(iY)) {
                    case 0:
                        if (t(length, obj)) {
                            fVar.c(i14, x0.f47308c.h(iY & 1048575, obj));
                        }
                        break;
                    case 1:
                        if (t(length, obj)) {
                            fVar.g(i14, x0.f47308c.i(iY & 1048575, obj));
                        }
                        break;
                    case 2:
                        if (t(length, obj)) {
                            fVar.j(i14, x0.f47308c.l(iY & 1048575, obj));
                        }
                        break;
                    case 3:
                        if (t(length, obj)) {
                            fVar.r(i14, x0.f47308c.l(iY & 1048575, obj));
                        }
                        break;
                    case 4:
                        if (t(length, obj)) {
                            fVar.i(i14, x0.f47308c.j(iY & 1048575, obj));
                        }
                        break;
                    case 5:
                        if (t(length, obj)) {
                            fVar.f(i14, x0.f47308c.l(iY & 1048575, obj));
                        }
                        break;
                    case 6:
                        if (t(length, obj)) {
                            fVar.e(i14, x0.f47308c.j(iY & 1048575, obj));
                        }
                        break;
                    case 7:
                        if (t(length, obj)) {
                            fVar.a(i14, x0.f47308c.e(iY & 1048575, obj));
                        }
                        break;
                    case 8:
                        if (t(length, obj)) {
                            b0(i14, x0.f47308c.m(iY & 1048575, obj), fVar);
                        }
                        break;
                    case 9:
                        if (t(length, obj)) {
                            fVar.k(i14, p(length), x0.f47308c.m(iY & 1048575, obj));
                        }
                        break;
                    case 10:
                        if (t(length, obj)) {
                            fVar.b(i14, (ByteString) x0.f47308c.m(iY & 1048575, obj));
                        }
                        break;
                    case 11:
                        if (t(length, obj)) {
                            fVar.q(i14, x0.f47308c.j(iY & 1048575, obj));
                        }
                        break;
                    case 12:
                        if (t(length, obj)) {
                            fVar.d(i14, x0.f47308c.j(iY & 1048575, obj));
                        }
                        break;
                    case 13:
                        if (t(length, obj)) {
                            fVar.m(i14, x0.f47308c.j(iY & 1048575, obj));
                        }
                        break;
                    case 14:
                        if (t(length, obj)) {
                            fVar.n(i14, x0.f47308c.l(iY & 1048575, obj));
                        }
                        break;
                    case 15:
                        if (t(length, obj)) {
                            fVar.o(i14, x0.f47308c.j(iY & 1048575, obj));
                        }
                        break;
                    case 16:
                        if (t(length, obj)) {
                            fVar.p(i14, x0.f47308c.l(iY & 1048575, obj));
                        }
                        break;
                    case 17:
                        if (t(length, obj)) {
                            fVar.h(i14, p(length), x0.f47308c.m(iY & 1048575, obj));
                        }
                        break;
                    case 18:
                        r0.G(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar, false);
                        break;
                    case 19:
                        r0.K(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar, false);
                        break;
                    case 20:
                        r0.N(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar, false);
                        break;
                    case 21:
                        r0.V(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar, false);
                        break;
                    case 22:
                        r0.M(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar, false);
                        break;
                    case 23:
                        r0.J(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar, false);
                        break;
                    case 24:
                        r0.I(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar, false);
                        break;
                    case 25:
                        r0.E(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar, false);
                        break;
                    case 26:
                        r0.T(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar);
                        break;
                    case 27:
                        r0.O(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar, p(length));
                        break;
                    case 28:
                        r0.F(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar);
                        break;
                    case 29:
                        r0.U(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar, false);
                        break;
                    case 30:
                        r0.H(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar, false);
                        break;
                    case 31:
                        r0.P(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar, false);
                        break;
                    case 32:
                        r0.Q(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar, false);
                        break;
                    case 33:
                        r0.R(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar, false);
                        break;
                    case 34:
                        r0.S(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar, false);
                        break;
                    case 35:
                        r0.G(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar, true);
                        break;
                    case 36:
                        r0.K(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar, true);
                        break;
                    case 37:
                        r0.N(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar, true);
                        break;
                    case 38:
                        r0.V(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar, true);
                        break;
                    case 39:
                        r0.M(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar, true);
                        break;
                    case 40:
                        r0.J(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar, true);
                        break;
                    case 41:
                        r0.I(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar, true);
                        break;
                    case 42:
                        r0.E(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar, true);
                        break;
                    case 43:
                        r0.U(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar, true);
                        break;
                    case 44:
                        r0.H(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar, true);
                        break;
                    case 45:
                        r0.P(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar, true);
                        break;
                    case 46:
                        r0.Q(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar, true);
                        break;
                    case 47:
                        r0.R(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar, true);
                        break;
                    case 48:
                        r0.S(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar, true);
                        break;
                    case 49:
                        r0.L(iArr[length], (List) x0.f47308c.m(iY & 1048575, obj), fVar, p(length));
                        break;
                    case 50:
                        a0(fVar, i14, x0.f47308c.m(iY & 1048575, obj), length);
                        break;
                    case 51:
                        if (v(i14, length, obj)) {
                            fVar.c(i14, ((Double) x0.f47308c.m(iY & 1048575, obj)).doubleValue());
                        }
                        break;
                    case 52:
                        if (v(i14, length, obj)) {
                            fVar.g(i14, ((Float) x0.f47308c.m(iY & 1048575, obj)).floatValue());
                        }
                        break;
                    case 53:
                        if (v(i14, length, obj)) {
                            fVar.j(i14, H(iY & 1048575, obj));
                        }
                        break;
                    case 54:
                        if (v(i14, length, obj)) {
                            fVar.r(i14, H(iY & 1048575, obj));
                        }
                        break;
                    case 55:
                        if (v(i14, length, obj)) {
                            fVar.i(i14, G(iY & 1048575, obj));
                        }
                        break;
                    case 56:
                        if (v(i14, length, obj)) {
                            fVar.f(i14, H(iY & 1048575, obj));
                        }
                        break;
                    case 57:
                        if (v(i14, length, obj)) {
                            fVar.e(i14, G(iY & 1048575, obj));
                        }
                        break;
                    case 58:
                        if (v(i14, length, obj)) {
                            fVar.a(i14, ((Boolean) x0.f47308c.m(iY & 1048575, obj)).booleanValue());
                        }
                        break;
                    case 59:
                        if (v(i14, length, obj)) {
                            b0(i14, x0.f47308c.m(iY & 1048575, obj), fVar);
                        }
                        break;
                    case 60:
                        if (v(i14, length, obj)) {
                            fVar.k(i14, p(length), x0.f47308c.m(iY & 1048575, obj));
                        }
                        break;
                    case 61:
                        if (v(i14, length, obj)) {
                            fVar.b(i14, (ByteString) x0.f47308c.m(iY & 1048575, obj));
                        }
                        break;
                    case 62:
                        if (v(i14, length, obj)) {
                            fVar.q(i14, G(iY & 1048575, obj));
                        }
                        break;
                    case 63:
                        if (v(i14, length, obj)) {
                            fVar.d(i14, G(iY & 1048575, obj));
                        }
                        break;
                    case 64:
                        if (v(i14, length, obj)) {
                            fVar.m(i14, G(iY & 1048575, obj));
                        }
                        break;
                    case 65:
                        if (v(i14, length, obj)) {
                            fVar.n(i14, H(iY & 1048575, obj));
                        }
                        break;
                    case 66:
                        if (v(i14, length, obj)) {
                            fVar.o(i14, G(iY & 1048575, obj));
                        }
                        break;
                    case 67:
                        if (v(i14, length, obj)) {
                            fVar.p(i14, H(iY & 1048575, obj));
                        }
                        break;
                    case 68:
                        if (v(i14, length, obj)) {
                            fVar.h(i14, p(length), x0.f47308c.m(iY & 1048575, obj));
                        }
                        break;
                }
            }
            while (entry2 != null) {
                iVar.j(fVar, entry2);
                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            return;
        }
        if (!this.f47199h) {
            Z(obj, fVar);
            return;
        }
        if (z12) {
            FieldSet<T> fieldSetC2 = iVar.c(obj);
            if (fieldSetC2.f47078a.isEmpty()) {
                itM = null;
                entry = null;
            } else {
                itM = fieldSetC2.m();
                entry = (Map.Entry) itM.next();
            }
        } else {
            itM = null;
            entry = null;
        }
        int length2 = iArr.length;
        int i15 = 0;
        while (i15 < length2) {
            int iY2 = Y(i15);
            int i16 = iArr[i15];
            while (entry != null && iVar.a(entry) <= i16) {
                iVar.j(fVar, entry);
                entry = itM.hasNext() ? (Map.Entry) itM.next() : null;
            }
            switch (X(iY2)) {
                case 0:
                    z10 = z14;
                    if (t(i15, obj)) {
                        fVar.c(i16, x0.f47308c.h(iY2 & i13, obj));
                    }
                    break;
                case 1:
                    z10 = z14;
                    if (t(i15, obj)) {
                        fVar.g(i16, x0.f47308c.i(iY2 & i13, obj));
                    }
                    break;
                case 2:
                    z10 = z14;
                    if (t(i15, obj)) {
                        fVar.j(i16, x0.f47308c.l(iY2 & i13, obj));
                    }
                    break;
                case 3:
                    z10 = z14;
                    if (t(i15, obj)) {
                        fVar.r(i16, x0.f47308c.l(iY2 & i13, obj));
                    }
                    break;
                case 4:
                    z10 = z14;
                    if (t(i15, obj)) {
                        fVar.i(i16, x0.f47308c.j(iY2 & i13, obj));
                    }
                    break;
                case 5:
                    z10 = z14;
                    if (t(i15, obj)) {
                        fVar.f(i16, x0.f47308c.l(iY2 & i13, obj));
                    }
                    break;
                case 6:
                    z10 = z14;
                    if (t(i15, obj)) {
                        fVar.e(i16, x0.f47308c.j(iY2 & i13, obj));
                    }
                    break;
                case 7:
                    z10 = z14;
                    if (t(i15, obj)) {
                        fVar.a(i16, x0.f47308c.e(iY2 & i13, obj));
                    }
                    break;
                case 8:
                    z10 = z14;
                    if (t(i15, obj)) {
                        i13 = 1048575;
                        b0(i16, x0.f47308c.m(iY2 & 1048575, obj), fVar);
                    } else {
                        i13 = 1048575;
                    }
                    break;
                case 9:
                    z10 = z14;
                    if (t(i15, obj)) {
                        fVar.k(i16, p(i15), x0.f47308c.m(iY2 & 1048575, obj));
                    }
                    i13 = 1048575;
                    break;
                case 10:
                    z10 = z14;
                    if (t(i15, obj)) {
                        fVar.b(i16, (ByteString) x0.f47308c.m(iY2 & i13, obj));
                        i13 = 1048575;
                    }
                    break;
                case 11:
                    z10 = z14;
                    if (t(i15, obj)) {
                        fVar.q(i16, x0.f47308c.j(iY2 & i13, obj));
                    }
                    break;
                case 12:
                    z10 = z14;
                    if (t(i15, obj)) {
                        fVar.d(i16, x0.f47308c.j(iY2 & i13, obj));
                    }
                    break;
                case 13:
                    z10 = z14;
                    if (t(i15, obj)) {
                        fVar.m(i16, x0.f47308c.j(iY2 & i13, obj));
                    }
                    break;
                case 14:
                    z10 = z14;
                    if (t(i15, obj)) {
                        fVar.n(i16, x0.f47308c.l(iY2 & i13, obj));
                    }
                    break;
                case 15:
                    z10 = z14;
                    if (t(i15, obj)) {
                        fVar.o(i16, x0.f47308c.j(iY2 & i13, obj));
                    }
                    break;
                case 16:
                    z10 = z14;
                    if (t(i15, obj)) {
                        i13 = 1048575;
                        fVar.p(i16, x0.f47308c.l(iY2 & 1048575, obj));
                    } else {
                        i13 = 1048575;
                    }
                    break;
                case 17:
                    i10 = i13;
                    z10 = z14;
                    if (t(i15, obj)) {
                        fVar.h(i16, p(i15), x0.f47308c.m(iY2 & i10, obj));
                        i13 = 1048575;
                    } else {
                        i13 = i10;
                    }
                    break;
                case 18:
                    i10 = i13;
                    z10 = z14;
                    r0.G(iArr[i15], (List) x0.f47308c.m(iY2 & i10, obj), fVar, z10);
                    i13 = i10;
                    break;
                case 19:
                    i10 = i13;
                    z10 = z14;
                    r0.K(iArr[i15], (List) x0.f47308c.m(iY2 & i10, obj), fVar, z10);
                    i13 = i10;
                    break;
                case 20:
                    i10 = i13;
                    z10 = z14;
                    r0.N(iArr[i15], (List) x0.f47308c.m(iY2 & i10, obj), fVar, z10);
                    i13 = i10;
                    break;
                case 21:
                    i10 = i13;
                    z10 = z14;
                    r0.V(iArr[i15], (List) x0.f47308c.m(iY2 & i10, obj), fVar, z10);
                    i13 = i10;
                    break;
                case 22:
                    i10 = i13;
                    z10 = z14;
                    r0.M(iArr[i15], (List) x0.f47308c.m(iY2 & i10, obj), fVar, z10);
                    i13 = i10;
                    break;
                case 23:
                    i10 = i13;
                    z10 = z14;
                    r0.J(iArr[i15], (List) x0.f47308c.m(iY2 & i10, obj), fVar, z10);
                    i13 = i10;
                    break;
                case 24:
                    i10 = i13;
                    z10 = z14;
                    r0.I(iArr[i15], (List) x0.f47308c.m(iY2 & i10, obj), fVar, z10);
                    i13 = i10;
                    break;
                case 25:
                    i10 = i13;
                    z10 = false;
                    r0.E(iArr[i15], (List) x0.f47308c.m(iY2 & i10, obj), fVar, false);
                    i13 = i10;
                    break;
                case 26:
                    i11 = 1048575;
                    r0.T(iArr[i15], (List) x0.f47308c.m(iY2 & 1048575, obj), fVar);
                    i13 = i11;
                    z10 = false;
                    break;
                case 27:
                    r0.O(iArr[i15], (List) x0.f47308c.m(iY2 & i13, obj), fVar, p(i15));
                    i13 = 1048575;
                    z10 = false;
                    break;
                case 28:
                    i11 = i13;
                    r0.F(iArr[i15], (List) x0.f47308c.m(iY2 & i11, obj), fVar);
                    i13 = i11;
                    z10 = false;
                    break;
                case 29:
                    i12 = i13;
                    z11 = z14;
                    r0.U(iArr[i15], (List) x0.f47308c.m(iY2 & i12, obj), fVar, z11);
                    i13 = i12;
                    z10 = z11;
                    break;
                case 30:
                    i12 = i13;
                    z11 = z14;
                    r0.H(iArr[i15], (List) x0.f47308c.m(iY2 & i12, obj), fVar, z11);
                    i13 = i12;
                    z10 = z11;
                    break;
                case 31:
                    i12 = i13;
                    z11 = z14;
                    r0.P(iArr[i15], (List) x0.f47308c.m(iY2 & i12, obj), fVar, z11);
                    i13 = i12;
                    z10 = z11;
                    break;
                case 32:
                    z11 = z14;
                    i12 = 1048575;
                    r0.Q(iArr[i15], (List) x0.f47308c.m(iY2 & 1048575, obj), fVar, z11);
                    i13 = i12;
                    z10 = z11;
                    break;
                case 33:
                    boolean z16 = z14;
                    r0.R(iArr[i15], (List) x0.f47308c.m(iY2 & i13, obj), fVar, z16);
                    z10 = z16;
                    i13 = 1048575;
                    break;
                case 34:
                    z11 = false;
                    r0.S(iArr[i15], (List) x0.f47308c.m(iY2 & i13, obj), fVar, false);
                    z10 = z11;
                    break;
                case 35:
                    r0.G(iArr[i15], (List) x0.f47308c.m(iY2 & i13, obj), fVar, z13);
                    z10 = false;
                    break;
                case 36:
                    r0.K(iArr[i15], (List) x0.f47308c.m(iY2 & i13, obj), fVar, z13);
                    z10 = false;
                    break;
                case 37:
                    r0.N(iArr[i15], (List) x0.f47308c.m(iY2 & i13, obj), fVar, z13);
                    z10 = false;
                    break;
                case 38:
                    r0.V(iArr[i15], (List) x0.f47308c.m(iY2 & i13, obj), fVar, z13);
                    z10 = false;
                    break;
                case 39:
                    r0.M(iArr[i15], (List) x0.f47308c.m(iY2 & i13, obj), fVar, z13);
                    z10 = false;
                    break;
                case 40:
                    r0.J(iArr[i15], (List) x0.f47308c.m(iY2 & i13, obj), fVar, z13);
                    z10 = false;
                    break;
                case 41:
                    r0.I(iArr[i15], (List) x0.f47308c.m(iY2 & i13, obj), fVar, z13);
                    z10 = false;
                    break;
                case 42:
                    r0.E(iArr[i15], (List) x0.f47308c.m(iY2 & i13, obj), fVar, z13);
                    z10 = false;
                    break;
                case 43:
                    r0.U(iArr[i15], (List) x0.f47308c.m(iY2 & i13, obj), fVar, z13);
                    z10 = false;
                    break;
                case 44:
                    r0.H(iArr[i15], (List) x0.f47308c.m(iY2 & i13, obj), fVar, z13);
                    z10 = false;
                    break;
                case 45:
                    r0.P(iArr[i15], (List) x0.f47308c.m(iY2 & i13, obj), fVar, z13);
                    z10 = false;
                    break;
                case 46:
                    r0.Q(iArr[i15], (List) x0.f47308c.m(iY2 & i13, obj), fVar, z13);
                    z10 = false;
                    break;
                case 47:
                    r0.R(iArr[i15], (List) x0.f47308c.m(iY2 & i13, obj), fVar, z13);
                    z10 = false;
                    break;
                case 48:
                    r0.S(iArr[i15], (List) x0.f47308c.m(iY2 & i13, obj), fVar, z13);
                    z10 = false;
                    break;
                case 49:
                    r0.L(iArr[i15], (List) x0.f47308c.m(iY2 & i13, obj), fVar, p(i15));
                    z10 = false;
                    break;
                case 50:
                    a0(fVar, i16, x0.f47308c.m(iY2 & i13, obj), i15);
                    z10 = false;
                    break;
                case 51:
                    if (v(i16, i15, obj)) {
                        fVar.c(i16, ((Double) x0.f47308c.m(iY2 & i13, obj)).doubleValue());
                    }
                    z10 = false;
                    break;
                case 52:
                    if (v(i16, i15, obj)) {
                        fVar.g(i16, ((Float) x0.f47308c.m(iY2 & i13, obj)).floatValue());
                    }
                    z10 = false;
                    break;
                case 53:
                    if (v(i16, i15, obj)) {
                        fVar.j(i16, H(iY2 & i13, obj));
                    }
                    z10 = false;
                    break;
                case 54:
                    if (v(i16, i15, obj)) {
                        fVar.r(i16, H(iY2 & i13, obj));
                    }
                    z10 = false;
                    break;
                case 55:
                    if (v(i16, i15, obj)) {
                        fVar.i(i16, G(iY2 & i13, obj));
                    }
                    z10 = false;
                    break;
                case 56:
                    if (v(i16, i15, obj)) {
                        fVar.f(i16, H(iY2 & i13, obj));
                    }
                    z10 = false;
                    break;
                case 57:
                    if (v(i16, i15, obj)) {
                        fVar.e(i16, G(iY2 & i13, obj));
                    }
                    z10 = false;
                    break;
                case 58:
                    if (v(i16, i15, obj)) {
                        fVar.a(i16, ((Boolean) x0.f47308c.m(iY2 & i13, obj)).booleanValue());
                    }
                    z10 = false;
                    break;
                case 59:
                    if (v(i16, i15, obj)) {
                        b0(i16, x0.f47308c.m(iY2 & i13, obj), fVar);
                    }
                    z10 = false;
                    break;
                case 60:
                    if (v(i16, i15, obj)) {
                        fVar.k(i16, p(i15), x0.f47308c.m(iY2 & i13, obj));
                    }
                    z10 = false;
                    break;
                case 61:
                    if (v(i16, i15, obj)) {
                        fVar.b(i16, (ByteString) x0.f47308c.m(iY2 & i13, obj));
                    }
                    z10 = false;
                    break;
                case 62:
                    if (v(i16, i15, obj)) {
                        fVar.q(i16, G(iY2 & i13, obj));
                    }
                    z10 = false;
                    break;
                case 63:
                    if (v(i16, i15, obj)) {
                        fVar.d(i16, G(iY2 & i13, obj));
                    }
                    z10 = false;
                    break;
                case 64:
                    if (v(i16, i15, obj)) {
                        fVar.m(i16, G(iY2 & i13, obj));
                    }
                    z10 = false;
                    break;
                case 65:
                    if (v(i16, i15, obj)) {
                        fVar.n(i16, H(iY2 & i13, obj));
                    }
                    z10 = false;
                    break;
                case 66:
                    if (v(i16, i15, obj)) {
                        fVar.o(i16, G(iY2 & i13, obj));
                    }
                    z10 = false;
                    break;
                case 67:
                    if (v(i16, i15, obj)) {
                        fVar.p(i16, H(iY2 & i13, obj));
                    }
                    z10 = false;
                    break;
                case 68:
                    if (v(i16, i15, obj)) {
                        fVar.h(i16, p(i15), x0.f47308c.m(iY2 & i13, obj));
                        z10 = false;
                        break;
                    }
                default:
                    z10 = z14;
                    break;
            }
            i15 += 3;
            z14 = z10;
            z13 = true;
        }
        while (entry != null) {
            iVar.j(fVar, entry);
            entry = itM.hasNext() ? (Map.Entry) itM.next() : null;
        }
        v0Var.s(v0Var.g(obj), fVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public final void h(T t10, byte[] bArr, int i10, int i11, c.b bVar) throws IOException {
        if (this.f47199h) {
            L(t10, bArr, i10, i11, bVar);
        } else {
            K(t10, bArr, i10, i11, 0, bVar);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public final void i(T t10, o0 o0Var, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        extensionRegistryLite.getClass();
        k(t10);
        x(this.f47205o, this.f47206p, t10, o0Var, extensionRegistryLite);
    }

    public final boolean j(int i10, Object obj, Object obj2) {
        return t(i10, obj) == t(i10, obj2);
    }

    public final <UT, UB> UB m(Object obj, int i10, UB ub2, v0<UT, UB> v0Var, Object obj2) {
        Internal.EnumVerifier enumVerifierN;
        int i11 = this.f47192a[i10];
        Object objM = x0.f47308c.m(Y(i10) & 1048575, obj);
        if (objM == null || (enumVerifierN = n(i10)) == null) {
            return ub2;
        }
        x xVar = this.f47207q;
        MapFieldLite mapFieldLiteC = xVar.c(objM);
        MapEntryLite.b<?, ?> bVarB = xVar.b(o(i10));
        Iterator it = mapFieldLiteC.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!enumVerifierN.isInRange(((Integer) entry.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = (UB) v0Var.f(obj2);
                }
                byte[] bArr = new byte[MapEntryLite.a(bVarB, entry.getKey(), entry.getValue())];
                CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(bArr);
                try {
                    MapEntryLite.c(codedOutputStreamNewInstance, bVarB, entry.getKey(), entry.getValue());
                    codedOutputStreamNewInstance.checkNoSpaceLeft();
                    v0Var.d(ub2, i11, new ByteString.h(bArr));
                    it.remove();
                } catch (IOException e5) {
                    throw new RuntimeException(e5);
                }
            }
        }
        return ub2;
    }

    public final Internal.EnumVerifier n(int i10) {
        return (Internal.EnumVerifier) this.f47193b[((i10 / 3) * 2) + 1];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public final T newInstance() {
        return (T) this.m.a(this.f47196e);
    }

    public final Object o(int i10) {
        return this.f47193b[(i10 / 3) * 2];
    }

    public final q0 p(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f47193b;
        q0 q0Var = (q0) objArr[i11];
        if (q0Var != null) {
            return q0Var;
        }
        q0<T> q0VarA = l0.f47234c.a((Class) objArr[i11 + 1]);
        objArr[i11] = q0VarA;
        return q0VarA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0072 A[PHI: r5
      0x0072: PHI (r5v2 int) = 
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v5 int)
      (r5v1 int)
      (r5v6 int)
      (r5v1 int)
      (r5v7 int)
      (r5v1 int)
      (r5v8 int)
      (r5v1 int)
      (r5v9 int)
      (r5v1 int)
      (r5v10 int)
      (r5v1 int)
      (r5v11 int)
      (r5v1 int)
      (r5v12 int)
      (r5v1 int)
      (r5v13 int)
      (r5v1 int)
      (r5v14 int)
      (r5v1 int)
      (r5v15 int)
      (r5v1 int)
      (r5v16 int)
      (r5v1 int)
      (r5v17 int)
      (r5v1 int)
      (r5v18 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v19 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v20 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v21 int)
      (r5v1 int)
     binds: [B:19:0x0059, B:208:0x049f, B:205:0x0494, B:199:0x0478, B:196:0x0466, B:193:0x0456, B:190:0x0448, B:187:0x043a, B:184:0x042f, B:181:0x0425, B:178:0x0417, B:175:0x0409, B:172:0x03f5, B:150:0x0311, B:153:0x0319, B:145:0x02f5, B:148:0x02fd, B:140:0x02d9, B:143:0x02e1, B:135:0x02bd, B:138:0x02c5, B:130:0x02a1, B:133:0x02a9, B:125:0x0285, B:128:0x028d, B:120:0x0269, B:123:0x0271, B:115:0x024d, B:118:0x0255, B:110:0x0231, B:113:0x0239, B:105:0x0215, B:108:0x021d, B:100:0x01f9, B:103:0x0201, B:95:0x01dd, B:98:0x01e5, B:90:0x01c1, B:93:0x01c9, B:85:0x01a5, B:88:0x01ad, B:80:0x0171, B:77:0x0165, B:74:0x0155, B:71:0x0145, B:68:0x0135, B:65:0x0129, B:62:0x011d, B:59:0x0110, B:56:0x0101, B:52:0x00f1, B:49:0x00de, B:46:0x00cd, B:43:0x00be, B:40:0x00af, B:38:0x00a9, B:36:0x00a2, B:33:0x0097, B:30:0x0088, B:27:0x0079, B:24:0x0071, B:22:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    public final int r(T t10) {
        int i10;
        int i11;
        int iComputeDoubleSize;
        int iComputeBoolSize;
        int iComputeBytesSize;
        int iComputeSFixed32Size;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int iE = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = this.f47192a;
            if (i14 >= iArr.length) {
                v0<?, ?> v0Var = this.f47205o;
                int iH = v0Var.h(v0Var.g(t10)) + iE;
                return this.f47197f ? iH + this.f47206p.c(t10).i() : iH;
            }
            int iY = Y(i14);
            int i16 = iArr[i14];
            int iX = X(iY);
            boolean z10 = this.f47200i;
            Unsafe unsafe = f47191s;
            if (iX <= 17) {
                i10 = iArr[i14 + 2];
                int i17 = i10 & i12;
                i11 = 1 << (i10 >>> 20);
                if (i17 != i13) {
                    i15 = unsafe.getInt(t10, i17);
                    i13 = i17;
                }
            } else {
                i10 = (!z10 || iX < FieldType.DOUBLE_LIST_PACKED.id() || iX > FieldType.SINT64_LIST_PACKED.id()) ? 0 : iArr[i14 + 2] & i12;
                i11 = 0;
            }
            long j10 = iY & i12;
            switch (iX) {
                case 0:
                    if ((i15 & i11) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(i16, 0.0d);
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 1:
                    if ((i15 & i11) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(i16, 0.0f);
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 2:
                    if ((i15 & i11) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(i16, unsafe.getLong(t10, j10));
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 3:
                    if ((i15 & i11) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(i16, unsafe.getLong(t10, j10));
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 4:
                    if ((i15 & i11) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(i16, unsafe.getInt(t10, j10));
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 5:
                    if ((i15 & i11) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(i16, 0L);
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 6:
                    if ((i15 & i11) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(i16, 0);
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 7:
                    if ((i15 & i11) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeBoolSize(i16, true);
                        iE += iComputeBoolSize;
                    }
                    break;
                case 8:
                    if ((i15 & i11) != 0) {
                        Object object = unsafe.getObject(t10, j10);
                        iComputeBytesSize = object instanceof ByteString ? CodedOutputStream.computeBytesSize(i16, (ByteString) object) : CodedOutputStream.computeStringSize(i16, (String) object);
                        iE = iComputeBytesSize + iE;
                    }
                    break;
                case 9:
                    if ((i15 & i11) != 0) {
                        iComputeBoolSize = r0.o(i16, p(i14), unsafe.getObject(t10, j10));
                        iE += iComputeBoolSize;
                    }
                    break;
                case 10:
                    if ((i15 & i11) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeBytesSize(i16, (ByteString) unsafe.getObject(t10, j10));
                        iE += iComputeBoolSize;
                    }
                    break;
                case 11:
                    if ((i15 & i11) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeUInt32Size(i16, unsafe.getInt(t10, j10));
                        iE += iComputeBoolSize;
                    }
                    break;
                case 12:
                    if ((i15 & i11) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeEnumSize(i16, unsafe.getInt(t10, j10));
                        iE += iComputeBoolSize;
                    }
                    break;
                case 13:
                    if ((i15 & i11) != 0) {
                        iComputeSFixed32Size = CodedOutputStream.computeSFixed32Size(i16, 0);
                        iE += iComputeSFixed32Size;
                    }
                    break;
                case 14:
                    if ((i15 & i11) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeSFixed64Size(i16, 0L);
                        iE += iComputeBoolSize;
                    }
                    break;
                case 15:
                    if ((i15 & i11) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeSInt32Size(i16, unsafe.getInt(t10, j10));
                        iE += iComputeBoolSize;
                    }
                    break;
                case 16:
                    if ((i15 & i11) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeSInt64Size(i16, unsafe.getLong(t10, j10));
                        iE += iComputeBoolSize;
                    }
                    break;
                case 17:
                    if ((i15 & i11) != 0) {
                        iComputeBoolSize = CodedOutputStream.a(i16, (MessageLite) unsafe.getObject(t10, j10), p(i14));
                        iE += iComputeBoolSize;
                    }
                    break;
                case 18:
                    iComputeBoolSize = r0.h(i16, (List) unsafe.getObject(t10, j10));
                    iE += iComputeBoolSize;
                    break;
                case 19:
                    iComputeBoolSize = r0.f(i16, (List) unsafe.getObject(t10, j10));
                    iE += iComputeBoolSize;
                    break;
                case 20:
                    iComputeBoolSize = r0.m(i16, (List) unsafe.getObject(t10, j10));
                    iE += iComputeBoolSize;
                    break;
                case 21:
                    iComputeBoolSize = r0.x(i16, (List) unsafe.getObject(t10, j10));
                    iE += iComputeBoolSize;
                    break;
                case 22:
                    iComputeBoolSize = r0.k(i16, (List) unsafe.getObject(t10, j10));
                    iE += iComputeBoolSize;
                    break;
                case 23:
                    iComputeBoolSize = r0.h(i16, (List) unsafe.getObject(t10, j10));
                    iE += iComputeBoolSize;
                    break;
                case 24:
                    iComputeBoolSize = r0.f(i16, (List) unsafe.getObject(t10, j10));
                    iE += iComputeBoolSize;
                    break;
                case 25:
                    iComputeBoolSize = r0.a(i16, (List) unsafe.getObject(t10, j10));
                    iE += iComputeBoolSize;
                    break;
                case 26:
                    iComputeBoolSize = r0.u(i16, (List) unsafe.getObject(t10, j10));
                    iE += iComputeBoolSize;
                    break;
                case 27:
                    iComputeBoolSize = r0.p(i16, (List) unsafe.getObject(t10, j10), p(i14));
                    iE += iComputeBoolSize;
                    break;
                case 28:
                    iComputeBoolSize = r0.c(i16, (List) unsafe.getObject(t10, j10));
                    iE += iComputeBoolSize;
                    break;
                case 29:
                    iComputeBoolSize = r0.v(i16, (List) unsafe.getObject(t10, j10));
                    iE += iComputeBoolSize;
                    break;
                case 30:
                    iComputeBoolSize = r0.d(i16, (List) unsafe.getObject(t10, j10));
                    iE += iComputeBoolSize;
                    break;
                case 31:
                    iComputeBoolSize = r0.f(i16, (List) unsafe.getObject(t10, j10));
                    iE += iComputeBoolSize;
                    break;
                case 32:
                    iComputeBoolSize = r0.h(i16, (List) unsafe.getObject(t10, j10));
                    iE += iComputeBoolSize;
                    break;
                case 33:
                    iComputeBoolSize = r0.q(i16, (List) unsafe.getObject(t10, j10));
                    iE += iComputeBoolSize;
                    break;
                case 34:
                    iComputeBoolSize = r0.s(i16, (List) unsafe.getObject(t10, j10));
                    iE += iComputeBoolSize;
                    break;
                case 35:
                    int i18 = r0.i((List) unsafe.getObject(t10, j10));
                    if (i18 > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i10, i18);
                        }
                        iE = androidx.appcompat.widget.g0.e(i18, CodedOutputStream.computeTagSize(i16), i18, iE);
                    }
                    break;
                case 36:
                    int iG = r0.g((List) unsafe.getObject(t10, j10));
                    if (iG > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i10, iG);
                        }
                        iE = androidx.appcompat.widget.g0.e(iG, CodedOutputStream.computeTagSize(i16), iG, iE);
                    }
                    break;
                case 37:
                    int iN = r0.n((List) unsafe.getObject(t10, j10));
                    if (iN > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i10, iN);
                        }
                        iE = androidx.appcompat.widget.g0.e(iN, CodedOutputStream.computeTagSize(i16), iN, iE);
                    }
                    break;
                case 38:
                    int iY2 = r0.y((List) unsafe.getObject(t10, j10));
                    if (iY2 > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i10, iY2);
                        }
                        iE = androidx.appcompat.widget.g0.e(iY2, CodedOutputStream.computeTagSize(i16), iY2, iE);
                    }
                    break;
                case 39:
                    int iL = r0.l((List) unsafe.getObject(t10, j10));
                    if (iL > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i10, iL);
                        }
                        iE = androidx.appcompat.widget.g0.e(iL, CodedOutputStream.computeTagSize(i16), iL, iE);
                    }
                    break;
                case 40:
                    int i19 = r0.i((List) unsafe.getObject(t10, j10));
                    if (i19 > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i10, i19);
                        }
                        iE = androidx.appcompat.widget.g0.e(i19, CodedOutputStream.computeTagSize(i16), i19, iE);
                    }
                    break;
                case 41:
                    int iG2 = r0.g((List) unsafe.getObject(t10, j10));
                    if (iG2 > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i10, iG2);
                        }
                        iE = androidx.appcompat.widget.g0.e(iG2, CodedOutputStream.computeTagSize(i16), iG2, iE);
                    }
                    break;
                case 42:
                    int iB = r0.b((List) unsafe.getObject(t10, j10));
                    if (iB > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i10, iB);
                        }
                        iE = androidx.appcompat.widget.g0.e(iB, CodedOutputStream.computeTagSize(i16), iB, iE);
                    }
                    break;
                case 43:
                    int iW = r0.w((List) unsafe.getObject(t10, j10));
                    if (iW > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i10, iW);
                        }
                        iE = androidx.appcompat.widget.g0.e(iW, CodedOutputStream.computeTagSize(i16), iW, iE);
                    }
                    break;
                case 44:
                    int iE2 = r0.e((List) unsafe.getObject(t10, j10));
                    if (iE2 > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i10, iE2);
                        }
                        iE = androidx.appcompat.widget.g0.e(iE2, CodedOutputStream.computeTagSize(i16), iE2, iE);
                    }
                    break;
                case 45:
                    int iG3 = r0.g((List) unsafe.getObject(t10, j10));
                    if (iG3 > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i10, iG3);
                        }
                        iE = androidx.appcompat.widget.g0.e(iG3, CodedOutputStream.computeTagSize(i16), iG3, iE);
                    }
                    break;
                case 46:
                    int i20 = r0.i((List) unsafe.getObject(t10, j10));
                    if (i20 > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i10, i20);
                        }
                        iE = androidx.appcompat.widget.g0.e(i20, CodedOutputStream.computeTagSize(i16), i20, iE);
                    }
                    break;
                case 47:
                    int iR = r0.r((List) unsafe.getObject(t10, j10));
                    if (iR > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i10, iR);
                        }
                        iE = androidx.appcompat.widget.g0.e(iR, CodedOutputStream.computeTagSize(i16), iR, iE);
                    }
                    break;
                case 48:
                    int iT = r0.t((List) unsafe.getObject(t10, j10));
                    if (iT > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i10, iT);
                        }
                        iE = androidx.appcompat.widget.g0.e(iT, CodedOutputStream.computeTagSize(i16), iT, iE);
                    }
                    break;
                case 49:
                    iComputeBoolSize = r0.j(i16, (List) unsafe.getObject(t10, j10), p(i14));
                    iE += iComputeBoolSize;
                    break;
                case 50:
                    iComputeBoolSize = this.f47207q.g(i16, unsafe.getObject(t10, j10), o(i14));
                    iE += iComputeBoolSize;
                    break;
                case 51:
                    if (v(i16, i14, t10)) {
                        iComputeBoolSize = CodedOutputStream.computeDoubleSize(i16, 0.0d);
                        iE += iComputeBoolSize;
                    }
                    break;
                case 52:
                    if (v(i16, i14, t10)) {
                        iComputeBoolSize = CodedOutputStream.computeFloatSize(i16, 0.0f);
                        iE += iComputeBoolSize;
                    }
                    break;
                case 53:
                    if (v(i16, i14, t10)) {
                        iComputeBoolSize = CodedOutputStream.computeInt64Size(i16, H(j10, t10));
                        iE += iComputeBoolSize;
                    }
                    break;
                case 54:
                    if (v(i16, i14, t10)) {
                        iComputeBoolSize = CodedOutputStream.computeUInt64Size(i16, H(j10, t10));
                        iE += iComputeBoolSize;
                    }
                    break;
                case 55:
                    if (v(i16, i14, t10)) {
                        iComputeBoolSize = CodedOutputStream.computeInt32Size(i16, G(j10, t10));
                        iE += iComputeBoolSize;
                    }
                    break;
                case 56:
                    if (v(i16, i14, t10)) {
                        iComputeBoolSize = CodedOutputStream.computeFixed64Size(i16, 0L);
                        iE += iComputeBoolSize;
                    }
                    break;
                case 57:
                    if (v(i16, i14, t10)) {
                        iComputeSFixed32Size = CodedOutputStream.computeFixed32Size(i16, 0);
                        iE += iComputeSFixed32Size;
                    }
                    break;
                case 58:
                    if (v(i16, i14, t10)) {
                        iComputeBoolSize = CodedOutputStream.computeBoolSize(i16, true);
                        iE += iComputeBoolSize;
                    }
                    break;
                case 59:
                    if (v(i16, i14, t10)) {
                        Object object2 = unsafe.getObject(t10, j10);
                        iComputeBytesSize = object2 instanceof ByteString ? CodedOutputStream.computeBytesSize(i16, (ByteString) object2) : CodedOutputStream.computeStringSize(i16, (String) object2);
                        iE = iComputeBytesSize + iE;
                    }
                    break;
                case 60:
                    if (v(i16, i14, t10)) {
                        iComputeBoolSize = r0.o(i16, p(i14), unsafe.getObject(t10, j10));
                        iE += iComputeBoolSize;
                    }
                    break;
                case 61:
                    if (v(i16, i14, t10)) {
                        iComputeBoolSize = CodedOutputStream.computeBytesSize(i16, (ByteString) unsafe.getObject(t10, j10));
                        iE += iComputeBoolSize;
                    }
                    break;
                case 62:
                    if (v(i16, i14, t10)) {
                        iComputeBoolSize = CodedOutputStream.computeUInt32Size(i16, G(j10, t10));
                        iE += iComputeBoolSize;
                    }
                    break;
                case 63:
                    if (v(i16, i14, t10)) {
                        iComputeBoolSize = CodedOutputStream.computeEnumSize(i16, G(j10, t10));
                        iE += iComputeBoolSize;
                    }
                    break;
                case 64:
                    if (v(i16, i14, t10)) {
                        iComputeSFixed32Size = CodedOutputStream.computeSFixed32Size(i16, 0);
                        iE += iComputeSFixed32Size;
                    }
                    break;
                case 65:
                    if (v(i16, i14, t10)) {
                        iComputeBoolSize = CodedOutputStream.computeSFixed64Size(i16, 0L);
                        iE += iComputeBoolSize;
                    }
                    break;
                case 66:
                    if (v(i16, i14, t10)) {
                        iComputeBoolSize = CodedOutputStream.computeSInt32Size(i16, G(j10, t10));
                        iE += iComputeBoolSize;
                    }
                    break;
                case 67:
                    if (v(i16, i14, t10)) {
                        iComputeBoolSize = CodedOutputStream.computeSInt64Size(i16, H(j10, t10));
                        iE += iComputeBoolSize;
                    }
                    break;
                case 68:
                    if (v(i16, i14, t10)) {
                        iComputeBoolSize = CodedOutputStream.a(i16, (MessageLite) unsafe.getObject(t10, j10), p(i14));
                        iE += iComputeBoolSize;
                    }
                    break;
                default:
                    break;
            }
            i14 += 3;
            i12 = 1048575;
        }
    }

    public final int s(T t10) {
        int iComputeDoubleSize;
        int iComputeBytesSize;
        int i10 = 0;
        int iE = 0;
        while (true) {
            int[] iArr = this.f47192a;
            if (i10 >= iArr.length) {
                v0<?, ?> v0Var = this.f47205o;
                return v0Var.h(v0Var.g(t10)) + iE;
            }
            int iY = Y(i10);
            int iX = X(iY);
            int i11 = iArr[i10];
            long j10 = iY & 1048575;
            int i12 = (iX < FieldType.DOUBLE_LIST_PACKED.id() || iX > FieldType.SINT64_LIST_PACKED.id()) ? 0 : iArr[i10 + 2] & 1048575;
            boolean z10 = this.f47200i;
            Unsafe unsafe = f47191s;
            switch (iX) {
                case 0:
                    if (t(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(i11, 0.0d);
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 1:
                    if (t(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(i11, 0.0f);
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 2:
                    if (t(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(i11, x0.m(j10, t10));
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 3:
                    if (t(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(i11, x0.m(j10, t10));
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 4:
                    if (t(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(i11, x0.l(j10, t10));
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 5:
                    if (t(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(i11, 0L);
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 6:
                    if (t(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(i11, 0);
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 7:
                    if (t(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeBoolSize(i11, true);
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 8:
                    if (t(i10, t10)) {
                        Object objN = x0.n(j10, t10);
                        iComputeBytesSize = objN instanceof ByteString ? CodedOutputStream.computeBytesSize(i11, (ByteString) objN) : CodedOutputStream.computeStringSize(i11, (String) objN);
                        iE = iComputeBytesSize + iE;
                    }
                    break;
                case 9:
                    if (t(i10, t10)) {
                        iComputeDoubleSize = r0.o(i11, p(i10), x0.n(j10, t10));
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 10:
                    if (t(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeBytesSize(i11, (ByteString) x0.n(j10, t10));
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 11:
                    if (t(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt32Size(i11, x0.l(j10, t10));
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 12:
                    if (t(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeEnumSize(i11, x0.l(j10, t10));
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 13:
                    if (t(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed32Size(i11, 0);
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 14:
                    if (t(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed64Size(i11, 0L);
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 15:
                    if (t(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt32Size(i11, x0.l(j10, t10));
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 16:
                    if (t(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt64Size(i11, x0.m(j10, t10));
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 17:
                    if (t(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.a(i11, (MessageLite) x0.n(j10, t10), p(i10));
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 18:
                    iComputeDoubleSize = r0.h(i11, w(j10, t10));
                    iE += iComputeDoubleSize;
                    break;
                case 19:
                    iComputeDoubleSize = r0.f(i11, w(j10, t10));
                    iE += iComputeDoubleSize;
                    break;
                case 20:
                    iComputeDoubleSize = r0.m(i11, w(j10, t10));
                    iE += iComputeDoubleSize;
                    break;
                case 21:
                    iComputeDoubleSize = r0.x(i11, w(j10, t10));
                    iE += iComputeDoubleSize;
                    break;
                case 22:
                    iComputeDoubleSize = r0.k(i11, w(j10, t10));
                    iE += iComputeDoubleSize;
                    break;
                case 23:
                    iComputeDoubleSize = r0.h(i11, w(j10, t10));
                    iE += iComputeDoubleSize;
                    break;
                case 24:
                    iComputeDoubleSize = r0.f(i11, w(j10, t10));
                    iE += iComputeDoubleSize;
                    break;
                case 25:
                    iComputeDoubleSize = r0.a(i11, w(j10, t10));
                    iE += iComputeDoubleSize;
                    break;
                case 26:
                    iComputeDoubleSize = r0.u(i11, w(j10, t10));
                    iE += iComputeDoubleSize;
                    break;
                case 27:
                    iComputeDoubleSize = r0.p(i11, w(j10, t10), p(i10));
                    iE += iComputeDoubleSize;
                    break;
                case 28:
                    iComputeDoubleSize = r0.c(i11, w(j10, t10));
                    iE += iComputeDoubleSize;
                    break;
                case 29:
                    iComputeDoubleSize = r0.v(i11, w(j10, t10));
                    iE += iComputeDoubleSize;
                    break;
                case 30:
                    iComputeDoubleSize = r0.d(i11, w(j10, t10));
                    iE += iComputeDoubleSize;
                    break;
                case 31:
                    iComputeDoubleSize = r0.f(i11, w(j10, t10));
                    iE += iComputeDoubleSize;
                    break;
                case 32:
                    iComputeDoubleSize = r0.h(i11, w(j10, t10));
                    iE += iComputeDoubleSize;
                    break;
                case 33:
                    iComputeDoubleSize = r0.q(i11, w(j10, t10));
                    iE += iComputeDoubleSize;
                    break;
                case 34:
                    iComputeDoubleSize = r0.s(i11, w(j10, t10));
                    iE += iComputeDoubleSize;
                    break;
                case 35:
                    int i13 = r0.i((List) unsafe.getObject(t10, j10));
                    if (i13 > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i12, i13);
                        }
                        iE = androidx.appcompat.widget.g0.e(i13, CodedOutputStream.computeTagSize(i11), i13, iE);
                    }
                    break;
                case 36:
                    int iG = r0.g((List) unsafe.getObject(t10, j10));
                    if (iG > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i12, iG);
                        }
                        iE = androidx.appcompat.widget.g0.e(iG, CodedOutputStream.computeTagSize(i11), iG, iE);
                    }
                    break;
                case 37:
                    int iN = r0.n((List) unsafe.getObject(t10, j10));
                    if (iN > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i12, iN);
                        }
                        iE = androidx.appcompat.widget.g0.e(iN, CodedOutputStream.computeTagSize(i11), iN, iE);
                    }
                    break;
                case 38:
                    int iY2 = r0.y((List) unsafe.getObject(t10, j10));
                    if (iY2 > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i12, iY2);
                        }
                        iE = androidx.appcompat.widget.g0.e(iY2, CodedOutputStream.computeTagSize(i11), iY2, iE);
                    }
                    break;
                case 39:
                    int iL = r0.l((List) unsafe.getObject(t10, j10));
                    if (iL > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i12, iL);
                        }
                        iE = androidx.appcompat.widget.g0.e(iL, CodedOutputStream.computeTagSize(i11), iL, iE);
                    }
                    break;
                case 40:
                    int i14 = r0.i((List) unsafe.getObject(t10, j10));
                    if (i14 > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i12, i14);
                        }
                        iE = androidx.appcompat.widget.g0.e(i14, CodedOutputStream.computeTagSize(i11), i14, iE);
                    }
                    break;
                case 41:
                    int iG2 = r0.g((List) unsafe.getObject(t10, j10));
                    if (iG2 > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i12, iG2);
                        }
                        iE = androidx.appcompat.widget.g0.e(iG2, CodedOutputStream.computeTagSize(i11), iG2, iE);
                    }
                    break;
                case 42:
                    int iB = r0.b((List) unsafe.getObject(t10, j10));
                    if (iB > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i12, iB);
                        }
                        iE = androidx.appcompat.widget.g0.e(iB, CodedOutputStream.computeTagSize(i11), iB, iE);
                    }
                    break;
                case 43:
                    int iW = r0.w((List) unsafe.getObject(t10, j10));
                    if (iW > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i12, iW);
                        }
                        iE = androidx.appcompat.widget.g0.e(iW, CodedOutputStream.computeTagSize(i11), iW, iE);
                    }
                    break;
                case 44:
                    int iE2 = r0.e((List) unsafe.getObject(t10, j10));
                    if (iE2 > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i12, iE2);
                        }
                        iE = androidx.appcompat.widget.g0.e(iE2, CodedOutputStream.computeTagSize(i11), iE2, iE);
                    }
                    break;
                case 45:
                    int iG3 = r0.g((List) unsafe.getObject(t10, j10));
                    if (iG3 > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i12, iG3);
                        }
                        iE = androidx.appcompat.widget.g0.e(iG3, CodedOutputStream.computeTagSize(i11), iG3, iE);
                    }
                    break;
                case 46:
                    int i15 = r0.i((List) unsafe.getObject(t10, j10));
                    if (i15 > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i12, i15);
                        }
                        iE = androidx.appcompat.widget.g0.e(i15, CodedOutputStream.computeTagSize(i11), i15, iE);
                    }
                    break;
                case 47:
                    int iR = r0.r((List) unsafe.getObject(t10, j10));
                    if (iR > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i12, iR);
                        }
                        iE = androidx.appcompat.widget.g0.e(iR, CodedOutputStream.computeTagSize(i11), iR, iE);
                    }
                    break;
                case 48:
                    int iT = r0.t((List) unsafe.getObject(t10, j10));
                    if (iT > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i12, iT);
                        }
                        iE = androidx.appcompat.widget.g0.e(iT, CodedOutputStream.computeTagSize(i11), iT, iE);
                    }
                    break;
                case 49:
                    iComputeDoubleSize = r0.j(i11, w(j10, t10), p(i10));
                    iE += iComputeDoubleSize;
                    break;
                case 50:
                    iComputeDoubleSize = this.f47207q.g(i11, x0.n(j10, t10), o(i10));
                    iE += iComputeDoubleSize;
                    break;
                case 51:
                    if (v(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(i11, 0.0d);
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 52:
                    if (v(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(i11, 0.0f);
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 53:
                    if (v(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(i11, H(j10, t10));
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 54:
                    if (v(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(i11, H(j10, t10));
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 55:
                    if (v(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(i11, G(j10, t10));
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 56:
                    if (v(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(i11, 0L);
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 57:
                    if (v(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(i11, 0);
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 58:
                    if (v(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeBoolSize(i11, true);
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 59:
                    if (v(i11, i10, t10)) {
                        Object objN2 = x0.n(j10, t10);
                        iComputeBytesSize = objN2 instanceof ByteString ? CodedOutputStream.computeBytesSize(i11, (ByteString) objN2) : CodedOutputStream.computeStringSize(i11, (String) objN2);
                        iE = iComputeBytesSize + iE;
                    }
                    break;
                case 60:
                    if (v(i11, i10, t10)) {
                        iComputeDoubleSize = r0.o(i11, p(i10), x0.n(j10, t10));
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 61:
                    if (v(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeBytesSize(i11, (ByteString) x0.n(j10, t10));
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 62:
                    if (v(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt32Size(i11, G(j10, t10));
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 63:
                    if (v(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeEnumSize(i11, G(j10, t10));
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 64:
                    if (v(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed32Size(i11, 0);
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 65:
                    if (v(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed64Size(i11, 0L);
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 66:
                    if (v(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt32Size(i11, G(j10, t10));
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 67:
                    if (v(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt64Size(i11, H(j10, t10));
                        iE += iComputeDoubleSize;
                    }
                    break;
                case 68:
                    if (v(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.a(i11, (MessageLite) x0.n(j10, t10), p(i10));
                        iE += iComputeDoubleSize;
                    }
                    break;
            }
            i10 += 3;
        }
    }

    public final boolean t(int i10, Object obj) {
        int i11 = this.f47192a[i10 + 2];
        long j10 = i11 & 1048575;
        if (j10 != 1048575) {
            return ((1 << (i11 >>> 20)) & x0.f47308c.j(j10, obj)) != 0;
        }
        int iY = Y(i10);
        long j11 = iY & 1048575;
        switch (X(iY)) {
            case 0:
                return Double.doubleToRawLongBits(x0.f47308c.h(j11, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(x0.f47308c.i(j11, obj)) != 0;
            case 2:
                return x0.f47308c.l(j11, obj) != 0;
            case 3:
                return x0.f47308c.l(j11, obj) != 0;
            case 4:
                return x0.f47308c.j(j11, obj) != 0;
            case 5:
                return x0.f47308c.l(j11, obj) != 0;
            case 6:
                return x0.f47308c.j(j11, obj) != 0;
            case 7:
                return x0.f47308c.e(j11, obj);
            case 8:
                Object objM = x0.f47308c.m(j11, obj);
                if (objM instanceof String) {
                    return !((String) objM).isEmpty();
                }
                if (objM instanceof ByteString) {
                    return !ByteString.EMPTY.equals(objM);
                }
                throw new IllegalArgumentException();
            case 9:
                return x0.f47308c.m(j11, obj) != null;
            case 10:
                return !ByteString.EMPTY.equals(x0.f47308c.m(j11, obj));
            case 11:
                return x0.f47308c.j(j11, obj) != 0;
            case 12:
                return x0.f47308c.j(j11, obj) != 0;
            case 13:
                return x0.f47308c.j(j11, obj) != 0;
            case 14:
                return x0.f47308c.l(j11, obj) != 0;
            case 15:
                return x0.f47308c.j(j11, obj) != 0;
            case 16:
                return x0.f47308c.l(j11, obj) != 0;
            case 17:
                return x0.f47308c.m(j11, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean v(int i10, int i11, Object obj) {
        return x0.f47308c.j((long) (this.f47192a[i11 + 2] & 1048575), obj) == i10;
    }

    /* JADX WARN: Code duplicated, block: B:186:0x0785 A[Catch: all -> 0x078b, TryCatch #6 {all -> 0x078b, blocks: (B:184:0x0780, B:186:0x0785, B:189:0x078e), top: B:216:0x0780 }] */
    /* JADX WARN: Code duplicated, block: B:193:0x079b A[LOOP:2: B:192:0x0799->B:193:0x079b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:195:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:207:0x07cd A[LOOP:3: B:206:0x07cb->B:207:0x07cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:209:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:243:0x0794 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> void x(v0<UT, UB> v0Var, i<ET> iVar, T t10, o0 o0Var, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        int i10;
        int[] iArr;
        T t11;
        Object objM;
        int i11;
        int i12;
        T t12;
        Object objD;
        Object objM2;
        int i13;
        int i14;
        Object obj;
        v0 v0Var2;
        v0 v0Var3 = v0Var;
        T t13 = t10;
        int[] iArr2 = this.f47201j;
        int i15 = this.f47203l;
        int i16 = this.f47202k;
        Object objM3 = null;
        Object obj2 = null;
        while (true) {
            try {
                e eVar = (e) o0Var;
                int iA = eVar.a();
                try {
                    int iU = (iA < this.f47194c || iA > this.f47195d) ? -1 : U(iA, 0);
                    if (iU >= 0) {
                        int i17 = i15;
                        iArr = iArr2;
                        t11 = t13;
                        try {
                            int iY = Y(iU);
                            try {
                                int iX = X(iY);
                                CodedInputStream codedInputStream = eVar.f47209a;
                                u uVar = this.f47204n;
                                switch (iX) {
                                    case 0:
                                        i16 = i16;
                                        i17 = i17;
                                        obj = objM3;
                                        long jF = F(iY);
                                        eVar.x(1);
                                        x0.u(t11, jF, codedInputStream.readDouble());
                                        S(iU, t11);
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 1:
                                        i16 = i16;
                                        i17 = i17;
                                        obj = objM3;
                                        long jF2 = F(iY);
                                        eVar.x(5);
                                        x0.v(t11, jF2, codedInputStream.readFloat());
                                        S(iU, t11);
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 2:
                                        i16 = i16;
                                        i17 = i17;
                                        obj = objM3;
                                        long jF3 = F(iY);
                                        eVar.x(0);
                                        x0.x(t11, jF3, codedInputStream.readInt64());
                                        S(iU, t11);
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 3:
                                        i16 = i16;
                                        i17 = i17;
                                        obj = objM3;
                                        long jF4 = F(iY);
                                        eVar.x(0);
                                        x0.x(t11, jF4, codedInputStream.readUInt64());
                                        S(iU, t11);
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 4:
                                        i16 = i16;
                                        i17 = i17;
                                        obj = objM3;
                                        long jF5 = F(iY);
                                        eVar.x(0);
                                        x0.w(codedInputStream.readInt32(), jF5, t11);
                                        S(iU, t11);
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 5:
                                        i16 = i16;
                                        i17 = i17;
                                        obj = objM3;
                                        long jF6 = F(iY);
                                        eVar.x(1);
                                        x0.x(t11, jF6, codedInputStream.readFixed64());
                                        S(iU, t11);
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 6:
                                        i16 = i16;
                                        i17 = i17;
                                        obj = objM3;
                                        long jF7 = F(iY);
                                        eVar.x(5);
                                        x0.w(codedInputStream.readFixed32(), jF7, t11);
                                        S(iU, t11);
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 7:
                                        i16 = i16;
                                        i17 = i17;
                                        obj = objM3;
                                        long jF8 = F(iY);
                                        eVar.x(0);
                                        x0.p(t11, jF8, codedInputStream.readBool());
                                        S(iU, t11);
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 8:
                                        i16 = i16;
                                        i17 = i17;
                                        obj = objM3;
                                        P(t11, iY, eVar);
                                        S(iU, t11);
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 9:
                                        i16 = i16;
                                        i17 = i17;
                                        obj = objM3;
                                        MessageLite messageLite = (MessageLite) B(iU, t11);
                                        q0<T> q0VarP = p(iU);
                                        eVar.x(2);
                                        eVar.c(messageLite, q0VarP, extensionRegistryLite);
                                        V(iU, t11, messageLite);
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 10:
                                        i16 = i16;
                                        i17 = i17;
                                        obj = objM3;
                                        x0.y(F(iY), t11, eVar.e());
                                        S(iU, t11);
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 11:
                                        i16 = i16;
                                        i17 = i17;
                                        obj = objM3;
                                        long jF9 = F(iY);
                                        eVar.x(0);
                                        x0.w(codedInputStream.readUInt32(), jF9, t11);
                                        S(iU, t11);
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 12:
                                        i16 = i16;
                                        i17 = i17;
                                        obj = objM3;
                                        eVar.x(0);
                                        int i18 = codedInputStream.readEnum();
                                        Internal.EnumVerifier enumVerifierN = n(iU);
                                        if (enumVerifierN == null || enumVerifierN.isInRange(i18)) {
                                            x0.w(i18, F(iY), t11);
                                            S(iU, t11);
                                            objM3 = obj;
                                        } else {
                                            objM3 = r0.D(t11, iA, i18, obj, v0Var3);
                                        }
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 13:
                                        i16 = i16;
                                        i17 = i17;
                                        obj = objM3;
                                        long jF10 = F(iY);
                                        eVar.x(5);
                                        x0.w(codedInputStream.readSFixed32(), jF10, t11);
                                        S(iU, t11);
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 14:
                                        i16 = i16;
                                        i17 = i17;
                                        obj = objM3;
                                        long jF11 = F(iY);
                                        eVar.x(1);
                                        x0.x(t11, jF11, codedInputStream.readSFixed64());
                                        S(iU, t11);
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 15:
                                        i16 = i16;
                                        i17 = i17;
                                        obj = objM3;
                                        long jF12 = F(iY);
                                        eVar.x(0);
                                        x0.w(codedInputStream.readSInt32(), jF12, t11);
                                        S(iU, t11);
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 16:
                                        i16 = i16;
                                        i17 = i17;
                                        obj = objM3;
                                        long jF13 = F(iY);
                                        eVar.x(0);
                                        x0.x(t11, jF13, codedInputStream.readSInt64());
                                        S(iU, t11);
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 17:
                                        i16 = i16;
                                        v0Var2 = v0Var3;
                                        i17 = i17;
                                        obj = objM3;
                                        MessageLite messageLite2 = (MessageLite) B(iU, t11);
                                        q0<T> q0VarP2 = p(iU);
                                        eVar.x(3);
                                        eVar.b(messageLite2, q0VarP2, extensionRegistryLite);
                                        V(iU, t11, messageLite2);
                                        v0Var3 = v0Var2;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 18:
                                        i16 = i16;
                                        v0Var2 = v0Var3;
                                        i17 = i17;
                                        obj = objM3;
                                        eVar.g(uVar.c(F(iY), t11));
                                        v0Var3 = v0Var2;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 19:
                                        i16 = i16;
                                        v0Var2 = v0Var3;
                                        i17 = i17;
                                        obj = objM3;
                                        eVar.l(uVar.c(F(iY), t11));
                                        v0Var3 = v0Var2;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 20:
                                        i16 = i16;
                                        v0Var2 = v0Var3;
                                        i17 = i17;
                                        obj = objM3;
                                        eVar.n(uVar.c(F(iY), t11));
                                        v0Var3 = v0Var2;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 21:
                                        i16 = i16;
                                        v0Var2 = v0Var3;
                                        i17 = i17;
                                        obj = objM3;
                                        eVar.v(uVar.c(F(iY), t11));
                                        v0Var3 = v0Var2;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 22:
                                        i16 = i16;
                                        v0Var2 = v0Var3;
                                        i17 = i17;
                                        obj = objM3;
                                        eVar.m(uVar.c(F(iY), t11));
                                        v0Var3 = v0Var2;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 23:
                                        i16 = i16;
                                        v0Var2 = v0Var3;
                                        i17 = i17;
                                        obj = objM3;
                                        eVar.k(uVar.c(F(iY), t11));
                                        v0Var3 = v0Var2;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 24:
                                        i16 = i16;
                                        v0Var2 = v0Var3;
                                        i17 = i17;
                                        obj = objM3;
                                        eVar.j(uVar.c(F(iY), t11));
                                        v0Var3 = v0Var2;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 25:
                                        i16 = i16;
                                        v0Var2 = v0Var3;
                                        i17 = i17;
                                        obj = objM3;
                                        eVar.d(uVar.c(F(iY), t11));
                                        v0Var3 = v0Var2;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 26:
                                        i16 = i16;
                                        v0Var2 = v0Var3;
                                        i17 = i17;
                                        obj = objM3;
                                        Q(t11, iY, eVar);
                                        v0Var3 = v0Var2;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 27:
                                        i16 = i16;
                                        v0Var2 = v0Var3;
                                        i17 = i17;
                                        obj = objM3;
                                        O(t10, iY, eVar, p(iU), extensionRegistryLite);
                                        v0Var3 = v0Var2;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 28:
                                        i16 = i16;
                                        v0Var2 = v0Var3;
                                        i17 = i17;
                                        obj = objM3;
                                        eVar.f(uVar.c(F(iY), t11));
                                        v0Var3 = v0Var2;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 29:
                                        i16 = i16;
                                        v0Var2 = v0Var3;
                                        i17 = i17;
                                        obj = objM3;
                                        eVar.u(uVar.c(F(iY), t11));
                                        v0Var3 = v0Var2;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 30:
                                        List<Integer> listC = uVar.c(F(iY), t11);
                                        eVar.h(listC);
                                        objM3 = r0.A(t10, iA, listC, n(iU), objM3, v0Var);
                                        v0Var3 = v0Var3;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 31:
                                        i16 = i16;
                                        v0Var2 = v0Var3;
                                        i17 = i17;
                                        obj = objM3;
                                        eVar.p(uVar.c(F(iY), t11));
                                        v0Var3 = v0Var2;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 32:
                                        i16 = i16;
                                        v0Var2 = v0Var3;
                                        i17 = i17;
                                        obj = objM3;
                                        eVar.q(uVar.c(F(iY), t11));
                                        v0Var3 = v0Var2;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 33:
                                        i16 = i16;
                                        v0Var2 = v0Var3;
                                        i17 = i17;
                                        obj = objM3;
                                        eVar.r(uVar.c(F(iY), t11));
                                        v0Var3 = v0Var2;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 34:
                                        i16 = i16;
                                        v0Var2 = v0Var3;
                                        i17 = i17;
                                        obj = objM3;
                                        eVar.s(uVar.c(F(iY), t11));
                                        v0Var3 = v0Var2;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 35:
                                        i16 = i16;
                                        v0Var2 = v0Var3;
                                        i17 = i17;
                                        obj = objM3;
                                        eVar.g(uVar.c(F(iY), t11));
                                        v0Var3 = v0Var2;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 36:
                                        i16 = i16;
                                        v0Var2 = v0Var3;
                                        i17 = i17;
                                        obj = objM3;
                                        eVar.l(uVar.c(F(iY), t11));
                                        v0Var3 = v0Var2;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 37:
                                        i16 = i16;
                                        v0Var2 = v0Var3;
                                        i17 = i17;
                                        obj = objM3;
                                        eVar.n(uVar.c(F(iY), t11));
                                        v0Var3 = v0Var2;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 38:
                                        i16 = i16;
                                        v0Var2 = v0Var3;
                                        i17 = i17;
                                        obj = objM3;
                                        eVar.v(uVar.c(F(iY), t11));
                                        v0Var3 = v0Var2;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 39:
                                        i16 = i16;
                                        v0Var2 = v0Var3;
                                        i17 = i17;
                                        obj = objM3;
                                        eVar.m(uVar.c(F(iY), t11));
                                        v0Var3 = v0Var2;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 40:
                                        i16 = i16;
                                        v0Var2 = v0Var3;
                                        i17 = i17;
                                        obj = objM3;
                                        eVar.k(uVar.c(F(iY), t11));
                                        v0Var3 = v0Var2;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 41:
                                        i16 = i16;
                                        v0Var2 = v0Var3;
                                        i17 = i17;
                                        obj = objM3;
                                        eVar.j(uVar.c(F(iY), t11));
                                        v0Var3 = v0Var2;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 42:
                                        i16 = i16;
                                        v0Var2 = v0Var3;
                                        i17 = i17;
                                        obj = objM3;
                                        eVar.d(uVar.c(F(iY), t11));
                                        v0Var3 = v0Var2;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 43:
                                        i16 = i16;
                                        v0Var2 = v0Var3;
                                        i17 = i17;
                                        obj = objM3;
                                        eVar.u(uVar.c(F(iY), t11));
                                        v0Var3 = v0Var2;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 44:
                                        List<Integer> listC2 = uVar.c(F(iY), t11);
                                        eVar.h(listC2);
                                        objM3 = r0.A(t10, iA, listC2, n(iU), objM3, v0Var);
                                        v0Var3 = v0Var3;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 45:
                                        i16 = i16;
                                        v0Var2 = v0Var3;
                                        i17 = i17;
                                        obj = objM3;
                                        eVar.p(uVar.c(F(iY), t11));
                                        v0Var3 = v0Var2;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 46:
                                        i16 = i16;
                                        v0Var2 = v0Var3;
                                        i17 = i17;
                                        obj = objM3;
                                        eVar.q(uVar.c(F(iY), t11));
                                        v0Var3 = v0Var2;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 47:
                                        i16 = i16;
                                        v0Var2 = v0Var3;
                                        i17 = i17;
                                        obj = objM3;
                                        eVar.r(uVar.c(F(iY), t11));
                                        v0Var3 = v0Var2;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 48:
                                        i16 = i16;
                                        v0Var2 = v0Var3;
                                        i17 = i17;
                                        obj = objM3;
                                        eVar.s(uVar.c(F(iY), t11));
                                        v0Var3 = v0Var2;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 49:
                                        i16 = i16;
                                        i17 = i17;
                                        obj = objM3;
                                        v0Var2 = v0Var3;
                                        try {
                                            N(t10, F(iY), eVar, p(iU), extensionRegistryLite);
                                            v0Var3 = v0Var2;
                                            objM3 = obj;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                            objM3 = obj;
                                            v0Var3 = v0Var2;
                                            try {
                                                v0Var.p();
                                                if (objM3 == null) {
                                                    objM3 = v0Var3.f(t11);
                                                }
                                                if (!v0Var3.l(objM3, eVar)) {
                                                    objM2 = objM3;
                                                    i13 = i17;
                                                    for (i14 = i16; i14 < i13; i14++) {
                                                        objM2 = m(t10, iArr[i14], objM2, v0Var, t10);
                                                    }
                                                    if (objM2 != null) {
                                                        v0Var3.n(t11, objM2);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                i10 = i17;
                                                objM = objM3;
                                                for (i11 = i16; i11 < i10; i11++) {
                                                    objM = m(t10, iArr[i11], objM, v0Var, t10);
                                                }
                                                if (objM != null) {
                                                    v0Var3.n(t11, objM);
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            objM3 = obj;
                                            v0Var3 = v0Var2;
                                            i10 = i17;
                                            objM = objM3;
                                            while (i11 < i10) {
                                                objM = m(t10, iArr[i11], objM, v0Var, t10);
                                            }
                                            if (objM != null) {
                                                v0Var3.n(t11, objM);
                                            }
                                            throw th;
                                        }
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 50:
                                        i17 = i17;
                                        try {
                                            obj = objM3;
                                            i16 = i16;
                                            try {
                                                y(t10, iU, o(iU), extensionRegistryLite, eVar);
                                                objM3 = obj;
                                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                                objM3 = obj;
                                                v0Var.p();
                                                if (objM3 == null) {
                                                    objM3 = v0Var3.f(t11);
                                                }
                                                if (!v0Var3.l(objM3, eVar)) {
                                                    objM2 = objM3;
                                                    i13 = i17;
                                                    while (i14 < i13) {
                                                        objM2 = m(t10, iArr[i14], objM2, v0Var, t10);
                                                    }
                                                    if (objM2 != null) {
                                                        v0Var3.n(t11, objM2);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                objM3 = obj;
                                                i10 = i17;
                                                objM = objM3;
                                                while (i11 < i10) {
                                                    objM = m(t10, iArr[i11], objM, v0Var, t10);
                                                }
                                                if (objM != null) {
                                                    v0Var3.n(t11, objM);
                                                }
                                                throw th;
                                            }
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                            i16 = i16;
                                            v0Var.p();
                                            if (objM3 == null) {
                                                objM3 = v0Var3.f(t11);
                                            }
                                            if (!v0Var3.l(objM3, eVar)) {
                                                objM2 = objM3;
                                                i13 = i17;
                                                while (i14 < i13) {
                                                    objM2 = m(t10, iArr[i14], objM2, v0Var, t10);
                                                }
                                                if (objM2 != null) {
                                                    v0Var3.n(t11, objM2);
                                                    return;
                                                }
                                                return;
                                            }
                                            t13 = t11;
                                            i15 = i17;
                                            iArr2 = iArr;
                                            i16 = i16;
                                            break;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            i16 = i16;
                                            i10 = i17;
                                            objM = objM3;
                                            while (i11 < i10) {
                                                objM = m(t10, iArr[i11], objM, v0Var, t10);
                                            }
                                            if (objM != null) {
                                                v0Var3.n(t11, objM);
                                            }
                                            throw th;
                                        }
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 51:
                                        i17 = i17;
                                        long jF14 = F(iY);
                                        eVar.x(1);
                                        x0.y(jF14, t11, Double.valueOf(codedInputStream.readDouble()));
                                        T(iA, iU, t11);
                                        obj = objM3;
                                        i16 = i16;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 52:
                                        i17 = i17;
                                        long jF15 = F(iY);
                                        eVar.x(5);
                                        x0.y(jF15, t11, Float.valueOf(codedInputStream.readFloat()));
                                        T(iA, iU, t11);
                                        obj = objM3;
                                        i16 = i16;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 53:
                                        i17 = i17;
                                        long jF16 = F(iY);
                                        eVar.x(0);
                                        x0.y(jF16, t11, Long.valueOf(codedInputStream.readInt64()));
                                        T(iA, iU, t11);
                                        obj = objM3;
                                        i16 = i16;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 54:
                                        i17 = i17;
                                        long jF17 = F(iY);
                                        eVar.x(0);
                                        x0.y(jF17, t11, Long.valueOf(codedInputStream.readUInt64()));
                                        T(iA, iU, t11);
                                        obj = objM3;
                                        i16 = i16;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 55:
                                        i17 = i17;
                                        long jF18 = F(iY);
                                        eVar.x(0);
                                        x0.y(jF18, t11, Integer.valueOf(codedInputStream.readInt32()));
                                        T(iA, iU, t11);
                                        obj = objM3;
                                        i16 = i16;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 56:
                                        i17 = i17;
                                        long jF19 = F(iY);
                                        eVar.x(1);
                                        x0.y(jF19, t11, Long.valueOf(codedInputStream.readFixed64()));
                                        T(iA, iU, t11);
                                        obj = objM3;
                                        i16 = i16;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 57:
                                        i17 = i17;
                                        long jF20 = F(iY);
                                        eVar.x(5);
                                        x0.y(jF20, t11, Integer.valueOf(codedInputStream.readFixed32()));
                                        T(iA, iU, t11);
                                        obj = objM3;
                                        i16 = i16;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 58:
                                        i17 = i17;
                                        long jF21 = F(iY);
                                        eVar.x(0);
                                        x0.y(jF21, t11, Boolean.valueOf(codedInputStream.readBool()));
                                        T(iA, iU, t11);
                                        obj = objM3;
                                        i16 = i16;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 59:
                                        i17 = i17;
                                        P(t11, iY, eVar);
                                        T(iA, iU, t11);
                                        obj = objM3;
                                        i16 = i16;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 60:
                                        i17 = i17;
                                        MessageLite messageLite3 = (MessageLite) C(iA, iU, t11);
                                        q0<T> q0VarP3 = p(iU);
                                        eVar.x(2);
                                        eVar.c(messageLite3, q0VarP3, extensionRegistryLite);
                                        W(iA, t11, iU, messageLite3);
                                        obj = objM3;
                                        i16 = i16;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 61:
                                        i17 = i17;
                                        x0.y(F(iY), t11, eVar.e());
                                        T(iA, iU, t11);
                                        obj = objM3;
                                        i16 = i16;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 62:
                                        i17 = i17;
                                        long jF22 = F(iY);
                                        eVar.x(0);
                                        x0.y(jF22, t11, Integer.valueOf(codedInputStream.readUInt32()));
                                        T(iA, iU, t11);
                                        obj = objM3;
                                        i16 = i16;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 63:
                                        i17 = i17;
                                        eVar.x(0);
                                        int i19 = codedInputStream.readEnum();
                                        Internal.EnumVerifier enumVerifierN2 = n(iU);
                                        if (enumVerifierN2 == null || enumVerifierN2.isInRange(i19)) {
                                            x0.y(F(iY), t11, Integer.valueOf(i19));
                                            T(iA, iU, t11);
                                            obj = objM3;
                                            i16 = i16;
                                            objM3 = obj;
                                        } else {
                                            objM3 = r0.D(t11, iA, i19, objM3, v0Var3);
                                            i16 = i16;
                                        }
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 64:
                                        i17 = i17;
                                        long jF23 = F(iY);
                                        eVar.x(5);
                                        x0.y(jF23, t11, Integer.valueOf(codedInputStream.readSFixed32()));
                                        T(iA, iU, t11);
                                        obj = objM3;
                                        i16 = i16;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 65:
                                        i17 = i17;
                                        long jF24 = F(iY);
                                        eVar.x(1);
                                        x0.y(jF24, t11, Long.valueOf(codedInputStream.readSFixed64()));
                                        T(iA, iU, t11);
                                        obj = objM3;
                                        i16 = i16;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 66:
                                        i17 = i17;
                                        long jF25 = F(iY);
                                        eVar.x(0);
                                        x0.y(jF25, t11, Integer.valueOf(codedInputStream.readSInt32()));
                                        T(iA, iU, t11);
                                        obj = objM3;
                                        i16 = i16;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 67:
                                        i17 = i17;
                                        try {
                                            long jF26 = F(iY);
                                            eVar.x(0);
                                            x0.y(jF26, t11, Long.valueOf(codedInputStream.readSInt64()));
                                            T(iA, iU, t11);
                                            obj = objM3;
                                            i16 = i16;
                                            objM3 = obj;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                            i16 = i16;
                                            v0Var.p();
                                            if (objM3 == null) {
                                                objM3 = v0Var3.f(t11);
                                            }
                                            if (!v0Var3.l(objM3, eVar)) {
                                                objM2 = objM3;
                                                i13 = i17;
                                                while (i14 < i13) {
                                                    objM2 = m(t10, iArr[i14], objM2, v0Var, t10);
                                                }
                                                if (objM2 != null) {
                                                    v0Var3.n(t11, objM2);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            i16 = i16;
                                            i10 = i17;
                                            objM = objM3;
                                            while (i11 < i10) {
                                                objM = m(t10, iArr[i11], objM, v0Var, t10);
                                            }
                                            if (objM != null) {
                                                v0Var3.n(t11, objM);
                                            }
                                            throw th;
                                        }
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    case 68:
                                        MessageLite messageLite4 = (MessageLite) C(iA, iU, t11);
                                        q0<T> q0VarP4 = p(iU);
                                        eVar.x(3);
                                        eVar.b(messageLite4, q0VarP4, extensionRegistryLite);
                                        W(iA, t11, iU, messageLite4);
                                        i16 = i16;
                                        i17 = i17;
                                        obj = objM3;
                                        objM3 = obj;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                    default:
                                        if (objM3 == null) {
                                            try {
                                                objM3 = v0Var3.f(t11);
                                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                                                i16 = i16;
                                                i17 = i17;
                                                v0Var.p();
                                                if (objM3 == null) {
                                                    objM3 = v0Var3.f(t11);
                                                }
                                                if (!v0Var3.l(objM3, eVar)) {
                                                    objM2 = objM3;
                                                    i13 = i17;
                                                    while (i14 < i13) {
                                                        objM2 = m(t10, iArr[i14], objM2, v0Var, t10);
                                                    }
                                                    if (objM2 != null) {
                                                        v0Var3.n(t11, objM2);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                i16 = i16;
                                                i10 = i17;
                                                objM = objM3;
                                                while (i11 < i10) {
                                                    objM = m(t10, iArr[i11], objM, v0Var, t10);
                                                }
                                                if (objM != null) {
                                                    v0Var3.n(t11, objM);
                                                }
                                                throw th;
                                            }
                                        }
                                        if (!v0Var3.l(objM3, eVar)) {
                                            Object objM4 = objM3;
                                            for (int i20 = i16; i20 < i17; i20++) {
                                                objM4 = m(t10, iArr[i20], objM4, v0Var, t10);
                                            }
                                            if (objM4 != null) {
                                                v0Var3.n(t11, objM4);
                                                return;
                                            }
                                            return;
                                        }
                                        i16 = i16;
                                        i17 = i17;
                                        t13 = t11;
                                        i15 = i17;
                                        iArr2 = iArr;
                                        i16 = i16;
                                        break;
                                        break;
                                }
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused6) {
                                i16 = i16;
                                i17 = i17;
                            } catch (Throwable th8) {
                                th = th8;
                                i16 = i16;
                                i17 = i17;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            i16 = i16;
                            i10 = i17;
                        }
                    } else {
                        if (iA == Integer.MAX_VALUE) {
                            Object objM5 = objM3;
                            for (int i21 = i16; i21 < i15; i21++) {
                                objM5 = m(t10, iArr2[i21], objM5, v0Var, t10);
                            }
                            if (objM5 != null) {
                                v0Var3.n(t13, objM5);
                                return;
                            }
                            return;
                        }
                        try {
                            GeneratedMessageLite.GeneratedExtension generatedExtensionB = !this.f47197f ? null : iVar.b(extensionRegistryLite, this.f47196e, iA);
                            if (generatedExtensionB != null) {
                                if (obj2 == null) {
                                    try {
                                        objD = iVar.d(t10);
                                    } catch (Throwable th10) {
                                        th = th10;
                                        i16 = i16;
                                        i10 = i15;
                                        iArr = iArr2;
                                        t11 = t13;
                                        objM = objM3;
                                        while (i11 < i10) {
                                            objM = m(t10, iArr[i11], objM, v0Var, t10);
                                        }
                                        if (objM != null) {
                                            v0Var3.n(t11, objM);
                                        }
                                        throw th;
                                    }
                                } else {
                                    objD = obj2;
                                }
                                i12 = i15;
                                iArr = iArr2;
                                t12 = t13;
                                try {
                                    objM3 = iVar.g(t10, eVar, generatedExtensionB, extensionRegistryLite, objD, objM3, v0Var);
                                    obj2 = objD;
                                } catch (Throwable th11) {
                                    th = th11;
                                    t11 = t12;
                                    i10 = i12;
                                    i16 = i16;
                                    objM = objM3;
                                    while (i11 < i10) {
                                        objM = m(t10, iArr[i11], objM, v0Var, t10);
                                    }
                                    if (objM != null) {
                                        v0Var3.n(t11, objM);
                                    }
                                    throw th;
                                }
                            } else {
                                i12 = i15;
                                iArr = iArr2;
                                t12 = t13;
                                v0Var.p();
                                if (objM3 == null) {
                                    objM3 = v0Var3.f(t12);
                                }
                                if (!v0Var3.l(objM3, eVar)) {
                                    int i22 = i16;
                                    while (i22 < i12) {
                                        objM3 = m(t10, iArr[i22], objM3, v0Var, t10);
                                        i22++;
                                        t12 = t12;
                                        i12 = i12;
                                    }
                                    T t14 = t12;
                                    if (objM3 != null) {
                                        v0Var3.n(t14, objM3);
                                        return;
                                    }
                                    return;
                                }
                            }
                            t13 = t12;
                            i15 = i12;
                            iArr2 = iArr;
                        } catch (Throwable th12) {
                            th = th12;
                            iArr = iArr2;
                            t11 = t13;
                            i16 = i16;
                            i10 = i15;
                        }
                    }
                } catch (Throwable th13) {
                    th = th13;
                    i16 = i16;
                    i10 = i15;
                    iArr = iArr2;
                    t11 = t13;
                    objM3 = objM3;
                    objM = objM3;
                    while (i11 < i10) {
                        objM = m(t10, iArr[i11], objM, v0Var, t10);
                    }
                    if (objM != null) {
                        v0Var3.n(t11, objM);
                    }
                    throw th;
                }
            } catch (Throwable th14) {
                th = th14;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> void y(Object obj, int i10, Object obj2, ExtensionRegistryLite extensionRegistryLite, o0 o0Var) throws IOException {
        long jY = Y(i10) & 1048575;
        Object objM = x0.f47308c.m(jY, obj);
        x xVar = this.f47207q;
        if (objM == null) {
            objM = xVar.f();
            x0.y(jY, obj, objM);
        } else if (xVar.h(objM)) {
            MapFieldLite mapFieldLiteF = xVar.f();
            xVar.a(mapFieldLiteF, objM);
            x0.y(jY, obj, mapFieldLiteF);
            objM = mapFieldLiteF;
        }
        MapFieldLite mapFieldLiteC = xVar.c(objM);
        MapEntryLite.b<?, ?> bVarB = xVar.b(obj2);
        e eVar = (e) o0Var;
        eVar.x(2);
        CodedInputStream codedInputStream = eVar.f47209a;
        int iPushLimit = codedInputStream.pushLimit(codedInputStream.readUInt32());
        Object objI = bVarB.f47137b;
        V v3 = bVarB.f47139d;
        Object objI2 = v3;
        while (true) {
            try {
                int iA = eVar.a();
                if (iA == Integer.MAX_VALUE || codedInputStream.isAtEnd()) {
                    break;
                }
                if (iA == 1) {
                    objI = eVar.i(bVarB.f47136a, null, null);
                } else if (iA != 2) {
                    try {
                        if (!eVar.y()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!eVar.y()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objI2 = eVar.i(bVarB.f47138c, v3.getClass(), extensionRegistryLite);
                }
            } catch (Throwable th2) {
                codedInputStream.popLimit(iPushLimit);
                throw th2;
            }
        }
        mapFieldLiteC.put(objI, objI2);
        codedInputStream.popLimit(iPushLimit);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(int i10, Object obj, Object obj2) {
        if (t(i10, obj2)) {
            long jY = Y(i10) & 1048575;
            Unsafe unsafe = f47191s;
            Object object = unsafe.getObject(obj2, jY);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f47192a[i10] + " is present but null: " + obj2);
            }
            q0 q0VarP = p(i10);
            if (!t(i10, obj)) {
                if (u(object)) {
                    Object objNewInstance = q0VarP.newInstance();
                    q0VarP.a(objNewInstance, object);
                    unsafe.putObject(obj, jY, objNewInstance);
                } else {
                    unsafe.putObject(obj, jY, object);
                }
                S(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jY);
            if (!u(object2)) {
                Object objNewInstance2 = q0VarP.newInstance();
                q0VarP.a(objNewInstance2, object2);
                unsafe.putObject(obj, jY, objNewInstance2);
                object2 = objNewInstance2;
            }
            q0VarP.a(object2, object);
        }
    }
}
