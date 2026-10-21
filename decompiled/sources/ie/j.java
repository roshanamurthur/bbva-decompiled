package ie;

import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDynamicColors f69624b;

    public /* synthetic */ j(MaterialDynamicColors materialDynamicColors, int i10) {
        this.f69623a = i10;
        this.f69624b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69623a) {
            case 0:
                return this.f69624b.errorContainer();
            default:
                return this.f69624b.tertiaryFixedDim();
        }
    }
}
