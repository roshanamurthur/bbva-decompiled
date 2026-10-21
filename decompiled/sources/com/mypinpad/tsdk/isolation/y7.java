package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
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
final class y7 extends Lambda implements Function1<mo, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final char f61999q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final char f62000r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final char f62001s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final char f62002t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final int f62003u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f62004w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final byte[] f62005x0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f62006p0;

    static {
        c();
        v0 = 0;
        f62004w0 = 1;
        f62003u0 = 1;
        f62002t0 = (char) 33647;
        f62001s0 = (char) 48719;
        f61999q0 = (char) 37393;
        f62000r0 = (char) 61701;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(boolean z10) {
        super(1);
        this.f62006p0 = z10;
    }

    public static void a(int i10, Object[] objArr) throws Throwable {
        int i11;
        int i12 = v0 + 109;
        f62004w0 = i12 % 128;
        int i13 = 2;
        int i14 = i12 % 2;
        char[] charArray = "漲\ue362尽꼼퉂낂㏌힗".toCharArray();
        setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
        char[] cArr = new char[charArray.length];
        int i15 = 0;
        setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
        char[] cArr2 = new char[2];
        while (true) {
            int i16 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            if (i16 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i10);
                return;
            }
            cArr2[i15] = charArray[i16];
            int i17 = 1;
            cArr2[1] = charArray[i16 + 1];
            int i18 = 58224;
            int i19 = i15;
            while (i19 < 16) {
                int i20 = f62004w0 + 73;
                v0 = i20 % 128;
                int i21 = i20 % i13;
                char c10 = cArr2[i17];
                char c11 = cArr2[i15];
                int i22 = (c11 + i18) ^ ((c11 << 4) + ((char) (((long) f62001s0) ^ 4333817592127744003L)));
                int i23 = c11 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f62002t0);
                    objArr2[i13] = Integer.valueOf(i23);
                    objArr2[i17] = Integer.valueOf(i22);
                    objArr2[0] = Integer.valueOf(c10);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-1434759016);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 48533), Drawable.resolveOpacity(0, 0) + 47, 2671 - TextUtils.indexOf((CharSequence) "", '0', 0));
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[i17];
                        b(b11, b11, b10, objArr3);
                        String str = (String) objArr3[0];
                        Class<?>[] clsArr = new Class[4];
                        Class<?> cls2 = Integer.TYPE;
                        clsArr[0] = cls2;
                        clsArr[i17] = cls2;
                        clsArr[2] = cls2;
                        clsArr[3] = cls2;
                        method = cls.getMethod(str, clsArr);
                        map.put(-1434759016, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr2[i17] = cCharValue;
                    int i24 = i19;
                    Object[] objArr4 = {Integer.valueOf(cArr2[0]), Integer.valueOf((cCharValue + i18) ^ ((cCharValue << 4) + ((char) (((long) f61999q0) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f62000r0)};
                    Object method2 = map.get(-1434759016);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (48533 - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 47, Color.rgb(0, 0, 0) + 16779888);
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr5 = new Object[1];
                        b(b13, b13, b12, objArr5);
                        String str2 = (String) objArr5[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str2, cls4, cls4, cls4, cls4);
                        map.put(-1434759016, method2);
                    }
                    cArr2[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i18 -= 40503;
                    i19 = i24 + 1;
                    int i25 = v0 + 111;
                    f62004w0 = i25 % 128;
                    int i26 = i25 % 2;
                    i13 = 2;
                    i15 = 0;
                    i17 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i27 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            cArr[i27] = cArr2[0];
            cArr[i27 + 1] = cArr2[1];
            Object[] objArr6 = {setalwaysdrawnwithcacheenabled, setalwaysdrawnwithcacheenabled};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1396159716);
            if (method3 != null) {
                i11 = 2;
            } else {
                Class cls5 = (Class) setTextScaleX.setX((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), View.MeasureSpec.getMode(0) + 37, TextUtils.getOffsetAfter("", 0) + 2145);
                byte b14 = (byte) 0;
                byte b15 = (byte) (b14 + 1);
                Object[] objArr7 = new Object[1];
                b(b15, (byte) (b15 - 1), b14, objArr7);
                i11 = 2;
                method3 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1396159716, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            i13 = i11;
            i15 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:11:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r6 = r6 * 2
            int r6 = r6 + 103
            byte[] r0 = new byte[r8]
            byte[] r1 = com.mypinpad.tsdk.isolation.y7.f62005x0
            r2 = 0
            if (r1 != 0) goto L1a
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L37
        L1a:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1e:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L2d
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2d:
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L37:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r8 + 1
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.y7.b(byte, int, short, java.lang.Object[]):void");
    }

    public static void c() {
        f62005x0 = new byte[]{118, 91, ByteSourceJsonBootstrapper.UTF8_BOM_3, -74};
    }

    public final void d(@NotNull mo moVar) throws Throwable {
        int i10 = f62003u0 + 25;
        int i11 = i10 % 128;
        int i12 = i10 % 2;
        boolean z10 = this.f62006p0;
        if (i12 != 0) {
            Intrinsics.checkNotNullParameter(moVar, "");
            Object[] objArr = new Object[1];
            a(60 >> (ViewConfiguration.getEdgeSlop() + 79), objArr);
            mo.setY(new Object[]{moVar, ((String) objArr[0]).intern(), Boolean.valueOf(z10)}, -1923904944, 1923904949, System.identityHashCode(moVar));
            return;
        }
        Intrinsics.checkNotNullParameter(moVar, "");
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getEdgeSlop() >> 16) + 7, objArr2);
        mo.setY(new Object[]{moVar, ((String) objArr2[0]).intern(), Boolean.valueOf(z10)}, -1923904944, 1923904949, System.identityHashCode(moVar));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(mo moVar) throws Throwable {
        int i10 = f62003u0;
        int i11 = i10 + 73;
        int i12 = i11 % 128;
        int i13 = i11 % 2;
        d(moVar);
        Unit unit = Unit.INSTANCE;
        if (i13 != 0) {
            int i14 = 26 / 0;
        }
        int i15 = i10 + 111;
        int i16 = i15 % 128;
        int i17 = i15 % 2;
        return unit;
    }
}
