package com.bbva.ethermobilesdk.sharedstorage.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import bk.q;
import com.bbva.ethermobilesdk.sharedstorage.extension.ContentResolverKt;
import com.bbva.ethermobilesdk.sharedstorage.extension.ContextKt;
import com.bbva.ethermobilesdk.sharedstorage.extension.CursorEntry;
import com.bbva.ethermobilesdk.sharedstorage.model.AppSignature;
import com.bbva.ethermobilesdk.sharedstorage.model.SharedStorageResult;
import com.bbva.ethermobilesdk.sharedstorage.model.StorageEntry;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ExternalContentProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0007H\u0014J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0014¨\u0006\u0015"}, d2 = {"Lcom/bbva/ethermobilesdk/sharedstorage/provider/ExternalContentProvider;", "Lcom/bbva/ethermobilesdk/sharedstorage/provider/Provider;", "", "key", "Lcom/bbva/ethermobilesdk/sharedstorage/model/SharedStorageResult;", "Lcom/bbva/ethermobilesdk/sharedstorage/model/StorageEntry;", "read", "", "readAll", "value", "", "write", "Landroid/content/Context;", "context", "group", "scope", "", "Lcom/bbva/ethermobilesdk/sharedstorage/model/AppSignature;", "allowedApps", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "shared-storage_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nExternalContentProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExternalContentProvider.kt\ncom/bbva/ethermobilesdk/sharedstorage/provider/ExternalContentProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n1855#2,2:61\n*S KotlinDebug\n*F\n+ 1 ExternalContentProvider.kt\ncom/bbva/ethermobilesdk/sharedstorage/provider/ExternalContentProvider\n*L\n26#1:61,2\n*E\n"})
public final class ExternalContentProvider extends Provider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Context f30020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f30021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f30022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final List<AppSignature> f30023g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalContentProvider(@NotNull Context context, @NotNull String group, @NotNull String scope, @NotNull List<AppSignature> allowedApps) {
        super(group);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(allowedApps, "allowedApps");
        this.f30020d = context;
        this.f30021e = group;
        this.f30022f = scope;
        this.f30023g = allowedApps;
    }

    @Override // com.bbva.ethermobilesdk.sharedstorage.provider.Provider
    @NotNull
    public SharedStorageResult<StorageEntry> read(@NotNull String key) {
        StorageEntry entry;
        Context context = this.f30020d;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            for (ProviderInfo providerInfo : ContextKt.queryContentProvider(context, this.f30021e, this.f30023g)) {
                ContentResolver contentResolver = context.getContentResolver();
                Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
                String authority = providerInfo.authority;
                Intrinsics.checkNotNullExpressionValue(authority, "authority");
                CursorEntry cursorEntry = ContentResolverKt.get(contentResolver, authority, key, this.f30022f);
                if (cursorEntry != null && (entry = cursorEntry.getEntry()) != null) {
                    reversePut(key, entry);
                    if (entry.getValue() != null) {
                        return new SharedStorageResult.Success(entry);
                    }
                }
            }
            return new SharedStorageResult.Empty();
        } catch (Throwable th2) {
            return new SharedStorageResult.Error(th2);
        }
    }

    @Override // com.bbva.ethermobilesdk.sharedstorage.provider.Provider
    @NotNull
    public Map<String, StorageEntry> readAll() {
        return q.emptyMap();
    }

    @Override // com.bbva.ethermobilesdk.sharedstorage.provider.Provider
    @NotNull
    public SharedStorageResult<Unit> write(@NotNull String key, @NotNull StorageEntry value) {
        Context context = this.f30020d;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            ProviderInfo providerInfo = (ProviderInfo) CollectionsKt___CollectionsKt.firstOrNull((List) ContextKt.queryContentProvider(context, this.f30021e, this.f30023g));
            if (providerInfo != null) {
                ContentResolver contentResolver = context.getContentResolver();
                Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
                String authority = providerInfo.authority;
                Intrinsics.checkNotNullExpressionValue(authority, "authority");
                ContentResolverKt.requestInsertion(contentResolver, authority, this.f30022f, key, value);
            }
            return new SharedStorageResult.Success(Unit.INSTANCE);
        } catch (Throwable th2) {
            return new SharedStorageResult.Error(th2);
        }
    }
}
