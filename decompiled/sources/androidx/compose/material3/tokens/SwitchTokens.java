package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SwitchTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0003\b\u0087\u0001\bÀ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\nR\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006R\u0017\u0010&\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010+\u001a\u00020'8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b(\u0010\n\u001a\u0004\b)\u0010*R \u0010.\u001a\u00020'8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b,\u0010\n\u001a\u0004\b-\u0010*R\u0017\u00101\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R\u0017\u00104\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006R\u0017\u00107\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006R\u0017\u0010:\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\u0004\u001a\u0004\b9\u0010\u0006R \u0010=\u001a\u00020'8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b;\u0010\n\u001a\u0004\b<\u0010*R \u0010@\u001a\u00020'8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b>\u0010\n\u001a\u0004\b?\u0010*R\u0017\u0010C\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010\u0004\u001a\u0004\bB\u0010\u0006R\u0017\u0010F\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010\u0004\u001a\u0004\bE\u0010\u0006R\u0017\u0010I\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010\u0004\u001a\u0004\bH\u0010\u0006R\u0017\u0010L\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010\u0004\u001a\u0004\bK\u0010\u0006R \u0010O\u001a\u00020'8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bM\u0010\n\u001a\u0004\bN\u0010*R\u0017\u0010R\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bP\u0010\u0004\u001a\u0004\bQ\u0010\u0006R\u0017\u0010U\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u0010\u0004\u001a\u0004\bT\u0010\u0006R\u0017\u0010X\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bV\u0010\u0004\u001a\u0004\bW\u0010\u0006R\u0017\u0010[\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bY\u0010\u0004\u001a\u0004\bZ\u0010\u0006R\u0017\u0010^\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\\\u0010#\u001a\u0004\b]\u0010%R \u0010a\u001a\u00020'8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b_\u0010\n\u001a\u0004\b`\u0010*R \u0010d\u001a\u00020'8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bb\u0010\n\u001a\u0004\bc\u0010*R \u0010g\u001a\u00020'8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\be\u0010\n\u001a\u0004\bf\u0010*R\u0017\u0010j\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bh\u0010#\u001a\u0004\bi\u0010%R \u0010m\u001a\u00020'8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bk\u0010\n\u001a\u0004\bl\u0010*R\u0017\u0010o\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\bn\u0010\u0006R\u0017\u0010r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bp\u0010\u0004\u001a\u0004\bq\u0010\u0006R\u0017\u0010u\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bs\u0010\u0004\u001a\u0004\bt\u0010\u0006R\u0017\u0010x\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bv\u0010\u0004\u001a\u0004\bw\u0010\u0006R\u0017\u0010{\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\by\u0010\u0004\u001a\u0004\bz\u0010\u0006R \u0010~\u001a\u00020'8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b|\u0010\n\u001a\u0004\b}\u0010*R\"\u0010\u0081\u0001\u001a\u00020'8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\r\n\u0004\b\u007f\u0010\n\u001a\u0005\b\u0080\u0001\u0010*R\u001a\u0010\u0084\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010\u0004\u001a\u0005\b\u0083\u0001\u0010\u0006R\u001a\u0010\u0087\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\u0004\u001a\u0005\b\u0086\u0001\u0010\u0006R\u001a\u0010\u008a\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010\u0004\u001a\u0005\b\u0089\u0001\u0010\u0006R\u001a\u0010\u008d\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\u0004\u001a\u0005\b\u008c\u0001\u0010\u0006R\u001a\u0010\u0090\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010\u0004\u001a\u0005\b\u008f\u0001\u0010\u0006R#\u0010\u0093\u0001\u001a\u00020'8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010\n\u001a\u0005\b\u0092\u0001\u0010*R\u001a\u0010\u0096\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010\u0004\u001a\u0005\b\u0095\u0001\u0010\u0006R\u001a\u0010\u0099\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010\u0004\u001a\u0005\b\u0098\u0001\u0010\u0006R\u001a\u0010\u009c\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u009a\u0001\u0010\u0004\u001a\u0005\b\u009b\u0001\u0010\u0006R\u001a\u0010\u009f\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010\u0004\u001a\u0005\b\u009e\u0001\u0010\u0006R\u001a\u0010¢\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b \u0001\u0010\u0004\u001a\u0005\b¡\u0001\u0010\u0006R\u001a\u0010¥\u0001\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b£\u0001\u0010\u0004\u001a\u0005\b¤\u0001\u0010\u0006R#\u0010¨\u0001\u001a\u00020'8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¦\u0001\u0010\n\u001a\u0005\b§\u0001\u0010*R#\u0010«\u0001\u001a\u00020'8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b©\u0001\u0010\n\u001a\u0005\bª\u0001\u0010*\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006®\u0001"}, d2 = {"Landroidx/compose/material3/tokens/SwitchTokens;", "", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getDisabledSelectedHandleColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "DisabledSelectedHandleColor", "", "DisabledSelectedHandleOpacity", "F", "b", "getDisabledSelectedIconColor", "DisabledSelectedIconColor", "DisabledSelectedIconOpacity", "c", "getDisabledSelectedTrackColor", "DisabledSelectedTrackColor", "DisabledTrackOpacity", "d", "getDisabledUnselectedHandleColor", "DisabledUnselectedHandleColor", "DisabledUnselectedHandleOpacity", "e", "getDisabledUnselectedIconColor", "DisabledUnselectedIconColor", "DisabledUnselectedIconOpacity", "f", "getDisabledUnselectedTrackColor", "DisabledUnselectedTrackColor", "g", "getDisabledUnselectedTrackOutlineColor", "DisabledUnselectedTrackOutlineColor", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "h", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getHandleShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "HandleShape", "Landroidx/compose/ui/unit/Dp;", "i", "getPressedHandleHeight-D9Ej5fM", "()F", "PressedHandleHeight", "j", "getPressedHandleWidth-D9Ej5fM", "PressedHandleWidth", "k", "getSelectedFocusHandleColor", "SelectedFocusHandleColor", "l", "getSelectedFocusIconColor", "SelectedFocusIconColor", "m", "getSelectedFocusTrackColor", "SelectedFocusTrackColor", "n", "getSelectedHandleColor", "SelectedHandleColor", "o", "getSelectedHandleHeight-D9Ej5fM", "SelectedHandleHeight", "p", "getSelectedHandleWidth-D9Ej5fM", "SelectedHandleWidth", "q", "getSelectedHoverHandleColor", "SelectedHoverHandleColor", "r", "getSelectedHoverIconColor", "SelectedHoverIconColor", "s", "getSelectedHoverTrackColor", "SelectedHoverTrackColor", "t", "getSelectedIconColor", "SelectedIconColor", "u", "getSelectedIconSize-D9Ej5fM", "SelectedIconSize", SharedPrefsStorage.VERSION_KEY, "getSelectedPressedHandleColor", "SelectedPressedHandleColor", "w", "getSelectedPressedIconColor", "SelectedPressedIconColor", "x", "getSelectedPressedTrackColor", "SelectedPressedTrackColor", "y", "getSelectedTrackColor", "SelectedTrackColor", "z", "getStateLayerShape", "StateLayerShape", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getStateLayerSize-D9Ej5fM", "StateLayerSize", "B", "getTrackHeight-D9Ej5fM", "TrackHeight", "C", "getTrackOutlineWidth-D9Ej5fM", "TrackOutlineWidth", "D", "getTrackShape", "TrackShape", ExifInterface.LONGITUDE_EAST, "getTrackWidth-D9Ej5fM", "TrackWidth", "getUnselectedFocusHandleColor", "UnselectedFocusHandleColor", "G", "getUnselectedFocusIconColor", "UnselectedFocusIconColor", "H", "getUnselectedFocusTrackColor", "UnselectedFocusTrackColor", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getUnselectedFocusTrackOutlineColor", "UnselectedFocusTrackOutlineColor", "J", "getUnselectedHandleColor", "UnselectedHandleColor", "K", "getUnselectedHandleHeight-D9Ej5fM", "UnselectedHandleHeight", "L", "getUnselectedHandleWidth-D9Ej5fM", "UnselectedHandleWidth", "M", "getUnselectedHoverHandleColor", "UnselectedHoverHandleColor", "N", "getUnselectedHoverIconColor", "UnselectedHoverIconColor", "O", "getUnselectedHoverTrackColor", "UnselectedHoverTrackColor", "P", "getUnselectedHoverTrackOutlineColor", "UnselectedHoverTrackOutlineColor", TransactionType.TRANSACTION_TYPE_CONTACTLESS_CODE, "getUnselectedIconColor", "UnselectedIconColor", "R", "getUnselectedIconSize-D9Ej5fM", "UnselectedIconSize", ExifInterface.LATITUDE_SOUTH, "getUnselectedPressedHandleColor", "UnselectedPressedHandleColor", ExifInterface.GPS_DIRECTION_TRUE, "getUnselectedPressedIconColor", "UnselectedPressedIconColor", "U", "getUnselectedPressedTrackColor", "UnselectedPressedTrackColor", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getUnselectedPressedTrackOutlineColor", "UnselectedPressedTrackOutlineColor", ExifInterface.LONGITUDE_WEST, "getUnselectedTrackColor", "UnselectedTrackColor", "X", "getUnselectedTrackOutlineColor", "UnselectedTrackOutlineColor", "Y", "getIconHandleHeight-D9Ej5fM", "IconHandleHeight", "Z", "getIconHandleWidth-D9Ej5fM", "IconHandleWidth", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwitchTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwitchTokens.kt\nandroidx/compose/material3/tokens/SwitchTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,81:1\n164#2:82\n164#2:83\n164#2:84\n164#2:85\n164#2:86\n164#2:87\n164#2:88\n164#2:89\n164#2:90\n164#2:91\n164#2:92\n164#2:93\n164#2:94\n164#2:95\n*S KotlinDebug\n*F\n+ 1 SwitchTokens.kt\nandroidx/compose/material3/tokens/SwitchTokens\n*L\n37#1:82\n38#1:83\n43#1:84\n44#1:85\n49#1:86\n55#1:87\n56#1:88\n57#1:89\n59#1:90\n65#1:91\n66#1:92\n72#1:93\n79#1:94\n80#1:95\n*E\n"})
public final class SwitchTokens {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public static final float StateLayerSize;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public static final float TrackHeight;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public static final float TrackOutlineWidth;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens TrackShape;
    public static final float DisabledSelectedHandleOpacity = 1.0f;
    public static final float DisabledSelectedIconOpacity = 0.38f;
    public static final float DisabledTrackOpacity = 0.12f;
    public static final float DisabledUnselectedHandleOpacity = 0.38f;
    public static final float DisabledUnselectedIconOpacity = 0.38f;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public static final float TrackWidth;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedFocusHandleColor;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedFocusIconColor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedFocusTrackColor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedFocusTrackOutlineColor;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedHandleColor;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public static final float UnselectedHandleHeight;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public static final float UnselectedHandleWidth;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedHoverHandleColor;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedHoverIconColor;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedHoverTrackColor;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedHoverTrackOutlineColor;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedIconColor;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public static final float UnselectedIconSize;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedPressedHandleColor;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedPressedIconColor;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedPressedTrackColor;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedPressedTrackOutlineColor;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedTrackColor;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens UnselectedTrackOutlineColor;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public static final float IconHandleHeight;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public static final float IconHandleWidth;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledSelectedIconColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledSelectedTrackColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledUnselectedHandleColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledUnselectedIconColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledUnselectedTrackColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledUnselectedTrackOutlineColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens HandleShape;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final float PressedHandleHeight;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final float PressedHandleWidth;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedFocusHandleColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedFocusIconColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedFocusTrackColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedHandleColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final float SelectedHandleHeight;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final float SelectedHandleWidth;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedHoverHandleColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedHoverIconColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedHoverTrackColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedIconColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public static final float SelectedIconSize;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedPressedHandleColor;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedPressedIconColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedPressedTrackColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens SelectedTrackColor;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ShapeKeyTokens StateLayerShape;

    @NotNull
    public static final SwitchTokens INSTANCE = new SwitchTokens();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ColorSchemeKeyTokens DisabledSelectedHandleColor = ColorSchemeKeyTokens.Surface;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        DisabledSelectedIconColor = colorSchemeKeyTokens;
        DisabledSelectedTrackColor = colorSchemeKeyTokens;
        DisabledUnselectedHandleColor = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.SurfaceVariant;
        DisabledUnselectedIconColor = colorSchemeKeyTokens2;
        DisabledUnselectedTrackColor = colorSchemeKeyTokens2;
        DisabledUnselectedTrackOutlineColor = colorSchemeKeyTokens;
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        HandleShape = shapeKeyTokens;
        float f6 = (float) 28.0d;
        PressedHandleHeight = Dp.m4389constructorimpl(f6);
        PressedHandleWidth = Dp.m4389constructorimpl(f6);
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.PrimaryContainer;
        SelectedFocusHandleColor = colorSchemeKeyTokens3;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.OnPrimaryContainer;
        SelectedFocusIconColor = colorSchemeKeyTokens4;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.Primary;
        SelectedFocusTrackColor = colorSchemeKeyTokens5;
        SelectedHandleColor = ColorSchemeKeyTokens.OnPrimary;
        float f10 = (float) 24.0d;
        SelectedHandleHeight = Dp.m4389constructorimpl(f10);
        SelectedHandleWidth = Dp.m4389constructorimpl(f10);
        SelectedHoverHandleColor = colorSchemeKeyTokens3;
        SelectedHoverIconColor = colorSchemeKeyTokens4;
        SelectedHoverTrackColor = colorSchemeKeyTokens5;
        SelectedIconColor = colorSchemeKeyTokens4;
        float f11 = (float) 16.0d;
        SelectedIconSize = Dp.m4389constructorimpl(f11);
        SelectedPressedHandleColor = colorSchemeKeyTokens3;
        SelectedPressedIconColor = colorSchemeKeyTokens4;
        SelectedPressedTrackColor = colorSchemeKeyTokens5;
        SelectedTrackColor = colorSchemeKeyTokens5;
        StateLayerShape = shapeKeyTokens;
        StateLayerSize = Dp.m4389constructorimpl((float) 40.0d);
        TrackHeight = Dp.m4389constructorimpl((float) 32.0d);
        TrackOutlineWidth = Dp.m4389constructorimpl((float) 2.0d);
        TrackShape = shapeKeyTokens;
        TrackWidth = Dp.m4389constructorimpl((float) 52.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens6 = ColorSchemeKeyTokens.OnSurfaceVariant;
        UnselectedFocusHandleColor = colorSchemeKeyTokens6;
        UnselectedFocusIconColor = colorSchemeKeyTokens2;
        UnselectedFocusTrackColor = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens7 = ColorSchemeKeyTokens.Outline;
        UnselectedFocusTrackOutlineColor = colorSchemeKeyTokens7;
        UnselectedHandleColor = colorSchemeKeyTokens7;
        UnselectedHandleHeight = Dp.m4389constructorimpl(f11);
        UnselectedHandleWidth = Dp.m4389constructorimpl(f11);
        UnselectedHoverHandleColor = colorSchemeKeyTokens6;
        UnselectedHoverIconColor = colorSchemeKeyTokens2;
        UnselectedHoverTrackColor = colorSchemeKeyTokens2;
        UnselectedHoverTrackOutlineColor = colorSchemeKeyTokens7;
        UnselectedIconColor = colorSchemeKeyTokens2;
        UnselectedIconSize = Dp.m4389constructorimpl(f11);
        UnselectedPressedHandleColor = colorSchemeKeyTokens6;
        UnselectedPressedIconColor = colorSchemeKeyTokens2;
        UnselectedPressedTrackColor = colorSchemeKeyTokens2;
        UnselectedPressedTrackOutlineColor = colorSchemeKeyTokens7;
        UnselectedTrackColor = colorSchemeKeyTokens2;
        UnselectedTrackOutlineColor = colorSchemeKeyTokens7;
        IconHandleHeight = Dp.m4389constructorimpl(f10);
        IconHandleWidth = Dp.m4389constructorimpl(f10);
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledSelectedHandleColor() {
        return DisabledSelectedHandleColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledSelectedIconColor() {
        return DisabledSelectedIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledSelectedTrackColor() {
        return DisabledSelectedTrackColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledUnselectedHandleColor() {
        return DisabledUnselectedHandleColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledUnselectedIconColor() {
        return DisabledUnselectedIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledUnselectedTrackColor() {
        return DisabledUnselectedTrackColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledUnselectedTrackOutlineColor() {
        return DisabledUnselectedTrackOutlineColor;
    }

    @NotNull
    public final ShapeKeyTokens getHandleShape() {
        return HandleShape;
    }

    /* JADX INFO: renamed from: getIconHandleHeight-D9Ej5fM, reason: not valid java name */
    public final float m1958getIconHandleHeightD9Ej5fM() {
        return IconHandleHeight;
    }

    /* JADX INFO: renamed from: getIconHandleWidth-D9Ej5fM, reason: not valid java name */
    public final float m1959getIconHandleWidthD9Ej5fM() {
        return IconHandleWidth;
    }

    /* JADX INFO: renamed from: getPressedHandleHeight-D9Ej5fM, reason: not valid java name */
    public final float m1960getPressedHandleHeightD9Ej5fM() {
        return PressedHandleHeight;
    }

    /* JADX INFO: renamed from: getPressedHandleWidth-D9Ej5fM, reason: not valid java name */
    public final float m1961getPressedHandleWidthD9Ej5fM() {
        return PressedHandleWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedFocusHandleColor() {
        return SelectedFocusHandleColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedFocusIconColor() {
        return SelectedFocusIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedFocusTrackColor() {
        return SelectedFocusTrackColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedHandleColor() {
        return SelectedHandleColor;
    }

    /* JADX INFO: renamed from: getSelectedHandleHeight-D9Ej5fM, reason: not valid java name */
    public final float m1962getSelectedHandleHeightD9Ej5fM() {
        return SelectedHandleHeight;
    }

    /* JADX INFO: renamed from: getSelectedHandleWidth-D9Ej5fM, reason: not valid java name */
    public final float m1963getSelectedHandleWidthD9Ej5fM() {
        return SelectedHandleWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedHoverHandleColor() {
        return SelectedHoverHandleColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedHoverIconColor() {
        return SelectedHoverIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedHoverTrackColor() {
        return SelectedHoverTrackColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedIconColor() {
        return SelectedIconColor;
    }

    /* JADX INFO: renamed from: getSelectedIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1964getSelectedIconSizeD9Ej5fM() {
        return SelectedIconSize;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedPressedHandleColor() {
        return SelectedPressedHandleColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedPressedIconColor() {
        return SelectedPressedIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedPressedTrackColor() {
        return SelectedPressedTrackColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedTrackColor() {
        return SelectedTrackColor;
    }

    @NotNull
    public final ShapeKeyTokens getStateLayerShape() {
        return StateLayerShape;
    }

    /* JADX INFO: renamed from: getStateLayerSize-D9Ej5fM, reason: not valid java name */
    public final float m1965getStateLayerSizeD9Ej5fM() {
        return StateLayerSize;
    }

    /* JADX INFO: renamed from: getTrackHeight-D9Ej5fM, reason: not valid java name */
    public final float m1966getTrackHeightD9Ej5fM() {
        return TrackHeight;
    }

    /* JADX INFO: renamed from: getTrackOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m1967getTrackOutlineWidthD9Ej5fM() {
        return TrackOutlineWidth;
    }

    @NotNull
    public final ShapeKeyTokens getTrackShape() {
        return TrackShape;
    }

    /* JADX INFO: renamed from: getTrackWidth-D9Ej5fM, reason: not valid java name */
    public final float m1968getTrackWidthD9Ej5fM() {
        return TrackWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedFocusHandleColor() {
        return UnselectedFocusHandleColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedFocusIconColor() {
        return UnselectedFocusIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedFocusTrackColor() {
        return UnselectedFocusTrackColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedFocusTrackOutlineColor() {
        return UnselectedFocusTrackOutlineColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedHandleColor() {
        return UnselectedHandleColor;
    }

    /* JADX INFO: renamed from: getUnselectedHandleHeight-D9Ej5fM, reason: not valid java name */
    public final float m1969getUnselectedHandleHeightD9Ej5fM() {
        return UnselectedHandleHeight;
    }

    /* JADX INFO: renamed from: getUnselectedHandleWidth-D9Ej5fM, reason: not valid java name */
    public final float m1970getUnselectedHandleWidthD9Ej5fM() {
        return UnselectedHandleWidth;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedHoverHandleColor() {
        return UnselectedHoverHandleColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedHoverIconColor() {
        return UnselectedHoverIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedHoverTrackColor() {
        return UnselectedHoverTrackColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedHoverTrackOutlineColor() {
        return UnselectedHoverTrackOutlineColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedIconColor() {
        return UnselectedIconColor;
    }

    /* JADX INFO: renamed from: getUnselectedIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1971getUnselectedIconSizeD9Ej5fM() {
        return UnselectedIconSize;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedPressedHandleColor() {
        return UnselectedPressedHandleColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedPressedIconColor() {
        return UnselectedPressedIconColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedPressedTrackColor() {
        return UnselectedPressedTrackColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedPressedTrackOutlineColor() {
        return UnselectedPressedTrackOutlineColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedTrackColor() {
        return UnselectedTrackColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedTrackOutlineColor() {
        return UnselectedTrackOutlineColor;
    }
}
