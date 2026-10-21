package com.bbva.glomohybrid.base.inappupdate.view.model;

import androidx.annotation.StringRes;
import androidx.appcompat.widget.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InAppUpdateModalConfiguration.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/bbva/glomohybrid/base/inappupdate/view/model/InAppUpdateModalConfiguration;", "", "", "component1", "component2", "component3", "message", "positiveButton", "negativeButton", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getMessage", "()I", "b", "getPositiveButton", "c", "getNegativeButton", "<init>", "(III)V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class InAppUpdateModalConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int message;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int positiveButton;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int negativeButton;

    public InAppUpdateModalConfiguration(@StringRes int i10, @StringRes int i11, @StringRes int i12) {
        this.message = i10;
        this.positiveButton = i11;
        this.negativeButton = i12;
    }

    public static /* synthetic */ InAppUpdateModalConfiguration copy$default(InAppUpdateModalConfiguration inAppUpdateModalConfiguration, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = inAppUpdateModalConfiguration.message;
        }
        if ((i13 & 2) != 0) {
            i11 = inAppUpdateModalConfiguration.positiveButton;
        }
        if ((i13 & 4) != 0) {
            i12 = inAppUpdateModalConfiguration.negativeButton;
        }
        return inAppUpdateModalConfiguration.copy(i10, i11, i12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPositiveButton() {
        return this.positiveButton;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getNegativeButton() {
        return this.negativeButton;
    }

    @NotNull
    public final InAppUpdateModalConfiguration copy(@StringRes int message, @StringRes int positiveButton, @StringRes int negativeButton) {
        return new InAppUpdateModalConfiguration(message, positiveButton, negativeButton);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InAppUpdateModalConfiguration)) {
            return false;
        }
        InAppUpdateModalConfiguration inAppUpdateModalConfiguration = (InAppUpdateModalConfiguration) other;
        return this.message == inAppUpdateModalConfiguration.message && this.positiveButton == inAppUpdateModalConfiguration.positiveButton && this.negativeButton == inAppUpdateModalConfiguration.negativeButton;
    }

    public final int getMessage() {
        return this.message;
    }

    public final int getNegativeButton() {
        return this.negativeButton;
    }

    public final int getPositiveButton() {
        return this.positiveButton;
    }

    public int hashCode() {
        return (((this.message * 31) + this.positiveButton) * 31) + this.negativeButton;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("InAppUpdateModalConfiguration(message=");
        sb2.append(this.message);
        sb2.append(", positiveButton=");
        sb2.append(this.positiveButton);
        sb2.append(", negativeButton=");
        return a.c(sb2, this.negativeButton, ")");
    }
}
