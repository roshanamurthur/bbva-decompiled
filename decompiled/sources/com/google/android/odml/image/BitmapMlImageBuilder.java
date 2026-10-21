package com.google.android.odml.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.annotation.NonNull;
import java.io.IOException;
import re.d;

/* JADX INFO: compiled from: com.google.android.odml:image@@1.0.0-beta1 */
/* JADX INFO: loaded from: classes10.dex */
public class BitmapMlImageBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f45993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f45995c;

    public BitmapMlImageBuilder(@NonNull Context context, @NonNull Uri uri) throws IOException {
        this(MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri));
    }

    @NonNull
    public MlImage build() {
        Bitmap bitmap = this.f45993a;
        return new MlImage(new d(bitmap), this.f45994b, this.f45995c, bitmap.getWidth(), bitmap.getHeight());
    }

    @NonNull
    public BitmapMlImageBuilder setRotation(int i10) {
        MlImage.a(i10);
        this.f45994b = i10;
        return this;
    }

    public BitmapMlImageBuilder(@NonNull Bitmap bitmap) {
        this.f45993a = bitmap;
        this.f45994b = 0;
        this.f45995c = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
    }
}
