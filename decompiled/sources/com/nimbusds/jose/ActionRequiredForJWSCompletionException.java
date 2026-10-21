package com.nimbusds.jose;

/* JADX INFO: loaded from: classes10.dex */
public class ActionRequiredForJWSCompletionException extends JOSEException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final JWSSignerOption f62501p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final CompletableJWSObjectSigning f62502q0;

    public ActionRequiredForJWSCompletionException(String str, JWSSignerOption jWSSignerOption, CompletableJWSObjectSigning completableJWSObjectSigning) {
        super(str);
        if (jWSSignerOption == null) {
            throw new IllegalArgumentException("The triggering option must not be null");
        }
        this.f62501p0 = jWSSignerOption;
        if (completableJWSObjectSigning == null) {
            throw new IllegalArgumentException("The completable signing must not be null");
        }
        this.f62502q0 = completableJWSObjectSigning;
    }

    public CompletableJWSObjectSigning getCompletableJWSObjectSigning() {
        return this.f62502q0;
    }

    public JWSSignerOption getTriggeringOption() {
        return this.f62501p0;
    }
}
