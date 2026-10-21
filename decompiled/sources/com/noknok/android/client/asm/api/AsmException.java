package com.noknok.android.client.asm.api;

import androidx.camera.camera2.internal.h0;
import com.noknok.android.client.asm.api.uaf.json.Extension;
import com.noknok.android.client.utils.Outcome;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class AsmException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f63109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Outcome f63110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Extension> f63111c;

    public AsmException(Outcome outcome) {
        super(outcome.name());
        this.f63111c = null;
        this.f63110b = outcome;
    }

    public Outcome error() {
        return this.f63110b;
    }

    public String getDetails() {
        return this.f63109a;
    }

    public List<Extension> getExtensions() {
        return this.f63111c;
    }

    public AsmException setDetails(String str) {
        this.f63109a = str;
        return this;
    }

    public AsmException setExtensions(List<Extension> list) {
        this.f63111c = list;
        return this;
    }

    public AsmException(Outcome outcome, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(outcome.name());
        sb2.append(str != null ? h0.b(" (", str, ")") : "");
        super(sb2.toString());
        this.f63111c = null;
        this.f63110b = outcome;
    }

    public AsmException(Outcome outcome, String str, Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(outcome.name());
        sb2.append(str != null ? h0.b(" (", str, ")") : "");
        super(sb2.toString(), th2);
        this.f63111c = null;
        this.f63110b = outcome;
    }

    public AsmException(Outcome outcome, Throwable th2) {
        super(outcome.name(), th2);
        this.f63111c = null;
        this.f63110b = outcome;
    }
}
