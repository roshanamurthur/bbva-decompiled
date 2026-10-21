package com.bbva.ethermobilesdk.token.model;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.plugin.command.jwe.JweRSAKeyPairCommand;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Token.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0006\u0010\u001d\u001a\u00020\u0019J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/bbva/ethermobilesdk/token/model/Token;", "", "id", "", JweRSAKeyPairCommand.RSA, "Lcom/bbva/ethermobilesdk/token/model/TokenRSA;", "activation", "Lcom/bbva/ethermobilesdk/token/model/TokenActivation;", "ocraSuite", "Lcom/bbva/ethermobilesdk/token/model/OcraSuite;", "(Ljava/lang/String;Lcom/bbva/ethermobilesdk/token/model/TokenRSA;Lcom/bbva/ethermobilesdk/token/model/TokenActivation;Lcom/bbva/ethermobilesdk/token/model/OcraSuite;)V", "getActivation", "()Lcom/bbva/ethermobilesdk/token/model/TokenActivation;", "getId", "()Ljava/lang/String;", "getOcraSuite", "()Lcom/bbva/ethermobilesdk/token/model/OcraSuite;", "getRsa", "()Lcom/bbva/ethermobilesdk/token/model/TokenRSA;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "isActive", "toString", "ethertoken_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Token {

    @Nullable
    private final TokenActivation activation;

    @NotNull
    private final String id;

    @Nullable
    private final OcraSuite ocraSuite;

    @NotNull
    private final TokenRSA rsa;

    public Token(@NotNull String id, @NotNull TokenRSA rsa, @Nullable TokenActivation tokenActivation, @Nullable OcraSuite ocraSuite) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(rsa, "rsa");
        this.id = id;
        this.rsa = rsa;
        this.activation = tokenActivation;
        this.ocraSuite = ocraSuite;
    }

    public static /* synthetic */ Token copy$default(Token token, String str, TokenRSA tokenRSA, TokenActivation tokenActivation, OcraSuite ocraSuite, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = token.id;
        }
        if ((i10 & 2) != 0) {
            tokenRSA = token.rsa;
        }
        if ((i10 & 4) != 0) {
            tokenActivation = token.activation;
        }
        if ((i10 & 8) != 0) {
            ocraSuite = token.ocraSuite;
        }
        return token.copy(str, tokenRSA, tokenActivation, ocraSuite);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TokenRSA getRsa() {
        return this.rsa;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TokenActivation getActivation() {
        return this.activation;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OcraSuite getOcraSuite() {
        return this.ocraSuite;
    }

    @NotNull
    public final Token copy(@NotNull String id, @NotNull TokenRSA rsa, @Nullable TokenActivation activation, @Nullable OcraSuite ocraSuite) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(rsa, "rsa");
        return new Token(id, rsa, activation, ocraSuite);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Token)) {
            return false;
        }
        Token token = (Token) other;
        return Intrinsics.areEqual(this.id, token.id) && Intrinsics.areEqual(this.rsa, token.rsa) && Intrinsics.areEqual(this.activation, token.activation) && Intrinsics.areEqual(this.ocraSuite, token.ocraSuite);
    }

    @Nullable
    public final TokenActivation getActivation() {
        return this.activation;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final OcraSuite getOcraSuite() {
        return this.ocraSuite;
    }

    @NotNull
    public final TokenRSA getRsa() {
        return this.rsa;
    }

    public int hashCode() {
        int iHashCode = (this.rsa.hashCode() + (this.id.hashCode() * 31)) * 31;
        TokenActivation tokenActivation = this.activation;
        int iHashCode2 = (iHashCode + (tokenActivation == null ? 0 : tokenActivation.hashCode())) * 31;
        OcraSuite ocraSuite = this.ocraSuite;
        return iHashCode2 + (ocraSuite != null ? ocraSuite.hashCode() : 0);
    }

    public final boolean isActive() {
        return (this.activation == null || this.ocraSuite == null) ? false : true;
    }

    @NotNull
    public String toString() {
        return "Token(id=" + this.id + ", rsa=" + this.rsa + ", activation=" + this.activation + ", ocraSuite=" + this.ocraSuite + ")";
    }

    public /* synthetic */ Token(String str, TokenRSA tokenRSA, TokenActivation tokenActivation, OcraSuite ocraSuite, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, tokenRSA, (i10 & 4) != 0 ? null : tokenActivation, (i10 & 8) != 0 ? null : ocraSuite);
    }
}
