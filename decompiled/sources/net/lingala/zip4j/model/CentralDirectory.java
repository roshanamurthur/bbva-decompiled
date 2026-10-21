package net.lingala.zip4j.model;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class CentralDirectory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<FileHeader> f85019a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DigitalSignature f85020b = new DigitalSignature();

    public DigitalSignature getDigitalSignature() {
        return this.f85020b;
    }

    public List<FileHeader> getFileHeaders() {
        return this.f85019a;
    }

    public void setDigitalSignature(DigitalSignature digitalSignature) {
        this.f85020b = digitalSignature;
    }

    public void setFileHeaders(List<FileHeader> list) {
        this.f85019a = list;
    }
}
