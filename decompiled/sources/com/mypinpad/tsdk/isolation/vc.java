package com.mypinpad.tsdk.isolation;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mypinpad.tsdk.api.errors.TerminalException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nStringExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringExtensions.kt\ncom/mypinpad/tsdk/internal/utils/extensions/StringExtensionsKt\n+ 2 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n+ 3 HexEncoding.kt\ncom/mypinpad/common/bytes/encoding/hex/HexEncodingKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,43:1\n7#2,8:44\n7#2,8:95\n13#3,6:52\n30#3,34:58\n19#3,3:92\n1064#4,2:103\n*S KotlinDebug\n*F\n+ 1 StringExtensions.kt\ncom/mypinpad/tsdk/internal/utils/extensions/StringExtensionsKt\n*L\n10#1:44,8\n18#1:95,8\n16#1:52,6\n16#1:58,34\n16#1:92,3\n38#1:103,2\n*E\n"})
public final class vc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f61531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f61532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f61533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f61534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f61535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f61536f = null;

    static {
        c();
        f61534d = 0;
        f61535e = 1;
        f61532b = 0;
        f61533c = 1;
        f61531a = new char[]{59089, 58909, 58909, 58902, 59270, 59312, 59327, 59325, 59313, 59287, 59292, 59326, 59326, 59302, 59322, 59320, 59326, 59324, 59324, 59324, 59300, 59268};
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0178 A[PHI: r10
      0x0178: PHI (r10v3 char) = (r10v2 char), (r10v24 char) binds: [B:39:0x0176, B:36:0x0170] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x0198  */
    /* JADX WARN: Code duplicated, block: B:44:0x0199 A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:11:0x0049, B:15:0x00ab, B:14:0x0064, B:20:0x00d2, B:24:0x012a, B:23:0x00eb, B:48:0x01f9, B:52:0x0259, B:55:0x0276, B:59:0x02d2, B:58:0x028e, B:51:0x0219, B:41:0x017a, B:45:0x01e4, B:44:0x0199), top: B:84:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:50:0x0218  */
    /* JADX WARN: Code duplicated, block: B:51:0x0219 A[Catch: all -> 0x00c6, TryCatch #0 {all -> 0x00c6, blocks: (B:11:0x0049, B:15:0x00ab, B:14:0x0064, B:20:0x00d2, B:24:0x012a, B:23:0x00eb, B:48:0x01f9, B:52:0x0259, B:55:0x0276, B:59:0x02d2, B:58:0x028e, B:51:0x0219, B:41:0x017a, B:45:0x01e4, B:44:0x0199), top: B:84:0x0049 }] */
    public static void a(String str, boolean z10, int[] iArr, Object[] objArr) throws Throwable {
        int i10;
        int i11;
        int i12;
        char c10;
        Map map;
        Object method;
        int i13;
        Map map2;
        Object method2;
        int i14 = f61534d + 91;
        f61535e = i14 % 128;
        int i15 = 2;
        if (i14 % 2 == 0) {
            throw null;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        setNavigationOnClickListener setnavigationonclicklistener = new setNavigationOnClickListener();
        int i16 = 0;
        int i17 = iArr[0];
        int i18 = 1;
        int i19 = iArr[1];
        int i20 = iArr[2];
        int i21 = iArr[3];
        char[] cArr = f61531a;
        if (cArr != null) {
            int i22 = f61534d + 21;
            f61535e = i22 % 128;
            int i23 = i22 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i24 = 0;
            while (i24 < length) {
                int i25 = f61535e + 105;
                f61534d = i25 % 128;
                if (i25 % i15 != 0) {
                    try {
                        Object[] objArr2 = new Object[i18];
                        objArr2[i16] = Integer.valueOf(cArr[i24]);
                        Map map3 = setTextScaleX.setMaxEms;
                        Object method3 = map3.get(-637734149);
                        if (method3 == null) {
                            Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 37 - View.resolveSize(i16, i16), TextUtils.getTrimmedLength("") + TypedValues.MotionType.TYPE_POLAR_RELATIVETO);
                            byte b10 = (byte) (-1);
                            byte b11 = (byte) (-b10);
                            Object[] objArr3 = new Object[1];
                            b(b10, b11, (byte) (b11 - 1), objArr3);
                            method3 = cls.getMethod((String) objArr3[0], Integer.TYPE);
                            map3.put(-637734149, method3);
                        }
                        cArr2[i24] = ((Character) ((Method) method3).invoke(null, objArr2)).charValue();
                        length = length;
                        i20 = i20;
                        i21 = i21;
                        i15 = 2;
                        i16 = 0;
                        i18 = 1;
                        i24 = 0;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    int i26 = i20;
                    int i27 = i21;
                    int i28 = length;
                    Object[] objArr4 = {Integer.valueOf(cArr[i24])};
                    Map map4 = setTextScaleX.setMaxEms;
                    Object method4 = map4.get(-637734149);
                    if (method4 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) Drawable.resolveOpacity(0, 0), Drawable.resolveOpacity(0, 0) + 37, (Process.myTid() >> 22) + TypedValues.MotionType.TYPE_POLAR_RELATIVETO);
                        byte b12 = (byte) (-1);
                        byte b13 = (byte) (-b12);
                        Object[] objArr5 = new Object[1];
                        b(b12, b13, (byte) (b13 - 1), objArr5);
                        method4 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                        map4.put(-637734149, method4);
                    }
                    cArr2[i24] = ((Character) ((Method) method4).invoke(null, objArr4)).charValue();
                    i24++;
                    length = i28;
                    i20 = i26;
                    i21 = i27;
                    i15 = 2;
                    i16 = 0;
                    i18 = 1;
                }
            }
            i10 = i20;
            i11 = i21;
            cArr = cArr2;
        } else {
            i10 = i20;
            i11 = i21;
        }
        char[] cArr3 = new char[i19];
        System.arraycopy(cArr, i17, cArr3, 0, i19);
        if (bytes != null) {
            char[] cArr4 = new char[i19];
            setnavigationonclicklistener.setX = 0;
            char c11 = 0;
            while (true) {
                int i29 = setnavigationonclicklistener.setX;
                if (i29 >= i19) {
                    break;
                }
                int i30 = f61534d + 123;
                f61535e = i30 % 128;
                if (i30 % 2 == 0) {
                    c10 = 1;
                    if (bytes[i29] == 1) {
                        char c12 = cArr3[i29];
                        Object[] objArr6 = new Object[2];
                        objArr6[c10] = Integer.valueOf(c11);
                        objArr6[0] = Integer.valueOf(c12);
                        map = setTextScaleX.setMaxEms;
                        method = map.get(1737824323);
                        if (method != null) {
                            Class cls3 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 4448), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 41, 1021 - KeyEvent.normalizeMetaState(0));
                            byte length2 = (byte) f61536f.length;
                            Object[] objArr7 = new Object[1];
                            b((byte) (-1), length2, (byte) (length2 - 4), objArr7);
                            String str2 = (String) objArr7[0];
                            Class<?> cls4 = Integer.TYPE;
                            method = cls3.getMethod(str2, cls4, cls4);
                            map.put(1737824323, method);
                        }
                        cArr4[i29] = ((Character) ((Method) method).invoke(null, objArr6)).charValue();
                        i13 = 2;
                    } else {
                        Object[] objArr8 = {Integer.valueOf(cArr3[i29]), Integer.valueOf(c11)};
                        map2 = setTextScaleX.setMaxEms;
                        method2 = map2.get(-504758789);
                        if (method2 != null) {
                            Class cls5 = (Class) setTextScaleX.setX((char) View.MeasureSpec.getMode(0), KeyEvent.normalizeMetaState(0) + 45, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2627);
                            byte b14 = (byte) (-1);
                            byte b15 = (byte) (b14 + 1);
                            Object[] objArr9 = new Object[1];
                            b(b14, b15, b15, objArr9);
                            String str3 = (String) objArr9[0];
                            Class<?> cls6 = Integer.TYPE;
                            method2 = cls5.getMethod(str3, cls6, cls6);
                            map2.put(-504758789, method2);
                        }
                        cArr4[i29] = ((Character) ((Method) method2).invoke(null, objArr8)).charValue();
                        int i31 = f61535e + 93;
                        f61534d = i31 % 128;
                        i13 = 2;
                        int i32 = i31 % 2;
                    }
                } else {
                    c10 = 1;
                    if (bytes[i29] == 1) {
                        char c13 = cArr3[i29];
                        Object[] objArr10 = new Object[2];
                        objArr10[c10] = Integer.valueOf(c11);
                        objArr10[0] = Integer.valueOf(c13);
                        map = setTextScaleX.setMaxEms;
                        method = map.get(1737824323);
                        if (method != null) {
                            Class cls7 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 4448), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 41, 1021 - KeyEvent.normalizeMetaState(0));
                            byte length3 = (byte) f61536f.length;
                            Object[] objArr11 = new Object[1];
                            b((byte) (-1), length3, (byte) (length3 - 4), objArr11);
                            String str4 = (String) objArr11[0];
                            Class<?> cls8 = Integer.TYPE;
                            method = cls7.getMethod(str4, cls8, cls8);
                            map.put(1737824323, method);
                        }
                        cArr4[i29] = ((Character) ((Method) method).invoke(null, objArr10)).charValue();
                        i13 = 2;
                    } else {
                        Object[] objArr12 = {Integer.valueOf(cArr3[i29]), Integer.valueOf(c11)};
                        map2 = setTextScaleX.setMaxEms;
                        method2 = map2.get(-504758789);
                        if (method2 != null) {
                            Class cls9 = (Class) setTextScaleX.setX((char) View.MeasureSpec.getMode(0), KeyEvent.normalizeMetaState(0) + 45, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2627);
                            byte b16 = (byte) (-1);
                            byte b17 = (byte) (b16 + 1);
                            Object[] objArr13 = new Object[1];
                            b(b16, b17, b17, objArr13);
                            String str5 = (String) objArr13[0];
                            Class<?> cls10 = Integer.TYPE;
                            method2 = cls9.getMethod(str5, cls10, cls10);
                            map2.put(-504758789, method2);
                        }
                        cArr4[i29] = ((Character) ((Method) method2).invoke(null, objArr12)).charValue();
                        int i33 = f61535e + 93;
                        f61534d = i33 % 128;
                        i13 = 2;
                        int i34 = i33 % 2;
                    }
                }
                c11 = cArr4[setnavigationonclicklistener.setX];
                Object[] objArr14 = new Object[i13];
                objArr14[1] = setnavigationonclicklistener;
                objArr14[0] = setnavigationonclicklistener;
                Map map5 = setTextScaleX.setMaxEms;
                Object method5 = map5.get(-265085633);
                if (method5 == null) {
                    Class cls11 = (Class) setTextScaleX.setX((char) (31346 - ((byte) KeyEvent.getModifierMetaStateMask())), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 48, 840 - (ViewConfiguration.getLongPressTimeout() >> 16));
                    byte b18 = (byte) (-1);
                    byte b19 = (byte) (b18 + 4);
                    Object[] objArr15 = new Object[1];
                    b(b18, b19, (byte) (b19 - 3), objArr15);
                    method5 = cls11.getMethod((String) objArr15[0], Object.class, Object.class);
                    map5.put(-265085633, method5);
                }
                ((Method) method5).invoke(null, objArr14);
            }
            cArr3 = cArr4;
        }
        if (i11 > 0) {
            char[] cArr5 = new char[i19];
            i12 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i19);
            int i35 = i19 - i11;
            int i36 = i11;
            System.arraycopy(cArr5, 0, cArr3, i35, i36);
            System.arraycopy(cArr5, i36, cArr3, 0, i35);
        } else {
            i12 = 0;
        }
        if (z10) {
            char[] cArr6 = new char[i19];
            while (true) {
                setnavigationonclicklistener.setX = i12;
                int i37 = setnavigationonclicklistener.setX;
                if (i37 >= i19) {
                    break;
                }
                cArr6[i37] = cArr3[(i19 - i37) - 1];
                i12 = i37 + 1;
            }
            cArr3 = cArr6;
        }
        if (i10 > 0) {
            setnavigationonclicklistener.setX = 0;
            int i38 = f61534d + 83;
            f61535e = i38 % 128;
            int i39 = i38 % 2;
            while (true) {
                int i40 = setnavigationonclicklistener.setX;
                if (i40 >= i19) {
                    break;
                }
                cArr3[i40] = (char) (cArr3[i40] - iArr[2]);
                setnavigationonclicklistener.setX = i40 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r0 = 1 - r8
            int r6 = r6 + 4
            int r7 = r7 + 97
            byte[] r0 = new byte[r0]
            r1 = 0
            int r8 = 0 - r8
            byte[] r2 = com.mypinpad.tsdk.isolation.vc.f61536f
            if (r2 != 0) goto L18
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r6
            goto L37
        L18:
            r3 = r1
            r5 = r7
            r7 = r6
            r6 = r5
        L1c:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L29:
            int r3 = r3 + 1
            int r7 = r7 + 1
            r4 = r2[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r5
        L37:
            int r7 = -r7
            int r6 = r6 + r7
            r7 = r8
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.vc.b(int, short, int, java.lang.Object[]):void");
    }

    public static void c() {
        f61536f = new byte[]{85, 2, -89, 93};
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00fc  */
    @NotNull
    public static final byte[] setOnFocusChangeListener(@NotNull String str) {
        Object objM5535constructorimpl;
        byte b10;
        int i10;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Companion companion = Result.INSTANCE;
            String strReplace = setNetworkAvailable.setY().replace(str, "");
            if (strReplace.length() % 2 != 0) {
                Object[] objArr = new Object[1];
                a("\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000", false, new int[]{3, 19, 192, 0}, objArr);
                throw new IllegalArgumentException(((String) objArr[0]).intern().toString());
            }
            byte[] bArr = new byte[strReplace.length() / 2];
            for (int i11 = 0; i11 < strReplace.length(); i11 += 2) {
                int i12 = i11 / 2;
                Pair pair = TuplesKt.to(Character.valueOf(strReplace.charAt(i11)), Character.valueOf(strReplace.charAt(i11 + 1)));
                char cCharValue = ((Character) pair.getFirst()).charValue();
                if (cCharValue == '0') {
                    b10 = 0;
                } else if (cCharValue == '1') {
                    b10 = 1;
                } else if (cCharValue == '2') {
                    b10 = 2;
                } else if (cCharValue == '3') {
                    b10 = 3;
                } else if (cCharValue == '4') {
                    b10 = 4;
                } else if (cCharValue == '5') {
                    b10 = 5;
                } else if (cCharValue == '6') {
                    b10 = 6;
                } else if (cCharValue == '7') {
                    int i13 = f61532b + 55;
                    f61533c = i13 % 128;
                    int i14 = i13 % 2;
                    b10 = 7;
                } else if (cCharValue == '8') {
                    b10 = 8;
                } else if (cCharValue == '9') {
                    b10 = 9;
                } else if (cCharValue == 'a' || cCharValue == 'A') {
                    b10 = 10;
                } else if (cCharValue == 'b') {
                    int i15 = f61533c + 73;
                    f61532b = i15 % 128;
                    b10 = i15 % 2 != 0 ? (byte) 91 : (byte) 11;
                } else if (cCharValue == 'B') {
                    int i16 = f61532b + 71;
                    f61533c = i16 % 128;
                    int i17 = i16 % 2;
                } else if (cCharValue == 'c' || cCharValue == 'C') {
                    b10 = 12;
                } else if (cCharValue == 'd' || cCharValue == 'D') {
                    b10 = 13;
                } else if (cCharValue == 'e' || cCharValue == 'E') {
                    b10 = 14;
                } else if (cCharValue == 'f') {
                    b10 = 15;
                } else {
                    if (cCharValue != 'F') {
                        throw new IllegalArgumentException(String.valueOf(cCharValue));
                    }
                    int i18 = f61532b + 31;
                    f61533c = i18 % 128;
                    if (i18 % 2 == 0) {
                        b10 = 67;
                    } else {
                        b10 = 15;
                    }
                }
                int iM5570constructorimpl = UInt.m5570constructorimpl(UInt.m5570constructorimpl(UByte.m5545constructorimpl(b10) & 255) * UInt.m5570constructorimpl(UByte.m5545constructorimpl((byte) 16) & 255));
                char cCharValue2 = ((Character) pair.getSecond()).charValue();
                if (cCharValue2 == '0') {
                    int i19 = f61533c + 15;
                    f61532b = i19 % 128;
                    int i20 = i19 % 2;
                    i10 = 0;
                } else if (cCharValue2 == '1') {
                    i10 = 1;
                } else if (cCharValue2 == '2') {
                    i10 = 2;
                } else {
                    if (cCharValue2 == '3') {
                        int i21 = f61533c + 125;
                        f61532b = i21 % 128;
                        int i22 = i21 % 2;
                    } else if (cCharValue2 == '4') {
                        i10 = 4;
                    } else if (cCharValue2 == '5') {
                        int i23 = f61532b + 121;
                        f61533c = i23 % 128;
                        if (i23 % 2 != 0) {
                            i10 = 5;
                        }
                    } else if (cCharValue2 == '6') {
                        i10 = 6;
                    } else if (cCharValue2 == '7') {
                        i10 = 7;
                    } else if (cCharValue2 == '8') {
                        int i24 = f61532b + 51;
                        f61533c = i24 % 128;
                        i10 = i24 % 2 == 0 ? 80 : 8;
                    } else if (cCharValue2 == '9') {
                        i10 = 9;
                    } else if (cCharValue2 == 'a' || cCharValue2 == 'A') {
                        i10 = 10;
                    } else if (cCharValue2 == 'b' || cCharValue2 == 'B') {
                        i10 = 11;
                    } else if (cCharValue2 == 'c' || cCharValue2 == 'C') {
                        i10 = 12;
                    } else if (cCharValue2 == 'd' || cCharValue2 == 'D') {
                        i10 = 13;
                    } else if (cCharValue2 == 'e' || cCharValue2 == 'E') {
                        i10 = 14;
                    } else {
                        if (cCharValue2 != 'f') {
                            if (cCharValue2 != 'F') {
                                throw new IllegalArgumentException(String.valueOf(cCharValue2));
                            }
                            int i25 = f61532b + 117;
                            f61533c = i25 % 128;
                            int i26 = i25 % 2;
                        }
                        i10 = 15;
                    }
                    i10 = 3;
                }
                bArr[i12] = (byte) UInt.m5570constructorimpl(iM5570constructorimpl + UInt.m5570constructorimpl(i10));
            }
            objM5535constructorimpl = Result.m5535constructorimpl(bArr);
            Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
            if (thM5538exceptionOrNullimpl != null) {
                try {
                    TerminalException terminalException = new TerminalException(10019, thM5538exceptionOrNullimpl.getMessage(), null);
                    mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
                    throw terminalException;
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
                }
            }
            ResultKt.throwOnFailure(objM5535constructorimpl);
            byte[] bArr2 = (byte[]) objM5535constructorimpl;
            int i27 = f61533c + 39;
            f61532b = i27 % 128;
            if (i27 % 2 == 0) {
                return bArr2;
            }
            throw null;
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th3));
        }
    }

    @NotNull
    public static final byte[] setX(@NotNull String str) throws TerminalException {
        int i10 = f61533c + 91;
        f61532b = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        byte[] onFocusChangeListener = setScrollIndicators.setOnFocusChangeListener(str);
        if (onFocusChangeListener != null) {
            int i12 = f61533c + 77;
            f61532b = i12 % 128;
            int i13 = i12 % 2;
            return onFocusChangeListener;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(StringsKt___StringsKt.take(str, 5));
        Object[] objArr = new Object[1];
        a("\u0000\u0000\u0000", true, new int[]{0, 3, 90, 0}, objArr);
        sb2.append(((String) objArr[0]).intern());
        TerminalException terminalException = new TerminalException(10038, sb2.toString(), null);
        mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
        throw terminalException;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a9  */
    public static final boolean setY(@NotNull String str) {
        boolean z10;
        Intrinsics.checkNotNullParameter(str, "");
        List<String> listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new char[]{'-'}, false, 6, 2, (Object) null);
        if (listSplit$default.size() != 5) {
            int i10 = f61532b + 25;
            f61533c = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (((String) listSplit$default.get(0)).length() != 8) {
            int i12 = f61532b + 71;
            f61533c = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (((String) listSplit$default.get(1)).length() != 4 || ((String) listSplit$default.get(2)).length() != 4 || ((String) listSplit$default.get(3)).length() != 4 || ((String) listSplit$default.get(4)).length() != 12) {
            return false;
        }
        for (String str2 : listSplit$default) {
            for (int i14 = 0; i14 < str2.length(); i14++) {
                char cCharAt = str2.charAt(i14);
                char lowerCase = Character.toLowerCase(cCharAt);
                if ('a' <= lowerCase) {
                    int i15 = f61532b + 97;
                    f61533c = i15 % 128;
                    int i16 = i15 % 2;
                    if (lowerCase < 'g') {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if ('0' <= cCharAt) {
                        int i17 = f61533c + 91;
                        f61532b = i17 % 128;
                        int i18 = i17 % 2;
                        if (cCharAt < ':') {
                        }
                    } else {
                        int i19 = f61533c + 55;
                        f61532b = i19 % 128;
                        int i20 = i19 % 2;
                    }
                    int i21 = f61533c + 45;
                    f61532b = i21 % 128;
                    int i22 = i21 % 2;
                    return false;
                }
            }
        }
        return true;
    }
}
