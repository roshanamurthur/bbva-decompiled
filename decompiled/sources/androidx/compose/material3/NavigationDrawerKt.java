package androidx.compose.material3;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.tokens.NavigationDrawerTokens;
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
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NavigationDrawer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001ac\u0010\u0015\u001a\u00020\t2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001aS\u0010\u0016\u001a\u00020\t2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a?\u0010\u0018\u001a\u00020\t2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001ao\u0010&\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0002\b\n¢\u0006\u0002\b#H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u001ao\u0010(\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0002\b\n¢\u0006\u0002\b#H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010%\u001ao\u0010*\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0002\b\n¢\u0006\u0002\b#H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010%\u001a\u008e\u0001\u00105\u001a\u00020\t2\u0011\u0010+\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\u0006\u0010,\u001a\u00020\u00032\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\r\u001a\u00020\f2\u0015\b\u0002\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n2\b\b\u0002\u00100\u001a\u00020\u001a2\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00104\u001a\u000203H\u0007¢\u0006\u0004\b5\u00106\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00067"}, d2 = {"Landroidx/compose/material3/DrawerValue;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/material3/DrawerState;", "rememberDrawerState", "(Landroidx/compose/material3/DrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DrawerState;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "drawerContent", "Landroidx/compose/ui/Modifier;", "modifier", "drawerState", "gesturesEnabled", "Landroidx/compose/ui/graphics/Color;", "scrimColor", "content", "ModalNavigationDrawer-FHprtrg", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ModalNavigationDrawer", "DismissibleNavigationDrawer", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PermanentNavigationDrawer", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Shape;", "drawerShape", "drawerContainerColor", "drawerContentColor", "Landroidx/compose/ui/unit/Dp;", "drawerTonalElevation", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "ModalDrawerSheet-afqeVBk", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ModalDrawerSheet", "DismissibleDrawerSheet-afqeVBk", "DismissibleDrawerSheet", "PermanentDrawerSheet-afqeVBk", "PermanentDrawerSheet", "label", "selected", "onClick", "icon", "badge", "shape", "Landroidx/compose/material3/NavigationDrawerItemColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "NavigationDrawerItem", "(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/NavigationDrawerItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,876:1\n50#2:877\n49#2:878\n25#2:889\n460#2,13:922\n460#2,13:956\n473#2,3:970\n67#2,3:975\n66#2:978\n36#2:985\n460#2,13:1011\n473#2,3:1025\n473#2,3:1030\n25#2:1040\n460#2,13:1071\n456#2,11:1101\n460#2,13:1131\n473#2,3:1145\n460#2,13:1170\n473#2,3:1184\n467#2,3:1189\n473#2,3:1193\n460#2,13:1217\n460#2,13:1251\n473#2,3:1265\n473#2,3:1270\n36#2:1275\n25#2:1282\n36#2:1289\n50#2:1296\n49#2:1297\n50#2:1304\n49#2:1305\n1114#3,6:879\n1114#3,3:890\n1117#3,3:896\n1114#3,6:979\n1114#3,6:986\n1114#3,3:1041\n1117#3,3:1047\n1114#3,6:1276\n1114#3,6:1283\n1114#3,6:1290\n1114#3,6:1298\n1114#3,6:1306\n474#4,4:885\n478#4,2:893\n482#4:899\n474#4,4:1036\n478#4,2:1044\n482#4:1050\n474#5:895\n474#5:1046\n76#6:900\n76#6:902\n76#6:910\n76#6:944\n76#6:999\n76#6:1035\n76#6:1051\n76#6:1059\n76#6:1089\n76#6:1119\n76#6:1158\n76#6:1205\n76#6:1239\n1#7:901\n67#8,6:903\n73#8:935\n66#8,7:936\n73#8:969\n77#8:974\n67#8,6:992\n73#8:1024\n77#8:1029\n77#8:1034\n67#8,6:1052\n73#8:1084\n67#8,6:1112\n73#8:1144\n77#8:1149\n66#8,7:1150\n73#8:1183\n77#8:1188\n77#8:1197\n66#8,7:1231\n73#8:1264\n77#8:1269\n75#9:909\n76#9,11:911\n75#9:943\n76#9,11:945\n89#9:973\n75#9:998\n76#9,11:1000\n89#9:1028\n89#9:1033\n75#9:1058\n76#9,11:1060\n71#9,4:1085\n75#9,11:1090\n75#9:1118\n76#9,11:1120\n89#9:1148\n75#9:1157\n76#9,11:1159\n89#9:1187\n88#9:1192\n89#9:1196\n75#9:1204\n76#9,11:1206\n75#9:1238\n76#9,11:1240\n89#9:1268\n89#9:1273\n75#10,6:1198\n81#10:1230\n85#10:1274\n154#11:1312\n154#11:1313\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt\n*L\n228#1:877\n228#1:878\n262#1:889\n269#1:922,13\n283#1:956,13\n283#1:970,3\n296#1:975,3\n296#1:978\n303#1:985\n301#1:1011,13\n301#1:1025,3\n269#1:1030,3\n357#1:1040\n362#1:1071,13\n374#1:1101,11\n375#1:1131,13\n375#1:1145,3\n390#1:1170,13\n390#1:1184,3\n374#1:1189,3\n362#1:1193,3\n430#1:1217,13\n432#1:1251,13\n432#1:1265,3\n430#1:1270,3\n541#1:1275\n660#1:1282\n852#1:1289\n853#1:1296\n853#1:1297\n865#1:1304\n865#1:1305\n228#1:879,6\n262#1:890,3\n262#1:896,3\n296#1:979,6\n303#1:986,6\n357#1:1041,3\n357#1:1047,3\n541#1:1276,6\n660#1:1283,6\n852#1:1290,6\n853#1:1298,6\n865#1:1306,6\n262#1:885,4\n262#1:893,2\n262#1:899\n357#1:1036,4\n357#1:1044,2\n357#1:1050\n262#1:895\n357#1:1046\n264#1:900\n268#1:902\n269#1:910\n283#1:944\n301#1:999\n353#1:1035\n361#1:1051\n362#1:1059\n374#1:1089\n375#1:1119\n390#1:1158\n430#1:1205\n432#1:1239\n269#1:903,6\n269#1:935\n283#1:936,7\n283#1:969\n283#1:974\n301#1:992,6\n301#1:1024\n301#1:1029\n269#1:1034\n362#1:1052,6\n362#1:1084\n375#1:1112,6\n375#1:1144\n375#1:1149\n390#1:1150,7\n390#1:1183\n390#1:1188\n362#1:1197\n432#1:1231,7\n432#1:1264\n432#1:1269\n269#1:909\n269#1:911,11\n283#1:943\n283#1:945,11\n283#1:973\n301#1:998\n301#1:1000,11\n301#1:1028\n269#1:1033\n362#1:1058\n362#1:1060,11\n374#1:1085,4\n374#1:1090,11\n375#1:1118\n375#1:1120,11\n375#1:1148\n390#1:1157\n390#1:1159,11\n390#1:1187\n374#1:1192\n362#1:1196\n430#1:1204\n430#1:1206,11\n432#1:1238\n432#1:1240,11\n432#1:1268\n430#1:1273\n430#1:1198,6\n430#1:1230\n430#1:1274\n870#1:1312\n871#1:1313\n*E\n"})
public final class NavigationDrawerKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f10760a = Dp.m4389constructorimpl(400);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f10761b = Dp.m4389constructorimpl(240);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final TweenSpec<Float> f10762c = new TweenSpec<>(256, 0, null, 6, null);

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10763p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Shape f10764q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f10765r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f10766s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ float f10767t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ WindowInsets f10768u0;
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f10769w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f10770x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f6, int i10, int i11, long j10, long j11, WindowInsets windowInsets, Modifier modifier, Shape shape, Function3 function3) {
            super(2);
            this.f10763p0 = modifier;
            this.f10764q0 = shape;
            this.f10765r0 = j10;
            this.f10766s0 = j11;
            this.f10767t0 = f6;
            this.f10768u0 = windowInsets;
            this.v0 = function3;
            this.f10769w0 = i10;
            this.f10770x0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            NavigationDrawerKt.m1180DismissibleDrawerSheetafqeVBk(this.f10763p0, this.f10764q0, this.f10765r0, this.f10766s0, this.f10767t0, this.f10768u0, this.v0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10769w0 | 1), this.f10770x0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    public static final class b extends Lambda implements Function2<DrawerValue, DrawerValue, ThresholdConfig> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f10771p0 = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final ThresholdConfig invoke(DrawerValue drawerValue, DrawerValue drawerValue2) {
            Intrinsics.checkNotNullParameter(drawerValue, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(drawerValue2, "<anonymous parameter 1>");
            return new FractionalThreshold(0.5f);
        }
    }

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    public static final class c extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f10772p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ DrawerState f10773q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f10774r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, DrawerState drawerState, CoroutineScope coroutineScope) {
            super(1);
            this.f10772p0 = str;
            this.f10773q0 = drawerState;
            this.f10774r0 = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.setPaneTitle(semantics, this.f10772p0);
            DrawerState drawerState = this.f10773q0;
            if (drawerState.isOpen()) {
                SemanticsPropertiesKt.dismiss$default(semantics, null, new q2(drawerState, this.f10774r0), 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    public static final class d implements MeasurePolicy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DrawerState f10775a;

        /* JADX INFO: compiled from: NavigationDrawer.kt */
        public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Placeable f10776p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Placeable f10777q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ DrawerState f10778r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Placeable placeable, Placeable placeable2, DrawerState drawerState) {
                super(1);
                this.f10776p0 = placeable;
                this.f10777q0 = placeable2;
                this.f10778r0 = drawerState;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope layout = placementScope;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable placeable = this.f10776p0;
                int width = this.f10777q0.getWidth();
                DrawerState drawerState = this.f10778r0;
                Placeable.PlacementScope.placeRelative$default(layout, placeable, mk.c.roundToInt(drawerState.getOffset().getValue().floatValue()) + width, 0, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(layout, this.f10777q0, mk.c.roundToInt(drawerState.getOffset().getValue().floatValue()), 0, 0.0f, 4, null);
                return Unit.INSTANCE;
            }
        }

        public d(DrawerState drawerState) {
            this.f10775a = drawerState;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.a(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.b(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        @NotNull
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo113measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j10) {
            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            Placeable placeableMo3575measureBRTryo0 = measurables.get(0).mo3575measureBRTryo0(j10);
            Placeable placeableMo3575measureBRTryo1 = measurables.get(1).mo3575measureBRTryo0(j10);
            return MeasureScope.CC.q(Layout, placeableMo3575measureBRTryo1.getWidth(), placeableMo3575measureBRTryo1.getHeight(), null, new a(placeableMo3575measureBRTryo1, placeableMo3575measureBRTryo0, this.f10775a), 4, null);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.c(this, intrinsicMeasureScope, list, i10);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
            return g1.f.d(this, intrinsicMeasureScope, list, i10);
        }
    }

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10779p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10780q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ DrawerState f10781r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f10782s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10783t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f10784u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, DrawerState drawerState, boolean z10, Function2<? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f10779p0 = function2;
            this.f10780q0 = modifier;
            this.f10781r0 = drawerState;
            this.f10782s0 = z10;
            this.f10783t0 = function3;
            this.f10784u0 = i10;
            this.v0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            NavigationDrawerKt.DismissibleNavigationDrawer(this.f10779p0, this.f10780q0, this.f10781r0, this.f10782s0, this.f10783t0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10784u0 | 1), this.v0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    @SourceDebugExtension({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt$DrawerSheet$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,876:1\n74#2,6:877\n80#2:909\n84#2:914\n75#3:883\n76#3,11:885\n89#3:913\n76#4:884\n460#5,13:896\n473#5,3:910\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt$DrawerSheet$1\n*L\n574#1:877,6\n574#1:909\n574#1:914\n574#1:883\n574#1:885,11\n574#1:913\n574#1:884\n574#1:896,13\n574#1:910,3\n*E\n"})
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ WindowInsets f10785p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f10786q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f10787r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(WindowInsets windowInsets, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f10785p0 = windowInsets;
            this.f10786q0 = function3;
            this.f10787r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(959363152, iIntValue, -1, "androidx.compose.material3.DrawerSheet.<anonymous> (NavigationDrawer.kt:572)");
                }
                Modifier modifierWindowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.m339sizeInqDBjuR0$default(Modifier.INSTANCE, NavigationDrawerKt.f10761b, 0.0f, DrawerDefaults.INSTANCE.m1087getMaximumDrawerWidthD9Ej5fM(), 0.0f, 10, null), this.f10785p0);
                int i10 = (this.f10787r0 >> 9) & 7168;
                composer2.startReplaceableGroup(-483455358);
                int i11 = i10 >> 3;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, (i11 & 112) | (i11 & 14));
                Density density = (Density) com.mypinpad.tsdk.isolation.y2.a(composer2, -1323940314);
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierWindowInsetsPadding);
                int i12 = ((((i10 << 3) & 112) << 9) & 7168) | 6;
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
                ai.a.j((i12 >> 3) & 112, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                this.f10786q0.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i10 >> 6) & 112) | 6));
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ WindowInsets f10788p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10789q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Shape f10790r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f10791s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ long f10792t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ float f10793u0;
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f10794w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f10795x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(float f6, int i10, int i11, long j10, long j11, WindowInsets windowInsets, Modifier modifier, Shape shape, Function3 function3) {
            super(2);
            this.f10788p0 = windowInsets;
            this.f10789q0 = modifier;
            this.f10790r0 = shape;
            this.f10791s0 = j10;
            this.f10792t0 = j11;
            this.f10793u0 = f6;
            this.v0 = function3;
            this.f10794w0 = i10;
            this.f10795x0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            NavigationDrawerKt.a(this.f10788p0, this.f10789q0, this.f10790r0, this.f10791s0, this.f10792t0, this.f10793u0, this.v0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10794w0 | 1), this.f10795x0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    public static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10796p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Shape f10797q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f10798r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f10799s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ float f10800t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ WindowInsets f10801u0;
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f10802w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f10803x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(float f6, int i10, int i11, long j10, long j11, WindowInsets windowInsets, Modifier modifier, Shape shape, Function3 function3) {
            super(2);
            this.f10796p0 = modifier;
            this.f10797q0 = shape;
            this.f10798r0 = j10;
            this.f10799s0 = j11;
            this.f10800t0 = f6;
            this.f10801u0 = windowInsets;
            this.v0 = function3;
            this.f10802w0 = i10;
            this.f10803x0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            NavigationDrawerKt.m1181ModalDrawerSheetafqeVBk(this.f10796p0, this.f10797q0, this.f10798r0, this.f10799s0, this.f10800t0, this.f10801u0, this.v0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10802w0 | 1), this.f10803x0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    public static final class i extends Lambda implements Function2<DrawerValue, DrawerValue, ThresholdConfig> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f10804p0 = new i(2);

        @Override // kotlin.jvm.functions.Function2
        public final ThresholdConfig invoke(DrawerValue drawerValue, DrawerValue drawerValue2) {
            Intrinsics.checkNotNullParameter(drawerValue, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(drawerValue2, "<anonymous parameter 1>");
            return new FractionalThreshold(0.5f);
        }
    }

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    public static final class j extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f10805p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ DrawerState f10806q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f10807r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(boolean z10, DrawerState drawerState, CoroutineScope coroutineScope) {
            super(0);
            this.f10805p0 = z10;
            this.f10806q0 = drawerState;
            this.f10807r0 = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (this.f10805p0) {
                DrawerState drawerState = this.f10806q0;
                if (drawerState.getSwipeableState$material3_release().getConfirmStateChange$material3_release().invoke(DrawerValue.Closed).booleanValue()) {
                    BuildersKt__Builders_commonKt.launch$default(this.f10807r0, null, null, new r2(drawerState, null), 3, null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    public static final class k extends Lambda implements Function0<Float> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f10808p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ DrawerState f10809q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(float f6, DrawerState drawerState) {
            super(0);
            this.f10808p0 = f6;
            this.f10809q0 = drawerState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(NavigationDrawerKt.access$calculateFraction(this.f10808p0, 0.0f, this.f10809q0.getOffset().getValue().floatValue()));
        }
    }

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    public static final class l extends Lambda implements Function1<Density, IntOffset> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DrawerState f10810p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(DrawerState drawerState) {
            super(1);
            this.f10810p0 = drawerState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final IntOffset invoke(Density density) {
            Density offset = density;
            Intrinsics.checkNotNullParameter(offset, "$this$offset");
            return IntOffset.m4498boximpl(IntOffsetKt.IntOffset(mk.c.roundToInt(this.f10810p0.getOffset().getValue().floatValue()), 0));
        }
    }

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    public static final class m extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f10811p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ DrawerState f10812q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f10813r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, DrawerState drawerState, CoroutineScope coroutineScope) {
            super(1);
            this.f10811p0 = str;
            this.f10812q0 = drawerState;
            this.f10813r0 = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.setPaneTitle(semantics, this.f10811p0);
            DrawerState drawerState = this.f10812q0;
            if (drawerState.isOpen()) {
                SemanticsPropertiesKt.dismiss$default(semantics, null, new t2(drawerState, this.f10813r0), 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    public static final class n extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10814p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10815q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ DrawerState f10816r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f10817s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ long f10818t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10819u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f10820w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, DrawerState drawerState, boolean z10, long j10, Function2<? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f10814p0 = function2;
            this.f10815q0 = modifier;
            this.f10816r0 = drawerState;
            this.f10817s0 = z10;
            this.f10818t0 = j10;
            this.f10819u0 = function3;
            this.v0 = i10;
            this.f10820w0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            NavigationDrawerKt.m1182ModalNavigationDrawerFHprtrg(this.f10814p0, this.f10815q0, this.f10816r0, this.f10817s0, this.f10818t0, this.f10819u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f10820w0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    public static final class o extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final o f10821p0 = new o(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.m3843setRolekuIjeqM(semantics, Role.INSTANCE.m3837getTabo7Vup1c());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    @SourceDebugExtension({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt$NavigationDrawerItem$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,876:1\n154#2:877\n154#2:911\n154#2:950\n75#3,6:878\n81#3:910\n85#3:955\n75#4:884\n76#4,11:886\n75#4:918\n76#4,11:920\n89#4:948\n89#4:954\n76#5:885\n76#5:919\n460#6,13:897\n460#6,13:931\n473#6,3:945\n473#6,3:951\n67#7,6:912\n73#7:944\n77#7:949\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt$NavigationDrawerItem$3\n*L\n673#1:877\n679#1:911\n686#1:950\n672#1:878,6\n672#1:910\n672#1:955\n672#1:884\n672#1:886,11\n681#1:918\n681#1:920,11\n681#1:948\n672#1:954\n672#1:885\n681#1:919\n672#1:897,13\n681#1:931,13\n681#1:945,3\n672#1:951,3\n681#1:912,6\n681#1:944\n681#1:949\n*E\n"})
    public static final class p extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10822p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ NavigationDrawerItemColors f10823q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f10824r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f10825s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10826t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10827u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public p(Function2<? super Composer, ? super Integer, Unit> function2, NavigationDrawerItemColors navigationDrawerItemColors, boolean z10, int i10, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4) {
            super(2);
            this.f10822p0 = function2;
            this.f10823q0 = navigationDrawerItemColors;
            this.f10824r0 = z10;
            this.f10825s0 = i10;
            this.f10826t0 = function3;
            this.f10827u0 = function4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(191488423, iIntValue, -1, "androidx.compose.material3.NavigationDrawerItem.<anonymous> (NavigationDrawer.kt:670)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(companion, Dp.m4389constructorimpl(16), 0.0f, Dp.m4389constructorimpl(24), 0.0f, 10, null);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
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
                composer2.startReplaceableGroup(-1538531918);
                Function2<Composer, Integer, Unit> function2 = this.f10822p0;
                NavigationDrawerItemColors navigationDrawerItemColors = this.f10823q0;
                boolean z10 = this.f10824r0;
                int i10 = this.f10825s0;
                if (function2 != null) {
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(navigationDrawerItemColors.iconColor(z10, composer2, ((i10 >> 3) & 14) | ((i10 >> 18) & 112)).getValue().m2518unboximpl()))}, function2, composer2, ((i10 >> 9) & 112) | 8);
                    SpacerKt.Spacer(SizeKt.m340width3ABfNKs(companion, Dp.m4389constructorimpl(12)), composer2, 6);
                }
                composer2.endReplaceableGroup();
                Modifier modifierA = x.n1.a(rowScopeInstance, companion, 1.0f, false, 2, null);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion2, false, composer2, 0, -1323940314);
                Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierA);
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
                int i11 = ((i10 >> 3) & 14) | ((i10 >> 18) & 112);
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(navigationDrawerItemColors.textColor(z10, composer2, i11).getValue().m2518unboximpl()))}, this.f10827u0, composer2, ((i10 << 3) & 112) | 8);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(-533539227);
                Function2<Composer, Integer, Unit> function3 = this.f10826t0;
                if (function3 != null) {
                    SpacerKt.Spacer(SizeKt.m340width3ABfNKs(companion, Dp.m4389constructorimpl(12)), composer2, 6);
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(navigationDrawerItemColors.badgeColor(z10, composer2, i11).getValue().m2518unboximpl()))}, function3, composer2, ((i10 >> 12) & 112) | 8);
                }
                if (androidx.databinding.e.e(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    public static final class q extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10828p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f10829q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f10830r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10831s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10832t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10833u0;
        public final /* synthetic */ Shape v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ NavigationDrawerItemColors f10834w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f10835x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f10836y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public q(Function2<? super Composer, ? super Integer, Unit> function2, boolean z10, Function0<Unit> function0, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, Shape shape, NavigationDrawerItemColors navigationDrawerItemColors, MutableInteractionSource mutableInteractionSource, int i10, int i11) {
            super(2);
            this.f10828p0 = function2;
            this.f10829q0 = z10;
            this.f10830r0 = function0;
            this.f10831s0 = modifier;
            this.f10832t0 = function3;
            this.f10833u0 = function4;
            this.v0 = shape;
            this.f10834w0 = navigationDrawerItemColors;
            this.f10835x0 = mutableInteractionSource;
            this.f10836y0 = i10;
            this.E0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            NavigationDrawerKt.NavigationDrawerItem(this.f10828p0, this.f10829q0, this.f10830r0, this.f10831s0, this.f10832t0, this.f10833u0, this.v0, this.f10834w0, this.f10835x0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10836y0 | 1), this.E0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    public static final class r extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f10837p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str) {
            super(1);
            this.f10837p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.setPaneTitle(semantics, this.f10837p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    public static final class s extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10838p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Shape f10839q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f10840r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f10841s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ float f10842t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ WindowInsets f10843u0;
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f10844w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f10845x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(float f6, int i10, int i11, long j10, long j11, WindowInsets windowInsets, Modifier modifier, Shape shape, Function3 function3) {
            super(2);
            this.f10838p0 = modifier;
            this.f10839q0 = shape;
            this.f10840r0 = j10;
            this.f10841s0 = j11;
            this.f10842t0 = f6;
            this.f10843u0 = windowInsets;
            this.v0 = function3;
            this.f10844w0 = i10;
            this.f10845x0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            NavigationDrawerKt.m1183PermanentDrawerSheetafqeVBk(this.f10838p0, this.f10839q0, this.f10840r0, this.f10841s0, this.f10842t0, this.f10843u0, this.v0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10844w0 | 1), this.f10845x0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    public static final class t extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10846p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10847q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10848r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f10849s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f10850t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(int i10, int i11, Modifier modifier, Function2 function2, Function2 function3) {
            super(2);
            this.f10846p0 = function2;
            this.f10847q0 = modifier;
            this.f10848r0 = function3;
            this.f10849s0 = i10;
            this.f10850t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            NavigationDrawerKt.PermanentNavigationDrawer(this.f10846p0, this.f10847q0, this.f10848r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10849s0 | 1), this.f10850t0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    public static final class u extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long f10851p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Float> f10852q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(long j10, Function0<Float> function0) {
            super(1);
            this.f10851p0 = j10;
            this.f10852q0 = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope Canvas = drawScope;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            a1.b.K(Canvas, this.f10851p0, 0L, 0L, this.f10852q0.invoke().floatValue(), null, null, 0, 118, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    public static final class v extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f10853p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f10854q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<Float> f10855r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f10856s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f10857t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(boolean z10, Function0<Unit> function0, Function0<Float> function1, long j10, int i10) {
            super(2);
            this.f10853p0 = z10;
            this.f10854q0 = function0;
            this.f10855r0 = function1;
            this.f10856s0 = j10;
            this.f10857t0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            NavigationDrawerKt.b(this.f10853p0, this.f10854q0, this.f10855r0, this.f10856s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10857t0 | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    @DebugMetadata(c = "androidx.compose.material3.NavigationDrawerKt$Scrim$dismissDrawer$1$1", f = "NavigationDrawer.kt", i = {}, l = {852}, m = "invokeSuspend", n = {}, s = {})
    public static final class w extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f10858p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f10859q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f10860r0;

        /* JADX INFO: compiled from: NavigationDrawer.kt */
        public static final class a extends Lambda implements Function1<Offset, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Function0<Unit> f10861p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Function0<Unit> function0) {
                super(1);
                this.f10861p0 = function0;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Offset offset) {
                offset.getF15533a();
                this.f10861p0.invoke();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(Function0<Unit> function0, Continuation<? super w> continuation) {
            super(2, continuation);
            this.f10860r0 = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            w wVar = new w(this.f10860r0, continuation);
            wVar.f10859q0 = obj;
            return wVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((w) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f10858p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.f10859q0;
                a aVar = new a(this.f10860r0);
                this.f10858p0 = 1;
                if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, aVar, this, 7, null) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    public static final class x extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f10862p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f10863q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(String str, Function0<Unit> function0) {
            super(1);
            this.f10862p0 = str;
            this.f10863q0 = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.setContentDescription(semantics, this.f10862p0);
            SemanticsPropertiesKt.onClick$default(semantics, null, new u2(this.f10863q0), 1, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    public static final class y extends Lambda implements Function1<DrawerValue, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final y f10864p0 = new y(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(DrawerValue drawerValue) {
            DrawerValue it = drawerValue;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    public static final class z extends Lambda implements Function0<DrawerState> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DrawerValue f10865p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<DrawerValue, Boolean> f10866q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public z(DrawerValue drawerValue, Function1<? super DrawerValue, Boolean> function1) {
            super(0);
            this.f10865p0 = drawerValue;
            this.f10866q0 = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final DrawerState invoke() {
            return new DrawerState(this.f10865p0, this.f10866q0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012b  */
    /* JADX WARN: Code duplicated, block: B:102:0x012f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0139  */
    /* JADX WARN: Code duplicated, block: B:108:0x0149  */
    /* JADX WARN: Code duplicated, block: B:110:0x0156  */
    /* JADX WARN: Code duplicated, block: B:113:0x0161  */
    /* JADX WARN: Code duplicated, block: B:115:0x0174  */
    /* JADX WARN: Code duplicated, block: B:118:0x0186  */
    /* JADX WARN: Code duplicated, block: B:121:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:98:0x0126 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0128  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: DismissibleDrawerSheet-afqeVBk, reason: not valid java name */
    public static final void m1180DismissibleDrawerSheetafqeVBk(@Nullable Modifier modifier, @Nullable Shape shape, long j10, long j11, float f6, @Nullable WindowInsets windowInsets, @NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Shape rectangleShape;
        long jM978getSurface0d7_KjU;
        long jM1014contentColorForek8zF_U;
        int i13;
        float fM1086getDismissibleDrawerElevationD9Ej5fM;
        int i14;
        WindowInsets windowInsets2;
        int i15;
        Modifier modifier2;
        WindowInsets windowInsets3;
        float f10;
        Modifier modifier3;
        Modifier modifier4;
        Shape shape2;
        long j12;
        long j13;
        float f11;
        WindowInsets windowInsets4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i16;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-588600583);
        int i17 = i11 & 1;
        if (i17 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 112) == 0) {
                rectangleShape = shape;
                i12 |= composerStartRestartGroup.changed(rectangleShape) ? 32 : 16;
            }
            if ((i10 & 896) == 0) {
                if ((i11 & 4) == 0) {
                    jM978getSurface0d7_KjU = j10;
                    int i19 = composerStartRestartGroup.changed(jM978getSurface0d7_KjU) ? 256 : 128;
                    i12 |= i19;
                } else {
                    jM978getSurface0d7_KjU = j10;
                }
                i12 |= i19;
            } else {
                jM978getSurface0d7_KjU = j10;
            }
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    jM1014contentColorForek8zF_U = j11;
                    int i20 = composerStartRestartGroup.changed(jM1014contentColorForek8zF_U) ? 2048 : 1024;
                    i12 |= i20;
                } else {
                    jM1014contentColorForek8zF_U = j11;
                }
                i12 |= i20;
            } else {
                jM1014contentColorForek8zF_U = j11;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 57344) == 0) {
                    fM1086getDismissibleDrawerElevationD9Ej5fM = f6;
                    if (composerStartRestartGroup.changed(fM1086getDismissibleDrawerElevationD9Ej5fM)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                if ((i10 & 458752) == 0) {
                    windowInsets2 = windowInsets;
                    if ((i11 & 32) == 0 || !composerStartRestartGroup.changed(windowInsets2)) {
                        i16 = 65536;
                    } else {
                        i16 = 131072;
                    }
                    i12 |= i16;
                } else {
                    windowInsets2 = windowInsets;
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                    }
                    if ((i12 & 2995931) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i17 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i18 != 0) {
                                rectangleShape = RectangleShapeKt.getRectangleShape();
                            }
                            if ((i11 & 4) != 0) {
                                jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                                i12 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                                i12 &= -7169;
                            }
                            if (i13 != 0) {
                                fM1086getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1086getDismissibleDrawerElevationD9Ej5fM();
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                            } else {
                                windowInsets3 = windowInsets2;
                            }
                            f10 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                            modifier3 = modifier2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 4) != 0) {
                                i12 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            rectangleShape = rectangleShape;
                            jM978getSurface0d7_KjU = jM978getSurface0d7_KjU;
                            jM1014contentColorForek8zF_U = jM1014contentColorForek8zF_U;
                            windowInsets3 = windowInsets2;
                            f10 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                            modifier3 = modifier;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-588600583, i12, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:491)");
                        }
                        int i21 = i12 << 3;
                        a(windowInsets3, modifier3, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i21 & 112) | (i21 & 896) | (i21 & 7168) | (57344 & i21) | (i21 & 458752) | (i12 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        shape2 = rectangleShape;
                        j12 = jM978getSurface0d7_KjU;
                        j13 = jM1014contentColorForek8zF_U;
                        f11 = f10;
                        windowInsets4 = windowInsets3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        shape2 = rectangleShape;
                        j12 = jM978getSurface0d7_KjU;
                        j13 = jM1014contentColorForek8zF_U;
                        windowInsets4 = windowInsets2;
                        f11 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                        modifier4 = modifier;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(f11, i10, i11, j12, j13, windowInsets4, modifier4, shape2, content));
                }
                i15 = 1572864;
                i12 |= i15;
                if ((i12 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i18 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                        if ((i11 & 4) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fM1086getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1086getDismissibleDrawerElevationD9Ej5fM();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        } else {
                            windowInsets3 = windowInsets2;
                        }
                        f10 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                        modifier3 = modifier2;
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i18 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                        if ((i11 & 4) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fM1086getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1086getDismissibleDrawerElevationD9Ej5fM();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        } else {
                            windowInsets3 = windowInsets2;
                        }
                        f10 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-588600583, i12, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:491)");
                    }
                    int i22 = i12 << 3;
                    a(windowInsets3, modifier3, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i22 & 112) | (i22 & 896) | (i22 & 7168) | (57344 & i22) | (i22 & 458752) | (i12 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape2 = rectangleShape;
                    j12 = jM978getSurface0d7_KjU;
                    j13 = jM1014contentColorForek8zF_U;
                    f11 = f10;
                    windowInsets4 = windowInsets3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i18 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                        if ((i11 & 4) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fM1086getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1086getDismissibleDrawerElevationD9Ej5fM();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        } else {
                            windowInsets3 = windowInsets2;
                        }
                        f10 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                        modifier3 = modifier2;
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i18 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                        if ((i11 & 4) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fM1086getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1086getDismissibleDrawerElevationD9Ej5fM();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        } else {
                            windowInsets3 = windowInsets2;
                        }
                        f10 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-588600583, i12, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:491)");
                    }
                    int i23 = i12 << 3;
                    a(windowInsets3, modifier3, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i23 & 112) | (i23 & 896) | (i23 & 7168) | (57344 & i23) | (i23 & 458752) | (i12 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape2 = rectangleShape;
                    j12 = jM978getSurface0d7_KjU;
                    j13 = jM1014contentColorForek8zF_U;
                    f11 = f10;
                    windowInsets4 = windowInsets3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(f11, i10, i11, j12, j13, windowInsets4, modifier4, shape2, content));
            }
            i12 |= 24576;
            fM1086getDismissibleDrawerElevationD9Ej5fM = f6;
            if ((i10 & 458752) == 0) {
                windowInsets2 = windowInsets;
                if ((i11 & 32) == 0) {
                    i16 = 65536;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            } else {
                windowInsets2 = windowInsets;
            }
            if ((i11 & 64) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                }
                if ((i12 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i18 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                        if ((i11 & 4) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fM1086getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1086getDismissibleDrawerElevationD9Ej5fM();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        } else {
                            windowInsets3 = windowInsets2;
                        }
                        f10 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                        modifier3 = modifier2;
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i18 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                        if ((i11 & 4) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fM1086getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1086getDismissibleDrawerElevationD9Ej5fM();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        } else {
                            windowInsets3 = windowInsets2;
                        }
                        f10 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-588600583, i12, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:491)");
                    }
                    int i24 = i12 << 3;
                    a(windowInsets3, modifier3, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i24 & 112) | (i24 & 896) | (i24 & 7168) | (57344 & i24) | (i24 & 458752) | (i12 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape2 = rectangleShape;
                    j12 = jM978getSurface0d7_KjU;
                    j13 = jM1014contentColorForek8zF_U;
                    f11 = f10;
                    windowInsets4 = windowInsets3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i18 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                        if ((i11 & 4) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fM1086getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1086getDismissibleDrawerElevationD9Ej5fM();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        } else {
                            windowInsets3 = windowInsets2;
                        }
                        f10 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                        modifier3 = modifier2;
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i18 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                        if ((i11 & 4) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fM1086getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1086getDismissibleDrawerElevationD9Ej5fM();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        } else {
                            windowInsets3 = windowInsets2;
                        }
                        f10 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-588600583, i12, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:491)");
                    }
                    int i25 = i12 << 3;
                    a(windowInsets3, modifier3, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i25 & 112) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (i25 & 458752) | (i12 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape2 = rectangleShape;
                    j12 = jM978getSurface0d7_KjU;
                    j13 = jM1014contentColorForek8zF_U;
                    f11 = f10;
                    windowInsets4 = windowInsets3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(f11, i10, i11, j12, j13, windowInsets4, modifier4, shape2, content));
            }
            i15 = 1572864;
            i12 |= i15;
            if ((i12 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fM1086getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1086getDismissibleDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    } else {
                        windowInsets3 = windowInsets2;
                    }
                    f10 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                    modifier3 = modifier2;
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fM1086getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1086getDismissibleDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    } else {
                        windowInsets3 = windowInsets2;
                    }
                    f10 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-588600583, i12, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:491)");
                }
                int i26 = i12 << 3;
                a(windowInsets3, modifier3, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i26 & 112) | (i26 & 896) | (i26 & 7168) | (57344 & i26) | (i26 & 458752) | (i12 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape2 = rectangleShape;
                j12 = jM978getSurface0d7_KjU;
                j13 = jM1014contentColorForek8zF_U;
                f11 = f10;
                windowInsets4 = windowInsets3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fM1086getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1086getDismissibleDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    } else {
                        windowInsets3 = windowInsets2;
                    }
                    f10 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                    modifier3 = modifier2;
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fM1086getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1086getDismissibleDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    } else {
                        windowInsets3 = windowInsets2;
                    }
                    f10 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-588600583, i12, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:491)");
                }
                int i27 = i12 << 3;
                a(windowInsets3, modifier3, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i27 & 112) | (i27 & 896) | (i27 & 7168) | (57344 & i27) | (i27 & 458752) | (i12 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape2 = rectangleShape;
                j12 = jM978getSurface0d7_KjU;
                j13 = jM1014contentColorForek8zF_U;
                f11 = f10;
                windowInsets4 = windowInsets3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(f11, i10, i11, j12, j13, windowInsets4, modifier4, shape2, content));
        }
        i12 |= 48;
        rectangleShape = shape;
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                jM978getSurface0d7_KjU = j10;
                if (composerStartRestartGroup.changed(jM978getSurface0d7_KjU)) {
                }
                i12 |= i19;
            } else {
                jM978getSurface0d7_KjU = j10;
            }
            i12 |= i19;
        } else {
            jM978getSurface0d7_KjU = j10;
        }
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                jM1014contentColorForek8zF_U = j11;
                if (composerStartRestartGroup.changed(jM1014contentColorForek8zF_U)) {
                }
                i12 |= i20;
            } else {
                jM1014contentColorForek8zF_U = j11;
            }
            i12 |= i20;
        } else {
            jM1014contentColorForek8zF_U = j11;
        }
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 57344) == 0) {
                fM1086getDismissibleDrawerElevationD9Ej5fM = f6;
                if (composerStartRestartGroup.changed(fM1086getDismissibleDrawerElevationD9Ej5fM)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((i10 & 458752) == 0) {
                windowInsets2 = windowInsets;
                if ((i11 & 32) == 0) {
                    i16 = 65536;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            } else {
                windowInsets2 = windowInsets;
            }
            if ((i11 & 64) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                }
                if ((i12 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i18 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                        if ((i11 & 4) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fM1086getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1086getDismissibleDrawerElevationD9Ej5fM();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        } else {
                            windowInsets3 = windowInsets2;
                        }
                        f10 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                        modifier3 = modifier2;
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i18 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                        if ((i11 & 4) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fM1086getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1086getDismissibleDrawerElevationD9Ej5fM();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        } else {
                            windowInsets3 = windowInsets2;
                        }
                        f10 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-588600583, i12, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:491)");
                    }
                    int i28 = i12 << 3;
                    a(windowInsets3, modifier3, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i28 & 112) | (i28 & 896) | (i28 & 7168) | (57344 & i28) | (i28 & 458752) | (i12 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape2 = rectangleShape;
                    j12 = jM978getSurface0d7_KjU;
                    j13 = jM1014contentColorForek8zF_U;
                    f11 = f10;
                    windowInsets4 = windowInsets3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i18 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                        if ((i11 & 4) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fM1086getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1086getDismissibleDrawerElevationD9Ej5fM();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        } else {
                            windowInsets3 = windowInsets2;
                        }
                        f10 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                        modifier3 = modifier2;
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i18 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                        if ((i11 & 4) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fM1086getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1086getDismissibleDrawerElevationD9Ej5fM();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        } else {
                            windowInsets3 = windowInsets2;
                        }
                        f10 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-588600583, i12, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:491)");
                    }
                    int i29 = i12 << 3;
                    a(windowInsets3, modifier3, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (i29 & 458752) | (i12 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape2 = rectangleShape;
                    j12 = jM978getSurface0d7_KjU;
                    j13 = jM1014contentColorForek8zF_U;
                    f11 = f10;
                    windowInsets4 = windowInsets3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(f11, i10, i11, j12, j13, windowInsets4, modifier4, shape2, content));
            }
            i15 = 1572864;
            i12 |= i15;
            if ((i12 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fM1086getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1086getDismissibleDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    } else {
                        windowInsets3 = windowInsets2;
                    }
                    f10 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                    modifier3 = modifier2;
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fM1086getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1086getDismissibleDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    } else {
                        windowInsets3 = windowInsets2;
                    }
                    f10 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-588600583, i12, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:491)");
                }
                int i210 = i12 << 3;
                a(windowInsets3, modifier3, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i210 & 112) | (i210 & 896) | (i210 & 7168) | (57344 & i210) | (i210 & 458752) | (i12 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape2 = rectangleShape;
                j12 = jM978getSurface0d7_KjU;
                j13 = jM1014contentColorForek8zF_U;
                f11 = f10;
                windowInsets4 = windowInsets3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fM1086getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1086getDismissibleDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    } else {
                        windowInsets3 = windowInsets2;
                    }
                    f10 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                    modifier3 = modifier2;
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fM1086getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1086getDismissibleDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    } else {
                        windowInsets3 = windowInsets2;
                    }
                    f10 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-588600583, i12, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:491)");
                }
                int i211 = i12 << 3;
                a(windowInsets3, modifier3, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i211 & 112) | (i211 & 896) | (i211 & 7168) | (57344 & i211) | (i211 & 458752) | (i12 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape2 = rectangleShape;
                j12 = jM978getSurface0d7_KjU;
                j13 = jM1014contentColorForek8zF_U;
                f11 = f10;
                windowInsets4 = windowInsets3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(f11, i10, i11, j12, j13, windowInsets4, modifier4, shape2, content));
        }
        i12 |= 24576;
        fM1086getDismissibleDrawerElevationD9Ej5fM = f6;
        if ((i10 & 458752) == 0) {
            windowInsets2 = windowInsets;
            if ((i11 & 32) == 0) {
                i16 = 65536;
            } else {
                i16 = 65536;
            }
            i12 |= i16;
        } else {
            windowInsets2 = windowInsets;
        }
        if ((i11 & 64) != 0) {
            if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
            }
            if ((i12 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fM1086getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1086getDismissibleDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    } else {
                        windowInsets3 = windowInsets2;
                    }
                    f10 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                    modifier3 = modifier2;
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fM1086getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1086getDismissibleDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    } else {
                        windowInsets3 = windowInsets2;
                    }
                    f10 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-588600583, i12, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:491)");
                }
                int i212 = i12 << 3;
                a(windowInsets3, modifier3, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i212 & 112) | (i212 & 896) | (i212 & 7168) | (57344 & i212) | (i212 & 458752) | (i12 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape2 = rectangleShape;
                j12 = jM978getSurface0d7_KjU;
                j13 = jM1014contentColorForek8zF_U;
                f11 = f10;
                windowInsets4 = windowInsets3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fM1086getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1086getDismissibleDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    } else {
                        windowInsets3 = windowInsets2;
                    }
                    f10 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                    modifier3 = modifier2;
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fM1086getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1086getDismissibleDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    } else {
                        windowInsets3 = windowInsets2;
                    }
                    f10 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-588600583, i12, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:491)");
                }
                int i213 = i12 << 3;
                a(windowInsets3, modifier3, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i213 & 112) | (i213 & 896) | (i213 & 7168) | (57344 & i213) | (i213 & 458752) | (i12 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape2 = rectangleShape;
                j12 = jM978getSurface0d7_KjU;
                j13 = jM1014contentColorForek8zF_U;
                f11 = f10;
                windowInsets4 = windowInsets3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(f11, i10, i11, j12, j13, windowInsets4, modifier4, shape2, content));
        }
        i15 = 1572864;
        i12 |= i15;
        if ((i12 & 2995931) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i18 != 0) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                if ((i11 & 4) != 0) {
                    jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                    i12 &= -7169;
                }
                if (i13 != 0) {
                    fM1086getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1086getDismissibleDrawerElevationD9Ej5fM();
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                } else {
                    windowInsets3 = windowInsets2;
                }
                f10 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                modifier3 = modifier2;
            } else {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i18 != 0) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                if ((i11 & 4) != 0) {
                    jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                    i12 &= -7169;
                }
                if (i13 != 0) {
                    fM1086getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1086getDismissibleDrawerElevationD9Ej5fM();
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                } else {
                    windowInsets3 = windowInsets2;
                }
                f10 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                modifier3 = modifier2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-588600583, i12, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:491)");
            }
            int i214 = i12 << 3;
            a(windowInsets3, modifier3, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i214 & 112) | (i214 & 896) | (i214 & 7168) | (57344 & i214) | (i214 & 458752) | (i12 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            shape2 = rectangleShape;
            j12 = jM978getSurface0d7_KjU;
            j13 = jM1014contentColorForek8zF_U;
            f11 = f10;
            windowInsets4 = windowInsets3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i18 != 0) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                if ((i11 & 4) != 0) {
                    jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                    i12 &= -7169;
                }
                if (i13 != 0) {
                    fM1086getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1086getDismissibleDrawerElevationD9Ej5fM();
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                } else {
                    windowInsets3 = windowInsets2;
                }
                f10 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                modifier3 = modifier2;
            } else {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i18 != 0) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                if ((i11 & 4) != 0) {
                    jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                    i12 &= -7169;
                }
                if (i13 != 0) {
                    fM1086getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1086getDismissibleDrawerElevationD9Ej5fM();
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                } else {
                    windowInsets3 = windowInsets2;
                }
                f10 = fM1086getDismissibleDrawerElevationD9Ej5fM;
                modifier3 = modifier2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-588600583, i12, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:491)");
            }
            int i215 = i12 << 3;
            a(windowInsets3, modifier3, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i215 & 112) | (i215 & 896) | (i215 & 7168) | (57344 & i215) | (i215 & 458752) | (i12 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            shape2 = rectangleShape;
            j12 = jM978getSurface0d7_KjU;
            j13 = jM1014contentColorForek8zF_U;
            f11 = f10;
            windowInsets4 = windowInsets3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(f11, i10, i11, j12, j13, windowInsets4, modifier4, shape2, content));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x023e  */
    /* JADX WARN: Code duplicated, block: B:103:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:106:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:107:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:110:0x0339  */
    /* JADX WARN: Code duplicated, block: B:113:0x0345  */
    /* JADX WARN: Code duplicated, block: B:114:0x0349  */
    /* JADX WARN: Code duplicated, block: B:117:0x0399  */
    /* JADX WARN: Code duplicated, block: B:122:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:82:0x0117  */
    /* JADX WARN: Code duplicated, block: B:85:0x0163  */
    /* JADX WARN: Code duplicated, block: B:86:0x0166  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:96:0x022e  */
    /* JADX WARN: Code duplicated, block: B:99:0x023a  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void DismissibleNavigationDrawer(@NotNull Function2<? super Composer, ? super Integer, Unit> drawerContent, @Nullable Modifier modifier, @Nullable DrawerState drawerState, boolean z10, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        DrawerState drawerStateRememberDrawerState;
        int i13;
        boolean z11;
        int i14;
        int i15;
        Object objB;
        boolean z12;
        Function0<ComposeUiNode> constructor;
        Function0<ComposeUiNode> constructor2;
        Function0<ComposeUiNode> constructor3;
        Function0<ComposeUiNode> constructor4;
        DrawerState drawerState2;
        boolean z13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(drawerContent, "drawerContent");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(398812198);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(drawerContent) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i10 & 896) == 0) {
                if ((i11 & 4) == 0) {
                    drawerStateRememberDrawerState = drawerState;
                    int i17 = composerStartRestartGroup.changed(drawerStateRememberDrawerState) ? 256 : 128;
                    i12 |= i17;
                } else {
                    drawerStateRememberDrawerState = drawerState;
                }
                i12 |= i17;
            } else {
                drawerStateRememberDrawerState = drawerState;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((57344 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i12 |= i15;
                }
                if ((46811 & i12) == 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(398812198, i12, -1, "androidx.compose.material3.DismissibleNavigationDrawer (NavigationDrawer.kt:344)");
                    }
                    float f6 = -((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(NavigationDrawerTokens.INSTANCE.m1791getContainerWidthD9Ej5fM());
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    if (objB == Composer.INSTANCE.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    String strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                    Map mapMapOf = bk.q.mapOf(TuplesKt.to(Float.valueOf(f6), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    Modifier modifierM1336swipeablepPrIpRY = SwipeableKt.m1336swipeablepPrIpRY(modifier2, drawerStateRememberDrawerState.getSwipeableState$material3_release(), mapMapOf, Orientation.Horizontal, (32 & 8) != 0 ? true : z11, (32 & 16) != 0 ? false : z12, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? SwipeableKt.f.f11738p0 : b.f10771p0, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$material3_release$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1335getVelocityThresholdD9Ej5fM$material3_release() : f10760a);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion, false, composerStartRestartGroup, 0, -1323940314);
                    Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Modifier modifier3 = modifier2;
                    constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM1336swipeablepPrIpRY);
                    boolean z14 = z11;
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
                    Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, density));
                    ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    d dVar = new d(drawerStateRememberDrawerState);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion2.getConstructor();
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
                    Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl2, dVar, companion2.getSetMeasurePolicy());
                    Updater.m2081setimpl(composerM2074constructorimpl2, density2, companion2.getSetDensity());
                    Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
                    Updater.m2081setimpl(composerM2074constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
                    function3MaterializerOf2.invoke(SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion3, false, new c(strM1320getStringNWtq28, drawerStateRememberDrawerState, coroutineScope), 1, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyC2 = androidx.databinding.f.c(companion, false, composerStartRestartGroup, 0, -1323940314);
                    Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor3 = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierSemantics$default);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2074constructorimpl3 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl3, layoutDirection3, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl3, measurePolicyC2, composerM2074constructorimpl3, density3));
                    ai.a.j(0, function3MaterializerOf3, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    drawerContent.invoke(composerStartRestartGroup, Integer.valueOf(i12 & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                    Density density4 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
                    LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor4 = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(companion3);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor4);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2074constructorimpl4 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl4, layoutDirection4, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl4, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl4, density4));
                    ai.a.j(0, function3MaterializerOf4, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl4, viewConfiguration4, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 12) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    drawerState2 = drawerStateRememberDrawerState;
                    modifier2 = modifier3;
                    z13 = z14;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    drawerState2 = drawerStateRememberDrawerState;
                    z13 = z11;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(drawerContent, modifier2, drawerState2, z13, content, i10, i11));
            }
            i12 |= 3072;
            z11 = z10;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            if ((46811 & i12) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(398812198, i12, -1, "androidx.compose.material3.DismissibleNavigationDrawer (NavigationDrawer.kt:344)");
                }
                float f10 = -((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(NavigationDrawerTokens.INSTANCE.m1791getContainerWidthD9Ej5fM());
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                if (objB == Composer.INSTANCE.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                String strM1320getStringNWtq29 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                Map mapMapOf2 = bk.q.mapOf(TuplesKt.to(Float.valueOf(f10), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Modifier modifierM1336swipeablepPrIpRY2 = SwipeableKt.m1336swipeablepPrIpRY(modifier2, drawerStateRememberDrawerState.getSwipeableState$material3_release(), mapMapOf2, Orientation.Horizontal, (32 & 8) != 0 ? true : z11, (32 & 16) != 0 ? false : z12, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? SwipeableKt.f.f11738p0 : b.f10771p0, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$material3_release$default(SwipeableDefaults.INSTANCE, mapMapOf2.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1335getVelocityThresholdD9Ej5fM$material3_release() : f10760a);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyC3 = androidx.databinding.f.c(companion4, false, composerStartRestartGroup, 0, -1323940314);
                Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                Modifier modifier4 = modifier2;
                constructor = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifierM1336swipeablepPrIpRY2);
                boolean z15 = z11;
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
                Updater.m2081setimpl(composerM2074constructorimpl5, layoutDirection5, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion5, composerM2074constructorimpl5, measurePolicyC3, composerM2074constructorimpl5, density5));
                ai.a.j(0, function3MaterializerOf5, androidx.appcompat.widget.g0.b(companion5, composerM2074constructorimpl5, viewConfiguration5, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                d dVar2 = new d(drawerStateRememberDrawerState);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Modifier.Companion companion6 = Modifier.INSTANCE;
                Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration6 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(companion6);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM2074constructorimpl6 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl6, dVar2, companion5.getSetMeasurePolicy());
                Updater.m2081setimpl(composerM2074constructorimpl6, density6, companion5.getSetDensity());
                Updater.m2081setimpl(composerM2074constructorimpl6, layoutDirection6, companion5.getSetLayoutDirection());
                Updater.m2081setimpl(composerM2074constructorimpl6, viewConfiguration6, companion5.getSetViewConfiguration());
                function3MaterializerOf6.invoke(SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                Modifier modifierSemantics$default2 = SemanticsModifierKt.semantics$default(companion6, false, new c(strM1320getStringNWtq29, drawerStateRememberDrawerState, coroutineScope2), 1, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC4 = androidx.databinding.f.c(companion4, false, composerStartRestartGroup, 0, -1323940314);
                Density density7 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection7 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration7 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor3 = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf7 = LayoutKt.materializerOf(modifierSemantics$default2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl7 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl7, layoutDirection7, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion5, composerM2074constructorimpl7, measurePolicyC4, composerM2074constructorimpl7, density7));
                ai.a.j(0, function3MaterializerOf7, androidx.appcompat.widget.g0.b(companion5, composerM2074constructorimpl7, viewConfiguration7, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                drawerContent.invoke(composerStartRestartGroup, Integer.valueOf(i12 & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composerStartRestartGroup, 0);
                Density density8 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection8 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration8 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor4 = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf8 = LayoutKt.materializerOf(companion6);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl8 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl8, layoutDirection8, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion5, composerM2074constructorimpl8, measurePolicyRememberBoxMeasurePolicy2, composerM2074constructorimpl8, density8));
                ai.a.j(0, function3MaterializerOf8, androidx.appcompat.widget.g0.b(companion5, composerM2074constructorimpl8, viewConfiguration8, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 12) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                drawerState2 = drawerStateRememberDrawerState;
                modifier2 = modifier4;
                z13 = z15;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(398812198, i12, -1, "androidx.compose.material3.DismissibleNavigationDrawer (NavigationDrawer.kt:344)");
                }
                float f11 = -((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(NavigationDrawerTokens.INSTANCE.m1791getContainerWidthD9Ej5fM());
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                if (objB == Composer.INSTANCE.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope3 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                String strM1320getStringNWtq210 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                Map mapMapOf3 = bk.q.mapOf(TuplesKt.to(Float.valueOf(f11), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Modifier modifierM1336swipeablepPrIpRY3 = SwipeableKt.m1336swipeablepPrIpRY(modifier2, drawerStateRememberDrawerState.getSwipeableState$material3_release(), mapMapOf3, Orientation.Horizontal, (32 & 8) != 0 ? true : z11, (32 & 16) != 0 ? false : z12, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? SwipeableKt.f.f11738p0 : b.f10771p0, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$material3_release$default(SwipeableDefaults.INSTANCE, mapMapOf3.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1335getVelocityThresholdD9Ej5fM$material3_release() : f10760a);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion7 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyC5 = androidx.databinding.f.c(companion7, false, composerStartRestartGroup, 0, -1323940314);
                Density density9 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection9 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration9 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                Modifier modifier5 = modifier2;
                constructor = companion8.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf9 = LayoutKt.materializerOf(modifierM1336swipeablepPrIpRY3);
                boolean z16 = z11;
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
                Updater.m2081setimpl(composerM2074constructorimpl9, layoutDirection9, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion8, composerM2074constructorimpl9, measurePolicyC5, composerM2074constructorimpl9, density9));
                ai.a.j(0, function3MaterializerOf9, androidx.appcompat.widget.g0.b(companion8, composerM2074constructorimpl9, viewConfiguration9, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                d dVar3 = new d(drawerStateRememberDrawerState);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Modifier.Companion companion9 = Modifier.INSTANCE;
                Density density10 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection10 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration10 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion8.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf10 = LayoutKt.materializerOf(companion9);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM2074constructorimpl10 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl10, dVar3, companion8.getSetMeasurePolicy());
                Updater.m2081setimpl(composerM2074constructorimpl10, density10, companion8.getSetDensity());
                Updater.m2081setimpl(composerM2074constructorimpl10, layoutDirection10, companion8.getSetLayoutDirection());
                Updater.m2081setimpl(composerM2074constructorimpl10, viewConfiguration10, companion8.getSetViewConfiguration());
                function3MaterializerOf10.invoke(SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                Modifier modifierSemantics$default3 = SemanticsModifierKt.semantics$default(companion9, false, new c(strM1320getStringNWtq210, drawerStateRememberDrawerState, coroutineScope3), 1, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC6 = androidx.databinding.f.c(companion7, false, composerStartRestartGroup, 0, -1323940314);
                Density density11 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection11 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration11 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor3 = companion8.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11 = LayoutKt.materializerOf(modifierSemantics$default3);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl11 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl11, layoutDirection11, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion8, composerM2074constructorimpl11, measurePolicyC6, composerM2074constructorimpl11, density11));
                ai.a.j(0, function3MaterializerOf11, androidx.appcompat.widget.g0.b(companion8, composerM2074constructorimpl11, viewConfiguration11, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                drawerContent.invoke(composerStartRestartGroup, Integer.valueOf(i12 & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion7.getTopStart(), false, composerStartRestartGroup, 0);
                Density density12 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection12 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration12 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor4 = companion8.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf12 = LayoutKt.materializerOf(companion9);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl12 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl12, layoutDirection12, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion8, composerM2074constructorimpl12, measurePolicyRememberBoxMeasurePolicy3, composerM2074constructorimpl12, density12));
                ai.a.j(0, function3MaterializerOf12, androidx.appcompat.widget.g0.b(companion8, composerM2074constructorimpl12, viewConfiguration12, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 12) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                drawerState2 = drawerStateRememberDrawerState;
                modifier2 = modifier5;
                z13 = z16;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(drawerContent, modifier2, drawerState2, z13, content, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                drawerStateRememberDrawerState = drawerState;
                if (composerStartRestartGroup.changed(drawerStateRememberDrawerState)) {
                }
                i12 |= i17;
            } else {
                drawerStateRememberDrawerState = drawerState;
            }
            i12 |= i17;
        } else {
            drawerStateRememberDrawerState = drawerState;
        }
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                z11 = z10;
                if (composerStartRestartGroup.changed(z11)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            if ((46811 & i12) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(398812198, i12, -1, "androidx.compose.material3.DismissibleNavigationDrawer (NavigationDrawer.kt:344)");
                }
                float f12 = -((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(NavigationDrawerTokens.INSTANCE.m1791getContainerWidthD9Ej5fM());
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                if (objB == Composer.INSTANCE.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope4 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                String strM1320getStringNWtq211 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                Map mapMapOf4 = bk.q.mapOf(TuplesKt.to(Float.valueOf(f12), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Modifier modifierM1336swipeablepPrIpRY4 = SwipeableKt.m1336swipeablepPrIpRY(modifier2, drawerStateRememberDrawerState.getSwipeableState$material3_release(), mapMapOf4, Orientation.Horizontal, (32 & 8) != 0 ? true : z11, (32 & 16) != 0 ? false : z12, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? SwipeableKt.f.f11738p0 : b.f10771p0, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$material3_release$default(SwipeableDefaults.INSTANCE, mapMapOf4.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1335getVelocityThresholdD9Ej5fM$material3_release() : f10760a);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion10 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyC7 = androidx.databinding.f.c(companion10, false, composerStartRestartGroup, 0, -1323940314);
                Density density13 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection13 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration13 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                Modifier modifier6 = modifier2;
                constructor = companion11.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf13 = LayoutKt.materializerOf(modifierM1336swipeablepPrIpRY4);
                boolean z17 = z11;
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
                Updater.m2081setimpl(composerM2074constructorimpl13, layoutDirection13, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion11, composerM2074constructorimpl13, measurePolicyC7, composerM2074constructorimpl13, density13));
                ai.a.j(0, function3MaterializerOf13, androidx.appcompat.widget.g0.b(companion11, composerM2074constructorimpl13, viewConfiguration13, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                d dVar4 = new d(drawerStateRememberDrawerState);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Modifier.Companion companion12 = Modifier.INSTANCE;
                Density density14 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection14 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration14 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion11.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf14 = LayoutKt.materializerOf(companion12);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM2074constructorimpl14 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl14, dVar4, companion11.getSetMeasurePolicy());
                Updater.m2081setimpl(composerM2074constructorimpl14, density14, companion11.getSetDensity());
                Updater.m2081setimpl(composerM2074constructorimpl14, layoutDirection14, companion11.getSetLayoutDirection());
                Updater.m2081setimpl(composerM2074constructorimpl14, viewConfiguration14, companion11.getSetViewConfiguration());
                function3MaterializerOf14.invoke(SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                Modifier modifierSemantics$default4 = SemanticsModifierKt.semantics$default(companion12, false, new c(strM1320getStringNWtq211, drawerStateRememberDrawerState, coroutineScope4), 1, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC8 = androidx.databinding.f.c(companion10, false, composerStartRestartGroup, 0, -1323940314);
                Density density15 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection15 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration15 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor3 = companion11.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf15 = LayoutKt.materializerOf(modifierSemantics$default4);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl15 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl15, layoutDirection15, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion11, composerM2074constructorimpl15, measurePolicyC8, composerM2074constructorimpl15, density15));
                ai.a.j(0, function3MaterializerOf15, androidx.appcompat.widget.g0.b(companion11, composerM2074constructorimpl15, viewConfiguration15, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                drawerContent.invoke(composerStartRestartGroup, Integer.valueOf(i12 & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion10.getTopStart(), false, composerStartRestartGroup, 0);
                Density density16 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection16 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration16 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor4 = companion11.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf16 = LayoutKt.materializerOf(companion12);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl16 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl16, layoutDirection16, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion11, composerM2074constructorimpl16, measurePolicyRememberBoxMeasurePolicy4, composerM2074constructorimpl16, density16));
                ai.a.j(0, function3MaterializerOf16, androidx.appcompat.widget.g0.b(companion11, composerM2074constructorimpl16, viewConfiguration16, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 12) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                drawerState2 = drawerStateRememberDrawerState;
                modifier2 = modifier6;
                z13 = z17;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(398812198, i12, -1, "androidx.compose.material3.DismissibleNavigationDrawer (NavigationDrawer.kt:344)");
                }
                float f13 = -((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(NavigationDrawerTokens.INSTANCE.m1791getContainerWidthD9Ej5fM());
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                if (objB == Composer.INSTANCE.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope5 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                String strM1320getStringNWtq212 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                Map mapMapOf5 = bk.q.mapOf(TuplesKt.to(Float.valueOf(f13), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Modifier modifierM1336swipeablepPrIpRY5 = SwipeableKt.m1336swipeablepPrIpRY(modifier2, drawerStateRememberDrawerState.getSwipeableState$material3_release(), mapMapOf5, Orientation.Horizontal, (32 & 8) != 0 ? true : z11, (32 & 16) != 0 ? false : z12, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? SwipeableKt.f.f11738p0 : b.f10771p0, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$material3_release$default(SwipeableDefaults.INSTANCE, mapMapOf5.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1335getVelocityThresholdD9Ej5fM$material3_release() : f10760a);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion13 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyC9 = androidx.databinding.f.c(companion13, false, composerStartRestartGroup, 0, -1323940314);
                Density density17 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection17 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration17 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                Modifier modifier7 = modifier2;
                constructor = companion14.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf17 = LayoutKt.materializerOf(modifierM1336swipeablepPrIpRY5);
                boolean z18 = z11;
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
                Composer composerM2074constructorimpl17 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl17, layoutDirection17, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion14, composerM2074constructorimpl17, measurePolicyC9, composerM2074constructorimpl17, density17));
                ai.a.j(0, function3MaterializerOf17, androidx.appcompat.widget.g0.b(companion14, composerM2074constructorimpl17, viewConfiguration17, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                d dVar5 = new d(drawerStateRememberDrawerState);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Modifier.Companion companion15 = Modifier.INSTANCE;
                Density density18 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection18 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration18 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion14.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf18 = LayoutKt.materializerOf(companion15);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM2074constructorimpl18 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl18, dVar5, companion14.getSetMeasurePolicy());
                Updater.m2081setimpl(composerM2074constructorimpl18, density18, companion14.getSetDensity());
                Updater.m2081setimpl(composerM2074constructorimpl18, layoutDirection18, companion14.getSetLayoutDirection());
                Updater.m2081setimpl(composerM2074constructorimpl18, viewConfiguration18, companion14.getSetViewConfiguration());
                function3MaterializerOf18.invoke(SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                Modifier modifierSemantics$default5 = SemanticsModifierKt.semantics$default(companion15, false, new c(strM1320getStringNWtq212, drawerStateRememberDrawerState, coroutineScope5), 1, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC10 = androidx.databinding.f.c(companion13, false, composerStartRestartGroup, 0, -1323940314);
                Density density19 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection19 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration19 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor3 = companion14.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf19 = LayoutKt.materializerOf(modifierSemantics$default5);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl19 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl19, layoutDirection19, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion14, composerM2074constructorimpl19, measurePolicyC10, composerM2074constructorimpl19, density19));
                ai.a.j(0, function3MaterializerOf19, androidx.appcompat.widget.g0.b(companion14, composerM2074constructorimpl19, viewConfiguration19, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                drawerContent.invoke(composerStartRestartGroup, Integer.valueOf(i12 & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(companion13.getTopStart(), false, composerStartRestartGroup, 0);
                Density density110 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
                LayoutDirection layoutDirection110 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration110 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor4 = companion14.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf110 = LayoutKt.materializerOf(companion15);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl110 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl110, layoutDirection110, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion14, composerM2074constructorimpl110, measurePolicyRememberBoxMeasurePolicy5, composerM2074constructorimpl110, density110));
                ai.a.j(0, function3MaterializerOf110, androidx.appcompat.widget.g0.b(companion14, composerM2074constructorimpl110, viewConfiguration110, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 12) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                drawerState2 = drawerStateRememberDrawerState;
                modifier2 = modifier7;
                z13 = z18;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(drawerContent, modifier2, drawerState2, z13, content, i10, i11));
        }
        i12 |= 3072;
        z11 = z10;
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i12 |= i15;
        }
        if ((46811 & i12) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                }
                if (i13 != 0) {
                    z11 = true;
                }
            } else {
                if (i16 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                }
                if (i13 != 0) {
                    z11 = true;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(398812198, i12, -1, "androidx.compose.material3.DismissibleNavigationDrawer (NavigationDrawer.kt:344)");
            }
            float f14 = -((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(NavigationDrawerTokens.INSTANCE.m1791getContainerWidthD9Ej5fM());
            objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
            if (objB == Composer.INSTANCE.getEmpty()) {
                objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope6 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            String strM1320getStringNWtq213 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
            Map mapMapOf6 = bk.q.mapOf(TuplesKt.to(Float.valueOf(f14), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
            if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                z12 = true;
            } else {
                z12 = false;
            }
            Modifier modifierM1336swipeablepPrIpRY6 = SwipeableKt.m1336swipeablepPrIpRY(modifier2, drawerStateRememberDrawerState.getSwipeableState$material3_release(), mapMapOf6, Orientation.Horizontal, (32 & 8) != 0 ? true : z11, (32 & 16) != 0 ? false : z12, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? SwipeableKt.f.f11738p0 : b.f10771p0, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$material3_release$default(SwipeableDefaults.INSTANCE, mapMapOf6.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1335getVelocityThresholdD9Ej5fM$material3_release() : f10760a);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion16 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyC11 = androidx.databinding.f.c(companion16, false, composerStartRestartGroup, 0, -1323940314);
            Density density111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection111 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration111 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
            Modifier modifier8 = modifier2;
            constructor = companion17.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111 = LayoutKt.materializerOf(modifierM1336swipeablepPrIpRY6);
            boolean z19 = z11;
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
            Composer composerM2074constructorimpl111 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl111, layoutDirection111, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion17, composerM2074constructorimpl111, measurePolicyC11, composerM2074constructorimpl111, density111));
            ai.a.j(0, function3MaterializerOf111, androidx.appcompat.widget.g0.b(companion17, composerM2074constructorimpl111, viewConfiguration111, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
            d dVar6 = new d(drawerStateRememberDrawerState);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion18 = Modifier.INSTANCE;
            Density density112 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection112 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration112 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor2 = companion17.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf112 = LayoutKt.materializerOf(companion18);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2074constructorimpl112 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl112, dVar6, companion17.getSetMeasurePolicy());
            Updater.m2081setimpl(composerM2074constructorimpl112, density112, companion17.getSetDensity());
            Updater.m2081setimpl(composerM2074constructorimpl112, layoutDirection112, companion17.getSetLayoutDirection());
            Updater.m2081setimpl(composerM2074constructorimpl112, viewConfiguration112, companion17.getSetViewConfiguration());
            function3MaterializerOf112.invoke(SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            Modifier modifierSemantics$default6 = SemanticsModifierKt.semantics$default(companion18, false, new c(strM1320getStringNWtq213, drawerStateRememberDrawerState, coroutineScope6), 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyC12 = androidx.databinding.f.c(companion16, false, composerStartRestartGroup, 0, -1323940314);
            Density density113 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection113 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration113 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor3 = companion17.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf113 = LayoutKt.materializerOf(modifierSemantics$default6);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl113 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl113, layoutDirection113, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion17, composerM2074constructorimpl113, measurePolicyC12, composerM2074constructorimpl113, density113));
            ai.a.j(0, function3MaterializerOf113, androidx.appcompat.widget.g0.b(companion17, composerM2074constructorimpl113, viewConfiguration113, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            drawerContent.invoke(composerStartRestartGroup, Integer.valueOf(i12 & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(companion16.getTopStart(), false, composerStartRestartGroup, 0);
            Density density114 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection114 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration114 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor4 = companion17.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf114 = LayoutKt.materializerOf(companion18);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl114 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl114, layoutDirection114, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion17, composerM2074constructorimpl114, measurePolicyRememberBoxMeasurePolicy6, composerM2074constructorimpl114, density114));
            ai.a.j(0, function3MaterializerOf114, androidx.appcompat.widget.g0.b(companion17, composerM2074constructorimpl114, viewConfiguration114, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 12) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            drawerState2 = drawerStateRememberDrawerState;
            modifier2 = modifier8;
            z13 = z19;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                }
                if (i13 != 0) {
                    z11 = true;
                }
            } else {
                if (i16 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                }
                if (i13 != 0) {
                    z11 = true;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(398812198, i12, -1, "androidx.compose.material3.DismissibleNavigationDrawer (NavigationDrawer.kt:344)");
            }
            float f15 = -((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(NavigationDrawerTokens.INSTANCE.m1791getContainerWidthD9Ej5fM());
            objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
            if (objB == Composer.INSTANCE.getEmpty()) {
                objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope7 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            String strM1320getStringNWtq214 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
            Map mapMapOf7 = bk.q.mapOf(TuplesKt.to(Float.valueOf(f15), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
            if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                z12 = true;
            } else {
                z12 = false;
            }
            Modifier modifierM1336swipeablepPrIpRY7 = SwipeableKt.m1336swipeablepPrIpRY(modifier2, drawerStateRememberDrawerState.getSwipeableState$material3_release(), mapMapOf7, Orientation.Horizontal, (32 & 8) != 0 ? true : z11, (32 & 16) != 0 ? false : z12, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? SwipeableKt.f.f11738p0 : b.f10771p0, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$material3_release$default(SwipeableDefaults.INSTANCE, mapMapOf7.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1335getVelocityThresholdD9Ej5fM$material3_release() : f10760a);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion19 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyC13 = androidx.databinding.f.c(companion19, false, composerStartRestartGroup, 0, -1323940314);
            Density density115 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection115 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration115 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion110 = ComposeUiNode.INSTANCE;
            Modifier modifier9 = modifier2;
            constructor = companion110.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf115 = LayoutKt.materializerOf(modifierM1336swipeablepPrIpRY7);
            boolean z110 = z11;
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
            Composer composerM2074constructorimpl115 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl115, layoutDirection115, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion110, composerM2074constructorimpl115, measurePolicyC13, composerM2074constructorimpl115, density115));
            ai.a.j(0, function3MaterializerOf115, androidx.appcompat.widget.g0.b(companion110, composerM2074constructorimpl115, viewConfiguration115, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
            d dVar7 = new d(drawerStateRememberDrawerState);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion111 = Modifier.INSTANCE;
            Density density116 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection116 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration116 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor2 = companion110.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf116 = LayoutKt.materializerOf(companion111);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2074constructorimpl116 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl116, dVar7, companion110.getSetMeasurePolicy());
            Updater.m2081setimpl(composerM2074constructorimpl116, density116, companion110.getSetDensity());
            Updater.m2081setimpl(composerM2074constructorimpl116, layoutDirection116, companion110.getSetLayoutDirection());
            Updater.m2081setimpl(composerM2074constructorimpl116, viewConfiguration116, companion110.getSetViewConfiguration());
            function3MaterializerOf116.invoke(SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            Modifier modifierSemantics$default7 = SemanticsModifierKt.semantics$default(companion111, false, new c(strM1320getStringNWtq214, drawerStateRememberDrawerState, coroutineScope7), 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyC14 = androidx.databinding.f.c(companion19, false, composerStartRestartGroup, 0, -1323940314);
            Density density117 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection117 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration117 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor3 = companion110.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf117 = LayoutKt.materializerOf(modifierSemantics$default7);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl117 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl117, layoutDirection117, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion110, composerM2074constructorimpl117, measurePolicyC14, composerM2074constructorimpl117, density117));
            ai.a.j(0, function3MaterializerOf117, androidx.appcompat.widget.g0.b(companion110, composerM2074constructorimpl117, viewConfiguration117, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            drawerContent.invoke(composerStartRestartGroup, Integer.valueOf(i12 & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(companion19.getTopStart(), false, composerStartRestartGroup, 0);
            Density density118 = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection118 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration118 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor4 = companion110.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf118 = LayoutKt.materializerOf(companion111);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl118 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl118, layoutDirection118, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion110, composerM2074constructorimpl118, measurePolicyRememberBoxMeasurePolicy7, composerM2074constructorimpl118, density118));
            ai.a.j(0, function3MaterializerOf118, androidx.appcompat.widget.g0.b(companion110, composerM2074constructorimpl118, viewConfiguration118, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 12) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            drawerState2 = drawerStateRememberDrawerState;
            modifier2 = modifier9;
            z13 = z110;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new e(drawerContent, modifier2, drawerState2, z13, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x012c  */
    /* JADX WARN: Code duplicated, block: B:103:0x012f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0135  */
    /* JADX WARN: Code duplicated, block: B:109:0x0142  */
    /* JADX WARN: Code duplicated, block: B:112:0x0152  */
    /* JADX WARN: Code duplicated, block: B:114:0x015f  */
    /* JADX WARN: Code duplicated, block: B:117:0x016a  */
    /* JADX WARN: Code duplicated, block: B:118:0x017d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0191  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:129:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: ModalDrawerSheet-afqeVBk, reason: not valid java name */
    public static final void m1181ModalDrawerSheetafqeVBk(@Nullable Modifier modifier, @Nullable Shape shape, long j10, long j11, float f6, @Nullable WindowInsets windowInsets, @NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        Modifier modifier2;
        int i12;
        Shape shape2;
        long jM978getSurface0d7_KjU;
        long jM1014contentColorForek8zF_U;
        float fM1088getModalDrawerElevationD9Ej5fM;
        WindowInsets windowInsets2;
        int i13;
        Modifier modifier3;
        Shape shape3;
        long j12;
        long j13;
        float f10;
        WindowInsets windowInsets3;
        Modifier modifier4;
        Modifier modifier5;
        Shape shape4;
        long j14;
        long j15;
        float f11;
        WindowInsets windowInsets4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i14;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1001163336);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 14) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                shape2 = shape;
                int i16 = composerStartRestartGroup.changed(shape2) ? 32 : 16;
                i12 |= i16;
            } else {
                shape2 = shape;
            }
            i12 |= i16;
        } else {
            shape2 = shape;
        }
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                jM978getSurface0d7_KjU = j10;
                int i17 = composerStartRestartGroup.changed(jM978getSurface0d7_KjU) ? 256 : 128;
                i12 |= i17;
            } else {
                jM978getSurface0d7_KjU = j10;
            }
            i12 |= i17;
        } else {
            jM978getSurface0d7_KjU = j10;
        }
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                jM1014contentColorForek8zF_U = j11;
                int i18 = composerStartRestartGroup.changed(jM1014contentColorForek8zF_U) ? 2048 : 1024;
                i12 |= i18;
            } else {
                jM1014contentColorForek8zF_U = j11;
            }
            i12 |= i18;
        } else {
            jM1014contentColorForek8zF_U = j11;
        }
        int i19 = i11 & 16;
        if (i19 == 0) {
            if ((i10 & 57344) == 0) {
                fM1088getModalDrawerElevationD9Ej5fM = f6;
                i12 |= composerStartRestartGroup.changed(fM1088getModalDrawerElevationD9Ej5fM) ? 16384 : 8192;
            }
            if ((i10 & 458752) == 0) {
                windowInsets2 = windowInsets;
                if ((i11 & 32) == 0 || !composerStartRestartGroup.changed(windowInsets2)) {
                    i14 = 65536;
                } else {
                    i14 = 131072;
                }
                i12 |= i14;
            } else {
                windowInsets2 = windowInsets;
            }
            if ((i11 & 64) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                }
                if ((i12 & 2995931) == 599186 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            shape2 = DrawerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 4) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i19 != 0) {
                            fM1088getModalDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1088getModalDrawerElevationD9Ej5fM();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            modifier4 = modifier3;
                            windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                            shape3 = shape2;
                            j12 = jM978getSurface0d7_KjU;
                            j13 = jM1014contentColorForek8zF_U;
                            f10 = fM1088getModalDrawerElevationD9Ej5fM;
                        } else {
                            shape3 = shape2;
                            j12 = jM978getSurface0d7_KjU;
                            j13 = jM1014contentColorForek8zF_U;
                            f10 = fM1088getModalDrawerElevationD9Ej5fM;
                            windowInsets3 = windowInsets2;
                            modifier4 = modifier3;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                        }
                        shape3 = shape2;
                        j12 = jM978getSurface0d7_KjU;
                        j13 = jM1014contentColorForek8zF_U;
                        f10 = fM1088getModalDrawerElevationD9Ej5fM;
                        windowInsets3 = windowInsets2;
                        modifier4 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1001163336, i12, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:454)");
                    }
                    int i20 = i12 << 3;
                    a(windowInsets3, modifier4, shape3, j12, j13, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i20 & 112) | (i20 & 896) | (i20 & 7168) | (57344 & i20) | (i20 & 458752) | (i12 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    shape4 = shape3;
                    j14 = j12;
                    j15 = j13;
                    f11 = f10;
                    windowInsets4 = windowInsets3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier5 = modifier2;
                    shape4 = shape2;
                    j14 = jM978getSurface0d7_KjU;
                    j15 = jM1014contentColorForek8zF_U;
                    f11 = fM1088getModalDrawerElevationD9Ej5fM;
                    windowInsets4 = windowInsets2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new h(f11, i10, i11, j14, j15, windowInsets4, modifier5, shape4, content));
            }
            i13 = 1572864;
            i12 |= i13;
            if ((i12 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        shape2 = DrawerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i19 != 0) {
                        fM1088getModalDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1088getModalDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        modifier4 = modifier3;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        shape3 = shape2;
                        j12 = jM978getSurface0d7_KjU;
                        j13 = jM1014contentColorForek8zF_U;
                        f10 = fM1088getModalDrawerElevationD9Ej5fM;
                    } else {
                        shape3 = shape2;
                        j12 = jM978getSurface0d7_KjU;
                        j13 = jM1014contentColorForek8zF_U;
                        f10 = fM1088getModalDrawerElevationD9Ej5fM;
                        windowInsets3 = windowInsets2;
                        modifier4 = modifier3;
                    }
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        shape2 = DrawerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i19 != 0) {
                        fM1088getModalDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1088getModalDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        modifier4 = modifier3;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        shape3 = shape2;
                        j12 = jM978getSurface0d7_KjU;
                        j13 = jM1014contentColorForek8zF_U;
                        f10 = fM1088getModalDrawerElevationD9Ej5fM;
                    } else {
                        shape3 = shape2;
                        j12 = jM978getSurface0d7_KjU;
                        j13 = jM1014contentColorForek8zF_U;
                        f10 = fM1088getModalDrawerElevationD9Ej5fM;
                        windowInsets3 = windowInsets2;
                        modifier4 = modifier3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1001163336, i12, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:454)");
                }
                int i21 = i12 << 3;
                a(windowInsets3, modifier4, shape3, j12, j13, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i21 & 112) | (i21 & 896) | (i21 & 7168) | (57344 & i21) | (i21 & 458752) | (i12 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                shape4 = shape3;
                j14 = j12;
                j15 = j13;
                f11 = f10;
                windowInsets4 = windowInsets3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        shape2 = DrawerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i19 != 0) {
                        fM1088getModalDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1088getModalDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        modifier4 = modifier3;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        shape3 = shape2;
                        j12 = jM978getSurface0d7_KjU;
                        j13 = jM1014contentColorForek8zF_U;
                        f10 = fM1088getModalDrawerElevationD9Ej5fM;
                    } else {
                        shape3 = shape2;
                        j12 = jM978getSurface0d7_KjU;
                        j13 = jM1014contentColorForek8zF_U;
                        f10 = fM1088getModalDrawerElevationD9Ej5fM;
                        windowInsets3 = windowInsets2;
                        modifier4 = modifier3;
                    }
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        shape2 = DrawerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i19 != 0) {
                        fM1088getModalDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1088getModalDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        modifier4 = modifier3;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        shape3 = shape2;
                        j12 = jM978getSurface0d7_KjU;
                        j13 = jM1014contentColorForek8zF_U;
                        f10 = fM1088getModalDrawerElevationD9Ej5fM;
                    } else {
                        shape3 = shape2;
                        j12 = jM978getSurface0d7_KjU;
                        j13 = jM1014contentColorForek8zF_U;
                        f10 = fM1088getModalDrawerElevationD9Ej5fM;
                        windowInsets3 = windowInsets2;
                        modifier4 = modifier3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1001163336, i12, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:454)");
                }
                int i22 = i12 << 3;
                a(windowInsets3, modifier4, shape3, j12, j13, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i22 & 112) | (i22 & 896) | (i22 & 7168) | (57344 & i22) | (i22 & 458752) | (i12 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                shape4 = shape3;
                j14 = j12;
                j15 = j13;
                f11 = f10;
                windowInsets4 = windowInsets3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new h(f11, i10, i11, j14, j15, windowInsets4, modifier5, shape4, content));
        }
        i12 |= 24576;
        fM1088getModalDrawerElevationD9Ej5fM = f6;
        if ((i10 & 458752) == 0) {
            windowInsets2 = windowInsets;
            if ((i11 & 32) == 0) {
                i14 = 65536;
            } else {
                i14 = 65536;
            }
            i12 |= i14;
        } else {
            windowInsets2 = windowInsets;
        }
        if ((i11 & 64) != 0) {
            if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
            }
            if ((i12 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        shape2 = DrawerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i19 != 0) {
                        fM1088getModalDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1088getModalDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        modifier4 = modifier3;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        shape3 = shape2;
                        j12 = jM978getSurface0d7_KjU;
                        j13 = jM1014contentColorForek8zF_U;
                        f10 = fM1088getModalDrawerElevationD9Ej5fM;
                    } else {
                        shape3 = shape2;
                        j12 = jM978getSurface0d7_KjU;
                        j13 = jM1014contentColorForek8zF_U;
                        f10 = fM1088getModalDrawerElevationD9Ej5fM;
                        windowInsets3 = windowInsets2;
                        modifier4 = modifier3;
                    }
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        shape2 = DrawerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i19 != 0) {
                        fM1088getModalDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1088getModalDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        modifier4 = modifier3;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        shape3 = shape2;
                        j12 = jM978getSurface0d7_KjU;
                        j13 = jM1014contentColorForek8zF_U;
                        f10 = fM1088getModalDrawerElevationD9Ej5fM;
                    } else {
                        shape3 = shape2;
                        j12 = jM978getSurface0d7_KjU;
                        j13 = jM1014contentColorForek8zF_U;
                        f10 = fM1088getModalDrawerElevationD9Ej5fM;
                        windowInsets3 = windowInsets2;
                        modifier4 = modifier3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1001163336, i12, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:454)");
                }
                int i23 = i12 << 3;
                a(windowInsets3, modifier4, shape3, j12, j13, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i23 & 112) | (i23 & 896) | (i23 & 7168) | (57344 & i23) | (i23 & 458752) | (i12 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                shape4 = shape3;
                j14 = j12;
                j15 = j13;
                f11 = f10;
                windowInsets4 = windowInsets3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        shape2 = DrawerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i19 != 0) {
                        fM1088getModalDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1088getModalDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        modifier4 = modifier3;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        shape3 = shape2;
                        j12 = jM978getSurface0d7_KjU;
                        j13 = jM1014contentColorForek8zF_U;
                        f10 = fM1088getModalDrawerElevationD9Ej5fM;
                    } else {
                        shape3 = shape2;
                        j12 = jM978getSurface0d7_KjU;
                        j13 = jM1014contentColorForek8zF_U;
                        f10 = fM1088getModalDrawerElevationD9Ej5fM;
                        windowInsets3 = windowInsets2;
                        modifier4 = modifier3;
                    }
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        shape2 = DrawerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i19 != 0) {
                        fM1088getModalDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1088getModalDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        modifier4 = modifier3;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        shape3 = shape2;
                        j12 = jM978getSurface0d7_KjU;
                        j13 = jM1014contentColorForek8zF_U;
                        f10 = fM1088getModalDrawerElevationD9Ej5fM;
                    } else {
                        shape3 = shape2;
                        j12 = jM978getSurface0d7_KjU;
                        j13 = jM1014contentColorForek8zF_U;
                        f10 = fM1088getModalDrawerElevationD9Ej5fM;
                        windowInsets3 = windowInsets2;
                        modifier4 = modifier3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1001163336, i12, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:454)");
                }
                int i24 = i12 << 3;
                a(windowInsets3, modifier4, shape3, j12, j13, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i24 & 112) | (i24 & 896) | (i24 & 7168) | (57344 & i24) | (i24 & 458752) | (i12 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                shape4 = shape3;
                j14 = j12;
                j15 = j13;
                f11 = f10;
                windowInsets4 = windowInsets3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new h(f11, i10, i11, j14, j15, windowInsets4, modifier5, shape4, content));
        }
        i13 = 1572864;
        i12 |= i13;
        if ((i12 & 2995931) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                    shape2 = DrawerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                }
                if ((i11 & 4) != 0) {
                    jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                    i12 &= -7169;
                }
                if (i19 != 0) {
                    fM1088getModalDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1088getModalDrawerElevationD9Ej5fM();
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    modifier4 = modifier3;
                    windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    shape3 = shape2;
                    j12 = jM978getSurface0d7_KjU;
                    j13 = jM1014contentColorForek8zF_U;
                    f10 = fM1088getModalDrawerElevationD9Ej5fM;
                } else {
                    shape3 = shape2;
                    j12 = jM978getSurface0d7_KjU;
                    j13 = jM1014contentColorForek8zF_U;
                    f10 = fM1088getModalDrawerElevationD9Ej5fM;
                    windowInsets3 = windowInsets2;
                    modifier4 = modifier3;
                }
            } else {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                    shape2 = DrawerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                }
                if ((i11 & 4) != 0) {
                    jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                    i12 &= -7169;
                }
                if (i19 != 0) {
                    fM1088getModalDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1088getModalDrawerElevationD9Ej5fM();
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    modifier4 = modifier3;
                    windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    shape3 = shape2;
                    j12 = jM978getSurface0d7_KjU;
                    j13 = jM1014contentColorForek8zF_U;
                    f10 = fM1088getModalDrawerElevationD9Ej5fM;
                } else {
                    shape3 = shape2;
                    j12 = jM978getSurface0d7_KjU;
                    j13 = jM1014contentColorForek8zF_U;
                    f10 = fM1088getModalDrawerElevationD9Ej5fM;
                    windowInsets3 = windowInsets2;
                    modifier4 = modifier3;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1001163336, i12, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:454)");
            }
            int i25 = i12 << 3;
            a(windowInsets3, modifier4, shape3, j12, j13, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i25 & 112) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (i25 & 458752) | (i12 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            shape4 = shape3;
            j14 = j12;
            j15 = j13;
            f11 = f10;
            windowInsets4 = windowInsets3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                    shape2 = DrawerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                }
                if ((i11 & 4) != 0) {
                    jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                    i12 &= -7169;
                }
                if (i19 != 0) {
                    fM1088getModalDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1088getModalDrawerElevationD9Ej5fM();
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    modifier4 = modifier3;
                    windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    shape3 = shape2;
                    j12 = jM978getSurface0d7_KjU;
                    j13 = jM1014contentColorForek8zF_U;
                    f10 = fM1088getModalDrawerElevationD9Ej5fM;
                } else {
                    shape3 = shape2;
                    j12 = jM978getSurface0d7_KjU;
                    j13 = jM1014contentColorForek8zF_U;
                    f10 = fM1088getModalDrawerElevationD9Ej5fM;
                    windowInsets3 = windowInsets2;
                    modifier4 = modifier3;
                }
            } else {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                    shape2 = DrawerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                }
                if ((i11 & 4) != 0) {
                    jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                    i12 &= -7169;
                }
                if (i19 != 0) {
                    fM1088getModalDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1088getModalDrawerElevationD9Ej5fM();
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    modifier4 = modifier3;
                    windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    shape3 = shape2;
                    j12 = jM978getSurface0d7_KjU;
                    j13 = jM1014contentColorForek8zF_U;
                    f10 = fM1088getModalDrawerElevationD9Ej5fM;
                } else {
                    shape3 = shape2;
                    j12 = jM978getSurface0d7_KjU;
                    j13 = jM1014contentColorForek8zF_U;
                    f10 = fM1088getModalDrawerElevationD9Ej5fM;
                    windowInsets3 = windowInsets2;
                    modifier4 = modifier3;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1001163336, i12, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:454)");
            }
            int i26 = i12 << 3;
            a(windowInsets3, modifier4, shape3, j12, j13, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i26 & 112) | (i26 & 896) | (i26 & 7168) | (57344 & i26) | (i26 & 458752) | (i12 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            shape4 = shape3;
            j14 = j12;
            j15 = j13;
            f11 = f10;
            windowInsets4 = windowInsets3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new h(f11, i10, i11, j14, j15, windowInsets4, modifier5, shape4, content));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013b  */
    /* JADX WARN: Code duplicated, block: B:103:0x019d  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:107:0x0202  */
    /* JADX WARN: Code duplicated, block: B:110:0x020e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0212  */
    /* JADX WARN: Code duplicated, block: B:114:0x026f  */
    /* JADX WARN: Code duplicated, block: B:117:0x027b  */
    /* JADX WARN: Code duplicated, block: B:118:0x027f  */
    /* JADX WARN: Code duplicated, block: B:121:0x02de  */
    /* JADX WARN: Code duplicated, block: B:123:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:126:0x0313  */
    /* JADX WARN: Code duplicated, block: B:128:0x0319  */
    /* JADX WARN: Code duplicated, block: B:131:0x0371  */
    /* JADX WARN: Code duplicated, block: B:134:0x037d  */
    /* JADX WARN: Code duplicated, block: B:135:0x0381  */
    /* JADX WARN: Code duplicated, block: B:138:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:143:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:89:0x0100  */
    /* JADX WARN: Code duplicated, block: B:91:0x010b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0110  */
    /* JADX WARN: Code duplicated, block: B:97:0x0120  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: ModalNavigationDrawer-FHprtrg, reason: not valid java name */
    public static final void m1182ModalNavigationDrawerFHprtrg(@NotNull Function2<? super Composer, ? super Integer, Unit> drawerContent, @Nullable Modifier modifier, @Nullable DrawerState drawerState, boolean z10, long j10, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        DrawerState drawerStateRememberDrawerState;
        int i13;
        boolean z11;
        int i14;
        long scrimColor;
        int i15;
        int i16;
        DrawerState drawerState2;
        Object objB;
        Composer.Companion companion;
        float f6;
        boolean z12;
        Function0<ComposeUiNode> constructor;
        Function0<ComposeUiNode> constructor2;
        boolean zChanged;
        Object objRememberedValue;
        boolean zChanged2;
        Object objRememberedValue2;
        Function0<ComposeUiNode> constructor3;
        boolean z13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(drawerContent, "drawerContent");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1169303680);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(drawerContent) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i10 & 896) == 0) {
                if ((i11 & 4) == 0) {
                    drawerStateRememberDrawerState = drawerState;
                    int i18 = composerStartRestartGroup.changed(drawerStateRememberDrawerState) ? 256 : 128;
                    i12 |= i18;
                } else {
                    drawerStateRememberDrawerState = drawerState;
                }
                i12 |= i18;
            } else {
                drawerStateRememberDrawerState = drawerState;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        scrimColor = j10;
                        int i19 = composerStartRestartGroup.changed(scrimColor) ? 16384 : 8192;
                        i12 |= i19;
                    } else {
                        scrimColor = j10;
                    }
                    i12 |= i19;
                } else {
                    scrimColor = j10;
                }
                if ((i11 & 32) != 0) {
                    if ((458752 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i17 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i11 & 4) != 0) {
                                i12 &= -897;
                                drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                                i12 &= -57345;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 4) != 0) {
                                i12 &= -897;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                        }
                        i16 = i12;
                        drawerState2 = drawerStateRememberDrawerState;
                        boolean z14 = z11;
                        long j11 = scrimColor;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1169303680, i16, -1, "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:253)");
                        }
                        objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                        companion = Composer.INSTANCE;
                        if (objB == companion.getEmpty()) {
                            objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        String strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                        f6 = -((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(NavigationDrawerTokens.INSTANCE.m1791getContainerWidthD9Ej5fM());
                        Map mapMapOf = bk.q.mapOf(TuplesKt.to(Float.valueOf(f6), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                        if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        Modifier modifierM1336swipeablepPrIpRY = SwipeableKt.m1336swipeablepPrIpRY(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), drawerState2.getSwipeableState$material3_release(), mapMapOf, Orientation.Horizontal, (32 & 8) != 0 ? true : z14, (32 & 16) != 0 ? false : z12, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? SwipeableKt.f.f11738p0 : i.f10804p0, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$material3_release$default(SwipeableDefaults.INSTANCE, mapMapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1335getVelocityThresholdD9Ej5fM$material3_release() : f10760a);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion2, false, composerStartRestartGroup, 0, -1323940314);
                        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        Modifier modifier3 = modifier2;
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM1336swipeablepPrIpRY);
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
                        Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, density));
                        ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyC2 = androidx.databinding.f.c(companion2, false, composerStartRestartGroup, 0, -1323940314);
                        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        constructor2 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion4);
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
                        Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl2, measurePolicyC2, composerM2074constructorimpl2, density2));
                        ai.a.j(0, function3MaterializerOf2, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                        content.invoke(composerStartRestartGroup, Integer.valueOf((i16 >> 15) & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        boolean zIsOpen = drawerState2.isOpen();
                        j jVar = new j(z14, drawerState2, coroutineScope);
                        Float fValueOf = Float.valueOf(f6);
                        Float fValueOf2 = Float.valueOf(0.0f);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged = composerStartRestartGroup.changed(fValueOf) | composerStartRestartGroup.changed(fValueOf2) | composerStartRestartGroup.changed(drawerState2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new k(f6, drawerState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        b(zIsOpen, jVar, (Function0) objRememberedValue, j11, composerStartRestartGroup, (i16 >> 3) & 7168);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(drawerState2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new l(drawerState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(OffsetKt.offset(companion4, (Function1) objRememberedValue2), false, new m(strM1320getStringNWtq28, drawerState2, coroutineScope), 1, null);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyC3 = androidx.databinding.f.c(companion2, false, composerStartRestartGroup, 0, -1323940314);
                        Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        constructor3 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierSemantics$default);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor3);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerStartRestartGroup.disableReusing();
                        Composer composerM2074constructorimpl3 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        Updater.m2081setimpl(composerM2074constructorimpl3, layoutDirection3, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl3, measurePolicyC3, composerM2074constructorimpl3, density3));
                        ai.a.j(0, function3MaterializerOf3, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                        drawerContent.invoke(composerStartRestartGroup, Integer.valueOf(i16 & 14));
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z13 = z14;
                        modifier2 = modifier3;
                        scrimColor = j11;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        drawerState2 = drawerStateRememberDrawerState;
                        z13 = z11;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new n(drawerContent, modifier2, drawerState2, z13, scrimColor, content, i10, i11));
                }
                i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i15;
                if ((374491 & i12) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                    }
                    i16 = i12;
                    drawerState2 = drawerStateRememberDrawerState;
                    boolean z15 = z11;
                    long j12 = scrimColor;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1169303680, i16, -1, "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:253)");
                    }
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    companion = Composer.INSTANCE;
                    if (objB == companion.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    String strM1320getStringNWtq29 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                    f6 = -((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(NavigationDrawerTokens.INSTANCE.m1791getContainerWidthD9Ej5fM());
                    Map mapMapOf2 = bk.q.mapOf(TuplesKt.to(Float.valueOf(f6), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    Modifier modifierM1336swipeablepPrIpRY2 = SwipeableKt.m1336swipeablepPrIpRY(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), drawerState2.getSwipeableState$material3_release(), mapMapOf2, Orientation.Horizontal, (32 & 8) != 0 ? true : z15, (32 & 16) != 0 ? false : z12, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? SwipeableKt.f.f11738p0 : i.f10804p0, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$material3_release$default(SwipeableDefaults.INSTANCE, mapMapOf2.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1335getVelocityThresholdD9Ej5fM$material3_release() : f10760a);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion5 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyC4 = androidx.databinding.f.c(companion5, false, composerStartRestartGroup, 0, -1323940314);
                    Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    Modifier modifier4 = modifier2;
                    ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    constructor = companion6.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierM1336swipeablepPrIpRY2);
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
                    Updater.m2081setimpl(composerM2074constructorimpl4, layoutDirection4, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion6, composerM2074constructorimpl4, measurePolicyC4, composerM2074constructorimpl4, density4));
                    ai.a.j(0, function3MaterializerOf4, androidx.appcompat.widget.g0.b(companion6, composerM2074constructorimpl4, viewConfiguration4, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Modifier.Companion companion7 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyC5 = androidx.databinding.f.c(companion5, false, composerStartRestartGroup, 0, -1323940314);
                    Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion6.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(companion7);
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
                    Composer composerM2074constructorimpl5 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl5, layoutDirection5, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion6, composerM2074constructorimpl5, measurePolicyC5, composerM2074constructorimpl5, density5));
                    ai.a.j(0, function3MaterializerOf5, androidx.appcompat.widget.g0.b(companion6, composerM2074constructorimpl5, viewConfiguration5, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i16 >> 15) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    boolean zIsOpen2 = drawerState2.isOpen();
                    j jVar2 = new j(z15, drawerState2, coroutineScope2);
                    Float fValueOf3 = Float.valueOf(f6);
                    Float fValueOf4 = Float.valueOf(0.0f);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(fValueOf3) | composerStartRestartGroup.changed(fValueOf4) | composerStartRestartGroup.changed(drawerState2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new k(f6, drawerState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new k(f6, drawerState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    b(zIsOpen2, jVar2, (Function0) objRememberedValue, j12, composerStartRestartGroup, (i16 >> 3) & 7168);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(drawerState2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new l(drawerState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new l(drawerState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics$default2 = SemanticsModifierKt.semantics$default(OffsetKt.offset(companion7, (Function1) objRememberedValue2), false, new m(strM1320getStringNWtq29, drawerState2, coroutineScope2), 1, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyC6 = androidx.databinding.f.c(companion5, false, composerStartRestartGroup, 0, -1323940314);
                    Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration6 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor3 = companion6.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(modifierSemantics$default2);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2074constructorimpl6 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl6, layoutDirection6, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion6, composerM2074constructorimpl6, measurePolicyC6, composerM2074constructorimpl6, density6));
                    ai.a.j(0, function3MaterializerOf6, androidx.appcompat.widget.g0.b(companion6, composerM2074constructorimpl6, viewConfiguration6, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    drawerContent.invoke(composerStartRestartGroup, Integer.valueOf(i16 & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z13 = z15;
                    modifier2 = modifier4;
                    scrimColor = j12;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                    }
                    i16 = i12;
                    drawerState2 = drawerStateRememberDrawerState;
                    boolean z16 = z11;
                    long j13 = scrimColor;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1169303680, i16, -1, "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:253)");
                    }
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    companion = Composer.INSTANCE;
                    if (objB == companion.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope3 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    String strM1320getStringNWtq210 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                    f6 = -((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(NavigationDrawerTokens.INSTANCE.m1791getContainerWidthD9Ej5fM());
                    Map mapMapOf3 = bk.q.mapOf(TuplesKt.to(Float.valueOf(f6), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    Modifier modifierM1336swipeablepPrIpRY3 = SwipeableKt.m1336swipeablepPrIpRY(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), drawerState2.getSwipeableState$material3_release(), mapMapOf3, Orientation.Horizontal, (32 & 8) != 0 ? true : z16, (32 & 16) != 0 ? false : z12, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? SwipeableKt.f.f11738p0 : i.f10804p0, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$material3_release$default(SwipeableDefaults.INSTANCE, mapMapOf3.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1335getVelocityThresholdD9Ej5fM$material3_release() : f10760a);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion8 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyC7 = androidx.databinding.f.c(companion8, false, composerStartRestartGroup, 0, -1323940314);
                    Density density7 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection7 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    Modifier modifier5 = modifier2;
                    ViewConfiguration viewConfiguration7 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                    constructor = companion9.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf7 = LayoutKt.materializerOf(modifierM1336swipeablepPrIpRY3);
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
                    Updater.m2081setimpl(composerM2074constructorimpl7, layoutDirection7, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion9, composerM2074constructorimpl7, measurePolicyC7, composerM2074constructorimpl7, density7));
                    ai.a.j(0, function3MaterializerOf7, androidx.appcompat.widget.g0.b(companion9, composerM2074constructorimpl7, viewConfiguration7, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Modifier.Companion companion10 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyC8 = androidx.databinding.f.c(companion8, false, composerStartRestartGroup, 0, -1323940314);
                    Density density8 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection8 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration8 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion9.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf8 = LayoutKt.materializerOf(companion10);
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
                    Updater.m2081setimpl(composerM2074constructorimpl8, layoutDirection8, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion9, composerM2074constructorimpl8, measurePolicyC8, composerM2074constructorimpl8, density8));
                    ai.a.j(0, function3MaterializerOf8, androidx.appcompat.widget.g0.b(companion9, composerM2074constructorimpl8, viewConfiguration8, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i16 >> 15) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    boolean zIsOpen3 = drawerState2.isOpen();
                    j jVar3 = new j(z16, drawerState2, coroutineScope3);
                    Float fValueOf5 = Float.valueOf(f6);
                    Float fValueOf6 = Float.valueOf(0.0f);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(fValueOf5) | composerStartRestartGroup.changed(fValueOf6) | composerStartRestartGroup.changed(drawerState2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new k(f6, drawerState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new k(f6, drawerState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    b(zIsOpen3, jVar3, (Function0) objRememberedValue, j13, composerStartRestartGroup, (i16 >> 3) & 7168);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(drawerState2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new l(drawerState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new l(drawerState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics$default3 = SemanticsModifierKt.semantics$default(OffsetKt.offset(companion10, (Function1) objRememberedValue2), false, new m(strM1320getStringNWtq210, drawerState2, coroutineScope3), 1, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyC9 = androidx.databinding.f.c(companion8, false, composerStartRestartGroup, 0, -1323940314);
                    Density density9 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection9 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration9 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor3 = companion9.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf9 = LayoutKt.materializerOf(modifierSemantics$default3);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2074constructorimpl9 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl9, layoutDirection9, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion9, composerM2074constructorimpl9, measurePolicyC9, composerM2074constructorimpl9, density9));
                    ai.a.j(0, function3MaterializerOf9, androidx.appcompat.widget.g0.b(companion9, composerM2074constructorimpl9, viewConfiguration9, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    drawerContent.invoke(composerStartRestartGroup, Integer.valueOf(i16 & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z13 = z16;
                    modifier2 = modifier5;
                    scrimColor = j13;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new n(drawerContent, modifier2, drawerState2, z13, scrimColor, content, i10, i11));
            }
            i12 |= 3072;
            z11 = z10;
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    scrimColor = j10;
                    if (composerStartRestartGroup.changed(scrimColor)) {
                    }
                    i12 |= i19;
                } else {
                    scrimColor = j10;
                }
                i12 |= i19;
            } else {
                scrimColor = j10;
            }
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                    }
                    i16 = i12;
                    drawerState2 = drawerStateRememberDrawerState;
                    boolean z17 = z11;
                    long j14 = scrimColor;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1169303680, i16, -1, "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:253)");
                    }
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    companion = Composer.INSTANCE;
                    if (objB == companion.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope4 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    String strM1320getStringNWtq211 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                    f6 = -((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(NavigationDrawerTokens.INSTANCE.m1791getContainerWidthD9Ej5fM());
                    Map mapMapOf4 = bk.q.mapOf(TuplesKt.to(Float.valueOf(f6), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    Modifier modifierM1336swipeablepPrIpRY4 = SwipeableKt.m1336swipeablepPrIpRY(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), drawerState2.getSwipeableState$material3_release(), mapMapOf4, Orientation.Horizontal, (32 & 8) != 0 ? true : z17, (32 & 16) != 0 ? false : z12, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? SwipeableKt.f.f11738p0 : i.f10804p0, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$material3_release$default(SwipeableDefaults.INSTANCE, mapMapOf4.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1335getVelocityThresholdD9Ej5fM$material3_release() : f10760a);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion11 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyC10 = androidx.databinding.f.c(companion11, false, composerStartRestartGroup, 0, -1323940314);
                    Density density10 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection10 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    Modifier modifier6 = modifier2;
                    ViewConfiguration viewConfiguration10 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                    constructor = companion12.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf10 = LayoutKt.materializerOf(modifierM1336swipeablepPrIpRY4);
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
                    Composer composerM2074constructorimpl10 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl10, layoutDirection10, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion12, composerM2074constructorimpl10, measurePolicyC10, composerM2074constructorimpl10, density10));
                    ai.a.j(0, function3MaterializerOf10, androidx.appcompat.widget.g0.b(companion12, composerM2074constructorimpl10, viewConfiguration10, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Modifier.Companion companion13 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyC11 = androidx.databinding.f.c(companion11, false, composerStartRestartGroup, 0, -1323940314);
                    Density density11 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection11 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration11 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion12.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11 = LayoutKt.materializerOf(companion13);
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
                    Composer composerM2074constructorimpl11 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl11, layoutDirection11, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion12, composerM2074constructorimpl11, measurePolicyC11, composerM2074constructorimpl11, density11));
                    ai.a.j(0, function3MaterializerOf11, androidx.appcompat.widget.g0.b(companion12, composerM2074constructorimpl11, viewConfiguration11, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i16 >> 15) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    boolean zIsOpen4 = drawerState2.isOpen();
                    j jVar4 = new j(z17, drawerState2, coroutineScope4);
                    Float fValueOf7 = Float.valueOf(f6);
                    Float fValueOf8 = Float.valueOf(0.0f);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(fValueOf7) | composerStartRestartGroup.changed(fValueOf8) | composerStartRestartGroup.changed(drawerState2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new k(f6, drawerState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new k(f6, drawerState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    b(zIsOpen4, jVar4, (Function0) objRememberedValue, j14, composerStartRestartGroup, (i16 >> 3) & 7168);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(drawerState2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new l(drawerState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new l(drawerState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics$default4 = SemanticsModifierKt.semantics$default(OffsetKt.offset(companion13, (Function1) objRememberedValue2), false, new m(strM1320getStringNWtq211, drawerState2, coroutineScope4), 1, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyC12 = androidx.databinding.f.c(companion11, false, composerStartRestartGroup, 0, -1323940314);
                    Density density12 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection12 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration12 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor3 = companion12.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf12 = LayoutKt.materializerOf(modifierSemantics$default4);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2074constructorimpl12 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl12, layoutDirection12, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion12, composerM2074constructorimpl12, measurePolicyC12, composerM2074constructorimpl12, density12));
                    ai.a.j(0, function3MaterializerOf12, androidx.appcompat.widget.g0.b(companion12, composerM2074constructorimpl12, viewConfiguration12, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    drawerContent.invoke(composerStartRestartGroup, Integer.valueOf(i16 & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z13 = z17;
                    modifier2 = modifier6;
                    scrimColor = j14;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                    }
                    i16 = i12;
                    drawerState2 = drawerStateRememberDrawerState;
                    boolean z18 = z11;
                    long j15 = scrimColor;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1169303680, i16, -1, "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:253)");
                    }
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    companion = Composer.INSTANCE;
                    if (objB == companion.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope5 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    String strM1320getStringNWtq212 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                    f6 = -((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(NavigationDrawerTokens.INSTANCE.m1791getContainerWidthD9Ej5fM());
                    Map mapMapOf5 = bk.q.mapOf(TuplesKt.to(Float.valueOf(f6), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    Modifier modifierM1336swipeablepPrIpRY5 = SwipeableKt.m1336swipeablepPrIpRY(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), drawerState2.getSwipeableState$material3_release(), mapMapOf5, Orientation.Horizontal, (32 & 8) != 0 ? true : z18, (32 & 16) != 0 ? false : z12, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? SwipeableKt.f.f11738p0 : i.f10804p0, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$material3_release$default(SwipeableDefaults.INSTANCE, mapMapOf5.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1335getVelocityThresholdD9Ej5fM$material3_release() : f10760a);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion14 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyC13 = androidx.databinding.f.c(companion14, false, composerStartRestartGroup, 0, -1323940314);
                    Density density13 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection13 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    Modifier modifier7 = modifier2;
                    ViewConfiguration viewConfiguration13 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                    constructor = companion15.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf13 = LayoutKt.materializerOf(modifierM1336swipeablepPrIpRY5);
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
                    Updater.m2081setimpl(composerM2074constructorimpl13, layoutDirection13, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion15, composerM2074constructorimpl13, measurePolicyC13, composerM2074constructorimpl13, density13));
                    ai.a.j(0, function3MaterializerOf13, androidx.appcompat.widget.g0.b(companion15, composerM2074constructorimpl13, viewConfiguration13, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Modifier.Companion companion16 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyC14 = androidx.databinding.f.c(companion14, false, composerStartRestartGroup, 0, -1323940314);
                    Density density14 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection14 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration14 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion15.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf14 = LayoutKt.materializerOf(companion16);
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
                    Updater.m2081setimpl(composerM2074constructorimpl14, layoutDirection14, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion15, composerM2074constructorimpl14, measurePolicyC14, composerM2074constructorimpl14, density14));
                    ai.a.j(0, function3MaterializerOf14, androidx.appcompat.widget.g0.b(companion15, composerM2074constructorimpl14, viewConfiguration14, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i16 >> 15) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    boolean zIsOpen5 = drawerState2.isOpen();
                    j jVar5 = new j(z18, drawerState2, coroutineScope5);
                    Float fValueOf9 = Float.valueOf(f6);
                    Float fValueOf10 = Float.valueOf(0.0f);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(fValueOf9) | composerStartRestartGroup.changed(fValueOf10) | composerStartRestartGroup.changed(drawerState2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new k(f6, drawerState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new k(f6, drawerState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    b(zIsOpen5, jVar5, (Function0) objRememberedValue, j15, composerStartRestartGroup, (i16 >> 3) & 7168);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(drawerState2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new l(drawerState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new l(drawerState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics$default5 = SemanticsModifierKt.semantics$default(OffsetKt.offset(companion16, (Function1) objRememberedValue2), false, new m(strM1320getStringNWtq212, drawerState2, coroutineScope5), 1, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyC15 = androidx.databinding.f.c(companion14, false, composerStartRestartGroup, 0, -1323940314);
                    Density density15 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection15 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration15 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor3 = companion15.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf15 = LayoutKt.materializerOf(modifierSemantics$default5);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2074constructorimpl15 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl15, layoutDirection15, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion15, composerM2074constructorimpl15, measurePolicyC15, composerM2074constructorimpl15, density15));
                    ai.a.j(0, function3MaterializerOf15, androidx.appcompat.widget.g0.b(companion15, composerM2074constructorimpl15, viewConfiguration15, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    drawerContent.invoke(composerStartRestartGroup, Integer.valueOf(i16 & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z13 = z18;
                    modifier2 = modifier7;
                    scrimColor = j15;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new n(drawerContent, modifier2, drawerState2, z13, scrimColor, content, i10, i11));
            }
            i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i15;
            if ((374491 & i12) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                }
                i16 = i12;
                drawerState2 = drawerStateRememberDrawerState;
                boolean z19 = z11;
                long j16 = scrimColor;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1169303680, i16, -1, "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:253)");
                }
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                companion = Composer.INSTANCE;
                if (objB == companion.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope6 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                String strM1320getStringNWtq213 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                f6 = -((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(NavigationDrawerTokens.INSTANCE.m1791getContainerWidthD9Ej5fM());
                Map mapMapOf6 = bk.q.mapOf(TuplesKt.to(Float.valueOf(f6), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Modifier modifierM1336swipeablepPrIpRY6 = SwipeableKt.m1336swipeablepPrIpRY(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), drawerState2.getSwipeableState$material3_release(), mapMapOf6, Orientation.Horizontal, (32 & 8) != 0 ? true : z19, (32 & 16) != 0 ? false : z12, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? SwipeableKt.f.f11738p0 : i.f10804p0, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$material3_release$default(SwipeableDefaults.INSTANCE, mapMapOf6.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1335getVelocityThresholdD9Ej5fM$material3_release() : f10760a);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion17 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyC16 = androidx.databinding.f.c(companion17, false, composerStartRestartGroup, 0, -1323940314);
                Density density16 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection16 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                Modifier modifier8 = modifier2;
                ViewConfiguration viewConfiguration16 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
                constructor = companion18.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf16 = LayoutKt.materializerOf(modifierM1336swipeablepPrIpRY6);
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
                Composer composerM2074constructorimpl16 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl16, layoutDirection16, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion18, composerM2074constructorimpl16, measurePolicyC16, composerM2074constructorimpl16, density16));
                ai.a.j(0, function3MaterializerOf16, androidx.appcompat.widget.g0.b(companion18, composerM2074constructorimpl16, viewConfiguration16, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Modifier.Companion companion19 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyC17 = androidx.databinding.f.c(companion17, false, composerStartRestartGroup, 0, -1323940314);
                Density density17 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection17 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration17 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion18.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf17 = LayoutKt.materializerOf(companion19);
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
                Composer composerM2074constructorimpl17 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl17, layoutDirection17, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion18, composerM2074constructorimpl17, measurePolicyC17, composerM2074constructorimpl17, density17));
                ai.a.j(0, function3MaterializerOf17, androidx.appcompat.widget.g0.b(companion18, composerM2074constructorimpl17, viewConfiguration17, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                content.invoke(composerStartRestartGroup, Integer.valueOf((i16 >> 15) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                boolean zIsOpen6 = drawerState2.isOpen();
                j jVar6 = new j(z19, drawerState2, coroutineScope6);
                Float fValueOf11 = Float.valueOf(f6);
                Float fValueOf12 = Float.valueOf(0.0f);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(fValueOf11) | composerStartRestartGroup.changed(fValueOf12) | composerStartRestartGroup.changed(drawerState2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new k(f6, drawerState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new k(f6, drawerState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                b(zIsOpen6, jVar6, (Function0) objRememberedValue, j16, composerStartRestartGroup, (i16 >> 3) & 7168);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(drawerState2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new l(drawerState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new l(drawerState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics$default6 = SemanticsModifierKt.semantics$default(OffsetKt.offset(companion19, (Function1) objRememberedValue2), false, new m(strM1320getStringNWtq213, drawerState2, coroutineScope6), 1, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC18 = androidx.databinding.f.c(companion17, false, composerStartRestartGroup, 0, -1323940314);
                Density density18 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection18 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration18 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor3 = companion18.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf18 = LayoutKt.materializerOf(modifierSemantics$default6);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl18 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl18, layoutDirection18, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion18, composerM2074constructorimpl18, measurePolicyC18, composerM2074constructorimpl18, density18));
                ai.a.j(0, function3MaterializerOf18, androidx.appcompat.widget.g0.b(companion18, composerM2074constructorimpl18, viewConfiguration18, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                drawerContent.invoke(composerStartRestartGroup, Integer.valueOf(i16 & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z13 = z19;
                modifier2 = modifier8;
                scrimColor = j16;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                }
                i16 = i12;
                drawerState2 = drawerStateRememberDrawerState;
                boolean z110 = z11;
                long j17 = scrimColor;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1169303680, i16, -1, "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:253)");
                }
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                companion = Composer.INSTANCE;
                if (objB == companion.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope7 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                String strM1320getStringNWtq214 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                f6 = -((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(NavigationDrawerTokens.INSTANCE.m1791getContainerWidthD9Ej5fM());
                Map mapMapOf7 = bk.q.mapOf(TuplesKt.to(Float.valueOf(f6), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Modifier modifierM1336swipeablepPrIpRY7 = SwipeableKt.m1336swipeablepPrIpRY(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), drawerState2.getSwipeableState$material3_release(), mapMapOf7, Orientation.Horizontal, (32 & 8) != 0 ? true : z110, (32 & 16) != 0 ? false : z12, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? SwipeableKt.f.f11738p0 : i.f10804p0, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$material3_release$default(SwipeableDefaults.INSTANCE, mapMapOf7.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1335getVelocityThresholdD9Ej5fM$material3_release() : f10760a);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion110 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyC19 = androidx.databinding.f.c(companion110, false, composerStartRestartGroup, 0, -1323940314);
                Density density19 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection19 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                Modifier modifier9 = modifier2;
                ViewConfiguration viewConfiguration19 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion111 = ComposeUiNode.INSTANCE;
                constructor = companion111.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf19 = LayoutKt.materializerOf(modifierM1336swipeablepPrIpRY7);
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
                Composer composerM2074constructorimpl19 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl19, layoutDirection19, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion111, composerM2074constructorimpl19, measurePolicyC19, composerM2074constructorimpl19, density19));
                ai.a.j(0, function3MaterializerOf19, androidx.appcompat.widget.g0.b(companion111, composerM2074constructorimpl19, viewConfiguration19, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Modifier.Companion companion112 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyC110 = androidx.databinding.f.c(companion110, false, composerStartRestartGroup, 0, -1323940314);
                Density density110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection110 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration110 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion111.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf110 = LayoutKt.materializerOf(companion112);
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
                Composer composerM2074constructorimpl110 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl110, layoutDirection110, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion111, composerM2074constructorimpl110, measurePolicyC110, composerM2074constructorimpl110, density110));
                ai.a.j(0, function3MaterializerOf110, androidx.appcompat.widget.g0.b(companion111, composerM2074constructorimpl110, viewConfiguration110, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                content.invoke(composerStartRestartGroup, Integer.valueOf((i16 >> 15) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                boolean zIsOpen7 = drawerState2.isOpen();
                j jVar7 = new j(z110, drawerState2, coroutineScope7);
                Float fValueOf13 = Float.valueOf(f6);
                Float fValueOf14 = Float.valueOf(0.0f);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(fValueOf13) | composerStartRestartGroup.changed(fValueOf14) | composerStartRestartGroup.changed(drawerState2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new k(f6, drawerState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new k(f6, drawerState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                b(zIsOpen7, jVar7, (Function0) objRememberedValue, j17, composerStartRestartGroup, (i16 >> 3) & 7168);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(drawerState2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new l(drawerState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new l(drawerState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics$default7 = SemanticsModifierKt.semantics$default(OffsetKt.offset(companion112, (Function1) objRememberedValue2), false, new m(strM1320getStringNWtq214, drawerState2, coroutineScope7), 1, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC111 = androidx.databinding.f.c(companion110, false, composerStartRestartGroup, 0, -1323940314);
                Density density111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection111 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration111 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor3 = companion111.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111 = LayoutKt.materializerOf(modifierSemantics$default7);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl111 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl111, layoutDirection111, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion111, composerM2074constructorimpl111, measurePolicyC111, composerM2074constructorimpl111, density111));
                ai.a.j(0, function3MaterializerOf111, androidx.appcompat.widget.g0.b(companion111, composerM2074constructorimpl111, viewConfiguration111, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                drawerContent.invoke(composerStartRestartGroup, Integer.valueOf(i16 & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z13 = z110;
                modifier2 = modifier9;
                scrimColor = j17;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new n(drawerContent, modifier2, drawerState2, z13, scrimColor, content, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                drawerStateRememberDrawerState = drawerState;
                if (composerStartRestartGroup.changed(drawerStateRememberDrawerState)) {
                }
                i12 |= i18;
            } else {
                drawerStateRememberDrawerState = drawerState;
            }
            i12 |= i18;
        } else {
            drawerStateRememberDrawerState = drawerState;
        }
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                z11 = z10;
                if (composerStartRestartGroup.changed(z11)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    scrimColor = j10;
                    if (composerStartRestartGroup.changed(scrimColor)) {
                    }
                    i12 |= i19;
                } else {
                    scrimColor = j10;
                }
                i12 |= i19;
            } else {
                scrimColor = j10;
            }
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                    }
                    i16 = i12;
                    drawerState2 = drawerStateRememberDrawerState;
                    boolean z111 = z11;
                    long j18 = scrimColor;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1169303680, i16, -1, "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:253)");
                    }
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    companion = Composer.INSTANCE;
                    if (objB == companion.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope8 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    String strM1320getStringNWtq215 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                    f6 = -((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(NavigationDrawerTokens.INSTANCE.m1791getContainerWidthD9Ej5fM());
                    Map mapMapOf8 = bk.q.mapOf(TuplesKt.to(Float.valueOf(f6), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    Modifier modifierM1336swipeablepPrIpRY8 = SwipeableKt.m1336swipeablepPrIpRY(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), drawerState2.getSwipeableState$material3_release(), mapMapOf8, Orientation.Horizontal, (32 & 8) != 0 ? true : z111, (32 & 16) != 0 ? false : z12, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? SwipeableKt.f.f11738p0 : i.f10804p0, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$material3_release$default(SwipeableDefaults.INSTANCE, mapMapOf8.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1335getVelocityThresholdD9Ej5fM$material3_release() : f10760a);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion113 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyC112 = androidx.databinding.f.c(companion113, false, composerStartRestartGroup, 0, -1323940314);
                    Density density112 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection112 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    Modifier modifier10 = modifier2;
                    ViewConfiguration viewConfiguration112 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion114 = ComposeUiNode.INSTANCE;
                    constructor = companion114.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf112 = LayoutKt.materializerOf(modifierM1336swipeablepPrIpRY8);
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
                    Composer composerM2074constructorimpl112 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl112, layoutDirection112, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion114, composerM2074constructorimpl112, measurePolicyC112, composerM2074constructorimpl112, density112));
                    ai.a.j(0, function3MaterializerOf112, androidx.appcompat.widget.g0.b(companion114, composerM2074constructorimpl112, viewConfiguration112, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Modifier.Companion companion115 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyC113 = androidx.databinding.f.c(companion113, false, composerStartRestartGroup, 0, -1323940314);
                    Density density113 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection113 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration113 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion114.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf113 = LayoutKt.materializerOf(companion115);
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
                    Composer composerM2074constructorimpl113 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl113, layoutDirection113, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion114, composerM2074constructorimpl113, measurePolicyC113, composerM2074constructorimpl113, density113));
                    ai.a.j(0, function3MaterializerOf113, androidx.appcompat.widget.g0.b(companion114, composerM2074constructorimpl113, viewConfiguration113, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i16 >> 15) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    boolean zIsOpen8 = drawerState2.isOpen();
                    j jVar8 = new j(z111, drawerState2, coroutineScope8);
                    Float fValueOf15 = Float.valueOf(f6);
                    Float fValueOf16 = Float.valueOf(0.0f);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(fValueOf15) | composerStartRestartGroup.changed(fValueOf16) | composerStartRestartGroup.changed(drawerState2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new k(f6, drawerState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new k(f6, drawerState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    b(zIsOpen8, jVar8, (Function0) objRememberedValue, j18, composerStartRestartGroup, (i16 >> 3) & 7168);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(drawerState2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new l(drawerState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new l(drawerState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics$default8 = SemanticsModifierKt.semantics$default(OffsetKt.offset(companion115, (Function1) objRememberedValue2), false, new m(strM1320getStringNWtq215, drawerState2, coroutineScope8), 1, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyC114 = androidx.databinding.f.c(companion113, false, composerStartRestartGroup, 0, -1323940314);
                    Density density114 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection114 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration114 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor3 = companion114.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf114 = LayoutKt.materializerOf(modifierSemantics$default8);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2074constructorimpl114 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl114, layoutDirection114, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion114, composerM2074constructorimpl114, measurePolicyC114, composerM2074constructorimpl114, density114));
                    ai.a.j(0, function3MaterializerOf114, androidx.appcompat.widget.g0.b(companion114, composerM2074constructorimpl114, viewConfiguration114, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    drawerContent.invoke(composerStartRestartGroup, Integer.valueOf(i16 & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z13 = z111;
                    modifier2 = modifier10;
                    scrimColor = j18;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                            drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                    }
                    i16 = i12;
                    drawerState2 = drawerStateRememberDrawerState;
                    boolean z112 = z11;
                    long j19 = scrimColor;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1169303680, i16, -1, "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:253)");
                    }
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    companion = Composer.INSTANCE;
                    if (objB == companion.getEmpty()) {
                        objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope9 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    String strM1320getStringNWtq216 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                    f6 = -((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(NavigationDrawerTokens.INSTANCE.m1791getContainerWidthD9Ej5fM());
                    Map mapMapOf9 = bk.q.mapOf(TuplesKt.to(Float.valueOf(f6), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    Modifier modifierM1336swipeablepPrIpRY9 = SwipeableKt.m1336swipeablepPrIpRY(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), drawerState2.getSwipeableState$material3_release(), mapMapOf9, Orientation.Horizontal, (32 & 8) != 0 ? true : z112, (32 & 16) != 0 ? false : z12, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? SwipeableKt.f.f11738p0 : i.f10804p0, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$material3_release$default(SwipeableDefaults.INSTANCE, mapMapOf9.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1335getVelocityThresholdD9Ej5fM$material3_release() : f10760a);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion116 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyC115 = androidx.databinding.f.c(companion116, false, composerStartRestartGroup, 0, -1323940314);
                    Density density115 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection115 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    Modifier modifier11 = modifier2;
                    ViewConfiguration viewConfiguration115 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion117 = ComposeUiNode.INSTANCE;
                    constructor = companion117.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf115 = LayoutKt.materializerOf(modifierM1336swipeablepPrIpRY9);
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
                    Composer composerM2074constructorimpl115 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl115, layoutDirection115, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion117, composerM2074constructorimpl115, measurePolicyC115, composerM2074constructorimpl115, density115));
                    ai.a.j(0, function3MaterializerOf115, androidx.appcompat.widget.g0.b(companion117, composerM2074constructorimpl115, viewConfiguration115, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Modifier.Companion companion118 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyC116 = androidx.databinding.f.c(companion116, false, composerStartRestartGroup, 0, -1323940314);
                    Density density116 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection116 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration116 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion117.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf116 = LayoutKt.materializerOf(companion118);
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
                    Composer composerM2074constructorimpl116 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl116, layoutDirection116, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion117, composerM2074constructorimpl116, measurePolicyC116, composerM2074constructorimpl116, density116));
                    ai.a.j(0, function3MaterializerOf116, androidx.appcompat.widget.g0.b(companion117, composerM2074constructorimpl116, viewConfiguration116, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i16 >> 15) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    boolean zIsOpen9 = drawerState2.isOpen();
                    j jVar9 = new j(z112, drawerState2, coroutineScope9);
                    Float fValueOf17 = Float.valueOf(f6);
                    Float fValueOf18 = Float.valueOf(0.0f);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged = composerStartRestartGroup.changed(fValueOf17) | composerStartRestartGroup.changed(fValueOf18) | composerStartRestartGroup.changed(drawerState2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new k(f6, drawerState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new k(f6, drawerState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    b(zIsOpen9, jVar9, (Function0) objRememberedValue, j19, composerStartRestartGroup, (i16 >> 3) & 7168);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(drawerState2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new l(drawerState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new l(drawerState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics$default9 = SemanticsModifierKt.semantics$default(OffsetKt.offset(companion118, (Function1) objRememberedValue2), false, new m(strM1320getStringNWtq216, drawerState2, coroutineScope9), 1, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyC117 = androidx.databinding.f.c(companion116, false, composerStartRestartGroup, 0, -1323940314);
                    Density density117 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection117 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration117 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor3 = companion117.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf117 = LayoutKt.materializerOf(modifierSemantics$default9);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2074constructorimpl117 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl117, layoutDirection117, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion117, composerM2074constructorimpl117, measurePolicyC117, composerM2074constructorimpl117, density117));
                    ai.a.j(0, function3MaterializerOf117, androidx.appcompat.widget.g0.b(companion117, composerM2074constructorimpl117, viewConfiguration117, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    drawerContent.invoke(composerStartRestartGroup, Integer.valueOf(i16 & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z13 = z112;
                    modifier2 = modifier11;
                    scrimColor = j19;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new n(drawerContent, modifier2, drawerState2, z13, scrimColor, content, i10, i11));
            }
            i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i15;
            if ((374491 & i12) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                }
                i16 = i12;
                drawerState2 = drawerStateRememberDrawerState;
                boolean z113 = z11;
                long j110 = scrimColor;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1169303680, i16, -1, "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:253)");
                }
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                companion = Composer.INSTANCE;
                if (objB == companion.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope10 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                String strM1320getStringNWtq217 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                f6 = -((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(NavigationDrawerTokens.INSTANCE.m1791getContainerWidthD9Ej5fM());
                Map mapMapOf10 = bk.q.mapOf(TuplesKt.to(Float.valueOf(f6), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Modifier modifierM1336swipeablepPrIpRY10 = SwipeableKt.m1336swipeablepPrIpRY(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), drawerState2.getSwipeableState$material3_release(), mapMapOf10, Orientation.Horizontal, (32 & 8) != 0 ? true : z113, (32 & 16) != 0 ? false : z12, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? SwipeableKt.f.f11738p0 : i.f10804p0, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$material3_release$default(SwipeableDefaults.INSTANCE, mapMapOf10.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1335getVelocityThresholdD9Ej5fM$material3_release() : f10760a);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion119 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyC118 = androidx.databinding.f.c(companion119, false, composerStartRestartGroup, 0, -1323940314);
                Density density118 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection118 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                Modifier modifier12 = modifier2;
                ViewConfiguration viewConfiguration118 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion1110 = ComposeUiNode.INSTANCE;
                constructor = companion1110.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf118 = LayoutKt.materializerOf(modifierM1336swipeablepPrIpRY10);
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
                Composer composerM2074constructorimpl118 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl118, layoutDirection118, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion1110, composerM2074constructorimpl118, measurePolicyC118, composerM2074constructorimpl118, density118));
                ai.a.j(0, function3MaterializerOf118, androidx.appcompat.widget.g0.b(companion1110, composerM2074constructorimpl118, viewConfiguration118, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Modifier.Companion companion1111 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyC119 = androidx.databinding.f.c(companion119, false, composerStartRestartGroup, 0, -1323940314);
                Density density119 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection119 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration119 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion1110.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf119 = LayoutKt.materializerOf(companion1111);
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
                Composer composerM2074constructorimpl119 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl119, layoutDirection119, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion1110, composerM2074constructorimpl119, measurePolicyC119, composerM2074constructorimpl119, density119));
                ai.a.j(0, function3MaterializerOf119, androidx.appcompat.widget.g0.b(companion1110, composerM2074constructorimpl119, viewConfiguration119, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                content.invoke(composerStartRestartGroup, Integer.valueOf((i16 >> 15) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                boolean zIsOpen10 = drawerState2.isOpen();
                j jVar10 = new j(z113, drawerState2, coroutineScope10);
                Float fValueOf19 = Float.valueOf(f6);
                Float fValueOf110 = Float.valueOf(0.0f);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(fValueOf19) | composerStartRestartGroup.changed(fValueOf110) | composerStartRestartGroup.changed(drawerState2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new k(f6, drawerState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new k(f6, drawerState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                b(zIsOpen10, jVar10, (Function0) objRememberedValue, j110, composerStartRestartGroup, (i16 >> 3) & 7168);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(drawerState2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new l(drawerState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new l(drawerState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics$default10 = SemanticsModifierKt.semantics$default(OffsetKt.offset(companion1111, (Function1) objRememberedValue2), false, new m(strM1320getStringNWtq217, drawerState2, coroutineScope10), 1, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC1110 = androidx.databinding.f.c(companion119, false, composerStartRestartGroup, 0, -1323940314);
                Density density1110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection1110 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration1110 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor3 = companion1110.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1110 = LayoutKt.materializerOf(modifierSemantics$default10);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl1110 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl1110, layoutDirection1110, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion1110, composerM2074constructorimpl1110, measurePolicyC1110, composerM2074constructorimpl1110, density1110));
                ai.a.j(0, function3MaterializerOf1110, androidx.appcompat.widget.g0.b(companion1110, composerM2074constructorimpl1110, viewConfiguration1110, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                drawerContent.invoke(composerStartRestartGroup, Integer.valueOf(i16 & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z13 = z113;
                modifier2 = modifier12;
                scrimColor = j110;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                }
                i16 = i12;
                drawerState2 = drawerStateRememberDrawerState;
                boolean z114 = z11;
                long j111 = scrimColor;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1169303680, i16, -1, "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:253)");
                }
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                companion = Composer.INSTANCE;
                if (objB == companion.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope11 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                String strM1320getStringNWtq218 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                f6 = -((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(NavigationDrawerTokens.INSTANCE.m1791getContainerWidthD9Ej5fM());
                Map mapMapOf11 = bk.q.mapOf(TuplesKt.to(Float.valueOf(f6), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Modifier modifierM1336swipeablepPrIpRY11 = SwipeableKt.m1336swipeablepPrIpRY(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), drawerState2.getSwipeableState$material3_release(), mapMapOf11, Orientation.Horizontal, (32 & 8) != 0 ? true : z114, (32 & 16) != 0 ? false : z12, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? SwipeableKt.f.f11738p0 : i.f10804p0, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$material3_release$default(SwipeableDefaults.INSTANCE, mapMapOf11.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1335getVelocityThresholdD9Ej5fM$material3_release() : f10760a);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion1112 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyC1111 = androidx.databinding.f.c(companion1112, false, composerStartRestartGroup, 0, -1323940314);
                Density density1111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection1111 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                Modifier modifier13 = modifier2;
                ViewConfiguration viewConfiguration1111 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion1113 = ComposeUiNode.INSTANCE;
                constructor = companion1113.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1111 = LayoutKt.materializerOf(modifierM1336swipeablepPrIpRY11);
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
                Composer composerM2074constructorimpl1111 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl1111, layoutDirection1111, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion1113, composerM2074constructorimpl1111, measurePolicyC1111, composerM2074constructorimpl1111, density1111));
                ai.a.j(0, function3MaterializerOf1111, androidx.appcompat.widget.g0.b(companion1113, composerM2074constructorimpl1111, viewConfiguration1111, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Modifier.Companion companion1114 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyC1112 = androidx.databinding.f.c(companion1112, false, composerStartRestartGroup, 0, -1323940314);
                Density density1112 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection1112 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration1112 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion1113.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1112 = LayoutKt.materializerOf(companion1114);
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
                Composer composerM2074constructorimpl1112 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl1112, layoutDirection1112, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion1113, composerM2074constructorimpl1112, measurePolicyC1112, composerM2074constructorimpl1112, density1112));
                ai.a.j(0, function3MaterializerOf1112, androidx.appcompat.widget.g0.b(companion1113, composerM2074constructorimpl1112, viewConfiguration1112, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                content.invoke(composerStartRestartGroup, Integer.valueOf((i16 >> 15) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                boolean zIsOpen11 = drawerState2.isOpen();
                j jVar11 = new j(z114, drawerState2, coroutineScope11);
                Float fValueOf111 = Float.valueOf(f6);
                Float fValueOf112 = Float.valueOf(0.0f);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(fValueOf111) | composerStartRestartGroup.changed(fValueOf112) | composerStartRestartGroup.changed(drawerState2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new k(f6, drawerState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new k(f6, drawerState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                b(zIsOpen11, jVar11, (Function0) objRememberedValue, j111, composerStartRestartGroup, (i16 >> 3) & 7168);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(drawerState2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new l(drawerState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new l(drawerState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics$default11 = SemanticsModifierKt.semantics$default(OffsetKt.offset(companion1114, (Function1) objRememberedValue2), false, new m(strM1320getStringNWtq218, drawerState2, coroutineScope11), 1, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC1113 = androidx.databinding.f.c(companion1112, false, composerStartRestartGroup, 0, -1323940314);
                Density density1113 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection1113 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration1113 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor3 = companion1113.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1113 = LayoutKt.materializerOf(modifierSemantics$default11);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl1113 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl1113, layoutDirection1113, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion1113, composerM2074constructorimpl1113, measurePolicyC1113, composerM2074constructorimpl1113, density1113));
                ai.a.j(0, function3MaterializerOf1113, androidx.appcompat.widget.g0.b(companion1113, composerM2074constructorimpl1113, viewConfiguration1113, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                drawerContent.invoke(composerStartRestartGroup, Integer.valueOf(i16 & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z13 = z114;
                modifier2 = modifier13;
                scrimColor = j111;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new n(drawerContent, modifier2, drawerState2, z13, scrimColor, content, i10, i11));
        }
        i12 |= 3072;
        z11 = z10;
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                scrimColor = j10;
                if (composerStartRestartGroup.changed(scrimColor)) {
                }
                i12 |= i19;
            } else {
                scrimColor = j10;
            }
            i12 |= i19;
        } else {
            scrimColor = j10;
        }
        if ((i11 & 32) != 0) {
            if ((458752 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
            }
            if ((374491 & i12) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                }
                i16 = i12;
                drawerState2 = drawerStateRememberDrawerState;
                boolean z115 = z11;
                long j112 = scrimColor;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1169303680, i16, -1, "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:253)");
                }
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                companion = Composer.INSTANCE;
                if (objB == companion.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope12 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                String strM1320getStringNWtq219 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                f6 = -((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(NavigationDrawerTokens.INSTANCE.m1791getContainerWidthD9Ej5fM());
                Map mapMapOf12 = bk.q.mapOf(TuplesKt.to(Float.valueOf(f6), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Modifier modifierM1336swipeablepPrIpRY12 = SwipeableKt.m1336swipeablepPrIpRY(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), drawerState2.getSwipeableState$material3_release(), mapMapOf12, Orientation.Horizontal, (32 & 8) != 0 ? true : z115, (32 & 16) != 0 ? false : z12, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? SwipeableKt.f.f11738p0 : i.f10804p0, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$material3_release$default(SwipeableDefaults.INSTANCE, mapMapOf12.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1335getVelocityThresholdD9Ej5fM$material3_release() : f10760a);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion1115 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyC1114 = androidx.databinding.f.c(companion1115, false, composerStartRestartGroup, 0, -1323940314);
                Density density1114 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection1114 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                Modifier modifier14 = modifier2;
                ViewConfiguration viewConfiguration1114 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion1116 = ComposeUiNode.INSTANCE;
                constructor = companion1116.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1114 = LayoutKt.materializerOf(modifierM1336swipeablepPrIpRY12);
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
                Composer composerM2074constructorimpl1114 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl1114, layoutDirection1114, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion1116, composerM2074constructorimpl1114, measurePolicyC1114, composerM2074constructorimpl1114, density1114));
                ai.a.j(0, function3MaterializerOf1114, androidx.appcompat.widget.g0.b(companion1116, composerM2074constructorimpl1114, viewConfiguration1114, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Modifier.Companion companion1117 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyC1115 = androidx.databinding.f.c(companion1115, false, composerStartRestartGroup, 0, -1323940314);
                Density density1115 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection1115 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration1115 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion1116.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1115 = LayoutKt.materializerOf(companion1117);
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
                Composer composerM2074constructorimpl1115 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl1115, layoutDirection1115, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion1116, composerM2074constructorimpl1115, measurePolicyC1115, composerM2074constructorimpl1115, density1115));
                ai.a.j(0, function3MaterializerOf1115, androidx.appcompat.widget.g0.b(companion1116, composerM2074constructorimpl1115, viewConfiguration1115, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                content.invoke(composerStartRestartGroup, Integer.valueOf((i16 >> 15) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                boolean zIsOpen12 = drawerState2.isOpen();
                j jVar12 = new j(z115, drawerState2, coroutineScope12);
                Float fValueOf113 = Float.valueOf(f6);
                Float fValueOf114 = Float.valueOf(0.0f);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(fValueOf113) | composerStartRestartGroup.changed(fValueOf114) | composerStartRestartGroup.changed(drawerState2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new k(f6, drawerState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new k(f6, drawerState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                b(zIsOpen12, jVar12, (Function0) objRememberedValue, j112, composerStartRestartGroup, (i16 >> 3) & 7168);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(drawerState2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new l(drawerState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new l(drawerState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics$default12 = SemanticsModifierKt.semantics$default(OffsetKt.offset(companion1117, (Function1) objRememberedValue2), false, new m(strM1320getStringNWtq219, drawerState2, coroutineScope12), 1, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC1116 = androidx.databinding.f.c(companion1115, false, composerStartRestartGroup, 0, -1323940314);
                Density density1116 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection1116 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration1116 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor3 = companion1116.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1116 = LayoutKt.materializerOf(modifierSemantics$default12);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl1116 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl1116, layoutDirection1116, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion1116, composerM2074constructorimpl1116, measurePolicyC1116, composerM2074constructorimpl1116, density1116));
                ai.a.j(0, function3MaterializerOf1116, androidx.appcompat.widget.g0.b(companion1116, composerM2074constructorimpl1116, viewConfiguration1116, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                drawerContent.invoke(composerStartRestartGroup, Integer.valueOf(i16 & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z13 = z115;
                modifier2 = modifier14;
                scrimColor = j112;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                }
                i16 = i12;
                drawerState2 = drawerStateRememberDrawerState;
                boolean z116 = z11;
                long j113 = scrimColor;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1169303680, i16, -1, "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:253)");
                }
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                companion = Composer.INSTANCE;
                if (objB == companion.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope13 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                String strM1320getStringNWtq2110 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                f6 = -((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(NavigationDrawerTokens.INSTANCE.m1791getContainerWidthD9Ej5fM());
                Map mapMapOf13 = bk.q.mapOf(TuplesKt.to(Float.valueOf(f6), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Modifier modifierM1336swipeablepPrIpRY13 = SwipeableKt.m1336swipeablepPrIpRY(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), drawerState2.getSwipeableState$material3_release(), mapMapOf13, Orientation.Horizontal, (32 & 8) != 0 ? true : z116, (32 & 16) != 0 ? false : z12, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? SwipeableKt.f.f11738p0 : i.f10804p0, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$material3_release$default(SwipeableDefaults.INSTANCE, mapMapOf13.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1335getVelocityThresholdD9Ej5fM$material3_release() : f10760a);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion1118 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyC1117 = androidx.databinding.f.c(companion1118, false, composerStartRestartGroup, 0, -1323940314);
                Density density1117 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection1117 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                Modifier modifier15 = modifier2;
                ViewConfiguration viewConfiguration1117 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion1119 = ComposeUiNode.INSTANCE;
                constructor = companion1119.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1117 = LayoutKt.materializerOf(modifierM1336swipeablepPrIpRY13);
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
                Composer composerM2074constructorimpl1117 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl1117, layoutDirection1117, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion1119, composerM2074constructorimpl1117, measurePolicyC1117, composerM2074constructorimpl1117, density1117));
                ai.a.j(0, function3MaterializerOf1117, androidx.appcompat.widget.g0.b(companion1119, composerM2074constructorimpl1117, viewConfiguration1117, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Modifier.Companion companion11110 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyC1118 = androidx.databinding.f.c(companion1118, false, composerStartRestartGroup, 0, -1323940314);
                Density density1118 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection1118 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration1118 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion1119.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1118 = LayoutKt.materializerOf(companion11110);
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
                Composer composerM2074constructorimpl1118 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl1118, layoutDirection1118, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion1119, composerM2074constructorimpl1118, measurePolicyC1118, composerM2074constructorimpl1118, density1118));
                ai.a.j(0, function3MaterializerOf1118, androidx.appcompat.widget.g0.b(companion1119, composerM2074constructorimpl1118, viewConfiguration1118, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                content.invoke(composerStartRestartGroup, Integer.valueOf((i16 >> 15) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                boolean zIsOpen13 = drawerState2.isOpen();
                j jVar13 = new j(z116, drawerState2, coroutineScope13);
                Float fValueOf115 = Float.valueOf(f6);
                Float fValueOf116 = Float.valueOf(0.0f);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(fValueOf115) | composerStartRestartGroup.changed(fValueOf116) | composerStartRestartGroup.changed(drawerState2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new k(f6, drawerState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new k(f6, drawerState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                b(zIsOpen13, jVar13, (Function0) objRememberedValue, j113, composerStartRestartGroup, (i16 >> 3) & 7168);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(drawerState2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue2 = new l(drawerState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new l(drawerState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics$default13 = SemanticsModifierKt.semantics$default(OffsetKt.offset(companion11110, (Function1) objRememberedValue2), false, new m(strM1320getStringNWtq2110, drawerState2, coroutineScope13), 1, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC1119 = androidx.databinding.f.c(companion1118, false, composerStartRestartGroup, 0, -1323940314);
                Density density1119 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection1119 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration1119 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor3 = companion1119.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1119 = LayoutKt.materializerOf(modifierSemantics$default13);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl1119 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl1119, layoutDirection1119, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion1119, composerM2074constructorimpl1119, measurePolicyC1119, composerM2074constructorimpl1119, density1119));
                ai.a.j(0, function3MaterializerOf1119, androidx.appcompat.widget.g0.b(companion1119, composerM2074constructorimpl1119, viewConfiguration1119, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                drawerContent.invoke(composerStartRestartGroup, Integer.valueOf(i16 & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z13 = z116;
                modifier2 = modifier15;
                scrimColor = j113;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new n(drawerContent, modifier2, drawerState2, z13, scrimColor, content, i10, i11));
        }
        i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i12 |= i15;
        if ((374491 & i12) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 16) != 0) {
                    scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i12 &= -57345;
                }
            } else {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 16) != 0) {
                    scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i12 &= -57345;
                }
            }
            i16 = i12;
            drawerState2 = drawerStateRememberDrawerState;
            boolean z117 = z11;
            long j114 = scrimColor;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1169303680, i16, -1, "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:253)");
            }
            objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
            companion = Composer.INSTANCE;
            if (objB == companion.getEmpty()) {
                objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope14 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            String strM1320getStringNWtq2111 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
            f6 = -((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(NavigationDrawerTokens.INSTANCE.m1791getContainerWidthD9Ej5fM());
            Map mapMapOf14 = bk.q.mapOf(TuplesKt.to(Float.valueOf(f6), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
            if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                z12 = true;
            } else {
                z12 = false;
            }
            Modifier modifierM1336swipeablepPrIpRY14 = SwipeableKt.m1336swipeablepPrIpRY(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), drawerState2.getSwipeableState$material3_release(), mapMapOf14, Orientation.Horizontal, (32 & 8) != 0 ? true : z117, (32 & 16) != 0 ? false : z12, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? SwipeableKt.f.f11738p0 : i.f10804p0, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$material3_release$default(SwipeableDefaults.INSTANCE, mapMapOf14.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1335getVelocityThresholdD9Ej5fM$material3_release() : f10760a);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion11111 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyC11110 = androidx.databinding.f.c(companion11111, false, composerStartRestartGroup, 0, -1323940314);
            Density density11110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection11110 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            Modifier modifier16 = modifier2;
            ViewConfiguration viewConfiguration11110 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion11112 = ComposeUiNode.INSTANCE;
            constructor = companion11112.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11110 = LayoutKt.materializerOf(modifierM1336swipeablepPrIpRY14);
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
            Composer composerM2074constructorimpl11110 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl11110, layoutDirection11110, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion11112, composerM2074constructorimpl11110, measurePolicyC11110, composerM2074constructorimpl11110, density11110));
            ai.a.j(0, function3MaterializerOf11110, androidx.appcompat.widget.g0.b(companion11112, composerM2074constructorimpl11110, viewConfiguration11110, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Modifier.Companion companion11113 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyC11111 = androidx.databinding.f.c(companion11111, false, composerStartRestartGroup, 0, -1323940314);
            Density density11111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection11111 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration11111 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor2 = companion11112.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11111 = LayoutKt.materializerOf(companion11113);
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
            Composer composerM2074constructorimpl11111 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl11111, layoutDirection11111, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion11112, composerM2074constructorimpl11111, measurePolicyC11111, composerM2074constructorimpl11111, density11111));
            ai.a.j(0, function3MaterializerOf11111, androidx.appcompat.widget.g0.b(companion11112, composerM2074constructorimpl11111, viewConfiguration11111, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            content.invoke(composerStartRestartGroup, Integer.valueOf((i16 >> 15) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            boolean zIsOpen14 = drawerState2.isOpen();
            j jVar14 = new j(z117, drawerState2, coroutineScope14);
            Float fValueOf117 = Float.valueOf(f6);
            Float fValueOf118 = Float.valueOf(0.0f);
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            zChanged = composerStartRestartGroup.changed(fValueOf117) | composerStartRestartGroup.changed(fValueOf118) | composerStartRestartGroup.changed(drawerState2);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new k(f6, drawerState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new k(f6, drawerState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            b(zIsOpen14, jVar14, (Function0) objRememberedValue, j114, composerStartRestartGroup, (i16 >> 3) & 7168);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged2 = composerStartRestartGroup.changed(drawerState2);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue2 = new l(drawerState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new l(drawerState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierSemantics$default14 = SemanticsModifierKt.semantics$default(OffsetKt.offset(companion11113, (Function1) objRememberedValue2), false, new m(strM1320getStringNWtq2111, drawerState2, coroutineScope14), 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyC11112 = androidx.databinding.f.c(companion11111, false, composerStartRestartGroup, 0, -1323940314);
            Density density11112 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection11112 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration11112 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor3 = companion11112.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11112 = LayoutKt.materializerOf(modifierSemantics$default14);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl11112 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl11112, layoutDirection11112, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion11112, composerM2074constructorimpl11112, measurePolicyC11112, composerM2074constructorimpl11112, density11112));
            ai.a.j(0, function3MaterializerOf11112, androidx.appcompat.widget.g0.b(companion11112, composerM2074constructorimpl11112, viewConfiguration11112, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            drawerContent.invoke(composerStartRestartGroup, Integer.valueOf(i16 & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z13 = z117;
            modifier2 = modifier16;
            scrimColor = j114;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 16) != 0) {
                    scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i12 &= -57345;
                }
            } else {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 16) != 0) {
                    scrimColor = DrawerDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i12 &= -57345;
                }
            }
            i16 = i12;
            drawerState2 = drawerStateRememberDrawerState;
            boolean z118 = z11;
            long j115 = scrimColor;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1169303680, i16, -1, "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:253)");
            }
            objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
            companion = Composer.INSTANCE;
            if (objB == companion.getEmpty()) {
                objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope15 = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            String strM1320getStringNWtq2112 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
            f6 = -((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo415toPx0680j_4(NavigationDrawerTokens.INSTANCE.m1791getContainerWidthD9Ej5fM());
            Map mapMapOf15 = bk.q.mapOf(TuplesKt.to(Float.valueOf(f6), DrawerValue.Closed), TuplesKt.to(Float.valueOf(0.0f), DrawerValue.Open));
            if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                z12 = true;
            } else {
                z12 = false;
            }
            Modifier modifierM1336swipeablepPrIpRY15 = SwipeableKt.m1336swipeablepPrIpRY(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), drawerState2.getSwipeableState$material3_release(), mapMapOf15, Orientation.Horizontal, (32 & 8) != 0 ? true : z118, (32 & 16) != 0 ? false : z12, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? SwipeableKt.f.f11738p0 : i.f10804p0, (32 & 128) != 0 ? SwipeableDefaults.resistanceConfig$material3_release$default(SwipeableDefaults.INSTANCE, mapMapOf15.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & 256) != 0 ? SwipeableDefaults.INSTANCE.m1335getVelocityThresholdD9Ej5fM$material3_release() : f10760a);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion11114 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyC11113 = androidx.databinding.f.c(companion11114, false, composerStartRestartGroup, 0, -1323940314);
            Density density11113 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection11113 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            Modifier modifier17 = modifier2;
            ViewConfiguration viewConfiguration11113 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion11115 = ComposeUiNode.INSTANCE;
            constructor = companion11115.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11113 = LayoutKt.materializerOf(modifierM1336swipeablepPrIpRY15);
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
            Composer composerM2074constructorimpl11113 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl11113, layoutDirection11113, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion11115, composerM2074constructorimpl11113, measurePolicyC11113, composerM2074constructorimpl11113, density11113));
            ai.a.j(0, function3MaterializerOf11113, androidx.appcompat.widget.g0.b(companion11115, composerM2074constructorimpl11113, viewConfiguration11113, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Modifier.Companion companion11116 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyC11114 = androidx.databinding.f.c(companion11114, false, composerStartRestartGroup, 0, -1323940314);
            Density density11114 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection11114 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration11114 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor2 = companion11115.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11114 = LayoutKt.materializerOf(companion11116);
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
            Composer composerM2074constructorimpl11114 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl11114, layoutDirection11114, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion11115, composerM2074constructorimpl11114, measurePolicyC11114, composerM2074constructorimpl11114, density11114));
            ai.a.j(0, function3MaterializerOf11114, androidx.appcompat.widget.g0.b(companion11115, composerM2074constructorimpl11114, viewConfiguration11114, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            content.invoke(composerStartRestartGroup, Integer.valueOf((i16 >> 15) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            boolean zIsOpen15 = drawerState2.isOpen();
            j jVar15 = new j(z118, drawerState2, coroutineScope15);
            Float fValueOf119 = Float.valueOf(f6);
            Float fValueOf1110 = Float.valueOf(0.0f);
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            zChanged = composerStartRestartGroup.changed(fValueOf119) | composerStartRestartGroup.changed(fValueOf1110) | composerStartRestartGroup.changed(drawerState2);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new k(f6, drawerState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new k(f6, drawerState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            b(zIsOpen15, jVar15, (Function0) objRememberedValue, j115, composerStartRestartGroup, (i16 >> 3) & 7168);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged2 = composerStartRestartGroup.changed(drawerState2);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue2 = new l(drawerState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new l(drawerState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierSemantics$default15 = SemanticsModifierKt.semantics$default(OffsetKt.offset(companion11116, (Function1) objRememberedValue2), false, new m(strM1320getStringNWtq2112, drawerState2, coroutineScope15), 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyC11115 = androidx.databinding.f.c(companion11114, false, composerStartRestartGroup, 0, -1323940314);
            Density density11115 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection11115 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration11115 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor3 = companion11115.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11115 = LayoutKt.materializerOf(modifierSemantics$default15);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl11115 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl11115, layoutDirection11115, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion11115, composerM2074constructorimpl11115, measurePolicyC11115, composerM2074constructorimpl11115, density11115));
            ai.a.j(0, function3MaterializerOf11115, androidx.appcompat.widget.g0.b(companion11115, composerM2074constructorimpl11115, viewConfiguration11115, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            drawerContent.invoke(composerStartRestartGroup, Integer.valueOf(i16 & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z13 = z118;
            modifier2 = modifier17;
            scrimColor = j115;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new n(drawerContent, modifier2, drawerState2, z13, scrimColor, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0131  */
    /* JADX WARN: Code duplicated, block: B:106:0x013c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0162 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0164  */
    /* JADX WARN: Code duplicated, block: B:118:0x0167  */
    /* JADX WARN: Code duplicated, block: B:120:0x016b  */
    /* JADX WARN: Code duplicated, block: B:122:0x016e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0173  */
    /* JADX WARN: Code duplicated, block: B:126:0x0181  */
    /* JADX WARN: Code duplicated, block: B:129:0x0186  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:132:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:134:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:137:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:140:0x01df  */
    /* JADX WARN: Code duplicated, block: B:143:0x026e  */
    /* JADX WARN: Code duplicated, block: B:148:0x0283  */
    /* JADX WARN: Code duplicated, block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:93:0x0104  */
    /* JADX WARN: Code duplicated, block: B:95:0x010a  */
    /* JADX WARN: Code duplicated, block: B:96:0x010d  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void NavigationDrawerItem(@NotNull Function2<? super Composer, ? super Integer, Unit> label, boolean z10, @NotNull Function0<Unit> onClick, @Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Shape shape, @Nullable NavigationDrawerItemColors navigationDrawerItemColors, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Composer composer, int i10, int i11) {
        int i12;
        int i13;
        Function2<? super Composer, ? super Integer, Unit> function4;
        int i14;
        int i15;
        Function2<? super Composer, ? super Integer, Unit> function5;
        int i16;
        Shape shape2;
        NavigationDrawerItemColors navigationDrawerItemColors2;
        int i17;
        int i18;
        Modifier modifier2;
        Shape shape3;
        NavigationDrawerItemColors navigationDrawerItemColorsM1179colorsoq7We08;
        MutableInteractionSource mutableInteractionSource2;
        int i19;
        Shape shape4;
        NavigationDrawerItemColors navigationDrawerItemColors3;
        Function2<? super Composer, ? super Integer, Unit> function6;
        Function2<? super Composer, ? super Integer, Unit> function7;
        Object objRememberedValue;
        Composer composer2;
        Modifier modifier3;
        Function2<? super Composer, ? super Integer, Unit> function8;
        Function2<? super Composer, ? super Integer, Unit> function9;
        Shape shape5;
        MutableInteractionSource mutableInteractionSource3;
        NavigationDrawerItemColors navigationDrawerItemColors4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1304626543);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(label) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(z10) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        int i20 = i11 & 8;
        if (i20 == 0) {
            if ((i10 & 7168) == 0) {
                i12 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 57344) == 0) {
                    function4 = function2;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((458752 & i10) == 0) {
                        function5 = function3;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    if ((3670016 & i10) == 0) {
                        if ((i11 & 64) == 0) {
                            shape2 = shape;
                            int i21 = composerStartRestartGroup.changed(shape2) ? 1048576 : 524288;
                            i12 |= i21;
                        } else {
                            shape2 = shape;
                        }
                        i12 |= i21;
                    } else {
                        shape2 = shape;
                    }
                    if ((29360128 & i10) == 0) {
                        if ((i11 & 128) == 0) {
                            navigationDrawerItemColors2 = navigationDrawerItemColors;
                            int i22 = composerStartRestartGroup.changed(navigationDrawerItemColors2) ? 8388608 : 4194304;
                            i12 |= i22;
                        } else {
                            navigationDrawerItemColors2 = navigationDrawerItemColors;
                        }
                        i12 |= i22;
                    } else {
                        navigationDrawerItemColors2 = navigationDrawerItemColors;
                    }
                    i17 = i11 & 256;
                    if (i17 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 234881024) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i18 = 33554432;
                        }
                        i12 |= i18;
                    }
                    if ((i12 & 191739611) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i20 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            }
                            if (i15 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 64) != 0) {
                                shape3 = ShapesKt.toShape(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                                i12 &= -3670017;
                            } else {
                                shape3 = shape2;
                            }
                            if ((i11 & 128) != 0) {
                                navigationDrawerItemColorsM1179colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m1179colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                                i12 &= -29360129;
                            } else {
                                navigationDrawerItemColorsM1179colorsoq7We08 = navigationDrawerItemColors2;
                            }
                            if (i17 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            i19 = i12;
                            shape4 = shape3;
                            navigationDrawerItemColors3 = navigationDrawerItemColorsM1179colorsoq7We08;
                            function6 = function4;
                            function7 = function5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                i12 &= -29360129;
                            }
                            modifier2 = modifier;
                            mutableInteractionSource2 = mutableInteractionSource;
                            function6 = function4;
                            function7 = function5;
                            shape4 = shape2;
                            navigationDrawerItemColors3 = navigationDrawerItemColors2;
                            i19 = i12;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1304626543, i19, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:650)");
                        }
                        int i23 = i19 >> 3;
                        int i24 = i23 & 14;
                        int i25 = i19;
                        NavigationDrawerItemColors navigationDrawerItemColors5 = navigationDrawerItemColors3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m1330Surfaced85dljk(z10, onClick, SizeKt.fillMaxWidth$default(SizeKt.m321height3ABfNKs(SemanticsModifierKt.semantics$default(modifier2, false, o.f10821p0, 1, null), NavigationDrawerTokens.INSTANCE.m1789getActiveIndicatorHeightD9Ej5fM()), 0.0f, 1, null), false, shape4, navigationDrawerItemColors3.containerColor(z10, composerStartRestartGroup, i24 | ((i19 >> 18) & 112)).getValue().m2518unboximpl(), 0L, 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource2, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, 191488423, true, new p(function6, navigationDrawerItemColors3, z10, i19, function7, label)), composerStartRestartGroup, i24 | (i23 & 112) | ((i25 >> 6) & 57344), ((i25 >> 24) & 14) | 48, 968);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        function8 = function6;
                        function9 = function7;
                        shape5 = shape4;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        navigationDrawerItemColors4 = navigationDrawerItemColors5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        function8 = function4;
                        function9 = function5;
                        shape5 = shape2;
                        composer2 = composerStartRestartGroup;
                        navigationDrawerItemColors4 = navigationDrawerItemColors2;
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new q(label, z10, onClick, modifier3, function8, function9, shape5, navigationDrawerItemColors4, mutableInteractionSource3, i10, i11));
                }
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function5 = function3;
                if ((3670016 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        shape2 = shape;
                        if (composerStartRestartGroup.changed(shape2)) {
                        }
                        i12 |= i21;
                    } else {
                        shape2 = shape;
                    }
                    i12 |= i21;
                } else {
                    shape2 = shape;
                }
                if ((29360128 & i10) == 0) {
                    if ((i11 & 128) == 0) {
                        navigationDrawerItemColors2 = navigationDrawerItemColors;
                        if (composerStartRestartGroup.changed(navigationDrawerItemColors2)) {
                        }
                        i12 |= i22;
                    } else {
                        navigationDrawerItemColors2 = navigationDrawerItemColors;
                    }
                    i12 |= i22;
                } else {
                    navigationDrawerItemColors2 = navigationDrawerItemColors;
                }
                i17 = i11 & 256;
                if (i17 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i18 = 33554432;
                    }
                    i12 |= i18;
                }
                if ((i12 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            shape3 = ShapesKt.toShape(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i11 & 128) != 0) {
                            navigationDrawerItemColorsM1179colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m1179colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                            i12 &= -29360129;
                        } else {
                            navigationDrawerItemColorsM1179colorsoq7We08 = navigationDrawerItemColors2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        i19 = i12;
                        shape4 = shape3;
                        navigationDrawerItemColors3 = navigationDrawerItemColorsM1179colorsoq7We08;
                        function6 = function4;
                        function7 = function5;
                    } else {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            shape3 = ShapesKt.toShape(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i11 & 128) != 0) {
                            navigationDrawerItemColorsM1179colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m1179colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                            i12 &= -29360129;
                        } else {
                            navigationDrawerItemColorsM1179colorsoq7We08 = navigationDrawerItemColors2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        i19 = i12;
                        shape4 = shape3;
                        navigationDrawerItemColors3 = navigationDrawerItemColorsM1179colorsoq7We08;
                        function6 = function4;
                        function7 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1304626543, i19, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:650)");
                    }
                    int i26 = i19 >> 3;
                    int i27 = i26 & 14;
                    int i28 = i19;
                    NavigationDrawerItemColors navigationDrawerItemColors6 = navigationDrawerItemColors3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m1330Surfaced85dljk(z10, onClick, SizeKt.fillMaxWidth$default(SizeKt.m321height3ABfNKs(SemanticsModifierKt.semantics$default(modifier2, false, o.f10821p0, 1, null), NavigationDrawerTokens.INSTANCE.m1789getActiveIndicatorHeightD9Ej5fM()), 0.0f, 1, null), false, shape4, navigationDrawerItemColors3.containerColor(z10, composerStartRestartGroup, i27 | ((i19 >> 18) & 112)).getValue().m2518unboximpl(), 0L, 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource2, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, 191488423, true, new p(function6, navigationDrawerItemColors3, z10, i19, function7, label)), composerStartRestartGroup, i27 | (i26 & 112) | ((i28 >> 6) & 57344), ((i28 >> 24) & 14) | 48, 968);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function8 = function6;
                    function9 = function7;
                    shape5 = shape4;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    navigationDrawerItemColors4 = navigationDrawerItemColors6;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            shape3 = ShapesKt.toShape(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i11 & 128) != 0) {
                            navigationDrawerItemColorsM1179colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m1179colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                            i12 &= -29360129;
                        } else {
                            navigationDrawerItemColorsM1179colorsoq7We08 = navigationDrawerItemColors2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        i19 = i12;
                        shape4 = shape3;
                        navigationDrawerItemColors3 = navigationDrawerItemColorsM1179colorsoq7We08;
                        function6 = function4;
                        function7 = function5;
                    } else {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            shape3 = ShapesKt.toShape(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i11 & 128) != 0) {
                            navigationDrawerItemColorsM1179colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m1179colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                            i12 &= -29360129;
                        } else {
                            navigationDrawerItemColorsM1179colorsoq7We08 = navigationDrawerItemColors2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        i19 = i12;
                        shape4 = shape3;
                        navigationDrawerItemColors3 = navigationDrawerItemColorsM1179colorsoq7We08;
                        function6 = function4;
                        function7 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1304626543, i19, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:650)");
                    }
                    int i29 = i19 >> 3;
                    int i210 = i29 & 14;
                    int i211 = i19;
                    NavigationDrawerItemColors navigationDrawerItemColors7 = navigationDrawerItemColors3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m1330Surfaced85dljk(z10, onClick, SizeKt.fillMaxWidth$default(SizeKt.m321height3ABfNKs(SemanticsModifierKt.semantics$default(modifier2, false, o.f10821p0, 1, null), NavigationDrawerTokens.INSTANCE.m1789getActiveIndicatorHeightD9Ej5fM()), 0.0f, 1, null), false, shape4, navigationDrawerItemColors3.containerColor(z10, composerStartRestartGroup, i210 | ((i19 >> 18) & 112)).getValue().m2518unboximpl(), 0L, 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource2, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, 191488423, true, new p(function6, navigationDrawerItemColors3, z10, i19, function7, label)), composerStartRestartGroup, i210 | (i29 & 112) | ((i211 >> 6) & 57344), ((i211 >> 24) & 14) | 48, 968);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function8 = function6;
                    function9 = function7;
                    shape5 = shape4;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    navigationDrawerItemColors4 = navigationDrawerItemColors7;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new q(label, z10, onClick, modifier3, function8, function9, shape5, navigationDrawerItemColors4, mutableInteractionSource3, i10, i11));
            }
            i12 |= 24576;
            function4 = function2;
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((458752 & i10) == 0) {
                    function5 = function3;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((3670016 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        shape2 = shape;
                        if (composerStartRestartGroup.changed(shape2)) {
                        }
                        i12 |= i21;
                    } else {
                        shape2 = shape;
                    }
                    i12 |= i21;
                } else {
                    shape2 = shape;
                }
                if ((29360128 & i10) == 0) {
                    if ((i11 & 128) == 0) {
                        navigationDrawerItemColors2 = navigationDrawerItemColors;
                        if (composerStartRestartGroup.changed(navigationDrawerItemColors2)) {
                        }
                        i12 |= i22;
                    } else {
                        navigationDrawerItemColors2 = navigationDrawerItemColors;
                    }
                    i12 |= i22;
                } else {
                    navigationDrawerItemColors2 = navigationDrawerItemColors;
                }
                i17 = i11 & 256;
                if (i17 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i18 = 33554432;
                    }
                    i12 |= i18;
                }
                if ((i12 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            shape3 = ShapesKt.toShape(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i11 & 128) != 0) {
                            navigationDrawerItemColorsM1179colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m1179colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                            i12 &= -29360129;
                        } else {
                            navigationDrawerItemColorsM1179colorsoq7We08 = navigationDrawerItemColors2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        i19 = i12;
                        shape4 = shape3;
                        navigationDrawerItemColors3 = navigationDrawerItemColorsM1179colorsoq7We08;
                        function6 = function4;
                        function7 = function5;
                    } else {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            shape3 = ShapesKt.toShape(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i11 & 128) != 0) {
                            navigationDrawerItemColorsM1179colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m1179colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                            i12 &= -29360129;
                        } else {
                            navigationDrawerItemColorsM1179colorsoq7We08 = navigationDrawerItemColors2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        i19 = i12;
                        shape4 = shape3;
                        navigationDrawerItemColors3 = navigationDrawerItemColorsM1179colorsoq7We08;
                        function6 = function4;
                        function7 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1304626543, i19, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:650)");
                    }
                    int i212 = i19 >> 3;
                    int i213 = i212 & 14;
                    int i214 = i19;
                    NavigationDrawerItemColors navigationDrawerItemColors8 = navigationDrawerItemColors3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m1330Surfaced85dljk(z10, onClick, SizeKt.fillMaxWidth$default(SizeKt.m321height3ABfNKs(SemanticsModifierKt.semantics$default(modifier2, false, o.f10821p0, 1, null), NavigationDrawerTokens.INSTANCE.m1789getActiveIndicatorHeightD9Ej5fM()), 0.0f, 1, null), false, shape4, navigationDrawerItemColors3.containerColor(z10, composerStartRestartGroup, i213 | ((i19 >> 18) & 112)).getValue().m2518unboximpl(), 0L, 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource2, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, 191488423, true, new p(function6, navigationDrawerItemColors3, z10, i19, function7, label)), composerStartRestartGroup, i213 | (i212 & 112) | ((i214 >> 6) & 57344), ((i214 >> 24) & 14) | 48, 968);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function8 = function6;
                    function9 = function7;
                    shape5 = shape4;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    navigationDrawerItemColors4 = navigationDrawerItemColors8;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            shape3 = ShapesKt.toShape(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i11 & 128) != 0) {
                            navigationDrawerItemColorsM1179colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m1179colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                            i12 &= -29360129;
                        } else {
                            navigationDrawerItemColorsM1179colorsoq7We08 = navigationDrawerItemColors2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        i19 = i12;
                        shape4 = shape3;
                        navigationDrawerItemColors3 = navigationDrawerItemColorsM1179colorsoq7We08;
                        function6 = function4;
                        function7 = function5;
                    } else {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            shape3 = ShapesKt.toShape(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i11 & 128) != 0) {
                            navigationDrawerItemColorsM1179colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m1179colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                            i12 &= -29360129;
                        } else {
                            navigationDrawerItemColorsM1179colorsoq7We08 = navigationDrawerItemColors2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        i19 = i12;
                        shape4 = shape3;
                        navigationDrawerItemColors3 = navigationDrawerItemColorsM1179colorsoq7We08;
                        function6 = function4;
                        function7 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1304626543, i19, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:650)");
                    }
                    int i215 = i19 >> 3;
                    int i216 = i215 & 14;
                    int i217 = i19;
                    NavigationDrawerItemColors navigationDrawerItemColors9 = navigationDrawerItemColors3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m1330Surfaced85dljk(z10, onClick, SizeKt.fillMaxWidth$default(SizeKt.m321height3ABfNKs(SemanticsModifierKt.semantics$default(modifier2, false, o.f10821p0, 1, null), NavigationDrawerTokens.INSTANCE.m1789getActiveIndicatorHeightD9Ej5fM()), 0.0f, 1, null), false, shape4, navigationDrawerItemColors3.containerColor(z10, composerStartRestartGroup, i216 | ((i19 >> 18) & 112)).getValue().m2518unboximpl(), 0L, 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource2, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, 191488423, true, new p(function6, navigationDrawerItemColors3, z10, i19, function7, label)), composerStartRestartGroup, i216 | (i215 & 112) | ((i217 >> 6) & 57344), ((i217 >> 24) & 14) | 48, 968);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function8 = function6;
                    function9 = function7;
                    shape5 = shape4;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    navigationDrawerItemColors4 = navigationDrawerItemColors9;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new q(label, z10, onClick, modifier3, function8, function9, shape5, navigationDrawerItemColors4, mutableInteractionSource3, i10, i11));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function5 = function3;
            if ((3670016 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i12 |= i21;
                } else {
                    shape2 = shape;
                }
                i12 |= i21;
            } else {
                shape2 = shape;
            }
            if ((29360128 & i10) == 0) {
                if ((i11 & 128) == 0) {
                    navigationDrawerItemColors2 = navigationDrawerItemColors;
                    if (composerStartRestartGroup.changed(navigationDrawerItemColors2)) {
                    }
                    i12 |= i22;
                } else {
                    navigationDrawerItemColors2 = navigationDrawerItemColors;
                }
                i12 |= i22;
            } else {
                navigationDrawerItemColors2 = navigationDrawerItemColors;
            }
            i17 = i11 & 256;
            if (i17 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i18 = 33554432;
                }
                i12 |= i18;
            }
            if ((i12 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 64) != 0) {
                        shape3 = ShapesKt.toShape(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i11 & 128) != 0) {
                        navigationDrawerItemColorsM1179colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m1179colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                        i12 &= -29360129;
                    } else {
                        navigationDrawerItemColorsM1179colorsoq7We08 = navigationDrawerItemColors2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    i19 = i12;
                    shape4 = shape3;
                    navigationDrawerItemColors3 = navigationDrawerItemColorsM1179colorsoq7We08;
                    function6 = function4;
                    function7 = function5;
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 64) != 0) {
                        shape3 = ShapesKt.toShape(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i11 & 128) != 0) {
                        navigationDrawerItemColorsM1179colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m1179colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                        i12 &= -29360129;
                    } else {
                        navigationDrawerItemColorsM1179colorsoq7We08 = navigationDrawerItemColors2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    i19 = i12;
                    shape4 = shape3;
                    navigationDrawerItemColors3 = navigationDrawerItemColorsM1179colorsoq7We08;
                    function6 = function4;
                    function7 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1304626543, i19, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:650)");
                }
                int i218 = i19 >> 3;
                int i219 = i218 & 14;
                int i2110 = i19;
                NavigationDrawerItemColors navigationDrawerItemColors10 = navigationDrawerItemColors3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m1330Surfaced85dljk(z10, onClick, SizeKt.fillMaxWidth$default(SizeKt.m321height3ABfNKs(SemanticsModifierKt.semantics$default(modifier2, false, o.f10821p0, 1, null), NavigationDrawerTokens.INSTANCE.m1789getActiveIndicatorHeightD9Ej5fM()), 0.0f, 1, null), false, shape4, navigationDrawerItemColors3.containerColor(z10, composerStartRestartGroup, i219 | ((i19 >> 18) & 112)).getValue().m2518unboximpl(), 0L, 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource2, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, 191488423, true, new p(function6, navigationDrawerItemColors3, z10, i19, function7, label)), composerStartRestartGroup, i219 | (i218 & 112) | ((i2110 >> 6) & 57344), ((i2110 >> 24) & 14) | 48, 968);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                function8 = function6;
                function9 = function7;
                shape5 = shape4;
                mutableInteractionSource3 = mutableInteractionSource2;
                navigationDrawerItemColors4 = navigationDrawerItemColors10;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 64) != 0) {
                        shape3 = ShapesKt.toShape(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i11 & 128) != 0) {
                        navigationDrawerItemColorsM1179colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m1179colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                        i12 &= -29360129;
                    } else {
                        navigationDrawerItemColorsM1179colorsoq7We08 = navigationDrawerItemColors2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    i19 = i12;
                    shape4 = shape3;
                    navigationDrawerItemColors3 = navigationDrawerItemColorsM1179colorsoq7We08;
                    function6 = function4;
                    function7 = function5;
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 64) != 0) {
                        shape3 = ShapesKt.toShape(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i11 & 128) != 0) {
                        navigationDrawerItemColorsM1179colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m1179colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                        i12 &= -29360129;
                    } else {
                        navigationDrawerItemColorsM1179colorsoq7We08 = navigationDrawerItemColors2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    i19 = i12;
                    shape4 = shape3;
                    navigationDrawerItemColors3 = navigationDrawerItemColorsM1179colorsoq7We08;
                    function6 = function4;
                    function7 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1304626543, i19, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:650)");
                }
                int i2111 = i19 >> 3;
                int i2112 = i2111 & 14;
                int i2113 = i19;
                NavigationDrawerItemColors navigationDrawerItemColors11 = navigationDrawerItemColors3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m1330Surfaced85dljk(z10, onClick, SizeKt.fillMaxWidth$default(SizeKt.m321height3ABfNKs(SemanticsModifierKt.semantics$default(modifier2, false, o.f10821p0, 1, null), NavigationDrawerTokens.INSTANCE.m1789getActiveIndicatorHeightD9Ej5fM()), 0.0f, 1, null), false, shape4, navigationDrawerItemColors3.containerColor(z10, composerStartRestartGroup, i2112 | ((i19 >> 18) & 112)).getValue().m2518unboximpl(), 0L, 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource2, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, 191488423, true, new p(function6, navigationDrawerItemColors3, z10, i19, function7, label)), composerStartRestartGroup, i2112 | (i2111 & 112) | ((i2113 >> 6) & 57344), ((i2113 >> 24) & 14) | 48, 968);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                function8 = function6;
                function9 = function7;
                shape5 = shape4;
                mutableInteractionSource3 = mutableInteractionSource2;
                navigationDrawerItemColors4 = navigationDrawerItemColors11;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new q(label, z10, onClick, modifier3, function8, function9, shape5, navigationDrawerItemColors4, mutableInteractionSource3, i10, i11));
        }
        i12 |= 3072;
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 57344) == 0) {
                function4 = function2;
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((458752 & i10) == 0) {
                    function5 = function3;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((3670016 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        shape2 = shape;
                        if (composerStartRestartGroup.changed(shape2)) {
                        }
                        i12 |= i21;
                    } else {
                        shape2 = shape;
                    }
                    i12 |= i21;
                } else {
                    shape2 = shape;
                }
                if ((29360128 & i10) == 0) {
                    if ((i11 & 128) == 0) {
                        navigationDrawerItemColors2 = navigationDrawerItemColors;
                        if (composerStartRestartGroup.changed(navigationDrawerItemColors2)) {
                        }
                        i12 |= i22;
                    } else {
                        navigationDrawerItemColors2 = navigationDrawerItemColors;
                    }
                    i12 |= i22;
                } else {
                    navigationDrawerItemColors2 = navigationDrawerItemColors;
                }
                i17 = i11 & 256;
                if (i17 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i18 = 33554432;
                    }
                    i12 |= i18;
                }
                if ((i12 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            shape3 = ShapesKt.toShape(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i11 & 128) != 0) {
                            navigationDrawerItemColorsM1179colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m1179colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                            i12 &= -29360129;
                        } else {
                            navigationDrawerItemColorsM1179colorsoq7We08 = navigationDrawerItemColors2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        i19 = i12;
                        shape4 = shape3;
                        navigationDrawerItemColors3 = navigationDrawerItemColorsM1179colorsoq7We08;
                        function6 = function4;
                        function7 = function5;
                    } else {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            shape3 = ShapesKt.toShape(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i11 & 128) != 0) {
                            navigationDrawerItemColorsM1179colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m1179colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                            i12 &= -29360129;
                        } else {
                            navigationDrawerItemColorsM1179colorsoq7We08 = navigationDrawerItemColors2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        i19 = i12;
                        shape4 = shape3;
                        navigationDrawerItemColors3 = navigationDrawerItemColorsM1179colorsoq7We08;
                        function6 = function4;
                        function7 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1304626543, i19, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:650)");
                    }
                    int i2114 = i19 >> 3;
                    int i2115 = i2114 & 14;
                    int i2116 = i19;
                    NavigationDrawerItemColors navigationDrawerItemColors12 = navigationDrawerItemColors3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m1330Surfaced85dljk(z10, onClick, SizeKt.fillMaxWidth$default(SizeKt.m321height3ABfNKs(SemanticsModifierKt.semantics$default(modifier2, false, o.f10821p0, 1, null), NavigationDrawerTokens.INSTANCE.m1789getActiveIndicatorHeightD9Ej5fM()), 0.0f, 1, null), false, shape4, navigationDrawerItemColors3.containerColor(z10, composerStartRestartGroup, i2115 | ((i19 >> 18) & 112)).getValue().m2518unboximpl(), 0L, 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource2, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, 191488423, true, new p(function6, navigationDrawerItemColors3, z10, i19, function7, label)), composerStartRestartGroup, i2115 | (i2114 & 112) | ((i2116 >> 6) & 57344), ((i2116 >> 24) & 14) | 48, 968);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function8 = function6;
                    function9 = function7;
                    shape5 = shape4;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    navigationDrawerItemColors4 = navigationDrawerItemColors12;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            shape3 = ShapesKt.toShape(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i11 & 128) != 0) {
                            navigationDrawerItemColorsM1179colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m1179colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                            i12 &= -29360129;
                        } else {
                            navigationDrawerItemColorsM1179colorsoq7We08 = navigationDrawerItemColors2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        i19 = i12;
                        shape4 = shape3;
                        navigationDrawerItemColors3 = navigationDrawerItemColorsM1179colorsoq7We08;
                        function6 = function4;
                        function7 = function5;
                    } else {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 64) != 0) {
                            shape3 = ShapesKt.toShape(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                            i12 &= -3670017;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i11 & 128) != 0) {
                            navigationDrawerItemColorsM1179colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m1179colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                            i12 &= -29360129;
                        } else {
                            navigationDrawerItemColorsM1179colorsoq7We08 = navigationDrawerItemColors2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        i19 = i12;
                        shape4 = shape3;
                        navigationDrawerItemColors3 = navigationDrawerItemColorsM1179colorsoq7We08;
                        function6 = function4;
                        function7 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1304626543, i19, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:650)");
                    }
                    int i2117 = i19 >> 3;
                    int i2118 = i2117 & 14;
                    int i2119 = i19;
                    NavigationDrawerItemColors navigationDrawerItemColors13 = navigationDrawerItemColors3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m1330Surfaced85dljk(z10, onClick, SizeKt.fillMaxWidth$default(SizeKt.m321height3ABfNKs(SemanticsModifierKt.semantics$default(modifier2, false, o.f10821p0, 1, null), NavigationDrawerTokens.INSTANCE.m1789getActiveIndicatorHeightD9Ej5fM()), 0.0f, 1, null), false, shape4, navigationDrawerItemColors3.containerColor(z10, composerStartRestartGroup, i2118 | ((i19 >> 18) & 112)).getValue().m2518unboximpl(), 0L, 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource2, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, 191488423, true, new p(function6, navigationDrawerItemColors3, z10, i19, function7, label)), composerStartRestartGroup, i2118 | (i2117 & 112) | ((i2119 >> 6) & 57344), ((i2119 >> 24) & 14) | 48, 968);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    function8 = function6;
                    function9 = function7;
                    shape5 = shape4;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    navigationDrawerItemColors4 = navigationDrawerItemColors13;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new q(label, z10, onClick, modifier3, function8, function9, shape5, navigationDrawerItemColors4, mutableInteractionSource3, i10, i11));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function5 = function3;
            if ((3670016 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i12 |= i21;
                } else {
                    shape2 = shape;
                }
                i12 |= i21;
            } else {
                shape2 = shape;
            }
            if ((29360128 & i10) == 0) {
                if ((i11 & 128) == 0) {
                    navigationDrawerItemColors2 = navigationDrawerItemColors;
                    if (composerStartRestartGroup.changed(navigationDrawerItemColors2)) {
                    }
                    i12 |= i22;
                } else {
                    navigationDrawerItemColors2 = navigationDrawerItemColors;
                }
                i12 |= i22;
            } else {
                navigationDrawerItemColors2 = navigationDrawerItemColors;
            }
            i17 = i11 & 256;
            if (i17 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i18 = 33554432;
                }
                i12 |= i18;
            }
            if ((i12 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 64) != 0) {
                        shape3 = ShapesKt.toShape(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i11 & 128) != 0) {
                        navigationDrawerItemColorsM1179colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m1179colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                        i12 &= -29360129;
                    } else {
                        navigationDrawerItemColorsM1179colorsoq7We08 = navigationDrawerItemColors2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    i19 = i12;
                    shape4 = shape3;
                    navigationDrawerItemColors3 = navigationDrawerItemColorsM1179colorsoq7We08;
                    function6 = function4;
                    function7 = function5;
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 64) != 0) {
                        shape3 = ShapesKt.toShape(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i11 & 128) != 0) {
                        navigationDrawerItemColorsM1179colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m1179colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                        i12 &= -29360129;
                    } else {
                        navigationDrawerItemColorsM1179colorsoq7We08 = navigationDrawerItemColors2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    i19 = i12;
                    shape4 = shape3;
                    navigationDrawerItemColors3 = navigationDrawerItemColorsM1179colorsoq7We08;
                    function6 = function4;
                    function7 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1304626543, i19, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:650)");
                }
                int i21110 = i19 >> 3;
                int i21111 = i21110 & 14;
                int i21112 = i19;
                NavigationDrawerItemColors navigationDrawerItemColors14 = navigationDrawerItemColors3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m1330Surfaced85dljk(z10, onClick, SizeKt.fillMaxWidth$default(SizeKt.m321height3ABfNKs(SemanticsModifierKt.semantics$default(modifier2, false, o.f10821p0, 1, null), NavigationDrawerTokens.INSTANCE.m1789getActiveIndicatorHeightD9Ej5fM()), 0.0f, 1, null), false, shape4, navigationDrawerItemColors3.containerColor(z10, composerStartRestartGroup, i21111 | ((i19 >> 18) & 112)).getValue().m2518unboximpl(), 0L, 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource2, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, 191488423, true, new p(function6, navigationDrawerItemColors3, z10, i19, function7, label)), composerStartRestartGroup, i21111 | (i21110 & 112) | ((i21112 >> 6) & 57344), ((i21112 >> 24) & 14) | 48, 968);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                function8 = function6;
                function9 = function7;
                shape5 = shape4;
                mutableInteractionSource3 = mutableInteractionSource2;
                navigationDrawerItemColors4 = navigationDrawerItemColors14;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 64) != 0) {
                        shape3 = ShapesKt.toShape(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i11 & 128) != 0) {
                        navigationDrawerItemColorsM1179colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m1179colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                        i12 &= -29360129;
                    } else {
                        navigationDrawerItemColorsM1179colorsoq7We08 = navigationDrawerItemColors2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    i19 = i12;
                    shape4 = shape3;
                    navigationDrawerItemColors3 = navigationDrawerItemColorsM1179colorsoq7We08;
                    function6 = function4;
                    function7 = function5;
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 64) != 0) {
                        shape3 = ShapesKt.toShape(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i11 & 128) != 0) {
                        navigationDrawerItemColorsM1179colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m1179colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                        i12 &= -29360129;
                    } else {
                        navigationDrawerItemColorsM1179colorsoq7We08 = navigationDrawerItemColors2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    i19 = i12;
                    shape4 = shape3;
                    navigationDrawerItemColors3 = navigationDrawerItemColorsM1179colorsoq7We08;
                    function6 = function4;
                    function7 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1304626543, i19, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:650)");
                }
                int i21113 = i19 >> 3;
                int i21114 = i21113 & 14;
                int i21115 = i19;
                NavigationDrawerItemColors navigationDrawerItemColors15 = navigationDrawerItemColors3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m1330Surfaced85dljk(z10, onClick, SizeKt.fillMaxWidth$default(SizeKt.m321height3ABfNKs(SemanticsModifierKt.semantics$default(modifier2, false, o.f10821p0, 1, null), NavigationDrawerTokens.INSTANCE.m1789getActiveIndicatorHeightD9Ej5fM()), 0.0f, 1, null), false, shape4, navigationDrawerItemColors3.containerColor(z10, composerStartRestartGroup, i21114 | ((i19 >> 18) & 112)).getValue().m2518unboximpl(), 0L, 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource2, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, 191488423, true, new p(function6, navigationDrawerItemColors3, z10, i19, function7, label)), composerStartRestartGroup, i21114 | (i21113 & 112) | ((i21115 >> 6) & 57344), ((i21115 >> 24) & 14) | 48, 968);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                function8 = function6;
                function9 = function7;
                shape5 = shape4;
                mutableInteractionSource3 = mutableInteractionSource2;
                navigationDrawerItemColors4 = navigationDrawerItemColors15;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new q(label, z10, onClick, modifier3, function8, function9, shape5, navigationDrawerItemColors4, mutableInteractionSource3, i10, i11));
        }
        i12 |= 24576;
        function4 = function2;
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((458752 & i10) == 0) {
                function5 = function3;
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((3670016 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i12 |= i21;
                } else {
                    shape2 = shape;
                }
                i12 |= i21;
            } else {
                shape2 = shape;
            }
            if ((29360128 & i10) == 0) {
                if ((i11 & 128) == 0) {
                    navigationDrawerItemColors2 = navigationDrawerItemColors;
                    if (composerStartRestartGroup.changed(navigationDrawerItemColors2)) {
                    }
                    i12 |= i22;
                } else {
                    navigationDrawerItemColors2 = navigationDrawerItemColors;
                }
                i12 |= i22;
            } else {
                navigationDrawerItemColors2 = navigationDrawerItemColors;
            }
            i17 = i11 & 256;
            if (i17 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i18 = 33554432;
                }
                i12 |= i18;
            }
            if ((i12 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 64) != 0) {
                        shape3 = ShapesKt.toShape(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i11 & 128) != 0) {
                        navigationDrawerItemColorsM1179colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m1179colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                        i12 &= -29360129;
                    } else {
                        navigationDrawerItemColorsM1179colorsoq7We08 = navigationDrawerItemColors2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    i19 = i12;
                    shape4 = shape3;
                    navigationDrawerItemColors3 = navigationDrawerItemColorsM1179colorsoq7We08;
                    function6 = function4;
                    function7 = function5;
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 64) != 0) {
                        shape3 = ShapesKt.toShape(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i11 & 128) != 0) {
                        navigationDrawerItemColorsM1179colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m1179colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                        i12 &= -29360129;
                    } else {
                        navigationDrawerItemColorsM1179colorsoq7We08 = navigationDrawerItemColors2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    i19 = i12;
                    shape4 = shape3;
                    navigationDrawerItemColors3 = navigationDrawerItemColorsM1179colorsoq7We08;
                    function6 = function4;
                    function7 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1304626543, i19, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:650)");
                }
                int i21116 = i19 >> 3;
                int i21117 = i21116 & 14;
                int i21118 = i19;
                NavigationDrawerItemColors navigationDrawerItemColors16 = navigationDrawerItemColors3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m1330Surfaced85dljk(z10, onClick, SizeKt.fillMaxWidth$default(SizeKt.m321height3ABfNKs(SemanticsModifierKt.semantics$default(modifier2, false, o.f10821p0, 1, null), NavigationDrawerTokens.INSTANCE.m1789getActiveIndicatorHeightD9Ej5fM()), 0.0f, 1, null), false, shape4, navigationDrawerItemColors3.containerColor(z10, composerStartRestartGroup, i21117 | ((i19 >> 18) & 112)).getValue().m2518unboximpl(), 0L, 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource2, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, 191488423, true, new p(function6, navigationDrawerItemColors3, z10, i19, function7, label)), composerStartRestartGroup, i21117 | (i21116 & 112) | ((i21118 >> 6) & 57344), ((i21118 >> 24) & 14) | 48, 968);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                function8 = function6;
                function9 = function7;
                shape5 = shape4;
                mutableInteractionSource3 = mutableInteractionSource2;
                navigationDrawerItemColors4 = navigationDrawerItemColors16;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 64) != 0) {
                        shape3 = ShapesKt.toShape(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i11 & 128) != 0) {
                        navigationDrawerItemColorsM1179colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m1179colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                        i12 &= -29360129;
                    } else {
                        navigationDrawerItemColorsM1179colorsoq7We08 = navigationDrawerItemColors2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    i19 = i12;
                    shape4 = shape3;
                    navigationDrawerItemColors3 = navigationDrawerItemColorsM1179colorsoq7We08;
                    function6 = function4;
                    function7 = function5;
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 64) != 0) {
                        shape3 = ShapesKt.toShape(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                        i12 &= -3670017;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i11 & 128) != 0) {
                        navigationDrawerItemColorsM1179colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m1179colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                        i12 &= -29360129;
                    } else {
                        navigationDrawerItemColorsM1179colorsoq7We08 = navigationDrawerItemColors2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    i19 = i12;
                    shape4 = shape3;
                    navigationDrawerItemColors3 = navigationDrawerItemColorsM1179colorsoq7We08;
                    function6 = function4;
                    function7 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1304626543, i19, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:650)");
                }
                int i21119 = i19 >> 3;
                int i211110 = i21119 & 14;
                int i211111 = i19;
                NavigationDrawerItemColors navigationDrawerItemColors17 = navigationDrawerItemColors3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m1330Surfaced85dljk(z10, onClick, SizeKt.fillMaxWidth$default(SizeKt.m321height3ABfNKs(SemanticsModifierKt.semantics$default(modifier2, false, o.f10821p0, 1, null), NavigationDrawerTokens.INSTANCE.m1789getActiveIndicatorHeightD9Ej5fM()), 0.0f, 1, null), false, shape4, navigationDrawerItemColors3.containerColor(z10, composerStartRestartGroup, i211110 | ((i19 >> 18) & 112)).getValue().m2518unboximpl(), 0L, 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource2, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, 191488423, true, new p(function6, navigationDrawerItemColors3, z10, i19, function7, label)), composerStartRestartGroup, i211110 | (i21119 & 112) | ((i211111 >> 6) & 57344), ((i211111 >> 24) & 14) | 48, 968);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                function8 = function6;
                function9 = function7;
                shape5 = shape4;
                mutableInteractionSource3 = mutableInteractionSource2;
                navigationDrawerItemColors4 = navigationDrawerItemColors17;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new q(label, z10, onClick, modifier3, function8, function9, shape5, navigationDrawerItemColors4, mutableInteractionSource3, i10, i11));
        }
        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        function5 = function3;
        if ((3670016 & i10) == 0) {
            if ((i11 & 64) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i12 |= i21;
            } else {
                shape2 = shape;
            }
            i12 |= i21;
        } else {
            shape2 = shape;
        }
        if ((29360128 & i10) == 0) {
            if ((i11 & 128) == 0) {
                navigationDrawerItemColors2 = navigationDrawerItemColors;
                if (composerStartRestartGroup.changed(navigationDrawerItemColors2)) {
                }
                i12 |= i22;
            } else {
                navigationDrawerItemColors2 = navigationDrawerItemColors;
            }
            i12 |= i22;
        } else {
            navigationDrawerItemColors2 = navigationDrawerItemColors;
        }
        i17 = i11 & 256;
        if (i17 != 0) {
            i12 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                i18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i18 = 33554432;
            }
            i12 |= i18;
        }
        if ((i12 & 191739611) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    function4 = null;
                }
                if (i15 != 0) {
                    function5 = null;
                }
                if ((i11 & 64) != 0) {
                    shape3 = ShapesKt.toShape(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                    i12 &= -3670017;
                } else {
                    shape3 = shape2;
                }
                if ((i11 & 128) != 0) {
                    navigationDrawerItemColorsM1179colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m1179colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                    i12 &= -29360129;
                } else {
                    navigationDrawerItemColorsM1179colorsoq7We08 = navigationDrawerItemColors2;
                }
                if (i17 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                i19 = i12;
                shape4 = shape3;
                navigationDrawerItemColors3 = navigationDrawerItemColorsM1179colorsoq7We08;
                function6 = function4;
                function7 = function5;
            } else {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    function4 = null;
                }
                if (i15 != 0) {
                    function5 = null;
                }
                if ((i11 & 64) != 0) {
                    shape3 = ShapesKt.toShape(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                    i12 &= -3670017;
                } else {
                    shape3 = shape2;
                }
                if ((i11 & 128) != 0) {
                    navigationDrawerItemColorsM1179colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m1179colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                    i12 &= -29360129;
                } else {
                    navigationDrawerItemColorsM1179colorsoq7We08 = navigationDrawerItemColors2;
                }
                if (i17 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                i19 = i12;
                shape4 = shape3;
                navigationDrawerItemColors3 = navigationDrawerItemColorsM1179colorsoq7We08;
                function6 = function4;
                function7 = function5;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1304626543, i19, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:650)");
            }
            int i211112 = i19 >> 3;
            int i211113 = i211112 & 14;
            int i211114 = i19;
            NavigationDrawerItemColors navigationDrawerItemColors18 = navigationDrawerItemColors3;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m1330Surfaced85dljk(z10, onClick, SizeKt.fillMaxWidth$default(SizeKt.m321height3ABfNKs(SemanticsModifierKt.semantics$default(modifier2, false, o.f10821p0, 1, null), NavigationDrawerTokens.INSTANCE.m1789getActiveIndicatorHeightD9Ej5fM()), 0.0f, 1, null), false, shape4, navigationDrawerItemColors3.containerColor(z10, composerStartRestartGroup, i211113 | ((i19 >> 18) & 112)).getValue().m2518unboximpl(), 0L, 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource2, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, 191488423, true, new p(function6, navigationDrawerItemColors3, z10, i19, function7, label)), composerStartRestartGroup, i211113 | (i211112 & 112) | ((i211114 >> 6) & 57344), ((i211114 >> 24) & 14) | 48, 968);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            function8 = function6;
            function9 = function7;
            shape5 = shape4;
            mutableInteractionSource3 = mutableInteractionSource2;
            navigationDrawerItemColors4 = navigationDrawerItemColors18;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    function4 = null;
                }
                if (i15 != 0) {
                    function5 = null;
                }
                if ((i11 & 64) != 0) {
                    shape3 = ShapesKt.toShape(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                    i12 &= -3670017;
                } else {
                    shape3 = shape2;
                }
                if ((i11 & 128) != 0) {
                    navigationDrawerItemColorsM1179colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m1179colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                    i12 &= -29360129;
                } else {
                    navigationDrawerItemColorsM1179colorsoq7We08 = navigationDrawerItemColors2;
                }
                if (i17 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                i19 = i12;
                shape4 = shape3;
                navigationDrawerItemColors3 = navigationDrawerItemColorsM1179colorsoq7We08;
                function6 = function4;
                function7 = function5;
            } else {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    function4 = null;
                }
                if (i15 != 0) {
                    function5 = null;
                }
                if ((i11 & 64) != 0) {
                    shape3 = ShapesKt.toShape(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                    i12 &= -3670017;
                } else {
                    shape3 = shape2;
                }
                if ((i11 & 128) != 0) {
                    navigationDrawerItemColorsM1179colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m1179colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                    i12 &= -29360129;
                } else {
                    navigationDrawerItemColorsM1179colorsoq7We08 = navigationDrawerItemColors2;
                }
                if (i17 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                i19 = i12;
                shape4 = shape3;
                navigationDrawerItemColors3 = navigationDrawerItemColorsM1179colorsoq7We08;
                function6 = function4;
                function7 = function5;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1304626543, i19, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:650)");
            }
            int i211115 = i19 >> 3;
            int i211116 = i211115 & 14;
            int i211117 = i19;
            NavigationDrawerItemColors navigationDrawerItemColors19 = navigationDrawerItemColors3;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m1330Surfaced85dljk(z10, onClick, SizeKt.fillMaxWidth$default(SizeKt.m321height3ABfNKs(SemanticsModifierKt.semantics$default(modifier2, false, o.f10821p0, 1, null), NavigationDrawerTokens.INSTANCE.m1789getActiveIndicatorHeightD9Ej5fM()), 0.0f, 1, null), false, shape4, navigationDrawerItemColors3.containerColor(z10, composerStartRestartGroup, i211116 | ((i19 >> 18) & 112)).getValue().m2518unboximpl(), 0L, 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource2, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, 191488423, true, new p(function6, navigationDrawerItemColors3, z10, i19, function7, label)), composerStartRestartGroup, i211116 | (i211115 & 112) | ((i211117 >> 6) & 57344), ((i211117 >> 24) & 14) | 48, 968);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            function8 = function6;
            function9 = function7;
            shape5 = shape4;
            mutableInteractionSource3 = mutableInteractionSource2;
            navigationDrawerItemColors4 = navigationDrawerItemColors19;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new q(label, z10, onClick, modifier3, function8, function9, shape5, navigationDrawerItemColors4, mutableInteractionSource3, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0130  */
    /* JADX WARN: Code duplicated, block: B:105:0x0139  */
    /* JADX WARN: Code duplicated, block: B:108:0x0149  */
    /* JADX WARN: Code duplicated, block: B:110:0x0156  */
    /* JADX WARN: Code duplicated, block: B:113:0x0161  */
    /* JADX WARN: Code duplicated, block: B:115:0x0177  */
    /* JADX WARN: Code duplicated, block: B:118:0x0189  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:123:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:126:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:131:0x020c  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:98:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0129  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: PermanentDrawerSheet-afqeVBk, reason: not valid java name */
    public static final void m1183PermanentDrawerSheetafqeVBk(@Nullable Modifier modifier, @Nullable Shape shape, long j10, long j11, float f6, @Nullable WindowInsets windowInsets, @NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Shape rectangleShape;
        long jM978getSurface0d7_KjU;
        long jM1014contentColorForek8zF_U;
        int i13;
        float fM1089getPermanentDrawerElevationD9Ej5fM;
        int i14;
        WindowInsets windowInsets2;
        int i15;
        Modifier modifier2;
        WindowInsets windowInsets3;
        float f10;
        Modifier modifier3;
        String strM1320getStringNWtq28;
        boolean zChanged;
        Object objRememberedValue;
        Modifier modifier4;
        Shape shape2;
        long j12;
        long j13;
        float f11;
        WindowInsets windowInsets4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i16;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1733353241);
        int i17 = i11 & 1;
        if (i17 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 112) == 0) {
                rectangleShape = shape;
                i12 |= composerStartRestartGroup.changed(rectangleShape) ? 32 : 16;
            }
            if ((i10 & 896) == 0) {
                if ((i11 & 4) == 0) {
                    jM978getSurface0d7_KjU = j10;
                    int i19 = composerStartRestartGroup.changed(jM978getSurface0d7_KjU) ? 256 : 128;
                    i12 |= i19;
                } else {
                    jM978getSurface0d7_KjU = j10;
                }
                i12 |= i19;
            } else {
                jM978getSurface0d7_KjU = j10;
            }
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    jM1014contentColorForek8zF_U = j11;
                    int i20 = composerStartRestartGroup.changed(jM1014contentColorForek8zF_U) ? 2048 : 1024;
                    i12 |= i20;
                } else {
                    jM1014contentColorForek8zF_U = j11;
                }
                i12 |= i20;
            } else {
                jM1014contentColorForek8zF_U = j11;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 57344) == 0) {
                    fM1089getPermanentDrawerElevationD9Ej5fM = f6;
                    if (composerStartRestartGroup.changed(fM1089getPermanentDrawerElevationD9Ej5fM)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                if ((i10 & 458752) == 0) {
                    windowInsets2 = windowInsets;
                    if ((i11 & 32) == 0 || !composerStartRestartGroup.changed(windowInsets2)) {
                        i16 = 65536;
                    } else {
                        i16 = 131072;
                    }
                    i12 |= i16;
                } else {
                    windowInsets2 = windowInsets;
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                    }
                    if ((i12 & 2995931) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i17 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i18 != 0) {
                                rectangleShape = RectangleShapeKt.getRectangleShape();
                            }
                            if ((i11 & 4) != 0) {
                                jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                                i12 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                                i12 &= -7169;
                            }
                            if (i13 != 0) {
                                fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                            } else {
                                windowInsets3 = windowInsets2;
                            }
                            f10 = fM1089getPermanentDrawerElevationD9Ej5fM;
                            modifier3 = modifier2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 4) != 0) {
                                i12 &= -897;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            rectangleShape = rectangleShape;
                            jM978getSurface0d7_KjU = jM978getSurface0d7_KjU;
                            jM1014contentColorForek8zF_U = jM1014contentColorForek8zF_U;
                            windowInsets3 = windowInsets2;
                            f10 = fM1089getPermanentDrawerElevationD9Ej5fM;
                            modifier3 = modifier;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1733353241, i12, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:528)");
                        }
                        strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new r(strM1320getStringNWtq28);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifier3, false, (Function1) objRememberedValue, 1, null);
                        int i21 = i12 << 3;
                        a(windowInsets3, modifierSemantics$default, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i21 & 896) | (i21 & 7168) | (57344 & i21) | (i21 & 458752) | (i12 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        shape2 = rectangleShape;
                        j12 = jM978getSurface0d7_KjU;
                        j13 = jM1014contentColorForek8zF_U;
                        f11 = f10;
                        windowInsets4 = windowInsets3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        shape2 = rectangleShape;
                        j12 = jM978getSurface0d7_KjU;
                        j13 = jM1014contentColorForek8zF_U;
                        windowInsets4 = windowInsets2;
                        f11 = fM1089getPermanentDrawerElevationD9Ej5fM;
                        modifier4 = modifier;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new s(f11, i10, i11, j12, j13, windowInsets4, modifier4, shape2, content));
                }
                i15 = 1572864;
                i12 |= i15;
                if ((i12 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i18 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                        if ((i11 & 4) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        } else {
                            windowInsets3 = windowInsets2;
                        }
                        f10 = fM1089getPermanentDrawerElevationD9Ej5fM;
                        modifier3 = modifier2;
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i18 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                        if ((i11 & 4) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        } else {
                            windowInsets3 = windowInsets2;
                        }
                        f10 = fM1089getPermanentDrawerElevationD9Ej5fM;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1733353241, i12, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:528)");
                    }
                    strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new r(strM1320getStringNWtq28);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new r(strM1320getStringNWtq28);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics$default2 = SemanticsModifierKt.semantics$default(modifier3, false, (Function1) objRememberedValue, 1, null);
                    int i22 = i12 << 3;
                    a(windowInsets3, modifierSemantics$default2, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i22 & 896) | (i22 & 7168) | (57344 & i22) | (i22 & 458752) | (i12 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape2 = rectangleShape;
                    j12 = jM978getSurface0d7_KjU;
                    j13 = jM1014contentColorForek8zF_U;
                    f11 = f10;
                    windowInsets4 = windowInsets3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i18 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                        if ((i11 & 4) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        } else {
                            windowInsets3 = windowInsets2;
                        }
                        f10 = fM1089getPermanentDrawerElevationD9Ej5fM;
                        modifier3 = modifier2;
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i18 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                        if ((i11 & 4) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        } else {
                            windowInsets3 = windowInsets2;
                        }
                        f10 = fM1089getPermanentDrawerElevationD9Ej5fM;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1733353241, i12, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:528)");
                    }
                    strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new r(strM1320getStringNWtq28);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new r(strM1320getStringNWtq28);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics$default3 = SemanticsModifierKt.semantics$default(modifier3, false, (Function1) objRememberedValue, 1, null);
                    int i23 = i12 << 3;
                    a(windowInsets3, modifierSemantics$default3, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i23 & 896) | (i23 & 7168) | (57344 & i23) | (i23 & 458752) | (i12 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape2 = rectangleShape;
                    j12 = jM978getSurface0d7_KjU;
                    j13 = jM1014contentColorForek8zF_U;
                    f11 = f10;
                    windowInsets4 = windowInsets3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new s(f11, i10, i11, j12, j13, windowInsets4, modifier4, shape2, content));
            }
            i12 |= 24576;
            fM1089getPermanentDrawerElevationD9Ej5fM = f6;
            if ((i10 & 458752) == 0) {
                windowInsets2 = windowInsets;
                if ((i11 & 32) == 0) {
                    i16 = 65536;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            } else {
                windowInsets2 = windowInsets;
            }
            if ((i11 & 64) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                }
                if ((i12 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i18 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                        if ((i11 & 4) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        } else {
                            windowInsets3 = windowInsets2;
                        }
                        f10 = fM1089getPermanentDrawerElevationD9Ej5fM;
                        modifier3 = modifier2;
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i18 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                        if ((i11 & 4) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        } else {
                            windowInsets3 = windowInsets2;
                        }
                        f10 = fM1089getPermanentDrawerElevationD9Ej5fM;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1733353241, i12, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:528)");
                    }
                    strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new r(strM1320getStringNWtq28);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new r(strM1320getStringNWtq28);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics$default4 = SemanticsModifierKt.semantics$default(modifier3, false, (Function1) objRememberedValue, 1, null);
                    int i24 = i12 << 3;
                    a(windowInsets3, modifierSemantics$default4, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i24 & 896) | (i24 & 7168) | (57344 & i24) | (i24 & 458752) | (i12 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape2 = rectangleShape;
                    j12 = jM978getSurface0d7_KjU;
                    j13 = jM1014contentColorForek8zF_U;
                    f11 = f10;
                    windowInsets4 = windowInsets3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i18 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                        if ((i11 & 4) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        } else {
                            windowInsets3 = windowInsets2;
                        }
                        f10 = fM1089getPermanentDrawerElevationD9Ej5fM;
                        modifier3 = modifier2;
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i18 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                        if ((i11 & 4) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        } else {
                            windowInsets3 = windowInsets2;
                        }
                        f10 = fM1089getPermanentDrawerElevationD9Ej5fM;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1733353241, i12, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:528)");
                    }
                    strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new r(strM1320getStringNWtq28);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new r(strM1320getStringNWtq28);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics$default5 = SemanticsModifierKt.semantics$default(modifier3, false, (Function1) objRememberedValue, 1, null);
                    int i25 = i12 << 3;
                    a(windowInsets3, modifierSemantics$default5, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (i25 & 458752) | (i12 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape2 = rectangleShape;
                    j12 = jM978getSurface0d7_KjU;
                    j13 = jM1014contentColorForek8zF_U;
                    f11 = f10;
                    windowInsets4 = windowInsets3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new s(f11, i10, i11, j12, j13, windowInsets4, modifier4, shape2, content));
            }
            i15 = 1572864;
            i12 |= i15;
            if ((i12 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    } else {
                        windowInsets3 = windowInsets2;
                    }
                    f10 = fM1089getPermanentDrawerElevationD9Ej5fM;
                    modifier3 = modifier2;
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    } else {
                        windowInsets3 = windowInsets2;
                    }
                    f10 = fM1089getPermanentDrawerElevationD9Ej5fM;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1733353241, i12, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:528)");
                }
                strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new r(strM1320getStringNWtq28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new r(strM1320getStringNWtq28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics$default6 = SemanticsModifierKt.semantics$default(modifier3, false, (Function1) objRememberedValue, 1, null);
                int i26 = i12 << 3;
                a(windowInsets3, modifierSemantics$default6, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i26 & 896) | (i26 & 7168) | (57344 & i26) | (i26 & 458752) | (i12 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape2 = rectangleShape;
                j12 = jM978getSurface0d7_KjU;
                j13 = jM1014contentColorForek8zF_U;
                f11 = f10;
                windowInsets4 = windowInsets3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    } else {
                        windowInsets3 = windowInsets2;
                    }
                    f10 = fM1089getPermanentDrawerElevationD9Ej5fM;
                    modifier3 = modifier2;
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    } else {
                        windowInsets3 = windowInsets2;
                    }
                    f10 = fM1089getPermanentDrawerElevationD9Ej5fM;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1733353241, i12, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:528)");
                }
                strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new r(strM1320getStringNWtq28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new r(strM1320getStringNWtq28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics$default7 = SemanticsModifierKt.semantics$default(modifier3, false, (Function1) objRememberedValue, 1, null);
                int i27 = i12 << 3;
                a(windowInsets3, modifierSemantics$default7, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i27 & 896) | (i27 & 7168) | (57344 & i27) | (i27 & 458752) | (i12 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape2 = rectangleShape;
                j12 = jM978getSurface0d7_KjU;
                j13 = jM1014contentColorForek8zF_U;
                f11 = f10;
                windowInsets4 = windowInsets3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new s(f11, i10, i11, j12, j13, windowInsets4, modifier4, shape2, content));
        }
        i12 |= 48;
        rectangleShape = shape;
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                jM978getSurface0d7_KjU = j10;
                if (composerStartRestartGroup.changed(jM978getSurface0d7_KjU)) {
                }
                i12 |= i19;
            } else {
                jM978getSurface0d7_KjU = j10;
            }
            i12 |= i19;
        } else {
            jM978getSurface0d7_KjU = j10;
        }
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                jM1014contentColorForek8zF_U = j11;
                if (composerStartRestartGroup.changed(jM1014contentColorForek8zF_U)) {
                }
                i12 |= i20;
            } else {
                jM1014contentColorForek8zF_U = j11;
            }
            i12 |= i20;
        } else {
            jM1014contentColorForek8zF_U = j11;
        }
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 57344) == 0) {
                fM1089getPermanentDrawerElevationD9Ej5fM = f6;
                if (composerStartRestartGroup.changed(fM1089getPermanentDrawerElevationD9Ej5fM)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((i10 & 458752) == 0) {
                windowInsets2 = windowInsets;
                if ((i11 & 32) == 0) {
                    i16 = 65536;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            } else {
                windowInsets2 = windowInsets;
            }
            if ((i11 & 64) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                }
                if ((i12 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i18 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                        if ((i11 & 4) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        } else {
                            windowInsets3 = windowInsets2;
                        }
                        f10 = fM1089getPermanentDrawerElevationD9Ej5fM;
                        modifier3 = modifier2;
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i18 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                        if ((i11 & 4) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        } else {
                            windowInsets3 = windowInsets2;
                        }
                        f10 = fM1089getPermanentDrawerElevationD9Ej5fM;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1733353241, i12, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:528)");
                    }
                    strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new r(strM1320getStringNWtq28);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new r(strM1320getStringNWtq28);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics$default8 = SemanticsModifierKt.semantics$default(modifier3, false, (Function1) objRememberedValue, 1, null);
                    int i28 = i12 << 3;
                    a(windowInsets3, modifierSemantics$default8, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i28 & 896) | (i28 & 7168) | (57344 & i28) | (i28 & 458752) | (i12 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape2 = rectangleShape;
                    j12 = jM978getSurface0d7_KjU;
                    j13 = jM1014contentColorForek8zF_U;
                    f11 = f10;
                    windowInsets4 = windowInsets3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i18 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                        if ((i11 & 4) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        } else {
                            windowInsets3 = windowInsets2;
                        }
                        f10 = fM1089getPermanentDrawerElevationD9Ej5fM;
                        modifier3 = modifier2;
                    } else {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i18 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                        if ((i11 & 4) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -897;
                        }
                        if ((i11 & 8) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        } else {
                            windowInsets3 = windowInsets2;
                        }
                        f10 = fM1089getPermanentDrawerElevationD9Ej5fM;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1733353241, i12, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:528)");
                    }
                    strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new r(strM1320getStringNWtq28);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new r(strM1320getStringNWtq28);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics$default9 = SemanticsModifierKt.semantics$default(modifier3, false, (Function1) objRememberedValue, 1, null);
                    int i29 = i12 << 3;
                    a(windowInsets3, modifierSemantics$default9, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (i29 & 458752) | (i12 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape2 = rectangleShape;
                    j12 = jM978getSurface0d7_KjU;
                    j13 = jM1014contentColorForek8zF_U;
                    f11 = f10;
                    windowInsets4 = windowInsets3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new s(f11, i10, i11, j12, j13, windowInsets4, modifier4, shape2, content));
            }
            i15 = 1572864;
            i12 |= i15;
            if ((i12 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    } else {
                        windowInsets3 = windowInsets2;
                    }
                    f10 = fM1089getPermanentDrawerElevationD9Ej5fM;
                    modifier3 = modifier2;
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    } else {
                        windowInsets3 = windowInsets2;
                    }
                    f10 = fM1089getPermanentDrawerElevationD9Ej5fM;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1733353241, i12, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:528)");
                }
                strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new r(strM1320getStringNWtq28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new r(strM1320getStringNWtq28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics$default10 = SemanticsModifierKt.semantics$default(modifier3, false, (Function1) objRememberedValue, 1, null);
                int i210 = i12 << 3;
                a(windowInsets3, modifierSemantics$default10, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i210 & 896) | (i210 & 7168) | (57344 & i210) | (i210 & 458752) | (i12 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape2 = rectangleShape;
                j12 = jM978getSurface0d7_KjU;
                j13 = jM1014contentColorForek8zF_U;
                f11 = f10;
                windowInsets4 = windowInsets3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    } else {
                        windowInsets3 = windowInsets2;
                    }
                    f10 = fM1089getPermanentDrawerElevationD9Ej5fM;
                    modifier3 = modifier2;
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    } else {
                        windowInsets3 = windowInsets2;
                    }
                    f10 = fM1089getPermanentDrawerElevationD9Ej5fM;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1733353241, i12, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:528)");
                }
                strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new r(strM1320getStringNWtq28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new r(strM1320getStringNWtq28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics$default11 = SemanticsModifierKt.semantics$default(modifier3, false, (Function1) objRememberedValue, 1, null);
                int i211 = i12 << 3;
                a(windowInsets3, modifierSemantics$default11, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i211 & 896) | (i211 & 7168) | (57344 & i211) | (i211 & 458752) | (i12 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape2 = rectangleShape;
                j12 = jM978getSurface0d7_KjU;
                j13 = jM1014contentColorForek8zF_U;
                f11 = f10;
                windowInsets4 = windowInsets3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new s(f11, i10, i11, j12, j13, windowInsets4, modifier4, shape2, content));
        }
        i12 |= 24576;
        fM1089getPermanentDrawerElevationD9Ej5fM = f6;
        if ((i10 & 458752) == 0) {
            windowInsets2 = windowInsets;
            if ((i11 & 32) == 0) {
                i16 = 65536;
            } else {
                i16 = 65536;
            }
            i12 |= i16;
        } else {
            windowInsets2 = windowInsets;
        }
        if ((i11 & 64) != 0) {
            if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
            }
            if ((i12 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    } else {
                        windowInsets3 = windowInsets2;
                    }
                    f10 = fM1089getPermanentDrawerElevationD9Ej5fM;
                    modifier3 = modifier2;
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    } else {
                        windowInsets3 = windowInsets2;
                    }
                    f10 = fM1089getPermanentDrawerElevationD9Ej5fM;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1733353241, i12, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:528)");
                }
                strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new r(strM1320getStringNWtq28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new r(strM1320getStringNWtq28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics$default12 = SemanticsModifierKt.semantics$default(modifier3, false, (Function1) objRememberedValue, 1, null);
                int i212 = i12 << 3;
                a(windowInsets3, modifierSemantics$default12, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i212 & 896) | (i212 & 7168) | (57344 & i212) | (i212 & 458752) | (i12 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape2 = rectangleShape;
                j12 = jM978getSurface0d7_KjU;
                j13 = jM1014contentColorForek8zF_U;
                f11 = f10;
                windowInsets4 = windowInsets3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    } else {
                        windowInsets3 = windowInsets2;
                    }
                    f10 = fM1089getPermanentDrawerElevationD9Ej5fM;
                    modifier3 = modifier2;
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    if ((i11 & 4) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    } else {
                        windowInsets3 = windowInsets2;
                    }
                    f10 = fM1089getPermanentDrawerElevationD9Ej5fM;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1733353241, i12, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:528)");
                }
                strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new r(strM1320getStringNWtq28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new r(strM1320getStringNWtq28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics$default13 = SemanticsModifierKt.semantics$default(modifier3, false, (Function1) objRememberedValue, 1, null);
                int i213 = i12 << 3;
                a(windowInsets3, modifierSemantics$default13, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i213 & 896) | (i213 & 7168) | (57344 & i213) | (i213 & 458752) | (i12 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape2 = rectangleShape;
                j12 = jM978getSurface0d7_KjU;
                j13 = jM1014contentColorForek8zF_U;
                f11 = f10;
                windowInsets4 = windowInsets3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new s(f11, i10, i11, j12, j13, windowInsets4, modifier4, shape2, content));
        }
        i15 = 1572864;
        i12 |= i15;
        if ((i12 & 2995931) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i18 != 0) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                if ((i11 & 4) != 0) {
                    jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                    i12 &= -7169;
                }
                if (i13 != 0) {
                    fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                } else {
                    windowInsets3 = windowInsets2;
                }
                f10 = fM1089getPermanentDrawerElevationD9Ej5fM;
                modifier3 = modifier2;
            } else {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i18 != 0) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                if ((i11 & 4) != 0) {
                    jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                    i12 &= -7169;
                }
                if (i13 != 0) {
                    fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                } else {
                    windowInsets3 = windowInsets2;
                }
                f10 = fM1089getPermanentDrawerElevationD9Ej5fM;
                modifier3 = modifier2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1733353241, i12, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:528)");
            }
            strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new r(strM1320getStringNWtq28);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new r(strM1320getStringNWtq28);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierSemantics$default14 = SemanticsModifierKt.semantics$default(modifier3, false, (Function1) objRememberedValue, 1, null);
            int i214 = i12 << 3;
            a(windowInsets3, modifierSemantics$default14, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i214 & 896) | (i214 & 7168) | (57344 & i214) | (i214 & 458752) | (i12 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            shape2 = rectangleShape;
            j12 = jM978getSurface0d7_KjU;
            j13 = jM1014contentColorForek8zF_U;
            f11 = f10;
            windowInsets4 = windowInsets3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i18 != 0) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                if ((i11 & 4) != 0) {
                    jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                    i12 &= -7169;
                }
                if (i13 != 0) {
                    fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                } else {
                    windowInsets3 = windowInsets2;
                }
                f10 = fM1089getPermanentDrawerElevationD9Ej5fM;
                modifier3 = modifier2;
            } else {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i18 != 0) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                if ((i11 & 4) != 0) {
                    jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 6) & 14);
                    i12 &= -7169;
                }
                if (i13 != 0) {
                    fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                } else {
                    windowInsets3 = windowInsets2;
                }
                f10 = fM1089getPermanentDrawerElevationD9Ej5fM;
                modifier3 = modifier2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1733353241, i12, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:528)");
            }
            strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1300getNavigationMenuadMyvUU(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new r(strM1320getStringNWtq28);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new r(strM1320getStringNWtq28);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierSemantics$default15 = SemanticsModifierKt.semantics$default(modifier3, false, (Function1) objRememberedValue, 1, null);
            int i215 = i12 << 3;
            a(windowInsets3, modifierSemantics$default15, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, f10, content, composerStartRestartGroup, ((i12 >> 15) & 14) | (i215 & 896) | (i215 & 7168) | (57344 & i215) | (i215 & 458752) | (i12 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            shape2 = rectangleShape;
            j12 = jM978getSurface0d7_KjU;
            j13 = jM1014contentColorForek8zF_U;
            f11 = f10;
            windowInsets4 = windowInsets3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new s(f11, i10, i11, j12, j13, windowInsets4, modifier4, shape2, content));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x00db  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:55:0x014e  */
    /* JADX WARN: Code duplicated, block: B:58:0x015a  */
    /* JADX WARN: Code duplicated, block: B:59:0x015e  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void PermanentNavigationDrawer(@NotNull Function2<? super Composer, ? super Integer, Unit> drawerContent, @Nullable Modifier modifier, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        Modifier modifier3;
        Function0<ComposeUiNode> constructor;
        Function0<ComposeUiNode> constructor2;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(drawerContent, "drawerContent");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-276843608);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(drawerContent) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            } else if ((i10 & 896) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            if ((i12 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-276843608, i12, -1, "androidx.compose.material3.PermanentNavigationDrawer (NavigationDrawer.kt:424)");
                }
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion.getTop(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierFillMaxSize$default);
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
                drawerContent.invoke(composerStartRestartGroup, Integer.valueOf(i12 & 14));
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion, false, composerStartRestartGroup, 0, -1323940314);
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion2.getConstructor();
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
                Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl2, measurePolicyC, composerM2074constructorimpl2, density2));
                ai.a.j(0, function3MaterializerOf2, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 6) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new t(i10, i11, modifier4, drawerContent, content));
        }
        i12 |= 48;
        modifier2 = modifier;
        if ((i11 & 4) != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146) {
            if (i14 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-276843608, i12, -1, "androidx.compose.material3.PermanentNavigationDrawer (NavigationDrawer.kt:424)");
            }
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement.Horizontal start2 = Arrangement.INSTANCE.getStart();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(start2, companion4.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            constructor = companion5.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxSize$default2);
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
            Updater.m2081setimpl(composerM2074constructorimpl3, layoutDirection3, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion5, composerM2074constructorimpl3, measurePolicyRowMeasurePolicy2, composerM2074constructorimpl3, density3));
            ai.a.j(0, function3MaterializerOf3, androidx.appcompat.widget.g0.b(companion5, composerM2074constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            drawerContent.invoke(composerStartRestartGroup, Integer.valueOf(i12 & 14));
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Modifier.Companion companion6 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyC2 = androidx.databinding.f.c(companion4, false, composerStartRestartGroup, 0, -1323940314);
            Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor2 = companion5.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(companion6);
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
            Updater.m2081setimpl(composerM2074constructorimpl4, layoutDirection4, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion5, composerM2074constructorimpl4, measurePolicyC2, composerM2074constructorimpl4, density4));
            ai.a.j(0, function3MaterializerOf4, androidx.appcompat.widget.g0.b(companion5, composerM2074constructorimpl4, viewConfiguration4, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 6) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
        } else {
            if (i14 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-276843608, i12, -1, "androidx.compose.material3.PermanentNavigationDrawer (NavigationDrawer.kt:424)");
            }
            Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement.Horizontal start3 = Arrangement.INSTANCE.getStart();
            Alignment.Companion companion7 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(start3, companion7.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
            constructor = companion8.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifierFillMaxSize$default3);
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
            Updater.m2081setimpl(composerM2074constructorimpl5, layoutDirection5, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion8, composerM2074constructorimpl5, measurePolicyRowMeasurePolicy3, composerM2074constructorimpl5, density5));
            ai.a.j(0, function3MaterializerOf5, androidx.appcompat.widget.g0.b(companion8, composerM2074constructorimpl5, viewConfiguration5, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            drawerContent.invoke(composerStartRestartGroup, Integer.valueOf(i12 & 14));
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Modifier.Companion companion9 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyC3 = androidx.databinding.f.c(companion7, false, composerStartRestartGroup, 0, -1323940314);
            Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration6 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor2 = companion8.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(companion9);
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
            Updater.m2081setimpl(composerM2074constructorimpl6, layoutDirection6, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion8, composerM2074constructorimpl6, measurePolicyC3, composerM2074constructorimpl6, density6));
            ai.a.j(0, function3MaterializerOf6, androidx.appcompat.widget.g0.b(companion8, composerM2074constructorimpl6, viewConfiguration6, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            content.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 6) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new t(i10, i11, modifier4, drawerContent, content));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0123  */
    /* JADX WARN: Code duplicated, block: B:103:0x0128  */
    /* JADX WARN: Code duplicated, block: B:104:0x0136  */
    /* JADX WARN: Code duplicated, block: B:107:0x013b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0145  */
    /* JADX WARN: Code duplicated, block: B:110:0x0148  */
    /* JADX WARN: Code duplicated, block: B:111:0x014f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0159  */
    /* JADX WARN: Code duplicated, block: B:117:0x01be  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00da  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:95:0x0115 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0117  */
    /* JADX WARN: Code duplicated, block: B:97:0x011a  */
    /* JADX WARN: Code duplicated, block: B:99:0x011e  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void a(WindowInsets windowInsets, Modifier modifier, Shape shape, long j10, long j11, float f6, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i10, int i11) {
        int i12;
        int i13;
        Shape shape2;
        int i14;
        long j12;
        long j13;
        int i15;
        float f10;
        int i16;
        int i17;
        Modifier modifier2;
        Shape rectangleShape;
        long jM978getSurface0d7_KjU;
        long jM1014contentColorForek8zF_U;
        float fM1089getPermanentDrawerElevationD9Ej5fM;
        Modifier modifier3;
        Shape shape3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(175072821);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(windowInsets) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 7168) == 0) {
                    if ((i11 & 8) == 0) {
                        j12 = j10;
                        int i19 = composerStartRestartGroup.changed(j12) ? 2048 : 1024;
                        i12 |= i19;
                    } else {
                        j12 = j10;
                    }
                    i12 |= i19;
                } else {
                    j12 = j10;
                }
                if ((i10 & 57344) == 0) {
                    if ((i11 & 16) == 0) {
                        j13 = j11;
                        int i20 = composerStartRestartGroup.changed(j13) ? 16384 : 8192;
                        i12 |= i20;
                    } else {
                        j13 = j11;
                    }
                    i12 |= i20;
                } else {
                    j13 = j11;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    f10 = f6;
                } else {
                    f10 = f6;
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(f10)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                    }
                    if ((i12 & 2995931) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i18 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                rectangleShape = RectangleShapeKt.getRectangleShape();
                            } else {
                                rectangleShape = shape2;
                            }
                            if ((i11 & 8) != 0) {
                                jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                                i12 &= -7169;
                            } else {
                                jM978getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 16) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 9) & 14);
                                i12 &= -57345;
                            } else {
                                jM1014contentColorForek8zF_U = j13;
                            }
                            if (i15 != 0) {
                                fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                            } else {
                                fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            modifier2 = modifier;
                            rectangleShape = shape2;
                            jM978getSurface0d7_KjU = j12;
                            fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                            jM1014contentColorForek8zF_U = j13;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(175072821, i12, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:552)");
                        }
                        Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.m339sizeInqDBjuR0$default(modifier2, f10761b, 0.0f, DrawerDefaults.INSTANCE.m1087getMaximumDrawerWidthD9Ej5fM(), 0.0f, 10, null), 0.0f, 1, null);
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 959363152, true, new f(windowInsets, function3, i12));
                        int i21 = i12 >> 3;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifierFillMaxHeight$default, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, fM1089getPermanentDrawerElevationD9Ej5fM, 0.0f, null, composableLambda, composerStartRestartGroup, (i21 & 112) | 12582912 | (i21 & 896) | (i21 & 7168) | (i21 & 57344), 96);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        shape3 = rectangleShape;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                        modifier3 = modifier;
                        long j14 = j13;
                        shape3 = shape2;
                        jM978getSurface0d7_KjU = j12;
                        jM1014contentColorForek8zF_U = j14;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new g(fM1089getPermanentDrawerElevationD9Ej5fM, i10, i11, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, windowInsets, modifier3, shape3, function3));
                }
                i17 = 1572864;
                i12 |= i17;
                if ((i12 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 8) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -7169;
                        } else {
                            jM978getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 16) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 9) & 14);
                            i12 &= -57345;
                        } else {
                            jM1014contentColorForek8zF_U = j13;
                        }
                        if (i15 != 0) {
                            fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                        } else {
                            fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                        }
                    } else {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 8) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -7169;
                        } else {
                            jM978getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 16) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 9) & 14);
                            i12 &= -57345;
                        } else {
                            jM1014contentColorForek8zF_U = j13;
                        }
                        if (i15 != 0) {
                            fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                        } else {
                            fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(175072821, i12, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:552)");
                    }
                    Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(SizeKt.m339sizeInqDBjuR0$default(modifier2, f10761b, 0.0f, DrawerDefaults.INSTANCE.m1087getMaximumDrawerWidthD9Ej5fM(), 0.0f, 10, null), 0.0f, 1, null);
                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 959363152, true, new f(windowInsets, function3, i12));
                    int i22 = i12 >> 3;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifierFillMaxHeight$default2, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, fM1089getPermanentDrawerElevationD9Ej5fM, 0.0f, null, composableLambda2, composerStartRestartGroup, (i22 & 112) | 12582912 | (i22 & 896) | (i22 & 7168) | (i22 & 57344), 96);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    shape3 = rectangleShape;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 8) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -7169;
                        } else {
                            jM978getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 16) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 9) & 14);
                            i12 &= -57345;
                        } else {
                            jM1014contentColorForek8zF_U = j13;
                        }
                        if (i15 != 0) {
                            fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                        } else {
                            fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                        }
                    } else {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 8) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -7169;
                        } else {
                            jM978getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 16) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 9) & 14);
                            i12 &= -57345;
                        } else {
                            jM1014contentColorForek8zF_U = j13;
                        }
                        if (i15 != 0) {
                            fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                        } else {
                            fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(175072821, i12, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:552)");
                    }
                    Modifier modifierFillMaxHeight$default3 = SizeKt.fillMaxHeight$default(SizeKt.m339sizeInqDBjuR0$default(modifier2, f10761b, 0.0f, DrawerDefaults.INSTANCE.m1087getMaximumDrawerWidthD9Ej5fM(), 0.0f, 10, null), 0.0f, 1, null);
                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 959363152, true, new f(windowInsets, function3, i12));
                    int i23 = i12 >> 3;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifierFillMaxHeight$default3, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, fM1089getPermanentDrawerElevationD9Ej5fM, 0.0f, null, composableLambda3, composerStartRestartGroup, (i23 & 112) | 12582912 | (i23 & 896) | (i23 & 7168) | (i23 & 57344), 96);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    shape3 = rectangleShape;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new g(fM1089getPermanentDrawerElevationD9Ej5fM, i10, i11, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, windowInsets, modifier3, shape3, function3));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            shape2 = shape;
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    j12 = j10;
                    if (composerStartRestartGroup.changed(j12)) {
                    }
                    i12 |= i19;
                } else {
                    j12 = j10;
                }
                i12 |= i19;
            } else {
                j12 = j10;
            }
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    j13 = j11;
                    if (composerStartRestartGroup.changed(j13)) {
                    }
                    i12 |= i20;
                } else {
                    j13 = j11;
                }
                i12 |= i20;
            } else {
                j13 = j11;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                f10 = f6;
            } else {
                f10 = f6;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f10)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((i11 & 64) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                }
                if ((i12 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 8) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -7169;
                        } else {
                            jM978getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 16) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 9) & 14);
                            i12 &= -57345;
                        } else {
                            jM1014contentColorForek8zF_U = j13;
                        }
                        if (i15 != 0) {
                            fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                        } else {
                            fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                        }
                    } else {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 8) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -7169;
                        } else {
                            jM978getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 16) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 9) & 14);
                            i12 &= -57345;
                        } else {
                            jM1014contentColorForek8zF_U = j13;
                        }
                        if (i15 != 0) {
                            fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                        } else {
                            fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(175072821, i12, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:552)");
                    }
                    Modifier modifierFillMaxHeight$default4 = SizeKt.fillMaxHeight$default(SizeKt.m339sizeInqDBjuR0$default(modifier2, f10761b, 0.0f, DrawerDefaults.INSTANCE.m1087getMaximumDrawerWidthD9Ej5fM(), 0.0f, 10, null), 0.0f, 1, null);
                    ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 959363152, true, new f(windowInsets, function3, i12));
                    int i24 = i12 >> 3;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifierFillMaxHeight$default4, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, fM1089getPermanentDrawerElevationD9Ej5fM, 0.0f, null, composableLambda4, composerStartRestartGroup, (i24 & 112) | 12582912 | (i24 & 896) | (i24 & 7168) | (i24 & 57344), 96);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    shape3 = rectangleShape;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 8) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -7169;
                        } else {
                            jM978getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 16) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 9) & 14);
                            i12 &= -57345;
                        } else {
                            jM1014contentColorForek8zF_U = j13;
                        }
                        if (i15 != 0) {
                            fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                        } else {
                            fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                        }
                    } else {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 8) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -7169;
                        } else {
                            jM978getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 16) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 9) & 14);
                            i12 &= -57345;
                        } else {
                            jM1014contentColorForek8zF_U = j13;
                        }
                        if (i15 != 0) {
                            fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                        } else {
                            fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(175072821, i12, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:552)");
                    }
                    Modifier modifierFillMaxHeight$default5 = SizeKt.fillMaxHeight$default(SizeKt.m339sizeInqDBjuR0$default(modifier2, f10761b, 0.0f, DrawerDefaults.INSTANCE.m1087getMaximumDrawerWidthD9Ej5fM(), 0.0f, 10, null), 0.0f, 1, null);
                    ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 959363152, true, new f(windowInsets, function3, i12));
                    int i25 = i12 >> 3;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifierFillMaxHeight$default5, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, fM1089getPermanentDrawerElevationD9Ej5fM, 0.0f, null, composableLambda5, composerStartRestartGroup, (i25 & 112) | 12582912 | (i25 & 896) | (i25 & 7168) | (i25 & 57344), 96);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    shape3 = rectangleShape;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new g(fM1089getPermanentDrawerElevationD9Ej5fM, i10, i11, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, windowInsets, modifier3, shape3, function3));
            }
            i17 = 1572864;
            i12 |= i17;
            if ((i12 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i11 & 8) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -7169;
                    } else {
                        jM978getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 16) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 9) & 14);
                        i12 &= -57345;
                    } else {
                        jM1014contentColorForek8zF_U = j13;
                    }
                    if (i15 != 0) {
                        fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                    } else {
                        fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i11 & 8) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -7169;
                    } else {
                        jM978getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 16) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 9) & 14);
                        i12 &= -57345;
                    } else {
                        jM1014contentColorForek8zF_U = j13;
                    }
                    if (i15 != 0) {
                        fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                    } else {
                        fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(175072821, i12, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:552)");
                }
                Modifier modifierFillMaxHeight$default6 = SizeKt.fillMaxHeight$default(SizeKt.m339sizeInqDBjuR0$default(modifier2, f10761b, 0.0f, DrawerDefaults.INSTANCE.m1087getMaximumDrawerWidthD9Ej5fM(), 0.0f, 10, null), 0.0f, 1, null);
                ComposableLambda composableLambda6 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 959363152, true, new f(windowInsets, function3, i12));
                int i26 = i12 >> 3;
                SurfaceKt.m1329SurfaceT9BRK9s(modifierFillMaxHeight$default6, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, fM1089getPermanentDrawerElevationD9Ej5fM, 0.0f, null, composableLambda6, composerStartRestartGroup, (i26 & 112) | 12582912 | (i26 & 896) | (i26 & 7168) | (i26 & 57344), 96);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                shape3 = rectangleShape;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i11 & 8) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -7169;
                    } else {
                        jM978getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 16) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 9) & 14);
                        i12 &= -57345;
                    } else {
                        jM1014contentColorForek8zF_U = j13;
                    }
                    if (i15 != 0) {
                        fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                    } else {
                        fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i11 & 8) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -7169;
                    } else {
                        jM978getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 16) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 9) & 14);
                        i12 &= -57345;
                    } else {
                        jM1014contentColorForek8zF_U = j13;
                    }
                    if (i15 != 0) {
                        fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                    } else {
                        fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(175072821, i12, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:552)");
                }
                Modifier modifierFillMaxHeight$default7 = SizeKt.fillMaxHeight$default(SizeKt.m339sizeInqDBjuR0$default(modifier2, f10761b, 0.0f, DrawerDefaults.INSTANCE.m1087getMaximumDrawerWidthD9Ej5fM(), 0.0f, 10, null), 0.0f, 1, null);
                ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 959363152, true, new f(windowInsets, function3, i12));
                int i27 = i12 >> 3;
                SurfaceKt.m1329SurfaceT9BRK9s(modifierFillMaxHeight$default7, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, fM1089getPermanentDrawerElevationD9Ej5fM, 0.0f, null, composableLambda7, composerStartRestartGroup, (i27 & 112) | 12582912 | (i27 & 896) | (i27 & 7168) | (i27 & 57344), 96);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                shape3 = rectangleShape;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new g(fM1089getPermanentDrawerElevationD9Ej5fM, i10, i11, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, windowInsets, modifier3, shape3, function3));
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    j12 = j10;
                    if (composerStartRestartGroup.changed(j12)) {
                    }
                    i12 |= i19;
                } else {
                    j12 = j10;
                }
                i12 |= i19;
            } else {
                j12 = j10;
            }
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    j13 = j11;
                    if (composerStartRestartGroup.changed(j13)) {
                    }
                    i12 |= i20;
                } else {
                    j13 = j11;
                }
                i12 |= i20;
            } else {
                j13 = j11;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                f10 = f6;
            } else {
                f10 = f6;
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f10)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((i11 & 64) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                }
                if ((i12 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 8) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -7169;
                        } else {
                            jM978getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 16) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 9) & 14);
                            i12 &= -57345;
                        } else {
                            jM1014contentColorForek8zF_U = j13;
                        }
                        if (i15 != 0) {
                            fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                        } else {
                            fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                        }
                    } else {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 8) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -7169;
                        } else {
                            jM978getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 16) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 9) & 14);
                            i12 &= -57345;
                        } else {
                            jM1014contentColorForek8zF_U = j13;
                        }
                        if (i15 != 0) {
                            fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                        } else {
                            fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(175072821, i12, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:552)");
                    }
                    Modifier modifierFillMaxHeight$default8 = SizeKt.fillMaxHeight$default(SizeKt.m339sizeInqDBjuR0$default(modifier2, f10761b, 0.0f, DrawerDefaults.INSTANCE.m1087getMaximumDrawerWidthD9Ej5fM(), 0.0f, 10, null), 0.0f, 1, null);
                    ComposableLambda composableLambda8 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 959363152, true, new f(windowInsets, function3, i12));
                    int i28 = i12 >> 3;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifierFillMaxHeight$default8, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, fM1089getPermanentDrawerElevationD9Ej5fM, 0.0f, null, composableLambda8, composerStartRestartGroup, (i28 & 112) | 12582912 | (i28 & 896) | (i28 & 7168) | (i28 & 57344), 96);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    shape3 = rectangleShape;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 8) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -7169;
                        } else {
                            jM978getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 16) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 9) & 14);
                            i12 &= -57345;
                        } else {
                            jM1014contentColorForek8zF_U = j13;
                        }
                        if (i15 != 0) {
                            fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                        } else {
                            fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                        }
                    } else {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 8) != 0) {
                            jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                            i12 &= -7169;
                        } else {
                            jM978getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 16) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 9) & 14);
                            i12 &= -57345;
                        } else {
                            jM1014contentColorForek8zF_U = j13;
                        }
                        if (i15 != 0) {
                            fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                        } else {
                            fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(175072821, i12, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:552)");
                    }
                    Modifier modifierFillMaxHeight$default9 = SizeKt.fillMaxHeight$default(SizeKt.m339sizeInqDBjuR0$default(modifier2, f10761b, 0.0f, DrawerDefaults.INSTANCE.m1087getMaximumDrawerWidthD9Ej5fM(), 0.0f, 10, null), 0.0f, 1, null);
                    ComposableLambda composableLambda9 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 959363152, true, new f(windowInsets, function3, i12));
                    int i29 = i12 >> 3;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifierFillMaxHeight$default9, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, fM1089getPermanentDrawerElevationD9Ej5fM, 0.0f, null, composableLambda9, composerStartRestartGroup, (i29 & 112) | 12582912 | (i29 & 896) | (i29 & 7168) | (i29 & 57344), 96);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    shape3 = rectangleShape;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new g(fM1089getPermanentDrawerElevationD9Ej5fM, i10, i11, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, windowInsets, modifier3, shape3, function3));
            }
            i17 = 1572864;
            i12 |= i17;
            if ((i12 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i11 & 8) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -7169;
                    } else {
                        jM978getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 16) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 9) & 14);
                        i12 &= -57345;
                    } else {
                        jM1014contentColorForek8zF_U = j13;
                    }
                    if (i15 != 0) {
                        fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                    } else {
                        fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i11 & 8) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -7169;
                    } else {
                        jM978getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 16) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 9) & 14);
                        i12 &= -57345;
                    } else {
                        jM1014contentColorForek8zF_U = j13;
                    }
                    if (i15 != 0) {
                        fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                    } else {
                        fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(175072821, i12, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:552)");
                }
                Modifier modifierFillMaxHeight$default10 = SizeKt.fillMaxHeight$default(SizeKt.m339sizeInqDBjuR0$default(modifier2, f10761b, 0.0f, DrawerDefaults.INSTANCE.m1087getMaximumDrawerWidthD9Ej5fM(), 0.0f, 10, null), 0.0f, 1, null);
                ComposableLambda composableLambda10 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 959363152, true, new f(windowInsets, function3, i12));
                int i210 = i12 >> 3;
                SurfaceKt.m1329SurfaceT9BRK9s(modifierFillMaxHeight$default10, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, fM1089getPermanentDrawerElevationD9Ej5fM, 0.0f, null, composableLambda10, composerStartRestartGroup, (i210 & 112) | 12582912 | (i210 & 896) | (i210 & 7168) | (i210 & 57344), 96);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                shape3 = rectangleShape;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i11 & 8) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -7169;
                    } else {
                        jM978getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 16) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 9) & 14);
                        i12 &= -57345;
                    } else {
                        jM1014contentColorForek8zF_U = j13;
                    }
                    if (i15 != 0) {
                        fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                    } else {
                        fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i11 & 8) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -7169;
                    } else {
                        jM978getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 16) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 9) & 14);
                        i12 &= -57345;
                    } else {
                        jM1014contentColorForek8zF_U = j13;
                    }
                    if (i15 != 0) {
                        fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                    } else {
                        fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(175072821, i12, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:552)");
                }
                Modifier modifierFillMaxHeight$default11 = SizeKt.fillMaxHeight$default(SizeKt.m339sizeInqDBjuR0$default(modifier2, f10761b, 0.0f, DrawerDefaults.INSTANCE.m1087getMaximumDrawerWidthD9Ej5fM(), 0.0f, 10, null), 0.0f, 1, null);
                ComposableLambda composableLambda11 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 959363152, true, new f(windowInsets, function3, i12));
                int i211 = i12 >> 3;
                SurfaceKt.m1329SurfaceT9BRK9s(modifierFillMaxHeight$default11, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, fM1089getPermanentDrawerElevationD9Ej5fM, 0.0f, null, composableLambda11, composerStartRestartGroup, (i211 & 112) | 12582912 | (i211 & 896) | (i211 & 7168) | (i211 & 57344), 96);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                shape3 = rectangleShape;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new g(fM1089getPermanentDrawerElevationD9Ej5fM, i10, i11, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, windowInsets, modifier3, shape3, function3));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        shape2 = shape;
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                j12 = j10;
                if (composerStartRestartGroup.changed(j12)) {
                }
                i12 |= i19;
            } else {
                j12 = j10;
            }
            i12 |= i19;
        } else {
            j12 = j10;
        }
        if ((i10 & 57344) == 0) {
            if ((i11 & 16) == 0) {
                j13 = j11;
                if (composerStartRestartGroup.changed(j13)) {
                }
                i12 |= i20;
            } else {
                j13 = j11;
            }
            i12 |= i20;
        } else {
            j13 = j11;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            f10 = f6;
        } else {
            f10 = f6;
            if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(f10)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
        }
        if ((i11 & 64) != 0) {
            if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
            }
            if ((i12 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i11 & 8) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -7169;
                    } else {
                        jM978getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 16) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 9) & 14);
                        i12 &= -57345;
                    } else {
                        jM1014contentColorForek8zF_U = j13;
                    }
                    if (i15 != 0) {
                        fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                    } else {
                        fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i11 & 8) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -7169;
                    } else {
                        jM978getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 16) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 9) & 14);
                        i12 &= -57345;
                    } else {
                        jM1014contentColorForek8zF_U = j13;
                    }
                    if (i15 != 0) {
                        fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                    } else {
                        fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(175072821, i12, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:552)");
                }
                Modifier modifierFillMaxHeight$default12 = SizeKt.fillMaxHeight$default(SizeKt.m339sizeInqDBjuR0$default(modifier2, f10761b, 0.0f, DrawerDefaults.INSTANCE.m1087getMaximumDrawerWidthD9Ej5fM(), 0.0f, 10, null), 0.0f, 1, null);
                ComposableLambda composableLambda12 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 959363152, true, new f(windowInsets, function3, i12));
                int i212 = i12 >> 3;
                SurfaceKt.m1329SurfaceT9BRK9s(modifierFillMaxHeight$default12, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, fM1089getPermanentDrawerElevationD9Ej5fM, 0.0f, null, composableLambda12, composerStartRestartGroup, (i212 & 112) | 12582912 | (i212 & 896) | (i212 & 7168) | (i212 & 57344), 96);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                shape3 = rectangleShape;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i11 & 8) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -7169;
                    } else {
                        jM978getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 16) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 9) & 14);
                        i12 &= -57345;
                    } else {
                        jM1014contentColorForek8zF_U = j13;
                    }
                    if (i15 != 0) {
                        fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                    } else {
                        fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i11 & 8) != 0) {
                        jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                        i12 &= -7169;
                    } else {
                        jM978getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 16) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 9) & 14);
                        i12 &= -57345;
                    } else {
                        jM1014contentColorForek8zF_U = j13;
                    }
                    if (i15 != 0) {
                        fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                    } else {
                        fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(175072821, i12, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:552)");
                }
                Modifier modifierFillMaxHeight$default13 = SizeKt.fillMaxHeight$default(SizeKt.m339sizeInqDBjuR0$default(modifier2, f10761b, 0.0f, DrawerDefaults.INSTANCE.m1087getMaximumDrawerWidthD9Ej5fM(), 0.0f, 10, null), 0.0f, 1, null);
                ComposableLambda composableLambda13 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 959363152, true, new f(windowInsets, function3, i12));
                int i213 = i12 >> 3;
                SurfaceKt.m1329SurfaceT9BRK9s(modifierFillMaxHeight$default13, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, fM1089getPermanentDrawerElevationD9Ej5fM, 0.0f, null, composableLambda13, composerStartRestartGroup, (i213 & 112) | 12582912 | (i213 & 896) | (i213 & 7168) | (i213 & 57344), 96);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                shape3 = rectangleShape;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new g(fM1089getPermanentDrawerElevationD9Ej5fM, i10, i11, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, windowInsets, modifier3, shape3, function3));
        }
        i17 = 1572864;
        i12 |= i17;
        if ((i12 & 2995931) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                } else {
                    rectangleShape = shape2;
                }
                if ((i11 & 8) != 0) {
                    jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    i12 &= -7169;
                } else {
                    jM978getSurface0d7_KjU = j12;
                }
                if ((i11 & 16) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 9) & 14);
                    i12 &= -57345;
                } else {
                    jM1014contentColorForek8zF_U = j13;
                }
                if (i15 != 0) {
                    fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                } else {
                    fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                }
            } else {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                } else {
                    rectangleShape = shape2;
                }
                if ((i11 & 8) != 0) {
                    jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    i12 &= -7169;
                } else {
                    jM978getSurface0d7_KjU = j12;
                }
                if ((i11 & 16) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 9) & 14);
                    i12 &= -57345;
                } else {
                    jM1014contentColorForek8zF_U = j13;
                }
                if (i15 != 0) {
                    fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                } else {
                    fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(175072821, i12, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:552)");
            }
            Modifier modifierFillMaxHeight$default14 = SizeKt.fillMaxHeight$default(SizeKt.m339sizeInqDBjuR0$default(modifier2, f10761b, 0.0f, DrawerDefaults.INSTANCE.m1087getMaximumDrawerWidthD9Ej5fM(), 0.0f, 10, null), 0.0f, 1, null);
            ComposableLambda composableLambda14 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 959363152, true, new f(windowInsets, function3, i12));
            int i214 = i12 >> 3;
            SurfaceKt.m1329SurfaceT9BRK9s(modifierFillMaxHeight$default14, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, fM1089getPermanentDrawerElevationD9Ej5fM, 0.0f, null, composableLambda14, composerStartRestartGroup, (i214 & 112) | 12582912 | (i214 & 896) | (i214 & 7168) | (i214 & 57344), 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            shape3 = rectangleShape;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                } else {
                    rectangleShape = shape2;
                }
                if ((i11 & 8) != 0) {
                    jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    i12 &= -7169;
                } else {
                    jM978getSurface0d7_KjU = j12;
                }
                if ((i11 & 16) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 9) & 14);
                    i12 &= -57345;
                } else {
                    jM1014contentColorForek8zF_U = j13;
                }
                if (i15 != 0) {
                    fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                } else {
                    fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                }
            } else {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                } else {
                    rectangleShape = shape2;
                }
                if ((i11 & 8) != 0) {
                    jM978getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m978getSurface0d7_KjU();
                    i12 &= -7169;
                } else {
                    jM978getSurface0d7_KjU = j12;
                }
                if ((i11 & 16) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM978getSurface0d7_KjU, composerStartRestartGroup, (i12 >> 9) & 14);
                    i12 &= -57345;
                } else {
                    jM1014contentColorForek8zF_U = j13;
                }
                if (i15 != 0) {
                    fM1089getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m1089getPermanentDrawerElevationD9Ej5fM();
                } else {
                    fM1089getPermanentDrawerElevationD9Ej5fM = f10;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(175072821, i12, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:552)");
            }
            Modifier modifierFillMaxHeight$default15 = SizeKt.fillMaxHeight$default(SizeKt.m339sizeInqDBjuR0$default(modifier2, f10761b, 0.0f, DrawerDefaults.INSTANCE.m1087getMaximumDrawerWidthD9Ej5fM(), 0.0f, 10, null), 0.0f, 1, null);
            ComposableLambda composableLambda15 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 959363152, true, new f(windowInsets, function3, i12));
            int i215 = i12 >> 3;
            SurfaceKt.m1329SurfaceT9BRK9s(modifierFillMaxHeight$default15, rectangleShape, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, fM1089getPermanentDrawerElevationD9Ej5fM, 0.0f, null, composableLambda15, composerStartRestartGroup, (i215 & 112) | 12582912 | (i215 & 896) | (i215 & 7168) | (i215 & 57344), 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            shape3 = rectangleShape;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new g(fM1089getPermanentDrawerElevationD9Ej5fM, i10, i11, jM978getSurface0d7_KjU, jM1014contentColorForek8zF_U, windowInsets, modifier3, shape3, function3));
    }

    public static final float access$calculateFraction(float f6, float f10, float f11) {
        return kotlin.ranges.c.coerceIn((f11 - f6) / (f10 - f6), 0.0f, 1.0f);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(boolean z10, Function0<Unit> function0, Function0<Float> function1, long j10, Composer composer, int i10) {
        int i11;
        Modifier modifierSemantics;
        Composer composerStartRestartGroup = composer.startRestartGroup(2106487387);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(j10) ? 2048 : 1024;
        }
        if ((i11 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2106487387, i11, -1, "androidx.compose.material3.Scrim (NavigationDrawer.kt:842)");
            }
            String strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1262getCloseDraweradMyvUU(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1858703321);
            if (z10) {
                Modifier.Companion companion = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged = composerStartRestartGroup.changed(function0);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new w(function0, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, function0, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                boolean zChanged2 = composerStartRestartGroup.changed(strM1320getStringNWtq28) | composerStartRestartGroup.changed(function0);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new x(strM1320getStringNWtq28, function0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                modifierSemantics = SemanticsModifierKt.semantics(modifierPointerInput, true, (Function1) objRememberedValue2);
            } else {
                modifierSemantics = Modifier.INSTANCE;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifierSemantics);
            Color colorM2498boximpl = Color.m2498boximpl(j10);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged3 = composerStartRestartGroup.changed(colorM2498boximpl) | composerStartRestartGroup.changed(function1);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new u(j10, function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierThen, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new v(z10, function0, function1, j10, i10));
    }

    @Composable
    @NotNull
    public static final DrawerState rememberDrawerState(@NotNull DrawerValue initialValue, @Nullable Function1<? super DrawerValue, Boolean> function1, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(2098699222);
        if ((i11 & 2) != 0) {
            function1 = y.f10864p0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2098699222, i10, -1, "androidx.compose.material3.rememberDrawerState (NavigationDrawer.kt:223)");
        }
        Object[] objArr = new Object[0];
        Saver<DrawerState, DrawerValue> Saver = DrawerState.INSTANCE.Saver(function1);
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(initialValue) | composer.changed(function1);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new z(initialValue, function1);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        DrawerState drawerState = (DrawerState) RememberSaveableKt.m2165rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return drawerState;
    }
}
