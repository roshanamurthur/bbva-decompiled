package w2;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;

/* JADX INFO: compiled from: EmojiTransformationMethod.java */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class d implements TransformationMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final TransformationMethod f94131a;

    public d(@Nullable TransformationMethod transformationMethod) {
        this.f94131a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(@Nullable CharSequence charSequence, @NonNull View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f94131a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || EmojiCompat.get().getLoadState() != 1) ? charSequence : EmojiCompat.get().process(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i10, Rect rect) {
        TransformationMethod transformationMethod = this.f94131a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z10, i10, rect);
        }
    }
}
