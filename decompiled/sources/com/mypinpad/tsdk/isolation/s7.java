package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.camera.camera2.internal.n1;
import com.esotericsoftware.asm.Opcodes;
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
final class s7 extends Lambda implements Function1<mo, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f58196q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f58197r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f58198s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f58199t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f58200u0;
    public static final byte[] v0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f58201p0;

    static {
        b();
        f58199t0 = 0;
        f58200u0 = 1;
        f58197r0 = 0;
        f58198s0 = 1;
        f58196q0 = -443080060;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(boolean z10) {
        super(1);
        this.f58201p0 = z10;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r0 = 1 - r8
            int r6 = r6 + 65
            int r7 = r7 * 3
            int r7 = 4 - r7
            byte[] r0 = new byte[r0]
            r1 = 0
            int r8 = 0 - r8
            byte[] r2 = com.mypinpad.tsdk.isolation.s7.v0
            if (r2 != 0) goto L1a
            r6 = r7
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L32
        L1a:
            r3 = r1
        L1b:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2a:
            r3 = r2[r7]
            r5 = r9
            r9 = r8
            r8 = r3
            r3 = r2
            r2 = r0
            r0 = r5
        L32:
            int r7 = r7 + 1
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.s7.a(byte, byte, int, java.lang.Object[]):void");
    }

    public static void b() {
        v0 = new byte[]{33, 11, -39, 90};
    }

    /* JADX WARN: Code duplicated, block: B:39:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:40:0x01da  */
    public final void c(@NotNull mo moVar) throws Throwable {
        char[] charArray;
        int i10;
        Throwable cause;
        int i11 = f58198s0 + 111;
        f58197r0 = i11 % 128;
        int i12 = 2;
        int i13 = i11 % 2;
        Intrinsics.checkNotNullParameter(moVar, "");
        int i14 = 0;
        int iIndexOf = 16 - TextUtils.indexOf("", "", 0, 0);
        int capsMode = TextUtils.getCapsMode("", 0, 0) + Opcodes.MONITORENTER;
        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 15;
        int i15 = f58199t0;
        int i16 = i15 + 17;
        f58200u0 = i16 % 128;
        int i17 = i16 % 2;
        int i18 = i15 + 15;
        f58200u0 = i18 % 128;
        if (i18 % 2 == 0) {
            charArray = "\uffff\u0002�\ufffb\u000e\u000eￛ\f\uffff\u0001\u0001\u000f￼\uffff\ufffe\ufffe".toCharArray();
            int i19 = 91 / 0;
        } else {
            charArray = "\uffff\u0002�\ufffb\u000e\u000eￛ\f\uffff\u0001\u0001\u000f￼\uffff\ufffe\ufffe".toCharArray();
        }
        getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
        char[] cArr = new char[iIndexOf];
        getnavbartitlestring.setY = 0;
        while (true) {
            int i20 = getnavbartitlestring.setY;
            if (i20 >= iIndexOf) {
                break;
            }
            char c10 = charArray[i20];
            getnavbartitlestring.setCompoundDrawableTintBlendMode = c10;
            char c11 = (char) (c10 + capsMode);
            cArr[i20] = c11;
            try {
                Object[] objArr = new Object[i12];
                objArr[1] = Integer.valueOf(f58196q0);
                objArr[i14] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(133002375);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (ExpandableListView.getPackedPositionChild(0L) + 1), 41 - (KeyEvent.getMaxKeyCode() >> 16), 483 - ExpandableListView.getPackedPositionType(0L));
                    byte b10 = (byte) i14;
                    byte b11 = (byte) (b10 + 1);
                    Object[] objArr2 = new Object[1];
                    a(b11, (byte) (b11 - 1), b10, objArr2);
                    String str = (String) objArr2[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str, cls2, cls2);
                    map.put(133002375, method);
                }
                cArr[i20] = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                Object[] objArr3 = {getnavbartitlestring, getnavbartitlestring};
                Object method2 = map.get(1860518195);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (Color.red(0) + 55966), (KeyEvent.getMaxKeyCode() >> 16) + 43, TextUtils.getCapsMode("", 0, 0) + 2268);
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr4 = new Object[1];
                    a(b13, b13, b12, objArr4);
                    method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(1860518195, method2);
                }
                ((Method) method2).invoke(null, objArr3);
                capsMode = capsMode;
                charArray = charArray;
                i12 = 2;
                i14 = 0;
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
        if (tapTimeout > 0) {
            getnavbartitlestring.setOnFocusChangeListener = tapTimeout;
            char[] cArr2 = new char[iIndexOf];
            i10 = 0;
            System.arraycopy(cArr, 0, cArr2, 0, iIndexOf);
            int i21 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, 0, cArr, iIndexOf - i21, i21);
            int i22 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, i22, cArr, 0, iIndexOf - i22);
        } else {
            i10 = 0;
        }
        char[] cArr3 = new char[iIndexOf];
        getnavbartitlestring.setY = i10;
        while (true) {
            int i23 = getnavbartitlestring.setY;
            if (i23 >= iIndexOf) {
                break;
            }
            int i24 = f58200u0 + 19;
            f58199t0 = i24 % 128;
            int i25 = i24 % 2;
            cArr3[i23] = cArr[(iIndexOf - i23) - 1];
            Object[] objArr5 = {getnavbartitlestring, getnavbartitlestring};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1860518195);
            if (method3 == null) {
                Class cls4 = (Class) setTextScaleX.setX((char) (55965 - TextUtils.lastIndexOf("", '0', 0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 42, 2268 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr6 = new Object[1];
                a(b15, b15, b14, objArr6);
                method3 = cls4.getMethod((String) objArr6[0], Object.class, Object.class);
                map2.put(1860518195, method3);
            }
            ((Method) method3).invoke(null, objArr5);
        }
        mo.setY(new Object[]{moVar, n1.f(cArr3), Boolean.valueOf(this.f58201p0)}, -1923904944, 1923904949, System.identityHashCode(moVar));
        int i26 = f58197r0 + 13;
        f58198s0 = i26 % 128;
        if (i26 % 2 == 0) {
            int i27 = 13 / 0;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(mo moVar) throws Throwable {
        int i10 = f58198s0 + 103;
        f58197r0 = i10 % 128;
        int i11 = i10 % 2;
        c(moVar);
        if (i11 == 0) {
            return Unit.INSTANCE;
        }
        Unit unit = Unit.INSTANCE;
        throw null;
    }
}
