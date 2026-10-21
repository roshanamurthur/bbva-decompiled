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

/* JADX INFO: compiled from: Row.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001aO\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0002\b\nH\u0087\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\" \u0010\u0017\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "Row", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/layout/MeasurePolicy;", "rowMeasurePolicy", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "a", "Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultRowMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultRowMeasurePolicy$annotations", "()V", "DefaultRowMeasurePolicy", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,252:1\n78#2,11:253\n91#2:284\n456#3,8:264\n464#3,6:278\n50#3:285\n49#3:286\n4144#4,6:272\n1097#5,6:287\n*S KotlinDebug\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n78#1:253,11\n78#1:284\n78#1:264,8\n78#1:278,6\n107#1:285\n107#1:286\n78#1:272,6\n107#1:287,6\n*E\n"})
public final class RowKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MeasurePolicy f4355a;

    /* JADX INFO: compiled from: Row.kt */
    @SourceDebugExtension({"SMAP\nRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowKt$DefaultRowMeasurePolicy$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,252:1\n1#2:253\n*E\n"})
    public static final class a extends Lambda implements Function5<Integer, int[], LayoutDirection, Density, int[], Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f4356p0 = new a(5);

        @Override // kotlin.jvm.functions.Function5
        public final Unit invoke(Integer num, int[] iArr, LayoutDirection layoutDirection, Density density, int[] iArr2) {
            int iIntValue = num.intValue();
            int[] size = iArr;
            LayoutDirection layoutDirection2 = layoutDirection;
            Density density2 = density;
            int[] outPosition = iArr2;
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(layoutDirection2, "layoutDirection");
            Intrinsics.checkNotNullParameter(density2, "density");
            Intrinsics.checkNotNullParameter(outPosition, "outPosition");
            Arrangement.INSTANCE.getStart().arrange(density2, iIntValue, size, layoutDirection2, outPosition);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Row.kt */
    public static final class b extends Lambda implements Function5<Integer, int[], LayoutDirection, Density, int[], Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Arrangement.Horizontal f4357p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Arrangement.Horizontal horizontal) {
            super(5);
            this.f4357p0 = horizontal;
        }

        @Override // kotlin.jvm.functions.Function5
        public final Unit invoke(Integer num, int[] iArr, LayoutDirection layoutDirection, Density density, int[] iArr2) {
            int iIntValue = num.intValue();
            int[] size = iArr;
            LayoutDirection layoutDirection2 = layoutDirection;
            Density density2 = density;
            int[] outPosition = iArr2;
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(layoutDirection2, "layoutDirection");
            Intrinsics.checkNotNullParameter(density2, "density");
            Intrinsics.checkNotNullParameter(outPosition, "outPosition");
            this.f4357p0.arrange(density2, iIntValue, size, layoutDirection2, outPosition);
            return Unit.INSTANCE;
        }
    }

    static {
        LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
        float spacing = Arrangement.INSTANCE.getStart().getSpacing();
        CrossAxisAlignment crossAxisAlignmentVertical$foundation_layout_release = CrossAxisAlignment.INSTANCE.vertical$foundation_layout_release(Alignment.INSTANCE.getTop());
        f4355a = RowColumnImplKt.m313rowColumnMeasurePolicyTDGSqEk(layoutOrientation, a.f4356p0, spacing, SizeMode.Wrap, crossAxisAlignmentVertical$foundation_layout_release);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Row(@Nullable Modifier modifier, @Nullable Arrangement.Horizontal horizontal, @Nullable Alignment.Vertical vertical, @NotNull Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(693286680);
        if ((i11 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            horizontal = Arrangement.INSTANCE.getStart();
        }
        if ((i11 & 4) != 0) {
            vertical = Alignment.INSTANCE.getTop();
        }
        int i12 = i10 >> 3;
        MeasurePolicy measurePolicyRowMeasurePolicy = rowMeasurePolicy(horizontal, vertical, composer, (i12 & 112) | (i12 & 14));
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
        Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl, measurePolicyRowMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
        if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
        }
        ai.a.j((i13 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer)), composer, 2058660585);
        content.invoke(RowScopeInstance.INSTANCE, composer, Integer.valueOf(((i10 >> 6) & 112) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @NotNull
    public static final MeasurePolicy getDefaultRowMeasurePolicy() {
        return f4355a;
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final MeasurePolicy rowMeasurePolicy(@NotNull Arrangement.Horizontal horizontalArrangement, @NotNull Alignment.Vertical verticalAlignment, @Nullable Composer composer, int i10) {
        MeasurePolicy measurePolicy;
        Intrinsics.checkNotNullParameter(horizontalArrangement, "horizontalArrangement");
        Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        composer.startReplaceableGroup(-837807694);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-837807694, i10, -1, "androidx.compose.foundation.layout.rowMeasurePolicy (Row.kt:100)");
        }
        if (Intrinsics.areEqual(horizontalArrangement, Arrangement.INSTANCE.getStart()) && Intrinsics.areEqual(verticalAlignment, Alignment.INSTANCE.getTop())) {
            measurePolicy = f4355a;
        } else {
            composer.startReplaceableGroup(511388516);
            boolean zChanged = composer.changed(horizontalArrangement) | composer.changed(verticalAlignment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
                float spacing = horizontalArrangement.getSpacing();
                CrossAxisAlignment crossAxisAlignmentVertical$foundation_layout_release = CrossAxisAlignment.INSTANCE.vertical$foundation_layout_release(verticalAlignment);
                objRememberedValue = RowColumnImplKt.m313rowColumnMeasurePolicyTDGSqEk(layoutOrientation, new b(horizontalArrangement), spacing, SizeMode.Wrap, crossAxisAlignmentVertical$foundation_layout_release);
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

    @PublishedApi
    public static /* synthetic */ void getDefaultRowMeasurePolicy$annotations() {
    }
}
