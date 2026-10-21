package kc;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.bbva.ui.compose.TopAppBarKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TopAppBar.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class h extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f79309p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f79310q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i10, int i11) {
        super(2);
        this.f79309p0 = i10;
        this.f79310q0 = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f79310q0 | 1);
        TopAppBarKt.access$TitleComponent(this.f79309p0, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
