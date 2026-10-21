package com.google.android.gms.tapandpay.globalactions;

import android.app.PendingIntent;
import android.graphics.Bitmap;
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

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "GlobalActionCardCreator")
public final class GlobalActionCard extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GlobalActionCard> CREATOR = new zzf();

    @SafeParcelable.Field(getter = "getCardType", id = 1)
    private int zza;

    @SafeParcelable.Field(getter = "getCardId", id = 2)
    private String zzb;

    @SafeParcelable.Field(getter = "getCardImage", id = 3)
    private Bitmap zzc;

    @SafeParcelable.Field(getter = "getContentDescription", id = 4)
    private String zzd;

    @Nullable
    @SafeParcelable.Field(getter = "getMessageText", id = 5)
    private String zze;

    @Nullable
    @SafeParcelable.Field(getter = "getDeviceLockedMessageText", id = 8)
    private String zzf;

    @Nullable
    @SafeParcelable.Field(getter = "getMessageIcon", id = 6)
    private Bitmap zzg;

    @SafeParcelable.Field(getter = "getPendingIntent", id = 7)
    private PendingIntent zzh;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
    @ShowFirstParty
    public static final class Builder {
        private final GlobalActionCard zza;

        public Builder() {
            this.zza = new GlobalActionCard(null);
        }

        @NonNull
        public GlobalActionCard build() {
            return this.zza;
        }

        @NonNull
        public Builder setCardId(@NonNull String str) {
            this.zza.zzb = str;
            return this;
        }

        @NonNull
        public Builder setCardImage(@NonNull Bitmap bitmap) {
            this.zza.zzc = bitmap;
            return this;
        }

        @NonNull
        public Builder setCardType(int i10) {
            this.zza.zza = i10;
            return this;
        }

        @NonNull
        public Builder setContentDescription(@NonNull String str) {
            this.zza.zzd = str;
            return this;
        }

        @NonNull
        public Builder setDeviceLockedMessageText(@Nullable String str) {
            this.zza.zzf = str;
            return this;
        }

        @NonNull
        public Builder setMessageIcon(@Nullable Bitmap bitmap) {
            this.zza.zzg = bitmap;
            return this;
        }

        @NonNull
        public Builder setMessageText(@Nullable String str) {
            this.zza.zze = str;
            return this;
        }

        @NonNull
        public Builder setPendingIntent(@NonNull PendingIntent pendingIntent) {
            this.zza.zzh = pendingIntent;
            return this;
        }

        public Builder(@NonNull GlobalActionCard globalActionCard) {
            GlobalActionCard globalActionCard2 = new GlobalActionCard(null);
            this.zza = globalActionCard2;
            globalActionCard2.zza = globalActionCard.zza;
            globalActionCard2.zzb = globalActionCard.zzb;
            globalActionCard2.zzc = globalActionCard.zzc;
            globalActionCard2.zzd = globalActionCard.zzd;
            globalActionCard2.zze = globalActionCard.zze;
            globalActionCard2.zzf = globalActionCard.zzf;
            globalActionCard2.zzg = globalActionCard.zzg;
            globalActionCard2.zzh = globalActionCard.zzh;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CardType {
        public static final int CAR_KEY = 8;
        public static final int CTA = 3;
        public static final int GLOBAL_ACTIONS_DISMISSED = 4;
        public static final int PASS = 1;
        public static final int PAYMENT = 2;
        public static final int STUDENT_ID = 6;
        public static final int TILE = 9;
        public static final int TRANSIT = 7;
        public static final int UNKNOWN = 0;
        public static final int VALUABLE = 5;
    }

    private GlobalActionCard() {
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GlobalActionCard) {
            GlobalActionCard globalActionCard = (GlobalActionCard) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(globalActionCard.zza)) && Objects.equal(this.zzb, globalActionCard.zzb) && Objects.equal(this.zzc, globalActionCard.zzc) && Objects.equal(this.zzd, globalActionCard.zzd) && Objects.equal(this.zze, globalActionCard.zze) && Objects.equal(this.zzf, globalActionCard.zzf) && Objects.equal(this.zzg, globalActionCard.zzg) && Objects.equal(this.zzh, globalActionCard.zzh)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public String getCardId() {
        return this.zzb;
    }

    @NonNull
    public Bitmap getCardImage() {
        return this.zzc;
    }

    public int getCardType() {
        return this.zza;
    }

    @NonNull
    public String getContentDescription() {
        return this.zzd;
    }

    @Nullable
    public String getDeviceLockedMessageText() {
        return this.zzf;
    }

    @Nullable
    public Bitmap getMessageIcon() {
        return this.zzg;
    }

    @Nullable
    public String getMessageText() {
        return this.zze;
    }

    @NonNull
    public PendingIntent getPendingIntent() {
        return this.zzh;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getCardType());
        SafeParcelWriter.writeString(parcel, 2, getCardId(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getCardImage(), i10, false);
        SafeParcelWriter.writeString(parcel, 4, getContentDescription(), false);
        SafeParcelWriter.writeString(parcel, 5, getMessageText(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, getMessageIcon(), i10, false);
        SafeParcelWriter.writeParcelable(parcel, 7, getPendingIntent(), i10, false);
        SafeParcelWriter.writeString(parcel, 8, getDeviceLockedMessageText(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public GlobalActionCard(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) Bitmap bitmap, @SafeParcelable.Param(id = 4) String str2, @Nullable @SafeParcelable.Param(id = 5) String str3, @Nullable @SafeParcelable.Param(id = 8) String str4, @Nullable @SafeParcelable.Param(id = 6) Bitmap bitmap2, @SafeParcelable.Param(id = 7) PendingIntent pendingIntent) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = bitmap;
        this.zzd = str2;
        this.zze = str3;
        this.zzf = str4;
        this.zzg = bitmap2;
        this.zzh = pendingIntent;
    }

    public /* synthetic */ GlobalActionCard(zze zzeVar) {
    }
}
