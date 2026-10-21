package tk;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

/* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class e extends Lambda implements Function1<CallableMemberDescriptor, Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ JvmBuiltInsCustomizer f93623p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        super(1);
        this.f93623p0 = jvmBuiltInsCustomizer;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
        boolean z10;
        if (callableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.DECLARATION) {
            JavaToKotlinClassMapper javaToKotlinClassMapper = this.f93623p0.f80174b;
            DeclarationDescriptor containingDeclaration = callableMemberDescriptor.getContainingDeclaration();
            Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            if (javaToKotlinClassMapper.isMutable((ClassDescriptor) containingDeclaration)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
