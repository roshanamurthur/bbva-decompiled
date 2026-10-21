package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: util.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/CreateKCallableVisitor;", "Lkotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorVisitorEmptyBodies;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "descriptor", "data", "visitFunctionDescriptor", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "visitPropertyDescriptor", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nutil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 util.kt\nkotlin/reflect/jvm/internal/CreateKCallableVisitor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,330:1\n1#2:331\n*E\n"})
public class CreateKCallableVisitor extends DeclarationDescriptorVisitorEmptyBodies<KCallableImpl<?>, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KDeclarationContainerImpl f79856a;

    public CreateKCallableVisitor(@NotNull KDeclarationContainerImpl container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f79856a = container;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    @NotNull
    public KCallableImpl<?> visitFunctionDescriptor(@NotNull FunctionDescriptor descriptor, @NotNull Unit data) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(data, "data");
        return new KFunctionImpl(this.f79856a, descriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    @NotNull
    public KCallableImpl<?> visitPropertyDescriptor(@NotNull PropertyDescriptor descriptor, @NotNull Unit data) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(data, "data");
        int i10 = (descriptor.getDispatchReceiverParameter() != null ? 1 : 0) + (descriptor.getExtensionReceiverParameter() != null ? 1 : 0);
        boolean zIsVar = descriptor.isVar();
        KDeclarationContainerImpl kDeclarationContainerImpl = this.f79856a;
        if (zIsVar) {
            if (i10 == 0) {
                return new KMutableProperty0Impl(kDeclarationContainerImpl, descriptor);
            }
            if (i10 == 1) {
                return new KMutableProperty1Impl(kDeclarationContainerImpl, descriptor);
            }
            if (i10 == 2) {
                return new KMutableProperty2Impl(kDeclarationContainerImpl, descriptor);
            }
        } else {
            if (i10 == 0) {
                return new KProperty0Impl(kDeclarationContainerImpl, descriptor);
            }
            if (i10 == 1) {
                return new KProperty1Impl(kDeclarationContainerImpl, descriptor);
            }
            if (i10 == 2) {
                return new KProperty2Impl(kDeclarationContainerImpl, descriptor);
            }
        }
        throw new KotlinReflectionInternalError("Unsupported property: " + descriptor);
    }
}
