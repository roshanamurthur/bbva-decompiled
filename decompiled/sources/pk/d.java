package pk;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class d extends FunctionReferenceImpl implements Function1<Class<?>, Class<?>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final d f92697p0 = new d();

    public d() {
        super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Class<?> invoke(@NotNull Class<?> p4) {
        Intrinsics.checkNotNullParameter(p4, "p0");
        return p4.getComponentType();
    }
}
