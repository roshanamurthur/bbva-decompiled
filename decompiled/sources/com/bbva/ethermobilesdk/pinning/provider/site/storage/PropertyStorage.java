package com.bbva.ethermobilesdk.pinning.provider.site.storage;

import com.bbva.ethermobilesdk.pinning.logger.LoggerKt;
import com.bbva.plugin.localstorage.command.ClearCommand;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PropertyStorage.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0005\"\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0005\"\u0004\b\u0019\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/provider/site/storage/PropertyStorage;", "", "lastModified", "", "getLastModified", "()Ljava/lang/String;", "setLastModified", "(Ljava/lang/String;)V", "lastUpdate", "", "getLastUpdate", "()J", "setLastUpdate", "(J)V", "revision", "", "getRevision", "()I", "setRevision", "(I)V", "updateThreshold", "getUpdateThreshold", "setUpdateThreshold", "updateUrls", "getUpdateUrls", "setUpdateUrls", ClearCommand.ID, "", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PropertyStorage {

    /* JADX INFO: compiled from: PropertyStorage.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void clear(@NotNull PropertyStorage propertyStorage) {
            LoggerKt.log$default(null, "propertystorage did clear", 1, null);
        }
    }

    void clear();

    @Nullable
    String getLastModified();

    long getLastUpdate();

    int getRevision();

    @Nullable
    String getUpdateThreshold();

    @Nullable
    String getUpdateUrls();

    void setLastModified(@Nullable String str);

    void setLastUpdate(long j10);

    void setRevision(int i10);

    void setUpdateThreshold(@Nullable String str);

    void setUpdateUrls(@Nullable String str);
}
