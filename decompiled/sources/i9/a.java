package i9;

import com.bbva.component.dm.settings.domain.model.LandingSectionConfiguration;
import com.bbva.glomohybrid.landing.domain.sections.LandingSectionsFetcher;
import com.bbva.glomohybrid.landing.domain.sections.model.LandingECommerceCardsModel;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingSectionsFetcher.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.sections.LandingSectionsFetcher$getECommerceCardsDataAsync$2", f = "LandingSectionsFetcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Deferred<? extends LandingECommerceCardsModel>>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public /* synthetic */ Object f69526p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ List<LandingSectionConfiguration> f69527q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ LandingSectionsFetcher f69528r0;

    /* JADX INFO: renamed from: i9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LandingSectionsFetcher.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.sections.LandingSectionsFetcher$getECommerceCardsDataAsync$2$1", f = "LandingSectionsFetcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nLandingSectionsFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingSectionsFetcher.kt\ncom/bbva/glomohybrid/landing/domain/sections/LandingSectionsFetcher$getECommerceCardsDataAsync$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1#2:70\n*E\n"})
    public static final class C0294a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LandingECommerceCardsModel>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ List<LandingSectionConfiguration> f69529p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LandingSectionsFetcher f69530q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0294a(LandingSectionsFetcher landingSectionsFetcher, List list, Continuation continuation) {
            super(2, continuation);
            this.f69529p0 = list;
            this.f69530q0 = landingSectionsFetcher;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C0294a(this.f69530q0, this.f69529p0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LandingECommerceCardsModel> continuation) {
            return ((C0294a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            for (Object obj2 : this.f69529p0) {
                if (Intrinsics.areEqual(((LandingSectionConfiguration) obj2).getType(), LandingECommerceCardsModel.SECTION_TYPE)) {
                    return this.f69530q0.f32710a.get((LandingSectionConfiguration) obj2);
                }
            }
            obj2 = null;
            return this.f69530q0.f32710a.get((LandingSectionConfiguration) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LandingSectionsFetcher landingSectionsFetcher, List list, Continuation continuation) {
        super(2, continuation);
        this.f69527q0 = list;
        this.f69528r0 = landingSectionsFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        a aVar = new a(this.f69528r0, this.f69527q0, continuation);
        aVar.f69526p0 = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Deferred<? extends LandingECommerceCardsModel>> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.f69526p0, null, null, new C0294a(this.f69528r0, this.f69527q0, null), 3, null);
    }
}
