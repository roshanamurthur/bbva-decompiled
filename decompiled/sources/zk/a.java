package zk;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JavaTypeResolver.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a extends Lambda implements Function0<KotlinType> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ JavaTypeResolver f95091p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ TypeParameterDescriptor f95092q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ JavaTypeAttributes f95093r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ TypeConstructor f95094s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ JavaClassifierType f95095t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(JavaTypeResolver javaTypeResolver, TypeParameterDescriptor typeParameterDescriptor, JavaTypeAttributes javaTypeAttributes, TypeConstructor typeConstructor, JavaClassifierType javaClassifierType) {
        super(0);
        this.f95091p0 = javaTypeResolver;
        this.f95092q0 = typeParameterDescriptor;
        this.f95093r0 = javaTypeAttributes;
        this.f95094s0 = typeConstructor;
        this.f95095t0 = javaClassifierType;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final KotlinType invoke() {
        TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = this.f95091p0.f80761d;
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = this.f95094s0.mo5778getDeclarationDescriptor();
        return typeParameterUpperBoundEraser.getErasedUpperBound(this.f95092q0, this.f95093r0.withDefaultType(classifierDescriptorMo5778getDeclarationDescriptor != null ? classifierDescriptorMo5778getDeclarationDescriptor.getDefaultType() : null).markIsRaw(this.f95095t0.isRaw()));
    }
}
