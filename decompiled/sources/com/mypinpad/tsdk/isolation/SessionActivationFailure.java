package com.mypinpad.tsdk.isolation;

import kotlin.jvm.functions.Function1;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;

/* JADX INFO: loaded from: classes10.dex */
public final class SessionActivationFailure {
    public static final /* synthetic */ setAutoSizeTextTypeUniformWithPresetSizes setCompoundDrawableTintBlendMode(setScrollCaptureCallback setscrollcapturecallback, Function1 function1) {
        return (setAutoSizeTextTypeUniformWithPresetSizes) setX(new Object[]{setscrollcapturecallback, function1}, -1911780895, 1911780896, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (~i10) | (~i12);
        if (((i10 | (~(i11 | i12))) * 519) + (((~(i13 | i11)) | (~(i10 | i11 | i12))) * (-519)) + (((~i13) | i11) * 519) + (i11 * (-518)) + (i10 * (-518)) == 1) {
            return (setAutoSizeTextTypeUniformWithPresetSizes) setX(new Object[]{(setScrollCaptureCallback) objArr[0], (Function1) objArr[1]}, 153711171, -153711171, (int) System.currentTimeMillis());
        }
        setScrollCaptureCallback setscrollcapturecallback = (setScrollCaptureCallback) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        int iRandom = c.random(new IntRange(Integer.MIN_VALUE, Integer.MAX_VALUE), Random.INSTANCE);
        return ((Number) function1.invoke(Integer.valueOf(iRandom))).intValue() != iRandom ? (setAutoSizeTextTypeUniformWithPresetSizes) setPersistentDrawingCache.setDividerPadding(new Object[]{setscrollcapturecallback}, -462901680, 462901680, (int) System.currentTimeMillis()) : (setAutoSizeTextTypeUniformWithPresetSizes) setPersistentDrawingCache.setDividerPadding(new Object[]{setscrollcapturecallback}, -2060556907, 2060556908, (int) System.currentTimeMillis());
    }
}
