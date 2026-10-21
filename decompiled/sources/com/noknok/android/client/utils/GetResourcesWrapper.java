package com.noknok.android.client.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.core.content.res.ResourcesCompat;

/* JADX INFO: loaded from: classes11.dex */
public class GetResourcesWrapper {
    public static Drawable getDrawable(Context context, int i10) throws Resources.NotFoundException {
        return ResourcesCompat.getDrawable(context.getResources(), i10, null);
    }
}
