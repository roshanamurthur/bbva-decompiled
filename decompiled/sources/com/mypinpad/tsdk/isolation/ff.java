package com.mypinpad.tsdk.isolation;

import ek.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f55518a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55519b = 1;

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        ff ffVar = (ff) objArr[0];
        fk fkVar = (fk) objArr[1];
        Continuation<? super Unit> continuation = (Continuation) objArr[2];
        int i13 = f55519b;
        int i14 = ((i13 | 38) << 1) - (i13 ^ 38);
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        f55518a = i15 % 128;
        if (i15 % 2 != 0) {
            ffVar.setX(ffVar.setOnFocusChangeListener(fkVar), continuation);
            a.getCOROUTINE_SUSPENDED();
            throw null;
        }
        Object x4 = ffVar.setX(ffVar.setOnFocusChangeListener(fkVar), continuation);
        if (x4 == a.getCOROUTINE_SUSPENDED()) {
            int i16 = f55518a;
            int i17 = i16 & 47;
            int i18 = ((i16 | 47) & (~i17)) + (i17 << 1);
            f55519b = i18 % 128;
            if (i18 % 2 == 0) {
                throw null;
            }
        } else {
            x4 = Unit.INSTANCE;
            int i19 = f55518a;
            int i20 = i19 & 1;
            int i21 = ((i19 | 1) & (~i20)) + (i20 << 1);
            f55519b = i21 % 128;
            if (i21 % 2 == 0) {
                throw null;
            }
        }
        return x4;
    }

    @NotNull
    public abstract fg setOnFocusChangeListener(@NotNull fk fkVar);

    @Nullable
    public final Object setOnFocusChangeListener(@NotNull fk fkVar, @NotNull Continuation<? super Unit> continuation) {
        return setY(new Object[]{this, fkVar, continuation}, -1420809961, 1420809961, System.identityHashCode(this));
    }

    @Nullable
    public abstract Object setX(@NotNull fg fgVar, @NotNull Continuation<? super Unit> continuation);
}
