package androidx.window.layout;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SafeWindowLayoutComponentProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ClassLoader f24233p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ClassLoader classLoader) {
        super(0);
        this.f24233p0 = classLoader;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() throws NoSuchMethodException {
        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
        ClassLoader classLoader = this.f24233p0;
        boolean z10 = false;
        Method getWindowLayoutComponentMethod = SafeWindowLayoutComponentProvider.access$windowExtensionsClass(safeWindowLayoutComponentProvider, classLoader).getMethod("getWindowLayoutComponent", new Class[0]);
        Class windowLayoutComponentClass = SafeWindowLayoutComponentProvider.access$windowLayoutComponentClass(safeWindowLayoutComponentProvider, classLoader);
        Intrinsics.checkNotNullExpressionValue(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
        if (SafeWindowLayoutComponentProvider.access$isPublic(safeWindowLayoutComponentProvider, getWindowLayoutComponentMethod)) {
            Intrinsics.checkNotNullExpressionValue(windowLayoutComponentClass, "windowLayoutComponentClass");
            if (SafeWindowLayoutComponentProvider.access$doesReturn(safeWindowLayoutComponentProvider, getWindowLayoutComponentMethod, windowLayoutComponentClass)) {
                z10 = true;
            }
        }
        return Boolean.valueOf(z10);
    }
}
