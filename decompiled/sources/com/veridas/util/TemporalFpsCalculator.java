package com.veridas.util;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TemporalFpsCalculator.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, d2 = {"Lcom/veridas/util/TemporalFpsCalculator;", "Lcom/veridas/util/FpsCalculator;", "", "getFps", "", "restart", "", "tick", "", "bufferSize", "timeoutInterval", "Lcom/veridas/util/TimeProvider;", "timeProvider", "<init>", "(IJLcom/veridas/util/TimeProvider;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class TemporalFpsCalculator implements FpsCalculator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f67489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TimeProvider f67490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final RingBuffer<Long> f67491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f67492d;

    /* JADX INFO: compiled from: TemporalFpsCalculator.kt */
    public static final class a extends Lambda implements Function1<Integer, Long> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long f67493p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j10) {
            super(1);
            this.f67493p0 = j10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Long invoke(Integer num) {
            num.intValue();
            return Long.valueOf(this.f67493p0);
        }
    }

    /* JADX INFO: compiled from: TemporalFpsCalculator.kt */
    public static final class b extends Lambda implements Function1<Integer, Long> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long f67494p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10) {
            super(1);
            this.f67494p0 = j10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Long invoke(Integer num) {
            num.intValue();
            return Long.valueOf(this.f67494p0);
        }
    }

    public TemporalFpsCalculator(int i10, long j10, @NotNull TimeProvider timeProvider) {
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.f67489a = j10;
        this.f67490b = timeProvider;
        this.f67491c = RingBuffer.INSTANCE.createLongRingBuffer(i10, new a(timeProvider.getTimeInMillis()));
    }

    @Override // com.veridas.util.FpsCalculator
    /* JADX INFO: renamed from: getFps, reason: from getter */
    public double getF67492d() {
        return this.f67492d;
    }

    @Override // com.veridas.util.FpsCalculator
    public void restart() {
        this.f67491c.reset(new b(this.f67490b.getTimeInMillis()));
        this.f67492d = 0.0d;
    }

    @Override // com.veridas.util.FpsCalculator
    public long tick() {
        long timeInMillis = this.f67490b.getTimeInMillis();
        Long lValueOf = Long.valueOf(timeInMillis);
        RingBuffer<Long> ringBuffer = this.f67491c;
        ringBuffer.put(lValueOf);
        int f67487c = ringBuffer.getF67487c();
        int i10 = f67487c - 1;
        long jLongValue = ringBuffer.get(i10).longValue() - ringBuffer.get(f67487c).longValue();
        if (ringBuffer.get(i10).longValue() - ringBuffer.get(f67487c - 2).longValue() < this.f67489a) {
            this.f67492d = (((double) (ringBuffer.size() - 1)) * 1000.0d) / jLongValue;
        } else {
            restart();
        }
        return timeInMillis;
    }
}
