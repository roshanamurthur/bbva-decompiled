package com.bbva.ethermobilesdk.pinning.verifier;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.logs.LogKeysKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.w3c.dom.Node;

/* JADX INFO: compiled from: SignatureVerifier.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/verifier/VerificationData;", "", LogKeysKt.PROPERTIES, "Lorg/w3c/dom/Node;", "siteCatalog", "(Lorg/w3c/dom/Node;Lorg/w3c/dom/Node;)V", "getProperties", "()Lorg/w3c/dom/Node;", "getSiteCatalog", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class VerificationData {

    @NotNull
    private final Node properties;

    @NotNull
    private final Node siteCatalog;

    public VerificationData(@NotNull Node properties, @NotNull Node siteCatalog) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(siteCatalog, "siteCatalog");
        this.properties = properties;
        this.siteCatalog = siteCatalog;
    }

    public static /* synthetic */ VerificationData copy$default(VerificationData verificationData, Node node, Node node2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            node = verificationData.properties;
        }
        if ((i10 & 2) != 0) {
            node2 = verificationData.siteCatalog;
        }
        return verificationData.copy(node, node2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Node getProperties() {
        return this.properties;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Node getSiteCatalog() {
        return this.siteCatalog;
    }

    @NotNull
    public final VerificationData copy(@NotNull Node properties, @NotNull Node siteCatalog) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(siteCatalog, "siteCatalog");
        return new VerificationData(properties, siteCatalog);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationData)) {
            return false;
        }
        VerificationData verificationData = (VerificationData) other;
        return Intrinsics.areEqual(this.properties, verificationData.properties) && Intrinsics.areEqual(this.siteCatalog, verificationData.siteCatalog);
    }

    @NotNull
    public final Node getProperties() {
        return this.properties;
    }

    @NotNull
    public final Node getSiteCatalog() {
        return this.siteCatalog;
    }

    public int hashCode() {
        return this.siteCatalog.hashCode() + (this.properties.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "VerificationData(properties=" + this.properties + ", siteCatalog=" + this.siteCatalog + ")";
    }
}
