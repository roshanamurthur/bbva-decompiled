package com.mypinpad.tsdk.isolation;

import android.os.Build;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setAccessibilityTraversalBefore implements setScrollCaptureCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f58232c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f58233d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f58234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final getTransactionPortrait f58235b = getTransactionPortrait.setLayoutAnimation;

    public setAccessibilityTraversalBefore(int i10) {
        this.f58234a = i10;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        if ((((~(i13 | i12)) | i14) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(i10 | i12)) | (~(i14 | i10))) * (-318)) + (((~(i11 | (~i12) | i10)) | (~(i13 | i14 | i12))) * (-318)) + (i11 * 319) + (i10 * (-317)) == 1) {
            setAccessibilityTraversalBefore setaccessibilitytraversalbefore = (setAccessibilityTraversalBefore) objArr[0];
            int i15 = f58232c;
            int i16 = i15 ^ 37;
            int i17 = (i15 & 37) << 1;
            int i18 = (i16 & i17) + (i16 | i17);
            f58233d = i18 % 128;
            int i19 = i18 % 2;
            getTransactionPortrait gettransactionportrait = setaccessibilitytraversalbefore.f58235b;
            int i20 = i15 & 63;
            int i21 = ((((i15 ^ 63) | i20) << 1) - (~(-((i15 | 63) & (~i20))))) - 1;
            f58233d = i21 % 128;
            if (i21 % 2 != 0) {
                return gettransactionportrait;
            }
            throw null;
        }
        setAccessibilityTraversalBefore setaccessibilitytraversalbefore2 = (setAccessibilityTraversalBefore) objArr[0];
        int i22 = f58233d;
        int i23 = (-2) - (((i22 & 96) + (i22 | 96)) ^ (-1));
        f58232c = i23 % 128;
        if (i23 % 2 != 0) {
            int i24 = setaccessibilitytraversalbefore2.f58234a;
            throw null;
        }
        int i25 = Build.VERSION.SDK_INT;
        if (i25 >= setaccessibilitytraversalbefore2.f58234a) {
            setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes = (setAutoSizeTextTypeUniformWithPresetSizes) setPersistentDrawingCache.setDividerPadding(new Object[]{setaccessibilitytraversalbefore2}, -2060556907, 2060556908, (int) System.currentTimeMillis());
            int i26 = f58233d;
            int i27 = ((i26 ^ 20) + ((i26 & 20) << 1)) - 1;
            f58232c = i27 % 128;
            if (i27 % 2 == 0) {
                return setautosizetexttypeuniformwithpresetsizes;
            }
            throw null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(setaccessibilitytraversalbefore2.f58234a);
        sb2.append(AbstractJsonLexerKt.COMMA);
        sb2.append(i25);
        setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes2 = (setAutoSizeTextTypeUniformWithPresetSizes) setPersistentDrawingCache.setDividerPadding(new Object[]{setaccessibilitytraversalbefore2, sb2.toString()}, 728146901, -728146899, (int) System.currentTimeMillis());
        int i28 = f58232c;
        int i29 = i28 & 83;
        int i30 = (i28 ^ 83) | i29;
        int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
        f58233d = i31 % 128;
        int i32 = i31 % 2;
        return setautosizetexttypeuniformwithpresetsizes2;
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollCaptureCallback
    @NotNull
    public final setAutoSizeTextTypeUniformWithPresetSizes setX() {
        return (setAutoSizeTextTypeUniformWithPresetSizes) setDividerPadding(new Object[]{this}, 1534838934, -1534838934, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollCaptureCallback
    @NotNull
    public final getTransactionPortrait setDividerPadding() {
        return (getTransactionPortrait) setDividerPadding(new Object[]{this}, 165755122, -165755121, System.identityHashCode(this));
    }
}
