package mk;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MathJVM.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmk/a;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f83486a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @JvmField
    public static final double f83487b = Math.log(2.0d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @JvmField
    public static final double f83488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @JvmField
    public static final double f83489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @JvmField
    public static final double f83490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @JvmField
    public static final double f83491f;

    static {
        double dSqrt = Math.sqrt(Math.ulp(1.0d));
        f83488c = dSqrt;
        double dSqrt2 = Math.sqrt(dSqrt);
        f83489d = dSqrt2;
        double d2 = 1;
        f83490e = d2 / dSqrt;
        f83491f = d2 / dSqrt2;
    }
}
