package com.mypinpad.tsdk.isolation;

import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ComputeCcCommandApdu;
import com.vierge.pinpadsdk.message.base.MessageUtils;
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
final class e8 extends Lambda implements Function1<mo, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final char f55322q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final char f55323r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final char f55324s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final char f55325t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final int f55326u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f55327w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final byte[] f55328x0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ byte[] f55329p0;

    static {
        c();
        v0 = 0;
        f55327w0 = 1;
        f55326u0 = 1;
        f55325t0 = (char) 61392;
        f55324s0 = (char) 8599;
        f55322q0 = (char) 2682;
        f55323r0 = (char) 10245;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(byte[] bArr) {
        super(1);
        this.f55329p0 = bArr;
    }

    public static void a(int i10, Object[] objArr) throws Throwable {
        int i11;
        int i12 = v0 + 111;
        f55327w0 = i12 % 128;
        int i13 = 2;
        int i14 = i12 % 2;
        char[] charArray = "앃兡죦\uf34fⴡ奼".toCharArray();
        int i15 = f55327w0 + 73;
        v0 = i15 % 128;
        int i16 = i15 % 2;
        setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
        char[] cArr = new char[charArray.length];
        int i17 = 0;
        setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
        char[] cArr2 = new char[2];
        while (true) {
            int i18 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            if (i18 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i10);
                return;
            }
            int i19 = f55327w0 + 111;
            v0 = i19 % 128;
            int i20 = i19 % i13;
            cArr2[i17] = charArray[i18];
            cArr2[1] = charArray[i18 + 1];
            int i21 = 58224;
            int i22 = i17;
            while (i22 < 16) {
                int i23 = f55327w0 + 27;
                v0 = i23 % 128;
                int i24 = i23 % i13;
                char c10 = cArr2[1];
                char c11 = cArr2[i17];
                char[] cArr3 = cArr2;
                int i25 = (c11 + i21) ^ ((c11 << 4) + ((char) (((long) f55324s0) ^ 4333817592127744003L)));
                int i26 = c11 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f55325t0);
                    objArr2[i13] = Integer.valueOf(i26);
                    objArr2[1] = Integer.valueOf(i25);
                    objArr2[0] = Integer.valueOf(c10);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-1434759016);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (48534 - View.resolveSize(0, 0)), 47 - (ViewConfiguration.getEdgeSlop() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 2672);
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        b(b10, b11, (byte) (b11 + 1), objArr3);
                        String str = (String) objArr3[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str, cls2, cls2, cls2, cls2);
                        map.put(-1434759016, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr4 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i21) ^ ((cCharValue << 4) + ((char) (((long) f55322q0) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f55323r0)};
                    Object method2 = map.get(-1434759016);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (Gravity.getAbsoluteGravity(0, 0) + 48534), KeyEvent.getDeadChar(0, 0) + 47, MotionEvent.axisFromString("") + 2673);
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr5 = new Object[1];
                        b(b12, b13, (byte) (b13 + 1), objArr5);
                        String str2 = (String) objArr5[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str2, cls4, cls4, cls4, cls4);
                        map.put(-1434759016, method2);
                    }
                    cArr3[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i21 -= 40503;
                    i22++;
                    cArr2 = cArr3;
                    i13 = 2;
                    i17 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            char[] cArr4 = cArr2;
            int i27 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            cArr[i27] = cArr4[0];
            cArr[i27 + 1] = cArr4[1];
            Object[] objArr6 = {setalwaysdrawnwithcacheenabled, setalwaysdrawnwithcacheenabled};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1396159716);
            if (method3 != null) {
                i11 = 2;
            } else {
                Class cls5 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.lastIndexOf("", '0', 0) + 38, TextUtils.getTrimmedLength("") + 2145);
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                b(b14, b15, b15, objArr7);
                i11 = 2;
                method3 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1396159716, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            i13 = i11;
            cArr2 = cArr4;
            i17 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r8 = 105 - r8
            int r6 = r6 * 4
            int r6 = 4 - r6
            int r7 = r7 * 2
            int r0 = r7 + 1
            byte[] r0 = new byte[r0]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.e8.f55328x0
            if (r2 != 0) goto L17
            r4 = r8
            r3 = r1
            r8 = r7
            goto L2c
        L17:
            r3 = r1
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r2[r6]
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r4 = -r4
            int r7 = r7 + r4
            int r6 = r6 + 1
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.e8.b(short, short, short, java.lang.Object[]):void");
    }

    public static void c() {
        f55328x0 = new byte[]{115, ComputeCcCommandApdu.EXPECTED_P1, MessageUtils.MESSAGE_21_NAK, 126};
    }

    public final void d(@NotNull mo moVar) throws Throwable {
        int i10 = f55326u0 + 79;
        int i11 = i10 % 128;
        int i12 = i10 % 2;
        byte[] bArr = this.f55329p0;
        if (i12 != 0) {
            Intrinsics.checkNotNullParameter(moVar, "");
            Object[] objArr = new Object[1];
            a(41 / (ViewConfiguration.getMinimumFlingVelocity() - 24), objArr);
            mo.setY(new Object[]{moVar, ((String) objArr[0]).intern(), bArr}, -948176262, 948176266, System.identityHashCode(moVar));
            return;
        }
        Intrinsics.checkNotNullParameter(moVar, "");
        Object[] objArr2 = new Object[1];
        a(6 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
        mo.setY(new Object[]{moVar, ((String) objArr2[0]).intern(), bArr}, -948176262, 948176266, System.identityHashCode(moVar));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(mo moVar) throws Throwable {
        int i10 = f55326u0;
        int i11 = i10 + 5;
        int i12 = i11 % 128;
        int i13 = i11 % 2;
        d(moVar);
        if (i13 != 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i14 = i10 + 101;
        int i15 = i14 % 128;
        if (i14 % 2 == 0) {
            return unit2;
        }
        throw null;
    }
}
