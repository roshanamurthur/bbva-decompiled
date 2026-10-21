package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InputChipTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0003\b\u0085\u0001\bÀ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b§\u0001\u0010¨\u0001R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0017\u0010\u001b\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0017\u0010\u001f\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015R\u0014\u0010 \u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0004R \u0010#\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010,\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b*\u0010\u0013\u001a\u0004\b+\u0010\u0015R\u0017\u0010/\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b-\u0010\u0013\u001a\u0004\b.\u0010\u0015R\u0017\u00102\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b0\u0010\u0013\u001a\u0004\b1\u0010\u0015R\u0017\u00105\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b3\u0010\u0013\u001a\u0004\b4\u0010\u0015R\u0017\u00108\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b6\u0010\u0013\u001a\u0004\b7\u0010\u0015R \u0010;\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b9\u0010\u0004\u001a\u0004\b:\u0010\u0006R\u0017\u0010>\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b<\u0010\u0013\u001a\u0004\b=\u0010\u0015R\u0017\u0010A\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b?\u0010\u0013\u001a\u0004\b@\u0010\u0015R\u0017\u0010D\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bB\u0010\u0013\u001a\u0004\bC\u0010\u0015R\u0017\u0010G\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bE\u0010\u0013\u001a\u0004\bF\u0010\u0015R\u0017\u0010J\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bH\u0010\u0013\u001a\u0004\bI\u0010\u0015R\u0017\u0010M\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bK\u0010\u0013\u001a\u0004\bL\u0010\u0015R\u0017\u0010P\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bN\u0010\u0013\u001a\u0004\bO\u0010\u0015R \u0010S\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bQ\u0010\u0004\u001a\u0004\bR\u0010\u0006R\u0017\u0010V\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bT\u0010\u0013\u001a\u0004\bU\u0010\u0015R\u0017\u0010Y\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bW\u0010\r\u001a\u0004\bX\u0010\u000fR \u0010\\\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bZ\u0010\u0004\u001a\u0004\b[\u0010\u0006R\u0014\u0010]\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b]\u0010\u0004R\u0017\u0010`\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b^\u0010\u0013\u001a\u0004\b_\u0010\u0015R\u0014\u0010a\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\ba\u0010\u0004R \u0010d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bb\u0010\u0004\u001a\u0004\bc\u0010\u0006R\u0017\u0010g\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\be\u0010\u0013\u001a\u0004\bf\u0010\u0015R\u0017\u0010j\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bh\u0010\u0013\u001a\u0004\bi\u0010\u0015R\u0017\u0010m\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bk\u0010\u0013\u001a\u0004\bl\u0010\u0015R\u0017\u0010p\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bn\u0010\u0013\u001a\u0004\bo\u0010\u0015R\u0017\u0010r\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\bq\u0010\u0015R\u0017\u0010u\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bs\u0010\u0013\u001a\u0004\bt\u0010\u0015R\u0017\u0010x\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bv\u0010\u0013\u001a\u0004\bw\u0010\u0015R\u0017\u0010{\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\by\u0010\u0013\u001a\u0004\bz\u0010\u0015R\u0017\u0010~\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b|\u0010\u0013\u001a\u0004\b}\u0010\u0015R\u0019\u0010\u0081\u0001\u001a\u00020\u00118\u0006¢\u0006\r\n\u0004\b\u007f\u0010\u0013\u001a\u0005\b\u0080\u0001\u0010\u0015R\u001a\u0010\u0084\u0001\u001a\u00020\u00118\u0006¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010\u0013\u001a\u0005\b\u0083\u0001\u0010\u0015R\u0016\u0010\u0085\u0001\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010\u0004R\u001a\u0010\u0088\u0001\u001a\u00020\u00118\u0006¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010\u0013\u001a\u0005\b\u0087\u0001\u0010\u0015R\u001a\u0010\u008b\u0001\u001a\u00020\u00118\u0006¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\u0013\u001a\u0005\b\u008a\u0001\u0010\u0015R\u001a\u0010\u008e\u0001\u001a\u00020\u00118\u0006¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010\u0013\u001a\u0005\b\u008d\u0001\u0010\u0015R\u001a\u0010\u0091\u0001\u001a\u00020\u00118\u0006¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010\u0013\u001a\u0005\b\u0090\u0001\u0010\u0015R\u001a\u0010\u0094\u0001\u001a\u00020\u00118\u0006¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010\u0013\u001a\u0005\b\u0093\u0001\u0010\u0015R#\u0010\u0097\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010\u0004\u001a\u0005\b\u0096\u0001\u0010\u0006R\u001a\u0010\u009a\u0001\u001a\u00020\u00118\u0006¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010\u0013\u001a\u0005\b\u0099\u0001\u0010\u0015R\u001a\u0010\u009d\u0001\u001a\u00020\u00118\u0006¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010\u0013\u001a\u0005\b\u009c\u0001\u0010\u0015R\u001a\u0010 \u0001\u001a\u00020\u00118\u0006¢\u0006\u000e\n\u0005\b\u009e\u0001\u0010\u0013\u001a\u0005\b\u009f\u0001\u0010\u0015R\u001a\u0010£\u0001\u001a\u00020\u00118\u0006¢\u0006\u000e\n\u0005\b¡\u0001\u0010\u0013\u001a\u0005\b¢\u0001\u0010\u0015R\u001a\u0010¦\u0001\u001a\u00020\u00118\u0006¢\u0006\u000e\n\u0005\b¤\u0001\u0010\u0013\u001a\u0005\b¥\u0001\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006©\u0001"}, d2 = {"Landroidx/compose/material3/tokens/InputChipTokens;", "", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getContainerElevation-D9Ej5fM", "()F", "ContainerElevation", "b", "getContainerHeight-D9Ej5fM", "ContainerHeight", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "c", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "d", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getDisabledLabelTextColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "DisabledLabelTextColor", "", "DisabledLabelTextOpacity", "e", "getDisabledSelectedContainerColor", "DisabledSelectedContainerColor", "DisabledSelectedContainerOpacity", "f", "getDisabledUnselectedOutlineColor", "DisabledUnselectedOutlineColor", "DisabledUnselectedOutlineOpacity", "g", "getDraggedContainerElevation-D9Ej5fM", "DraggedContainerElevation", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "h", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LabelTextFont", "i", "getSelectedContainerColor", "SelectedContainerColor", "j", "getSelectedDraggedLabelTextColor", "SelectedDraggedLabelTextColor", "k", "getSelectedFocusLabelTextColor", "SelectedFocusLabelTextColor", "l", "getSelectedHoverLabelTextColor", "SelectedHoverLabelTextColor", "m", "getSelectedLabelTextColor", "SelectedLabelTextColor", "n", "getSelectedOutlineWidth-D9Ej5fM", "SelectedOutlineWidth", "o", "getSelectedPressedLabelTextColor", "SelectedPressedLabelTextColor", "p", "getUnselectedDraggedLabelTextColor", "UnselectedDraggedLabelTextColor", "q", "getUnselectedFocusLabelTextColor", "UnselectedFocusLabelTextColor", "r", "getUnselectedFocusOutlineColor", "UnselectedFocusOutlineColor", "s", "getUnselectedHoverLabelTextColor", "UnselectedHoverLabelTextColor", "t", "getUnselectedLabelTextColor", "UnselectedLabelTextColor", "u", "getUnselectedOutlineColor", "UnselectedOutlineColor", SharedPrefsStorage.VERSION_KEY, "getUnselectedOutlineWidth-D9Ej5fM", "UnselectedOutlineWidth", "w", "getUnselectedPressedLabelTextColor", "UnselectedPressedLabelTextColor", "x", "getAvatarShape", "AvatarShape", "y", "getAvatarSize-D9Ej5fM", "AvatarSize", "DisabledAvatarOpacity", "z", "getDisabledLeadingIconColor", "DisabledLeadingIconColor", "DisabledLeadingIconOpacity", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getLeadingIconSize-D9Ej5fM", "LeadingIconSize", "B", "getSelectedDraggedLeadingIconColor", "SelectedDraggedLeadingIconColor", "C", "getSelectedFocusLeadingIconColor", "SelectedFocusLeadingIconColor", "D", "getSelectedHoverLeadingIconColor", "SelectedHoverLeadingIconColor", ExifInterface.LONGITUDE_EAST, "getSelectedLeadingIconColor", "SelectedLeadingIconColor", "getSelectedPressedLeadingIconColor", "SelectedPressedLeadingIconColor", "G", "getUnselectedDraggedLeadingIconColor", "UnselectedDraggedLeadingIconColor", "H", "getUnselectedFocusLeadingIconColor", "UnselectedFocusLeadingIconColor", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getUnselectedHoverLeadingIconColor", "UnselectedHoverLeadingIconColor", "J", "getUnselectedLeadingIconColor", "UnselectedLeadingIconColor", "K", "getUnselectedPressedLeadingIconColor", "UnselectedPressedLeadingIconColor", "L", "getDisabledTrailingIconColor", "DisabledTrailingIconColor", "DisabledTrailingIconOpacity", "M", "getSelectedDraggedTrailingIconColor", "SelectedDraggedTrailingIconColor", "N", "getSelectedFocusTrailingIconColor", "SelectedFocusTrailingIconColor", "O", "getSelectedHoverTrailingIconColor", "SelectedHoverTrailingIconColor", "P", "getSelectedPressedTrailingIconColor", "SelectedPressedTrailingIconColor", TransactionType.TRANSACTION_TYPE_CONTACTLESS_CODE, "getSelectedTrailingIconColor", "SelectedTrailingIconColor", "R", "getTrailingIconSize-D9Ej5fM", "TrailingIconSize", ExifInterface.LATITUDE_SOUTH, "getUnselectedDraggedTrailingIconColor", "UnselectedDraggedTrailingIconColor", ExifInterface.GPS_DIRECTION_TRUE, "getUnselectedFocusTrailingIconColor", "UnselectedFocusTrailingIconColor", "U", "getUnselectedHoverTrailingIconColor", "UnselectedHoverTrailingIconColor", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getUnselectedPressedTrailingIconColor", "UnselectedPressedTrailingIconColor", ExifInterface.LONGITUDE_WEST, "getUnselectedTrailingIconColor", "UnselectedTrailingIconColor", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInputChipTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputChipTokens.kt\nandroidx/compose/material3/tokens/InputChipTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,79:1\n164#2:80\n164#2:81\n164#2:82\n164#2:83\n164#2:84\n164#2:85\n*S KotlinDebug\n*F\n+ 1 InputChipTokens.kt\nandroidx/compose/material3/tokens/InputChipTokens\n*L\n25#1:80\n40#1:81\n48#1:82\n51#1:83\n55#1:84\n73#1:85\n*E\n"})
public final class InputChipTokens {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public static final float LeadingIconSize;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedDraggedLeadingIconColor;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedFocusLeadingIconColor;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedHoverLeadingIconColor;
    public static final float DisabledAvatarOpacity = 0.38f;
    public static final float DisabledLabelTextOpacity = 0.38f;
    public static final float DisabledLeadingIconOpacity = 0.38f;
    public static final float DisabledSelectedContainerOpacity = 0.12f;
    public static final float DisabledTrailingIconOpacity = 0.38f;
    public static final float DisabledUnselectedOutlineOpacity = 0.12f;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedLeadingIconColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedPressedLeadingIconColor;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedDraggedLeadingIconColor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedFocusLeadingIconColor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedHoverLeadingIconColor;

    @NotNull
    public static final InputChipTokens INSTANCE = new InputChipTokens();

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedLeadingIconColor;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedPressedLeadingIconColor;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledTrailingIconColor;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedDraggedTrailingIconColor;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedFocusTrailingIconColor;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedHoverTrailingIconColor;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedPressedTrailingIconColor;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedTrailingIconColor;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public static final float TrailingIconSize;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedDraggedTrailingIconColor;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedFocusTrailingIconColor;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedHoverTrailingIconColor;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedPressedTrailingIconColor;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedTrailingIconColor;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final float ContainerElevation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float ContainerHeight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens ContainerShape;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledLabelTextColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledSelectedContainerColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledUnselectedOutlineColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final float DraggedContainerElevation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens LabelTextFont;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedContainerColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedDraggedLabelTextColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedFocusLabelTextColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedHoverLabelTextColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedLabelTextColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final float SelectedOutlineWidth;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedPressedLabelTextColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedDraggedLabelTextColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedFocusLabelTextColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedFocusOutlineColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedHoverLabelTextColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedLabelTextColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedOutlineColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final float UnselectedOutlineWidth;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedPressedLabelTextColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens AvatarShape;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final float AvatarSize;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledLeadingIconColor;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ContainerElevation = elevationTokens.m1636getLevel0D9Ej5fM();
        ContainerHeight = Dp.m4389constructorimpl((float) 32.0d);
        ContainerShape = ShapeKeyTokens.CornerSmall;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        DisabledLabelTextColor = colorSchemeKeyTokens;
        DisabledSelectedContainerColor = colorSchemeKeyTokens;
        DisabledUnselectedOutlineColor = colorSchemeKeyTokens;
        DraggedContainerElevation = elevationTokens.m1640getLevel4D9Ej5fM();
        LabelTextFont = TypographyKeyTokens.LabelLarge;
        SelectedContainerColor = ColorSchemeKeyTokens.SecondaryContainer;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSecondaryContainer;
        SelectedDraggedLabelTextColor = colorSchemeKeyTokens2;
        SelectedFocusLabelTextColor = colorSchemeKeyTokens2;
        SelectedHoverLabelTextColor = colorSchemeKeyTokens2;
        SelectedLabelTextColor = colorSchemeKeyTokens2;
        SelectedOutlineWidth = Dp.m4389constructorimpl((float) 0.0d);
        SelectedPressedLabelTextColor = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurfaceVariant;
        UnselectedDraggedLabelTextColor = colorSchemeKeyTokens3;
        UnselectedFocusLabelTextColor = colorSchemeKeyTokens3;
        UnselectedFocusOutlineColor = colorSchemeKeyTokens3;
        UnselectedHoverLabelTextColor = colorSchemeKeyTokens3;
        UnselectedLabelTextColor = colorSchemeKeyTokens3;
        UnselectedOutlineColor = ColorSchemeKeyTokens.Outline;
        UnselectedOutlineWidth = Dp.m4389constructorimpl((float) 1.0d);
        UnselectedPressedLabelTextColor = colorSchemeKeyTokens3;
        AvatarShape = ShapeKeyTokens.CornerFull;
        AvatarSize = Dp.m4389constructorimpl((float) 24.0d);
        DisabledLeadingIconColor = colorSchemeKeyTokens;
        float f6 = (float) 18.0d;
        LeadingIconSize = Dp.m4389constructorimpl(f6);
        SelectedDraggedLeadingIconColor = colorSchemeKeyTokens2;
        SelectedFocusLeadingIconColor = colorSchemeKeyTokens2;
        SelectedHoverLeadingIconColor = colorSchemeKeyTokens2;
        SelectedLeadingIconColor = colorSchemeKeyTokens2;
        SelectedPressedLeadingIconColor = colorSchemeKeyTokens2;
        UnselectedDraggedLeadingIconColor = colorSchemeKeyTokens3;
        UnselectedFocusLeadingIconColor = colorSchemeKeyTokens3;
        UnselectedHoverLeadingIconColor = colorSchemeKeyTokens3;
        UnselectedLeadingIconColor = colorSchemeKeyTokens3;
        UnselectedPressedLeadingIconColor = colorSchemeKeyTokens3;
        DisabledTrailingIconColor = colorSchemeKeyTokens;
        SelectedDraggedTrailingIconColor = colorSchemeKeyTokens2;
        SelectedFocusTrailingIconColor = colorSchemeKeyTokens2;
        SelectedHoverTrailingIconColor = colorSchemeKeyTokens2;
        SelectedPressedTrailingIconColor = colorSchemeKeyTokens2;
        SelectedTrailingIconColor = colorSchemeKeyTokens2;
        TrailingIconSize = Dp.m4389constructorimpl(f6);
        UnselectedDraggedTrailingIconColor = colorSchemeKeyTokens3;
        UnselectedFocusTrailingIconColor = colorSchemeKeyTokens3;
        UnselectedHoverTrailingIconColor = colorSchemeKeyTokens3;
        UnselectedPressedTrailingIconColor = colorSchemeKeyTokens3;
        UnselectedTrailingIconColor = colorSchemeKeyTokens3;
    }

    @NotNull
    public final ShapeKeyTokens getAvatarShape() {
        return AvatarShape;
    }

    /* JADX INFO: renamed from: getAvatarSize-D9Ej5fM, reason: not valid java name */
    public final float m1757getAvatarSizeD9Ej5fM() {
        return AvatarSize;
    }

    /* JADX INFO: renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1758getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    /* JADX INFO: renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1759getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    @NotNull
    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledLabelTextColor() {
        return DisabledLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledLeadingIconColor() {
        return DisabledLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledSelectedContainerColor() {
        return DisabledSelectedContainerColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledTrailingIconColor() {
        return DisabledTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledUnselectedOutlineColor() {
        return DisabledUnselectedOutlineColor;
    }

    /* JADX INFO: renamed from: getDraggedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1760getDraggedContainerElevationD9Ej5fM() {
        return DraggedContainerElevation;
    }

    @NotNull
    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
    }

    /* JADX INFO: renamed from: getLeadingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1761getLeadingIconSizeD9Ej5fM() {
        return LeadingIconSize;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedContainerColor() {
        return SelectedContainerColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedDraggedLabelTextColor() {
        return SelectedDraggedLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedDraggedLeadingIconColor() {
        return SelectedDraggedLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedDraggedTrailingIconColor() {
        return SelectedDraggedTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedFocusLabelTextColor() {
        return SelectedFocusLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedFocusLeadingIconColor() {
        return SelectedFocusLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedFocusTrailingIconColor() {
        return SelectedFocusTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedHoverLabelTextColor() {
        return SelectedHoverLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedHoverLeadingIconColor() {
        return SelectedHoverLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedHoverTrailingIconColor() {
        return SelectedHoverTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedLabelTextColor() {
        return SelectedLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedLeadingIconColor() {
        return SelectedLeadingIconColor;
    }

    /* JADX INFO: renamed from: getSelectedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1762getSelectedOutlineWidthD9Ej5fM() {
        return SelectedOutlineWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedPressedLabelTextColor() {
        return SelectedPressedLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedPressedLeadingIconColor() {
        return SelectedPressedLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedPressedTrailingIconColor() {
        return SelectedPressedTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedTrailingIconColor() {
        return SelectedTrailingIconColor;
    }

    /* JADX INFO: renamed from: getTrailingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1763getTrailingIconSizeD9Ej5fM() {
        return TrailingIconSize;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedDraggedLabelTextColor() {
        return UnselectedDraggedLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedDraggedLeadingIconColor() {
        return UnselectedDraggedLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedDraggedTrailingIconColor() {
        return UnselectedDraggedTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedFocusLabelTextColor() {
        return UnselectedFocusLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedFocusLeadingIconColor() {
        return UnselectedFocusLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedFocusOutlineColor() {
        return UnselectedFocusOutlineColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedFocusTrailingIconColor() {
        return UnselectedFocusTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedHoverLabelTextColor() {
        return UnselectedHoverLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedHoverLeadingIconColor() {
        return UnselectedHoverLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedHoverTrailingIconColor() {
        return UnselectedHoverTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedLabelTextColor() {
        return UnselectedLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedLeadingIconColor() {
        return UnselectedLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedOutlineColor() {
        return UnselectedOutlineColor;
    }

    /* JADX INFO: renamed from: getUnselectedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1764getUnselectedOutlineWidthD9Ej5fM() {
        return UnselectedOutlineWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedPressedLabelTextColor() {
        return UnselectedPressedLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedPressedLeadingIconColor() {
        return UnselectedPressedLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedPressedTrailingIconColor() {
        return UnselectedPressedTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedTrailingIconColor() {
        return UnselectedTrailingIconColor;
    }
}
