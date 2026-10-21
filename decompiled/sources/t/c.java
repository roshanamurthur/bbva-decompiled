package t;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Border.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,512:1\n1#2:513\n558#3,17:514\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderCache\n*L\n409#1:514,17\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public ImageBitmap f93362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Canvas f93363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public CanvasDrawScope f93364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Path f93365d;

    public c() {
        this(0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f93362a, cVar.f93362a) && Intrinsics.areEqual(this.f93363b, cVar.f93363b) && Intrinsics.areEqual(this.f93364c, cVar.f93364c) && Intrinsics.areEqual(this.f93365d, cVar.f93365d);
    }

    public final int hashCode() {
        ImageBitmap imageBitmap = this.f93362a;
        int iHashCode = (imageBitmap == null ? 0 : imageBitmap.hashCode()) * 31;
        Canvas canvas = this.f93363b;
        int iHashCode2 = (iHashCode + (canvas == null ? 0 : canvas.hashCode())) * 31;
        CanvasDrawScope canvasDrawScope = this.f93364c;
        int iHashCode3 = (iHashCode2 + (canvasDrawScope == null ? 0 : canvasDrawScope.hashCode())) * 31;
        Path path = this.f93365d;
        return iHashCode3 + (path != null ? path.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f93362a + ", canvas=" + this.f93363b + ", canvasDrawScope=" + this.f93364c + ", borderPath=" + this.f93365d + RootService.CLOSE_BRACKET;
    }

    public c(int i10) {
        this.f93362a = null;
        this.f93363b = null;
        this.f93364c = null;
        this.f93365d = null;
    }
}
