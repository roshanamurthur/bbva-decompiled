package androidx.compose.ui.graphics;

import android.annotation.SuppressLint;
import android.os.Build;
import com.bbva.cells.component.kit.ui.property.impl.view.EnableHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y0.d;

/* JADX INFO: compiled from: CanvasUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/CanvasUtils;", "", "Landroid/graphics/Canvas;", "canvas", "", EnableHandler.ID, "", "enableZ", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCanvasUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasUtils.android.kt\nandroidx/compose/ui/graphics/CanvasUtils\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,101:1\n26#2:102\n26#2:103\n*S KotlinDebug\n*F\n+ 1 CanvasUtils.android.kt\nandroidx/compose/ui/graphics/CanvasUtils\n*L\n54#1:102\n59#1:103\n*E\n"})
public final class CanvasUtils {

    @NotNull
    public static final CanvasUtils INSTANCE = new CanvasUtils();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static Method f15604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static Method f15605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f15606c;

    @SuppressLint({"SoonBlockedPrivateApi"})
    public final void enableZ(@NotNull android.graphics.Canvas canvas, boolean enable) {
        Method method;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            d.f94717a.a(canvas, enable);
            return;
        }
        if (!f15606c) {
            try {
                if (i10 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f15604a = (Method) declaredMethod.invoke(android.graphics.Canvas.class, "insertReorderBarrier", new Class[0]);
                    f15605b = (Method) declaredMethod.invoke(android.graphics.Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f15604a = android.graphics.Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f15605b = android.graphics.Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                Method method2 = f15604a;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f15605b;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f15606c = true;
        }
        if (enable) {
            try {
                Method method4 = f15604a;
                if (method4 != null) {
                    Intrinsics.checkNotNull(method4);
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (enable || (method = f15605b) == null) {
            return;
        }
        Intrinsics.checkNotNull(method);
        method.invoke(canvas, new Object[0]);
    }
}
