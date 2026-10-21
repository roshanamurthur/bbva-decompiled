package com.bbva.glomohybrid.provider.module;

import com.bbva.component.dm.storage.PrefsStorageDataManager;
import com.bbva.glomo.localstorage.LocalStorageCipherFactory;
import com.bbva.glomo.storage.local.StorageCoordinator;
import com.bbva.localstorage.LocalStorage;
import com.bbva.localstorage.storage.EncryptedSharedPreferencesStorage;
import com.bbva.localstorage.storage.SharedPreferencesStorage;
import com.bbva.localstorage.storage.Storage;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class u0 extends Lambda implements Function2<Scope, ParametersHolder, Storage> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final u0 f34175p0 = new u0(2);

    @Override // kotlin.jvm.functions.Function2
    public final Storage invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        StorageCoordinator storageCoordinator = new StorageCoordinator(new SharedPreferencesStorage(ModuleExtKt.androidContext(single), PrefsStorageDataManager.ID, false, LocalStorageCipherFactory.INSTANCE.create(ModuleExtKt.androidContext(single)), false, 20, null), new EncryptedSharedPreferencesStorage(ModuleExtKt.androidContext(single), null, false, false, 14, null));
        LocalStorage.INSTANCE.warmUp(ModuleExtKt.androidApplication(single), (30 & 2) != 0 ? null : null, (30 & 4) != 0 ? false : false, (30 & 8) != 0 ? null : storageCoordinator, (30 & 16) != 0 ? false : false);
        return storageCoordinator;
    }
}
