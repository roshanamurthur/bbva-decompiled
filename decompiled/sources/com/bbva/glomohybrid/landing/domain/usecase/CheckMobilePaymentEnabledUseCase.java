package com.bbva.glomohybrid.landing.domain.usecase;

import androidx.camera.core.imagecapture.a;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.mobilepayment.commons.PaymentEnrollHandler;
import com.bbva.glomoutils.usecase.UseCase;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: compiled from: CheckMobilePaymentEnabledUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/usecase/CheckMobilePaymentEnabledUseCase;", "Lcom/bbva/glomoutils/usecase/UseCase;", "", "execute", "()Ljava/lang/Boolean;", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCheckMobilePaymentEnabledUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckMobilePaymentEnabledUseCase.kt\ncom/bbva/glomohybrid/landing/domain/usecase/CheckMobilePaymentEnabledUseCase\n+ 2 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n*L\n1#1,16:1\n29#2,4:17\n*S KotlinDebug\n*F\n+ 1 CheckMobilePaymentEnabledUseCase.kt\ncom/bbva/glomohybrid/landing/domain/usecase/CheckMobilePaymentEnabledUseCase\n*L\n10#1:17,4\n*E\n"})
public final class CheckMobilePaymentEnabledUseCase implements UseCase<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f32796a;

    /* JADX WARN: Multi-variable type inference failed */
    public CheckMobilePaymentEnabledUseCase(@NotNull final ViewModelComponentsProviders provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f32796a = LazyKt__LazyJVMKt.lazy(new Function0<PaymentEnrollHandler>() { // from class: com.bbva.glomohybrid.landing.domain.usecase.CheckMobilePaymentEnabledUseCase$special$$inlined$injectOrNull$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.glomohybrid.mobilepayment.commons.PaymentEnrollHandler, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final PaymentEnrollHandler invoke() {
                return a.e(provider).getOrNull(Reflection.getOrCreateKotlinClass(PaymentEnrollHandler.class), qualifier, objArr);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bbva.glomoutils.usecase.UseCase
    @NotNull
    public Boolean execute() {
        PaymentEnrollHandler paymentEnrollHandler = (PaymentEnrollHandler) this.f32796a.getValue();
        return Boolean.valueOf(paymentEnrollHandler != null ? paymentEnrollHandler.checkEnabled() : false);
    }
}
