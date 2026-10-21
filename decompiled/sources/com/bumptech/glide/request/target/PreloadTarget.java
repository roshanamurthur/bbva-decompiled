package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.transition.Transition;

/* JADX INFO: loaded from: classes9.dex */
public final class PreloadTarget<Z> extends CustomTarget<Z> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final Handler f38848q0 = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final RequestManager f38849p0;

    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            PreloadTarget preloadTarget = (PreloadTarget) message.obj;
            preloadTarget.f38849p0.clear(preloadTarget);
            return true;
        }
    }

    public PreloadTarget(RequestManager requestManager, int i10, int i11) {
        super(i10, i11);
        this.f38849p0 = requestManager;
    }

    public static <Z> PreloadTarget<Z> obtain(RequestManager requestManager, int i10, int i11) {
        return new PreloadTarget<>(requestManager, i10, i11);
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onResourceReady(@NonNull Z z10, @Nullable Transition<? super Z> transition) {
        Request request = getRequest();
        if (request == null || !request.isComplete()) {
            return;
        }
        f38848q0.obtainMessage(1, this).sendToTarget();
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadCleared(@Nullable Drawable drawable) {
    }
}
