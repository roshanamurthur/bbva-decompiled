package rk;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RuntimeTypeMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class c extends Lambda implements Function1<Class<?>, CharSequence> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final c f93104p0 = new c(1);

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final CharSequence invoke(Class<?> cls) {
        Intrinsics.checkNotNull(cls);
        return ReflectClassUtilKt.getDesc(cls);
    }
}
