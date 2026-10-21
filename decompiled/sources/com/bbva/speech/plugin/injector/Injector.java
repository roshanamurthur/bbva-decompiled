package com.bbva.speech.plugin.injector;

import android.content.Context;
import com.bbva.speech.Speech;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Injector.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/bbva/speech/plugin/injector/Injector;", "", "()V", "speechManager", "Lcom/bbva/speech/Speech;", "getSpeechManager", "()Lcom/bbva/speech/Speech;", "setSpeechManager", "(Lcom/bbva/speech/Speech;)V", "init", "", "context", "Landroid/content/Context;", "speech-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Injector {

    @NotNull
    public static final Injector INSTANCE = new Injector();
    public static Speech speechManager;

    @NotNull
    public final Speech getSpeechManager() {
        Speech speech = speechManager;
        if (speech != null) {
            return speech;
        }
        Intrinsics.throwUninitializedPropertyAccessException("speechManager");
        throw null;
    }

    public final void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        setSpeechManager(new Speech(applicationContext));
    }

    public final void setSpeechManager(@NotNull Speech speech) {
        Intrinsics.checkNotNullParameter(speech, "<set-?>");
        speechManager = speech;
    }
}
