package com.bbva.component.dm.filefetcher.data.repository;

import bk.q;
import com.bbva.component.dm.filefetcher.data.datasource.FileFetcherDataSource;
import com.bbva.component.dm.filefetcher.data.datasource.FileStoreDataSource;
import com.bbva.component.dm.filefetcher.data.model.FileRequest;
import com.bbva.component.dm.filefetcher.domain.exceptions.EmptyResponseException;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.model.response.NetworkResponse;
import java.io.File;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TuplesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FileRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lcom/bbva/component/dm/filefetcher/data/repository/FileRepository;", "", "Lcom/bbva/component/dm/filefetcher/data/model/FileRequest;", "requestData", "Ljava/io/File;", "fetchFile", "Lcom/bbva/component/dm/filefetcher/data/datasource/FileFetcherDataSource;", "fileFetcherDataSource", "Lcom/bbva/component/dm/filefetcher/data/datasource/FileStoreDataSource;", "fileStoreDataSource", "<init>", "(Lcom/bbva/component/dm/filefetcher/data/datasource/FileFetcherDataSource;Lcom/bbva/component/dm/filefetcher/data/datasource/FileStoreDataSource;)V", "component-dm-filefetcher_release"}, k = 1, mv = {1, 4, 0})
public final class FileRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileFetcherDataSource f27630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileStoreDataSource f27631b;

    public FileRepository(@NotNull FileFetcherDataSource fileFetcherDataSource, @NotNull FileStoreDataSource fileStoreDataSource) {
        this.f27630a = fileFetcherDataSource;
        this.f27631b = fileStoreDataSource;
    }

    @NotNull
    public final File fetchFile(@NotNull FileRequest requestData) throws EmptyResponseException {
        NetworkResponse networkResponseFetch = this.f27630a.fetch(requestData.getUrl(), new HashMap<>(q.plus(requestData.getRequestHeaders(), TuplesKt.to(DigipassManagerConstants.KEY_CONTENT_TYPE, requestData.getFileType().getMimeType()))));
        if (networkResponseFetch != null) {
            return this.f27631b.generateFile(networkResponseFetch, requestData);
        }
        throw new EmptyResponseException();
    }
}
