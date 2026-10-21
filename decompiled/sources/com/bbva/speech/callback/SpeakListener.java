package com.bbva.speech.callback;

import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.speech.model.SpeechError;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SpeakListener.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH\u0016R)\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0004\u0012\u00020\u00040\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/bbva/speech/callback/SpeakListener;", "Landroid/speech/tts/UtteranceProgressListener;", "", "utteranceId", "", "onStart", "onDone", "onError", "", "errorCode", "Lkotlin/Function1;", "Lcom/bbva/ethermobile/help/kit/result/Result;", "b", "Lkotlin/jvm/functions/Function1;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "callback", "Landroid/speech/tts/TextToSpeech;", "engine", "<init>", "(Landroid/speech/tts/TextToSpeech;Lkotlin/jvm/functions/Function1;)V", "speech_release"}, k = 1, mv = {1, 5, 1})
public final class SpeakListener extends UtteranceProgressListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final TextToSpeech f36915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<Result<Unit>, Unit> callback;

    /* JADX WARN: Multi-variable type inference failed */
    public SpeakListener(@Nullable TextToSpeech textToSpeech, @NotNull Function1<? super Result<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f36915a = textToSpeech;
        this.callback = callback;
    }

    public static void a() {
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            a();
            kotlin.Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
    }

    @NotNull
    public final Function1<Result<Unit>, Unit> getCallback() {
        return this.callback;
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public void onDone(@Nullable String utteranceId) {
        if (this.f36915a != null) {
            a();
        }
        this.callback.invoke(new Result.Success(Unit.INSTANCE));
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public void onError(@Nullable String utteranceId) {
        this.callback.invoke(new Result.Error(new SpeechError(-1)));
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public void onError(@Nullable String utteranceId, int errorCode) {
        if (this.f36915a != null) {
            a();
        }
        this.callback.invoke(new Result.Error(new SpeechError(errorCode)));
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public void onStart(@Nullable String utteranceId) {
    }
}
