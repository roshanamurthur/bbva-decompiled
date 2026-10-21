package com.bbva.sdkcatalog.openpay.plugin.data.param;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.core.model.extra.OpenPayRefundTransaction;
import mx.openpay.library.core.model.extra.SecureTerminal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ApplyTransactionRefundParams.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/data/param/ApplyTransactionRefundParams;", "", "secureTerminal", "Lmx/openpay/library/core/model/extra/SecureTerminal;", "secureRefundTerminal", "openPayRefundTransaction", "Lmx/openpay/library/core/model/extra/OpenPayRefundTransaction;", "<init>", "(Lmx/openpay/library/core/model/extra/SecureTerminal;Lmx/openpay/library/core/model/extra/SecureTerminal;Lmx/openpay/library/core/model/extra/OpenPayRefundTransaction;)V", "getSecureTerminal", "()Lmx/openpay/library/core/model/extra/SecureTerminal;", "getSecureRefundTerminal", "getOpenPayRefundTransaction", "()Lmx/openpay/library/core/model/extra/OpenPayRefundTransaction;", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ApplyTransactionRefundParams {

    @SerializedName("openPayRefundTransaction")
    @NotNull
    private final OpenPayRefundTransaction openPayRefundTransaction;

    @SerializedName("secureRefundTerminal")
    @NotNull
    private final SecureTerminal secureRefundTerminal;

    @SerializedName("secureTerminal")
    @NotNull
    private final SecureTerminal secureTerminal;

    public ApplyTransactionRefundParams(@NotNull SecureTerminal secureTerminal, @NotNull SecureTerminal secureRefundTerminal, @NotNull OpenPayRefundTransaction openPayRefundTransaction) {
        Intrinsics.checkNotNullParameter(secureTerminal, "secureTerminal");
        Intrinsics.checkNotNullParameter(secureRefundTerminal, "secureRefundTerminal");
        Intrinsics.checkNotNullParameter(openPayRefundTransaction, "openPayRefundTransaction");
        this.secureTerminal = secureTerminal;
        this.secureRefundTerminal = secureRefundTerminal;
        this.openPayRefundTransaction = openPayRefundTransaction;
    }

    public static /* synthetic */ ApplyTransactionRefundParams copy$default(ApplyTransactionRefundParams applyTransactionRefundParams, SecureTerminal secureTerminal, SecureTerminal secureTerminal2, OpenPayRefundTransaction openPayRefundTransaction, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            secureTerminal = applyTransactionRefundParams.secureTerminal;
        }
        if ((i10 & 2) != 0) {
            secureTerminal2 = applyTransactionRefundParams.secureRefundTerminal;
        }
        if ((i10 & 4) != 0) {
            openPayRefundTransaction = applyTransactionRefundParams.openPayRefundTransaction;
        }
        return applyTransactionRefundParams.copy(secureTerminal, secureTerminal2, openPayRefundTransaction);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SecureTerminal getSecureTerminal() {
        return this.secureTerminal;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SecureTerminal getSecureRefundTerminal() {
        return this.secureRefundTerminal;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OpenPayRefundTransaction getOpenPayRefundTransaction() {
        return this.openPayRefundTransaction;
    }

    @NotNull
    public final ApplyTransactionRefundParams copy(@NotNull SecureTerminal secureTerminal, @NotNull SecureTerminal secureRefundTerminal, @NotNull OpenPayRefundTransaction openPayRefundTransaction) {
        Intrinsics.checkNotNullParameter(secureTerminal, "secureTerminal");
        Intrinsics.checkNotNullParameter(secureRefundTerminal, "secureRefundTerminal");
        Intrinsics.checkNotNullParameter(openPayRefundTransaction, "openPayRefundTransaction");
        return new ApplyTransactionRefundParams(secureTerminal, secureRefundTerminal, openPayRefundTransaction);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplyTransactionRefundParams)) {
            return false;
        }
        ApplyTransactionRefundParams applyTransactionRefundParams = (ApplyTransactionRefundParams) other;
        return Intrinsics.areEqual(this.secureTerminal, applyTransactionRefundParams.secureTerminal) && Intrinsics.areEqual(this.secureRefundTerminal, applyTransactionRefundParams.secureRefundTerminal) && Intrinsics.areEqual(this.openPayRefundTransaction, applyTransactionRefundParams.openPayRefundTransaction);
    }

    @NotNull
    public final OpenPayRefundTransaction getOpenPayRefundTransaction() {
        return this.openPayRefundTransaction;
    }

    @NotNull
    public final SecureTerminal getSecureRefundTerminal() {
        return this.secureRefundTerminal;
    }

    @NotNull
    public final SecureTerminal getSecureTerminal() {
        return this.secureTerminal;
    }

    public int hashCode() {
        return this.openPayRefundTransaction.hashCode() + ((this.secureRefundTerminal.hashCode() + (this.secureTerminal.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "ApplyTransactionRefundParams(secureTerminal=" + this.secureTerminal + ", secureRefundTerminal=" + this.secureRefundTerminal + ", openPayRefundTransaction=" + this.openPayRefundTransaction + ")";
    }
}
