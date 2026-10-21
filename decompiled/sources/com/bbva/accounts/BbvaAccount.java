package com.bbva.accounts;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BbvaAccount.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/bbva/accounts/BbvaAccount;", "", "", "component1", "component2", "name", "type", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "getType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "accounts_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class BbvaAccount {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String type;

    public BbvaAccount(@NotNull String name, @NotNull String type) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.name = name;
        this.type = type;
    }

    public static /* synthetic */ BbvaAccount copy$default(BbvaAccount bbvaAccount, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bbvaAccount.name;
        }
        if ((i10 & 2) != 0) {
            str2 = bbvaAccount.type;
        }
        return bbvaAccount.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final BbvaAccount copy(@NotNull String name, @NotNull String type) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        return new BbvaAccount(name, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BbvaAccount)) {
            return false;
        }
        BbvaAccount bbvaAccount = (BbvaAccount) other;
        return Intrinsics.areEqual(this.name, bbvaAccount.name) && Intrinsics.areEqual(this.type, bbvaAccount.type);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + (this.name.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BbvaAccount(name=");
        sb2.append(this.name);
        sb2.append(", type=");
        return y2.b(sb2, this.type, RootService.CLOSE_BRACKET);
    }
}
