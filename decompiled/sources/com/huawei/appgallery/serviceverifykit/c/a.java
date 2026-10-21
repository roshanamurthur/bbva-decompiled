package com.huawei.appgallery.serviceverifykit.c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huawei.appgallery.serviceverifykit.api.ServiceVerifyKit;
import com.huawei.appgallery.serviceverifykit.d.c;
import com.huawei.appgallery.serviceverifykit.d.d.b;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f50108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f50109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f50110c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f50114g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f50118k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f50119l;
    private Intent m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ServiceVerifyKit.Builder.ComponentType f50120n;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Context f50125s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f50126t;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, String[]> f50111d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Integer> f50112e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, String> f50113f = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<String> f50115h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<ServiceVerifyKit.b> f50116i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f50117j = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f50121o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f50122p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f50123q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f50124r = 0;

    public a(Context context) {
        this.f50125s = context;
    }

    private int a(Bundle bundle, int i10) {
        if (!bundle.containsKey("ag.application.base_priority")) {
            return i10 + 1000;
        }
        try {
            return i10 + bundle.getInt("ag.application.base_priority");
        } catch (Exception unused) {
            b.f50131b.a("MatchAppFinder", "skip package " + bundle.getString("ag.application.base_priority") + " is not number");
            return i10 + 1000;
        }
    }

    private boolean b(Bundle bundle, String str, String str2, String str3, String str4) {
        b bVar;
        String str5;
        if (!bundle.containsKey(str3) || !bundle.containsKey(str4)) {
            bVar = b.f50131b;
            str5 = "skip package " + str + " for no signer or no certChain";
        } else {
            if (a(androidx.camera.core.impl.utils.a.b(str, "&", str2), bundle.getString(str3), bundle.getString(str4))) {
                return true;
            }
            bVar = b.f50131b;
            str5 = "checkSinger failed";
        }
        bVar.a("MatchAppFinder", str5);
        return false;
    }

    private int a(Bundle bundle, int i10, List<ServiceVerifyKit.b> list) {
        int i11 = 0;
        for (ServiceVerifyKit.b bVar : list) {
            if (i10 == 1) {
                if (!bundle.containsKey(bVar.a()) || !bundle.get(bVar.a()).toString().equals(bVar.b())) {
                    return 0;
                }
                i11 = 1;
            } else if (i10 != 2) {
                b.f50131b.a("MatchAppFinder", "error input preferred package name");
            } else if (bundle.containsKey(bVar.a()) && bundle.get(bVar.a()).toString().equals(bVar.b())) {
                i11++;
            }
        }
        return i11;
    }

    private int a(Bundle bundle, String str) {
        if (!bundle.containsKey(this.f50118k)) {
            return 0;
        }
        if (!bundle.getString(this.f50118k).equalsIgnoreCase(str)) {
            return -1;
        }
        b.f50131b.b("MatchAppFinder", "matchProp is 1, MetaDataKey is " + str);
        return 1;
    }

    private int a(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().equals(str)) {
                i10 = 1;
            }
        }
        return i10;
    }

    private com.huawei.appgallery.serviceverifykit.a.a a(PackageInfo packageInfo, String str, String str2, int i10) {
        Bundle bundle = packageInfo.applicationInfo.metaData;
        if (bundle == null) {
            return null;
        }
        int iA = a(bundle, this.f50126t);
        if (!a(bundle, str, str2, i10)) {
            return null;
        }
        if (!this.f50115h.isEmpty()) {
            this.f50123q = a(str2, this.f50115h);
        }
        if (!this.f50116i.isEmpty()) {
            this.f50124r = a(bundle, this.f50117j, this.f50116i);
            b bVar = b.f50131b;
            StringBuilder sbD = ci.a.d("match conditions success, packageName is ", str2, " condition type is ");
            sbD.append(this.f50117j);
            sbD.append(" condition number is ");
            sbD.append(this.f50124r);
            bVar.b("MatchAppFinder", sbD.toString());
        }
        return new com.huawei.appgallery.serviceverifykit.a.a(str2, a(bundle, this.f50121o), this.f50122p, iA, this.f50123q, this.f50124r);
    }

    private String a(ResolveInfo resolveInfo) {
        ServiceVerifyKit.Builder.ComponentType componentType = this.f50120n;
        return ((componentType == ServiceVerifyKit.Builder.ComponentType.ACTIVITY || componentType == ServiceVerifyKit.Builder.ComponentType.BROADCAST) ? resolveInfo.activityInfo.applicationInfo : resolveInfo.serviceInfo.applicationInfo).packageName;
    }

    private static String a(@NonNull String str) {
        b bVar;
        String str2;
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (ClassNotFoundException unused) {
            bVar = b.f50131b;
            str2 = "getSystemProperties ClassNotFoundException";
            bVar.a("MatchAppFinder", str2);
            return "";
        } catch (Exception unused2) {
            bVar = b.f50131b;
            str2 = "getSystemProperties Exception while getting system property";
            bVar.a("MatchAppFinder", str2);
            return "";
        }
    }

    public List<com.huawei.appgallery.serviceverifykit.a.a> a() {
        PackageManager packageManager = this.f50125s.getPackageManager();
        List<ResolveInfo> listA = a(packageManager);
        if (listA.size() == 0) {
            return null;
        }
        this.f50126t = TextUtils.isEmpty(this.f50119l) ? Build.MANUFACTURER : a(this.f50119l);
        return a(listA, packageManager, this.f50114g | 192);
    }

    private List<ResolveInfo> a(PackageManager packageManager) {
        Intent intent;
        ServiceVerifyKit.Builder.ComponentType componentType = this.f50120n;
        if (componentType == null) {
            intent = new Intent(this.f50108a);
        } else {
            if (componentType == ServiceVerifyKit.Builder.ComponentType.ACTIVITY) {
                return packageManager.queryIntentActivities(this.m, this.f50114g);
            }
            if (componentType == ServiceVerifyKit.Builder.ComponentType.BROADCAST) {
                return packageManager.queryBroadcastReceivers(this.m, this.f50114g);
            }
            intent = this.m;
        }
        return packageManager.queryIntentServices(intent, this.f50114g);
    }

    private List<com.huawei.appgallery.serviceverifykit.a.a> a(List<ResolveInfo> list, PackageManager packageManager, int i10) {
        b bVar;
        StringBuilder sb2;
        String str;
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : list) {
            String strA = a(resolveInfo);
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(strA, i10);
                if (packageInfo.applicationInfo == null) {
                    bVar = b.f50131b;
                    sb2 = new StringBuilder("skip package ");
                    sb2.append(strA);
                    str = " for ApplicationInfo is null";
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length <= 0) {
                        bVar = b.f50131b;
                        sb2 = new StringBuilder("skip package ");
                        sb2.append(strA);
                        str = " for no sign";
                    } else {
                        byte[] byteArray = signatureArr[0].toByteArray();
                        if (byteArray.length == 0) {
                            bVar = b.f50131b;
                            sb2 = new StringBuilder("skip package ");
                            sb2.append(strA);
                            str = " for sign is empty";
                        } else {
                            try {
                                com.huawei.appgallery.serviceverifykit.a.a aVarA = a(packageInfo, com.huawei.appgallery.serviceverifykit.d.b.b(MessageDigest.getInstance("SHA-256").digest(byteArray), true), strA, resolveInfo.priority);
                                if (aVarA != null) {
                                    arrayList.add(aVarA);
                                }
                            } catch (NoSuchAlgorithmException unused) {
                                bVar = b.f50131b;
                                sb2 = new StringBuilder("skip package ");
                                sb2.append(strA);
                                str = " for AlgorithmException";
                                sb2.append(str);
                                bVar.a("MatchAppFinder", sb2.toString());
                            }
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                bVar = b.f50131b;
                sb2 = new StringBuilder("skip package ");
                sb2.append(strA);
                str = " for PackageInfo is null with NameNotFoundException";
            } catch (Exception unused3) {
                bVar = b.f50131b;
                sb2 = new StringBuilder("skip package ");
                sb2.append(strA);
                str = " for PackageInfo is null with Exception";
            }
            sb2.append(str);
            bVar.a("MatchAppFinder", sb2.toString());
        }
        return arrayList;
    }

    public void a(String str, String str2, String str3, Map<String, String[]> map, Map<String, Integer> map2, int i10, List<String> list, List<ServiceVerifyKit.b> list2, int i11, String str4, String str5, Intent intent, ServiceVerifyKit.Builder.ComponentType componentType, Map<String, String> map3) {
        this.f50108a = str;
        this.f50109b = str2;
        this.f50110c = str3;
        this.f50111d = map;
        this.f50112e = map2;
        this.f50114g = i10;
        this.f50115h = list;
        this.f50116i = list2;
        this.f50117j = i11;
        this.f50118k = str4;
        this.f50119l = str5;
        this.m = intent;
        this.f50120n = componentType;
        this.f50113f = map3;
    }

    private boolean a(Bundle bundle, String str, String str2, int i10) {
        for (Map.Entry<String, String> entry : this.f50113f.entrySet()) {
            if (bundle.containsKey(entry.getKey()) || bundle.containsKey(entry.getValue())) {
                if (b(bundle, str2, str, entry.getKey(), entry.getValue())) {
                    this.f50122p = 0;
                    this.f50121o = i10;
                    return true;
                }
                b.f50131b.a("MatchAppFinder", "checkSinger failed, packageName is " + str2);
            }
        }
        if (!a(str2, str)) {
            return false;
        }
        this.f50122p = 1;
        this.f50121o = this.f50112e.get(str2).intValue();
        b.f50131b.b("MatchAppFinder", "Legacy is success, packageName is " + str2);
        return true;
    }

    public boolean a(Bundle bundle, String str, String str2, String str3, String str4) {
        b bVar;
        StringBuilder sb2;
        if (bundle == null) {
            bVar = b.f50131b;
            sb2 = new StringBuilder("package");
            sb2.append(str2);
            str2 = " metadata is null!";
        } else {
            if (bundle.containsKey(str3) && bundle.containsKey(str4) && b(bundle, str2, str, str3, str4)) {
                b.f50131b.a("MatchAppFinder", "checkSinger success, packageName is " + str2);
                return true;
            }
            bVar = b.f50131b;
            sb2 = new StringBuilder("checkSinger failed, packageName is ");
        }
        sb2.append(str2);
        bVar.a("MatchAppFinder", sb2.toString());
        return false;
    }

    public boolean a(String str, String str2) {
        String[] strArr;
        if (this.f50111d.containsKey(str) && (strArr = this.f50111d.get(str)) != null) {
            for (String str3 : strArr) {
                if (str2.equals(str3)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean a(String str, String str2, String str3) {
        b bVar;
        String str4;
        byte[] bytes;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            bVar = b.f50131b;
            str4 = "args is invalid";
        } else {
            List<X509Certificate> listB = c.b(str3);
            if (listB.size() == 0) {
                bVar = b.f50131b;
                str4 = "certChain is empty";
            } else if (c.a(c.a(this.f50125s), listB)) {
                X509Certificate x509Certificate = listB.get(0);
                if (!c.a(x509Certificate, this.f50109b)) {
                    bVar = b.f50131b;
                    str4 = "CN is invalid";
                } else if (c.b(x509Certificate, this.f50110c)) {
                    try {
                        bytes = str.getBytes("UTF-8");
                    } catch (UnsupportedEncodingException e5) {
                        b.f50131b.a("MatchAppFinder", "checkCertChain UnsupportedEncodingException:", e5);
                        bytes = null;
                    }
                    if (c.a(x509Certificate, bytes, com.huawei.appgallery.serviceverifykit.d.a.a(str2))) {
                        return true;
                    }
                    bVar = b.f50131b;
                    str4 = "signature is invalid";
                } else {
                    bVar = b.f50131b;
                    str4 = "OU is invalid";
                }
            } else {
                bVar = b.f50131b;
                str4 = "failed to verify cert chain";
            }
        }
        bVar.a("MatchAppFinder", str4);
        return false;
    }
}
