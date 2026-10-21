package com.bbva.speech.model;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/bbva/speech/model/RecognizerResult;", "", "fullResult", "", "partialResults", "(Ljava/lang/String;Ljava/lang/String;)V", "getFullResult", "()Ljava/lang/String;", "getPartialResults", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "speech_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class RecognizerResult {

    @Nullable
    private final String fullResult;

    @Nullable
    private final String partialResults;

    /* JADX WARN: Multi-variable type inference failed */
    public RecognizerResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RecognizerResult copy$default(RecognizerResult recognizerResult, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = recognizerResult.fullResult;
        }
        if ((i10 & 2) != 0) {
            str2 = recognizerResult.partialResults;
        }
        return recognizerResult.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFullResult() {
        return this.fullResult;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPartialResults() {
        return this.partialResults;
    }

    @NotNull
    public final RecognizerResult copy(@Nullable String fullResult, @Nullable String partialResults) {
        return new RecognizerResult(fullResult, partialResults);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecognizerResult)) {
            return false;
        }
        RecognizerResult recognizerResult = (RecognizerResult) other;
        return Intrinsics.areEqual(this.fullResult, recognizerResult.fullResult) && Intrinsics.areEqual(this.partialResults, recognizerResult.partialResults);
    }

    @Nullable
    public final String getFullResult() {
        return this.fullResult;
    }

    @Nullable
    public final String getPartialResults() {
        return this.partialResults;
    }

    public int hashCode() {
        String str = this.fullResult;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.partialResults;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RecognizerResult(fullResult=" + ((Object) this.fullResult) + ", partialResults=" + ((Object) this.partialResults) + RootService.CLOSE_BRACKET;
    }

    public RecognizerResult(@Nullable String str, @Nullable String str2) {
        this.fullResult = str;
        this.partialResults = str2;
    }

    public /* synthetic */ RecognizerResult(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
