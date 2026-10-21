package net.ipsoft.amelia.sdk;

import android.content.Context;
import com.nulabinc.zxcvbn.Guess;
import java.util.ArrayList;
import net.ipsoft.amelia.sdk.internal.common.a;
import net.ipsoft.amelia.sdk.internal.common.b;

/* JADX INFO: loaded from: classes12.dex */
public class AmeliaChatBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f84516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f84517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f84518c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f84520e;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SpeechParams f84530p;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DomainSelectionMode f84519d = DomainSelectionMode.automatic;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f84521f = "en-US";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f84522g = "HAPPY";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f84523h = Guess.REFERENCE_YEAR;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f84524i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f84525j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f84526k = 40000;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f84527l = 40000;
    public int m = 40000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f84528n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f84529o = new ArrayList();

    public AmeliaChatBuilder addConversationListener(IConversationListener iConversationListener) {
        this.f84529o.add(iConversationListener);
        return this;
    }

    public AmeliaChatBuilder addSessionListener(ISessionListener iSessionListener) {
        this.f84528n.add(iSessionListener);
        return this;
    }

    public IAmeliaChat build() {
        if (this.f84516a == null) {
            throw new IllegalArgumentException("context is a required field");
        }
        if (this.f84517b == null) {
            throw new IllegalArgumentException("baseUrl is a required field");
        }
        String str = this.f84520e;
        if (str != null && this.f84519d != DomainSelectionMode.predefined) {
            throw new IllegalArgumentException("When a domain code is provided, domainSelectionMode must be set to DomainSelectionMode.predefined");
        }
        if (this.f84519d == DomainSelectionMode.predefined && str == null) {
            throw new IllegalArgumentException("When domainSelectionMode is set to DomainSelectionMode.predefined a domainCode must be supplied");
        }
        if (this.f84530p == null) {
            this.f84530p = new SpeechParams(true, false);
        }
        return new a(this.f84516a, new b(this.f84517b, null, this.f84518c, this.f84519d, this.f84520e, this.f84521f, this.f84522g, this.f84523h, this.f84524i, this.f84525j, this.f84526k, this.f84527l, this.m, this.f84528n, this.f84529o, this.f84530p));
    }

    public AmeliaChatBuilder setBaseUrl(String str) {
        this.f84517b = str;
        return this;
    }

    public AmeliaChatBuilder setConnectTimeoutMs(int i10) {
        this.f84526k = i10;
        return this;
    }

    public AmeliaChatBuilder setContext(Context context) {
        this.f84516a = context;
        return this;
    }

    public AmeliaChatBuilder setDomainCode(String str) {
        this.f84520e = str;
        return this;
    }

    public AmeliaChatBuilder setDomainSelectionMode(DomainSelectionMode domainSelectionMode) {
        this.f84519d = domainSelectionMode;
        return this;
    }

    public AmeliaChatBuilder setIgnoreCertificateErrors(boolean z10) {
        this.f84518c = z10;
        return this;
    }

    public AmeliaChatBuilder setInitialMood(String str) {
        this.f84522g = str;
        return this;
    }

    public AmeliaChatBuilder setLanguageCode(String str) {
        this.f84521f = str;
        return this;
    }

    public AmeliaChatBuilder setMinIdleTime(int i10) {
        this.f84524i = i10;
        return this;
    }

    public AmeliaChatBuilder setReadTimeoutMs(int i10) {
        this.f84527l = i10;
        return this;
    }

    public AmeliaChatBuilder setReconnectDelayMs(int i10) {
        this.f84523h = i10;
        return this;
    }

    public AmeliaChatBuilder setSpeechParams(SpeechParams speechParams) {
        this.f84530p = speechParams;
        return this;
    }

    public AmeliaChatBuilder setVarIdleTime(int i10) {
        this.f84525j = i10;
        return this;
    }

    public AmeliaChatBuilder setWriteTimeoutMs(int i10) {
        this.m = i10;
        return this;
    }
}
