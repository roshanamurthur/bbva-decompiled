package com.bbva.glomohybrid.base.usecase.user;

import android.content.Context;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomoutils.usecase.UseCase;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MigrateWebPreferencesToLocalStorageUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/base/usecase/user/MigrateWebPreferencesToLocalStorageUseCase;", "Lcom/bbva/glomoutils/usecase/UseCase;", "", "execute", "Landroid/content/Context;", "context", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Landroid/content/Context;Lcom/bbva/glomo/storage/MainStorage;)V", "Companion", "Base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMigrateWebPreferencesToLocalStorageUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MigrateWebPreferencesToLocalStorageUseCase.kt\ncom/bbva/glomohybrid/base/usecase/user/MigrateWebPreferencesToLocalStorageUseCase\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n215#2,2:35\n1#3:37\n*S KotlinDebug\n*F\n+ 1 MigrateWebPreferencesToLocalStorageUseCase.kt\ncom/bbva/glomohybrid/base/usecase/user/MigrateWebPreferencesToLocalStorageUseCase\n*L\n14#1:35,2\n*E\n"})
public final class MigrateWebPreferencesToLocalStorageUseCase implements UseCase<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f31583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MainStorage f31584b;

    public MigrateWebPreferencesToLocalStorageUseCase(@NotNull Context context, @NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f31583a = context;
        this.f31584b = storage;
    }

    @Override // com.bbva.glomoutils.usecase.UseCase
    public /* bridge */ /* synthetic */ Unit execute() {
        execute2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: execute, reason: avoid collision after fix types in other method */
    public void execute2() {
        Context context = this.f31583a;
        Map<String, ?> all = context.getSharedPreferences("WebPreferences", 0).getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            MainStorage.put$default(this.f31584b, entry.getKey(), String.valueOf(entry.getValue()), false, null, 12, null);
        }
        Unit unit = Unit.INSTANCE;
        context.getSharedPreferences("WebPreferences", 0).edit().clear().apply();
    }
}
