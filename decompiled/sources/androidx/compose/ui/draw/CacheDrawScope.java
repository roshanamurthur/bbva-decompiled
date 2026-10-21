package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w0.f;

/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b(\u0010)J\u001f\u0010\b\u001a\u00020\u00072\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005J\u001f\u0010\n\u001a\u00020\u00072\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005R\"\u0010\u0012\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u001a8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010!\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "block", "Landroidx/compose/ui/draw/DrawResult;", "onDrawBehind", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "onDrawWithContent", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "p0", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "getCacheParams$ui_release", "()Landroidx/compose/ui/draw/BuildDrawCacheParams;", "setCacheParams$ui_release", "(Landroidx/compose/ui/draw/BuildDrawCacheParams;)V", "cacheParams", "q0", "Landroidx/compose/ui/draw/DrawResult;", "getDrawResult$ui_release", "()Landroidx/compose/ui/draw/DrawResult;", "setDrawResult$ui_release", "(Landroidx/compose/ui/draw/DrawResult;)V", "drawResult", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "getDensity", "()F", "density", "getFontScale", "fontScale", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/CacheDrawScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,312:1\n1#2:313\n*E\n"})
public final class CacheDrawScope implements Density {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public BuildDrawCacheParams cacheParams = f.f94110p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public DrawResult drawResult;

    /* JADX INFO: compiled from: DrawModifier.kt */
    public static final class a extends Lambda implements Function1<ContentDrawScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<DrawScope, Unit> f15443p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super DrawScope, Unit> function1) {
            super(1);
            this.f15443p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ContentDrawScope contentDrawScope) {
            ContentDrawScope onDrawWithContent = contentDrawScope;
            Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
            this.f15443p0.invoke(onDrawWithContent);
            onDrawWithContent.drawContent();
            return Unit.INSTANCE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getCacheParams$ui_release, reason: from getter */
    public final BuildDrawCacheParams getCacheParams() {
        return this.cacheParams;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.cacheParams.getDensity().getDensity();
    }

    @Nullable
    /* JADX INFO: renamed from: getDrawResult$ui_release, reason: from getter */
    public final DrawResult getDrawResult() {
        return this.drawResult;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.cacheParams.getDensity().getFontScale();
    }

    @NotNull
    public final LayoutDirection getLayoutDirection() {
        return this.cacheParams.getLayoutDirection();
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m2200getSizeNHjbRc() {
        return this.cacheParams.mo2199getSizeNHjbRc();
    }

    @NotNull
    public final DrawResult onDrawBehind(@NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return onDrawWithContent(new a(block));
    }

    @NotNull
    public final DrawResult onDrawWithContent(@NotNull Function1<? super ContentDrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        DrawResult drawResult = new DrawResult(block);
        this.drawResult = drawResult;
        return drawResult;
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public final /* synthetic */ int mo412roundToPxR2X_6o(long j10) {
        return x1.a.a(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public final /* synthetic */ int mo413roundToPx0680j_4(float f6) {
        return x1.a.b(this, f6);
    }

    public final void setCacheParams$ui_release(@NotNull BuildDrawCacheParams buildDrawCacheParams) {
        Intrinsics.checkNotNullParameter(buildDrawCacheParams, "<set-?>");
        this.cacheParams = buildDrawCacheParams;
    }

    public final void setDrawResult$ui_release(@Nullable DrawResult drawResult) {
        this.drawResult = drawResult;
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public final /* synthetic */ float mo404toDpGaN1DYA(long j10) {
        return x1.a.c(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final /* synthetic */ float mo405toDpu2uoSUM(float f6) {
        return x1.a.d(this, f6);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public final /* synthetic */ long mo407toDpSizekrfVVM(long j10) {
        return x1.a.f(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public final /* synthetic */ float mo414toPxR2X_6o(long j10) {
        return x1.a.g(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public final /* synthetic */ float mo415toPx0680j_4(float f6) {
        return x1.a.h(this, f6);
    }

    @Override // androidx.compose.ui.unit.Density
    public final /* synthetic */ Rect toRect(DpRect dpRect) {
        return x1.a.i(this, dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public final /* synthetic */ long mo408toSizeXkaWNTQ(long j10) {
        return x1.a.j(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public final /* synthetic */ long mo409toSp0xMU5do(float f6) {
        return x1.a.k(this, f6);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final /* synthetic */ long mo410toSpkPz2Gy4(float f6) {
        return x1.a.l(this, f6);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final /* synthetic */ float mo406toDpu2uoSUM(int i10) {
        return x1.a.e(this, i10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final /* synthetic */ long mo411toSpkPz2Gy4(int i10) {
        return x1.a.m(this, i10);
    }
}
