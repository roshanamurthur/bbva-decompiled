package com.google.android.gms.tapandpay.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "CardIconMessageCreator")
public final class CardIconMessage extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CardIconMessage> CREATOR = new zzb();

    @SafeParcelable.Field(getter = "getConditions", id = 1)
    private int[] zza;

    @SafeParcelable.Field(getter = "getIcon", id = 2)
    private int zzb;

    @SafeParcelable.Field(getter = "getMessage", id = 3)
    private String zzc;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
    @ShowFirstParty
    public static final class Builder {
        private final CardIconMessage zza;

        public Builder() {
            this.zza = new CardIconMessage(null);
        }

        @NonNull
        public CardIconMessage build() {
            return this.zza;
        }

        @NonNull
        public Builder setConditions(@NonNull int[] iArr) {
            this.zza.zza = iArr;
            return this;
        }

        @NonNull
        public Builder setIcon(int i10) {
            this.zza.zzb = i10;
            return this;
        }

        @NonNull
        public Builder setMessage(@NonNull String str) {
            this.zza.zzc = str;
            return this;
        }

        public Builder(@NonNull CardIconMessage cardIconMessage) {
            CardIconMessage cardIconMessage2 = new CardIconMessage(null);
            this.zza = cardIconMessage2;
            cardIconMessage2.zza = cardIconMessage.zza;
            cardIconMessage2.zzb = cardIconMessage.zzb;
            cardIconMessage2.zzc = cardIconMessage.zzc;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Condition {
        public static final int NFC_OFF = 3;
        public static final int NFC_ON = 2;
        public static final int PHONE_LOCKED = 4;
        public static final int TRUE = 1;
        public static final int UNKNOWN_CONDITION = 0;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Icon {
        public static final int LOCK = 4;
        public static final int NFC = 2;
        public static final int NFC_DISABLED = 3;
        public static final int NONE = 1;
        public static final int UNKNOWN_ICON = 0;
    }

    private CardIconMessage() {
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CardIconMessage) {
            CardIconMessage cardIconMessage = (CardIconMessage) obj;
            if (Arrays.equals(this.zza, cardIconMessage.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(cardIconMessage.zzb)) && Objects.equal(this.zzc, cardIconMessage.zzc)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public int[] getConditions() {
        return this.zza;
    }

    public int getIcon() {
        return this.zzb;
    }

    @NonNull
    public String getMessage() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(this.zzb), this.zzc);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntArray(parcel, 1, getConditions(), false);
        SafeParcelWriter.writeInt(parcel, 2, getIcon());
        SafeParcelWriter.writeString(parcel, 3, getMessage(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public /* synthetic */ CardIconMessage(zza zzaVar) {
    }

    @SafeParcelable.Constructor
    public CardIconMessage(@SafeParcelable.Param(id = 1) int[] iArr, @SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) String str) {
        this.zza = iArr;
        this.zzb = i10;
        this.zzc = str;
    }
}
