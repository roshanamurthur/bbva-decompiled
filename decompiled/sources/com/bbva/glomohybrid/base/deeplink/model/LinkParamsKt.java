package com.bbva.glomohybrid.base.deeplink.model;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.camera.core.impl.utils.a;
import bk.q;
import com.bbva.dynamiclinks.extensions.DynamicLinksExtensionsKt;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.glomohybrid.base.extensions.BundleExtensionsKt;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LinkParams.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u001a\f\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u00020\u0000\"\u0014\u0010\b\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u0014\u0010\n\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t\"\u0014\u0010\u000b\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\t\"\u0014\u0010\f\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\t\"\u0014\u0010\r\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\t\"\u0014\u0010\u000e\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\t\"\u0014\u0010\u000f\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\t\"\u0014\u0010\u0010\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\t¨\u0006\u0011"}, d2 = {"Landroid/content/Intent;", "Lcom/bbva/glomohybrid/base/deeplink/model/DeeplinkConfig;", "config", "", "callingPackage", "Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams;", "toLinkParams", "getOtherBankLink", "UNIVERSAL_KEY", "Ljava/lang/String;", "SALESFORCE_DEEPLINK_KEY", "OPERATIONAL_KEY", "PUSH_DEEPLINK_DATA_KEY", "AMPERSAND", "GOOGLE_A2A_PACKAGE", "NEED_NAVIGATE", "REDIRECT_TO_KEY", "Base_release"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLinkParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkParams.kt\ncom/bbva/glomohybrid/base/deeplink/model/LinkParamsKt\n*L\n1#1,204:1\n199#1,5:205\n*S KotlinDebug\n*F\n+ 1 LinkParams.kt\ncom/bbva/glomohybrid/base/deeplink/model/LinkParamsKt\n*L\n101#1:205,5\n*E\n"})
public final class LinkParamsKt {

    @NotNull
    public static final String AMPERSAND = "&";

    @NotNull
    public static final String GOOGLE_A2A_PACKAGE = "com.google.android.gms";

    @NotNull
    public static final String NEED_NAVIGATE = "needNavigate";

    @NotNull
    public static final String OPERATIONAL_KEY = "operational_key";

    @NotNull
    public static final String PUSH_DEEPLINK_DATA_KEY = "push_deeplink_data_key";

    @NotNull
    public static final String REDIRECT_TO_KEY = "redirectTo_key";

    @NotNull
    public static final String SALESFORCE_DEEPLINK_KEY = "salesforce_deeplink_key";

    @NotNull
    public static final String UNIVERSAL_KEY = "universal_key";

    @Nullable
    public static final LinkParams getOtherBankLink(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Uri data = intent.getData();
        if (data != null) {
            return new LinkParams.OtherBanks(DynamicLinksExtensionsKt.queryToMap(data));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x017b  */
    /* JADX WARN: Code duplicated, block: B:102:0x0184  */
    /* JADX WARN: Code duplicated, block: B:106:0x0196  */
    /* JADX WARN: Code duplicated, block: B:108:0x019e  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:142:0x022c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0246  */
    /* JADX WARN: Code duplicated, block: B:148:0x0252  */
    /* JADX WARN: Code duplicated, block: B:151:0x025e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0264  */
    /* JADX WARN: Code duplicated, block: B:156:0x0269  */
    /* JADX WARN: Code duplicated, block: B:158:0x027f  */
    /* JADX WARN: Code duplicated, block: B:159:0x0284  */
    /* JADX WARN: Code duplicated, block: B:162:0x028b  */
    /* JADX WARN: Code duplicated, block: B:163:0x0290  */
    /* JADX WARN: Code duplicated, block: B:166:0x0297  */
    /* JADX WARN: Code duplicated, block: B:174:0x02cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:175:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:64:0x0102  */
    /* JADX WARN: Code duplicated, block: B:66:0x0108  */
    /* JADX WARN: Code duplicated, block: B:67:0x010d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0116  */
    /* JADX WARN: Code duplicated, block: B:71:0x011c  */
    /* JADX WARN: Code duplicated, block: B:73:0x012a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0130  */
    /* JADX WARN: Code duplicated, block: B:76:0x0135  */
    /* JADX WARN: Code duplicated, block: B:78:0x0138  */
    /* JADX WARN: Code duplicated, block: B:92:0x0162  */
    /* JADX WARN: Code duplicated, block: B:93:0x0167  */
    /* JADX WARN: Code duplicated, block: B:95:0x0171  */
    /* JADX WARN: Code duplicated, block: B:98:0x0176  */
    /* JADX WARN: Instruction removed from duplicated block: B:108:0x019e, please report this as an issue */
    @Nullable
    public static final LinkParams toLinkParams(@NotNull Intent intent, @NotNull DeeplinkConfig config, @Nullable String str) {
        Bundle extras;
        Uri data;
        String host;
        Uri data2;
        String scheme;
        String url;
        LinkParams dynamicLink;
        Uri data3;
        String dataString;
        String path;
        String scheme2;
        String url2;
        Uri data4;
        String path2;
        Uri data5;
        String query;
        String path3;
        String fragment;
        String query2;
        Uri data6;
        String host2;
        Uri data7;
        String host3;
        Uri data8;
        DeepLinkModel deepLink$default;
        Serializable serializableExtra;
        Map map;
        Map<String, String> localArgs;
        DeepLinkModel deepLinkModelCopy$default;
        String query3;
        String strB;
        String host4;
        String query4;
        String strB2;
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        if (str != null && str.equals("com.google.android.gms")) {
            return new LinkParams.GoogleWallet(new DeepLinkModel(DeepLinkExtensionsKt.GOOGLE_WALLET_A2A_VERIFICATION, DeepLinkExtensionsKt.GOOGLE_WALLET_A2A_VERIFICATION, null, null, 12, null));
        }
        Bundle extras2 = intent.getExtras();
        LinkParams.GoogleAssistantLink googleAssistantLink = null;
        googleAssistantLink = null;
        googleAssistantLink = null;
        googleAssistantLink = null;
        googleAssistantLink = null;
        googleAssistantLink = null;
        googleAssistantLink = null;
        googleAssistantLink = null;
        googleAssistantLink = null;
        googleAssistantLink = null;
        googleAssistantLink = null;
        if (extras2 != null && extras2.containsKey(SALESFORCE_DEEPLINK_KEY)) {
            DeepLinkModel deepLinkModel = (DeepLinkModel) intent.getParcelableExtra(SALESFORCE_DEEPLINK_KEY);
            if (deepLinkModel != null) {
                dynamicLink = new LinkParams.SalesforceNotification(deepLinkModel);
                return dynamicLink;
            }
            return googleAssistantLink;
        }
        Bundle extras3 = intent.getExtras();
        if (extras3 != null && extras3.containsKey(UNIVERSAL_KEY)) {
            DeepLinkModel deepLinkModel2 = (DeepLinkModel) intent.getParcelableExtra(UNIVERSAL_KEY);
            if (deepLinkModel2 != null) {
                dynamicLink = new LinkParams.UniversalNotification(deepLinkModel2);
                return dynamicLink;
            }
            return googleAssistantLink;
        }
        Bundle extras4 = intent.getExtras();
        if ((extras4 == null || !extras4.containsKey(config.getNotificationDeepLink())) && ((extras = intent.getExtras()) == null || !extras.getBoolean(NEED_NAVIGATE))) {
            Bundle extras5 = intent.getExtras();
            if (extras5 != null && extras5.containsKey(OPERATIONAL_KEY)) {
                DeepLinkModel deepLinkModel3 = (DeepLinkModel) intent.getParcelableExtra(OPERATIONAL_KEY);
                if (deepLinkModel3 != null) {
                    dynamicLink = new LinkParams.OperationalNotification(deepLinkModel3);
                }
                return googleAssistantLink;
            }
            Uri data9 = intent.getData();
            if ((data9 != null ? data9.getHost() : null) == null) {
                data = intent.getData();
                if (data != null) {
                    host = data.getHost();
                } else {
                    host = null;
                }
                if (l.equals(host, "other_banks", true)) {
                    return getOtherBankLink(intent);
                }
                if (Intrinsics.areEqual(intent.getScheme(), config.getScheme())) {
                    data6 = intent.getData();
                    if (data6 != null) {
                        host2 = data6.getHost();
                    } else {
                        host2 = null;
                    }
                    if (host2 != null) {
                        data7 = intent.getData();
                        if (data7 != null && (host3 = data7.getHost()) != null) {
                            data8 = intent.getData();
                            if (data8 != null && (query3 = data8.getQuery()) != null && (strB = a.b(host3, "&", query3)) != null) {
                                host3 = strB;
                            }
                            deepLink$default = DeepLinkExtensionsKt.parseDeepLink$default(host3, null, 1, null);
                            if (Build.VERSION.SDK_INT >= 33) {
                                serializableExtra = intent.getSerializableExtra(PUSH_DEEPLINK_DATA_KEY, Serializable.class);
                            } else {
                                serializableExtra = intent.getSerializableExtra(PUSH_DEEPLINK_DATA_KEY);
                                if (!(serializableExtra instanceof Serializable)) {
                                    serializableExtra = null;
                                }
                            }
                            map = serializableExtra instanceof Map ? (Map) serializableExtra : null;
                            if (map != null) {
                                localArgs = deepLink$default.getLocalArgs();
                                if (localArgs == null) {
                                    localArgs = q.emptyMap();
                                }
                                deepLinkModelCopy$default = DeepLinkModel.copy$default(deepLink$default, null, null, null, q.plus(localArgs, map), 7, null);
                                if (deepLinkModelCopy$default != null) {
                                    deepLink$default = deepLinkModelCopy$default;
                                }
                            }
                            return new LinkParams.Deeplink(deepLink$default);
                        }
                    } else {
                        String path4 = config.getQrConfig().getPath();
                        data2 = intent.getData();
                        if (data2 != null) {
                            scheme = config.getGoogleAssistantConfig().getScheme();
                            url = config.getGoogleAssistantConfig().getUrl();
                            if (Intrinsics.areEqual(intent.getScheme(), scheme)) {
                                dataString = intent.getDataString();
                                if (dataString != null) {
                                    Intrinsics.checkNotNull(dataString);
                                    StringsKt__StringsKt.contains$default((CharSequence) dataString, (CharSequence) url, false, 2, (Object) null);
                                }
                                path = data3.getPath();
                                if (!(path != null || l.isBlank(path))) {
                                    scheme2 = config.getGoogleAssistantConfig().getScheme();
                                    url2 = config.getGoogleAssistantConfig().getUrl();
                                    data4 = intent.getData();
                                    if (data4 != null) {
                                        path2 = data4.getPath();
                                    } else {
                                        path2 = null;
                                    }
                                    data5 = intent.getData();
                                    if (data5 != null) {
                                        query = data5.getQuery();
                                    } else {
                                        query = null;
                                    }
                                    if (path2 == null) {
                                        if (path2 != null) {
                                            return new LinkParams.GoogleAssistantLink(DeepLinkExtensionsKt.parseGoogleAssistantDeepLink(scheme2 + "://" + url2 + path2 + "?"));
                                        }
                                    } else if (path2 != null) {
                                        return new LinkParams.GoogleAssistantLink(DeepLinkExtensionsKt.parseGoogleAssistantDeepLink(scheme2 + "://" + url2 + path2 + "?"));
                                    }
                                }
                            }
                            dynamicLink = new LinkParams.DynamicLink(intent);
                        } else {
                            scheme = config.getGoogleAssistantConfig().getScheme();
                            url = config.getGoogleAssistantConfig().getUrl();
                            if (Intrinsics.areEqual(intent.getScheme(), scheme)) {
                                dataString = intent.getDataString();
                                if (dataString != null) {
                                    Intrinsics.checkNotNull(dataString);
                                    StringsKt__StringsKt.contains$default((CharSequence) dataString, (CharSequence) url, false, 2, (Object) null);
                                }
                                path = data3.getPath();
                                if (!(path != null || l.isBlank(path))) {
                                    scheme2 = config.getGoogleAssistantConfig().getScheme();
                                    url2 = config.getGoogleAssistantConfig().getUrl();
                                    data4 = intent.getData();
                                    if (data4 != null) {
                                        path2 = data4.getPath();
                                    } else {
                                        path2 = null;
                                    }
                                    data5 = intent.getData();
                                    if (data5 != null) {
                                        query = data5.getQuery();
                                    } else {
                                        query = null;
                                    }
                                    if (path2 == null) {
                                        if (path2 != null) {
                                            return new LinkParams.GoogleAssistantLink(DeepLinkExtensionsKt.parseGoogleAssistantDeepLink(scheme2 + "://" + url2 + path2 + "?"));
                                        }
                                    } else if (path2 != null) {
                                        return new LinkParams.GoogleAssistantLink(DeepLinkExtensionsKt.parseGoogleAssistantDeepLink(scheme2 + "://" + url2 + path2 + "?"));
                                    }
                                }
                            }
                            dynamicLink = new LinkParams.DynamicLink(intent);
                        }
                    }
                } else {
                    String path5 = config.getQrConfig().getPath();
                    data2 = intent.getData();
                    if (data2 != null || (path3 = data2.getPath()) == null) {
                        scheme = config.getGoogleAssistantConfig().getScheme();
                        url = config.getGoogleAssistantConfig().getUrl();
                        if (Intrinsics.areEqual(intent.getScheme(), scheme) && (data3 = intent.getData()) != null) {
                            dataString = intent.getDataString();
                            if (dataString != null) {
                                Intrinsics.checkNotNull(dataString);
                                StringsKt__StringsKt.contains$default((CharSequence) dataString, (CharSequence) url, false, 2, (Object) null);
                            }
                            path = data3.getPath();
                            if (!(path != null || l.isBlank(path))) {
                                scheme2 = config.getGoogleAssistantConfig().getScheme();
                                url2 = config.getGoogleAssistantConfig().getUrl();
                                data4 = intent.getData();
                                if (data4 != null) {
                                    path2 = data4.getPath();
                                } else {
                                    path2 = null;
                                }
                                data5 = intent.getData();
                                if (data5 != null) {
                                    query = data5.getQuery();
                                } else {
                                    query = null;
                                }
                                if (path2 == null && !l.isBlank(path2) && query != null && !l.isBlank(query)) {
                                    googleAssistantLink = new LinkParams.GoogleAssistantLink(DeepLinkExtensionsKt.parseGoogleAssistantDeepLink(scheme2 + "://" + url2 + path2 + "?" + query));
                                } else if (path2 != null && !l.isBlank(path2)) {
                                    return new LinkParams.GoogleAssistantLink(DeepLinkExtensionsKt.parseGoogleAssistantDeepLink(scheme2 + "://" + url2 + path2 + "?"));
                                }
                            }
                        }
                        dynamicLink = new LinkParams.DynamicLink(intent);
                    } else {
                        Intrinsics.checkNotNull(path3);
                        if (!StringsKt__StringsKt.contains$default((CharSequence) path3, (CharSequence) path5, false, 2, (Object) null) || (((fragment = data2.getFragment()) == null || l.isBlank(fragment)) && ((query2 = data2.getQuery()) == null || l.isBlank(query2)))) {
                            scheme = config.getGoogleAssistantConfig().getScheme();
                            url = config.getGoogleAssistantConfig().getUrl();
                            if (Intrinsics.areEqual(intent.getScheme(), scheme)) {
                                dataString = intent.getDataString();
                                if (dataString != null) {
                                    Intrinsics.checkNotNull(dataString);
                                    StringsKt__StringsKt.contains$default((CharSequence) dataString, (CharSequence) url, false, 2, (Object) null);
                                }
                                path = data3.getPath();
                                if (!(path != null || l.isBlank(path))) {
                                    scheme2 = config.getGoogleAssistantConfig().getScheme();
                                    url2 = config.getGoogleAssistantConfig().getUrl();
                                    data4 = intent.getData();
                                    if (data4 != null) {
                                        path2 = data4.getPath();
                                    } else {
                                        path2 = null;
                                    }
                                    data5 = intent.getData();
                                    if (data5 != null) {
                                        query = data5.getQuery();
                                    } else {
                                        query = null;
                                    }
                                    if (path2 == null) {
                                        if (path2 != null) {
                                            return new LinkParams.GoogleAssistantLink(DeepLinkExtensionsKt.parseGoogleAssistantDeepLink(scheme2 + "://" + url2 + path2 + "?"));
                                        }
                                    } else if (path2 != null) {
                                        return new LinkParams.GoogleAssistantLink(DeepLinkExtensionsKt.parseGoogleAssistantDeepLink(scheme2 + "://" + url2 + path2 + "?"));
                                    }
                                }
                            }
                            dynamicLink = new LinkParams.DynamicLink(intent);
                        } else {
                            String url3 = config.getQrConfig().getUrl();
                            Uri data10 = intent.getData();
                            String fragment2 = data10 != null ? data10.getFragment() : null;
                            Uri data11 = intent.getData();
                            String query5 = data11 != null ? data11.getQuery() : null;
                            if (query5 != null && !l.isBlank(query5)) {
                                return new LinkParams.QRLink(new QRPayload(a.b(url3, "#", query5)));
                            }
                            if (fragment2 != null && !l.isBlank(fragment2)) {
                                return new LinkParams.QRLink(new QRPayload(a.b(url3, "#", fragment2)));
                            }
                        }
                    }
                }
            } else {
                Uri data12 = intent.getData();
                if (Intrinsics.areEqual(data12 != null ? data12.getAuthority() : null, config.getModoHost())) {
                    Uri data13 = intent.getData();
                    if (data13 != null && (host4 = data13.getHost()) != null) {
                        Uri data14 = intent.getData();
                        if (data14 != null && (query4 = data14.getQuery()) != null && (strB2 = a.b(host4, "&", query4)) != null) {
                            host4 = strB2;
                        }
                        return new LinkParams.Deeplink(DeepLinkExtensionsKt.parseModoDeepLink$default(host4, null, 1, null));
                    }
                } else {
                    data = intent.getData();
                    if (data != null) {
                        host = data.getHost();
                    } else {
                        host = null;
                    }
                    if (l.equals(host, "other_banks", true)) {
                        return getOtherBankLink(intent);
                    }
                    if (Intrinsics.areEqual(intent.getScheme(), config.getScheme())) {
                        String path6 = config.getQrConfig().getPath();
                        data2 = intent.getData();
                        if (data2 != null) {
                            scheme = config.getGoogleAssistantConfig().getScheme();
                            url = config.getGoogleAssistantConfig().getUrl();
                            if (Intrinsics.areEqual(intent.getScheme(), scheme)) {
                                dataString = intent.getDataString();
                                if (dataString != null) {
                                    Intrinsics.checkNotNull(dataString);
                                    StringsKt__StringsKt.contains$default((CharSequence) dataString, (CharSequence) url, false, 2, (Object) null);
                                }
                                path = data3.getPath();
                                if (!(path != null || l.isBlank(path))) {
                                    scheme2 = config.getGoogleAssistantConfig().getScheme();
                                    url2 = config.getGoogleAssistantConfig().getUrl();
                                    data4 = intent.getData();
                                    if (data4 != null) {
                                        path2 = data4.getPath();
                                    } else {
                                        path2 = null;
                                    }
                                    data5 = intent.getData();
                                    if (data5 != null) {
                                        query = data5.getQuery();
                                    } else {
                                        query = null;
                                    }
                                    if (path2 == null) {
                                        if (path2 != null) {
                                            return new LinkParams.GoogleAssistantLink(DeepLinkExtensionsKt.parseGoogleAssistantDeepLink(scheme2 + "://" + url2 + path2 + "?"));
                                        }
                                    } else if (path2 != null) {
                                        return new LinkParams.GoogleAssistantLink(DeepLinkExtensionsKt.parseGoogleAssistantDeepLink(scheme2 + "://" + url2 + path2 + "?"));
                                    }
                                }
                            }
                            dynamicLink = new LinkParams.DynamicLink(intent);
                        } else {
                            scheme = config.getGoogleAssistantConfig().getScheme();
                            url = config.getGoogleAssistantConfig().getUrl();
                            if (Intrinsics.areEqual(intent.getScheme(), scheme)) {
                                dataString = intent.getDataString();
                                if (dataString != null) {
                                    Intrinsics.checkNotNull(dataString);
                                    StringsKt__StringsKt.contains$default((CharSequence) dataString, (CharSequence) url, false, 2, (Object) null);
                                }
                                path = data3.getPath();
                                if (!(path != null || l.isBlank(path))) {
                                    scheme2 = config.getGoogleAssistantConfig().getScheme();
                                    url2 = config.getGoogleAssistantConfig().getUrl();
                                    data4 = intent.getData();
                                    if (data4 != null) {
                                        path2 = data4.getPath();
                                    } else {
                                        path2 = null;
                                    }
                                    data5 = intent.getData();
                                    if (data5 != null) {
                                        query = data5.getQuery();
                                    } else {
                                        query = null;
                                    }
                                    if (path2 == null) {
                                        if (path2 != null) {
                                            return new LinkParams.GoogleAssistantLink(DeepLinkExtensionsKt.parseGoogleAssistantDeepLink(scheme2 + "://" + url2 + path2 + "?"));
                                        }
                                    } else if (path2 != null) {
                                        return new LinkParams.GoogleAssistantLink(DeepLinkExtensionsKt.parseGoogleAssistantDeepLink(scheme2 + "://" + url2 + path2 + "?"));
                                    }
                                }
                            }
                            dynamicLink = new LinkParams.DynamicLink(intent);
                        }
                    } else {
                        data6 = intent.getData();
                        if (data6 != null) {
                            host2 = data6.getHost();
                        } else {
                            host2 = null;
                        }
                        if (host2 != null) {
                            data7 = intent.getData();
                            if (data7 != null) {
                                data8 = intent.getData();
                                if (data8 != null) {
                                    host3 = strB;
                                }
                                deepLink$default = DeepLinkExtensionsKt.parseDeepLink$default(host3, null, 1, null);
                                if (Build.VERSION.SDK_INT >= 33) {
                                    serializableExtra = intent.getSerializableExtra(PUSH_DEEPLINK_DATA_KEY, Serializable.class);
                                } else {
                                    serializableExtra = intent.getSerializableExtra(PUSH_DEEPLINK_DATA_KEY);
                                    if (!(serializableExtra instanceof Serializable)) {
                                        serializableExtra = null;
                                    }
                                }
                                if (serializableExtra instanceof Map) {
                                }
                                if (map != null) {
                                    localArgs = deepLink$default.getLocalArgs();
                                    if (localArgs == null) {
                                        localArgs = q.emptyMap();
                                    }
                                    deepLinkModelCopy$default = DeepLinkModel.copy$default(deepLink$default, null, null, null, q.plus(localArgs, map), 7, null);
                                    if (deepLinkModelCopy$default != null) {
                                        deepLink$default = deepLinkModelCopy$default;
                                    }
                                }
                                return new LinkParams.Deeplink(deepLink$default);
                            }
                        } else {
                            String path7 = config.getQrConfig().getPath();
                            data2 = intent.getData();
                            if (data2 != null) {
                                scheme = config.getGoogleAssistantConfig().getScheme();
                                url = config.getGoogleAssistantConfig().getUrl();
                                if (Intrinsics.areEqual(intent.getScheme(), scheme)) {
                                    dataString = intent.getDataString();
                                    if (dataString != null) {
                                        Intrinsics.checkNotNull(dataString);
                                        StringsKt__StringsKt.contains$default((CharSequence) dataString, (CharSequence) url, false, 2, (Object) null);
                                    }
                                    path = data3.getPath();
                                    if (!(path != null || l.isBlank(path))) {
                                        scheme2 = config.getGoogleAssistantConfig().getScheme();
                                        url2 = config.getGoogleAssistantConfig().getUrl();
                                        data4 = intent.getData();
                                        if (data4 != null) {
                                            path2 = data4.getPath();
                                        } else {
                                            path2 = null;
                                        }
                                        data5 = intent.getData();
                                        if (data5 != null) {
                                            query = data5.getQuery();
                                        } else {
                                            query = null;
                                        }
                                        if (path2 == null) {
                                            if (path2 != null) {
                                                return new LinkParams.GoogleAssistantLink(DeepLinkExtensionsKt.parseGoogleAssistantDeepLink(scheme2 + "://" + url2 + path2 + "?"));
                                            }
                                        } else if (path2 != null) {
                                            return new LinkParams.GoogleAssistantLink(DeepLinkExtensionsKt.parseGoogleAssistantDeepLink(scheme2 + "://" + url2 + path2 + "?"));
                                        }
                                    }
                                }
                                dynamicLink = new LinkParams.DynamicLink(intent);
                            } else {
                                scheme = config.getGoogleAssistantConfig().getScheme();
                                url = config.getGoogleAssistantConfig().getUrl();
                                if (Intrinsics.areEqual(intent.getScheme(), scheme)) {
                                    dataString = intent.getDataString();
                                    if (dataString != null) {
                                        Intrinsics.checkNotNull(dataString);
                                        StringsKt__StringsKt.contains$default((CharSequence) dataString, (CharSequence) url, false, 2, (Object) null);
                                    }
                                    path = data3.getPath();
                                    if (!(path != null || l.isBlank(path))) {
                                        scheme2 = config.getGoogleAssistantConfig().getScheme();
                                        url2 = config.getGoogleAssistantConfig().getUrl();
                                        data4 = intent.getData();
                                        if (data4 != null) {
                                            path2 = data4.getPath();
                                        } else {
                                            path2 = null;
                                        }
                                        data5 = intent.getData();
                                        if (data5 != null) {
                                            query = data5.getQuery();
                                        } else {
                                            query = null;
                                        }
                                        if (path2 == null) {
                                            if (path2 != null) {
                                                return new LinkParams.GoogleAssistantLink(DeepLinkExtensionsKt.parseGoogleAssistantDeepLink(scheme2 + "://" + url2 + path2 + "?"));
                                            }
                                        } else if (path2 != null) {
                                            return new LinkParams.GoogleAssistantLink(DeepLinkExtensionsKt.parseGoogleAssistantDeepLink(scheme2 + "://" + url2 + path2 + "?"));
                                        }
                                    }
                                }
                                dynamicLink = new LinkParams.DynamicLink(intent);
                            }
                        }
                    }
                }
            }
            return googleAssistantLink;
        }
        dynamicLink = new LinkParams.NoCommercialDeepLink(BundleExtensionsKt.toHashMap(intent.getExtras()));
        return dynamicLink;
    }
}
