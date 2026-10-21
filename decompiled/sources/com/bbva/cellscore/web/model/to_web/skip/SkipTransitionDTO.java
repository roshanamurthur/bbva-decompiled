package com.bbva.cellscore.web.model.to_web.skip;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import bc.org.bouncycastle.math.ec.custom.sec.a;
import com.google.gson.annotations.SerializedName;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class SkipTransitionDTO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("from")
    private final String f27178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(TypedValues.TransitionType.S_TO)
    private final String f27179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("skipHistory")
    private final boolean f27180c;

    public SkipTransitionDTO(String str, String str2, boolean z10) {
        this.f27178a = str;
        this.f27179b = str2;
        this.f27180c = z10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SkipTransitionDTO{from='");
        sb2.append(this.f27178a);
        sb2.append("', to='");
        sb2.append(this.f27179b);
        sb2.append("', skipHistory=");
        return a.d(sb2, this.f27180c, AbstractJsonLexerKt.END_OBJ);
    }
}
