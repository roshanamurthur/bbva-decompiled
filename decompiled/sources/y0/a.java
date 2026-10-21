package y0;

import android.graphics.BlendModeColorFilter;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.AndroidBlendMode_androidKt;
import androidx.compose.ui.graphics.ColorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidColorFilter.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f94714a = new a();

    @DoNotInline
    @NotNull
    public final BlendModeColorFilter a(long j10, int i10) {
        androidx.appcompat.widget.e.b();
        return androidx.appcompat.widget.d.a(ColorKt.m2561toArgb8_81llA(j10), AndroidBlendMode_androidKt.m2367toAndroidBlendModes9anfk8(i10));
    }
}
