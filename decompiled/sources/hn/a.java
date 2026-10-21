package hn;

import org.junit.internal.management.ThreadMXBean;

/* JADX INFO: compiled from: FakeThreadMXBean.java */
/* JADX INFO: loaded from: classes13.dex */
public final class a implements ThreadMXBean {
    @Override // org.junit.internal.management.ThreadMXBean
    public final long getThreadCpuTime(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // org.junit.internal.management.ThreadMXBean
    public final boolean isThreadCpuTimeSupported() {
        return false;
    }
}
