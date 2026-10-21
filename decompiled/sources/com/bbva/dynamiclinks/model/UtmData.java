package com.bbva.dynamiclinks.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DataModel.kt */
/* JADX INFO: loaded from: classes4.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/bbva/dynamiclinks/model/UtmData;", "Landroid/os/Parcelable;", "campaign", "", "medium", "source", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCampaign", "()Ljava/lang/String;", "getMedium", "getSource", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "dynamiclinks_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class UtmData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UtmData> CREATOR = new Creator();

    @NotNull
    private final String campaign;

    @NotNull
    private final String medium;

    @NotNull
    private final String source;

    /* JADX INFO: compiled from: DataModel.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UtmData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UtmData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UtmData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UtmData[] newArray(int i10) {
            return new UtmData[i10];
        }
    }

    public UtmData(@NotNull String campaign, @NotNull String medium, @NotNull String source) {
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        Intrinsics.checkNotNullParameter(medium, "medium");
        Intrinsics.checkNotNullParameter(source, "source");
        this.campaign = campaign;
        this.medium = medium;
        this.source = source;
    }

    public static /* synthetic */ UtmData copy$default(UtmData utmData, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = utmData.campaign;
        }
        if ((i10 & 2) != 0) {
            str2 = utmData.medium;
        }
        if ((i10 & 4) != 0) {
            str3 = utmData.source;
        }
        return utmData.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCampaign() {
        return this.campaign;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMedium() {
        return this.medium;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final UtmData copy(@NotNull String campaign, @NotNull String medium, @NotNull String source) {
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        Intrinsics.checkNotNullParameter(medium, "medium");
        Intrinsics.checkNotNullParameter(source, "source");
        return new UtmData(campaign, medium, source);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UtmData)) {
            return false;
        }
        UtmData utmData = (UtmData) other;
        return Intrinsics.areEqual(this.campaign, utmData.campaign) && Intrinsics.areEqual(this.medium, utmData.medium) && Intrinsics.areEqual(this.source, utmData.source);
    }

    @NotNull
    public final String getCampaign() {
        return this.campaign;
    }

    @NotNull
    public final String getMedium() {
        return this.medium;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        return this.source.hashCode() + n1.c(this.medium, this.campaign.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UtmData(campaign=");
        sb2.append(this.campaign);
        sb2.append(", medium=");
        sb2.append(this.medium);
        sb2.append(", source=");
        return y2.b(sb2, this.source, RootService.CLOSE_BRACKET);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.campaign);
        parcel.writeString(this.medium);
        parcel.writeString(this.source);
    }
}
