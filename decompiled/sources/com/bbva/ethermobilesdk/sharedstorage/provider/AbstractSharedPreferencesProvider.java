package com.bbva.ethermobilesdk.sharedstorage.provider;

import bk.q;
import com.bbva.ethermobilesdk.sharedstorage.model.SharedStorageResult;
import com.bbva.ethermobilesdk.sharedstorage.model.StorageEntry;
import com.bbva.localstorage.storage.Storage;
import com.google.gson.Gson;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AbstractSharedPreferencesProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0014J\u001c\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00050\u00050\nH\u0014R\u001a\u0010\u0012\u001a\u00020\r8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/bbva/ethermobilesdk/sharedstorage/provider/AbstractSharedPreferencesProvider;", "Lcom/bbva/ethermobilesdk/sharedstorage/provider/Provider;", "", "key", "Lcom/bbva/ethermobilesdk/sharedstorage/model/SharedStorageResult;", "Lcom/bbva/ethermobilesdk/sharedstorage/model/StorageEntry;", "read", "value", "", "write", "", "kotlin.jvm.PlatformType", "readAll", "Lcom/bbva/localstorage/storage/Storage;", "d", "Lcom/bbva/localstorage/storage/Storage;", "getPreferences", "()Lcom/bbva/localstorage/storage/Storage;", "preferences", "group", "<init>", "(Ljava/lang/String;Lcom/bbva/localstorage/storage/Storage;)V", "shared-storage_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAbstractSharedPreferencesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSharedPreferencesProvider.kt\ncom/bbva/ethermobilesdk/sharedstorage/provider/AbstractSharedPreferencesProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,45:1\n1549#2:46\n1620#2,3:47\n766#2:50\n857#2,2:51\n1549#2:53\n1620#2,3:54\n*S KotlinDebug\n*F\n+ 1 AbstractSharedPreferencesProvider.kt\ncom/bbva/ethermobilesdk/sharedstorage/provider/AbstractSharedPreferencesProvider\n*L\n40#1:46\n40#1:47,3\n41#1:50\n41#1:51,2\n42#1:53\n42#1:54,3\n*E\n"})
public abstract class AbstractSharedPreferencesProvider extends Provider {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Storage preferences;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Gson f30019e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractSharedPreferencesProvider(@NotNull String group, @NotNull Storage preferences) {
        super(group);
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.preferences = preferences;
        this.f30019e = new Gson();
    }

    @NotNull
    public final Storage getPreferences() {
        return this.preferences;
    }

    @Override // com.bbva.ethermobilesdk.sharedstorage.provider.Provider
    @NotNull
    public SharedStorageResult<StorageEntry> read(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String string$default = Storage.DefaultImpls.getString$default(this.preferences, key, null, false, 4, null);
        if (string$default == null) {
            return new SharedStorageResult.Empty();
        }
        StorageEntry storageEntry = (StorageEntry) this.f30019e.fromJson((Reader) new StringReader(string$default), StorageEntry.class);
        if (storageEntry.getValue() == null) {
            return new SharedStorageResult.Empty();
        }
        Intrinsics.checkNotNull(storageEntry);
        return new SharedStorageResult.Success(storageEntry);
    }

    @Override // com.bbva.ethermobilesdk.sharedstorage.provider.Provider
    @NotNull
    public Map<String, StorageEntry> readAll() {
        Set<String> setKeys = this.preferences.keys();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setKeys, 10));
        for (String str : setKeys) {
            arrayList.add(TuplesKt.to(str, Storage.DefaultImpls.getString$default(this.preferences, str, null, false, 4, null)));
        }
        ArrayList<Pair> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Pair) obj).getSecond() != null) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        for (Pair pair : arrayList2) {
            arrayList3.add(TuplesKt.to(pair.getFirst(), this.f30019e.fromJson((Reader) new StringReader((String) pair.getSecond()), StorageEntry.class)));
        }
        return q.toMap(arrayList3);
    }

    @Override // com.bbva.ethermobilesdk.sharedstorage.provider.Provider
    @NotNull
    public SharedStorageResult<Unit> write(@NotNull String key, @NotNull StorageEntry value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Storage.DefaultImpls.set$default(this.preferences, key, this.f30019e.toJson(value), false, 4, (Object) null);
        return new SharedStorageResult.Success(Unit.INSTANCE);
    }
}
