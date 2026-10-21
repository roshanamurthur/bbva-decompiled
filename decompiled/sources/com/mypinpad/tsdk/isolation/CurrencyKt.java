package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.security.keystore.KeyGenParameterSpec;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.a;
import java.lang.reflect.Method;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.Certificate;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0001¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/mypinpad/tsdk/i/CurrencyKt;", "", "", "p0", "", "setDividerPadding", "([B)V", "", "setY", "()Z", "", "Ljava/security/cert/Certificate;", "setX", "()[Ljava/security/cert/Certificate;", "setOnFocusChangeListener", "([B)[B", "<init>", "()V", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 5, 1})
public final class CurrencyKt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f51752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f51753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static char f51754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static char[] f51755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static char f51756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f51757h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f51758i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f51759j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f51760k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f51761l = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KeyStore f51762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f51763b;

    static {
        d();
        f51759j = 0;
        f51760k = 1;
        f51757h = 0;
        f51758i = 1;
        e();
        ViewConfiguration.getKeyRepeatDelay();
        MotionEvent.axisFromString("");
        Color.argb(0, 0, 0, 0);
        Color.argb(0, 0, 0, 0);
        KeyEvent.getModifierMetaStateMask();
        ViewConfiguration.getTapTimeout();
        INSTANCE = new Companion(null);
        int i10 = f51758i + 89;
        f51757h = i10 % 128;
        int i11 = i10 % 2;
    }

    public CurrencyKt() throws Throwable {
        Object[] objArr = new Object[1];
        a((char) (17558 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), "↣㖺镅䑄", 1161148961 - TextUtils.getCapsMode("", 0, 0), "⍴뗕\udede퉴﮴썣毙堖닾䀸쯁첫ᾉᏃ\uf071", objArr);
        KeyStore keyStore = KeyStore.getInstance(((String) objArr[0]).intern());
        Intrinsics.checkNotNullExpressionValue(keyStore, "");
        this.f51762a = keyStore;
        Object[] objArr2 = new Object[1];
        b(TextUtils.getCapsMode("", 0, 0) + 5, "\u0006\u0007\u0006\n㘹", (byte) (TextUtils.getOffsetBefore("", 0) + 96), objArr2);
        this.f51763b = ((String) objArr2[0]).intern();
        keyStore.load(null);
    }

    public static void a(char c10, String str, int i10, String str2, Object[] objArr) throws Throwable {
        int i11 = f51760k + 41;
        f51759j = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        char[] charArray = str2.toCharArray();
        char[] charArray2 = "\u0000\u0000\u0000\u0000".toCharArray();
        int i12 = f51760k + 19;
        f51759j = i12 % 128;
        int i13 = i12 % 2;
        char[] charArray3 = str.toCharArray();
        UiMessageCallbackKtWhenMappings uiMessageCallbackKtWhenMappings = new UiMessageCallbackKtWhenMappings();
        int length = charArray3.length;
        char[] cArr = new char[length];
        int length2 = charArray2.length;
        char[] cArr2 = new char[length2];
        int i14 = 0;
        System.arraycopy(charArray3, 0, cArr, 0, length);
        System.arraycopy(charArray2, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c10);
        cArr2[2] = (char) (cArr2[2] + ((char) i10));
        int length3 = charArray.length;
        char[] cArr3 = new char[length3];
        uiMessageCallbackKtWhenMappings.setX = 0;
        while (uiMessageCallbackKtWhenMappings.setX < length3) {
            try {
                Object[] objArr2 = new Object[1];
                objArr2[i14] = uiMessageCallbackKtWhenMappings;
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(20564334);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (MotionEvent.axisFromString("") + 50679), ExpandableListView.getPackedPositionChild(0L) + 40, 1736 - TextUtils.indexOf((CharSequence) "", '0', i14));
                    byte b10 = (byte) i14;
                    byte b11 = (byte) (b10 - 1);
                    Object[] objArr3 = new Object[1];
                    c(b11, (byte) (b11 & 6), b10, objArr3);
                    String str3 = (String) objArr3[i14];
                    Class<?>[] clsArr = new Class[1];
                    clsArr[i14] = Object.class;
                    method = cls.getMethod(str3, clsArr);
                    map.put(20564334, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = new Object[1];
                objArr4[i14] = uiMessageCallbackKtWhenMappings;
                Object method2 = map.get(-68974155);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8125), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 36, ((byte) KeyEvent.getModifierMetaStateMask()) + 647);
                    byte b12 = (byte) i14;
                    byte b13 = (byte) (b12 - 1);
                    Object[] objArr5 = new Object[1];
                    c(b13, (byte) (b13 + 4), b12, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class);
                    map.put(-68974155, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                Object[] objArr6 = {uiMessageCallbackKtWhenMappings, Integer.valueOf(cArr[uiMessageCallbackKtWhenMappings.setX % 4] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method3 = map.get(-1108711559);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.getTrimmedLength("") + 49, 434 - View.combineMeasuredStates(0, 0));
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 - 1);
                    Object[] objArr7 = new Object[1];
                    c(b15, (byte) (b15 & 5), b14, objArr7);
                    String str4 = (String) objArr7[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str4, Object.class, cls4, cls4);
                    map.put(-1108711559, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                Object[] objArr8 = {Integer.valueOf(cArr[iIntValue2] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method4 = map.get(533021397);
                if (method4 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) (ExpandableListView.getPackedPositionChild(0L) + 4450), (ViewConfiguration.getPressedStateDuration() >> 16) + 42, 1021 - (ViewConfiguration.getLongPressTimeout() >> 16));
                    byte b16 = (byte) 0;
                    byte b17 = (byte) (b16 - 1);
                    Object[] objArr9 = new Object[1];
                    c(b17, (byte) (b17 + 1), b16, objArr9);
                    String str5 = (String) objArr9[0];
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str5, cls6, cls6);
                    map.put(533021397, method4);
                }
                cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr8)).charValue();
                char c11 = uiMessageCallbackKtWhenMappings.setDividerPadding;
                cArr[iIntValue2] = c11;
                int i15 = uiMessageCallbackKtWhenMappings.setX;
                cArr3[i15] = (char) (((((long) (c11 ^ charArray[i15])) ^ (f51752c ^ (-2443367703579691432L))) ^ ((long) ((int) (((long) f51753d) ^ (-2443367703579691432L))))) ^ ((long) ((char) (((long) f51754e) ^ (-2443367703579691432L)))));
                uiMessageCallbackKtWhenMappings.setX = i15 + 1;
                i14 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        String str6 = new String(cArr3);
        int i16 = f51760k + 39;
        f51759j = i16 % 128;
        int i17 = i16 % 2;
        objArr[0] = str6;
    }

    public static void b(int i10, String str, byte b10, Object[] objArr) throws Throwable {
        int i11;
        int length;
        char[] cArr;
        char[] charArray = str.toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr2 = f51755f;
        int i12 = 2;
        int i13 = 290255894;
        if (cArr2 != null) {
            int i14 = f51759j + 123;
            f51760k = i14 % 128;
            if (i14 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i15 = 0;
            while (i15 < length) {
                int i16 = f51759j + 55;
                f51760k = i16 % 128;
                if (i16 % i12 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i15])};
                        Map map = setTextScaleX.setMaxEms;
                        Object method = map.get(Integer.valueOf(i13));
                        if (method == null) {
                            Class cls = (Class) setTextScaleX.setX((char) (KeyEvent.getMaxKeyCode() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 46, 1116 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                            byte b11 = (byte) 0;
                            byte b12 = (byte) (b11 - 1);
                            Object[] objArr3 = new Object[1];
                            c(b12, (byte) (b12 & 20), b11, objArr3);
                            method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                            map.put(290255894, method);
                        }
                        cArr[i15] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        i15--;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr4 = {Integer.valueOf(cArr2[i15])};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method2 = map2.get(290255894);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 45 - TextUtils.getOffsetAfter("", 0), KeyEvent.normalizeMetaState(0) + 1116);
                        byte b13 = (byte) 0;
                        byte b14 = (byte) (b13 - 1);
                        Object[] objArr5 = new Object[1];
                        c(b14, (byte) (b14 & 20), b13, objArr5);
                        method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                        map2.put(290255894, method2);
                    }
                    cArr[i15] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i15++;
                }
                i12 = 2;
                i13 = 290255894;
            }
            cArr2 = cArr;
        }
        Object[] objArr6 = {Integer.valueOf(f51756g)};
        Map map3 = setTextScaleX.setMaxEms;
        Object method3 = map3.get(290255894);
        if (method3 == null) {
            Class cls3 = (Class) setTextScaleX.setX((char) View.resolveSize(0, 0), 45 - Gravity.getAbsoluteGravity(0, 0), 1116 - View.MeasureSpec.makeMeasureSpec(0, 0));
            byte b15 = (byte) 0;
            byte b16 = (byte) (b15 - 1);
            Object[] objArr7 = new Object[1];
            c(b16, (byte) (b16 & 20), b15, objArr7);
            method3 = cls3.getMethod((String) objArr7[0], Integer.TYPE);
            map3.put(290255894, method3);
        }
        char cCharValue = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
        char[] cArr3 = new char[i10];
        if (i10 % 2 != 0) {
            int i17 = f51760k + 97;
            f51759j = i17 % 128;
            if (i17 % 2 != 0) {
                i11 = i10 + 33;
                cArr3[i11] = (char) (charArray[i11] - b10);
            } else {
                i11 = i10 - 1;
                cArr3[i11] = (char) (charArray[i11] - b10);
            }
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            setincludefontpadding.setDividerPadding = 0;
            while (true) {
                int i18 = setincludefontpadding.setDividerPadding;
                if (i18 >= i11) {
                    break;
                }
                char c10 = charArray[i18];
                setincludefontpadding.setY = c10;
                int i19 = i18 + 1;
                char c11 = charArray[i19];
                setincludefontpadding.setCompoundDrawableTintBlendMode = c11;
                if (c10 == c11) {
                    cArr3[i18] = (char) (c10 - b10);
                    cArr3[i19] = (char) (c11 - b10);
                } else {
                    Object[] objArr8 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                    Map map4 = setTextScaleX.setMaxEms;
                    Object method4 = map4.get(180437302);
                    if (method4 == null) {
                        Class cls4 = (Class) setTextScaleX.setX((char) Drawable.resolveOpacity(0, 0), 28 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 2311 - (Process.myPid() >> 22));
                        byte b17 = (byte) 0;
                        byte b18 = (byte) (b17 - 1);
                        Object[] objArr9 = new Object[1];
                        c(b18, (byte) (b18 & 17), b17, objArr9);
                        String str2 = (String) objArr9[0];
                        Class<?> cls5 = Integer.TYPE;
                        method4 = cls4.getMethod(str2, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class);
                        map4.put(180437302, method4);
                    }
                    int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                    int i20 = setincludefontpadding.setNavigationOnClickListener;
                    if (iIntValue == i20) {
                        int i21 = f51760k + 15;
                        f51759j = i21 % 128;
                        int i22 = i21 % 2;
                        Object[] objArr10 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Object method5 = map4.get(1989802713);
                        if (method5 == null) {
                            Class cls6 = (Class) setTextScaleX.setX((char) (View.resolveSize(0, 0) + 49103), 35 - (Process.myTid() >> 22), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2545);
                            byte b19 = (byte) 0;
                            byte b20 = (byte) (b19 - 1);
                            Object[] objArr11 = new Object[1];
                            c(b20, (byte) (b20 & 13), b19, objArr11);
                            String str3 = (String) objArr11[0];
                            Class<?> cls7 = Integer.TYPE;
                            method5 = cls6.getMethod(str3, Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                            map4.put(1989802713, method5);
                        }
                        int iIntValue2 = ((Integer) ((Method) method5).invoke(null, objArr10)).intValue();
                        int i23 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                        int i24 = setincludefontpadding.setDividerPadding;
                        cArr3[i24] = cArr2[iIntValue2];
                        cArr3[i24 + 1] = cArr2[i23];
                    } else {
                        int i25 = setincludefontpadding.setX;
                        int i26 = setincludefontpadding.setOnFocusChangeListener;
                        if (i25 == i26) {
                            int iA = a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                            setincludefontpadding.setOnLongClickListener = iA;
                            int iA2 = a.a(i20, cCharValue, 1, cCharValue);
                            setincludefontpadding.setNavigationOnClickListener = iA2;
                            int i27 = (i26 * cCharValue) + iA2;
                            int i28 = setincludefontpadding.setDividerPadding;
                            cArr3[i28] = cArr2[(i25 * cCharValue) + iA];
                            cArr3[i28 + 1] = cArr2[i27];
                            int i29 = f51759j + 15;
                            f51760k = i29 % 128;
                            int i30 = i29 % 2;
                        } else {
                            int i31 = (i25 * cCharValue) + i20;
                            int i32 = (i26 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                            int i33 = setincludefontpadding.setDividerPadding;
                            cArr3[i33] = cArr2[i31];
                            cArr3[i33 + 1] = cArr2[i32];
                        }
                    }
                }
                setincludefontpadding.setDividerPadding += 2;
            }
        }
        for (int i34 = 0; i34 < i10; i34++) {
            cArr3[i34] = (char) (cArr3[i34] ^ 13722);
        }
        String str4 = new String(cArr3);
        int i35 = f51760k + 103;
        f51759j = i35 % 128;
        if (i35 % 2 != 0) {
            throw null;
        }
        objArr[0] = str4;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = 119 - r8
            int r7 = r7 + 4
            int r9 = r9 * 4
            int r9 = r9 + 1
            byte[] r0 = new byte[r9]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.CurrencyKt.f51761l
            if (r2 != 0) goto L13
            r3 = r8
            r5 = r1
            r8 = r7
            goto L2a
        L13:
            r3 = r1
        L14:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r0[r3] = r4
            int r7 = r7 + 1
            if (r5 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r1)
            r10[r1] = r7
            return
        L25:
            r3 = r2[r7]
            r6 = r8
            r8 = r7
            r7 = r6
        L2a:
            int r7 = r7 + r3
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.CurrencyKt.c(int, int, short, java.lang.Object[]):void");
    }

    public static void d() {
        f51761l = new byte[]{72, 66, 70, -36};
    }

    public static void e() {
        f51754e = (char) 32112;
        f51752c = -2443367703579691432L;
        f51753d = -461867432;
        f51756g = (char) 53957;
        f51755f = new char[]{53956, 59247, 59152, 59240, 53955, 59158, 59162, 59254, 59235, 59144, 59160, 53957, 53954, 53959, 59155, 53952};
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws setOutlineAmbientShadowColor {
        CurrencyKt currencyKt = (CurrencyKt) objArr[0];
        int i13 = f51757h + 55;
        f51758i = i13 % 128;
        int i14 = i13 % 2;
        try {
            boolean zContainsAlias = currencyKt.f51762a.containsAlias(currencyKt.f51763b);
            int i15 = f51758i + 81;
            f51757h = i15 % 128;
            int i16 = i15 % 2;
            return Boolean.valueOf(zContainsAlias);
        } catch (KeyStoreException e5) {
            throw new setOutlineAmbientShadowColor(e5, 2003);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r0 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        r2 = new java.lang.Object[1];
        a((char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49399), "章▝\uf801䓀", 19242361 - android.text.TextUtils.lastIndexOf("", '0'), "\uaac9圐\ue3ef얧霆冸㿻件\ueb32⭭㤪뾭慽", r2);
        r1 = java.security.Signature.getInstance(((java.lang.String) r2[0]).intern());
        r1.initSign(((java.security.KeyStore.PrivateKeyEntry) r0).getPrivateKey());
        r1.update(r11);
        r11 = r1.sign();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.CurrencyKt.f51757h + 11;
        com.mypinpad.tsdk.isolation.CurrencyKt.f51758i = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        if ((r0 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        r2 = new java.lang.Object[1];
        a((char) android.view.View.MeasureSpec.getMode(0), "⇻琖䠯樘", android.view.View.getDefaultSize(0, 0) + 796136993, "པ짂邖笼भ\ueb85ꪖ棥쭣㼓ꝿꊋᠼ鱊\ud822駐ꯠ㾴礍펗螬븲벌\uf3c8\udea5셵䇷\u0b04\ue84e\ue7aa卫똙⒲\uef64氃\uec3a뛰邃㭶獞\uded7膙ደ슒\ue545ｒ뜵ྫྷ룮豯ം鑦킐Ⓘ\u0894\uf4c6臤⁗ꀸ롐ꟷ隬捻粏씑▇ꢖ䚾Ꜣ㍝艴煳寞壼\uf1f2", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009e, code lost:
    
        throw new java.lang.NullPointerException(((java.lang.String) r2[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r0 != null) goto L17;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] setOnFocusChangeListener(@org.jetbrains.annotations.NotNull byte[] r11) throws java.lang.Throwable {
        /*
            r10 = this;
            int r0 = com.mypinpad.tsdk.isolation.CurrencyKt.f51758i
            int r0 = r0 + 37
            int r1 = r0 % 128
            com.mypinpad.tsdk.isolation.CurrencyKt.f51757h = r1
            int r0 = r0 % 2
            java.security.KeyStore r1 = r10.f51762a
            r2 = 1
            java.lang.String r3 = r10.f51763b
            r4 = 0
            java.lang.String r5 = ""
            r6 = 0
            if (r0 == 0) goto L26
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r5)
            java.security.KeyStore$Entry r0 = r1.getEntry(r3, r4)     // Catch: java.lang.Exception -> L24
            r1 = 75
            int r1 = r1 / r6
            if (r0 == 0) goto L7b
            goto L2f
        L22:
            r11 = move-exception
            throw r11
        L24:
            r11 = move-exception
            goto L9f
        L26:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r5)
            java.security.KeyStore$Entry r0 = r1.getEntry(r3, r4)     // Catch: java.lang.Exception -> L24
            if (r0 == 0) goto L7b
        L2f:
            java.security.KeyStore$PrivateKeyEntry r0 = (java.security.KeyStore.PrivateKeyEntry) r0     // Catch: java.lang.Exception -> L24
            float r1 = android.media.AudioTrack.getMaxVolume()     // Catch: java.lang.Exception -> L24
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r3 = 49399(0xc0f7, float:6.9223E-41)
            int r1 = r1 + r3
            char r1 = (char) r1     // Catch: java.lang.Exception -> L24
            java.lang.String r3 = "章▝\uf801䓀"
            java.lang.String r7 = "\uaac9圐\ue3ef얧霆冸㿻件\ueb32⭭㤪뾭慽"
            r8 = 48
            int r8 = android.text.TextUtils.lastIndexOf(r5, r8)     // Catch: java.lang.Exception -> L24
            r9 = 19242361(0x1259d79, float:3.0418695E-38)
            int r9 = r9 - r8
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L24
            a(r1, r3, r9, r7, r2)     // Catch: java.lang.Exception -> L24
            r1 = r2[r6]     // Catch: java.lang.Exception -> L24
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L24
            java.lang.String r1 = r1.intern()     // Catch: java.lang.Exception -> L24
            java.security.Signature r1 = java.security.Signature.getInstance(r1)     // Catch: java.lang.Exception -> L24
            java.security.PrivateKey r0 = r0.getPrivateKey()     // Catch: java.lang.Exception -> L24
            r1.initSign(r0)     // Catch: java.lang.Exception -> L24
            r1.update(r11)     // Catch: java.lang.Exception -> L24
            byte[] r11 = r1.sign()     // Catch: java.lang.Exception -> L24
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r5)     // Catch: java.lang.Exception -> L24
            int r0 = com.mypinpad.tsdk.isolation.CurrencyKt.f51757h
            int r0 = r0 + 11
            int r1 = r0 % 128
            com.mypinpad.tsdk.isolation.CurrencyKt.f51758i = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L7a
            return r11
        L7a:
            throw r4
        L7b:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L24
            int r0 = android.view.View.MeasureSpec.getMode(r6)     // Catch: java.lang.Exception -> L24
            char r0 = (char) r0     // Catch: java.lang.Exception -> L24
            java.lang.String r1 = "⇻琖䠯樘"
            java.lang.String r3 = "པ짂邖笼भ\ueb85ꪖ棥쭣㼓ꝿꊋᠼ鱊\ud822駐ꯠ㾴礍펗螬븲벌\uf3c8\udea5셵䇷\u0b04\ue84e\ue7aa卫똙⒲\uef64氃\uec3a뛰邃㭶獞\uded7膙ደ슒\ue545ｒ뜵ྫྷ룮豯ം鑦킐Ⓘ\u0894\uf4c6臤⁗ꀸ롐ꟷ隬捻粏씑▇ꢖ䚾Ꜣ㍝艴煳寞壼\uf1f2"
            int r4 = android.view.View.getDefaultSize(r6, r6)     // Catch: java.lang.Exception -> L24
            r5 = 796136993(0x2f741621, float:2.2199532E-10)
            int r4 = r4 + r5
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L24
            a(r0, r1, r4, r3, r2)     // Catch: java.lang.Exception -> L24
            r0 = r2[r6]     // Catch: java.lang.Exception -> L24
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L24
            java.lang.String r0 = r0.intern()     // Catch: java.lang.Exception -> L24
            r11.<init>(r0)     // Catch: java.lang.Exception -> L24
            throw r11     // Catch: java.lang.Exception -> L24
        L9f:
            com.mypinpad.tsdk.i.setClipBounds r0 = new com.mypinpad.tsdk.i.setClipBounds
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.CurrencyKt.setOnFocusChangeListener(byte[]):byte[]");
    }

    @NotNull
    public final Certificate[] setX() throws KeyStoreException {
        int i10 = f51757h + 91;
        f51758i = i10 % 128;
        int i11 = i10 % 2;
        String str = this.f51763b;
        KeyStore keyStore = this.f51762a;
        if (i11 == 0) {
            Intrinsics.checkNotNullExpressionValue(keyStore.getCertificateChain(str), "");
            throw null;
        }
        Certificate[] certificateChain = keyStore.getCertificateChain(str);
        Intrinsics.checkNotNullExpressionValue(certificateChain, "");
        return certificateChain;
    }

    public final boolean setY() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -1394030873, 1394030873, System.identityHashCode(this))).booleanValue();
    }

    public final void setDividerPadding(@NotNull byte[] p4) throws Throwable {
        int i10 = f51758i + 31;
        f51757h = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(p4, "");
        if (!((Boolean) setDividerPadding(new Object[]{this}, -1394030873, 1394030873, System.identityHashCode(this))).booleanValue()) {
            try {
                KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(this.f51763b, 4);
                Object[] objArr = new Object[1];
                a((char) (4864 - Color.red(0)), "뷁䍭Y贓", 1497591229 - (ViewConfiguration.getWindowTouchSlop() >> 8), "⠲랮쵣䖨\uf57a", objArr);
                KeyGenParameterSpec.Builder signaturePaddings = builder.setSignaturePaddings(((String) objArr[0]).intern());
                Object[] objArr2 = new Object[1];
                b(7 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\n\r\u0007\u0004\u0000\u000b㗹", (byte) (74 - TextUtils.lastIndexOf("", '0', 0)), objArr2);
                KeyGenParameterSpec.Builder attestationChallenge = signaturePaddings.setDigests(((String) objArr2[0]).intern()).setUserAuthenticationRequired(false).setAttestationChallenge(p4);
                Intrinsics.checkNotNullExpressionValue(attestationChallenge, "");
                Object[] objArr3 = new Object[1];
                a((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 46673), "뽩㱷偄➶", View.getDefaultSize(0, 0) + 1144813503, "⑂\ue9bf琍", objArr3);
                String strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                a((char) (17557 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), "↣㖺镅䑄", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1161148960, "⍴뗕\udede퉴﮴썣毙堖닾䀸쯁첫ᾉᏃ\uf071", objArr4);
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(strIntern, ((String) objArr4[0]).intern());
                keyPairGenerator.initialize(attestationChallenge.build());
                keyPairGenerator.generateKeyPair();
                int i12 = f51758i + 97;
                f51757h = i12 % 128;
                if (i12 % 2 != 0) {
                    throw null;
                }
            } catch (Exception e5) {
                throw new setOutlineAmbientShadowColor(e5, 2002);
            }
        }
        int i13 = f51757h + 77;
        f51758i = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }
}
