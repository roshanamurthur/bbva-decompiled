package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class t extends setImageTintList {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(@NotNull setFindListener setfindlistener) {
        super(setfindlistener, new byte[0]);
        Intrinsics.checkNotNullParameter(setfindlistener, "");
        if (setfindlistener.setOnFocusChangeListener() != -1) {
            setX(new byte[setfindlistener.setOnFocusChangeListener()]);
        }
    }
}
