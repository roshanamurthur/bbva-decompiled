package com.bbva.glomohybrid.base.models;

import android.graphics.Bitmap;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UserAvatarModel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/glomohybrid/base/models/UserAvatarModel;", "", "Landroid/graphics/Bitmap;", "component1", "", "component2", "bitmap", "base64", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "b", "Ljava/lang/String;", "getBase64", "()Ljava/lang/String;", "<init>", "(Landroid/graphics/Bitmap;Ljava/lang/String;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class UserAvatarModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Bitmap bitmap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String base64;

    public UserAvatarModel(@Nullable Bitmap bitmap, @Nullable String str) {
        this.bitmap = bitmap;
        this.base64 = str;
    }

    public static /* synthetic */ UserAvatarModel copy$default(UserAvatarModel userAvatarModel, Bitmap bitmap, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bitmap = userAvatarModel.bitmap;
        }
        if ((i10 & 2) != 0) {
            str = userAvatarModel.base64;
        }
        return userAvatarModel.copy(bitmap, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBase64() {
        return this.base64;
    }

    @NotNull
    public final UserAvatarModel copy(@Nullable Bitmap bitmap, @Nullable String base64) {
        return new UserAvatarModel(bitmap, base64);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserAvatarModel)) {
            return false;
        }
        UserAvatarModel userAvatarModel = (UserAvatarModel) other;
        return Intrinsics.areEqual(this.bitmap, userAvatarModel.bitmap) && Intrinsics.areEqual(this.base64, userAvatarModel.base64);
    }

    @Nullable
    public final String getBase64() {
        return this.base64;
    }

    @Nullable
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public int hashCode() {
        Bitmap bitmap = this.bitmap;
        int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        String str = this.base64;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UserAvatarModel(bitmap=" + this.bitmap + ", base64=" + this.base64 + ")";
    }
}
