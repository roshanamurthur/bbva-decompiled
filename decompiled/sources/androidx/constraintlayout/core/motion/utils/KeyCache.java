package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class KeyCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<Object, HashMap<String, float[]>> f18846a = new HashMap<>();

    public float getFloatValue(Object obj, String str, int i10) {
        HashMap<String, float[]> map;
        float[] fArr;
        HashMap<Object, HashMap<String, float[]>> map2 = this.f18846a;
        if (map2.containsKey(obj) && (map = map2.get(obj)) != null && map.containsKey(str) && (fArr = map.get(str)) != null && fArr.length > i10) {
            return fArr[i10];
        }
        return Float.NaN;
    }

    public void setFloatValue(Object obj, String str, int i10, float f6) {
        HashMap<Object, HashMap<String, float[]>> map = this.f18846a;
        if (!map.containsKey(obj)) {
            HashMap<String, float[]> map2 = new HashMap<>();
            float[] fArr = new float[i10 + 1];
            fArr[i10] = f6;
            map2.put(str, fArr);
            map.put(obj, map2);
            return;
        }
        HashMap<String, float[]> map3 = map.get(obj);
        if (map3 == null) {
            map3 = new HashMap<>();
        }
        if (!map3.containsKey(str)) {
            float[] fArr2 = new float[i10 + 1];
            fArr2[i10] = f6;
            map3.put(str, fArr2);
            map.put(obj, map3);
            return;
        }
        float[] fArrCopyOf = map3.get(str);
        if (fArrCopyOf == null) {
            fArrCopyOf = new float[0];
        }
        if (fArrCopyOf.length <= i10) {
            fArrCopyOf = Arrays.copyOf(fArrCopyOf, i10 + 1);
        }
        fArrCopyOf[i10] = f6;
        map3.put(str, fArrCopyOf);
    }
}
