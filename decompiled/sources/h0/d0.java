package h0;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Checkbox.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Path f68709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PathMeasure f68710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Path f68711c;

    public d0() {
        this(0);
    }

    public d0(int i10) {
        Path checkPath = AndroidPath_androidKt.Path();
        PathMeasure pathMeasure = AndroidPathMeasure_androidKt.PathMeasure();
        Path pathToDraw = AndroidPath_androidKt.Path();
        Intrinsics.checkNotNullParameter(checkPath, "checkPath");
        Intrinsics.checkNotNullParameter(pathMeasure, "pathMeasure");
        Intrinsics.checkNotNullParameter(pathToDraw, "pathToDraw");
        this.f68709a = checkPath;
        this.f68710b = pathMeasure;
        this.f68711c = pathToDraw;
    }
}
