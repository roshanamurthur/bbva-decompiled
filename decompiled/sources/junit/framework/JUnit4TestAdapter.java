package junit.framework;

import java.util.Iterator;
import java.util.List;
import org.junit.Ignore;
import org.junit.runner.Describable;
import org.junit.runner.Description;
import org.junit.runner.Request;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filter;
import org.junit.runner.manipulation.Filterable;
import org.junit.runner.manipulation.InvalidOrderingException;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.manipulation.Orderable;
import org.junit.runner.manipulation.Orderer;
import org.junit.runner.manipulation.Sorter;

/* JADX INFO: loaded from: classes12.dex */
public class JUnit4TestAdapter implements Test, Filterable, Orderable, Describable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f79122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runner f79123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JUnit4TestAdapterCache f79124c;

    public JUnit4TestAdapter(Class<?> cls) {
        this(cls, JUnit4TestAdapterCache.getDefault());
    }

    public static Description a(Description description) {
        if (description.getAnnotation(Ignore.class) != null) {
            return Description.EMPTY;
        }
        Description descriptionChildlessCopy = description.childlessCopy();
        Iterator<Description> it = description.getChildren().iterator();
        while (it.hasNext()) {
            Description descriptionA = a(it.next());
            if (!descriptionA.isEmpty()) {
                descriptionChildlessCopy.addChild(descriptionA);
            }
        }
        return descriptionChildlessCopy;
    }

    @Override // junit.framework.Test
    public int countTestCases() {
        return this.f79123b.testCount();
    }

    @Override // org.junit.runner.manipulation.Filterable
    public void filter(Filter filter) throws NoTestsRemainException {
        filter.apply(this.f79123b);
    }

    @Override // org.junit.runner.Describable
    public Description getDescription() {
        return a(this.f79123b.getDescription());
    }

    public Class<?> getTestClass() {
        return this.f79122a;
    }

    public List<Test> getTests() {
        return this.f79124c.asTestList(getDescription());
    }

    @Override // org.junit.runner.manipulation.Orderable
    public void order(Orderer orderer) throws InvalidOrderingException {
        orderer.apply(this.f79123b);
    }

    @Override // junit.framework.Test
    public void run(TestResult testResult) {
        this.f79123b.run(this.f79124c.getNotifier(testResult, this));
    }

    @Override // org.junit.runner.manipulation.Sortable
    public void sort(Sorter sorter) {
        sorter.apply(this.f79123b);
    }

    public String toString() {
        return this.f79122a.getName();
    }

    public JUnit4TestAdapter(Class<?> cls, JUnit4TestAdapterCache jUnit4TestAdapterCache) {
        this.f79124c = jUnit4TestAdapterCache;
        this.f79122a = cls;
        this.f79123b = Request.classWithoutSuiteMethod(cls).getRunner();
    }
}
