package com.bbva.glomohybrid.provider.module;

import android.content.SharedPreferences;
import com.bbva.component.dm.storage.PrefsStorageDataManager;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.user.domain.handler.MigratorHandler;
import com.bbva.glomo.user.domain.handler.migration.UserRememberedMigrationV0;
import com.bbva.glomo.user.domain.handler.migration.UserRememberedMigrationV1;
import com.bbva.glomo.user.domain.handler.migration.UserRememberedMigrationV2;
import com.bbva.glomo.user.domain.usecase.MigrateRememberedUserUseCase;
import com.bbva.glomo.user.repository.datasource.RememberedUserDataSource;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$useCase$1$9\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,298:1\n129#2,5:299\n129#2,5:304\n129#2,5:309\n*S KotlinDebug\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$useCase$1$9\n*L\n193#1:299,5\n194#1:304,5\n195#1:309,5\n*E\n"})
public final class b2 extends Lambda implements Function2<Scope, ParametersHolder, MigrateRememberedUserUseCase> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final b2 f34012p0 = new b2(2);

    @Override // kotlin.jvm.functions.Function2
    public final MigrateRememberedUserUseCase invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new MigrateRememberedUserUseCase(CollectionsKt__CollectionsKt.listOf((Object[]) new MigratorHandler[]{new UserRememberedMigrationV0(ModuleExtKt.androidContext(single), (RememberedUserDataSource) single.get(Reflection.getOrCreateKotlinClass(RememberedUserDataSource.class), null, null), PrefsStorageDataManager.ID), new UserRememberedMigrationV1((MainStorage) single.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null)), new UserRememberedMigrationV2((SharedPreferences) single.get(Reflection.getOrCreateKotlinClass(SharedPreferences.class), null, null), (MainStorage) single.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null))}), null, 2, null);
    }
}
