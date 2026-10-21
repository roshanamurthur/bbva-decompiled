package androidx.window.layout;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SafeWindowLayoutComponentProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ClassLoader f24235p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ClassLoader classLoader) {
        super(0);
        this.f24235p0 = classLoader;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() throws NoSuchMethodException {
        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
        ClassLoader classLoader = this.f24235p0;
        boolean z10 = false;
        Method getWindowExtensionsMethod = SafeWindowLayoutComponentProvider.access$windowExtensionsProviderClass(safeWindowLayoutComponentProvider, classLoader).getDeclaredMethod("getWindowExtensions", new Class[0]);
        Class windowExtensionsClass = SafeWindowLayoutComponentProvider.access$windowExtensionsClass(safeWindowLayoutComponentProvider, classLoader);
        Intrinsics.checkNotNullExpressionValue(getWindowExtensionsMethod, "getWindowExtensionsMethod");
        Intrinsics.checkNotNullExpressionValue(windowExtensionsClass, "windowExtensionsClass");
        if (SafeWindowLayoutComponentProvider.access$doesReturn(safeWindowLayoutComponentProvider, getWindowExtensionsMethod, windowExtensionsClass) && SafeWindowLayoutComponentProvider.access$isPublic(safeWindowLayoutComponentProvider, getWindowExtensionsMethod)) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
