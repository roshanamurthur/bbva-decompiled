package com.bbva.gp2.android.product.mobilepayment.plugin.command;

import android.content.Context;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.gp2.android.product.mobilepayment.library.MobilePaymentLib;
import com.bbva.gp2.android.product.mobilepayment.library.MobilePaymentResult;
import com.bbva.gp2.android.product.mobilepayment.plugin.MobilePaymentLibInjector;
import com.bbva.gp2.android.product.mobilepayment.plugin.command.validator.DeleteDeviceRequestValidator;
import com.bbva.gp2.android.product.mobilepayment.plugin.request.DeleteDeviceRequest;
import com.bbva.gp2.android.product.mobilepayment.plugin.utils.Response;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DeleteDeviceCommand.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bbva/gp2/android/product/mobilepayment/plugin/command/DeleteDeviceCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/gp2/android/product/mobilepayment/plugin/request/DeleteDeviceRequest;", "<init>", "()V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "execute", "", "request", "commandCallback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "Companion", "payments-mobilepayment-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeleteDeviceCommand extends AbstractCommand<DeleteDeviceRequest> {

    @NotNull
    public static final String ID = "deletedevice";

    @NotNull
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: com.bbva.gp2.android.product.mobilepayment.plugin.command.DeleteDeviceCommand$execute$1, reason: invalid class name */
    /* JADX INFO: compiled from: DeleteDeviceCommand.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.bbva.gp2.android.product.mobilepayment.plugin.command.DeleteDeviceCommand$execute$1", f = "DeleteDeviceCommand.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CommandCallback $commandCallback;
        final /* synthetic */ DeleteDeviceRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DeleteDeviceRequest deleteDeviceRequest, CommandCallback commandCallback, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$request = deleteDeviceRequest;
            this.$commandCallback = commandCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeleteDeviceCommand.this.new AnonymousClass1(this.$request, this.$commandCallback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                MobilePaymentLibInjector mobilePaymentLibInjector = MobilePaymentLibInjector.INSTANCE;
                MobilePaymentLib mobilePayment = mobilePaymentLibInjector.getMobilePayment();
                Context applicationContext = ((AbstractCommand) DeleteDeviceCommand.this).mApplication.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                mobilePayment.setContext(applicationContext);
                MobilePaymentLib mobilePayment2 = mobilePaymentLibInjector.getMobilePayment();
                String pkcs7 = this.$request.getPkcs7();
                this.label = 1;
                obj = mobilePayment2.deleteDevice(pkcs7, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            MobilePaymentResult mobilePaymentResult = (MobilePaymentResult) obj;
            if (mobilePaymentResult instanceof MobilePaymentResult.Result) {
                this.$commandCallback.sendEvent(((AbstractCommand) DeleteDeviceCommand.this).mGson.toJson(Response.Companion.ok$default(Response.INSTANCE, null, 1, null)));
            } else {
                if (!(mobilePaymentResult instanceof MobilePaymentResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.$commandCallback.sendError(((AbstractCommand) DeleteDeviceCommand.this).mGson.toJson(Response.INSTANCE.error(((MobilePaymentResult.Error) mobilePaymentResult).getError().name())));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public DeleteDeviceCommand() {
        super(DeleteDeviceRequest.class, DeleteDeviceRequestValidator.INSTANCE);
        this.scope = CoroutineScopeKt.MainScope();
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull DeleteDeviceRequest request, @NotNull CommandCallback commandCallback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(commandCallback, "commandCallback");
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AnonymousClass1(request, commandCallback, null), 3, null);
    }
}
