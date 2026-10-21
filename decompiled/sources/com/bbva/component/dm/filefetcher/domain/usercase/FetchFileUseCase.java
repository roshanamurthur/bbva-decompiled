package com.bbva.component.dm.filefetcher.domain.usercase;

import androidx.core.app.NotificationCompat;
import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.component.dm.filefetcher.data.model.FileRequest;
import com.bbva.component.dm.filefetcher.data.model.FileResponse;
import com.bbva.component.dm.filefetcher.data.repository.FileRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FetchFileUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¨\u0006\n"}, d2 = {"Lcom/bbva/component/dm/filefetcher/domain/usercase/FetchFileUseCase;", "Lcom/bbva/cells/component/kit/datamanager/domain/usecase/UseCase;", "Lcom/bbva/component/dm/filefetcher/data/model/FileResponse;", "Lcom/bbva/component/dm/filefetcher/data/model/FileRequest;", "fileRequest", NotificationCompat.CATEGORY_CALL, "Lcom/bbva/component/dm/filefetcher/data/repository/FileRepository;", "fileRepository", "<init>", "(Lcom/bbva/component/dm/filefetcher/data/repository/FileRepository;)V", "component-dm-filefetcher_release"}, k = 1, mv = {1, 4, 0})
public final class FetchFileUseCase extends UseCase<FileResponse, FileRequest> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FileRepository f27642d;

    public FetchFileUseCase(@NotNull FileRepository fileRepository) {
        this.f27642d = fileRepository;
    }

    @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase
    @NotNull
    public FileResponse call(@NotNull FileRequest fileRequest) {
        String actionResult = fileRequest.getActionResult();
        String absolutePath = this.f27642d.fetchFile(fileRequest).getAbsolutePath();
        Intrinsics.checkExpressionValueIsNotNull(absolutePath, "fileRepository.fetchFile(this).absolutePath");
        return new FileResponse(actionResult, absolutePath, fileRequest.getFileType());
    }
}
