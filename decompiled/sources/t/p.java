package t;

import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidOverscroll.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p extends InspectorValueInfo implements DrawModifier {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final AndroidEdgeEffectOverscrollEffect f93428c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(@NotNull AndroidEdgeEffectOverscrollEffect overscrollEffect, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(overscrollEffect, "overscrollEffect");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f93428c = overscrollEffect;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean all(Function1 function1) {
        return u0.f.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean any(Function1 function1) {
        return u0.f.b(this, function1);
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public final void draw(@NotNull ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        contentDrawScope.drawContent();
        this.f93428c.drawOverscroll(contentDrawScope);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return Intrinsics.areEqual(this.f93428c, ((p) obj).f93428c);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return u0.f.c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return u0.f.d(this, obj, function2);
    }

    public final int hashCode() {
        return this.f93428c.hashCode();
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return u0.e.a(this, modifier);
    }

    @NotNull
    public final String toString() {
        return "DrawOverscrollModifier(overscrollEffect=" + this.f93428c + RootService.CLOSE_BRACKET;
    }
}
