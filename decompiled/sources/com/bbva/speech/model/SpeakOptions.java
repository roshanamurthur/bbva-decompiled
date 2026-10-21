package com.bbva.speech.model;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J>\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lcom/bbva/speech/model/SpeakOptions;", "", "text", "", "language", "Ljava/util/Locale;", "volume", "", "rate", "Lcom/bbva/speech/model/SpeechRate;", "(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/Float;Lcom/bbva/speech/model/SpeechRate;)V", "getLanguage", "()Ljava/util/Locale;", "setLanguage", "(Ljava/util/Locale;)V", "getRate", "()Lcom/bbva/speech/model/SpeechRate;", "setRate", "(Lcom/bbva/speech/model/SpeechRate;)V", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getVolume", "()Ljava/lang/Float;", "setVolume", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/Float;Lcom/bbva/speech/model/SpeechRate;)Lcom/bbva/speech/model/SpeakOptions;", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "speech_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class SpeakOptions {

    @Nullable
    private Locale language;

    @Nullable
    private SpeechRate rate;

    @Nullable
    private String text;

    @Nullable
    private Float volume;

    public SpeakOptions() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ SpeakOptions copy$default(SpeakOptions speakOptions, String str, Locale locale, Float f6, SpeechRate speechRate, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = speakOptions.text;
        }
        if ((i10 & 2) != 0) {
            locale = speakOptions.language;
        }
        if ((i10 & 4) != 0) {
            f6 = speakOptions.volume;
        }
        if ((i10 & 8) != 0) {
            speechRate = speakOptions.rate;
        }
        return speakOptions.copy(str, locale, f6, speechRate);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Locale getLanguage() {
        return this.language;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getVolume() {
        return this.volume;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SpeechRate getRate() {
        return this.rate;
    }

    @NotNull
    public final SpeakOptions copy(@Nullable String text, @Nullable Locale language, @Nullable Float volume, @Nullable SpeechRate rate) {
        return new SpeakOptions(text, language, volume, rate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpeakOptions)) {
            return false;
        }
        SpeakOptions speakOptions = (SpeakOptions) other;
        return Intrinsics.areEqual(this.text, speakOptions.text) && Intrinsics.areEqual(this.language, speakOptions.language) && Intrinsics.areEqual((Object) this.volume, (Object) speakOptions.volume) && this.rate == speakOptions.rate;
    }

    @Nullable
    public final Locale getLanguage() {
        return this.language;
    }

    @Nullable
    public final SpeechRate getRate() {
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
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Locale locale = this.language;
        int iHashCode2 = (iHashCode + (locale == null ? 0 : locale.hashCode())) * 31;
        Float f6 = this.volume;
        int iHashCode3 = (iHashCode2 + (f6 == null ? 0 : f6.hashCode())) * 31;
        SpeechRate speechRate = this.rate;
        return iHashCode3 + (speechRate != null ? speechRate.hashCode() : 0);
    }

    public final void setLanguage(@Nullable Locale locale) {
        this.language = locale;
    }

    public final void setRate(@Nullable SpeechRate speechRate) {
        this.rate = speechRate;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    public final void setVolume(@Nullable Float f6) {
        this.volume = f6;
    }

    @NotNull
    public String toString() {
        return "SpeakOptions(text=" + ((Object) this.text) + ", language=" + this.language + ", volume=" + this.volume + ", rate=" + this.rate + RootService.CLOSE_BRACKET;
    }

    public SpeakOptions(@Nullable String str, @Nullable Locale locale, @Nullable Float f6, @Nullable SpeechRate speechRate) {
        this.text = str;
        this.language = locale;
        this.volume = f6;
        this.rate = speechRate;
    }

    public /* synthetic */ SpeakOptions(String str, Locale locale, Float f6, SpeechRate speechRate, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : locale, (i10 & 4) != 0 ? Float.valueOf(1.0f) : f6, (i10 & 8) != 0 ? SpeechRate.NORMAL : speechRate);
    }
}
