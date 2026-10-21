package s1;

import android.graphics.Typeface;
import android.text.style.TypefaceSpan;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidAccessibilitySpannableString.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f93136a = new b();

    @DoNotInline
    @NotNull
    public final TypefaceSpan a(@NotNull Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        return new TypefaceSpan(typeface);
    }
}
