package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import org.jetbrains.annotations.NotNull;
import rk.e;

/* JADX INFO: compiled from: moduleByClassLoader.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000\u001a\b\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\u0005"}, d2 = {"Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "getOrCreateModule", "", "clearModuleByClassLoaderCache", "kotlin-reflection"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nmoduleByClassLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 moduleByClassLoader.kt\nkotlin/reflect/jvm/internal/ModuleByClassLoaderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n1#2:76\n*E\n"})
public final class ModuleByClassLoaderKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ConcurrentHashMap f80029a = new ConcurrentHashMap();

    public static final void clearModuleByClassLoaderCache() {
        f80029a.clear();
    }

    @NotNull
    public static final RuntimeModuleData getOrCreateModule(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        ClassLoader safeClassLoader = ReflectClassUtilKt.getSafeClassLoader(cls);
        e eVar = new e(safeClassLoader);
        ConcurrentHashMap concurrentHashMap = f80029a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(eVar);
        if (weakReference != null) {
            RuntimeModuleData runtimeModuleData = (RuntimeModuleData) weakReference.get();
            if (runtimeModuleData != null) {
                return runtimeModuleData;
            }
            concurrentHashMap.remove(eVar, weakReference);
        }
        RuntimeModuleData runtimeModuleDataCreate = RuntimeModuleData.Companion.create(safeClassLoader);
        while (true) {
            try {
                WeakReference weakReference2 = (WeakReference) concurrentHashMap.putIfAbsent(eVar, new WeakReference(runtimeModuleDataCreate));
                if (weakReference2 == null) {
                    eVar.setTemporaryStrongRef(null);
                    return runtimeModuleDataCreate;
                }
                RuntimeModuleData runtimeModuleData2 = (RuntimeModuleData) weakReference2.get();
                if (runtimeModuleData2 != null) {
                    eVar.setTemporaryStrongRef(null);
                    return runtimeModuleData2;
                }
                concurrentHashMap.remove(eVar, weakReference2);
            } catch (Throwable th2) {
                eVar.setTemporaryStrongRef(null);
                throw th2;
            }
        }
    }
}
