package com.bbva.component.dm.storage.domain.interactor;

import androidx.core.app.NotificationCompat;
import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.component.dm.storage.data.SharedPreferencesRepository;
import com.bbva.component.dm.storage.domain.model.Entry;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SaveEntryUseCases.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u0014¨\u0006\f"}, d2 = {"Lcom/bbva/component/dm/storage/domain/interactor/SaveStringSetUseCase;", "Lcom/bbva/cells/component/kit/datamanager/domain/usecase/UseCase;", "", "Lcom/bbva/component/dm/storage/domain/model/Entry;", "", "", "entry", NotificationCompat.CATEGORY_CALL, "Lcom/bbva/component/dm/storage/data/SharedPreferencesRepository;", "repository", "<init>", "(Lcom/bbva/component/dm/storage/data/SharedPreferencesRepository;)V", "component-dm-storage_release"}, k = 1, mv = {1, 4, 0})
public final class SaveStringSetUseCase extends UseCase<Unit, Entry<? extends Set<? extends String>>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SharedPreferencesRepository f28158d;

    public SaveStringSetUseCase(@NotNull SharedPreferencesRepository sharedPreferencesRepository) {
        this.f28158d = sharedPreferencesRepository;
    }

    @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase
    public /* bridge */ /* synthetic */ Unit call(Entry<? extends Set<? extends String>> entry) {
        call2((Entry<? extends Set<String>>) entry);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
    public void call2(@NotNull Entry<? extends Set<String>> entry) {
        this.f28158d.saveStringSet(entry);
    }
}
