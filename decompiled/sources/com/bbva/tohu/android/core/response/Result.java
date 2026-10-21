package com.bbva.tohu.android.core.response;

import ad.d;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class Result implements Serializable {
    public static final String INTERNAL_ERROR_RESPONSE_CODE = "500";
    public static final String OK_RESPONSE_CODE = "200";
    public static final String UNAVAILABLE_ERROR_RESPONSE_CODE = "503";
    private static final long serialVersionUID = 1;
    private String code;
    private String info;

    public Result() {
    }

    public String getCode() {
        return this.code;
    }

    public String getInfo() {
        return this.info;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setInfo(String str) {
        this.info = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Result{code='");
        sb2.append(this.code);
        sb2.append("', info='");
        return d.f(sb2, this.info, "'}");
    }

    public Result(String str, String str2) {
        this.code = str;
        this.info = str2;
    }
}
