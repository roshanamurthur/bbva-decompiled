package p1;

import androidx.compose.runtime.State;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;

/* JADX INFO: compiled from: FontFamily.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c {
    public static /* synthetic */ State a(FontFamily.Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
        }
        if ((i12 & 1) != 0) {
            fontFamily = null;
        }
        if ((i12 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i12 & 4) != 0) {
            i10 = FontStyle.INSTANCE.m4067getNormal_LCdwA();
        }
        if ((i12 & 8) != 0) {
            i11 = FontSynthesis.INSTANCE.m4077getAllGVVA2EU();
        }
        return resolver.mo4038resolveDPcqOEQ(fontFamily, fontWeight, i10, i11);
    }
}
