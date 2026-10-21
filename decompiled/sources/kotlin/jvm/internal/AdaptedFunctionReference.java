package kotlin.jvm.internal;

import androidx.camera.camera2.internal.n1;
import java.io.Serializable;
import kotlin.SinceKotlin;
import kotlin.reflect.KDeclarationContainer;

/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.4")
public class AdaptedFunctionReference implements FunctionBase, Serializable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Class f79707p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f79708q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final String f79709r0;
    protected final Object receiver;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f79710s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f79711t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f79712u0;

    public AdaptedFunctionReference(int i10, Class cls, String str, String str2, int i11) {
        this(i10, CallableReference.NO_RECEIVER, cls, str, str2, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdaptedFunctionReference)) {
            return false;
        }
        AdaptedFunctionReference adaptedFunctionReference = (AdaptedFunctionReference) obj;
        return this.f79710s0 == adaptedFunctionReference.f79710s0 && this.f79711t0 == adaptedFunctionReference.f79711t0 && this.f79712u0 == adaptedFunctionReference.f79712u0 && Intrinsics.areEqual(this.receiver, adaptedFunctionReference.receiver) && Intrinsics.areEqual(this.f79707p0, adaptedFunctionReference.f79707p0) && this.f79708q0.equals(adaptedFunctionReference.f79708q0) && this.f79709r0.equals(adaptedFunctionReference.f79709r0);
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.f79711t0;
    }

    public KDeclarationContainer getOwner() {
        Class cls = this.f79707p0;
        if (cls == null) {
            return null;
        }
        return this.f79710s0 ? Reflection.getOrCreateKotlinPackage(cls) : Reflection.getOrCreateKotlinClass(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f79707p0;
        return ((((n1.c(this.f79709r0, n1.c(this.f79708q0, (iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31), 31) + (this.f79710s0 ? 1231 : 1237)) * 31) + this.f79711t0) * 31) + this.f79712u0;
    }

    public String toString() {
        return Reflection.renderLambdaToString(this);
    }

    public AdaptedFunctionReference(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.receiver = obj;
        this.f79707p0 = cls;
        this.f79708q0 = str;
        this.f79709r0 = str2;
        this.f79710s0 = (i11 & 1) == 1;
        this.f79711t0 = i10;
        this.f79712u0 = i11 >> 1;
    }
}
