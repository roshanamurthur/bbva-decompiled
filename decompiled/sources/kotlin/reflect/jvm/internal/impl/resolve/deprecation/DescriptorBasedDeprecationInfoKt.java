package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DescriptorBasedDeprecationInfo.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DescriptorBasedDeprecationInfoKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final DescriptorBasedDeprecationInfoKt$DEPRECATED_FUNCTION_KEY$1 f81557a = new CallableDescriptor.UserDataKey<DescriptorBasedDeprecationInfo>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfoKt$DEPRECATED_FUNCTION_KEY$1
    };

    @NotNull
    public static final CallableDescriptor.UserDataKey<DescriptorBasedDeprecationInfo> getDEPRECATED_FUNCTION_KEY() {
        return f81557a;
    }
}
