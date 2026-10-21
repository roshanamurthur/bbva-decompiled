package androidx.compose.foundation.layout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Column.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001aO\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0002\b\nH\u0087\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\" \u0010\u0017\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "Column", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/layout/MeasurePolicy;", "columnMeasurePolicy", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "a", "Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultColumnMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultColumnMeasurePolicy$annotations", "()V", "DefaultColumnMeasurePolicy", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,230:1\n78#2,11:231\n91#2:262\n456#3,8:242\n464#3,6:256\n50#3:263\n49#3:264\n4144#4,6:250\n1097#5,6:265\n*S KotlinDebug\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n77#1:231,11\n77#1:262\n77#1:242,8\n77#1:256,6\n103#1:263\n103#1:264\n77#1:250,6\n103#1:265,6\n*E\n"})
public final class ColumnKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MeasurePolicy f4230a;

    /* JADX INFO: compiled from: Column.kt */
    @SourceDebugExtension({"SMAP\nColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnKt$DefaultColumnMeasurePolicy$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n1#2:231\n*E\n"})
    public static final class a extends Lambda implements Function5<Integer, int[], LayoutDirection, Density, int[], Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f4231p0 = new a(5);

        @Override // kotlin.jvm.functions.Function5
        public final Unit invoke(Integer num, int[] iArr, LayoutDirection layoutDirection, Density density, int[] iArr2) {
            int iIntValue = num.intValue();
            int[] size = iArr;
            Density density2 = density;
            int[] outPosition = iArr2;
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(layoutDirection, "<anonymous parameter 2>");
            Intrinsics.checkNotNullParameter(density2, "density");
            Intrinsics.checkNotNullParameter(outPosition, "outPosition");
            Arrangement.INSTANCE.getTop().arrange(density2, iIntValue, size, outPosition);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Column.kt */
    @SourceDebugExtension({"SMAP\nColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnKt$columnMeasurePolicy$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n1#2:231\n*E\n"})
    public static final class b extends Lambda implements Function5<Integer, int[], LayoutDirection, Density, int[], Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Arrangement.Vertical f4232p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Arrangement.Vertical vertical) {
            super(5);
            this.f4232p0 = vertical;
        }

        @Override // kotlin.jvm.functions.Function5
        public final Unit invoke(Integer num, int[] iArr, LayoutDirection layoutDirection, Density density, int[] iArr2) {
            int iIntValue = num.intValue();
            int[] size = iArr;
            Density density2 = density;
            int[] outPosition = iArr2;
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(layoutDirection, "<anonymous parameter 2>");
            Intrinsics.checkNotNullParameter(density2, "density");
            Intrinsics.checkNotNullParameter(outPosition, "outPosition");
            this.f4232p0.arrange(density2, iIntValue, size, outPosition);
            return Unit.INSTANCE;
        }
    }

    static {
        LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
        float spacing = Arrangement.INSTANCE.getTop().getSpacing();
        CrossAxisAlignment crossAxisAlignmentHorizontal$foundation_layout_release = CrossAxisAlignment.INSTANCE.horizontal$foundation_layout_release(Alignment.INSTANCE.getStart());
        f4230a = RowColumnImplKt.m313rowColumnMeasurePolicyTDGSqEk(layoutOrientation, a.f4231p0, spacing, SizeMode.Wrap, crossAxisAlignmentHorizontal$foundation_layout_release);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Column(@Nullable Modifier modifier, @Nullable Arrangement.Vertical vertical, @Nullable Alignment.Horizontal horizontal, @NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-483455358);
        if ((i11 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            vertical = Arrangement.INSTANCE.getTop();
        }
        if ((i11 & 4) != 0) {
            horizontal = Alignment.INSTANCE.getStart();
        }
        int i12 = i10 >> 3;
        MeasurePolicy measurePolicyColumnMeasurePolicy = columnMeasurePolicy(vertical, horizontal, composer, (i12 & 112) | (i12 & 14));
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
        int i13 = ((((i10 << 3) & 112) << 9) & 7168) | 6;
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer);
        Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl, measurePolicyColumnMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
        if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
        }
        ai.a.j((i13 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer)), composer, 2058660585);
        content.invoke(ColumnScopeInstance.INSTANCE, composer, Integer.valueOf(((i10 >> 6) & 112) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final MeasurePolicy columnMeasurePolicy(@NotNull Arrangement.Vertical verticalArrangement, @NotNull Alignment.Horizontal horizontalAlignment, @Nullable Composer composer, int i10) {
        MeasurePolicy measurePolicy;
        Intrinsics.checkNotNullParameter(verticalArrangement, "verticalArrangement");
        Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        composer.startReplaceableGroup(1089876336);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1089876336, i10, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:96)");
        }
        if (Intrinsics.areEqual(verticalArrangement, Arrangement.INSTANCE.getTop()) && Intrinsics.areEqual(horizontalAlignment, Alignment.INSTANCE.getStart())) {
            measurePolicy = f4230a;
        } else {
            composer.startReplaceableGroup(511388516);
            boolean zChanged = composer.changed(verticalArrangement) | composer.changed(horizontalAlignment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
                float spacing = verticalArrangement.getSpacing();
                CrossAxisAlignment crossAxisAlignmentHorizontal$foundation_layout_release = CrossAxisAlignment.INSTANCE.horizontal$foundation_layout_release(horizontalAlignment);
                objRememberedValue = RowColumnImplKt.m313rowColumnMeasurePolicyTDGSqEk(layoutOrientation, new b(verticalArrangement), spacing, SizeMode.Wrap, crossAxisAlignmentHorizontal$foundation_layout_release);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            measurePolicy = (MeasurePolicy) objRememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return measurePolicy;
    }

    @NotNull
    public static final MeasurePolicy getDefaultColumnMeasurePolicy() {
        return f4230a;
    }

    @PublishedApi
    public static /* synthetic */ void getDefaultColumnMeasurePolicy$annotations() {
    }
}
