package com.noknok.android.client.appsdk.jsonapi;

import androidx.annotation.NonNull;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.List;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes11.dex */
public class DiscoveryInfo {

    @Expose
    public List<AuthInfo> availableAuthenticators = new ArrayList();
    public List<Version> supportedUAFVersions;

    public static class Version {
        public int major;
        public int minor;

        public boolean equals(Object obj) {
            if (obj instanceof Version) {
                Version version = (Version) obj;
                if (version.major == this.major && version.minor == this.minor) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return toString().hashCode();
        }

        @NonNull
        public String toString() {
            return this.major + Constant.DOT_STRING + this.minor;
        }
    }
}
