package com.bumptech.glide.request.target;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Preconditions;

/* JADX INFO: loaded from: classes9.dex */
public class NotificationTarget extends CustomTarget<Bitmap> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final RemoteViews f38842p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Context f38843q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f38844r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final String f38845s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Notification f38846t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f38847u0;

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public NotificationTarget(Context context, int i10, RemoteViews remoteViews, Notification notification, int i11) {
        this(context, i10, remoteViews, notification, i11, null);
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public final void a(@Nullable Bitmap bitmap) {
        this.f38842p0.setImageViewBitmap(this.f38847u0, bitmap);
        ((NotificationManager) Preconditions.checkNotNull((NotificationManager) this.f38843q0.getSystemService("notification"))).notify(this.f38845s0, this.f38844r0, this.f38846t0);
    }

    @Override // com.bumptech.glide.request.target.Target
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public void onLoadCleared(@Nullable Drawable drawable) {
        a(null);
    }

    @Override // com.bumptech.glide.request.target.Target
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public /* bridge */ /* synthetic */ void onResourceReady(@NonNull Object obj, @Nullable Transition transition) {
        onResourceReady((Bitmap) obj, (Transition<? super Bitmap>) transition);
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public NotificationTarget(Context context, int i10, RemoteViews remoteViews, Notification notification, int i11, String str) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i10, remoteViews, notification, i11, str);
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public void onResourceReady(@NonNull Bitmap bitmap, @Nullable Transition<? super Bitmap> transition) {
        a(bitmap);
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    @SuppressLint({"InlinedApi"})
    public NotificationTarget(Context context, int i10, int i11, int i12, RemoteViews remoteViews, Notification notification, int i13, String str) {
        super(i10, i11);
        this.f38843q0 = (Context) Preconditions.checkNotNull(context, "Context must not be null!");
        this.f38846t0 = (Notification) Preconditions.checkNotNull(notification, "Notification object can not be null!");
        this.f38842p0 = (RemoteViews) Preconditions.checkNotNull(remoteViews, "RemoteViews object can not be null!");
        this.f38847u0 = i12;
        this.f38844r0 = i13;
        this.f38845s0 = str;
    }
}
