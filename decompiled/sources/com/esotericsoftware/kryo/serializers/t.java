package com.esotericsoftware.kryo.serializers;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class t implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40048a;

    public /* synthetic */ t(int i10) {
        this.f40048a = i10;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f40048a) {
            case 0:
                return ((RecordSerializer.a) obj).f40037a;
            case 1:
                return ((DynamicScheme) obj).primaryPalette;
            case 2:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 100.0d : 0.0d);
            default:
                return ((DynamicScheme) obj).secondaryPalette;
        }
    }
}
