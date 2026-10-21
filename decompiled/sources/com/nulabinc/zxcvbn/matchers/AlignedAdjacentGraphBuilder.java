package com.nulabinc.zxcvbn.matchers;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class AlignedAdjacentGraphBuilder extends Keyboard.AdjacentGraphBuilder {
    public AlignedAdjacentGraphBuilder(String str) {
        super(str);
    }

    @Override // com.nulabinc.zxcvbn.matchers.Keyboard.AdjacentGraphBuilder
    public int calcSlant(int i10) {
        return 0;
    }

    @Override // com.nulabinc.zxcvbn.matchers.Keyboard.AdjacentGraphBuilder
    public List<Keyboard.AdjacentGraphBuilder.c> getAdjacentCoords(Keyboard.AdjacentGraphBuilder.c cVar) {
        int i10 = cVar.f63684a;
        int i11 = cVar.f63685b;
        return Arrays.asList(new Keyboard.AdjacentGraphBuilder.c(i10 - 1, i11), new Keyboard.AdjacentGraphBuilder.c(i10 - 1, i11 - 1), new Keyboard.AdjacentGraphBuilder.c(i10, i11 - 1), new Keyboard.AdjacentGraphBuilder.c(i10 + 1, i11 - 1), new Keyboard.AdjacentGraphBuilder.c(i10 + 1, i11), new Keyboard.AdjacentGraphBuilder.c(i10 + 1, i11 + 1), new Keyboard.AdjacentGraphBuilder.c(i10, i11 + 1), new Keyboard.AdjacentGraphBuilder.c(i10 - 1, i11 + 1));
    }

    @Override // com.nulabinc.zxcvbn.matchers.Keyboard.AdjacentGraphBuilder
    public boolean isSlanted() {
        return false;
    }
}
