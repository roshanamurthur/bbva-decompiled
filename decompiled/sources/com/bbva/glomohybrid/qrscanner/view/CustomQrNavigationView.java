package com.bbva.glomohybrid.qrscanner.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.core.imagecapture.a;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.bbva.glomohybrid.base.extensions.ViewExtensionsKt;
import com.bbva.glomohybrid.base.models.common.Event;
import com.bbva.glomohybrid.qrscanner.databinding.CustomQrNavigationViewBinding;
import com.bbva.glomohybrid.qrscanner.viewmodel.QrContract;
import com.bbva.glomohybrid.qrscanner.viewmodel.QrNavigationViewModel;
import da.e;
import da.f;
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
import y8.b;

/* JADX INFO: compiled from: CustomQrNavigationView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B'\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\n\u001a\u00020\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/view/CustomQrNavigationView;", "Lcom/bbva/glomohybrid/qrscanner/view/GalleryView;", "Lorg/koin/core/component/KoinComponent;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/bbva/qr/view/Configurable;", "", "", "options", "", "configureAttributes", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrNavigationViewModel;", "t0", "Lkotlin/Lazy;", "getViewModel", "()Lcom/bbva/glomohybrid/qrscanner/viewmodel/QrNavigationViewModel;", "viewModel", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCustomQrNavigationView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomQrNavigationView.kt\ncom/bbva/glomohybrid/qrscanner/view/CustomQrNavigationView\n+ 2 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n29#2,4:177\n1#3:181\n*S KotlinDebug\n*F\n+ 1 CustomQrNavigationView.kt\ncom/bbva/glomohybrid/qrscanner/view/CustomQrNavigationView\n*L\n31#1:177,4\n*E\n"})
public final class CustomQrNavigationView extends GalleryView {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ int f34440u0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f34441r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final CustomQrNavigationViewBinding f34442s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy viewModel;

    /* JADX INFO: compiled from: CustomQrNavigationView.kt */
    public static final class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f34444a;

        public a(f function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f34444a = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f34444a, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f34444a;
        }

        public final int hashCode() {
            return this.f34444a.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f34444a.invoke(obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomQrNavigationView(@NotNull Context context) {
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
        Unit unit2;
        Unit unit3;
        Unit unit4;
        Unit unit5;
        Drawable drawableA;
        Drawable drawableA2;
        Drawable drawableA3;
        Drawable drawableA4;
        Drawable drawableA5;
        Intrinsics.checkNotNullParameter(options, "options");
        String str = options.get("title");
        CustomQrNavigationViewBinding customQrNavigationViewBinding = this.f34442s0;
        if (str != null) {
            customQrNavigationViewBinding.toolbarTitle.setText(str);
        }
        String str2 = options.get("navBarTintColor");
        if (str2 != null) {
            customQrNavigationViewBinding.toolbarTitle.setTextColor(Color.parseColor(str2));
        }
        String str3 = options.get("closeImageName");
        if (str3 != null && (drawableA5 = a(str3)) != null) {
            customQrNavigationViewBinding.closeButton.setImageDrawable(drawableA5);
        }
        String str4 = options.get("navBarBackgroundColor");
        if (str4 != null) {
            customQrNavigationViewBinding.toolbar.setBackgroundColor(Color.parseColor(str4));
        }
        String str5 = options.get("toolbarImageName");
        Unit unit6 = null;
        if (str5 == null || (drawableA4 = a(str5)) == null) {
            unit = null;
        } else {
            customQrNavigationViewBinding.toolbarButton.setImageDrawable(drawableA4);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            AppCompatImageButton toolbarButton = customQrNavigationViewBinding.toolbarButton;
            Intrinsics.checkNotNullExpressionValue(toolbarButton, "toolbarButton");
            ViewExtensionsKt.show(toolbarButton, false);
        }
        String str6 = options.get("mainButtonActionTitle");
        if (str6 != null) {
            customQrNavigationViewBinding.mainButton.setText(str6);
            unit2 = Unit.INSTANCE;
        } else {
            unit2 = null;
        }
        if (unit2 == null) {
            AppCompatButton mainButton = customQrNavigationViewBinding.mainButton;
            Intrinsics.checkNotNullExpressionValue(mainButton, "mainButton");
            ViewExtensionsKt.show(mainButton, false);
        }
        String str7 = options.get("mainButtonActionTitleColor");
        if (str7 != null) {
            customQrNavigationViewBinding.mainButton.setTextColor(Color.parseColor(str7));
        }
        String str8 = options.get("bottomViewBackgroundColor");
        if (str8 != null) {
            customQrNavigationViewBinding.bottomLinear.setBackgroundColor(Color.parseColor(str8));
        }
        String str9 = options.get("leftBottomButtonTitle");
        if (str9 != null) {
            customQrNavigationViewBinding.leftButton.setText(str9);
            unit3 = Unit.INSTANCE;
        } else {
            unit3 = null;
        }
        if (unit3 == null) {
            AppCompatButton leftButton = customQrNavigationViewBinding.leftButton;
            Intrinsics.checkNotNullExpressionValue(leftButton, "leftButton");
            ViewExtensionsKt.show(leftButton, false);
        }
        String str10 = options.get("leftBottomButtonImage");
        if (str10 != null && (drawableA3 = a(str10)) != null) {
            customQrNavigationViewBinding.leftButton.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawableA3, (Drawable) null, (Drawable) null);
        }
        String str11 = options.get("middleBottomButtonTitle");
        if (str11 != null) {
            customQrNavigationViewBinding.middleButton.setText(str11);
            unit4 = Unit.INSTANCE;
        } else {
            unit4 = null;
        }
        if (unit4 == null) {
            AppCompatButton middleButton = customQrNavigationViewBinding.middleButton;
            Intrinsics.checkNotNullExpressionValue(middleButton, "middleButton");
            ViewExtensionsKt.show(middleButton, false);
        }
        String str12 = options.get("middleBottomButtonImage");
        if (str12 != null && (drawableA2 = a(str12)) != null) {
            customQrNavigationViewBinding.middleButton.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawableA2, (Drawable) null, (Drawable) null);
        }
        String str13 = options.get("rightBottomButtonTitle");
        if (str13 != null) {
            customQrNavigationViewBinding.rightButton.setText(str13);
            unit5 = Unit.INSTANCE;
        } else {
            unit5 = null;
        }
        if (unit5 == null) {
            AppCompatButton rightButton = customQrNavigationViewBinding.rightButton;
            Intrinsics.checkNotNullExpressionValue(rightButton, "rightButton");
            ViewExtensionsKt.show(rightButton, false);
        }
        String str14 = options.get("rightBottomButtonImage");
        if (str14 != null && (drawableA = a(str14)) != null) {
            customQrNavigationViewBinding.rightButton.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawableA, (Drawable) null, (Drawable) null);
        }
        String str15 = options.get("bottomButtonsTextColor");
        if (str15 != null) {
            int color = Color.parseColor(str15);
            customQrNavigationViewBinding.leftButton.setTextColor(color);
            customQrNavigationViewBinding.rightButton.setTextColor(color);
        }
        String str16 = options.get("descriptionLabelName");
        if (str16 != null) {
            customQrNavigationViewBinding.qrMessage.setText(str16);
            unit6 = Unit.INSTANCE;
        }
        if (unit6 == null) {
            AppCompatTextView qrMessage = customQrNavigationViewBinding.qrMessage;
            Intrinsics.checkNotNullExpressionValue(qrMessage, "qrMessage");
            ViewExtensionsKt.show(qrMessage, false);
        }
    }

    @Override // com.bbva.glomohybrid.qrscanner.view.GalleryView, kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f34441r0.getCoroutineContext();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomQrNavigationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.bbva.glomohybrid.qrscanner.view.GalleryView
    @Nullable
    public QrNavigationViewModel getViewModel() {
        return (QrNavigationViewModel) this.viewModel.getValue();
    }

    public /* synthetic */ CustomQrNavigationView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public CustomQrNavigationView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        LiveData<Event<QrContract.Event>> event;
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34441r0 = CoroutineScopeKt.MainScope();
        CustomQrNavigationViewBinding customQrNavigationViewBindingInflate = CustomQrNavigationViewBinding.inflate(LayoutInflater.from(context), this, false);
        Intrinsics.checkNotNullExpressionValue(customQrNavigationViewBindingInflate, "inflate(...)");
        this.f34442s0 = customQrNavigationViewBindingInflate;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(new Function0<QrNavigationViewModel>() { // from class: com.bbva.glomohybrid.qrscanner.view.CustomQrNavigationView$special$$inlined$injectOrNull$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.glomohybrid.qrscanner.viewmodel.QrNavigationViewModel, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final QrNavigationViewModel invoke() {
                return a.e(this).getOrNull(Reflection.getOrCreateKotlinClass(QrNavigationViewModel.class), qualifier, objArr);
            }
        });
        addView(customQrNavigationViewBindingInflate.getRoot());
        customQrNavigationViewBindingInflate.toolbarButton.setOnClickListener(new e(this, 0));
        customQrNavigationViewBindingInflate.closeButton.setOnClickListener(new y8.a(this, 1));
        customQrNavigationViewBindingInflate.mainButton.setOnClickListener(new b(this, 1));
        customQrNavigationViewBindingInflate.leftButton.setOnClickListener(new p5.a(this, 2));
        customQrNavigationViewBindingInflate.middleButton.setOnClickListener(new p5.b(this, 1));
        customQrNavigationViewBindingInflate.rightButton.setOnClickListener(new b9.a(this, 1));
        QrNavigationViewModel viewModel = getViewModel();
        if (viewModel != null && (event = viewModel.getEvent()) != null) {
            Activity activity = getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            event.observe((LifecycleOwner) activity, new a(new f(this)));
        }
        createBackPressedEmitter();
    }
}
