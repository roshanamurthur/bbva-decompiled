package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePathValue;
import com.airbnb.lottie.model.animatable.AnimatableScaleValue;
import com.airbnb.lottie.model.animatable.AnimatableSplitDimensionPathValue;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.ScaleXY;
import java.io.IOException;
import z3.j;

/* JADX INFO: loaded from: classes2.dex */
public class AnimatableTransformParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.Options f26146a = JsonReader.Options.of("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JsonReader.Options f26147b = JsonReader.Options.of("k");

    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x0092  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a1  */
    /* JADX WARN: Multi-variable type inference failed */
    public static AnimatableTransform parse(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        AnimatableFloatValue animatableFloatValue;
        boolean z10;
        boolean z11 = false;
        boolean z12 = jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT;
        if (z12) {
            jsonReader.beginObject();
        }
        AnimatableFloatValue animatableFloatValue2 = null;
        AnimatablePathValue animatablePathValue = null;
        AnimatableValue<PointF, PointF> animatableValueA = null;
        AnimatableScaleValue animatableScaleValue = null;
        AnimatableFloatValue animatableFloatValue3 = null;
        AnimatableFloatValue animatableFloatValue4 = null;
        AnimatableIntegerValue animatableIntegerValueB = null;
        AnimatableFloatValue animatableFloatValue5 = null;
        AnimatableFloatValue animatableFloatValue6 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(f26146a)) {
                case 0:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.selectName(f26147b) != 0) {
                            jsonReader.skipName();
                            jsonReader.skipValue();
                        } else {
                            animatablePathValue = AnimatablePathValueParser.parse(jsonReader, lottieComposition);
                        }
                    }
                    jsonReader.endObject();
                    z11 = false;
                    break;
                case 1:
                    animatableValueA = AnimatablePathValueParser.a(jsonReader, lottieComposition);
                    z11 = false;
                    break;
                case 2:
                    animatableScaleValue = new AnimatableScaleValue(j.a(jsonReader, lottieComposition, 1.0f, ScaleXYParser.INSTANCE, z11));
                    z11 = false;
                    break;
                case 3:
                    lottieComposition.addWarning("Lottie doesn't support 3D layers.");
                    animatableFloatValue = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, z11);
                    if (animatableFloatValue.getKeyframes().isEmpty()) {
                        if (((Keyframe) animatableFloatValue.getKeyframes().get(0)).startValue == 0) {
                            z10 = false;
                            animatableFloatValue.getKeyframes().set(0, new Keyframe(lottieComposition, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(lottieComposition.getEndFrame())));
                        }
                        z11 = z10;
                        animatableFloatValue2 = animatableFloatValue;
                    } else {
                        animatableFloatValue.getKeyframes().add(new Keyframe(lottieComposition, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(lottieComposition.getEndFrame())));
                    }
                    z10 = false;
                    z11 = z10;
                    animatableFloatValue2 = animatableFloatValue;
                    break;
                case 4:
                    animatableFloatValue = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, z11);
                    if (animatableFloatValue.getKeyframes().isEmpty()) {
                        if (((Keyframe) animatableFloatValue.getKeyframes().get(0)).startValue == 0) {
                            z10 = false;
                            animatableFloatValue.getKeyframes().set(0, new Keyframe(lottieComposition, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(lottieComposition.getEndFrame())));
                        }
                        z11 = z10;
                        animatableFloatValue2 = animatableFloatValue;
                    } else {
                        animatableFloatValue.getKeyframes().add(new Keyframe(lottieComposition, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(lottieComposition.getEndFrame())));
                    }
                    z10 = false;
                    z11 = z10;
                    animatableFloatValue2 = animatableFloatValue;
                    break;
                case 5:
                    animatableIntegerValueB = AnimatableValueParser.b(jsonReader, lottieComposition);
                    break;
                case 6:
                    animatableFloatValue5 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, z11);
                    break;
                case 7:
                    animatableFloatValue6 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, z11);
                    break;
                case 8:
                    animatableFloatValue3 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, z11);
                    break;
                case 9:
                    animatableFloatValue4 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, z11);
                    break;
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
            }
        }
        if (z12) {
            jsonReader.endObject();
        }
        if (animatablePathValue == null || (animatablePathValue.isStatic() && animatablePathValue.getKeyframes().get(0).startValue.equals(0.0f, 0.0f))) {
            animatablePathValue = null;
        }
        AnimatableValue<PointF, PointF> animatableValue = (animatableValueA == null || (!(animatableValueA instanceof AnimatableSplitDimensionPathValue) && animatableValueA.isStatic() && animatableValueA.getKeyframes().get(0).startValue.equals(0.0f, 0.0f))) ? null : animatableValueA;
        AnimatableFloatValue animatableFloatValue7 = (animatableFloatValue2 == null || (animatableFloatValue2.isStatic() && ((Float) ((Keyframe) animatableFloatValue2.getKeyframes().get(0)).startValue).floatValue() == 0.0f)) ? null : animatableFloatValue2;
        if (animatableScaleValue == null || (animatableScaleValue.isStatic() && ((ScaleXY) ((Keyframe) animatableScaleValue.getKeyframes().get(0)).startValue).equals(1.0f, 1.0f))) {
            animatableScaleValue = null;
        }
        return new AnimatableTransform(animatablePathValue, animatableValue, animatableScaleValue, animatableFloatValue7, animatableIntegerValueB, animatableFloatValue5, animatableFloatValue6, (animatableFloatValue3 == null || (animatableFloatValue3.isStatic() && ((Float) ((Keyframe) animatableFloatValue3.getKeyframes().get(0)).startValue).floatValue() == 0.0f)) ? null : animatableFloatValue3, (animatableFloatValue4 == null || (animatableFloatValue4.isStatic() && ((Float) ((Keyframe) animatableFloatValue4.getKeyframes().get(0)).startValue).floatValue() == 0.0f)) ? null : animatableFloatValue4);
    }
}
