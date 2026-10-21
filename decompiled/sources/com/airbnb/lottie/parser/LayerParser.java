package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.Rect;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatableShapeValue;
import com.airbnb.lottie.model.animatable.AnimatableTextFrame;
import com.airbnb.lottie.model.animatable.AnimatableTextProperties;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.content.BlurEffect;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;
import com.bbva.tohu.android.product.valkyria.sdk.constants.SqlContracts;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import z3.c;
import z3.j;

/* JADX INFO: loaded from: classes2.dex */
public class LayerParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.Options f26162a = JsonReader.Options.of("nm", "ind", "refId", "ty", "parent", "sw", "sh", SqlContracts.TokenEntry.SC, "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", DynamicLink.SocialMetaTagParameters.KEY_SOCIAL_TITLE, "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JsonReader.Options f26163b = JsonReader.Options.of("d", "a");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final JsonReader.Options f26164c = JsonReader.Options.of("ty", "nm");

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26165a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f26165a = iArr;
            try {
                iArr[Layer.MatteType.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26165a[Layer.MatteType.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static Layer parse(LottieComposition lottieComposition) {
        Rect bounds = lottieComposition.getBounds();
        return new Layer(Collections.emptyList(), lottieComposition, "__container", -1L, Layer.LayerType.PRE_COMP, -1L, null, Collections.emptyList(), new AnimatableTransform(), 0, 0, 0, 0.0f, 0.0f, bounds.width(), bounds.height(), null, null, Collections.emptyList(), Layer.MatteType.NONE, null, false, null, null, LBlendMode.NORMAL);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r10v48 */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r10v52 */
    /* JADX WARN: Type inference failed for: r10v53 */
    /* JADX WARN: Type inference failed for: r10v56 */
    /* JADX WARN: Type inference failed for: r10v57 */
    /* JADX WARN: Type inference failed for: r10v60 */
    /* JADX WARN: Type inference failed for: r10v61 */
    /* JADX WARN: Type inference failed for: r10v62 */
    /* JADX WARN: Type inference failed for: r10v68 */
    /* JADX WARN: Type inference failed for: r10v69 */
    /* JADX WARN: Type inference failed for: r10v70 */
    /* JADX WARN: Type inference failed for: r10v71 */
    /* JADX WARN: Type inference failed for: r10v72 */
    /* JADX WARN: Type inference failed for: r10v73 */
    public static Layer parse(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        AnimatableTransform animatableTransform;
        boolean z10;
        boolean z11;
        AnimatableFloatValue animatableFloatValue;
        AnimatableFloatValue animatableFloatValue2;
        AnimatableFloatValue animatableFloatValue3;
        AnimatableFloatValue animatableFloatValue4;
        ?? r10;
        Layer.MatteType matteType = Layer.MatteType.NONE;
        LBlendMode lBlendMode = LBlendMode.NORMAL;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        boolean z12 = false;
        Layer.MatteType matteType2 = matteType;
        LBlendMode lBlendMode2 = lBlendMode;
        float fNextDouble = 1.0f;
        boolean z13 = false;
        int iDpScale = 0;
        int iDpScale2 = 0;
        int color = 0;
        boolean zNextBoolean = false;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        float endFrame = 0.0f;
        long jNextInt = -1;
        Layer.LayerType layerType = null;
        String strNextString = null;
        AnimatableTextFrame animatableTextFrame = null;
        AnimatableTextProperties animatableTextProperties = null;
        AnimatableFloatValue animatableFloatValue5 = null;
        BlurEffect blurEffect = null;
        DropShadowEffect dropShadowEffect = null;
        AnimatableTransform animatableTransform2 = null;
        float fNextDouble5 = 0.0f;
        long jNextInt2 = 0;
        String strNextString2 = "UNSET";
        String strNextString3 = null;
        while (jsonReader.hasNext()) {
            int i10 = 1;
            switch (jsonReader.selectName(f26162a)) {
                case 0:
                    z10 = z13;
                    strNextString2 = jsonReader.nextString();
                    z13 = z10;
                    break;
                case 1:
                    z10 = z13;
                    jNextInt2 = jsonReader.nextInt();
                    z13 = z10;
                    break;
                case 2:
                    z10 = z13;
                    strNextString = jsonReader.nextString();
                    z13 = z10;
                    break;
                case 3:
                    z10 = z13;
                    z11 = z12;
                    int iNextInt = jsonReader.nextInt();
                    layerType = Layer.LayerType.UNKNOWN;
                    if (iNextInt < layerType.ordinal()) {
                        layerType = Layer.LayerType.values()[iNextInt];
                    }
                    z12 = z11;
                    z13 = z10;
                    break;
                case 4:
                    z10 = z13;
                    jNextInt = jsonReader.nextInt();
                    z13 = z10;
                    break;
                case 5:
                    z10 = z13;
                    iDpScale = (int) (Utils.dpScale() * jsonReader.nextInt());
                    z13 = z10;
                    break;
                case 6:
                    z10 = z13;
                    iDpScale2 = (int) (Utils.dpScale() * jsonReader.nextInt());
                    z13 = z10;
                    break;
                case 7:
                    z10 = z13;
                    color = Color.parseColor(jsonReader.nextString());
                    z13 = z10;
                    break;
                case 8:
                    z10 = z13;
                    animatableTransform2 = AnimatableTransformParser.parse(jsonReader, lottieComposition);
                    z13 = z10;
                    break;
                case 9:
                    z10 = z13;
                    z11 = z12;
                    int iNextInt2 = jsonReader.nextInt();
                    if (iNextInt2 >= Layer.MatteType.values().length) {
                        lottieComposition.addWarning("Unsupported matte type: " + iNextInt2);
                    } else {
                        matteType2 = Layer.MatteType.values()[iNextInt2];
                        int i11 = a.f26165a[matteType2.ordinal()];
                        if (i11 == 1) {
                            lottieComposition.addWarning("Unsupported matte type: Luma");
                        } else if (i11 == 2) {
                            lottieComposition.addWarning("Unsupported matte type: Luma Inverted");
                        }
                        lottieComposition.incrementMatteOrMaskCount(1);
                    }
                    z12 = z11;
                    z13 = z10;
                    break;
                case 10:
                    ArrayList arrayList3 = arrayList;
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        Mask.MaskMode maskMode = null;
                        AnimatableShapeValue animatableShapeValue = null;
                        AnimatableIntegerValue animatableIntegerValueB = null;
                        boolean zNextBoolean2 = false;
                        while (jsonReader.hasNext()) {
                            String strNextName = jsonReader.nextName();
                            strNextName.getClass();
                            switch (strNextName) {
                                case "o":
                                    animatableIntegerValueB = AnimatableValueParser.b(jsonReader, lottieComposition);
                                    break;
                                case "pt":
                                    animatableShapeValue = new AnimatableShapeValue(j.a(jsonReader, lottieComposition, Utils.dpScale(), ShapeDataParser.INSTANCE, false));
                                    break;
                                case "inv":
                                    zNextBoolean2 = jsonReader.nextBoolean();
                                    break;
                                case "mode":
                                    String strNextString4 = jsonReader.nextString();
                                    strNextString4.getClass();
                                    switch (strNextString4) {
                                        case "a":
                                            maskMode = Mask.MaskMode.MASK_MODE_ADD;
                                            break;
                                        case "i":
                                            lottieComposition.addWarning("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            maskMode = Mask.MaskMode.MASK_MODE_INTERSECT;
                                            break;
                                        case "n":
                                            maskMode = Mask.MaskMode.MASK_MODE_NONE;
                                            break;
                                        case "s":
                                            maskMode = Mask.MaskMode.MASK_MODE_SUBTRACT;
                                            break;
                                        default:
                                            Logger.warning("Unknown mask mode " + strNextName + ". Defaulting to Add.");
                                            maskMode = Mask.MaskMode.MASK_MODE_ADD;
                                            break;
                                    }
                                    break;
                                default:
                                    jsonReader.skipValue();
                                    break;
                            }
                            z13 = z13;
                        }
                        jsonReader.endObject();
                        ArrayList arrayList4 = arrayList3;
                        arrayList4.add(new Mask(maskMode, animatableShapeValue, animatableIntegerValueB, zNextBoolean2));
                        arrayList3 = arrayList4;
                        z13 = z13;
                    }
                    z10 = z13;
                    arrayList = arrayList3;
                    z11 = false;
                    lottieComposition.incrementMatteOrMaskCount(arrayList.size());
                    jsonReader.endArray();
                    z12 = z11;
                    z13 = z10;
                    break;
                case 11:
                    ArrayList arrayList5 = arrayList;
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ContentModel contentModelA = c.a(jsonReader, lottieComposition);
                        if (contentModelA != null) {
                            arrayList2.add(contentModelA);
                        }
                    }
                    jsonReader.endArray();
                    z10 = z13;
                    arrayList = arrayList5;
                    z11 = false;
                    z12 = z11;
                    z13 = z10;
                    break;
                case 12:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        int iSelectName = jsonReader.selectName(f26163b);
                        if (iSelectName == 0) {
                            animatableTextFrame = new AnimatableTextFrame(j.a(jsonReader, lottieComposition, Utils.dpScale(), DocumentDataParser.INSTANCE, false));
                        } else if (iSelectName != 1) {
                            jsonReader.skipName();
                            jsonReader.skipValue();
                        } else {
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                animatableTextProperties = AnimatableTextPropertiesParser.parse(jsonReader, lottieComposition);
                            }
                            while (jsonReader.hasNext()) {
                                jsonReader.skipValue();
                            }
                            jsonReader.endArray();
                        }
                    }
                    jsonReader.endObject();
                    arrayList = arrayList;
                    z12 = false;
                    break;
                case 13:
                    jsonReader.beginArray();
                    ArrayList arrayList6 = new ArrayList();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            int iSelectName2 = jsonReader.selectName(f26164c);
                            if (iSelectName2 == 0) {
                                int iNextInt3 = jsonReader.nextInt();
                                if (iNextInt3 == 29) {
                                    JsonReader.Options options = z3.a.f94947a;
                                    blurEffect = null;
                                    while (jsonReader.hasNext()) {
                                        if (jsonReader.selectName(z3.a.f94947a) != 0) {
                                            jsonReader.skipName();
                                            jsonReader.skipValue();
                                        } else {
                                            jsonReader.beginArray();
                                            while (jsonReader.hasNext()) {
                                                jsonReader.beginObject();
                                                ?? r11 = z12;
                                                BlurEffect blurEffect2 = null;
                                                while (jsonReader.hasNext()) {
                                                    int iSelectName3 = jsonReader.selectName(z3.a.f94948b);
                                                    if (iSelectName3 == 0) {
                                                        r11 = jsonReader.nextInt() == 0 ? i10 : z12;
                                                    } else if (iSelectName3 != i10) {
                                                        jsonReader.skipName();
                                                        jsonReader.skipValue();
                                                    } else if (r11 != 0) {
                                                        blurEffect2 = new BlurEffect(AnimatableValueParser.parseFloat(jsonReader, lottieComposition));
                                                    } else {
                                                        jsonReader.skipValue();
                                                    }
                                                }
                                                jsonReader.endObject();
                                                if (blurEffect2 != null) {
                                                    blurEffect = blurEffect2;
                                                }
                                            }
                                            jsonReader.endArray();
                                        }
                                    }
                                } else if (iNextInt3 == 25) {
                                    DropShadowEffectParser dropShadowEffectParser = new DropShadowEffectParser();
                                    while (jsonReader.hasNext()) {
                                        if (jsonReader.selectName(DropShadowEffectParser.f26154f) != 0) {
                                            jsonReader.skipName();
                                            jsonReader.skipValue();
                                        } else {
                                            jsonReader.beginArray();
                                            while (jsonReader.hasNext()) {
                                                jsonReader.beginObject();
                                                String strNextString5 = "";
                                                while (jsonReader.hasNext()) {
                                                    int iSelectName4 = jsonReader.selectName(DropShadowEffectParser.f26155g);
                                                    if (iSelectName4 != 0) {
                                                        if (iSelectName4 != i10) {
                                                            jsonReader.skipName();
                                                            jsonReader.skipValue();
                                                        } else {
                                                            strNextString5.getClass();
                                                            switch (strNextString5.hashCode()) {
                                                                case 353103893:
                                                                    r10 = !strNextString5.equals("Distance") ? -1 : z12;
                                                                    break;
                                                                case 397447147:
                                                                    r10 = !strNextString5.equals("Opacity") ? -1 : i10;
                                                                    break;
                                                                case 1041377119:
                                                                    r10 = !strNextString5.equals("Direction") ? -1 : 2;
                                                                    break;
                                                                case 1379387491:
                                                                    r10 = !strNextString5.equals("Shadow Color") ? -1 : 3;
                                                                    break;
                                                                case 1383710113:
                                                                    r10 = !strNextString5.equals("Softness") ? -1 : 4;
                                                                    break;
                                                                default:
                                                                    r10 = -1;
                                                                    break;
                                                            }
                                                            switch (r10) {
                                                                case 0:
                                                                    dropShadowEffectParser.f26159d = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                                                                    break;
                                                                case 1:
                                                                    dropShadowEffectParser.f26157b = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, z12);
                                                                    break;
                                                                case 2:
                                                                    dropShadowEffectParser.f26158c = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, z12);
                                                                    break;
                                                                case 3:
                                                                    dropShadowEffectParser.f26156a = AnimatableValueParser.a(jsonReader, lottieComposition);
                                                                    break;
                                                                case 4:
                                                                    dropShadowEffectParser.f26160e = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                                                                    break;
                                                                default:
                                                                    jsonReader.skipValue();
                                                                    break;
                                                            }
                                                        }
                                                    } else {
                                                        strNextString5 = jsonReader.nextString();
                                                    }
                                                }
                                                jsonReader.endObject();
                                            }
                                            jsonReader.endArray();
                                        }
                                    }
                                    AnimatableColorValue animatableColorValue = dropShadowEffectParser.f26156a;
                                    dropShadowEffect = (animatableColorValue == null || (animatableFloatValue = dropShadowEffectParser.f26157b) == null || (animatableFloatValue2 = dropShadowEffectParser.f26158c) == null || (animatableFloatValue3 = dropShadowEffectParser.f26159d) == null || (animatableFloatValue4 = dropShadowEffectParser.f26160e) == null) ? null : new DropShadowEffect(animatableColorValue, animatableFloatValue, animatableFloatValue2, animatableFloatValue3, animatableFloatValue4);
                                }
                            } else if (iSelectName2 != i10) {
                                jsonReader.skipName();
                                jsonReader.skipValue();
                            } else {
                                arrayList6.add(jsonReader.nextString());
                            }
                            i10 = 1;
                            z12 = false;
                        }
                        jsonReader.endObject();
                        i10 = 1;
                        z12 = false;
                    }
                    jsonReader.endArray();
                    lottieComposition.addWarning("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList6);
                    arrayList = arrayList;
                    z12 = false;
                    break;
                case 14:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 15:
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    break;
                case 16:
                    fNextDouble3 = (float) (jsonReader.nextDouble() * ((double) Utils.dpScale()));
                    arrayList = arrayList;
                    break;
                case 17:
                    fNextDouble4 = (float) (jsonReader.nextDouble() * ((double) Utils.dpScale()));
                    arrayList = arrayList;
                    break;
                case 18:
                    fNextDouble5 = (float) jsonReader.nextDouble();
                    break;
                case 19:
                    endFrame = (float) jsonReader.nextDouble();
                    break;
                case 20:
                    animatableFloatValue5 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, z12);
                    break;
                case 21:
                    strNextString3 = jsonReader.nextString();
                    break;
                case 22:
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case 23:
                    z13 = jsonReader.nextInt() != 1 ? z12 : true;
                    break;
                case 24:
                    int iNextInt4 = jsonReader.nextInt();
                    if (iNextInt4 >= LBlendMode.values().length) {
                        lottieComposition.addWarning("Unsupported Blend Mode: " + iNextInt4);
                        lBlendMode2 = LBlendMode.NORMAL;
                    } else {
                        lBlendMode2 = LBlendMode.values()[iNextInt4];
                    }
                    break;
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    z10 = z13;
                    z11 = z12;
                    z12 = z11;
                    z13 = z10;
                    break;
            }
        }
        boolean z14 = z13;
        jsonReader.endObject();
        ArrayList arrayList7 = new ArrayList();
        if (fNextDouble5 > 0.0f) {
            arrayList7.add(new Keyframe(lottieComposition, fValueOf, fValueOf, null, 0.0f, Float.valueOf(fNextDouble5)));
        }
        if (endFrame <= 0.0f) {
            endFrame = lottieComposition.getEndFrame();
        }
        arrayList7.add(new Keyframe(lottieComposition, fValueOf2, fValueOf2, null, fNextDouble5, Float.valueOf(endFrame)));
        arrayList7.add(new Keyframe(lottieComposition, fValueOf, fValueOf, null, endFrame, Float.valueOf(Float.MAX_VALUE)));
        if (strNextString2.endsWith(".ai") || "ai".equals(strNextString3)) {
            lottieComposition.addWarning("Convert your Illustrator layers to shape layers.");
        }
        if (z14 != 0) {
            if (animatableTransform2 == null) {
                animatableTransform2 = new AnimatableTransform();
            }
            AnimatableTransform animatableTransform3 = animatableTransform2;
            animatableTransform3.setAutoOrient(z14);
            animatableTransform = animatableTransform3;
        } else {
            animatableTransform = animatableTransform2;
        }
        return new Layer(arrayList2, lottieComposition, strNextString2, jNextInt2, layerType, jNextInt, strNextString, arrayList, animatableTransform, iDpScale, iDpScale2, color, fNextDouble, fNextDouble2, fNextDouble3, fNextDouble4, animatableTextFrame, animatableTextProperties, arrayList7, matteType2, animatableFloatValue5, zNextBoolean, blurEffect, dropShadowEffect, lBlendMode2);
    }
}
