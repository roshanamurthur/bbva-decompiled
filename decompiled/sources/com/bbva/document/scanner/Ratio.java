package com.bbva.document.scanner;

import android.os.Parcel;
import android.os.Parcelable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Ratio.kt */
/* JADX INFO: loaded from: classes3.dex */
@Parcelize
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006 "}, d2 = {"Lcom/bbva/document/scanner/Ratio;", "Landroid/os/Parcelable;", "", "aspectRatio", "component1", "component2", "width", "height", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "p0", "D", "getWidth", "()D", "q0", "getHeight", "<init>", "(DD)V", "Companion", "document-scanner_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Ratio implements Parcelable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final double width;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public final double height;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<Ratio> CREATOR = new Creator();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public static final Ratio f29121r0 = new Ratio(35.0d, 16.0d);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public static final Ratio f29122s0 = new Ratio(21.0d, 14.0d);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public static final Ratio f29123t0 = new Ratio(29.7d, 21.8d);

    /* JADX INFO: compiled from: Ratio.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/bbva/document/scanner/Ratio$Companion;", "", "()V", "A4", "Lcom/bbva/document/scanner/Ratio;", "getA4", "()Lcom/bbva/document/scanner/Ratio;", "Card", "getCard", "Check", "getCheck", "document-scanner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Ratio getA4() {
            return Ratio.f29123t0;
        }

        @NotNull
        public final Ratio getCard() {
            return Ratio.f29122s0;
        }

        @NotNull
        public final Ratio getCheck() {
            return Ratio.f29121r0;
        }
    }

    /* JADX INFO: compiled from: Ratio.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Ratio> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Ratio createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Ratio(parcel.readDouble(), parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Ratio[] newArray(int i10) {
            return new Ratio[i10];
        }
    }

    public Ratio(double d2, double d3) {
        this.width = d2;
        this.height = d3;
    }

    public static /* synthetic */ Ratio copy$default(Ratio ratio, double d2, double d3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d2 = ratio.width;
        }
        if ((i10 & 2) != 0) {
            d3 = ratio.height;
        }
        return ratio.copy(d2, d3);
    }

    public final double aspectRatio() {
        return this.width / this.height;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getHeight() {
        return this.height;
    }

    @NotNull
    public final Ratio copy(double width, double height) {
        return new Ratio(width, height);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Ratio)) {
            return false;
        }
        Ratio ratio = (Ratio) other;
        return Double.compare(this.width, ratio.width) == 0 && Double.compare(this.height, ratio.height) == 0;
    }

    public final double getHeight() {
        return this.height;
    }

    public final double getWidth() {
        return this.width;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.width);
        int i10 = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.height);
        return i10 + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    @NotNull
    public String toString() {
        return "Ratio(width=" + this.width + ", height=" + this.height + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeDouble(this.width);
        parcel.writeDouble(this.height);
    }
}
