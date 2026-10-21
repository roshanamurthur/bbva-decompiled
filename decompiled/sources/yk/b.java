package yk;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LazyJavaScope.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class b extends Lambda implements Function1<SimpleFunctionDescriptor, CallableDescriptor> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final b f94869p0 = new b(1);

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final CallableDescriptor invoke(@NotNull SimpleFunctionDescriptor selectMostSpecificInEachOverridableGroup) {
        Intrinsics.checkNotNullParameter(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }
}
