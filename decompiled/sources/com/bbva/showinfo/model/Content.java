package com.bbva.showinfo.model;

import android.graphics.Bitmap;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ResourceOrigin.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/showinfo/model/Content;", "Lcom/bbva/showinfo/model/ResourceOrigin;", "Landroid/graphics/Bitmap;", "component1", "bitmap", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "<init>", "(Landroid/graphics/Bitmap;)V", "showinfo_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class Content extends ResourceOrigin {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Bitmap bitmap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Content(@NotNull Bitmap bitmap) {
        super(null);
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.bitmap = bitmap;
    }

    public static /* synthetic */ Content copy$default(Content content, Bitmap bitmap, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bitmap = content.bitmap;
        }
        return content.copy(bitmap);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @NotNull
    public final Content copy(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return new Content(bitmap);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Content) && Intrinsics.areEqual(this.bitmap, ((Content) other).bitmap);
    }

    @NotNull
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public int hashCode() {
        return this.bitmap.hashCode();
    }

    @NotNull
    public String toString() {
        return "Content(bitmap=" + this.bitmap + ")";
    }
}
