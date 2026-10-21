package com.bbva.component.ui.message.card;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import com.bbva.cells.componentkit.dsl.ViewKt;
import com.bbva.cells.componentkit.model.dsl.ImageSettings;
import com.bbva.cells.componentkit.model.dsl.ResourceId;
import com.bbva.cells.componentkit.resource.ResourceStringKt;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ImageView.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u001a&\u0010\u0002\u001a\u00020\u0004*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000\u001aM\u0010\r\u001a\u00020\u0004*\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroid/widget/ImageView;", "Lcom/bbva/cells/componentkit/model/dsl/ImageSettings;", "settings", "Lkotlin/Function0;", "", "onImageLoaded", "", "url", "", "default", "placeHolder", "transitionDuration", "onLoadingResourceCompleted", "load", "(Landroid/widget/ImageView;Ljava/lang/String;ILjava/lang/Integer;ILkotlin/jvm/functions/Function0;)V", "component-ui-message-card_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageView.kt\ncom/bbva/component/ui/message/card/ImageViewKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
public final class ImageViewKt {

    /* JADX INFO: compiled from: ImageView.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f28616p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ImageView.kt */
    public static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f28617p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "baseContext");
        return a(baseContext);
    }

    public static final void b(ImageView imageView, String str, @DrawableRes int i10, @DrawableRes Integer num, int i11, final Function0<Unit> function0) {
        RequestBuilder requestBuilderListener = Glide.with(imageView).mo4916load(str).error(i10).transition(DrawableTransitionOptions.withCrossFade(i11)).listener(new RequestListener<Drawable>() { // from class: com.bbva.component.ui.message.card.ImageViewKt$safeLoad$builder$1
            @Override // com.bumptech.glide.request.RequestListener
            public boolean onLoadFailed(@Nullable GlideException e5, @Nullable Object model, @Nullable Target<Drawable> target, boolean isFirstResource) {
                function0.invoke();
                return false;
            }

            @Override // com.bumptech.glide.request.RequestListener
            public boolean onResourceReady(@Nullable Drawable resource, @Nullable Object model, @Nullable Target<Drawable> target, @Nullable DataSource dataSource, boolean isFirstResource) {
                function0.invoke();
                return false;
            }
        });
        Intrinsics.checkNotNullExpressionValue(requestBuilderListener, "onLoadingResourceComplet…\n            }\n        })");
        if (num != null) {
            requestBuilderListener.placeholder(num.intValue());
        }
        requestBuilderListener.into(imageView);
    }

    public static final void load(@NotNull ImageView imageView, @Nullable String str, @DrawableRes int i10, @DrawableRes @Nullable Integer num, int i11, @NotNull Function0<Unit> onLoadingResourceCompleted) {
        Unit unit;
        Activity activityA;
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(onLoadingResourceCompleted, "onLoadingResourceCompleted");
        Context context = imageView.getContext();
        if (context == null || (activityA = a(context)) == null) {
            unit = null;
        } else {
            if (!activityA.isDestroyed()) {
                b(imageView, str, i10, num, i11, onLoadingResourceCompleted);
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            b(imageView, str, i10, num, i11, onLoadingResourceCompleted);
        }
    }

    public static /* synthetic */ void load$default(ImageView imageView, String str, int i10, Integer num, int i11, Function0 function0, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        Integer num2 = num;
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        int i13 = i11;
        if ((i12 & 16) != 0) {
            function0 = a.f28616p0;
        }
        load(imageView, str, i10, num2, i13, function0);
    }

    public static final void settings(@NotNull ImageView imageView, @Nullable ImageSettings imageSettings, @NotNull Function0<Unit> onImageLoaded) {
        int drawableId;
        Integer androidId;
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(onImageLoaded, "onImageLoaded");
        if (imageSettings != null) {
            ViewKt.settings(imageView, imageSettings.getView());
            com.bbva.cells.componentkit.dsl.ImageViewKt.scale(imageView, imageSettings.getScale());
            ResourceId source = imageSettings.getSource();
            String url = imageSettings.getUrl();
            if (url != null) {
                load$default(imageView, url, (source == null || (androidId = source.getAndroidId()) == null) ? 0 : androidId.intValue(), null, 0, onImageLoaded, 12, null);
                return;
            }
            if ((source != null ? source.getAndroidId() : null) != null) {
                Integer androidId2 = source.getAndroidId();
                Intrinsics.checkNotNull(androidId2);
                drawableId = androidId2.intValue();
            } else {
                if ((source != null ? source.getValue() : null) == null) {
                    onImageLoaded.invoke();
                    return;
                }
                String value = source.getValue();
                Intrinsics.checkNotNull(value);
                Context context = imageView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                drawableId = ResourceStringKt.toDrawableId(value, context);
            }
            imageView.setImageResource(drawableId);
            onImageLoaded.invoke();
        }
    }

    public static /* synthetic */ void settings$default(ImageView imageView, ImageSettings imageSettings, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function0 = b.f28617p0;
        }
        settings(imageView, imageSettings, function0);
    }
}
