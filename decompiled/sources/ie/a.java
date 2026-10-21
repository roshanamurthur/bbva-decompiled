package ie;

import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f69597b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f69596a = i10;
        this.f69597b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69596a) {
            case 0:
                return Double.valueOf(((Hct) this.f69597b).getTone());
            default:
                return ((MaterialDynamicColors) this.f69597b).primaryFixedDim();
        }
    }
}
