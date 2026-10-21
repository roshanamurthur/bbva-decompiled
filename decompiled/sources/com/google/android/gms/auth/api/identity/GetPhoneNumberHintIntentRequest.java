package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "GetPhoneNumberHintIntentRequestCreator")
public class GetPhoneNumberHintIntentRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetPhoneNumberHintIntentRequest> CREATOR = new zbj();

    @SafeParcelable.Field(getter = "getTheme", id = 1)
    private final int zba;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
    public static final class Builder {
        private Builder() {
            throw null;
        }

        public /* synthetic */ Builder(zbi zbiVar) {
        }

        @NonNull
        public GetPhoneNumberHintIntentRequest build() {
            return new GetPhoneNumberHintIntentRequest(0);
        }
    }

    @SafeParcelable.Constructor
    public GetPhoneNumberHintIntentRequest(@SafeParcelable.Param(id = 1) int i10) {
        this.zba = i10;
    }

    @NonNull
    public static Builder builder() {
        return new Builder(null);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof GetPhoneNumberHintIntentRequest) {
            return Objects.equal(Integer.valueOf(this.zba), Integer.valueOf(((GetPhoneNumberHintIntentRequest) obj).zba));
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zba));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.zba;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
