package androidx.compose.ui.node;

import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ComposeUiNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\ba\u0018\u0000 .2\u00020\u0001:\u0001.R\"\u0010\u0002\u001a\u00020\u00038&@&X§\u000e¢\u0006\u0012\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00020\u000bX¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u00020\u0011X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u00020\u0017X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u00020\u001dX¦\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0018\u0010\"\u001a\u00020#X¦\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0018\u0010(\u001a\u00020)X¦\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006/À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/ComposeUiNode;", "", "compositeKeyHash", "", "getCompositeKeyHash$annotations", "()V", "getCompositeKeyHash", "()I", "setCompositeKeyHash", "(I)V", "compositionLocalMap", "Landroidx/compose/runtime/CompositionLocalMap;", "getCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "setCompositionLocalMap", "(Landroidx/compose/runtime/CompositionLocalMap;)V", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "setMeasurePolicy", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "setViewConfiguration", "(Landroidx/compose/ui/platform/ViewConfiguration;)V", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@PublishedApi
public interface ComposeUiNode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f16747a;

    int getCompositeKeyHash();

    @NotNull
    CompositionLocalMap getCompositionLocalMap();

    @NotNull
    Density getDensity();

    @NotNull
    LayoutDirection getLayoutDirection();

    @NotNull
    MeasurePolicy getMeasurePolicy();

    @NotNull
    Modifier getModifier();

    @NotNull
    ViewConfiguration getViewConfiguration();

    void setCompositeKeyHash(int i10);

    void setCompositionLocalMap(@NotNull CompositionLocalMap compositionLocalMap);

    void setDensity(@NotNull Density density);

    void setLayoutDirection(@NotNull LayoutDirection layoutDirection);

    void setMeasurePolicy(@NotNull MeasurePolicy measurePolicy);

    void setModifier(@NotNull Modifier modifier);

    void setViewConfiguration(@NotNull ViewConfiguration viewConfiguration);

    /* JADX INFO: compiled from: ComposeUiNode.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b/\u0010-R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R.\u0010\u0014\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R.\u0010\u0018\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R.\u0010\u001c\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R.\u0010 \u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013R.\u0010$\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f8\u0006¢\u0006\f\n\u0004\b\"\u0010\u0011\u001a\u0004\b#\u0010\u0013R.\u0010(\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f8\u0006¢\u0006\f\n\u0004\b&\u0010\u0011\u001a\u0004\b'\u0010\u0013R7\u0010.\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f8GX\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010\u0011\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u0013¨\u00060"}, d2 = {"Landroidx/compose/ui/node/ComposeUiNode$Companion;", "", "Lkotlin/Function0;", "Landroidx/compose/ui/node/ComposeUiNode;", "b", "Lkotlin/jvm/functions/Function0;", "getConstructor", "()Lkotlin/jvm/functions/Function0;", "Constructor", "c", "getVirtualConstructor", "VirtualConstructor", "Lkotlin/Function2;", "Landroidx/compose/ui/Modifier;", "", "Lkotlin/ExtensionFunctionType;", "d", "Lkotlin/jvm/functions/Function2;", "getSetModifier", "()Lkotlin/jvm/functions/Function2;", "SetModifier", "Landroidx/compose/ui/unit/Density;", "e", "getSetDensity", "SetDensity", "Landroidx/compose/runtime/CompositionLocalMap;", "f", "getSetResolvedCompositionLocals", "SetResolvedCompositionLocals", "Landroidx/compose/ui/layout/MeasurePolicy;", "g", "getSetMeasurePolicy", "SetMeasurePolicy", "Landroidx/compose/ui/unit/LayoutDirection;", "h", "getSetLayoutDirection", "SetLayoutDirection", "Landroidx/compose/ui/platform/ViewConfiguration;", "i", "getSetViewConfiguration", "SetViewConfiguration", "", "j", "getSetCompositeKeyHash", "getSetCompositeKeyHash$annotations", "()V", "SetCompositeKeyHash", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f16747a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final Function0<ComposeUiNode> Constructor = LayoutNode.INSTANCE.getConstructor$ui_release();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final h f16749c = h.f16764p0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final e f16750d = e.f16761p0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final b f16751e = b.f16758p0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final f f16752f = f.f16762p0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final d f16753g = d.f16760p0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final c f16754h = c.f16759p0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final g f16755i = g.f16763p0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public static final a f16756j = a.f16757p0;

        /* JADX INFO: compiled from: ComposeUiNode.kt */
        public static final class a extends Lambda implements Function2<ComposeUiNode, Integer, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f16757p0 = new a(2);

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(ComposeUiNode composeUiNode, Integer num) {
                ComposeUiNode composeUiNode2 = composeUiNode;
                int iIntValue = num.intValue();
                Intrinsics.checkNotNullParameter(composeUiNode2, "$this$null");
                composeUiNode2.setCompositeKeyHash(iIntValue);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: ComposeUiNode.kt */
        public static final class b extends Lambda implements Function2<ComposeUiNode, Density, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final b f16758p0 = new b(2);

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(ComposeUiNode composeUiNode, Density density) {
                ComposeUiNode composeUiNode2 = composeUiNode;
                Density it = density;
                Intrinsics.checkNotNullParameter(composeUiNode2, "$this$null");
                Intrinsics.checkNotNullParameter(it, "it");
                composeUiNode2.setDensity(it);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: ComposeUiNode.kt */
        public static final class c extends Lambda implements Function2<ComposeUiNode, LayoutDirection, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final c f16759p0 = new c(2);

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(ComposeUiNode composeUiNode, LayoutDirection layoutDirection) {
                ComposeUiNode composeUiNode2 = composeUiNode;
                LayoutDirection it = layoutDirection;
                Intrinsics.checkNotNullParameter(composeUiNode2, "$this$null");
                Intrinsics.checkNotNullParameter(it, "it");
                composeUiNode2.setLayoutDirection(it);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: ComposeUiNode.kt */
        public static final class d extends Lambda implements Function2<ComposeUiNode, MeasurePolicy, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final d f16760p0 = new d(2);

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(ComposeUiNode composeUiNode, MeasurePolicy measurePolicy) {
                ComposeUiNode composeUiNode2 = composeUiNode;
                MeasurePolicy it = measurePolicy;
                Intrinsics.checkNotNullParameter(composeUiNode2, "$this$null");
                Intrinsics.checkNotNullParameter(it, "it");
                composeUiNode2.setMeasurePolicy(it);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: ComposeUiNode.kt */
        public static final class e extends Lambda implements Function2<ComposeUiNode, Modifier, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final e f16761p0 = new e(2);

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(ComposeUiNode composeUiNode, Modifier modifier) {
                ComposeUiNode composeUiNode2 = composeUiNode;
                Modifier it = modifier;
                Intrinsics.checkNotNullParameter(composeUiNode2, "$this$null");
                Intrinsics.checkNotNullParameter(it, "it");
                composeUiNode2.setModifier(it);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: ComposeUiNode.kt */
        public static final class f extends Lambda implements Function2<ComposeUiNode, CompositionLocalMap, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final f f16762p0 = new f(2);

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(ComposeUiNode composeUiNode, CompositionLocalMap compositionLocalMap) {
                ComposeUiNode composeUiNode2 = composeUiNode;
                CompositionLocalMap it = compositionLocalMap;
                Intrinsics.checkNotNullParameter(composeUiNode2, "$this$null");
                Intrinsics.checkNotNullParameter(it, "it");
                composeUiNode2.setCompositionLocalMap(it);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: ComposeUiNode.kt */
        public static final class g extends Lambda implements Function2<ComposeUiNode, ViewConfiguration, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final g f16763p0 = new g(2);

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(ComposeUiNode composeUiNode, ViewConfiguration viewConfiguration) {
                ComposeUiNode composeUiNode2 = composeUiNode;
                ViewConfiguration it = viewConfiguration;
                Intrinsics.checkNotNullParameter(composeUiNode2, "$this$null");
                Intrinsics.checkNotNullParameter(it, "it");
                composeUiNode2.setViewConfiguration(it);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: ComposeUiNode.kt */
        public static final class h extends Lambda implements Function0<LayoutNode> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final h f16764p0 = new h(0);

            @Override // kotlin.jvm.functions.Function0
            public final LayoutNode invoke() {
                return new LayoutNode(true, 0, 2, null);
            }
        }

        @NotNull
        public final Function0<ComposeUiNode> getConstructor() {
            return Constructor;
        }

        @ExperimentalComposeUiApi
        @NotNull
        public final Function2<ComposeUiNode, Integer, Unit> getSetCompositeKeyHash() {
            return f16756j;
        }

        @NotNull
        public final Function2<ComposeUiNode, Density, Unit> getSetDensity() {
            return f16751e;
        }

        @NotNull
        public final Function2<ComposeUiNode, LayoutDirection, Unit> getSetLayoutDirection() {
            return f16754h;
        }

        @NotNull
        public final Function2<ComposeUiNode, MeasurePolicy, Unit> getSetMeasurePolicy() {
            return f16753g;
        }

        @NotNull
        public final Function2<ComposeUiNode, Modifier, Unit> getSetModifier() {
            return f16750d;
        }

        @NotNull
        public final Function2<ComposeUiNode, CompositionLocalMap, Unit> getSetResolvedCompositionLocals() {
            return f16752f;
        }

        @NotNull
        public final Function2<ComposeUiNode, ViewConfiguration, Unit> getSetViewConfiguration() {
            return f16755i;
        }

        @NotNull
        public final Function0<ComposeUiNode> getVirtualConstructor() {
            return f16749c;
        }

        @ExperimentalComposeUiApi
        public static /* synthetic */ void getSetCompositeKeyHash$annotations() {
        }
    }
}
