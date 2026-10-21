package mx.openpay.library.core.feature;

import androidx.compose.runtime.internal.StabilityInferred;
import c.a;
import c.b;
import c.c;
import c.d;
import c.e;
import c.f;
import c.g;
import c.h;
import com.bbva.notifications.constants.PushConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.core.mapper.OpenPayErrorMapperKt;
import mx.openpay.library.core.mapper.PaymentLinkFilterMapperKt;
import mx.openpay.library.core.mapper.PaymentLinkMapperKt;
import mx.openpay.library.core.mapper.TransactionMapperKt;
import mx.openpay.library.core.model.OpenPayCreatePaymentLink;
import mx.openpay.library.core.model.OpenPayError;
import mx.openpay.library.core.model.OpenPayPaymentLink;
import mx.openpay.library.core.model.OpenPayPaymentLinkFilter;
import mx.openpay.library.core.model.OpenPayResult;
import mx.openpay.library.core.model.OpenPayTransaction;
import mx.openpay.library.core.model.OpenPayUpdatePaymentLink;
import mx.openpay.library.domain.model.link.CreatePaymentLink;
import mx.openpay.library.domain.model.link.PaymentLink;
import mx.openpay.library.domain.model.link.PaymentLinkFilter;
import mx.openpay.library.domain.model.link.PaymentLinkStatus;
import mx.openpay.library.domain.model.link.UpdatePaymentLink;
import mx.openpay.library.domain.model.transaction.Transaction;
import mx.openpay.library.domain.usecase.GetPaymentPlansWithoutBinUseCase;
import mx.openpay.library.domain.usecase.paymentlink.CheckPaymentLinkUseCase;
import mx.openpay.library.domain.usecase.paymentlink.CreatePaymentLinkUseCase;
import mx.openpay.library.domain.usecase.paymentlink.GetAllPaymentLinksUseCase;
import mx.openpay.library.domain.usecase.paymentlink.RefundPaymentLinkUseCase;
import mx.openpay.library.domain.usecase.paymentlink.UpdatePaymentLinkStatusUseCase;
import mx.openpay.library.domain.usecase.paymentlink.UpdatePaymentLinkUseCase;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u00042\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010J!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0010J!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\u0006\u0010\u0016\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0010J'\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\n0\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Lmx/openpay/library/core/feature/PaymentLinkControllerImpl;", "Lmx/openpay/library/core/feature/PaymentLinkController;", "Lmx/openpay/library/core/model/OpenPayCreatePaymentLink;", "createPaymentLink", "Lmx/openpay/library/core/model/OpenPayResult;", "Lmx/openpay/library/core/model/OpenPayPaymentLink;", "createPayLink", "(Lmx/openpay/library/core/model/OpenPayCreatePaymentLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmx/openpay/library/core/model/OpenPayPaymentLinkFilter;", "openPayPaymentLinkFilter", "", "getAllPaymentLinks", "(Lmx/openpay/library/core/model/OpenPayPaymentLinkFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "paymentLinkId", "expirePaymentLink", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelPaymentLink", "Lmx/openpay/library/core/model/OpenPayUpdatePaymentLink;", "updatePaymentLink", "(Lmx/openpay/library/core/model/OpenPayUpdatePaymentLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkPaymentLink", "transactionId", "Lmx/openpay/library/core/model/OpenPayTransaction;", "refundPaymentLink", "", PushConstants.AMOUNT, "", "getPaymentPlans", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmx/openpay/library/domain/usecase/paymentlink/CreatePaymentLinkUseCase;", "createPaymentLinkUseCase", "Lmx/openpay/library/domain/usecase/paymentlink/GetAllPaymentLinksUseCase;", "getAllPaymentLinksUseCase", "Lmx/openpay/library/domain/usecase/paymentlink/UpdatePaymentLinkStatusUseCase;", "updatePaymentLinkStatusUseCase", "Lmx/openpay/library/domain/usecase/paymentlink/UpdatePaymentLinkUseCase;", "updatePaymentLinkUseCase", "Lmx/openpay/library/domain/usecase/paymentlink/CheckPaymentLinkUseCase;", "checkPaymentLinkUseCase", "Lmx/openpay/library/domain/usecase/paymentlink/RefundPaymentLinkUseCase;", "refundPaymentLinkUseCase", "Lmx/openpay/library/domain/usecase/GetPaymentPlansWithoutBinUseCase;", "getPaymentPlansWithoutBinUseCase", "<init>", "(Lmx/openpay/library/domain/usecase/paymentlink/CreatePaymentLinkUseCase;Lmx/openpay/library/domain/usecase/paymentlink/GetAllPaymentLinksUseCase;Lmx/openpay/library/domain/usecase/paymentlink/UpdatePaymentLinkStatusUseCase;Lmx/openpay/library/domain/usecase/paymentlink/UpdatePaymentLinkUseCase;Lmx/openpay/library/domain/usecase/paymentlink/CheckPaymentLinkUseCase;Lmx/openpay/library/domain/usecase/paymentlink/RefundPaymentLinkUseCase;Lmx/openpay/library/domain/usecase/GetPaymentPlansWithoutBinUseCase;)V", "library_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentLinkController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentLinkController.kt\nmx/openpay/library/core/feature/PaymentLinkControllerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1#2:164\n*E\n"})
public final class PaymentLinkControllerImpl implements PaymentLinkController {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreatePaymentLinkUseCase f83526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GetAllPaymentLinksUseCase f83527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UpdatePaymentLinkStatusUseCase f83528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final UpdatePaymentLinkUseCase f83529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CheckPaymentLinkUseCase f83530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RefundPaymentLinkUseCase f83531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final GetPaymentPlansWithoutBinUseCase f83532g;

    public PaymentLinkControllerImpl(@NotNull CreatePaymentLinkUseCase createPaymentLinkUseCase, @NotNull GetAllPaymentLinksUseCase getAllPaymentLinksUseCase, @NotNull UpdatePaymentLinkStatusUseCase updatePaymentLinkStatusUseCase, @NotNull UpdatePaymentLinkUseCase updatePaymentLinkUseCase, @NotNull CheckPaymentLinkUseCase checkPaymentLinkUseCase, @NotNull RefundPaymentLinkUseCase refundPaymentLinkUseCase, @NotNull GetPaymentPlansWithoutBinUseCase getPaymentPlansWithoutBinUseCase) {
        Intrinsics.checkNotNullParameter(createPaymentLinkUseCase, "createPaymentLinkUseCase");
        Intrinsics.checkNotNullParameter(getAllPaymentLinksUseCase, "getAllPaymentLinksUseCase");
        Intrinsics.checkNotNullParameter(updatePaymentLinkStatusUseCase, "updatePaymentLinkStatusUseCase");
        Intrinsics.checkNotNullParameter(updatePaymentLinkUseCase, "updatePaymentLinkUseCase");
        Intrinsics.checkNotNullParameter(checkPaymentLinkUseCase, "checkPaymentLinkUseCase");
        Intrinsics.checkNotNullParameter(refundPaymentLinkUseCase, "refundPaymentLinkUseCase");
        Intrinsics.checkNotNullParameter(getPaymentPlansWithoutBinUseCase, "getPaymentPlansWithoutBinUseCase");
        this.f83526a = createPaymentLinkUseCase;
        this.f83527b = getAllPaymentLinksUseCase;
        this.f83528c = updatePaymentLinkStatusUseCase;
        this.f83529d = updatePaymentLinkUseCase;
        this.f83530e = checkPaymentLinkUseCase;
        this.f83531f = refundPaymentLinkUseCase;
        this.f83532g = getPaymentPlansWithoutBinUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.core.feature.PaymentLinkController
    @Nullable
    public Object cancelPaymentLink(@NotNull String str, @NotNull Continuation<? super OpenPayResult<OpenPayPaymentLink>> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f25281c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f25281c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, continuation);
            }
        } else {
            aVar = new a(this, continuation);
        }
        Object objInvoke = aVar.f25279a;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f25281c;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            UpdatePaymentLinkStatusUseCase updatePaymentLinkStatusUseCase = this.f83528c;
            PaymentLinkStatus paymentLinkStatus = PaymentLinkStatus.CANCELLED;
            aVar.f25281c = 1;
            objInvoke = updatePaymentLinkStatusUseCase.invoke(str, paymentLinkStatus, aVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvoke);
        }
        Result result = (Result) objInvoke;
        if (!(result instanceof Result.Success)) {
            if (result instanceof Result.Failure) {
                return new OpenPayResult.Failure(OpenPayErrorMapperKt.mapToLibraryModel(((Result.Failure) result).getError()));
            }
            throw new NoWhenBranchMatchedException();
        }
        Result.Success success = (Result.Success) result;
        if (success.getData() == null) {
            return new OpenPayResult.Failure(OpenPayError.InternalError.INSTANCE);
        }
        Object data = success.getData();
        Intrinsics.checkNotNull(data);
        return new OpenPayResult.Success(PaymentLinkMapperKt.mapToLibraryModel((PaymentLink) data));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.core.feature.PaymentLinkController
    @Nullable
    public Object checkPaymentLink(@NotNull String str, @NotNull Continuation<? super OpenPayResult<OpenPayPaymentLink>> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f25284c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f25284c = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, continuation);
            }
        } else {
            bVar = new b(this, continuation);
        }
        Object objInvoke = bVar.f25282a;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f25284c;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            CheckPaymentLinkUseCase checkPaymentLinkUseCase = this.f83530e;
            bVar.f25284c = 1;
            objInvoke = checkPaymentLinkUseCase.invoke(str, bVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvoke);
        }
        Result result = (Result) objInvoke;
        if (!(result instanceof Result.Success)) {
            if (result instanceof Result.Failure) {
                return new OpenPayResult.Failure(OpenPayErrorMapperKt.mapToLibraryModel(((Result.Failure) result).getError()));
            }
            throw new NoWhenBranchMatchedException();
        }
        Result.Success success = (Result.Success) result;
        if (success.getData() == null) {
            return new OpenPayResult.Failure(OpenPayError.InternalError.INSTANCE);
        }
        Object data = success.getData();
        Intrinsics.checkNotNull(data);
        return new OpenPayResult.Success(PaymentLinkMapperKt.mapToLibraryModel((PaymentLink) data));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.core.feature.PaymentLinkController
    @Nullable
    public Object createPayLink(@NotNull OpenPayCreatePaymentLink openPayCreatePaymentLink, @NotNull Continuation<? super OpenPayResult<OpenPayPaymentLink>> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i10 = cVar.f25287c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f25287c = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(this, continuation);
            }
        } else {
            cVar = new c(this, continuation);
        }
        Object objInvoke = cVar.f25285a;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = cVar.f25287c;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            CreatePaymentLinkUseCase createPaymentLinkUseCase = this.f83526a;
            CreatePaymentLink createPaymentLinkMapToDomainModel = PaymentLinkMapperKt.mapToDomainModel(openPayCreatePaymentLink);
            cVar.f25287c = 1;
            objInvoke = createPaymentLinkUseCase.invoke(createPaymentLinkMapToDomainModel, cVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvoke);
        }
        Result result = (Result) objInvoke;
        if (!(result instanceof Result.Success)) {
            if (result instanceof Result.Failure) {
                return new OpenPayResult.Failure(OpenPayErrorMapperKt.mapToLibraryModel(((Result.Failure) result).getError()));
            }
            throw new NoWhenBranchMatchedException();
        }
        Result.Success success = (Result.Success) result;
        if (success.getData() == null) {
            return new OpenPayResult.Failure(OpenPayError.InternalError.INSTANCE);
        }
        Object data = success.getData();
        Intrinsics.checkNotNull(data);
        return new OpenPayResult.Success(PaymentLinkMapperKt.mapToLibraryModel((PaymentLink) data));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.core.feature.PaymentLinkController
    @Nullable
    public Object expirePaymentLink(@NotNull String str, @NotNull Continuation<? super OpenPayResult<OpenPayPaymentLink>> continuation) {
        d dVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i10 = dVar.f25290c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f25290c = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, continuation);
            }
        } else {
            dVar = new d(this, continuation);
        }
        Object objInvoke = dVar.f25288a;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = dVar.f25290c;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            UpdatePaymentLinkStatusUseCase updatePaymentLinkStatusUseCase = this.f83528c;
            PaymentLinkStatus paymentLinkStatus = PaymentLinkStatus.EXPIRED;
            dVar.f25290c = 1;
            objInvoke = updatePaymentLinkStatusUseCase.invoke(str, paymentLinkStatus, dVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvoke);
        }
        Result result = (Result) objInvoke;
        if (!(result instanceof Result.Success)) {
            if (result instanceof Result.Failure) {
                return new OpenPayResult.Failure(OpenPayErrorMapperKt.mapToLibraryModel(((Result.Failure) result).getError()));
            }
            throw new NoWhenBranchMatchedException();
        }
        Result.Success success = (Result.Success) result;
        if (success.getData() == null) {
            return new OpenPayResult.Failure(OpenPayError.InternalError.INSTANCE);
        }
        Object data = success.getData();
        Intrinsics.checkNotNull(data);
        return new OpenPayResult.Success(PaymentLinkMapperKt.mapToLibraryModel((PaymentLink) data));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.core.feature.PaymentLinkController
    @Nullable
    public Object getAllPaymentLinks(@NotNull OpenPayPaymentLinkFilter openPayPaymentLinkFilter, @NotNull Continuation<? super OpenPayResult<? extends List<OpenPayPaymentLink>>> continuation) {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i10 = eVar.f25293c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f25293c = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, continuation);
            }
        } else {
            eVar = new e(this, continuation);
        }
        Object objInvoke = eVar.f25291a;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = eVar.f25293c;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            GetAllPaymentLinksUseCase getAllPaymentLinksUseCase = this.f83527b;
            PaymentLinkFilter paymentLinkFilterMapToLibraryModel = PaymentLinkFilterMapperKt.mapToLibraryModel(openPayPaymentLinkFilter);
            eVar.f25293c = 1;
            objInvoke = getAllPaymentLinksUseCase.invoke(paymentLinkFilterMapToLibraryModel, eVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvoke);
        }
        Result result = (Result) objInvoke;
        if (!(result instanceof Result.Success)) {
            if (result instanceof Result.Failure) {
                return new OpenPayResult.Failure(OpenPayErrorMapperKt.mapToLibraryModel(((Result.Failure) result).getError()));
            }
            throw new NoWhenBranchMatchedException();
        }
        Result.Success success = (Result.Success) result;
        if (success.getData() == null) {
            return new OpenPayResult.Failure(OpenPayError.InternalError.INSTANCE);
        }
        Object data = success.getData();
        Intrinsics.checkNotNull(data);
        return new OpenPayResult.Success(PaymentLinkMapperKt.mapToLibraryModel((List<PaymentLink>) data));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.core.feature.PaymentLinkController
    @Nullable
    public Object getPaymentPlans(double d2, @NotNull Continuation<? super OpenPayResult<? extends List<Integer>>> continuation) {
        f fVar;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i10 = fVar.f25296c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f25296c = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, continuation);
            }
        } else {
            fVar = new f(this, continuation);
        }
        Object objInvoke = fVar.f25294a;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = fVar.f25296c;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            GetPaymentPlansWithoutBinUseCase getPaymentPlansWithoutBinUseCase = this.f83532g;
            fVar.f25296c = 1;
            objInvoke = getPaymentPlansWithoutBinUseCase.invoke(d2, fVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvoke);
        }
        Result result = (Result) objInvoke;
        if (result instanceof Result.Success) {
            List list = (List) ((Result.Success) result).getData();
            return list != null ? new OpenPayResult.Success(list) : new OpenPayResult.Failure(OpenPayError.InternalError.INSTANCE);
        }
        if (result instanceof Result.Failure) {
            return new OpenPayResult.Failure(OpenPayErrorMapperKt.mapToLibraryModel(((Result.Failure) result).getError()));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.core.feature.PaymentLinkController
    @Nullable
    public Object refundPaymentLink(@NotNull String str, @NotNull Continuation<? super OpenPayResult<OpenPayTransaction>> continuation) {
        g gVar;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i10 = gVar.f25299c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f25299c = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, continuation);
            }
        } else {
            gVar = new g(this, continuation);
        }
        Object objInvoke = gVar.f25297a;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = gVar.f25299c;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            RefundPaymentLinkUseCase refundPaymentLinkUseCase = this.f83531f;
            gVar.f25299c = 1;
            objInvoke = refundPaymentLinkUseCase.invoke(str, gVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvoke);
        }
        Result result = (Result) objInvoke;
        if (!(result instanceof Result.Success)) {
            if (result instanceof Result.Failure) {
                return new OpenPayResult.Failure(OpenPayErrorMapperKt.mapToLibraryModel(((Result.Failure) result).getError()));
            }
            throw new NoWhenBranchMatchedException();
        }
        Result.Success success = (Result.Success) result;
        if (success.getData() == null) {
            return new OpenPayResult.Failure(OpenPayError.InternalError.INSTANCE);
        }
        Object data = success.getData();
        Intrinsics.checkNotNull(data);
        return new OpenPayResult.Success(TransactionMapperKt.mapToLibraryModel((Transaction) data));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.core.feature.PaymentLinkController
    @Nullable
    public Object updatePaymentLink(@NotNull OpenPayUpdatePaymentLink openPayUpdatePaymentLink, @NotNull Continuation<? super OpenPayResult<OpenPayPaymentLink>> continuation) {
        h hVar;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i10 = hVar.f25302c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f25302c = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, continuation);
            }
        } else {
            hVar = new h(this, continuation);
        }
        Object objInvoke = hVar.f25300a;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = hVar.f25302c;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            UpdatePaymentLinkUseCase updatePaymentLinkUseCase = this.f83529d;
            UpdatePaymentLink updatePaymentLinkMapToDomainModel = PaymentLinkMapperKt.mapToDomainModel(openPayUpdatePaymentLink);
            hVar.f25302c = 1;
            objInvoke = updatePaymentLinkUseCase.invoke(updatePaymentLinkMapToDomainModel, hVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvoke);
        }
        Result result = (Result) objInvoke;
        if (!(result instanceof Result.Success)) {
            if (result instanceof Result.Failure) {
                return new OpenPayResult.Failure(OpenPayErrorMapperKt.mapToLibraryModel(((Result.Failure) result).getError()));
            }
            throw new NoWhenBranchMatchedException();
        }
        Result.Success success = (Result.Success) result;
        if (success.getData() == null) {
            return new OpenPayResult.Failure(OpenPayError.InternalError.INSTANCE);
        }
        Object data = success.getData();
        Intrinsics.checkNotNull(data);
        return new OpenPayResult.Success(PaymentLinkMapperKt.mapToLibraryModel((PaymentLink) data));
    }
}
