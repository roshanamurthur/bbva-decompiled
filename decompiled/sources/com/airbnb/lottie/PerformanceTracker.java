package com.airbnb.lottie;

import androidx.collection.ArraySet;
import androidx.core.util.Pair;
import com.airbnb.lottie.utils.MeanCalculator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class PerformanceTracker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f25664a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArraySet f25665b = new ArraySet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f25666c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f25667d = new a();

    public interface FrameListener {
        void onFrameRendered(float f6);
    }

    public class a implements Comparator<Pair<String, Float>> {
        @Override // java.util.Comparator
        public final int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float fFloatValue = pair.second.floatValue();
            float fFloatValue2 = pair2.second.floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    public void addFrameListener(FrameListener frameListener) {
        this.f25665b.add(frameListener);
    }

    public void clearRenderTimes() {
        this.f25666c.clear();
    }

    public List<Pair<String, Float>> getSortedRenderTimes() {
        if (!this.f25664a) {
            return Collections.emptyList();
        }
        HashMap map = this.f25666c;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new Pair((String) entry.getKey(), Float.valueOf(((MeanCalculator) entry.getValue()).getMean())));
        }
        Collections.sort(arrayList, this.f25667d);
        return arrayList;
    }

    public void logRenderTimes() {
        if (this.f25664a) {
            List<Pair<String, Float>> sortedRenderTimes = getSortedRenderTimes();
            for (int i10 = 0; i10 < sortedRenderTimes.size(); i10++) {
                Pair<String, Float> pair = sortedRenderTimes.get(i10);
                String.format("\t\t%30s:%.2f", pair.first, pair.second);
            }
        }
    }

    public void recordRenderTime(String str, float f6) {
        if (this.f25664a) {
            HashMap map = this.f25666c;
            MeanCalculator meanCalculator = (MeanCalculator) map.get(str);
            if (meanCalculator == null) {
                meanCalculator = new MeanCalculator();
                map.put(str, meanCalculator);
            }
            meanCalculator.add(f6);
            if (str.equals("__container")) {
                Iterator<E> it = this.f25665b.iterator();
                while (it.hasNext()) {
                    ((FrameListener) it.next()).onFrameRendered(f6);
                }
            }
        }
    }

    public void removeFrameListener(FrameListener frameListener) {
        this.f25665b.remove(frameListener);
    }
}
