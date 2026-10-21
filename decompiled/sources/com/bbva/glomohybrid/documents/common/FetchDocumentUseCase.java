package com.bbva.glomohybrid.documents.common;

import com.bbva.glomohybrid.documents.common.model.Document;
import com.bbva.glomohybrid.documents.common.model.DocumentRequest;
import com.bbva.glomohybrid.documents.common.repository.DocumentsRepository;
import com.bbva.glomoutils.Either;
import com.bbva.glomoutils.EitherKt;
import com.bbva.glomoutils.usecase.UseCaseWithParams;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FetchDocumentUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/documents/common/FetchDocumentUseCase;", "Lcom/bbva/glomoutils/usecase/UseCaseWithParams;", "Lcom/bbva/glomohybrid/documents/common/model/Document;", "Lcom/bbva/glomoutils/Either;", "", "Ljava/io/File;", "params", "execute", "Lcom/bbva/glomohybrid/documents/common/repository/DocumentsRepository;", "documentsRepository", "<init>", "(Lcom/bbva/glomohybrid/documents/common/repository/DocumentsRepository;)V", "gl-documents_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nFetchDocumentUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchDocumentUseCase.kt\ncom/bbva/glomohybrid/documents/common/FetchDocumentUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
public final class FetchDocumentUseCase implements UseCaseWithParams<Document, Either<? extends Throwable, ? extends File>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DocumentsRepository f32045a;

    public FetchDocumentUseCase(@NotNull DocumentsRepository documentsRepository) {
        Intrinsics.checkNotNullParameter(documentsRepository, "documentsRepository");
        this.f32045a = documentsRepository;
    }

    @Override // com.bbva.glomoutils.usecase.UseCaseWithParams
    @NotNull
    public Either<Throwable, File> execute(@NotNull Document params) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(DocumentsRepository.fetch$default(this.f32045a, new DocumentRequest(params.getValue(), params.getMethod(), params.getMimeType(), params.getFileName(), params.getHeaders(), params.getQueryParams(), params.getBody()), null, 2, null));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        return EitherKt.toEither(objM5535constructorimpl);
    }
}
