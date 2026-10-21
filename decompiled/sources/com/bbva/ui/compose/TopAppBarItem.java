package com.bbva.ui.compose;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TopAppBar.kt */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/bbva/ui/compose/TopAppBarItem;", "", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getTextResId", "()I", "textResId", "b", "getIconResId", "iconResId", "Lkotlin/Function0;", "", "c", "Lkotlin/jvm/functions/Function0;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "onClick", "<init>", "(IILkotlin/jvm/functions/Function0;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
public final class TopAppBarItem {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int textResId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int iconResId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Unit> onClick;

    public TopAppBarItem(@StringRes int i10, @DrawableRes int i11, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.textResId = i10;
        this.iconResId = i11;
        this.onClick = onClick;
    }

    public final int getIconResId() {
        return this.iconResId;
    }

    @NotNull
    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    public final int getTextResId() {
        return this.textResId;
    }
}
