package com.bbva.glomohybrid.base.deeplink.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.h0;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: QRPayload.kt */
/* JADX INFO: loaded from: classes5.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/bbva/glomohybrid/base/deeplink/model/QRPayload;", "Landroid/os/Parcelable;", "qr", "", "(Ljava/lang/String;)V", "getQr", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class QRPayload implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<QRPayload> CREATOR = new Creator();

    @SerializedName("qr")
    @NotNull
    private final String qr;

    /* JADX INFO: compiled from: QRPayload.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<QRPayload> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final QRPayload createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new QRPayload(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final QRPayload[] newArray(int i10) {
            return new QRPayload[i10];
        }
    }

    public QRPayload(@NotNull String qr) {
        Intrinsics.checkNotNullParameter(qr, "qr");
        this.qr = qr;
    }

    public static /* synthetic */ QRPayload copy$default(QRPayload qRPayload, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = qRPayload.qr;
        }
        return qRPayload.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQr() {
        return this.qr;
    }

    @NotNull
    public final QRPayload copy(@NotNull String qr) {
        Intrinsics.checkNotNullParameter(qr, "qr");
        return new QRPayload(qr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QRPayload) && Intrinsics.areEqual(this.qr, ((QRPayload) other).qr);
    }

    @NotNull
    public final String getQr() {
        return this.qr;
    }

    public int hashCode() {
        return this.qr.hashCode();
    }

    @NotNull
    public String toString() {
        return h0.b("QRPayload(qr=", this.qr, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.qr);
    }
}
