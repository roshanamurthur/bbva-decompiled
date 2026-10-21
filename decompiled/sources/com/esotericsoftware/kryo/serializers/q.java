package com.esotericsoftware.kryo.serializers;

import com.google.android.material.color.utilities.DynamicScheme;
import io.reactivex.rxjava3.core.Maybe;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40046a;

    public /* synthetic */ q(int i10) {
        this.f40046a = i10;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f40046a) {
            case 0:
                return ((RecordSerializer.a) obj).f40037a;
            case 1:
                return Double.valueOf(10.0d);
            case 2:
                return ((DynamicScheme) obj).neutralPalette;
            case 3:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 30.0d : 80.0d);
            case 4:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 5:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 30.0d : 90.0d);
            default:
                return Maybe.just(obj);
        }
    }
}
