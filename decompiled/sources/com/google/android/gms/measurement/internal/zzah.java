package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzah {
    public static final zzah zza = new zzah(null, null);
    private final EnumMap zzb;

    public zzah(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(zzag.class);
        this.zzb = enumMap;
        enumMap.put(zzag.AD_STORAGE, bool);
        enumMap.put(zzag.ANALYTICS_STORAGE, bool2);
    }

    public static zzah zza(Bundle bundle) {
        if (bundle == null) {
            return zza;
        }
        EnumMap enumMap = new EnumMap(zzag.class);
        for (zzag zzagVar : zzag.values()) {
            enumMap.put(zzagVar, zzm(bundle.getString(zzagVar.zzd)));
        }
        return new zzah(enumMap);
    }

    public static zzah zzb(String str) {
        EnumMap enumMap = new EnumMap(zzag.class);
        if (str != null) {
            int i10 = 0;
            while (true) {
                zzag[] zzagVarArr = zzag.zzc;
                int length = zzagVarArr.length;
                if (i10 >= 2) {
                    break;
                }
                zzag zzagVar = zzagVarArr[i10];
                int i11 = i10 + 2;
                if (i11 < str.length()) {
                    char cCharAt = str.charAt(i11);
                    Boolean bool = null;
                    if (cCharAt != '-') {
                        if (cCharAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (cCharAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put(zzagVar, bool);
                }
                i10++;
            }
        }
        return new zzah(enumMap);
    }

    public static String zzg(Bundle bundle) {
        String string;
        for (zzag zzagVar : zzag.values()) {
            if (bundle.containsKey(zzagVar.zzd) && (string = bundle.getString(zzagVar.zzd)) != null && zzm(string) == null) {
                return string;
            }
        }
        return null;
    }

    public static boolean zzj(int i10, int i11) {
        return i10 <= i11;
    }

    public static final int zzl(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    private static Boolean zzm(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzah)) {
            return false;
        }
        zzah zzahVar = (zzah) obj;
        for (zzag zzagVar : zzag.values()) {
            if (zzl((Boolean) this.zzb.get(zzagVar)) != zzl((Boolean) zzahVar.zzb.get(zzagVar))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Iterator it = this.zzb.values().iterator();
        int iZzl = 17;
        while (it.hasNext()) {
            iZzl = (iZzl * 31) + zzl((Boolean) it.next());
        }
        return iZzl;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("settings: ");
        zzag[] zzagVarArrValues = zzag.values();
        int length = zzagVarArrValues.length;
        for (int i10 = 0; i10 < length; i10++) {
            zzag zzagVar = zzagVarArrValues[i10];
            if (i10 != 0) {
                sb2.append(", ");
            }
            sb2.append(zzagVar.name());
            sb2.append("=");
            Boolean bool = (Boolean) this.zzb.get(zzagVar);
            if (this.zzb.containsKey(zzagVar) || bool == null) {
                sb2.append("uninitialized");
            } else {
                sb2.append(true != bool.booleanValue() ? "denied" : "granted");
            }
        }
        return sb2.toString();
    }

    public final zzah zzc(zzah zzahVar) {
        EnumMap enumMap = new EnumMap(zzag.class);
        for (zzag zzagVar : zzag.values()) {
            Boolean boolValueOf = (Boolean) this.zzb.get(zzagVar);
            Boolean bool = (Boolean) zzahVar.zzb.get(zzagVar);
            if (boolValueOf == null) {
                boolValueOf = bool;
            } else if (bool != null) {
                boolValueOf = Boolean.valueOf(boolValueOf.booleanValue() && bool.booleanValue());
            }
            enumMap.put(zzagVar, boolValueOf);
        }
        return new zzah(enumMap);
    }

    public final zzah zzd(zzah zzahVar) {
        EnumMap enumMap = new EnumMap(zzag.class);
        for (zzag zzagVar : zzag.values()) {
            Boolean bool = (Boolean) this.zzb.get(zzagVar);
            if (bool == null) {
                bool = (Boolean) zzahVar.zzb.get(zzagVar);
            }
            enumMap.put(zzagVar, bool);
        }
        return new zzah(enumMap);
    }

    public final Boolean zze() {
        return (Boolean) this.zzb.get(zzag.AD_STORAGE);
    }

    public final Boolean zzf() {
        return (Boolean) this.zzb.get(zzag.ANALYTICS_STORAGE);
    }

    public final String zzh() {
        StringBuilder sb2 = new StringBuilder("G1");
        zzag[] zzagVarArr = zzag.zzc;
        int length = zzagVarArr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            Boolean bool = (Boolean) this.zzb.get(zzagVarArr[i10]);
            sb2.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        }
        return sb2.toString();
    }

    public final boolean zzi(zzag zzagVar) {
        Boolean bool = (Boolean) this.zzb.get(zzagVar);
        return bool == null || bool.booleanValue();
    }

    public final boolean zzk(zzah zzahVar) {
        for (zzag zzagVar : (zzag[]) this.zzb.keySet().toArray(new zzag[0])) {
            Boolean bool = (Boolean) this.zzb.get(zzagVar);
            Boolean bool2 = (Boolean) zzahVar.zzb.get(zzagVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public zzah(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(zzag.class);
        this.zzb = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
