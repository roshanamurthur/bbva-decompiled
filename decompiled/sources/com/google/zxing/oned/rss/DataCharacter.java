package com.google.zxing.oned.rss;

import androidx.activity.a;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;

/* JADX INFO: loaded from: classes10.dex */
public class DataCharacter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49960b;

    public DataCharacter(int i10, int i11) {
        this.f49959a = i10;
        this.f49960b = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DataCharacter)) {
            return false;
        }
        DataCharacter dataCharacter = (DataCharacter) obj;
        return this.f49959a == dataCharacter.f49959a && this.f49960b == dataCharacter.f49960b;
    }

    public final int getChecksumPortion() {
        return this.f49960b;
    }

    public final int getValue() {
        return this.f49959a;
    }

    public final int hashCode() {
        return this.f49959a ^ this.f49960b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f49959a);
        sb2.append("(");
        return a.d(sb2, this.f49960b, RootService.CLOSE_BRACKET);
    }
}
