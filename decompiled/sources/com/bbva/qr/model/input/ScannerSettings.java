package com.bbva.qr.model.input;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0011JV\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010!J\t\u0010\"\u001a\u00020\tHÖ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\tHÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0019\u0010\u0011¨\u0006/"}, d2 = {"Lcom/bbva/qr/model/input/ScannerSettings;", "Landroid/os/Parcelable;", "codeType", "Lcom/bbva/qr/model/input/BarcodeType;", "cameraConfig", "Lcom/bbva/qr/model/input/CameraConfig;", "customViewConfig", "Lcom/bbva/qr/model/input/CustomViewConfig;", "requestCode", "", "overlayConfig", "Lcom/bbva/qr/model/input/OverlayConfig;", "cameraTimeout", "(Lcom/bbva/qr/model/input/BarcodeType;Lcom/bbva/qr/model/input/CameraConfig;Lcom/bbva/qr/model/input/CustomViewConfig;Ljava/lang/Integer;Lcom/bbva/qr/model/input/OverlayConfig;Ljava/lang/Integer;)V", "getCameraConfig", "()Lcom/bbva/qr/model/input/CameraConfig;", "getCameraTimeout", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCodeType", "()Lcom/bbva/qr/model/input/BarcodeType;", "getCustomViewConfig", "()Lcom/bbva/qr/model/input/CustomViewConfig;", "getOverlayConfig", "()Lcom/bbva/qr/model/input/OverlayConfig;", "getRequestCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/bbva/qr/model/input/BarcodeType;Lcom/bbva/qr/model/input/CameraConfig;Lcom/bbva/qr/model/input/CustomViewConfig;Ljava/lang/Integer;Lcom/bbva/qr/model/input/OverlayConfig;Ljava/lang/Integer;)Lcom/bbva/qr/model/input/ScannerSettings;", "describeContents", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "qr_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ScannerSettings implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ScannerSettings> CREATOR = new Creator();

    @Nullable
    private final CameraConfig cameraConfig;

    @Nullable
    private final Integer cameraTimeout;

    @Nullable
    private final BarcodeType codeType;

    @Nullable
    private final CustomViewConfig customViewConfig;

    @Nullable
    private final OverlayConfig overlayConfig;

    @Nullable
    private final Integer requestCode;

    /* JADX INFO: compiled from: ScannerConfig.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ScannerSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ScannerSettings createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ScannerSettings(parcel.readInt() == 0 ? null : BarcodeType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CameraConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CustomViewConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : OverlayConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ScannerSettings[] newArray(int i10) {
            return new ScannerSettings[i10];
        }
    }

    public ScannerSettings() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ ScannerSettings copy$default(ScannerSettings scannerSettings, BarcodeType barcodeType, CameraConfig cameraConfig, CustomViewConfig customViewConfig, Integer num, OverlayConfig overlayConfig, Integer num2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            barcodeType = scannerSettings.codeType;
        }
        if ((i10 & 2) != 0) {
            cameraConfig = scannerSettings.cameraConfig;
        }
        CameraConfig cameraConfig2 = cameraConfig;
        if ((i10 & 4) != 0) {
            customViewConfig = scannerSettings.customViewConfig;
        }
        CustomViewConfig customViewConfig2 = customViewConfig;
        if ((i10 & 8) != 0) {
            num = scannerSettings.requestCode;
        }
        Integer num3 = num;
        if ((i10 & 16) != 0) {
            overlayConfig = scannerSettings.overlayConfig;
        }
        OverlayConfig overlayConfig2 = overlayConfig;
        if ((i10 & 32) != 0) {
            num2 = scannerSettings.cameraTimeout;
        }
        return scannerSettings.copy(barcodeType, cameraConfig2, customViewConfig2, num3, overlayConfig2, num2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BarcodeType getCodeType() {
        return this.codeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CameraConfig getCameraConfig() {
        return this.cameraConfig;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CustomViewConfig getCustomViewConfig() {
        return this.customViewConfig;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getRequestCode() {
        return this.requestCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OverlayConfig getOverlayConfig() {
        return this.overlayConfig;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getCameraTimeout() {
        return this.cameraTimeout;
    }

    @NotNull
    public final ScannerSettings copy(@Nullable BarcodeType codeType, @Nullable CameraConfig cameraConfig, @Nullable CustomViewConfig customViewConfig, @Nullable Integer requestCode, @Nullable OverlayConfig overlayConfig, @Nullable Integer cameraTimeout) {
        return new ScannerSettings(codeType, cameraConfig, customViewConfig, requestCode, overlayConfig, cameraTimeout);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScannerSettings)) {
            return false;
        }
        ScannerSettings scannerSettings = (ScannerSettings) other;
        return this.codeType == scannerSettings.codeType && Intrinsics.areEqual(this.cameraConfig, scannerSettings.cameraConfig) && Intrinsics.areEqual(this.customViewConfig, scannerSettings.customViewConfig) && Intrinsics.areEqual(this.requestCode, scannerSettings.requestCode) && Intrinsics.areEqual(this.overlayConfig, scannerSettings.overlayConfig) && Intrinsics.areEqual(this.cameraTimeout, scannerSettings.cameraTimeout);
    }

    @Nullable
    public final CameraConfig getCameraConfig() {
        return this.cameraConfig;
    }

    @Nullable
    public final Integer getCameraTimeout() {
        return this.cameraTimeout;
    }

    @Nullable
    public final BarcodeType getCodeType() {
        return this.codeType;
    }

    @Nullable
    public final CustomViewConfig getCustomViewConfig() {
        return this.customViewConfig;
    }

    @Nullable
    public final OverlayConfig getOverlayConfig() {
        return this.overlayConfig;
    }

    @Nullable
    public final Integer getRequestCode() {
        return this.requestCode;
    }

    public int hashCode() {
        BarcodeType barcodeType = this.codeType;
        int iHashCode = (barcodeType == null ? 0 : barcodeType.hashCode()) * 31;
        CameraConfig cameraConfig = this.cameraConfig;
        int iHashCode2 = (iHashCode + (cameraConfig == null ? 0 : cameraConfig.hashCode())) * 31;
        CustomViewConfig customViewConfig = this.customViewConfig;
        int iHashCode3 = (iHashCode2 + (customViewConfig == null ? 0 : customViewConfig.hashCode())) * 31;
        Integer num = this.requestCode;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        OverlayConfig overlayConfig = this.overlayConfig;
        int iHashCode5 = (iHashCode4 + (overlayConfig == null ? 0 : overlayConfig.hashCode())) * 31;
        Integer num2 = this.cameraTimeout;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ScannerSettings(codeType=" + this.codeType + ", cameraConfig=" + this.cameraConfig + ", customViewConfig=" + this.customViewConfig + ", requestCode=" + this.requestCode + ", overlayConfig=" + this.overlayConfig + ", cameraTimeout=" + this.cameraTimeout + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        BarcodeType barcodeType = this.codeType;
        if (barcodeType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(barcodeType.name());
        }
        CameraConfig cameraConfig = this.cameraConfig;
        if (cameraConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cameraConfig.writeToParcel(parcel, flags);
        }
        CustomViewConfig customViewConfig = this.customViewConfig;
        if (customViewConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            customViewConfig.writeToParcel(parcel, flags);
        }
        Integer num = this.requestCode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        OverlayConfig overlayConfig = this.overlayConfig;
        if (overlayConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            overlayConfig.writeToParcel(parcel, flags);
        }
        Integer num2 = this.cameraTimeout;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public ScannerSettings(@Nullable BarcodeType barcodeType, @Nullable CameraConfig cameraConfig, @Nullable CustomViewConfig customViewConfig, @Nullable Integer num, @Nullable OverlayConfig overlayConfig, @Nullable Integer num2) {
        this.codeType = barcodeType;
        this.cameraConfig = cameraConfig;
        this.customViewConfig = customViewConfig;
        this.requestCode = num;
        this.overlayConfig = overlayConfig;
        this.cameraTimeout = num2;
    }

    public /* synthetic */ ScannerSettings(BarcodeType barcodeType, CameraConfig cameraConfig, CustomViewConfig customViewConfig, Integer num, OverlayConfig overlayConfig, Integer num2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? BarcodeType.QR : barcodeType, (i10 & 2) != 0 ? new CameraConfig(false, false, 3, null) : cameraConfig, (i10 & 4) != 0 ? new CustomViewConfig(null, null, null, 7, null) : customViewConfig, (i10 & 8) != 0 ? 1000 : num, (i10 & 16) != 0 ? new OverlayConfig(null, null, null, null, null, null, null, 127, null) : overlayConfig, (i10 & 32) == 0 ? num2 : null);
    }
}
