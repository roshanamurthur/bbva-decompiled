package com.salesforce.marketingcloud.proximity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.salesforce.marketingcloud.messages.Region;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Parcelize
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b \u0010!B\u0011\b\u0010\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b \u0010$J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J1\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\u001e¨\u0006%"}, d2 = {"Lcom/salesforce/marketingcloud/proximity/c;", "Landroid/os/Parcelable;", "", "a", "b", "", "c", "d", "id", "guid", "major", "minor", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "e", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "g", "()I", "h", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "Lcom/salesforce/marketingcloud/messages/Region;", "region", "(Lcom/salesforce/marketingcloud/messages/Region;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class c implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final String guid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int major;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int minor;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new c(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c[] newArray(int i10) {
            return new c[i10];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(@NotNull Region region) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(region, "region");
        String strId = region.id();
        String strProximityUuid = region.proximityUuid();
        if (strProximityUuid == null) {
            throw new IllegalArgumentException("Not a beacon region");
        }
        this(strId, strProximityUuid, region.major(), region.minor());
    }

    public static /* synthetic */ c a(c cVar, String str, String str2, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = cVar.id;
        }
        if ((i12 & 2) != 0) {
            str2 = cVar.guid;
        }
        if ((i12 & 4) != 0) {
            i10 = cVar.major;
        }
        if ((i12 & 8) != 0) {
            i11 = cVar.minor;
        }
        return cVar.a(str, str2, i10, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getGuid() {
        return this.guid;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMajor() {
        return this.major;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMinor() {
        return this.minor;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final String e() {
        return this.guid;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return Intrinsics.areEqual(this.id, cVar.id) && Intrinsics.areEqual(this.guid, cVar.guid) && this.major == cVar.major && this.minor == cVar.minor;
    }

    @NotNull
    public final String f() {
        return this.id;
    }

    public final int g() {
        return this.major;
    }

    public final int h() {
        return this.minor;
    }

    public int hashCode() {
        return ((n1.c(this.guid, this.id.hashCode() * 31, 31) + this.major) * 31) + this.minor;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeaconRegion(id=");
        sb2.append(this.id);
        sb2.append(", guid=");
        sb2.append(this.guid);
        sb2.append(", major=");
        sb2.append(this.major);
        sb2.append(", minor=");
        return androidx.activity.a.d(sb2, this.minor, RootService.CLOSE_BRACKET);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.guid);
        parcel.writeInt(this.major);
        parcel.writeInt(this.minor);
    }

    public c(@NotNull String id, @NotNull String guid, int i10, int i11) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(guid, "guid");
        this.id = id;
        this.guid = guid;
        this.major = i10;
        this.minor = i11;
    }

    @NotNull
    public final c a(@NotNull String id, @NotNull String guid, int major, int minor) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(guid, "guid");
        return new c(id, guid, major, minor);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }
}
