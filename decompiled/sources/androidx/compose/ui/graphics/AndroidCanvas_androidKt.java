package androidx.compose.ui.graphics;

import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidCanvas.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\"\u0019\u0010\n\u001a\u00060\u0004j\u0002`\u0007*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\t*\n\u0010\u000b\"\u00020\u00042\u00020\u0004¨\u0006\f"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmap;", AuthConstants.IMAGE, "Landroidx/compose/ui/graphics/Canvas;", "ActualCanvas", "Landroid/graphics/Canvas;", "c", "Canvas", "Landroidx/compose/ui/graphics/NativeCanvas;", "getNativeCanvas", "(Landroidx/compose/ui/graphics/Canvas;)Landroid/graphics/Canvas;", "nativeCanvas", "NativeCanvas", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidCanvas.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,431:1\n1#2:432\n*E\n"})
public final class AndroidCanvas_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final android.graphics.Canvas f15555a = new android.graphics.Canvas();

    @NotNull
    public static final Canvas ActualCanvas(@NotNull ImageBitmap image) {
        Intrinsics.checkNotNullParameter(image, "image");
        AndroidCanvas androidCanvas = new AndroidCanvas();
        androidCanvas.setInternalCanvas(new android.graphics.Canvas(AndroidImageBitmap_androidKt.asAndroidBitmap(image)));
        return androidCanvas;
    }

    @NotNull
    public static final Canvas Canvas(@NotNull android.graphics.Canvas c10) {
        Intrinsics.checkNotNullParameter(c10, "c");
        AndroidCanvas androidCanvas = new AndroidCanvas();
        androidCanvas.setInternalCanvas(c10);
        return androidCanvas;
    }

    @NotNull
    public static final android.graphics.Canvas getNativeCanvas(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        return ((AndroidCanvas) canvas).getInternalCanvas();
    }
}
