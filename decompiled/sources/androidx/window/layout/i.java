package androidx.window.layout;

import android.app.Activity;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SafeWindowLayoutComponentProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ClassLoader f24234p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ClassLoader classLoader) {
        super(0);
        this.f24234p0 = classLoader;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() throws NoSuchMethodException {
        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
        Class clsAccess$windowLayoutComponentClass = SafeWindowLayoutComponentProvider.access$windowLayoutComponentClass(safeWindowLayoutComponentProvider, this.f24234p0);
        boolean z10 = false;
        Method addListenerMethod = clsAccess$windowLayoutComponentClass.getMethod("addWindowLayoutInfoListener", Activity.class, h.d());
        Method removeListenerMethod = clsAccess$windowLayoutComponentClass.getMethod("removeWindowLayoutInfoListener", h.d());
        Intrinsics.checkNotNullExpressionValue(addListenerMethod, "addListenerMethod");
        if (SafeWindowLayoutComponentProvider.access$isPublic(safeWindowLayoutComponentProvider, addListenerMethod)) {
            Intrinsics.checkNotNullExpressionValue(removeListenerMethod, "removeListenerMethod");
            if (SafeWindowLayoutComponentProvider.access$isPublic(safeWindowLayoutComponentProvider, removeListenerMethod)) {
                z10 = true;
            }
        }
        return Boolean.valueOf(z10);
    }
}
