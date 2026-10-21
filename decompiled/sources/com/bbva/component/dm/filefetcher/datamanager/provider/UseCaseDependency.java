package com.bbva.component.dm.filefetcher.datamanager.provider;

import android.content.Context;
import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.component.dm.filefetcher.data.datasource.FileFetcherDataSource;
import com.bbva.component.dm.filefetcher.data.datasource.FileStoreDataSource;
import com.bbva.component.dm.filefetcher.data.model.FileRequest;
import com.bbva.component.dm.filefetcher.data.model.FileResponse;
import com.bbva.component.dm.filefetcher.data.model.StoreParams;
import com.bbva.component.dm.filefetcher.data.repository.FileRepository;
import com.bbva.component.dm.filefetcher.domain.usercase.FetchFileUseCase;
import com.bbva.network.NetworkWorker;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UseCaseDependency.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Lcom/bbva/component/dm/filefetcher/datamanager/provider/UseCaseDependency;", "Lcom/bbva/component/dm/filefetcher/datamanager/provider/UseCaseProvider;", "Lcom/bbva/component/dm/filefetcher/data/model/StoreParams;", "repositoryParams", "Lcom/bbva/cells/component/kit/datamanager/domain/usecase/UseCase;", "Lcom/bbva/component/dm/filefetcher/data/model/FileResponse;", "Lcom/bbva/component/dm/filefetcher/data/model/FileRequest;", "provide", "Lcom/bbva/network/NetworkWorker;", "worker", "Landroid/content/Context;", "context", "<init>", "(Lcom/bbva/network/NetworkWorker;Landroid/content/Context;)V", "component-dm-filefetcher_release"}, k = 1, mv = {1, 4, 0})
public final class UseCaseDependency implements UseCaseProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkWorker f27640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f27641b;

    public UseCaseDependency(@NotNull NetworkWorker networkWorker, @NotNull Context context) {
        this.f27640a = networkWorker;
        this.f27641b = context;
    }

    @Override // com.bbva.component.dm.filefetcher.datamanager.provider.UseCaseProvider
    @NotNull
    public UseCase<FileResponse, FileRequest> provide(@NotNull StoreParams repositoryParams) {
        return new FetchFileUseCase(new FileRepository(new FileFetcherDataSource(this.f27640a), new FileStoreDataSource(this.f27641b, repositoryParams)));
    }
}
