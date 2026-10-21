package com.dasnano.vdphotoselfiecapture.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Parameters.kt */
/* JADX INFO: loaded from: classes9.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/dasnano/vdphotoselfiecapture/api/model/Parameters;", "Landroid/os/Parcelable;", "direction", "", "(Ljava/lang/String;)V", "getDirection", "()Ljava/lang/String;", "setDirection", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", "()Z", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "DIRECTION", "photo-selfie-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Parameters implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Parameters> CREATOR = new Creator();

    @NotNull
    private String direction;

    /* JADX INFO: compiled from: Parameters.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Parameters> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Parameters createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Parameters(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Parameters[] newArray(int i10) {
            return new Parameters[i10];
        }
    }

    /* JADX INFO: compiled from: Parameters.kt */
    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/dasnano/vdphotoselfiecapture/api/model/Parameters$DIRECTION;", "", "()V", "BOTTOM", "", "LEFT", "RIGHT", "TOP", "photo-selfie-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DIRECTION {

        @NotNull
        public static final String BOTTOM = "bottom";

        @NotNull
        public static final DIRECTION INSTANCE = new DIRECTION();

        @NotNull
        public static final String LEFT = "left";

        @NotNull
        public static final String RIGHT = "right";

        @NotNull
        public static final String TOP = "top";

        private DIRECTION() {
        }
    }

    public Parameters(@NotNull String direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.direction = direction;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final String getDirection() {
        return this.direction;
    }

    public final boolean isValid() {
        return Arrays.asList(Arrays.copyOf(new String[]{"bottom", "top", DIRECTION.LEFT, DIRECTION.RIGHT}, 4)).contains(this.direction);
    }

    public final void setDirection(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.direction = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.direction);
    }
}
