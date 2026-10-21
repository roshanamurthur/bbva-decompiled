package org.junit.runner.notification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.junit.runner.Description;
import org.junit.runner.Result;

/* JADX INFO: loaded from: classes13.dex */
public class RunNotifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f92001a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f92002b = false;

    public class a extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f92003c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RunNotifier runNotifier, List list, List list2) {
            super(list);
            this.f92003c = list2;
        }

        @Override // org.junit.runner.notification.RunNotifier.b
        public final void a(RunListener runListener) throws Exception {
            Iterator it = this.f92003c.iterator();
            while (it.hasNext()) {
                runListener.testFailure((Failure) it.next());
            }
        }
    }

    public abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<RunListener> f92004a;

        public b(List<RunListener> list) {
            this.f92004a = list;
        }

        public abstract void a(RunListener runListener) throws Exception;

        public final void b() {
            List<RunListener> list = this.f92004a;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            ArrayList arrayList2 = new ArrayList(size);
            for (RunListener runListener : list) {
                try {
                    a(runListener);
                    arrayList.add(runListener);
                } catch (Exception e5) {
                    arrayList2.add(new Failure(Description.TEST_MECHANISM, e5));
                }
            }
            RunNotifier.this.a(arrayList, arrayList2);
        }
    }

    public final void a(List<RunListener> list, List<Failure> list2) {
        if (list2.isEmpty()) {
            return;
        }
        new a(this, list, list2).b();
    }

    public void addFirstListener(RunListener runListener) {
        if (runListener == null) {
            throw new NullPointerException("Cannot add a null listener");
        }
        this.f92001a.add(0, b(runListener));
    }

    public void addListener(RunListener runListener) {
        if (runListener == null) {
            throw new NullPointerException("Cannot add a null listener");
        }
        this.f92001a.add(b(runListener));
    }

    public final RunListener b(RunListener runListener) {
        return runListener.getClass().isAnnotationPresent(RunListener.ThreadSafe.class) ? runListener : new org.junit.runner.notification.a(runListener, this);
    }

    public void fireTestAssumptionFailed(Failure failure) {
        CopyOnWriteArrayList<RunListener> copyOnWriteArrayList = this.f92001a;
        int size = copyOnWriteArrayList.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        for (RunListener runListener : copyOnWriteArrayList) {
            try {
                runListener.testAssumptionFailure(failure);
                arrayList.add(runListener);
            } catch (Exception e5) {
                arrayList2.add(new Failure(Description.TEST_MECHANISM, e5));
            }
        }
        a(arrayList, arrayList2);
    }

    public void fireTestFailure(Failure failure) {
        a(this.f92001a, Arrays.asList(failure));
    }

    public void fireTestFinished(Description description) {
        CopyOnWriteArrayList<RunListener> copyOnWriteArrayList = this.f92001a;
        int size = copyOnWriteArrayList.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        for (RunListener runListener : copyOnWriteArrayList) {
            try {
                runListener.testFinished(description);
                arrayList.add(runListener);
            } catch (Exception e5) {
                arrayList2.add(new Failure(Description.TEST_MECHANISM, e5));
            }
        }
        a(arrayList, arrayList2);
    }

    public void fireTestIgnored(Description description) {
        CopyOnWriteArrayList<RunListener> copyOnWriteArrayList = this.f92001a;
        int size = copyOnWriteArrayList.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        for (RunListener runListener : copyOnWriteArrayList) {
            try {
                runListener.testIgnored(description);
                arrayList.add(runListener);
            } catch (Exception e5) {
                arrayList2.add(new Failure(Description.TEST_MECHANISM, e5));
            }
        }
        a(arrayList, arrayList2);
    }

    public void fireTestRunFinished(Result result) {
        CopyOnWriteArrayList<RunListener> copyOnWriteArrayList = this.f92001a;
        int size = copyOnWriteArrayList.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        for (RunListener runListener : copyOnWriteArrayList) {
            try {
                runListener.testRunFinished(result);
                arrayList.add(runListener);
            } catch (Exception e5) {
                arrayList2.add(new Failure(Description.TEST_MECHANISM, e5));
            }
        }
        a(arrayList, arrayList2);
    }

    public void fireTestRunStarted(Description description) {
        CopyOnWriteArrayList<RunListener> copyOnWriteArrayList = this.f92001a;
        int size = copyOnWriteArrayList.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        for (RunListener runListener : copyOnWriteArrayList) {
            try {
                runListener.testRunStarted(description);
                arrayList.add(runListener);
            } catch (Exception e5) {
                arrayList2.add(new Failure(Description.TEST_MECHANISM, e5));
            }
        }
        a(arrayList, arrayList2);
    }

    public void fireTestStarted(Description description) throws StoppedByUserException {
        if (this.f92002b) {
            throw new StoppedByUserException();
        }
        CopyOnWriteArrayList<RunListener> copyOnWriteArrayList = this.f92001a;
        int size = copyOnWriteArrayList.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        for (RunListener runListener : copyOnWriteArrayList) {
            try {
                runListener.testStarted(description);
                arrayList.add(runListener);
            } catch (Exception e5) {
                arrayList2.add(new Failure(Description.TEST_MECHANISM, e5));
            }
        }
        a(arrayList, arrayList2);
    }

    public void fireTestSuiteFinished(Description description) {
        CopyOnWriteArrayList<RunListener> copyOnWriteArrayList = this.f92001a;
        int size = copyOnWriteArrayList.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        for (RunListener runListener : copyOnWriteArrayList) {
            try {
                runListener.testSuiteFinished(description);
                arrayList.add(runListener);
            } catch (Exception e5) {
                arrayList2.add(new Failure(Description.TEST_MECHANISM, e5));
            }
        }
        a(arrayList, arrayList2);
    }

    public void fireTestSuiteStarted(Description description) {
        CopyOnWriteArrayList<RunListener> copyOnWriteArrayList = this.f92001a;
        int size = copyOnWriteArrayList.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        for (RunListener runListener : copyOnWriteArrayList) {
            try {
                runListener.testSuiteStarted(description);
                arrayList.add(runListener);
            } catch (Exception e5) {
                arrayList2.add(new Failure(Description.TEST_MECHANISM, e5));
            }
        }
        a(arrayList, arrayList2);
    }

    public void pleaseStop() {
        this.f92002b = true;
    }

    public void removeListener(RunListener runListener) {
        if (runListener == null) {
            throw new NullPointerException("Cannot remove a null listener");
        }
        this.f92001a.remove(b(runListener));
    }
}
