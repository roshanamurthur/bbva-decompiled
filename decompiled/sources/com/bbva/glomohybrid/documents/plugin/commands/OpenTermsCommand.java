package com.bbva.glomohybrid.documents.plugin.commands;

import com.bbva.glomohybrid.documents.common.model.Document;
import com.bbva.glomohybrid.documents.plugin.Injector;
import com.bbva.glomohybrid.documents.plugin.model.DocumentDTO;
import com.bbva.glomohybrid.documents.plugin.model.DocumentParamsValidator;
import com.bbva.glomohybrid.documents.plugin.model.MappersKt;
import com.bbva.glomoutils.Either;
import com.bbva.glomoutils.usecase.UseCaseWithParams;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OpenTermsCommand.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/documents/plugin/commands/OpenTermsCommand;", "Lcom/bbva/glomohybrid/documents/plugin/commands/BaseFileCommand;", "Lcom/bbva/glomohybrid/documents/plugin/model/DocumentDTO;", "param", "Lcom/bbva/glomoutils/Either;", "", "Ljava/io/File;", "fetchFile", "(Lcom/bbva/glomohybrid/documents/plugin/model/DocumentDTO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "Companion", "gl-documents_release"}, k = 1, mv = {1, 9, 0})
public final class OpenTermsCommand extends BaseFileCommand<DocumentDTO> {

    @NotNull
    public static final String ID = "openbyname";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final UseCaseWithParams<Document, Either<Throwable, File>> f32120s0;

    public OpenTermsCommand() {
        super(DocumentDTO.class, new DocumentParamsValidator());
        this.f32120s0 = Injector.INSTANCE.getUseCaseFactory().getTermsUseCase();
    }

    @Override // com.bbva.glomohybrid.documents.plugin.commands.BaseFileCommand
    @Nullable
    public Object fetchFile(@NotNull DocumentDTO documentDTO, @NotNull Continuation<? super Either<? extends Throwable, ? extends File>> continuation) {
        return this.f32120s0.execute(MappersKt.map(documentDTO));
    }
}
