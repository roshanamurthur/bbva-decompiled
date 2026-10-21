package k6;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.PermissionCommand;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.dcaptureplugin.command.LaunchDocumentCaptureCommand;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONArray;

/* JADX INFO: compiled from: LaunchDocumentCaptureCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.bbva.dcaptureplugin.command.LaunchDocumentCaptureCommand$processAndEncodeResultCaptures$1", f = "LaunchDocumentCaptureCommand.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public /* synthetic */ Object f79209p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LaunchDocumentCaptureCommand f79210q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(LaunchDocumentCaptureCommand launchDocumentCaptureCommand, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f79210q0 = launchDocumentCaptureCommand;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        f fVar = new f(this.f79210q0, continuation);
        fVar.f79209p0 = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM5535constructorimpl;
        LaunchDocumentCaptureCommand launchDocumentCaptureCommand = this.f79210q0;
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            Result.Companion companion = Result.INSTANCE;
            ((PermissionCommand) launchDocumentCaptureCommand).mCommandCallback.sendEvent(new JSONArray(((AbstractCommand) launchDocumentCaptureCommand).mGson.toJson(launchDocumentCaptureCommand.f29016r0)));
            objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null) {
            ((PermissionCommand) launchDocumentCaptureCommand).mCommandCallback.sendError(Errors.ErrorDefault);
        }
        return Unit.INSTANCE;
    }
}
