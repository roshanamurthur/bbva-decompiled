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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\rHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/bbva/qr/model/input/CameraConfig;", "Landroid/os/Parcelable;", "flash", "", "autoFocus", "(ZZ)V", "getAutoFocus", "()Z", "getFlash", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "qr_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CameraConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CameraConfig> CREATOR = new Creator();
    private final boolean autoFocus;
    private final boolean flash;

    /* JADX INFO: compiled from: ScannerConfig.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CameraConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CameraConfig createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CameraConfig(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CameraConfig[] newArray(int i10) {
            return new CameraConfig[i10];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CameraConfig() {
        boolean z10 = false;
        this(z10, z10, 3, null);
    }

    public static /* synthetic */ CameraConfig copy$default(CameraConfig cameraConfig, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = cameraConfig.flash;
        }
        if ((i10 & 2) != 0) {
            z11 = cameraConfig.autoFocus;
        }
        return cameraConfig.copy(z10, z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getFlash() {
        return this.flash;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getAutoFocus() {
        return this.autoFocus;
    }

    @NotNull
    public final CameraConfig copy(boolean flash, boolean autoFocus) {
        return new CameraConfig(flash, autoFocus);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraConfig)) {
            return false;
        }
        CameraConfig cameraConfig = (CameraConfig) other;
        return this.flash == cameraConfig.flash && this.autoFocus == cameraConfig.autoFocus;
    }

    public final boolean getAutoFocus() {
        return this.autoFocus;
    }

    public final boolean getFlash() {
        return this.flash;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z10 = this.flash;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        int i10 = r1 * 31;
        boolean z11 = this.autoFocus;
        return i10 + (z11 ? 1 : z11);
    }

    @NotNull
    public String toString() {
        return "CameraConfig(flash=" + this.flash + ", autoFocus=" + this.autoFocus + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.flash ? 1 : 0);
        parcel.writeInt(this.autoFocus ? 1 : 0);
    }

    public CameraConfig(boolean z10, boolean z11) {
        this.flash = z10;
        this.autoFocus = z11;
    }

    public /* synthetic */ CameraConfig(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? true : z11);
    }
}
