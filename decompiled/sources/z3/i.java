package z3;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.collection.SparseArrayCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: KeyframeParser.java */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static SparseArrayCompat<WeakReference<Interpolator>> f94962b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f94961a = new LinearInterpolator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final JsonReader.Options f94963c = JsonReader.Options.of("t", "s", "e", "o", "i", "h", TypedValues.TransitionType.S_TO, "ti");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final JsonReader.Options f94964d = JsonReader.Options.of("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        WeakReference<Interpolator> weakReference;
        Interpolator interpolatorCreate;
        pointF.x = MiscUtils.clamp(pointF.x, -1.0f, 1.0f);
        pointF.y = MiscUtils.clamp(pointF.y, -100.0f, 100.0f);
        pointF2.x = MiscUtils.clamp(pointF2.x, -1.0f, 1.0f);
        float fClamp = MiscUtils.clamp(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fClamp;
        int iHashFor = Utils.hashFor(pointF.x, pointF.y, pointF2.x, fClamp);
        if (L.getDisablePathInterpolatorCache()) {
            weakReference = null;
        } else {
            synchronized (i.class) {
                if (f94962b == null) {
                    f94962b = new SparseArrayCompat<>();
                }
                weakReference = f94962b.get(iHashFor);
            }
        }
        Interpolator interpolator = weakReference != null ? weakReference.get() : null;
        if (weakReference == null || interpolator == null) {
            try {
                interpolatorCreate = PathInterpolatorCompat.create(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e5) {
                interpolatorCreate = "The Path cannot loop back on itself.".equals(e5.getMessage()) ? PathInterpolatorCompat.create(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
            }
            interpolator = interpolatorCreate;
            if (!L.getDisablePathInterpolatorCache()) {
                try {
                    c(iHashFor, new WeakReference(interpolator));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return interpolator;
    }

    /* JADX WARN: Code duplicated, block: B:98:0x021d  */
    public static <T> Keyframe<T> b(JsonReader jsonReader, LottieComposition lottieComposition, float f6, t<T> tVar, boolean z10, boolean z11) throws IOException {
        T t10;
        Interpolator interpolatorA;
        Interpolator interpolatorA2;
        Interpolator interpolatorA3;
        T t11;
        Keyframe<T> keyframe;
        LinearInterpolator linearInterpolator;
        JsonReader.Options options;
        PointF pointF;
        PointF pointF2;
        T t12;
        PointF pointF3;
        LinearInterpolator linearInterpolator2 = f94961a;
        JsonReader.Options options2 = f94963c;
        if (!z10 || !z11) {
            JsonReader.Options options3 = options2;
            if (!z10) {
                return new Keyframe<>(tVar.parse(jsonReader, f6));
            }
            jsonReader.beginObject();
            T t13 = null;
            PointF pointFB = null;
            boolean z12 = false;
            float fNextDouble = 0.0f;
            PointF pointFB2 = null;
            PointF pointFB3 = null;
            PointF pointFB4 = null;
            T t14 = null;
            while (jsonReader.hasNext()) {
                JsonReader.Options options4 = options3;
                switch (jsonReader.selectName(options4)) {
                    case 0:
                        fNextDouble = (float) jsonReader.nextDouble();
                        break;
                    case 1:
                        t13 = tVar.parse(jsonReader, f6);
                        break;
                    case 2:
                        t14 = tVar.parse(jsonReader, f6);
                        break;
                    case 3:
                        pointFB2 = h.b(jsonReader, 1.0f);
                        break;
                    case 4:
                        pointFB = h.b(jsonReader, 1.0f);
                        break;
                    case 5:
                        z12 = jsonReader.nextInt() == 1;
                        break;
                    case 6:
                        pointFB3 = h.b(jsonReader, f6);
                        break;
                    case 7:
                        pointFB4 = h.b(jsonReader, f6);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
                options3 = options4;
            }
            jsonReader.endObject();
            if (!z12) {
                if (pointFB2 == null || pointFB == null) {
                    t10 = t14;
                } else {
                    interpolatorA = a(pointFB2, pointFB);
                    t10 = t14;
                }
                Keyframe<T> keyframe2 = new Keyframe<>(lottieComposition, t13, t10, interpolatorA, fNextDouble, null);
                keyframe2.pathCp1 = pointFB3;
                keyframe2.pathCp2 = pointFB4;
                return keyframe2;
            }
            t10 = t13;
            interpolatorA = linearInterpolator2;
            Keyframe<T> keyframe3 = new Keyframe<>(lottieComposition, t13, t10, interpolatorA, fNextDouble, null);
            keyframe3.pathCp1 = pointFB3;
            keyframe3.pathCp2 = pointFB4;
            return keyframe3;
        }
        jsonReader.beginObject();
        PointF pointF4 = null;
        PointF pointFB5 = null;
        PointF pointFB6 = null;
        boolean z13 = false;
        PointF pointFB7 = null;
        PointF pointFB8 = null;
        PointF pointF5 = null;
        T t15 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        float fNextDouble2 = 0.0f;
        T t16 = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(options2);
            JsonReader.Options options5 = f94964d;
            switch (iSelectName) {
                case 0:
                    linearInterpolator = linearInterpolator2;
                    options = options2;
                    pointF = pointFB6;
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    linearInterpolator2 = linearInterpolator;
                    options2 = options;
                    pointFB6 = pointF;
                    break;
                case 1:
                    pointF = pointFB6;
                    t15 = tVar.parse(jsonReader, f6);
                    pointFB6 = pointF;
                    break;
                case 2:
                    pointF = pointFB6;
                    t16 = tVar.parse(jsonReader, f6);
                    pointFB6 = pointF;
                    break;
                case 3:
                    linearInterpolator = linearInterpolator2;
                    options = options2;
                    PointF pointF8 = pointFB5;
                    pointF = pointFB6;
                    T t17 = t15;
                    PointF pointF9 = pointF6;
                    if (jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble3 = 0.0f;
                        float fNextDouble4 = 0.0f;
                        float fNextDouble5 = 0.0f;
                        float fNextDouble6 = 0.0f;
                        while (jsonReader.hasNext()) {
                            int iSelectName2 = jsonReader.selectName(options5);
                            if (iSelectName2 == 0) {
                                JsonReader.Token tokenPeek = jsonReader.peek();
                                JsonReader.Token token = JsonReader.Token.NUMBER;
                                if (tokenPeek == token) {
                                    fNextDouble5 = (float) jsonReader.nextDouble();
                                    fNextDouble3 = fNextDouble5;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble3 = (float) jsonReader.nextDouble();
                                    fNextDouble5 = jsonReader.peek() == token ? (float) jsonReader.nextDouble() : fNextDouble3;
                                    jsonReader.endArray();
                                }
                            } else if (iSelectName2 != 1) {
                                jsonReader.skipValue();
                            } else {
                                JsonReader.Token tokenPeek2 = jsonReader.peek();
                                JsonReader.Token token2 = JsonReader.Token.NUMBER;
                                if (tokenPeek2 == token2) {
                                    fNextDouble6 = (float) jsonReader.nextDouble();
                                    fNextDouble4 = fNextDouble6;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble4 = (float) jsonReader.nextDouble();
                                    fNextDouble6 = jsonReader.peek() == token2 ? (float) jsonReader.nextDouble() : fNextDouble4;
                                    jsonReader.endArray();
                                }
                            }
                        }
                        pointF5 = new PointF(fNextDouble3, fNextDouble4);
                        pointF6 = new PointF(fNextDouble5, fNextDouble6);
                        jsonReader.endObject();
                        pointFB5 = pointF8;
                        t15 = t17;
                    } else {
                        pointFB7 = h.b(jsonReader, f6);
                        pointFB5 = pointF8;
                        t15 = t17;
                        pointF6 = pointF9;
                    }
                    linearInterpolator2 = linearInterpolator;
                    options2 = options;
                    pointFB6 = pointF;
                    break;
                case 4:
                    linearInterpolator = linearInterpolator2;
                    options = options2;
                    if (jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble7 = 0.0f;
                        float fNextDouble8 = 0.0f;
                        float fNextDouble9 = 0.0f;
                        float fNextDouble10 = 0.0f;
                        while (jsonReader.hasNext()) {
                            PointF pointF10 = pointFB6;
                            int iSelectName3 = jsonReader.selectName(options5);
                            if (iSelectName3 != 0) {
                                pointF2 = pointFB5;
                                if (iSelectName3 != 1) {
                                    jsonReader.skipValue();
                                    pointFB5 = pointF2;
                                } else {
                                    JsonReader.Token tokenPeek3 = jsonReader.peek();
                                    JsonReader.Token token3 = JsonReader.Token.NUMBER;
                                    if (tokenPeek3 == token3) {
                                        fNextDouble10 = (float) jsonReader.nextDouble();
                                        pointFB5 = pointF2;
                                        fNextDouble8 = fNextDouble10;
                                    } else {
                                        jsonReader.beginArray();
                                        t12 = t15;
                                        pointF3 = pointF6;
                                        fNextDouble8 = (float) jsonReader.nextDouble();
                                        fNextDouble10 = jsonReader.peek() == token3 ? (float) jsonReader.nextDouble() : fNextDouble8;
                                        jsonReader.endArray();
                                    }
                                }
                                pointFB6 = pointF10;
                            } else {
                                pointF2 = pointFB5;
                                t12 = t15;
                                pointF3 = pointF6;
                                JsonReader.Token tokenPeek4 = jsonReader.peek();
                                JsonReader.Token token4 = JsonReader.Token.NUMBER;
                                if (tokenPeek4 == token4) {
                                    fNextDouble9 = (float) jsonReader.nextDouble();
                                    pointFB5 = pointF2;
                                    t15 = t12;
                                    fNextDouble7 = fNextDouble9;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble7 = (float) jsonReader.nextDouble();
                                    fNextDouble9 = jsonReader.peek() == token4 ? (float) jsonReader.nextDouble() : fNextDouble7;
                                    jsonReader.endArray();
                                }
                                pointF6 = pointF3;
                                pointFB6 = pointF10;
                            }
                            pointFB5 = pointF2;
                            t15 = t12;
                            pointF6 = pointF3;
                            pointFB6 = pointF10;
                        }
                        pointF = pointFB6;
                        PointF pointF11 = new PointF(fNextDouble7, fNextDouble8);
                        PointF pointF12 = new PointF(fNextDouble9, fNextDouble10);
                        jsonReader.endObject();
                        pointF4 = pointF12;
                        pointF7 = pointF11;
                    } else {
                        pointF = pointFB6;
                        pointFB8 = h.b(jsonReader, f6);
                    }
                    linearInterpolator2 = linearInterpolator;
                    options2 = options;
                    pointFB6 = pointF;
                    break;
                case 5:
                    z13 = jsonReader.nextInt() == 1;
                    break;
                case 6:
                    pointFB5 = h.b(jsonReader, f6);
                    break;
                case 7:
                    pointFB6 = h.b(jsonReader, f6);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        Interpolator interpolatorA4 = linearInterpolator2;
        PointF pointF13 = pointFB5;
        PointF pointF14 = pointFB6;
        T t18 = t15;
        PointF pointF15 = pointF6;
        jsonReader.endObject();
        if (z13) {
            t11 = t18;
        } else {
            if (pointFB7 == null || pointFB8 == null) {
                if (pointF5 != null && pointF15 != null && pointF7 != null && pointF4 != null) {
                    interpolatorA2 = a(pointF5, pointF7);
                    interpolatorA3 = a(pointF15, pointF4);
                    t11 = t16;
                    interpolatorA4 = null;
                }
                if (interpolatorA2 != null || interpolatorA3 == null) {
                    keyframe = new Keyframe<>(lottieComposition, t18, t11, interpolatorA4, fNextDouble2, null);
                } else {
                    keyframe = new Keyframe<>(lottieComposition, t18, t11, interpolatorA2, interpolatorA3, fNextDouble2, null);
                }
                keyframe.pathCp1 = pointF13;
                keyframe.pathCp2 = pointF14;
                return keyframe;
            }
            interpolatorA4 = a(pointFB7, pointFB8);
            t11 = t16;
        }
        interpolatorA2 = null;
        interpolatorA3 = null;
        if (interpolatorA2 != null) {
            keyframe = new Keyframe<>(lottieComposition, t18, t11, interpolatorA4, fNextDouble2, null);
        } else {
            keyframe = new Keyframe<>(lottieComposition, t18, t11, interpolatorA4, fNextDouble2, null);
        }
        keyframe.pathCp1 = pointF13;
        keyframe.pathCp2 = pointF14;
        return keyframe;
    }

    public static void c(int i10, WeakReference<Interpolator> weakReference) {
        synchronized (i.class) {
            f94962b.put(i10, weakReference);
        }
    }
}
