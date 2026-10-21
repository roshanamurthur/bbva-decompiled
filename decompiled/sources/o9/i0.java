package o9;

import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardModel;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingShortcutItemModel;
import com.bbva.glomohybrid.landing.domain.model.LandingAppAccess;
import com.bbva.glomohybrid.landing.domain.model.LandingUserSegment;
import com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel;
import com.bbva.glomohybrid.landing.presentation.viewmodel.handler.LandingAnalyticsHandler;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel$trackAnalyticForPageView$1", f = "LandingViewModel.kt", i = {}, l = {ResultCode.ERROR_CONN_SSL_KEY}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nLandingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingViewModel.kt\ncom/bbva/glomohybrid/landing/presentation/viewmodel/LandingViewModel$trackAnalyticForPageView$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,594:1\n800#2,11:595\n*S KotlinDebug\n*F\n+ 1 LandingViewModel.kt\ncom/bbva/glomohybrid/landing/presentation/viewmodel/LandingViewModel$trackAnalyticForPageView$1\n*L\n352#1:595,11\n*E\n"})
public final class i0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f85337p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f85338q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ LandingViewModel f85339r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(boolean z10, LandingViewModel landingViewModel, Continuation<? super i0> continuation) {
        super(2, continuation);
        this.f85338q0 = z10;
        this.f85339r0 = landingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new i0(this.f85338q0, this.f85339r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((i0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        List<LandingMessageCardModel> listEmptyList;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f85337p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.f85338q0) {
                LandingViewModel landingViewModel = this.f85339r0;
                List<LandingShortcutItemModel> shortcuts = landingViewModel.P0.getShortcuts();
                if (shortcuts == null) {
                    shortcuts = CollectionsKt__CollectionsKt.emptyList();
                }
                List<LandingShortcutItemModel> list = shortcuts;
                List list2 = landingViewModel.Q0;
                if (list2 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list2) {
                        if (obj2 instanceof LandingMessageCardModel) {
                            arrayList.add(obj2);
                        }
                    }
                    listEmptyList = arrayList;
                } else {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                }
                LandingAnalyticsHandler landingAnalyticsHandler = landingViewModel.f33130t0;
                UserProfileConfiguration userProfileConfigurationC = landingViewModel.c();
                LandingUserSegment segment = landingViewModel.P0.getSegment();
                LandingAppAccess landingAppAccess = landingViewModel.L0;
                this.f85337p0 = 1;
                if (landingAnalyticsHandler.trackPage(list, listEmptyList, userProfileConfigurationC, segment, landingAppAccess, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
