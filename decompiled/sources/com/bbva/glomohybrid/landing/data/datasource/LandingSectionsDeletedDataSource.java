package com.bbva.glomohybrid.landing.data.datasource;

import bk.d;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomohybrid.landing.data.model.LandingSectionDeletedDataModel;
import com.bbva.glomohybrid.landing.data.model.LandingSectionItemDeletedDataModel;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingSectionsDeletedDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002J\u0016\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002¨\u0006\u0012"}, d2 = {"Lcom/bbva/glomohybrid/landing/data/datasource/LandingSectionsDeletedDataSource;", "", "", "key", "Lcom/bbva/glomohybrid/landing/data/model/LandingSectionDeletedDataModel;", "get", "Lcom/bbva/glomohybrid/landing/data/model/LandingSectionItemDeletedDataModel;", "sectionItem", "", "add", "sectionHash", RemoveCommand.ID, "cacheRemovedDate", ClearCommand.ID, "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingSectionsDeletedDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingSectionsDeletedDataSource.kt\ncom/bbva/glomohybrid/landing/data/datasource/LandingSectionsDeletedDataSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n1#2:61\n350#3,7:62\n*S KotlinDebug\n*F\n+ 1 LandingSectionsDeletedDataSource.kt\ncom/bbva/glomohybrid/landing/data/datasource/LandingSectionsDeletedDataSource\n*L\n33#1:62,7\n*E\n"})
public final class LandingSectionsDeletedDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f32527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Json f32528b;

    /* JADX INFO: compiled from: LandingSectionsDeletedDataSource.kt */
    public static final class a extends Lambda implements Function1<JsonBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f32529p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(JsonBuilder jsonBuilder) {
            JsonBuilder Json = jsonBuilder;
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setIgnoreUnknownKeys(true);
            return Unit.INSTANCE;
        }
    }

    public LandingSectionsDeletedDataSource(@NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f32527a = storage;
        this.f32528b = JsonKt.Json$default(null, a.f32529p0, 1, null);
    }

    public final void add(@NotNull String key, @NotNull LandingSectionItemDeletedDataModel sectionItem) {
        List listListOf;
        LandingSectionItemDeletedDataModel landingSectionItemDeletedDataModel;
        Object next;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sectionItem, "sectionItem");
        LandingSectionDeletedDataModel landingSectionDeletedDataModel = get(key);
        if (landingSectionDeletedDataModel != null) {
            List<LandingSectionItemDeletedDataModel> items = landingSectionDeletedDataModel.getItems();
            String hash = sectionItem.getHash();
            if (items != null) {
                Iterator<T> it = items.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((LandingSectionItemDeletedDataModel) next).getHash(), hash));
                landingSectionItemDeletedDataModel = (LandingSectionItemDeletedDataModel) next;
            } else {
                landingSectionItemDeletedDataModel = null;
            }
            if (landingSectionItemDeletedDataModel != null) {
                return;
            }
        } else {
            landingSectionDeletedDataModel = new LandingSectionDeletedDataModel((String) null, (List) null, 3, (DefaultConstructorMarker) null);
        }
        List<LandingSectionItemDeletedDataModel> items2 = landingSectionDeletedDataModel.getItems();
        if (items2 == null || (listListOf = CollectionsKt___CollectionsKt.toMutableList((Collection) items2)) == null) {
            listListOf = d.listOf(sectionItem);
        } else {
            listListOf.add(sectionItem);
        }
        MainStorage.put$default(this.f32527a, key, this.f32528b.encodeToString(LandingSectionDeletedDataModel.INSTANCE.serializer(), LandingSectionDeletedDataModel.copy$default(landingSectionDeletedDataModel, null, listListOf, 1, null)), false, null, 12, null);
    }

    public final void clear(@NotNull String key, @NotNull String cacheRemovedDate) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(cacheRemovedDate, "cacheRemovedDate");
        MainStorage mainStorage = this.f32527a;
        LandingSectionDeletedDataModel landingSectionDeletedDataModel = new LandingSectionDeletedDataModel(cacheRemovedDate, (List) null, 2, (DefaultConstructorMarker) null);
        MainStorage.put$default(mainStorage, key, this.f32528b.encodeToString(LandingSectionDeletedDataModel.INSTANCE.serializer(), landingSectionDeletedDataModel), false, null, 12, null);
    }

    @Nullable
    public final LandingSectionDeletedDataModel get(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String string$default = MainStorage.getString$default(this.f32527a, key, null, false, null, 14, null);
        if (string$default == null) {
            return null;
        }
        return (LandingSectionDeletedDataModel) this.f32528b.decodeFromString(LandingSectionDeletedDataModel.INSTANCE.serializer(), string$default);
    }

    public final void remove(@NotNull String key, @NotNull String sectionHash) {
        Integer numValueOf;
        List mutableList;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sectionHash, "sectionHash");
        LandingSectionDeletedDataModel landingSectionDeletedDataModel = get(key);
        if (landingSectionDeletedDataModel == null) {
            landingSectionDeletedDataModel = new LandingSectionDeletedDataModel((String) null, (List) null, 3, (DefaultConstructorMarker) null);
        }
        List<LandingSectionItemDeletedDataModel> items = landingSectionDeletedDataModel.getItems();
        if (items != null) {
            Iterator<LandingSectionItemDeletedDataModel> it = items.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                } else if (Intrinsics.areEqual(it.next().getHash(), sectionHash)) {
                    break;
                } else {
                    i10++;
                }
            }
            numValueOf = Integer.valueOf(i10);
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            List<LandingSectionItemDeletedDataModel> items2 = landingSectionDeletedDataModel.getItems();
            if (items2 == null || (mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) items2)) == null) {
                mutableList = null;
            } else {
                mutableList.remove(iIntValue);
            }
            MainStorage.put$default(this.f32527a, key, this.f32528b.encodeToString(LandingSectionDeletedDataModel.INSTANCE.serializer(), LandingSectionDeletedDataModel.copy$default(landingSectionDeletedDataModel, null, mutableList, 1, null)), false, null, 12, null);
        }
    }
}
