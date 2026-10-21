package com.esotericsoftware.kryo.serializers;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40047a;

    public /* synthetic */ r(int i10) {
        this.f40047a = i10;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f40047a) {
            case 0:
                return ((RecordSerializer.a) obj).f40038b;
            case 1:
                return Double.valueOf(MaterialDynamicColors.b((DynamicScheme) obj) ? 80.0d : 90.0d);
            case 2:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 40.0d : 80.0d);
            case 3:
                return Double.valueOf(MaterialDynamicColors.b((DynamicScheme) obj) ? 100.0d : 10.0d);
            case 4:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 10.0d : 90.0d);
            case 5:
                return ((DynamicScheme) obj).neutralPalette;
            default:
                return Double.valueOf(MaterialDynamicColors.b((DynamicScheme) obj) ? 25.0d : 30.0d);
        }
    }
}
