package com.facetec.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
final class JNI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f40154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Object, String> f40155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f40156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f40157d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f40158e = null;

    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
        long e();
    }

    static {
        a();
        f40156c = 0;
        f40154a = 1;
        HashMap map = new HashMap();
        f40155b = map;
        map.put(Boolean.TYPE, "Z");
        map.put(Byte.TYPE, "B");
        map.put(Character.TYPE, "C");
        map.put(Double.TYPE, "D");
        map.put(Float.TYPE, "F");
        map.put(Integer.TYPE, TransactionType.TRANSACTION_TYPE_DRSP_CODE);
        map.put(Long.TYPE, "J");
        map.put(Short.TYPE, ExifInterface.LATITUDE_SOUTH);
        map.put(Void.TYPE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
    }

    public static void a() {
        byte[] bArr = new byte[1181];
        System.arraycopy("G\u001büµü\u0005û\u0005ú\u0006ù\u0007ÿû\u0006ÿú\u0007õ\u000bô\fÿù\bó\rÿø\tÿ÷\nû\u0000\u0005ûÿ\u0006ûý\bÿö\u000bõ\u000bûý\bÿõ\fÿô\rÿü\u0001\u0004ÿü\u0000\u0005ûú\u000bù\u0007ÿû\u0006ûù\fûø\rú\u0002\u0004ÿú\u0007ÿüÿ\u0006ú\u0000\u0006ÿüþ\u0007úÿ\u0007ÿüþ\të\u00153Â\u000bó\u00079Ûß\u0002\tû\u0007\u0003\u0004\u0003õ\të\u00153Â\u000bó\u00079åÛú\u000fþ\u0002ó\u0015õ÷\u0010\u0016éûú\u001eõõ÷\u0010ü\u0005úý\tÿû\u0006ÿú\u0007úü\nûý\bú\u0002\u0004ÿù\bó\rÿø\tÿ÷\núû\u000búú\fúù\rù\u0003\u0004ÿö\u000bõ\u000bûý\bÿõ\fÿô\rÿü\u0001\u0004ÿü\u0000\u0005ó\rù\u0001\u0006ú\u0002\u0004ÿø\tÿ÷\nù\u0000\u0007ùÿ\bù\u0003\u0004ÿö\u000bùþ\tÿüÿ\u0006ÿüþ\u0007ÿüý\bÿüý\bÿüü\tú\u0000\u0006ÿüû\núÿ\u0007ÿüûü\u0005ú\u0006ÿû\u0006ùü\u000bÿú\u0007ù\u0007ÿù\bÿø\tõ\u000bô\fÿ÷\nó\rÿö\u000bÿõ\fùû\fùú\rûý\bÿô\rõ\u000bûý\bÿü\u0001\u0004ÿü\u0000\u0005ÿüÿ\u0006ÿüþ\u0007ó\rûù\fÿüý\bú\u0002\u0004ÿö\u000bÿüü\tø\u0004\u0004ø\u0003\u0005ûý\bÿüû\nùþ\tÿüú\u000bÿüù\fÿüø\rÿüþ\u0007ú\u0006ÿû\u0006ø\u0002\u0006û\u0005ú\u0006ÿú\u0007ù\u0007ÿù\bø\u0001\u0007ÿø\tÿû\u0002\u0004ú\u0000\u0006ÿû\u0001\u0005úÿ\u0007ÿû\u0001\u0005ÿû\u0000\u0006úÿ\u0007ÿûÿ\u0007ú\u0000\u0006ÿûÿ\të\u00153Â\u000bó\u00079¼\rÿú\u0007\u0002ïFáèñ\fù\u000b\u0002ñ&íô\bü\u0005ÿû\u0006ÿú\u0007ø\u0000\bøÿ\tÿù\bøþ\nøý\u000bøü\føû\rÿø\t÷\u0004\u0005ÿ÷\nÿö\u000bÿõ\fú\u0006÷\u0003\u0006÷\u0002\u0007÷\u0001\b÷\u0000\t÷ÿ\nÿô\rÿü\u0001\u0004÷þ\u000bÿü\u0000\u0005÷ý\fÿüÿ\u0006øÿ\tÿüþ\u0007ÿô\rÿü\u0001\u0004ú\u0002\u0004÷\u0000\tÿüý\bÿüü\t÷ü\rú\u0002\u0004ÿüû\nó\rÿüú\u000bõ\u000bùþ\tú\u0002\u0004ÿø\tÿüù\fö\u0006\u0004ùú\rûý\bÿüø\rõ\u000bûý\bÿû\u0002\u0004ÿû\u0001\u0005ÿû\u0000\u0006ÿû\u0000\u0006ÿûÿ\u0007ö\u0005\u0005ö\u0004\u0006ÿûþ\bõ\u000bûý\bÿûý\tÿûü\nÿûû\u000bö\u0003\u0007ö\u0002\bö\u0001\tÿô\rÿü\u0001\u0004ö\u0000\nÿü\u0000\u0005ÿüù\föÿ\u000bùú\rûý\bÿüø\rùþ\tÿûú\fÿûù\rÿú\u0003\u0004ÿú\u0002\u0005ó\rù\u0001\u0006ú\u0002\u0004ÿüú\u000bÿú\u0001\u0006öþ\fÿú\u0000\u0007öý\rÿú\u0000\u0007ÿúÿ\bõ\u0007\u0004ÿúþ\tõ\u0006\u0005ÿúþ\të\u00153Â\u000bó\u00079Ûß\u0002\tû\u0007%Í\fý\bÿó\u0002ñ$ïï\u0011ô\bñ\u000fó\u001eÛ\t\u000bòñ\u0000\u000b÷\n\u0002ñ\"íñÿ\u0003\u0004\u001aÛ\t\u000bü\u0005øÿ\tÿû\u0006ÿú\u0007ÿù\bÿø\tøÿ\tÿ÷\nõ\u0005\u0006ÿö\u000bÿõ\føÿ\tÿô\rÿü\u0001\u0004ÿü\u0000\u0005ÿüÿ\u0006øÿ\tÿüþ\u0007ÿüý\bÿüü\tÿüû\nÿüú\u000bøÿ\tÿüù\fÿüø\rÿû\u0002\u0004ÿû\u0001\u0005ÿõ\føÿ\tÿû\u0000\u0006õ\u0004\u0007õ\u0003\bÿûÿ\u0007ÿü\u0001\u0004õ\u0002\tÿûþ\bÿü\u0000\u0005ÿûý\tõ\u000bõ\u000bõ\u0001\nÿûü\nó\rÿûý\tó\rÿûý\tÿûû\u000bõ\u0000\u000búú\fûÿ\u0006ûý\bÿûú\fõ\u000bûý\bÿûù\rÿú\u0003\u0004ÿú\u0002\u0005ÿú\u0002\u0005ÿûû\u000bõÿ\fø\u0003\u0005ûý\bÿûú\fõ\u000bûý\bÿú\u0001\u0006ÿú\u0000\u0007ÿúÿ\bÿúþ\tÿüú\u000bøÿ\tÿüù\fÿüø\rûù\fõþ\rÿû\u0002\u0004ÿúý\nô\b\u0004ÿúü\u000bô\u0007\u0005ÿúü\u000bÿúû\fô\u0006\u0006ÿúú\rô\u0005\u0007ÿúú\të\u00153¹\u0001\u000bý>áìñ\u0002ñ\të\u00153Â\u000bó\u00079ßíø\u0005\u0002ï\rõ\u0004\u000bþþ".getBytes("ISO-8859-1"), 0, bArr, 0, 1181);
        f40158e = bArr;
        f40157d = 82;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x033c A[Catch: all -> 0x0323, TryCatch #1 {all -> 0x0323, blocks: (B:74:0x031c, B:75:0x031e, B:88:0x0336, B:90:0x033c, B:91:0x033d, B:92:0x033e, B:95:0x035e, B:97:0x036c, B:98:0x0374, B:99:0x037a, B:100:0x038d, B:105:0x03af, B:106:0x03b8, B:108:0x03cd, B:113:0x03ee, B:118:0x040f, B:119:0x041c, B:120:0x041d, B:127:0x0440), top: B:147:0x031c }] */
    /* JADX WARN: Code duplicated, block: B:91:0x033d A[Catch: all -> 0x0323, TryCatch #1 {all -> 0x0323, blocks: (B:74:0x031c, B:75:0x031e, B:88:0x0336, B:90:0x033c, B:91:0x033d, B:92:0x033e, B:95:0x035e, B:97:0x036c, B:98:0x0374, B:99:0x037a, B:100:0x038d, B:105:0x03af, B:106:0x03b8, B:108:0x03cd, B:113:0x03ee, B:118:0x040f, B:119:0x041c, B:120:0x041d, B:127:0x0440), top: B:147:0x031c }] */
    public static String c(Method method) throws Throwable {
        Throwable cause;
        dh dhVar = new dh(method);
        byte[] bArr = f40158e;
        Object[] objArr = new Object[1];
        f(bArr[58], (short) 482, bArr[34], objArr);
        char c10 = 0;
        String str = (String) objArr[0];
        byte b10 = bArr[34];
        Object[] objArr2 = new Object[1];
        f(b10, (short) (b10 | Constants.DIRECTORY_ENTRY), (short) 312, objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            char c11 = 1154;
            short s4 = (short) 97;
            short s7 = (short) 297;
            Object[] objArr4 = new Object[1];
            f(bArr[1154], s4, s7, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            f(bArr[0], (short) 112, (short) 308, objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            f(bArr[1154], s4, s7, objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i10 = 0;
            while (i10 < objArr7.length) {
                Object[] objArr8 = new Object[1];
                objArr8[c10] = objArr7[i10];
                byte[] bArr2 = f40158e;
                short s9 = (short) 116;
                short s10 = (short) 296;
                Object[] objArr9 = new Object[1];
                f(bArr2[c11], s9, s10, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[c10]);
                Object[] objArr10 = new Object[1];
                f((byte) 74, (short) 132, (short) 306, objArr10);
                String str3 = (String) objArr10[0];
                Object[] objArr11 = new Object[1];
                f(bArr2[1154], s4, s7, objArr11);
                Object objInvoke = cls2.getMethod(str3, Class.forName((String) objArr11[0])).invoke(null, objArr8);
                Object[] objArr12 = new Object[1];
                f(bArr2[1154], s9, s10, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                Object[] objArr13 = new Object[1];
                f((byte) (bArr2[1154] - 1), (short) 138, (short) 305, objArr13);
                iArr[i10] = ((Integer) cls3.getMethod((String) objArr13[0], null).invoke(objInvoke, null)).intValue();
                i10++;
                c10 = 0;
                c11 = 1154;
            }
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                try {
                    switch (dhVar.c(iArr[i11])) {
                        case -35:
                            i11 = 90;
                            break;
                        case -34:
                            i11 = 15;
                            dhVar.c(21);
                            int i13 = dhVar.f41189e;
                            if (i13 != 83 && i13 == 93) {
                                i11 = 64;
                            }
                            break;
                        case -33:
                            i11 = 85;
                            break;
                        case -32:
                            dhVar.c(21);
                            int i14 = dhVar.f41189e;
                            i11 = (i14 == 20 || i14 != 57) ? 81 : 38;
                            break;
                        case -31:
                            dhVar.c(16);
                            throw ((Throwable) dhVar.f41192h);
                        case -30:
                            i11 = 86;
                            break;
                        case -29:
                            i11 = 88;
                            break;
                        case -28:
                            dhVar.c(31);
                            i11 = dhVar.f41189e == 0 ? 79 : i12;
                            break;
                        case -27:
                            i11 = 91;
                            break;
                        case -26:
                            i11 = 93;
                            break;
                        case -25:
                            dhVar.c(15);
                            if (dhVar.f41189e == 0) {
                                i11 = 63;
                            }
                            break;
                        case -24:
                            dhVar.f41186b = 1;
                            dhVar.c(4);
                            dhVar.c(13);
                            f40154a = dhVar.f41189e;
                            break;
                        case -23:
                            dhVar.f41186b = f40156c;
                            dhVar.c(10);
                            break;
                        case -22:
                            i11 = 40;
                            break;
                        case -21:
                            i11 = 54;
                            break;
                        case -20:
                            dhVar.c(31);
                            if (dhVar.f41189e == 0) {
                                i11 = 53;
                            }
                            break;
                        case -19:
                            dhVar.f41186b = 1;
                            dhVar.c(4);
                            dhVar.c(13);
                            f40156c = dhVar.f41189e;
                            break;
                        case -18:
                            dhVar.f41186b = f40154a;
                            dhVar.c(10);
                            break;
                        case -17:
                            dhVar.c(16);
                            return (String) dhVar.f41192h;
                        case -16:
                            i11 = 1;
                            break;
                        case -15:
                            i11 = 71;
                            break;
                        case -14:
                            dhVar.f41186b = 1;
                            dhVar.c(4);
                            dhVar.c(6);
                            dhVar.f41193i = dhVar.f41192h.toString();
                            dhVar.c(36);
                            break;
                        case -13:
                            dhVar.f41186b = 1;
                            dhVar.c(4);
                            dhVar.c(6);
                            Object obj = dhVar.f41192h;
                            try {
                                try {
                                    Object[] objArr14 = new Object[1];
                                    f(f40158e[1154], (short) 453, (short) 289, objArr14);
                                    try {
                                        Class<?> cls4 = Class.forName((String) objArr14[0]);
                                        Object[] objArr15 = new Object[1];
                                        f((byte) 59, (short) 837, (short) 300, objArr15);
                                        try {
                                            try {
                                                try {
                                                    dhVar.f41193i = cls4.getMethod((String) objArr15[0], null).invoke(obj, null);
                                                    dhVar.c(36);
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    if (i12 >= 82 || i12 > 85) {
                                                        throw th;
                                                    }
                                                    dhVar.f41193i = th;
                                                    dhVar.c(24);
                                                    i11 = 80;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            cause = th.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                            }
                            break;
                        case -12:
                            dhVar.f41186b = 2;
                            dhVar.c(4);
                            dhVar.c(6);
                            Object obj2 = dhVar.f41192h;
                            dhVar.c(13);
                            try {
                                Object[] objArr16 = {Character.valueOf((char) dhVar.f41189e)};
                                Object[] objArr17 = new Object[1];
                                f(f40158e[1154], (short) 794, (short) 290, objArr17);
                                Class<?> cls5 = Class.forName((String) objArr17[0]);
                                Object[] objArr18 = new Object[1];
                                f((byte) 53, (short) 832, (short) 307, objArr18);
                                dhVar.f41193i = cls5.getMethod((String) objArr18[0], Character.TYPE).invoke(obj2, objArr16);
                                dhVar.c(36);
                            } catch (Throwable th8) {
                                Throwable cause2 = th8.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th8;
                            }
                            break;
                        case -11:
                            i11 = 44;
                            break;
                        case -10:
                            dhVar.f41186b = 2;
                            dhVar.c(4);
                            dhVar.c(6);
                            Object obj3 = dhVar.f41192h;
                            dhVar.c(6);
                            try {
                                Object[] objArr19 = {dhVar.f41192h};
                                byte[] bArr3 = f40158e;
                                Object[] objArr20 = new Object[1];
                                f(bArr3[1154], (short) 794, (short) 290, objArr20);
                                Class<?> cls6 = Class.forName((String) objArr20[0]);
                                Object[] objArr21 = new Object[1];
                                f((byte) 53, (short) 832, (short) 307, objArr21);
                                String str4 = (String) objArr21[0];
                                Object[] objArr22 = new Object[1];
                                f(bArr3[1154], s4, s7, objArr22);
                                dhVar.f41193i = cls6.getMethod(str4, Class.forName((String) objArr22[0])).invoke(obj3, objArr19);
                                dhVar.c(36);
                            } catch (Throwable th9) {
                                Throwable cause3 = th9.getCause();
                                if (cause3 != null) {
                                    throw cause3;
                                }
                                throw th9;
                            }
                            break;
                        case -9:
                            dhVar.f41186b = 1;
                            dhVar.c(4);
                            dhVar.c(6);
                            dhVar.f41193i = d((Class) dhVar.f41192h);
                            dhVar.c(36);
                            break;
                        case -8:
                            i11 = 25;
                            break;
                        case -7:
                            i11 = 55;
                            break;
                        case -6:
                            dhVar.c(50);
                            if (dhVar.f41189e == 0) {
                                i11 = 14;
                            }
                            break;
                        case -5:
                            i11 = 11;
                            break;
                        case -4:
                            dhVar.f41186b = 1;
                            dhVar.c(4);
                            dhVar.c(6);
                            Object obj4 = dhVar.f41192h;
                            try {
                                Object[] objArr23 = new Object[1];
                                f(f40158e[1154], (short) 453, (short) 289, objArr23);
                                Class<?> cls7 = Class.forName((String) objArr23[0]);
                                Object[] objArr24 = new Object[1];
                                f((byte) 59, (short) 816, (short) 296, objArr24);
                                dhVar.f41193i = cls7.getMethod((String) objArr24[0], null).invoke(obj4, null);
                                dhVar.c(36);
                            } catch (Throwable th10) {
                                Throwable cause4 = th10.getCause();
                                if (cause4 != null) {
                                    throw cause4;
                                }
                                throw th10;
                            }
                            break;
                        case -3:
                            dhVar.f41186b = 1;
                            dhVar.c(4);
                            dhVar.c(6);
                            try {
                                Object[] objArr25 = {dhVar.f41192h};
                                byte[] bArr4 = f40158e;
                                Object[] objArr26 = new Object[1];
                                f(bArr4[1154], (short) 794, (short) 290, objArr26);
                                Class<?> cls8 = Class.forName((String) objArr26[0]);
                                Object[] objArr27 = new Object[1];
                                f(bArr4[1154], s4, s7, objArr27);
                                dhVar.f41193i = cls8.getDeclaredConstructor(Class.forName((String) objArr27[0])).newInstance(objArr25);
                                dhVar.c(36);
                            } catch (Throwable th11) {
                                Throwable cause5 = th11.getCause();
                                if (cause5 != null) {
                                    throw cause5;
                                }
                                throw th11;
                            }
                            break;
                        case -2:
                            dhVar.f41193i = "(";
                            dhVar.c(36);
                            break;
                        case -1:
                            i11 = 35;
                            break;
                        default:
                            break;
                    }
                } catch (Throwable th12) {
                    th = th12;
                    if (i12 >= 82) {
                    }
                    throw th;
                }
            }
        } catch (Throwable th13) {
            Throwable cause6 = th13.getCause();
            if (cause6 != null) {
                throw cause6;
            }
            throw th13;
        }
    }

    public static /* synthetic */ Object d(Object[] objArr, int i10, int i11, int i12) {
        return e(objArr);
    }

    private static /* synthetic */ Object e(Object[] objArr) throws Throwable {
        int i10 = 0;
        dh dhVar = new dh((Class) objArr[0], (Class) objArr[1]);
        byte[] bArr = f40158e;
        byte b10 = bArr[58];
        short s4 = (short) (b10 | 144);
        Object[] objArr2 = new Object[1];
        f(b10, s4, (short) (s4 | 40), objArr2);
        String str = (String) objArr2[0];
        byte b11 = bArr[34];
        Object[] objArr3 = new Object[1];
        f(b11, (short) (b11 | Constants.DIRECTORY_ENTRY), (short) 312, objArr3);
        try {
            Object[] objArr4 = {(String) objArr3[0]};
            char c10 = 1154;
            short s7 = (short) 97;
            short s9 = (short) 297;
            Object[] objArr5 = new Object[1];
            f(bArr[1154], s7, s9, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            f(bArr[0], (short) 112, (short) 308, objArr6);
            String str2 = (String) objArr6[0];
            Object[] objArr7 = new Object[1];
            f(bArr[1154], s7, s9, objArr7);
            Object[] objArr8 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr7[0])).invoke(str, objArr4);
            int[] iArr = new int[objArr8.length];
            int i11 = 0;
            while (i11 < objArr8.length) {
                Object[] objArr9 = new Object[1];
                objArr9[i10] = objArr8[i11];
                byte[] bArr2 = f40158e;
                short s10 = (short) 116;
                short s11 = (short) 296;
                Object[] objArr10 = new Object[1];
                f(bArr2[c10], s10, s11, objArr10);
                Class<?> cls2 = Class.forName((String) objArr10[i10]);
                Object[] objArr11 = new Object[1];
                f((byte) 74, (short) 132, (short) 306, objArr11);
                String str3 = (String) objArr11[0];
                Object[] objArr12 = new Object[1];
                f(bArr2[1154], s7, s9, objArr12);
                Object objInvoke = cls2.getMethod(str3, Class.forName((String) objArr12[0])).invoke(null, objArr9);
                Object[] objArr13 = new Object[1];
                f(bArr2[1154], s10, s11, objArr13);
                Class<?> cls3 = Class.forName((String) objArr13[0]);
                c10 = 1154;
                Object[] objArr14 = new Object[1];
                f((byte) (bArr2[1154] - 1), (short) 138, (short) 305, objArr14);
                iArr[i11] = ((Integer) cls3.getMethod((String) objArr14[0], null).invoke(objInvoke, null)).intValue();
                i11++;
                i10 = 0;
            }
            while (true) {
                int i12 = i10 + 1;
                try {
                    switch (dhVar.c(iArr[i10])) {
                        case -16:
                            i10 = 36;
                            break;
                        case -15:
                            dhVar.c(21);
                            int i13 = dhVar.f41189e;
                            i12 = 22;
                            i10 = (i13 == 0 || i13 != 1) ? i12 : 8;
                            break;
                        case -14:
                            i10 = 1;
                            break;
                        case -13:
                            i10 = 35;
                            break;
                        case -12:
                            dhVar.c(31);
                            if (dhVar.f41189e == 0) {
                                i10 = 34;
                            }
                            break;
                        case -11:
                            dhVar.c(16);
                            throw ((Throwable) dhVar.f41192h);
                        case -10:
                            i10 = 37;
                            break;
                        case -9:
                            i10 = 39;
                            break;
                        case -8:
                            dhVar.c(31);
                            if (dhVar.f41189e == 0) {
                                i10 = 20;
                            }
                            break;
                        case -7:
                            dhVar.f41186b = 1;
                            dhVar.c(4);
                            dhVar.c(13);
                            f40156c = dhVar.f41189e;
                            break;
                        case -6:
                            try {
                                dhVar.f41186b = f40154a;
                                dhVar.c(10);
                            } catch (Throwable th2) {
                                th = th2;
                                if (i12 < 23 || i12 > 26) {
                                    throw th;
                                }
                                dhVar.f41193i = th;
                                dhVar.c(24);
                                i10 = 21;
                            }
                            break;
                        case -5:
                            return null;
                        case -4:
                            i10 = 26;
                            break;
                        case -3:
                            i10 = 10;
                            break;
                        case -2:
                            dhVar.f41186b = 2;
                            dhVar.c(4);
                            dhVar.c(6);
                            Class cls4 = (Class) dhVar.f41192h;
                            dhVar.c(6);
                            fnm(cls4, (Class) dhVar.f41192h);
                            break;
                        case -1:
                            i10 = 4;
                            break;
                        default:
                            break;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r8, short r9, int r10, java.lang.Object[] r11) {
        /*
            byte[] r0 = com.facetec.sdk.JNI.f40158e
            int r8 = r8 + 44
            int r10 = 313 - r10
            int r9 = r9 + 4
            byte[] r1 = new byte[r10]
            r2 = 0
            if (r0 != 0) goto L14
            r8 = r9
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r11
            r11 = r10
            goto L2f
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r10) goto L24
            java.lang.String r8 = new java.lang.String
            r8.<init>(r1, r2)
            r11[r2] = r8
            return
        L24:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r6
            r7 = r11
            r11 = r10
            r10 = r3
            r3 = r1
            r1 = r0
            r0 = r7
        L2f:
            int r10 = -r10
            int r9 = r9 + r10
            int r8 = r8 + 1
            r10 = r11
            r11 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.JNI.f(byte, short, int, java.lang.Object[]):void");
    }

    private static native void fnm(Class<ch> cls, Class<dr> cls2);

    private static native void rnm(long j10, String str, String str2);

    private static void c(long j10, String str, String str2) throws Throwable {
        dh dhVar = new dh(j10, str, str2);
        byte[] bArr = f40158e;
        byte b10 = bArr[58];
        short s4 = bArr[34];
        Object[] objArr = new Object[1];
        f(b10, s4, (short) (s4 | 215), objArr);
        int i10 = 0;
        String str3 = (String) objArr[0];
        byte b11 = bArr[34];
        Object[] objArr2 = new Object[1];
        f(b11, (short) (b11 | Constants.DIRECTORY_ENTRY), (short) 312, objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            char c10 = 1154;
            short s7 = (short) 97;
            short s9 = (short) 297;
            Object[] objArr4 = new Object[1];
            f(bArr[1154], s7, s9, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            f(bArr[0], (short) 112, (short) 308, objArr5);
            String str4 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            f(bArr[1154], s7, s9, objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str4, Class.forName((String) objArr6[0])).invoke(str3, objArr3);
            int[] iArr = new int[objArr7.length];
            int i11 = 0;
            while (i11 < objArr7.length) {
                Object[] objArr8 = new Object[1];
                objArr8[i10] = objArr7[i11];
                byte[] bArr2 = f40158e;
                short s10 = (short) 116;
                short s11 = (short) 296;
                Object[] objArr9 = new Object[1];
                f(bArr2[c10], s10, s11, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[i10]);
                Object[] objArr10 = new Object[1];
                f((byte) 74, (short) 132, (short) 306, objArr10);
                String str5 = (String) objArr10[0];
                Object[] objArr11 = new Object[1];
                f(bArr2[1154], s7, s9, objArr11);
                Object objInvoke = cls2.getMethod(str5, Class.forName((String) objArr11[0])).invoke(null, objArr8);
                Object[] objArr12 = new Object[1];
                f(bArr2[1154], s10, s11, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                Object[] objArr13 = new Object[1];
                f((byte) (bArr2[1154] - 1), (short) 138, (short) 305, objArr13);
                iArr[i11] = ((Integer) cls3.getMethod((String) objArr13[0], null).invoke(objInvoke, null)).intValue();
                i11++;
                i10 = 0;
                c10 = 1154;
            }
            while (true) {
                int i12 = i10 + 1;
                try {
                    switch (dhVar.c(iArr[i10])) {
                        case -13:
                            i10 = 29;
                            break;
                        case -12:
                            dhVar.c(21);
                            int i13 = dhVar.f41189e;
                            i10 = 22;
                            if (i13 != 0 && i13 == 1) {
                                i10 = 1;
                            }
                            break;
                        case -11:
                            dhVar.c(16);
                            throw ((Throwable) dhVar.f41192h);
                        case -10:
                            i10 = 30;
                            break;
                        case -9:
                            i10 = 32;
                            break;
                        case -8:
                            dhVar.c(15);
                            i10 = dhVar.f41189e == 0 ? 20 : i12;
                            break;
                        case -7:
                            dhVar.f41186b = 1;
                            dhVar.c(4);
                            dhVar.c(13);
                            f40154a = dhVar.f41189e;
                            break;
                        case -6:
                            dhVar.f41186b = f40156c;
                            dhVar.c(10);
                            break;
                        case -5:
                            return;
                        case -4:
                            i10 = 11;
                            break;
                        case -3:
                            i10 = 9;
                            break;
                        case -2:
                            dhVar.f41186b = 3;
                            dhVar.c(4);
                            dhVar.c(5);
                            long j11 = dhVar.f41185a;
                            dhVar.c(6);
                            String str6 = (String) dhVar.f41192h;
                            dhVar.c(6);
                            rnm(j11, str6, (String) dhVar.f41192h);
                            break;
                        case -1:
                            i10 = 6;
                            break;
                        default:
                            break;
                    }
                } catch (Throwable th2) {
                    if (i12 < 25 || i12 > 29) {
                        throw th2;
                    }
                    dhVar.f41193i = th2;
                    dhVar.c(24);
                    i10 = 21;
                }
            }
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause == null) {
                throw th3;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x042c A[Catch: all -> 0x0412, TryCatch #7 {all -> 0x0412, blocks: (B:102:0x040c, B:116:0x0426, B:118:0x042c, B:119:0x042d, B:122:0x0433, B:126:0x044c, B:127:0x0459), top: B:182:0x040c }] */
    /* JADX WARN: Code duplicated, block: B:119:0x042d A[Catch: all -> 0x0412, TryCatch #7 {all -> 0x0412, blocks: (B:102:0x040c, B:116:0x0426, B:118:0x042c, B:119:0x042d, B:122:0x0433, B:126:0x044c, B:127:0x0459), top: B:182:0x040c }] */
    /* JADX WARN: Code duplicated, block: B:133:0x047d A[PHI: r3
      0x047d: PHI (r3v59 char) = (r3v56 char), (r3v60 char) binds: [B:140:0x0499, B:131:0x0478] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:161:0x0503  */
    /* JADX WARN: Code duplicated, block: B:239:0x0512 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x016d  */
    public static String d(Class<?> cls) throws Throwable {
        char c10;
        char c11;
        char c12;
        Throwable cause;
        dh dhVar = new dh(cls);
        byte[] bArr = f40158e;
        byte b10 = bArr[58];
        Object[] objArr = new Object[1];
        f(b10, (short) (b10 | Constants.CVR_B1b85_0101_MOBILE_APP), (short) (-bArr[483]), objArr);
        char c13 = 0;
        String str = (String) objArr[0];
        byte b11 = bArr[34];
        Object[] objArr2 = new Object[1];
        f(b11, (short) (b11 | Constants.DIRECTORY_ENTRY), (short) 312, objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            char c14 = 1154;
            short s4 = (short) 97;
            short s7 = (short) 297;
            Object[] objArr4 = new Object[1];
            f(bArr[1154], s4, s7, objArr4);
            Class<?> cls2 = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            f(bArr[0], (short) 112, (short) 308, objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            f(bArr[1154], s4, s7, objArr6);
            Object[] objArr7 = (Object[]) cls2.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i10 = 0;
            while (true) {
                c10 = 306;
                if (i10 >= objArr7.length) {
                    break;
                }
                Object[] objArr8 = new Object[1];
                objArr8[c13] = objArr7[i10];
                byte[] bArr2 = f40158e;
                short s9 = (short) 116;
                short s10 = (short) 296;
                Object[] objArr9 = new Object[1];
                f(bArr2[c14], s9, s10, objArr9);
                Class<?> cls3 = Class.forName((String) objArr9[c13]);
                Object[] objArr10 = new Object[1];
                f((byte) 74, (short) 132, (short) 306, objArr10);
                String str3 = (String) objArr10[0];
                Object[] objArr11 = new Object[1];
                f(bArr2[1154], s4, s7, objArr11);
                Object objInvoke = cls3.getMethod(str3, Class.forName((String) objArr11[0])).invoke(null, objArr8);
                Object[] objArr12 = new Object[1];
                f(bArr2[1154], s9, s10, objArr12);
                Class<?> cls4 = Class.forName((String) objArr12[0]);
                Object[] objArr13 = new Object[1];
                f((byte) (bArr2[1154] - 1), (short) 138, (short) 305, objArr13);
                iArr[i10] = ((Integer) cls4.getMethod((String) objArr13[0], null).invoke(objInvoke, null)).intValue();
                i10++;
                c13 = 0;
                c14 = 1154;
            }
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                try {
                    switch (dhVar.c(iArr[i11])) {
                        case -39:
                            c11 = 306;
                            i11 = 81;
                            c10 = c11;
                            break;
                        case -38:
                            i11 = 21;
                            c11 = 306;
                            dhVar.c(21);
                            int i13 = dhVar.f41189e;
                            if (i13 == 21 || i13 != 64) {
                                i11 = 69;
                            }
                            c10 = c11;
                            break;
                        case -37:
                            c11 = 306;
                            i11 = 76;
                            c10 = c11;
                            break;
                        case -36:
                            c11 = 306;
                            dhVar.c(21);
                            i11 = dhVar.f41189e != 69 ? 26 : 58;
                            c10 = c11;
                            break;
                        case -35:
                            c11 = 306;
                            dhVar.c(16);
                            throw ((Throwable) dhVar.f41192h);
                        case -34:
                            c11 = 306;
                            i11 = 82;
                            c10 = c11;
                            break;
                        case -33:
                            c11 = 306;
                            i11 = 84;
                            c10 = c11;
                            break;
                        case -32:
                            c11 = 306;
                            dhVar.c(31);
                            if (dhVar.f41189e == 0) {
                                i11 = 67;
                            } else {
                                i11 = i12;
                            }
                            c10 = c11;
                            break;
                        case -31:
                            i11 = 1;
                            c10 = 306;
                            break;
                        case -30:
                            c11 = 306;
                            i11 = 57;
                            c10 = c11;
                            break;
                        case -29:
                            c11 = 306;
                            try {
                                dhVar.c(31);
                                if (dhVar.f41189e == 0) {
                                    i11 = 56;
                                } else {
                                    i11 = i12;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (i12 >= 73 || i12 > 76) {
                                    throw th;
                                }
                                dhVar.f41193i = th;
                                dhVar.c(24);
                                i11 = 68;
                            }
                            c10 = c11;
                            break;
                        case -28:
                            c12 = 306;
                            dhVar.f41186b = 1;
                            dhVar.c(4);
                            dhVar.c(13);
                            f40156c = dhVar.f41189e;
                            i11 = i12;
                            c10 = c12;
                            break;
                        case -27:
                            c12 = 306;
                            dhVar.f41186b = f40154a;
                            dhVar.c(10);
                            i11 = i12;
                            c10 = c12;
                            break;
                        case -26:
                            c12 = 306;
                            i11 = 46;
                            c10 = c12;
                            break;
                        case -25:
                            dhVar.c(16);
                            return (String) dhVar.f41192h;
                        case -24:
                            c12 = 306;
                            try {
                                dhVar.f41186b = 2;
                                dhVar.c(4);
                                dhVar.c(6);
                                Object obj = dhVar.f41192h;
                                dhVar.c(13);
                                try {
                                    Object[] objArr14 = new Object[1];
                                    try {
                                        objArr14[0] = Character.valueOf((char) dhVar.f41189e);
                                        try {
                                            Object[] objArr15 = new Object[1];
                                            f(f40158e[1154], (short) 794, (short) 290, objArr15);
                                            try {
                                                Class<?> cls5 = Class.forName((String) objArr15[0]);
                                                Object[] objArr16 = new Object[1];
                                                f((byte) 53, (short) 832, (short) 307, objArr16);
                                                try {
                                                    try {
                                                        dhVar.f41193i = cls5.getMethod((String) objArr16[0], Character.TYPE).invoke(obj, objArr14);
                                                        dhVar.c(36);
                                                        i11 = i12;
                                                        c10 = c12;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        c11 = 306;
                                                        if (i12 >= 73) {
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    cause = th.getCause();
                                                    if (cause != null) {
                                                        throw cause;
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                            }
                            break;
                        case -23:
                            dhVar.f41186b = 3;
                            dhVar.c(4);
                            dhVar.c(6);
                            Object obj2 = dhVar.f41192h;
                            dhVar.c(13);
                            char c15 = (char) dhVar.f41189e;
                            dhVar.c(13);
                            try {
                                Object[] objArr17 = {Character.valueOf(c15), Character.valueOf((char) dhVar.f41189e)};
                                byte[] bArr3 = f40158e;
                                Object[] objArr18 = new Object[1];
                                f(bArr3[1154], s4, s7, objArr18);
                                Class<?> cls6 = Class.forName((String) objArr18[0]);
                                c12 = 306;
                                try {
                                    Object[] objArr19 = new Object[1];
                                    f(bArr3[473], (short) 1171, (short) 306, objArr19);
                                    String str4 = (String) objArr19[0];
                                    Class<?> cls7 = Character.TYPE;
                                    try {
                                        dhVar.f41193i = cls6.getMethod(str4, cls7, cls7).invoke(obj2, objArr17);
                                        dhVar.c(36);
                                        i11 = i12;
                                        c10 = c12;
                                    } catch (Throwable th10) {
                                        th = th10;
                                        c11 = 306;
                                        if (i12 >= 73) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    Throwable cause2 = th.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th;
                                }
                            } catch (Throwable th12) {
                                th = th12;
                            }
                            break;
                        case -22:
                            dhVar.f41186b = 1;
                            dhVar.c(4);
                            dhVar.c(6);
                            dhVar.f41193i = ((Class) dhVar.f41192h).getName();
                            dhVar.c(36);
                            c12 = 306;
                            i11 = i12;
                            c10 = c12;
                            break;
                        case -21:
                            dhVar.f41193i = "L";
                            dhVar.c(36);
                            c12 = 306;
                            i11 = i12;
                            c10 = c12;
                            break;
                        case -20:
                            i11 = 42;
                            c10 = 306;
                            break;
                        case -19:
                            dhVar.f41186b = 1;
                            dhVar.c(4);
                            dhVar.c(6);
                            dhVar.f41193i = dhVar.f41192h;
                            dhVar.c(36);
                            c12 = 306;
                            i11 = i12;
                            c10 = c12;
                            break;
                        case -18:
                            dhVar.f41186b = 2;
                            dhVar.c(4);
                            dhVar.c(6);
                            Object obj3 = dhVar.f41192h;
                            dhVar.c(6);
                            try {
                                Object[] objArr20 = {dhVar.f41192h};
                                byte[] bArr4 = f40158e;
                                Object[] objArr21 = new Object[1];
                                f(bArr4[1154], (short) (f40157d | 1060), (short) 300, objArr21);
                                Class<?> cls8 = Class.forName((String) objArr21[0]);
                                Object[] objArr22 = new Object[1];
                                f((byte) 59, (short) 1154, (short) 310, objArr22);
                                String str5 = (String) objArr22[0];
                                Object[] objArr23 = new Object[1];
                                f(bArr4[1154], (short) 1156, s7, objArr23);
                                dhVar.f41193i = cls8.getMethod(str5, Class.forName((String) objArr23[0])).invoke(obj3, objArr20);
                                dhVar.c(36);
                                c12 = 306;
                                i11 = i12;
                                c10 = c12;
                            } catch (Throwable th13) {
                                Throwable cause3 = th13.getCause();
                                if (cause3 != null) {
                                    throw cause3;
                                }
                                throw th13;
                            }
                            break;
                        case -17:
                            dhVar.f41193i = f40155b;
                            dhVar.c(36);
                            c12 = 306;
                            i11 = i12;
                            c10 = c12;
                            break;
                        case -16:
                            i11 = 77;
                            c10 = 306;
                            break;
                        case -15:
                            i11 = 79;
                            c10 = 306;
                            break;
                        case -14:
                            dhVar.c(31);
                            if (dhVar.f41189e == 0) {
                                i11 = 20;
                            } else {
                                i11 = i12;
                            }
                            c10 = 306;
                            break;
                        case -13:
                            dhVar.f41186b = 1;
                            dhVar.c(4);
                            dhVar.c(6);
                            dhVar.f41186b = ((Class) dhVar.f41192h).isPrimitive() ? 1 : 0;
                            dhVar.c(10);
                            c12 = 306;
                            i11 = i12;
                            c10 = c12;
                            break;
                        case -12:
                            i11 = 44;
                            c10 = 306;
                            break;
                        case -11:
                            dhVar.f41186b = 1;
                            dhVar.c(4);
                            dhVar.c(6);
                            dhVar.f41193i = dhVar.f41192h.toString();
                            dhVar.c(36);
                            c12 = 306;
                            i11 = i12;
                            c10 = c12;
                            break;
                        case -10:
                            dhVar.f41186b = 2;
                            dhVar.c(4);
                            dhVar.c(6);
                            Object obj4 = dhVar.f41192h;
                            dhVar.c(6);
                            try {
                                Object[] objArr24 = {dhVar.f41192h};
                                byte[] bArr5 = f40158e;
                                Object[] objArr25 = new Object[1];
                                f(bArr5[1154], (short) 794, (short) 290, objArr25);
                                Class<?> cls9 = Class.forName((String) objArr25[0]);
                                Object[] objArr26 = new Object[1];
                                f((byte) 53, (short) 832, (short) 307, objArr26);
                                String str6 = (String) objArr26[0];
                                Object[] objArr27 = new Object[1];
                                f(bArr5[1154], s4, s7, objArr27);
                                dhVar.f41193i = cls9.getMethod(str6, Class.forName((String) objArr27[0])).invoke(obj4, objArr24);
                                dhVar.c(36);
                                c12 = 306;
                                i11 = i12;
                                c10 = c12;
                            } catch (Throwable th14) {
                                Throwable cause4 = th14.getCause();
                                if (cause4 != null) {
                                    throw cause4;
                                }
                                throw th14;
                            }
                            break;
                        case -9:
                            dhVar.f41186b = 1;
                            dhVar.c(4);
                            dhVar.c(6);
                            dhVar.f41193i = d((Class) dhVar.f41192h);
                            dhVar.c(36);
                            c12 = 306;
                            i11 = i12;
                            c10 = c12;
                            break;
                        case -8:
                            dhVar.f41186b = 1;
                            dhVar.c(4);
                            dhVar.c(6);
                            try {
                                Object[] objArr28 = {dhVar.f41192h};
                                byte[] bArr6 = f40158e;
                                Object[] objArr29 = new Object[1];
                                f(bArr6[1154], (short) 794, (short) 290, objArr29);
                                Class<?> cls10 = Class.forName((String) objArr29[0]);
                                Object[] objArr30 = new Object[1];
                                f(bArr6[1154], s4, s7, objArr30);
                                dhVar.f41193i = cls10.getDeclaredConstructor(Class.forName((String) objArr30[0])).newInstance(objArr28);
                                dhVar.c(36);
                                c12 = 306;
                                i11 = i12;
                                c10 = c12;
                            } catch (Throwable th15) {
                                Throwable cause5 = th15.getCause();
                                if (cause5 != null) {
                                    throw cause5;
                                }
                                throw th15;
                            }
                            break;
                        case -7:
                            dhVar.f41193i = Constant.BRACKET_OPEN;
                            dhVar.c(36);
                            c12 = 306;
                            i11 = i12;
                            c10 = c12;
                            break;
                        case -6:
                            dhVar.f41186b = 1;
                            dhVar.c(4);
                            dhVar.c(6);
                            dhVar.f41193i = ((Class) dhVar.f41192h).getComponentType();
                            dhVar.c(36);
                            c12 = 306;
                            i11 = i12;
                            c10 = c12;
                            break;
                        case -5:
                            i11 = 16;
                            c10 = 306;
                            break;
                        case -4:
                            i11 = 6;
                            c10 = 306;
                            break;
                        case -3:
                            dhVar.c(31);
                            if (dhVar.f41189e == 0) {
                                i11 = 5;
                            } else {
                                i11 = i12;
                            }
                            c10 = 306;
                            break;
                        case -2:
                            try {
                                dhVar.f41186b = 1;
                                dhVar.c(4);
                                dhVar.c(6);
                                dhVar.f41186b = ((Class) dhVar.f41192h).isArray() ? 1 : 0;
                                dhVar.c(10);
                                c12 = 306;
                                i11 = i12;
                                c10 = c12;
                            } catch (Throwable th16) {
                                th = th16;
                                c11 = 306;
                                if (i12 >= 73) {
                                }
                                throw th;
                            }
                            break;
                        case -1:
                            i11 = 38;
                            c10 = 306;
                            break;
                        default:
                            c12 = 306;
                            i11 = i12;
                            c10 = c12;
                            break;
                    }
                } catch (Throwable th17) {
                    th = th17;
                    c11 = c10;
                }
            }
        } catch (Throwable th18) {
            Throwable cause6 = th18.getCause();
            if (cause6 != null) {
                throw cause6;
            }
            throw th18;
        }
    }

    /* JADX WARN: Code duplicated, block: B:142:0x02f5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x01c6 A[Catch: all -> 0x01a9, TryCatch #4 {all -> 0x01a9, blocks: (B:33:0x01a1, B:48:0x01c0, B:50:0x01c6, B:51:0x01c7, B:54:0x01d0), top: B:115:0x01a1 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x01c7 A[Catch: all -> 0x01a9, TryCatch #4 {all -> 0x01a9, blocks: (B:33:0x01a1, B:48:0x01c0, B:50:0x01c6, B:51:0x01c7, B:54:0x01d0), top: B:115:0x01a1 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:99:0x02eb A[ADDED_TO_REGION] */
    public static void e(long j10, Method method) throws Throwable {
        Object obj;
        Throwable cause;
        dh dhVar = new dh(j10, method);
        byte[] bArr = f40158e;
        Object[] objArr = new Object[1];
        f(bArr[58], (short) 272, (short) 131, objArr);
        char c10 = 0;
        String str = (String) objArr[0];
        byte b10 = bArr[34];
        Object[] objArr2 = new Object[1];
        f(b10, (short) (b10 | Constants.DIRECTORY_ENTRY), (short) 312, objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            char c11 = 1154;
            short s4 = (short) 97;
            short s7 = (short) 297;
            Object[] objArr4 = new Object[1];
            f(bArr[1154], s4, s7, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            f(bArr[0], (short) 112, (short) 308, objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            f(bArr[1154], s4, s7, objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i10 = 0;
            while (i10 < objArr7.length) {
                Object[] objArr8 = new Object[1];
                objArr8[c10] = objArr7[i10];
                byte[] bArr2 = f40158e;
                short s9 = (short) 116;
                short s10 = (short) 296;
                Object[] objArr9 = new Object[1];
                f(bArr2[c11], s9, s10, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[c10]);
                Object[] objArr10 = new Object[1];
                f((byte) 74, (short) 132, (short) 306, objArr10);
                String str3 = (String) objArr10[0];
                Object[] objArr11 = new Object[1];
                f(bArr2[1154], s4, s7, objArr11);
                Object objInvoke = cls2.getMethod(str3, Class.forName((String) objArr11[0])).invoke(null, objArr8);
                Object[] objArr12 = new Object[1];
                f(bArr2[1154], s9, s10, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                Object[] objArr13 = new Object[1];
                f((byte) (bArr2[1154] - 1), (short) 138, (short) 305, objArr13);
                iArr[i10] = ((Integer) cls3.getMethod((String) objArr13[0], null).invoke(objInvoke, null)).intValue();
                i10++;
                c10 = 0;
                c11 = 1154;
            }
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                try {
                    switch (dhVar.c(iArr[i11])) {
                        case -23:
                            i11 = 54;
                            break;
                        case -22:
                            dhVar.c(21);
                            int i13 = dhVar.f41189e;
                            i11 = (i13 == 0 || i13 != 1) ? 1 : 39;
                            break;
                        case -21:
                            i11 = 49;
                            break;
                        case -20:
                            dhVar.c(21);
                            int i14 = dhVar.f41189e;
                            i11 = (i14 == 0 || i14 != 1) ? 24 : 11;
                            break;
                        case -19:
                            i11 = 55;
                            break;
                        case -18:
                            i11 = 57;
                            break;
                        case -17:
                            dhVar.c(31);
                            i11 = dhVar.f41189e == 0 ? 37 : i12;
                            break;
                        case -16:
                            dhVar.f41186b = 1;
                            dhVar.c(4);
                            dhVar.c(13);
                            f40156c = dhVar.f41189e;
                            break;
                        case -15:
                            dhVar.f41186b = f40154a;
                            dhVar.c(10);
                            break;
                        case -14:
                            dhVar.f41186b = 1;
                            dhVar.c(4);
                            dhVar.c(6);
                            dhVar.f41186b = dhVar.f41192h.hashCode();
                            dhVar.c(10);
                            break;
                        case -13:
                            dhVar.c(16);
                            throw ((Throwable) dhVar.f41192h);
                        case -12:
                            i11 = 50;
                            break;
                        case -11:
                            i11 = 52;
                            break;
                        case -10:
                            dhVar.c(15);
                            if (dhVar.f41189e == 0) {
                                i11 = 22;
                            }
                            break;
                        case -9:
                            dhVar.f41186b = 1;
                            dhVar.c(4);
                            dhVar.c(13);
                            f40154a = dhVar.f41189e;
                            break;
                        case -8:
                            try {
                                dhVar.f41186b = f40156c;
                                dhVar.c(10);
                            } catch (Throwable th2) {
                                th = th2;
                                if (i12 < 25 && i12 <= 29) {
                                    i12 = 23;
                                } else {
                                    if (i12 >= 47 || i12 > 49) {
                                        throw th;
                                    }
                                    i12 = 38;
                                }
                                dhVar.f41193i = th;
                                dhVar.c(24);
                            }
                            break;
                        case -7:
                            return;
                        case -6:
                            i11 = 29;
                            break;
                        case -5:
                            i11 = 13;
                            break;
                        case -4:
                            obj = null;
                            dhVar.f41186b = 3;
                            dhVar.c(4);
                            dhVar.c(5);
                            long j11 = dhVar.f41185a;
                            dhVar.c(6);
                            String str4 = (String) dhVar.f41192h;
                            dhVar.c(6);
                            c(j11, str4, (String) dhVar.f41192h);
                            break;
                        case -3:
                            try {
                                dhVar.f41186b = 1;
                                dhVar.c(4);
                                dhVar.c(6);
                                Object obj2 = dhVar.f41192h;
                                try {
                                    try {
                                        Object[] objArr14 = new Object[1];
                                        f(f40158e[1154], (short) 453, (short) 289, objArr14);
                                        try {
                                            Class<?> cls4 = Class.forName((String) objArr14[0]);
                                            Object[] objArr15 = new Object[1];
                                            f((byte) 59, (short) 476, (short) 306, objArr15);
                                            try {
                                                obj = null;
                                                try {
                                                    try {
                                                        dhVar.f41193i = cls4.getMethod((String) objArr15[0], null).invoke(obj2, null);
                                                        dhVar.c(36);
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        if (i12 < 25) {
                                                            if (i12 >= 47) {
                                                            }
                                                            throw th;
                                                        }
                                                        if (i12 >= 47) {
                                                        }
                                                        throw th;
                                                        dhVar.f41193i = th;
                                                        dhVar.c(24);
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    cause = th.getCause();
                                                    if (cause == null) {
                                                        throw th;
                                                    }
                                                    throw cause;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                cause = th.getCause();
                                                if (cause == null) {
                                                    throw th;
                                                }
                                                throw cause;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        cause = th.getCause();
                                        if (cause == null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                            }
                            break;
                        case -2:
                            dhVar.f41186b = 1;
                            dhVar.c(4);
                            dhVar.c(6);
                            dhVar.f41193i = c((Method) dhVar.f41192h);
                            dhVar.c(36);
                            break;
                        case -1:
                            i11 = 8;
                            break;
                        default:
                            break;
                    }
                } catch (Throwable th10) {
                    th = th10;
                }
            }
        } catch (Throwable th11) {
            Throwable cause2 = th11.getCause();
            if (cause2 == null) {
                throw th11;
            }
            throw cause2;
        }
    }

    public static void d(Class<ch> cls, Class<dr> cls2) {
        d(new Object[]{cls, cls2}, 1000236723, -1000236723, (int) System.currentTimeMillis());
    }
}
