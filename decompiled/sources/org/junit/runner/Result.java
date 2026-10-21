package org.junit.runner;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

/* JADX INFO: loaded from: classes13.dex */
public class Result implements Serializable {
    private static final ObjectStreamField[] serialPersistentFields = ObjectStreamClass.lookup(b.class).getFields();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AtomicInteger f91978p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicInteger f91979q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AtomicInteger f91980r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final CopyOnWriteArrayList<Failure> f91981s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final AtomicLong f91982t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final AtomicLong f91983u0;
    public b v0;

    @RunListener.ThreadSafe
    public class a extends RunListener {
        public a() {
        }

        @Override // org.junit.runner.notification.RunListener
        public final void testAssumptionFailure(Failure failure) {
            Result.this.f91980r0.getAndIncrement();
        }

        @Override // org.junit.runner.notification.RunListener
        public final void testFailure(Failure failure) throws Exception {
            Result.this.f91981s0.add(failure);
        }

        @Override // org.junit.runner.notification.RunListener
        public final void testFinished(Description description) throws Exception {
            Result.this.f91978p0.getAndIncrement();
        }

        @Override // org.junit.runner.notification.RunListener
        public final void testIgnored(Description description) throws Exception {
            Result.this.f91979q0.getAndIncrement();
        }

        @Override // org.junit.runner.notification.RunListener
        public final void testRunFinished(Result result) throws Exception {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Result result2 = Result.this;
            result2.f91982t0.addAndGet(jCurrentTimeMillis - result2.f91983u0.get());
        }

        @Override // org.junit.runner.notification.RunListener
        public final void testRunStarted(Description description) throws Exception {
            Result.this.f91983u0.set(System.currentTimeMillis());
        }
    }

    public static class b implements Serializable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicInteger f91985p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicInteger f91986q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicInteger f91987r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final List<Failure> f91988s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final long f91989t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final long f91990u0;

        public b(ObjectInputStream.GetField getField) throws IOException {
            this.f91985p0 = (AtomicInteger) getField.get("fCount", (Object) null);
            this.f91986q0 = (AtomicInteger) getField.get("fIgnoreCount", (Object) null);
            this.f91987r0 = (AtomicInteger) getField.get("assumptionFailureCount", (Object) null);
            this.f91988s0 = (List) getField.get("fFailures", (Object) null);
            this.f91989t0 = getField.get("fRunTime", 0L);
            this.f91990u0 = getField.get("fStartTime", 0L);
        }
    }

    public Result() {
        this.f91978p0 = new AtomicInteger();
        this.f91979q0 = new AtomicInteger();
        this.f91980r0 = new AtomicInteger();
        this.f91981s0 = new CopyOnWriteArrayList<>();
        this.f91982t0 = new AtomicLong();
        this.f91983u0 = new AtomicLong();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        this.v0 = new b(objectInputStream.readFields());
    }

    private Object readResolve() {
        return new Result(this.v0);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        List listSynchronizedList = Collections.synchronizedList(new ArrayList(this.f91981s0));
        long jLongValue = this.f91982t0.longValue();
        long jLongValue2 = this.f91983u0.longValue();
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("fCount", this.f91978p0);
        putFieldPutFields.put("fIgnoreCount", this.f91979q0);
        putFieldPutFields.put("fFailures", listSynchronizedList);
        putFieldPutFields.put("fRunTime", jLongValue);
        putFieldPutFields.put("fStartTime", jLongValue2);
        putFieldPutFields.put("assumptionFailureCount", this.f91980r0);
        objectOutputStream.writeFields();
    }

    public RunListener createListener() {
        return new a();
    }

    public int getAssumptionFailureCount() {
        AtomicInteger atomicInteger = this.f91980r0;
        if (atomicInteger != null) {
            return atomicInteger.get();
        }
        throw new UnsupportedOperationException("Result was serialized from a version of JUnit that doesn't support this method");
    }

    public int getFailureCount() {
        return this.f91981s0.size();
    }

    public List<Failure> getFailures() {
        return this.f91981s0;
    }

    public int getIgnoreCount() {
        return this.f91979q0.get();
    }

    public int getRunCount() {
        return this.f91978p0.get();
    }

    public long getRunTime() {
        return this.f91982t0.get();
    }

    public boolean wasSuccessful() {
        return getFailureCount() == 0;
    }

    public Result(b bVar) {
        this.f91978p0 = bVar.f91985p0;
        this.f91979q0 = bVar.f91986q0;
        this.f91980r0 = bVar.f91987r0;
        this.f91981s0 = new CopyOnWriteArrayList<>(bVar.f91988s0);
        this.f91982t0 = new AtomicLong(bVar.f91989t0);
        this.f91983u0 = new AtomicLong(bVar.f91990u0);
    }
}
