package com.bbva.network.constant;

import com.salesforce.marketingcloud.sfmcsdk.components.http.Request;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Method.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/network/constant/Method;", "", "GET", "POST", Request.PUT, "PATCH", "HEAD", "DELETE", "network_release"}, k = 1, mv = {1, 8, 0})
public final class Method {
    private static final /* synthetic */ Method[] $VALUES;
    public static final Method DELETE;
    public static final Method GET;
    public static final Method HEAD;
    public static final Method PATCH;
    public static final Method POST;
    public static final Method PUT;

    static {
        Method method = new Method("GET", 0);
        GET = method;
        Method method2 = new Method("POST", 1);
        POST = method2;
        Method method3 = new Method(Request.PUT, 2);
        PUT = method3;
        Method method4 = new Method("PATCH", 3);
        PATCH = method4;
        Method method5 = new Method("HEAD", 4);
        HEAD = method5;
        Method method6 = new Method("DELETE", 5);
        DELETE = method6;
        $VALUES = new Method[]{method, method2, method3, method4, method5, method6};
    }

    public Method() {
        throw null;
    }

    public static Method valueOf(String str) {
        return (Method) Enum.valueOf(Method.class, str);
    }

    public static Method[] values() {
        return (Method[]) $VALUES.clone();
    }
}
