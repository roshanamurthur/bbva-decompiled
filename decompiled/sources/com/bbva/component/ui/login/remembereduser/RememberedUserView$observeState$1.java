package com.bbva.component.ui.login.remembereduser;

import com.bbva.component.ui.login.model.RememberedUserState;
import com.bbva.component.ui.login.model.RememberedUserType;
import ek.a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RememberedUserView.kt */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.bbva.component.ui.login.remembereduser.RememberedUserView$observeState$1", f = "RememberedUserView.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
public final class RememberedUserView$observeState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f28601p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ RememberedUserView f28602q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberedUserView$observeState$1(RememberedUserView rememberedUserView, Continuation<? super RememberedUserView$observeState$1> continuation) {
        super(2, continuation);
        this.f28602q0 = rememberedUserView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new RememberedUserView$observeState$1(this.f28602q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RememberedUserView$observeState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i10 = this.f28601p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            final RememberedUserView rememberedUserView = this.f28602q0;
            Flow<RememberedUserState> onModel = rememberedUserView.getViewModel().getOnModel();
            FlowCollector<? super RememberedUserState> flowCollector = new FlowCollector() { // from class: com.bbva.component.ui.login.remembereduser.RememberedUserView$observeState$1.1

                /* JADX INFO: renamed from: com.bbva.component.ui.login.remembereduser.RememberedUserView$observeState$1$1$WhenMappings */
                /* JADX INFO: compiled from: RememberedUserView.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[RememberedUserType.values().length];
                        try {
                            iArr[RememberedUserType.CREDENTIALS.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[RememberedUserType.BIOMETRICS.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[RememberedUserType.ACCESSING_BIOMETRIC.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    RememberedUserState rememberedUserState = (RememberedUserState) obj2;
                    RememberedUserView rememberedUserView2 = rememberedUserView;
                    rememberedUserView2.getViewModel().initialize();
                    int i11 = WhenMappings.$EnumSwitchMapping$0[rememberedUserState.getRememberedUserType().ordinal()];
                    if (i11 == 1) {
                        rememberedUserView2.f(rememberedUserState);
                    } else if (i11 == 2) {
                        rememberedUserView2.e(rememberedUserState);
                    } else if (i11 == 3) {
                        RememberedUserView.access$displayAccessingWithBiometricState(rememberedUserView2, rememberedUserState);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.f28601p0 = 1;
            if (onModel.collect(flowCollector, this) == coroutine_suspended) {
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
