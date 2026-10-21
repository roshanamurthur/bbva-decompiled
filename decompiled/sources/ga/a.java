package ga;

import com.bbva.glomohybrid.base.deeplink.model.LinkParams;
import com.bbva.glomohybrid.base.deeplink.usecase.DynamicLinkUseCase;
import com.bbva.glomohybrid.base.deeplink.usecase.result.Deeplink;
import com.bbva.glomohybrid.base.deeplink.usecase.result.DynamicLinkResult;
import com.bbva.glomohybrid.base.deeplink.usecase.result.QRCard;
import com.bbva.glomohybrid.splash.presentation.viewmodel.SplashGlobalViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SplashGlobalViewModel.kt */
/* JADX INFO: loaded from: classes7.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.splash.presentation.viewmodel.SplashGlobalViewModel$handleDynamicLink$1", f = "SplashGlobalViewModel.kt", i = {}, l = {338}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nSplashGlobalViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplashGlobalViewModel.kt\ncom/bbva/glomohybrid/splash/presentation/viewmodel/SplashGlobalViewModel$handleDynamicLink$1\n+ 2 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n+ 3 Koin.kt\norg/koin/core/Koin\n+ 4 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,379:1\n42#2,4:380\n120#3:384\n158#4:385\n*S KotlinDebug\n*F\n+ 1 SplashGlobalViewModel.kt\ncom/bbva/glomohybrid/splash/presentation/viewmodel/SplashGlobalViewModel$handleDynamicLink$1\n*L\n338#1:380,4\n338#1:384\n338#1:385\n*E\n"})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f68591p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ SplashGlobalViewModel f68592q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ LinkParams.DynamicLink f68593r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SplashGlobalViewModel splashGlobalViewModel, LinkParams.DynamicLink dynamicLink, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f68592q0 = splashGlobalViewModel;
        this.f68593r0 = dynamicLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f68592q0, this.f68593r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        DynamicLinkResult dynamicLinkResult;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f68591p0;
        SplashGlobalViewModel splashGlobalViewModel = this.f68592q0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            DynamicLinkUseCase dynamicLinkUseCase = (DynamicLinkUseCase) splashGlobalViewModel.getProvider().getKoin().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(DynamicLinkUseCase.class), null, null);
            if (dynamicLinkUseCase != null) {
                this.f68591p0 = 1;
                obj = dynamicLinkUseCase.execute(this.f68593r0, (Continuation<? super DynamicLinkResult>) this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                dynamicLinkResult = null;
            }
            if (dynamicLinkResult instanceof Deeplink) {
                SplashGlobalViewModel.access$notifyDynamicLink(splashGlobalViewModel, (Deeplink) dynamicLinkResult);
            } else if (dynamicLinkResult instanceof QRCard) {
                SplashGlobalViewModel.access$notifyQRLink(splashGlobalViewModel, (QRCard) dynamicLinkResult);
            } else {
                SplashGlobalViewModel.markAsPerformed$default(splashGlobalViewModel, SplashGlobalViewModel.ACTION_DEEPLINK_NOT_READ, null, 2, null);
            }
            return Unit.INSTANCE;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        dynamicLinkResult = (DynamicLinkResult) obj;
        if (dynamicLinkResult instanceof Deeplink) {
            SplashGlobalViewModel.access$notifyDynamicLink(splashGlobalViewModel, (Deeplink) dynamicLinkResult);
        } else if (dynamicLinkResult instanceof QRCard) {
            SplashGlobalViewModel.access$notifyQRLink(splashGlobalViewModel, (QRCard) dynamicLinkResult);
        } else {
            SplashGlobalViewModel.markAsPerformed$default(splashGlobalViewModel, SplashGlobalViewModel.ACTION_DEEPLINK_NOT_READ, null, 2, null);
        }
        return Unit.INSTANCE;
    }
}
