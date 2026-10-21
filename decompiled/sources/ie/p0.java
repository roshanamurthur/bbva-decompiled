package ie;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p0 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69642a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69642a) {
            case 0:
                return ((DynamicScheme) obj).primaryPalette;
            default:
                return ((DynamicScheme) obj).neutralPalette;
        }
    }
}
