package net.ipsoft.amelia.sdk.internal.common;

import java.util.List;
import net.ipsoft.amelia.sdk.DomainSelectionMode;
import net.ipsoft.amelia.sdk.IConversationListener;
import net.ipsoft.amelia.sdk.ISessionListener;
import net.ipsoft.amelia.sdk.SpeechParams;

/* JADX INFO: loaded from: classes12.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f84829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f84830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f84831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DomainSelectionMode f84832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f84833h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f84834i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f84835j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f84836k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f84837l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SpeechParams f84838n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<ISessionListener> f84839o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List<IConversationListener> f84840p;

    public b(String str, k kVar, boolean z10, DomainSelectionMode domainSelectionMode, String str2, String str3, String str4, int i10, int i11, int i12, int i13, int i14, int i15, List<ISessionListener> list, List<IConversationListener> list2, SpeechParams speechParams) {
        this.f84826a = str;
        this.f84830e = kVar;
        this.f84832g = domainSelectionMode;
        this.f84827b = str2;
        this.f84828c = str3;
        this.f84829d = str4;
        this.f84833h = i10;
        this.f84834i = i11;
        this.f84835j = i12;
        this.f84836k = i13;
        this.f84837l = i14;
        this.m = i15;
        this.f84839o = list;
        this.f84840p = list2;
        this.f84838n = speechParams;
        this.f84831f = z10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ baseUrl: ");
        sb2.append(this.f84826a);
        sb2.append(", domainSelectionMode: ");
        sb2.append(this.f84832g);
        sb2.append(", domainCode: ");
        sb2.append(this.f84827b);
        sb2.append(", languageCode: ");
        sb2.append(this.f84828c);
        sb2.append(", initialMood: ");
        sb2.append(this.f84829d);
        sb2.append(", reconnectDelayMs: ");
        sb2.append(this.f84833h);
        sb2.append(", minIdleTime: ");
        sb2.append(this.f84834i);
        sb2.append(", varIdleTime: ");
        sb2.append(this.f84835j);
        sb2.append(", speechParams: ");
        sb2.append(this.f84838n);
        sb2.append("ignoreCertificateErrors: ");
        sb2.append(this.f84831f);
        sb2.append("connectTimeout: ");
        sb2.append(this.f84836k);
        sb2.append("readTimeout: ");
        sb2.append(this.f84837l);
        sb2.append("writeTimeout: ");
        return androidx.appcompat.widget.a.c(sb2, this.m, " }");
    }
}
