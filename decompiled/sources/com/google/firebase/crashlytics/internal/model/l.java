package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
/* JADX INFO: loaded from: classes10.dex */
public final class l extends CrashlyticsReport.Session.Event.Application {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.Application.Execution f48162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<CrashlyticsReport.CustomAttribute> f48163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<CrashlyticsReport.CustomAttribute> f48164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f48165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails f48166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<CrashlyticsReport.Session.Event.Application.ProcessDetails> f48167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f48168g;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
    public static final class a extends CrashlyticsReport.Session.Event.Application.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CrashlyticsReport.Session.Event.Application.Execution f48169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<CrashlyticsReport.CustomAttribute> f48170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<CrashlyticsReport.CustomAttribute> f48171c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f48172d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CrashlyticsReport.Session.Event.Application.ProcessDetails f48173e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List<CrashlyticsReport.Session.Event.Application.ProcessDetails> f48174f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Integer f48175g;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application build() {
            String strConcat = this.f48169a == null ? " execution" : "";
            if (this.f48175g == null) {
                strConcat = strConcat.concat(" uiOrientation");
            }
            if (strConcat.isEmpty()) {
                return new l(this.f48169a, this.f48170b, this.f48171c, this.f48172d, this.f48173e, this.f48174f, this.f48175g.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder setAppProcessDetails(@Nullable List<CrashlyticsReport.Session.Event.Application.ProcessDetails> list) {
            this.f48174f = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder setBackground(@Nullable Boolean bool) {
            this.f48172d = bool;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder setCurrentProcessDetails(@Nullable CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails) {
            this.f48173e = processDetails;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder setCustomAttributes(List<CrashlyticsReport.CustomAttribute> list) {
            this.f48170b = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder setExecution(CrashlyticsReport.Session.Event.Application.Execution execution) {
            if (execution == null) {
                throw new NullPointerException("Null execution");
            }
            this.f48169a = execution;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder setInternalKeys(List<CrashlyticsReport.CustomAttribute> list) {
            this.f48171c = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder setUiOrientation(int i10) {
            this.f48175g = Integer.valueOf(i10);
            return this;
        }
    }

    public l() {
        throw null;
    }

    public l(CrashlyticsReport.Session.Event.Application.Execution execution, List list, List list2, Boolean bool, CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails, List list3, int i10) {
        this.f48162a = execution;
        this.f48163b = list;
        this.f48164c = list2;
        this.f48165d = bool;
        this.f48166e = processDetails;
        this.f48167f = list3;
        this.f48168g = i10;
    }

    public final boolean equals(Object obj) {
        List<CrashlyticsReport.CustomAttribute> list;
        List<CrashlyticsReport.CustomAttribute> list2;
        Boolean bool;
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails;
        List<CrashlyticsReport.Session.Event.Application.ProcessDetails> list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application application = (CrashlyticsReport.Session.Event.Application) obj;
        return this.f48162a.equals(application.getExecution()) && ((list = this.f48163b) != null ? list.equals(application.getCustomAttributes()) : application.getCustomAttributes() == null) && ((list2 = this.f48164c) != null ? list2.equals(application.getInternalKeys()) : application.getInternalKeys() == null) && ((bool = this.f48165d) != null ? bool.equals(application.getBackground()) : application.getBackground() == null) && ((processDetails = this.f48166e) != null ? processDetails.equals(application.getCurrentProcessDetails()) : application.getCurrentProcessDetails() == null) && ((list3 = this.f48167f) != null ? list3.equals(application.getAppProcessDetails()) : application.getAppProcessDetails() == null) && this.f48168g == application.getUiOrientation();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    @Nullable
    public final List<CrashlyticsReport.Session.Event.Application.ProcessDetails> getAppProcessDetails() {
        return this.f48167f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    @Nullable
    public final Boolean getBackground() {
        return this.f48165d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    @Nullable
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails getCurrentProcessDetails() {
        return this.f48166e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    @Nullable
    public final List<CrashlyticsReport.CustomAttribute> getCustomAttributes() {
        return this.f48163b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    @NonNull
    public final CrashlyticsReport.Session.Event.Application.Execution getExecution() {
        return this.f48162a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    @Nullable
    public final List<CrashlyticsReport.CustomAttribute> getInternalKeys() {
        return this.f48164c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final int getUiOrientation() {
        return this.f48168g;
    }

    public final int hashCode() {
        int iHashCode = (this.f48162a.hashCode() ^ 1000003) * 1000003;
        List<CrashlyticsReport.CustomAttribute> list = this.f48163b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<CrashlyticsReport.CustomAttribute> list2 = this.f48164c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f48165d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = this.f48166e;
        int iHashCode5 = (iHashCode4 ^ (processDetails == null ? 0 : processDetails.hashCode())) * 1000003;
        List<CrashlyticsReport.Session.Event.Application.ProcessDetails> list3 = this.f48167f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f48168g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final CrashlyticsReport.Session.Event.Application.Builder toBuilder() {
        a aVar = new a();
        aVar.f48169a = getExecution();
        aVar.f48170b = getCustomAttributes();
        aVar.f48171c = getInternalKeys();
        aVar.f48172d = getBackground();
        aVar.f48173e = getCurrentProcessDetails();
        aVar.f48174f = getAppProcessDetails();
        aVar.f48175g = Integer.valueOf(getUiOrientation());
        return aVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.f48162a);
        sb2.append(", customAttributes=");
        sb2.append(this.f48163b);
        sb2.append(", internalKeys=");
        sb2.append(this.f48164c);
        sb2.append(", background=");
        sb2.append(this.f48165d);
        sb2.append(", currentProcessDetails=");
        sb2.append(this.f48166e);
        sb2.append(", appProcessDetails=");
        sb2.append(this.f48167f);
        sb2.append(", uiOrientation=");
        return androidx.appcompat.widget.a.c(sb2, this.f48168g, "}");
    }
}
