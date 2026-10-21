package com.mypinpad.tsdk.isolation;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/mo;", "", "d", "(Lcom/mypinpad/tsdk/i/mo;)V"}, k = 3, mv = {1, 8, 0})
final class f8 extends Lambda implements Function1<mo, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final char f55498q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final char f55499r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final char f55500s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final char f55501t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f55502u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f55503w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f55504x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final byte[] f55505y0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ long f55506p0;

    static {
        c();
        f55503w0 = 0;
        f55504x0 = 1;
        f55502u0 = 0;
        v0 = 1;
        f55501t0 = (char) 40624;
        f55500s0 = (char) 35993;
        f55498q0 = (char) 44482;
        f55499r0 = (char) 54095;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(long j10) {
        super(1);
        this.f55506p0 = j10;
    }

    public static void a(int i10, Object[] objArr) throws Throwable {
        int i11;
        int i12 = f55504x0 + 31;
        f55503w0 = i12 % 128;
        int i13 = 2;
        int i14 = i12 % 2;
        char[] charArray = "諯둸ꃉ\u00adㆁ聤ᾄ얕㼬僓蠾ᠲ".toCharArray();
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
            int i17 = f55503w0 + 17;
            f55504x0 = i17 % 128;
            if (i17 % i13 == 0) {
                cArr2[1] = charArray[i16];
                cArr2[i15] = charArray[i16];
            } else {
                cArr2[i15] = charArray[i16];
                cArr2[1] = charArray[i16 + 1];
            }
            int i18 = 58224;
            int i19 = i15;
            while (i19 < 16) {
                int i20 = f55503w0 + 19;
                f55504x0 = i20 % 128;
                int i21 = i20 % i13;
                char c10 = cArr2[1];
                char c11 = cArr2[i15];
                int i22 = (c11 + i18) ^ ((c11 << 4) + ((char) (((long) f55500s0) ^ 4333817592127744003L)));
                int i23 = c11 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f55501t0);
                    objArr2[i13] = Integer.valueOf(i23);
                    objArr2[1] = Integer.valueOf(i22);
                    objArr2[i15] = Integer.valueOf(c10);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-1434759016);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (KeyEvent.getDeadChar(i15, i15) + 48534), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 47, TextUtils.indexOf("", "") + 2672);
                        byte b10 = (byte) i15;
                        byte b11 = (byte) (b10 + 1);
                        Object[] objArr3 = new Object[1];
                        b(b11, (byte) (b11 - 1), b10, objArr3);
                        String str = (String) objArr3[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str, cls2, cls2, cls2, cls2);
                        map.put(-1434759016, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr2[1] = cCharValue;
                    Object[] objArr4 = {Integer.valueOf(cArr2[0]), Integer.valueOf((cCharValue + i18) ^ ((cCharValue << 4) + ((char) (((long) f55498q0) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f55499r0)};
                    Object method2 = map.get(-1434759016);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (TextUtils.indexOf("", "", 0, 0) + 48534), KeyEvent.getDeadChar(0, 0) + 47, View.MeasureSpec.makeMeasureSpec(0, 0) + 2672);
                        byte b12 = (byte) 0;
                        byte b13 = (byte) (b12 + 1);
                        Object[] objArr5 = new Object[1];
                        b(b13, (byte) (b13 - 1), b12, objArr5);
                        String str2 = (String) objArr5[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str2, cls4, cls4, cls4, cls4);
                        map.put(-1434759016, method2);
                    }
                    cArr2[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i18 -= 40503;
                    i19++;
                    i13 = 2;
                    i15 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i24 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            cArr[i24] = cArr2[0];
            cArr[i24 + 1] = cArr2[1];
            Object[] objArr6 = {setalwaysdrawnwithcacheenabled, setalwaysdrawnwithcacheenabled};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1396159716);
            if (method3 != null) {
                i11 = 2;
            } else {
                Class cls5 = (Class) setTextScaleX.setX((char) (Process.myTid() >> 22), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 36, (Process.myPid() >> 22) + 2145);
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                b(b15, b15, b14, objArr7);
                i11 = 2;
                method3 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1396159716, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            i13 = i11;
            i15 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 2
            int r7 = 105 - r7
            int r9 = r9 * 2
            int r9 = 3 - r9
            int r8 = r8 * 4
            int r8 = r8 + 1
            byte[] r0 = new byte[r8]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.f8.f55505y0
            if (r2 != 0) goto L1a
            r5 = r1
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            goto L35
        L1a:
            r3 = r1
        L1b:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r0[r3] = r4
            int r9 = r9 + 1
            if (r5 != r8) goto L2c
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r1)
            r10[r1] = r7
            return
        L2c:
            r3 = r2[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r6
        L35:
            int r7 = r7 + r8
            r8 = r9
            r9 = r10
            r10 = r0
            r0 = r2
            r2 = r3
            r3 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.f8.b(byte, byte, int, java.lang.Object[]):void");
    }

    public static void c() {
        f55505y0 = new byte[]{27, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 45, -113};
    }

    public final void d(@NotNull mo moVar) throws Throwable {
        int i10 = f55502u0 + 99;
        v0 = i10 % 128;
        int i11 = i10 % 2;
        long j10 = this.f55506p0;
        if (i11 == 0) {
            Intrinsics.checkNotNullParameter(moVar, "");
            SystemClock.currentThreadTimeMillis();
            Object[] objArr = new Object[1];
            a(0, objArr);
            mo.setY(new Object[]{moVar, ((String) objArr[0]).intern(), Long.valueOf(j10)}, -66017702, 66017710, System.identityHashCode(moVar));
        } else {
            Intrinsics.checkNotNullParameter(moVar, "");
            Object[] objArr2 = new Object[1];
            a(13 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
            mo.setY(new Object[]{moVar, ((String) objArr2[0]).intern(), Long.valueOf(j10)}, -66017702, 66017710, System.identityHashCode(moVar));
        }
        int i12 = v0 + 101;
        f55502u0 = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(mo moVar) throws Throwable {
        int i10 = v0 + 93;
        f55502u0 = i10 % 128;
        int i11 = i10 % 2;
        d(moVar);
        if (i11 == 0) {
            return Unit.INSTANCE;
        }
        Unit unit = Unit.INSTANCE;
        throw null;
    }
}
