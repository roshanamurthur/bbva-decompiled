package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
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
final class z7 extends Lambda implements Function1<mo, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final char[] f62278q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final long f62279r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f62280s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f62281t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final byte[] f62282u0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ String f62283p0;

    static {
        b();
        f62280s0 = 0;
        f62281t0 = 1;
        f62279r0 = 5749001456408312551L;
        f62278q0 = new char[]{50798, 47746, 16281, 45208, 13724, 46735};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(String str) {
        super(1);
        this.f62283p0 = str;
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
    public static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r0 = r8 + 1
            int r6 = 72 - r6
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.z7.f62282u0
            if (r2 != 0) goto L15
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L33
        L15:
            r3 = r1
        L16:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L28:
            int r7 = r7 + 1
            r3 = r2[r7]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r5
        L33:
            int r6 = r6 + r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.z7.a(byte, int, short, java.lang.Object[]):void");
    }

    public static void b() {
        f62282u0 = new byte[]{70, -122, 54, 105};
    }

    /* JADX WARN: Code duplicated, block: B:68:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:69:0x03e7  */
    public final void c(@NotNull mo moVar) throws Throwable {
        Throwable cause;
        int i10;
        Intrinsics.checkNotNullParameter(moVar, "");
        char c10 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
        int i11 = 0;
        int i12 = 1;
        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 1;
        int i13 = 5;
        int iLastIndexOf = 5 - TextUtils.lastIndexOf("", '0', 0, 0);
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode();
        long[] jArr = new long[iLastIndexOf];
        setcompounddrawabletintblendmode.setDividerPadding = 0;
        while (true) {
            int i14 = setcompounddrawabletintblendmode.setDividerPadding;
            if (i14 >= iLastIndexOf) {
                break;
            }
            int i15 = f62280s0 + 61;
            f62281t0 = i15 % 128;
            int i16 = i15 % 2;
            char[] cArr = f62278q0;
            byte[] bArr = f62282u0;
            if (i16 == 0) {
                try {
                    Object[] objArr = new Object[i12];
                    objArr[i11] = Integer.valueOf(cArr[bitsPerPixel + i14]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(1832327647);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (TypedValue.complexToFraction(i11, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i11, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44, 729 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                        byte b10 = (byte) i13;
                        byte b11 = (byte) (-1);
                        Object[] objArr2 = new Object[1];
                        a(b10, b11, (byte) (b11 + 1), objArr2);
                        method = cls.getMethod((String) objArr2[0], Integer.TYPE);
                        map.put(1832327647, method);
                    }
                    long jLongValue = ((Long) ((Method) method).invoke(null, objArr)).longValue();
                    i10 = bitsPerPixel;
                    Object[] objArr3 = {Long.valueOf(jLongValue), Long.valueOf(setcompounddrawabletintblendmode.setDividerPadding), Long.valueOf(f62279r0), Integer.valueOf(c10)};
                    Object method2 = map.get(2012362404);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (46116 - Color.argb(0, 0, 0, 0)), 43 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0) + 1776);
                        byte length = (byte) bArr.length;
                        byte b12 = (byte) (length - 5);
                        Object[] objArr4 = new Object[1];
                        a(length, b12, (byte) (b12 + 1), objArr4);
                        String str = (String) objArr4[0];
                        Class<?> cls3 = Long.TYPE;
                        method2 = cls2.getMethod(str, cls3, cls3, cls3, Integer.TYPE);
                        map.put(2012362404, method2);
                    }
                    jArr[i14] = ((Long) ((Method) method2).invoke(null, objArr3)).longValue();
                    Object[] objArr5 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                    Object method3 = map.get(1606688712);
                    if (method3 == null) {
                        Class cls4 = (Class) setTextScaleX.setX((char) TextUtils.getTrimmedLength(""), KeyEvent.keyCodeFromString("") + 27, 2311 - View.getDefaultSize(0, 0));
                        byte b13 = (byte) 0;
                        byte b14 = (byte) (b13 - 1);
                        Object[] objArr6 = new Object[1];
                        a(b13, b14, (byte) (b14 + 1), objArr6);
                        method3 = cls4.getMethod((String) objArr6[0], Object.class, Object.class);
                        map.put(1606688712, method3);
                    }
                    ((Method) method3).invoke(null, objArr5);
                } catch (Throwable th2) {
                    cause = th2.getCause();
                    if (cause != null) {
                        throw th2;
                    }
                    throw cause;
                }
            } else {
                i10 = bitsPerPixel;
                iLastIndexOf = iLastIndexOf;
                Object[] objArr7 = {Integer.valueOf(cArr[i10 + i14])};
                Map map2 = setTextScaleX.setMaxEms;
                Object method4 = map2.get(1832327647);
                if (method4 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) (ExpandableListView.getPackedPositionChild(0L) + 1), (ViewConfiguration.getTouchSlop() >> 8) + 44, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 728);
                    byte b15 = (byte) (-1);
                    Object[] objArr8 = new Object[1];
                    a((byte) 5, b15, (byte) (b15 + 1), objArr8);
                    method4 = cls5.getMethod((String) objArr8[0], Integer.TYPE);
                    map2.put(1832327647, method4);
                }
                Object[] objArr9 = {Long.valueOf(((Long) ((Method) method4).invoke(null, objArr7)).longValue()), Long.valueOf(setcompounddrawabletintblendmode.setDividerPadding), Long.valueOf(f62279r0), Integer.valueOf(c10)};
                Object method5 = map2.get(2012362404);
                if (method5 == null) {
                    Class cls6 = (Class) setTextScaleX.setX((char) (TextUtils.indexOf("", "") + 46116), View.MeasureSpec.makeMeasureSpec(0, 0) + 43, 1776 - Gravity.getAbsoluteGravity(0, 0));
                    byte length2 = (byte) bArr.length;
                    byte b16 = (byte) (length2 - 5);
                    Object[] objArr10 = new Object[1];
                    a(length2, b16, (byte) (b16 + 1), objArr10);
                    String str2 = (String) objArr10[0];
                    Class<?> cls7 = Long.TYPE;
                    method5 = cls6.getMethod(str2, cls7, cls7, cls7, Integer.TYPE);
                    map2.put(2012362404, method5);
                }
                jArr[i14] = ((Long) ((Method) method5).invoke(null, objArr9)).longValue();
                Object[] objArr11 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                Object method6 = map2.get(1606688712);
                if (method6 == null) {
                    Class cls8 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getTouchSlop() >> 8), TextUtils.indexOf("", "", 0) + 27, 2311 - (Process.myTid() >> 22));
                    byte b17 = (byte) 0;
                    byte b18 = (byte) (b17 - 1);
                    Object[] objArr12 = new Object[1];
                    a(b17, b18, (byte) (b18 + 1), objArr12);
                    method6 = cls8.getMethod((String) objArr12[0], Object.class, Object.class);
                    map2.put(1606688712, method6);
                }
                ((Method) method6).invoke(null, objArr11);
            }
            bitsPerPixel = i10;
            iLastIndexOf = iLastIndexOf;
            i11 = 0;
            i12 = 1;
            i13 = 5;
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        int i17 = iLastIndexOf;
        char[] cArr2 = new char[i17];
        setcompounddrawabletintblendmode.setDividerPadding = 0;
        while (true) {
            int i18 = setcompounddrawabletintblendmode.setDividerPadding;
            if (i18 >= i17) {
                mo.setY(new Object[]{moVar, n1.f(cArr2), this.f62283p0}, -52655784, 52655794, System.identityHashCode(moVar));
                return;
            }
            int i19 = f62281t0 + 1;
            f62280s0 = i19 % 128;
            if (i19 % 2 != 0) {
                cArr2[i18] = (char) jArr[i18];
                Object[] objArr13 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                Map map3 = setTextScaleX.setMaxEms;
                Object method7 = map3.get(1606688712);
                if (method7 == null) {
                    Class cls9 = (Class) setTextScaleX.setX((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (Process.myPid() >> 22) + 27, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2310);
                    byte b19 = (byte) 0;
                    byte b20 = (byte) (b19 - 1);
                    Object[] objArr14 = new Object[1];
                    a(b19, b20, (byte) (b20 + 1), objArr14);
                    method7 = cls9.getMethod((String) objArr14[0], Object.class, Object.class);
                    map3.put(1606688712, method7);
                }
                ((Method) method7).invoke(null, objArr13);
                throw null;
            }
            cArr2[i18] = (char) jArr[i18];
            Object[] objArr15 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
            Map map4 = setTextScaleX.setMaxEms;
            Object method8 = map4.get(1606688712);
            if (method8 == null) {
                Class cls10 = (Class) setTextScaleX.setX((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), AndroidCharacter.getMirror('0') - 21, ExpandableListView.getPackedPositionType(0L) + 2311);
                byte b21 = (byte) 0;
                byte b22 = (byte) (b21 - 1);
                Object[] objArr16 = new Object[1];
                a(b21, b22, (byte) (b22 + 1), objArr16);
                method8 = cls10.getMethod((String) objArr16[0], Object.class, Object.class);
                map4.put(1606688712, method8);
            }
            ((Method) method8).invoke(null, objArr15);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(mo moVar) throws Throwable {
        c(moVar);
        return Unit.INSTANCE;
    }
}
