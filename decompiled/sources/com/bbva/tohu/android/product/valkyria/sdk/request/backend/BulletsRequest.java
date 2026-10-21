package com.bbva.tohu.android.product.valkyria.sdk.request.backend;

import bc.org.bouncycastle.math.ec.custom.sec.a;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class BulletsRequest {
    private List<BulletActiveRequest> activated;
    private List<BulletUsedRequest> used;

    public List<BulletActiveRequest> getActivated() {
        return this.activated;
    }

    public List<BulletUsedRequest> getUsed() {
        return this.used;
    }

    public List<BulletUsedRequest> getUsedBulletList() {
        return this.used;
    }

    public void setActivated(List<BulletActiveRequest> list) {
        this.activated = list;
    }

    public void setUsed(List<BulletUsedRequest> list) {
        this.used = list;
    }

    public void setUsedBulletList(List<BulletUsedRequest> list) {
        this.used = list;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BulletsRequest{active=");
        sb2.append(this.activated);
        sb2.append(", used=");
        return a.c(sb2, this.used, AbstractJsonLexerKt.END_OBJ);
    }
}
