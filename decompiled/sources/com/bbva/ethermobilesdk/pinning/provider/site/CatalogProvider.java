package com.bbva.ethermobilesdk.pinning.provider.site;

import android.content.Context;
import com.bbva.ethermobilesdk.pinning.model.ProviderType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CatalogProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/provider/site/CatalogProvider;", "Lcom/bbva/ethermobilesdk/pinning/provider/site/PreferencesProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CatalogProvider extends PreferencesProvider {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogProvider(@NotNull Context context) {
        super(context, ProviderType.APP_PROVIDER, null, null, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
