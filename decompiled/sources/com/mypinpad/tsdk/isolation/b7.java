package com.mypinpad.tsdk.isolation;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final /* synthetic */ class b7 extends FunctionReferenceImpl implements Function3<setHorizontalScrollbarOverlay, String, Throwable, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final long f54264p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f54265q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f54266r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f54267s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f54268t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final byte[] f54269u0 = null;

    static {
        c();
        f54267s0 = 0;
        f54268t0 = 1;
        f54265q0 = 0;
        f54266r0 = 1;
        f54264p0 = 1902550760947891849L;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b7(pd pdVar) throws Throwable {
        Object[] objArr = new Object[1];
        a("嵺뻤驂\uf7b6팅⽉࣋搠", TextUtils.indexOf("", "", 0, 0) + 58271, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("嵺\uf15cԲ夞\uede5Ƒ喛\ue868㰎倍\ue4fb㣜䲧\ue0ca㝑䬮鼞㏠䟎鮋\u2e73䉉陫⫼给銼⚅畬褴\udd5a燠藈\ud999汾聙퐥栅벒킘撀뭡콭挝럥쯏ᾩ눧왻ᨤ금싶ᚺꫝ率\u0d45ꄑ\uf5f1ঞ嶛\uf197ш堼\uec02à哥\ue8b5㽺半\ue734㯼供\ue3a3㞇䩯鸿㉜䛞髍⺎絸酙┨礂跗↷痖蠭\udc09", 44071 - TextUtils.getCapsMode("", 0, 0), objArr2);
        super(3, pdVar, pd.class, strIntern, ((String) objArr2[0]).intern(), 0);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:44:0x01ef  */
    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        Throwable cause;
        int i11 = f54268t0 + 19;
        f54267s0 = i11 % 128;
        int i12 = 2;
        int i13 = i11 % 2;
        char[] charArray = str.toCharArray();
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = i10;
        int length = charArray.length;
        long[] jArr = new long[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i14 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i14 >= charArray.length) {
                break;
            }
            int i15 = f54267s0 + 67;
            f54268t0 = i15 % 128;
            int i16 = i15 % i12;
            char c10 = charArray[i14];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[i12] = setlayoutanimation;
                objArr2[1] = setlayoutanimation;
                objArr2[0] = Integer.valueOf(c10);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(-764403778);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (TextUtils.lastIndexOf("", '0') + 1), View.getDefaultSize(0, 0) + 33, Drawable.resolveOpacity(0, 0) + 1195);
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    b(b10, b11, b11, objArr3);
                    method = cls.getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                    map.put(-764403778, method);
                }
                jArr[i14] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (f54264p0 ^ 1779209353347916695L);
                Object[] objArr4 = {setlayoutanimation, setlayoutanimation};
                Object method2 = map.get(645183118);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) View.combineMeasuredStates(0, 0), Process.getGidForName("") + 45, Process.getGidForName("") + 729);
                    byte b12 = (byte) 1;
                    byte b13 = (byte) (b12 - 1);
                    Object[] objArr5 = new Object[1];
                    b(b12, b13, b13, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(645183118, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                i12 = 2;
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
            int i17 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i17 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            int i18 = f54267s0 + 49;
            f54268t0 = i18 % 128;
            if (i18 % 2 == 0) {
                cArr[i17] = (char) jArr[i17];
                Object[] objArr6 = {setlayoutanimation, setlayoutanimation};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(645183118);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 44 - ExpandableListView.getPackedPositionGroup(0L), 728 - View.getDefaultSize(0, 0));
                    byte b14 = (byte) 1;
                    byte b15 = (byte) (b14 - 1);
                    Object[] objArr7 = new Object[1];
                    b(b14, b15, b15, objArr7);
                    method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(645183118, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                int i19 = 82 / 0;
            } else {
                cArr[i17] = (char) jArr[i17];
                Object[] objArr8 = {setlayoutanimation, setlayoutanimation};
                Map map3 = setTextScaleX.setMaxEms;
                Object method4 = map3.get(645183118);
                if (method4 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 44 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 727 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    byte b16 = (byte) 1;
                    byte b17 = (byte) (b16 - 1);
                    Object[] objArr9 = new Object[1];
                    b(b16, b17, b17, objArr9);
                    method4 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                    map3.put(645183118, method4);
                }
                ((Method) method4).invoke(null, objArr8);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r6 = 110 - r6
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r8 = r8 * 2
            int r0 = 1 - r8
            byte[] r0 = new byte[r0]
            r1 = 0
            int r8 = 0 - r8
            byte[] r2 = com.mypinpad.tsdk.isolation.b7.f54269u0
            if (r2 != 0) goto L1c
            r6 = r7
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L34
        L1c:
            r3 = r1
        L1d:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2c:
            r3 = r2[r7]
            r5 = r9
            r9 = r8
            r8 = r3
            r3 = r2
            r2 = r0
            r0 = r5
        L34:
            int r7 = r7 + 1
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.b7.b(byte, short, short, java.lang.Object[]):void");
    }

    public static void c() {
        f54269u0 = new byte[]{Constants.RESP_MSG_TEMPLATE_FORMAT_2, 86, 126, 91};
    }

    public final void d(@NotNull setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay, @NotNull String str, @Nullable Throwable th2) {
        int i10 = f54266r0 + 95;
        f54265q0 = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(sethorizontalscrollbaroverlay, "");
        Intrinsics.checkNotNullParameter(str, "");
        pd pdVar = (pd) this.receiver;
        pd.setOnFocusChangeListener(new Object[]{pdVar, sethorizontalscrollbaroverlay, str, th2}, 1784152055, -1784152053, System.identityHashCode(pdVar));
        int i12 = f54266r0 + 105;
        f54265q0 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 80 / 0;
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ Unit invoke(setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay, String str, Throwable th2) {
        int i10 = f54265q0 + 31;
        f54266r0 = i10 % 128;
        int i11 = i10 % 2;
        d(sethorizontalscrollbaroverlay, str, th2);
        if (i11 == 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i12 = f54265q0 + 67;
        f54266r0 = i12 % 128;
        if (i12 % 2 != 0) {
            return unit2;
        }
        throw null;
    }
}
