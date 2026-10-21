package com.bumptech.glide.util;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.ListPreloader;
import com.bumptech.glide.request.target.CustomViewTarget;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.transition.Transition;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class ViewPreloadSizeProvider<T> implements ListPreloader.PreloadSizeProvider<T>, SizeReadyCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f38927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f38928b;

    public ViewPreloadSizeProvider() {
    }

    @Override // com.bumptech.glide.ListPreloader.PreloadSizeProvider
    @Nullable
    public int[] getPreloadSize(@NonNull T t10, int i10, int i11) {
        int[] iArr = this.f38927a;
        if (iArr == null) {
            return null;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    @Override // com.bumptech.glide.request.target.SizeReadyCallback
    public void onSizeReady(int i10, int i11) {
        this.f38927a = new int[]{i10, i11};
        this.f38928b = null;
    }

    public void setView(@NonNull View view) {
        if (this.f38927a == null && this.f38928b == null) {
            a aVar = new a(view);
            this.f38928b = aVar;
            aVar.getSize(this);
        }
    }

    public ViewPreloadSizeProvider(@NonNull View view) {
        a aVar = new a(view);
        this.f38928b = aVar;
        aVar.getSize(this);
    }

    public static final class a extends CustomViewTarget<View, Object> {
        @Override // com.bumptech.glide.request.target.Target
        public final void onLoadFailed(@Nullable Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.CustomViewTarget
        public final void onResourceCleared(@Nullable Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void onResourceReady(@NonNull Object obj, @Nullable Transition<? super Object> transition) {
        }
    }
}
