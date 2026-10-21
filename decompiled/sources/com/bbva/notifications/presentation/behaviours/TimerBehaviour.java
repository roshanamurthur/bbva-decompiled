package com.bbva.notifications.presentation.behaviours;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.model.Timer;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TimerBehaviour.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\nJ6\u0010\u0002\u001a\u0004\u0018\u00010\u00032*\u0010\u0004\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005j\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\u0007H&J4\u0010\b\u001a\u00020\t2*\u0010\u0004\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005j\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/bbva/notifications/presentation/behaviours/TimerBehaviour;", "", "compute", "Lcom/bbva/notifications/model/Timer;", "notificationMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "isExpired", "", "State", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface TimerBehaviour {

    /* JADX INFO: compiled from: TimerBehaviour.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/notifications/presentation/behaviours/TimerBehaviour$State;", "", "()V", "Ready", "TimerExpired", "Lcom/bbva/notifications/presentation/behaviours/TimerBehaviour$State$Ready;", "Lcom/bbva/notifications/presentation/behaviours/TimerBehaviour$State$TimerExpired;", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class State {

        /* JADX INFO: compiled from: TimerBehaviour.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/notifications/presentation/behaviours/TimerBehaviour$State$Ready;", "Lcom/bbva/notifications/presentation/behaviours/TimerBehaviour$State;", "Lcom/bbva/notifications/model/Timer;", "component1", "timer", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/notifications/model/Timer;", "getTimer", "()Lcom/bbva/notifications/model/Timer;", "<init>", "(Lcom/bbva/notifications/model/Timer;)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class Ready extends State {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final Timer timer;

            public Ready(@Nullable Timer timer) {
                super(null);
                this.timer = timer;
            }

            public static /* synthetic */ Ready copy$default(Ready ready, Timer timer, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    timer = ready.timer;
                }
                return ready.copy(timer);
            }

            @Nullable
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Timer getTimer() {
                return this.timer;
            }

            @NotNull
            public final Ready copy(@Nullable Timer timer) {
                return new Ready(timer);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Ready) && Intrinsics.areEqual(this.timer, ((Ready) other).timer);
            }

            @Nullable
            public final Timer getTimer() {
                return this.timer;
            }

            public int hashCode() {
                Timer timer = this.timer;
                if (timer == null) {
                    return 0;
                }
                return timer.hashCode();
            }

            @NotNull
            public String toString() {
                return "Ready(timer=" + this.timer + ")";
            }
        }

        /* JADX INFO: compiled from: TimerBehaviour.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/notifications/presentation/behaviours/TimerBehaviour$State$TimerExpired;", "Lcom/bbva/notifications/presentation/behaviours/TimerBehaviour$State;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class TimerExpired extends State {

            @NotNull
            public static final TimerExpired INSTANCE = new TimerExpired();

            public TimerExpired() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TimerExpired)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1621785421;
            }

            @NotNull
            public String toString() {
                return "TimerExpired";
            }
        }

        public State() {
        }

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Nullable
    Timer compute(@Nullable HashMap<String, Object> notificationMap);

    boolean isExpired(@Nullable HashMap<String, Object> notificationMap);
}
