package org.koin.ext;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: KClassExt.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000e\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000\u001a\u000e\u0010\u0003\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/KClass;", "", "getFullName", "saveCache", "koin-core"}, k = 2, mv = {1, 8, 0})
public final class KClassExtKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Map<KClass<?>, String> f92492a = KoinPlatformTools.INSTANCE.safeHashMap();

    @NotNull
    public static final String getFullName(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        String str = f92492a.get(kClass);
        return str == null ? saveCache(kClass) : str;
    }

    @NotNull
    public static final String saveCache(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        String className = KoinPlatformTools.INSTANCE.getClassName(kClass);
        f92492a.put(kClass, className);
        return className;
    }
}
