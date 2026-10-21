package com.bbva.component.dm.storage.domain.interactor;

import androidx.core.app.NotificationCompat;
import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.component.dm.storage.data.SharedPreferencesRepository;
import com.bbva.component.dm.storage.domain.model.Entry;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SaveEntryUseCases.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0006\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0014¨\u0006\u000b"}, d2 = {"Lcom/bbva/component/dm/storage/domain/interactor/SaveFloatUseCase;", "Lcom/bbva/cells/component/kit/datamanager/domain/usecase/UseCase;", "", "Lcom/bbva/component/dm/storage/domain/model/Entry;", "", "entry", NotificationCompat.CATEGORY_CALL, "Lcom/bbva/component/dm/storage/data/SharedPreferencesRepository;", "repository", "<init>", "(Lcom/bbva/component/dm/storage/data/SharedPreferencesRepository;)V", "component-dm-storage_release"}, k = 1, mv = {1, 4, 0})
public final class SaveFloatUseCase extends UseCase<Unit, Entry<? extends Float>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SharedPreferencesRepository f28151d;

    public SaveFloatUseCase(@NotNull SharedPreferencesRepository sharedPreferencesRepository) {
        this.f28151d = sharedPreferencesRepository;
    }

    @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase
    public /* bridge */ /* synthetic */ Unit call(Entry<? extends Float> entry) {
        call2((Entry<Float>) entry);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
    public void call2(@NotNull Entry<Float> entry) {
        this.f28151d.saveFloat(entry);
    }
}
