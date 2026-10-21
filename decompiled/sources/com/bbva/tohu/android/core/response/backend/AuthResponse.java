package com.bbva.tohu.android.core.response.backend;

import androidx.activity.a;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class AuthResponse {
    private String access_token;
    private int expires_in;
    private int refresh_expires_in;
    private String refresh_token;
    private String scope;
    private String token_type;

    public AuthResponse() {
    }

    public String getAccess_token() {
        return this.access_token;
    }

    public int getExpires_in() {
        return this.expires_in;
    }

    public int getRefresh_expires_in() {
        return this.refresh_expires_in;
    }

    public String getRefresh_token() {
        return this.refresh_token;
    }

    public String getScope() {
        return this.scope;
    }

    public String getToken_type() {
        return this.token_type;
    }

    public void setAccess_token(String str) {
        this.access_token = str;
    }

    public void setExpires_in(int i10) {
        this.expires_in = i10;
    }

    public void setRefresh_expires_in(int i10) {
        this.refresh_expires_in = i10;
    }

    public void setRefresh_token(String str) {
        this.refresh_token = str;
    }

    public void setScope(String str) {
        this.scope = str;
    }

    public void setToken_type(String str) {
        this.token_type = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AuthResponse{access_token='");
        sb2.append(this.access_token);
        sb2.append("', token_type='");
        sb2.append(this.token_type);
        sb2.append("', refresh_token='");
        sb2.append(this.refresh_token);
        sb2.append("', expires_in=");
        sb2.append(this.expires_in);
        sb2.append(", scope='");
        sb2.append(this.scope);
        sb2.append("', refresh_expires_in=");
        return a.d(sb2, this.refresh_expires_in, AbstractJsonLexerKt.END_OBJ);
    }

    public AuthResponse(String str, String str2, String str3, int i10, String str4, int i11) {
        this.access_token = str;
        this.token_type = str2;
        this.refresh_token = str3;
        this.expires_in = i10;
        this.scope = str4;
        this.refresh_expires_in = i11;
    }
}
