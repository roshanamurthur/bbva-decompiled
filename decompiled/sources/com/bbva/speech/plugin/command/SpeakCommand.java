package com.bbva.speech.plugin.command;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.speech.Speech;
import com.bbva.speech.model.SpeakOptions;
import com.bbva.speech.model.SpeechError;
import com.bbva.speech.model.SpeechRate;
import com.bbva.speech.plugin.injector.Injector;
import com.bbva.speech.plugin.request.SpeakRequest;
import com.bbva.speech.plugin.request.SpeakRequestValidator;
import com.bbva.speech.plugin.response.SpeechErrors;
import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SpeakCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\u000b"}, d2 = {"Lcom/bbva/speech/plugin/command/SpeakCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/speech/plugin/request/SpeakRequest;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "<init>", "()V", "Companion", "speech-plugin_release"}, k = 1, mv = {1, 5, 1})
public final class SpeakCommand extends AbstractCommand<SpeakRequest> {

    @NotNull
    public static final String ID = "speak";

    /* JADX INFO: compiled from: SpeakCommand.kt */
    @DebugMetadata(c = "com.bbva.speech.plugin.command.SpeakCommand$execute$1", f = "SpeakCommand.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f36920p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f36921q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SpeakRequest f36922r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ SpeakCommand f36923s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f36924t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SpeakRequest speakRequest, SpeakCommand speakCommand, CommandCallback commandCallback, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f36922r0 = speakRequest;
            this.f36923s0 = speakCommand;
            this.f36924t0 = commandCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f36922r0, this.f36923s0, this.f36924t0, continuation);
            aVar.f36921q0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM5535constructorimpl;
            SpeakRequest speakRequest = this.f36922r0;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f36920p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Speech speechManager = Injector.INSTANCE.getSpeechManager();
                try {
                    Result.Companion companion = Result.INSTANCE;
                    objM5535constructorimpl = Result.m5535constructorimpl(Locale.forLanguageTag(speakRequest.getLanguage()));
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
                }
                Locale locale = Result.m5538exceptionOrNullimpl(objM5535constructorimpl) == null ? (Locale) objM5535constructorimpl : Locale.getDefault();
                String text = speakRequest.getText();
                Intrinsics.checkNotNull(text);
                Float volume = speakRequest.getVolume();
                String rate = speakRequest.getRate();
                SpeakOptions speakOptions = new SpeakOptions(text, locale, volume, rate == null ? null : SpeakCommand.access$toSpeechRate(this.f36923s0, rate));
                this.f36920p0 = 1;
                obj = speechManager.speak(speakOptions, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            com.bbva.ethermobile.help.kit.result.Result result = (com.bbva.ethermobile.help.kit.result.Result) obj;
            boolean z10 = result instanceof com.bbva.ethermobile.help.kit.result.Result.Success;
            CommandCallback commandCallback = this.f36924t0;
            if (z10) {
                commandCallback.sendEvent();
            } else if (result instanceof com.bbva.ethermobile.help.kit.result.Result.Error) {
                com.bbva.ethermobile.help.kit.result.Result.Error error = (com.bbva.ethermobile.help.kit.result.Result.Error) result;
                if (error.getException() instanceof SpeechError) {
                    commandCallback.sendError(SpeechErrors.INSTANCE.toErrorMessage(((SpeechError) error.getException()).getCode()));
                    return Unit.INSTANCE;
                }
                commandCallback.sendError(Errors.ErrorDefault);
            }
            return Unit.INSTANCE;
        }
    }

    public SpeakCommand() {
        super(SpeakRequest.class, new SpeakRequestValidator());
    }

    public static final SpeechRate access$toSpeechRate(SpeakCommand speakCommand, String str) {
        speakCommand.getClass();
        if (Intrinsics.areEqual(str, "min")) {
            return SpeechRate.MIN;
        }
        return Intrinsics.areEqual(str, VDVideoSelfieConfiguration.MAX) ? SpeechRate.MAX : SpeechRate.NORMAL;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull SpeakRequest params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new a(params, this, callback, null), 3, null);
    }
}
