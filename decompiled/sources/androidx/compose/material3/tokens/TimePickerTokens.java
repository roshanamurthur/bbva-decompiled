package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TimePickerTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0003\b\u0097\u0001\bÀ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b¯\u0001\u0010°\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010\"\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b \u0010\n\u001a\u0004\b!\u0010\fR\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R\u0017\u0010(\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u001eR \u0010+\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b)\u0010\n\u001a\u0004\b*\u0010\fR\u0017\u0010.\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006R \u00101\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b/\u0010\n\u001a\u0004\b0\u0010\fR\u0017\u00104\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b2\u0010\u001c\u001a\u0004\b3\u0010\u001eR\u0017\u00107\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006R\u0017\u0010:\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\u0004\u001a\u0004\b9\u0010\u0006R \u0010=\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b;\u0010\n\u001a\u0004\b<\u0010\fR\u0017\u0010@\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b>\u0010\u001c\u001a\u0004\b?\u0010\u001eR\u0017\u0010C\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010\u0004\u001a\u0004\bB\u0010\u0006R\u0017\u0010F\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bD\u0010\u0010\u001a\u0004\bE\u0010\u0012R\u0017\u0010I\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bG\u0010\u001c\u001a\u0004\bH\u0010\u001eR \u0010L\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bJ\u0010\n\u001a\u0004\bK\u0010\fR \u0010O\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bM\u0010\n\u001a\u0004\bN\u0010\fR\u0017\u0010R\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bP\u0010\u0010\u001a\u0004\bQ\u0010\u0012R\u0017\u0010U\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u0010\u0004\u001a\u0004\bT\u0010\u0006R \u0010X\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bV\u0010\n\u001a\u0004\bW\u0010\fR\u0017\u0010[\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bY\u0010\u0004\u001a\u0004\bZ\u0010\u0006R\u0017\u0010^\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\\\u0010\u0004\u001a\u0004\b]\u0010\u0006R\u0017\u0010a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b_\u0010\u0004\u001a\u0004\b`\u0010\u0006R\u0017\u0010d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bb\u0010\u0004\u001a\u0004\bc\u0010\u0006R\u0017\u0010g\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\be\u0010\u0004\u001a\u0004\bf\u0010\u0006R\u0017\u0010j\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bh\u0010\u0004\u001a\u0004\bi\u0010\u0006R\u0017\u0010l\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\bk\u0010\u0006R\u0017\u0010o\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bm\u0010\u0004\u001a\u0004\bn\u0010\u0006R\u0017\u0010r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bp\u0010\u0004\u001a\u0004\bq\u0010\u0006R \u0010u\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bs\u0010\n\u001a\u0004\bt\u0010\fR \u0010x\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bv\u0010\n\u001a\u0004\bw\u0010\fR\u0017\u0010{\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\by\u0010\u0004\u001a\u0004\bz\u0010\u0006R \u0010~\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b|\u0010\n\u001a\u0004\b}\u0010\fR\"\u0010\u0081\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\r\n\u0004\b\u007f\u0010\n\u001a\u0005\b\u0080\u0001\u0010\fR\u001a\u0010\u0084\u0001\u001a\u00020\u001a8\u0006¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010\u001c\u001a\u0005\b\u0083\u0001\u0010\u001eR#\u0010\u0087\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\n\u001a\u0005\b\u0086\u0001\u0010\fR\u001a\u0010\u008a\u0001\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010\u0010\u001a\u0005\b\u0089\u0001\u0010\u0012R\u001a\u0010\u008d\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\u0004\u001a\u0005\b\u008c\u0001\u0010\u0006R\u001a\u0010\u0090\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010\u0004\u001a\u0005\b\u008f\u0001\u0010\u0006R\u001a\u0010\u0093\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010\u0004\u001a\u0005\b\u0092\u0001\u0010\u0006R\u001a\u0010\u0096\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010\u0004\u001a\u0005\b\u0095\u0001\u0010\u0006R\u001a\u0010\u0099\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010\u0004\u001a\u0005\b\u0098\u0001\u0010\u0006R\u001a\u0010\u009c\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u009a\u0001\u0010\u0004\u001a\u0005\b\u009b\u0001\u0010\u0006R\u001a\u0010\u009f\u0001\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010\u0010\u001a\u0005\b\u009e\u0001\u0010\u0012R\u001a\u0010¢\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b \u0001\u0010\u0004\u001a\u0005\b¡\u0001\u0010\u0006R\u001a\u0010¥\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b£\u0001\u0010\u0004\u001a\u0005\b¤\u0001\u0010\u0006R\u001a\u0010¨\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b¦\u0001\u0010\u0004\u001a\u0005\b§\u0001\u0010\u0006R\u001a\u0010«\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b©\u0001\u0010\u0004\u001a\u0005\bª\u0001\u0010\u0006R\u001a\u0010®\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b¬\u0001\u0010\u0004\u001a\u0005\b\u00ad\u0001\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006±\u0001"}, d2 = {"Landroidx/compose/material3/tokens/TimePickerTokens;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getClockDialColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ClockDialColor", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getClockDialContainerSize-D9Ej5fM", "()F", "ClockDialContainerSize", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "c", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getClockDialLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "ClockDialLabelTextFont", "d", "getClockDialSelectedLabelTextColor", "ClockDialSelectedLabelTextColor", "e", "getClockDialSelectorCenterContainerColor", "ClockDialSelectorCenterContainerColor", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "f", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getClockDialSelectorCenterContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ClockDialSelectorCenterContainerShape", "g", "getClockDialSelectorCenterContainerSize-D9Ej5fM", "ClockDialSelectorCenterContainerSize", "h", "getClockDialSelectorHandleContainerColor", "ClockDialSelectorHandleContainerColor", "i", "getClockDialSelectorHandleContainerShape", "ClockDialSelectorHandleContainerShape", "j", "getClockDialSelectorHandleContainerSize-D9Ej5fM", "ClockDialSelectorHandleContainerSize", "k", "getClockDialSelectorTrackContainerColor", "ClockDialSelectorTrackContainerColor", "l", "getClockDialSelectorTrackContainerWidth-D9Ej5fM", "ClockDialSelectorTrackContainerWidth", "m", "getClockDialShape", "ClockDialShape", "n", "getClockDialUnselectedLabelTextColor", "ClockDialUnselectedLabelTextColor", "o", "getContainerColor", "ContainerColor", "p", "getContainerElevation-D9Ej5fM", "ContainerElevation", "q", "getContainerShape", "ContainerShape", "r", "getHeadlineColor", "HeadlineColor", "s", "getHeadlineFont", "HeadlineFont", "t", "getPeriodSelectorContainerShape", "PeriodSelectorContainerShape", "u", "getPeriodSelectorHorizontalContainerHeight-D9Ej5fM", "PeriodSelectorHorizontalContainerHeight", SharedPrefsStorage.VERSION_KEY, "getPeriodSelectorHorizontalContainerWidth-D9Ej5fM", "PeriodSelectorHorizontalContainerWidth", "w", "getPeriodSelectorLabelTextFont", "PeriodSelectorLabelTextFont", "x", "getPeriodSelectorOutlineColor", "PeriodSelectorOutlineColor", "y", "getPeriodSelectorOutlineWidth-D9Ej5fM", "PeriodSelectorOutlineWidth", "z", "getPeriodSelectorSelectedContainerColor", "PeriodSelectorSelectedContainerColor", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getPeriodSelectorSelectedFocusLabelTextColor", "PeriodSelectorSelectedFocusLabelTextColor", "B", "getPeriodSelectorSelectedHoverLabelTextColor", "PeriodSelectorSelectedHoverLabelTextColor", "C", "getPeriodSelectorSelectedLabelTextColor", "PeriodSelectorSelectedLabelTextColor", "D", "getPeriodSelectorSelectedPressedLabelTextColor", "PeriodSelectorSelectedPressedLabelTextColor", ExifInterface.LONGITUDE_EAST, "getPeriodSelectorUnselectedFocusLabelTextColor", "PeriodSelectorUnselectedFocusLabelTextColor", "getPeriodSelectorUnselectedHoverLabelTextColor", "PeriodSelectorUnselectedHoverLabelTextColor", "G", "getPeriodSelectorUnselectedLabelTextColor", "PeriodSelectorUnselectedLabelTextColor", "H", "getPeriodSelectorUnselectedPressedLabelTextColor", "PeriodSelectorUnselectedPressedLabelTextColor", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPeriodSelectorVerticalContainerHeight-D9Ej5fM", "PeriodSelectorVerticalContainerHeight", "J", "getPeriodSelectorVerticalContainerWidth-D9Ej5fM", "PeriodSelectorVerticalContainerWidth", "K", "getSurfaceTintLayerColor", "SurfaceTintLayerColor", "L", "getTimeSelector24HVerticalContainerWidth-D9Ej5fM", "TimeSelector24HVerticalContainerWidth", "M", "getTimeSelectorContainerHeight-D9Ej5fM", "TimeSelectorContainerHeight", "N", "getTimeSelectorContainerShape", "TimeSelectorContainerShape", "O", "getTimeSelectorContainerWidth-D9Ej5fM", "TimeSelectorContainerWidth", "P", "getTimeSelectorLabelTextFont", "TimeSelectorLabelTextFont", TransactionType.TRANSACTION_TYPE_CONTACTLESS_CODE, "getTimeSelectorSelectedContainerColor", "TimeSelectorSelectedContainerColor", "R", "getTimeSelectorSelectedFocusLabelTextColor", "TimeSelectorSelectedFocusLabelTextColor", ExifInterface.LATITUDE_SOUTH, "getTimeSelectorSelectedHoverLabelTextColor", "TimeSelectorSelectedHoverLabelTextColor", ExifInterface.GPS_DIRECTION_TRUE, "getTimeSelectorSelectedLabelTextColor", "TimeSelectorSelectedLabelTextColor", "U", "getTimeSelectorSelectedPressedLabelTextColor", "TimeSelectorSelectedPressedLabelTextColor", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getTimeSelectorSeparatorColor", "TimeSelectorSeparatorColor", ExifInterface.LONGITUDE_WEST, "getTimeSelectorSeparatorFont", "TimeSelectorSeparatorFont", "X", "getTimeSelectorUnselectedContainerColor", "TimeSelectorUnselectedContainerColor", "Y", "getTimeSelectorUnselectedFocusLabelTextColor", "TimeSelectorUnselectedFocusLabelTextColor", "Z", "getTimeSelectorUnselectedHoverLabelTextColor", "TimeSelectorUnselectedHoverLabelTextColor", "a0", "getTimeSelectorUnselectedLabelTextColor", "TimeSelectorUnselectedLabelTextColor", "b0", "getTimeSelectorUnselectedPressedLabelTextColor", "TimeSelectorUnselectedPressedLabelTextColor", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTimePickerTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePickerTokens.kt\nandroidx/compose/material3/tokens/TimePickerTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,78:1\n164#2:79\n164#2:80\n164#2:81\n164#2:82\n164#2:83\n164#2:84\n164#2:85\n164#2:86\n164#2:87\n164#2:88\n164#2:89\n164#2:90\n*S KotlinDebug\n*F\n+ 1 TimePickerTokens.kt\nandroidx/compose/material3/tokens/TimePickerTokens\n*L\n25#1:79\n30#1:80\n33#1:81\n35#1:82\n44#1:83\n45#1:84\n48#1:85\n58#1:86\n59#1:87\n61#1:88\n62#1:89\n64#1:90\n*E\n"})
public final class TimePickerTokens {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens PeriodSelectorSelectedFocusLabelTextColor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens PeriodSelectorSelectedHoverLabelTextColor;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens PeriodSelectorSelectedLabelTextColor;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens PeriodSelectorSelectedPressedLabelTextColor;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens PeriodSelectorUnselectedFocusLabelTextColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens PeriodSelectorUnselectedHoverLabelTextColor;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens PeriodSelectorUnselectedLabelTextColor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens PeriodSelectorUnselectedPressedLabelTextColor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public static final float PeriodSelectorVerticalContainerHeight;

    @NotNull
    public static final TimePickerTokens INSTANCE = new TimePickerTokens();

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public static final float PeriodSelectorVerticalContainerWidth;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SurfaceTintLayerColor;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public static final float TimeSelector24HVerticalContainerWidth;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public static final float TimeSelectorContainerHeight;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens TimeSelectorContainerShape;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public static final float TimeSelectorContainerWidth;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens TimeSelectorLabelTextFont;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TimeSelectorSelectedContainerColor;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TimeSelectorSelectedFocusLabelTextColor;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TimeSelectorSelectedHoverLabelTextColor;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TimeSelectorSelectedLabelTextColor;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TimeSelectorSelectedPressedLabelTextColor;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TimeSelectorSeparatorColor;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens TimeSelectorSeparatorFont;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TimeSelectorUnselectedContainerColor;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TimeSelectorUnselectedFocusLabelTextColor;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TimeSelectorUnselectedHoverLabelTextColor;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ClockDialColor;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TimeSelectorUnselectedLabelTextColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float ClockDialContainerSize;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TimeSelectorUnselectedPressedLabelTextColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens ClockDialLabelTextFont;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ClockDialSelectedLabelTextColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ClockDialSelectorCenterContainerColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens ClockDialSelectorCenterContainerShape;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final float ClockDialSelectorCenterContainerSize;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ClockDialSelectorHandleContainerColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens ClockDialSelectorHandleContainerShape;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final float ClockDialSelectorHandleContainerSize;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ClockDialSelectorTrackContainerColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final float ClockDialSelectorTrackContainerWidth;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens ClockDialShape;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ClockDialUnselectedLabelTextColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ContainerColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final float ContainerElevation;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens ContainerShape;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens HeadlineColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens HeadlineFont;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens PeriodSelectorContainerShape;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public static final float PeriodSelectorHorizontalContainerHeight;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final float PeriodSelectorHorizontalContainerWidth;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens PeriodSelectorLabelTextFont;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens PeriodSelectorOutlineColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final float PeriodSelectorOutlineWidth;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens PeriodSelectorSelectedContainerColor;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.SurfaceVariant;
        ClockDialColor = colorSchemeKeyTokens;
        ClockDialContainerSize = Dp.m4389constructorimpl((float) 256.0d);
        ClockDialLabelTextFont = TypographyKeyTokens.BodyLarge;
        ClockDialSelectedLabelTextColor = ColorSchemeKeyTokens.OnPrimary;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.Primary;
        ClockDialSelectorCenterContainerColor = colorSchemeKeyTokens2;
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        ClockDialSelectorCenterContainerShape = shapeKeyTokens;
        ClockDialSelectorCenterContainerSize = Dp.m4389constructorimpl((float) 8.0d);
        ClockDialSelectorHandleContainerColor = colorSchemeKeyTokens2;
        ClockDialSelectorHandleContainerShape = shapeKeyTokens;
        ClockDialSelectorHandleContainerSize = Dp.m4389constructorimpl((float) 48.0d);
        ClockDialSelectorTrackContainerColor = colorSchemeKeyTokens2;
        ClockDialSelectorTrackContainerWidth = Dp.m4389constructorimpl((float) 2.0d);
        ClockDialShape = shapeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurface;
        ClockDialUnselectedLabelTextColor = colorSchemeKeyTokens3;
        ContainerColor = ColorSchemeKeyTokens.Surface;
        ContainerElevation = ElevationTokens.INSTANCE.m1639getLevel3D9Ej5fM();
        ContainerShape = ShapeKeyTokens.CornerExtraLarge;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.OnSurfaceVariant;
        HeadlineColor = colorSchemeKeyTokens4;
        HeadlineFont = TypographyKeyTokens.LabelMedium;
        ShapeKeyTokens shapeKeyTokens2 = ShapeKeyTokens.CornerSmall;
        PeriodSelectorContainerShape = shapeKeyTokens2;
        PeriodSelectorHorizontalContainerHeight = Dp.m4389constructorimpl((float) 38.0d);
        PeriodSelectorHorizontalContainerWidth = Dp.m4389constructorimpl((float) 216.0d);
        PeriodSelectorLabelTextFont = TypographyKeyTokens.TitleMedium;
        PeriodSelectorOutlineColor = ColorSchemeKeyTokens.Outline;
        PeriodSelectorOutlineWidth = Dp.m4389constructorimpl((float) 1.0d);
        PeriodSelectorSelectedContainerColor = ColorSchemeKeyTokens.TertiaryContainer;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.OnTertiaryContainer;
        PeriodSelectorSelectedFocusLabelTextColor = colorSchemeKeyTokens5;
        PeriodSelectorSelectedHoverLabelTextColor = colorSchemeKeyTokens5;
        PeriodSelectorSelectedLabelTextColor = colorSchemeKeyTokens5;
        PeriodSelectorSelectedPressedLabelTextColor = colorSchemeKeyTokens5;
        PeriodSelectorUnselectedFocusLabelTextColor = colorSchemeKeyTokens4;
        PeriodSelectorUnselectedHoverLabelTextColor = colorSchemeKeyTokens4;
        PeriodSelectorUnselectedLabelTextColor = colorSchemeKeyTokens4;
        PeriodSelectorUnselectedPressedLabelTextColor = colorSchemeKeyTokens4;
        float f6 = (float) 80.0d;
        PeriodSelectorVerticalContainerHeight = Dp.m4389constructorimpl(f6);
        PeriodSelectorVerticalContainerWidth = Dp.m4389constructorimpl((float) 52.0d);
        SurfaceTintLayerColor = ColorSchemeKeyTokens.SurfaceTint;
        TimeSelector24HVerticalContainerWidth = Dp.m4389constructorimpl((float) 114.0d);
        TimeSelectorContainerHeight = Dp.m4389constructorimpl(f6);
        TimeSelectorContainerShape = shapeKeyTokens2;
        TimeSelectorContainerWidth = Dp.m4389constructorimpl((float) 96.0d);
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.DisplayLarge;
        TimeSelectorLabelTextFont = typographyKeyTokens;
        TimeSelectorSelectedContainerColor = ColorSchemeKeyTokens.PrimaryContainer;
        ColorSchemeKeyTokens colorSchemeKeyTokens6 = ColorSchemeKeyTokens.OnPrimaryContainer;
        TimeSelectorSelectedFocusLabelTextColor = colorSchemeKeyTokens6;
        TimeSelectorSelectedHoverLabelTextColor = colorSchemeKeyTokens6;
        TimeSelectorSelectedLabelTextColor = colorSchemeKeyTokens6;
        TimeSelectorSelectedPressedLabelTextColor = colorSchemeKeyTokens6;
        TimeSelectorSeparatorColor = colorSchemeKeyTokens3;
        TimeSelectorSeparatorFont = typographyKeyTokens;
        TimeSelectorUnselectedContainerColor = colorSchemeKeyTokens;
        TimeSelectorUnselectedFocusLabelTextColor = colorSchemeKeyTokens3;
        TimeSelectorUnselectedHoverLabelTextColor = colorSchemeKeyTokens3;
        TimeSelectorUnselectedLabelTextColor = colorSchemeKeyTokens3;
        TimeSelectorUnselectedPressedLabelTextColor = colorSchemeKeyTokens3;
    }

    @NotNull
    public final ColorSchemeKeyTokens getClockDialColor() {
        return ClockDialColor;
    }

    /* JADX INFO: renamed from: getClockDialContainerSize-D9Ej5fM, reason: not valid java name */
    public final float m1981getClockDialContainerSizeD9Ej5fM() {
        return ClockDialContainerSize;
    }

    @NotNull
    public final TypographyKeyTokens getClockDialLabelTextFont() {
        return ClockDialLabelTextFont;
    }

    @NotNull
    public final ColorSchemeKeyTokens getClockDialSelectedLabelTextColor() {
        return ClockDialSelectedLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getClockDialSelectorCenterContainerColor() {
        return ClockDialSelectorCenterContainerColor;
    }

    @NotNull
    public final ShapeKeyTokens getClockDialSelectorCenterContainerShape() {
        return ClockDialSelectorCenterContainerShape;
    }

    /* JADX INFO: renamed from: getClockDialSelectorCenterContainerSize-D9Ej5fM, reason: not valid java name */
    public final float m1982getClockDialSelectorCenterContainerSizeD9Ej5fM() {
        return ClockDialSelectorCenterContainerSize;
    }

    @NotNull
    public final ColorSchemeKeyTokens getClockDialSelectorHandleContainerColor() {
        return ClockDialSelectorHandleContainerColor;
    }

    @NotNull
    public final ShapeKeyTokens getClockDialSelectorHandleContainerShape() {
        return ClockDialSelectorHandleContainerShape;
    }

    /* JADX INFO: renamed from: getClockDialSelectorHandleContainerSize-D9Ej5fM, reason: not valid java name */
    public final float m1983getClockDialSelectorHandleContainerSizeD9Ej5fM() {
        return ClockDialSelectorHandleContainerSize;
    }

    @NotNull
    public final ColorSchemeKeyTokens getClockDialSelectorTrackContainerColor() {
        return ClockDialSelectorTrackContainerColor;
    }

    /* JADX INFO: renamed from: getClockDialSelectorTrackContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m1984getClockDialSelectorTrackContainerWidthD9Ej5fM() {
        return ClockDialSelectorTrackContainerWidth;
    }

    @NotNull
    public final ShapeKeyTokens getClockDialShape() {
        return ClockDialShape;
    }

    @NotNull
    public final ColorSchemeKeyTokens getClockDialUnselectedLabelTextColor() {
        return ClockDialUnselectedLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* JADX INFO: renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1985getContainerElevationD9Ej5fM() {
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

    @NotNull
    public final ShapeKeyTokens getPeriodSelectorContainerShape() {
        return PeriodSelectorContainerShape;
    }

    /* JADX INFO: renamed from: getPeriodSelectorHorizontalContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1986getPeriodSelectorHorizontalContainerHeightD9Ej5fM() {
        return PeriodSelectorHorizontalContainerHeight;
    }

    /* JADX INFO: renamed from: getPeriodSelectorHorizontalContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m1987getPeriodSelectorHorizontalContainerWidthD9Ej5fM() {
        return PeriodSelectorHorizontalContainerWidth;
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
    public final float m1988getPeriodSelectorOutlineWidthD9Ej5fM() {
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

    /* JADX INFO: renamed from: getPeriodSelectorVerticalContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1989getPeriodSelectorVerticalContainerHeightD9Ej5fM() {
        return PeriodSelectorVerticalContainerHeight;
    }

    /* JADX INFO: renamed from: getPeriodSelectorVerticalContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m1990getPeriodSelectorVerticalContainerWidthD9Ej5fM() {
        return PeriodSelectorVerticalContainerWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSurfaceTintLayerColor() {
        return SurfaceTintLayerColor;
    }

    /* JADX INFO: renamed from: getTimeSelector24HVerticalContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m1991getTimeSelector24HVerticalContainerWidthD9Ej5fM() {
        return TimeSelector24HVerticalContainerWidth;
    }

    /* JADX INFO: renamed from: getTimeSelectorContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1992getTimeSelectorContainerHeightD9Ej5fM() {
        return TimeSelectorContainerHeight;
    }

    @NotNull
    public final ShapeKeyTokens getTimeSelectorContainerShape() {
        return TimeSelectorContainerShape;
    }

    /* JADX INFO: renamed from: getTimeSelectorContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m1993getTimeSelectorContainerWidthD9Ej5fM() {
        return TimeSelectorContainerWidth;
    }

    @NotNull
    public final TypographyKeyTokens getTimeSelectorLabelTextFont() {
        return TimeSelectorLabelTextFont;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeSelectorSelectedContainerColor() {
        return TimeSelectorSelectedContainerColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeSelectorSelectedFocusLabelTextColor() {
        return TimeSelectorSelectedFocusLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeSelectorSelectedHoverLabelTextColor() {
        return TimeSelectorSelectedHoverLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeSelectorSelectedLabelTextColor() {
        return TimeSelectorSelectedLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeSelectorSelectedPressedLabelTextColor() {
        return TimeSelectorSelectedPressedLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeSelectorSeparatorColor() {
        return TimeSelectorSeparatorColor;
    }

    @NotNull
    public final TypographyKeyTokens getTimeSelectorSeparatorFont() {
        return TimeSelectorSeparatorFont;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeSelectorUnselectedContainerColor() {
        return TimeSelectorUnselectedContainerColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeSelectorUnselectedFocusLabelTextColor() {
        return TimeSelectorUnselectedFocusLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeSelectorUnselectedHoverLabelTextColor() {
        return TimeSelectorUnselectedHoverLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeSelectorUnselectedLabelTextColor() {
        return TimeSelectorUnselectedLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTimeSelectorUnselectedPressedLabelTextColor() {
        return TimeSelectorUnselectedPressedLabelTextColor;
    }
}
