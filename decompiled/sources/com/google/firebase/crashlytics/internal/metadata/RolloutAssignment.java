package com.google.firebase.crashlytics.internal.metadata;

import com.google.auto.value.AutoValue;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;

/* JADX INFO: loaded from: classes10.dex */
@AutoValue
@Encodable
public abstract class RolloutAssignment {
    public static final DataEncoder ROLLOUT_ASSIGNMENT_JSON_ENCODER = new JsonDataEncoderBuilder().configureWith(AutoRolloutAssignmentEncoder.CONFIG).build();

    public static RolloutAssignment create(String str, String str2, String str3, String str4, long j10) {
        if (str3.length() > 256) {
            str3 = str3.substring(0, 256);
        }
        return new yf.a(str, str2, str3, str4, j10);
    }

    public abstract String getParameterKey();

    public abstract String getParameterValue();

    public abstract String getRolloutId();

    public abstract long getTemplateVersion();

    public abstract String getVariantId();

    public CrashlyticsReport.Session.Event.RolloutAssignment toReportProto() {
        return CrashlyticsReport.Session.Event.RolloutAssignment.builder().setRolloutVariant(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.builder().setVariantId(getVariantId()).setRolloutId(getRolloutId()).build()).setParameterKey(getParameterKey()).setParameterValue(getParameterValue()).setTemplateVersion(getTemplateVersion()).build();
    }
}
