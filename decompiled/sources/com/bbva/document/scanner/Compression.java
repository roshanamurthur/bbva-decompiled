package com.bbva.document.scanner;

import android.os.Parcel;
import android.os.Parcelable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.image.compressor.JpegCompressor;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CaptureOptions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/bbva/document/scanner/Compression;", "Landroid/os/Parcelable;", "", "component1", "", "component2", "id", "factor", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "p0", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getFactor", "()I", "<init>", "(Ljava/lang/String;I)V", "document-scanner_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Compression implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Compression> CREATOR = new Creator();

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public final int factor;

    /* JADX INFO: compiled from: CaptureOptions.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Compression> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Compression createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Compression(parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Compression[] newArray(int i10) {
            return new Compression[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Compression() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Compression copy$default(Compression compression, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = compression.id;
        }
        if ((i11 & 2) != 0) {
            i10 = compression.factor;
        }
        return compression.copy(str, i10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getFactor() {
        return this.factor;
    }

    @NotNull
    public final Compression copy(@NotNull String id, int factor) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new Compression(id, factor);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Compression)) {
            return false;
        }
        Compression compression = (Compression) other;
        return Intrinsics.areEqual(this.id, compression.id) && this.factor == compression.factor;
    }

    public final int getFactor() {
        return this.factor;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.factor;
    }

    @NotNull
    public String toString() {
        return "Compression(id=" + this.id + ", factor=" + this.factor + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeInt(this.factor);
    }

    public Compression(@NotNull String id, int i10) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.factor = i10;
    }

    public /* synthetic */ Compression(String str, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? JpegCompressor.ID : str, (i11 & 2) != 0 ? 100 : i10);
    }
}
