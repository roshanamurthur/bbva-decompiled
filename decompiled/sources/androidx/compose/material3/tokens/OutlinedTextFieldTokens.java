package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OutlinedTextFieldTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b}\n\u0002\u0018\u0002\n\u0002\b/\bÀ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\nR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u0014\u0010 \u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\nR\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R\u0014\u0010$\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\nR \u0010'\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b&\u0010\fR\u0017\u0010*\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u0004\u001a\u0004\b)\u0010\u0006R\u0014\u0010+\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\nR\u0017\u0010.\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006R\u0014\u0010/\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\nR\u0017\u00102\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u0004\u001a\u0004\b1\u0010\u0006R\u0017\u00105\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\u0004\u001a\u0004\b4\u0010\u0006R\u0017\u00108\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\u0004\u001a\u0004\b7\u0010\u0006R\u0017\u0010;\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010\u0004\u001a\u0004\b:\u0010\u0006R\u0017\u0010>\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010\u0004\u001a\u0004\b=\u0010\u0006R\u0017\u0010A\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010\u0004\u001a\u0004\b@\u0010\u0006R\u0017\u0010D\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010\u0004\u001a\u0004\bC\u0010\u0006R\u0017\u0010G\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010\u0004\u001a\u0004\bF\u0010\u0006R\u0017\u0010J\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u0010\u0004\u001a\u0004\bI\u0010\u0006R\u0017\u0010M\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u0010\u0004\u001a\u0004\bL\u0010\u0006R\u0017\u0010P\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bN\u0010\u0004\u001a\u0004\bO\u0010\u0006R\u0017\u0010S\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010\u0004\u001a\u0004\bR\u0010\u0006R\u0017\u0010V\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bT\u0010\u0004\u001a\u0004\bU\u0010\u0006R\u0017\u0010Y\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bW\u0010\u0004\u001a\u0004\bX\u0010\u0006R\u0017\u0010\\\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bZ\u0010\u0004\u001a\u0004\b[\u0010\u0006R\u0017\u0010_\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b]\u0010\u0004\u001a\u0004\b^\u0010\u0006R\u0017\u0010b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b`\u0010\u0004\u001a\u0004\ba\u0010\u0006R\u0017\u0010e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bc\u0010\u0004\u001a\u0004\bd\u0010\u0006R\u0017\u0010h\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bf\u0010\u0004\u001a\u0004\bg\u0010\u0006R\u0017\u0010k\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bi\u0010\u0004\u001a\u0004\bj\u0010\u0006R\u0017\u0010n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bl\u0010\u0004\u001a\u0004\bm\u0010\u0006R\u0017\u0010p\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\bo\u0010\u0006R\u0017\u0010s\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bq\u0010\u0004\u001a\u0004\br\u0010\u0006R \u0010v\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bt\u0010\n\u001a\u0004\bu\u0010\fR\u0017\u0010y\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bw\u0010\u0004\u001a\u0004\bx\u0010\u0006R\u0017\u0010|\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bz\u0010\u0004\u001a\u0004\b{\u0010\u0006R\u0017\u0010\u007f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b}\u0010\u0004\u001a\u0004\b~\u0010\u0006R\u001a\u0010\u0082\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010\u0004\u001a\u0005\b\u0081\u0001\u0010\u0006R\u001a\u0010\u0085\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\u0004\u001a\u0005\b\u0084\u0001\u0010\u0006R\u001a\u0010\u0088\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010\u0004\u001a\u0005\b\u0087\u0001\u0010\u0006R#\u0010\u008b\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\n\u001a\u0005\b\u008a\u0001\u0010\fR\u001a\u0010\u008e\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010\u0004\u001a\u0005\b\u008d\u0001\u0010\u0006R\u001a\u0010\u0091\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010\u0004\u001a\u0005\b\u0090\u0001\u0010\u0006R\u001a\u0010\u0094\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010\u0004\u001a\u0005\b\u0093\u0001\u0010\u0006R\u001d\u0010\u009a\u0001\u001a\u00030\u0095\u00018\u0006¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001a\u0010\u009d\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010\u0004\u001a\u0005\b\u009c\u0001\u0010\u0006R\u001a\u0010 \u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u009e\u0001\u0010\u0004\u001a\u0005\b\u009f\u0001\u0010\u0006R\u001a\u0010£\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b¡\u0001\u0010\u0004\u001a\u0005\b¢\u0001\u0010\u0006R\u001a\u0010¦\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b¤\u0001\u0010\u0004\u001a\u0005\b¥\u0001\u0010\u0006R\u001d\u0010©\u0001\u001a\u00030\u0095\u00018\u0006¢\u0006\u0010\n\u0006\b§\u0001\u0010\u0097\u0001\u001a\u0006\b¨\u0001\u0010\u0099\u0001R\u001a\u0010¬\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bª\u0001\u0010\u0004\u001a\u0005\b«\u0001\u0010\u0006R#\u0010¯\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u00ad\u0001\u0010\n\u001a\u0005\b®\u0001\u0010\fR\u001a\u0010²\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b°\u0001\u0010\u0004\u001a\u0005\b±\u0001\u0010\u0006R#\u0010µ\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b³\u0001\u0010\n\u001a\u0005\b´\u0001\u0010\fR\u001a\u0010¸\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b¶\u0001\u0010\u0004\u001a\u0005\b·\u0001\u0010\u0006R\u001d\u0010»\u0001\u001a\u00030\u0095\u00018\u0006¢\u0006\u0010\n\u0006\b¹\u0001\u0010\u0097\u0001\u001a\u0006\bº\u0001\u0010\u0099\u0001R\u001a\u0010¾\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b¼\u0001\u0010\u0004\u001a\u0005\b½\u0001\u0010\u0006R#\u0010Á\u0001\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¿\u0001\u0010\n\u001a\u0005\bÀ\u0001\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Ä\u0001"}, d2 = {"Landroidx/compose/material3/tokens/OutlinedTextFieldTokens;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getCaretColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "CaretColor", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getContainerHeight-D9Ej5fM", "()F", "ContainerHeight", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "c", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "d", "getDisabledInputColor", "DisabledInputColor", "", "DisabledInputOpacity", "e", "getDisabledLabelColor", "DisabledLabelColor", "DisabledLabelOpacity", "f", "getDisabledLeadingIconColor", "DisabledLeadingIconColor", "DisabledLeadingIconOpacity", "g", "getDisabledOutlineColor", "DisabledOutlineColor", "DisabledOutlineOpacity", "h", "getDisabledOutlineWidth-D9Ej5fM", "DisabledOutlineWidth", "i", "getDisabledSupportingColor", "DisabledSupportingColor", "DisabledSupportingOpacity", "j", "getDisabledTrailingIconColor", "DisabledTrailingIconColor", "DisabledTrailingIconOpacity", "k", "getErrorFocusCaretColor", "ErrorFocusCaretColor", "l", "getErrorFocusInputColor", "ErrorFocusInputColor", "m", "getErrorFocusLabelColor", "ErrorFocusLabelColor", "n", "getErrorFocusLeadingIconColor", "ErrorFocusLeadingIconColor", "o", "getErrorFocusOutlineColor", "ErrorFocusOutlineColor", "p", "getErrorFocusSupportingColor", "ErrorFocusSupportingColor", "q", "getErrorFocusTrailingIconColor", "ErrorFocusTrailingIconColor", "r", "getErrorHoverInputColor", "ErrorHoverInputColor", "s", "getErrorHoverLabelColor", "ErrorHoverLabelColor", "t", "getErrorHoverLeadingIconColor", "ErrorHoverLeadingIconColor", "u", "getErrorHoverOutlineColor", "ErrorHoverOutlineColor", SharedPrefsStorage.VERSION_KEY, "getErrorHoverSupportingColor", "ErrorHoverSupportingColor", "w", "getErrorHoverTrailingIconColor", "ErrorHoverTrailingIconColor", "x", "getErrorInputColor", "ErrorInputColor", "y", "getErrorLabelColor", "ErrorLabelColor", "z", "getErrorLeadingIconColor", "ErrorLeadingIconColor", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getErrorOutlineColor", "ErrorOutlineColor", "B", "getErrorSupportingColor", "ErrorSupportingColor", "C", "getErrorTrailingIconColor", "ErrorTrailingIconColor", "D", "getFocusInputColor", "FocusInputColor", ExifInterface.LONGITUDE_EAST, "getFocusLabelColor", "FocusLabelColor", "getFocusLeadingIconColor", "FocusLeadingIconColor", "G", "getFocusOutlineColor", "FocusOutlineColor", "H", "getFocusOutlineWidth-D9Ej5fM", "FocusOutlineWidth", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getFocusSupportingColor", "FocusSupportingColor", "J", "getFocusTrailingIconColor", "FocusTrailingIconColor", "K", "getHoverInputColor", "HoverInputColor", "L", "getHoverLabelColor", "HoverLabelColor", "M", "getHoverLeadingIconColor", "HoverLeadingIconColor", "N", "getHoverOutlineColor", "HoverOutlineColor", "O", "getHoverOutlineWidth-D9Ej5fM", "HoverOutlineWidth", "P", "getHoverSupportingColor", "HoverSupportingColor", TransactionType.TRANSACTION_TYPE_CONTACTLESS_CODE, "getHoverTrailingIconColor", "HoverTrailingIconColor", "R", "getInputColor", "InputColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", ExifInterface.LATITUDE_SOUTH, "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getInputFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "InputFont", ExifInterface.GPS_DIRECTION_TRUE, "getInputPlaceholderColor", "InputPlaceholderColor", "U", "getInputPrefixColor", "InputPrefixColor", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getInputSuffixColor", "InputSuffixColor", ExifInterface.LONGITUDE_WEST, "getLabelColor", "LabelColor", "X", "getLabelFont", "LabelFont", "Y", "getLeadingIconColor", "LeadingIconColor", "Z", "getLeadingIconSize-D9Ej5fM", "LeadingIconSize", "a0", "getOutlineColor", "OutlineColor", "b0", "getOutlineWidth-D9Ej5fM", "OutlineWidth", "c0", "getSupportingColor", "SupportingColor", "d0", "getSupportingFont", "SupportingFont", "e0", "getTrailingIconColor", "TrailingIconColor", "f0", "getTrailingIconSize-D9Ej5fM", "TrailingIconSize", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOutlinedTextFieldTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextFieldTokens.kt\nandroidx/compose/material3/tokens/OutlinedTextFieldTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,89:1\n164#2:90\n164#2:91\n164#2:92\n164#2:93\n164#2:94\n164#2:95\n164#2:96\n*S KotlinDebug\n*F\n+ 1 OutlinedTextFieldTokens.kt\nandroidx/compose/material3/tokens/OutlinedTextFieldTokens\n*L\n25#1:90\n35#1:91\n63#1:92\n70#1:93\n81#1:94\n83#1:95\n87#1:96\n*E\n"})
public final class OutlinedTextFieldTokens {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ErrorOutlineColor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ErrorSupportingColor;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ErrorTrailingIconColor;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FocusInputColor;
    public static final float DisabledInputOpacity = 0.38f;
    public static final float DisabledLabelOpacity = 0.38f;
    public static final float DisabledLeadingIconOpacity = 0.38f;
    public static final float DisabledOutlineOpacity = 0.12f;
    public static final float DisabledSupportingOpacity = 0.38f;
    public static final float DisabledTrailingIconOpacity = 0.38f;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FocusLabelColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FocusLeadingIconColor;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FocusOutlineColor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public static final float FocusOutlineWidth;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FocusSupportingColor;

    @NotNull
    public static final OutlinedTextFieldTokens INSTANCE = new OutlinedTextFieldTokens();

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens FocusTrailingIconColor;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens HoverInputColor;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens HoverLabelColor;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens HoverLeadingIconColor;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens HoverOutlineColor;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public static final float HoverOutlineWidth;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens HoverSupportingColor;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens HoverTrailingIconColor;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InputColor;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens InputFont;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InputPlaceholderColor;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InputPrefixColor;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens InputSuffixColor;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens LabelColor;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens LabelFont;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens LeadingIconColor;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public static final float LeadingIconSize;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens CaretColor;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens OutlineColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float ContainerHeight;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    public static final float OutlineWidth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens ContainerShape;

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SupportingColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledInputColor;

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final TypographyKeyTokens SupportingFont;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledLabelColor;

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens TrailingIconColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledLeadingIconColor;

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    public static final float TrailingIconSize;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledOutlineColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final float DisabledOutlineWidth;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledSupportingColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledTrailingIconColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ErrorFocusCaretColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ErrorFocusInputColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ErrorFocusLabelColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ErrorFocusLeadingIconColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ErrorFocusOutlineColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ErrorFocusSupportingColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ErrorFocusTrailingIconColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ErrorHoverInputColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ErrorHoverLabelColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ErrorHoverLeadingIconColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ErrorHoverOutlineColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ErrorHoverSupportingColor;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ErrorHoverTrailingIconColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ErrorInputColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ErrorLabelColor;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens ErrorLeadingIconColor;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        CaretColor = colorSchemeKeyTokens;
        ContainerHeight = Dp.m4389constructorimpl((float) 56.0d);
        ContainerShape = ShapeKeyTokens.CornerExtraSmall;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        DisabledInputColor = colorSchemeKeyTokens2;
        DisabledLabelColor = colorSchemeKeyTokens2;
        DisabledLeadingIconColor = colorSchemeKeyTokens2;
        DisabledOutlineColor = colorSchemeKeyTokens2;
        float f6 = (float) 1.0d;
        DisabledOutlineWidth = Dp.m4389constructorimpl(f6);
        DisabledSupportingColor = colorSchemeKeyTokens2;
        DisabledTrailingIconColor = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.Error;
        ErrorFocusCaretColor = colorSchemeKeyTokens3;
        ErrorFocusInputColor = colorSchemeKeyTokens2;
        ErrorFocusLabelColor = colorSchemeKeyTokens3;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.OnSurfaceVariant;
        ErrorFocusLeadingIconColor = colorSchemeKeyTokens4;
        ErrorFocusOutlineColor = colorSchemeKeyTokens3;
        ErrorFocusSupportingColor = colorSchemeKeyTokens3;
        ErrorFocusTrailingIconColor = colorSchemeKeyTokens3;
        ErrorHoverInputColor = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.OnErrorContainer;
        ErrorHoverLabelColor = colorSchemeKeyTokens5;
        ErrorHoverLeadingIconColor = colorSchemeKeyTokens4;
        ErrorHoverOutlineColor = colorSchemeKeyTokens5;
        ErrorHoverSupportingColor = colorSchemeKeyTokens3;
        ErrorHoverTrailingIconColor = colorSchemeKeyTokens5;
        ErrorInputColor = colorSchemeKeyTokens2;
        ErrorLabelColor = colorSchemeKeyTokens3;
        ErrorLeadingIconColor = colorSchemeKeyTokens4;
        ErrorOutlineColor = colorSchemeKeyTokens3;
        ErrorSupportingColor = colorSchemeKeyTokens3;
        ErrorTrailingIconColor = colorSchemeKeyTokens3;
        FocusInputColor = colorSchemeKeyTokens2;
        FocusLabelColor = colorSchemeKeyTokens;
        FocusLeadingIconColor = colorSchemeKeyTokens4;
        FocusOutlineColor = colorSchemeKeyTokens;
        FocusOutlineWidth = Dp.m4389constructorimpl((float) 2.0d);
        FocusSupportingColor = colorSchemeKeyTokens4;
        FocusTrailingIconColor = colorSchemeKeyTokens4;
        HoverInputColor = colorSchemeKeyTokens2;
        HoverLabelColor = colorSchemeKeyTokens2;
        HoverLeadingIconColor = colorSchemeKeyTokens4;
        HoverOutlineColor = colorSchemeKeyTokens2;
        HoverOutlineWidth = Dp.m4389constructorimpl(f6);
        HoverSupportingColor = colorSchemeKeyTokens4;
        HoverTrailingIconColor = colorSchemeKeyTokens4;
        InputColor = colorSchemeKeyTokens2;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.BodyLarge;
        InputFont = typographyKeyTokens;
        InputPlaceholderColor = colorSchemeKeyTokens4;
        InputPrefixColor = colorSchemeKeyTokens4;
        InputSuffixColor = colorSchemeKeyTokens4;
        LabelColor = colorSchemeKeyTokens4;
        LabelFont = typographyKeyTokens;
        LeadingIconColor = colorSchemeKeyTokens4;
        float f10 = (float) 24.0d;
        LeadingIconSize = Dp.m4389constructorimpl(f10);
        OutlineColor = ColorSchemeKeyTokens.Outline;
        OutlineWidth = Dp.m4389constructorimpl(f6);
        SupportingColor = colorSchemeKeyTokens4;
        SupportingFont = TypographyKeyTokens.BodySmall;
        TrailingIconColor = colorSchemeKeyTokens4;
        TrailingIconSize = Dp.m4389constructorimpl(f10);
    }

    @NotNull
    public final ColorSchemeKeyTokens getCaretColor() {
        return CaretColor;
    }

    /* JADX INFO: renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1826getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    @NotNull
    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledInputColor() {
        return DisabledInputColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledLabelColor() {
        return DisabledLabelColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledLeadingIconColor() {
        return DisabledLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledOutlineColor() {
        return DisabledOutlineColor;
    }

    /* JADX INFO: renamed from: getDisabledOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1827getDisabledOutlineWidthD9Ej5fM() {
        return DisabledOutlineWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledSupportingColor() {
        return DisabledSupportingColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledTrailingIconColor() {
        return DisabledTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorFocusCaretColor() {
        return ErrorFocusCaretColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorFocusInputColor() {
        return ErrorFocusInputColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorFocusLabelColor() {
        return ErrorFocusLabelColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorFocusLeadingIconColor() {
        return ErrorFocusLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorFocusOutlineColor() {
        return ErrorFocusOutlineColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorFocusSupportingColor() {
        return ErrorFocusSupportingColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorFocusTrailingIconColor() {
        return ErrorFocusTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorHoverInputColor() {
        return ErrorHoverInputColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorHoverLabelColor() {
        return ErrorHoverLabelColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorHoverLeadingIconColor() {
        return ErrorHoverLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorHoverOutlineColor() {
        return ErrorHoverOutlineColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorHoverSupportingColor() {
        return ErrorHoverSupportingColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorHoverTrailingIconColor() {
        return ErrorHoverTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorInputColor() {
        return ErrorInputColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorLabelColor() {
        return ErrorLabelColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorLeadingIconColor() {
        return ErrorLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorOutlineColor() {
        return ErrorOutlineColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorSupportingColor() {
        return ErrorSupportingColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getErrorTrailingIconColor() {
        return ErrorTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusInputColor() {
        return FocusInputColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusLabelColor() {
        return FocusLabelColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusLeadingIconColor() {
        return FocusLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusOutlineColor() {
        return FocusOutlineColor;
    }

    /* JADX INFO: renamed from: getFocusOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1828getFocusOutlineWidthD9Ej5fM() {
        return FocusOutlineWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusSupportingColor() {
        return FocusSupportingColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getFocusTrailingIconColor() {
        return FocusTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHoverInputColor() {
        return HoverInputColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHoverLabelColor() {
        return HoverLabelColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHoverLeadingIconColor() {
        return HoverLeadingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHoverOutlineColor() {
        return HoverOutlineColor;
    }

    /* JADX INFO: renamed from: getHoverOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1829getHoverOutlineWidthD9Ej5fM() {
        return HoverOutlineWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHoverSupportingColor() {
        return HoverSupportingColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getHoverTrailingIconColor() {
        return HoverTrailingIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInputColor() {
        return InputColor;
    }

    @NotNull
    public final TypographyKeyTokens getInputFont() {
        return InputFont;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInputPlaceholderColor() {
        return InputPlaceholderColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInputPrefixColor() {
        return InputPrefixColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getInputSuffixColor() {
        return InputSuffixColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getLabelColor() {
        return LabelColor;
    }

    @NotNull
    public final TypographyKeyTokens getLabelFont() {
        return LabelFont;
    }

    @NotNull
    public final ColorSchemeKeyTokens getLeadingIconColor() {
        return LeadingIconColor;
    }

    /* JADX INFO: renamed from: getLeadingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1830getLeadingIconSizeD9Ej5fM() {
        return LeadingIconSize;
    }

    @NotNull
    public final ColorSchemeKeyTokens getOutlineColor() {
        return OutlineColor;
    }

    /* JADX INFO: renamed from: getOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1831getOutlineWidthD9Ej5fM() {
        return OutlineWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSupportingColor() {
        return SupportingColor;
    }

    @NotNull
    public final TypographyKeyTokens getSupportingFont() {
        return SupportingFont;
    }

    @NotNull
    public final ColorSchemeKeyTokens getTrailingIconColor() {
        return TrailingIconColor;
    }

    /* JADX INFO: renamed from: getTrailingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1832getTrailingIconSizeD9Ej5fM() {
        return TrailingIconSize;
    }
}
