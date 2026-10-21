package com.bbva.glomohybrid.documents.common.repository;

import com.bbva.glomohybrid.documents.common.model.DocumentRequest;
import com.bbva.glomohybrid.documents.common.model.FileRequest;
import com.bbva.glomohybrid.documents.common.model.FileResponse;
import com.bbva.glomohybrid.documents.common.model.OtherRequest;
import com.bbva.glomohybrid.documents.common.repository.dataSource.DiskFileDataSource;
import com.bbva.glomohybrid.documents.common.repository.dataSource.FilenameFormatter;
import com.bbva.glomohybrid.documents.common.repository.dataSource.FilenameFormatters;
import com.bbva.glomohybrid.documents.common.repository.dataSource.RemoteFileDataSource;
import com.bbva.network.constant.Method;
import com.bbva.plugin.filefetcher.command.FetchCommand;
import java.io.File;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DocumentsRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¨\u0006\u0010"}, d2 = {"Lcom/bbva/glomohybrid/documents/common/repository/DocumentsRepository;", "", "Lcom/bbva/glomohybrid/documents/common/model/FileRequest;", "fileRequest", "Lcom/bbva/glomohybrid/documents/common/repository/dataSource/FilenameFormatter;", "formatter", "Ljava/io/File;", FetchCommand.ID, "", "documentsUrl", "Lcom/bbva/glomohybrid/documents/common/repository/dataSource/RemoteFileDataSource;", "remoteDataSource", "Lcom/bbva/glomohybrid/documents/common/repository/dataSource/DiskFileDataSource;", "diskDataSource", "<init>", "(Ljava/lang/String;Lcom/bbva/glomohybrid/documents/common/repository/dataSource/RemoteFileDataSource;Lcom/bbva/glomohybrid/documents/common/repository/dataSource/DiskFileDataSource;)V", "gl-documents_release"}, k = 1, mv = {1, 9, 0})
public final class DocumentsRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f32073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final RemoteFileDataSource f32074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final DiskFileDataSource f32075c;

    public DocumentsRepository(@NotNull String documentsUrl, @NotNull RemoteFileDataSource remoteDataSource, @NotNull DiskFileDataSource diskDataSource) {
        Intrinsics.checkNotNullParameter(documentsUrl, "documentsUrl");
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(diskDataSource, "diskDataSource");
        this.f32073a = documentsUrl;
        this.f32074b = remoteDataSource;
        this.f32075c = diskDataSource;
    }

    public static /* synthetic */ File fetch$default(DocumentsRepository documentsRepository, FileRequest fileRequest, FilenameFormatter filenameFormatter, int i10, Object obj) throws Exception {
        if ((i10 & 2) != 0) {
            filenameFormatter = FilenameFormatters.INSTANCE.getNoSpaceOrAscciFormatter();
        }
        return documentsRepository.fetch(fileRequest, filenameFormatter);
    }

    @NotNull
    public final File fetch(@NotNull FileRequest fileRequest, @NotNull FilenameFormatter formatter) throws Exception {
        FileResponse fileResponseFetch;
        Intrinsics.checkNotNullParameter(fileRequest, "fileRequest");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        if (fileRequest instanceof DocumentRequest) {
            DocumentRequest documentRequest = (DocumentRequest) fileRequest;
            RemoteFileDataSource remoteFileDataSource = this.f32074b;
            Method method = documentRequest.getMethod();
            String str = String.format(this.f32073a, Arrays.copyOf(new Object[]{documentRequest.getId()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
            fileResponseFetch = remoteFileDataSource.fetch(method, str, documentRequest.withAppendedHeaders(), documentRequest.getQueryParams(), documentRequest.getBody());
        } else {
            if (!(fileRequest instanceof OtherRequest)) {
                throw new NoWhenBranchMatchedException();
            }
            OtherRequest otherRequest = (OtherRequest) fileRequest;
            fileResponseFetch = this.f32074b.fetch(otherRequest.getMethod(), otherRequest.getUrl(), otherRequest.withAppendedHeaders(), otherRequest.getQueryParams(), otherRequest.getBody());
        }
        return this.f32075c.save(fileResponseFetch, fileRequest.getFileName(), fileRequest.getFileType(), formatter);
    }
}
