package kotlinx.coroutines.internal;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0006\u001a\u001a\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0007\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0003H\u0007\u001a \u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\u001a\b\u0010\u000e\u001a\u00020\rH\u0000\"\u001a\u0010\u000f\u001a\u00020\u00058\u0002X\u0082D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/internal/MainDispatcherFactory;", "", "factories", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "tryCreateDispatcher", "", "isMissing", "", "cause", "", "errorHint", "Lkotlinx/coroutines/internal/MissingMainCoroutineDispatcher;", "createMissingDispatcher", "", "throwMissingMainDispatcherException", "SUPPORT_MISSING", "Z", "getSUPPORT_MISSING$annotations", "()V", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatchersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
public final class MainDispatchersKt {
    private static final boolean SUPPORT_MISSING = false;

    private static final MissingMainCoroutineDispatcher createMissingDispatcher(Throwable th2, String str) throws Throwable {
        if (SUPPORT_MISSING) {
            return new MissingMainCoroutineDispatcher(th2, str);
        }
        if (th2 != null) {
            throw th2;
        }
        throwMissingMainDispatcherException();
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ MissingMainCoroutineDispatcher createMissingDispatcher$default(Throwable th2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return createMissingDispatcher(th2, str);
    }

    @InternalCoroutinesApi
    public static final boolean isMissing(@NotNull MainCoroutineDispatcher mainCoroutineDispatcher) {
        return mainCoroutineDispatcher.getImmediate() instanceof MissingMainCoroutineDispatcher;
    }

    @NotNull
    public static final Void throwMissingMainDispatcherException() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    @InternalCoroutinesApi
    @NotNull
    public static final MainCoroutineDispatcher tryCreateDispatcher(@NotNull MainDispatcherFactory mainDispatcherFactory, @NotNull List<? extends MainDispatcherFactory> list) {
        try {
            return mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th2) {
            return createMissingDispatcher(th2, mainDispatcherFactory.hintOnError());
        }
    }
}
