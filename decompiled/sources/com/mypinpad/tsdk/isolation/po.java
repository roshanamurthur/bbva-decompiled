package com.mypinpad.tsdk.isolation;

import android.graphics.PointF;
import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class po extends pf {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f57733n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f57734o = null;

    @NotNull
    public final String m;

    static {
        b();
        f57733n = -4442742959086928875L;
    }

    public po(@NotNull String str) throws Throwable {
        String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        int maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
        char[] charArray = "봝뵎퉂苭뛠饲ᜇ歟﹜䇟刲경㬣ԫ酰\ue1bd琋졣\udd89⋡뇋轍ᢺ柸\uf2f8犄䟯\udb10⾦㇕艕ᰒ欵".toCharArray();
        setOnDragListener setondraglistener = new setOnDragListener();
        long j10 = f57733n;
        char[] y7 = setOnDragListener.setY(2122665171656649951L ^ j10, charArray, maxKeyCode);
        setondraglistener.setDividerPadding = 4;
        while (true) {
            int i10 = setondraglistener.setDividerPadding;
            if (i10 >= y7.length) {
                super(null, new String(y7, 4, y7.length - 4).intern(), null, 0L, 13, null);
                this.m = str;
                return;
            }
            int i11 = i10 - 4;
            setondraglistener.setX = i11;
            try {
                Object[] objArr = {Long.valueOf(y7[i10] ^ y7[i10 % 4]), Long.valueOf(i11), Long.valueOf(j10)};
                int i12 = 0;
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(2144228148);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (Process.getGidForName(str2) + 9780), 43 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3187);
                    Class<?> cls2 = Long.TYPE;
                    method = cls.getMethod("y", cls2, cls2, cls2);
                    map.put(2144228148, method);
                }
                y7[i10] = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                Object[] objArr2 = {setondraglistener, setondraglistener};
                Object method2 = map.get(-62642757);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 52, 3029 - View.MeasureSpec.getSize(0));
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    byte b12 = b11;
                    Object[] objArr3 = new Object[1];
                    int i13 = (b11 * 4) + 117;
                    int i14 = b10 * 4;
                    int i15 = 3 - (b12 * 3);
                    byte[] bArr = new byte[1 - i14];
                    int i16 = 0 - i14;
                    byte[] bArr2 = f57734o;
                    if (bArr2 == null) {
                        i12 = 0;
                        i16 = i16;
                        bArr2 = bArr2;
                        i13 += i15;
                        i15 = i15;
                    }
                    while (true) {
                        bArr[i12] = (byte) i13;
                        int i17 = i12 + 1;
                        if (i12 == i16) {
                            break;
                        }
                        int i18 = i15 + 1;
                        i12 = i17;
                        i16 = i16;
                        bArr2 = bArr2;
                        i13 += bArr2[i18];
                        i15 = i18;
                    }
                    objArr3[0] = new String(bArr, 0);
                    method2 = cls3.getMethod((String) objArr3[0], Object.class, Object.class);
                    setTextScaleX.setMaxEms.put(-62642757, method2);
                }
                ((Method) method2).invoke(null, objArr2);
                str2 = str2;
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
        f57734o = new byte[]{Constants.RESP_MSG_TEMPLATE_FORMAT_2, 86, 126, 91};
    }

    @NotNull
    public final String setY() {
        return this.m;
    }
}
