package org.junit.experimental.max;

import fn.a;
import java.io.File;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import junit.framework.TestSuite;
import mx.openpay.library.domain.util.Constant;
import org.junit.internal.requests.SortingRequest;
import org.junit.internal.runners.JUnit38ClassRunner;
import org.junit.runner.Description;
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;
import org.junit.runner.Runner;
import org.junit.runners.Suite;

/* JADX INFO: loaded from: classes13.dex */
public class MaxCore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaxHistory f91803a;

    public MaxCore(File file) {
        this.f91803a = MaxHistory.forFolder(file);
    }

    public static void a(Description description, Description description2, ArrayList arrayList) {
        if (!description2.getChildren().isEmpty()) {
            Iterator<Description> it = description2.getChildren().iterator();
            while (it.hasNext()) {
                a(description2, it.next(), arrayList);
            }
        } else {
            if (!description2.toString().equals("warning(junit.framework.TestSuite$1)")) {
                arrayList.add(description2);
                return;
            }
            arrayList.add(Description.createSuiteDescription("malformed JUnit 3 test class: " + description, new Annotation[0]));
        }
    }

    @Deprecated
    public static MaxCore forFolder(String str) {
        return storedLocally(new File(str));
    }

    public static MaxCore storedLocally(File file) {
        return new MaxCore(file);
    }

    public Result run(Class<?> cls) {
        return run(Request.aClass(cls));
    }

    public Request sortRequest(Request request) {
        Runner runner;
        Class<?> cls;
        if (request instanceof SortingRequest) {
            return request;
        }
        ArrayList<Description> arrayList = new ArrayList();
        a(null, request.getRunner().getDescription(), arrayList);
        Collections.sort(arrayList, this.f91803a.testComparator());
        ArrayList arrayList2 = new ArrayList();
        for (Description description : arrayList) {
            if (description.toString().equals("TestSuite with 0 tests")) {
                runner = Suite.emptySuite();
            } else if (description.toString().startsWith("malformed JUnit 3 test class: ")) {
                try {
                    cls = Class.forName(description.toString().replace("malformed JUnit 3 test class: ", ""));
                } catch (ClassNotFoundException unused) {
                    cls = null;
                }
                runner = new JUnit38ClassRunner(new TestSuite(cls));
            } else {
                Class<?> testClass = description.getTestClass();
                if (testClass == null) {
                    throw new RuntimeException("Can't build a runner from description [" + description + Constant.BRACKET_CLOSE);
                }
                String methodName = description.getMethodName();
                runner = methodName == null ? Request.aClass(testClass).getRunner() : Request.method(testClass, methodName).getRunner();
            }
            arrayList2.add(runner);
        }
        return new a(arrayList2);
    }

    public List<Description> sortedLeavesForTest(Request request) {
        Request requestSortRequest = sortRequest(request);
        ArrayList arrayList = new ArrayList();
        a(null, requestSortRequest.getRunner().getDescription(), arrayList);
        return arrayList;
    }

    public Result run(Request request) {
        return run(request, new JUnitCore());
    }

    public Result run(Request request, JUnitCore jUnitCore) {
        jUnitCore.addListener(this.f91803a.listener());
        return jUnitCore.run(sortRequest(request).getRunner());
    }
}
