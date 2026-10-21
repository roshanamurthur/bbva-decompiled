package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DatePickerModalTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\bs\bÀ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0010\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R \u0010\u001c\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\fR \u0010\u001f\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\"\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0015R \u0010%\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010\n\u001a\u0004\b$\u0010\fR\u0017\u0010+\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010.\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006R\u0017\u00101\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R \u00104\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b2\u0010\n\u001a\u0004\b3\u0010\fR\u0017\u00107\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b5\u0010\u0013\u001a\u0004\b6\u0010\u0015R \u0010:\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b8\u0010\n\u001a\u0004\b9\u0010\fR\u0017\u0010=\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006R \u0010@\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b>\u0010\n\u001a\u0004\b?\u0010\fR\u0017\u0010C\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010\u0004\u001a\u0004\bB\u0010\u0006R\u0017\u0010F\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010\u0004\u001a\u0004\bE\u0010\u0006R \u0010I\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bG\u0010\n\u001a\u0004\bH\u0010\fR \u0010L\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bJ\u0010\n\u001a\u0004\bK\u0010\fR\u0017\u0010O\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bM\u0010\u0004\u001a\u0004\bN\u0010\u0006R\u0017\u0010R\u001a\u00020&8\u0006¢\u0006\f\n\u0004\bP\u0010(\u001a\u0004\bQ\u0010*R\u0017\u0010U\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u0010\u0004\u001a\u0004\bT\u0010\u0006R\u0017\u0010X\u001a\u00020&8\u0006¢\u0006\f\n\u0004\bV\u0010(\u001a\u0004\bW\u0010*R\u0017\u0010[\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bY\u0010\u0004\u001a\u0004\bZ\u0010\u0006R \u0010^\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\\\u0010\n\u001a\u0004\b]\u0010\fR\u0017\u0010a\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b_\u0010\u0013\u001a\u0004\b`\u0010\u0015R \u0010d\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bb\u0010\n\u001a\u0004\bc\u0010\fR\u0017\u0010g\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\be\u0010\u0013\u001a\u0004\bf\u0010\u0015R\u0017\u0010j\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bh\u0010\u0004\u001a\u0004\bi\u0010\u0006R \u0010l\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\n\u001a\u0004\bk\u0010\fR\u0017\u0010o\u001a\u00020&8\u0006¢\u0006\f\n\u0004\bm\u0010(\u001a\u0004\bn\u0010*R\u0017\u0010r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bp\u0010\u0004\u001a\u0004\bq\u0010\u0006R\u0017\u0010u\u001a\u00020&8\u0006¢\u0006\f\n\u0004\bs\u0010(\u001a\u0004\bt\u0010*R\u0017\u0010x\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bv\u0010\u0004\u001a\u0004\bw\u0010\u0006R\u0017\u0010{\u001a\u00020&8\u0006¢\u0006\f\n\u0004\by\u0010(\u001a\u0004\bz\u0010*R \u0010~\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b|\u0010\n\u001a\u0004\b}\u0010\fR\"\u0010\u0081\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\r\n\u0004\b\u007f\u0010\n\u001a\u0005\b\u0080\u0001\u0010\fR\u001a\u0010\u0084\u0001\u001a\u00020&8\u0006¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010(\u001a\u0005\b\u0083\u0001\u0010*R\u001a\u0010\u0087\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\u0004\u001a\u0005\b\u0086\u0001\u0010\u0006R\u001a\u0010\u008a\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010\u0004\u001a\u0005\b\u0089\u0001\u0010\u0006R#\u0010\u008d\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\n\u001a\u0005\b\u008c\u0001\u0010\fR\u001a\u0010\u0090\u0001\u001a\u00020\u00118\u0006¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010\u0013\u001a\u0005\b\u008f\u0001\u0010\u0015R#\u0010\u0093\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010\n\u001a\u0005\b\u0092\u0001\u0010\fR\u001a\u0010\u0096\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010\u0004\u001a\u0005\b\u0095\u0001\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0099\u0001"}, d2 = {"Landroidx/compose/material3/tokens/DatePickerModalTokens;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerColor", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getContainerElevation-D9Ej5fM", "()F", "ContainerElevation", "c", "getContainerHeight-D9Ej5fM", "ContainerHeight", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "d", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "e", "getContainerSurfaceTintLayerColor", "ContainerSurfaceTintLayerColor", "f", "getContainerWidth-D9Ej5fM", "ContainerWidth", "g", "getDateContainerHeight-D9Ej5fM", "DateContainerHeight", "h", "getDateContainerShape", "DateContainerShape", "i", "getDateContainerWidth-D9Ej5fM", "DateContainerWidth", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "j", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getDateLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "DateLabelTextFont", "k", "getDateSelectedContainerColor", "DateSelectedContainerColor", "l", "getDateSelectedLabelTextColor", "DateSelectedLabelTextColor", "m", "getDateStateLayerHeight-D9Ej5fM", "DateStateLayerHeight", "n", "getDateStateLayerShape", "DateStateLayerShape", "o", "getDateStateLayerWidth-D9Ej5fM", "DateStateLayerWidth", "p", "getDateTodayContainerOutlineColor", "DateTodayContainerOutlineColor", "q", "getDateTodayContainerOutlineWidth-D9Ej5fM", "DateTodayContainerOutlineWidth", "r", "getDateTodayLabelTextColor", "DateTodayLabelTextColor", "s", "getDateUnselectedLabelTextColor", "DateUnselectedLabelTextColor", "t", "getHeaderContainerHeight-D9Ej5fM", "HeaderContainerHeight", "u", "getHeaderContainerWidth-D9Ej5fM", "HeaderContainerWidth", SharedPrefsStorage.VERSION_KEY, "getHeaderHeadlineColor", "HeaderHeadlineColor", "w", "getHeaderHeadlineFont", "HeaderHeadlineFont", "x", "getHeaderSupportingTextColor", "HeaderSupportingTextColor", "y", "getHeaderSupportingTextFont", "HeaderSupportingTextFont", "z", "getRangeSelectionActiveIndicatorContainerColor", "RangeSelectionActiveIndicatorContainerColor", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getRangeSelectionActiveIndicatorContainerHeight-D9Ej5fM", "RangeSelectionActiveIndicatorContainerHeight", "B", "getRangeSelectionActiveIndicatorContainerShape", "RangeSelectionActiveIndicatorContainerShape", "C", "getRangeSelectionContainerElevation-D9Ej5fM", "RangeSelectionContainerElevation", "D", "getRangeSelectionContainerShape", "RangeSelectionContainerShape", ExifInterface.LONGITUDE_EAST, "getSelectionDateInRangeLabelTextColor", "SelectionDateInRangeLabelTextColor", "getRangeSelectionHeaderContainerHeight-D9Ej5fM", "RangeSelectionHeaderContainerHeight", "G", "getRangeSelectionHeaderHeadlineFont", "RangeSelectionHeaderHeadlineFont", "H", "getRangeSelectionMonthSubheadColor", "RangeSelectionMonthSubheadColor", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getRangeSelectionMonthSubheadFont", "RangeSelectionMonthSubheadFont", "J", "getWeekdaysLabelTextColor", "WeekdaysLabelTextColor", "K", "getWeekdaysLabelTextFont", "WeekdaysLabelTextFont", "L", "getSelectionYearContainerHeight-D9Ej5fM", "SelectionYearContainerHeight", "M", "getSelectionYearContainerWidth-D9Ej5fM", "SelectionYearContainerWidth", "N", "getSelectionYearLabelTextFont", "SelectionYearLabelTextFont", "O", "getSelectionYearSelectedContainerColor", "SelectionYearSelectedContainerColor", "P", "getSelectionYearSelectedLabelTextColor", "SelectionYearSelectedLabelTextColor", TransactionType.TRANSACTION_TYPE_CONTACTLESS_CODE, "getSelectionYearStateLayerHeight-D9Ej5fM", "SelectionYearStateLayerHeight", "R", "getSelectionYearStateLayerShape", "SelectionYearStateLayerShape", ExifInterface.LATITUDE_SOUTH, "getSelectionYearStateLayerWidth-D9Ej5fM", "SelectionYearStateLayerWidth", ExifInterface.GPS_DIRECTION_TRUE, "getSelectionYearUnselectedLabelTextColor", "SelectionYearUnselectedLabelTextColor", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDatePickerModalTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePickerModalTokens.kt\nandroidx/compose/material3/tokens/DatePickerModalTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,71:1\n164#2:72\n164#2:73\n164#2:74\n164#2:75\n164#2:76\n164#2:77\n164#2:78\n164#2:79\n164#2:80\n164#2:81\n164#2:82\n164#2:83\n164#2:84\n164#2:85\n164#2:86\n*S KotlinDebug\n*F\n+ 1 DatePickerModalTokens.kt\nandroidx/compose/material3/tokens/DatePickerModalTokens\n*L\n26#1:72\n29#1:73\n30#1:74\n32#1:75\n36#1:76\n38#1:77\n40#1:78\n43#1:79\n44#1:80\n50#1:81\n55#1:82\n61#1:83\n62#1:84\n66#1:85\n68#1:86\n*E\n"})
public final class DatePickerModalTokens {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public static final float RangeSelectionActiveIndicatorContainerHeight;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens RangeSelectionActiveIndicatorContainerShape;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public static final float RangeSelectionContainerElevation;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens RangeSelectionContainerShape;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectionDateInRangeLabelTextColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public static final float RangeSelectionHeaderContainerHeight;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens RangeSelectionHeaderHeadlineFont;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens RangeSelectionMonthSubheadColor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens RangeSelectionMonthSubheadFont;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens WeekdaysLabelTextColor;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens WeekdaysLabelTextFont;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public static final float SelectionYearContainerHeight;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public static final float SelectionYearContainerWidth;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens SelectionYearLabelTextFont;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectionYearSelectedContainerColor;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectionYearSelectedLabelTextColor;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public static final float SelectionYearStateLayerHeight;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens SelectionYearStateLayerShape;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public static final float SelectionYearStateLayerWidth;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectionYearUnselectedLabelTextColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float ContainerElevation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final float ContainerHeight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens ContainerShape;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ContainerSurfaceTintLayerColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final float ContainerWidth;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final float DateContainerHeight;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens DateContainerShape;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final float DateContainerWidth;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens DateLabelTextFont;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DateSelectedContainerColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DateSelectedLabelTextColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public static final float DateStateLayerHeight;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens DateStateLayerShape;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final float DateStateLayerWidth;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DateTodayContainerOutlineColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final float DateTodayContainerOutlineWidth;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DateTodayLabelTextColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DateUnselectedLabelTextColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final float HeaderContainerHeight;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public static final float HeaderContainerWidth;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens HeaderHeadlineColor;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens HeaderHeadlineFont;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens HeaderSupportingTextColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens HeaderSupportingTextFont;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens RangeSelectionActiveIndicatorContainerColor;

    @NotNull
    public static final DatePickerModalTokens INSTANCE = new DatePickerModalTokens();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.Surface;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ContainerElevation = elevationTokens.m1639getLevel3D9Ej5fM();
        ContainerHeight = Dp.m4389constructorimpl((float) 568.0d);
        ContainerShape = ShapeKeyTokens.CornerExtraLarge;
        ContainerSurfaceTintLayerColor = ColorSchemeKeyTokens.SurfaceTint;
        float f6 = (float) 360.0d;
        ContainerWidth = Dp.m4389constructorimpl(f6);
        float f10 = (float) 40.0d;
        DateContainerHeight = Dp.m4389constructorimpl(f10);
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        DateContainerShape = shapeKeyTokens;
        DateContainerWidth = Dp.m4389constructorimpl(f10);
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.BodyLarge;
        DateLabelTextFont = typographyKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        DateSelectedContainerColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnPrimary;
        DateSelectedLabelTextColor = colorSchemeKeyTokens2;
        DateStateLayerHeight = Dp.m4389constructorimpl(f10);
        DateStateLayerShape = shapeKeyTokens;
        DateStateLayerWidth = Dp.m4389constructorimpl(f10);
        DateTodayContainerOutlineColor = colorSchemeKeyTokens;
        DateTodayContainerOutlineWidth = Dp.m4389constructorimpl((float) 1.0d);
        DateTodayLabelTextColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurface;
        DateUnselectedLabelTextColor = colorSchemeKeyTokens3;
        HeaderContainerHeight = Dp.m4389constructorimpl((float) 120.0d);
        HeaderContainerWidth = Dp.m4389constructorimpl(f6);
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.OnSurfaceVariant;
        HeaderHeadlineColor = colorSchemeKeyTokens4;
        HeaderHeadlineFont = TypographyKeyTokens.HeadlineLarge;
        HeaderSupportingTextColor = colorSchemeKeyTokens4;
        HeaderSupportingTextFont = TypographyKeyTokens.LabelLarge;
        RangeSelectionActiveIndicatorContainerColor = ColorSchemeKeyTokens.SecondaryContainer;
        RangeSelectionActiveIndicatorContainerHeight = Dp.m4389constructorimpl(f10);
        RangeSelectionActiveIndicatorContainerShape = shapeKeyTokens;
        RangeSelectionContainerElevation = elevationTokens.m1636getLevel0D9Ej5fM();
        RangeSelectionContainerShape = ShapeKeyTokens.CornerNone;
        SelectionDateInRangeLabelTextColor = ColorSchemeKeyTokens.OnSecondaryContainer;
        RangeSelectionHeaderContainerHeight = Dp.m4389constructorimpl((float) 128.0d);
        RangeSelectionHeaderHeadlineFont = TypographyKeyTokens.TitleLarge;
        RangeSelectionMonthSubheadColor = colorSchemeKeyTokens4;
        RangeSelectionMonthSubheadFont = TypographyKeyTokens.TitleSmall;
        WeekdaysLabelTextColor = colorSchemeKeyTokens3;
        WeekdaysLabelTextFont = typographyKeyTokens;
        float f11 = (float) 36.0d;
        SelectionYearContainerHeight = Dp.m4389constructorimpl(f11);
        float f12 = (float) 72.0d;
        SelectionYearContainerWidth = Dp.m4389constructorimpl(f12);
        SelectionYearLabelTextFont = typographyKeyTokens;
        SelectionYearSelectedContainerColor = colorSchemeKeyTokens;
        SelectionYearSelectedLabelTextColor = colorSchemeKeyTokens2;
        SelectionYearStateLayerHeight = Dp.m4389constructorimpl(f11);
        SelectionYearStateLayerShape = shapeKeyTokens;
        SelectionYearStateLayerWidth = Dp.m4389constructorimpl(f12);
        SelectionYearUnselectedLabelTextColor = colorSchemeKeyTokens4;
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* JADX INFO: renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1602getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* JADX INFO: renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1603getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    @NotNull
    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerSurfaceTintLayerColor() {
        return ContainerSurfaceTintLayerColor;
    }

    /* JADX INFO: renamed from: getContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m1604getContainerWidthD9Ej5fM() {
        return ContainerWidth;
    }

    /* JADX INFO: renamed from: getDateContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1605getDateContainerHeightD9Ej5fM() {
        return DateContainerHeight;
    }

    @NotNull
    public final ShapeKeyTokens getDateContainerShape() {
        return DateContainerShape;
    }

    /* JADX INFO: renamed from: getDateContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m1606getDateContainerWidthD9Ej5fM() {
        return DateContainerWidth;
    }

    @NotNull
    public final TypographyKeyTokens getDateLabelTextFont() {
        return DateLabelTextFont;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDateSelectedContainerColor() {
        return DateSelectedContainerColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDateSelectedLabelTextColor() {
        return DateSelectedLabelTextColor;
    }

    /* JADX INFO: renamed from: getDateStateLayerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1607getDateStateLayerHeightD9Ej5fM() {
        return DateStateLayerHeight;
    }

    @NotNull
    public final ShapeKeyTokens getDateStateLayerShape() {
        return DateStateLayerShape;
    }

    /* JADX INFO: renamed from: getDateStateLayerWidth-D9Ej5fM, reason: not valid java name */
    public final float m1608getDateStateLayerWidthD9Ej5fM() {
        return DateStateLayerWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDateTodayContainerOutlineColor() {
        return DateTodayContainerOutlineColor;
    }

    /* JADX INFO: renamed from: getDateTodayContainerOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1609getDateTodayContainerOutlineWidthD9Ej5fM() {
        return DateTodayContainerOutlineWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDateTodayLabelTextColor() {
        return DateTodayLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDateUnselectedLabelTextColor() {
        return DateUnselectedLabelTextColor;
    }

    /* JADX INFO: renamed from: getHeaderContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1610getHeaderContainerHeightD9Ej5fM() {
        return HeaderContainerHeight;
    }

    /* JADX INFO: renamed from: getHeaderContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m1611getHeaderContainerWidthD9Ej5fM() {
        return HeaderContainerWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHeaderHeadlineColor() {
        return HeaderHeadlineColor;
    }

    @NotNull
    public final TypographyKeyTokens getHeaderHeadlineFont() {
        return HeaderHeadlineFont;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHeaderSupportingTextColor() {
        return HeaderSupportingTextColor;
    }

    @NotNull
    public final TypographyKeyTokens getHeaderSupportingTextFont() {
        return HeaderSupportingTextFont;
    }

    @NotNull
    public final ColorSchemeKeyTokens getRangeSelectionActiveIndicatorContainerColor() {
        return RangeSelectionActiveIndicatorContainerColor;
    }

    /* JADX INFO: renamed from: getRangeSelectionActiveIndicatorContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1612getRangeSelectionActiveIndicatorContainerHeightD9Ej5fM() {
        return RangeSelectionActiveIndicatorContainerHeight;
    }

    @NotNull
    public final ShapeKeyTokens getRangeSelectionActiveIndicatorContainerShape() {
        return RangeSelectionActiveIndicatorContainerShape;
    }

    /* JADX INFO: renamed from: getRangeSelectionContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1613getRangeSelectionContainerElevationD9Ej5fM() {
        return RangeSelectionContainerElevation;
    }

    @NotNull
    public final ShapeKeyTokens getRangeSelectionContainerShape() {
        return RangeSelectionContainerShape;
    }

    /* JADX INFO: renamed from: getRangeSelectionHeaderContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() {
        return RangeSelectionHeaderContainerHeight;
    }

    @NotNull
    public final TypographyKeyTokens getRangeSelectionHeaderHeadlineFont() {
        return RangeSelectionHeaderHeadlineFont;
    }

    @NotNull
    public final ColorSchemeKeyTokens getRangeSelectionMonthSubheadColor() {
        return RangeSelectionMonthSubheadColor;
    }

    @NotNull
    public final TypographyKeyTokens getRangeSelectionMonthSubheadFont() {
        return RangeSelectionMonthSubheadFont;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectionDateInRangeLabelTextColor() {
        return SelectionDateInRangeLabelTextColor;
    }

    /* JADX INFO: renamed from: getSelectionYearContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1615getSelectionYearContainerHeightD9Ej5fM() {
        return SelectionYearContainerHeight;
    }

    /* JADX INFO: renamed from: getSelectionYearContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m1616getSelectionYearContainerWidthD9Ej5fM() {
        return SelectionYearContainerWidth;
    }

    @NotNull
    public final TypographyKeyTokens getSelectionYearLabelTextFont() {
        return SelectionYearLabelTextFont;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectionYearSelectedContainerColor() {
        return SelectionYearSelectedContainerColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectionYearSelectedLabelTextColor() {
        return SelectionYearSelectedLabelTextColor;
    }

    /* JADX INFO: renamed from: getSelectionYearStateLayerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1617getSelectionYearStateLayerHeightD9Ej5fM() {
        return SelectionYearStateLayerHeight;
    }

    @NotNull
    public final ShapeKeyTokens getSelectionYearStateLayerShape() {
        return SelectionYearStateLayerShape;
    }

    /* JADX INFO: renamed from: getSelectionYearStateLayerWidth-D9Ej5fM, reason: not valid java name */
    public final float m1618getSelectionYearStateLayerWidthD9Ej5fM() {
        return SelectionYearStateLayerWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectionYearUnselectedLabelTextColor() {
        return SelectionYearUnselectedLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getWeekdaysLabelTextColor() {
        return WeekdaysLabelTextColor;
    }

    @NotNull
    public final TypographyKeyTokens getWeekdaysLabelTextFont() {
        return WeekdaysLabelTextFont;
    }
}
