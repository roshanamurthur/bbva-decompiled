package com.adobe.marketing.mobile;

import java.util.ArrayList;
import java.util.List;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
final class VectorVariant extends Variant {
    private ArrayList<Variant> values;

    private VectorVariant(List<Variant> list) {
        if (list == null) {
            throw new IllegalArgumentException();
        }
        this.values = new ArrayList<>();
        for (Variant variant : list) {
            if (variant == null) {
                this.values.add(Variant.fromNull());
            } else {
                this.values.add(variant);
            }
        }
    }

    public static VectorVariant from(List<Variant> list) {
        return new VectorVariant(list);
    }

    @Override // com.adobe.marketing.mobile.Variant
    public VariantKind getKind() {
        return VariantKind.VECTOR;
    }

    @Override // com.adobe.marketing.mobile.Variant
    public List<Variant> getVariantList() {
        return new ArrayList(this.values);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(Constant.BRACKET_OPEN);
        boolean z10 = true;
        for (Variant variant : this.values) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(",");
            }
            sb2.append(variant.toString());
        }
        sb2.append(Constant.BRACKET_CLOSE);
        return sb2.toString();
    }

    @Override // com.adobe.marketing.mobile.Variant
    /* JADX INFO: renamed from: clone */
    public VectorVariant mo4852clone() {
        return new VectorVariant(this);
    }

    private VectorVariant(VectorVariant vectorVariant) {
        if (vectorVariant != null) {
            this.values = vectorVariant.values;
            return;
        }
        throw new IllegalArgumentException();
    }
}
