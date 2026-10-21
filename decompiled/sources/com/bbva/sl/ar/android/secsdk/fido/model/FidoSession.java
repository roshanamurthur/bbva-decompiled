package com.bbva.sl.ar.android.secsdk.fido.model;

import com.bbva.sl.ar.android.secsdk.fido.tools.FidoConfig;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class FidoSession {
    private String country;
    private String policy;
    private String userId;

    public FidoSession(String str, String str2) {
        this.country = (String) FidoConfig.getProperty(FidoConfig.Property.TENANT);
        this.userId = str;
        this.policy = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FidoSession.class != obj.getClass()) {
            return false;
        }
        FidoSession fidoSession = (FidoSession) obj;
        if (Objects.equals(this.userId, fidoSession.userId) && Objects.equals(this.country, fidoSession.country)) {
            return Objects.equals(this.policy, fidoSession.policy);
        }
        return false;
    }

    public String getCountry() {
        return this.country;
    }

    public String getPolicy() {
        return this.policy;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Objects.hash(this.userId, this.country, this.policy);
    }

    public boolean isEmpty() {
        String str;
        String str2;
        String str3 = this.userId;
        return (str3 == null || str3.isEmpty()) && ((str = this.country) == null || str.isEmpty()) && ((str2 = this.policy) == null || str2.isEmpty());
    }

    public boolean isFilled() {
        String str;
        String str2;
        String str3 = this.userId;
        return (str3 == null || str3.isEmpty() || (str = this.country) == null || str.isEmpty() || (str2 = this.policy) == null || str2.isEmpty()) ? false : true;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public FidoSession(String str, String str2, String str3) {
        this.userId = str;
        this.country = str2;
        this.policy = str3;
    }
}
