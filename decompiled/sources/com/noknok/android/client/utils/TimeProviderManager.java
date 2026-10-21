package com.noknok.android.client.utils;

/* JADX INFO: loaded from: classes11.dex */
public class TimeProviderManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ITimeProvider f63480a;

    public static class DefaultTimeProvider implements ITimeProvider {
        private DefaultTimeProvider() {
        }

        public /* synthetic */ DefaultTimeProvider(int i10) {
            this();
        }

        @Override // com.noknok.android.client.utils.TimeProviderManager.ITimeProvider
        public long getCurrentTime() {
            return System.currentTimeMillis();
        }
    }

    public interface ITimeProvider {
        long getCurrentTime();
    }

    public static synchronized ITimeProvider getInstance() {
        try {
            if (f63480a == null) {
                setInstance(new DefaultTimeProvider(0));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f63480a;
    }

    public static void setInstance(ITimeProvider iTimeProvider) {
        f63480a = iTimeProvider;
    }
}
