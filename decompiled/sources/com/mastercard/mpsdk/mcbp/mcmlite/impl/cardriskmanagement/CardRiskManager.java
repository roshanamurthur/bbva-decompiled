package com.mastercard.mpsdk.mcbp.mcmlite.impl.cardriskmanagement;

import com.mastercard.mpsdk.mcbp.mcmlite.impl.cardriskmanagement.rule.Rule;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Advice;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Assessment;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Reason;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class CardRiskManager {
    public static Advice getMasterCardAdvice(List<Rule> list) {
        Assessment assessment = Assessment.AGREE;
        ArrayList arrayList = new ArrayList();
        Iterator<Rule> it = list.iterator();
        while (it.hasNext()) {
            Advice adviceCheck = it.next().check();
            Assessment assessment2 = adviceCheck.getAssessment();
            if (assessment2.getSeverityLevel() > assessment.getSeverityLevel()) {
                assessment = assessment2;
            }
            for (Reason reason : adviceCheck.getReasons()) {
                if (!arrayList.contains(reason)) {
                    arrayList.add(reason);
                }
            }
        }
        return new Advice(assessment, arrayList);
    }
}
