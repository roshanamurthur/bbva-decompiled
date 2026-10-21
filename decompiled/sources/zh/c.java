package zh;

import com.mastercard.sonic.analytics.mixpanel.MixPanelFileHandling;
import com.mastercard.sonic.observers.ThreadStatus;
import com.mastercard.sonic.utils.FileDirUtils;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MixPanelFileHandling.kt */
/* JADX INFO: loaded from: classes10.dex */
@DebugMetadata(c = "com.mastercard.sonic.analytics.mixpanel.MixPanelFileHandling$threadForAddMixPanelDataToFile$2", f = "MixPanelFileHandling.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ MixPanelFileHandling f95071p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(MixPanelFileHandling mixPanelFileHandling, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f95071p0 = mixPanelFileHandling;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new c(this.f95071p0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ThreadStatus threadStatus = ThreadStatus.OPERATION_IN_PROGRESS;
        MixPanelFileHandling mixPanelFileHandling = this.f95071p0;
        mixPanelFileHandling.c(true, threadStatus);
        MixPanelFileHandling.access$writeToFile(mixPanelFileHandling, FileDirUtils.INSTANCE.getMixPanelRequestFilePath(mixPanelFileHandling.f51037a), MixPanelFileHandling.access$convertMixPanelListToJsonString(mixPanelFileHandling, CollectionsKt___CollectionsKt.toList(mixPanelFileHandling.getMixPanelMap().values())));
        mixPanelFileHandling.c(false, ThreadStatus.INITIALIZED);
        return Unit.INSTANCE;
    }
}
