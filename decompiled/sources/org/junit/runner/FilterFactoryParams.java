package org.junit.runner;

/* JADX INFO: loaded from: classes13.dex */
public final class FilterFactoryParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Description f91971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91972b;

    public FilterFactoryParams(Description description, String str) {
        if (str == null || description == null) {
            throw null;
        }
        this.f91971a = description;
        this.f91972b = str;
    }

    public String getArgs() {
        return this.f91972b;
    }

    public Description getTopLevelDescription() {
        return this.f91971a;
    }
}
