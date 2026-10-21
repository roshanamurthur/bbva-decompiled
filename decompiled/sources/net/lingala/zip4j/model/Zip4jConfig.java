package net.lingala.zip4j.model;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes12.dex */
public class Zip4jConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Charset f85048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f85049b;

    public Zip4jConfig(Charset charset, int i10) {
        this.f85048a = charset;
        this.f85049b = i10;
    }

    public int getBufferSize() {
        return this.f85049b;
    }

    public Charset getCharset() {
        return this.f85048a;
    }
}
