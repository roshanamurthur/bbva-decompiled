package com.dasnano.vddocumentcapture.managers;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.dasnano.vddocumentcapture.R;
import com.veridas.display.DisplayUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CloseButtonManager.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001!B%\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J \u0010\f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lcom/dasnano/vddocumentcapture/managers/CloseButtonManager;", "", "Landroid/content/Context;", "context", "Landroid/view/View;", "mainView", "", "createCloseButton", "deleteCloseButton", "Landroid/graphics/Point;", "correctedSize", "screenSize", "setCloseImageButtonPosition", "", "b", "Ljava/lang/String;", "getCloseButtonImage", "()Ljava/lang/String;", "setCloseButtonImage", "(Ljava/lang/String;)V", "closeButtonImage", "", "c", "Z", "getHasCloseButtonImage", "()Z", "setHasCloseButtonImage", "(Z)V", "hasCloseButtonImage", "Lcom/dasnano/vddocumentcapture/managers/CloseButtonManager$CloseButtonInterface;", "closeButtonInterface", "<init>", "(Lcom/dasnano/vddocumentcapture/managers/CloseButtonManager$CloseButtonInterface;Ljava/lang/String;Z)V", "CloseButtonInterface", "document-capture_release"}, k = 1, mv = {1, 9, 0})
public final class CloseButtonManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CloseButtonInterface f39406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String closeButtonImage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean hasCloseButtonImage;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ImageButton f39409d;

    /* JADX INFO: compiled from: CloseButtonManager.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/dasnano/vddocumentcapture/managers/CloseButtonManager$CloseButtonInterface;", "", "closeButtonClicked", "", "document-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface CloseButtonInterface {
        void closeButtonClicked();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CloseButtonManager(@NotNull CloseButtonInterface closeButtonInterface) {
        this(closeButtonInterface, null, false, 6, null);
        Intrinsics.checkNotNullParameter(closeButtonInterface, "closeButtonInterface");
    }

    public final void createCloseButton(@NotNull Context context, @NotNull View mainView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        int sizeInPixels = DisplayUtils.getSizeInPixels(context, 40.0f);
        int identifier = R.drawable.vd_document_closebutton;
        Resources resources = context.getResources();
        if (this.hasCloseButtonImage) {
            identifier = resources.getIdentifier(this.closeButtonImage, PluginUtils.IDENTIFIER_DRAWABLE, context.getPackageName());
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, identifier);
        Intrinsics.checkNotNull(bitmapDecodeResource);
        int width = bitmapDecodeResource.getWidth();
        int height = bitmapDecodeResource.getHeight();
        float f6 = sizeInPixels;
        Matrix matrix = new Matrix();
        matrix.postScale(f6 / width, f6 / height);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeResource, 0, 0, width, height, matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        ImageButton imageButton = new ImageButton(context);
        imageButton.setLayoutParams(new FrameLayout.LayoutParams(sizeInPixels, sizeInPixels));
        float f10 = f6 * 0.2f;
        imageButton.setX(f10);
        imageButton.setY(f10);
        imageButton.setBackgroundColor(0);
        imageButton.setImageBitmap(bitmapCreateBitmap);
        imageButton.setOnClickListener(new k5.a(this, 2));
        this.f39409d = imageButton;
        ((RelativeLayout) mainView).addView(imageButton);
    }

    public final void deleteCloseButton(@NotNull View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        ImageButton imageButton = this.f39409d;
        if (imageButton != null) {
            ((RelativeLayout) mainView).removeView(imageButton);
            this.f39409d = null;
        }
    }

    @NotNull
    public final String getCloseButtonImage() {
        return this.closeButtonImage;
    }

    public final boolean getHasCloseButtonImage() {
        return this.hasCloseButtonImage;
    }

    public final void setCloseButtonImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.closeButtonImage = str;
    }

    public final void setCloseImageButtonPosition(@Nullable Context context, @NotNull Point correctedSize, @NotNull Point screenSize) {
        Intrinsics.checkNotNullParameter(correctedSize, "correctedSize");
        Intrinsics.checkNotNullParameter(screenSize, "screenSize");
        ImageButton imageButton = this.f39409d;
        if (imageButton != null) {
            float sizeInPixels = DisplayUtils.getSizeInPixels(context, 40.0f) * 0.2f;
            float f6 = (correctedSize.x - screenSize.x) / 2.0f;
            float f10 = (correctedSize.y - screenSize.y) / 2.0f;
            imageButton.setX(f6 + sizeInPixels);
            imageButton.setY(sizeInPixels + f10);
        }
    }

    public final void setHasCloseButtonImage(boolean z10) {
        this.hasCloseButtonImage = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CloseButtonManager(@NotNull CloseButtonInterface closeButtonInterface, @NotNull String closeButtonImage) {
        this(closeButtonInterface, closeButtonImage, false, 4, null);
        Intrinsics.checkNotNullParameter(closeButtonInterface, "closeButtonInterface");
        Intrinsics.checkNotNullParameter(closeButtonImage, "closeButtonImage");
    }

    @JvmOverloads
    public CloseButtonManager(@NotNull CloseButtonInterface closeButtonInterface, @NotNull String closeButtonImage, boolean z10) {
        Intrinsics.checkNotNullParameter(closeButtonInterface, "closeButtonInterface");
        Intrinsics.checkNotNullParameter(closeButtonImage, "closeButtonImage");
        this.f39406a = closeButtonInterface;
        this.closeButtonImage = closeButtonImage;
        this.hasCloseButtonImage = z10;
    }

    public /* synthetic */ CloseButtonManager(CloseButtonInterface closeButtonInterface, String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(closeButtonInterface, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? false : z10);
    }
}
