package androidx.compose.runtime;

import androidx.exifinterface.media.ExifInterface;
import bk.g;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001aT\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002<\u0010\n\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0001¢\u0006\u0002\b\tH\u0086@¢\u0006\u0004\b\u000b\u0010\f\u001aA\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u0016\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u000f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"R", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/runtime/Recomposer;", "Lkotlin/ParameterName;", "name", "recomposer", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "withRunningRecomposer", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "", "key", "value", "", "addMultiValue", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z", "removeLastMultiValue", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "runtime_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/RecomposerKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1646:1\n361#2,7:1647\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/RecomposerKt\n*L\n1637#1:1647,7\n*E\n"})
public final class RecomposerKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Object f14727a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Object f14728b = new Object();

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: Recomposer.kt */
    @DebugMetadata(c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2", f = "Recomposer.kt", i = {0}, l = {76, 78}, m = "invokeSuspend", n = {"recomposer"}, s = {"L$0"})
    public static final class a<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f14729p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f14730q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function3<CoroutineScope, Recomposer, Continuation<? super R>, Object> f14731r0;

        /* JADX INFO: renamed from: androidx.compose.runtime.RecomposerKt$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Recomposer.kt */
        @DebugMetadata(c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1", f = "Recomposer.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0056a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f14732p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Recomposer f14733q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0056a(Recomposer recomposer, Continuation<? super C0056a> continuation) {
                super(2, continuation);
                this.f14733q0 = recomposer;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0056a(this.f14733q0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0056a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f14732p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f14732p0 = 1;
                    if (this.f14733q0.runRecomposeAndApplyChanges(this) == coroutine_suspended) {
                        return coroutine_suspended;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function3<? super CoroutineScope, ? super Recomposer, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f14731r0 = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f14731r0, continuation);
            aVar.f14730q0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Object obj) {
            return ((a) create(coroutineScope, (Continuation) obj)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Recomposer recomposer;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f14729p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f14730q0;
                recomposer = new Recomposer(coroutineScope.getCoroutineContext());
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C0056a(recomposer, null), 3, null);
                this.f14730q0 = recomposer;
                this.f14729p0 = 1;
                obj = this.f14731r0.invoke(coroutineScope, recomposer, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = this.f14730q0;
                    ResultKt.throwOnFailure(obj);
                    return obj2;
                }
                recomposer = (Recomposer) this.f14730q0;
                ResultKt.throwOnFailure(obj);
            }
            recomposer.close();
            this.f14730q0 = obj;
            this.f14729p0 = 2;
            return recomposer.join(this) == coroutine_suspended ? coroutine_suspended : obj;
        }
    }

    public static final <K, V> boolean addMultiValue(@NotNull Map<K, List<V>> map, K k10, V v3) {
        List<V> listC = map.get(k10);
        if (listC == null) {
            listC = androidx.fragment.app.a.c(map, k10);
        }
        return listC.add(v3);
    }

    @Nullable
    public static final <K, V> V removeLastMultiValue(@NotNull Map<K, List<V>> map, K k10) {
        List<V> list = map.get(k10);
        if (list == null) {
            return null;
        }
        V v3 = (V) g.removeFirst(list);
        if (!list.isEmpty()) {
            return v3;
        }
        map.remove(k10);
        return v3;
    }

    @Nullable
    public static final <R> Object withRunningRecomposer(@NotNull Function3<? super CoroutineScope, ? super Recomposer, ? super Continuation<? super R>, ? extends Object> function3, @NotNull Continuation<? super R> continuation) {
        return CoroutineScopeKt.coroutineScope(new a(function3, null), continuation);
    }
}
