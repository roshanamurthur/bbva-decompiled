package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.a;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0003\u0010\n"}, d2 = {"Lcom/mypinpad/tsdk/i/setMinimumWidth;", "", "", "setOnFocusChangeListener", "()Ljava/lang/String;", "setX", "", "setY", "()[B", "p0", "([B)Ljava/lang/String;"}, k = 1, mv = {1, 5, 1})
public final class setMinimumWidth {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f60127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f60128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final char f60129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f60130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f60131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f60132i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f60133j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final byte[] f60134k = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final dispose f60135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final getScope f60136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final setColorFilter f60137c;

    static {
        d();
        f60132i = 0;
        f60133j = 1;
        f60130g = 0;
        f60131h = 1;
        f60127d = 4494927590100904567L;
        f60129f = (char) 53954;
        f60128e = new char[]{59198, 59191, 59176, 58561, 58563, 58562, 58560, 59194, 59177};
    }

    public setMinimumWidth(dispose disposeVar, getScope getscope, setColorFilter setcolorfilter, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        setcolorfilter = (i10 & 4) != 0 ? null : setcolorfilter;
        Intrinsics.checkNotNullParameter(disposeVar, "");
        Intrinsics.checkNotNullParameter(getscope, "");
        this.f60135a = disposeVar;
        this.f60136b = getscope;
        this.f60137c = setcolorfilter;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:44:0x01f6  */
    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        Throwable cause;
        int i11 = f60133j;
        int i12 = i11 + 49;
        f60132i = i12 % 128;
        char c10 = 2;
        if (i12 % 2 != 0) {
            throw null;
        }
        int i13 = i11 + 107;
        f60132i = i13 % 128;
        int i14 = i13 % 2;
        char[] charArray = str.toCharArray();
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = i10;
        int length = charArray.length;
        long[] jArr = new long[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i15 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i15 >= charArray.length) {
                break;
            }
            char c11 = charArray[i15];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[c10] = setlayoutanimation;
                objArr2[1] = setlayoutanimation;
                objArr2[0] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(-764403778);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) TextUtils.getTrimmedLength(""), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 33, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1195);
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    c(b10, b11, b11, objArr3);
                    method = cls.getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                    map.put(-764403778, method);
                }
                jArr[i15] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (f60127d ^ 1779209353347916695L);
                Object[] objArr4 = {setlayoutanimation, setlayoutanimation};
                Object method2 = map.get(645183118);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 44, 728 - TextUtils.getCapsMode("", 0, 0));
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    c(b12, b13, (byte) (b13 + 3), objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(645183118, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                int i16 = f60132i + 115;
                f60133j = i16 % 128;
                int i17 = i16 % 2;
                c10 = 2;
            } catch (Throwable th2) {
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        char[] cArr = new char[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i18 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i18 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            int i19 = f60132i + 77;
            f60133j = i19 % 128;
            if (i19 % 2 == 0) {
                cArr[i18] = (char) jArr[i18];
                Object[] objArr6 = {setlayoutanimation, setlayoutanimation};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(645183118);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) TextUtils.indexOf("", "", 0, 0), View.resolveSize(0, 0) + 44, 727 - Process.getGidForName(""));
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr7 = new Object[1];
                    c(b14, b15, (byte) (b15 + 3), objArr7);
                    method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(645183118, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                throw null;
            }
            cArr[i18] = (char) jArr[i18];
            Object[] objArr8 = {setlayoutanimation, setlayoutanimation};
            Map map3 = setTextScaleX.setMaxEms;
            Object method4 = map3.get(645183118);
            if (method4 == null) {
                Class cls4 = (Class) setTextScaleX.setX((char) (Process.myTid() >> 22), 44 - View.MeasureSpec.getMode(0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 728);
                byte b16 = (byte) 0;
                byte b17 = b16;
                Object[] objArr9 = new Object[1];
                c(b16, b17, (byte) (b17 + 3), objArr9);
                method4 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                map3.put(645183118, method4);
            }
            ((Method) method4).invoke(null, objArr8);
        }
    }

    public static void b(int i10, byte b10, Object[] objArr) throws Throwable {
        int i11;
        int i12;
        char[] charArray = "\u0006\u0002\u0002\u0001\b\u0001㘄".toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr = f60128e;
        int i13 = 290255894;
        int i14 = 6;
        int i15 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i16 = 0;
            while (i16 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i15] = Integer.valueOf(cArr[i16]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(Integer.valueOf(i13));
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) ((Process.getThreadPriority(i15) + 20) >> i14), TextUtils.indexOf("", "", i15, i15) + 45, (ViewConfiguration.getScrollBarSize() >> 8) + 1116);
                        byte b11 = (byte) i15;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        c(b11, b12, (byte) (b12 | 11), objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(290255894, method);
                    }
                    cArr2[i16] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i16++;
                    i13 = 290255894;
                    i14 = 6;
                    i15 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(f60129f)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(290255894);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) Gravity.getAbsoluteGravity(0, 0), 45 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1116);
            byte b13 = (byte) 0;
            byte b14 = b13;
            Object[] objArr5 = new Object[1];
            c(b13, b14, (byte) (b14 | 11), objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(290255894, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i10];
        int i17 = 2;
        if (i10 % 2 != 0) {
            int i18 = f60132i + 73;
            f60133j = i18 % 128;
            if (i18 % 2 == 0) {
                i11 = i10 + 110;
                cArr3[i11] = (char) (charArray[i11] / b10);
            } else {
                i11 = i10 - 1;
                cArr3[i11] = (char) (charArray[i11] - b10);
            }
        } else {
            i11 = i10;
        }
        char c10 = 3;
        if (i11 > 1) {
            setincludefontpadding.setDividerPadding = 0;
            while (true) {
                int i19 = setincludefontpadding.setDividerPadding;
                if (i19 >= i11) {
                    break;
                }
                char c11 = charArray[i19];
                setincludefontpadding.setY = c11;
                int i20 = i19 + 1;
                char c12 = charArray[i20];
                setincludefontpadding.setCompoundDrawableTintBlendMode = c12;
                if (c11 == c12) {
                    cArr3[i19] = (char) (c11 - b10);
                    cArr3[i20] = (char) (c12 - b10);
                    i12 = i17;
                } else {
                    Object[] objArr6 = new Object[13];
                    objArr6[12] = setincludefontpadding;
                    objArr6[11] = Integer.valueOf(cCharValue);
                    objArr6[10] = setincludefontpadding;
                    objArr6[9] = setincludefontpadding;
                    objArr6[8] = Integer.valueOf(cCharValue);
                    objArr6[7] = setincludefontpadding;
                    objArr6[6] = setincludefontpadding;
                    objArr6[5] = Integer.valueOf(cCharValue);
                    objArr6[4] = setincludefontpadding;
                    objArr6[c10] = setincludefontpadding;
                    objArr6[i17] = Integer.valueOf(cCharValue);
                    objArr6[1] = setincludefontpadding;
                    objArr6[0] = setincludefontpadding;
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(180437302);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) View.MeasureSpec.getMode(0), (ViewConfiguration.getTouchSlop() >> 8) + 27, 2311 - View.resolveSize(0, 0));
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        Object[] objArr7 = new Object[1];
                        c(b15, b16, (byte) (b16 | 8), objArr7);
                        String str = (String) objArr7[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(180437302, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i21 = setincludefontpadding.setNavigationOnClickListener;
                    if (iIntValue == i21) {
                        int i22 = f60133j + 117;
                        f60132i = i22 % 128;
                        int i23 = i22 % 2;
                        Object[] objArr8 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Object method4 = map3.get(1989802713);
                        if (method4 == null) {
                            Class cls5 = (Class) setTextScaleX.setX((char) (49103 - KeyEvent.normalizeMetaState(0)), ((Process.getThreadPriority(0) + 20) >> 6) + 35, 2545 - (KeyEvent.getMaxKeyCode() >> 16));
                            byte b17 = (byte) 0;
                            Object[] objArr9 = new Object[1];
                            c(b17, b17, (byte) f60134k.length, objArr9);
                            String str2 = (String) objArr9[0];
                            Class<?> cls6 = Integer.TYPE;
                            method4 = cls5.getMethod(str2, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(1989802713, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i24 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                        int i25 = setincludefontpadding.setDividerPadding;
                        cArr3[i25] = cArr[iIntValue2];
                        cArr3[i25 + 1] = cArr[i24];
                    } else {
                        int i26 = setincludefontpadding.setX;
                        int i27 = setincludefontpadding.setOnFocusChangeListener;
                        if (i26 == i27) {
                            int i28 = f60133j + 43;
                            f60132i = i28 % 128;
                            int i29 = i28 % 2;
                            int iA = a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                            setincludefontpadding.setOnLongClickListener = iA;
                            int iA2 = a.a(i21, cCharValue, 1, cCharValue);
                            setincludefontpadding.setNavigationOnClickListener = iA2;
                            int i30 = (i27 * cCharValue) + iA2;
                            int i31 = setincludefontpadding.setDividerPadding;
                            cArr3[i31] = cArr[(i26 * cCharValue) + iA];
                            cArr3[i31 + 1] = cArr[i30];
                        } else {
                            int i32 = (i26 * cCharValue) + i21;
                            int i33 = (i27 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                            int i34 = setincludefontpadding.setDividerPadding;
                            cArr3[i34] = cArr[i32];
                            cArr3[i34 + 1] = cArr[i33];
                            int i35 = f60132i + 51;
                            f60133j = i35 % 128;
                            i12 = 2;
                            int i36 = i35 % 2;
                        }
                    }
                    i12 = 2;
                }
                setincludefontpadding.setDividerPadding += i12;
                i17 = 2;
                c10 = 3;
            }
        }
        int i37 = 0;
        while (i37 < i10) {
            cArr3[i37] = (char) (cArr3[i37] ^ 13722);
            i37++;
            int i38 = f60133j + 3;
            f60132i = i38 % 128;
            int i39 = i38 % 2;
        }
        objArr[0] = new String(cArr3);
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
    public static void c(byte r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = 110 - r9
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r8 = r8 + 1
            byte[] r0 = new byte[r8]
            byte[] r1 = com.mypinpad.tsdk.isolation.setMinimumWidth.f60134k
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r9
            r5 = r2
            r9 = r8
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r0[r3] = r4
            if (r5 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r1[r7]
            r6 = r9
            r9 = r8
            r8 = r6
        L2a:
            int r3 = -r3
            int r8 = r8 + r3
            int r7 = r7 + 1
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setMinimumWidth.c(byte, byte, byte, java.lang.Object[]):void");
    }

    public static void d() {
        f60134k = new byte[]{15, -41, -95, -53};
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = f60131h + 97;
        f60130g = i13 % 128;
        if (i13 % 2 == 0) {
            return UUID.randomUUID();
        }
        UUID.randomUUID();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a A[PHI: r1
      0x003a: PHI (r1v4 java.lang.String) = (r1v3 java.lang.String), (r1v25 java.lang.String) binds: [B:8:0x0036, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x0077  */
    /* JADX WARN: Code duplicated, block: B:16:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:18:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:35:0x019d  */
    @NotNull
    public final String setX() {
        String dividerPadding;
        String strIntern;
        Object[] objArr;
        int i10;
        int i11 = f60130g + 7;
        f60131h = i11 % 128;
        int i12 = i11 % 2;
        getScope getscope = this.f60136b;
        setColorFilter setcolorfilter = this.f60137c;
        if (i12 == 0) {
            dividerPadding = getscope.setDividerPadding();
            dispose.setDividerPadding();
            int i13 = 56 / 0;
            if (!dispose.setCompoundDrawableTintBlendMode()) {
                Object[] objArr2 = new Object[1];
                b(View.combineMeasuredStates(0, 0) + 7, (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 5), objArr2);
                strIntern = ((String) objArr2[0]).intern();
                objArr = new Object[1];
                a("즄湾虴㹤噫", 43003 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
                if (!Intrinsics.areEqual(strIntern, ((String) objArr[0]).intern())) {
                    if (setcolorfilter != null) {
                        int i14 = f60131h + 1;
                        f60130g = i14 % 128;
                        int i15 = i14 % 2;
                        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 23, null, null, 6}, 1173867142, -1173867141, 23);
                    }
                    throw new LanguagePreference();
                }
                i10 = f60130g + 65;
                f60131h = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
                if (setcolorfilter != null) {
                    Object[] objArr3 = new Object[1];
                    a("즫噄\uf61bᛐ뚐흊眔韂㟈呀\uf419ᒋ뒂핂甚閏㖘剐\uf200\u12d7늃퍔猄鏒㏘偛\uf01bი낗텘焚醑㇠幕︪Ừ뺷\udf25缯鿴㿨屨ﰤᲫ벩\udd7f紼鷠㶢娱層\u1afd뫴\udb65笤鯸㮼塬\uf839ᣯ뢵\ud972礰馿㧂妔\ue64b؏ꛀ욖", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 40897, objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    new LanguagePreference();
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{strIntern2}, 1673747418, -1673747410, (int) System.currentTimeMillis());
                    int i16 = f60131h + 67;
                    f60130g = i16 % 128;
                    int i17 = i16 % 2;
                }
            }
        } else {
            dividerPadding = getscope.setDividerPadding();
            dispose.setDividerPadding();
            if (!dispose.setCompoundDrawableTintBlendMode()) {
                Object[] objArr4 = new Object[1];
                b(View.combineMeasuredStates(0, 0) + 7, (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 5), objArr4);
                strIntern = ((String) objArr4[0]).intern();
                objArr = new Object[1];
                a("즄湾虴㹤噫", 43003 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
                if (!Intrinsics.areEqual(strIntern, ((String) objArr[0]).intern())) {
                    if (setcolorfilter != null) {
                        int i18 = f60131h + 1;
                        f60130g = i18 % 128;
                        int i19 = i18 % 2;
                        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 23, null, null, 6}, 1173867142, -1173867141, 23);
                    }
                    throw new LanguagePreference();
                }
                i10 = f60130g + 65;
                f60131h = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
                if (setcolorfilter != null) {
                    Object[] objArr5 = new Object[1];
                    a("즫噄\uf61bᛐ뚐흊眔韂㟈呀\uf419ᒋ뒂핂甚閏㖘剐\uf200\u12d7늃퍔猄鏒㏘偛\uf01bი낗텘焚醑㇠幕︪Ừ뺷\udf25缯鿴㿨屨ﰤᲫ벩\udd7f紼鷠㶢娱層\u1afd뫴\udb65笤鯸㮼塬\uf839ᣯ뢵\ud972礰馿㧂妔\ue64b؏ꛀ욖", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 40897, objArr5);
                    String strIntern3 = ((String) objArr5[0]).intern();
                    new LanguagePreference();
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{strIntern3}, 1673747418, -1673747410, (int) System.currentTimeMillis());
                    int i110 = f60131h + 67;
                    f60130g = i110 % 128;
                    int i111 = i110 % 2;
                }
            }
        }
        if (dividerPadding.length() == 0) {
            int i20 = f60130g + 73;
            f60131h = i20 % 128;
            int i21 = i20 % 2;
            if (setcolorfilter != null) {
                setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 46, null, null, 6}, 1173867142, -1173867141, 46);
            }
            throw new setForegroundTintList();
        }
        UUID uuidFromString = UUID.fromString(dividerPadding);
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "");
        String compoundDrawableTintBlendMode = this.f60135a.setCompoundDrawableTintBlendMode(uuidFromString);
        String string = uuidFromString.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        getscope.setY(string, compoundDrawableTintBlendMode);
        if (setcolorfilter != null) {
            int i22 = f60131h + 29;
            f60130g = i22 % 128;
            if (i22 % 2 != 0) {
                setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 30, getDisplayExponent.setY(StringsKt___StringsKt.take(dividerPadding, 5)), null, 3}, 1173867142, -1173867141, 30);
            } else {
                setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 44, getDisplayExponent.setY(StringsKt___StringsKt.take(dividerPadding, 4)), null, 4}, 1173867142, -1173867141, 44);
            }
        }
        String string2 = uuidFromString.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    @NotNull
    public final byte[] setY() {
        int i10 = f60131h + 43;
        f60130g = i10 % 128;
        int i11 = i10 % 2;
        byte[] onFocusChangeListener = dispose.setOnFocusChangeListener();
        int i12 = f60131h + 121;
        f60130g = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 68 / 0;
        }
        return onFocusChangeListener;
    }

    @NotNull
    public final String setOnFocusChangeListener() throws Throwable {
        getScope getscope = this.f60136b;
        String dividerPadding = getscope.setDividerPadding();
        int length = dividerPadding.length();
        setColorFilter setcolorfilter = this.f60137c;
        if (length != 0) {
            int i10 = f60131h + 85;
            f60130g = i10 % 128;
            int i11 = i10 % 2;
            String x4 = getscope.setX();
            UUID uuidFromString = UUID.fromString(dividerPadding);
            Intrinsics.checkNotNullExpressionValue(uuidFromString, "");
            if (!(!((Boolean) dispose.setX(new Object[]{(byte[]) setTextClassifier.setCompoundDrawableTintBlendMode(new Object[]{uuidFromString}, 230957076, -230957076, (int) System.currentTimeMillis()), x4}, 622734011, -622734011, (int) System.currentTimeMillis())).booleanValue())) {
                return dividerPadding;
            }
            if (setcolorfilter != null) {
                int i12 = f60130g + 103;
                f60131h = i12 % 128;
                int i13 = i12 % 2;
                setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 24, getDisplayExponent.setY(dividerPadding), null, 4}, 1173867142, -1173867141, 24);
                int i14 = f60131h + 89;
                f60130g = i14 % 128;
                int i15 = i14 % 2;
            }
            throw new setHorizontalScrollbarTrackDrawable();
        }
        int i16 = f60131h + 89;
        int i17 = i16 % 128;
        f60130g = i17;
        int i18 = i16 % 2;
        if (setcolorfilter != null) {
            int i19 = i17 + 67;
            f60131h = i19 % 128;
            if (i19 % 2 == 0) {
                Object[] objArr = new Object[1];
                a("즮翐ꕾ\uea94ჸ䙞辴㔍筱ꃃ혯\u1fd5䗭譖ウ晝갰헌ᬼ䂈\uf6ed㱟斯ꭉ텩ڇ䰨\uf580㯳愃隭\udc0fɥ", 46687 >>> Color.red(1), objArr);
                setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr[0]).intern()}, 2065174743, -2065174734, (int) System.currentTimeMillis());
            } else {
                Object[] objArr2 = new Object[1];
                a("즮翐ꕾ\uea94ჸ䙞辴㔍筱ꃃ혯\u1fd5䗭譖ウ晝갰헌ᬼ䂈\uf6ed㱟斯ꭉ텩ڇ䰨\uf580㯳愃隭\udc0fɥ", 46687 - Color.red(0), objArr2);
                setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr2[0]).intern()}, 2065174743, -2065174734, (int) System.currentTimeMillis());
            }
        }
        dispose.setDividerPadding();
        if (!dispose.setCompoundDrawableTintBlendMode()) {
            Object[] objArr3 = new Object[1];
            b(7 - View.MeasureSpec.getMode(0), (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5), objArr3);
            String strIntern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            a("즄湾虴㹤噫", 43003 - (ViewConfiguration.getScrollBarSize() >> 8), objArr4);
            if (!Intrinsics.areEqual(strIntern, ((String) objArr4[0]).intern())) {
                if (setcolorfilter != null) {
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 23, null, null, 6}, 1173867142, -1173867141, 23);
                }
                throw new LanguagePreference();
            }
            if (setcolorfilter != null) {
                Object[] objArr5 = new Object[1];
                a("즫噄\uf61bᛐ뚐흊眔韂㟈呀\uf419ᒋ뒂핂甚閏㖘剐\uf200\u12d7늃퍔猄鏒㏘偛\uf01bი낗텘焚醑㇠幕︪Ừ뺷\udf25缯鿴㿨屨ﰤᲫ벩\udd7f紼鷠㶢娱層\u1afd뫴\udb65笤鯸㮼塬\uf839ᣯ뢵\ud972礰馿㧂妔\ue64b؏ꛀ욖", 40896 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr5);
                String strIntern2 = ((String) objArr5[0]).intern();
                new LanguagePreference();
                setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{strIntern2}, 1673747418, -1673747410, (int) System.currentTimeMillis());
            }
        }
        UUID uuid = (UUID) setOnFocusChangeListener(new Object[0], -854162681, 854162681, (int) System.currentTimeMillis());
        Intrinsics.checkNotNullExpressionValue(uuid, "");
        String compoundDrawableTintBlendMode = this.f60135a.setCompoundDrawableTintBlendMode(uuid);
        String string = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        getscope.setY(string, compoundDrawableTintBlendMode);
        if (setcolorfilter != null) {
            int i20 = f60130g + 23;
            f60131h = i20 % 128;
            int i21 = i20 % 2;
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 31, getDisplayExponent.setY(StringsKt___StringsKt.take(dividerPadding, 4)), null, 4}, 1173867142, -1173867141, 31);
            int i22 = f60130g + 19;
            f60131h = i22 % 128;
            int i23 = i22 % 2;
        }
        String string2 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    @NotNull
    public final String setOnFocusChangeListener(@NotNull byte[] p4) {
        int i10 = f60130g + 59;
        f60131h = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(p4, "");
        String y7 = dispose.setY(p4);
        int i12 = f60131h + 109;
        f60130g = i12 % 128;
        int i13 = i12 % 2;
        return y7;
    }
}
