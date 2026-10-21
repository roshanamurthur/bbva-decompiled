package com.bbva.glomohybrid.login.data.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Bank.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/glomohybrid/login/data/model/Bank;", "", "", "component1", "Lcom/bbva/glomohybrid/login/data/model/NameIdEntity;", "component2", "bankId", "branch", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getBankId", "()Ljava/lang/String;", "b", "Lcom/bbva/glomohybrid/login/data/model/NameIdEntity;", "getBranch", "()Lcom/bbva/glomohybrid/login/data/model/NameIdEntity;", "<init>", "(Ljava/lang/String;Lcom/bbva/glomohybrid/login/data/model/NameIdEntity;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class Bank {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String bankId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final NameIdEntity branch;

    public Bank(@Nullable String str, @Nullable NameIdEntity nameIdEntity) {
        this.bankId = str;
        this.branch = nameIdEntity;
    }

    public static /* synthetic */ Bank copy$default(Bank bank, String str, NameIdEntity nameIdEntity, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bank.bankId;
        }
        if ((i10 & 2) != 0) {
            nameIdEntity = bank.branch;
        }
        return bank.copy(str, nameIdEntity);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBankId() {
        return this.bankId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NameIdEntity getBranch() {
        return this.branch;
    }

    @NotNull
    public final Bank copy(@Nullable String bankId, @Nullable NameIdEntity branch) {
        return new Bank(bankId, branch);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Bank)) {
            return false;
        }
        Bank bank = (Bank) other;
        return Intrinsics.areEqual(this.bankId, bank.bankId) && Intrinsics.areEqual(this.branch, bank.branch);
    }

    @Nullable
    public final String getBankId() {
        return this.bankId;
    }

    @Nullable
    public final NameIdEntity getBranch() {
        return this.branch;
    }

    public int hashCode() {
        String str = this.bankId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        NameIdEntity nameIdEntity = this.branch;
        return iHashCode + (nameIdEntity != null ? nameIdEntity.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Bank(bankId=" + this.bankId + ", branch=" + this.branch + ")";
    }
}
