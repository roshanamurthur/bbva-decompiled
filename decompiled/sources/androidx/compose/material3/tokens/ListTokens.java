package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ListTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\ba\bÀ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b§\u0001\u0010¨\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u001a\u0010\u001a\u001a\u00020\u00178\u0006X\u0086D¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006R\u001a\u0010 \u001a\u00020\u00178\u0006X\u0086D¢\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001f\u0010\fR\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R\u001a\u0010&\u001a\u00020\u00178\u0006X\u0086D¢\u0006\f\n\u0004\b$\u0010\n\u001a\u0004\b%\u0010\fR \u0010)\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b'\u0010\n\u001a\u0004\b(\u0010\fR\u0017\u0010,\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u0004\u001a\u0004\b+\u0010\u0006R\u0017\u0010/\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u0004\u001a\u0004\b.\u0010\u0006R\u0017\u00102\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u0004\u001a\u0004\b1\u0010\u0006R\u0017\u00105\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\u0004\u001a\u0004\b4\u0010\u0006R\u0017\u00108\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\u0004\u001a\u0004\b7\u0010\u0006R\u0017\u0010;\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010\u0004\u001a\u0004\b:\u0010\u0006R\u0017\u0010>\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010\u0004\u001a\u0004\b=\u0010\u0006R\u0017\u0010A\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010\u0004\u001a\u0004\b@\u0010\u0006R\u0017\u0010D\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010\u0004\u001a\u0004\bC\u0010\u0006R\u0017\u0010G\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010\u0004\u001a\u0004\bF\u0010\u0006R\u0017\u0010M\u001a\u00020H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR \u0010P\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bN\u0010\n\u001a\u0004\bO\u0010\fR\u0017\u0010S\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010\u0004\u001a\u0004\bR\u0010\u0006R\u0017\u0010V\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bT\u0010\u0004\u001a\u0004\bU\u0010\u0006R\u0017\u0010Y\u001a\u00020H8\u0006¢\u0006\f\n\u0004\bW\u0010J\u001a\u0004\bX\u0010LR\u0017\u0010\\\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bZ\u0010\u0010\u001a\u0004\b[\u0010\u0012R \u0010_\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b]\u0010\n\u001a\u0004\b^\u0010\fR\u0017\u0010b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b`\u0010\u0004\u001a\u0004\ba\u0010\u0006R \u0010e\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bc\u0010\n\u001a\u0004\bd\u0010\fR \u0010h\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bf\u0010\n\u001a\u0004\bg\u0010\fR\u0017\u0010k\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bi\u0010\u0010\u001a\u0004\bj\u0010\u0012R \u0010m\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\n\u001a\u0004\bl\u0010\fR\u0017\u0010p\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bn\u0010\u0010\u001a\u0004\bo\u0010\u0012R \u0010s\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bq\u0010\n\u001a\u0004\br\u0010\fR \u0010v\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bt\u0010\n\u001a\u0004\bu\u0010\fR\u0017\u0010y\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bw\u0010\u0004\u001a\u0004\bx\u0010\u0006R\u0017\u0010|\u001a\u00020H8\u0006¢\u0006\f\n\u0004\bz\u0010J\u001a\u0004\b{\u0010LR\u0017\u0010\u007f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b}\u0010\u0004\u001a\u0004\b~\u0010\u0006R\u001a\u0010\u0082\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010\u0004\u001a\u0005\b\u0081\u0001\u0010\u0006R\u001a\u0010\u0085\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\u0004\u001a\u0005\b\u0084\u0001\u0010\u0006R\u001a\u0010\u0088\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010\u0004\u001a\u0005\b\u0087\u0001\u0010\u0006R#\u0010\u008b\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\n\u001a\u0005\b\u008a\u0001\u0010\fR\u001a\u0010\u008e\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010\u0004\u001a\u0005\b\u008d\u0001\u0010\u0006R\u001a\u0010\u0091\u0001\u001a\u00020H8\u0006¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010J\u001a\u0005\b\u0090\u0001\u0010LR#\u0010\u0094\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010\n\u001a\u0005\b\u0093\u0001\u0010\fR\u001a\u0010\u0097\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010\u0004\u001a\u0005\b\u0096\u0001\u0010\u0006R#\u0010\u009a\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010\n\u001a\u0005\b\u0099\u0001\u0010\fR\u001a\u0010\u009d\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010\u0004\u001a\u0005\b\u009c\u0001\u0010\u0006R\u001a\u0010 \u0001\u001a\u00020H8\u0006¢\u0006\u000e\n\u0005\b\u009e\u0001\u0010J\u001a\u0005\b\u009f\u0001\u0010LR#\u0010£\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¡\u0001\u0010\n\u001a\u0005\b¢\u0001\u0010\fR\u001a\u0010¦\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b¤\u0001\u0010\u0004\u001a\u0005\b¥\u0001\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006©\u0001"}, d2 = {"Landroidx/compose/material3/tokens/ListTokens;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getListItemContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ListItemContainerColor", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getListItemContainerElevation-D9Ej5fM", "()F", "ListItemContainerElevation", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "c", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getListItemContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ListItemContainerShape", "d", "getListItemDisabledLabelTextColor", "ListItemDisabledLabelTextColor", "", "e", "getListItemDisabledLabelTextOpacity", "ListItemDisabledLabelTextOpacity", "f", "getListItemDisabledLeadingIconColor", "ListItemDisabledLeadingIconColor", "g", "getListItemDisabledLeadingIconOpacity", "ListItemDisabledLeadingIconOpacity", "h", "getListItemDisabledTrailingIconColor", "ListItemDisabledTrailingIconColor", "i", "getListItemDisabledTrailingIconOpacity", "ListItemDisabledTrailingIconOpacity", "j", "getListItemDraggedContainerElevation-D9Ej5fM", "ListItemDraggedContainerElevation", "k", "getListItemDraggedLabelTextColor", "ListItemDraggedLabelTextColor", "l", "getListItemDraggedLeadingIconColor", "ListItemDraggedLeadingIconColor", "m", "getListItemDraggedTrailingIconColor", "ListItemDraggedTrailingIconColor", "n", "getListItemFocusLabelTextColor", "ListItemFocusLabelTextColor", "o", "getListItemFocusLeadingIconColor", "ListItemFocusLeadingIconColor", "p", "getListItemFocusTrailingIconColor", "ListItemFocusTrailingIconColor", "q", "getListItemHoverLabelTextColor", "ListItemHoverLabelTextColor", "r", "getListItemHoverLeadingIconColor", "ListItemHoverLeadingIconColor", "s", "getListItemHoverTrailingIconColor", "ListItemHoverTrailingIconColor", "t", "getListItemLabelTextColor", "ListItemLabelTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "u", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getListItemLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "ListItemLabelTextFont", SharedPrefsStorage.VERSION_KEY, "getListItemLargeLeadingVideoHeight-D9Ej5fM", "ListItemLargeLeadingVideoHeight", "w", "getListItemLeadingAvatarColor", "ListItemLeadingAvatarColor", "x", "getListItemLeadingAvatarLabelColor", "ListItemLeadingAvatarLabelColor", "y", "getListItemLeadingAvatarLabelFont", "ListItemLeadingAvatarLabelFont", "z", "getListItemLeadingAvatarShape", "ListItemLeadingAvatarShape", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getListItemLeadingAvatarSize-D9Ej5fM", "ListItemLeadingAvatarSize", "B", "getListItemLeadingIconColor", "ListItemLeadingIconColor", "C", "getListItemLeadingIconSize-D9Ej5fM", "ListItemLeadingIconSize", "D", "getListItemLeadingImageHeight-D9Ej5fM", "ListItemLeadingImageHeight", ExifInterface.LONGITUDE_EAST, "getListItemLeadingImageShape", "ListItemLeadingImageShape", "getListItemLeadingImageWidth-D9Ej5fM", "ListItemLeadingImageWidth", "G", "getListItemLeadingVideoShape", "ListItemLeadingVideoShape", "H", "getListItemLeadingVideoWidth-D9Ej5fM", "ListItemLeadingVideoWidth", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getListItemOneLineContainerHeight-D9Ej5fM", "ListItemOneLineContainerHeight", "J", "getListItemOverlineColor", "ListItemOverlineColor", "K", "getListItemOverlineFont", "ListItemOverlineFont", "L", "getListItemPressedLabelTextColor", "ListItemPressedLabelTextColor", "M", "getListItemPressedLeadingIconColor", "ListItemPressedLeadingIconColor", "N", "getListItemPressedTrailingIconColor", "ListItemPressedTrailingIconColor", "O", "getListItemSelectedTrailingIconColor", "ListItemSelectedTrailingIconColor", "P", "getListItemSmallLeadingVideoHeight-D9Ej5fM", "ListItemSmallLeadingVideoHeight", TransactionType.TRANSACTION_TYPE_CONTACTLESS_CODE, "getListItemSupportingTextColor", "ListItemSupportingTextColor", "R", "getListItemSupportingTextFont", "ListItemSupportingTextFont", ExifInterface.LATITUDE_SOUTH, "getListItemThreeLineContainerHeight-D9Ej5fM", "ListItemThreeLineContainerHeight", ExifInterface.GPS_DIRECTION_TRUE, "getListItemTrailingIconColor", "ListItemTrailingIconColor", "U", "getListItemTrailingIconSize-D9Ej5fM", "ListItemTrailingIconSize", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getListItemTrailingSupportingTextColor", "ListItemTrailingSupportingTextColor", ExifInterface.LONGITUDE_WEST, "getListItemTrailingSupportingTextFont", "ListItemTrailingSupportingTextFont", "X", "getListItemTwoLineContainerHeight-D9Ej5fM", "ListItemTwoLineContainerHeight", "Y", "getListItemUnselectedTrailingIconColor", "ListItemUnselectedTrailingIconColor", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nListTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListTokens.kt\nandroidx/compose/material3/tokens/ListTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,74:1\n164#2:75\n164#2:76\n164#2:77\n164#2:78\n164#2:79\n164#2:80\n164#2:81\n164#2:82\n164#2:83\n164#2:84\n164#2:85\n*S KotlinDebug\n*F\n+ 1 ListTokens.kt\nandroidx/compose/material3/tokens/ListTokens\n*L\n44#1:75\n49#1:76\n51#1:77\n52#1:78\n54#1:79\n56#1:80\n57#1:81\n64#1:82\n67#1:83\n69#1:84\n72#1:85\n*E\n"})
public final class ListTokens {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public static final float ListItemLeadingAvatarSize;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemLeadingIconColor;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public static final float ListItemLeadingIconSize;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public static final float ListItemLeadingImageHeight;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens ListItemLeadingImageShape;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public static final float ListItemLeadingImageWidth;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens ListItemLeadingVideoShape;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public static final float ListItemLeadingVideoWidth;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public static final float ListItemOneLineContainerHeight;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemOverlineColor;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens ListItemOverlineFont;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemPressedLabelTextColor;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemPressedLeadingIconColor;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemPressedTrailingIconColor;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemSelectedTrailingIconColor;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public static final float ListItemSmallLeadingVideoHeight;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemSupportingTextColor;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens ListItemSupportingTextFont;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public static final float ListItemThreeLineContainerHeight;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemTrailingIconColor;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public static final float ListItemTrailingIconSize;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemTrailingSupportingTextColor;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens ListItemTrailingSupportingTextFont;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public static final float ListItemTwoLineContainerHeight;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemUnselectedTrailingIconColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float ListItemContainerElevation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens ListItemContainerShape;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemDisabledLabelTextColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final float ListItemDisabledLabelTextOpacity;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemDisabledLeadingIconColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final float ListItemDisabledLeadingIconOpacity;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemDisabledTrailingIconColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final float ListItemDisabledTrailingIconOpacity;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final float ListItemDraggedContainerElevation;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemDraggedLabelTextColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemDraggedLeadingIconColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemDraggedTrailingIconColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemFocusLabelTextColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemFocusLeadingIconColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemFocusTrailingIconColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemHoverLabelTextColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemHoverLeadingIconColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemHoverTrailingIconColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemLabelTextColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens ListItemLabelTextFont;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final float ListItemLargeLeadingVideoHeight;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemLeadingAvatarColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemLeadingAvatarLabelColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens ListItemLeadingAvatarLabelFont;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens ListItemLeadingAvatarShape;

    @NotNull
    public static final ListTokens INSTANCE = new ListTokens();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ListItemContainerColor = ColorSchemeKeyTokens.Surface;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        ListItemContainerElevation = elevationTokens.m1636getLevel0D9Ej5fM();
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerNone;
        ListItemContainerShape = shapeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        ListItemDisabledLabelTextColor = colorSchemeKeyTokens;
        ListItemDisabledLabelTextOpacity = 0.3f;
        ListItemDisabledLeadingIconColor = colorSchemeKeyTokens;
        ListItemDisabledLeadingIconOpacity = 0.38f;
        ListItemDisabledTrailingIconColor = colorSchemeKeyTokens;
        ListItemDisabledTrailingIconOpacity = 0.38f;
        ListItemDraggedContainerElevation = elevationTokens.m1640getLevel4D9Ej5fM();
        ListItemDraggedLabelTextColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurfaceVariant;
        ListItemDraggedLeadingIconColor = colorSchemeKeyTokens2;
        ListItemDraggedTrailingIconColor = colorSchemeKeyTokens2;
        ListItemFocusLabelTextColor = colorSchemeKeyTokens;
        ListItemFocusLeadingIconColor = colorSchemeKeyTokens2;
        ListItemFocusTrailingIconColor = colorSchemeKeyTokens2;
        ListItemHoverLabelTextColor = colorSchemeKeyTokens;
        ListItemHoverLeadingIconColor = colorSchemeKeyTokens2;
        ListItemHoverTrailingIconColor = colorSchemeKeyTokens2;
        ListItemLabelTextColor = colorSchemeKeyTokens;
        ListItemLabelTextFont = TypographyKeyTokens.BodyLarge;
        ListItemLargeLeadingVideoHeight = Dp.m4389constructorimpl((float) 69.0d);
        ListItemLeadingAvatarColor = ColorSchemeKeyTokens.PrimaryContainer;
        ListItemLeadingAvatarLabelColor = ColorSchemeKeyTokens.OnPrimaryContainer;
        ListItemLeadingAvatarLabelFont = TypographyKeyTokens.TitleMedium;
        ListItemLeadingAvatarShape = ShapeKeyTokens.CornerFull;
        ListItemLeadingAvatarSize = Dp.m4389constructorimpl((float) 40.0d);
        ListItemLeadingIconColor = colorSchemeKeyTokens2;
        ListItemLeadingIconSize = Dp.m4389constructorimpl((float) 18.0d);
        float f6 = (float) 56.0d;
        ListItemLeadingImageHeight = Dp.m4389constructorimpl(f6);
        ListItemLeadingImageShape = shapeKeyTokens;
        ListItemLeadingImageWidth = Dp.m4389constructorimpl(f6);
        ListItemLeadingVideoShape = shapeKeyTokens;
        ListItemLeadingVideoWidth = Dp.m4389constructorimpl((float) 100.0d);
        ListItemOneLineContainerHeight = Dp.m4389constructorimpl(f6);
        ListItemOverlineColor = colorSchemeKeyTokens2;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.LabelSmall;
        ListItemOverlineFont = typographyKeyTokens;
        ListItemPressedLabelTextColor = colorSchemeKeyTokens;
        ListItemPressedLeadingIconColor = colorSchemeKeyTokens2;
        ListItemPressedTrailingIconColor = colorSchemeKeyTokens2;
        ListItemSelectedTrailingIconColor = ColorSchemeKeyTokens.Primary;
        ListItemSmallLeadingVideoHeight = Dp.m4389constructorimpl(f6);
        ListItemSupportingTextColor = colorSchemeKeyTokens2;
        ListItemSupportingTextFont = TypographyKeyTokens.BodyMedium;
        ListItemThreeLineContainerHeight = Dp.m4389constructorimpl((float) 88.0d);
        ListItemTrailingIconColor = colorSchemeKeyTokens2;
        ListItemTrailingIconSize = Dp.m4389constructorimpl((float) 24.0d);
        ListItemTrailingSupportingTextColor = colorSchemeKeyTokens2;
        ListItemTrailingSupportingTextFont = typographyKeyTokens;
        ListItemTwoLineContainerHeight = Dp.m4389constructorimpl((float) 72.0d);
        ListItemUnselectedTrailingIconColor = colorSchemeKeyTokens;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemContainerColor() {
        return ListItemContainerColor;
    }

    /* JADX INFO: renamed from: getListItemContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1767getListItemContainerElevationD9Ej5fM() {
        return ListItemContainerElevation;
    }

    @NotNull
    public final ShapeKeyTokens getListItemContainerShape() {
        return ListItemContainerShape;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemDisabledLabelTextColor() {
        return ListItemDisabledLabelTextColor;
    }

    public final float getListItemDisabledLabelTextOpacity() {
        return ListItemDisabledLabelTextOpacity;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemDisabledLeadingIconColor() {
        return ListItemDisabledLeadingIconColor;
    }

    public final float getListItemDisabledLeadingIconOpacity() {
        return ListItemDisabledLeadingIconOpacity;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemDisabledTrailingIconColor() {
        return ListItemDisabledTrailingIconColor;
    }

    public final float getListItemDisabledTrailingIconOpacity() {
        return ListItemDisabledTrailingIconOpacity;
    }

    /* JADX INFO: renamed from: getListItemDraggedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1768getListItemDraggedContainerElevationD9Ej5fM() {
        return ListItemDraggedContainerElevation;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemDraggedLabelTextColor() {
        return ListItemDraggedLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemDraggedLeadingIconColor() {
        return ListItemDraggedLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemDraggedTrailingIconColor() {
        return ListItemDraggedTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemFocusLabelTextColor() {
        return ListItemFocusLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemFocusLeadingIconColor() {
        return ListItemFocusLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemFocusTrailingIconColor() {
        return ListItemFocusTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemHoverLabelTextColor() {
        return ListItemHoverLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemHoverLeadingIconColor() {
        return ListItemHoverLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemHoverTrailingIconColor() {
        return ListItemHoverTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemLabelTextColor() {
        return ListItemLabelTextColor;
    }

    @NotNull
    public final TypographyKeyTokens getListItemLabelTextFont() {
        return ListItemLabelTextFont;
    }

    /* JADX INFO: renamed from: getListItemLargeLeadingVideoHeight-D9Ej5fM, reason: not valid java name */
    public final float m1769getListItemLargeLeadingVideoHeightD9Ej5fM() {
        return ListItemLargeLeadingVideoHeight;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemLeadingAvatarColor() {
        return ListItemLeadingAvatarColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemLeadingAvatarLabelColor() {
        return ListItemLeadingAvatarLabelColor;
    }

    @NotNull
    public final TypographyKeyTokens getListItemLeadingAvatarLabelFont() {
        return ListItemLeadingAvatarLabelFont;
    }

    @NotNull
    public final ShapeKeyTokens getListItemLeadingAvatarShape() {
        return ListItemLeadingAvatarShape;
    }

    /* JADX INFO: renamed from: getListItemLeadingAvatarSize-D9Ej5fM, reason: not valid java name */
    public final float m1770getListItemLeadingAvatarSizeD9Ej5fM() {
        return ListItemLeadingAvatarSize;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemLeadingIconColor() {
        return ListItemLeadingIconColor;
    }

    /* JADX INFO: renamed from: getListItemLeadingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1771getListItemLeadingIconSizeD9Ej5fM() {
        return ListItemLeadingIconSize;
    }

    /* JADX INFO: renamed from: getListItemLeadingImageHeight-D9Ej5fM, reason: not valid java name */
    public final float m1772getListItemLeadingImageHeightD9Ej5fM() {
        return ListItemLeadingImageHeight;
    }

    @NotNull
    public final ShapeKeyTokens getListItemLeadingImageShape() {
        return ListItemLeadingImageShape;
    }

    /* JADX INFO: renamed from: getListItemLeadingImageWidth-D9Ej5fM, reason: not valid java name */
    public final float m1773getListItemLeadingImageWidthD9Ej5fM() {
        return ListItemLeadingImageWidth;
    }

    @NotNull
    public final ShapeKeyTokens getListItemLeadingVideoShape() {
        return ListItemLeadingVideoShape;
    }

    /* JADX INFO: renamed from: getListItemLeadingVideoWidth-D9Ej5fM, reason: not valid java name */
    public final float m1774getListItemLeadingVideoWidthD9Ej5fM() {
        return ListItemLeadingVideoWidth;
    }

    /* JADX INFO: renamed from: getListItemOneLineContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1775getListItemOneLineContainerHeightD9Ej5fM() {
        return ListItemOneLineContainerHeight;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemOverlineColor() {
        return ListItemOverlineColor;
    }

    @NotNull
    public final TypographyKeyTokens getListItemOverlineFont() {
        return ListItemOverlineFont;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemPressedLabelTextColor() {
        return ListItemPressedLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemPressedLeadingIconColor() {
        return ListItemPressedLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemPressedTrailingIconColor() {
        return ListItemPressedTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemSelectedTrailingIconColor() {
        return ListItemSelectedTrailingIconColor;
    }

    /* JADX INFO: renamed from: getListItemSmallLeadingVideoHeight-D9Ej5fM, reason: not valid java name */
    public final float m1776getListItemSmallLeadingVideoHeightD9Ej5fM() {
        return ListItemSmallLeadingVideoHeight;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemSupportingTextColor() {
        return ListItemSupportingTextColor;
    }

    @NotNull
    public final TypographyKeyTokens getListItemSupportingTextFont() {
        return ListItemSupportingTextFont;
    }

    /* JADX INFO: renamed from: getListItemThreeLineContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1777getListItemThreeLineContainerHeightD9Ej5fM() {
        return ListItemThreeLineContainerHeight;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemTrailingIconColor() {
        return ListItemTrailingIconColor;
    }

    /* JADX INFO: renamed from: getListItemTrailingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1778getListItemTrailingIconSizeD9Ej5fM() {
        return ListItemTrailingIconSize;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemTrailingSupportingTextColor() {
        return ListItemTrailingSupportingTextColor;
    }

    @NotNull
    public final TypographyKeyTokens getListItemTrailingSupportingTextFont() {
        return ListItemTrailingSupportingTextFont;
    }

    /* JADX INFO: renamed from: getListItemTwoLineContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1779getListItemTwoLineContainerHeightD9Ej5fM() {
        return ListItemTwoLineContainerHeight;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemUnselectedTrailingIconColor() {
        return ListItemUnselectedTrailingIconColor;
    }
}
