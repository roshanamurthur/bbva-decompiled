package zh;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mastercard.sonic.analytics.mixpanel.MixPanelFileHandling;
import com.mastercard.sonic.analytics.mixpanel.model.MixPanel;
import com.mastercard.sonic.observers.ThreadStatus;
import com.mastercard.sonic.utils.FileDirUtils;
import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MixPanelFileHandling.kt */
/* JADX INFO: loaded from: classes10.dex */
@DebugMetadata(c = "com.mastercard.sonic.analytics.mixpanel.MixPanelFileHandling$threadForPrepareToSyncFileToMixPanelAnalytics$2", f = "MixPanelFileHandling.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ MixPanelFileHandling f95073p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function1<String, Unit> f95074q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(MixPanelFileHandling mixPanelFileHandling, Function1<? super String, Unit> function1, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f95073p0 = mixPanelFileHandling;
        this.f95074q0 = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new e(this.f95073p0, this.f95074q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ThreadStatus threadStatus = ThreadStatus.OPERATION_IN_PROGRESS;
        MixPanelFileHandling mixPanelFileHandling = this.f95073p0;
        mixPanelFileHandling.c(true, threadStatus);
        MixPanelFileHandling.access$addInsertIdAndTimeToAllMixPanel(mixPanelFileHandling);
        JsonElement string = JsonParser.parseString(MixPanelFileHandling.access$convertMixPanelListToJsonString(mixPanelFileHandling, CollectionsKt___CollectionsKt.toList(mixPanelFileHandling.getMixPanelMap().values())));
        Intrinsics.checkNotNullExpressionValue(string, "parseString(convertMixPa…anelMap.values.toList()))");
        FileDirUtils fileDirUtils = FileDirUtils.INSTANCE;
        String fromFile = fileDirUtils.readFromFile(fileDirUtils.getMixPanelRequestToSyncFilePath(mixPanelFileHandling.f51037a));
        if (fromFile != null) {
            JsonElement string2 = JsonParser.parseString(fromFile);
            Intrinsics.checkNotNullExpressionValue(string2, "parseString(it)");
            if (string2.isJsonArray() && !string2.getAsJsonArray().isEmpty()) {
                string.getAsJsonArray().addAll(string2.getAsJsonArray());
            }
        }
        String strAccess$renameFileToSync = MixPanelFileHandling.access$renameFileToSync(mixPanelFileHandling);
        String string3 = string.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "currentJsonToSync.toString()");
        MixPanelFileHandling.access$writeToFile(mixPanelFileHandling, strAccess$renameFileToSync, string3);
        mixPanelFileHandling.mixPanelMap = new LinkedHashMap();
        MixPanel mixPanel = mixPanelFileHandling.f51043g;
        if (mixPanel != null) {
            Boxing.boxBoolean(mixPanelFileHandling.f51041e.add(mixPanel));
        }
        mixPanelFileHandling.f51043g = null;
        mixPanelFileHandling.isMixPanelAnalyticsSyncInProgress = false;
        mixPanelFileHandling.c(false, ThreadStatus.READY_FOR_SYNC);
        this.f95074q0.invoke(string.toString());
        return Unit.INSTANCE;
    }
}
