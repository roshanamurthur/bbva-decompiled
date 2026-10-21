package ie;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDynamicColors f69605b;

    public /* synthetic */ d(MaterialDynamicColors materialDynamicColors, int i10) {
        this.f69604a = i10;
        this.f69605b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69604a) {
            case 0:
                return this.f69605b.highestSurface((DynamicScheme) obj);
            case 1:
                return this.f69605b.inverseSurface();
            case 2:
                return this.f69605b.primaryFixedDim();
            default:
                return this.f69605b.secondaryFixedDim();
        }
    }
}
