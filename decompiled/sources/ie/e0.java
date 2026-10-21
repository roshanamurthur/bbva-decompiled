package ie;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e0 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDynamicColors f69610b;

    public /* synthetic */ e0(MaterialDynamicColors materialDynamicColors, int i10) {
        this.f69609a = i10;
        this.f69610b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69609a) {
            case 0:
                return this.f69610b.highestSurface((DynamicScheme) obj);
            case 1:
                return this.f69610b.highestSurface((DynamicScheme) obj);
            default:
                return this.f69610b.primaryFixed();
        }
    }
}
