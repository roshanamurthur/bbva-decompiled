package com.bbva.component.dm.storage.domain.interactor;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.component.dm.storage.Mappable;
import com.bbva.component.dm.storage.data.SharedPreferencesRepository;
import com.bbva.component.dm.storage.domain.model.Entry;
import com.bbva.component.dm.storage.domain.model.EntryKey;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GetEntryUseCases.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\"\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0003B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0014¨\u0006\r"}, d2 = {"Lcom/bbva/component/dm/storage/domain/interactor/GetListUseCase;", "Lcom/bbva/component/dm/storage/Mappable;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/cells/component/kit/datamanager/domain/usecase/UseCase;", "Lcom/bbva/component/dm/storage/domain/model/Entry;", "", "Lcom/bbva/component/dm/storage/domain/model/EntryKey;", "entryKey", NotificationCompat.CATEGORY_CALL, "Lcom/bbva/component/dm/storage/data/SharedPreferencesRepository;", "repository", "<init>", "(Lcom/bbva/component/dm/storage/data/SharedPreferencesRepository;)V", "component-dm-storage_release"}, k = 1, mv = {1, 4, 0})
public final class GetListUseCase<T extends Mappable> extends UseCase<Entry<? extends List<? extends T>>, EntryKey<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SharedPreferencesRepository f28144d;

    public GetListUseCase(@NotNull SharedPreferencesRepository sharedPreferencesRepository) {
        this.f28144d = sharedPreferencesRepository;
    }

    @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase
    @NotNull
    public Entry<List<T>> call(@NotNull EntryKey<T> entryKey) {
        return new Entry<>(entryKey.getKey(), this.f28144d.getList(entryKey));
    }
}
