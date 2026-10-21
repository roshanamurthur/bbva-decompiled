package t;

import androidx.compose.foundation.IndicationInstance;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Indication.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements DrawModifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IndicationInstance f93366a;

    public c0(@NotNull IndicationInstance indicationInstance) {
        Intrinsics.checkNotNullParameter(indicationInstance, "indicationInstance");
        this.f93366a = indicationInstance;
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
        this.f93366a.drawIndication(contentDrawScope);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return u0.f.c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return u0.f.d(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return u0.e.a(this, modifier);
    }
}
