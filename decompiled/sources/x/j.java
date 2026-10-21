package x;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BoxWithConstraints.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBoxWithConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
public final class j implements BoxWithConstraintsScope, BoxScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Density f94355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f94356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BoxScopeInstance f94357c;

    public j(Density density, long j10) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.f94355a = density;
        this.f94356b = j10;
        this.f94357c = BoxScopeInstance.INSTANCE;
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    @Stable
    @NotNull
    public final Modifier align(@NotNull Modifier modifier, @NotNull Alignment alignment) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return this.f94357c.align(modifier, alignment);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f94355a, jVar.f94355a) && Constraints.m4351equalsimpl0(this.f94356b, jVar.f94356b);
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* JADX INFO: renamed from: getConstraints-msEJaDk */
    public final long mo260getConstraintsmsEJaDk() {
        return this.f94356b;
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* JADX INFO: renamed from: getMaxHeight-D9Ej5fM */
    public final float mo261getMaxHeightD9Ej5fM() {
        long j10 = this.f94356b;
        if (!Constraints.m4352getHasBoundedHeightimpl(j10)) {
            return Dp.INSTANCE.m4408getInfinityD9Ej5fM();
        }
        return this.f94355a.mo406toDpu2uoSUM(Constraints.m4356getMaxHeightimpl(j10));
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* JADX INFO: renamed from: getMaxWidth-D9Ej5fM */
    public final float mo262getMaxWidthD9Ej5fM() {
        long j10 = this.f94356b;
        if (!Constraints.m4353getHasBoundedWidthimpl(j10)) {
            return Dp.INSTANCE.m4408getInfinityD9Ej5fM();
        }
        return this.f94355a.mo406toDpu2uoSUM(Constraints.m4357getMaxWidthimpl(j10));
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM */
    public final float mo263getMinHeightD9Ej5fM() {
        return this.f94355a.mo406toDpu2uoSUM(Constraints.m4358getMinHeightimpl(this.f94356b));
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM */
    public final float mo264getMinWidthD9Ej5fM() {
        return this.f94355a.mo406toDpu2uoSUM(Constraints.m4359getMinWidthimpl(this.f94356b));
    }

    public final int hashCode() {
        return Constraints.m4360hashCodeimpl(this.f94356b) + (this.f94355a.hashCode() * 31);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    @Stable
    @NotNull
    public final Modifier matchParentSize(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return this.f94357c.matchParentSize(modifier);
    }

    @NotNull
    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f94355a + ", constraints=" + ((Object) Constraints.m4362toStringimpl(this.f94356b)) + RootService.CLOSE_BRACKET;
    }
}
