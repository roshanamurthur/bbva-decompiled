package com.bbva.glomohybrid.infoscreen.mobilepayment;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.component.ui.biometrics.BiometricsComponent;
import com.bbva.glomohybrid.base.extensions.BundleExtensionsKt;
import com.bbva.glomohybrid.base.extensions.ContextExtensionKt;
import com.bbva.glomohybrid.base.handler.BiometricsIntentHandler;
import com.bbva.glomohybrid.infoscreen.InfoScreenActivity;
import com.bbva.glomohybrid.infoscreen.InfoScreenComponent;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: PaymentsInfoNotificationActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoNotificationActivity;", "Lcom/bbva/glomohybrid/infoscreen/InfoScreenActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onPositiveButtonClicked", "onBackPressed", "", "getId", "()Ljava/lang/String;", "id", "<init>", "()V", "Companion", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPaymentsInfoNotificationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentsInfoNotificationActivity.kt\ncom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoNotificationActivity\n+ 2 ActivityVM.kt\norg/koin/androidx/viewmodel/ext/android/ActivityVMKt\n*L\n1#1,120:1\n41#2,6:121\n*S KotlinDebug\n*F\n+ 1 PaymentsInfoNotificationActivity.kt\ncom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoNotificationActivity\n*L\n24#1:121,6\n*E\n"})
public final class PaymentsInfoNotificationActivity extends InfoScreenActivity {

    @NotNull
    public static final String ID = "payments-info";

    @NotNull
    public static final String TOHU_INFO_PAYMENT_TYPE = "TOHU_INFO_PAYMENT_TYPE";

    @NotNull
    public final Lazy F0;

    @NotNull
    public final Lazy G0;

    @NotNull
    public final BiometricsComponent H0;

    /* JADX INFO: compiled from: PaymentsInfoNotificationActivity.kt */
    public static final class a extends Lambda implements Function0<BiometricsIntentHandler> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final BiometricsIntentHandler invoke() {
            return new BiometricsIntentHandler(PaymentsInfoNotificationActivity.this.hashCode());
        }
    }

    /* JADX INFO: compiled from: PaymentsInfoNotificationActivity.kt */
    public static final class b extends Lambda implements Function0<ParametersHolder> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ContextExtensionKt.activityParameters(PaymentsInfoNotificationActivity.this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentsInfoNotificationActivity() {
        final b bVar = new b();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.F0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<PaymentsInfoNotificationViewModel>() { // from class: com.bbva.glomohybrid.infoscreen.mobilepayment.PaymentsInfoNotificationActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.ViewModel, com.bbva.glomohybrid.infoscreen.mobilepayment.PaymentsInfoNotificationViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PaymentsInfoNotificationViewModel invoke() {
                CreationExtras defaultViewModelCreationExtras;
                Qualifier qualifier2 = qualifier;
                Function0 function0 = bVar;
                ComponentActivity componentActivity = this;
                ViewModelStore viewModelStore = componentActivity.getViewModelStore();
                Function0 function1 = objArr;
                if (function1 == null || (defaultViewModelCreationExtras = (CreationExtras) function1.invoke()) == null) {
                    defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                }
                CreationExtras creationExtras = defaultViewModelCreationExtras;
                Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(componentActivity);
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PaymentsInfoNotificationViewModel.class);
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return GetViewModelKt.resolveViewModel(orCreateKotlinClass, viewModelStore, (4 & 4) != 0 ? null : null, creationExtras, (4 & 16) != 0 ? null : qualifier2, koinScope, (4 & 64) != 0 ? null : function0);
            }
        });
        this.G0 = LazyKt__LazyJVMKt.lazy(new a());
        this.H0 = new BiometricsComponent(this, BiometricsIntentHandler.ID);
    }

    public static final BiometricsIntentHandler access$getBiometricsIntentHandler(PaymentsInfoNotificationActivity paymentsInfoNotificationActivity) {
        return (BiometricsIntentHandler) paymentsInfoNotificationActivity.G0.getValue();
    }

    public static final void access$handleBiometricsIntents(PaymentsInfoNotificationActivity paymentsInfoNotificationActivity, BiometricsIntentHandler.Intent intent) {
        paymentsInfoNotificationActivity.getClass();
        if (Intrinsics.areEqual(intent, BiometricsIntentHandler.Intent.AccessDenied.INSTANCE)) {
            paymentsInfoNotificationActivity.i().setIntent(PaymentsInfoContract.Intent.Error.INSTANCE);
        } else if (Intrinsics.areEqual(intent, BiometricsIntentHandler.Intent.AccessGranted.INSTANCE)) {
            paymentsInfoNotificationActivity.i().setIntent(PaymentsInfoContract.Intent.Authenticated.INSTANCE);
        }
    }

    public static final void access$handleEvent(PaymentsInfoNotificationActivity paymentsInfoNotificationActivity, PaymentsInfoContract.Event event) {
        paymentsInfoNotificationActivity.getClass();
        if (event instanceof PaymentsInfoContract.Event.Navigation) {
            paymentsInfoNotificationActivity.finish();
            return;
        }
        if (Intrinsics.areEqual(event, PaymentsInfoContract.Event.CloseScreen.INSTANCE)) {
            paymentsInfoNotificationActivity.finish();
            return;
        }
        if (Intrinsics.areEqual(event, PaymentsInfoContract.Event.SecuritySettings.INSTANCE)) {
            paymentsInfoNotificationActivity.startActivity(new Intent("android.settings.SETTINGS"));
            paymentsInfoNotificationActivity.finish();
        } else if (event instanceof PaymentsInfoContract.Event.Authentication) {
            Map<String, Object> uiModel = ((PaymentsInfoContract.Event.Authentication) event).getUiModel();
            BiometricsComponent biometricsComponent = paymentsInfoNotificationActivity.H0;
            biometricsComponent.setProperties(uiModel);
            biometricsComponent.authenticate(paymentsInfoNotificationActivity);
        }
    }

    public static final void access$handleState(PaymentsInfoNotificationActivity paymentsInfoNotificationActivity, PaymentsInfoContract.State state) {
        paymentsInfoNotificationActivity.getClass();
        if (state instanceof PaymentsInfoContract.State.AuthGranted) {
            paymentsInfoNotificationActivity.setDataInfoScreen(((PaymentsInfoContract.State.AuthGranted) state).getScreenData());
            return;
        }
        if (state instanceof PaymentsInfoContract.State.AuthRequired) {
            paymentsInfoNotificationActivity.setDataInfoScreen(((PaymentsInfoContract.State.AuthRequired) state).getScreenData());
            return;
        }
        if (state instanceof PaymentsInfoContract.State.InsecureDevice) {
            paymentsInfoNotificationActivity.setDataInfoScreen(((PaymentsInfoContract.State.InsecureDevice) state).getScreenData());
            return;
        }
        if (state instanceof PaymentsInfoContract.State.PaymentAbort) {
            paymentsInfoNotificationActivity.setDataInfoScreen(((PaymentsInfoContract.State.PaymentAbort) state).getScreenData());
            return;
        }
        if (state instanceof PaymentsInfoContract.State.ResultOk) {
            paymentsInfoNotificationActivity.setDataInfoScreen(((PaymentsInfoContract.State.ResultOk) state).getScreenData());
        } else if (state instanceof PaymentsInfoContract.State.NotDefaultCard) {
            paymentsInfoNotificationActivity.setDataInfoScreen(((PaymentsInfoContract.State.NotDefaultCard) state).getScreenData());
        } else if (state instanceof PaymentsInfoContract.State.TokensNotPresent) {
            paymentsInfoNotificationActivity.setDataInfoScreen(((PaymentsInfoContract.State.TokensNotPresent) state).getScreenData());
        }
    }

    @Override // com.bbva.glomohybrid.infoscreen.InfoScreenActivity
    @NotNull
    public String getId() {
        return ID;
    }

    public final PaymentsInfoNotificationViewModel i() {
        return (PaymentsInfoNotificationViewModel) this.F0.getValue();
    }

    @Override // com.bbva.glomohybrid.infoscreen.InfoScreenActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // com.bbva.glomohybrid.infoscreen.InfoScreenActivity, com.bbva.glomohybrid.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        ComponentManager.addComponentToPage(hashCode(), new InfoScreenComponent(null, 1, null));
        ComponentManager.addComponentToPage(hashCode(), BiometricsIntentHandler.ID, this.H0);
        super.onCreate(savedInstanceState);
        i().addViewModelAsComponent(hashCode());
        PaymentsInfoNotificationViewModel paymentsInfoNotificationViewModelI = i();
        Bundle extras = getIntent().getExtras();
        paymentsInfoNotificationViewModelI.handleExtraData(extras != null ? BundleExtensionsKt.toMap(extras) : null);
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new com.bbva.glomohybrid.infoscreen.mobilepayment.b(this, null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new com.bbva.glomohybrid.infoscreen.mobilepayment.a(this, null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new z8.a(this, null));
    }

    @Override // com.bbva.glomohybrid.infoscreen.InfoScreenActivity
    public void onPositiveButtonClicked() {
        i().setIntent(PaymentsInfoContract.Intent.ButtonClick.INSTANCE);
    }
}
