package com.bbva.glomohybrid.infoscreen.mobilepayment;

import androidx.lifecycle.ViewModelKt;
import com.bbva.component.dm.biometriclogin.BiometricAuthenticationDataManager;
import com.bbva.component.dm.biometriclogin.domain.provider.BiometricAvailability;
import com.bbva.glomoconfig.factory.GlobalPaymentViewComponentFactory;
import com.bbva.glomohybrid.base.viewmodel.BaseViewModel;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.infoscreen.data.model.InfoScreenData;
import com.bbva.glomohybrid.infoscreen.mobilepayment.factory.PaymentInfoScreenDataFactory;
import com.bbva.glomohybrid.mobilepayment.commons.PaymentEnrollHandler;
import com.bbva.glomohybrid.mobilepayment.commons.model.PaymentInfoType;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: PaymentsInfoNotificationViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010\u0007\u001a\u00020\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006!"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoNotificationViewModel;", "Lcom/bbva/glomohybrid/base/viewmodel/BaseViewModel;", "", "", "", "bundle", "", "handleExtraData", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$Intent;", "intent", "setIntent", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$State;", "u0", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$Event;", "w0", "Lkotlinx/coroutines/flow/Flow;", "getEvents", "()Lkotlinx/coroutines/flow/Flow;", "events", "getId", "()Ljava/lang/String;", "id", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;)V", "Companion", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPaymentsInfoNotificationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentsInfoNotificationViewModel.kt\ncom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoNotificationViewModel\n+ 2 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n+ 3 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,145:1\n29#2,4:146\n56#3,6:150\n*S KotlinDebug\n*F\n+ 1 PaymentsInfoNotificationViewModel.kt\ncom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoNotificationViewModel\n*L\n27#1:146,4\n29#1:150,6\n*E\n"})
public final class PaymentsInfoNotificationViewModel extends BaseViewModel {

    @NotNull
    public static final String ID = "payments-info-view-model";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public String f32339q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Lazy f32340r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Lazy f32341s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<PaymentsInfoContract.State> f32342t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f32343u0;

    @NotNull
    public final Channel<PaymentsInfoContract.Event> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Flow<PaymentsInfoContract.Event> events;

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentsInfoNotificationViewModel(@NotNull final ViewModelComponentsProviders provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f32340r0 = LazyKt__LazyJVMKt.lazy(new Function0<PaymentEnrollHandler>() { // from class: com.bbva.glomohybrid.infoscreen.mobilepayment.PaymentsInfoNotificationViewModel$special$$inlined$injectOrNull$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.glomohybrid.mobilepayment.commons.PaymentEnrollHandler, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final PaymentEnrollHandler invoke() {
                return androidx.camera.core.imagecapture.a.e(provider).getOrNull(Reflection.getOrCreateKotlinClass(PaymentEnrollHandler.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.f32341s0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<BiometricAuthenticationDataManager>() { // from class: com.bbva.glomohybrid.infoscreen.mobilepayment.PaymentsInfoNotificationViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.component.dm.biometriclogin.BiometricAuthenticationDataManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BiometricAuthenticationDataManager invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : androidx.camera.core.imagecapture.a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(BiometricAuthenticationDataManager.class), objArr2, objArr3);
            }
        });
        MutableStateFlow<PaymentsInfoContract.State> MutableStateFlow = StateFlowKt.MutableStateFlow(PaymentsInfoContract.State.Loading.INSTANCE);
        this.f32342t0 = MutableStateFlow;
        this.f32343u0 = MutableStateFlow;
        Channel<PaymentsInfoContract.Event> channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
        this.v0 = channelChannel$default;
        this.events = FlowKt.receiveAsFlow(channelChannel$default);
    }

    public static final Map access$getAuthenticationUiModel(PaymentsInfoNotificationViewModel paymentsInfoNotificationViewModel) {
        return ((BiometricAuthenticationDataManager) paymentsInfoNotificationViewModel.f32341s0.getValue()).isDeviceBiometricsEnabled() instanceof BiometricAvailability.Success ? GlobalPaymentViewComponentFactory.INSTANCE.paymentBiometricsDialog() : GlobalPaymentViewComponentFactory.INSTANCE.paymentCredentialsDialog();
    }

    public final void a() {
        InfoScreenData data = PaymentInfoScreenDataFactory.INSTANCE.getData(this.f32339q0);
        String str = this.f32339q0;
        boolean zAreEqual = Intrinsics.areEqual(str, PaymentInfoType.SUCCESS.getType());
        MutableStateFlow<PaymentsInfoContract.State> mutableStateFlow = this.f32342t0;
        if (zAreEqual) {
            mutableStateFlow.setValue(new PaymentsInfoContract.State.ResultOk(data));
            return;
        }
        if (Intrinsics.areEqual(str, PaymentInfoType.ERROR.getType())) {
            mutableStateFlow.setValue(new PaymentsInfoContract.State.PaymentAbort(data));
            return;
        }
        if (Intrinsics.areEqual(str, PaymentInfoType.NOT_DEFAULT_CARD.getType())) {
            mutableStateFlow.setValue(new PaymentsInfoContract.State.NotDefaultCard(data));
            return;
        }
        if (Intrinsics.areEqual(str, PaymentInfoType.TOKENS_NOT_PRESENT.getType())) {
            mutableStateFlow.setValue(new PaymentsInfoContract.State.TokensNotPresent(data));
            return;
        }
        if (Intrinsics.areEqual(str, PaymentInfoType.INSECURE_DEVICE.getType())) {
            mutableStateFlow.setValue(new PaymentsInfoContract.State.InsecureDevice(data));
            return;
        }
        if (Intrinsics.areEqual(str, PaymentInfoType.AUTHENTICATION_REQUIRED.getType())) {
            mutableStateFlow.setValue(new PaymentsInfoContract.State.AuthRequired(data));
        } else if (Intrinsics.areEqual(str, PaymentInfoType.AUTHENTICATED.getType())) {
            mutableStateFlow.setValue(new PaymentsInfoContract.State.AuthGranted(data));
        } else if (str == null) {
            mutableStateFlow.setValue(new PaymentsInfoContract.State.PaymentAbort(data));
        }
    }

    public final void b(boolean z10) {
        String type;
        if (z10) {
            PaymentEnrollHandler paymentEnrollHandler = (PaymentEnrollHandler) this.f32340r0.getValue();
            if (paymentEnrollHandler != null) {
                paymentEnrollHandler.authenticated();
            }
            type = PaymentInfoType.AUTHENTICATED.getType();
        } else {
            type = PaymentInfoType.AUTHENTICATION_REQUIRED.getType();
        }
        this.f32339q0 = type;
        a();
    }

    @NotNull
    public final Flow<PaymentsInfoContract.Event> getEvents() {
        return this.events;
    }

    @Override // com.bbva.glomohybrid.base.viewmodel.BaseViewModel
    @NotNull
    public String getId() {
        return ID;
    }

    @NotNull
    public final StateFlow<PaymentsInfoContract.State> getState() {
        return this.f32343u0;
    }

    public final void handleExtraData(@Nullable Map<String, ? extends Object> bundle) {
        Object obj;
        this.f32339q0 = (bundle == null || (obj = bundle.get(PaymentsInfoNotificationActivity.TOHU_INFO_PAYMENT_TYPE)) == null) ? null : obj.toString();
        a();
    }

    public final void setIntent(@NotNull PaymentsInfoContract.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.areEqual(intent, PaymentsInfoContract.Intent.ButtonClick.INSTANCE)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new c(this, null), 3, null);
        } else if (Intrinsics.areEqual(intent, PaymentsInfoContract.Intent.Error.INSTANCE)) {
            b(false);
        } else if (intent instanceof PaymentsInfoContract.Intent.Authenticated) {
            b(true);
        }
    }
}
