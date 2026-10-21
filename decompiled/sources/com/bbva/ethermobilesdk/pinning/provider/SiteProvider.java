package com.bbva.ethermobilesdk.pinning.provider;

import com.bbva.ethermobilesdk.pinning.data.catalog.SiteCatalogDTO;
import com.bbva.ethermobilesdk.pinning.logger.LoggerKt;
import com.bbva.ethermobilesdk.pinning.model.ProviderProperties;
import com.bbva.ethermobilesdk.pinning.model.ProviderType;
import com.bbva.ethermobilesdk.pinning.model.catalog.Catalog;
import com.bbva.ethermobilesdk.pinning.model.catalog.Site;
import com.bbva.ethermobilesdk.pinning.model.configuration.PinningConfig;
import com.bbva.networkplugin.command.impl.PutCommand;
import com.bbva.plugin.localstorage.command.ClearCommand;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SiteProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u0012\u0010\u0011\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH$J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017J\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0014¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\u000e\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020!J\u0012\u0010\"\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0012\u0010#\u001a\u0004\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0016\u0010$\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u001a\u0010%\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0017H\u0014J\u001a\u0010'\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0017H\u0016J\u0010\u0010(\u001a\u00020\f2\u0006\u0010 \u001a\u00020!H\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007¨\u0006)"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/provider/SiteProvider;", "", "()V", "next", "getNext", "()Lcom/bbva/ethermobilesdk/pinning/provider/SiteProvider;", "setNext", "(Lcom/bbva/ethermobilesdk/pinning/provider/SiteProvider;)V", "previous", "getPrevious", "setPrevious", "changeLastModified", "", "type", "Lcom/bbva/ethermobilesdk/pinning/model/ProviderType;", "lastModified", "", ClearCommand.ID, "getProperties", "Lcom/bbva/ethermobilesdk/pinning/model/ProviderProperties;", "isNewer", "", "remoteSiteCatalog", "Lcom/bbva/ethermobilesdk/pinning/data/catalog/SiteCatalogDTO;", "isUpdated", "(Lcom/bbva/ethermobilesdk/pinning/model/ProviderType;Lcom/bbva/ethermobilesdk/pinning/data/catalog/SiteCatalogDTO;)Ljava/lang/Boolean;", "load", "Lcom/bbva/ethermobilesdk/pinning/model/catalog/Catalog;", "configuration", "Lcom/bbva/ethermobilesdk/pinning/model/configuration/PinningConfig;", "loadCatalog", PutCommand.ID, "site", "Lcom/bbva/ethermobilesdk/pinning/model/catalog/Site;", "reset", "retrieveProperties", "setLastModified", "update", "siteCatalog", "updateCatalog", "write", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class SiteProvider {

    @Nullable
    private SiteProvider next;

    @Nullable
    private SiteProvider previous;

    public static /* synthetic */ void reset$default(SiteProvider siteProvider, ProviderType providerType, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reset");
        }
        if ((i10 & 1) != 0) {
            providerType = null;
        }
        siteProvider.reset(providerType);
    }

    public void changeLastModified(@NotNull ProviderType type, @NotNull String lastModified) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(lastModified, "lastModified");
    }

    public abstract void clear(@Nullable ProviderType type);

    @Nullable
    public final SiteProvider getNext() {
        return this.next;
    }

    @Nullable
    public final SiteProvider getPrevious() {
        return this.previous;
    }

    @Nullable
    public final ProviderProperties getProperties(@NotNull ProviderType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        ProviderProperties providerPropertiesRetrieveProperties = retrieveProperties(type);
        if (providerPropertiesRetrieveProperties != null) {
            return providerPropertiesRetrieveProperties;
        }
        SiteProvider siteProvider = this.next;
        if (siteProvider != null) {
            return siteProvider.getProperties(type);
        }
        return null;
    }

    public final boolean isNewer(@NotNull ProviderType type, @NotNull SiteCatalogDTO remoteSiteCatalog) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(remoteSiteCatalog, "remoteSiteCatalog");
        Boolean boolIsUpdated = isUpdated(type, remoteSiteCatalog);
        if (boolIsUpdated != null) {
            return !boolIsUpdated.booleanValue();
        }
        SiteProvider siteProvider = this.next;
        if (siteProvider != null) {
            return siteProvider.isNewer(type, remoteSiteCatalog);
        }
        return true;
    }

    @Nullable
    public Boolean isUpdated(@NotNull ProviderType type, @NotNull SiteCatalogDTO remoteSiteCatalog) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(remoteSiteCatalog, "remoteSiteCatalog");
        return null;
    }

    @Nullable
    public final Catalog load(@NotNull PinningConfig configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Catalog catalogLoadCatalog = loadCatalog(configuration);
        SiteProvider siteProvider = this.next;
        Catalog catalogLoad = siteProvider != null ? siteProvider.load(configuration) : null;
        if (catalogLoadCatalog == null || catalogLoad == null) {
            return catalogLoadCatalog == null ? catalogLoad : catalogLoadCatalog;
        }
        return new Catalog(CollectionsKt___CollectionsKt.plus((Collection) catalogLoadCatalog.getSites(), (Iterable) catalogLoad.getSites()));
    }

    @Nullable
    public Catalog loadCatalog(@NotNull PinningConfig configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return null;
    }

    public final void put(@NotNull Site site) {
        Intrinsics.checkNotNullParameter(site, "site");
        write(site);
        SiteProvider siteProvider = this.previous;
        if (siteProvider != null) {
            siteProvider.write(site);
        }
    }

    public final void reset(@Nullable ProviderType type) {
        LoggerKt.log$default(null, "siteprovider will reset", 1, null);
        clear(type);
        SiteProvider siteProvider = this.next;
        if (siteProvider != null) {
            siteProvider.reset(type);
        }
        LoggerKt.log$default(null, "siteprovider did reset", 1, null);
    }

    @Nullable
    public ProviderProperties retrieveProperties(@NotNull ProviderType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return null;
    }

    public final void setLastModified(@NotNull ProviderType type, @NotNull String lastModified) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(lastModified, "lastModified");
        changeLastModified(type, lastModified);
        SiteProvider siteProvider = this.next;
        if (siteProvider != null) {
            siteProvider.setLastModified(type, lastModified);
        }
    }

    public final void setNext(@Nullable SiteProvider siteProvider) {
        this.next = siteProvider;
    }

    public final void setPrevious(@Nullable SiteProvider siteProvider) {
        this.previous = siteProvider;
    }

    @Nullable
    public Catalog update(@NotNull ProviderType type, @NotNull SiteCatalogDTO siteCatalog) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(siteCatalog, "siteCatalog");
        return null;
    }

    @Nullable
    public Catalog updateCatalog(@NotNull ProviderType type, @NotNull SiteCatalogDTO siteCatalog) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(siteCatalog, "siteCatalog");
        Catalog catalogUpdate = update(type, siteCatalog);
        SiteProvider siteProvider = this.next;
        Catalog catalogUpdateCatalog = siteProvider != null ? siteProvider.updateCatalog(type, siteCatalog) : null;
        if (catalogUpdate == null || catalogUpdateCatalog == null) {
            return catalogUpdate == null ? catalogUpdateCatalog : catalogUpdate;
        }
        return new Catalog(CollectionsKt___CollectionsKt.plus((Collection) catalogUpdate.getSites(), (Iterable) catalogUpdateCatalog.getSites()));
    }

    public void write(@NotNull Site site) {
        Intrinsics.checkNotNullParameter(site, "site");
    }
}
