package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.salesforce.marketingcloud.storage.db.k;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* JADX INFO: loaded from: classes9.dex */
public enum Attachment implements Parcelable {
    PLATFORM(k.a.f65035b),
    CROSS_PLATFORM("cross-platform");


    @NonNull
    public static final Parcelable.Creator<Attachment> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.fido2.api.common.zza
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return Attachment.fromString(parcel.readString());
            } catch (Attachment.UnsupportedAttachmentException e5) {
                throw new RuntimeException(e5);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new Attachment[i10];
        }
    };

    @NonNull
    private final String zzb;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static class UnsupportedAttachmentException extends Exception {
        public UnsupportedAttachmentException(@NonNull String str) {
            super(String.format("Attachment %s not supported", str));
        }
    }

    Attachment(String str) {
        this.zzb = str;
    }

    @NonNull
    public static Attachment fromString(@NonNull String str) throws UnsupportedAttachmentException {
        for (Attachment attachment : values()) {
            if (str.equals(attachment.zzb)) {
                return attachment;
            }
        }
        throw new UnsupportedAttachmentException(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeString(this.zzb);
    }
}
