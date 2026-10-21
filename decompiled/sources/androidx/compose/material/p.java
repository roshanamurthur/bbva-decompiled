package androidx.compose.material;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: BackdropScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ BackdropScaffoldState f8855p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f8856q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(BackdropScaffoldState backdropScaffoldState, CoroutineScope coroutineScope) {
        super(0);
        this.f8855p0 = backdropScaffoldState;
        this.f8856q0 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        BackdropScaffoldState backdropScaffoldState = this.f8855p0;
        if (backdropScaffoldState.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
            BuildersKt__Builders_commonKt.launch$default(this.f8856q0, null, null, new o(backdropScaffoldState, null), 3, null);
        }
        return Boolean.TRUE;
    }
}
