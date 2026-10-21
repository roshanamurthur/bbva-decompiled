package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSeekBar extends SeekBar {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final e0 f1228p0;

    public AppCompatSeekBar(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e0 e0Var = this.f1228p0;
        Drawable drawable = e0Var.f1593e;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        SeekBar seekBar = e0Var.f1592d;
        if (drawable.setState(seekBar.getDrawableState())) {
            seekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1228p0.f1593e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1228p0.d(canvas);
    }

    public AppCompatSeekBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public AppCompatSeekBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        ThemeUtils.checkAppCompatTheme(this, getContext());
        e0 e0Var = new e0(this);
        this.f1228p0 = e0Var;
        e0Var.a(attributeSet, i10);
    }
}
