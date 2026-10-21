package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setTranslationY implements setElevation, setTranslationX {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f60794b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f60795c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final component19 f60796a;

    public setTranslationY(@NotNull component19 component19Var) {
        Intrinsics.checkNotNullParameter(component19Var, "");
        this.f60796a = component19Var;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        setTranslationY settranslationy = (setTranslationY) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        String str = (String) objArr[2];
        Throwable th2 = (Throwable) objArr[3];
        int i13 = f60794b;
        int i14 = (i13 ^ 89) + ((i13 & 89) << 1);
        f60795c = i14 % 128;
        if (i14 % 2 == 0) {
            settranslationy.f60796a.setOnFocusChangeListener(iIntValue, str, th2);
            throw null;
        }
        settranslationy.f60796a.setOnFocusChangeListener(iIntValue, str, th2);
        int i15 = f60795c;
        int i16 = (i15 ^ 66) + ((i15 & 66) << 1);
        int i17 = (i16 ^ (-1)) + (i16 << 1);
        f60794b = i17 % 128;
        if (i17 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.setTranslationX
    public final void setOnFocusChangeListener(int i10, @Nullable String str, @Nullable Throwable th2) {
        setDividerPadding(new Object[]{this, Integer.valueOf(i10), str, th2}, 1106867272, -1106867272, i10);
    }
}
