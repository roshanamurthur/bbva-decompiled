package com.mypinpad.tsdk.isolation;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.camera.camera2.internal.n1;
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
final class c8 extends Lambda implements Function1<mo, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f54784q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f54785r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f54786s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final byte[] f54787t0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f54788p0;

    static {
        b();
        f54785r0 = 0;
        f54786s0 = 1;
        f54784q0 = -443079943;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(boolean z10) {
        super(1);
        this.f54788p0 = z10;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r0 = 1 - r8
            int r7 = r7 + 65
            int r6 = r6 * 2
            int r6 = 4 - r6
            byte[] r0 = new byte[r0]
            r1 = 0
            int r8 = 0 - r8
            byte[] r2 = com.mypinpad.tsdk.isolation.c8.f54787t0
            if (r2 != 0) goto L1a
            r7 = r6
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L33
        L1a:
            r3 = r1
        L1b:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r2[r6]
            r5 = r9
            r9 = r8
            r8 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r5
        L33:
            int r6 = r6 + 1
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.c8.a(int, byte, int, java.lang.Object[]):void");
    }

    public static void b() {
        f54787t0 = new byte[]{113, 126, 19, 62};
    }

    public final void c(@NotNull mo moVar) throws Throwable {
        char c10;
        long j10;
        int i10 = f54786s0 + 11;
        f54785r0 = i10 % 128;
        int i11 = 2;
        int i12 = i10 % 2;
        Intrinsics.checkNotNullParameter(moVar, "");
        int i13 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9;
        int i14 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 134;
        int i15 = 9 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
        char[] charArray = "￼\u000f\u0001\u0001\ufffb￼\u0006\uffff\ufffe\uffff".toCharArray();
        getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
        char[] cArr = new char[i13];
        int i16 = 0;
        getnavbartitlestring.setY = 0;
        while (true) {
            int i17 = getnavbartitlestring.setY;
            if (i17 >= i13) {
                break;
            }
            char c11 = charArray[i17];
            getnavbartitlestring.setCompoundDrawableTintBlendMode = c11;
            char c12 = (char) (c11 + i14);
            cArr[i17] = c12;
            try {
                Object[] objArr = new Object[i11];
                objArr[1] = Integer.valueOf(f54784q0);
                objArr[i16] = Integer.valueOf(c12);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(133002375);
                if (method != null) {
                    j10 = 0;
                } else {
                    j10 = 0;
                    Class cls = (Class) setTextScaleX.setX((char) TextUtils.indexOf("", ""), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 40, 482 - TextUtils.indexOf((CharSequence) "", '0', i16));
                    byte b10 = (byte) i16;
                    byte b11 = b10;
                    Object[] objArr2 = new Object[1];
                    a(b10, (byte) (b11 + 1), b11, objArr2);
                    String str = (String) objArr2[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str, cls2, cls2);
                    map.put(133002375, method);
                }
                cArr[i17] = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                Object[] objArr3 = {getnavbartitlestring, getnavbartitlestring};
                Object method2 = map.get(1860518195);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (View.MeasureSpec.getMode(0) + 55966), KeyEvent.keyCodeFromString("") + 43, TextUtils.getOffsetBefore("", 0) + 2268);
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr4 = new Object[1];
                    a(b12, b13, b13, objArr4);
                    method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(1860518195, method2);
                }
                ((Method) method2).invoke(null, objArr3);
                i14 = i14;
                charArray = charArray;
                i11 = 2;
                i16 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        if (i15 > 0) {
            getnavbartitlestring.setOnFocusChangeListener = i15;
            char[] cArr2 = new char[i13];
            c10 = 0;
            System.arraycopy(cArr, 0, cArr2, 0, i13);
            int i18 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, 0, cArr, i13 - i18, i18);
            int i19 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, i19, cArr, 0, i13 - i19);
        } else {
            c10 = 0;
        }
        String strF = n1.f(cArr);
        Object[] objArr5 = new Object[3];
        objArr5[c10] = moVar;
        objArr5[1] = strF;
        objArr5[2] = Boolean.valueOf(this.f54788p0);
        mo.setY(objArr5, -1923904944, 1923904949, System.identityHashCode(moVar));
        int i20 = f54785r0 + 111;
        f54786s0 = i20 % 128;
        if (i20 % 2 == 0) {
            throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(mo moVar) throws Throwable {
        int i10 = f54786s0 + 49;
        f54785r0 = i10 % 128;
        int i11 = i10 % 2;
        c(moVar);
        if (i11 != 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i12 = f54786s0 + 75;
        f54785r0 = i12 % 128;
        int i13 = i12 % 2;
        return unit2;
    }
}
