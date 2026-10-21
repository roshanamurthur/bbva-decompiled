package com.bbva.component.dm.storage.domain.interactor;

import androidx.core.app.NotificationCompat;
import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.component.dm.storage.data.SharedPreferencesRepository;
import com.bbva.component.dm.storage.domain.model.Entry;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GetEntryUseCases.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00040\u00030\u0002\u0012\u0004\u0012\u00020\u00050\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\b\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00040\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0014¨\u0006\r"}, d2 = {"Lcom/bbva/component/dm/storage/domain/interactor/GetMapListUseCase;", "Lcom/bbva/cells/component/kit/datamanager/domain/usecase/UseCase;", "Lcom/bbva/component/dm/storage/domain/model/Entry;", "", "", "", "", "key", NotificationCompat.CATEGORY_CALL, "Lcom/bbva/component/dm/storage/data/SharedPreferencesRepository;", "repository", "<init>", "(Lcom/bbva/component/dm/storage/data/SharedPreferencesRepository;)V", "component-dm-storage_release"}, k = 1, mv = {1, 4, 0})
public final class GetMapListUseCase extends UseCase<Entry<? extends List<? extends Map<String, ? extends Object>>>, String> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SharedPreferencesRepository f28145d;

    public GetMapListUseCase(@NotNull SharedPreferencesRepository sharedPreferencesRepository) {
        this.f28145d = sharedPreferencesRepository;
    }

    @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase
    @NotNull
    public Entry<List<Map<String, Object>>> call(@NotNull String key) {
        return new Entry<>(key, this.f28145d.getMapList(key));
    }
}
