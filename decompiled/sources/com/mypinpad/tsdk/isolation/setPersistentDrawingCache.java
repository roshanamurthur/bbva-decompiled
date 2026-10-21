package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setPersistentDrawingCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f60303a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f60304b = 1;

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~i12;
        int i15 = (((~(i10 | i12)) | (~(i11 | i14))) * 950) + (((~(i14 | i10)) | (~(i11 | i12))) * (-950)) + (((~(i13 | i14)) | (~((~i10) | i12))) * ReturnCode.ERR_REPOSITORY) + (i11 * (-949)) + (i10 * (-949));
        if (i15 == 1) {
            setScrollCaptureCallback setscrollcapturecallback = (setScrollCaptureCallback) objArr[0];
            Intrinsics.checkNotNullParameter(setscrollcapturecallback, "");
            setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes = new setAutoSizeTextTypeUniformWithPresetSizes(setscrollcapturecallback.setDividerPadding(), null, true, 2, null);
            int i16 = f60304b;
            int i17 = i16 & 121;
            int i18 = i16 | 121;
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            f60303a = i19 % 128;
            int i20 = i19 % 2;
            return setautosizetexttypeuniformwithpresetsizes;
        }
        if (i15 == 2) {
            setScrollCaptureCallback setscrollcapturecallback2 = (setScrollCaptureCallback) objArr[0];
            Object obj = objArr[1];
            Intrinsics.checkNotNullParameter(setscrollcapturecallback2, "");
            return new setAutoSizeTextTypeUniformWithPresetSizes(setscrollcapturecallback2.setDividerPadding(), obj != null ? obj.toString() : null, false);
        }
        setScrollCaptureCallback setscrollcapturecallback3 = (setScrollCaptureCallback) objArr[0];
        int i21 = f60303a;
        int i22 = (i21 & 51) + (i21 | 51);
        f60304b = i22 % 128;
        if (i22 % 2 == 0) {
            throw null;
        }
        setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes2 = (setAutoSizeTextTypeUniformWithPresetSizes) setDividerPadding(new Object[]{setscrollcapturecallback3, null}, 728146901, -728146899, (int) System.currentTimeMillis());
        int i23 = f60303a;
        int i24 = (i23 & (-24)) | ((~i23) & 23);
        int i25 = (i23 & 23) << 1;
        int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
        f60304b = i26 % 128;
        int i27 = i26 % 2;
        return setautosizetexttypeuniformwithpresetsizes2;
    }

    public static /* synthetic */ setAutoSizeTextTypeUniformWithPresetSizes setX(setScrollCaptureCallback setscrollcapturecallback) {
        return (setAutoSizeTextTypeUniformWithPresetSizes) setDividerPadding(new Object[]{setscrollcapturecallback}, -462901680, 462901680, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final setAutoSizeTextTypeUniformWithPresetSizes setY(@NotNull setScrollCaptureCallback setscrollcapturecallback) {
        return (setAutoSizeTextTypeUniformWithPresetSizes) setDividerPadding(new Object[]{setscrollcapturecallback}, -2060556907, 2060556908, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final setAutoSizeTextTypeUniformWithPresetSizes setY(@NotNull setScrollCaptureCallback setscrollcapturecallback, @Nullable Object obj) {
        return (setAutoSizeTextTypeUniformWithPresetSizes) setDividerPadding(new Object[]{setscrollcapturecallback, obj}, 728146901, -728146899, (int) System.currentTimeMillis());
    }
}
