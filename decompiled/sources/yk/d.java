package yk;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyJavaStaticClassScope.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class d extends Lambda implements Function1<KotlinType, ClassDescriptor> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final d f94871p0 = new d(1);

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final ClassDescriptor invoke(KotlinType kotlinType) {
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = kotlinType.getConstructor().mo5778getDeclarationDescriptor();
        if (classifierDescriptorMo5778getDeclarationDescriptor instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo5778getDeclarationDescriptor;
        }
        return null;
    }
}
