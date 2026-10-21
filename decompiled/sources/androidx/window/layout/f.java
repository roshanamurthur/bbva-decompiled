package androidx.window.layout;

import android.graphics.Rect;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: SafeWindowLayoutComponentProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ClassLoader f24232p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ClassLoader classLoader) {
        super(0);
        this.f24232p0 = classLoader;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() throws NoSuchMethodException {
        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
        Class clsAccess$foldingFeatureClass = SafeWindowLayoutComponentProvider.access$foldingFeatureClass(safeWindowLayoutComponentProvider, this.f24232p0);
        boolean z10 = false;
        Method getBoundsMethod = clsAccess$foldingFeatureClass.getMethod("getBounds", new Class[0]);
        Method getTypeMethod = clsAccess$foldingFeatureClass.getMethod("getType", new Class[0]);
        Method getStateMethod = clsAccess$foldingFeatureClass.getMethod("getState", new Class[0]);
        Intrinsics.checkNotNullExpressionValue(getBoundsMethod, "getBoundsMethod");
        if (SafeWindowLayoutComponentProvider.access$doesReturn(safeWindowLayoutComponentProvider, getBoundsMethod, Reflection.getOrCreateKotlinClass(Rect.class)) && SafeWindowLayoutComponentProvider.access$isPublic(safeWindowLayoutComponentProvider, getBoundsMethod)) {
            Intrinsics.checkNotNullExpressionValue(getTypeMethod, "getTypeMethod");
            Class cls = Integer.TYPE;
            if (SafeWindowLayoutComponentProvider.access$doesReturn(safeWindowLayoutComponentProvider, getTypeMethod, Reflection.getOrCreateKotlinClass(cls)) && SafeWindowLayoutComponentProvider.access$isPublic(safeWindowLayoutComponentProvider, getTypeMethod)) {
                Intrinsics.checkNotNullExpressionValue(getStateMethod, "getStateMethod");
                if (SafeWindowLayoutComponentProvider.access$doesReturn(safeWindowLayoutComponentProvider, getStateMethod, Reflection.getOrCreateKotlinClass(cls)) && SafeWindowLayoutComponentProvider.access$isPublic(safeWindowLayoutComponentProvider, getStateMethod)) {
                    z10 = true;
                }
            }
        }
        return Boolean.valueOf(z10);
    }
}
