package ie;

import com.google.android.material.color.utilities.DynamicScheme;
import io.reactivex.rxjava3.core.Flowable;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class z implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69663a;

    public /* synthetic */ z(int i10) {
        this.f69663a = i10;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i10 = this.f69663a;
        Double dValueOf = Double.valueOf(0.0d);
        switch (i10) {
            case 0:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 80.0d : 40.0d);
            case 1:
                return dValueOf;
            case 2:
                return dValueOf;
            case 3:
                return ((DynamicScheme) obj).neutralVariantPalette;
            case 4:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 10.0d : 90.0d);
            default:
                return Flowable.just(obj);
        }
    }
}
