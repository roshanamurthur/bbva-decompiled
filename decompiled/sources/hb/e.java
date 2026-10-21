package hb;

import android.app.Application;
import android.content.Intent;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.plugin.media.capture.command.impl.GetPictureCommand;
import com.bbva.plugin.media.capture.command.param.GetPictureParams;
import com.bbva.plugin.media.capture.command.param.GetPictureParamsKt;
import com.bbva.plugin.media.capture.command.response.ErrorsMediaCapture;
import com.bbva.plugin.media.capture.media.image.BitmapExtractor;
import com.bbva.plugin.media.capture.media.image.ImagePipeline;
import com.bbva.plugin.media.capture.media.image.compress.JpegCompressor;
import com.bbva.plugin.media.capture.model.TempFile;
import java.util.Collection;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetPictureCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@DebugMetadata(c = "com.bbva.plugin.media.capture.command.impl.GetPictureCommand$handleSuccess$1", f = "GetPictureCommand.kt", i = {1}, l = {104, 116}, m = "invokeSuspend", n = {"uri"}, s = {"L$0"})
public final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public TempFile f69364p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f69365q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ GetPictureCommand f69366r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Intent f69367s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(GetPictureCommand getPictureCommand, Intent intent, Continuation continuation) {
        super(2, continuation);
        this.f69366r0 = getPictureCommand;
        this.f69367s0 = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new e(this.f69366r0, this.f69367s0, completion);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00de  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        TempFile tempFile;
        String str;
        CommandCallback commandCallback;
        CommandCallback commandCallback2;
        CommandCallback commandCallback3;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f69365q0;
        GetPictureCommand getPictureCommand = this.f69366r0;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tempFile = this.f69364p0;
                ResultKt.throwOnFailure(obj);
            }
            str = (String) obj;
            if (str == null) {
                commandCallback3 = getPictureCommand.f35816q0;
                if (commandCallback3 != null) {
                    commandCallback3.sendError(ErrorsMediaCapture.ErrorCapturePicture);
                }
            } else if (!GetPictureParamsKt.base64(getPictureCommand.f35815p0) && !GetPictureParamsKt.showMetadata(getPictureCommand.f35815p0)) {
                CommandCallback commandCallback4 = getPictureCommand.f35816q0;
                if (commandCallback4 != null) {
                    commandCallback4.sendEvent(str);
                }
            } else if (GetPictureParamsKt.showMetadata(getPictureCommand.f35815p0)) {
                commandCallback2 = getPictureCommand.f35816q0;
                if (commandCallback2 != null) {
                    commandCallback2.sendEvent(GetPictureCommand.access$prepareJsonResult(getPictureCommand, tempFile, str));
                }
            } else {
                commandCallback = getPictureCommand.f35816q0;
                if (commandCallback != null) {
                    commandCallback.sendError(Errors.ErrorMalformedParam);
                }
            }
            GetPictureCommand.access$release(getPictureCommand);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        GetPictureParams getPictureParams = getPictureCommand.f35815p0;
        String source = getPictureParams != null ? getPictureParams.getSource() : null;
        Intrinsics.checkNotNull(source);
        this.f69365q0 = 1;
        getPictureCommand.getClass();
        obj = BuildersKt.withContext(Dispatchers.getIO(), new f(getPictureCommand, source, this.f69367s0, null), this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        TempFile tempFile2 = (TempFile) obj;
        if (tempFile2 == null) {
            CommandCallback commandCallback5 = getPictureCommand.f35816q0;
            if (commandCallback5 != null) {
                commandCallback5.sendError(ErrorsMediaCapture.ErrorCapturePicture);
            }
            return Unit.INSTANCE;
        }
        BitmapExtractor.Companion companion = BitmapExtractor.INSTANCE;
        GetPictureParams getPictureParams2 = getPictureCommand.f35815p0;
        Intrinsics.checkNotNull(getPictureParams2);
        ImagePipeline imagePipeline = new ImagePipeline(companion.create(getPictureParams2), CollectionsKt___CollectionsKt.toMutableList((Collection) GetPictureCommand.access$transformations(getPictureCommand, getPictureCommand.f35815p0)), new JpegCompressor(GetPictureParamsKt.quality(getPictureCommand.f35815p0), tempFile2.getFile()));
        Application mApplication = ((AbstractCommand) getPictureCommand).mApplication;
        Intrinsics.checkNotNullExpressionValue(mApplication, "mApplication");
        this.f69364p0 = tempFile2;
        this.f69365q0 = 2;
        Object objExecute = imagePipeline.execute(mApplication, tempFile2, this);
        if (objExecute == coroutine_suspended) {
            return coroutine_suspended;
        }
        tempFile = tempFile2;
        obj = objExecute;
        str = (String) obj;
        if (str == null) {
            commandCallback3 = getPictureCommand.f35816q0;
            if (commandCallback3 != null) {
                commandCallback3.sendError(ErrorsMediaCapture.ErrorCapturePicture);
            }
        } else if (!GetPictureParamsKt.base64(getPictureCommand.f35815p0)) {
            if (GetPictureParamsKt.showMetadata(getPictureCommand.f35815p0)) {
                commandCallback2 = getPictureCommand.f35816q0;
                if (commandCallback2 != null) {
                    commandCallback2.sendEvent(GetPictureCommand.access$prepareJsonResult(getPictureCommand, tempFile, str));
                }
            } else {
                commandCallback = getPictureCommand.f35816q0;
                if (commandCallback != null) {
                    commandCallback.sendError(Errors.ErrorMalformedParam);
                }
            }
        } else if (GetPictureParamsKt.showMetadata(getPictureCommand.f35815p0)) {
            commandCallback2 = getPictureCommand.f35816q0;
            if (commandCallback2 != null) {
                commandCallback2.sendEvent(GetPictureCommand.access$prepareJsonResult(getPictureCommand, tempFile, str));
            }
        } else {
            commandCallback = getPictureCommand.f35816q0;
            if (commandCallback != null) {
                commandCallback.sendError(Errors.ErrorMalformedParam);
            }
        }
        GetPictureCommand.access$release(getPictureCommand);
        return Unit.INSTANCE;
    }
}
