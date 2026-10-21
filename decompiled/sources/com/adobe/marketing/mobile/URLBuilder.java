package com.adobe.marketing.mobile;

import androidx.collection.f;
import androidx.webkit.ProxyConfig;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class URLBuilder {
    private boolean sslEnabled = false;
    private String path = "";
    private String query = "";
    private String server = "";

    public enum EncodeType {
        NONE(1),
        ENCODE(2);

        public final int id;

        EncodeType(int i10) {
            this.id = i10;
        }
    }

    public URLBuilder addPath(String str) {
        if (str != null && str.length() != 0) {
            this.path += "/" + UrlUtilities.urlEncode(str);
        }
        return this;
    }

    public URLBuilder addQuery(String str) {
        return addQuery(str, EncodeType.ENCODE);
    }

    public URLBuilder addQueryParameter(String str, String str2) {
        if (StringUtils.isNullOrEmpty(str) || StringUtils.isNullOrEmpty(str2)) {
            return this;
        }
        return addQuery(UrlUtilities.urlEncode(str) + "=" + UrlUtilities.urlEncode(str2), EncodeType.NONE);
    }

    public URLBuilder addQueryParameters(Map<String, String> map) {
        if (map != null && map.size() != 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                addQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        return this;
    }

    public String build() {
        if (StringUtils.isNullOrEmpty(this.server)) {
            Log.error("URLBuilder", "Failed to generate the URL for (server:%s,  path:%s, query:%s)", this.server, this.path, this.query);
            return null;
        }
        String str = this.query;
        boolean z10 = str != null && str.length() > 0;
        Object[] objArr = new Object[5];
        objArr[0] = this.sslEnabled ? ProxyConfig.MATCH_HTTPS : ProxyConfig.MATCH_HTTP;
        objArr[1] = this.server;
        objArr[2] = this.path;
        objArr[3] = z10 ? "?" : "";
        objArr[4] = this.query;
        String str2 = String.format("%s://%s%s%s%s", objArr);
        try {
            new URL(str2).toURI();
            return str2;
        } catch (Exception e5) {
            Log.error("URLBuilder", "Failed to generate the URL for (server:%s,  path:%s, query:%s) (%s)", this.server, this.path, this.query, e5);
            return null;
        }
    }

    public URLBuilder enableSSL(boolean z10) {
        this.sslEnabled = z10;
        return this;
    }

    public URLBuilder setServer(String str) {
        this.server = str;
        return this;
    }

    public URLBuilder addQuery(String str, EncodeType encodeType) {
        if (str != null && str.length() != 0) {
            if (encodeType == EncodeType.ENCODE) {
                str = UrlUtilities.urlEncode(str);
            }
            String str2 = this.query;
            if (str2 == null || str2.length() == 0) {
                this.query = str;
            } else {
                this.query = f.c(new StringBuilder(), this.query, "&", str);
            }
        }
        return this;
    }
}
