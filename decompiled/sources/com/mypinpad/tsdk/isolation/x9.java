package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final /* synthetic */ class x9 extends FunctionReferenceImpl implements Function2<ro, Throwable, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f61759p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f61760q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61761r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f61762s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final byte[] f61763t0 = null;

    static {
        c();
        f61761r0 = 0;
        f61762s0 = 1;
        f61760q0 = 1;
        f61759p0 = -443080009;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x9(ul ulVar) throws Throwable {
        Object[] objArr = new Object[1];
        a(32 - ExpandableListView.getPackedPositionGroup(0L), 215 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 26 - TextUtils.lastIndexOf("", '0', 0, 0), "�￪\u0006\u0007\u0001\f\ufff9\u000b\u0001\n\u0007\u0000\f\r\uffd9￼�\u0004\u0001\ufff9\uffde�\u0004￼\u0006\ufff9\u0000\f\u000b�\r\t", objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 122, (KeyEvent.getMaxKeyCode() >> 16) + ErrorCodes.ERR_CRY_BAD_PROTO, TextUtils.lastIndexOf("", '0', 0) + 58, "\u0010\u0003\u0012\f\u0007ￍ\t\u0002\u0011\u0012ￍ\u0002\uffff\u000e\f\u0007\u000e\u0017\u000bￍ\u000b\r\u0001￪ￆ\u0012\u0011\u0003\u0013\u000f\u0003\ufff0\f\r\u0007\u0012\uffff\u0011\u0007\u0010\r\u0006\u0012\u0013\uffdf\u0002\u0003\n\u0007\uffff￤\u0003\n\u0002\f\uffff\u0006\ufff4ￇ\uffd9\u0003\n\u0000\uffff\u0015\r\u0010\u0006\ufff2ￍ\u0005\f\uffff\nￍ\uffff\u0014\uffff\b￪\uffd9\u0003\u0011\u0013\uffff￡\u0010\r\u0010\u0010￣\f\r\u0007\u0012\u0001\uffff\u0011\f\uffff\u0010\ufff2\t\u0002\ufff1ￍ\u0011\t\u0001\uffff\u0000\n\n\uffff\u0001ￍ\t\u0002\u0011ￍ\n\uffff\f", objArr2);
        super(2, ulVar, ul.class, strIntern, ((String) objArr2[0]).intern(), 0);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:38:0x01ad  */
    public static void a(int i10, int i11, int i12, String str, Object[] objArr) throws Throwable {
        char[] cArr;
        Throwable cause;
        int i13 = f61761r0 + 5;
        f61762s0 = i13 % 128;
        int i14 = 2;
        int i15 = i13 % 2;
        char[] charArray = str.toCharArray();
        getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
        char[] cArr2 = new char[i10];
        int i16 = 0;
        getnavbartitlestring.setY = 0;
        while (true) {
            int i17 = getnavbartitlestring.setY;
            if (i17 >= i10) {
                break;
            }
            char c10 = charArray[i17];
            getnavbartitlestring.setCompoundDrawableTintBlendMode = c10;
            char c11 = (char) (i11 + c10);
            cArr2[i17] = c11;
            try {
                Object[] objArr2 = new Object[i14];
                objArr2[1] = Integer.valueOf(f61759p0);
                objArr2[i16] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(133002375);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) Color.alpha(i16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 40, 483 - TextUtils.getOffsetAfter("", i16));
                    byte b10 = (byte) 1;
                    byte b11 = (byte) (b10 - 1);
                    Object[] objArr3 = new Object[1];
                    b(b10, b11, b11, objArr3);
                    String str2 = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(133002375, method);
                }
                cArr2[i17] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {getnavbartitlestring, getnavbartitlestring};
                Object method2 = map.get(1860518195);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 55967), (-16777173) - Color.rgb(0, 0, 0), 2268 - KeyEvent.normalizeMetaState(0));
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    b(b12, b13, b13, objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(1860518195, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                i14 = 2;
                i16 = 0;
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
        if (i12 > 0) {
            int i18 = f61762s0 + 111;
            f61761r0 = i18 % 128;
            int i19 = i18 % 2;
            getnavbartitlestring.setOnFocusChangeListener = i12;
            char[] cArr3 = new char[i10];
            System.arraycopy(cArr2, 0, cArr3, 0, i10);
            int i20 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr3, 0, cArr2, i10 - i20, i20);
            int i21 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr3, i21, cArr2, 0, i10 - i21);
        }
        int i22 = f61761r0 + 121;
        f61762s0 = i22 % 128;
        if (i22 % 2 == 0) {
            cArr = new char[i10];
            getnavbartitlestring.setY = 1;
        } else {
            cArr = new char[i10];
            getnavbartitlestring.setY = 0;
        }
        while (true) {
            int i23 = getnavbartitlestring.setY;
            if (i23 >= i10) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i23] = cArr2[(i10 - i23) - 1];
            Object[] objArr6 = {getnavbartitlestring, getnavbartitlestring};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1860518195);
            if (method3 == null) {
                Class cls4 = (Class) setTextScaleX.setX((char) (55966 - Drawable.resolveOpacity(0, 0)), 43 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 2268 - TextUtils.getOffsetAfter("", 0));
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                b(b14, b15, b15, objArr7);
                method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1860518195, method3);
            }
            ((Method) method3).invoke(null, objArr6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r0 = r7 + 1
            int r8 = r8 * 4
            int r8 = r8 + 4
            int r6 = r6 + 65
            byte[] r0 = new byte[r0]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.x9.f61763t0
            if (r2 != 0) goto L18
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L35
        L18:
            r3 = r1
        L19:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2b:
            r3 = r2[r8]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L35:
            int r9 = r9 + 1
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.x9.b(byte, int, short, java.lang.Object[]):void");
    }

    public static void c() {
        f61763t0 = new byte[]{125, -24, -123, 69};
    }

    public final void d(@NotNull ro roVar, @Nullable Throwable th2) throws Throwable {
        int i10 = f61760q0 + 61;
        int i11 = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(roVar, "");
            ul.setY((ul) this.receiver, roVar, th2);
        } else {
            Intrinsics.checkNotNullParameter(roVar, "");
            ul.setY((ul) this.receiver, roVar, th2);
            throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(ro roVar, Throwable th2) throws Throwable {
        int i10 = f61760q0 + 27;
        int i11 = i10 % 128;
        int i12 = i10 % 2;
        d(roVar, th2);
        if (i12 == 0) {
            return Unit.INSTANCE;
        }
        Unit unit = Unit.INSTANCE;
        throw null;
    }
}
