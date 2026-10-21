package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class TransactionNotAuthorised implements setScrollCaptureCallback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f51922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f51923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f51924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f51925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f51926h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f51927i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f51928j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f51929k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final getNumericCode f51930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setProgressDrawable f51931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final getTransactionPortrait f51932c;

    static {
        c();
        f51926h = 0;
        f51927i = 1;
        f51924f = 0;
        f51925g = 1;
        f51923e = -6319774857131616340L;
        f51922d = new char[]{50740, 38859, 25865, 13153, 33009, 24070, 11343, 64993, 19440, 6467, 63123, 17660, 4640, 58251, 45521, 3885, 56693, 43714, 30805, 36434, 57319, 11568, 31556, 51355, 5677, 25706, 46465, 972, 3362, 23772, 44568, 63603, 19374, 38171, 59143, 14013, 33003, 53854, 15757, 36863, 55614, 10374, 31436, 50216, 5731, 25054, 45835, 7479, 27819, 48669, 2127, 23476, 42494, 63251, 404, 20531, 41708, 62611, 18245, 39394, 60323, 14930};
    }

    public TransactionNotAuthorised(@NotNull setSecondaryProgressTintMode setsecondaryprogresstintmode, @NotNull getNumericCode getnumericcode, @NotNull setSelected setselected, @NotNull setProgressDrawable setprogressdrawable) {
        Intrinsics.checkNotNullParameter(setsecondaryprogresstintmode, "");
        Intrinsics.checkNotNullParameter(getnumericcode, "");
        Intrinsics.checkNotNullParameter(setselected, "");
        Intrinsics.checkNotNullParameter(setprogressdrawable, "");
        this.f51930a = getnumericcode;
        this.f51931b = setprogressdrawable;
        this.f51932c = getTransactionPortrait.setDividerPadding;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0200  */
    /* JADX WARN: Code duplicated, block: B:39:0x0201  */
    public static void a(char c10, int i10, int i11, Object[] objArr) throws Throwable {
        Throwable cause;
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode();
        long[] jArr = new long[i11];
        setcompounddrawabletintblendmode.setDividerPadding = 0;
        int i12 = f51926h + 35;
        f51927i = i12 % 128;
        int i13 = i12 % 2;
        while (true) {
            int i14 = setcompounddrawabletintblendmode.setDividerPadding;
            if (i14 >= i11) {
                break;
            }
            try {
                Object[] objArr2 = {Integer.valueOf(f51922d[i10 + i14])};
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(1832327647);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 44 - View.combineMeasuredStates(0, 0), 728 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    b(b11, b10, b11, objArr3);
                    method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                    map.put(1832327647, method);
                }
                Object[] objArr4 = {Long.valueOf(((Long) ((Method) method).invoke(null, objArr2)).longValue()), Long.valueOf(setcompounddrawabletintblendmode.setDividerPadding), Long.valueOf(f51923e), Integer.valueOf(c10)};
                Object method2 = map.get(2012362404);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 46116), 43 - (ViewConfiguration.getScrollBarSize() >> 8), 1776 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    byte b12 = (byte) (f51929k & 5);
                    byte b13 = (byte) (b12 - 1);
                    Object[] objArr5 = new Object[1];
                    b(b13, b12, b13, objArr5);
                    String str = (String) objArr5[0];
                    Class<?> cls3 = Long.TYPE;
                    method2 = cls2.getMethod(str, cls3, cls3, cls3, Integer.TYPE);
                    map.put(2012362404, method2);
                }
                jArr[i14] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                Object[] objArr6 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                Object method3 = map.get(1606688712);
                if (method3 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 27 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 2311 - (Process.myPid() >> 22));
                    byte b14 = (byte) 5;
                    byte b15 = (byte) (b14 - 5);
                    Object[] objArr7 = new Object[1];
                    b(b15, b14, b15, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map.put(1606688712, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                int i15 = f51926h + 57;
                f51927i = i15 % 128;
                int i16 = i15 % 2;
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
        char[] cArr = new char[i11];
        setcompounddrawabletintblendmode.setDividerPadding = 0;
        while (true) {
            int i17 = setcompounddrawabletintblendmode.setDividerPadding;
            if (i17 >= i11) {
                objArr[0] = new String(cArr);
                return;
            }
            int i18 = f51927i + 29;
            f51926h = i18 % 128;
            int i19 = i18 % 2;
            cArr[i17] = (char) jArr[i17];
            Object[] objArr8 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
            Map map2 = setTextScaleX.setMaxEms;
            Object method4 = map2.get(1606688712);
            if (method4 == null) {
                Class cls5 = (Class) setTextScaleX.setX((char) KeyEvent.keyCodeFromString(""), 27 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2312 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                byte b16 = (byte) 5;
                byte b17 = (byte) (b16 - 5);
                Object[] objArr9 = new Object[1];
                b(b17, b16, b17, objArr9);
                method4 = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                map2.put(1606688712, method4);
            }
            ((Method) method4).invoke(null, objArr8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = 3 - r6
            int r7 = r7 + 67
            int r8 = r8 * 3
            int r0 = r8 + 1
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.TransactionNotAuthorised.f51928j
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            goto L31
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r6 = r6 + 1
            r3 = r1[r6]
            r5 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L31:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.TransactionNotAuthorised.b(byte, short, short, java.lang.Object[]):void");
    }

    public static void c() {
        f51928j = new byte[]{81, -20, -4, 67};
        f51929k = 179;
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollCaptureCallback
    @NotNull
    public final getTransactionPortrait setDividerPadding() {
        int i10 = f51925g;
        int i11 = i10 + 123;
        f51924f = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        int i12 = i10 + 115;
        f51924f = i12 % 128;
        int i13 = i12 % 2;
        getTransactionPortrait gettransactionportrait = this.f51932c;
        if (i13 != 0) {
            int i14 = 97 / 0;
        }
        return gettransactionportrait;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:18:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:21:0x0105  */
    /* JADX WARN: Code duplicated, block: B:23:0x010b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0115  */
    /* JADX WARN: Code duplicated, block: B:30:0x012c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0136  */
    /* JADX WARN: Code duplicated, block: B:34:0x0141  */
    /* JADX WARN: Code duplicated, block: B:37:0x014b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0151  */
    /* JADX WARN: Code duplicated, block: B:42:0x015c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0173  */
    /* JADX WARN: Code duplicated, block: B:52:0x01b1 A[LOOP:1: B:46:0x0171->B:52:0x01b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[LOOP:2: B:40:0x0155->B:62:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[LOOP:3: B:24:0x010f->B:65:?, LOOP_END, SYNTHETIC] */
    @Override // com.mypinpad.tsdk.isolation.setScrollCaptureCallback
    @NotNull
    public final setAutoSizeTextTypeUniformWithPresetSizes setX() throws Throwable {
        List<String> compoundDrawableTintBlendMode;
        Iterator<T> it;
        int i10;
        List<String> y7;
        Iterator<T> it2;
        int i11;
        int i12;
        int i13;
        Object[] objArr = new Object[1];
        a((char) (Color.rgb(0, 0, 0) + 16777216), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, 19 - KeyEvent.keyCodeFromString(""), objArr);
        Regex regex = new Regex(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a((char) (18467 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 19 - (ViewConfiguration.getEdgeSlop() >> 16), 9 - ExpandableListView.getPackedPositionGroup(0L), objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a((char) (51990 - View.MeasureSpec.makeMeasureSpec(0, 0)), 29 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 27, objArr3);
        Regex regex2 = new Regex(((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        a((char) (ExpandableListView.getPackedPositionChild(0L) + 51163), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 53, (ViewConfiguration.getJumpTapTimeout() >> 16) + 8, objArr4);
        String strIntern2 = ((String) objArr4[0]).intern();
        List<String> x4 = this.f51930a.setX();
        if (x4.isEmpty()) {
            compoundDrawableTintBlendMode = setSecondaryProgressTintMode.setCompoundDrawableTintBlendMode();
            if (compoundDrawableTintBlendMode instanceof Collection) {
                i13 = f51925g + 41;
                f51924f = i13 % 128;
                if (i13 % 2 == 0) {
                    compoundDrawableTintBlendMode.isEmpty();
                    throw null;
                }
                if (!compoundDrawableTintBlendMode.isEmpty()) {
                    y7 = setSelected.setY();
                    if (y7 instanceof Collection) {
                        it2 = y7.iterator();
                        while (!(!it2.hasNext())) {
                            if (regex2.containsMatchIn((String) it2.next())) {
                            }
                        }
                        for (setProgressDrawable.setY sety : this.f51931b.setDividerPadding()) {
                            if (StringsKt__StringsKt.contains$default((CharSequence) new String((byte[]) setProgressDrawable.setY.setY(new Object[]{sety}, -976322524, 976322524, System.identityHashCode(sety)), Charsets.UTF_8), (CharSequence) strIntern2, false, 2, (Object) null)) {
                                i10 = f51925g + 39;
                            }
                        }
                        return (setAutoSizeTextTypeUniformWithPresetSizes) setPersistentDrawingCache.setDividerPadding(new Object[]{this}, -2060556907, 2060556908, (int) System.currentTimeMillis());
                    }
                    i12 = f51925g + 89;
                    f51924f = i12 % 128;
                    if (i12 % 2 == 0) {
                        y7.isEmpty();
                        throw null;
                    }
                    if (!y7.isEmpty()) {
                        it2 = y7.iterator();
                        while (!(!it2.hasNext())) {
                            if (regex2.containsMatchIn((String) it2.next())) {
                            }
                        }
                    }
                    while (i11 < r2) {
                        if (StringsKt__StringsKt.contains$default((CharSequence) new String((byte[]) setProgressDrawable.setY.setY(new Object[]{sety}, -976322524, 976322524, System.identityHashCode(sety)), Charsets.UTF_8), (CharSequence) strIntern2, false, 2, (Object) null)) {
                            i10 = f51925g + 39;
                        }
                    }
                    return (setAutoSizeTextTypeUniformWithPresetSizes) setPersistentDrawingCache.setDividerPadding(new Object[]{this}, -2060556907, 2060556908, (int) System.currentTimeMillis());
                }
                it = compoundDrawableTintBlendMode.iterator();
                while (true) {
                    if (it.hasNext()) {
                        y7 = setSelected.setY();
                        if (y7 instanceof Collection) {
                            it2 = y7.iterator();
                            while (!(!it2.hasNext())) {
                                if (regex2.containsMatchIn((String) it2.next())) {
                                }
                            }
                            while (i11 < r2) {
                                if (StringsKt__StringsKt.contains$default((CharSequence) new String((byte[]) setProgressDrawable.setY.setY(new Object[]{sety}, -976322524, 976322524, System.identityHashCode(sety)), Charsets.UTF_8), (CharSequence) strIntern2, false, 2, (Object) null)) {
                                    i10 = f51925g + 39;
                                }
                            }
                            return (setAutoSizeTextTypeUniformWithPresetSizes) setPersistentDrawingCache.setDividerPadding(new Object[]{this}, -2060556907, 2060556908, (int) System.currentTimeMillis());
                        }
                        i12 = f51925g + 89;
                        f51924f = i12 % 128;
                        if (i12 % 2 == 0) {
                            y7.isEmpty();
                            throw null;
                        }
                        if (!y7.isEmpty()) {
                            it2 = y7.iterator();
                            while (!(!it2.hasNext())) {
                                if (regex2.containsMatchIn((String) it2.next())) {
                                }
                            }
                        }
                        while (i11 < r2) {
                            if (StringsKt__StringsKt.contains$default((CharSequence) new String((byte[]) setProgressDrawable.setY.setY(new Object[]{sety}, -976322524, 976322524, System.identityHashCode(sety)), Charsets.UTF_8), (CharSequence) strIntern2, false, 2, (Object) null)) {
                                i10 = f51925g + 39;
                            }
                        }
                        return (setAutoSizeTextTypeUniformWithPresetSizes) setPersistentDrawingCache.setDividerPadding(new Object[]{this}, -2060556907, 2060556908, (int) System.currentTimeMillis());
                    }
                    if (StringsKt__StringsKt.contains$default((CharSequence) it.next(), (CharSequence) strIntern, false, 2, (Object) null)) {
                        i10 = f51925g + 59;
                    }
                }
            } else {
                it = compoundDrawableTintBlendMode.iterator();
                while (true) {
                    if (it.hasNext()) {
                        y7 = setSelected.setY();
                        if (y7 instanceof Collection) {
                            it2 = y7.iterator();
                            while (!(!it2.hasNext())) {
                                if (regex2.containsMatchIn((String) it2.next())) {
                                }
                            }
                            while (i11 < r2) {
                                if (StringsKt__StringsKt.contains$default((CharSequence) new String((byte[]) setProgressDrawable.setY.setY(new Object[]{sety}, -976322524, 976322524, System.identityHashCode(sety)), Charsets.UTF_8), (CharSequence) strIntern2, false, 2, (Object) null)) {
                                    i10 = f51925g + 39;
                                }
                            }
                            return (setAutoSizeTextTypeUniformWithPresetSizes) setPersistentDrawingCache.setDividerPadding(new Object[]{this}, -2060556907, 2060556908, (int) System.currentTimeMillis());
                        }
                        i12 = f51925g + 89;
                        f51924f = i12 % 128;
                        if (i12 % 2 == 0) {
                            y7.isEmpty();
                            throw null;
                        }
                        if (!y7.isEmpty()) {
                            it2 = y7.iterator();
                            while (!(!it2.hasNext())) {
                                if (regex2.containsMatchIn((String) it2.next())) {
                                }
                            }
                        }
                        while (i11 < r2) {
                            if (StringsKt__StringsKt.contains$default((CharSequence) new String((byte[]) setProgressDrawable.setY.setY(new Object[]{sety}, -976322524, 976322524, System.identityHashCode(sety)), Charsets.UTF_8), (CharSequence) strIntern2, false, 2, (Object) null)) {
                                i10 = f51925g + 39;
                            }
                        }
                        return (setAutoSizeTextTypeUniformWithPresetSizes) setPersistentDrawingCache.setDividerPadding(new Object[]{this}, -2060556907, 2060556908, (int) System.currentTimeMillis());
                    }
                    if (StringsKt__StringsKt.contains$default((CharSequence) it.next(), (CharSequence) strIntern, false, 2, (Object) null)) {
                        i10 = f51925g + 59;
                    }
                }
            }
            f51924f = i10 % 128;
            int i14 = i10 % 2;
        } else {
            int i15 = f51924f + 81;
            f51925g = i15 % 128;
            if (i15 % 2 == 0) {
                x4.iterator();
                throw null;
            }
            Iterator<T> it3 = x4.iterator();
            while (it3.hasNext()) {
                int i16 = f51925g + 109;
                f51924f = i16 % 128;
                int i17 = i16 % 2;
                if (regex.containsMatchIn((String) it3.next())) {
                }
            }
            compoundDrawableTintBlendMode = setSecondaryProgressTintMode.setCompoundDrawableTintBlendMode();
            if (compoundDrawableTintBlendMode instanceof Collection) {
                i13 = f51925g + 41;
                f51924f = i13 % 128;
                if (i13 % 2 == 0) {
                    compoundDrawableTintBlendMode.isEmpty();
                    throw null;
                }
                if (!compoundDrawableTintBlendMode.isEmpty()) {
                    y7 = setSelected.setY();
                    if (y7 instanceof Collection) {
                        it2 = y7.iterator();
                        while (!(!it2.hasNext())) {
                            if (regex2.containsMatchIn((String) it2.next())) {
                            }
                        }
                        while (i11 < r2) {
                            if (StringsKt__StringsKt.contains$default((CharSequence) new String((byte[]) setProgressDrawable.setY.setY(new Object[]{sety}, -976322524, 976322524, System.identityHashCode(sety)), Charsets.UTF_8), (CharSequence) strIntern2, false, 2, (Object) null)) {
                                i10 = f51925g + 39;
                            }
                        }
                        return (setAutoSizeTextTypeUniformWithPresetSizes) setPersistentDrawingCache.setDividerPadding(new Object[]{this}, -2060556907, 2060556908, (int) System.currentTimeMillis());
                    }
                    i12 = f51925g + 89;
                    f51924f = i12 % 128;
                    if (i12 % 2 == 0) {
                        y7.isEmpty();
                        throw null;
                    }
                    if (!y7.isEmpty()) {
                        it2 = y7.iterator();
                        while (!(!it2.hasNext())) {
                            if (regex2.containsMatchIn((String) it2.next())) {
                            }
                        }
                    }
                    while (i11 < r2) {
                        if (StringsKt__StringsKt.contains$default((CharSequence) new String((byte[]) setProgressDrawable.setY.setY(new Object[]{sety}, -976322524, 976322524, System.identityHashCode(sety)), Charsets.UTF_8), (CharSequence) strIntern2, false, 2, (Object) null)) {
                            i10 = f51925g + 39;
                        }
                    }
                    return (setAutoSizeTextTypeUniformWithPresetSizes) setPersistentDrawingCache.setDividerPadding(new Object[]{this}, -2060556907, 2060556908, (int) System.currentTimeMillis());
                }
                it = compoundDrawableTintBlendMode.iterator();
                while (true) {
                    if (it.hasNext()) {
                        y7 = setSelected.setY();
                        if (y7 instanceof Collection) {
                            it2 = y7.iterator();
                            while (!(!it2.hasNext())) {
                                if (regex2.containsMatchIn((String) it2.next())) {
                                }
                            }
                            while (i11 < r2) {
                                if (StringsKt__StringsKt.contains$default((CharSequence) new String((byte[]) setProgressDrawable.setY.setY(new Object[]{sety}, -976322524, 976322524, System.identityHashCode(sety)), Charsets.UTF_8), (CharSequence) strIntern2, false, 2, (Object) null)) {
                                    i10 = f51925g + 39;
                                }
                            }
                            return (setAutoSizeTextTypeUniformWithPresetSizes) setPersistentDrawingCache.setDividerPadding(new Object[]{this}, -2060556907, 2060556908, (int) System.currentTimeMillis());
                        }
                        i12 = f51925g + 89;
                        f51924f = i12 % 128;
                        if (i12 % 2 == 0) {
                            y7.isEmpty();
                            throw null;
                        }
                        if (!y7.isEmpty()) {
                            it2 = y7.iterator();
                            while (!(!it2.hasNext())) {
                                if (regex2.containsMatchIn((String) it2.next())) {
                                }
                            }
                        }
                        while (i11 < r2) {
                            if (StringsKt__StringsKt.contains$default((CharSequence) new String((byte[]) setProgressDrawable.setY.setY(new Object[]{sety}, -976322524, 976322524, System.identityHashCode(sety)), Charsets.UTF_8), (CharSequence) strIntern2, false, 2, (Object) null)) {
                                i10 = f51925g + 39;
                            }
                        }
                        return (setAutoSizeTextTypeUniformWithPresetSizes) setPersistentDrawingCache.setDividerPadding(new Object[]{this}, -2060556907, 2060556908, (int) System.currentTimeMillis());
                    }
                    if (StringsKt__StringsKt.contains$default((CharSequence) it.next(), (CharSequence) strIntern, false, 2, (Object) null)) {
                        i10 = f51925g + 59;
                    }
                }
            } else {
                it = compoundDrawableTintBlendMode.iterator();
                while (true) {
                    if (it.hasNext()) {
                        y7 = setSelected.setY();
                        if (y7 instanceof Collection) {
                            it2 = y7.iterator();
                            while (!(!it2.hasNext())) {
                                if (regex2.containsMatchIn((String) it2.next())) {
                                }
                            }
                            while (i11 < r2) {
                                if (StringsKt__StringsKt.contains$default((CharSequence) new String((byte[]) setProgressDrawable.setY.setY(new Object[]{sety}, -976322524, 976322524, System.identityHashCode(sety)), Charsets.UTF_8), (CharSequence) strIntern2, false, 2, (Object) null)) {
                                    i10 = f51925g + 39;
                                }
                            }
                            return (setAutoSizeTextTypeUniformWithPresetSizes) setPersistentDrawingCache.setDividerPadding(new Object[]{this}, -2060556907, 2060556908, (int) System.currentTimeMillis());
                        }
                        i12 = f51925g + 89;
                        f51924f = i12 % 128;
                        if (i12 % 2 == 0) {
                            y7.isEmpty();
                            throw null;
                        }
                        if (!y7.isEmpty()) {
                            it2 = y7.iterator();
                            while (!(!it2.hasNext())) {
                                if (regex2.containsMatchIn((String) it2.next())) {
                                }
                            }
                        }
                        while (i11 < r2) {
                            if (StringsKt__StringsKt.contains$default((CharSequence) new String((byte[]) setProgressDrawable.setY.setY(new Object[]{sety}, -976322524, 976322524, System.identityHashCode(sety)), Charsets.UTF_8), (CharSequence) strIntern2, false, 2, (Object) null)) {
                                i10 = f51925g + 39;
                            }
                        }
                        return (setAutoSizeTextTypeUniformWithPresetSizes) setPersistentDrawingCache.setDividerPadding(new Object[]{this}, -2060556907, 2060556908, (int) System.currentTimeMillis());
                    }
                    if (StringsKt__StringsKt.contains$default((CharSequence) it.next(), (CharSequence) strIntern, false, 2, (Object) null)) {
                        i10 = f51925g + 59;
                    }
                }
            }
            f51924f = i10 % 128;
            int i18 = i10 % 2;
        }
        return (setAutoSizeTextTypeUniformWithPresetSizes) setPersistentDrawingCache.setDividerPadding(new Object[]{this}, -462901680, 462901680, (int) System.currentTimeMillis());
    }
}
