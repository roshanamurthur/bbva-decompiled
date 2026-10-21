package com.google.zxing.pdf417;

/* JADX INFO: loaded from: classes10.dex */
public final class PDF417ResultMetadata {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f49986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f49987c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f49989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f49990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f49991g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f49995k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f49988d = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f49992h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f49993i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f49994j = -1;

    public String getAddressee() {
        return this.f49990f;
    }

    public int getChecksum() {
        return this.f49994j;
    }

    public String getFileId() {
        return this.f49986b;
    }

    public String getFileName() {
        return this.f49991g;
    }

    public long getFileSize() {
        return this.f49992h;
    }

    @Deprecated
    public int[] getOptionalData() {
        return this.f49995k;
    }

    public int getSegmentCount() {
        return this.f49988d;
    }

    public int getSegmentIndex() {
        return this.f49985a;
    }

    public String getSender() {
        return this.f49989e;
    }

    public long getTimestamp() {
        return this.f49993i;
    }

    public boolean isLastSegment() {
        return this.f49987c;
    }

    public void setAddressee(String str) {
        this.f49990f = str;
    }

    public void setChecksum(int i10) {
        this.f49994j = i10;
    }

    public void setFileId(String str) {
        this.f49986b = str;
    }

    public void setFileName(String str) {
        this.f49991g = str;
    }

    public void setFileSize(long j10) {
        this.f49992h = j10;
    }

    public void setLastSegment(boolean z10) {
        this.f49987c = z10;
    }

    @Deprecated
    public void setOptionalData(int[] iArr) {
        this.f49995k = iArr;
    }

    public void setSegmentCount(int i10) {
        this.f49988d = i10;
    }

    public void setSegmentIndex(int i10) {
        this.f49985a = i10;
    }

    public void setSender(String str) {
        this.f49989e = str;
    }

    public void setTimestamp(long j10) {
        this.f49993i = j10;
    }
}
