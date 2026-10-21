package com.mypinpad.tsdk.isolation;

import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.web.model.channel.WebChannel;
import com.bbva.glomohybrid.base.extensions.ChannelsExtensionsKt;
import com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebGlobalViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class z1 implements Reaction.ReactionExecution {
    public static int a(float f6, int i10, int i11) {
        return (Float.floatToIntBits(f6) + i10) * i11;
    }

    public static Channel b(String str, String str2) {
        WebChannel webChannelCreate = new WebChannel.Builder(str).create();
        Intrinsics.checkNotNullExpressionValue(webChannelCreate, str2);
        return ChannelsExtensionsKt.autoClean(webChannelCreate);
    }

    public static String c(String str, int i10, String str2, String str3, String str4) {
        return str + i10 + str2 + str3 + str4;
    }

    public static short d(a2 a2Var, Object[] objArr, int i10, int i11) {
        return a2.c(objArr, i10, i11, System.identityHashCode(a2Var)).shortValue();
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public void execute(Object obj, Object obj2) {
        ((CellsWebGlobalViewModel) obj).onRateApp();
    }
}
