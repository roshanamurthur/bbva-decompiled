package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidCanvas.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0010J-\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000R \u0010\u0011\u001a\u00020\n8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/CanvasHolder;", "", "Landroid/graphics/Canvas;", "targetCanvas", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "", "Lkotlin/ExtensionFunctionType;", "block", "drawInto", "Landroidx/compose/ui/graphics/AndroidCanvas;", "a", "Landroidx/compose/ui/graphics/AndroidCanvas;", "getAndroidCanvas", "()Landroidx/compose/ui/graphics/AndroidCanvas;", "getAndroidCanvas$annotations", "()V", "androidCanvas", "<init>", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
public final class CanvasHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AndroidCanvas androidCanvas = new AndroidCanvas();

    public final void drawInto(@NotNull android.graphics.Canvas targetCanvas, @NotNull Function1<? super Canvas, Unit> block) {
        Intrinsics.checkNotNullParameter(targetCanvas, "targetCanvas");
        Intrinsics.checkNotNullParameter(block, "block");
        android.graphics.Canvas internalCanvas = getAndroidCanvas().getInternalCanvas();
        getAndroidCanvas().setInternalCanvas(targetCanvas);
        block.invoke(getAndroidCanvas());
        getAndroidCanvas().setInternalCanvas(internalCanvas);
    }

    @NotNull
    public final AndroidCanvas getAndroidCanvas() {
        return this.androidCanvas;
    }

    @PublishedApi
    public static /* synthetic */ void getAndroidCanvas$annotations() {
    }
}
