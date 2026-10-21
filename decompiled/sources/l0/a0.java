package l0;

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
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Path f82401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PathMeasure f82402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Path f82403c;

    public a0() {
        this(0);
    }

    public a0(int i10) {
        Path checkPath = AndroidPath_androidKt.Path();
        PathMeasure pathMeasure = AndroidPathMeasure_androidKt.PathMeasure();
        Path pathToDraw = AndroidPath_androidKt.Path();
        Intrinsics.checkNotNullParameter(checkPath, "checkPath");
        Intrinsics.checkNotNullParameter(pathMeasure, "pathMeasure");
        Intrinsics.checkNotNullParameter(pathToDraw, "pathToDraw");
        this.f82401a = checkPath;
        this.f82402b = pathMeasure;
        this.f82403c = pathToDraw;
    }
}
