package ie;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o0 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDynamicColors f69640b;

    public /* synthetic */ o0(MaterialDynamicColors materialDynamicColors, int i10) {
        this.f69639a = i10;
        this.f69640b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69639a) {
            case 0:
                return this.f69640b.highestSurface((DynamicScheme) obj);
            default:
                return this.f69640b.tertiaryFixed();
        }
    }
}
