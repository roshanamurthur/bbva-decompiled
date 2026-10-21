package org.junit.experimental.max;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

/* JADX INFO: loaded from: classes13.dex */
public class MaxHistory implements Serializable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final HashMap f91804p0 = new HashMap();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final HashMap f91805q0 = new HashMap();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final File f91806r0;

    public final class a extends RunListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f91807a = System.currentTimeMillis();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap f91808b = new HashMap();

        public a() {
        }

        @Override // org.junit.runner.notification.RunListener
        public final void testFailure(Failure failure) throws Exception {
            MaxHistory.this.f91805q0.put(failure.getDescription().toString(), Long.valueOf(this.f91807a));
        }

        @Override // org.junit.runner.notification.RunListener
        public final void testFinished(Description description) throws Exception {
            MaxHistory.this.f91804p0.put(description.toString(), Long.valueOf(System.nanoTime() - ((Long) this.f91808b.get(description)).longValue()));
        }

        @Override // org.junit.runner.notification.RunListener
        public final void testRunFinished(Result result) throws Exception {
            MaxHistory maxHistory = MaxHistory.this;
            maxHistory.getClass();
            ObjectOutputStream objectOutputStream = null;
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream(maxHistory.f91806r0));
                try {
                    objectOutputStream2.writeObject(maxHistory);
                    objectOutputStream2.close();
                } catch (Throwable th2) {
                    th = th2;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        objectOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // org.junit.runner.notification.RunListener
        public final void testStarted(Description description) throws Exception {
            this.f91808b.put(description, Long.valueOf(System.nanoTime()));
        }
    }

    public class b implements Comparator<Description> {
        public b() {
        }

        @Override // java.util.Comparator
        public final int compare(Description description, Description description2) {
            Description description3 = description;
            Description description4 = description2;
            MaxHistory maxHistory = MaxHistory.this;
            if (!maxHistory.f91804p0.containsKey(description3.toString())) {
                return -1;
            }
            HashMap map = maxHistory.f91804p0;
            if (!map.containsKey(description4.toString())) {
                return 1;
            }
            Long l6 = (Long) maxHistory.f91805q0.get(description4.toString());
            if (l6 == null) {
                l6 = 0L;
            }
            long j10 = (Long) maxHistory.f91805q0.get(description3.toString());
            if (j10 == null) {
                j10 = 0L;
            }
            int iCompareTo = l6.compareTo(j10);
            return iCompareTo != 0 ? iCompareTo : ((Long) map.get(description3.toString())).compareTo((Long) map.get(description4.toString()));
        }
    }

    public MaxHistory(File file) {
        this.f91806r0 = file;
    }

    public static MaxHistory a(File file) throws CouldNotReadCoreException {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                try {
                    MaxHistory maxHistory = (MaxHistory) objectInputStream.readObject();
                    objectInputStream.close();
                    fileInputStream.close();
                    return maxHistory;
                } catch (Throwable th2) {
                    objectInputStream.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                fileInputStream.close();
                throw th3;
            }
        } catch (Exception e5) {
            throw new CouldNotReadCoreException(e5);
        }
    }

    public static MaxHistory forFolder(File file) {
        if (file.exists()) {
            try {
                return a(file);
            } catch (CouldNotReadCoreException e5) {
                e5.printStackTrace();
                file.delete();
            }
        }
        return new MaxHistory(file);
    }

    public RunListener listener() {
        return new a();
    }

    public Comparator<Description> testComparator() {
        return new b();
    }
}
