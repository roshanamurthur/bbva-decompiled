package androidx.window.layout;

import android.os.Build;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SafeWindowLayoutComponentProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/window/layout/SafeWindowLayoutComponentProvider;", "", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "a", "Lkotlin/Lazy;", "getWindowLayoutComponent", "()Landroidx/window/extensions/layout/WindowLayoutComponent;", "windowLayoutComponent", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class SafeWindowLayoutComponentProvider {

    @NotNull
    public static final SafeWindowLayoutComponentProvider INSTANCE = new SafeWindowLayoutComponentProvider();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy windowLayoutComponent = LazyKt__LazyJVMKt.lazy(a.f24180p0);

    /* JADX INFO: compiled from: SafeWindowLayoutComponentProvider.kt */
    public static final class a extends Lambda implements Function0<WindowLayoutComponent> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f24180p0 = new a(0);

        @Nullable
        public static WindowLayoutComponent b() {
            ClassLoader classLoader = SafeWindowLayoutComponentProvider.class.getClassLoader();
            if (classLoader == null || !SafeWindowLayoutComponentProvider.access$canUseWindowLayoutComponent(SafeWindowLayoutComponentProvider.INSTANCE, classLoader)) {
                return null;
            }
            try {
                return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
            } catch (UnsupportedOperationException unused) {
                return null;
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ WindowLayoutComponent invoke() {
            return b();
        }
    }

    public static boolean a(Function0 function0) {
        try {
            return ((Boolean) function0.invoke()).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    public static final boolean access$canUseWindowLayoutComponent(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider, ClassLoader classLoader) {
        safeWindowLayoutComponentProvider.getClass();
        return Build.VERSION.SDK_INT >= 24 && a(new j(classLoader)) && a(new g(classLoader)) && a(new i(classLoader)) && a(new f(classLoader));
    }

    public static final boolean access$doesReturn(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider, Method method, Class cls) {
        safeWindowLayoutComponentProvider.getClass();
        return method.getReturnType().equals(cls);
    }

    public static final Class access$foldingFeatureClass(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider, ClassLoader classLoader) {
        safeWindowLayoutComponentProvider.getClass();
        return classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
    }

    public static final boolean access$isPublic(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider, Method method) {
        safeWindowLayoutComponentProvider.getClass();
        return Modifier.isPublic(method.getModifiers());
    }

    public static final Class access$windowExtensionsClass(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider, ClassLoader classLoader) {
        safeWindowLayoutComponentProvider.getClass();
        return classLoader.loadClass("androidx.window.extensions.WindowExtensions");
    }

    public static final Class access$windowExtensionsProviderClass(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider, ClassLoader classLoader) {
        safeWindowLayoutComponentProvider.getClass();
        return classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    public static final Class access$windowLayoutComponentClass(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider, ClassLoader classLoader) {
        safeWindowLayoutComponentProvider.getClass();
        return classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    }

    @Nullable
    public final WindowLayoutComponent getWindowLayoutComponent() {
        return (WindowLayoutComponent) windowLayoutComponent.getValue();
    }

    public static final boolean access$doesReturn(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider, Method method, KClass kClass) {
        safeWindowLayoutComponentProvider.getClass();
        return method.getReturnType().equals(JvmClassMappingKt.getJavaClass(kClass));
    }
}
