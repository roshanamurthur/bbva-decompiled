package com.dasnano.vdphotoselfiecapture.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: compiled from: Challenge.kt */
/* JADX INFO: loaded from: classes9.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015J\u0019\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0015HÖ\u0001R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/dasnano/vdphotoselfiecapture/api/model/Challenge;", "Landroid/os/Parcelable;", "type", "", "actions", "", "Lcom/dasnano/vdphotoselfiecapture/api/model/Action;", "(Ljava/lang/String;[Lcom/dasnano/vdphotoselfiecapture/api/model/Action;)V", "getActions", "()[Lcom/dasnano/vdphotoselfiecapture/api/model/Action;", "setActions", "([Lcom/dasnano/vdphotoselfiecapture/api/model/Action;)V", "[Lcom/dasnano/vdphotoselfiecapture/api/model/Action;", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", "()Z", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "describeContents", "", "resetStartDetectionTime", "", "setTimeoutSeconds", "firstMovementTimeoutSeconds", "timeoutSeconds", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", ConstantsKt.TYPE, "photo-selfie-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Challenge implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Challenge> CREATOR = new Creator();

    @NotNull
    private Action[] actions;

    @SerializedName(Name.LABEL)
    @NotNull
    private String type;

    /* JADX INFO: compiled from: Challenge.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Challenge> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Challenge createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i10 = parcel.readInt();
            Action[] actionArr = new Action[i10];
            for (int i11 = 0; i11 != i10; i11++) {
                actionArr[i11] = Action.CREATOR.createFromParcel(parcel);
            }
            return new Challenge(string, actionArr);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Challenge[] newArray(int i10) {
            return new Challenge[i10];
        }
    }

    /* JADX INFO: compiled from: Challenge.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dasnano/vdphotoselfiecapture/api/model/Challenge$TYPE;", "", "()V", "SEQUENTIAL", "", "photo-selfie-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TYPE {

        @NotNull
        public static final TYPE INSTANCE = new TYPE();

        @NotNull
        public static final String SEQUENTIAL = "sequential";
    }

    public Challenge(@NotNull String type, @NotNull Action[] actions) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.type = type;
        this.actions = actions;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final Action[] getActions() {
        return this.actions;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final boolean isValid() {
        if (!Arrays.asList(Arrays.copyOf(new String[]{TYPE.SEQUENTIAL}, 1)).contains(this.type)) {
            return false;
        }
        for (Action action : this.actions) {
            if (!action.isValid()) {
                return false;
            }
        }
        return true;
    }

    public final void resetStartDetectionTime() {
        long time = new Date().getTime();
        for (Action action : this.actions) {
            action.setChallengeStartDetectionTime(time);
        }
    }

    public final void setActions(@NotNull Action[] actionArr) {
        Intrinsics.checkNotNullParameter(actionArr, "<set-?>");
        this.actions = actionArr;
    }

    public final void setTimeoutSeconds(int firstMovementTimeoutSeconds, int timeoutSeconds) {
        Action[] actionArr = this.actions;
        int length = actionArr.length;
        boolean z10 = true;
        int i10 = 0;
        while (i10 < length) {
            actionArr[i10].setTimeoutSeconds(z10 ? firstMovementTimeoutSeconds : timeoutSeconds);
            i10++;
            z10 = false;
        }
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.type);
        Action[] actionArr = this.actions;
        int length = actionArr.length;
        parcel.writeInt(length);
        for (int i10 = 0; i10 != length; i10++) {
            actionArr[i10].writeToParcel(parcel, flags);
        }
    }
}
