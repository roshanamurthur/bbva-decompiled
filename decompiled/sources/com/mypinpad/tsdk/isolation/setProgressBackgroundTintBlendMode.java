package com.mypinpad.tsdk.isolation;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import bk.q;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class setProgressBackgroundTintBlendMode {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f60337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f60338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f60339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f60340h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f60341i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f60342j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final byte[] f60343k = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setScaleX f60344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setTextSelectHandleLeft f60345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Context f60346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public getAmountFieldBgColor f60347d;

    static {
        d();
        f60341i = 0;
        f60342j = 1;
        f60339g = 0;
        f60340h = 1;
        f60337e = new char[]{59068, 59086, 59134, 59110, 59128, 59129, 59110, 59074, 59063, 59066, 59078, 59098, 59094, 59064, 59074, 58903, 58901, 58935, 58935, 58943, 58929, 58934, 58943, 58907, 59121, 58901, 58933, 59056, 59085, 59130, 59124, 59075, 58930, 58913, 58889, 58942, 58890, 58889, 58943, 58954, 59312, 59274, 59267, 59275, 59267, 59318, 59279, 59315, 59319, 59267, 59318, 58948, 59264, 59267, 59272, 59279, 59271, 58978};
        f60338f = -610078060900236714L;
    }

    public setProgressBackgroundTintBlendMode(@NotNull setScaleX setscalex, @NotNull setTextSelectHandleLeft settextselecthandleleft, @NotNull Context context, @NotNull setColorFilter setcolorfilter) {
        Intrinsics.checkNotNullParameter(setscalex, "");
        Intrinsics.checkNotNullParameter(settextselecthandleleft, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
        this.f60344a = setscalex;
        this.f60345b = settextselecthandleleft;
        this.f60346c = context;
    }

    public static void a(String str, boolean z10, int[] iArr, Object[] objArr) throws Throwable {
        int i10;
        int i11;
        int i12;
        int i13;
        String str2 = str;
        int i14 = 0;
        Object bytes = str2;
        if (str2 != null) {
            int i15 = f60342j + 51;
            f60341i = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 42 / 0;
                bytes = str2.getBytes("ISO-8859-1");
            } else {
                bytes = str2.getBytes("ISO-8859-1");
            }
        }
        byte[] bArr = (byte[]) bytes;
        setNavigationOnClickListener setnavigationonclicklistener = new setNavigationOnClickListener();
        int i17 = iArr[0];
        int i18 = 1;
        int i19 = iArr[1];
        int i20 = iArr[2];
        int i21 = iArr[3];
        char[] cArr = f60337e;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i22 = 0;
            while (i22 < length) {
                try {
                    Object[] objArr2 = new Object[i18];
                    objArr2[i14] = Integer.valueOf(cArr[i22]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-637734149);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (ImageFormat.getBitsPerPixel(i14) + 1), TextUtils.lastIndexOf("", '0', i14, i14) + 38, Color.rgb(i14, i14, i14) + 16777825);
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        c(b10, (byte) (b11 | 12), b11, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(-637734149, method);
                    }
                    cArr2[i22] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i22++;
                    cArr = cArr;
                    length = length;
                    i20 = i20;
                    i21 = i21;
                    i14 = 0;
                    i18 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
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
        if (bArr != null) {
            char[] cArr4 = new char[i19];
            setnavigationonclicklistener.setX = 0;
            char c10 = 0;
            while (true) {
                int i23 = setnavigationonclicklistener.setX;
                if (i23 >= i19) {
                    break;
                }
                if (bArr[i23] == 1) {
                    Object[] objArr4 = {Integer.valueOf(cArr3[i23]), Integer.valueOf(c10)};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method2 = map2.get(1737824323);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (4449 - TextUtils.indexOf("", "", 0, 0)), 42 - (KeyEvent.getMaxKeyCode() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 1022);
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr5 = new Object[1];
                        c(b12, (byte) (b13 | 9), b13, objArr5);
                        String str3 = (String) objArr5[0];
                        Class<?> cls3 = Integer.TYPE;
                        method2 = cls2.getMethod(str3, cls3, cls3);
                        map2.put(1737824323, method2);
                    }
                    cArr4[i23] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i13 = 2;
                } else {
                    Object[] objArr6 = {Integer.valueOf(cArr3[i23]), Integer.valueOf(c10)};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(-504758789);
                    if (method3 == null) {
                        Class cls4 = (Class) setTextScaleX.setX((char) TextUtils.getCapsMode("", 0, 0), ExpandableListView.getPackedPositionGroup(0L) + 45, (ViewConfiguration.getEdgeSlop() >> 16) + 2627);
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        Object[] objArr7 = new Object[1];
                        c(b14, (byte) (b15 | 13), b15, objArr7);
                        String str4 = (String) objArr7[0];
                        Class<?> cls5 = Integer.TYPE;
                        method3 = cls4.getMethod(str4, cls5, cls5);
                        map3.put(-504758789, method3);
                    }
                    cArr4[i23] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                    int i24 = f60342j + 21;
                    f60341i = i24 % 128;
                    i13 = 2;
                    int i25 = i24 % 2;
                }
                c10 = cArr4[setnavigationonclicklistener.setX];
                Object[] objArr8 = new Object[i13];
                objArr8[1] = setnavigationonclicklistener;
                objArr8[0] = setnavigationonclicklistener;
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(-265085633);
                if (method4 == null) {
                    Class cls6 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 31347), 48 - (ViewConfiguration.getWindowTouchSlop() >> 8), View.getDefaultSize(0, 0) + 840);
                    byte b16 = (byte) 0;
                    byte b17 = b16;
                    Object[] objArr9 = new Object[1];
                    c(b16, (byte) (b17 | 10), b17, objArr9);
                    method4 = cls6.getMethod((String) objArr9[0], Object.class, Object.class);
                    map4.put(-265085633, method4);
                }
                ((Method) method4).invoke(null, objArr8);
            }
            cArr3 = cArr4;
        }
        if (i11 > 0) {
            int i26 = f60341i + 55;
            f60342j = i26 % 128;
            int i27 = i26 % 2;
            char[] cArr5 = new char[i19];
            i12 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i19);
            int i28 = i19 - i11;
            int i29 = i11;
            System.arraycopy(cArr5, 0, cArr3, i28, i29);
            System.arraycopy(cArr5, i29, cArr3, 0, i28);
        } else {
            i12 = 0;
        }
        if (z10) {
            char[] cArr6 = new char[i19];
            setnavigationonclicklistener.setX = i12;
            while (true) {
                int i30 = setnavigationonclicklistener.setX;
                if (i30 >= i19) {
                    break;
                }
                cArr6[i30] = cArr3[(i19 - i30) - 1];
                setnavigationonclicklistener.setX = i30 + 1;
                int i31 = f60341i + 63;
                f60342j = i31 % 128;
                int i32 = i31 % 2;
            }
            cArr3 = cArr6;
        }
        if (i10 > 0) {
            int i33 = 0;
            while (true) {
                setnavigationonclicklistener.setX = i33;
                int i34 = setnavigationonclicklistener.setX;
                if (i34 >= i19) {
                    break;
                }
                int i35 = f60341i + 35;
                f60342j = i35 % 128;
                int i36 = i35 % 2;
                cArr3[i34] = (char) (cArr3[i34] - iArr[2]);
                i33 = i34 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x017f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0180  */
    public static void b(String str, int i10, Object[] objArr) throws Throwable {
        Throwable cause;
        int i11 = f60341i + 23;
        f60342j = i11 % 128;
        char c10 = 2;
        int i12 = i11 % 2;
        char[] charArray = str.toCharArray();
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = i10;
        int length = charArray.length;
        long[] jArr = new long[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i13 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i13 >= charArray.length) {
                break;
            }
            char c11 = charArray[i13];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[c10] = setlayoutanimation;
                objArr2[1] = setlayoutanimation;
                objArr2[0] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(-764403778);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 33 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1195 - View.MeasureSpec.makeMeasureSpec(0, 0));
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    c(b10, b11, b11, objArr3);
                    method = cls.getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                    map.put(-764403778, method);
                }
                jArr[i13] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (f60338f ^ 1779209353347916695L);
                Object[] objArr4 = {setlayoutanimation, setlayoutanimation};
                Object method2 = map.get(645183118);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getTapTimeout() >> 16), 43 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (Process.myTid() >> 22) + 728);
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    c(b12, (byte) (b13 + 3), b13, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(645183118, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                int i14 = f60341i + 95;
                f60342j = i14 % 128;
                int i15 = i14 % 2;
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
            int i16 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i16 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i16] = (char) jArr[i16];
            Object[] objArr6 = {setlayoutanimation, setlayoutanimation};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(645183118);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) (Process.myTid() >> 22), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43, Drawable.resolveOpacity(0, 0) + 728);
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                c(b14, (byte) (b15 + 3), b15, objArr7);
                method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(645183118, method3);
            }
            ((Method) method3).invoke(null, objArr6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(byte r8, int r9, short r10, java.lang.Object[] r11) {
        /*
            int r10 = r10 * 2
            int r10 = r10 + 1
            int r9 = 110 - r9
            int r8 = r8 * 4
            int r8 = r8 + 4
            byte[] r0 = new byte[r10]
            byte[] r1 = com.mypinpad.tsdk.isolation.setProgressBackgroundTintBlendMode.f60343k
            r2 = 0
            if (r1 != 0) goto L18
            r9 = r8
            r3 = r1
            r5 = r2
            r1 = r0
            r0 = r11
            r11 = r10
            goto L33
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r0[r3] = r4
            if (r5 != r10) goto L28
            java.lang.String r8 = new java.lang.String
            r8.<init>(r0, r2)
            r11[r2] = r8
            return
        L28:
            r3 = r1[r8]
            r6 = r9
            r9 = r8
            r8 = r6
            r7 = r11
            r11 = r10
            r10 = r3
            r3 = r1
            r1 = r0
            r0 = r7
        L33:
            int r8 = r8 + r10
            int r9 = r9 + 1
            r10 = r11
            r11 = r0
            r0 = r1
            r1 = r3
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setProgressBackgroundTintBlendMode.c(byte, int, short, java.lang.Object[]):void");
    }

    public static void d() {
        f60343k = new byte[]{72, 8, Constants.CVR_B1b85_0110_TERMINAL, -53};
    }

    public static Metadata e(setForegroundTintBlendMode setforegroundtintblendmode) throws Throwable {
        String str;
        byte b10;
        int i10;
        byte b11;
        char c10;
        char c11;
        JSONObject jSONObject = new JSONObject();
        Object[] objArr = new Object[1];
        a(null, true, new int[]{32, 7, 59, 4}, objArr);
        String strIntern = ((String) objArr[0]).intern();
        byte[] bArr = (byte[]) setForegroundTintBlendMode.setCompoundDrawableTintBlendMode(new Object[]{setforegroundtintblendmode}, 555968326, -555968326, System.identityHashCode(setforegroundtintblendmode));
        if (bArr.length == 0) {
            str = "";
        } else {
            char[] cArr = new char[bArr.length << 1];
            for (int i11 = 0; i11 < bArr.length; i11++) {
                int i12 = f60340h;
                int i13 = i12 + 9;
                f60339g = i13 % 128;
                if (i13 % 2 != 0) {
                    b10 = bArr[i11];
                    b11 = (byte) ((b10 + 2) & 80);
                    switch (b11) {
                        case 0:
                            i10 = i11;
                            c10 = '0';
                            break;
                        case 1:
                            i10 = i11;
                            c10 = '1';
                            break;
                        case 2:
                            i10 = i11;
                            c10 = '2';
                            break;
                        case 3:
                            i10 = i11;
                            c10 = '3';
                            break;
                        case 4:
                            i10 = i11;
                            c10 = '4';
                            break;
                        case 5:
                            i10 = i11;
                            int i14 = i12 + 47;
                            f60339g = i14 % 128;
                            int i15 = i14 % 2;
                            c10 = '5';
                            break;
                        case 6:
                            i10 = i11;
                            c10 = '6';
                            break;
                        case 7:
                            i10 = i11;
                            c10 = '7';
                            break;
                        case 8:
                            i10 = i11;
                            c10 = '8';
                            break;
                        case 9:
                            i10 = i11;
                            c10 = '9';
                            break;
                        case 10:
                            i10 = i11;
                            c10 = 'a';
                            break;
                        case 11:
                            i10 = i11;
                            c10 = 'b';
                            break;
                        case 12:
                            i10 = i11;
                            c10 = 'c';
                            break;
                        case 13:
                            i10 = i11;
                            c10 = 'd';
                            break;
                        case 14:
                            i10 = i11;
                            c10 = 'e';
                            break;
                        case 15:
                            i10 = i11;
                            c10 = 'f';
                            break;
                        default:
                            throw new IllegalArgumentException(String.valueOf((int) b11));
                    }
                } else {
                    b10 = bArr[i11];
                    i10 = i11 << 1;
                    byte b12 = (byte) ((b10 >>> 4) & 15);
                    switch (b12) {
                        case 0:
                            c10 = '0';
                            break;
                        case 1:
                            c10 = '1';
                            break;
                        case 2:
                            c10 = '2';
                            break;
                        case 3:
                            c10 = '3';
                            break;
                        case 4:
                            c10 = '4';
                            break;
                        case 5:
                            int i16 = i12 + 47;
                            f60339g = i16 % 128;
                            int i17 = i16 % 2;
                            c10 = '5';
                            break;
                        case 6:
                            c10 = '6';
                            break;
                        case 7:
                            c10 = '7';
                            break;
                        case 8:
                            c10 = '8';
                            break;
                        case 9:
                            c10 = '9';
                            break;
                        case 10:
                            c10 = 'a';
                            break;
                        case 11:
                            c10 = 'b';
                            break;
                        case 12:
                            c10 = 'c';
                            break;
                        case 13:
                            c10 = 'd';
                            break;
                        case 14:
                            c10 = 'e';
                            break;
                        case 15:
                            c10 = 'f';
                            break;
                        default:
                            b11 = b12;
                            throw new IllegalArgumentException(String.valueOf((int) b11));
                    }
                }
                cArr[i10] = c10;
                int i18 = (i11 << 1) + 1;
                byte b13 = (byte) (b10 & 15);
                switch (b13) {
                    case 0:
                        c11 = '0';
                        break;
                    case 1:
                        c11 = '1';
                        break;
                    case 2:
                        c11 = '2';
                        break;
                    case 3:
                        c11 = '3';
                        break;
                    case 4:
                        c11 = '4';
                        break;
                    case 5:
                        c11 = '5';
                        break;
                    case 6:
                        c11 = '6';
                        break;
                    case 7:
                        c11 = '7';
                        break;
                    case 8:
                        int i19 = i12 + 5;
                        f60339g = i19 % 128;
                        int i20 = i19 % 2;
                        c11 = '8';
                        break;
                    case 9:
                        c11 = '9';
                        break;
                    case 10:
                        c11 = 'a';
                        break;
                    case 11:
                        c11 = 'b';
                        break;
                    case 12:
                        int i21 = i12 + 101;
                        f60339g = i21 % 128;
                        int i22 = i21 % 2;
                        c11 = 'c';
                        break;
                    case 13:
                        c11 = 'd';
                        break;
                    case 14:
                        c11 = 'e';
                        break;
                    case 15:
                        c11 = 'f';
                        break;
                    default:
                        throw new IllegalArgumentException(String.valueOf((int) b13));
                }
                cArr[i18] = c11;
            }
            str = new String(cArr);
        }
        String string = jSONObject.put(strIntern, str).toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return new Metadata(l.encodeToByteArray(string));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x00b6 A[PHI: r4 r9
      0x00b6: PHI (r4v5 kotlin.Pair) = (r4v4 kotlin.Pair), (r4v24 kotlin.Pair) binds: [B:13:0x00b4, B:10:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x00b6: PHI (r9v5 int) = (r9v4 int), (r9v8 int) binds: [B:13:0x00b4, B:10:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x00b9 A[DONT_INVERT, PHI: r4 r9 r13
      0x00b9: PHI (r4v22 kotlin.Pair) = (r4v4 kotlin.Pair), (r4v24 kotlin.Pair) binds: [B:13:0x00b4, B:10:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x00b9: PHI (r9v7 int) = (r9v4 int), (r9v8 int) binds: [B:13:0x00b4, B:10:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x00b9: PHI (r13v23 char) = (r13v0 char), (r13v33 char) binds: [B:13:0x00b4, B:10:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:17:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:20:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:22:0x00da  */
    /* JADX WARN: Code duplicated, block: B:24:0x00de  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:34:0x0102  */
    /* JADX WARN: Code duplicated, block: B:36:0x0106  */
    /* JADX WARN: Code duplicated, block: B:37:0x0112  */
    /* JADX WARN: Code duplicated, block: B:39:0x0116  */
    /* JADX WARN: Code duplicated, block: B:40:0x011a  */
    /* JADX WARN: Code duplicated, block: B:42:0x011e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0121  */
    /* JADX WARN: Code duplicated, block: B:45:0x0125  */
    /* JADX WARN: Code duplicated, block: B:47:0x0131 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0134  */
    /* JADX WARN: Code duplicated, block: B:51:0x0138  */
    /* JADX WARN: Code duplicated, block: B:57:0x0144  */
    /* JADX WARN: Code duplicated, block: B:63:0x0150  */
    /* JADX WARN: Code duplicated, block: B:69:0x015c  */
    public static byte[] f(String str) throws Throwable {
        int i10;
        Pair pair;
        char cCharValue;
        byte b10;
        int i11;
        int i12;
        JSONObject jSONObject = new JSONObject(str);
        Object[] objArr = new Object[1];
        a(null, true, new int[]{32, 7, 59, 4}, objArr);
        int i13 = 0;
        String string = jSONObject.getString(((String) objArr[0]).intern());
        Intrinsics.checkNotNullExpressionValue(string, "");
        String strReplace = setNetworkAvailable.setY().replace(string, "");
        if (strReplace.length() % 2 != 0) {
            Object[] objArr2 = new Object[1];
            a(null, true, new int[]{39, 19, 177, 19}, objArr2);
            throw new IllegalArgumentException(((String) objArr2[0]).intern().toString());
        }
        byte[] bArr = new byte[strReplace.length() / 2];
        int i14 = 0;
        while (i14 < strReplace.length()) {
            int i15 = f60340h + 41;
            f60339g = i15 % 128;
            if (i15 % 2 != 0) {
                i10 = i14 * 3;
                pair = TuplesKt.to(Character.valueOf(strReplace.charAt(i14)), Character.valueOf(strReplace.charAt(i13)));
                cCharValue = ((Character) pair.getFirst()).charValue();
                if (cCharValue == ',') {
                    b10 = 0;
                } else if (cCharValue == '1') {
                    int i16 = f60339g + 13;
                    f60340h = i16 % 128;
                    int i17 = i16 % 2;
                    b10 = 1;
                } else {
                    if (cCharValue == '2') {
                        int i18 = f60340h + 7;
                        f60339g = i18 % 128;
                        int i19 = i18 % 2;
                    } else if (cCharValue == '3') {
                        b10 = 3;
                    } else if (cCharValue == '4') {
                        i12 = f60340h + 65;
                        f60339g = i12 % 128;
                        if (i12 % 2 != 0) {
                            b10 = 4;
                        }
                    } else if (cCharValue == '5') {
                        b10 = 5;
                    } else if (cCharValue == '6') {
                        int i20 = f60340h + 19;
                        f60339g = i20 % 128;
                        int i21 = i20 % 2;
                        b10 = 6;
                    } else if (cCharValue == '7') {
                        int i22 = f60340h + 79;
                        f60339g = i22 % 128;
                        int i23 = i22 % 2;
                        b10 = 7;
                    } else if (cCharValue == '8') {
                        b10 = 8;
                    } else if (cCharValue == '9') {
                        b10 = 9;
                    } else {
                        if (cCharValue == 'a') {
                            int i24 = f60339g + 35;
                            f60340h = i24 % 128;
                            int i25 = i24 % 2;
                        } else if (cCharValue == 'A') {
                            if (cCharValue != 'b' || cCharValue == 'B') {
                                b10 = 11;
                            } else if (cCharValue != 'c' || cCharValue == 'C') {
                                b10 = 12;
                            } else if (cCharValue != 'd' || cCharValue == 'D') {
                                b10 = 13;
                            } else if (cCharValue != 'e' || cCharValue == 'E') {
                                b10 = 14;
                            } else {
                                if (cCharValue != 'f' && cCharValue != 'F') {
                                    throw new IllegalArgumentException(String.valueOf(cCharValue));
                                }
                                b10 = 15;
                            }
                        }
                        b10 = 10;
                    }
                    b10 = 2;
                }
            } else {
                i10 = i14 / 2;
                pair = TuplesKt.to(Character.valueOf(strReplace.charAt(i14)), Character.valueOf(strReplace.charAt(i14 + 1)));
                cCharValue = ((Character) pair.getFirst()).charValue();
                if (cCharValue == '0') {
                    b10 = 0;
                } else if (cCharValue == '1') {
                    int i110 = f60339g + 13;
                    f60340h = i110 % 128;
                    int i111 = i110 % 2;
                    b10 = 1;
                } else {
                    if (cCharValue == '2') {
                        int i112 = f60340h + 7;
                        f60339g = i112 % 128;
                        int i113 = i112 % 2;
                    } else if (cCharValue == '3') {
                        b10 = 3;
                    } else if (cCharValue == '4') {
                        i12 = f60340h + 65;
                        f60339g = i12 % 128;
                        if (i12 % 2 != 0) {
                            b10 = 4;
                        }
                    } else if (cCharValue == '5') {
                        b10 = 5;
                    } else if (cCharValue == '6') {
                        int i26 = f60340h + 19;
                        f60339g = i26 % 128;
                        int i27 = i26 % 2;
                        b10 = 6;
                    } else if (cCharValue == '7') {
                        int i28 = f60340h + 79;
                        f60339g = i28 % 128;
                        int i29 = i28 % 2;
                        b10 = 7;
                    } else if (cCharValue == '8') {
                        b10 = 8;
                    } else if (cCharValue == '9') {
                        b10 = 9;
                    } else {
                        if (cCharValue == 'a') {
                            int i210 = f60339g + 35;
                            f60340h = i210 % 128;
                            int i211 = i210 % 2;
                        } else if (cCharValue == 'A') {
                            if (cCharValue != 'b') {
                                b10 = 11;
                            } else if (cCharValue != 'c') {
                                b10 = 12;
                            } else if (cCharValue != 'd') {
                                b10 = 13;
                            } else if (cCharValue != 'e') {
                                b10 = 14;
                            } else {
                                if (cCharValue != 'f') {
                                    throw new IllegalArgumentException(String.valueOf(cCharValue));
                                }
                                b10 = 15;
                            }
                        }
                        b10 = 10;
                    }
                    b10 = 2;
                }
            }
            byte bM5545constructorimpl = UByte.m5545constructorimpl(b10);
            int iM5570constructorimpl = UInt.m5570constructorimpl(UInt.m5570constructorimpl(UByte.m5545constructorimpl((byte) 16) & 255) * UInt.m5570constructorimpl(bM5545constructorimpl & 255));
            char cCharValue2 = ((Character) pair.getSecond()).charValue();
            if (cCharValue2 == '0') {
                i11 = 0;
            } else if (cCharValue2 == '1') {
                i11 = 1;
            } else if (cCharValue2 == '2') {
                i11 = 2;
            } else if (cCharValue2 == '3') {
                i11 = 3;
            } else if (cCharValue2 == '4') {
                i11 = 4;
            } else if (cCharValue2 == '5') {
                int i30 = f60340h + 21;
                f60339g = i30 % 128;
                int i31 = i30 % 2;
                i11 = 5;
            } else if (cCharValue2 == '6') {
                i11 = 6;
            } else if (cCharValue2 == '7') {
                i11 = 7;
            } else if (cCharValue2 == '8') {
                i11 = 8;
            } else if (cCharValue2 == '9') {
                i11 = 9;
            } else if (cCharValue2 == 'a') {
                i11 = 10;
            } else if (cCharValue2 == 'A') {
                int i32 = f60340h + 117;
                f60339g = i32 % 128;
                int i33 = i32 % 2;
                i11 = 10;
            } else if (cCharValue2 == 'b' || cCharValue2 == 'B') {
                i11 = 11;
            } else if (cCharValue2 == 'c' || cCharValue2 == 'C') {
                i11 = 12;
            } else if (cCharValue2 == 'd' || cCharValue2 == 'D') {
                i11 = 13;
            } else if (cCharValue2 == 'e' || cCharValue2 == 'E') {
                i11 = 14;
            } else {
                if (cCharValue2 != 'f') {
                    if (cCharValue2 != 'F') {
                        throw new IllegalArgumentException(String.valueOf(cCharValue2));
                    }
                    int i34 = f60340h + 51;
                    f60339g = i34 % 128;
                    int i35 = i34 % 2;
                }
                i11 = 15;
            }
            bArr[i10] = (byte) UInt.m5570constructorimpl(UInt.m5570constructorimpl(i11) + iM5570constructorimpl);
            i14 += 2;
            i13 = 0;
        }
        return bArr;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        getAmountFieldBgColor getamountfieldbgcolor;
        int i13 = ~i12;
        int i14 = ((i10 | i12) * 164) + (((~(i13 | i11)) | i10) * (-328)) + (i11 * (-163)) + (i10 * 165);
        int i15 = ~i10;
        int i16 = ~i11;
        int i17 = (((~(i10 | i13 | i11)) | (~(i12 | i16)) | (~(i15 | i16))) * 164) + i14;
        getAmountFieldBgColor getamountfieldbgcolor2 = null;
        if (i17 == 1) {
            setProgressBackgroundTintBlendMode setprogressbackgroundtintblendmode = (setProgressBackgroundTintBlendMode) objArr[0];
            byte[] bArr = (byte[]) objArr[1];
            byte[] bArr2 = (byte[]) objArr[2];
            setMinimumHeight setminimumheight = (setMinimumHeight) objArr[3];
            Intrinsics.checkNotNullParameter(bArr, "");
            Intrinsics.checkNotNullParameter(bArr2, "");
            Intrinsics.checkNotNullParameter(setminimumheight, "");
            getAmountFieldBgColor getamountfieldbgcolor3 = setprogressbackgroundtintblendmode.f60347d;
            if (getamountfieldbgcolor3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i18 = f60339g + 7;
                f60340h = i18 % 128;
                int i19 = i18 % 2;
                getamountfieldbgcolor3 = null;
            }
            getPinPadPortrait onFocusChangeListener = setprogressbackgroundtintblendmode.setOnFocusChangeListener(getamountfieldbgcolor3.setX(bArr, bArr2, setminimumheight));
            getAmountFieldBgColor getamountfieldbgcolor4 = setprogressbackgroundtintblendmode.f60347d;
            if (getamountfieldbgcolor4 == null) {
                int i20 = f60339g + 115;
                f60340h = i20 % 128;
                int i21 = i20 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                if (i21 == 0) {
                    int i22 = 32 / 0;
                }
            } else {
                int i23 = f60339g + 57;
                f60340h = i23 % 128;
                int i24 = i23 % 2;
                getamountfieldbgcolor2 = getamountfieldbgcolor4;
            }
            return getamountfieldbgcolor2.setY(onFocusChangeListener, setminimumheight);
        }
        setProgressBackgroundTintBlendMode setprogressbackgroundtintblendmode2 = (setProgressBackgroundTintBlendMode) objArr[0];
        setVerticalScrollbarPosition setverticalscrollbarposition = (setVerticalScrollbarPosition) objArr[1];
        byte[] bArr3 = (byte[]) objArr[2];
        byte[] bArr4 = (byte[]) objArr[3];
        byte[] bArr5 = (byte[]) objArr[4];
        byte[] bArr6 = (byte[]) objArr[5];
        int i25 = f60340h + 43;
        f60339g = i25 % 128;
        if (i25 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setverticalscrollbarposition, "");
            Intrinsics.checkNotNullParameter(bArr3, "");
            Intrinsics.checkNotNullParameter(bArr4, "");
            Intrinsics.checkNotNullParameter(bArr5, "");
            Intrinsics.checkNotNullParameter(bArr6, "");
            getAmountFieldBgColor getamountfieldbgcolor5 = setprogressbackgroundtintblendmode2.f60347d;
            throw null;
        }
        Intrinsics.checkNotNullParameter(setverticalscrollbarposition, "");
        Intrinsics.checkNotNullParameter(bArr3, "");
        Intrinsics.checkNotNullParameter(bArr4, "");
        Intrinsics.checkNotNullParameter(bArr5, "");
        Intrinsics.checkNotNullParameter(bArr6, "");
        getAmountFieldBgColor getamountfieldbgcolor6 = setprogressbackgroundtintblendmode2.f60347d;
        if (getamountfieldbgcolor6 == null) {
            int i26 = f60339g + 101;
            f60340h = i26 % 128;
            int i27 = i26 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            getamountfieldbgcolor = null;
        } else {
            getamountfieldbgcolor = getamountfieldbgcolor6;
        }
        return (setOnKeyListener) getamountfieldbgcolor.setY(setverticalscrollbarposition, bArr3, bArr4, bArr5, bArr6);
    }

    @NotNull
    public final Pair<byte[], byte[]> setDividerPadding(@NotNull byte[] bArr, @NotNull setLabelFor setlabelfor) throws Throwable {
        int i10 = f60340h + 121;
        f60339g = i10 % 128;
        getAmountFieldBgColor getamountfieldbgcolor = null;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bArr, "");
            Intrinsics.checkNotNullParameter(setlabelfor, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(setlabelfor, "");
        getAmountFieldBgColor getamountfieldbgcolor2 = this.f60347d;
        if (getamountfieldbgcolor2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            getamountfieldbgcolor2 = null;
        }
        getPinPadPortrait onFocusChangeListener = setOnFocusChangeListener(getamountfieldbgcolor2.setX(bArr, setlabelfor));
        getAmountFieldBgColor getamountfieldbgcolor3 = this.f60347d;
        if (getamountfieldbgcolor3 == null) {
            int i11 = f60339g + 65;
            f60340h = i11 % 128;
            int i12 = i11 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            getamountfieldbgcolor = getamountfieldbgcolor3;
        }
        return getamountfieldbgcolor.setOnFocusChangeListener(onFocusChangeListener);
    }

    @NotNull
    public final setMarqueeRepeatLimit setOnFocusChangeListener(@NotNull getAmountFieldBgColor getamountfieldbgcolor) {
        Intrinsics.checkNotNullParameter(getamountfieldbgcolor, "");
        this.f60347d = getamountfieldbgcolor;
        if (getamountfieldbgcolor == null) {
            int i10 = f60340h + 73;
            f60339g = i10 % 128;
            if (i10 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            getamountfieldbgcolor = null;
        } else {
            int i11 = f60339g + 17;
            f60340h = i11 % 128;
            int i12 = i11 % 2;
        }
        getamountfieldbgcolor.setX(this.f60345b, this.f60346c);
        setMarqueeRepeatLimit setmarqueerepeatlimit = new setMarqueeRepeatLimit();
        int i13 = f60340h + 63;
        f60339g = i13 % 128;
        int i14 = i13 % 2;
        return setmarqueerepeatlimit;
    }

    @NotNull
    public final byte[] setX() {
        getAmountFieldBgColor getamountfieldbgcolor = this.f60347d;
        if (getamountfieldbgcolor == null) {
            int i10 = f60340h + 119;
            f60339g = i10 % 128;
            int i11 = i10 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i11 != 0) {
                int i12 = 2 / 0;
            }
            getamountfieldbgcolor = null;
        }
        byte[] x4 = getamountfieldbgcolor.setX(64);
        int i13 = f60340h + 47;
        f60339g = i13 % 128;
        int i14 = i13 % 2;
        return x4;
    }

    @NotNull
    public final setWillNotDraw setY(@NotNull setVerticalScrollbarPosition setverticalscrollbarposition, @NotNull byte[] bArr, @NotNull byte[] bArr2, @NotNull byte[] bArr3, @NotNull byte[] bArr4) {
        Intrinsics.checkNotNullParameter(setverticalscrollbarposition, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        Intrinsics.checkNotNullParameter(bArr3, "");
        Intrinsics.checkNotNullParameter(bArr4, "");
        getAmountFieldBgColor getamountfieldbgcolor = this.f60347d;
        if (getamountfieldbgcolor == null) {
            int i10 = f60340h + 33;
            f60339g = i10 % 128;
            int i11 = i10 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            getamountfieldbgcolor = null;
        }
        setWillNotDraw setwillnotdraw = (setWillNotDraw) getamountfieldbgcolor.setY(setverticalscrollbarposition, bArr, bArr2, bArr3, bArr4);
        int i12 = f60340h + 119;
        f60339g = i12 % 128;
        int i13 = i12 % 2;
        return setwillnotdraw;
    }

    @NotNull
    public final setOnKeyListener setX(@NotNull setVerticalScrollbarPosition setverticalscrollbarposition, @NotNull byte[] bArr, @NotNull byte[] bArr2, @NotNull byte[] bArr3, @NotNull byte[] bArr4) {
        return (setOnKeyListener) setCompoundDrawableTintBlendMode(new Object[]{this, setverticalscrollbarposition, bArr, bArr2, bArr3, bArr4}, 2094592149, -2094592149, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    @NotNull
    public final setFocusedByDefault setDividerPadding(@NotNull setVerticalScrollbarPosition setverticalscrollbarposition, @NotNull UUID uuid, @NotNull byte[] bArr) {
        getAmountFieldBgColor getamountfieldbgcolor;
        int i10 = f60340h + 17;
        f60339g = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setverticalscrollbarposition, "");
            Intrinsics.checkNotNullParameter(uuid, "");
            Intrinsics.checkNotNullParameter(bArr, "");
            getamountfieldbgcolor = this.f60347d;
            int i11 = 83 / 0;
            if (getamountfieldbgcolor == null) {
                int i12 = f60339g + 105;
                f60340h = i12 % 128;
                int i13 = i12 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                getamountfieldbgcolor = null;
            }
        } else {
            Intrinsics.checkNotNullParameter(setverticalscrollbarposition, "");
            Intrinsics.checkNotNullParameter(uuid, "");
            Intrinsics.checkNotNullParameter(bArr, "");
            getamountfieldbgcolor = this.f60347d;
            if (getamountfieldbgcolor == null) {
                int i14 = f60339g + 105;
                f60340h = i14 % 128;
                int i15 = i14 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                getamountfieldbgcolor = null;
            }
        }
        return getamountfieldbgcolor.setX(setverticalscrollbarposition, uuid, bArr);
    }

    @NotNull
    public final getPinPadPortrait setOnFocusChangeListener(@NotNull setInterpolator setinterpolator) throws Throwable {
        getAmountFieldBgColor getamountfieldbgcolor;
        setScaleX setscalex = this.f60344a;
        int i10 = f60339g + 121;
        f60340h = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(setinterpolator, "");
        getAmountFieldBgColor getamountfieldbgcolor2 = this.f60347d;
        if (getamountfieldbgcolor2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i12 = f60340h + 31;
            f60339g = i12 % 128;
            int i13 = i12 % 2;
            getamountfieldbgcolor2 = null;
        }
        if (getamountfieldbgcolor2.setCompoundDrawableTintBlendMode((String) setInterpolator.setCompoundDrawableTintBlendMode(new Object[]{setinterpolator}, -767659663, 767659667, System.identityHashCode(setinterpolator)))) {
            Object[] objArr = new Object[1];
            a("\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001", false, new int[]{14, 13, 55, 11}, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr2 = new Object[1];
            a("\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000", false, new int[]{0, 14, 0, 0}, objArr2);
            sb2.append(((String) objArr2[0]).intern());
            sb2.append((String) setInterpolator.setCompoundDrawableTintBlendMode(new Object[]{setinterpolator}, -767659663, 767659667, System.identityHashCode(setinterpolator)));
            Object[] objArr3 = new Object[1];
            b("ꇋ픴䣀ﾀ獤\ue668ᶫ", 29879 - TextUtils.getOffsetAfter("", 0), objArr3);
            sb2.append(((String) objArr3[0]).intern());
            sb2.append((String) setInterpolator.setCompoundDrawableTintBlendMode(new Object[]{setinterpolator}, -395916299, 395916300, System.identityHashCode(setinterpolator)));
            sb2.append('\n');
            String string = sb2.toString();
            int i14 = f60340h + 107;
            f60339g = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 36 / 0;
            }
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{Intrinsics.stringPlus(strIntern, string)}, 2065174743, -2065174734, (int) System.currentTimeMillis());
            Metadata metadata = (Metadata) setInterpolator.setCompoundDrawableTintBlendMode(new Object[]{setinterpolator}, -1644707261, 1644707263, System.identityHashCode(setinterpolator));
            try {
                setForegroundTintBlendMode setforegroundtintblendmode = (setForegroundTintBlendMode) setScaleX.setX(new Object[]{setscalex, (byte[]) Metadata.setY(new Object[]{metadata}, 1982236974, -1982236973, System.identityHashCode(metadata))}, -750789259, 750789260, System.identityHashCode(setscalex));
                Map mutableMap = q.toMutableMap((Map) setInterpolator.setCompoundDrawableTintBlendMode(new Object[]{setinterpolator}, 1992993716, -1992993716, System.identityHashCode(setinterpolator)));
                Object[] objArr4 = new Object[1];
                a("\u0001\u0000\u0000\u0000\u0001", false, new int[]{27, 5, 0, 5}, objArr4);
                Object[] objArr5 = new Object[1];
                b("ꆂ쩑癑\ue248๘메♏刕\ufe6d橏陇ɑ", 27646 - TextUtils.lastIndexOf("", '0', 0, 0), objArr5);
                String strIntern2 = ((String) objArr5[0]).intern();
                Object[] objArr6 = new Object[1];
                b("ꆠ汌㩋졚陜ꑓ牎^칀鱋ꩍ砱ٵ푽\ue26f", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 52733, objArr6);
                Object[] objArr7 = new Object[1];
                b("ꆀ횡侤쒭綽\uf2ba", 30467 - Color.alpha(0), objArr7);
                String strIntern3 = ((String) objArr7[0]).intern();
                Object[] objArr8 = new Object[1];
                b("ꆠ汌㩋졚陜ꑓ牎^칀鱋ꩍ砱ٵ푽\ue26f", View.resolveSize(0, 0) + 52733, objArr8);
                q.putAll(mutableMap, CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(((String) objArr4[0]).intern(), ((UUID) setForegroundTintBlendMode.setCompoundDrawableTintBlendMode(new Object[]{setforegroundtintblendmode}, -428723424, 428723425, System.identityHashCode(setforegroundtintblendmode))).toString()), TuplesKt.to(strIntern2, ((String) objArr6[0]).intern()), TuplesKt.to(strIntern3, ((String) objArr8[0]).intern())}));
                setInterpolator setinterpolator2 = new setInterpolator(mutableMap, (String) setInterpolator.setCompoundDrawableTintBlendMode(new Object[]{setinterpolator}, -767659663, 767659667, System.identityHashCode(setinterpolator)), e(setforegroundtintblendmode), (String) setInterpolator.setCompoundDrawableTintBlendMode(new Object[]{setinterpolator}, -2059749119, 2059749122, System.identityHashCode(setinterpolator)), (TransactionNotAuthorisedReason) setInterpolator.setCompoundDrawableTintBlendMode(new Object[]{setinterpolator}, -130991403, 130991408, System.identityHashCode(setinterpolator)));
                try {
                    getAmountFieldBgColor getamountfieldbgcolor3 = this.f60347d;
                    if (getamountfieldbgcolor3 == null) {
                        int i16 = f60339g + 113;
                        f60340h = i16 % 128;
                        if (i16 % 2 != 0) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            getamountfieldbgcolor3 = null;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            throw null;
                        }
                    }
                    getPinPadPortrait y7 = getamountfieldbgcolor3.setY(setinterpolator2);
                    Object[] objArr9 = new Object[1];
                    a("\u0001\u0000\u0000\u0000\u0001", false, new int[]{27, 5, 0, 5}, objArr9);
                    String str = (String) getPinPadPortrait.setCompoundDrawableTintBlendMode(new Object[]{y7, ((String) objArr9[0]).intern()}, 2027246223, -2027246223, System.identityHashCode(y7));
                    if (str == null) {
                        int i17 = f60340h + 83;
                        f60339g = i17 % 128;
                        int i18 = i17 % 2;
                    } else {
                        byte[] bArrF = f((String) getPinPadPortrait.setCompoundDrawableTintBlendMode(new Object[]{y7}, 1915342845, -1915342844, System.identityHashCode(y7)));
                        UUID uuidFromString = UUID.fromString(str);
                        Intrinsics.checkNotNullExpressionValue(uuidFromString, "");
                        byte[] bArrEncodeToByteArray = l.encodeToByteArray(new String((byte[]) setScaleX.setX(new Object[]{setscalex, bArrF, uuidFromString}, -794665330, 794665330, System.identityHashCode(setscalex)), Charsets.UTF_8));
                        Object[] objArr10 = new Object[1];
                        b("ꆳ펅䗼\uf78e椧鬝൬뺲ゆꋢ퓀䘳\uf847樀", 29220 - TextUtils.indexOf((CharSequence) "", '0'), objArr10);
                        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{Intrinsics.stringPlus(((String) objArr10[0]).intern(), bArrEncodeToByteArray)}, 2065174743, -2065174734, (int) System.currentTimeMillis());
                        y7 = new getPinPadPortrait((Map) getPinPadPortrait.setCompoundDrawableTintBlendMode(new Object[]{y7}, -1843161111, 1843161113, System.identityHashCode(y7)), new Metadata(bArrEncodeToByteArray), ((Integer) getPinPadPortrait.setCompoundDrawableTintBlendMode(new Object[]{y7}, -717849782, 717849786, System.identityHashCode(y7))).intValue());
                    }
                    CloseableKt.closeFinally(setinterpolator2, null);
                    int i19 = f60339g + 113;
                    f60340h = i19 % 128;
                    if (i19 % 2 != 0) {
                        CloseableKt.closeFinally(metadata, null);
                        return y7;
                    }
                    CloseableKt.closeFinally(metadata, null);
                    throw null;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(setinterpolator2, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    CloseableKt.closeFinally(metadata, th4);
                    throw th5;
                }
            }
        }
        getAmountFieldBgColor getamountfieldbgcolor4 = this.f60347d;
        if (getamountfieldbgcolor4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            getamountfieldbgcolor = null;
        } else {
            getamountfieldbgcolor = getamountfieldbgcolor4;
        }
        return getamountfieldbgcolor.setY(setinterpolator);
    }

    @NotNull
    public final AuthorizationGrant setCompoundDrawableTintBlendMode(@NotNull setVerticalScrollbarPosition setverticalscrollbarposition, @NotNull byte[] bArr, @NotNull String str) {
        Intrinsics.checkNotNullParameter(setverticalscrollbarposition, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(str, "");
        getAmountFieldBgColor getamountfieldbgcolor = this.f60347d;
        if (getamountfieldbgcolor == null) {
            int i10 = f60340h + 15;
            f60339g = i10 % 128;
            int i11 = i10 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i11 != 0) {
                int i12 = 41 / 0;
            }
            int i13 = f60339g + 41;
            f60340h = i13 % 128;
            int i14 = i13 % 2;
            getamountfieldbgcolor = null;
        }
        return getamountfieldbgcolor.setDividerPadding(setverticalscrollbarposition, bArr, str);
    }

    @Nullable
    public final String setOnFocusChangeListener() {
        int i10 = f60340h + 37;
        int i11 = i10 % 128;
        f60339g = i11;
        int i12 = i10 % 2;
        getAmountFieldBgColor getamountfieldbgcolor = this.f60347d;
        if (getamountfieldbgcolor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            getamountfieldbgcolor = null;
        } else {
            int i13 = i11 + 7;
            f60340h = i13 % 128;
            int i14 = i13 % 2;
        }
        return getamountfieldbgcolor.setCompoundDrawableTintBlendMode();
    }

    @NotNull
    public final getVersion setOnFocusChangeListener(@NotNull byte[] bArr, @NotNull byte[] bArr2, @NotNull setMinimumHeight setminimumheight) {
        return (getVersion) setCompoundDrawableTintBlendMode(new Object[]{this, bArr, bArr2, setminimumheight}, -2089299634, 2089299635, System.identityHashCode(this));
    }
}
