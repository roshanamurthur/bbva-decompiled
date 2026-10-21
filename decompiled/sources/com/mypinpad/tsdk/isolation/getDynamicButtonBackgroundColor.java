package com.mypinpad.tsdk.isolation;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/getDynamicButtonBackgroundColor;", "Lcom/mypinpad/tsdk/i/setLayerType;", "", "p0", "<init>", "([B)V", "setDividerPadding"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class getDynamicButtonBackgroundColor extends setLayerType {
    public static final byte[] E0 = null;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static char f55815t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static char f55816u0;
    public static char v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static char f55817w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f55818x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f55819y0;

    static {
        b();
        f55818x0 = 0;
        f55819y0 = 1;
        e();
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getDynamicButtonBackgroundColor(@NotNull byte[] bArr) throws Throwable {
        super(bArr, false, 2, null);
        Intrinsics.checkNotNullParameter(bArr, "");
        int i10 = 0;
        int i11 = 2;
        int i12 = 16;
        if (bArr.length >= 16) {
            return;
        }
        int defaultSize = View.getDefaultSize(0, 0) + 19;
        int i13 = f55819y0 + 117;
        f55818x0 = i13 % 128;
        int i14 = i13 % 2;
        char[] charArray = "䗱ꅗ톊溈翕嶿⠄㙂⽽屄餅쮇햂꯫ᆛ\uf7b5䆥\uda41鶘禆".toCharArray();
        setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
        char[] cArr = new char[charArray.length];
        setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
        char[] cArr2 = new char[2];
        while (true) {
            int i15 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            if (i15 >= charArray.length) {
                throw new IllegalArgumentException(new String(cArr, 0, defaultSize).intern().toString());
            }
            cArr2[i10] = charArray[i15];
            char c10 = 1;
            cArr2[1] = charArray[i15 + 1];
            int i16 = 58224;
            int i17 = i10;
            while (i17 < i12) {
                int i18 = f55818x0 + 81;
                f55819y0 = i18 % 128;
                int i19 = i18 % i11;
                char c11 = cArr2[c10];
                char c12 = cArr2[i10];
                int i20 = i17;
                int i21 = (c12 + i16) ^ ((c12 << 4) + ((char) (((long) v0) ^ 4333817592127744003L)));
                int i22 = c12 >>> 5;
                try {
                    Object[] objArr = new Object[4];
                    objArr[3] = Integer.valueOf(f55817w0);
                    objArr[i11] = Integer.valueOf(i22);
                    objArr[1] = Integer.valueOf(i21);
                    objArr[i10] = Integer.valueOf(c11);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-1434759016);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (48535 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionType(0L) + 47, 2672 - View.MeasureSpec.makeMeasureSpec(i10, i10));
                        byte b10 = (byte) (-1);
                        byte b11 = (byte) (b10 + 1);
                        Object[] objArr2 = new Object[1];
                        a(b11, b10, b11, objArr2);
                        String str = (String) objArr2[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str, cls2, cls2, cls2, cls2);
                        map.put(-1434759016, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                    cArr2[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr2[0]), Integer.valueOf((cCharValue + i16) ^ ((cCharValue << 4) + ((char) (((long) f55815t0) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f55816u0)};
                    Object method2 = map.get(-1434759016);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 48533), 47 - Drawable.resolveOpacity(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 2672);
                        byte b12 = (byte) (-1);
                        byte b13 = (byte) (b12 + 1);
                        Object[] objArr4 = new Object[1];
                        a(b13, b12, b13, objArr4);
                        String str2 = (String) objArr4[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str2, cls4, cls4, cls4, cls4);
                        map.put(-1434759016, method2);
                    }
                    cArr2[0] = ((Character) ((Method) method2).invoke(null, objArr3)).charValue();
                    i16 -= 40503;
                    i17 = i20 + 1;
                    i10 = 0;
                    i11 = 2;
                    i12 = 16;
                    c10 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i23 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            cArr[i23] = cArr2[0];
            cArr[i23 + 1] = cArr2[1];
            Object[] objArr5 = {setalwaysdrawnwithcacheenabled, setalwaysdrawnwithcacheenabled};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1396159716);
            if (method3 == null) {
                Class cls5 = (Class) setTextScaleX.setX((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 37 - View.MeasureSpec.getSize(0), 2145 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                byte b14 = (byte) (-1);
                byte b15 = (byte) (-b14);
                Object[] objArr6 = new Object[1];
                a((byte) (b15 - 1), b14, b15, objArr6);
                method3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
                map2.put(1396159716, method3);
            }
            ((Method) method3).invoke(null, objArr5);
            int i24 = f55818x0 + 109;
            f55819y0 = i24 % 128;
            int i25 = i24 % 2;
            i11 = 2;
            i12 = 16;
            i10 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r0 = r6 + 1
            int r8 = r8 * 2
            int r8 = r8 + 103
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.getDynamicButtonBackgroundColor.E0
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2c
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.getDynamicButtonBackgroundColor.a(byte, int, short, java.lang.Object[]):void");
    }

    public static void b() {
        E0 = new byte[]{Constants.CVR_B1b85_0110_TERMINAL, UtilitiesSDKConstants.SRP_LABEL_ENC, -21, -9};
    }

    public static void e() {
        f55817w0 = (char) 43239;
        v0 = (char) 25704;
        f55815t0 = (char) 59005;
        f55816u0 = (char) 46916;
    }
}
