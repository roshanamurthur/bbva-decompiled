package com.bbva.component.dm.storage.domain.interactor;

import androidx.core.app.NotificationCompat;
import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.component.dm.storage.Mappable;
import com.bbva.component.dm.storage.data.SharedPreferencesRepository;
import com.bbva.component.dm.storage.domain.model.Entry;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SaveEntryUseCases.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00040\u00030\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0007\u001a\u00020\u00022\u0016\u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00040\u0003H\u0014¨\u0006\f"}, d2 = {"Lcom/bbva/component/dm/storage/domain/interactor/SaveListMappableUseCase;", "Lcom/bbva/cells/component/kit/datamanager/domain/usecase/UseCase;", "", "Lcom/bbva/component/dm/storage/domain/model/Entry;", "", "Lcom/bbva/component/dm/storage/Mappable;", "entry", NotificationCompat.CATEGORY_CALL, "Lcom/bbva/component/dm/storage/data/SharedPreferencesRepository;", "repository", "<init>", "(Lcom/bbva/component/dm/storage/data/SharedPreferencesRepository;)V", "component-dm-storage_release"}, k = 1, mv = {1, 4, 0})
public final class SaveListMappableUseCase extends UseCase<Unit, Entry<? extends List<? extends Mappable>>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SharedPreferencesRepository f28154d;

    public SaveListMappableUseCase(@NotNull SharedPreferencesRepository sharedPreferencesRepository) {
        this.f28154d = sharedPreferencesRepository;
    }

    @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase
    public /* bridge */ /* synthetic */ Unit call(Entry<? extends List<? extends Mappable>> entry) {
        call2(entry);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
    public void call2(@NotNull Entry<? extends List<? extends Mappable>> entry) {
        this.f28154d.saveListMappable(entry);
    }
}
