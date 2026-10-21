package com.bbva.ethermobilesdk.token.storage.data;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.plugin.command.jwe.JweRSAKeyPairCommand;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Token.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/bbva/ethermobilesdk/token/storage/data/StorageToken;", "", "id", "", JweRSAKeyPairCommand.RSA, "Lcom/bbva/ethermobilesdk/token/storage/data/StorageTokenRSA;", "activation", "Lcom/bbva/ethermobilesdk/token/storage/data/StorageTokenActivation;", "ocraSuite", "Lcom/bbva/ethermobilesdk/token/storage/data/StorageOcraSuite;", "(Ljava/lang/String;Lcom/bbva/ethermobilesdk/token/storage/data/StorageTokenRSA;Lcom/bbva/ethermobilesdk/token/storage/data/StorageTokenActivation;Lcom/bbva/ethermobilesdk/token/storage/data/StorageOcraSuite;)V", "getActivation", "()Lcom/bbva/ethermobilesdk/token/storage/data/StorageTokenActivation;", "getId", "()Ljava/lang/String;", "getOcraSuite", "()Lcom/bbva/ethermobilesdk/token/storage/data/StorageOcraSuite;", "getRsa", "()Lcom/bbva/ethermobilesdk/token/storage/data/StorageTokenRSA;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "ethertoken_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class StorageToken {

    @SerializedName("activation")
    @Nullable
    private final StorageTokenActivation activation;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName("ocraSuite")
    @Nullable
    private final StorageOcraSuite ocraSuite;

    @SerializedName(JweRSAKeyPairCommand.RSA)
    @NotNull
    private final StorageTokenRSA rsa;

    public StorageToken(@NotNull String id, @NotNull StorageTokenRSA rsa, @Nullable StorageTokenActivation storageTokenActivation, @Nullable StorageOcraSuite storageOcraSuite) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(rsa, "rsa");
        this.id = id;
        this.rsa = rsa;
        this.activation = storageTokenActivation;
        this.ocraSuite = storageOcraSuite;
    }

    public static /* synthetic */ StorageToken copy$default(StorageToken storageToken, String str, StorageTokenRSA storageTokenRSA, StorageTokenActivation storageTokenActivation, StorageOcraSuite storageOcraSuite, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = storageToken.id;
        }
        if ((i10 & 2) != 0) {
            storageTokenRSA = storageToken.rsa;
        }
        if ((i10 & 4) != 0) {
            storageTokenActivation = storageToken.activation;
        }
        if ((i10 & 8) != 0) {
            storageOcraSuite = storageToken.ocraSuite;
        }
        return storageToken.copy(str, storageTokenRSA, storageTokenActivation, storageOcraSuite);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final StorageTokenRSA getRsa() {
        return this.rsa;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final StorageTokenActivation getActivation() {
        return this.activation;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final StorageOcraSuite getOcraSuite() {
        return this.ocraSuite;
    }

    @NotNull
    public final StorageToken copy(@NotNull String id, @NotNull StorageTokenRSA rsa, @Nullable StorageTokenActivation activation, @Nullable StorageOcraSuite ocraSuite) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(rsa, "rsa");
        return new StorageToken(id, rsa, activation, ocraSuite);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StorageToken)) {
            return false;
        }
        StorageToken storageToken = (StorageToken) other;
        return Intrinsics.areEqual(this.id, storageToken.id) && Intrinsics.areEqual(this.rsa, storageToken.rsa) && Intrinsics.areEqual(this.activation, storageToken.activation) && Intrinsics.areEqual(this.ocraSuite, storageToken.ocraSuite);
    }

    @Nullable
    public final StorageTokenActivation getActivation() {
        return this.activation;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final StorageOcraSuite getOcraSuite() {
        return this.ocraSuite;
    }

    @NotNull
    public final StorageTokenRSA getRsa() {
        return this.rsa;
    }

    public int hashCode() {
        int iHashCode = (this.rsa.hashCode() + (this.id.hashCode() * 31)) * 31;
        StorageTokenActivation storageTokenActivation = this.activation;
        int iHashCode2 = (iHashCode + (storageTokenActivation == null ? 0 : storageTokenActivation.hashCode())) * 31;
        StorageOcraSuite storageOcraSuite = this.ocraSuite;
        return iHashCode2 + (storageOcraSuite != null ? storageOcraSuite.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "StorageToken(id=" + this.id + ", rsa=" + this.rsa + ", activation=" + this.activation + ", ocraSuite=" + this.ocraSuite + ")";
    }
}
