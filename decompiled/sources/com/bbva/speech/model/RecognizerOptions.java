package com.bbva.speech.model;

import androidx.annotation.Keep;
import bc.org.bouncycastle.math.ec.custom.sec.a;
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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J:\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/bbva/speech/model/RecognizerOptions;", "", "autoStopAfter", "", "language", "", "onDeviceOnly", "", "partialResults", "(Ljava/lang/Long;Ljava/lang/String;ZZ)V", "getAutoStopAfter", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLanguage", "()Ljava/lang/String;", "getOnDeviceOnly", "()Z", "getPartialResults", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/String;ZZ)Lcom/bbva/speech/model/RecognizerOptions;", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "speech_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class RecognizerOptions {

    @Nullable
    private final Long autoStopAfter;

    @Nullable
    private final String language;
    private final boolean onDeviceOnly;
    private final boolean partialResults;

    public RecognizerOptions() {
        this(null, null, false, false, 15, null);
    }

    public static /* synthetic */ RecognizerOptions copy$default(RecognizerOptions recognizerOptions, Long l6, String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l6 = recognizerOptions.autoStopAfter;
        }
        if ((i10 & 2) != 0) {
            str = recognizerOptions.language;
        }
        if ((i10 & 4) != 0) {
            z10 = recognizerOptions.onDeviceOnly;
        }
        if ((i10 & 8) != 0) {
            z11 = recognizerOptions.partialResults;
        }
        return recognizerOptions.copy(l6, str, z10, z11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getAutoStopAfter() {
        return this.autoStopAfter;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getOnDeviceOnly() {
        return this.onDeviceOnly;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getPartialResults() {
        return this.partialResults;
    }

    @NotNull
    public final RecognizerOptions copy(@Nullable Long autoStopAfter, @Nullable String language, boolean onDeviceOnly, boolean partialResults) {
        return new RecognizerOptions(autoStopAfter, language, onDeviceOnly, partialResults);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecognizerOptions)) {
            return false;
        }
        RecognizerOptions recognizerOptions = (RecognizerOptions) other;
        return Intrinsics.areEqual(this.autoStopAfter, recognizerOptions.autoStopAfter) && Intrinsics.areEqual(this.language, recognizerOptions.language) && this.onDeviceOnly == recognizerOptions.onDeviceOnly && this.partialResults == recognizerOptions.partialResults;
    }

    @Nullable
    public final Long getAutoStopAfter() {
        return this.autoStopAfter;
    }

    @Nullable
    public final String getLanguage() {
        return this.language;
    }

    public final boolean getOnDeviceOnly() {
        return this.onDeviceOnly;
    }

    public final boolean getPartialResults() {
        return this.partialResults;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public int hashCode() {
        Long l6 = this.autoStopAfter;
        int iHashCode = (l6 == null ? 0 : l6.hashCode()) * 31;
        String str = this.language;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        boolean z10 = this.onDeviceOnly;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        int i10 = (iHashCode2 + r1) * 31;
        boolean z11 = this.partialResults;
        return i10 + (z11 ? 1 : z11);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RecognizerOptions(autoStopAfter=");
        sb2.append(this.autoStopAfter);
        sb2.append(", language=");
        sb2.append((Object) this.language);
        sb2.append(", onDeviceOnly=");
        sb2.append(this.onDeviceOnly);
        sb2.append(", partialResults=");
        return a.d(sb2, this.partialResults, RootService.CLOSE_BRACKET);
    }

    public RecognizerOptions(@Nullable Long l6, @Nullable String str, boolean z10, boolean z11) {
        this.autoStopAfter = l6;
        this.language = str;
        this.onDeviceOnly = z10;
        this.partialResults = z11;
    }

    public /* synthetic */ RecognizerOptions(Long l6, String str, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : l6, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11);
    }
}
