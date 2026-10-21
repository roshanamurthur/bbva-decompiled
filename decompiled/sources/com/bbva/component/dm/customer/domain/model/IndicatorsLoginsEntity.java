package com.bbva.component.dm.customer.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IndicatorModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/bbva/component/dm/customer/domain/model/IndicatorsLoginsEntity;", "Landroid/os/Parcelable;", "Lcom/bbva/component/dm/customer/domain/model/IndicatorResponse;", "data", "Lcom/bbva/component/dm/customer/domain/model/IndicatorsDataLogins;", "(Lcom/bbva/component/dm/customer/domain/model/IndicatorsDataLogins;)V", "getData", "()Lcom/bbva/component/dm/customer/domain/model/IndicatorsDataLogins;", "component1", "copy", "describeContents", "", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class IndicatorsLoginsEntity implements Parcelable, IndicatorResponse {

    @NotNull
    public static final Parcelable.Creator<IndicatorsLoginsEntity> CREATOR = new Creator();

    @NotNull
    private final IndicatorsDataLogins data;

    /* JADX INFO: compiled from: IndicatorModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IndicatorsLoginsEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final IndicatorsLoginsEntity createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IndicatorsLoginsEntity(IndicatorsDataLogins.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final IndicatorsLoginsEntity[] newArray(int i10) {
            return new IndicatorsLoginsEntity[i10];
        }
    }

    public IndicatorsLoginsEntity(@NotNull IndicatorsDataLogins data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public static /* synthetic */ IndicatorsLoginsEntity copy$default(IndicatorsLoginsEntity indicatorsLoginsEntity, IndicatorsDataLogins indicatorsDataLogins, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            indicatorsDataLogins = indicatorsLoginsEntity.data;
        }
        return indicatorsLoginsEntity.copy(indicatorsDataLogins);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final IndicatorsDataLogins getData() {
        return this.data;
    }

    @NotNull
    public final IndicatorsLoginsEntity copy(@NotNull IndicatorsDataLogins data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new IndicatorsLoginsEntity(data);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IndicatorsLoginsEntity) && Intrinsics.areEqual(this.data, ((IndicatorsLoginsEntity) other).data);
    }

    @NotNull
    public final IndicatorsDataLogins getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "IndicatorsLoginsEntity(data=" + this.data + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.data.writeToParcel(parcel, flags);
    }
}
