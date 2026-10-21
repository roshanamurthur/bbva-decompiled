package androidx.compose.material3.tokens;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.unit.Dp;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CheckboxTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\bI\n\u0002\u0018\u0002\n\u0002\b>\bÀ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b£\u0001\u0010¤\u0001R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001e\u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R \u0010!\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R\u0017\u0010$\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0018R\u0017\u0010'\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0018R\u0017\u0010*\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0018R\u0017\u0010-\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b+\u0010\u0016\u001a\u0004\b,\u0010\u0018R \u00100\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b.\u0010\u0004\u001a\u0004\b/\u0010\u0006R\u0017\u00103\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b1\u0010\u0016\u001a\u0004\b2\u0010\u0018R\u0017\u00106\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b4\u0010\u0016\u001a\u0004\b5\u0010\u0018R \u00109\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b7\u0010\u0004\u001a\u0004\b8\u0010\u0006R\u0017\u0010<\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b:\u0010\u0016\u001a\u0004\b;\u0010\u0018R\u0017\u0010?\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b=\u0010\u0016\u001a\u0004\b>\u0010\u0018R\u0017\u0010B\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b@\u0010\u0016\u001a\u0004\bA\u0010\u0018R \u0010E\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bC\u0010\u0004\u001a\u0004\bD\u0010\u0006R\u0017\u0010H\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bF\u0010\u0016\u001a\u0004\bG\u0010\u0018R\u0017\u0010K\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bI\u0010\u0016\u001a\u0004\bJ\u0010\u0018R \u0010N\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bL\u0010\u0004\u001a\u0004\bM\u0010\u0006R\u0017\u0010Q\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bO\u0010\u0016\u001a\u0004\bP\u0010\u0018R\u0017\u0010T\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bR\u0010\u0016\u001a\u0004\bS\u0010\u0018R \u0010W\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bU\u0010\u0004\u001a\u0004\bV\u0010\u0006R\u0017\u0010Z\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bX\u0010\u0016\u001a\u0004\bY\u0010\u0018R \u0010]\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b[\u0010\u0004\u001a\u0004\b\\\u0010\u0006R\u0017\u0010`\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b^\u0010\u0016\u001a\u0004\b_\u0010\u0018R\u0017\u0010c\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\ba\u0010\u0016\u001a\u0004\bb\u0010\u0018R \u0010f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bd\u0010\u0004\u001a\u0004\be\u0010\u0006R\u0017\u0010l\u001a\u00020g8\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR \u0010n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0004\u001a\u0004\bm\u0010\u0006R\u0014\u0010o\u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\bo\u0010\u0004R\u0017\u0010r\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bp\u0010\u0016\u001a\u0004\bq\u0010\u0018R \u0010u\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bs\u0010\u0004\u001a\u0004\bt\u0010\u0006R\u0017\u0010x\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bv\u0010\u0016\u001a\u0004\bw\u0010\u0018R \u0010{\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\by\u0010\u0004\u001a\u0004\bz\u0010\u0006R\u0017\u0010~\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b|\u0010\u0016\u001a\u0004\b}\u0010\u0018R\"\u0010\u0081\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\r\n\u0004\b\u007f\u0010\u0004\u001a\u0005\b\u0080\u0001\u0010\u0006R\u001a\u0010\u0084\u0001\u001a\u00020\u00148\u0006¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010\u0016\u001a\u0005\b\u0083\u0001\u0010\u0018R\u001a\u0010\u0087\u0001\u001a\u00020\u00148\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\u0016\u001a\u0005\b\u0086\u0001\u0010\u0018R#\u0010\u008a\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010\u0004\u001a\u0005\b\u0089\u0001\u0010\u0006R\u001a\u0010\u008d\u0001\u001a\u00020\u00148\u0006¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\u0016\u001a\u0005\b\u008c\u0001\u0010\u0018R#\u0010\u0090\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010\u0004\u001a\u0005\b\u008f\u0001\u0010\u0006R\u001a\u0010\u0093\u0001\u001a\u00020\u00148\u0006¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010\u0016\u001a\u0005\b\u0092\u0001\u0010\u0018R#\u0010\u0096\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010\u0004\u001a\u0005\b\u0095\u0001\u0010\u0006R\u001a\u0010\u0099\u0001\u001a\u00020\u00148\u0006¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010\u0016\u001a\u0005\b\u0098\u0001\u0010\u0018R#\u0010\u009c\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u009a\u0001\u0010\u0004\u001a\u0005\b\u009b\u0001\u0010\u0006R\u001a\u0010\u009f\u0001\u001a\u00020\u00148\u0006¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010\u0016\u001a\u0005\b\u009e\u0001\u0010\u0018R#\u0010¢\u0001\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b \u0001\u0010\u0004\u001a\u0005\b¡\u0001\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¥\u0001"}, d2 = {"Landroidx/compose/material3/tokens/CheckboxTokens;", "", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getContainerHeight-D9Ej5fM", "()F", "ContainerHeight", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "b", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getContainerShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "ContainerShape", "c", "getContainerWidth-D9Ej5fM", "ContainerWidth", "d", "getIconSize-D9Ej5fM", "IconSize", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "e", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getSelectedContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "SelectedContainerColor", "f", "getSelectedDisabledContainerColor", "SelectedDisabledContainerColor", "", "SelectedDisabledContainerOpacity", "g", "getSelectedDisabledContainerOutlineWidth-D9Ej5fM", "SelectedDisabledContainerOutlineWidth", "h", "getSelectedDisabledIconColor", "SelectedDisabledIconColor", "i", "getSelectedErrorContainerColor", "SelectedErrorContainerColor", "j", "getSelectedErrorFocusContainerColor", "SelectedErrorFocusContainerColor", "k", "getSelectedErrorFocusIconColor", "SelectedErrorFocusIconColor", "l", "getSelectedErrorFocusOutlineWidth-D9Ej5fM", "SelectedErrorFocusOutlineWidth", "m", "getSelectedErrorHoverContainerColor", "SelectedErrorHoverContainerColor", "n", "getSelectedErrorHoverIconColor", "SelectedErrorHoverIconColor", "o", "getSelectedErrorHoverOutlineWidth-D9Ej5fM", "SelectedErrorHoverOutlineWidth", "p", "getSelectedErrorIconColor", "SelectedErrorIconColor", "q", "getSelectedErrorPressedContainerColor", "SelectedErrorPressedContainerColor", "r", "getSelectedErrorPressedIconColor", "SelectedErrorPressedIconColor", "s", "getSelectedErrorPressedOutlineWidth-D9Ej5fM", "SelectedErrorPressedOutlineWidth", "t", "getSelectedFocusContainerColor", "SelectedFocusContainerColor", "u", "getSelectedFocusIconColor", "SelectedFocusIconColor", SharedPrefsStorage.VERSION_KEY, "getSelectedFocusOutlineWidth-D9Ej5fM", "SelectedFocusOutlineWidth", "w", "getSelectedHoverContainerColor", "SelectedHoverContainerColor", "x", "getSelectedHoverIconColor", "SelectedHoverIconColor", "y", "getSelectedHoverOutlineWidth-D9Ej5fM", "SelectedHoverOutlineWidth", "z", "getSelectedIconColor", "SelectedIconColor", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getSelectedOutlineWidth-D9Ej5fM", "SelectedOutlineWidth", "B", "getSelectedPressedContainerColor", "SelectedPressedContainerColor", "C", "getSelectedPressedIconColor", "SelectedPressedIconColor", "D", "getSelectedPressedOutlineWidth-D9Ej5fM", "SelectedPressedOutlineWidth", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", ExifInterface.LONGITUDE_EAST, "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getStateLayerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "StateLayerShape", "getStateLayerSize-D9Ej5fM", "StateLayerSize", "UnselectedDisabledContainerOpacity", "G", "getUnselectedDisabledOutlineColor", "UnselectedDisabledOutlineColor", "H", "getUnselectedDisabledOutlineWidth-D9Ej5fM", "UnselectedDisabledOutlineWidth", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getUnselectedErrorFocusOutlineColor", "UnselectedErrorFocusOutlineColor", "J", "getUnselectedErrorFocusOutlineWidth-D9Ej5fM", "UnselectedErrorFocusOutlineWidth", "K", "getUnselectedErrorHoverOutlineColor", "UnselectedErrorHoverOutlineColor", "L", "getUnselectedErrorHoverOutlineWidth-D9Ej5fM", "UnselectedErrorHoverOutlineWidth", "M", "getUnselectedErrorOutlineColor", "UnselectedErrorOutlineColor", "N", "getUnselectedErrorPressedOutlineColor", "UnselectedErrorPressedOutlineColor", "O", "getUnselectedErrorPressedOutlineWidth-D9Ej5fM", "UnselectedErrorPressedOutlineWidth", "P", "getUnselectedFocusOutlineColor", "UnselectedFocusOutlineColor", TransactionType.TRANSACTION_TYPE_CONTACTLESS_CODE, "getUnselectedFocusOutlineWidth-D9Ej5fM", "UnselectedFocusOutlineWidth", "R", "getUnselectedHoverOutlineColor", "UnselectedHoverOutlineColor", ExifInterface.LATITUDE_SOUTH, "getUnselectedHoverOutlineWidth-D9Ej5fM", "UnselectedHoverOutlineWidth", ExifInterface.GPS_DIRECTION_TRUE, "getUnselectedOutlineColor", "UnselectedOutlineColor", "U", "getUnselectedOutlineWidth-D9Ej5fM", "UnselectedOutlineWidth", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getUnselectedPressedOutlineColor", "UnselectedPressedOutlineColor", ExifInterface.LONGITUDE_WEST, "getUnselectedPressedOutlineWidth-D9Ej5fM", "UnselectedPressedOutlineWidth", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCheckboxTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckboxTokens.kt\nandroidx/compose/material3/tokens/CheckboxTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,77:1\n164#2:78\n164#2:79\n164#2:80\n164#2:81\n164#2:82\n164#2:83\n164#2:84\n164#2:85\n164#2:86\n164#2:87\n164#2:88\n164#2:89\n164#2:90\n164#2:91\n164#2:92\n164#2:93\n164#2:94\n164#2:95\n164#2:96\n164#2:97\n164#2:98\n*S KotlinDebug\n*F\n+ 1 CheckboxTokens.kt\nandroidx/compose/material3/tokens/CheckboxTokens\n*L\n25#1:78\n26#1:79\n27#1:80\n28#1:81\n32#1:82\n37#1:83\n40#1:84\n44#1:85\n47#1:86\n50#1:87\n52#1:88\n55#1:89\n57#1:90\n60#1:91\n62#1:92\n64#1:93\n67#1:94\n69#1:95\n71#1:96\n73#1:97\n75#1:98\n*E\n"})
public final class CheckboxTokens {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public static final float SelectedOutlineWidth;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedPressedContainerColor;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedPressedIconColor;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public static final float SelectedPressedOutlineWidth;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens StateLayerShape;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public static final float StateLayerSize;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedDisabledOutlineColor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public static final float UnselectedDisabledOutlineWidth;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedErrorFocusOutlineColor;

    @NotNull
    public static final CheckboxTokens INSTANCE = new CheckboxTokens();

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public static final float UnselectedErrorFocusOutlineWidth;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedErrorHoverOutlineColor;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public static final float UnselectedErrorHoverOutlineWidth;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedErrorOutlineColor;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedErrorPressedOutlineColor;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public static final float UnselectedErrorPressedOutlineWidth;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedFocusOutlineColor;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public static final float UnselectedFocusOutlineWidth;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedHoverOutlineColor;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public static final float UnselectedHoverOutlineWidth;
    public static final float SelectedDisabledContainerOpacity = 0.38f;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedOutlineColor;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public static final float UnselectedOutlineWidth;
    public static final float UnselectedDisabledContainerOpacity = 0.38f;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedPressedOutlineColor;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public static final float UnselectedPressedOutlineWidth;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final float ContainerHeight;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final RoundedCornerShape ContainerShape;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final float ContainerWidth;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final float IconSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedContainerColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedDisabledContainerColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final float SelectedDisabledContainerOutlineWidth;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedDisabledIconColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedErrorContainerColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedErrorFocusContainerColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedErrorFocusIconColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final float SelectedErrorFocusOutlineWidth;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedErrorHoverContainerColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedErrorHoverIconColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final float SelectedErrorHoverOutlineWidth;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedErrorIconColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedErrorPressedContainerColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedErrorPressedIconColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final float SelectedErrorPressedOutlineWidth;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedFocusContainerColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedFocusIconColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final float SelectedFocusOutlineWidth;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedHoverContainerColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedHoverIconColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final float SelectedHoverOutlineWidth;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedIconColor;

    static {
        float f6 = (float) 18.0d;
        ContainerHeight = Dp.m4389constructorimpl(f6);
        float f10 = (float) 2.0d;
        ContainerShape = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(Dp.m4389constructorimpl(f10));
        ContainerWidth = Dp.m4389constructorimpl(f6);
        IconSize = Dp.m4389constructorimpl(f6);
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        SelectedContainerColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        SelectedDisabledContainerColor = colorSchemeKeyTokens2;
        float f11 = (float) 0.0d;
        SelectedDisabledContainerOutlineWidth = Dp.m4389constructorimpl(f11);
        SelectedDisabledIconColor = ColorSchemeKeyTokens.Surface;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.Error;
        SelectedErrorContainerColor = colorSchemeKeyTokens3;
        SelectedErrorFocusContainerColor = colorSchemeKeyTokens3;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.OnError;
        SelectedErrorFocusIconColor = colorSchemeKeyTokens4;
        SelectedErrorFocusOutlineWidth = Dp.m4389constructorimpl(f11);
        SelectedErrorHoverContainerColor = colorSchemeKeyTokens3;
        SelectedErrorHoverIconColor = colorSchemeKeyTokens4;
        SelectedErrorHoverOutlineWidth = Dp.m4389constructorimpl(f11);
        SelectedErrorIconColor = colorSchemeKeyTokens4;
        SelectedErrorPressedContainerColor = colorSchemeKeyTokens3;
        SelectedErrorPressedIconColor = colorSchemeKeyTokens4;
        SelectedErrorPressedOutlineWidth = Dp.m4389constructorimpl(f11);
        SelectedFocusContainerColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.OnPrimary;
        SelectedFocusIconColor = colorSchemeKeyTokens5;
        SelectedFocusOutlineWidth = Dp.m4389constructorimpl(f11);
        SelectedHoverContainerColor = colorSchemeKeyTokens;
        SelectedHoverIconColor = colorSchemeKeyTokens5;
        SelectedHoverOutlineWidth = Dp.m4389constructorimpl(f11);
        SelectedIconColor = colorSchemeKeyTokens5;
        SelectedOutlineWidth = Dp.m4389constructorimpl(f11);
        SelectedPressedContainerColor = colorSchemeKeyTokens;
        SelectedPressedIconColor = colorSchemeKeyTokens5;
        SelectedPressedOutlineWidth = Dp.m4389constructorimpl(f11);
        StateLayerShape = ShapeKeyTokens.CornerFull;
        StateLayerSize = Dp.m4389constructorimpl((float) 40.0d);
        UnselectedDisabledOutlineColor = colorSchemeKeyTokens2;
        UnselectedDisabledOutlineWidth = Dp.m4389constructorimpl(f10);
        UnselectedErrorFocusOutlineColor = colorSchemeKeyTokens3;
        UnselectedErrorFocusOutlineWidth = Dp.m4389constructorimpl(f10);
        UnselectedErrorHoverOutlineColor = colorSchemeKeyTokens3;
        UnselectedErrorHoverOutlineWidth = Dp.m4389constructorimpl(f10);
        UnselectedErrorOutlineColor = colorSchemeKeyTokens3;
        UnselectedErrorPressedOutlineColor = colorSchemeKeyTokens3;
        UnselectedErrorPressedOutlineWidth = Dp.m4389constructorimpl(f10);
        UnselectedFocusOutlineColor = colorSchemeKeyTokens2;
        UnselectedFocusOutlineWidth = Dp.m4389constructorimpl(f10);
        UnselectedHoverOutlineColor = colorSchemeKeyTokens2;
        UnselectedHoverOutlineWidth = Dp.m4389constructorimpl(f10);
        UnselectedOutlineColor = ColorSchemeKeyTokens.OnSurfaceVariant;
        UnselectedOutlineWidth = Dp.m4389constructorimpl(f10);
        UnselectedPressedOutlineColor = colorSchemeKeyTokens2;
        UnselectedPressedOutlineWidth = Dp.m4389constructorimpl(f10);
    }

    /* JADX INFO: renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m1517getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    @NotNull
    public final RoundedCornerShape getContainerShape() {
        return ContainerShape;
    }

    /* JADX INFO: renamed from: getContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m1518getContainerWidthD9Ej5fM() {
        return ContainerWidth;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1519getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedContainerColor() {
        return SelectedContainerColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedDisabledContainerColor() {
        return SelectedDisabledContainerColor;
    }

    /* JADX INFO: renamed from: getSelectedDisabledContainerOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1520getSelectedDisabledContainerOutlineWidthD9Ej5fM() {
        return SelectedDisabledContainerOutlineWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedDisabledIconColor() {
        return SelectedDisabledIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedErrorContainerColor() {
        return SelectedErrorContainerColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedErrorFocusContainerColor() {
        return SelectedErrorFocusContainerColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedErrorFocusIconColor() {
        return SelectedErrorFocusIconColor;
    }

    /* JADX INFO: renamed from: getSelectedErrorFocusOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1521getSelectedErrorFocusOutlineWidthD9Ej5fM() {
        return SelectedErrorFocusOutlineWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedErrorHoverContainerColor() {
        return SelectedErrorHoverContainerColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedErrorHoverIconColor() {
        return SelectedErrorHoverIconColor;
    }

    /* JADX INFO: renamed from: getSelectedErrorHoverOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1522getSelectedErrorHoverOutlineWidthD9Ej5fM() {
        return SelectedErrorHoverOutlineWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedErrorIconColor() {
        return SelectedErrorIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedErrorPressedContainerColor() {
        return SelectedErrorPressedContainerColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedErrorPressedIconColor() {
        return SelectedErrorPressedIconColor;
    }

    /* JADX INFO: renamed from: getSelectedErrorPressedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1523getSelectedErrorPressedOutlineWidthD9Ej5fM() {
        return SelectedErrorPressedOutlineWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedFocusContainerColor() {
        return SelectedFocusContainerColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedFocusIconColor() {
        return SelectedFocusIconColor;
    }

    /* JADX INFO: renamed from: getSelectedFocusOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1524getSelectedFocusOutlineWidthD9Ej5fM() {
        return SelectedFocusOutlineWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedHoverContainerColor() {
        return SelectedHoverContainerColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedHoverIconColor() {
        return SelectedHoverIconColor;
    }

    /* JADX INFO: renamed from: getSelectedHoverOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1525getSelectedHoverOutlineWidthD9Ej5fM() {
        return SelectedHoverOutlineWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedIconColor() {
        return SelectedIconColor;
    }

    /* JADX INFO: renamed from: getSelectedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1526getSelectedOutlineWidthD9Ej5fM() {
        return SelectedOutlineWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedPressedContainerColor() {
        return SelectedPressedContainerColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedPressedIconColor() {
        return SelectedPressedIconColor;
    }

    /* JADX INFO: renamed from: getSelectedPressedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1527getSelectedPressedOutlineWidthD9Ej5fM() {
        return SelectedPressedOutlineWidth;
    }

    @NotNull
    public final ShapeKeyTokens getStateLayerShape() {
        return StateLayerShape;
    }

    /* JADX INFO: renamed from: getStateLayerSize-D9Ej5fM, reason: not valid java name */
    public final float m1528getStateLayerSizeD9Ej5fM() {
        return StateLayerSize;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedDisabledOutlineColor() {
        return UnselectedDisabledOutlineColor;
    }

    /* JADX INFO: renamed from: getUnselectedDisabledOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1529getUnselectedDisabledOutlineWidthD9Ej5fM() {
        return UnselectedDisabledOutlineWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedErrorFocusOutlineColor() {
        return UnselectedErrorFocusOutlineColor;
    }

    /* JADX INFO: renamed from: getUnselectedErrorFocusOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1530getUnselectedErrorFocusOutlineWidthD9Ej5fM() {
        return UnselectedErrorFocusOutlineWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedErrorHoverOutlineColor() {
        return UnselectedErrorHoverOutlineColor;
    }

    /* JADX INFO: renamed from: getUnselectedErrorHoverOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1531getUnselectedErrorHoverOutlineWidthD9Ej5fM() {
        return UnselectedErrorHoverOutlineWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedErrorOutlineColor() {
        return UnselectedErrorOutlineColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedErrorPressedOutlineColor() {
        return UnselectedErrorPressedOutlineColor;
    }

    /* JADX INFO: renamed from: getUnselectedErrorPressedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1532getUnselectedErrorPressedOutlineWidthD9Ej5fM() {
        return UnselectedErrorPressedOutlineWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedFocusOutlineColor() {
        return UnselectedFocusOutlineColor;
    }

    /* JADX INFO: renamed from: getUnselectedFocusOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1533getUnselectedFocusOutlineWidthD9Ej5fM() {
        return UnselectedFocusOutlineWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedHoverOutlineColor() {
        return UnselectedHoverOutlineColor;
    }

    /* JADX INFO: renamed from: getUnselectedHoverOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1534getUnselectedHoverOutlineWidthD9Ej5fM() {
        return UnselectedHoverOutlineWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedOutlineColor() {
        return UnselectedOutlineColor;
    }

    /* JADX INFO: renamed from: getUnselectedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1535getUnselectedOutlineWidthD9Ej5fM() {
        return UnselectedOutlineWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedPressedOutlineColor() {
        return UnselectedPressedOutlineColor;
    }

    /* JADX INFO: renamed from: getUnselectedPressedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1536getUnselectedPressedOutlineWidthD9Ej5fM() {
        return UnselectedPressedOutlineWidth;
    }
}
