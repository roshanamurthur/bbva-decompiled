package com.bbva.gp2.android.product.mobilepayment.plugin.request;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.gp2.android.product.mobilepayment.library.model.CardRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EnableCardsRequest.kt */
/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/bbva/gp2/android/product/mobilepayment/plugin/request/EnableCardsRequest;", "", "cards", "", "Lcom/bbva/gp2/android/product/mobilepayment/library/model/CardRequest;", "pkcs7", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getCards", "()Ljava/util/List;", "getPkcs7", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "payments-mobilepayment-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EnableCardsRequest {

    @NotNull
    private final List<CardRequest> cards;

    @NotNull
    private final String pkcs7;

    public EnableCardsRequest(@NotNull List<CardRequest> cards, @NotNull String pkcs7) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(pkcs7, "pkcs7");
        this.cards = cards;
        this.pkcs7 = pkcs7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EnableCardsRequest copy$default(EnableCardsRequest enableCardsRequest, List list, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = enableCardsRequest.cards;
        }
        if ((i10 & 2) != 0) {
            str = enableCardsRequest.pkcs7;
        }
        return enableCardsRequest.copy(list, str);
    }

    @NotNull
    public final List<CardRequest> component1() {
        return this.cards;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPkcs7() {
        return this.pkcs7;
    }

    @NotNull
    public final EnableCardsRequest copy(@NotNull List<CardRequest> cards, @NotNull String pkcs7) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(pkcs7, "pkcs7");
        return new EnableCardsRequest(cards, pkcs7);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnableCardsRequest)) {
            return false;
        }
        EnableCardsRequest enableCardsRequest = (EnableCardsRequest) other;
        return Intrinsics.areEqual(this.cards, enableCardsRequest.cards) && Intrinsics.areEqual(this.pkcs7, enableCardsRequest.pkcs7);
    }

    @NotNull
    public final List<CardRequest> getCards() {
        return this.cards;
    }

    @NotNull
    public final String getPkcs7() {
        return this.pkcs7;
    }

    public int hashCode() {
        return this.pkcs7.hashCode() + (this.cards.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "EnableCardsRequest(cards=" + this.cards + ", pkcs7=" + this.pkcs7 + ")";
    }
}
