package com.bbva.glomohybrid.documents.common;

import com.bbva.glomohybrid.documents.common.model.Document;
import com.bbva.glomohybrid.documents.common.model.DocumentRequest;
import com.bbva.glomohybrid.documents.common.model.FileNotFoundException;
import com.bbva.glomohybrid.documents.common.model.TermsDataModel;
import com.bbva.glomohybrid.documents.common.repository.DocumentsRepository;
import com.bbva.glomohybrid.documents.common.repository.TermsRepository;
import com.bbva.glomoutils.Either;
import com.bbva.glomoutils.EitherKt;
import com.bbva.glomoutils.usecase.UseCaseWithParams;
import java.io.File;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FetchTermsByNameUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/documents/common/FetchTermsByNameUseCase;", "Lcom/bbva/glomoutils/usecase/UseCaseWithParams;", "Lcom/bbva/glomohybrid/documents/common/model/Document;", "Lcom/bbva/glomoutils/Either;", "", "Ljava/io/File;", "params", "execute", "Lcom/bbva/glomohybrid/documents/common/repository/TermsRepository;", "termsRepository", "Lcom/bbva/glomohybrid/documents/common/repository/DocumentsRepository;", "documentsRepository", "<init>", "(Lcom/bbva/glomohybrid/documents/common/repository/TermsRepository;Lcom/bbva/glomohybrid/documents/common/repository/DocumentsRepository;)V", "gl-documents_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nFetchTermsByNameUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchTermsByNameUseCase.kt\ncom/bbva/glomohybrid/documents/common/FetchTermsByNameUseCase\n+ 2 Either.kt\ncom/bbva/glomoutils/EitherKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n67#2:36\n60#2,3:38\n1#3:37\n1#3:41\n*S KotlinDebug\n*F\n+ 1 FetchTermsByNameUseCase.kt\ncom/bbva/glomohybrid/documents/common/FetchTermsByNameUseCase\n*L\n22#1:36\n23#1:38,3\n22#1:37\n*E\n"})
public final class FetchTermsByNameUseCase implements UseCaseWithParams<Document, Either<? extends Throwable, ? extends File>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TermsRepository f32047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DocumentsRepository f32048b;

    public FetchTermsByNameUseCase(@NotNull TermsRepository termsRepository, @NotNull DocumentsRepository documentsRepository) {
        Intrinsics.checkNotNullParameter(termsRepository, "termsRepository");
        Intrinsics.checkNotNullParameter(documentsRepository, "documentsRepository");
        this.f32047a = termsRepository;
        this.f32048b = documentsRepository;
    }

    @Override // com.bbva.glomoutils.usecase.UseCaseWithParams
    @NotNull
    public Either<Throwable, File> execute(@NotNull Document params) {
        Either<Throwable, File> eitherLeft;
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(params, "params");
        TermsDataModel termsDataModelByName = this.f32047a.byName(params.getValue());
        if (termsDataModelByName == null || (eitherLeft = EitherKt.right(termsDataModelByName)) == null) {
            eitherLeft = EitherKt.left(FileNotFoundException.INSTANCE);
        }
        if (!(eitherLeft instanceof Either.Right)) {
            if (eitherLeft instanceof Either.Left) {
                return eitherLeft;
            }
            throw new NoWhenBranchMatchedException();
        }
        String id = ((TermsDataModel) ((Either.Right) eitherLeft).getValue()).getId();
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(DocumentsRepository.fetch$default(this.f32048b, new DocumentRequest(id, params.getMethod(), params.getMimeType(), params.getFileName(), params.getHeaders(), params.getQueryParams(), params.getBody()), null, 2, null));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        return EitherKt.toEither(objM5535constructorimpl);
    }
}
