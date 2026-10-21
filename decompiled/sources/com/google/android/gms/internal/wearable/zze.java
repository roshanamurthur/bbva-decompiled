package com.google.android.gms.internal.wearable;

import androidx.camera.camera2.internal.n1;
import androidx.camera.core.imagecapture.a;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataMap;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes9.dex */
@VisibleForTesting
public final class zze {
    public static zzf zza(DataMap dataMap) {
        zzg zzgVar = new zzg();
        ArrayList arrayList = new ArrayList();
        TreeSet<String> treeSet = new TreeSet(dataMap.keySet());
        zzh[] zzhVarArr = new zzh[treeSet.size()];
        int i10 = 0;
        for (String str : treeSet) {
            Object obj = dataMap.get(str);
            zzh zzhVar = new zzh();
            zzhVarArr[i10] = zzhVar;
            zzhVar.name = str;
            zzhVar.zzga = zza(arrayList, obj);
            i10++;
        }
        zzgVar.zzfy = zzhVarArr;
        return new zzf(zzgVar, arrayList);
    }

    public static DataMap zza(zzf zzfVar) {
        DataMap dataMap = new DataMap();
        for (zzh zzhVar : zzfVar.zzfw.zzfy) {
            zza(zzfVar.zzfx, dataMap, zzhVar.name, zzhVar.zzga);
        }
        return dataMap;
    }

    private static zzi zza(List<Asset> list, Object obj) {
        zzi zziVar = new zzi();
        if (obj == null) {
            zziVar.type = 14;
            return zziVar;
        }
        zzj zzjVar = new zzj();
        zziVar.zzgc = zzjVar;
        if (obj instanceof String) {
            zziVar.type = 2;
            zzjVar.zzge = (String) obj;
        } else if (obj instanceof Integer) {
            zziVar.type = 6;
            zzjVar.zzgi = ((Integer) obj).intValue();
        } else if (obj instanceof Long) {
            zziVar.type = 5;
            zzjVar.zzgh = ((Long) obj).longValue();
        } else if (obj instanceof Double) {
            zziVar.type = 3;
            zzjVar.zzgf = ((Double) obj).doubleValue();
        } else if (obj instanceof Float) {
            zziVar.type = 4;
            zzjVar.zzgg = ((Float) obj).floatValue();
        } else if (obj instanceof Boolean) {
            zziVar.type = 8;
            zzjVar.zzgk = ((Boolean) obj).booleanValue();
        } else if (obj instanceof Byte) {
            zziVar.type = 7;
            zzjVar.zzgj = ((Byte) obj).byteValue();
        } else if (obj instanceof byte[]) {
            zziVar.type = 1;
            zzjVar.zzgd = (byte[]) obj;
        } else if (obj instanceof String[]) {
            zziVar.type = 11;
            zzjVar.zzgn = (String[]) obj;
        } else if (obj instanceof long[]) {
            zziVar.type = 12;
            zzjVar.zzgo = (long[]) obj;
        } else if (obj instanceof float[]) {
            zziVar.type = 15;
            zzjVar.zzgp = (float[]) obj;
        } else if (obj instanceof Asset) {
            zziVar.type = 13;
            list.add((Asset) obj);
            zzjVar.zzgq = list.size() - 1;
        } else {
            int i10 = 0;
            if (obj instanceof DataMap) {
                zziVar.type = 9;
                DataMap dataMap = (DataMap) obj;
                TreeSet<String> treeSet = new TreeSet(dataMap.keySet());
                zzh[] zzhVarArr = new zzh[treeSet.size()];
                for (String str : treeSet) {
                    zzh zzhVar = new zzh();
                    zzhVarArr[i10] = zzhVar;
                    zzhVar.name = str;
                    zzhVar.zzga = zza(list, dataMap.get(str));
                    i10++;
                }
                zziVar.zzgc.zzgl = zzhVarArr;
            } else if (obj instanceof ArrayList) {
                zziVar.type = 10;
                ArrayList arrayList = (ArrayList) obj;
                zzi[] zziVarArr = new zzi[arrayList.size()];
                int size = arrayList.size();
                Object obj2 = null;
                int i11 = 14;
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    zzi zziVarZza = zza(list, obj3);
                    int i12 = zziVarZza.type;
                    if (i12 != 14 && i12 != 2 && i12 != 6 && i12 != 9) {
                        String strValueOf = String.valueOf(obj3.getClass());
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 130);
                        sb2.append("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a ");
                        sb2.append(strValueOf);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    if (i11 == 14 && i12 != 14) {
                        obj2 = obj3;
                        i11 = i12;
                    } else if (i12 != i11) {
                        String strValueOf2 = String.valueOf(obj2.getClass());
                        String strValueOf3 = String.valueOf(obj3.getClass());
                        StringBuilder sb3 = new StringBuilder(strValueOf3.length() + strValueOf2.length() + 80);
                        sb3.append("ArrayList elements must all be of the sameclass, but this one contains a ");
                        sb3.append(strValueOf2);
                        sb3.append(" and a ");
                        sb3.append(strValueOf3);
                        throw new IllegalArgumentException(sb3.toString());
                    }
                    zziVarArr[i10] = zziVarZza;
                    i10++;
                }
                zziVar.zzgc.zzgm = zziVarArr;
            } else {
                String simpleName = obj.getClass().getSimpleName();
                throw new RuntimeException(simpleName.length() != 0 ? "newFieldValueFromValue: unexpected value ".concat(simpleName) : new String("newFieldValueFromValue: unexpected value "));
            }
        }
        return zziVar;
    }

    private static void zza(List<Asset> list, DataMap dataMap, String str, zzi zziVar) {
        int i10 = zziVar.type;
        boolean z10 = false;
        int i11 = 14;
        if (i10 == 14) {
            dataMap.putString(str, null);
            return;
        }
        zzj zzjVar = zziVar.zzgc;
        if (i10 == 1) {
            dataMap.putByteArray(str, zzjVar.zzgd);
            return;
        }
        if (i10 == 11) {
            dataMap.putStringArray(str, zzjVar.zzgn);
            return;
        }
        if (i10 == 12) {
            dataMap.putLongArray(str, zzjVar.zzgo);
            return;
        }
        if (i10 == 15) {
            dataMap.putFloatArray(str, zzjVar.zzgp);
            return;
        }
        if (i10 == 2) {
            dataMap.putString(str, zzjVar.zzge);
            return;
        }
        if (i10 == 3) {
            dataMap.putDouble(str, zzjVar.zzgf);
            return;
        }
        if (i10 == 4) {
            dataMap.putFloat(str, zzjVar.zzgg);
            return;
        }
        if (i10 == 5) {
            dataMap.putLong(str, zzjVar.zzgh);
            return;
        }
        if (i10 == 6) {
            dataMap.putInt(str, zzjVar.zzgi);
            return;
        }
        if (i10 == 7) {
            dataMap.putByte(str, (byte) zzjVar.zzgj);
            return;
        }
        if (i10 == 8) {
            dataMap.putBoolean(str, zzjVar.zzgk);
            return;
        }
        if (i10 == 13) {
            if (list == null) {
                String strValueOf = String.valueOf(str);
                throw new RuntimeException(strValueOf.length() != 0 ? "populateBundle: unexpected type for: ".concat(strValueOf) : new String("populateBundle: unexpected type for: "));
            }
            dataMap.putAsset(str, list.get((int) zzjVar.zzgq));
            return;
        }
        int i12 = 9;
        if (i10 == 9) {
            DataMap dataMap2 = new DataMap();
            for (zzh zzhVar : zzjVar.zzgl) {
                zza(list, dataMap2, zzhVar.name, zzhVar.zzga);
            }
            dataMap.putDataMap(str, dataMap2);
            return;
        }
        if (i10 == 10) {
            int i13 = 14;
            for (zzi zziVar2 : zzjVar.zzgm) {
                if (i13 == 14) {
                    int i14 = zziVar2.type;
                    if (i14 == 9 || i14 == 2 || i14 == 6) {
                        i13 = i14;
                    } else if (i14 != 14) {
                        int i15 = zziVar2.type;
                        StringBuilder sb2 = new StringBuilder(n1.b(str, 48));
                        sb2.append("Unexpected TypedValue type: ");
                        sb2.append(i15);
                        sb2.append(" for key ");
                        sb2.append(str);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                } else if (zziVar2.type != i13) {
                    int i16 = zziVar2.type;
                    StringBuilder sb3 = new StringBuilder(n1.b(str, 126));
                    sb3.append("The ArrayList elements should all be the same type, but ArrayList with key ");
                    sb3.append(str);
                    sb3.append(" contains items of type ");
                    sb3.append(i13);
                    sb3.append(" and ");
                    sb3.append(i16);
                    throw new IllegalArgumentException(sb3.toString());
                }
            }
            ArrayList<Integer> arrayList = new ArrayList<>(zzjVar.zzgm.length);
            zzi[] zziVarArr = zzjVar.zzgm;
            int length = zziVarArr.length;
            int i17 = 0;
            while (i17 < length) {
                zzi zziVar3 = zziVarArr[i17];
                if (zziVar3.type == i11) {
                    arrayList.add(z10);
                } else if (i13 == i12) {
                    DataMap dataMap3 = new DataMap();
                    for (zzh zzhVar2 : zziVar3.zzgc.zzgl) {
                        zza(list, dataMap3, zzhVar2.name, zzhVar2.zzga);
                    }
                    arrayList.add(dataMap3);
                } else if (i13 == 2) {
                    arrayList.add(zziVar3.zzgc.zzge);
                } else if (i13 == 6) {
                    arrayList.add(Integer.valueOf(zziVar3.zzgc.zzgi));
                } else {
                    throw new IllegalArgumentException(a.a(39, "Unexpected typeOfArrayList: ", i13));
                }
                i17++;
                z10 = false;
                i11 = 14;
                i12 = 9;
            }
            if (i13 == i11) {
                dataMap.putStringArrayList(str, arrayList);
                return;
            }
            if (i13 == 9) {
                dataMap.putDataMapArrayList(str, arrayList);
                return;
            } else if (i13 == 2) {
                dataMap.putStringArrayList(str, arrayList);
                return;
            } else {
                if (i13 == 6) {
                    dataMap.putIntegerArrayList(str, arrayList);
                    return;
                }
                throw new IllegalStateException(a.a(39, "Unexpected typeOfArrayList: ", i13));
            }
        }
        throw new RuntimeException(a.a(43, "populateBundle: unexpected type ", i10));
    }
}
