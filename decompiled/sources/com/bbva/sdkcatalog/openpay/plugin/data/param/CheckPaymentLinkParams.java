package com.bbva.sdkcatalog.openpay.plugin.data.param;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.core.model.extra.SecureTerminal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CheckPaymentLinkParams.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/data/param/CheckPaymentLinkParams;", "", "secureTerminal", "Lmx/openpay/library/core/model/extra/SecureTerminal;", "paymentLinkId", "", "<init>", "(Lmx/openpay/library/core/model/extra/SecureTerminal;Ljava/lang/String;)V", "getSecureTerminal", "()Lmx/openpay/library/core/model/extra/SecureTerminal;", "getPaymentLinkId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CheckPaymentLinkParams {

    @SerializedName("paymentLinkId")
    @NotNull
    private final String paymentLinkId;

    @SerializedName("secureTerminal")
    @NotNull
    private final SecureTerminal secureTerminal;

    public CheckPaymentLinkParams(@NotNull SecureTerminal secureTerminal, @NotNull String paymentLinkId) {
        Intrinsics.checkNotNullParameter(secureTerminal, "secureTerminal");
        Intrinsics.checkNotNullParameter(paymentLinkId, "paymentLinkId");
        this.secureTerminal = secureTerminal;
        this.paymentLinkId = paymentLinkId;
    }

    public static /* synthetic */ CheckPaymentLinkParams copy$default(CheckPaymentLinkParams checkPaymentLinkParams, SecureTerminal secureTerminal, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            secureTerminal = checkPaymentLinkParams.secureTerminal;
        }
        if ((i10 & 2) != 0) {
            str = checkPaymentLinkParams.paymentLinkId;
        }
        return checkPaymentLinkParams.copy(secureTerminal, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SecureTerminal getSecureTerminal() {
        return this.secureTerminal;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaymentLinkId() {
        return this.paymentLinkId;
    }

    @NotNull
    public final CheckPaymentLinkParams copy(@NotNull SecureTerminal secureTerminal, @NotNull String paymentLinkId) {
        Intrinsics.checkNotNullParameter(secureTerminal, "secureTerminal");
        Intrinsics.checkNotNullParameter(paymentLinkId, "paymentLinkId");
        return new CheckPaymentLinkParams(secureTerminal, paymentLinkId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckPaymentLinkParams)) {
            return false;
        }
        CheckPaymentLinkParams checkPaymentLinkParams = (CheckPaymentLinkParams) other;
        return Intrinsics.areEqual(this.secureTerminal, checkPaymentLinkParams.secureTerminal) && Intrinsics.areEqual(this.paymentLinkId, checkPaymentLinkParams.paymentLinkId);
    }

    @NotNull
    public final String getPaymentLinkId() {
        return this.paymentLinkId;
    }

    @NotNull
    public final SecureTerminal getSecureTerminal() {
        return this.secureTerminal;
    }

    public int hashCode() {
        return this.paymentLinkId.hashCode() + (this.secureTerminal.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "CheckPaymentLinkParams(secureTerminal=" + this.secureTerminal + ", paymentLinkId=" + this.paymentLinkId + ")";
    }
}
