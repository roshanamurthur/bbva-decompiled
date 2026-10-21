package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: TypeParameterErasureOptions.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class TypeParameterErasureOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f81977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f81978b;

    public TypeParameterErasureOptions(boolean z10, boolean z11) {
        this.f81977a = z10;
        this.f81978b = z11;
    }

    public final boolean getIntersectUpperBounds() {
        return this.f81978b;
    }

    public final boolean getLeaveNonTypeParameterTypes() {
        return this.f81977a;
    }
}
