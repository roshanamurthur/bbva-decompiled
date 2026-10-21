package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.model.Marker;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.utils.Utils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LottieComposition {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, List<Layer>> f25587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, LottieImageAsset> f25588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f25589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, Font> f25590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<Marker> f25591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SparseArrayCompat<FontCharacter> f25592h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LongSparseArray<Layer> f25593i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<Layer> f25594j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f25595k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f25596l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f25597n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f25598o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f25600q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f25601r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PerformanceTracker f25585a = new PerformanceTracker();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet<String> f25586b = new HashSet<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f25599p = 0;

    @Deprecated
    public static class Factory {

        public static final class a implements LottieListener<LottieComposition>, Cancellable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OnCompositionLoadedListener f25602a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f25603b = false;

            public a(OnCompositionLoadedListener onCompositionLoadedListener) {
                this.f25602a = onCompositionLoadedListener;
            }

            @Override // com.airbnb.lottie.Cancellable
            public final void cancel() {
                this.f25603b = true;
            }

            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(LottieComposition lottieComposition) {
                LottieComposition lottieComposition2 = lottieComposition;
                if (this.f25603b) {
                    return;
                }
                this.f25602a.onCompositionLoaded(lottieComposition2);
            }
        }

        @Deprecated
        public static Cancellable fromAssetFileName(Context context, String str, OnCompositionLoadedListener onCompositionLoadedListener) {
            a aVar = new a(onCompositionLoadedListener);
            LottieCompositionFactory.fromAsset(context, str).addListener(aVar);
            return aVar;
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static LottieComposition fromFileSync(Context context, String str) {
            return LottieCompositionFactory.fromAssetSync(context, str).getValue();
        }

        @Deprecated
        public static Cancellable fromInputStream(InputStream inputStream, OnCompositionLoadedListener onCompositionLoadedListener) {
            a aVar = new a(onCompositionLoadedListener);
            LottieCompositionFactory.fromJsonInputStream(inputStream, null).addListener(aVar);
            return aVar;
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static LottieComposition fromInputStreamSync(InputStream inputStream) {
            return LottieCompositionFactory.fromJsonInputStreamSync(inputStream, null).getValue();
        }

        @Deprecated
        public static Cancellable fromJsonReader(JsonReader jsonReader, OnCompositionLoadedListener onCompositionLoadedListener) {
            a aVar = new a(onCompositionLoadedListener);
            LottieCompositionFactory.fromJsonReader(jsonReader, null).addListener(aVar);
            return aVar;
        }

        @Deprecated
        public static Cancellable fromJsonString(String str, OnCompositionLoadedListener onCompositionLoadedListener) {
            a aVar = new a(onCompositionLoadedListener);
            LottieCompositionFactory.fromJsonString(str, null).addListener(aVar);
            return aVar;
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static LottieComposition fromJsonSync(Resources resources, JSONObject jSONObject) {
            return LottieCompositionFactory.fromJsonSync(jSONObject, null).getValue();
        }

        @Deprecated
        public static Cancellable fromRawFile(Context context, @RawRes int i10, OnCompositionLoadedListener onCompositionLoadedListener) {
            a aVar = new a(onCompositionLoadedListener);
            LottieCompositionFactory.fromRawRes(context, i10).addListener(aVar);
            return aVar;
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static LottieComposition fromInputStreamSync(InputStream inputStream, boolean z10) {
            if (z10) {
                Logger.warning("Lottie now auto-closes input stream!");
            }
            return LottieCompositionFactory.fromJsonInputStreamSync(inputStream, null).getValue();
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static LottieComposition fromJsonSync(String str) {
            return LottieCompositionFactory.fromJsonStringSync(str, null).getValue();
        }

        @Nullable
        @WorkerThread
        @Deprecated
        public static LottieComposition fromJsonSync(JsonReader jsonReader) {
            return LottieCompositionFactory.fromJsonReaderSync(jsonReader, null).getValue();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void addWarning(String str) {
        Logger.warning(str);
        this.f25586b.add(str);
    }

    public Rect getBounds() {
        return this.f25595k;
    }

    public SparseArrayCompat<FontCharacter> getCharacters() {
        return this.f25592h;
    }

    public float getDuration() {
        return (long) ((getDurationFrames() / this.f25597n) * 1000.0f);
    }

    public float getDurationFrames() {
        return this.m - this.f25596l;
    }

    public float getEndFrame() {
        return this.m;
    }

    public Map<String, Font> getFonts() {
        return this.f25590f;
    }

    public float getFrameForProgress(float f6) {
        return MiscUtils.lerp(this.f25596l, this.m, f6);
    }

    public float getFrameRate() {
        return this.f25597n;
    }

    public Map<String, LottieImageAsset> getImages() {
        float fDpScale = Utils.dpScale();
        if (fDpScale != this.f25589e) {
            for (Map.Entry<String, LottieImageAsset> entry : this.f25588d.entrySet()) {
                this.f25588d.put(entry.getKey(), entry.getValue().copyWithScale(this.f25589e / fDpScale));
            }
        }
        this.f25589e = fDpScale;
        return this.f25588d;
    }

    public List<Layer> getLayers() {
        return this.f25594j;
    }

    @Nullable
    public Marker getMarker(String str) {
        int size = this.f25591g.size();
        for (int i10 = 0; i10 < size; i10++) {
            Marker marker = this.f25591g.get(i10);
            if (marker.matchesName(str)) {
                return marker;
            }
        }
        return null;
    }

    public List<Marker> getMarkers() {
        return this.f25591g;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int getMaskAndMatteCount() {
        return this.f25599p;
    }

    public PerformanceTracker getPerformanceTracker() {
        return this.f25585a;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public List<Layer> getPrecomps(String str) {
        return this.f25587c.get(str);
    }

    public float getProgressForFrame(float f6) {
        float f10 = this.f25596l;
        return (f6 - f10) / (this.m - f10);
    }

    public float getStartFrame() {
        return this.f25596l;
    }

    public int getUnscaledHeight() {
        return this.f25601r;
    }

    public int getUnscaledWidth() {
        return this.f25600q;
    }

    public ArrayList<String> getWarnings() {
        HashSet<String> hashSet = this.f25586b;
        return new ArrayList<>(Arrays.asList((String[]) hashSet.toArray(new String[hashSet.size()])));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean hasDashPattern() {
        return this.f25598o;
    }

    public boolean hasImages() {
        return !this.f25588d.isEmpty();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void incrementMatteOrMaskCount(int i10) {
        this.f25599p += i10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void init(Rect rect, float f6, float f10, float f11, List<Layer> list, LongSparseArray<Layer> longSparseArray, Map<String, List<Layer>> map, Map<String, LottieImageAsset> map2, float f12, SparseArrayCompat<FontCharacter> sparseArrayCompat, Map<String, Font> map3, List<Marker> list2, int i10, int i11) {
        this.f25595k = rect;
        this.f25596l = f6;
        this.m = f10;
        this.f25597n = f11;
        this.f25594j = list;
        this.f25593i = longSparseArray;
        this.f25587c = map;
        this.f25588d = map2;
        this.f25589e = f12;
        this.f25592h = sparseArrayCompat;
        this.f25590f = map3;
        this.f25591g = list2;
        this.f25600q = i10;
        this.f25601r = i11;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Layer layerModelForId(long j10) {
        return this.f25593i.get(j10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setHasDashPattern(boolean z10) {
        this.f25598o = z10;
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.f25585a.f25664a = z10;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator<Layer> it = this.f25594j.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString("\t"));
        }
        return sb2.toString();
    }
}
