package com.bbva.speech.plugin.command;

import androidx.annotation.Keep;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.PermissionCommand;
import com.bbva.androidtoolkit.plugin.postmessage.PayloadDTO;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.speech.Speech;
import com.bbva.speech.model.RecognizerOptions;
import com.bbva.speech.model.RecognizerResult;
import com.bbva.speech.model.SpeechError;
import com.bbva.speech.plugin.injector.Injector;
import com.bbva.speech.plugin.request.RecognizeRequest;
import com.bbva.speech.plugin.response.SpeechErrors;
import com.mypinpad.tsdk.isolation.y2;
import ek.a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RecognizeCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0006\u0007B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\b"}, d2 = {"Lcom/bbva/speech/plugin/command/RecognizeCommand;", "Lcom/bbva/androidtoolkit/plugin/command/PermissionCommand;", "Lcom/bbva/speech/plugin/request/RecognizeRequest;", "()V", "executeWithPermissionsGranted", "", "Companion", "OnPartialResultsDTO", "speech-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@ExperimentalCoroutinesApi
public final class RecognizeCommand extends PermissionCommand<RecognizeRequest> {

    @NotNull
    public static final String ID = "recognize";

    @NotNull
    public static final String POST_MESSAGE_ACTION = "PartialResultRecognized";

    /* JADX INFO: compiled from: RecognizeCommand.kt */
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/bbva/speech/plugin/command/RecognizeCommand$OnPartialResultsDTO;", "Lcom/bbva/androidtoolkit/plugin/postmessage/PayloadDTO;", "partialResults", "", "(Ljava/lang/String;)V", "getPartialResults", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "speech-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class OnPartialResultsDTO extends PayloadDTO {

        @NotNull
        private final String partialResults;

        public OnPartialResultsDTO(@NotNull String partialResults) {
            Intrinsics.checkNotNullParameter(partialResults, "partialResults");
            this.partialResults = partialResults;
        }

        public static /* synthetic */ OnPartialResultsDTO copy$default(OnPartialResultsDTO onPartialResultsDTO, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = onPartialResultsDTO.partialResults;
            }
            return onPartialResultsDTO.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPartialResults() {
            return this.partialResults;
        }

        @NotNull
        public final OnPartialResultsDTO copy(@NotNull String partialResults) {
            Intrinsics.checkNotNullParameter(partialResults, "partialResults");
            return new OnPartialResultsDTO(partialResults);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnPartialResultsDTO) && Intrinsics.areEqual(this.partialResults, ((OnPartialResultsDTO) other).partialResults);
        }

        @NotNull
        public final String getPartialResults() {
            return this.partialResults;
        }

        public int hashCode() {
            return this.partialResults.hashCode();
        }

        @NotNull
        public String toString() {
            return y2.b(new StringBuilder("OnPartialResultsDTO(partialResults="), this.partialResults, RootService.CLOSE_BRACKET);
        }
    }

    /* JADX INFO: renamed from: com.bbva.speech.plugin.command.RecognizeCommand$executeWithPermissionsGranted$1, reason: invalid class name */
    /* JADX INFO: compiled from: RecognizeCommand.kt */
    @DebugMetadata(c = "com.bbva.speech.plugin.command.RecognizeCommand$executeWithPermissionsGranted$1", f = "RecognizeCommand.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f36917p0;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RecognizeCommand.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i10 = this.f36917p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Speech speechManager = Injector.INSTANCE.getSpeechManager();
                final RecognizeCommand recognizeCommand = RecognizeCommand.this;
                RecognizeRequest recognizeRequest = (RecognizeRequest) ((PermissionCommand) recognizeCommand).mParams;
                RecognizerOptions recognizerOptions = recognizeRequest == null ? null : new RecognizerOptions(recognizeRequest.getAutoStopAfter(), recognizeRequest.getLanguage(), recognizeRequest.getPartialResults(), recognizeRequest.getOnDeviceOnly());
                if (recognizerOptions == null) {
                    recognizerOptions = new RecognizerOptions(null, null, false, false, 15, null);
                }
                Flow<Result<RecognizerResult>> flowRecognizeWithNoSystemUI = speechManager.recognizeWithNoSystemUI(recognizerOptions);
                FlowCollector<Result<RecognizerResult>> flowCollector = new FlowCollector<Result<RecognizerResult>>() { // from class: com.bbva.speech.plugin.command.RecognizeCommand$executeWithPermissionsGranted$1$invokeSuspend$$inlined$collect$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(Result<RecognizerResult> result, @NotNull Continuation<? super Unit> continuation) {
                        Result<RecognizerResult> result2 = result;
                        boolean z10 = result2 instanceof Result.Success;
                        RecognizeCommand recognizeCommand2 = recognizeCommand;
                        if (z10) {
                            Result.Success success = (Result.Success) result2;
                            String fullResult = ((RecognizerResult) success.getValue()).getFullResult();
                            if (fullResult != null) {
                                ((PermissionCommand) recognizeCommand2).mCommandCallback.sendEvent(fullResult);
                            }
                            String partialResults = ((RecognizerResult) success.getValue()).getPartialResults();
                            if (partialResults != null) {
                                ((AbstractCommand) recognizeCommand2).mPostMessenger.postMessage(RecognizeCommand.POST_MESSAGE_ACTION, new RecognizeCommand.OnPartialResultsDTO(partialResults));
                            }
                        } else if (result2 instanceof Result.Error) {
                            Result.Error error = (Result.Error) result2;
                            if (error.getException() instanceof SpeechError) {
                                ((PermissionCommand) recognizeCommand2).mCommandCallback.sendError(SpeechErrors.INSTANCE.toErrorMessage(((SpeechError) error.getException()).getCode()));
                            } else {
                                ((PermissionCommand) recognizeCommand2).mCommandCallback.sendError(Errors.ErrorDefault);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.f36917p0 = 1;
                if (flowRecognizeWithNoSystemUI.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public RecognizeCommand() {
        super(RecognizeRequest.class, "android.permission.RECORD_AUDIO");
    }

    @Override // com.bbva.androidtoolkit.plugin.command.PermissionCommand
    public void executeWithPermissionsGranted() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new AnonymousClass1(null), 3, null);
    }
}
