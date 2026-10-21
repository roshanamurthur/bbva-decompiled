package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SliderTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b(\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bt\u0010uR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R \u0010\u001e\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001d\u0010\fR\u0014\u0010\u001f\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\nR\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006R\u0014\u0010#\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\nR\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0004\u001a\u0004\b%\u0010\u0006R\u0017\u0010)\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0004\u001a\u0004\b(\u0010\u0006R \u0010,\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b*\u0010\n\u001a\u0004\b+\u0010\fR \u0010/\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b-\u0010\n\u001a\u0004\b.\u0010\fR\u0017\u00102\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b0\u0010\u0010\u001a\u0004\b1\u0010\u0012R \u00105\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b3\u0010\n\u001a\u0004\b4\u0010\fR\u0017\u00108\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\u0004\u001a\u0004\b7\u0010\u0006R\u0017\u0010;\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010\u0004\u001a\u0004\b:\u0010\u0006R \u0010>\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b<\u0010\n\u001a\u0004\b=\u0010\fR\u0017\u0010A\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b?\u0010\u0010\u001a\u0004\b@\u0010\u0012R\u0017\u0010D\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010\u0004\u001a\u0004\bC\u0010\u0006R \u0010G\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bE\u0010\n\u001a\u0004\bF\u0010\fR \u0010J\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bH\u0010\n\u001a\u0004\bI\u0010\fR\u0017\u0010M\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u0010\u0004\u001a\u0004\bL\u0010\u0006R\u0017\u0010S\u001a\u00020N8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010V\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bT\u0010\u0004\u001a\u0004\bU\u0010\u0006R \u0010Y\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bW\u0010\n\u001a\u0004\bX\u0010\fR \u0010\\\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bZ\u0010\n\u001a\u0004\b[\u0010\fR\u0017\u0010_\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b]\u0010\u0004\u001a\u0004\b^\u0010\u0006R \u0010b\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b`\u0010\n\u001a\u0004\ba\u0010\fR\u0017\u0010e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bc\u0010\u0004\u001a\u0004\bd\u0010\u0006R\u0014\u0010f\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\bf\u0010\nR\u0017\u0010i\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bg\u0010\u0010\u001a\u0004\bh\u0010\u0012R \u0010l\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bj\u0010\n\u001a\u0004\bk\u0010\fR\u0017\u0010o\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bm\u0010\u0004\u001a\u0004\bn\u0010\u0006R\u0014\u0010p\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\bp\u0010\nR\u0017\u0010r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\bq\u0010\u0006R\u0014\u0010s\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\bs\u0010\n\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006v"}, d2 = {"Landroidx/compose/material3/tokens/SliderTokens;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getActiveTrackColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveTrackColor", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getActiveTrackHeight-D9Ej5fM", "()F", "ActiveTrackHeight", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "c", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getActiveTrackShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ActiveTrackShape", "d", "getDisabledActiveTrackColor", "DisabledActiveTrackColor", "", "DisabledActiveTrackOpacity", "e", "getDisabledHandleColor", "DisabledHandleColor", "f", "getDisabledHandleElevation-D9Ej5fM", "DisabledHandleElevation", "DisabledHandleOpacity", "g", "getDisabledInactiveTrackColor", "DisabledInactiveTrackColor", "DisabledInactiveTrackOpacity", "h", "getFocusHandleColor", "FocusHandleColor", "i", "getHandleColor", "HandleColor", "j", "getHandleElevation-D9Ej5fM", "HandleElevation", "k", "getHandleHeight-D9Ej5fM", "HandleHeight", "l", "getHandleShape", "HandleShape", "m", "getHandleWidth-D9Ej5fM", "HandleWidth", "n", "getHoverHandleColor", "HoverHandleColor", "o", "getInactiveTrackColor", "InactiveTrackColor", "p", "getInactiveTrackHeight-D9Ej5fM", "InactiveTrackHeight", "q", "getInactiveTrackShape", "InactiveTrackShape", "r", "getLabelContainerColor", "LabelContainerColor", "s", "getLabelContainerElevation-D9Ej5fM", "LabelContainerElevation", "t", "getLabelContainerHeight-D9Ej5fM", "LabelContainerHeight", "u", "getLabelTextColor", "LabelTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", SharedPrefsStorage.VERSION_KEY, "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LabelTextFont", "w", "getPressedHandleColor", "PressedHandleColor", "x", "getStateLayerSize-D9Ej5fM", "StateLayerSize", "y", "getTrackElevation-D9Ej5fM", "TrackElevation", "z", "getOverlapHandleOutlineColor", "OverlapHandleOutlineColor", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getOverlapHandleOutlineWidth-D9Ej5fM", "OverlapHandleOutlineWidth", "B", "getTickMarksActiveContainerColor", "TickMarksActiveContainerColor", "TickMarksActiveContainerOpacity", "C", "getTickMarksContainerShape", "TickMarksContainerShape", "D", "getTickMarksContainerSize-D9Ej5fM", "TickMarksContainerSize", ExifInterface.LONGITUDE_EAST, "getTickMarksDisabledContainerColor", "TickMarksDisabledContainerColor", "TickMarksDisabledContainerOpacity", "getTickMarksInactiveContainerColor", "TickMarksInactiveContainerColor", "TickMarksInactiveContainerOpacity", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSliderTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SliderTokens.kt\nandroidx/compose/material3/tokens/SliderTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,62:1\n164#2:63\n164#2:64\n164#2:65\n164#2:66\n164#2:67\n164#2:68\n164#2:69\n164#2:70\n*S KotlinDebug\n*F\n+ 1 SliderTokens.kt\nandroidx/compose/material3/tokens/SliderTokens\n*L\n25#1:63\n37#1:64\n39#1:65\n42#1:66\n46#1:67\n50#1:68\n53#1:69\n57#1:70\n*E\n"})
public final class SliderTokens {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public static final float OverlapHandleOutlineWidth;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TickMarksActiveContainerColor;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens TickMarksContainerShape;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public static final float TickMarksContainerSize;
    public static final float DisabledActiveTrackOpacity = 0.38f;
    public static final float DisabledHandleOpacity = 0.38f;
    public static final float DisabledInactiveTrackOpacity = 0.12f;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TickMarksDisabledContainerColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TickMarksInactiveContainerColor;

    @NotNull
    public static final SliderTokens INSTANCE = new SliderTokens();
    public static final float TickMarksActiveContainerOpacity = 0.38f;
    public static final float TickMarksDisabledContainerOpacity = 0.38f;
    public static final float TickMarksInactiveContainerOpacity = 0.38f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ActiveTrackColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float ActiveTrackHeight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens ActiveTrackShape;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledActiveTrackColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledHandleColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final float DisabledHandleElevation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledInactiveTrackColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FocusHandleColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens HandleColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final float HandleElevation;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final float HandleHeight;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens HandleShape;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public static final float HandleWidth;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens HoverHandleColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InactiveTrackColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final float InactiveTrackHeight;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens InactiveTrackShape;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens LabelContainerColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final float LabelContainerElevation;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final float LabelContainerHeight;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens LabelTextColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens LabelTextFont;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens PressedHandleColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public static final float StateLayerSize;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final float TrackElevation;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens OverlapHandleOutlineColor;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        ActiveTrackColor = colorSchemeKeyTokens;
        float f6 = (float) 4.0d;
        ActiveTrackHeight = Dp.m4389constructorimpl(f6);
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        ActiveTrackShape = shapeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        DisabledActiveTrackColor = colorSchemeKeyTokens2;
        DisabledHandleColor = colorSchemeKeyTokens2;
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        DisabledHandleElevation = elevationTokens.m1636getLevel0D9Ej5fM();
        DisabledInactiveTrackColor = colorSchemeKeyTokens2;
        FocusHandleColor = colorSchemeKeyTokens;
        HandleColor = colorSchemeKeyTokens;
        HandleElevation = elevationTokens.m1637getLevel1D9Ej5fM();
        float f10 = (float) 20.0d;
        HandleHeight = Dp.m4389constructorimpl(f10);
        HandleShape = shapeKeyTokens;
        HandleWidth = Dp.m4389constructorimpl(f10);
        HoverHandleColor = colorSchemeKeyTokens;
        InactiveTrackColor = ColorSchemeKeyTokens.SurfaceVariant;
        InactiveTrackHeight = Dp.m4389constructorimpl(f6);
        InactiveTrackShape = shapeKeyTokens;
        LabelContainerColor = colorSchemeKeyTokens;
        LabelContainerElevation = elevationTokens.m1636getLevel0D9Ej5fM();
        LabelContainerHeight = Dp.m4389constructorimpl((float) 28.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnPrimary;
        LabelTextColor = colorSchemeKeyTokens3;
        LabelTextFont = TypographyKeyTokens.LabelMedium;
        PressedHandleColor = colorSchemeKeyTokens;
        StateLayerSize = Dp.m4389constructorimpl((float) 40.0d);
        TrackElevation = elevationTokens.m1636getLevel0D9Ej5fM();
        OverlapHandleOutlineColor = colorSchemeKeyTokens3;
        OverlapHandleOutlineWidth = Dp.m4389constructorimpl((float) 1.0d);
        TickMarksActiveContainerColor = colorSchemeKeyTokens3;
        TickMarksContainerShape = shapeKeyTokens;
        TickMarksContainerSize = Dp.m4389constructorimpl((float) 2.0d);
        TickMarksDisabledContainerColor = colorSchemeKeyTokens2;
        TickMarksInactiveContainerColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActiveTrackColor() {
        return ActiveTrackColor;
    }

    /* JADX INFO: renamed from: getActiveTrackHeight-D9Ej5fM, reason: not valid java name */
    public final float m1932getActiveTrackHeightD9Ej5fM() {
        return ActiveTrackHeight;
    }

    @NotNull
    public final ShapeKeyTokens getActiveTrackShape() {
        return ActiveTrackShape;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledActiveTrackColor() {
        return DisabledActiveTrackColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledHandleColor() {
        return DisabledHandleColor;
    }

    /* JADX INFO: renamed from: getDisabledHandleElevation-D9Ej5fM, reason: not valid java name */
    public final float m1933getDisabledHandleElevationD9Ej5fM() {
        return DisabledHandleElevation;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledInactiveTrackColor() {
        return DisabledInactiveTrackColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusHandleColor() {
        return FocusHandleColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHandleColor() {
        return HandleColor;
    }

    /* JADX INFO: renamed from: getHandleElevation-D9Ej5fM, reason: not valid java name */
    public final float m1934getHandleElevationD9Ej5fM() {
        return HandleElevation;
    }

    /* JADX INFO: renamed from: getHandleHeight-D9Ej5fM, reason: not valid java name */
    public final float m1935getHandleHeightD9Ej5fM() {
        return HandleHeight;
    }

    @NotNull
    public final ShapeKeyTokens getHandleShape() {
        return HandleShape;
    }

    /* JADX INFO: renamed from: getHandleWidth-D9Ej5fM, reason: not valid java name */
    public final float m1936getHandleWidthD9Ej5fM() {
        return HandleWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHoverHandleColor() {
        return HoverHandleColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInactiveTrackColor() {
        return InactiveTrackColor;
    }

    /* JADX INFO: renamed from: getInactiveTrackHeight-D9Ej5fM, reason: not valid java name */
    public final float m1937getInactiveTrackHeightD9Ej5fM() {
        return InactiveTrackHeight;
    }

    @NotNull
    public final ShapeKeyTokens getInactiveTrackShape() {
        return InactiveTrackShape;
    }

    @NotNull
    public final ColorSchemeKeyTokens getLabelContainerColor() {
        return LabelContainerColor;
    }

    /* JADX INFO: renamed from: getLabelContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1938getLabelContainerElevationD9Ej5fM() {
        return LabelContainerElevation;
    }

    /* JADX INFO: renamed from: getLabelContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1939getLabelContainerHeightD9Ej5fM() {
        return LabelContainerHeight;
    }

    @NotNull
    public final ColorSchemeKeyTokens getLabelTextColor() {
        return LabelTextColor;
    }

    @NotNull
    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
    }

    @NotNull
    public final ColorSchemeKeyTokens getOverlapHandleOutlineColor() {
        return OverlapHandleOutlineColor;
    }

    /* JADX INFO: renamed from: getOverlapHandleOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1940getOverlapHandleOutlineWidthD9Ej5fM() {
        return OverlapHandleOutlineWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPressedHandleColor() {
        return PressedHandleColor;
    }

    /* JADX INFO: renamed from: getStateLayerSize-D9Ej5fM, reason: not valid java name */
    public final float m1941getStateLayerSizeD9Ej5fM() {
        return StateLayerSize;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTickMarksActiveContainerColor() {
        return TickMarksActiveContainerColor;
    }

    @NotNull
    public final ShapeKeyTokens getTickMarksContainerShape() {
        return TickMarksContainerShape;
    }

    /* JADX INFO: renamed from: getTickMarksContainerSize-D9Ej5fM, reason: not valid java name */
    public final float m1942getTickMarksContainerSizeD9Ej5fM() {
        return TickMarksContainerSize;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTickMarksDisabledContainerColor() {
        return TickMarksDisabledContainerColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTickMarksInactiveContainerColor() {
        return TickMarksInactiveContainerColor;
    }

    /* JADX INFO: renamed from: getTrackElevation-D9Ej5fM, reason: not valid java name */
    public final float m1943getTrackElevationD9Ej5fM() {
        return TrackElevation;
    }
}
