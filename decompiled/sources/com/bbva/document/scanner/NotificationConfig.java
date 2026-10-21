package com.bbva.document.scanner;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CaptureOptions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Parcelize
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u0010\u001a\u00020\nHÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nHÖ\u0001R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/bbva/document/scanner/NotificationConfig;", "Landroid/os/Parcelable;", "", "component1", "", "component2", "text", TypedValues.TransitionType.S_DURATION, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "p0", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "q0", "J", "getDuration", "()J", "<init>", "(Ljava/lang/String;J)V", "document-scanner_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class NotificationConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NotificationConfig> CREATOR = new Creator();

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String text;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public final long duration;

    /* JADX INFO: compiled from: CaptureOptions.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NotificationConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final NotificationConfig createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NotificationConfig(parcel.readString(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final NotificationConfig[] newArray(int i10) {
            return new NotificationConfig[i10];
        }
    }

    public NotificationConfig() {
        this(null, 0L, 3, null);
    }

    public static /* synthetic */ NotificationConfig copy$default(NotificationConfig notificationConfig, String str, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = notificationConfig.text;
        }
        if ((i10 & 2) != 0) {
            j10 = notificationConfig.duration;
        }
        return notificationConfig.copy(str, j10);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    public final NotificationConfig copy(@Nullable String text, long duration) {
        return new NotificationConfig(text, duration);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationConfig)) {
            return false;
        }
        NotificationConfig notificationConfig = (NotificationConfig) other;
        return Intrinsics.areEqual(this.text, notificationConfig.text) && this.duration == notificationConfig.duration;
    }

    public final long getDuration() {
        return this.duration;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.duration;
        return (iHashCode * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    @NotNull
    public String toString() {
        return "NotificationConfig(text=" + this.text + ", duration=" + this.duration + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.text);
        parcel.writeLong(this.duration);
    }

    public NotificationConfig(@Nullable String str, long j10) {
        this.text = str;
        this.duration = j10;
    }

    public /* synthetic */ NotificationConfig(String str, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? 2000L : j10);
    }
}
