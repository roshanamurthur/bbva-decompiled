package com.bbva.glomohybrid.qrscanner;

import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.glomohybrid.qrscanner.view.CustomQRPaymentView;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: QRScannerActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.qrscanner.QRScannerActivity$manageActions$1", f = "QRScannerActivity.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f34390p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ QRScannerActivity f34391q0;

    /* JADX INFO: renamed from: com.bbva.glomohybrid.qrscanner.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: QRScannerActivity.kt */
    public static final class C0147a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ QRScannerActivity f34392p0;

        public C0147a(QRScannerActivity qRScannerActivity) {
            this.f34392p0 = qRScannerActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            ActionSpec actionSpec = (ActionSpec) obj;
            String id = actionSpec.getId();
            QRScannerComponent.Companion companion = QRScannerComponent.INSTANCE;
            boolean zEquals = id.equals(companion.getACTION_TABBAR_BUTTON_PRESSED().getId());
            QRScannerActivity qRScannerActivity = this.f34392p0;
            if (zEquals) {
                QRScannerActivity.f(qRScannerActivity, companion.getACTION_TABBAR_BUTTON_PRESSED());
            } else if (actionSpec.getId().equals(companion.getACTION_OPEN_QR_INFO().getId())) {
                QRScannerActivity.f(qRScannerActivity, companion.getACTION_OPEN_QR_INFO());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(QRScannerActivity qRScannerActivity, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f34391q0 = qRScannerActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f34391q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f34390p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow<ActionSpec<Object>> clicks = CustomQRPaymentView.INSTANCE.getClicks();
            C0147a c0147a = new C0147a(this.f34391q0);
            this.f34390p0 = 1;
            if (clicks.collect(c0147a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
