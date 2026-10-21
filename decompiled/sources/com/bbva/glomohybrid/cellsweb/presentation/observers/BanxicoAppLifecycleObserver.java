package com.bbva.glomohybrid.cellsweb.presentation.observers;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BanxicoAppLifecycleObserver.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/observers/BanxicoAppLifecycleObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "", "initialize", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "onStateChanged", "Lcom/bbva/bridge/dispatcher/MessageDispatcher;", "dispatcher", "<init>", "(Lcom/bbva/bridge/dispatcher/MessageDispatcher;)V", "Companion", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class BanxicoAppLifecycleObserver implements LifecycleEventObserver {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public final MessageDispatcher f31664p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f31665q0;

    /* JADX INFO: compiled from: BanxicoAppLifecycleObserver.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BanxicoAppLifecycleObserver(@Nullable MessageDispatcher messageDispatcher) {
        this.f31664p0 = messageDispatcher;
    }

    public final void initialize() {
        if (this.f31665q0) {
            return;
        }
        ProcessLifecycleOwner.INSTANCE.get().getLifecycle().addObserver(this);
        this.f31665q0 = true;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        int i10 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        MessageDispatcher messageDispatcher = this.f31664p0;
        if (i10 == 1) {
            if (messageDispatcher != null) {
                messageDispatcher.notifyEvent("global_app_change_to_foreground_state");
            }
        } else if (i10 == 2 && messageDispatcher != null) {
            messageDispatcher.notifyEvent("global_app_change_to_background_state");
        }
    }
}
