package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidTileMode.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(31)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f15758a = new b();

    @DoNotInline
    public final int a() {
        return TileMode.INSTANCE.m2829getDecal3opZhB0();
    }

    @DoNotInline
    @NotNull
    public final Shader.TileMode b() {
        return Shader.TileMode.DECAL;
    }
}
