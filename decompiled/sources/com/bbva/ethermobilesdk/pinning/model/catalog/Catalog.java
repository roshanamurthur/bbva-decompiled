package com.bbva.ethermobilesdk.pinning.model.catalog;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Catalog.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u000fHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/model/catalog/Catalog;", "", "sites", "", "Lcom/bbva/ethermobilesdk/pinning/model/catalog/Site;", "(Ljava/util/List;)V", "getSites", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "findSiteFromHost", "host", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Catalog {

    @NotNull
    private final List<Site> sites;

    /* JADX INFO: compiled from: Catalog.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MatchType.values().length];
            try {
                iArr[MatchType.SITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MatchType.WILDCARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Catalog(@NotNull List<Site> sites) {
        Intrinsics.checkNotNullParameter(sites, "sites");
        this.sites = sites;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Catalog copy$default(Catalog catalog, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = catalog.sites;
        }
        return catalog.copy(list);
    }

    @NotNull
    public final List<Site> component1() {
        return this.sites;
    }

    @NotNull
    public final Catalog copy(@NotNull List<Site> sites) {
        Intrinsics.checkNotNullParameter(sites, "sites");
        return new Catalog(sites);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Catalog) && Intrinsics.areEqual(this.sites, ((Catalog) other).sites);
    }

    @Nullable
    public final Site findSiteFromHost(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        Site site = null;
        for (Site site2 : this.sites) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[site2.matchHost(host).ordinal()];
            if (i10 == 1) {
                return site2;
            }
            if (i10 == 2) {
                site = site2;
            }
        }
        return site;
    }

    @NotNull
    public final List<Site> getSites() {
        return this.sites;
    }

    public int hashCode() {
        return this.sites.hashCode();
    }

    @NotNull
    public String toString() {
        return "Catalog(sites=" + this.sites + ")";
    }
}
