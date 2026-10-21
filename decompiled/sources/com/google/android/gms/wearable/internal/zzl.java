package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.n1;
import androidx.collection.k;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "AncsNotificationParcelableCreator")
@SafeParcelable.Reserved({1})
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();

    @SafeParcelable.Field(getter = "getId", id = 2)
    private int id;

    @Nullable
    @SafeParcelable.Field(getter = "getPackageName", id = 13)
    private final String packageName;

    @SafeParcelable.Field(getter = "getAppId", id = 3)
    private final String zzbf;

    @Nullable
    @SafeParcelable.Field(getter = "getDateTime", id = 4)
    private final String zzbg;

    @SafeParcelable.Field(getter = "getNotificationText", id = 5)
    private final String zzbh;

    @SafeParcelable.Field(getter = "getTitle", id = 6)
    private final String zzbi;

    @SafeParcelable.Field(getter = "getSubtitle", id = 7)
    private final String zzbj;

    @Nullable
    @SafeParcelable.Field(getter = "getDisplayName", id = 8)
    private final String zzbk;

    @SafeParcelable.Field(getter = "getEventId", id = 9)
    private final byte zzbl;

    @SafeParcelable.Field(getter = "getEventFlags", id = 10)
    private final byte zzbm;

    @SafeParcelable.Field(getter = "getCategoryId", id = 11)
    private final byte zzbn;

    @SafeParcelable.Field(getter = "getCategoryCount", id = 12)
    private final byte zzbo;

    @SafeParcelable.Constructor
    public zzl(@SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) @Nullable String str2, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) String str4, @SafeParcelable.Param(id = 7) String str5, @SafeParcelable.Param(id = 8) @Nullable String str6, @SafeParcelable.Param(id = 9) byte b10, @SafeParcelable.Param(id = 10) byte b11, @SafeParcelable.Param(id = 11) byte b12, @SafeParcelable.Param(id = 12) byte b13, @SafeParcelable.Param(id = 13) @Nullable String str7) {
        this.id = i10;
        this.zzbf = str;
        this.zzbg = str2;
        this.zzbh = str3;
        this.zzbi = str4;
        this.zzbj = str5;
        this.zzbk = str6;
        this.zzbl = b10;
        this.zzbm = b11;
        this.zzbn = b12;
        this.zzbo = b13;
        this.packageName = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzl.class == obj.getClass()) {
            zzl zzlVar = (zzl) obj;
            if (this.id != zzlVar.id || this.zzbl != zzlVar.zzbl || this.zzbm != zzlVar.zzbm || this.zzbn != zzlVar.zzbn || this.zzbo != zzlVar.zzbo || !this.zzbf.equals(zzlVar.zzbf)) {
                return false;
            }
            String str = this.zzbg;
            if (str == null ? zzlVar.zzbg != null : !str.equals(zzlVar.zzbg)) {
                return false;
            }
            if (!this.zzbh.equals(zzlVar.zzbh) || !this.zzbi.equals(zzlVar.zzbi) || !this.zzbj.equals(zzlVar.zzbj)) {
                return false;
            }
            String str2 = this.zzbk;
            if (str2 == null ? zzlVar.zzbk != null : !str2.equals(zzlVar.zzbk)) {
                return false;
            }
            String str3 = this.packageName;
            String str4 = zzlVar.packageName;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iC = n1.c(this.zzbf, (this.id + 31) * 31, 31);
        String str = this.zzbg;
        int iC2 = n1.c(this.zzbj, n1.c(this.zzbi, n1.c(this.zzbh, (iC + (str != null ? str.hashCode() : 0)) * 31, 31), 31), 31);
        String str2 = this.zzbk;
        int iHashCode = (((((((((iC2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.zzbl) * 31) + this.zzbm) * 31) + this.zzbn) * 31) + this.zzbo) * 31;
        String str3 = this.packageName;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        int i10 = this.id;
        String str = this.zzbf;
        String str2 = this.zzbg;
        String str3 = this.zzbh;
        String str4 = this.zzbi;
        String str5 = this.zzbj;
        String str6 = this.zzbk;
        byte b10 = this.zzbl;
        byte b11 = this.zzbm;
        byte b12 = this.zzbn;
        byte b13 = this.zzbo;
        String str7 = this.packageName;
        StringBuilder sb2 = new StringBuilder(n1.b(str7, n1.b(str6, n1.b(str5, n1.b(str4, n1.b(str3, n1.b(str2, n1.b(str, 211))))))));
        sb2.append("AncsNotificationParcelable{, id=");
        sb2.append(i10);
        sb2.append(", appId='");
        sb2.append(str);
        k.e(sb2, "', dateTime='", str2, "', notificationText='", str3);
        k.e(sb2, "', title='", str4, "', subtitle='", str5);
        sb2.append("', displayName='");
        sb2.append(str6);
        sb2.append("', eventId=");
        sb2.append((int) b10);
        sb2.append(", eventFlags=");
        sb2.append((int) b11);
        sb2.append(", categoryId=");
        sb2.append((int) b12);
        sb2.append(", categoryCount=");
        sb2.append((int) b13);
        sb2.append(", packageName='");
        sb2.append(str7);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.id);
        SafeParcelWriter.writeString(parcel, 3, this.zzbf, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzbg, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzbh, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzbi, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzbj, false);
        String str = this.zzbk;
        if (str == null) {
            str = this.zzbf;
        }
        SafeParcelWriter.writeString(parcel, 8, str, false);
        SafeParcelWriter.writeByte(parcel, 9, this.zzbl);
        SafeParcelWriter.writeByte(parcel, 10, this.zzbm);
        SafeParcelWriter.writeByte(parcel, 11, this.zzbn);
        SafeParcelWriter.writeByte(parcel, 12, this.zzbo);
        SafeParcelWriter.writeString(parcel, 13, this.packageName, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
