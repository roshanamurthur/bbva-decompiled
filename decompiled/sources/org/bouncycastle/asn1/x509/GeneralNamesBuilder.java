package org.bouncycastle.asn1.x509;

import java.util.Vector;

/* JADX INFO: loaded from: classes12.dex */
public class GeneralNamesBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Vector f87628a = new Vector();

    public GeneralNamesBuilder addName(GeneralName generalName) {
        this.f87628a.addElement(generalName);
        return this;
    }

    public GeneralNamesBuilder addNames(GeneralNames generalNames) {
        GeneralName[] names = generalNames.getNames();
        for (int i10 = 0; i10 != names.length; i10++) {
            this.f87628a.addElement(names[i10]);
        }
        return this;
    }

    public GeneralNames build() {
        Vector vector = this.f87628a;
        int size = vector.size();
        GeneralName[] generalNameArr = new GeneralName[size];
        for (int i10 = 0; i10 != size; i10++) {
            generalNameArr[i10] = (GeneralName) vector.elementAt(i10);
        }
        return new GeneralNames(generalNameArr);
    }
}
