package com.bbva.glomohybrid.documents.plugin.commands;

import android.app.Activity;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.glomohybrid.documents.common.model.CannotOpenFileException;
import com.bbva.glomohybrid.documents.common.model.FileNotFoundException;
import com.bbva.glomohybrid.documents.common.model.LocalFile;
import com.bbva.glomohybrid.documents.plugin.Injector;
import com.bbva.glomohybrid.documents.plugin.model.DocumentDTO;
import com.bbva.glomohybrid.documents.plugin.model.DocumentParamsValidator;
import com.bbva.glomoutils.usecase.UseCaseWithParams;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import q8.c;
import q8.d;

/* JADX INFO: compiled from: OpenPathCommand.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/documents/plugin/commands/OpenPathCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/glomohybrid/documents/plugin/model/DocumentDTO;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "<init>", "()V", "Companion", "gl-documents_release"}, k = 1, mv = {1, 9, 0})
public final class OpenPathCommand extends AbstractCommand<DocumentDTO> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String ID = "openbypath";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final UseCaseWithParams<LocalFile, Boolean> f32116p0;

    /* JADX INFO: compiled from: OpenPathCommand.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/documents/plugin/commands/OpenPathCommand$Companion;", "", "()V", "ID", "", "gl-documents_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: OpenPathCommand.kt */
    public static final class a extends Lambda implements Function1<Activity, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ DocumentDTO f32118q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f32119r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DocumentDTO documentDTO, CommandCallback commandCallback) {
            super(1);
            this.f32118q0 = documentDTO;
            this.f32119r0 = commandCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Activity activity) {
            OpenPathCommand.access$safeExecute(OpenPathCommand.this, this.f32118q0, this.f32119r0);
            return Unit.INSTANCE;
        }
    }

    public OpenPathCommand() {
        super(DocumentDTO.class, new DocumentParamsValidator());
        this.f32116p0 = Injector.INSTANCE.getUseCaseFactory().openFileUseCase();
    }

    public static final void access$safeExecute(OpenPathCommand openPathCommand, DocumentDTO documentDTO, CommandCallback commandCallback) {
        openPathCommand.getClass();
        File file = new File(documentDTO.getValue());
        if (!file.exists()) {
            commandCallback.sendError(FileNotFoundException.INSTANCE.getPayloadError());
            return;
        }
        if (openPathCommand.f32116p0.execute(new LocalFile(file, documentDTO.getMimeType())).booleanValue()) {
            commandCallback.sendEvent();
        } else {
            commandCallback.sendError(CannotOpenFileException.INSTANCE.getPayloadError());
        }
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull DocumentDTO params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.mActivityContainer.get().ifPresentOrElse(new c(new a(params, callback), 0), new d(0, callback));
    }
}
