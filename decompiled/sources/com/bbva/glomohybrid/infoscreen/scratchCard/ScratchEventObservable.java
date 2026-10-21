package com.bbva.glomohybrid.infoscreen.scratchCard;

import android.content.Intent;
import kotlin.Metadata;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ScratchEventObservable.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/scratchCard/ScratchEventObservable;", "", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Landroid/content/Intent;", "a", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getEventFlow", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "eventFlow", "<init>", "()V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class ScratchEventObservable {

    @NotNull
    public static final ScratchEventObservable INSTANCE = new ScratchEventObservable();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final MutableSharedFlow<Intent> eventFlow = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    @NotNull
    public final MutableSharedFlow<Intent> getEventFlow() {
        return eventFlow;
    }
}
