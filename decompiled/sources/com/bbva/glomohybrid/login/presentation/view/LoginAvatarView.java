package com.bbva.glomohybrid.login.presentation.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.bbva.cellswidgets.CellsCircleInitialsView;
import com.bbva.cellswidgets.CellsImageView;
import com.bbva.glomohybrid.base.extensions.ViewExtensionsKt;
import com.bbva.glomohybrid.login.databinding.AvatarViewBinding;
import com.bbva.glomoutils.BitmapExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginAvatarView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/view/LoginAvatarView;", "Landroid/widget/FrameLayout;", "", "initials", "", "setInitials", "Landroid/graphics/Bitmap;", "bitmap", "setBitmap", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class LoginAvatarView extends FrameLayout {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final AvatarViewBinding f33535p0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LoginAvatarView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setBitmap(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        AvatarViewBinding avatarViewBinding = this.f33535p0;
        CellsCircleInitialsView userImageView = avatarViewBinding.userImageView;
        Intrinsics.checkNotNullExpressionValue(userImageView, "userImageView");
        ViewExtensionsKt.show(userImageView, false);
        CellsImageView iconImage = avatarViewBinding.iconImage;
        Intrinsics.checkNotNullExpressionValue(iconImage, "iconImage");
        ViewExtensionsKt.show(iconImage, true);
        avatarViewBinding.iconImage.setImageBitmap(BitmapExtensionsKt.circleTransformation(bitmap));
    }

    public final void setInitials(@NotNull String initials) {
        Intrinsics.checkNotNullParameter(initials, "initials");
        AvatarViewBinding avatarViewBinding = this.f33535p0;
        CellsImageView iconImage = avatarViewBinding.iconImage;
        Intrinsics.checkNotNullExpressionValue(iconImage, "iconImage");
        ViewExtensionsKt.show(iconImage, false);
        CellsCircleInitialsView userImageView = avatarViewBinding.userImageView;
        Intrinsics.checkNotNullExpressionValue(userImageView, "userImageView");
        ViewExtensionsKt.show(userImageView, true);
        avatarViewBinding.userImageView.setInitials(initials);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LoginAvatarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ LoginAvatarView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LoginAvatarView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        AvatarViewBinding avatarViewBindingInflate = AvatarViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(avatarViewBindingInflate, "inflate(...)");
        this.f33535p0 = avatarViewBindingInflate;
    }
}
