package org.koin.core.time;

import com.adobe.marketing.mobile.EventDataKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.koin.mp.KoinPlatformTimeTools;

/* JADX INFO: compiled from: Timer.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004R \u0010\r\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR-\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b8\u0006@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Lorg/koin/core/time/Timer;", "", "", "stop", "", "getTimeInSeconds", "getTimeInMillis", "getTimeInNanos", "Lkotlin/time/Duration;", "a", "J", "getStart-UwyO8pc", "()J", EventDataKeys.Lifecycle.LIFECYCLE_START, "<set-?>", "b", "getEnd-UwyO8pc", "end", "<init>", "()V", "Companion", "koin-core"}, k = 1, mv = {1, 8, 0})
public final class Timer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final double NANO_TO_MILLI = 1000000.0d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long start = DurationKt.toDuration(KoinPlatformTimeTools.INSTANCE.getTimeInNanoSeconds(), DurationUnit.NANOSECONDS);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public long end;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f92489c;

    /* JADX INFO: compiled from: Timer.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lorg/koin/core/time/Timer$Companion;", "", "()V", "NANO_TO_MILLI", "", EventDataKeys.Lifecycle.LIFECYCLE_START, "Lorg/koin/core/time/Timer;", "koin-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Timer start() {
            return new Timer();
        }
    }

    public Timer() {
        Duration.Companion companion = Duration.INSTANCE;
        this.end = companion.m5888getZEROUwyO8pc();
        this.f92489c = companion.m5888getZEROUwyO8pc();
    }

    /* JADX INFO: renamed from: getEnd-UwyO8pc, reason: not valid java name and from getter */
    public final long getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: getStart-UwyO8pc, reason: not valid java name and from getter */
    public final long getStart() {
        return this.start;
    }

    public final double getTimeInMillis() {
        return Duration.m5849toDoubleimpl(this.f92489c, DurationUnit.MILLISECONDS);
    }

    public final double getTimeInNanos() {
        return Duration.m5849toDoubleimpl(this.f92489c, DurationUnit.NANOSECONDS);
    }

    public final double getTimeInSeconds() {
        return Duration.m5849toDoubleimpl(this.f92489c, DurationUnit.SECONDS);
    }

    public final void stop() {
        if (Duration.m5816equalsimpl0(this.end, Duration.INSTANCE.m5888getZEROUwyO8pc())) {
            long duration = DurationKt.toDuration(KoinPlatformTimeTools.INSTANCE.getTimeInNanoSeconds(), DurationUnit.NANOSECONDS);
            this.end = duration;
            this.f92489c = Duration.m5841minusLRDsOJo(duration, this.start);
        }
    }
}
