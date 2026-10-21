package com.google.mlkit.vision.barcode.internal;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.mlkit_vision_barcode.zzj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.barcode.common.internal.BarcodeSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzm implements BarcodeSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzq f49572a;

    public zzm(zzq zzqVar) {
        this.f49572a = zzqVar;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Rect getBoundingBox() {
        zzq zzqVar = this.f49572a;
        if (zzqVar.zze == null) {
            return null;
        }
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int i10 = 0;
        int iMax2 = Integer.MIN_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        while (true) {
            Point[] pointArr = zzqVar.zze;
            if (i10 >= pointArr.length) {
                return new Rect(iMin2, iMin, iMax, iMax2);
            }
            Point point = pointArr[i10];
            iMin2 = Math.min(iMin2, point.x);
            iMax = Math.max(iMax, point.x);
            iMin = Math.min(iMin, point.y);
            iMax2 = Math.max(iMax2, point.y);
            i10++;
        }
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Barcode.CalendarEvent getCalendarEvent() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzg zzgVar = this.f49572a.zzl;
        if (zzgVar == null) {
            return null;
        }
        String str = zzgVar.zza;
        String str2 = zzgVar.zzb;
        String str3 = zzgVar.zzc;
        String str4 = zzgVar.zzd;
        String str5 = zzgVar.zze;
        com.google.android.gms.internal.mlkit_vision_barcode.zzf zzfVar = zzgVar.zzf;
        Barcode.CalendarDateTime calendarDateTime = zzfVar == null ? null : new Barcode.CalendarDateTime(zzfVar.zza, zzfVar.zzb, zzfVar.zzc, zzfVar.zzd, zzfVar.zze, zzfVar.zzf, zzfVar.zzg, zzfVar.zzh);
        com.google.android.gms.internal.mlkit_vision_barcode.zzf zzfVar2 = zzgVar.zzg;
        return new Barcode.CalendarEvent(str, str2, str3, str4, str5, calendarDateTime, zzfVar2 == null ? null : new Barcode.CalendarDateTime(zzfVar2.zza, zzfVar2.zzb, zzfVar2.zzc, zzfVar2.zzd, zzfVar2.zze, zzfVar2.zzf, zzfVar2.zzg, zzfVar2.zzh));
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Barcode.ContactInfo getContactInfo() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzh zzhVar = this.f49572a.zzm;
        if (zzhVar == null) {
            return null;
        }
        zzl zzlVar = zzhVar.zza;
        Barcode.PersonName personName = zzlVar != null ? new Barcode.PersonName(zzlVar.zza, zzlVar.zzb, zzlVar.zzc, zzlVar.zzd, zzlVar.zze, zzlVar.zzf, zzlVar.zzg) : null;
        String str = zzhVar.zzb;
        String str2 = zzhVar.zzc;
        com.google.android.gms.internal.mlkit_vision_barcode.zzm[] zzmVarArr = zzhVar.zzd;
        ArrayList arrayList = new ArrayList();
        if (zzmVarArr != null) {
            for (com.google.android.gms.internal.mlkit_vision_barcode.zzm zzmVar : zzmVarArr) {
                if (zzmVar != null) {
                    arrayList.add(new Barcode.Phone(zzmVar.zzb, zzmVar.zza));
                }
            }
        }
        zzj[] zzjVarArr = zzhVar.zze;
        ArrayList arrayList2 = new ArrayList();
        if (zzjVarArr != null) {
            for (zzj zzjVar : zzjVarArr) {
                if (zzjVar != null) {
                    arrayList2.add(new Barcode.Email(zzjVar.zza, zzjVar.zzb, zzjVar.zzc, zzjVar.zzd));
                }
            }
        }
        String[] strArr = zzhVar.zzf;
        List listAsList = strArr != null ? Arrays.asList(strArr) : new ArrayList();
        com.google.android.gms.internal.mlkit_vision_barcode.zze[] zzeVarArr = zzhVar.zzg;
        ArrayList arrayList3 = new ArrayList();
        if (zzeVarArr != null) {
            for (com.google.android.gms.internal.mlkit_vision_barcode.zze zzeVar : zzeVarArr) {
                if (zzeVar != null) {
                    arrayList3.add(new Barcode.Address(zzeVar.zza, zzeVar.zzb));
                }
            }
        }
        return new Barcode.ContactInfo(personName, str, str2, arrayList, arrayList2, listAsList, arrayList3);
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Point[] getCornerPoints() {
        return this.f49572a.zze;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final String getDisplayValue() {
        return this.f49572a.zzc;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Barcode.DriverLicense getDriverLicense() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzi zziVar = this.f49572a.zzn;
        if (zziVar == null) {
            return null;
        }
        return new Barcode.DriverLicense(zziVar.zza, zziVar.zzb, zziVar.zzc, zziVar.zzd, zziVar.zze, zziVar.zzf, zziVar.zzg, zziVar.zzh, zziVar.zzi, zziVar.zzj, zziVar.zzk, zziVar.zzl, zziVar.zzm, zziVar.zzn);
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Barcode.Email getEmail() {
        zzj zzjVar = this.f49572a.zzf;
        if (zzjVar != null) {
            return new Barcode.Email(zzjVar.zza, zzjVar.zzb, zzjVar.zzc, zzjVar.zzd);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final int getFormat() {
        return this.f49572a.zza;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Barcode.GeoPoint getGeoPoint() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzk zzkVar = this.f49572a.zzk;
        if (zzkVar != null) {
            return new Barcode.GeoPoint(zzkVar.zza, zzkVar.zzb);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Barcode.Phone getPhone() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzm zzmVar = this.f49572a.zzg;
        if (zzmVar != null) {
            return new Barcode.Phone(zzmVar.zzb, zzmVar.zza);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final byte[] getRawBytes() {
        return this.f49572a.zzo;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final String getRawValue() {
        return this.f49572a.zzb;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Barcode.Sms getSms() {
        zzn zznVar = this.f49572a.zzh;
        if (zznVar != null) {
            return new Barcode.Sms(zznVar.zza, zznVar.zzb);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Barcode.UrlBookmark getUrl() {
        zzo zzoVar = this.f49572a.zzj;
        if (zzoVar != null) {
            return new Barcode.UrlBookmark(zzoVar.zza, zzoVar.zzb);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final int getValueType() {
        return this.f49572a.zzd;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    @Nullable
    public final Barcode.WiFi getWifi() {
        zzp zzpVar = this.f49572a.zzi;
        if (zzpVar != null) {
            return new Barcode.WiFi(zzpVar.zza, zzpVar.zzb, zzpVar.zzc);
        }
        return null;
    }
}
