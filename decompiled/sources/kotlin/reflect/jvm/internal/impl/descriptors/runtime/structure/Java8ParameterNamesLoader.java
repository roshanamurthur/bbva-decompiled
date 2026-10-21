package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ReflectJavaMember.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nReflectJavaMember.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaMember.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/Java8ParameterNamesLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,105:1\n1#2:106\n11065#3:107\n11400#3,3:108\n*S KotlinDebug\n*F\n+ 1 ReflectJavaMember.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/Java8ParameterNamesLoader\n*L\n100#1:107\n100#1:108,3\n*E\n"})
public final class Java8ParameterNamesLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Java8ParameterNamesLoader f80426a = new Java8ParameterNamesLoader();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static Cache f80427b;

    /* JADX INFO: compiled from: ReflectJavaMember.kt */
    public static final class Cache {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Method f80428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Method f80429b;

        public Cache(@Nullable Method method, @Nullable Method method2) {
            this.f80428a = method;
            this.f80429b = method2;
        }

        @Nullable
        public final Method getGetName() {
            return this.f80429b;
        }

        @Nullable
        public final Method getGetParameters() {
            return this.f80428a;
        }
    }

    @NotNull
    public final Cache buildCache(@NotNull Member member) {
        Intrinsics.checkNotNullParameter(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new Cache(cls.getMethod("getParameters", new Class[0]), ReflectClassUtilKt.getSafeClassLoader(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new Cache(null, null);
        }
    }

    @Nullable
    public final List<String> loadParameterNames(@NotNull Member member) throws IllegalAccessException, InvocationTargetException {
        Method getName;
        Intrinsics.checkNotNullParameter(member, "member");
        Cache cacheBuildCache = f80427b;
        if (cacheBuildCache == null) {
            synchronized (this) {
                cacheBuildCache = f80427b;
                if (cacheBuildCache == null) {
                    cacheBuildCache = f80426a.buildCache(member);
                    f80427b = cacheBuildCache;
                }
            }
        }
        Method getParameters = cacheBuildCache.getGetParameters();
        if (getParameters == null || (getName = cacheBuildCache.getGetName()) == null) {
            return null;
        }
        Object objInvoke = getParameters.invoke(member, new Object[0]);
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) objInvoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object objInvoke2 = getName.invoke(obj, new Object[0]);
            Intrinsics.checkNotNull(objInvoke2, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) objInvoke2);
        }
        return arrayList;
    }
}
