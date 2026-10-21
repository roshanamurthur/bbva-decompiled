package com.esotericsoftware.asm;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;

/* JADX INFO: loaded from: classes9.dex */
public final class Handle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f39921e;

    public Handle(int i10, String str, String str2, String str3) {
        this(i10, str, str2, str3, i10 == 9);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Handle)) {
            return false;
        }
        Handle handle = (Handle) obj;
        return this.f39917a == handle.f39917a && this.f39921e == handle.f39921e && this.f39918b.equals(handle.f39918b) && this.f39919c.equals(handle.f39919c) && this.f39920d.equals(handle.f39920d);
    }

    public String getDesc() {
        return this.f39920d;
    }

    public String getName() {
        return this.f39919c;
    }

    public String getOwner() {
        return this.f39918b;
    }

    public int getTag() {
        return this.f39917a;
    }

    public int hashCode() {
        return (this.f39920d.hashCode() * this.f39919c.hashCode() * this.f39918b.hashCode()) + this.f39917a + (this.f39921e ? 64 : 0);
    }

    public boolean isInterface() {
        return this.f39921e;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f39918b);
        stringBuffer.append('.');
        stringBuffer.append(this.f39919c);
        stringBuffer.append(this.f39920d);
        stringBuffer.append(" (");
        stringBuffer.append(this.f39917a);
        stringBuffer.append(this.f39921e ? " itf" : "");
        stringBuffer.append(RootService.CLOSE_BRACKET);
        return stringBuffer.toString();
    }

    public Handle(int i10, String str, String str2, String str3, boolean z10) {
        this.f39917a = i10;
        this.f39918b = str;
        this.f39919c = str2;
        this.f39920d = str3;
        this.f39921e = z10;
    }
}
