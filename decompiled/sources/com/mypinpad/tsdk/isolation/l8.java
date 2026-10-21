package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.a;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/mo;", "", "d", "(Lcom/mypinpad/tsdk/i/mo;)V"}, k = 3, mv = {1, 8, 0})
final class l8 extends Lambda implements Function1<mo, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final char[] f56911q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final char f56912r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f56913s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f56914t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f56915u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final byte[] f56916w0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ setHorizontalScrollBarEnabled f56917p0;

    static {
        c();
        f56915u0 = 0;
        v0 = 1;
        f56913s0 = 0;
        f56914t0 = 1;
        f56912r0 = (char) 53957;
        f56911q0 = new char[]{59185, 59147, 59190, 59193, 59188, 59192, 59191, 59199, 59189, 59157, 59196, 59182, 59177, 59198, 59160, 59183};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(setHorizontalScrollBarEnabled sethorizontalscrollbarenabled) {
        super(1);
        this.f56917p0 = sethorizontalscrollbarenabled;
    }

    public static void a(int i10, String str, byte b10, Object[] objArr) throws Throwable {
        int i11;
        int i12 = f56915u0 + 29;
        v0 = i12 % 128;
        int i13 = 2;
        int i14 = i12 % 2;
        char[] charArray = str.toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr = f56911q0;
        int i15 = 1;
        long j10 = 0;
        int i16 = 290255894;
        int i17 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i18 = 0;
            while (i18 < length) {
                int i19 = f56915u0 + 63;
                v0 = i19 % 128;
                int i20 = i19 % i13;
                try {
                    Object[] objArr2 = new Object[i15];
                    objArr2[i17] = Integer.valueOf(cArr[i18]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(Integer.valueOf(i16));
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) View.MeasureSpec.getMode(i17), Process.getGidForName("") + 46, 1116 - ExpandableListView.getPackedPositionGroup(j10));
                        byte b11 = (byte) i17;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, b12, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(290255894, method);
                    }
                    cArr2[i18] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i18++;
                    i13 = 2;
                    i15 = 1;
                    j10 = 0;
                    i16 = 290255894;
                    i17 = 0;
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
        Object[] objArr4 = {Integer.valueOf(f56912r0)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(290255894);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), Color.alpha(0) + 45, 1116 - (KeyEvent.getMaxKeyCode() >> 16));
            byte b13 = (byte) 0;
            byte b14 = b13;
            Object[] objArr5 = new Object[1];
            b(b13, b14, b14, objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(290255894, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i10];
        if (i10 % 2 != 0) {
            i11 = i10 - 1;
            cArr3[i11] = (char) (charArray[i11] - b10);
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            setincludefontpadding.setDividerPadding = 0;
            while (true) {
                int i21 = setincludefontpadding.setDividerPadding;
                if (i21 >= i11) {
                    break;
                }
                int i22 = v0 + 69;
                f56915u0 = i22 % 128;
                int i23 = i22 % 2;
                char c10 = charArray[i21];
                setincludefontpadding.setY = c10;
                int i24 = i21 + 1;
                char c11 = charArray[i24];
                setincludefontpadding.setCompoundDrawableTintBlendMode = c11;
                if (c10 == c11) {
                    cArr3[i21] = (char) (c10 - b10);
                    cArr3[i24] = (char) (c11 - b10);
                } else {
                    Object[] objArr6 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(180437302);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), Color.alpha(0) + 27, 2310 - MotionEvent.axisFromString(""));
                        byte b15 = (byte) 0;
                        byte b16 = (byte) (b15 + 3);
                        Object[] objArr7 = new Object[1];
                        b(b15, b16, (byte) (b16 - 3), objArr7);
                        String str2 = (String) objArr7[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str2, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(180437302, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i25 = setincludefontpadding.setNavigationOnClickListener;
                    if (iIntValue == i25) {
                        Object[] objArr8 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Object method4 = map3.get(1989802713);
                        if (method4 == null) {
                            Class cls5 = (Class) setTextScaleX.setX((char) (49103 - Color.argb(0, 0, 0, 0)), 34 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 2545 - (ViewConfiguration.getTapTimeout() >> 16));
                            byte b17 = (byte) 0;
                            Object[] objArr9 = new Object[1];
                            b(b17, (byte) (b17 | 7), b17, objArr9);
                            String str3 = (String) objArr9[0];
                            Class<?> cls6 = Integer.TYPE;
                            method4 = cls5.getMethod(str3, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(1989802713, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i26 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                        int i27 = setincludefontpadding.setDividerPadding;
                        cArr3[i27] = cArr[iIntValue2];
                        cArr3[i27 + 1] = cArr[i26];
                    } else {
                        int i28 = setincludefontpadding.setX;
                        int i29 = setincludefontpadding.setOnFocusChangeListener;
                        if (i28 == i29) {
                            int iA = a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                            setincludefontpadding.setOnLongClickListener = iA;
                            int iA2 = a.a(i25, cCharValue, 1, cCharValue);
                            setincludefontpadding.setNavigationOnClickListener = iA2;
                            int i30 = (i29 * cCharValue) + iA2;
                            int i31 = setincludefontpadding.setDividerPadding;
                            cArr3[i31] = cArr[(i28 * cCharValue) + iA];
                            cArr3[i31 + 1] = cArr[i30];
                        } else {
                            int i32 = (i28 * cCharValue) + i25;
                            int i33 = (i29 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                            int i34 = setincludefontpadding.setDividerPadding;
                            cArr3[i34] = cArr[i32];
                            cArr3[i34 + 1] = cArr[i33];
                        }
                    }
                }
                setincludefontpadding.setDividerPadding += 2;
            }
        }
        int i35 = 0;
        while (i35 < i10) {
            int i36 = f56915u0 + 101;
            v0 = i36 % 128;
            if (i36 % 2 == 0) {
                cArr3[i35] = (char) (cArr3[i35] ^ 23776);
                i35 += 109;
            } else {
                cArr3[i35] = (char) (cArr3[i35] ^ 13722);
                i35++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 99
            int r7 = r7 * 3
            int r7 = 1 - r7
            int r9 = r9 * 3
            int r9 = 3 - r9
            byte[] r0 = new byte[r7]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.l8.f56916w0
            if (r2 != 0) goto L19
            r5 = r1
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            goto L35
        L19:
            r3 = r1
        L1a:
            int r9 = r9 + 1
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r0[r3] = r4
            if (r5 != r7) goto L2b
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r1)
            r10[r1] = r7
            return
        L2b:
            r3 = r2[r9]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r9
            r9 = r6
        L35:
            int r7 = -r7
            int r7 = r7 + r9
            r9 = r10
            r10 = r0
            r0 = r2
            r2 = r3
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.l8.b(int, int, short, java.lang.Object[]):void");
    }

    public static void c() {
        f56916w0 = new byte[]{76, 17, -23, -60};
    }

    public final void d(@NotNull mo moVar) throws Throwable {
        int i10 = f56913s0 + 53;
        f56914t0 = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(moVar, "");
        Object[] objArr = new Object[1];
        a(4 - TextUtils.indexOf((CharSequence) "", '0', 0), "\f\b\t\u0004㙯", (byte) (113 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr);
        String strIntern = ((String) objArr[0]).intern();
        setHorizontalScrollBarEnabled sethorizontalscrollbarenabled = this.f56917p0;
        setSupportBackgroundTintList setsupportbackgroundtintlist = (setSupportBackgroundTintList) sethorizontalscrollbarenabled;
        mo.setY(new Object[]{moVar, strIntern, (String) setSupportBackgroundTintList.setX(new Object[]{setsupportbackgroundtintlist}, -24970315, 24970315, System.identityHashCode(setsupportbackgroundtintlist))}, -52655784, 52655794, System.identityHashCode(moVar));
        Object[] objArr2 = new Object[1];
        a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 23, "\b\u0006\u0006\b\u0005\u000e\u0002\n\u0007\b\u0005\u0003\u0000\b\u0001\f\u0007\r\n\b\u0003\u0000\u000e\r", (byte) (65 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr2);
        setSupportBackgroundTintList setsupportbackgroundtintlist2 = (setSupportBackgroundTintList) sethorizontalscrollbarenabled;
        mo.setY(new Object[]{moVar, ((String) objArr2[0]).intern(), String.valueOf(((Long) setSupportBackgroundTintList.setX(new Object[]{setsupportbackgroundtintlist2}, 655875256, -655875255, System.identityHashCode(setsupportbackgroundtintlist2))).longValue())}, -52655784, 52655794, System.identityHashCode(moVar));
        int i12 = f56914t0 + 11;
        f56913s0 = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(mo moVar) throws Throwable {
        int i10 = f56914t0 + 13;
        f56913s0 = i10 % 128;
        int i11 = i10 % 2;
        d(moVar);
        Unit unit = Unit.INSTANCE;
        int i12 = f56914t0 + 73;
        f56913s0 = i12 % 128;
        if (i12 % 2 == 0) {
            return unit;
        }
        throw null;
    }
}
