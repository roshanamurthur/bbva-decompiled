package com.bbva.ethermobilesdk.devicemanager.data.devicechecker.common.repository;

import com.bbva.ethermobile.help.kit.result.Result;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceCheckerRepository.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J<\u0010\u0007\u001a0\u0012,\u0012*\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\bj\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003`\n0\u0003H¦@¢\u0006\u0002\u0010\u000bJ@\u0010\f\u001a4\u00120\u0012.\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00030\bj\u0016\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003`\n0\u0003H¦@¢\u0006\u0002\u0010\u000bJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0002\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/data/devicechecker/common/repository/DeviceCheckerRepository;", "", "isDebuggable", "Lcom/bbva/ethermobile/help/kit/result/Result;", "", "isDeveloperModeEnabled", "isEmulator", "isFridaCompleteDetected", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isMagiskCompleteDetected", "isRoot", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeviceCheckerRepository {
    @NotNull
    Result<Boolean> isDebuggable();

    @NotNull
    Result<Boolean> isDeveloperModeEnabled();

    @NotNull
    Result<Boolean> isEmulator();

    @Nullable
    Object isFridaCompleteDetected(@NotNull Continuation<? super Result<HashMap<Integer, Result<Boolean>>>> continuation);

    @Nullable
    Object isMagiskCompleteDetected(@NotNull Continuation<? super Result<HashMap<Integer, Result<? extends Object>>>> continuation);

    @Nullable
    Object isRoot(@NotNull Continuation<? super Result<Boolean>> continuation);
}
