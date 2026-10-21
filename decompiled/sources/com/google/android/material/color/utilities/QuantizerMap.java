package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class QuantizerMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinkedHashMap f44380a;

    public Map<Integer, Integer> getColorToCount() {
        return this.f44380a;
    }

    public QuantizerResult quantize(int[] iArr, int i10) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i11 : iArr) {
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i11));
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            linkedHashMap.put(Integer.valueOf(i11), Integer.valueOf(iIntValue));
        }
        this.f44380a = linkedHashMap;
        return new QuantizerResult(linkedHashMap);
    }
}
