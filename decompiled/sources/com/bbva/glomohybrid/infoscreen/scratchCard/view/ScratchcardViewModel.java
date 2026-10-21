package com.bbva.glomohybrid.infoscreen.scratchCard.view;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bbva.glomohybrid.base.activityConfigurators.ScratchcardConfiguration;
import com.bbva.glomohybrid.infoscreen.scratchCard.models.ScratchcardEvents;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ScratchcardViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/scratchCard/view/ScratchcardViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/bbva/glomohybrid/infoscreen/scratchCard/models/ScratchcardEvents;", "result", "", "onTapped", "Lcom/bbva/glomohybrid/base/activityConfigurators/ScratchcardConfiguration;", "configuration", "Lcom/bbva/glomohybrid/base/activityConfigurators/ScratchcardConfiguration;", "getConfiguration", "()Lcom/bbva/glomohybrid/base/activityConfigurators/ScratchcardConfiguration;", "setConfiguration", "(Lcom/bbva/glomohybrid/base/activityConfigurators/ScratchcardConfiguration;)V", "", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getTouchCount", "()I", "setTouchCount", "(I)V", "touchCount", "", "r0", "Z", "isScratchcardRevealed", "()Z", "setScratchcardRevealed", "(Z)V", "Lkotlinx/coroutines/flow/Flow;", "getOnTapEvents", "()Lkotlinx/coroutines/flow/Flow;", "onTapEvents", "<init>", "()V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class ScratchcardViewModel extends ViewModel {
    public ScratchcardConfiguration configuration;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<ScratchcardEvents> f32485p0 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public int touchCount;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public boolean isScratchcardRevealed;

    /* JADX INFO: compiled from: ScratchcardViewModel.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.infoscreen.scratchCard.view.ScratchcardViewModel$onTapped$1", f = "ScratchcardViewModel.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f32488p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ ScratchcardEvents f32490r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ScratchcardEvents scratchcardEvents, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f32490r0 = scratchcardEvents;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScratchcardViewModel.this.new a(this.f32490r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f32488p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = ScratchcardViewModel.this.f32485p0;
                this.f32488p0 = 1;
                if (mutableSharedFlow.emit(this.f32490r0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final ScratchcardConfiguration getConfiguration() {
        ScratchcardConfiguration scratchcardConfiguration = this.configuration;
        if (scratchcardConfiguration != null) {
            return scratchcardConfiguration;
        }
        Intrinsics.throwUninitializedPropertyAccessException("configuration");
        return null;
    }

    @NotNull
    public final Flow<ScratchcardEvents> getOnTapEvents() {
        return this.f32485p0;
    }

    public final int getTouchCount() {
        return this.touchCount;
    }

    /* JADX INFO: renamed from: isScratchcardRevealed, reason: from getter */
    public final boolean getIsScratchcardRevealed() {
        return this.isScratchcardRevealed;
    }

    public final void onTapped(@NotNull ScratchcardEvents result) {
        Intrinsics.checkNotNullParameter(result, "result");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new a(result, null), 3, null);
    }

    public final void setConfiguration(@NotNull ScratchcardConfiguration scratchcardConfiguration) {
        Intrinsics.checkNotNullParameter(scratchcardConfiguration, "<set-?>");
        this.configuration = scratchcardConfiguration;
    }

    public final void setScratchcardRevealed(boolean z10) {
        this.isScratchcardRevealed = z10;
    }

    public final void setTouchCount(int i10) {
        this.touchCount = i10;
    }
}
