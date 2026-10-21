package com.google.android.odml.image;

import android.graphics.Rect;
import android.media.Image;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import re.g;

/* JADX INFO: compiled from: com.google.android.odml:image@@1.0.0-beta1 */
/* JADX INFO: loaded from: classes10.dex */
@RequiresApi(19)
public class MediaMlImageBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f46002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46003b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f46004c;

    public MediaMlImageBuilder(@NonNull Image image) {
        this.f46002a = image;
        this.f46004c = new Rect(0, 0, image.getWidth(), image.getHeight());
    }

    @NonNull
    public MlImage build() {
        Image image = this.f46002a;
        return new MlImage(new g(image), this.f46003b, this.f46004c, image.getWidth(), image.getHeight());
    }

    @NonNull
    public MediaMlImageBuilder setRotation(int i10) {
        MlImage.a(i10);
        this.f46003b = i10;
        return this;
    }
}
