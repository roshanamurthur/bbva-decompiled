package com.bbva.glomohybrid.login.data.repository;

import android.content.SharedPreferences;
import com.bbva.glomo.user.repository.datasource.UserDataStore;
import com.bbva.plugin.localstorage.command.ClearCommand;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LegacyDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0013\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/login/data/repository/LegacyDataSource;", "Lcom/bbva/glomo/user/repository/datasource/UserDataStore;", "", "getLegacySerialNumber", "", ClearCommand.ID, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Landroid/content/SharedPreferences;)V", "Companion", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class LegacyDataSource implements UserDataStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SharedPreferences f33359a;

    /* JADX INFO: compiled from: LegacyDataSource.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.data.repository.LegacyDataSource", f = "LegacyDataSource.kt", i = {0}, l = {21}, m = ClearCommand.ID, n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public LegacyDataSource f33360p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f33361q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f33363s0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33361q0 = obj;
            this.f33363s0 |= Integer.MIN_VALUE;
            return LegacyDataSource.this.clear(this);
        }
    }

    public LegacyDataSource(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.f33359a = sharedPreferences;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.glomo.user.repository.datasource.UserDataStore
    @Nullable
    public Object clear(@NotNull Continuation<? super Unit> continuation) {
        a aVar;
        LegacyDataSource legacyDataSource;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f33363s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f33363s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f33361q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f33363s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            aVar.f33360p0 = this;
            aVar.f33363s0 = 1;
            if (UserDataStore.DefaultImpls.clear(this, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            legacyDataSource = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            legacyDataSource = aVar.f33360p0;
            ResultKt.throwOnFailure(obj);
        }
        legacyDataSource.f33359a.edit().remove("pref_serial_software_token").apply();
        return Unit.INSTANCE;
    }

    @Nullable
    public final String getLegacySerialNumber() {
        return this.f33359a.getString("pref_serial_software_token", "");
    }
}
