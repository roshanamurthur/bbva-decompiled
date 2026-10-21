package androidx.compose.material3;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.material3.tokens.TimePickerTokens;
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
import androidx.compose.runtime.ReadOnlyComposable;
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
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import l0.l5;
import l0.m5;
import l0.y5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a;\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a3\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a3\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0018\u0010\u0017\u001a'\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a-\u0010!\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u000eH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, d2 = {"Landroidx/compose/material3/TimePickerState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/TimePickerColors;", "colors", "Landroidx/compose/material3/TimePickerLayoutType;", "layoutType", "", "TimePicker-mT9BvqQ", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ILandroidx/compose/runtime/Composer;II)V", "TimePicker", "TimeInput", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V", "", "initialHour", "initialMinute", "", "is24Hour", "rememberTimePickerState", "(IIZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TimePickerState;", "autoSwitchToMinute", "VerticalTimePicker", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;II)V", "HorizontalTimePicker", "ClockFace", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/material3/Selection;", "selection", "number", "", "numberContentDescription-YKJpE6Y", "(IZILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "numberContentDescription", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 11 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 12 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 13 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 14 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 15 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1672:1\n67#2,3:1673\n66#2:1676\n460#2,13:1702\n473#2,3:1716\n460#2,13:1740\n473#2,3:1754\n36#2:1759\n36#2:1766\n460#2,13:1792\n460#2,13:1825\n473#2,3:1839\n473#2,3:1844\n460#2,13:1869\n460#2,13:1902\n473#2,3:1916\n473#2,3:1921\n460#2,13:1946\n460#2,13:1979\n473#2,3:1993\n473#2,3:1998\n25#2:2003\n25#2:2010\n36#2:2017\n456#2,11:2037\n36#2:2048\n36#2:2055\n467#2,3:2062\n36#2:2066\n460#2,13:2093\n473#2,3:2107\n25#2:2116\n36#2:2127\n25#2:2137\n25#2:2148\n36#2:2159\n460#2,13:2184\n36#2:2198\n473#2,3:2205\n25#2:2210\n25#2:2217\n460#2,13:2243\n460#2,13:2276\n36#2:2290\n473#2,3:2298\n473#2,3:2303\n67#2,3:2308\n66#2:2311\n456#2,14:2331\n1114#3,6:1677\n1114#3,6:1760\n1114#3,6:1767\n1114#3,6:2004\n1114#3,6:2011\n1114#3,6:2018\n1114#3,6:2049\n1114#3,6:2056\n1114#3,6:2067\n1114#3,3:2117\n1117#3,3:2123\n1114#3,6:2128\n1114#3,6:2138\n1114#3,3:2149\n1117#3,3:2155\n1114#3,6:2160\n1114#3,6:2199\n1114#3,6:2211\n1114#3,6:2218\n1114#3,6:2291\n1114#3,6:2312\n74#4,6:1683\n80#4:1715\n84#4:1720\n73#4,7:1849\n80#4:1882\n84#4:1925\n74#4,6:2224\n80#4:2256\n84#4:2307\n75#5:1689\n76#5,11:1691\n89#5:1719\n75#5:1727\n76#5,11:1729\n89#5:1757\n75#5:1779\n76#5,11:1781\n75#5:1812\n76#5,11:1814\n89#5:1842\n89#5:1847\n75#5:1856\n76#5,11:1858\n75#5:1889\n76#5,11:1891\n89#5:1919\n89#5:1924\n75#5:1933\n76#5,11:1935\n75#5:1966\n76#5,11:1968\n89#5:1996\n89#5:2001\n74#5:2024\n75#5,11:2026\n88#5:2065\n75#5:2080\n76#5,11:2082\n89#5:2110\n75#5:2171\n76#5,11:2173\n89#5:2208\n75#5:2230\n76#5,11:2232\n75#5:2263\n76#5,11:2265\n89#5:2301\n89#5:2306\n74#5:2318\n75#5,11:2320\n88#5:2345\n76#6:1690\n76#6:1728\n76#6:1780\n76#6:1813\n76#6:1857\n76#6:1890\n76#6:1934\n76#6:1967\n76#6:2025\n76#6:2074\n76#6:2081\n76#6:2135\n76#6:2172\n76#6:2231\n76#6:2264\n76#6:2297\n76#6:2319\n75#7,6:1721\n81#7:1753\n85#7:1758\n75#7,6:1773\n81#7:1805\n85#7:1848\n74#7,7:1926\n81#7:1959\n85#7:2002\n67#8,6:1806\n73#8:1838\n77#8:1843\n67#8,6:1883\n73#8:1915\n77#8:1920\n67#8,6:1960\n73#8:1992\n77#8:1997\n68#8,5:2075\n73#8:2106\n77#8:2111\n68#8,5:2166\n73#8:2197\n77#8:2209\n67#8,6:2257\n73#8:2289\n77#8:2302\n154#9:2073\n154#9:2357\n154#9:2358\n154#9:2359\n154#9:2360\n154#9:2361\n154#9:2362\n154#9:2363\n154#9:2364\n154#9:2365\n154#9:2370\n474#10,4:2112\n478#10,2:2120\n482#10:2126\n474#10,4:2144\n478#10,2:2152\n482#10:2158\n474#11:2122\n474#11:2154\n135#12:2134\n135#12:2346\n1#13:2136\n76#14:2347\n76#14:2348\n102#14,2:2349\n76#14:2351\n102#14,2:2352\n76#14:2354\n102#14,2:2355\n1549#15:2366\n1620#15,3:2367\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt\n*L\n445#1:1673,3\n445#1:1676\n667#1:1702,13\n667#1:1716,3\n682#1:1740,13\n682#1:1754,3\n698#1:1759\n701#1:1766\n705#1:1792,13\n786#1:1825,13\n786#1:1839,3\n705#1:1844,3\n802#1:1869,13\n805#1:1902,13\n805#1:1916,3\n802#1:1921,3\n821#1:1946,13\n824#1:1979,13\n824#1:1993,3\n821#1:1998,3\n883#1:2003\n926#1:2010\n981#1:2017\n979#1:2037,11\n993#1:2048\n1009#1:2055\n979#1:2062,3\n1033#1:2066\n1056#1:2093,13\n1056#1:2107,3\n1088#1:2116\n1091#1:2127\n1292#1:2137\n1293#1:2148\n1313#1:2159\n1308#1:2184,13\n1324#1:2198\n1308#1:2205,3\n1396#1:2210\n1397#1:2217\n1404#1:2243,13\n1423#1:2276,13\n1430#1:2290\n1423#1:2298,3\n1404#1:2303,3\n1488#1:2308,3\n1488#1:2311\n1502#1:2331,14\n445#1:1677,6\n698#1:1760,6\n701#1:1767,6\n883#1:2004,6\n926#1:2011,6\n981#1:2018,6\n993#1:2049,6\n1009#1:2056,6\n1033#1:2067,6\n1088#1:2117,3\n1088#1:2123,3\n1091#1:2128,6\n1292#1:2138,6\n1293#1:2149,3\n1293#1:2155,3\n1313#1:2160,6\n1324#1:2199,6\n1396#1:2211,6\n1397#1:2218,6\n1430#1:2291,6\n1488#1:2312,6\n667#1:1683,6\n667#1:1715\n667#1:1720\n802#1:1849,7\n802#1:1882\n802#1:1925\n1404#1:2224,6\n1404#1:2256\n1404#1:2307\n667#1:1689\n667#1:1691,11\n667#1:1719\n682#1:1727\n682#1:1729,11\n682#1:1757\n705#1:1779\n705#1:1781,11\n786#1:1812\n786#1:1814,11\n786#1:1842\n705#1:1847\n802#1:1856\n802#1:1858,11\n805#1:1889\n805#1:1891,11\n805#1:1919\n802#1:1924\n821#1:1933\n821#1:1935,11\n824#1:1966\n824#1:1968,11\n824#1:1996\n821#1:2001\n979#1:2024\n979#1:2026,11\n979#1:2065\n1056#1:2080\n1056#1:2082,11\n1056#1:2110\n1308#1:2171\n1308#1:2173,11\n1308#1:2208\n1404#1:2230\n1404#1:2232,11\n1423#1:2263\n1423#1:2265,11\n1423#1:2301\n1404#1:2306\n1502#1:2318\n1502#1:2320,11\n1502#1:2345\n667#1:1690\n682#1:1728\n705#1:1780\n786#1:1813\n802#1:1857\n805#1:1890\n821#1:1934\n824#1:1967\n979#1:2025\n1048#1:2074\n1056#1:2081\n1291#1:2135\n1308#1:2172\n1404#1:2231\n1423#1:2264\n1436#1:2297\n1502#1:2319\n682#1:1721,6\n682#1:1753\n682#1:1758\n705#1:1773,6\n705#1:1805\n705#1:1848\n821#1:1926,7\n821#1:1959\n821#1:2002\n786#1:1806,6\n786#1:1838\n786#1:1843\n805#1:1883,6\n805#1:1915\n805#1:1920\n824#1:1960,6\n824#1:1992\n824#1:1997\n1056#1:2075,5\n1056#1:2106\n1056#1:2111\n1308#1:2166,5\n1308#1:2197\n1308#1:2209\n1423#1:2257,6\n1423#1:2289\n1423#1:2302\n1034#1:2073\n1608#1:2357\n1609#1:2358\n1610#1:2359\n1611#1:2360\n1612#1:2361\n1614#1:2362\n1615#1:2363\n1616#1:2364\n1617#1:2365\n1621#1:2370\n1088#1:2112,4\n1088#1:2120,2\n1088#1:2126\n1293#1:2144,4\n1293#1:2152,2\n1293#1:2158\n1088#1:2122\n1293#1:2154\n1241#1:2134\n1631#1:2346\n195#1:2347\n698#1:2348\n698#1:2349,2\n701#1:2351\n701#1:2352,2\n1292#1:2354\n1292#1:2355,2\n1620#1:2366\n1620#1:2367,3\n*E\n"})
public final class TimePickerKt {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f12346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f12347e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f12349g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final List<Integer> f12353k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final ArrayList f12354l;
    public static final float m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f12343a = Dp.m4389constructorimpl(101);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f12344b = Dp.m4389constructorimpl(69);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f12345c = Dp.m4389constructorimpl(36);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f12348f = Dp.m4389constructorimpl(7);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f12350h = Dp.m4389constructorimpl(74);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f12351i = Dp.m4389constructorimpl(48);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final List<Integer> f12352j = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55});

    /* JADX INFO: compiled from: TimePicker.kt */
    @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockDisplayNumbers$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,1672:1\n74#2,7:1673\n81#2:1706\n85#2:1711\n75#3:1680\n76#3,11:1682\n89#3:1710\n76#4:1681\n460#5,13:1693\n473#5,3:1707\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$ClockDisplayNumbers$1\n*L\n846#1:1673,7\n846#1:1706\n846#1:1711\n846#1:1680\n846#1:1682,11\n846#1:1710\n846#1:1681\n846#1:1693,13\n846#1:1707,3\n*E\n"})
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TimePickerState f12355p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TimePickerColors f12356q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f12357r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TimePickerState timePickerState, TimePickerColors timePickerColors, int i10) {
            super(2);
            this.f12355p0 = timePickerState;
            this.f12356q0 = timePickerColors;
            this.f12357r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-477913269, iIntValue, -1, "androidx.compose.material3.ClockDisplayNumbers.<anonymous> (TimePicker.kt:844)");
                }
                TimePickerColors timePickerColors = this.f12356q0;
                composer2.startReplaceableGroup(693286680);
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
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
                Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl, measurePolicyRowMeasurePolicy, composerM2074constructorimpl, density));
                ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                Modifier modifierM337sizeVpY3zN4 = SizeKt.m337sizeVpY3zN4(companion, timePickerTokens.m1993getTimeSelectorContainerWidthD9Ej5fM(), timePickerTokens.m1992getTimeSelectorContainerHeightD9Ej5fM());
                TimePickerState timePickerState = this.f12355p0;
                int hourForDisplay$material3_release = timePickerState.getHourForDisplay$material3_release();
                Selection.Companion companion3 = Selection.INSTANCE;
                int iM1241getHourJiIwxys = companion3.m1241getHourJiIwxys();
                int i10 = this.f12357r0;
                int i11 = ((i10 << 6) & 896) | 3078 | ((i10 << 9) & 57344);
                TimePickerKt.f(modifierM337sizeVpY3zN4, hourForDisplay$material3_release, timePickerState, iM1241getHourJiIwxys, timePickerColors, composer2, i11);
                TimePickerKt.access$DisplaySeparator(SizeKt.m337sizeVpY3zN4(companion, TimePickerKt.f12347e, timePickerTokens.m1989getPeriodSelectorVerticalContainerHeightD9Ej5fM()), composer2, 6);
                TimePickerKt.f(SizeKt.m337sizeVpY3zN4(companion, timePickerTokens.m1993getTimeSelectorContainerWidthD9Ej5fM(), timePickerTokens.m1992getTimeSelectorContainerHeightD9Ej5fM()), timePickerState.getMinute(), timePickerState, companion3.m1242getMinuteJiIwxys(), timePickerColors, composer2, i11);
                if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TimePickerState f12358p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TimePickerColors f12359q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f12360r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TimePickerState timePickerState, TimePickerColors timePickerColors, int i10) {
            super(2);
            this.f12358p0 = timePickerState;
            this.f12359q0 = timePickerColors;
            this.f12360r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f12360r0 | 1);
            TimePickerKt.a(this.f12358p0, this.f12359q0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    public static final class c extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f12361p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.setContainer(semantics, false);
            SemanticsPropertiesKt.selectableGroup(semantics);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    public static final class d extends Lambda implements Function3<List<? extends Integer>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TimePickerState f12363p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f12364q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ TimePickerColors f12365r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f12366s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i10, TimePickerColors timePickerColors, TimePickerState timePickerState, boolean z10) {
            super(3);
            this.f12363p0 = timePickerState;
            this.f12364q0 = z10;
            this.f12365r0 = timePickerColors;
            this.f12366s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(List<? extends Integer> list, Composer composer, Integer num) {
            List<? extends Integer> screen = list;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(screen, "screen");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1628166511, iIntValue, -1, "androidx.compose.material3.ClockFace.<anonymous> (TimePicker.kt:1139)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            TimePickerState timePickerState = this.f12363p0;
            TimePickerKt.m1404access$CircularLayoutuFdPcIQ(TimePickerKt.access$drawSelector(SizeKt.m335size3ABfNKs(TimePickerKt.access$clockDial(companion, timePickerState, this.f12364q0), TimePickerTokens.INSTANCE.m1981getClockDialContainerSizeD9Ej5fM()), timePickerState, this.f12365r0), TimePickerKt.f12343a, ComposableLambdaKt.composableLambda(composer2, -1385633737, true, new r4(this.f12365r0, screen, this.f12363p0, this.f12364q0, this.f12366s0)), composer2, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TimePickerState f12367p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TimePickerColors f12368q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f12369r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f12370s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i10, TimePickerColors timePickerColors, TimePickerState timePickerState, boolean z10) {
            super(2);
            this.f12367p0 = timePickerState;
            this.f12368q0 = timePickerColors;
            this.f12369r0 = z10;
            this.f12370s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f12370s0 | 1);
            TimePickerColors timePickerColors = this.f12368q0;
            boolean z10 = this.f12369r0;
            TimePickerKt.ClockFace(this.f12367p0, timePickerColors, z10, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TimePickerState f12371p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TimePickerColors f12372q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f12373r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(TimePickerState timePickerState, TimePickerColors timePickerColors, int i10) {
            super(2);
            this.f12371p0 = timePickerState;
            this.f12372q0 = timePickerColors;
            this.f12373r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f12373r0 | 1);
            TimePickerKt.b(this.f12371p0, this.f12372q0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TimePickerState f12374p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f12375q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ TimePickerColors f12376r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f12377s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f12378t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f12379u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(TimePickerState timePickerState, Modifier modifier, TimePickerColors timePickerColors, boolean z10, int i10, int i11) {
            super(2);
            this.f12374p0 = timePickerState;
            this.f12375q0 = modifier;
            this.f12376r0 = timePickerColors;
            this.f12377s0 = z10;
            this.f12378t0 = i10;
            this.f12379u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TimePickerKt.HorizontalTimePicker(this.f12374p0, this.f12375q0, this.f12376r0, this.f12377s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f12378t0 | 1), this.f12379u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    public static final class h extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f12380p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(1);
            this.f12380p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.setContainer(semantics, true);
            SemanticsPropertiesKt.setContentDescription(semantics, this.f12380p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    public static final class i extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TimePickerState f12381p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(TimePickerState timePickerState) {
            super(0);
            this.f12381p0 = timePickerState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f12381p0.setAfternoonToggle$material3_release(false);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    public static final class j extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TimePickerState f12382p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(TimePickerState timePickerState) {
            super(0);
            this.f12382p0 = timePickerState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f12382p0.setAfternoonToggle$material3_release(true);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    public static final class k extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f12383p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TimePickerState f12384q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ TimePickerColors f12385r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ MeasurePolicy f12386s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Shape f12387t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Shape f12388u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, MeasurePolicy measurePolicy, Shape shape, Shape shape2, int i10) {
            super(2);
            this.f12383p0 = modifier;
            this.f12384q0 = timePickerState;
            this.f12385r0 = timePickerColors;
            this.f12386s0 = measurePolicy;
            this.f12387t0 = shape;
            this.f12388u0 = shape2;
            this.v0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TimePickerKt.d(this.f12383p0, this.f12384q0, this.f12385r0, this.f12386s0, this.f12387t0, this.f12388u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    public static final class l extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TimePickerState f12389p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f12390q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ TimePickerColors f12391r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f12392s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f12393t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(TimePickerState timePickerState, Modifier modifier, TimePickerColors timePickerColors, int i10, int i11) {
            super(2);
            this.f12389p0 = timePickerState;
            this.f12390q0 = modifier;
            this.f12391r0 = timePickerColors;
            this.f12392s0 = i10;
            this.f12393t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TimePickerKt.TimeInput(this.f12389p0, this.f12390q0, this.f12391r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f12392s0 | 1), this.f12393t0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$TimeInputImpl$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1672:1\n50#2:1673\n49#2:1674\n50#2:1681\n49#2:1682\n36#2:1689\n50#2:1696\n49#2:1697\n50#2:1704\n49#2:1705\n36#2:1712\n1114#3,6:1675\n1114#3,6:1683\n1114#3,6:1690\n1114#3,6:1698\n1114#3,6:1706\n1114#3,6:1713\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$TimeInputImpl$1$1\n*L\n719#1:1673\n719#1:1674\n731#1:1681\n731#1:1682\n746#1:1689\n752#1:1696\n752#1:1697\n765#1:1704\n765#1:1705\n780#1:1712\n719#1:1675,6\n731#1:1683,6\n746#1:1690,6\n752#1:1698,6\n765#1:1706,6\n780#1:1713,6\n*E\n"})
    public static final class m extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TextFieldValue> f12394p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TimePickerState f12395q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f12396r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ TimePickerColors f12397s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TextFieldValue> f12398t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(MutableState<TextFieldValue> mutableState, TimePickerState timePickerState, int i10, TimePickerColors timePickerColors, MutableState<TextFieldValue> mutableState2) {
            super(2);
            this.f12394p0 = mutableState;
            this.f12395q0 = timePickerState;
            this.f12396r0 = i10;
            this.f12397s0 = timePickerColors;
            this.f12398t0 = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1306700887, iIntValue, -1, "androidx.compose.material3.TimeInputImpl.<anonymous>.<anonymous> (TimePicker.kt:714)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                composer2.startReplaceableGroup(511388516);
                MutableState<TextFieldValue> mutableState = this.f12394p0;
                boolean zChanged = composer2.changed(mutableState);
                TimePickerState timePickerState = this.f12395q0;
                boolean zChanged2 = zChanged | composer2.changed(timePickerState);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new s4(timePickerState, mutableState);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                Modifier modifierOnKeyEvent = KeyInputModifierKt.onKeyEvent(companion, (Function1) objRememberedValue);
                TextFieldValue textFieldValueAccess$TimeInputImpl$lambda$5 = TimePickerKt.access$TimeInputImpl$lambda$5(mutableState);
                composer2.startReplaceableGroup(511388516);
                boolean zChanged3 = composer2.changed(timePickerState) | composer2.changed(mutableState);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChanged3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new u4(timePickerState, mutableState);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                Function1 function1 = (Function1) objRememberedValue2;
                TimePickerState timePickerState2 = this.f12395q0;
                Selection.Companion companion2 = Selection.INSTANCE;
                int iM1241getHourJiIwxys = companion2.m1241getHourJiIwxys();
                ImeAction.Companion companion3 = ImeAction.INSTANCE;
                int iM4119getNexteUduSuo = companion3.m4119getNexteUduSuo();
                KeyboardType.Companion companion4 = KeyboardType.INSTANCE;
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, false, companion4.m4165getNumberPjHm6EE(), iM4119getNexteUduSuo, 3, null);
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged4 = composer2.changed(timePickerState);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChanged4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new v4(timePickerState);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceableGroup();
                KeyboardActions keyboardActions = new KeyboardActions(null, null, (Function1) objRememberedValue3, null, null, null, 59, null);
                TimePickerColors timePickerColors = this.f12397s0;
                int i10 = this.f12396r0;
                int i11 = ((i10 << 3) & 7168) | 24576 | ((i10 << 18) & 29360128);
                TimePickerKt.m1405access$TimePickerTextFieldlxUZ_iY(modifierOnKeyEvent, textFieldValueAccess$TimeInputImpl$lambda$5, function1, timePickerState2, iM1241getHourJiIwxys, keyboardOptions, keyboardActions, timePickerColors, composer2, i11, 0);
                TimePickerKt.access$DisplaySeparator(SizeKt.m337sizeVpY3zN4(companion, TimePickerKt.f12347e, TimeInputTokens.INSTANCE.m1975getPeriodSelectorContainerHeightD9Ej5fM()), composer2, 6);
                composer2.startReplaceableGroup(511388516);
                MutableState<TextFieldValue> mutableState2 = this.f12398t0;
                boolean zChanged5 = composer2.changed(mutableState2) | composer2.changed(timePickerState);
                Object objRememberedValue4 = composer2.rememberedValue();
                if (zChanged5 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new w4(timePickerState, mutableState2);
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceableGroup();
                Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(companion, (Function1) objRememberedValue4);
                TextFieldValue textFieldValueAccess$TimeInputImpl$lambda$8 = TimePickerKt.access$TimeInputImpl$lambda$8(mutableState2);
                composer2.startReplaceableGroup(511388516);
                boolean zChanged6 = composer2.changed(timePickerState) | composer2.changed(mutableState2);
                Object objRememberedValue5 = composer2.rememberedValue();
                if (zChanged6 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new y4(timePickerState, mutableState2);
                    composer2.updateRememberedValue(objRememberedValue5);
                }
                composer2.endReplaceableGroup();
                Function1 function2 = (Function1) objRememberedValue5;
                TimePickerState timePickerState3 = this.f12395q0;
                int iM1242getMinuteJiIwxys = companion2.m1242getMinuteJiIwxys();
                KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, false, companion4.m4165getNumberPjHm6EE(), companion3.m4117getDoneeUduSuo(), 3, null);
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged7 = composer2.changed(timePickerState);
                Object objRememberedValue6 = composer2.rememberedValue();
                if (zChanged7 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new z4(timePickerState);
                    composer2.updateRememberedValue(objRememberedValue6);
                }
                composer2.endReplaceableGroup();
                TimePickerKt.m1405access$TimePickerTextFieldlxUZ_iY(modifierOnPreviewKeyEvent, textFieldValueAccess$TimeInputImpl$lambda$8, function2, timePickerState3, iM1242getMinuteJiIwxys, keyboardOptions2, new KeyboardActions(null, null, (Function1) objRememberedValue6, null, null, null, 59, null), this.f12397s0, composer2, i11, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    public static final class n extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f12399p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TimePickerColors f12400q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ TimePickerState f12401r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f12402s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(int i10, TimePickerColors timePickerColors, TimePickerState timePickerState, Modifier modifier) {
            super(2);
            this.f12399p0 = modifier;
            this.f12400q0 = timePickerColors;
            this.f12401r0 = timePickerState;
            this.f12402s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f12402s0 | 1);
            TimePickerColors timePickerColors = this.f12400q0;
            TimePickerState timePickerState = this.f12401r0;
            TimePickerKt.e(this.f12399p0, timePickerColors, timePickerState, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    public static final class o extends Lambda implements Function0<MutableState<TextFieldValue>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TimePickerState f12403p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(TimePickerState timePickerState) {
            super(0);
            this.f12403p0 = timePickerState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableState<TextFieldValue> invoke() {
            return SnapshotStateKt.mutableStateOf$default(new TextFieldValue(TimePickerKt.j(this.f12403p0.getHourForDisplay$material3_release(), 2), 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    public static final class p extends Lambda implements Function0<MutableState<TextFieldValue>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TimePickerState f12404p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(TimePickerState timePickerState) {
            super(0);
            this.f12404p0 = timePickerState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableState<TextFieldValue> invoke() {
            return SnapshotStateKt.mutableStateOf$default(new TextFieldValue(TimePickerKt.j(this.f12404p0.getMinute(), 2), 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    public static final class q extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TimePickerState f12405p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f12406q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ TimePickerColors f12407r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f12408s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f12409t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f12410u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(int i10, int i11, int i12, TimePickerColors timePickerColors, TimePickerState timePickerState, Modifier modifier) {
            super(2);
            this.f12405p0 = timePickerState;
            this.f12406q0 = modifier;
            this.f12407r0 = timePickerColors;
            this.f12408s0 = i10;
            this.f12409t0 = i11;
            this.f12410u0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TimePickerKt.m1403TimePickermT9BvqQ(this.f12405p0, this.f12406q0, this.f12407r0, this.f12408s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f12409t0 | 1), this.f12410u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    public static final class r extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f12411p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str) {
            super(1);
            this.f12411p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.m3843setRolekuIjeqM(semantics, Role.INSTANCE.m3835getRadioButtono7Vup1c());
            SemanticsPropertiesKt.setContentDescription(semantics, this.f12411p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    public static final class s extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f12412p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TimePickerState f12413q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f12414r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(int i10, TimePickerState timePickerState, CoroutineScope coroutineScope) {
            super(0);
            this.f12412p0 = i10;
            this.f12413q0 = timePickerState;
            this.f12414r0 = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            TimePickerState timePickerState = this.f12413q0;
            int iM1419getSelectionJiIwxys$material3_release = timePickerState.m1419getSelectionJiIwxys$material3_release();
            int i10 = this.f12412p0;
            if (!Selection.m1237equalsimpl0(i10, iM1419getSelectionJiIwxys$material3_release)) {
                timePickerState.m1422setSelectioniHAOin8$material3_release(i10);
                BuildersKt__Builders_commonKt.launch$default(this.f12414r0, null, null, new a5(timePickerState, null), 3, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$TimeSelector$3\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1672:1\n66#2,7:1673\n73#2:1706\n77#2:1718\n75#3:1680\n76#3,11:1682\n89#3:1717\n76#4:1681\n460#5,13:1693\n36#5:1707\n473#5,3:1714\n1114#6,6:1708\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$TimeSelector$3\n*L\n1114#1:1673,7\n1114#1:1706\n1114#1:1718\n1114#1:1680\n1114#1:1682,11\n1114#1:1717\n1114#1:1681\n1114#1:1693,13\n1116#1:1707\n1114#1:1714,3\n1116#1:1708,6\n*E\n"})
    public static final class t extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f12415p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TimePickerState f12416q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f12417r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f12418s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ long f12419t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(int i10, TimePickerState timePickerState, int i11, int i12, long j10) {
            super(2);
            this.f12415p0 = i10;
            this.f12416q0 = timePickerState;
            this.f12417r0 = i11;
            this.f12418s0 = i12;
            this.f12419t0 = j10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1338709103, iIntValue, -1, "androidx.compose.material3.TimeSelector.<anonymous> (TimePicker.kt:1105)");
                }
                boolean is24hour = this.f12416q0.getIs24hour();
                int i10 = this.f12418s0;
                int i11 = ((i10 << 3) & 896) | ((i10 >> 9) & 14);
                int i12 = this.f12415p0;
                int i13 = this.f12417r0;
                String strM1408numberContentDescriptionYKJpE6Y = TimePickerKt.m1408numberContentDescriptionYKJpE6Y(i12, is24hour, i13, composer2, i11);
                Alignment center = Alignment.INSTANCE.getCenter();
                long j10 = this.f12419t0;
                composer2.startReplaceableGroup(733328855);
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                Density density = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
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
                Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl, density));
                ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged = composer2.changed(strM1408numberContentDescriptionYKJpE6Y);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new b5(strM1408numberContentDescriptionYKJpE6Y);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                TextKt.m1389Text4IGK_g(TimePickerKt.j(i13, 2), SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), j10, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131064);
                if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    public static final class u extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f12420p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f12421q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ TimePickerState f12422r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f12423s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ TimePickerColors f12424t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f12425u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(int i10, int i11, int i12, TimePickerColors timePickerColors, TimePickerState timePickerState, Modifier modifier) {
            super(2);
            this.f12420p0 = modifier;
            this.f12421q0 = i10;
            this.f12422r0 = timePickerState;
            this.f12423s0 = i11;
            this.f12424t0 = timePickerColors;
            this.f12425u0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TimePickerKt.f(this.f12420p0, this.f12421q0, this.f12422r0, this.f12423s0, this.f12424t0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f12425u0 | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    public static final class v extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f12426p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(boolean z10) {
            super(1);
            this.f12426p0 = z10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.setSelected(semantics, this.f12426p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    public static final class w extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f12428p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Shape f12429q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f12430r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ TimePickerColors f12431s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f12432t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f12433u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public w(boolean z10, Shape shape, Function0<Unit> function0, TimePickerColors timePickerColors, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f12428p0 = z10;
            this.f12429q0 = shape;
            this.f12430r0 = function0;
            this.f12431s0 = timePickerColors;
            this.f12432t0 = function3;
            this.f12433u0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TimePickerKt.g(this.f12428p0, this.f12429q0, this.f12430r0, this.f12431s0, this.f12432t0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f12433u0 | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    public static final class x extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TimePickerState f12434p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TimePickerColors f12435q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f12436r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(TimePickerState timePickerState, TimePickerColors timePickerColors, int i10) {
            super(2);
            this.f12434p0 = timePickerState;
            this.f12435q0 = timePickerColors;
            this.f12436r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f12436r0 | 1);
            TimePickerKt.h(this.f12434p0, this.f12435q0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    public static final class y extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TimePickerState f12437p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f12438q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ TimePickerColors f12439r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f12440s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f12441t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f12442u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(TimePickerState timePickerState, Modifier modifier, TimePickerColors timePickerColors, boolean z10, int i10, int i11) {
            super(2);
            this.f12437p0 = timePickerState;
            this.f12438q0 = modifier;
            this.f12439r0 = timePickerColors;
            this.f12440s0 = z10;
            this.f12441t0 = i10;
            this.f12442u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TimePickerKt.VerticalTimePicker(this.f12437p0, this.f12438q0, this.f12439r0, this.f12440s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f12441t0 | 1), this.f12442u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    public static final class z extends Lambda implements Function0<TimePickerState> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f12443p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f12444q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f12445r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(int i10, int i11, boolean z10) {
            super(0);
            this.f12443p0 = i10;
            this.f12444q0 = i11;
            this.f12445r0 = z10;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TimePickerState invoke() {
            return new TimePickerState(this.f12443p0, this.f12444q0, this.f12445r0);
        }
    }

    static {
        float f6 = 24;
        f12346d = Dp.m4389constructorimpl(f6);
        f12347e = Dp.m4389constructorimpl(f6);
        f12349g = Dp.m4389constructorimpl(f6);
        List<Integer> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
        f12353k = listListOf;
        List<Integer> list = listListOf;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf((((Number) it.next()).intValue() % 12) + 12));
        }
        f12354l = arrayList;
        m = Dp.m4389constructorimpl(12);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ClockFace(@NotNull TimePickerState state, @NotNull TimePickerColors colors, boolean z10, @Nullable Composer composer, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1525091100);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(colors) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1525091100, i11, -1, "androidx.compose.material3.ClockFace (TimePicker.kt:1124)");
            }
            CrossfadeKt.Crossfade(state.getValues$material3_release(), SemanticsModifierKt.semantics$default(SizeKt.m335size3ABfNKs(BackgroundKt.m121backgroundbw27NRU(Modifier.INSTANCE, colors.getClockDialColor(), RoundedCornerShapeKt.getCircleShape()), TimePickerTokens.INSTANCE.m1981getClockDialContainerSizeD9Ej5fM()), false, c.f12361p0, 1, null), AnimationSpecKt.tween$default(ResultCode.ERROR_CONN_SSL_GENERIC, 0, null, 6, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1628166511, true, new d(i11, colors, state, z10)), composerStartRestartGroup, 24584, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new e(i10, colors, state, z10));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5 A[PHI: r3 r39
      0x00a5: PHI (r3v19 int) = (r3v13 int), (r3v20 int) binds: [B:65:0x00b2, B:59:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x00a5: PHI (r39v4 androidx.compose.ui.Modifier) = (r39v1 androidx.compose.ui.Modifier), (r39v5 androidx.compose.ui.Modifier) binds: [B:65:0x00b2, B:59:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:72:0x014a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0156  */
    /* JADX WARN: Code duplicated, block: B:76:0x015a  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void HorizontalTimePicker(@NotNull TimePickerState state, @Nullable Modifier modifier, @Nullable TimePickerColors timePickerColors, boolean z10, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        TimePickerColors timePickerColors2;
        int i13;
        Modifier modifier3;
        TimePickerColors timePickerColorsM1401colorsu3YEpmA;
        Function0<ComposeUiNode> constructor;
        TimePickerColors timePickerColors3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(5079681);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i10 & 896) == 0) {
                if ((i11 & 4) == 0) {
                    timePickerColors2 = timePickerColors;
                    int i15 = composerStartRestartGroup.changed(timePickerColors2) ? 256 : 128;
                    i12 |= i15;
                } else {
                    timePickerColors2 = timePickerColors;
                }
                i12 |= i15;
            } else {
                timePickerColors2 = timePickerColors;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changed(z10)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            if ((i12 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        timePickerColorsM1401colorsu3YEpmA = TimePickerDefaults.INSTANCE.m1401colorsu3YEpmA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 24576, 16383);
                        i12 &= -897;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(5079681, i12, -1, "androidx.compose.material3.HorizontalTimePicker (TimePicker.kt:675)");
                    }
                    Modifier modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(modifier3, 0.0f, 0.0f, 0.0f, f12346d, 7, null);
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    constructor = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM300paddingqDBjuR0$default);
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
                    Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion, composerM2074constructorimpl, measurePolicyRowMeasurePolicy, composerM2074constructorimpl, density));
                    ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    int i16 = i12 & 14;
                    int i17 = i12 >> 3;
                    int i18 = i16 | (i17 & 112);
                    b(state, timePickerColorsM1401colorsu3YEpmA, composerStartRestartGroup, i18);
                    SpacerKt.Spacer(SizeKt.m340width3ABfNKs(Modifier.INSTANCE, f12345c), composerStartRestartGroup, 6);
                    ClockFace(state, timePickerColorsM1401colorsu3YEpmA, z10, composerStartRestartGroup, i18 | (i17 & 896));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    timePickerColors3 = timePickerColorsM1401colorsu3YEpmA;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    modifier3 = modifier2;
                }
                timePickerColorsM1401colorsu3YEpmA = timePickerColors2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(5079681, i12, -1, "androidx.compose.material3.HorizontalTimePicker (TimePicker.kt:675)");
                }
                Modifier modifierM300paddingqDBjuR0$default2 = PaddingKt.m300paddingqDBjuR0$default(modifier3, 0.0f, 0.0f, 0.0f, f12346d, 7, null);
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM300paddingqDBjuR0$default2);
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
                Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl2, measurePolicyRowMeasurePolicy2, composerM2074constructorimpl2, density2));
                ai.a.j(0, function3MaterializerOf2, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                int i19 = i12 & 14;
                int i110 = i12 >> 3;
                int i111 = i19 | (i110 & 112);
                b(state, timePickerColorsM1401colorsu3YEpmA, composerStartRestartGroup, i111);
                SpacerKt.Spacer(SizeKt.m340width3ABfNKs(Modifier.INSTANCE, f12345c), composerStartRestartGroup, 6);
                ClockFace(state, timePickerColorsM1401colorsu3YEpmA, z10, composerStartRestartGroup, i111 | (i110 & 896));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                timePickerColors3 = timePickerColorsM1401colorsu3YEpmA;
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                timePickerColors3 = timePickerColors2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new g(state, modifier2, timePickerColors3, z10, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                timePickerColors2 = timePickerColors;
                if (composerStartRestartGroup.changed(timePickerColors2)) {
                }
                i12 |= i15;
            } else {
                timePickerColors2 = timePickerColors;
            }
            i12 |= i15;
        } else {
            timePickerColors2 = timePickerColors;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (composerStartRestartGroup.changed(z10)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 5851) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 4) != 0) {
                    timePickerColorsM1401colorsu3YEpmA = TimePickerDefaults.INSTANCE.m1401colorsu3YEpmA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 24576, 16383);
                    i12 &= -897;
                } else {
                    timePickerColorsM1401colorsu3YEpmA = timePickerColors2;
                }
            } else {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 4) != 0) {
                    timePickerColorsM1401colorsu3YEpmA = TimePickerDefaults.INSTANCE.m1401colorsu3YEpmA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 24576, 16383);
                    i12 &= -897;
                } else {
                    timePickerColorsM1401colorsu3YEpmA = timePickerColors2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(5079681, i12, -1, "androidx.compose.material3.HorizontalTimePicker (TimePicker.kt:675)");
            }
            Modifier modifierM300paddingqDBjuR0$default3 = PaddingKt.m300paddingqDBjuR0$default(modifier3, 0.0f, 0.0f, 0.0f, f12346d, 7, null);
            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierM300paddingqDBjuR0$default3);
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
            Composer composerM2074constructorimpl3 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl3, layoutDirection3, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl3, measurePolicyRowMeasurePolicy3, composerM2074constructorimpl3, density3));
            ai.a.j(0, function3MaterializerOf3, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            int i112 = i12 & 14;
            int i113 = i12 >> 3;
            int i114 = i112 | (i113 & 112);
            b(state, timePickerColorsM1401colorsu3YEpmA, composerStartRestartGroup, i114);
            SpacerKt.Spacer(SizeKt.m340width3ABfNKs(Modifier.INSTANCE, f12345c), composerStartRestartGroup, 6);
            ClockFace(state, timePickerColorsM1401colorsu3YEpmA, z10, composerStartRestartGroup, i114 | (i113 & 896));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            timePickerColors3 = timePickerColorsM1401colorsu3YEpmA;
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 4) != 0) {
                    timePickerColorsM1401colorsu3YEpmA = TimePickerDefaults.INSTANCE.m1401colorsu3YEpmA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 24576, 16383);
                    i12 &= -897;
                } else {
                    timePickerColorsM1401colorsu3YEpmA = timePickerColors2;
                }
            } else {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 4) != 0) {
                    timePickerColorsM1401colorsu3YEpmA = TimePickerDefaults.INSTANCE.m1401colorsu3YEpmA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 24576, 16383);
                    i12 &= -897;
                } else {
                    timePickerColorsM1401colorsu3YEpmA = timePickerColors2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(5079681, i12, -1, "androidx.compose.material3.HorizontalTimePicker (TimePicker.kt:675)");
            }
            Modifier modifierM300paddingqDBjuR0$default4 = PaddingKt.m300paddingqDBjuR0$default(modifier3, 0.0f, 0.0f, 0.0f, f12346d, 7, null);
            Alignment.Vertical centerVertically4 = Alignment.INSTANCE.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically4, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierM300paddingqDBjuR0$default4);
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
            Composer composerM2074constructorimpl4 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl4, layoutDirection4, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion4, composerM2074constructorimpl4, measurePolicyRowMeasurePolicy4, composerM2074constructorimpl4, density4));
            ai.a.j(0, function3MaterializerOf4, androidx.appcompat.widget.g0.b(companion4, composerM2074constructorimpl4, viewConfiguration4, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
            int i115 = i12 & 14;
            int i116 = i12 >> 3;
            int i117 = i115 | (i116 & 112);
            b(state, timePickerColorsM1401colorsu3YEpmA, composerStartRestartGroup, i117);
            SpacerKt.Spacer(SizeKt.m340width3ABfNKs(Modifier.INSTANCE, f12345c), composerStartRestartGroup, 6);
            ClockFace(state, timePickerColorsM1401colorsu3YEpmA, z10, composerStartRestartGroup, i117 | (i116 & 896));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            timePickerColors3 = timePickerColorsM1401colorsu3YEpmA;
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new g(state, modifier2, timePickerColors3, z10, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterial3Api
    public static final void TimeInput(@NotNull TimePickerState state, @Nullable Modifier modifier, @Nullable TimePickerColors timePickerColors, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        TimePickerColors timePickerColorsM1401colorsu3YEpmA;
        Modifier modifier3;
        TimePickerColors timePickerColors2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-760850373);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i10 & 896) == 0) {
                if ((i11 & 4) == 0) {
                    timePickerColorsM1401colorsu3YEpmA = timePickerColors;
                    int i14 = composerStartRestartGroup.changed(timePickerColorsM1401colorsu3YEpmA) ? 256 : 128;
                    i12 |= i14;
                } else {
                    timePickerColorsM1401colorsu3YEpmA = timePickerColors;
                }
                i12 |= i14;
            } else {
                timePickerColorsM1401colorsu3YEpmA = timePickerColors;
            }
            if ((i12 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        timePickerColorsM1401colorsu3YEpmA = TimePickerDefaults.INSTANCE.m1401colorsu3YEpmA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 24576, 16383);
                    }
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-760850373, i12, -1, "androidx.compose.material3.TimeInput (TimePicker.kt:230)");
                }
                int i15 = i12 >> 3;
                e(modifier2, timePickerColorsM1401colorsu3YEpmA, state, composerStartRestartGroup, (i15 & 112) | (i15 & 14) | ((i12 << 6) & 896));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            timePickerColors2 = timePickerColorsM1401colorsu3YEpmA;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new l(state, modifier2, timePickerColors2, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                timePickerColorsM1401colorsu3YEpmA = timePickerColors;
                if (composerStartRestartGroup.changed(timePickerColorsM1401colorsu3YEpmA)) {
                }
                i12 |= i14;
            } else {
                timePickerColorsM1401colorsu3YEpmA = timePickerColors;
            }
            i12 |= i14;
        } else {
            timePickerColorsM1401colorsu3YEpmA = timePickerColors;
        }
        if ((i12 & 731) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    timePickerColorsM1401colorsu3YEpmA = TimePickerDefaults.INSTANCE.m1401colorsu3YEpmA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 24576, 16383);
                }
                modifier2 = modifier3;
            } else {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    timePickerColorsM1401colorsu3YEpmA = TimePickerDefaults.INSTANCE.m1401colorsu3YEpmA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 24576, 16383);
                }
                modifier2 = modifier3;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-760850373, i12, -1, "androidx.compose.material3.TimeInput (TimePicker.kt:230)");
            }
            int i16 = i12 >> 3;
            e(modifier2, timePickerColorsM1401colorsu3YEpmA, state, composerStartRestartGroup, (i16 & 112) | (i16 & 14) | ((i12 << 6) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    timePickerColorsM1401colorsu3YEpmA = TimePickerDefaults.INSTANCE.m1401colorsu3YEpmA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 24576, 16383);
                }
                modifier2 = modifier3;
            } else {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    timePickerColorsM1401colorsu3YEpmA = TimePickerDefaults.INSTANCE.m1401colorsu3YEpmA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 24576, 16383);
                }
                modifier2 = modifier3;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-760850373, i12, -1, "androidx.compose.material3.TimeInput (TimePicker.kt:230)");
            }
            int i17 = i12 >> 3;
            e(modifier2, timePickerColorsM1401colorsu3YEpmA, state, composerStartRestartGroup, (i17 & 112) | (i17 & 14) | ((i12 << 6) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        timePickerColors2 = timePickerColorsM1401colorsu3YEpmA;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new l(state, modifier2, timePickerColors2, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:78:0x0106  */
    /* JADX WARN: Code duplicated, block: B:81:0x011d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0147  */
    /* JADX WARN: Code duplicated, block: B:85:0x0175  */
    /* JADX WARN: Code duplicated, block: B:90:0x0182  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterial3Api
    /* JADX INFO: renamed from: TimePicker-mT9BvqQ, reason: not valid java name */
    public static final void m1403TimePickermT9BvqQ(@NotNull TimePickerState state, @Nullable Modifier modifier, @Nullable TimePickerColors timePickerColors, int i10, @Nullable Composer composer, int i11, int i12) {
        int i13;
        Modifier modifier2;
        TimePickerColors timePickerColors2;
        int i14;
        Modifier modifier3;
        TimePickerColors timePickerColorsM1401colorsu3YEpmA;
        Modifier modifier4;
        TimePickerColors timePickerColors3;
        int iM1402layoutTypesDNSZnc;
        State<Boolean> state2;
        Composer composer2;
        Modifier modifier5;
        int i15;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-619286452);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i16 = i12 & 2;
        if (i16 == 0) {
            if ((i11 & 112) == 0) {
                modifier2 = modifier;
                i13 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i11 & 896) == 0) {
                if ((i12 & 4) == 0) {
                    timePickerColors2 = timePickerColors;
                    int i17 = composerStartRestartGroup.changed(timePickerColors2) ? 256 : 128;
                    i13 |= i17;
                } else {
                    timePickerColors2 = timePickerColors;
                }
                i13 |= i17;
            } else {
                timePickerColors2 = timePickerColors;
            }
            if ((i11 & 7168) == 0) {
                if ((i12 & 8) == 0) {
                    i14 = i10;
                    int i18 = composerStartRestartGroup.changed(i14) ? 2048 : 1024;
                    i13 |= i18;
                } else {
                    i14 = i10;
                }
                i13 |= i18;
            } else {
                i14 = i10;
            }
            if ((i13 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i12 & 4) != 0) {
                        timePickerColorsM1401colorsu3YEpmA = TimePickerDefaults.INSTANCE.m1401colorsu3YEpmA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 24576, 16383);
                        i13 &= -897;
                    } else {
                        timePickerColorsM1401colorsu3YEpmA = timePickerColors2;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        modifier4 = modifier3;
                        timePickerColors3 = timePickerColorsM1401colorsu3YEpmA;
                        iM1402layoutTypesDNSZnc = TimePickerDefaults.INSTANCE.m1402layoutTypesDNSZnc(composerStartRestartGroup, 6);
                    } else {
                        modifier4 = modifier3;
                        timePickerColors3 = timePickerColorsM1401colorsu3YEpmA;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-619286452, i13, -1, "androidx.compose.material3.TimePicker (TimePicker.kt:188)");
                    }
                    state2 = TouchExplorationStateProvider_androidKt.touchExplorationState(composerStartRestartGroup, 0);
                    if (TimePickerLayoutType.m1412equalsimpl0(iM1402layoutTypesDNSZnc, TimePickerLayoutType.INSTANCE.m1417getVerticalQJTpgSE())) {
                        composerStartRestartGroup.startReplaceableGroup(1318081657);
                        composer2 = composerStartRestartGroup;
                        VerticalTimePicker(state, modifier4, timePickerColors3, !state2.getValue().booleanValue(), composerStartRestartGroup, (i13 & 14) | (i13 & 112) | (i13 & 896), 0);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceableGroup(1318081863);
                        HorizontalTimePicker(state, modifier4, timePickerColors3, !state2.getValue().booleanValue(), composer2, (i13 & 14) | (i13 & 112) | (i13 & 896), 0);
                        composer2.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    timePickerColors2 = timePickerColors3;
                    i15 = iM1402layoutTypesDNSZnc;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                    }
                    modifier4 = modifier2;
                    timePickerColors3 = timePickerColors2;
                }
                iM1402layoutTypesDNSZnc = i14;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-619286452, i13, -1, "androidx.compose.material3.TimePicker (TimePicker.kt:188)");
                }
                state2 = TouchExplorationStateProvider_androidKt.touchExplorationState(composerStartRestartGroup, 0);
                if (TimePickerLayoutType.m1412equalsimpl0(iM1402layoutTypesDNSZnc, TimePickerLayoutType.INSTANCE.m1417getVerticalQJTpgSE())) {
                    composerStartRestartGroup.startReplaceableGroup(1318081657);
                    composer2 = composerStartRestartGroup;
                    VerticalTimePicker(state, modifier4, timePickerColors3, !state2.getValue().booleanValue(), composerStartRestartGroup, (i13 & 14) | (i13 & 112) | (i13 & 896), 0);
                    composer2.endReplaceableGroup();
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(1318081863);
                    HorizontalTimePicker(state, modifier4, timePickerColors3, !state2.getValue().booleanValue(), composer2, (i13 & 14) | (i13 & 112) | (i13 & 896), 0);
                    composer2.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                timePickerColors2 = timePickerColors3;
                i15 = iM1402layoutTypesDNSZnc;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                i15 = i14;
                composer2 = composerStartRestartGroup;
                modifier5 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new q(i15, i11, i12, timePickerColors2, state, modifier5));
        }
        i13 |= 48;
        modifier2 = modifier;
        if ((i11 & 896) == 0) {
            if ((i12 & 4) == 0) {
                timePickerColors2 = timePickerColors;
                if (composerStartRestartGroup.changed(timePickerColors2)) {
                }
                i13 |= i17;
            } else {
                timePickerColors2 = timePickerColors;
            }
            i13 |= i17;
        } else {
            timePickerColors2 = timePickerColors;
        }
        if ((i11 & 7168) == 0) {
            if ((i12 & 8) == 0) {
                i14 = i10;
                if (composerStartRestartGroup.changed(i14)) {
                }
                i13 |= i18;
            } else {
                i14 = i10;
            }
            i13 |= i18;
        } else {
            i14 = i10;
        }
        if ((i13 & 5851) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i12 & 4) != 0) {
                    timePickerColorsM1401colorsu3YEpmA = TimePickerDefaults.INSTANCE.m1401colorsu3YEpmA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 24576, 16383);
                    i13 &= -897;
                } else {
                    timePickerColorsM1401colorsu3YEpmA = timePickerColors2;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    modifier4 = modifier3;
                    timePickerColors3 = timePickerColorsM1401colorsu3YEpmA;
                    iM1402layoutTypesDNSZnc = TimePickerDefaults.INSTANCE.m1402layoutTypesDNSZnc(composerStartRestartGroup, 6);
                } else {
                    modifier4 = modifier3;
                    timePickerColors3 = timePickerColorsM1401colorsu3YEpmA;
                    iM1402layoutTypesDNSZnc = i14;
                }
            } else {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i12 & 4) != 0) {
                    timePickerColorsM1401colorsu3YEpmA = TimePickerDefaults.INSTANCE.m1401colorsu3YEpmA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 24576, 16383);
                    i13 &= -897;
                } else {
                    timePickerColorsM1401colorsu3YEpmA = timePickerColors2;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    modifier4 = modifier3;
                    timePickerColors3 = timePickerColorsM1401colorsu3YEpmA;
                    iM1402layoutTypesDNSZnc = TimePickerDefaults.INSTANCE.m1402layoutTypesDNSZnc(composerStartRestartGroup, 6);
                } else {
                    modifier4 = modifier3;
                    timePickerColors3 = timePickerColorsM1401colorsu3YEpmA;
                    iM1402layoutTypesDNSZnc = i14;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-619286452, i13, -1, "androidx.compose.material3.TimePicker (TimePicker.kt:188)");
            }
            state2 = TouchExplorationStateProvider_androidKt.touchExplorationState(composerStartRestartGroup, 0);
            if (TimePickerLayoutType.m1412equalsimpl0(iM1402layoutTypesDNSZnc, TimePickerLayoutType.INSTANCE.m1417getVerticalQJTpgSE())) {
                composerStartRestartGroup.startReplaceableGroup(1318081657);
                composer2 = composerStartRestartGroup;
                VerticalTimePicker(state, modifier4, timePickerColors3, !state2.getValue().booleanValue(), composerStartRestartGroup, (i13 & 14) | (i13 & 112) | (i13 & 896), 0);
                composer2.endReplaceableGroup();
            } else {
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(1318081863);
                HorizontalTimePicker(state, modifier4, timePickerColors3, !state2.getValue().booleanValue(), composer2, (i13 & 14) | (i13 & 112) | (i13 & 896), 0);
                composer2.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            timePickerColors2 = timePickerColors3;
            i15 = iM1402layoutTypesDNSZnc;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i12 & 4) != 0) {
                    timePickerColorsM1401colorsu3YEpmA = TimePickerDefaults.INSTANCE.m1401colorsu3YEpmA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 24576, 16383);
                    i13 &= -897;
                } else {
                    timePickerColorsM1401colorsu3YEpmA = timePickerColors2;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    modifier4 = modifier3;
                    timePickerColors3 = timePickerColorsM1401colorsu3YEpmA;
                    iM1402layoutTypesDNSZnc = TimePickerDefaults.INSTANCE.m1402layoutTypesDNSZnc(composerStartRestartGroup, 6);
                } else {
                    modifier4 = modifier3;
                    timePickerColors3 = timePickerColorsM1401colorsu3YEpmA;
                    iM1402layoutTypesDNSZnc = i14;
                }
            } else {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i12 & 4) != 0) {
                    timePickerColorsM1401colorsu3YEpmA = TimePickerDefaults.INSTANCE.m1401colorsu3YEpmA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 24576, 16383);
                    i13 &= -897;
                } else {
                    timePickerColorsM1401colorsu3YEpmA = timePickerColors2;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    modifier4 = modifier3;
                    timePickerColors3 = timePickerColorsM1401colorsu3YEpmA;
                    iM1402layoutTypesDNSZnc = TimePickerDefaults.INSTANCE.m1402layoutTypesDNSZnc(composerStartRestartGroup, 6);
                } else {
                    modifier4 = modifier3;
                    timePickerColors3 = timePickerColorsM1401colorsu3YEpmA;
                    iM1402layoutTypesDNSZnc = i14;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-619286452, i13, -1, "androidx.compose.material3.TimePicker (TimePicker.kt:188)");
            }
            state2 = TouchExplorationStateProvider_androidKt.touchExplorationState(composerStartRestartGroup, 0);
            if (TimePickerLayoutType.m1412equalsimpl0(iM1402layoutTypesDNSZnc, TimePickerLayoutType.INSTANCE.m1417getVerticalQJTpgSE())) {
                composerStartRestartGroup.startReplaceableGroup(1318081657);
                composer2 = composerStartRestartGroup;
                VerticalTimePicker(state, modifier4, timePickerColors3, !state2.getValue().booleanValue(), composerStartRestartGroup, (i13 & 14) | (i13 & 112) | (i13 & 896), 0);
                composer2.endReplaceableGroup();
            } else {
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(1318081863);
                HorizontalTimePicker(state, modifier4, timePickerColors3, !state2.getValue().booleanValue(), composer2, (i13 & 14) | (i13 & 112) | (i13 & 896), 0);
                composer2.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            timePickerColors2 = timePickerColors3;
            i15 = iM1402layoutTypesDNSZnc;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new q(i15, i11, i12, timePickerColors2, state, modifier5));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:72:0x014b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0157  */
    /* JADX WARN: Code duplicated, block: B:76:0x015b  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterial3Api
    public static final void VerticalTimePicker(@NotNull TimePickerState state, @Nullable Modifier modifier, @Nullable TimePickerColors timePickerColors, boolean z10, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        TimePickerColors timePickerColorsM1401colorsu3YEpmA;
        int i13;
        Modifier modifier3;
        Function0<ComposeUiNode> constructor;
        TimePickerColors timePickerColors2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(310683247);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i10 & 896) == 0) {
                if ((i11 & 4) == 0) {
                    timePickerColorsM1401colorsu3YEpmA = timePickerColors;
                    int i15 = composerStartRestartGroup.changed(timePickerColorsM1401colorsu3YEpmA) ? 256 : 128;
                    i12 |= i15;
                } else {
                    timePickerColorsM1401colorsu3YEpmA = timePickerColors;
                }
                i12 |= i15;
            } else {
                timePickerColorsM1401colorsu3YEpmA = timePickerColors;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changed(z10)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            if ((i12 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i14 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        timePickerColorsM1401colorsu3YEpmA = TimePickerDefaults.INSTANCE.m1401colorsu3YEpmA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 24576, 16383);
                    }
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(310683247, i12, -1, "androidx.compose.material3.VerticalTimePicker (TimePicker.kt:660)");
                }
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                int i16 = i12 >> 3;
                int i17 = (i16 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE;
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                int i18 = i17 >> 3;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, (i18 & 112) | (i18 & 14));
                Density density = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier2);
                int i19 = ((((i17 << 3) & 112) << 9) & 7168) | 6;
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
                ai.a.j((i19 >> 3) & 112, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i20 = (i12 & 14) | (i16 & 112);
                h(state, timePickerColorsM1401colorsu3YEpmA, composerStartRestartGroup, i20);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                SpacerKt.Spacer(SizeKt.m321height3ABfNKs(companion2, f12345c), composerStartRestartGroup, 6);
                ClockFace(state, timePickerColorsM1401colorsu3YEpmA, z10, composerStartRestartGroup, i20 | (i16 & 896));
                SpacerKt.Spacer(SizeKt.m321height3ABfNKs(companion2, f12346d), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            timePickerColors2 = timePickerColorsM1401colorsu3YEpmA;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new y(state, modifier2, timePickerColors2, z10, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                timePickerColorsM1401colorsu3YEpmA = timePickerColors;
                if (composerStartRestartGroup.changed(timePickerColorsM1401colorsu3YEpmA)) {
                }
                i12 |= i15;
            } else {
                timePickerColorsM1401colorsu3YEpmA = timePickerColors;
            }
            i12 |= i15;
        } else {
            timePickerColorsM1401colorsu3YEpmA = timePickerColors;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (composerStartRestartGroup.changed(z10)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 5851) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    timePickerColorsM1401colorsu3YEpmA = TimePickerDefaults.INSTANCE.m1401colorsu3YEpmA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 24576, 16383);
                }
                modifier2 = modifier3;
            } else {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    timePickerColorsM1401colorsu3YEpmA = TimePickerDefaults.INSTANCE.m1401colorsu3YEpmA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 24576, 16383);
                }
                modifier2 = modifier3;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(310683247, i12, -1, "androidx.compose.material3.VerticalTimePicker (TimePicker.kt:660)");
            }
            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
            int i110 = i12 >> 3;
            int i111 = (i110 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE;
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            int i112 = i111 >> 3;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composerStartRestartGroup, (i112 & 112) | (i112 & 14));
            Density density2 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifier2);
            int i113 = ((((i111 << 3) & 112) << 9) & 7168) | 6;
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
            Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM2074constructorimpl2, density2));
            ai.a.j((i113 >> 3) & 112, function3MaterializerOf2, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i21 = (i12 & 14) | (i110 & 112);
            h(state, timePickerColorsM1401colorsu3YEpmA, composerStartRestartGroup, i21);
            Modifier.Companion companion4 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m321height3ABfNKs(companion4, f12345c), composerStartRestartGroup, 6);
            ClockFace(state, timePickerColorsM1401colorsu3YEpmA, z10, composerStartRestartGroup, i21 | (i110 & 896));
            SpacerKt.Spacer(SizeKt.m321height3ABfNKs(companion4, f12346d), composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    timePickerColorsM1401colorsu3YEpmA = TimePickerDefaults.INSTANCE.m1401colorsu3YEpmA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 24576, 16383);
                }
                modifier2 = modifier3;
            } else {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    timePickerColorsM1401colorsu3YEpmA = TimePickerDefaults.INSTANCE.m1401colorsu3YEpmA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 24576, 16383);
                }
                modifier2 = modifier3;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(310683247, i12, -1, "androidx.compose.material3.VerticalTimePicker (TimePicker.kt:660)");
            }
            Alignment.Horizontal centerHorizontally3 = Alignment.INSTANCE.getCenterHorizontally();
            int i114 = i12 >> 3;
            int i115 = (i114 & 14) | BluetoothState.REQUEST_CONNECT_DEVICE;
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            int i116 = i115 >> 3;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally3, composerStartRestartGroup, (i116 & 112) | (i116 & 14));
            Density density3 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            constructor = companion5.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifier2);
            int i117 = ((((i115 << 3) & 112) << 9) & 7168) | 6;
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
            Composer composerM2074constructorimpl3 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl3, layoutDirection3, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion5, composerM2074constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM2074constructorimpl3, density3));
            ai.a.j((i117 >> 3) & 112, function3MaterializerOf3, androidx.appcompat.widget.g0.b(companion5, composerM2074constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            int i22 = (i12 & 14) | (i114 & 112);
            h(state, timePickerColorsM1401colorsu3YEpmA, composerStartRestartGroup, i22);
            Modifier.Companion companion6 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m321height3ABfNKs(companion6, f12345c), composerStartRestartGroup, 6);
            ClockFace(state, timePickerColorsM1401colorsu3YEpmA, z10, composerStartRestartGroup, i22 | (i114 & 896));
            SpacerKt.Spacer(SizeKt.m321height3ABfNKs(companion6, f12346d), composerStartRestartGroup, 6);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        timePickerColors2 = timePickerColorsM1401colorsu3YEpmA;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new y(state, modifier2, timePickerColors2, z10, i10, i11));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-934561141);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(timePickerState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-934561141, i11, -1, "androidx.compose.material3.ClockDisplayNumbers (TimePicker.kt:838)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{TextKt.getLocalTextStyle().provides(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), TimePickerTokens.INSTANCE.getTimeSelectorLabelTextFont()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -477913269, true, new a(timePickerState, timePickerColors, i11)), composerStartRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(timePickerState, timePickerColors, i10));
    }

    /* JADX INFO: renamed from: access$CircularLayout-uFdPcIQ, reason: not valid java name */
    public static final void m1404access$CircularLayoutuFdPcIQ(Modifier modifier, float f6, Function2 function2, Composer composer, int i10, int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(1548175696);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(f6) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1548175696, i12, -1, "androidx.compose.material3.CircularLayout (TimePicker.kt:1496)");
            }
            l0.o4 o4Var = new l0.o4(f6);
            int i14 = ((i12 >> 6) & 14) | ((i12 << 3) & 112);
            Density density = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier);
            int i15 = ((i14 << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl, o4Var, companion.getSetMeasurePolicy());
            Updater.m2081setimpl(composerM2074constructorimpl, density, companion.getSetDensity());
            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m2081setimpl(composerM2074constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            ai.a.j((i15 >> 3) & 112, function3MaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i15 >> 9) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new l0.p4(f6, i10, i11, modifier2, function2));
    }

    /* JADX WARN: Code duplicated, block: B:52:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:55:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:56:0x01be  */
    /* JADX WARN: Code duplicated, block: B:61:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:64:0x0238  */
    public static final void access$ClockText(TimePickerState timePickerState, int i10, boolean z10, Composer composer, int i11) {
        int i12;
        String str;
        Function0<ComposeUiNode> constructor;
        boolean zChanged;
        Object objRememberedValue;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1317232110);
        if ((i11 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(timePickerState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(i10) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= composerStartRestartGroup.changed(z10) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1317232110, i12, -1, "androidx.compose.material3.ClockText (TimePicker.kt:1285)");
            }
            TextStyle textStyleCopyAndSetFontPadding = IncludeFontPaddingHelper_androidKt.copyAndSetFontPadding(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), TimePickerTokens.INSTANCE.getClockDialLabelTextFont()), false);
            float fMo415toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(f12350h);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(Offset.m2264boximpl(Offset.INSTANCE.m2291getZeroF1C5BW0()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue2;
            Object objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
            if (objB == companion.getEmpty()) {
                objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            String strM1408numberContentDescriptionYKJpE6Y = m1408numberContentDescriptionYKJpE6Y(timePickerState.m1419getSelectionJiIwxys$material3_release(), timePickerState.getIs24hour(), i10, composerStartRestartGroup, (i12 << 3) & 896);
            String strJ = j(i10, 1);
            boolean zAreEqual = Selection.m1237equalsimpl0(timePickerState.m1419getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m1242getMinuteJiIwxys()) ? Intrinsics.areEqual(j(timePickerState.getMinute(), 1), strJ) : Intrinsics.areEqual(j(timePickerState.getHour(), 1), strJ);
            Alignment center = Alignment.INSTANCE.getCenter();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM335size3ABfNKs = SizeKt.m335size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(companion2), f12351i);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                str = strJ;
            } else {
                str = strJ;
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                String str2 = str;
                Modifier modifierSemantics = SemanticsModifierKt.semantics(FocusableKt.focusable$default(OnGloballyPositionedModifierKt.onGloballyPositioned(modifierM335size3ABfNKs, (Function1) objRememberedValue3), false, null, 3, null), true, new l0.t4(zAreEqual, coroutineScope, timePickerState, fMo415toPx0680j_4, z10, mutableState));
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                Density density = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierSemantics);
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
                Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl, density));
                ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(strM1408numberContentDescriptionYKJpE6Y);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new l0.u4(strM1408numberContentDescriptionYKJpE6Y);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
                TextKt.m1389Text4IGK_g(str2, SemanticsModifierKt.clearAndSetSemantics(companion2, (Function1) objRememberedValue), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleCopyAndSetFontPadding, composer2, 0, 0, 65532);
                if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            objRememberedValue3 = new l0.q4(mutableState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            composerStartRestartGroup.endReplaceableGroup();
            String str3 = str;
            Modifier modifierSemantics2 = SemanticsModifierKt.semantics(FocusableKt.focusable$default(OnGloballyPositionedModifierKt.onGloballyPositioned(modifierM335size3ABfNKs, (Function1) objRememberedValue3), false, null, 3, null), true, new l0.t4(zAreEqual, coroutineScope, timePickerState, fMo415toPx0680j_4, z10, mutableState));
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
            Density density2 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierSemantics2);
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
            Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion4, composerM2074constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, composerM2074constructorimpl2, density2));
            ai.a.j(0, function3MaterializerOf2, androidx.appcompat.widget.g0.b(companion4, composerM2074constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(strM1408numberContentDescriptionYKJpE6Y);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new l0.u4(strM1408numberContentDescriptionYKJpE6Y);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new l0.u4(strM1408numberContentDescriptionYKJpE6Y);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            TextKt.m1389Text4IGK_g(str3, SemanticsModifierKt.clearAndSetSemantics(companion2, (Function1) objRememberedValue), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleCopyAndSetFontPadding, composer2, 0, 0, 65532);
            if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new l0.v4(timePickerState, i10, z10, i11));
    }

    public static final void access$DisplaySeparator(Modifier modifier, Composer composer, int i10) {
        int i11;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2100674302);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2100674302, i10, -1, "androidx.compose.material3.DisplaySeparator (TimePicker.kt:1045)");
            }
            TextStyle textStyle = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
            TextStyle textStyleCopyAndSetFontPadding = IncludeFontPaddingHelper_androidKt.copyAndSetFontPadding(textStyle.m3981copyCXVQc50((3653631 & 1) != 0 ? textStyle.spanStyle.m3927getColor0d7_KjU() : 0L, (3653631 & 2) != 0 ? textStyle.spanStyle.getFontSize() : 0L, (3653631 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : null, (3653631 & 8) != 0 ? textStyle.spanStyle.getFontStyle() : null, (3653631 & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : null, (3653631 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : null, (3653631 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : null, (3653631 & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : 0L, (3653631 & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : null, (3653631 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : null, (3653631 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : null, (3653631 & 2048) != 0 ? textStyle.spanStyle.getBackground() : 0L, (3653631 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : null, (3653631 & 8192) != 0 ? textStyle.spanStyle.getShadow() : null, (3653631 & 16384) != 0 ? textStyle.paragraphStyle.getTextAlign() : TextAlign.m4289boximpl(TextAlign.INSTANCE.m4296getCentere0LSkKk()), (3653631 & 32768) != 0 ? textStyle.paragraphStyle.getTextDirection() : null, (3653631 & 65536) != 0 ? textStyle.paragraphStyle.getLineHeight() : 0L, (3653631 & 131072) != 0 ? textStyle.paragraphStyle.getTextIndent() : null, (3653631 & 262144) != 0 ? textStyle.platformStyle : null, (3653631 & 524288) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : new LineHeightStyle(LineHeightStyle.Alignment.INSTANCE.m4274getCenterPIaL0Z0(), LineHeightStyle.Trim.INSTANCE.m4285getBothEVpEnUU(), null), (3653631 & 1048576) != 0 ? textStyle.paragraphStyle.getLineBreak() : null, (3653631 & 2097152) != 0 ? textStyle.paragraphStyle.getHyphens() : null), false);
            Modifier modifierClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, l0.w4.f83027p0);
            Alignment center = Alignment.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
            Density density = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierClearAndSetSemantics);
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
            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl, density));
            ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m1389Text4IGK_g(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, (Modifier) null, ColorSchemeKt.toColor(TimeInputTokens.INSTANCE.getTimeFieldSeparatorColor(), composerStartRestartGroup, 6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleCopyAndSetFontPadding, composer2, 6, 0, 65530);
            if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new l0.x4(modifier, i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final TextFieldValue access$TimeInputImpl$lambda$5(MutableState mutableState) {
        return (TextFieldValue) mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final TextFieldValue access$TimeInputImpl$lambda$8(MutableState mutableState) {
        return (TextFieldValue) mutableState.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x013e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0158  */
    /* JADX WARN: Code duplicated, block: B:108:0x0243  */
    /* JADX WARN: Code duplicated, block: B:111:0x024f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0253  */
    /* JADX WARN: Code duplicated, block: B:115:0x027c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0298  */
    /* JADX WARN: Code duplicated, block: B:118:0x029d  */
    /* JADX WARN: Code duplicated, block: B:120:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:123:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:124:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:127:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:128:0x0302  */
    /* JADX WARN: Code duplicated, block: B:131:0x0345  */
    /* JADX WARN: Code duplicated, block: B:134:0x0351  */
    /* JADX WARN: Code duplicated, block: B:135:0x0355  */
    /* JADX WARN: Code duplicated, block: B:138:0x0394  */
    /* JADX WARN: Code duplicated, block: B:140:0x039a  */
    /* JADX WARN: Code duplicated, block: B:143:0x04da  */
    /* JADX WARN: Code duplicated, block: B:145:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:148:0x0565  */
    /* JADX WARN: Code duplicated, block: B:150:0x056b  */
    /* JADX WARN: Code duplicated, block: B:153:0x0584  */
    /* JADX WARN: Code duplicated, block: B:158:0x0592  */
    /* JADX WARN: Code duplicated, block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:91:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0108  */
    /* JADX WARN: Code duplicated, block: B:93:0x0111  */
    /* JADX WARN: Code duplicated, block: B:95:0x0115  */
    /* JADX WARN: Code duplicated, block: B:96:0x011e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0126  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: access$TimePickerTextField-lxUZ_iY, reason: not valid java name */
    public static final void m1405access$TimePickerTextFieldlxUZ_iY(Modifier modifier, TextFieldValue textFieldValue, Function1 function1, TimePickerState timePickerState, int i10, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, TimePickerColors timePickerColors, Composer composer, int i11, int i12) {
        int i13;
        KeyboardOptions keyboardOptions2;
        int i14;
        KeyboardActions keyboardActions2;
        int i15;
        int i16;
        int i17;
        KeyboardOptions keyboardOptions3;
        KeyboardActions keyboardActions3;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        FocusRequester focusRequester;
        TextFieldColors textFieldColorsM1193colors0hiis_0;
        final boolean zM1237equalsimpl0;
        Function0<ComposeUiNode> constructor;
        TextFieldColors textFieldColors;
        int i18;
        Selection.Companion companion2;
        int iM1311getTimePickerHourTextFieldadMyvUU;
        String strM1320getStringNWtq28;
        Function1<InspectorInfo, Unit> noInspectorInfo;
        Function0<ComposeUiNode> constructor2;
        boolean zChanged;
        Object objRememberedValue3;
        int iM1312getTimePickerMinuteadMyvUU;
        Composer composer2;
        boolean zChanged2;
        Object objRememberedValue4;
        KeyboardOptions keyboardOptions4;
        KeyboardActions keyboardActions4;
        int minute;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-367523658);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= composerStartRestartGroup.changed(textFieldValue) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i11 & 896) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            i13 |= composerStartRestartGroup.changed(timePickerState) ? 2048 : 1024;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i11 & 57344) == 0) {
            i13 |= composerStartRestartGroup.changed(i10) ? 16384 : 8192;
        }
        int i19 = i12 & 32;
        if (i19 == 0) {
            if ((458752 & i11) == 0) {
                keyboardOptions2 = keyboardOptions;
                i13 |= composerStartRestartGroup.changed(keyboardOptions2) ? 131072 : 65536;
            }
            i14 = i12 & 64;
            if (i14 != 0) {
                i13 |= 1572864;
                keyboardActions2 = keyboardActions;
            } else {
                keyboardActions2 = keyboardActions;
                if ((i11 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(keyboardActions2)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i13 |= i15;
                }
            }
            if ((i12 & 128) != 0) {
                if ((i11 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(timePickerColors)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                }
                i17 = i13;
                if ((23967451 & i17) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                    if (i19 != 0) {
                        keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                    } else {
                        keyboardOptions3 = keyboardOptions2;
                    }
                    if (i14 != 0) {
                        keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                    } else {
                        keyboardActions3 = keyboardActions2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-367523658, i17, -1, "androidx.compose.material3.TimePickerTextField (TimePicker.kt:1385)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new FocusRequester();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    focusRequester = (FocusRequester) objRememberedValue2;
                    textFieldColorsM1193colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m1193colors0hiis_0(timePickerColors.m1400timeSelectorContentColorvNxB06k$material3_release(true), 0L, 0L, 0L, timePickerColors.m1399timeSelectorContainerColorvNxB06k$material3_release(true), timePickerColors.m1399timeSelectorContainerColorvNxB06k$material3_release(true), 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, 3072, 2147483598, 4095);
                    zM1237equalsimpl0 = Selection.m1237equalsimpl0(i10, timePickerState.m1419getSelectionJiIwxys$material3_release());
                    int i20 = i17 & 14;
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    int i21 = i20 >> 3;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, (i21 & 14) | (i21 & 112));
                    Density density = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
                    LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    constructor = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier);
                    int i22 = ((((i20 << 3) & 112) << 9) & 7168) | 6;
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
                    Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion4, composerM2074constructorimpl, measurePolicyColumnMeasurePolicy, composerM2074constructorimpl, density));
                    ai.a.j((i22 >> 3) & 112, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion4, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(896149777);
                    if (zM1237equalsimpl0) {
                        textFieldColors = textFieldColorsM1193colors0hiis_0;
                        i18 = -1323940314;
                    } else {
                        Modifier.Companion companion5 = Modifier.INSTANCE;
                        TimeInputTokens timeInputTokens = TimeInputTokens.INSTANCE;
                        Modifier modifierM337sizeVpY3zN4 = SizeKt.m337sizeVpY3zN4(companion5, timeInputTokens.m1979getTimeFieldContainerWidthD9Ej5fM(), timeInputTokens.m1978getTimeFieldContainerHeightD9Ej5fM());
                        if (Selection.m1237equalsimpl0(i10, Selection.INSTANCE.m1241getHourJiIwxys())) {
                            minute = timePickerState.getHourForDisplay$material3_release();
                        } else {
                            minute = timePickerState.getMinute();
                        }
                        int i23 = i17 >> 3;
                        i18 = -1323940314;
                        textFieldColors = textFieldColorsM1193colors0hiis_0;
                        f(modifierM337sizeVpY3zN4, minute, timePickerState, i10, timePickerColors, composerStartRestartGroup, (i23 & 7168) | (i23 & 896) | 6 | ((i17 >> 9) & 57344));
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    companion2 = Selection.INSTANCE;
                    if (Selection.m1237equalsimpl0(i10, companion2.m1242getMinuteJiIwxys())) {
                        iM1311getTimePickerHourTextFieldadMyvUU = Strings.INSTANCE.m1315getTimePickerMinuteTextFieldadMyvUU();
                    } else {
                        iM1311getTimePickerHourTextFieldadMyvUU = Strings.INSTANCE.m1311getTimePickerHourTextFieldadMyvUU();
                    }
                    strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(iM1311getTimePickerHourTextFieldadMyvUU, composerStartRestartGroup, 0);
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                        noInspectorInfo = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.TimePickerKt$visible$$inlined$debugInspectorInfo$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                                androidx.activity.a.c(inspectorInfo, "$this$null", "visible").set("visible", Boolean.valueOf(zM1237equalsimpl0));
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                                invoke2(inspectorInfo);
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                    }
                    Modifier modifierThen = companion6.then(new y5(zM1237equalsimpl0, noInspectorInfo));
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion3, false, composerStartRestartGroup, 0, i18);
                    Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierThen);
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
                    Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion4, composerM2074constructorimpl2, measurePolicyC, composerM2074constructorimpl2, density2));
                    ai.a.j(0, function3MaterializerOf2, androidx.appcompat.widget.g0.b(companion4, composerM2074constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(companion6, r18);
                    TimeInputTokens timeInputTokens2 = TimeInputTokens.INSTANCE;
                    Modifier modifierM337sizeVpY3zN5 = SizeKt.m337sizeVpY3zN4(modifierFocusRequester, timeInputTokens2.m1979getTimeFieldContainerWidthD9Ej5fM(), timeInputTokens2.m1978getTimeFieldContainerHeightD9Ej5fM());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new l0.a5(strM1320getStringNWtq28);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierM337sizeVpY3zN5, false, (Function1) objRememberedValue3, 1, null);
                    TextStyle textStyle = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                    Brush.Companion companion7 = Brush.INSTANCE;
                    Float fValueOf = Float.valueOf(0.0f);
                    Color.Companion companion8 = Color.INSTANCE;
                    Float fValueOf2 = Float.valueOf(0.1f);
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    Brush brushM2472verticalGradient8A3gB4$default = Brush.Companion.m2472verticalGradient8A3gB4$default(companion7, new Pair[]{TuplesKt.to(fValueOf, Color.m2498boximpl(companion8.m2543getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(0.1f), Color.m2498boximpl(companion8.m2543getTransparent0d7_KjU())), TuplesKt.to(fValueOf2, Color.m2498boximpl(materialTheme.getColorScheme(composerStartRestartGroup, 6).m973getPrimary0d7_KjU())), TuplesKt.to(Float.valueOf(0.9f), Color.m2498boximpl(materialTheme.getColorScheme(composerStartRestartGroup, 6).m973getPrimary0d7_KjU())), TuplesKt.to(Float.valueOf(0.9f), Color.m2498boximpl(companion8.m2543getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(1.0f), Color.m2498boximpl(companion8.m2543getTransparent0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null);
                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2133555260, true, new l0.c5(textFieldValue, mutableInteractionSource, textFieldColors));
                    int i24 = i17 >> 3;
                    int i25 = i17 << 3;
                    BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifierSemantics$default, true, false, textStyle, keyboardOptions3, keyboardActions3, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource, brushM2472verticalGradient8A3gB4$default, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) composableLambda, composerStartRestartGroup, (i24 & 14) | 100666368 | (i24 & 112) | (i25 & 3670016) | (i25 & 29360128), 199680, 7696);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(OffsetKt.m270offsetVpY3zN4$default(companion6, 0.0f, f12348f, 1, null), l0.d5.f82498p0);
                    if (Selection.m1237equalsimpl0(i10, companion2.m1241getHourJiIwxys())) {
                        iM1312getTimePickerMinuteadMyvUU = Strings.INSTANCE.m1308getTimePickerHouradMyvUU();
                    } else {
                        iM1312getTimePickerMinuteadMyvUU = Strings.INSTANCE.m1312getTimePickerMinuteadMyvUU();
                    }
                    TextKt.m1389Text4IGK_g(Strings_androidKt.m1320getStringNWtq28(iM1312getTimePickerMinuteadMyvUU, composerStartRestartGroup, 0), modifierClearAndSetSemantics, ColorSchemeKt.toColor(timeInputTokens2.getTimeFieldSupportingTextColor(), composerStartRestartGroup, 6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyKt.fromToken(materialTheme.getTypography(composerStartRestartGroup, 6), timeInputTokens2.getTimeFieldSupportingTextFont()), composerStartRestartGroup, 0, 0, 65528);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    Selection selectionM1235boximpl = Selection.m1235boximpl(timePickerState.m1419getSelectionJiIwxys$material3_release());
                    Selection selectionM1235boximpl2 = Selection.m1235boximpl(i10);
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(1618982084);
                    zChanged2 = composer2.changed(selectionM1235boximpl2) | composer2.changed(timePickerState) | composer2.changed(focusRequester);
                    objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new l0.e5(timePickerState, i10, focusRequester, null);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(selectionM1235boximpl, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer2, 64);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    keyboardOptions4 = keyboardOptions3;
                    keyboardActions4 = keyboardActions3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    keyboardOptions4 = keyboardOptions2;
                    keyboardActions4 = keyboardActions2;
                    composer2 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new l0.f5(modifier, textFieldValue, function1, timePickerState, i10, keyboardOptions4, keyboardActions4, timePickerColors, i11, i12));
            }
            i16 = 12582912;
            i13 |= i16;
            i17 = i13;
            if ((23967451 & i17) == 4793490) {
                if (i19 != 0) {
                    keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                } else {
                    keyboardOptions3 = keyboardOptions2;
                }
                if (i14 != 0) {
                    keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                } else {
                    keyboardActions3 = keyboardActions2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-367523658, i17, -1, "androidx.compose.material3.TimePickerTextField (TimePicker.kt:1385)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new FocusRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                focusRequester = (FocusRequester) objRememberedValue2;
                textFieldColorsM1193colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m1193colors0hiis_0(timePickerColors.m1400timeSelectorContentColorvNxB06k$material3_release(true), 0L, 0L, 0L, timePickerColors.m1399timeSelectorContainerColorvNxB06k$material3_release(true), timePickerColors.m1399timeSelectorContainerColorvNxB06k$material3_release(true), 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, 3072, 2147483598, 4095);
                zM1237equalsimpl0 = Selection.m1237equalsimpl0(i10, timePickerState.m1419getSelectionJiIwxys$material3_release());
                int i26 = i17 & 14;
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion9 = Alignment.INSTANCE;
                int i27 = i26 >> 3;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(top2, companion9.getStart(), composerStartRestartGroup, (i27 & 14) | (i27 & 112));
                Density density3 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                constructor = companion10.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifier);
                int i28 = ((((i26 << 3) & 112) << 9) & 7168) | 6;
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
                Composer composerM2074constructorimpl3 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl3, layoutDirection3, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion10, composerM2074constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM2074constructorimpl3, density3));
                ai.a.j((i28 >> 3) & 112, function3MaterializerOf3, androidx.appcompat.widget.g0.b(companion10, composerM2074constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(896149777);
                if (zM1237equalsimpl0) {
                    Modifier.Companion companion11 = Modifier.INSTANCE;
                    TimeInputTokens timeInputTokens3 = TimeInputTokens.INSTANCE;
                    Modifier modifierM337sizeVpY3zN6 = SizeKt.m337sizeVpY3zN4(companion11, timeInputTokens3.m1979getTimeFieldContainerWidthD9Ej5fM(), timeInputTokens3.m1978getTimeFieldContainerHeightD9Ej5fM());
                    if (Selection.m1237equalsimpl0(i10, Selection.INSTANCE.m1241getHourJiIwxys())) {
                        minute = timePickerState.getHourForDisplay$material3_release();
                    } else {
                        minute = timePickerState.getMinute();
                    }
                    int i29 = i17 >> 3;
                    i18 = -1323940314;
                    textFieldColors = textFieldColorsM1193colors0hiis_0;
                    f(modifierM337sizeVpY3zN6, minute, timePickerState, i10, timePickerColors, composerStartRestartGroup, (i29 & 7168) | (i29 & 896) | 6 | ((i17 >> 9) & 57344));
                } else {
                    textFieldColors = textFieldColorsM1193colors0hiis_0;
                    i18 = -1323940314;
                }
                composerStartRestartGroup.endReplaceableGroup();
                companion2 = Selection.INSTANCE;
                if (Selection.m1237equalsimpl0(i10, companion2.m1242getMinuteJiIwxys())) {
                    iM1311getTimePickerHourTextFieldadMyvUU = Strings.INSTANCE.m1315getTimePickerMinuteTextFieldadMyvUU();
                } else {
                    iM1311getTimePickerHourTextFieldadMyvUU = Strings.INSTANCE.m1311getTimePickerHourTextFieldadMyvUU();
                }
                strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(iM1311getTimePickerHourTextFieldadMyvUU, composerStartRestartGroup, 0);
                Modifier.Companion companion12 = Modifier.INSTANCE;
                if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                    noInspectorInfo = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.TimePickerKt$visible$$inlined$debugInspectorInfo$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                            androidx.activity.a.c(inspectorInfo, "$this$null", "visible").set("visible", Boolean.valueOf(zM1237equalsimpl0));
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                            invoke2(inspectorInfo);
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                }
                Modifier modifierThen2 = companion12.then(new y5(zM1237equalsimpl0, noInspectorInfo));
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC2 = androidx.databinding.f.c(companion9, false, composerStartRestartGroup, 0, i18);
                Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion10.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierThen2);
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
                Composer composerM2074constructorimpl4 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl4, layoutDirection4, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion10, composerM2074constructorimpl4, measurePolicyC2, composerM2074constructorimpl4, density4));
                ai.a.j(0, function3MaterializerOf4, androidx.appcompat.widget.g0.b(companion10, composerM2074constructorimpl4, viewConfiguration4, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                Modifier modifierFocusRequester2 = FocusRequesterModifierKt.focusRequester(companion12, r18);
                TimeInputTokens timeInputTokens4 = TimeInputTokens.INSTANCE;
                Modifier modifierM337sizeVpY3zN7 = SizeKt.m337sizeVpY3zN4(modifierFocusRequester2, timeInputTokens4.m1979getTimeFieldContainerWidthD9Ej5fM(), timeInputTokens4.m1978getTimeFieldContainerHeightD9Ej5fM());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new l0.a5(strM1320getStringNWtq28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new l0.a5(strM1320getStringNWtq28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics$default2 = SemanticsModifierKt.semantics$default(modifierM337sizeVpY3zN7, false, (Function1) objRememberedValue3, 1, null);
                TextStyle textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                Brush.Companion companion13 = Brush.INSTANCE;
                Float fValueOf3 = Float.valueOf(0.0f);
                Color.Companion companion14 = Color.INSTANCE;
                Float fValueOf4 = Float.valueOf(0.1f);
                MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                Brush brushM2472verticalGradient8A3gB4$default2 = Brush.Companion.m2472verticalGradient8A3gB4$default(companion13, new Pair[]{TuplesKt.to(fValueOf3, Color.m2498boximpl(companion14.m2543getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(0.1f), Color.m2498boximpl(companion14.m2543getTransparent0d7_KjU())), TuplesKt.to(fValueOf4, Color.m2498boximpl(materialTheme2.getColorScheme(composerStartRestartGroup, 6).m973getPrimary0d7_KjU())), TuplesKt.to(Float.valueOf(0.9f), Color.m2498boximpl(materialTheme2.getColorScheme(composerStartRestartGroup, 6).m973getPrimary0d7_KjU())), TuplesKt.to(Float.valueOf(0.9f), Color.m2498boximpl(companion14.m2543getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(1.0f), Color.m2498boximpl(companion14.m2543getTransparent0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null);
                ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2133555260, true, new l0.c5(textFieldValue, mutableInteractionSource2, textFieldColors));
                int i210 = i17 >> 3;
                int i211 = i17 << 3;
                BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifierSemantics$default2, true, false, textStyle2, keyboardOptions3, keyboardActions3, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource2, brushM2472verticalGradient8A3gB4$default2, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) composableLambda2, composerStartRestartGroup, (i210 & 14) | 100666368 | (i210 & 112) | (i211 & 3670016) | (i211 & 29360128), 199680, 7696);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierClearAndSetSemantics2 = SemanticsModifierKt.clearAndSetSemantics(OffsetKt.m270offsetVpY3zN4$default(companion12, 0.0f, f12348f, 1, null), l0.d5.f82498p0);
                if (Selection.m1237equalsimpl0(i10, companion2.m1241getHourJiIwxys())) {
                    iM1312getTimePickerMinuteadMyvUU = Strings.INSTANCE.m1308getTimePickerHouradMyvUU();
                } else {
                    iM1312getTimePickerMinuteadMyvUU = Strings.INSTANCE.m1312getTimePickerMinuteadMyvUU();
                }
                TextKt.m1389Text4IGK_g(Strings_androidKt.m1320getStringNWtq28(iM1312getTimePickerMinuteadMyvUU, composerStartRestartGroup, 0), modifierClearAndSetSemantics2, ColorSchemeKt.toColor(timeInputTokens4.getTimeFieldSupportingTextColor(), composerStartRestartGroup, 6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyKt.fromToken(materialTheme2.getTypography(composerStartRestartGroup, 6), timeInputTokens4.getTimeFieldSupportingTextFont()), composerStartRestartGroup, 0, 0, 65528);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                Selection selectionM1235boximpl3 = Selection.m1235boximpl(timePickerState.m1419getSelectionJiIwxys$material3_release());
                Selection selectionM1235boximpl4 = Selection.m1235boximpl(i10);
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(1618982084);
                zChanged2 = composer2.changed(selectionM1235boximpl4) | composer2.changed(timePickerState) | composer2.changed(focusRequester);
                objRememberedValue4 = composer2.rememberedValue();
                if (zChanged2) {
                    objRememberedValue4 = new l0.e5(timePickerState, i10, focusRequester, null);
                    composer2.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new l0.e5(timePickerState, i10, focusRequester, null);
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceableGroup();
                EffectsKt.LaunchedEffect(selectionM1235boximpl3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer2, 64);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                keyboardOptions4 = keyboardOptions3;
                keyboardActions4 = keyboardActions3;
            } else {
                if (i19 != 0) {
                    keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                } else {
                    keyboardOptions3 = keyboardOptions2;
                }
                if (i14 != 0) {
                    keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                } else {
                    keyboardActions3 = keyboardActions2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-367523658, i17, -1, "androidx.compose.material3.TimePickerTextField (TimePicker.kt:1385)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableInteractionSource mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new FocusRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                focusRequester = (FocusRequester) objRememberedValue2;
                textFieldColorsM1193colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m1193colors0hiis_0(timePickerColors.m1400timeSelectorContentColorvNxB06k$material3_release(true), 0L, 0L, 0L, timePickerColors.m1399timeSelectorContainerColorvNxB06k$material3_release(true), timePickerColors.m1399timeSelectorContainerColorvNxB06k$material3_release(true), 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, 3072, 2147483598, 4095);
                zM1237equalsimpl0 = Selection.m1237equalsimpl0(i10, timePickerState.m1419getSelectionJiIwxys$material3_release());
                int i212 = i17 & 14;
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Arrangement.Vertical top3 = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion15 = Alignment.INSTANCE;
                int i213 = i212 >> 3;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(top3, companion15.getStart(), composerStartRestartGroup, (i213 & 14) | (i213 & 112));
                Density density5 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
                constructor = companion16.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifier);
                int i214 = ((((i212 << 3) & 112) << 9) & 7168) | 6;
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
                Composer composerM2074constructorimpl5 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl5, layoutDirection5, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion16, composerM2074constructorimpl5, measurePolicyColumnMeasurePolicy3, composerM2074constructorimpl5, density5));
                ai.a.j((i214 >> 3) & 112, function3MaterializerOf5, androidx.appcompat.widget.g0.b(companion16, composerM2074constructorimpl5, viewConfiguration5, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(896149777);
                if (zM1237equalsimpl0) {
                    Modifier.Companion companion17 = Modifier.INSTANCE;
                    TimeInputTokens timeInputTokens5 = TimeInputTokens.INSTANCE;
                    Modifier modifierM337sizeVpY3zN8 = SizeKt.m337sizeVpY3zN4(companion17, timeInputTokens5.m1979getTimeFieldContainerWidthD9Ej5fM(), timeInputTokens5.m1978getTimeFieldContainerHeightD9Ej5fM());
                    if (Selection.m1237equalsimpl0(i10, Selection.INSTANCE.m1241getHourJiIwxys())) {
                        minute = timePickerState.getHourForDisplay$material3_release();
                    } else {
                        minute = timePickerState.getMinute();
                    }
                    int i215 = i17 >> 3;
                    i18 = -1323940314;
                    textFieldColors = textFieldColorsM1193colors0hiis_0;
                    f(modifierM337sizeVpY3zN8, minute, timePickerState, i10, timePickerColors, composerStartRestartGroup, (i215 & 7168) | (i215 & 896) | 6 | ((i17 >> 9) & 57344));
                } else {
                    textFieldColors = textFieldColorsM1193colors0hiis_0;
                    i18 = -1323940314;
                }
                composerStartRestartGroup.endReplaceableGroup();
                companion2 = Selection.INSTANCE;
                if (Selection.m1237equalsimpl0(i10, companion2.m1242getMinuteJiIwxys())) {
                    iM1311getTimePickerHourTextFieldadMyvUU = Strings.INSTANCE.m1315getTimePickerMinuteTextFieldadMyvUU();
                } else {
                    iM1311getTimePickerHourTextFieldadMyvUU = Strings.INSTANCE.m1311getTimePickerHourTextFieldadMyvUU();
                }
                strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(iM1311getTimePickerHourTextFieldadMyvUU, composerStartRestartGroup, 0);
                Modifier.Companion companion18 = Modifier.INSTANCE;
                if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                    noInspectorInfo = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.TimePickerKt$visible$$inlined$debugInspectorInfo$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                            androidx.activity.a.c(inspectorInfo, "$this$null", "visible").set("visible", Boolean.valueOf(zM1237equalsimpl0));
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                            invoke2(inspectorInfo);
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                }
                Modifier modifierThen3 = companion18.then(new y5(zM1237equalsimpl0, noInspectorInfo));
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC3 = androidx.databinding.f.c(companion15, false, composerStartRestartGroup, 0, i18);
                Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration6 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion16.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(modifierThen3);
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
                Composer composerM2074constructorimpl6 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl6, layoutDirection6, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion16, composerM2074constructorimpl6, measurePolicyC3, composerM2074constructorimpl6, density6));
                ai.a.j(0, function3MaterializerOf6, androidx.appcompat.widget.g0.b(companion16, composerM2074constructorimpl6, viewConfiguration6, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                Modifier modifierFocusRequester3 = FocusRequesterModifierKt.focusRequester(companion18, r18);
                TimeInputTokens timeInputTokens6 = TimeInputTokens.INSTANCE;
                Modifier modifierM337sizeVpY3zN9 = SizeKt.m337sizeVpY3zN4(modifierFocusRequester3, timeInputTokens6.m1979getTimeFieldContainerWidthD9Ej5fM(), timeInputTokens6.m1978getTimeFieldContainerHeightD9Ej5fM());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new l0.a5(strM1320getStringNWtq28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new l0.a5(strM1320getStringNWtq28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics$default3 = SemanticsModifierKt.semantics$default(modifierM337sizeVpY3zN9, false, (Function1) objRememberedValue3, 1, null);
                TextStyle textStyle3 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                Brush.Companion companion19 = Brush.INSTANCE;
                Float fValueOf5 = Float.valueOf(0.0f);
                Color.Companion companion110 = Color.INSTANCE;
                Float fValueOf6 = Float.valueOf(0.1f);
                MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                Brush brushM2472verticalGradient8A3gB4$default3 = Brush.Companion.m2472verticalGradient8A3gB4$default(companion19, new Pair[]{TuplesKt.to(fValueOf5, Color.m2498boximpl(companion110.m2543getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(0.1f), Color.m2498boximpl(companion110.m2543getTransparent0d7_KjU())), TuplesKt.to(fValueOf6, Color.m2498boximpl(materialTheme3.getColorScheme(composerStartRestartGroup, 6).m973getPrimary0d7_KjU())), TuplesKt.to(Float.valueOf(0.9f), Color.m2498boximpl(materialTheme3.getColorScheme(composerStartRestartGroup, 6).m973getPrimary0d7_KjU())), TuplesKt.to(Float.valueOf(0.9f), Color.m2498boximpl(companion110.m2543getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(1.0f), Color.m2498boximpl(companion110.m2543getTransparent0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null);
                ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2133555260, true, new l0.c5(textFieldValue, mutableInteractionSource3, textFieldColors));
                int i216 = i17 >> 3;
                int i217 = i17 << 3;
                BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifierSemantics$default3, true, false, textStyle3, keyboardOptions3, keyboardActions3, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource3, brushM2472verticalGradient8A3gB4$default3, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) composableLambda3, composerStartRestartGroup, (i216 & 14) | 100666368 | (i216 & 112) | (i217 & 3670016) | (i217 & 29360128), 199680, 7696);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierClearAndSetSemantics3 = SemanticsModifierKt.clearAndSetSemantics(OffsetKt.m270offsetVpY3zN4$default(companion18, 0.0f, f12348f, 1, null), l0.d5.f82498p0);
                if (Selection.m1237equalsimpl0(i10, companion2.m1241getHourJiIwxys())) {
                    iM1312getTimePickerMinuteadMyvUU = Strings.INSTANCE.m1308getTimePickerHouradMyvUU();
                } else {
                    iM1312getTimePickerMinuteadMyvUU = Strings.INSTANCE.m1312getTimePickerMinuteadMyvUU();
                }
                TextKt.m1389Text4IGK_g(Strings_androidKt.m1320getStringNWtq28(iM1312getTimePickerMinuteadMyvUU, composerStartRestartGroup, 0), modifierClearAndSetSemantics3, ColorSchemeKt.toColor(timeInputTokens6.getTimeFieldSupportingTextColor(), composerStartRestartGroup, 6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyKt.fromToken(materialTheme3.getTypography(composerStartRestartGroup, 6), timeInputTokens6.getTimeFieldSupportingTextFont()), composerStartRestartGroup, 0, 0, 65528);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                Selection selectionM1235boximpl5 = Selection.m1235boximpl(timePickerState.m1419getSelectionJiIwxys$material3_release());
                Selection selectionM1235boximpl6 = Selection.m1235boximpl(i10);
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(1618982084);
                zChanged2 = composer2.changed(selectionM1235boximpl6) | composer2.changed(timePickerState) | composer2.changed(focusRequester);
                objRememberedValue4 = composer2.rememberedValue();
                if (zChanged2) {
                    objRememberedValue4 = new l0.e5(timePickerState, i10, focusRequester, null);
                    composer2.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new l0.e5(timePickerState, i10, focusRequester, null);
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceableGroup();
                EffectsKt.LaunchedEffect(selectionM1235boximpl5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer2, 64);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                keyboardOptions4 = keyboardOptions3;
                keyboardActions4 = keyboardActions3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new l0.f5(modifier, textFieldValue, function1, timePickerState, i10, keyboardOptions4, keyboardActions4, timePickerColors, i11, i12));
        }
        i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        keyboardOptions2 = keyboardOptions;
        i14 = i12 & 64;
        if (i14 != 0) {
            i13 |= 1572864;
            keyboardActions2 = keyboardActions;
        } else {
            keyboardActions2 = keyboardActions;
            if ((i11 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(keyboardActions2)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i13 |= i15;
            }
        }
        if ((i12 & 128) != 0) {
            if ((i11 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(timePickerColors)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
            }
            i17 = i13;
            if ((23967451 & i17) == 4793490) {
                if (i19 != 0) {
                    keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                } else {
                    keyboardOptions3 = keyboardOptions2;
                }
                if (i14 != 0) {
                    keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                } else {
                    keyboardActions3 = keyboardActions2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-367523658, i17, -1, "androidx.compose.material3.TimePickerTextField (TimePicker.kt:1385)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableInteractionSource mutableInteractionSource4 = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new FocusRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                focusRequester = (FocusRequester) objRememberedValue2;
                textFieldColorsM1193colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m1193colors0hiis_0(timePickerColors.m1400timeSelectorContentColorvNxB06k$material3_release(true), 0L, 0L, 0L, timePickerColors.m1399timeSelectorContainerColorvNxB06k$material3_release(true), timePickerColors.m1399timeSelectorContainerColorvNxB06k$material3_release(true), 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, 3072, 2147483598, 4095);
                zM1237equalsimpl0 = Selection.m1237equalsimpl0(i10, timePickerState.m1419getSelectionJiIwxys$material3_release());
                int i218 = i17 & 14;
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Arrangement.Vertical top4 = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion111 = Alignment.INSTANCE;
                int i219 = i218 >> 3;
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(top4, companion111.getStart(), composerStartRestartGroup, (i219 & 14) | (i219 & 112));
                Density density7 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection7 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration7 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion112 = ComposeUiNode.INSTANCE;
                constructor = companion112.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf7 = LayoutKt.materializerOf(modifier);
                int i2110 = ((((i218 << 3) & 112) << 9) & 7168) | 6;
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
                Composer composerM2074constructorimpl7 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl7, layoutDirection7, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion112, composerM2074constructorimpl7, measurePolicyColumnMeasurePolicy4, composerM2074constructorimpl7, density7));
                ai.a.j((i2110 >> 3) & 112, function3MaterializerOf7, androidx.appcompat.widget.g0.b(companion112, composerM2074constructorimpl7, viewConfiguration7, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(896149777);
                if (zM1237equalsimpl0) {
                    Modifier.Companion companion113 = Modifier.INSTANCE;
                    TimeInputTokens timeInputTokens7 = TimeInputTokens.INSTANCE;
                    Modifier modifierM337sizeVpY3zN10 = SizeKt.m337sizeVpY3zN4(companion113, timeInputTokens7.m1979getTimeFieldContainerWidthD9Ej5fM(), timeInputTokens7.m1978getTimeFieldContainerHeightD9Ej5fM());
                    if (Selection.m1237equalsimpl0(i10, Selection.INSTANCE.m1241getHourJiIwxys())) {
                        minute = timePickerState.getHourForDisplay$material3_release();
                    } else {
                        minute = timePickerState.getMinute();
                    }
                    int i2111 = i17 >> 3;
                    i18 = -1323940314;
                    textFieldColors = textFieldColorsM1193colors0hiis_0;
                    f(modifierM337sizeVpY3zN10, minute, timePickerState, i10, timePickerColors, composerStartRestartGroup, (i2111 & 7168) | (i2111 & 896) | 6 | ((i17 >> 9) & 57344));
                } else {
                    textFieldColors = textFieldColorsM1193colors0hiis_0;
                    i18 = -1323940314;
                }
                composerStartRestartGroup.endReplaceableGroup();
                companion2 = Selection.INSTANCE;
                if (Selection.m1237equalsimpl0(i10, companion2.m1242getMinuteJiIwxys())) {
                    iM1311getTimePickerHourTextFieldadMyvUU = Strings.INSTANCE.m1315getTimePickerMinuteTextFieldadMyvUU();
                } else {
                    iM1311getTimePickerHourTextFieldadMyvUU = Strings.INSTANCE.m1311getTimePickerHourTextFieldadMyvUU();
                }
                strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(iM1311getTimePickerHourTextFieldadMyvUU, composerStartRestartGroup, 0);
                Modifier.Companion companion114 = Modifier.INSTANCE;
                if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                    noInspectorInfo = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.TimePickerKt$visible$$inlined$debugInspectorInfo$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                            androidx.activity.a.c(inspectorInfo, "$this$null", "visible").set("visible", Boolean.valueOf(zM1237equalsimpl0));
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                            invoke2(inspectorInfo);
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                }
                Modifier modifierThen4 = companion114.then(new y5(zM1237equalsimpl0, noInspectorInfo));
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC4 = androidx.databinding.f.c(companion111, false, composerStartRestartGroup, 0, i18);
                Density density8 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection8 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration8 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion112.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf8 = LayoutKt.materializerOf(modifierThen4);
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
                Composer composerM2074constructorimpl8 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl8, layoutDirection8, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion112, composerM2074constructorimpl8, measurePolicyC4, composerM2074constructorimpl8, density8));
                ai.a.j(0, function3MaterializerOf8, androidx.appcompat.widget.g0.b(companion112, composerM2074constructorimpl8, viewConfiguration8, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                Modifier modifierFocusRequester4 = FocusRequesterModifierKt.focusRequester(companion114, r18);
                TimeInputTokens timeInputTokens8 = TimeInputTokens.INSTANCE;
                Modifier modifierM337sizeVpY3zN11 = SizeKt.m337sizeVpY3zN4(modifierFocusRequester4, timeInputTokens8.m1979getTimeFieldContainerWidthD9Ej5fM(), timeInputTokens8.m1978getTimeFieldContainerHeightD9Ej5fM());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new l0.a5(strM1320getStringNWtq28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new l0.a5(strM1320getStringNWtq28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics$default4 = SemanticsModifierKt.semantics$default(modifierM337sizeVpY3zN11, false, (Function1) objRememberedValue3, 1, null);
                TextStyle textStyle4 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                Brush.Companion companion115 = Brush.INSTANCE;
                Float fValueOf7 = Float.valueOf(0.0f);
                Color.Companion companion116 = Color.INSTANCE;
                Float fValueOf8 = Float.valueOf(0.1f);
                MaterialTheme materialTheme4 = MaterialTheme.INSTANCE;
                Brush brushM2472verticalGradient8A3gB4$default4 = Brush.Companion.m2472verticalGradient8A3gB4$default(companion115, new Pair[]{TuplesKt.to(fValueOf7, Color.m2498boximpl(companion116.m2543getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(0.1f), Color.m2498boximpl(companion116.m2543getTransparent0d7_KjU())), TuplesKt.to(fValueOf8, Color.m2498boximpl(materialTheme4.getColorScheme(composerStartRestartGroup, 6).m973getPrimary0d7_KjU())), TuplesKt.to(Float.valueOf(0.9f), Color.m2498boximpl(materialTheme4.getColorScheme(composerStartRestartGroup, 6).m973getPrimary0d7_KjU())), TuplesKt.to(Float.valueOf(0.9f), Color.m2498boximpl(companion116.m2543getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(1.0f), Color.m2498boximpl(companion116.m2543getTransparent0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null);
                ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2133555260, true, new l0.c5(textFieldValue, mutableInteractionSource4, textFieldColors));
                int i2112 = i17 >> 3;
                int i2113 = i17 << 3;
                BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifierSemantics$default4, true, false, textStyle4, keyboardOptions3, keyboardActions3, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource4, brushM2472verticalGradient8A3gB4$default4, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) composableLambda4, composerStartRestartGroup, (i2112 & 14) | 100666368 | (i2112 & 112) | (i2113 & 3670016) | (i2113 & 29360128), 199680, 7696);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierClearAndSetSemantics4 = SemanticsModifierKt.clearAndSetSemantics(OffsetKt.m270offsetVpY3zN4$default(companion114, 0.0f, f12348f, 1, null), l0.d5.f82498p0);
                if (Selection.m1237equalsimpl0(i10, companion2.m1241getHourJiIwxys())) {
                    iM1312getTimePickerMinuteadMyvUU = Strings.INSTANCE.m1308getTimePickerHouradMyvUU();
                } else {
                    iM1312getTimePickerMinuteadMyvUU = Strings.INSTANCE.m1312getTimePickerMinuteadMyvUU();
                }
                TextKt.m1389Text4IGK_g(Strings_androidKt.m1320getStringNWtq28(iM1312getTimePickerMinuteadMyvUU, composerStartRestartGroup, 0), modifierClearAndSetSemantics4, ColorSchemeKt.toColor(timeInputTokens8.getTimeFieldSupportingTextColor(), composerStartRestartGroup, 6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyKt.fromToken(materialTheme4.getTypography(composerStartRestartGroup, 6), timeInputTokens8.getTimeFieldSupportingTextFont()), composerStartRestartGroup, 0, 0, 65528);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                Selection selectionM1235boximpl7 = Selection.m1235boximpl(timePickerState.m1419getSelectionJiIwxys$material3_release());
                Selection selectionM1235boximpl8 = Selection.m1235boximpl(i10);
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(1618982084);
                zChanged2 = composer2.changed(selectionM1235boximpl8) | composer2.changed(timePickerState) | composer2.changed(focusRequester);
                objRememberedValue4 = composer2.rememberedValue();
                if (zChanged2) {
                    objRememberedValue4 = new l0.e5(timePickerState, i10, focusRequester, null);
                    composer2.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new l0.e5(timePickerState, i10, focusRequester, null);
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceableGroup();
                EffectsKt.LaunchedEffect(selectionM1235boximpl7, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer2, 64);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                keyboardOptions4 = keyboardOptions3;
                keyboardActions4 = keyboardActions3;
            } else {
                if (i19 != 0) {
                    keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
                } else {
                    keyboardOptions3 = keyboardOptions2;
                }
                if (i14 != 0) {
                    keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
                } else {
                    keyboardActions3 = keyboardActions2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-367523658, i17, -1, "androidx.compose.material3.TimePickerTextField (TimePicker.kt:1385)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableInteractionSource mutableInteractionSource5 = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new FocusRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                focusRequester = (FocusRequester) objRememberedValue2;
                textFieldColorsM1193colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m1193colors0hiis_0(timePickerColors.m1400timeSelectorContentColorvNxB06k$material3_release(true), 0L, 0L, 0L, timePickerColors.m1399timeSelectorContainerColorvNxB06k$material3_release(true), timePickerColors.m1399timeSelectorContainerColorvNxB06k$material3_release(true), 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, 3072, 2147483598, 4095);
                zM1237equalsimpl0 = Selection.m1237equalsimpl0(i10, timePickerState.m1419getSelectionJiIwxys$material3_release());
                int i2114 = i17 & 14;
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Arrangement.Vertical top5 = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion117 = Alignment.INSTANCE;
                int i2115 = i2114 >> 3;
                MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(top5, companion117.getStart(), composerStartRestartGroup, (i2115 & 14) | (i2115 & 112));
                Density density9 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection9 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration9 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion118 = ComposeUiNode.INSTANCE;
                constructor = companion118.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf9 = LayoutKt.materializerOf(modifier);
                int i2116 = ((((i2114 << 3) & 112) << 9) & 7168) | 6;
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
                Composer composerM2074constructorimpl9 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl9, layoutDirection9, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion118, composerM2074constructorimpl9, measurePolicyColumnMeasurePolicy5, composerM2074constructorimpl9, density9));
                ai.a.j((i2116 >> 3) & 112, function3MaterializerOf9, androidx.appcompat.widget.g0.b(companion118, composerM2074constructorimpl9, viewConfiguration9, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(896149777);
                if (zM1237equalsimpl0) {
                    Modifier.Companion companion119 = Modifier.INSTANCE;
                    TimeInputTokens timeInputTokens9 = TimeInputTokens.INSTANCE;
                    Modifier modifierM337sizeVpY3zN12 = SizeKt.m337sizeVpY3zN4(companion119, timeInputTokens9.m1979getTimeFieldContainerWidthD9Ej5fM(), timeInputTokens9.m1978getTimeFieldContainerHeightD9Ej5fM());
                    if (Selection.m1237equalsimpl0(i10, Selection.INSTANCE.m1241getHourJiIwxys())) {
                        minute = timePickerState.getHourForDisplay$material3_release();
                    } else {
                        minute = timePickerState.getMinute();
                    }
                    int i2117 = i17 >> 3;
                    i18 = -1323940314;
                    textFieldColors = textFieldColorsM1193colors0hiis_0;
                    f(modifierM337sizeVpY3zN12, minute, timePickerState, i10, timePickerColors, composerStartRestartGroup, (i2117 & 7168) | (i2117 & 896) | 6 | ((i17 >> 9) & 57344));
                } else {
                    textFieldColors = textFieldColorsM1193colors0hiis_0;
                    i18 = -1323940314;
                }
                composerStartRestartGroup.endReplaceableGroup();
                companion2 = Selection.INSTANCE;
                if (Selection.m1237equalsimpl0(i10, companion2.m1242getMinuteJiIwxys())) {
                    iM1311getTimePickerHourTextFieldadMyvUU = Strings.INSTANCE.m1315getTimePickerMinuteTextFieldadMyvUU();
                } else {
                    iM1311getTimePickerHourTextFieldadMyvUU = Strings.INSTANCE.m1311getTimePickerHourTextFieldadMyvUU();
                }
                strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(iM1311getTimePickerHourTextFieldadMyvUU, composerStartRestartGroup, 0);
                Modifier.Companion companion1110 = Modifier.INSTANCE;
                if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                    noInspectorInfo = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.TimePickerKt$visible$$inlined$debugInspectorInfo$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                            androidx.activity.a.c(inspectorInfo, "$this$null", "visible").set("visible", Boolean.valueOf(zM1237equalsimpl0));
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                            invoke2(inspectorInfo);
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
                }
                Modifier modifierThen5 = companion1110.then(new y5(zM1237equalsimpl0, noInspectorInfo));
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC5 = androidx.databinding.f.c(companion117, false, composerStartRestartGroup, 0, i18);
                Density density10 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection10 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration10 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion118.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf10 = LayoutKt.materializerOf(modifierThen5);
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
                Composer composerM2074constructorimpl10 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl10, layoutDirection10, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion118, composerM2074constructorimpl10, measurePolicyC5, composerM2074constructorimpl10, density10));
                ai.a.j(0, function3MaterializerOf10, androidx.appcompat.widget.g0.b(companion118, composerM2074constructorimpl10, viewConfiguration10, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                Modifier modifierFocusRequester5 = FocusRequesterModifierKt.focusRequester(companion1110, r18);
                TimeInputTokens timeInputTokens10 = TimeInputTokens.INSTANCE;
                Modifier modifierM337sizeVpY3zN13 = SizeKt.m337sizeVpY3zN4(modifierFocusRequester5, timeInputTokens10.m1979getTimeFieldContainerWidthD9Ej5fM(), timeInputTokens10.m1978getTimeFieldContainerHeightD9Ej5fM());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new l0.a5(strM1320getStringNWtq28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new l0.a5(strM1320getStringNWtq28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics$default5 = SemanticsModifierKt.semantics$default(modifierM337sizeVpY3zN13, false, (Function1) objRememberedValue3, 1, null);
                TextStyle textStyle5 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                Brush.Companion companion1111 = Brush.INSTANCE;
                Float fValueOf9 = Float.valueOf(0.0f);
                Color.Companion companion1112 = Color.INSTANCE;
                Float fValueOf10 = Float.valueOf(0.1f);
                MaterialTheme materialTheme5 = MaterialTheme.INSTANCE;
                Brush brushM2472verticalGradient8A3gB4$default5 = Brush.Companion.m2472verticalGradient8A3gB4$default(companion1111, new Pair[]{TuplesKt.to(fValueOf9, Color.m2498boximpl(companion1112.m2543getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(0.1f), Color.m2498boximpl(companion1112.m2543getTransparent0d7_KjU())), TuplesKt.to(fValueOf10, Color.m2498boximpl(materialTheme5.getColorScheme(composerStartRestartGroup, 6).m973getPrimary0d7_KjU())), TuplesKt.to(Float.valueOf(0.9f), Color.m2498boximpl(materialTheme5.getColorScheme(composerStartRestartGroup, 6).m973getPrimary0d7_KjU())), TuplesKt.to(Float.valueOf(0.9f), Color.m2498boximpl(companion1112.m2543getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(1.0f), Color.m2498boximpl(companion1112.m2543getTransparent0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null);
                ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2133555260, true, new l0.c5(textFieldValue, mutableInteractionSource5, textFieldColors));
                int i2118 = i17 >> 3;
                int i2119 = i17 << 3;
                BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifierSemantics$default5, true, false, textStyle5, keyboardOptions3, keyboardActions3, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, brushM2472verticalGradient8A3gB4$default5, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) composableLambda5, composerStartRestartGroup, (i2118 & 14) | 100666368 | (i2118 & 112) | (i2119 & 3670016) | (i2119 & 29360128), 199680, 7696);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierClearAndSetSemantics5 = SemanticsModifierKt.clearAndSetSemantics(OffsetKt.m270offsetVpY3zN4$default(companion1110, 0.0f, f12348f, 1, null), l0.d5.f82498p0);
                if (Selection.m1237equalsimpl0(i10, companion2.m1241getHourJiIwxys())) {
                    iM1312getTimePickerMinuteadMyvUU = Strings.INSTANCE.m1308getTimePickerHouradMyvUU();
                } else {
                    iM1312getTimePickerMinuteadMyvUU = Strings.INSTANCE.m1312getTimePickerMinuteadMyvUU();
                }
                TextKt.m1389Text4IGK_g(Strings_androidKt.m1320getStringNWtq28(iM1312getTimePickerMinuteadMyvUU, composerStartRestartGroup, 0), modifierClearAndSetSemantics5, ColorSchemeKt.toColor(timeInputTokens10.getTimeFieldSupportingTextColor(), composerStartRestartGroup, 6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyKt.fromToken(materialTheme5.getTypography(composerStartRestartGroup, 6), timeInputTokens10.getTimeFieldSupportingTextFont()), composerStartRestartGroup, 0, 0, 65528);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                Selection selectionM1235boximpl9 = Selection.m1235boximpl(timePickerState.m1419getSelectionJiIwxys$material3_release());
                Selection selectionM1235boximpl10 = Selection.m1235boximpl(i10);
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(1618982084);
                zChanged2 = composer2.changed(selectionM1235boximpl10) | composer2.changed(timePickerState) | composer2.changed(focusRequester);
                objRememberedValue4 = composer2.rememberedValue();
                if (zChanged2) {
                    objRememberedValue4 = new l0.e5(timePickerState, i10, focusRequester, null);
                    composer2.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new l0.e5(timePickerState, i10, focusRequester, null);
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceableGroup();
                EffectsKt.LaunchedEffect(selectionM1235boximpl9, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer2, 64);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                keyboardOptions4 = keyboardOptions3;
                keyboardActions4 = keyboardActions3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new l0.f5(modifier, textFieldValue, function1, timePickerState, i10, keyboardOptions4, keyboardActions4, timePickerColors, i11, i12));
        }
        i16 = 12582912;
        i13 |= i16;
        i17 = i13;
        if ((23967451 & i17) == 4793490) {
            if (i19 != 0) {
                keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
            } else {
                keyboardOptions3 = keyboardOptions2;
            }
            if (i14 != 0) {
                keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
            } else {
                keyboardActions3 = keyboardActions2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-367523658, i17, -1, "androidx.compose.material3.TimePickerTextField (TimePicker.kt:1385)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableInteractionSource mutableInteractionSource6 = (MutableInteractionSource) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            focusRequester = (FocusRequester) objRememberedValue2;
            textFieldColorsM1193colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m1193colors0hiis_0(timePickerColors.m1400timeSelectorContentColorvNxB06k$material3_release(true), 0L, 0L, 0L, timePickerColors.m1399timeSelectorContainerColorvNxB06k$material3_release(true), timePickerColors.m1399timeSelectorContainerColorvNxB06k$material3_release(true), 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, 3072, 2147483598, 4095);
            zM1237equalsimpl0 = Selection.m1237equalsimpl0(i10, timePickerState.m1419getSelectionJiIwxys$material3_release());
            int i21110 = i17 & 14;
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement.Vertical top6 = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion1113 = Alignment.INSTANCE;
            int i21111 = i21110 >> 3;
            MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(top6, companion1113.getStart(), composerStartRestartGroup, (i21111 & 14) | (i21111 & 112));
            Density density11 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection11 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration11 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion1114 = ComposeUiNode.INSTANCE;
            constructor = companion1114.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11 = LayoutKt.materializerOf(modifier);
            int i21112 = ((((i21110 << 3) & 112) << 9) & 7168) | 6;
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
            Composer composerM2074constructorimpl11 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl11, layoutDirection11, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion1114, composerM2074constructorimpl11, measurePolicyColumnMeasurePolicy6, composerM2074constructorimpl11, density11));
            ai.a.j((i21112 >> 3) & 112, function3MaterializerOf11, androidx.appcompat.widget.g0.b(companion1114, composerM2074constructorimpl11, viewConfiguration11, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance6 = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(896149777);
            if (zM1237equalsimpl0) {
                Modifier.Companion companion1115 = Modifier.INSTANCE;
                TimeInputTokens timeInputTokens11 = TimeInputTokens.INSTANCE;
                Modifier modifierM337sizeVpY3zN14 = SizeKt.m337sizeVpY3zN4(companion1115, timeInputTokens11.m1979getTimeFieldContainerWidthD9Ej5fM(), timeInputTokens11.m1978getTimeFieldContainerHeightD9Ej5fM());
                if (Selection.m1237equalsimpl0(i10, Selection.INSTANCE.m1241getHourJiIwxys())) {
                    minute = timePickerState.getHourForDisplay$material3_release();
                } else {
                    minute = timePickerState.getMinute();
                }
                int i21113 = i17 >> 3;
                i18 = -1323940314;
                textFieldColors = textFieldColorsM1193colors0hiis_0;
                f(modifierM337sizeVpY3zN14, minute, timePickerState, i10, timePickerColors, composerStartRestartGroup, (i21113 & 7168) | (i21113 & 896) | 6 | ((i17 >> 9) & 57344));
            } else {
                textFieldColors = textFieldColorsM1193colors0hiis_0;
                i18 = -1323940314;
            }
            composerStartRestartGroup.endReplaceableGroup();
            companion2 = Selection.INSTANCE;
            if (Selection.m1237equalsimpl0(i10, companion2.m1242getMinuteJiIwxys())) {
                iM1311getTimePickerHourTextFieldadMyvUU = Strings.INSTANCE.m1315getTimePickerMinuteTextFieldadMyvUU();
            } else {
                iM1311getTimePickerHourTextFieldadMyvUU = Strings.INSTANCE.m1311getTimePickerHourTextFieldadMyvUU();
            }
            strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(iM1311getTimePickerHourTextFieldadMyvUU, composerStartRestartGroup, 0);
            Modifier.Companion companion1116 = Modifier.INSTANCE;
            if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                noInspectorInfo = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.TimePickerKt$visible$$inlined$debugInspectorInfo$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                        androidx.activity.a.c(inspectorInfo, "$this$null", "visible").set("visible", Boolean.valueOf(zM1237equalsimpl0));
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                        invoke2(inspectorInfo);
                        return Unit.INSTANCE;
                    }
                };
            } else {
                noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
            }
            Modifier modifierThen6 = companion1116.then(new y5(zM1237equalsimpl0, noInspectorInfo));
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyC6 = androidx.databinding.f.c(companion1113, false, composerStartRestartGroup, 0, i18);
            Density density12 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection12 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration12 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor2 = companion1114.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf12 = LayoutKt.materializerOf(modifierThen6);
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
            Composer composerM2074constructorimpl12 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl12, layoutDirection12, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion1114, composerM2074constructorimpl12, measurePolicyC6, composerM2074constructorimpl12, density12));
            ai.a.j(0, function3MaterializerOf12, androidx.appcompat.widget.g0.b(companion1114, composerM2074constructorimpl12, viewConfiguration12, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
            Modifier modifierFocusRequester6 = FocusRequesterModifierKt.focusRequester(companion1116, r18);
            TimeInputTokens timeInputTokens12 = TimeInputTokens.INSTANCE;
            Modifier modifierM337sizeVpY3zN15 = SizeKt.m337sizeVpY3zN4(modifierFocusRequester6, timeInputTokens12.m1979getTimeFieldContainerWidthD9Ej5fM(), timeInputTokens12.m1978getTimeFieldContainerHeightD9Ej5fM());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue3 = new l0.a5(strM1320getStringNWtq28);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new l0.a5(strM1320getStringNWtq28);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierSemantics$default6 = SemanticsModifierKt.semantics$default(modifierM337sizeVpY3zN15, false, (Function1) objRememberedValue3, 1, null);
            TextStyle textStyle6 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
            Brush.Companion companion1117 = Brush.INSTANCE;
            Float fValueOf11 = Float.valueOf(0.0f);
            Color.Companion companion1118 = Color.INSTANCE;
            Float fValueOf12 = Float.valueOf(0.1f);
            MaterialTheme materialTheme6 = MaterialTheme.INSTANCE;
            Brush brushM2472verticalGradient8A3gB4$default6 = Brush.Companion.m2472verticalGradient8A3gB4$default(companion1117, new Pair[]{TuplesKt.to(fValueOf11, Color.m2498boximpl(companion1118.m2543getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(0.1f), Color.m2498boximpl(companion1118.m2543getTransparent0d7_KjU())), TuplesKt.to(fValueOf12, Color.m2498boximpl(materialTheme6.getColorScheme(composerStartRestartGroup, 6).m973getPrimary0d7_KjU())), TuplesKt.to(Float.valueOf(0.9f), Color.m2498boximpl(materialTheme6.getColorScheme(composerStartRestartGroup, 6).m973getPrimary0d7_KjU())), TuplesKt.to(Float.valueOf(0.9f), Color.m2498boximpl(companion1118.m2543getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(1.0f), Color.m2498boximpl(companion1118.m2543getTransparent0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null);
            ComposableLambda composableLambda6 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2133555260, true, new l0.c5(textFieldValue, mutableInteractionSource6, textFieldColors));
            int i21114 = i17 >> 3;
            int i21115 = i17 << 3;
            BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifierSemantics$default6, true, false, textStyle6, keyboardOptions3, keyboardActions3, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource6, brushM2472verticalGradient8A3gB4$default6, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) composableLambda6, composerStartRestartGroup, (i21114 & 14) | 100666368 | (i21114 & 112) | (i21115 & 3670016) | (i21115 & 29360128), 199680, 7696);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierClearAndSetSemantics6 = SemanticsModifierKt.clearAndSetSemantics(OffsetKt.m270offsetVpY3zN4$default(companion1116, 0.0f, f12348f, 1, null), l0.d5.f82498p0);
            if (Selection.m1237equalsimpl0(i10, companion2.m1241getHourJiIwxys())) {
                iM1312getTimePickerMinuteadMyvUU = Strings.INSTANCE.m1308getTimePickerHouradMyvUU();
            } else {
                iM1312getTimePickerMinuteadMyvUU = Strings.INSTANCE.m1312getTimePickerMinuteadMyvUU();
            }
            TextKt.m1389Text4IGK_g(Strings_androidKt.m1320getStringNWtq28(iM1312getTimePickerMinuteadMyvUU, composerStartRestartGroup, 0), modifierClearAndSetSemantics6, ColorSchemeKt.toColor(timeInputTokens12.getTimeFieldSupportingTextColor(), composerStartRestartGroup, 6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyKt.fromToken(materialTheme6.getTypography(composerStartRestartGroup, 6), timeInputTokens12.getTimeFieldSupportingTextFont()), composerStartRestartGroup, 0, 0, 65528);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Selection selectionM1235boximpl11 = Selection.m1235boximpl(timePickerState.m1419getSelectionJiIwxys$material3_release());
            Selection selectionM1235boximpl12 = Selection.m1235boximpl(i10);
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(1618982084);
            zChanged2 = composer2.changed(selectionM1235boximpl12) | composer2.changed(timePickerState) | composer2.changed(focusRequester);
            objRememberedValue4 = composer2.rememberedValue();
            if (zChanged2) {
                objRememberedValue4 = new l0.e5(timePickerState, i10, focusRequester, null);
                composer2.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new l0.e5(timePickerState, i10, focusRequester, null);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceableGroup();
            EffectsKt.LaunchedEffect(selectionM1235boximpl11, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer2, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            keyboardOptions4 = keyboardOptions3;
            keyboardActions4 = keyboardActions3;
        } else {
            if (i19 != 0) {
                keyboardOptions3 = KeyboardOptions.INSTANCE.getDefault();
            } else {
                keyboardOptions3 = keyboardOptions2;
            }
            if (i14 != 0) {
                keyboardActions3 = KeyboardActions.INSTANCE.getDefault();
            } else {
                keyboardActions3 = keyboardActions2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-367523658, i17, -1, "androidx.compose.material3.TimePickerTextField (TimePicker.kt:1385)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableInteractionSource mutableInteractionSource7 = (MutableInteractionSource) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            focusRequester = (FocusRequester) objRememberedValue2;
            textFieldColorsM1193colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m1193colors0hiis_0(timePickerColors.m1400timeSelectorContentColorvNxB06k$material3_release(true), 0L, 0L, 0L, timePickerColors.m1399timeSelectorContainerColorvNxB06k$material3_release(true), timePickerColors.m1399timeSelectorContainerColorvNxB06k$material3_release(true), 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, 3072, 2147483598, 4095);
            zM1237equalsimpl0 = Selection.m1237equalsimpl0(i10, timePickerState.m1419getSelectionJiIwxys$material3_release());
            int i21116 = i17 & 14;
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement.Vertical top7 = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion1119 = Alignment.INSTANCE;
            int i21117 = i21116 >> 3;
            MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(top7, companion1119.getStart(), composerStartRestartGroup, (i21117 & 14) | (i21117 & 112));
            Density density13 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection13 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration13 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion11110 = ComposeUiNode.INSTANCE;
            constructor = companion11110.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf13 = LayoutKt.materializerOf(modifier);
            int i21118 = ((((i21116 << 3) & 112) << 9) & 7168) | 6;
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
            Composer composerM2074constructorimpl13 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl13, layoutDirection13, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion11110, composerM2074constructorimpl13, measurePolicyColumnMeasurePolicy7, composerM2074constructorimpl13, density13));
            ai.a.j((i21118 >> 3) & 112, function3MaterializerOf13, androidx.appcompat.widget.g0.b(companion11110, composerM2074constructorimpl13, viewConfiguration13, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance7 = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(896149777);
            if (zM1237equalsimpl0) {
                Modifier.Companion companion11111 = Modifier.INSTANCE;
                TimeInputTokens timeInputTokens13 = TimeInputTokens.INSTANCE;
                Modifier modifierM337sizeVpY3zN16 = SizeKt.m337sizeVpY3zN4(companion11111, timeInputTokens13.m1979getTimeFieldContainerWidthD9Ej5fM(), timeInputTokens13.m1978getTimeFieldContainerHeightD9Ej5fM());
                if (Selection.m1237equalsimpl0(i10, Selection.INSTANCE.m1241getHourJiIwxys())) {
                    minute = timePickerState.getHourForDisplay$material3_release();
                } else {
                    minute = timePickerState.getMinute();
                }
                int i21119 = i17 >> 3;
                i18 = -1323940314;
                textFieldColors = textFieldColorsM1193colors0hiis_0;
                f(modifierM337sizeVpY3zN16, minute, timePickerState, i10, timePickerColors, composerStartRestartGroup, (i21119 & 7168) | (i21119 & 896) | 6 | ((i17 >> 9) & 57344));
            } else {
                textFieldColors = textFieldColorsM1193colors0hiis_0;
                i18 = -1323940314;
            }
            composerStartRestartGroup.endReplaceableGroup();
            companion2 = Selection.INSTANCE;
            if (Selection.m1237equalsimpl0(i10, companion2.m1242getMinuteJiIwxys())) {
                iM1311getTimePickerHourTextFieldadMyvUU = Strings.INSTANCE.m1315getTimePickerMinuteTextFieldadMyvUU();
            } else {
                iM1311getTimePickerHourTextFieldadMyvUU = Strings.INSTANCE.m1311getTimePickerHourTextFieldadMyvUU();
            }
            strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(iM1311getTimePickerHourTextFieldadMyvUU, composerStartRestartGroup, 0);
            Modifier.Companion companion11112 = Modifier.INSTANCE;
            if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
                noInspectorInfo = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.TimePickerKt$visible$$inlined$debugInspectorInfo$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                        androidx.activity.a.c(inspectorInfo, "$this$null", "visible").set("visible", Boolean.valueOf(zM1237equalsimpl0));
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                        invoke2(inspectorInfo);
                        return Unit.INSTANCE;
                    }
                };
            } else {
                noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
            }
            Modifier modifierThen7 = companion11112.then(new y5(zM1237equalsimpl0, noInspectorInfo));
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyC7 = androidx.databinding.f.c(companion1119, false, composerStartRestartGroup, 0, i18);
            Density density14 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection14 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration14 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor2 = companion11110.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf14 = LayoutKt.materializerOf(modifierThen7);
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
            Composer composerM2074constructorimpl14 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl14, layoutDirection14, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion11110, composerM2074constructorimpl14, measurePolicyC7, composerM2074constructorimpl14, density14));
            ai.a.j(0, function3MaterializerOf14, androidx.appcompat.widget.g0.b(companion11110, composerM2074constructorimpl14, viewConfiguration14, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
            Modifier modifierFocusRequester7 = FocusRequesterModifierKt.focusRequester(companion11112, r18);
            TimeInputTokens timeInputTokens14 = TimeInputTokens.INSTANCE;
            Modifier modifierM337sizeVpY3zN17 = SizeKt.m337sizeVpY3zN4(modifierFocusRequester7, timeInputTokens14.m1979getTimeFieldContainerWidthD9Ej5fM(), timeInputTokens14.m1978getTimeFieldContainerHeightD9Ej5fM());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue3 = new l0.a5(strM1320getStringNWtq28);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new l0.a5(strM1320getStringNWtq28);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierSemantics$default7 = SemanticsModifierKt.semantics$default(modifierM337sizeVpY3zN17, false, (Function1) objRememberedValue3, 1, null);
            TextStyle textStyle7 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
            Brush.Companion companion11113 = Brush.INSTANCE;
            Float fValueOf13 = Float.valueOf(0.0f);
            Color.Companion companion11114 = Color.INSTANCE;
            Float fValueOf14 = Float.valueOf(0.1f);
            MaterialTheme materialTheme7 = MaterialTheme.INSTANCE;
            Brush brushM2472verticalGradient8A3gB4$default7 = Brush.Companion.m2472verticalGradient8A3gB4$default(companion11113, new Pair[]{TuplesKt.to(fValueOf13, Color.m2498boximpl(companion11114.m2543getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(0.1f), Color.m2498boximpl(companion11114.m2543getTransparent0d7_KjU())), TuplesKt.to(fValueOf14, Color.m2498boximpl(materialTheme7.getColorScheme(composerStartRestartGroup, 6).m973getPrimary0d7_KjU())), TuplesKt.to(Float.valueOf(0.9f), Color.m2498boximpl(materialTheme7.getColorScheme(composerStartRestartGroup, 6).m973getPrimary0d7_KjU())), TuplesKt.to(Float.valueOf(0.9f), Color.m2498boximpl(companion11114.m2543getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(1.0f), Color.m2498boximpl(companion11114.m2543getTransparent0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null);
            ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2133555260, true, new l0.c5(textFieldValue, mutableInteractionSource7, textFieldColors));
            int i211110 = i17 >> 3;
            int i211111 = i17 << 3;
            BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifierSemantics$default7, true, false, textStyle7, keyboardOptions3, keyboardActions3, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource7, brushM2472verticalGradient8A3gB4$default7, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) composableLambda7, composerStartRestartGroup, (i211110 & 14) | 100666368 | (i211110 & 112) | (i211111 & 3670016) | (i211111 & 29360128), 199680, 7696);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierClearAndSetSemantics7 = SemanticsModifierKt.clearAndSetSemantics(OffsetKt.m270offsetVpY3zN4$default(companion11112, 0.0f, f12348f, 1, null), l0.d5.f82498p0);
            if (Selection.m1237equalsimpl0(i10, companion2.m1241getHourJiIwxys())) {
                iM1312getTimePickerMinuteadMyvUU = Strings.INSTANCE.m1308getTimePickerHouradMyvUU();
            } else {
                iM1312getTimePickerMinuteadMyvUU = Strings.INSTANCE.m1312getTimePickerMinuteadMyvUU();
            }
            TextKt.m1389Text4IGK_g(Strings_androidKt.m1320getStringNWtq28(iM1312getTimePickerMinuteadMyvUU, composerStartRestartGroup, 0), modifierClearAndSetSemantics7, ColorSchemeKt.toColor(timeInputTokens14.getTimeFieldSupportingTextColor(), composerStartRestartGroup, 6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyKt.fromToken(materialTheme7.getTypography(composerStartRestartGroup, 6), timeInputTokens14.getTimeFieldSupportingTextFont()), composerStartRestartGroup, 0, 0, 65528);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Selection selectionM1235boximpl13 = Selection.m1235boximpl(timePickerState.m1419getSelectionJiIwxys$material3_release());
            Selection selectionM1235boximpl14 = Selection.m1235boximpl(i10);
            composer2 = composerStartRestartGroup;
            composer2.startReplaceableGroup(1618982084);
            zChanged2 = composer2.changed(selectionM1235boximpl14) | composer2.changed(timePickerState) | composer2.changed(focusRequester);
            objRememberedValue4 = composer2.rememberedValue();
            if (zChanged2) {
                objRememberedValue4 = new l0.e5(timePickerState, i10, focusRequester, null);
                composer2.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new l0.e5(timePickerState, i10, focusRequester, null);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceableGroup();
            EffectsKt.LaunchedEffect(selectionM1235boximpl13, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer2, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            keyboardOptions4 = keyboardOptions3;
            keyboardActions4 = keyboardActions3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new l0.f5(modifier, textFieldValue, function1, timePickerState, i10, keyboardOptions4, keyboardActions4, timePickerColors, i11, i12));
    }

    public static final float access$atan(float f6, float f10) {
        float fAtan2 = ((float) Math.atan2(f6, f10)) - 1.5707964f;
        return fAtan2 < 0.0f ? fAtan2 + 6.2831855f : fAtan2;
    }

    public static final Modifier access$clockDial(Modifier modifier, final TimePickerState timePickerState, boolean z10) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.TimePickerKt$clockDial$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.c(inspectorInfo, "$this$null", "clockDial").set("state", timePickerState);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new l5(timePickerState, z10));
    }

    public static final float access$dist(float f6, float f10, int i10, int i11) {
        return (float) Math.hypot(i10 - f6, i11 - f10);
    }

    public static final Modifier access$drawSelector(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors) {
        return DrawModifierKt.drawWithContent(modifier, new m5(timePickerState, timePickerColors));
    }

    /* JADX INFO: renamed from: access$timeInputOnChange-gIWD5Rc, reason: not valid java name */
    public static final void m1407access$timeInputOnChangegIWD5Rc(int i10, TimePickerState timePickerState, TextFieldValue textFieldValue, TextFieldValue textFieldValue2, int i11, Function1 function1) {
        if (Intrinsics.areEqual(textFieldValue.getText(), textFieldValue2.getText())) {
            function1.invoke(textFieldValue);
            return;
        }
        if (textFieldValue.getText().length() == 0) {
            if (Selection.m1237equalsimpl0(i10, Selection.INSTANCE.m1241getHourJiIwxys())) {
                timePickerState.setHour$material3_release(0);
            } else {
                timePickerState.setMinute$material3_release(0);
            }
            function1.invoke(TextFieldValue.m4172copy3r_uNRQ$default(textFieldValue, "", 0L, (TextRange) null, 6, (Object) null));
            return;
        }
        try {
            int iDigitToInt = (textFieldValue.getText().length() == 3 && TextRange.m3967getStartimpl(textFieldValue.getSelection()) == 1) ? kotlin.text.a.digitToInt(textFieldValue.getText().charAt(0)) : Integer.parseInt(textFieldValue.getText());
            if (iDigitToInt <= i11) {
                Selection.Companion companion = Selection.INSTANCE;
                if (Selection.m1237equalsimpl0(i10, companion.m1241getHourJiIwxys())) {
                    timePickerState.setHour$material3_release(iDigitToInt);
                    if (iDigitToInt > 1 && !timePickerState.getIs24hour()) {
                        timePickerState.m1422setSelectioniHAOin8$material3_release(companion.m1242getMinuteJiIwxys());
                    }
                } else {
                    timePickerState.setMinute$material3_release(iDigitToInt);
                }
                if (textFieldValue.getText().length() > 2) {
                    textFieldValue = TextFieldValue.m4172copy3r_uNRQ$default(textFieldValue, String.valueOf(textFieldValue.getText().charAt(0)), 0L, (TextRange) null, 6, (Object) null);
                }
                function1.invoke(textFieldValue);
            }
        } catch (NumberFormatException | IllegalArgumentException unused) {
        }
    }

    public static final Pair access$valuesForAnimation(float f6, float f10) {
        if (Math.abs(f6 - f10) <= 3.141592653589793d) {
            return new Pair(Float.valueOf(f6), Float.valueOf(f10));
        }
        double d2 = f6;
        if (d2 > 3.141592653589793d && f10 < 3.141592653589793d) {
            f10 += 6.2831855f;
        } else if (d2 < 3.141592653589793d && f10 > 3.141592653589793d) {
            f6 += 6.2831855f;
        }
        return new Pair(Float.valueOf(f6), Float.valueOf(f10));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(755539561);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(timePickerState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(755539561, i11, -1, "androidx.compose.material3.HorizontalClockDisplay (TimePicker.kt:800)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, companion2.getStart(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
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
            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl, measurePolicyColumnMeasurePolicy, composerM2074constructorimpl, density));
            ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            a(timePickerState, timePickerColors, composerStartRestartGroup, (i11 & 14) | (i11 & 112));
            composerStartRestartGroup.startReplaceableGroup(-552399017);
            if (!timePickerState.getIs24hour()) {
                Modifier modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(companion, 0.0f, m, 0.0f, 0.0f, 13, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion2, false, composerStartRestartGroup, 0, -1323940314);
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM300paddingqDBjuR0$default);
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
                Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl2, measurePolicyC, composerM2074constructorimpl2, density2));
                ai.a.j(0, function3MaterializerOf2, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                int i12 = i11 << 3;
                c(SizeKt.m337sizeVpY3zN4(companion, timePickerTokens.m1987getPeriodSelectorHorizontalContainerWidthD9Ej5fM(), timePickerTokens.m1986getPeriodSelectorHorizontalContainerHeightD9Ej5fM()), timePickerColors, timePickerState, composerStartRestartGroup, (i12 & 896) | (i12 & 112) | 6);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (androidx.databinding.e.e(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new f(timePickerState, timePickerColors, i10));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(Modifier modifier, TimePickerColors timePickerColors, TimePickerState timePickerState, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(1261215927);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(timePickerState) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(timePickerColors) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1261215927, i11, -1, "androidx.compose.material3.HorizontalPeriodToggle (TimePicker.kt:877)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = l0.z4.f83076a;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            Shape shape = ShapesKt.toShape(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), composerStartRestartGroup, 6);
            Intrinsics.checkNotNull(shape, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) shape;
            d(modifier, timePickerState, timePickerColors, measurePolicy, ShapesKt.start(cornerBasedShape), ShapesKt.end(cornerBasedShape), composerStartRestartGroup, (i11 & 14) | 3072 | (i11 & 112) | (i11 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new l0.y4(i10, timePickerColors, timePickerState, modifier));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void d(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, MeasurePolicy measurePolicy, Shape shape, Shape shape2, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(1374241901);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(timePickerState) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(timePickerColors) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(measurePolicy) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(shape) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(shape2) ? 131072 : 65536;
        }
        if ((374491 & i11) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1374241901, i11, -1, "androidx.compose.material3.PeriodToggleImpl (TimePicker.kt:963)");
            }
            TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
            BorderStroke borderStrokeM142BorderStrokecXLIe8U = BorderStrokeKt.m142BorderStrokecXLIe8U(timePickerTokens.m1988getPeriodSelectorOutlineWidthD9Ej5fM(), timePickerColors.getPeriodSelectorBorderColor());
            Shape shape3 = ShapesKt.toShape(timePickerTokens.getPeriodSelectorContainerShape(), composerStartRestartGroup, 6);
            Intrinsics.checkNotNull(shape3, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) shape3;
            String strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1317getTimePickerPeriodToggleadMyvUU(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new h(strM1320getStringNWtq28);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierBorder = BorderKt.border(SelectableGroupKt.selectableGroup(SemanticsModifierKt.semantics$default(modifier, false, (Function1) objRememberedValue, 1, null)).then(modifier), borderStrokeM142BorderStrokecXLIe8U, cornerBasedShape);
            Density density = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierBorder);
            int i12 = ((((i11 >> 3) & 896) << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion, composerM2074constructorimpl, measurePolicy, composerM2074constructorimpl, density));
            Updater.m2081setimpl(composerM2074constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            ai.a.j((i12 >> 3) & 112, function3MaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            boolean z10 = !timePickerState.isAfternoonToggle$material3_release();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(timePickerState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new i(timePickerState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ComposableSingletons$TimePickerKt composableSingletons$TimePickerKt = ComposableSingletons$TimePickerKt.INSTANCE;
            int i13 = (i11 << 3) & 7168;
            g(z10, shape, (Function0) objRememberedValue2, timePickerColors, composableSingletons$TimePickerKt.m1049getLambda1$material3_release(), composerStartRestartGroup, ((i11 >> 9) & 112) | 24576 | i13);
            SpacerKt.Spacer(BackgroundKt.m122backgroundbw27NRU$default(SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(LayoutIdKt.layoutId(Modifier.INSTANCE, "Spacer"), 2.0f), 0.0f, 1, null), ColorSchemeKt.toColor(timePickerTokens.getPeriodSelectorOutlineColor(), composerStartRestartGroup, 6), null, 2, null), composerStartRestartGroup, 0);
            boolean zIsAfternoonToggle$material3_release = timePickerState.isAfternoonToggle$material3_release();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged3 = composerStartRestartGroup.changed(timePickerState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new j(timePickerState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            g(zIsAfternoonToggle$material3_release, shape2, (Function0) objRememberedValue3, timePickerColors, composableSingletons$TimePickerKt.m1050getLambda2$material3_release(), composerStartRestartGroup, ((i11 >> 12) & 112) | 24576 | i13);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new k(modifier, timePickerState, timePickerColors, measurePolicy, shape, shape2, i10));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void e(Modifier modifier, TimePickerColors timePickerColors, TimePickerState timePickerState, Composer composer, int i10) {
        int i11;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-475657989);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(timePickerState) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-475657989, i12, -1, "androidx.compose.material3.TimeInputImpl (TimePicker.kt:692)");
            }
            Object[] objArr = new Object[0];
            TextFieldValue.Companion companion = TextFieldValue.INSTANCE;
            Saver<TextFieldValue, Object> saver = companion.getSaver();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(timePickerState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new o(timePickerState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 72, 4);
            Object[] objArr2 = new Object[0];
            Saver<TextFieldValue, Object> saver2 = companion.getSaver();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(timePickerState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new p(timePickerState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableStateRememberSaveable2 = RememberSaveableKt.rememberSaveable(objArr2, (Saver) saver2, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 72, 4);
            composer2 = composerStartRestartGroup;
            Modifier modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, f12349g, 7, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Vertical top = companion2.getTop();
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), top, composer2, 48);
            composer2.startReplaceableGroup(-1323940314);
            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM300paddingqDBjuR0$default);
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
            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl, measurePolicyRowMeasurePolicy, composerM2074constructorimpl, density));
            ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Typography typography = MaterialTheme.INSTANCE.getTypography(composer2, 6);
            TimeInputTokens timeInputTokens = TimeInputTokens.INSTANCE;
            TextStyle textStyleFromToken = TypographyKt.fromToken(typography, timeInputTokens.getTimeFieldLabelTextFont());
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{TextKt.getLocalTextStyle().provides(textStyleFromToken.m3981copyCXVQc50((3653631 & 1) != 0 ? textStyleFromToken.spanStyle.m3927getColor0d7_KjU() : timePickerColors.m1400timeSelectorContentColorvNxB06k$material3_release(true), (3653631 & 2) != 0 ? textStyleFromToken.spanStyle.getFontSize() : 0L, (3653631 & 4) != 0 ? textStyleFromToken.spanStyle.getFontWeight() : null, (3653631 & 8) != 0 ? textStyleFromToken.spanStyle.getFontStyle() : null, (3653631 & 16) != 0 ? textStyleFromToken.spanStyle.getFontSynthesis() : null, (3653631 & 32) != 0 ? textStyleFromToken.spanStyle.getFontFamily() : null, (3653631 & 64) != 0 ? textStyleFromToken.spanStyle.getFontFeatureSettings() : null, (3653631 & 128) != 0 ? textStyleFromToken.spanStyle.getLetterSpacing() : 0L, (3653631 & 256) != 0 ? textStyleFromToken.spanStyle.getBaselineShift() : null, (3653631 & 512) != 0 ? textStyleFromToken.spanStyle.getTextGeometricTransform() : null, (3653631 & 1024) != 0 ? textStyleFromToken.spanStyle.getLocaleList() : null, (3653631 & 2048) != 0 ? textStyleFromToken.spanStyle.getBackground() : 0L, (3653631 & 4096) != 0 ? textStyleFromToken.spanStyle.getTextDecoration() : null, (3653631 & 8192) != 0 ? textStyleFromToken.spanStyle.getShadow() : null, (3653631 & 16384) != 0 ? textStyleFromToken.paragraphStyle.getTextAlign() : TextAlign.m4289boximpl(TextAlign.INSTANCE.m4296getCentere0LSkKk()), (3653631 & 32768) != 0 ? textStyleFromToken.paragraphStyle.getTextDirection() : null, (3653631 & 65536) != 0 ? textStyleFromToken.paragraphStyle.getLineHeight() : 0L, (3653631 & 131072) != 0 ? textStyleFromToken.paragraphStyle.getTextIndent() : null, (3653631 & 262144) != 0 ? textStyleFromToken.platformStyle : null, (3653631 & 524288) != 0 ? textStyleFromToken.paragraphStyle.getLineHeightStyle() : null, (3653631 & 1048576) != 0 ? textStyleFromToken.paragraphStyle.getLineBreak() : null, (3653631 & 2097152) != 0 ? textStyleFromToken.paragraphStyle.getHyphens() : null))}, ComposableLambdaKt.composableLambda(composer2, 1306700887, true, new m(mutableStateRememberSaveable, timePickerState, i12, timePickerColors, mutableStateRememberSaveable2)), composer2, 56);
            composer2.startReplaceableGroup(565119426);
            if (!timePickerState.getIs24hour()) {
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierM300paddingqDBjuR0$default2 = PaddingKt.m300paddingqDBjuR0$default(companion4, m, 0.0f, 0.0f, 0.0f, 14, null);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion2, false, composer2, 0, -1323940314);
                Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM300paddingqDBjuR0$default2);
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
                Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl2, measurePolicyC, composerM2074constructorimpl2, density2));
                ai.a.j(0, function3MaterializerOf2, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl2, viewConfiguration2, composer2, composer2), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                i(SizeKt.m337sizeVpY3zN4(companion4, timeInputTokens.m1976getPeriodSelectorContainerWidthD9Ej5fM(), timeInputTokens.m1975getPeriodSelectorContainerHeightD9Ej5fM()), timePickerColors, timePickerState, composer2, ((i12 >> 3) & 112) | 6 | ((i12 << 3) & 896));
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
        scopeUpdateScopeEndRestartGroup.updateScope(new n(i10, timePickerColors, timePickerState, modifier));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void f(Modifier modifier, int i10, TimePickerState timePickerState, int i11, TimePickerColors timePickerColors, Composer composer, int i12) {
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(21099367);
        if ((i12 & 14) == 0) {
            i13 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= composerStartRestartGroup.changed(i10) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= composerStartRestartGroup.changed(timePickerState) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= composerStartRestartGroup.changed(i11) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i13 |= composerStartRestartGroup.changed(timePickerColors) ? 16384 : 8192;
        }
        int i14 = i13;
        if ((46811 & i14) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(21099367, i14, -1, "androidx.compose.material3.TimeSelector (TimePicker.kt:1069)");
            }
            boolean zM1237equalsimpl0 = Selection.m1237equalsimpl0(timePickerState.m1419getSelectionJiIwxys$material3_release(), i11);
            String strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Selection.m1237equalsimpl0(i11, Selection.INSTANCE.m1241getHourJiIwxys()) ? Strings.INSTANCE.m1309getTimePickerHourSelectionadMyvUU() : Strings.INSTANCE.m1313getTimePickerMinuteSelectionadMyvUU(), composerStartRestartGroup, 0);
            long jM1399timeSelectorContainerColorvNxB06k$material3_release = timePickerColors.m1399timeSelectorContainerColorvNxB06k$material3_release(zM1237equalsimpl0);
            long jM1400timeSelectorContentColorvNxB06k$material3_release = timePickerColors.m1400timeSelectorContentColorvNxB06k$material3_release(zM1237equalsimpl0);
            composerStartRestartGroup.startReplaceableGroup(773894976);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new r(strM1320getStringNWtq28);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SurfaceKt.m1330Surfaced85dljk(zM1237equalsimpl0, (Function0<Unit>) new s(i11, timePickerState, coroutineScope), SemanticsModifierKt.semantics(modifier, true, (Function1) objRememberedValue2), false, ShapesKt.toShape(TimePickerTokens.INSTANCE.getTimeSelectorContainerShape(), composerStartRestartGroup, 6), jM1399timeSelectorContainerColorvNxB06k$material3_release, 0L, 0.0f, 0.0f, (BorderStroke) null, (MutableInteractionSource) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1338709103, true, new t(i11, timePickerState, i10, i14, jM1400timeSelectorContentColorvNxB06k$material3_release)), composerStartRestartGroup, 0, 48, 1992);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new u(i10, i11, i12, timePickerColors, timePickerState, modifier));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void g(boolean z10, Shape shape, Function0<Unit> function0, TimePickerColors timePickerColors, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1937408098);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(shape) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(timePickerColors) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
        }
        if ((46811 & i11) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1937408098, i11, -1, "androidx.compose.material3.ToggleItem (TimePicker.kt:1018)");
            }
            long jM1398periodSelectorContentColorvNxB06k$material3_release = timePickerColors.m1398periodSelectorContentColorvNxB06k$material3_release(z10);
            long jM1397periodSelectorContainerColorvNxB06k$material3_release = timePickerColors.m1397periodSelectorContainerColorvNxB06k$material3_release(z10);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(Modifier.INSTANCE, z10 ? 0.0f : 1.0f), 0.0f, 1, null);
            Boolean boolValueOf = Boolean.valueOf(z10);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(boolValueOf);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new v(z10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ButtonKt.TextButton(function0, SemanticsModifierKt.semantics$default(modifierFillMaxSize$default, false, (Function1) objRememberedValue, 1, null), false, shape, ButtonDefaults.INSTANCE.m939textButtonColorsro_MJ88(jM1397periodSelectorContainerColorvNxB06k$material3_release, jM1398periodSelectorContentColorvNxB06k$material3_release, 0L, 0L, composerStartRestartGroup, 24576, 12), null, null, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), null, function3, composerStartRestartGroup, ((i11 >> 6) & 14) | 12582912 | ((i11 << 6) & 7168) | ((i11 << 15) & 1879048192), 356);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new w(z10, shape, function0, timePickerColors, function3, i10));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void h(TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(2054675515);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(timePickerState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(timePickerColors) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2054675515, i11, -1, "androidx.compose.material3.VerticalClockDisplay (TimePicker.kt:819)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, companion2.getTop(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
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
            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl, measurePolicyRowMeasurePolicy, composerM2074constructorimpl, density));
            ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            a(timePickerState, timePickerColors, composerStartRestartGroup, (i11 & 14) | (i11 & 112));
            composerStartRestartGroup.startReplaceableGroup(952907543);
            if (!timePickerState.getIs24hour()) {
                Modifier modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(companion, m, 0.0f, 0.0f, 0.0f, 14, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion2, false, composerStartRestartGroup, 0, -1323940314);
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM300paddingqDBjuR0$default);
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
                Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl2, measurePolicyC, composerM2074constructorimpl2, density2));
                ai.a.j(0, function3MaterializerOf2, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                int i12 = i11 << 3;
                i(SizeKt.m337sizeVpY3zN4(companion, timePickerTokens.m1990getPeriodSelectorVerticalContainerWidthD9Ej5fM(), timePickerTokens.m1989getPeriodSelectorVerticalContainerHeightD9Ej5fM()), timePickerColors, timePickerState, composerStartRestartGroup, (i12 & 896) | (i12 & 112) | 6);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (androidx.databinding.e.e(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new x(timePickerState, timePickerColors, i10));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void i(Modifier modifier, TimePickerColors timePickerColors, TimePickerState timePickerState, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1898918107);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(timePickerState) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(timePickerColors) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1898918107, i11, -1, "androidx.compose.material3.VerticalPeriodToggle (TimePicker.kt:920)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = l0.h5.f82601a;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            Shape shape = ShapesKt.toShape(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), composerStartRestartGroup, 6);
            Intrinsics.checkNotNull(shape, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) shape;
            d(modifier, timePickerState, timePickerColors, measurePolicy, ShapesKt.top(cornerBasedShape), ShapesKt.bottom(cornerBasedShape), composerStartRestartGroup, (i11 & 14) | 3072 | (i11 & 112) | (i11 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new l0.g5(i10, timePickerColors, timePickerState, modifier));
    }

    public static final String j(int i10, int i11) {
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        integerInstance.setGroupingUsed(false);
        integerInstance.setMinimumIntegerDigits(i11);
        String str = integerInstance.format(Integer.valueOf(i10));
        Intrinsics.checkNotNullExpressionValue(str, "formatter.format(this)");
        return str;
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    /* JADX INFO: renamed from: numberContentDescription-YKJpE6Y, reason: not valid java name */
    public static final String m1408numberContentDescriptionYKJpE6Y(int i10, boolean z10, int i11, @Nullable Composer composer, int i12) {
        int iM1306getTimePicker24HourSuffixadMyvUU;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1826155772, i12, -1, "androidx.compose.material3.numberContentDescription (TimePicker.kt:1541)");
        }
        if (Selection.m1237equalsimpl0(i10, Selection.INSTANCE.m1242getMinuteJiIwxys())) {
            iM1306getTimePicker24HourSuffixadMyvUU = Strings.INSTANCE.m1314getTimePickerMinuteSuffixadMyvUU();
        } else {
            iM1306getTimePicker24HourSuffixadMyvUU = z10 ? Strings.INSTANCE.m1306getTimePicker24HourSuffixadMyvUU() : Strings.INSTANCE.m1310getTimePickerHourSuffixadMyvUU();
        }
        String strM1321getStringiSCLEhQ = Strings_androidKt.m1321getStringiSCLEhQ(iM1306getTimePicker24HourSuffixadMyvUU, new Object[]{Integer.valueOf(i11)}, composer, 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strM1321getStringiSCLEhQ;
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    public static final TimePickerState rememberTimePickerState(int i10, int i11, boolean z10, @Nullable Composer composer, int i12, int i13) {
        composer.startReplaceableGroup(1237715277);
        if ((i13 & 1) != 0) {
            i10 = 0;
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            z10 = TimeFormat_androidKt.is24HourFormat(composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1237715277, i12, -1, "androidx.compose.material3.rememberTimePickerState (TimePicker.kt:438)");
        }
        Object[] objArr = new Object[0];
        Saver<TimePickerState, ?> Saver = TimePickerState.INSTANCE.Saver();
        Integer numValueOf = Integer.valueOf(i10);
        Integer numValueOf2 = Integer.valueOf(i11);
        Boolean boolValueOf = Boolean.valueOf(z10);
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(numValueOf) | composer.changed(numValueOf2) | composer.changed(boolValueOf);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new z(i10, i11, z10);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        TimePickerState timePickerState = (TimePickerState) RememberSaveableKt.m2165rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return timePickerState;
    }
}
