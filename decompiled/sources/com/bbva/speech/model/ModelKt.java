package com.bbva.speech.model;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"toFloatValues", "", "Lcom/bbva/speech/model/SpeechRate;", "toRecognizerIntent", "Landroid/content/Intent;", "Lcom/bbva/speech/model/RecognizerOptions;", "speech_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ModelKt {

    /* JADX INFO: compiled from: Model.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SpeechRate.values().length];
            iArr[SpeechRate.MIN.ordinal()] = 1;
            iArr[SpeechRate.NORMAL.ordinal()] = 2;
            iArr[SpeechRate.MAX.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final float toFloatValues(@NotNull SpeechRate speechRate) {
        Intrinsics.checkNotNullParameter(speechRate, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[speechRate.ordinal()];
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return 1.0f;
        }
        if (i10 == 3) {
            return 2.0f;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final Intent toRecognizerIntent(@NotNull RecognizerOptions recognizerOptions) {
        Intrinsics.checkNotNullParameter(recognizerOptions, "<this>");
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        intent.putExtra("android.speech.extra.PARTIAL_RESULTS", recognizerOptions.getPartialResults());
        intent.putExtra("android.speech.extra.LANGUAGE", recognizerOptions.getLanguage());
        intent.putExtra("android.speech.extra.LANGUAGE_PREFERENCE", recognizerOptions.getLanguage());
        intent.putExtra("android.speech.extra.PREFER_OFFLINE", recognizerOptions.getOnDeviceOnly());
        return intent;
    }
}
