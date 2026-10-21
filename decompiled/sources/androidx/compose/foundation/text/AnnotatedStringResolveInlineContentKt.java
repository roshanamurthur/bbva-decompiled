package androidx.compose.foundation.text;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnnotatedStringResolveInlineContent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u001a_\u0010\u000e\u001a?\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u0006\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f0\u0007j\u0002`\r0\u00060\u0005*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0000\u001a\f\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0000\u001a@\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00002'\u0010\u0012\u001a#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f0\u0007j\u0002`\r0\u0006H\u0001¢\u0006\u0004\b\u0013\u0010\u0014*:\b\u0000\u0010\u0015\"\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f0\u00072\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f0\u0007*\u0018\b\u0000\u0010\u0016\"\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "inlineContent", "Lkotlin/Pair;", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "Landroidx/compose/foundation/text/PlaceholderRange;", "Lkotlin/Function1;", "", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/foundation/text/InlineContentRange;", "resolveInlineContent", "", "hasInlineContent", "text", "inlineContents", "InlineChildren", "(Landroidx/compose/ui/text/AnnotatedString;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "InlineContentRange", "PlaceholderRange", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnnotatedStringResolveInlineContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,89:1\n33#2,6:90\n33#2,4:96\n38#2:135\n75#3,14:100\n91#3:134\n456#4,8:114\n464#4,6:128\n4144#5,6:122\n*S KotlinDebug\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt\n*L\n46#1:90,6\n75#1:96,4\n75#1:135\n76#1:100,14\n76#1:134\n76#1:114,8\n76#1:128,6\n76#1:122,6\n*E\n"})
public final class AnnotatedStringResolveInlineContentKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Pair<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>>> f5648a = new Pair<>(CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList());

    /* JADX INFO: compiled from: AnnotatedStringResolveInlineContent.kt */
    @SourceDebugExtension({"SMAP\nAnnotatedStringResolveInlineContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt$InlineChildren$1$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,89:1\n151#2,3:90\n33#2,4:93\n154#2,2:97\n38#2:99\n156#2:100\n*S KotlinDebug\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt$InlineChildren$1$2\n*L\n79#1:90,3\n79#1:93,4\n79#1:97,2\n79#1:99\n79#1:100\n*E\n"})
    public static final class a implements MeasurePolicy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f5649a = new a();

        /* JADX INFO: renamed from: androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AnnotatedStringResolveInlineContent.kt */
        @SourceDebugExtension({"SMAP\nAnnotatedStringResolveInlineContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$measure$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,89:1\n33#2,6:90\n*S KotlinDebug\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$measure$1\n*L\n81#1:90,6\n*E\n"})
        public static final class C0035a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ List<Placeable> f5650p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0035a(ArrayList arrayList) {
                super(1);
                this.f5650p0 = arrayList;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope layout = placementScope;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                List<Placeable> list = this.f5650p0;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Placeable.PlacementScope.placeRelative$default(layout, list.get(i10), 0, 0, 0.0f, 4, null);
                }
                return Unit.INSTANCE;
            }
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
        public final MeasureResult mo113measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> children, long j10) {
            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
            Intrinsics.checkNotNullParameter(children, "children");
            ArrayList arrayList = new ArrayList(children.size());
            int size = children.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(children.get(i10).mo3575measureBRTryo0(j10));
            }
            return MeasureScope.CC.q(Layout, Constraints.m4357getMaxWidthimpl(j10), Constraints.m4356getMaxHeightimpl(j10), null, new C0035a(arrayList), 4, null);
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

    /* JADX INFO: compiled from: AnnotatedStringResolveInlineContent.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ AnnotatedString f5651p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>> f5652q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f5653r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AnnotatedString annotatedString, List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>> list, int i10) {
            super(2);
            this.f5651p0 = annotatedString;
            this.f5652q0 = list;
            this.f5653r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f5653r0 | 1);
            AnnotatedStringResolveInlineContentKt.InlineChildren(this.f5651p0, this.f5652q0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void InlineChildren(@NotNull AnnotatedString text, @NotNull List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>> inlineContents, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(inlineContents, "inlineContents");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1794596951);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1794596951, i10, -1, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:70)");
        }
        int size = inlineContents.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            AnnotatedString.Range<Function3<String, Composer, Integer, Unit>> range = inlineContents.get(i12);
            Function3<String, Composer, Integer, Unit> function3Component1 = range.component1();
            int start = range.getStart();
            int end = range.getEnd();
            a aVar = a.f5649a;
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.INSTANCE;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i11);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
            Updater.m2081setimpl(composerM2074constructorimpl, aVar, companion2.getSetMeasurePolicy());
            Updater.m2081setimpl(composerM2074constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            }
            ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            function3Component1.invoke(text.subSequence(start, end).getText(), composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            i12++;
            i11 = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(text, inlineContents, i10));
    }

    public static final boolean hasInlineContent(@NotNull AnnotatedString annotatedString) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        return annotatedString.hasStringAnnotations(InlineTextContentKt.INLINE_CONTENT_TAG, 0, annotatedString.getText().length());
    }

    @NotNull
    public static final Pair<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>>> resolveInlineContent(@NotNull AnnotatedString annotatedString, @Nullable Map<String, InlineTextContent> map) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        if (map == null || map.isEmpty()) {
            return f5648a;
        }
        List<AnnotatedString.Range<String>> stringAnnotations = annotatedString.getStringAnnotations(InlineTextContentKt.INLINE_CONTENT_TAG, 0, annotatedString.getText().length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = stringAnnotations.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range<String> range = stringAnnotations.get(i10);
            InlineTextContent inlineTextContent = map.get(range.getItem());
            if (inlineTextContent != null) {
                arrayList.add(new AnnotatedString.Range(inlineTextContent.getPlaceholder(), range.getStart(), range.getEnd()));
                arrayList2.add(new AnnotatedString.Range(inlineTextContent.getChildren(), range.getStart(), range.getEnd()));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }
}
