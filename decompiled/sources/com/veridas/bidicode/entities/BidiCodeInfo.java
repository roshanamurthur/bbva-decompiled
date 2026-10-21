package com.veridas.bidicode.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.i;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BidiCodeInfo.kt */
/* JADX INFO: loaded from: classes9.dex */
@Parcelize
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\rHÖ\u0001R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\n\u0010$\"\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/veridas/bidicode/entities/BidiCodeInfo;", "Landroid/os/Parcelable;", "Lcom/veridas/bidicode/entities/BidiCodePlacement;", "component1", "", "component2", "", "component3", "placement", "data", "isRead", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "p0", "Lcom/veridas/bidicode/entities/BidiCodePlacement;", "getPlacement", "()Lcom/veridas/bidicode/entities/BidiCodePlacement;", "q0", "Ljava/lang/String;", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "r0", "Z", "()Z", "setRead", "(Z)V", "<init>", "(Lcom/veridas/bidicode/entities/BidiCodePlacement;Ljava/lang/String;Z)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class BidiCodeInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BidiCodeInfo> CREATOR = new Creator();

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final BidiCodePlacement placement;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String data;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public boolean isRead;

    /* JADX INFO: compiled from: BidiCodeInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BidiCodeInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BidiCodeInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BidiCodeInfo(BidiCodePlacement.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BidiCodeInfo[] newArray(int i10) {
            return new BidiCodeInfo[i10];
        }
    }

    public BidiCodeInfo(@NotNull BidiCodePlacement placement, @NotNull String data, boolean z10) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(data, "data");
        this.placement = placement;
        this.data = data;
        this.isRead = z10;
    }

    public static /* synthetic */ BidiCodeInfo copy$default(BidiCodeInfo bidiCodeInfo, BidiCodePlacement bidiCodePlacement, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bidiCodePlacement = bidiCodeInfo.placement;
        }
        if ((i10 & 2) != 0) {
            str = bidiCodeInfo.data;
        }
        if ((i10 & 4) != 0) {
            z10 = bidiCodeInfo.isRead;
        }
        return bidiCodeInfo.copy(bidiCodePlacement, str, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BidiCodePlacement getPlacement() {
        return this.placement;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsRead() {
        return this.isRead;
    }

    @NotNull
    public final BidiCodeInfo copy(@NotNull BidiCodePlacement placement, @NotNull String data, boolean isRead) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(data, "data");
        return new BidiCodeInfo(placement, data, isRead);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BidiCodeInfo)) {
            return false;
        }
        BidiCodeInfo bidiCodeInfo = (BidiCodeInfo) other;
        return Intrinsics.areEqual(this.placement, bidiCodeInfo.placement) && Intrinsics.areEqual(this.data, bidiCodeInfo.data) && this.isRead == bidiCodeInfo.isRead;
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final BidiCodePlacement getPlacement() {
        return this.placement;
    }

    public int hashCode() {
        return n1.c(this.data, this.placement.hashCode() * 31, 31) + (this.isRead ? 1231 : 1237);
    }

    public final boolean isRead() {
        return this.isRead;
    }

    public final void setData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data = str;
    }

    public final void setRead(boolean z10) {
        this.isRead = z10;
    }

    @NotNull
    public String toString() {
        String str = this.data;
        boolean z10 = this.isRead;
        StringBuilder sb2 = new StringBuilder("BidiCodeInfo(placement=");
        sb2.append(this.placement);
        sb2.append(", data=");
        sb2.append(str);
        sb2.append(", isRead=");
        return i.c(sb2, z10, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.placement.writeToParcel(parcel, flags);
        parcel.writeString(this.data);
        parcel.writeInt(this.isRead ? 1 : 0);
    }

    public /* synthetic */ BidiCodeInfo(BidiCodePlacement bidiCodePlacement, String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bidiCodePlacement, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? false : z10);
    }
}
