package com.google.firebase.sessions;

import android.os.SystemClock;
import kotlin.Metadata;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TimeProvider.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0005\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0016\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/google/firebase/sessions/WallClock;", "Lcom/google/firebase/sessions/TimeProvider;", "Lkotlin/time/Duration;", "elapsedRealtime-UwyO8pc", "()J", "elapsedRealtime", "", "currentTimeUs", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
public final class WallClock implements TimeProvider {

    @NotNull
    public static final WallClock INSTANCE = new WallClock();

    @Override // com.google.firebase.sessions.TimeProvider
    public long currentTimeUs() {
        return System.currentTimeMillis() * 1000;
    }

    @Override // com.google.firebase.sessions.TimeProvider
    /* JADX INFO: renamed from: elapsedRealtime-UwyO8pc */
    public long mo5292elapsedRealtimeUwyO8pc() {
        Duration.Companion companion = Duration.INSTANCE;
        return DurationKt.toDuration(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS);
    }
}
