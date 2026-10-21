package androidx.constraintlayout.widget;

import ad.d;
import android.annotation.SuppressLint;
import androidx.camera.core.impl.utils.c;
import androidx.camera.core.processing.f;
import androidx.constraintlayout.core.Metrics;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayoutStatistics {
    public static final int DURATION_OF_CHILD_MEASURES = 5;
    public static final int DURATION_OF_LAYOUT = 7;
    public static final int DURATION_OF_MEASURES = 6;
    public static final int NUMBER_OF_CHILD_MEASURES = 4;
    public static final int NUMBER_OF_CHILD_VIEWS = 3;
    public static final int NUMBER_OF_EQUATIONS = 9;
    public static final int NUMBER_OF_LAYOUTS = 1;
    public static final int NUMBER_OF_ON_MEASURES = 2;
    public static final int NUMBER_OF_SIMPLE_EQUATIONS = 10;
    public static final int NUMBER_OF_VARIABLES = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f19751c = new String(new char[25]).replace((char) 0, ' ');

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Metrics f19752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConstraintLayout f19753b;

    public ConstraintLayoutStatistics(ConstraintLayout constraintLayout) {
        this.f19752a = new Metrics();
        attach(constraintLayout);
    }

    public static String c(DecimalFormat decimalFormat, float f6) {
        StringBuilder sbD = c.d(new String(new char[7]).replace((char) 0, ' '));
        sbD.append(decimalFormat.format(f6));
        String string = sbD.toString();
        return string.substring(string.length() - 7);
    }

    public static String d(int i10) {
        switch (i10) {
            case 1:
                return "NumberOfLayouts";
            case 2:
                return "MeasureCalls";
            case 3:
                return "ChildCount";
            case 4:
                return "ChildrenMeasures";
            case 5:
                return "MeasuresWidgetsDuration ";
            case 6:
                return "MeasureDuration";
            case 7:
                return "MeasuresLayoutDuration";
            case 8:
                return "SolverVariables";
            case 9:
                return "SolverEquations";
            case 10:
                return "SimpleEquations";
            default:
                return "";
        }
    }

    public final void a(ConstraintLayoutStatistics constraintLayoutStatistics, int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getValue(i10));
        sb2.append(" -> ");
        sb2.append(constraintLayoutStatistics.getValue(i10));
        String strF = d.f(new StringBuilder(), f19751c, d(i10));
        String strSubstring = strF.substring(strF.length() - 25);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(strSubstring);
        sb3.append(" = ");
    }

    public void attach(ConstraintLayout constraintLayout) {
        constraintLayout.fillMetrics(this.f19752a);
        this.f19753b = constraintLayout;
    }

    public final void b(DecimalFormat decimalFormat, ConstraintLayoutStatistics constraintLayoutStatistics, int i10) {
        StringBuilder sbE = f.e(c(decimalFormat, getValue(i10) * 1.0E-6f), " -> ");
        sbE.append(c(decimalFormat, constraintLayoutStatistics.getValue(i10) * 1.0E-6f));
        sbE.append("ms");
        String strF = d.f(new StringBuilder(), f19751c, d(i10));
        String strSubstring = strF.substring(strF.length() - 25);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strSubstring);
        sb2.append(" = ");
    }

    public void detach() {
        ConstraintLayout constraintLayout = this.f19753b;
        if (constraintLayout != null) {
            constraintLayout.fillMetrics(null);
        }
    }

    @SuppressLint({"LogConditional"})
    public final void e() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        stackTraceElement.getFileName();
        stackTraceElement.getLineNumber();
        DecimalFormat decimalFormat = new DecimalFormat("###.000");
        g(decimalFormat, 5);
        g(decimalFormat, 7);
        g(decimalFormat, 6);
        f(1);
        f(2);
        f(3);
        f(4);
        f(8);
        f(9);
        f(10);
    }

    public final void f(int i10) {
        Long.toString(getValue(i10));
        String strF = d.f(new StringBuilder(), f19751c, d(i10));
        String strSubstring = strF.substring(strF.length() - 25);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strSubstring);
        sb2.append(" = ");
    }

    public final void g(DecimalFormat decimalFormat, int i10) {
        c(decimalFormat, getValue(i10) * 1.0E-6f);
        String strF = d.f(new StringBuilder(), f19751c, d(i10));
        String strSubstring = strF.substring(strF.length() - 25);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strSubstring);
        sb2.append(" = ");
    }

    public long getValue(int i10) {
        int i11;
        Metrics metrics = this.f19752a;
        switch (i10) {
            case 1:
                i11 = metrics.mNumberOfLayouts;
                break;
            case 2:
                return metrics.mMeasureCalls;
            case 3:
                return metrics.mChildCount;
            case 4:
                i11 = metrics.mNumberOfMeasures;
                break;
            case 5:
                return metrics.measuresWidgetsDuration;
            case 6:
                return metrics.mMeasureDuration;
            case 7:
                return metrics.measuresLayoutDuration;
            case 8:
                return metrics.mVariables;
            case 9:
                return metrics.mEquations;
            case 10:
                return metrics.mSimpleEquations;
            default:
                return 0L;
        }
        return i11;
    }

    public void logSummary(String str) {
        e();
    }

    public void reset() {
        this.f19752a.reset();
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public ConstraintLayoutStatistics m4635clone() {
        return new ConstraintLayoutStatistics(this);
    }

    @SuppressLint({"LogConditional"})
    public void logSummary(String str, ConstraintLayoutStatistics constraintLayoutStatistics) {
        if (constraintLayoutStatistics == null) {
            e();
            return;
        }
        DecimalFormat decimalFormat = new DecimalFormat("###.000");
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        stackTraceElement.getFileName();
        stackTraceElement.getLineNumber();
        b(decimalFormat, constraintLayoutStatistics, 5);
        b(decimalFormat, constraintLayoutStatistics, 7);
        b(decimalFormat, constraintLayoutStatistics, 6);
        a(constraintLayoutStatistics, 1);
        a(constraintLayoutStatistics, 2);
        a(constraintLayoutStatistics, 3);
        a(constraintLayoutStatistics, 4);
        a(constraintLayoutStatistics, 8);
        a(constraintLayoutStatistics, 9);
        a(constraintLayoutStatistics, 10);
    }

    public ConstraintLayoutStatistics(ConstraintLayoutStatistics constraintLayoutStatistics) {
        Metrics metrics = new Metrics();
        this.f19752a = metrics;
        metrics.copy(constraintLayoutStatistics.f19752a);
    }
}
