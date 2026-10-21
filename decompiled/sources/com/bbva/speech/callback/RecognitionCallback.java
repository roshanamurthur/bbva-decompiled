package com.bbva.speech.callback;

import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.speech.model.RecognizerResult;
import com.bbva.speech.model.SpeechError;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RecognitionCallback.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0018\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0004\u0012\u00020\u00040\u0017¢\u0006\u0004\b!\u0010\"J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0012\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R)\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0004\u0012\u00020\u00040\u00178\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Lcom/bbva/speech/callback/RecognitionCallback;", "Landroid/speech/RecognitionListener;", "Landroid/os/Bundle;", "params", "", "onReadyForSpeech", "onBeginningOfSpeech", "", "rmsdB", "onRmsChanged", "", "buffer", "onBufferReceived", "onEndOfSpeech", "", "error", "onError", "results", "onResults", "partialResults", "onPartialResults", "eventType", "onEvent", "Lkotlin/Function1;", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Lcom/bbva/speech/model/RecognizerResult;", "b", "Lkotlin/jvm/functions/Function1;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "callback", "Landroid/speech/SpeechRecognizer;", "engine", "<init>", "(Landroid/speech/SpeechRecognizer;Lkotlin/jvm/functions/Function1;)V", "speech_release"}, k = 1, mv = {1, 5, 1})
public final class RecognitionCallback implements RecognitionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SpeechRecognizer f36913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<Result<RecognizerResult>, Unit> callback;

    /* JADX WARN: Multi-variable type inference failed */
    public RecognitionCallback(@NotNull SpeechRecognizer engine, @NotNull Function1<? super Result<RecognizerResult>, Unit> callback) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f36913a = engine;
        this.callback = callback;
    }

    @NotNull
    public final Function1<Result<RecognizerResult>, Unit> getCallback() {
        return this.callback;
    }

    @Override // android.speech.RecognitionListener
    public void onError(int error) {
        this.callback.invoke(new Result.Error(new SpeechError(error)));
        SpeechRecognizer speechRecognizer = this.f36913a;
        speechRecognizer.cancel();
        speechRecognizer.destroy();
    }

    @Override // android.speech.RecognitionListener
    public void onPartialResults(@Nullable Bundle partialResults) {
        String strJoinToString$default;
        ArrayList<String> stringArrayList = partialResults == null ? null : partialResults.getStringArrayList("results_recognition");
        String str = "";
        if (stringArrayList != null && (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(stringArrayList, null, null, null, 0, null, null, 63, null)) != null) {
            str = strJoinToString$default;
        }
        this.callback.invoke(new Result.Success(new RecognizerResult(null, str, 1, null)));
    }

    @Override // android.speech.RecognitionListener
    public void onResults(@NotNull Bundle results) {
        String strJoinToString$default;
        Intrinsics.checkNotNullParameter(results, "results");
        ArrayList<String> stringArrayList = results.getStringArrayList("results_recognition");
        String str = "";
        if (stringArrayList != null && (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(stringArrayList, null, null, null, 0, null, null, 63, null)) != null) {
            str = strJoinToString$default;
        }
        this.callback.invoke(new Result.Success(new RecognizerResult(str, null, 2, null)));
    }

    @Override // android.speech.RecognitionListener
    public void onBeginningOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public void onEndOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public void onBufferReceived(@Nullable byte[] buffer) {
    }

    @Override // android.speech.RecognitionListener
    public void onReadyForSpeech(@Nullable Bundle params) {
    }

    @Override // android.speech.RecognitionListener
    public void onRmsChanged(float rmsdB) {
    }

    @Override // android.speech.RecognitionListener
    public void onEvent(int eventType, @Nullable Bundle params) {
    }
}
