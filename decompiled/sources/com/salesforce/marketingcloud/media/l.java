package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
public final class l extends BitmapDrawable {
    public l(Context context, Bitmap bitmap) {
        super(context.getResources(), bitmap);
    }

    public static void a(ImageView imageView, Context context, u.b bVar) {
        if (bVar.d()) {
            imageView.setImageDrawable(new l(context, bVar.a()));
        } else if (bVar.e()) {
            imageView.setImageDrawable(bVar.b());
        }
    }
}
