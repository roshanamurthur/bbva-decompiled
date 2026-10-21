package com.bbva.glomohybrid.infoscreen.optionlist;

import com.bbva.component.dm.settings.domain.model.AppSettingsResult;
import com.bbva.component.dm.settings.domain.model.Contact;
import com.bbva.component.dm.settings.domain.usecase.FetchSettingsUseCase;
import com.bbva.component.dm.settings.repository.SettingsPolicy;
import com.bbva.glomoutils.Either;
import com.bbva.glomoutils.EitherKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OptionListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.infoscreen.optionlist.OptionListViewModel$openDialer$1", f = "OptionListViewModel.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nOptionListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OptionListViewModel.kt\ncom/bbva/glomohybrid/infoscreen/optionlist/OptionListViewModel$openDialer$1\n+ 2 Either.kt\ncom/bbva/glomoutils/EitherKt\n*L\n1#1,95:1\n46#2,3:96\n*S KotlinDebug\n*F\n+ 1 OptionListViewModel.kt\ncom/bbva/glomohybrid/infoscreen/optionlist/OptionListViewModel$openDialer$1\n*L\n49#1:96,3\n*E\n"})
public final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f32425p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ OptionListViewModel f32426q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(OptionListViewModel optionListViewModel, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f32426q0 = optionListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new c(this.f32426q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f32425p0;
        OptionListViewModel optionListViewModel = this.f32426q0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            FetchSettingsUseCase fetchSettingsUseCaseAccess$getFetchSettingsUseCase = OptionListViewModel.access$getFetchSettingsUseCase(optionListViewModel);
            SettingsPolicy settingsPolicy = SettingsPolicy.Local;
            this.f32425p0 = 1;
            obj = fetchSettingsUseCaseAccess$getFetchSettingsUseCase.execute(settingsPolicy, (Continuation<? super Either<? extends Throwable, ? extends AppSettingsResult>>) this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Either either = (Either) obj;
        if (either instanceof Either.Right) {
            Contact contact = ((AppSettingsResult) ((Either.Right) either).getValue()).getData().getContact();
            optionListViewModel.f32394u0.setValue(new OptionListContract.Event.OpenDialer(String.valueOf(contact != null ? contact.getPhone() : null)));
            EitherKt.right(Unit.INSTANCE);
        } else if (!(either instanceof Either.Left)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
