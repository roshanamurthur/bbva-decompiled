package com.bbva.sdkcatalog.openpay.plugin.data.param;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.sdkcatalog.openpay.plugin.data.model.PaymentLinkModel;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.core.model.extra.SecureTerminal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CreatePaymentLinkParams.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/data/param/CreatePaymentLinkParams;", "", "secureTerminal", "Lmx/openpay/library/core/model/extra/SecureTerminal;", "paymentLink", "Lcom/bbva/sdkcatalog/openpay/plugin/data/model/PaymentLinkModel;", "<init>", "(Lmx/openpay/library/core/model/extra/SecureTerminal;Lcom/bbva/sdkcatalog/openpay/plugin/data/model/PaymentLinkModel;)V", "getSecureTerminal", "()Lmx/openpay/library/core/model/extra/SecureTerminal;", "getPaymentLink", "()Lcom/bbva/sdkcatalog/openpay/plugin/data/model/PaymentLinkModel;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CreatePaymentLinkParams {

    @SerializedName("paymentLink")
    @NotNull
    private final PaymentLinkModel paymentLink;

    @SerializedName("secureTerminal")
    @NotNull
    private final SecureTerminal secureTerminal;

    public CreatePaymentLinkParams(@NotNull SecureTerminal secureTerminal, @NotNull PaymentLinkModel paymentLink) {
        Intrinsics.checkNotNullParameter(secureTerminal, "secureTerminal");
        Intrinsics.checkNotNullParameter(paymentLink, "paymentLink");
        this.secureTerminal = secureTerminal;
        this.paymentLink = paymentLink;
    }

    public static /* synthetic */ CreatePaymentLinkParams copy$default(CreatePaymentLinkParams createPaymentLinkParams, SecureTerminal secureTerminal, PaymentLinkModel paymentLinkModel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            secureTerminal = createPaymentLinkParams.secureTerminal;
        }
        if ((i10 & 2) != 0) {
            paymentLinkModel = createPaymentLinkParams.paymentLink;
        }
        return createPaymentLinkParams.copy(secureTerminal, paymentLinkModel);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SecureTerminal getSecureTerminal() {
        return this.secureTerminal;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PaymentLinkModel getPaymentLink() {
        return this.paymentLink;
    }

    @NotNull
    public final CreatePaymentLinkParams copy(@NotNull SecureTerminal secureTerminal, @NotNull PaymentLinkModel paymentLink) {
        Intrinsics.checkNotNullParameter(secureTerminal, "secureTerminal");
        Intrinsics.checkNotNullParameter(paymentLink, "paymentLink");
        return new CreatePaymentLinkParams(secureTerminal, paymentLink);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreatePaymentLinkParams)) {
            return false;
        }
        CreatePaymentLinkParams createPaymentLinkParams = (CreatePaymentLinkParams) other;
        return Intrinsics.areEqual(this.secureTerminal, createPaymentLinkParams.secureTerminal) && Intrinsics.areEqual(this.paymentLink, createPaymentLinkParams.paymentLink);
    }

    @NotNull
    public final PaymentLinkModel getPaymentLink() {
        return this.paymentLink;
    }

    @NotNull
    public final SecureTerminal getSecureTerminal() {
        return this.secureTerminal;
    }

    public int hashCode() {
        return this.paymentLink.hashCode() + (this.secureTerminal.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "CreatePaymentLinkParams(secureTerminal=" + this.secureTerminal + ", paymentLink=" + this.paymentLink + ")";
    }
}
