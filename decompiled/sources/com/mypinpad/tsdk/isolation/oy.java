package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.activity.a;
import androidx.camera.camera2.internal.n1;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class oy extends pf {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final char[] f57592n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final char f57593o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f57594p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f57595q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f57596r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f57597s = null;
    public final int m;

    static {
        b();
        f57595q = 0;
        f57596r = 1;
        f57594p = 1;
        f57593o = (char) 53956;
        f57592n = new char[]{59179, 59170, 59189, 59243, 59160, 59188, 59181, 59151, 59190, 59187, 59198, 59152, 59192, 59253, 59254, 59193, 59144, 59183, 59166, 59167, 59194, 59184, 59242, 59191, 59186};
    }

    public oy(int i10) throws Throwable {
        int i11;
        int length;
        char[] cArr;
        int i12 = 0;
        int iArgb = Color.argb(0, 0, 0, 0);
        int i13 = iArgb + 38;
        char gidForName = (byte) (47 - Process.getGidForName(""));
        char[] charArray = "\u000f\u000e\t\u0015\r\u000b\u0000\t\u0005\u0003\u0016\u000f\u0014\u0013\u0014\u0018\u0016\u0013\u0002\u0000\u0005\u000e\u000b\u0016\u0010\b\f\u0000\u0013\f\u0006\u0011\u0010\u000e\f\u0018\u0012\b".toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        int i14 = 1;
        int i15 = 290255894;
        char[] cArr2 = f57592n;
        if (cArr2 != null) {
            int i16 = f57596r + 113;
            f57595q = i16 % 128;
            if (i16 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i17 = 0;
            while (i17 < length) {
                try {
                    Object[] objArr = new Object[i14];
                    objArr[i12] = Integer.valueOf(cArr2[i17]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(Integer.valueOf(i15));
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), Color.blue(i12) + 45, TextUtils.lastIndexOf("", '0', i12) + 1117);
                        byte b10 = (byte) i12;
                        byte b11 = b10;
                        Object[] objArr2 = new Object[1];
                        c(b11, b10, (byte) (b11 | 7), objArr2);
                        method = cls.getMethod((String) objArr2[0], Integer.TYPE);
                        map.put(290255894, method);
                    }
                    cArr[i17] = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                    i17++;
                    cArr2 = cArr2;
                    length = length;
                    i12 = 0;
                    i14 = 1;
                    i15 = 290255894;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i18 = f57595q + 29;
            f57596r = i18 % 128;
            int i19 = i18 % 2;
            cArr2 = cArr;
        }
        Object[] objArr3 = {Integer.valueOf(f57593o)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(290255894);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) TextUtils.indexOf("", "", 0), 44 - Process.getGidForName(""), (Process.myPid() >> 22) + 1116);
            byte b12 = (byte) 0;
            byte b13 = b12;
            Object[] objArr4 = new Object[1];
            c(b13, b12, (byte) (b13 | 7), objArr4);
            method2 = cls2.getMethod((String) objArr4[0], Integer.TYPE);
            map2.put(290255894, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr3)).charValue();
        char[] cArr3 = new char[i13];
        if (i13 % 2 != 0) {
            i11 = iArgb + 37;
            cArr3[i11] = (char) (charArray[i11] - gidForName);
        } else {
            i11 = i13;
        }
        if (i11 > 1) {
            setincludefontpadding.setDividerPadding = 0;
            while (true) {
                int i20 = setincludefontpadding.setDividerPadding;
                if (i20 >= i11) {
                    break;
                }
                char c10 = charArray[i20];
                setincludefontpadding.setY = c10;
                int i21 = i20 + 1;
                char c11 = charArray[i21];
                setincludefontpadding.setCompoundDrawableTintBlendMode = c11;
                if (c10 == c11) {
                    int i22 = f57595q + 83;
                    f57596r = i22 % 128;
                    int i23 = i22 % 2;
                    cArr3[i20] = (char) (c10 - gidForName);
                    cArr3[i21] = (char) (c11 - gidForName);
                } else {
                    Object[] objArr5 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(180437302);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) KeyEvent.getDeadChar(0, 0), 27 - Color.red(0), (KeyEvent.getMaxKeyCode() >> 16) + 2311);
                        byte b14 = (byte) 0;
                        Object[] objArr6 = new Object[1];
                        c(b14, b14, (byte) f57597s.length, objArr6);
                        String str = (String) objArr6[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(180437302, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr5)).intValue();
                    int i24 = setincludefontpadding.setNavigationOnClickListener;
                    if (iIntValue == i24) {
                        int i25 = f57595q + 119;
                        f57596r = i25 % 128;
                        int i26 = i25 % 2;
                        Object[] objArr7 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Object method4 = map3.get(1989802713);
                        if (method4 == null) {
                            Class cls5 = (Class) setTextScaleX.setX((char) (49104 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 35 - KeyEvent.getDeadChar(0, 0), 2545 - Color.argb(0, 0, 0, 0));
                            byte b15 = (byte) 0;
                            byte b16 = b15;
                            Object[] objArr8 = new Object[1];
                            c(b16, b15, b16, objArr8);
                            String str2 = (String) objArr8[0];
                            Class<?> cls6 = Integer.TYPE;
                            method4 = cls5.getMethod(str2, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(1989802713, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr7)).intValue();
                        int i27 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                        int i28 = setincludefontpadding.setDividerPadding;
                        cArr3[i28] = cArr2[iIntValue2];
                        cArr3[i28 + 1] = cArr2[i27];
                    } else {
                        int i29 = setincludefontpadding.setX;
                        int i30 = setincludefontpadding.setOnFocusChangeListener;
                        if (i29 == i30) {
                            int iA = a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                            setincludefontpadding.setOnLongClickListener = iA;
                            int iA2 = a.a(i24, cCharValue, 1, cCharValue);
                            setincludefontpadding.setNavigationOnClickListener = iA2;
                            int i31 = (i30 * cCharValue) + iA2;
                            int i32 = setincludefontpadding.setDividerPadding;
                            cArr3[i32] = cArr2[(i29 * cCharValue) + iA];
                            cArr3[i32 + 1] = cArr2[i31];
                        } else {
                            int i33 = (i29 * cCharValue) + i24;
                            int i34 = (i30 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                            int i35 = setincludefontpadding.setDividerPadding;
                            cArr3[i35] = cArr2[i33];
                            cArr3[i35 + 1] = cArr2[i34];
                        }
                    }
                }
                setincludefontpadding.setDividerPadding += 2;
            }
        }
        for (int i36 = 0; i36 < i13; i36++) {
            int i37 = f57595q + 1;
            f57596r = i37 % 128;
            int i38 = i37 % 2;
            cArr3[i36] = (char) (cArr3[i36] ^ 13722);
        }
        super(null, n1.f(cArr3), null, 0L, 13, null);
        this.m = i10;
    }

    public static void b() {
        f57597s = new byte[]{Constants.RESP_MSG_TEMPLATE_FORMAT_2, 86, 126, 91};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 106 - r8
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r7 = r7 * 2
            int r7 = r7 + 1
            byte[] r0 = new byte[r7]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.oy.f57597s
            if (r2 != 0) goto L19
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            goto L34
        L19:
            r3 = r1
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L29:
            r4 = r2[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L34:
            int r6 = -r6
            int r6 = r6 + r9
            int r7 = r7 + 1
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.oy.c(byte, short, short, java.lang.Object[]):void");
    }

    public final int setX() {
        int i10 = f57594p + 107;
        int i11 = i10 % 128;
        int i12 = i10 % 2;
        int i13 = i11 + 61;
        f57594p = i13 % 128;
        int i14 = i13 % 2;
        return this.m;
    }
}
