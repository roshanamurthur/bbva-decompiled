package com.bumptech.glide.request.target;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Preconditions;

/* JADX INFO: loaded from: classes9.dex */
public class AppWidgetTarget extends CustomTarget<Bitmap> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int[] f38814p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ComponentName f38815q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final RemoteViews f38816r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Context f38817s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f38818t0;

    public AppWidgetTarget(Context context, int i10, int i11, int i12, RemoteViews remoteViews, int... iArr) {
        super(i10, i11);
        if (iArr.length == 0) {
            throw new IllegalArgumentException("WidgetIds must have length > 0");
        }
        this.f38817s0 = (Context) Preconditions.checkNotNull(context, "Context can not be null!");
        this.f38816r0 = (RemoteViews) Preconditions.checkNotNull(remoteViews, "RemoteViews object can not be null!");
        this.f38814p0 = (int[]) Preconditions.checkNotNull(iArr, "WidgetIds can not be null!");
        this.f38818t0 = i12;
        this.f38815q0 = null;
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadCleared(@Nullable Drawable drawable) {
        RemoteViews remoteViews = this.f38816r0;
        remoteViews.setImageViewBitmap(this.f38818t0, null);
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this.f38817s0);
        ComponentName componentName = this.f38815q0;
        if (componentName != null) {
            appWidgetManager.updateAppWidget(componentName, remoteViews);
        } else {
            appWidgetManager.updateAppWidget(this.f38814p0, remoteViews);
        }
    }

    @Override // com.bumptech.glide.request.target.Target
    public /* bridge */ /* synthetic */ void onResourceReady(@NonNull Object obj, @Nullable Transition transition) {
        onResourceReady((Bitmap) obj, (Transition<? super Bitmap>) transition);
    }

    public void onResourceReady(@NonNull Bitmap bitmap, @Nullable Transition<? super Bitmap> transition) {
        RemoteViews remoteViews = this.f38816r0;
        remoteViews.setImageViewBitmap(this.f38818t0, bitmap);
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this.f38817s0);
        ComponentName componentName = this.f38815q0;
        if (componentName != null) {
            appWidgetManager.updateAppWidget(componentName, remoteViews);
        } else {
            appWidgetManager.updateAppWidget(this.f38814p0, remoteViews);
        }
    }

    public AppWidgetTarget(Context context, int i10, RemoteViews remoteViews, int... iArr) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i10, remoteViews, iArr);
    }

    public AppWidgetTarget(Context context, int i10, int i11, int i12, RemoteViews remoteViews, ComponentName componentName) {
        super(i10, i11);
        this.f38817s0 = (Context) Preconditions.checkNotNull(context, "Context can not be null!");
        this.f38816r0 = (RemoteViews) Preconditions.checkNotNull(remoteViews, "RemoteViews object can not be null!");
        this.f38815q0 = (ComponentName) Preconditions.checkNotNull(componentName, "ComponentName can not be null!");
        this.f38818t0 = i12;
        this.f38814p0 = null;
    }

    public AppWidgetTarget(Context context, int i10, RemoteViews remoteViews, ComponentName componentName) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i10, remoteViews, componentName);
    }
}
