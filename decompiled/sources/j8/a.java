package j8;

import com.bbva.cells.componentkit.model.FetchResult;
import com.bbva.component.dm.singlesignon.SingleSignOnDataManager;
import com.bbva.component.dm.singlesignon.data.model.SingleSignOnResponse;
import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import com.bbva.glomohybrid.cellsweb.presentation.usecase.CountryConfigureWebPrivateProfileUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CountryConfigureWebPrivateProfileUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.cellsweb.presentation.usecase.CountryConfigureWebPrivateProfileUseCase$doSso$2", f = "CountryConfigureWebPrivateProfileUseCase.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super FetchResult<SingleSignOnResponse>>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f78804p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CountryConfigureWebPrivateProfileUseCase f78805q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CountryConfigureWebPrivateProfileUseCase countryConfigureWebPrivateProfileUseCase, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f78805q0 = countryConfigureWebPrivateProfileUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f78805q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super FetchResult<SingleSignOnResponse>> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f78804p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            SingleSignOnDataManager singleSignOnDataManagerAccess$getSsoDataManager = CountryConfigureWebPrivateProfileUseCase.access$getSsoDataManager(this.f78805q0);
            this.f78804p0 = 1;
            obj = singleSignOnDataManagerAccess$getSsoDataManager.get(ConfigConstantsKt.DEFAULT_GEMA_CONSUMER_ID, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
