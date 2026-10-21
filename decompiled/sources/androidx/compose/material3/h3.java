package androidx.compose.material3;

import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SearchBar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h3 extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ State<Float> f12869p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(State<Float> state) {
        super(0);
        this.f12869p0 = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.f12869p0.getValue().floatValue() > 0.0f);
    }
}
