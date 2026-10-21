package com.bbva.ethermobilesdk.securesharing.storage.connector;

import android.content.Context;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.ethermobilesdk.securesharing.database.EntryTable;
import com.bbva.ethermobilesdk.securesharing.database.Table;
import com.bbva.ethermobilesdk.securesharing.extension.ContextKt;
import com.bbva.ethermobilesdk.securesharing.extension.ExceptionKt;
import com.bbva.ethermobilesdk.securesharing.extension.UriKt;
import com.bbva.ethermobilesdk.securesharing.model.Entry;
import com.bbva.ethermobilesdk.securesharing.storage.ProviderConnector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EntryConnector.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004R\u001a\u0010\u0012\u001a\u00020\r8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00048\u0014X\u0094D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/bbva/ethermobilesdk/securesharing/storage/connector/EntryConnector;", "Lcom/bbva/ethermobilesdk/securesharing/storage/ProviderConnector;", "Lcom/bbva/ethermobilesdk/securesharing/model/Entry;", "", "", "keys", "master", "", "copyFrom", AnalyticsConstants.Key.ITEM, "alternativeAuthority", "", "update", "Lcom/bbva/ethermobilesdk/securesharing/database/Table;", "f", "Lcom/bbva/ethermobilesdk/securesharing/database/Table;", "getTable", "()Lcom/bbva/ethermobilesdk/securesharing/database/Table;", "table", "g", "Ljava/lang/String;", "getIndexColumn", "()Ljava/lang/String;", "indexColumn", "Landroid/content/Context;", "context", "authority", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "securesharing_release"}, k = 1, mv = {1, 5, 1})
public final class EntryConnector extends ProviderConnector<Entry> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Context f29977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f29978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final EntryTable f29979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String indexColumn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntryConnector(@NotNull Context context, @NotNull String authority) {
        super(context, authority, EntryMapper.INSTANCE);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(authority, "authority");
        this.f29977d = context;
        this.f29978e = authority;
        this.f29979f = EntryTable.INSTANCE;
        this.indexColumn = "key";
    }

    public static /* synthetic */ void update$default(EntryConnector entryConnector, Entry entry, String str, int i10, Object obj) throws Exception {
        if ((i10 & 2) != 0) {
            str = null;
        }
        entryConnector.update(entry, str);
    }

    @NotNull
    public final List<Entry> copyFrom(@NotNull String master) throws Exception {
        Intrinsics.checkNotNullParameter(master, "master");
        List<Entry> all = getAll(master);
        createAll(all);
        return all;
    }

    @Override // com.bbva.ethermobilesdk.securesharing.storage.ProviderConnector
    @NotNull
    public String getIndexColumn() {
        return this.indexColumn;
    }

    @Override // com.bbva.ethermobilesdk.securesharing.storage.ProviderConnector
    @NotNull
    public Table getTable() {
        return this.f29979f;
    }

    @Override // com.bbva.ethermobilesdk.securesharing.storage.ProviderConnector
    @NotNull
    public Set<String> keys() {
        List all$default = ProviderConnector.getAll$default(this, null, 1, null);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(all$default, 10));
        Iterator it = all$default.iterator();
        while (it.hasNext()) {
            arrayList.add(((Entry) it.next()).getKey());
        }
        return CollectionsKt___CollectionsKt.toSet(arrayList);
    }

    public final void update(@NotNull Entry item, @Nullable String alternativeAuthority) throws Exception {
        Intrinsics.checkNotNullParameter(item, "item");
        if (alternativeAuthority == null) {
            alternativeAuthority = this.f29978e;
        }
        Context context = this.f29977d;
        ContextKt.verifyAuthority(context, alternativeAuthority);
        try {
            if (context.getContentResolver().update(UriKt.contentUri(alternativeAuthority, getTable().getPath()), EntryMapper.INSTANCE.toContentValues(item), Intrinsics.stringPlus(getIndexColumn(), "=?"), new String[]{item.getKey()}) != 0) {
                return;
            }
            ExceptionKt.throwError$default("Could not save entry [" + item + AbstractJsonLexerKt.END_LIST, null, 2, null);
            throw new KotlinNothingValueException();
        } catch (Exception e5) {
            ExceptionKt.throwError("Error updating entry [" + item + AbstractJsonLexerKt.END_LIST, e5);
            throw new KotlinNothingValueException();
        }
    }
}
