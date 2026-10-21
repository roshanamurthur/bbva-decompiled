package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KFunction;

/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.7")
public class FunInterfaceConstructorReference extends FunctionReference {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Class f79724p0;

    public FunInterfaceConstructorReference(Class cls) {
        super(1);
        this.f79724p0 = cls;
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FunInterfaceConstructorReference) {
            return this.f79724p0.equals(((FunInterfaceConstructorReference) obj).f79724p0);
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public int hashCode() {
        return this.f79724p0.hashCode();
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public String toString() {
        return "fun interface ".concat(this.f79724p0.getName());
    }

    @Override // kotlin.jvm.internal.FunctionReference, kotlin.jvm.internal.CallableReference
    public KFunction getReflected() {
        throw new UnsupportedOperationException("Functional interface constructor does not support reflection");
    }
}
