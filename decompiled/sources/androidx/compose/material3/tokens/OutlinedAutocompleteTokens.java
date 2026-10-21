package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OutlinedAutocompleteTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0007\n\u0003\b¡\u0001\bÀ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\bÚ\u0001\u0010Û\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R \u0010\u001c\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\fR \u0010\u001f\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006R\u0017\u0010(\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010+\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R\u0017\u0010.\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006R\u0017\u00101\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R \u00104\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b2\u0010\n\u001a\u0004\b3\u0010\fR\u0017\u00107\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b5\u0010\u0010\u001a\u0004\b6\u0010\u0012R\u0017\u0010:\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\u0004\u001a\u0004\b9\u0010\u0006R\u0014\u0010<\u001a\u00020;8\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010\nR\u0017\u0010?\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010\u0004\u001a\u0004\b>\u0010\u0006R\u0014\u0010@\u001a\u00020;8\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010\nR\u0017\u0010C\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010\u0004\u001a\u0004\bB\u0010\u0006R\u0014\u0010D\u001a\u00020;8\u0006X\u0086T¢\u0006\u0006\n\u0004\bD\u0010\nR\u0017\u0010G\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010\u0004\u001a\u0004\bF\u0010\u0006R\u0014\u0010H\u001a\u00020;8\u0006X\u0086T¢\u0006\u0006\n\u0004\bH\u0010\nR \u0010K\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bI\u0010\n\u001a\u0004\bJ\u0010\fR\u0017\u0010N\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bL\u0010\u0004\u001a\u0004\bM\u0010\u0006R\u0014\u0010O\u001a\u00020;8\u0006X\u0086T¢\u0006\u0006\n\u0004\bO\u0010\nR\u0017\u0010R\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bP\u0010\u0004\u001a\u0004\bQ\u0010\u0006R\u0014\u0010S\u001a\u00020;8\u0006X\u0086T¢\u0006\u0006\n\u0004\bS\u0010\nR\u0017\u0010V\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bT\u0010\u0004\u001a\u0004\bU\u0010\u0006R\u0017\u0010Y\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bW\u0010\u0004\u001a\u0004\bX\u0010\u0006R\u0017\u0010\\\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bZ\u0010\u0004\u001a\u0004\b[\u0010\u0006R\u0017\u0010_\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b]\u0010\u0004\u001a\u0004\b^\u0010\u0006R\u0017\u0010b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b`\u0010\u0004\u001a\u0004\ba\u0010\u0006R\u0017\u0010e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bc\u0010\u0004\u001a\u0004\bd\u0010\u0006R\u0017\u0010h\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bf\u0010\u0004\u001a\u0004\bg\u0010\u0006R\u0017\u0010k\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bi\u0010\u0004\u001a\u0004\bj\u0010\u0006R\u0017\u0010n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bl\u0010\u0004\u001a\u0004\bm\u0010\u0006R\u0017\u0010q\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bo\u0010\u0004\u001a\u0004\bp\u0010\u0006R\u0017\u0010s\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\br\u0010\u0006R\u0017\u0010v\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bt\u0010\u0004\u001a\u0004\bu\u0010\u0006R\u0017\u0010y\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bw\u0010\u0004\u001a\u0004\bx\u0010\u0006R\u0017\u0010|\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bz\u0010\u0004\u001a\u0004\b{\u0010\u0006R\u0017\u0010\u007f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b}\u0010\u0004\u001a\u0004\b~\u0010\u0006R\u001a\u0010\u0082\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010\u0004\u001a\u0005\b\u0081\u0001\u0010\u0006R\u001a\u0010\u0085\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\u0004\u001a\u0005\b\u0084\u0001\u0010\u0006R\u001a\u0010\u0088\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010\u0004\u001a\u0005\b\u0087\u0001\u0010\u0006R\u001a\u0010\u008b\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\u0004\u001a\u0005\b\u008a\u0001\u0010\u0006R\u001a\u0010\u008e\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010\u0004\u001a\u0005\b\u008d\u0001\u0010\u0006R\u001a\u0010\u0091\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010\u0004\u001a\u0005\b\u0090\u0001\u0010\u0006R\u001a\u0010\u0094\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010\u0004\u001a\u0005\b\u0093\u0001\u0010\u0006R\u001a\u0010\u0097\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010\u0004\u001a\u0005\b\u0096\u0001\u0010\u0006R#\u0010\u009a\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010\n\u001a\u0005\b\u0099\u0001\u0010\fR\u001a\u0010\u009d\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010\u0004\u001a\u0005\b\u009c\u0001\u0010\u0006R\u001a\u0010 \u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u009e\u0001\u0010\u0004\u001a\u0005\b\u009f\u0001\u0010\u0006R\u001a\u0010£\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b¡\u0001\u0010\u0004\u001a\u0005\b¢\u0001\u0010\u0006R\u001a\u0010¦\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b¤\u0001\u0010\u0004\u001a\u0005\b¥\u0001\u0010\u0006R\u001a\u0010©\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b§\u0001\u0010\u0004\u001a\u0005\b¨\u0001\u0010\u0006R\u001a\u0010¬\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bª\u0001\u0010\u0004\u001a\u0005\b«\u0001\u0010\u0006R#\u0010¯\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u00ad\u0001\u0010\n\u001a\u0005\b®\u0001\u0010\fR\u001a\u0010²\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b°\u0001\u0010\u0004\u001a\u0005\b±\u0001\u0010\u0006R\u001a\u0010µ\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b³\u0001\u0010\u0004\u001a\u0005\b´\u0001\u0010\u0006R\u001a\u0010¸\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b¶\u0001\u0010\u0004\u001a\u0005\b·\u0001\u0010\u0006R\u001a\u0010»\u0001\u001a\u00020#8\u0006¢\u0006\u000e\n\u0005\b¹\u0001\u0010%\u001a\u0005\bº\u0001\u0010'R\u001a\u0010¾\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b¼\u0001\u0010\u0004\u001a\u0005\b½\u0001\u0010\u0006R\u001a\u0010Á\u0001\u001a\u00020#8\u0006¢\u0006\u000e\n\u0005\b¿\u0001\u0010%\u001a\u0005\bÀ\u0001\u0010'R\u001a\u0010Ä\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bÂ\u0001\u0010\u0004\u001a\u0005\bÃ\u0001\u0010\u0006R#\u0010Ç\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÅ\u0001\u0010\n\u001a\u0005\bÆ\u0001\u0010\fR\u001a\u0010Ê\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bÈ\u0001\u0010\u0004\u001a\u0005\bÉ\u0001\u0010\u0006R#\u0010Í\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bË\u0001\u0010\n\u001a\u0005\bÌ\u0001\u0010\fR\u001a\u0010Ð\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bÎ\u0001\u0010\u0004\u001a\u0005\bÏ\u0001\u0010\u0006R\u001a\u0010Ó\u0001\u001a\u00020#8\u0006¢\u0006\u000e\n\u0005\bÑ\u0001\u0010%\u001a\u0005\bÒ\u0001\u0010'R\u001a\u0010Ö\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bÔ\u0001\u0010\u0004\u001a\u0005\bÕ\u0001\u0010\u0006R#\u0010Ù\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b×\u0001\u0010\n\u001a\u0005\bØ\u0001\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Ü\u0001"}, d2 = {"Landroidx/compose/material3/tokens/OutlinedAutocompleteTokens;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getMenuContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "MenuContainerColor", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getMenuContainerElevation-D9Ej5fM", "()F", "MenuContainerElevation", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "c", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getMenuContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "MenuContainerShape", "d", "getMenuContainerSurfaceTintLayerColor", "MenuContainerSurfaceTintLayerColor", "e", "getMenuDividerColor", "MenuDividerColor", "f", "getMenuDividerHeight-D9Ej5fM", "MenuDividerHeight", "g", "getMenuListItemContainerHeight-D9Ej5fM", "MenuListItemContainerHeight", "h", "getMenuListItemLabelTextColor", "MenuListItemLabelTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "i", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getMenuListItemLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "MenuListItemLabelTextFont", "j", "getMenuListItemSelectedContainerColor", "MenuListItemSelectedContainerColor", "k", "getTextFieldCaretColor", "TextFieldCaretColor", "l", "getTextFieldContainerColor", "TextFieldContainerColor", "m", "getTextFieldContainerHeight-D9Ej5fM", "TextFieldContainerHeight", "n", "getTextFieldContainerShape", "TextFieldContainerShape", "o", "getFieldDisabledInputTextColor", "FieldDisabledInputTextColor", "", "FieldDisabledInputTextOpacity", "p", "getFieldDisabledLabelTextColor", "FieldDisabledLabelTextColor", "FieldDisabledLabelTextOpacity", "q", "getTextFieldDisabledLeadingIconColor", "TextFieldDisabledLeadingIconColor", "TextFieldDisabledLeadingIconOpacity", "r", "getTextFieldDisabledOutlineColor", "TextFieldDisabledOutlineColor", "TextFieldDisabledOutlineOpacity", "s", "getTextFieldDisabledOutlineWidth-D9Ej5fM", "TextFieldDisabledOutlineWidth", "t", "getFieldDisabledSupportingTextColor", "FieldDisabledSupportingTextColor", "FieldDisabledSupportingTextOpacity", "u", "getTextFieldDisabledTrailingIconColor", "TextFieldDisabledTrailingIconColor", "TextFieldDisabledTrailingIconOpacity", SharedPrefsStorage.VERSION_KEY, "getTextFieldErrorFocusCaretColor", "TextFieldErrorFocusCaretColor", "w", "getFieldErrorFocusInputTextColor", "FieldErrorFocusInputTextColor", "x", "getFieldErrorFocusLabelTextColor", "FieldErrorFocusLabelTextColor", "y", "getTextFieldErrorFocusLeadingIconColor", "TextFieldErrorFocusLeadingIconColor", "z", "getTextFieldErrorFocusOutlineColor", "TextFieldErrorFocusOutlineColor", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getFieldErrorFocusSupportingTextColor", "FieldErrorFocusSupportingTextColor", "B", "getTextFieldErrorFocusTrailingIconColor", "TextFieldErrorFocusTrailingIconColor", "C", "getFieldErrorHoverInputTextColor", "FieldErrorHoverInputTextColor", "D", "getFieldErrorHoverLabelTextColor", "FieldErrorHoverLabelTextColor", ExifInterface.LONGITUDE_EAST, "getTextFieldErrorHoverLeadingIconColor", "TextFieldErrorHoverLeadingIconColor", "getTextFieldErrorHoverOutlineColor", "TextFieldErrorHoverOutlineColor", "G", "getFieldErrorHoverSupportingTextColor", "FieldErrorHoverSupportingTextColor", "H", "getTextFieldErrorHoverTrailingIconColor", "TextFieldErrorHoverTrailingIconColor", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getFieldErrorInputTextColor", "FieldErrorInputTextColor", "J", "getFieldErrorLabelTextColor", "FieldErrorLabelTextColor", "K", "getTextFieldErrorLeadingIconColor", "TextFieldErrorLeadingIconColor", "L", "getTextFieldErrorOutlineColor", "TextFieldErrorOutlineColor", "M", "getFieldErrorSupportingTextColor", "FieldErrorSupportingTextColor", "N", "getTextFieldErrorTrailingIconColor", "TextFieldErrorTrailingIconColor", "O", "getFieldFocusInputTextColor", "FieldFocusInputTextColor", "P", "getFieldFocusLabelTextColor", "FieldFocusLabelTextColor", TransactionType.TRANSACTION_TYPE_CONTACTLESS_CODE, "getTextFieldFocusLeadingIconColor", "TextFieldFocusLeadingIconColor", "R", "getTextFieldFocusOutlineColor", "TextFieldFocusOutlineColor", ExifInterface.LATITUDE_SOUTH, "getTextFieldFocusOutlineWidth-D9Ej5fM", "TextFieldFocusOutlineWidth", ExifInterface.GPS_DIRECTION_TRUE, "getFieldFocusSupportingTextColor", "FieldFocusSupportingTextColor", "U", "getTextFieldFocusTrailingIconColor", "TextFieldFocusTrailingIconColor", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getFieldHoverInputTextColor", "FieldHoverInputTextColor", ExifInterface.LONGITUDE_WEST, "getFieldHoverLabelTextColor", "FieldHoverLabelTextColor", "X", "getTextFieldHoverLeadingIconColor", "TextFieldHoverLeadingIconColor", "Y", "getTextFieldHoverOutlineColor", "TextFieldHoverOutlineColor", "Z", "getTextFieldHoverOutlineWidth-D9Ej5fM", "TextFieldHoverOutlineWidth", "a0", "getFieldHoverSupportingTextColor", "FieldHoverSupportingTextColor", "b0", "getTextFieldHoverTrailingIconColor", "TextFieldHoverTrailingIconColor", "c0", "getFieldInputTextColor", "FieldInputTextColor", "d0", "getFieldInputTextFont", "FieldInputTextFont", "e0", "getFieldLabelTextColor", "FieldLabelTextColor", "f0", "getFieldLabelTextFont", "FieldLabelTextFont", "g0", "getTextFieldLeadingIconColor", "TextFieldLeadingIconColor", "h0", "getTextFieldLeadingIconSize-D9Ej5fM", "TextFieldLeadingIconSize", "i0", "getTextFieldOutlineColor", "TextFieldOutlineColor", "j0", "getTextFieldOutlineWidth-D9Ej5fM", "TextFieldOutlineWidth", "k0", "getFieldSupportingTextColor", "FieldSupportingTextColor", "l0", "getFieldSupportingTextFont", "FieldSupportingTextFont", "m0", "getTextFieldTrailingIconColor", "TextFieldTrailingIconColor", "n0", "getTextFieldTrailingIconSize-D9Ej5fM", "TextFieldTrailingIconSize", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOutlinedAutocompleteTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedAutocompleteTokens.kt\nandroidx/compose/material3/tokens/OutlinedAutocompleteTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,96:1\n164#2:97\n164#2:98\n164#2:99\n164#2:100\n164#2:101\n164#2:102\n164#2:103\n164#2:104\n164#2:105\n*S KotlinDebug\n*F\n+ 1 OutlinedAutocompleteTokens.kt\nandroidx/compose/material3/tokens/OutlinedAutocompleteTokens\n*L\n29#1:97\n30#1:98\n36#1:99\n46#1:100\n74#1:101\n81#1:102\n89#1:103\n91#1:104\n95#1:105\n*E\n"})
public final class OutlinedAutocompleteTokens {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldErrorFocusSupportingTextColor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldErrorFocusTrailingIconColor;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldErrorHoverInputTextColor;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldErrorHoverLabelTextColor;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldErrorHoverLeadingIconColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldErrorHoverOutlineColor;
    public static final float FieldDisabledInputTextOpacity = 0.38f;
    public static final float FieldDisabledLabelTextOpacity = 0.38f;
    public static final float FieldDisabledSupportingTextOpacity = 0.38f;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldErrorHoverSupportingTextColor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldErrorHoverTrailingIconColor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldErrorInputTextColor;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldErrorLabelTextColor;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldErrorLeadingIconColor;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldErrorOutlineColor;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldErrorSupportingTextColor;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldErrorTrailingIconColor;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldFocusInputTextColor;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldFocusLabelTextColor;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldFocusLeadingIconColor;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldFocusOutlineColor;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public static final float TextFieldFocusOutlineWidth;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldFocusSupportingTextColor;
    public static final float TextFieldDisabledLeadingIconOpacity = 0.38f;
    public static final float TextFieldDisabledOutlineOpacity = 0.12f;
    public static final float TextFieldDisabledTrailingIconOpacity = 0.38f;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldFocusTrailingIconColor;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldHoverInputTextColor;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldHoverLabelTextColor;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldHoverLeadingIconColor;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldHoverOutlineColor;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public static final float TextFieldHoverOutlineWidth;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldHoverSupportingTextColor;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldHoverTrailingIconColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens MenuContainerShape;

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldInputTextColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens MenuContainerSurfaceTintLayerColor;

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens FieldInputTextFont;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens MenuDividerColor;

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldLabelTextColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final float MenuDividerHeight;

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens FieldLabelTextFont;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final float MenuListItemContainerHeight;

    /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldLeadingIconColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens MenuListItemLabelTextColor;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    public static final float TextFieldLeadingIconSize;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens MenuListItemLabelTextFont;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldOutlineColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens MenuListItemSelectedContainerColor;

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    public static final float TextFieldOutlineWidth;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldCaretColor;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldSupportingTextColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldContainerColor;

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens FieldSupportingTextFont;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public static final float TextFieldContainerHeight;

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldTrailingIconColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens TextFieldContainerShape;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public static final float TextFieldTrailingIconSize;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldDisabledInputTextColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldDisabledLabelTextColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldDisabledLeadingIconColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldDisabledOutlineColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final float TextFieldDisabledOutlineWidth;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldDisabledSupportingTextColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldDisabledTrailingIconColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldErrorFocusCaretColor;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldErrorFocusInputTextColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldErrorFocusLabelTextColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldErrorFocusLeadingIconColor;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldErrorFocusOutlineColor;

    @NotNull
    public static final OutlinedAutocompleteTokens INSTANCE = new OutlinedAutocompleteTokens();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens MenuContainerColor = ColorSchemeKeyTokens.Surface;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float MenuContainerElevation = ElevationTokens.INSTANCE.m1638getLevel2D9Ej5fM();

    static {
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerExtraSmall;
        MenuContainerShape = shapeKeyTokens;
        MenuContainerSurfaceTintLayerColor = ColorSchemeKeyTokens.SurfaceTint;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.SurfaceVariant;
        MenuDividerColor = colorSchemeKeyTokens;
        float f6 = (float) 1.0d;
        MenuDividerHeight = Dp.m4389constructorimpl(f6);
        MenuListItemContainerHeight = Dp.m4389constructorimpl((float) 48.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        MenuListItemLabelTextColor = colorSchemeKeyTokens2;
        MenuListItemLabelTextFont = TypographyKeyTokens.LabelLarge;
        MenuListItemSelectedContainerColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.Primary;
        TextFieldCaretColor = colorSchemeKeyTokens3;
        TextFieldContainerColor = colorSchemeKeyTokens;
        TextFieldContainerHeight = Dp.m4389constructorimpl((float) 56.0d);
        TextFieldContainerShape = shapeKeyTokens;
        FieldDisabledInputTextColor = colorSchemeKeyTokens2;
        FieldDisabledLabelTextColor = colorSchemeKeyTokens2;
        TextFieldDisabledLeadingIconColor = colorSchemeKeyTokens2;
        TextFieldDisabledOutlineColor = colorSchemeKeyTokens2;
        TextFieldDisabledOutlineWidth = Dp.m4389constructorimpl(f6);
        FieldDisabledSupportingTextColor = colorSchemeKeyTokens2;
        TextFieldDisabledTrailingIconColor = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.Error;
        TextFieldErrorFocusCaretColor = colorSchemeKeyTokens4;
        FieldErrorFocusInputTextColor = colorSchemeKeyTokens2;
        FieldErrorFocusLabelTextColor = colorSchemeKeyTokens4;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.OnSurfaceVariant;
        TextFieldErrorFocusLeadingIconColor = colorSchemeKeyTokens5;
        TextFieldErrorFocusOutlineColor = colorSchemeKeyTokens4;
        FieldErrorFocusSupportingTextColor = colorSchemeKeyTokens4;
        TextFieldErrorFocusTrailingIconColor = colorSchemeKeyTokens4;
        FieldErrorHoverInputTextColor = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens6 = ColorSchemeKeyTokens.OnErrorContainer;
        FieldErrorHoverLabelTextColor = colorSchemeKeyTokens6;
        TextFieldErrorHoverLeadingIconColor = colorSchemeKeyTokens5;
        TextFieldErrorHoverOutlineColor = colorSchemeKeyTokens6;
        FieldErrorHoverSupportingTextColor = colorSchemeKeyTokens4;
        TextFieldErrorHoverTrailingIconColor = colorSchemeKeyTokens6;
        FieldErrorInputTextColor = colorSchemeKeyTokens2;
        FieldErrorLabelTextColor = colorSchemeKeyTokens4;
        TextFieldErrorLeadingIconColor = colorSchemeKeyTokens5;
        TextFieldErrorOutlineColor = colorSchemeKeyTokens4;
        FieldErrorSupportingTextColor = colorSchemeKeyTokens4;
        TextFieldErrorTrailingIconColor = colorSchemeKeyTokens4;
        FieldFocusInputTextColor = colorSchemeKeyTokens2;
        FieldFocusLabelTextColor = colorSchemeKeyTokens3;
        TextFieldFocusLeadingIconColor = colorSchemeKeyTokens5;
        TextFieldFocusOutlineColor = colorSchemeKeyTokens3;
        TextFieldFocusOutlineWidth = Dp.m4389constructorimpl((float) 2.0d);
        FieldFocusSupportingTextColor = colorSchemeKeyTokens5;
        TextFieldFocusTrailingIconColor = colorSchemeKeyTokens5;
        FieldHoverInputTextColor = colorSchemeKeyTokens2;
        FieldHoverLabelTextColor = colorSchemeKeyTokens5;
        TextFieldHoverLeadingIconColor = colorSchemeKeyTokens5;
        TextFieldHoverOutlineColor = colorSchemeKeyTokens2;
        TextFieldHoverOutlineWidth = Dp.m4389constructorimpl(f6);
        FieldHoverSupportingTextColor = colorSchemeKeyTokens5;
        TextFieldHoverTrailingIconColor = colorSchemeKeyTokens5;
        FieldInputTextColor = colorSchemeKeyTokens2;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.BodyLarge;
        FieldInputTextFont = typographyKeyTokens;
        FieldLabelTextColor = colorSchemeKeyTokens5;
        FieldLabelTextFont = typographyKeyTokens;
        TextFieldLeadingIconColor = colorSchemeKeyTokens5;
        float f10 = (float) 24.0d;
        TextFieldLeadingIconSize = Dp.m4389constructorimpl(f10);
        TextFieldOutlineColor = ColorSchemeKeyTokens.Outline;
        TextFieldOutlineWidth = Dp.m4389constructorimpl(f6);
        FieldSupportingTextColor = colorSchemeKeyTokens5;
        FieldSupportingTextFont = TypographyKeyTokens.BodySmall;
        TextFieldTrailingIconColor = colorSchemeKeyTokens5;
        TextFieldTrailingIconSize = Dp.m4389constructorimpl(f10);
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldDisabledInputTextColor() {
        return FieldDisabledInputTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldDisabledLabelTextColor() {
        return FieldDisabledLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldDisabledSupportingTextColor() {
        return FieldDisabledSupportingTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldErrorFocusInputTextColor() {
        return FieldErrorFocusInputTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldErrorFocusLabelTextColor() {
        return FieldErrorFocusLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldErrorFocusSupportingTextColor() {
        return FieldErrorFocusSupportingTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldErrorHoverInputTextColor() {
        return FieldErrorHoverInputTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldErrorHoverLabelTextColor() {
        return FieldErrorHoverLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldErrorHoverSupportingTextColor() {
        return FieldErrorHoverSupportingTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldErrorInputTextColor() {
        return FieldErrorInputTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldErrorLabelTextColor() {
        return FieldErrorLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldErrorSupportingTextColor() {
        return FieldErrorSupportingTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldFocusInputTextColor() {
        return FieldFocusInputTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldFocusLabelTextColor() {
        return FieldFocusLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldFocusSupportingTextColor() {
        return FieldFocusSupportingTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldHoverInputTextColor() {
        return FieldHoverInputTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldHoverLabelTextColor() {
        return FieldHoverLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldHoverSupportingTextColor() {
        return FieldHoverSupportingTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldInputTextColor() {
        return FieldInputTextColor;
    }

    @NotNull
    public final TypographyKeyTokens getFieldInputTextFont() {
        return FieldInputTextFont;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldLabelTextColor() {
        return FieldLabelTextColor;
    }

    @NotNull
    public final TypographyKeyTokens getFieldLabelTextFont() {
        return FieldLabelTextFont;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFieldSupportingTextColor() {
        return FieldSupportingTextColor;
    }

    @NotNull
    public final TypographyKeyTokens getFieldSupportingTextFont() {
        return FieldSupportingTextFont;
    }

    @NotNull
    public final ColorSchemeKeyTokens getMenuContainerColor() {
        return MenuContainerColor;
    }

    /* JADX INFO: renamed from: getMenuContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1802getMenuContainerElevationD9Ej5fM() {
        return MenuContainerElevation;
    }

    @NotNull
    public final ShapeKeyTokens getMenuContainerShape() {
        return MenuContainerShape;
    }

    @NotNull
    public final ColorSchemeKeyTokens getMenuContainerSurfaceTintLayerColor() {
        return MenuContainerSurfaceTintLayerColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getMenuDividerColor() {
        return MenuDividerColor;
    }

    /* JADX INFO: renamed from: getMenuDividerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1803getMenuDividerHeightD9Ej5fM() {
        return MenuDividerHeight;
    }

    /* JADX INFO: renamed from: getMenuListItemContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1804getMenuListItemContainerHeightD9Ej5fM() {
        return MenuListItemContainerHeight;
    }

    @NotNull
    public final ColorSchemeKeyTokens getMenuListItemLabelTextColor() {
        return MenuListItemLabelTextColor;
    }

    @NotNull
    public final TypographyKeyTokens getMenuListItemLabelTextFont() {
        return MenuListItemLabelTextFont;
    }

    @NotNull
    public final ColorSchemeKeyTokens getMenuListItemSelectedContainerColor() {
        return MenuListItemSelectedContainerColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldCaretColor() {
        return TextFieldCaretColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldContainerColor() {
        return TextFieldContainerColor;
    }

    /* JADX INFO: renamed from: getTextFieldContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1805getTextFieldContainerHeightD9Ej5fM() {
        return TextFieldContainerHeight;
    }

    @NotNull
    public final ShapeKeyTokens getTextFieldContainerShape() {
        return TextFieldContainerShape;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldDisabledLeadingIconColor() {
        return TextFieldDisabledLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldDisabledOutlineColor() {
        return TextFieldDisabledOutlineColor;
    }

    /* JADX INFO: renamed from: getTextFieldDisabledOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1806getTextFieldDisabledOutlineWidthD9Ej5fM() {
        return TextFieldDisabledOutlineWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldDisabledTrailingIconColor() {
        return TextFieldDisabledTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorFocusCaretColor() {
        return TextFieldErrorFocusCaretColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorFocusLeadingIconColor() {
        return TextFieldErrorFocusLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorFocusOutlineColor() {
        return TextFieldErrorFocusOutlineColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorFocusTrailingIconColor() {
        return TextFieldErrorFocusTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorHoverLeadingIconColor() {
        return TextFieldErrorHoverLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorHoverOutlineColor() {
        return TextFieldErrorHoverOutlineColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorHoverTrailingIconColor() {
        return TextFieldErrorHoverTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorLeadingIconColor() {
        return TextFieldErrorLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorOutlineColor() {
        return TextFieldErrorOutlineColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorTrailingIconColor() {
        return TextFieldErrorTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldFocusLeadingIconColor() {
        return TextFieldFocusLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldFocusOutlineColor() {
        return TextFieldFocusOutlineColor;
    }

    /* JADX INFO: renamed from: getTextFieldFocusOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1807getTextFieldFocusOutlineWidthD9Ej5fM() {
        return TextFieldFocusOutlineWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldFocusTrailingIconColor() {
        return TextFieldFocusTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldHoverLeadingIconColor() {
        return TextFieldHoverLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldHoverOutlineColor() {
        return TextFieldHoverOutlineColor;
    }

    /* JADX INFO: renamed from: getTextFieldHoverOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1808getTextFieldHoverOutlineWidthD9Ej5fM() {
        return TextFieldHoverOutlineWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldHoverTrailingIconColor() {
        return TextFieldHoverTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldLeadingIconColor() {
        return TextFieldLeadingIconColor;
    }

    /* JADX INFO: renamed from: getTextFieldLeadingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1809getTextFieldLeadingIconSizeD9Ej5fM() {
        return TextFieldLeadingIconSize;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldOutlineColor() {
        return TextFieldOutlineColor;
    }

    /* JADX INFO: renamed from: getTextFieldOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1810getTextFieldOutlineWidthD9Ej5fM() {
        return TextFieldOutlineWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldTrailingIconColor() {
        return TextFieldTrailingIconColor;
    }

    /* JADX INFO: renamed from: getTextFieldTrailingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1811getTextFieldTrailingIconSizeD9Ej5fM() {
        return TextFieldTrailingIconSize;
    }
}
