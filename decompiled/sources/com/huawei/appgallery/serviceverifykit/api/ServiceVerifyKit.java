package com.huawei.appgallery.serviceverifykit.api;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class ServiceVerifyKit {

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f50082a;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Context f50092k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f50093l;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Intent f50095o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private ComponentType f50096p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private String f50098r;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f50083b = "AppGallery Verification";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f50084c = "Huawei CBG Cloud Security Signer";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f50085d = "com.huawei.appgallery.fingerprint_signature";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f50086e = "com.huawei.appgallery.sign_certchain";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map<String, String[]> f50087f = new HashMap();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Map<String, String> f50088g = new HashMap();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Map<String, Integer> f50089h = new HashMap();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List<String> f50090i = new ArrayList();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List<b> f50091j = new ArrayList();
        private int m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f50094n = 0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private String f50097q = "verify_match_property";

        public enum ComponentType {
            ACTIVITY,
            SERVICE,
            BROADCAST
        }

        public Builder addExtraCertSignerAndChain(String str, String str2) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("ServiceVerifyKit", "error input certSignerKey and certChainKey");
            } else {
                this.f50088g.put(str, str2);
            }
            return this;
        }

        public Builder addLegacyInfo(String str, String str2) {
            this.f50087f.put(str, ServiceVerifyKit.b(this.f50087f.get(str), str2));
            this.f50089h.put(str, Integer.valueOf(this.m));
            return this;
        }

        public Builder addMatchProperty(String str) {
            if (TextUtils.isEmpty(str)) {
                com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("ServiceVerifyKit", "error input propertyName");
            } else {
                this.f50098r = str;
            }
            return this;
        }

        public String genVerifiedPackageName() {
            ServiceVerifyKit serviceVerifyKit = new ServiceVerifyKit();
            com.huawei.appgallery.serviceverifykit.c.a aVar = new com.huawei.appgallery.serviceverifykit.c.a(this.f50092k);
            this.f50088g.put(this.f50085d, this.f50086e);
            aVar.a(this.f50082a, this.f50083b, this.f50084c, this.f50087f, this.f50089h, this.f50093l, this.f50090i, this.f50091j, this.f50094n, this.f50097q, this.f50098r, this.f50095o, this.f50096p, this.f50088g);
            return serviceVerifyKit.a(aVar);
        }

        public Builder setCN(String str) {
            if (TextUtils.isEmpty(str)) {
                com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("ServiceVerifyKit", "error input CN");
            } else {
                this.f50083b = str;
            }
            return this;
        }

        public Builder setCertChainKey(String str) {
            if (TextUtils.isEmpty(str)) {
                com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("ServiceVerifyKit", "error input chain key");
            } else {
                this.f50086e = str;
            }
            return this;
        }

        public Builder setCertSignerKey(String str) {
            if (TextUtils.isEmpty(str)) {
                com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("ServiceVerifyKit", "error input signer key");
            } else {
                this.f50085d = str;
            }
            return this;
        }

        public Builder setConditions(int i10, b... bVarArr) {
            if (bVarArr.length != 0) {
                this.f50094n = i10;
                Collections.addAll(this.f50091j, bVarArr);
            } else {
                com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("ServiceVerifyKit", "error input conditions");
            }
            return this;
        }

        public Builder setContext(Context context) {
            this.f50092k = context.getApplicationContext();
            return this;
        }

        public Builder setFlag(int i10) {
            this.f50093l = i10;
            return this;
        }

        public Builder setMatchMetaDataKey(String str) {
            if (TextUtils.isEmpty(str)) {
                com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("ServiceVerifyKit", "error input propertyKey");
            } else {
                this.f50097q = str;
            }
            return this;
        }

        public Builder setOU(String str) {
            if (TextUtils.isEmpty(str)) {
                com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("ServiceVerifyKit", "error input OU");
            } else {
                this.f50084c = str;
            }
            return this;
        }

        public Builder setPreferredPkgs(List<String> list) {
            if (list.isEmpty()) {
                com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("ServiceVerifyKit", "error input preferred package name");
            } else {
                this.f50090i = list;
            }
            return this;
        }

        @Deprecated
        public Builder setServiceName(String str) {
            this.f50082a = str;
            return this;
        }

        public Builder setTargetComponent(Intent intent, ComponentType componentType) {
            if (intent == null) {
                com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("ServiceVerifyKit", "error input intent");
            } else {
                this.f50095o = intent;
            }
            if (componentType == null) {
                com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("ServiceVerifyKit", "error input type");
            } else {
                this.f50096p = componentType;
            }
            return this;
        }

        public Builder addLegacyInfo(String str, String str2, int i10) {
            this.f50087f.put(str, ServiceVerifyKit.b(this.f50087f.get(str), str2));
            this.f50089h.put(str, Integer.valueOf(i10));
            return this;
        }
    }

    public static final class PkgVerifyBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f50099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f50100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f50101c = "AppGallery Verification";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f50102d = "Huawei CBG Cloud Security Signer";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f50103e = "com.huawei.appgallery.fingerprint_signature";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f50104f = "com.huawei.appgallery.sign_certchain";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Map<String, String[]> f50105g = new HashMap();

        public PkgVerifyBuilder(Context context) {
            this.f50099a = context;
        }

        public PkgVerifyBuilder addLegacyInfo(String str, String str2) {
            this.f50105g.put(str, ServiceVerifyKit.b(this.f50105g.get(str), str2));
            return this;
        }

        public boolean isValidPkg() {
            if (TextUtils.isEmpty(this.f50100b)) {
                com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("ServiceVerifyKit", "PackageName is null or empty!");
                return false;
            }
            try {
                PackageInfo packageInfo = this.f50099a.getPackageManager().getPackageInfo(this.f50100b, 192);
                if (packageInfo.applicationInfo == null) {
                    com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("ServiceVerifyKit", "skip package " + this.f50100b + " for ApplicationInfo is null");
                    return false;
                }
                Signature[] signatureArr = packageInfo.signatures;
                if (signatureArr == null || signatureArr.length <= 0) {
                    com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("ServiceVerifyKit", "skip package " + this.f50100b + " for no sign");
                    return false;
                }
                byte[] byteArray = signatureArr[0].toByteArray();
                if (byteArray.length == 0) {
                    com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("ServiceVerifyKit", "skip package " + this.f50100b + " for sign is empty");
                    return false;
                }
                try {
                    String strB = com.huawei.appgallery.serviceverifykit.d.b.b(MessageDigest.getInstance("SHA-256").digest(byteArray), true);
                    Bundle bundle = packageInfo.applicationInfo.metaData;
                    if (bundle != null) {
                        com.huawei.appgallery.serviceverifykit.c.a aVar = new com.huawei.appgallery.serviceverifykit.c.a(this.f50099a);
                        HashMap map = new HashMap();
                        map.put(this.f50103e, this.f50104f);
                        aVar.a(null, this.f50101c, this.f50102d, this.f50105g, null, 0, null, null, 0, null, null, null, null, map);
                        return aVar.a(bundle, strB, this.f50100b, this.f50103e, this.f50104f) || aVar.a(this.f50100b, strB);
                    }
                    com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("ServiceVerifyKit", "package" + this.f50100b + " metadata is null!");
                    return false;
                } catch (NoSuchAlgorithmException unused) {
                    com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("ServiceVerifyKit", "skip package " + this.f50100b + " for AlgorithmException");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("ServiceVerifyKit", "get packageInfo from " + this.f50100b + " with NameNotFoundException");
                return false;
            } catch (Exception unused3) {
                com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("ServiceVerifyKit", "get packageInfo from " + this.f50100b + " with exception");
                return false;
            }
        }

        public PkgVerifyBuilder setCN(String str) {
            if (TextUtils.isEmpty(str)) {
                com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("ServiceVerifyKit", "error input cn");
            } else {
                this.f50101c = str;
            }
            return this;
        }

        public PkgVerifyBuilder setCertChainKey(String str) {
            if (TextUtils.isEmpty(str)) {
                com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("ServiceVerifyKit", "error input certChainKey");
            } else {
                this.f50104f = str;
            }
            return this;
        }

        public PkgVerifyBuilder setCertSignerKey(String str) {
            if (TextUtils.isEmpty(str)) {
                com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("ServiceVerifyKit", "error input certSignerKey");
            } else {
                this.f50103e = str;
            }
            return this;
        }

        public PkgVerifyBuilder setOU(String str) {
            if (TextUtils.isEmpty(str)) {
                com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("ServiceVerifyKit", "error input ou");
            } else {
                this.f50102d = str;
            }
            return this;
        }

        public PkgVerifyBuilder setPackageName(String str) {
            if (TextUtils.isEmpty(str)) {
                com.huawei.appgallery.serviceverifykit.d.d.b.f50131b.a("ServiceVerifyKit", "error input packageName");
            } else {
                this.f50100b = str;
            }
            return this;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f50106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f50107b;

        public String a() {
            return this.f50106a;
        }

        public String b() {
            return this.f50107b;
        }
    }

    private ServiceVerifyKit() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String[] b(String[] strArr, String str) {
        if (strArr == null) {
            return new String[]{str};
        }
        int length = strArr.length;
        for (String str2 : strArr) {
            if (TextUtils.equals(str2, str)) {
                return strArr;
            }
        }
        String[] strArr2 = new String[length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, length);
        strArr2[length] = str;
        return strArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(com.huawei.appgallery.serviceverifykit.c.a aVar) {
        List<com.huawei.appgallery.serviceverifykit.a.a> listA = aVar.a();
        if (listA == null || listA.isEmpty()) {
            return null;
        }
        return new com.huawei.appgallery.serviceverifykit.b.a().a(listA);
    }
}
