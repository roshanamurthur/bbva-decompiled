package com.mypinpad.tsdk.isolation;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setImportantForAccessibility {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f59856b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f59857c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<String> f59858a;

    public setImportantForAccessibility(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.f59858a = list;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i12;
        int i14 = ((i10 | i13) * (-757)) + (i11 * (-756)) + (i10 * 758);
        int i15 = ~i11;
        if ((((~(i10 | i11 | i12)) | (~(i13 | i15)) | (~((~i10) | i15))) * 757) + ((~(i15 | i10 | i12)) * 1514) + i14 == 1) {
            setImportantForAccessibility setimportantforaccessibility = (setImportantForAccessibility) objArr[0];
            int i16 = f59857c;
            int i17 = (i16 ^ 79) + ((i16 & 79) << 1);
            f59856b = i17 % 128;
            int i18 = i17 % 2;
            List<String> list = setimportantforaccessibility.f59858a;
            if (i18 == 0) {
                return list;
            }
            int i19 = 12 / 0;
            return list;
        }
        int i20 = f59856b;
        int i21 = i20 & 81;
        int i22 = ((((i20 ^ 81) | i21) << 1) - (~(-((i20 | 81) & (~i21))))) - 1;
        f59857c = i22 % 128;
        int i23 = i22 % 2;
        setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
        int i24 = f59857c;
        int i25 = (i24 ^ 5) + ((i24 & 5) << 1);
        f59856b = i25 % 128;
        int i26 = i25 % 2;
        return "";
    }

    @NotNull
    public final List<String> setOnFocusChangeListener() {
        return (List) setCompoundDrawableTintBlendMode(new Object[]{this}, -1366061840, 1366061841, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -895590890, 895590890, System.identityHashCode(this));
    }
}
