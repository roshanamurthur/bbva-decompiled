package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JavaForKotlinOverridePropertyDescriptor.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class JavaForKotlinOverridePropertyDescriptor extends JavaPropertyDescriptor {

    @NotNull
    public final SimpleFunctionDescriptor V0;

    @Nullable
    public final SimpleFunctionDescriptor W0;

    @NotNull
    public final PropertyDescriptor X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaForKotlinOverridePropertyDescriptor(@NotNull ClassDescriptor ownerDescriptor, @NotNull SimpleFunctionDescriptor getterMethod, @Nullable SimpleFunctionDescriptor simpleFunctionDescriptor, @NotNull PropertyDescriptor overriddenProperty) {
        super(ownerDescriptor, Annotations.Companion.getEMPTY(), getterMethod.getModality(), getterMethod.getVisibility(), simpleFunctionDescriptor != null, overriddenProperty.getName(), getterMethod.getSource(), null, CallableMemberDescriptor.Kind.DECLARATION, false, null);
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        Intrinsics.checkNotNullParameter(getterMethod, "getterMethod");
        Intrinsics.checkNotNullParameter(overriddenProperty, "overriddenProperty");
        this.V0 = getterMethod;
        this.W0 = simpleFunctionDescriptor;
        this.X0 = overriddenProperty;
    }
}
