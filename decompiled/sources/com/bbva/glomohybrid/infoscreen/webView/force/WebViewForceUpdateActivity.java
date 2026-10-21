package com.bbva.glomohybrid.infoscreen.webView.force;

import android.os.Bundle;
import android.view.Menu;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.glomohybrid.infoscreen.InfoScreenActivity;
import com.bbva.glomohybrid.infoscreen.InfoScreenComponent;
import com.bbva.glomohybrid.infoscreen.webView.force.router.WebViewForceUpdateRouter;
import com.bbva.glomohybrid.infoscreen.webView.force.viewmodel.WebViewForceUpdateViewModel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: WebViewForceUpdateActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0014R\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/webView/force/WebViewForceUpdateActivity;", "Lcom/bbva/glomohybrid/infoscreen/InfoScreenActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "onPositiveButtonClicked", "", "getId", "()Ljava/lang/String;", "id", "<init>", "()V", "Companion", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nWebViewForceUpdateActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewForceUpdateActivity.kt\ncom/bbva/glomohybrid/infoscreen/webView/force/WebViewForceUpdateActivity\n+ 2 ActivityVM.kt\norg/koin/androidx/viewmodel/ext/android/ActivityVMKt\n*L\n1#1,51:1\n41#2,6:52\n*S KotlinDebug\n*F\n+ 1 WebViewForceUpdateActivity.kt\ncom/bbva/glomohybrid/infoscreen/webView/force/WebViewForceUpdateActivity\n*L\n15#1:52,6\n*E\n"})
public final class WebViewForceUpdateActivity extends InfoScreenActivity {

    @NotNull
    public static final String ID = "webview-force-update";

    @NotNull
    public final Lazy F0;

    @NotNull
    public final WebViewForceUpdateRouter G0;

    /* JADX WARN: Multi-variable type inference failed */
    public WebViewForceUpdateActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        this.F0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<WebViewForceUpdateViewModel>() { // from class: com.bbva.glomohybrid.infoscreen.webView.force.WebViewForceUpdateActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.ViewModel, com.bbva.glomohybrid.infoscreen.webView.force.viewmodel.WebViewForceUpdateViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WebViewForceUpdateViewModel invoke() {
                CreationExtras defaultViewModelCreationExtras;
                Qualifier qualifier2 = qualifier;
                Function0 function0 = objArr2;
                ComponentActivity componentActivity = this;
                ViewModelStore viewModelStore = componentActivity.getViewModelStore();
                Function0 function1 = objArr;
                if (function1 == null || (defaultViewModelCreationExtras = (CreationExtras) function1.invoke()) == null) {
                    defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                }
                CreationExtras creationExtras = defaultViewModelCreationExtras;
                Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(componentActivity);
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(WebViewForceUpdateViewModel.class);
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return GetViewModelKt.resolveViewModel(orCreateKotlinClass, viewModelStore, (4 & 4) != 0 ? null : null, creationExtras, (4 & 16) != 0 ? null : qualifier2, koinScope, (4 & 64) != 0 ? null : function0);
            }
        });
        this.G0 = new WebViewForceUpdateRouter();
    }

    public static final WebViewForceUpdateViewModel access$getViewModel(WebViewForceUpdateActivity webViewForceUpdateActivity) {
        return (WebViewForceUpdateViewModel) webViewForceUpdateActivity.F0.getValue();
    }

    public static final void access$handleEvent(WebViewForceUpdateActivity webViewForceUpdateActivity, WebViewForceUpdateContract.Event event) {
        webViewForceUpdateActivity.getClass();
        if (event instanceof WebViewForceUpdateContract.Event.Navigation) {
            webViewForceUpdateActivity.G0.navigate(webViewForceUpdateActivity, (WebViewForceUpdateContract.Event.Navigation) event);
        }
    }

    @Override // com.bbva.glomohybrid.infoscreen.InfoScreenActivity
    @NotNull
    public String getId() {
        return "webview-force-update";
    }

    @Override // com.bbva.glomohybrid.infoscreen.InfoScreenActivity, com.bbva.glomohybrid.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        ComponentManager.addComponentToPage(hashCode(), new InfoScreenComponent(null, 1, null));
        super.onCreate(savedInstanceState);
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new a(this, null));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        return false;
    }

    @Override // com.bbva.glomohybrid.infoscreen.InfoScreenActivity
    public void onPositiveButtonClicked() {
        ((WebViewForceUpdateViewModel) this.F0.getValue()).setIntent(WebViewForceUpdateContract.Intent.PositiveButtonTap.INSTANCE);
    }
}
