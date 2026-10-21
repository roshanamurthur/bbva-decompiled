package com.google.android.odml.image;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import re.e;

/* JADX INFO: compiled from: com.google.android.odml:image@@1.0.0-beta1 */
/* JADX INFO: loaded from: classes10.dex */
public class ByteBufferMlImageBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f45996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f45999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46000e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f46001f;

    public ByteBufferMlImageBuilder(@NonNull ByteBuffer byteBuffer, int i10, int i11, int i12) {
        this.f45996a = byteBuffer;
        this.f45997b = i10;
        this.f45998c = i11;
        this.f45999d = i12;
        this.f46001f = new Rect(0, 0, i10, i11);
    }

    @NonNull
    public MlImage build() {
        return new MlImage(new e(this.f45996a, this.f45999d), this.f46000e, this.f46001f, this.f45997b, this.f45998c);
    }

    @NonNull
    public ByteBufferMlImageBuilder setRotation(int i10) {
        MlImage.a(i10);
        this.f46000e = i10;
        return this;
    }
}
