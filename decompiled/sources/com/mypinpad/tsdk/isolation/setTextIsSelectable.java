package com.mypinpad.tsdk.isolation;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.camera.camera2.internal.n1;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import java.io.Closeable;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/mypinpad/tsdk/i/setTextIsSelectable;", "Ljava/io/Closeable;", "", HearingDisabilitiesConstants.CLOSE_MODAL, "()V", "", "p0", "[B", "setY", "()[B", "setX", "<init>", "([B)V", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 5, 1})
public final class setTextIsSelectable implements Closeable {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static long f60674q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f60675r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f60676s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f60677t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final byte[] f60678u0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] setX;

    static {
        b();
        f60677t0 = 1;
        f60675r0 = 0;
        f60676s0 = 1;
        e();
        INSTANCE = new Companion(null);
        int i10 = f60676s0 + 29;
        f60675r0 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:38:0x01ab  */
    public setTextIsSelectable(@NotNull byte[] bArr) throws Throwable {
        Throwable cause;
        int i10;
        Intrinsics.checkNotNullParameter(bArr, "");
        this.setX = bArr;
        int i11 = 16;
        if (bArr.length >= 16) {
            return;
        }
        int packedPositionGroup = 22303 - ExpandableListView.getPackedPositionGroup(0L);
        int i12 = f60677t0 + 87;
        int i13 = i12 % 128;
        char c10 = 2;
        int i14 = i12 % 2;
        int i15 = i13 + 69;
        f60677t0 = i15 % 128;
        if (i15 % 2 == 0) {
            "渊㤲쀛歽㉕\uddb3擖\u0fe7훑縪ए큰筊ʺ궓瓸ῒꜷ乌".toCharArray();
            throw null;
        }
        char[] charArray = "渊㤲쀛歽㉕\uddb3擖\u0fe7훑縪ए큰筊ʺ궓瓸ῒꜷ乌".toCharArray();
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = packedPositionGroup;
        int length = charArray.length;
        long[] jArr = new long[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i16 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i16 >= charArray.length) {
                break;
            }
            char c11 = charArray[i16];
            try {
                Object[] objArr = new Object[3];
                objArr[c10] = setlayoutanimation;
                objArr[1] = setlayoutanimation;
                objArr[0] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(-764403778);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getTapTimeout() >> i11), 33 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1195 - (ViewConfiguration.getPressedStateDuration() >> 16));
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 - 1);
                    Object[] objArr2 = new Object[1];
                    a(b10, b11, (byte) (-b11), objArr2);
                    method = cls.getMethod((String) objArr2[0], Integer.TYPE, Object.class, Object.class);
                    map.put(-764403778, method);
                }
                jArr[i16] = ((Long) ((Method) method).invoke(null, objArr)).longValue() ^ (f60674q0 ^ 1779209353347916695L);
                Object[] objArr3 = {setlayoutanimation, setlayoutanimation};
                Object method2 = map.get(645183118);
                if (method2 != null) {
                    i10 = 16;
                } else {
                    i10 = 16;
                    Class cls2 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.lastIndexOf("", '0', 0) + 45, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 728);
                    byte b12 = (byte) 0;
                    byte b13 = (byte) (b12 - 1);
                    Object[] objArr4 = new Object[1];
                    a(b12, b13, (byte) (b13 + 1), objArr4);
                    method2 = cls2.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(645183118, method2);
                }
                ((Method) method2).invoke(null, objArr3);
                i11 = i10;
                c10 = 2;
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
                throw new IllegalArgumentException(n1.f(cArr).toString());
            }
            int i18 = f60677t0 + 67;
            int i19 = i18 % 128;
            int i20 = i18 % 2;
            cArr[i17] = (char) jArr[i17];
            Object[] objArr5 = {setlayoutanimation, setlayoutanimation};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(645183118);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) TextUtils.getOffsetBefore("", 0), 45 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 728);
                byte b14 = (byte) 0;
                byte b15 = (byte) (b14 - 1);
                Object[] objArr6 = new Object[1];
                a(b14, b15, (byte) (b15 + 1), objArr6);
                method3 = cls3.getMethod((String) objArr6[0], Object.class, Object.class);
                map2.put(645183118, method3);
            }
            ((Method) method3).invoke(null, objArr5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r0 = 1 - r6
            int r8 = r8 * 3
            int r8 = r8 + 107
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r1 = 0
            int r6 = 0 - r6
            byte[] r2 = com.mypinpad.tsdk.isolation.setTextIsSelectable.f60678u0
            if (r2 != 0) goto L1a
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L35
        L1a:
            r3 = r1
        L1b:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2a:
            int r7 = r7 + 1
            r3 = r2[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r5
        L35:
            int r7 = -r7
            int r7 = r7 + r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setTextIsSelectable.a(int, short, int, java.lang.Object[]):void");
    }

    public static void b() {
        f60678u0 = new byte[]{GenerateAcResponseApdu.DDA_HEADER, Constants.CVR_B2b65_CLEAR_BITS, -41, Constants.STATE_ERROR};
    }

    public static void e() {
        f60674q0 = 2841831879734103515L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i10 = f60675r0 + 69;
        f60676s0 = i10 % 128;
        int i11 = i10 % 2;
        byte[] bArr = this.setX;
        if (i11 != 0) {
            Random.INSTANCE.nextBytes(bArr);
        } else {
            Random.INSTANCE.nextBytes(bArr);
            throw null;
        }
    }

    @JvmName(name = "setY")
    @NotNull
    public final byte[] setY() {
        int i10 = f60676s0 + 23;
        f60675r0 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.setX;
        }
        throw null;
    }
}
