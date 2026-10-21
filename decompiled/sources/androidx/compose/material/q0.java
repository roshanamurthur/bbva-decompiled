package androidx.compose.material;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Drawer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends Lambda implements Function0<Float> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ float f8911p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ DrawerState f8912q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(float f6, DrawerState drawerState) {
        super(0);
        this.f8911p0 = f6;
        this.f8912q0 = drawerState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        float fRequireOffset$material_release = this.f8912q0.requireOffset$material_release();
        float f6 = this.f8911p0;
        return Float.valueOf(kotlin.ranges.c.coerceIn((fRequireOffset$material_release - f6) / (0.0f - f6), 0.0f, 1.0f));
    }
}
