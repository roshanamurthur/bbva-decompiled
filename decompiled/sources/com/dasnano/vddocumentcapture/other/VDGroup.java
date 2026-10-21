package com.dasnano.vddocumentcapture.other;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class VDGroup {
    private String mName = null;
    private String mIsoCode = null;

    public static VDGroup VDGroupFromIsoCode(String str) {
        VDGroup vDGroup = new VDGroup();
        vDGroup.mIsoCode = str;
        return vDGroup;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VDGroup vDGroup = (VDGroup) obj;
        return Objects.equals(this.mName, vDGroup.mName) && Objects.equals(this.mIsoCode, vDGroup.mIsoCode);
    }

    public String getIsoCode() {
        return this.mIsoCode;
    }

    public String getName() {
        return this.mName;
    }

    public int hashCode() {
        return Objects.hash(this.mName, this.mIsoCode);
    }

    @NonNull
    public String toString() {
        return "Country -> name: " + this.mName + ", iso code: " + this.mIsoCode;
    }
}
