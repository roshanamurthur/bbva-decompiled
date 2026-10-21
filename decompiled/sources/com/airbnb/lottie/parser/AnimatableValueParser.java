package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Utils;
import java.io.IOException;
import z3.j;

/* JADX INFO: loaded from: classes2.dex */
public class AnimatableValueParser {
    public static AnimatableColorValue a(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        return new AnimatableColorValue(j.a(jsonReader, lottieComposition, 1.0f, ColorParser.INSTANCE, false));
    }

    public static AnimatableIntegerValue b(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        return new AnimatableIntegerValue(j.a(jsonReader, lottieComposition, 1.0f, IntegerParser.INSTANCE, false));
    }

    public static AnimatablePointValue c(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        return new AnimatablePointValue(j.a(jsonReader, lottieComposition, Utils.dpScale(), PointFParser.INSTANCE, true));
    }

    public static AnimatableFloatValue parseFloat(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        return parseFloat(jsonReader, lottieComposition, true);
    }

    public static AnimatableFloatValue parseFloat(JsonReader jsonReader, LottieComposition lottieComposition, boolean z10) throws IOException {
        return new AnimatableFloatValue(j.a(jsonReader, lottieComposition, z10 ? Utils.dpScale() : 1.0f, FloatParser.INSTANCE, false));
    }
}
