package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.noknok.android.client.extension.PlayIntegrity;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* JADX INFO: loaded from: classes9.dex */
public enum ResidentKeyRequirement implements Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    RESIDENT_KEY_PREFERRED(PlayIntegrity.KEY_PREFERRED),
    RESIDENT_KEY_REQUIRED(PlayIntegrity.KEY_REQUIRED);


    @NonNull
    public static final Parcelable.Creator<ResidentKeyRequirement> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.fido2.api.common.zzas
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            if (string == null) {
                string = "";
            }
            try {
                return ResidentKeyRequirement.fromString(string);
            } catch (ResidentKeyRequirement.UnsupportedResidentKeyRequirementException e5) {
                throw new RuntimeException(e5);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new ResidentKeyRequirement[i10];
        }
    };

    @NonNull
    private final String zzb;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static class UnsupportedResidentKeyRequirementException extends Exception {
        public UnsupportedResidentKeyRequirementException(@NonNull String str) {
            super(String.format("Resident key requirement %s not supported", str));
        }
    }

    ResidentKeyRequirement(String str) {
        this.zzb = str;
    }

    @NonNull
    public static ResidentKeyRequirement fromString(@NonNull String str) throws UnsupportedResidentKeyRequirementException {
        for (ResidentKeyRequirement residentKeyRequirement : values()) {
            if (str.equals(residentKeyRequirement.zzb)) {
                return residentKeyRequirement;
            }
        }
        throw new UnsupportedResidentKeyRequirementException(str);
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
