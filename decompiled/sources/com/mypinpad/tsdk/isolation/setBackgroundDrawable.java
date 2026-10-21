package com.mypinpad.tsdk.isolation;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface setBackgroundDrawable {
    void setDividerPadding(int i10);

    @NotNull
    setExtractedText setX(@NotNull Context context);

    void setX();

    void setX(@NotNull Context context, @NotNull component28 component28Var, @NotNull Function2<? super Integer, ? super Integer, Unit> function2, @NotNull Function2<? super Float, ? super Float, Unit> function3, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function1);

    void setY();

    void setY(@NotNull byte[] bArr);
}
