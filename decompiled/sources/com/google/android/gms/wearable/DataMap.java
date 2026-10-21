package com.google.android.gms.wearable;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.parser.a;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@VisibleForTesting
public class DataMap {
    public static final String TAG = "DataMap";
    private final HashMap<String, Object> zzq = new HashMap<>();

    public static ArrayList<DataMap> arrayListFromBundleArrayList(@NonNull ArrayList<Bundle> arrayList) {
        ArrayList<DataMap> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Bundle bundle = arrayList.get(i10);
            i10++;
            arrayList2.add(fromBundle(bundle));
        }
        return arrayList2;
    }

    public static DataMap fromBundle(@NonNull Bundle bundle) {
        bundle.setClassLoader(Asset.class.getClassLoader());
        DataMap dataMap = new DataMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof String) {
                dataMap.putString(str, (String) obj);
            } else if (obj instanceof Integer) {
                dataMap.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                dataMap.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                dataMap.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Float) {
                dataMap.putFloat(str, ((Float) obj).floatValue());
            } else if (obj instanceof Boolean) {
                dataMap.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dataMap.putByte(str, ((Byte) obj).byteValue());
            } else if (obj instanceof byte[]) {
                dataMap.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof String[]) {
                dataMap.putStringArray(str, (String[]) obj);
            } else if (obj instanceof long[]) {
                dataMap.putLongArray(str, (long[]) obj);
            } else if (obj instanceof float[]) {
                dataMap.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof Asset) {
                dataMap.putAsset(str, (Asset) obj);
            } else if (obj instanceof Bundle) {
                dataMap.putDataMap(str, fromBundle((Bundle) obj));
            } else if (obj instanceof ArrayList) {
                ArrayList<String> arrayList = (ArrayList) obj;
                int iZza = zza(arrayList);
                if (iZza == 0) {
                    dataMap.putStringArrayList(str, arrayList);
                } else if (iZza == 1) {
                    dataMap.putStringArrayList(str, arrayList);
                } else if (iZza == 2) {
                    dataMap.putIntegerArrayList(str, arrayList);
                } else if (iZza == 3) {
                    dataMap.putStringArrayList(str, arrayList);
                } else if (iZza == 5) {
                    dataMap.putDataMapArrayList(str, arrayListFromBundleArrayList(arrayList));
                }
            }
        }
        return dataMap;
    }

    public static DataMap fromByteArray(@NonNull byte[] bArr) {
        try {
            return com.google.android.gms.internal.wearable.zze.zza(new com.google.android.gms.internal.wearable.zzf(com.google.android.gms.internal.wearable.zzg.zza(bArr), new ArrayList()));
        } catch (com.google.android.gms.internal.wearable.zzs e5) {
            throw new IllegalArgumentException("Unable to convert data", e5);
        }
    }

    private static void zza(String str, Object obj, String str2, Object obj2, ClassCastException classCastException) {
        StringBuilder sbC = a.c("Key ", str, " expected ", str2, " but value was a ");
        sbC.append(obj.getClass().getName());
        sbC.append(".  The default value ");
        sbC.append(obj2);
        sbC.append(" was returned.");
        Log.w(TAG, sbC.toString());
        Log.w(TAG, "Attempt to cast generated internal exception:", classCastException);
    }

    public void clear() {
        this.zzq.clear();
    }

    public boolean containsKey(@NonNull String str) {
        return this.zzq.containsKey(str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DataMap)) {
            return false;
        }
        DataMap dataMap = (DataMap) obj;
        if (size() != dataMap.size()) {
            return false;
        }
        for (String str : keySet()) {
            Object obj2 = get(str);
            Object obj3 = dataMap.get(str);
            if (obj2 instanceof Asset) {
                if (!(obj3 instanceof Asset)) {
                    return false;
                }
                Asset asset = (Asset) obj2;
                Asset asset2 = (Asset) obj3;
                if (asset == null || asset2 == null) {
                    if (asset != asset2) {
                        return false;
                    }
                } else {
                    if (!(!TextUtils.isEmpty(asset.getDigest()) ? asset.getDigest().equals(asset2.getDigest()) : Arrays.equals(asset.getData(), asset2.getData()))) {
                        return false;
                    }
                }
            } else if (obj2 instanceof String[]) {
                if (!(obj3 instanceof String[]) || !Arrays.equals((String[]) obj2, (String[]) obj3)) {
                    return false;
                }
            } else if (obj2 instanceof long[]) {
                if (!(obj3 instanceof long[]) || !Arrays.equals((long[]) obj2, (long[]) obj3)) {
                    return false;
                }
            } else if (obj2 instanceof float[]) {
                if (!(obj3 instanceof float[]) || !Arrays.equals((float[]) obj2, (float[]) obj3)) {
                    return false;
                }
            } else if (obj2 instanceof byte[]) {
                if (!(obj3 instanceof byte[]) || !Arrays.equals((byte[]) obj2, (byte[]) obj3)) {
                    return false;
                }
            } else {
                if (obj2 == null || obj3 == null) {
                    return obj2 == obj3;
                }
                if (!obj2.equals(obj3)) {
                    return false;
                }
            }
        }
        return true;
    }

    public <T> T get(@NonNull String str) {
        return (T) this.zzq.get(str);
    }

    public Asset getAsset(@NonNull String str) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (Asset) obj;
        } catch (ClassCastException e5) {
            zza(str, obj, "Asset", e5);
            return null;
        }
    }

    public boolean getBoolean(@NonNull String str) {
        return getBoolean(str, false);
    }

    public byte getByte(@NonNull String str) {
        return getByte(str, (byte) 0);
    }

    public byte[] getByteArray(@NonNull String str) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (byte[]) obj;
        } catch (ClassCastException e5) {
            zza(str, obj, "byte[]", e5);
            return null;
        }
    }

    public DataMap getDataMap(@NonNull String str) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (DataMap) obj;
        } catch (ClassCastException e5) {
            zza(str, obj, TAG, e5);
            return null;
        }
    }

    public ArrayList<DataMap> getDataMapArrayList(@NonNull String str) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e5) {
            zza(str, obj, "ArrayList<DataMap>", e5);
            return null;
        }
    }

    public double getDouble(@NonNull String str) {
        return getDouble(str, 0.0d);
    }

    public float getFloat(@NonNull String str) {
        return getFloat(str, 0.0f);
    }

    public float[] getFloatArray(@NonNull String str) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (float[]) obj;
        } catch (ClassCastException e5) {
            zza(str, obj, "float[]", e5);
            return null;
        }
    }

    public int getInt(@NonNull String str) {
        return getInt(str, 0);
    }

    public ArrayList<Integer> getIntegerArrayList(@NonNull String str) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e5) {
            zza(str, obj, "ArrayList<Integer>", e5);
            return null;
        }
    }

    public long getLong(@NonNull String str) {
        return getLong(str, 0L);
    }

    public long[] getLongArray(@NonNull String str) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (long[]) obj;
        } catch (ClassCastException e5) {
            zza(str, obj, "long[]", e5);
            return null;
        }
    }

    public String getString(@NonNull String str, String str2) {
        String string = getString(str);
        return string == null ? str2 : string;
    }

    public String[] getStringArray(@NonNull String str) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String[]) obj;
        } catch (ClassCastException e5) {
            zza(str, obj, "String[]", e5);
            return null;
        }
    }

    public ArrayList<String> getStringArrayList(@NonNull String str) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e5) {
            zza(str, obj, "ArrayList<String>", e5);
            return null;
        }
    }

    public int hashCode() {
        return this.zzq.hashCode() * 29;
    }

    public boolean isEmpty() {
        return this.zzq.isEmpty();
    }

    public Set<String> keySet() {
        return this.zzq.keySet();
    }

    public void putAll(@NonNull DataMap dataMap) {
        for (String str : dataMap.keySet()) {
            this.zzq.put(str, dataMap.get(str));
        }
    }

    public void putAsset(@NonNull String str, Asset asset) {
        this.zzq.put(str, asset);
    }

    public void putBoolean(@NonNull String str, boolean z10) {
        this.zzq.put(str, Boolean.valueOf(z10));
    }

    public void putByte(@NonNull String str, byte b10) {
        this.zzq.put(str, Byte.valueOf(b10));
    }

    public void putByteArray(@NonNull String str, byte[] bArr) {
        this.zzq.put(str, bArr);
    }

    public void putDataMap(@NonNull String str, DataMap dataMap) {
        this.zzq.put(str, dataMap);
    }

    public void putDataMapArrayList(@NonNull String str, ArrayList<DataMap> arrayList) {
        this.zzq.put(str, arrayList);
    }

    public void putDouble(@NonNull String str, double d2) {
        this.zzq.put(str, Double.valueOf(d2));
    }

    public void putFloat(@NonNull String str, float f6) {
        this.zzq.put(str, Float.valueOf(f6));
    }

    public void putFloatArray(@NonNull String str, float[] fArr) {
        this.zzq.put(str, fArr);
    }

    public void putInt(@NonNull String str, int i10) {
        this.zzq.put(str, Integer.valueOf(i10));
    }

    public void putIntegerArrayList(@NonNull String str, ArrayList<Integer> arrayList) {
        this.zzq.put(str, arrayList);
    }

    public void putLong(@NonNull String str, long j10) {
        this.zzq.put(str, Long.valueOf(j10));
    }

    public void putLongArray(@NonNull String str, long[] jArr) {
        this.zzq.put(str, jArr);
    }

    public void putString(@NonNull String str, String str2) {
        this.zzq.put(str, str2);
    }

    public void putStringArray(@NonNull String str, String[] strArr) {
        this.zzq.put(str, strArr);
    }

    public void putStringArrayList(@NonNull String str, ArrayList<String> arrayList) {
        this.zzq.put(str, arrayList);
    }

    public Object remove(@NonNull String str) {
        return this.zzq.remove(str);
    }

    public int size() {
        return this.zzq.size();
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        for (String str : this.zzq.keySet()) {
            Object obj = this.zzq.get(str);
            if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Float) obj).floatValue());
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Byte) obj).byteValue());
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof String[]) {
                bundle.putStringArray(str, (String[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof Asset) {
                bundle.putParcelable(str, (Asset) obj);
            } else if (obj instanceof DataMap) {
                bundle.putParcelable(str, ((DataMap) obj).toBundle());
            } else if (obj instanceof ArrayList) {
                ArrayList<String> arrayList = (ArrayList) obj;
                int iZza = zza(arrayList);
                if (iZza == 0) {
                    bundle.putStringArrayList(str, arrayList);
                } else if (iZza == 1) {
                    bundle.putStringArrayList(str, arrayList);
                } else if (iZza == 2) {
                    bundle.putIntegerArrayList(str, arrayList);
                } else if (iZza == 3) {
                    bundle.putStringArrayList(str, arrayList);
                } else if (iZza == 4) {
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj2 = arrayList.get(i10);
                        i10++;
                        arrayList2.add(((DataMap) obj2).toBundle());
                    }
                    bundle.putParcelableArrayList(str, arrayList2);
                }
            }
        }
        return bundle;
    }

    public byte[] toByteArray() {
        return com.google.android.gms.internal.wearable.zzt.zzb(com.google.android.gms.internal.wearable.zze.zza(this).zzfw);
    }

    public String toString() {
        return this.zzq.toString();
    }

    public boolean getBoolean(@NonNull String str, boolean z10) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return z10;
        }
        try {
            return ((Boolean) obj).booleanValue();
        } catch (ClassCastException e5) {
            zza(str, obj, "Boolean", Boolean.valueOf(z10), e5);
            return z10;
        }
    }

    public byte getByte(@NonNull String str, byte b10) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return b10;
        }
        try {
            return ((Byte) obj).byteValue();
        } catch (ClassCastException e5) {
            zza(str, obj, "Byte", Byte.valueOf(b10), e5);
            return b10;
        }
    }

    public double getDouble(@NonNull String str, double d2) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return d2;
        }
        try {
            return ((Double) obj).doubleValue();
        } catch (ClassCastException e5) {
            zza(str, obj, "Double", Double.valueOf(d2), e5);
            return d2;
        }
    }

    public float getFloat(@NonNull String str, float f6) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return f6;
        }
        try {
            return ((Float) obj).floatValue();
        } catch (ClassCastException e5) {
            zza(str, obj, "Float", Float.valueOf(f6), e5);
            return f6;
        }
    }

    public int getInt(@NonNull String str, int i10) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return i10;
        }
        try {
            return ((Integer) obj).intValue();
        } catch (ClassCastException e5) {
            zza(str, obj, "Integer", e5);
            return i10;
        }
    }

    public long getLong(@NonNull String str, long j10) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return j10;
        }
        try {
            return ((Long) obj).longValue();
        } catch (ClassCastException e5) {
            zza(str, obj, "long", e5);
            return j10;
        }
    }

    public String getString(@NonNull String str) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String) obj;
        } catch (ClassCastException e5) {
            zza(str, obj, "String", e5);
            return null;
        }
    }

    private static void zza(String str, Object obj, String str2, ClassCastException classCastException) {
        zza(str, obj, str2, "<null>", classCastException);
    }

    private static int zza(ArrayList<?> arrayList) {
        int i10 = 0;
        if (arrayList.isEmpty()) {
            return 0;
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (obj != null) {
                if (obj instanceof Integer) {
                    return 2;
                }
                if (obj instanceof String) {
                    return 3;
                }
                if (obj instanceof DataMap) {
                    return 4;
                }
                if (obj instanceof Bundle) {
                    return 5;
                }
            }
        }
        return 1;
    }
}
