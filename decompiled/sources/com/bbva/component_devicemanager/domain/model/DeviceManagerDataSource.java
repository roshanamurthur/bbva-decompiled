package com.bbva.component_devicemanager.domain.model;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceManagerDataSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0011\u0010\b\u001a\u00020\tH¦@ø\u0001\u0000¢\u0006\u0002\u0010\nR\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/bbva/component_devicemanager/domain/model/DeviceManagerDataSource;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "collectData", "Lcom/bbva/component_devicemanager/domain/model/GlobalDeviceManagerResponse;", "getAccessId", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "component-devicemanager_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface DeviceManagerDataSource extends CoroutineScope {

    /* JADX INFO: compiled from: DeviceManagerDataSource.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static CoroutineContext getCoroutineContext(@NotNull DeviceManagerDataSource deviceManagerDataSource) {
            return JobKt__JobKt.Job$default((Job) null, 1, (Object) null).plus(Dispatchers.getDefault());
        }
    }

    @Nullable
    GlobalDeviceManagerResponse collectData();

    @Nullable
    Object getAccessId(@NotNull Continuation<? super String> continuation);

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    CoroutineContext getCoroutineContext();
}
