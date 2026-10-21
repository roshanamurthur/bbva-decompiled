package com.noknok.android.client.asm.sdk;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class UVTMatcherOutParams extends IMatcher.MatcherOutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f63303a;

    public UVTMatcherOutParams(IMatcher.RESULT result, byte[] bArr, List<IMatcher.Extension> list, byte[] bArr2) {
        super(result, bArr, list);
        this.f63303a = bArr2;
    }

    public byte[] getUVT() {
        return this.f63303a;
    }

    public UVTMatcherOutParams setMatchResult(IMatcher.RESULT result) {
        this.m_MatchResult = result;
        return this;
    }

    public UVTMatcherOutParams setUVT(byte[] bArr) {
        this.f63303a = bArr;
        return this;
    }

    public UVTMatcherOutParams setUserID(byte[] bArr) {
        this.m_UserID = bArr;
        return this;
    }

    public UVTMatcherOutParams() {
    }
}
