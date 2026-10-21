package com.bbva.component.dm.storage.domain.interactor;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.component.dm.storage.Mappable;
import com.bbva.component.dm.storage.data.SharedPreferencesRepository;
import com.bbva.component.dm.storage.domain.model.Entry;
import com.bbva.component.dm.storage.domain.model.EntryKey;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GetEntryUseCases.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0003B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0014¨\u0006\f"}, d2 = {"Lcom/bbva/component/dm/storage/domain/interactor/GetObjectUseCase;", "Lcom/bbva/component/dm/storage/Mappable;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/cells/component/kit/datamanager/domain/usecase/UseCase;", "Lcom/bbva/component/dm/storage/domain/model/Entry;", "Lcom/bbva/component/dm/storage/domain/model/EntryKey;", "entryKey", NotificationCompat.CATEGORY_CALL, "Lcom/bbva/component/dm/storage/data/SharedPreferencesRepository;", "repository", "<init>", "(Lcom/bbva/component/dm/storage/data/SharedPreferencesRepository;)V", "component-dm-storage_release"}, k = 1, mv = {1, 4, 0})
public final class GetObjectUseCase<T extends Mappable> extends UseCase<Entry<? extends T>, EntryKey<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SharedPreferencesRepository f28147d;

    public GetObjectUseCase(@NotNull SharedPreferencesRepository sharedPreferencesRepository) {
        this.f28147d = sharedPreferencesRepository;
    }

    @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase
    @NotNull
    public Entry<T> call(@NotNull EntryKey<T> entryKey) {
        return new Entry<>(entryKey.getKey(), this.f28147d.getObject(entryKey));
    }
}
