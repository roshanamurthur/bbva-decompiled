package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CheckedTextViewCompat;

/* JADX INFO: compiled from: AppCompatCheckedTextViewHelper.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CheckedTextView f1681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f1682b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f1683c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1684d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1685e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1686f;

    public v(@NonNull CheckedTextView checkedTextView) {
        this.f1681a = checkedTextView;
    }

    public final void a() {
        CheckedTextView checkedTextView = this.f1681a;
        Drawable checkMarkDrawable = CheckedTextViewCompat.getCheckMarkDrawable(checkedTextView);
        if (checkMarkDrawable != null) {
            if (this.f1684d || this.f1685e) {
                Drawable drawableMutate = DrawableCompat.wrap(checkMarkDrawable).mutate();
                if (this.f1684d) {
                    DrawableCompat.setTintList(drawableMutate, this.f1682b);
                }
                if (this.f1685e) {
                    DrawableCompat.setTintMode(drawableMutate, this.f1683c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(checkedTextView.getDrawableState());
                }
                checkedTextView.setCheckMarkDrawable(drawableMutate);
            }
        }
    }
}
