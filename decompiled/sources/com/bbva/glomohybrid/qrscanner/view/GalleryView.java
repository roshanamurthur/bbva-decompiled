package com.bbva.glomohybrid.qrscanner.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.c;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityLauncher;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResult;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResultRequest;
import com.bbva.androidtoolkit.plugin.activity.result.LaunchResultCallback;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.qrscanner.viewmodel.GalleryViewModel;
import com.bbva.glomohybrid.qrscanner.viewmodel.QrContract;
import com.bbva.plugin.media.capture.util.Constants;
import com.bbva.qr.activity.ScannerActivity;
import com.bbva.qr.model.input.DecoderSettings;
import com.bbva.qr.view.Configurable;
import da.g;
import da.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: compiled from: GalleryView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B'\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0007\u001a\u00020\u0006H\u0004J\b\u0010\b\u001a\u00020\u0006H\u0004R\u0014\u0010\f\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/view/GalleryView;", "Landroid/widget/RelativeLayout;", "Lorg/koin/core/component/KoinComponent;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/bbva/qr/view/Configurable;", "", "launchGalleryIntent", "createBackPressedEmitter", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Lcom/bbva/glomohybrid/qrscanner/viewmodel/GalleryViewModel;", "getViewModel", "()Lcom/bbva/glomohybrid/qrscanner/viewmodel/GalleryViewModel;", "viewModel", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public abstract class GalleryView extends RelativeLayout implements KoinComponent, DefaultLifecycleObserver, CoroutineScope, Configurable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f34448p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public DecoderSettings f34449q0;

    /* JADX INFO: compiled from: GalleryView.kt */
    public static final class a extends Lambda implements Function1<ActivityResultRequest.Builder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f34450p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActivityResultRequest.Builder builder) {
            ActivityResultRequest.Builder create = builder;
            Intrinsics.checkNotNullParameter(create, "$this$create");
            create.setType(Constants.INTENT_TYPE);
            create.setAction("android.intent.action.GET_CONTENT");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: GalleryView.kt */
    public static final class b extends Lambda implements Function1<ActivityResult, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActivityResult activityResult) {
            ActivityResult it = activityResult;
            Intrinsics.checkNotNullParameter(it, "it");
            GalleryView.access$dispatchResult(GalleryView.this, it);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GalleryView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void access$dispatchResult(GalleryView galleryView, ActivityResult activityResult) {
        GalleryViewModel viewModel;
        galleryView.getClass();
        if (!(activityResult instanceof ActivityResult.Success)) {
            if (!(activityResult instanceof ActivityResult.Cancel) || (viewModel = galleryView.getViewModel()) == null) {
                return;
            }
            viewModel.setIntent(QrContract.Intent.CloseGalleryClick.INSTANCE);
            return;
        }
        Intent intent = ((ActivityResult.Success) activityResult).getIntent();
        if (intent.getData() != null) {
            Uri uri = Uri.parse(String.valueOf(intent.getData()));
            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
            new g(galleryView, uri).invoke();
            BuildersKt__Builders_commonKt.launch$default(galleryView, null, null, new h(galleryView, null), 3, null);
        }
    }

    public void configureAttributes(@NotNull Map<String, String> map) {
        Configurable.DefaultImpls.configureAttributes(this, map);
    }

    public final void createBackPressedEmitter() {
        GalleryViewModel viewModel = getViewModel();
        if (viewModel != null) {
            Activity activity = getActivity();
            ComponentActivity componentActivity = activity instanceof ComponentActivity ? (ComponentActivity) activity : null;
            if (componentActivity != null) {
                componentActivity.getOnBackPressedDispatcher().addCallback(componentActivity, new OnBackPressedEmitter(viewModel));
            }
        }
    }

    @Nullable
    public final Activity getActivity() {
        Context context = getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f34448p0.getCoroutineContext();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Nullable
    public abstract GalleryViewModel getViewModel();

    public final void launchGalleryIntent() {
        LaunchResultCallback launchResultCallbackListen = new ActivityLauncher().create(a.f34450p0).listen(new b());
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.bbva.qr.activity.ScannerActivity");
        launchResultCallbackListen.launch((ScannerActivity) context);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        c.a(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        c.b(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        c.c(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        c.d(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        c.e(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        c.f(this, lifecycleOwner);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GalleryView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ GalleryView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GalleryView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34448p0 = CoroutineScopeKt.MainScope();
    }
}
