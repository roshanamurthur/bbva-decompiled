package mx.openpay.library.domain.model;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: ProcessingStep.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lmx/openpay/library/domain/model/ProcessingStep;", "", "PROCESSED_STEP", "PAY_WITH_POINTS_STEP", "DIGITAL_SIGN_STEP", "PAY_WITH_PLANS_STEP", "domain_release"}, k = 1, mv = {1, 8, 0})
public final class ProcessingStep {
    private static final /* synthetic */ ProcessingStep[] $VALUES;
    public static final ProcessingStep DIGITAL_SIGN_STEP;
    public static final ProcessingStep PAY_WITH_PLANS_STEP;
    public static final ProcessingStep PAY_WITH_POINTS_STEP;
    public static final ProcessingStep PROCESSED_STEP;

    static {
        ProcessingStep processingStep = new ProcessingStep("PROCESSED_STEP", 0);
        PROCESSED_STEP = processingStep;
        ProcessingStep processingStep2 = new ProcessingStep("PAY_WITH_POINTS_STEP", 1);
        PAY_WITH_POINTS_STEP = processingStep2;
        ProcessingStep processingStep3 = new ProcessingStep("DIGITAL_SIGN_STEP", 2);
        DIGITAL_SIGN_STEP = processingStep3;
        ProcessingStep processingStep4 = new ProcessingStep("PAY_WITH_PLANS_STEP", 3);
        PAY_WITH_PLANS_STEP = processingStep4;
        $VALUES = new ProcessingStep[]{processingStep, processingStep2, processingStep3, processingStep4};
    }

    public ProcessingStep() {
        throw null;
    }

    public static ProcessingStep valueOf(String str) {
        return (ProcessingStep) Enum.valueOf(ProcessingStep.class, str);
    }

    public static ProcessingStep[] values() {
        return (ProcessingStep[]) $VALUES.clone();
    }
}
