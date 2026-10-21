package com.bbva.showinfo.model;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InfoElement.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/bbva/showinfo/model/BigPictureStyle;", "", "Landroid/graphics/Bitmap;", "a", "Landroid/graphics/Bitmap;", "getPicture", "()Landroid/graphics/Bitmap;", "picture", "b", "getLargeIcon", "largeIcon", "", "c", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "title", "d", "getSummaryText", "summaryText", "<init>", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)V", "showinfo_release"}, k = 1, mv = {1, 9, 0})
public final class BigPictureStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Bitmap picture;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Bitmap largeIcon;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String title;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String summaryText;

    public BigPictureStyle() {
        this(null, null, null, null, 15, null);
    }

    @Nullable
    public final Bitmap getLargeIcon() {
        return this.largeIcon;
    }

    @Nullable
    public final Bitmap getPicture() {
        return this.picture;
    }

    @Nullable
    public final String getSummaryText() {
        return this.summaryText;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public BigPictureStyle(@Nullable Bitmap bitmap, @Nullable Bitmap bitmap2, @Nullable String str, @Nullable String str2) {
        this.picture = bitmap;
        this.largeIcon = bitmap2;
        this.title = str;
        this.summaryText = str2;
    }

    public /* synthetic */ BigPictureStyle(Bitmap bitmap, Bitmap bitmap2, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : bitmap, (i10 & 2) != 0 ? null : bitmap2, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2);
    }
}
