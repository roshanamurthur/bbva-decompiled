package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final /* synthetic */ class mm extends FunctionReferenceImpl implements Function1<tg, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final char[] f57113p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f57114q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final boolean f57115r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final boolean f57116s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f57117t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f57118u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f57119w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final byte[] f57120x0 = null;

    static {
        c();
        v0 = 0;
        f57119w0 = 1;
        f57117t0 = 0;
        f57118u0 = 1;
        f57115r0 = true;
        f57116s0 = true;
        f57114q0 = 1794962391;
        f57113p0 = new char[]{62271, 62262, 62245, 62267, 62243, 62266, 62232, 62244, 62251, 62270, 62250, 62220, 62212, 62217, 62248, 62247, 62463, 62211, 62264, 62242, 62436, 62254, 62240, 62249, 62219, 62230, 62224, 62462, 62221};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public mm(ul ulVar) throws Throwable {
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, "\u0086\u008f\u0083\u0088\u0090\u008f\u0086\u008e\u0086\u0083\u008a\u0085\u0083\u008d\u0081\u0089\u008a\u008c\u0086\u008b\u0083\u008a\u0089\u0083\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\u009d\u009c\u009b\u0086\u008f\u0083\u0088\u0090\u008f\u0086\u008e\u0083\u0088\u008a\u0089\u0082\u008f\u008a\u0098\u0088\u0081\u0089\u008b\u009a\u0083\u0088\u008a\u0089\u0093\u0082\u008f\u0083\u0082\u0098\u0099\u0095\u0083\u0088\u008a\u0089\u0082\u008f\u008a\u0098\u0088\u0081\u0089\u008b\u0082\u0095\u0085\u0082\u0083\u008a\u0094\u0098\u0086\u0089\u0095\u0085\u0082\u0083\u0098\u0086\u0089\u0083\u008a\u0095\u0097\u0084\u008f\u0089\u0095\u0084\u0082\u0090\u0083\u008a\u0090\u0096\u0094\u0095\u0094\u0088\u0093\u0092\u0091\u0086\u008f\u0083\u0088\u0090\u008f\u0086\u008e\u0086\u0083\u008a\u0085\u0083\u008d\u0081\u0089\u008a\u008c\u0086\u008b\u0083\u008a\u0089\u0083\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr2);
        super(1, ulVar, ul.class, strIntern, ((String) objArr2[0]).intern(), 0);
    }

    public static void a(int i10, String str, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i11;
        int i12 = f57119w0 + 121;
        v0 = i12 % 128;
        int i13 = 2;
        if (i12 % 2 != 0) {
            throw null;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        setZ setz = new setZ();
        char[] cArr2 = f57113p0;
        if (cArr2 != null) {
            int i14 = v0 + 5;
            f57119w0 = i14 % 128;
            if (i14 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i11 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i11 = 0;
            }
            while (i11 < length) {
                int i15 = v0 + 5;
                f57119w0 = i15 % 128;
                if (i15 % i13 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i11])};
                        Map map = setTextScaleX.setMaxEms;
                        Object method = map.get(1129500232);
                        if (method == null) {
                            Class cls = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 26288), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 64, 1595 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                            byte b10 = (byte) 0;
                            byte b11 = (byte) (b10 + 2);
                            Object[] objArr3 = new Object[1];
                            b(b11, b10, (byte) (b11 - 2), objArr3);
                            method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                            map.put(1129500232, method);
                        }
                        cArr[i11] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr4 = {Integer.valueOf(cArr2[i11])};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method2 = map2.get(1129500232);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getTapTimeout() >> 16) + 26288), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 64, View.resolveSize(0, 0) + 1595);
                        byte b12 = (byte) 0;
                        byte b13 = (byte) (b12 + 2);
                        Object[] objArr5 = new Object[1];
                        b(b13, b12, (byte) (b13 - 2), objArr5);
                        method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                        map2.put(1129500232, method2);
                    }
                    cArr[i11] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i11++;
                }
                i13 = 2;
            }
            cArr2 = cArr;
        }
        Object[] objArr6 = {Integer.valueOf(f57114q0)};
        Map map3 = setTextScaleX.setMaxEms;
        Object method3 = map3.get(1019674483);
        if (method3 == null) {
            Class cls3 = (Class) setTextScaleX.setX((char) (10744 - (ViewConfiguration.getTapTimeout() >> 16)), TextUtils.getOffsetAfter("", 0) + 43, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 565);
            byte b14 = (byte) 0;
            byte b15 = (byte) (b14 + 1);
            Object[] objArr7 = new Object[1];
            b(b15, b14, (byte) (b15 - 1), objArr7);
            method3 = cls3.getMethod((String) objArr7[0], Integer.TYPE);
            map3.put(1019674483, method3);
        }
        int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
        if (!f57116s0) {
            if (!f57115r0) {
                throw null;
            }
            throw null;
        }
        int length2 = bytes.length;
        setz.setOnFocusChangeListener = length2;
        char[] cArr3 = new char[length2];
        setz.setDividerPadding = 0;
        int i16 = f57119w0 + 85;
        v0 = i16 % 128;
        int i17 = i16 % 2;
        while (true) {
            int i18 = setz.setDividerPadding;
            int i19 = setz.setOnFocusChangeListener;
            if (i18 >= i19) {
                objArr[0] = new String(cArr3);
                return;
            }
            int i20 = v0 + 99;
            f57119w0 = i20 % 128;
            if (i20 % 2 == 0) {
                cArr3[i18] = (char) (cArr2[bytes[i19 + i18] >>> i10] - iIntValue);
                Object[] objArr8 = {setz, setz};
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(-1539766653);
                if (method4 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) View.resolveSize(0, 0), 51 - (Process.myTid() >> 22), 2880 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    byte b16 = (byte) 0;
                    byte b17 = b16;
                    Object[] objArr9 = new Object[1];
                    b(b17, b16, b17, objArr9);
                    method4 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                    map4.put(-1539766653, method4);
                }
                ((Method) method4).invoke(null, objArr8);
            } else {
                cArr3[i18] = (char) (cArr2[bytes[(i19 - 1) - i18] + i10] - iIntValue);
                Object[] objArr10 = {setz, setz};
                Map map5 = setTextScaleX.setMaxEms;
                Object method5 = map5.get(-1539766653);
                if (method5 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) Color.alpha(0), 51 - (ViewConfiguration.getScrollBarSize() >> 8), ((Process.getThreadPriority(0) + 20) >> 6) + 2880);
                    byte b18 = (byte) 0;
                    byte b19 = b18;
                    Object[] objArr11 = new Object[1];
                    b(b19, b18, b19, objArr11);
                    method5 = cls5.getMethod((String) objArr11[0], Object.class, Object.class);
                    map5.put(-1539766653, method5);
                }
                ((Method) method5).invoke(null, objArr10);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = 122 - r6
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r8 = r8 * 4
            int r0 = r8 + 1
            byte[] r0 = new byte[r0]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.mm.f57120x0
            if (r2 != 0) goto L1a
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L37
        L1a:
            r3 = r1
        L1b:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2a:
            int r3 = r3 + 1
            r4 = r2[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L37:
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r8
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.mm.b(byte, short, short, java.lang.Object[]):void");
    }

    public static void c() {
        f57120x0 = new byte[]{113, 126, 19, 62};
    }

    public final void d(@NotNull tg tgVar) throws Throwable {
        int i10 = f57117t0 + 61;
        f57118u0 = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tgVar, "");
            ul.setDividerPadding(new Object[]{(ul) this.receiver, tgVar}, -1749351008, 1749351012, (int) System.currentTimeMillis());
        } else {
            Intrinsics.checkNotNullParameter(tgVar, "");
            ul.setDividerPadding(new Object[]{(ul) this.receiver, tgVar}, -1749351008, 1749351012, (int) System.currentTimeMillis());
            int i11 = 5 / 0;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(tg tgVar) throws Throwable {
        int i10 = f57117t0 + 41;
        f57118u0 = i10 % 128;
        int i11 = i10 % 2;
        d(tgVar);
        Unit unit = Unit.INSTANCE;
        int i12 = f57118u0 + 85;
        f57117t0 = i12 % 128;
        int i13 = i12 % 2;
        return unit;
    }
}
