package com.bbva.glomohybrid.qrscanner.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.core.imagecapture.a;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.bbva.glomohybrid.base.extensions.ViewExtensionsKt;
import com.bbva.glomohybrid.base.models.common.Event;
import com.bbva.glomohybrid.qrscanner.databinding.CustomQrToolbarViewBinding;
import com.bbva.glomohybrid.qrscanner.view.CustomQRToolbarView;
import com.bbva.glomohybrid.qrscanner.viewmodel.QrContract;
import com.bbva.glomohybrid.qrscanner.viewmodel.QrToolbarViewModel;
import da.d;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.qualifier.Qualifier;
import x8.b;

/* JADX INFO: compiled from: CustomQRToolbarView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B'\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\n\u001a\u00020\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/view/CustomQRToolbarView;", "Lcom/bbva/glomohybrid/qrscanner/view/GalleryView;", "Lorg/koin/core/component/KoinComponent;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/bbva/qr/view/Configurable;", "", "", "options", "", "configureAttributes", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrToolbarViewModel;", "t0", "Lkotlin/Lazy;", "getViewModel", "()Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrToolbarViewModel;", "viewModel", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCustomQRToolbarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomQRToolbarView.kt\ncom/bbva/glomohybrid/qrscanner/view/CustomQRToolbarView\n+ 2 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n29#2,4:127\n1#3:131\n*S KotlinDebug\n*F\n+ 1 CustomQRToolbarView.kt\ncom/bbva/glomohybrid/qrscanner/view/CustomQRToolbarView\n*L\n31#1:127,4\n*E\n"})
public final class CustomQRToolbarView extends GalleryView {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ int f34432u0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f34433r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final CustomQrToolbarViewBinding f34434s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy viewModel;

    /* JADX INFO: compiled from: CustomQRToolbarView.kt */
    public static final class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f34436a;

        public a(d function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f34436a = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f34436a, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f34436a;
        }

        public final int hashCode() {
            return this.f34436a.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f34436a.invoke(obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomQRToolbarView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final Drawable a(String str) {
        int identifier = getContext().getResources().getIdentifier(str, PluginUtils.IDENTIFIER_DRAWABLE, getContext().getPackageName());
        if (identifier > 0) {
            return ResourcesCompat.getDrawable(getResources(), identifier, getContext().getTheme());
        }
        return null;
    }

    @Override // com.bbva.glomohybrid.qrscanner.view.GalleryView, com.bbva.qr.view.Configurable
    public void configureAttributes(@NotNull Map<String, String> options) {
        Unit unit;
        Drawable drawableA;
        Drawable drawableA2;
        Intrinsics.checkNotNullParameter(options, "options");
        String str = options.get("title");
        CustomQrToolbarViewBinding customQrToolbarViewBinding = this.f34434s0;
        if (str != null) {
            customQrToolbarViewBinding.toolbarTitle.setText(str);
        }
        String str2 = options.get("navBarBackgroundColor");
        if (str2 != null) {
            customQrToolbarViewBinding.toolbar.setBackgroundColor(Color.parseColor(str2));
        }
        String str3 = options.get("navBarTintColor");
        if (str3 != null) {
            customQrToolbarViewBinding.toolbarTitle.setTextColor(Color.parseColor(str3));
        }
        String str4 = options.get("closeImageName");
        if (str4 != null && (drawableA2 = a(str4)) != null) {
            customQrToolbarViewBinding.toolbarEndButton.setImageDrawable(drawableA2);
        }
        customQrToolbarViewBinding.toolbarStartButton.setVisibility(8);
        String str5 = options.get("arrowBackImageName");
        if (str5 != null && (drawableA = a(str5)) != null) {
            customQrToolbarViewBinding.toolbarStartButton.setImageDrawable(drawableA);
            customQrToolbarViewBinding.toolbarStartButton.setVisibility(0);
        }
        String str6 = options.get("closeImageName");
        if (str6 != null) {
            if (str6.length() > 0) {
                Drawable drawableA3 = a(str6);
                if (drawableA3 != null) {
                    customQrToolbarViewBinding.toolbarEndButton.setImageDrawable(drawableA3);
                }
            } else {
                customQrToolbarViewBinding.toolbarEndButton.setVisibility(8);
            }
        }
        customQrToolbarViewBinding.galleryTitle.setVisibility(8);
        String str7 = options.get("galleryTitle");
        if (str7 != null) {
            customQrToolbarViewBinding.galleryTitle.setText(str7);
            customQrToolbarViewBinding.galleryTitle.setVisibility(0);
        }
        String str8 = options.get("descriptionLabelNameLinking");
        Unit unit2 = null;
        if (str8 != null) {
            customQrToolbarViewBinding.qrMessageLinking.setText(str8);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            AppCompatTextView qrMessageLinking = customQrToolbarViewBinding.qrMessageLinking;
            Intrinsics.checkNotNullExpressionValue(qrMessageLinking, "qrMessageLinking");
            ViewExtensionsKt.show(qrMessageLinking, false);
        }
        String str9 = options.get("descriptionLabelName");
        if (str9 != null) {
            customQrToolbarViewBinding.qrMessage.setText(str9);
            unit2 = Unit.INSTANCE;
        }
        if (unit2 == null) {
            AppCompatTextView qrMessage = customQrToolbarViewBinding.qrMessage;
            Intrinsics.checkNotNullExpressionValue(qrMessage, "qrMessage");
            ViewExtensionsKt.show(qrMessage, false);
        }
    }

    @Override // com.bbva.glomohybrid.qrscanner.view.GalleryView, kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f34433r0.getCoroutineContext();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomQRToolbarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.bbva.glomohybrid.qrscanner.view.GalleryView
    @Nullable
    public QrToolbarViewModel getViewModel() {
        return (QrToolbarViewModel) this.viewModel.getValue();
    }

    public /* synthetic */ CustomQRToolbarView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public CustomQRToolbarView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        LiveData<Event<QrContract.Event>> event;
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34433r0 = CoroutineScopeKt.MainScope();
        CustomQrToolbarViewBinding customQrToolbarViewBindingInflate = CustomQrToolbarViewBinding.inflate(LayoutInflater.from(context), this, false);
        Intrinsics.checkNotNullExpressionValue(customQrToolbarViewBindingInflate, "inflate(...)");
        this.f34434s0 = customQrToolbarViewBindingInflate;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(new Function0<QrToolbarViewModel>() { // from class: com.bbva.glomohybrid.qrscanner.view.CustomQRToolbarView$special$$inlined$injectOrNull$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.glomohybrid.qrscanner.viewmodel.QrToolbarViewModel, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final QrToolbarViewModel invoke() {
                return a.e(this).getOrNull(Reflection.getOrCreateKotlinClass(QrToolbarViewModel.class), qualifier, objArr);
            }
        });
        addView(customQrToolbarViewBindingInflate.getRoot());
        customQrToolbarViewBindingInflate.toolbarEndButton.setOnClickListener(new View.OnClickListener() { // from class: da.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = CustomQRToolbarView.f34432u0;
                CustomQRToolbarView this$0 = this.f68146p0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                QrToolbarViewModel viewModel = this$0.getViewModel();
                if (viewModel != null) {
                    viewModel.setIntent(QrContract.Intent.CloseButtonClick.INSTANCE);
                }
            }
        });
        customQrToolbarViewBindingInflate.toolbarStartButton.setOnClickListener(new x8.a(this, 1));
        customQrToolbarViewBindingInflate.galleryTitle.setOnClickListener(new b(this, 1));
        QrToolbarViewModel viewModel = getViewModel();
        if (viewModel != null && (event = viewModel.getEvent()) != null) {
            Activity activity = getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            event.observe((LifecycleOwner) activity, new a(new d(this)));
        }
        createBackPressedEmitter();
    }
}
