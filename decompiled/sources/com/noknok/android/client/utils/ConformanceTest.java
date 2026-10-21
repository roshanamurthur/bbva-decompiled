package com.noknok.android.client.utils;

import android.content.Context;
import android.util.Base64;
import com.noknok.android.uaf.asmcore.TLVCommandEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes11.dex */
public final class ConformanceTest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f63431a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Short, String> f63432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicLong f63433c;

    public enum MessageType {
        Req,
        Resp
    }

    public enum Module {
        Uaf,
        Asm,
        Authnr
    }

    static {
        HashMap map = new HashMap();
        f63432b = map;
        map.put(Short.valueOf(TLVCommandEncoder.Commands.GET_INFO), "GetInfo");
        map.put(Short.valueOf(TLVCommandEncoder.Commands.REGISTER), "Register");
        map.put(Short.valueOf(TLVCommandEncoder.Commands.SIGN), "Sign");
        map.put(Short.valueOf(TLVCommandEncoder.Commands.DEREGISTER), "Deregister");
        map.put(Short.valueOf(TLVCommandEncoder.Commands.SETTINGS), "Settings");
        map.put((short) 13319, "Manage");
        map.put(Short.valueOf(TLVCommandEncoder.Commands.ADD_AUTHNR), "AddAuthnr");
        f63433c = new AtomicLong(System.currentTimeMillis());
    }

    private static String a(Module module, String str) {
        return String.format("%s.%s.%x", module, str, Long.valueOf(f63433c.incrementAndGet()));
    }

    public static void init(Context context) {
        f63431a = AppSDKConfig.getInstance(context).get(AppSDKConfig.Key.conformanceTestEnabled).getAsBoolean();
    }

    public static String logAsmRequest(String str, String str2) {
        if (!f63431a) {
            return null;
        }
        String strA = a(Module.Asm, str);
        Logger.v(a(strA, MessageType.Req), str2);
        return strA;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.Short, java.lang.String>] */
    public static String logAuthnrRequest(short s4, byte[] bArr) {
        if (!f63431a) {
            return null;
        }
        Module module = Module.Authnr;
        String str = (String) f63432b.get(Short.valueOf(s4));
        if (str == null) {
            str = String.format("%04x", Short.valueOf(s4));
        }
        String strA = a(module, str);
        Logger.v(a(strA, MessageType.Req), Base64.encodeToString(bArr, 11));
        return strA;
    }

    public static void logResponse(String str, String str2) {
        if (f63431a) {
            Logger.v(a(str, MessageType.Resp), str2);
        }
    }

    public static String logUafRequest(String str, String str2) {
        if (!f63431a) {
            return null;
        }
        String strA = a(Module.Uaf, str);
        Logger.v(a(strA, MessageType.Req), str2);
        return strA;
    }

    private static String a(String str, MessageType messageType) {
        return String.format("%s.%s.%s", "ConformanceTest", str, messageType);
    }

    public static void logResponse(String str, byte[] bArr) {
        logResponse(str, Base64.encodeToString(bArr, 11));
    }
}
