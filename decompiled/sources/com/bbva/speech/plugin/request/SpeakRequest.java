package com.bbva.speech.plugin.request;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Request.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/bbva/speech/plugin/request/SpeakRequest;", "", "language", "", "text", "volume", "", "rate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)V", "getLanguage", "()Ljava/lang/String;", "getRate", "getText", "getVolume", "()Ljava/lang/Float;", "Ljava/lang/Float;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)Lcom/bbva/speech/plugin/request/SpeakRequest;", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "speech-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class SpeakRequest {

    @Nullable
    private final String language;

    @Nullable
    private final String rate;

    @Nullable
    private final String text;

    @Nullable
    private final Float volume;

    public SpeakRequest(@Nullable String str, @Nullable String str2, @Nullable Float f6, @Nullable String str3) {
        this.language = str;
        this.text = str2;
        this.volume = f6;
        this.rate = str3;
    }

    public static /* synthetic */ SpeakRequest copy$default(SpeakRequest speakRequest, String str, String str2, Float f6, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = speakRequest.language;
        }
        if ((i10 & 2) != 0) {
            str2 = speakRequest.text;
        }
        if ((i10 & 4) != 0) {
            f6 = speakRequest.volume;
        }
        if ((i10 & 8) != 0) {
            str3 = speakRequest.rate;
        }
        return speakRequest.copy(str, str2, f6, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getVolume() {
        return this.volume;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRate() {
        return this.rate;
    }

    @NotNull
    public final SpeakRequest copy(@Nullable String language, @Nullable String text, @Nullable Float volume, @Nullable String rate) {
        return new SpeakRequest(language, text, volume, rate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpeakRequest)) {
            return false;
        }
        SpeakRequest speakRequest = (SpeakRequest) other;
        return Intrinsics.areEqual(this.language, speakRequest.language) && Intrinsics.areEqual(this.text, speakRequest.text) && Intrinsics.areEqual((Object) this.volume, (Object) speakRequest.volume) && Intrinsics.areEqual(this.rate, speakRequest.rate);
    }

    @Nullable
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    public final String getRate() {
        return this.rate;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final Float getVolume() {
        return this.volume;
    }

    public int hashCode() {
        String str = this.language;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f6 = this.volume;
        int iHashCode3 = (iHashCode2 + (f6 == null ? 0 : f6.hashCode())) * 31;
        String str3 = this.rate;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SpeakRequest(language=" + ((Object) this.language) + ", text=" + ((Object) this.text) + ", volume=" + this.volume + ", rate=" + ((Object) this.rate) + RootService.CLOSE_BRACKET;
    }

    public /* synthetic */ SpeakRequest(String str, String str2, Float f6, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? Float.valueOf(1.0f) : f6, (i10 & 8) != 0 ? "normal" : str3);
    }
}
