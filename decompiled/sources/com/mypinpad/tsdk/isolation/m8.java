package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
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
final class m8 extends Lambda implements Function1<mo, Unit> {
    public static final int E0 = 0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final char f57055q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final char f57056r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final char f57057s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final char f57058t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f57059u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f57060w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f57061x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final byte[] f57062y0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ setHorizontalScrollBarEnabled f57063p0;

    static {
        c();
        f57060w0 = 0;
        f57061x0 = 1;
        f57059u0 = 0;
        v0 = 1;
        f57058t0 = (char) 41148;
        f57057s0 = (char) 64973;
        f57055q0 = (char) 46261;
        f57056r0 = (char) 46049;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(setHorizontalScrollBarEnabled sethorizontalscrollbarenabled) {
        super(1);
        this.f57063p0 = sethorizontalscrollbarenabled;
    }

    public static void a(int i10, Object[] objArr) throws Throwable {
        int i11;
        int i12;
        char[] charArray = "共騶∑莎킘\ue5ff씕퉂ᰇ萱".toCharArray();
        setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
        char[] cArr = new char[charArray.length];
        int i13 = 0;
        setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
        int i14 = 2;
        char[] cArr2 = new char[2];
        while (true) {
            int i15 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            if (i15 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i10);
                return;
            }
            int i16 = f57061x0 + 11;
            f57060w0 = i16 % 128;
            int i17 = 1;
            int i18 = 58224;
            if (i16 % i14 != 0) {
                cArr2[i13] = charArray[i15];
                cArr2[i13] = charArray[i15];
                i11 = 1;
            } else {
                cArr2[i13] = charArray[i15];
                cArr2[1] = charArray[i15 + 1];
                i11 = i13;
            }
            while (i11 < 16) {
                int i19 = f57060w0 + i17;
                f57061x0 = i19 % 128;
                int i20 = i19 % i14;
                char c10 = cArr2[i17];
                char c11 = cArr2[i13];
                int i21 = i18;
                int i22 = (c11 + i18) ^ ((c11 << 4) + ((char) (((long) f57057s0) ^ 4333817592127744003L)));
                int i23 = c11 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f57058t0);
                    objArr2[i14] = Integer.valueOf(i23);
                    objArr2[1] = Integer.valueOf(i22);
                    objArr2[i13] = Integer.valueOf(c10);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-1434759016);
                    int i24 = E0;
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (48534 - (ViewConfiguration.getScrollBarSize() >> 8)), 48 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 2672 - TextUtils.indexOf("", "", i13));
                        byte b10 = (byte) (i24 & 3);
                        byte b11 = (byte) (b10 - 1);
                        Object[] objArr3 = new Object[1];
                        b(b11, b11, b10, objArr3);
                        String str = (String) objArr3[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str, cls2, cls2, cls2, cls2);
                        map.put(-1434759016, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr2[1] = cCharValue;
                    Object[] objArr4 = {Integer.valueOf(cArr2[0]), Integer.valueOf((cCharValue + i21) ^ ((cCharValue << 4) + ((char) (((long) f57055q0) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f57056r0)};
                    Object method2 = map.get(-1434759016);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (48533 - ExpandableListView.getPackedPositionChild(0L)), 46 - TextUtils.indexOf((CharSequence) "", '0'), 2673 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        byte b12 = (byte) (i24 & 3);
                        byte b13 = (byte) (b12 - 1);
                        Object[] objArr5 = new Object[1];
                        b(b13, b13, b12, objArr5);
                        String str2 = (String) objArr5[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str2, cls4, cls4, cls4, cls4);
                        map.put(-1434759016, method2);
                    }
                    cArr2[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i18 = i21 - 40503;
                    i11++;
                    i13 = 0;
                    i14 = 2;
                    i17 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i25 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            cArr[i25] = cArr2[0];
            cArr[i25 + 1] = cArr2[1];
            Object[] objArr6 = {setalwaysdrawnwithcacheenabled, setalwaysdrawnwithcacheenabled};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1396159716);
            if (method3 != null) {
                i12 = 2;
            } else {
                Class cls5 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), Color.argb(0, 0, 0, 0) + 37, Color.alpha(0) + 2145);
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                b(b15, b15, b14, objArr7);
                i12 = 2;
                method3 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1396159716, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            i14 = i12;
            i13 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r8 = 105 - r8
            int r7 = r7 * 3
            int r0 = 1 - r7
            int r6 = r6 * 3
            int r6 = 3 - r6
            byte[] r0 = new byte[r0]
            r1 = 0
            int r7 = 0 - r7
            byte[] r2 = com.mypinpad.tsdk.isolation.m8.f57062y0
            if (r2 != 0) goto L1a
            r8 = r7
            r3 = r8
            r4 = r1
            r7 = r6
            goto L32
        L1a:
            r3 = r1
        L1b:
            byte r4 = (byte) r8
            int r6 = r6 + 1
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2c:
            r3 = r2[r6]
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L32:
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.m8.b(int, int, short, java.lang.Object[]):void");
    }

    public static void c() {
        f57062y0 = new byte[]{25, -30, -107, -39};
        E0 = 93;
    }

    public final void d(@NotNull mo moVar) throws Throwable {
        int i10 = f57059u0 + 123;
        v0 = i10 % 128;
        int i11 = i10 % 2;
        setHorizontalScrollBarEnabled sethorizontalscrollbarenabled = this.f57063p0;
        if (i11 == 0) {
            Intrinsics.checkNotNullParameter(moVar, "");
            Object[] objArr = new Object[1];
            a(23 >>> Drawable.resolveOpacity(1, 1), objArr);
            setLogoDescription setlogodescription = (setLogoDescription) sethorizontalscrollbarenabled;
            mo.setY(new Object[]{moVar, ((String) objArr[0]).intern(), (byte[]) setLogoDescription.setDividerPadding(new Object[]{setlogodescription}, -1494206688, 1494206688, System.identityHashCode(setlogodescription))}, -948176262, 948176266, System.identityHashCode(moVar));
            return;
        }
        Intrinsics.checkNotNullParameter(moVar, "");
        Object[] objArr2 = new Object[1];
        a(Drawable.resolveOpacity(0, 0) + 9, objArr2);
        setLogoDescription setlogodescription2 = (setLogoDescription) sethorizontalscrollbarenabled;
        mo.setY(new Object[]{moVar, ((String) objArr2[0]).intern(), (byte[]) setLogoDescription.setDividerPadding(new Object[]{setlogodescription2}, -1494206688, 1494206688, System.identityHashCode(setlogodescription2))}, -948176262, 948176266, System.identityHashCode(moVar));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(mo moVar) throws Throwable {
        int i10 = v0 + 75;
        f57059u0 = i10 % 128;
        int i11 = i10 % 2;
        d(moVar);
        if (i11 == 0) {
            return Unit.INSTANCE;
        }
        Unit unit = Unit.INSTANCE;
        throw null;
    }
}
