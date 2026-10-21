package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.camera.camera2.internal.n1;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/mo;", "", "c", "(Lcom/mypinpad/tsdk/i/mo;)V"}, k = 3, mv = {1, 8, 0})
final class n8 extends Lambda implements Function1<mo, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final char[] f57210q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f57211r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final boolean f57212s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final boolean f57213t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f57214u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final byte[] f57215w0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ setHorizontalScrollBarEnabled f57216p0;

    static {
        b();
        f57214u0 = 0;
        v0 = 1;
        f57212s0 = true;
        f57213t0 = true;
        f57211r0 = 1794962270;
        f57210q0 = new char[]{62163, 62117, 62160, 62164, 62133, 62162, 62115, 62130, 62121, 62125};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(setHorizontalScrollBarEnabled sethorizontalscrollbarenabled) {
        super(1);
        this.f57216p0 = sethorizontalscrollbarenabled;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = 122 - r6
            int r8 = r8 * 4
            int r8 = r8 + 4
            int r7 = r7 * 2
            int r0 = r7 + 1
            byte[] r0 = new byte[r0]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.n8.f57215w0
            if (r2 != 0) goto L19
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L33
        L19:
            r3 = r1
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r2[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r5
        L33:
            int r6 = r6 + r8
            int r8 = r9 + 1
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.n8.a(byte, byte, short, java.lang.Object[]):void");
    }

    public static void b() {
        f57215w0 = new byte[]{Constants.FCI_TEMPLATE, 62, -91, 75};
    }

    public final void c(@NotNull mo moVar) throws Throwable {
        int i10 = f57214u0 + 13;
        v0 = i10 % 128;
        int i11 = 2;
        int i12 = i10 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(moVar, "");
        long j10 = 0;
        int packedPositionType = 127 - ExpandableListView.getPackedPositionType(0L);
        byte[] bytes = "\u0082\u008a\u0089\u0088\u0087\u0086\u0085\u0083\u0082\u0084\u0083\u0082\u0081".getBytes("ISO-8859-1");
        setZ setz = new setZ();
        int i13 = 0;
        int i14 = 1;
        char[] cArr = f57210q0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i15 = 0;
            while (i15 < length) {
                try {
                    Object[] objArr = new Object[i14];
                    objArr[i13] = Integer.valueOf(cArr[i15]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(1129500232);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (Color.argb(i13, i13, i13, i13) + 26288), 65 - (SystemClock.elapsedRealtime() > j10 ? 1 : (SystemClock.elapsedRealtime() == j10 ? 0 : -1)), 1595 - (ViewConfiguration.getPressedStateDuration() >> 16));
                        byte b10 = (byte) i11;
                        byte b11 = (byte) (b10 - 2);
                        Object[] objArr2 = new Object[1];
                        a(b10, b11, b11, objArr2);
                        method = cls.getMethod((String) objArr2[0], Integer.TYPE);
                        map.put(1129500232, method);
                    }
                    cArr2[i15] = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                    i15++;
                    cArr = cArr;
                    i11 = 2;
                    j10 = 0;
                    i13 = 0;
                    i14 = 1;
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
        Object[] objArr3 = {Integer.valueOf(f57211r0)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(1019674483);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 10744), 43 - (ViewConfiguration.getTouchSlop() >> 8), 566 - TextUtils.indexOf("", "", 0));
            byte b12 = (byte) 1;
            byte b13 = (byte) (b12 - 1);
            Object[] objArr4 = new Object[1];
            a(b12, b13, b13, objArr4);
            method2 = cls2.getMethod((String) objArr4[0], Integer.TYPE);
            map2.put(1019674483, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
        if (!f57213t0) {
            if (!f57212s0) {
                throw null;
            }
            throw null;
        }
        int length2 = bytes.length;
        setz.setOnFocusChangeListener = length2;
        char[] cArr3 = new char[length2];
        setz.setDividerPadding = 0;
        while (true) {
            int i16 = setz.setDividerPadding;
            int i17 = setz.setOnFocusChangeListener;
            if (i16 >= i17) {
                break;
            }
            cArr3[i16] = (char) (cArr[bytes[(i17 - 1) - i16] + packedPositionType] - iIntValue);
            Object[] objArr5 = {setz, setz};
            Map map3 = setTextScaleX.setMaxEms;
            Object method3 = map3.get(-1539766653);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) ((-1) - TextUtils.indexOf((CharSequence) str, '0')), View.MeasureSpec.makeMeasureSpec(0, 0) + 51, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2879);
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr6 = new Object[1];
                a(b14, b15, b15, objArr6);
                method3 = cls3.getMethod((String) objArr6[0], Object.class, Object.class);
                map3.put(-1539766653, method3);
            }
            ((Method) method3).invoke(null, objArr5);
            str = str;
        }
        String strF = n1.f(cArr3);
        setDividerHeight setdividerheight = (setDividerHeight) this.f57216p0;
        mo.setY(new Object[]{moVar, strF, Long.valueOf(((Long) setDividerHeight.setY(new Object[]{setdividerheight}, 55229847, -55229847, System.identityHashCode(setdividerheight))).longValue())}, -66017702, 66017710, System.identityHashCode(moVar));
        int i18 = f57214u0 + 1;
        v0 = i18 % 128;
        if (i18 % 2 == 0) {
            throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(mo moVar) throws Throwable {
        int i10 = v0 + 31;
        f57214u0 = i10 % 128;
        int i11 = i10 % 2;
        c(moVar);
        Unit unit = Unit.INSTANCE;
        if (i11 != 0) {
            int i12 = 31 / 0;
        }
        return unit;
    }
}
