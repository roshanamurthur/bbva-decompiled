package r6;

import android.app.Application;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.filesystem.WebFile;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.document.scanner.plugin.command.ScanDocumentCommand;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ScanDocumentCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.bbva.document.scanner.plugin.command.ScanDocumentCommand$sendResult$1", f = "ScanDocumentCommand.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
public final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f92945p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ScanDocumentCommand f92946q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ File f92947r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f92948s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ScanDocumentCommand scanDocumentCommand, File file, CommandCallback commandCallback, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f92946q0 = scanDocumentCommand;
        this.f92947r0 = file;
        this.f92948s0 = commandCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new d(this.f92946q0, this.f92947r0, this.f92948s0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f92945p0;
        ScanDocumentCommand scanDocumentCommand = this.f92946q0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Application mApplication = ((AbstractCommand) scanDocumentCommand).mApplication;
            Intrinsics.checkNotNullExpressionValue(mApplication, "mApplication");
            this.f92945p0 = 1;
            obj = ScanDocumentCommand.access$toWebFile(scanDocumentCommand, this.f92947r0, mApplication, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        WebFile webFile = (WebFile) obj;
        CommandCallback commandCallback = this.f92948s0;
        if (webFile != null) {
            commandCallback.sendEvent(ScanDocumentCommand.access$toResponse(scanDocumentCommand, webFile));
        } else {
            commandCallback.sendError(Errors.ErrorDefault);
        }
        return Unit.INSTANCE;
    }
}
