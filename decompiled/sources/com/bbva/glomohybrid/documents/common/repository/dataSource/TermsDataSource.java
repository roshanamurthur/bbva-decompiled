package com.bbva.glomohybrid.documents.common.repository.dataSource;

import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomohybrid.documents.common.model.TermsDataModel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TermsDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0007¨\u0006\u000f"}, d2 = {"Lcom/bbva/glomohybrid/documents/common/repository/dataSource/TermsDataSource;", "", "", "Lcom/bbva/glomohybrid/documents/common/model/TermsDataModel;", "terms", "", "save", "", "name", "getByName", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;)V", "Companion", "gl-documents_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTermsDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TermsDataSource.kt\ncom/bbva/glomohybrid/documents/common/repository/dataSource/TermsDataSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class TermsDataSource {

    @NotNull
    public static final String KEY = "termsAndConditions";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f32088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f32089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type f32090c;

    /* JADX INFO: compiled from: TermsDataSource.kt */
    public static final class a extends Lambda implements Function0<Gson> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f32091p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Gson invoke() {
            return new Gson();
        }
    }

    public TermsDataSource(@NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f32088a = storage;
        this.f32089b = LazyKt__LazyJVMKt.lazy(a.f32091p0);
        this.f32090c = new TypeToken<List<? extends TermsDataModel>>() { // from class: com.bbva.glomohybrid.documents.common.repository.dataSource.TermsDataSource$type$1
        }.getType();
    }

    @Nullable
    public final TermsDataModel getByName(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String string$default = MainStorage.getString$default(this.f32088a, "termsAndConditions", null, false, null, 12, null);
        Object obj = null;
        List listEmptyList = string$default != null ? (List) ((Gson) this.f32089b.getValue()).fromJson(string$default, this.f32090c) : null;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        for (Object obj2 : listEmptyList) {
            if (Intrinsics.areEqual(((TermsDataModel) obj2).getName(), name)) {
                obj = obj2;
                break;
            }
        }
        return (TermsDataModel) obj;
    }

    public final void save(@NotNull List<TermsDataModel> terms) {
        Intrinsics.checkNotNullParameter(terms, "terms");
        MainStorage.put$default(this.f32088a, "termsAndConditions", ((Gson) this.f32089b.getValue()).toJson(terms), false, null, 12, null);
    }
}
