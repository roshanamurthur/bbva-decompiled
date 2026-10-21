package com.bbva.slidemenuview.repository.datasource;

import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.slidemenuview.domain.model.MenuItems;
import com.google.gson.Gson;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StorageMenuDataSource.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0005¨\u0006\r"}, d2 = {"Lcom/bbva/slidemenuview/repository/datasource/StorageMenuDataSource;", "", "Lcom/bbva/slidemenuview/domain/model/MenuItems;", "get", "menuItems", "", "save", RemoveCommand.ID, "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;)V", "Companion", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nStorageMenuDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StorageMenuDataSource.kt\ncom/bbva/slidemenuview/repository/datasource/StorageMenuDataSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,32:1\n1#2:33\n*E\n"})
public final class StorageMenuDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f36779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f36780b;

    /* JADX INFO: compiled from: StorageMenuDataSource.kt */
    public static final class a extends Lambda implements Function0<Gson> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f36781p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Gson invoke() {
            return new Gson();
        }
    }

    public StorageMenuDataSource(@NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f36779a = storage;
        this.f36780b = LazyKt__LazyJVMKt.lazy(a.f36781p0);
    }

    @Nullable
    public final MenuItems get() {
        Object objM5535constructorimpl;
        Object objM5535constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(MainStorage.getString$default(this.f36779a, LocalStorageConstantsKt.KEY_MENU_ITEMS, null, false, null, 12, null));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
            try {
                String str = (String) objM5535constructorimpl;
                objM5535constructorimpl2 = Result.m5535constructorimpl(str != null ? (MenuItems) ((Gson) this.f36780b.getValue()).fromJson(str, MenuItems.class) : null);
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.INSTANCE;
                objM5535constructorimpl = ResultKt.createFailure(th3);
                objM5535constructorimpl2 = Result.m5535constructorimpl(objM5535constructorimpl);
            }
        } else {
            objM5535constructorimpl2 = Result.m5535constructorimpl(objM5535constructorimpl);
        }
        return (MenuItems) (Result.m5540isFailureimpl(objM5535constructorimpl2) ? null : objM5535constructorimpl2);
    }

    public final void remove() {
        MainStorage.put$default(this.f36779a, LocalStorageConstantsKt.KEY_MENU_ITEMS, null, false, null, 12, null);
    }

    public final void save(@NotNull MenuItems menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        MainStorage.put$default(this.f36779a, LocalStorageConstantsKt.KEY_MENU_ITEMS, ((Gson) this.f36780b.getValue()).toJson(menuItems), false, null, 12, null);
    }
}
