package com.bbva.plugin.media.capture.command.param;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetPictureParams.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b7\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b@\u0010AJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJp\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R$\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010,R$\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\n\"\u0004\b0\u00101R$\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u0010\r\"\u0004\b5\u00106R$\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u00103\u001a\u0004\b8\u0010\r\"\u0004\b9\u00106R$\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u00103\u001a\u0004\b;\u0010\r\"\u0004\b<\u00106R$\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u00103\u001a\u0004\b>\u0010\r\"\u0004\b?\u00106¨\u0006B"}, d2 = {"Lcom/bbva/plugin/media/capture/command/param/GetPictureParams;", "", "", "component1", "component2", "", "component3", "()Ljava/lang/Float;", "", "component4", "()Ljava/lang/Integer;", "", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "component8", "source", "scaleType", "scaleRate", ValidatePasswordQualityUseCase.KEY_PASSWORD_QUALITY, "showMetadata", "base64", "grayscale", "monochrome", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/bbva/plugin/media/capture/command/param/GetPictureParams;", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getSource", "()Ljava/lang/String;", "setSource", "(Ljava/lang/String;)V", "b", "getScaleType", "setScaleType", "c", "Ljava/lang/Float;", "getScaleRate", "setScaleRate", "(Ljava/lang/Float;)V", "d", "Ljava/lang/Integer;", "getQuality", "setQuality", "(Ljava/lang/Integer;)V", "e", "Ljava/lang/Boolean;", "getShowMetadata", "setShowMetadata", "(Ljava/lang/Boolean;)V", "f", "getBase64", "setBase64", "g", "getGrayscale", "setGrayscale", "h", "getMonochrome", "setMonochrome", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
public final /* data */ class GetPictureParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("source")
    @Nullable
    private String source;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("scaleType")
    @Nullable
    private String scaleType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("scaleRate")
    @Nullable
    private Float scaleRate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName(ValidatePasswordQualityUseCase.KEY_PASSWORD_QUALITY)
    @Nullable
    private Integer quality;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("showMetadata")
    @Nullable
    private Boolean showMetadata;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("base64")
    @Nullable
    private Boolean base64;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("grayscale")
    @Nullable
    private Boolean grayscale;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("monochrome")
    @Nullable
    private Boolean monochrome;

    public GetPictureParams() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getScaleType() {
        return this.scaleType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getScaleRate() {
        return this.scaleRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getQuality() {
        return this.quality;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getShowMetadata() {
        return this.showMetadata;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getBase64() {
        return this.base64;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getGrayscale() {
        return this.grayscale;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getMonochrome() {
        return this.monochrome;
    }

    @NotNull
    public final GetPictureParams copy(@Nullable String source, @Nullable String scaleType, @Nullable Float scaleRate, @Nullable Integer quality, @Nullable Boolean showMetadata, @Nullable Boolean base64, @Nullable Boolean grayscale, @Nullable Boolean monochrome) {
        return new GetPictureParams(source, scaleType, scaleRate, quality, showMetadata, base64, grayscale, monochrome);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetPictureParams)) {
            return false;
        }
        GetPictureParams getPictureParams = (GetPictureParams) other;
        return Intrinsics.areEqual(this.source, getPictureParams.source) && Intrinsics.areEqual(this.scaleType, getPictureParams.scaleType) && Intrinsics.areEqual((Object) this.scaleRate, (Object) getPictureParams.scaleRate) && Intrinsics.areEqual(this.quality, getPictureParams.quality) && Intrinsics.areEqual(this.showMetadata, getPictureParams.showMetadata) && Intrinsics.areEqual(this.base64, getPictureParams.base64) && Intrinsics.areEqual(this.grayscale, getPictureParams.grayscale) && Intrinsics.areEqual(this.monochrome, getPictureParams.monochrome);
    }

    @Nullable
    public final Boolean getBase64() {
        return this.base64;
    }

    @Nullable
    public final Boolean getGrayscale() {
        return this.grayscale;
    }

    @Nullable
    public final Boolean getMonochrome() {
        return this.monochrome;
    }

    @Nullable
    public final Integer getQuality() {
        return this.quality;
    }

    @Nullable
    public final Float getScaleRate() {
        return this.scaleRate;
    }

    @Nullable
    public final String getScaleType() {
        return this.scaleType;
    }

    @Nullable
    public final Boolean getShowMetadata() {
        return this.showMetadata;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        String str = this.source;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.scaleType;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Float f6 = this.scaleRate;
        int iHashCode3 = (iHashCode2 + (f6 != null ? f6.hashCode() : 0)) * 31;
        Integer num = this.quality;
        int iHashCode4 = (iHashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.showMetadata;
        int iHashCode5 = (iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.base64;
        int iHashCode6 = (iHashCode5 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.grayscale;
        int iHashCode7 = (iHashCode6 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.monochrome;
        return iHashCode7 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final void setBase64(@Nullable Boolean bool) {
        this.base64 = bool;
    }

    public final void setGrayscale(@Nullable Boolean bool) {
        this.grayscale = bool;
    }

    public final void setMonochrome(@Nullable Boolean bool) {
        this.monochrome = bool;
    }

    public final void setQuality(@Nullable Integer num) {
        this.quality = num;
    }

    public final void setScaleRate(@Nullable Float f6) {
        this.scaleRate = f6;
    }

    public final void setScaleType(@Nullable String str) {
        this.scaleType = str;
    }

    public final void setShowMetadata(@Nullable Boolean bool) {
        this.showMetadata = bool;
    }

    public final void setSource(@Nullable String str) {
        this.source = str;
    }

    @NotNull
    public String toString() {
        return "GetPictureParams(source=" + this.source + ", scaleType=" + this.scaleType + ", scaleRate=" + this.scaleRate + ", quality=" + this.quality + ", showMetadata=" + this.showMetadata + ", base64=" + this.base64 + ", grayscale=" + this.grayscale + ", monochrome=" + this.monochrome + ")";
    }

    public GetPictureParams(@Nullable String str, @Nullable String str2, @Nullable Float f6, @Nullable Integer num, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4) {
        this.source = str;
        this.scaleType = str2;
        this.scaleRate = f6;
        this.quality = num;
        this.showMetadata = bool;
        this.base64 = bool2;
        this.grayscale = bool3;
        this.monochrome = bool4;
    }

    public /* synthetic */ GetPictureParams(String str, String str2, Float f6, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) == 0 ? str2 : null, (i10 & 4) != 0 ? Float.valueOf(0.0f) : f6, (i10 & 8) != 0 ? 100 : num, (i10 & 16) != 0 ? Boolean.FALSE : bool, (i10 & 32) != 0 ? Boolean.TRUE : bool2, (i10 & 64) != 0 ? Boolean.FALSE : bool3, (i10 & 128) != 0 ? Boolean.FALSE : bool4);
    }
}
