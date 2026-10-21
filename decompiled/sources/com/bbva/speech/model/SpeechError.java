package com.bbva.speech.model;

import androidx.activity.a;
import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/bbva/speech/model/SpeechError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "code", "", "(I)V", "getCode", "()I", "component1", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "", "speech_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class SpeechError extends Exception {
    private final int code;

    public SpeechError(int i10) {
        this.code = i10;
    }

    public static /* synthetic */ SpeechError copy$default(SpeechError speechError, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = speechError.code;
        }
        return speechError.copy(i10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final SpeechError copy(int code) {
        return new SpeechError(code);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SpeechError) && this.code == ((SpeechError) other).code;
    }

    public final int getCode() {
        return this.code;
    }

    public int hashCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return a.d(new StringBuilder("SpeechError(code="), this.code, RootService.CLOSE_BRACKET);
    }
}
