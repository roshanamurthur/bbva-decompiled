package com.bbva.glomohybrid.documents.plugin.commands;

import com.bbva.actionlauncher.ActionLauncher;
import com.bbva.actionlauncher.ViewValue;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.glomohybrid.documents.common.model.CannotOpenFileException;
import com.bbva.glomohybrid.documents.plugin.Injector;
import com.bbva.glomohybrid.documents.plugin.model.DocumentDTO;
import com.bbva.glomohybrid.documents.plugin.model.DocumentParamsValidator;
import com.bbva.glomoutils.Either;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OpenBase64Command.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/documents/plugin/commands/OpenBase64Command;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/glomohybrid/documents/plugin/model/DocumentDTO;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "<init>", "()V", "Companion", "gl-documents_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nOpenBase64Command.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenBase64Command.kt\ncom/bbva/glomohybrid/documents/plugin/commands/OpenBase64Command\n+ 2 Either.kt\ncom/bbva/glomoutils/EitherKt\n*L\n1#1,34:1\n39#2,5:35\n*S KotlinDebug\n*F\n+ 1 OpenBase64Command.kt\ncom/bbva/glomohybrid/documents/plugin/commands/OpenBase64Command\n*L\n25#1:35,5\n*E\n"})
public final class OpenBase64Command extends AbstractCommand<DocumentDTO> {

    @NotNull
    public static final String ID = "openbybase64";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ActionLauncher f32111p0;

    /* JADX INFO: compiled from: OpenBase64Command.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f32112p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: OpenBase64Command.kt */
    public static final class b extends Lambda implements Function0<CannotOpenFileException> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f32113p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final CannotOpenFileException invoke() {
            return CannotOpenFileException.INSTANCE;
        }
    }

    public OpenBase64Command() {
        super(DocumentDTO.class, new DocumentParamsValidator());
        this.f32111p0 = Injector.INSTANCE.getActionLauncher();
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull DocumentDTO params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Either eitherCond = Either.INSTANCE.cond(this.f32111p0.launchView(new ViewValue.File(params.getMimeType(), params.getValue(), 0, 4, null)), a.f32112p0, b.f32113p0);
        if (eitherCond instanceof Either.Right) {
            callback.sendEvent();
        } else if (eitherCond instanceof Either.Left) {
            callback.sendError(((CannotOpenFileException) ((Either.Left) eitherCond).getError()).getPayloadError());
        }
    }
}
