package com.veridas.bidicode.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.a;
import androidx.constraintlayout.motion.widget.Key;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.veridas.lib.entities.resources.bidicode.BidiType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BidiCodePlacement.kt */
/* JADX INFO: loaded from: classes9.dex */
@Parcelize
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020*¢\u0006\u0004\b(\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010'\u001a\u00020\"8F¢\u0006\f\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$¨\u0006,"}, d2 = {"Lcom/veridas/bidicode/entities/BidiCodePlacement;", "Landroid/os/Parcelable;", "Lcom/veridas/bidicode/entities/BidiCodeRegion;", "component1", "", "component2", "component3", "region", "side", "type", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "p0", "Lcom/veridas/bidicode/entities/BidiCodeRegion;", "getRegion", "()Lcom/veridas/bidicode/entities/BidiCodeRegion;", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSide", "()I", "r0", "getType", "", "getRotation", "()F", "getRotation$annotations", "()V", Key.ROTATION, "<init>", "(Lcom/veridas/bidicode/entities/BidiCodeRegion;II)V", "Lcom/veridas/lib/entities/resources/bidicode/BidiType;", "(Lcom/veridas/bidicode/entities/BidiCodeRegion;ILcom/veridas/lib/entities/resources/bidicode/BidiType;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class BidiCodePlacement implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BidiCodePlacement> CREATOR = new Creator();

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final BidiCodeRegion region;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public final int side;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public final int type;

    /* JADX INFO: compiled from: BidiCodePlacement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BidiCodePlacement> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BidiCodePlacement createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BidiCodePlacement(BidiCodeRegion.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BidiCodePlacement[] newArray(int i10) {
            return new BidiCodePlacement[i10];
        }
    }

    public BidiCodePlacement(@NotNull BidiCodeRegion region, int i10, int i11) {
        Intrinsics.checkNotNullParameter(region, "region");
        this.region = region;
        this.side = i10;
        this.type = i11;
    }

    public static /* synthetic */ BidiCodePlacement copy$default(BidiCodePlacement bidiCodePlacement, BidiCodeRegion bidiCodeRegion, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            bidiCodeRegion = bidiCodePlacement.region;
        }
        if ((i12 & 2) != 0) {
            i10 = bidiCodePlacement.side;
        }
        if ((i12 & 4) != 0) {
            i11 = bidiCodePlacement.type;
        }
        return bidiCodePlacement.copy(bidiCodeRegion, i10, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BidiCodeRegion getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSide() {
        return this.side;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final BidiCodePlacement copy(@NotNull BidiCodeRegion region, int side, int type) {
        Intrinsics.checkNotNullParameter(region, "region");
        return new BidiCodePlacement(region, side, type);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BidiCodePlacement)) {
            return false;
        }
        BidiCodePlacement bidiCodePlacement = (BidiCodePlacement) other;
        return Intrinsics.areEqual(this.region, bidiCodePlacement.region) && this.side == bidiCodePlacement.side && this.type == bidiCodePlacement.type;
    }

    @NotNull
    public final BidiCodeRegion getRegion() {
        return this.region;
    }

    public final float getRotation() {
        BidiCodeRegion bidiCodeRegion = this.region;
        return bidiCodeRegion.getW() >= bidiCodeRegion.getH() ? 0.0f : 90.0f;
    }

    public final int getSide() {
        return this.side;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.region.hashCode() * 31) + this.side) * 31) + this.type;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BidiCodePlacement(region=");
        sb2.append(this.region);
        sb2.append(", side=");
        sb2.append(this.side);
        sb2.append(", type=");
        return a.c(sb2, this.type, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.region.writeToParcel(parcel, flags);
        parcel.writeInt(this.side);
        parcel.writeInt(this.type);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BidiCodePlacement(@NotNull BidiCodeRegion region, int i10, @NotNull BidiType type) {
        this(region, i10, type.ordinal());
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(type, "type");
    }

    public static /* synthetic */ void getRotation$annotations() {
    }
}
