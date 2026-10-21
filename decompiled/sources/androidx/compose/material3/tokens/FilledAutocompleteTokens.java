package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FilledAutocompleteTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0007\n\u0003\b\u009c\u0001\bÀ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\bÞ\u0001\u0010ß\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R \u0010\u001c\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\fR \u0010\u001f\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006R\u0017\u0010(\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010+\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R\u0017\u0010.\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006R \u00101\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b/\u0010\n\u001a\u0004\b0\u0010\fR\u0017\u00104\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006R\u0017\u00107\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006R \u0010:\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b8\u0010\n\u001a\u0004\b9\u0010\fR\u0017\u0010=\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b;\u0010\u0010\u001a\u0004\b<\u0010\u0012R\u0017\u0010@\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010\u0004\u001a\u0004\b?\u0010\u0006R \u0010C\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bA\u0010\n\u001a\u0004\bB\u0010\fR\u0014\u0010E\u001a\u00020D8\u0006X\u0086T¢\u0006\u0006\n\u0004\bE\u0010\nR\u0017\u0010H\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010\u0004\u001a\u0004\bG\u0010\u0006R\u0014\u0010I\u001a\u00020D8\u0006X\u0086T¢\u0006\u0006\n\u0004\bI\u0010\nR\u0017\u0010L\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010\u0004\u001a\u0004\bK\u0010\u0006R\u0014\u0010M\u001a\u00020D8\u0006X\u0086T¢\u0006\u0006\n\u0004\bM\u0010\nR\u0017\u0010P\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bN\u0010\u0004\u001a\u0004\bO\u0010\u0006R\u0014\u0010Q\u001a\u00020D8\u0006X\u0086T¢\u0006\u0006\n\u0004\bQ\u0010\nR\u0017\u0010T\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bR\u0010\u0004\u001a\u0004\bS\u0010\u0006R\u0014\u0010U\u001a\u00020D8\u0006X\u0086T¢\u0006\u0006\n\u0004\bU\u0010\nR\u0017\u0010X\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bV\u0010\u0004\u001a\u0004\bW\u0010\u0006R\u0014\u0010Y\u001a\u00020D8\u0006X\u0086T¢\u0006\u0006\n\u0004\bY\u0010\nR\u0017\u0010\\\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bZ\u0010\u0004\u001a\u0004\b[\u0010\u0006R\u0014\u0010]\u001a\u00020D8\u0006X\u0086T¢\u0006\u0006\n\u0004\b]\u0010\nR\u0017\u0010`\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b^\u0010\u0004\u001a\u0004\b_\u0010\u0006R\u0017\u0010c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\ba\u0010\u0004\u001a\u0004\bb\u0010\u0006R\u0017\u0010f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bd\u0010\u0004\u001a\u0004\be\u0010\u0006R\u0017\u0010i\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bg\u0010\u0004\u001a\u0004\bh\u0010\u0006R\u0017\u0010l\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bj\u0010\u0004\u001a\u0004\bk\u0010\u0006R\u0017\u0010o\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bm\u0010\u0004\u001a\u0004\bn\u0010\u0006R\u0017\u0010r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bp\u0010\u0004\u001a\u0004\bq\u0010\u0006R\u0017\u0010t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\bs\u0010\u0006R\u0017\u0010w\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bu\u0010\u0004\u001a\u0004\bv\u0010\u0006R\u0017\u0010z\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bx\u0010\u0004\u001a\u0004\by\u0010\u0006R\u0017\u0010}\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b{\u0010\u0004\u001a\u0004\b|\u0010\u0006R\u0018\u0010\u0080\u0001\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b~\u0010\u0004\u001a\u0004\b\u007f\u0010\u0006R\u001a\u0010\u0083\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\u0004\u001a\u0005\b\u0082\u0001\u0010\u0006R\u001a\u0010\u0086\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010\u0004\u001a\u0005\b\u0085\u0001\u0010\u0006R\u001a\u0010\u0089\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\u0004\u001a\u0005\b\u0088\u0001\u0010\u0006R\u001a\u0010\u008c\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010\u0004\u001a\u0005\b\u008b\u0001\u0010\u0006R\u001a\u0010\u008f\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\u0004\u001a\u0005\b\u008e\u0001\u0010\u0006R\u001a\u0010\u0092\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010\u0004\u001a\u0005\b\u0091\u0001\u0010\u0006R\u001a\u0010\u0095\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010\u0004\u001a\u0005\b\u0094\u0001\u0010\u0006R\u001a\u0010\u0098\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010\u0004\u001a\u0005\b\u0097\u0001\u0010\u0006R#\u0010\u009b\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010\n\u001a\u0005\b\u009a\u0001\u0010\fR\u001a\u0010\u009e\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u009c\u0001\u0010\u0004\u001a\u0005\b\u009d\u0001\u0010\u0006R\u001a\u0010¡\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010\u0004\u001a\u0005\b \u0001\u0010\u0006R\u001a\u0010¤\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b¢\u0001\u0010\u0004\u001a\u0005\b£\u0001\u0010\u0006R\u001a\u0010§\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b¥\u0001\u0010\u0004\u001a\u0005\b¦\u0001\u0010\u0006R\u001a\u0010ª\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b¨\u0001\u0010\u0004\u001a\u0005\b©\u0001\u0010\u0006R\u001a\u0010\u00ad\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b«\u0001\u0010\u0004\u001a\u0005\b¬\u0001\u0010\u0006R#\u0010°\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b®\u0001\u0010\n\u001a\u0005\b¯\u0001\u0010\fR\u001a\u0010³\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b±\u0001\u0010\u0004\u001a\u0005\b²\u0001\u0010\u0006R\u001a\u0010¶\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b´\u0001\u0010\u0004\u001a\u0005\bµ\u0001\u0010\u0006R\u001a\u0010¹\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b·\u0001\u0010\u0004\u001a\u0005\b¸\u0001\u0010\u0006R\u001a\u0010¼\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bº\u0001\u0010\u0004\u001a\u0005\b»\u0001\u0010\u0006R\u001a\u0010¿\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b½\u0001\u0010\u0004\u001a\u0005\b¾\u0001\u0010\u0006R\u001a\u0010Â\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bÀ\u0001\u0010\u0004\u001a\u0005\bÁ\u0001\u0010\u0006R\u001a\u0010Å\u0001\u001a\u00020#8\u0006¢\u0006\u000e\n\u0005\bÃ\u0001\u0010%\u001a\u0005\bÄ\u0001\u0010'R\u001a\u0010È\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bÆ\u0001\u0010\u0004\u001a\u0005\bÇ\u0001\u0010\u0006R\u001a\u0010Ë\u0001\u001a\u00020#8\u0006¢\u0006\u000e\n\u0005\bÉ\u0001\u0010%\u001a\u0005\bÊ\u0001\u0010'R\u001a\u0010Î\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bÌ\u0001\u0010\u0004\u001a\u0005\bÍ\u0001\u0010\u0006R#\u0010Ñ\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÏ\u0001\u0010\n\u001a\u0005\bÐ\u0001\u0010\fR\u001a\u0010Ô\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bÒ\u0001\u0010\u0004\u001a\u0005\bÓ\u0001\u0010\u0006R\u001a\u0010×\u0001\u001a\u00020#8\u0006¢\u0006\u000e\n\u0005\bÕ\u0001\u0010%\u001a\u0005\bÖ\u0001\u0010'R\u001a\u0010Ú\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bØ\u0001\u0010\u0004\u001a\u0005\bÙ\u0001\u0010\u0006R#\u0010Ý\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\bÛ\u0001\u0010\n\u001a\u0005\bÜ\u0001\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006à\u0001"}, d2 = {"Landroidx/compose/material3/tokens/FilledAutocompleteTokens;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getMenuContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "MenuContainerColor", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getMenuContainerElevation-D9Ej5fM", "()F", "MenuContainerElevation", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "c", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getMenuContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "MenuContainerShape", "d", "getMenuContainerSurfaceTintLayerColor", "MenuContainerSurfaceTintLayerColor", "e", "getMenuDividerColor", "MenuDividerColor", "f", "getMenuDividerHeight-D9Ej5fM", "MenuDividerHeight", "g", "getMenuListItemContainerHeight-D9Ej5fM", "MenuListItemContainerHeight", "h", "getMenuListItemLabelTextColor", "MenuListItemLabelTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "i", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getMenuListItemLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "MenuListItemLabelTextFont", "j", "getMenuListItemSelectedContainerColor", "MenuListItemSelectedContainerColor", "k", "getTextFieldActiveIndicatorColor", "TextFieldActiveIndicatorColor", "l", "getTextFieldActiveIndicatorHeight-D9Ej5fM", "TextFieldActiveIndicatorHeight", "m", "getTextFieldCaretColor", "TextFieldCaretColor", "n", "getTextFieldContainerColor", "TextFieldContainerColor", "o", "getTextFieldContainerHeight-D9Ej5fM", "TextFieldContainerHeight", "p", "getTextFieldContainerShape", "TextFieldContainerShape", "q", "getTextFieldDisabledActiveIndicatorColor", "TextFieldDisabledActiveIndicatorColor", "r", "getTextFieldDisabledActiveIndicatorHeight-D9Ej5fM", "TextFieldDisabledActiveIndicatorHeight", "", "TextFieldDisabledActiveIndicatorOpacity", "s", "getTextFieldDisabledContainerColor", "TextFieldDisabledContainerColor", "TextFieldDisabledContainerOpacity", "t", "getFieldDisabledInputTextColor", "FieldDisabledInputTextColor", "FieldDisabledInputTextOpacity", "u", "getFieldDisabledLabelTextColor", "FieldDisabledLabelTextColor", "FieldDisabledLabelTextOpacity", SharedPrefsStorage.VERSION_KEY, "getTextFieldDisabledLeadingIconColor", "TextFieldDisabledLeadingIconColor", "TextFieldDisabledLeadingIconOpacity", "w", "getFieldDisabledSupportingTextColor", "FieldDisabledSupportingTextColor", "FieldDisabledSupportingTextOpacity", "x", "getTextFieldDisabledTrailingIconColor", "TextFieldDisabledTrailingIconColor", "TextFieldDisabledTrailingIconOpacity", "y", "getTextFieldErrorActiveIndicatorColor", "TextFieldErrorActiveIndicatorColor", "z", "getTextFieldErrorFocusActiveIndicatorColor", "TextFieldErrorFocusActiveIndicatorColor", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getTextFieldErrorFocusCaretColor", "TextFieldErrorFocusCaretColor", "B", "getFieldErrorFocusInputTextColor", "FieldErrorFocusInputTextColor", "C", "getFieldErrorFocusLabelTextColor", "FieldErrorFocusLabelTextColor", "D", "getTextFieldErrorFocusLeadingIconColor", "TextFieldErrorFocusLeadingIconColor", ExifInterface.LONGITUDE_EAST, "getFieldErrorFocusSupportingTextColor", "FieldErrorFocusSupportingTextColor", "getTextFieldErrorFocusTrailingIconColor", "TextFieldErrorFocusTrailingIconColor", "G", "getTextFieldErrorHoverActiveIndicatorColor", "TextFieldErrorHoverActiveIndicatorColor", "H", "getFieldErrorHoverInputTextColor", "FieldErrorHoverInputTextColor", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getFieldErrorHoverLabelTextColor", "FieldErrorHoverLabelTextColor", "J", "getTextFieldErrorHoverLeadingIconColor", "TextFieldErrorHoverLeadingIconColor", "K", "getFieldErrorHoverSupportingTextColor", "FieldErrorHoverSupportingTextColor", "L", "getTextFieldErrorHoverTrailingIconColor", "TextFieldErrorHoverTrailingIconColor", "M", "getFieldErrorInputTextColor", "FieldErrorInputTextColor", "N", "getFieldErrorLabelTextColor", "FieldErrorLabelTextColor", "O", "getTextFieldErrorLeadingIconColor", "TextFieldErrorLeadingIconColor", "P", "getFieldErrorSupportingTextColor", "FieldErrorSupportingTextColor", TransactionType.TRANSACTION_TYPE_CONTACTLESS_CODE, "getTextFieldErrorTrailingIconColor", "TextFieldErrorTrailingIconColor", "R", "getTextFieldFocusActiveIndicatorColor", "TextFieldFocusActiveIndicatorColor", ExifInterface.LATITUDE_SOUTH, "getTextFieldFocusActiveIndicatorHeight-D9Ej5fM", "TextFieldFocusActiveIndicatorHeight", ExifInterface.GPS_DIRECTION_TRUE, "getFieldFocusInputTextColor", "FieldFocusInputTextColor", "U", "getFieldFocusLabelTextColor", "FieldFocusLabelTextColor", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getTextFieldFocusLeadingIconColor", "TextFieldFocusLeadingIconColor", ExifInterface.LONGITUDE_WEST, "getFieldFocusSupportingTextColor", "FieldFocusSupportingTextColor", "X", "getTextFieldFocusTrailingIconColor", "TextFieldFocusTrailingIconColor", "Y", "getTextFieldHoverActiveIndicatorColor", "TextFieldHoverActiveIndicatorColor", "Z", "getTextFieldHoverActiveIndicatorHeight-D9Ej5fM", "TextFieldHoverActiveIndicatorHeight", "a0", "getFieldHoverInputTextColor", "FieldHoverInputTextColor", "b0", "getFieldHoverLabelTextColor", "FieldHoverLabelTextColor", "c0", "getTextFieldHoverLeadingIconColor", "TextFieldHoverLeadingIconColor", "d0", "getFieldHoverSupportingTextColor", "FieldHoverSupportingTextColor", "e0", "getTextFieldHoverTrailingIconColor", "TextFieldHoverTrailingIconColor", "f0", "getFieldInputTextColor", "FieldInputTextColor", "g0", "getFieldInputTextFont", "FieldInputTextFont", "h0", "getFieldLabelTextColor", "FieldLabelTextColor", "i0", "getFieldLabelTextFont", "FieldLabelTextFont", "j0", "getTextFieldLeadingIconColor", "TextFieldLeadingIconColor", "k0", "getTextFieldLeadingIconSize-D9Ej5fM", "TextFieldLeadingIconSize", "l0", "getFieldSupportingTextColor", "FieldSupportingTextColor", "m0", "getFieldSupportingTextFont", "FieldSupportingTextFont", "n0", "getTextFieldTrailingIconColor", "TextFieldTrailingIconColor", "o0", "getTextFieldTrailingIconSize-D9Ej5fM", "TextFieldTrailingIconSize", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFilledAutocompleteTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilledAutocompleteTokens.kt\nandroidx/compose/material3/tokens/FilledAutocompleteTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,98:1\n164#2:99\n164#2:100\n164#2:101\n164#2:102\n164#2:103\n164#2:104\n164#2:105\n164#2:106\n164#2:107\n*S KotlinDebug\n*F\n+ 1 FilledAutocompleteTokens.kt\nandroidx/compose/material3/tokens/FilledAutocompleteTokens\n*L\n29#1:99\n30#1:100\n35#1:101\n38#1:102\n41#1:103\n75#1:104\n82#1:105\n93#1:106\n97#1:107\n*E\n"})
public final class FilledAutocompleteTokens {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldErrorFocusCaretColor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldErrorFocusInputTextColor;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldErrorFocusLabelTextColor;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldErrorFocusLeadingIconColor;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldErrorFocusSupportingTextColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldErrorFocusTrailingIconColor;
    public static final float FieldDisabledInputTextOpacity = 0.38f;
    public static final float FieldDisabledLabelTextOpacity = 0.38f;
    public static final float FieldDisabledSupportingTextOpacity = 0.38f;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldErrorHoverActiveIndicatorColor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldErrorHoverInputTextColor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldErrorHoverLabelTextColor;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldErrorHoverLeadingIconColor;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldErrorHoverSupportingTextColor;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldErrorHoverTrailingIconColor;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldErrorInputTextColor;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldErrorLabelTextColor;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldErrorLeadingIconColor;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldErrorSupportingTextColor;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldErrorTrailingIconColor;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldFocusActiveIndicatorColor;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public static final float TextFieldFocusActiveIndicatorHeight;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldFocusInputTextColor;
    public static final float TextFieldDisabledActiveIndicatorOpacity = 0.38f;
    public static final float TextFieldDisabledContainerOpacity = 0.04f;
    public static final float TextFieldDisabledLeadingIconOpacity = 0.38f;
    public static final float TextFieldDisabledTrailingIconOpacity = 0.38f;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldFocusLabelTextColor;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldFocusLeadingIconColor;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldFocusSupportingTextColor;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldFocusTrailingIconColor;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldHoverActiveIndicatorColor;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public static final float TextFieldHoverActiveIndicatorHeight;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldHoverInputTextColor;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldHoverLabelTextColor;

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldHoverLeadingIconColor;

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldHoverSupportingTextColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens MenuDividerColor;

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldHoverTrailingIconColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final float MenuDividerHeight;

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldInputTextColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final float MenuListItemContainerHeight;

    /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens FieldInputTextFont;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens MenuListItemLabelTextColor;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldLabelTextColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens MenuListItemLabelTextFont;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens FieldLabelTextFont;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens MenuListItemSelectedContainerColor;

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldLeadingIconColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldActiveIndicatorColor;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public static final float TextFieldLeadingIconSize;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final float TextFieldActiveIndicatorHeight;

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldSupportingTextColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldCaretColor;

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens FieldSupportingTextFont;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldContainerColor;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldTrailingIconColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final float TextFieldContainerHeight;

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    public static final float TextFieldTrailingIconSize;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens TextFieldContainerShape;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldDisabledActiveIndicatorColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final float TextFieldDisabledActiveIndicatorHeight;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldDisabledContainerColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldDisabledInputTextColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldDisabledLabelTextColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldDisabledLeadingIconColor;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FieldDisabledSupportingTextColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldDisabledTrailingIconColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldErrorActiveIndicatorColor;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TextFieldErrorFocusActiveIndicatorColor;

    @NotNull
    public static final FilledAutocompleteTokens INSTANCE = new FilledAutocompleteTokens();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens MenuContainerColor = ColorSchemeKeyTokens.Surface;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float MenuContainerElevation = ElevationTokens.INSTANCE.m1638getLevel2D9Ej5fM();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens MenuContainerShape = ShapeKeyTokens.CornerExtraSmall;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens MenuContainerSurfaceTintLayerColor = ColorSchemeKeyTokens.SurfaceTint;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.SurfaceVariant;
        MenuDividerColor = colorSchemeKeyTokens;
        float f6 = (float) 1.0d;
        MenuDividerHeight = Dp.m4389constructorimpl(f6);
        MenuListItemContainerHeight = Dp.m4389constructorimpl((float) 48.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        MenuListItemLabelTextColor = colorSchemeKeyTokens2;
        MenuListItemLabelTextFont = TypographyKeyTokens.LabelLarge;
        MenuListItemSelectedContainerColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurfaceVariant;
        TextFieldActiveIndicatorColor = colorSchemeKeyTokens3;
        TextFieldActiveIndicatorHeight = Dp.m4389constructorimpl(f6);
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.Primary;
        TextFieldCaretColor = colorSchemeKeyTokens4;
        TextFieldContainerColor = colorSchemeKeyTokens;
        TextFieldContainerHeight = Dp.m4389constructorimpl((float) 56.0d);
        TextFieldContainerShape = ShapeKeyTokens.CornerExtraSmallTop;
        TextFieldDisabledActiveIndicatorColor = colorSchemeKeyTokens2;
        TextFieldDisabledActiveIndicatorHeight = Dp.m4389constructorimpl(f6);
        TextFieldDisabledContainerColor = colorSchemeKeyTokens2;
        FieldDisabledInputTextColor = colorSchemeKeyTokens2;
        FieldDisabledLabelTextColor = colorSchemeKeyTokens2;
        TextFieldDisabledLeadingIconColor = colorSchemeKeyTokens2;
        FieldDisabledSupportingTextColor = colorSchemeKeyTokens2;
        TextFieldDisabledTrailingIconColor = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.Error;
        TextFieldErrorActiveIndicatorColor = colorSchemeKeyTokens5;
        TextFieldErrorFocusActiveIndicatorColor = colorSchemeKeyTokens5;
        TextFieldErrorFocusCaretColor = colorSchemeKeyTokens5;
        FieldErrorFocusInputTextColor = colorSchemeKeyTokens2;
        FieldErrorFocusLabelTextColor = colorSchemeKeyTokens5;
        TextFieldErrorFocusLeadingIconColor = colorSchemeKeyTokens3;
        FieldErrorFocusSupportingTextColor = colorSchemeKeyTokens5;
        TextFieldErrorFocusTrailingIconColor = colorSchemeKeyTokens5;
        ColorSchemeKeyTokens colorSchemeKeyTokens6 = ColorSchemeKeyTokens.OnErrorContainer;
        TextFieldErrorHoverActiveIndicatorColor = colorSchemeKeyTokens6;
        FieldErrorHoverInputTextColor = colorSchemeKeyTokens2;
        FieldErrorHoverLabelTextColor = colorSchemeKeyTokens6;
        TextFieldErrorHoverLeadingIconColor = colorSchemeKeyTokens3;
        FieldErrorHoverSupportingTextColor = colorSchemeKeyTokens5;
        TextFieldErrorHoverTrailingIconColor = colorSchemeKeyTokens6;
        FieldErrorInputTextColor = colorSchemeKeyTokens2;
        FieldErrorLabelTextColor = colorSchemeKeyTokens5;
        TextFieldErrorLeadingIconColor = colorSchemeKeyTokens3;
        FieldErrorSupportingTextColor = colorSchemeKeyTokens5;
        TextFieldErrorTrailingIconColor = colorSchemeKeyTokens5;
        TextFieldFocusActiveIndicatorColor = colorSchemeKeyTokens4;
        TextFieldFocusActiveIndicatorHeight = Dp.m4389constructorimpl((float) 2.0d);
        FieldFocusInputTextColor = colorSchemeKeyTokens2;
        FieldFocusLabelTextColor = colorSchemeKeyTokens4;
        TextFieldFocusLeadingIconColor = colorSchemeKeyTokens3;
        FieldFocusSupportingTextColor = colorSchemeKeyTokens3;
        TextFieldFocusTrailingIconColor = colorSchemeKeyTokens3;
        TextFieldHoverActiveIndicatorColor = colorSchemeKeyTokens2;
        TextFieldHoverActiveIndicatorHeight = Dp.m4389constructorimpl(f6);
        FieldHoverInputTextColor = colorSchemeKeyTokens2;
        FieldHoverLabelTextColor = colorSchemeKeyTokens3;
        TextFieldHoverLeadingIconColor = colorSchemeKeyTokens3;
        FieldHoverSupportingTextColor = colorSchemeKeyTokens3;
        TextFieldHoverTrailingIconColor = colorSchemeKeyTokens3;
        FieldInputTextColor = colorSchemeKeyTokens2;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.BodyLarge;
        FieldInputTextFont = typographyKeyTokens;
        FieldLabelTextColor = colorSchemeKeyTokens3;
        FieldLabelTextFont = typographyKeyTokens;
        TextFieldLeadingIconColor = colorSchemeKeyTokens3;
        TextFieldLeadingIconSize = Dp.m4389constructorimpl((float) 20.0d);
        FieldSupportingTextColor = colorSchemeKeyTokens3;
        FieldSupportingTextFont = TypographyKeyTokens.BodySmall;
        TextFieldTrailingIconColor = colorSchemeKeyTokens3;
        TextFieldTrailingIconSize = Dp.m4389constructorimpl((float) 24.0d);
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
    public final float m1696getMenuContainerElevationD9Ej5fM() {
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
    public final float m1697getMenuDividerHeightD9Ej5fM() {
        return MenuDividerHeight;
    }

    /* JADX INFO: renamed from: getMenuListItemContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1698getMenuListItemContainerHeightD9Ej5fM() {
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
    public final ColorSchemeKeyTokens getTextFieldActiveIndicatorColor() {
        return TextFieldActiveIndicatorColor;
    }

    /* JADX INFO: renamed from: getTextFieldActiveIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m1699getTextFieldActiveIndicatorHeightD9Ej5fM() {
        return TextFieldActiveIndicatorHeight;
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
    public final float m1700getTextFieldContainerHeightD9Ej5fM() {
        return TextFieldContainerHeight;
    }

    @NotNull
    public final ShapeKeyTokens getTextFieldContainerShape() {
        return TextFieldContainerShape;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldDisabledActiveIndicatorColor() {
        return TextFieldDisabledActiveIndicatorColor;
    }

    /* JADX INFO: renamed from: getTextFieldDisabledActiveIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m1701getTextFieldDisabledActiveIndicatorHeightD9Ej5fM() {
        return TextFieldDisabledActiveIndicatorHeight;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldDisabledContainerColor() {
        return TextFieldDisabledContainerColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldDisabledLeadingIconColor() {
        return TextFieldDisabledLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldDisabledTrailingIconColor() {
        return TextFieldDisabledTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorActiveIndicatorColor() {
        return TextFieldErrorActiveIndicatorColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorFocusActiveIndicatorColor() {
        return TextFieldErrorFocusActiveIndicatorColor;
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
    public final ColorSchemeKeyTokens getTextFieldErrorFocusTrailingIconColor() {
        return TextFieldErrorFocusTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorHoverActiveIndicatorColor() {
        return TextFieldErrorHoverActiveIndicatorColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldErrorHoverLeadingIconColor() {
        return TextFieldErrorHoverLeadingIconColor;
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
    public final ColorSchemeKeyTokens getTextFieldErrorTrailingIconColor() {
        return TextFieldErrorTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldFocusActiveIndicatorColor() {
        return TextFieldFocusActiveIndicatorColor;
    }

    /* JADX INFO: renamed from: getTextFieldFocusActiveIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m1702getTextFieldFocusActiveIndicatorHeightD9Ej5fM() {
        return TextFieldFocusActiveIndicatorHeight;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldFocusLeadingIconColor() {
        return TextFieldFocusLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldFocusTrailingIconColor() {
        return TextFieldFocusTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldHoverActiveIndicatorColor() {
        return TextFieldHoverActiveIndicatorColor;
    }

    /* JADX INFO: renamed from: getTextFieldHoverActiveIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m1703getTextFieldHoverActiveIndicatorHeightD9Ej5fM() {
        return TextFieldHoverActiveIndicatorHeight;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldHoverLeadingIconColor() {
        return TextFieldHoverLeadingIconColor;
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
    public final float m1704getTextFieldLeadingIconSizeD9Ej5fM() {
        return TextFieldLeadingIconSize;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTextFieldTrailingIconColor() {
        return TextFieldTrailingIconColor;
    }

    /* JADX INFO: renamed from: getTextFieldTrailingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1705getTextFieldTrailingIconSizeD9Ej5fM() {
        return TextFieldTrailingIconSize;
    }
}
