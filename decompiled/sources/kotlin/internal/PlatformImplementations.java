package kotlin.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.MatchResult;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.FallbackThreadLocalRandom;
import kotlin.random.Random;
import kotlin.text.MatchGroup;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PlatformImplementations.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016¨\u0006\u0014"}, d2 = {"Lkotlin/internal/PlatformImplementations;", "", "", "cause", "exception", "", "addSuppressed", "", "getSuppressed", "Ljava/util/regex/MatchResult;", "matchResult", "", "name", "Lkotlin/text/MatchGroup;", "getMatchResultNamedGroup", "Lkotlin/random/Random;", "defaultPlatformRandom", "<init>", "()V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
public class PlatformImplementations {

    /* JADX INFO: compiled from: PlatformImplementations.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/internal/PlatformImplementations$a;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations$ReflectThrowable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f79612a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @JvmField
        @Nullable
        public static final Method f79613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @JvmField
        @Nullable
        public static final Method f79614c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            Intrinsics.checkNotNull(methods);
            int length = methods.length;
            int i10 = 0;
            while (true) {
                method = null;
                if (i10 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i10];
                if (Intrinsics.areEqual(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                    if (Intrinsics.areEqual(ArraysKt___ArraysKt.singleOrNull(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i10++;
            }
            f79613b = method2;
            for (Method method3 : methods) {
                if (Intrinsics.areEqual(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
            }
            f79614c = method;
        }
    }

    public void addSuppressed(@NotNull Throwable cause, @NotNull Throwable exception) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Method method = a.f79613b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    @NotNull
    public Random defaultPlatformRandom() {
        return new FallbackThreadLocalRandom();
    }

    @Nullable
    public MatchGroup getMatchResultNamedGroup(@NotNull MatchResult matchResult, @NotNull String name) {
        Intrinsics.checkNotNullParameter(matchResult, "matchResult");
        Intrinsics.checkNotNullParameter(name, "name");
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    @NotNull
    public List<Throwable> getSuppressed(@NotNull Throwable exception) {
        Object objInvoke;
        List<Throwable> listAsList;
        Intrinsics.checkNotNullParameter(exception, "exception");
        Method method = a.f79614c;
        return (method == null || (objInvoke = method.invoke(exception, new Object[0])) == null || (listAsList = ArraysKt___ArraysJvmKt.asList((Throwable[]) objInvoke)) == null) ? CollectionsKt__CollectionsKt.emptyList() : listAsList;
    }
}
