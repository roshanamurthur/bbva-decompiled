package com.mypinpad.tsdk.isolation;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/mypinpad/tsdk/i/setTitleMarginStart;", "", "Landroid/content/Context;", "p0", "Lcom/mypinpad/tsdk/i/setColorFilter;", "p1", "Lcom/mypinpad/tsdk/i/setSecondaryProgress;", "setCompoundDrawableTintBlendMode", "(Landroid/content/Context;Lcom/mypinpad/tsdk/i/setColorFilter;)Lcom/mypinpad/tsdk/i/setSecondaryProgress;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class setTitleMarginStart {

    @NotNull
    public static final setTitleMarginStart INSTANCE = new setTitleMarginStart();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f60721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f60722b = 1;

    static {
        int i10 = f60722b + 3;
        f60721a = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @NotNull
    public static setSecondaryProgress setCompoundDrawableTintBlendMode(@NotNull Context p4, @NotNull setColorFilter p10) {
        return (setSecondaryProgress) setY(new Object[]{p4, p10}, 40538597, -40538597, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        Context context = (Context) objArr[0];
        setColorFilter setcolorfilter = (setColorFilter) objArr[1];
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        component29 component29Var = new component29(applicationContext, setcolorfilter);
        int i13 = f60721a;
        int i14 = i13 & 19;
        int i15 = (i13 | 19) & (~i14);
        int i16 = i14 << 1;
        int i17 = (i15 & i16) + (i15 | i16);
        f60722b = i17 % 128;
        if (i17 % 2 != 0) {
            return component29Var;
        }
        throw null;
    }
}
