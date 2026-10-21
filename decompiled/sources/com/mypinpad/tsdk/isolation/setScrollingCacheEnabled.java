package com.mypinpad.tsdk.isolation;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/mypinpad/tsdk/i/setScrollingCacheEnabled;", "", "Landroid/content/Context;", "p0", "Lcom/mypinpad/tsdk/i/TerminalCallbackKt;", "p1", "Lcom/mypinpad/tsdk/i/setColorFilter;", "p2", "Lcom/mypinpad/tsdk/i/setDescendantFocusability;", "setCompoundDrawableTintBlendMode", "(Landroid/content/Context;Lcom/mypinpad/tsdk/i/TerminalCallbackKt;Lcom/mypinpad/tsdk/i/setColorFilter;)Lcom/mypinpad/tsdk/i/setDescendantFocusability;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class setScrollingCacheEnabled {

    @NotNull
    public static final setScrollingCacheEnabled INSTANCE = new setScrollingCacheEnabled();

    static {
        int i10 = 31 % 128;
        int i11 = 31 % 2;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        Context context = (Context) objArr[0];
        TerminalCallbackKt terminalCallbackKt = (TerminalCallbackKt) objArr[1];
        setColorFilter setcolorfilter = (setColorFilter) objArr[2];
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(terminalCallbackKt, "");
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        return new getLocalizedMessage(new getWidth(applicationContext, setcolorfilter), terminalCallbackKt, setcolorfilter);
    }

    @NotNull
    public static setDescendantFocusability setCompoundDrawableTintBlendMode(@NotNull Context p4, @NotNull TerminalCallbackKt p10, @NotNull setColorFilter p11) {
        return (setDescendantFocusability) setCompoundDrawableTintBlendMode(new Object[]{p4, p10, p11}, -2064713275, 2064713275, (int) System.currentTimeMillis());
    }
}
