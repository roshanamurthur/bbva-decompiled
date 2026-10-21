package com.facetec.sdk;

import android.content.Context;
import android.hardware.Camera;
import android.util.Size;
import androidx.annotation.RequiresApi;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.notifications.constants.PushConstants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import mx.openpay.library.data.util.EglobalUtils;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final List<String> f42229e = Arrays.asList("ro_kernel", "ro_product", "ro_boot", "ro_hardware", "ro_build");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static int f42225a = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f42233i = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f42232h = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f42231g = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static String f42230f = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static String f42226b = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static StringBuilder f42234j = new StringBuilder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static boolean f42227c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static String f42228d = "";

    /* JADX INFO: renamed from: com.facetec.sdk.l$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f42235d;

        static {
            int[] iArr = new int[FaceTecSDK.c.values().length];
            f42235d = iArr;
            try {
                iArr[FaceTecSDK.c.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42235d[FaceTecSDK.c.BRIGHT_LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42235d[FaceTecSDK.c.LOW_LIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42235d[FaceTecSDK.c.LOW_LIGHT_FROM_SENSOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static void a() {
        int i10 = AnonymousClass2.f42235d[FaceTecSDK.f40108c.ordinal()];
        if (i10 == 3 || i10 == 4) {
            boolean zB = new cr().b();
            ch.G(ak.V, zB ? 1 : 0);
            ch.I(ak.V, zB ? 1 : 0);
        }
    }

    public static void b() {
        ch.G(ak.f40303u, f42225a);
        ch.D(ak.f40308z, f42233i);
        ch.D(ak.C, f42232h);
        ch.D(ak.D, f42231g);
        ch.D(ak.B, f42230f);
    }

    public static void c() {
        ch.I(ak.X, f42227c ? 1 : 0);
    }

    public static void d() {
        ch.G(ak.X, f42227c ? 1 : 0);
    }

    public static void e() {
        ch.D(ak.I, String.valueOf(au.d(EglobalUtils.CONNECTION_TYPE_BLUETOOTH)));
        ch.D(ak.N, String.valueOf(au.d("RWT")));
        ch.D(ak.L, String.valueOf(au.d("CTOT")));
        ch.D(ak.J, String.valueOf(au.d("CLOT")));
        ch.D(ak.P, String.valueOf(au.d("CTCPT")));
        ch.D(ak.O, String.valueOf(au.d("CLCPT")));
        ch.D(ak.Q, String.valueOf(au.d("CTCCST")));
        ch.D(ak.S, String.valueOf(au.d("CTPRT")));
        ch.D(ak.R, String.valueOf(au.d("CTFFT")));
        ch.D(ak.W, String.valueOf(au.d("CLFFT")));
    }

    public static void f() {
        int i10 = AnonymousClass2.f42235d[FaceTecSDK.f40108c.ordinal()];
        if (i10 == 1) {
            b(0);
            return;
        }
        if (i10 == 2) {
            b(3);
        } else if (i10 == 3) {
            b(1);
        } else {
            if (i10 != 4) {
                return;
            }
            b(2);
        }
    }

    public static void g() {
        ch.D(ak.f40307y, f42228d);
        ch.J(ak.f40307y, f42228d);
    }

    @RequiresApi(api = 21)
    public static void l_(Size[] sizeArr) {
        if (f42231g.isEmpty() && bg.d()) {
            StringBuilder sb2 = new StringBuilder();
            for (Size size : sizeArr) {
                sb2.append(size.getWidth());
                sb2.append("x");
                sb2.append(size.getHeight());
                sb2.append(",");
            }
            f42231g = sb2.toString();
        }
    }

    public static void c(List<Camera.Size> list) {
        if (f42233i.isEmpty() && bg.d()) {
            StringBuilder sb2 = new StringBuilder();
            for (Camera.Size size : list) {
                sb2.append(size.width);
                sb2.append("x");
                sb2.append(size.height);
                sb2.append(",");
            }
            f42233i = sb2.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b8  */
    public static void b(Context context) {
        StringBuilder sb2 = new StringBuilder();
        Process processExec = null;
        try {
            try {
                processExec = Runtime.getRuntime().exec(RootService.GET_PROP);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                for (String line = bufferedReader.readLine(); line != null && !line.isEmpty(); line = bufferedReader.readLine()) {
                    String[] strArrSplit = line.split("]: \\[");
                    if (strArrSplit.length != 2) {
                        strArrSplit = line.split(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                    }
                    if (strArrSplit.length >= 2) {
                        String strReplace = strArrSplit[0].replace(Constant.DOT_STRING, PushConstants.GE_PARAMS_SEPARATOR).replace(Constant.BRACKET_OPEN, "");
                        String strReplace2 = strArrSplit[1].replace(Constant.BRACKET_CLOSE, "");
                        Iterator<String> it = f42229e.iterator();
                        while (it.hasNext()) {
                            if (strReplace.contains(it.next()) && !strReplace2.isEmpty()) {
                                StringBuilder sb3 = f42234j;
                                sb3.append(strReplace);
                                sb3.append(": ");
                                sb3.append(strReplace2);
                                sb3.append(", ");
                                break;
                            }
                        }
                    }
                    sb2.append(line);
                    sb2.append(RootService.LINE_BREAK);
                }
            } catch (IOException e5) {
                t.c(context, e.DEVICE_SYSTEM_PROPERTY_ANNOTATION_ERROR, "Error getting device system property: ".concat(String.valueOf(e5)));
                if (processExec != null) {
                }
                if (sb2.length() != 0) {
                    f42226b = sb2.toString();
                }
                ch.J(ak.T, f42234j.toString());
            }
            processExec.destroy();
            if (sb2.length() != 0) {
                f42226b = sb2.toString();
            }
            ch.J(ak.T, f42234j.toString());
        } catch (Throwable th2) {
            if (processExec != null) {
                processExec.destroy();
            }
            throw th2;
        }
    }

    private static void b(int i10) {
        ch.G("dlm", i10);
        ch.I("dlm", i10);
    }
}
