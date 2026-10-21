package com.google.android.gms.internal.auth;

import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* JADX INFO: loaded from: classes9.dex */
final class zzga<T> implements zzgi<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhj.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfx zzg;
    private final int[] zzh;
    private final int zzi;
    private final int zzj;
    private final zzfl zzk;
    private final zzgz zzl;
    private final zzem zzm;
    private final zzgc zzn;
    private final zzfs zzo;

    private zzga(int[] iArr, Object[] objArr, int i10, int i11, zzfx zzfxVar, int i12, boolean z10, int[] iArr2, int i13, int i14, zzgc zzgcVar, zzfl zzflVar, zzgz zzgzVar, zzem zzemVar, zzfs zzfsVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzh = iArr2;
        this.zzi = i13;
        this.zzj = i14;
        this.zzn = zzgcVar;
        this.zzk = zzflVar;
        this.zzl = zzgzVar;
        this.zzm = zzemVar;
        this.zzg = zzfxVar;
        this.zzo = zzfsVar;
    }

    private final void zzA(Object obj, int i10, int i11) {
        zzhj.zzn(obj, zzl(i11) & 1048575, i10);
    }

    private final void zzB(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzo(i10) & 1048575, obj2);
        zzz(obj, i10);
    }

    private final void zzC(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzo(i11) & 1048575, obj2);
        zzA(obj, i10, i11);
    }

    private final boolean zzD(Object obj, Object obj2, int i10) {
        return zzE(obj, i10) == zzE(obj2, i10);
    }

    private final boolean zzE(Object obj, int i10) {
        int iZzl = zzl(i10);
        long j10 = iZzl & 1048575;
        if (j10 != 1048575) {
            return (zzhj.zzc(obj, j10) & (1 << (iZzl >>> 20))) != 0;
        }
        int iZzo = zzo(i10);
        long j11 = iZzo & 1048575;
        switch (zzn(iZzo)) {
            case 0:
                return Double.doubleToRawLongBits(zzhj.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhj.zzb(obj, j11)) != 0;
            case 2:
                return zzhj.zzd(obj, j11) != 0;
            case 3:
                return zzhj.zzd(obj, j11) != 0;
            case 4:
                return zzhj.zzc(obj, j11) != 0;
            case 5:
                return zzhj.zzd(obj, j11) != 0;
            case 6:
                return zzhj.zzc(obj, j11) != 0;
            case 7:
                return zzhj.zzt(obj, j11);
            case 8:
                Object objZzf = zzhj.zzf(obj, j11);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzef) {
                    return !zzef.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhj.zzf(obj, j11) != null;
            case 10:
                return !zzef.zzb.equals(zzhj.zzf(obj, j11));
            case 11:
                return zzhj.zzc(obj, j11) != 0;
            case 12:
                return zzhj.zzc(obj, j11) != 0;
            case 13:
                return zzhj.zzc(obj, j11) != 0;
            case 14:
                return zzhj.zzd(obj, j11) != 0;
            case 15:
                return zzhj.zzc(obj, j11) != 0;
            case 16:
                return zzhj.zzd(obj, j11) != 0;
            case 17:
                return zzhj.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzF(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzE(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    private static boolean zzG(Object obj, int i10, zzgi zzgiVar) {
        return zzgiVar.zzi(zzhj.zzf(obj, i10 & 1048575));
    }

    private static boolean zzH(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzev) {
            return ((zzev) obj).zzm();
        }
        return true;
    }

    private final boolean zzI(Object obj, int i10, int i11) {
        return zzhj.zzc(obj, (long) (zzl(i11) & 1048575)) == i10;
    }

    public static zzha zzc(Object obj) {
        zzev zzevVar = (zzev) obj;
        zzha zzhaVar = zzevVar.zzc;
        if (zzhaVar != zzha.zza()) {
            return zzhaVar;
        }
        zzha zzhaVarZzd = zzha.zzd();
        zzevVar.zzc = zzhaVarZzd;
        return zzhaVarZzd;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0250  */
    /* JADX WARN: Code duplicated, block: B:125:0x0256  */
    /* JADX WARN: Code duplicated, block: B:128:0x026c  */
    /* JADX WARN: Code duplicated, block: B:129:0x026f  */
    public static zzga zzj(Class cls, zzfu zzfuVar, zzgc zzgcVar, zzfl zzflVar, zzgz zzgzVar, zzem zzemVar, zzfs zzfsVar) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int i11;
        int[] iArr;
        int i12;
        int i13;
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
        int i28;
        int i29;
        int iObjectFieldOffset2;
        Field fieldZzv;
        char cCharAt9;
        int i30;
        int i31;
        int i32;
        Object obj;
        Field fieldZzv2;
        int i33;
        Object obj2;
        Field fieldZzv3;
        int i34;
        char cCharAt10;
        int i35;
        char cCharAt11;
        int i36;
        char cCharAt12;
        int i37;
        char cCharAt13;
        if (!(zzfuVar instanceof zzgh)) {
            throw null;
        }
        zzgh zzghVar = (zzgh) zzfuVar;
        String strZzd = zzghVar.zzd();
        int length = strZzd.length();
        char c10 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i38 = 1;
            while (true) {
                i10 = i38 + 1;
                if (strZzd.charAt(i38) < 55296) {
                    break;
                }
                i38 = i10;
            }
        } else {
            i10 = 1;
        }
        int i39 = i10 + 1;
        int iCharAt3 = strZzd.charAt(i10);
        if (iCharAt3 >= 55296) {
            int i40 = iCharAt3 & 8191;
            int i41 = 13;
            while (true) {
                i37 = i39 + 1;
                cCharAt13 = strZzd.charAt(i39);
                if (cCharAt13 < 55296) {
                    break;
                }
                i40 |= (cCharAt13 & 8191) << i41;
                i41 += 13;
                i39 = i37;
            }
            iCharAt3 = i40 | (cCharAt13 << i41);
            i39 = i37;
        }
        if (iCharAt3 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            i12 = 0;
            i15 = 0;
            i11 = 0;
            i13 = 0;
            iArr = zza;
            i14 = 0;
        } else {
            int i42 = i39 + 1;
            int iCharAt4 = strZzd.charAt(i39);
            if (iCharAt4 >= 55296) {
                int i43 = iCharAt4 & 8191;
                int i44 = 13;
                while (true) {
                    i23 = i42 + 1;
                    cCharAt8 = strZzd.charAt(i42);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt8 & 8191) << i44;
                    i44 += 13;
                    i42 = i23;
                }
                iCharAt4 = i43 | (cCharAt8 << i44);
                i42 = i23;
            }
            int i45 = i42 + 1;
            int iCharAt5 = strZzd.charAt(i42);
            if (iCharAt5 >= 55296) {
                int i46 = iCharAt5 & 8191;
                int i47 = 13;
                while (true) {
                    i22 = i45 + 1;
                    cCharAt7 = strZzd.charAt(i45);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt7 & 8191) << i47;
                    i47 += 13;
                    i45 = i22;
                }
                iCharAt5 = i46 | (cCharAt7 << i47);
                i45 = i22;
            }
            int i48 = i45 + 1;
            int iCharAt6 = strZzd.charAt(i45);
            if (iCharAt6 >= 55296) {
                int i49 = iCharAt6 & 8191;
                int i50 = 13;
                while (true) {
                    i21 = i48 + 1;
                    cCharAt6 = strZzd.charAt(i48);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt6 & 8191) << i50;
                    i50 += 13;
                    i48 = i21;
                }
                iCharAt6 = i49 | (cCharAt6 << i50);
                i48 = i21;
            }
            int i51 = i48 + 1;
            int iCharAt7 = strZzd.charAt(i48);
            if (iCharAt7 >= 55296) {
                int i52 = iCharAt7 & 8191;
                int i53 = 13;
                while (true) {
                    i20 = i51 + 1;
                    cCharAt5 = strZzd.charAt(i51);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt5 & 8191) << i53;
                    i53 += 13;
                    i51 = i20;
                }
                iCharAt7 = i52 | (cCharAt5 << i53);
                i51 = i20;
            }
            int i54 = i51 + 1;
            iCharAt = strZzd.charAt(i51);
            if (iCharAt >= 55296) {
                int i55 = iCharAt & 8191;
                int i56 = 13;
                while (true) {
                    i19 = i54 + 1;
                    cCharAt4 = strZzd.charAt(i54);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt4 & 8191) << i56;
                    i56 += 13;
                    i54 = i19;
                }
                iCharAt = i55 | (cCharAt4 << i56);
                i54 = i19;
            }
            int i57 = i54 + 1;
            iCharAt2 = strZzd.charAt(i54);
            if (iCharAt2 >= 55296) {
                int i58 = iCharAt2 & 8191;
                int i59 = 13;
                while (true) {
                    i18 = i57 + 1;
                    cCharAt3 = strZzd.charAt(i57);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt3 & 8191) << i59;
                    i59 += 13;
                    i57 = i18;
                }
                iCharAt2 = i58 | (cCharAt3 << i59);
                i57 = i18;
            }
            int i60 = i57 + 1;
            int iCharAt8 = strZzd.charAt(i57);
            if (iCharAt8 >= 55296) {
                int i61 = iCharAt8 & 8191;
                int i62 = 13;
                while (true) {
                    i17 = i60 + 1;
                    cCharAt2 = strZzd.charAt(i60);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt2 & 8191) << i62;
                    i62 += 13;
                    i60 = i17;
                }
                iCharAt8 = i61 | (cCharAt2 << i62);
                i60 = i17;
            }
            int i63 = i60 + 1;
            int iCharAt9 = strZzd.charAt(i60);
            if (iCharAt9 >= 55296) {
                int i64 = iCharAt9 & 8191;
                int i65 = 13;
                while (true) {
                    i16 = i63 + 1;
                    cCharAt = strZzd.charAt(i63);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i64 |= (cCharAt & 8191) << i65;
                    i65 += 13;
                    i63 = i16;
                }
                iCharAt9 = i64 | (cCharAt << i65);
                i63 = i16;
            }
            i11 = iCharAt4 + iCharAt4 + iCharAt5;
            iArr = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i12 = iCharAt6;
            i13 = iCharAt9;
            i14 = iCharAt4;
            i15 = iCharAt7;
            i39 = i63;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzghVar.zze();
        Class<?> cls2 = zzghVar.zza().getClass();
        int i66 = i13 + iCharAt2;
        int i67 = iCharAt + iCharAt;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr = new Object[i67];
        int i68 = 0;
        int i69 = 0;
        int i70 = i13;
        int i71 = i66;
        while (i39 < length) {
            int i72 = i39 + 1;
            int iCharAt10 = strZzd.charAt(i39);
            if (iCharAt10 >= c10) {
                int i73 = iCharAt10 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i36 = i74 + 1;
                    cCharAt12 = strZzd.charAt(i74);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i73 |= (cCharAt12 & 8191) << i75;
                    i75 += 13;
                    i74 = i36;
                }
                iCharAt10 = i73 | (cCharAt12 << i75);
                i24 = i36;
            } else {
                i24 = i72;
            }
            int i76 = i24 + 1;
            int iCharAt11 = strZzd.charAt(i24);
            if (iCharAt11 >= c10) {
                int i77 = iCharAt11 & 8191;
                int i78 = i76;
                int i79 = 13;
                while (true) {
                    i35 = i78 + 1;
                    cCharAt11 = strZzd.charAt(i78);
                    if (cCharAt11 < c10) {
                        break;
                    }
                    i77 |= (cCharAt11 & 8191) << i79;
                    i79 += 13;
                    i78 = i35;
                }
                iCharAt11 = i77 | (cCharAt11 << i79);
                i25 = i35;
            } else {
                i25 = i76;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i68] = i69;
                i68++;
            }
            int i80 = iCharAt11 & 255;
            if (i80 >= 51) {
                int i81 = i25 + 1;
                int iCharAt12 = strZzd.charAt(i25);
                char c11 = 55296;
                if (iCharAt12 >= 55296) {
                    int i82 = iCharAt12 & 8191;
                    int i83 = 13;
                    while (true) {
                        i34 = i81 + 1;
                        cCharAt10 = strZzd.charAt(i81);
                        if (cCharAt10 < c11) {
                            break;
                        }
                        i82 |= (cCharAt10 & 8191) << i83;
                        i83 += 13;
                        i81 = i34;
                        c11 = 55296;
                    }
                    iCharAt12 = i82 | (cCharAt10 << i83);
                    i81 = i34;
                }
                int i84 = i80 - 51;
                int i85 = i81;
                if (i84 == 9 || i84 == 17) {
                    int i86 = i69 / 3;
                    i31 = i11 + 1;
                    objArr[i86 + i86 + 1] = objArrZze[i11];
                } else {
                    if (i84 == 12 && (zzghVar.zzc() == 1 || (iCharAt11 & 2048) != 0)) {
                        int i87 = i69 / 3;
                        i31 = i11 + 1;
                        objArr[i87 + i87 + 1] = objArrZze[i11];
                    }
                    i32 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i32];
                    if (obj instanceof Field) {
                        fieldZzv2 = (Field) obj;
                    } else {
                        fieldZzv2 = zzv(cls2, (String) obj);
                        objArrZze[i32] = fieldZzv2;
                    }
                    int i88 = i12;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzv2);
                    i33 = i32 + 1;
                    obj2 = objArrZze[i33];
                    if (obj2 instanceof Field) {
                        fieldZzv3 = (Field) obj2;
                    } else {
                        fieldZzv3 = zzv(cls2, (String) obj2);
                        objArrZze[i33] = fieldZzv3;
                    }
                    i26 = i88;
                    i27 = i11;
                    i28 = i85;
                    strZzd = strZzd;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzv3);
                    i29 = 0;
                }
                i11 = i31;
                i32 = iCharAt12 + iCharAt12;
                obj = objArrZze[i32];
                if (obj instanceof Field) {
                    fieldZzv2 = (Field) obj;
                } else {
                    fieldZzv2 = zzv(cls2, (String) obj);
                    objArrZze[i32] = fieldZzv2;
                }
                int i89 = i12;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzv2);
                i33 = i32 + 1;
                obj2 = objArrZze[i33];
                if (obj2 instanceof Field) {
                    fieldZzv3 = (Field) obj2;
                } else {
                    fieldZzv3 = zzv(cls2, (String) obj2);
                    objArrZze[i33] = fieldZzv3;
                }
                i26 = i89;
                i27 = i11;
                i28 = i85;
                strZzd = strZzd;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzv3);
                i29 = 0;
            } else {
                i26 = i12;
                i27 = i11 + 1;
                Field fieldZzv4 = zzv(cls2, (String) objArrZze[i11]);
                if (i80 == 9 || i80 == 17) {
                    i26 = i26;
                    int i90 = i69 / 3;
                    objArr[i90 + i90 + 1] = fieldZzv4.getType();
                } else {
                    if (i80 == 27 || i80 == 49) {
                        i26 = i26;
                        int i91 = i69 / 3;
                        i30 = i11 + 2;
                        objArr[i91 + i91 + 1] = objArrZze[i27];
                    } else if (i80 == 12 || i80 == 30 || i80 == 44) {
                        i26 = i26;
                        if (zzghVar.zzc() == 1 || (iCharAt11 & 2048) != 0) {
                            int i92 = i69 / 3;
                            i30 = i11 + 2;
                            objArr[i92 + i92 + 1] = objArrZze[i27];
                        }
                    } else if (i80 == 50) {
                        int i93 = i70 + 1;
                        iArr[i70] = i69;
                        int i94 = i69 / 3;
                        int i95 = i11 + 2;
                        int i96 = i94 + i94;
                        objArr[i96] = objArrZze[i27];
                        if ((iCharAt11 & 2048) != 0) {
                            i27 = i11 + 3;
                            objArr[i96 + 1] = objArrZze[i95];
                            i70 = i93;
                        } else {
                            i70 = i93;
                            i27 = i95;
                        }
                    }
                    i27 = i30;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzv4);
                iObjectFieldOffset = 1048575;
                if ((iCharAt11 & 4096) == 0 || i80 > 17) {
                    i28 = i25;
                    i29 = 0;
                } else {
                    int i97 = i25 + 1;
                    int iCharAt13 = strZzd.charAt(i25);
                    if (iCharAt13 >= 55296) {
                        int i98 = iCharAt13 & 8191;
                        int i99 = 13;
                        while (true) {
                            i28 = i97 + 1;
                            cCharAt9 = strZzd.charAt(i97);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i98 |= (cCharAt9 & 8191) << i99;
                            i99 += 13;
                            i97 = i28;
                        }
                        iCharAt13 = i98 | (cCharAt9 << i99);
                    } else {
                        i28 = i97;
                    }
                    int i100 = (iCharAt13 / 32) + i14 + i14;
                    Object obj3 = objArrZze[i100];
                    if (obj3 instanceof Field) {
                        fieldZzv = (Field) obj3;
                    } else {
                        fieldZzv = zzv(cls2, (String) obj3);
                        objArrZze[i100] = fieldZzv;
                    }
                    i29 = iCharAt13 % 32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzv);
                }
                if (i80 >= 18 && i80 <= 49) {
                    iArr[i71] = iObjectFieldOffset3;
                    i71++;
                }
                iObjectFieldOffset2 = iObjectFieldOffset3;
            }
            int i101 = i69 + 1;
            iArr2[i69] = iCharAt10;
            int i102 = i69 + 2;
            iArr2[i101] = iObjectFieldOffset2 | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | ((iCharAt11 & 512) != 0 ? PKIFailureInfo.duplicateCertReq : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i80 << 20);
            i69 += 3;
            iArr2[i102] = (i29 << 20) | iObjectFieldOffset;
            strZzd = strZzd;
            i39 = i28;
            length = length;
            i12 = i26;
            i11 = i27;
            i15 = i15;
            c10 = 55296;
        }
        return new zzga(iArr2, objArr, i12, i15, zzghVar.zza(), zzghVar.zzc(), false, iArr, i13, i66, zzgcVar, zzflVar, zzgzVar, zzemVar, zzfsVar);
    }

    private static int zzk(Object obj, long j10) {
        return ((Integer) zzhj.zzf(obj, j10)).intValue();
    }

    private final int zzl(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzm(int i10, int i11) {
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

    private static int zzn(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzo(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzp(Object obj, long j10) {
        return ((Long) zzhj.zzf(obj, j10)).longValue();
    }

    private final zzey zzq(int i10) {
        int i11 = i10 / 3;
        return (zzey) this.zzd[i11 + i11 + 1];
    }

    private final zzgi zzr(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzgi zzgiVar = (zzgi) this.zzd[i12];
        if (zzgiVar != null) {
            return zzgiVar;
        }
        zzgi zzgiVarZzb = zzgf.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzgiVarZzb;
        return zzgiVarZzb;
    }

    private final Object zzs(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final Object zzt(Object obj, int i10) {
        zzgi zzgiVarZzr = zzr(i10);
        int iZzo = zzo(i10) & 1048575;
        if (!zzE(obj, i10)) {
            return zzgiVarZzr.zzd();
        }
        Object object = zzb.getObject(obj, iZzo);
        if (zzH(object)) {
            return object;
        }
        Object objZzd = zzgiVarZzr.zzd();
        if (object != null) {
            zzgiVarZzr.zzf(objZzd, object);
        }
        return objZzd;
    }

    private final Object zzu(Object obj, int i10, int i11) {
        zzgi zzgiVarZzr = zzr(i11);
        if (!zzI(obj, i10, i11)) {
            return zzgiVarZzr.zzd();
        }
        Object object = zzb.getObject(obj, zzo(i11) & 1048575);
        if (zzH(object)) {
            return object;
        }
        Object objZzd = zzgiVarZzr.zzd();
        if (object != null) {
            zzgiVarZzr.zzf(objZzd, object);
        }
        return objZzd;
    }

    private static Field zzv(Class cls, String str) {
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
            StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("Field ", str, " for ", name, " not found. Known fields are ");
            sbC.append(string);
            throw new RuntimeException(sbC.toString());
        }
    }

    private static void zzw(Object obj) {
        if (!zzH(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzx(Object obj, Object obj2, int i10) {
        if (zzE(obj2, i10)) {
            int iZzo = zzo(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzo;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzgi zzgiVarZzr = zzr(i10);
            if (!zzE(obj, i10)) {
                if (zzH(object)) {
                    Object objZzd = zzgiVarZzr.zzd();
                    zzgiVarZzr.zzf(objZzd, object);
                    unsafe.putObject(obj, j10, objZzd);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzz(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzH(object2)) {
                Object objZzd2 = zzgiVarZzr.zzd();
                zzgiVarZzr.zzf(objZzd2, object2);
                unsafe.putObject(obj, j10, objZzd2);
                object2 = objZzd2;
            }
            zzgiVarZzr.zzf(object2, object);
        }
    }

    private final void zzy(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (zzI(obj2, i11, i10)) {
            int iZzo = zzo(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzo;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzgi zzgiVarZzr = zzr(i10);
            if (!zzI(obj, i11, i10)) {
                if (zzH(object)) {
                    Object objZzd = zzgiVarZzr.zzd();
                    zzgiVarZzr.zzf(objZzd, object);
                    unsafe.putObject(obj, j10, objZzd);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzA(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzH(object2)) {
                Object objZzd2 = zzgiVarZzr.zzd();
                zzgiVarZzr.zzf(objZzd2, object2);
                unsafe.putObject(obj, j10, objZzd2);
                object2 = objZzd2;
            }
            zzgiVarZzr.zzf(object2, object);
        }
    }

    private final void zzz(Object obj, int i10) {
        int iZzl = zzl(i10);
        long j10 = 1048575 & iZzl;
        if (j10 == 1048575) {
            return;
        }
        zzhj.zzn(obj, j10, (1 << (iZzl >>> 20)) | zzhj.zzc(obj, j10));
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final int zza(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int i11;
        int iFloatToIntBits;
        int iZzc;
        int length = this.zzc.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iZzo = zzo(i13);
            int i14 = this.zzc[i13];
            long j10 = 1048575 & iZzo;
            int iHashCode = 37;
            switch (zzn(iZzo)) {
                case 0:
                    i10 = i12 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzhj.zza(obj, j10));
                    byte[] bArr = zzfa.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iZzc;
                    break;
                case 1:
                    i11 = i12 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzhj.zzb(obj, j10));
                    i12 = iFloatToIntBits + i11;
                    break;
                case 2:
                    i10 = i12 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j10);
                    byte[] bArr2 = zzfa.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iZzc;
                    break;
                case 3:
                    i10 = i12 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j10);
                    byte[] bArr3 = zzfa.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iZzc;
                    break;
                case 4:
                    i10 = i12 * 53;
                    iZzc = zzhj.zzc(obj, j10);
                    i12 = i10 + iZzc;
                    break;
                case 5:
                    i10 = i12 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j10);
                    byte[] bArr4 = zzfa.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iZzc;
                    break;
                case 6:
                    i10 = i12 * 53;
                    iZzc = zzhj.zzc(obj, j10);
                    i12 = i10 + iZzc;
                    break;
                case 7:
                    i11 = i12 * 53;
                    iFloatToIntBits = zzfa.zza(zzhj.zzt(obj, j10));
                    i12 = iFloatToIntBits + i11;
                    break;
                case 8:
                    i11 = i12 * 53;
                    iFloatToIntBits = ((String) zzhj.zzf(obj, j10)).hashCode();
                    i12 = iFloatToIntBits + i11;
                    break;
                case 9:
                    Object objZzf = zzhj.zzf(obj, j10);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i11 = i12 * 53;
                    iFloatToIntBits = zzhj.zzf(obj, j10).hashCode();
                    i12 = iFloatToIntBits + i11;
                    break;
                case 11:
                    i10 = i12 * 53;
                    iZzc = zzhj.zzc(obj, j10);
                    i12 = i10 + iZzc;
                    break;
                case 12:
                    i10 = i12 * 53;
                    iZzc = zzhj.zzc(obj, j10);
                    i12 = i10 + iZzc;
                    break;
                case 13:
                    i10 = i12 * 53;
                    iZzc = zzhj.zzc(obj, j10);
                    i12 = i10 + iZzc;
                    break;
                case 14:
                    i10 = i12 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j10);
                    byte[] bArr5 = zzfa.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iZzc;
                    break;
                case 15:
                    i10 = i12 * 53;
                    iZzc = zzhj.zzc(obj, j10);
                    i12 = i10 + iZzc;
                    break;
                case 16:
                    i10 = i12 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j10);
                    byte[] bArr6 = zzfa.zzd;
                    iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iZzc;
                    break;
                case 17:
                    Object objZzf2 = zzhj.zzf(obj, j10);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
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
                    i11 = i12 * 53;
                    iFloatToIntBits = zzhj.zzf(obj, j10).hashCode();
                    i12 = iFloatToIntBits + i11;
                    break;
                case 50:
                    i11 = i12 * 53;
                    iFloatToIntBits = zzhj.zzf(obj, j10).hashCode();
                    i12 = iFloatToIntBits + i11;
                    break;
                case 51:
                    if (zzI(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) zzhj.zzf(obj, j10)).doubleValue());
                        byte[] bArr7 = zzfa.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iZzc;
                    }
                    break;
                case 52:
                    if (zzI(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) zzhj.zzf(obj, j10)).floatValue());
                        i12 = iFloatToIntBits + i11;
                    }
                    break;
                case 53:
                    if (zzI(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = zzp(obj, j10);
                        byte[] bArr8 = zzfa.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iZzc;
                    }
                    break;
                case 54:
                    if (zzI(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = zzp(obj, j10);
                        byte[] bArr9 = zzfa.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iZzc;
                    }
                    break;
                case 55:
                    if (zzI(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzk(obj, j10);
                        i12 = i10 + iZzc;
                    }
                    break;
                case 56:
                    if (zzI(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = zzp(obj, j10);
                        byte[] bArr10 = zzfa.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iZzc;
                    }
                    break;
                case 57:
                    if (zzI(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzk(obj, j10);
                        i12 = i10 + iZzc;
                    }
                    break;
                case 58:
                    if (zzI(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = zzfa.zza(((Boolean) zzhj.zzf(obj, j10)).booleanValue());
                        i12 = iFloatToIntBits + i11;
                    }
                    break;
                case 59:
                    if (zzI(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = ((String) zzhj.zzf(obj, j10)).hashCode();
                        i12 = iFloatToIntBits + i11;
                    }
                    break;
                case 60:
                    if (zzI(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = zzhj.zzf(obj, j10).hashCode();
                        i12 = iFloatToIntBits + i11;
                    }
                    break;
                case 61:
                    if (zzI(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = zzhj.zzf(obj, j10).hashCode();
                        i12 = iFloatToIntBits + i11;
                    }
                    break;
                case 62:
                    if (zzI(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzk(obj, j10);
                        i12 = i10 + iZzc;
                    }
                    break;
                case 63:
                    if (zzI(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzk(obj, j10);
                        i12 = i10 + iZzc;
                    }
                    break;
                case 64:
                    if (zzI(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzk(obj, j10);
                        i12 = i10 + iZzc;
                    }
                    break;
                case 65:
                    if (zzI(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = zzp(obj, j10);
                        byte[] bArr11 = zzfa.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iZzc;
                    }
                    break;
                case 66:
                    if (zzI(obj, i14, i13)) {
                        i10 = i12 * 53;
                        iZzc = zzk(obj, j10);
                        i12 = i10 + iZzc;
                    }
                    break;
                case 67:
                    if (zzI(obj, i14, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = zzp(obj, j10);
                        byte[] bArr12 = zzfa.zzd;
                        iZzc = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iZzc;
                    }
                    break;
                case 68:
                    if (zzI(obj, i14, i13)) {
                        i11 = i12 * 53;
                        iFloatToIntBits = zzhj.zzf(obj, j10).hashCode();
                        i12 = iFloatToIntBits + i11;
                    }
                    break;
            }
        }
        return this.zzl.zzb(obj).hashCode() + (i12 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:108:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:113:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:121:0x032a  */
    /* JADX WARN: Code duplicated, block: B:123:0x0333 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x0335  */
    /* JADX WARN: Code duplicated, block: B:125:0x0338  */
    /* JADX WARN: Code duplicated, block: B:137:0x037b  */
    /* JADX WARN: Code duplicated, block: B:138:0x037d  */
    /* JADX WARN: Code duplicated, block: B:171:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:174:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:182:0x053b  */
    /* JADX WARN: Code duplicated, block: B:185:0x0546  */
    /* JADX WARN: Code duplicated, block: B:187:0x0552  */
    /* JADX WARN: Code duplicated, block: B:189:0x0557  */
    /* JADX WARN: Code duplicated, block: B:191:0x055a  */
    /* JADX WARN: Code duplicated, block: B:193:0x057b  */
    /* JADX WARN: Code duplicated, block: B:195:0x0583 A[LOOP:2: B:192:0x0579->B:195:0x0583, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:197:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:198:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:200:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:202:0x05bc A[LOOP:3: B:201:0x05ba->B:202:0x05bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:207:0x05d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:208:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:210:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:212:0x05ed A[LOOP:4: B:209:0x05e3->B:212:0x05ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:214:0x0606  */
    /* JADX WARN: Code duplicated, block: B:216:0x060b  */
    /* JADX WARN: Code duplicated, block: B:218:0x0616 A[LOOP:5: B:217:0x0614->B:218:0x0616, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:223:0x062d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:224:0x062f  */
    /* JADX WARN: Code duplicated, block: B:226:0x0640  */
    /* JADX WARN: Code duplicated, block: B:228:0x0648 A[LOOP:6: B:225:0x063e->B:228:0x0648, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:229:0x0656  */
    /* JADX WARN: Code duplicated, block: B:231:0x065b  */
    /* JADX WARN: Code duplicated, block: B:232:0x0660 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:233:0x0662  */
    /* JADX WARN: Code duplicated, block: B:236:0x0679  */
    /* JADX WARN: Code duplicated, block: B:238:0x067d  */
    /* JADX WARN: Code duplicated, block: B:240:0x0688  */
    /* JADX WARN: Code duplicated, block: B:242:0x0698 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:243:0x069a  */
    /* JADX WARN: Code duplicated, block: B:245:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:249:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:250:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:253:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:256:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:258:0x0711  */
    /* JADX WARN: Code duplicated, block: B:260:0x0721  */
    /* JADX WARN: Code duplicated, block: B:262:0x0728  */
    /* JADX WARN: Code duplicated, block: B:264:0x0730  */
    /* JADX WARN: Code duplicated, block: B:266:0x0734 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:267:0x0736  */
    /* JADX WARN: Code duplicated, block: B:268:0x073c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:271:0x0746  */
    /* JADX WARN: Code duplicated, block: B:273:0x074e  */
    /* JADX WARN: Code duplicated, block: B:275:0x0756  */
    /* JADX WARN: Code duplicated, block: B:277:0x075a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:289:0x078b  */
    /* JADX WARN: Code duplicated, block: B:290:0x0795  */
    /* JADX WARN: Code duplicated, block: B:292:0x079c  */
    /* JADX WARN: Code duplicated, block: B:294:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:295:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:297:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:299:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:301:0x07e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:302:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:303:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:306:0x0800  */
    /* JADX WARN: Code duplicated, block: B:308:0x0808  */
    /* JADX WARN: Code duplicated, block: B:30:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:310:0x0810 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:318:0x0833  */
    /* JADX WARN: Code duplicated, block: B:31:0x009a  */
    /* JADX WARN: Code duplicated, block: B:320:0x083d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:321:0x083f  */
    /* JADX WARN: Code duplicated, block: B:322:0x0843  */
    /* JADX WARN: Code duplicated, block: B:324:0x084b  */
    /* JADX WARN: Code duplicated, block: B:327:0x0858  */
    /* JADX WARN: Code duplicated, block: B:329:0x0860  */
    /* JADX WARN: Code duplicated, block: B:331:0x0868 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:335:0x0876  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:344:0x0895 A[PHI: r1 r3 r4 r5 r6 r7 r14
      0x0895: PHI (r1v112 int) = (r1v102 int), (r1v105 int), (r1v108 int), (r1v110 int), (r1v115 int) binds: [B:408:0x09b0, B:399:0x097c, B:382:0x092c, B:358:0x08cf, B:296:0x07d6] A[DONT_GENERATE, DONT_INLINE]
      0x0895: PHI (r3v59 int) = (r3v53 int), (r3v55 int), (r3v57 int), (r3v58 int), (r3v61 int) binds: [B:408:0x09b0, B:399:0x097c, B:382:0x092c, B:358:0x08cf, B:296:0x07d6] A[DONT_GENERATE, DONT_INLINE]
      0x0895: PHI (r4v61 int) = (r4v55 int), (r4v57 int), (r4v59 int), (r4v60 int), (r4v63 int) binds: [B:408:0x09b0, B:399:0x097c, B:382:0x092c, B:358:0x08cf, B:296:0x07d6] A[DONT_GENERATE, DONT_INLINE]
      0x0895: PHI (r5v73 int) = (r5v67 int), (r5v69 int), (r5v71 int), (r5v72 int), (r5v75 int) binds: [B:408:0x09b0, B:399:0x097c, B:382:0x092c, B:358:0x08cf, B:296:0x07d6] A[DONT_GENERATE, DONT_INLINE]
      0x0895: PHI (r6v60 int) = (r6v54 int), (r6v56 int), (r6v58 int), (r6v59 int), (r6v62 int) binds: [B:408:0x09b0, B:399:0x097c, B:382:0x092c, B:358:0x08cf, B:296:0x07d6] A[DONT_GENERATE, DONT_INLINE]
      0x0895: PHI (r7v15 byte[]) = (r7v10 byte[]), (r7v11 byte[]), (r7v13 byte[]), (r7v14 byte[]), (r7v17 byte[]) binds: [B:408:0x09b0, B:399:0x097c, B:382:0x092c, B:358:0x08cf, B:296:0x07d6] A[DONT_GENERATE, DONT_INLINE]
      0x0895: PHI (r14v50 sun.misc.Unsafe) = 
      (r14v45 sun.misc.Unsafe)
      (r14v46 sun.misc.Unsafe)
      (r14v48 sun.misc.Unsafe)
      (r14v49 sun.misc.Unsafe)
      (r14v52 sun.misc.Unsafe)
     binds: [B:408:0x09b0, B:399:0x097c, B:382:0x092c, B:358:0x08cf, B:296:0x07d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:345:0x089c  */
    /* JADX WARN: Code duplicated, block: B:347:0x08a9  */
    /* JADX WARN: Code duplicated, block: B:349:0x08b4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:351:0x08be  */
    /* JADX WARN: Code duplicated, block: B:352:0x08c0  */
    /* JADX WARN: Code duplicated, block: B:358:0x08cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:359:0x08d1  */
    /* JADX WARN: Code duplicated, block: B:361:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:362:0x08df  */
    /* JADX WARN: Code duplicated, block: B:365:0x08e6  */
    /* JADX WARN: Code duplicated, block: B:367:0x08ee  */
    /* JADX WARN: Code duplicated, block: B:369:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00af  */
    /* JADX WARN: Code duplicated, block: B:370:0x08fa  */
    /* JADX WARN: Code duplicated, block: B:372:0x0900  */
    /* JADX WARN: Code duplicated, block: B:374:0x090d  */
    /* JADX WARN: Code duplicated, block: B:376:0x0918 A[LOOP:14: B:375:0x0916->B:376:0x0918, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:381:0x092b  */
    /* JADX WARN: Code duplicated, block: B:383:0x092e  */
    /* JADX WARN: Code duplicated, block: B:385:0x093b  */
    /* JADX WARN: Code duplicated, block: B:387:0x0943 A[LOOP:15: B:384:0x0939->B:387:0x0943, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:389:0x0950  */
    /* JADX WARN: Code duplicated, block: B:391:0x095d  */
    /* JADX WARN: Code duplicated, block: B:393:0x0968 A[LOOP:16: B:392:0x0966->B:393:0x0968, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:398:0x097b  */
    /* JADX WARN: Code duplicated, block: B:400:0x097e  */
    /* JADX WARN: Code duplicated, block: B:402:0x098b  */
    /* JADX WARN: Code duplicated, block: B:404:0x0993 A[LOOP:17: B:401:0x0989->B:404:0x0993, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:405:0x099d  */
    /* JADX WARN: Code duplicated, block: B:407:0x09aa  */
    /* JADX WARN: Code duplicated, block: B:408:0x09b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:409:0x09b2  */
    /* JADX WARN: Code duplicated, block: B:410:0x09c6  */
    /* JADX WARN: Code duplicated, block: B:412:0x09d3  */
    /* JADX WARN: Code duplicated, block: B:414:0x09de A[LOOP:18: B:413:0x09dc->B:414:0x09de, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:419:0x09f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:420:0x09f3  */
    /* JADX WARN: Code duplicated, block: B:422:0x0a00  */
    /* JADX WARN: Code duplicated, block: B:424:0x0a08 A[LOOP:19: B:421:0x09fe->B:424:0x0a08, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:425:0x0a12  */
    /* JADX WARN: Code duplicated, block: B:427:0x0a1f  */
    /* JADX WARN: Code duplicated, block: B:429:0x0a2a A[LOOP:20: B:428:0x0a28->B:429:0x0a2a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:434:0x0a41  */
    /* JADX WARN: Code duplicated, block: B:436:0x0a44  */
    /* JADX WARN: Code duplicated, block: B:438:0x0a55  */
    /* JADX WARN: Code duplicated, block: B:440:0x0a5d A[LOOP:21: B:437:0x0a53->B:440:0x0a5d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:441:0x0a6b  */
    /* JADX WARN: Code duplicated, block: B:443:0x0a78  */
    /* JADX WARN: Code duplicated, block: B:445:0x0a83 A[LOOP:22: B:444:0x0a81->B:445:0x0a83, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:450:0x0a99  */
    /* JADX WARN: Code duplicated, block: B:452:0x0a9c  */
    /* JADX WARN: Code duplicated, block: B:454:0x0aad  */
    /* JADX WARN: Code duplicated, block: B:456:0x0ab5 A[LOOP:23: B:453:0x0aab->B:456:0x0ab5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:457:0x0ac3 A[PHI: r0 r7 r8 r9 r10 r11 r12 r14
      0x0ac3: PHI (r0v37 'this' com.google.android.gms.internal.auth.zzga<T>) = 
      (r0v1 'this' com.google.android.gms.internal.auth.zzga<T>)
      (r0v1 'this' com.google.android.gms.internal.auth.zzga<T>)
      (r0v1 'this' com.google.android.gms.internal.auth.zzga<T>)
      (r0v1 'this' com.google.android.gms.internal.auth.zzga<T>)
      (r36v0 'this' com.google.android.gms.internal.auth.zzga<T> A[IMMUTABLE_TYPE, THIS])
      (r0v1 'this' com.google.android.gms.internal.auth.zzga<T>)
      (r0v1 'this' com.google.android.gms.internal.auth.zzga<T>)
     binds: [B:451:0x0a9a, B:435:0x0a42, B:419:0x09f1, B:344:0x0895, B:259:0x071e, B:213:0x05fb, B:197:0x05a0] A[DONT_GENERATE, DONT_INLINE]
      0x0ac3: PHI (r7v39 byte[]) = (r7v7 byte[]), (r7v8 byte[]), (r7v9 byte[]), (r7v15 byte[]), (r14v41 byte[]), (r7v37 byte[]), (r7v45 byte[]) binds: [B:451:0x0a9a, B:435:0x0a42, B:419:0x09f1, B:344:0x0895, B:259:0x071e, B:213:0x05fb, B:197:0x05a0] A[DONT_GENERATE, DONT_INLINE]
      0x0ac3: PHI (r8v120 int) = (r8v62 int), (r8v63 int), (r8v64 int), (r8v99 int), (r11v51 int), (r8v119 int), (r8v124 int) binds: [B:451:0x0a9a, B:435:0x0a42, B:419:0x09f1, B:344:0x0895, B:259:0x071e, B:213:0x05fb, B:197:0x05a0] A[DONT_GENERATE, DONT_INLINE]
      0x0ac3: PHI (r9v69 int) = (r9v33 int), (r9v34 int), (r9v35 int), (r9v47 int), (r9v60 int), (r9v68 int), (r9v72 int) binds: [B:451:0x0a9a, B:435:0x0a42, B:419:0x09f1, B:344:0x0895, B:259:0x071e, B:213:0x05fb, B:197:0x05a0] A[DONT_GENERATE, DONT_INLINE]
      0x0ac3: PHI (r10v74 int) = (r10v51 int), (r10v52 int), (r10v53 int), (r10v55 int), (r8v61 int), (r10v73 int), (r10v77 int) binds: [B:451:0x0a9a, B:435:0x0a42, B:419:0x09f1, B:344:0x0895, B:259:0x071e, B:213:0x05fb, B:197:0x05a0] A[DONT_GENERATE, DONT_INLINE]
      0x0ac3: PHI (r11v73 int) = (r11v52 int), (r11v53 int), (r11v54 int), (r11v56 int), (r12v66 int), (r11v72 int), (r11v76 int) binds: [B:451:0x0a9a, B:435:0x0a42, B:419:0x09f1, B:344:0x0895, B:259:0x071e, B:213:0x05fb, B:197:0x05a0] A[DONT_GENERATE, DONT_INLINE]
      0x0ac3: PHI (r12v83 int) = (r12v67 int), (r12v68 int), (r12v69 int), (r12v72 int), (r12v80 int), (r12v82 int), (r12v88 int) binds: [B:451:0x0a9a, B:435:0x0a42, B:419:0x09f1, B:344:0x0895, B:259:0x071e, B:213:0x05fb, B:197:0x05a0] A[DONT_GENERATE, DONT_INLINE]
      0x0ac3: PHI (r14v63 sun.misc.Unsafe) = 
      (r14v42 sun.misc.Unsafe)
      (r14v43 sun.misc.Unsafe)
      (r14v44 sun.misc.Unsafe)
      (r14v50 sun.misc.Unsafe)
      (r19v7 sun.misc.Unsafe)
      (r14v62 sun.misc.Unsafe)
      (r14v66 sun.misc.Unsafe)
     binds: [B:451:0x0a9a, B:435:0x0a42, B:419:0x09f1, B:344:0x0895, B:259:0x071e, B:213:0x05fb, B:197:0x05a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:467:0x0b0c  */
    /* JADX WARN: Code duplicated, block: B:470:0x0b1d  */
    /* JADX WARN: Code duplicated, block: B:472:0x0b2d  */
    /* JADX WARN: Code duplicated, block: B:474:0x0b46 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:475:0x0b4e  */
    /* JADX WARN: Code duplicated, block: B:477:0x0b51  */
    /* JADX WARN: Code duplicated, block: B:479:0x0b81  */
    /* JADX WARN: Code duplicated, block: B:481:0x0b8b  */
    /* JADX WARN: Code duplicated, block: B:482:0x0ba7  */
    /* JADX WARN: Code duplicated, block: B:483:0x0ba8 A[PHI: r4 r5 r14
      0x0ba8: PHI (r4v89 int) = (r4v83 int), (r4v85 int), (r4v86 int), (r4v88 int), (r4v90 int) binds: [B:501:0x0c22, B:498:0x0c0f, B:489:0x0bda, B:485:0x0bb9, B:482:0x0ba7] A[DONT_GENERATE, DONT_INLINE]
      0x0ba8: PHI (r5v109 int) = (r5v102 int), (r5v105 int), (r5v106 int), (r5v108 int), (r5v111 int) binds: [B:501:0x0c22, B:498:0x0c0f, B:489:0x0bda, B:485:0x0bb9, B:482:0x0ba7] A[DONT_GENERATE, DONT_INLINE]
      0x0ba8: PHI (r14v68 sun.misc.Unsafe) = 
      (r14v67 sun.misc.Unsafe)
      (r14v67 sun.misc.Unsafe)
      (r14v67 sun.misc.Unsafe)
      (r14v67 sun.misc.Unsafe)
      (r14v69 sun.misc.Unsafe)
     binds: [B:501:0x0c22, B:498:0x0c0f, B:489:0x0bda, B:485:0x0bb9, B:482:0x0ba7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:484:0x0bb2  */
    /* JADX WARN: Code duplicated, block: B:486:0x0bbb  */
    /* JADX WARN: Code duplicated, block: B:488:0x0bd3  */
    /* JADX WARN: Code duplicated, block: B:490:0x0bdc  */
    /* JADX WARN: Code duplicated, block: B:496:0x0bfc  */
    /* JADX WARN: Code duplicated, block: B:497:0x0c07  */
    /* JADX WARN: Code duplicated, block: B:499:0x0c11  */
    /* JADX WARN: Code duplicated, block: B:500:0x0c1e  */
    /* JADX WARN: Code duplicated, block: B:502:0x0c24  */
    /* JADX WARN: Code duplicated, block: B:503:0x0c47  */
    /* JADX WARN: Code duplicated, block: B:505:0x0c53  */
    /* JADX WARN: Code duplicated, block: B:507:0x0c5b  */
    /* JADX WARN: Code duplicated, block: B:508:0x0c63  */
    /* JADX WARN: Code duplicated, block: B:517:0x0c88  */
    /* JADX WARN: Code duplicated, block: B:518:0x0c8c  */
    /* JADX WARN: Code duplicated, block: B:520:0x0c95  */
    /* JADX WARN: Code duplicated, block: B:522:0x0c9f  */
    /* JADX WARN: Code duplicated, block: B:523:0x0ca1  */
    /* JADX WARN: Code duplicated, block: B:526:0x0cb0  */
    /* JADX WARN: Code duplicated, block: B:528:0x0cba  */
    /* JADX WARN: Code duplicated, block: B:529:0x0ccb  */
    /* JADX WARN: Code duplicated, block: B:531:0x0cd5  */
    /* JADX WARN: Code duplicated, block: B:532:0x0ce6  */
    /* JADX WARN: Code duplicated, block: B:534:0x0cef  */
    /* JADX WARN: Code duplicated, block: B:535:0x0d00  */
    /* JADX WARN: Code duplicated, block: B:537:0x0d09  */
    /* JADX WARN: Code duplicated, block: B:538:0x0d1a  */
    /* JADX WARN: Code duplicated, block: B:540:0x0d24  */
    /* JADX WARN: Code duplicated, block: B:541:0x0d3a  */
    /* JADX WARN: Code duplicated, block: B:543:0x0d44  */
    /* JADX WARN: Code duplicated, block: B:544:0x0d5a A[PHI: r1 r5 r6 r14 r20
      0x0d5a: PHI (r1v188 int) = 
      (r1v172 int)
      (r1v173 int)
      (r1v174 int)
      (r1v175 int)
      (r1v176 int)
      (r1v177 int)
      (r1v179 int)
      (r1v180 int)
      (r1v185 int)
      (r1v189 int)
     binds: [B:542:0x0d42, B:539:0x0d22, B:536:0x0d07, B:533:0x0ced, B:530:0x0cd3, B:527:0x0cb8, B:519:0x0c93, B:517:0x0c88, B:483:0x0ba8, B:474:0x0b46] A[DONT_GENERATE, DONT_INLINE]
      0x0d5a: PHI (r5v117 int) = 
      (r5v93 int)
      (r5v94 int)
      (r5v95 int)
      (r5v96 int)
      (r5v97 int)
      (r5v98 int)
      (r5v100 int)
      (r5v101 int)
      (r5v110 int)
      (r5v118 int)
     binds: [B:542:0x0d42, B:539:0x0d22, B:536:0x0d07, B:533:0x0ced, B:530:0x0cd3, B:527:0x0cb8, B:519:0x0c93, B:517:0x0c88, B:483:0x0ba8, B:474:0x0b46] A[DONT_GENERATE, DONT_INLINE]
      0x0d5a: PHI (r6v102 byte[]) = 
      (r6v87 byte[])
      (r6v88 byte[])
      (r6v89 byte[])
      (r6v90 byte[])
      (r6v91 byte[])
      (r6v92 byte[])
      (r6v94 byte[])
      (r6v95 byte[])
      (r6v98 byte[])
      (r6v103 byte[])
     binds: [B:542:0x0d42, B:539:0x0d22, B:536:0x0d07, B:533:0x0ced, B:530:0x0cd3, B:527:0x0cb8, B:519:0x0c93, B:517:0x0c88, B:483:0x0ba8, B:474:0x0b46] A[DONT_GENERATE, DONT_INLINE]
      0x0d5a: PHI (r14v75 sun.misc.Unsafe) = 
      (r14v67 sun.misc.Unsafe)
      (r14v67 sun.misc.Unsafe)
      (r14v67 sun.misc.Unsafe)
      (r14v67 sun.misc.Unsafe)
      (r14v67 sun.misc.Unsafe)
      (r14v67 sun.misc.Unsafe)
      (r14v67 sun.misc.Unsafe)
      (r14v67 sun.misc.Unsafe)
      (r14v68 sun.misc.Unsafe)
      (r14v67 sun.misc.Unsafe)
     binds: [B:542:0x0d42, B:539:0x0d22, B:536:0x0d07, B:533:0x0ced, B:530:0x0cd3, B:527:0x0cb8, B:519:0x0c93, B:517:0x0c88, B:483:0x0ba8, B:474:0x0b46] A[DONT_GENERATE, DONT_INLINE]
      0x0d5a: PHI (r20v29 int) = 
      (r20v10 int)
      (r20v11 int)
      (r20v12 int)
      (r20v13 int)
      (r20v14 int)
      (r20v15 int)
      (r20v17 int)
      (r20v18 int)
      (r20v24 int)
      (r20v30 int)
     binds: [B:542:0x0d42, B:539:0x0d22, B:536:0x0d07, B:533:0x0ced, B:530:0x0cd3, B:527:0x0cb8, B:519:0x0c93, B:517:0x0c88, B:483:0x0ba8, B:474:0x0b46] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:584:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:586:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:588:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:589:0x020d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:0x0241 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:591:0x0371 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:592:0x039b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:593:0x03bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:0x03f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:0x0423 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:0x045b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:0x0482 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:0x04b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:0x05cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:600:0x0628 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:601:0x0786 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:0x0781 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:603:0x076f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:0x076a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:605:0x082e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:606:0x0821 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:0x0890 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:0x088b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:0x0886 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:0x0881 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:0x08ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:0x0926 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:0x0976 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:0x09ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:0x0a3c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:0x0a94 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:617:0x0ac6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:0x0af7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:620:0x0d5d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:625:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:627:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:629:0x035f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:630:0x0388 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:631:0x03a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:632:0x03e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:633:0x040e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:0x0445 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:0x046c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:636:0x0515 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:0x0504 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:0x049d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:640:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:641:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:642:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:0x035b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:0x0325 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:0x0301 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:0x02cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:0x02f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:0x0356 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:651:0x0382 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:652:0x0382 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:0x03de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:0x040b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:655:0x040b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:0x0490 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:0x0490 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:660:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:0x04b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:0x0ae4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:0x0ad7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:664:0x0d71 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:0x0527 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:0x0af4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:0x0595 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:682:0x0595 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:0x0595 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:0x06f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:0x06de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:0x0774 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:0x0762 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:0x075c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:0x0826 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:0x0816 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:705:0x0812 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:711:0x0826 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:0x086e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:0x086a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:722:0x0826 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:727:0x094d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:0x094d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:733:0x0ac4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:736:0x0ac4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:0x0ac4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:0x0277 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:743:0x029d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:744:0x02b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:745:0x0283 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:746:0x02a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:747:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:748:0x02b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:754:0x0277 A[EDGE_INSN: B:754:0x0277->B:749:0x0277 BREAK  A[LOOP:26: B:94:0x028a->B:97:0x0294], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0245  */
    /* JADX WARN: Code duplicated, block: B:81:0x024d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x024f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0254  */
    /* JADX WARN: Code duplicated, block: B:85:0x025f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0266  */
    /* JADX WARN: Code duplicated, block: B:89:0x026e A[LOOP:24: B:86:0x0264->B:89:0x026e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x0279  */
    /* JADX WARN: Code duplicated, block: B:95:0x028c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0294 A[LOOP:26: B:94:0x028a->B:97:0x0294, LOOP_END] */
    public final int zzb(Object obj, byte[] bArr, int i10, int i11, int i12, zzdt zzdtVar) throws IOException {
        Unsafe unsafe;
        int i13;
        int iZzi;
        int i14;
        int i15;
        int iZzm;
        int i16;
        int i17;
        zzdt zzdtVar2;
        int i18;
        int i19;
        int[] iArr;
        int i20;
        int iZzn;
        long j10;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        byte[] bArr2;
        int i29;
        int i30;
        int i31;
        int iZzk;
        boolean z10;
        int i32;
        int i33;
        int length;
        int i34;
        char[] cArr;
        int i35;
        int i36;
        byte b10;
        byte b11;
        byte b12;
        int i37;
        int i38;
        int iZzh;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        byte[] bArr3;
        int i46;
        zzez zzezVarZzd;
        byte[] bArr4;
        int i47;
        long j11;
        Unsafe unsafe2;
        int i48;
        zzez zzezVar;
        int i49;
        zzek zzekVar;
        int iZzh2;
        int iZzh3;
        zzek zzekVar2;
        int i50;
        zzer zzerVar;
        int iZzh4;
        zzer zzerVar2;
        int i51;
        zzfm zzfmVar;
        int iZzh5;
        zzfm zzfmVar2;
        int i52;
        int i53;
        int i54;
        int i55;
        int i56;
        int i57;
        int iZzf;
        zzfm zzfmVar3;
        int iZze;
        int iZzh6;
        zzfm zzfmVar4;
        int i58;
        zzew zzewVar;
        int iZzh7;
        zzew zzewVar2;
        int i59;
        zzdv zzdvVar;
        boolean z11;
        int iZzh8;
        boolean z12;
        zzdv zzdvVar2;
        int i60;
        boolean z13;
        int i61;
        int i62;
        int iZzh9;
        int i63;
        int i64;
        int i65;
        Object obj2;
        int iZzh10;
        int i66;
        int i67;
        int iZzh11;
        int i68;
        int iZzh12;
        int i69;
        int i70;
        int iZzj;
        zzey zzeyVarZzq;
        zzgz zzgzVar;
        int i71;
        int i72;
        int i73;
        Iterator it;
        Object objZzc;
        int iIntValue;
        int size;
        Object objZzc2;
        int i74;
        int i75;
        int iIntValue2;
        int i76;
        int i77;
        zzew zzewVar3;
        int iZzh13;
        zzew zzewVar4;
        int i78;
        zzfm zzfmVar5;
        int iZzh14;
        zzfm zzfmVar6;
        int i79;
        zzgi zzgiVarZzr;
        int i80;
        int iZzh15;
        Unsafe unsafe3;
        Object object;
        Unsafe unsafe4;
        long j12;
        int i81;
        byte[] bArr5;
        int i82;
        int iZzk2;
        boolean z14;
        int iZzh16;
        int i83;
        int i84;
        int i85;
        int iZza;
        int i86;
        zzey zzeyVarZzq2;
        this = this;
        Object obj3 = obj;
        byte[] bArr6 = bArr;
        int i87 = i11;
        i12 = i12;
        zzdt zzdtVar3 = zzdtVar;
        zzw(obj);
        Unsafe unsafe5 = zzb;
        int i88 = 0;
        int iZzg = i10;
        int i89 = 0;
        int i90 = 0;
        int i91 = 0;
        int i92 = -1;
        int i93 = 1048575;
        while (true) {
            if (iZzg < i87) {
                int i94 = iZzg + 1;
                byte b13 = bArr6[iZzg];
                if (b13 < 0) {
                    iZzi = zzdu.zzi(b13, bArr6, i94, zzdtVar3);
                    i90 = zzdtVar3.zza;
                } else {
                    i90 = b13;
                    iZzi = i94;
                }
                int i95 = i90 >>> 3;
                if (i95 > i92) {
                    iZzm = (i95 < this.zze || i95 > this.zzf) ? -1 : this.zzm(i95, i89 / 3);
                } else {
                    if (i95 < this.zze || i95 > this.zzf) {
                        i14 = -1;
                        i15 = -1;
                    } else {
                        iZzm = this.zzm(i95, i88);
                    }
                    if (i15 == i14) {
                        i89 = i88;
                        i16 = i89;
                        i13 = i12;
                        i17 = i95;
                        zzdtVar2 = zzdtVar3;
                        unsafe = unsafe5;
                        i18 = iZzi;
                    } else {
                        i19 = i90 & 7;
                        iArr = this.zzc;
                        i20 = iArr[i15 + 1];
                        iZzn = zzn(i20);
                        i92 = i95;
                        j10 = i20 & 1048575;
                        i21 = iZzi;
                        if (iZzn <= 17) {
                            int i96 = iArr[i15 + 2];
                            i22 = 1 << (i96 >>> 20);
                            i23 = 1048575;
                            i24 = i96 & 1048575;
                            i25 = i15;
                            if (i24 != i93) {
                                if (i93 != 1048575) {
                                    unsafe5.putInt(obj3, i93, i91);
                                    i23 = 1048575;
                                }
                                if (i24 == i23) {
                                    i41 = 0;
                                } else {
                                    i41 = unsafe5.getInt(obj3, i24);
                                }
                                i93 = i24;
                                i26 = i41;
                            } else {
                                i26 = i91;
                                i93 = i93;
                            }
                            switch (iZzn) {
                                case 0:
                                    i89 = i25;
                                    i27 = i21;
                                    i16 = 0;
                                    zzdtVar2 = zzdtVar3;
                                    unsafe = unsafe5;
                                    i28 = i90;
                                    bArr2 = bArr;
                                    i29 = i12;
                                    if (i19 == 1) {
                                        zzhj.zzl(obj3, j10, Double.longBitsToDouble(zzdu.zzn(bArr2, i27)));
                                        iZzg = i27 + 8;
                                        i91 = i26 | i22;
                                        i12 = i29;
                                        i87 = i11;
                                        unsafe5 = unsafe;
                                        zzdtVar3 = zzdtVar2;
                                        i88 = i16;
                                        i92 = i92;
                                        bArr6 = bArr2;
                                        i90 = i28;
                                    } else {
                                        i13 = i29;
                                        i18 = i27;
                                        i17 = i92;
                                        i91 = i26;
                                        i90 = i28;
                                        i93 = i93;
                                    }
                                    break;
                                case 1:
                                    i89 = i25;
                                    i27 = i21;
                                    i16 = 0;
                                    zzdtVar2 = zzdtVar3;
                                    unsafe = unsafe5;
                                    i28 = i90;
                                    bArr2 = bArr;
                                    i29 = i12;
                                    if (i19 == 5) {
                                        zzhj.zzm(obj3, j10, Float.intBitsToFloat(zzdu.zzb(bArr2, i27)));
                                        iZzg = i27 + 4;
                                        i91 = i26 | i22;
                                        i12 = i29;
                                        i87 = i11;
                                        unsafe5 = unsafe;
                                        zzdtVar3 = zzdtVar2;
                                        i88 = i16;
                                        i92 = i92;
                                        bArr6 = bArr2;
                                        i90 = i28;
                                    } else {
                                        i13 = i29;
                                        i18 = i27;
                                        i17 = i92;
                                        i91 = i26;
                                        i90 = i28;
                                        i93 = i93;
                                    }
                                    break;
                                case 2:
                                case 3:
                                    i30 = i12;
                                    i89 = i25;
                                    i27 = i21;
                                    i16 = 0;
                                    zzdtVar2 = zzdtVar3;
                                    unsafe = unsafe5;
                                    i28 = i90;
                                    bArr2 = bArr;
                                    if (i19 == 0) {
                                        int iZzk3 = zzdu.zzk(bArr2, i27, zzdtVar2);
                                        unsafe.putLong(obj, j10, zzdtVar2.zzb);
                                        i12 = i30;
                                        iZzg = iZzk3;
                                        i87 = i11;
                                        unsafe5 = unsafe;
                                        zzdtVar3 = zzdtVar2;
                                        i88 = 0;
                                        i92 = i92;
                                        i91 = i26 | i22;
                                        bArr6 = bArr2;
                                        i90 = i28;
                                    } else {
                                        i29 = i30;
                                        i13 = i29;
                                        i18 = i27;
                                        i17 = i92;
                                        i91 = i26;
                                        i90 = i28;
                                        i93 = i93;
                                    }
                                    break;
                                case 4:
                                case 11:
                                    i11 = i11;
                                    i30 = i12;
                                    i89 = i25;
                                    i27 = i21;
                                    i16 = 0;
                                    zzdtVar2 = zzdtVar3;
                                    unsafe = unsafe5;
                                    i28 = i90;
                                    bArr2 = bArr;
                                    if (i19 == 0) {
                                        int iZzh17 = zzdu.zzh(bArr2, i27, zzdtVar2);
                                        unsafe.putInt(obj3, j10, zzdtVar2.zza);
                                        i91 = i26 | i22;
                                        iZzg = iZzh17;
                                        i12 = i30;
                                        i87 = i11;
                                        unsafe5 = unsafe;
                                        zzdtVar3 = zzdtVar2;
                                        i88 = i16;
                                        i92 = i92;
                                        bArr6 = bArr2;
                                        i90 = i28;
                                    } else {
                                        i29 = i30;
                                        i13 = i29;
                                        i18 = i27;
                                        i17 = i92;
                                        i91 = i26;
                                        i90 = i28;
                                        i93 = i93;
                                    }
                                    break;
                                case 5:
                                case 14:
                                    i89 = i25;
                                    i27 = i21;
                                    zzdtVar2 = zzdtVar3;
                                    unsafe = unsafe5;
                                    i28 = i90;
                                    bArr2 = bArr;
                                    if (i19 == 1) {
                                        unsafe.putLong(obj, j10, zzdu.zzn(bArr2, i27));
                                        int i97 = i27 + 8;
                                        i91 = i26 | i22;
                                        i12 = i12;
                                        i87 = i11;
                                        unsafe5 = unsafe;
                                        zzdtVar3 = zzdtVar2;
                                        i88 = 0;
                                        i92 = i92;
                                        iZzg = i97;
                                        bArr6 = bArr2;
                                        i90 = i28;
                                    } else {
                                        i16 = 0;
                                        i29 = i12;
                                        i13 = i29;
                                        i18 = i27;
                                        i17 = i92;
                                        i91 = i26;
                                        i90 = i28;
                                        i93 = i93;
                                    }
                                    break;
                                case 6:
                                case 13:
                                    i11 = i11;
                                    i89 = i25;
                                    i27 = i21;
                                    i31 = 0;
                                    zzdtVar2 = zzdtVar3;
                                    unsafe = unsafe5;
                                    i28 = i90;
                                    bArr2 = bArr;
                                    if (i19 == 5) {
                                        unsafe.putInt(obj3, j10, zzdu.zzb(bArr2, i27));
                                        iZzg = i27 + 4;
                                        i91 = i26 | i22;
                                        i88 = i31;
                                        i87 = i11;
                                        unsafe5 = unsafe;
                                        zzdtVar3 = zzdtVar2;
                                        i92 = i92;
                                        bArr6 = bArr2;
                                        i90 = i28;
                                    } else {
                                        i29 = i12;
                                        i16 = i31;
                                        i13 = i29;
                                        i18 = i27;
                                        i17 = i92;
                                        i91 = i26;
                                        i90 = i28;
                                        i93 = i93;
                                    }
                                    break;
                                case 7:
                                    i89 = i25;
                                    i27 = i21;
                                    i31 = 0;
                                    zzdtVar2 = zzdtVar3;
                                    unsafe = unsafe5;
                                    i28 = i90;
                                    bArr2 = bArr;
                                    if (i19 == 0) {
                                        iZzk = zzdu.zzk(bArr2, i27, zzdtVar2);
                                        if (zzdtVar2.zzb != 0) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        zzhj.zzk(obj3, j10, z10);
                                        i91 = i26 | i22;
                                        iZzg = iZzk;
                                        i88 = i31;
                                        i87 = i11;
                                        unsafe5 = unsafe;
                                        zzdtVar3 = zzdtVar2;
                                        i92 = i92;
                                        bArr6 = bArr2;
                                        i90 = i28;
                                    } else {
                                        i29 = i12;
                                        i16 = i31;
                                        i13 = i29;
                                        i18 = i27;
                                        i17 = i92;
                                        i91 = i26;
                                        i90 = i28;
                                        i93 = i93;
                                    }
                                    break;
                                case 8:
                                    i89 = i25;
                                    i27 = i21;
                                    zzdtVar2 = zzdtVar3;
                                    unsafe = unsafe5;
                                    i28 = i90;
                                    bArr2 = bArr;
                                    if (i19 == 2) {
                                        if ((i20 & PKIFailureInfo.duplicateCertReq) != 0) {
                                            iZzk = zzdu.zzh(bArr2, i27, zzdtVar2);
                                            i33 = zzdtVar2.zza;
                                            if (i33 >= 0) {
                                                throw zzfb.zzc();
                                            }
                                            if (i33 == 0) {
                                                zzdtVar2.zzc = "";
                                                i31 = 0;
                                            } else {
                                                int i98 = zzhn.zza;
                                                length = bArr2.length;
                                                if ((((length - iZzk) - i33) | iZzk | i33) >= 0) {
                                                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iZzk), Integer.valueOf(i33)));
                                                }
                                                i34 = iZzk + i33;
                                                cArr = new char[i33];
                                                i35 = 0;
                                                while (iZzk < i34) {
                                                    b12 = bArr2[iZzk];
                                                    if (zzhk.zzd(b12)) {
                                                        iZzk++;
                                                        cArr[i35] = (char) b12;
                                                        i35++;
                                                    } else {
                                                        while (iZzk < i34) {
                                                            i36 = iZzk + 1;
                                                            b10 = bArr2[iZzk];
                                                            if (zzhk.zzd(b10)) {
                                                                cArr[i35] = (char) b10;
                                                                i35++;
                                                                iZzk = i36;
                                                                while (iZzk < i34) {
                                                                    b11 = bArr2[iZzk];
                                                                    if (zzhk.zzd(b11)) {
                                                                    }
                                                                    iZzk++;
                                                                    cArr[i35] = (char) b11;
                                                                    i35++;
                                                                    break;
                                                                }
                                                            } else if (b10 < -32) {
                                                                if (i36 < i34) {
                                                                    throw zzfb.zzb();
                                                                }
                                                                iZzk += 2;
                                                                zzhk.zzc(b10, bArr2[i36], cArr, i35);
                                                                i35++;
                                                            } else if (b10 < -16) {
                                                                if (i36 < i34 - 1) {
                                                                    throw zzfb.zzb();
                                                                }
                                                                int i99 = iZzk + 2;
                                                                iZzk += 3;
                                                                zzhk.zzb(b10, bArr2[i36], bArr2[i99], cArr, i35);
                                                                i35++;
                                                            } else {
                                                                if (i36 < i34 - 2) {
                                                                    throw zzfb.zzb();
                                                                }
                                                                byte b14 = bArr2[i36];
                                                                int i100 = iZzk + 3;
                                                                byte b15 = bArr2[iZzk + 2];
                                                                iZzk += 4;
                                                                zzhk.zza(b10, b14, b15, bArr2[i100], cArr, i35);
                                                                i35 += 2;
                                                            }
                                                        }
                                                        i31 = 0;
                                                        zzdtVar2.zzc = new String(cArr, 0, i35);
                                                        iZzk = i34;
                                                    }
                                                }
                                                while (iZzk < i34) {
                                                    i36 = iZzk + 1;
                                                    b10 = bArr2[iZzk];
                                                    if (zzhk.zzd(b10)) {
                                                        cArr[i35] = (char) b10;
                                                        i35++;
                                                        iZzk = i36;
                                                        while (iZzk < i34) {
                                                            b11 = bArr2[iZzk];
                                                            if (zzhk.zzd(b11)) {
                                                            }
                                                            iZzk++;
                                                            cArr[i35] = (char) b11;
                                                            i35++;
                                                            break;
                                                        }
                                                    } else if (b10 < -32) {
                                                        if (i36 < i34) {
                                                            throw zzfb.zzb();
                                                        }
                                                        iZzk += 2;
                                                        zzhk.zzc(b10, bArr2[i36], cArr, i35);
                                                        i35++;
                                                    } else if (b10 < -16) {
                                                        if (i36 < i34 - 1) {
                                                            throw zzfb.zzb();
                                                        }
                                                        int i910 = iZzk + 2;
                                                        iZzk += 3;
                                                        zzhk.zzb(b10, bArr2[i36], bArr2[i910], cArr, i35);
                                                        i35++;
                                                    } else {
                                                        if (i36 < i34 - 2) {
                                                            throw zzfb.zzb();
                                                        }
                                                        byte b16 = bArr2[i36];
                                                        int i101 = iZzk + 3;
                                                        byte b17 = bArr2[iZzk + 2];
                                                        iZzk += 4;
                                                        zzhk.zza(b10, b16, b17, bArr2[i101], cArr, i35);
                                                        i35 += 2;
                                                    }
                                                }
                                                i31 = 0;
                                                zzdtVar2.zzc = new String(cArr, 0, i35);
                                                iZzk = i34;
                                            }
                                        } else {
                                            i31 = 0;
                                            iZzk = zzdu.zzh(bArr2, i27, zzdtVar2);
                                            i32 = zzdtVar2.zza;
                                            if (i32 >= 0) {
                                                throw zzfb.zzc();
                                            }
                                            if (i32 == 0) {
                                                zzdtVar2.zzc = "";
                                            } else {
                                                zzdtVar2.zzc = new String(bArr2, iZzk, i32, zzfa.zzb);
                                                iZzk += i32;
                                            }
                                        }
                                        unsafe.putObject(obj3, j10, zzdtVar2.zzc);
                                        i91 = i26 | i22;
                                        iZzg = iZzk;
                                        i88 = i31;
                                        i87 = i11;
                                        unsafe5 = unsafe;
                                        zzdtVar3 = zzdtVar2;
                                        i92 = i92;
                                        bArr6 = bArr2;
                                        i90 = i28;
                                    } else {
                                        i29 = i12;
                                        i16 = 0;
                                        i13 = i29;
                                        i18 = i27;
                                        i17 = i92;
                                        i91 = i26;
                                        i90 = i28;
                                        i93 = i93;
                                    }
                                    break;
                                case 9:
                                    i12 = i12;
                                    zzdtVar2 = zzdtVar3;
                                    unsafe = unsafe5;
                                    i37 = i90;
                                    i89 = i25;
                                    i27 = i21;
                                    bArr2 = bArr;
                                    if (i19 == 2) {
                                        Object objZzt = this.zzt(obj3, i89);
                                        i28 = i37;
                                        int iZzm2 = zzdu.zzm(objZzt, this.zzr(i89), bArr, i27, i11, zzdtVar);
                                        this.zzB(obj3, i89, objZzt);
                                        i91 = i26 | i22;
                                        iZzg = iZzm2;
                                        i12 = i12;
                                        i87 = i11;
                                        unsafe5 = unsafe;
                                        zzdtVar3 = zzdtVar2;
                                        i92 = i92;
                                        i88 = 0;
                                        bArr6 = bArr2;
                                        i90 = i28;
                                    } else {
                                        i28 = i37;
                                        i29 = i12;
                                        i16 = 0;
                                        i13 = i29;
                                        i18 = i27;
                                        i17 = i92;
                                        i91 = i26;
                                        i90 = i28;
                                        i93 = i93;
                                    }
                                    break;
                                case 10:
                                    i38 = i11;
                                    i12 = i12;
                                    i37 = i90;
                                    i89 = i25;
                                    i27 = i21;
                                    bArr2 = bArr;
                                    zzdtVar2 = zzdtVar3;
                                    unsafe = unsafe5;
                                    if (i19 == 2) {
                                        int iZza2 = zzdu.zza(bArr2, i27, zzdtVar2);
                                        unsafe.putObject(obj3, j10, zzdtVar2.zzc);
                                        i91 = i26 | i22;
                                        iZzg = iZza2;
                                        unsafe5 = unsafe;
                                        zzdtVar3 = zzdtVar2;
                                        i88 = 0;
                                        bArr6 = bArr2;
                                        i90 = i37;
                                        i87 = i38;
                                        i93 = i93;
                                    } else {
                                        i28 = i37;
                                        i29 = i12;
                                        i16 = 0;
                                        i13 = i29;
                                        i18 = i27;
                                        i17 = i92;
                                        i91 = i26;
                                        i90 = i28;
                                        i93 = i93;
                                    }
                                    break;
                                case 12:
                                    i38 = i11;
                                    i12 = i12;
                                    i89 = i25;
                                    i27 = i21;
                                    zzdtVar2 = zzdtVar3;
                                    unsafe = unsafe5;
                                    i28 = i90;
                                    bArr2 = bArr;
                                    if (i19 == 0) {
                                        iZzh = zzdu.zzh(bArr2, i27, zzdtVar2);
                                        i39 = zzdtVar2.zza;
                                        zzey zzeyVarZzq3 = this.zzq(i89);
                                        if ((i20 & Integer.MIN_VALUE) != 0 || zzeyVarZzq3 == null || zzeyVarZzq3.zza()) {
                                            i37 = i28;
                                            unsafe.putInt(obj3, j10, i39);
                                            i91 = i26 | i22;
                                            iZzg = iZzh;
                                            unsafe5 = unsafe;
                                            zzdtVar3 = zzdtVar2;
                                        } else {
                                            i37 = i28;
                                            zzc(obj).zzh(i37, Long.valueOf(i39));
                                            iZzg = iZzh;
                                            unsafe5 = unsafe;
                                            zzdtVar3 = zzdtVar2;
                                            i91 = i26;
                                        }
                                        i88 = 0;
                                        bArr6 = bArr2;
                                        i90 = i37;
                                        i87 = i38;
                                        i93 = i93;
                                    } else {
                                        i29 = i12;
                                        i16 = 0;
                                        i13 = i29;
                                        i18 = i27;
                                        i17 = i92;
                                        i91 = i26;
                                        i90 = i28;
                                        i93 = i93;
                                    }
                                    break;
                                case 15:
                                    i12 = i12;
                                    i89 = i25;
                                    i27 = i21;
                                    zzdtVar2 = zzdtVar3;
                                    unsafe = unsafe5;
                                    i28 = i90;
                                    bArr2 = bArr;
                                    if (i19 == 0) {
                                        int iZzh18 = zzdu.zzh(bArr2, i27, zzdtVar2);
                                        unsafe.putInt(obj3, j10, zzej.zzb(zzdtVar2.zza));
                                        i91 = i26 | i22;
                                        iZzg = iZzh18;
                                        i87 = i11;
                                        unsafe5 = unsafe;
                                        zzdtVar3 = zzdtVar2;
                                        i92 = i92;
                                        i88 = 0;
                                        bArr6 = bArr2;
                                        i90 = i28;
                                    } else {
                                        i29 = i12;
                                        i16 = 0;
                                        i13 = i29;
                                        i18 = i27;
                                        i17 = i92;
                                        i91 = i26;
                                        i90 = i28;
                                        i93 = i93;
                                    }
                                    break;
                                case 16:
                                    i40 = i90;
                                    i27 = i21;
                                    bArr2 = bArr;
                                    if (i19 == 0) {
                                        int iZzk4 = zzdu.zzk(bArr2, i27, zzdtVar3);
                                        i92 = i92;
                                        i28 = i40;
                                        i89 = i25;
                                        unsafe5.putLong(obj, j10, zzej.zzc(zzdtVar3.zzb));
                                        i91 = i26 | i22;
                                        i87 = i11;
                                        i12 = i12;
                                        unsafe5 = unsafe5;
                                        zzdtVar3 = zzdtVar3;
                                        iZzg = iZzk4;
                                        i92 = i92;
                                        i88 = 0;
                                        bArr6 = bArr2;
                                        i90 = i28;
                                    } else {
                                        zzdtVar2 = zzdtVar3;
                                        i89 = i25;
                                        i92 = i92;
                                        unsafe = unsafe5;
                                        i29 = i12;
                                        i28 = i40;
                                        i16 = 0;
                                        i13 = i29;
                                        i18 = i27;
                                        i17 = i92;
                                        i91 = i26;
                                        i90 = i28;
                                        i93 = i93;
                                    }
                                    break;
                                default:
                                    if (i19 == 3) {
                                        Object objZzt2 = this.zzt(obj3, i25);
                                        iZzg = zzdu.zzl(objZzt2, this.zzr(i25), bArr, i21, i11, (i92 << 3) | 4, zzdtVar);
                                        this.zzB(obj3, i25, objZzt2);
                                        i91 = i26 | i22;
                                        bArr6 = bArr;
                                        i90 = i90;
                                        i89 = i25;
                                        i92 = i92;
                                        i93 = i93;
                                        i88 = 0;
                                        i87 = i11;
                                    } else {
                                        i27 = i21;
                                        zzdtVar2 = zzdtVar3;
                                        unsafe = unsafe5;
                                        i28 = i90;
                                        i89 = i25;
                                        i16 = 0;
                                        bArr2 = bArr;
                                        i29 = i12;
                                        i13 = i29;
                                        i18 = i27;
                                        i17 = i92;
                                        i91 = i26;
                                        i90 = i28;
                                        i93 = i93;
                                    }
                                    break;
                            }
                        } else {
                            i16 = 0;
                            i42 = i90;
                            zzdtVar2 = zzdtVar3;
                            unsafe = unsafe5;
                            if (iZzn == 27) {
                                i89 = i15;
                                i93 = i93;
                                unsafe = unsafe;
                                bArr4 = bArr;
                                i47 = i21;
                                i43 = i91;
                                i90 = i42;
                                if (iZzn <= 49) {
                                    j11 = i20;
                                    unsafe2 = zzb;
                                    i48 = i92;
                                    zzezVar = (zzez) unsafe2.getObject(obj3, j10);
                                    if (zzezVar.zzc()) {
                                        int size2 = zzezVar.size();
                                        zzez zzezVarZzd2 = zzezVar.zzd(size2 != 0 ? size2 + size2 : 10);
                                        unsafe2.putObject(obj3, j10, zzezVarZzd2);
                                        zzezVar = zzezVarZzd2;
                                    }
                                    switch (iZzn) {
                                        case 18:
                                        case 35:
                                            i89 = i89;
                                            i47 = i47;
                                            i90 = i90;
                                            bArr4 = bArr4;
                                            unsafe = unsafe;
                                            i92 = i48;
                                            i49 = i11;
                                            if (i19 == 2) {
                                                zzekVar2 = (zzek) zzezVar;
                                                iZzh2 = zzdu.zzh(bArr4, i47, zzdtVar2);
                                                i50 = zzdtVar2.zza + iZzh2;
                                                while (iZzh2 < i50) {
                                                    zzekVar2.zze(Double.longBitsToDouble(zzdu.zzn(bArr4, iZzh2)));
                                                    iZzh2 += 8;
                                                }
                                                if (iZzh2 != i50) {
                                                    throw zzfb.zzf();
                                                }
                                            } else if (i19 == 1) {
                                                zzekVar = (zzek) zzezVar;
                                                zzekVar.zze(Double.longBitsToDouble(zzdu.zzn(bArr4, i47)));
                                                iZzh2 = i47 + 8;
                                                while (iZzh2 < i49) {
                                                    iZzh3 = zzdu.zzh(bArr4, iZzh2, zzdtVar2);
                                                    if (i90 == zzdtVar2.zza) {
                                                        zzekVar.zze(Double.longBitsToDouble(zzdu.zzn(bArr4, iZzh3)));
                                                        iZzh2 = iZzh3 + 8;
                                                    }
                                                }
                                            } else {
                                                iZzh2 = i47;
                                            }
                                            if (iZzh2 != i47) {
                                                i12 = i12;
                                                iZzg = iZzh2;
                                                i87 = i49;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i91 = i43;
                                                i93 = i93;
                                                bArr6 = bArr4;
                                                obj3 = obj;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzh2;
                                                i17 = i92;
                                                i91 = i43;
                                                i93 = i93;
                                                obj3 = obj;
                                            }
                                            break;
                                        case 19:
                                        case 36:
                                            i89 = i89;
                                            i47 = i47;
                                            i90 = i90;
                                            bArr4 = bArr4;
                                            unsafe = unsafe;
                                            i92 = i48;
                                            i49 = i11;
                                            if (i19 == 2) {
                                                zzerVar2 = (zzer) zzezVar;
                                                iZzh2 = zzdu.zzh(bArr4, i47, zzdtVar2);
                                                i51 = zzdtVar2.zza + iZzh2;
                                                while (iZzh2 < i51) {
                                                    zzerVar2.zze(Float.intBitsToFloat(zzdu.zzb(bArr4, iZzh2)));
                                                    iZzh2 += 4;
                                                }
                                                if (iZzh2 != i51) {
                                                    throw zzfb.zzf();
                                                }
                                            } else if (i19 == 5) {
                                                zzerVar = (zzer) zzezVar;
                                                zzerVar.zze(Float.intBitsToFloat(zzdu.zzb(bArr4, i47)));
                                                iZzh2 = i47 + 4;
                                                while (iZzh2 < i49) {
                                                    iZzh4 = zzdu.zzh(bArr4, iZzh2, zzdtVar2);
                                                    if (i90 == zzdtVar2.zza) {
                                                        zzerVar.zze(Float.intBitsToFloat(zzdu.zzb(bArr4, iZzh4)));
                                                        iZzh2 = iZzh4 + 4;
                                                    }
                                                }
                                            } else {
                                                iZzh2 = i47;
                                            }
                                            if (iZzh2 != i47) {
                                                i12 = i12;
                                                iZzg = iZzh2;
                                                i87 = i49;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i91 = i43;
                                                i93 = i93;
                                                bArr6 = bArr4;
                                                obj3 = obj;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzh2;
                                                i17 = i92;
                                                i91 = i43;
                                                i93 = i93;
                                                obj3 = obj;
                                            }
                                            break;
                                        case 20:
                                        case 21:
                                        case 37:
                                        case 38:
                                            i89 = i89;
                                            i47 = i47;
                                            i90 = i90;
                                            bArr4 = bArr4;
                                            unsafe = unsafe;
                                            i92 = i48;
                                            i49 = i11;
                                            if (i19 == 2) {
                                                zzfmVar2 = (zzfm) zzezVar;
                                                iZzh2 = zzdu.zzh(bArr4, i47, zzdtVar2);
                                                i52 = zzdtVar2.zza + iZzh2;
                                                while (iZzh2 < i52) {
                                                    iZzh2 = zzdu.zzk(bArr4, iZzh2, zzdtVar2);
                                                    zzfmVar2.zze(zzdtVar2.zzb);
                                                }
                                                if (iZzh2 != i52) {
                                                    throw zzfb.zzf();
                                                }
                                            } else if (i19 == 0) {
                                                zzfmVar = (zzfm) zzezVar;
                                                iZzh2 = zzdu.zzk(bArr4, i47, zzdtVar2);
                                                zzfmVar.zze(zzdtVar2.zzb);
                                                while (iZzh2 < i49) {
                                                    iZzh5 = zzdu.zzh(bArr4, iZzh2, zzdtVar2);
                                                    if (i90 == zzdtVar2.zza) {
                                                        iZzh2 = zzdu.zzk(bArr4, iZzh5, zzdtVar2);
                                                        zzfmVar.zze(zzdtVar2.zzb);
                                                    }
                                                }
                                            } else {
                                                iZzh2 = i47;
                                            }
                                            if (iZzh2 != i47) {
                                                i12 = i12;
                                                iZzg = iZzh2;
                                                i87 = i49;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i91 = i43;
                                                i93 = i93;
                                                bArr6 = bArr4;
                                                obj3 = obj;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzh2;
                                                i17 = i92;
                                                i91 = i43;
                                                i93 = i93;
                                                obj3 = obj;
                                            }
                                            break;
                                        case 22:
                                        case 29:
                                        case 39:
                                        case 43:
                                            i53 = i11;
                                            i54 = i89;
                                            i55 = i47;
                                            i56 = i90;
                                            bArr4 = bArr4;
                                            unsafe = unsafe;
                                            i57 = i48;
                                            if (i19 == 2) {
                                                iZzf = zzdu.zzf(bArr4, i55, zzezVar, zzdtVar2);
                                                i49 = i53;
                                                iZzh2 = iZzf;
                                                i90 = i56;
                                                i47 = i55;
                                                i92 = i57;
                                                i89 = i54;
                                            } else if (i19 == 0) {
                                                i49 = i53;
                                                i90 = i56;
                                                i47 = i55;
                                                i92 = i57;
                                                i89 = i54;
                                                iZzh2 = zzdu.zzj(i56, bArr, i55, i11, zzezVar, zzdtVar);
                                            } else {
                                                i49 = i53;
                                                i90 = i56;
                                                i47 = i55;
                                                i92 = i57;
                                                i89 = i54;
                                                iZzh2 = i47;
                                            }
                                            if (iZzh2 != i47) {
                                                i12 = i12;
                                                iZzg = iZzh2;
                                                i87 = i49;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i91 = i43;
                                                i93 = i93;
                                                bArr6 = bArr4;
                                                obj3 = obj;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzh2;
                                                i17 = i92;
                                                i91 = i43;
                                                i93 = i93;
                                                obj3 = obj;
                                            }
                                            break;
                                        case 23:
                                        case 32:
                                        case 40:
                                        case 46:
                                            i53 = i11;
                                            i54 = i89;
                                            i55 = i47;
                                            i56 = i90;
                                            bArr4 = bArr4;
                                            unsafe = unsafe;
                                            i57 = i48;
                                            if (i19 == 2) {
                                                if (i19 == 1) {
                                                    zzfmVar3 = (zzfm) zzezVar;
                                                    zzfmVar3.zze(zzdu.zzn(bArr4, i55));
                                                    iZze = i55 + 8;
                                                    while (iZze < i53) {
                                                        iZzh6 = zzdu.zzh(bArr4, iZze, zzdtVar2);
                                                        if (i56 == zzdtVar2.zza) {
                                                            i49 = i53;
                                                            i90 = i56;
                                                            i92 = i57;
                                                            i89 = i54;
                                                            iZzh2 = iZze;
                                                            i47 = i55;
                                                            if (iZzh2 != i47) {
                                                                i12 = i12;
                                                                iZzg = iZzh2;
                                                                i87 = i49;
                                                                unsafe5 = unsafe;
                                                                zzdtVar3 = zzdtVar2;
                                                                i88 = 0;
                                                                i91 = i43;
                                                                i93 = i93;
                                                                bArr6 = bArr4;
                                                                obj3 = obj;
                                                            } else {
                                                                i13 = i12;
                                                                i18 = iZzh2;
                                                                i17 = i92;
                                                                i91 = i43;
                                                                i93 = i93;
                                                                obj3 = obj;
                                                            }
                                                        } else {
                                                            zzfmVar3.zze(zzdu.zzn(bArr4, iZzh6));
                                                            iZze = iZzh6 + 8;
                                                        }
                                                        break;
                                                    }
                                                    i49 = i53;
                                                    i90 = i56;
                                                    i92 = i57;
                                                    i89 = i54;
                                                    iZzh2 = iZze;
                                                    i47 = i55;
                                                    if (iZzh2 != i47) {
                                                        i12 = i12;
                                                        iZzg = iZzh2;
                                                        i87 = i49;
                                                        unsafe5 = unsafe;
                                                        zzdtVar3 = zzdtVar2;
                                                        i88 = 0;
                                                        i91 = i43;
                                                        i93 = i93;
                                                        bArr6 = bArr4;
                                                        obj3 = obj;
                                                    } else {
                                                        i13 = i12;
                                                        i18 = iZzh2;
                                                        i17 = i92;
                                                        i91 = i43;
                                                        i93 = i93;
                                                        obj3 = obj;
                                                    }
                                                }
                                                i49 = i53;
                                                i90 = i56;
                                                i47 = i55;
                                                i92 = i57;
                                                i89 = i54;
                                                iZzh2 = i47;
                                                if (iZzh2 != i47) {
                                                    i12 = i12;
                                                    iZzg = iZzh2;
                                                    i87 = i49;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    bArr6 = bArr4;
                                                    obj3 = obj;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzh2;
                                                    i17 = i92;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    obj3 = obj;
                                                }
                                                break;
                                            } else {
                                                zzfmVar4 = (zzfm) zzezVar;
                                                iZzf = zzdu.zzh(bArr4, i55, zzdtVar2);
                                                i58 = zzdtVar2.zza + iZzf;
                                                while (iZzf < i58) {
                                                    zzfmVar4.zze(zzdu.zzn(bArr4, iZzf));
                                                    iZzf += 8;
                                                }
                                                if (iZzf != i58) {
                                                    throw zzfb.zzf();
                                                }
                                                i49 = i53;
                                                iZzh2 = iZzf;
                                                i90 = i56;
                                                i47 = i55;
                                                i92 = i57;
                                                i89 = i54;
                                                if (iZzh2 != i47) {
                                                    i12 = i12;
                                                    iZzg = iZzh2;
                                                    i87 = i49;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    bArr6 = bArr4;
                                                    obj3 = obj;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzh2;
                                                    i17 = i92;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    obj3 = obj;
                                                }
                                            }
                                            break;
                                        case 24:
                                        case 31:
                                        case 41:
                                        case 45:
                                            i53 = i11;
                                            i54 = i89;
                                            i55 = i47;
                                            i56 = i90;
                                            bArr4 = bArr4;
                                            unsafe = unsafe;
                                            i57 = i48;
                                            if (i19 == 2) {
                                                if (i19 == 5) {
                                                    zzewVar = (zzew) zzezVar;
                                                    zzewVar.zze(zzdu.zzb(bArr4, i55));
                                                    iZze = i55 + 4;
                                                    while (iZze < i53) {
                                                        iZzh7 = zzdu.zzh(bArr4, iZze, zzdtVar2);
                                                        if (i56 == zzdtVar2.zza) {
                                                            i49 = i53;
                                                            i90 = i56;
                                                            i92 = i57;
                                                            i89 = i54;
                                                            iZzh2 = iZze;
                                                            i47 = i55;
                                                            if (iZzh2 != i47) {
                                                                i12 = i12;
                                                                iZzg = iZzh2;
                                                                i87 = i49;
                                                                unsafe5 = unsafe;
                                                                zzdtVar3 = zzdtVar2;
                                                                i88 = 0;
                                                                i91 = i43;
                                                                i93 = i93;
                                                                bArr6 = bArr4;
                                                                obj3 = obj;
                                                            } else {
                                                                i13 = i12;
                                                                i18 = iZzh2;
                                                                i17 = i92;
                                                                i91 = i43;
                                                                i93 = i93;
                                                                obj3 = obj;
                                                            }
                                                        } else {
                                                            zzewVar.zze(zzdu.zzb(bArr4, iZzh7));
                                                            iZze = iZzh7 + 4;
                                                        }
                                                        break;
                                                    }
                                                    i49 = i53;
                                                    i90 = i56;
                                                    i92 = i57;
                                                    i89 = i54;
                                                    iZzh2 = iZze;
                                                    i47 = i55;
                                                    if (iZzh2 != i47) {
                                                        i12 = i12;
                                                        iZzg = iZzh2;
                                                        i87 = i49;
                                                        unsafe5 = unsafe;
                                                        zzdtVar3 = zzdtVar2;
                                                        i88 = 0;
                                                        i91 = i43;
                                                        i93 = i93;
                                                        bArr6 = bArr4;
                                                        obj3 = obj;
                                                    } else {
                                                        i13 = i12;
                                                        i18 = iZzh2;
                                                        i17 = i92;
                                                        i91 = i43;
                                                        i93 = i93;
                                                        obj3 = obj;
                                                    }
                                                }
                                                i49 = i53;
                                                i90 = i56;
                                                i47 = i55;
                                                i92 = i57;
                                                i89 = i54;
                                                iZzh2 = i47;
                                                if (iZzh2 != i47) {
                                                    i12 = i12;
                                                    iZzg = iZzh2;
                                                    i87 = i49;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    bArr6 = bArr4;
                                                    obj3 = obj;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzh2;
                                                    i17 = i92;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    obj3 = obj;
                                                }
                                                break;
                                            } else {
                                                zzewVar2 = (zzew) zzezVar;
                                                iZzf = zzdu.zzh(bArr4, i55, zzdtVar2);
                                                i59 = zzdtVar2.zza + iZzf;
                                                while (iZzf < i59) {
                                                    zzewVar2.zze(zzdu.zzb(bArr4, iZzf));
                                                    iZzf += 4;
                                                }
                                                if (iZzf != i59) {
                                                    throw zzfb.zzf();
                                                }
                                                i49 = i53;
                                                iZzh2 = iZzf;
                                                i90 = i56;
                                                i47 = i55;
                                                i92 = i57;
                                                i89 = i54;
                                                if (iZzh2 != i47) {
                                                    i12 = i12;
                                                    iZzg = iZzh2;
                                                    i87 = i49;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    bArr6 = bArr4;
                                                    obj3 = obj;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzh2;
                                                    i17 = i92;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    obj3 = obj;
                                                }
                                            }
                                            break;
                                        case 25:
                                        case 42:
                                            i53 = i11;
                                            i54 = i89;
                                            i55 = i47;
                                            i56 = i90;
                                            bArr4 = bArr4;
                                            unsafe = unsafe;
                                            i57 = i48;
                                            if (i19 == 2) {
                                                if (i19 == 0) {
                                                    zzdvVar = (zzdv) zzezVar;
                                                    iZzf = zzdu.zzk(bArr4, i55, zzdtVar2);
                                                    if (zzdtVar2.zzb != 0) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    zzdvVar.zze(z11);
                                                    while (iZzf < i53) {
                                                        iZzh8 = zzdu.zzh(bArr4, iZzf, zzdtVar2);
                                                        if (i56 == zzdtVar2.zza) {
                                                            iZzf = zzdu.zzk(bArr4, iZzh8, zzdtVar2);
                                                            if (zzdtVar2.zzb != 0) {
                                                                z12 = true;
                                                            } else {
                                                                z12 = false;
                                                            }
                                                            zzdvVar.zze(z12);
                                                        }
                                                    }
                                                }
                                                i49 = i53;
                                                i90 = i56;
                                                i47 = i55;
                                                i92 = i57;
                                                i89 = i54;
                                                iZzh2 = i47;
                                                if (iZzh2 != i47) {
                                                    i12 = i12;
                                                    iZzg = iZzh2;
                                                    i87 = i49;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    bArr6 = bArr4;
                                                    obj3 = obj;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzh2;
                                                    i17 = i92;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    obj3 = obj;
                                                }
                                            } else {
                                                zzdvVar2 = (zzdv) zzezVar;
                                                iZzf = zzdu.zzh(bArr4, i55, zzdtVar2);
                                                i60 = zzdtVar2.zza + iZzf;
                                                while (iZzf < i60) {
                                                    iZzf = zzdu.zzk(bArr4, iZzf, zzdtVar2);
                                                    if (zzdtVar2.zzb != 0) {
                                                        z13 = true;
                                                    } else {
                                                        z13 = false;
                                                    }
                                                    zzdvVar2.zze(z13);
                                                }
                                                if (iZzf != i60) {
                                                    throw zzfb.zzf();
                                                }
                                            }
                                            i49 = i53;
                                            iZzh2 = iZzf;
                                            i90 = i56;
                                            i47 = i55;
                                            i92 = i57;
                                            i89 = i54;
                                            if (iZzh2 != i47) {
                                                i12 = i12;
                                                iZzg = iZzh2;
                                                i87 = i49;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i91 = i43;
                                                i93 = i93;
                                                bArr6 = bArr4;
                                                obj3 = obj;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzh2;
                                                i17 = i92;
                                                i91 = i43;
                                                i93 = i93;
                                                obj3 = obj;
                                            }
                                            break;
                                        case 26:
                                            i53 = i11;
                                            i54 = i89;
                                            i55 = i47;
                                            i56 = i90;
                                            bArr4 = bArr4;
                                            unsafe = unsafe;
                                            i57 = i48;
                                            if (i19 == 2) {
                                                if ((j11 & SvgConstantsKt.SPECIFIED_CLIP_RULE) == 0) {
                                                    iZzf = zzdu.zzh(bArr4, i55, zzdtVar2);
                                                    i65 = zzdtVar2.zza;
                                                    if (i65 >= 0) {
                                                        throw zzfb.zzc();
                                                    }
                                                    if (i65 == 0) {
                                                        obj2 = r6;
                                                        zzezVar.add(obj2);
                                                    } else {
                                                        obj2 = r6;
                                                        zzezVar.add(new String(bArr4, iZzf, i65, zzfa.zzb));
                                                        iZzf += i65;
                                                    }
                                                    while (iZzf < i53) {
                                                        iZzh10 = zzdu.zzh(bArr4, iZzf, zzdtVar2);
                                                        if (i56 == zzdtVar2.zza) {
                                                            iZzf = zzdu.zzh(bArr4, iZzh10, zzdtVar2);
                                                            i66 = zzdtVar2.zza;
                                                            if (i66 >= 0) {
                                                                throw zzfb.zzc();
                                                            }
                                                            if (i66 == 0) {
                                                                zzezVar.add(obj2);
                                                            } else {
                                                                zzezVar.add(new String(bArr4, iZzf, i66, zzfa.zzb));
                                                                iZzf += i66;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    iZzf = zzdu.zzh(bArr4, i55, zzdtVar2);
                                                    i61 = zzdtVar2.zza;
                                                    if (i61 >= 0) {
                                                        throw zzfb.zzc();
                                                    }
                                                    if (i61 == 0) {
                                                        zzezVar.add("");
                                                    } else {
                                                        i62 = iZzf + i61;
                                                        if (zzhn.zzc(bArr4, iZzf, i62)) {
                                                            throw zzfb.zzb();
                                                        }
                                                        zzezVar.add(new String(bArr4, iZzf, i61, zzfa.zzb));
                                                        iZzf = i62;
                                                    }
                                                    while (iZzf < i53) {
                                                        iZzh9 = zzdu.zzh(bArr4, iZzf, zzdtVar2);
                                                        if (i56 == zzdtVar2.zza) {
                                                            iZzf = zzdu.zzh(bArr4, iZzh9, zzdtVar2);
                                                            i63 = zzdtVar2.zza;
                                                            if (i63 >= 0) {
                                                                throw zzfb.zzc();
                                                            }
                                                            if (i63 == 0) {
                                                                zzezVar.add("");
                                                            } else {
                                                                i64 = iZzf + i63;
                                                                if (zzhn.zzc(bArr4, iZzf, i64)) {
                                                                    throw zzfb.zzb();
                                                                }
                                                                zzezVar.add(new String(bArr4, iZzf, i63, zzfa.zzb));
                                                                iZzf = i64;
                                                            }
                                                        }
                                                    }
                                                }
                                                i49 = i53;
                                                iZzh2 = iZzf;
                                                i90 = i56;
                                                i47 = i55;
                                                i92 = i57;
                                                i89 = i54;
                                                if (iZzh2 != i47) {
                                                    i12 = i12;
                                                    iZzg = iZzh2;
                                                    i87 = i49;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    bArr6 = bArr4;
                                                    obj3 = obj;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzh2;
                                                    i17 = i92;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    obj3 = obj;
                                                }
                                            }
                                            i49 = i53;
                                            i90 = i56;
                                            i47 = i55;
                                            i92 = i57;
                                            i89 = i54;
                                            iZzh2 = i47;
                                            if (iZzh2 != i47) {
                                                i12 = i12;
                                                iZzg = iZzh2;
                                                i87 = i49;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i91 = i43;
                                                i93 = i93;
                                                bArr6 = bArr4;
                                                obj3 = obj;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzh2;
                                                i17 = i92;
                                                i91 = i43;
                                                i93 = i93;
                                                obj3 = obj;
                                            }
                                            break;
                                        case 27:
                                            i67 = i11;
                                            if (i19 == 2) {
                                                this = this;
                                                i54 = i89;
                                                i57 = i48;
                                                i55 = i47;
                                                i56 = i90;
                                                bArr4 = bArr4;
                                                iZze = zzdu.zze(this.zzr(i89), i90, bArr, i47, i11, zzezVar, zzdtVar);
                                                i49 = i67;
                                                unsafe = unsafe;
                                                i90 = i56;
                                                i92 = i57;
                                                i89 = i54;
                                                iZzh2 = iZze;
                                                i47 = i55;
                                                if (iZzh2 != i47) {
                                                    i12 = i12;
                                                    iZzg = iZzh2;
                                                    i87 = i49;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    bArr6 = bArr4;
                                                    obj3 = obj;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzh2;
                                                    i17 = i92;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    obj3 = obj;
                                                }
                                            } else {
                                                i92 = i48;
                                                i49 = i67;
                                                iZzh2 = i47;
                                                if (iZzh2 != i47) {
                                                    i12 = i12;
                                                    iZzg = iZzh2;
                                                    i87 = i49;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    bArr6 = bArr4;
                                                    obj3 = obj;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzh2;
                                                    i17 = i92;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    obj3 = obj;
                                                }
                                            }
                                            break;
                                        case 28:
                                            i67 = i11;
                                            if (i19 == 2) {
                                                iZzh11 = zzdu.zzh(bArr4, i47, zzdtVar2);
                                                i68 = zzdtVar2.zza;
                                                if (i68 >= 0) {
                                                    throw zzfb.zzc();
                                                }
                                                if (i68 <= bArr4.length - iZzh11) {
                                                    throw zzfb.zzf();
                                                }
                                                if (i68 == 0) {
                                                    zzezVar.add(zzef.zzb);
                                                } else {
                                                    zzezVar.add(zzef.zzk(bArr4, iZzh11, i68));
                                                    iZzh11 += i68;
                                                }
                                                while (iZzh11 < i67) {
                                                    iZzh12 = zzdu.zzh(bArr4, iZzh11, zzdtVar2);
                                                    if (i90 == zzdtVar2.zza) {
                                                        iZzh11 = zzdu.zzh(bArr4, iZzh12, zzdtVar2);
                                                        i69 = zzdtVar2.zza;
                                                        if (i69 >= 0) {
                                                            throw zzfb.zzc();
                                                        }
                                                        if (i69 <= bArr4.length - iZzh11) {
                                                            throw zzfb.zzf();
                                                        }
                                                        if (i69 == 0) {
                                                            zzezVar.add(zzef.zzb);
                                                        } else {
                                                            zzezVar.add(zzef.zzk(bArr4, iZzh11, i69));
                                                            iZzh11 += i69;
                                                        }
                                                    } else {
                                                        i92 = i48;
                                                        i89 = i89;
                                                        i47 = i47;
                                                        i90 = i90;
                                                        bArr4 = bArr4;
                                                        unsafe = unsafe;
                                                        this = this;
                                                        i49 = i67;
                                                        iZzh2 = iZzh11;
                                                    }
                                                }
                                                i92 = i48;
                                                i89 = i89;
                                                i47 = i47;
                                                i90 = i90;
                                                bArr4 = bArr4;
                                                unsafe = unsafe;
                                                this = this;
                                                i49 = i67;
                                                iZzh2 = iZzh11;
                                            } else {
                                                i92 = i48;
                                                i49 = i67;
                                                iZzh2 = i47;
                                            }
                                            if (iZzh2 != i47) {
                                                i12 = i12;
                                                iZzg = iZzh2;
                                                i87 = i49;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i91 = i43;
                                                i93 = i93;
                                                bArr6 = bArr4;
                                                obj3 = obj;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzh2;
                                                i17 = i92;
                                                i91 = i43;
                                                i93 = i93;
                                                obj3 = obj;
                                            }
                                            break;
                                        case 30:
                                        case 44:
                                            i70 = i11;
                                            if (i19 == 2) {
                                                iZzj = zzdu.zzf(bArr4, i47, zzezVar, zzdtVar2);
                                            } else if (i19 == 0) {
                                                i67 = i70;
                                                i92 = i48;
                                                i49 = i67;
                                                iZzh2 = i47;
                                                if (iZzh2 != i47) {
                                                    i12 = i12;
                                                    iZzg = iZzh2;
                                                    i87 = i49;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    bArr6 = bArr4;
                                                    obj3 = obj;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzh2;
                                                    i17 = i92;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    obj3 = obj;
                                                }
                                            } else {
                                                iZzj = zzdu.zzj(i90, bArr, i47, i11, zzezVar, zzdtVar);
                                            }
                                            zzeyVarZzq = this.zzq(i89);
                                            zzgzVar = this.zzl;
                                            int i102 = zzgk.zza;
                                            if (zzeyVarZzq != null) {
                                                i71 = iZzj;
                                                i72 = i70;
                                                i73 = i48;
                                            } else if (zzezVar instanceof RandomAccess) {
                                                size = zzezVar.size();
                                                objZzc2 = null;
                                                i74 = 0;
                                                i75 = 0;
                                                while (i74 < size) {
                                                    iIntValue2 = ((Integer) zzezVar.get(i74)).intValue();
                                                    if (zzeyVarZzq.zza()) {
                                                        if (i74 != i75) {
                                                            zzezVar.set(i75, Integer.valueOf(iIntValue2));
                                                        }
                                                        i75++;
                                                        i76 = i48;
                                                    } else {
                                                        i76 = i48;
                                                        objZzc2 = zzgk.zzc(obj, i76, iIntValue2, objZzc2, zzgzVar);
                                                    }
                                                    i74++;
                                                    i48 = i76;
                                                    i70 = i70;
                                                    iZzj = iZzj;
                                                }
                                                i71 = iZzj;
                                                i72 = i70;
                                                i73 = i48;
                                                if (i75 != size) {
                                                    zzezVar.subList(i75, size).clear();
                                                }
                                            } else {
                                                i71 = iZzj;
                                                i72 = i70;
                                                i73 = i48;
                                                it = zzezVar.iterator();
                                                objZzc = null;
                                                while (it.hasNext()) {
                                                    iIntValue = ((Integer) it.next()).intValue();
                                                    if (!zzeyVarZzq.zza()) {
                                                        objZzc = zzgk.zzc(obj, i73, iIntValue, objZzc, zzgzVar);
                                                        it.remove();
                                                    }
                                                }
                                            }
                                            i92 = i73;
                                            i89 = i89;
                                            i47 = i47;
                                            i90 = i90;
                                            bArr4 = bArr4;
                                            unsafe = unsafe;
                                            this = this;
                                            i49 = i72;
                                            iZzh2 = i71;
                                            if (iZzh2 != i47) {
                                                i12 = i12;
                                                iZzg = iZzh2;
                                                i87 = i49;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i91 = i43;
                                                i93 = i93;
                                                bArr6 = bArr4;
                                                obj3 = obj;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzh2;
                                                i17 = i92;
                                                i91 = i43;
                                                i93 = i93;
                                                obj3 = obj;
                                            }
                                            break;
                                        case 33:
                                        case 47:
                                            i77 = i11;
                                            if (i19 == 2) {
                                                if (i19 == 0) {
                                                    zzewVar3 = (zzew) zzezVar;
                                                    iZzh2 = zzdu.zzh(bArr4, i47, zzdtVar2);
                                                    zzewVar3.zze(zzej.zzb(zzdtVar2.zza));
                                                    while (iZzh2 < i77) {
                                                        iZzh13 = zzdu.zzh(bArr4, iZzh2, zzdtVar2);
                                                        if (i90 == zzdtVar2.zza) {
                                                            iZzh2 = zzdu.zzh(bArr4, iZzh13, zzdtVar2);
                                                            zzewVar3.zze(zzej.zzb(zzdtVar2.zza));
                                                        }
                                                    }
                                                }
                                                i89 = i89;
                                                i47 = i47;
                                                i90 = i90;
                                                i92 = i48;
                                                i49 = i77;
                                                bArr4 = bArr4;
                                                unsafe = unsafe;
                                                iZzh2 = i47;
                                                if (iZzh2 != i47) {
                                                    i12 = i12;
                                                    iZzg = iZzh2;
                                                    i87 = i49;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    bArr6 = bArr4;
                                                    obj3 = obj;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzh2;
                                                    i17 = i92;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    obj3 = obj;
                                                }
                                            } else {
                                                zzewVar4 = (zzew) zzezVar;
                                                iZzh2 = zzdu.zzh(bArr4, i47, zzdtVar2);
                                                i78 = zzdtVar2.zza + iZzh2;
                                                while (iZzh2 < i78) {
                                                    iZzh2 = zzdu.zzh(bArr4, iZzh2, zzdtVar2);
                                                    zzewVar4.zze(zzej.zzb(zzdtVar2.zza));
                                                }
                                                if (iZzh2 != i78) {
                                                    throw zzfb.zzf();
                                                }
                                            }
                                            i89 = i89;
                                            i47 = i47;
                                            i90 = i90;
                                            i92 = i48;
                                            i49 = i77;
                                            bArr4 = bArr4;
                                            unsafe = unsafe;
                                            if (iZzh2 != i47) {
                                                i12 = i12;
                                                iZzg = iZzh2;
                                                i87 = i49;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i91 = i43;
                                                i93 = i93;
                                                bArr6 = bArr4;
                                                obj3 = obj;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzh2;
                                                i17 = i92;
                                                i91 = i43;
                                                i93 = i93;
                                                obj3 = obj;
                                            }
                                            break;
                                        case 34:
                                        case 48:
                                            i77 = i11;
                                            if (i19 == 2) {
                                                if (i19 == 0) {
                                                    zzfmVar5 = (zzfm) zzezVar;
                                                    iZzh2 = zzdu.zzk(bArr4, i47, zzdtVar2);
                                                    zzfmVar5.zze(zzej.zzc(zzdtVar2.zzb));
                                                    while (iZzh2 < i77) {
                                                        iZzh14 = zzdu.zzh(bArr4, iZzh2, zzdtVar2);
                                                        if (i90 == zzdtVar2.zza) {
                                                            iZzh2 = zzdu.zzk(bArr4, iZzh14, zzdtVar2);
                                                            zzfmVar5.zze(zzej.zzc(zzdtVar2.zzb));
                                                        }
                                                    }
                                                }
                                                i89 = i89;
                                                i47 = i47;
                                                i90 = i90;
                                                i92 = i48;
                                                i49 = i77;
                                                bArr4 = bArr4;
                                                unsafe = unsafe;
                                                iZzh2 = i47;
                                                if (iZzh2 != i47) {
                                                    i12 = i12;
                                                    iZzg = iZzh2;
                                                    i87 = i49;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    bArr6 = bArr4;
                                                    obj3 = obj;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzh2;
                                                    i17 = i92;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    obj3 = obj;
                                                }
                                            } else {
                                                zzfmVar6 = (zzfm) zzezVar;
                                                iZzh2 = zzdu.zzh(bArr4, i47, zzdtVar2);
                                                i79 = zzdtVar2.zza + iZzh2;
                                                while (iZzh2 < i79) {
                                                    iZzh2 = zzdu.zzk(bArr4, iZzh2, zzdtVar2);
                                                    zzfmVar6.zze(zzej.zzc(zzdtVar2.zzb));
                                                }
                                                if (iZzh2 != i79) {
                                                    throw zzfb.zzf();
                                                }
                                            }
                                            i89 = i89;
                                            i47 = i47;
                                            i90 = i90;
                                            i92 = i48;
                                            i49 = i77;
                                            bArr4 = bArr4;
                                            unsafe = unsafe;
                                            if (iZzh2 != i47) {
                                                i12 = i12;
                                                iZzg = iZzh2;
                                                i87 = i49;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i91 = i43;
                                                i93 = i93;
                                                bArr6 = bArr4;
                                                obj3 = obj;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzh2;
                                                i17 = i92;
                                                i91 = i43;
                                                i93 = i93;
                                                obj3 = obj;
                                            }
                                            break;
                                        default:
                                            if (i19 == 3) {
                                                zzgiVarZzr = this.zzr(i89);
                                                i80 = (i90 & (-8)) | 4;
                                                i77 = i11;
                                                iZzh2 = zzdu.zzc(zzgiVarZzr, bArr, i47, i11, i80, zzdtVar);
                                                zzezVar.add(zzdtVar2.zzc);
                                                while (iZzh2 < i77) {
                                                    iZzh15 = zzdu.zzh(bArr4, iZzh2, zzdtVar2);
                                                    if (i90 == zzdtVar2.zza) {
                                                        i89 = i89;
                                                        i47 = i47;
                                                        i90 = i90;
                                                        i92 = i48;
                                                        i49 = i77;
                                                        bArr4 = bArr4;
                                                        unsafe = unsafe;
                                                        if (iZzh2 != i47) {
                                                            i12 = i12;
                                                            iZzg = iZzh2;
                                                            i87 = i49;
                                                            unsafe5 = unsafe;
                                                            zzdtVar3 = zzdtVar2;
                                                            i88 = 0;
                                                            i91 = i43;
                                                            i93 = i93;
                                                            bArr6 = bArr4;
                                                            obj3 = obj;
                                                        } else {
                                                            i13 = i12;
                                                            i18 = iZzh2;
                                                            i17 = i92;
                                                            i91 = i43;
                                                            i93 = i93;
                                                            obj3 = obj;
                                                        }
                                                    } else {
                                                        iZzh2 = zzdu.zzc(zzgiVarZzr, bArr, iZzh15, i11, i80, zzdtVar);
                                                        zzezVar.add(zzdtVar2.zzc);
                                                    }
                                                    break;
                                                }
                                                i89 = i89;
                                                i47 = i47;
                                                i90 = i90;
                                                i92 = i48;
                                                i49 = i77;
                                                bArr4 = bArr4;
                                                unsafe = unsafe;
                                                if (iZzh2 != i47) {
                                                    i12 = i12;
                                                    iZzg = iZzh2;
                                                    i87 = i49;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    bArr6 = bArr4;
                                                    obj3 = obj;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzh2;
                                                    i17 = i92;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    obj3 = obj;
                                                }
                                            } else {
                                                i89 = i89;
                                                i47 = i47;
                                                i90 = i90;
                                                bArr4 = bArr4;
                                                unsafe = unsafe;
                                                i92 = i48;
                                                i49 = i11;
                                                iZzh2 = i47;
                                                if (iZzh2 != i47) {
                                                    i12 = i12;
                                                    iZzg = iZzh2;
                                                    i87 = i49;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    bArr6 = bArr4;
                                                    obj3 = obj;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzh2;
                                                    i17 = i92;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    obj3 = obj;
                                                }
                                            }
                                            break;
                                    }
                                } else {
                                    i45 = i89;
                                    i44 = i47;
                                    i90 = i90;
                                    unsafe = unsafe;
                                    i46 = i92;
                                    if (iZzn == 50) {
                                        obj3 = obj;
                                        unsafe4 = zzb;
                                        j12 = iArr[i45 + 2] & 1048575;
                                        switch (iZzn) {
                                            case 51:
                                                i17 = i46;
                                                i81 = i45;
                                                bArr5 = bArr;
                                                i82 = i44;
                                                if (i19 == 1) {
                                                    unsafe4.putObject(obj3, j10, Double.valueOf(Double.longBitsToDouble(zzdu.zzn(bArr5, i82))));
                                                    iZzk2 = i82 + 8;
                                                    unsafe4.putInt(obj3, j12, i17);
                                                    iZzg = iZzk2;
                                                } else {
                                                    iZzg = i82;
                                                }
                                                if (iZzg != i82) {
                                                    this = this;
                                                    i92 = i17;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    i87 = i11;
                                                    bArr6 = bArr5;
                                                    i12 = i12;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzg;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                }
                                                break;
                                            case 52:
                                                i17 = i46;
                                                i81 = i45;
                                                bArr5 = bArr;
                                                i82 = i44;
                                                if (i19 == 5) {
                                                    unsafe4.putObject(obj3, j10, Float.valueOf(Float.intBitsToFloat(zzdu.zzb(bArr5, i82))));
                                                    iZzk2 = i82 + 4;
                                                    unsafe4.putInt(obj3, j12, i17);
                                                    iZzg = iZzk2;
                                                } else {
                                                    iZzg = i82;
                                                }
                                                if (iZzg != i82) {
                                                    this = this;
                                                    i92 = i17;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    i87 = i11;
                                                    bArr6 = bArr5;
                                                    i12 = i12;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzg;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                }
                                                break;
                                            case 53:
                                            case 54:
                                                i17 = i46;
                                                i81 = i45;
                                                bArr5 = bArr;
                                                i82 = i44;
                                                if (i19 == 0) {
                                                    iZzk2 = zzdu.zzk(bArr5, i82, zzdtVar2);
                                                    unsafe4.putObject(obj3, j10, Long.valueOf(zzdtVar2.zzb));
                                                    unsafe4.putInt(obj3, j12, i17);
                                                    iZzg = iZzk2;
                                                } else {
                                                    iZzg = i82;
                                                }
                                                if (iZzg != i82) {
                                                    this = this;
                                                    i92 = i17;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    i87 = i11;
                                                    bArr6 = bArr5;
                                                    i12 = i12;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzg;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                }
                                                break;
                                            case 55:
                                            case 62:
                                                i17 = i46;
                                                i81 = i45;
                                                bArr5 = bArr;
                                                i82 = i44;
                                                if (i19 == 0) {
                                                    iZzk2 = zzdu.zzh(bArr5, i82, zzdtVar2);
                                                    unsafe4.putObject(obj3, j10, Integer.valueOf(zzdtVar2.zza));
                                                    unsafe4.putInt(obj3, j12, i17);
                                                    iZzg = iZzk2;
                                                } else {
                                                    iZzg = i82;
                                                }
                                                if (iZzg != i82) {
                                                    this = this;
                                                    i92 = i17;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    i87 = i11;
                                                    bArr6 = bArr5;
                                                    i12 = i12;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzg;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                }
                                                break;
                                            case 56:
                                            case 65:
                                                i17 = i46;
                                                i81 = i45;
                                                bArr5 = bArr;
                                                i82 = i44;
                                                if (i19 == 1) {
                                                    unsafe4.putObject(obj3, j10, Long.valueOf(zzdu.zzn(bArr5, i82)));
                                                    iZzk2 = i82 + 8;
                                                    unsafe4.putInt(obj3, j12, i17);
                                                    iZzg = iZzk2;
                                                } else {
                                                    iZzg = i82;
                                                }
                                                if (iZzg != i82) {
                                                    this = this;
                                                    i92 = i17;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    i87 = i11;
                                                    bArr6 = bArr5;
                                                    i12 = i12;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzg;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                }
                                                break;
                                            case 57:
                                            case 64:
                                                i17 = i46;
                                                i81 = i45;
                                                bArr5 = bArr;
                                                i82 = i44;
                                                if (i19 == 5) {
                                                    unsafe4.putObject(obj3, j10, Integer.valueOf(zzdu.zzb(bArr5, i82)));
                                                    iZzk2 = i82 + 4;
                                                    unsafe4.putInt(obj3, j12, i17);
                                                    iZzg = iZzk2;
                                                } else {
                                                    iZzg = i82;
                                                }
                                                if (iZzg != i82) {
                                                    this = this;
                                                    i92 = i17;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    i87 = i11;
                                                    bArr6 = bArr5;
                                                    i12 = i12;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzg;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                }
                                                break;
                                            case 58:
                                                i17 = i46;
                                                i81 = i45;
                                                bArr5 = bArr;
                                                i82 = i44;
                                                if (i19 == 0) {
                                                    iZzk2 = zzdu.zzk(bArr5, i82, zzdtVar2);
                                                    if (zzdtVar2.zzb != 0) {
                                                        z14 = true;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    unsafe4.putObject(obj3, j10, Boolean.valueOf(z14));
                                                    unsafe4.putInt(obj3, j12, i17);
                                                    iZzg = iZzk2;
                                                } else {
                                                    iZzg = i82;
                                                }
                                                if (iZzg != i82) {
                                                    this = this;
                                                    i92 = i17;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    i87 = i11;
                                                    bArr6 = bArr5;
                                                    i12 = i12;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzg;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                }
                                                break;
                                            case 59:
                                                i17 = i46;
                                                bArr5 = bArr;
                                                i82 = i44;
                                                i81 = i45;
                                                if (i19 == 2) {
                                                    iZzh16 = zzdu.zzh(bArr5, i82, zzdtVar2);
                                                    i83 = zzdtVar2.zza;
                                                    if (i83 == 0) {
                                                        unsafe4.putObject(obj3, j10, "");
                                                    } else {
                                                        if ((i20 & PKIFailureInfo.duplicateCertReq) == 0 && !zzhn.zzc(bArr5, iZzh16, iZzh16 + i83)) {
                                                            throw zzfb.zzb();
                                                        }
                                                        unsafe4.putObject(obj3, j10, new String(bArr5, iZzh16, i83, zzfa.zzb));
                                                        iZzh16 += i83;
                                                    }
                                                    unsafe4.putInt(obj3, j12, i17);
                                                    iZzg = iZzh16;
                                                } else {
                                                    i81 = i81;
                                                    iZzg = i82;
                                                }
                                                if (iZzg != i82) {
                                                    this = this;
                                                    i92 = i17;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    i87 = i11;
                                                    bArr6 = bArr5;
                                                    i12 = i12;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzg;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                }
                                                break;
                                            case 60:
                                                i84 = i45;
                                                i85 = i44;
                                                if (i19 == 2) {
                                                    Object objZzu = this.zzu(obj3, i46, i84);
                                                    int iZzm3 = zzdu.zzm(objZzu, this.zzr(i84), bArr, i85, i11, zzdtVar);
                                                    this.zzC(obj3, i46, i84, objZzu);
                                                    iZzg = iZzm3;
                                                    bArr5 = bArr;
                                                    i81 = i84;
                                                    i82 = i85;
                                                    i17 = i46;
                                                } else {
                                                    i81 = i84;
                                                    bArr5 = bArr;
                                                    i82 = i85;
                                                    i17 = i46;
                                                    iZzg = i82;
                                                }
                                                if (iZzg != i82) {
                                                    this = this;
                                                    i92 = i17;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    i87 = i11;
                                                    bArr6 = bArr5;
                                                    i12 = i12;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzg;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                }
                                                break;
                                            case 61:
                                                i85 = i44;
                                                i84 = i45;
                                                if (i19 == 2) {
                                                    iZza = zzdu.zza(bArr, i85, zzdtVar2);
                                                    unsafe4.putObject(obj3, j10, zzdtVar2.zzc);
                                                    unsafe4.putInt(obj3, j12, i46);
                                                    iZzg = iZza;
                                                    i81 = i84;
                                                    bArr5 = bArr;
                                                    i82 = i85;
                                                    i17 = i46;
                                                    if (iZzg != i82) {
                                                        this = this;
                                                        i92 = i17;
                                                        unsafe5 = unsafe;
                                                        zzdtVar3 = zzdtVar2;
                                                        i88 = 0;
                                                        i89 = i81;
                                                        i91 = i43;
                                                        i93 = i93;
                                                        i87 = i11;
                                                        bArr6 = bArr5;
                                                        i12 = i12;
                                                    } else {
                                                        i13 = i12;
                                                        i18 = iZzg;
                                                        i89 = i81;
                                                        i91 = i43;
                                                        i93 = i93;
                                                    }
                                                }
                                                i81 = i84;
                                                bArr5 = bArr;
                                                i82 = i85;
                                                i17 = i46;
                                                iZzg = i82;
                                                if (iZzg != i82) {
                                                    this = this;
                                                    i92 = i17;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    i87 = i11;
                                                    bArr6 = bArr5;
                                                    i12 = i12;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzg;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                }
                                                break;
                                            case 63:
                                                i85 = i44;
                                                i84 = i45;
                                                if (i19 == 0) {
                                                    iZza = zzdu.zzh(bArr, i85, zzdtVar2);
                                                    i86 = zzdtVar2.zza;
                                                    zzeyVarZzq2 = this.zzq(i84);
                                                    if (zzeyVarZzq2 != null || zzeyVarZzq2.zza()) {
                                                        unsafe4.putObject(obj3, j10, Integer.valueOf(i86));
                                                        unsafe4.putInt(obj3, j12, i46);
                                                    } else {
                                                        zzc(obj).zzh(i90, Long.valueOf(i86));
                                                    }
                                                    iZzg = iZza;
                                                    i81 = i84;
                                                    bArr5 = bArr;
                                                    i82 = i85;
                                                    i17 = i46;
                                                    if (iZzg != i82) {
                                                        this = this;
                                                        i92 = i17;
                                                        unsafe5 = unsafe;
                                                        zzdtVar3 = zzdtVar2;
                                                        i88 = 0;
                                                        i89 = i81;
                                                        i91 = i43;
                                                        i93 = i93;
                                                        i87 = i11;
                                                        bArr6 = bArr5;
                                                        i12 = i12;
                                                    } else {
                                                        i13 = i12;
                                                        i18 = iZzg;
                                                        i89 = i81;
                                                        i91 = i43;
                                                        i93 = i93;
                                                    }
                                                }
                                                i81 = i84;
                                                bArr5 = bArr;
                                                i82 = i85;
                                                i17 = i46;
                                                iZzg = i82;
                                                if (iZzg != i82) {
                                                    this = this;
                                                    i92 = i17;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    i87 = i11;
                                                    bArr6 = bArr5;
                                                    i12 = i12;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzg;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                }
                                                break;
                                            case 66:
                                                i85 = i44;
                                                i84 = i45;
                                                if (i19 == 0) {
                                                    iZza = zzdu.zzh(bArr, i85, zzdtVar2);
                                                    unsafe4.putObject(obj3, j10, Integer.valueOf(zzej.zzb(zzdtVar2.zza)));
                                                    unsafe4.putInt(obj3, j12, i46);
                                                    iZzg = iZza;
                                                    i81 = i84;
                                                    bArr5 = bArr;
                                                    i82 = i85;
                                                    i17 = i46;
                                                    if (iZzg != i82) {
                                                        this = this;
                                                        i92 = i17;
                                                        unsafe5 = unsafe;
                                                        zzdtVar3 = zzdtVar2;
                                                        i88 = 0;
                                                        i89 = i81;
                                                        i91 = i43;
                                                        i93 = i93;
                                                        i87 = i11;
                                                        bArr6 = bArr5;
                                                        i12 = i12;
                                                    } else {
                                                        i13 = i12;
                                                        i18 = iZzg;
                                                        i89 = i81;
                                                        i91 = i43;
                                                        i93 = i93;
                                                    }
                                                }
                                                i81 = i84;
                                                bArr5 = bArr;
                                                i82 = i85;
                                                i17 = i46;
                                                iZzg = i82;
                                                if (iZzg != i82) {
                                                    this = this;
                                                    i92 = i17;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    i87 = i11;
                                                    bArr6 = bArr5;
                                                    i12 = i12;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzg;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                }
                                                break;
                                            case 67:
                                                i85 = i44;
                                                i84 = i45;
                                                if (i19 == 0) {
                                                    int iZzk5 = zzdu.zzk(bArr, i85, zzdtVar2);
                                                    unsafe = unsafe;
                                                    unsafe4.putObject(obj3, j10, Long.valueOf(zzej.zzc(zzdtVar2.zzb)));
                                                    unsafe4.putInt(obj3, j12, i46);
                                                    i81 = i84;
                                                    iZzg = iZzk5;
                                                    bArr5 = bArr;
                                                    i82 = i85;
                                                    i17 = i46;
                                                    if (iZzg != i82) {
                                                        this = this;
                                                        i92 = i17;
                                                        unsafe5 = unsafe;
                                                        zzdtVar3 = zzdtVar2;
                                                        i88 = 0;
                                                        i89 = i81;
                                                        i91 = i43;
                                                        i93 = i93;
                                                        i87 = i11;
                                                        bArr6 = bArr5;
                                                        i12 = i12;
                                                    } else {
                                                        i13 = i12;
                                                        i18 = iZzg;
                                                        i89 = i81;
                                                        i91 = i43;
                                                        i93 = i93;
                                                    }
                                                } else {
                                                    unsafe = unsafe;
                                                    i81 = i84;
                                                    bArr5 = bArr;
                                                    i82 = i85;
                                                    i17 = i46;
                                                    iZzg = i82;
                                                    if (iZzg != i82) {
                                                        this = this;
                                                        i92 = i17;
                                                        unsafe5 = unsafe;
                                                        zzdtVar3 = zzdtVar2;
                                                        i88 = 0;
                                                        i89 = i81;
                                                        i91 = i43;
                                                        i93 = i93;
                                                        i87 = i11;
                                                        bArr6 = bArr5;
                                                        i12 = i12;
                                                    } else {
                                                        i13 = i12;
                                                        i18 = iZzg;
                                                        i89 = i81;
                                                        i91 = i43;
                                                        i93 = i93;
                                                    }
                                                }
                                                break;
                                            case 68:
                                                if (i19 == 3) {
                                                    Object objZzu2 = this.zzu(obj3, i46, i45);
                                                    i85 = i44;
                                                    iZzg = zzdu.zzl(objZzu2, this.zzr(i45), bArr, i85, i11, (i90 & (-8)) | 4, zzdtVar);
                                                    this.zzC(obj3, i46, i45, objZzu2);
                                                    unsafe = unsafe;
                                                    i81 = i45;
                                                    i90 = i90;
                                                    bArr5 = bArr;
                                                    i82 = i85;
                                                    i17 = i46;
                                                    if (iZzg != i82) {
                                                        this = this;
                                                        i92 = i17;
                                                        unsafe5 = unsafe;
                                                        zzdtVar3 = zzdtVar2;
                                                        i88 = 0;
                                                        i89 = i81;
                                                        i91 = i43;
                                                        i93 = i93;
                                                        i87 = i11;
                                                        bArr6 = bArr5;
                                                        i12 = i12;
                                                    } else {
                                                        i13 = i12;
                                                        i18 = iZzg;
                                                        i89 = i81;
                                                        i91 = i43;
                                                        i93 = i93;
                                                    }
                                                    break;
                                                }
                                            default:
                                                i17 = i46;
                                                i81 = i45;
                                                bArr5 = bArr;
                                                i82 = i44;
                                                iZzg = i82;
                                                if (iZzg != i82) {
                                                    this = this;
                                                    i92 = i17;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    i87 = i11;
                                                    bArr6 = bArr5;
                                                    i12 = i12;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzg;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                }
                                                break;
                                        }
                                    } else {
                                        if (i19 == 2) {
                                            unsafe3 = zzb;
                                            Object objZzs = this.zzs(i45);
                                            object = unsafe3.getObject(obj, j10);
                                            if (!((zzfr) object).zze()) {
                                                zzfr zzfrVarZzb = zzfr.zza().zzb();
                                                zzfs.zza(zzfrVarZzb, object);
                                                unsafe3.putObject(obj, j10, zzfrVarZzb);
                                            }
                                            throw null;
                                        }
                                        obj3 = obj;
                                        bArr3 = bArr;
                                    }
                                }
                            } else if (i19 == 2) {
                                zzezVarZzd = (zzez) unsafe.getObject(obj3, j10);
                                if (!zzezVarZzd.zzc()) {
                                    int size3 = zzezVarZzd.size();
                                    zzezVarZzd = zzezVarZzd.zzd(size3 != 0 ? size3 + size3 : 10);
                                    unsafe.putObject(obj3, j10, zzezVarZzd);
                                }
                                iZzg = zzdu.zze(this.zzr(i15), i42, bArr, i21, i11, zzezVarZzd, zzdtVar);
                                i90 = i42;
                                i89 = i15;
                                i92 = i92;
                                zzdtVar3 = zzdtVar2;
                                i88 = 0;
                                i91 = i91;
                                i93 = i93;
                                unsafe5 = unsafe;
                                bArr6 = bArr;
                                i87 = i11;
                            } else {
                                i93 = i93;
                                i43 = i91;
                                i44 = i21;
                                i45 = i15;
                                bArr3 = bArr;
                                i46 = i92;
                                i90 = i42;
                            }
                            i13 = i12;
                            i17 = i46;
                            i18 = i44;
                            i89 = i45;
                            i91 = i43;
                            i93 = i93;
                        }
                    }
                    if (i90 == i13 || i13 == 0) {
                        i92 = i17;
                        iZzg = zzdu.zzg(i90, bArr, i18, i11, zzc(obj), zzdtVar);
                        i87 = i11;
                        i12 = i13;
                        unsafe5 = unsafe;
                        zzdtVar3 = zzdtVar2;
                        i88 = i16;
                        this = this;
                        bArr6 = bArr;
                    } else {
                        iZzg = i18;
                    }
                }
                i15 = iZzm;
                i14 = -1;
                if (i15 == i14) {
                    i89 = i88;
                    i16 = i89;
                    i13 = i12;
                    i17 = i95;
                    zzdtVar2 = zzdtVar3;
                    unsafe = unsafe5;
                    i18 = iZzi;
                } else {
                    i19 = i90 & 7;
                    iArr = this.zzc;
                    i20 = iArr[i15 + 1];
                    iZzn = zzn(i20);
                    i92 = i95;
                    j10 = i20 & 1048575;
                    i21 = iZzi;
                    if (iZzn <= 17) {
                        int i911 = iArr[i15 + 2];
                        i22 = 1 << (i911 >>> 20);
                        i23 = 1048575;
                        i24 = i911 & 1048575;
                        i25 = i15;
                        if (i24 != i93) {
                            if (i93 != 1048575) {
                                unsafe5.putInt(obj3, i93, i91);
                                i23 = 1048575;
                            }
                            if (i24 == i23) {
                                i41 = 0;
                            } else {
                                i41 = unsafe5.getInt(obj3, i24);
                            }
                            i93 = i24;
                            i26 = i41;
                        } else {
                            i26 = i91;
                            i93 = i93;
                        }
                        switch (iZzn) {
                            case 0:
                                i89 = i25;
                                i27 = i21;
                                i16 = 0;
                                zzdtVar2 = zzdtVar3;
                                unsafe = unsafe5;
                                i28 = i90;
                                bArr2 = bArr;
                                i29 = i12;
                                if (i19 == 1) {
                                    zzhj.zzl(obj3, j10, Double.longBitsToDouble(zzdu.zzn(bArr2, i27)));
                                    iZzg = i27 + 8;
                                    i91 = i26 | i22;
                                    i12 = i29;
                                    i87 = i11;
                                    unsafe5 = unsafe;
                                    zzdtVar3 = zzdtVar2;
                                    i88 = i16;
                                    i92 = i92;
                                    bArr6 = bArr2;
                                    i90 = i28;
                                } else {
                                    i13 = i29;
                                    i18 = i27;
                                    i17 = i92;
                                    i91 = i26;
                                    i90 = i28;
                                    i93 = i93;
                                }
                                break;
                            case 1:
                                i89 = i25;
                                i27 = i21;
                                i16 = 0;
                                zzdtVar2 = zzdtVar3;
                                unsafe = unsafe5;
                                i28 = i90;
                                bArr2 = bArr;
                                i29 = i12;
                                if (i19 == 5) {
                                    zzhj.zzm(obj3, j10, Float.intBitsToFloat(zzdu.zzb(bArr2, i27)));
                                    iZzg = i27 + 4;
                                    i91 = i26 | i22;
                                    i12 = i29;
                                    i87 = i11;
                                    unsafe5 = unsafe;
                                    zzdtVar3 = zzdtVar2;
                                    i88 = i16;
                                    i92 = i92;
                                    bArr6 = bArr2;
                                    i90 = i28;
                                } else {
                                    i13 = i29;
                                    i18 = i27;
                                    i17 = i92;
                                    i91 = i26;
                                    i90 = i28;
                                    i93 = i93;
                                }
                                break;
                            case 2:
                            case 3:
                                i30 = i12;
                                i89 = i25;
                                i27 = i21;
                                i16 = 0;
                                zzdtVar2 = zzdtVar3;
                                unsafe = unsafe5;
                                i28 = i90;
                                bArr2 = bArr;
                                if (i19 == 0) {
                                    int iZzk6 = zzdu.zzk(bArr2, i27, zzdtVar2);
                                    unsafe.putLong(obj, j10, zzdtVar2.zzb);
                                    i12 = i30;
                                    iZzg = iZzk6;
                                    i87 = i11;
                                    unsafe5 = unsafe;
                                    zzdtVar3 = zzdtVar2;
                                    i88 = 0;
                                    i92 = i92;
                                    i91 = i26 | i22;
                                    bArr6 = bArr2;
                                    i90 = i28;
                                } else {
                                    i29 = i30;
                                    i13 = i29;
                                    i18 = i27;
                                    i17 = i92;
                                    i91 = i26;
                                    i90 = i28;
                                    i93 = i93;
                                }
                                break;
                            case 4:
                            case 11:
                                i11 = i11;
                                i30 = i12;
                                i89 = i25;
                                i27 = i21;
                                i16 = 0;
                                zzdtVar2 = zzdtVar3;
                                unsafe = unsafe5;
                                i28 = i90;
                                bArr2 = bArr;
                                if (i19 == 0) {
                                    int iZzh19 = zzdu.zzh(bArr2, i27, zzdtVar2);
                                    unsafe.putInt(obj3, j10, zzdtVar2.zza);
                                    i91 = i26 | i22;
                                    iZzg = iZzh19;
                                    i12 = i30;
                                    i87 = i11;
                                    unsafe5 = unsafe;
                                    zzdtVar3 = zzdtVar2;
                                    i88 = i16;
                                    i92 = i92;
                                    bArr6 = bArr2;
                                    i90 = i28;
                                } else {
                                    i29 = i30;
                                    i13 = i29;
                                    i18 = i27;
                                    i17 = i92;
                                    i91 = i26;
                                    i90 = i28;
                                    i93 = i93;
                                }
                                break;
                            case 5:
                            case 14:
                                i89 = i25;
                                i27 = i21;
                                zzdtVar2 = zzdtVar3;
                                unsafe = unsafe5;
                                i28 = i90;
                                bArr2 = bArr;
                                if (i19 == 1) {
                                    unsafe.putLong(obj, j10, zzdu.zzn(bArr2, i27));
                                    int i912 = i27 + 8;
                                    i91 = i26 | i22;
                                    i12 = i12;
                                    i87 = i11;
                                    unsafe5 = unsafe;
                                    zzdtVar3 = zzdtVar2;
                                    i88 = 0;
                                    i92 = i92;
                                    iZzg = i912;
                                    bArr6 = bArr2;
                                    i90 = i28;
                                } else {
                                    i16 = 0;
                                    i29 = i12;
                                    i13 = i29;
                                    i18 = i27;
                                    i17 = i92;
                                    i91 = i26;
                                    i90 = i28;
                                    i93 = i93;
                                }
                                break;
                            case 6:
                            case 13:
                                i11 = i11;
                                i89 = i25;
                                i27 = i21;
                                i31 = 0;
                                zzdtVar2 = zzdtVar3;
                                unsafe = unsafe5;
                                i28 = i90;
                                bArr2 = bArr;
                                if (i19 == 5) {
                                    unsafe.putInt(obj3, j10, zzdu.zzb(bArr2, i27));
                                    iZzg = i27 + 4;
                                    i91 = i26 | i22;
                                    i88 = i31;
                                    i87 = i11;
                                    unsafe5 = unsafe;
                                    zzdtVar3 = zzdtVar2;
                                    i92 = i92;
                                    bArr6 = bArr2;
                                    i90 = i28;
                                } else {
                                    i29 = i12;
                                    i16 = i31;
                                    i13 = i29;
                                    i18 = i27;
                                    i17 = i92;
                                    i91 = i26;
                                    i90 = i28;
                                    i93 = i93;
                                }
                                break;
                            case 7:
                                i89 = i25;
                                i27 = i21;
                                i31 = 0;
                                zzdtVar2 = zzdtVar3;
                                unsafe = unsafe5;
                                i28 = i90;
                                bArr2 = bArr;
                                if (i19 == 0) {
                                    iZzk = zzdu.zzk(bArr2, i27, zzdtVar2);
                                    if (zzdtVar2.zzb != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    zzhj.zzk(obj3, j10, z10);
                                    i91 = i26 | i22;
                                    iZzg = iZzk;
                                    i88 = i31;
                                    i87 = i11;
                                    unsafe5 = unsafe;
                                    zzdtVar3 = zzdtVar2;
                                    i92 = i92;
                                    bArr6 = bArr2;
                                    i90 = i28;
                                } else {
                                    i29 = i12;
                                    i16 = i31;
                                    i13 = i29;
                                    i18 = i27;
                                    i17 = i92;
                                    i91 = i26;
                                    i90 = i28;
                                    i93 = i93;
                                }
                                break;
                            case 8:
                                i89 = i25;
                                i27 = i21;
                                zzdtVar2 = zzdtVar3;
                                unsafe = unsafe5;
                                i28 = i90;
                                bArr2 = bArr;
                                if (i19 == 2) {
                                    if ((i20 & PKIFailureInfo.duplicateCertReq) != 0) {
                                        iZzk = zzdu.zzh(bArr2, i27, zzdtVar2);
                                        i33 = zzdtVar2.zza;
                                        if (i33 >= 0) {
                                            throw zzfb.zzc();
                                        }
                                        if (i33 == 0) {
                                            zzdtVar2.zzc = "";
                                            i31 = 0;
                                        } else {
                                            int i913 = zzhn.zza;
                                            length = bArr2.length;
                                            if ((((length - iZzk) - i33) | iZzk | i33) >= 0) {
                                                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iZzk), Integer.valueOf(i33)));
                                            }
                                            i34 = iZzk + i33;
                                            cArr = new char[i33];
                                            i35 = 0;
                                            while (iZzk < i34) {
                                                b12 = bArr2[iZzk];
                                                if (zzhk.zzd(b12)) {
                                                    iZzk++;
                                                    cArr[i35] = (char) b12;
                                                    i35++;
                                                } else {
                                                    while (iZzk < i34) {
                                                        i36 = iZzk + 1;
                                                        b10 = bArr2[iZzk];
                                                        if (zzhk.zzd(b10)) {
                                                            cArr[i35] = (char) b10;
                                                            i35++;
                                                            iZzk = i36;
                                                            while (iZzk < i34) {
                                                                b11 = bArr2[iZzk];
                                                                if (zzhk.zzd(b11)) {
                                                                }
                                                                iZzk++;
                                                                cArr[i35] = (char) b11;
                                                                i35++;
                                                                break;
                                                            }
                                                        } else if (b10 < -32) {
                                                            if (i36 < i34) {
                                                                throw zzfb.zzb();
                                                            }
                                                            iZzk += 2;
                                                            zzhk.zzc(b10, bArr2[i36], cArr, i35);
                                                            i35++;
                                                        } else if (b10 < -16) {
                                                            if (i36 < i34 - 1) {
                                                                throw zzfb.zzb();
                                                            }
                                                            int i914 = iZzk + 2;
                                                            iZzk += 3;
                                                            zzhk.zzb(b10, bArr2[i36], bArr2[i914], cArr, i35);
                                                            i35++;
                                                        } else {
                                                            if (i36 < i34 - 2) {
                                                                throw zzfb.zzb();
                                                            }
                                                            byte b18 = bArr2[i36];
                                                            int i103 = iZzk + 3;
                                                            byte b19 = bArr2[iZzk + 2];
                                                            iZzk += 4;
                                                            zzhk.zza(b10, b18, b19, bArr2[i103], cArr, i35);
                                                            i35 += 2;
                                                        }
                                                    }
                                                    i31 = 0;
                                                    zzdtVar2.zzc = new String(cArr, 0, i35);
                                                    iZzk = i34;
                                                }
                                            }
                                            while (iZzk < i34) {
                                                i36 = iZzk + 1;
                                                b10 = bArr2[iZzk];
                                                if (zzhk.zzd(b10)) {
                                                    cArr[i35] = (char) b10;
                                                    i35++;
                                                    iZzk = i36;
                                                    while (iZzk < i34) {
                                                        b11 = bArr2[iZzk];
                                                        if (zzhk.zzd(b11)) {
                                                        }
                                                        iZzk++;
                                                        cArr[i35] = (char) b11;
                                                        i35++;
                                                        break;
                                                    }
                                                } else if (b10 < -32) {
                                                    if (i36 < i34) {
                                                        throw zzfb.zzb();
                                                    }
                                                    iZzk += 2;
                                                    zzhk.zzc(b10, bArr2[i36], cArr, i35);
                                                    i35++;
                                                } else if (b10 < -16) {
                                                    if (i36 < i34 - 1) {
                                                        throw zzfb.zzb();
                                                    }
                                                    int i915 = iZzk + 2;
                                                    iZzk += 3;
                                                    zzhk.zzb(b10, bArr2[i36], bArr2[i915], cArr, i35);
                                                    i35++;
                                                } else {
                                                    if (i36 < i34 - 2) {
                                                        throw zzfb.zzb();
                                                    }
                                                    byte b110 = bArr2[i36];
                                                    int i104 = iZzk + 3;
                                                    byte b111 = bArr2[iZzk + 2];
                                                    iZzk += 4;
                                                    zzhk.zza(b10, b110, b111, bArr2[i104], cArr, i35);
                                                    i35 += 2;
                                                }
                                            }
                                            i31 = 0;
                                            zzdtVar2.zzc = new String(cArr, 0, i35);
                                            iZzk = i34;
                                        }
                                    } else {
                                        i31 = 0;
                                        iZzk = zzdu.zzh(bArr2, i27, zzdtVar2);
                                        i32 = zzdtVar2.zza;
                                        if (i32 >= 0) {
                                            throw zzfb.zzc();
                                        }
                                        if (i32 == 0) {
                                            zzdtVar2.zzc = "";
                                        } else {
                                            zzdtVar2.zzc = new String(bArr2, iZzk, i32, zzfa.zzb);
                                            iZzk += i32;
                                        }
                                    }
                                    unsafe.putObject(obj3, j10, zzdtVar2.zzc);
                                    i91 = i26 | i22;
                                    iZzg = iZzk;
                                    i88 = i31;
                                    i87 = i11;
                                    unsafe5 = unsafe;
                                    zzdtVar3 = zzdtVar2;
                                    i92 = i92;
                                    bArr6 = bArr2;
                                    i90 = i28;
                                } else {
                                    i29 = i12;
                                    i16 = 0;
                                    i13 = i29;
                                    i18 = i27;
                                    i17 = i92;
                                    i91 = i26;
                                    i90 = i28;
                                    i93 = i93;
                                }
                                break;
                            case 9:
                                i12 = i12;
                                zzdtVar2 = zzdtVar3;
                                unsafe = unsafe5;
                                i37 = i90;
                                i89 = i25;
                                i27 = i21;
                                bArr2 = bArr;
                                if (i19 == 2) {
                                    Object objZzt3 = this.zzt(obj3, i89);
                                    i28 = i37;
                                    int iZzm4 = zzdu.zzm(objZzt3, this.zzr(i89), bArr, i27, i11, zzdtVar);
                                    this.zzB(obj3, i89, objZzt3);
                                    i91 = i26 | i22;
                                    iZzg = iZzm4;
                                    i12 = i12;
                                    i87 = i11;
                                    unsafe5 = unsafe;
                                    zzdtVar3 = zzdtVar2;
                                    i92 = i92;
                                    i88 = 0;
                                    bArr6 = bArr2;
                                    i90 = i28;
                                } else {
                                    i28 = i37;
                                    i29 = i12;
                                    i16 = 0;
                                    i13 = i29;
                                    i18 = i27;
                                    i17 = i92;
                                    i91 = i26;
                                    i90 = i28;
                                    i93 = i93;
                                }
                                break;
                            case 10:
                                i38 = i11;
                                i12 = i12;
                                i37 = i90;
                                i89 = i25;
                                i27 = i21;
                                bArr2 = bArr;
                                zzdtVar2 = zzdtVar3;
                                unsafe = unsafe5;
                                if (i19 == 2) {
                                    int iZza3 = zzdu.zza(bArr2, i27, zzdtVar2);
                                    unsafe.putObject(obj3, j10, zzdtVar2.zzc);
                                    i91 = i26 | i22;
                                    iZzg = iZza3;
                                    unsafe5 = unsafe;
                                    zzdtVar3 = zzdtVar2;
                                    i88 = 0;
                                    bArr6 = bArr2;
                                    i90 = i37;
                                    i87 = i38;
                                    i93 = i93;
                                } else {
                                    i28 = i37;
                                    i29 = i12;
                                    i16 = 0;
                                    i13 = i29;
                                    i18 = i27;
                                    i17 = i92;
                                    i91 = i26;
                                    i90 = i28;
                                    i93 = i93;
                                }
                                break;
                            case 12:
                                i38 = i11;
                                i12 = i12;
                                i89 = i25;
                                i27 = i21;
                                zzdtVar2 = zzdtVar3;
                                unsafe = unsafe5;
                                i28 = i90;
                                bArr2 = bArr;
                                if (i19 == 0) {
                                    iZzh = zzdu.zzh(bArr2, i27, zzdtVar2);
                                    i39 = zzdtVar2.zza;
                                    zzey zzeyVarZzq4 = this.zzq(i89);
                                    if ((i20 & Integer.MIN_VALUE) != 0) {
                                    }
                                    i37 = i28;
                                    unsafe.putInt(obj3, j10, i39);
                                    i91 = i26 | i22;
                                    iZzg = iZzh;
                                    unsafe5 = unsafe;
                                    zzdtVar3 = zzdtVar2;
                                    i88 = 0;
                                    bArr6 = bArr2;
                                    i90 = i37;
                                    i87 = i38;
                                    i93 = i93;
                                } else {
                                    i29 = i12;
                                    i16 = 0;
                                    i13 = i29;
                                    i18 = i27;
                                    i17 = i92;
                                    i91 = i26;
                                    i90 = i28;
                                    i93 = i93;
                                }
                                break;
                            case 15:
                                i12 = i12;
                                i89 = i25;
                                i27 = i21;
                                zzdtVar2 = zzdtVar3;
                                unsafe = unsafe5;
                                i28 = i90;
                                bArr2 = bArr;
                                if (i19 == 0) {
                                    int iZzh110 = zzdu.zzh(bArr2, i27, zzdtVar2);
                                    unsafe.putInt(obj3, j10, zzej.zzb(zzdtVar2.zza));
                                    i91 = i26 | i22;
                                    iZzg = iZzh110;
                                    i87 = i11;
                                    unsafe5 = unsafe;
                                    zzdtVar3 = zzdtVar2;
                                    i92 = i92;
                                    i88 = 0;
                                    bArr6 = bArr2;
                                    i90 = i28;
                                } else {
                                    i29 = i12;
                                    i16 = 0;
                                    i13 = i29;
                                    i18 = i27;
                                    i17 = i92;
                                    i91 = i26;
                                    i90 = i28;
                                    i93 = i93;
                                }
                                break;
                            case 16:
                                i40 = i90;
                                i27 = i21;
                                bArr2 = bArr;
                                if (i19 == 0) {
                                    int iZzk7 = zzdu.zzk(bArr2, i27, zzdtVar3);
                                    i92 = i92;
                                    i28 = i40;
                                    i89 = i25;
                                    unsafe5.putLong(obj, j10, zzej.zzc(zzdtVar3.zzb));
                                    i91 = i26 | i22;
                                    i87 = i11;
                                    i12 = i12;
                                    unsafe5 = unsafe5;
                                    zzdtVar3 = zzdtVar3;
                                    iZzg = iZzk7;
                                    i92 = i92;
                                    i88 = 0;
                                    bArr6 = bArr2;
                                    i90 = i28;
                                } else {
                                    zzdtVar2 = zzdtVar3;
                                    i89 = i25;
                                    i92 = i92;
                                    unsafe = unsafe5;
                                    i29 = i12;
                                    i28 = i40;
                                    i16 = 0;
                                    i13 = i29;
                                    i18 = i27;
                                    i17 = i92;
                                    i91 = i26;
                                    i90 = i28;
                                    i93 = i93;
                                }
                                break;
                            default:
                                if (i19 == 3) {
                                    Object objZzt4 = this.zzt(obj3, i25);
                                    iZzg = zzdu.zzl(objZzt4, this.zzr(i25), bArr, i21, i11, (i92 << 3) | 4, zzdtVar);
                                    this.zzB(obj3, i25, objZzt4);
                                    i91 = i26 | i22;
                                    bArr6 = bArr;
                                    i90 = i90;
                                    i89 = i25;
                                    i92 = i92;
                                    i93 = i93;
                                    i88 = 0;
                                    i87 = i11;
                                } else {
                                    i27 = i21;
                                    zzdtVar2 = zzdtVar3;
                                    unsafe = unsafe5;
                                    i28 = i90;
                                    i89 = i25;
                                    i16 = 0;
                                    bArr2 = bArr;
                                    i29 = i12;
                                    i13 = i29;
                                    i18 = i27;
                                    i17 = i92;
                                    i91 = i26;
                                    i90 = i28;
                                    i93 = i93;
                                }
                                break;
                        }
                    } else {
                        i16 = 0;
                        i42 = i90;
                        zzdtVar2 = zzdtVar3;
                        unsafe = unsafe5;
                        if (iZzn == 27) {
                            i89 = i15;
                            i93 = i93;
                            unsafe = unsafe;
                            bArr4 = bArr;
                            i47 = i21;
                            i43 = i91;
                            i90 = i42;
                            if (iZzn <= 49) {
                                j11 = i20;
                                unsafe2 = zzb;
                                i48 = i92;
                                zzezVar = (zzez) unsafe2.getObject(obj3, j10);
                                if (zzezVar.zzc()) {
                                    int size4 = zzezVar.size();
                                    zzez zzezVarZzd3 = zzezVar.zzd(size4 != 0 ? size4 + size4 : 10);
                                    unsafe2.putObject(obj3, j10, zzezVarZzd3);
                                    zzezVar = zzezVarZzd3;
                                }
                                switch (iZzn) {
                                    case 18:
                                    case 35:
                                        i89 = i89;
                                        i47 = i47;
                                        i90 = i90;
                                        bArr4 = bArr4;
                                        unsafe = unsafe;
                                        i92 = i48;
                                        i49 = i11;
                                        if (i19 == 2) {
                                            zzekVar2 = (zzek) zzezVar;
                                            iZzh2 = zzdu.zzh(bArr4, i47, zzdtVar2);
                                            i50 = zzdtVar2.zza + iZzh2;
                                            while (iZzh2 < i50) {
                                                zzekVar2.zze(Double.longBitsToDouble(zzdu.zzn(bArr4, iZzh2)));
                                                iZzh2 += 8;
                                            }
                                            if (iZzh2 != i50) {
                                                throw zzfb.zzf();
                                            }
                                        } else if (i19 == 1) {
                                            zzekVar = (zzek) zzezVar;
                                            zzekVar.zze(Double.longBitsToDouble(zzdu.zzn(bArr4, i47)));
                                            iZzh2 = i47 + 8;
                                            while (iZzh2 < i49) {
                                                iZzh3 = zzdu.zzh(bArr4, iZzh2, zzdtVar2);
                                                if (i90 == zzdtVar2.zza) {
                                                    zzekVar.zze(Double.longBitsToDouble(zzdu.zzn(bArr4, iZzh3)));
                                                    iZzh2 = iZzh3 + 8;
                                                }
                                            }
                                        } else {
                                            iZzh2 = i47;
                                        }
                                        if (iZzh2 != i47) {
                                            i12 = i12;
                                            iZzg = iZzh2;
                                            i87 = i49;
                                            unsafe5 = unsafe;
                                            zzdtVar3 = zzdtVar2;
                                            i88 = 0;
                                            i91 = i43;
                                            i93 = i93;
                                            bArr6 = bArr4;
                                            obj3 = obj;
                                        } else {
                                            i13 = i12;
                                            i18 = iZzh2;
                                            i17 = i92;
                                            i91 = i43;
                                            i93 = i93;
                                            obj3 = obj;
                                        }
                                        break;
                                    case 19:
                                    case 36:
                                        i89 = i89;
                                        i47 = i47;
                                        i90 = i90;
                                        bArr4 = bArr4;
                                        unsafe = unsafe;
                                        i92 = i48;
                                        i49 = i11;
                                        if (i19 == 2) {
                                            zzerVar2 = (zzer) zzezVar;
                                            iZzh2 = zzdu.zzh(bArr4, i47, zzdtVar2);
                                            i51 = zzdtVar2.zza + iZzh2;
                                            while (iZzh2 < i51) {
                                                zzerVar2.zze(Float.intBitsToFloat(zzdu.zzb(bArr4, iZzh2)));
                                                iZzh2 += 4;
                                            }
                                            if (iZzh2 != i51) {
                                                throw zzfb.zzf();
                                            }
                                        } else if (i19 == 5) {
                                            zzerVar = (zzer) zzezVar;
                                            zzerVar.zze(Float.intBitsToFloat(zzdu.zzb(bArr4, i47)));
                                            iZzh2 = i47 + 4;
                                            while (iZzh2 < i49) {
                                                iZzh4 = zzdu.zzh(bArr4, iZzh2, zzdtVar2);
                                                if (i90 == zzdtVar2.zza) {
                                                    zzerVar.zze(Float.intBitsToFloat(zzdu.zzb(bArr4, iZzh4)));
                                                    iZzh2 = iZzh4 + 4;
                                                }
                                            }
                                        } else {
                                            iZzh2 = i47;
                                        }
                                        if (iZzh2 != i47) {
                                            i12 = i12;
                                            iZzg = iZzh2;
                                            i87 = i49;
                                            unsafe5 = unsafe;
                                            zzdtVar3 = zzdtVar2;
                                            i88 = 0;
                                            i91 = i43;
                                            i93 = i93;
                                            bArr6 = bArr4;
                                            obj3 = obj;
                                        } else {
                                            i13 = i12;
                                            i18 = iZzh2;
                                            i17 = i92;
                                            i91 = i43;
                                            i93 = i93;
                                            obj3 = obj;
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        i89 = i89;
                                        i47 = i47;
                                        i90 = i90;
                                        bArr4 = bArr4;
                                        unsafe = unsafe;
                                        i92 = i48;
                                        i49 = i11;
                                        if (i19 == 2) {
                                            zzfmVar2 = (zzfm) zzezVar;
                                            iZzh2 = zzdu.zzh(bArr4, i47, zzdtVar2);
                                            i52 = zzdtVar2.zza + iZzh2;
                                            while (iZzh2 < i52) {
                                                iZzh2 = zzdu.zzk(bArr4, iZzh2, zzdtVar2);
                                                zzfmVar2.zze(zzdtVar2.zzb);
                                            }
                                            if (iZzh2 != i52) {
                                                throw zzfb.zzf();
                                            }
                                        } else if (i19 == 0) {
                                            zzfmVar = (zzfm) zzezVar;
                                            iZzh2 = zzdu.zzk(bArr4, i47, zzdtVar2);
                                            zzfmVar.zze(zzdtVar2.zzb);
                                            while (iZzh2 < i49) {
                                                iZzh5 = zzdu.zzh(bArr4, iZzh2, zzdtVar2);
                                                if (i90 == zzdtVar2.zza) {
                                                    iZzh2 = zzdu.zzk(bArr4, iZzh5, zzdtVar2);
                                                    zzfmVar.zze(zzdtVar2.zzb);
                                                }
                                            }
                                        } else {
                                            iZzh2 = i47;
                                        }
                                        if (iZzh2 != i47) {
                                            i12 = i12;
                                            iZzg = iZzh2;
                                            i87 = i49;
                                            unsafe5 = unsafe;
                                            zzdtVar3 = zzdtVar2;
                                            i88 = 0;
                                            i91 = i43;
                                            i93 = i93;
                                            bArr6 = bArr4;
                                            obj3 = obj;
                                        } else {
                                            i13 = i12;
                                            i18 = iZzh2;
                                            i17 = i92;
                                            i91 = i43;
                                            i93 = i93;
                                            obj3 = obj;
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        i53 = i11;
                                        i54 = i89;
                                        i55 = i47;
                                        i56 = i90;
                                        bArr4 = bArr4;
                                        unsafe = unsafe;
                                        i57 = i48;
                                        if (i19 == 2) {
                                            iZzf = zzdu.zzf(bArr4, i55, zzezVar, zzdtVar2);
                                            i49 = i53;
                                            iZzh2 = iZzf;
                                            i90 = i56;
                                            i47 = i55;
                                            i92 = i57;
                                            i89 = i54;
                                        } else if (i19 == 0) {
                                            i49 = i53;
                                            i90 = i56;
                                            i47 = i55;
                                            i92 = i57;
                                            i89 = i54;
                                            iZzh2 = zzdu.zzj(i56, bArr, i55, i11, zzezVar, zzdtVar);
                                        } else {
                                            i49 = i53;
                                            i90 = i56;
                                            i47 = i55;
                                            i92 = i57;
                                            i89 = i54;
                                            iZzh2 = i47;
                                        }
                                        if (iZzh2 != i47) {
                                            i12 = i12;
                                            iZzg = iZzh2;
                                            i87 = i49;
                                            unsafe5 = unsafe;
                                            zzdtVar3 = zzdtVar2;
                                            i88 = 0;
                                            i91 = i43;
                                            i93 = i93;
                                            bArr6 = bArr4;
                                            obj3 = obj;
                                        } else {
                                            i13 = i12;
                                            i18 = iZzh2;
                                            i17 = i92;
                                            i91 = i43;
                                            i93 = i93;
                                            obj3 = obj;
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        i53 = i11;
                                        i54 = i89;
                                        i55 = i47;
                                        i56 = i90;
                                        bArr4 = bArr4;
                                        unsafe = unsafe;
                                        i57 = i48;
                                        if (i19 == 2) {
                                            if (i19 == 1) {
                                                zzfmVar3 = (zzfm) zzezVar;
                                                zzfmVar3.zze(zzdu.zzn(bArr4, i55));
                                                iZze = i55 + 8;
                                                while (iZze < i53) {
                                                    iZzh6 = zzdu.zzh(bArr4, iZze, zzdtVar2);
                                                    if (i56 == zzdtVar2.zza) {
                                                        i49 = i53;
                                                        i90 = i56;
                                                        i92 = i57;
                                                        i89 = i54;
                                                        iZzh2 = iZze;
                                                        i47 = i55;
                                                        if (iZzh2 != i47) {
                                                            i12 = i12;
                                                            iZzg = iZzh2;
                                                            i87 = i49;
                                                            unsafe5 = unsafe;
                                                            zzdtVar3 = zzdtVar2;
                                                            i88 = 0;
                                                            i91 = i43;
                                                            i93 = i93;
                                                            bArr6 = bArr4;
                                                            obj3 = obj;
                                                        } else {
                                                            i13 = i12;
                                                            i18 = iZzh2;
                                                            i17 = i92;
                                                            i91 = i43;
                                                            i93 = i93;
                                                            obj3 = obj;
                                                        }
                                                    } else {
                                                        zzfmVar3.zze(zzdu.zzn(bArr4, iZzh6));
                                                        iZze = iZzh6 + 8;
                                                    }
                                                    break;
                                                }
                                                i49 = i53;
                                                i90 = i56;
                                                i92 = i57;
                                                i89 = i54;
                                                iZzh2 = iZze;
                                                i47 = i55;
                                                if (iZzh2 != i47) {
                                                    i12 = i12;
                                                    iZzg = iZzh2;
                                                    i87 = i49;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    bArr6 = bArr4;
                                                    obj3 = obj;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzh2;
                                                    i17 = i92;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    obj3 = obj;
                                                }
                                            }
                                            i49 = i53;
                                            i90 = i56;
                                            i47 = i55;
                                            i92 = i57;
                                            i89 = i54;
                                            iZzh2 = i47;
                                            if (iZzh2 != i47) {
                                                i12 = i12;
                                                iZzg = iZzh2;
                                                i87 = i49;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i91 = i43;
                                                i93 = i93;
                                                bArr6 = bArr4;
                                                obj3 = obj;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzh2;
                                                i17 = i92;
                                                i91 = i43;
                                                i93 = i93;
                                                obj3 = obj;
                                            }
                                            break;
                                        } else {
                                            zzfmVar4 = (zzfm) zzezVar;
                                            iZzf = zzdu.zzh(bArr4, i55, zzdtVar2);
                                            i58 = zzdtVar2.zza + iZzf;
                                            while (iZzf < i58) {
                                                zzfmVar4.zze(zzdu.zzn(bArr4, iZzf));
                                                iZzf += 8;
                                            }
                                            if (iZzf != i58) {
                                                throw zzfb.zzf();
                                            }
                                            i49 = i53;
                                            iZzh2 = iZzf;
                                            i90 = i56;
                                            i47 = i55;
                                            i92 = i57;
                                            i89 = i54;
                                            if (iZzh2 != i47) {
                                                i12 = i12;
                                                iZzg = iZzh2;
                                                i87 = i49;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i91 = i43;
                                                i93 = i93;
                                                bArr6 = bArr4;
                                                obj3 = obj;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzh2;
                                                i17 = i92;
                                                i91 = i43;
                                                i93 = i93;
                                                obj3 = obj;
                                            }
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        i53 = i11;
                                        i54 = i89;
                                        i55 = i47;
                                        i56 = i90;
                                        bArr4 = bArr4;
                                        unsafe = unsafe;
                                        i57 = i48;
                                        if (i19 == 2) {
                                            if (i19 == 5) {
                                                zzewVar = (zzew) zzezVar;
                                                zzewVar.zze(zzdu.zzb(bArr4, i55));
                                                iZze = i55 + 4;
                                                while (iZze < i53) {
                                                    iZzh7 = zzdu.zzh(bArr4, iZze, zzdtVar2);
                                                    if (i56 == zzdtVar2.zza) {
                                                        i49 = i53;
                                                        i90 = i56;
                                                        i92 = i57;
                                                        i89 = i54;
                                                        iZzh2 = iZze;
                                                        i47 = i55;
                                                        if (iZzh2 != i47) {
                                                            i12 = i12;
                                                            iZzg = iZzh2;
                                                            i87 = i49;
                                                            unsafe5 = unsafe;
                                                            zzdtVar3 = zzdtVar2;
                                                            i88 = 0;
                                                            i91 = i43;
                                                            i93 = i93;
                                                            bArr6 = bArr4;
                                                            obj3 = obj;
                                                        } else {
                                                            i13 = i12;
                                                            i18 = iZzh2;
                                                            i17 = i92;
                                                            i91 = i43;
                                                            i93 = i93;
                                                            obj3 = obj;
                                                        }
                                                    } else {
                                                        zzewVar.zze(zzdu.zzb(bArr4, iZzh7));
                                                        iZze = iZzh7 + 4;
                                                    }
                                                    break;
                                                }
                                                i49 = i53;
                                                i90 = i56;
                                                i92 = i57;
                                                i89 = i54;
                                                iZzh2 = iZze;
                                                i47 = i55;
                                                if (iZzh2 != i47) {
                                                    i12 = i12;
                                                    iZzg = iZzh2;
                                                    i87 = i49;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    bArr6 = bArr4;
                                                    obj3 = obj;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzh2;
                                                    i17 = i92;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    obj3 = obj;
                                                }
                                            }
                                            i49 = i53;
                                            i90 = i56;
                                            i47 = i55;
                                            i92 = i57;
                                            i89 = i54;
                                            iZzh2 = i47;
                                            if (iZzh2 != i47) {
                                                i12 = i12;
                                                iZzg = iZzh2;
                                                i87 = i49;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i91 = i43;
                                                i93 = i93;
                                                bArr6 = bArr4;
                                                obj3 = obj;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzh2;
                                                i17 = i92;
                                                i91 = i43;
                                                i93 = i93;
                                                obj3 = obj;
                                            }
                                            break;
                                        } else {
                                            zzewVar2 = (zzew) zzezVar;
                                            iZzf = zzdu.zzh(bArr4, i55, zzdtVar2);
                                            i59 = zzdtVar2.zza + iZzf;
                                            while (iZzf < i59) {
                                                zzewVar2.zze(zzdu.zzb(bArr4, iZzf));
                                                iZzf += 4;
                                            }
                                            if (iZzf != i59) {
                                                throw zzfb.zzf();
                                            }
                                            i49 = i53;
                                            iZzh2 = iZzf;
                                            i90 = i56;
                                            i47 = i55;
                                            i92 = i57;
                                            i89 = i54;
                                            if (iZzh2 != i47) {
                                                i12 = i12;
                                                iZzg = iZzh2;
                                                i87 = i49;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i91 = i43;
                                                i93 = i93;
                                                bArr6 = bArr4;
                                                obj3 = obj;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzh2;
                                                i17 = i92;
                                                i91 = i43;
                                                i93 = i93;
                                                obj3 = obj;
                                            }
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        i53 = i11;
                                        i54 = i89;
                                        i55 = i47;
                                        i56 = i90;
                                        bArr4 = bArr4;
                                        unsafe = unsafe;
                                        i57 = i48;
                                        if (i19 == 2) {
                                            if (i19 == 0) {
                                                zzdvVar = (zzdv) zzezVar;
                                                iZzf = zzdu.zzk(bArr4, i55, zzdtVar2);
                                                if (zzdtVar2.zzb != 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                zzdvVar.zze(z11);
                                                while (iZzf < i53) {
                                                    iZzh8 = zzdu.zzh(bArr4, iZzf, zzdtVar2);
                                                    if (i56 == zzdtVar2.zza) {
                                                        iZzf = zzdu.zzk(bArr4, iZzh8, zzdtVar2);
                                                        if (zzdtVar2.zzb != 0) {
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                        zzdvVar.zze(z12);
                                                    }
                                                }
                                            }
                                            i49 = i53;
                                            i90 = i56;
                                            i47 = i55;
                                            i92 = i57;
                                            i89 = i54;
                                            iZzh2 = i47;
                                            if (iZzh2 != i47) {
                                                i12 = i12;
                                                iZzg = iZzh2;
                                                i87 = i49;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i91 = i43;
                                                i93 = i93;
                                                bArr6 = bArr4;
                                                obj3 = obj;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzh2;
                                                i17 = i92;
                                                i91 = i43;
                                                i93 = i93;
                                                obj3 = obj;
                                            }
                                        } else {
                                            zzdvVar2 = (zzdv) zzezVar;
                                            iZzf = zzdu.zzh(bArr4, i55, zzdtVar2);
                                            i60 = zzdtVar2.zza + iZzf;
                                            while (iZzf < i60) {
                                                iZzf = zzdu.zzk(bArr4, iZzf, zzdtVar2);
                                                if (zzdtVar2.zzb != 0) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                                zzdvVar2.zze(z13);
                                            }
                                            if (iZzf != i60) {
                                                throw zzfb.zzf();
                                            }
                                        }
                                        i49 = i53;
                                        iZzh2 = iZzf;
                                        i90 = i56;
                                        i47 = i55;
                                        i92 = i57;
                                        i89 = i54;
                                        if (iZzh2 != i47) {
                                            i12 = i12;
                                            iZzg = iZzh2;
                                            i87 = i49;
                                            unsafe5 = unsafe;
                                            zzdtVar3 = zzdtVar2;
                                            i88 = 0;
                                            i91 = i43;
                                            i93 = i93;
                                            bArr6 = bArr4;
                                            obj3 = obj;
                                        } else {
                                            i13 = i12;
                                            i18 = iZzh2;
                                            i17 = i92;
                                            i91 = i43;
                                            i93 = i93;
                                            obj3 = obj;
                                        }
                                        break;
                                    case 26:
                                        i53 = i11;
                                        i54 = i89;
                                        i55 = i47;
                                        i56 = i90;
                                        bArr4 = bArr4;
                                        unsafe = unsafe;
                                        i57 = i48;
                                        if (i19 == 2) {
                                            if ((j11 & SvgConstantsKt.SPECIFIED_CLIP_RULE) == 0) {
                                                iZzf = zzdu.zzh(bArr4, i55, zzdtVar2);
                                                i65 = zzdtVar2.zza;
                                                if (i65 >= 0) {
                                                    throw zzfb.zzc();
                                                }
                                                if (i65 == 0) {
                                                    obj2 = r6;
                                                    zzezVar.add(obj2);
                                                } else {
                                                    obj2 = r6;
                                                    zzezVar.add(new String(bArr4, iZzf, i65, zzfa.zzb));
                                                    iZzf += i65;
                                                }
                                                while (iZzf < i53) {
                                                    iZzh10 = zzdu.zzh(bArr4, iZzf, zzdtVar2);
                                                    if (i56 == zzdtVar2.zza) {
                                                        iZzf = zzdu.zzh(bArr4, iZzh10, zzdtVar2);
                                                        i66 = zzdtVar2.zza;
                                                        if (i66 >= 0) {
                                                            throw zzfb.zzc();
                                                        }
                                                        if (i66 == 0) {
                                                            zzezVar.add(obj2);
                                                        } else {
                                                            zzezVar.add(new String(bArr4, iZzf, i66, zzfa.zzb));
                                                            iZzf += i66;
                                                        }
                                                    }
                                                }
                                            } else {
                                                iZzf = zzdu.zzh(bArr4, i55, zzdtVar2);
                                                i61 = zzdtVar2.zza;
                                                if (i61 >= 0) {
                                                    throw zzfb.zzc();
                                                }
                                                if (i61 == 0) {
                                                    zzezVar.add("");
                                                } else {
                                                    i62 = iZzf + i61;
                                                    if (zzhn.zzc(bArr4, iZzf, i62)) {
                                                        throw zzfb.zzb();
                                                    }
                                                    zzezVar.add(new String(bArr4, iZzf, i61, zzfa.zzb));
                                                    iZzf = i62;
                                                }
                                                while (iZzf < i53) {
                                                    iZzh9 = zzdu.zzh(bArr4, iZzf, zzdtVar2);
                                                    if (i56 == zzdtVar2.zza) {
                                                        iZzf = zzdu.zzh(bArr4, iZzh9, zzdtVar2);
                                                        i63 = zzdtVar2.zza;
                                                        if (i63 >= 0) {
                                                            throw zzfb.zzc();
                                                        }
                                                        if (i63 == 0) {
                                                            zzezVar.add("");
                                                        } else {
                                                            i64 = iZzf + i63;
                                                            if (zzhn.zzc(bArr4, iZzf, i64)) {
                                                                throw zzfb.zzb();
                                                            }
                                                            zzezVar.add(new String(bArr4, iZzf, i63, zzfa.zzb));
                                                            iZzf = i64;
                                                        }
                                                    }
                                                }
                                            }
                                            i49 = i53;
                                            iZzh2 = iZzf;
                                            i90 = i56;
                                            i47 = i55;
                                            i92 = i57;
                                            i89 = i54;
                                            if (iZzh2 != i47) {
                                                i12 = i12;
                                                iZzg = iZzh2;
                                                i87 = i49;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i91 = i43;
                                                i93 = i93;
                                                bArr6 = bArr4;
                                                obj3 = obj;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzh2;
                                                i17 = i92;
                                                i91 = i43;
                                                i93 = i93;
                                                obj3 = obj;
                                            }
                                        }
                                        i49 = i53;
                                        i90 = i56;
                                        i47 = i55;
                                        i92 = i57;
                                        i89 = i54;
                                        iZzh2 = i47;
                                        if (iZzh2 != i47) {
                                            i12 = i12;
                                            iZzg = iZzh2;
                                            i87 = i49;
                                            unsafe5 = unsafe;
                                            zzdtVar3 = zzdtVar2;
                                            i88 = 0;
                                            i91 = i43;
                                            i93 = i93;
                                            bArr6 = bArr4;
                                            obj3 = obj;
                                        } else {
                                            i13 = i12;
                                            i18 = iZzh2;
                                            i17 = i92;
                                            i91 = i43;
                                            i93 = i93;
                                            obj3 = obj;
                                        }
                                        break;
                                    case 27:
                                        i67 = i11;
                                        if (i19 == 2) {
                                            this = this;
                                            i54 = i89;
                                            i57 = i48;
                                            i55 = i47;
                                            i56 = i90;
                                            bArr4 = bArr4;
                                            iZze = zzdu.zze(this.zzr(i89), i90, bArr, i47, i11, zzezVar, zzdtVar);
                                            i49 = i67;
                                            unsafe = unsafe;
                                            i90 = i56;
                                            i92 = i57;
                                            i89 = i54;
                                            iZzh2 = iZze;
                                            i47 = i55;
                                            if (iZzh2 != i47) {
                                                i12 = i12;
                                                iZzg = iZzh2;
                                                i87 = i49;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i91 = i43;
                                                i93 = i93;
                                                bArr6 = bArr4;
                                                obj3 = obj;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzh2;
                                                i17 = i92;
                                                i91 = i43;
                                                i93 = i93;
                                                obj3 = obj;
                                            }
                                        } else {
                                            i92 = i48;
                                            i49 = i67;
                                            iZzh2 = i47;
                                            if (iZzh2 != i47) {
                                                i12 = i12;
                                                iZzg = iZzh2;
                                                i87 = i49;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i91 = i43;
                                                i93 = i93;
                                                bArr6 = bArr4;
                                                obj3 = obj;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzh2;
                                                i17 = i92;
                                                i91 = i43;
                                                i93 = i93;
                                                obj3 = obj;
                                            }
                                        }
                                        break;
                                    case 28:
                                        i67 = i11;
                                        if (i19 == 2) {
                                            iZzh11 = zzdu.zzh(bArr4, i47, zzdtVar2);
                                            i68 = zzdtVar2.zza;
                                            if (i68 >= 0) {
                                                throw zzfb.zzc();
                                            }
                                            if (i68 <= bArr4.length - iZzh11) {
                                                throw zzfb.zzf();
                                            }
                                            if (i68 == 0) {
                                                zzezVar.add(zzef.zzb);
                                            } else {
                                                zzezVar.add(zzef.zzk(bArr4, iZzh11, i68));
                                                iZzh11 += i68;
                                            }
                                            while (iZzh11 < i67) {
                                                iZzh12 = zzdu.zzh(bArr4, iZzh11, zzdtVar2);
                                                if (i90 == zzdtVar2.zza) {
                                                    iZzh11 = zzdu.zzh(bArr4, iZzh12, zzdtVar2);
                                                    i69 = zzdtVar2.zza;
                                                    if (i69 >= 0) {
                                                        throw zzfb.zzc();
                                                    }
                                                    if (i69 <= bArr4.length - iZzh11) {
                                                        throw zzfb.zzf();
                                                    }
                                                    if (i69 == 0) {
                                                        zzezVar.add(zzef.zzb);
                                                    } else {
                                                        zzezVar.add(zzef.zzk(bArr4, iZzh11, i69));
                                                        iZzh11 += i69;
                                                    }
                                                } else {
                                                    i92 = i48;
                                                    i89 = i89;
                                                    i47 = i47;
                                                    i90 = i90;
                                                    bArr4 = bArr4;
                                                    unsafe = unsafe;
                                                    this = this;
                                                    i49 = i67;
                                                    iZzh2 = iZzh11;
                                                }
                                            }
                                            i92 = i48;
                                            i89 = i89;
                                            i47 = i47;
                                            i90 = i90;
                                            bArr4 = bArr4;
                                            unsafe = unsafe;
                                            this = this;
                                            i49 = i67;
                                            iZzh2 = iZzh11;
                                        } else {
                                            i92 = i48;
                                            i49 = i67;
                                            iZzh2 = i47;
                                        }
                                        if (iZzh2 != i47) {
                                            i12 = i12;
                                            iZzg = iZzh2;
                                            i87 = i49;
                                            unsafe5 = unsafe;
                                            zzdtVar3 = zzdtVar2;
                                            i88 = 0;
                                            i91 = i43;
                                            i93 = i93;
                                            bArr6 = bArr4;
                                            obj3 = obj;
                                        } else {
                                            i13 = i12;
                                            i18 = iZzh2;
                                            i17 = i92;
                                            i91 = i43;
                                            i93 = i93;
                                            obj3 = obj;
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        i70 = i11;
                                        if (i19 == 2) {
                                            iZzj = zzdu.zzf(bArr4, i47, zzezVar, zzdtVar2);
                                        } else if (i19 == 0) {
                                            i67 = i70;
                                            i92 = i48;
                                            i49 = i67;
                                            iZzh2 = i47;
                                            if (iZzh2 != i47) {
                                                i12 = i12;
                                                iZzg = iZzh2;
                                                i87 = i49;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i91 = i43;
                                                i93 = i93;
                                                bArr6 = bArr4;
                                                obj3 = obj;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzh2;
                                                i17 = i92;
                                                i91 = i43;
                                                i93 = i93;
                                                obj3 = obj;
                                            }
                                        } else {
                                            iZzj = zzdu.zzj(i90, bArr, i47, i11, zzezVar, zzdtVar);
                                        }
                                        zzeyVarZzq = this.zzq(i89);
                                        zzgzVar = this.zzl;
                                        int i105 = zzgk.zza;
                                        if (zzeyVarZzq != null) {
                                            i71 = iZzj;
                                            i72 = i70;
                                            i73 = i48;
                                        } else if (zzezVar instanceof RandomAccess) {
                                            size = zzezVar.size();
                                            objZzc2 = null;
                                            i74 = 0;
                                            i75 = 0;
                                            while (i74 < size) {
                                                iIntValue2 = ((Integer) zzezVar.get(i74)).intValue();
                                                if (zzeyVarZzq.zza()) {
                                                    if (i74 != i75) {
                                                        zzezVar.set(i75, Integer.valueOf(iIntValue2));
                                                    }
                                                    i75++;
                                                    i76 = i48;
                                                } else {
                                                    i76 = i48;
                                                    objZzc2 = zzgk.zzc(obj, i76, iIntValue2, objZzc2, zzgzVar);
                                                }
                                                i74++;
                                                i48 = i76;
                                                i70 = i70;
                                                iZzj = iZzj;
                                            }
                                            i71 = iZzj;
                                            i72 = i70;
                                            i73 = i48;
                                            if (i75 != size) {
                                                zzezVar.subList(i75, size).clear();
                                            }
                                        } else {
                                            i71 = iZzj;
                                            i72 = i70;
                                            i73 = i48;
                                            it = zzezVar.iterator();
                                            objZzc = null;
                                            while (it.hasNext()) {
                                                iIntValue = ((Integer) it.next()).intValue();
                                                if (!zzeyVarZzq.zza()) {
                                                    objZzc = zzgk.zzc(obj, i73, iIntValue, objZzc, zzgzVar);
                                                    it.remove();
                                                }
                                            }
                                        }
                                        i92 = i73;
                                        i89 = i89;
                                        i47 = i47;
                                        i90 = i90;
                                        bArr4 = bArr4;
                                        unsafe = unsafe;
                                        this = this;
                                        i49 = i72;
                                        iZzh2 = i71;
                                        if (iZzh2 != i47) {
                                            i12 = i12;
                                            iZzg = iZzh2;
                                            i87 = i49;
                                            unsafe5 = unsafe;
                                            zzdtVar3 = zzdtVar2;
                                            i88 = 0;
                                            i91 = i43;
                                            i93 = i93;
                                            bArr6 = bArr4;
                                            obj3 = obj;
                                        } else {
                                            i13 = i12;
                                            i18 = iZzh2;
                                            i17 = i92;
                                            i91 = i43;
                                            i93 = i93;
                                            obj3 = obj;
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        i77 = i11;
                                        if (i19 == 2) {
                                            if (i19 == 0) {
                                                zzewVar3 = (zzew) zzezVar;
                                                iZzh2 = zzdu.zzh(bArr4, i47, zzdtVar2);
                                                zzewVar3.zze(zzej.zzb(zzdtVar2.zza));
                                                while (iZzh2 < i77) {
                                                    iZzh13 = zzdu.zzh(bArr4, iZzh2, zzdtVar2);
                                                    if (i90 == zzdtVar2.zza) {
                                                        iZzh2 = zzdu.zzh(bArr4, iZzh13, zzdtVar2);
                                                        zzewVar3.zze(zzej.zzb(zzdtVar2.zza));
                                                    }
                                                }
                                            }
                                            i89 = i89;
                                            i47 = i47;
                                            i90 = i90;
                                            i92 = i48;
                                            i49 = i77;
                                            bArr4 = bArr4;
                                            unsafe = unsafe;
                                            iZzh2 = i47;
                                            if (iZzh2 != i47) {
                                                i12 = i12;
                                                iZzg = iZzh2;
                                                i87 = i49;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i91 = i43;
                                                i93 = i93;
                                                bArr6 = bArr4;
                                                obj3 = obj;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzh2;
                                                i17 = i92;
                                                i91 = i43;
                                                i93 = i93;
                                                obj3 = obj;
                                            }
                                        } else {
                                            zzewVar4 = (zzew) zzezVar;
                                            iZzh2 = zzdu.zzh(bArr4, i47, zzdtVar2);
                                            i78 = zzdtVar2.zza + iZzh2;
                                            while (iZzh2 < i78) {
                                                iZzh2 = zzdu.zzh(bArr4, iZzh2, zzdtVar2);
                                                zzewVar4.zze(zzej.zzb(zzdtVar2.zza));
                                            }
                                            if (iZzh2 != i78) {
                                                throw zzfb.zzf();
                                            }
                                        }
                                        i89 = i89;
                                        i47 = i47;
                                        i90 = i90;
                                        i92 = i48;
                                        i49 = i77;
                                        bArr4 = bArr4;
                                        unsafe = unsafe;
                                        if (iZzh2 != i47) {
                                            i12 = i12;
                                            iZzg = iZzh2;
                                            i87 = i49;
                                            unsafe5 = unsafe;
                                            zzdtVar3 = zzdtVar2;
                                            i88 = 0;
                                            i91 = i43;
                                            i93 = i93;
                                            bArr6 = bArr4;
                                            obj3 = obj;
                                        } else {
                                            i13 = i12;
                                            i18 = iZzh2;
                                            i17 = i92;
                                            i91 = i43;
                                            i93 = i93;
                                            obj3 = obj;
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        i77 = i11;
                                        if (i19 == 2) {
                                            if (i19 == 0) {
                                                zzfmVar5 = (zzfm) zzezVar;
                                                iZzh2 = zzdu.zzk(bArr4, i47, zzdtVar2);
                                                zzfmVar5.zze(zzej.zzc(zzdtVar2.zzb));
                                                while (iZzh2 < i77) {
                                                    iZzh14 = zzdu.zzh(bArr4, iZzh2, zzdtVar2);
                                                    if (i90 == zzdtVar2.zza) {
                                                        iZzh2 = zzdu.zzk(bArr4, iZzh14, zzdtVar2);
                                                        zzfmVar5.zze(zzej.zzc(zzdtVar2.zzb));
                                                    }
                                                }
                                            }
                                            i89 = i89;
                                            i47 = i47;
                                            i90 = i90;
                                            i92 = i48;
                                            i49 = i77;
                                            bArr4 = bArr4;
                                            unsafe = unsafe;
                                            iZzh2 = i47;
                                            if (iZzh2 != i47) {
                                                i12 = i12;
                                                iZzg = iZzh2;
                                                i87 = i49;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i91 = i43;
                                                i93 = i93;
                                                bArr6 = bArr4;
                                                obj3 = obj;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzh2;
                                                i17 = i92;
                                                i91 = i43;
                                                i93 = i93;
                                                obj3 = obj;
                                            }
                                        } else {
                                            zzfmVar6 = (zzfm) zzezVar;
                                            iZzh2 = zzdu.zzh(bArr4, i47, zzdtVar2);
                                            i79 = zzdtVar2.zza + iZzh2;
                                            while (iZzh2 < i79) {
                                                iZzh2 = zzdu.zzk(bArr4, iZzh2, zzdtVar2);
                                                zzfmVar6.zze(zzej.zzc(zzdtVar2.zzb));
                                            }
                                            if (iZzh2 != i79) {
                                                throw zzfb.zzf();
                                            }
                                        }
                                        i89 = i89;
                                        i47 = i47;
                                        i90 = i90;
                                        i92 = i48;
                                        i49 = i77;
                                        bArr4 = bArr4;
                                        unsafe = unsafe;
                                        if (iZzh2 != i47) {
                                            i12 = i12;
                                            iZzg = iZzh2;
                                            i87 = i49;
                                            unsafe5 = unsafe;
                                            zzdtVar3 = zzdtVar2;
                                            i88 = 0;
                                            i91 = i43;
                                            i93 = i93;
                                            bArr6 = bArr4;
                                            obj3 = obj;
                                        } else {
                                            i13 = i12;
                                            i18 = iZzh2;
                                            i17 = i92;
                                            i91 = i43;
                                            i93 = i93;
                                            obj3 = obj;
                                        }
                                        break;
                                    default:
                                        if (i19 == 3) {
                                            zzgiVarZzr = this.zzr(i89);
                                            i80 = (i90 & (-8)) | 4;
                                            i77 = i11;
                                            iZzh2 = zzdu.zzc(zzgiVarZzr, bArr, i47, i11, i80, zzdtVar);
                                            zzezVar.add(zzdtVar2.zzc);
                                            while (iZzh2 < i77) {
                                                iZzh15 = zzdu.zzh(bArr4, iZzh2, zzdtVar2);
                                                if (i90 == zzdtVar2.zza) {
                                                    i89 = i89;
                                                    i47 = i47;
                                                    i90 = i90;
                                                    i92 = i48;
                                                    i49 = i77;
                                                    bArr4 = bArr4;
                                                    unsafe = unsafe;
                                                    if (iZzh2 != i47) {
                                                        i12 = i12;
                                                        iZzg = iZzh2;
                                                        i87 = i49;
                                                        unsafe5 = unsafe;
                                                        zzdtVar3 = zzdtVar2;
                                                        i88 = 0;
                                                        i91 = i43;
                                                        i93 = i93;
                                                        bArr6 = bArr4;
                                                        obj3 = obj;
                                                    } else {
                                                        i13 = i12;
                                                        i18 = iZzh2;
                                                        i17 = i92;
                                                        i91 = i43;
                                                        i93 = i93;
                                                        obj3 = obj;
                                                    }
                                                } else {
                                                    iZzh2 = zzdu.zzc(zzgiVarZzr, bArr, iZzh15, i11, i80, zzdtVar);
                                                    zzezVar.add(zzdtVar2.zzc);
                                                }
                                                break;
                                            }
                                            i89 = i89;
                                            i47 = i47;
                                            i90 = i90;
                                            i92 = i48;
                                            i49 = i77;
                                            bArr4 = bArr4;
                                            unsafe = unsafe;
                                            if (iZzh2 != i47) {
                                                i12 = i12;
                                                iZzg = iZzh2;
                                                i87 = i49;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i91 = i43;
                                                i93 = i93;
                                                bArr6 = bArr4;
                                                obj3 = obj;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzh2;
                                                i17 = i92;
                                                i91 = i43;
                                                i93 = i93;
                                                obj3 = obj;
                                            }
                                        } else {
                                            i89 = i89;
                                            i47 = i47;
                                            i90 = i90;
                                            bArr4 = bArr4;
                                            unsafe = unsafe;
                                            i92 = i48;
                                            i49 = i11;
                                            iZzh2 = i47;
                                            if (iZzh2 != i47) {
                                                i12 = i12;
                                                iZzg = iZzh2;
                                                i87 = i49;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i91 = i43;
                                                i93 = i93;
                                                bArr6 = bArr4;
                                                obj3 = obj;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzh2;
                                                i17 = i92;
                                                i91 = i43;
                                                i93 = i93;
                                                obj3 = obj;
                                            }
                                        }
                                        break;
                                }
                            } else {
                                i45 = i89;
                                i44 = i47;
                                i90 = i90;
                                unsafe = unsafe;
                                i46 = i92;
                                if (iZzn == 50) {
                                    obj3 = obj;
                                    unsafe4 = zzb;
                                    j12 = iArr[i45 + 2] & 1048575;
                                    switch (iZzn) {
                                        case 51:
                                            i17 = i46;
                                            i81 = i45;
                                            bArr5 = bArr;
                                            i82 = i44;
                                            if (i19 == 1) {
                                                unsafe4.putObject(obj3, j10, Double.valueOf(Double.longBitsToDouble(zzdu.zzn(bArr5, i82))));
                                                iZzk2 = i82 + 8;
                                                unsafe4.putInt(obj3, j12, i17);
                                                iZzg = iZzk2;
                                            } else {
                                                iZzg = i82;
                                            }
                                            if (iZzg != i82) {
                                                this = this;
                                                i92 = i17;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i89 = i81;
                                                i91 = i43;
                                                i93 = i93;
                                                i87 = i11;
                                                bArr6 = bArr5;
                                                i12 = i12;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzg;
                                                i89 = i81;
                                                i91 = i43;
                                                i93 = i93;
                                            }
                                            break;
                                        case 52:
                                            i17 = i46;
                                            i81 = i45;
                                            bArr5 = bArr;
                                            i82 = i44;
                                            if (i19 == 5) {
                                                unsafe4.putObject(obj3, j10, Float.valueOf(Float.intBitsToFloat(zzdu.zzb(bArr5, i82))));
                                                iZzk2 = i82 + 4;
                                                unsafe4.putInt(obj3, j12, i17);
                                                iZzg = iZzk2;
                                            } else {
                                                iZzg = i82;
                                            }
                                            if (iZzg != i82) {
                                                this = this;
                                                i92 = i17;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i89 = i81;
                                                i91 = i43;
                                                i93 = i93;
                                                i87 = i11;
                                                bArr6 = bArr5;
                                                i12 = i12;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzg;
                                                i89 = i81;
                                                i91 = i43;
                                                i93 = i93;
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            i17 = i46;
                                            i81 = i45;
                                            bArr5 = bArr;
                                            i82 = i44;
                                            if (i19 == 0) {
                                                iZzk2 = zzdu.zzk(bArr5, i82, zzdtVar2);
                                                unsafe4.putObject(obj3, j10, Long.valueOf(zzdtVar2.zzb));
                                                unsafe4.putInt(obj3, j12, i17);
                                                iZzg = iZzk2;
                                            } else {
                                                iZzg = i82;
                                            }
                                            if (iZzg != i82) {
                                                this = this;
                                                i92 = i17;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i89 = i81;
                                                i91 = i43;
                                                i93 = i93;
                                                i87 = i11;
                                                bArr6 = bArr5;
                                                i12 = i12;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzg;
                                                i89 = i81;
                                                i91 = i43;
                                                i93 = i93;
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            i17 = i46;
                                            i81 = i45;
                                            bArr5 = bArr;
                                            i82 = i44;
                                            if (i19 == 0) {
                                                iZzk2 = zzdu.zzh(bArr5, i82, zzdtVar2);
                                                unsafe4.putObject(obj3, j10, Integer.valueOf(zzdtVar2.zza));
                                                unsafe4.putInt(obj3, j12, i17);
                                                iZzg = iZzk2;
                                            } else {
                                                iZzg = i82;
                                            }
                                            if (iZzg != i82) {
                                                this = this;
                                                i92 = i17;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i89 = i81;
                                                i91 = i43;
                                                i93 = i93;
                                                i87 = i11;
                                                bArr6 = bArr5;
                                                i12 = i12;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzg;
                                                i89 = i81;
                                                i91 = i43;
                                                i93 = i93;
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            i17 = i46;
                                            i81 = i45;
                                            bArr5 = bArr;
                                            i82 = i44;
                                            if (i19 == 1) {
                                                unsafe4.putObject(obj3, j10, Long.valueOf(zzdu.zzn(bArr5, i82)));
                                                iZzk2 = i82 + 8;
                                                unsafe4.putInt(obj3, j12, i17);
                                                iZzg = iZzk2;
                                            } else {
                                                iZzg = i82;
                                            }
                                            if (iZzg != i82) {
                                                this = this;
                                                i92 = i17;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i89 = i81;
                                                i91 = i43;
                                                i93 = i93;
                                                i87 = i11;
                                                bArr6 = bArr5;
                                                i12 = i12;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzg;
                                                i89 = i81;
                                                i91 = i43;
                                                i93 = i93;
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            i17 = i46;
                                            i81 = i45;
                                            bArr5 = bArr;
                                            i82 = i44;
                                            if (i19 == 5) {
                                                unsafe4.putObject(obj3, j10, Integer.valueOf(zzdu.zzb(bArr5, i82)));
                                                iZzk2 = i82 + 4;
                                                unsafe4.putInt(obj3, j12, i17);
                                                iZzg = iZzk2;
                                            } else {
                                                iZzg = i82;
                                            }
                                            if (iZzg != i82) {
                                                this = this;
                                                i92 = i17;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i89 = i81;
                                                i91 = i43;
                                                i93 = i93;
                                                i87 = i11;
                                                bArr6 = bArr5;
                                                i12 = i12;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzg;
                                                i89 = i81;
                                                i91 = i43;
                                                i93 = i93;
                                            }
                                            break;
                                        case 58:
                                            i17 = i46;
                                            i81 = i45;
                                            bArr5 = bArr;
                                            i82 = i44;
                                            if (i19 == 0) {
                                                iZzk2 = zzdu.zzk(bArr5, i82, zzdtVar2);
                                                if (zzdtVar2.zzb != 0) {
                                                    z14 = true;
                                                } else {
                                                    z14 = false;
                                                }
                                                unsafe4.putObject(obj3, j10, Boolean.valueOf(z14));
                                                unsafe4.putInt(obj3, j12, i17);
                                                iZzg = iZzk2;
                                            } else {
                                                iZzg = i82;
                                            }
                                            if (iZzg != i82) {
                                                this = this;
                                                i92 = i17;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i89 = i81;
                                                i91 = i43;
                                                i93 = i93;
                                                i87 = i11;
                                                bArr6 = bArr5;
                                                i12 = i12;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzg;
                                                i89 = i81;
                                                i91 = i43;
                                                i93 = i93;
                                            }
                                            break;
                                        case 59:
                                            i17 = i46;
                                            bArr5 = bArr;
                                            i82 = i44;
                                            i81 = i45;
                                            if (i19 == 2) {
                                                iZzh16 = zzdu.zzh(bArr5, i82, zzdtVar2);
                                                i83 = zzdtVar2.zza;
                                                if (i83 == 0) {
                                                    unsafe4.putObject(obj3, j10, "");
                                                } else {
                                                    if ((i20 & PKIFailureInfo.duplicateCertReq) == 0) {
                                                    }
                                                    unsafe4.putObject(obj3, j10, new String(bArr5, iZzh16, i83, zzfa.zzb));
                                                    iZzh16 += i83;
                                                }
                                                unsafe4.putInt(obj3, j12, i17);
                                                iZzg = iZzh16;
                                            } else {
                                                i81 = i81;
                                                iZzg = i82;
                                            }
                                            if (iZzg != i82) {
                                                this = this;
                                                i92 = i17;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i89 = i81;
                                                i91 = i43;
                                                i93 = i93;
                                                i87 = i11;
                                                bArr6 = bArr5;
                                                i12 = i12;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzg;
                                                i89 = i81;
                                                i91 = i43;
                                                i93 = i93;
                                            }
                                            break;
                                        case 60:
                                            i84 = i45;
                                            i85 = i44;
                                            if (i19 == 2) {
                                                Object objZzu3 = this.zzu(obj3, i46, i84);
                                                int iZzm5 = zzdu.zzm(objZzu3, this.zzr(i84), bArr, i85, i11, zzdtVar);
                                                this.zzC(obj3, i46, i84, objZzu3);
                                                iZzg = iZzm5;
                                                bArr5 = bArr;
                                                i81 = i84;
                                                i82 = i85;
                                                i17 = i46;
                                            } else {
                                                i81 = i84;
                                                bArr5 = bArr;
                                                i82 = i85;
                                                i17 = i46;
                                                iZzg = i82;
                                            }
                                            if (iZzg != i82) {
                                                this = this;
                                                i92 = i17;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i89 = i81;
                                                i91 = i43;
                                                i93 = i93;
                                                i87 = i11;
                                                bArr6 = bArr5;
                                                i12 = i12;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzg;
                                                i89 = i81;
                                                i91 = i43;
                                                i93 = i93;
                                            }
                                            break;
                                        case 61:
                                            i85 = i44;
                                            i84 = i45;
                                            if (i19 == 2) {
                                                iZza = zzdu.zza(bArr, i85, zzdtVar2);
                                                unsafe4.putObject(obj3, j10, zzdtVar2.zzc);
                                                unsafe4.putInt(obj3, j12, i46);
                                                iZzg = iZza;
                                                i81 = i84;
                                                bArr5 = bArr;
                                                i82 = i85;
                                                i17 = i46;
                                                if (iZzg != i82) {
                                                    this = this;
                                                    i92 = i17;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    i87 = i11;
                                                    bArr6 = bArr5;
                                                    i12 = i12;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzg;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                }
                                            }
                                            i81 = i84;
                                            bArr5 = bArr;
                                            i82 = i85;
                                            i17 = i46;
                                            iZzg = i82;
                                            if (iZzg != i82) {
                                                this = this;
                                                i92 = i17;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i89 = i81;
                                                i91 = i43;
                                                i93 = i93;
                                                i87 = i11;
                                                bArr6 = bArr5;
                                                i12 = i12;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzg;
                                                i89 = i81;
                                                i91 = i43;
                                                i93 = i93;
                                            }
                                            break;
                                        case 63:
                                            i85 = i44;
                                            i84 = i45;
                                            if (i19 == 0) {
                                                iZza = zzdu.zzh(bArr, i85, zzdtVar2);
                                                i86 = zzdtVar2.zza;
                                                zzeyVarZzq2 = this.zzq(i84);
                                                if (zzeyVarZzq2 != null) {
                                                    unsafe4.putObject(obj3, j10, Integer.valueOf(i86));
                                                    unsafe4.putInt(obj3, j12, i46);
                                                } else {
                                                    unsafe4.putObject(obj3, j10, Integer.valueOf(i86));
                                                    unsafe4.putInt(obj3, j12, i46);
                                                }
                                                iZzg = iZza;
                                                i81 = i84;
                                                bArr5 = bArr;
                                                i82 = i85;
                                                i17 = i46;
                                                if (iZzg != i82) {
                                                    this = this;
                                                    i92 = i17;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    i87 = i11;
                                                    bArr6 = bArr5;
                                                    i12 = i12;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzg;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                }
                                            }
                                            i81 = i84;
                                            bArr5 = bArr;
                                            i82 = i85;
                                            i17 = i46;
                                            iZzg = i82;
                                            if (iZzg != i82) {
                                                this = this;
                                                i92 = i17;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i89 = i81;
                                                i91 = i43;
                                                i93 = i93;
                                                i87 = i11;
                                                bArr6 = bArr5;
                                                i12 = i12;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzg;
                                                i89 = i81;
                                                i91 = i43;
                                                i93 = i93;
                                            }
                                            break;
                                        case 66:
                                            i85 = i44;
                                            i84 = i45;
                                            if (i19 == 0) {
                                                iZza = zzdu.zzh(bArr, i85, zzdtVar2);
                                                unsafe4.putObject(obj3, j10, Integer.valueOf(zzej.zzb(zzdtVar2.zza)));
                                                unsafe4.putInt(obj3, j12, i46);
                                                iZzg = iZza;
                                                i81 = i84;
                                                bArr5 = bArr;
                                                i82 = i85;
                                                i17 = i46;
                                                if (iZzg != i82) {
                                                    this = this;
                                                    i92 = i17;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    i87 = i11;
                                                    bArr6 = bArr5;
                                                    i12 = i12;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzg;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                }
                                            }
                                            i81 = i84;
                                            bArr5 = bArr;
                                            i82 = i85;
                                            i17 = i46;
                                            iZzg = i82;
                                            if (iZzg != i82) {
                                                this = this;
                                                i92 = i17;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i89 = i81;
                                                i91 = i43;
                                                i93 = i93;
                                                i87 = i11;
                                                bArr6 = bArr5;
                                                i12 = i12;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzg;
                                                i89 = i81;
                                                i91 = i43;
                                                i93 = i93;
                                            }
                                            break;
                                        case 67:
                                            i85 = i44;
                                            i84 = i45;
                                            if (i19 == 0) {
                                                int iZzk8 = zzdu.zzk(bArr, i85, zzdtVar2);
                                                unsafe = unsafe;
                                                unsafe4.putObject(obj3, j10, Long.valueOf(zzej.zzc(zzdtVar2.zzb)));
                                                unsafe4.putInt(obj3, j12, i46);
                                                i81 = i84;
                                                iZzg = iZzk8;
                                                bArr5 = bArr;
                                                i82 = i85;
                                                i17 = i46;
                                                if (iZzg != i82) {
                                                    this = this;
                                                    i92 = i17;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    i87 = i11;
                                                    bArr6 = bArr5;
                                                    i12 = i12;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzg;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                }
                                            } else {
                                                unsafe = unsafe;
                                                i81 = i84;
                                                bArr5 = bArr;
                                                i82 = i85;
                                                i17 = i46;
                                                iZzg = i82;
                                                if (iZzg != i82) {
                                                    this = this;
                                                    i92 = i17;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    i87 = i11;
                                                    bArr6 = bArr5;
                                                    i12 = i12;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzg;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                }
                                            }
                                            break;
                                        case 68:
                                            if (i19 == 3) {
                                                Object objZzu4 = this.zzu(obj3, i46, i45);
                                                i85 = i44;
                                                iZzg = zzdu.zzl(objZzu4, this.zzr(i45), bArr, i85, i11, (i90 & (-8)) | 4, zzdtVar);
                                                this.zzC(obj3, i46, i45, objZzu4);
                                                unsafe = unsafe;
                                                i81 = i45;
                                                i90 = i90;
                                                bArr5 = bArr;
                                                i82 = i85;
                                                i17 = i46;
                                                if (iZzg != i82) {
                                                    this = this;
                                                    i92 = i17;
                                                    unsafe5 = unsafe;
                                                    zzdtVar3 = zzdtVar2;
                                                    i88 = 0;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                    i87 = i11;
                                                    bArr6 = bArr5;
                                                    i12 = i12;
                                                } else {
                                                    i13 = i12;
                                                    i18 = iZzg;
                                                    i89 = i81;
                                                    i91 = i43;
                                                    i93 = i93;
                                                }
                                                break;
                                            }
                                        default:
                                            i17 = i46;
                                            i81 = i45;
                                            bArr5 = bArr;
                                            i82 = i44;
                                            iZzg = i82;
                                            if (iZzg != i82) {
                                                this = this;
                                                i92 = i17;
                                                unsafe5 = unsafe;
                                                zzdtVar3 = zzdtVar2;
                                                i88 = 0;
                                                i89 = i81;
                                                i91 = i43;
                                                i93 = i93;
                                                i87 = i11;
                                                bArr6 = bArr5;
                                                i12 = i12;
                                            } else {
                                                i13 = i12;
                                                i18 = iZzg;
                                                i89 = i81;
                                                i91 = i43;
                                                i93 = i93;
                                            }
                                            break;
                                    }
                                } else {
                                    if (i19 == 2) {
                                        unsafe3 = zzb;
                                        Object objZzs2 = this.zzs(i45);
                                        object = unsafe3.getObject(obj, j10);
                                        if (!((zzfr) object).zze()) {
                                            zzfr zzfrVarZzb2 = zzfr.zza().zzb();
                                            zzfs.zza(zzfrVarZzb2, object);
                                            unsafe3.putObject(obj, j10, zzfrVarZzb2);
                                        }
                                        throw null;
                                    }
                                    obj3 = obj;
                                    bArr3 = bArr;
                                }
                            }
                        } else if (i19 == 2) {
                            zzezVarZzd = (zzez) unsafe.getObject(obj3, j10);
                            if (!zzezVarZzd.zzc()) {
                                int size5 = zzezVarZzd.size();
                                zzezVarZzd = zzezVarZzd.zzd(size5 != 0 ? size5 + size5 : 10);
                                unsafe.putObject(obj3, j10, zzezVarZzd);
                            }
                            iZzg = zzdu.zze(this.zzr(i15), i42, bArr, i21, i11, zzezVarZzd, zzdtVar);
                            i90 = i42;
                            i89 = i15;
                            i92 = i92;
                            zzdtVar3 = zzdtVar2;
                            i88 = 0;
                            i91 = i91;
                            i93 = i93;
                            unsafe5 = unsafe;
                            bArr6 = bArr;
                            i87 = i11;
                        } else {
                            i93 = i93;
                            i43 = i91;
                            i44 = i21;
                            i45 = i15;
                            bArr3 = bArr;
                            i46 = i92;
                            i90 = i42;
                        }
                        i13 = i12;
                        i17 = i46;
                        i18 = i44;
                        i89 = i45;
                        i91 = i43;
                        i93 = i93;
                    }
                }
                if (i90 == i13) {
                }
                i92 = i17;
                iZzg = zzdu.zzg(i90, bArr, i18, i11, zzc(obj), zzdtVar);
                i87 = i11;
                i12 = i13;
                unsafe5 = unsafe;
                zzdtVar3 = zzdtVar2;
                i88 = i16;
                this = this;
                bArr6 = bArr;
            } else {
                unsafe = unsafe5;
                i13 = i12;
            }
        }
        if (i93 != 1048575) {
            unsafe.putInt(obj3, i93, i91);
        }
        for (int i106 = this.zzi; i106 < this.zzj; i106++) {
            int i107 = this.zzh[i106];
            int i108 = this.zzc[i107];
            Object objZzf = zzhj.zzf(obj3, zzo(i107) & 1048575);
            if (objZzf != null && zzq(i107) != null) {
                throw null;
            }
        }
        if (i13 == 0) {
            if (iZzg != i11) {
                throw zzfb.zzd();
            }
        } else if (iZzg > i11 || i90 != i13) {
            throw zzfb.zzd();
        }
        return iZzg;
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final Object zzd() {
        return ((zzev) this.zzg).zzc();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:38:0x007f A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zze(Object obj) {
        if (zzH(obj)) {
            if (obj instanceof zzev) {
                zzev zzevVar = (zzev) obj;
                zzevVar.zzl(Integer.MAX_VALUE);
                zzevVar.zza = 0;
                zzevVar.zzj();
            }
            int length = this.zzc.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iZzo = zzo(i10);
                int i11 = 1048575 & iZzo;
                int iZzn = zzn(iZzo);
                long j10 = i11;
                if (iZzn != 9) {
                    if (iZzn != 60 && iZzn != 68) {
                        switch (iZzn) {
                            case 17:
                                if (zzE(obj, i10)) {
                                    zzr(i10).zze(zzb.getObject(obj, j10));
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
                                this.zzk.zza(obj, j10);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzfr) object).zzc();
                                    unsafe.putObject(obj, j10, object);
                                }
                                break;
                        }
                    } else if (zzI(obj, this.zzc[i10], i10)) {
                        zzr(i10).zze(zzb.getObject(obj, j10));
                    }
                } else if (zzE(obj, i10)) {
                    zzr(i10).zze(zzb.getObject(obj, j10));
                }
            }
            this.zzl.zze(obj);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzf(Object obj, Object obj2) {
        zzw(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzo = zzo(i10);
            int i11 = this.zzc[i10];
            long j10 = 1048575 & iZzo;
            switch (zzn(iZzo)) {
                case 0:
                    if (zzE(obj2, i10)) {
                        zzhj.zzl(obj, j10, zzhj.zza(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 1:
                    if (zzE(obj2, i10)) {
                        zzhj.zzm(obj, j10, zzhj.zzb(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 2:
                    if (zzE(obj2, i10)) {
                        zzhj.zzo(obj, j10, zzhj.zzd(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 3:
                    if (zzE(obj2, i10)) {
                        zzhj.zzo(obj, j10, zzhj.zzd(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 4:
                    if (zzE(obj2, i10)) {
                        zzhj.zzn(obj, j10, zzhj.zzc(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 5:
                    if (zzE(obj2, i10)) {
                        zzhj.zzo(obj, j10, zzhj.zzd(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 6:
                    if (zzE(obj2, i10)) {
                        zzhj.zzn(obj, j10, zzhj.zzc(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 7:
                    if (zzE(obj2, i10)) {
                        zzhj.zzk(obj, j10, zzhj.zzt(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 8:
                    if (zzE(obj2, i10)) {
                        zzhj.zzp(obj, j10, zzhj.zzf(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 9:
                    zzx(obj, obj2, i10);
                    break;
                case 10:
                    if (zzE(obj2, i10)) {
                        zzhj.zzp(obj, j10, zzhj.zzf(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 11:
                    if (zzE(obj2, i10)) {
                        zzhj.zzn(obj, j10, zzhj.zzc(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 12:
                    if (zzE(obj2, i10)) {
                        zzhj.zzn(obj, j10, zzhj.zzc(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 13:
                    if (zzE(obj2, i10)) {
                        zzhj.zzn(obj, j10, zzhj.zzc(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 14:
                    if (zzE(obj2, i10)) {
                        zzhj.zzo(obj, j10, zzhj.zzd(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 15:
                    if (zzE(obj2, i10)) {
                        zzhj.zzn(obj, j10, zzhj.zzc(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 16:
                    if (zzE(obj2, i10)) {
                        zzhj.zzo(obj, j10, zzhj.zzd(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 17:
                    zzx(obj, obj2, i10);
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
                    this.zzk.zzb(obj, obj2, j10);
                    break;
                case 50:
                    int i12 = zzgk.zza;
                    zzhj.zzp(obj, j10, zzfs.zza(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10)));
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
                    if (zzI(obj2, i11, i10)) {
                        zzhj.zzp(obj, j10, zzhj.zzf(obj2, j10));
                        zzA(obj, i11, i10);
                    }
                    break;
                case 60:
                    zzy(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzI(obj2, i11, i10)) {
                        zzhj.zzp(obj, j10, zzhj.zzf(obj2, j10));
                        zzA(obj, i11, i10);
                    }
                    break;
                case 68:
                    zzy(obj, obj2, i10);
                    break;
            }
        }
        zzgk.zzd(this.zzl, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzg(Object obj, byte[] bArr, int i10, int i11, zzdt zzdtVar) throws IOException {
        zzb(obj, bArr, i10, i11, 0, zzdtVar);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzh(Object obj, Object obj2) {
        boolean zZzf;
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iZzo = zzo(i10);
            long j10 = iZzo & 1048575;
            switch (zzn(iZzo)) {
                case 0:
                    if (!zzD(obj, obj2, i10) || Double.doubleToLongBits(zzhj.zza(obj, j10)) != Double.doubleToLongBits(zzhj.zza(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzD(obj, obj2, i10) || Float.floatToIntBits(zzhj.zzb(obj, j10)) != Float.floatToIntBits(zzhj.zzb(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzD(obj, obj2, i10) || zzhj.zzd(obj, j10) != zzhj.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzD(obj, obj2, i10) || zzhj.zzd(obj, j10) != zzhj.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzD(obj, obj2, i10) || zzhj.zzc(obj, j10) != zzhj.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzD(obj, obj2, i10) || zzhj.zzd(obj, j10) != zzhj.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzD(obj, obj2, i10) || zzhj.zzc(obj, j10) != zzhj.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzD(obj, obj2, i10) || zzhj.zzt(obj, j10) != zzhj.zzt(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzD(obj, obj2, i10) || !zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzD(obj, obj2, i10) || !zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzD(obj, obj2, i10) || !zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzD(obj, obj2, i10) || zzhj.zzc(obj, j10) != zzhj.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzD(obj, obj2, i10) || zzhj.zzc(obj, j10) != zzhj.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzD(obj, obj2, i10) || zzhj.zzc(obj, j10) != zzhj.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzD(obj, obj2, i10) || zzhj.zzd(obj, j10) != zzhj.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzD(obj, obj2, i10) || zzhj.zzc(obj, j10) != zzhj.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzD(obj, obj2, i10) || zzhj.zzd(obj, j10) != zzhj.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzD(obj, obj2, i10) || !zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
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
                    zZzf = zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10));
                    break;
                case 50:
                    zZzf = zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10));
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
                    long jZzl = zzl(i10) & 1048575;
                    if (zzhj.zzc(obj, jZzl) != zzhj.zzc(obj2, jZzl) || !zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzf) {
                return false;
            }
        }
        return this.zzl.zzb(obj).equals(this.zzl.zzb(obj2));
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0 A[LOOP:1: B:45:0x00af->B:50:0x00c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00dd A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzi(Object obj) {
        int i10;
        int i11;
        List list;
        zzgi zzgiVarZzr;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i14 < this.zzi) {
            int i16 = this.zzh[i14];
            int i17 = this.zzc[i16];
            int iZzo = zzo(i16);
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
            if ((268435456 & iZzo) != 0 && !zzF(obj, i16, i10, i11, i20)) {
                return false;
            }
            int iZzn = zzn(iZzo);
            if (iZzn == 9 || iZzn == 17) {
                if (zzF(obj, i16, i10, i11, i20) && !zzG(obj, iZzo, zzr(i16))) {
                    return false;
                }
            } else if (iZzn == 27) {
                list = (List) zzhj.zzf(obj, iZzo & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgiVarZzr = zzr(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!zzgiVarZzr.zzi(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iZzn == 60 || iZzn == 68) {
                if (zzI(obj, i17, i16) && !zzG(obj, iZzo, zzr(i16))) {
                    return false;
                }
            } else if (iZzn == 49) {
                list = (List) zzhj.zzf(obj, iZzo & 1048575);
                if (list.isEmpty()) {
                    zzgiVarZzr = zzr(i16);
                    while (i12 < list.size()) {
                        if (!zzgiVarZzr.zzi(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzn == 50 && !((zzfr) zzhj.zzf(obj, iZzo & 1048575)).isEmpty()) {
                throw null;
            }
            i14++;
            i15 = i10;
            i13 = i11;
        }
        return true;
    }
}
