package com.bbva.qr.model.input;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ScannerConfig.kt */
/* JADX INFO: loaded from: classes8.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016Jb\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010!J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\u0013\u0010#\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0006HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u000b\u0010\u0016R\u0015\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\f\u0010\u0016R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016¨\u0006-"}, d2 = {"Lcom/bbva/qr/model/input/OverlayConfig;", "Landroid/os/Parcelable;", "backgroundColor", "", "captureFrameColor", "borderWidth", "", "onlyCorners", "", "aspectRatio", "Lcom/bbva/qr/model/input/AspectRatio;", "isFrameVisible", "isImageVisible", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/bbva/qr/model/input/AspectRatio;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAspectRatio", "()Lcom/bbva/qr/model/input/AspectRatio;", "getBackgroundColor", "()Ljava/lang/String;", "getBorderWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCaptureFrameColor", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOnlyCorners", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/bbva/qr/model/input/AspectRatio;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/bbva/qr/model/input/OverlayConfig;", "describeContents", "equals", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "qr_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OverlayConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OverlayConfig> CREATOR = new Creator();

    @Nullable
    private final AspectRatio aspectRatio;

    @Nullable
    private final String backgroundColor;

    @Nullable
    private final Integer borderWidth;

    @Nullable
    private final String captureFrameColor;

    @Nullable
    private final Boolean isFrameVisible;

    @Nullable
    private final Boolean isImageVisible;

    @Nullable
    private final Boolean onlyCorners;

    /* JADX INFO: compiled from: ScannerConfig.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OverlayConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OverlayConfig createFromParcel(@NotNull Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            AspectRatio aspectRatioValueOf = parcel.readInt() == 0 ? null : AspectRatio.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new OverlayConfig(string, string2, numValueOf, boolValueOf, aspectRatioValueOf, boolValueOf2, boolValueOf3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OverlayConfig[] newArray(int i10) {
            return new OverlayConfig[i10];
        }
    }

    public OverlayConfig() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OverlayConfig copy$default(OverlayConfig overlayConfig, String str, String str2, Integer num, Boolean bool, AspectRatio aspectRatio, Boolean bool2, Boolean bool3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = overlayConfig.backgroundColor;
        }
        if ((i10 & 2) != 0) {
            str2 = overlayConfig.captureFrameColor;
        }
        String str3 = str2;
        if ((i10 & 4) != 0) {
            num = overlayConfig.borderWidth;
        }
        Integer num2 = num;
        if ((i10 & 8) != 0) {
            bool = overlayConfig.onlyCorners;
        }
        Boolean bool4 = bool;
        if ((i10 & 16) != 0) {
            aspectRatio = overlayConfig.aspectRatio;
        }
        AspectRatio aspectRatio2 = aspectRatio;
        if ((i10 & 32) != 0) {
            bool2 = overlayConfig.isFrameVisible;
        }
        Boolean bool5 = bool2;
        if ((i10 & 64) != 0) {
            bool3 = overlayConfig.isImageVisible;
        }
        return overlayConfig.copy(str, str3, num2, bool4, aspectRatio2, bool5, bool3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCaptureFrameColor() {
        return this.captureFrameColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getBorderWidth() {
        return this.borderWidth;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getOnlyCorners() {
        return this.onlyCorners;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AspectRatio getAspectRatio() {
        return this.aspectRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsFrameVisible() {
        return this.isFrameVisible;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsImageVisible() {
        return this.isImageVisible;
    }

    @NotNull
    public final OverlayConfig copy(@Nullable String backgroundColor, @Nullable String captureFrameColor, @Nullable Integer borderWidth, @Nullable Boolean onlyCorners, @Nullable AspectRatio aspectRatio, @Nullable Boolean isFrameVisible, @Nullable Boolean isImageVisible) {
        return new OverlayConfig(backgroundColor, captureFrameColor, borderWidth, onlyCorners, aspectRatio, isFrameVisible, isImageVisible);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OverlayConfig)) {
            return false;
        }
        OverlayConfig overlayConfig = (OverlayConfig) other;
        return Intrinsics.areEqual(this.backgroundColor, overlayConfig.backgroundColor) && Intrinsics.areEqual(this.captureFrameColor, overlayConfig.captureFrameColor) && Intrinsics.areEqual(this.borderWidth, overlayConfig.borderWidth) && Intrinsics.areEqual(this.onlyCorners, overlayConfig.onlyCorners) && this.aspectRatio == overlayConfig.aspectRatio && Intrinsics.areEqual(this.isFrameVisible, overlayConfig.isFrameVisible) && Intrinsics.areEqual(this.isImageVisible, overlayConfig.isImageVisible);
    }

    @Nullable
    public final AspectRatio getAspectRatio() {
        return this.aspectRatio;
    }

    @Nullable
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    public final Integer getBorderWidth() {
        return this.borderWidth;
    }

    @Nullable
    public final String getCaptureFrameColor() {
        return this.captureFrameColor;
    }

    @Nullable
    public final Boolean getOnlyCorners() {
        return this.onlyCorners;
    }

    public int hashCode() {
        String str = this.backgroundColor;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.captureFrameColor;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.borderWidth;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.onlyCorners;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        AspectRatio aspectRatio = this.aspectRatio;
        int iHashCode5 = (iHashCode4 + (aspectRatio == null ? 0 : aspectRatio.hashCode())) * 31;
        Boolean bool2 = this.isFrameVisible;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isImageVisible;
        return iHashCode6 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @Nullable
    public final Boolean isFrameVisible() {
        return this.isFrameVisible;
    }

    @Nullable
    public final Boolean isImageVisible() {
        return this.isImageVisible;
    }

    @NotNull
    public String toString() {
        String str = this.backgroundColor;
        String str2 = this.captureFrameColor;
        Integer num = this.borderWidth;
        Boolean bool = this.onlyCorners;
        AspectRatio aspectRatio = this.aspectRatio;
        Boolean bool2 = this.isFrameVisible;
        Boolean bool3 = this.isImageVisible;
        StringBuilder sbC = a.c("OverlayConfig(backgroundColor=", str, ", captureFrameColor=", str2, ", borderWidth=");
        sbC.append(num);
        sbC.append(", onlyCorners=");
        sbC.append(bool);
        sbC.append(", aspectRatio=");
        sbC.append(aspectRatio);
        sbC.append(", isFrameVisible=");
        sbC.append(bool2);
        sbC.append(", isImageVisible=");
        sbC.append(bool3);
        sbC.append(")");
        return sbC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.backgroundColor);
        parcel.writeString(this.captureFrameColor);
        Integer num = this.borderWidth;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool = this.onlyCorners;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        AspectRatio aspectRatio = this.aspectRatio;
        if (aspectRatio == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(aspectRatio.name());
        }
        Boolean bool2 = this.isFrameVisible;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.isImageVisible;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
    }

    public OverlayConfig(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Boolean bool, @Nullable AspectRatio aspectRatio, @Nullable Boolean bool2, @Nullable Boolean bool3) {
        this.backgroundColor = str;
        this.captureFrameColor = str2;
        this.borderWidth = num;
        this.onlyCorners = bool;
        this.aspectRatio = aspectRatio;
        this.isFrameVisible = bool2;
        this.isImageVisible = bool3;
    }

    public /* synthetic */ OverlayConfig(String str, String str2, Integer num, Boolean bool, AspectRatio aspectRatio, Boolean bool2, Boolean bool3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) == 0 ? num : null, (i10 & 8) != 0 ? Boolean.FALSE : bool, (i10 & 16) != 0 ? AspectRatio.SQUARE : aspectRatio, (i10 & 32) != 0 ? Boolean.TRUE : bool2, (i10 & 64) != 0 ? Boolean.TRUE : bool3);
    }
}
