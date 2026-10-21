package z3;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableGradientColorValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.animatable.AnimatableShapeValue;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.content.CircleShape;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.content.GradientFill;
import com.airbnb.lottie.model.content.GradientStroke;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.RectangleShape;
import com.airbnb.lottie.model.content.Repeater;
import com.airbnb.lottie.model.content.RoundedCorners;
import com.airbnb.lottie.model.content.ShapeFill;
import com.airbnb.lottie.model.content.ShapeGroup;
import com.airbnb.lottie.model.content.ShapePath;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.parser.AnimatablePathValueParser;
import com.airbnb.lottie.parser.AnimatableTransformParser;
import com.airbnb.lottie.parser.AnimatableValueParser;
import com.airbnb.lottie.parser.GradientColorParser;
import com.airbnb.lottie.parser.RoundedCornersParser;
import com.airbnb.lottie.parser.ShapeDataParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: ContentModelParser.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.Options f94950a = JsonReader.Options.of("ty", "d");

    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    @Nullable
    public static ContentModel a(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        String strNextString;
        byte b10;
        ContentModel circleShape;
        ContentModel shapeGroup;
        jsonReader.beginObject();
        int iNextInt = 2;
        while (true) {
            if (!jsonReader.hasNext()) {
                strNextString = null;
                break;
            }
            int iSelectName = jsonReader.selectName(f94950a);
            if (iSelectName == 0) {
                strNextString = jsonReader.nextString();
                break;
            }
            if (iSelectName != 1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                iNextInt = jsonReader.nextInt();
            }
        }
        if (strNextString == null) {
            return null;
        }
        int iHashCode = strNextString.hashCode();
        boolean zNextBoolean = false;
        if (iHashCode != 3239) {
            if (iHashCode != 3270) {
                if (iHashCode != 3295) {
                    if (iHashCode != 3488) {
                        if (iHashCode != 3646) {
                            if (iHashCode != 3669) {
                                if (iHashCode != 3679) {
                                    if (iHashCode != 3681) {
                                        if (iHashCode != 3705) {
                                            if (iHashCode != 3710) {
                                                if (iHashCode != 3307) {
                                                    if (iHashCode != 3308) {
                                                        if (iHashCode != 3633) {
                                                            if (iHashCode == 3634 && strNextString.equals("rd")) {
                                                                b10 = 7;
                                                            } else {
                                                                b10 = -1;
                                                            }
                                                        } else if (strNextString.equals("rc")) {
                                                            b10 = 6;
                                                        } else {
                                                            b10 = -1;
                                                        }
                                                    } else if (strNextString.equals("gs")) {
                                                        b10 = 4;
                                                    } else {
                                                        b10 = -1;
                                                    }
                                                } else if (strNextString.equals("gr")) {
                                                    b10 = 3;
                                                } else {
                                                    b10 = -1;
                                                }
                                            } else if (strNextString.equals("tr")) {
                                                b10 = 13;
                                            } else {
                                                b10 = -1;
                                            }
                                        } else if (strNextString.equals("tm")) {
                                            b10 = 12;
                                        } else {
                                            b10 = -1;
                                        }
                                    } else if (strNextString.equals(DynamicLink.SocialMetaTagParameters.KEY_SOCIAL_TITLE)) {
                                        b10 = 11;
                                    } else {
                                        b10 = -1;
                                    }
                                } else if (strNextString.equals("sr")) {
                                    b10 = 10;
                                } else {
                                    b10 = -1;
                                }
                            } else if (strNextString.equals("sh")) {
                                b10 = 9;
                            } else {
                                b10 = -1;
                            }
                        } else if (strNextString.equals("rp")) {
                            b10 = 8;
                        } else {
                            b10 = -1;
                        }
                    } else if (strNextString.equals("mm")) {
                        b10 = 5;
                    } else {
                        b10 = -1;
                    }
                } else if (strNextString.equals("gf")) {
                    b10 = 2;
                } else {
                    b10 = -1;
                }
            } else if (strNextString.equals("fl")) {
                b10 = 1;
            } else {
                b10 = -1;
            }
        } else if (strNextString.equals("el")) {
            b10 = 0;
        } else {
            b10 = -1;
        }
        switch (b10) {
            case 0:
                JsonReader.Options options = b.f94949a;
                boolean z10 = iNextInt == 3;
                boolean zNextBoolean2 = false;
                String strNextString2 = null;
                AnimatableValue<PointF, PointF> animatableValueA = null;
                AnimatablePointValue animatablePointValueC = null;
                while (jsonReader.hasNext()) {
                    int iSelectName2 = jsonReader.selectName(b.f94949a);
                    if (iSelectName2 == 0) {
                        strNextString2 = jsonReader.nextString();
                    } else if (iSelectName2 == 1) {
                        animatableValueA = AnimatablePathValueParser.a(jsonReader, lottieComposition);
                    } else if (iSelectName2 == 2) {
                        animatablePointValueC = AnimatableValueParser.c(jsonReader, lottieComposition);
                    } else if (iSelectName2 == 3) {
                        zNextBoolean2 = jsonReader.nextBoolean();
                    } else if (iSelectName2 != 4) {
                        jsonReader.skipName();
                        jsonReader.skipValue();
                    } else {
                        z10 = jsonReader.nextInt() == 3;
                    }
                }
                circleShape = new CircleShape(strNextString2, animatableValueA, animatablePointValueC, z10, zNextBoolean2);
                break;
            case 1:
                JsonReader.Options options2 = o.f94970a;
                int iNextInt2 = 1;
                boolean zNextBoolean3 = false;
                boolean zNextBoolean4 = false;
                AnimatableIntegerValue animatableIntegerValue = null;
                String strNextString3 = null;
                AnimatableColorValue animatableColorValueA = null;
                while (jsonReader.hasNext()) {
                    int iSelectName3 = jsonReader.selectName(o.f94970a);
                    if (iSelectName3 == 0) {
                        strNextString3 = jsonReader.nextString();
                    } else if (iSelectName3 == 1) {
                        animatableColorValueA = AnimatableValueParser.a(jsonReader, lottieComposition);
                    } else if (iSelectName3 == 2) {
                        animatableIntegerValue = AnimatableValueParser.b(jsonReader, lottieComposition);
                    } else if (iSelectName3 == 3) {
                        zNextBoolean3 = jsonReader.nextBoolean();
                    } else if (iSelectName3 == 4) {
                        iNextInt2 = jsonReader.nextInt();
                    } else if (iSelectName3 != 5) {
                        jsonReader.skipName();
                        jsonReader.skipValue();
                    } else {
                        zNextBoolean4 = jsonReader.nextBoolean();
                    }
                }
                if (animatableIntegerValue == null) {
                    animatableIntegerValue = new AnimatableIntegerValue(Collections.singletonList(new Keyframe(100)));
                }
                circleShape = new ShapeFill(strNextString3, zNextBoolean3, iNextInt2 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, animatableColorValueA, animatableIntegerValue, zNextBoolean4);
                break;
            case 2:
                JsonReader.Options options3 = f.f94954a;
                Path.FillType fillType = Path.FillType.WINDING;
                boolean zNextBoolean5 = false;
                AnimatableIntegerValue animatableIntegerValueB = null;
                String strNextString4 = null;
                GradientType gradientType = null;
                AnimatableGradientColorValue animatableGradientColorValue = null;
                AnimatablePointValue animatablePointValueC2 = null;
                AnimatablePointValue animatablePointValueC3 = null;
                while (jsonReader.hasNext()) {
                    switch (jsonReader.selectName(f.f94954a)) {
                        case 0:
                            strNextString4 = jsonReader.nextString();
                            break;
                        case 1:
                            jsonReader.beginObject();
                            int iNextInt3 = -1;
                            while (jsonReader.hasNext()) {
                                int iSelectName4 = jsonReader.selectName(f.f94955b);
                                if (iSelectName4 == 0) {
                                    iNextInt3 = jsonReader.nextInt();
                                } else if (iSelectName4 != 1) {
                                    jsonReader.skipName();
                                    jsonReader.skipValue();
                                } else {
                                    animatableGradientColorValue = new AnimatableGradientColorValue(j.a(jsonReader, lottieComposition, 1.0f, new GradientColorParser(iNextInt3), false));
                                }
                            }
                            jsonReader.endObject();
                            break;
                        case 2:
                            animatableIntegerValueB = AnimatableValueParser.b(jsonReader, lottieComposition);
                            break;
                        case 3:
                            gradientType = jsonReader.nextInt() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                            break;
                        case 4:
                            animatablePointValueC2 = AnimatableValueParser.c(jsonReader, lottieComposition);
                            break;
                        case 5:
                            animatablePointValueC3 = AnimatableValueParser.c(jsonReader, lottieComposition);
                            break;
                        case 6:
                            fillType = jsonReader.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 7:
                            zNextBoolean5 = jsonReader.nextBoolean();
                            break;
                        default:
                            jsonReader.skipName();
                            jsonReader.skipValue();
                            break;
                    }
                }
                circleShape = new GradientFill(strNextString4, gradientType, fillType, animatableGradientColorValue, animatableIntegerValueB == null ? new AnimatableIntegerValue(Collections.singletonList(new Keyframe(100))) : animatableIntegerValueB, animatablePointValueC2, animatablePointValueC3, null, null, zNextBoolean5);
                break;
            case 3:
                JsonReader.Options options4 = p.f94971a;
                ArrayList arrayList = new ArrayList();
                String strNextString5 = null;
                while (jsonReader.hasNext()) {
                    int iSelectName5 = jsonReader.selectName(p.f94971a);
                    if (iSelectName5 == 0) {
                        strNextString5 = jsonReader.nextString();
                    } else if (iSelectName5 == 1) {
                        zNextBoolean = jsonReader.nextBoolean();
                    } else if (iSelectName5 != 2) {
                        jsonReader.skipValue();
                    } else {
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            ContentModel contentModelA = a(jsonReader, lottieComposition);
                            if (contentModelA != null) {
                                arrayList.add(contentModelA);
                            }
                        }
                        jsonReader.endArray();
                    }
                }
                shapeGroup = new ShapeGroup(strNextString5, arrayList, zNextBoolean);
                circleShape = shapeGroup;
                break;
            case 4:
                JsonReader.Options options5 = g.f94956a;
                ArrayList arrayList2 = new ArrayList();
                boolean zNextBoolean6 = false;
                float fNextDouble = 0.0f;
                AnimatableIntegerValue animatableIntegerValueB2 = null;
                String strNextString6 = null;
                GradientType gradientType2 = null;
                AnimatableGradientColorValue animatableGradientColorValue2 = null;
                AnimatablePointValue animatablePointValueC4 = null;
                AnimatablePointValue animatablePointValueC5 = null;
                AnimatableFloatValue animatableFloatValue = null;
                ShapeStroke.LineCapType lineCapType = null;
                ShapeStroke.LineJoinType lineJoinType = null;
                AnimatableFloatValue animatableFloatValue2 = null;
                while (jsonReader.hasNext()) {
                    switch (jsonReader.selectName(g.f94956a)) {
                        case 0:
                            strNextString6 = jsonReader.nextString();
                            break;
                        case 1:
                            jsonReader.beginObject();
                            int iNextInt4 = -1;
                            while (jsonReader.hasNext()) {
                                int iSelectName6 = jsonReader.selectName(g.f94957b);
                                if (iSelectName6 == 0) {
                                    iNextInt4 = jsonReader.nextInt();
                                } else if (iSelectName6 != 1) {
                                    jsonReader.skipName();
                                    jsonReader.skipValue();
                                } else {
                                    animatableGradientColorValue2 = new AnimatableGradientColorValue(j.a(jsonReader, lottieComposition, 1.0f, new GradientColorParser(iNextInt4), false));
                                }
                            }
                            jsonReader.endObject();
                            break;
                        case 2:
                            animatableIntegerValueB2 = AnimatableValueParser.b(jsonReader, lottieComposition);
                            break;
                        case 3:
                            gradientType2 = jsonReader.nextInt() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                            break;
                        case 4:
                            animatablePointValueC4 = AnimatableValueParser.c(jsonReader, lottieComposition);
                            break;
                        case 5:
                            animatablePointValueC5 = AnimatableValueParser.c(jsonReader, lottieComposition);
                            break;
                        case 6:
                            animatableFloatValue = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                            break;
                        case 7:
                            lineCapType = ShapeStroke.LineCapType.values()[jsonReader.nextInt() - 1];
                            break;
                        case 8:
                            lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.nextInt() - 1];
                            break;
                        case 9:
                            fNextDouble = (float) jsonReader.nextDouble();
                            break;
                        case 10:
                            zNextBoolean6 = jsonReader.nextBoolean();
                            break;
                        case 11:
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                jsonReader.beginObject();
                                String strNextString7 = null;
                                AnimatableFloatValue animatableFloatValue3 = null;
                                while (jsonReader.hasNext()) {
                                    int iSelectName7 = jsonReader.selectName(g.f94958c);
                                    if (iSelectName7 == 0) {
                                        strNextString7 = jsonReader.nextString();
                                    } else if (iSelectName7 != 1) {
                                        jsonReader.skipName();
                                        jsonReader.skipValue();
                                    } else {
                                        animatableFloatValue3 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                                    }
                                }
                                jsonReader.endObject();
                                if (strNextString7.equals("o")) {
                                    animatableFloatValue2 = animatableFloatValue3;
                                } else if (strNextString7.equals("d") || strNextString7.equals("g")) {
                                    lottieComposition.setHasDashPattern(true);
                                    arrayList2.add(animatableFloatValue3);
                                }
                            }
                            jsonReader.endArray();
                            if (arrayList2.size() == 1) {
                                arrayList2.add((AnimatableFloatValue) arrayList2.get(0));
                            }
                            break;
                        default:
                            jsonReader.skipName();
                            jsonReader.skipValue();
                            break;
                    }
                }
                circleShape = new GradientStroke(strNextString6, gradientType2, animatableGradientColorValue2, animatableIntegerValueB2 == null ? new AnimatableIntegerValue(Collections.singletonList(new Keyframe(100))) : animatableIntegerValueB2, animatablePointValueC4, animatablePointValueC5, animatableFloatValue, lineCapType, lineJoinType, fNextDouble, arrayList2, animatableFloatValue2, zNextBoolean6);
                break;
            case 5:
                JsonReader.Options options6 = k.f94966a;
                MergePaths.MergePathsMode mergePathsModeForId = null;
                String strNextString8 = null;
                while (jsonReader.hasNext()) {
                    int iSelectName8 = jsonReader.selectName(k.f94966a);
                    if (iSelectName8 == 0) {
                        strNextString8 = jsonReader.nextString();
                    } else if (iSelectName8 == 1) {
                        mergePathsModeForId = MergePaths.MergePathsMode.forId(jsonReader.nextInt());
                    } else if (iSelectName8 != 2) {
                        jsonReader.skipName();
                        jsonReader.skipValue();
                    } else {
                        zNextBoolean = jsonReader.nextBoolean();
                    }
                }
                MergePaths mergePaths = new MergePaths(strNextString8, mergePathsModeForId, zNextBoolean);
                lottieComposition.addWarning("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                circleShape = mergePaths;
                break;
            case 6:
                JsonReader.Options options7 = m.f94968a;
                boolean zNextBoolean7 = false;
                String strNextString9 = null;
                AnimatableValue<PointF, PointF> animatableValueA2 = null;
                AnimatablePointValue animatablePointValueC6 = null;
                AnimatableFloatValue animatableFloatValue4 = null;
                while (jsonReader.hasNext()) {
                    int iSelectName9 = jsonReader.selectName(m.f94968a);
                    if (iSelectName9 == 0) {
                        strNextString9 = jsonReader.nextString();
                    } else if (iSelectName9 == 1) {
                        animatableValueA2 = AnimatablePathValueParser.a(jsonReader, lottieComposition);
                    } else if (iSelectName9 == 2) {
                        animatablePointValueC6 = AnimatableValueParser.c(jsonReader, lottieComposition);
                    } else if (iSelectName9 == 3) {
                        animatableFloatValue4 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                    } else if (iSelectName9 != 4) {
                        jsonReader.skipValue();
                    } else {
                        zNextBoolean7 = jsonReader.nextBoolean();
                    }
                }
                circleShape = new RectangleShape(strNextString9, animatableValueA2, animatablePointValueC6, animatableFloatValue4, zNextBoolean7);
                break;
            case 7:
                JsonReader.Options options8 = RoundedCornersParser.f26170a;
                String strNextString10 = null;
                AnimatableFloatValue animatableFloatValue5 = null;
                while (jsonReader.hasNext()) {
                    int iSelectName10 = jsonReader.selectName(RoundedCornersParser.f26170a);
                    if (iSelectName10 == 0) {
                        strNextString10 = jsonReader.nextString();
                    } else if (iSelectName10 == 1) {
                        animatableFloatValue5 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, true);
                    } else if (iSelectName10 != 2) {
                        jsonReader.skipValue();
                    } else {
                        zNextBoolean = jsonReader.nextBoolean();
                    }
                }
                circleShape = !zNextBoolean ? new RoundedCorners(strNextString10, animatableFloatValue5) : null;
                break;
            case 8:
                JsonReader.Options options9 = n.f94969a;
                boolean zNextBoolean8 = false;
                String strNextString11 = null;
                AnimatableFloatValue animatableFloatValue6 = null;
                AnimatableFloatValue animatableFloatValue7 = null;
                AnimatableTransform animatableTransform = null;
                while (jsonReader.hasNext()) {
                    int iSelectName11 = jsonReader.selectName(n.f94969a);
                    if (iSelectName11 == 0) {
                        strNextString11 = jsonReader.nextString();
                    } else if (iSelectName11 == 1) {
                        animatableFloatValue6 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    } else if (iSelectName11 == 2) {
                        animatableFloatValue7 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    } else if (iSelectName11 == 3) {
                        animatableTransform = AnimatableTransformParser.parse(jsonReader, lottieComposition);
                    } else if (iSelectName11 != 4) {
                        jsonReader.skipValue();
                    } else {
                        zNextBoolean8 = jsonReader.nextBoolean();
                    }
                }
                circleShape = new Repeater(strNextString11, animatableFloatValue6, animatableFloatValue7, animatableTransform, zNextBoolean8);
                break;
            case 9:
                JsonReader.Options options10 = q.f94972a;
                int iNextInt5 = 0;
                boolean zNextBoolean9 = false;
                AnimatableShapeValue animatableShapeValue = null;
                String strNextString12 = null;
                while (jsonReader.hasNext()) {
                    int iSelectName12 = jsonReader.selectName(q.f94972a);
                    if (iSelectName12 == 0) {
                        strNextString12 = jsonReader.nextString();
                    } else if (iSelectName12 == 1) {
                        iNextInt5 = jsonReader.nextInt();
                    } else if (iSelectName12 == 2) {
                        animatableShapeValue = new AnimatableShapeValue(j.a(jsonReader, lottieComposition, Utils.dpScale(), ShapeDataParser.INSTANCE, false));
                    } else if (iSelectName12 != 3) {
                        jsonReader.skipValue();
                    } else {
                        zNextBoolean9 = jsonReader.nextBoolean();
                    }
                }
                shapeGroup = new ShapePath(strNextString12, iNextInt5, animatableShapeValue, zNextBoolean9);
                circleShape = shapeGroup;
                break;
            case 10:
                JsonReader.Options options11 = l.f94967a;
                boolean z11 = iNextInt == 3;
                boolean zNextBoolean10 = false;
                String strNextString13 = null;
                PolystarShape.Type typeForValue = null;
                AnimatableFloatValue animatableFloatValue8 = null;
                AnimatableValue<PointF, PointF> animatableValueA3 = null;
                AnimatableFloatValue animatableFloatValue9 = null;
                AnimatableFloatValue animatableFloatValue10 = null;
                AnimatableFloatValue animatableFloatValue11 = null;
                AnimatableFloatValue animatableFloatValue12 = null;
                AnimatableFloatValue animatableFloatValue13 = null;
                while (jsonReader.hasNext()) {
                    switch (jsonReader.selectName(l.f94967a)) {
                        case 0:
                            strNextString13 = jsonReader.nextString();
                            break;
                        case 1:
                            typeForValue = PolystarShape.Type.forValue(jsonReader.nextInt());
                            break;
                        case 2:
                            animatableFloatValue8 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                            break;
                        case 3:
                            animatableValueA3 = AnimatablePathValueParser.a(jsonReader, lottieComposition);
                            break;
                        case 4:
                            animatableFloatValue9 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                            break;
                        case 5:
                            animatableFloatValue11 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                            break;
                        case 6:
                            animatableFloatValue13 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                            break;
                        case 7:
                            animatableFloatValue10 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                            break;
                        case 8:
                            animatableFloatValue12 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                            break;
                        case 9:
                            zNextBoolean10 = jsonReader.nextBoolean();
                            break;
                        case 10:
                            z11 = jsonReader.nextInt() == 3;
                            break;
                        default:
                            jsonReader.skipName();
                            jsonReader.skipValue();
                            break;
                    }
                }
                circleShape = new PolystarShape(strNextString13, typeForValue, animatableFloatValue8, animatableValueA3, animatableFloatValue9, animatableFloatValue10, animatableFloatValue11, animatableFloatValue12, animatableFloatValue13, zNextBoolean10, z11);
                break;
            case 11:
                JsonReader.Options options12 = r.f94973a;
                ArrayList arrayList3 = new ArrayList();
                boolean zNextBoolean11 = false;
                float fNextDouble2 = 0.0f;
                AnimatableIntegerValue animatableIntegerValueB3 = null;
                ShapeStroke.LineCapType lineCapType2 = null;
                ShapeStroke.LineJoinType lineJoinType2 = null;
                String strNextString14 = null;
                AnimatableFloatValue animatableFloatValue14 = null;
                AnimatableColorValue animatableColorValueA2 = null;
                AnimatableFloatValue animatableFloatValue15 = null;
                while (jsonReader.hasNext()) {
                    switch (jsonReader.selectName(r.f94973a)) {
                        case 0:
                            strNextString14 = jsonReader.nextString();
                            break;
                        case 1:
                            animatableColorValueA2 = AnimatableValueParser.a(jsonReader, lottieComposition);
                            break;
                        case 2:
                            animatableFloatValue15 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                            break;
                        case 3:
                            animatableIntegerValueB3 = AnimatableValueParser.b(jsonReader, lottieComposition);
                            break;
                        case 4:
                            lineCapType2 = ShapeStroke.LineCapType.values()[jsonReader.nextInt() - 1];
                            break;
                        case 5:
                            lineJoinType2 = ShapeStroke.LineJoinType.values()[jsonReader.nextInt() - 1];
                            break;
                        case 6:
                            fNextDouble2 = (float) jsonReader.nextDouble();
                            break;
                        case 7:
                            zNextBoolean11 = jsonReader.nextBoolean();
                            break;
                        case 8:
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                jsonReader.beginObject();
                                String strNextString15 = null;
                                AnimatableFloatValue animatableFloatValue16 = null;
                                while (jsonReader.hasNext()) {
                                    int iSelectName13 = jsonReader.selectName(r.f94974b);
                                    if (iSelectName13 == 0) {
                                        strNextString15 = jsonReader.nextString();
                                    } else if (iSelectName13 != 1) {
                                        jsonReader.skipName();
                                        jsonReader.skipValue();
                                    } else {
                                        animatableFloatValue16 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                                    }
                                }
                                jsonReader.endObject();
                                strNextString15.getClass();
                                switch (strNextString15) {
                                    case "d":
                                    case "g":
                                        lottieComposition.setHasDashPattern(true);
                                        arrayList3.add(animatableFloatValue16);
                                        break;
                                    case "o":
                                        animatableFloatValue14 = animatableFloatValue16;
                                        break;
                                }
                            }
                            jsonReader.endArray();
                            if (arrayList3.size() == 1) {
                                arrayList3.add((AnimatableFloatValue) arrayList3.get(0));
                            }
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                circleShape = new ShapeStroke(strNextString14, animatableFloatValue14, arrayList3, animatableColorValueA2, animatableIntegerValueB3 == null ? new AnimatableIntegerValue(Collections.singletonList(new Keyframe(100))) : animatableIntegerValueB3, animatableFloatValue15, lineCapType2 == null ? ShapeStroke.LineCapType.BUTT : lineCapType2, lineJoinType2 == null ? ShapeStroke.LineJoinType.MITER : lineJoinType2, fNextDouble2, zNextBoolean11);
                break;
            case 12:
                JsonReader.Options options13 = s.f94975a;
                boolean zNextBoolean12 = false;
                String strNextString16 = null;
                ShapeTrimPath.Type typeForId = null;
                AnimatableFloatValue animatableFloatValue17 = null;
                AnimatableFloatValue animatableFloatValue18 = null;
                AnimatableFloatValue animatableFloatValue19 = null;
                while (jsonReader.hasNext()) {
                    int iSelectName14 = jsonReader.selectName(s.f94975a);
                    if (iSelectName14 == 0) {
                        animatableFloatValue17 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    } else if (iSelectName14 == 1) {
                        animatableFloatValue18 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    } else if (iSelectName14 == 2) {
                        animatableFloatValue19 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    } else if (iSelectName14 == 3) {
                        strNextString16 = jsonReader.nextString();
                    } else if (iSelectName14 == 4) {
                        typeForId = ShapeTrimPath.Type.forId(jsonReader.nextInt());
                    } else if (iSelectName14 != 5) {
                        jsonReader.skipValue();
                    } else {
                        zNextBoolean12 = jsonReader.nextBoolean();
                    }
                }
                circleShape = new ShapeTrimPath(strNextString16, typeForId, animatableFloatValue17, animatableFloatValue18, animatableFloatValue19, zNextBoolean12);
                break;
            case 13:
                circleShape = AnimatableTransformParser.parse(jsonReader, lottieComposition);
                break;
            default:
                Logger.warning("Unknown shape type ".concat(strNextString));
                break;
        }
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return circleShape;
    }
}
