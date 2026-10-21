package ie;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k0 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDynamicColors f69628b;

    public /* synthetic */ k0(MaterialDynamicColors materialDynamicColors, int i10) {
        this.f69627a = i10;
        this.f69628b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69627a) {
            case 0:
                return this.f69628b.secondary();
            default:
                return this.f69628b.highestSurface((DynamicScheme) obj);
        }
    }
}
