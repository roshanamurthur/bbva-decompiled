package com.mypinpad.tsdk.isolation;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public interface setDescendantFocusability {

    public static final class setCompoundDrawableTintBlendMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f59621a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f59622b = 1;

        public static /* synthetic */ getEnableLocalAttestationForDebugBuilds setOnFocusChangeListener(setDescendantFocusability setdescendantfocusability) {
            int i10 = f59622b + 29;
            f59621a = i10 % 128;
            int i11 = i10 % 2;
            getEnableLocalAttestationForDebugBuilds dividerPadding = setdescendantfocusability.setDividerPadding(null);
            if (i11 != 0) {
                int i12 = 18 / 0;
            }
            int i13 = f59621a + 121;
            f59622b = i13 % 128;
            int i14 = i13 % 2;
            return dividerPadding;
        }
    }

    void setCompoundDrawableTintBlendMode(@NotNull getAmountFieldBgColor getamountfieldbgcolor);

    void setCompoundDrawableTintBlendMode(@NotNull setVerticalScrollbarPosition setverticalscrollbarposition, boolean z10);

    @NotNull
    byte[] setCompoundDrawableTintBlendMode();

    @NotNull
    byte[] setCompoundDrawableTintBlendMode(@NotNull byte[] bArr, @NotNull byte[] bArr2);

    @NotNull
    getEnableLocalAttestationForDebugBuilds setDividerPadding(@Nullable getClientSecret getclientsecret);

    void setDividerPadding();

    @NotNull
    String setOnFocusChangeListener();

    boolean setOnFocusChangeListener(@NotNull String str, @NotNull String str2);

    @Nullable
    String setX();

    @NotNull
    byte[] setX(@NotNull byte[] bArr);

    long setY();

    @NotNull
    getPinPadPortrait setY(@NotNull setInterpolator setinterpolator);

    @NotNull
    byte[] setY(int i10);

    @NotNull
    byte[] setY(@NotNull byte[] bArr);
}
