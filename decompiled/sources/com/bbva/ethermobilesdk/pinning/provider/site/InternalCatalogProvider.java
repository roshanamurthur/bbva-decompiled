package com.bbva.ethermobilesdk.pinning.provider.site;

import android.content.Context;
import com.bbva.ethermobilesdk.pinning.R;
import com.bbva.ethermobilesdk.pinning.model.ProviderType;
import com.bbva.ethermobilesdk.pinning.model.catalog.Catalog;
import com.bbva.ethermobilesdk.pinning.model.configuration.PinningConfig;
import com.bbva.ethermobilesdk.pinning.model.configuration.PinningGlobalEnvironment;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CatalogProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/provider/site/InternalCatalogProvider;", "Lcom/bbva/ethermobilesdk/pinning/provider/site/PreferencesProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "loadCatalog", "Lcom/bbva/ethermobilesdk/pinning/model/catalog/Catalog;", "configuration", "Lcom/bbva/ethermobilesdk/pinning/model/configuration/PinningConfig;", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InternalCatalogProvider extends PreferencesProvider {

    /* JADX INFO: compiled from: CatalogProvider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PinningGlobalEnvironment.values().length];
            try {
                iArr[PinningGlobalEnvironment.WORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PinningGlobalEnvironment.LIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalCatalogProvider(@NotNull Context context) {
        super(context, ProviderType.INTERNAL_PROVIDER, null, null, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.bbva.ethermobilesdk.pinning.provider.site.PreferencesProvider, com.bbva.ethermobilesdk.pinning.provider.SiteProvider
    @Nullable
    public Catalog loadCatalog(@NotNull PinningConfig configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        int i10 = WhenMappings.$EnumSwitchMapping$0[configuration.getMode().ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? new Catalog(CollectionsKt__CollectionsKt.emptyList()) : super.loadCatalog(PinningConfig.copy$default(configuration, R.raw.catalog_pro_mobile_arch, "internal.catalogs/catalog_pro_mobile_arch,.xml", false, null, 12, null));
        }
        return super.loadCatalog(PinningConfig.copy$default(configuration, R.raw.catalog_dev_mobile_arch, "internal.catalogs/catalog_dev_mobile_arch.xml", false, null, 12, null));
    }
}
