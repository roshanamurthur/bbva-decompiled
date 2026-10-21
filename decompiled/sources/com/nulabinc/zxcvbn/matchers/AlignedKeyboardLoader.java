package com.nulabinc.zxcvbn.matchers;

import com.nulabinc.zxcvbn.io.Resource;

/* JADX INFO: loaded from: classes11.dex */
public class AlignedKeyboardLoader extends KeyboardLoader {
    public AlignedKeyboardLoader(String str, Resource resource) {
        super(str, resource);
    }

    @Override // com.nulabinc.zxcvbn.matchers.KeyboardLoader
    public Keyboard.AdjacentGraphBuilder buildAdjacentGraphBuilder(String str) {
        return new AlignedAdjacentGraphBuilder(str);
    }
}
