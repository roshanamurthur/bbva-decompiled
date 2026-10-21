package al;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* JADX INFO: compiled from: signatureEnhancement.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class c extends Lambda implements Function1<UnwrappedType, Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final c f262p0 = new c(1);

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(UnwrappedType unwrappedType) {
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = unwrappedType.getConstructor().mo5778getDeclarationDescriptor();
        if (classifierDescriptorMo5778getDeclarationDescriptor == null) {
            return Boolean.FALSE;
        }
        Name name = classifierDescriptorMo5778getDeclarationDescriptor.getName();
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        return Boolean.valueOf(Intrinsics.areEqual(name, javaToKotlinClassMap.getFUNCTION_N_FQ_NAME().shortName()) && Intrinsics.areEqual(DescriptorUtilsKt.fqNameOrNull(classifierDescriptorMo5778getDeclarationDescriptor), javaToKotlinClassMap.getFUNCTION_N_FQ_NAME()));
    }
}
