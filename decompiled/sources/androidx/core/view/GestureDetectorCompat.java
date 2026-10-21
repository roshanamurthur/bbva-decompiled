package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class GestureDetectorCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f20199a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GestureDetector f20200a;

        public a(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f20200a = new GestureDetector(context, onGestureListener, handler);
        }
    }

    public GestureDetectorCompat(@NonNull Context context, @NonNull GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public boolean isLongpressEnabled() {
        return this.f20199a.f20200a.isLongpressEnabled();
    }

    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        return this.f20199a.f20200a.onTouchEvent(motionEvent);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setIsLongpressEnabled(boolean z10) {
        this.f20199a.f20200a.setIsLongpressEnabled(z10);
    }

    public void setOnDoubleTapListener(@Nullable GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f20199a.f20200a.setOnDoubleTapListener(onDoubleTapListener);
    }

    public GestureDetectorCompat(@NonNull Context context, @NonNull GestureDetector.OnGestureListener onGestureListener, @Nullable Handler handler) {
        this.f20199a = new a(context, onGestureListener, handler);
    }
}
