package com.veridas.fragment.requirement;

/* JADX INFO: loaded from: classes11.dex */
public interface HardwareRequirementListener {
    void onHardwareRequirementFailed(Object obj, String str);

    void onHardwareRequirementMet(Object obj, String str);

    void onHardwareRequirementsFailed(Object obj);

    void onHardwareRequirementsMet(Object obj);
}
