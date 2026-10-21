package androidx.lifecycle;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;

/* JADX INFO: compiled from: StateViewModelFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends Lambda implements Function0<ParametersHolder> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ParametersHolder f22185p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ SavedStateHandle f22186q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ParametersHolder parametersHolder, SavedStateHandle savedStateHandle) {
        super(0);
        this.f22185p0 = parametersHolder;
        this.f22186q0 = savedStateHandle;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ParametersHolder invoke() {
        return this.f22185p0.add(this.f22186q0);
    }
}
