package org.hamcrest;

import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class StringDescription extends BaseDescription {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Appendable f91763a;

    public StringDescription() {
        this(new StringBuilder());
    }

    public static String asString(SelfDescribing selfDescribing) {
        return toString(selfDescribing);
    }

    public static String toString(SelfDescribing selfDescribing) {
        return new StringDescription().appendDescriptionOf(selfDescribing).toString();
    }

    @Override // org.hamcrest.BaseDescription
    public void append(String str) {
        try {
            this.f91763a.append(str);
        } catch (IOException e5) {
            throw new RuntimeException("Could not write description", e5);
        }
    }

    public StringDescription(Appendable appendable) {
        this.f91763a = appendable;
    }

    public String toString() {
        return this.f91763a.toString();
    }

    @Override // org.hamcrest.BaseDescription
    public void append(char c10) {
        try {
            this.f91763a.append(c10);
        } catch (IOException e5) {
            throw new RuntimeException("Could not write description", e5);
        }
    }
}
