package com.bbva.ethermobilesdk.passchecker.model.api.input;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Policy.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/api/input/Policy;", "", "allow", "Lcom/bbva/ethermobilesdk/passchecker/model/api/input/Allow;", "require", "Lcom/bbva/ethermobilesdk/passchecker/model/api/input/Require;", "limit", "Lcom/bbva/ethermobilesdk/passchecker/model/api/input/Limit;", "qualityMap", "Lcom/bbva/ethermobilesdk/passchecker/model/api/input/QualityMap;", "(Lcom/bbva/ethermobilesdk/passchecker/model/api/input/Allow;Lcom/bbva/ethermobilesdk/passchecker/model/api/input/Require;Lcom/bbva/ethermobilesdk/passchecker/model/api/input/Limit;Lcom/bbva/ethermobilesdk/passchecker/model/api/input/QualityMap;)V", "getAllow", "()Lcom/bbva/ethermobilesdk/passchecker/model/api/input/Allow;", "getLimit", "()Lcom/bbva/ethermobilesdk/passchecker/model/api/input/Limit;", "getQualityMap", "()Lcom/bbva/ethermobilesdk/passchecker/model/api/input/QualityMap;", "getRequire", "()Lcom/bbva/ethermobilesdk/passchecker/model/api/input/Require;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Policy {

    @NotNull
    private final Allow allow;

    @NotNull
    private final Limit limit;

    @NotNull
    private final QualityMap qualityMap;

    @NotNull
    private final Require require;

    public Policy(@NotNull Allow allow, @NotNull Require require, @NotNull Limit limit, @NotNull QualityMap qualityMap) {
        Intrinsics.checkNotNullParameter(allow, "allow");
        Intrinsics.checkNotNullParameter(require, "require");
        Intrinsics.checkNotNullParameter(limit, "limit");
        Intrinsics.checkNotNullParameter(qualityMap, "qualityMap");
        this.allow = allow;
        this.require = require;
        this.limit = limit;
        this.qualityMap = qualityMap;
    }

    public static /* synthetic */ Policy copy$default(Policy policy, Allow allow, Require require, Limit limit, QualityMap qualityMap, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            allow = policy.allow;
        }
        if ((i10 & 2) != 0) {
            require = policy.require;
        }
        if ((i10 & 4) != 0) {
            limit = policy.limit;
        }
        if ((i10 & 8) != 0) {
            qualityMap = policy.qualityMap;
        }
        return policy.copy(allow, require, limit, qualityMap);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Allow getAllow() {
        return this.allow;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Require getRequire() {
        return this.require;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Limit getLimit() {
        return this.limit;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final QualityMap getQualityMap() {
        return this.qualityMap;
    }

    @NotNull
    public final Policy copy(@NotNull Allow allow, @NotNull Require require, @NotNull Limit limit, @NotNull QualityMap qualityMap) {
        Intrinsics.checkNotNullParameter(allow, "allow");
        Intrinsics.checkNotNullParameter(require, "require");
        Intrinsics.checkNotNullParameter(limit, "limit");
        Intrinsics.checkNotNullParameter(qualityMap, "qualityMap");
        return new Policy(allow, require, limit, qualityMap);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Policy)) {
            return false;
        }
        Policy policy = (Policy) other;
        return Intrinsics.areEqual(this.allow, policy.allow) && Intrinsics.areEqual(this.require, policy.require) && Intrinsics.areEqual(this.limit, policy.limit) && Intrinsics.areEqual(this.qualityMap, policy.qualityMap);
    }

    @NotNull
    public final Allow getAllow() {
        return this.allow;
    }

    @NotNull
    public final Limit getLimit() {
        return this.limit;
    }

    @NotNull
    public final QualityMap getQualityMap() {
        return this.qualityMap;
    }

    @NotNull
    public final Require getRequire() {
        return this.require;
    }

    public int hashCode() {
        return this.qualityMap.hashCode() + ((this.limit.hashCode() + ((this.require.hashCode() + (this.allow.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "Policy(allow=" + this.allow + ", require=" + this.require + ", limit=" + this.limit + ", qualityMap=" + this.qualityMap + RootService.CLOSE_BRACKET;
    }
}
