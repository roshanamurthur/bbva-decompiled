package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ColorScheme.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000e\n\u0002\b_\b\u0007\u0018\u00002\u00020\u0001Bô\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002ø\u0001\u0001¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001Jµ\u0002\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\b\u0010$\u001a\u00020#H\u0016R4\u0010\u0003\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R4\u0010\u0004\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R4\u0010\u0005\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b/\u0010'\u001a\u0004\b0\u0010)\"\u0004\b1\u0010+R4\u0010\u0006\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b2\u0010'\u001a\u0004\b3\u0010)\"\u0004\b4\u0010+R4\u0010\u0007\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b5\u0010'\u001a\u0004\b6\u0010)\"\u0004\b7\u0010+R4\u0010\b\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b8\u0010'\u001a\u0004\b9\u0010)\"\u0004\b:\u0010+R4\u0010\t\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b;\u0010'\u001a\u0004\b<\u0010)\"\u0004\b=\u0010+R4\u0010\n\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b>\u0010'\u001a\u0004\b?\u0010)\"\u0004\b@\u0010+R4\u0010\u000b\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bA\u0010'\u001a\u0004\bB\u0010)\"\u0004\bC\u0010+R4\u0010\f\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bD\u0010'\u001a\u0004\bE\u0010)\"\u0004\bF\u0010+R4\u0010\r\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bG\u0010'\u001a\u0004\bH\u0010)\"\u0004\bI\u0010+R4\u0010\u000e\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bJ\u0010'\u001a\u0004\bK\u0010)\"\u0004\bL\u0010+R4\u0010\u000f\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bM\u0010'\u001a\u0004\bN\u0010)\"\u0004\bO\u0010+R4\u0010\u0010\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bP\u0010'\u001a\u0004\bQ\u0010)\"\u0004\bR\u0010+R4\u0010\u0011\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bS\u0010'\u001a\u0004\bT\u0010)\"\u0004\bU\u0010+R4\u0010\u0012\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bV\u0010'\u001a\u0004\bW\u0010)\"\u0004\bX\u0010+R4\u0010\u0013\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bY\u0010'\u001a\u0004\bZ\u0010)\"\u0004\b[\u0010+R4\u0010\u0014\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\\\u0010'\u001a\u0004\b]\u0010)\"\u0004\b^\u0010+R4\u0010\u0015\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b_\u0010'\u001a\u0004\b`\u0010)\"\u0004\ba\u0010+R4\u0010\u0016\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bb\u0010'\u001a\u0004\bc\u0010)\"\u0004\bd\u0010+R4\u0010\u0017\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\be\u0010'\u001a\u0004\bf\u0010)\"\u0004\bg\u0010+R4\u0010\u0018\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bh\u0010'\u001a\u0004\bi\u0010)\"\u0004\bj\u0010+R4\u0010\u0019\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bk\u0010'\u001a\u0004\bl\u0010)\"\u0004\bm\u0010+R4\u0010\u001a\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bn\u0010'\u001a\u0004\bo\u0010)\"\u0004\bp\u0010+R4\u0010\u001b\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bq\u0010'\u001a\u0004\br\u0010)\"\u0004\bs\u0010+R4\u0010\u001c\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bt\u0010'\u001a\u0004\bu\u0010)\"\u0004\bv\u0010+R4\u0010\u001d\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bw\u0010'\u001a\u0004\bx\u0010)\"\u0004\by\u0010+R4\u0010\u001e\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\bz\u0010'\u001a\u0004\b{\u0010)\"\u0004\b|\u0010+R4\u0010\u001f\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@@X\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b}\u0010'\u001a\u0004\b~\u0010)\"\u0004\b\u007f\u0010+\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0082\u0001"}, d2 = {"Landroidx/compose/material3/ColorScheme;", "", "Landroidx/compose/ui/graphics/Color;", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "copy-G1PFc-w", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "copy", "", "toString", "<set-?>", "a", "Landroidx/compose/runtime/MutableState;", "getPrimary-0d7_KjU", "()J", "setPrimary-8_81llA$material3_release", "(J)V", "b", "getOnPrimary-0d7_KjU", "setOnPrimary-8_81llA$material3_release", "c", "getPrimaryContainer-0d7_KjU", "setPrimaryContainer-8_81llA$material3_release", "d", "getOnPrimaryContainer-0d7_KjU", "setOnPrimaryContainer-8_81llA$material3_release", "e", "getInversePrimary-0d7_KjU", "setInversePrimary-8_81llA$material3_release", "f", "getSecondary-0d7_KjU", "setSecondary-8_81llA$material3_release", "g", "getOnSecondary-0d7_KjU", "setOnSecondary-8_81llA$material3_release", "h", "getSecondaryContainer-0d7_KjU", "setSecondaryContainer-8_81llA$material3_release", "i", "getOnSecondaryContainer-0d7_KjU", "setOnSecondaryContainer-8_81llA$material3_release", "j", "getTertiary-0d7_KjU", "setTertiary-8_81llA$material3_release", "k", "getOnTertiary-0d7_KjU", "setOnTertiary-8_81llA$material3_release", "l", "getTertiaryContainer-0d7_KjU", "setTertiaryContainer-8_81llA$material3_release", "m", "getOnTertiaryContainer-0d7_KjU", "setOnTertiaryContainer-8_81llA$material3_release", "n", "getBackground-0d7_KjU", "setBackground-8_81llA$material3_release", "o", "getOnBackground-0d7_KjU", "setOnBackground-8_81llA$material3_release", "p", "getSurface-0d7_KjU", "setSurface-8_81llA$material3_release", "q", "getOnSurface-0d7_KjU", "setOnSurface-8_81llA$material3_release", "r", "getSurfaceVariant-0d7_KjU", "setSurfaceVariant-8_81llA$material3_release", "s", "getOnSurfaceVariant-0d7_KjU", "setOnSurfaceVariant-8_81llA$material3_release", "t", "getSurfaceTint-0d7_KjU", "setSurfaceTint-8_81llA$material3_release", "u", "getInverseSurface-0d7_KjU", "setInverseSurface-8_81llA$material3_release", SharedPrefsStorage.VERSION_KEY, "getInverseOnSurface-0d7_KjU", "setInverseOnSurface-8_81llA$material3_release", "w", "getError-0d7_KjU", "setError-8_81llA$material3_release", "x", "getOnError-0d7_KjU", "setOnError-8_81llA$material3_release", "y", "getErrorContainer-0d7_KjU", "setErrorContainer-8_81llA$material3_release", "z", "getOnErrorContainer-0d7_KjU", "setOnErrorContainer-8_81llA$material3_release", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getOutline-0d7_KjU", "setOutline-8_81llA$material3_release", "B", "getOutlineVariant-0d7_KjU", "setOutlineVariant-8_81llA$material3_release", "C", "getScrim-0d7_KjU", "setScrim-8_81llA$material3_release", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nColorScheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorScheme.kt\nandroidx/compose/material3/ColorScheme\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,615:1\n76#2:616\n102#2,2:617\n76#2:619\n102#2,2:620\n76#2:622\n102#2,2:623\n76#2:625\n102#2,2:626\n76#2:628\n102#2,2:629\n76#2:631\n102#2,2:632\n76#2:634\n102#2,2:635\n76#2:637\n102#2,2:638\n76#2:640\n102#2,2:641\n76#2:643\n102#2,2:644\n76#2:646\n102#2,2:647\n76#2:649\n102#2,2:650\n76#2:652\n102#2,2:653\n76#2:655\n102#2,2:656\n76#2:658\n102#2,2:659\n76#2:661\n102#2,2:662\n76#2:664\n102#2,2:665\n76#2:667\n102#2,2:668\n76#2:670\n102#2,2:671\n76#2:673\n102#2,2:674\n76#2:676\n102#2,2:677\n76#2:679\n102#2,2:680\n76#2:682\n102#2,2:683\n76#2:685\n102#2,2:686\n76#2:688\n102#2,2:689\n76#2:691\n102#2,2:692\n76#2:694\n102#2,2:695\n76#2:697\n102#2,2:698\n76#2:700\n102#2,2:701\n*S KotlinDebug\n*F\n+ 1 ColorScheme.kt\nandroidx/compose/material3/ColorScheme\n*L\n131#1:616\n131#1:617,2\n133#1:619\n133#1:620,2\n135#1:622\n135#1:623,2\n137#1:625\n137#1:626,2\n139#1:628\n139#1:629,2\n141#1:631\n141#1:632,2\n143#1:634\n143#1:635,2\n145#1:637\n145#1:638,2\n147#1:640\n147#1:641,2\n149#1:643\n149#1:644,2\n151#1:646\n151#1:647,2\n153#1:649\n153#1:650,2\n155#1:652\n155#1:653,2\n157#1:655\n157#1:656,2\n159#1:658\n159#1:659,2\n161#1:661\n161#1:662,2\n163#1:664\n163#1:665,2\n165#1:667\n165#1:668,2\n167#1:670\n167#1:671,2\n169#1:673\n169#1:674,2\n171#1:676\n171#1:677,2\n173#1:679\n173#1:680,2\n175#1:682\n175#1:683,2\n177#1:685\n177#1:686,2\n179#1:688\n179#1:689,2\n181#1:691\n181#1:692,2\n183#1:694\n183#1:695,2\n185#1:697\n185#1:698,2\n187#1:700\n187#1:701,2\n*E\n"})
public final class ColorScheme {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final MutableState outline;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final MutableState outlineVariant;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public final MutableState scrim;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState primary;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState onPrimary;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState primaryContainer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState onPrimaryContainer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState inversePrimary;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState secondary;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState onSecondary;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState secondaryContainer;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState onSecondaryContainer;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState tertiary;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState onTertiary;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState tertiaryContainer;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final MutableState onTertiaryContainer;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState background;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState onBackground;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState surface;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState onSurface;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState surfaceVariant;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState onSurfaceVariant;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState surfaceTint;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState inverseSurface;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState inverseOnSurface;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState error;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState onError;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState errorContainer;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState onErrorContainer;

    public ColorScheme(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, DefaultConstructorMarker defaultConstructorMarker) {
        this.primary = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j10), SnapshotStateKt.structuralEqualityPolicy());
        this.onPrimary = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j11), SnapshotStateKt.structuralEqualityPolicy());
        this.primaryContainer = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j12), SnapshotStateKt.structuralEqualityPolicy());
        this.onPrimaryContainer = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j13), SnapshotStateKt.structuralEqualityPolicy());
        this.inversePrimary = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j14), SnapshotStateKt.structuralEqualityPolicy());
        this.secondary = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j15), SnapshotStateKt.structuralEqualityPolicy());
        this.onSecondary = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j16), SnapshotStateKt.structuralEqualityPolicy());
        this.secondaryContainer = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j17), SnapshotStateKt.structuralEqualityPolicy());
        this.onSecondaryContainer = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j18), SnapshotStateKt.structuralEqualityPolicy());
        this.tertiary = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j19), SnapshotStateKt.structuralEqualityPolicy());
        this.onTertiary = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j20), SnapshotStateKt.structuralEqualityPolicy());
        this.tertiaryContainer = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j21), SnapshotStateKt.structuralEqualityPolicy());
        this.onTertiaryContainer = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j22), SnapshotStateKt.structuralEqualityPolicy());
        this.background = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j23), SnapshotStateKt.structuralEqualityPolicy());
        this.onBackground = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j24), SnapshotStateKt.structuralEqualityPolicy());
        this.surface = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j25), SnapshotStateKt.structuralEqualityPolicy());
        this.onSurface = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j26), SnapshotStateKt.structuralEqualityPolicy());
        this.surfaceVariant = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j27), SnapshotStateKt.structuralEqualityPolicy());
        this.onSurfaceVariant = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j28), SnapshotStateKt.structuralEqualityPolicy());
        this.surfaceTint = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j29), SnapshotStateKt.structuralEqualityPolicy());
        this.inverseSurface = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j30), SnapshotStateKt.structuralEqualityPolicy());
        this.inverseOnSurface = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j31), SnapshotStateKt.structuralEqualityPolicy());
        this.error = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j32), SnapshotStateKt.structuralEqualityPolicy());
        this.onError = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j33), SnapshotStateKt.structuralEqualityPolicy());
        this.errorContainer = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j34), SnapshotStateKt.structuralEqualityPolicy());
        this.onErrorContainer = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j35), SnapshotStateKt.structuralEqualityPolicy());
        this.outline = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j36), SnapshotStateKt.structuralEqualityPolicy());
        this.outlineVariant = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j37), SnapshotStateKt.structuralEqualityPolicy());
        this.scrim = SnapshotStateKt.mutableStateOf(Color.m2498boximpl(j38), SnapshotStateKt.structuralEqualityPolicy());
    }

    @NotNull
    /* JADX INFO: renamed from: copy-G1PFc-w, reason: not valid java name */
    public final ColorScheme m953copyG1PFcw(long primary, long onPrimary, long primaryContainer, long onPrimaryContainer, long inversePrimary, long secondary, long onSecondary, long secondaryContainer, long onSecondaryContainer, long tertiary, long onTertiary, long tertiaryContainer, long onTertiaryContainer, long background, long onBackground, long surface, long onSurface, long surfaceVariant, long onSurfaceVariant, long surfaceTint, long inverseSurface, long inverseOnSurface, long error, long onError, long errorContainer, long onErrorContainer, long outline, long outlineVariant, long scrim) {
        return new ColorScheme(primary, onPrimary, primaryContainer, onPrimaryContainer, inversePrimary, secondary, onSecondary, secondaryContainer, onSecondaryContainer, tertiary, onTertiary, tertiaryContainer, onTertiaryContainer, background, onBackground, surface, onSurface, surfaceVariant, onSurfaceVariant, surfaceTint, inverseSurface, inverseOnSurface, error, onError, errorContainer, onErrorContainer, outline, outlineVariant, scrim, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m954getBackground0d7_KjU() {
        return ((Color) this.background.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getError-0d7_KjU, reason: not valid java name */
    public final long m955getError0d7_KjU() {
        return ((Color) this.error.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getErrorContainer-0d7_KjU, reason: not valid java name */
    public final long m956getErrorContainer0d7_KjU() {
        return ((Color) this.errorContainer.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getInverseOnSurface-0d7_KjU, reason: not valid java name */
    public final long m957getInverseOnSurface0d7_KjU() {
        return ((Color) this.inverseOnSurface.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getInversePrimary-0d7_KjU, reason: not valid java name */
    public final long m958getInversePrimary0d7_KjU() {
        return ((Color) this.inversePrimary.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getInverseSurface-0d7_KjU, reason: not valid java name */
    public final long m959getInverseSurface0d7_KjU() {
        return ((Color) this.inverseSurface.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOnBackground-0d7_KjU, reason: not valid java name */
    public final long m960getOnBackground0d7_KjU() {
        return ((Color) this.onBackground.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOnError-0d7_KjU, reason: not valid java name */
    public final long m961getOnError0d7_KjU() {
        return ((Color) this.onError.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOnErrorContainer-0d7_KjU, reason: not valid java name */
    public final long m962getOnErrorContainer0d7_KjU() {
        return ((Color) this.onErrorContainer.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOnPrimary-0d7_KjU, reason: not valid java name */
    public final long m963getOnPrimary0d7_KjU() {
        return ((Color) this.onPrimary.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOnPrimaryContainer-0d7_KjU, reason: not valid java name */
    public final long m964getOnPrimaryContainer0d7_KjU() {
        return ((Color) this.onPrimaryContainer.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOnSecondary-0d7_KjU, reason: not valid java name */
    public final long m965getOnSecondary0d7_KjU() {
        return ((Color) this.onSecondary.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOnSecondaryContainer-0d7_KjU, reason: not valid java name */
    public final long m966getOnSecondaryContainer0d7_KjU() {
        return ((Color) this.onSecondaryContainer.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOnSurface-0d7_KjU, reason: not valid java name */
    public final long m967getOnSurface0d7_KjU() {
        return ((Color) this.onSurface.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOnSurfaceVariant-0d7_KjU, reason: not valid java name */
    public final long m968getOnSurfaceVariant0d7_KjU() {
        return ((Color) this.onSurfaceVariant.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOnTertiary-0d7_KjU, reason: not valid java name */
    public final long m969getOnTertiary0d7_KjU() {
        return ((Color) this.onTertiary.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOnTertiaryContainer-0d7_KjU, reason: not valid java name */
    public final long m970getOnTertiaryContainer0d7_KjU() {
        return ((Color) this.onTertiaryContainer.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOutline-0d7_KjU, reason: not valid java name */
    public final long m971getOutline0d7_KjU() {
        return ((Color) this.outline.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getOutlineVariant-0d7_KjU, reason: not valid java name */
    public final long m972getOutlineVariant0d7_KjU() {
        return ((Color) this.outlineVariant.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getPrimary-0d7_KjU, reason: not valid java name */
    public final long m973getPrimary0d7_KjU() {
        return ((Color) this.primary.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getPrimaryContainer-0d7_KjU, reason: not valid java name */
    public final long m974getPrimaryContainer0d7_KjU() {
        return ((Color) this.primaryContainer.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getScrim-0d7_KjU, reason: not valid java name */
    public final long m975getScrim0d7_KjU() {
        return ((Color) this.scrim.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getSecondary-0d7_KjU, reason: not valid java name */
    public final long m976getSecondary0d7_KjU() {
        return ((Color) this.secondary.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getSecondaryContainer-0d7_KjU, reason: not valid java name */
    public final long m977getSecondaryContainer0d7_KjU() {
        return ((Color) this.secondaryContainer.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getSurface-0d7_KjU, reason: not valid java name */
    public final long m978getSurface0d7_KjU() {
        return ((Color) this.surface.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getSurfaceTint-0d7_KjU, reason: not valid java name */
    public final long m979getSurfaceTint0d7_KjU() {
        return ((Color) this.surfaceTint.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getSurfaceVariant-0d7_KjU, reason: not valid java name */
    public final long m980getSurfaceVariant0d7_KjU() {
        return ((Color) this.surfaceVariant.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getTertiary-0d7_KjU, reason: not valid java name */
    public final long m981getTertiary0d7_KjU() {
        return ((Color) this.tertiary.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getTertiaryContainer-0d7_KjU, reason: not valid java name */
    public final long m982getTertiaryContainer0d7_KjU() {
        return ((Color) this.tertiaryContainer.getValue()).m2518unboximpl();
    }

    /* JADX INFO: renamed from: setBackground-8_81llA$material3_release, reason: not valid java name */
    public final void m983setBackground8_81llA$material3_release(long j10) {
        this.background.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setError-8_81llA$material3_release, reason: not valid java name */
    public final void m984setError8_81llA$material3_release(long j10) {
        this.error.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setErrorContainer-8_81llA$material3_release, reason: not valid java name */
    public final void m985setErrorContainer8_81llA$material3_release(long j10) {
        this.errorContainer.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setInverseOnSurface-8_81llA$material3_release, reason: not valid java name */
    public final void m986setInverseOnSurface8_81llA$material3_release(long j10) {
        this.inverseOnSurface.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setInversePrimary-8_81llA$material3_release, reason: not valid java name */
    public final void m987setInversePrimary8_81llA$material3_release(long j10) {
        this.inversePrimary.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setInverseSurface-8_81llA$material3_release, reason: not valid java name */
    public final void m988setInverseSurface8_81llA$material3_release(long j10) {
        this.inverseSurface.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setOnBackground-8_81llA$material3_release, reason: not valid java name */
    public final void m989setOnBackground8_81llA$material3_release(long j10) {
        this.onBackground.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setOnError-8_81llA$material3_release, reason: not valid java name */
    public final void m990setOnError8_81llA$material3_release(long j10) {
        this.onError.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setOnErrorContainer-8_81llA$material3_release, reason: not valid java name */
    public final void m991setOnErrorContainer8_81llA$material3_release(long j10) {
        this.onErrorContainer.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setOnPrimary-8_81llA$material3_release, reason: not valid java name */
    public final void m992setOnPrimary8_81llA$material3_release(long j10) {
        this.onPrimary.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setOnPrimaryContainer-8_81llA$material3_release, reason: not valid java name */
    public final void m993setOnPrimaryContainer8_81llA$material3_release(long j10) {
        this.onPrimaryContainer.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setOnSecondary-8_81llA$material3_release, reason: not valid java name */
    public final void m994setOnSecondary8_81llA$material3_release(long j10) {
        this.onSecondary.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setOnSecondaryContainer-8_81llA$material3_release, reason: not valid java name */
    public final void m995setOnSecondaryContainer8_81llA$material3_release(long j10) {
        this.onSecondaryContainer.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setOnSurface-8_81llA$material3_release, reason: not valid java name */
    public final void m996setOnSurface8_81llA$material3_release(long j10) {
        this.onSurface.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setOnSurfaceVariant-8_81llA$material3_release, reason: not valid java name */
    public final void m997setOnSurfaceVariant8_81llA$material3_release(long j10) {
        this.onSurfaceVariant.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setOnTertiary-8_81llA$material3_release, reason: not valid java name */
    public final void m998setOnTertiary8_81llA$material3_release(long j10) {
        this.onTertiary.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setOnTertiaryContainer-8_81llA$material3_release, reason: not valid java name */
    public final void m999setOnTertiaryContainer8_81llA$material3_release(long j10) {
        this.onTertiaryContainer.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setOutline-8_81llA$material3_release, reason: not valid java name */
    public final void m1000setOutline8_81llA$material3_release(long j10) {
        this.outline.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setOutlineVariant-8_81llA$material3_release, reason: not valid java name */
    public final void m1001setOutlineVariant8_81llA$material3_release(long j10) {
        this.outlineVariant.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setPrimary-8_81llA$material3_release, reason: not valid java name */
    public final void m1002setPrimary8_81llA$material3_release(long j10) {
        this.primary.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setPrimaryContainer-8_81llA$material3_release, reason: not valid java name */
    public final void m1003setPrimaryContainer8_81llA$material3_release(long j10) {
        this.primaryContainer.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setScrim-8_81llA$material3_release, reason: not valid java name */
    public final void m1004setScrim8_81llA$material3_release(long j10) {
        this.scrim.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setSecondary-8_81llA$material3_release, reason: not valid java name */
    public final void m1005setSecondary8_81llA$material3_release(long j10) {
        this.secondary.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setSecondaryContainer-8_81llA$material3_release, reason: not valid java name */
    public final void m1006setSecondaryContainer8_81llA$material3_release(long j10) {
        this.secondaryContainer.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setSurface-8_81llA$material3_release, reason: not valid java name */
    public final void m1007setSurface8_81llA$material3_release(long j10) {
        this.surface.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setSurfaceTint-8_81llA$material3_release, reason: not valid java name */
    public final void m1008setSurfaceTint8_81llA$material3_release(long j10) {
        this.surfaceTint.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setSurfaceVariant-8_81llA$material3_release, reason: not valid java name */
    public final void m1009setSurfaceVariant8_81llA$material3_release(long j10) {
        this.surfaceVariant.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setTertiary-8_81llA$material3_release, reason: not valid java name */
    public final void m1010setTertiary8_81llA$material3_release(long j10) {
        this.tertiary.setValue(Color.m2498boximpl(j10));
    }

    /* JADX INFO: renamed from: setTertiaryContainer-8_81llA$material3_release, reason: not valid java name */
    public final void m1011setTertiaryContainer8_81llA$material3_release(long j10) {
        this.tertiaryContainer.setValue(Color.m2498boximpl(j10));
    }

    @NotNull
    public String toString() {
        return "ColorScheme(primary=" + ((Object) Color.m2516toStringimpl(m973getPrimary0d7_KjU())) + "onPrimary=" + ((Object) Color.m2516toStringimpl(m963getOnPrimary0d7_KjU())) + "primaryContainer=" + ((Object) Color.m2516toStringimpl(m974getPrimaryContainer0d7_KjU())) + "onPrimaryContainer=" + ((Object) Color.m2516toStringimpl(m964getOnPrimaryContainer0d7_KjU())) + "inversePrimary=" + ((Object) Color.m2516toStringimpl(m958getInversePrimary0d7_KjU())) + "secondary=" + ((Object) Color.m2516toStringimpl(m976getSecondary0d7_KjU())) + "onSecondary=" + ((Object) Color.m2516toStringimpl(m965getOnSecondary0d7_KjU())) + "secondaryContainer=" + ((Object) Color.m2516toStringimpl(m977getSecondaryContainer0d7_KjU())) + "onSecondaryContainer=" + ((Object) Color.m2516toStringimpl(m966getOnSecondaryContainer0d7_KjU())) + "tertiary=" + ((Object) Color.m2516toStringimpl(m981getTertiary0d7_KjU())) + "onTertiary=" + ((Object) Color.m2516toStringimpl(m969getOnTertiary0d7_KjU())) + "tertiaryContainer=" + ((Object) Color.m2516toStringimpl(m982getTertiaryContainer0d7_KjU())) + "onTertiaryContainer=" + ((Object) Color.m2516toStringimpl(m970getOnTertiaryContainer0d7_KjU())) + "background=" + ((Object) Color.m2516toStringimpl(m954getBackground0d7_KjU())) + "onBackground=" + ((Object) Color.m2516toStringimpl(m960getOnBackground0d7_KjU())) + "surface=" + ((Object) Color.m2516toStringimpl(m978getSurface0d7_KjU())) + "onSurface=" + ((Object) Color.m2516toStringimpl(m967getOnSurface0d7_KjU())) + "surfaceVariant=" + ((Object) Color.m2516toStringimpl(m980getSurfaceVariant0d7_KjU())) + "onSurfaceVariant=" + ((Object) Color.m2516toStringimpl(m968getOnSurfaceVariant0d7_KjU())) + "surfaceTint=" + ((Object) Color.m2516toStringimpl(m979getSurfaceTint0d7_KjU())) + "inverseSurface=" + ((Object) Color.m2516toStringimpl(m959getInverseSurface0d7_KjU())) + "inverseOnSurface=" + ((Object) Color.m2516toStringimpl(m957getInverseOnSurface0d7_KjU())) + "error=" + ((Object) Color.m2516toStringimpl(m955getError0d7_KjU())) + "onError=" + ((Object) Color.m2516toStringimpl(m961getOnError0d7_KjU())) + "errorContainer=" + ((Object) Color.m2516toStringimpl(m956getErrorContainer0d7_KjU())) + "onErrorContainer=" + ((Object) Color.m2516toStringimpl(m962getOnErrorContainer0d7_KjU())) + "outline=" + ((Object) Color.m2516toStringimpl(m971getOutline0d7_KjU())) + "outlineVariant=" + ((Object) Color.m2516toStringimpl(m972getOutlineVariant0d7_KjU())) + "scrim=" + ((Object) Color.m2516toStringimpl(m975getScrim0d7_KjU())) + RootService.CLOSE_BRACKET;
    }
}
