package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FilterChipTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\bI\n\u0002\u0018\u0002\n\u0002\bl\bÀ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\bË\u0001\u0010Ì\u0001R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R \u0010\u001b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R \u0010\u001e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0004\u001a\u0004\b\u001d\u0010\u0006R\u0017\u0010!\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010\u0012R \u0010$\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010\u0006R\u0014\u0010%\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0004R \u0010(\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b&\u0010\u0004\u001a\u0004\b'\u0010\u0006R \u0010+\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R \u0010.\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006R\u0017\u00101\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b/\u0010\u0010\u001a\u0004\b0\u0010\u0012R\u0017\u00104\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b2\u0010\u0010\u001a\u0004\b3\u0010\u0012R \u00107\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006R\u0017\u0010:\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b8\u0010\u0010\u001a\u0004\b9\u0010\u0012R\u0014\u0010;\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010\u0004R\u0017\u0010>\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b<\u0010\u0010\u001a\u0004\b=\u0010\u0012R\u0014\u0010?\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u0010\u0004R\u0017\u0010B\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b@\u0010\u0010\u001a\u0004\bA\u0010\u0012R \u0010E\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bC\u0010\u0004\u001a\u0004\bD\u0010\u0006R \u0010H\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bF\u0010\u0004\u001a\u0004\bG\u0010\u0006R \u0010K\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bI\u0010\u0004\u001a\u0004\bJ\u0010\u0006R \u0010N\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bL\u0010\u0004\u001a\u0004\bM\u0010\u0006R \u0010Q\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bO\u0010\u0004\u001a\u0004\bP\u0010\u0006R\u0017\u0010T\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bR\u0010\u0010\u001a\u0004\bS\u0010\u0012R \u0010W\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bU\u0010\u0004\u001a\u0004\bV\u0010\u0006R\u0017\u0010Z\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bX\u0010\u0010\u001a\u0004\bY\u0010\u0012R \u0010]\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b[\u0010\u0004\u001a\u0004\b\\\u0010\u0006R \u0010`\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b^\u0010\u0004\u001a\u0004\b_\u0010\u0006R\u0017\u0010f\u001a\u00020a8\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u0017\u0010i\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bg\u0010\u0010\u001a\u0004\bh\u0010\u0012R\u0017\u0010l\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bj\u0010\u0010\u001a\u0004\bk\u0010\u0012R\u0017\u0010o\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bm\u0010\u0010\u001a\u0004\bn\u0010\u0012R\u0017\u0010q\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\bp\u0010\u0012R\u0017\u0010t\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\br\u0010\u0010\u001a\u0004\bs\u0010\u0012R\u0017\u0010w\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bu\u0010\u0010\u001a\u0004\bv\u0010\u0012R\u0017\u0010z\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bx\u0010\u0010\u001a\u0004\by\u0010\u0012R\u0017\u0010}\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b{\u0010\u0010\u001a\u0004\b|\u0010\u0012R\u0018\u0010\u0080\u0001\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b~\u0010\u0010\u001a\u0004\b\u007f\u0010\u0012R\u001a\u0010\u0083\u0001\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\u0010\u001a\u0005\b\u0082\u0001\u0010\u0012R#\u0010\u0086\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010\u0004\u001a\u0005\b\u0085\u0001\u0010\u0006R\u001a\u0010\u0089\u0001\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\u0010\u001a\u0005\b\u0088\u0001\u0010\u0012R\u0016\u0010\u008a\u0001\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010\u0004R\u001a\u0010\u008d\u0001\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\u0010\u001a\u0005\b\u008c\u0001\u0010\u0012R\u001a\u0010\u0090\u0001\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010\u0010\u001a\u0005\b\u008f\u0001\u0010\u0012R\u001a\u0010\u0093\u0001\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010\u0010\u001a\u0005\b\u0092\u0001\u0010\u0012R\u001a\u0010\u0096\u0001\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010\u0010\u001a\u0005\b\u0095\u0001\u0010\u0012R\u001a\u0010\u0099\u0001\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010\u0010\u001a\u0005\b\u0098\u0001\u0010\u0012R\u001a\u0010\u009c\u0001\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b\u009a\u0001\u0010\u0010\u001a\u0005\b\u009b\u0001\u0010\u0012R\u001a\u0010\u009f\u0001\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010\u0010\u001a\u0005\b\u009e\u0001\u0010\u0012R\u001a\u0010¢\u0001\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b \u0001\u0010\u0010\u001a\u0005\b¡\u0001\u0010\u0012R\u001a\u0010¥\u0001\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b£\u0001\u0010\u0010\u001a\u0005\b¤\u0001\u0010\u0012R\u001a\u0010¨\u0001\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b¦\u0001\u0010\u0010\u001a\u0005\b§\u0001\u0010\u0012R\u001a\u0010«\u0001\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b©\u0001\u0010\u0010\u001a\u0005\bª\u0001\u0010\u0012R\u0016\u0010¬\u0001\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0007\n\u0005\b¬\u0001\u0010\u0004R\u001a\u0010¯\u0001\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b\u00ad\u0001\u0010\u0010\u001a\u0005\b®\u0001\u0010\u0012R\u001a\u0010²\u0001\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b°\u0001\u0010\u0010\u001a\u0005\b±\u0001\u0010\u0012R\u001a\u0010µ\u0001\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b³\u0001\u0010\u0010\u001a\u0005\b´\u0001\u0010\u0012R\u001a\u0010¸\u0001\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b¶\u0001\u0010\u0010\u001a\u0005\b·\u0001\u0010\u0012R\u001a\u0010»\u0001\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b¹\u0001\u0010\u0010\u001a\u0005\bº\u0001\u0010\u0012R\u001a\u0010¾\u0001\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b¼\u0001\u0010\u0010\u001a\u0005\b½\u0001\u0010\u0012R\u001a\u0010Á\u0001\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b¿\u0001\u0010\u0010\u001a\u0005\bÀ\u0001\u0010\u0012R\u001a\u0010Ä\u0001\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\bÂ\u0001\u0010\u0010\u001a\u0005\bÃ\u0001\u0010\u0012R\u001a\u0010Ç\u0001\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\bÅ\u0001\u0010\u0010\u001a\u0005\bÆ\u0001\u0010\u0012R\u001a\u0010Ê\u0001\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\bÈ\u0001\u0010\u0010\u001a\u0005\bÉ\u0001\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Í\u0001"}, d2 = {"Landroidx/compose/material3/tokens/FilterChipTokens;", "", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getContainerHeight-D9Ej5fM", "()F", "ContainerHeight", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "b", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "c", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getContainerSurfaceTintLayerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerSurfaceTintLayerColor", "d", "getDisabledLabelTextColor", "DisabledLabelTextColor", "", "DisabledLabelTextOpacity", "e", "getDraggedContainerElevation-D9Ej5fM", "DraggedContainerElevation", "f", "getElevatedContainerElevation-D9Ej5fM", "ElevatedContainerElevation", "g", "getElevatedDisabledContainerColor", "ElevatedDisabledContainerColor", "h", "getElevatedDisabledContainerElevation-D9Ej5fM", "ElevatedDisabledContainerElevation", "ElevatedDisabledContainerOpacity", "i", "getElevatedFocusContainerElevation-D9Ej5fM", "ElevatedFocusContainerElevation", "j", "getElevatedHoverContainerElevation-D9Ej5fM", "ElevatedHoverContainerElevation", "k", "getElevatedPressedContainerElevation-D9Ej5fM", "ElevatedPressedContainerElevation", "l", "getElevatedSelectedContainerColor", "ElevatedSelectedContainerColor", "m", "getElevatedUnselectedContainerColor", "ElevatedUnselectedContainerColor", "n", "getFlatContainerElevation-D9Ej5fM", "FlatContainerElevation", "o", "getFlatDisabledSelectedContainerColor", "FlatDisabledSelectedContainerColor", "FlatDisabledSelectedContainerOpacity", "p", "getFlatDisabledUnselectedOutlineColor", "FlatDisabledUnselectedOutlineColor", "FlatDisabledUnselectedOutlineOpacity", "q", "getFlatSelectedContainerColor", "FlatSelectedContainerColor", "r", "getFlatSelectedFocusContainerElevation-D9Ej5fM", "FlatSelectedFocusContainerElevation", "s", "getFlatSelectedHoverContainerElevation-D9Ej5fM", "FlatSelectedHoverContainerElevation", "t", "getFlatSelectedOutlineWidth-D9Ej5fM", "FlatSelectedOutlineWidth", "u", "getFlatSelectedPressedContainerElevation-D9Ej5fM", "FlatSelectedPressedContainerElevation", SharedPrefsStorage.VERSION_KEY, "getFlatUnselectedFocusContainerElevation-D9Ej5fM", "FlatUnselectedFocusContainerElevation", "w", "getFlatUnselectedFocusOutlineColor", "FlatUnselectedFocusOutlineColor", "x", "getFlatUnselectedHoverContainerElevation-D9Ej5fM", "FlatUnselectedHoverContainerElevation", "y", "getFlatUnselectedOutlineColor", "FlatUnselectedOutlineColor", "z", "getFlatUnselectedOutlineWidth-D9Ej5fM", "FlatUnselectedOutlineWidth", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getFlatUnselectedPressedContainerElevation-D9Ej5fM", "FlatUnselectedPressedContainerElevation", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "B", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LabelTextFont", "C", "getSelectedDraggedLabelTextColor", "SelectedDraggedLabelTextColor", "D", "getSelectedFocusLabelTextColor", "SelectedFocusLabelTextColor", ExifInterface.LONGITUDE_EAST, "getSelectedHoverLabelTextColor", "SelectedHoverLabelTextColor", "getSelectedLabelTextColor", "SelectedLabelTextColor", "G", "getSelectedPressedLabelTextColor", "SelectedPressedLabelTextColor", "H", "getUnselectedDraggedLabelTextColor", "UnselectedDraggedLabelTextColor", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getUnselectedFocusLabelTextColor", "UnselectedFocusLabelTextColor", "J", "getUnselectedHoverLabelTextColor", "UnselectedHoverLabelTextColor", "K", "getUnselectedLabelTextColor", "UnselectedLabelTextColor", "L", "getUnselectedPressedLabelTextColor", "UnselectedPressedLabelTextColor", "M", "getIconSize-D9Ej5fM", "IconSize", "N", "getDisabledLeadingIconColor", "DisabledLeadingIconColor", "DisabledLeadingIconOpacity", "O", "getLeadingIconUnselectedColor", "LeadingIconUnselectedColor", "P", "getSelectedDraggedLeadingIconColor", "SelectedDraggedLeadingIconColor", TransactionType.TRANSACTION_TYPE_CONTACTLESS_CODE, "getSelectedFocusLeadingIconColor", "SelectedFocusLeadingIconColor", "R", "getSelectedHoverLeadingIconColor", "SelectedHoverLeadingIconColor", ExifInterface.LATITUDE_SOUTH, "getSelectedLeadingIconColor", "SelectedLeadingIconColor", ExifInterface.GPS_DIRECTION_TRUE, "getSelectedPressedLeadingIconColor", "SelectedPressedLeadingIconColor", "U", "getUnselectedDraggedLeadingIconColor", "UnselectedDraggedLeadingIconColor", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getUnselectedFocusLeadingIconColor", "UnselectedFocusLeadingIconColor", ExifInterface.LONGITUDE_WEST, "getUnselectedHoverLeadingIconColor", "UnselectedHoverLeadingIconColor", "X", "getUnselectedPressedLeadingIconColor", "UnselectedPressedLeadingIconColor", "Y", "getDisabledTrailingIconColor", "DisabledTrailingIconColor", "DisabledTrailingIconOpacity", "Z", "getSelectedDraggedTrailingIconColor", "SelectedDraggedTrailingIconColor", "a0", "getSelectedFocusTrailingIconColor", "SelectedFocusTrailingIconColor", "b0", "getSelectedHoverTrailingIconColor", "SelectedHoverTrailingIconColor", "c0", "getSelectedPressedTrailingIconColor", "SelectedPressedTrailingIconColor", "d0", "getSelectedTrailingIconColor", "SelectedTrailingIconColor", "e0", "getTrailingIconUnselectedColor", "TrailingIconUnselectedColor", "f0", "getUnselectedDraggedTrailingIconColor", "UnselectedDraggedTrailingIconColor", "g0", "getUnselectedFocusTrailingIconColor", "UnselectedFocusTrailingIconColor", "h0", "getUnselectedHoverTrailingIconColor", "UnselectedHoverTrailingIconColor", "i0", "getUnselectedPressedTrailingIconColor", "UnselectedPressedTrailingIconColor", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFilterChipTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterChipTokens.kt\nandroidx/compose/material3/tokens/FilterChipTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,91:1\n164#2:92\n164#2:93\n164#2:94\n164#2:95\n*S KotlinDebug\n*F\n+ 1 FilterChipTokens.kt\nandroidx/compose/material3/tokens/FilterChipTokens\n*L\n24#1:92\n47#1:93\n53#1:94\n66#1:95\n*E\n"})
public final class FilterChipTokens {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public static final float FlatUnselectedPressedContainerElevation;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens LabelTextFont;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedDraggedLabelTextColor;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedFocusLabelTextColor;
    public static final float DisabledLabelTextOpacity = 0.38f;
    public static final float DisabledLeadingIconOpacity = 0.38f;
    public static final float DisabledTrailingIconOpacity = 0.38f;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedHoverLabelTextColor;
    public static final float ElevatedDisabledContainerOpacity = 0.12f;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedLabelTextColor;
    public static final float FlatDisabledSelectedContainerOpacity = 0.12f;
    public static final float FlatDisabledUnselectedOutlineOpacity = 0.12f;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedPressedLabelTextColor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedDraggedLabelTextColor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedFocusLabelTextColor;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedHoverLabelTextColor;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedLabelTextColor;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedPressedLabelTextColor;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public static final float IconSize;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledLeadingIconColor;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens LeadingIconUnselectedColor;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedDraggedLeadingIconColor;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedFocusLeadingIconColor;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedHoverLeadingIconColor;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedLeadingIconColor;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedPressedLeadingIconColor;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedDraggedLeadingIconColor;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedFocusLeadingIconColor;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedHoverLeadingIconColor;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedPressedLeadingIconColor;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledTrailingIconColor;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedDraggedTrailingIconColor;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedFocusTrailingIconColor;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedHoverTrailingIconColor;

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedPressedTrailingIconColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledLabelTextColor;

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedTrailingIconColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final float DraggedContainerElevation;

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TrailingIconUnselectedColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final float ElevatedContainerElevation;

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedDraggedTrailingIconColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ElevatedDisabledContainerColor;

    /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedFocusTrailingIconColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final float ElevatedDisabledContainerElevation;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedHoverTrailingIconColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final float ElevatedFocusContainerElevation;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedPressedTrailingIconColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final float ElevatedHoverContainerElevation;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final float ElevatedPressedContainerElevation;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ElevatedSelectedContainerColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ElevatedUnselectedContainerColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final float FlatContainerElevation;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FlatDisabledSelectedContainerColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FlatDisabledUnselectedOutlineColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FlatSelectedContainerColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final float FlatSelectedFocusContainerElevation;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final float FlatSelectedHoverContainerElevation;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final float FlatSelectedOutlineWidth;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public static final float FlatSelectedPressedContainerElevation;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final float FlatUnselectedFocusContainerElevation;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FlatUnselectedFocusOutlineColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public static final float FlatUnselectedHoverContainerElevation;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FlatUnselectedOutlineColor;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    public static final float FlatUnselectedOutlineWidth;

    @NotNull
    public static final FilterChipTokens INSTANCE = new FilterChipTokens();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final float ContainerHeight = Dp.m4389constructorimpl((float) 32.0d);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerSmall;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ContainerSurfaceTintLayerColor = ColorSchemeKeyTokens.SurfaceTint;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        DisabledLabelTextColor = colorSchemeKeyTokens;
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        DraggedContainerElevation = elevationTokens.m1640getLevel4D9Ej5fM();
        ElevatedContainerElevation = elevationTokens.m1637getLevel1D9Ej5fM();
        ElevatedDisabledContainerColor = colorSchemeKeyTokens;
        ElevatedDisabledContainerElevation = elevationTokens.m1636getLevel0D9Ej5fM();
        ElevatedFocusContainerElevation = elevationTokens.m1637getLevel1D9Ej5fM();
        ElevatedHoverContainerElevation = elevationTokens.m1638getLevel2D9Ej5fM();
        ElevatedPressedContainerElevation = elevationTokens.m1637getLevel1D9Ej5fM();
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.SecondaryContainer;
        ElevatedSelectedContainerColor = colorSchemeKeyTokens2;
        ElevatedUnselectedContainerColor = ColorSchemeKeyTokens.Surface;
        FlatContainerElevation = elevationTokens.m1636getLevel0D9Ej5fM();
        FlatDisabledSelectedContainerColor = colorSchemeKeyTokens;
        FlatDisabledUnselectedOutlineColor = colorSchemeKeyTokens;
        FlatSelectedContainerColor = colorSchemeKeyTokens2;
        FlatSelectedFocusContainerElevation = elevationTokens.m1636getLevel0D9Ej5fM();
        FlatSelectedHoverContainerElevation = elevationTokens.m1637getLevel1D9Ej5fM();
        FlatSelectedOutlineWidth = Dp.m4389constructorimpl((float) 0.0d);
        FlatSelectedPressedContainerElevation = elevationTokens.m1636getLevel0D9Ej5fM();
        FlatUnselectedFocusContainerElevation = elevationTokens.m1636getLevel0D9Ej5fM();
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurfaceVariant;
        FlatUnselectedFocusOutlineColor = colorSchemeKeyTokens3;
        FlatUnselectedHoverContainerElevation = elevationTokens.m1636getLevel0D9Ej5fM();
        FlatUnselectedOutlineColor = ColorSchemeKeyTokens.Outline;
        FlatUnselectedOutlineWidth = Dp.m4389constructorimpl((float) 1.0d);
        FlatUnselectedPressedContainerElevation = elevationTokens.m1636getLevel0D9Ej5fM();
        LabelTextFont = TypographyKeyTokens.LabelLarge;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.OnSecondaryContainer;
        SelectedDraggedLabelTextColor = colorSchemeKeyTokens4;
        SelectedFocusLabelTextColor = colorSchemeKeyTokens4;
        SelectedHoverLabelTextColor = colorSchemeKeyTokens4;
        SelectedLabelTextColor = colorSchemeKeyTokens4;
        SelectedPressedLabelTextColor = colorSchemeKeyTokens4;
        UnselectedDraggedLabelTextColor = colorSchemeKeyTokens3;
        UnselectedFocusLabelTextColor = colorSchemeKeyTokens3;
        UnselectedHoverLabelTextColor = colorSchemeKeyTokens3;
        UnselectedLabelTextColor = colorSchemeKeyTokens3;
        UnselectedPressedLabelTextColor = colorSchemeKeyTokens3;
        IconSize = Dp.m4389constructorimpl((float) 18.0d);
        DisabledLeadingIconColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.Primary;
        LeadingIconUnselectedColor = colorSchemeKeyTokens5;
        SelectedDraggedLeadingIconColor = colorSchemeKeyTokens4;
        SelectedFocusLeadingIconColor = colorSchemeKeyTokens4;
        SelectedHoverLeadingIconColor = colorSchemeKeyTokens4;
        SelectedLeadingIconColor = colorSchemeKeyTokens4;
        SelectedPressedLeadingIconColor = colorSchemeKeyTokens4;
        UnselectedDraggedLeadingIconColor = colorSchemeKeyTokens5;
        UnselectedFocusLeadingIconColor = colorSchemeKeyTokens5;
        UnselectedHoverLeadingIconColor = colorSchemeKeyTokens5;
        UnselectedPressedLeadingIconColor = colorSchemeKeyTokens5;
        DisabledTrailingIconColor = colorSchemeKeyTokens;
        SelectedDraggedTrailingIconColor = colorSchemeKeyTokens4;
        SelectedFocusTrailingIconColor = colorSchemeKeyTokens4;
        SelectedHoverTrailingIconColor = colorSchemeKeyTokens4;
        SelectedPressedTrailingIconColor = colorSchemeKeyTokens4;
        SelectedTrailingIconColor = colorSchemeKeyTokens4;
        TrailingIconUnselectedColor = colorSchemeKeyTokens3;
        UnselectedDraggedTrailingIconColor = colorSchemeKeyTokens3;
        UnselectedFocusTrailingIconColor = colorSchemeKeyTokens3;
        UnselectedHoverTrailingIconColor = colorSchemeKeyTokens3;
        UnselectedPressedTrailingIconColor = colorSchemeKeyTokens3;
    }

    /* JADX INFO: renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1738getContainerHeightD9Ej5fM() {
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

    @NotNull
    public final ColorSchemeKeyTokens getDisabledLabelTextColor() {
        return DisabledLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledLeadingIconColor() {
        return DisabledLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledTrailingIconColor() {
        return DisabledTrailingIconColor;
    }

    /* JADX INFO: renamed from: getDraggedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1739getDraggedContainerElevationD9Ej5fM() {
        return DraggedContainerElevation;
    }

    /* JADX INFO: renamed from: getElevatedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1740getElevatedContainerElevationD9Ej5fM() {
        return ElevatedContainerElevation;
    }

    @NotNull
    public final ColorSchemeKeyTokens getElevatedDisabledContainerColor() {
        return ElevatedDisabledContainerColor;
    }

    /* JADX INFO: renamed from: getElevatedDisabledContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1741getElevatedDisabledContainerElevationD9Ej5fM() {
        return ElevatedDisabledContainerElevation;
    }

    /* JADX INFO: renamed from: getElevatedFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1742getElevatedFocusContainerElevationD9Ej5fM() {
        return ElevatedFocusContainerElevation;
    }

    /* JADX INFO: renamed from: getElevatedHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1743getElevatedHoverContainerElevationD9Ej5fM() {
        return ElevatedHoverContainerElevation;
    }

    /* JADX INFO: renamed from: getElevatedPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1744getElevatedPressedContainerElevationD9Ej5fM() {
        return ElevatedPressedContainerElevation;
    }

    @NotNull
    public final ColorSchemeKeyTokens getElevatedSelectedContainerColor() {
        return ElevatedSelectedContainerColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getElevatedUnselectedContainerColor() {
        return ElevatedUnselectedContainerColor;
    }

    /* JADX INFO: renamed from: getFlatContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1745getFlatContainerElevationD9Ej5fM() {
        return FlatContainerElevation;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFlatDisabledSelectedContainerColor() {
        return FlatDisabledSelectedContainerColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFlatDisabledUnselectedOutlineColor() {
        return FlatDisabledUnselectedOutlineColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFlatSelectedContainerColor() {
        return FlatSelectedContainerColor;
    }

    /* JADX INFO: renamed from: getFlatSelectedFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1746getFlatSelectedFocusContainerElevationD9Ej5fM() {
        return FlatSelectedFocusContainerElevation;
    }

    /* JADX INFO: renamed from: getFlatSelectedHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1747getFlatSelectedHoverContainerElevationD9Ej5fM() {
        return FlatSelectedHoverContainerElevation;
    }

    /* JADX INFO: renamed from: getFlatSelectedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1748getFlatSelectedOutlineWidthD9Ej5fM() {
        return FlatSelectedOutlineWidth;
    }

    /* JADX INFO: renamed from: getFlatSelectedPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1749getFlatSelectedPressedContainerElevationD9Ej5fM() {
        return FlatSelectedPressedContainerElevation;
    }

    /* JADX INFO: renamed from: getFlatUnselectedFocusContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1750getFlatUnselectedFocusContainerElevationD9Ej5fM() {
        return FlatUnselectedFocusContainerElevation;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFlatUnselectedFocusOutlineColor() {
        return FlatUnselectedFocusOutlineColor;
    }

    /* JADX INFO: renamed from: getFlatUnselectedHoverContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1751getFlatUnselectedHoverContainerElevationD9Ej5fM() {
        return FlatUnselectedHoverContainerElevation;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFlatUnselectedOutlineColor() {
        return FlatUnselectedOutlineColor;
    }

    /* JADX INFO: renamed from: getFlatUnselectedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1752getFlatUnselectedOutlineWidthD9Ej5fM() {
        return FlatUnselectedOutlineWidth;
    }

    /* JADX INFO: renamed from: getFlatUnselectedPressedContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1753getFlatUnselectedPressedContainerElevationD9Ej5fM() {
        return FlatUnselectedPressedContainerElevation;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1754getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @NotNull
    public final TypographyKeyTokens getLabelTextFont() {
        return LabelTextFont;
    }

    @NotNull
    public final ColorSchemeKeyTokens getLeadingIconUnselectedColor() {
        return LeadingIconUnselectedColor;
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

    @NotNull
    public final ColorSchemeKeyTokens getTrailingIconUnselectedColor() {
        return TrailingIconUnselectedColor;
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
}
