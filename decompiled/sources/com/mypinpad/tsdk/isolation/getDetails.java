package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class getDetails implements setScrollCaptureCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f55762c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f55763d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final UiMessage f55764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final getTransactionPortrait f55765b;

    public getDetails(@NotNull UiMessage uiMessage) {
        Intrinsics.checkNotNullParameter(uiMessage, "");
        this.f55764a = uiMessage;
        this.f55765b = getTransactionPortrait.setOnFocusChangeListener;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        int i13 = (i11 * (-755)) + (i10 * (-755));
        int i14 = ~((~i10) | (~i11));
        int i15 = i10 | i11;
        if (((i15 | (~i12)) * 756) + (((~(i15 | i12)) | i14) * (-756)) + (i14 * 1512) + i13 != 1) {
            getDetails getdetails = (getDetails) objArr[0];
            int i16 = f55763d;
            int i17 = ((i16 | 35) << 1) - (i16 ^ 35);
            f55762c = i17 % 128;
            int i18 = i17 % 2;
            getTransactionPortrait gettransactionportrait = getdetails.f55765b;
            if (i18 == 0) {
                return gettransactionportrait;
            }
            throw null;
        }
        getDetails getdetails2 = (getDetails) objArr[0];
        int i19 = f55763d;
        int i20 = i19 & 35;
        int i21 = (i20 - (~(-(-((i19 ^ 35) | i20))))) - 1;
        f55762c = i21 % 128;
        if (i21 % 2 != 0) {
            getdetails2.f55764a.setY();
            throw null;
        }
        if (!getdetails2.f55764a.setY()) {
            setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes = (setAutoSizeTextTypeUniformWithPresetSizes) setPersistentDrawingCache.setDividerPadding(new Object[]{getdetails2}, -2060556907, 2060556908, (int) System.currentTimeMillis());
            int i22 = f55763d;
            int i23 = i22 ^ 27;
            int i24 = ((i22 & 27) | i23) << 1;
            int i25 = -i23;
            int i26 = (i24 & i25) + (i24 | i25);
            f55762c = i26 % 128;
            int i27 = i26 % 2;
            return setautosizetexttypeuniformwithpresetsizes;
        }
        int i28 = f55763d;
        int i29 = i28 & 99;
        int i30 = (i28 | 99) & (~i29);
        int i31 = -(-(i29 << 1));
        int i32 = (i30 & i31) + (i30 | i31);
        f55762c = i32 % 128;
        int i33 = i32 % 2;
        setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes2 = (setAutoSizeTextTypeUniformWithPresetSizes) setPersistentDrawingCache.setDividerPadding(new Object[]{getdetails2}, -462901680, 462901680, (int) System.currentTimeMillis());
        int i34 = f55762c;
        int i35 = ((i34 & 52) + (i34 | 52)) - 1;
        f55763d = i35 % 128;
        int i36 = i35 % 2;
        return setautosizetexttypeuniformwithpresetsizes2;
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollCaptureCallback
    @NotNull
    public final getTransactionPortrait setDividerPadding() {
        return (getTransactionPortrait) setX(new Object[]{this}, -1567849643, 1567849643, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollCaptureCallback
    @NotNull
    public final setAutoSizeTextTypeUniformWithPresetSizes setX() {
        return (setAutoSizeTextTypeUniformWithPresetSizes) setX(new Object[]{this}, -1498773963, 1498773964, System.identityHashCode(this));
    }
}
