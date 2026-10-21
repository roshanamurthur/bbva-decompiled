package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathNode;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: XmlVectorParser.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a<\u0010\u000e\u001a\u00020\f*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\t\u001a\b\u0018\u00010\bR\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000\u001a\f\u0010\u000f\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a*\u0010\u0010\u001a\u00020\n*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\t\u001a\b\u0018\u00010\bR\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a2\u0010\u0012\u001a\u00020\u0011*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\t\u001a\b\u0018\u00010\bR\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0000\u001a2\u0010\u0013\u001a\u00020\u0011*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\t\u001a\b\u0018\u00010\bR\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0000\u001a2\u0010\u0014\u001a\u00020\u0011*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\t\u001a\b\u0018\u00010\bR\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0000¨\u0006\u0015"}, d2 = {"Lorg/xmlpull/v1/XmlPullParser;", "", "isAtEnd", "Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;", "Landroid/content/res/Resources;", "res", "Landroid/util/AttributeSet;", "attrs", "Landroid/content/res/Resources$Theme;", "theme", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "builder", "", "nestedGroups", "parseCurrentVectorNode", "seekToStartTag", "createVectorImageBuilder", "", "parsePath", "parseClipPath", "parseGroup", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nXmlVectorParser.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlVectorParser.android.kt\nandroidx/compose/ui/graphics/vector/compat/XmlVectorParser_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,726:1\n174#2:727\n174#2:728\n*S KotlinDebug\n*F\n+ 1 XmlVectorParser.android.kt\nandroidx/compose/ui/graphics/vector/compat/XmlVectorParser_androidKt\n*L\n239#1:727\n240#1:728\n*E\n"})
public final class XmlVectorParser_androidKt {
    @NotNull
    public static final ImageVector.Builder createVectorImageBuilder(@NotNull AndroidVectorParser androidVectorParser, @NotNull Resources res, @Nullable Resources.Theme theme, @NotNull AttributeSet attrs) throws XmlPullParserException {
        long jM2544getUnspecified0d7_KjU;
        int iM2457getSrcIn0nO6VwU;
        ColorStateList namedColorStateList;
        Intrinsics.checkNotNullParameter(androidVectorParser, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray typedArrayObtainAttributes = androidVectorParser.obtainAttributes(res, theme, attrs, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY());
        boolean namedBoolean = androidVectorParser.getNamedBoolean(typedArrayObtainAttributes, "autoMirrored", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_AUTO_MIRRORED(), false);
        float namedFloat = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "viewportWidth", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH(), 0.0f);
        float namedFloat2 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "viewportHeight", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_HEIGHT(), 0.0f);
        if (namedFloat <= 0.0f) {
            throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (namedFloat2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float dimension = androidVectorParser.getDimension(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_WIDTH(), 0.0f);
        float dimension2 = androidVectorParser.getDimension(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_HEIGHT(), 0.0f);
        if (typedArrayObtainAttributes.hasValue(androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT())) {
            TypedValue typedValue = new TypedValue();
            typedArrayObtainAttributes.getValue(androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT(), typedValue);
            jM2544getUnspecified0d7_KjU = (typedValue.type == 2 || (namedColorStateList = androidVectorParser.getNamedColorStateList(typedArrayObtainAttributes, theme, "tint", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT())) == null) ? Color.INSTANCE.m2544getUnspecified0d7_KjU() : ColorKt.Color(namedColorStateList.getDefaultColor());
        } else {
            jM2544getUnspecified0d7_KjU = Color.INSTANCE.m2544getUnspecified0d7_KjU();
        }
        long j10 = jM2544getUnspecified0d7_KjU;
        int i10 = androidVectorParser.getInt(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT_MODE(), -1);
        if (i10 == -1) {
            iM2457getSrcIn0nO6VwU = BlendMode.INSTANCE.m2457getSrcIn0nO6VwU();
        } else if (i10 == 3) {
            iM2457getSrcIn0nO6VwU = BlendMode.INSTANCE.m2459getSrcOver0nO6VwU();
        } else if (i10 == 5) {
            iM2457getSrcIn0nO6VwU = BlendMode.INSTANCE.m2457getSrcIn0nO6VwU();
        } else if (i10 != 9) {
            switch (i10) {
                case 14:
                    iM2457getSrcIn0nO6VwU = BlendMode.INSTANCE.m2448getModulate0nO6VwU();
                    break;
                case 15:
                    iM2457getSrcIn0nO6VwU = BlendMode.INSTANCE.m2453getScreen0nO6VwU();
                    break;
                case 16:
                    iM2457getSrcIn0nO6VwU = BlendMode.INSTANCE.m2451getPlus0nO6VwU();
                    break;
                default:
                    iM2457getSrcIn0nO6VwU = BlendMode.INSTANCE.m2457getSrcIn0nO6VwU();
                    break;
            }
        } else {
            iM2457getSrcIn0nO6VwU = BlendMode.INSTANCE.m2456getSrcAtop0nO6VwU();
        }
        int i11 = iM2457getSrcIn0nO6VwU;
        float fM4389constructorimpl = Dp.m4389constructorimpl(dimension / res.getDisplayMetrics().density);
        float fM4389constructorimpl2 = Dp.m4389constructorimpl(dimension2 / res.getDisplayMetrics().density);
        typedArrayObtainAttributes.recycle();
        return new ImageVector.Builder(null, fM4389constructorimpl, fM4389constructorimpl2, namedFloat, namedFloat2, j10, i11, namedBoolean, 1, null);
    }

    public static final boolean isAtEnd(@NotNull XmlPullParser xmlPullParser) {
        Intrinsics.checkNotNullParameter(xmlPullParser, "<this>");
        if (xmlPullParser.getEventType() != 1) {
            return xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3;
        }
        return true;
    }

    public static final void parseClipPath(@NotNull AndroidVectorParser androidVectorParser, @NotNull Resources res, @Nullable Resources.Theme theme, @NotNull AttributeSet attrs, @NotNull ImageVector.Builder builder) {
        Intrinsics.checkNotNullParameter(androidVectorParser, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(builder, "builder");
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray typedArrayObtainAttributes = androidVectorParser.obtainAttributes(res, theme, attrs, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH());
        String string = androidVectorParser.getString(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_NAME());
        if (string == null) {
            string = "";
        }
        List<PathNode> listAddPathNodes = VectorKt.addPathNodes(androidVectorParser.getString(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_PATH_DATA()));
        typedArrayObtainAttributes.recycle();
        builder.addGroup((254 & 1) != 0 ? "" : string, (254 & 2) != 0 ? 0.0f : 0.0f, (254 & 4) != 0 ? 0.0f : 0.0f, (254 & 8) != 0 ? 0.0f : 0.0f, (254 & 16) != 0 ? 1.0f : 0.0f, (254 & 32) == 0 ? 0.0f : 1.0f, (254 & 64) != 0 ? 0.0f : 0.0f, (254 & 128) == 0 ? 0.0f : 0.0f, (254 & 256) != 0 ? VectorKt.getEmptyPath() : listAddPathNodes);
    }

    public static final int parseCurrentVectorNode(@NotNull AndroidVectorParser androidVectorParser, @NotNull Resources res, @NotNull AttributeSet attrs, @Nullable Resources.Theme theme, @NotNull ImageVector.Builder builder, int i10) throws XmlPullParserException {
        Intrinsics.checkNotNullParameter(androidVectorParser, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(builder, "builder");
        int eventType = androidVectorParser.getXmlParser().getEventType();
        if (eventType != 2) {
            if (eventType != 3 || !Intrinsics.areEqual("group", androidVectorParser.getXmlParser().getName())) {
                return i10;
            }
            int i11 = i10 + 1;
            for (int i12 = 0; i12 < i11; i12++) {
                builder.clearGroup();
            }
            return 0;
        }
        String name = androidVectorParser.getXmlParser().getName();
        if (name == null) {
            return i10;
        }
        int iHashCode = name.hashCode();
        if (iHashCode == -1649314686) {
            if (!name.equals("clip-path")) {
                return i10;
            }
            parseClipPath(androidVectorParser, res, theme, attrs, builder);
            return i10 + 1;
        }
        if (iHashCode == 3433509) {
            if (!name.equals("path")) {
                return i10;
            }
            parsePath(androidVectorParser, res, theme, attrs, builder);
            return i10;
        }
        if (iHashCode != 98629247 || !name.equals("group")) {
            return i10;
        }
        parseGroup(androidVectorParser, res, theme, attrs, builder);
        return i10;
    }

    public static /* synthetic */ int parseCurrentVectorNode$default(AndroidVectorParser androidVectorParser, Resources resources, AttributeSet attributeSet, Resources.Theme theme, ImageVector.Builder builder, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            theme = null;
        }
        return parseCurrentVectorNode(androidVectorParser, resources, attributeSet, theme, builder, i10);
    }

    public static final void parseGroup(@NotNull AndroidVectorParser androidVectorParser, @NotNull Resources res, @Nullable Resources.Theme theme, @NotNull AttributeSet attrs, @NotNull ImageVector.Builder builder) {
        Intrinsics.checkNotNullParameter(androidVectorParser, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(builder, "builder");
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray typedArrayObtainAttributes = androidVectorParser.obtainAttributes(res, theme, attrs, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP());
        float namedFloat = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, Key.ROTATION, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION(), 0.0f);
        float f6 = androidVectorParser.getFloat(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_X(), 0.0f);
        float f10 = androidVectorParser.getFloat(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_Y(), 0.0f);
        float namedFloat2 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "scaleX", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_X(), 1.0f);
        float namedFloat3 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "scaleY", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_Y(), 1.0f);
        float namedFloat4 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "translateX", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X(), 0.0f);
        float namedFloat5 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "translateY", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_Y(), 0.0f);
        String string = androidVectorParser.getString(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_NAME());
        if (string == null) {
            string = "";
        }
        typedArrayObtainAttributes.recycle();
        builder.addGroup(string, namedFloat, f6, f10, namedFloat2, namedFloat3, namedFloat4, namedFloat5, VectorKt.getEmptyPath());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:21:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:24:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:27:0x012b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0131  */
    /* JADX WARN: Code duplicated, block: B:31:0x0137  */
    /* JADX WARN: Code duplicated, block: B:32:0x0145  */
    /* JADX WARN: Code duplicated, block: B:35:0x014c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0152  */
    /* JADX WARN: Code duplicated, block: B:38:0x0158  */
    /* JADX WARN: Code duplicated, block: B:39:0x0167  */
    /* JADX WARN: Code duplicated, block: B:42:0x016c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0172  */
    public static final void parsePath(@NotNull AndroidVectorParser androidVectorParser, @NotNull Resources res, @Nullable Resources.Theme theme, @NotNull AttributeSet attrs, @NotNull ImageVector.Builder builder) throws IllegalArgumentException {
        int iM2808getButtKaPHkGw;
        int i10;
        int namedInt;
        StrokeJoin.Companion companion;
        int iM2818getBevelLxFBmk8;
        int iM2819getMiterLxFBmk8;
        int i11;
        ComplexColorCompat namedComplexColor;
        int namedInt2;
        Brush brush;
        Brush solidColor;
        PathFillType.Companion companion2;
        int iM2748getEvenOddRgk1Os;
        Shader shader;
        Shader shader2;
        Brush solidColor2;
        Intrinsics.checkNotNullParameter(androidVectorParser, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(builder, "builder");
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray typedArrayObtainAttributes = androidVectorParser.obtainAttributes(res, theme, attrs, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH());
        if (!TypedArrayUtils.hasAttribute(androidVectorParser.getXmlParser(), "pathData")) {
            throw new IllegalArgumentException("No path data available");
        }
        String string = androidVectorParser.getString(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_NAME());
        if (string == null) {
            string = "";
        }
        String str = string;
        List<PathNode> listAddPathNodes = VectorKt.addPathNodes(androidVectorParser.getString(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_PATH_DATA()));
        ComplexColorCompat namedComplexColor2 = androidVectorParser.getNamedComplexColor(typedArrayObtainAttributes, theme, "fillColor", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_COLOR(), 0);
        float namedFloat = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "fillAlpha", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_ALPHA(), 1.0f);
        int namedInt3 = androidVectorParser.getNamedInt(typedArrayObtainAttributes, "strokeLineCap", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP(), -1);
        StrokeCap.Companion companion3 = StrokeCap.INSTANCE;
        int iM2808getButtKaPHkGw2 = companion3.m2808getButtKaPHkGw();
        if (namedInt3 == 0) {
            iM2808getButtKaPHkGw = companion3.m2808getButtKaPHkGw();
        } else {
            if (namedInt3 != 1) {
                if (namedInt3 != 2) {
                    i10 = iM2808getButtKaPHkGw2;
                } else {
                    iM2808getButtKaPHkGw = companion3.m2810getSquareKaPHkGw();
                }
                namedInt = androidVectorParser.getNamedInt(typedArrayObtainAttributes, "strokeLineJoin", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_JOIN(), -1);
                companion = StrokeJoin.INSTANCE;
                iM2818getBevelLxFBmk8 = companion.m2818getBevelLxFBmk8();
                if (namedInt != 0) {
                    iM2819getMiterLxFBmk8 = companion.m2819getMiterLxFBmk8();
                } else {
                    if (namedInt != 1) {
                        if (namedInt != 2) {
                            i11 = iM2818getBevelLxFBmk8;
                        } else {
                            iM2819getMiterLxFBmk8 = companion.m2818getBevelLxFBmk8();
                        }
                        float namedFloat2 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "strokeMiterLimit", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_MITER_LIMIT(), 1.0f);
                        namedComplexColor = androidVectorParser.getNamedComplexColor(typedArrayObtainAttributes, theme, "strokeColor", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR(), 0);
                        float namedFloat3 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "strokeAlpha", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_ALPHA(), 1.0f);
                        float namedFloat4 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "strokeWidth", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH(), 1.0f);
                        float namedFloat5 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "trimPathEnd", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END(), 1.0f);
                        float namedFloat6 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "trimPathOffset", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET(), 0.0f);
                        float namedFloat7 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "trimPathStart", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START(), 0.0f);
                        namedInt2 = androidVectorParser.getNamedInt(typedArrayObtainAttributes, "fillType", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE(), 0);
                        typedArrayObtainAttributes.recycle();
                        if (namedComplexColor2.willDraw()) {
                            shader2 = namedComplexColor2.getShader();
                            if (shader2 != null) {
                                solidColor2 = BrushKt.ShaderBrush(shader2);
                            } else {
                                solidColor2 = new SolidColor(ColorKt.Color(namedComplexColor2.getColor()), null);
                            }
                            brush = solidColor2;
                        } else {
                            brush = null;
                        }
                        if (namedComplexColor.willDraw()) {
                            shader = namedComplexColor.getShader();
                            if (shader != null) {
                                solidColor = BrushKt.ShaderBrush(shader);
                            } else {
                                solidColor = new SolidColor(ColorKt.Color(namedComplexColor.getColor()), null);
                            }
                        } else {
                            solidColor = null;
                        }
                        companion2 = PathFillType.INSTANCE;
                        if (namedInt2 == 0) {
                            iM2748getEvenOddRgk1Os = companion2.m2749getNonZeroRgk1Os();
                        } else {
                            iM2748getEvenOddRgk1Os = companion2.m2748getEvenOddRgk1Os();
                        }
                        builder.m3014addPathoIyEayM(listAddPathNodes, iM2748getEvenOddRgk1Os, str, brush, namedFloat, solidColor, namedFloat3, namedFloat4, i10, i11, namedFloat2, namedFloat7, namedFloat5, namedFloat6);
                    }
                    iM2819getMiterLxFBmk8 = companion.m2820getRoundLxFBmk8();
                }
                i11 = iM2819getMiterLxFBmk8;
                float namedFloat8 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "strokeMiterLimit", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_MITER_LIMIT(), 1.0f);
                namedComplexColor = androidVectorParser.getNamedComplexColor(typedArrayObtainAttributes, theme, "strokeColor", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR(), 0);
                float namedFloat9 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "strokeAlpha", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_ALPHA(), 1.0f);
                float namedFloat10 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "strokeWidth", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH(), 1.0f);
                float namedFloat11 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "trimPathEnd", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END(), 1.0f);
                float namedFloat12 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "trimPathOffset", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET(), 0.0f);
                float namedFloat13 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "trimPathStart", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START(), 0.0f);
                namedInt2 = androidVectorParser.getNamedInt(typedArrayObtainAttributes, "fillType", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE(), 0);
                typedArrayObtainAttributes.recycle();
                if (namedComplexColor2.willDraw()) {
                    shader2 = namedComplexColor2.getShader();
                    if (shader2 != null) {
                        solidColor2 = BrushKt.ShaderBrush(shader2);
                    } else {
                        solidColor2 = new SolidColor(ColorKt.Color(namedComplexColor2.getColor()), null);
                    }
                    brush = solidColor2;
                } else {
                    brush = null;
                }
                if (namedComplexColor.willDraw()) {
                    shader = namedComplexColor.getShader();
                    if (shader != null) {
                        solidColor = BrushKt.ShaderBrush(shader);
                    } else {
                        solidColor = new SolidColor(ColorKt.Color(namedComplexColor.getColor()), null);
                    }
                } else {
                    solidColor = null;
                }
                companion2 = PathFillType.INSTANCE;
                if (namedInt2 == 0) {
                    iM2748getEvenOddRgk1Os = companion2.m2749getNonZeroRgk1Os();
                } else {
                    iM2748getEvenOddRgk1Os = companion2.m2748getEvenOddRgk1Os();
                }
                builder.m3014addPathoIyEayM(listAddPathNodes, iM2748getEvenOddRgk1Os, str, brush, namedFloat, solidColor, namedFloat9, namedFloat10, i10, i11, namedFloat8, namedFloat13, namedFloat11, namedFloat12);
            }
            iM2808getButtKaPHkGw = companion3.m2809getRoundKaPHkGw();
        }
        i10 = iM2808getButtKaPHkGw;
        namedInt = androidVectorParser.getNamedInt(typedArrayObtainAttributes, "strokeLineJoin", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_JOIN(), -1);
        companion = StrokeJoin.INSTANCE;
        iM2818getBevelLxFBmk8 = companion.m2818getBevelLxFBmk8();
        if (namedInt != 0) {
            iM2819getMiterLxFBmk8 = companion.m2819getMiterLxFBmk8();
        } else {
            if (namedInt != 1) {
                if (namedInt != 2) {
                    i11 = iM2818getBevelLxFBmk8;
                } else {
                    iM2819getMiterLxFBmk8 = companion.m2818getBevelLxFBmk8();
                }
                float namedFloat14 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "strokeMiterLimit", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_MITER_LIMIT(), 1.0f);
                namedComplexColor = androidVectorParser.getNamedComplexColor(typedArrayObtainAttributes, theme, "strokeColor", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR(), 0);
                float namedFloat15 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "strokeAlpha", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_ALPHA(), 1.0f);
                float namedFloat16 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "strokeWidth", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH(), 1.0f);
                float namedFloat17 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "trimPathEnd", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END(), 1.0f);
                float namedFloat18 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "trimPathOffset", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET(), 0.0f);
                float namedFloat19 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "trimPathStart", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START(), 0.0f);
                namedInt2 = androidVectorParser.getNamedInt(typedArrayObtainAttributes, "fillType", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE(), 0);
                typedArrayObtainAttributes.recycle();
                if (namedComplexColor2.willDraw()) {
                    shader2 = namedComplexColor2.getShader();
                    if (shader2 != null) {
                        solidColor2 = BrushKt.ShaderBrush(shader2);
                    } else {
                        solidColor2 = new SolidColor(ColorKt.Color(namedComplexColor2.getColor()), null);
                    }
                    brush = solidColor2;
                } else {
                    brush = null;
                }
                if (namedComplexColor.willDraw()) {
                    shader = namedComplexColor.getShader();
                    if (shader != null) {
                        solidColor = BrushKt.ShaderBrush(shader);
                    } else {
                        solidColor = new SolidColor(ColorKt.Color(namedComplexColor.getColor()), null);
                    }
                } else {
                    solidColor = null;
                }
                companion2 = PathFillType.INSTANCE;
                if (namedInt2 == 0) {
                    iM2748getEvenOddRgk1Os = companion2.m2749getNonZeroRgk1Os();
                } else {
                    iM2748getEvenOddRgk1Os = companion2.m2748getEvenOddRgk1Os();
                }
                builder.m3014addPathoIyEayM(listAddPathNodes, iM2748getEvenOddRgk1Os, str, brush, namedFloat, solidColor, namedFloat15, namedFloat16, i10, i11, namedFloat14, namedFloat19, namedFloat17, namedFloat18);
            }
            iM2819getMiterLxFBmk8 = companion.m2820getRoundLxFBmk8();
        }
        i11 = iM2819getMiterLxFBmk8;
        float namedFloat110 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "strokeMiterLimit", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_MITER_LIMIT(), 1.0f);
        namedComplexColor = androidVectorParser.getNamedComplexColor(typedArrayObtainAttributes, theme, "strokeColor", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR(), 0);
        float namedFloat111 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "strokeAlpha", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_ALPHA(), 1.0f);
        float namedFloat112 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "strokeWidth", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH(), 1.0f);
        float namedFloat113 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "trimPathEnd", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END(), 1.0f);
        float namedFloat114 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "trimPathOffset", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET(), 0.0f);
        float namedFloat115 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "trimPathStart", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START(), 0.0f);
        namedInt2 = androidVectorParser.getNamedInt(typedArrayObtainAttributes, "fillType", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE(), 0);
        typedArrayObtainAttributes.recycle();
        if (namedComplexColor2.willDraw()) {
            shader2 = namedComplexColor2.getShader();
            if (shader2 != null) {
                solidColor2 = BrushKt.ShaderBrush(shader2);
            } else {
                solidColor2 = new SolidColor(ColorKt.Color(namedComplexColor2.getColor()), null);
            }
            brush = solidColor2;
        } else {
            brush = null;
        }
        if (namedComplexColor.willDraw()) {
            shader = namedComplexColor.getShader();
            if (shader != null) {
                solidColor = BrushKt.ShaderBrush(shader);
            } else {
                solidColor = new SolidColor(ColorKt.Color(namedComplexColor.getColor()), null);
            }
        } else {
            solidColor = null;
        }
        companion2 = PathFillType.INSTANCE;
        if (namedInt2 == 0) {
            iM2748getEvenOddRgk1Os = companion2.m2749getNonZeroRgk1Os();
        } else {
            iM2748getEvenOddRgk1Os = companion2.m2748getEvenOddRgk1Os();
        }
        builder.m3014addPathoIyEayM(listAddPathNodes, iM2748getEvenOddRgk1Os, str, brush, namedFloat, solidColor, namedFloat111, namedFloat112, i10, i11, namedFloat110, namedFloat115, namedFloat113, namedFloat114);
    }

    @NotNull
    public static final XmlPullParser seekToStartTag(@NotNull XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Intrinsics.checkNotNullParameter(xmlPullParser, "<this>");
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
