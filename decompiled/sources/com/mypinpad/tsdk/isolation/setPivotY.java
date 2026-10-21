package com.mypinpad.tsdk.isolation;

import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/setPivotY;", "Lcom/mypinpad/tsdk/i/setLayerType;", "", "p0", "<init>", "([B)V", "setOnFocusChangeListener"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class setPivotY extends setLayerType {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static long f60322t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f60323u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final byte[] f60324w0 = null;

    static {
        b();
        f60323u0 = 0;
        v0 = 1;
        e();
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setPivotY(@NotNull byte[] bArr) throws Throwable {
        super(bArr, false, 2, null);
        Intrinsics.checkNotNullParameter(bArr, "");
        Object obj = null;
        if (bArr.length == 32) {
            return;
        }
        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1;
        char[] charArray = "્짴ઋ豖ᑁ\u20c4龮\uf1e1ᶤ镟㴜ᧆ⒰멞♅\u0ee9供䍶佩\ue7e9嚓桳砶".toCharArray();
        setOnDragListener setondraglistener = new setOnDragListener();
        char[] y7 = setOnDragListener.setY(f60322t0 ^ 2122665171656649951L, charArray, longPressTimeout);
        setondraglistener.setDividerPadding = 4;
        while (true) {
            int i10 = setondraglistener.setDividerPadding;
            if (i10 >= y7.length) {
                String str = new String(y7, 4, y7.length - 4);
                int i11 = f60323u0 + 3;
                v0 = i11 % 128;
                int i12 = i11 % 2;
                throw new IllegalArgumentException(str.intern().toString());
            }
            int i13 = v0 + 69;
            f60323u0 = i13 % 128;
            int i14 = i13 % 2;
            int i15 = i10 - 4;
            setondraglistener.setX = i15;
            setOnDragListener setondraglistener2 = setondraglistener;
            try {
                Object[] objArr = {Long.valueOf(y7[i10] ^ y7[i10 % 4]), Long.valueOf(i15), Long.valueOf(f60322t0)};
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(2144228148);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 9779), 43 - (ViewConfiguration.getEdgeSlop() >> 16), 3186 - TextUtils.lastIndexOf("", '0', 0, 0));
                    Class<?> cls2 = Long.TYPE;
                    method = cls.getMethod("y", cls2, cls2, cls2);
                    map.put(2144228148, method);
                }
                y7[i10] = ((Character) ((Method) method).invoke(obj, objArr)).charValue();
                Object[] objArr2 = {setondraglistener2, setondraglistener2};
                Object method2 = map.get(-62642757);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) View.MeasureSpec.getSize(0), 51 - Process.getGidForName(""), 3029 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                    byte[] bArr2 = f60324w0;
                    byte b10 = bArr2[0];
                    byte b11 = b10;
                    int i16 = b11 * 3;
                    int i17 = 117 - (b11 * 3);
                    int i18 = 5 - (b10 * 3);
                    byte[] bArr3 = new byte[i16 + 1];
                    int i19 = 0;
                    while (true) {
                        bArr3[i19] = (byte) i17;
                        int i20 = i19 + 1;
                        if (i19 == i16) {
                            break;
                        }
                        i17 += bArr2[i18];
                        i18++;
                        i19 = i20;
                    }
                    method2 = cls3.getMethod(new String(bArr3, 0), Object.class, Object.class);
                    setTextScaleX.setMaxEms.put(-62642757, method2);
                }
                obj = null;
                ((Method) method2).invoke(null, objArr2);
                setondraglistener = setondraglistener2;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    public static void b() {
        f60324w0 = new byte[]{0, -128, -98, Constants.CVR_B1b41_1110_ONLINE_PIN, -74};
    }

    public static void e() {
        f60322t0 = -7099069940379719396L;
    }
}
