package net.lingala.zip4j.model;

import net.lingala.zip4j.headers.HeaderSignature;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ZipHeader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HeaderSignature f85068a;

    public HeaderSignature getSignature() {
        return this.f85068a;
    }

    public void setSignature(HeaderSignature headerSignature) {
        this.f85068a = headerSignature;
    }
}
