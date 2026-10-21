package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowDropDownKt;
import androidx.compose.material.icons.filled.KeyboardArrowLeftKt;
import androidx.compose.material.icons.filled.KeyboardArrowRightKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.bbva.datepicker.plugin.DatePickerPlugin;
import com.noknok.android.client.utils.UIConfigTags;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0083\u0001\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aA\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0087\u0001\u0010%\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0013\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f2\u0013\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\fH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u001a9\u0010*\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00182\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b0\u0006H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)\u001a]\u00101\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0013\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020 2\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\fH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100\u001a#\u00106\u001a\u00020\u000b2\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0080@ø\u0001\u0001¢\u0006\u0004\b6\u00107\u001a\u001f\u0010:\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b:\u0010;\u001av\u0010E\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020<2!\u0010A\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(@\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010C\u001a\u00020B2\u0006\u00105\u001a\u0002042\u0006\u0010D\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\bE\u0010F\u001a\f\u0010I\u001a\u00020H*\u00020GH\u0000\"\u001d\u0010N\u001a\u00020 8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u001d\u0010Q\u001a\u00020 8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bO\u0010K\u001a\u0004\bP\u0010M\"\u001d\u0010T\u001a\u00020 8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bR\u0010K\u001a\u0004\bS\u0010M\"\u001a\u0010Z\u001a\u00020U8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006["}, d2 = {"Landroidx/compose/material3/DatePickerState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Lkotlin/Function1;", "", "", "dateValidator", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "title", "headline", "showModeToggle", "Landroidx/compose/material3/DatePickerColors;", "colors", DatePickerPlugin.ID, "(Landroidx/compose/material3/DatePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "initialSelectedDateMillis", "initialDisplayedMonthMillis", "Lkotlin/ranges/IntRange;", "yearRange", "Landroidx/compose/material3/DisplayMode;", "initialDisplayMode", "rememberDatePickerState-NVmSL94", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DatePickerState;", "rememberDatePickerState", "modeToggleButton", "Landroidx/compose/ui/text/TextStyle;", "headlineTextStyle", "Landroidx/compose/ui/unit/Dp;", "headerMinHeight", "content", "DateEntryContainer-au3_HiA", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "DateEntryContainer", "displayMode", "onDisplayModeChange", "DisplayModeToggleButton-tER2X8s", "(Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "DisplayModeToggleButton", "Landroidx/compose/ui/graphics/Color;", "titleContentColor", "headlineContentColor", "minHeight", "DatePickerHeader-pc5RIQQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JJFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "DatePickerHeader", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "Landroidx/compose/material3/StateData;", "stateData", "updateDisplayedMonth", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/material3/StateData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/material3/CalendarModel;", "calendarModel", "WeekDays", "(Landroidx/compose/material3/DatePickerColors;Landroidx/compose/material3/CalendarModel;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/material3/CalendarMonth;", UIConfigTags.TAG_MONTH, "Lkotlin/ParameterName;", "name", "dateInMillis", "onDateSelected", "Landroidx/compose/material3/CalendarDate;", "today", "rangeSelectionEnabled", "Month", "(Landroidx/compose/material3/CalendarMonth;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/CalendarDate;Landroidx/compose/material3/StateData;ZLkotlin/jvm/functions/Function1;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "", "", "toLocalString", "a", "F", "getRecommendedSizeForAccessibility", "()F", "RecommendedSizeForAccessibility", "b", "getMonthYearHeight", "MonthYearHeight", "c", "getDatePickerHorizontalPadding", "DatePickerHorizontalPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "d", "Landroidx/compose/foundation/layout/PaddingValues;", "getDatePickerModeTogglePadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "DatePickerModeTogglePadding", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 8 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 12 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1920:1\n25#2:1921\n460#2,13:1947\n473#2,3:1961\n36#2:1966\n36#2:1973\n25#2:1984\n36#2:1995\n460#2,13:2022\n36#2:2036\n460#2,13:2063\n460#2,13:2096\n473#2,3:2110\n473#2,3:2115\n473#2,3:2120\n460#2,13:2143\n473#2,3:2157\n36#2:2162\n83#2,3:2169\n50#2:2178\n49#2:2179\n36#2:2186\n50#2:2193\n49#2:2194\n36#2:2201\n50#2:2208\n49#2:2209\n36#2:2216\n460#2,13:2238\n460#2,13:2272\n473#2,3:2287\n473#2,3:2292\n1114#3,6:1922\n1114#3,6:1967\n1114#3,6:1974\n1114#3,3:1985\n1117#3,3:1991\n1114#3,6:1996\n1114#3,6:2037\n1114#3,6:2163\n1114#3,6:2172\n1114#3,6:2180\n1114#3,6:2187\n1114#3,6:2195\n1114#3,6:2202\n1114#3,6:2210\n1114#3,6:2217\n74#4,6:1928\n80#4:1960\n84#4:1965\n73#4,7:2002\n80#4:2035\n74#4,6:2077\n80#4:2109\n84#4:2114\n84#4:2124\n75#4,5:2125\n80#4:2156\n84#4:2161\n75#5:1934\n76#5,11:1936\n89#5:1964\n75#5:2009\n76#5,11:2011\n75#5:2050\n76#5,11:2052\n75#5:2083\n76#5,11:2085\n89#5:2113\n89#5:2118\n89#5:2123\n75#5:2130\n76#5,11:2132\n89#5:2160\n75#5:2225\n76#5,11:2227\n75#5:2259\n76#5,11:2261\n89#5:2290\n89#5:2295\n76#6:1935\n76#6:2010\n76#6:2051\n76#6:2084\n76#6:2131\n76#6:2226\n76#6:2260\n76#6:2286\n474#7,4:1980\n478#7,2:1988\n482#7:1994\n474#8:1990\n66#9,7:2043\n73#9:2076\n77#9:2119\n79#10,2:2223\n81#10:2251\n74#10,7:2252\n81#10:2285\n85#10:2291\n85#10:2296\n76#11:2297\n102#11,2:2298\n154#12:2300\n154#12:2301\n154#12:2302\n154#12:2303\n154#12:2304\n154#12:2305\n154#12:2306\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt\n*L\n153#1:1921\n1022#1:1947,13\n1022#1:1961,3\n1072#1:1966\n1079#1:1973\n1133#1:1984\n1135#1:1995\n1142#1:2022,13\n1167#1:2036\n1170#1:2063,13\n1171#1:2096,13\n1171#1:2110,3\n1170#1:2115,3\n1142#1:2120,3\n1244#1:2143,13\n1244#1:2157,3\n1283#1:2162\n1300#1:2169,3\n1324#1:2178\n1324#1:2179\n1415#1:2186\n1430#1:2193\n1430#1:2194\n1595#1:2201\n1726#1:2208\n1726#1:2209\n1743#1:2216\n1776#1:2238,13\n1802#1:2272,13\n1802#1:2287,3\n1776#1:2292,3\n153#1:1922,6\n1072#1:1967,6\n1079#1:1974,6\n1133#1:1985,3\n1133#1:1991,3\n1135#1:1996,6\n1167#1:2037,6\n1283#1:2163,6\n1300#1:2172,6\n1324#1:2180,6\n1415#1:2187,6\n1430#1:2195,6\n1595#1:2202,6\n1726#1:2210,6\n1743#1:2217,6\n1022#1:1928,6\n1022#1:1960\n1022#1:1965\n1142#1:2002,7\n1142#1:2035\n1171#1:2077,6\n1171#1:2109\n1171#1:2114\n1142#1:2124\n1244#1:2125,5\n1244#1:2156\n1244#1:2161\n1022#1:1934\n1022#1:1936,11\n1022#1:1964\n1142#1:2009\n1142#1:2011,11\n1170#1:2050\n1170#1:2052,11\n1171#1:2083\n1171#1:2085,11\n1171#1:2113\n1170#1:2118\n1142#1:2123\n1244#1:2130\n1244#1:2132,11\n1244#1:2160\n1776#1:2225\n1776#1:2227,11\n1802#1:2259\n1802#1:2261,11\n1802#1:2290\n1776#1:2295\n1022#1:1935\n1142#1:2010\n1170#1:2051\n1171#1:2084\n1244#1:2131\n1776#1:2226\n1802#1:2260\n1803#1:2286\n1133#1:1980,4\n1133#1:1988,2\n1133#1:1994\n1133#1:1990\n1170#1:2043,7\n1170#1:2076\n1170#1:2119\n1776#1:2223,2\n1776#1:2251\n1802#1:2252,7\n1802#1:2285\n1802#1:2291\n1776#1:2296\n1140#1:2297\n1140#1:2298,2\n1908#1:2300\n1909#1:2301\n1910#1:2302\n1911#1:2303\n1913#1:2304\n1914#1:2305\n1916#1:2306\n*E\n"})
public final class DatePickerKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f9955a = Dp.m4389constructorimpl(48);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f9956b = Dp.m4389constructorimpl(56);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f9957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final PaddingValues f9958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final PaddingValues f9959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final PaddingValues f9960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f9961g;

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class a extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f9962p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.setContainer(semantics, true);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class a0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ArrayList<Pair<String, String>> f9963p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(ArrayList<Pair<String, String>> arrayList) {
            super(2);
            this.f9963p0 = arrayList;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1445541615, iIntValue, -1, "androidx.compose.material3.WeekDays.<anonymous> (DatePicker.kt:1365)");
                }
                TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), DatePickerModalTokens.INSTANCE.getWeekdaysLabelTextFont()), ComposableLambdaKt.composableLambda(composer2, 2133710592, true, new o0(this.f9963p0)), composer2, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    @SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DateEntryContainer$2$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,1920:1\n74#2,6:1921\n80#2:1953\n84#2:1992\n75#3:1927\n76#3,11:1929\n75#3:1956\n76#3,11:1958\n89#3:1986\n89#3:1991\n76#4:1928\n76#4:1957\n460#5,13:1940\n460#5,13:1969\n473#5,3:1983\n473#5,3:1988\n79#6,2:1954\n81#6:1982\n85#6:1987\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DateEntryContainer$2$1\n*L\n1034#1:1921,6\n1034#1:1953\n1034#1:1992\n1034#1:1927\n1034#1:1929,11\n1040#1:1956\n1040#1:1958,11\n1040#1:1986\n1034#1:1991\n1034#1:1928\n1040#1:1957\n1034#1:1940,13\n1040#1:1969,13\n1040#1:1983,3\n1034#1:1988,3\n1040#1:1954,2\n1040#1:1982\n1040#1:1987\n*E\n"})
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9964p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9965q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9966r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ TextStyle f9967s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f9968t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, TextStyle textStyle, int i10) {
            super(2);
            this.f9964p0 = function2;
            this.f9965q0 = function3;
            this.f9966r0 = function4;
            this.f9967s0 = textStyle;
            this.f9968t0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Arrangement.Horizontal start;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-229007058, iIntValue, -1, "androidx.compose.material3.DateEntryContainer.<anonymous>.<anonymous> (DatePicker.kt:1032)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                composer2.startReplaceableGroup(-483455358);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyA = androidx.camera.core.impl.v.a(companion2, top, composer2, 0, -1323940314);
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierFillMaxWidth$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl, measurePolicyA, composerM2074constructorimpl, density));
                ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Function2<Composer, Integer, Unit> function2 = this.f9964p0;
                Function2<Composer, Integer, Unit> function3 = this.f9965q0;
                if (function2 == null || function3 == null) {
                    start = function2 != null ? arrangement.getStart() : arrangement.getEnd();
                } else {
                    start = arrangement.getSpaceBetween();
                }
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 48);
                Density density2 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierFillMaxWidth$default2);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composer2);
                Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl2, measurePolicyRowMeasurePolicy, composerM2074constructorimpl2, density2));
                ai.a.j(0, function3MaterializerOf2, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl2, viewConfiguration2, composer2, composer2), composer2, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(-1011378861);
                int i10 = this.f9968t0;
                if (function2 != null) {
                    TextKt.ProvideTextStyle(this.f9967s0, ComposableLambdaKt.composableLambda(composer2, -962031352, true, new androidx.compose.material3.a0(rowScopeInstance, function2, i10)), composer2, ((i10 >> 15) & 14) | 48);
                }
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(1449812209);
                if (function3 != null) {
                    function3.invoke(composer2, Integer.valueOf((i10 >> 9) & 14));
                }
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(1680507480);
                if (this.f9966r0 != null || function2 != null || function3 != null) {
                    DividerKt.m1083Divider9IZ8Weo(null, 0.0f, 0L, composer2, 0, 7);
                }
                if (androidx.databinding.e.e(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class b0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DatePickerColors f9969p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CalendarModel f9970q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f9971r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(DatePickerColors datePickerColors, CalendarModel calendarModel, int i10) {
            super(2);
            this.f9969p0 = datePickerColors;
            this.f9970q0 = calendarModel;
            this.f9971r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f9971r0 | 1);
            DatePickerKt.WeekDays(this.f9969p0, this.f9970q0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f9972p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9973q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9974r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9975s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ DatePickerColors f9976t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ TextStyle f9977u0;
        public final /* synthetic */ float v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9978w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f9979x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, DatePickerColors datePickerColors, TextStyle textStyle, float f6, Function2<? super Composer, ? super Integer, Unit> function5, int i10) {
            super(2);
            this.f9972p0 = modifier;
            this.f9973q0 = function2;
            this.f9974r0 = function3;
            this.f9975s0 = function4;
            this.f9976t0 = datePickerColors;
            this.f9977u0 = textStyle;
            this.v0 = f6;
            this.f9978w0 = function5;
            this.f9979x0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            DatePickerKt.m1063DateEntryContainerau3_HiA(this.f9972p0, this.f9973q0, this.f9974r0, this.f9975s0, this.f9976t0, this.f9977u0, this.v0, this.f9978w0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9979x0 | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class c0 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9980p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f9981q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f9982r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c0(Function2<? super Composer, ? super Integer, Unit> function2, int i10, boolean z10) {
            super(3);
            this.f9980p0 = function2;
            this.f9981q0 = i10;
            this.f9982r0 = z10;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            String strM1320getStringNWtq28;
            RowScope TextButton = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1899012021, iIntValue, -1, "androidx.compose.material3.YearPickerMenuButton.<anonymous> (DatePicker.kt:1844)");
                }
                this.f9980p0.invoke(composer2, Integer.valueOf((this.f9981q0 >> 9) & 14));
                Modifier.Companion companion = Modifier.INSTANCE;
                SpacerKt.Spacer(SizeKt.m335size3ABfNKs(companion, ButtonDefaults.INSTANCE.m935getIconSpacingD9Ej5fM()), composer2, 6);
                ImageVector arrowDropDown = ArrowDropDownKt.getArrowDropDown(Icons.Filled.INSTANCE);
                boolean z10 = this.f9982r0;
                if (z10) {
                    composer2.startReplaceableGroup(1071182504);
                    strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1279getDatePickerSwitchToDaySelectionadMyvUU(), composer2, 6);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(1071182591);
                    strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1283getDatePickerSwitchToYearSelectionadMyvUU(), composer2, 6);
                    composer2.endReplaceableGroup();
                }
                IconKt.m1140Iconww6aTOc(arrowDropDown, strM1320getStringNWtq28, RotateKt.rotate(companion, z10 ? 180.0f : 0.0f), 0L, composer2, 0, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class d extends Lambda implements Function1<Long, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f9983p0 = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Long l6) {
            l6.longValue();
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class d0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f9984p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f9985q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f9986r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9987s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f9988t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f9989u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d0(Function0<Unit> function0, boolean z10, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f9984p0 = function0;
            this.f9985q0 = z10;
            this.f9986r0 = modifier;
            this.f9987s0 = function2;
            this.f9988t0 = i10;
            this.f9989u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            DatePickerKt.c(this.f9984p0, this.f9985q0, this.f9986r0, this.f9987s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9988t0 | 1), this.f9989u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DatePickerState f9990p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f9991q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(DatePickerState datePickerState, int i10) {
            super(2);
            this.f9990p0 = datePickerState;
            this.f9991q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(448469326, iIntValue, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:154)");
                }
                DatePickerDefaults.INSTANCE.DatePickerTitle(this.f9990p0, PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.f9959e), composer2, (this.f9991q0 & 14) | 432, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class e0 extends Lambda implements Function0<DatePickerState> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Long f9992p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Long f9993q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ IntRange f9994r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f9995s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(Long l6, Long l7, IntRange intRange, int i10) {
            super(0);
            this.f9992p0 = l6;
            this.f9993q0 = l7;
            this.f9994r0 = intRange;
            this.f9995s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function0
        public final DatePickerState invoke() {
            return new DatePickerState(this.f9992p0, this.f9993q0, this.f9994r0, this.f9995s0, null);
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DatePickerState f9996p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ DatePickerFormatter f9997q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f9998r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(DatePickerState datePickerState, DatePickerFormatter datePickerFormatter, int i10) {
            super(2);
            this.f9996p0 = datePickerState;
            this.f9997q0 = datePickerFormatter;
            this.f9998r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1578326756, iIntValue, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:160)");
                }
                DatePickerDefaults datePickerDefaults = DatePickerDefaults.INSTANCE;
                DatePickerState datePickerState = this.f9996p0;
                DatePickerFormatter datePickerFormatter = this.f9997q0;
                Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.f9960f);
                int i10 = this.f9998r0;
                datePickerDefaults.DatePickerHeadline(datePickerState, datePickerFormatter, modifierPadding, composer2, (i10 & 14) | 3456 | ((i10 >> 3) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class f0 extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LazyListState f9999p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(LazyListState lazyListState) {
            super(0);
            this.f9999p0 = lazyListState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(this.f9999p0.getFirstVisibleItemIndex());
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    @SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DatePicker$5\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1920:1\n36#2:1921\n1114#3,6:1922\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$DatePicker$5\n*L\n180#1:1921\n180#1:1922,6\n*E\n"})
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DatePickerState f10000p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(DatePickerState datePickerState, int i10) {
            super(2);
            this.f10000p0 = datePickerState;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1702543532, iIntValue, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:175)");
                }
                Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                DatePickerState datePickerState = this.f10000p0;
                int iM1067getDisplayModejFl4v0 = datePickerState.m1067getDisplayModejFl4v0();
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged = composer2.changed(datePickerState);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new androidx.compose.material3.b0(datePickerState);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                DatePickerKt.m1065DisplayModeToggleButtontER2X8s(modifierPadding, iM1067getDisplayModejFl4v0, (Function1) objRememberedValue, composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class g0 implements FlowCollector<Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LazyListState f10001p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ StateData f10002q0;

        public g0(LazyListState lazyListState, StateData stateData) {
            this.f10001p0 = lazyListState;
            this.f10002q0 = stateData;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Integer num, Continuation continuation) {
            num.intValue();
            LazyListState lazyListState = this.f10001p0;
            int firstVisibleItemIndex = lazyListState.getFirstVisibleItemIndex() / 12;
            int firstVisibleItemIndex2 = (lazyListState.getFirstVisibleItemIndex() % 12) + 1;
            StateData stateData = this.f10002q0;
            if (stateData.getDisplayedMonth().getMonth() != firstVisibleItemIndex2 || stateData.getDisplayedMonth().getYear() != stateData.getYearRange().getFirst() + firstVisibleItemIndex) {
                stateData.setDisplayedMonth(stateData.getCalendarModel().getMonth(stateData.getYearRange().getFirst() + firstVisibleItemIndex, firstVisibleItemIndex2));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DatePickerState f10003p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ DatePickerFormatter f10004q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, Boolean> f10005r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ DatePickerColors f10006s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f10007t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(DatePickerState datePickerState, DatePickerFormatter datePickerFormatter, Function1<? super Long, Boolean> function1, DatePickerColors datePickerColors, int i10) {
            super(2);
            this.f10003p0 = datePickerState;
            this.f10004q0 = datePickerFormatter;
            this.f10005r0 = function1;
            this.f10006s0 = datePickerColors;
            this.f10007t0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(173769747, iIntValue, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:194)");
                }
                DatePickerState datePickerState = this.f10003p0;
                DatePickerFormatter datePickerFormatter = this.f10004q0;
                Function1<Long, Boolean> function1 = this.f10005r0;
                DatePickerColors datePickerColors = this.f10006s0;
                int i10 = this.f10007t0;
                int i11 = i10 >> 3;
                DatePickerKt.access$SwitchableDateEntryContent(datePickerState, datePickerFormatter, function1, datePickerColors, composer2, (i10 & 14) | (i11 & 112) | (i11 & 896) | ((i10 >> 12) & 7168));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class i extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DatePickerState f10008p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10009q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ DatePickerFormatter f10010r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, Boolean> f10011s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10012t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10013u0;
        public final /* synthetic */ boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ DatePickerColors f10014w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f10015x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f10016y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(DatePickerState datePickerState, Modifier modifier, DatePickerFormatter datePickerFormatter, Function1<? super Long, Boolean> function1, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, boolean z10, DatePickerColors datePickerColors, int i10, int i11) {
            super(2);
            this.f10008p0 = datePickerState;
            this.f10009q0 = modifier;
            this.f10010r0 = datePickerFormatter;
            this.f10011s0 = function1;
            this.f10012t0 = function2;
            this.f10013u0 = function3;
            this.v0 = z10;
            this.f10014w0 = datePickerColors;
            this.f10015x0 = i10;
            this.f10016y0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            DatePickerKt.DatePicker(this.f10008p0, this.f10009q0, this.f10010r0, this.f10011s0, this.f10012t0, this.f10013u0, this.v0, this.f10014w0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10015x0 | 1), this.f10016y0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class j extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10017p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f10018q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i10, Function2 function2) {
            super(2);
            this.f10017p0 = function2;
            this.f10018q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1005061498, iIntValue, -1, "androidx.compose.material3.DatePickerHeader.<anonymous>.<anonymous> (DatePicker.kt:1250)");
                }
                TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), DatePickerModalTokens.INSTANCE.getHeaderSupportingTextFont()), ComposableLambdaKt.composableLambda(composer2, -2006650069, true, new androidx.compose.material3.d0(this.f10018q0, this.f10017p0)), composer2, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class k extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10019p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10020q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f10021r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f10022s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ float f10023t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10024u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, long j10, long j11, float f6, Function2<? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f10019p0 = modifier;
            this.f10020q0 = function2;
            this.f10021r0 = j10;
            this.f10022s0 = j11;
            this.f10023t0 = f6;
            this.f10024u0 = function3;
            this.v0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            DatePickerKt.m1064DatePickerHeaderpc5RIQQ(this.f10019p0, this.f10020q0, this.f10021r0, this.f10022s0, this.f10023t0, this.f10024u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class l extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<DisplayMode, Unit> f10025p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(Function1<? super DisplayMode, Unit> function1) {
            super(0);
            this.f10025p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f10025p0.invoke(DisplayMode.m1073boximpl(DisplayMode.INSTANCE.m1080getInputjFl4v0()));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class m extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<DisplayMode, Unit> f10026p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(Function1<? super DisplayMode, Unit> function1) {
            super(0);
            this.f10026p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f10026p0.invoke(DisplayMode.m1073boximpl(DisplayMode.INSTANCE.m1081getPickerjFl4v0()));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class n extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10027p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f10028q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<DisplayMode, Unit> f10029r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f10030s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n(Modifier modifier, int i10, Function1<? super DisplayMode, Unit> function1, int i11) {
            super(2);
            this.f10027p0 = modifier;
            this.f10028q0 = i10;
            this.f10029r0 = function1;
            this.f10030s0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f10030s0 | 1);
            int i10 = this.f10028q0;
            Function1<DisplayMode, Unit> function1 = this.f10029r0;
            DatePickerKt.m1065DisplayModeToggleButtontER2X8s(this.f10027p0, i10, function1, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class o extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final o f10031p0 = new o(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.setHorizontalScrollAxisRange(semantics, new ScrollAxisRange(androidx.compose.material3.e0.f12785p0, androidx.compose.material3.f0.f12817p0, false, 4, null));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class p extends Lambda implements Function1<LazyListScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ StateData f10032p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CalendarMonth f10033q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, Unit> f10034r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ CalendarDate f10035s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, Boolean> f10036t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ DatePickerFormatter f10037u0;
        public final /* synthetic */ DatePickerColors v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f10038w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public p(StateData stateData, CalendarMonth calendarMonth, Function1<? super Long, Unit> function1, CalendarDate calendarDate, Function1<? super Long, Boolean> function2, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, int i10) {
            super(1);
            this.f10032p0 = stateData;
            this.f10033q0 = calendarMonth;
            this.f10034r0 = function1;
            this.f10035s0 = calendarDate;
            this.f10036t0 = function2;
            this.f10037u0 = datePickerFormatter;
            this.v0 = datePickerColors;
            this.f10038w0 = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LazyListScope lazyListScope) {
            LazyListScope LazyRow = lazyListScope;
            Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
            androidx.compose.foundation.lazy.a.k(LazyRow, this.f10032p0.getTotalMonthsInRange(), null, null, ComposableLambdaKt.composableLambdaInstance(-65053693, true, new androidx.compose.material3.g0(this.f10032p0, this.f10033q0, this.f10034r0, this.f10035s0, this.f10036t0, this.f10037u0, this.v0, this.f10038w0)), 6, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    @DebugMetadata(c = "androidx.compose.material3.DatePickerKt$HorizontalMonthsList$3$1", f = "DatePicker.kt", i = {}, l = {1325}, m = "invokeSuspend", n = {}, s = {})
    public static final class q extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f10039p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LazyListState f10040q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ StateData f10041r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(LazyListState lazyListState, StateData stateData, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f10040q0 = lazyListState;
            this.f10041r0 = stateData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new q(this.f10040q0, this.f10041r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f10039p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f10039p0 = 1;
                if (DatePickerKt.updateDisplayedMonth(this.f10040q0, this.f10041r0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class r extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, Unit> f10042p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ StateData f10043q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ LazyListState f10044r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ DatePickerFormatter f10045s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, Boolean> f10046t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ DatePickerColors f10047u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(Function1<? super Long, Unit> function1, StateData stateData, LazyListState lazyListState, DatePickerFormatter datePickerFormatter, Function1<? super Long, Boolean> function2, DatePickerColors datePickerColors, int i10) {
            super(2);
            this.f10042p0 = function1;
            this.f10043q0 = stateData;
            this.f10044r0 = lazyListState;
            this.f10045s0 = datePickerFormatter;
            this.f10046t0 = function2;
            this.f10047u0 = datePickerColors;
            this.v0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            DatePickerKt.a(this.f10042p0, this.f10043q0, this.f10044r0, this.f10045s0, this.f10046t0, this.f10047u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    @SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$Month$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1920:1\n92#2:1921\n75#3,5:1922\n80#3:1953\n84#3:2015\n75#4:1927\n76#4,11:1929\n75#4:1956\n76#4,11:1958\n89#4:2009\n89#4:2014\n76#5:1928\n76#5:1957\n460#6,13:1940\n460#6,13:1969\n50#6:1983\n49#6:1984\n50#6:1991\n49#6:1992\n36#6:1999\n473#6,3:2006\n473#6,3:2011\n79#7,2:1954\n81#7:1982\n85#7:2010\n1114#8,6:1985\n1114#8,6:1993\n1114#8,6:2000\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$Month$1\n*L\n1449#1:1921\n1447#1:1922,5\n1447#1:1953\n1447#1:2015\n1447#1:1927\n1447#1:1929,11\n1454#1:1956\n1454#1:1958,11\n1454#1:2009\n1447#1:2014\n1447#1:1928\n1454#1:1957\n1447#1:1940,13\n1454#1:1969,13\n1479#1:1983\n1479#1:1984\n1505#1:1991\n1505#1:1992\n1510#1:1999\n1454#1:2006,3\n1447#1:2011,3\n1454#1:1954,2\n1454#1:1982\n1454#1:2010\n1479#1:1985,6\n1505#1:1993,6\n1510#1:2000,6\n*E\n"})
    public static final class s extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ DatePickerColors E0;
        public final /* synthetic */ StateData F0;
        public final /* synthetic */ Function1<Long, Boolean> G0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10048p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CalendarMonth f10049q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CalendarDate f10050r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ MutableState<CalendarDate> f10051s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ MutableState<CalendarDate> f10052t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ boolean f10053u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ DatePickerFormatter f10054w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Locale f10055x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, Unit> f10056y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(Modifier modifier, CalendarMonth calendarMonth, CalendarDate calendarDate, MutableState<CalendarDate> mutableState, MutableState<CalendarDate> mutableState2, boolean z10, int i10, DatePickerFormatter datePickerFormatter, Locale locale, Function1<? super Long, Unit> function1, DatePickerColors datePickerColors, StateData stateData, Function1<? super Long, Boolean> function2) {
            super(2);
            this.f10048p0 = modifier;
            this.f10049q0 = calendarMonth;
            this.f10050r0 = calendarDate;
            this.f10051s0 = mutableState;
            this.f10052t0 = mutableState2;
            this.f10053u0 = z10;
            this.v0 = i10;
            this.f10054w0 = datePickerFormatter;
            this.f10055x0 = locale;
            this.f10056y0 = function1;
            this.E0 = datePickerColors;
            this.F0 = stateData;
            this.G0 = function2;
        }

        /* JADX WARN: Code duplicated, block: B:34:0x0162  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            int i10;
            int i11;
            int i12;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1776200645, iIntValue, -1, "androidx.compose.material3.Month.<anonymous> (DatePicker.kt:1444)");
                }
                Modifier modifierThen = SizeKt.m324requiredHeight3ABfNKs(Modifier.INSTANCE, Dp.m4389constructorimpl(DatePickerKt.getRecommendedSizeForAccessibility() * 6)).then(this.f10048p0);
                Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
                boolean z10 = this.f10053u0;
                DatePickerColors datePickerColors = this.E0;
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceEvenly, Alignment.INSTANCE.getStart(), composer2, 6);
                int i13 = -1323940314;
                composer2.startReplaceableGroup(-1323940314);
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierThen);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion, composerM2074constructorimpl, measurePolicyColumnMeasurePolicy, composerM2074constructorimpl, density));
                int i14 = 0;
                int i15 = 2058660585;
                ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(-713647587);
                int i16 = 0;
                int i17 = 0;
                for (int i18 = 6; i17 < i18; i18 = 6) {
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical spaceEvenly2 = Arrangement.INSTANCE.getSpaceEvenly();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly2, centerVertically, composer2, 54);
                    Density density2 = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, i13);
                    LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierFillMaxWidth$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composer2);
                    Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl2, measurePolicyRowMeasurePolicy, composerM2074constructorimpl2, density2));
                    ai.a.j(i14, function3MaterializerOf2, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl2, viewConfiguration2, composer2, composer2), composer2, i15);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(-1111255211);
                    int i19 = i16;
                    int i20 = i14;
                    while (i20 < 7) {
                        CalendarMonth calendarMonth = this.f10049q0;
                        if (i19 < calendarMonth.getDaysFromStartOfWeekToFirstOfMonth()) {
                            i10 = i15;
                            i11 = i14;
                            i12 = i20;
                            composer2.startReplaceableGroup(382636990);
                            SpacerKt.Spacer(SizeKt.m329requiredSizeVpY3zN4(Modifier.INSTANCE, DatePickerKt.getRecommendedSizeForAccessibility(), DatePickerKt.getRecommendedSizeForAccessibility()), composer2, 6);
                            composer2.endReplaceableGroup();
                        } else if (i19 >= calendarMonth.getNumberOfDays() + calendarMonth.getDaysFromStartOfWeekToFirstOfMonth()) {
                            i10 = i15;
                            i11 = i14;
                            i12 = i20;
                            composer2.startReplaceableGroup(382636990);
                            SpacerKt.Spacer(SizeKt.m329requiredSizeVpY3zN4(Modifier.INSTANCE, DatePickerKt.getRecommendedSizeForAccessibility(), DatePickerKt.getRecommendedSizeForAccessibility()), composer2, 6);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(382637385);
                            int daysFromStartOfWeekToFirstOfMonth = i19 - calendarMonth.getDaysFromStartOfWeekToFirstOfMonth();
                            long startUtcTimeMillis = (((long) daysFromStartOfWeekToFirstOfMonth) * 86400000) + calendarMonth.getStartUtcTimeMillis();
                            int i21 = startUtcTimeMillis == this.f10050r0.getUtcTimeMillis() ? 1 : i14;
                            CalendarDate value = this.f10051s0.getValue();
                            int i22 = (value == null || startUtcTimeMillis != value.getUtcTimeMillis()) ? i14 : 1;
                            CalendarDate value2 = this.f10052t0.getValue();
                            int i23 = (value2 == null || startUtcTimeMillis != value2.getUtcTimeMillis()) ? i14 : 1;
                            Boolean boolValueOf = Boolean.valueOf(z10);
                            Long lValueOf = Long.valueOf(startUtcTimeMillis);
                            int i24 = this.v0;
                            int i25 = (i24 >> 12) & 14;
                            composer2.startReplaceableGroup(511388516);
                            boolean zChanged = composer2.changed(boolValueOf) | composer2.changed(lValueOf);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = SnapshotStateKt.derivedStateOf(new k0(this.F0, z10, startUtcTimeMillis));
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceableGroup();
                            State state = (State) objRememberedValue;
                            int i26 = i20;
                            String strAccess$dayContentDescription = DatePickerKt.access$dayContentDescription(z10, i21, i22, i23, ((Boolean) state.getValue()).booleanValue(), composer2, i25);
                            String withSkeleton = CalendarModel_androidKt.formatWithSkeleton(startUtcTimeMillis, this.f10054w0.getSelectedDateDescriptionSkeleton(), this.f10055x0);
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            boolean z11 = (i22 == 0 && i23 == 0) ? false : true;
                            Long lValueOf2 = Long.valueOf(startUtcTimeMillis);
                            composer2.startReplaceableGroup(511388516);
                            Function1<Long, Unit> function1 = this.f10056y0;
                            boolean zChanged2 = composer2.changed(lValueOf2) | composer2.changed(function1);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new h0(startUtcTimeMillis, function1);
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            Function0 function0 = (Function0) objRememberedValue2;
                            Long lValueOf3 = Long.valueOf(startUtcTimeMillis);
                            composer2.startReplaceableGroup(1157296644);
                            boolean zChanged3 = composer2.changed(lValueOf3);
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = Boolean.valueOf(this.G0.invoke(Long.valueOf(startUtcTimeMillis)).booleanValue());
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceableGroup();
                            i10 = 2058660585;
                            i11 = 0;
                            i12 = i26;
                            DatePickerKt.access$Day(companion3, z11, function0, i22, ((Boolean) objRememberedValue3).booleanValue(), i21, ((Boolean) state.getValue()).booleanValue(), strAccess$dayContentDescription != null ? androidx.camera.core.impl.utils.a.b(strAccess$dayContentDescription, ", ", withSkeleton) : withSkeleton, datePickerColors, ComposableLambdaKt.composableLambda(composer2, 1633583293, true, new j0(daysFromStartOfWeekToFirstOfMonth)), composer2, ((i24 << 3) & 234881024) | 805306374);
                            composer2.endReplaceableGroup();
                        }
                        i19++;
                        i20 = i12 + 1;
                        i17 = i17;
                        i15 = i10;
                        i14 = i11;
                        datePickerColors = datePickerColors;
                    }
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    i17++;
                    i16 = i19;
                    i13 = -1323940314;
                }
                if (androidx.databinding.e.e(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class t extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CalendarMonth f10057p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, Unit> f10058q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CalendarDate f10059r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ StateData f10060s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f10061t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, Boolean> f10062u0;
        public final /* synthetic */ DatePickerFormatter v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ DatePickerColors f10063w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f10064x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public t(CalendarMonth calendarMonth, Function1<? super Long, Unit> function1, CalendarDate calendarDate, StateData stateData, boolean z10, Function1<? super Long, Boolean> function2, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, int i10) {
            super(2);
            this.f10057p0 = calendarMonth;
            this.f10058q0 = function1;
            this.f10059r0 = calendarDate;
            this.f10060s0 = stateData;
            this.f10061t0 = z10;
            this.f10062u0 = function2;
            this.v0 = datePickerFormatter;
            this.f10063w0 = datePickerColors;
            this.f10064x0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            DatePickerKt.Month(this.f10057p0, this.f10058q0, this.f10059r0, this.f10060s0, this.f10061t0, this.f10062u0, this.v0, this.f10063w0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10064x0 | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class u extends Lambda implements Function1<ContentDrawScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ State<SelectedRangeInfo> f10065p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ DatePickerColors f10066q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(State<SelectedRangeInfo> state, DatePickerColors datePickerColors) {
            super(1);
            this.f10065p0 = state;
            this.f10066q0 = datePickerColors;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ContentDrawScope contentDrawScope) {
            ContentDrawScope drawWithContent = contentDrawScope;
            Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
            SelectedRangeInfo value = this.f10065p0.getValue();
            if (value != null) {
                DateRangePickerKt.m1069drawRangeBackgroundmxwnekA(drawWithContent, value, this.f10066q0.getDayInSelectionRangeContainerColor());
            }
            drawWithContent.drawContent();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class v extends Lambda implements Function0<SelectedRangeInfo> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f10067p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CalendarMonth f10068q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ StateData f10069r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(boolean z10, CalendarMonth calendarMonth, StateData stateData) {
            super(0);
            this.f10067p0 = z10;
            this.f10068q0 = calendarMonth;
            this.f10069r0 = stateData;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SelectedRangeInfo invoke() {
            if (!this.f10067p0) {
                return null;
            }
            SelectedRangeInfo.Companion companion = SelectedRangeInfo.INSTANCE;
            StateData stateData = this.f10069r0;
            return companion.calculateRangeInfo(this.f10068q0, stateData.getSelectedStartDate().getValue(), stateData.getSelectedEndDate().getValue());
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    @SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$MonthsNavigation$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1920:1\n36#2:1921\n1114#3,6:1922\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerKt$MonthsNavigation$1$1\n*L\n1793#1:1921\n1793#1:1922,6\n*E\n"})
    public static final class w extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f10070p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f10071q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(String str, int i10) {
            super(2);
            this.f10070p0 = str;
            this.f10071q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1156508456, iIntValue, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous> (DatePicker.kt:1790)");
                }
                String str = this.f10070p0;
                Modifier.Companion companion = Modifier.INSTANCE;
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged = composer2.changed(str);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new l0(str);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                TextKt.m1389Text4IGK_g(str, SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (this.f10071q0 >> 12) & 14, 0, 131068);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class x extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f10072p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(boolean z10) {
            super(2);
            this.f10072p0 = z10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1143715416, iIntValue, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1803)");
                }
                IconKt.m1140Iconww6aTOc(this.f10072p0 ? KeyboardArrowRightKt.getKeyboardArrowRight(Icons.Filled.INSTANCE) : KeyboardArrowLeftKt.getKeyboardArrowLeft(Icons.Filled.INSTANCE), Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1282getDatePickerSwitchToPreviousMonthadMyvUU(), composer2, 6), (Modifier) null, 0L, composer2, 0, 12);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class y extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f10073p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(boolean z10) {
            super(2);
            this.f10073p0 = z10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1336532191, iIntValue, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1813)");
                }
                IconKt.m1140Iconww6aTOc(this.f10073p0 ? KeyboardArrowLeftKt.getKeyboardArrowLeft(Icons.Filled.INSTANCE) : KeyboardArrowRightKt.getKeyboardArrowRight(Icons.Filled.INSTANCE), Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1281getDatePickerSwitchToNextMonthadMyvUU(), composer2, 6), (Modifier) null, 0L, composer2, 0, 12);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class z extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10074p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f10075q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f10076r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f10077s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ String f10078t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f10079u0;
        public final /* synthetic */ Function0<Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f10080w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f10081x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(Modifier modifier, boolean z10, boolean z11, boolean z12, String str, Function0<Unit> function0, Function0<Unit> function1, Function0<Unit> function2, int i10) {
            super(2);
            this.f10074p0 = modifier;
            this.f10075q0 = z10;
            this.f10076r0 = z11;
            this.f10077s0 = z12;
            this.f10078t0 = str;
            this.f10079u0 = function0;
            this.v0 = function1;
            this.f10080w0 = function2;
            this.f10081x0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            DatePickerKt.b(this.f10074p0, this.f10075q0, this.f10076r0, this.f10077s0, this.f10078t0, this.f10079u0, this.v0, this.f10080w0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10081x0 | 1));
            return Unit.INSTANCE;
        }
    }

    static {
        float f6 = 12;
        f9957c = Dp.m4389constructorimpl(f6);
        f9958d = PaddingKt.m293PaddingValuesa9UjIt4$default(0.0f, 0.0f, Dp.m4389constructorimpl(f6), Dp.m4389constructorimpl(f6), 3, null);
        float f10 = 24;
        float f11 = 16;
        f9959e = PaddingKt.m293PaddingValuesa9UjIt4$default(Dp.m4389constructorimpl(f10), Dp.m4389constructorimpl(f11), Dp.m4389constructorimpl(f6), 0.0f, 8, null);
        f9960f = PaddingKt.m293PaddingValuesa9UjIt4$default(Dp.m4389constructorimpl(f10), 0.0f, Dp.m4389constructorimpl(f6), Dp.m4389constructorimpl(f6), 2, null);
        f9961g = Dp.m4389constructorimpl(f11);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: DateEntryContainer-au3_HiA, reason: not valid java name */
    public static final void m1063DateEntryContainerau3_HiA(@NotNull Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function4, @NotNull DatePickerColors colors, @NotNull TextStyle headlineTextStyle, float f6, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10) {
        int i11;
        Composer composer2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(headlineTextStyle, "headlineTextStyle");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1507356255);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function4) ? 2048 : 1024;
        }
        if ((i10 & 57344) == 0) {
            i11 |= composerStartRestartGroup.changed(colors) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(headlineTextStyle) ? 131072 : 65536;
        }
        if ((3670016 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(f6) ? 1048576 : 524288;
        }
        if ((29360128 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(content) ? 8388608 : 4194304;
        }
        int i12 = i11;
        if ((23967451 & i12) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1507356255, i12, -1, "androidx.compose.material3.DateEntryContainer (DatePicker.kt:1011)");
            }
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(SizeKt.m339sizeInqDBjuR0$default(modifier, DatePickerModalTokens.INSTANCE.m1604getContainerWidthD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), false, a.f9962p0, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyA = androidx.camera.core.impl.v.a(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierSemantics$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion, composerM2074constructorimpl, measurePolicyA, composerM2074constructorimpl, density));
            ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            m1064DatePickerHeaderpc5RIQQ(Modifier.INSTANCE, function2, colors.getTitleContentColor(), colors.getHeadlineContentColor(), f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -229007058, true, new b(function3, function4, function2, headlineTextStyle, i12)), composer2, 196614 | (i12 & 112) | ((i12 >> 6) & 57344));
            content.invoke(composer2, Integer.valueOf((i12 >> 21) & 14));
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier, function2, function3, function4, colors, headlineTextStyle, f6, content, i10));
    }

    /* JADX WARN: Code duplicated, block: B:105:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x013f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0142  */
    /* JADX WARN: Code duplicated, block: B:109:0x0146  */
    /* JADX WARN: Code duplicated, block: B:111:0x0158  */
    /* JADX WARN: Code duplicated, block: B:114:0x0174  */
    /* JADX WARN: Code duplicated, block: B:115:0x0177  */
    /* JADX WARN: Code duplicated, block: B:117:0x017a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0187  */
    /* JADX WARN: Code duplicated, block: B:120:0x018a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0197  */
    /* JADX WARN: Code duplicated, block: B:123:0x019b  */
    /* JADX WARN: Code duplicated, block: B:124:0x019e  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:128:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:131:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:133:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:135:0x0203  */
    /* JADX WARN: Code duplicated, block: B:138:0x0255  */
    /* JADX WARN: Code duplicated, block: B:143:0x0263  */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:91:0x0101  */
    /* JADX WARN: Code duplicated, block: B:95:0x0116  */
    /* JADX WARN: Code duplicated, block: B:97:0x0121  */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void DatePicker(@NotNull DatePickerState state, @Nullable Modifier modifier, @Nullable DatePickerFormatter datePickerFormatter, @Nullable Function1<? super Long, Boolean> function1, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, boolean z10, @Nullable DatePickerColors datePickerColors, @Nullable Composer composer, int i10, int i11) {
        int i12;
        int i13;
        DatePickerFormatter datePickerFormatter2;
        int i14;
        int i15;
        Function1<? super Long, Boolean> function4;
        int i16;
        int i17;
        Function2<? super Composer, ? super Integer, Unit> function5;
        int i18;
        int i19;
        Function2<? super Composer, ? super Integer, Unit> function6;
        int i20;
        int i21;
        int i22;
        Modifier modifier2;
        Function1<? super Long, Boolean> function7;
        Function2<? super Composer, ? super Integer, Unit> function2ComposableLambda;
        Function2<? super Composer, ? super Integer, Unit> function2ComposableLambda2;
        boolean z11;
        int i23;
        DatePickerColors datePickerColorsM1060colors1m2CgY;
        Object objRememberedValue;
        boolean z12;
        ComposableLambda composableLambda;
        Function2<? super Composer, ? super Integer, Unit> function8;
        Function2<? super Composer, ? super Integer, Unit> function9;
        DatePickerColors datePickerColors2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1765097918);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i24 = i11 & 2;
        if (i24 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    datePickerFormatter2 = datePickerFormatter;
                    if (composerStartRestartGroup.changed(datePickerFormatter2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 7168) == 0) {
                        function4 = function1;
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((i10 & 57344) == 0) {
                            function5 = function2;
                            if (composerStartRestartGroup.changedInstance(function5)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        i19 = i11 & 32;
                        if (i19 != 0) {
                            if ((458752 & i10) == 0) {
                                function6 = function3;
                                if (composerStartRestartGroup.changedInstance(function6)) {
                                    i20 = 131072;
                                } else {
                                    i20 = 65536;
                                }
                                i12 |= i20;
                            }
                            i21 = i11 & 64;
                            if (i21 != 0) {
                                i12 |= 1572864;
                            } else if ((i10 & 3670016) == 0) {
                                if (composerStartRestartGroup.changed(z10)) {
                                    i22 = 1048576;
                                } else {
                                    i22 = 524288;
                                }
                                i12 |= i22;
                            }
                            if ((i10 & 29360128) != 0) {
                                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                            }
                            if ((i12 & 23967451) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i24 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    } else {
                                        modifier2 = modifier;
                                    }
                                    if (i13 != 0) {
                                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                    }
                                    if (i15 != 0) {
                                        function7 = d.f9983p0;
                                    } else {
                                        function7 = function4;
                                    }
                                    if (i17 != 0) {
                                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                                    } else {
                                        function2ComposableLambda = function5;
                                    }
                                    if (i19 != 0) {
                                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                                    } else {
                                        function2ComposableLambda2 = function3;
                                    }
                                    if (i21 != 0) {
                                        z11 = true;
                                    } else {
                                        z11 = z10;
                                    }
                                    if ((i11 & 128) != 0) {
                                        i23 = i12 & (-29360129);
                                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                    } else {
                                        i23 = i12;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                                    }
                                    if (z11) {
                                        z12 = true;
                                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                                    } else {
                                        z12 = true;
                                        composableLambda = null;
                                    }
                                    ComposableLambda composableLambda2 = composableLambda;
                                    Typography typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                                    DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.INSTANCE;
                                    TextStyle textStyleFromToken = TypographyKt.fromToken(typography, datePickerModalTokens.getHeaderHeadlineFont());
                                    float fM1610getHeaderContainerHeightD9Ej5fM = datePickerModalTokens.m1610getHeaderContainerHeightD9Ej5fM();
                                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                                    int i25 = ((i23 >> 3) & 14) | 14155776;
                                    int i26 = i23 >> 9;
                                    m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda2, datePickerColorsM1060colors1m2CgY, textStyleFromToken, fM1610getHeaderContainerHeightD9Ej5fM, composableLambda3, composerStartRestartGroup, i25 | (i26 & 112) | (i26 & 896) | (i26 & 57344));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    function8 = function2ComposableLambda;
                                    function9 = function2ComposableLambda2;
                                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                                    modifier3 = modifier2;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i11 & 128) != 0) {
                                        i12 &= -29360129;
                                    }
                                    modifier2 = modifier;
                                    function2ComposableLambda2 = function3;
                                    z11 = z10;
                                    i23 = i12;
                                    function7 = function4;
                                    function2ComposableLambda = function5;
                                }
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                                }
                                if (z11) {
                                    z12 = true;
                                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                                } else {
                                    z12 = true;
                                    composableLambda = null;
                                }
                                ComposableLambda composableLambda4 = composableLambda;
                                Typography typography2 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                                DatePickerModalTokens datePickerModalTokens2 = DatePickerModalTokens.INSTANCE;
                                TextStyle textStyleFromToken2 = TypographyKt.fromToken(typography2, datePickerModalTokens2.getHeaderHeadlineFont());
                                float fM1610getHeaderContainerHeightD9Ej5fM2 = datePickerModalTokens2.m1610getHeaderContainerHeightD9Ej5fM();
                                ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                                int i27 = ((i23 >> 3) & 14) | 14155776;
                                int i28 = i23 >> 9;
                                m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda4, datePickerColorsM1060colors1m2CgY, textStyleFromToken2, fM1610getHeaderContainerHeightD9Ej5fM2, composableLambda5, composerStartRestartGroup, i27 | (i28 & 112) | (i28 & 896) | (i28 & 57344));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function8 = function2ComposableLambda;
                                function9 = function2ComposableLambda2;
                                datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                                modifier3 = modifier2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier;
                                z11 = z10;
                                datePickerColors2 = datePickerColors;
                                function7 = function4;
                                function8 = function5;
                                function9 = function6;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                        }
                        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function6 = function3;
                        i21 = i11 & 64;
                        if (i21 != 0) {
                            i12 |= 1572864;
                        } else if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(z10)) {
                                i22 = 1048576;
                            } else {
                                i22 = 524288;
                            }
                            i12 |= i22;
                        }
                        if ((i10 & 29360128) != 0) {
                            i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                        }
                        if ((i12 & 23967451) == 4793490) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = d.f9983p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            } else {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = d.f9983p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                            }
                            if (z11) {
                                z12 = true;
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                            } else {
                                z12 = true;
                                composableLambda = null;
                            }
                            ComposableLambda composableLambda6 = composableLambda;
                            Typography typography3 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                            DatePickerModalTokens datePickerModalTokens3 = DatePickerModalTokens.INSTANCE;
                            TextStyle textStyleFromToken3 = TypographyKt.fromToken(typography3, datePickerModalTokens3.getHeaderHeadlineFont());
                            float fM1610getHeaderContainerHeightD9Ej5fM3 = datePickerModalTokens3.m1610getHeaderContainerHeightD9Ej5fM();
                            ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                            int i29 = ((i23 >> 3) & 14) | 14155776;
                            int i210 = i23 >> 9;
                            m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda6, datePickerColorsM1060colors1m2CgY, textStyleFromToken3, fM1610getHeaderContainerHeightD9Ej5fM3, composableLambda7, composerStartRestartGroup, i29 | (i210 & 112) | (i210 & 896) | (i210 & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function8 = function2ComposableLambda;
                            function9 = function2ComposableLambda2;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            modifier3 = modifier2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = d.f9983p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            } else {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = d.f9983p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                            }
                            if (z11) {
                                z12 = true;
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                            } else {
                                z12 = true;
                                composableLambda = null;
                            }
                            ComposableLambda composableLambda8 = composableLambda;
                            Typography typography4 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                            DatePickerModalTokens datePickerModalTokens4 = DatePickerModalTokens.INSTANCE;
                            TextStyle textStyleFromToken4 = TypographyKt.fromToken(typography4, datePickerModalTokens4.getHeaderHeadlineFont());
                            float fM1610getHeaderContainerHeightD9Ej5fM4 = datePickerModalTokens4.m1610getHeaderContainerHeightD9Ej5fM();
                            ComposableLambda composableLambda9 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                            int i211 = ((i23 >> 3) & 14) | 14155776;
                            int i212 = i23 >> 9;
                            m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda8, datePickerColorsM1060colors1m2CgY, textStyleFromToken4, fM1610getHeaderContainerHeightD9Ej5fM4, composableLambda9, composerStartRestartGroup, i211 | (i212 & 112) | (i212 & 896) | (i212 & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function8 = function2ComposableLambda;
                            function9 = function2ComposableLambda2;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                    }
                    i12 |= 24576;
                    function5 = function2;
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        if ((458752 & i10) == 0) {
                            function6 = function3;
                            if (composerStartRestartGroup.changedInstance(function6)) {
                                i20 = 131072;
                            } else {
                                i20 = 65536;
                            }
                            i12 |= i20;
                        }
                        i21 = i11 & 64;
                        if (i21 != 0) {
                            i12 |= 1572864;
                        } else if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(z10)) {
                                i22 = 1048576;
                            } else {
                                i22 = 524288;
                            }
                            i12 |= i22;
                        }
                        if ((i10 & 29360128) != 0) {
                            i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                        }
                        if ((i12 & 23967451) == 4793490) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = d.f9983p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            } else {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = d.f9983p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                            }
                            if (z11) {
                                z12 = true;
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                            } else {
                                z12 = true;
                                composableLambda = null;
                            }
                            ComposableLambda composableLambda10 = composableLambda;
                            Typography typography5 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                            DatePickerModalTokens datePickerModalTokens5 = DatePickerModalTokens.INSTANCE;
                            TextStyle textStyleFromToken5 = TypographyKt.fromToken(typography5, datePickerModalTokens5.getHeaderHeadlineFont());
                            float fM1610getHeaderContainerHeightD9Ej5fM5 = datePickerModalTokens5.m1610getHeaderContainerHeightD9Ej5fM();
                            ComposableLambda composableLambda11 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                            int i213 = ((i23 >> 3) & 14) | 14155776;
                            int i214 = i23 >> 9;
                            m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda10, datePickerColorsM1060colors1m2CgY, textStyleFromToken5, fM1610getHeaderContainerHeightD9Ej5fM5, composableLambda11, composerStartRestartGroup, i213 | (i214 & 112) | (i214 & 896) | (i214 & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function8 = function2ComposableLambda;
                            function9 = function2ComposableLambda2;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            modifier3 = modifier2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = d.f9983p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            } else {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = d.f9983p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                            }
                            if (z11) {
                                z12 = true;
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                            } else {
                                z12 = true;
                                composableLambda = null;
                            }
                            ComposableLambda composableLambda12 = composableLambda;
                            Typography typography6 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                            DatePickerModalTokens datePickerModalTokens6 = DatePickerModalTokens.INSTANCE;
                            TextStyle textStyleFromToken6 = TypographyKt.fromToken(typography6, datePickerModalTokens6.getHeaderHeadlineFont());
                            float fM1610getHeaderContainerHeightD9Ej5fM6 = datePickerModalTokens6.m1610getHeaderContainerHeightD9Ej5fM();
                            ComposableLambda composableLambda13 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                            int i215 = ((i23 >> 3) & 14) | 14155776;
                            int i216 = i23 >> 9;
                            m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda12, datePickerColorsM1060colors1m2CgY, textStyleFromToken6, fM1610getHeaderContainerHeightD9Ej5fM6, composableLambda13, composerStartRestartGroup, i215 | (i216 & 112) | (i216 & 896) | (i216 & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function8 = function2ComposableLambda;
                            function9 = function2ComposableLambda2;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                    }
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function6 = function3;
                    i21 = i11 & 64;
                    if (i21 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z10)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                    }
                    if ((i12 & 23967451) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda14 = composableLambda;
                        Typography typography7 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens7 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken7 = TypographyKt.fromToken(typography7, datePickerModalTokens7.getHeaderHeadlineFont());
                        float fM1610getHeaderContainerHeightD9Ej5fM7 = datePickerModalTokens7.m1610getHeaderContainerHeightD9Ej5fM();
                        ComposableLambda composableLambda15 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i217 = ((i23 >> 3) & 14) | 14155776;
                        int i218 = i23 >> 9;
                        m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda14, datePickerColorsM1060colors1m2CgY, textStyleFromToken7, fM1610getHeaderContainerHeightD9Ej5fM7, composableLambda15, composerStartRestartGroup, i217 | (i218 & 112) | (i218 & 896) | (i218 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda16 = composableLambda;
                        Typography typography8 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens8 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken8 = TypographyKt.fromToken(typography8, datePickerModalTokens8.getHeaderHeadlineFont());
                        float fM1610getHeaderContainerHeightD9Ej5fM8 = datePickerModalTokens8.m1610getHeaderContainerHeightD9Ej5fM();
                        ComposableLambda composableLambda17 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i219 = ((i23 >> 3) & 14) | 14155776;
                        int i2110 = i23 >> 9;
                        m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda16, datePickerColorsM1060colors1m2CgY, textStyleFromToken8, fM1610getHeaderContainerHeightD9Ej5fM8, composableLambda17, composerStartRestartGroup, i219 | (i2110 & 112) | (i2110 & 896) | (i2110 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                }
                i12 |= 3072;
                function4 = function1;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 57344) == 0) {
                        function5 = function2;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        if ((458752 & i10) == 0) {
                            function6 = function3;
                            if (composerStartRestartGroup.changedInstance(function6)) {
                                i20 = 131072;
                            } else {
                                i20 = 65536;
                            }
                            i12 |= i20;
                        }
                        i21 = i11 & 64;
                        if (i21 != 0) {
                            i12 |= 1572864;
                        } else if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(z10)) {
                                i22 = 1048576;
                            } else {
                                i22 = 524288;
                            }
                            i12 |= i22;
                        }
                        if ((i10 & 29360128) != 0) {
                            i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                        }
                        if ((i12 & 23967451) == 4793490) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = d.f9983p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            } else {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = d.f9983p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                            }
                            if (z11) {
                                z12 = true;
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                            } else {
                                z12 = true;
                                composableLambda = null;
                            }
                            ComposableLambda composableLambda18 = composableLambda;
                            Typography typography9 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                            DatePickerModalTokens datePickerModalTokens9 = DatePickerModalTokens.INSTANCE;
                            TextStyle textStyleFromToken9 = TypographyKt.fromToken(typography9, datePickerModalTokens9.getHeaderHeadlineFont());
                            float fM1610getHeaderContainerHeightD9Ej5fM9 = datePickerModalTokens9.m1610getHeaderContainerHeightD9Ej5fM();
                            ComposableLambda composableLambda19 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                            int i2111 = ((i23 >> 3) & 14) | 14155776;
                            int i2112 = i23 >> 9;
                            m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda18, datePickerColorsM1060colors1m2CgY, textStyleFromToken9, fM1610getHeaderContainerHeightD9Ej5fM9, composableLambda19, composerStartRestartGroup, i2111 | (i2112 & 112) | (i2112 & 896) | (i2112 & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function8 = function2ComposableLambda;
                            function9 = function2ComposableLambda2;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            modifier3 = modifier2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = d.f9983p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            } else {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = d.f9983p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                            }
                            if (z11) {
                                z12 = true;
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                            } else {
                                z12 = true;
                                composableLambda = null;
                            }
                            ComposableLambda composableLambda110 = composableLambda;
                            Typography typography10 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                            DatePickerModalTokens datePickerModalTokens10 = DatePickerModalTokens.INSTANCE;
                            TextStyle textStyleFromToken10 = TypographyKt.fromToken(typography10, datePickerModalTokens10.getHeaderHeadlineFont());
                            float fM1610getHeaderContainerHeightD9Ej5fM10 = datePickerModalTokens10.m1610getHeaderContainerHeightD9Ej5fM();
                            ComposableLambda composableLambda111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                            int i2113 = ((i23 >> 3) & 14) | 14155776;
                            int i2114 = i23 >> 9;
                            m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda110, datePickerColorsM1060colors1m2CgY, textStyleFromToken10, fM1610getHeaderContainerHeightD9Ej5fM10, composableLambda111, composerStartRestartGroup, i2113 | (i2114 & 112) | (i2114 & 896) | (i2114 & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function8 = function2ComposableLambda;
                            function9 = function2ComposableLambda2;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                    }
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function6 = function3;
                    i21 = i11 & 64;
                    if (i21 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z10)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                    }
                    if ((i12 & 23967451) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda112 = composableLambda;
                        Typography typography11 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens11 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken11 = TypographyKt.fromToken(typography11, datePickerModalTokens11.getHeaderHeadlineFont());
                        float fM1610getHeaderContainerHeightD9Ej5fM11 = datePickerModalTokens11.m1610getHeaderContainerHeightD9Ej5fM();
                        ComposableLambda composableLambda113 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i2115 = ((i23 >> 3) & 14) | 14155776;
                        int i2116 = i23 >> 9;
                        m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda112, datePickerColorsM1060colors1m2CgY, textStyleFromToken11, fM1610getHeaderContainerHeightD9Ej5fM11, composableLambda113, composerStartRestartGroup, i2115 | (i2116 & 112) | (i2116 & 896) | (i2116 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda114 = composableLambda;
                        Typography typography12 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens12 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken12 = TypographyKt.fromToken(typography12, datePickerModalTokens12.getHeaderHeadlineFont());
                        float fM1610getHeaderContainerHeightD9Ej5fM12 = datePickerModalTokens12.m1610getHeaderContainerHeightD9Ej5fM();
                        ComposableLambda composableLambda115 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i2117 = ((i23 >> 3) & 14) | 14155776;
                        int i2118 = i23 >> 9;
                        m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda114, datePickerColorsM1060colors1m2CgY, textStyleFromToken12, fM1610getHeaderContainerHeightD9Ej5fM12, composableLambda115, composerStartRestartGroup, i2117 | (i2118 & 112) | (i2118 & 896) | (i2118 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                }
                i12 |= 24576;
                function5 = function2;
                i19 = i11 & 32;
                if (i19 != 0) {
                    if ((458752 & i10) == 0) {
                        function6 = function3;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    i21 = i11 & 64;
                    if (i21 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z10)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                    }
                    if ((i12 & 23967451) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda116 = composableLambda;
                        Typography typography13 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens13 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken13 = TypographyKt.fromToken(typography13, datePickerModalTokens13.getHeaderHeadlineFont());
                        float fM1610getHeaderContainerHeightD9Ej5fM13 = datePickerModalTokens13.m1610getHeaderContainerHeightD9Ej5fM();
                        ComposableLambda composableLambda117 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i2119 = ((i23 >> 3) & 14) | 14155776;
                        int i21110 = i23 >> 9;
                        m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda116, datePickerColorsM1060colors1m2CgY, textStyleFromToken13, fM1610getHeaderContainerHeightD9Ej5fM13, composableLambda117, composerStartRestartGroup, i2119 | (i21110 & 112) | (i21110 & 896) | (i21110 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda118 = composableLambda;
                        Typography typography14 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens14 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken14 = TypographyKt.fromToken(typography14, datePickerModalTokens14.getHeaderHeadlineFont());
                        float fM1610getHeaderContainerHeightD9Ej5fM14 = datePickerModalTokens14.m1610getHeaderContainerHeightD9Ej5fM();
                        ComposableLambda composableLambda119 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i21111 = ((i23 >> 3) & 14) | 14155776;
                        int i21112 = i23 >> 9;
                        m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda118, datePickerColorsM1060colors1m2CgY, textStyleFromToken14, fM1610getHeaderContainerHeightD9Ej5fM14, composableLambda119, composerStartRestartGroup, i21111 | (i21112 & 112) | (i21112 & 896) | (i21112 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                }
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function6 = function3;
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z10)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                }
                if ((i12 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda1110 = composableLambda;
                    Typography typography15 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens15 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken15 = TypographyKt.fromToken(typography15, datePickerModalTokens15.getHeaderHeadlineFont());
                    float fM1610getHeaderContainerHeightD9Ej5fM15 = datePickerModalTokens15.m1610getHeaderContainerHeightD9Ej5fM();
                    ComposableLambda composableLambda1111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i21113 = ((i23 >> 3) & 14) | 14155776;
                    int i21114 = i23 >> 9;
                    m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1110, datePickerColorsM1060colors1m2CgY, textStyleFromToken15, fM1610getHeaderContainerHeightD9Ej5fM15, composableLambda1111, composerStartRestartGroup, i21113 | (i21114 & 112) | (i21114 & 896) | (i21114 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda1112 = composableLambda;
                    Typography typography16 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens16 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken16 = TypographyKt.fromToken(typography16, datePickerModalTokens16.getHeaderHeadlineFont());
                    float fM1610getHeaderContainerHeightD9Ej5fM16 = datePickerModalTokens16.m1610getHeaderContainerHeightD9Ej5fM();
                    ComposableLambda composableLambda1113 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i21115 = ((i23 >> 3) & 14) | 14155776;
                    int i21116 = i23 >> 9;
                    m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1112, datePickerColorsM1060colors1m2CgY, textStyleFromToken16, fM1610getHeaderContainerHeightD9Ej5fM16, composableLambda1113, composerStartRestartGroup, i21115 | (i21116 & 112) | (i21116 & 896) | (i21116 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            datePickerFormatter2 = datePickerFormatter;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    function4 = function1;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 57344) == 0) {
                        function5 = function2;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        if ((458752 & i10) == 0) {
                            function6 = function3;
                            if (composerStartRestartGroup.changedInstance(function6)) {
                                i20 = 131072;
                            } else {
                                i20 = 65536;
                            }
                            i12 |= i20;
                        }
                        i21 = i11 & 64;
                        if (i21 != 0) {
                            i12 |= 1572864;
                        } else if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(z10)) {
                                i22 = 1048576;
                            } else {
                                i22 = 524288;
                            }
                            i12 |= i22;
                        }
                        if ((i10 & 29360128) != 0) {
                            i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                        }
                        if ((i12 & 23967451) == 4793490) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = d.f9983p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            } else {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = d.f9983p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                            }
                            if (z11) {
                                z12 = true;
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                            } else {
                                z12 = true;
                                composableLambda = null;
                            }
                            ComposableLambda composableLambda1114 = composableLambda;
                            Typography typography17 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                            DatePickerModalTokens datePickerModalTokens17 = DatePickerModalTokens.INSTANCE;
                            TextStyle textStyleFromToken17 = TypographyKt.fromToken(typography17, datePickerModalTokens17.getHeaderHeadlineFont());
                            float fM1610getHeaderContainerHeightD9Ej5fM17 = datePickerModalTokens17.m1610getHeaderContainerHeightD9Ej5fM();
                            ComposableLambda composableLambda1115 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                            int i21117 = ((i23 >> 3) & 14) | 14155776;
                            int i21118 = i23 >> 9;
                            m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1114, datePickerColorsM1060colors1m2CgY, textStyleFromToken17, fM1610getHeaderContainerHeightD9Ej5fM17, composableLambda1115, composerStartRestartGroup, i21117 | (i21118 & 112) | (i21118 & 896) | (i21118 & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function8 = function2ComposableLambda;
                            function9 = function2ComposableLambda2;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            modifier3 = modifier2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = d.f9983p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            } else {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = d.f9983p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                            }
                            if (z11) {
                                z12 = true;
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                            } else {
                                z12 = true;
                                composableLambda = null;
                            }
                            ComposableLambda composableLambda1116 = composableLambda;
                            Typography typography18 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                            DatePickerModalTokens datePickerModalTokens18 = DatePickerModalTokens.INSTANCE;
                            TextStyle textStyleFromToken18 = TypographyKt.fromToken(typography18, datePickerModalTokens18.getHeaderHeadlineFont());
                            float fM1610getHeaderContainerHeightD9Ej5fM18 = datePickerModalTokens18.m1610getHeaderContainerHeightD9Ej5fM();
                            ComposableLambda composableLambda1117 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                            int i21119 = ((i23 >> 3) & 14) | 14155776;
                            int i211110 = i23 >> 9;
                            m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1116, datePickerColorsM1060colors1m2CgY, textStyleFromToken18, fM1610getHeaderContainerHeightD9Ej5fM18, composableLambda1117, composerStartRestartGroup, i21119 | (i211110 & 112) | (i211110 & 896) | (i211110 & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function8 = function2ComposableLambda;
                            function9 = function2ComposableLambda2;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                    }
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function6 = function3;
                    i21 = i11 & 64;
                    if (i21 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z10)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                    }
                    if ((i12 & 23967451) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda1118 = composableLambda;
                        Typography typography19 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens19 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken19 = TypographyKt.fromToken(typography19, datePickerModalTokens19.getHeaderHeadlineFont());
                        float fM1610getHeaderContainerHeightD9Ej5fM19 = datePickerModalTokens19.m1610getHeaderContainerHeightD9Ej5fM();
                        ComposableLambda composableLambda1119 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i211111 = ((i23 >> 3) & 14) | 14155776;
                        int i211112 = i23 >> 9;
                        m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1118, datePickerColorsM1060colors1m2CgY, textStyleFromToken19, fM1610getHeaderContainerHeightD9Ej5fM19, composableLambda1119, composerStartRestartGroup, i211111 | (i211112 & 112) | (i211112 & 896) | (i211112 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda11110 = composableLambda;
                        Typography typography110 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens110 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken110 = TypographyKt.fromToken(typography110, datePickerModalTokens110.getHeaderHeadlineFont());
                        float fM1610getHeaderContainerHeightD9Ej5fM110 = datePickerModalTokens110.m1610getHeaderContainerHeightD9Ej5fM();
                        ComposableLambda composableLambda11111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i211113 = ((i23 >> 3) & 14) | 14155776;
                        int i211114 = i23 >> 9;
                        m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda11110, datePickerColorsM1060colors1m2CgY, textStyleFromToken110, fM1610getHeaderContainerHeightD9Ej5fM110, composableLambda11111, composerStartRestartGroup, i211113 | (i211114 & 112) | (i211114 & 896) | (i211114 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                }
                i12 |= 24576;
                function5 = function2;
                i19 = i11 & 32;
                if (i19 != 0) {
                    if ((458752 & i10) == 0) {
                        function6 = function3;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    i21 = i11 & 64;
                    if (i21 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z10)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                    }
                    if ((i12 & 23967451) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda11112 = composableLambda;
                        Typography typography111 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens111 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken111 = TypographyKt.fromToken(typography111, datePickerModalTokens111.getHeaderHeadlineFont());
                        float fM1610getHeaderContainerHeightD9Ej5fM111 = datePickerModalTokens111.m1610getHeaderContainerHeightD9Ej5fM();
                        ComposableLambda composableLambda11113 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i211115 = ((i23 >> 3) & 14) | 14155776;
                        int i211116 = i23 >> 9;
                        m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda11112, datePickerColorsM1060colors1m2CgY, textStyleFromToken111, fM1610getHeaderContainerHeightD9Ej5fM111, composableLambda11113, composerStartRestartGroup, i211115 | (i211116 & 112) | (i211116 & 896) | (i211116 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda11114 = composableLambda;
                        Typography typography112 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens112 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken112 = TypographyKt.fromToken(typography112, datePickerModalTokens112.getHeaderHeadlineFont());
                        float fM1610getHeaderContainerHeightD9Ej5fM112 = datePickerModalTokens112.m1610getHeaderContainerHeightD9Ej5fM();
                        ComposableLambda composableLambda11115 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i211117 = ((i23 >> 3) & 14) | 14155776;
                        int i211118 = i23 >> 9;
                        m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda11114, datePickerColorsM1060colors1m2CgY, textStyleFromToken112, fM1610getHeaderContainerHeightD9Ej5fM112, composableLambda11115, composerStartRestartGroup, i211117 | (i211118 & 112) | (i211118 & 896) | (i211118 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                }
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function6 = function3;
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z10)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                }
                if ((i12 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda11116 = composableLambda;
                    Typography typography113 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens113 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken113 = TypographyKt.fromToken(typography113, datePickerModalTokens113.getHeaderHeadlineFont());
                    float fM1610getHeaderContainerHeightD9Ej5fM113 = datePickerModalTokens113.m1610getHeaderContainerHeightD9Ej5fM();
                    ComposableLambda composableLambda11117 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i211119 = ((i23 >> 3) & 14) | 14155776;
                    int i2111110 = i23 >> 9;
                    m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda11116, datePickerColorsM1060colors1m2CgY, textStyleFromToken113, fM1610getHeaderContainerHeightD9Ej5fM113, composableLambda11117, composerStartRestartGroup, i211119 | (i2111110 & 112) | (i2111110 & 896) | (i2111110 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda11118 = composableLambda;
                    Typography typography114 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens114 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken114 = TypographyKt.fromToken(typography114, datePickerModalTokens114.getHeaderHeadlineFont());
                    float fM1610getHeaderContainerHeightD9Ej5fM114 = datePickerModalTokens114.m1610getHeaderContainerHeightD9Ej5fM();
                    ComposableLambda composableLambda11119 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i2111111 = ((i23 >> 3) & 14) | 14155776;
                    int i2111112 = i23 >> 9;
                    m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda11118, datePickerColorsM1060colors1m2CgY, textStyleFromToken114, fM1610getHeaderContainerHeightD9Ej5fM114, composableLambda11119, composerStartRestartGroup, i2111111 | (i2111112 & 112) | (i2111112 & 896) | (i2111112 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
            }
            i12 |= 3072;
            function4 = function1;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 57344) == 0) {
                    function5 = function2;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    if ((458752 & i10) == 0) {
                        function6 = function3;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    i21 = i11 & 64;
                    if (i21 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z10)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                    }
                    if ((i12 & 23967451) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda111110 = composableLambda;
                        Typography typography115 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens115 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken115 = TypographyKt.fromToken(typography115, datePickerModalTokens115.getHeaderHeadlineFont());
                        float fM1610getHeaderContainerHeightD9Ej5fM115 = datePickerModalTokens115.m1610getHeaderContainerHeightD9Ej5fM();
                        ComposableLambda composableLambda111111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i2111113 = ((i23 >> 3) & 14) | 14155776;
                        int i2111114 = i23 >> 9;
                        m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda111110, datePickerColorsM1060colors1m2CgY, textStyleFromToken115, fM1610getHeaderContainerHeightD9Ej5fM115, composableLambda111111, composerStartRestartGroup, i2111113 | (i2111114 & 112) | (i2111114 & 896) | (i2111114 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda111112 = composableLambda;
                        Typography typography116 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens116 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken116 = TypographyKt.fromToken(typography116, datePickerModalTokens116.getHeaderHeadlineFont());
                        float fM1610getHeaderContainerHeightD9Ej5fM116 = datePickerModalTokens116.m1610getHeaderContainerHeightD9Ej5fM();
                        ComposableLambda composableLambda111113 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i2111115 = ((i23 >> 3) & 14) | 14155776;
                        int i2111116 = i23 >> 9;
                        m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda111112, datePickerColorsM1060colors1m2CgY, textStyleFromToken116, fM1610getHeaderContainerHeightD9Ej5fM116, composableLambda111113, composerStartRestartGroup, i2111115 | (i2111116 & 112) | (i2111116 & 896) | (i2111116 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                }
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function6 = function3;
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z10)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                }
                if ((i12 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda111114 = composableLambda;
                    Typography typography117 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens117 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken117 = TypographyKt.fromToken(typography117, datePickerModalTokens117.getHeaderHeadlineFont());
                    float fM1610getHeaderContainerHeightD9Ej5fM117 = datePickerModalTokens117.m1610getHeaderContainerHeightD9Ej5fM();
                    ComposableLambda composableLambda111115 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i2111117 = ((i23 >> 3) & 14) | 14155776;
                    int i2111118 = i23 >> 9;
                    m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda111114, datePickerColorsM1060colors1m2CgY, textStyleFromToken117, fM1610getHeaderContainerHeightD9Ej5fM117, composableLambda111115, composerStartRestartGroup, i2111117 | (i2111118 & 112) | (i2111118 & 896) | (i2111118 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda111116 = composableLambda;
                    Typography typography118 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens118 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken118 = TypographyKt.fromToken(typography118, datePickerModalTokens118.getHeaderHeadlineFont());
                    float fM1610getHeaderContainerHeightD9Ej5fM118 = datePickerModalTokens118.m1610getHeaderContainerHeightD9Ej5fM();
                    ComposableLambda composableLambda111117 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i2111119 = ((i23 >> 3) & 14) | 14155776;
                    int i21111110 = i23 >> 9;
                    m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda111116, datePickerColorsM1060colors1m2CgY, textStyleFromToken118, fM1610getHeaderContainerHeightD9Ej5fM118, composableLambda111117, composerStartRestartGroup, i2111119 | (i21111110 & 112) | (i21111110 & 896) | (i21111110 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
            }
            i12 |= 24576;
            function5 = function2;
            i19 = i11 & 32;
            if (i19 != 0) {
                if ((458752 & i10) == 0) {
                    function6 = function3;
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z10)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                }
                if ((i12 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda111118 = composableLambda;
                    Typography typography119 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens119 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken119 = TypographyKt.fromToken(typography119, datePickerModalTokens119.getHeaderHeadlineFont());
                    float fM1610getHeaderContainerHeightD9Ej5fM119 = datePickerModalTokens119.m1610getHeaderContainerHeightD9Ej5fM();
                    ComposableLambda composableLambda111119 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i21111111 = ((i23 >> 3) & 14) | 14155776;
                    int i21111112 = i23 >> 9;
                    m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda111118, datePickerColorsM1060colors1m2CgY, textStyleFromToken119, fM1610getHeaderContainerHeightD9Ej5fM119, composableLambda111119, composerStartRestartGroup, i21111111 | (i21111112 & 112) | (i21111112 & 896) | (i21111112 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda1111110 = composableLambda;
                    Typography typography1110 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens1110 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken1110 = TypographyKt.fromToken(typography1110, datePickerModalTokens1110.getHeaderHeadlineFont());
                    float fM1610getHeaderContainerHeightD9Ej5fM1110 = datePickerModalTokens1110.m1610getHeaderContainerHeightD9Ej5fM();
                    ComposableLambda composableLambda1111111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i21111113 = ((i23 >> 3) & 14) | 14155776;
                    int i21111114 = i23 >> 9;
                    m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1111110, datePickerColorsM1060colors1m2CgY, textStyleFromToken1110, fM1610getHeaderContainerHeightD9Ej5fM1110, composableLambda1111111, composerStartRestartGroup, i21111113 | (i21111114 & 112) | (i21111114 & 896) | (i21111114 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function6 = function3;
            i21 = i11 & 64;
            if (i21 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(z10)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
            }
            if ((i12 & 23967451) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = d.f9983p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = d.f9983p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                }
                if (z11) {
                    z12 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                } else {
                    z12 = true;
                    composableLambda = null;
                }
                ComposableLambda composableLambda1111112 = composableLambda;
                Typography typography1111 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                DatePickerModalTokens datePickerModalTokens1111 = DatePickerModalTokens.INSTANCE;
                TextStyle textStyleFromToken1111 = TypographyKt.fromToken(typography1111, datePickerModalTokens1111.getHeaderHeadlineFont());
                float fM1610getHeaderContainerHeightD9Ej5fM1111 = datePickerModalTokens1111.m1610getHeaderContainerHeightD9Ej5fM();
                ComposableLambda composableLambda1111113 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                int i21111115 = ((i23 >> 3) & 14) | 14155776;
                int i21111116 = i23 >> 9;
                m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1111112, datePickerColorsM1060colors1m2CgY, textStyleFromToken1111, fM1610getHeaderContainerHeightD9Ej5fM1111, composableLambda1111113, composerStartRestartGroup, i21111115 | (i21111116 & 112) | (i21111116 & 896) | (i21111116 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function2ComposableLambda;
                function9 = function2ComposableLambda2;
                datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = d.f9983p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = d.f9983p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                }
                if (z11) {
                    z12 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                } else {
                    z12 = true;
                    composableLambda = null;
                }
                ComposableLambda composableLambda1111114 = composableLambda;
                Typography typography1112 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                DatePickerModalTokens datePickerModalTokens1112 = DatePickerModalTokens.INSTANCE;
                TextStyle textStyleFromToken1112 = TypographyKt.fromToken(typography1112, datePickerModalTokens1112.getHeaderHeadlineFont());
                float fM1610getHeaderContainerHeightD9Ej5fM1112 = datePickerModalTokens1112.m1610getHeaderContainerHeightD9Ej5fM();
                ComposableLambda composableLambda1111115 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                int i21111117 = ((i23 >> 3) & 14) | 14155776;
                int i21111118 = i23 >> 9;
                m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1111114, datePickerColorsM1060colors1m2CgY, textStyleFromToken1112, fM1610getHeaderContainerHeightD9Ej5fM1112, composableLambda1111115, composerStartRestartGroup, i21111117 | (i21111118 & 112) | (i21111118 & 896) | (i21111118 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function2ComposableLambda;
                function9 = function2ComposableLambda2;
                datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                datePickerFormatter2 = datePickerFormatter;
                if (composerStartRestartGroup.changed(datePickerFormatter2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    function4 = function1;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 57344) == 0) {
                        function5 = function2;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        if ((458752 & i10) == 0) {
                            function6 = function3;
                            if (composerStartRestartGroup.changedInstance(function6)) {
                                i20 = 131072;
                            } else {
                                i20 = 65536;
                            }
                            i12 |= i20;
                        }
                        i21 = i11 & 64;
                        if (i21 != 0) {
                            i12 |= 1572864;
                        } else if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(z10)) {
                                i22 = 1048576;
                            } else {
                                i22 = 524288;
                            }
                            i12 |= i22;
                        }
                        if ((i10 & 29360128) != 0) {
                            i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                        }
                        if ((i12 & 23967451) == 4793490) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = d.f9983p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            } else {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = d.f9983p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                            }
                            if (z11) {
                                z12 = true;
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                            } else {
                                z12 = true;
                                composableLambda = null;
                            }
                            ComposableLambda composableLambda1111116 = composableLambda;
                            Typography typography1113 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                            DatePickerModalTokens datePickerModalTokens1113 = DatePickerModalTokens.INSTANCE;
                            TextStyle textStyleFromToken1113 = TypographyKt.fromToken(typography1113, datePickerModalTokens1113.getHeaderHeadlineFont());
                            float fM1610getHeaderContainerHeightD9Ej5fM1113 = datePickerModalTokens1113.m1610getHeaderContainerHeightD9Ej5fM();
                            ComposableLambda composableLambda1111117 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                            int i21111119 = ((i23 >> 3) & 14) | 14155776;
                            int i211111110 = i23 >> 9;
                            m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1111116, datePickerColorsM1060colors1m2CgY, textStyleFromToken1113, fM1610getHeaderContainerHeightD9Ej5fM1113, composableLambda1111117, composerStartRestartGroup, i21111119 | (i211111110 & 112) | (i211111110 & 896) | (i211111110 & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function8 = function2ComposableLambda;
                            function9 = function2ComposableLambda2;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            modifier3 = modifier2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = d.f9983p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            } else {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = d.f9983p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                            }
                            if (z11) {
                                z12 = true;
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                            } else {
                                z12 = true;
                                composableLambda = null;
                            }
                            ComposableLambda composableLambda1111118 = composableLambda;
                            Typography typography1114 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                            DatePickerModalTokens datePickerModalTokens1114 = DatePickerModalTokens.INSTANCE;
                            TextStyle textStyleFromToken1114 = TypographyKt.fromToken(typography1114, datePickerModalTokens1114.getHeaderHeadlineFont());
                            float fM1610getHeaderContainerHeightD9Ej5fM1114 = datePickerModalTokens1114.m1610getHeaderContainerHeightD9Ej5fM();
                            ComposableLambda composableLambda1111119 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                            int i211111111 = ((i23 >> 3) & 14) | 14155776;
                            int i211111112 = i23 >> 9;
                            m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1111118, datePickerColorsM1060colors1m2CgY, textStyleFromToken1114, fM1610getHeaderContainerHeightD9Ej5fM1114, composableLambda1111119, composerStartRestartGroup, i211111111 | (i211111112 & 112) | (i211111112 & 896) | (i211111112 & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function8 = function2ComposableLambda;
                            function9 = function2ComposableLambda2;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                    }
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function6 = function3;
                    i21 = i11 & 64;
                    if (i21 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z10)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                    }
                    if ((i12 & 23967451) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda11111110 = composableLambda;
                        Typography typography1115 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens1115 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken1115 = TypographyKt.fromToken(typography1115, datePickerModalTokens1115.getHeaderHeadlineFont());
                        float fM1610getHeaderContainerHeightD9Ej5fM1115 = datePickerModalTokens1115.m1610getHeaderContainerHeightD9Ej5fM();
                        ComposableLambda composableLambda11111111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i211111113 = ((i23 >> 3) & 14) | 14155776;
                        int i211111114 = i23 >> 9;
                        m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda11111110, datePickerColorsM1060colors1m2CgY, textStyleFromToken1115, fM1610getHeaderContainerHeightD9Ej5fM1115, composableLambda11111111, composerStartRestartGroup, i211111113 | (i211111114 & 112) | (i211111114 & 896) | (i211111114 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda11111112 = composableLambda;
                        Typography typography1116 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens1116 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken1116 = TypographyKt.fromToken(typography1116, datePickerModalTokens1116.getHeaderHeadlineFont());
                        float fM1610getHeaderContainerHeightD9Ej5fM1116 = datePickerModalTokens1116.m1610getHeaderContainerHeightD9Ej5fM();
                        ComposableLambda composableLambda11111113 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i211111115 = ((i23 >> 3) & 14) | 14155776;
                        int i211111116 = i23 >> 9;
                        m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda11111112, datePickerColorsM1060colors1m2CgY, textStyleFromToken1116, fM1610getHeaderContainerHeightD9Ej5fM1116, composableLambda11111113, composerStartRestartGroup, i211111115 | (i211111116 & 112) | (i211111116 & 896) | (i211111116 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                }
                i12 |= 24576;
                function5 = function2;
                i19 = i11 & 32;
                if (i19 != 0) {
                    if ((458752 & i10) == 0) {
                        function6 = function3;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    i21 = i11 & 64;
                    if (i21 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z10)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                    }
                    if ((i12 & 23967451) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda11111114 = composableLambda;
                        Typography typography1117 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens1117 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken1117 = TypographyKt.fromToken(typography1117, datePickerModalTokens1117.getHeaderHeadlineFont());
                        float fM1610getHeaderContainerHeightD9Ej5fM1117 = datePickerModalTokens1117.m1610getHeaderContainerHeightD9Ej5fM();
                        ComposableLambda composableLambda11111115 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i211111117 = ((i23 >> 3) & 14) | 14155776;
                        int i211111118 = i23 >> 9;
                        m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda11111114, datePickerColorsM1060colors1m2CgY, textStyleFromToken1117, fM1610getHeaderContainerHeightD9Ej5fM1117, composableLambda11111115, composerStartRestartGroup, i211111117 | (i211111118 & 112) | (i211111118 & 896) | (i211111118 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda11111116 = composableLambda;
                        Typography typography1118 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens1118 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken1118 = TypographyKt.fromToken(typography1118, datePickerModalTokens1118.getHeaderHeadlineFont());
                        float fM1610getHeaderContainerHeightD9Ej5fM1118 = datePickerModalTokens1118.m1610getHeaderContainerHeightD9Ej5fM();
                        ComposableLambda composableLambda11111117 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i211111119 = ((i23 >> 3) & 14) | 14155776;
                        int i2111111110 = i23 >> 9;
                        m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda11111116, datePickerColorsM1060colors1m2CgY, textStyleFromToken1118, fM1610getHeaderContainerHeightD9Ej5fM1118, composableLambda11111117, composerStartRestartGroup, i211111119 | (i2111111110 & 112) | (i2111111110 & 896) | (i2111111110 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                }
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function6 = function3;
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z10)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                }
                if ((i12 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda11111118 = composableLambda;
                    Typography typography1119 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens1119 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken1119 = TypographyKt.fromToken(typography1119, datePickerModalTokens1119.getHeaderHeadlineFont());
                    float fM1610getHeaderContainerHeightD9Ej5fM1119 = datePickerModalTokens1119.m1610getHeaderContainerHeightD9Ej5fM();
                    ComposableLambda composableLambda11111119 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i2111111111 = ((i23 >> 3) & 14) | 14155776;
                    int i2111111112 = i23 >> 9;
                    m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda11111118, datePickerColorsM1060colors1m2CgY, textStyleFromToken1119, fM1610getHeaderContainerHeightD9Ej5fM1119, composableLambda11111119, composerStartRestartGroup, i2111111111 | (i2111111112 & 112) | (i2111111112 & 896) | (i2111111112 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda111111110 = composableLambda;
                    Typography typography11110 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens11110 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken11110 = TypographyKt.fromToken(typography11110, datePickerModalTokens11110.getHeaderHeadlineFont());
                    float fM1610getHeaderContainerHeightD9Ej5fM11110 = datePickerModalTokens11110.m1610getHeaderContainerHeightD9Ej5fM();
                    ComposableLambda composableLambda111111111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i2111111113 = ((i23 >> 3) & 14) | 14155776;
                    int i2111111114 = i23 >> 9;
                    m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda111111110, datePickerColorsM1060colors1m2CgY, textStyleFromToken11110, fM1610getHeaderContainerHeightD9Ej5fM11110, composableLambda111111111, composerStartRestartGroup, i2111111113 | (i2111111114 & 112) | (i2111111114 & 896) | (i2111111114 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
            }
            i12 |= 3072;
            function4 = function1;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 57344) == 0) {
                    function5 = function2;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    if ((458752 & i10) == 0) {
                        function6 = function3;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    i21 = i11 & 64;
                    if (i21 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z10)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                    }
                    if ((i12 & 23967451) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda111111112 = composableLambda;
                        Typography typography11111 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens11111 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken11111 = TypographyKt.fromToken(typography11111, datePickerModalTokens11111.getHeaderHeadlineFont());
                        float fM1610getHeaderContainerHeightD9Ej5fM11111 = datePickerModalTokens11111.m1610getHeaderContainerHeightD9Ej5fM();
                        ComposableLambda composableLambda111111113 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i2111111115 = ((i23 >> 3) & 14) | 14155776;
                        int i2111111116 = i23 >> 9;
                        m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda111111112, datePickerColorsM1060colors1m2CgY, textStyleFromToken11111, fM1610getHeaderContainerHeightD9Ej5fM11111, composableLambda111111113, composerStartRestartGroup, i2111111115 | (i2111111116 & 112) | (i2111111116 & 896) | (i2111111116 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda111111114 = composableLambda;
                        Typography typography11112 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens11112 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken11112 = TypographyKt.fromToken(typography11112, datePickerModalTokens11112.getHeaderHeadlineFont());
                        float fM1610getHeaderContainerHeightD9Ej5fM11112 = datePickerModalTokens11112.m1610getHeaderContainerHeightD9Ej5fM();
                        ComposableLambda composableLambda111111115 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i2111111117 = ((i23 >> 3) & 14) | 14155776;
                        int i2111111118 = i23 >> 9;
                        m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda111111114, datePickerColorsM1060colors1m2CgY, textStyleFromToken11112, fM1610getHeaderContainerHeightD9Ej5fM11112, composableLambda111111115, composerStartRestartGroup, i2111111117 | (i2111111118 & 112) | (i2111111118 & 896) | (i2111111118 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                }
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function6 = function3;
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z10)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                }
                if ((i12 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda111111116 = composableLambda;
                    Typography typography11113 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens11113 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken11113 = TypographyKt.fromToken(typography11113, datePickerModalTokens11113.getHeaderHeadlineFont());
                    float fM1610getHeaderContainerHeightD9Ej5fM11113 = datePickerModalTokens11113.m1610getHeaderContainerHeightD9Ej5fM();
                    ComposableLambda composableLambda111111117 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i2111111119 = ((i23 >> 3) & 14) | 14155776;
                    int i21111111110 = i23 >> 9;
                    m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda111111116, datePickerColorsM1060colors1m2CgY, textStyleFromToken11113, fM1610getHeaderContainerHeightD9Ej5fM11113, composableLambda111111117, composerStartRestartGroup, i2111111119 | (i21111111110 & 112) | (i21111111110 & 896) | (i21111111110 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda111111118 = composableLambda;
                    Typography typography11114 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens11114 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken11114 = TypographyKt.fromToken(typography11114, datePickerModalTokens11114.getHeaderHeadlineFont());
                    float fM1610getHeaderContainerHeightD9Ej5fM11114 = datePickerModalTokens11114.m1610getHeaderContainerHeightD9Ej5fM();
                    ComposableLambda composableLambda111111119 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i21111111111 = ((i23 >> 3) & 14) | 14155776;
                    int i21111111112 = i23 >> 9;
                    m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda111111118, datePickerColorsM1060colors1m2CgY, textStyleFromToken11114, fM1610getHeaderContainerHeightD9Ej5fM11114, composableLambda111111119, composerStartRestartGroup, i21111111111 | (i21111111112 & 112) | (i21111111112 & 896) | (i21111111112 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
            }
            i12 |= 24576;
            function5 = function2;
            i19 = i11 & 32;
            if (i19 != 0) {
                if ((458752 & i10) == 0) {
                    function6 = function3;
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z10)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                }
                if ((i12 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda1111111110 = composableLambda;
                    Typography typography11115 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens11115 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken11115 = TypographyKt.fromToken(typography11115, datePickerModalTokens11115.getHeaderHeadlineFont());
                    float fM1610getHeaderContainerHeightD9Ej5fM11115 = datePickerModalTokens11115.m1610getHeaderContainerHeightD9Ej5fM();
                    ComposableLambda composableLambda1111111111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i21111111113 = ((i23 >> 3) & 14) | 14155776;
                    int i21111111114 = i23 >> 9;
                    m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1111111110, datePickerColorsM1060colors1m2CgY, textStyleFromToken11115, fM1610getHeaderContainerHeightD9Ej5fM11115, composableLambda1111111111, composerStartRestartGroup, i21111111113 | (i21111111114 & 112) | (i21111111114 & 896) | (i21111111114 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda1111111112 = composableLambda;
                    Typography typography11116 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens11116 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken11116 = TypographyKt.fromToken(typography11116, datePickerModalTokens11116.getHeaderHeadlineFont());
                    float fM1610getHeaderContainerHeightD9Ej5fM11116 = datePickerModalTokens11116.m1610getHeaderContainerHeightD9Ej5fM();
                    ComposableLambda composableLambda1111111113 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i21111111115 = ((i23 >> 3) & 14) | 14155776;
                    int i21111111116 = i23 >> 9;
                    m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1111111112, datePickerColorsM1060colors1m2CgY, textStyleFromToken11116, fM1610getHeaderContainerHeightD9Ej5fM11116, composableLambda1111111113, composerStartRestartGroup, i21111111115 | (i21111111116 & 112) | (i21111111116 & 896) | (i21111111116 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function6 = function3;
            i21 = i11 & 64;
            if (i21 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(z10)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
            }
            if ((i12 & 23967451) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = d.f9983p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = d.f9983p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                }
                if (z11) {
                    z12 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                } else {
                    z12 = true;
                    composableLambda = null;
                }
                ComposableLambda composableLambda1111111114 = composableLambda;
                Typography typography11117 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                DatePickerModalTokens datePickerModalTokens11117 = DatePickerModalTokens.INSTANCE;
                TextStyle textStyleFromToken11117 = TypographyKt.fromToken(typography11117, datePickerModalTokens11117.getHeaderHeadlineFont());
                float fM1610getHeaderContainerHeightD9Ej5fM11117 = datePickerModalTokens11117.m1610getHeaderContainerHeightD9Ej5fM();
                ComposableLambda composableLambda1111111115 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                int i21111111117 = ((i23 >> 3) & 14) | 14155776;
                int i21111111118 = i23 >> 9;
                m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1111111114, datePickerColorsM1060colors1m2CgY, textStyleFromToken11117, fM1610getHeaderContainerHeightD9Ej5fM11117, composableLambda1111111115, composerStartRestartGroup, i21111111117 | (i21111111118 & 112) | (i21111111118 & 896) | (i21111111118 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function2ComposableLambda;
                function9 = function2ComposableLambda2;
                datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = d.f9983p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = d.f9983p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                }
                if (z11) {
                    z12 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                } else {
                    z12 = true;
                    composableLambda = null;
                }
                ComposableLambda composableLambda1111111116 = composableLambda;
                Typography typography11118 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                DatePickerModalTokens datePickerModalTokens11118 = DatePickerModalTokens.INSTANCE;
                TextStyle textStyleFromToken11118 = TypographyKt.fromToken(typography11118, datePickerModalTokens11118.getHeaderHeadlineFont());
                float fM1610getHeaderContainerHeightD9Ej5fM11118 = datePickerModalTokens11118.m1610getHeaderContainerHeightD9Ej5fM();
                ComposableLambda composableLambda1111111117 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                int i21111111119 = ((i23 >> 3) & 14) | 14155776;
                int i211111111110 = i23 >> 9;
                m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1111111116, datePickerColorsM1060colors1m2CgY, textStyleFromToken11118, fM1610getHeaderContainerHeightD9Ej5fM11118, composableLambda1111111117, composerStartRestartGroup, i21111111119 | (i211111111110 & 112) | (i211111111110 & 896) | (i211111111110 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function2ComposableLambda;
                function9 = function2ComposableLambda2;
                datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        datePickerFormatter2 = datePickerFormatter;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 7168) == 0) {
                function4 = function1;
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 57344) == 0) {
                    function5 = function2;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    if ((458752 & i10) == 0) {
                        function6 = function3;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    i21 = i11 & 64;
                    if (i21 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z10)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                    }
                    if ((i12 & 23967451) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda1111111118 = composableLambda;
                        Typography typography11119 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens11119 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken11119 = TypographyKt.fromToken(typography11119, datePickerModalTokens11119.getHeaderHeadlineFont());
                        float fM1610getHeaderContainerHeightD9Ej5fM11119 = datePickerModalTokens11119.m1610getHeaderContainerHeightD9Ej5fM();
                        ComposableLambda composableLambda1111111119 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i211111111111 = ((i23 >> 3) & 14) | 14155776;
                        int i211111111112 = i23 >> 9;
                        m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1111111118, datePickerColorsM1060colors1m2CgY, textStyleFromToken11119, fM1610getHeaderContainerHeightD9Ej5fM11119, composableLambda1111111119, composerStartRestartGroup, i211111111111 | (i211111111112 & 112) | (i211111111112 & 896) | (i211111111112 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = d.f9983p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda11111111110 = composableLambda;
                        Typography typography111110 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens111110 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken111110 = TypographyKt.fromToken(typography111110, datePickerModalTokens111110.getHeaderHeadlineFont());
                        float fM1610getHeaderContainerHeightD9Ej5fM111110 = datePickerModalTokens111110.m1610getHeaderContainerHeightD9Ej5fM();
                        ComposableLambda composableLambda11111111111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i211111111113 = ((i23 >> 3) & 14) | 14155776;
                        int i211111111114 = i23 >> 9;
                        m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda11111111110, datePickerColorsM1060colors1m2CgY, textStyleFromToken111110, fM1610getHeaderContainerHeightD9Ej5fM111110, composableLambda11111111111, composerStartRestartGroup, i211111111113 | (i211111111114 & 112) | (i211111111114 & 896) | (i211111111114 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                }
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function6 = function3;
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z10)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                }
                if ((i12 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda11111111112 = composableLambda;
                    Typography typography111111 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens111111 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken111111 = TypographyKt.fromToken(typography111111, datePickerModalTokens111111.getHeaderHeadlineFont());
                    float fM1610getHeaderContainerHeightD9Ej5fM111111 = datePickerModalTokens111111.m1610getHeaderContainerHeightD9Ej5fM();
                    ComposableLambda composableLambda11111111113 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i211111111115 = ((i23 >> 3) & 14) | 14155776;
                    int i211111111116 = i23 >> 9;
                    m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda11111111112, datePickerColorsM1060colors1m2CgY, textStyleFromToken111111, fM1610getHeaderContainerHeightD9Ej5fM111111, composableLambda11111111113, composerStartRestartGroup, i211111111115 | (i211111111116 & 112) | (i211111111116 & 896) | (i211111111116 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda11111111114 = composableLambda;
                    Typography typography111112 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens111112 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken111112 = TypographyKt.fromToken(typography111112, datePickerModalTokens111112.getHeaderHeadlineFont());
                    float fM1610getHeaderContainerHeightD9Ej5fM111112 = datePickerModalTokens111112.m1610getHeaderContainerHeightD9Ej5fM();
                    ComposableLambda composableLambda11111111115 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i211111111117 = ((i23 >> 3) & 14) | 14155776;
                    int i211111111118 = i23 >> 9;
                    m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda11111111114, datePickerColorsM1060colors1m2CgY, textStyleFromToken111112, fM1610getHeaderContainerHeightD9Ej5fM111112, composableLambda11111111115, composerStartRestartGroup, i211111111117 | (i211111111118 & 112) | (i211111111118 & 896) | (i211111111118 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
            }
            i12 |= 24576;
            function5 = function2;
            i19 = i11 & 32;
            if (i19 != 0) {
                if ((458752 & i10) == 0) {
                    function6 = function3;
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z10)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                }
                if ((i12 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda11111111116 = composableLambda;
                    Typography typography111113 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens111113 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken111113 = TypographyKt.fromToken(typography111113, datePickerModalTokens111113.getHeaderHeadlineFont());
                    float fM1610getHeaderContainerHeightD9Ej5fM111113 = datePickerModalTokens111113.m1610getHeaderContainerHeightD9Ej5fM();
                    ComposableLambda composableLambda11111111117 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i211111111119 = ((i23 >> 3) & 14) | 14155776;
                    int i2111111111110 = i23 >> 9;
                    m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda11111111116, datePickerColorsM1060colors1m2CgY, textStyleFromToken111113, fM1610getHeaderContainerHeightD9Ej5fM111113, composableLambda11111111117, composerStartRestartGroup, i211111111119 | (i2111111111110 & 112) | (i2111111111110 & 896) | (i2111111111110 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda11111111118 = composableLambda;
                    Typography typography111114 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens111114 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken111114 = TypographyKt.fromToken(typography111114, datePickerModalTokens111114.getHeaderHeadlineFont());
                    float fM1610getHeaderContainerHeightD9Ej5fM111114 = datePickerModalTokens111114.m1610getHeaderContainerHeightD9Ej5fM();
                    ComposableLambda composableLambda11111111119 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i2111111111111 = ((i23 >> 3) & 14) | 14155776;
                    int i2111111111112 = i23 >> 9;
                    m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda11111111118, datePickerColorsM1060colors1m2CgY, textStyleFromToken111114, fM1610getHeaderContainerHeightD9Ej5fM111114, composableLambda11111111119, composerStartRestartGroup, i2111111111111 | (i2111111111112 & 112) | (i2111111111112 & 896) | (i2111111111112 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function6 = function3;
            i21 = i11 & 64;
            if (i21 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(z10)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
            }
            if ((i12 & 23967451) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = d.f9983p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = d.f9983p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                }
                if (z11) {
                    z12 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                } else {
                    z12 = true;
                    composableLambda = null;
                }
                ComposableLambda composableLambda111111111110 = composableLambda;
                Typography typography111115 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                DatePickerModalTokens datePickerModalTokens111115 = DatePickerModalTokens.INSTANCE;
                TextStyle textStyleFromToken111115 = TypographyKt.fromToken(typography111115, datePickerModalTokens111115.getHeaderHeadlineFont());
                float fM1610getHeaderContainerHeightD9Ej5fM111115 = datePickerModalTokens111115.m1610getHeaderContainerHeightD9Ej5fM();
                ComposableLambda composableLambda111111111111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                int i2111111111113 = ((i23 >> 3) & 14) | 14155776;
                int i2111111111114 = i23 >> 9;
                m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda111111111110, datePickerColorsM1060colors1m2CgY, textStyleFromToken111115, fM1610getHeaderContainerHeightD9Ej5fM111115, composableLambda111111111111, composerStartRestartGroup, i2111111111113 | (i2111111111114 & 112) | (i2111111111114 & 896) | (i2111111111114 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function2ComposableLambda;
                function9 = function2ComposableLambda2;
                datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = d.f9983p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = d.f9983p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                }
                if (z11) {
                    z12 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                } else {
                    z12 = true;
                    composableLambda = null;
                }
                ComposableLambda composableLambda111111111112 = composableLambda;
                Typography typography111116 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                DatePickerModalTokens datePickerModalTokens111116 = DatePickerModalTokens.INSTANCE;
                TextStyle textStyleFromToken111116 = TypographyKt.fromToken(typography111116, datePickerModalTokens111116.getHeaderHeadlineFont());
                float fM1610getHeaderContainerHeightD9Ej5fM111116 = datePickerModalTokens111116.m1610getHeaderContainerHeightD9Ej5fM();
                ComposableLambda composableLambda111111111113 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                int i2111111111115 = ((i23 >> 3) & 14) | 14155776;
                int i2111111111116 = i23 >> 9;
                m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda111111111112, datePickerColorsM1060colors1m2CgY, textStyleFromToken111116, fM1610getHeaderContainerHeightD9Ej5fM111116, composableLambda111111111113, composerStartRestartGroup, i2111111111115 | (i2111111111116 & 112) | (i2111111111116 & 896) | (i2111111111116 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function2ComposableLambda;
                function9 = function2ComposableLambda2;
                datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
        }
        i12 |= 3072;
        function4 = function1;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((i10 & 57344) == 0) {
                function5 = function2;
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            i19 = i11 & 32;
            if (i19 != 0) {
                if ((458752 & i10) == 0) {
                    function6 = function3;
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z10)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                }
                if ((i12 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda111111111114 = composableLambda;
                    Typography typography111117 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens111117 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken111117 = TypographyKt.fromToken(typography111117, datePickerModalTokens111117.getHeaderHeadlineFont());
                    float fM1610getHeaderContainerHeightD9Ej5fM111117 = datePickerModalTokens111117.m1610getHeaderContainerHeightD9Ej5fM();
                    ComposableLambda composableLambda111111111115 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i2111111111117 = ((i23 >> 3) & 14) | 14155776;
                    int i2111111111118 = i23 >> 9;
                    m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda111111111114, datePickerColorsM1060colors1m2CgY, textStyleFromToken111117, fM1610getHeaderContainerHeightD9Ej5fM111117, composableLambda111111111115, composerStartRestartGroup, i2111111111117 | (i2111111111118 & 112) | (i2111111111118 & 896) | (i2111111111118 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = d.f9983p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda111111111116 = composableLambda;
                    Typography typography111118 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens111118 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken111118 = TypographyKt.fromToken(typography111118, datePickerModalTokens111118.getHeaderHeadlineFont());
                    float fM1610getHeaderContainerHeightD9Ej5fM111118 = datePickerModalTokens111118.m1610getHeaderContainerHeightD9Ej5fM();
                    ComposableLambda composableLambda111111111117 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i2111111111119 = ((i23 >> 3) & 14) | 14155776;
                    int i21111111111110 = i23 >> 9;
                    m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda111111111116, datePickerColorsM1060colors1m2CgY, textStyleFromToken111118, fM1610getHeaderContainerHeightD9Ej5fM111118, composableLambda111111111117, composerStartRestartGroup, i2111111111119 | (i21111111111110 & 112) | (i21111111111110 & 896) | (i21111111111110 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function6 = function3;
            i21 = i11 & 64;
            if (i21 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(z10)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
            }
            if ((i12 & 23967451) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = d.f9983p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = d.f9983p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                }
                if (z11) {
                    z12 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                } else {
                    z12 = true;
                    composableLambda = null;
                }
                ComposableLambda composableLambda111111111118 = composableLambda;
                Typography typography111119 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                DatePickerModalTokens datePickerModalTokens111119 = DatePickerModalTokens.INSTANCE;
                TextStyle textStyleFromToken111119 = TypographyKt.fromToken(typography111119, datePickerModalTokens111119.getHeaderHeadlineFont());
                float fM1610getHeaderContainerHeightD9Ej5fM111119 = datePickerModalTokens111119.m1610getHeaderContainerHeightD9Ej5fM();
                ComposableLambda composableLambda111111111119 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                int i21111111111111 = ((i23 >> 3) & 14) | 14155776;
                int i21111111111112 = i23 >> 9;
                m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda111111111118, datePickerColorsM1060colors1m2CgY, textStyleFromToken111119, fM1610getHeaderContainerHeightD9Ej5fM111119, composableLambda111111111119, composerStartRestartGroup, i21111111111111 | (i21111111111112 & 112) | (i21111111111112 & 896) | (i21111111111112 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function2ComposableLambda;
                function9 = function2ComposableLambda2;
                datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = d.f9983p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = d.f9983p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                }
                if (z11) {
                    z12 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                } else {
                    z12 = true;
                    composableLambda = null;
                }
                ComposableLambda composableLambda1111111111110 = composableLambda;
                Typography typography1111110 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                DatePickerModalTokens datePickerModalTokens1111110 = DatePickerModalTokens.INSTANCE;
                TextStyle textStyleFromToken1111110 = TypographyKt.fromToken(typography1111110, datePickerModalTokens1111110.getHeaderHeadlineFont());
                float fM1610getHeaderContainerHeightD9Ej5fM1111110 = datePickerModalTokens1111110.m1610getHeaderContainerHeightD9Ej5fM();
                ComposableLambda composableLambda1111111111111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                int i21111111111113 = ((i23 >> 3) & 14) | 14155776;
                int i21111111111114 = i23 >> 9;
                m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1111111111110, datePickerColorsM1060colors1m2CgY, textStyleFromToken1111110, fM1610getHeaderContainerHeightD9Ej5fM1111110, composableLambda1111111111111, composerStartRestartGroup, i21111111111113 | (i21111111111114 & 112) | (i21111111111114 & 896) | (i21111111111114 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function2ComposableLambda;
                function9 = function2ComposableLambda2;
                datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
        }
        i12 |= 24576;
        function5 = function2;
        i19 = i11 & 32;
        if (i19 != 0) {
            if ((458752 & i10) == 0) {
                function6 = function3;
                if (composerStartRestartGroup.changedInstance(function6)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            i21 = i11 & 64;
            if (i21 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(z10)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
            }
            if ((i12 & 23967451) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = d.f9983p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = d.f9983p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                }
                if (z11) {
                    z12 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                } else {
                    z12 = true;
                    composableLambda = null;
                }
                ComposableLambda composableLambda1111111111112 = composableLambda;
                Typography typography1111111 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                DatePickerModalTokens datePickerModalTokens1111111 = DatePickerModalTokens.INSTANCE;
                TextStyle textStyleFromToken1111111 = TypographyKt.fromToken(typography1111111, datePickerModalTokens1111111.getHeaderHeadlineFont());
                float fM1610getHeaderContainerHeightD9Ej5fM1111111 = datePickerModalTokens1111111.m1610getHeaderContainerHeightD9Ej5fM();
                ComposableLambda composableLambda1111111111113 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                int i21111111111115 = ((i23 >> 3) & 14) | 14155776;
                int i21111111111116 = i23 >> 9;
                m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1111111111112, datePickerColorsM1060colors1m2CgY, textStyleFromToken1111111, fM1610getHeaderContainerHeightD9Ej5fM1111111, composableLambda1111111111113, composerStartRestartGroup, i21111111111115 | (i21111111111116 & 112) | (i21111111111116 & 896) | (i21111111111116 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function2ComposableLambda;
                function9 = function2ComposableLambda2;
                datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = d.f9983p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = d.f9983p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                }
                if (z11) {
                    z12 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
                } else {
                    z12 = true;
                    composableLambda = null;
                }
                ComposableLambda composableLambda1111111111114 = composableLambda;
                Typography typography1111112 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                DatePickerModalTokens datePickerModalTokens1111112 = DatePickerModalTokens.INSTANCE;
                TextStyle textStyleFromToken1111112 = TypographyKt.fromToken(typography1111112, datePickerModalTokens1111112.getHeaderHeadlineFont());
                float fM1610getHeaderContainerHeightD9Ej5fM1111112 = datePickerModalTokens1111112.m1610getHeaderContainerHeightD9Ej5fM();
                ComposableLambda composableLambda1111111111115 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                int i21111111111117 = ((i23 >> 3) & 14) | 14155776;
                int i21111111111118 = i23 >> 9;
                m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1111111111114, datePickerColorsM1060colors1m2CgY, textStyleFromToken1111112, fM1610getHeaderContainerHeightD9Ej5fM1111112, composableLambda1111111111115, composerStartRestartGroup, i21111111111117 | (i21111111111118 & 112) | (i21111111111118 & 896) | (i21111111111118 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function2ComposableLambda;
                function9 = function2ComposableLambda2;
                datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
        }
        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        function6 = function3;
        i21 = i11 & 64;
        if (i21 != 0) {
            i12 |= 1572864;
        } else if ((i10 & 3670016) == 0) {
            if (composerStartRestartGroup.changed(z10)) {
                i22 = 1048576;
            } else {
                i22 = 524288;
            }
            i12 |= i22;
        }
        if ((i10 & 29360128) != 0) {
            i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
        }
        if ((i12 & 23967451) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                }
                if (i15 != 0) {
                    function7 = d.f9983p0;
                } else {
                    function7 = function4;
                }
                if (i17 != 0) {
                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                } else {
                    function2ComposableLambda = function5;
                }
                if (i19 != 0) {
                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                } else {
                    function2ComposableLambda2 = function3;
                }
                if (i21 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i11 & 128) != 0) {
                    i23 = i12 & (-29360129);
                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                } else {
                    i23 = i12;
                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                }
            } else {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                }
                if (i15 != 0) {
                    function7 = d.f9983p0;
                } else {
                    function7 = function4;
                }
                if (i17 != 0) {
                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                } else {
                    function2ComposableLambda = function5;
                }
                if (i19 != 0) {
                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                } else {
                    function2ComposableLambda2 = function3;
                }
                if (i21 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i11 & 128) != 0) {
                    i23 = i12 & (-29360129);
                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                } else {
                    i23 = i12;
                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
            }
            if (z11) {
                z12 = true;
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
            } else {
                z12 = true;
                composableLambda = null;
            }
            ComposableLambda composableLambda1111111111116 = composableLambda;
            Typography typography1111113 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
            DatePickerModalTokens datePickerModalTokens1111113 = DatePickerModalTokens.INSTANCE;
            TextStyle textStyleFromToken1111113 = TypographyKt.fromToken(typography1111113, datePickerModalTokens1111113.getHeaderHeadlineFont());
            float fM1610getHeaderContainerHeightD9Ej5fM1111113 = datePickerModalTokens1111113.m1610getHeaderContainerHeightD9Ej5fM();
            ComposableLambda composableLambda1111111111117 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
            int i21111111111119 = ((i23 >> 3) & 14) | 14155776;
            int i211111111111110 = i23 >> 9;
            m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1111111111116, datePickerColorsM1060colors1m2CgY, textStyleFromToken1111113, fM1610getHeaderContainerHeightD9Ej5fM1111113, composableLambda1111111111117, composerStartRestartGroup, i21111111111119 | (i211111111111110 & 112) | (i211111111111110 & 896) | (i211111111111110 & 57344));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function8 = function2ComposableLambda;
            function9 = function2ComposableLambda2;
            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
            modifier3 = modifier2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                }
                if (i15 != 0) {
                    function7 = d.f9983p0;
                } else {
                    function7 = function4;
                }
                if (i17 != 0) {
                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                } else {
                    function2ComposableLambda = function5;
                }
                if (i19 != 0) {
                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                } else {
                    function2ComposableLambda2 = function3;
                }
                if (i21 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i11 & 128) != 0) {
                    i23 = i12 & (-29360129);
                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                } else {
                    i23 = i12;
                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                }
            } else {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                }
                if (i15 != 0) {
                    function7 = d.f9983p0;
                } else {
                    function7 = function4;
                }
                if (i17 != 0) {
                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 448469326, true, new e(state, i12));
                } else {
                    function2ComposableLambda = function5;
                }
                if (i19 != 0) {
                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1578326756, true, new f(state, datePickerFormatter2, i12));
                } else {
                    function2ComposableLambda2 = function3;
                }
                if (i21 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i11 & 128) != 0) {
                    i23 = i12 & (-29360129);
                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                } else {
                    i23 = i12;
                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1765097918, i23, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
            }
            if (z11) {
                z12 = true;
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1702543532, true, new g(state, i23));
            } else {
                z12 = true;
                composableLambda = null;
            }
            ComposableLambda composableLambda1111111111118 = composableLambda;
            Typography typography1111114 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
            DatePickerModalTokens datePickerModalTokens1111114 = DatePickerModalTokens.INSTANCE;
            TextStyle textStyleFromToken1111114 = TypographyKt.fromToken(typography1111114, datePickerModalTokens1111114.getHeaderHeadlineFont());
            float fM1610getHeaderContainerHeightD9Ej5fM1111114 = datePickerModalTokens1111114.m1610getHeaderContainerHeightD9Ej5fM();
            ComposableLambda composableLambda1111111111119 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 173769747, z12, new h(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
            int i211111111111111 = ((i23 >> 3) & 14) | 14155776;
            int i211111111111112 = i23 >> 9;
            m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1111111111118, datePickerColorsM1060colors1m2CgY, textStyleFromToken1111114, fM1610getHeaderContainerHeightD9Ej5fM1111114, composableLambda1111111111119, composerStartRestartGroup, i211111111111111 | (i211111111111112 & 112) | (i211111111111112 & 896) | (i211111111111112 & 57344));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function8 = function2ComposableLambda;
            function9 = function2ComposableLambda2;
            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
            modifier3 = modifier2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new i(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: DatePickerHeader-pc5RIQQ, reason: not valid java name */
    public static final void m1064DatePickerHeaderpc5RIQQ(@NotNull Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, long j10, long j11, float f6, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-996037719);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(j10) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(j11) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(f6) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(content) ? 131072 : 65536;
        }
        if ((374491 & i11) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-996037719, i11, -1, "androidx.compose.material3.DatePickerHeader (DatePicker.kt:1228)");
            }
            Modifier modifierThen = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null).then(function2 != null ? SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, f6, 1, null) : Modifier.INSTANCE);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierThen);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion, composerM2074constructorimpl, measurePolicyColumnMeasurePolicy, composerM2074constructorimpl, density));
            ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1127524835);
            if (function2 != null) {
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(j10))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1005061498, true, new j(i11, function2)), composerStartRestartGroup, 56);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(j11))}, content, composerStartRestartGroup, ((i11 >> 12) & 112) | 8);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new k(modifier, function2, j10, j11, f6, content, i10));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: DisplayModeToggleButton-tER2X8s, reason: not valid java name */
    public static final void m1065DisplayModeToggleButtontER2X8s(@NotNull Modifier modifier, int i10, @NotNull Function1<? super DisplayMode, Unit> onDisplayModeChange, @Nullable Composer composer, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(onDisplayModeChange, "onDisplayModeChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(1393846115);
        if ((i11 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(i10) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onDisplayModeChange) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1393846115, i12, -1, "androidx.compose.material3.DisplayModeToggleButton (DatePicker.kt:1065)");
            }
            if (DisplayMode.m1076equalsimpl0(i10, DisplayMode.INSTANCE.m1081getPickerjFl4v0())) {
                composerStartRestartGroup.startReplaceableGroup(-1814971324);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged = composerStartRestartGroup.changed(onDisplayModeChange);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new l(onDisplayModeChange);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                IconButtonKt.IconButton((Function0) objRememberedValue, modifier, false, null, null, ComposableSingletons$DatePickerKt.INSTANCE.m1034getLambda1$material3_release(), composerStartRestartGroup, ((i12 << 3) & 112) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1814971040);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged2 = composerStartRestartGroup.changed(onDisplayModeChange);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new m(onDisplayModeChange);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                IconButtonKt.IconButton((Function0) objRememberedValue2, modifier, false, null, null, ComposableSingletons$DatePickerKt.INSTANCE.m1035getLambda2$material3_release(), composerStartRestartGroup, ((i12 << 3) & 112) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new n(modifier, i10, onDisplayModeChange, i11));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Month(@NotNull CalendarMonth month, @NotNull Function1<? super Long, Unit> onDateSelected, @NotNull CalendarDate today, @NotNull StateData stateData, boolean z10, @NotNull Function1<? super Long, Boolean> dateValidator, @NotNull DatePickerFormatter dateFormatter, @NotNull DatePickerColors colors, @Nullable Composer composer, int i10) {
        int i11;
        Modifier modifierDrawWithContent;
        Composer composer2;
        Intrinsics.checkNotNullParameter(month, "month");
        Intrinsics.checkNotNullParameter(onDateSelected, "onDateSelected");
        Intrinsics.checkNotNullParameter(today, "today");
        Intrinsics.checkNotNullParameter(stateData, "stateData");
        Intrinsics.checkNotNullParameter(dateValidator, "dateValidator");
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1561090804);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(month) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onDateSelected) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(today) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(stateData) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(dateValidator) ? 131072 : 65536;
        }
        if ((3670016 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(dateFormatter) ? 1048576 : 524288;
        }
        if ((29360128 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(colors) ? 8388608 : 4194304;
        }
        int i12 = i11;
        if ((23967451 & i12) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1561090804, i12, -1, "androidx.compose.material3.Month (DatePicker.kt:1404)");
            }
            Boolean boolValueOf = Boolean.valueOf(z10);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(boolValueOf);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new v(z10, month, stateData));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            State state = (State) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-2019479227);
            if (z10) {
                Modifier.Companion companion = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                boolean zChanged2 = composerStartRestartGroup.changed(state) | composerStartRestartGroup.changed(colors);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new u(state, colors);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                modifierDrawWithContent = DrawModifierKt.drawWithContent(companion, (Function1) objRememberedValue2);
            } else {
                modifierDrawWithContent = Modifier.INSTANCE;
            }
            Modifier modifier = modifierDrawWithContent;
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getDateLabelTextFont()), ComposableLambdaKt.composableLambda(composer2, -1776200645, true, new s(modifier, month, today, stateData.getSelectedStartDate(), stateData.getSelectedEndDate(), z10, i12, dateFormatter, CalendarModel_androidKt.defaultLocale(composerStartRestartGroup, 0), onDateSelected, colors, stateData, dateValidator)), composer2, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new t(month, onDateSelected, today, stateData, z10, dateValidator, dateFormatter, colors, i10));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void WeekDays(@NotNull DatePickerColors colors, @NotNull CalendarModel calendarModel, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(calendarModel, "calendarModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1849465391);
        int i11 = (i10 & 14) == 0 ? (composerStartRestartGroup.changed(colors) ? 4 : 2) | i10 : i10;
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(calendarModel) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1849465391, i10, -1, "androidx.compose.material3.WeekDays (DatePicker.kt:1354)");
            }
            int firstDayOfWeek = calendarModel.getFirstDayOfWeek();
            List<Pair<String, String>> weekdayNames = calendarModel.getWeekdayNames();
            ArrayList arrayList = new ArrayList();
            int i12 = firstDayOfWeek - 1;
            int size = weekdayNames.size();
            for (int i13 = i12; i13 < size; i13++) {
                arrayList.add(weekdayNames.get(i13));
            }
            for (int i14 = 0; i14 < i12; i14++) {
                arrayList.add(weekdayNames.get(i14));
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(colors.getWeekdayContentColor()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1445541615, true, new a0(arrayList)), composerStartRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b0(colors, calendarModel, i10));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(Function1<? super Long, Unit> function1, StateData stateData, LazyListState lazyListState, DatePickerFormatter datePickerFormatter, Function1<? super Long, Boolean> function2, DatePickerColors datePickerColors, Composer composer, int i10) {
        Composer composer2;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1933363608);
        int i11 = (i10 & 14) == 0 ? (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i10 : i10;
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(stateData) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(lazyListState) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(datePickerFormatter) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(datePickerColors) ? 131072 : 65536;
        }
        int i12 = i11;
        if ((374491 & i12) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1933363608, i12, -1, "androidx.compose.material3.HorizontalMonthsList (DatePicker.kt:1273)");
            }
            CalendarDate today = stateData.getCalendarModel().getToday();
            IntRange yearRange = stateData.getYearRange();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(yearRange);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = stateData.getCalendarModel().getMonth(stateData.getYearRange().getFirst(), 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CalendarMonth calendarMonth = (CalendarMonth) objRememberedValue;
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, o.f10031p0, 1, null);
            int i13 = (i12 >> 6) & 14;
            boolean zChanged2 = false;
            FlingBehavior flingBehaviorRememberSnapFlingBehavior$material3_release = DatePickerDefaults.INSTANCE.rememberSnapFlingBehavior$material3_release(lazyListState, null, composerStartRestartGroup, i13 | BluetoothState.REQUEST_CONNECT_DEVICE, 2);
            Object[] objArr = {stateData, calendarMonth, function1, today, function2, datePickerFormatter, datePickerColors};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            for (int i14 = 0; i14 < 7; i14++) {
                zChanged2 |= composerStartRestartGroup.changed(objArr[i14]);
            }
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                composer2 = composerStartRestartGroup;
                p pVar = new p(stateData, calendarMonth, function1, today, function2, datePickerFormatter, datePickerColors, i12);
                composer2.updateRememberedValue(pVar);
                objRememberedValue2 = pVar;
            } else {
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceableGroup();
            composer3 = composer2;
            LazyDslKt.LazyRow(modifierSemantics$default, lazyListState, null, false, null, null, flingBehaviorRememberSnapFlingBehavior$material3_release, false, (Function1) objRememberedValue2, composer3, (i12 >> 3) & 112, 188);
            composer3.startReplaceableGroup(511388516);
            boolean zChanged3 = composer3.changed(lazyListState) | composer3.changed(stateData);
            Object objRememberedValue3 = composer3.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new q(lazyListState, stateData, null);
                composer3.updateRememberedValue(objRememberedValue3);
            }
            composer3.endReplaceableGroup();
            EffectsKt.LaunchedEffect(lazyListState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer3, i13 | 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new r(function1, stateData, lazyListState, datePickerFormatter, function2, datePickerColors, i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void access$DatePickerContent(StateData stateData, DatePickerFormatter datePickerFormatter, Function1 function1, DatePickerColors datePickerColors, Composer composer, int i10) {
        int i11;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1512850300);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(stateData) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(datePickerFormatter) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(datePickerColors) ? 2048 : 1024;
        }
        int i12 = i11;
        if ((i12 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1512850300, i12, -1, "androidx.compose.material3.DatePickerContent (DatePicker.kt:1124)");
            }
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(stateData.getDisplayedMonthIndex(), 0, composerStartRestartGroup, 0, 2);
            Object objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.getEmpty()) {
                objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(stateData);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new l0.n0(stateData);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function1 function2 = (Function1) objRememberedValue;
            MutableState mutableState = (MutableState) RememberSaveableKt.m2165rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) l0.o0.f82749p0, composerStartRestartGroup, 3080, 6);
            Locale localeDefaultLocale = CalendarModel_androidKt.defaultLocale(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyA = androidx.camera.core.impl.v.a(companion3, top, composerStartRestartGroup, 0, -1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion4, composerM2074constructorimpl, measurePolicyA, composerM2074constructorimpl, density));
            ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion4, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f6 = f9957c;
            Modifier modifierM298paddingVpY3zN4$default = PaddingKt.m298paddingVpY3zN4$default(companion2, f6, 0.0f, 2, null);
            boolean canScrollForward = lazyListStateRememberLazyListState.getCanScrollForward();
            boolean canScrollBackward = lazyListStateRememberLazyListState.getCanScrollBackward();
            boolean zBooleanValue = ((Boolean) mutableState.getValue()).booleanValue();
            String monthYear$material3_release = datePickerFormatter.formatMonthYear$material3_release(stateData.getDisplayedMonth(), stateData.getCalendarModel(), localeDefaultLocale);
            if (monthYear$material3_release == null) {
                monthYear$material3_release = Constant.DASH_STRING;
            }
            l0.f0 f0Var = new l0.f0(lazyListStateRememberLazyListState, coroutineScope);
            l0.h0 h0Var = new l0.h0(lazyListStateRememberLazyListState, coroutineScope);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new l0.i0(mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            b(modifierM298paddingVpY3zN4$default, canScrollForward, canScrollBackward, zBooleanValue, monthYear$material3_release, f0Var, h0Var, (Function0) objRememberedValue2, composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion3, false, composer2, 0, -1323940314);
            Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion2);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            composer2.disableReusing();
            Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composer2);
            Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion4, composerM2074constructorimpl2, measurePolicyC, composerM2074constructorimpl2, density2));
            ai.a.j(0, function3MaterializerOf2, androidx.appcompat.widget.g0.b(companion4, composerM2074constructorimpl2, viewConfiguration2, composer2, composer2), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM298paddingVpY3zN4$default2 = PaddingKt.m298paddingVpY3zN4$default(companion2, f6, 0.0f, 2, null);
            composer2.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyA2 = androidx.camera.core.impl.v.a(companion3, arrangement.getTop(), composer2, 0, -1323940314);
            Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierM298paddingVpY3zN4$default2);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            composer2.disableReusing();
            Composer composerM2074constructorimpl3 = Updater.m2074constructorimpl(composer2);
            Updater.m2081setimpl(composerM2074constructorimpl3, layoutDirection3, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion4, composerM2074constructorimpl3, measurePolicyA2, composerM2074constructorimpl3, density3));
            ai.a.j(0, function3MaterializerOf3, androidx.appcompat.widget.g0.b(companion4, composerM2074constructorimpl3, viewConfiguration3, composer2, composer2), composer2, 2058660585);
            WeekDays(datePickerColors, stateData.getCalendarModel(), composer2, (i12 >> 9) & 14);
            int i13 = i12 << 6;
            a(function2, stateData, lazyListStateRememberLazyListState, datePickerFormatter, function1, datePickerColors, composer2, ((i12 << 3) & 112) | (i13 & 7168) | (57344 & i13) | (i13 & 458752));
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            AnimatedVisibilityKt.AnimatedVisibility(((Boolean) mutableState.getValue()).booleanValue(), ClipKt.clipToBounds(companion2), EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.6f, 1, null)), EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), (String) null, ComposableLambdaKt.composableLambda(composer2, 760161496, true, new androidx.compose.material3.c0(datePickerColors, stateData, i12, coroutineScope, mutableState, lazyListStateRememberLazyListState)), composer2, 200112, 16);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new l0.m0(stateData, datePickerFormatter, function1, datePickerColors, i10));
    }

    public static final void access$Day(Modifier modifier, boolean z10, Function0 function0, boolean z11, boolean z12, boolean z13, boolean z14, String str, DatePickerColors datePickerColors, Function2 function2, Composer composer, int i10) {
        int i11;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1434777861);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(z11) ? 2048 : 1024;
        }
        if ((i10 & 57344) == 0) {
            i11 |= composerStartRestartGroup.changed(z12) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(z13) ? 131072 : 65536;
        }
        if ((3670016 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(z14) ? 1048576 : 524288;
        }
        if ((29360128 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(str) ? 8388608 : 4194304;
        }
        if ((234881024 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(datePickerColors) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((1879048192 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function2) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        int i12 = i11;
        if ((1533916891 & i12) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1434777861, i12, -1, "androidx.compose.material3.Day (DatePicker.kt:1570)");
            }
            Modifier modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier);
            DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.INSTANCE;
            Modifier modifierM329requiredSizeVpY3zN4 = SizeKt.m329requiredSizeVpY3zN4(modifierMinimumInteractiveComponentSize, datePickerModalTokens.m1608getDateStateLayerWidthD9Ej5fM(), datePickerModalTokens.m1607getDateStateLayerHeightD9Ej5fM());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(str);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new l0.p0(str);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierSemantics = SemanticsModifierKt.semantics(modifierM329requiredSizeVpY3zN4, true, (Function1) objRememberedValue);
            Shape shape = ShapesKt.toShape(datePickerModalTokens.getDateContainerShape(), composerStartRestartGroup, 6);
            int i13 = i12 >> 3;
            int i14 = i13 & 14;
            int i15 = i12 >> 15;
            long jM2518unboximpl = datePickerColors.dayContainerColor$material3_release(z10, z12, z11, composerStartRestartGroup, i14 | ((i12 >> 9) & 112) | (i13 & 896) | (i15 & 7168)).getValue().m2518unboximpl();
            int i16 = (i15 & 14) | (i12 & 112);
            int i17 = i12 >> 12;
            int i18 = i13 & 7168;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m1330Surfaced85dljk(z10, (Function0<Unit>) function0, modifierSemantics, z12, shape, jM2518unboximpl, datePickerColors.dayContentColor$material3_release(z13, z10, z14, z12, composerStartRestartGroup, i16 | (i17 & 896) | i18 | (i17 & 57344)).getValue().m2518unboximpl(), 0.0f, 0.0f, (!z13 || z10) ? null : BorderStrokeKt.m142BorderStrokecXLIe8U(datePickerModalTokens.m1609getDateTodayContainerOutlineWidthD9Ej5fM(), datePickerColors.getTodayDateBorderColor()), (MutableInteractionSource) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2031780827, true, new l0.q0(i12, function2)), composer2, i14 | (i13 & 112) | i18, 48, 1408);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new l0.r0(modifier, z10, function0, z11, z12, z13, z14, str, datePickerColors, function2, i10));
    }

    public static final void access$SwitchableDateEntryContent(DatePickerState datePickerState, DatePickerFormatter datePickerFormatter, Function1 function1, DatePickerColors datePickerColors, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(1613036224);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(datePickerState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(datePickerFormatter) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(datePickerColors) ? 2048 : 1024;
        }
        int i12 = i11;
        if ((i12 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1613036224, i12, -1, "androidx.compose.material3.SwitchableDateEntryContent (DatePicker.kt:1093)");
            }
            int iM1067getDisplayModejFl4v0 = datePickerState.m1067getDisplayModejFl4v0();
            CrossfadeKt.Crossfade(DisplayMode.m1073boximpl(iM1067getDisplayModejFl4v0), SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, l0.s0.f82856p0, 1, null), AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1854706084, true, new m0(datePickerState, datePickerFormatter, function1, datePickerColors, i12)), composerStartRestartGroup, 24960, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new l0.t0(datePickerState, datePickerFormatter, function1, datePickerColors, i10));
    }

    public static final void access$Year(Modifier modifier, boolean z10, boolean z11, Function0 function0, String str, DatePickerColors datePickerColors, Function2 function2, Composer composer, int i10) {
        int i11;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1441573940);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(z11) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(str) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(datePickerColors) ? 131072 : 65536;
        }
        if ((3670016 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
        }
        int i12 = i11;
        if ((2995931 & i12) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1441573940, i12, -1, "androidx.compose.material3.Year (DatePicker.kt:1716)");
            }
            Boolean boolValueOf = Boolean.valueOf(z11);
            Boolean boolValueOf2 = Boolean.valueOf(z10);
            int i13 = i12 >> 6;
            int i14 = (i13 & 14) | (i12 & 112);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(boolValueOf) | composerStartRestartGroup.changed(boolValueOf2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = (!z11 || z10) ? null : BorderStrokeKt.m142BorderStrokecXLIe8U(DatePickerModalTokens.INSTANCE.m1609getDateTodayContainerOutlineWidthD9Ej5fM(), datePickerColors.getTodayDateBorderColor());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            BorderStroke borderStroke = (BorderStroke) objRememberedValue;
            int i15 = i12 >> 12;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(str);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new l0.u0(str);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i16 = (i12 >> 3) & 14;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m1330Surfaced85dljk(z10, (Function0<Unit>) function0, SemanticsModifierKt.semantics(modifier, true, (Function1) objRememberedValue2), false, ShapesKt.toShape(DatePickerModalTokens.INSTANCE.getSelectionYearStateLayerShape(), composerStartRestartGroup, 6), datePickerColors.yearContainerColor$material3_release(z10, composerStartRestartGroup, i16 | (i15 & 112)).getValue().m2518unboximpl(), datePickerColors.yearContentColor$material3_release(z11, z10, composerStartRestartGroup, ((i12 >> 9) & 896) | i14).getValue().m2518unboximpl(), 0.0f, 0.0f, borderStroke, (MutableInteractionSource) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -68753950, true, new l0.v0(i12, function2)), composerStartRestartGroup, i16 | (i13 & 112), 48, 1416);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new l0.w0(modifier, z10, z11, function0, str, datePickerColors, function2, i10));
    }

    public static final void access$YearPicker(Modifier modifier, Function1 function1, DatePickerColors datePickerColors, StateData stateData, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1038904873);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(datePickerColors) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(stateData) ? 2048 : 1024;
        }
        int i12 = i11;
        if ((i12 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1038904873, i12, -1, "androidx.compose.material3.YearPicker (DatePicker.kt:1628)");
            }
            TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getSelectionYearLabelTextFont()), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -145469688, true, new q0(i12, datePickerColors, stateData, modifier, function1)), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new l0.f1(i10, datePickerColors, stateData, modifier, function1));
    }

    public static final String access$dayContentDescription(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Composer composer, int i10) {
        composer.startReplaceableGroup(502032503);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(502032503, i10, -1, "androidx.compose.material3.dayContentDescription (DatePicker.kt:1538)");
        }
        StringBuilder sb2 = new StringBuilder();
        composer.startReplaceableGroup(-852204210);
        if (z10) {
            if (z12) {
                composer.startReplaceableGroup(-852204120);
                sb2.append(Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1293getDateRangePickerStartHeadlineadMyvUU(), composer, 6));
                composer.endReplaceableGroup();
            } else if (z13) {
                composer.startReplaceableGroup(-852203980);
                sb2.append(Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1290getDateRangePickerEndHeadlineadMyvUU(), composer, 6));
                composer.endReplaceableGroup();
            } else if (z14) {
                composer.startReplaceableGroup(-852203842);
                sb2.append(Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1289getDateRangePickerDayInRangeadMyvUU(), composer, 6));
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-852203741);
                composer.endReplaceableGroup();
            }
        }
        composer.endReplaceableGroup();
        if (z11) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1285getDatePickerTodayDescriptionadMyvUU(), composer, 6));
        }
        String string = sb2.length() == 0 ? null : sb2.toString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return string;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(Modifier modifier, boolean z10, boolean z11, boolean z12, String str, Function0<Unit> function0, Function0<Unit> function1, Function0<Unit> function2, Composer composer, int i10) {
        int i11;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1127095896);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(z11) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(z12) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(str) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if ((3670016 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function1) ? 1048576 : 524288;
        }
        if ((29360128 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
        }
        int i12 = i11;
        if ((23967451 & i12) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1127095896, i12, -1, "androidx.compose.material3.MonthsNavigation (DatePicker.kt:1765)");
            }
            Modifier modifierM324requiredHeight3ABfNKs = SizeKt.m324requiredHeight3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), f9956b);
            Arrangement.Horizontal start = z12 ? Arrangement.INSTANCE.getStart() : Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composerStartRestartGroup, 48);
            Density density = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM324requiredHeight3ABfNKs);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl, measurePolicyRowMeasurePolicy, composerM2074constructorimpl, density));
            ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            c(function2, z12, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1156508456, true, new w(str, i12)), composerStartRestartGroup, ((i12 >> 21) & 14) | 3072 | ((i12 >> 6) & 112), 4);
            composerStartRestartGroup.startReplaceableGroup(979007906);
            if (z12) {
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion.getTop(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion3);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl2, measurePolicyRowMeasurePolicy2, composerM2074constructorimpl2, density2));
                function3MaterializerOf2.invoke(androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                boolean z13 = composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                composer2 = composerStartRestartGroup;
                IconButtonKt.IconButton(function1, null, z11, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1143715416, true, new x(z13)), composer2, ((i12 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i12 & 896), 26);
                IconButtonKt.IconButton(function0, null, z10, null, null, ComposableLambdaKt.composableLambda(composer2, 1336532191, true, new y(z13)), composer2, ((i12 >> 15) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i12 << 3) & 896), 26);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
            }
            if (androidx.databinding.e.e(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new z(modifier, z10, z11, z12, str, function0, function1, function2, i10));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void c(Function0<Unit> function0, boolean z10, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        int i14;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(409654418);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(z10) ? 32 : 16;
        }
        int i15 = i11 & 4;
        if (i15 == 0) {
            if ((i10 & 896) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            i14 = i12;
            if ((i14 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(409654418, i14, -1, "androidx.compose.material3.YearPickerMenuButton (DatePicker.kt:1830)");
                }
                ButtonKt.TextButton(function0, modifier3, false, RoundedCornerShapeKt.getCircleShape(), ButtonDefaults.INSTANCE.m939textButtonColorsro_MJ88(0L, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m968getOnSurfaceVariant0d7_KjU(), 0L, 0L, composerStartRestartGroup, 24576, 13), null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1899012021, true, new c0(function2, i14, z10)), composerStartRestartGroup, 807075840 | (i14 & 14) | ((i14 >> 3) & 112), 388);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d0(function0, z10, modifier3, function2, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        modifier2 = modifier;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (composerStartRestartGroup.changedInstance(function2)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        i14 = i12;
        if ((i14 & 5851) == 1170) {
            if (i15 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(409654418, i14, -1, "androidx.compose.material3.YearPickerMenuButton (DatePicker.kt:1830)");
            }
            ButtonKt.TextButton(function0, modifier3, false, RoundedCornerShapeKt.getCircleShape(), ButtonDefaults.INSTANCE.m939textButtonColorsro_MJ88(0L, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m968getOnSurfaceVariant0d7_KjU(), 0L, 0L, composerStartRestartGroup, 24576, 13), null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1899012021, true, new c0(function2, i14, z10)), composerStartRestartGroup, 807075840 | (i14 & 14) | ((i14 >> 3) & 112), 388);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i15 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(409654418, i14, -1, "androidx.compose.material3.YearPickerMenuButton (DatePicker.kt:1830)");
            }
            ButtonKt.TextButton(function0, modifier3, false, RoundedCornerShapeKt.getCircleShape(), ButtonDefaults.INSTANCE.m939textButtonColorsro_MJ88(0L, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m968getOnSurfaceVariant0d7_KjU(), 0L, 0L, composerStartRestartGroup, 24576, 13), null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1899012021, true, new c0(function2, i14, z10)), composerStartRestartGroup, 807075840 | (i14 & 14) | ((i14 >> 3) & 112), 388);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d0(function0, z10, modifier3, function2, i10, i11));
    }

    public static final float getDatePickerHorizontalPadding() {
        return f9957c;
    }

    @NotNull
    public static final PaddingValues getDatePickerModeTogglePadding() {
        return f9958d;
    }

    public static final float getMonthYearHeight() {
        return f9956b;
    }

    public static final float getRecommendedSizeForAccessibility() {
        return f9955a;
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    /* JADX INFO: renamed from: rememberDatePickerState-NVmSL94, reason: not valid java name */
    public static final DatePickerState m1066rememberDatePickerStateNVmSL94(@Nullable Long l6, @Nullable Long l7, @Nullable IntRange intRange, int i10, @Nullable Composer composer, int i11, int i12) {
        composer.startReplaceableGroup(1574672255);
        if ((i12 & 1) != 0) {
            l6 = null;
        }
        if ((i12 & 2) != 0) {
            l7 = l6;
        }
        if ((i12 & 4) != 0) {
            intRange = DatePickerDefaults.INSTANCE.getYearRange();
        }
        if ((i12 & 8) != 0) {
            i10 = DisplayMode.INSTANCE.m1081getPickerjFl4v0();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1574672255, i11, -1, "androidx.compose.material3.rememberDatePickerState (DatePicker.kt:219)");
        }
        DatePickerState datePickerState = (DatePickerState) RememberSaveableKt.m2165rememberSaveable(new Object[0], (Saver) DatePickerState.INSTANCE.Saver(), (String) null, (Function0) new e0(l6, l7, intRange, i10), composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return datePickerState;
    }

    @NotNull
    public static final String toLocalString(int i10) {
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        integerInstance.setGroupingUsed(false);
        String str = integerInstance.format(Integer.valueOf(i10));
        Intrinsics.checkNotNullExpressionValue(str, "formatter.format(this)");
        return str;
    }

    @Nullable
    public static final Object updateDisplayedMonth(@NotNull LazyListState lazyListState, @NotNull StateData stateData, @NotNull Continuation<? super Unit> continuation) {
        Object objCollect = SnapshotStateKt.snapshotFlow(new f0(lazyListState)).collect(new g0(lazyListState, stateData), continuation);
        return objCollect == ek.a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
