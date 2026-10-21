package com.mypinpad.tsdk.isolation;

import ak.b;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nTerminalRedactedLogging.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalRedactedLogging.kt\ncom/mypinpad/tsdk/internal/common/logging/TerminalRedactedLoggingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
public final class mw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f57158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f57159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f57160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f57161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f57162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f57163f = null;

    static {
        c();
        f57161d = 0;
        f57162e = 1;
        f57159b = 0;
        f57160c = 1;
        f57158a = -443079990;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:40:0x01bd  */
    public static void a(int i10, int i11, int i12, String str, Object[] objArr) throws Throwable {
        char[] charArray;
        Throwable cause;
        int i13 = f57162e + 13;
        f57161d = i13 % 128;
        int i14 = 2;
        int i15 = 0;
        if (i13 % 2 != 0) {
            charArray = str.toCharArray();
            int i16 = 40 / 0;
        } else {
            charArray = str.toCharArray();
        }
        getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
        char[] cArr = new char[i10];
        getnavbartitlestring.setY = 0;
        while (true) {
            int i17 = getnavbartitlestring.setY;
            if (i17 >= i10) {
                break;
            }
            char c10 = charArray[i17];
            getnavbartitlestring.setCompoundDrawableTintBlendMode = c10;
            char c11 = (char) (i11 + c10);
            cArr[i17] = c11;
            try {
                Object[] objArr2 = new Object[i14];
                objArr2[1] = Integer.valueOf(f57158a);
                objArr2[i15] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(133002375);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) Drawable.resolveOpacity(i15, i15), ((Process.getThreadPriority(i15) + 20) >> 6) + 41, TextUtils.indexOf("", "") + 483);
                    byte b10 = (byte) i15;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    b(b11, (byte) (b11 - 1), b10, objArr3);
                    String str2 = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(133002375, method);
                }
                cArr[i17] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {getnavbartitlestring, getnavbartitlestring};
                Object method2 = map.get(1860518195);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (55967 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 43 - TextUtils.getOffsetBefore("", 0), 2268 - (Process.myPid() >> 22));
                    byte b12 = (byte) 1;
                    byte b13 = (byte) (b12 - 1);
                    Object[] objArr5 = new Object[1];
                    b(b13, (byte) (b13 - 1), b12, objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(1860518195, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                i14 = 2;
                i15 = 0;
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
            int i18 = f57161d + 37;
            f57162e = i18 % 128;
            int i19 = i18 % 2;
            getnavbartitlestring.setOnFocusChangeListener = i12;
            char[] cArr2 = new char[i10];
            System.arraycopy(cArr, 0, cArr2, 0, i10);
            int i20 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, 0, cArr, i10 - i20, i20);
            int i21 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, i21, cArr, 0, i10 - i21);
            int i22 = f57161d + 33;
            f57162e = i22 % 128;
            int i23 = i22 % 2;
        }
        char[] cArr3 = new char[i10];
        getnavbartitlestring.setY = 0;
        while (true) {
            int i24 = getnavbartitlestring.setY;
            if (i24 >= i10) {
                objArr[0] = new String(cArr3);
                return;
            }
            cArr3[i24] = cArr[(i10 - i24) - 1];
            Object[] objArr6 = {getnavbartitlestring, getnavbartitlestring};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1860518195);
            if (method3 == null) {
                Class cls4 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 55966), 43 - KeyEvent.normalizeMetaState(0), Drawable.resolveOpacity(0, 0) + 2268);
                byte b14 = (byte) 1;
                byte b15 = (byte) (b14 - 1);
                Object[] objArr7 = new Object[1];
                b(b15, (byte) (b15 - 1), b14, objArr7);
                method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1860518195, method3);
            }
            ((Method) method3).invoke(null, objArr6);
        }
    }

    public static void b(byte b10, byte b11, int i10, Object[] objArr) {
        int i11 = b11 + 4;
        int i12 = b10 * 2;
        int i13 = 66 - i10;
        byte[] bArr = new byte[1 - i12];
        int i14 = 0 - i12;
        int i15 = -1;
        byte[] bArr2 = f57163f;
        if (bArr2 == null) {
            i13 = i14 + (-i13);
            i14 = i14;
            i11 = i11;
        }
        while (true) {
            i15++;
            bArr[i15] = (byte) i13;
            int i16 = i11 + 1;
            if (i15 == i14) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            byte b12 = bArr2[i16];
            i13 += -b12;
            i14 = i14;
            i11 = i16;
        }
    }

    public static void c() {
        f57163f = new byte[]{122, -107, 66, -93};
    }

    public static final getDynamicButtonIconTextSpacingDp d(rs rsVar) throws Throwable {
        String string;
        int i10;
        String string2;
        if (!(rsVar instanceof rr)) {
            if (rsVar instanceof rn) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(a7.setDividerPadding.ordinal());
                Object[] objArr = new Object[1];
                a(2 - KeyEvent.normalizeMetaState(0), 56 - TextUtils.indexOf("", ""), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1, "\ufffa\u0006", objArr);
                sb2.append(((String) objArr[0]).intern());
                rn rnVar = (rn) rsVar;
                sb2.append(((rq) rn.setCompoundDrawableTintBlendMode(new Object[]{rnVar}, -1499104483, 1499104483, System.identityHashCode(rnVar))).ordinal());
                string = sb2.toString();
                i10 = f57159b + 33;
            } else {
                if (!(rsVar instanceof rw)) {
                    throw new NoWhenBranchMatchedException();
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(a7.setY.ordinal());
                Object[] objArr2 = new Object[1];
                a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2, (ViewConfiguration.getJumpTapTimeout() >> 16) + 56, Drawable.resolveOpacity(0, 0) + 2, "\ufffa\u0006", objArr2);
                sb3.append(((String) objArr2[0]).intern());
                rw rwVar = (rw) rsVar;
                sb3.append(((ro) rw.setX(new Object[]{rwVar}, 677881860, -677881859, System.identityHashCode(rwVar))).ordinal());
                Object[] objArr3 = new Object[1];
                a(2 - (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 57, 1 - TextUtils.lastIndexOf("", '0'), "\ufffa\u0006", objArr3);
                sb3.append(((String) objArr3[0]).intern());
                sb3.append((qw) rw.setX(new Object[]{rwVar}, -1769449695, 1769449695, System.identityHashCode(rwVar)));
                string = sb3.toString();
            }
            return getDisplayExponent.setY(string);
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(a7.setCompoundDrawableTintBlendMode.ordinal());
        Object[] objArr4 = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0', 0) + 3, 56 - TextUtils.indexOf("", ""), 2 - View.resolveSizeAndState(0, 0, 0), "\ufffa\u0006", objArr4);
        sb4.append(((String) objArr4[0]).intern());
        rr rrVar = (rr) rsVar;
        ru ruVar = (ru) rr.setX(new Object[]{rrVar}, -1519171482, 1519171486, System.identityHashCode(rrVar));
        int i11 = f57159b + 53;
        f57160c = i11 % 128;
        int i12 = i11 % 2;
        String x4 = null;
        if (ruVar instanceof rp) {
            StringBuilder sb5 = new StringBuilder();
            Object[] objArr5 = new Object[1];
            a(TextUtils.indexOf("", "", 0) + 3, Process.getGidForName("") + 100, 3 - (ViewConfiguration.getKeyRepeatDelay() >> 16), "ￏ\u0010#", objArr5);
            sb5.append(((String) objArr5[0]).intern());
            rp rpVar = (rp) ruVar;
            sb5.append(getDisplayExponent.setCompoundDrawableTintBlendMode((sg) rp.setY(new Object[]{rpVar}, -1859324063, 1859324063, System.identityHashCode(rpVar))));
            string2 = sb5.toString();
            int i13 = f57160c + 61;
            f57159b = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
            }
        } else {
            if (!(ruVar instanceof rt)) {
                throw new NoWhenBranchMatchedException();
            }
            StringBuilder sb6 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            a(TextUtils.indexOf((CharSequence) "", '0', 0) + 5, 106 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 5, "\uffc8\t\u0016\u001c", objArr6);
            sb6.append(((String) objArr6[0]).intern());
            rt rtVar = (rt) ruVar;
            rv rvVar = (rv) rt.setY(new Object[]{rtVar}, -1450751029, 1450751030, System.identityHashCode(rtVar));
            if (rvVar != null) {
                x4 = getDisplayExponent.setCompoundDrawableTintBlendMode(rvVar).setX();
                int i14 = f57160c + 119;
                f57159b = i14 % 128;
                int i15 = i14 % 2;
            }
            sb6.append(x4);
            string2 = sb6.toString();
        }
        sb4.append(string2);
        string = sb4.toString();
        i10 = f57159b + 71;
        f57160c = i10 % 128;
        int i16 = i10 % 2;
        return getDisplayExponent.setY(string);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:12:0x004c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0050  */
    /* JADX WARN: Code duplicated, block: B:16:0x0056  */
    /* JADX WARN: Code duplicated, block: B:19:0x0097  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a3  */
    public static final getDynamicButtonIconTextSpacingDp e(Throwable th2) throws Throwable {
        String string;
        Throwable cause;
        String string2;
        int i10 = f57160c;
        int i11 = i10 + 25;
        f57159b = i11 % 128;
        int i12 = i11 % 2;
        String str = "";
        if (th2 != null) {
            int i13 = i10 + 69;
            f57159b = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 2 / 0;
                if (th2 instanceof component22) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(b.stackTraceToString(th2));
                    sb2.append(AbstractJsonLexerKt.COMMA);
                    sb2.append(th2.getMessage());
                    string = sb2.toString();
                    int i15 = f57160c + 15;
                    f57159b = i15 % 128;
                    int i16 = i15 % 2;
                } else if (th2 instanceof ExecutionException) {
                    cause = th2.getCause();
                    if (cause != null) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(b.stackTraceToString(cause));
                        Object[] objArr = new Object[1];
                        a(2 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 56, KeyEvent.keyCodeFromString("") + 2, "\ufffa\u0006", objArr);
                        sb3.append(((String) objArr[0]).intern());
                        sb3.append(cause.getMessage());
                        string2 = sb3.toString();
                        if (string2 == null) {
                            string = string2;
                        }
                    }
                    int i17 = f57160c + 33;
                    f57159b = i17 % 128;
                    int i18 = i17 % 2;
                    string = th2.getMessage();
                } else {
                    string = th2.getMessage();
                }
            } else if (th2 instanceof component22) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(b.stackTraceToString(th2));
                sb4.append(AbstractJsonLexerKt.COMMA);
                sb4.append(th2.getMessage());
                string = sb4.toString();
                int i19 = f57160c + 15;
                f57159b = i19 % 128;
                int i110 = i19 % 2;
            } else if (th2 instanceof ExecutionException) {
                string = th2.getMessage();
            } else {
                cause = th2.getCause();
                if (cause != null) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(b.stackTraceToString(cause));
                    Object[] objArr2 = new Object[1];
                    a(2 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 56, KeyEvent.keyCodeFromString("") + 2, "\ufffa\u0006", objArr2);
                    sb5.append(((String) objArr2[0]).intern());
                    sb5.append(cause.getMessage());
                    string2 = sb5.toString();
                    if (string2 == null) {
                        string = string2;
                    }
                }
                int i111 = f57160c + 33;
                f57159b = i111 % 128;
                int i112 = i111 % 2;
                string = th2.getMessage();
            }
        } else {
            string = null;
        }
        if (string == null) {
            int i20 = f57159b + 61;
            f57160c = i20 % 128;
            if (i20 % 2 == 0) {
                int i21 = 84 / 0;
            }
        } else {
            str = string;
        }
        getDynamicButtonIconTextSpacingDp y7 = getDisplayExponent.setY(str);
        int i22 = f57160c + 109;
        f57159b = i22 % 128;
        if (i22 % 2 == 0) {
            return y7;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> getDynamicButtonIconTextSpacingDp setDividerPadding(T t10) throws Throwable {
        if (!(!(t10 instanceof rs))) {
            int i10 = f57160c + 21;
            f57159b = i10 % 128;
            if (i10 % 2 != 0) {
                d((rs) t10);
                throw null;
            }
            getDynamicButtonIconTextSpacingDp getdynamicbuttonicontextspacingdpD = d((rs) t10);
            int i11 = f57159b + 35;
            f57160c = i11 % 128;
            if (i11 % 2 != 0) {
                return getdynamicbuttonicontextspacingdpD;
            }
            throw null;
        }
        if (t10 instanceof setSystemGestureExclusionRects) {
            int i12 = f57159b + 41;
            f57160c = i12 % 128;
            if (i12 % 2 != 0) {
                return (getDynamicButtonIconTextSpacingDp) setOnFocusChangeListener(new Object[]{(setSystemGestureExclusionRects) t10}, -92801076, 92801076, (int) System.currentTimeMillis());
            }
            throw null;
        }
        if (!(t10 instanceof Throwable)) {
            return getDisplayExponent.setY("");
        }
        int i13 = f57159b + 99;
        f57160c = i13 % 128;
        if (i13 % 2 != 0) {
            return e((Throwable) t10);
        }
        e((Throwable) t10);
        throw null;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        z6 z6Var;
        int i13;
        setSystemGestureExclusionRects setsystemgestureexclusionrects = (setSystemGestureExclusionRects) objArr[0];
        if (!(setsystemgestureexclusionrects instanceof setAccessibilityHeading)) {
            if (!(!(setsystemgestureexclusionrects instanceof description))) {
                z6Var = z6.setOnFocusChangeListener;
                i13 = f57159b + 1;
            } else if (setsystemgestureexclusionrects instanceof component21) {
                z6Var = z6.setCompoundDrawableTintBlendMode;
            } else if (setsystemgestureexclusionrects instanceof setHovered) {
                int i14 = f57160c + 3;
                f57159b = i14 % 128;
                int i15 = i14 % 2;
                z6Var = z6.setDividerPadding;
                i13 = f57159b + 67;
            } else if (setsystemgestureexclusionrects instanceof setAutoSizeTextTypeUniformWithConfiguration) {
                z6Var = z6.setY;
            } else if (setsystemgestureexclusionrects instanceof setHintTextColor) {
                int i16 = f57159b + 39;
                f57160c = i16 % 128;
                if (i16 % 2 == 0) {
                    z6 z6Var2 = z6.setX;
                    throw null;
                }
                z6Var = z6.setLayoutAnimation;
            } else if (setsystemgestureexclusionrects instanceof setSelectedGroup) {
                z6Var = z6.setOnLongClickListener;
            } else if (setsystemgestureexclusionrects instanceof getId) {
                z6Var = z6.setNavigationOnClickListener;
            } else if (setsystemgestureexclusionrects instanceof setMapTrackballToArrowKeys) {
                z6Var = z6.setOnDragListener;
                i13 = f57160c + 89;
                f57159b = i13 % 128;
                int i17 = i13 % 2;
            } else {
                z6Var = setsystemgestureexclusionrects instanceof setStateDescription ? z6.getNavBarTitleString : z6.setIncludeFontPadding;
            }
            f57160c = i13 % 128;
            int i18 = i13 % 2;
        } else {
            int i19 = f57159b + 87;
            f57160c = i19 % 128;
            if (i19 % 2 == 0) {
                z6Var = z6.setX;
                int i20 = 3 / 0;
            } else {
                z6Var = z6.setX;
            }
        }
        return getDisplayExponent.setCompoundDrawableTintBlendMode(z6Var);
    }
}
