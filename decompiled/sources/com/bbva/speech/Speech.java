package com.bbva.speech;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.speech.SpeechRecognizer;
import android.speech.tts.TextToSpeech;
import androidx.camera.core.r1;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityLauncher;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResult;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResultRequest;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.speech.callback.RecognitionCallback;
import com.bbva.speech.callback.SpeakListener;
import com.bbva.speech.model.ModelKt;
import com.bbva.speech.model.RecognizerOptions;
import com.bbva.speech.model.RecognizerResult;
import com.bbva.speech.model.SpeakOptions;
import com.bbva.speech.model.SpeechRate;
import com.bbva.speech.plugin.command.RecognizeCommand;
import com.bbva.speech.plugin.command.SpeakCommand;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Speech.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J;\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\fJ\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000b0\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0007J\u0006\u0010\u0019\u001a\u00020\u0004J\u0010\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcom/bbva/speech/Speech;", "Landroid/speech/tts/TextToSpeech$OnInitListener;", "", "status", "", "onInit", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "", "title", "language", "Lcom/bbva/ethermobile/help/kit/result/Result;", "", RecognizeCommand.ID, "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/speech/model/SpeakOptions;", "speakOptions", SpeakCommand.ID, "(Lcom/bbva/speech/model/SpeakOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "supportedLanguages", "Lcom/bbva/speech/model/RecognizerOptions;", "options", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/speech/model/RecognizerResult;", "recognizeWithNoSystemUI", "stopSpeak", "", "timeToStop", "stopRecognizer", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "speech_release"}, k = 1, mv = {1, 5, 1})
public final class Speech implements TextToSpeech.OnInitListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f36899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f36900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public TextToSpeech f36901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public SpeakOptions f36902d;

    /* JADX INFO: compiled from: Speech.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bbva/speech/Speech$Companion;", "", "()V", "LAUNCHER_DEFAULT_TITLE", "", "speech_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: Speech.kt */
    public static final class a extends Lambda implements Function1<ActivityResultRequest.Builder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Bundle f36903p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Bundle bundle) {
            super(1);
            this.f36903p0 = bundle;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActivityResultRequest.Builder builder) {
            ActivityResultRequest.Builder create = builder;
            Intrinsics.checkNotNullParameter(create, "$this$create");
            create.setAction("android.speech.action.RECOGNIZE_SPEECH");
            create.setExtras(this.f36903p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Speech.kt */
    public static final class b extends Lambda implements Function1<ActivityResult, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Continuation<Result<List<String>>> f36904p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SafeContinuation safeContinuation) {
            super(1);
            this.f36904p0 = safeContinuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActivityResult activityResult) {
            ActivityResult it = activityResult;
            Intrinsics.checkNotNullParameter(it, "it");
            boolean z10 = it instanceof ActivityResult.Success;
            Continuation<Result<List<String>>> continuation = this.f36904p0;
            if (z10) {
                Object stringArrayListExtra = ((ActivityResult.Success) it).getIntent().getStringArrayListExtra("android.speech.extra.RESULTS");
                if (stringArrayListExtra == null) {
                    stringArrayListExtra = CollectionsKt__CollectionsKt.emptyList();
                }
                continuation.resumeWith(kotlin.Result.m5535constructorimpl(new Result.Success(stringArrayListExtra)));
            } else if (it instanceof ActivityResult.Cancel) {
                continuation.resumeWith(kotlin.Result.m5535constructorimpl(new Result.Error(new Exception())));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Speech.kt */
    @DebugMetadata(c = "com.bbva.speech.Speech$recognizeWithNoSystemUI$1", f = "Speech.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<ProducerScope<? super Result<RecognizerResult>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f36905p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f36906q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ RecognizerOptions f36907r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Speech f36908s0;

        /* JADX INFO: compiled from: Speech.kt */
        public static final class a extends Lambda implements Function1<Result<RecognizerResult>, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ ProducerScope<Result<RecognizerResult>> f36909p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(ProducerScope<? super Result<RecognizerResult>> producerScope) {
                super(1);
                this.f36909p0 = producerScope;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Result<RecognizerResult> result) {
                Result<RecognizerResult> it = result;
                Intrinsics.checkNotNullParameter(it, "it");
                this.f36909p0.mo5953trySendJP2dKIU(it);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: Speech.kt */
        public static final class b extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final b f36910p0 = new b(0);

            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ Unit invoke() {
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecognizerOptions recognizerOptions, Speech speech, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f36907r0 = recognizerOptions;
            this.f36908s0 = speech;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = new c(this.f36907r0, this.f36908s0, continuation);
            cVar.f36906q0 = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super Result<RecognizerResult>> producerScope, Continuation<? super Unit> continuation) {
            return ((c) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f36905p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ProducerScope producerScope = (ProducerScope) this.f36906q0;
                RecognizerOptions recognizerOptions = this.f36907r0;
                Long autoStopAfter = recognizerOptions.getAutoStopAfter();
                Speech speech = this.f36908s0;
                if (autoStopAfter != null) {
                    speech.stopRecognizer(autoStopAfter.longValue());
                }
                if (SpeechRecognizer.isRecognitionAvailable(speech.f36899a)) {
                    Speech.access$getSpeechRecognizer(speech).setRecognitionListener(new RecognitionCallback(Speech.access$getSpeechRecognizer(speech), new a(producerScope)));
                    Speech.access$getSpeechRecognizer(speech).startListening(ModelKt.toRecognizerIntent(recognizerOptions));
                } else {
                    producerScope.mo5953trySendJP2dKIU(new Result.Error(new Exception()));
                }
                this.f36905p0 = 1;
                if (ProduceKt.awaitClose(producerScope, b.f36910p0, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: Speech.kt */
    public static final class d extends Lambda implements Function1<Result<Unit>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Continuation<Result<Unit>> f36911p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SafeContinuation safeContinuation) {
            super(1);
            this.f36911p0 = safeContinuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Result<Unit> result) {
            Result<Unit> it = result;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f36911p0.resumeWith(kotlin.Result.m5535constructorimpl(it));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Speech.kt */
    public static final class e extends Lambda implements Function0<SpeechRecognizer> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SpeechRecognizer invoke() {
            return SpeechRecognizer.createSpeechRecognizer(Speech.this.f36899a);
        }
    }

    public Speech(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f36899a = context;
        this.f36900b = LazyKt__LazyJVMKt.lazy(new e());
    }

    public static final SpeechRecognizer access$getSpeechRecognizer(Speech speech) {
        Object value = speech.f36900b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-speechRecognizer>(...)");
        return (SpeechRecognizer) value;
    }

    public static /* synthetic */ void stopRecognizer$default(Speech speech, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        speech.stopRecognizer(j10);
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public void onInit(int status) {
        SpeechRate rate;
        Float volume;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        if (status == -1) {
            return;
        }
        SpeakOptions speakOptions = this.f36902d;
        TextToSpeech textToSpeech = this.f36901c;
        if (textToSpeech == null) {
            return;
        }
        Locale language = speakOptions == null ? null : speakOptions.getLanguage();
        if (language == null) {
            language = Locale.getDefault();
        }
        textToSpeech.setLanguage(language);
        float fFloatValue = 1.0f;
        textToSpeech.setSpeechRate((speakOptions == null || (rate = speakOptions.getRate()) == null) ? 1.0f : ModelKt.toFloatValues(rate));
        Bundle bundle = new Bundle();
        if (speakOptions != null && (volume = speakOptions.getVolume()) != null) {
            fFloatValue = volume.floatValue();
        }
        bundle.putFloat("volume", fFloatValue);
        textToSpeech.speak(speakOptions != null ? speakOptions.getText() : null, 0, bundle, string);
    }

    @Nullable
    public final Object recognize(@NotNull Activity activity, @Nullable String str, @Nullable String str2, @NotNull Continuation<? super Result<List<String>>> continuation) {
        Bundle bundle = new Bundle();
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            bundle.putString("android.speech.action.GET_LANGUAGE_DETAILS", "free_form");
            bundle.putString("android.speech.extra.PROMPT", "Cells Recognizer");
        } else {
            bundle.putString("android.speech.extra.LANGUAGE", str2);
            bundle.putString("android.speech.extra.LANGUAGE_PREFERENCE", str2);
            bundle.putString("android.speech.extra.ONLY_RETURN_LANGUAGE_PREFERENCE", str2);
            bundle.putString("android.speech.extra.PROMPT", str);
        }
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        new ActivityLauncher().create(new a(bundle)).listen(new b(safeContinuation)).launch(activity);
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @ExperimentalCoroutinesApi
    @NotNull
    public final Flow<Result<RecognizerResult>> recognizeWithNoSystemUI(@NotNull RecognizerOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        return FlowKt.callbackFlow(new c(options, this, null));
    }

    @Nullable
    public final Object speak(@NotNull SpeakOptions speakOptions, @NotNull Continuation<? super Result<Unit>> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        this.f36902d = speakOptions;
        TextToSpeech textToSpeech = new TextToSpeech(this.f36899a, this);
        this.f36901c = textToSpeech;
        Boxing.boxInt(textToSpeech.setOnUtteranceProgressListener(new SpeakListener(this.f36901c, new d(safeContinuation))));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public final void stopRecognizer(long timeToStop) {
        new Handler(Looper.getMainLooper()).postDelayed(new r1(this, 2), timeToStop);
    }

    public final void stopSpeak() {
        TextToSpeech textToSpeech = this.f36901c;
        if (textToSpeech != null && textToSpeech.isSpeaking()) {
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
    }

    @NotNull
    public final List<String> supportedLanguages() {
        Locale[] availableLocales = Locale.getAvailableLocales();
        Intrinsics.checkNotNullExpressionValue(availableLocales, "getAvailableLocales()");
        ArrayList arrayList = new ArrayList(availableLocales.length);
        for (Locale locale : availableLocales) {
            arrayList.add(locale.toLanguageTag());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!Intrinsics.areEqual((String) obj, "und")) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
