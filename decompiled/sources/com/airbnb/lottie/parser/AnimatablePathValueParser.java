package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.animation.keyframe.PathKeyframe;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatablePathValue;
import com.airbnb.lottie.model.animatable.AnimatableSplitDimensionPathValue;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;
import java.io.IOException;
import java.util.ArrayList;
import z3.h;
import z3.i;
import z3.j;

/* JADX INFO: loaded from: classes2.dex */
public class AnimatablePathValueParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.Options f26142a = JsonReader.Options.of("k", "x", "y");

    public static AnimatableValue<PointF, PointF> a(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        jsonReader.beginObject();
        AnimatablePathValue animatablePathValue = null;
        AnimatableFloatValue animatableFloatValue = null;
        boolean z10 = false;
        AnimatableFloatValue animatableFloatValue2 = null;
        while (jsonReader.peek() != JsonReader.Token.END_OBJECT) {
            int iSelectName = jsonReader.selectName(f26142a);
            if (iSelectName == 0) {
                animatablePathValue = parse(jsonReader, lottieComposition);
            } else if (iSelectName != 1) {
                if (iSelectName != 2) {
                    jsonReader.skipName();
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonReader.Token.STRING) {
                    jsonReader.skipValue();
                    z10 = true;
                } else {
                    animatableFloatValue = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                }
            } else if (jsonReader.peek() == JsonReader.Token.STRING) {
                jsonReader.skipValue();
                z10 = true;
            } else {
                animatableFloatValue2 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
            }
        }
        jsonReader.endObject();
        if (z10) {
            lottieComposition.addWarning("Lottie doesn't support expressions.");
        }
        return animatablePathValue != null ? animatablePathValue : new AnimatableSplitDimensionPathValue(animatableFloatValue2, animatableFloatValue);
    }

    public static AnimatablePathValue parse(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(new PathKeyframe(lottieComposition, i.b(jsonReader, lottieComposition, Utils.dpScale(), PathParser.INSTANCE, jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT, false)));
            }
            jsonReader.endArray();
            j.b(arrayList);
        } else {
            arrayList.add(new Keyframe(h.b(jsonReader, Utils.dpScale())));
        }
        return new AnimatablePathValue(arrayList);
    }
}
