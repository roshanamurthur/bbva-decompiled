package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzaq extends zzai {
    static final zzai zza = new zzaq(null, new Object[0], 0);
    final transient Object[] zzb;

    @CheckForNull
    private final transient Object zzc;
    private final transient int zzd;

    private zzaq(@CheckForNull Object obj, Object[] objArr, int i10) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i10;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x013b A[PHI: r5
      0x013b: PHI (r5v5 ??) = (r5v2 ??), (r5v6 short[]) binds: [B:74:0x01a5, B:57:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    public static zzaq zzg(int i10, Object[] objArr, zzah zzahVar) {
        int iHighestOneBit;
        short[] sArr;
        char c10;
        char c11;
        ?? r3;
        ?? r4;
        int i11 = i10;
        Object[] objArrCopyOf = objArr;
        if (i11 == 0) {
            return (zzaq) zza;
        }
        zzag zzagVar = null;
        ?? r10 = 0;
        zzag zzagVar2 = null;
        zzag zzagVar3 = null;
        int i12 = 1;
        if (i11 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            zzw.zza(obj, obj2);
            return new zzaq(null, objArrCopyOf, 1);
        }
        zzt.zzb(i11, objArrCopyOf.length >> 1, FirebaseAnalytics.Param.INDEX);
        int iMax = Math.max(i11, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i11 == 1) {
            Object obj3 = objArrCopyOf[0];
            Objects.requireNonNull(obj3);
            Object obj4 = objArrCopyOf[1];
            Objects.requireNonNull(obj4);
            zzw.zza(obj3, obj4);
            i11 = 1;
            c10 = 1;
            c11 = 2;
        } else {
            int i13 = iHighestOneBit - 1;
            byte b10 = -1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i14 = 0;
                int i15 = 0;
                while (i14 < i11) {
                    int i16 = i15 + i15;
                    int i17 = i14 + i14;
                    Object obj5 = objArrCopyOf[i17];
                    Objects.requireNonNull(obj5);
                    Object obj6 = objArrCopyOf[i17 ^ i12];
                    Objects.requireNonNull(obj6);
                    zzw.zza(obj5, obj6);
                    int iZza = zzy.zza(obj5.hashCode());
                    while (true) {
                        int i18 = iZza & i13;
                        int i19 = bArr[i18] & 255;
                        if (i19 == 255) {
                            bArr[i18] = (byte) i16;
                            if (i15 < i14) {
                                objArrCopyOf[i16] = obj5;
                                objArrCopyOf[i16 ^ 1] = obj6;
                            }
                            i15++;
                            break;
                        }
                        if (obj5.equals(objArrCopyOf[i19 == true ? 1 : 0])) {
                            int i20 = ~i19;
                            Object obj7 = objArrCopyOf[i20 == true ? 1 : 0];
                            Objects.requireNonNull(obj7);
                            zzag zzagVar4 = new zzag(obj5, obj6, obj7);
                            objArrCopyOf[i20 == true ? 1 : 0] = obj6;
                            zzagVar2 = zzagVar4;
                            break;
                        }
                        iZza = i18 + 1;
                    }
                    i14++;
                    i12 = 1;
                }
                if (i15 == i11) {
                    r3 = bArr;
                } else {
                    r4 = new Object[]{bArr, Integer.valueOf(i15), zzagVar2};
                    c11 = 2;
                }
                c10 = 1;
                r10 = r4;
            } else if (iHighestOneBit <= 32768) {
                sArr = new short[iHighestOneBit];
                Arrays.fill(sArr, (short) -1);
                int i21 = 0;
                for (int i22 = 0; i22 < i11; i22++) {
                    int i23 = i21 + i21;
                    int i24 = i22 + i22;
                    Object obj8 = objArrCopyOf[i24];
                    Objects.requireNonNull(obj8);
                    Object obj9 = objArrCopyOf[i24 ^ 1];
                    Objects.requireNonNull(obj9);
                    zzw.zza(obj8, obj9);
                    int iZza2 = zzy.zza(obj8.hashCode());
                    while (true) {
                        int i25 = iZza2 & i13;
                        char c12 = (char) sArr[i25];
                        if (c12 == 65535) {
                            sArr[i25] = (short) i23;
                            if (i21 < i22) {
                                objArrCopyOf[i23] = obj8;
                                objArrCopyOf[i23 ^ 1] = obj9;
                            }
                            i21++;
                            break;
                        }
                        if (obj8.equals(objArrCopyOf[c12])) {
                            int i26 = c12 ^ 1;
                            Object obj10 = objArrCopyOf[i26 == true ? 1 : 0];
                            Objects.requireNonNull(obj10);
                            zzag zzagVar5 = new zzag(obj8, obj9, obj10);
                            objArrCopyOf[i26 == true ? 1 : 0] = obj9;
                            zzagVar3 = zzagVar5;
                            break;
                        }
                        iZza2 = i25 + 1;
                    }
                }
                if (i21 == i11) {
                    r3 = sArr;
                } else {
                    c11 = 2;
                    r10 = new Object[]{sArr, Integer.valueOf(i21), zzagVar3};
                    c10 = 1;
                }
            } else {
                int i27 = 1;
                sArr = new int[iHighestOneBit];
                Arrays.fill((int[]) sArr, -1);
                int i28 = 0;
                int i29 = 0;
                while (i28 < i11) {
                    int i30 = i29 + i29;
                    int i31 = i28 + i28;
                    Object obj11 = objArrCopyOf[i31];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArrCopyOf[i31 ^ i27];
                    Objects.requireNonNull(obj12);
                    zzw.zza(obj11, obj12);
                    int iZza3 = zzy.zza(obj11.hashCode());
                    while (true) {
                        int i32 = iZza3 & i13;
                        ?? r15 = sArr[i32];
                        if (r15 == b10) {
                            sArr[i32] = i30;
                            if (i29 < i28) {
                                objArrCopyOf[i30] = obj11;
                                objArrCopyOf[i30 ^ 1] = obj12;
                            }
                            i29++;
                            break;
                        }
                        if (obj11.equals(objArrCopyOf[r15])) {
                            int i33 = r15 ^ 1;
                            Object obj13 = objArrCopyOf[i33 == true ? 1 : 0];
                            Objects.requireNonNull(obj13);
                            zzag zzagVar6 = new zzag(obj11, obj12, obj13);
                            objArrCopyOf[i33 == true ? 1 : 0] = obj12;
                            zzagVar = zzagVar6;
                            break;
                        }
                        iZza3 = i32 + 1;
                        b10 = -1;
                    }
                    i28++;
                    i27 = 1;
                    b10 = -1;
                }
                if (i29 == i11) {
                    r3 = sArr;
                } else {
                    c10 = 1;
                    c11 = 2;
                    r10 = new Object[]{sArr, Integer.valueOf(i29), zzagVar};
                }
            }
            c11 = 2;
            r4 = r3;
            c10 = 1;
            r10 = r4;
        }
        boolean z10 = r10 instanceof Object[];
        ?? r11 = r10;
        if (z10) {
            Object[] objArr2 = (Object[]) r10;
            zzag zzagVar7 = (zzag) objArr2[c11];
            if (zzahVar == null) {
                throw zzagVar7.zza();
            }
            zzahVar.zzc = zzagVar7;
            Object obj14 = objArr2[0];
            int iIntValue = ((Integer) objArr2[c10]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            r11 = obj14;
            i11 = iIntValue;
        }
        return new zzaq(r11, objArrCopyOf, i11);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.mlkit_common.zzai, java.util.Map
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i10 = this.zzd;
            Object[] objArr = this.zzb;
            if (i10 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.zzc;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iZza = zzy.zza(obj.hashCode());
                    while (true) {
                        int i11 = iZza & length;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i12])) {
                            obj2 = objArr[i12 ^ 1];
                        } else {
                            iZza = i11 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iZza2 = zzy.zza(obj.hashCode());
                    while (true) {
                        int i13 = iZza2 & length2;
                        char c10 = (char) sArr[i13];
                        if (c10 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c10])) {
                            obj2 = objArr[c10 ^ 1];
                        } else {
                            iZza2 = i13 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iZza3 = zzy.zza(obj.hashCode());
                    while (true) {
                        int i14 = iZza3 & length3;
                        int i15 = iArr[i14];
                        if (i15 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i15])) {
                            obj2 = objArr[i15 ^ 1];
                        } else {
                            iZza3 = i14 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    public final zzab zza() {
        return new zzap(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    public final zzaj zzd() {
        return new zzan(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    public final zzaj zze() {
        return new zzao(this, new zzap(this.zzb, 0, this.zzd));
    }
}
