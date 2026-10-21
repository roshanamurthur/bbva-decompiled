package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatableTextProperties;
import com.airbnb.lottie.model.animatable.AnimatableTextRangeSelector;
import com.airbnb.lottie.model.animatable.AnimatableTextStyle;
import com.airbnb.lottie.model.content.TextRangeUnits;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.Keyframe;
import com.bbva.tohu.android.product.valkyria.sdk.constants.SqlContracts;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public class AnimatableTextPropertiesParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.Options f26143a = JsonReader.Options.of("s", "a");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JsonReader.Options f26144b = JsonReader.Options.of("s", "e", "o", "r");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final JsonReader.Options f26145c = JsonReader.Options.of("fc", SqlContracts.TokenEntry.SC, "sw", "t", "o");

    public static AnimatableTextProperties parse(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        jsonReader.beginObject();
        AnimatableTextStyle animatableTextStyle = null;
        AnimatableTextRangeSelector animatableTextRangeSelector = null;
        while (jsonReader.hasNext()) {
            int iSelectName = jsonReader.selectName(f26143a);
            if (iSelectName == 0) {
                jsonReader.beginObject();
                AnimatableIntegerValue animatableIntegerValue = null;
                AnimatableIntegerValue animatableIntegerValueB = null;
                AnimatableIntegerValue animatableIntegerValueB2 = null;
                TextRangeUnits textRangeUnits = null;
                while (jsonReader.hasNext()) {
                    int iSelectName2 = jsonReader.selectName(f26144b);
                    if (iSelectName2 == 0) {
                        animatableIntegerValue = AnimatableValueParser.b(jsonReader, lottieComposition);
                    } else if (iSelectName2 == 1) {
                        animatableIntegerValueB = AnimatableValueParser.b(jsonReader, lottieComposition);
                    } else if (iSelectName2 == 2) {
                        animatableIntegerValueB2 = AnimatableValueParser.b(jsonReader, lottieComposition);
                    } else if (iSelectName2 != 3) {
                        jsonReader.skipName();
                        jsonReader.skipValue();
                    } else {
                        int iNextInt = jsonReader.nextInt();
                        if (iNextInt == 1 || iNextInt == 2) {
                            textRangeUnits = iNextInt == 1 ? TextRangeUnits.PERCENT : TextRangeUnits.INDEX;
                        } else {
                            lottieComposition.addWarning("Unsupported text range units: " + iNextInt);
                            textRangeUnits = TextRangeUnits.INDEX;
                        }
                    }
                }
                jsonReader.endObject();
                if (animatableIntegerValue == null && animatableIntegerValueB != null) {
                    animatableIntegerValue = new AnimatableIntegerValue(Collections.singletonList(new Keyframe(0)));
                }
                animatableTextRangeSelector = new AnimatableTextRangeSelector(animatableIntegerValue, animatableIntegerValueB, animatableIntegerValueB2, textRangeUnits);
            } else if (iSelectName != 1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                jsonReader.beginObject();
                AnimatableColorValue animatableColorValueA = null;
                AnimatableColorValue animatableColorValueA2 = null;
                AnimatableFloatValue animatableFloatValue = null;
                AnimatableFloatValue animatableFloatValue2 = null;
                AnimatableIntegerValue animatableIntegerValueB3 = null;
                while (jsonReader.hasNext()) {
                    int iSelectName3 = jsonReader.selectName(f26145c);
                    if (iSelectName3 == 0) {
                        animatableColorValueA = AnimatableValueParser.a(jsonReader, lottieComposition);
                    } else if (iSelectName3 == 1) {
                        animatableColorValueA2 = AnimatableValueParser.a(jsonReader, lottieComposition);
                    } else if (iSelectName3 == 2) {
                        animatableFloatValue = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                    } else if (iSelectName3 == 3) {
                        animatableFloatValue2 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                    } else if (iSelectName3 != 4) {
                        jsonReader.skipName();
                        jsonReader.skipValue();
                    } else {
                        animatableIntegerValueB3 = AnimatableValueParser.b(jsonReader, lottieComposition);
                    }
                }
                jsonReader.endObject();
                animatableTextStyle = new AnimatableTextStyle(animatableColorValueA, animatableColorValueA2, animatableFloatValue, animatableFloatValue2, animatableIntegerValueB3);
            }
        }
        jsonReader.endObject();
        return new AnimatableTextProperties(animatableTextStyle, animatableTextRangeSelector);
    }
}
