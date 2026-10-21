package com.bumptech.glide.request.target;

import androidx.annotation.NonNull;
import androidx.collection.k;
import com.bumptech.glide.util.Util;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public abstract class SimpleTarget<Z> extends BaseTarget<Z> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f38850q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f38851r0;

    public SimpleTarget() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void getSize(@NonNull SizeReadyCallback sizeReadyCallback) {
        int i10 = this.f38850q0;
        int i11 = this.f38851r0;
        if (!Util.isValidDimensions(i10, i11)) {
            throw new IllegalArgumentException(k.c("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", i10, " and height: ", i11, ", either provide dimensions in the constructor or call override()"));
        }
        sizeReadyCallback.onSizeReady(i10, i11);
    }

    public SimpleTarget(int i10, int i11) {
        this.f38850q0 = i10;
        this.f38851r0 = i11;
    }

    @Override // com.bumptech.glide.request.target.Target
    public void removeCallback(@NonNull SizeReadyCallback sizeReadyCallback) {
    }
}
