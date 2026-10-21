package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.camera.core.impl.utils.c;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.tohu.android.product.valkyria.sdk.services.impl.BackendServiceDefaultImpl;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzlb;
import com.google.android.gms.internal.measurement.zzos;
import com.salesforce.marketingcloud.storage.db.k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzkr extends zzkf {
    public zzkr(zzkp zzkpVar) {
        super(zzkpVar);
    }

    @WorkerThread
    public static final boolean zzA(zzau zzauVar, zzp zzpVar) {
        Preconditions.checkNotNull(zzauVar);
        Preconditions.checkNotNull(zzpVar);
        return (TextUtils.isEmpty(zzpVar.zzb) && TextUtils.isEmpty(zzpVar.zzq)) ? false : true;
    }

    public static final com.google.android.gms.internal.measurement.zzfs zzB(com.google.android.gms.internal.measurement.zzfo zzfoVar, String str) {
        for (com.google.android.gms.internal.measurement.zzfs zzfsVar : zzfoVar.zzi()) {
            if (zzfsVar.zzg().equals(str)) {
                return zzfsVar;
            }
        }
        return null;
    }

    public static final Object zzC(com.google.android.gms.internal.measurement.zzfo zzfoVar, String str) {
        com.google.android.gms.internal.measurement.zzfs zzfsVarZzB = zzB(zzfoVar, str);
        if (zzfsVarZzB == null) {
            return null;
        }
        if (zzfsVarZzB.zzy()) {
            return zzfsVarZzB.zzh();
        }
        if (zzfsVarZzB.zzw()) {
            return Long.valueOf(zzfsVarZzB.zzd());
        }
        if (zzfsVarZzB.zzu()) {
            return Double.valueOf(zzfsVarZzB.zza());
        }
        if (zzfsVarZzB.zzc() <= 0) {
            return null;
        }
        List<com.google.android.gms.internal.measurement.zzfs> listZzi = zzfsVarZzB.zzi();
        ArrayList arrayList = new ArrayList();
        for (com.google.android.gms.internal.measurement.zzfs zzfsVar : listZzi) {
            if (zzfsVar != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.zzfs zzfsVar2 : zzfsVar.zzi()) {
                    if (zzfsVar2.zzy()) {
                        bundle.putString(zzfsVar2.zzg(), zzfsVar2.zzh());
                    } else if (zzfsVar2.zzw()) {
                        bundle.putLong(zzfsVar2.zzg(), zzfsVar2.zzd());
                    } else if (zzfsVar2.zzu()) {
                        bundle.putDouble(zzfsVar2.zzg(), zzfsVar2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private final void zzD(StringBuilder sb2, int i10, List list) {
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzfs zzfsVar = (com.google.android.gms.internal.measurement.zzfs) it.next();
            if (zzfsVar != null) {
                zzF(sb2, i11);
                sb2.append("param {\n");
                zzI(sb2, i11, "name", zzfsVar.zzx() ? this.zzs.zzj().zze(zzfsVar.zzg()) : null);
                zzI(sb2, i11, "string_value", zzfsVar.zzy() ? zzfsVar.zzh() : null);
                zzI(sb2, i11, "int_value", zzfsVar.zzw() ? Long.valueOf(zzfsVar.zzd()) : null);
                zzI(sb2, i11, "double_value", zzfsVar.zzu() ? Double.valueOf(zzfsVar.zza()) : null);
                if (zzfsVar.zzc() > 0) {
                    zzD(sb2, i11, zzfsVar.zzi());
                }
                zzF(sb2, i11);
                sb2.append("}\n");
            }
        }
    }

    private final void zzE(StringBuilder sb2, int i10, com.google.android.gms.internal.measurement.zzel zzelVar) {
        String str;
        if (zzelVar == null) {
            return;
        }
        zzF(sb2, i10);
        sb2.append("filter {\n");
        if (zzelVar.zzh()) {
            zzI(sb2, i10, "complement", Boolean.valueOf(zzelVar.zzg()));
        }
        if (zzelVar.zzj()) {
            zzI(sb2, i10, "param_name", this.zzs.zzj().zze(zzelVar.zze()));
        }
        if (zzelVar.zzk()) {
            int i11 = i10 + 1;
            com.google.android.gms.internal.measurement.zzex zzexVarZzd = zzelVar.zzd();
            if (zzexVarZzd != null) {
                zzF(sb2, i11);
                sb2.append("string_filter {\n");
                if (zzexVarZzd.zzi()) {
                    switch (zzexVarZzd.zzj()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    zzI(sb2, i11, "match_type", str);
                }
                if (zzexVarZzd.zzh()) {
                    zzI(sb2, i11, "expression", zzexVarZzd.zzd());
                }
                if (zzexVarZzd.zzg()) {
                    zzI(sb2, i11, "case_sensitive", Boolean.valueOf(zzexVarZzd.zzf()));
                }
                if (zzexVarZzd.zza() > 0) {
                    zzF(sb2, i10 + 2);
                    sb2.append("expression_list {\n");
                    for (String str2 : zzexVarZzd.zze()) {
                        zzF(sb2, i10 + 3);
                        sb2.append(str2);
                        sb2.append(RootService.LINE_BREAK);
                    }
                    sb2.append("}\n");
                }
                zzF(sb2, i11);
                sb2.append("}\n");
            }
        }
        if (zzelVar.zzi()) {
            zzJ(sb2, i10 + 1, "number_filter", zzelVar.zzc());
        }
        zzF(sb2, i10);
        sb2.append("}\n");
    }

    private static final void zzF(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    private static final String zzG(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    private static final void zzH(StringBuilder sb2, int i10, String str, com.google.android.gms.internal.measurement.zzgd zzgdVar) {
        if (zzgdVar == null) {
            return;
        }
        zzF(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzgdVar.zzb() != 0) {
            zzF(sb2, 4);
            sb2.append("results: ");
            int i11 = 0;
            for (Long l6 : zzgdVar.zzk()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l6);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (zzgdVar.zzd() != 0) {
            zzF(sb2, 4);
            sb2.append("status: ");
            int i13 = 0;
            for (Long l7 : zzgdVar.zzn()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l7);
                i13 = i14;
            }
            sb2.append('\n');
        }
        if (zzgdVar.zza() != 0) {
            zzF(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i15 = 0;
            for (com.google.android.gms.internal.measurement.zzfm zzfmVar : zzgdVar.zzj()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzfmVar.zzh() ? Integer.valueOf(zzfmVar.zza()) : null);
                sb2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                sb2.append(zzfmVar.zzg() ? Long.valueOf(zzfmVar.zzb()) : null);
                i15 = i16;
            }
            sb2.append("}\n");
        }
        if (zzgdVar.zzc() != 0) {
            zzF(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i17 = 0;
            for (com.google.android.gms.internal.measurement.zzgf zzgfVar : zzgdVar.zzm()) {
                int i18 = i17 + 1;
                if (i17 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzgfVar.zzi() ? Integer.valueOf(zzgfVar.zzb()) : null);
                sb2.append(": [");
                Iterator it = zzgfVar.zzf().iterator();
                int i19 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i20 = i19 + 1;
                    if (i19 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(jLongValue);
                    i19 = i20;
                }
                sb2.append(Constant.BRACKET_CLOSE);
                i17 = i18;
            }
            sb2.append("}\n");
        }
        zzF(sb2, 3);
        sb2.append("}\n");
    }

    private static final void zzI(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        zzF(sb2, i10 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    private static final void zzJ(StringBuilder sb2, int i10, String str, com.google.android.gms.internal.measurement.zzeq zzeqVar) {
        String str2;
        if (zzeqVar == null) {
            return;
        }
        zzF(sb2, i10);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzeqVar.zzg()) {
            int iZzm = zzeqVar.zzm();
            if (iZzm == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iZzm == 2) {
                str2 = "LESS_THAN";
            } else if (iZzm != 3) {
                str2 = iZzm != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            zzI(sb2, i10, "comparison_type", str2);
        }
        if (zzeqVar.zzi()) {
            zzI(sb2, i10, "match_as_float", Boolean.valueOf(zzeqVar.zzf()));
        }
        if (zzeqVar.zzh()) {
            zzI(sb2, i10, "comparison_value", zzeqVar.zzc());
        }
        if (zzeqVar.zzk()) {
            zzI(sb2, i10, "min_comparison_value", zzeqVar.zze());
        }
        if (zzeqVar.zzj()) {
            zzI(sb2, i10, "max_comparison_value", zzeqVar.zzd());
        }
        zzF(sb2, i10);
        sb2.append("}\n");
    }

    public static int zza(com.google.android.gms.internal.measurement.zzfx zzfxVar, String str) {
        for (int i10 = 0; i10 < zzfxVar.zzb(); i10++) {
            if (str.equals(zzfxVar.zzaj(i10).zzf())) {
                return i10;
            }
        }
        return -1;
    }

    public static zzlb zzl(zzlb zzlbVar, byte[] bArr) throws com.google.android.gms.internal.measurement.zzkh {
        com.google.android.gms.internal.measurement.zzjj zzjjVarZzb = com.google.android.gms.internal.measurement.zzjj.zzb();
        return zzjjVarZzb != null ? zzlbVar.zzau(bArr, zzjjVarZzb) : zzlbVar.zzat(bArr);
    }

    public static List zzr(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static boolean zzv(List list, int i10) {
        if (i10 < list.size() * 64) {
            return ((1 << (i10 % 64)) & ((Long) list.get(i10 / 64)).longValue()) != 0;
        }
        return false;
    }

    public static boolean zzx(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static final void zzz(com.google.android.gms.internal.measurement.zzfn zzfnVar, String str, Object obj) {
        List listZzp = zzfnVar.zzp();
        int i10 = 0;
        while (true) {
            if (i10 >= listZzp.size()) {
                i10 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.zzfs) listZzp.get(i10)).zzg())) {
                break;
            } else {
                i10++;
            }
        }
        com.google.android.gms.internal.measurement.zzfr zzfrVarZze = com.google.android.gms.internal.measurement.zzfs.zze();
        zzfrVarZze.zzj(str);
        if (obj instanceof Long) {
            zzfrVarZze.zzi(((Long) obj).longValue());
        }
        if (i10 >= 0) {
            zzfnVar.zzj(i10, zzfrVarZze);
        } else {
            zzfnVar.zze(zzfrVarZze);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzkf
    public final boolean zzb() {
        return false;
    }

    @WorkerThread
    public final long zzd(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        this.zzs.zzv().zzg();
        MessageDigest messageDigestZzE = zzkw.zzE();
        if (messageDigestZzE != null) {
            return zzkw.zzp(messageDigestZzE.digest(bArr));
        }
        bc.org.bouncycastle.math.ec.custom.sec.a.e(this.zzs, "Failed to get MD5");
        return 0L;
    }

    public final Bundle zzf(Map map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z10) {
                zzos.zzc();
                if (this.zzs.zzf().zzs(null, zzdu.zzam)) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        arrayList2.add(zzf((Map) arrayList.get(i10), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                } else {
                    ArrayList arrayList3 = (ArrayList) obj;
                    ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                    int size2 = arrayList3.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        arrayList4.add(zzf((Map) arrayList3.get(i11), false));
                    }
                    bundle.putParcelableArrayList(str, arrayList4);
                }
            }
        }
        return bundle;
    }

    public final Parcelable zzh(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (SafeParcelReader.ParseException unused) {
            this.zzs.zzay().zzd().zza("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    public final zzau zzi(com.google.android.gms.internal.measurement.zzaa zzaaVar) {
        Object obj;
        Bundle bundleZzf = zzf(zzaaVar.zze(), true);
        String string = (!bundleZzf.containsKey("_o") || (obj = bundleZzf.get("_o")) == null) ? "app" : obj.toString();
        String strZzb = zzgo.zzb(zzaaVar.zzd());
        if (strZzb == null) {
            strZzb = zzaaVar.zzd();
        }
        return new zzau(strZzb, new zzas(bundleZzf), string, zzaaVar.zza());
    }

    public final com.google.android.gms.internal.measurement.zzfo zzj(zzap zzapVar) {
        com.google.android.gms.internal.measurement.zzfn zzfnVarZze = com.google.android.gms.internal.measurement.zzfo.zze();
        zzfnVarZze.zzl(zzapVar.zze);
        zzar zzarVar = new zzar(zzapVar.zzf);
        while (zzarVar.hasNext()) {
            String next = zzarVar.next();
            com.google.android.gms.internal.measurement.zzfr zzfrVarZze = com.google.android.gms.internal.measurement.zzfs.zze();
            zzfrVarZze.zzj(next);
            Object objZzf = zzapVar.zzf.zzf(next);
            Preconditions.checkNotNull(objZzf);
            zzt(zzfrVarZze, objZzf);
            zzfnVarZze.zze(zzfrVarZze);
        }
        return (com.google.android.gms.internal.measurement.zzfo) zzfnVarZze.zzay();
    }

    public final String zzm(com.google.android.gms.internal.measurement.zzfw zzfwVar) {
        if (zzfwVar == null) {
            return "";
        }
        StringBuilder sbD = c.d("\nbatch {\n");
        for (com.google.android.gms.internal.measurement.zzfy zzfyVar : zzfwVar.zzd()) {
            if (zzfyVar != null) {
                zzF(sbD, 1);
                sbD.append("bundle {\n");
                if (zzfyVar.zzbf()) {
                    zzI(sbD, 1, "protocol_version", Integer.valueOf(zzfyVar.zzd()));
                }
                zzI(sbD, 1, k.a.f65035b, zzfyVar.zzJ());
                if (zzfyVar.zzbb()) {
                    zzI(sbD, 1, "gmp_version", Long.valueOf(zzfyVar.zzn()));
                }
                if (zzfyVar.zzbl()) {
                    zzI(sbD, 1, "uploading_gmp_version", Long.valueOf(zzfyVar.zzs()));
                }
                if (zzfyVar.zzaZ()) {
                    zzI(sbD, 1, "dynamite_version", Long.valueOf(zzfyVar.zzk()));
                }
                if (zzfyVar.zzaW()) {
                    zzI(sbD, 1, "config_version", Long.valueOf(zzfyVar.zzi()));
                }
                zzI(sbD, 1, "gmp_app_id", zzfyVar.zzG());
                zzI(sbD, 1, "admob_app_id", zzfyVar.zzx());
                zzI(sbD, 1, "app_id", zzfyVar.zzy());
                zzI(sbD, 1, k.a.f65049q, zzfyVar.zzB());
                if (zzfyVar.zzaU()) {
                    zzI(sbD, 1, "app_version_major", Integer.valueOf(zzfyVar.zza()));
                }
                zzI(sbD, 1, "firebase_instance_id", zzfyVar.zzF());
                if (zzfyVar.zzaY()) {
                    zzI(sbD, 1, "dev_cert_hash", Long.valueOf(zzfyVar.zzj()));
                }
                zzI(sbD, 1, "app_store", zzfyVar.zzA());
                if (zzfyVar.zzbk()) {
                    zzI(sbD, 1, "upload_timestamp_millis", Long.valueOf(zzfyVar.zzr()));
                }
                if (zzfyVar.zzbi()) {
                    zzI(sbD, 1, "start_timestamp_millis", Long.valueOf(zzfyVar.zzq()));
                }
                if (zzfyVar.zzba()) {
                    zzI(sbD, 1, "end_timestamp_millis", Long.valueOf(zzfyVar.zzm()));
                }
                if (zzfyVar.zzbe()) {
                    zzI(sbD, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzfyVar.zzp()));
                }
                if (zzfyVar.zzbd()) {
                    zzI(sbD, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzfyVar.zzo()));
                }
                zzI(sbD, 1, "app_instance_id", zzfyVar.zzz());
                zzI(sbD, 1, "resettable_device_id", zzfyVar.zzK());
                zzI(sbD, 1, "ds_id", zzfyVar.zzE());
                if (zzfyVar.zzbc()) {
                    zzI(sbD, 1, "limited_ad_tracking", Boolean.valueOf(zzfyVar.zzaR()));
                }
                zzI(sbD, 1, BackendServiceDefaultImpl.OS_VERSION_HEADER, zzfyVar.zzI());
                zzI(sbD, 1, "device_model", zzfyVar.zzD());
                zzI(sbD, 1, "user_default_language", zzfyVar.zzL());
                if (zzfyVar.zzbj()) {
                    zzI(sbD, 1, "time_zone_offset_minutes", Integer.valueOf(zzfyVar.zzf()));
                }
                if (zzfyVar.zzaV()) {
                    zzI(sbD, 1, "bundle_sequential_index", Integer.valueOf(zzfyVar.zzb()));
                }
                if (zzfyVar.zzbh()) {
                    zzI(sbD, 1, "service_upload", Boolean.valueOf(zzfyVar.zzaS()));
                }
                zzI(sbD, 1, "health_monitor", zzfyVar.zzH());
                if (!this.zzs.zzf().zzs(null, zzdu.zzah) && zzfyVar.zzaT() && zzfyVar.zzh() != 0) {
                    zzI(sbD, 1, "android_id", Long.valueOf(zzfyVar.zzh()));
                }
                if (zzfyVar.zzbg()) {
                    zzI(sbD, 1, "retry_counter", Integer.valueOf(zzfyVar.zze()));
                }
                if (zzfyVar.zzaX()) {
                    zzI(sbD, 1, "consent_signals", zzfyVar.zzC());
                }
                List<com.google.android.gms.internal.measurement.zzgh> listZzO = zzfyVar.zzO();
                if (listZzO != null) {
                    for (com.google.android.gms.internal.measurement.zzgh zzghVar : listZzO) {
                        if (zzghVar != null) {
                            zzF(sbD, 2);
                            sbD.append("user_property {\n");
                            zzI(sbD, 2, "set_timestamp_millis", zzghVar.zzs() ? Long.valueOf(zzghVar.zzc()) : null);
                            zzI(sbD, 2, "name", this.zzs.zzj().zzf(zzghVar.zzf()));
                            zzI(sbD, 2, "string_value", zzghVar.zzg());
                            zzI(sbD, 2, "int_value", zzghVar.zzr() ? Long.valueOf(zzghVar.zzb()) : null);
                            zzI(sbD, 2, "double_value", zzghVar.zzq() ? Double.valueOf(zzghVar.zza()) : null);
                            zzF(sbD, 2);
                            sbD.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzfk> listZzM = zzfyVar.zzM();
                if (listZzM != null) {
                    for (com.google.android.gms.internal.measurement.zzfk zzfkVar : listZzM) {
                        if (zzfkVar != null) {
                            zzF(sbD, 2);
                            sbD.append("audience_membership {\n");
                            if (zzfkVar.zzk()) {
                                zzI(sbD, 2, "audience_id", Integer.valueOf(zzfkVar.zza()));
                            }
                            if (zzfkVar.zzm()) {
                                zzI(sbD, 2, "new_audience", Boolean.valueOf(zzfkVar.zzj()));
                            }
                            zzH(sbD, 2, "current_data", zzfkVar.zzd());
                            if (zzfkVar.zzn()) {
                                zzH(sbD, 2, "previous_data", zzfkVar.zze());
                            }
                            zzF(sbD, 2);
                            sbD.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzfo> listZzN = zzfyVar.zzN();
                if (listZzN != null) {
                    for (com.google.android.gms.internal.measurement.zzfo zzfoVar : listZzN) {
                        if (zzfoVar != null) {
                            zzF(sbD, 2);
                            sbD.append("event {\n");
                            zzI(sbD, 2, "name", this.zzs.zzj().zzd(zzfoVar.zzh()));
                            if (zzfoVar.zzu()) {
                                zzI(sbD, 2, "timestamp_millis", Long.valueOf(zzfoVar.zzd()));
                            }
                            if (zzfoVar.zzt()) {
                                zzI(sbD, 2, "previous_timestamp_millis", Long.valueOf(zzfoVar.zzc()));
                            }
                            if (zzfoVar.zzs()) {
                                zzI(sbD, 2, "count", Integer.valueOf(zzfoVar.zza()));
                            }
                            if (zzfoVar.zzb() != 0) {
                                zzD(sbD, 2, zzfoVar.zzi());
                            }
                            zzF(sbD, 2);
                            sbD.append("}\n");
                        }
                    }
                }
                zzF(sbD, 1);
                sbD.append("}\n");
            }
        }
        sbD.append("}\n");
        return sbD.toString();
    }

    public final String zzo(com.google.android.gms.internal.measurement.zzej zzejVar) {
        if (zzejVar == null) {
            return AbstractJsonLexerKt.NULL;
        }
        StringBuilder sbD = c.d("\nevent_filter {\n");
        if (zzejVar.zzp()) {
            zzI(sbD, 0, "filter_id", Integer.valueOf(zzejVar.zzb()));
        }
        zzI(sbD, 0, "event_name", this.zzs.zzj().zzd(zzejVar.zzg()));
        String strZzG = zzG(zzejVar.zzk(), zzejVar.zzm(), zzejVar.zzn());
        if (!strZzG.isEmpty()) {
            zzI(sbD, 0, "filter_type", strZzG);
        }
        if (zzejVar.zzo()) {
            zzJ(sbD, 1, "event_count_filter", zzejVar.zzf());
        }
        if (zzejVar.zza() > 0) {
            sbD.append("  filters {\n");
            Iterator it = zzejVar.zzh().iterator();
            while (it.hasNext()) {
                zzE(sbD, 2, (com.google.android.gms.internal.measurement.zzel) it.next());
            }
        }
        zzF(sbD, 1);
        sbD.append("}\n}\n");
        return sbD.toString();
    }

    public final String zzp(com.google.android.gms.internal.measurement.zzes zzesVar) {
        if (zzesVar == null) {
            return AbstractJsonLexerKt.NULL;
        }
        StringBuilder sbD = c.d("\nproperty_filter {\n");
        if (zzesVar.zzj()) {
            zzI(sbD, 0, "filter_id", Integer.valueOf(zzesVar.zza()));
        }
        zzI(sbD, 0, "property_name", this.zzs.zzj().zzf(zzesVar.zze()));
        String strZzG = zzG(zzesVar.zzg(), zzesVar.zzh(), zzesVar.zzi());
        if (!strZzG.isEmpty()) {
            zzI(sbD, 0, "filter_type", strZzG);
        }
        zzE(sbD, 1, zzesVar.zzb());
        sbD.append("}\n");
        return sbD.toString();
    }

    public final List zzq(List list, List list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.zzs.zzay().zzk().zzb("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    this.zzs.zzay().zzk().zzc("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0061  */
    /* JADX WARN: Code duplicated, block: B:30:0x0067  */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x0080  */
    /* JADX WARN: Code duplicated, block: B:38:0x0088  */
    /* JADX WARN: Code duplicated, block: B:40:0x0094  */
    /* JADX WARN: Code duplicated, block: B:42:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x004b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x000d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x000d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x005b, please report this as an issue */
    public final Map zzs(Bundle bundle, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int size;
        int i10;
        Object obj;
        int i11;
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj2 = bundle.get(str);
            zzos.zzc();
            if (this.zzs.zzf().zzs(null, zzdu.zzam)) {
                if ((obj2 instanceof Parcelable[]) || (obj2 instanceof ArrayList) || (obj2 instanceof Bundle)) {
                    if (z10) {
                        arrayList = new ArrayList();
                        if (obj2 instanceof Parcelable[]) {
                            for (Parcelable parcelable : (Parcelable[]) obj2) {
                                if (parcelable instanceof Bundle) {
                                    arrayList.add(zzs((Bundle) parcelable, false));
                                }
                            }
                        } else if (obj2 instanceof ArrayList) {
                            arrayList2 = (ArrayList) obj2;
                            size = arrayList2.size();
                            for (i10 = 0; i10 < size; i10++) {
                                obj = arrayList2.get(i10);
                                if (obj instanceof Bundle) {
                                    arrayList.add(zzs((Bundle) obj, false));
                                }
                            }
                        } else if (obj2 instanceof Bundle) {
                            arrayList.add(zzs((Bundle) obj2, false));
                        }
                        map.put(str, arrayList);
                    }
                } else if (obj2 != null) {
                    map.put(str, obj2);
                }
            } else if ((obj2 instanceof Bundle[]) || (obj2 instanceof ArrayList) || (obj2 instanceof Bundle)) {
                if (z10) {
                    arrayList = new ArrayList();
                    if (obj2 instanceof Parcelable[]) {
                        while (i11 < r5) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(zzs((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj2 instanceof ArrayList) {
                        arrayList2 = (ArrayList) obj2;
                        size = arrayList2.size();
                        while (i10 < size) {
                            obj = arrayList2.get(i10);
                            if (obj instanceof Bundle) {
                                arrayList.add(zzs((Bundle) obj, false));
                            }
                        }
                    } else if (obj2 instanceof Bundle) {
                        arrayList.add(zzs((Bundle) obj2, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj2 != null) {
                map.put(str, obj2);
            }
        }
        return map;
    }

    public final void zzt(com.google.android.gms.internal.measurement.zzfr zzfrVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzfrVar.zzg();
        zzfrVar.zze();
        zzfrVar.zzd();
        zzfrVar.zzf();
        if (obj instanceof String) {
            zzfrVar.zzk((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzfrVar.zzi(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            zzfrVar.zzh(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            this.zzs.zzay().zzd().zzb("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.zzfr zzfrVarZze = com.google.android.gms.internal.measurement.zzfs.zze();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.zzfr zzfrVarZze2 = com.google.android.gms.internal.measurement.zzfs.zze();
                    zzfrVarZze2.zzj(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        zzfrVarZze2.zzi(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        zzfrVarZze2.zzk((String) obj2);
                    } else if (obj2 instanceof Double) {
                        zzfrVarZze2.zzh(((Double) obj2).doubleValue());
                    }
                    zzfrVarZze.zzc(zzfrVarZze2);
                }
                if (zzfrVarZze.zza() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.zzfs) zzfrVarZze.zzay());
                }
            }
        }
        zzfrVar.zzb(arrayList);
    }

    public final void zzu(com.google.android.gms.internal.measurement.zzgg zzggVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzggVar.zzc();
        zzggVar.zzb();
        zzggVar.zza();
        if (obj instanceof String) {
            zzggVar.zzh((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzggVar.zze(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzggVar.zzd(((Double) obj).doubleValue());
        } else {
            this.zzs.zzay().zzd().zzb("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final boolean zzw(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(this.zzs.zzav().currentTimeMillis() - j10) > j11;
    }

    public final byte[] zzy(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e5) {
            this.zzs.zzay().zzd().zzb("Failed to gzip content", e5);
            throw e5;
        }
    }
}
