package com.bbva.component.dm.filefetcher.datamanager.provider;

import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.component.dm.filefetcher.data.model.FileRequest;
import com.bbva.component.dm.filefetcher.data.model.FileResponse;
import com.bbva.component.dm.filefetcher.data.model.StoreParams;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UseCaseProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/bbva/component/dm/filefetcher/datamanager/provider/UseCaseProvider;", "", "provide", "Lcom/bbva/cells/component/kit/datamanager/domain/usecase/UseCase;", "Lcom/bbva/component/dm/filefetcher/data/model/FileResponse;", "Lcom/bbva/component/dm/filefetcher/data/model/FileRequest;", "repositoryParams", "Lcom/bbva/component/dm/filefetcher/data/model/StoreParams;", "component-dm-filefetcher_release"}, k = 1, mv = {1, 1, 15})
public interface UseCaseProvider {
    @NotNull
    UseCase<FileResponse, FileRequest> provide(@NotNull StoreParams repositoryParams);
}
