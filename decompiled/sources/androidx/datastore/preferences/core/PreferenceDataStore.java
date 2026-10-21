package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PreferenceDataStoreFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012JF\u0010\n\u001a\u00020\u000221\u0010\t\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/datastore/preferences/core/PreferenceDataStore;", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "t", "Lkotlin/coroutines/Continuation;", "", "transform", "updateData", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "getData", "()Lkotlinx/coroutines/flow/Flow;", "data", "delegate", "<init>", "(Landroidx/datastore/core/DataStore;)V", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1})
public final class PreferenceDataStore implements DataStore<Preferences> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DataStore<Preferences> f20776a;

    /* JADX INFO: compiled from: PreferenceDataStoreFactory.kt */
    @DebugMetadata(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<Preferences, Continuation<? super Preferences>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f20777p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f20778q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Preferences, Continuation<? super Preferences>, Object> f20779r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super Preferences, ? super Continuation<? super Preferences>, ? extends Object> function2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f20779r0 = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f20779r0, continuation);
            aVar.f20778q0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Preferences preferences, Continuation<? super Preferences> continuation) {
            return ((a) create(preferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f20777p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Preferences preferences = (Preferences) this.f20778q0;
                this.f20777p0 = 1;
                obj = this.f20779r0.invoke(preferences, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Preferences preferences2 = (Preferences) obj;
            ((MutablePreferences) preferences2).freeze$datastore_preferences_core();
            return preferences2;
        }
    }

    public PreferenceDataStore(@NotNull DataStore<Preferences> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f20776a = delegate;
    }

    @Override // androidx.datastore.core.DataStore
    @NotNull
    public Flow<Preferences> getData() {
        return this.f20776a.getData();
    }

    @Override // androidx.datastore.core.DataStore
    @Nullable
    public Object updateData(@NotNull Function2<? super Preferences, ? super Continuation<? super Preferences>, ? extends Object> function2, @NotNull Continuation<? super Preferences> continuation) {
        return this.f20776a.updateData(new a(function2, null), continuation);
    }
}
