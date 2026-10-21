package com.google.android.gms.internal.measurement;

import androidx.collection.f;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzat implements Iterable, zzap {
    private final String zza;

    public zzat(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzat) {
            return this.zza.equals(((zzat) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzas(this);
    }

    public final String toString() {
        String str = this.zza;
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append('\"');
        sb2.append(str);
        sb2.append('\"');
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65, types: [int] */
    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbI(String str, zzg zzgVar, List list) {
        String str2;
        String str3;
        String str4;
        byte b10;
        zzat zzatVar;
        zzat zzatVar2;
        zzap zzatVar3;
        zzap zzahVar;
        int i10;
        zzat zzatVar4;
        zzap zzahVar2;
        int i11;
        boolean z10;
        zzg zzgVar2;
        int iZza;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str)) {
            str2 = "toLocaleUpperCase";
        } else {
            str2 = "toLocaleUpperCase";
            if (!str2.equals(str) && !"trim".equals(str)) {
                throw new IllegalArgumentException(String.format("%s is not a String function", str));
            }
        }
        switch (str.hashCode()) {
            case -1789698943:
                str3 = "charAt";
                str4 = "hasOwnProperty";
                b10 = str.equals(str4) ? (byte) 2 : (byte) -1;
                break;
            case -1776922004:
                str3 = "charAt";
                if (str.equals("toString")) {
                    b10 = Constants.CVR_B1b41_1110_ONLINE_PIN;
                    str4 = "hasOwnProperty";
                }
                str4 = "hasOwnProperty";
                break;
            case -1464939364:
                str3 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    b10 = 12;
                    str4 = "hasOwnProperty";
                }
                str4 = "hasOwnProperty";
                break;
            case -1361633751:
                str3 = "charAt";
                if (str.equals(str3)) {
                    str4 = "hasOwnProperty";
                    b10 = 0;
                } else {
                    str4 = "hasOwnProperty";
                }
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b10 = 1;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                }
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    b10 = 13;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                }
                break;
            case -906336856:
                if (str.equals("search")) {
                    b10 = 7;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                }
                break;
            case -726908483:
                if (str.equals(str2)) {
                    b10 = 11;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                }
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b10 = 4;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                }
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    b10 = 15;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                }
                break;
            case 3568674:
                if (str.equals("trim")) {
                    b10 = 16;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                }
                break;
            case 103668165:
                if (str.equals("match")) {
                    b10 = 5;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                }
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b10 = 8;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                }
                break;
            case 109648666:
                if (str.equals("split")) {
                    b10 = 9;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                }
                break;
            case 530542161:
                if (str.equals("substring")) {
                    b10 = 10;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                }
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    b10 = 6;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                }
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    b10 = 3;
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                }
                break;
            default:
                str3 = "charAt";
                str4 = "hasOwnProperty";
                break;
        }
        String strZzi = "undefined";
        String str5 = str4;
        switch (b10) {
            case 0:
                zzh.zzj(str3, 1, list);
                int iZza2 = list.size() > 0 ? (int) zzh.zza(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue()) : 0;
                String str6 = this.zza;
                if (iZza2 < 0 || iZza2 >= str6.length()) {
                    return zzap.zzm;
                }
                zzatVar = new zzat(String.valueOf(str6.charAt(iZza2)));
                return zzatVar;
            case 1:
                zzatVar2 = this;
                if (list.size() != 0) {
                    StringBuilder sb2 = new StringBuilder(zzatVar2.zza);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        sb2.append(zzgVar.zzb((zzap) list.get(i12)).zzi());
                    }
                    zzatVar3 = new zzat(sb2.toString());
                    return zzatVar3;
                }
                return zzatVar2;
            case 2:
                zzatVar2 = this;
                zzh.zzh(str5, 1, list);
                String str7 = zzatVar2.zza;
                zzap zzapVarZzb = zzgVar.zzb((zzap) list.get(0));
                if ("length".equals(zzapVarZzb.zzi())) {
                    zzahVar = zzap.zzk;
                } else {
                    double dDoubleValue = zzapVarZzb.zzh().doubleValue();
                    zzahVar = (dDoubleValue != Math.floor(dDoubleValue) || (i10 = (int) dDoubleValue) < 0 || i10 >= str7.length()) ? zzap.zzl : zzap.zzk;
                }
                return zzahVar;
            case 3:
                zzatVar4 = this;
                zzh.zzj("indexOf", 2, list);
                zzahVar2 = new zzah(Double.valueOf(zzatVar4.zza.indexOf(list.size() > 0 ? zzgVar.zzb((zzap) list.get(0)).zzi() : "undefined", (int) zzh.zza(list.size() >= 2 ? zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue() : 0.0d))));
                return zzahVar2;
            case 4:
                zzatVar2 = this;
                zzh.zzj("lastIndexOf", 2, list);
                String str8 = zzatVar2.zza;
                String strZzi2 = list.size() > 0 ? zzgVar.zzb((zzap) list.get(0)).zzi() : "undefined";
                double dDoubleValue2 = list.size() < 2 ? Double.NaN : zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue();
                zzatVar3 = new zzah(Double.valueOf(str8.lastIndexOf(strZzi2, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : zzh.zza(dDoubleValue2)))));
                return zzatVar3;
            case 5:
                zzatVar2 = this;
                zzh.zzj("match", 1, list);
                Matcher matcher = Pattern.compile(list.size() > 0 ? zzgVar.zzb((zzap) list.get(0)).zzi() : "").matcher(zzatVar2.zza);
                if (matcher.find()) {
                    zzatVar3 = new zzae(Arrays.asList(new zzat(matcher.group())));
                    return zzatVar3;
                }
                zzahVar = zzap.zzg;
                return zzahVar;
            case 6:
                zzatVar2 = this;
                zzh.zzj("replace", 2, list);
                zzap zzapVarZza = zzap.zzf;
                if (list.size() > 0) {
                    strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
                    if (list.size() > 1) {
                        zzapVarZza = zzgVar.zzb((zzap) list.get(1));
                    }
                }
                String str9 = strZzi;
                String str10 = zzatVar2.zza;
                int iIndexOf = str10.indexOf(str9);
                if (iIndexOf >= 0) {
                    if (zzapVarZza instanceof zzai) {
                        zzapVarZza = ((zzai) zzapVarZza).zza(zzgVar, Arrays.asList(new zzat(str9), new zzah(Double.valueOf(iIndexOf)), zzatVar2));
                    }
                    String strSubstring = str10.substring(0, iIndexOf);
                    String strZzi3 = zzapVarZza.zzi();
                    String strSubstring2 = str10.substring(str9.length() + iIndexOf);
                    return new zzat(f.c(new StringBuilder(String.valueOf(strSubstring).length() + String.valueOf(strZzi3).length() + String.valueOf(strSubstring2).length()), strSubstring, strZzi3, strSubstring2));
                }
                return zzatVar2;
            case 7:
                zzatVar2 = this;
                zzh.zzj("search", 1, list);
                Matcher matcher2 = Pattern.compile(list.size() > 0 ? zzgVar.zzb((zzap) list.get(0)).zzi() : "undefined").matcher(zzatVar2.zza);
                if (matcher2.find()) {
                    zzatVar3 = new zzah(Double.valueOf(matcher2.start()));
                    return zzatVar3;
                }
                zzahVar = new zzah(Double.valueOf(-1.0d));
                return zzahVar;
            case 8:
                zzh.zzj("slice", 2, list);
                String str11 = this.zza;
                double dZza = zzh.zza(list.size() > 0 ? zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue() : 0.0d);
                int iMax = (int) (dZza < 0.0d ? Math.max(((double) str11.length()) + dZza, 0.0d) : Math.min(dZza, str11.length()));
                double dZza2 = zzh.zza(list.size() > 1 ? zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue() : str11.length());
                zzatVar = new zzat(str11.substring(iMax, Math.max(0, ((int) (dZza2 < 0.0d ? Math.max(((double) str11.length()) + dZza2, 0.0d) : Math.min(dZza2, str11.length()))) - iMax) + iMax));
                return zzatVar;
            case 9:
                zzatVar2 = this;
                zzh.zzj("split", 2, list);
                String str12 = zzatVar2.zza;
                if (str12.length() == 0) {
                    zzahVar = new zzae(Arrays.asList(zzatVar2));
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (list.size() == 0) {
                        arrayList.add(zzatVar2);
                    } else {
                        String strZzi4 = zzgVar.zzb((zzap) list.get(0)).zzi();
                        long jZzd = list.size() > 1 ? zzh.zzd(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()) : 2147483647L;
                        if (jZzd == 0) {
                            zzahVar = new zzae();
                        } else {
                            String[] strArrSplit = str12.split(Pattern.quote(strZzi4), ((int) jZzd) + 1);
                            int length = strArrSplit.length;
                            if (!strZzi4.equals("") || length <= 0) {
                                i11 = length;
                                z10 = false;
                            } else {
                                boolean zEquals = strArrSplit[0].equals("");
                                i11 = length - 1;
                                if (!strArrSplit[i11].equals("")) {
                                    i11 = length;
                                }
                                z10 = zEquals;
                            }
                            if (length > jZzd) {
                                i11--;
                            }
                            for (?? r1 = z10; r1 < i11; r1++) {
                                arrayList.add(new zzat(strArrSplit[r1]));
                            }
                        }
                    }
                    zzahVar = new zzae(arrayList);
                }
                return zzahVar;
            case 10:
                zzatVar4 = this;
                zzh.zzj("substring", 2, list);
                String str13 = zzatVar4.zza;
                if (list.size() > 0) {
                    zzgVar2 = zzgVar;
                    iZza = (int) zzh.zza(zzgVar2.zzb((zzap) list.get(0)).zzh().doubleValue());
                } else {
                    zzgVar2 = zzgVar;
                    iZza = 0;
                }
                int iZza3 = list.size() > 1 ? (int) zzh.zza(zzgVar2.zzb((zzap) list.get(1)).zzh().doubleValue()) : str13.length();
                int iMin = Math.min(Math.max(iZza, 0), str13.length());
                int iMin2 = Math.min(Math.max(iZza3, 0), str13.length());
                zzahVar2 = new zzat(str13.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                return zzahVar2;
            case 11:
                zzatVar2 = this;
                zzh.zzh(str2, 0, list);
                zzatVar3 = new zzat(zzatVar2.zza.toUpperCase());
                return zzatVar3;
            case 12:
                zzatVar2 = this;
                zzh.zzh("toLocaleLowerCase", 0, list);
                zzatVar3 = new zzat(zzatVar2.zza.toLowerCase());
                return zzatVar3;
            case 13:
                zzatVar2 = this;
                zzh.zzh("toLowerCase", 0, list);
                zzatVar3 = new zzat(zzatVar2.zza.toLowerCase(Locale.ENGLISH));
                return zzatVar3;
            case 14:
                zzatVar2 = this;
                zzh.zzh("toString", 0, list);
                return zzatVar2;
            case 15:
                zzatVar2 = this;
                zzh.zzh("toUpperCase", 0, list);
                zzatVar3 = new zzat(zzatVar2.zza.toUpperCase(Locale.ENGLISH));
                return zzatVar3;
            case 16:
                zzh.zzh("toUpperCase", 0, list);
                zzatVar2 = this;
                zzatVar3 = new zzat(zzatVar2.zza.trim());
                return zzatVar3;
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzat(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        if (this.zza.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.zza);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new zzar(this);
    }
}
