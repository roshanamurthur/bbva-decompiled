package androidx.datastore.preferences.protobuf;

import com.fasterxml.jackson.core.base.GeneratorBase;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: MessageSchema.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b0<T> implements o0<T> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f21017r = new int[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Unsafe f21018s = v0.n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f21019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f21020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MessageLite f21023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f21024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f21025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f21026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f21027i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f21028j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f21029k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f21030l;
    public final d0 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final s f21031n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t0<?, ?> f21032o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k<?> f21033p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f21034q;

    /* JADX INFO: compiled from: MessageSchema.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21035a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f21035a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21035a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21035a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21035a[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21035a[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21035a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21035a[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21035a[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21035a[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21035a[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21035a[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21035a[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21035a[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21035a[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f21035a[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f21035a[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f21035a[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public b0(int[] iArr, Object[] objArr, int i10, int i11, MessageLite messageLite, boolean z10, boolean z11, int[] iArr2, int i12, int i13, d0 d0Var, s sVar, t0<?, ?> t0Var, k<?> kVar, v vVar) {
        this.f21019a = iArr;
        this.f21020b = objArr;
        this.f21021c = i10;
        this.f21022d = i11;
        this.f21025g = messageLite instanceof GeneratedMessageLite;
        this.f21026h = z10;
        this.f21024f = kVar != null && kVar.e(messageLite);
        this.f21027i = z11;
        this.f21028j = iArr2;
        this.f21029k = i12;
        this.f21030l = i13;
        this.m = d0Var;
        this.f21031n = sVar;
        this.f21032o = t0Var;
        this.f21033p = kVar;
        this.f21023e = messageLite;
        this.f21034q = vVar;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0280  */
    /* JADX WARN: Code duplicated, block: B:127:0x0286  */
    /* JADX WARN: Code duplicated, block: B:130:0x029c  */
    /* JADX WARN: Code duplicated, block: B:131:0x029f  */
    /* JADX WARN: Code duplicated, block: B:166:0x0357  */
    /* JADX WARN: Code duplicated, block: B:181:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:184:0x03ae  */
    public static <T> b0<T> A(l0 l0Var, d0 d0Var, s sVar, t0<?, ?> t0Var, k<?> kVar, v vVar) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        char cCharAt;
        int i15;
        char cCharAt2;
        int i16;
        char cCharAt3;
        int i17;
        char cCharAt4;
        int i18;
        char cCharAt5;
        int i19;
        char cCharAt6;
        int i20;
        char cCharAt7;
        int i21;
        char cCharAt8;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int iObjectFieldOffset;
        int i28;
        int iObjectFieldOffset2;
        int i29;
        int i30;
        int iObjectFieldOffset3;
        int iObjectFieldOffset4;
        java.lang.reflect.Field fieldN;
        int i31;
        char cCharAt9;
        int i32;
        int i33;
        int i34;
        int i35;
        Object obj;
        java.lang.reflect.Field fieldN2;
        int i36;
        Object obj2;
        java.lang.reflect.Field fieldN3;
        int i37;
        char cCharAt10;
        int i38;
        char cCharAt11;
        int i39;
        char cCharAt12;
        int i40;
        char cCharAt13;
        char cCharAt14;
        int i41 = 0;
        boolean z10 = l0Var.getSyntax() == ProtoSyntax.PROTO3;
        String strD = l0Var.d();
        int length = strD.length();
        int iCharAt4 = strD.charAt(0);
        int i42 = GeneratorBase.SURR1_FIRST;
        if (iCharAt4 >= 55296) {
            int i43 = iCharAt4 & 8191;
            int i44 = 1;
            int i45 = 13;
            while (true) {
                i10 = i44 + 1;
                cCharAt14 = strD.charAt(i44);
                if (cCharAt14 < 55296) {
                    break;
                }
                i43 |= (cCharAt14 & 8191) << i45;
                i45 += 13;
                i44 = i10;
            }
            iCharAt4 = i43 | (cCharAt14 << i45);
        } else {
            i10 = 1;
        }
        int i46 = i10 + 1;
        int iCharAt5 = strD.charAt(i10);
        if (iCharAt5 >= 55296) {
            int i47 = iCharAt5 & 8191;
            int i48 = 13;
            while (true) {
                i40 = i46 + 1;
                cCharAt13 = strD.charAt(i46);
                if (cCharAt13 < 55296) {
                    break;
                }
                i47 |= (cCharAt13 & 8191) << i48;
                i48 += 13;
                i46 = i40;
            }
            iCharAt5 = i47 | (cCharAt13 << i48);
            i46 = i40;
        }
        if (iCharAt5 == 0) {
            i13 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i11 = 0;
            iCharAt3 = 0;
            iArr = f21017r;
            i12 = 0;
        } else {
            int i49 = i46 + 1;
            int iCharAt6 = strD.charAt(i46);
            if (iCharAt6 >= 55296) {
                int i50 = iCharAt6 & 8191;
                int i51 = 13;
                while (true) {
                    i21 = i49 + 1;
                    cCharAt8 = strD.charAt(i49);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt8 & 8191) << i51;
                    i51 += 13;
                    i49 = i21;
                }
                iCharAt6 = i50 | (cCharAt8 << i51);
                i49 = i21;
            }
            int i52 = i49 + 1;
            int iCharAt7 = strD.charAt(i49);
            if (iCharAt7 >= 55296) {
                int i53 = iCharAt7 & 8191;
                int i54 = 13;
                while (true) {
                    i20 = i52 + 1;
                    cCharAt7 = strD.charAt(i52);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt7 & 8191) << i54;
                    i54 += 13;
                    i52 = i20;
                }
                iCharAt7 = i53 | (cCharAt7 << i54);
                i52 = i20;
            }
            int i55 = i52 + 1;
            int iCharAt8 = strD.charAt(i52);
            if (iCharAt8 >= 55296) {
                int i56 = iCharAt8 & 8191;
                int i57 = 13;
                while (true) {
                    i19 = i55 + 1;
                    cCharAt6 = strD.charAt(i55);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt6 & 8191) << i57;
                    i57 += 13;
                    i55 = i19;
                }
                iCharAt8 = i56 | (cCharAt6 << i57);
                i55 = i19;
            }
            int i58 = i55 + 1;
            iCharAt = strD.charAt(i55);
            if (iCharAt >= 55296) {
                int i59 = iCharAt & 8191;
                int i60 = 13;
                while (true) {
                    i18 = i58 + 1;
                    cCharAt5 = strD.charAt(i58);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt5 & 8191) << i60;
                    i60 += 13;
                    i58 = i18;
                }
                iCharAt = i59 | (cCharAt5 << i60);
                i58 = i18;
            }
            int i61 = i58 + 1;
            iCharAt2 = strD.charAt(i58);
            if (iCharAt2 >= 55296) {
                int i62 = iCharAt2 & 8191;
                int i63 = 13;
                while (true) {
                    i17 = i61 + 1;
                    cCharAt4 = strD.charAt(i61);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i62 |= (cCharAt4 & 8191) << i63;
                    i63 += 13;
                    i61 = i17;
                }
                iCharAt2 = i62 | (cCharAt4 << i63);
                i61 = i17;
            }
            int i64 = i61 + 1;
            int iCharAt9 = strD.charAt(i61);
            if (iCharAt9 >= 55296) {
                int i65 = iCharAt9 & 8191;
                int i66 = 13;
                while (true) {
                    i16 = i64 + 1;
                    cCharAt3 = strD.charAt(i64);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i65 |= (cCharAt3 & 8191) << i66;
                    i66 += 13;
                    i64 = i16;
                }
                iCharAt9 = i65 | (cCharAt3 << i66);
                i64 = i16;
            }
            int i67 = i64 + 1;
            int iCharAt10 = strD.charAt(i64);
            if (iCharAt10 >= 55296) {
                int i68 = iCharAt10 & 8191;
                int i69 = 13;
                while (true) {
                    i15 = i67 + 1;
                    cCharAt2 = strD.charAt(i67);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i68 |= (cCharAt2 & 8191) << i69;
                    i69 += 13;
                    i67 = i15;
                }
                iCharAt10 = i68 | (cCharAt2 << i69);
                i67 = i15;
            }
            int i70 = i67 + 1;
            iCharAt3 = strD.charAt(i67);
            if (iCharAt3 >= 55296) {
                int i71 = iCharAt3 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i14 = i72 + 1;
                    cCharAt = strD.charAt(i72);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i71 |= (cCharAt & 8191) << i73;
                    i73 += 13;
                    i72 = i14;
                }
                iCharAt3 = i71 | (cCharAt << i73);
                i70 = i14;
            }
            int[] iArr2 = new int[iCharAt3 + iCharAt9 + iCharAt10];
            i11 = (iCharAt6 * 2) + iCharAt7;
            i12 = iCharAt6;
            i46 = i70;
            int i74 = iCharAt9;
            iArr = iArr2;
            i41 = iCharAt8;
            i13 = i74;
        }
        Object[] objArrC = l0Var.c();
        Class<?> cls = l0Var.b().getClass();
        int[] iArr3 = new int[iCharAt2 * 3];
        Object[] objArr = new Object[iCharAt2 * 2];
        int i75 = iCharAt3 + i13;
        int i76 = iCharAt3;
        int i77 = i75;
        int i78 = 0;
        int i79 = 0;
        while (i46 < length) {
            int i80 = i46 + 1;
            int iCharAt11 = strD.charAt(i46);
            if (iCharAt11 >= i42) {
                int i81 = iCharAt11 & 8191;
                int i82 = i80;
                int i83 = 13;
                while (true) {
                    i39 = i82 + 1;
                    cCharAt12 = strD.charAt(i82);
                    i22 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i81 |= (cCharAt12 & 8191) << i83;
                    i83 += 13;
                    i82 = i39;
                    length = i22;
                }
                iCharAt11 = i81 | (cCharAt12 << i83);
                i23 = i39;
            } else {
                i22 = length;
                i23 = i80;
            }
            int i84 = i23 + 1;
            int iCharAt12 = strD.charAt(i23);
            if (iCharAt12 >= 55296) {
                int i85 = iCharAt12 & 8191;
                int i86 = i84;
                int i87 = 13;
                while (true) {
                    i38 = i86 + 1;
                    cCharAt11 = strD.charAt(i86);
                    i24 = iCharAt3;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i85 |= (cCharAt11 & 8191) << i87;
                    i87 += 13;
                    i86 = i38;
                    iCharAt3 = i24;
                }
                iCharAt12 = i85 | (cCharAt11 << i87);
                i25 = i38;
            } else {
                i24 = iCharAt3;
                i25 = i84;
            }
            int i88 = iCharAt12 & 255;
            boolean z11 = z10;
            if ((iCharAt12 & 1024) != 0) {
                iArr[i78] = i79;
                i78++;
            }
            Unsafe unsafe = f21018s;
            int i89 = i78;
            if (i88 >= 51) {
                int i90 = i25 + 1;
                int iCharAt13 = strD.charAt(i25);
                if (iCharAt13 >= 55296) {
                    int i91 = iCharAt13 & 8191;
                    int i92 = i90;
                    int i93 = 13;
                    while (true) {
                        i37 = i92 + 1;
                        cCharAt10 = strD.charAt(i92);
                        i26 = iCharAt;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i91 |= (cCharAt10 & 8191) << i93;
                        i93 += 13;
                        i92 = i37;
                        iCharAt = i26;
                    }
                    iCharAt13 = i91 | (cCharAt10 << i93);
                    i33 = i37;
                } else {
                    i26 = iCharAt;
                    i33 = i90;
                }
                int i94 = i88 - 51;
                int i95 = i33;
                if (i94 == 9 || i94 == 17) {
                    i34 = i11 + 1;
                    objArr[((i79 / 3) * 2) + 1] = objArrC[i11];
                } else {
                    if (i94 == 12 && (iCharAt4 & 1) == 1) {
                        i34 = i11 + 1;
                        objArr[((i79 / 3) * 2) + 1] = objArrC[i11];
                    }
                    i35 = iCharAt13 * 2;
                    obj = objArrC[i35];
                    if (obj instanceof java.lang.reflect.Field) {
                        fieldN2 = (java.lang.reflect.Field) obj;
                    } else {
                        fieldN2 = N(cls, (String) obj);
                        objArrC[i35] = fieldN2;
                    }
                    int i96 = i41;
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldN2);
                    i36 = i35 + 1;
                    obj2 = objArrC[i36];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        fieldN3 = (java.lang.reflect.Field) obj2;
                    } else {
                        fieldN3 = N(cls, (String) obj2);
                        objArrC[i36] = fieldN3;
                    }
                    iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldN3);
                    cls = cls;
                    i27 = i96;
                    objArr = objArr;
                    i28 = i95;
                    i29 = 0;
                    int i97 = i11;
                    iCharAt4 = iCharAt4;
                    i30 = i97;
                }
                i11 = i34;
                i35 = iCharAt13 * 2;
                obj = objArrC[i35];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldN2 = (java.lang.reflect.Field) obj;
                } else {
                    fieldN2 = N(cls, (String) obj);
                    objArrC[i35] = fieldN2;
                }
                int i98 = i41;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldN2);
                i36 = i35 + 1;
                obj2 = objArrC[i36];
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldN3 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldN3 = N(cls, (String) obj2);
                    objArrC[i36] = fieldN3;
                }
                iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldN3);
                cls = cls;
                i27 = i98;
                objArr = objArr;
                i28 = i95;
                i29 = 0;
                int i99 = i11;
                iCharAt4 = iCharAt4;
                i30 = i99;
            } else {
                i26 = iCharAt;
                int i100 = i41;
                int i101 = i11 + 1;
                java.lang.reflect.Field fieldN4 = N(cls, (String) objArrC[i11]);
                if (i88 == 9 || i88 == 17) {
                    i27 = i100;
                    objArr[((i79 / 3) * 2) + 1] = fieldN4.getType();
                } else {
                    if (i88 == 27 || i88 == 49) {
                        i27 = i100;
                        i32 = i11 + 2;
                        objArr[((i79 / 3) * 2) + 1] = objArrC[i101];
                    } else if (i88 == 12 || i88 == 30 || i88 == 44) {
                        i27 = i100;
                        if ((iCharAt4 & 1) == 1) {
                            i32 = i11 + 2;
                            objArr[((i79 / 3) * 2) + 1] = objArrC[i101];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldN4);
                        if ((iCharAt4 & 1) == 1 || i88 > 17) {
                            i28 = i25;
                            iObjectFieldOffset2 = 0;
                            i29 = 0;
                        } else {
                            i28 = i25 + 1;
                            int iCharAt14 = strD.charAt(i25);
                            if (iCharAt14 >= 55296) {
                                int i102 = iCharAt14 & 8191;
                                int i103 = 13;
                                while (true) {
                                    i31 = i28 + 1;
                                    cCharAt9 = strD.charAt(i28);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i102 |= (cCharAt9 & 8191) << i103;
                                    i103 += 13;
                                    i28 = i31;
                                }
                                iCharAt14 = i102 | (cCharAt9 << i103);
                                i28 = i31;
                            }
                            int i104 = (iCharAt14 / 32) + (i12 * 2);
                            Object obj3 = objArrC[i104];
                            if (obj3 instanceof java.lang.reflect.Field) {
                                fieldN = (java.lang.reflect.Field) obj3;
                            } else {
                                fieldN = N(cls, (String) obj3);
                                objArrC[i104] = fieldN;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldN);
                            i29 = iCharAt14 % 32;
                        }
                        if (i88 >= 18 && i88 <= 49) {
                            iArr[i77] = iObjectFieldOffset;
                            i77++;
                        }
                        int i105 = iObjectFieldOffset2;
                        i30 = i101;
                        iObjectFieldOffset3 = iObjectFieldOffset;
                        iObjectFieldOffset4 = i105;
                    } else if (i88 == 50) {
                        int i106 = i76 + 1;
                        iArr[i76] = i79;
                        int i107 = (i79 / 3) * 2;
                        int i108 = i11 + 2;
                        objArr[i107] = objArrC[i101];
                        if ((iCharAt12 & 2048) != 0) {
                            i101 = i11 + 3;
                            objArr[i107 + 1] = objArrC[i108];
                            i76 = i106;
                            i27 = i100;
                        } else {
                            i76 = i106;
                            i101 = i108;
                            i27 = i100;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldN4);
                        if ((iCharAt4 & 1) == 1) {
                            i28 = i25;
                            iObjectFieldOffset2 = 0;
                            i29 = 0;
                        } else {
                            i28 = i25;
                            iObjectFieldOffset2 = 0;
                            i29 = 0;
                        }
                        if (i88 >= 18) {
                            iArr[i77] = iObjectFieldOffset;
                            i77++;
                        }
                        int i109 = iObjectFieldOffset2;
                        i30 = i101;
                        iObjectFieldOffset3 = iObjectFieldOffset;
                        iObjectFieldOffset4 = i109;
                    } else {
                        i27 = i100;
                    }
                    i101 = i32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldN4);
                    if ((iCharAt4 & 1) == 1) {
                        i28 = i25;
                        iObjectFieldOffset2 = 0;
                        i29 = 0;
                    } else {
                        i28 = i25;
                        iObjectFieldOffset2 = 0;
                        i29 = 0;
                    }
                    if (i88 >= 18) {
                        iArr[i77] = iObjectFieldOffset;
                        i77++;
                    }
                    int i1010 = iObjectFieldOffset2;
                    i30 = i101;
                    iObjectFieldOffset3 = iObjectFieldOffset;
                    iObjectFieldOffset4 = i1010;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldN4);
                if ((iCharAt4 & 1) == 1) {
                    i28 = i25;
                    iObjectFieldOffset2 = 0;
                    i29 = 0;
                } else {
                    i28 = i25;
                    iObjectFieldOffset2 = 0;
                    i29 = 0;
                }
                if (i88 >= 18) {
                    iArr[i77] = iObjectFieldOffset;
                    i77++;
                }
                int i1011 = iObjectFieldOffset2;
                i30 = i101;
                iObjectFieldOffset3 = iObjectFieldOffset;
                iObjectFieldOffset4 = i1011;
            }
            int i110 = i79 + 1;
            iArr3[i79] = iCharAt11;
            int i111 = i79 + 2;
            iArr3[i110] = ((iCharAt12 & 256) != 0 ? 268435456 : 0) | ((iCharAt12 & 512) != 0 ? PKIFailureInfo.duplicateCertReq : 0) | (i88 << 20) | iObjectFieldOffset3;
            i79 += 3;
            iArr3[i111] = (i29 << 20) | iObjectFieldOffset4;
            objArr = objArr;
            i46 = i28;
            z10 = z11;
            cls = cls;
            length = i22;
            iCharAt3 = i24;
            i41 = i27;
            i78 = i89;
            iArr3 = iArr3;
            iCharAt = i26;
            i42 = GeneratorBase.SURR1_FIRST;
            int i112 = iCharAt4;
            i11 = i30;
            iCharAt4 = i112;
        }
        return new b0<>(iArr3, objArr, i41, iCharAt, l0Var.b(), z10, false, iArr, iCharAt3, i75, d0Var, sVar, t0Var, kVar, vVar);
    }

    public static long B(int i10) {
        return i10 & 1048575;
    }

    public static int C(long j10, Object obj) {
        return ((Integer) v0.f21151d.m(j10, obj)).intValue();
    }

    public static long D(long j10, Object obj) {
        return ((Long) v0.f21151d.m(j10, obj)).longValue();
    }

    public static java.lang.reflect.Field N(Class<?> cls, String str) {
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

    public static int R(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static void V(int i10, Object obj, h hVar) throws IOException {
        if (!(obj instanceof String)) {
            hVar.b(i10, (ByteString) obj);
        } else {
            hVar.f21064a.writeString(i10, (String) obj);
        }
    }

    public static int k(byte[] bArr, int i10, int i11, WireFormat.FieldType fieldType, Class cls, c.b bVar) throws IOException {
        switch (a.f21035a[fieldType.ordinal()]) {
            case 1:
                int iK = c.K(bArr, i10, bVar);
                bVar.f21039c = Boolean.valueOf(bVar.f21038b != 0);
                return iK;
            case 2:
                return c.b(bArr, i10, bVar);
            case 3:
                bVar.f21039c = Double.valueOf(Double.longBitsToDouble(c.j(i10, bArr)));
                return i10 + 8;
            case 4:
            case 5:
                bVar.f21039c = Integer.valueOf(c.h(i10, bArr));
                return i10 + 4;
            case 6:
            case 7:
                bVar.f21039c = Long.valueOf(c.j(i10, bArr));
                return i10 + 8;
            case 8:
                bVar.f21039c = Float.valueOf(Float.intBitsToFloat(c.h(i10, bArr)));
                return i10 + 4;
            case 9:
            case 10:
            case 11:
                int I = c.I(bArr, i10, bVar);
                bVar.f21039c = Integer.valueOf(bVar.f21037a);
                return I;
            case 12:
            case 13:
                int iK2 = c.K(bArr, i10, bVar);
                bVar.f21039c = Long.valueOf(bVar.f21038b);
                return iK2;
            case 14:
                return c.p(j0.f21070c.a(cls), bArr, i10, i11, bVar);
            case 15:
                int I2 = c.I(bArr, i10, bVar);
                bVar.f21039c = Integer.valueOf(CodedInputStream.decodeZigZag32(bVar.f21037a));
                return I2;
            case 16:
                int iK3 = c.K(bArr, i10, bVar);
                bVar.f21039c = Long.valueOf(CodedInputStream.decodeZigZag64(bVar.f21038b));
                return iK3;
            case 17:
                return c.F(bArr, i10, bVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    public static UnknownFieldSetLite p(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLite2 = new UnknownFieldSetLite();
        generatedMessageLite.unknownFields = unknownFieldSetLite2;
        return unknownFieldSetLite2;
    }

    public static List u(long j10, Object obj) {
        return (List) v0.f21151d.m(j10, obj);
    }

    public static b0 z(y yVar, d0 d0Var, s sVar, t0 t0Var, k kVar, v vVar) {
        int i10;
        int i11;
        int iN;
        int iNumberOfTrailingZeros;
        char c10;
        if (yVar instanceof l0) {
            return A((l0) yVar, d0Var, sVar, t0Var, kVar, vVar);
        }
        StructuralMessageInfo structuralMessageInfo = (StructuralMessageInfo) yVar;
        boolean z10 = structuralMessageInfo.f20986a == ProtoSyntax.PROTO3;
        FieldInfo[] fieldInfoArr = structuralMessageInfo.f20989d;
        if (fieldInfoArr.length == 0) {
            i10 = 0;
            i11 = 0;
        } else {
            i10 = fieldInfoArr[0].f20895s0;
            i11 = fieldInfoArr[fieldInfoArr.length - 1].f20895s0;
        }
        int length = fieldInfoArr.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i12 = 0;
        int i13 = 0;
        for (FieldInfo fieldInfo : fieldInfoArr) {
            FieldType fieldType = fieldInfo.f20893q0;
            if (fieldType == FieldType.MAP) {
                i12++;
            } else if (fieldType.id() >= 18 && fieldInfo.f20893q0.id() <= 49) {
                i13++;
            }
        }
        int[] iArr2 = i12 > 0 ? new int[i12] : null;
        int[] iArr3 = i13 > 0 ? new int[i13] : null;
        int[] iArr4 = f21017r;
        int[] iArr5 = structuralMessageInfo.f20988c;
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
            int i19 = fieldInfo2.f20895s0;
            FieldInfo[] fieldInfoArr2 = fieldInfoArr;
            v0.e eVar = v0.f21151d;
            int[] iArr6 = iArr4;
            java.lang.reflect.Field field = fieldInfo2.f20892p0;
            int i20 = i10;
            int i21 = i11;
            int iN2 = (int) eVar.n(field);
            FieldType fieldType2 = fieldInfo2.f20893q0;
            int iId = fieldType2.id();
            if (z10 || fieldType2.isList() || fieldType2.isMap()) {
                java.lang.reflect.Field field2 = fieldInfo2.f20899x0;
                iN = field2 == null ? 0 : (int) eVar.n(field2);
                iNumberOfTrailingZeros = 0;
            } else {
                iN = (int) eVar.n(fieldInfo2.f20896t0);
                iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(fieldInfo2.f20897u0);
                structuralMessageInfo = structuralMessageInfo;
            }
            iArr[i16] = fieldInfo2.f20895s0;
            int[] iArr7 = iArr3;
            iArr[i16 + 1] = (fieldInfo2.v0 ? 268435456 : 0) | (fieldInfo2.f20898w0 ? PKIFailureInfo.duplicateCertReq : 0) | (iId << 20) | iN2;
            iArr[i16 + 2] = (iNumberOfTrailingZeros << 20) | iN;
            int i22 = FieldInfo.a.f20911a[fieldType2.ordinal()];
            Class<?> type = (i22 == 1 || i22 == 2) ? field != null ? field.getType() : fieldInfo2.f20900y0 : (i22 == 3 || i22 == 4) ? fieldInfo2.f20894r0 : null;
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
        return new b0(iArr, objArr, i24, i25, structuralMessageInfo2.f20990e, z11, true, iArr11, iArr5.length, iArr5.length + iArr2.length, d0Var, sVar, t0Var, kVar, vVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> int E(T t10, byte[] bArr, int i10, int i11, int i12, long j10, c.b bVar) throws IOException {
        Object objN = n(i12);
        Unsafe unsafe = f21018s;
        Object object = unsafe.getObject(t10, j10);
        v vVar = this.f21034q;
        if (vVar.h(object)) {
            MapFieldLite mapFieldLiteF = vVar.f();
            vVar.a(mapFieldLiteF, object);
            unsafe.putObject(t10, j10, mapFieldLiteF);
            object = mapFieldLiteF;
        }
        MapEntryLite.b<?, ?> bVarB = vVar.b(objN);
        MapFieldLite mapFieldLiteC = vVar.c(object);
        int I = c.I(bArr, i10, bVar);
        int i13 = bVar.f21037a;
        if (i13 < 0 || i13 > i11 - I) {
            throw InvalidProtocolBufferException.i();
        }
        int i14 = I + i13;
        K k10 = bVarB.f20973b;
        V v3 = bVarB.f20975d;
        Object obj = k10;
        Object obj2 = v3;
        while (I < i14) {
            int iH = I + 1;
            int i15 = bArr[I];
            if (i15 < 0) {
                iH = c.H(i15, bArr, iH, bVar);
                i15 = bVar.f21037a;
            }
            int i16 = i15 >>> 3;
            int i17 = i15 & 7;
            if (i16 != 1) {
                if (i16 == 2 && i17 == bVarB.f20974c.getWireType()) {
                    I = k(bArr, iH, i11, bVarB.f20974c, v3.getClass(), bVar);
                    obj2 = bVar.f21039c;
                } else {
                    I = c.M(i15, bArr, iH, i11, bVar);
                }
            } else if (i17 == bVarB.f20972a.getWireType()) {
                I = k(bArr, iH, i11, bVarB.f20972a, null, bVar);
                obj = bVar.f21039c;
            } else {
                I = c.M(i15, bArr, iH, i11, bVar);
            }
        }
        if (I != i14) {
            throw InvalidProtocolBufferException.g();
        }
        mapFieldLiteC.put(obj, obj2);
        return i14;
    }

    public final int F(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, c.b bVar) throws IOException {
        long j11 = this.f21019a[i17 + 2] & 1048575;
        Unsafe unsafe = f21018s;
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
                unsafe.putObject(t10, j10, Long.valueOf(bVar.f21038b));
                unsafe.putInt(t10, j11, i13);
                return iK;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int I = c.I(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Integer.valueOf(bVar.f21037a));
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
                unsafe.putObject(t10, j10, Boolean.valueOf(bVar.f21038b != 0));
                unsafe.putInt(t10, j11, i13);
                return iK2;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int I2 = c.I(bArr, i10, bVar);
                int i22 = bVar.f21037a;
                if (i22 == 0) {
                    unsafe.putObject(t10, j10, "");
                } else {
                    if ((i15 & PKIFailureInfo.duplicateCertReq) != 0 && !w0.h(bArr, I2, I2 + i22)) {
                        throw InvalidProtocolBufferException.c();
                    }
                    unsafe.putObject(t10, j10, new String(bArr, I2, i22, Internal.f20943a));
                    I2 += i22;
                }
                unsafe.putInt(t10, j11, i13);
                return I2;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                int iP = c.p(o(i17), bArr, i10, i11, bVar);
                Object object = unsafe.getInt(t10, j11) == i13 ? unsafe.getObject(t10, j10) : null;
                if (object == null) {
                    unsafe.putObject(t10, j10, bVar.f21039c);
                } else {
                    unsafe.putObject(t10, j10, Internal.a(object, bVar.f21039c));
                }
                unsafe.putInt(t10, j11, i13);
                return iP;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iB = c.b(bArr, i10, bVar);
                unsafe.putObject(t10, j10, bVar.f21039c);
                unsafe.putInt(t10, j11, i13);
                return iB;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int I3 = c.I(bArr, i10, bVar);
                int i23 = bVar.f21037a;
                Internal.EnumVerifier enumVerifierM = m(i17);
                if (enumVerifierM == null || enumVerifierM.isInRange(i23)) {
                    unsafe.putObject(t10, j10, Integer.valueOf(i23));
                    unsafe.putInt(t10, j11, i13);
                } else {
                    p(t10).c(i12, Long.valueOf(i23));
                }
                return I3;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                int I4 = c.I(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Integer.valueOf(CodedInputStream.decodeZigZag32(bVar.f21037a)));
                unsafe.putInt(t10, j11, i13);
                return I4;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iK3 = c.K(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Long.valueOf(CodedInputStream.decodeZigZag64(bVar.f21038b)));
                unsafe.putInt(t10, j11, i13);
                return iK3;
            case 68:
                if (i14 != 3) {
                    return i10;
                }
                int iN = c.n(o(i17), bArr, i10, i11, (i12 & (-8)) | 4, bVar);
                Object object2 = unsafe.getInt(t10, j11) == i13 ? unsafe.getObject(t10, j10) : null;
                if (object2 == null) {
                    unsafe.putObject(t10, j10, bVar.f21039c);
                } else {
                    unsafe.putObject(t10, j10, Internal.a(object2, bVar.f21039c));
                }
                unsafe.putInt(t10, j11, i13);
                return iN;
            default:
                return i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0383 A[PHI: r0 r24 r25 r29
      0x0383: PHI (r0v28 int) = (r0v23 int), (r0v26 int), (r0v30 int) binds: [B:142:0x03ed, B:138:0x03c9, B:129:0x0381] A[DONT_GENERATE, DONT_INLINE]
      0x0383: PHI (r24v5 int) = (r24v3 int), (r24v3 int), (r24v6 int) binds: [B:142:0x03ed, B:138:0x03c9, B:129:0x0381] A[DONT_GENERATE, DONT_INLINE]
      0x0383: PHI (r25v8 sun.misc.Unsafe) = (r25v6 sun.misc.Unsafe), (r25v6 sun.misc.Unsafe), (r25v9 sun.misc.Unsafe) binds: [B:142:0x03ed, B:138:0x03c9, B:129:0x0381] A[DONT_GENERATE, DONT_INLINE]
      0x0383: PHI (r29v4 int) = (r29v2 int), (r29v2 int), (r29v5 int) binds: [B:142:0x03ed, B:138:0x03c9, B:129:0x0381] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:132:0x039d A[PHI: r0 r24 r25 r29
      0x039d: PHI (r0v27 int) = (r0v23 int), (r0v26 int), (r0v30 int) binds: [B:142:0x03ed, B:138:0x03c9, B:129:0x0381] A[DONT_GENERATE, DONT_INLINE]
      0x039d: PHI (r24v4 int) = (r24v3 int), (r24v3 int), (r24v6 int) binds: [B:142:0x03ed, B:138:0x03c9, B:129:0x0381] A[DONT_GENERATE, DONT_INLINE]
      0x039d: PHI (r25v7 sun.misc.Unsafe) = (r25v6 sun.misc.Unsafe), (r25v6 sun.misc.Unsafe), (r25v9 sun.misc.Unsafe) binds: [B:142:0x03ed, B:138:0x03c9, B:129:0x0381] A[DONT_GENERATE, DONT_INLINE]
      0x039d: PHI (r29v3 int) = (r29v2 int), (r29v2 int), (r29v5 int) binds: [B:142:0x03ed, B:138:0x03c9, B:129:0x0381] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:145:0x03f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x0408  */
    /* JADX WARN: Code duplicated, block: B:153:0x0422  */
    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x009d. Please report as an issue. */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final int G(T t10, byte[] bArr, int i10, int i11, int i12, c.b bVar) throws IOException {
        Unsafe unsafe;
        int i13;
        b0<T> b0Var;
        T t11;
        int i14;
        int i15;
        int iQ;
        int iQ2;
        int i16;
        int i17;
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
        int i29;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        int i30;
        int iC;
        int iB;
        b0<T> b0Var2 = this;
        t10 = t10;
        bArr = bArr;
        i11 = i11;
        i12 = i12;
        c.b bVar2 = bVar;
        Unsafe unsafe2 = f21018s;
        int iG = i10;
        int i31 = -1;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = -1;
        while (true) {
            if (iG < i11) {
                int i36 = iG + 1;
                byte b10 = bArr[iG];
                if (b10 < 0) {
                    int iH = c.H(b10, bArr, i36, bVar2);
                    i14 = bVar2.f21037a;
                    i36 = iH;
                } else {
                    i14 = b10;
                }
                int i37 = i14 >>> 3;
                int i38 = i14 & 7;
                int i39 = b0Var2.f21022d;
                int i40 = i14;
                int i41 = b0Var2.f21021c;
                if (i37 > i31) {
                    iQ2 = (i37 < i41 || i37 > i39) ? -1 : b0Var2.Q(i37, i32 / 3);
                    i16 = -1;
                    i15 = 0;
                } else {
                    if (i37 < i41 || i37 > i39) {
                        i15 = 0;
                        iQ = -1;
                    } else {
                        i15 = 0;
                        iQ = b0Var2.Q(i37, 0);
                    }
                    iQ2 = iQ;
                    i16 = -1;
                }
                if (iQ2 == i16) {
                    i17 = i40;
                    i18 = i37;
                    i19 = i36;
                    i20 = i34;
                    i21 = i35;
                    i22 = i15;
                    unsafe = unsafe2;
                } else {
                    int[] iArr = b0Var2.f21019a;
                    int i42 = iArr[iQ2 + 1];
                    int iR = R(i42);
                    long j10 = i42 & 1048575;
                    if (iR <= 17) {
                        int i43 = iArr[iQ2 + 2];
                        int i44 = 1 << (i43 >>> 20);
                        int i45 = i43 & 1048575;
                        if (i45 != i35) {
                            if (i35 != -1) {
                                unsafe2.putInt(t10, i35, i34);
                            }
                            i34 = unsafe2.getInt(t10, i45);
                            i25 = i45;
                        } else {
                            i25 = i35;
                        }
                        int i46 = i34;
                        switch (iR) {
                            case 0:
                                i26 = i40;
                                i18 = i37;
                                i27 = iQ2;
                                i28 = i25;
                                i29 = i36;
                                bArr2 = bArr;
                                if (i38 != 1) {
                                    i21 = i28;
                                    i20 = i46;
                                    unsafe = unsafe2;
                                    i22 = i27;
                                    i19 = i29;
                                    i17 = i26;
                                    if (i17 == i12 || i12 == 0) {
                                        if (this.f21024f || bVar.f21040d == ExtensionRegistryLite.getEmptyRegistry()) {
                                            iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                        } else {
                                            iG = c.g(i17, bArr, i19, i11, t10, this.f21023e, this.f21032o, bVar);
                                        }
                                        i33 = i17;
                                        b0Var2 = this;
                                        bVar2 = bVar;
                                        i31 = i18;
                                        i34 = i20;
                                        i35 = i21;
                                        i32 = i22;
                                        i12 = i12;
                                        unsafe2 = unsafe;
                                    } else {
                                        b0Var = this;
                                        i13 = i12;
                                        iG = i19;
                                        i33 = i17;
                                        i34 = i20;
                                        i35 = i21;
                                    }
                                } else {
                                    v0.t(t10, j10, c.d(i29, bArr2));
                                    iG = i29 + 8;
                                    i34 = i46 | i44;
                                    i35 = i28;
                                    bArr = bArr2;
                                    i32 = i27;
                                    i33 = i26;
                                    i31 = i18;
                                    i11 = i11;
                                    i12 = i12;
                                }
                                break;
                            case 1:
                                i26 = i40;
                                i18 = i37;
                                i27 = iQ2;
                                i28 = i25;
                                i29 = i36;
                                bArr2 = bArr;
                                if (i38 != 5) {
                                    i21 = i28;
                                    i20 = i46;
                                    unsafe = unsafe2;
                                    i22 = i27;
                                    i19 = i29;
                                    i17 = i26;
                                    if (i17 == i12) {
                                    }
                                    if (this.f21024f) {
                                        iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                    } else {
                                        iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                    }
                                    i33 = i17;
                                    b0Var2 = this;
                                    bVar2 = bVar;
                                    i31 = i18;
                                    i34 = i20;
                                    i35 = i21;
                                    i32 = i22;
                                    i12 = i12;
                                    unsafe2 = unsafe;
                                } else {
                                    v0.u(t10, j10, c.l(i29, bArr2));
                                    iG = i29 + 4;
                                    i34 = i46 | i44;
                                    i35 = i28;
                                    bArr = bArr2;
                                    i32 = i27;
                                    i33 = i26;
                                    i31 = i18;
                                    i11 = i11;
                                    i12 = i12;
                                }
                                break;
                            case 2:
                            case 3:
                                bArr3 = bArr;
                                i26 = i40;
                                i18 = i37;
                                i27 = iQ2;
                                i28 = i25;
                                i29 = i36;
                                if (i38 != 0) {
                                    i21 = i28;
                                    i20 = i46;
                                    unsafe = unsafe2;
                                    i22 = i27;
                                    i19 = i29;
                                    i17 = i26;
                                    if (i17 == i12) {
                                    }
                                    if (this.f21024f) {
                                        iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                    } else {
                                        iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                    }
                                    i33 = i17;
                                    b0Var2 = this;
                                    bVar2 = bVar;
                                    i31 = i18;
                                    i34 = i20;
                                    i35 = i21;
                                    i32 = i22;
                                    i12 = i12;
                                    unsafe2 = unsafe;
                                } else {
                                    int iK = c.K(bArr3, i29, bVar2);
                                    bArr = bArr3;
                                    unsafe2.putLong(t10, j10, bVar2.f21038b);
                                    i34 = i46 | i44;
                                    i35 = i28;
                                    iG = iK;
                                    i32 = i27;
                                    i33 = i26;
                                    i31 = i18;
                                    i11 = i11;
                                    i12 = i12;
                                }
                                break;
                            case 4:
                            case 11:
                                bArr3 = bArr;
                                i26 = i40;
                                i18 = i37;
                                i27 = iQ2;
                                i28 = i25;
                                i29 = i36;
                                if (i38 != 0) {
                                    i21 = i28;
                                    i20 = i46;
                                    unsafe = unsafe2;
                                    i22 = i27;
                                    i19 = i29;
                                    i17 = i26;
                                    if (i17 == i12) {
                                    }
                                    if (this.f21024f) {
                                        iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                    } else {
                                        iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                    }
                                    i33 = i17;
                                    b0Var2 = this;
                                    bVar2 = bVar;
                                    i31 = i18;
                                    i34 = i20;
                                    i35 = i21;
                                    i32 = i22;
                                    i12 = i12;
                                    unsafe2 = unsafe;
                                } else {
                                    iG = c.I(bArr3, i29, bVar2);
                                    unsafe2.putInt(t10, j10, bVar2.f21037a);
                                    i34 = i46 | i44;
                                    i35 = i28;
                                    bArr = bArr3;
                                    i32 = i27;
                                    i33 = i26;
                                    i31 = i18;
                                    i11 = i11;
                                    i12 = i12;
                                }
                                break;
                            case 5:
                            case 14:
                                i26 = i40;
                                i18 = i37;
                                i27 = iQ2;
                                bArr4 = bArr;
                                if (i38 != 1) {
                                    i28 = i25;
                                    i29 = i36;
                                    i21 = i28;
                                    i20 = i46;
                                    unsafe = unsafe2;
                                    i22 = i27;
                                    i19 = i29;
                                    i17 = i26;
                                    if (i17 == i12) {
                                    }
                                    if (this.f21024f) {
                                        iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                    } else {
                                        iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                    }
                                    i33 = i17;
                                    b0Var2 = this;
                                    bVar2 = bVar;
                                    i31 = i18;
                                    i34 = i20;
                                    i35 = i21;
                                    i32 = i22;
                                    i12 = i12;
                                    unsafe2 = unsafe;
                                } else {
                                    unsafe2.putLong(t10, j10, c.j(i36, bArr4));
                                    iG = i36 + 8;
                                    i34 = i46 | i44;
                                    i35 = i25;
                                    bArr = bArr4;
                                    i32 = i27;
                                    i33 = i26;
                                    i31 = i18;
                                    i11 = i11;
                                    i12 = i12;
                                }
                                break;
                            case 6:
                            case 13:
                                i26 = i40;
                                i18 = i37;
                                i27 = iQ2;
                                bArr4 = bArr;
                                if (i38 != 5) {
                                    i28 = i25;
                                    i29 = i36;
                                    i21 = i28;
                                    i20 = i46;
                                    unsafe = unsafe2;
                                    i22 = i27;
                                    i19 = i29;
                                    i17 = i26;
                                    if (i17 == i12) {
                                    }
                                    if (this.f21024f) {
                                        iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                    } else {
                                        iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                    }
                                    i33 = i17;
                                    b0Var2 = this;
                                    bVar2 = bVar;
                                    i31 = i18;
                                    i34 = i20;
                                    i35 = i21;
                                    i32 = i22;
                                    i12 = i12;
                                    unsafe2 = unsafe;
                                } else {
                                    unsafe2.putInt(t10, j10, c.h(i36, bArr4));
                                    iB = i36 + 4;
                                    i34 = i46 | i44;
                                    i32 = i27;
                                    i35 = i25;
                                    i33 = i26;
                                    i11 = i11;
                                    i12 = i12;
                                    bArr = bArr4;
                                    iG = iB;
                                    i31 = i18;
                                }
                                break;
                            case 7:
                                i26 = i40;
                                i18 = i37;
                                i27 = iQ2;
                                bArr4 = bArr;
                                if (i38 != 0) {
                                    i28 = i25;
                                    i29 = i36;
                                    i21 = i28;
                                    i20 = i46;
                                    unsafe = unsafe2;
                                    i22 = i27;
                                    i19 = i29;
                                    i17 = i26;
                                    if (i17 == i12) {
                                    }
                                    if (this.f21024f) {
                                        iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                    } else {
                                        iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                    }
                                    i33 = i17;
                                    b0Var2 = this;
                                    bVar2 = bVar;
                                    i31 = i18;
                                    i34 = i20;
                                    i35 = i21;
                                    i32 = i22;
                                    i12 = i12;
                                    unsafe2 = unsafe;
                                } else {
                                    int iK2 = c.K(bArr4, i36, bVar2);
                                    v0.o(t10, j10, bVar2.f21038b != 0);
                                    i34 = i46 | i44;
                                    i32 = i27;
                                    i35 = i25;
                                    i31 = i18;
                                    bArr = bArr4;
                                    iG = iK2;
                                    i33 = i26;
                                    i11 = i11;
                                }
                                break;
                            case 8:
                                i26 = i40;
                                i30 = i11;
                                i18 = i37;
                                i27 = iQ2;
                                bArr4 = bArr;
                                if (i38 != 2) {
                                    i28 = i25;
                                    i29 = i36;
                                    i21 = i28;
                                    i20 = i46;
                                    unsafe = unsafe2;
                                    i22 = i27;
                                    i19 = i29;
                                    i17 = i26;
                                    if (i17 == i12) {
                                    }
                                    if (this.f21024f) {
                                        iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                    } else {
                                        iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                    }
                                    i33 = i17;
                                    b0Var2 = this;
                                    bVar2 = bVar;
                                    i31 = i18;
                                    i34 = i20;
                                    i35 = i21;
                                    i32 = i22;
                                    i12 = i12;
                                    unsafe2 = unsafe;
                                } else {
                                    iC = (i42 & PKIFailureInfo.duplicateCertReq) == 0 ? c.C(bArr4, i36, bVar2) : c.F(bArr4, i36, bVar2);
                                    unsafe2.putObject(t10, j10, bVar2.f21039c);
                                    i34 = i46 | i44;
                                    i35 = i25;
                                    i33 = i26;
                                    bArr = bArr4;
                                    iG = iC;
                                    i11 = i30;
                                    i32 = i27;
                                    i31 = i18;
                                    i12 = i12;
                                }
                                break;
                            case 9:
                                i26 = i40;
                                i18 = i37;
                                i27 = iQ2;
                                bArr4 = bArr;
                                if (i38 != 2) {
                                    i28 = i25;
                                    i29 = i36;
                                    i21 = i28;
                                    i20 = i46;
                                    unsafe = unsafe2;
                                    i22 = i27;
                                    i19 = i29;
                                    i17 = i26;
                                    if (i17 == i12) {
                                    }
                                    if (this.f21024f) {
                                        iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                    } else {
                                        iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                    }
                                    i33 = i17;
                                    b0Var2 = this;
                                    bVar2 = bVar;
                                    i31 = i18;
                                    i34 = i20;
                                    i35 = i21;
                                    i32 = i22;
                                    i12 = i12;
                                    unsafe2 = unsafe;
                                } else {
                                    i30 = i11;
                                    iC = c.p(b0Var2.o(i27), bArr4, i36, i30, bVar2);
                                    if ((i46 & i44) == 0) {
                                        unsafe2.putObject(t10, j10, bVar2.f21039c);
                                    } else {
                                        unsafe2.putObject(t10, j10, Internal.a(unsafe2.getObject(t10, j10), bVar2.f21039c));
                                    }
                                    i34 = i46 | i44;
                                    i35 = i25;
                                    i33 = i26;
                                    bArr = bArr4;
                                    iG = iC;
                                    i11 = i30;
                                    i32 = i27;
                                    i31 = i18;
                                    i12 = i12;
                                }
                                break;
                            case 10:
                                i26 = i40;
                                i18 = i37;
                                i27 = iQ2;
                                bArr4 = bArr;
                                if (i38 != 2) {
                                    i28 = i25;
                                    i29 = i36;
                                    i21 = i28;
                                    i20 = i46;
                                    unsafe = unsafe2;
                                    i22 = i27;
                                    i19 = i29;
                                    i17 = i26;
                                    if (i17 == i12) {
                                    }
                                    if (this.f21024f) {
                                        iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                    } else {
                                        iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                    }
                                    i33 = i17;
                                    b0Var2 = this;
                                    bVar2 = bVar;
                                    i31 = i18;
                                    i34 = i20;
                                    i35 = i21;
                                    i32 = i22;
                                    i12 = i12;
                                    unsafe2 = unsafe;
                                } else {
                                    iB = c.b(bArr4, i36, bVar2);
                                    unsafe2.putObject(t10, j10, bVar2.f21039c);
                                    i34 = i46 | i44;
                                    i32 = i27;
                                    i35 = i25;
                                    i33 = i26;
                                    i11 = i11;
                                    i12 = i12;
                                    bArr = bArr4;
                                    iG = iB;
                                    i31 = i18;
                                }
                                break;
                            case 12:
                                i26 = i40;
                                i18 = i37;
                                i27 = iQ2;
                                bArr4 = bArr;
                                if (i38 != 0) {
                                    i28 = i25;
                                    i29 = i36;
                                    i21 = i28;
                                    i20 = i46;
                                    unsafe = unsafe2;
                                    i22 = i27;
                                    i19 = i29;
                                    i17 = i26;
                                    if (i17 == i12) {
                                    }
                                    if (this.f21024f) {
                                        iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                    } else {
                                        iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                    }
                                    i33 = i17;
                                    b0Var2 = this;
                                    bVar2 = bVar;
                                    i31 = i18;
                                    i34 = i20;
                                    i35 = i21;
                                    i32 = i22;
                                    i12 = i12;
                                    unsafe2 = unsafe;
                                } else {
                                    iB = c.I(bArr4, i36, bVar2);
                                    int i47 = bVar2.f21037a;
                                    Internal.EnumVerifier enumVerifierM = b0Var2.m(i27);
                                    if (enumVerifierM == null || enumVerifierM.isInRange(i47)) {
                                        unsafe2.putInt(t10, j10, i47);
                                        i34 = i46 | i44;
                                    } else {
                                        p(t10).c(i26, Long.valueOf(i47));
                                        i34 = i46;
                                    }
                                    i32 = i27;
                                    i35 = i25;
                                    i33 = i26;
                                    i11 = i11;
                                    i12 = i12;
                                    bArr = bArr4;
                                    iG = iB;
                                    i31 = i18;
                                }
                                break;
                            case 15:
                                i26 = i40;
                                i18 = i37;
                                i27 = iQ2;
                                bArr4 = bArr;
                                if (i38 != 0) {
                                    i28 = i25;
                                    i29 = i36;
                                    i21 = i28;
                                    i20 = i46;
                                    unsafe = unsafe2;
                                    i22 = i27;
                                    i19 = i29;
                                    i17 = i26;
                                    if (i17 == i12) {
                                    }
                                    if (this.f21024f) {
                                        iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                    } else {
                                        iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                    }
                                    i33 = i17;
                                    b0Var2 = this;
                                    bVar2 = bVar;
                                    i31 = i18;
                                    i34 = i20;
                                    i35 = i21;
                                    i32 = i22;
                                    i12 = i12;
                                    unsafe2 = unsafe;
                                } else {
                                    iB = c.I(bArr4, i36, bVar2);
                                    unsafe2.putInt(t10, j10, CodedInputStream.decodeZigZag32(bVar2.f21037a));
                                    i34 = i46 | i44;
                                    i32 = i27;
                                    i35 = i25;
                                    i33 = i26;
                                    i11 = i11;
                                    i12 = i12;
                                    bArr = bArr4;
                                    iG = iB;
                                    i31 = i18;
                                }
                                break;
                            case 16:
                                i26 = i40;
                                i18 = i37;
                                i27 = iQ2;
                                if (i38 != 0) {
                                    i28 = i25;
                                    i29 = i36;
                                    i21 = i28;
                                    i20 = i46;
                                    unsafe = unsafe2;
                                    i22 = i27;
                                    i19 = i29;
                                    i17 = i26;
                                    if (i17 == i12) {
                                    }
                                    if (this.f21024f) {
                                        iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                    } else {
                                        iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                    }
                                    i33 = i17;
                                    b0Var2 = this;
                                    bVar2 = bVar;
                                    i31 = i18;
                                    i34 = i20;
                                    i35 = i21;
                                    i32 = i22;
                                    i12 = i12;
                                    unsafe2 = unsafe;
                                } else {
                                    int iK3 = c.K(bArr, i36, bVar2);
                                    unsafe2.putLong(t10, j10, CodedInputStream.decodeZigZag64(bVar2.f21038b));
                                    i34 = i46 | i44;
                                    i32 = i27;
                                    i35 = i25;
                                    i33 = i26;
                                    i31 = i18;
                                    iG = iK3;
                                    i11 = i11;
                                    i12 = i12;
                                    bArr = bArr;
                                }
                                break;
                            case 17:
                                if (i38 != 3) {
                                    i26 = i40;
                                    i18 = i37;
                                    i27 = iQ2;
                                    i28 = i25;
                                    i29 = i36;
                                    i21 = i28;
                                    i20 = i46;
                                    unsafe = unsafe2;
                                    i22 = i27;
                                    i19 = i29;
                                    i17 = i26;
                                    if (i17 == i12) {
                                    }
                                    if (this.f21024f) {
                                        iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                    } else {
                                        iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                    }
                                    i33 = i17;
                                    b0Var2 = this;
                                    bVar2 = bVar;
                                    i31 = i18;
                                    i34 = i20;
                                    i35 = i21;
                                    i32 = i22;
                                    i12 = i12;
                                    unsafe2 = unsafe;
                                } else {
                                    int i48 = iQ2;
                                    iG = c.n(b0Var2.o(iQ2), bArr, i36, i11, (i37 << 3) | 4, bVar);
                                    if ((i46 & i44) == 0) {
                                        unsafe2.putObject(t10, j10, bVar2.f21039c);
                                    } else {
                                        unsafe2.putObject(t10, j10, Internal.a(unsafe2.getObject(t10, j10), bVar2.f21039c));
                                    }
                                    i34 = i46 | i44;
                                    i32 = i48;
                                    i35 = i25;
                                    i33 = i40;
                                    i31 = i37;
                                    bArr = bArr;
                                    i11 = i11;
                                    i12 = i12;
                                }
                                break;
                            default:
                                i26 = i40;
                                i18 = i37;
                                i27 = iQ2;
                                i28 = i25;
                                i29 = i36;
                                i21 = i28;
                                i20 = i46;
                                unsafe = unsafe2;
                                i22 = i27;
                                i19 = i29;
                                i17 = i26;
                                if (i17 == i12) {
                                }
                                if (this.f21024f) {
                                    iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                } else {
                                    iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                }
                                i33 = i17;
                                b0Var2 = this;
                                bVar2 = bVar;
                                i31 = i18;
                                i34 = i20;
                                i35 = i21;
                                i32 = i22;
                                i12 = i12;
                                unsafe2 = unsafe;
                                break;
                        }
                    } else {
                        i18 = i37;
                        int i49 = iQ2;
                        int i50 = i36;
                        if (iR != 27) {
                            i20 = i34;
                            i21 = i35;
                            if (iR <= 49) {
                                i22 = i49;
                                unsafe = unsafe2;
                                iG = I(t10, bArr, i50, i11, i40, i18, i38, i22, i42, iR, j10, bVar);
                                if (iG != i50) {
                                    i24 = i40;
                                    i24 = i40;
                                    i24 = i40;
                                    b0Var2 = this;
                                    i33 = i24;
                                    i12 = i12;
                                    bVar2 = bVar;
                                    i31 = i18;
                                    i34 = i20;
                                    i35 = i21;
                                    i32 = i22;
                                } else {
                                    i24 = i40;
                                    i24 = i40;
                                    i24 = i40;
                                    i17 = i24;
                                    i19 = iG;
                                }
                                unsafe2 = unsafe;
                            } else {
                                i22 = i49;
                                unsafe = unsafe2;
                                i23 = i50;
                                if (iR == 50) {
                                    if (i38 == 2) {
                                        iG = E(t10, bArr, i23, i11, i22, j10, bVar);
                                        if (iG != i23) {
                                            i24 = i40;
                                            i24 = i40;
                                            i24 = i40;
                                            b0Var2 = this;
                                            i33 = i24;
                                            i12 = i12;
                                            bVar2 = bVar;
                                            i31 = i18;
                                            i34 = i20;
                                            i35 = i21;
                                            i32 = i22;
                                        } else {
                                            i24 = i40;
                                            i24 = i40;
                                            i24 = i40;
                                            i17 = i24;
                                            i19 = iG;
                                        }
                                        unsafe2 = unsafe;
                                    }
                                    if (i17 == i12) {
                                    }
                                    if (this.f21024f) {
                                        iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                    } else {
                                        iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                                    }
                                    i33 = i17;
                                    b0Var2 = this;
                                    bVar2 = bVar;
                                    i31 = i18;
                                    i34 = i20;
                                    i35 = i21;
                                    i32 = i22;
                                    i12 = i12;
                                    unsafe2 = unsafe;
                                } else {
                                    iG = F(t10, bArr, i23, i11, i24, i18, i38, i42, iR, j10, i22, bVar);
                                    if (iG != i23) {
                                        i24 = i40;
                                        i24 = i40;
                                        i24 = i40;
                                        b0Var2 = this;
                                        i33 = i24;
                                        i12 = i12;
                                        bVar2 = bVar;
                                        i31 = i18;
                                        i34 = i20;
                                        i35 = i21;
                                        i32 = i22;
                                    } else {
                                        i24 = i40;
                                        i24 = i40;
                                        i24 = i40;
                                        i17 = i24;
                                        i19 = iG;
                                    }
                                    unsafe2 = unsafe;
                                }
                            }
                        } else if (i38 == 2) {
                            Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe2.getObject(t10, j10);
                            if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
                                int size = protobufListMutableCopyWithCapacity2.size();
                                protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(t10, j10, protobufListMutableCopyWithCapacity2);
                            }
                            iG = c.q(b0Var2.o(i49), i40, bArr, i50, i11, protobufListMutableCopyWithCapacity2, bVar);
                            bArr = bArr;
                            i32 = i49;
                            i33 = i40;
                            i31 = i18;
                            i34 = i34;
                            i35 = i35;
                            i11 = i11;
                        } else {
                            i20 = i34;
                            i21 = i35;
                            i22 = i49;
                            unsafe = unsafe2;
                            i23 = i50;
                            i24 = i40;
                        }
                        i24 = i40;
                        i17 = i24;
                        i19 = i23;
                        if (i17 == i12) {
                        }
                        if (this.f21024f) {
                            iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                        } else {
                            iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                        }
                        i33 = i17;
                        b0Var2 = this;
                        bVar2 = bVar;
                        i31 = i18;
                        i34 = i20;
                        i35 = i21;
                        i32 = i22;
                        i12 = i12;
                        unsafe2 = unsafe;
                    }
                }
                if (i17 == i12) {
                }
                if (this.f21024f) {
                    iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                } else {
                    iG = c.G(i17, bArr, i19, i11, p(t10), bVar);
                }
                i33 = i17;
                b0Var2 = this;
                bVar2 = bVar;
                i31 = i18;
                i34 = i20;
                i35 = i21;
                i32 = i22;
                i12 = i12;
                unsafe2 = unsafe;
            } else {
                unsafe = unsafe2;
                i13 = i12;
                b0Var = b0Var2;
            }
        }
        if (i35 != -1) {
            t11 = t10;
            unsafe.putInt(t11, i35, i34);
        } else {
            t11 = t10;
        }
        UnknownFieldSetLite unknownFieldSetLite = null;
        int i51 = b0Var.f21029k;
        while (true) {
            int i52 = b0Var.f21030l;
            t0<?, ?> t0Var = b0Var.f21032o;
            if (i51 >= i52) {
                if (unknownFieldSetLite != null) {
                    t0Var.n(t11, unknownFieldSetLite);
                }
                if (i13 == 0) {
                    if (iG != i11) {
                        throw InvalidProtocolBufferException.g();
                    }
                } else if (iG > i11 || i33 != i13) {
                    throw InvalidProtocolBufferException.g();
                }
                return iG;
            }
            unknownFieldSetLite = (UnknownFieldSetLite) b0Var.l(t11, b0Var.f21028j[i51], unknownFieldSetLite, t0Var);
            i51++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f9, code lost:
    
        if (r0 != r15) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0211, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x023f, code lost:
    
        if (r0 != r15) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x025e, code lost:
    
        if (r0 != r15) goto L101;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x006c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(java.lang.Object r28, byte[] r29, int r30, int r31, androidx.datastore.preferences.protobuf.c.b r32) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.b0.H(java.lang.Object, byte[], int, int, androidx.datastore.preferences.protobuf.c$b):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int I(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, c.b bVar) throws IOException {
        int iJ;
        Unsafe unsafe = f21018s;
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
                return i14 == 2 ? c.q(o(i15), i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
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
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t10;
                UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
                if (unknownFieldSetLite == UnknownFieldSetLite.getDefaultInstance()) {
                    unknownFieldSetLite = null;
                }
                UnknownFieldSetLite unknownFieldSetLite2 = (UnknownFieldSetLite) p0.A(i13, protobufListMutableCopyWithCapacity2, m(i15), unknownFieldSetLite, this.f21032o);
                if (unknownFieldSetLite2 != null) {
                    generatedMessageLite.unknownFields = unknownFieldSetLite2;
                }
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
                return i14 == 3 ? c.o(o(i15), i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            default:
                return i10;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final <E> void J(Object obj, long j10, m0 m0Var, o0<E> o0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        m0Var.I(this.f21031n.c(j10, obj), o0Var, extensionRegistryLite);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final <E> void K(Object obj, int i10, m0 m0Var, o0<E> o0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        m0Var.q(this.f21031n.c(i10 & 1048575, obj), o0Var, extensionRegistryLite);
    }

    public final void L(Object obj, int i10, m0 m0Var) throws IOException {
        if ((536870912 & i10) != 0) {
            v0.x(i10 & 1048575, obj, m0Var.O());
        } else if (this.f21025g) {
            v0.x(i10 & 1048575, obj, m0Var.E());
        } else {
            v0.x(i10 & 1048575, obj, m0Var.o());
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void M(Object obj, int i10, m0 m0Var) throws IOException {
        boolean z10 = (536870912 & i10) != 0;
        s sVar = this.f21031n;
        if (z10) {
            m0Var.n(sVar.c(i10 & 1048575, obj));
        } else {
            m0Var.G(sVar.c(i10 & 1048575, obj));
        }
    }

    public final void O(int i10, Object obj) {
        if (this.f21026h) {
            return;
        }
        int i11 = this.f21019a[i10 + 2];
        long j10 = i11 & 1048575;
        v0.v(v0.f21151d.j(j10, obj) | (1 << (i11 >>> 20)), j10, obj);
    }

    public final void P(int i10, int i11, Object obj) {
        v0.v(i10, this.f21019a[i11 + 2] & 1048575, obj);
    }

    public final int Q(int i10, int i11) {
        int[] iArr = this.f21019a;
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

    public final int S(int i10) {
        return this.f21019a[i10 + 1];
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final void T(Object obj, h hVar) throws IOException {
        Iterator itM;
        Map.Entry<?, ?> entry;
        int i10;
        boolean z10 = this.f21024f;
        k<?> kVar = this.f21033p;
        if (z10) {
            FieldSet<T> fieldSetC = kVar.c(obj);
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
        int[] iArr = this.f21019a;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        for (int length = iArr.length; i12 < length; length = length) {
            int iS = S(i12);
            int i14 = iArr[i12];
            int iR = R(iS);
            boolean z11 = this.f21026h;
            Unsafe unsafe = f21018s;
            if (z11 || iR > 17) {
                entry = entry;
                i10 = 0;
            } else {
                int i15 = iArr[i12 + 2];
                Map.Entry<?, ?> entry2 = entry;
                int i16 = i15 & 1048575;
                if (i16 != i11) {
                    i13 = unsafe.getInt(obj, i16);
                    i11 = i16;
                }
                i10 = 1 << (i15 >>> 20);
                entry = entry2;
            }
            while (entry != null && kVar.a(entry) <= i14) {
                kVar.j(hVar, entry);
                entry = itM.hasNext() ? (Map.Entry) itM.next() : null;
            }
            long j10 = iS & 1048575;
            switch (iR) {
                case 0:
                    if ((i10 & i13) != 0) {
                        hVar.c(i14, v0.f21151d.h(j10, obj));
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 1:
                    if ((i10 & i13) != 0) {
                        hVar.g(i14, v0.f21151d.i(j10, obj));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 2:
                    if ((i10 & i13) != 0) {
                        hVar.j(i14, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 3:
                    if ((i10 & i13) != 0) {
                        hVar.r(i14, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 4:
                    if ((i10 & i13) != 0) {
                        hVar.i(i14, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 5:
                    if ((i10 & i13) != 0) {
                        hVar.f(i14, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 6:
                    if ((i10 & i13) != 0) {
                        hVar.e(i14, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 7:
                    if ((i10 & i13) != 0) {
                        hVar.a(i14, v0.f21151d.e(j10, obj));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 8:
                    if ((i10 & i13) != 0) {
                        V(i14, unsafe.getObject(obj, j10), hVar);
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 9:
                    if ((i10 & i13) != 0) {
                        hVar.k(i14, o(i12), unsafe.getObject(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 10:
                    if ((i10 & i13) != 0) {
                        hVar.b(i14, (ByteString) unsafe.getObject(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 11:
                    if ((i10 & i13) != 0) {
                        hVar.q(i14, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 12:
                    if ((i10 & i13) != 0) {
                        hVar.d(i14, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 13:
                    if ((i10 & i13) != 0) {
                        hVar.m(i14, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 14:
                    if ((i10 & i13) != 0) {
                        hVar.n(i14, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 15:
                    if ((i10 & i13) != 0) {
                        hVar.o(i14, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 16:
                    if ((i10 & i13) != 0) {
                        hVar.p(i14, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 17:
                    if ((i10 & i13) != 0) {
                        hVar.h(i14, o(i12), unsafe.getObject(obj, j10));
                    } else {
                        continue;
                    }
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 18:
                    p0.G(iArr[i12], (List) unsafe.getObject(obj, j10), hVar, false);
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 19:
                    p0.K(iArr[i12], (List) unsafe.getObject(obj, j10), hVar, false);
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 20:
                    p0.N(iArr[i12], (List) unsafe.getObject(obj, j10), hVar, false);
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 21:
                    p0.V(iArr[i12], (List) unsafe.getObject(obj, j10), hVar, false);
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 22:
                    p0.M(iArr[i12], (List) unsafe.getObject(obj, j10), hVar, false);
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 23:
                    p0.J(iArr[i12], (List) unsafe.getObject(obj, j10), hVar, false);
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 24:
                    p0.I(iArr[i12], (List) unsafe.getObject(obj, j10), hVar, false);
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 25:
                    p0.E(iArr[i12], (List) unsafe.getObject(obj, j10), hVar, false);
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 26:
                    p0.T(iArr[i12], (List) unsafe.getObject(obj, j10), hVar);
                    break;
                case 27:
                    p0.O(iArr[i12], (List) unsafe.getObject(obj, j10), hVar, o(i12));
                    break;
                case 28:
                    p0.F(iArr[i12], (List) unsafe.getObject(obj, j10), hVar);
                    break;
                case 29:
                    p0.U(iArr[i12], (List) unsafe.getObject(obj, j10), hVar, false);
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 30:
                    p0.H(iArr[i12], (List) unsafe.getObject(obj, j10), hVar, false);
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 31:
                    p0.P(iArr[i12], (List) unsafe.getObject(obj, j10), hVar, false);
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 32:
                    p0.Q(iArr[i12], (List) unsafe.getObject(obj, j10), hVar, false);
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 33:
                    p0.R(iArr[i12], (List) unsafe.getObject(obj, j10), hVar, false);
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 34:
                    p0.S(iArr[i12], (List) unsafe.getObject(obj, j10), hVar, false);
                    continue;
                    i12 += 3;
                    iArr = iArr;
                    break;
                case 35:
                    p0.G(iArr[i12], (List) unsafe.getObject(obj, j10), hVar, true);
                    break;
                case 36:
                    p0.K(iArr[i12], (List) unsafe.getObject(obj, j10), hVar, true);
                    break;
                case 37:
                    p0.N(iArr[i12], (List) unsafe.getObject(obj, j10), hVar, true);
                    break;
                case 38:
                    p0.V(iArr[i12], (List) unsafe.getObject(obj, j10), hVar, true);
                    break;
                case 39:
                    p0.M(iArr[i12], (List) unsafe.getObject(obj, j10), hVar, true);
                    break;
                case 40:
                    p0.J(iArr[i12], (List) unsafe.getObject(obj, j10), hVar, true);
                    break;
                case 41:
                    p0.I(iArr[i12], (List) unsafe.getObject(obj, j10), hVar, true);
                    break;
                case 42:
                    p0.E(iArr[i12], (List) unsafe.getObject(obj, j10), hVar, true);
                    break;
                case 43:
                    p0.U(iArr[i12], (List) unsafe.getObject(obj, j10), hVar, true);
                    break;
                case 44:
                    p0.H(iArr[i12], (List) unsafe.getObject(obj, j10), hVar, true);
                    break;
                case 45:
                    p0.P(iArr[i12], (List) unsafe.getObject(obj, j10), hVar, true);
                    break;
                case 46:
                    p0.Q(iArr[i12], (List) unsafe.getObject(obj, j10), hVar, true);
                    break;
                case 47:
                    p0.R(iArr[i12], (List) unsafe.getObject(obj, j10), hVar, true);
                    break;
                case 48:
                    p0.S(iArr[i12], (List) unsafe.getObject(obj, j10), hVar, true);
                    break;
                case 49:
                    p0.L(iArr[i12], (List) unsafe.getObject(obj, j10), hVar, o(i12));
                    break;
                case 50:
                    U(hVar, i14, unsafe.getObject(obj, j10), i12);
                    break;
                case 51:
                    if (t(i14, i12, obj)) {
                        hVar.c(i14, ((Double) v0.f21151d.m(j10, obj)).doubleValue());
                    }
                    break;
                case 52:
                    if (t(i14, i12, obj)) {
                        hVar.g(i14, ((Float) v0.f21151d.m(j10, obj)).floatValue());
                    }
                    break;
                case 53:
                    if (t(i14, i12, obj)) {
                        hVar.j(i14, D(j10, obj));
                    }
                    break;
                case 54:
                    if (t(i14, i12, obj)) {
                        hVar.r(i14, D(j10, obj));
                    }
                    break;
                case 55:
                    if (t(i14, i12, obj)) {
                        hVar.i(i14, C(j10, obj));
                    }
                    break;
                case 56:
                    if (t(i14, i12, obj)) {
                        hVar.f(i14, D(j10, obj));
                    }
                    break;
                case 57:
                    if (t(i14, i12, obj)) {
                        hVar.e(i14, C(j10, obj));
                    }
                    break;
                case 58:
                    if (t(i14, i12, obj)) {
                        hVar.a(i14, ((Boolean) v0.f21151d.m(j10, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (t(i14, i12, obj)) {
                        V(i14, unsafe.getObject(obj, j10), hVar);
                    }
                    break;
                case 60:
                    if (t(i14, i12, obj)) {
                        hVar.k(i14, o(i12), unsafe.getObject(obj, j10));
                    }
                    break;
                case 61:
                    if (t(i14, i12, obj)) {
                        hVar.b(i14, (ByteString) unsafe.getObject(obj, j10));
                    }
                    break;
                case 62:
                    if (t(i14, i12, obj)) {
                        hVar.q(i14, C(j10, obj));
                    }
                    break;
                case 63:
                    if (t(i14, i12, obj)) {
                        hVar.d(i14, C(j10, obj));
                    }
                    break;
                case 64:
                    if (t(i14, i12, obj)) {
                        hVar.m(i14, C(j10, obj));
                    }
                    break;
                case 65:
                    if (t(i14, i12, obj)) {
                        hVar.n(i14, D(j10, obj));
                    }
                    break;
                case 66:
                    if (t(i14, i12, obj)) {
                        hVar.o(i14, C(j10, obj));
                    }
                    break;
                case 67:
                    if (t(i14, i12, obj)) {
                        hVar.p(i14, D(j10, obj));
                    }
                    break;
                case 68:
                    if (t(i14, i12, obj)) {
                        hVar.h(i14, o(i12), unsafe.getObject(obj, j10));
                    }
                    break;
            }
            i12 += 3;
            iArr = iArr;
        }
        while (entry != null) {
            kVar.j(hVar, entry);
            entry = itM.hasNext() ? (Map.Entry) itM.next() : null;
        }
        t0<?, ?> t0Var = this.f21032o;
        t0Var.s(t0Var.g(obj), hVar);
    }

    public final void U(h hVar, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            Object objN = n(i11);
            v vVar = this.f21034q;
            MapEntryLite.b<?, ?> bVarB = vVar.b(objN);
            MapFieldLite mapFieldLiteD = vVar.d(obj);
            CodedOutputStream codedOutputStream = hVar.f21064a;
            if (!codedOutputStream.f20855b) {
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
            switch (h.a.f21065a[bVarB.f20972a.ordinal()]) {
                case 1:
                    Boolean bool = Boolean.FALSE;
                    V v3 = mapFieldLiteD.get(bool);
                    CodedOutputStream codedOutputStream2 = hVar.f21064a;
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
                    throw new IllegalArgumentException("does not support key type: " + bVarB.f20972a);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final void a(T t10, T t11) {
        t11.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f21019a;
            if (i10 >= iArr.length) {
                if (this.f21026h) {
                    return;
                }
                Class<?> cls = p0.f21106a;
                t0<?, ?> t0Var = this.f21032o;
                t0Var.o(t10, t0Var.k(t0Var.g(t10), t0Var.g(t11)));
                if (this.f21024f) {
                    k<?> kVar = this.f21033p;
                    FieldSet<T> fieldSetC = kVar.c(t11);
                    if (fieldSetC.f20914a.isEmpty()) {
                        return;
                    }
                    kVar.d(t10).o(fieldSetC);
                    return;
                }
                return;
            }
            int iS = S(i10);
            long j10 = 1048575 & iS;
            int i11 = iArr[i10];
            switch (R(iS)) {
                case 0:
                    if (s(i10, t11)) {
                        v0.t(t10, j10, v0.f21151d.h(j10, t11));
                        O(i10, t10);
                    }
                    break;
                case 1:
                    if (s(i10, t11)) {
                        v0.u(t10, j10, v0.f21151d.i(j10, t11));
                        O(i10, t10);
                    }
                    break;
                case 2:
                    if (s(i10, t11)) {
                        v0.w(t10, j10, v0.f21151d.l(j10, t11));
                        O(i10, t10);
                    }
                    break;
                case 3:
                    if (s(i10, t11)) {
                        v0.w(t10, j10, v0.f21151d.l(j10, t11));
                        O(i10, t10);
                    }
                    break;
                case 4:
                    if (s(i10, t11)) {
                        v0.v(v0.f21151d.j(j10, t11), j10, t10);
                        O(i10, t10);
                    }
                    break;
                case 5:
                    if (s(i10, t11)) {
                        v0.w(t10, j10, v0.f21151d.l(j10, t11));
                        O(i10, t10);
                    }
                    break;
                case 6:
                    if (s(i10, t11)) {
                        v0.v(v0.f21151d.j(j10, t11), j10, t10);
                        O(i10, t10);
                    }
                    break;
                case 7:
                    if (s(i10, t11)) {
                        v0.o(t10, j10, v0.f21151d.e(j10, t11));
                        O(i10, t10);
                    }
                    break;
                case 8:
                    if (s(i10, t11)) {
                        v0.x(j10, t10, v0.f21151d.m(j10, t11));
                        O(i10, t10);
                    }
                    break;
                case 9:
                    x(i10, t10, t11);
                    break;
                case 10:
                    if (s(i10, t11)) {
                        v0.x(j10, t10, v0.f21151d.m(j10, t11));
                        O(i10, t10);
                    }
                    break;
                case 11:
                    if (s(i10, t11)) {
                        v0.v(v0.f21151d.j(j10, t11), j10, t10);
                        O(i10, t10);
                    }
                    break;
                case 12:
                    if (s(i10, t11)) {
                        v0.v(v0.f21151d.j(j10, t11), j10, t10);
                        O(i10, t10);
                    }
                    break;
                case 13:
                    if (s(i10, t11)) {
                        v0.v(v0.f21151d.j(j10, t11), j10, t10);
                        O(i10, t10);
                    }
                    break;
                case 14:
                    if (s(i10, t11)) {
                        v0.w(t10, j10, v0.f21151d.l(j10, t11));
                        O(i10, t10);
                    }
                    break;
                case 15:
                    if (s(i10, t11)) {
                        v0.v(v0.f21151d.j(j10, t11), j10, t10);
                        O(i10, t10);
                    }
                    break;
                case 16:
                    if (s(i10, t11)) {
                        v0.w(t10, j10, v0.f21151d.l(j10, t11));
                        O(i10, t10);
                    }
                    break;
                case 17:
                    x(i10, t10, t11);
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
                    this.f21031n.b(j10, t10, t11);
                    break;
                case 50:
                    Class<?> cls2 = p0.f21106a;
                    v0.e eVar = v0.f21151d;
                    v0.x(j10, t10, this.f21034q.a(eVar.m(j10, t10), eVar.m(j10, t11)));
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
                    if (t(i11, i10, t11)) {
                        v0.x(j10, t10, v0.f21151d.m(j10, t11));
                        P(i11, i10, t10);
                    }
                    break;
                case 60:
                    y(i10, t10, t11);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (t(i11, i10, t11)) {
                        v0.x(j10, t10, v0.f21151d.m(j10, t11));
                        P(i11, i10, t10);
                    }
                    break;
                case 68:
                    y(i10, t10, t11);
                    break;
            }
            i10 += 3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final void b(T t10) {
        int[] iArr;
        int i10;
        int i11 = this.f21029k;
        while (true) {
            iArr = this.f21028j;
            i10 = this.f21030l;
            if (i11 >= i10) {
                break;
            }
            long jS = S(iArr[i11]) & 1048575;
            Object objM = v0.f21151d.m(jS, t10);
            if (objM != null) {
                v0.x(jS, t10, this.f21034q.e(objM));
            }
            i11++;
        }
        int length = iArr.length;
        while (i10 < length) {
            this.f21031n.a(iArr[i10], t10);
            i10++;
        }
        this.f21032o.j(t10);
        if (this.f21024f) {
            this.f21033p.f(t10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fa A[LOOP:2: B:60:0x00e9->B:65:0x00fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x0109  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x011d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.datastore.preferences.protobuf.o0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.datastore.preferences.protobuf.o0] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.datastore.preferences.protobuf.o0] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27, types: [androidx.datastore.preferences.protobuf.o0] */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    @Override // androidx.datastore.preferences.protobuf.o0
    public final boolean c(T t10) {
        int i10;
        List list;
        ?? O;
        int i11;
        int i12 = -1;
        int i13 = 0;
        for (int i14 = 0; i14 < this.f21029k; i14++) {
            int i15 = this.f21028j[i14];
            int[] iArr = this.f21019a;
            int i16 = iArr[i15];
            int iS = S(i15);
            boolean z10 = this.f21026h;
            if (z10) {
                i10 = 0;
            } else {
                int i17 = iArr[i15 + 2];
                int i18 = i17 & 1048575;
                i10 = 1 << (i17 >>> 20);
                if (i18 != i12) {
                    i13 = f21018s.getInt(t10, i18);
                    i12 = i18;
                }
            }
            if ((268435456 & iS) != 0) {
                if (z10) {
                    if (!s(i15, t10)) {
                        return false;
                    }
                } else if ((i13 & i10) == 0) {
                    return false;
                }
            }
            int iR = R(iS);
            if (iR == 9 || iR == 17) {
                if (z10) {
                    if (s(i15, t10)) {
                        if (!o(i15).c(v0.f21151d.m(iS & 1048575, t10))) {
                            return false;
                        }
                    } else {
                        continue;
                    }
                } else if ((i10 & i13) != 0) {
                    if (!o(i15).c(v0.f21151d.m(iS & 1048575, t10))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (iR == 27) {
                list = (List) v0.f21151d.m(iS & 1048575, t10);
                if (list.isEmpty()) {
                    continue;
                } else {
                    O = o(i15);
                    for (i11 = 0; i11 < list.size(); i11++) {
                        if (!O.c(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (iR == 60 || iR == 68) {
                if (t(i16, i15, t10)) {
                    if (!o(i15).c(v0.f21151d.m(iS & 1048575, t10))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (iR == 49) {
                list = (List) v0.f21151d.m(iS & 1048575, t10);
                if (list.isEmpty()) {
                    continue;
                } else {
                    O = o(i15);
                    while (i11 < list.size()) {
                        if (!O.c(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (iR != 50) {
                continue;
            } else {
                Object objM = v0.f21151d.m(iS & 1048575, t10);
                v vVar = this.f21034q;
                MapFieldLite mapFieldLiteD = vVar.d(objM);
                if (!mapFieldLiteD.isEmpty() && vVar.b(n(i15)).f20974c.getJavaType() == WireFormat.JavaType.MESSAGE) {
                    ?? A = 0;
                    for (Object obj : mapFieldLiteD.values()) {
                        if (A == 0) {
                            A = A;
                            A = j0.f21070c.a(obj.getClass());
                        }
                        A = A;
                        if (!A.c(obj)) {
                            return false;
                        }
                    }
                }
            }
        }
        return !this.f21024f || this.f21033p.c(t10).k();
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final int d(T t10) {
        return this.f21026h ? r(t10) : q(t10);
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final int e(T t10) {
        int i10;
        int iHashLong;
        int[] iArr = this.f21019a;
        int length = iArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iS = S(i12);
            int i13 = iArr[i12];
            long j10 = 1048575 & iS;
            int iHashCode = 37;
            switch (R(iS)) {
                case 0:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(Double.doubleToLongBits(v0.f21151d.h(j10, t10)));
                    i11 = iHashLong + i10;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iHashLong = Float.floatToIntBits(v0.f21151d.i(j10, t10));
                    i11 = iHashLong + i10;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(v0.f21151d.l(j10, t10));
                    i11 = iHashLong + i10;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(v0.f21151d.l(j10, t10));
                    i11 = iHashLong + i10;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iHashLong = v0.f21151d.j(j10, t10);
                    i11 = iHashLong + i10;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(v0.f21151d.l(j10, t10));
                    i11 = iHashLong + i10;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iHashLong = v0.f21151d.j(j10, t10);
                    i11 = iHashLong + i10;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashBoolean(v0.f21151d.e(j10, t10));
                    i11 = iHashLong + i10;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iHashLong = ((String) v0.f21151d.m(j10, t10)).hashCode();
                    i11 = iHashLong + i10;
                    break;
                case 9:
                    Object objM = v0.f21151d.m(j10, t10);
                    if (objM != null) {
                        iHashCode = objM.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iHashLong = v0.f21151d.m(j10, t10).hashCode();
                    i11 = iHashLong + i10;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iHashLong = v0.f21151d.j(j10, t10);
                    i11 = iHashLong + i10;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iHashLong = v0.f21151d.j(j10, t10);
                    i11 = iHashLong + i10;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iHashLong = v0.f21151d.j(j10, t10);
                    i11 = iHashLong + i10;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(v0.f21151d.l(j10, t10));
                    i11 = iHashLong + i10;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iHashLong = v0.f21151d.j(j10, t10);
                    i11 = iHashLong + i10;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(v0.f21151d.l(j10, t10));
                    i11 = iHashLong + i10;
                    break;
                case 17:
                    Object objM2 = v0.f21151d.m(j10, t10);
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
                    iHashLong = v0.f21151d.m(j10, t10).hashCode();
                    i11 = iHashLong + i10;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iHashLong = v0.f21151d.m(j10, t10).hashCode();
                    i11 = iHashLong + i10;
                    break;
                case 51:
                    if (t(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(Double.doubleToLongBits(((Double) v0.f21151d.m(j10, t10)).doubleValue()));
                        i11 = iHashLong + i10;
                    }
                    break;
                case 52:
                    if (t(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = Float.floatToIntBits(((Float) v0.f21151d.m(j10, t10)).floatValue());
                        i11 = iHashLong + i10;
                    }
                    break;
                case 53:
                    if (t(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(D(j10, t10));
                        i11 = iHashLong + i10;
                    }
                    break;
                case 54:
                    if (t(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(D(j10, t10));
                        i11 = iHashLong + i10;
                    }
                    break;
                case 55:
                    if (t(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = C(j10, t10);
                        i11 = iHashLong + i10;
                    }
                    break;
                case 56:
                    if (t(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(D(j10, t10));
                        i11 = iHashLong + i10;
                    }
                    break;
                case 57:
                    if (t(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = C(j10, t10);
                        i11 = iHashLong + i10;
                    }
                    break;
                case 58:
                    if (t(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashBoolean(((Boolean) v0.f21151d.m(j10, t10)).booleanValue());
                        i11 = iHashLong + i10;
                    }
                    break;
                case 59:
                    if (t(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = ((String) v0.f21151d.m(j10, t10)).hashCode();
                        i11 = iHashLong + i10;
                    }
                    break;
                case 60:
                    if (t(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = v0.f21151d.m(j10, t10).hashCode();
                        i11 = iHashLong + i10;
                    }
                    break;
                case 61:
                    if (t(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = v0.f21151d.m(j10, t10).hashCode();
                        i11 = iHashLong + i10;
                    }
                    break;
                case 62:
                    if (t(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = C(j10, t10);
                        i11 = iHashLong + i10;
                    }
                    break;
                case 63:
                    if (t(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = C(j10, t10);
                        i11 = iHashLong + i10;
                    }
                    break;
                case 64:
                    if (t(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = C(j10, t10);
                        i11 = iHashLong + i10;
                    }
                    break;
                case 65:
                    if (t(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(D(j10, t10));
                        i11 = iHashLong + i10;
                    }
                    break;
                case 66:
                    if (t(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = C(j10, t10);
                        i11 = iHashLong + i10;
                    }
                    break;
                case 67:
                    if (t(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(D(j10, t10));
                        i11 = iHashLong + i10;
                    }
                    break;
                case 68:
                    if (t(i13, i12, t10)) {
                        i10 = i11 * 53;
                        iHashLong = v0.f21151d.m(j10, t10).hashCode();
                        i11 = iHashLong + i10;
                    }
                    break;
            }
        }
        int iHashCode2 = this.f21032o.g(t10).hashCode() + (i11 * 53);
        return this.f21024f ? (iHashCode2 * 53) + this.f21033p.c(t10).f20914a.hashCode() : iHashCode2;
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final boolean f(T t10, T t11) {
        boolean zC;
        int[] iArr = this.f21019a;
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iS = S(i10);
            long j10 = iS & 1048575;
            switch (R(iS)) {
                case 0:
                    if (j(i10, t10, t11)) {
                        v0.e eVar = v0.f21151d;
                        if (Double.doubleToLongBits(eVar.h(j10, t10)) == Double.doubleToLongBits(eVar.h(j10, t11))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 1:
                    if (j(i10, t10, t11)) {
                        v0.e eVar2 = v0.f21151d;
                        if (Float.floatToIntBits(eVar2.i(j10, t10)) == Float.floatToIntBits(eVar2.i(j10, t11))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 2:
                    if (j(i10, t10, t11)) {
                        v0.e eVar3 = v0.f21151d;
                        if (eVar3.l(j10, t10) == eVar3.l(j10, t11)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 3:
                    if (j(i10, t10, t11)) {
                        v0.e eVar4 = v0.f21151d;
                        if (eVar4.l(j10, t10) == eVar4.l(j10, t11)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 4:
                    if (j(i10, t10, t11)) {
                        v0.e eVar5 = v0.f21151d;
                        if (eVar5.j(j10, t10) == eVar5.j(j10, t11)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 5:
                    if (j(i10, t10, t11)) {
                        v0.e eVar6 = v0.f21151d;
                        if (eVar6.l(j10, t10) == eVar6.l(j10, t11)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 6:
                    if (j(i10, t10, t11)) {
                        v0.e eVar7 = v0.f21151d;
                        if (eVar7.j(j10, t10) == eVar7.j(j10, t11)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 7:
                    if (j(i10, t10, t11)) {
                        v0.e eVar8 = v0.f21151d;
                        if (eVar8.e(j10, t10) == eVar8.e(j10, t11)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 8:
                    if (j(i10, t10, t11)) {
                        v0.e eVar9 = v0.f21151d;
                        if (p0.C(eVar9.m(j10, t10), eVar9.m(j10, t11))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 9:
                    if (j(i10, t10, t11)) {
                        v0.e eVar10 = v0.f21151d;
                        if (p0.C(eVar10.m(j10, t10), eVar10.m(j10, t11))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 10:
                    if (j(i10, t10, t11)) {
                        v0.e eVar11 = v0.f21151d;
                        if (p0.C(eVar11.m(j10, t10), eVar11.m(j10, t11))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 11:
                    if (j(i10, t10, t11)) {
                        v0.e eVar12 = v0.f21151d;
                        if (eVar12.j(j10, t10) == eVar12.j(j10, t11)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 12:
                    if (j(i10, t10, t11)) {
                        v0.e eVar13 = v0.f21151d;
                        if (eVar13.j(j10, t10) == eVar13.j(j10, t11)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 13:
                    if (j(i10, t10, t11)) {
                        v0.e eVar14 = v0.f21151d;
                        if (eVar14.j(j10, t10) == eVar14.j(j10, t11)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 14:
                    if (j(i10, t10, t11)) {
                        v0.e eVar15 = v0.f21151d;
                        if (eVar15.l(j10, t10) == eVar15.l(j10, t11)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 15:
                    if (j(i10, t10, t11)) {
                        v0.e eVar16 = v0.f21151d;
                        if (eVar16.j(j10, t10) == eVar16.j(j10, t11)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 16:
                    if (j(i10, t10, t11)) {
                        v0.e eVar17 = v0.f21151d;
                        if (eVar17.l(j10, t10) == eVar17.l(j10, t11)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 17:
                    if (j(i10, t10, t11)) {
                        v0.e eVar18 = v0.f21151d;
                        if (p0.C(eVar18.m(j10, t10), eVar18.m(j10, t11))) {
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
                    v0.e eVar19 = v0.f21151d;
                    zC = p0.C(eVar19.m(j10, t10), eVar19.m(j10, t11));
                    break;
                case 50:
                    v0.e eVar20 = v0.f21151d;
                    zC = p0.C(eVar20.m(j10, t10), eVar20.m(j10, t11));
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
                    v0.e eVar21 = v0.f21151d;
                    if (eVar21.j(j11, t10) != eVar21.j(j11, t11) || !p0.C(eVar21.m(j10, t10), eVar21.m(j10, t11))) {
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
        t0<?, ?> t0Var = this.f21032o;
        if (!t0Var.g(t10).equals(t0Var.g(t11))) {
            return false;
        }
        if (!this.f21024f) {
            return true;
        }
        k<?> kVar = this.f21033p;
        return kVar.c(t10).equals(kVar.c(t11));
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final void g(T t10, m0 m0Var, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        extensionRegistryLite.getClass();
        v(this.f21032o, this.f21033p, t10, m0Var, extensionRegistryLite);
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
    @Override // androidx.datastore.preferences.protobuf.o0
    public final void h(Object obj, h hVar) throws IOException {
        Iterator itM;
        Map.Entry<?, ?> entry;
        boolean z10;
        int i10;
        int i11;
        int i12;
        boolean z11;
        Map.Entry<?, ?> entry2;
        Iterator it;
        hVar.getClass();
        Writer.FieldOrder fieldOrder = Writer.FieldOrder.ASCENDING;
        Writer.FieldOrder fieldOrder2 = Writer.FieldOrder.DESCENDING;
        int[] iArr = this.f21019a;
        k<?> kVar = this.f21033p;
        boolean z12 = this.f21024f;
        t0<?, ?> t0Var = this.f21032o;
        int i13 = 1048575;
        boolean z13 = true;
        boolean z14 = false;
        if (fieldOrder == fieldOrder2) {
            t0Var.s(t0Var.g(obj), hVar);
            if (z12) {
                FieldSet<T> fieldSetC = kVar.c(obj);
                if (fieldSetC.f20914a.isEmpty()) {
                    entry2 = null;
                    it = null;
                } else {
                    boolean z15 = fieldSetC.f20916c;
                    r0<T, Object> r0Var = fieldSetC.f20914a;
                    if (z15) {
                        if (r0Var.v0 == null) {
                            r0Var.v0 = new r0.b();
                        }
                        it = new LazyField.b(r0Var.v0.iterator());
                    } else {
                        if (r0Var.v0 == null) {
                            r0Var.v0 = new r0.b();
                        }
                        it = r0Var.v0.iterator();
                    }
                    entry2 = (Map.Entry) it.next();
                }
            } else {
                entry2 = null;
                it = null;
            }
            for (int length = iArr.length - 3; length >= 0; length -= 3) {
                int iS = S(length);
                int i14 = iArr[length];
                while (entry2 != null && kVar.a(entry2) > i14) {
                    kVar.j(hVar, entry2);
                    entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                switch (R(iS)) {
                    case 0:
                        if (s(length, obj)) {
                            hVar.c(i14, v0.f21151d.h(iS & 1048575, obj));
                        }
                        break;
                    case 1:
                        if (s(length, obj)) {
                            hVar.g(i14, v0.f21151d.i(iS & 1048575, obj));
                        }
                        break;
                    case 2:
                        if (s(length, obj)) {
                            hVar.j(i14, v0.f21151d.l(iS & 1048575, obj));
                        }
                        break;
                    case 3:
                        if (s(length, obj)) {
                            hVar.r(i14, v0.f21151d.l(iS & 1048575, obj));
                        }
                        break;
                    case 4:
                        if (s(length, obj)) {
                            hVar.i(i14, v0.f21151d.j(iS & 1048575, obj));
                        }
                        break;
                    case 5:
                        if (s(length, obj)) {
                            hVar.f(i14, v0.f21151d.l(iS & 1048575, obj));
                        }
                        break;
                    case 6:
                        if (s(length, obj)) {
                            hVar.e(i14, v0.f21151d.j(iS & 1048575, obj));
                        }
                        break;
                    case 7:
                        if (s(length, obj)) {
                            hVar.a(i14, v0.f21151d.e(iS & 1048575, obj));
                        }
                        break;
                    case 8:
                        if (s(length, obj)) {
                            V(i14, v0.f21151d.m(iS & 1048575, obj), hVar);
                        }
                        break;
                    case 9:
                        if (s(length, obj)) {
                            hVar.k(i14, o(length), v0.f21151d.m(iS & 1048575, obj));
                        }
                        break;
                    case 10:
                        if (s(length, obj)) {
                            hVar.b(i14, (ByteString) v0.f21151d.m(iS & 1048575, obj));
                        }
                        break;
                    case 11:
                        if (s(length, obj)) {
                            hVar.q(i14, v0.f21151d.j(iS & 1048575, obj));
                        }
                        break;
                    case 12:
                        if (s(length, obj)) {
                            hVar.d(i14, v0.f21151d.j(iS & 1048575, obj));
                        }
                        break;
                    case 13:
                        if (s(length, obj)) {
                            hVar.m(i14, v0.f21151d.j(iS & 1048575, obj));
                        }
                        break;
                    case 14:
                        if (s(length, obj)) {
                            hVar.n(i14, v0.f21151d.l(iS & 1048575, obj));
                        }
                        break;
                    case 15:
                        if (s(length, obj)) {
                            hVar.o(i14, v0.f21151d.j(iS & 1048575, obj));
                        }
                        break;
                    case 16:
                        if (s(length, obj)) {
                            hVar.p(i14, v0.f21151d.l(iS & 1048575, obj));
                        }
                        break;
                    case 17:
                        if (s(length, obj)) {
                            hVar.h(i14, o(length), v0.f21151d.m(iS & 1048575, obj));
                        }
                        break;
                    case 18:
                        p0.G(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar, false);
                        break;
                    case 19:
                        p0.K(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar, false);
                        break;
                    case 20:
                        p0.N(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar, false);
                        break;
                    case 21:
                        p0.V(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar, false);
                        break;
                    case 22:
                        p0.M(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar, false);
                        break;
                    case 23:
                        p0.J(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar, false);
                        break;
                    case 24:
                        p0.I(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar, false);
                        break;
                    case 25:
                        p0.E(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar, false);
                        break;
                    case 26:
                        p0.T(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar);
                        break;
                    case 27:
                        p0.O(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar, o(length));
                        break;
                    case 28:
                        p0.F(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar);
                        break;
                    case 29:
                        p0.U(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar, false);
                        break;
                    case 30:
                        p0.H(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar, false);
                        break;
                    case 31:
                        p0.P(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar, false);
                        break;
                    case 32:
                        p0.Q(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar, false);
                        break;
                    case 33:
                        p0.R(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar, false);
                        break;
                    case 34:
                        p0.S(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar, false);
                        break;
                    case 35:
                        p0.G(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar, true);
                        break;
                    case 36:
                        p0.K(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar, true);
                        break;
                    case 37:
                        p0.N(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar, true);
                        break;
                    case 38:
                        p0.V(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar, true);
                        break;
                    case 39:
                        p0.M(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar, true);
                        break;
                    case 40:
                        p0.J(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar, true);
                        break;
                    case 41:
                        p0.I(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar, true);
                        break;
                    case 42:
                        p0.E(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar, true);
                        break;
                    case 43:
                        p0.U(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar, true);
                        break;
                    case 44:
                        p0.H(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar, true);
                        break;
                    case 45:
                        p0.P(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar, true);
                        break;
                    case 46:
                        p0.Q(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar, true);
                        break;
                    case 47:
                        p0.R(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar, true);
                        break;
                    case 48:
                        p0.S(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar, true);
                        break;
                    case 49:
                        p0.L(iArr[length], (List) v0.f21151d.m(iS & 1048575, obj), hVar, o(length));
                        break;
                    case 50:
                        U(hVar, i14, v0.f21151d.m(iS & 1048575, obj), length);
                        break;
                    case 51:
                        if (t(i14, length, obj)) {
                            hVar.c(i14, ((Double) v0.f21151d.m(iS & 1048575, obj)).doubleValue());
                        }
                        break;
                    case 52:
                        if (t(i14, length, obj)) {
                            hVar.g(i14, ((Float) v0.f21151d.m(iS & 1048575, obj)).floatValue());
                        }
                        break;
                    case 53:
                        if (t(i14, length, obj)) {
                            hVar.j(i14, D(iS & 1048575, obj));
                        }
                        break;
                    case 54:
                        if (t(i14, length, obj)) {
                            hVar.r(i14, D(iS & 1048575, obj));
                        }
                        break;
                    case 55:
                        if (t(i14, length, obj)) {
                            hVar.i(i14, C(iS & 1048575, obj));
                        }
                        break;
                    case 56:
                        if (t(i14, length, obj)) {
                            hVar.f(i14, D(iS & 1048575, obj));
                        }
                        break;
                    case 57:
                        if (t(i14, length, obj)) {
                            hVar.e(i14, C(iS & 1048575, obj));
                        }
                        break;
                    case 58:
                        if (t(i14, length, obj)) {
                            hVar.a(i14, ((Boolean) v0.f21151d.m(iS & 1048575, obj)).booleanValue());
                        }
                        break;
                    case 59:
                        if (t(i14, length, obj)) {
                            V(i14, v0.f21151d.m(iS & 1048575, obj), hVar);
                        }
                        break;
                    case 60:
                        if (t(i14, length, obj)) {
                            hVar.k(i14, o(length), v0.f21151d.m(iS & 1048575, obj));
                        }
                        break;
                    case 61:
                        if (t(i14, length, obj)) {
                            hVar.b(i14, (ByteString) v0.f21151d.m(iS & 1048575, obj));
                        }
                        break;
                    case 62:
                        if (t(i14, length, obj)) {
                            hVar.q(i14, C(iS & 1048575, obj));
                        }
                        break;
                    case 63:
                        if (t(i14, length, obj)) {
                            hVar.d(i14, C(iS & 1048575, obj));
                        }
                        break;
                    case 64:
                        if (t(i14, length, obj)) {
                            hVar.m(i14, C(iS & 1048575, obj));
                        }
                        break;
                    case 65:
                        if (t(i14, length, obj)) {
                            hVar.n(i14, D(iS & 1048575, obj));
                        }
                        break;
                    case 66:
                        if (t(i14, length, obj)) {
                            hVar.o(i14, C(iS & 1048575, obj));
                        }
                        break;
                    case 67:
                        if (t(i14, length, obj)) {
                            hVar.p(i14, D(iS & 1048575, obj));
                        }
                        break;
                    case 68:
                        if (t(i14, length, obj)) {
                            hVar.h(i14, o(length), v0.f21151d.m(iS & 1048575, obj));
                        }
                        break;
                }
            }
            while (entry2 != null) {
                kVar.j(hVar, entry2);
                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            return;
        }
        if (!this.f21026h) {
            T(obj, hVar);
            return;
        }
        if (z12) {
            FieldSet<T> fieldSetC2 = kVar.c(obj);
            if (fieldSetC2.f20914a.isEmpty()) {
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
            int iS2 = S(i15);
            int i16 = iArr[i15];
            while (entry != null && kVar.a(entry) <= i16) {
                kVar.j(hVar, entry);
                entry = itM.hasNext() ? (Map.Entry) itM.next() : null;
            }
            switch (R(iS2)) {
                case 0:
                    z10 = z14;
                    if (s(i15, obj)) {
                        hVar.c(i16, v0.f21151d.h(iS2 & i13, obj));
                    }
                    break;
                case 1:
                    z10 = z14;
                    if (s(i15, obj)) {
                        hVar.g(i16, v0.f21151d.i(iS2 & i13, obj));
                    }
                    break;
                case 2:
                    z10 = z14;
                    if (s(i15, obj)) {
                        hVar.j(i16, v0.f21151d.l(iS2 & i13, obj));
                    }
                    break;
                case 3:
                    z10 = z14;
                    if (s(i15, obj)) {
                        hVar.r(i16, v0.f21151d.l(iS2 & i13, obj));
                    }
                    break;
                case 4:
                    z10 = z14;
                    if (s(i15, obj)) {
                        hVar.i(i16, v0.f21151d.j(iS2 & i13, obj));
                    }
                    break;
                case 5:
                    z10 = z14;
                    if (s(i15, obj)) {
                        hVar.f(i16, v0.f21151d.l(iS2 & i13, obj));
                    }
                    break;
                case 6:
                    z10 = z14;
                    if (s(i15, obj)) {
                        hVar.e(i16, v0.f21151d.j(iS2 & i13, obj));
                    }
                    break;
                case 7:
                    z10 = z14;
                    if (s(i15, obj)) {
                        hVar.a(i16, v0.f21151d.e(iS2 & i13, obj));
                    }
                    break;
                case 8:
                    z10 = z14;
                    if (s(i15, obj)) {
                        i13 = 1048575;
                        V(i16, v0.f21151d.m(iS2 & 1048575, obj), hVar);
                    } else {
                        i13 = 1048575;
                    }
                    break;
                case 9:
                    z10 = z14;
                    if (s(i15, obj)) {
                        hVar.k(i16, o(i15), v0.f21151d.m(iS2 & 1048575, obj));
                    }
                    i13 = 1048575;
                    break;
                case 10:
                    z10 = z14;
                    if (s(i15, obj)) {
                        hVar.b(i16, (ByteString) v0.f21151d.m(iS2 & i13, obj));
                        i13 = 1048575;
                    }
                    break;
                case 11:
                    z10 = z14;
                    if (s(i15, obj)) {
                        hVar.q(i16, v0.f21151d.j(iS2 & i13, obj));
                    }
                    break;
                case 12:
                    z10 = z14;
                    if (s(i15, obj)) {
                        hVar.d(i16, v0.f21151d.j(iS2 & i13, obj));
                    }
                    break;
                case 13:
                    z10 = z14;
                    if (s(i15, obj)) {
                        hVar.m(i16, v0.f21151d.j(iS2 & i13, obj));
                    }
                    break;
                case 14:
                    z10 = z14;
                    if (s(i15, obj)) {
                        hVar.n(i16, v0.f21151d.l(iS2 & i13, obj));
                    }
                    break;
                case 15:
                    z10 = z14;
                    if (s(i15, obj)) {
                        hVar.o(i16, v0.f21151d.j(iS2 & i13, obj));
                    }
                    break;
                case 16:
                    z10 = z14;
                    if (s(i15, obj)) {
                        i13 = 1048575;
                        hVar.p(i16, v0.f21151d.l(iS2 & 1048575, obj));
                    } else {
                        i13 = 1048575;
                    }
                    break;
                case 17:
                    i10 = i13;
                    z10 = z14;
                    if (s(i15, obj)) {
                        hVar.h(i16, o(i15), v0.f21151d.m(iS2 & i10, obj));
                        i13 = 1048575;
                    } else {
                        i13 = i10;
                    }
                    break;
                case 18:
                    i10 = i13;
                    z10 = z14;
                    p0.G(iArr[i15], (List) v0.f21151d.m(iS2 & i10, obj), hVar, z10);
                    i13 = i10;
                    break;
                case 19:
                    i10 = i13;
                    z10 = z14;
                    p0.K(iArr[i15], (List) v0.f21151d.m(iS2 & i10, obj), hVar, z10);
                    i13 = i10;
                    break;
                case 20:
                    i10 = i13;
                    z10 = z14;
                    p0.N(iArr[i15], (List) v0.f21151d.m(iS2 & i10, obj), hVar, z10);
                    i13 = i10;
                    break;
                case 21:
                    i10 = i13;
                    z10 = z14;
                    p0.V(iArr[i15], (List) v0.f21151d.m(iS2 & i10, obj), hVar, z10);
                    i13 = i10;
                    break;
                case 22:
                    i10 = i13;
                    z10 = z14;
                    p0.M(iArr[i15], (List) v0.f21151d.m(iS2 & i10, obj), hVar, z10);
                    i13 = i10;
                    break;
                case 23:
                    i10 = i13;
                    z10 = z14;
                    p0.J(iArr[i15], (List) v0.f21151d.m(iS2 & i10, obj), hVar, z10);
                    i13 = i10;
                    break;
                case 24:
                    i10 = i13;
                    z10 = z14;
                    p0.I(iArr[i15], (List) v0.f21151d.m(iS2 & i10, obj), hVar, z10);
                    i13 = i10;
                    break;
                case 25:
                    i10 = i13;
                    z10 = false;
                    p0.E(iArr[i15], (List) v0.f21151d.m(iS2 & i10, obj), hVar, false);
                    i13 = i10;
                    break;
                case 26:
                    i11 = 1048575;
                    p0.T(iArr[i15], (List) v0.f21151d.m(iS2 & 1048575, obj), hVar);
                    i13 = i11;
                    z10 = false;
                    break;
                case 27:
                    p0.O(iArr[i15], (List) v0.f21151d.m(iS2 & i13, obj), hVar, o(i15));
                    i13 = 1048575;
                    z10 = false;
                    break;
                case 28:
                    i11 = i13;
                    p0.F(iArr[i15], (List) v0.f21151d.m(iS2 & i11, obj), hVar);
                    i13 = i11;
                    z10 = false;
                    break;
                case 29:
                    i12 = i13;
                    z11 = z14;
                    p0.U(iArr[i15], (List) v0.f21151d.m(iS2 & i12, obj), hVar, z11);
                    i13 = i12;
                    z10 = z11;
                    break;
                case 30:
                    i12 = i13;
                    z11 = z14;
                    p0.H(iArr[i15], (List) v0.f21151d.m(iS2 & i12, obj), hVar, z11);
                    i13 = i12;
                    z10 = z11;
                    break;
                case 31:
                    i12 = i13;
                    z11 = z14;
                    p0.P(iArr[i15], (List) v0.f21151d.m(iS2 & i12, obj), hVar, z11);
                    i13 = i12;
                    z10 = z11;
                    break;
                case 32:
                    z11 = z14;
                    i12 = 1048575;
                    p0.Q(iArr[i15], (List) v0.f21151d.m(iS2 & 1048575, obj), hVar, z11);
                    i13 = i12;
                    z10 = z11;
                    break;
                case 33:
                    boolean z16 = z14;
                    p0.R(iArr[i15], (List) v0.f21151d.m(iS2 & i13, obj), hVar, z16);
                    z10 = z16;
                    i13 = 1048575;
                    break;
                case 34:
                    z11 = false;
                    p0.S(iArr[i15], (List) v0.f21151d.m(iS2 & i13, obj), hVar, false);
                    z10 = z11;
                    break;
                case 35:
                    p0.G(iArr[i15], (List) v0.f21151d.m(iS2 & i13, obj), hVar, z13);
                    z10 = false;
                    break;
                case 36:
                    p0.K(iArr[i15], (List) v0.f21151d.m(iS2 & i13, obj), hVar, z13);
                    z10 = false;
                    break;
                case 37:
                    p0.N(iArr[i15], (List) v0.f21151d.m(iS2 & i13, obj), hVar, z13);
                    z10 = false;
                    break;
                case 38:
                    p0.V(iArr[i15], (List) v0.f21151d.m(iS2 & i13, obj), hVar, z13);
                    z10 = false;
                    break;
                case 39:
                    p0.M(iArr[i15], (List) v0.f21151d.m(iS2 & i13, obj), hVar, z13);
                    z10 = false;
                    break;
                case 40:
                    p0.J(iArr[i15], (List) v0.f21151d.m(iS2 & i13, obj), hVar, z13);
                    z10 = false;
                    break;
                case 41:
                    p0.I(iArr[i15], (List) v0.f21151d.m(iS2 & i13, obj), hVar, z13);
                    z10 = false;
                    break;
                case 42:
                    p0.E(iArr[i15], (List) v0.f21151d.m(iS2 & i13, obj), hVar, z13);
                    z10 = false;
                    break;
                case 43:
                    p0.U(iArr[i15], (List) v0.f21151d.m(iS2 & i13, obj), hVar, z13);
                    z10 = false;
                    break;
                case 44:
                    p0.H(iArr[i15], (List) v0.f21151d.m(iS2 & i13, obj), hVar, z13);
                    z10 = false;
                    break;
                case 45:
                    p0.P(iArr[i15], (List) v0.f21151d.m(iS2 & i13, obj), hVar, z13);
                    z10 = false;
                    break;
                case 46:
                    p0.Q(iArr[i15], (List) v0.f21151d.m(iS2 & i13, obj), hVar, z13);
                    z10 = false;
                    break;
                case 47:
                    p0.R(iArr[i15], (List) v0.f21151d.m(iS2 & i13, obj), hVar, z13);
                    z10 = false;
                    break;
                case 48:
                    p0.S(iArr[i15], (List) v0.f21151d.m(iS2 & i13, obj), hVar, z13);
                    z10 = false;
                    break;
                case 49:
                    p0.L(iArr[i15], (List) v0.f21151d.m(iS2 & i13, obj), hVar, o(i15));
                    z10 = false;
                    break;
                case 50:
                    U(hVar, i16, v0.f21151d.m(iS2 & i13, obj), i15);
                    z10 = false;
                    break;
                case 51:
                    if (t(i16, i15, obj)) {
                        hVar.c(i16, ((Double) v0.f21151d.m(iS2 & i13, obj)).doubleValue());
                    }
                    z10 = false;
                    break;
                case 52:
                    if (t(i16, i15, obj)) {
                        hVar.g(i16, ((Float) v0.f21151d.m(iS2 & i13, obj)).floatValue());
                    }
                    z10 = false;
                    break;
                case 53:
                    if (t(i16, i15, obj)) {
                        hVar.j(i16, D(iS2 & i13, obj));
                    }
                    z10 = false;
                    break;
                case 54:
                    if (t(i16, i15, obj)) {
                        hVar.r(i16, D(iS2 & i13, obj));
                    }
                    z10 = false;
                    break;
                case 55:
                    if (t(i16, i15, obj)) {
                        hVar.i(i16, C(iS2 & i13, obj));
                    }
                    z10 = false;
                    break;
                case 56:
                    if (t(i16, i15, obj)) {
                        hVar.f(i16, D(iS2 & i13, obj));
                    }
                    z10 = false;
                    break;
                case 57:
                    if (t(i16, i15, obj)) {
                        hVar.e(i16, C(iS2 & i13, obj));
                    }
                    z10 = false;
                    break;
                case 58:
                    if (t(i16, i15, obj)) {
                        hVar.a(i16, ((Boolean) v0.f21151d.m(iS2 & i13, obj)).booleanValue());
                    }
                    z10 = false;
                    break;
                case 59:
                    if (t(i16, i15, obj)) {
                        V(i16, v0.f21151d.m(iS2 & i13, obj), hVar);
                    }
                    z10 = false;
                    break;
                case 60:
                    if (t(i16, i15, obj)) {
                        hVar.k(i16, o(i15), v0.f21151d.m(iS2 & i13, obj));
                    }
                    z10 = false;
                    break;
                case 61:
                    if (t(i16, i15, obj)) {
                        hVar.b(i16, (ByteString) v0.f21151d.m(iS2 & i13, obj));
                    }
                    z10 = false;
                    break;
                case 62:
                    if (t(i16, i15, obj)) {
                        hVar.q(i16, C(iS2 & i13, obj));
                    }
                    z10 = false;
                    break;
                case 63:
                    if (t(i16, i15, obj)) {
                        hVar.d(i16, C(iS2 & i13, obj));
                    }
                    z10 = false;
                    break;
                case 64:
                    if (t(i16, i15, obj)) {
                        hVar.m(i16, C(iS2 & i13, obj));
                    }
                    z10 = false;
                    break;
                case 65:
                    if (t(i16, i15, obj)) {
                        hVar.n(i16, D(iS2 & i13, obj));
                    }
                    z10 = false;
                    break;
                case 66:
                    if (t(i16, i15, obj)) {
                        hVar.o(i16, C(iS2 & i13, obj));
                    }
                    z10 = false;
                    break;
                case 67:
                    if (t(i16, i15, obj)) {
                        hVar.p(i16, D(iS2 & i13, obj));
                    }
                    z10 = false;
                    break;
                case 68:
                    if (t(i16, i15, obj)) {
                        hVar.h(i16, o(i15), v0.f21151d.m(iS2 & i13, obj));
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
            kVar.j(hVar, entry);
            entry = itM.hasNext() ? (Map.Entry) itM.next() : null;
        }
        t0Var.s(t0Var.g(obj), hVar);
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final void i(T t10, byte[] bArr, int i10, int i11, c.b bVar) throws IOException {
        if (this.f21026h) {
            H(t10, bArr, i10, i11, bVar);
        } else {
            G(t10, bArr, i10, i11, 0, bVar);
        }
    }

    public final boolean j(int i10, Object obj, Object obj2) {
        return s(i10, obj) == s(i10, obj2);
    }

    public final <UT, UB> UB l(Object obj, int i10, UB ub2, t0<UT, UB> t0Var) {
        Internal.EnumVerifier enumVerifierM;
        int i11 = this.f21019a[i10];
        Object objM = v0.f21151d.m(S(i10) & 1048575, obj);
        if (objM == null || (enumVerifierM = m(i10)) == null) {
            return ub2;
        }
        v vVar = this.f21034q;
        MapFieldLite mapFieldLiteC = vVar.c(objM);
        MapEntryLite.b<?, ?> bVarB = vVar.b(n(i10));
        Iterator it = mapFieldLiteC.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!enumVerifierM.isInRange(((Integer) entry.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = (UB) t0Var.m();
                }
                byte[] bArr = new byte[MapEntryLite.a(bVarB, entry.getKey(), entry.getValue())];
                CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(bArr);
                try {
                    MapEntryLite.c(codedOutputStreamNewInstance, bVarB, entry.getKey(), entry.getValue());
                    codedOutputStreamNewInstance.checkNoSpaceLeft();
                    t0Var.d(ub2, i11, new ByteString.h(bArr));
                    it.remove();
                } catch (IOException e5) {
                    throw new RuntimeException(e5);
                }
            }
        }
        return ub2;
    }

    public final Internal.EnumVerifier m(int i10) {
        return (Internal.EnumVerifier) this.f21020b[((i10 / 3) * 2) + 1];
    }

    public final Object n(int i10) {
        return this.f21020b[(i10 / 3) * 2];
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final T newInstance() {
        return (T) this.m.a(this.f21023e);
    }

    public final o0 o(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f21020b;
        o0 o0Var = (o0) objArr[i11];
        if (o0Var != null) {
            return o0Var;
        }
        o0<T> o0VarA = j0.f21070c.a((Class) objArr[i11 + 1]);
        objArr[i11] = o0VarA;
        return o0VarA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0073 A[PHI: r5
      0x0073: PHI (r5v2 int) = 
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
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v1 int)
      (r5v20 int)
      (r5v1 int)
     binds: [B:19:0x005a, B:207:0x04a0, B:204:0x0495, B:198:0x0479, B:195:0x0467, B:192:0x0457, B:189:0x0449, B:186:0x043b, B:183:0x0430, B:180:0x0426, B:177:0x0418, B:174:0x040a, B:171:0x03f6, B:149:0x0312, B:152:0x031a, B:144:0x02f6, B:147:0x02fe, B:139:0x02da, B:142:0x02e2, B:134:0x02be, B:137:0x02c6, B:129:0x02a2, B:132:0x02aa, B:124:0x0286, B:127:0x028e, B:119:0x026a, B:122:0x0272, B:114:0x024e, B:117:0x0256, B:109:0x0232, B:112:0x023a, B:104:0x0216, B:107:0x021e, B:99:0x01fa, B:102:0x0202, B:94:0x01de, B:97:0x01e6, B:89:0x01c2, B:92:0x01ca, B:84:0x01a6, B:87:0x01ae, B:79:0x0172, B:76:0x0166, B:73:0x0156, B:70:0x0146, B:67:0x0136, B:64:0x012a, B:61:0x011d, B:58:0x0110, B:55:0x0101, B:51:0x00f1, B:48:0x00de, B:45:0x00cd, B:42:0x00be, B:39:0x00af, B:36:0x00a3, B:33:0x0098, B:30:0x0089, B:27:0x007a, B:24:0x0072, B:22:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    public final int q(T t10) {
        int i10;
        int i11;
        int iComputeDoubleSize;
        int iComputeBoolSize;
        int iComputeBytesSize;
        int i12 = -1;
        int i13 = 0;
        int iA = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.f21019a;
            if (i13 >= iArr.length) {
                t0<?, ?> t0Var = this.f21032o;
                int iH = t0Var.h(t0Var.g(t10)) + iA;
                return this.f21024f ? iH + this.f21033p.c(t10).i() : iH;
            }
            int iS = S(i13);
            int i15 = iArr[i13];
            int iR = R(iS);
            boolean z10 = this.f21027i;
            Unsafe unsafe = f21018s;
            if (iR <= 17) {
                i10 = iArr[i13 + 2];
                int i16 = i10 & 1048575;
                i11 = 1 << (i10 >>> 20);
                if (i16 != i12) {
                    i14 = unsafe.getInt(t10, i16);
                    i12 = i16;
                }
            } else {
                i10 = (!z10 || iR < FieldType.DOUBLE_LIST_PACKED.id() || iR > FieldType.SINT64_LIST_PACKED.id()) ? 0 : iArr[i13 + 2] & 1048575;
                i11 = 0;
            }
            long j10 = iS & 1048575;
            switch (iR) {
                case 0:
                    if ((i14 & i11) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(i15, 0.0d);
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 1:
                    if ((i14 & i11) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(i15, 0.0f);
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 2:
                    if ((i14 & i11) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(i15, unsafe.getLong(t10, j10));
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 3:
                    if ((i14 & i11) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(i15, unsafe.getLong(t10, j10));
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 4:
                    if ((i14 & i11) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(i15, unsafe.getInt(t10, j10));
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 5:
                    if ((i14 & i11) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(i15, 0L);
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 6:
                    if ((i14 & i11) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(i15, 0);
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 7:
                    if ((i14 & i11) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeBoolSize(i15, true);
                        iA += iComputeBoolSize;
                    }
                    break;
                case 8:
                    if ((i14 & i11) != 0) {
                        Object object = unsafe.getObject(t10, j10);
                        iComputeBytesSize = object instanceof ByteString ? CodedOutputStream.computeBytesSize(i15, (ByteString) object) : CodedOutputStream.computeStringSize(i15, (String) object);
                        iA = iComputeBytesSize + iA;
                    }
                    break;
                case 9:
                    if ((i14 & i11) != 0) {
                        iComputeBoolSize = p0.o(i15, o(i13), unsafe.getObject(t10, j10));
                        iA += iComputeBoolSize;
                    }
                    break;
                case 10:
                    if ((i14 & i11) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeBytesSize(i15, (ByteString) unsafe.getObject(t10, j10));
                        iA += iComputeBoolSize;
                    }
                    break;
                case 11:
                    if ((i14 & i11) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeUInt32Size(i15, unsafe.getInt(t10, j10));
                        iA += iComputeBoolSize;
                    }
                    break;
                case 12:
                    if ((i14 & i11) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeEnumSize(i15, unsafe.getInt(t10, j10));
                        iA += iComputeBoolSize;
                    }
                    break;
                case 13:
                    if ((i14 & i11) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeSFixed32Size(i15, 0);
                        iA += iComputeBoolSize;
                    }
                    break;
                case 14:
                    if ((i14 & i11) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeSFixed64Size(i15, 0L);
                        iA += iComputeBoolSize;
                    }
                    break;
                case 15:
                    if ((i14 & i11) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeSInt32Size(i15, unsafe.getInt(t10, j10));
                        iA += iComputeBoolSize;
                    }
                    break;
                case 16:
                    if ((i14 & i11) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeSInt64Size(i15, unsafe.getLong(t10, j10));
                        iA += iComputeBoolSize;
                    }
                    break;
                case 17:
                    if ((i14 & i11) != 0) {
                        iComputeBoolSize = CodedOutputStream.a(i15, (MessageLite) unsafe.getObject(t10, j10), o(i13));
                        iA += iComputeBoolSize;
                    }
                    break;
                case 18:
                    iComputeBoolSize = p0.h(i15, (List) unsafe.getObject(t10, j10));
                    iA += iComputeBoolSize;
                    break;
                case 19:
                    iComputeBoolSize = p0.f(i15, (List) unsafe.getObject(t10, j10));
                    iA += iComputeBoolSize;
                    break;
                case 20:
                    iComputeBoolSize = p0.m(i15, (List) unsafe.getObject(t10, j10));
                    iA += iComputeBoolSize;
                    break;
                case 21:
                    iComputeBoolSize = p0.x(i15, (List) unsafe.getObject(t10, j10));
                    iA += iComputeBoolSize;
                    break;
                case 22:
                    iComputeBoolSize = p0.k(i15, (List) unsafe.getObject(t10, j10));
                    iA += iComputeBoolSize;
                    break;
                case 23:
                    iComputeBoolSize = p0.h(i15, (List) unsafe.getObject(t10, j10));
                    iA += iComputeBoolSize;
                    break;
                case 24:
                    iComputeBoolSize = p0.f(i15, (List) unsafe.getObject(t10, j10));
                    iA += iComputeBoolSize;
                    break;
                case 25:
                    iComputeBoolSize = p0.a(i15, (List) unsafe.getObject(t10, j10));
                    iA += iComputeBoolSize;
                    break;
                case 26:
                    iComputeBoolSize = p0.u(i15, (List) unsafe.getObject(t10, j10));
                    iA += iComputeBoolSize;
                    break;
                case 27:
                    iComputeBoolSize = p0.p(i15, (List) unsafe.getObject(t10, j10), o(i13));
                    iA += iComputeBoolSize;
                    break;
                case 28:
                    iComputeBoolSize = p0.c(i15, (List) unsafe.getObject(t10, j10));
                    iA += iComputeBoolSize;
                    break;
                case 29:
                    iComputeBoolSize = p0.v(i15, (List) unsafe.getObject(t10, j10));
                    iA += iComputeBoolSize;
                    break;
                case 30:
                    iComputeBoolSize = p0.d(i15, (List) unsafe.getObject(t10, j10));
                    iA += iComputeBoolSize;
                    break;
                case 31:
                    iComputeBoolSize = p0.f(i15, (List) unsafe.getObject(t10, j10));
                    iA += iComputeBoolSize;
                    break;
                case 32:
                    iComputeBoolSize = p0.h(i15, (List) unsafe.getObject(t10, j10));
                    iA += iComputeBoolSize;
                    break;
                case 33:
                    iComputeBoolSize = p0.q(i15, (List) unsafe.getObject(t10, j10));
                    iA += iComputeBoolSize;
                    break;
                case 34:
                    iComputeBoolSize = p0.s(i15, (List) unsafe.getObject(t10, j10));
                    iA += iComputeBoolSize;
                    break;
                case 35:
                    int i17 = p0.i((List) unsafe.getObject(t10, j10));
                    if (i17 > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i10, i17);
                        }
                        iA = androidx.appcompat.widget.g0.a(i17, CodedOutputStream.computeTagSize(i15), i17, iA);
                    }
                    break;
                case 36:
                    int iG = p0.g((List) unsafe.getObject(t10, j10));
                    if (iG > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i10, iG);
                        }
                        iA = androidx.appcompat.widget.g0.a(iG, CodedOutputStream.computeTagSize(i15), iG, iA);
                    }
                    break;
                case 37:
                    int iN = p0.n((List) unsafe.getObject(t10, j10));
                    if (iN > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i10, iN);
                        }
                        iA = androidx.appcompat.widget.g0.a(iN, CodedOutputStream.computeTagSize(i15), iN, iA);
                    }
                    break;
                case 38:
                    int iY = p0.y((List) unsafe.getObject(t10, j10));
                    if (iY > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i10, iY);
                        }
                        iA = androidx.appcompat.widget.g0.a(iY, CodedOutputStream.computeTagSize(i15), iY, iA);
                    }
                    break;
                case 39:
                    int iL = p0.l((List) unsafe.getObject(t10, j10));
                    if (iL > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i10, iL);
                        }
                        iA = androidx.appcompat.widget.g0.a(iL, CodedOutputStream.computeTagSize(i15), iL, iA);
                    }
                    break;
                case 40:
                    int i18 = p0.i((List) unsafe.getObject(t10, j10));
                    if (i18 > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i10, i18);
                        }
                        iA = androidx.appcompat.widget.g0.a(i18, CodedOutputStream.computeTagSize(i15), i18, iA);
                    }
                    break;
                case 41:
                    int iG2 = p0.g((List) unsafe.getObject(t10, j10));
                    if (iG2 > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i10, iG2);
                        }
                        iA = androidx.appcompat.widget.g0.a(iG2, CodedOutputStream.computeTagSize(i15), iG2, iA);
                    }
                    break;
                case 42:
                    int iB = p0.b((List) unsafe.getObject(t10, j10));
                    if (iB > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i10, iB);
                        }
                        iA = androidx.appcompat.widget.g0.a(iB, CodedOutputStream.computeTagSize(i15), iB, iA);
                    }
                    break;
                case 43:
                    int iW = p0.w((List) unsafe.getObject(t10, j10));
                    if (iW > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i10, iW);
                        }
                        iA = androidx.appcompat.widget.g0.a(iW, CodedOutputStream.computeTagSize(i15), iW, iA);
                    }
                    break;
                case 44:
                    int iE = p0.e((List) unsafe.getObject(t10, j10));
                    if (iE > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i10, iE);
                        }
                        iA = androidx.appcompat.widget.g0.a(iE, CodedOutputStream.computeTagSize(i15), iE, iA);
                    }
                    break;
                case 45:
                    int iG3 = p0.g((List) unsafe.getObject(t10, j10));
                    if (iG3 > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i10, iG3);
                        }
                        iA = androidx.appcompat.widget.g0.a(iG3, CodedOutputStream.computeTagSize(i15), iG3, iA);
                    }
                    break;
                case 46:
                    int i19 = p0.i((List) unsafe.getObject(t10, j10));
                    if (i19 > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i10, i19);
                        }
                        iA = androidx.appcompat.widget.g0.a(i19, CodedOutputStream.computeTagSize(i15), i19, iA);
                    }
                    break;
                case 47:
                    int iR2 = p0.r((List) unsafe.getObject(t10, j10));
                    if (iR2 > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i10, iR2);
                        }
                        iA = androidx.appcompat.widget.g0.a(iR2, CodedOutputStream.computeTagSize(i15), iR2, iA);
                    }
                    break;
                case 48:
                    int iT = p0.t((List) unsafe.getObject(t10, j10));
                    if (iT > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i10, iT);
                        }
                        iA = androidx.appcompat.widget.g0.a(iT, CodedOutputStream.computeTagSize(i15), iT, iA);
                    }
                    break;
                case 49:
                    iComputeBoolSize = p0.j(i15, (List) unsafe.getObject(t10, j10), o(i13));
                    iA += iComputeBoolSize;
                    break;
                case 50:
                    iComputeBoolSize = this.f21034q.g(i15, unsafe.getObject(t10, j10), n(i13));
                    iA += iComputeBoolSize;
                    break;
                case 51:
                    if (t(i15, i13, t10)) {
                        iComputeBoolSize = CodedOutputStream.computeDoubleSize(i15, 0.0d);
                        iA += iComputeBoolSize;
                    }
                    break;
                case 52:
                    if (t(i15, i13, t10)) {
                        iComputeBoolSize = CodedOutputStream.computeFloatSize(i15, 0.0f);
                        iA += iComputeBoolSize;
                    }
                    break;
                case 53:
                    if (t(i15, i13, t10)) {
                        iComputeBoolSize = CodedOutputStream.computeInt64Size(i15, D(j10, t10));
                        iA += iComputeBoolSize;
                    }
                    break;
                case 54:
                    if (t(i15, i13, t10)) {
                        iComputeBoolSize = CodedOutputStream.computeUInt64Size(i15, D(j10, t10));
                        iA += iComputeBoolSize;
                    }
                    break;
                case 55:
                    if (t(i15, i13, t10)) {
                        iComputeBoolSize = CodedOutputStream.computeInt32Size(i15, C(j10, t10));
                        iA += iComputeBoolSize;
                    }
                    break;
                case 56:
                    if (t(i15, i13, t10)) {
                        iComputeBoolSize = CodedOutputStream.computeFixed64Size(i15, 0L);
                        iA += iComputeBoolSize;
                    }
                    break;
                case 57:
                    if (t(i15, i13, t10)) {
                        iComputeBoolSize = CodedOutputStream.computeFixed32Size(i15, 0);
                        iA += iComputeBoolSize;
                    }
                    break;
                case 58:
                    if (t(i15, i13, t10)) {
                        iComputeBoolSize = CodedOutputStream.computeBoolSize(i15, true);
                        iA += iComputeBoolSize;
                    }
                    break;
                case 59:
                    if (t(i15, i13, t10)) {
                        Object object2 = unsafe.getObject(t10, j10);
                        iComputeBytesSize = object2 instanceof ByteString ? CodedOutputStream.computeBytesSize(i15, (ByteString) object2) : CodedOutputStream.computeStringSize(i15, (String) object2);
                        iA = iComputeBytesSize + iA;
                    }
                    break;
                case 60:
                    if (t(i15, i13, t10)) {
                        iComputeBoolSize = p0.o(i15, o(i13), unsafe.getObject(t10, j10));
                        iA += iComputeBoolSize;
                    }
                    break;
                case 61:
                    if (t(i15, i13, t10)) {
                        iComputeBoolSize = CodedOutputStream.computeBytesSize(i15, (ByteString) unsafe.getObject(t10, j10));
                        iA += iComputeBoolSize;
                    }
                    break;
                case 62:
                    if (t(i15, i13, t10)) {
                        iComputeBoolSize = CodedOutputStream.computeUInt32Size(i15, C(j10, t10));
                        iA += iComputeBoolSize;
                    }
                    break;
                case 63:
                    if (t(i15, i13, t10)) {
                        iComputeBoolSize = CodedOutputStream.computeEnumSize(i15, C(j10, t10));
                        iA += iComputeBoolSize;
                    }
                    break;
                case 64:
                    if (t(i15, i13, t10)) {
                        iComputeBoolSize = CodedOutputStream.computeSFixed32Size(i15, 0);
                        iA += iComputeBoolSize;
                    }
                    break;
                case 65:
                    if (t(i15, i13, t10)) {
                        iComputeBoolSize = CodedOutputStream.computeSFixed64Size(i15, 0L);
                        iA += iComputeBoolSize;
                    }
                    break;
                case 66:
                    if (t(i15, i13, t10)) {
                        iComputeBoolSize = CodedOutputStream.computeSInt32Size(i15, C(j10, t10));
                        iA += iComputeBoolSize;
                    }
                    break;
                case 67:
                    if (t(i15, i13, t10)) {
                        iComputeBoolSize = CodedOutputStream.computeSInt64Size(i15, D(j10, t10));
                        iA += iComputeBoolSize;
                    }
                    break;
                case 68:
                    if (t(i15, i13, t10)) {
                        iComputeBoolSize = CodedOutputStream.a(i15, (MessageLite) unsafe.getObject(t10, j10), o(i13));
                        iA += iComputeBoolSize;
                    }
                    break;
                default:
                    break;
            }
            i13 += 3;
        }
    }

    public final int r(T t10) {
        int iComputeDoubleSize;
        int iComputeBytesSize;
        int i10 = 0;
        int iA = 0;
        while (true) {
            int[] iArr = this.f21019a;
            if (i10 >= iArr.length) {
                t0<?, ?> t0Var = this.f21032o;
                return t0Var.h(t0Var.g(t10)) + iA;
            }
            int iS = S(i10);
            int iR = R(iS);
            int i11 = iArr[i10];
            long j10 = iS & 1048575;
            int i12 = (iR < FieldType.DOUBLE_LIST_PACKED.id() || iR > FieldType.SINT64_LIST_PACKED.id()) ? 0 : iArr[i10 + 2] & 1048575;
            boolean z10 = this.f21027i;
            Unsafe unsafe = f21018s;
            switch (iR) {
                case 0:
                    if (s(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(i11, 0.0d);
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 1:
                    if (s(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(i11, 0.0f);
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 2:
                    if (s(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(i11, v0.l(j10, t10));
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 3:
                    if (s(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(i11, v0.l(j10, t10));
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 4:
                    if (s(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(i11, v0.k(j10, t10));
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 5:
                    if (s(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(i11, 0L);
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 6:
                    if (s(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(i11, 0);
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 7:
                    if (s(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeBoolSize(i11, true);
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 8:
                    if (s(i10, t10)) {
                        Object objM = v0.m(j10, t10);
                        iComputeBytesSize = objM instanceof ByteString ? CodedOutputStream.computeBytesSize(i11, (ByteString) objM) : CodedOutputStream.computeStringSize(i11, (String) objM);
                        iA = iComputeBytesSize + iA;
                    }
                    break;
                case 9:
                    if (s(i10, t10)) {
                        iComputeDoubleSize = p0.o(i11, o(i10), v0.m(j10, t10));
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 10:
                    if (s(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeBytesSize(i11, (ByteString) v0.m(j10, t10));
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 11:
                    if (s(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt32Size(i11, v0.k(j10, t10));
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 12:
                    if (s(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeEnumSize(i11, v0.k(j10, t10));
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 13:
                    if (s(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed32Size(i11, 0);
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 14:
                    if (s(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed64Size(i11, 0L);
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 15:
                    if (s(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt32Size(i11, v0.k(j10, t10));
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 16:
                    if (s(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt64Size(i11, v0.l(j10, t10));
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 17:
                    if (s(i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.a(i11, (MessageLite) v0.m(j10, t10), o(i10));
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 18:
                    iComputeDoubleSize = p0.h(i11, u(j10, t10));
                    iA += iComputeDoubleSize;
                    break;
                case 19:
                    iComputeDoubleSize = p0.f(i11, u(j10, t10));
                    iA += iComputeDoubleSize;
                    break;
                case 20:
                    iComputeDoubleSize = p0.m(i11, u(j10, t10));
                    iA += iComputeDoubleSize;
                    break;
                case 21:
                    iComputeDoubleSize = p0.x(i11, u(j10, t10));
                    iA += iComputeDoubleSize;
                    break;
                case 22:
                    iComputeDoubleSize = p0.k(i11, u(j10, t10));
                    iA += iComputeDoubleSize;
                    break;
                case 23:
                    iComputeDoubleSize = p0.h(i11, u(j10, t10));
                    iA += iComputeDoubleSize;
                    break;
                case 24:
                    iComputeDoubleSize = p0.f(i11, u(j10, t10));
                    iA += iComputeDoubleSize;
                    break;
                case 25:
                    iComputeDoubleSize = p0.a(i11, u(j10, t10));
                    iA += iComputeDoubleSize;
                    break;
                case 26:
                    iComputeDoubleSize = p0.u(i11, u(j10, t10));
                    iA += iComputeDoubleSize;
                    break;
                case 27:
                    iComputeDoubleSize = p0.p(i11, u(j10, t10), o(i10));
                    iA += iComputeDoubleSize;
                    break;
                case 28:
                    iComputeDoubleSize = p0.c(i11, u(j10, t10));
                    iA += iComputeDoubleSize;
                    break;
                case 29:
                    iComputeDoubleSize = p0.v(i11, u(j10, t10));
                    iA += iComputeDoubleSize;
                    break;
                case 30:
                    iComputeDoubleSize = p0.d(i11, u(j10, t10));
                    iA += iComputeDoubleSize;
                    break;
                case 31:
                    iComputeDoubleSize = p0.f(i11, u(j10, t10));
                    iA += iComputeDoubleSize;
                    break;
                case 32:
                    iComputeDoubleSize = p0.h(i11, u(j10, t10));
                    iA += iComputeDoubleSize;
                    break;
                case 33:
                    iComputeDoubleSize = p0.q(i11, u(j10, t10));
                    iA += iComputeDoubleSize;
                    break;
                case 34:
                    iComputeDoubleSize = p0.s(i11, u(j10, t10));
                    iA += iComputeDoubleSize;
                    break;
                case 35:
                    int i13 = p0.i((List) unsafe.getObject(t10, j10));
                    if (i13 > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i12, i13);
                        }
                        iA = androidx.appcompat.widget.g0.a(i13, CodedOutputStream.computeTagSize(i11), i13, iA);
                    }
                    break;
                case 36:
                    int iG = p0.g((List) unsafe.getObject(t10, j10));
                    if (iG > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i12, iG);
                        }
                        iA = androidx.appcompat.widget.g0.a(iG, CodedOutputStream.computeTagSize(i11), iG, iA);
                    }
                    break;
                case 37:
                    int iN = p0.n((List) unsafe.getObject(t10, j10));
                    if (iN > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i12, iN);
                        }
                        iA = androidx.appcompat.widget.g0.a(iN, CodedOutputStream.computeTagSize(i11), iN, iA);
                    }
                    break;
                case 38:
                    int iY = p0.y((List) unsafe.getObject(t10, j10));
                    if (iY > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i12, iY);
                        }
                        iA = androidx.appcompat.widget.g0.a(iY, CodedOutputStream.computeTagSize(i11), iY, iA);
                    }
                    break;
                case 39:
                    int iL = p0.l((List) unsafe.getObject(t10, j10));
                    if (iL > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i12, iL);
                        }
                        iA = androidx.appcompat.widget.g0.a(iL, CodedOutputStream.computeTagSize(i11), iL, iA);
                    }
                    break;
                case 40:
                    int i14 = p0.i((List) unsafe.getObject(t10, j10));
                    if (i14 > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i12, i14);
                        }
                        iA = androidx.appcompat.widget.g0.a(i14, CodedOutputStream.computeTagSize(i11), i14, iA);
                    }
                    break;
                case 41:
                    int iG2 = p0.g((List) unsafe.getObject(t10, j10));
                    if (iG2 > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i12, iG2);
                        }
                        iA = androidx.appcompat.widget.g0.a(iG2, CodedOutputStream.computeTagSize(i11), iG2, iA);
                    }
                    break;
                case 42:
                    int iB = p0.b((List) unsafe.getObject(t10, j10));
                    if (iB > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i12, iB);
                        }
                        iA = androidx.appcompat.widget.g0.a(iB, CodedOutputStream.computeTagSize(i11), iB, iA);
                    }
                    break;
                case 43:
                    int iW = p0.w((List) unsafe.getObject(t10, j10));
                    if (iW > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i12, iW);
                        }
                        iA = androidx.appcompat.widget.g0.a(iW, CodedOutputStream.computeTagSize(i11), iW, iA);
                    }
                    break;
                case 44:
                    int iE = p0.e((List) unsafe.getObject(t10, j10));
                    if (iE > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i12, iE);
                        }
                        iA = androidx.appcompat.widget.g0.a(iE, CodedOutputStream.computeTagSize(i11), iE, iA);
                    }
                    break;
                case 45:
                    int iG3 = p0.g((List) unsafe.getObject(t10, j10));
                    if (iG3 > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i12, iG3);
                        }
                        iA = androidx.appcompat.widget.g0.a(iG3, CodedOutputStream.computeTagSize(i11), iG3, iA);
                    }
                    break;
                case 46:
                    int i15 = p0.i((List) unsafe.getObject(t10, j10));
                    if (i15 > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i12, i15);
                        }
                        iA = androidx.appcompat.widget.g0.a(i15, CodedOutputStream.computeTagSize(i11), i15, iA);
                    }
                    break;
                case 47:
                    int iR2 = p0.r((List) unsafe.getObject(t10, j10));
                    if (iR2 > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i12, iR2);
                        }
                        iA = androidx.appcompat.widget.g0.a(iR2, CodedOutputStream.computeTagSize(i11), iR2, iA);
                    }
                    break;
                case 48:
                    int iT = p0.t((List) unsafe.getObject(t10, j10));
                    if (iT > 0) {
                        if (z10) {
                            unsafe.putInt(t10, i12, iT);
                        }
                        iA = androidx.appcompat.widget.g0.a(iT, CodedOutputStream.computeTagSize(i11), iT, iA);
                    }
                    break;
                case 49:
                    iComputeDoubleSize = p0.j(i11, u(j10, t10), o(i10));
                    iA += iComputeDoubleSize;
                    break;
                case 50:
                    iComputeDoubleSize = this.f21034q.g(i11, v0.m(j10, t10), n(i10));
                    iA += iComputeDoubleSize;
                    break;
                case 51:
                    if (t(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(i11, 0.0d);
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 52:
                    if (t(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(i11, 0.0f);
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 53:
                    if (t(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(i11, D(j10, t10));
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 54:
                    if (t(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(i11, D(j10, t10));
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 55:
                    if (t(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(i11, C(j10, t10));
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 56:
                    if (t(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(i11, 0L);
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 57:
                    if (t(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(i11, 0);
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 58:
                    if (t(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeBoolSize(i11, true);
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 59:
                    if (t(i11, i10, t10)) {
                        Object objM2 = v0.m(j10, t10);
                        iComputeBytesSize = objM2 instanceof ByteString ? CodedOutputStream.computeBytesSize(i11, (ByteString) objM2) : CodedOutputStream.computeStringSize(i11, (String) objM2);
                        iA = iComputeBytesSize + iA;
                    }
                    break;
                case 60:
                    if (t(i11, i10, t10)) {
                        iComputeDoubleSize = p0.o(i11, o(i10), v0.m(j10, t10));
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 61:
                    if (t(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeBytesSize(i11, (ByteString) v0.m(j10, t10));
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 62:
                    if (t(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt32Size(i11, C(j10, t10));
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 63:
                    if (t(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeEnumSize(i11, C(j10, t10));
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 64:
                    if (t(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed32Size(i11, 0);
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 65:
                    if (t(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed64Size(i11, 0L);
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 66:
                    if (t(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt32Size(i11, C(j10, t10));
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 67:
                    if (t(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt64Size(i11, D(j10, t10));
                        iA += iComputeDoubleSize;
                    }
                    break;
                case 68:
                    if (t(i11, i10, t10)) {
                        iComputeDoubleSize = CodedOutputStream.a(i11, (MessageLite) v0.m(j10, t10), o(i10));
                        iA += iComputeDoubleSize;
                    }
                    break;
            }
            i10 += 3;
        }
    }

    public final boolean s(int i10, Object obj) {
        if (!this.f21026h) {
            int i11 = this.f21019a[i10 + 2];
            return (v0.f21151d.j((long) (i11 & 1048575), obj) & (1 << (i11 >>> 20))) != 0;
        }
        int iS = S(i10);
        long j10 = iS & 1048575;
        switch (R(iS)) {
            case 0:
                return v0.f21151d.h(j10, obj) != 0.0d;
            case 1:
                return v0.f21151d.i(j10, obj) != 0.0f;
            case 2:
                return v0.f21151d.l(j10, obj) != 0;
            case 3:
                return v0.f21151d.l(j10, obj) != 0;
            case 4:
                return v0.f21151d.j(j10, obj) != 0;
            case 5:
                return v0.f21151d.l(j10, obj) != 0;
            case 6:
                return v0.f21151d.j(j10, obj) != 0;
            case 7:
                return v0.f21151d.e(j10, obj);
            case 8:
                Object objM = v0.f21151d.m(j10, obj);
                if (objM instanceof String) {
                    return !((String) objM).isEmpty();
                }
                if (objM instanceof ByteString) {
                    return !ByteString.EMPTY.equals(objM);
                }
                throw new IllegalArgumentException();
            case 9:
                return v0.f21151d.m(j10, obj) != null;
            case 10:
                return !ByteString.EMPTY.equals(v0.f21151d.m(j10, obj));
            case 11:
                return v0.f21151d.j(j10, obj) != 0;
            case 12:
                return v0.f21151d.j(j10, obj) != 0;
            case 13:
                return v0.f21151d.j(j10, obj) != 0;
            case 14:
                return v0.f21151d.l(j10, obj) != 0;
            case 15:
                return v0.f21151d.j(j10, obj) != 0;
            case 16:
                return v0.f21151d.l(j10, obj) != 0;
            case 17:
                return v0.f21151d.m(j10, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean t(int i10, int i11, Object obj) {
        return v0.f21151d.j((long) (this.f21019a[i11 + 2] & 1048575), obj) == i10;
    }

    /* JADX WARN: Code duplicated, block: B:172:0x05be A[LOOP:4: B:171:0x05bc->B:172:0x05be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:174:0x05c9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> void v(t0<UT, UB> t0Var, k<ET> kVar, T t10, m0 m0Var, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        int[] iArr = this.f21028j;
        int i10 = this.f21030l;
        int i11 = this.f21029k;
        Object objL = null;
        Object objD = null;
        while (true) {
            try {
                int iF = m0Var.F();
                try {
                    int iQ = (iF < this.f21021c || iF > this.f21022d) ? -1 : Q(iF, 0);
                    if (iQ < 0) {
                        if (iF == Integer.MAX_VALUE) {
                            while (i11 < i10) {
                                objL = l(t10, iArr[i11], objL, t0Var);
                                i11++;
                            }
                            if (objL != null) {
                                t0Var.n(t10, objL);
                                return;
                            }
                            return;
                        }
                        GeneratedMessageLite.GeneratedExtension generatedExtensionB = !this.f21024f ? null : kVar.b(extensionRegistryLite, this.f21023e, iF);
                        if (generatedExtensionB != null) {
                            if (objD == null) {
                                try {
                                    objD = kVar.d(t10);
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            try {
                                objL = kVar.g(m0Var, generatedExtensionB, extensionRegistryLite, objD, objL, t0Var);
                            } catch (Throwable th3) {
                                th = th3;
                                objL = objL;
                                while (i11 < i10) {
                                    objL = l(t10, iArr[i11], objL, t0Var);
                                    i11++;
                                }
                                if (objL != null) {
                                    t0Var.n(t10, objL);
                                }
                                throw th;
                            }
                        } else {
                            Object obj = objL;
                            t0Var.p();
                            objL = obj == null ? t0Var.f(t10) : obj;
                            if (!t0Var.l(objL, m0Var)) {
                                while (i11 < i10) {
                                    objL = l(t10, iArr[i11], objL, t0Var);
                                    i11++;
                                }
                                if (objL != null) {
                                    t0Var.n(t10, objL);
                                    return;
                                }
                                return;
                            }
                        }
                        while (i11 < i10) {
                            objL = l(t10, iArr[i11], objL, t0Var);
                            i11++;
                        }
                        if (objL != null) {
                            t0Var.n(t10, objL);
                        }
                        throw th;
                    }
                    Object obj2 = objL;
                    int iS = S(iQ);
                    try {
                        int iR = R(iS);
                        s sVar = this.f21031n;
                        switch (iR) {
                            case 0:
                                v0.t(t10, B(iS), m0Var.readDouble());
                                O(iQ, t10);
                                objL = obj2;
                                break;
                            case 1:
                                v0.u(t10, B(iS), m0Var.readFloat());
                                O(iQ, t10);
                                objL = obj2;
                                break;
                            case 2:
                                v0.w(t10, B(iS), m0Var.N());
                                O(iQ, t10);
                                objL = obj2;
                                break;
                            case 3:
                                v0.w(t10, B(iS), m0Var.u());
                                O(iQ, t10);
                                objL = obj2;
                                break;
                            case 4:
                                v0.v(m0Var.p(), B(iS), t10);
                                O(iQ, t10);
                                objL = obj2;
                                break;
                            case 5:
                                v0.w(t10, B(iS), m0Var.b());
                                O(iQ, t10);
                                objL = obj2;
                                break;
                            case 6:
                                v0.v(m0Var.x(), B(iS), t10);
                                O(iQ, t10);
                                objL = obj2;
                                break;
                            case 7:
                                v0.o(t10, B(iS), m0Var.e());
                                O(iQ, t10);
                                objL = obj2;
                                break;
                            case 8:
                                L(t10, iS, m0Var);
                                O(iQ, t10);
                                objL = obj2;
                                break;
                            case 9:
                                if (s(iQ, t10)) {
                                    v0.x(B(iS), t10, Internal.a(v0.m(B(iS), t10), m0Var.a(o(iQ), extensionRegistryLite)));
                                } else {
                                    v0.x(B(iS), t10, m0Var.a(o(iQ), extensionRegistryLite));
                                    O(iQ, t10);
                                }
                                objL = obj2;
                                break;
                            case 10:
                                v0.x(B(iS), t10, m0Var.o());
                                O(iQ, t10);
                                objL = obj2;
                                break;
                            case 11:
                                v0.v(m0Var.h(), B(iS), t10);
                                O(iQ, t10);
                                objL = obj2;
                                break;
                            case 12:
                                int iK = m0Var.k();
                                Internal.EnumVerifier enumVerifierM = m(iQ);
                                if (enumVerifierM == null || enumVerifierM.isInRange(iK)) {
                                    v0.v(iK, B(iS), t10);
                                    O(iQ, t10);
                                    objL = obj2;
                                } else {
                                    objL = p0.D(iF, iK, obj2, t0Var);
                                }
                                break;
                            case 13:
                                v0.v(m0Var.K(), B(iS), t10);
                                O(iQ, t10);
                                objL = obj2;
                                break;
                            case 14:
                                v0.w(t10, B(iS), m0Var.f());
                                O(iQ, t10);
                                objL = obj2;
                                break;
                            case 15:
                                v0.v(m0Var.l(), B(iS), t10);
                                O(iQ, t10);
                                objL = obj2;
                                break;
                            case 16:
                                v0.w(t10, B(iS), m0Var.D());
                                O(iQ, t10);
                                objL = obj2;
                                break;
                            case 17:
                                if (s(iQ, t10)) {
                                    v0.x(B(iS), t10, Internal.a(v0.m(B(iS), t10), m0Var.s(o(iQ), extensionRegistryLite)));
                                } else {
                                    v0.x(B(iS), t10, m0Var.s(o(iQ), extensionRegistryLite));
                                    O(iQ, t10);
                                }
                                objL = obj2;
                                break;
                            case 18:
                                m0Var.M(sVar.c(B(iS), t10));
                                objL = obj2;
                                break;
                            case 19:
                                m0Var.H(sVar.c(B(iS), t10));
                                objL = obj2;
                                break;
                            case 20:
                                m0Var.i(sVar.c(B(iS), t10));
                                objL = obj2;
                                break;
                            case 21:
                                m0Var.g(sVar.c(B(iS), t10));
                                objL = obj2;
                                break;
                            case 22:
                                m0Var.A(sVar.c(B(iS), t10));
                                objL = obj2;
                                break;
                            case 23:
                                m0Var.r(sVar.c(B(iS), t10));
                                objL = obj2;
                                break;
                            case 24:
                                m0Var.C(sVar.c(B(iS), t10));
                                objL = obj2;
                                break;
                            case 25:
                                m0Var.m(sVar.c(B(iS), t10));
                                objL = obj2;
                                break;
                            case 26:
                                M(t10, iS, m0Var);
                                objL = obj2;
                                break;
                            case 27:
                                K(t10, iS, m0Var, o(iQ), extensionRegistryLite);
                                objL = obj2;
                                break;
                            case 28:
                                m0Var.L(sVar.c(B(iS), t10));
                                objL = obj2;
                                break;
                            case 29:
                                m0Var.w(sVar.c(B(iS), t10));
                                objL = obj2;
                                break;
                            case 30:
                                List listC = sVar.c(B(iS), t10);
                                m0Var.j(listC);
                                objL = p0.A(iF, listC, m(iQ), obj2, t0Var);
                                break;
                            case 31:
                                m0Var.c(sVar.c(B(iS), t10));
                                objL = obj2;
                                break;
                            case 32:
                                m0Var.z(sVar.c(B(iS), t10));
                                objL = obj2;
                                break;
                            case 33:
                                m0Var.t(sVar.c(B(iS), t10));
                                objL = obj2;
                                break;
                            case 34:
                                m0Var.d(sVar.c(B(iS), t10));
                                objL = obj2;
                                break;
                            case 35:
                                m0Var.M(sVar.c(B(iS), t10));
                                objL = obj2;
                                break;
                            case 36:
                                m0Var.H(sVar.c(B(iS), t10));
                                objL = obj2;
                                break;
                            case 37:
                                m0Var.i(sVar.c(B(iS), t10));
                                objL = obj2;
                                break;
                            case 38:
                                m0Var.g(sVar.c(B(iS), t10));
                                objL = obj2;
                                break;
                            case 39:
                                m0Var.A(sVar.c(B(iS), t10));
                                objL = obj2;
                                break;
                            case 40:
                                m0Var.r(sVar.c(B(iS), t10));
                                objL = obj2;
                                break;
                            case 41:
                                m0Var.C(sVar.c(B(iS), t10));
                                objL = obj2;
                                break;
                            case 42:
                                m0Var.m(sVar.c(B(iS), t10));
                                objL = obj2;
                                break;
                            case 43:
                                m0Var.w(sVar.c(B(iS), t10));
                                objL = obj2;
                                break;
                            case 44:
                                List listC2 = sVar.c(B(iS), t10);
                                m0Var.j(listC2);
                                objL = p0.A(iF, listC2, m(iQ), obj2, t0Var);
                                break;
                            case 45:
                                m0Var.c(sVar.c(B(iS), t10));
                                objL = obj2;
                                break;
                            case 46:
                                m0Var.z(sVar.c(B(iS), t10));
                                objL = obj2;
                                break;
                            case 47:
                                m0Var.t(sVar.c(B(iS), t10));
                                objL = obj2;
                                break;
                            case 48:
                                m0Var.d(sVar.c(B(iS), t10));
                                objL = obj2;
                                break;
                            case 49:
                                J(t10, B(iS), m0Var, o(iQ), extensionRegistryLite);
                                objL = obj2;
                                break;
                            case 50:
                                w(t10, iQ, n(iQ), extensionRegistryLite, m0Var);
                                objL = obj2;
                                break;
                            case 51:
                                v0.x(B(iS), t10, Double.valueOf(m0Var.readDouble()));
                                P(iF, iQ, t10);
                                objL = obj2;
                                break;
                            case 52:
                                v0.x(B(iS), t10, Float.valueOf(m0Var.readFloat()));
                                P(iF, iQ, t10);
                                objL = obj2;
                                break;
                            case 53:
                                v0.x(B(iS), t10, Long.valueOf(m0Var.N()));
                                P(iF, iQ, t10);
                                objL = obj2;
                                break;
                            case 54:
                                v0.x(B(iS), t10, Long.valueOf(m0Var.u()));
                                P(iF, iQ, t10);
                                objL = obj2;
                                break;
                            case 55:
                                v0.x(B(iS), t10, Integer.valueOf(m0Var.p()));
                                P(iF, iQ, t10);
                                objL = obj2;
                                break;
                            case 56:
                                v0.x(B(iS), t10, Long.valueOf(m0Var.b()));
                                P(iF, iQ, t10);
                                objL = obj2;
                                break;
                            case 57:
                                v0.x(B(iS), t10, Integer.valueOf(m0Var.x()));
                                P(iF, iQ, t10);
                                objL = obj2;
                                break;
                            case 58:
                                v0.x(B(iS), t10, Boolean.valueOf(m0Var.e()));
                                P(iF, iQ, t10);
                                objL = obj2;
                                break;
                            case 59:
                                L(t10, iS, m0Var);
                                P(iF, iQ, t10);
                                objL = obj2;
                                break;
                            case 60:
                                if (t(iF, iQ, t10)) {
                                    v0.x(B(iS), t10, Internal.a(v0.m(B(iS), t10), m0Var.a(o(iQ), extensionRegistryLite)));
                                } else {
                                    v0.x(B(iS), t10, m0Var.a(o(iQ), extensionRegistryLite));
                                    O(iQ, t10);
                                }
                                P(iF, iQ, t10);
                                objL = obj2;
                                break;
                            case 61:
                                v0.x(B(iS), t10, m0Var.o());
                                P(iF, iQ, t10);
                                objL = obj2;
                                break;
                            case 62:
                                v0.x(B(iS), t10, Integer.valueOf(m0Var.h()));
                                P(iF, iQ, t10);
                                objL = obj2;
                                break;
                            case 63:
                                int iK2 = m0Var.k();
                                Internal.EnumVerifier enumVerifierM2 = m(iQ);
                                if (enumVerifierM2 == null || enumVerifierM2.isInRange(iK2)) {
                                    v0.x(B(iS), t10, Integer.valueOf(iK2));
                                    P(iF, iQ, t10);
                                    objL = obj2;
                                } else {
                                    objL = p0.D(iF, iK2, obj2, t0Var);
                                }
                                break;
                            case 64:
                                v0.x(B(iS), t10, Integer.valueOf(m0Var.K()));
                                P(iF, iQ, t10);
                                objL = obj2;
                                break;
                            case 65:
                                v0.x(B(iS), t10, Long.valueOf(m0Var.f()));
                                P(iF, iQ, t10);
                                objL = obj2;
                                break;
                            case 66:
                                v0.x(B(iS), t10, Integer.valueOf(m0Var.l()));
                                P(iF, iQ, t10);
                                objL = obj2;
                                break;
                            case 67:
                                v0.x(B(iS), t10, Long.valueOf(m0Var.D()));
                                P(iF, iQ, t10);
                                objL = obj2;
                                break;
                            case 68:
                                v0.x(B(iS), t10, m0Var.s(o(iQ), extensionRegistryLite));
                                P(iF, iQ, t10);
                                objL = obj2;
                                break;
                            default:
                                objL = obj2 == null ? t0Var.m() : obj2;
                                try {
                                    if (!t0Var.l(objL, m0Var)) {
                                        while (i11 < i10) {
                                            objL = l(t10, iArr[i11], objL, t0Var);
                                            i11++;
                                        }
                                        if (objL != null) {
                                            t0Var.n(t10, objL);
                                            return;
                                        }
                                        return;
                                    }
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                    t0Var.p();
                                    if (objL == null) {
                                        objL = t0Var.f(t10);
                                    }
                                    if (!t0Var.l(objL, m0Var)) {
                                        while (i11 < i10) {
                                            objL = l(t10, iArr[i11], objL, t0Var);
                                            i11++;
                                        }
                                        if (objL != null) {
                                            t0Var.n(t10, objL);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                break;
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                        objL = obj2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final <K, V> void w(Object obj, int i10, Object obj2, ExtensionRegistryLite extensionRegistryLite, m0 m0Var) throws IOException {
        long jS = S(i10) & 1048575;
        Object objM = v0.f21151d.m(jS, obj);
        v vVar = this.f21034q;
        if (objM == null) {
            objM = vVar.f();
            v0.x(jS, obj, objM);
        } else if (vVar.h(objM)) {
            MapFieldLite mapFieldLiteF = vVar.f();
            vVar.a(mapFieldLiteF, objM);
            v0.x(jS, obj, mapFieldLiteF);
            objM = mapFieldLiteF;
        }
        m0Var.B(vVar.c(objM), vVar.b(obj2), extensionRegistryLite);
    }

    public final void x(int i10, Object obj, Object obj2) {
        long jS = S(i10) & 1048575;
        if (s(i10, obj2)) {
            v0.e eVar = v0.f21151d;
            Object objM = eVar.m(jS, obj);
            Object objM2 = eVar.m(jS, obj2);
            if (objM != null && objM2 != null) {
                v0.x(jS, obj, Internal.a(objM, objM2));
                O(i10, obj);
            } else if (objM2 != null) {
                v0.x(jS, obj, objM2);
                O(i10, obj);
            }
        }
    }

    public final void y(int i10, Object obj, Object obj2) {
        int iS = S(i10);
        int i11 = this.f21019a[i10];
        long j10 = iS & 1048575;
        if (t(i11, i10, obj2)) {
            v0.e eVar = v0.f21151d;
            Object objM = eVar.m(j10, obj);
            Object objM2 = eVar.m(j10, obj2);
            if (objM != null && objM2 != null) {
                v0.x(j10, obj, Internal.a(objM, objM2));
                P(i11, i10, obj);
            } else if (objM2 != null) {
                v0.x(j10, obj, objM2);
                P(i11, i10, obj);
            }
        }
    }
}
