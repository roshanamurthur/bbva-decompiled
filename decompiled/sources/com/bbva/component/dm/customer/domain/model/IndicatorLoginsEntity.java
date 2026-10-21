package com.bbva.component.dm.customer.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.i;
import androidx.camera.camera2.internal.n1;
import androidx.constraintlayout.core.parser.a;
import bk.q;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IndicatorModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0011HÖ\u0001J\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u0017J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/bbva/component/dm/customer/domain/model/IndicatorLoginsEntity;", "Landroid/os/Parcelable;", "id", "", "description", "isActive", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getDescription", "()Ljava/lang/String;", "getId", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", GenerateActivationFormCommand.HASH_CODE, "toMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class IndicatorLoginsEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IndicatorLoginsEntity> CREATOR = new Creator();

    @NotNull
    private final String description;

    @NotNull
    private final String id;
    private final boolean isActive;

    /* JADX INFO: compiled from: IndicatorModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IndicatorLoginsEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final IndicatorLoginsEntity createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IndicatorLoginsEntity(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final IndicatorLoginsEntity[] newArray(int i10) {
            return new IndicatorLoginsEntity[i10];
        }
    }

    public IndicatorLoginsEntity(@NotNull String id, @NotNull String description, boolean z10) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(description, "description");
        this.id = id;
        this.description = description;
        this.isActive = z10;
    }

    public static /* synthetic */ IndicatorLoginsEntity copy$default(IndicatorLoginsEntity indicatorLoginsEntity, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = indicatorLoginsEntity.id;
        }
        if ((i10 & 2) != 0) {
            str2 = indicatorLoginsEntity.description;
        }
        if ((i10 & 4) != 0) {
            z10 = indicatorLoginsEntity.isActive;
        }
        return indicatorLoginsEntity.copy(str, str2, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    @NotNull
    public final IndicatorLoginsEntity copy(@NotNull String id, @NotNull String description, boolean isActive) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(description, "description");
        return new IndicatorLoginsEntity(id, description, isActive);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndicatorLoginsEntity)) {
            return false;
        }
        IndicatorLoginsEntity indicatorLoginsEntity = (IndicatorLoginsEntity) other;
        return Intrinsics.areEqual(this.id, indicatorLoginsEntity.id) && Intrinsics.areEqual(this.description, indicatorLoginsEntity.description) && this.isActive == indicatorLoginsEntity.isActive;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iC = n1.c(this.description, this.id.hashCode() * 31, 31);
        boolean z10 = this.isActive;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iC + r1;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    @NotNull
    public final Map<String, Object> toMap() {
        return q.mapOf(TuplesKt.to("id", this.id), TuplesKt.to("name", this.description), TuplesKt.to("isActive", Boolean.valueOf(this.isActive)));
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.description;
        return i.c(a.c("IndicatorLoginsEntity(id=", str, ", description=", str2, ", isActive="), this.isActive, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.description);
        parcel.writeInt(this.isActive ? 1 : 0);
    }
}
