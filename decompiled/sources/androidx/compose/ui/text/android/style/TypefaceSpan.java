package androidx.compose.ui.text.android.style;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TypefaceSpan.kt */
/* JADX INFO: loaded from: classes.dex */
@InternalPlatformTextApi
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/android/style/TypefaceSpan;", "Landroid/text/style/MetricAffectingSpan;", "Landroid/text/TextPaint;", "ds", "", "updateDrawState", "paint", "updateMeasureState", "Landroid/graphics/Typeface;", "p0", "Landroid/graphics/Typeface;", "getTypeface", "()Landroid/graphics/Typeface;", "typeface", "<init>", "(Landroid/graphics/Typeface;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class TypefaceSpan extends MetricAffectingSpan {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Typeface typeface;

    public TypefaceSpan(@NotNull Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        this.typeface = typeface;
    }

    @NotNull
    public final Typeface getTypeface() {
        return this.typeface;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        ds.setTypeface(this.typeface);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.setTypeface(this.typeface);
    }
}
