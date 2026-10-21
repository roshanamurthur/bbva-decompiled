package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DebugMetadata.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0007"}, d2 = {"Lkotlin/coroutines/jvm/internal/a;", "", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "continuation", "", "getModuleName", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/ModuleNameRetriever\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f79604a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C0435a f79605b = new C0435a(null, null, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static C0435a f79606c;

    /* JADX INFO: renamed from: kotlin.coroutines.jvm.internal.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DebugMetadata.kt */
    public static final class C0435a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @JvmField
        @Nullable
        public final Method f79607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @JvmField
        @Nullable
        public final Method f79608b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @JvmField
        @Nullable
        public final Method f79609c;

        public C0435a(@Nullable Method method, @Nullable Method method2, @Nullable Method method3) {
            this.f79607a = method;
            this.f79608b = method2;
            this.f79609c = method3;
        }
    }

    @Nullable
    public final String getModuleName(@NotNull BaseContinuationImpl continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        C0435a c0435a = f79606c;
        C0435a c0435a2 = f79605b;
        if (c0435a == null) {
            try {
                C0435a c0435a3 = new C0435a(Class.class.getDeclaredMethod("getModule", new Class[0]), continuation.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), continuation.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                f79606c = c0435a3;
                c0435a = c0435a3;
            } catch (Exception unused) {
                f79606c = c0435a2;
                c0435a = c0435a2;
            }
        }
        if (c0435a == c0435a2) {
            return null;
        }
        Method method = c0435a.f79607a;
        Object objInvoke = method != null ? method.invoke(continuation.getClass(), new Object[0]) : null;
        if (objInvoke == null) {
            return null;
        }
        Method method2 = c0435a.f79608b;
        Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, new Object[0]) : null;
        if (objInvoke2 == null) {
            return null;
        }
        Method method3 = c0435a.f79609c;
        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}
