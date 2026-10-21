package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.constraintlayout.core.parser.a;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zzvz<T> implements zzwh<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzxc.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzvw zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzwv zzl;
    private final zzui zzm;

    private zzvz(int[] iArr, Object[] objArr, int i10, int i11, zzvw zzvwVar, boolean z10, int[] iArr2, int i12, int i13, zzwc zzwcVar, zzvj zzvjVar, zzwv zzwvVar, zzui zzuiVar, zzvr zzvrVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        boolean z11 = false;
        if (zzuiVar != null && (zzvwVar instanceof zzus)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzi = iArr2;
        this.zzj = i12;
        this.zzk = i13;
        this.zzl = zzwvVar;
        this.zzm = zzuiVar;
        this.zzg = zzvwVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzB(Object obj, Object obj2, int i10) {
        if (zzI(obj2, i10)) {
            int iZzs = zzs(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzs;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzwh zzwhVarZzv = zzv(i10);
            if (!zzI(obj, i10)) {
                if (zzL(object)) {
                    Object objZze = zzwhVarZzv.zze();
                    zzwhVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzD(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzL(object2)) {
                Object objZze2 = zzwhVarZzv.zze();
                zzwhVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            zzwhVarZzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (zzM(obj2, i11, i10)) {
            int iZzs = zzs(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzs;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzwh zzwhVarZzv = zzv(i10);
            if (!zzM(obj, i11, i10)) {
                if (zzL(object)) {
                    Object objZze = zzwhVarZzv.zze();
                    zzwhVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzE(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzL(object2)) {
                Object objZze2 = zzwhVarZzv.zze();
                zzwhVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            zzwhVarZzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i10) {
        int iZzp = zzp(i10);
        long j10 = 1048575 & iZzp;
        if (j10 == 1048575) {
            return;
        }
        zzxc.zzq(obj, j10, (1 << (iZzp >>> 20)) | zzxc.zzc(obj, j10));
    }

    private final void zzE(Object obj, int i10, int i11) {
        zzxc.zzq(obj, zzp(i11) & 1048575, i10);
    }

    private final void zzF(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzs(i10) & 1048575, obj2);
        zzD(obj, i10);
    }

    private final void zzG(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzs(i11) & 1048575, obj2);
        zzE(obj, i10, i11);
    }

    private final boolean zzH(Object obj, Object obj2, int i10) {
        return zzI(obj, i10) == zzI(obj2, i10);
    }

    private final boolean zzI(Object obj, int i10) {
        int iZzp = zzp(i10);
        long j10 = iZzp & 1048575;
        if (j10 != 1048575) {
            return (zzxc.zzc(obj, j10) & (1 << (iZzp >>> 20))) != 0;
        }
        int iZzs = zzs(i10);
        long j11 = iZzs & 1048575;
        switch (zzr(iZzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzxc.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzxc.zzb(obj, j11)) != 0;
            case 2:
                return zzxc.zzd(obj, j11) != 0;
            case 3:
                return zzxc.zzd(obj, j11) != 0;
            case 4:
                return zzxc.zzc(obj, j11) != 0;
            case 5:
                return zzxc.zzd(obj, j11) != 0;
            case 6:
                return zzxc.zzc(obj, j11) != 0;
            case 7:
                return zzxc.zzw(obj, j11);
            case 8:
                Object objZzf = zzxc.zzf(obj, j11);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zztu) {
                    return !zztu.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzxc.zzf(obj, j11) != null;
            case 10:
                return !zztu.zzb.equals(zzxc.zzf(obj, j11));
            case 11:
                return zzxc.zzc(obj, j11) != 0;
            case 12:
                return zzxc.zzc(obj, j11) != 0;
            case 13:
                return zzxc.zzc(obj, j11) != 0;
            case 14:
                return zzxc.zzd(obj, j11) != 0;
            case 15:
                return zzxc.zzc(obj, j11) != 0;
            case 16:
                return zzxc.zzd(obj, j11) != 0;
            case 17:
                return zzxc.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzI(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    private static boolean zzK(Object obj, int i10, zzwh zzwhVar) {
        return zzwhVar.zzk(zzxc.zzf(obj, i10 & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzuw) {
            return ((zzuw) obj).zzI();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i10, int i11) {
        return zzxc.zzc(obj, (long) (zzp(i11) & 1048575)) == i10;
    }

    private static boolean zzN(Object obj, long j10) {
        return ((Boolean) zzxc.zzf(obj, j10)).booleanValue();
    }

    private static final void zzO(int i10, Object obj, zzxi zzxiVar) throws IOException {
        if (obj instanceof String) {
            zzxiVar.zzG(i10, (String) obj);
        } else {
            zzxiVar.zzd(i10, (zztu) obj);
        }
    }

    public static zzww zzd(Object obj) {
        zzuw zzuwVar = (zzuw) obj;
        zzww zzwwVar = zzuwVar.zzc;
        if (zzwwVar != zzww.zzc()) {
            return zzwwVar;
        }
        zzww zzwwVarZzf = zzww.zzf();
        zzuwVar.zzc = zzwwVarZzf;
        return zzwwVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0266  */
    /* JADX WARN: Code duplicated, block: B:126:0x0269  */
    /* JADX WARN: Code duplicated, block: B:129:0x0280  */
    /* JADX WARN: Code duplicated, block: B:131:0x0284  */
    /* JADX WARN: Code duplicated, block: B:170:0x0349  */
    /* JADX WARN: Code duplicated, block: B:185:0x0395  */
    /* JADX WARN: Code duplicated, block: B:188:0x039d  */
    public static zzvz zzl(Class cls, zzvt zzvtVar, zzwc zzwcVar, zzvj zzvjVar, zzwv zzwvVar, zzui zzuiVar, zzvr zzvrVar) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int i11;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        int i15;
        int i16;
        char cCharAt;
        int i17;
        char cCharAt2;
        int i18;
        char cCharAt3;
        int i19;
        char cCharAt4;
        int i20;
        char cCharAt5;
        int i21;
        char cCharAt6;
        int i22;
        char cCharAt7;
        int i23;
        char cCharAt8;
        int i24;
        int i25;
        int i26;
        int i27;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i28;
        int i29;
        int i30;
        Field fieldZzz;
        int i31;
        char cCharAt9;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        Object obj;
        Field fieldZzz2;
        int i37;
        Object obj2;
        Field fieldZzz3;
        int i38;
        char cCharAt10;
        int i39;
        char cCharAt11;
        int i40;
        char cCharAt12;
        int i41;
        char cCharAt13;
        if (!(zzvtVar instanceof zzwg)) {
            throw null;
        }
        zzwg zzwgVar = (zzwg) zzvtVar;
        String strZzd = zzwgVar.zzd();
        int length = strZzd.length();
        char c10 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i42 = 1;
            while (true) {
                i10 = i42 + 1;
                if (strZzd.charAt(i42) < 55296) {
                    break;
                }
                i42 = i10;
            }
        } else {
            i10 = 1;
        }
        int i43 = i10 + 1;
        int iCharAt3 = strZzd.charAt(i10);
        if (iCharAt3 >= 55296) {
            int i44 = iCharAt3 & 8191;
            int i45 = 13;
            while (true) {
                i41 = i43 + 1;
                cCharAt13 = strZzd.charAt(i43);
                if (cCharAt13 < 55296) {
                    break;
                }
                i44 |= (cCharAt13 & 8191) << i45;
                i45 += 13;
                i43 = i41;
            }
            iCharAt3 = i44 | (cCharAt13 << i45);
            i43 = i41;
        }
        if (iCharAt3 == 0) {
            i13 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i11 = 0;
            i14 = 0;
            i12 = 0;
            iArr = zza;
            i15 = 0;
        } else {
            int i46 = i43 + 1;
            int iCharAt4 = strZzd.charAt(i43);
            if (iCharAt4 >= 55296) {
                int i47 = iCharAt4 & 8191;
                int i48 = 13;
                while (true) {
                    i23 = i46 + 1;
                    cCharAt8 = strZzd.charAt(i46);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt8 & 8191) << i48;
                    i48 += 13;
                    i46 = i23;
                }
                iCharAt4 = i47 | (cCharAt8 << i48);
                i46 = i23;
            }
            int i49 = i46 + 1;
            int iCharAt5 = strZzd.charAt(i46);
            if (iCharAt5 >= 55296) {
                int i50 = iCharAt5 & 8191;
                int i51 = 13;
                while (true) {
                    i22 = i49 + 1;
                    cCharAt7 = strZzd.charAt(i49);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt7 & 8191) << i51;
                    i51 += 13;
                    i49 = i22;
                }
                iCharAt5 = i50 | (cCharAt7 << i51);
                i49 = i22;
            }
            int i52 = i49 + 1;
            int iCharAt6 = strZzd.charAt(i49);
            if (iCharAt6 >= 55296) {
                int i53 = iCharAt6 & 8191;
                int i54 = 13;
                while (true) {
                    i21 = i52 + 1;
                    cCharAt6 = strZzd.charAt(i52);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt6 & 8191) << i54;
                    i54 += 13;
                    i52 = i21;
                }
                iCharAt6 = i53 | (cCharAt6 << i54);
                i52 = i21;
            }
            int i55 = i52 + 1;
            int iCharAt7 = strZzd.charAt(i52);
            if (iCharAt7 >= 55296) {
                int i56 = iCharAt7 & 8191;
                int i57 = 13;
                while (true) {
                    i20 = i55 + 1;
                    cCharAt5 = strZzd.charAt(i55);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt5 & 8191) << i57;
                    i57 += 13;
                    i55 = i20;
                }
                iCharAt7 = i56 | (cCharAt5 << i57);
                i55 = i20;
            }
            int i58 = i55 + 1;
            iCharAt = strZzd.charAt(i55);
            if (iCharAt >= 55296) {
                int i59 = iCharAt & 8191;
                int i60 = 13;
                while (true) {
                    i19 = i58 + 1;
                    cCharAt4 = strZzd.charAt(i58);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt4 & 8191) << i60;
                    i60 += 13;
                    i58 = i19;
                }
                iCharAt = i59 | (cCharAt4 << i60);
                i58 = i19;
            }
            int i61 = i58 + 1;
            iCharAt2 = strZzd.charAt(i58);
            if (iCharAt2 >= 55296) {
                int i62 = iCharAt2 & 8191;
                int i63 = 13;
                while (true) {
                    i18 = i61 + 1;
                    cCharAt3 = strZzd.charAt(i61);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i62 |= (cCharAt3 & 8191) << i63;
                    i63 += 13;
                    i61 = i18;
                }
                iCharAt2 = i62 | (cCharAt3 << i63);
                i61 = i18;
            }
            int i64 = i61 + 1;
            int iCharAt8 = strZzd.charAt(i61);
            if (iCharAt8 >= 55296) {
                int i65 = iCharAt8 & 8191;
                int i66 = 13;
                while (true) {
                    i17 = i64 + 1;
                    cCharAt2 = strZzd.charAt(i64);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i65 |= (cCharAt2 & 8191) << i66;
                    i66 += 13;
                    i64 = i17;
                }
                iCharAt8 = i65 | (cCharAt2 << i66);
                i64 = i17;
            }
            int i67 = i64 + 1;
            int iCharAt9 = strZzd.charAt(i64);
            if (iCharAt9 >= 55296) {
                int i68 = iCharAt9 & 8191;
                int i69 = 13;
                while (true) {
                    i16 = i67 + 1;
                    cCharAt = strZzd.charAt(i67);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i68 |= (cCharAt & 8191) << i69;
                    i69 += 13;
                    i67 = i16;
                }
                iCharAt9 = i68 | (cCharAt << i69);
                i67 = i16;
            }
            int i70 = iCharAt4 + iCharAt4 + iCharAt5;
            int[] iArr2 = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i11 = iCharAt6;
            i12 = iCharAt9;
            i13 = i70;
            iArr = iArr2;
            i14 = iCharAt7;
            i15 = iCharAt4;
            i43 = i67;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzwgVar.zze();
        Class<?> cls2 = zzwgVar.zza().getClass();
        int i71 = i12 + iCharAt2;
        int i72 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i72];
        int i73 = i12;
        int i74 = i71;
        int i75 = 0;
        int i76 = 0;
        while (i43 < length) {
            int i77 = i43 + 1;
            int iCharAt10 = strZzd.charAt(i43);
            if (iCharAt10 >= c10) {
                int i78 = iCharAt10 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i40 = i79 + 1;
                    cCharAt12 = strZzd.charAt(i79);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i78 |= (cCharAt12 & 8191) << i80;
                    i80 += 13;
                    i79 = i40;
                }
                iCharAt10 = i78 | (cCharAt12 << i80);
                i24 = i40;
            } else {
                i24 = i77;
            }
            int i81 = i24 + 1;
            int iCharAt11 = strZzd.charAt(i24);
            if (iCharAt11 >= c10) {
                int i82 = iCharAt11 & 8191;
                int i83 = i81;
                int i84 = 13;
                while (true) {
                    i39 = i83 + 1;
                    cCharAt11 = strZzd.charAt(i83);
                    if (cCharAt11 < c10) {
                        break;
                    }
                    i82 |= (cCharAt11 & 8191) << i84;
                    i84 += 13;
                    i83 = i39;
                }
                iCharAt11 = i82 | (cCharAt11 << i84);
                i25 = i39;
            } else {
                i25 = i81;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i75] = i76;
                i75++;
            }
            int i85 = iCharAt11 & 255;
            int i86 = length;
            int i87 = iCharAt11 & 2048;
            int i88 = i14;
            if (i85 >= 51) {
                int i89 = i25 + 1;
                int iCharAt12 = strZzd.charAt(i25);
                if (iCharAt12 >= 55296) {
                    int i90 = iCharAt12 & 8191;
                    int i91 = i89;
                    int i92 = 13;
                    while (true) {
                        i38 = i91 + 1;
                        cCharAt10 = strZzd.charAt(i91);
                        i26 = i11;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i90 |= (cCharAt10 & 8191) << i92;
                        i92 += 13;
                        i91 = i38;
                        i11 = i26;
                    }
                    iCharAt12 = i90 | (cCharAt10 << i92);
                    i34 = i38;
                } else {
                    i26 = i11;
                    i34 = i89;
                }
                int i93 = i85 - 51;
                int i94 = i34;
                if (i93 == 9 || i93 == 17) {
                    i35 = i13 + 1;
                    int i95 = i76 / 3;
                    objArr[i95 + i95 + 1] = objArrZze[i13];
                } else {
                    if (i93 == 12) {
                        if (zzwgVar.zzc() == 1 || i87 != 0) {
                            i35 = i13 + 1;
                            int i96 = i76 / 3;
                            objArr[i96 + i96 + 1] = objArrZze[i13];
                        } else {
                            i87 = 0;
                        }
                    }
                    i36 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i36];
                    if (obj instanceof Field) {
                        fieldZzz2 = (Field) obj;
                    } else {
                        fieldZzz2 = zzz(cls2, (String) obj);
                        objArrZze[i36] = fieldZzz2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzz2);
                    i37 = i36 + 1;
                    obj2 = objArrZze[i37];
                    int i97 = i87;
                    if (obj2 instanceof Field) {
                        fieldZzz3 = (Field) obj2;
                    } else {
                        fieldZzz3 = zzz(cls2, (String) obj2);
                        objArrZze[i37] = fieldZzz3;
                    }
                    i27 = i13;
                    i28 = i94;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzz3);
                    i29 = 0;
                    strZzd = strZzd;
                    zzwgVar = zzwgVar;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i30 = i97;
                }
                i13 = i35;
                i36 = iCharAt12 + iCharAt12;
                obj = objArrZze[i36];
                if (obj instanceof Field) {
                    fieldZzz2 = (Field) obj;
                } else {
                    fieldZzz2 = zzz(cls2, (String) obj);
                    objArrZze[i36] = fieldZzz2;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzz2);
                i37 = i36 + 1;
                obj2 = objArrZze[i37];
                int i98 = i87;
                if (obj2 instanceof Field) {
                    fieldZzz3 = (Field) obj2;
                } else {
                    fieldZzz3 = zzz(cls2, (String) obj2);
                    objArrZze[i37] = fieldZzz3;
                }
                i27 = i13;
                i28 = i94;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzz3);
                i29 = 0;
                strZzd = strZzd;
                zzwgVar = zzwgVar;
                iObjectFieldOffset = iObjectFieldOffset4;
                i30 = i98;
            } else {
                i26 = i11;
                i27 = i13 + 1;
                Field fieldZzz4 = zzz(cls2, (String) objArrZze[i13]);
                if (i85 == 9 || i85 == 17) {
                    int i99 = i76 / 3;
                    objArr[i99 + i99 + 1] = fieldZzz4.getType();
                } else {
                    if (i85 != 27) {
                        if (i85 == 49) {
                            i33 = i13 + 2;
                            i32 = 1;
                        } else if (i85 == 12 || i85 == 30 || i85 == 44) {
                            zzwgVar = zzwgVar;
                            if (zzwgVar.zzc() == 1 || i87 != 0) {
                                i33 = i13 + 2;
                                int i100 = i76 / 3;
                                objArr[i100 + i100 + 1] = objArrZze[i27];
                                i27 = i33;
                            } else {
                                i87 = 0;
                            }
                        } else if (i85 == 50) {
                            int i101 = i13 + 2;
                            int i102 = i73 + 1;
                            iArr[i73] = i76;
                            int i103 = i76 / 3;
                            int i104 = i103 + i103;
                            objArr[i104] = objArrZze[i27];
                            if (i87 != 0) {
                                i27 = i13 + 3;
                                objArr[i104 + 1] = objArrZze[i101];
                                i73 = i102;
                                zzwgVar = zzwgVar;
                            } else {
                                i27 = i101;
                                i73 = i102;
                                i87 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt11 & 4096) != 0 || i85 > 17) {
                            i28 = i25;
                            i29 = 0;
                        } else {
                            int i105 = i25 + 1;
                            int iCharAt13 = strZzd.charAt(i25);
                            if (iCharAt13 >= 55296) {
                                int i106 = iCharAt13 & 8191;
                                int i107 = 13;
                                while (true) {
                                    i31 = i105 + 1;
                                    cCharAt9 = strZzd.charAt(i105);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i106 |= (cCharAt9 & 8191) << i107;
                                    i107 += 13;
                                    i105 = i31;
                                }
                                iCharAt13 = i106 | (cCharAt9 << i107);
                                i105 = i31;
                            }
                            int i108 = (iCharAt13 / 32) + i15 + i15;
                            Object obj3 = objArrZze[i108];
                            if (obj3 instanceof Field) {
                                fieldZzz = (Field) obj3;
                            } else {
                                fieldZzz = zzz(cls2, (String) obj3);
                                objArrZze[i108] = fieldZzz;
                            }
                            i28 = i105;
                            i29 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzz);
                        }
                        if (i85 >= 18 && i85 <= 49) {
                            iArr[i74] = iObjectFieldOffset;
                            i74++;
                        }
                        i30 = i87;
                    } else {
                        i32 = 1;
                        i33 = i13 + 2;
                    }
                    int i109 = i76 / 3;
                    objArr[i109 + i109 + i32] = objArrZze[i27];
                    i27 = i33;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt11 & 4096) != 0) {
                        i28 = i25;
                        i29 = 0;
                    } else {
                        i28 = i25;
                        i29 = 0;
                    }
                    if (i85 >= 18) {
                        iArr[i74] = iObjectFieldOffset;
                        i74++;
                    }
                    i30 = i87;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt11 & 4096) != 0) {
                    i28 = i25;
                    i29 = 0;
                } else {
                    i28 = i25;
                    i29 = 0;
                }
                if (i85 >= 18) {
                    iArr[i74] = iObjectFieldOffset;
                    i74++;
                }
                i30 = i87;
            }
            int i110 = i76 + 1;
            iArr3[i76] = iCharAt10;
            int i111 = i76 + 2;
            Class<?> cls3 = cls2;
            iArr3[i110] = iObjectFieldOffset | (i30 != 0 ? Integer.MIN_VALUE : 0) | ((iCharAt11 & 512) != 0 ? PKIFailureInfo.duplicateCertReq : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i85 << 20);
            i76 += 3;
            iArr3[i111] = (i29 << 20) | iObjectFieldOffset2;
            strZzd = strZzd;
            i13 = i27;
            i43 = i28;
            length = i86;
            i14 = i88;
            cls2 = cls3;
            zzwgVar = zzwgVar;
            i11 = i26;
            c10 = 55296;
        }
        return new zzvz(iArr3, objArr, i11, i14, zzwgVar.zza(), false, iArr, i12, i71, zzwcVar, zzvjVar, zzwvVar, zzuiVar, zzvrVar);
    }

    private static double zzm(Object obj, long j10) {
        return ((Double) zzxc.zzf(obj, j10)).doubleValue();
    }

    private static float zzn(Object obj, long j10) {
        return ((Float) zzxc.zzf(obj, j10)).floatValue();
    }

    private static int zzo(Object obj, long j10) {
        return ((Integer) zzxc.zzf(obj, j10)).intValue();
    }

    private final int zzp(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzq(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int zzr(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzs(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzt(Object obj, long j10) {
        return ((Long) zzxc.zzf(obj, j10)).longValue();
    }

    private final zzva zzu(int i10) {
        int i11 = i10 / 3;
        return (zzva) this.zzd[i11 + i11 + 1];
    }

    private final zzwh zzv(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzwh zzwhVar = (zzwh) objArr[i12];
        if (zzwhVar != null) {
            return zzwhVar;
        }
        zzwh zzwhVarZzb = zzwe.zza().zzb((Class) objArr[i12 + 1]);
        this.zzd[i12] = zzwhVarZzb;
        return zzwhVarZzb;
    }

    private final Object zzw(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final Object zzx(Object obj, int i10) {
        zzwh zzwhVarZzv = zzv(i10);
        int iZzs = zzs(i10) & 1048575;
        if (!zzI(obj, i10)) {
            return zzwhVarZzv.zze();
        }
        Object object = zzb.getObject(obj, iZzs);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzwhVarZzv.zze();
        if (object != null) {
            zzwhVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzy(Object obj, int i10, int i11) {
        zzwh zzwhVarZzv = zzv(i11);
        if (!zzM(obj, i10, i11)) {
            return zzwhVarZzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i11) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzwhVarZzv.zze();
        if (object != null) {
            zzwhVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbC = a.c("Field ", str, " for ", name, " not found. Known fields are ");
            sbC.append(string);
            throw new RuntimeException(sbC.toString());
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 21961. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    public final int zza(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 2196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face_bundled.zzvz.zza(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    public final int zzb(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int i11;
        int iFloatToIntBits;
        int iZzc;
        int i12;
        int i13 = 0;
        for (int i14 = 0; i14 < this.zzc.length; i14 += 3) {
            int iZzs = zzs(i14);
            int[] iArr = this.zzc;
            int i15 = 1048575 & iZzs;
            int iZzr = zzr(iZzs);
            int i16 = iArr[i14];
            long j10 = i15;
            int iHashCode = 37;
            switch (iZzr) {
                case 0:
                    i10 = i13 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzxc.zza(obj, j10));
                    byte[] bArr = zzvc.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 1:
                    i11 = i13 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzxc.zzb(obj, j10));
                    i13 = iFloatToIntBits + i11;
                    break;
                case 2:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzxc.zzd(obj, j10);
                    byte[] bArr2 = zzvc.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 3:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzxc.zzd(obj, j10);
                    byte[] bArr3 = zzvc.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 4:
                    i10 = i13 * 53;
                    iZzc = zzxc.zzc(obj, j10);
                    i13 = i10 + iZzc;
                    break;
                case 5:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzxc.zzd(obj, j10);
                    byte[] bArr4 = zzvc.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 6:
                    i10 = i13 * 53;
                    iZzc = zzxc.zzc(obj, j10);
                    i13 = i10 + iZzc;
                    break;
                case 7:
                    i11 = i13 * 53;
                    iFloatToIntBits = zzvc.zza(zzxc.zzw(obj, j10));
                    i13 = iFloatToIntBits + i11;
                    break;
                case 8:
                    i11 = i13 * 53;
                    iFloatToIntBits = ((String) zzxc.zzf(obj, j10)).hashCode();
                    i13 = iFloatToIntBits + i11;
                    break;
                case 9:
                    i12 = i13 * 53;
                    Object objZzf = zzxc.zzf(obj, j10);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i13 = i12 + iHashCode;
                    break;
                case 10:
                    i11 = i13 * 53;
                    iFloatToIntBits = zzxc.zzf(obj, j10).hashCode();
                    i13 = iFloatToIntBits + i11;
                    break;
                case 11:
                    i10 = i13 * 53;
                    iZzc = zzxc.zzc(obj, j10);
                    i13 = i10 + iZzc;
                    break;
                case 12:
                    i10 = i13 * 53;
                    iZzc = zzxc.zzc(obj, j10);
                    i13 = i10 + iZzc;
                    break;
                case 13:
                    i10 = i13 * 53;
                    iZzc = zzxc.zzc(obj, j10);
                    i13 = i10 + iZzc;
                    break;
                case 14:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzxc.zzd(obj, j10);
                    byte[] bArr5 = zzvc.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 15:
                    i10 = i13 * 53;
                    iZzc = zzxc.zzc(obj, j10);
                    i13 = i10 + iZzc;
                    break;
                case 16:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzxc.zzd(obj, j10);
                    byte[] bArr6 = zzvc.zzb;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iZzc;
                    break;
                case 17:
                    i12 = i13 * 53;
                    Object objZzf2 = zzxc.zzf(obj, j10);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i13 = i12 + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i11 = i13 * 53;
                    iFloatToIntBits = zzxc.zzf(obj, j10).hashCode();
                    i13 = iFloatToIntBits + i11;
                    break;
                case 50:
                    i11 = i13 * 53;
                    iFloatToIntBits = zzxc.zzf(obj, j10).hashCode();
                    i13 = iFloatToIntBits + i11;
                    break;
                case 51:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzm(obj, j10));
                        byte[] bArr7 = zzvc.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                    }
                    break;
                case 52:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzn(obj, j10));
                        i13 = iFloatToIntBits + i11;
                    }
                    break;
                case 53:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzt(obj, j10);
                        byte[] bArr8 = zzvc.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                    }
                    break;
                case 54:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzt(obj, j10);
                        byte[] bArr9 = zzvc.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                    }
                    break;
                case 55:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzo(obj, j10);
                        i13 = i10 + iZzc;
                    }
                    break;
                case 56:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzt(obj, j10);
                        byte[] bArr10 = zzvc.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                    }
                    break;
                case 57:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzo(obj, j10);
                        i13 = i10 + iZzc;
                    }
                    break;
                case 58:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzvc.zza(zzN(obj, j10));
                        i13 = iFloatToIntBits + i11;
                    }
                    break;
                case 59:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = ((String) zzxc.zzf(obj, j10)).hashCode();
                        i13 = iFloatToIntBits + i11;
                    }
                    break;
                case 60:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzxc.zzf(obj, j10).hashCode();
                        i13 = iFloatToIntBits + i11;
                    }
                    break;
                case 61:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzxc.zzf(obj, j10).hashCode();
                        i13 = iFloatToIntBits + i11;
                    }
                    break;
                case 62:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzo(obj, j10);
                        i13 = i10 + iZzc;
                    }
                    break;
                case 63:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzo(obj, j10);
                        i13 = i10 + iZzc;
                    }
                    break;
                case 64:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzo(obj, j10);
                        i13 = i10 + iZzc;
                    }
                    break;
                case 65:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzt(obj, j10);
                        byte[] bArr11 = zzvc.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                    }
                    break;
                case 66:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        iZzc = zzo(obj, j10);
                        i13 = i10 + iZzc;
                    }
                    break;
                case 67:
                    if (zzM(obj, i16, i14)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzt(obj, j10);
                        byte[] bArr12 = zzvc.zzb;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iZzc;
                    }
                    break;
                case 68:
                    if (zzM(obj, i16, i14)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = zzxc.zzf(obj, j10).hashCode();
                        i13 = iFloatToIntBits + i11;
                    }
                    break;
            }
        }
        int iHashCode2 = ((zzuw) obj).zzc.hashCode() + (i13 * 53);
        return this.zzh ? (iHashCode2 * 53) + ((zzus) obj).zzb.zza.hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:105:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:109:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:114:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:123:0x0338  */
    /* JADX WARN: Code duplicated, block: B:130:0x0371  */
    /* JADX WARN: Code duplicated, block: B:131:0x0373  */
    /* JADX WARN: Code duplicated, block: B:158:0x0480  */
    /* JADX WARN: Code duplicated, block: B:161:0x0489  */
    /* JADX WARN: Code duplicated, block: B:167:0x04de  */
    /* JADX WARN: Code duplicated, block: B:169:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:172:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:175:0x050b  */
    /* JADX WARN: Code duplicated, block: B:178:0x0513  */
    /* JADX WARN: Code duplicated, block: B:180:0x0516  */
    /* JADX WARN: Code duplicated, block: B:182:0x0535  */
    /* JADX WARN: Code duplicated, block: B:184:0x053f A[LOOP:1: B:181:0x0533->B:184:0x053f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:189:0x0564  */
    /* JADX WARN: Code duplicated, block: B:192:0x0572  */
    /* JADX WARN: Code duplicated, block: B:194:0x0579  */
    /* JADX WARN: Code duplicated, block: B:196:0x0586 A[LOOP:3: B:195:0x0584->B:196:0x0586, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:202:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:204:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:206:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:208:0x05bd A[LOOP:4: B:205:0x05b3->B:208:0x05bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:210:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:212:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:214:0x05e2 A[LOOP:5: B:213:0x05e0->B:214:0x05e2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:219:0x05f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:220:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:222:0x060c  */
    /* JADX WARN: Code duplicated, block: B:224:0x0614 A[LOOP:6: B:221:0x060a->B:224:0x0614, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:225:0x0622  */
    /* JADX WARN: Code duplicated, block: B:227:0x062b  */
    /* JADX WARN: Code duplicated, block: B:228:0x0630 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:229:0x0632  */
    /* JADX WARN: Code duplicated, block: B:232:0x0649  */
    /* JADX WARN: Code duplicated, block: B:234:0x064d  */
    /* JADX WARN: Code duplicated, block: B:236:0x0658  */
    /* JADX WARN: Code duplicated, block: B:238:0x066a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:239:0x066c  */
    /* JADX WARN: Code duplicated, block: B:241:0x0678  */
    /* JADX WARN: Code duplicated, block: B:245:0x068d  */
    /* JADX WARN: Code duplicated, block: B:246:0x0695  */
    /* JADX WARN: Code duplicated, block: B:249:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:252:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:255:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:256:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:258:0x06db  */
    /* JADX WARN: Code duplicated, block: B:260:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:262:0x06e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:263:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:264:0x06ef  */
    /* JADX WARN: Code duplicated, block: B:267:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:269:0x0701  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:271:0x0709  */
    /* JADX WARN: Code duplicated, block: B:273:0x070d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:285:0x073c  */
    /* JADX WARN: Code duplicated, block: B:286:0x0745  */
    /* JADX WARN: Code duplicated, block: B:288:0x0750  */
    /* JADX WARN: Code duplicated, block: B:290:0x0775  */
    /* JADX WARN: Code duplicated, block: B:291:0x077d  */
    /* JADX WARN: Code duplicated, block: B:293:0x0792  */
    /* JADX WARN: Code duplicated, block: B:295:0x079b  */
    /* JADX WARN: Code duplicated, block: B:297:0x07a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:298:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:299:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:302:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:304:0x07c2  */
    /* JADX WARN: Code duplicated, block: B:306:0x07ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:314:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:316:0x07f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:317:0x07f7  */
    /* JADX WARN: Code duplicated, block: B:318:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:320:0x0805  */
    /* JADX WARN: Code duplicated, block: B:323:0x0817  */
    /* JADX WARN: Code duplicated, block: B:325:0x081f  */
    /* JADX WARN: Code duplicated, block: B:327:0x0827 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:331:0x0835  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:343:0x0861  */
    /* JADX WARN: Code duplicated, block: B:344:0x0866  */
    /* JADX WARN: Code duplicated, block: B:346:0x0877  */
    /* JADX WARN: Code duplicated, block: B:348:0x0883  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:350:0x088d  */
    /* JADX WARN: Code duplicated, block: B:351:0x088f  */
    /* JADX WARN: Code duplicated, block: B:357:0x08a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:358:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:360:0x08b0  */
    /* JADX WARN: Code duplicated, block: B:361:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:364:0x08b9  */
    /* JADX WARN: Code duplicated, block: B:366:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:368:0x08cb  */
    /* JADX WARN: Code duplicated, block: B:369:0x08cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:371:0x08d3 A[PHI: r3 r4 r7 r12 r13 r15
      0x08d3: PHI (r3v73 int) = (r3v68 int), (r3v70 int), (r3v72 int), (r3v75 int) binds: [B:408:0x099c, B:399:0x0963, B:382:0x090a, B:357:0x08a1] A[DONT_GENERATE, DONT_INLINE]
      0x08d3: PHI (r4v50 int) = (r4v45 int), (r4v47 int), (r4v49 int), (r4v52 int) binds: [B:408:0x099c, B:399:0x0963, B:382:0x090a, B:357:0x08a1] A[DONT_GENERATE, DONT_INLINE]
      0x08d3: PHI (r7v21 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj) = 
      (r7v17 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
      (r7v18 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
      (r7v20 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
      (r7v23 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
     binds: [B:408:0x099c, B:399:0x0963, B:382:0x090a, B:357:0x08a1] A[DONT_GENERATE, DONT_INLINE]
      0x08d3: PHI (r12v100 int) = (r12v96 int), (r12v97 int), (r12v99 int), (r12v102 int) binds: [B:408:0x099c, B:399:0x0963, B:382:0x090a, B:357:0x08a1] A[DONT_GENERATE, DONT_INLINE]
      0x08d3: PHI (r13v82 sun.misc.Unsafe) = (r13v78 sun.misc.Unsafe), (r13v79 sun.misc.Unsafe), (r13v81 sun.misc.Unsafe), (r13v84 sun.misc.Unsafe) binds: [B:408:0x099c, B:399:0x0963, B:382:0x090a, B:357:0x08a1] A[DONT_GENERATE, DONT_INLINE]
      0x08d3: PHI (r15v91 int) = (r15v87 int), (r15v88 int), (r15v90 int), (r15v93 int) binds: [B:408:0x099c, B:399:0x0963, B:382:0x090a, B:357:0x08a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:372:0x08d9  */
    /* JADX WARN: Code duplicated, block: B:374:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:376:0x08f6 A[LOOP:14: B:375:0x08f4->B:376:0x08f6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:381:0x0909  */
    /* JADX WARN: Code duplicated, block: B:383:0x090c  */
    /* JADX WARN: Code duplicated, block: B:385:0x091a  */
    /* JADX WARN: Code duplicated, block: B:387:0x0922 A[LOOP:15: B:384:0x0918->B:387:0x0922, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:389:0x0931  */
    /* JADX WARN: Code duplicated, block: B:391:0x0942  */
    /* JADX WARN: Code duplicated, block: B:393:0x094e A[LOOP:16: B:392:0x094c->B:393:0x094e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:398:0x0962  */
    /* JADX WARN: Code duplicated, block: B:400:0x0965  */
    /* JADX WARN: Code duplicated, block: B:402:0x0973  */
    /* JADX WARN: Code duplicated, block: B:404:0x097b A[LOOP:17: B:401:0x0971->B:404:0x097b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:405:0x0985  */
    /* JADX WARN: Code duplicated, block: B:407:0x0996  */
    /* JADX WARN: Code duplicated, block: B:408:0x099c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:409:0x099e  */
    /* JADX WARN: Code duplicated, block: B:410:0x09b1  */
    /* JADX WARN: Code duplicated, block: B:412:0x09c4  */
    /* JADX WARN: Code duplicated, block: B:414:0x09d0 A[LOOP:18: B:413:0x09ce->B:414:0x09d0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:419:0x09e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:420:0x09e7  */
    /* JADX WARN: Code duplicated, block: B:422:0x09f5  */
    /* JADX WARN: Code duplicated, block: B:424:0x09fd A[LOOP:19: B:421:0x09f3->B:424:0x09fd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:426:0x0a0a  */
    /* JADX WARN: Code duplicated, block: B:428:0x0a1d  */
    /* JADX WARN: Code duplicated, block: B:430:0x0a29 A[LOOP:20: B:429:0x0a27->B:430:0x0a29, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:435:0x0a40  */
    /* JADX WARN: Code duplicated, block: B:437:0x0a43  */
    /* JADX WARN: Code duplicated, block: B:439:0x0a55  */
    /* JADX WARN: Code duplicated, block: B:441:0x0a5d A[LOOP:21: B:438:0x0a53->B:441:0x0a5d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:442:0x0a6b  */
    /* JADX WARN: Code duplicated, block: B:444:0x0a7e  */
    /* JADX WARN: Code duplicated, block: B:446:0x0a8a A[LOOP:22: B:445:0x0a88->B:446:0x0a8a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:451:0x0aa2  */
    /* JADX WARN: Code duplicated, block: B:453:0x0aa5  */
    /* JADX WARN: Code duplicated, block: B:455:0x0ab7  */
    /* JADX WARN: Code duplicated, block: B:457:0x0abf A[LOOP:23: B:454:0x0ab5->B:457:0x0abf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:458:0x0acd A[PHI: r0 r7 r8 r9 r10 r12 r13 r15
      0x0acd: PHI (r0v27 com.google.android.gms.internal.mlkit_vision_face_bundled.zzvz<T>) = 
      (r0v1 com.google.android.gms.internal.mlkit_vision_face_bundled.zzvz<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_face_bundled.zzvz<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_face_bundled.zzvz<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_face_bundled.zzvz<T>)
      (r0v1 com.google.android.gms.internal.mlkit_vision_face_bundled.zzvz<T>)
      (r0v11 com.google.android.gms.internal.mlkit_vision_face_bundled.zzvz<T>)
      (r0v28 com.google.android.gms.internal.mlkit_vision_face_bundled.zzvz<T>)
     binds: [B:452:0x0aa3, B:436:0x0a41, B:419:0x09e5, B:371:0x08d3, B:343:0x0861, B:285:0x073c, B:191:0x056e] A[DONT_GENERATE, DONT_INLINE]
      0x0acd: PHI (r7v35 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj) = 
      (r7v13 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
      (r7v14 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
      (r7v16 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
      (r7v21 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
      (r7v27 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
      (r7v31 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
      (r7v36 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
     binds: [B:452:0x0aa3, B:436:0x0a41, B:419:0x09e5, B:371:0x08d3, B:343:0x0861, B:285:0x073c, B:191:0x056e] A[DONT_GENERATE, DONT_INLINE]
      0x0acd: PHI (r8v119 int) = (r8v80 int), (r8v81 int), (r8v83 int), (r8v94 int), (r8v101 int), (r8v111 int), (r8v120 int) binds: [B:452:0x0aa3, B:436:0x0a41, B:419:0x09e5, B:371:0x08d3, B:343:0x0861, B:285:0x073c, B:191:0x056e] A[DONT_GENERATE, DONT_INLINE]
      0x0acd: PHI (r9v88 int) = (r9v56 int), (r9v57 int), (r9v59 int), (r9v62 int), (r9v66 int), (r9v79 int), (r9v89 int) binds: [B:452:0x0aa3, B:436:0x0a41, B:419:0x09e5, B:371:0x08d3, B:343:0x0861, B:285:0x073c, B:191:0x056e] A[DONT_GENERATE, DONT_INLINE]
      0x0acd: PHI (r10v104 int) = (r10v73 int), (r10v74 int), (r10v76 int), (r10v79 int), (r10v84 int), (r10v96 int), (r10v105 int) binds: [B:452:0x0aa3, B:436:0x0a41, B:419:0x09e5, B:371:0x08d3, B:343:0x0861, B:285:0x073c, B:191:0x056e] A[DONT_GENERATE, DONT_INLINE]
      0x0acd: PHI (r12v119 int) = (r12v92 int), (r12v93 int), (r12v95 int), (r12v100 int), (r12v106 int), (r12v111 int), (r12v120 int) binds: [B:452:0x0aa3, B:436:0x0a41, B:419:0x09e5, B:371:0x08d3, B:343:0x0861, B:285:0x073c, B:191:0x056e] A[DONT_GENERATE, DONT_INLINE]
      0x0acd: PHI (r13v94 sun.misc.Unsafe) = 
      (r13v74 sun.misc.Unsafe)
      (r13v75 sun.misc.Unsafe)
      (r13v77 sun.misc.Unsafe)
      (r13v82 sun.misc.Unsafe)
      (r13v88 sun.misc.Unsafe)
      (r13v92 sun.misc.Unsafe)
      (r13v95 sun.misc.Unsafe)
     binds: [B:452:0x0aa3, B:436:0x0a41, B:419:0x09e5, B:371:0x08d3, B:343:0x0861, B:285:0x073c, B:191:0x056e] A[DONT_GENERATE, DONT_INLINE]
      0x0acd: PHI (r15v108 int) = (r15v83 int), (r15v84 int), (r15v86 int), (r15v91 int), (r15v97 int), (r15v100 int), (r15v109 int) binds: [B:452:0x0aa3, B:436:0x0a41, B:419:0x09e5, B:371:0x08d3, B:343:0x0861, B:285:0x073c, B:191:0x056e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:463:0x0af4  */
    /* JADX WARN: Code duplicated, block: B:469:0x0b1a  */
    /* JADX WARN: Code duplicated, block: B:472:0x0b2b  */
    /* JADX WARN: Code duplicated, block: B:475:0x0b3d  */
    /* JADX WARN: Code duplicated, block: B:477:0x0b58  */
    /* JADX WARN: Code duplicated, block: B:478:0x0b66  */
    /* JADX WARN: Code duplicated, block: B:480:0x0b6b  */
    /* JADX WARN: Code duplicated, block: B:482:0x0b97  */
    /* JADX WARN: Code duplicated, block: B:483:0x0ba5  */
    /* JADX WARN: Code duplicated, block: B:485:0x0bb6  */
    /* JADX WARN: Code duplicated, block: B:486:0x0bd2 A[PHI: r11 r12 r15 r27 r34
      0x0bd2: PHI (r11v71 int) = (r11v68 int), (r11v69 int), (r11v72 int) binds: [B:492:0x0c0d, B:490:0x0bfb, B:484:0x0bb4] A[DONT_GENERATE, DONT_INLINE]
      0x0bd2: PHI (r12v80 int) = (r12v78 int), (r12v79 int), (r12v81 int) binds: [B:492:0x0c0d, B:490:0x0bfb, B:484:0x0bb4] A[DONT_GENERATE, DONT_INLINE]
      0x0bd2: PHI (r15v74 int) = (r15v72 int), (r15v73 int), (r15v75 int) binds: [B:492:0x0c0d, B:490:0x0bfb, B:484:0x0bb4] A[DONT_GENERATE, DONT_INLINE]
      0x0bd2: PHI (r27v21 int) = (r27v19 int), (r27v20 int), (r27v22 int) binds: [B:492:0x0c0d, B:490:0x0bfb, B:484:0x0bb4] A[DONT_GENERATE, DONT_INLINE]
      0x0bd2: PHI (r34v25 sun.misc.Unsafe) = (r34v23 sun.misc.Unsafe), (r34v24 sun.misc.Unsafe), (r34v26 sun.misc.Unsafe) binds: [B:492:0x0c0d, B:490:0x0bfb, B:484:0x0bb4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:487:0x0bd5  */
    /* JADX WARN: Code duplicated, block: B:489:0x0be3  */
    /* JADX WARN: Code duplicated, block: B:490:0x0bfb  */
    /* JADX WARN: Code duplicated, block: B:491:0x0bfe  */
    /* JADX WARN: Code duplicated, block: B:493:0x0c0f  */
    /* JADX WARN: Code duplicated, block: B:497:0x0c21  */
    /* JADX WARN: Code duplicated, block: B:502:0x0c43  */
    /* JADX WARN: Code duplicated, block: B:504:0x0c51  */
    /* JADX WARN: Code duplicated, block: B:507:0x0c63  */
    /* JADX WARN: Code duplicated, block: B:509:0x0c71  */
    /* JADX WARN: Code duplicated, block: B:510:0x0c8e  */
    /* JADX WARN: Code duplicated, block: B:512:0x0c9b  */
    /* JADX WARN: Code duplicated, block: B:514:0x0ca3  */
    /* JADX WARN: Code duplicated, block: B:515:0x0ca9  */
    /* JADX WARN: Code duplicated, block: B:525:0x0cd4  */
    /* JADX WARN: Code duplicated, block: B:527:0x0ce4  */
    /* JADX WARN: Code duplicated, block: B:529:0x0cf0  */
    /* JADX WARN: Code duplicated, block: B:530:0x0cf3  */
    /* JADX WARN: Code duplicated, block: B:533:0x0d03  */
    /* JADX WARN: Code duplicated, block: B:535:0x0d14  */
    /* JADX WARN: Code duplicated, block: B:536:0x0d26  */
    /* JADX WARN: Code duplicated, block: B:538:0x0d37  */
    /* JADX WARN: Code duplicated, block: B:539:0x0d49  */
    /* JADX WARN: Code duplicated, block: B:541:0x0d59  */
    /* JADX WARN: Code duplicated, block: B:542:0x0d6b  */
    /* JADX WARN: Code duplicated, block: B:544:0x0d7b  */
    /* JADX WARN: Code duplicated, block: B:545:0x0d8f  */
    /* JADX WARN: Code duplicated, block: B:547:0x0da0  */
    /* JADX WARN: Code duplicated, block: B:548:0x0db5  */
    /* JADX WARN: Code duplicated, block: B:550:0x0dc6  */
    /* JADX WARN: Code duplicated, block: B:551:0x0ddb A[PHI: r11 r12 r13 r15 r27 r34
      0x0ddb: PHI (r11v80 int) = 
      (r11v52 int)
      (r11v53 int)
      (r11v54 int)
      (r11v55 int)
      (r11v56 int)
      (r11v57 int)
      (r11v59 int)
      (r11v63 int)
      (r11v71 int)
      (r11v75 int)
      (r11v81 int)
     binds: [B:549:0x0dc4, B:546:0x0d9e, B:543:0x0d79, B:540:0x0d57, B:537:0x0d35, B:534:0x0d12, B:526:0x0ce2, B:506:0x0c5f, B:486:0x0bd2, B:482:0x0b97, B:477:0x0b58] A[DONT_GENERATE, DONT_INLINE]
      0x0ddb: PHI (r12v88 int) = 
      (r12v62 int)
      (r12v63 int)
      (r12v64 int)
      (r12v65 int)
      (r12v66 int)
      (r12v67 int)
      (r12v69 int)
      (r12v73 int)
      (r12v80 int)
      (r12v83 int)
      (r12v89 int)
     binds: [B:549:0x0dc4, B:546:0x0d9e, B:543:0x0d79, B:540:0x0d57, B:537:0x0d35, B:534:0x0d12, B:526:0x0ce2, B:506:0x0c5f, B:486:0x0bd2, B:482:0x0b97, B:477:0x0b58] A[DONT_GENERATE, DONT_INLINE]
      0x0ddb: PHI (r13v71 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj) = 
      (r13v44 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
      (r13v45 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
      (r13v46 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
      (r13v47 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
      (r13v48 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
      (r13v49 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
      (r13v51 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
      (r13v56 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
      (r13v63 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
      (r13v67 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
      (r13v72 com.google.android.gms.internal.mlkit_vision_face_bundled.zztj)
     binds: [B:549:0x0dc4, B:546:0x0d9e, B:543:0x0d79, B:540:0x0d57, B:537:0x0d35, B:534:0x0d12, B:526:0x0ce2, B:506:0x0c5f, B:486:0x0bd2, B:482:0x0b97, B:477:0x0b58] A[DONT_GENERATE, DONT_INLINE]
      0x0ddb: PHI (r15v80 int) = 
      (r15v56 int)
      (r15v57 int)
      (r15v58 int)
      (r15v59 int)
      (r15v60 int)
      (r15v61 int)
      (r15v63 int)
      (r15v67 int)
      (r15v74 int)
      (r15v77 int)
      (r15v81 int)
     binds: [B:549:0x0dc4, B:546:0x0d9e, B:543:0x0d79, B:540:0x0d57, B:537:0x0d35, B:534:0x0d12, B:526:0x0ce2, B:506:0x0c5f, B:486:0x0bd2, B:482:0x0b97, B:477:0x0b58] A[DONT_GENERATE, DONT_INLINE]
      0x0ddb: PHI (r27v27 int) = 
      (r27v5 int)
      (r27v6 int)
      (r27v7 int)
      (r27v8 int)
      (r27v9 int)
      (r27v10 int)
      (r27v12 int)
      (r27v17 int)
      (r27v21 int)
      (r27v24 int)
      (r27v28 int)
     binds: [B:549:0x0dc4, B:546:0x0d9e, B:543:0x0d79, B:540:0x0d57, B:537:0x0d35, B:534:0x0d12, B:526:0x0ce2, B:506:0x0c5f, B:486:0x0bd2, B:482:0x0b97, B:477:0x0b58] A[DONT_GENERATE, DONT_INLINE]
      0x0ddb: PHI (r34v31 sun.misc.Unsafe) = 
      (r34v7 sun.misc.Unsafe)
      (r34v8 sun.misc.Unsafe)
      (r34v9 sun.misc.Unsafe)
      (r34v10 sun.misc.Unsafe)
      (r34v11 sun.misc.Unsafe)
      (r34v12 sun.misc.Unsafe)
      (r34v14 sun.misc.Unsafe)
      (r34v18 sun.misc.Unsafe)
      (r34v25 sun.misc.Unsafe)
      (r34v28 sun.misc.Unsafe)
      (r34v32 sun.misc.Unsafe)
     binds: [B:549:0x0dc4, B:546:0x0d9e, B:543:0x0d79, B:540:0x0d57, B:537:0x0d35, B:534:0x0d12, B:526:0x0ce2, B:506:0x0c5f, B:486:0x0bd2, B:482:0x0b97, B:477:0x0b58] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:560:0x0e0f  */
    /* JADX WARN: Code duplicated, block: B:562:0x0e19  */
    /* JADX WARN: Code duplicated, block: B:564:0x0e23  */
    /* JADX WARN: Code duplicated, block: B:565:0x0e3f  */
    /* JADX WARN: Code duplicated, block: B:566:0x0e65  */
    /* JADX WARN: Code duplicated, block: B:597:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:0x016f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:600:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:601:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:603:0x023f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:605:0x038b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:606:0x03aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:0x03cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:0x03ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:0x040d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:0x0431 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:0x0474 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:0x059a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:0x05f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:0x0734 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:0x072e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:0x0723 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:617:0x071d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:0x07e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:0x07db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:620:0x085b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:0x0855 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:0x0848 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:0x0842 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:0x089b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:625:0x0903 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:0x095c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:627:0x09df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:0x0a3a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:629:0x0a9c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:630:0x0ad0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:631:0x0b05 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:633:0x0dde A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:636:0x0456 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:640:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:641:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:642:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:0x0353 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:0x0378 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:0x0397 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:0x03d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:0x03fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:0x041e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:651:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:652:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:655:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:0x0229 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:0x030e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:660:0x02b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:0x02d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:0x02f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:0x0442 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:664:0x0442 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:0x0442 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:0x0442 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:0x0442 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:0x0442 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:0x0442 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:670:0x04d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:0x04c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:672:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:673:0x0df1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:0x0471 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:675:0x0ae4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:0x0b02 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:0x0558 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:0x0556 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:0x0597 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:0x0597 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:699:0x06b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:0x069f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:0x0715 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:705:0x072b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:706:0x070f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:711:0x07d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:0x07e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:0x07cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:720:0x084e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:721:0x082d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:722:0x0829 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:0x084e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:736:0x092c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:0x092c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:742:0x0a07 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:745:0x0ace A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:748:0x0ace A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:750:0x0279 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:752:0x029f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:753:0x02be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:754:0x0285 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:755:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:756:0x02dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:761:0x0279 A[EDGE_INSN: B:761:0x0279->B:757:0x0279 BREAK  A[LOOP:26: B:94:0x028c->B:97:0x0296], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0243  */
    /* JADX WARN: Code duplicated, block: B:80:0x024b  */
    /* JADX WARN: Code duplicated, block: B:82:0x024f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0256  */
    /* JADX WARN: Code duplicated, block: B:85:0x0261  */
    /* JADX WARN: Code duplicated, block: B:87:0x0268  */
    /* JADX WARN: Code duplicated, block: B:89:0x0270 A[LOOP:24: B:86:0x0266->B:89:0x0270, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x027b  */
    /* JADX WARN: Code duplicated, block: B:95:0x028e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0296 A[LOOP:26: B:94:0x028c->B:97:0x0296, LOOP_END] */
    public final int zzc(Object obj, byte[] bArr, int i10, int i11, int i12, zztj zztjVar) throws IOException {
        Unsafe unsafe;
        int i13;
        int i14;
        int i15;
        int i16;
        int iZzk;
        int i17;
        int i18;
        int iZzq;
        int i19;
        int i20;
        zztj zztjVar2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        zzuh zzuhVar;
        zzwv zzwvVar;
        zzuu zzuuVarZzb;
        int i26;
        int[] iArr;
        int i27;
        int iZzr;
        long j10;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        byte[] bArr2;
        Unsafe unsafe2;
        int i38;
        boolean z10;
        int iZzj;
        int i39;
        int i40;
        int length;
        int i41;
        char[] cArr;
        int i42;
        int i43;
        int i44;
        byte b10;
        byte b11;
        int i45;
        byte b12;
        int i46;
        int iZza;
        int i47;
        int i48;
        int i49;
        zztj zztjVar3;
        Unsafe unsafe3;
        zztj zztjVar4;
        int i50;
        int i51;
        int i52;
        Unsafe unsafe4;
        int i53;
        zzvb zzvbVarZzd;
        int i54;
        byte[] bArr3;
        Unsafe unsafe5;
        Object object;
        Unsafe unsafe6;
        long j11;
        int i55;
        int i56;
        int i57;
        int iZzm;
        int iZzj2;
        boolean z11;
        int i58;
        int i59;
        int iZza2;
        int i60;
        zzva zzvaVarZzu;
        long j12;
        Unsafe unsafe7;
        zzvb zzvbVarZzd2;
        zzvb zzvbVar;
        int i61;
        int i62;
        int i63;
        int i64;
        Unsafe unsafe8;
        int iZzl;
        zzue zzueVar;
        int iZzj3;
        zzue zzueVar2;
        int iZzj4;
        int i65;
        zzuo zzuoVar;
        int iZzj5;
        zzuo zzuoVar2;
        int i66;
        zzvl zzvlVar;
        int iZzm2;
        int iZzj6;
        zzvl zzvlVar2;
        int i67;
        int i68;
        int i69;
        int i70;
        zzvl zzvlVar3;
        int iZzj7;
        zzvl zzvlVar4;
        int iZzj8;
        int i71;
        zzux zzuxVar;
        int iZzj9;
        zzux zzuxVar2;
        int i72;
        zztl zztlVar;
        int iZzm3;
        boolean z12;
        int iZzj10;
        boolean z13;
        zztl zztlVar2;
        int i73;
        boolean z14;
        int i74;
        int i75;
        int iZzj11;
        int i76;
        int i77;
        int iZzj12;
        int i78;
        Object obj2;
        int iZzj13;
        int i79;
        int iZzj14;
        int i80;
        int iZzj15;
        int i81;
        int iZzl2;
        zzva zzvaVarZzu2;
        zzwv zzwvVar2;
        int i82;
        int i83;
        Iterator it;
        Object objZzn;
        int iIntValue;
        int size;
        Object objZzn2;
        int i84;
        int i85;
        int iIntValue2;
        int i86;
        zzux zzuxVar3;
        int iZzj16;
        zzux zzuxVar4;
        int iZzj17;
        int i87;
        zzvl zzvlVar5;
        int iZzj18;
        zzvl zzvlVar6;
        int i88;
        int i89;
        zzwh zzwhVarZzv;
        int iZzj19;
        int i90;
        zzvz<T> zzvzVar = this;
        Object obj3 = obj;
        byte[] bArr4 = bArr;
        int i91 = i11;
        i12 = i12;
        zztj zztjVar5 = zztjVar;
        zzA(obj);
        Unsafe unsafe9 = zzb;
        int i92 = 0;
        int iZzi = i10;
        int i93 = 0;
        int i94 = 0;
        int i95 = 0;
        int i96 = -1;
        int i97 = 1048575;
        while (true) {
            if (iZzi < i91) {
                int i98 = iZzi + 1;
                byte b13 = bArr4[iZzi];
                if (b13 < 0) {
                    iZzk = zztk.zzk(b13, bArr4, i98, zztjVar5);
                    i94 = zztjVar5.zza;
                } else {
                    i94 = b13;
                    iZzk = i98;
                }
                int i99 = i94 >>> 3;
                if (i99 > i96) {
                    iZzq = (i99 < zzvzVar.zze || i99 > zzvzVar.zzf) ? -1 : zzvzVar.zzq(i99, i93 / 3);
                } else {
                    if (i99 < zzvzVar.zze || i99 > zzvzVar.zzf) {
                        i17 = -1;
                        i18 = -1;
                    } else {
                        iZzq = zzvzVar.zzq(i99, i92);
                    }
                    if (i18 == i17) {
                        i92 = i92;
                        i19 = i92;
                        unsafe = unsafe9;
                        i95 = i95;
                        i97 = i97;
                        i20 = i99;
                        zztjVar2 = zztjVar5;
                        i21 = i12;
                        i22 = iZzk;
                    } else {
                        i26 = i94 & 7;
                        iArr = zzvzVar.zzc;
                        i27 = iArr[i18 + 1];
                        iZzr = zzr(i27);
                        j10 = i27 & 1048575;
                        i28 = iZzk;
                        i29 = i94;
                        if (iZzr <= 17) {
                            int i100 = iArr[i18 + 2];
                            i30 = 1 << (i100 >>> 20);
                            i31 = 1048575;
                            i32 = i100 & 1048575;
                            if (i32 != i97) {
                                if (i97 != 1048575) {
                                    unsafe9.putInt(obj3, i97, i95);
                                    i31 = 1048575;
                                }
                                if (i32 == i31) {
                                    i95 = 0;
                                } else {
                                    i95 = unsafe9.getInt(obj3, i32);
                                }
                                i33 = i32;
                            } else {
                                i33 = i97;
                            }
                            switch (iZzr) {
                                case 0:
                                    zztjVar2 = zztjVar5;
                                    unsafe2 = unsafe9;
                                    i34 = i18;
                                    i35 = i33;
                                    i36 = i99;
                                    i37 = i28;
                                    i38 = 0;
                                    bArr2 = bArr;
                                    if (i26 == 1) {
                                        iZzi = i37 + 8;
                                        i95 |= i30;
                                        zzxc.zzo(obj3, j10, Double.longBitsToDouble(zztk.zzq(bArr2, i37)));
                                        i91 = i11;
                                        i12 = i12;
                                        unsafe9 = unsafe2;
                                        zztjVar5 = zztjVar2;
                                        i92 = i38;
                                        i94 = i29;
                                        i96 = i36;
                                        i97 = i35;
                                        bArr4 = bArr2;
                                        i93 = i34;
                                    } else {
                                        i97 = i35;
                                        i22 = i37;
                                        unsafe = unsafe2;
                                        i95 = i95;
                                        i19 = i34;
                                        i92 = i38;
                                        i94 = i29;
                                        i20 = i36;
                                        i21 = i12;
                                    }
                                    break;
                                case 1:
                                    zztjVar2 = zztjVar5;
                                    unsafe2 = unsafe9;
                                    i34 = i18;
                                    i35 = i33;
                                    i36 = i99;
                                    i37 = i28;
                                    i38 = 0;
                                    bArr2 = bArr;
                                    if (i26 == 5) {
                                        iZzi = i37 + 4;
                                        i95 |= i30;
                                        zzxc.zzp(obj3, j10, Float.intBitsToFloat(zztk.zzc(bArr2, i37)));
                                        i91 = i11;
                                        i12 = i12;
                                        unsafe9 = unsafe2;
                                        zztjVar5 = zztjVar2;
                                        i92 = i38;
                                        i94 = i29;
                                        i96 = i36;
                                        i97 = i35;
                                        bArr4 = bArr2;
                                        i93 = i34;
                                    } else {
                                        i97 = i35;
                                        i22 = i37;
                                        unsafe = unsafe2;
                                        i95 = i95;
                                        i19 = i34;
                                        i92 = i38;
                                        i94 = i29;
                                        i20 = i36;
                                        i21 = i12;
                                    }
                                    break;
                                case 2:
                                case 3:
                                    zztjVar2 = zztjVar5;
                                    unsafe2 = unsafe9;
                                    i34 = i18;
                                    i35 = i33;
                                    i36 = i99;
                                    i37 = i28;
                                    i38 = 0;
                                    bArr2 = bArr;
                                    if (i26 == 0) {
                                        i95 |= i30;
                                        iZzi = zztk.zzm(bArr2, i37, zztjVar2);
                                        unsafe2.putLong(obj, j10, zztjVar2.zzb);
                                        i91 = i11;
                                        i12 = i12;
                                        unsafe9 = unsafe2;
                                        zztjVar5 = zztjVar2;
                                        i92 = i38;
                                        i94 = i29;
                                        i96 = i36;
                                        i97 = i35;
                                        bArr4 = bArr2;
                                        i93 = i34;
                                    } else {
                                        i97 = i35;
                                        i22 = i37;
                                        unsafe = unsafe2;
                                        i95 = i95;
                                        i19 = i34;
                                        i92 = i38;
                                        i94 = i29;
                                        i20 = i36;
                                        i21 = i12;
                                    }
                                    break;
                                case 4:
                                case 11:
                                    zztjVar2 = zztjVar5;
                                    unsafe2 = unsafe9;
                                    i34 = i18;
                                    i35 = i33;
                                    i36 = i99;
                                    i37 = i28;
                                    i38 = 0;
                                    bArr2 = bArr;
                                    if (i26 == 0) {
                                        i95 |= i30;
                                        iZzi = zztk.zzj(bArr2, i37, zztjVar2);
                                        unsafe2.putInt(obj3, j10, zztjVar2.zza);
                                        i91 = i11;
                                        i12 = i12;
                                        unsafe9 = unsafe2;
                                        zztjVar5 = zztjVar2;
                                        i92 = i38;
                                        i94 = i29;
                                        i96 = i36;
                                        i97 = i35;
                                        bArr4 = bArr2;
                                        i93 = i34;
                                    } else {
                                        i97 = i35;
                                        i22 = i37;
                                        unsafe = unsafe2;
                                        i95 = i95;
                                        i19 = i34;
                                        i92 = i38;
                                        i94 = i29;
                                        i20 = i36;
                                        i21 = i12;
                                    }
                                    break;
                                case 5:
                                case 14:
                                    zztjVar2 = zztjVar5;
                                    unsafe2 = unsafe9;
                                    i34 = i18;
                                    i35 = i33;
                                    i36 = i99;
                                    i37 = i28;
                                    i38 = 0;
                                    bArr2 = bArr;
                                    if (i26 == 1) {
                                        iZzi = i37 + 8;
                                        i95 |= i30;
                                        unsafe2.putLong(obj, j10, zztk.zzq(bArr2, i37));
                                        i91 = i11;
                                        i12 = i12;
                                        unsafe9 = unsafe2;
                                        zztjVar5 = zztjVar2;
                                        i92 = i38;
                                        i94 = i29;
                                        i96 = i36;
                                        i97 = i35;
                                        bArr4 = bArr2;
                                        i93 = i34;
                                    } else {
                                        i97 = i35;
                                        i22 = i37;
                                        unsafe = unsafe2;
                                        i95 = i95;
                                        i19 = i34;
                                        i92 = i38;
                                        i94 = i29;
                                        i20 = i36;
                                        i21 = i12;
                                    }
                                    break;
                                case 6:
                                case 13:
                                    zztjVar2 = zztjVar5;
                                    unsafe2 = unsafe9;
                                    i34 = i18;
                                    i35 = i33;
                                    i36 = i99;
                                    i37 = i28;
                                    i38 = 0;
                                    bArr2 = bArr;
                                    if (i26 == 5) {
                                        iZzi = i37 + 4;
                                        i95 |= i30;
                                        unsafe2.putInt(obj3, j10, zztk.zzc(bArr2, i37));
                                        i91 = i11;
                                        i12 = i12;
                                        unsafe9 = unsafe2;
                                        zztjVar5 = zztjVar2;
                                        i92 = i38;
                                        i94 = i29;
                                        i96 = i36;
                                        i97 = i35;
                                        bArr4 = bArr2;
                                        i93 = i34;
                                    } else {
                                        i97 = i35;
                                        i22 = i37;
                                        unsafe = unsafe2;
                                        i95 = i95;
                                        i19 = i34;
                                        i92 = i38;
                                        i94 = i29;
                                        i20 = i36;
                                        i21 = i12;
                                    }
                                    break;
                                case 7:
                                    zztjVar2 = zztjVar5;
                                    unsafe2 = unsafe9;
                                    i34 = i18;
                                    i35 = i33;
                                    i36 = i99;
                                    i37 = i28;
                                    i38 = 0;
                                    bArr2 = bArr;
                                    if (i26 == 0) {
                                        i95 |= i30;
                                        iZzi = zztk.zzm(bArr2, i37, zztjVar2);
                                        if (zztjVar2.zzb != 0) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        zzxc.zzm(obj3, j10, z10);
                                        i91 = i11;
                                        i12 = i12;
                                        unsafe9 = unsafe2;
                                        zztjVar5 = zztjVar2;
                                        i92 = i38;
                                        i94 = i29;
                                        i96 = i36;
                                        i97 = i35;
                                        bArr4 = bArr2;
                                        i93 = i34;
                                    } else {
                                        i97 = i35;
                                        i22 = i37;
                                        unsafe = unsafe2;
                                        i95 = i95;
                                        i19 = i34;
                                        i92 = i38;
                                        i94 = i29;
                                        i20 = i36;
                                        i21 = i12;
                                    }
                                    break;
                                case 8:
                                    zztjVar2 = zztjVar5;
                                    i34 = i18;
                                    i35 = i33;
                                    i36 = i99;
                                    i37 = i28;
                                    bArr2 = bArr;
                                    unsafe2 = unsafe9;
                                    if (i26 == 2) {
                                        if ((i27 & PKIFailureInfo.duplicateCertReq) != 0) {
                                            iZzj = zztk.zzj(bArr2, i37, zztjVar2);
                                            i39 = zztjVar2.zza;
                                            if (i39 >= 0) {
                                                throw new zzve("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            i40 = i95 | i30;
                                            if (i39 == 0) {
                                                zztjVar2.zzc = "";
                                                i43 = i40;
                                                i38 = 0;
                                            } else {
                                                length = bArr2.length;
                                                int i101 = zzxf.zza;
                                                if ((iZzj | i39 | ((length - iZzj) - i39)) >= 0) {
                                                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iZzj), Integer.valueOf(i39)));
                                                }
                                                i41 = iZzj + i39;
                                                cArr = new char[i39];
                                                i42 = 0;
                                                while (iZzj < i41) {
                                                    b12 = bArr2[iZzj];
                                                    if (zzxd.zzd(b12)) {
                                                        iZzj++;
                                                        cArr[i42] = (char) b12;
                                                        i42++;
                                                    } else {
                                                        while (iZzj < i41) {
                                                            i44 = iZzj + 1;
                                                            b10 = bArr2[iZzj];
                                                            if (zzxd.zzd(b10)) {
                                                                cArr[i42] = (char) b10;
                                                                i42++;
                                                                iZzj = i44;
                                                                while (iZzj < i41) {
                                                                    b11 = bArr2[iZzj];
                                                                    if (zzxd.zzd(b11)) {
                                                                    }
                                                                    iZzj++;
                                                                    cArr[i42] = (char) b11;
                                                                    i42++;
                                                                }
                                                            } else {
                                                                i45 = i40;
                                                                if (b10 < -32) {
                                                                    if (i44 < i41) {
                                                                        throw new zzve("Protocol message had invalid UTF-8.");
                                                                    }
                                                                    iZzj += 2;
                                                                    zzxd.zzc(b10, bArr2[i44], cArr, i42);
                                                                    i42++;
                                                                } else if (b10 < -16) {
                                                                    if (i44 < i41 - 1) {
                                                                        throw new zzve("Protocol message had invalid UTF-8.");
                                                                    }
                                                                    zzxd.zzb(b10, bArr2[i44], bArr2[iZzj + 2], cArr, i42);
                                                                    i42++;
                                                                    i40 = i45;
                                                                    iZzj += 3;
                                                                } else {
                                                                    if (i44 < i41 - 2) {
                                                                        throw new zzve("Protocol message had invalid UTF-8.");
                                                                    }
                                                                    byte b14 = bArr2[i44];
                                                                    int i102 = iZzj + 3;
                                                                    byte b15 = bArr2[iZzj + 2];
                                                                    iZzj += 4;
                                                                    zzxd.zza(b10, b14, b15, bArr2[i102], cArr, i42);
                                                                    i42 += 2;
                                                                }
                                                                i40 = i45;
                                                            }
                                                            break;
                                                        }
                                                        i43 = i40;
                                                        i38 = 0;
                                                        zztjVar2.zzc = new String(cArr, 0, i42);
                                                        iZzj = i41;
                                                    }
                                                }
                                                while (iZzj < i41) {
                                                    i44 = iZzj + 1;
                                                    b10 = bArr2[iZzj];
                                                    if (zzxd.zzd(b10)) {
                                                        cArr[i42] = (char) b10;
                                                        i42++;
                                                        iZzj = i44;
                                                        while (iZzj < i41) {
                                                            b11 = bArr2[iZzj];
                                                            if (zzxd.zzd(b11)) {
                                                            }
                                                            iZzj++;
                                                            cArr[i42] = (char) b11;
                                                            i42++;
                                                        }
                                                    } else {
                                                        i45 = i40;
                                                        if (b10 < -32) {
                                                            if (i44 < i41) {
                                                                throw new zzve("Protocol message had invalid UTF-8.");
                                                            }
                                                            iZzj += 2;
                                                            zzxd.zzc(b10, bArr2[i44], cArr, i42);
                                                            i42++;
                                                        } else if (b10 < -16) {
                                                            if (i44 < i41 - 1) {
                                                                throw new zzve("Protocol message had invalid UTF-8.");
                                                            }
                                                            zzxd.zzb(b10, bArr2[i44], bArr2[iZzj + 2], cArr, i42);
                                                            i42++;
                                                            i40 = i45;
                                                            iZzj += 3;
                                                        } else {
                                                            if (i44 < i41 - 2) {
                                                                throw new zzve("Protocol message had invalid UTF-8.");
                                                            }
                                                            byte b16 = bArr2[i44];
                                                            int i103 = iZzj + 3;
                                                            byte b17 = bArr2[iZzj + 2];
                                                            iZzj += 4;
                                                            zzxd.zza(b10, b16, b17, bArr2[i103], cArr, i42);
                                                            i42 += 2;
                                                        }
                                                        i40 = i45;
                                                    }
                                                    break;
                                                }
                                                i43 = i40;
                                                i38 = 0;
                                                zztjVar2.zzc = new String(cArr, 0, i42);
                                                iZzj = i41;
                                            }
                                            iZzi = iZzj;
                                            i95 = i43;
                                        } else {
                                            i38 = 0;
                                            i95 |= i30;
                                            iZzi = zztk.zzh(bArr2, i37, zztjVar2);
                                        }
                                        unsafe2.putObject(obj3, j10, zztjVar2.zzc);
                                        i91 = i11;
                                        i12 = i12;
                                        unsafe9 = unsafe2;
                                        zztjVar5 = zztjVar2;
                                        i92 = i38;
                                        i94 = i29;
                                        i96 = i36;
                                        i97 = i35;
                                        bArr4 = bArr2;
                                        i93 = i34;
                                    } else {
                                        i38 = 0;
                                        i97 = i35;
                                        i22 = i37;
                                        unsafe = unsafe2;
                                        i95 = i95;
                                        i19 = i34;
                                        i92 = i38;
                                        i94 = i29;
                                        i20 = i36;
                                        i21 = i12;
                                    }
                                    break;
                                case 9:
                                    zztjVar2 = zztjVar5;
                                    unsafe2 = unsafe9;
                                    i34 = i18;
                                    i35 = i33;
                                    i36 = i99;
                                    i37 = i28;
                                    i46 = i29;
                                    bArr2 = bArr;
                                    if (i26 == 2) {
                                        i95 |= i30;
                                        Object objZzx = zzvzVar.zzx(obj3, i34);
                                        i91 = i11;
                                        int iZzo = zztk.zzo(objZzx, zzvzVar.zzv(i34), bArr, i37, i91, zztjVar);
                                        zzvzVar.zzF(obj3, i34, objZzx);
                                        iZzi = iZzo;
                                        i12 = i12;
                                        unsafe9 = unsafe2;
                                        zztjVar5 = zztjVar2;
                                        i94 = i46;
                                        i96 = i36;
                                        i92 = 0;
                                        i97 = i35;
                                        bArr4 = bArr2;
                                        i93 = i34;
                                    } else {
                                        i29 = i46;
                                        i38 = 0;
                                        i97 = i35;
                                        i22 = i37;
                                        unsafe = unsafe2;
                                        i95 = i95;
                                        i19 = i34;
                                        i92 = i38;
                                        i94 = i29;
                                        i20 = i36;
                                        i21 = i12;
                                    }
                                    break;
                                case 10:
                                    zztjVar2 = zztjVar5;
                                    unsafe2 = unsafe9;
                                    i34 = i18;
                                    i35 = i33;
                                    i36 = i99;
                                    i37 = i28;
                                    i46 = i29;
                                    bArr2 = bArr;
                                    if (i26 == 2) {
                                        i95 |= i30;
                                        iZza = zztk.zza(bArr2, i37, zztjVar2);
                                        unsafe2.putObject(obj3, j10, zztjVar2.zzc);
                                        iZzi = iZza;
                                        i91 = i11;
                                        zztjVar5 = zztjVar2;
                                        i96 = i36;
                                        i92 = 0;
                                        i97 = i35;
                                        i12 = i12;
                                        unsafe9 = unsafe2;
                                        i94 = i46;
                                        bArr4 = bArr2;
                                        i93 = i34;
                                    } else {
                                        i29 = i46;
                                        i38 = 0;
                                        i97 = i35;
                                        i22 = i37;
                                        unsafe = unsafe2;
                                        i95 = i95;
                                        i19 = i34;
                                        i92 = i38;
                                        i94 = i29;
                                        i20 = i36;
                                        i21 = i12;
                                    }
                                    break;
                                case 12:
                                    i11 = i11;
                                    zztjVar2 = zztjVar5;
                                    unsafe2 = unsafe9;
                                    i34 = i18;
                                    i35 = i33;
                                    i36 = i99;
                                    i37 = i28;
                                    i46 = i29;
                                    bArr2 = bArr;
                                    i12 = i12;
                                    if (i26 == 0) {
                                        int iZzj20 = zztk.zzj(bArr2, i37, zztjVar2);
                                        i47 = zztjVar2.zza;
                                        zzva zzvaVarZzu3 = zzvzVar.zzu(i34);
                                        if ((i27 & Integer.MIN_VALUE) != 0 || zzvaVarZzu3 == null || zzvaVarZzu3.zza(i47)) {
                                            i95 |= i30;
                                            unsafe2.putInt(obj3, j10, i47);
                                        } else {
                                            zzd(obj).zzj(i46, Long.valueOf(i47));
                                        }
                                        iZzi = iZzj20;
                                        i91 = i11;
                                        zztjVar5 = zztjVar2;
                                        i96 = i36;
                                        i92 = 0;
                                        i97 = i35;
                                        i12 = i12;
                                        unsafe9 = unsafe2;
                                        i94 = i46;
                                        bArr4 = bArr2;
                                        i93 = i34;
                                    } else {
                                        i29 = i46;
                                        i38 = 0;
                                        i97 = i35;
                                        i22 = i37;
                                        unsafe = unsafe2;
                                        i95 = i95;
                                        i19 = i34;
                                        i92 = i38;
                                        i94 = i29;
                                        i20 = i36;
                                        i21 = i12;
                                    }
                                    break;
                                case 15:
                                    zztjVar2 = zztjVar5;
                                    unsafe2 = unsafe9;
                                    i34 = i18;
                                    i35 = i33;
                                    i36 = i99;
                                    i37 = i28;
                                    i46 = i29;
                                    bArr2 = bArr;
                                    if (i26 == 0) {
                                        i95 |= i30;
                                        iZza = zztk.zzj(bArr2, i37, zztjVar2);
                                        unsafe2.putInt(obj3, j10, zzty.zzb(zztjVar2.zza));
                                        iZzi = iZza;
                                        i91 = i11;
                                        zztjVar5 = zztjVar2;
                                        i96 = i36;
                                        i92 = 0;
                                        i97 = i35;
                                        i12 = i12;
                                        unsafe9 = unsafe2;
                                        i94 = i46;
                                        bArr4 = bArr2;
                                        i93 = i34;
                                    } else {
                                        i29 = i46;
                                        i38 = 0;
                                        i97 = i35;
                                        i22 = i37;
                                        unsafe = unsafe2;
                                        i95 = i95;
                                        i19 = i34;
                                        i92 = i38;
                                        i94 = i29;
                                        i20 = i36;
                                        i21 = i12;
                                    }
                                    break;
                                case 16:
                                    i34 = i18;
                                    i35 = i33;
                                    i36 = i99;
                                    i37 = i28;
                                    i46 = i29;
                                    if (i26 == 0) {
                                        i95 |= i30;
                                        bArr2 = bArr;
                                        int iZzm4 = zztk.zzm(bArr2, i37, zztjVar5);
                                        unsafe9.putLong(obj, j10, zzty.zzc(zztjVar5.zzb));
                                        i91 = i11;
                                        i12 = i12;
                                        unsafe9 = unsafe9;
                                        zztjVar5 = zztjVar5;
                                        i94 = i46;
                                        iZzi = iZzm4;
                                        i96 = i36;
                                        i92 = 0;
                                        i97 = i35;
                                        bArr4 = bArr2;
                                        i93 = i34;
                                    } else {
                                        bArr2 = bArr;
                                        zztjVar2 = zztjVar5;
                                        unsafe2 = unsafe9;
                                        i29 = i46;
                                        i38 = 0;
                                        i97 = i35;
                                        i22 = i37;
                                        unsafe = unsafe2;
                                        i95 = i95;
                                        i19 = i34;
                                        i92 = i38;
                                        i94 = i29;
                                        i20 = i36;
                                        i21 = i12;
                                    }
                                    break;
                                default:
                                    if (i26 == 3) {
                                        int i104 = i95 | i30;
                                        Object objZzx2 = zzvzVar.zzx(obj3, i18);
                                        int i105 = i18;
                                        iZzi = zztk.zzn(objZzx2, zzvzVar.zzv(i18), bArr, i28, i11, (i99 << 3) | 4, zztjVar);
                                        zzvzVar.zzF(obj3, i105, objZzx2);
                                        i97 = i33;
                                        i12 = i12;
                                        i95 = i104;
                                        i93 = i105;
                                        i94 = i29;
                                        i96 = i99;
                                        i92 = 0;
                                        bArr4 = bArr;
                                        i91 = i11;
                                    } else {
                                        i34 = i18;
                                        i35 = i33;
                                        i36 = i99;
                                        i37 = i28;
                                        bArr2 = bArr;
                                        zztjVar2 = zztjVar5;
                                        unsafe2 = unsafe9;
                                        i38 = 0;
                                        i97 = i35;
                                        i22 = i37;
                                        unsafe = unsafe2;
                                        i95 = i95;
                                        i19 = i34;
                                        i92 = i38;
                                        i94 = i29;
                                        i20 = i36;
                                        i21 = i12;
                                    }
                                    break;
                            }
                        } else {
                            i48 = i18;
                            i97 = i97;
                            i49 = i99;
                            i92 = 0;
                            zztjVar3 = zztjVar5;
                            unsafe3 = unsafe9;
                            if (iZzr == 27) {
                                i95 = i95;
                                i54 = i48;
                                bArr3 = bArr;
                                if (iZzr <= 49) {
                                    j12 = i27;
                                    unsafe7 = zzb;
                                    zzvbVarZzd2 = (zzvb) unsafe7.getObject(obj3, j10);
                                    if (zzvbVarZzd2.zzc()) {
                                        int size2 = zzvbVarZzd2.size();
                                        zzvbVarZzd2 = zzvbVarZzd2.zzd(size2 != 0 ? size2 + size2 : 10);
                                        unsafe7.putObject(obj3, j10, zzvbVarZzd2);
                                    }
                                    zzvbVar = zzvbVarZzd2;
                                    switch (iZzr) {
                                        case 18:
                                        case 35:
                                            i61 = i11;
                                            zztjVar3 = zztjVar3;
                                            i62 = i28;
                                            i63 = i29;
                                            i64 = i49;
                                            unsafe8 = r12;
                                            i54 = i54;
                                            if (i26 == 2) {
                                                zzueVar2 = (zzue) zzvbVar;
                                                iZzj4 = zztk.zzj(bArr3, i62, zztjVar3);
                                                i65 = zztjVar3.zza + iZzj4;
                                                while (iZzj4 < i65) {
                                                    zzueVar2.zzf(Double.longBitsToDouble(zztk.zzq(bArr3, iZzj4)));
                                                    iZzj4 += 8;
                                                }
                                                if (iZzj4 != i65) {
                                                    throw new zzve("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                iZzl = iZzj4;
                                            } else if (i26 == 1) {
                                                iZzl = i62 + 8;
                                                zzueVar = (zzue) zzvbVar;
                                                zzueVar.zzf(Double.longBitsToDouble(zztk.zzq(bArr3, i62)));
                                                while (iZzl < i61) {
                                                    iZzj3 = zztk.zzj(bArr3, iZzl, zztjVar3);
                                                    if (i63 == zztjVar3.zza) {
                                                        zzueVar.zzf(Double.longBitsToDouble(zztk.zzq(bArr3, iZzj3)));
                                                        iZzl = iZzj3 + 8;
                                                    }
                                                }
                                            } else {
                                                iZzl = i62;
                                            }
                                            if (iZzl != i62) {
                                                zztjVar5 = zztjVar3;
                                                i96 = i64;
                                                i91 = i61;
                                                i93 = i54;
                                                unsafe9 = unsafe8;
                                                i94 = i63;
                                                obj3 = obj;
                                                iZzi = iZzl;
                                            } else {
                                                i22 = iZzl;
                                                unsafe = unsafe8;
                                                i94 = i63;
                                                i97 = i97;
                                                i21 = i12;
                                                zztjVar2 = zztjVar3;
                                                i19 = i54;
                                                obj3 = obj;
                                                i20 = i64;
                                            }
                                            break;
                                        case 19:
                                        case 36:
                                            i61 = i11;
                                            zztjVar3 = zztjVar3;
                                            i62 = i28;
                                            i63 = i29;
                                            i64 = i49;
                                            unsafe8 = r12;
                                            i54 = i54;
                                            if (i26 == 2) {
                                                zzuoVar2 = (zzuo) zzvbVar;
                                                iZzj4 = zztk.zzj(bArr3, i62, zztjVar3);
                                                i66 = zztjVar3.zza + iZzj4;
                                                while (iZzj4 < i66) {
                                                    zzuoVar2.zzf(Float.intBitsToFloat(zztk.zzc(bArr3, iZzj4)));
                                                    iZzj4 += 4;
                                                }
                                                if (iZzj4 != i66) {
                                                    throw new zzve("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                iZzl = iZzj4;
                                            } else if (i26 == 5) {
                                                iZzl = i62 + 4;
                                                zzuoVar = (zzuo) zzvbVar;
                                                zzuoVar.zzf(Float.intBitsToFloat(zztk.zzc(bArr3, i62)));
                                                while (iZzl < i61) {
                                                    iZzj5 = zztk.zzj(bArr3, iZzl, zztjVar3);
                                                    if (i63 == zztjVar3.zza) {
                                                        zzuoVar.zzf(Float.intBitsToFloat(zztk.zzc(bArr3, iZzj5)));
                                                        iZzl = iZzj5 + 4;
                                                    }
                                                }
                                            } else {
                                                iZzl = i62;
                                            }
                                            if (iZzl != i62) {
                                                zztjVar5 = zztjVar3;
                                                i96 = i64;
                                                i91 = i61;
                                                i93 = i54;
                                                unsafe9 = unsafe8;
                                                i94 = i63;
                                                obj3 = obj;
                                                iZzi = iZzl;
                                            } else {
                                                i22 = iZzl;
                                                unsafe = unsafe8;
                                                i94 = i63;
                                                i97 = i97;
                                                i21 = i12;
                                                zztjVar2 = zztjVar3;
                                                i19 = i54;
                                                obj3 = obj;
                                                i20 = i64;
                                            }
                                            break;
                                        case 20:
                                        case 21:
                                        case 37:
                                        case 38:
                                            i61 = i11;
                                            zztjVar3 = zztjVar3;
                                            i62 = i28;
                                            i63 = i29;
                                            i64 = i49;
                                            unsafe8 = r12;
                                            i54 = i54;
                                            if (i26 == 2) {
                                                zzvlVar2 = (zzvl) zzvbVar;
                                                iZzj4 = zztk.zzj(bArr3, i62, zztjVar3);
                                                i67 = zztjVar3.zza + iZzj4;
                                                while (iZzj4 < i67) {
                                                    iZzj4 = zztk.zzm(bArr3, iZzj4, zztjVar3);
                                                    zzvlVar2.zzf(zztjVar3.zzb);
                                                }
                                                if (iZzj4 != i67) {
                                                    throw new zzve("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                iZzl = iZzj4;
                                            } else if (i26 == 0) {
                                                zzvlVar = (zzvl) zzvbVar;
                                                iZzm2 = zztk.zzm(bArr3, i62, zztjVar3);
                                                zzvlVar.zzf(zztjVar3.zzb);
                                                while (iZzm2 < i61) {
                                                    iZzj6 = zztk.zzj(bArr3, iZzm2, zztjVar3);
                                                    if (i63 == zztjVar3.zza) {
                                                        iZzm2 = zztk.zzm(bArr3, iZzj6, zztjVar3);
                                                        zzvlVar.zzf(zztjVar3.zzb);
                                                    } else {
                                                        iZzl = iZzm2;
                                                    }
                                                }
                                                iZzl = iZzm2;
                                            } else {
                                                iZzl = i62;
                                            }
                                            if (iZzl != i62) {
                                                zztjVar5 = zztjVar3;
                                                i96 = i64;
                                                i91 = i61;
                                                i93 = i54;
                                                unsafe9 = unsafe8;
                                                i94 = i63;
                                                obj3 = obj;
                                                iZzi = iZzl;
                                            } else {
                                                i22 = iZzl;
                                                unsafe = unsafe8;
                                                i94 = i63;
                                                i97 = i97;
                                                i21 = i12;
                                                zztjVar2 = zztjVar3;
                                                i19 = i54;
                                                obj3 = obj;
                                                i20 = i64;
                                            }
                                            break;
                                        case 22:
                                        case 29:
                                        case 39:
                                        case 43:
                                            i68 = i11;
                                            zztjVar3 = zztjVar3;
                                            i69 = i28;
                                            i63 = i29;
                                            unsafe8 = r12;
                                            i54 = i54;
                                            if (i26 == 2) {
                                                iZzl = zztk.zzg(bArr3, i69, zzvbVar, zztjVar3);
                                                i61 = i68;
                                                i62 = i69;
                                                i64 = i49;
                                            } else if (i26 == 0) {
                                                i61 = i68;
                                                i62 = i69;
                                                i64 = i49;
                                                iZzl = zztk.zzl(i63, bArr, i69, i11, zzvbVar, zztjVar);
                                            } else {
                                                i61 = i68;
                                                i62 = i69;
                                                i64 = i49;
                                                iZzl = i62;
                                            }
                                            if (iZzl != i62) {
                                                zztjVar5 = zztjVar3;
                                                i96 = i64;
                                                i91 = i61;
                                                i93 = i54;
                                                unsafe9 = unsafe8;
                                                i94 = i63;
                                                obj3 = obj;
                                                iZzi = iZzl;
                                            } else {
                                                i22 = iZzl;
                                                unsafe = unsafe8;
                                                i94 = i63;
                                                i97 = i97;
                                                i21 = i12;
                                                zztjVar2 = zztjVar3;
                                                i19 = i54;
                                                obj3 = obj;
                                                i20 = i64;
                                            }
                                            break;
                                        case 23:
                                        case 32:
                                        case 40:
                                        case 46:
                                            i68 = i11;
                                            zztjVar3 = zztjVar3;
                                            i69 = i28;
                                            i63 = i29;
                                            unsafe8 = r12;
                                            i54 = i54;
                                            if (i26 == 2) {
                                                if (i26 == 1) {
                                                    i70 = i69 + 8;
                                                    zzvlVar3 = (zzvl) zzvbVar;
                                                    zzvlVar3.zzf(zztk.zzq(bArr3, i69));
                                                    while (i70 < i68) {
                                                        iZzj7 = zztk.zzj(bArr3, i70, zztjVar3);
                                                        if (i63 == zztjVar3.zza) {
                                                            i61 = i68;
                                                            i62 = i69;
                                                            iZzl = i70;
                                                            i64 = i49;
                                                            if (iZzl != i62) {
                                                                zztjVar5 = zztjVar3;
                                                                i96 = i64;
                                                                i91 = i61;
                                                                i93 = i54;
                                                                unsafe9 = unsafe8;
                                                                i94 = i63;
                                                                obj3 = obj;
                                                                iZzi = iZzl;
                                                            } else {
                                                                i22 = iZzl;
                                                                unsafe = unsafe8;
                                                                i94 = i63;
                                                                i97 = i97;
                                                                i21 = i12;
                                                                zztjVar2 = zztjVar3;
                                                                i19 = i54;
                                                                obj3 = obj;
                                                                i20 = i64;
                                                            }
                                                        } else {
                                                            zzvlVar3.zzf(zztk.zzq(bArr3, iZzj7));
                                                            i70 = iZzj7 + 8;
                                                        }
                                                        break;
                                                    }
                                                    i61 = i68;
                                                    i62 = i69;
                                                    iZzl = i70;
                                                    i64 = i49;
                                                    if (iZzl != i62) {
                                                        zztjVar5 = zztjVar3;
                                                        i96 = i64;
                                                        i91 = i61;
                                                        i93 = i54;
                                                        unsafe9 = unsafe8;
                                                        i94 = i63;
                                                        obj3 = obj;
                                                        iZzi = iZzl;
                                                    } else {
                                                        i22 = iZzl;
                                                        unsafe = unsafe8;
                                                        i94 = i63;
                                                        i97 = i97;
                                                        i21 = i12;
                                                        zztjVar2 = zztjVar3;
                                                        i19 = i54;
                                                        obj3 = obj;
                                                        i20 = i64;
                                                    }
                                                }
                                                i61 = i68;
                                                i62 = i69;
                                                i64 = i49;
                                                iZzl = i62;
                                                if (iZzl != i62) {
                                                    zztjVar5 = zztjVar3;
                                                    i96 = i64;
                                                    i91 = i61;
                                                    i93 = i54;
                                                    unsafe9 = unsafe8;
                                                    i94 = i63;
                                                    obj3 = obj;
                                                    iZzi = iZzl;
                                                } else {
                                                    i22 = iZzl;
                                                    unsafe = unsafe8;
                                                    i94 = i63;
                                                    i97 = i97;
                                                    i21 = i12;
                                                    zztjVar2 = zztjVar3;
                                                    i19 = i54;
                                                    obj3 = obj;
                                                    i20 = i64;
                                                }
                                                break;
                                            } else {
                                                zzvlVar4 = (zzvl) zzvbVar;
                                                iZzj8 = zztk.zzj(bArr3, i69, zztjVar3);
                                                i71 = zztjVar3.zza + iZzj8;
                                                while (iZzj8 < i71) {
                                                    zzvlVar4.zzf(zztk.zzq(bArr3, iZzj8));
                                                    iZzj8 += 8;
                                                }
                                                if (iZzj8 != i71) {
                                                    throw new zzve("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i61 = i68;
                                                i62 = i69;
                                                iZzl = iZzj8;
                                                i64 = i49;
                                                if (iZzl != i62) {
                                                    zztjVar5 = zztjVar3;
                                                    i96 = i64;
                                                    i91 = i61;
                                                    i93 = i54;
                                                    unsafe9 = unsafe8;
                                                    i94 = i63;
                                                    obj3 = obj;
                                                    iZzi = iZzl;
                                                } else {
                                                    i22 = iZzl;
                                                    unsafe = unsafe8;
                                                    i94 = i63;
                                                    i97 = i97;
                                                    i21 = i12;
                                                    zztjVar2 = zztjVar3;
                                                    i19 = i54;
                                                    obj3 = obj;
                                                    i20 = i64;
                                                }
                                            }
                                            break;
                                        case 24:
                                        case 31:
                                        case 41:
                                        case 45:
                                            i68 = i11;
                                            zztjVar3 = zztjVar3;
                                            i69 = i28;
                                            i63 = i29;
                                            unsafe8 = r12;
                                            i54 = i54;
                                            if (i26 == 2) {
                                                if (i26 == 5) {
                                                    i70 = i69 + 4;
                                                    zzuxVar = (zzux) zzvbVar;
                                                    zzuxVar.zzf(zztk.zzc(bArr3, i69));
                                                    while (i70 < i68) {
                                                        iZzj9 = zztk.zzj(bArr3, i70, zztjVar3);
                                                        if (i63 == zztjVar3.zza) {
                                                            i61 = i68;
                                                            i62 = i69;
                                                            iZzl = i70;
                                                            i64 = i49;
                                                            if (iZzl != i62) {
                                                                zztjVar5 = zztjVar3;
                                                                i96 = i64;
                                                                i91 = i61;
                                                                i93 = i54;
                                                                unsafe9 = unsafe8;
                                                                i94 = i63;
                                                                obj3 = obj;
                                                                iZzi = iZzl;
                                                            } else {
                                                                i22 = iZzl;
                                                                unsafe = unsafe8;
                                                                i94 = i63;
                                                                i97 = i97;
                                                                i21 = i12;
                                                                zztjVar2 = zztjVar3;
                                                                i19 = i54;
                                                                obj3 = obj;
                                                                i20 = i64;
                                                            }
                                                        } else {
                                                            zzuxVar.zzf(zztk.zzc(bArr3, iZzj9));
                                                            i70 = iZzj9 + 4;
                                                        }
                                                        break;
                                                    }
                                                    i61 = i68;
                                                    i62 = i69;
                                                    iZzl = i70;
                                                    i64 = i49;
                                                    if (iZzl != i62) {
                                                        zztjVar5 = zztjVar3;
                                                        i96 = i64;
                                                        i91 = i61;
                                                        i93 = i54;
                                                        unsafe9 = unsafe8;
                                                        i94 = i63;
                                                        obj3 = obj;
                                                        iZzi = iZzl;
                                                    } else {
                                                        i22 = iZzl;
                                                        unsafe = unsafe8;
                                                        i94 = i63;
                                                        i97 = i97;
                                                        i21 = i12;
                                                        zztjVar2 = zztjVar3;
                                                        i19 = i54;
                                                        obj3 = obj;
                                                        i20 = i64;
                                                    }
                                                }
                                                i61 = i68;
                                                i62 = i69;
                                                i64 = i49;
                                                iZzl = i62;
                                                if (iZzl != i62) {
                                                    zztjVar5 = zztjVar3;
                                                    i96 = i64;
                                                    i91 = i61;
                                                    i93 = i54;
                                                    unsafe9 = unsafe8;
                                                    i94 = i63;
                                                    obj3 = obj;
                                                    iZzi = iZzl;
                                                } else {
                                                    i22 = iZzl;
                                                    unsafe = unsafe8;
                                                    i94 = i63;
                                                    i97 = i97;
                                                    i21 = i12;
                                                    zztjVar2 = zztjVar3;
                                                    i19 = i54;
                                                    obj3 = obj;
                                                    i20 = i64;
                                                }
                                                break;
                                            } else {
                                                zzuxVar2 = (zzux) zzvbVar;
                                                iZzj8 = zztk.zzj(bArr3, i69, zztjVar3);
                                                i72 = zztjVar3.zza + iZzj8;
                                                while (iZzj8 < i72) {
                                                    zzuxVar2.zzf(zztk.zzc(bArr3, iZzj8));
                                                    iZzj8 += 4;
                                                }
                                                if (iZzj8 != i72) {
                                                    throw new zzve("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i61 = i68;
                                                i62 = i69;
                                                iZzl = iZzj8;
                                                i64 = i49;
                                                if (iZzl != i62) {
                                                    zztjVar5 = zztjVar3;
                                                    i96 = i64;
                                                    i91 = i61;
                                                    i93 = i54;
                                                    unsafe9 = unsafe8;
                                                    i94 = i63;
                                                    obj3 = obj;
                                                    iZzi = iZzl;
                                                } else {
                                                    i22 = iZzl;
                                                    unsafe = unsafe8;
                                                    i94 = i63;
                                                    i97 = i97;
                                                    i21 = i12;
                                                    zztjVar2 = zztjVar3;
                                                    i19 = i54;
                                                    obj3 = obj;
                                                    i20 = i64;
                                                }
                                            }
                                            break;
                                        case 25:
                                        case 42:
                                            i68 = i11;
                                            zztjVar3 = zztjVar3;
                                            i69 = i28;
                                            i63 = i29;
                                            unsafe8 = r12;
                                            i54 = i54;
                                            if (i26 == 2) {
                                                if (i26 == 0) {
                                                    zztlVar = (zztl) zzvbVar;
                                                    iZzm3 = zztk.zzm(bArr3, i69, zztjVar3);
                                                    if (zztjVar3.zzb != 0) {
                                                        z12 = true;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                    zztlVar.zze(z12);
                                                    while (iZzm3 < i68) {
                                                        iZzj10 = zztk.zzj(bArr3, iZzm3, zztjVar3);
                                                        if (i63 == zztjVar3.zza) {
                                                            iZzl = iZzm3;
                                                            i61 = i68;
                                                            i62 = i69;
                                                            i64 = i49;
                                                            if (iZzl != i62) {
                                                                zztjVar5 = zztjVar3;
                                                                i96 = i64;
                                                                i91 = i61;
                                                                i93 = i54;
                                                                unsafe9 = unsafe8;
                                                                i94 = i63;
                                                                obj3 = obj;
                                                                iZzi = iZzl;
                                                            } else {
                                                                i22 = iZzl;
                                                                unsafe = unsafe8;
                                                                i94 = i63;
                                                                i97 = i97;
                                                                i21 = i12;
                                                                zztjVar2 = zztjVar3;
                                                                i19 = i54;
                                                                obj3 = obj;
                                                                i20 = i64;
                                                            }
                                                        } else {
                                                            iZzm3 = zztk.zzm(bArr3, iZzj10, zztjVar3);
                                                            if (zztjVar3.zzb != 0) {
                                                                z13 = true;
                                                            } else {
                                                                z13 = false;
                                                            }
                                                            zztlVar.zze(z13);
                                                        }
                                                        break;
                                                    }
                                                    iZzl = iZzm3;
                                                    i61 = i68;
                                                    i62 = i69;
                                                    i64 = i49;
                                                    if (iZzl != i62) {
                                                        zztjVar5 = zztjVar3;
                                                        i96 = i64;
                                                        i91 = i61;
                                                        i93 = i54;
                                                        unsafe9 = unsafe8;
                                                        i94 = i63;
                                                        obj3 = obj;
                                                        iZzi = iZzl;
                                                    } else {
                                                        i22 = iZzl;
                                                        unsafe = unsafe8;
                                                        i94 = i63;
                                                        i97 = i97;
                                                        i21 = i12;
                                                        zztjVar2 = zztjVar3;
                                                        i19 = i54;
                                                        obj3 = obj;
                                                        i20 = i64;
                                                    }
                                                }
                                                i61 = i68;
                                                i62 = i69;
                                                i64 = i49;
                                                iZzl = i62;
                                                if (iZzl != i62) {
                                                    zztjVar5 = zztjVar3;
                                                    i96 = i64;
                                                    i91 = i61;
                                                    i93 = i54;
                                                    unsafe9 = unsafe8;
                                                    i94 = i63;
                                                    obj3 = obj;
                                                    iZzi = iZzl;
                                                } else {
                                                    i22 = iZzl;
                                                    unsafe = unsafe8;
                                                    i94 = i63;
                                                    i97 = i97;
                                                    i21 = i12;
                                                    zztjVar2 = zztjVar3;
                                                    i19 = i54;
                                                    obj3 = obj;
                                                    i20 = i64;
                                                }
                                                break;
                                            } else {
                                                zztlVar2 = (zztl) zzvbVar;
                                                iZzj8 = zztk.zzj(bArr3, i69, zztjVar3);
                                                i73 = zztjVar3.zza + iZzj8;
                                                while (iZzj8 < i73) {
                                                    iZzj8 = zztk.zzm(bArr3, iZzj8, zztjVar3);
                                                    if (zztjVar3.zzb != 0) {
                                                        z14 = true;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    zztlVar2.zze(z14);
                                                }
                                                if (iZzj8 != i73) {
                                                    throw new zzve("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                i61 = i68;
                                                i62 = i69;
                                                iZzl = iZzj8;
                                                i64 = i49;
                                                if (iZzl != i62) {
                                                    zztjVar5 = zztjVar3;
                                                    i96 = i64;
                                                    i91 = i61;
                                                    i93 = i54;
                                                    unsafe9 = unsafe8;
                                                    i94 = i63;
                                                    obj3 = obj;
                                                    iZzi = iZzl;
                                                } else {
                                                    i22 = iZzl;
                                                    unsafe = unsafe8;
                                                    i94 = i63;
                                                    i97 = i97;
                                                    i21 = i12;
                                                    zztjVar2 = zztjVar3;
                                                    i19 = i54;
                                                    obj3 = obj;
                                                    i20 = i64;
                                                }
                                            }
                                            break;
                                        case 26:
                                            i68 = i11;
                                            zztjVar3 = zztjVar3;
                                            i69 = i28;
                                            i63 = i29;
                                            i49 = i49;
                                            unsafe8 = r12;
                                            i54 = i54;
                                            if (i26 == 2) {
                                                i61 = i68;
                                                i62 = i69;
                                                i64 = i49;
                                                iZzl = i62;
                                                if (iZzl != i62) {
                                                    zztjVar5 = zztjVar3;
                                                    i96 = i64;
                                                    i91 = i61;
                                                    i93 = i54;
                                                    unsafe9 = unsafe8;
                                                    i94 = i63;
                                                    obj3 = obj;
                                                    iZzi = iZzl;
                                                } else {
                                                    i22 = iZzl;
                                                    unsafe = unsafe8;
                                                    i94 = i63;
                                                    i97 = i97;
                                                    i21 = i12;
                                                    zztjVar2 = zztjVar3;
                                                    i19 = i54;
                                                    obj3 = obj;
                                                    i20 = i64;
                                                }
                                            } else if ((j12 & SvgConstantsKt.SPECIFIED_CLIP_RULE) == 0) {
                                                iZzm3 = zztk.zzj(bArr3, i69, zztjVar3);
                                                i74 = zztjVar3.zza;
                                                if (i74 >= 0) {
                                                    throw new zzve("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i74 == 0) {
                                                    zzvbVar.add("");
                                                } else {
                                                    i75 = iZzm3 + i74;
                                                    if (zzxf.zzd(bArr3, iZzm3, i75)) {
                                                        throw new zzve("Protocol message had invalid UTF-8.");
                                                    }
                                                    zzvbVar.add(new String(bArr3, iZzm3, i74, zzvc.zza));
                                                    iZzm3 = i75;
                                                }
                                                while (iZzm3 < i68) {
                                                    iZzj11 = zztk.zzj(bArr3, iZzm3, zztjVar3);
                                                    if (i63 == zztjVar3.zza) {
                                                        iZzl = iZzm3;
                                                        i61 = i68;
                                                        i62 = i69;
                                                        i64 = i49;
                                                        if (iZzl != i62) {
                                                            zztjVar5 = zztjVar3;
                                                            i96 = i64;
                                                            i91 = i61;
                                                            i93 = i54;
                                                            unsafe9 = unsafe8;
                                                            i94 = i63;
                                                            obj3 = obj;
                                                            iZzi = iZzl;
                                                        } else {
                                                            i22 = iZzl;
                                                            unsafe = unsafe8;
                                                            i94 = i63;
                                                            i97 = i97;
                                                            i21 = i12;
                                                            zztjVar2 = zztjVar3;
                                                            i19 = i54;
                                                            obj3 = obj;
                                                            i20 = i64;
                                                        }
                                                        break;
                                                    } else {
                                                        iZzm3 = zztk.zzj(bArr3, iZzj11, zztjVar3);
                                                        i76 = zztjVar3.zza;
                                                        if (i76 >= 0) {
                                                            throw new zzve("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i76 == 0) {
                                                            zzvbVar.add("");
                                                        } else {
                                                            i77 = iZzm3 + i76;
                                                            if (zzxf.zzd(bArr3, iZzm3, i77)) {
                                                                throw new zzve("Protocol message had invalid UTF-8.");
                                                            }
                                                            zzvbVar.add(new String(bArr3, iZzm3, i76, zzvc.zza));
                                                            iZzm3 = i77;
                                                        }
                                                    }
                                                }
                                                iZzl = iZzm3;
                                                i61 = i68;
                                                i62 = i69;
                                                i64 = i49;
                                                if (iZzl != i62) {
                                                    zztjVar5 = zztjVar3;
                                                    i96 = i64;
                                                    i91 = i61;
                                                    i93 = i54;
                                                    unsafe9 = unsafe8;
                                                    i94 = i63;
                                                    obj3 = obj;
                                                    iZzi = iZzl;
                                                } else {
                                                    i22 = iZzl;
                                                    unsafe = unsafe8;
                                                    i94 = i63;
                                                    i97 = i97;
                                                    i21 = i12;
                                                    zztjVar2 = zztjVar3;
                                                    i19 = i54;
                                                    obj3 = obj;
                                                    i20 = i64;
                                                }
                                            } else {
                                                iZzj12 = zztk.zzj(bArr3, i69, zztjVar3);
                                                i78 = zztjVar3.zza;
                                                if (i78 >= 0) {
                                                    throw new zzve("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i78 == 0) {
                                                    obj2 = "";
                                                    zzvbVar.add(obj2);
                                                } else {
                                                    obj2 = "";
                                                    zzvbVar.add(new String(bArr3, iZzj12, i78, zzvc.zza));
                                                    iZzj12 += i78;
                                                }
                                                while (iZzj12 < i68) {
                                                    iZzj13 = zztk.zzj(bArr3, iZzj12, zztjVar3);
                                                    if (i63 == zztjVar3.zza) {
                                                        iZzl = iZzj12;
                                                        i61 = i68;
                                                        i62 = i69;
                                                        i64 = i49;
                                                        if (iZzl != i62) {
                                                            zztjVar5 = zztjVar3;
                                                            i96 = i64;
                                                            i91 = i61;
                                                            i93 = i54;
                                                            unsafe9 = unsafe8;
                                                            i94 = i63;
                                                            obj3 = obj;
                                                            iZzi = iZzl;
                                                        } else {
                                                            i22 = iZzl;
                                                            unsafe = unsafe8;
                                                            i94 = i63;
                                                            i97 = i97;
                                                            i21 = i12;
                                                            zztjVar2 = zztjVar3;
                                                            i19 = i54;
                                                            obj3 = obj;
                                                            i20 = i64;
                                                        }
                                                        break;
                                                    } else {
                                                        iZzj12 = zztk.zzj(bArr3, iZzj13, zztjVar3);
                                                        i79 = zztjVar3.zza;
                                                        if (i79 >= 0) {
                                                            throw new zzve("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i79 == 0) {
                                                            zzvbVar.add(obj2);
                                                        } else {
                                                            zzvbVar.add(new String(bArr3, iZzj12, i79, zzvc.zza));
                                                            iZzj12 += i79;
                                                        }
                                                    }
                                                }
                                                iZzl = iZzj12;
                                                i61 = i68;
                                                i62 = i69;
                                                i64 = i49;
                                                if (iZzl != i62) {
                                                    zztjVar5 = zztjVar3;
                                                    i96 = i64;
                                                    i91 = i61;
                                                    i93 = i54;
                                                    unsafe9 = unsafe8;
                                                    i94 = i63;
                                                    obj3 = obj;
                                                    iZzi = iZzl;
                                                } else {
                                                    i22 = iZzl;
                                                    unsafe = unsafe8;
                                                    i94 = i63;
                                                    i97 = i97;
                                                    i21 = i12;
                                                    zztjVar2 = zztjVar3;
                                                    i19 = i54;
                                                    obj3 = obj;
                                                    i20 = i64;
                                                }
                                            }
                                            break;
                                        case 27:
                                            i61 = i11;
                                            i62 = i28;
                                            i63 = i29;
                                            if (i26 == 2) {
                                                i49 = i49;
                                                zzvzVar = this;
                                                zztjVar3 = zztjVar3;
                                                int iZzf = zztk.zzf(zzvzVar.zzv(i54), i63, bArr, i62, i11, zzvbVar, zztjVar);
                                                i54 = i54;
                                                unsafe8 = r12;
                                                i61 = i61;
                                                i62 = i62;
                                                bArr3 = bArr3;
                                                iZzl = iZzf;
                                                i64 = i49;
                                                if (iZzl != i62) {
                                                    zztjVar5 = zztjVar3;
                                                    i96 = i64;
                                                    i91 = i61;
                                                    i93 = i54;
                                                    unsafe9 = unsafe8;
                                                    i94 = i63;
                                                    obj3 = obj;
                                                    iZzi = iZzl;
                                                } else {
                                                    i22 = iZzl;
                                                    unsafe = unsafe8;
                                                    i94 = i63;
                                                    i97 = i97;
                                                    i21 = i12;
                                                    zztjVar2 = zztjVar3;
                                                    i19 = i54;
                                                    obj3 = obj;
                                                    i20 = i64;
                                                }
                                            } else {
                                                zztjVar3 = zztjVar3;
                                                zzvzVar = this;
                                                i64 = i49;
                                                i54 = i54;
                                                unsafe8 = r12;
                                                iZzl = i62;
                                                if (iZzl != i62) {
                                                    zztjVar5 = zztjVar3;
                                                    i96 = i64;
                                                    i91 = i61;
                                                    i93 = i54;
                                                    unsafe9 = unsafe8;
                                                    i94 = i63;
                                                    obj3 = obj;
                                                    iZzi = iZzl;
                                                } else {
                                                    i22 = iZzl;
                                                    unsafe = unsafe8;
                                                    i94 = i63;
                                                    i97 = i97;
                                                    i21 = i12;
                                                    zztjVar2 = zztjVar3;
                                                    i19 = i54;
                                                    obj3 = obj;
                                                    i20 = i64;
                                                }
                                            }
                                            break;
                                        case 28:
                                            i61 = i11;
                                            i62 = i28;
                                            i63 = i29;
                                            if (i26 == 2) {
                                                iZzj14 = zztk.zzj(bArr3, i62, zztjVar3);
                                                i80 = zztjVar3.zza;
                                                if (i80 >= 0) {
                                                    throw new zzve("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i80 <= bArr3.length - iZzj14) {
                                                    throw new zzve("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                if (i80 == 0) {
                                                    zzvbVar.add(zztu.zzb);
                                                } else {
                                                    zzvbVar.add(zztu.zzj(bArr3, iZzj14, i80));
                                                    iZzj14 += i80;
                                                }
                                                while (iZzj14 < i61) {
                                                    iZzj15 = zztk.zzj(bArr3, iZzj14, zztjVar3);
                                                    if (i63 == zztjVar3.zza) {
                                                        i64 = i49;
                                                        iZzl = iZzj14;
                                                        i54 = i54;
                                                        zztjVar3 = zztjVar3;
                                                        unsafe8 = r12;
                                                        zzvzVar = this;
                                                        if (iZzl != i62) {
                                                            zztjVar5 = zztjVar3;
                                                            i96 = i64;
                                                            i91 = i61;
                                                            i93 = i54;
                                                            unsafe9 = unsafe8;
                                                            i94 = i63;
                                                            obj3 = obj;
                                                            iZzi = iZzl;
                                                        } else {
                                                            i22 = iZzl;
                                                            unsafe = unsafe8;
                                                            i94 = i63;
                                                            i97 = i97;
                                                            i21 = i12;
                                                            zztjVar2 = zztjVar3;
                                                            i19 = i54;
                                                            obj3 = obj;
                                                            i20 = i64;
                                                        }
                                                        break;
                                                    } else {
                                                        iZzj14 = zztk.zzj(bArr3, iZzj15, zztjVar3);
                                                        i81 = zztjVar3.zza;
                                                        if (i81 >= 0) {
                                                            throw new zzve("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i81 <= bArr3.length - iZzj14) {
                                                            throw new zzve("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        }
                                                        if (i81 == 0) {
                                                            zzvbVar.add(zztu.zzb);
                                                        } else {
                                                            zzvbVar.add(zztu.zzj(bArr3, iZzj14, i81));
                                                            iZzj14 += i81;
                                                        }
                                                    }
                                                }
                                                i64 = i49;
                                                iZzl = iZzj14;
                                                i54 = i54;
                                                zztjVar3 = zztjVar3;
                                                unsafe8 = r12;
                                                zzvzVar = this;
                                                if (iZzl != i62) {
                                                    zztjVar5 = zztjVar3;
                                                    i96 = i64;
                                                    i91 = i61;
                                                    i93 = i54;
                                                    unsafe9 = unsafe8;
                                                    i94 = i63;
                                                    obj3 = obj;
                                                    iZzi = iZzl;
                                                } else {
                                                    i22 = iZzl;
                                                    unsafe = unsafe8;
                                                    i94 = i63;
                                                    i97 = i97;
                                                    i21 = i12;
                                                    zztjVar2 = zztjVar3;
                                                    i19 = i54;
                                                    obj3 = obj;
                                                    i20 = i64;
                                                }
                                            } else {
                                                i64 = i49;
                                                i54 = i54;
                                                zztjVar3 = zztjVar3;
                                                unsafe8 = r12;
                                                zzvzVar = this;
                                                iZzl = i62;
                                                if (iZzl != i62) {
                                                    zztjVar5 = zztjVar3;
                                                    i96 = i64;
                                                    i91 = i61;
                                                    i93 = i54;
                                                    unsafe9 = unsafe8;
                                                    i94 = i63;
                                                    obj3 = obj;
                                                    iZzi = iZzl;
                                                } else {
                                                    i22 = iZzl;
                                                    unsafe = unsafe8;
                                                    i94 = i63;
                                                    i97 = i97;
                                                    i21 = i12;
                                                    zztjVar2 = zztjVar3;
                                                    i19 = i54;
                                                    obj3 = obj;
                                                    i20 = i64;
                                                }
                                            }
                                            break;
                                        case 30:
                                        case 44:
                                            i61 = i11;
                                            i62 = i28;
                                            i63 = i29;
                                            if (i26 == 2) {
                                                iZzl2 = zztk.zzg(bArr3, i62, zzvbVar, zztjVar3);
                                            } else if (i26 == 0) {
                                                zzvzVar = this;
                                                i64 = i49;
                                                unsafe8 = r12;
                                                iZzl = i62;
                                                if (iZzl != i62) {
                                                    zztjVar5 = zztjVar3;
                                                    i96 = i64;
                                                    i91 = i61;
                                                    i93 = i54;
                                                    unsafe9 = unsafe8;
                                                    i94 = i63;
                                                    obj3 = obj;
                                                    iZzi = iZzl;
                                                } else {
                                                    i22 = iZzl;
                                                    unsafe = unsafe8;
                                                    i94 = i63;
                                                    i97 = i97;
                                                    i21 = i12;
                                                    zztjVar2 = zztjVar3;
                                                    i19 = i54;
                                                    obj3 = obj;
                                                    i20 = i64;
                                                }
                                            } else {
                                                iZzl2 = zztk.zzl(i63, bArr, i62, i11, zzvbVar, zztjVar);
                                            }
                                            zzvaVarZzu2 = zzvzVar.zzu(i54);
                                            zzwvVar2 = zzvzVar.zzl;
                                            int i106 = zzwj.zza;
                                            if (zzvaVarZzu2 != null) {
                                                i82 = iZzl2;
                                                i83 = i49;
                                            } else if (zzvbVar instanceof RandomAccess) {
                                                size = zzvbVar.size();
                                                objZzn2 = null;
                                                i84 = 0;
                                                i85 = 0;
                                                while (i84 < size) {
                                                    int i107 = iZzl2;
                                                    iIntValue2 = ((Integer) zzvbVar.get(i84)).intValue();
                                                    if (zzvaVarZzu2.zza(iIntValue2)) {
                                                        if (i84 != i85) {
                                                            zzvbVar.set(i85, Integer.valueOf(iIntValue2));
                                                        }
                                                        i85++;
                                                        i86 = i49;
                                                    } else {
                                                        i86 = i49;
                                                        objZzn2 = zzwj.zzn(obj3, i86, iIntValue2, objZzn2, zzwvVar2);
                                                    }
                                                    i84++;
                                                    iZzl2 = i107;
                                                    i49 = i86;
                                                }
                                                i82 = iZzl2;
                                                i83 = i49;
                                                if (i85 != size) {
                                                    zzvbVar.subList(i85, size).clear();
                                                }
                                            } else {
                                                i82 = iZzl2;
                                                i83 = i49;
                                                it = zzvbVar.iterator();
                                                objZzn = null;
                                                while (it.hasNext()) {
                                                    iIntValue = ((Integer) it.next()).intValue();
                                                    if (!zzvaVarZzu2.zza(iIntValue)) {
                                                        objZzn = zzwj.zzn(obj3, i83, iIntValue, objZzn, zzwvVar2);
                                                        it.remove();
                                                    }
                                                }
                                            }
                                            iZzl = i82;
                                            i64 = i83;
                                            i54 = i54;
                                            zztjVar3 = zztjVar3;
                                            unsafe8 = r12;
                                            zzvzVar = this;
                                            if (iZzl != i62) {
                                                zztjVar5 = zztjVar3;
                                                i96 = i64;
                                                i91 = i61;
                                                i93 = i54;
                                                unsafe9 = unsafe8;
                                                i94 = i63;
                                                obj3 = obj;
                                                iZzi = iZzl;
                                            } else {
                                                i22 = iZzl;
                                                unsafe = unsafe8;
                                                i94 = i63;
                                                i97 = i97;
                                                i21 = i12;
                                                zztjVar2 = zztjVar3;
                                                i19 = i54;
                                                obj3 = obj;
                                                i20 = i64;
                                            }
                                            break;
                                        case 33:
                                        case 47:
                                            i61 = i11;
                                            i62 = i28;
                                            i63 = i29;
                                            if (i26 == 2) {
                                                if (i26 == 0) {
                                                    zzuxVar3 = (zzux) zzvbVar;
                                                    iZzl = zztk.zzj(bArr3, i62, zztjVar3);
                                                    zzuxVar3.zzf(zzty.zzb(zztjVar3.zza));
                                                    while (iZzl < i61) {
                                                        iZzj16 = zztk.zzj(bArr3, iZzl, zztjVar3);
                                                        if (i63 == zztjVar3.zza) {
                                                            iZzl = zztk.zzj(bArr3, iZzj16, zztjVar3);
                                                            zzuxVar3.zzf(zzty.zzb(zztjVar3.zza));
                                                        }
                                                    }
                                                }
                                                i64 = i49;
                                                unsafe8 = r12;
                                                iZzl = i62;
                                                if (iZzl != i62) {
                                                    zztjVar5 = zztjVar3;
                                                    i96 = i64;
                                                    i91 = i61;
                                                    i93 = i54;
                                                    unsafe9 = unsafe8;
                                                    i94 = i63;
                                                    obj3 = obj;
                                                    iZzi = iZzl;
                                                } else {
                                                    i22 = iZzl;
                                                    unsafe = unsafe8;
                                                    i94 = i63;
                                                    i97 = i97;
                                                    i21 = i12;
                                                    zztjVar2 = zztjVar3;
                                                    i19 = i54;
                                                    obj3 = obj;
                                                    i20 = i64;
                                                }
                                            } else {
                                                zzuxVar4 = (zzux) zzvbVar;
                                                iZzj17 = zztk.zzj(bArr3, i62, zztjVar3);
                                                i87 = zztjVar3.zza + iZzj17;
                                                while (iZzj17 < i87) {
                                                    iZzj17 = zztk.zzj(bArr3, iZzj17, zztjVar3);
                                                    zzuxVar4.zzf(zzty.zzb(zztjVar3.zza));
                                                }
                                                if (iZzj17 != i87) {
                                                    throw new zzve("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                iZzl = iZzj17;
                                            }
                                            i64 = i49;
                                            unsafe8 = unsafe3;
                                            if (iZzl != i62) {
                                                zztjVar5 = zztjVar3;
                                                i96 = i64;
                                                i91 = i61;
                                                i93 = i54;
                                                unsafe9 = unsafe8;
                                                i94 = i63;
                                                obj3 = obj;
                                                iZzi = iZzl;
                                            } else {
                                                i22 = iZzl;
                                                unsafe = unsafe8;
                                                i94 = i63;
                                                i97 = i97;
                                                i21 = i12;
                                                zztjVar2 = zztjVar3;
                                                i19 = i54;
                                                obj3 = obj;
                                                i20 = i64;
                                            }
                                            break;
                                        case 34:
                                        case 48:
                                            i61 = i11;
                                            i63 = i29;
                                            if (i26 == 2) {
                                                i62 = i28;
                                                if (i26 == 0) {
                                                    zzvlVar5 = (zzvl) zzvbVar;
                                                    iZzl = zztk.zzm(bArr3, i62, zztjVar3);
                                                    zzvlVar5.zzf(zzty.zzc(zztjVar3.zzb));
                                                    while (iZzl < i61) {
                                                        iZzj18 = zztk.zzj(bArr3, iZzl, zztjVar3);
                                                        if (i63 == zztjVar3.zza) {
                                                            iZzl = zztk.zzm(bArr3, iZzj18, zztjVar3);
                                                            zzvlVar5.zzf(zzty.zzc(zztjVar3.zzb));
                                                        }
                                                    }
                                                }
                                                i64 = i49;
                                                unsafe8 = r12;
                                                iZzl = i62;
                                                if (iZzl != i62) {
                                                    zztjVar5 = zztjVar3;
                                                    i96 = i64;
                                                    i91 = i61;
                                                    i93 = i54;
                                                    unsafe9 = unsafe8;
                                                    i94 = i63;
                                                    obj3 = obj;
                                                    iZzi = iZzl;
                                                } else {
                                                    i22 = iZzl;
                                                    unsafe = unsafe8;
                                                    i94 = i63;
                                                    i97 = i97;
                                                    i21 = i12;
                                                    zztjVar2 = zztjVar3;
                                                    i19 = i54;
                                                    obj3 = obj;
                                                    i20 = i64;
                                                }
                                            } else {
                                                zzvlVar6 = (zzvl) zzvbVar;
                                                i62 = i28;
                                                iZzj17 = zztk.zzj(bArr3, i62, zztjVar3);
                                                i88 = zztjVar3.zza + iZzj17;
                                                while (iZzj17 < i88) {
                                                    iZzj17 = zztk.zzm(bArr3, iZzj17, zztjVar3);
                                                    zzvlVar6.zzf(zzty.zzc(zztjVar3.zzb));
                                                }
                                                if (iZzj17 != i88) {
                                                    throw new zzve("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                }
                                                iZzl = iZzj17;
                                            }
                                            i64 = i49;
                                            unsafe8 = unsafe3;
                                            if (iZzl != i62) {
                                                zztjVar5 = zztjVar3;
                                                i96 = i64;
                                                i91 = i61;
                                                i93 = i54;
                                                unsafe9 = unsafe8;
                                                i94 = i63;
                                                obj3 = obj;
                                                iZzi = iZzl;
                                            } else {
                                                i22 = iZzl;
                                                unsafe = unsafe8;
                                                i94 = i63;
                                                i97 = i97;
                                                i21 = i12;
                                                zztjVar2 = zztjVar3;
                                                i19 = i54;
                                                obj3 = obj;
                                                i20 = i64;
                                            }
                                            break;
                                        default:
                                            if (i26 == 3) {
                                                i89 = (i29 & (-8)) | 4;
                                                zzwhVarZzv = zzvzVar.zzv(i54);
                                                iZzl = zztk.zzd(zzwhVarZzv, bArr, i28, i11, i89, zztjVar);
                                                zzvbVar.add(zztjVar3.zzc);
                                                i61 = i11;
                                                while (true) {
                                                    if (iZzl < i61) {
                                                        iZzj19 = zztk.zzj(bArr3, iZzl, zztjVar3);
                                                        i90 = i29;
                                                        if (i90 == zztjVar3.zza) {
                                                            iZzl = zztk.zzd(zzwhVarZzv, bArr, iZzj19, i11, i89, zztjVar);
                                                            zzvbVar.add(zztjVar3.zzc);
                                                            i29 = i90;
                                                        } else {
                                                            i63 = i90;
                                                        }
                                                    } else {
                                                        i63 = i29;
                                                    }
                                                }
                                                i62 = i28;
                                                i64 = i49;
                                                unsafe8 = unsafe3;
                                                if (iZzl != i62) {
                                                    zztjVar5 = zztjVar3;
                                                    i96 = i64;
                                                    i91 = i61;
                                                    i93 = i54;
                                                    unsafe9 = unsafe8;
                                                    i94 = i63;
                                                    obj3 = obj;
                                                    iZzi = iZzl;
                                                } else {
                                                    i22 = iZzl;
                                                    unsafe = unsafe8;
                                                    i94 = i63;
                                                    i97 = i97;
                                                    i21 = i12;
                                                    zztjVar2 = zztjVar3;
                                                    i19 = i54;
                                                    obj3 = obj;
                                                    i20 = i64;
                                                }
                                            } else {
                                                i63 = i29;
                                                i61 = i11;
                                                i62 = i28;
                                                i64 = i49;
                                                unsafe8 = r12;
                                                iZzl = i62;
                                                if (iZzl != i62) {
                                                    zztjVar5 = zztjVar3;
                                                    i96 = i64;
                                                    i91 = i61;
                                                    i93 = i54;
                                                    unsafe9 = unsafe8;
                                                    i94 = i63;
                                                    obj3 = obj;
                                                    iZzi = iZzl;
                                                } else {
                                                    i22 = iZzl;
                                                    unsafe = unsafe8;
                                                    i94 = i63;
                                                    i97 = i97;
                                                    i21 = i12;
                                                    zztjVar2 = zztjVar3;
                                                    i19 = i54;
                                                    obj3 = obj;
                                                    i20 = i64;
                                                }
                                            }
                                            break;
                                    }
                                } else {
                                    unsafe4 = unsafe3;
                                    i51 = i28;
                                    i52 = i29;
                                    i50 = i54;
                                    i53 = i49;
                                    if (iZzr == 50) {
                                        obj3 = obj;
                                        zztjVar2 = zztjVar;
                                        unsafe6 = zzb;
                                        j11 = iArr[i50 + 2] & 1048575;
                                        switch (iZzr) {
                                            case 51:
                                                unsafe = unsafe4;
                                                zztjVar2 = zztjVar2;
                                                i20 = i53;
                                                i55 = i51;
                                                i56 = i52;
                                                i57 = i50;
                                                if (i26 == 1) {
                                                    iZzi = i55 + 8;
                                                    unsafe6.putObject(obj3, j10, Double.valueOf(Double.longBitsToDouble(zztk.zzq(bArr3, i55))));
                                                    unsafe6.putInt(obj3, j11, i20);
                                                } else {
                                                    iZzi = i55;
                                                }
                                                if (iZzi != i55) {
                                                    i55 = i55;
                                                    i91 = i11;
                                                    i96 = i20;
                                                    zztjVar5 = zztjVar2;
                                                    i93 = i57;
                                                    i94 = i56;
                                                    unsafe9 = unsafe;
                                                } else {
                                                    i55 = i55;
                                                    i22 = iZzi;
                                                    i94 = i56;
                                                    i19 = i57;
                                                }
                                                break;
                                            case 52:
                                                unsafe = unsafe4;
                                                zztjVar2 = zztjVar2;
                                                i20 = i53;
                                                i55 = i51;
                                                i56 = i52;
                                                i57 = i50;
                                                if (i26 == 5) {
                                                    iZzi = i55 + 4;
                                                    unsafe6.putObject(obj3, j10, Float.valueOf(Float.intBitsToFloat(zztk.zzc(bArr3, i55))));
                                                    unsafe6.putInt(obj3, j11, i20);
                                                } else {
                                                    iZzi = i55;
                                                }
                                                if (iZzi != i55) {
                                                    i55 = i55;
                                                    i91 = i11;
                                                    i96 = i20;
                                                    zztjVar5 = zztjVar2;
                                                    i93 = i57;
                                                    i94 = i56;
                                                    unsafe9 = unsafe;
                                                } else {
                                                    i55 = i55;
                                                    i22 = iZzi;
                                                    i94 = i56;
                                                    i19 = i57;
                                                }
                                                break;
                                            case 53:
                                            case 54:
                                                unsafe = unsafe4;
                                                zztjVar2 = zztjVar2;
                                                i20 = i53;
                                                i55 = i51;
                                                i56 = i52;
                                                i57 = i50;
                                                if (i26 == 0) {
                                                    iZzm = zztk.zzm(bArr3, i55, zztjVar2);
                                                    unsafe6.putObject(obj3, j10, Long.valueOf(zztjVar2.zzb));
                                                    unsafe6.putInt(obj3, j11, i20);
                                                    iZzi = iZzm;
                                                } else {
                                                    iZzi = i55;
                                                }
                                                if (iZzi != i55) {
                                                    i55 = i55;
                                                    i91 = i11;
                                                    i96 = i20;
                                                    zztjVar5 = zztjVar2;
                                                    i93 = i57;
                                                    i94 = i56;
                                                    unsafe9 = unsafe;
                                                } else {
                                                    i55 = i55;
                                                    i22 = iZzi;
                                                    i94 = i56;
                                                    i19 = i57;
                                                }
                                                break;
                                            case 55:
                                            case 62:
                                                unsafe = unsafe4;
                                                zztjVar2 = zztjVar2;
                                                i20 = i53;
                                                i55 = i51;
                                                i56 = i52;
                                                i57 = i50;
                                                if (i26 == 0) {
                                                    iZzj2 = zztk.zzj(bArr3, i55, zztjVar2);
                                                    unsafe6.putObject(obj3, j10, Integer.valueOf(zztjVar2.zza));
                                                    unsafe6.putInt(obj3, j11, i20);
                                                    iZzi = iZzj2;
                                                } else {
                                                    iZzi = i55;
                                                }
                                                if (iZzi != i55) {
                                                    i55 = i55;
                                                    i91 = i11;
                                                    i96 = i20;
                                                    zztjVar5 = zztjVar2;
                                                    i93 = i57;
                                                    i94 = i56;
                                                    unsafe9 = unsafe;
                                                } else {
                                                    i55 = i55;
                                                    i22 = iZzi;
                                                    i94 = i56;
                                                    i19 = i57;
                                                }
                                                break;
                                            case 56:
                                            case 65:
                                                unsafe = unsafe4;
                                                zztjVar2 = zztjVar2;
                                                i20 = i53;
                                                i55 = i51;
                                                i56 = i52;
                                                i57 = i50;
                                                if (i26 == 1) {
                                                    iZzi = i55 + 8;
                                                    unsafe6.putObject(obj3, j10, Long.valueOf(zztk.zzq(bArr3, i55)));
                                                    unsafe6.putInt(obj3, j11, i20);
                                                } else {
                                                    iZzi = i55;
                                                }
                                                if (iZzi != i55) {
                                                    i55 = i55;
                                                    i91 = i11;
                                                    i96 = i20;
                                                    zztjVar5 = zztjVar2;
                                                    i93 = i57;
                                                    i94 = i56;
                                                    unsafe9 = unsafe;
                                                } else {
                                                    i55 = i55;
                                                    i22 = iZzi;
                                                    i94 = i56;
                                                    i19 = i57;
                                                }
                                                break;
                                            case 57:
                                            case 64:
                                                unsafe = unsafe4;
                                                zztjVar2 = zztjVar2;
                                                i20 = i53;
                                                i55 = i51;
                                                i56 = i52;
                                                i57 = i50;
                                                if (i26 == 5) {
                                                    iZzi = i55 + 4;
                                                    unsafe6.putObject(obj3, j10, Integer.valueOf(zztk.zzc(bArr3, i55)));
                                                    unsafe6.putInt(obj3, j11, i20);
                                                } else {
                                                    iZzi = i55;
                                                }
                                                if (iZzi != i55) {
                                                    i55 = i55;
                                                    i91 = i11;
                                                    i96 = i20;
                                                    zztjVar5 = zztjVar2;
                                                    i93 = i57;
                                                    i94 = i56;
                                                    unsafe9 = unsafe;
                                                } else {
                                                    i55 = i55;
                                                    i22 = iZzi;
                                                    i94 = i56;
                                                    i19 = i57;
                                                }
                                                break;
                                            case 58:
                                                unsafe = unsafe4;
                                                zztjVar2 = zztjVar2;
                                                i20 = i53;
                                                i55 = i51;
                                                i56 = i52;
                                                i57 = i50;
                                                if (i26 == 0) {
                                                    iZzm = zztk.zzm(bArr3, i55, zztjVar2);
                                                    if (zztjVar2.zzb != 0) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    unsafe6.putObject(obj3, j10, Boolean.valueOf(z11));
                                                    unsafe6.putInt(obj3, j11, i20);
                                                    iZzi = iZzm;
                                                } else {
                                                    iZzi = i55;
                                                }
                                                if (iZzi != i55) {
                                                    i55 = i55;
                                                    i91 = i11;
                                                    i96 = i20;
                                                    zztjVar5 = zztjVar2;
                                                    i93 = i57;
                                                    i94 = i56;
                                                    unsafe9 = unsafe;
                                                } else {
                                                    i55 = i55;
                                                    i22 = iZzi;
                                                    i94 = i56;
                                                    i19 = i57;
                                                }
                                                break;
                                            case 59:
                                                unsafe = unsafe4;
                                                i56 = i52;
                                                zztjVar2 = zztjVar2;
                                                i57 = i50;
                                                i20 = i53;
                                                i55 = i51;
                                                if (i26 == 2) {
                                                    iZzj2 = zztk.zzj(bArr3, i55, zztjVar2);
                                                    i58 = zztjVar2.zza;
                                                    if (i58 == 0) {
                                                        unsafe6.putObject(obj3, j10, "");
                                                    } else {
                                                        i59 = iZzj2 + i58;
                                                        if ((i27 & PKIFailureInfo.duplicateCertReq) == 0 && !zzxf.zzd(bArr3, iZzj2, i59)) {
                                                            throw new zzve("Protocol message had invalid UTF-8.");
                                                        }
                                                        unsafe6.putObject(obj3, j10, new String(bArr3, iZzj2, i58, zzvc.zza));
                                                        iZzj2 = i59;
                                                    }
                                                    unsafe6.putInt(obj3, j11, i20);
                                                    iZzi = iZzj2;
                                                    if (iZzi != i55) {
                                                        i55 = i55;
                                                        i91 = i11;
                                                        i96 = i20;
                                                        zztjVar5 = zztjVar2;
                                                        i93 = i57;
                                                        i94 = i56;
                                                        unsafe9 = unsafe;
                                                    } else {
                                                        i55 = i55;
                                                        i22 = iZzi;
                                                        i94 = i56;
                                                        i19 = i57;
                                                    }
                                                }
                                                i56 = i56;
                                                iZzi = i55;
                                                if (iZzi != i55) {
                                                    i55 = i55;
                                                    i91 = i11;
                                                    i96 = i20;
                                                    zztjVar5 = zztjVar2;
                                                    i93 = i57;
                                                    i94 = i56;
                                                    unsafe9 = unsafe;
                                                } else {
                                                    i55 = i55;
                                                    i22 = iZzi;
                                                    i94 = i56;
                                                    i19 = i57;
                                                }
                                                break;
                                            case 60:
                                                unsafe = unsafe4;
                                                i56 = i52;
                                                i57 = i50;
                                                i20 = i53;
                                                i55 = i51;
                                                if (i26 == 2) {
                                                    Object objZzy = zzvzVar.zzy(obj3, i20, i57);
                                                    int iZzo2 = zztk.zzo(objZzy, zzvzVar.zzv(i57), bArr, i55, i11, zztjVar);
                                                    zzvzVar.zzG(obj3, i20, i57, objZzy);
                                                    iZzi = iZzo2;
                                                    i56 = i56;
                                                    if (iZzi != i55) {
                                                        i55 = i55;
                                                        i91 = i11;
                                                        i96 = i20;
                                                        zztjVar5 = zztjVar2;
                                                        i93 = i57;
                                                        i94 = i56;
                                                        unsafe9 = unsafe;
                                                    } else {
                                                        i55 = i55;
                                                        i22 = iZzi;
                                                        i94 = i56;
                                                        i19 = i57;
                                                    }
                                                }
                                                zztjVar2 = zztjVar2;
                                                i56 = i56;
                                                iZzi = i55;
                                                if (iZzi != i55) {
                                                    i55 = i55;
                                                    i91 = i11;
                                                    i96 = i20;
                                                    zztjVar5 = zztjVar2;
                                                    i93 = i57;
                                                    i94 = i56;
                                                    unsafe9 = unsafe;
                                                } else {
                                                    i55 = i55;
                                                    i22 = iZzi;
                                                    i94 = i56;
                                                    i19 = i57;
                                                }
                                                break;
                                            case 61:
                                                unsafe = unsafe4;
                                                i56 = i52;
                                                i57 = i50;
                                                i20 = i53;
                                                i55 = i51;
                                                if (i26 == 2) {
                                                    iZza2 = zztk.zza(bArr3, i55, zztjVar2);
                                                    unsafe6.putObject(obj3, j10, zztjVar2.zzc);
                                                    unsafe6.putInt(obj3, j11, i20);
                                                    iZzi = iZza2;
                                                    i56 = i56;
                                                    if (iZzi != i55) {
                                                        i55 = i55;
                                                        i91 = i11;
                                                        i96 = i20;
                                                        zztjVar5 = zztjVar2;
                                                        i93 = i57;
                                                        i94 = i56;
                                                        unsafe9 = unsafe;
                                                    } else {
                                                        i55 = i55;
                                                        i22 = iZzi;
                                                        i94 = i56;
                                                        i19 = i57;
                                                    }
                                                }
                                                zztjVar2 = zztjVar2;
                                                i56 = i56;
                                                iZzi = i55;
                                                if (iZzi != i55) {
                                                    i55 = i55;
                                                    i91 = i11;
                                                    i96 = i20;
                                                    zztjVar5 = zztjVar2;
                                                    i93 = i57;
                                                    i94 = i56;
                                                    unsafe9 = unsafe;
                                                } else {
                                                    i55 = i55;
                                                    i22 = iZzi;
                                                    i94 = i56;
                                                    i19 = i57;
                                                }
                                                break;
                                            case 63:
                                                unsafe = unsafe4;
                                                i20 = i53;
                                                i55 = i51;
                                                i56 = i52;
                                                i57 = i50;
                                                if (i26 == 0) {
                                                    iZza2 = zztk.zzj(bArr3, i55, zztjVar2);
                                                    i60 = zztjVar2.zza;
                                                    zzvaVarZzu = zzvzVar.zzu(i57);
                                                    if (zzvaVarZzu != null || zzvaVarZzu.zza(i60)) {
                                                        i56 = i56;
                                                        unsafe6.putObject(obj3, j10, Integer.valueOf(i60));
                                                        unsafe6.putInt(obj3, j11, i20);
                                                    } else {
                                                        i56 = i56;
                                                        zzd(obj).zzj(i56, Long.valueOf(i60));
                                                    }
                                                    iZzi = iZza2;
                                                    i56 = i56;
                                                    if (iZzi != i55) {
                                                        i55 = i55;
                                                        i91 = i11;
                                                        i96 = i20;
                                                        zztjVar5 = zztjVar2;
                                                        i93 = i57;
                                                        i94 = i56;
                                                        unsafe9 = unsafe;
                                                    } else {
                                                        i55 = i55;
                                                        i22 = iZzi;
                                                        i94 = i56;
                                                        i19 = i57;
                                                    }
                                                }
                                                zztjVar2 = zztjVar2;
                                                iZzi = i55;
                                                if (iZzi != i55) {
                                                    i55 = i55;
                                                    i91 = i11;
                                                    i96 = i20;
                                                    zztjVar5 = zztjVar2;
                                                    i93 = i57;
                                                    i94 = i56;
                                                    unsafe9 = unsafe;
                                                } else {
                                                    i55 = i55;
                                                    i22 = iZzi;
                                                    i94 = i56;
                                                    i19 = i57;
                                                }
                                                break;
                                            case 66:
                                                unsafe = unsafe4;
                                                i56 = i52;
                                                i57 = i50;
                                                i20 = i53;
                                                if (i26 == 0) {
                                                    i55 = i51;
                                                    int iZzj21 = zztk.zzj(bArr3, i55, zztjVar2);
                                                    unsafe6.putObject(obj3, j10, Integer.valueOf(zzty.zzb(zztjVar2.zza)));
                                                    unsafe6.putInt(obj3, j11, i20);
                                                    iZzi = iZzj21;
                                                    zztjVar2 = zztjVar2;
                                                    if (iZzi != i55) {
                                                        i55 = i55;
                                                        i91 = i11;
                                                        i96 = i20;
                                                        zztjVar5 = zztjVar2;
                                                        i93 = i57;
                                                        i94 = i56;
                                                        unsafe9 = unsafe;
                                                    } else {
                                                        i55 = i55;
                                                        i22 = iZzi;
                                                        i94 = i56;
                                                        i19 = i57;
                                                    }
                                                } else {
                                                    i55 = i51;
                                                    zztjVar2 = zztjVar2;
                                                    iZzi = i55;
                                                    if (iZzi != i55) {
                                                        i55 = i55;
                                                        i91 = i11;
                                                        i96 = i20;
                                                        zztjVar5 = zztjVar2;
                                                        i93 = i57;
                                                        i94 = i56;
                                                        unsafe9 = unsafe;
                                                    } else {
                                                        i55 = i55;
                                                        i22 = iZzi;
                                                        i94 = i56;
                                                        i19 = i57;
                                                    }
                                                }
                                                break;
                                            case 67:
                                                unsafe = unsafe4;
                                                i20 = i53;
                                                i55 = i51;
                                                i56 = i52;
                                                i57 = i50;
                                                if (i26 == 0) {
                                                    int iZzm5 = zztk.zzm(bArr3, i55, zztjVar2);
                                                    unsafe6.putObject(obj3, j10, Long.valueOf(zzty.zzc(zztjVar2.zzb)));
                                                    unsafe6.putInt(obj3, j11, i20);
                                                    iZzi = iZzm5;
                                                    zztjVar2 = zztjVar2;
                                                } else {
                                                    zztjVar2 = zztjVar2;
                                                    iZzi = i55;
                                                }
                                                if (iZzi != i55) {
                                                    i55 = i55;
                                                    i91 = i11;
                                                    i96 = i20;
                                                    zztjVar5 = zztjVar2;
                                                    i93 = i57;
                                                    i94 = i56;
                                                    unsafe9 = unsafe;
                                                } else {
                                                    i55 = i55;
                                                    i22 = iZzi;
                                                    i94 = i56;
                                                    i19 = i57;
                                                }
                                                break;
                                            case 68:
                                                if (i26 == 3) {
                                                    int i108 = (i52 & (-8)) | 4;
                                                    Object objZzy2 = zzvzVar.zzy(obj3, i53, i50);
                                                    i55 = i51;
                                                    i56 = i52;
                                                    i57 = i50;
                                                    unsafe = unsafe4;
                                                    iZzi = zztk.zzn(objZzy2, zzvzVar.zzv(i50), bArr, i55, i11, i108, zztjVar);
                                                    zzvzVar.zzG(obj3, i53, i57, objZzy2);
                                                    bArr3 = bArr3;
                                                    i20 = i53;
                                                    zztjVar2 = zztjVar2;
                                                    if (iZzi != i55) {
                                                        i55 = i55;
                                                        i91 = i11;
                                                        i96 = i20;
                                                        zztjVar5 = zztjVar2;
                                                        i93 = i57;
                                                        i94 = i56;
                                                        unsafe9 = unsafe;
                                                    } else {
                                                        i55 = i55;
                                                        i22 = iZzi;
                                                        i94 = i56;
                                                        i19 = i57;
                                                    }
                                                } else {
                                                    unsafe = unsafe4;
                                                    i56 = i52;
                                                    i57 = i50;
                                                    zztjVar2 = zztjVar2;
                                                    i20 = i53;
                                                    i55 = i51;
                                                    iZzi = i55;
                                                    if (iZzi != i55) {
                                                        i55 = i55;
                                                        i91 = i11;
                                                        i96 = i20;
                                                        zztjVar5 = zztjVar2;
                                                        i93 = i57;
                                                        i94 = i56;
                                                        unsafe9 = unsafe;
                                                    } else {
                                                        i55 = i55;
                                                        i22 = iZzi;
                                                        i94 = i56;
                                                        i19 = i57;
                                                    }
                                                }
                                                break;
                                            default:
                                                unsafe = unsafe4;
                                                zztjVar2 = zztjVar2;
                                                i20 = i53;
                                                i55 = i51;
                                                i56 = i52;
                                                i57 = i50;
                                                iZzi = i55;
                                                if (iZzi != i55) {
                                                    i55 = i55;
                                                    i91 = i11;
                                                    i96 = i20;
                                                    zztjVar5 = zztjVar2;
                                                    i93 = i57;
                                                    i94 = i56;
                                                    unsafe9 = unsafe;
                                                } else {
                                                    i55 = i55;
                                                    i22 = iZzi;
                                                    i94 = i56;
                                                    i19 = i57;
                                                }
                                                break;
                                        }
                                    } else {
                                        if (i26 == 2) {
                                            unsafe5 = zzb;
                                            Object objZzw = zzvzVar.zzw(i50);
                                            object = unsafe5.getObject(obj, j10);
                                            if (!((zzvq) object).zze()) {
                                                zzvq zzvqVarZzb = zzvq.zza().zzb();
                                                zzvr.zza(zzvqVarZzb, object);
                                                unsafe5.putObject(obj, j10, zzvqVarZzb);
                                            }
                                            throw null;
                                        }
                                        obj3 = obj;
                                        zztjVar4 = zztjVar;
                                        i22 = i51;
                                        unsafe = unsafe4;
                                        zztjVar2 = zztjVar4;
                                        i19 = i50;
                                        i20 = i53;
                                        i94 = i52;
                                    }
                                    i21 = i12;
                                }
                                bArr4 = bArr3;
                            } else if (i26 == 2) {
                                zzvbVarZzd = (zzvb) unsafe3.getObject(obj3, j10);
                                if (!zzvbVarZzd.zzc()) {
                                    int size3 = zzvbVarZzd.size();
                                    zzvbVarZzd = zzvbVarZzd.zzd(size3 != 0 ? size3 + size3 : 10);
                                    unsafe3.putObject(obj3, j10, zzvbVarZzd);
                                }
                                iZzi = zztk.zzf(zzvzVar.zzv(i48), i29, bArr, i28, i11, zzvbVarZzd, zztjVar);
                                i91 = i11;
                                i93 = i48;
                                i12 = i12;
                                i97 = i97;
                                i94 = i29;
                                i95 = i95;
                                i96 = i49;
                                bArr4 = bArr;
                                i92 = 0;
                                unsafe9 = unsafe3;
                                zztjVar5 = zztjVar3;
                            } else {
                                i95 = i95;
                                zztjVar4 = zztjVar3;
                                i50 = i48;
                                i51 = i28;
                                i52 = i29;
                                unsafe4 = unsafe3;
                                i53 = i49;
                                i22 = i51;
                                unsafe = unsafe4;
                                zztjVar2 = zztjVar4;
                                i19 = i50;
                                i20 = i53;
                                i94 = i52;
                                i21 = i12;
                            }
                        }
                    }
                    if (i94 == i21 || i21 == 0) {
                        if (zzvzVar.zzh) {
                            zzuhVar = zztjVar2.zzd;
                            int i109 = zzuh.zzb;
                            int i110 = zzwe.zza;
                            if (zzuhVar != zzuh.zza) {
                                zzvw zzvwVar = zzvzVar.zzg;
                                zzwvVar = zzvzVar.zzl;
                                zzuuVarZzb = zzuhVar.zzb(zzvwVar, i20);
                                if (zzuuVarZzb == null) {
                                    iZzi = zztk.zzi(i94, bArr, i22, i11, zzd(obj), zztjVar);
                                    i23 = i94;
                                    i24 = i21;
                                    i25 = i11;
                                } else {
                                    zzus zzusVar = (zzus) obj3;
                                    zzusVar.zzb();
                                    i23 = i94;
                                    iZzi = zztk.zzb(i94, bArr, i22, i11, zzusVar, zzuuVarZzb, zzwvVar, zztjVar);
                                    i24 = i21;
                                    i25 = i11;
                                }
                            } else {
                                i23 = i94;
                                i24 = i21;
                                i25 = i11;
                                iZzi = zztk.zzi(i23, bArr, i22, i11, zzd(obj), zztjVar);
                            }
                        } else {
                            i23 = i94;
                            i24 = i21;
                            i25 = i11;
                            iZzi = zztk.zzi(i23, bArr, i22, i11, zzd(obj), zztjVar);
                        }
                        bArr4 = bArr;
                        zztjVar5 = zztjVar;
                        i12 = i24;
                        i91 = i25;
                        i96 = i20;
                        i92 = i92;
                        i93 = i19;
                        i97 = i97;
                        i94 = i23;
                        i95 = i95;
                        unsafe9 = unsafe;
                    } else {
                        i13 = i11;
                        iZzi = i22;
                        i14 = i21;
                        i97 = i97;
                        i16 = i95;
                        i15 = 1048575;
                    }
                }
                i18 = iZzq;
                i17 = -1;
                if (i18 == i17) {
                    i92 = i92;
                    i19 = i92;
                    unsafe = unsafe9;
                    i95 = i95;
                    i97 = i97;
                    i20 = i99;
                    zztjVar2 = zztjVar5;
                    i21 = i12;
                    i22 = iZzk;
                } else {
                    i26 = i94 & 7;
                    iArr = zzvzVar.zzc;
                    i27 = iArr[i18 + 1];
                    iZzr = zzr(i27);
                    j10 = i27 & 1048575;
                    i28 = iZzk;
                    i29 = i94;
                    if (iZzr <= 17) {
                        int i1010 = iArr[i18 + 2];
                        i30 = 1 << (i1010 >>> 20);
                        i31 = 1048575;
                        i32 = i1010 & 1048575;
                        if (i32 != i97) {
                            if (i97 != 1048575) {
                                unsafe9.putInt(obj3, i97, i95);
                                i31 = 1048575;
                            }
                            if (i32 == i31) {
                                i95 = 0;
                            } else {
                                i95 = unsafe9.getInt(obj3, i32);
                            }
                            i33 = i32;
                        } else {
                            i33 = i97;
                        }
                        switch (iZzr) {
                            case 0:
                                zztjVar2 = zztjVar5;
                                unsafe2 = unsafe9;
                                i34 = i18;
                                i35 = i33;
                                i36 = i99;
                                i37 = i28;
                                i38 = 0;
                                bArr2 = bArr;
                                if (i26 == 1) {
                                    iZzi = i37 + 8;
                                    i95 |= i30;
                                    zzxc.zzo(obj3, j10, Double.longBitsToDouble(zztk.zzq(bArr2, i37)));
                                    i91 = i11;
                                    i12 = i12;
                                    unsafe9 = unsafe2;
                                    zztjVar5 = zztjVar2;
                                    i92 = i38;
                                    i94 = i29;
                                    i96 = i36;
                                    i97 = i35;
                                    bArr4 = bArr2;
                                    i93 = i34;
                                } else {
                                    i97 = i35;
                                    i22 = i37;
                                    unsafe = unsafe2;
                                    i95 = i95;
                                    i19 = i34;
                                    i92 = i38;
                                    i94 = i29;
                                    i20 = i36;
                                    i21 = i12;
                                }
                                break;
                            case 1:
                                zztjVar2 = zztjVar5;
                                unsafe2 = unsafe9;
                                i34 = i18;
                                i35 = i33;
                                i36 = i99;
                                i37 = i28;
                                i38 = 0;
                                bArr2 = bArr;
                                if (i26 == 5) {
                                    iZzi = i37 + 4;
                                    i95 |= i30;
                                    zzxc.zzp(obj3, j10, Float.intBitsToFloat(zztk.zzc(bArr2, i37)));
                                    i91 = i11;
                                    i12 = i12;
                                    unsafe9 = unsafe2;
                                    zztjVar5 = zztjVar2;
                                    i92 = i38;
                                    i94 = i29;
                                    i96 = i36;
                                    i97 = i35;
                                    bArr4 = bArr2;
                                    i93 = i34;
                                } else {
                                    i97 = i35;
                                    i22 = i37;
                                    unsafe = unsafe2;
                                    i95 = i95;
                                    i19 = i34;
                                    i92 = i38;
                                    i94 = i29;
                                    i20 = i36;
                                    i21 = i12;
                                }
                                break;
                            case 2:
                            case 3:
                                zztjVar2 = zztjVar5;
                                unsafe2 = unsafe9;
                                i34 = i18;
                                i35 = i33;
                                i36 = i99;
                                i37 = i28;
                                i38 = 0;
                                bArr2 = bArr;
                                if (i26 == 0) {
                                    i95 |= i30;
                                    iZzi = zztk.zzm(bArr2, i37, zztjVar2);
                                    unsafe2.putLong(obj, j10, zztjVar2.zzb);
                                    i91 = i11;
                                    i12 = i12;
                                    unsafe9 = unsafe2;
                                    zztjVar5 = zztjVar2;
                                    i92 = i38;
                                    i94 = i29;
                                    i96 = i36;
                                    i97 = i35;
                                    bArr4 = bArr2;
                                    i93 = i34;
                                } else {
                                    i97 = i35;
                                    i22 = i37;
                                    unsafe = unsafe2;
                                    i95 = i95;
                                    i19 = i34;
                                    i92 = i38;
                                    i94 = i29;
                                    i20 = i36;
                                    i21 = i12;
                                }
                                break;
                            case 4:
                            case 11:
                                zztjVar2 = zztjVar5;
                                unsafe2 = unsafe9;
                                i34 = i18;
                                i35 = i33;
                                i36 = i99;
                                i37 = i28;
                                i38 = 0;
                                bArr2 = bArr;
                                if (i26 == 0) {
                                    i95 |= i30;
                                    iZzi = zztk.zzj(bArr2, i37, zztjVar2);
                                    unsafe2.putInt(obj3, j10, zztjVar2.zza);
                                    i91 = i11;
                                    i12 = i12;
                                    unsafe9 = unsafe2;
                                    zztjVar5 = zztjVar2;
                                    i92 = i38;
                                    i94 = i29;
                                    i96 = i36;
                                    i97 = i35;
                                    bArr4 = bArr2;
                                    i93 = i34;
                                } else {
                                    i97 = i35;
                                    i22 = i37;
                                    unsafe = unsafe2;
                                    i95 = i95;
                                    i19 = i34;
                                    i92 = i38;
                                    i94 = i29;
                                    i20 = i36;
                                    i21 = i12;
                                }
                                break;
                            case 5:
                            case 14:
                                zztjVar2 = zztjVar5;
                                unsafe2 = unsafe9;
                                i34 = i18;
                                i35 = i33;
                                i36 = i99;
                                i37 = i28;
                                i38 = 0;
                                bArr2 = bArr;
                                if (i26 == 1) {
                                    iZzi = i37 + 8;
                                    i95 |= i30;
                                    unsafe2.putLong(obj, j10, zztk.zzq(bArr2, i37));
                                    i91 = i11;
                                    i12 = i12;
                                    unsafe9 = unsafe2;
                                    zztjVar5 = zztjVar2;
                                    i92 = i38;
                                    i94 = i29;
                                    i96 = i36;
                                    i97 = i35;
                                    bArr4 = bArr2;
                                    i93 = i34;
                                } else {
                                    i97 = i35;
                                    i22 = i37;
                                    unsafe = unsafe2;
                                    i95 = i95;
                                    i19 = i34;
                                    i92 = i38;
                                    i94 = i29;
                                    i20 = i36;
                                    i21 = i12;
                                }
                                break;
                            case 6:
                            case 13:
                                zztjVar2 = zztjVar5;
                                unsafe2 = unsafe9;
                                i34 = i18;
                                i35 = i33;
                                i36 = i99;
                                i37 = i28;
                                i38 = 0;
                                bArr2 = bArr;
                                if (i26 == 5) {
                                    iZzi = i37 + 4;
                                    i95 |= i30;
                                    unsafe2.putInt(obj3, j10, zztk.zzc(bArr2, i37));
                                    i91 = i11;
                                    i12 = i12;
                                    unsafe9 = unsafe2;
                                    zztjVar5 = zztjVar2;
                                    i92 = i38;
                                    i94 = i29;
                                    i96 = i36;
                                    i97 = i35;
                                    bArr4 = bArr2;
                                    i93 = i34;
                                } else {
                                    i97 = i35;
                                    i22 = i37;
                                    unsafe = unsafe2;
                                    i95 = i95;
                                    i19 = i34;
                                    i92 = i38;
                                    i94 = i29;
                                    i20 = i36;
                                    i21 = i12;
                                }
                                break;
                            case 7:
                                zztjVar2 = zztjVar5;
                                unsafe2 = unsafe9;
                                i34 = i18;
                                i35 = i33;
                                i36 = i99;
                                i37 = i28;
                                i38 = 0;
                                bArr2 = bArr;
                                if (i26 == 0) {
                                    i95 |= i30;
                                    iZzi = zztk.zzm(bArr2, i37, zztjVar2);
                                    if (zztjVar2.zzb != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    zzxc.zzm(obj3, j10, z10);
                                    i91 = i11;
                                    i12 = i12;
                                    unsafe9 = unsafe2;
                                    zztjVar5 = zztjVar2;
                                    i92 = i38;
                                    i94 = i29;
                                    i96 = i36;
                                    i97 = i35;
                                    bArr4 = bArr2;
                                    i93 = i34;
                                } else {
                                    i97 = i35;
                                    i22 = i37;
                                    unsafe = unsafe2;
                                    i95 = i95;
                                    i19 = i34;
                                    i92 = i38;
                                    i94 = i29;
                                    i20 = i36;
                                    i21 = i12;
                                }
                                break;
                            case 8:
                                zztjVar2 = zztjVar5;
                                i34 = i18;
                                i35 = i33;
                                i36 = i99;
                                i37 = i28;
                                bArr2 = bArr;
                                unsafe2 = unsafe9;
                                if (i26 == 2) {
                                    if ((i27 & PKIFailureInfo.duplicateCertReq) != 0) {
                                        iZzj = zztk.zzj(bArr2, i37, zztjVar2);
                                        i39 = zztjVar2.zza;
                                        if (i39 >= 0) {
                                            throw new zzve("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        i40 = i95 | i30;
                                        if (i39 == 0) {
                                            zztjVar2.zzc = "";
                                            i43 = i40;
                                            i38 = 0;
                                        } else {
                                            length = bArr2.length;
                                            int i1011 = zzxf.zza;
                                            if ((iZzj | i39 | ((length - iZzj) - i39)) >= 0) {
                                                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iZzj), Integer.valueOf(i39)));
                                            }
                                            i41 = iZzj + i39;
                                            cArr = new char[i39];
                                            i42 = 0;
                                            while (iZzj < i41) {
                                                b12 = bArr2[iZzj];
                                                if (zzxd.zzd(b12)) {
                                                    iZzj++;
                                                    cArr[i42] = (char) b12;
                                                    i42++;
                                                } else {
                                                    while (iZzj < i41) {
                                                        i44 = iZzj + 1;
                                                        b10 = bArr2[iZzj];
                                                        if (zzxd.zzd(b10)) {
                                                            cArr[i42] = (char) b10;
                                                            i42++;
                                                            iZzj = i44;
                                                            while (iZzj < i41) {
                                                                b11 = bArr2[iZzj];
                                                                if (zzxd.zzd(b11)) {
                                                                }
                                                                iZzj++;
                                                                cArr[i42] = (char) b11;
                                                                i42++;
                                                            }
                                                        } else {
                                                            i45 = i40;
                                                            if (b10 < -32) {
                                                                if (i44 < i41) {
                                                                    throw new zzve("Protocol message had invalid UTF-8.");
                                                                }
                                                                iZzj += 2;
                                                                zzxd.zzc(b10, bArr2[i44], cArr, i42);
                                                                i42++;
                                                            } else if (b10 < -16) {
                                                                if (i44 < i41 - 1) {
                                                                    throw new zzve("Protocol message had invalid UTF-8.");
                                                                }
                                                                zzxd.zzb(b10, bArr2[i44], bArr2[iZzj + 2], cArr, i42);
                                                                i42++;
                                                                i40 = i45;
                                                                iZzj += 3;
                                                            } else {
                                                                if (i44 < i41 - 2) {
                                                                    throw new zzve("Protocol message had invalid UTF-8.");
                                                                }
                                                                byte b18 = bArr2[i44];
                                                                int i1012 = iZzj + 3;
                                                                byte b19 = bArr2[iZzj + 2];
                                                                iZzj += 4;
                                                                zzxd.zza(b10, b18, b19, bArr2[i1012], cArr, i42);
                                                                i42 += 2;
                                                            }
                                                            i40 = i45;
                                                        }
                                                        break;
                                                    }
                                                    i43 = i40;
                                                    i38 = 0;
                                                    zztjVar2.zzc = new String(cArr, 0, i42);
                                                    iZzj = i41;
                                                }
                                            }
                                            while (iZzj < i41) {
                                                i44 = iZzj + 1;
                                                b10 = bArr2[iZzj];
                                                if (zzxd.zzd(b10)) {
                                                    cArr[i42] = (char) b10;
                                                    i42++;
                                                    iZzj = i44;
                                                    while (iZzj < i41) {
                                                        b11 = bArr2[iZzj];
                                                        if (zzxd.zzd(b11)) {
                                                        }
                                                        iZzj++;
                                                        cArr[i42] = (char) b11;
                                                        i42++;
                                                    }
                                                } else {
                                                    i45 = i40;
                                                    if (b10 < -32) {
                                                        if (i44 < i41) {
                                                            throw new zzve("Protocol message had invalid UTF-8.");
                                                        }
                                                        iZzj += 2;
                                                        zzxd.zzc(b10, bArr2[i44], cArr, i42);
                                                        i42++;
                                                    } else if (b10 < -16) {
                                                        if (i44 < i41 - 1) {
                                                            throw new zzve("Protocol message had invalid UTF-8.");
                                                        }
                                                        zzxd.zzb(b10, bArr2[i44], bArr2[iZzj + 2], cArr, i42);
                                                        i42++;
                                                        i40 = i45;
                                                        iZzj += 3;
                                                    } else {
                                                        if (i44 < i41 - 2) {
                                                            throw new zzve("Protocol message had invalid UTF-8.");
                                                        }
                                                        byte b110 = bArr2[i44];
                                                        int i1013 = iZzj + 3;
                                                        byte b111 = bArr2[iZzj + 2];
                                                        iZzj += 4;
                                                        zzxd.zza(b10, b110, b111, bArr2[i1013], cArr, i42);
                                                        i42 += 2;
                                                    }
                                                    i40 = i45;
                                                }
                                                break;
                                            }
                                            i43 = i40;
                                            i38 = 0;
                                            zztjVar2.zzc = new String(cArr, 0, i42);
                                            iZzj = i41;
                                        }
                                        iZzi = iZzj;
                                        i95 = i43;
                                    } else {
                                        i38 = 0;
                                        i95 |= i30;
                                        iZzi = zztk.zzh(bArr2, i37, zztjVar2);
                                    }
                                    unsafe2.putObject(obj3, j10, zztjVar2.zzc);
                                    i91 = i11;
                                    i12 = i12;
                                    unsafe9 = unsafe2;
                                    zztjVar5 = zztjVar2;
                                    i92 = i38;
                                    i94 = i29;
                                    i96 = i36;
                                    i97 = i35;
                                    bArr4 = bArr2;
                                    i93 = i34;
                                } else {
                                    i38 = 0;
                                    i97 = i35;
                                    i22 = i37;
                                    unsafe = unsafe2;
                                    i95 = i95;
                                    i19 = i34;
                                    i92 = i38;
                                    i94 = i29;
                                    i20 = i36;
                                    i21 = i12;
                                }
                                break;
                            case 9:
                                zztjVar2 = zztjVar5;
                                unsafe2 = unsafe9;
                                i34 = i18;
                                i35 = i33;
                                i36 = i99;
                                i37 = i28;
                                i46 = i29;
                                bArr2 = bArr;
                                if (i26 == 2) {
                                    i95 |= i30;
                                    Object objZzx3 = zzvzVar.zzx(obj3, i34);
                                    i91 = i11;
                                    int iZzo3 = zztk.zzo(objZzx3, zzvzVar.zzv(i34), bArr, i37, i91, zztjVar);
                                    zzvzVar.zzF(obj3, i34, objZzx3);
                                    iZzi = iZzo3;
                                    i12 = i12;
                                    unsafe9 = unsafe2;
                                    zztjVar5 = zztjVar2;
                                    i94 = i46;
                                    i96 = i36;
                                    i92 = 0;
                                    i97 = i35;
                                    bArr4 = bArr2;
                                    i93 = i34;
                                } else {
                                    i29 = i46;
                                    i38 = 0;
                                    i97 = i35;
                                    i22 = i37;
                                    unsafe = unsafe2;
                                    i95 = i95;
                                    i19 = i34;
                                    i92 = i38;
                                    i94 = i29;
                                    i20 = i36;
                                    i21 = i12;
                                }
                                break;
                            case 10:
                                zztjVar2 = zztjVar5;
                                unsafe2 = unsafe9;
                                i34 = i18;
                                i35 = i33;
                                i36 = i99;
                                i37 = i28;
                                i46 = i29;
                                bArr2 = bArr;
                                if (i26 == 2) {
                                    i95 |= i30;
                                    iZza = zztk.zza(bArr2, i37, zztjVar2);
                                    unsafe2.putObject(obj3, j10, zztjVar2.zzc);
                                    iZzi = iZza;
                                    i91 = i11;
                                    zztjVar5 = zztjVar2;
                                    i96 = i36;
                                    i92 = 0;
                                    i97 = i35;
                                    i12 = i12;
                                    unsafe9 = unsafe2;
                                    i94 = i46;
                                    bArr4 = bArr2;
                                    i93 = i34;
                                } else {
                                    i29 = i46;
                                    i38 = 0;
                                    i97 = i35;
                                    i22 = i37;
                                    unsafe = unsafe2;
                                    i95 = i95;
                                    i19 = i34;
                                    i92 = i38;
                                    i94 = i29;
                                    i20 = i36;
                                    i21 = i12;
                                }
                                break;
                            case 12:
                                i11 = i11;
                                zztjVar2 = zztjVar5;
                                unsafe2 = unsafe9;
                                i34 = i18;
                                i35 = i33;
                                i36 = i99;
                                i37 = i28;
                                i46 = i29;
                                bArr2 = bArr;
                                i12 = i12;
                                if (i26 == 0) {
                                    int iZzj22 = zztk.zzj(bArr2, i37, zztjVar2);
                                    i47 = zztjVar2.zza;
                                    zzva zzvaVarZzu4 = zzvzVar.zzu(i34);
                                    if ((i27 & Integer.MIN_VALUE) != 0) {
                                        i95 |= i30;
                                        unsafe2.putInt(obj3, j10, i47);
                                    } else {
                                        i95 |= i30;
                                        unsafe2.putInt(obj3, j10, i47);
                                    }
                                    iZzi = iZzj22;
                                    i91 = i11;
                                    zztjVar5 = zztjVar2;
                                    i96 = i36;
                                    i92 = 0;
                                    i97 = i35;
                                    i12 = i12;
                                    unsafe9 = unsafe2;
                                    i94 = i46;
                                    bArr4 = bArr2;
                                    i93 = i34;
                                } else {
                                    i29 = i46;
                                    i38 = 0;
                                    i97 = i35;
                                    i22 = i37;
                                    unsafe = unsafe2;
                                    i95 = i95;
                                    i19 = i34;
                                    i92 = i38;
                                    i94 = i29;
                                    i20 = i36;
                                    i21 = i12;
                                }
                                break;
                            case 15:
                                zztjVar2 = zztjVar5;
                                unsafe2 = unsafe9;
                                i34 = i18;
                                i35 = i33;
                                i36 = i99;
                                i37 = i28;
                                i46 = i29;
                                bArr2 = bArr;
                                if (i26 == 0) {
                                    i95 |= i30;
                                    iZza = zztk.zzj(bArr2, i37, zztjVar2);
                                    unsafe2.putInt(obj3, j10, zzty.zzb(zztjVar2.zza));
                                    iZzi = iZza;
                                    i91 = i11;
                                    zztjVar5 = zztjVar2;
                                    i96 = i36;
                                    i92 = 0;
                                    i97 = i35;
                                    i12 = i12;
                                    unsafe9 = unsafe2;
                                    i94 = i46;
                                    bArr4 = bArr2;
                                    i93 = i34;
                                } else {
                                    i29 = i46;
                                    i38 = 0;
                                    i97 = i35;
                                    i22 = i37;
                                    unsafe = unsafe2;
                                    i95 = i95;
                                    i19 = i34;
                                    i92 = i38;
                                    i94 = i29;
                                    i20 = i36;
                                    i21 = i12;
                                }
                                break;
                            case 16:
                                i34 = i18;
                                i35 = i33;
                                i36 = i99;
                                i37 = i28;
                                i46 = i29;
                                if (i26 == 0) {
                                    i95 |= i30;
                                    bArr2 = bArr;
                                    int iZzm6 = zztk.zzm(bArr2, i37, zztjVar5);
                                    unsafe9.putLong(obj, j10, zzty.zzc(zztjVar5.zzb));
                                    i91 = i11;
                                    i12 = i12;
                                    unsafe9 = unsafe9;
                                    zztjVar5 = zztjVar5;
                                    i94 = i46;
                                    iZzi = iZzm6;
                                    i96 = i36;
                                    i92 = 0;
                                    i97 = i35;
                                    bArr4 = bArr2;
                                    i93 = i34;
                                } else {
                                    bArr2 = bArr;
                                    zztjVar2 = zztjVar5;
                                    unsafe2 = unsafe9;
                                    i29 = i46;
                                    i38 = 0;
                                    i97 = i35;
                                    i22 = i37;
                                    unsafe = unsafe2;
                                    i95 = i95;
                                    i19 = i34;
                                    i92 = i38;
                                    i94 = i29;
                                    i20 = i36;
                                    i21 = i12;
                                }
                                break;
                            default:
                                if (i26 == 3) {
                                    int i1014 = i95 | i30;
                                    Object objZzx4 = zzvzVar.zzx(obj3, i18);
                                    int i1015 = i18;
                                    iZzi = zztk.zzn(objZzx4, zzvzVar.zzv(i18), bArr, i28, i11, (i99 << 3) | 4, zztjVar);
                                    zzvzVar.zzF(obj3, i1015, objZzx4);
                                    i97 = i33;
                                    i12 = i12;
                                    i95 = i1014;
                                    i93 = i1015;
                                    i94 = i29;
                                    i96 = i99;
                                    i92 = 0;
                                    bArr4 = bArr;
                                    i91 = i11;
                                } else {
                                    i34 = i18;
                                    i35 = i33;
                                    i36 = i99;
                                    i37 = i28;
                                    bArr2 = bArr;
                                    zztjVar2 = zztjVar5;
                                    unsafe2 = unsafe9;
                                    i38 = 0;
                                    i97 = i35;
                                    i22 = i37;
                                    unsafe = unsafe2;
                                    i95 = i95;
                                    i19 = i34;
                                    i92 = i38;
                                    i94 = i29;
                                    i20 = i36;
                                    i21 = i12;
                                }
                                break;
                        }
                    } else {
                        i48 = i18;
                        i97 = i97;
                        i49 = i99;
                        i92 = 0;
                        zztjVar3 = zztjVar5;
                        unsafe3 = unsafe9;
                        if (iZzr == 27) {
                            i95 = i95;
                            i54 = i48;
                            bArr3 = bArr;
                            if (iZzr <= 49) {
                                j12 = i27;
                                unsafe7 = zzb;
                                zzvbVarZzd2 = (zzvb) unsafe7.getObject(obj3, j10);
                                if (zzvbVarZzd2.zzc()) {
                                    int size4 = zzvbVarZzd2.size();
                                    zzvbVarZzd2 = zzvbVarZzd2.zzd(size4 != 0 ? size4 + size4 : 10);
                                    unsafe7.putObject(obj3, j10, zzvbVarZzd2);
                                }
                                zzvbVar = zzvbVarZzd2;
                                switch (iZzr) {
                                    case 18:
                                    case 35:
                                        i61 = i11;
                                        zztjVar3 = zztjVar3;
                                        i62 = i28;
                                        i63 = i29;
                                        i64 = i49;
                                        unsafe8 = r12;
                                        i54 = i54;
                                        if (i26 == 2) {
                                            zzueVar2 = (zzue) zzvbVar;
                                            iZzj4 = zztk.zzj(bArr3, i62, zztjVar3);
                                            i65 = zztjVar3.zza + iZzj4;
                                            while (iZzj4 < i65) {
                                                zzueVar2.zzf(Double.longBitsToDouble(zztk.zzq(bArr3, iZzj4)));
                                                iZzj4 += 8;
                                            }
                                            if (iZzj4 != i65) {
                                                throw new zzve("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            iZzl = iZzj4;
                                        } else if (i26 == 1) {
                                            iZzl = i62 + 8;
                                            zzueVar = (zzue) zzvbVar;
                                            zzueVar.zzf(Double.longBitsToDouble(zztk.zzq(bArr3, i62)));
                                            while (iZzl < i61) {
                                                iZzj3 = zztk.zzj(bArr3, iZzl, zztjVar3);
                                                if (i63 == zztjVar3.zza) {
                                                    zzueVar.zzf(Double.longBitsToDouble(zztk.zzq(bArr3, iZzj3)));
                                                    iZzl = iZzj3 + 8;
                                                }
                                            }
                                        } else {
                                            iZzl = i62;
                                        }
                                        if (iZzl != i62) {
                                            zztjVar5 = zztjVar3;
                                            i96 = i64;
                                            i91 = i61;
                                            i93 = i54;
                                            unsafe9 = unsafe8;
                                            i94 = i63;
                                            obj3 = obj;
                                            iZzi = iZzl;
                                        } else {
                                            i22 = iZzl;
                                            unsafe = unsafe8;
                                            i94 = i63;
                                            i97 = i97;
                                            i21 = i12;
                                            zztjVar2 = zztjVar3;
                                            i19 = i54;
                                            obj3 = obj;
                                            i20 = i64;
                                        }
                                        break;
                                    case 19:
                                    case 36:
                                        i61 = i11;
                                        zztjVar3 = zztjVar3;
                                        i62 = i28;
                                        i63 = i29;
                                        i64 = i49;
                                        unsafe8 = r12;
                                        i54 = i54;
                                        if (i26 == 2) {
                                            zzuoVar2 = (zzuo) zzvbVar;
                                            iZzj4 = zztk.zzj(bArr3, i62, zztjVar3);
                                            i66 = zztjVar3.zza + iZzj4;
                                            while (iZzj4 < i66) {
                                                zzuoVar2.zzf(Float.intBitsToFloat(zztk.zzc(bArr3, iZzj4)));
                                                iZzj4 += 4;
                                            }
                                            if (iZzj4 != i66) {
                                                throw new zzve("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            iZzl = iZzj4;
                                        } else if (i26 == 5) {
                                            iZzl = i62 + 4;
                                            zzuoVar = (zzuo) zzvbVar;
                                            zzuoVar.zzf(Float.intBitsToFloat(zztk.zzc(bArr3, i62)));
                                            while (iZzl < i61) {
                                                iZzj5 = zztk.zzj(bArr3, iZzl, zztjVar3);
                                                if (i63 == zztjVar3.zza) {
                                                    zzuoVar.zzf(Float.intBitsToFloat(zztk.zzc(bArr3, iZzj5)));
                                                    iZzl = iZzj5 + 4;
                                                }
                                            }
                                        } else {
                                            iZzl = i62;
                                        }
                                        if (iZzl != i62) {
                                            zztjVar5 = zztjVar3;
                                            i96 = i64;
                                            i91 = i61;
                                            i93 = i54;
                                            unsafe9 = unsafe8;
                                            i94 = i63;
                                            obj3 = obj;
                                            iZzi = iZzl;
                                        } else {
                                            i22 = iZzl;
                                            unsafe = unsafe8;
                                            i94 = i63;
                                            i97 = i97;
                                            i21 = i12;
                                            zztjVar2 = zztjVar3;
                                            i19 = i54;
                                            obj3 = obj;
                                            i20 = i64;
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        i61 = i11;
                                        zztjVar3 = zztjVar3;
                                        i62 = i28;
                                        i63 = i29;
                                        i64 = i49;
                                        unsafe8 = r12;
                                        i54 = i54;
                                        if (i26 == 2) {
                                            zzvlVar2 = (zzvl) zzvbVar;
                                            iZzj4 = zztk.zzj(bArr3, i62, zztjVar3);
                                            i67 = zztjVar3.zza + iZzj4;
                                            while (iZzj4 < i67) {
                                                iZzj4 = zztk.zzm(bArr3, iZzj4, zztjVar3);
                                                zzvlVar2.zzf(zztjVar3.zzb);
                                            }
                                            if (iZzj4 != i67) {
                                                throw new zzve("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            iZzl = iZzj4;
                                        } else if (i26 == 0) {
                                            zzvlVar = (zzvl) zzvbVar;
                                            iZzm2 = zztk.zzm(bArr3, i62, zztjVar3);
                                            zzvlVar.zzf(zztjVar3.zzb);
                                            while (iZzm2 < i61) {
                                                iZzj6 = zztk.zzj(bArr3, iZzm2, zztjVar3);
                                                if (i63 == zztjVar3.zza) {
                                                    iZzm2 = zztk.zzm(bArr3, iZzj6, zztjVar3);
                                                    zzvlVar.zzf(zztjVar3.zzb);
                                                } else {
                                                    iZzl = iZzm2;
                                                }
                                            }
                                            iZzl = iZzm2;
                                        } else {
                                            iZzl = i62;
                                        }
                                        if (iZzl != i62) {
                                            zztjVar5 = zztjVar3;
                                            i96 = i64;
                                            i91 = i61;
                                            i93 = i54;
                                            unsafe9 = unsafe8;
                                            i94 = i63;
                                            obj3 = obj;
                                            iZzi = iZzl;
                                        } else {
                                            i22 = iZzl;
                                            unsafe = unsafe8;
                                            i94 = i63;
                                            i97 = i97;
                                            i21 = i12;
                                            zztjVar2 = zztjVar3;
                                            i19 = i54;
                                            obj3 = obj;
                                            i20 = i64;
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        i68 = i11;
                                        zztjVar3 = zztjVar3;
                                        i69 = i28;
                                        i63 = i29;
                                        unsafe8 = r12;
                                        i54 = i54;
                                        if (i26 == 2) {
                                            iZzl = zztk.zzg(bArr3, i69, zzvbVar, zztjVar3);
                                            i61 = i68;
                                            i62 = i69;
                                            i64 = i49;
                                        } else if (i26 == 0) {
                                            i61 = i68;
                                            i62 = i69;
                                            i64 = i49;
                                            iZzl = zztk.zzl(i63, bArr, i69, i11, zzvbVar, zztjVar);
                                        } else {
                                            i61 = i68;
                                            i62 = i69;
                                            i64 = i49;
                                            iZzl = i62;
                                        }
                                        if (iZzl != i62) {
                                            zztjVar5 = zztjVar3;
                                            i96 = i64;
                                            i91 = i61;
                                            i93 = i54;
                                            unsafe9 = unsafe8;
                                            i94 = i63;
                                            obj3 = obj;
                                            iZzi = iZzl;
                                        } else {
                                            i22 = iZzl;
                                            unsafe = unsafe8;
                                            i94 = i63;
                                            i97 = i97;
                                            i21 = i12;
                                            zztjVar2 = zztjVar3;
                                            i19 = i54;
                                            obj3 = obj;
                                            i20 = i64;
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        i68 = i11;
                                        zztjVar3 = zztjVar3;
                                        i69 = i28;
                                        i63 = i29;
                                        unsafe8 = r12;
                                        i54 = i54;
                                        if (i26 == 2) {
                                            if (i26 == 1) {
                                                i70 = i69 + 8;
                                                zzvlVar3 = (zzvl) zzvbVar;
                                                zzvlVar3.zzf(zztk.zzq(bArr3, i69));
                                                while (i70 < i68) {
                                                    iZzj7 = zztk.zzj(bArr3, i70, zztjVar3);
                                                    if (i63 == zztjVar3.zza) {
                                                        i61 = i68;
                                                        i62 = i69;
                                                        iZzl = i70;
                                                        i64 = i49;
                                                        if (iZzl != i62) {
                                                            zztjVar5 = zztjVar3;
                                                            i96 = i64;
                                                            i91 = i61;
                                                            i93 = i54;
                                                            unsafe9 = unsafe8;
                                                            i94 = i63;
                                                            obj3 = obj;
                                                            iZzi = iZzl;
                                                        } else {
                                                            i22 = iZzl;
                                                            unsafe = unsafe8;
                                                            i94 = i63;
                                                            i97 = i97;
                                                            i21 = i12;
                                                            zztjVar2 = zztjVar3;
                                                            i19 = i54;
                                                            obj3 = obj;
                                                            i20 = i64;
                                                        }
                                                    } else {
                                                        zzvlVar3.zzf(zztk.zzq(bArr3, iZzj7));
                                                        i70 = iZzj7 + 8;
                                                    }
                                                    break;
                                                }
                                                i61 = i68;
                                                i62 = i69;
                                                iZzl = i70;
                                                i64 = i49;
                                                if (iZzl != i62) {
                                                    zztjVar5 = zztjVar3;
                                                    i96 = i64;
                                                    i91 = i61;
                                                    i93 = i54;
                                                    unsafe9 = unsafe8;
                                                    i94 = i63;
                                                    obj3 = obj;
                                                    iZzi = iZzl;
                                                } else {
                                                    i22 = iZzl;
                                                    unsafe = unsafe8;
                                                    i94 = i63;
                                                    i97 = i97;
                                                    i21 = i12;
                                                    zztjVar2 = zztjVar3;
                                                    i19 = i54;
                                                    obj3 = obj;
                                                    i20 = i64;
                                                }
                                            }
                                            i61 = i68;
                                            i62 = i69;
                                            i64 = i49;
                                            iZzl = i62;
                                            if (iZzl != i62) {
                                                zztjVar5 = zztjVar3;
                                                i96 = i64;
                                                i91 = i61;
                                                i93 = i54;
                                                unsafe9 = unsafe8;
                                                i94 = i63;
                                                obj3 = obj;
                                                iZzi = iZzl;
                                            } else {
                                                i22 = iZzl;
                                                unsafe = unsafe8;
                                                i94 = i63;
                                                i97 = i97;
                                                i21 = i12;
                                                zztjVar2 = zztjVar3;
                                                i19 = i54;
                                                obj3 = obj;
                                                i20 = i64;
                                            }
                                            break;
                                        } else {
                                            zzvlVar4 = (zzvl) zzvbVar;
                                            iZzj8 = zztk.zzj(bArr3, i69, zztjVar3);
                                            i71 = zztjVar3.zza + iZzj8;
                                            while (iZzj8 < i71) {
                                                zzvlVar4.zzf(zztk.zzq(bArr3, iZzj8));
                                                iZzj8 += 8;
                                            }
                                            if (iZzj8 != i71) {
                                                throw new zzve("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i61 = i68;
                                            i62 = i69;
                                            iZzl = iZzj8;
                                            i64 = i49;
                                            if (iZzl != i62) {
                                                zztjVar5 = zztjVar3;
                                                i96 = i64;
                                                i91 = i61;
                                                i93 = i54;
                                                unsafe9 = unsafe8;
                                                i94 = i63;
                                                obj3 = obj;
                                                iZzi = iZzl;
                                            } else {
                                                i22 = iZzl;
                                                unsafe = unsafe8;
                                                i94 = i63;
                                                i97 = i97;
                                                i21 = i12;
                                                zztjVar2 = zztjVar3;
                                                i19 = i54;
                                                obj3 = obj;
                                                i20 = i64;
                                            }
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        i68 = i11;
                                        zztjVar3 = zztjVar3;
                                        i69 = i28;
                                        i63 = i29;
                                        unsafe8 = r12;
                                        i54 = i54;
                                        if (i26 == 2) {
                                            if (i26 == 5) {
                                                i70 = i69 + 4;
                                                zzuxVar = (zzux) zzvbVar;
                                                zzuxVar.zzf(zztk.zzc(bArr3, i69));
                                                while (i70 < i68) {
                                                    iZzj9 = zztk.zzj(bArr3, i70, zztjVar3);
                                                    if (i63 == zztjVar3.zza) {
                                                        i61 = i68;
                                                        i62 = i69;
                                                        iZzl = i70;
                                                        i64 = i49;
                                                        if (iZzl != i62) {
                                                            zztjVar5 = zztjVar3;
                                                            i96 = i64;
                                                            i91 = i61;
                                                            i93 = i54;
                                                            unsafe9 = unsafe8;
                                                            i94 = i63;
                                                            obj3 = obj;
                                                            iZzi = iZzl;
                                                        } else {
                                                            i22 = iZzl;
                                                            unsafe = unsafe8;
                                                            i94 = i63;
                                                            i97 = i97;
                                                            i21 = i12;
                                                            zztjVar2 = zztjVar3;
                                                            i19 = i54;
                                                            obj3 = obj;
                                                            i20 = i64;
                                                        }
                                                    } else {
                                                        zzuxVar.zzf(zztk.zzc(bArr3, iZzj9));
                                                        i70 = iZzj9 + 4;
                                                    }
                                                    break;
                                                }
                                                i61 = i68;
                                                i62 = i69;
                                                iZzl = i70;
                                                i64 = i49;
                                                if (iZzl != i62) {
                                                    zztjVar5 = zztjVar3;
                                                    i96 = i64;
                                                    i91 = i61;
                                                    i93 = i54;
                                                    unsafe9 = unsafe8;
                                                    i94 = i63;
                                                    obj3 = obj;
                                                    iZzi = iZzl;
                                                } else {
                                                    i22 = iZzl;
                                                    unsafe = unsafe8;
                                                    i94 = i63;
                                                    i97 = i97;
                                                    i21 = i12;
                                                    zztjVar2 = zztjVar3;
                                                    i19 = i54;
                                                    obj3 = obj;
                                                    i20 = i64;
                                                }
                                            }
                                            i61 = i68;
                                            i62 = i69;
                                            i64 = i49;
                                            iZzl = i62;
                                            if (iZzl != i62) {
                                                zztjVar5 = zztjVar3;
                                                i96 = i64;
                                                i91 = i61;
                                                i93 = i54;
                                                unsafe9 = unsafe8;
                                                i94 = i63;
                                                obj3 = obj;
                                                iZzi = iZzl;
                                            } else {
                                                i22 = iZzl;
                                                unsafe = unsafe8;
                                                i94 = i63;
                                                i97 = i97;
                                                i21 = i12;
                                                zztjVar2 = zztjVar3;
                                                i19 = i54;
                                                obj3 = obj;
                                                i20 = i64;
                                            }
                                            break;
                                        } else {
                                            zzuxVar2 = (zzux) zzvbVar;
                                            iZzj8 = zztk.zzj(bArr3, i69, zztjVar3);
                                            i72 = zztjVar3.zza + iZzj8;
                                            while (iZzj8 < i72) {
                                                zzuxVar2.zzf(zztk.zzc(bArr3, iZzj8));
                                                iZzj8 += 4;
                                            }
                                            if (iZzj8 != i72) {
                                                throw new zzve("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i61 = i68;
                                            i62 = i69;
                                            iZzl = iZzj8;
                                            i64 = i49;
                                            if (iZzl != i62) {
                                                zztjVar5 = zztjVar3;
                                                i96 = i64;
                                                i91 = i61;
                                                i93 = i54;
                                                unsafe9 = unsafe8;
                                                i94 = i63;
                                                obj3 = obj;
                                                iZzi = iZzl;
                                            } else {
                                                i22 = iZzl;
                                                unsafe = unsafe8;
                                                i94 = i63;
                                                i97 = i97;
                                                i21 = i12;
                                                zztjVar2 = zztjVar3;
                                                i19 = i54;
                                                obj3 = obj;
                                                i20 = i64;
                                            }
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        i68 = i11;
                                        zztjVar3 = zztjVar3;
                                        i69 = i28;
                                        i63 = i29;
                                        unsafe8 = r12;
                                        i54 = i54;
                                        if (i26 == 2) {
                                            if (i26 == 0) {
                                                zztlVar = (zztl) zzvbVar;
                                                iZzm3 = zztk.zzm(bArr3, i69, zztjVar3);
                                                if (zztjVar3.zzb != 0) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                zztlVar.zze(z12);
                                                while (iZzm3 < i68) {
                                                    iZzj10 = zztk.zzj(bArr3, iZzm3, zztjVar3);
                                                    if (i63 == zztjVar3.zza) {
                                                        iZzl = iZzm3;
                                                        i61 = i68;
                                                        i62 = i69;
                                                        i64 = i49;
                                                        if (iZzl != i62) {
                                                            zztjVar5 = zztjVar3;
                                                            i96 = i64;
                                                            i91 = i61;
                                                            i93 = i54;
                                                            unsafe9 = unsafe8;
                                                            i94 = i63;
                                                            obj3 = obj;
                                                            iZzi = iZzl;
                                                        } else {
                                                            i22 = iZzl;
                                                            unsafe = unsafe8;
                                                            i94 = i63;
                                                            i97 = i97;
                                                            i21 = i12;
                                                            zztjVar2 = zztjVar3;
                                                            i19 = i54;
                                                            obj3 = obj;
                                                            i20 = i64;
                                                        }
                                                    } else {
                                                        iZzm3 = zztk.zzm(bArr3, iZzj10, zztjVar3);
                                                        if (zztjVar3.zzb != 0) {
                                                            z13 = true;
                                                        } else {
                                                            z13 = false;
                                                        }
                                                        zztlVar.zze(z13);
                                                    }
                                                    break;
                                                }
                                                iZzl = iZzm3;
                                                i61 = i68;
                                                i62 = i69;
                                                i64 = i49;
                                                if (iZzl != i62) {
                                                    zztjVar5 = zztjVar3;
                                                    i96 = i64;
                                                    i91 = i61;
                                                    i93 = i54;
                                                    unsafe9 = unsafe8;
                                                    i94 = i63;
                                                    obj3 = obj;
                                                    iZzi = iZzl;
                                                } else {
                                                    i22 = iZzl;
                                                    unsafe = unsafe8;
                                                    i94 = i63;
                                                    i97 = i97;
                                                    i21 = i12;
                                                    zztjVar2 = zztjVar3;
                                                    i19 = i54;
                                                    obj3 = obj;
                                                    i20 = i64;
                                                }
                                            }
                                            i61 = i68;
                                            i62 = i69;
                                            i64 = i49;
                                            iZzl = i62;
                                            if (iZzl != i62) {
                                                zztjVar5 = zztjVar3;
                                                i96 = i64;
                                                i91 = i61;
                                                i93 = i54;
                                                unsafe9 = unsafe8;
                                                i94 = i63;
                                                obj3 = obj;
                                                iZzi = iZzl;
                                            } else {
                                                i22 = iZzl;
                                                unsafe = unsafe8;
                                                i94 = i63;
                                                i97 = i97;
                                                i21 = i12;
                                                zztjVar2 = zztjVar3;
                                                i19 = i54;
                                                obj3 = obj;
                                                i20 = i64;
                                            }
                                            break;
                                        } else {
                                            zztlVar2 = (zztl) zzvbVar;
                                            iZzj8 = zztk.zzj(bArr3, i69, zztjVar3);
                                            i73 = zztjVar3.zza + iZzj8;
                                            while (iZzj8 < i73) {
                                                iZzj8 = zztk.zzm(bArr3, iZzj8, zztjVar3);
                                                if (zztjVar3.zzb != 0) {
                                                    z14 = true;
                                                } else {
                                                    z14 = false;
                                                }
                                                zztlVar2.zze(z14);
                                            }
                                            if (iZzj8 != i73) {
                                                throw new zzve("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i61 = i68;
                                            i62 = i69;
                                            iZzl = iZzj8;
                                            i64 = i49;
                                            if (iZzl != i62) {
                                                zztjVar5 = zztjVar3;
                                                i96 = i64;
                                                i91 = i61;
                                                i93 = i54;
                                                unsafe9 = unsafe8;
                                                i94 = i63;
                                                obj3 = obj;
                                                iZzi = iZzl;
                                            } else {
                                                i22 = iZzl;
                                                unsafe = unsafe8;
                                                i94 = i63;
                                                i97 = i97;
                                                i21 = i12;
                                                zztjVar2 = zztjVar3;
                                                i19 = i54;
                                                obj3 = obj;
                                                i20 = i64;
                                            }
                                        }
                                        break;
                                    case 26:
                                        i68 = i11;
                                        zztjVar3 = zztjVar3;
                                        i69 = i28;
                                        i63 = i29;
                                        i49 = i49;
                                        unsafe8 = r12;
                                        i54 = i54;
                                        if (i26 == 2) {
                                            i61 = i68;
                                            i62 = i69;
                                            i64 = i49;
                                            iZzl = i62;
                                            if (iZzl != i62) {
                                                zztjVar5 = zztjVar3;
                                                i96 = i64;
                                                i91 = i61;
                                                i93 = i54;
                                                unsafe9 = unsafe8;
                                                i94 = i63;
                                                obj3 = obj;
                                                iZzi = iZzl;
                                            } else {
                                                i22 = iZzl;
                                                unsafe = unsafe8;
                                                i94 = i63;
                                                i97 = i97;
                                                i21 = i12;
                                                zztjVar2 = zztjVar3;
                                                i19 = i54;
                                                obj3 = obj;
                                                i20 = i64;
                                            }
                                        } else if ((j12 & SvgConstantsKt.SPECIFIED_CLIP_RULE) == 0) {
                                            iZzm3 = zztk.zzj(bArr3, i69, zztjVar3);
                                            i74 = zztjVar3.zza;
                                            if (i74 >= 0) {
                                                throw new zzve("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i74 == 0) {
                                                zzvbVar.add("");
                                            } else {
                                                i75 = iZzm3 + i74;
                                                if (zzxf.zzd(bArr3, iZzm3, i75)) {
                                                    throw new zzve("Protocol message had invalid UTF-8.");
                                                }
                                                zzvbVar.add(new String(bArr3, iZzm3, i74, zzvc.zza));
                                                iZzm3 = i75;
                                            }
                                            while (iZzm3 < i68) {
                                                iZzj11 = zztk.zzj(bArr3, iZzm3, zztjVar3);
                                                if (i63 == zztjVar3.zza) {
                                                    iZzl = iZzm3;
                                                    i61 = i68;
                                                    i62 = i69;
                                                    i64 = i49;
                                                    if (iZzl != i62) {
                                                        zztjVar5 = zztjVar3;
                                                        i96 = i64;
                                                        i91 = i61;
                                                        i93 = i54;
                                                        unsafe9 = unsafe8;
                                                        i94 = i63;
                                                        obj3 = obj;
                                                        iZzi = iZzl;
                                                    } else {
                                                        i22 = iZzl;
                                                        unsafe = unsafe8;
                                                        i94 = i63;
                                                        i97 = i97;
                                                        i21 = i12;
                                                        zztjVar2 = zztjVar3;
                                                        i19 = i54;
                                                        obj3 = obj;
                                                        i20 = i64;
                                                    }
                                                    break;
                                                } else {
                                                    iZzm3 = zztk.zzj(bArr3, iZzj11, zztjVar3);
                                                    i76 = zztjVar3.zza;
                                                    if (i76 >= 0) {
                                                        throw new zzve("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i76 == 0) {
                                                        zzvbVar.add("");
                                                    } else {
                                                        i77 = iZzm3 + i76;
                                                        if (zzxf.zzd(bArr3, iZzm3, i77)) {
                                                            throw new zzve("Protocol message had invalid UTF-8.");
                                                        }
                                                        zzvbVar.add(new String(bArr3, iZzm3, i76, zzvc.zza));
                                                        iZzm3 = i77;
                                                    }
                                                }
                                            }
                                            iZzl = iZzm3;
                                            i61 = i68;
                                            i62 = i69;
                                            i64 = i49;
                                            if (iZzl != i62) {
                                                zztjVar5 = zztjVar3;
                                                i96 = i64;
                                                i91 = i61;
                                                i93 = i54;
                                                unsafe9 = unsafe8;
                                                i94 = i63;
                                                obj3 = obj;
                                                iZzi = iZzl;
                                            } else {
                                                i22 = iZzl;
                                                unsafe = unsafe8;
                                                i94 = i63;
                                                i97 = i97;
                                                i21 = i12;
                                                zztjVar2 = zztjVar3;
                                                i19 = i54;
                                                obj3 = obj;
                                                i20 = i64;
                                            }
                                        } else {
                                            iZzj12 = zztk.zzj(bArr3, i69, zztjVar3);
                                            i78 = zztjVar3.zza;
                                            if (i78 >= 0) {
                                                throw new zzve("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i78 == 0) {
                                                obj2 = "";
                                                zzvbVar.add(obj2);
                                            } else {
                                                obj2 = "";
                                                zzvbVar.add(new String(bArr3, iZzj12, i78, zzvc.zza));
                                                iZzj12 += i78;
                                            }
                                            while (iZzj12 < i68) {
                                                iZzj13 = zztk.zzj(bArr3, iZzj12, zztjVar3);
                                                if (i63 == zztjVar3.zza) {
                                                    iZzl = iZzj12;
                                                    i61 = i68;
                                                    i62 = i69;
                                                    i64 = i49;
                                                    if (iZzl != i62) {
                                                        zztjVar5 = zztjVar3;
                                                        i96 = i64;
                                                        i91 = i61;
                                                        i93 = i54;
                                                        unsafe9 = unsafe8;
                                                        i94 = i63;
                                                        obj3 = obj;
                                                        iZzi = iZzl;
                                                    } else {
                                                        i22 = iZzl;
                                                        unsafe = unsafe8;
                                                        i94 = i63;
                                                        i97 = i97;
                                                        i21 = i12;
                                                        zztjVar2 = zztjVar3;
                                                        i19 = i54;
                                                        obj3 = obj;
                                                        i20 = i64;
                                                    }
                                                    break;
                                                } else {
                                                    iZzj12 = zztk.zzj(bArr3, iZzj13, zztjVar3);
                                                    i79 = zztjVar3.zza;
                                                    if (i79 >= 0) {
                                                        throw new zzve("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i79 == 0) {
                                                        zzvbVar.add(obj2);
                                                    } else {
                                                        zzvbVar.add(new String(bArr3, iZzj12, i79, zzvc.zza));
                                                        iZzj12 += i79;
                                                    }
                                                }
                                            }
                                            iZzl = iZzj12;
                                            i61 = i68;
                                            i62 = i69;
                                            i64 = i49;
                                            if (iZzl != i62) {
                                                zztjVar5 = zztjVar3;
                                                i96 = i64;
                                                i91 = i61;
                                                i93 = i54;
                                                unsafe9 = unsafe8;
                                                i94 = i63;
                                                obj3 = obj;
                                                iZzi = iZzl;
                                            } else {
                                                i22 = iZzl;
                                                unsafe = unsafe8;
                                                i94 = i63;
                                                i97 = i97;
                                                i21 = i12;
                                                zztjVar2 = zztjVar3;
                                                i19 = i54;
                                                obj3 = obj;
                                                i20 = i64;
                                            }
                                        }
                                        break;
                                    case 27:
                                        i61 = i11;
                                        i62 = i28;
                                        i63 = i29;
                                        if (i26 == 2) {
                                            i49 = i49;
                                            zzvzVar = this;
                                            zztjVar3 = zztjVar3;
                                            int iZzf2 = zztk.zzf(zzvzVar.zzv(i54), i63, bArr, i62, i11, zzvbVar, zztjVar);
                                            i54 = i54;
                                            unsafe8 = r12;
                                            i61 = i61;
                                            i62 = i62;
                                            bArr3 = bArr3;
                                            iZzl = iZzf2;
                                            i64 = i49;
                                            if (iZzl != i62) {
                                                zztjVar5 = zztjVar3;
                                                i96 = i64;
                                                i91 = i61;
                                                i93 = i54;
                                                unsafe9 = unsafe8;
                                                i94 = i63;
                                                obj3 = obj;
                                                iZzi = iZzl;
                                            } else {
                                                i22 = iZzl;
                                                unsafe = unsafe8;
                                                i94 = i63;
                                                i97 = i97;
                                                i21 = i12;
                                                zztjVar2 = zztjVar3;
                                                i19 = i54;
                                                obj3 = obj;
                                                i20 = i64;
                                            }
                                        } else {
                                            zztjVar3 = zztjVar3;
                                            zzvzVar = this;
                                            i64 = i49;
                                            i54 = i54;
                                            unsafe8 = r12;
                                            iZzl = i62;
                                            if (iZzl != i62) {
                                                zztjVar5 = zztjVar3;
                                                i96 = i64;
                                                i91 = i61;
                                                i93 = i54;
                                                unsafe9 = unsafe8;
                                                i94 = i63;
                                                obj3 = obj;
                                                iZzi = iZzl;
                                            } else {
                                                i22 = iZzl;
                                                unsafe = unsafe8;
                                                i94 = i63;
                                                i97 = i97;
                                                i21 = i12;
                                                zztjVar2 = zztjVar3;
                                                i19 = i54;
                                                obj3 = obj;
                                                i20 = i64;
                                            }
                                        }
                                        break;
                                    case 28:
                                        i61 = i11;
                                        i62 = i28;
                                        i63 = i29;
                                        if (i26 == 2) {
                                            iZzj14 = zztk.zzj(bArr3, i62, zztjVar3);
                                            i80 = zztjVar3.zza;
                                            if (i80 >= 0) {
                                                throw new zzve("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i80 <= bArr3.length - iZzj14) {
                                                throw new zzve("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            if (i80 == 0) {
                                                zzvbVar.add(zztu.zzb);
                                            } else {
                                                zzvbVar.add(zztu.zzj(bArr3, iZzj14, i80));
                                                iZzj14 += i80;
                                            }
                                            while (iZzj14 < i61) {
                                                iZzj15 = zztk.zzj(bArr3, iZzj14, zztjVar3);
                                                if (i63 == zztjVar3.zza) {
                                                    i64 = i49;
                                                    iZzl = iZzj14;
                                                    i54 = i54;
                                                    zztjVar3 = zztjVar3;
                                                    unsafe8 = r12;
                                                    zzvzVar = this;
                                                    if (iZzl != i62) {
                                                        zztjVar5 = zztjVar3;
                                                        i96 = i64;
                                                        i91 = i61;
                                                        i93 = i54;
                                                        unsafe9 = unsafe8;
                                                        i94 = i63;
                                                        obj3 = obj;
                                                        iZzi = iZzl;
                                                    } else {
                                                        i22 = iZzl;
                                                        unsafe = unsafe8;
                                                        i94 = i63;
                                                        i97 = i97;
                                                        i21 = i12;
                                                        zztjVar2 = zztjVar3;
                                                        i19 = i54;
                                                        obj3 = obj;
                                                        i20 = i64;
                                                    }
                                                    break;
                                                } else {
                                                    iZzj14 = zztk.zzj(bArr3, iZzj15, zztjVar3);
                                                    i81 = zztjVar3.zza;
                                                    if (i81 >= 0) {
                                                        throw new zzve("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i81 <= bArr3.length - iZzj14) {
                                                        throw new zzve("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i81 == 0) {
                                                        zzvbVar.add(zztu.zzb);
                                                    } else {
                                                        zzvbVar.add(zztu.zzj(bArr3, iZzj14, i81));
                                                        iZzj14 += i81;
                                                    }
                                                }
                                            }
                                            i64 = i49;
                                            iZzl = iZzj14;
                                            i54 = i54;
                                            zztjVar3 = zztjVar3;
                                            unsafe8 = r12;
                                            zzvzVar = this;
                                            if (iZzl != i62) {
                                                zztjVar5 = zztjVar3;
                                                i96 = i64;
                                                i91 = i61;
                                                i93 = i54;
                                                unsafe9 = unsafe8;
                                                i94 = i63;
                                                obj3 = obj;
                                                iZzi = iZzl;
                                            } else {
                                                i22 = iZzl;
                                                unsafe = unsafe8;
                                                i94 = i63;
                                                i97 = i97;
                                                i21 = i12;
                                                zztjVar2 = zztjVar3;
                                                i19 = i54;
                                                obj3 = obj;
                                                i20 = i64;
                                            }
                                        } else {
                                            i64 = i49;
                                            i54 = i54;
                                            zztjVar3 = zztjVar3;
                                            unsafe8 = r12;
                                            zzvzVar = this;
                                            iZzl = i62;
                                            if (iZzl != i62) {
                                                zztjVar5 = zztjVar3;
                                                i96 = i64;
                                                i91 = i61;
                                                i93 = i54;
                                                unsafe9 = unsafe8;
                                                i94 = i63;
                                                obj3 = obj;
                                                iZzi = iZzl;
                                            } else {
                                                i22 = iZzl;
                                                unsafe = unsafe8;
                                                i94 = i63;
                                                i97 = i97;
                                                i21 = i12;
                                                zztjVar2 = zztjVar3;
                                                i19 = i54;
                                                obj3 = obj;
                                                i20 = i64;
                                            }
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        i61 = i11;
                                        i62 = i28;
                                        i63 = i29;
                                        if (i26 == 2) {
                                            iZzl2 = zztk.zzg(bArr3, i62, zzvbVar, zztjVar3);
                                        } else if (i26 == 0) {
                                            zzvzVar = this;
                                            i64 = i49;
                                            unsafe8 = r12;
                                            iZzl = i62;
                                            if (iZzl != i62) {
                                                zztjVar5 = zztjVar3;
                                                i96 = i64;
                                                i91 = i61;
                                                i93 = i54;
                                                unsafe9 = unsafe8;
                                                i94 = i63;
                                                obj3 = obj;
                                                iZzi = iZzl;
                                            } else {
                                                i22 = iZzl;
                                                unsafe = unsafe8;
                                                i94 = i63;
                                                i97 = i97;
                                                i21 = i12;
                                                zztjVar2 = zztjVar3;
                                                i19 = i54;
                                                obj3 = obj;
                                                i20 = i64;
                                            }
                                        } else {
                                            iZzl2 = zztk.zzl(i63, bArr, i62, i11, zzvbVar, zztjVar);
                                        }
                                        zzvaVarZzu2 = zzvzVar.zzu(i54);
                                        zzwvVar2 = zzvzVar.zzl;
                                        int i1016 = zzwj.zza;
                                        if (zzvaVarZzu2 != null) {
                                            i82 = iZzl2;
                                            i83 = i49;
                                        } else if (zzvbVar instanceof RandomAccess) {
                                            size = zzvbVar.size();
                                            objZzn2 = null;
                                            i84 = 0;
                                            i85 = 0;
                                            while (i84 < size) {
                                                int i1017 = iZzl2;
                                                iIntValue2 = ((Integer) zzvbVar.get(i84)).intValue();
                                                if (zzvaVarZzu2.zza(iIntValue2)) {
                                                    if (i84 != i85) {
                                                        zzvbVar.set(i85, Integer.valueOf(iIntValue2));
                                                    }
                                                    i85++;
                                                    i86 = i49;
                                                } else {
                                                    i86 = i49;
                                                    objZzn2 = zzwj.zzn(obj3, i86, iIntValue2, objZzn2, zzwvVar2);
                                                }
                                                i84++;
                                                iZzl2 = i1017;
                                                i49 = i86;
                                            }
                                            i82 = iZzl2;
                                            i83 = i49;
                                            if (i85 != size) {
                                                zzvbVar.subList(i85, size).clear();
                                            }
                                        } else {
                                            i82 = iZzl2;
                                            i83 = i49;
                                            it = zzvbVar.iterator();
                                            objZzn = null;
                                            while (it.hasNext()) {
                                                iIntValue = ((Integer) it.next()).intValue();
                                                if (!zzvaVarZzu2.zza(iIntValue)) {
                                                    objZzn = zzwj.zzn(obj3, i83, iIntValue, objZzn, zzwvVar2);
                                                    it.remove();
                                                }
                                            }
                                        }
                                        iZzl = i82;
                                        i64 = i83;
                                        i54 = i54;
                                        zztjVar3 = zztjVar3;
                                        unsafe8 = r12;
                                        zzvzVar = this;
                                        if (iZzl != i62) {
                                            zztjVar5 = zztjVar3;
                                            i96 = i64;
                                            i91 = i61;
                                            i93 = i54;
                                            unsafe9 = unsafe8;
                                            i94 = i63;
                                            obj3 = obj;
                                            iZzi = iZzl;
                                        } else {
                                            i22 = iZzl;
                                            unsafe = unsafe8;
                                            i94 = i63;
                                            i97 = i97;
                                            i21 = i12;
                                            zztjVar2 = zztjVar3;
                                            i19 = i54;
                                            obj3 = obj;
                                            i20 = i64;
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        i61 = i11;
                                        i62 = i28;
                                        i63 = i29;
                                        if (i26 == 2) {
                                            if (i26 == 0) {
                                                zzuxVar3 = (zzux) zzvbVar;
                                                iZzl = zztk.zzj(bArr3, i62, zztjVar3);
                                                zzuxVar3.zzf(zzty.zzb(zztjVar3.zza));
                                                while (iZzl < i61) {
                                                    iZzj16 = zztk.zzj(bArr3, iZzl, zztjVar3);
                                                    if (i63 == zztjVar3.zza) {
                                                        iZzl = zztk.zzj(bArr3, iZzj16, zztjVar3);
                                                        zzuxVar3.zzf(zzty.zzb(zztjVar3.zza));
                                                    }
                                                }
                                            }
                                            i64 = i49;
                                            unsafe8 = r12;
                                            iZzl = i62;
                                            if (iZzl != i62) {
                                                zztjVar5 = zztjVar3;
                                                i96 = i64;
                                                i91 = i61;
                                                i93 = i54;
                                                unsafe9 = unsafe8;
                                                i94 = i63;
                                                obj3 = obj;
                                                iZzi = iZzl;
                                            } else {
                                                i22 = iZzl;
                                                unsafe = unsafe8;
                                                i94 = i63;
                                                i97 = i97;
                                                i21 = i12;
                                                zztjVar2 = zztjVar3;
                                                i19 = i54;
                                                obj3 = obj;
                                                i20 = i64;
                                            }
                                        } else {
                                            zzuxVar4 = (zzux) zzvbVar;
                                            iZzj17 = zztk.zzj(bArr3, i62, zztjVar3);
                                            i87 = zztjVar3.zza + iZzj17;
                                            while (iZzj17 < i87) {
                                                iZzj17 = zztk.zzj(bArr3, iZzj17, zztjVar3);
                                                zzuxVar4.zzf(zzty.zzb(zztjVar3.zza));
                                            }
                                            if (iZzj17 != i87) {
                                                throw new zzve("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            iZzl = iZzj17;
                                        }
                                        i64 = i49;
                                        unsafe8 = unsafe3;
                                        if (iZzl != i62) {
                                            zztjVar5 = zztjVar3;
                                            i96 = i64;
                                            i91 = i61;
                                            i93 = i54;
                                            unsafe9 = unsafe8;
                                            i94 = i63;
                                            obj3 = obj;
                                            iZzi = iZzl;
                                        } else {
                                            i22 = iZzl;
                                            unsafe = unsafe8;
                                            i94 = i63;
                                            i97 = i97;
                                            i21 = i12;
                                            zztjVar2 = zztjVar3;
                                            i19 = i54;
                                            obj3 = obj;
                                            i20 = i64;
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        i61 = i11;
                                        i63 = i29;
                                        if (i26 == 2) {
                                            i62 = i28;
                                            if (i26 == 0) {
                                                zzvlVar5 = (zzvl) zzvbVar;
                                                iZzl = zztk.zzm(bArr3, i62, zztjVar3);
                                                zzvlVar5.zzf(zzty.zzc(zztjVar3.zzb));
                                                while (iZzl < i61) {
                                                    iZzj18 = zztk.zzj(bArr3, iZzl, zztjVar3);
                                                    if (i63 == zztjVar3.zza) {
                                                        iZzl = zztk.zzm(bArr3, iZzj18, zztjVar3);
                                                        zzvlVar5.zzf(zzty.zzc(zztjVar3.zzb));
                                                    }
                                                }
                                            }
                                            i64 = i49;
                                            unsafe8 = r12;
                                            iZzl = i62;
                                            if (iZzl != i62) {
                                                zztjVar5 = zztjVar3;
                                                i96 = i64;
                                                i91 = i61;
                                                i93 = i54;
                                                unsafe9 = unsafe8;
                                                i94 = i63;
                                                obj3 = obj;
                                                iZzi = iZzl;
                                            } else {
                                                i22 = iZzl;
                                                unsafe = unsafe8;
                                                i94 = i63;
                                                i97 = i97;
                                                i21 = i12;
                                                zztjVar2 = zztjVar3;
                                                i19 = i54;
                                                obj3 = obj;
                                                i20 = i64;
                                            }
                                        } else {
                                            zzvlVar6 = (zzvl) zzvbVar;
                                            i62 = i28;
                                            iZzj17 = zztk.zzj(bArr3, i62, zztjVar3);
                                            i88 = zztjVar3.zza + iZzj17;
                                            while (iZzj17 < i88) {
                                                iZzj17 = zztk.zzm(bArr3, iZzj17, zztjVar3);
                                                zzvlVar6.zzf(zzty.zzc(zztjVar3.zzb));
                                            }
                                            if (iZzj17 != i88) {
                                                throw new zzve("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            iZzl = iZzj17;
                                        }
                                        i64 = i49;
                                        unsafe8 = unsafe3;
                                        if (iZzl != i62) {
                                            zztjVar5 = zztjVar3;
                                            i96 = i64;
                                            i91 = i61;
                                            i93 = i54;
                                            unsafe9 = unsafe8;
                                            i94 = i63;
                                            obj3 = obj;
                                            iZzi = iZzl;
                                        } else {
                                            i22 = iZzl;
                                            unsafe = unsafe8;
                                            i94 = i63;
                                            i97 = i97;
                                            i21 = i12;
                                            zztjVar2 = zztjVar3;
                                            i19 = i54;
                                            obj3 = obj;
                                            i20 = i64;
                                        }
                                        break;
                                    default:
                                        if (i26 == 3) {
                                            i89 = (i29 & (-8)) | 4;
                                            zzwhVarZzv = zzvzVar.zzv(i54);
                                            iZzl = zztk.zzd(zzwhVarZzv, bArr, i28, i11, i89, zztjVar);
                                            zzvbVar.add(zztjVar3.zzc);
                                            i61 = i11;
                                            while (true) {
                                                if (iZzl < i61) {
                                                    iZzj19 = zztk.zzj(bArr3, iZzl, zztjVar3);
                                                    i90 = i29;
                                                    if (i90 == zztjVar3.zza) {
                                                        iZzl = zztk.zzd(zzwhVarZzv, bArr, iZzj19, i11, i89, zztjVar);
                                                        zzvbVar.add(zztjVar3.zzc);
                                                        i29 = i90;
                                                    } else {
                                                        i63 = i90;
                                                    }
                                                } else {
                                                    i63 = i29;
                                                }
                                            }
                                            i62 = i28;
                                            i64 = i49;
                                            unsafe8 = unsafe3;
                                            if (iZzl != i62) {
                                                zztjVar5 = zztjVar3;
                                                i96 = i64;
                                                i91 = i61;
                                                i93 = i54;
                                                unsafe9 = unsafe8;
                                                i94 = i63;
                                                obj3 = obj;
                                                iZzi = iZzl;
                                            } else {
                                                i22 = iZzl;
                                                unsafe = unsafe8;
                                                i94 = i63;
                                                i97 = i97;
                                                i21 = i12;
                                                zztjVar2 = zztjVar3;
                                                i19 = i54;
                                                obj3 = obj;
                                                i20 = i64;
                                            }
                                        } else {
                                            i63 = i29;
                                            i61 = i11;
                                            i62 = i28;
                                            i64 = i49;
                                            unsafe8 = r12;
                                            iZzl = i62;
                                            if (iZzl != i62) {
                                                zztjVar5 = zztjVar3;
                                                i96 = i64;
                                                i91 = i61;
                                                i93 = i54;
                                                unsafe9 = unsafe8;
                                                i94 = i63;
                                                obj3 = obj;
                                                iZzi = iZzl;
                                            } else {
                                                i22 = iZzl;
                                                unsafe = unsafe8;
                                                i94 = i63;
                                                i97 = i97;
                                                i21 = i12;
                                                zztjVar2 = zztjVar3;
                                                i19 = i54;
                                                obj3 = obj;
                                                i20 = i64;
                                            }
                                        }
                                        break;
                                }
                            } else {
                                unsafe4 = unsafe3;
                                i51 = i28;
                                i52 = i29;
                                i50 = i54;
                                i53 = i49;
                                if (iZzr == 50) {
                                    obj3 = obj;
                                    zztjVar2 = zztjVar;
                                    unsafe6 = zzb;
                                    j11 = iArr[i50 + 2] & 1048575;
                                    switch (iZzr) {
                                        case 51:
                                            unsafe = unsafe4;
                                            zztjVar2 = zztjVar2;
                                            i20 = i53;
                                            i55 = i51;
                                            i56 = i52;
                                            i57 = i50;
                                            if (i26 == 1) {
                                                iZzi = i55 + 8;
                                                unsafe6.putObject(obj3, j10, Double.valueOf(Double.longBitsToDouble(zztk.zzq(bArr3, i55))));
                                                unsafe6.putInt(obj3, j11, i20);
                                            } else {
                                                iZzi = i55;
                                            }
                                            if (iZzi != i55) {
                                                i55 = i55;
                                                i91 = i11;
                                                i96 = i20;
                                                zztjVar5 = zztjVar2;
                                                i93 = i57;
                                                i94 = i56;
                                                unsafe9 = unsafe;
                                            } else {
                                                i55 = i55;
                                                i22 = iZzi;
                                                i94 = i56;
                                                i19 = i57;
                                            }
                                            break;
                                        case 52:
                                            unsafe = unsafe4;
                                            zztjVar2 = zztjVar2;
                                            i20 = i53;
                                            i55 = i51;
                                            i56 = i52;
                                            i57 = i50;
                                            if (i26 == 5) {
                                                iZzi = i55 + 4;
                                                unsafe6.putObject(obj3, j10, Float.valueOf(Float.intBitsToFloat(zztk.zzc(bArr3, i55))));
                                                unsafe6.putInt(obj3, j11, i20);
                                            } else {
                                                iZzi = i55;
                                            }
                                            if (iZzi != i55) {
                                                i55 = i55;
                                                i91 = i11;
                                                i96 = i20;
                                                zztjVar5 = zztjVar2;
                                                i93 = i57;
                                                i94 = i56;
                                                unsafe9 = unsafe;
                                            } else {
                                                i55 = i55;
                                                i22 = iZzi;
                                                i94 = i56;
                                                i19 = i57;
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            unsafe = unsafe4;
                                            zztjVar2 = zztjVar2;
                                            i20 = i53;
                                            i55 = i51;
                                            i56 = i52;
                                            i57 = i50;
                                            if (i26 == 0) {
                                                iZzm = zztk.zzm(bArr3, i55, zztjVar2);
                                                unsafe6.putObject(obj3, j10, Long.valueOf(zztjVar2.zzb));
                                                unsafe6.putInt(obj3, j11, i20);
                                                iZzi = iZzm;
                                            } else {
                                                iZzi = i55;
                                            }
                                            if (iZzi != i55) {
                                                i55 = i55;
                                                i91 = i11;
                                                i96 = i20;
                                                zztjVar5 = zztjVar2;
                                                i93 = i57;
                                                i94 = i56;
                                                unsafe9 = unsafe;
                                            } else {
                                                i55 = i55;
                                                i22 = iZzi;
                                                i94 = i56;
                                                i19 = i57;
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            unsafe = unsafe4;
                                            zztjVar2 = zztjVar2;
                                            i20 = i53;
                                            i55 = i51;
                                            i56 = i52;
                                            i57 = i50;
                                            if (i26 == 0) {
                                                iZzj2 = zztk.zzj(bArr3, i55, zztjVar2);
                                                unsafe6.putObject(obj3, j10, Integer.valueOf(zztjVar2.zza));
                                                unsafe6.putInt(obj3, j11, i20);
                                                iZzi = iZzj2;
                                            } else {
                                                iZzi = i55;
                                            }
                                            if (iZzi != i55) {
                                                i55 = i55;
                                                i91 = i11;
                                                i96 = i20;
                                                zztjVar5 = zztjVar2;
                                                i93 = i57;
                                                i94 = i56;
                                                unsafe9 = unsafe;
                                            } else {
                                                i55 = i55;
                                                i22 = iZzi;
                                                i94 = i56;
                                                i19 = i57;
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            unsafe = unsafe4;
                                            zztjVar2 = zztjVar2;
                                            i20 = i53;
                                            i55 = i51;
                                            i56 = i52;
                                            i57 = i50;
                                            if (i26 == 1) {
                                                iZzi = i55 + 8;
                                                unsafe6.putObject(obj3, j10, Long.valueOf(zztk.zzq(bArr3, i55)));
                                                unsafe6.putInt(obj3, j11, i20);
                                            } else {
                                                iZzi = i55;
                                            }
                                            if (iZzi != i55) {
                                                i55 = i55;
                                                i91 = i11;
                                                i96 = i20;
                                                zztjVar5 = zztjVar2;
                                                i93 = i57;
                                                i94 = i56;
                                                unsafe9 = unsafe;
                                            } else {
                                                i55 = i55;
                                                i22 = iZzi;
                                                i94 = i56;
                                                i19 = i57;
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            unsafe = unsafe4;
                                            zztjVar2 = zztjVar2;
                                            i20 = i53;
                                            i55 = i51;
                                            i56 = i52;
                                            i57 = i50;
                                            if (i26 == 5) {
                                                iZzi = i55 + 4;
                                                unsafe6.putObject(obj3, j10, Integer.valueOf(zztk.zzc(bArr3, i55)));
                                                unsafe6.putInt(obj3, j11, i20);
                                            } else {
                                                iZzi = i55;
                                            }
                                            if (iZzi != i55) {
                                                i55 = i55;
                                                i91 = i11;
                                                i96 = i20;
                                                zztjVar5 = zztjVar2;
                                                i93 = i57;
                                                i94 = i56;
                                                unsafe9 = unsafe;
                                            } else {
                                                i55 = i55;
                                                i22 = iZzi;
                                                i94 = i56;
                                                i19 = i57;
                                            }
                                            break;
                                        case 58:
                                            unsafe = unsafe4;
                                            zztjVar2 = zztjVar2;
                                            i20 = i53;
                                            i55 = i51;
                                            i56 = i52;
                                            i57 = i50;
                                            if (i26 == 0) {
                                                iZzm = zztk.zzm(bArr3, i55, zztjVar2);
                                                if (zztjVar2.zzb != 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                unsafe6.putObject(obj3, j10, Boolean.valueOf(z11));
                                                unsafe6.putInt(obj3, j11, i20);
                                                iZzi = iZzm;
                                            } else {
                                                iZzi = i55;
                                            }
                                            if (iZzi != i55) {
                                                i55 = i55;
                                                i91 = i11;
                                                i96 = i20;
                                                zztjVar5 = zztjVar2;
                                                i93 = i57;
                                                i94 = i56;
                                                unsafe9 = unsafe;
                                            } else {
                                                i55 = i55;
                                                i22 = iZzi;
                                                i94 = i56;
                                                i19 = i57;
                                            }
                                            break;
                                        case 59:
                                            unsafe = unsafe4;
                                            i56 = i52;
                                            zztjVar2 = zztjVar2;
                                            i57 = i50;
                                            i20 = i53;
                                            i55 = i51;
                                            if (i26 == 2) {
                                                iZzj2 = zztk.zzj(bArr3, i55, zztjVar2);
                                                i58 = zztjVar2.zza;
                                                if (i58 == 0) {
                                                    unsafe6.putObject(obj3, j10, "");
                                                } else {
                                                    i59 = iZzj2 + i58;
                                                    if ((i27 & PKIFailureInfo.duplicateCertReq) == 0) {
                                                    }
                                                    unsafe6.putObject(obj3, j10, new String(bArr3, iZzj2, i58, zzvc.zza));
                                                    iZzj2 = i59;
                                                }
                                                unsafe6.putInt(obj3, j11, i20);
                                                iZzi = iZzj2;
                                                if (iZzi != i55) {
                                                    i55 = i55;
                                                    i91 = i11;
                                                    i96 = i20;
                                                    zztjVar5 = zztjVar2;
                                                    i93 = i57;
                                                    i94 = i56;
                                                    unsafe9 = unsafe;
                                                } else {
                                                    i55 = i55;
                                                    i22 = iZzi;
                                                    i94 = i56;
                                                    i19 = i57;
                                                }
                                            }
                                            i56 = i56;
                                            iZzi = i55;
                                            if (iZzi != i55) {
                                                i55 = i55;
                                                i91 = i11;
                                                i96 = i20;
                                                zztjVar5 = zztjVar2;
                                                i93 = i57;
                                                i94 = i56;
                                                unsafe9 = unsafe;
                                            } else {
                                                i55 = i55;
                                                i22 = iZzi;
                                                i94 = i56;
                                                i19 = i57;
                                            }
                                            break;
                                        case 60:
                                            unsafe = unsafe4;
                                            i56 = i52;
                                            i57 = i50;
                                            i20 = i53;
                                            i55 = i51;
                                            if (i26 == 2) {
                                                Object objZzy3 = zzvzVar.zzy(obj3, i20, i57);
                                                int iZzo4 = zztk.zzo(objZzy3, zzvzVar.zzv(i57), bArr, i55, i11, zztjVar);
                                                zzvzVar.zzG(obj3, i20, i57, objZzy3);
                                                iZzi = iZzo4;
                                                i56 = i56;
                                                if (iZzi != i55) {
                                                    i55 = i55;
                                                    i91 = i11;
                                                    i96 = i20;
                                                    zztjVar5 = zztjVar2;
                                                    i93 = i57;
                                                    i94 = i56;
                                                    unsafe9 = unsafe;
                                                } else {
                                                    i55 = i55;
                                                    i22 = iZzi;
                                                    i94 = i56;
                                                    i19 = i57;
                                                }
                                            }
                                            zztjVar2 = zztjVar2;
                                            i56 = i56;
                                            iZzi = i55;
                                            if (iZzi != i55) {
                                                i55 = i55;
                                                i91 = i11;
                                                i96 = i20;
                                                zztjVar5 = zztjVar2;
                                                i93 = i57;
                                                i94 = i56;
                                                unsafe9 = unsafe;
                                            } else {
                                                i55 = i55;
                                                i22 = iZzi;
                                                i94 = i56;
                                                i19 = i57;
                                            }
                                            break;
                                        case 61:
                                            unsafe = unsafe4;
                                            i56 = i52;
                                            i57 = i50;
                                            i20 = i53;
                                            i55 = i51;
                                            if (i26 == 2) {
                                                iZza2 = zztk.zza(bArr3, i55, zztjVar2);
                                                unsafe6.putObject(obj3, j10, zztjVar2.zzc);
                                                unsafe6.putInt(obj3, j11, i20);
                                                iZzi = iZza2;
                                                i56 = i56;
                                                if (iZzi != i55) {
                                                    i55 = i55;
                                                    i91 = i11;
                                                    i96 = i20;
                                                    zztjVar5 = zztjVar2;
                                                    i93 = i57;
                                                    i94 = i56;
                                                    unsafe9 = unsafe;
                                                } else {
                                                    i55 = i55;
                                                    i22 = iZzi;
                                                    i94 = i56;
                                                    i19 = i57;
                                                }
                                            }
                                            zztjVar2 = zztjVar2;
                                            i56 = i56;
                                            iZzi = i55;
                                            if (iZzi != i55) {
                                                i55 = i55;
                                                i91 = i11;
                                                i96 = i20;
                                                zztjVar5 = zztjVar2;
                                                i93 = i57;
                                                i94 = i56;
                                                unsafe9 = unsafe;
                                            } else {
                                                i55 = i55;
                                                i22 = iZzi;
                                                i94 = i56;
                                                i19 = i57;
                                            }
                                            break;
                                        case 63:
                                            unsafe = unsafe4;
                                            i20 = i53;
                                            i55 = i51;
                                            i56 = i52;
                                            i57 = i50;
                                            if (i26 == 0) {
                                                iZza2 = zztk.zzj(bArr3, i55, zztjVar2);
                                                i60 = zztjVar2.zza;
                                                zzvaVarZzu = zzvzVar.zzu(i57);
                                                if (zzvaVarZzu != null) {
                                                    i56 = i56;
                                                    unsafe6.putObject(obj3, j10, Integer.valueOf(i60));
                                                    unsafe6.putInt(obj3, j11, i20);
                                                } else {
                                                    i56 = i56;
                                                    unsafe6.putObject(obj3, j10, Integer.valueOf(i60));
                                                    unsafe6.putInt(obj3, j11, i20);
                                                }
                                                iZzi = iZza2;
                                                i56 = i56;
                                                if (iZzi != i55) {
                                                    i55 = i55;
                                                    i91 = i11;
                                                    i96 = i20;
                                                    zztjVar5 = zztjVar2;
                                                    i93 = i57;
                                                    i94 = i56;
                                                    unsafe9 = unsafe;
                                                } else {
                                                    i55 = i55;
                                                    i22 = iZzi;
                                                    i94 = i56;
                                                    i19 = i57;
                                                }
                                            }
                                            zztjVar2 = zztjVar2;
                                            iZzi = i55;
                                            if (iZzi != i55) {
                                                i55 = i55;
                                                i91 = i11;
                                                i96 = i20;
                                                zztjVar5 = zztjVar2;
                                                i93 = i57;
                                                i94 = i56;
                                                unsafe9 = unsafe;
                                            } else {
                                                i55 = i55;
                                                i22 = iZzi;
                                                i94 = i56;
                                                i19 = i57;
                                            }
                                            break;
                                        case 66:
                                            unsafe = unsafe4;
                                            i56 = i52;
                                            i57 = i50;
                                            i20 = i53;
                                            if (i26 == 0) {
                                                i55 = i51;
                                                int iZzj23 = zztk.zzj(bArr3, i55, zztjVar2);
                                                unsafe6.putObject(obj3, j10, Integer.valueOf(zzty.zzb(zztjVar2.zza)));
                                                unsafe6.putInt(obj3, j11, i20);
                                                iZzi = iZzj23;
                                                zztjVar2 = zztjVar2;
                                                if (iZzi != i55) {
                                                    i55 = i55;
                                                    i91 = i11;
                                                    i96 = i20;
                                                    zztjVar5 = zztjVar2;
                                                    i93 = i57;
                                                    i94 = i56;
                                                    unsafe9 = unsafe;
                                                } else {
                                                    i55 = i55;
                                                    i22 = iZzi;
                                                    i94 = i56;
                                                    i19 = i57;
                                                }
                                            } else {
                                                i55 = i51;
                                                zztjVar2 = zztjVar2;
                                                iZzi = i55;
                                                if (iZzi != i55) {
                                                    i55 = i55;
                                                    i91 = i11;
                                                    i96 = i20;
                                                    zztjVar5 = zztjVar2;
                                                    i93 = i57;
                                                    i94 = i56;
                                                    unsafe9 = unsafe;
                                                } else {
                                                    i55 = i55;
                                                    i22 = iZzi;
                                                    i94 = i56;
                                                    i19 = i57;
                                                }
                                            }
                                            break;
                                        case 67:
                                            unsafe = unsafe4;
                                            i20 = i53;
                                            i55 = i51;
                                            i56 = i52;
                                            i57 = i50;
                                            if (i26 == 0) {
                                                int iZzm7 = zztk.zzm(bArr3, i55, zztjVar2);
                                                unsafe6.putObject(obj3, j10, Long.valueOf(zzty.zzc(zztjVar2.zzb)));
                                                unsafe6.putInt(obj3, j11, i20);
                                                iZzi = iZzm7;
                                                zztjVar2 = zztjVar2;
                                            } else {
                                                zztjVar2 = zztjVar2;
                                                iZzi = i55;
                                            }
                                            if (iZzi != i55) {
                                                i55 = i55;
                                                i91 = i11;
                                                i96 = i20;
                                                zztjVar5 = zztjVar2;
                                                i93 = i57;
                                                i94 = i56;
                                                unsafe9 = unsafe;
                                            } else {
                                                i55 = i55;
                                                i22 = iZzi;
                                                i94 = i56;
                                                i19 = i57;
                                            }
                                            break;
                                        case 68:
                                            if (i26 == 3) {
                                                int i1018 = (i52 & (-8)) | 4;
                                                Object objZzy4 = zzvzVar.zzy(obj3, i53, i50);
                                                i55 = i51;
                                                i56 = i52;
                                                i57 = i50;
                                                unsafe = unsafe4;
                                                iZzi = zztk.zzn(objZzy4, zzvzVar.zzv(i50), bArr, i55, i11, i1018, zztjVar);
                                                zzvzVar.zzG(obj3, i53, i57, objZzy4);
                                                bArr3 = bArr3;
                                                i20 = i53;
                                                zztjVar2 = zztjVar2;
                                                if (iZzi != i55) {
                                                    i55 = i55;
                                                    i91 = i11;
                                                    i96 = i20;
                                                    zztjVar5 = zztjVar2;
                                                    i93 = i57;
                                                    i94 = i56;
                                                    unsafe9 = unsafe;
                                                } else {
                                                    i55 = i55;
                                                    i22 = iZzi;
                                                    i94 = i56;
                                                    i19 = i57;
                                                }
                                            } else {
                                                unsafe = unsafe4;
                                                i56 = i52;
                                                i57 = i50;
                                                zztjVar2 = zztjVar2;
                                                i20 = i53;
                                                i55 = i51;
                                                iZzi = i55;
                                                if (iZzi != i55) {
                                                    i55 = i55;
                                                    i91 = i11;
                                                    i96 = i20;
                                                    zztjVar5 = zztjVar2;
                                                    i93 = i57;
                                                    i94 = i56;
                                                    unsafe9 = unsafe;
                                                } else {
                                                    i55 = i55;
                                                    i22 = iZzi;
                                                    i94 = i56;
                                                    i19 = i57;
                                                }
                                            }
                                            break;
                                        default:
                                            unsafe = unsafe4;
                                            zztjVar2 = zztjVar2;
                                            i20 = i53;
                                            i55 = i51;
                                            i56 = i52;
                                            i57 = i50;
                                            iZzi = i55;
                                            if (iZzi != i55) {
                                                i55 = i55;
                                                i91 = i11;
                                                i96 = i20;
                                                zztjVar5 = zztjVar2;
                                                i93 = i57;
                                                i94 = i56;
                                                unsafe9 = unsafe;
                                            } else {
                                                i55 = i55;
                                                i22 = iZzi;
                                                i94 = i56;
                                                i19 = i57;
                                            }
                                            break;
                                    }
                                } else {
                                    if (i26 == 2) {
                                        unsafe5 = zzb;
                                        Object objZzw2 = zzvzVar.zzw(i50);
                                        object = unsafe5.getObject(obj, j10);
                                        if (!((zzvq) object).zze()) {
                                            zzvq zzvqVarZzb2 = zzvq.zza().zzb();
                                            zzvr.zza(zzvqVarZzb2, object);
                                            unsafe5.putObject(obj, j10, zzvqVarZzb2);
                                        }
                                        throw null;
                                    }
                                    obj3 = obj;
                                    zztjVar4 = zztjVar;
                                    i22 = i51;
                                    unsafe = unsafe4;
                                    zztjVar2 = zztjVar4;
                                    i19 = i50;
                                    i20 = i53;
                                    i94 = i52;
                                }
                                i21 = i12;
                            }
                            bArr4 = bArr3;
                        } else if (i26 == 2) {
                            zzvbVarZzd = (zzvb) unsafe3.getObject(obj3, j10);
                            if (!zzvbVarZzd.zzc()) {
                                int size5 = zzvbVarZzd.size();
                                zzvbVarZzd = zzvbVarZzd.zzd(size5 != 0 ? size5 + size5 : 10);
                                unsafe3.putObject(obj3, j10, zzvbVarZzd);
                            }
                            iZzi = zztk.zzf(zzvzVar.zzv(i48), i29, bArr, i28, i11, zzvbVarZzd, zztjVar);
                            i91 = i11;
                            i93 = i48;
                            i12 = i12;
                            i97 = i97;
                            i94 = i29;
                            i95 = i95;
                            i96 = i49;
                            bArr4 = bArr;
                            i92 = 0;
                            unsafe9 = unsafe3;
                            zztjVar5 = zztjVar3;
                        } else {
                            i95 = i95;
                            zztjVar4 = zztjVar3;
                            i50 = i48;
                            i51 = i28;
                            i52 = i29;
                            unsafe4 = unsafe3;
                            i53 = i49;
                            i22 = i51;
                            unsafe = unsafe4;
                            zztjVar2 = zztjVar4;
                            i19 = i50;
                            i20 = i53;
                            i94 = i52;
                            i21 = i12;
                        }
                    }
                }
                if (i94 == i21) {
                }
                if (zzvzVar.zzh) {
                    zzuhVar = zztjVar2.zzd;
                    int i1019 = zzuh.zzb;
                    int i111 = zzwe.zza;
                    if (zzuhVar != zzuh.zza) {
                        zzvw zzvwVar2 = zzvzVar.zzg;
                        zzwvVar = zzvzVar.zzl;
                        zzuuVarZzb = zzuhVar.zzb(zzvwVar2, i20);
                        if (zzuuVarZzb == null) {
                            iZzi = zztk.zzi(i94, bArr, i22, i11, zzd(obj), zztjVar);
                            i23 = i94;
                            i24 = i21;
                            i25 = i11;
                        } else {
                            zzus zzusVar2 = (zzus) obj3;
                            zzusVar2.zzb();
                            i23 = i94;
                            iZzi = zztk.zzb(i94, bArr, i22, i11, zzusVar2, zzuuVarZzb, zzwvVar, zztjVar);
                            i24 = i21;
                            i25 = i11;
                        }
                    } else {
                        i23 = i94;
                        i24 = i21;
                        i25 = i11;
                        iZzi = zztk.zzi(i23, bArr, i22, i11, zzd(obj), zztjVar);
                    }
                } else {
                    i23 = i94;
                    i24 = i21;
                    i25 = i11;
                    iZzi = zztk.zzi(i23, bArr, i22, i11, zzd(obj), zztjVar);
                }
                bArr4 = bArr;
                zztjVar5 = zztjVar;
                i12 = i24;
                i91 = i25;
                i96 = i20;
                i92 = i92;
                i93 = i19;
                i97 = i97;
                i94 = i23;
                i95 = i95;
                unsafe9 = unsafe;
            } else {
                unsafe = unsafe9;
                i13 = i91;
                i14 = i12;
                int i112 = i95;
                i15 = 1048575;
                i16 = i112;
            }
        }
        if (i97 != i15) {
            unsafe.putInt(obj3, i97, i16);
        }
        for (int i113 = zzvzVar.zzj; i113 < zzvzVar.zzk; i113++) {
            int[] iArr2 = zzvzVar.zzi;
            int[] iArr3 = zzvzVar.zzc;
            int i114 = iArr2[i113];
            int i115 = iArr3[i114];
            Object objZzf = zzxc.zzf(obj3, zzvzVar.zzs(i114) & i15);
            if (objZzf != null && zzvzVar.zzu(i114) != null) {
                throw null;
            }
        }
        if (i14 == 0) {
            if (iZzi != i13) {
                throw new zzve("Failed to parse the message.");
            }
        } else if (iZzi > i13 || i94 != i14) {
            throw new zzve("Failed to parse the message.");
        }
        return iZzi;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    public final Object zze() {
        return ((zzuw) this.zzg).zzy();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzuw) {
                zzuw zzuwVar = (zzuw) obj;
                zzuwVar.zzG(Integer.MAX_VALUE);
                zzuwVar.zza = 0;
                zzuwVar.zzE();
            }
            int[] iArr = this.zzc;
            for (int i10 = 0; i10 < iArr.length; i10 += 3) {
                int iZzs = zzs(i10);
                int i11 = 1048575 & iZzs;
                int iZzr = zzr(iZzs);
                long j10 = i11;
                if (iZzr != 9) {
                    if (iZzr != 60 && iZzr != 68) {
                        switch (iZzr) {
                            case 17:
                                if (zzI(obj, i10)) {
                                    zzv(i10).zzf(zzb.getObject(obj, j10));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((zzvb) zzxc.zzf(obj, j10)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzvq) object).zzc();
                                    unsafe.putObject(obj, j10, object);
                                }
                                break;
                        }
                    } else if (zzM(obj, this.zzc[i10], i10)) {
                        zzv(i10).zzf(zzb.getObject(obj, j10));
                    }
                } else if (zzI(obj, i10)) {
                    zzv(i10).zzf(zzb.getObject(obj, j10));
                }
            }
            this.zzl.zza(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzs = zzs(i10);
            int i11 = 1048575 & iZzs;
            int[] iArr = this.zzc;
            int iZzr = zzr(iZzs);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iZzr) {
                case 0:
                    if (zzI(obj2, i10)) {
                        zzxc.zzo(obj, j10, zzxc.zza(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 1:
                    if (zzI(obj2, i10)) {
                        zzxc.zzp(obj, j10, zzxc.zzb(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 2:
                    if (zzI(obj2, i10)) {
                        zzxc.zzr(obj, j10, zzxc.zzd(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 3:
                    if (zzI(obj2, i10)) {
                        zzxc.zzr(obj, j10, zzxc.zzd(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 4:
                    if (zzI(obj2, i10)) {
                        zzxc.zzq(obj, j10, zzxc.zzc(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 5:
                    if (zzI(obj2, i10)) {
                        zzxc.zzr(obj, j10, zzxc.zzd(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 6:
                    if (zzI(obj2, i10)) {
                        zzxc.zzq(obj, j10, zzxc.zzc(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 7:
                    if (zzI(obj2, i10)) {
                        zzxc.zzm(obj, j10, zzxc.zzw(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 8:
                    if (zzI(obj2, i10)) {
                        zzxc.zzs(obj, j10, zzxc.zzf(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 9:
                    zzB(obj, obj2, i10);
                    break;
                case 10:
                    if (zzI(obj2, i10)) {
                        zzxc.zzs(obj, j10, zzxc.zzf(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 11:
                    if (zzI(obj2, i10)) {
                        zzxc.zzq(obj, j10, zzxc.zzc(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 12:
                    if (zzI(obj2, i10)) {
                        zzxc.zzq(obj, j10, zzxc.zzc(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 13:
                    if (zzI(obj2, i10)) {
                        zzxc.zzq(obj, j10, zzxc.zzc(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 14:
                    if (zzI(obj2, i10)) {
                        zzxc.zzr(obj, j10, zzxc.zzd(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 15:
                    if (zzI(obj2, i10)) {
                        zzxc.zzq(obj, j10, zzxc.zzc(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 16:
                    if (zzI(obj2, i10)) {
                        zzxc.zzr(obj, j10, zzxc.zzd(obj2, j10));
                        zzD(obj, i10);
                    }
                    break;
                case 17:
                    zzB(obj, obj2, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzvb zzvbVarZzd = (zzvb) zzxc.zzf(obj, j10);
                    zzvb zzvbVar = (zzvb) zzxc.zzf(obj2, j10);
                    int size = zzvbVarZzd.size();
                    int size2 = zzvbVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzvbVarZzd.zzc()) {
                            zzvbVarZzd = zzvbVarZzd.zzd(size2 + size);
                        }
                        zzvbVarZzd.addAll(zzvbVar);
                    }
                    if (size > 0) {
                        zzvbVar = zzvbVarZzd;
                    }
                    zzxc.zzs(obj, j10, zzvbVar);
                    break;
                case 50:
                    int i13 = zzwj.zza;
                    zzxc.zzs(obj, j10, zzvr.zza(zzxc.zzf(obj, j10), zzxc.zzf(obj2, j10)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzM(obj2, i12, i10)) {
                        zzxc.zzs(obj, j10, zzxc.zzf(obj2, j10));
                        zzE(obj, i12, i10);
                    }
                    break;
                case 60:
                    zzC(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzM(obj2, i12, i10)) {
                        zzxc.zzs(obj, j10, zzxc.zzf(obj2, j10));
                        zzE(obj, i12, i10);
                    }
                    break;
                case 68:
                    zzC(obj, obj2, i10);
                    break;
            }
        }
        zzwj.zzp(this.zzl, obj, obj2);
        if (this.zzh) {
            zzwj.zzo(this.zzm, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    public final void zzh(Object obj, byte[] bArr, int i10, int i11, zztj zztjVar) throws IOException {
        zzc(obj, bArr, i10, i11, 0, zztjVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0232  */
    /* JADX WARN: Code duplicated, block: B:101:0x0243  */
    /* JADX WARN: Code duplicated, block: B:102:0x0254  */
    /* JADX WARN: Code duplicated, block: B:103:0x0266  */
    /* JADX WARN: Code duplicated, block: B:104:0x0278  */
    /* JADX WARN: Code duplicated, block: B:105:0x028a  */
    /* JADX WARN: Code duplicated, block: B:106:0x029c  */
    /* JADX WARN: Code duplicated, block: B:107:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:108:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:109:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:113:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:114:0x030c  */
    /* JADX WARN: Code duplicated, block: B:115:0x031d  */
    /* JADX WARN: Code duplicated, block: B:116:0x032e  */
    /* JADX WARN: Code duplicated, block: B:117:0x033f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0350  */
    /* JADX WARN: Code duplicated, block: B:119:0x0365  */
    /* JADX WARN: Code duplicated, block: B:120:0x0376  */
    /* JADX WARN: Code duplicated, block: B:122:0x038a  */
    /* JADX WARN: Code duplicated, block: B:123:0x039b  */
    /* JADX WARN: Code duplicated, block: B:124:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:125:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:126:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:127:0x03df  */
    /* JADX WARN: Code duplicated, block: B:128:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:129:0x0401  */
    /* JADX WARN: Code duplicated, block: B:131:0x041b  */
    /* JADX WARN: Code duplicated, block: B:132:0x0428  */
    /* JADX WARN: Code duplicated, block: B:134:0x0441  */
    /* JADX WARN: Code duplicated, block: B:135:0x044a  */
    /* JADX WARN: Code duplicated, block: B:137:0x0463  */
    /* JADX WARN: Code duplicated, block: B:138:0x046c  */
    /* JADX WARN: Code duplicated, block: B:140:0x0485  */
    /* JADX WARN: Code duplicated, block: B:141:0x048e  */
    /* JADX WARN: Code duplicated, block: B:143:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:144:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:146:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:147:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:149:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:150:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:152:0x050d  */
    /* JADX WARN: Code duplicated, block: B:153:0x0518  */
    /* JADX WARN: Code duplicated, block: B:155:0x0531  */
    /* JADX WARN: Code duplicated, block: B:156:0x053e  */
    /* JADX WARN: Code duplicated, block: B:158:0x0557  */
    /* JADX WARN: Code duplicated, block: B:159:0x0560  */
    /* JADX WARN: Code duplicated, block: B:161:0x0579  */
    /* JADX WARN: Code duplicated, block: B:162:0x0582  */
    /* JADX WARN: Code duplicated, block: B:164:0x059b  */
    /* JADX WARN: Code duplicated, block: B:165:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:167:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:168:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:170:0x05df  */
    /* JADX WARN: Code duplicated, block: B:171:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:173:0x0601  */
    /* JADX WARN: Code duplicated, block: B:174:0x060a  */
    /* JADX WARN: Code duplicated, block: B:176:0x0623  */
    /* JADX WARN: Code duplicated, block: B:177:0x062b  */
    /* JADX WARN: Code duplicated, block: B:179:0x0644  */
    /* JADX WARN: Code duplicated, block: B:180:0x064c  */
    /* JADX WARN: Code duplicated, block: B:182:0x0665  */
    /* JADX WARN: Code duplicated, block: B:193:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x066c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x066c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x066c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x066c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x066c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x066c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x066c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x066c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x066c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x066c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x066c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x066c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x066c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x066c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x066c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x066c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x066c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x066c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00df  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:54:0x0101  */
    /* JADX WARN: Code duplicated, block: B:55:0x0109  */
    /* JADX WARN: Code duplicated, block: B:57:0x010f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0119  */
    /* JADX WARN: Code duplicated, block: B:60:0x011f  */
    /* JADX WARN: Code duplicated, block: B:61:0x012c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0132  */
    /* JADX WARN: Code duplicated, block: B:64:0x013b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0141  */
    /* JADX WARN: Code duplicated, block: B:67:0x014a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0150  */
    /* JADX WARN: Code duplicated, block: B:70:0x0159  */
    /* JADX WARN: Code duplicated, block: B:72:0x015f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0168  */
    /* JADX WARN: Code duplicated, block: B:75:0x016e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0177  */
    /* JADX WARN: Code duplicated, block: B:78:0x017d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0186  */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code duplicated, block: B:81:0x018c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0195  */
    /* JADX WARN: Code duplicated, block: B:84:0x019b  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:95:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:98:0x0210  */
    /* JADX WARN: Code duplicated, block: B:99:0x0221  */
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    public final void zzi(Object obj, zzxi zzxiVar) throws IOException {
        Map.Entry entry;
        Iterator it;
        int i10;
        Map.Entry entry2;
        int i11;
        long j10;
        boolean z10;
        boolean z11;
        if (this.zzh) {
            zzum zzumVar = ((zzus) obj).zzb;
            if (zzumVar.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzf = zzumVar.zzf();
                entry = (Map.Entry) itZzf.next();
                it = itZzf;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = this.zzc;
        Unsafe unsafe = zzb;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < iArr.length) {
            int iZzs = zzs(i14);
            int[] iArr2 = this.zzc;
            int iZzr = zzr(iZzs);
            int i15 = iArr2[i14];
            if (iZzr <= 17) {
                int i16 = iArr2[i14 + 2];
                int i17 = i16 & 1048575;
                if (i17 != i12) {
                    i13 = i17 == 1048575 ? 0 : unsafe.getInt(obj, i17);
                    i12 = i17;
                } else {
                    entry = entry;
                }
                i11 = 1 << (i16 >>> 20);
                i10 = i13;
                entry2 = entry;
            } else {
                i10 = i13;
                entry2 = entry;
                i11 = 0;
            }
            int i18 = i12;
            while (entry2 != null) {
                if (i15 < 202056002) {
                    j10 = iZzs & 1048575;
                    switch (iZzr) {
                        case 0:
                            it = it;
                            iArr = iArr;
                            if (zzJ(obj, i14, i18, i10, i11)) {
                                zzxiVar.zzf(i15, zzxc.zza(obj, j10));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 1:
                            it = it;
                            iArr = iArr;
                            if (zzJ(obj, i14, i18, i10, i11)) {
                                zzxiVar.zzo(i15, zzxc.zzb(obj, j10));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 2:
                            it = it;
                            iArr = iArr;
                            if (zzJ(obj, i14, i18, i10, i11)) {
                                zzxiVar.zzt(i15, unsafe.getLong(obj, j10));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 3:
                            it = it;
                            iArr = iArr;
                            if (zzJ(obj, i14, i18, i10, i11)) {
                                zzxiVar.zzK(i15, unsafe.getLong(obj, j10));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 4:
                            it = it;
                            iArr = iArr;
                            if (zzJ(obj, i14, i18, i10, i11)) {
                                zzxiVar.zzr(i15, unsafe.getInt(obj, j10));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 5:
                            it = it;
                            iArr = iArr;
                            if (zzJ(obj, i14, i18, i10, i11)) {
                                zzxiVar.zzm(i15, unsafe.getLong(obj, j10));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 6:
                            it = it;
                            iArr = iArr;
                            if (zzJ(obj, i14, i18, i10, i11)) {
                                zzxiVar.zzk(i15, unsafe.getInt(obj, j10));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 7:
                            it = it;
                            iArr = iArr;
                            if (zzJ(obj, i14, i18, i10, i11)) {
                                zzxiVar.zzb(i15, zzxc.zzw(obj, j10));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 8:
                            it = it;
                            iArr = iArr;
                            if (zzJ(obj, i14, i18, i10, i11)) {
                                zzO(i15, unsafe.getObject(obj, j10), zzxiVar);
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 9:
                            it = it;
                            iArr = iArr;
                            if (zzJ(obj, i14, i18, i10, i11)) {
                                zzxiVar.zzv(i15, unsafe.getObject(obj, j10), zzv(i14));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 10:
                            it = it;
                            iArr = iArr;
                            if (zzJ(obj, i14, i18, i10, i11)) {
                                zzxiVar.zzd(i15, (zztu) unsafe.getObject(obj, j10));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 11:
                            it = it;
                            iArr = iArr;
                            if (zzJ(obj, i14, i18, i10, i11)) {
                                zzxiVar.zzI(i15, unsafe.getInt(obj, j10));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 12:
                            it = it;
                            iArr = iArr;
                            if (zzJ(obj, i14, i18, i10, i11)) {
                                zzxiVar.zzi(i15, unsafe.getInt(obj, j10));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 13:
                            it = it;
                            iArr = iArr;
                            if (zzJ(obj, i14, i18, i10, i11)) {
                                zzxiVar.zzx(i15, unsafe.getInt(obj, j10));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 14:
                            it = it;
                            iArr = iArr;
                            if (zzJ(obj, i14, i18, i10, i11)) {
                                zzxiVar.zzz(i15, unsafe.getLong(obj, j10));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 15:
                            it = it;
                            iArr = iArr;
                            if (zzJ(obj, i14, i18, i10, i11)) {
                                zzxiVar.zzB(i15, unsafe.getInt(obj, j10));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 16:
                            it = it;
                            iArr = iArr;
                            if (zzJ(obj, i14, i18, i10, i11)) {
                                zzxiVar.zzD(i15, unsafe.getLong(obj, j10));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 17:
                            it = it;
                            iArr = iArr;
                            if (zzJ(obj, i14, i18, i10, i11)) {
                                zzxiVar.zzq(i15, unsafe.getObject(obj, j10), zzv(i14));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 18:
                            z10 = false;
                            zzwj.zzs(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, false);
                            it = it;
                            iArr = iArr;
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 19:
                            z10 = false;
                            zzwj.zzw(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, false);
                            it = it;
                            iArr = iArr;
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 20:
                            z10 = false;
                            zzwj.zzz(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, false);
                            it = it;
                            iArr = iArr;
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 21:
                            z10 = false;
                            zzwj.zzH(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, false);
                            it = it;
                            iArr = iArr;
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 22:
                            z10 = false;
                            zzwj.zzy(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, false);
                            it = it;
                            iArr = iArr;
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 23:
                            z10 = false;
                            zzwj.zzv(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, false);
                            it = it;
                            iArr = iArr;
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 24:
                            z10 = false;
                            zzwj.zzu(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, false);
                            it = it;
                            iArr = iArr;
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 25:
                            z10 = false;
                            zzwj.zzq(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, false);
                            it = it;
                            iArr = iArr;
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 26:
                            zzwj.zzF(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar);
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 27:
                            zzwj.zzA(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, zzv(i14));
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 28:
                            zzwj.zzr(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar);
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 29:
                            z11 = false;
                            zzwj.zzG(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, false);
                            it = it;
                            iArr = iArr;
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 30:
                            z11 = false;
                            zzwj.zzt(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, false);
                            it = it;
                            iArr = iArr;
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 31:
                            z11 = false;
                            zzwj.zzB(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, false);
                            it = it;
                            iArr = iArr;
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 32:
                            z11 = false;
                            zzwj.zzC(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, false);
                            it = it;
                            iArr = iArr;
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 33:
                            z11 = false;
                            zzwj.zzD(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, false);
                            it = it;
                            iArr = iArr;
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 34:
                            z11 = false;
                            zzwj.zzE(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, false);
                            it = it;
                            iArr = iArr;
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 35:
                            zzwj.zzs(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, true);
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 36:
                            zzwj.zzw(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, true);
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 37:
                            zzwj.zzz(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, true);
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 38:
                            zzwj.zzH(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, true);
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 39:
                            zzwj.zzy(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, true);
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 40:
                            zzwj.zzv(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, true);
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 41:
                            zzwj.zzu(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, true);
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 42:
                            zzwj.zzq(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, true);
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 43:
                            zzwj.zzG(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, true);
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 44:
                            zzwj.zzt(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, true);
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 45:
                            zzwj.zzB(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, true);
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 46:
                            zzwj.zzC(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, true);
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 47:
                            zzwj.zzD(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, true);
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 48:
                            zzwj.zzE(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, true);
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 49:
                            zzwj.zzx(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, zzv(i14));
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j10) != null) {
                                throw null;
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 51:
                            if (zzM(obj, i15, i14)) {
                                zzxiVar.zzf(i15, zzm(obj, j10));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 52:
                            if (zzM(obj, i15, i14)) {
                                zzxiVar.zzo(i15, zzn(obj, j10));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 53:
                            if (zzM(obj, i15, i14)) {
                                zzxiVar.zzt(i15, zzt(obj, j10));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 54:
                            if (zzM(obj, i15, i14)) {
                                zzxiVar.zzK(i15, zzt(obj, j10));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 55:
                            if (zzM(obj, i15, i14)) {
                                zzxiVar.zzr(i15, zzo(obj, j10));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 56:
                            if (zzM(obj, i15, i14)) {
                                zzxiVar.zzm(i15, zzt(obj, j10));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 57:
                            if (zzM(obj, i15, i14)) {
                                zzxiVar.zzk(i15, zzo(obj, j10));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 58:
                            if (zzM(obj, i15, i14)) {
                                zzxiVar.zzb(i15, zzN(obj, j10));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 59:
                            if (zzM(obj, i15, i14)) {
                                zzO(i15, unsafe.getObject(obj, j10), zzxiVar);
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 60:
                            if (zzM(obj, i15, i14)) {
                                zzxiVar.zzv(i15, unsafe.getObject(obj, j10), zzv(i14));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 61:
                            if (zzM(obj, i15, i14)) {
                                zzxiVar.zzd(i15, (zztu) unsafe.getObject(obj, j10));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 62:
                            if (zzM(obj, i15, i14)) {
                                zzxiVar.zzI(i15, zzo(obj, j10));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 63:
                            if (zzM(obj, i15, i14)) {
                                zzxiVar.zzi(i15, zzo(obj, j10));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 64:
                            if (zzM(obj, i15, i14)) {
                                zzxiVar.zzx(i15, zzo(obj, j10));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 65:
                            if (zzM(obj, i15, i14)) {
                                zzxiVar.zzz(i15, zzt(obj, j10));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 66:
                            if (zzM(obj, i15, i14)) {
                                zzxiVar.zzB(i15, zzo(obj, j10));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 67:
                            if (zzM(obj, i15, i14)) {
                                zzxiVar.zzD(i15, zzt(obj, j10));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        case 68:
                            if (zzM(obj, i15, i14)) {
                                zzxiVar.zzq(i15, unsafe.getObject(obj, j10), zzv(i14));
                            }
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                        default:
                            i14 += 3;
                            i12 = i18;
                            entry = entry2;
                            it = it;
                            iArr = iArr;
                            i13 = i10;
                            break;
                    }
                } else {
                    this.zzm.zzb(zzxiVar, entry2);
                    entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                }
            }
            j10 = iZzs & 1048575;
            switch (iZzr) {
                case 0:
                    it = it;
                    iArr = iArr;
                    if (zzJ(obj, i14, i18, i10, i11)) {
                        zzxiVar.zzf(i15, zzxc.zza(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 1:
                    it = it;
                    iArr = iArr;
                    if (zzJ(obj, i14, i18, i10, i11)) {
                        zzxiVar.zzo(i15, zzxc.zzb(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 2:
                    it = it;
                    iArr = iArr;
                    if (zzJ(obj, i14, i18, i10, i11)) {
                        zzxiVar.zzt(i15, unsafe.getLong(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 3:
                    it = it;
                    iArr = iArr;
                    if (zzJ(obj, i14, i18, i10, i11)) {
                        zzxiVar.zzK(i15, unsafe.getLong(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 4:
                    it = it;
                    iArr = iArr;
                    if (zzJ(obj, i14, i18, i10, i11)) {
                        zzxiVar.zzr(i15, unsafe.getInt(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 5:
                    it = it;
                    iArr = iArr;
                    if (zzJ(obj, i14, i18, i10, i11)) {
                        zzxiVar.zzm(i15, unsafe.getLong(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 6:
                    it = it;
                    iArr = iArr;
                    if (zzJ(obj, i14, i18, i10, i11)) {
                        zzxiVar.zzk(i15, unsafe.getInt(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 7:
                    it = it;
                    iArr = iArr;
                    if (zzJ(obj, i14, i18, i10, i11)) {
                        zzxiVar.zzb(i15, zzxc.zzw(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 8:
                    it = it;
                    iArr = iArr;
                    if (zzJ(obj, i14, i18, i10, i11)) {
                        zzO(i15, unsafe.getObject(obj, j10), zzxiVar);
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 9:
                    it = it;
                    iArr = iArr;
                    if (zzJ(obj, i14, i18, i10, i11)) {
                        zzxiVar.zzv(i15, unsafe.getObject(obj, j10), zzv(i14));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 10:
                    it = it;
                    iArr = iArr;
                    if (zzJ(obj, i14, i18, i10, i11)) {
                        zzxiVar.zzd(i15, (zztu) unsafe.getObject(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 11:
                    it = it;
                    iArr = iArr;
                    if (zzJ(obj, i14, i18, i10, i11)) {
                        zzxiVar.zzI(i15, unsafe.getInt(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 12:
                    it = it;
                    iArr = iArr;
                    if (zzJ(obj, i14, i18, i10, i11)) {
                        zzxiVar.zzi(i15, unsafe.getInt(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 13:
                    it = it;
                    iArr = iArr;
                    if (zzJ(obj, i14, i18, i10, i11)) {
                        zzxiVar.zzx(i15, unsafe.getInt(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 14:
                    it = it;
                    iArr = iArr;
                    if (zzJ(obj, i14, i18, i10, i11)) {
                        zzxiVar.zzz(i15, unsafe.getLong(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 15:
                    it = it;
                    iArr = iArr;
                    if (zzJ(obj, i14, i18, i10, i11)) {
                        zzxiVar.zzB(i15, unsafe.getInt(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 16:
                    it = it;
                    iArr = iArr;
                    if (zzJ(obj, i14, i18, i10, i11)) {
                        zzxiVar.zzD(i15, unsafe.getLong(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 17:
                    it = it;
                    iArr = iArr;
                    if (zzJ(obj, i14, i18, i10, i11)) {
                        zzxiVar.zzq(i15, unsafe.getObject(obj, j10), zzv(i14));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 18:
                    z10 = false;
                    zzwj.zzs(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, false);
                    it = it;
                    iArr = iArr;
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 19:
                    z10 = false;
                    zzwj.zzw(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, false);
                    it = it;
                    iArr = iArr;
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 20:
                    z10 = false;
                    zzwj.zzz(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, false);
                    it = it;
                    iArr = iArr;
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 21:
                    z10 = false;
                    zzwj.zzH(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, false);
                    it = it;
                    iArr = iArr;
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 22:
                    z10 = false;
                    zzwj.zzy(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, false);
                    it = it;
                    iArr = iArr;
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 23:
                    z10 = false;
                    zzwj.zzv(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, false);
                    it = it;
                    iArr = iArr;
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 24:
                    z10 = false;
                    zzwj.zzu(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, false);
                    it = it;
                    iArr = iArr;
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 25:
                    z10 = false;
                    zzwj.zzq(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, false);
                    it = it;
                    iArr = iArr;
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 26:
                    zzwj.zzF(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar);
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 27:
                    zzwj.zzA(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, zzv(i14));
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 28:
                    zzwj.zzr(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar);
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 29:
                    z11 = false;
                    zzwj.zzG(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, false);
                    it = it;
                    iArr = iArr;
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 30:
                    z11 = false;
                    zzwj.zzt(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, false);
                    it = it;
                    iArr = iArr;
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 31:
                    z11 = false;
                    zzwj.zzB(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, false);
                    it = it;
                    iArr = iArr;
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 32:
                    z11 = false;
                    zzwj.zzC(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, false);
                    it = it;
                    iArr = iArr;
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 33:
                    z11 = false;
                    zzwj.zzD(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, false);
                    it = it;
                    iArr = iArr;
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 34:
                    z11 = false;
                    zzwj.zzE(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, false);
                    it = it;
                    iArr = iArr;
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 35:
                    zzwj.zzs(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, true);
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 36:
                    zzwj.zzw(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, true);
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 37:
                    zzwj.zzz(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, true);
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 38:
                    zzwj.zzH(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, true);
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 39:
                    zzwj.zzy(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, true);
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 40:
                    zzwj.zzv(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, true);
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 41:
                    zzwj.zzu(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, true);
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 42:
                    zzwj.zzq(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, true);
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 43:
                    zzwj.zzG(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, true);
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 44:
                    zzwj.zzt(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, true);
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 45:
                    zzwj.zzB(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, true);
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 46:
                    zzwj.zzC(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, true);
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 47:
                    zzwj.zzD(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, true);
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 48:
                    zzwj.zzE(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, true);
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 49:
                    zzwj.zzx(this.zzc[i14], (List) unsafe.getObject(obj, j10), zzxiVar, zzv(i14));
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j10) != null) {
                        throw null;
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 51:
                    if (zzM(obj, i15, i14)) {
                        zzxiVar.zzf(i15, zzm(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 52:
                    if (zzM(obj, i15, i14)) {
                        zzxiVar.zzo(i15, zzn(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 53:
                    if (zzM(obj, i15, i14)) {
                        zzxiVar.zzt(i15, zzt(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 54:
                    if (zzM(obj, i15, i14)) {
                        zzxiVar.zzK(i15, zzt(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 55:
                    if (zzM(obj, i15, i14)) {
                        zzxiVar.zzr(i15, zzo(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 56:
                    if (zzM(obj, i15, i14)) {
                        zzxiVar.zzm(i15, zzt(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 57:
                    if (zzM(obj, i15, i14)) {
                        zzxiVar.zzk(i15, zzo(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 58:
                    if (zzM(obj, i15, i14)) {
                        zzxiVar.zzb(i15, zzN(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 59:
                    if (zzM(obj, i15, i14)) {
                        zzO(i15, unsafe.getObject(obj, j10), zzxiVar);
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 60:
                    if (zzM(obj, i15, i14)) {
                        zzxiVar.zzv(i15, unsafe.getObject(obj, j10), zzv(i14));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 61:
                    if (zzM(obj, i15, i14)) {
                        zzxiVar.zzd(i15, (zztu) unsafe.getObject(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 62:
                    if (zzM(obj, i15, i14)) {
                        zzxiVar.zzI(i15, zzo(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 63:
                    if (zzM(obj, i15, i14)) {
                        zzxiVar.zzi(i15, zzo(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 64:
                    if (zzM(obj, i15, i14)) {
                        zzxiVar.zzx(i15, zzo(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 65:
                    if (zzM(obj, i15, i14)) {
                        zzxiVar.zzz(i15, zzt(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 66:
                    if (zzM(obj, i15, i14)) {
                        zzxiVar.zzB(i15, zzo(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 67:
                    if (zzM(obj, i15, i14)) {
                        zzxiVar.zzD(i15, zzt(obj, j10));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                case 68:
                    if (zzM(obj, i15, i14)) {
                        zzxiVar.zzq(i15, unsafe.getObject(obj, j10), zzv(i14));
                    }
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
                default:
                    i14 += 3;
                    i12 = i18;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i13 = i10;
                    break;
            }
        }
        Iterator it2 = it;
        while (entry != null) {
            this.zzm.zzb(zzxiVar, entry);
            entry = it2.hasNext() ? (Map.Entry) it2.next() : null;
        }
        ((zzuw) obj).zzc.zzl(zzxiVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzI;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzs = zzs(i10);
            long j10 = iZzs & 1048575;
            switch (zzr(iZzs)) {
                case 0:
                    if (!zzH(obj, obj2, i10) || Double.doubleToLongBits(zzxc.zza(obj, j10)) != Double.doubleToLongBits(zzxc.zza(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzH(obj, obj2, i10) || Float.floatToIntBits(zzxc.zzb(obj, j10)) != Float.floatToIntBits(zzxc.zzb(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzH(obj, obj2, i10) || zzxc.zzd(obj, j10) != zzxc.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzH(obj, obj2, i10) || zzxc.zzd(obj, j10) != zzxc.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzH(obj, obj2, i10) || zzxc.zzc(obj, j10) != zzxc.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzH(obj, obj2, i10) || zzxc.zzd(obj, j10) != zzxc.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzH(obj, obj2, i10) || zzxc.zzc(obj, j10) != zzxc.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzH(obj, obj2, i10) || zzxc.zzw(obj, j10) != zzxc.zzw(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzH(obj, obj2, i10) || !zzwj.zzI(zzxc.zzf(obj, j10), zzxc.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzH(obj, obj2, i10) || !zzwj.zzI(zzxc.zzf(obj, j10), zzxc.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzH(obj, obj2, i10) || !zzwj.zzI(zzxc.zzf(obj, j10), zzxc.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzH(obj, obj2, i10) || zzxc.zzc(obj, j10) != zzxc.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzH(obj, obj2, i10) || zzxc.zzc(obj, j10) != zzxc.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzH(obj, obj2, i10) || zzxc.zzc(obj, j10) != zzxc.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzH(obj, obj2, i10) || zzxc.zzd(obj, j10) != zzxc.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzH(obj, obj2, i10) || zzxc.zzc(obj, j10) != zzxc.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzH(obj, obj2, i10) || zzxc.zzd(obj, j10) != zzxc.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzH(obj, obj2, i10) || !zzwj.zzI(zzxc.zzf(obj, j10), zzxc.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzI = zzwj.zzI(zzxc.zzf(obj, j10), zzxc.zzf(obj2, j10));
                    break;
                case 50:
                    zZzI = zzwj.zzI(zzxc.zzf(obj, j10), zzxc.zzf(obj2, j10));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzp = zzp(i10) & 1048575;
                    if (zzxc.zzc(obj, jZzp) != zzxc.zzc(obj2, jZzp) || !zzwj.zzI(zzxc.zzf(obj, j10), zzxc.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzI) {
                return false;
            }
        }
        if (!((zzuw) obj).zzc.equals(((zzuw) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzus) obj).zzb.equals(((zzus) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0 A[LOOP:1: B:45:0x00af->B:50:0x00c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00dd A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwh
    public final boolean zzk(Object obj) {
        int i10;
        int i11;
        List list;
        zzwh zzwhVarZzv;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i14 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i16 = iArr[i14];
            int i17 = iArr2[i16];
            int iZzs = zzs(i16);
            int i18 = this.zzc[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i15) {
                if (i19 != 1048575) {
                    i13 = zzb.getInt(obj, i19);
                }
                i11 = i13;
                i10 = i19;
            } else {
                i10 = i15;
                i11 = i13;
            }
            if ((268435456 & iZzs) != 0 && !zzJ(obj, i16, i10, i11, i20)) {
                return false;
            }
            int iZzr = zzr(iZzs);
            if (iZzr == 9 || iZzr == 17) {
                if (zzJ(obj, i16, i10, i11, i20) && !zzK(obj, iZzs, zzv(i16))) {
                    return false;
                }
            } else if (iZzr == 27) {
                list = (List) zzxc.zzf(obj, iZzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzwhVarZzv = zzv(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!zzwhVarZzv.zzk(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iZzr == 60 || iZzr == 68) {
                if (zzM(obj, i17, i16) && !zzK(obj, iZzs, zzv(i16))) {
                    return false;
                }
            } else if (iZzr == 49) {
                list = (List) zzxc.zzf(obj, iZzs & 1048575);
                if (list.isEmpty()) {
                    zzwhVarZzv = zzv(i16);
                    while (i12 < list.size()) {
                        if (!zzwhVarZzv.zzk(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzr == 50 && !((zzvq) zzxc.zzf(obj, iZzs & 1048575)).isEmpty()) {
                throw null;
            }
            i14++;
            i15 = i10;
            i13 = i11;
        }
        return !this.zzh || ((zzus) obj).zzb.zzl();
    }
}
