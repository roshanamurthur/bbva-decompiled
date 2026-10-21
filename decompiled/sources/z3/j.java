package z3;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.animation.keyframe.PathKeyframe;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.Keyframe;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: KeyframesParser.java */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.Options f94965a = JsonReader.Options.of("k");

    public static ArrayList a(JsonReader jsonReader, LottieComposition lottieComposition, float f6, t tVar, boolean z10) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonReader.Token.STRING) {
            lottieComposition.addWarning("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(f94965a) != 0) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonReader.Token.NUMBER) {
                    arrayList.add(i.b(jsonReader, lottieComposition, f6, tVar, false, z10));
                } else {
                    while (jsonReader.hasNext()) {
                        arrayList.add(i.b(jsonReader, lottieComposition, f6, tVar, true, z10));
                    }
                }
                jsonReader.endArray();
            } else {
                arrayList.add(i.b(jsonReader, lottieComposition, f6, tVar, false, z10));
            }
        }
        jsonReader.endObject();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i10;
        T t10;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            Keyframe keyframe = (Keyframe) arrayList.get(i11);
            i11++;
            Keyframe keyframe2 = (Keyframe) arrayList.get(i11);
            keyframe.endFrame = Float.valueOf(keyframe2.startFrame);
            if (keyframe.endValue == 0 && (t10 = keyframe2.startValue) != 0) {
                keyframe.endValue = t10;
                if (keyframe instanceof PathKeyframe) {
                    ((PathKeyframe) keyframe).createPath();
                }
            }
        }
        Keyframe keyframe3 = (Keyframe) arrayList.get(i10);
        if ((keyframe3.startValue == 0 || keyframe3.endValue == 0) && arrayList.size() > 1) {
            arrayList.remove(keyframe3);
        }
    }
}
