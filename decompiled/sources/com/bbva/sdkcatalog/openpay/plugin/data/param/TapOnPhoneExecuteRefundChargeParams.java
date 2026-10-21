package com.bbva.sdkcatalog.openpay.plugin.data.param;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.core.model.extra.SecureTerminal;
import mx.openpay.library.core.model.extra.TransactionDTO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TapOnPhoneExecuteRefundChargeParams.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/data/param/TapOnPhoneExecuteRefundChargeParams;", "", "secureRefundTerminal", "Lmx/openpay/library/core/model/extra/SecureTerminal;", "transaction", "Lmx/openpay/library/core/model/extra/TransactionDTO;", "<init>", "(Lmx/openpay/library/core/model/extra/SecureTerminal;Lmx/openpay/library/core/model/extra/TransactionDTO;)V", "getSecureRefundTerminal", "()Lmx/openpay/library/core/model/extra/SecureTerminal;", "getTransaction", "()Lmx/openpay/library/core/model/extra/TransactionDTO;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TapOnPhoneExecuteRefundChargeParams {

    @NotNull
    private final SecureTerminal secureRefundTerminal;

    @NotNull
    private final TransactionDTO transaction;

    public TapOnPhoneExecuteRefundChargeParams(@NotNull SecureTerminal secureRefundTerminal, @NotNull TransactionDTO transaction) {
        Intrinsics.checkNotNullParameter(secureRefundTerminal, "secureRefundTerminal");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.secureRefundTerminal = secureRefundTerminal;
        this.transaction = transaction;
    }

    public static /* synthetic */ TapOnPhoneExecuteRefundChargeParams copy$default(TapOnPhoneExecuteRefundChargeParams tapOnPhoneExecuteRefundChargeParams, SecureTerminal secureTerminal, TransactionDTO transactionDTO, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            secureTerminal = tapOnPhoneExecuteRefundChargeParams.secureRefundTerminal;
        }
        if ((i10 & 2) != 0) {
            transactionDTO = tapOnPhoneExecuteRefundChargeParams.transaction;
        }
        return tapOnPhoneExecuteRefundChargeParams.copy(secureTerminal, transactionDTO);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SecureTerminal getSecureRefundTerminal() {
        return this.secureRefundTerminal;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TransactionDTO getTransaction() {
        return this.transaction;
    }

    @NotNull
    public final TapOnPhoneExecuteRefundChargeParams copy(@NotNull SecureTerminal secureRefundTerminal, @NotNull TransactionDTO transaction) {
        Intrinsics.checkNotNullParameter(secureRefundTerminal, "secureRefundTerminal");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return new TapOnPhoneExecuteRefundChargeParams(secureRefundTerminal, transaction);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TapOnPhoneExecuteRefundChargeParams)) {
            return false;
        }
        TapOnPhoneExecuteRefundChargeParams tapOnPhoneExecuteRefundChargeParams = (TapOnPhoneExecuteRefundChargeParams) other;
        return Intrinsics.areEqual(this.secureRefundTerminal, tapOnPhoneExecuteRefundChargeParams.secureRefundTerminal) && Intrinsics.areEqual(this.transaction, tapOnPhoneExecuteRefundChargeParams.transaction);
    }

    @NotNull
    public final SecureTerminal getSecureRefundTerminal() {
        return this.secureRefundTerminal;
    }

    @NotNull
    public final TransactionDTO getTransaction() {
        return this.transaction;
    }

    public int hashCode() {
        return this.transaction.hashCode() + (this.secureRefundTerminal.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "TapOnPhoneExecuteRefundChargeParams(secureRefundTerminal=" + this.secureRefundTerminal + ", transaction=" + this.transaction + ")";
    }
}
