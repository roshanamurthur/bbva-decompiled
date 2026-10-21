package com.google.android.gms.measurement.internal;

import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.zzoa;
import java.util.HashSet;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzw extends zzx {
    final /* synthetic */ zzz zza;
    private final com.google.android.gms.internal.measurement.zzej zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzw(zzz zzzVar, String str, int i10, com.google.android.gms.internal.measurement.zzej zzejVar) {
        super(str, i10);
        this.zza = zzzVar;
        this.zzh = zzejVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzx
    public final int zza() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzx
    public final boolean zzb() {
        return this.zzh.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzx
    public final boolean zzc() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:105:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:107:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:108:0x030d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0313  */
    /* JADX WARN: Code duplicated, block: B:112:0x031b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0327  */
    /* JADX WARN: Code duplicated, block: B:121:0x0388 A[EDGE_INSN: B:121:0x0388->B:124:0x03e0 BREAK  A[LOOP:0: B:40:0x0121->B:45:0x0156]] */
    /* JADX WARN: Code duplicated, block: B:122:0x03b4 A[EDGE_INSN: B:122:0x03b4->B:124:0x03e0 BREAK  A[LOOP:0: B:40:0x0121->B:45:0x0156]] */
    /* JADX WARN: Code duplicated, block: B:157:0x015e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x01cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x03de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x022b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x029f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x03e0 A[EDGE_INSN: B:175:0x03e0->B:124:0x03e0 BREAK  A[LOOP:0: B:40:0x0121->B:45:0x0156], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x029b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x03e0 A[EDGE_INSN: B:177:0x03e0->B:124:0x03e0 BREAK  A[LOOP:0: B:40:0x0121->B:45:0x0156], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x0252 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x02f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x02a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x02a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0386 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x035c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0331 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x03e0 A[EDGE_INSN: B:186:0x03e0->B:124:0x03e0 BREAK  A[LOOP:0: B:40:0x0121->B:45:0x0156], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x032d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0114  */
    /* JADX WARN: Code duplicated, block: B:42:0x0127  */
    /* JADX WARN: Code duplicated, block: B:45:0x0156 A[LOOP:0: B:40:0x0121->B:45:0x0156, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x0171  */
    /* JADX WARN: Code duplicated, block: B:55:0x0191  */
    /* JADX WARN: Code duplicated, block: B:56:0x019a  */
    /* JADX WARN: Code duplicated, block: B:62:0x01af  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x020c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0220  */
    /* JADX WARN: Code duplicated, block: B:81:0x024a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0283  */
    /* JADX WARN: Code duplicated, block: B:89:0x0295  */
    /* JADX WARN: Code duplicated, block: B:97:0x02d4  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzd(Long l6, Long l7, com.google.android.gms.internal.measurement.zzfo zzfoVar, long j10, zzaq zzaqVar, boolean z10) {
        HashSet hashSet;
        Iterator it;
        ArrayMap arrayMap;
        Iterator it2;
        Iterator it3;
        com.google.android.gms.internal.measurement.zzel zzelVar;
        boolean z11;
        String strZze;
        Object obj;
        Boolean boolZzh;
        Boolean boolZzg;
        String str;
        Boolean boolZzi;
        com.google.android.gms.internal.measurement.zzfs zzfsVar;
        Long lValueOf;
        Double dValueOf;
        com.google.android.gms.internal.measurement.zzel zzelVar2;
        zzoa.zzc();
        boolean zZzs = this.zza.zzs.zzf().zzs(this.zzb, zzdu.zzW);
        long j11 = this.zzh.zzn() ? zzaqVar.zze : j10;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (Log.isLoggable(this.zza.zzs.zzay().zzq(), 2)) {
            this.zza.zzs.zzay().zzj().zzd("Evaluating filter. audience, filter, event", Integer.valueOf(this.zzc), this.zzh.zzp() ? Integer.valueOf(this.zzh.zzb()) : null, this.zza.zzs.zzj().zzd(this.zzh.zzg()));
            this.zza.zzs.zzay().zzj().zzb("Filter definition", this.zza.zzf.zzu().zzo(this.zzh));
        }
        if (!this.zzh.zzp() || this.zzh.zzb() > 256) {
            this.zza.zzs.zzay().zzk().zzc("Invalid event filter ID. appId, id", zzeh.zzn(this.zzb), String.valueOf(this.zzh.zzp() ? Integer.valueOf(this.zzh.zzb()) : null));
            return false;
        }
        Object[] objArr = this.zzh.zzk() || this.zzh.zzm() || this.zzh.zzn();
        if (z10 && objArr != true) {
            this.zza.zzs.zzay().zzj().zzc("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzc), this.zzh.zzp() ? Integer.valueOf(this.zzh.zzb()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.zzej zzejVar = this.zzh;
        String strZzh = zzfoVar.zzh();
        if (!zzejVar.zzo()) {
            hashSet = new HashSet();
            it = zzejVar.zzh().iterator();
            while (true) {
                if (it.hasNext()) {
                    arrayMap = new ArrayMap();
                    it2 = zzfoVar.zzi().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = zzejVar.zzh().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                zzelVar = (com.google.android.gms.internal.measurement.zzel) it3.next();
                                if (zzelVar.zzh() || !zzelVar.zzg()) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                strZze = zzelVar.zze();
                                if (strZze.isEmpty()) {
                                    obj = arrayMap.get(strZze);
                                    if (obj instanceof Long) {
                                        if (obj instanceof Double) {
                                            if (obj instanceof String) {
                                                if (obj == null) {
                                                    this.zza.zzs.zzay().zzk().zzc("Unknown param type. event, param", this.zza.zzs.zzj().zzd(strZzh), this.zza.zzs.zzj().zze(strZze));
                                                    break;
                                                }
                                                this.zza.zzs.zzay().zzj().zzc("Missing param for filter. event, param", this.zza.zzs.zzj().zzd(strZzh), this.zza.zzs.zzj().zze(strZze));
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            if (zzelVar.zzk()) {
                                                if (zzelVar.zzi()) {
                                                    this.zza.zzs.zzay().zzk().zzc("No filter for String param. event, param", this.zza.zzs.zzj().zzd(strZzh), this.zza.zzs.zzj().zze(strZze));
                                                    break;
                                                }
                                                str = (String) obj;
                                                if (zzkr.zzx(str)) {
                                                    this.zza.zzs.zzay().zzk().zzc("Invalid param value for number filter. event, param", this.zza.zzs.zzj().zzd(strZzh), this.zza.zzs.zzj().zze(strZze));
                                                    break;
                                                }
                                                boolZzi = zzx.zzi(str, zzelVar.zzc());
                                            } else {
                                                boolZzi = zzx.zzf((String) obj, zzelVar.zzd(), this.zza.zzs.zzay());
                                            }
                                            if (boolZzi != null) {
                                                break;
                                            }
                                            if (boolZzi.booleanValue() == z11) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        } else {
                                            if (zzelVar.zzi()) {
                                                this.zza.zzs.zzay().zzk().zzc("No number filter for double param. event, param", this.zza.zzs.zzj().zzd(strZzh), this.zza.zzs.zzj().zze(strZze));
                                                break;
                                            }
                                            boolZzg = zzx.zzg(((Double) obj).doubleValue(), zzelVar.zzc());
                                            if (boolZzg != null) {
                                                break;
                                            }
                                            if (boolZzg.booleanValue() == z11) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        }
                                    } else {
                                        if (zzelVar.zzi()) {
                                            this.zza.zzs.zzay().zzk().zzc("No number filter for long param. event, param", this.zza.zzs.zzj().zzd(strZzh), this.zza.zzs.zzj().zze(strZze));
                                            break;
                                        }
                                        boolZzh = zzx.zzh(((Long) obj).longValue(), zzelVar.zzc());
                                        if (boolZzh != null) {
                                            break;
                                        }
                                        if (boolZzh.booleanValue() == z11) {
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                    }
                                } else {
                                    this.zza.zzs.zzay().zzk().zzb("Event has empty param name. event", this.zza.zzs.zzj().zzd(strZzh));
                                    break;
                                }
                            }
                        } else {
                            zzfsVar = (com.google.android.gms.internal.measurement.zzfs) it2.next();
                            if (!hashSet.contains(zzfsVar.zzg())) {
                                if (zzfsVar.zzw()) {
                                    if (zzfsVar.zzu()) {
                                        if (zzfsVar.zzy()) {
                                            this.zza.zzs.zzay().zzk().zzc("Unknown value for param. event, param", this.zza.zzs.zzj().zzd(strZzh), this.zza.zzs.zzj().zze(zzfsVar.zzg()));
                                            break;
                                        }
                                        arrayMap.put(zzfsVar.zzg(), zzfsVar.zzh());
                                    } else {
                                        String strZzg = zzfsVar.zzg();
                                        if (zzfsVar.zzu()) {
                                            dValueOf = Double.valueOf(zzfsVar.zza());
                                        } else {
                                            dValueOf = null;
                                        }
                                        arrayMap.put(strZzg, dValueOf);
                                    }
                                } else {
                                    String strZzg2 = zzfsVar.zzg();
                                    if (zzfsVar.zzw()) {
                                        lValueOf = Long.valueOf(zzfsVar.zzd());
                                    } else {
                                        lValueOf = null;
                                    }
                                    arrayMap.put(strZzg2, lValueOf);
                                }
                            }
                        }
                    }
                } else {
                    zzelVar2 = (com.google.android.gms.internal.measurement.zzel) it.next();
                    if (zzelVar2.zze().isEmpty()) {
                        this.zza.zzs.zzay().zzk().zzb("null or empty param name in filter. event", this.zza.zzs.zzj().zzd(strZzh));
                        break;
                    }
                    hashSet.add(zzelVar2.zze());
                }
            }
        } else {
            Boolean boolZzh2 = zzx.zzh(j11, zzejVar.zzf());
            if (boolZzh2 != null) {
                if (boolZzh2.booleanValue()) {
                    hashSet = new HashSet();
                    it = zzejVar.zzh().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            arrayMap = new ArrayMap();
                            it2 = zzfoVar.zzi().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    it3 = zzejVar.zzh().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            bool = Boolean.TRUE;
                                            break;
                                        }
                                        zzelVar = (com.google.android.gms.internal.measurement.zzel) it3.next();
                                        if (zzelVar.zzh()) {
                                            z11 = false;
                                        } else {
                                            z11 = false;
                                        }
                                        strZze = zzelVar.zze();
                                        if (strZze.isEmpty()) {
                                            obj = arrayMap.get(strZze);
                                            if (obj instanceof Long) {
                                                if (obj instanceof Double) {
                                                    if (obj instanceof String) {
                                                        if (obj == null) {
                                                            this.zza.zzs.zzay().zzk().zzc("Unknown param type. event, param", this.zza.zzs.zzj().zzd(strZzh), this.zza.zzs.zzj().zze(strZze));
                                                            break;
                                                        }
                                                        this.zza.zzs.zzay().zzj().zzc("Missing param for filter. event, param", this.zza.zzs.zzj().zzd(strZzh), this.zza.zzs.zzj().zze(strZze));
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    if (zzelVar.zzk()) {
                                                        if (zzelVar.zzi()) {
                                                            this.zza.zzs.zzay().zzk().zzc("No filter for String param. event, param", this.zza.zzs.zzj().zzd(strZzh), this.zza.zzs.zzj().zze(strZze));
                                                            break;
                                                        }
                                                        str = (String) obj;
                                                        if (zzkr.zzx(str)) {
                                                            this.zza.zzs.zzay().zzk().zzc("Invalid param value for number filter. event, param", this.zza.zzs.zzj().zzd(strZzh), this.zza.zzs.zzj().zze(strZze));
                                                            break;
                                                        }
                                                        boolZzi = zzx.zzi(str, zzelVar.zzc());
                                                    } else {
                                                        boolZzi = zzx.zzf((String) obj, zzelVar.zzd(), this.zza.zzs.zzay());
                                                    }
                                                    if (boolZzi != null) {
                                                        break;
                                                        break;
                                                    }
                                                    if (boolZzi.booleanValue() == z11) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                } else if (zzelVar.zzi()) {
                                                    boolZzg = zzx.zzg(((Double) obj).doubleValue(), zzelVar.zzc());
                                                    if (boolZzg != null) {
                                                        break;
                                                        break;
                                                    }
                                                    if (boolZzg.booleanValue() == z11) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                } else {
                                                    this.zza.zzs.zzay().zzk().zzc("No number filter for double param. event, param", this.zza.zzs.zzj().zzd(strZzh), this.zza.zzs.zzj().zze(strZze));
                                                    break;
                                                }
                                            } else if (zzelVar.zzi()) {
                                                boolZzh = zzx.zzh(((Long) obj).longValue(), zzelVar.zzc());
                                                if (boolZzh != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolZzh.booleanValue() == z11) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                            } else {
                                                this.zza.zzs.zzay().zzk().zzc("No number filter for long param. event, param", this.zza.zzs.zzj().zzd(strZzh), this.zza.zzs.zzj().zze(strZze));
                                                break;
                                            }
                                        } else {
                                            this.zza.zzs.zzay().zzk().zzb("Event has empty param name. event", this.zza.zzs.zzj().zzd(strZzh));
                                            break;
                                        }
                                    }
                                } else {
                                    zzfsVar = (com.google.android.gms.internal.measurement.zzfs) it2.next();
                                    if (!hashSet.contains(zzfsVar.zzg())) {
                                        if (zzfsVar.zzw()) {
                                            if (zzfsVar.zzu()) {
                                                if (zzfsVar.zzy()) {
                                                    this.zza.zzs.zzay().zzk().zzc("Unknown value for param. event, param", this.zza.zzs.zzj().zzd(strZzh), this.zza.zzs.zzj().zze(zzfsVar.zzg()));
                                                    break;
                                                }
                                                arrayMap.put(zzfsVar.zzg(), zzfsVar.zzh());
                                            } else {
                                                String strZzg3 = zzfsVar.zzg();
                                                if (zzfsVar.zzu()) {
                                                    dValueOf = Double.valueOf(zzfsVar.zza());
                                                } else {
                                                    dValueOf = null;
                                                }
                                                arrayMap.put(strZzg3, dValueOf);
                                            }
                                        } else {
                                            String strZzg4 = zzfsVar.zzg();
                                            if (zzfsVar.zzw()) {
                                                lValueOf = Long.valueOf(zzfsVar.zzd());
                                            } else {
                                                lValueOf = null;
                                            }
                                            arrayMap.put(strZzg4, lValueOf);
                                        }
                                    }
                                }
                            }
                        } else {
                            zzelVar2 = (com.google.android.gms.internal.measurement.zzel) it.next();
                            if (zzelVar2.zze().isEmpty()) {
                                this.zza.zzs.zzay().zzk().zzb("null or empty param name in filter. event", this.zza.zzs.zzj().zzd(strZzh));
                                break;
                            }
                            hashSet.add(zzelVar2.zze());
                        }
                    }
                } else {
                    bool = Boolean.FALSE;
                }
            }
        }
        this.zza.zzs.zzay().zzj().zzb("Event filter result", bool == null ? AbstractJsonLexerKt.NULL : bool);
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.zzd = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.zze = bool2;
        if (objArr != false && zzfoVar.zzu()) {
            Long lValueOf2 = Long.valueOf(zzfoVar.zzd());
            if (this.zzh.zzm()) {
                if (zZzs && this.zzh.zzo()) {
                    lValueOf2 = l6;
                }
                this.zzg = lValueOf2;
            } else {
                if (zZzs && this.zzh.zzo()) {
                    lValueOf2 = l7;
                }
                this.zzf = lValueOf2;
            }
        }
        return true;
    }
}
