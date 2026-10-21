package org.junit.runner;

import androidx.camera.camera2.internal.h0;
import java.util.ArrayList;
import java.util.Iterator;
import junit.framework.Test;
import junit.runner.Version;
import mx.openpay.library.domain.util.Constant;
import org.junit.internal.Classes;
import org.junit.internal.RealSystem;
import org.junit.internal.TextListener;
import org.junit.internal.runners.JUnit38ClassRunner;
import org.junit.runner.notification.RunListener;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.InitializationError;

/* JADX INFO: loaded from: classes13.dex */
public class JUnitCore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RunNotifier f91976a = new RunNotifier();

    public static void main(String... strArr) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String[] strArr2;
        ArrayList arrayList3;
        Request requestErrorReport;
        String strSubstring;
        JUnitCore jUnitCore = new JUnitCore();
        RealSystem realSystem = new RealSystem();
        realSystem.out().println("JUnit version " + Version.id());
        JUnitCommandLineParseResult jUnitCommandLineParseResult = new JUnitCommandLineParseResult();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = strArr.length;
            arrayList = jUnitCommandLineParseResult.f91975c;
            arrayList2 = jUnitCommandLineParseResult.f91973a;
            if (i11 != length) {
                String str = strArr[i11];
                if (str.equals("--")) {
                    int i12 = i11 + 1;
                    int length2 = strArr.length;
                    strArr2 = new String[length2 - i12];
                    for (int i13 = i12; i13 != length2; i13++) {
                        strArr2[i13 - i12] = strArr[i13];
                    }
                    break;
                }
                if (!str.startsWith("--")) {
                    int length3 = strArr.length;
                    strArr2 = new String[length3 - i11];
                    for (int i14 = i11; i14 != length3; i14++) {
                        strArr2[i14 - i11] = strArr[i14];
                    }
                    break;
                }
                if (str.startsWith("--filter=") || str.equals("--filter")) {
                    if (str.equals("--filter")) {
                        i11++;
                        if (i11 < strArr.length) {
                            strSubstring = strArr[i11];
                        } else {
                            arrayList.add(new JUnitCommandLineParseResult.CommandLineParserError(str.concat(" value not specified")));
                        }
                    } else {
                        strSubstring = str.substring(str.indexOf(61) + 1);
                    }
                    arrayList2.add(strSubstring);
                } else {
                    arrayList.add(new JUnitCommandLineParseResult.CommandLineParserError(h0.b("JUnit knows nothing about the ", str, " option")));
                }
                i11++;
            }
            strArr2 = new String[0];
            break;
        }
        int length4 = strArr2.length;
        while (true) {
            arrayList3 = jUnitCommandLineParseResult.f91974b;
            if (i10 >= length4) {
                break;
            }
            String str2 = strArr2[i10];
            try {
                arrayList3.add(Classes.getClass(str2));
            } catch (ClassNotFoundException e5) {
                arrayList.add(new IllegalArgumentException(h0.b("Could not find class [", str2, Constant.BRACKET_CLOSE), e5));
            }
            i10++;
        }
        jUnitCore.addListener(new TextListener(realSystem));
        Computer computer = new Computer();
        if (arrayList.isEmpty()) {
            requestErrorReport = Request.classes(computer, (Class[]) arrayList3.toArray(new Class[arrayList3.size()]));
            try {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    requestErrorReport = requestErrorReport.filterWith(a.a(requestErrorReport, (String) it.next()));
                }
            } catch (FilterFactory.FilterNotCreatedException e7) {
                requestErrorReport = Request.errorReport(JUnitCommandLineParseResult.class, e7);
            }
        } else {
            requestErrorReport = Request.errorReport(JUnitCommandLineParseResult.class, new InitializationError(arrayList));
        }
        System.exit(!jUnitCore.run(requestErrorReport).wasSuccessful() ? 1 : 0);
    }

    public static Result runClasses(Computer computer, Class<?>... clsArr) {
        return new JUnitCore().run(computer, clsArr);
    }

    public void addListener(RunListener runListener) {
        this.f91976a.addListener(runListener);
    }

    public String getVersion() {
        return Version.id();
    }

    public void removeListener(RunListener runListener) {
        this.f91976a.removeListener(runListener);
    }

    public Result run(Computer computer, Class<?>... clsArr) {
        return run(Request.classes(computer, clsArr));
    }

    public static Result runClasses(Class<?>... clsArr) {
        return runClasses(new Computer(), clsArr);
    }

    public Result run(Request request) {
        return run(request.getRunner());
    }

    public Result run(Test test) {
        return run(new JUnit38ClassRunner(test));
    }

    public Result run(Runner runner) {
        Result result = new Result();
        RunListener runListenerCreateListener = result.createListener();
        RunNotifier runNotifier = this.f91976a;
        runNotifier.addFirstListener(runListenerCreateListener);
        try {
            runNotifier.fireTestRunStarted(runner.getDescription());
            runner.run(runNotifier);
            runNotifier.fireTestRunFinished(result);
            return result;
        } finally {
            removeListener(runListenerCreateListener);
        }
    }

    public Result run(Class<?>... clsArr) {
        return run(new Computer(), clsArr);
    }
}
