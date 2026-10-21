package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/pb;", "Lcom/mypinpad/tsdk/i/pf;", "", "m", "Ljava/lang/String;", "setOnFocusChangeListener", "()Ljava/lang/String;", "setDividerPadding"}, k = 1, mv = {1, 8, 0})
public final class pb extends pf {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f57650n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f57651o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f57652p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final byte[] f57653q = null;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final String setDividerPadding;

    static {
        b();
        f57651o = 0;
        f57652p = 1;
        f57650n = -443080046;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pb(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
        if ((i10 & 1) != 0) {
            Object[] objArr = new Object[1];
            c(11 - Color.red(0), 176 - TextUtils.lastIndexOf("", '0', 0), 11 - View.MeasureSpec.makeMeasureSpec(0, 0), "�\ufffe\f\u0002\u0005\ufffa\u0002\r\u0002\u0007￢", true, objArr);
            str = ((String) objArr[0]).intern();
        }
        Intrinsics.checkNotNullParameter(str, "");
        Object[] objArr2 = new Object[1];
        c(23 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 160, View.resolveSizeAndState(0, 0, 0) + 3, "ￛ\uffd8ￚ\ufff3\u0018\u001e\u0013\u000b\u0016\u0013\u001d\u000f\uffef \u000f\u0018\u001eￗ\ufffe�￮\ufff5ￗ", false, objArr2);
        super(null, ((String) objArr2[0]).intern(), null, 0L, 13, null);
        this.setDividerPadding = str;
    }

    public static void b() {
        f57653q = new byte[]{100, -100, -71, -56};
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0209  */
    /* JADX WARN: Code duplicated, block: B:45:0x020a  */
    public static void c(int i10, int i11, int i12, String str, boolean z10, Object[] objArr) throws Throwable {
        Throwable cause;
        char[] charArray = str.toCharArray();
        getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
        char[] cArr = new char[i10];
        getnavbartitlestring.setY = 0;
        while (true) {
            int i13 = getnavbartitlestring.setY;
            if (i13 >= i10) {
                break;
            }
            int i14 = f57651o + 85;
            f57652p = i14 % 128;
            int i15 = i14 % 2;
            char c10 = charArray[i13];
            getnavbartitlestring.setCompoundDrawableTintBlendMode = c10;
            char c11 = (char) (i11 + c10);
            cArr[i13] = c11;
            try {
                Object[] objArr2 = {Integer.valueOf(c11), Integer.valueOf(f57650n)};
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(133002375);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) Color.red(0), 41 - View.getDefaultSize(0, 0), 483 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    d(b10, b11, (byte) (b11 + 1), objArr3);
                    String str2 = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(133002375, method);
                }
                cArr[i13] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {getnavbartitlestring, getnavbartitlestring};
                Object method2 = map.get(1860518195);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 55966), Color.rgb(0, 0, 0) + 16777259, (ViewConfiguration.getWindowTouchSlop() >> 8) + 2268);
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    d(b12, b13, b13, objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(1860518195, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                int i16 = f57652p + 17;
                f57651o = i16 % 128;
                int i17 = i16 % 2;
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
        if (i12 > 0) {
            getnavbartitlestring.setOnFocusChangeListener = i12;
            char[] cArr2 = new char[i10];
            System.arraycopy(cArr, 0, cArr2, 0, i10);
            int i18 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, 0, cArr, i10 - i18, i18);
            int i19 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, i19, cArr, 0, i10 - i19);
        }
        if (z10) {
            char[] cArr3 = new char[i10];
            getnavbartitlestring.setY = 0;
            while (true) {
                int i20 = getnavbartitlestring.setY;
                if (i20 >= i10) {
                    break;
                }
                int i21 = f57651o + 107;
                f57652p = i21 % 128;
                if (i21 % 2 == 0) {
                    cArr3[i20] = cArr[(i10 * i20) << 1];
                    Object[] objArr6 = {getnavbartitlestring, getnavbartitlestring};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method3 = map2.get(1860518195);
                    if (method3 == null) {
                        Class cls4 = (Class) setTextScaleX.setX((char) (KeyEvent.normalizeMetaState(0) + 55966), 43 - Color.alpha(0), ((byte) KeyEvent.getModifierMetaStateMask()) + 2269);
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        Object[] objArr7 = new Object[1];
                        d(b14, b15, b15, objArr7);
                        method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                        map2.put(1860518195, method3);
                    }
                    ((Method) method3).invoke(null, objArr6);
                } else {
                    cArr3[i20] = cArr[(i10 - i20) - 1];
                    Object[] objArr8 = {getnavbartitlestring, getnavbartitlestring};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method4 = map3.get(1860518195);
                    if (method4 == null) {
                        Class cls5 = (Class) setTextScaleX.setX((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 55966), 42 - ExpandableListView.getPackedPositionChild(0L), 2268 - View.combineMeasuredStates(0, 0));
                        byte b16 = (byte) 0;
                        byte b17 = b16;
                        Object[] objArr9 = new Object[1];
                        d(b16, b17, b17, objArr9);
                        method4 = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                        map3.put(1860518195, method4);
                    }
                    ((Method) method4).invoke(null, objArr8);
                }
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
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
    public static void d(byte r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r9 = r9 + 65
            int r8 = r8 * 3
            int r8 = r8 + 1
            byte[] r0 = new byte[r8]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.pb.f57653q
            if (r2 != 0) goto L15
            r3 = r7
            r9 = r8
            r4 = r1
            goto L2a
        L15:
            r3 = r1
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r0[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r1)
            r10[r1] = r7
            return
        L25:
            r3 = r2[r7]
            r6 = r9
            r9 = r8
            r8 = r6
        L2a:
            int r7 = r7 + 1
            int r8 = r8 + r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.pb.d(byte, byte, byte, java.lang.Object[]):void");
    }

    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from getter */
    public final String getSetDividerPadding() {
        return this.setDividerPadding;
    }

    public pb() {
        this(null, 1, null);
    }
}
