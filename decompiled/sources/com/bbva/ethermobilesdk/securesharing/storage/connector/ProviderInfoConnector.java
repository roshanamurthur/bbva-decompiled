package com.bbva.ethermobilesdk.securesharing.storage.connector;

import android.content.Context;
import androidx.datastore.preferences.protobuf.q;
import com.bbva.ethermobilesdk.securesharing.database.InfoTable;
import com.bbva.ethermobilesdk.securesharing.database.Table;
import com.bbva.ethermobilesdk.securesharing.extension.ContextKt;
import com.bbva.ethermobilesdk.securesharing.extension.ExceptionKt;
import com.bbva.ethermobilesdk.securesharing.extension.LoggerKt;
import com.bbva.ethermobilesdk.securesharing.model.ProviderInfo;
import com.bbva.ethermobilesdk.securesharing.model.ProviderStatus;
import com.bbva.ethermobilesdk.securesharing.storage.ProviderConnector;
import dk.e;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ProviderInfoConnector.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00048\u0014X\u0094D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/bbva/ethermobilesdk/securesharing/storage/connector/ProviderInfoConnector;", "Lcom/bbva/ethermobilesdk/securesharing/storage/ProviderConnector;", "Lcom/bbva/ethermobilesdk/securesharing/model/ProviderInfo;", "", "", "keys", "", "deleteAllFromMaster", "", "hasProvider", "initPartners", "findMaster", "Lcom/bbva/ethermobilesdk/securesharing/database/Table;", "f", "Lcom/bbva/ethermobilesdk/securesharing/database/Table;", "getTable", "()Lcom/bbva/ethermobilesdk/securesharing/database/Table;", "table", "g", "Ljava/lang/String;", "getIndexColumn", "()Ljava/lang/String;", "indexColumn", "Landroid/content/Context;", "context", "authority", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "securesharing_release"}, k = 1, mv = {1, 5, 1})
public final class ProviderInfoConnector extends ProviderConnector<ProviderInfo> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Context f29981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f29982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final InfoTable f29983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String indexColumn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProviderInfoConnector(@NotNull Context context, @NotNull String authority) {
        super(context, authority, ProviderInfoMapper.INSTANCE);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(authority, "authority");
        this.f29981d = context;
        this.f29982e = authority;
        this.f29983f = InfoTable.INSTANCE;
        this.indexColumn = InfoTable.AUTHORITY;
    }

    public final void deleteAllFromMaster() {
        deleteAll(findMaster());
    }

    @NotNull
    public final String findMaster() throws Exception {
        String str = this.f29982e;
        try {
            List all$default = ProviderConnector.getAll$default(this, null, 1, null);
            if (all$default.isEmpty()) {
                ExceptionKt.throwError$default("Could not found authorities info", null, 2, null);
                throw new KotlinNothingValueException();
            }
            for (ProviderInfo providerInfo : CollectionsKt___CollectionsKt.sortedWith(all$default, new Comparator<T>() { // from class: com.bbva.ethermobilesdk.securesharing.storage.connector.ProviderInfoConnector$findMaster$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return e.compareValues(Long.valueOf(((ProviderInfo) t10).getPriority()), Long.valueOf(((ProviderInfo) t11).getPriority()));
                }
            })) {
                if (Intrinsics.areEqual(providerInfo.getAuthority(), str)) {
                    LoggerKt.log("Caller provider is the master");
                    return str;
                }
                if (ContextKt.providerStatus(this.f29981d, providerInfo.getAuthority()) == ProviderStatus.OK) {
                    return providerInfo.getAuthority();
                }
                try {
                    ProviderConnector.delete$default(this, getTable(), providerInfo.getAuthority(), null, null, 12, null);
                } catch (Exception unused) {
                    LoggerKt.log("Could not remove useless Provider Info entry [" + providerInfo.getAuthority() + AbstractJsonLexerKt.END_LIST);
                }
            }
            throw q.d("Could not found Master Provider Info", null, 2, null);
        } catch (Exception e5) {
            ExceptionKt.throwError("There was an error getting the master provider", e5);
            throw new KotlinNothingValueException();
        }
    }

    @Override // com.bbva.ethermobilesdk.securesharing.storage.ProviderConnector
    @NotNull
    public String getIndexColumn() {
        return this.indexColumn;
    }

    @Override // com.bbva.ethermobilesdk.securesharing.storage.ProviderConnector
    @NotNull
    public Table getTable() {
        return this.f29983f;
    }

    public final boolean hasProvider() {
        return contains(this.f29982e);
    }

    public final void initPartners() {
        Object next;
        ProviderInfo providerInfo;
        Object objM5535constructorimpl;
        Context context = this.f29981d;
        String str = this.f29982e;
        List<android.content.pm.ProviderInfo> listProviders = ContextKt.providers(context, str);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listProviders, 10));
        Iterator<T> it = listProviders.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            android.content.pm.ProviderInfo providerInfo2 = (android.content.pm.ProviderInfo) it.next();
            try {
                Result.Companion companion = Result.INSTANCE;
                String str2 = providerInfo2.authority;
                Intrinsics.checkNotNullExpressionValue(str2, "it.authority");
                objM5535constructorimpl = Result.m5535constructorimpl(get(str2, providerInfo2.authority));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            if (!Result.m5540isFailureimpl(objM5535constructorimpl)) {
                obj = objM5535constructorimpl;
            }
            arrayList.add((ProviderInfo) obj);
        }
        List listFilterNotNull = CollectionsKt___CollectionsKt.filterNotNull(arrayList);
        try {
            if (listFilterNotNull.isEmpty()) {
                providerInfo = new ProviderInfo(str, 0L);
            } else {
                Iterator it2 = listFilterNotNull.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        long priority = ((ProviderInfo) next).getPriority();
                        do {
                            Object next2 = it2.next();
                            long priority2 = ((ProviderInfo) next2).getPriority();
                            if (priority < priority2) {
                                next = next2;
                                priority = priority2;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next = null;
                }
                Intrinsics.checkNotNull(next);
                long priority3 = ((ProviderInfo) next).getPriority() + 1;
                createAll(listFilterNotNull);
                providerInfo = new ProviderInfo(str, priority3);
            }
            ProviderConnector.create$default(this, providerInfo, null, 2, null);
        } catch (Exception e5) {
            ExceptionKt.throwError("Could not generate partner providers info data", e5);
            throw new KotlinNothingValueException();
        }
    }

    @Override // com.bbva.ethermobilesdk.securesharing.storage.ProviderConnector
    @NotNull
    public Set<String> keys() {
        List all$default = ProviderConnector.getAll$default(this, null, 1, null);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(all$default, 10));
        Iterator it = all$default.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProviderInfo) it.next()).getAuthority());
        }
        return CollectionsKt___CollectionsKt.toSet(arrayList);
    }
}
