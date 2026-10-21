package com.mypinpad.tsdk.isolation;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.camera.camera2.internal.n1;
import androidx.core.view.PointerIconCompat;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/setShowDividers;", "Lcom/mypinpad/tsdk/i/setLayerType;", "", "p0", "<init>", "([B)V", "setDividerPadding"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class setShowDividers extends setLayerType {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static long f60568t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f60569u0;
    public static char v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f60570w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f60571x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final byte[] f60572y0 = null;

    static {
        b();
        f60570w0 = 0;
        f60571x0 = 1;
        e();
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setShowDividers(@NotNull byte[] bArr) throws Throwable {
        char[] charArray;
        super(bArr, false, 2, null);
        Intrinsics.checkNotNullParameter(bArr, "");
        int i10 = 0;
        int i11 = 2;
        if (bArr.length == 4) {
            return;
        }
        char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 45505);
        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) - 1938606170;
        int i12 = f60570w0 + 15;
        int i13 = i12 % 128;
        f60571x0 = i13;
        int i14 = i12 % 2;
        int i15 = i13 + 81;
        f60570w0 = i15 % 128;
        if (i15 % 2 != 0) {
            "⓭㧅м臓욈㬸蟆됴ŝ뫥\u2e69⦼钡┛ჯ쁷衵\ue59fꊳ".toCharArray();
            throw null;
        }
        char[] charArray2 = "⓭㧅м臓욈㬸蟆됴ŝ뫥\u2e69⦼钡┛ჯ쁷衵\ue59fꊳ".toCharArray();
        int i16 = f60570w0 + 47;
        f60571x0 = i16 % 128;
        if (i16 % 2 == 0) {
            charArray = "魓䪗钎詿".toCharArray();
            int i17 = 47 / 0;
        } else {
            charArray = "魓䪗钎詿".toCharArray();
        }
        int i18 = f60571x0 + 105;
        f60570w0 = i18 % 128;
        int i19 = i18 % 2;
        char[] charArray3 = "Ꙅ猷소풱".toCharArray();
        UiMessageCallbackKtWhenMappings uiMessageCallbackKtWhenMappings = new UiMessageCallbackKtWhenMappings();
        int length = charArray3.length;
        char[] cArr = new char[length];
        int length2 = charArray.length;
        char[] cArr2 = new char[length2];
        System.arraycopy(charArray3, 0, cArr, 0, length);
        System.arraycopy(charArray, 0, cArr2, 0, length2);
        cArr[0] = (char) (absoluteGravity ^ cArr[0]);
        cArr2[2] = (char) (cArr2[2] + ((char) fadingEdgeLength));
        int length3 = charArray2.length;
        char[] cArr3 = new char[length3];
        uiMessageCallbackKtWhenMappings.setX = 0;
        while (uiMessageCallbackKtWhenMappings.setX < length3) {
            int i20 = f60571x0 + 77;
            f60570w0 = i20 % 128;
            int i21 = i20 % i11;
            try {
                Object[] objArr = new Object[1];
                objArr[i10] = uiMessageCallbackKtWhenMappings;
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(20564334);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 50678), 39 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1738 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    byte b10 = (byte) i10;
                    Object[] objArr2 = new Object[1];
                    a(b10, (byte) (-1), (byte) (b10 | 6), objArr2);
                    method = cls.getMethod((String) objArr2[0], Object.class);
                    map.put(20564334, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr)).intValue();
                Object[] objArr3 = {uiMessageCallbackKtWhenMappings};
                Object method2 = map.get(-68974155);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (8125 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 37, TextUtils.lastIndexOf("", '0', 0, 0) + 647);
                    byte b11 = (byte) 0;
                    byte b12 = (byte) (b11 + 3);
                    Object[] objArr4 = new Object[1];
                    a(b11, (byte) (b12 - 4), b12, objArr4);
                    method2 = cls2.getMethod((String) objArr4[0], Object.class);
                    map.put(-68974155, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
                Object[] objArr5 = {uiMessageCallbackKtWhenMappings, Integer.valueOf(cArr[uiMessageCallbackKtWhenMappings.setX % 4] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method3 = map.get(-1108711559);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 49, 434 - Drawable.resolveOpacity(0, 0));
                    byte b13 = (byte) 0;
                    Object[] objArr6 = new Object[1];
                    a(b13, (byte) (-1), (byte) (b13 + 5), objArr6);
                    String str = (String) objArr6[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str, Object.class, cls4, cls4);
                    map.put(-1108711559, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                Object[] objArr7 = {Integer.valueOf(cArr[iIntValue2] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method4 = map.get(533021397);
                if (method4 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4449), 42 - TextUtils.indexOf("", "", 0, 0), View.getDefaultSize(0, 0) + PointerIconCompat.TYPE_GRABBING);
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr8 = new Object[1];
                    a(b14, (byte) (b15 - 1), b15, objArr8);
                    String str2 = (String) objArr8[0];
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str2, cls6, cls6);
                    map.put(533021397, method4);
                }
                cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                char c10 = uiMessageCallbackKtWhenMappings.setDividerPadding;
                cArr[iIntValue2] = c10;
                int i22 = uiMessageCallbackKtWhenMappings.setX;
                cArr3[i22] = (char) (((((long) (c10 ^ charArray2[i22])) ^ (f60568t0 ^ (-2443367703579691432L))) ^ ((long) ((int) (((long) f60569u0) ^ (-2443367703579691432L))))) ^ ((long) ((char) (((long) v0) ^ (-2443367703579691432L)))));
                uiMessageCallbackKtWhenMappings.setX = i22 + 1;
                int i23 = f60571x0 + 37;
                f60570w0 = i23 % 128;
                int i24 = i23 % 2;
                length3 = length3;
                i11 = 2;
                i10 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        throw new IllegalArgumentException(n1.f(cArr3).toString());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r6 = 1 - r6
            int r7 = r7 + 4
            int r8 = 119 - r8
            byte[] r0 = new byte[r6]
            byte[] r1 = com.mypinpad.tsdk.isolation.setShowDividers.f60572y0
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            goto L34
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L34:
            int r6 = r6 + r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setShowDividers.a(byte, int, short, java.lang.Object[]):void");
    }

    public static void b() {
        f60572y0 = new byte[]{94, -105, -29, 99};
    }

    public static void e() {
        v0 = (char) 30296;
        f60568t0 = 6082391168357756171L;
        f60569u0 = -461867432;
    }
}
