package com.mypinpad.tsdk.isolation;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setChoiceMode implements setScrollCaptureCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f59542c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f59543d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f59544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final getTransactionPortrait f59545b;

    public static final class a extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final byte[] f59546q0 = null;

        static {
            b();
        }

        public a() {
            super(1);
        }

        public static void b() {
            f59546q0 = new byte[]{2, -109, 33, 44, 12, ByteSourceJsonBootstrapper.UTF8_BOM_1, 47, -46, 0, -5, -1, -8, 5, 8, MessageUtils.MESSAGE_30_RS, -48, 15, -24, 20, -3, -12, 5, 15, -23, -7, -8, 48, -44, 5, -11, 8, MessageUtils.MESSAGE_21_NAK, -36, 9, -3};
        }

        public static Integer c(Object[] objArr, int i10, int i11, int i12) throws Throwable {
            int i13 = ~i11;
            int i14 = ~i12;
            if ((((~(i10 | i11)) | (~(i12 | i13))) * 49) + (((~((~i10) | i14)) | i13 | (~(i10 | i12))) * (-49)) + (((~(i13 | i14)) | (~(i13 | i10))) * 98) + (i11 * (-97)) + (i10 * 50) != 1) {
                a aVar = (a) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                return c(new Object[]{aVar, Integer.valueOf(iIntValue)}, 1750121595, -1750121594, iIntValue);
            }
            try {
                Object[] objArr2 = {(Context) setChoiceMode.setY(new Object[]{setChoiceMode.this}, -2147200982, 2147200983, (int) System.currentTimeMillis()), Integer.valueOf(((Number) objArr[1]).intValue())};
                Object method = setTextScaleX.setMaxEms.get(1676313257);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 54297), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 41, TextUtils.getTrimmedLength("") + 524);
                    byte[] bArr = f59546q0;
                    byte b10 = bArr[8];
                    byte b11 = b10;
                    int i15 = (b10 * 4) + 4;
                    int i16 = (b11 * 4) + 115;
                    int i17 = b11 * 4;
                    byte[] bArr2 = new byte[32 - i17];
                    int i18 = 31 - i17;
                    int i19 = -1;
                    while (true) {
                        i19++;
                        bArr2[i19] = (byte) i16;
                        if (i19 == i18) {
                            break;
                        }
                        i16 = (i16 + (-bArr[i15])) - 2;
                        i15++;
                    }
                    method = cls.getMethod(new String(bArr2, 0), Context.class, Integer.TYPE);
                    setTextScaleX.setMaxEms.put(1676313257, method);
                }
                return Integer.valueOf(((Integer) ((Method) method).invoke(null, objArr2)).intValue());
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Integer invoke(Integer num) {
            return c(new Object[]{this, num}, 1198403632, -1198403632, System.identityHashCode(this));
        }
    }

    public setChoiceMode(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.f59544a = context;
        this.f59545b = getTransactionPortrait.setAlwaysDrawnWithCacheEnabled;
    }

    public static final /* synthetic */ Context setCompoundDrawableTintBlendMode(setChoiceMode setchoicemode) {
        return (Context) setY(new Object[]{setchoicemode}, -2147200982, 2147200983, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~i12;
        int i15 = (((~(i10 | i12)) | (~((~i10) | i14)) | (~(i11 | i12))) * 831) + ((~(i13 | i10 | i12)) * (-1662)) + (((~(i13 | i14)) | (~(i10 | i11 | i12))) * (-831)) + (i11 * 832) + (i10 * (-830));
        if (i15 == 1) {
            setChoiceMode setchoicemode = (setChoiceMode) objArr[0];
            int i16 = f59542c;
            int i17 = (i16 ^ 61) + ((i16 & 61) << 1);
            f59543d = i17 % 128;
            int i18 = i17 % 2;
            Context context = setchoicemode.f59544a;
            if (i18 != 0) {
                return context;
            }
            throw null;
        }
        if (i15 == 2) {
            setChoiceMode setchoicemode2 = (setChoiceMode) objArr[0];
            setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes = (setAutoSizeTextTypeUniformWithPresetSizes) SessionActivationFailure.setX(new Object[]{setchoicemode2, setchoicemode2.new a()}, -1911780895, 1911780896, (int) System.currentTimeMillis());
            int i19 = f59542c;
            int i20 = i19 | 69;
            int i21 = (i20 << 1) - ((~(i19 & 69)) & i20);
            f59543d = i21 % 128;
            int i22 = i21 % 2;
            return setautosizetexttypeuniformwithpresetsizes;
        }
        setChoiceMode setchoicemode3 = (setChoiceMode) objArr[0];
        int i23 = f59543d;
        int i24 = (-2) - (((i23 ^ 44) + ((i23 & 44) << 1)) ^ (-1));
        f59542c = i24 % 128;
        int i25 = i24 % 2;
        getTransactionPortrait gettransactionportrait = setchoicemode3.f59545b;
        if (i25 == 0) {
            return gettransactionportrait;
        }
        int i26 = 72 / 0;
        return gettransactionportrait;
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollCaptureCallback
    @NotNull
    public final getTransactionPortrait setDividerPadding() {
        return (getTransactionPortrait) setY(new Object[]{this}, 1124415056, -1124415056, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollCaptureCallback
    @NotNull
    public final setAutoSizeTextTypeUniformWithPresetSizes setX() {
        return (setAutoSizeTextTypeUniformWithPresetSizes) setY(new Object[]{this}, -352655485, 352655487, System.identityHashCode(this));
    }
}
