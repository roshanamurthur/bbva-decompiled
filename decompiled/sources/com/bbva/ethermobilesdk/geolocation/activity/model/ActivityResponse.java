package com.bbva.ethermobilesdk.geolocation.activity.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.collection.k;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActivityResponse.kt */
/* JADX INFO: loaded from: classes5.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u0003J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/bbva/ethermobilesdk/geolocation/activity/model/ActivityResponse;", "Landroid/os/Parcelable;", "activityID", "", "confidence", "<init>", "(II)V", "getActivityID", "()I", "getConfidence", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "geolocation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ActivityResponse implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ActivityResponse> CREATOR = new Creator();
    private final int activityID;
    private final int confidence;

    /* JADX INFO: compiled from: ActivityResponse.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ActivityResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ActivityResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ActivityResponse(parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ActivityResponse[] newArray(int i10) {
            return new ActivityResponse[i10];
        }
    }

    public ActivityResponse(int i10, int i11) {
        this.activityID = i10;
        this.confidence = i11;
    }

    public static /* synthetic */ ActivityResponse copy$default(ActivityResponse activityResponse, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = activityResponse.activityID;
        }
        if ((i12 & 2) != 0) {
            i11 = activityResponse.confidence;
        }
        return activityResponse.copy(i10, i11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getActivityID() {
        return this.activityID;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getConfidence() {
        return this.confidence;
    }

    @NotNull
    public final ActivityResponse copy(int activityID, int confidence) {
        return new ActivityResponse(activityID, confidence);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityResponse)) {
            return false;
        }
        ActivityResponse activityResponse = (ActivityResponse) other;
        return this.activityID == activityResponse.activityID && this.confidence == activityResponse.confidence;
    }

    public final int getActivityID() {
        return this.activityID;
    }

    public final int getConfidence() {
        return this.confidence;
    }

    public int hashCode() {
        return (this.activityID * 31) + this.confidence;
    }

    @NotNull
    public String toString() {
        return k.c("ActivityResponse(activityID=", this.activityID, ", confidence=", this.confidence, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.activityID);
        dest.writeInt(this.confidence);
    }
}
