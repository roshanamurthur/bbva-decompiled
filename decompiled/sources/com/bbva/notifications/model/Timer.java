package com.bbva.notifications.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.h;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Timer.kt */
/* JADX INFO: loaded from: classes7.dex */
@Parcelize
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000e\u001a\u00020\bHÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/bbva/notifications/model/Timer;", "Landroid/os/Parcelable;", "", "component1", "timeStamp", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "p0", "J", "getTimeStamp", "()J", "<init>", "(J)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class Timer implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Timer> CREATOR = new Creator();

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final long timeStamp;

    /* JADX INFO: compiled from: Timer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Timer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Timer createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Timer(parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Timer[] newArray(int i10) {
            return new Timer[i10];
        }
    }

    public Timer(long j10) {
        this.timeStamp = j10;
    }

    public static /* synthetic */ Timer copy$default(Timer timer, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = timer.timeStamp;
        }
        return timer.copy(j10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    public final Timer copy(long timeStamp) {
        return new Timer(timeStamp);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Timer) && this.timeStamp == ((Timer) other).timeStamp;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        long j10 = this.timeStamp;
        return (int) (j10 ^ (j10 >>> 32));
    }

    @NotNull
    public String toString() {
        return h.d(new StringBuilder("Timer(timeStamp="), this.timeStamp, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeLong(this.timeStamp);
    }
}
