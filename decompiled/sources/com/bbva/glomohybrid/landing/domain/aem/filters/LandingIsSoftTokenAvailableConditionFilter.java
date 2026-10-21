package com.bbva.glomohybrid.landing.domain.aem.filters;

import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel;
import com.bbva.glomoutils.usecase.SuspendUseCase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingSoftTokenConditionFilter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/aem/filters/LandingIsSoftTokenAvailableConditionFilter;", "Lcom/bbva/glomohybrid/landing/domain/aem/filters/BaseLandingConditionFilter;", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingAEMModel;", "aemItemModel", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "user", "", "meetCondition", "(Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingAEMModel;Lcom/bbva/glomo/user/domain/model/RememberedUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "Lcom/bbva/glomoutils/usecase/SuspendUseCase;", "softToken", "<init>", "(Lcom/bbva/glomoutils/usecase/SuspendUseCase;)V", "Companion", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingSoftTokenConditionFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingSoftTokenConditionFilter.kt\ncom/bbva/glomohybrid/landing/domain/aem/filters/LandingIsSoftTokenAvailableConditionFilter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
public final class LandingIsSoftTokenAvailableConditionFilter extends BaseLandingConditionFilter {

    @NotNull
    public static final String ID = "isSoftTokenAvailable";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final SuspendUseCase<Boolean> f32598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id = ID;

    /* JADX INFO: compiled from: LandingSoftTokenConditionFilter.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.aem.filters.LandingIsSoftTokenAvailableConditionFilter", f = "LandingSoftTokenConditionFilter.kt", i = {}, l = {22}, m = "meetCondition", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f32600p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f32602r0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32600p0 = obj;
            this.f32602r0 |= Integer.MIN_VALUE;
            return LandingIsSoftTokenAvailableConditionFilter.this.meetCondition(null, null, this);
        }
    }

    public LandingIsSoftTokenAvailableConditionFilter(@Nullable SuspendUseCase<Boolean> suspendUseCase) {
        this.f32598a = suspendUseCase;
    }

    @Override // com.bbva.glomohybrid.landing.domain.aem.filters.LandingAEMConditionFilter
    @NotNull
    public String getId() {
        return this.id;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.glomohybrid.landing.domain.aem.filters.LandingAEMConditionFilter
    @Nullable
    public Object meetCondition(@NotNull LandingAEMModel landingAEMModel, @Nullable RememberedUser rememberedUser, @NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f32602r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f32602r0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objExecute = aVar.f32600p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f32602r0;
        boolean z10 = true;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objExecute);
            if (checkConditions(landingAEMModel) != null) {
                SuspendUseCase<Boolean> suspendUseCase = this.f32598a;
                if (suspendUseCase != null) {
                    aVar.f32602r0 = 1;
                    objExecute = suspendUseCase.execute(aVar);
                    if (objExecute == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    z10 = false;
                }
            }
            return Boxing.boxBoolean(z10);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objExecute);
        if (!((Boolean) objExecute).booleanValue()) {
            z10 = false;
        }
        return Boxing.boxBoolean(z10);
    }
}
