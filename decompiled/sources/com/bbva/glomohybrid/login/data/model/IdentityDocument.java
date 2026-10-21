package com.bbva.glomohybrid.login.data.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IdentityDocument.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/glomohybrid/login/data/model/IdentityDocument;", "", "Lcom/bbva/glomohybrid/login/data/model/NameIdEntity;", "component1", "", "component2", "documentType", "documentNumber", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/glomohybrid/login/data/model/NameIdEntity;", "getDocumentType", "()Lcom/bbva/glomohybrid/login/data/model/NameIdEntity;", "b", "Ljava/lang/String;", "getDocumentNumber", "()Ljava/lang/String;", "<init>", "(Lcom/bbva/glomohybrid/login/data/model/NameIdEntity;Ljava/lang/String;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class IdentityDocument {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final NameIdEntity documentType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String documentNumber;

    public IdentityDocument(@Nullable NameIdEntity nameIdEntity, @Nullable String str) {
        this.documentType = nameIdEntity;
        this.documentNumber = str;
    }

    public static /* synthetic */ IdentityDocument copy$default(IdentityDocument identityDocument, NameIdEntity nameIdEntity, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            nameIdEntity = identityDocument.documentType;
        }
        if ((i10 & 2) != 0) {
            str = identityDocument.documentNumber;
        }
        return identityDocument.copy(nameIdEntity, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NameIdEntity getDocumentType() {
        return this.documentType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    @NotNull
    public final IdentityDocument copy(@Nullable NameIdEntity documentType, @Nullable String documentNumber) {
        return new IdentityDocument(documentType, documentNumber);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdentityDocument)) {
            return false;
        }
        IdentityDocument identityDocument = (IdentityDocument) other;
        return Intrinsics.areEqual(this.documentType, identityDocument.documentType) && Intrinsics.areEqual(this.documentNumber, identityDocument.documentNumber);
    }

    @Nullable
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    @Nullable
    public final NameIdEntity getDocumentType() {
        return this.documentType;
    }

    public int hashCode() {
        NameIdEntity nameIdEntity = this.documentType;
        int iHashCode = (nameIdEntity == null ? 0 : nameIdEntity.hashCode()) * 31;
        String str = this.documentNumber;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "IdentityDocument(documentType=" + this.documentType + ", documentNumber=" + this.documentNumber + ")";
    }
}
