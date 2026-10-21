package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TimeInputTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\bd\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\by\u0010zR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001f\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\"\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b \u0010\u0010\u001a\u0004\b!\u0010\u0012R \u0010%\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010\n\u001a\u0004\b$\u0010\fR\u0017\u0010(\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b'\u0010\u001bR\u0017\u0010+\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R \u0010.\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b,\u0010\n\u001a\u0004\b-\u0010\fR\u0017\u00101\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R\u0017\u00104\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006R\u0017\u00107\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006R\u0017\u0010:\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\u0004\u001a\u0004\b9\u0010\u0006R\u0017\u0010=\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006R\u0017\u0010@\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010\u0004\u001a\u0004\b?\u0010\u0006R\u0017\u0010C\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010\u0004\u001a\u0004\bB\u0010\u0006R\u0017\u0010F\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010\u0004\u001a\u0004\bE\u0010\u0006R\u0017\u0010I\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010\u0004\u001a\u0004\bH\u0010\u0006R\u0017\u0010L\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010\u0004\u001a\u0004\bK\u0010\u0006R\u0017\u0010O\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bM\u0010\u0004\u001a\u0004\bN\u0010\u0006R \u0010R\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bP\u0010\n\u001a\u0004\bQ\u0010\fR\u0017\u0010U\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bS\u0010\u0010\u001a\u0004\bT\u0010\u0012R \u0010X\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bV\u0010\n\u001a\u0004\bW\u0010\fR\u0017\u0010[\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bY\u0010\u0004\u001a\u0004\bZ\u0010\u0006R\u0017\u0010^\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\\\u0010\u0004\u001a\u0004\b]\u0010\u0006R\u0017\u0010a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b_\u0010\u0004\u001a\u0004\b`\u0010\u0006R \u0010d\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bb\u0010\n\u001a\u0004\bc\u0010\fR\u0017\u0010g\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\be\u0010\u0004\u001a\u0004\bf\u0010\u0006R\u0017\u0010j\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bh\u0010\u0004\u001a\u0004\bi\u0010\u0006R\u0017\u0010l\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\bk\u0010\u001bR\u0017\u0010o\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bm\u0010\u0004\u001a\u0004\bn\u0010\u0006R\u0017\u0010r\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bp\u0010\u0019\u001a\u0004\bq\u0010\u001bR\u0017\u0010u\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bs\u0010\u0004\u001a\u0004\bt\u0010\u0006R\u0017\u0010x\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bv\u0010\u0019\u001a\u0004\bw\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006{"}, d2 = {"Landroidx/compose/material3/tokens/TimeInputTokens;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerColor", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getContainerElevation-D9Ej5fM", "()F", "ContainerElevation", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "c", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "d", "getHeadlineColor", "HeadlineColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "e", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getHeadlineFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "HeadlineFont", "f", "getPeriodSelectorContainerHeight-D9Ej5fM", "PeriodSelectorContainerHeight", "g", "getPeriodSelectorContainerShape", "PeriodSelectorContainerShape", "h", "getPeriodSelectorContainerWidth-D9Ej5fM", "PeriodSelectorContainerWidth", "i", "getPeriodSelectorLabelTextFont", "PeriodSelectorLabelTextFont", "j", "getPeriodSelectorOutlineColor", "PeriodSelectorOutlineColor", "k", "getPeriodSelectorOutlineWidth-D9Ej5fM", "PeriodSelectorOutlineWidth", "l", "getPeriodSelectorSelectedContainerColor", "PeriodSelectorSelectedContainerColor", "m", "getPeriodSelectorSelectedFocusLabelTextColor", "PeriodSelectorSelectedFocusLabelTextColor", "n", "getPeriodSelectorSelectedHoverLabelTextColor", "PeriodSelectorSelectedHoverLabelTextColor", "o", "getPeriodSelectorSelectedLabelTextColor", "PeriodSelectorSelectedLabelTextColor", "p", "getPeriodSelectorSelectedPressedLabelTextColor", "PeriodSelectorSelectedPressedLabelTextColor", "q", "getPeriodSelectorUnselectedFocusLabelTextColor", "PeriodSelectorUnselectedFocusLabelTextColor", "r", "getPeriodSelectorUnselectedHoverLabelTextColor", "PeriodSelectorUnselectedHoverLabelTextColor", "s", "getPeriodSelectorUnselectedLabelTextColor", "PeriodSelectorUnselectedLabelTextColor", "t", "getPeriodSelectorUnselectedPressedLabelTextColor", "PeriodSelectorUnselectedPressedLabelTextColor", "u", "getSurfaceTintLayerColor", "SurfaceTintLayerColor", SharedPrefsStorage.VERSION_KEY, "getTimeFieldContainerColor", "TimeFieldContainerColor", "w", "getTimeFieldContainerHeight-D9Ej5fM", "TimeFieldContainerHeight", "x", "getTimeFieldContainerShape", "TimeFieldContainerShape", "y", "getTimeFieldContainerWidth-D9Ej5fM", "TimeFieldContainerWidth", "z", "getTimeFieldFocusContainerColor", "TimeFieldFocusContainerColor", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getTimeFieldFocusLabelTextColor", "TimeFieldFocusLabelTextColor", "B", "getTimeFieldFocusOutlineColor", "TimeFieldFocusOutlineColor", "C", "getTimeFieldFocusOutlineWidth-D9Ej5fM", "TimeFieldFocusOutlineWidth", "D", "getTimeFieldHoverLabelTextColor", "TimeFieldHoverLabelTextColor", ExifInterface.LONGITUDE_EAST, "getTimeFieldLabelTextColor", "TimeFieldLabelTextColor", "getTimeFieldLabelTextFont", "TimeFieldLabelTextFont", "G", "getTimeFieldSeparatorColor", "TimeFieldSeparatorColor", "H", "getTimeFieldSeparatorFont", "TimeFieldSeparatorFont", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getTimeFieldSupportingTextColor", "TimeFieldSupportingTextColor", "J", "getTimeFieldSupportingTextFont", "TimeFieldSupportingTextFont", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTimeInputTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeInputTokens.kt\nandroidx/compose/material3/tokens/TimeInputTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,61:1\n164#2:62\n164#2:63\n164#2:64\n164#2:65\n164#2:66\n164#2:67\n*S KotlinDebug\n*F\n+ 1 TimeInputTokens.kt\nandroidx/compose/material3/tokens/TimeInputTokens\n*L\n30#1:62\n32#1:63\n35#1:64\n47#1:65\n49#1:66\n53#1:67\n*E\n"})
public final class TimeInputTokens {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TimeFieldFocusLabelTextColor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TimeFieldFocusOutlineColor;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public static final float TimeFieldFocusOutlineWidth;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TimeFieldHoverLabelTextColor;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TimeFieldLabelTextColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens TimeFieldLabelTextFont;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TimeFieldSeparatorColor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens TimeFieldSeparatorFont;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TimeFieldSupportingTextColor;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens TimeFieldSupportingTextFont;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens HeadlineColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens HeadlineFont;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final float PeriodSelectorContainerHeight;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens PeriodSelectorContainerShape;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final float PeriodSelectorContainerWidth;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens PeriodSelectorLabelTextFont;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens PeriodSelectorOutlineColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final float PeriodSelectorOutlineWidth;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens PeriodSelectorSelectedContainerColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens PeriodSelectorSelectedFocusLabelTextColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens PeriodSelectorSelectedHoverLabelTextColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens PeriodSelectorSelectedLabelTextColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens PeriodSelectorSelectedPressedLabelTextColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens PeriodSelectorUnselectedFocusLabelTextColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens PeriodSelectorUnselectedHoverLabelTextColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens PeriodSelectorUnselectedLabelTextColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens PeriodSelectorUnselectedPressedLabelTextColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SurfaceTintLayerColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TimeFieldContainerColor;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public static final float TimeFieldContainerHeight;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens TimeFieldContainerShape;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final float TimeFieldContainerWidth;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TimeFieldFocusContainerColor;

    @NotNull
    public static final TimeInputTokens INSTANCE = new TimeInputTokens();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.Surface;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float ContainerElevation = ElevationTokens.INSTANCE.m1639getLevel3D9Ej5fM();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerExtraLarge;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurfaceVariant;
        HeadlineColor = colorSchemeKeyTokens;
        HeadlineFont = TypographyKeyTokens.LabelMedium;
        float f6 = (float) 72.0d;
        PeriodSelectorContainerHeight = Dp.m4389constructorimpl(f6);
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerSmall;
        PeriodSelectorContainerShape = shapeKeyTokens;
        PeriodSelectorContainerWidth = Dp.m4389constructorimpl((float) 52.0d);
        PeriodSelectorLabelTextFont = TypographyKeyTokens.TitleMedium;
        PeriodSelectorOutlineColor = ColorSchemeKeyTokens.Outline;
        PeriodSelectorOutlineWidth = Dp.m4389constructorimpl((float) 1.0d);
        PeriodSelectorSelectedContainerColor = ColorSchemeKeyTokens.TertiaryContainer;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnTertiaryContainer;
        PeriodSelectorSelectedFocusLabelTextColor = colorSchemeKeyTokens2;
        PeriodSelectorSelectedHoverLabelTextColor = colorSchemeKeyTokens2;
        PeriodSelectorSelectedLabelTextColor = colorSchemeKeyTokens2;
        PeriodSelectorSelectedPressedLabelTextColor = colorSchemeKeyTokens2;
        PeriodSelectorUnselectedFocusLabelTextColor = colorSchemeKeyTokens;
        PeriodSelectorUnselectedHoverLabelTextColor = colorSchemeKeyTokens;
        PeriodSelectorUnselectedLabelTextColor = colorSchemeKeyTokens;
        PeriodSelectorUnselectedPressedLabelTextColor = colorSchemeKeyTokens;
        SurfaceTintLayerColor = ColorSchemeKeyTokens.SurfaceTint;
        TimeFieldContainerColor = ColorSchemeKeyTokens.SurfaceVariant;
        TimeFieldContainerHeight = Dp.m4389constructorimpl(f6);
        TimeFieldContainerShape = shapeKeyTokens;
        TimeFieldContainerWidth = Dp.m4389constructorimpl((float) 96.0d);
        TimeFieldFocusContainerColor = ColorSchemeKeyTokens.PrimaryContainer;
        TimeFieldFocusLabelTextColor = ColorSchemeKeyTokens.OnPrimaryContainer;
        TimeFieldFocusOutlineColor = ColorSchemeKeyTokens.Primary;
        TimeFieldFocusOutlineWidth = Dp.m4389constructorimpl((float) 2.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurface;
        TimeFieldHoverLabelTextColor = colorSchemeKeyTokens3;
        TimeFieldLabelTextColor = colorSchemeKeyTokens3;
        TimeFieldLabelTextFont = TypographyKeyTokens.DisplayMedium;
        TimeFieldSeparatorColor = colorSchemeKeyTokens3;
        TimeFieldSeparatorFont = TypographyKeyTokens.DisplayLarge;
        TimeFieldSupportingTextColor = colorSchemeKeyTokens;
        TimeFieldSupportingTextFont = TypographyKeyTokens.BodySmall;
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* JADX INFO: renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1974getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    @NotNull
    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHeadlineColor() {
        return HeadlineColor;
    }

    @NotNull
    public final TypographyKeyTokens getHeadlineFont() {
        return HeadlineFont;
    }

    /* JADX INFO: renamed from: getPeriodSelectorContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1975getPeriodSelectorContainerHeightD9Ej5fM() {
        return PeriodSelectorContainerHeight;
    }

    @NotNull
    public final ShapeKeyTokens getPeriodSelectorContainerShape() {
        return PeriodSelectorContainerShape;
    }

    /* JADX INFO: renamed from: getPeriodSelectorContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m1976getPeriodSelectorContainerWidthD9Ej5fM() {
        return PeriodSelectorContainerWidth;
    }

    @NotNull
    public final TypographyKeyTokens getPeriodSelectorLabelTextFont() {
        return PeriodSelectorLabelTextFont;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPeriodSelectorOutlineColor() {
        return PeriodSelectorOutlineColor;
    }

    /* JADX INFO: renamed from: getPeriodSelectorOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1977getPeriodSelectorOutlineWidthD9Ej5fM() {
        return PeriodSelectorOutlineWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPeriodSelectorSelectedContainerColor() {
        return PeriodSelectorSelectedContainerColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPeriodSelectorSelectedFocusLabelTextColor() {
        return PeriodSelectorSelectedFocusLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPeriodSelectorSelectedHoverLabelTextColor() {
        return PeriodSelectorSelectedHoverLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPeriodSelectorSelectedLabelTextColor() {
        return PeriodSelectorSelectedLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPeriodSelectorSelectedPressedLabelTextColor() {
        return PeriodSelectorSelectedPressedLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPeriodSelectorUnselectedFocusLabelTextColor() {
        return PeriodSelectorUnselectedFocusLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPeriodSelectorUnselectedHoverLabelTextColor() {
        return PeriodSelectorUnselectedHoverLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPeriodSelectorUnselectedLabelTextColor() {
        return PeriodSelectorUnselectedLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getPeriodSelectorUnselectedPressedLabelTextColor() {
        return PeriodSelectorUnselectedPressedLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSurfaceTintLayerColor() {
        return SurfaceTintLayerColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeFieldContainerColor() {
        return TimeFieldContainerColor;
    }

    /* JADX INFO: renamed from: getTimeFieldContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1978getTimeFieldContainerHeightD9Ej5fM() {
        return TimeFieldContainerHeight;
    }

    @NotNull
    public final ShapeKeyTokens getTimeFieldContainerShape() {
        return TimeFieldContainerShape;
    }

    /* JADX INFO: renamed from: getTimeFieldContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m1979getTimeFieldContainerWidthD9Ej5fM() {
        return TimeFieldContainerWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeFieldFocusContainerColor() {
        return TimeFieldFocusContainerColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeFieldFocusLabelTextColor() {
        return TimeFieldFocusLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeFieldFocusOutlineColor() {
        return TimeFieldFocusOutlineColor;
    }

    /* JADX INFO: renamed from: getTimeFieldFocusOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1980getTimeFieldFocusOutlineWidthD9Ej5fM() {
        return TimeFieldFocusOutlineWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeFieldHoverLabelTextColor() {
        return TimeFieldHoverLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeFieldLabelTextColor() {
        return TimeFieldLabelTextColor;
    }

    @NotNull
    public final TypographyKeyTokens getTimeFieldLabelTextFont() {
        return TimeFieldLabelTextFont;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeFieldSeparatorColor() {
        return TimeFieldSeparatorColor;
    }

    @NotNull
    public final TypographyKeyTokens getTimeFieldSeparatorFont() {
        return TimeFieldSeparatorFont;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeFieldSupportingTextColor() {
        return TimeFieldSupportingTextColor;
    }

    @NotNull
    public final TypographyKeyTokens getTimeFieldSupportingTextFont() {
        return TimeFieldSupportingTextFont;
    }
}
