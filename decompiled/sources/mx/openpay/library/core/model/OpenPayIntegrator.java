package mx.openpay.library.core.model;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lmx/openpay/library/core/model/OpenPayIntegrator;", "", "GLOMO", "MPOS", "POS_AUTONOMOUS", "library_release"}, k = 1, mv = {1, 8, 0})
public final class OpenPayIntegrator {
    private static final /* synthetic */ OpenPayIntegrator[] $VALUES;
    public static final OpenPayIntegrator GLOMO;
    public static final OpenPayIntegrator MPOS;
    public static final OpenPayIntegrator POS_AUTONOMOUS;

    static {
        OpenPayIntegrator openPayIntegrator = new OpenPayIntegrator("GLOMO", 0);
        GLOMO = openPayIntegrator;
        OpenPayIntegrator openPayIntegrator2 = new OpenPayIntegrator("MPOS", 1);
        MPOS = openPayIntegrator2;
        OpenPayIntegrator openPayIntegrator3 = new OpenPayIntegrator("POS_AUTONOMOUS", 2);
        POS_AUTONOMOUS = openPayIntegrator3;
        $VALUES = new OpenPayIntegrator[]{openPayIntegrator, openPayIntegrator2, openPayIntegrator3};
    }

    public OpenPayIntegrator() {
        throw null;
    }

    public static OpenPayIntegrator valueOf(String str) {
        return (OpenPayIntegrator) Enum.valueOf(OpenPayIntegrator.class, str);
    }

    public static OpenPayIntegrator[] values() {
        return (OpenPayIntegrator[]) $VALUES.clone();
    }
}
