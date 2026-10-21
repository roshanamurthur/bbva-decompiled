package com.veridas.bidicode.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.z1;
import com.veridas.lib.entities.resources.bidicode.BidiCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BidiCodeRegion.kt */
/* JADX INFO: loaded from: classes9.dex */
@Parcelize
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%B\u0011\b\u0016\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b$\u0010(J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000eHÖ\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001d¨\u0006)"}, d2 = {"Lcom/veridas/bidicode/entities/BidiCodeRegion;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "component4", "x", "y", "w", "h", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "p0", "F", "getX", "()F", "q0", "getY", "r0", "getW", "s0", "getH", "<init>", "(FFFF)V", "Lcom/veridas/lib/entities/resources/bidicode/BidiCode;", "bidiCode", "(Lcom/veridas/lib/entities/resources/bidicode/BidiCode;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class BidiCodeRegion implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BidiCodeRegion> CREATOR = new Creator();

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final float x;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public final float y;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public final float w;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public final float h;

    /* JADX INFO: compiled from: BidiCodeRegion.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BidiCodeRegion> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BidiCodeRegion createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BidiCodeRegion(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final BidiCodeRegion[] newArray(int i10) {
            return new BidiCodeRegion[i10];
        }
    }

    public BidiCodeRegion() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public static /* synthetic */ BidiCodeRegion copy$default(BidiCodeRegion bidiCodeRegion, float f6, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = bidiCodeRegion.x;
        }
        if ((i10 & 2) != 0) {
            f10 = bidiCodeRegion.y;
        }
        if ((i10 & 4) != 0) {
            f11 = bidiCodeRegion.w;
        }
        if ((i10 & 8) != 0) {
            f12 = bidiCodeRegion.h;
        }
        return bidiCodeRegion.copy(f6, f10, f11, f12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getW() {
        return this.w;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getH() {
        return this.h;
    }

    @NotNull
    public final BidiCodeRegion copy(float x4, float y7, float w6, float h4) {
        return new BidiCodeRegion(x4, y7, w6, h4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BidiCodeRegion)) {
            return false;
        }
        BidiCodeRegion bidiCodeRegion = (BidiCodeRegion) other;
        return Float.compare(this.x, bidiCodeRegion.x) == 0 && Float.compare(this.y, bidiCodeRegion.y) == 0 && Float.compare(this.w, bidiCodeRegion.w) == 0 && Float.compare(this.h, bidiCodeRegion.h) == 0;
    }

    public final float getH() {
        return this.h;
    }

    public final float getW() {
        return this.w;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.h) + z1.a(this.w, z1.a(this.y, Float.floatToIntBits(this.x) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "BidiCodeRegion(x=" + this.x + ", y=" + this.y + ", w=" + this.w + ", h=" + this.h + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeFloat(this.x);
        parcel.writeFloat(this.y);
        parcel.writeFloat(this.w);
        parcel.writeFloat(this.h);
    }

    public BidiCodeRegion(float f6, float f10, float f11, float f12) {
        this.x = f6;
        this.y = f10;
        this.w = f11;
        this.h = f12;
    }

    public /* synthetic */ BidiCodeRegion(float f6, float f10, float f11, float f12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0f : f6, (i10 & 2) != 0 ? 0.0f : f10, (i10 & 4) != 0 ? 1.0f : f11, (i10 & 8) != 0 ? 1.0f : f12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BidiCodeRegion(@NotNull BidiCode bidiCode) {
        this(bidiCode.getRegion().getX(), bidiCode.getRegion().getY(), bidiCode.getRegion().getWidth(), bidiCode.getRegion().getHeight());
        Intrinsics.checkNotNullParameter(bidiCode, "bidiCode");
    }
}
