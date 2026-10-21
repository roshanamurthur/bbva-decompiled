package com.bbva.glomohybrid.login.data.repository;

import com.bbva.glomo.securesharing.SecSdkDataSource;
import com.bbva.glomo.securesharing.SecureSharingConstantsKt;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.user.repository.datasource.UserDataStore;
import com.bbva.plugin.localstorage.command.ClearCommand;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CountrySecSdkDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0011\u0010\u0006\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/login/data/repository/CountrySecSdkDataSource;", "Lcom/bbva/glomo/securesharing/SecSdkDataSource;", "Lcom/bbva/glomo/user/repository/datasource/UserDataStore;", "storage", "Lcom/bbva/glomo/storage/MainStorage;", "(Lcom/bbva/glomo/storage/MainStorage;)V", ClearCommand.ID, "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "countryKeys", "", "", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CountrySecSdkDataSource extends SecSdkDataSource implements UserDataStore {

    /* JADX INFO: compiled from: CountrySecSdkDataSource.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.data.repository.CountrySecSdkDataSource", f = "CountrySecSdkDataSource.kt", i = {0}, l = {19}, m = ClearCommand.ID, n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public CountrySecSdkDataSource f33355p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f33356q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f33358s0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33356q0 = obj;
            this.f33358s0 |= Integer.MIN_VALUE;
            return CountrySecSdkDataSource.this.clear(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountrySecSdkDataSource(@NotNull MainStorage storage) {
        super(storage);
        Intrinsics.checkNotNullParameter(storage, "storage");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.glomo.user.repository.datasource.UserDataStore
    @Nullable
    public Object clear(@NotNull Continuation<? super Unit> continuation) {
        a aVar;
        CountrySecSdkDataSource countrySecSdkDataSource;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f33358s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f33358s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f33356q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f33358s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            aVar.f33355p0 = this;
            aVar.f33358s0 = 1;
            if (UserDataStore.DefaultImpls.clear(this, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            countrySecSdkDataSource = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            countrySecSdkDataSource = aVar.f33355p0;
            ResultKt.throwOnFailure(obj);
        }
        countrySecSdkDataSource.deleteCountryKeys();
        return Unit.INSTANCE;
    }

    @Override // com.bbva.glomo.securesharing.SecSdkDataSource
    @NotNull
    public List<String> countryKeys() {
        return CollectionsKt___CollectionsKt.plus((Collection<? extends String>) super.countryKeys(), SecureSharingConstantsKt.MX_SOFT_TOKEN_SERIAL);
    }
}
