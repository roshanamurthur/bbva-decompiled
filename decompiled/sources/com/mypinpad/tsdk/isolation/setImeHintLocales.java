package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setImeHintLocales extends setCompoundDrawableTintMode {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f59849d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f59850e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setFooterDividersEnabled f59851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setLabelFor f59852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final getClientSecret f59853c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setImeHintLocales(@NotNull setFooterDividersEnabled setfooterdividersenabled, @NotNull setLabelFor setlabelfor, @Nullable getClientSecret getclientsecret) {
        super(null);
        Intrinsics.checkNotNullParameter(setfooterdividersenabled, "");
        Intrinsics.checkNotNullParameter(setlabelfor, "");
        this.f59851a = setfooterdividersenabled;
        this.f59852b = setlabelfor;
        this.f59853c = getclientsecret;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ((i11 | i13) * (-1434)) + (i11 * 1435) + (i10 * (-716));
        int i15 = ~i12;
        int i16 = ~(i15 | i11);
        int i17 = ~(i10 | i11);
        int i18 = i13 | (~i11);
        int i19 = ((i17 | (~(i18 | i15)) | (~(i11 | i12))) * 717) + ((i16 | i17 | (~(i18 | i12))) * 717) + i14;
        if (i19 == 1) {
            setImeHintLocales setimehintlocales = (setImeHintLocales) objArr[0];
            int i20 = f59850e;
            int i21 = (i20 | 65) << 1;
            int i22 = -(i20 ^ 65);
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            int i24 = i23 % 128;
            f59849d = i24;
            int i25 = i23 % 2;
            getClientSecret getclientsecret = setimehintlocales.f59853c;
            int i26 = (i24 | 81) << 1;
            int i27 = -(i24 ^ 81);
            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
            f59850e = i28 % 128;
            int i29 = i28 % 2;
            return getclientsecret;
        }
        if (i19 != 2) {
            setImeHintLocales setimehintlocales2 = (setImeHintLocales) objArr[0];
            int i30 = f59850e;
            int i31 = i30 & 97;
            int i32 = (i31 - (~((i30 ^ 97) | i31))) - 1;
            int i33 = i32 % 128;
            f59849d = i33;
            int i34 = i32 % 2;
            setFooterDividersEnabled setfooterdividersenabled = setimehintlocales2.f59851a;
            if (i34 != 0) {
                int i35 = 82 / 0;
            }
            int i36 = i33 + 107;
            f59850e = i36 % 128;
            int i37 = i36 % 2;
            return setfooterdividersenabled;
        }
        setImeHintLocales setimehintlocales3 = (setImeHintLocales) objArr[0];
        int i38 = f59849d;
        int i39 = i38 & 75;
        int i40 = ((i38 ^ 75) | i39) << 1;
        int i41 = -((~i39) & (i38 | 75));
        int i42 = (i40 & i41) + (i40 | i41);
        f59850e = i42 % 128;
        int i43 = i42 % 2;
        setLabelFor setlabelfor = setimehintlocales3.f59852b;
        if (i43 == 0) {
            throw null;
        }
        int i44 = ((i38 ^ 19) | (i38 & 19)) << 1;
        int i45 = -(((~i38) & 19) | (i38 & (-20)));
        int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
        f59850e = i46 % 128;
        if (i46 % 2 != 0) {
            return setlabelfor;
        }
        int i47 = 30 / 0;
        return setlabelfor;
    }

    @NotNull
    public final setLabelFor setCompoundDrawableTintBlendMode() {
        return (setLabelFor) setOnFocusChangeListener(new Object[]{this}, -2136104618, 2136104620, System.identityHashCode(this));
    }

    @NotNull
    public final setFooterDividersEnabled setDividerPadding() {
        return (setFooterDividersEnabled) setOnFocusChangeListener(new Object[]{this}, -2143133106, 2143133106, System.identityHashCode(this));
    }

    @Nullable
    public final getClientSecret setY() {
        return (getClientSecret) setOnFocusChangeListener(new Object[]{this}, 578170454, -578170453, System.identityHashCode(this));
    }
}
