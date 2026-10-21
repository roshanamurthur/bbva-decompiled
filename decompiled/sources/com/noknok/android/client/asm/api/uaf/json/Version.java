package com.noknok.android.client.asm.api.uaf.json;

import androidx.annotation.NonNull;
import com.google.gson.annotations.Expose;
import com.noknok.android.client.utils.Logger;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes11.dex */
public class Version implements Comparable<Version> {

    @Expose
    public final Short major;

    @Expose
    public final Short minor;

    public Version() {
        this.major = null;
        this.minor = null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Version) && compareTo((Version) obj) == 0;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public boolean isValid() {
        if (this.major != null && this.minor != null) {
            return true;
        }
        Logger.e("Version", "Major or minor version is incorrect.");
        return false;
    }

    @NonNull
    public String toString() {
        return this.major + Constant.DOT_STRING + this.minor;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull Version version) {
        short sShortValue;
        Short sh2;
        if (this.major.equals(version.major)) {
            sShortValue = this.minor.shortValue();
            sh2 = version.minor;
        } else {
            sShortValue = this.major.shortValue();
            sh2 = version.major;
        }
        return sShortValue - sh2.shortValue();
    }

    public Version(short s4, short s7) {
        this.major = Short.valueOf(s4);
        this.minor = Short.valueOf(s7);
    }
}
