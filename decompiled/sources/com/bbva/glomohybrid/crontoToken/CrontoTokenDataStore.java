package com.bbva.glomohybrid.crontoToken;

import android.content.Context;
import androidx.camera.core.processing.f;
import com.bbva.glomo.user.repository.datasource.UserDataStore;
import com.bbva.glomohybrid.logs.LoggerKt;
import com.bbva.library.digipassmanager.callbacks.OnDeleteTokenCronto;
import com.bbva.library.digipassmanager.helpers.DigipassManagerHelper;
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

/* JADX INFO: compiled from: CrontoTokenDataStore.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/crontoToken/CrontoTokenDataStore;", "Lcom/bbva/glomo/user/repository/datasource/UserDataStore;", "", ClearCommand.ID, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "Lcom/bbva/library/digipassmanager/helpers/DigipassManagerHelper;", "digipassManagerHelper", "<init>", "(Landroid/content/Context;Lcom/bbva/library/digipassmanager/helpers/DigipassManagerHelper;)V", "Companion", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class CrontoTokenDataStore implements UserDataStore {

    @NotNull
    public static final String LOG_TAG = "cronto-token-delete";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f32030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DigipassManagerHelper f32031b;

    /* JADX INFO: compiled from: CrontoTokenDataStore.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.crontoToken.CrontoTokenDataStore", f = "CrontoTokenDataStore.kt", i = {0}, l = {20}, m = ClearCommand.ID, n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public CrontoTokenDataStore f32032p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f32033q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f32035s0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32033q0 = obj;
            this.f32035s0 |= Integer.MIN_VALUE;
            return CrontoTokenDataStore.this.clear(this);
        }
    }

    public CrontoTokenDataStore(@NotNull Context context, @NotNull DigipassManagerHelper digipassManagerHelper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(digipassManagerHelper, "digipassManagerHelper");
        this.f32030a = context;
        this.f32031b = digipassManagerHelper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.glomo.user.repository.datasource.UserDataStore
    @Nullable
    public Object clear(@NotNull Continuation<? super Unit> continuation) {
        a aVar;
        CrontoTokenDataStore crontoTokenDataStore;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f32035s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f32035s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f32033q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f32035s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            aVar.f32032p0 = this;
            aVar.f32035s0 = 1;
            if (UserDataStore.DefaultImpls.clear(this, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            crontoTokenDataStore = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            crontoTokenDataStore = aVar.f32032p0;
            ResultKt.throwOnFailure(obj);
        }
        try {
            crontoTokenDataStore.f32031b.deleteToken(crontoTokenDataStore.f32030a, new OnDeleteTokenCronto() { // from class: com.bbva.glomohybrid.crontoToken.CrontoTokenDataStore.clear.2
                @Override // com.bbva.library.digipassmanager.callbacks.OnDeleteTokenCronto
                public void onComplete(boolean success) {
                    if (success) {
                        LoggerKt.logVerbose$default("TAG[cronto-token-delete] Token deletion successful", null, 2, null);
                    } else {
                        LoggerKt.logError$default("TAG[cronto-token-delete] Token deletion failed", null, null, 6, null);
                    }
                }
            });
        } catch (Exception e5) {
            LoggerKt.logError$default(f.d("TAG[cronto-token-delete] Exception during token deletion: ", e5.getMessage()), null, null, 6, null);
        }
        return Unit.INSTANCE;
    }
}
