package com.bbva.glomohybrid.qrscanner.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.glomohybrid.qrscanner.QRScannerComponent;
import com.bbva.glomohybrid.qrscanner.R;
import com.bbva.glomohybrid.qrscanner.databinding.CustomQrViewBinding;
import com.bbva.glomohybrid.qrscanner.view.CustomQRPaymentView;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w8.f;

/* JADX INFO: compiled from: CustomQRPaymentView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/view/CustomQRPaymentView;", "Landroid/widget/RelativeLayout;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class CustomQRPaymentView extends RelativeLayout implements CoroutineScope {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public static final MutableSharedFlow<ActionSpec<Object>> f34426q0 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f34427p0;

    /* JADX INFO: compiled from: CustomQRPaymentView.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/view/CustomQRPaymentView$Companion;", "", "()V", "clicks", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "getClicks", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MutableSharedFlow<ActionSpec<Object>> getClicks() {
            return CustomQRPaymentView.f34426q0;
        }
    }

    /* JADX INFO: compiled from: CustomQRPaymentView.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.qrscanner.view.CustomQRPaymentView$2$1", f = "CustomQRPaymentView.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f34428p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Context f34429q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f34429q0 = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f34429q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f34428p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow<ActionSpec<Object>> clicks = CustomQRPaymentView.INSTANCE.getClicks();
                ActionSpec<Object> action_tabbar_button_pressed = QRScannerComponent.INSTANCE.getACTION_TABBAR_BUTTON_PRESSED();
                this.f34428p0 = 1;
                if (clicks.emit(action_tabbar_button_pressed, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Context context = this.f34429q0;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null) {
                activity.finish();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomQRPaymentView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f34427p0.getCoroutineContext();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomQRPaymentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CustomQRPaymentView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomQRPaymentView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34427p0 = CoroutineScopeKt.MainScope();
        CustomQrViewBinding customQrViewBindingInflate = CustomQrViewBinding.inflate(LayoutInflater.from(context), this, false);
        Intrinsics.checkNotNullExpressionValue(customQrViewBindingInflate, "inflate(...)");
        addView(customQrViewBindingInflate.getRoot());
        customQrViewBindingInflate.toolbarStartButton.setOnClickListener(new f(context, 1));
        customQrViewBindingInflate.toolbarEndButton.setVisibility(8);
        customQrViewBindingInflate.toolbarTittle.setText(context.getText(R.string.qr_scanner_payment_title));
        customQrViewBindingInflate.qrMessage.setText(context.getText(R.string.qr_scanner_payment_message));
        customQrViewBindingInflate.qrTabButton.setOnClickListener(new View.OnClickListener() { // from class: da.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomQRPaymentView this$0 = this.f68143p0;
                CustomQRPaymentView.Companion companion = CustomQRPaymentView.INSTANCE;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Context context2 = context;
                Intrinsics.checkNotNullParameter(context2, "$context");
                BuildersKt__Builders_commonKt.launch$default(this$0, null, null, new CustomQRPaymentView.a(context2, null), 3, null);
            }
        });
    }
}
