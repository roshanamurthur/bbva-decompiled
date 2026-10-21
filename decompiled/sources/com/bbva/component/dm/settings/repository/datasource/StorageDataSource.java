package com.bbva.component.dm.settings.repository.datasource;

import com.bbva.component.dm.settings.domain.model.AppSettings;
import com.bbva.component.dm.settings.infraestructure.AppSettingsMapper;
import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomo.storage.MainStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StorageDataSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¨\u0006\u000e"}, d2 = {"Lcom/bbva/component/dm/settings/repository/datasource/StorageDataSource;", "", "Lcom/bbva/component/dm/settings/domain/model/AppSettings;", "appSettings", "", "save", "get", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "Lcom/bbva/component/dm/settings/infraestructure/AppSettingsMapper;", "mapper", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;Lcom/bbva/component/dm/settings/infraestructure/AppSettingsMapper;)V", "Companion", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nStorageDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StorageDataSource.kt\ncom/bbva/component/dm/settings/repository/datasource/StorageDataSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1#2:25\n*E\n"})
public final class StorageDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f28048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AppSettingsMapper f28049b;

    public StorageDataSource(@NotNull MainStorage storage, @NotNull AppSettingsMapper mapper) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f28048a = storage;
        this.f28049b = mapper;
    }

    @Nullable
    public final AppSettings get() {
        String string$default = MainStorage.getString$default(this.f28048a, LocalStorageConstantsKt.KEY_APP_SETTINGS, null, false, null, 12, null);
        if (string$default != null) {
            return this.f28049b.map(string$default);
        }
        return null;
    }

    public final void save(@NotNull AppSettings appSettings) {
        Intrinsics.checkNotNullParameter(appSettings, "appSettings");
        MainStorage.put$default(this.f28048a, LocalStorageConstantsKt.KEY_APP_SETTINGS, this.f28049b.convert(appSettings), false, null, 12, null);
    }
}
