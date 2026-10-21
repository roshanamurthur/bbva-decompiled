package g1;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OnRemeasuredModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r extends InspectorValueInfo implements OnRemeasuredModifier {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function1<IntSize, Unit> f68580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f68581d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(@NotNull Function1<? super IntSize, Unit> onSizeChanged, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(onSizeChanged, "onSizeChanged");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f68580c = onSizeChanged;
        this.f68581d = IntSizeKt.IntSize(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean all(Function1 function1) {
        return u0.f.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean any(Function1 function1) {
        return u0.f.b(this, function1);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        return Intrinsics.areEqual(this.f68580c, ((r) obj).f68580c);
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
        return this.f68580c.hashCode();
    }

    @Override // androidx.compose.ui.layout.OnRemeasuredModifier
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI */
    public final void mo176onRemeasuredozmzZPI(long j10) {
        if (IntSize.m4547equalsimpl0(this.f68581d, j10)) {
            return;
        }
        this.f68580c.invoke(IntSize.m4541boximpl(j10));
        this.f68581d = j10;
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return u0.e.a(this, modifier);
    }
}
