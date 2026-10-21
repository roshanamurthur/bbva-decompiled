package com.google.firebase.crashlytics.internal.stacktrace;

/* JADX INFO: loaded from: classes10.dex */
public class MiddleOutFallbackStrategy implements StackTraceTrimmingStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StackTraceTrimmingStrategy[] f48312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MiddleOutStrategy f48313c;

    public MiddleOutFallbackStrategy(int i10, StackTraceTrimmingStrategy... stackTraceTrimmingStrategyArr) {
        this.f48311a = i10;
        this.f48312b = stackTraceTrimmingStrategyArr;
        this.f48313c = new MiddleOutStrategy(i10);
    }

    @Override // com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy
    public StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i10 = this.f48311a;
        if (length <= i10) {
            return stackTraceElementArr;
        }
        StackTraceElement[] trimmedStackTrace = stackTraceElementArr;
        for (StackTraceTrimmingStrategy stackTraceTrimmingStrategy : this.f48312b) {
            if (trimmedStackTrace.length <= i10) {
                break;
            }
            trimmedStackTrace = stackTraceTrimmingStrategy.getTrimmedStackTrace(stackTraceElementArr);
        }
        return trimmedStackTrace.length > i10 ? this.f48313c.getTrimmedStackTrace(trimmedStackTrace) : trimmedStackTrace;
    }
}
