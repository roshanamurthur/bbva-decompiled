package com.bbva.cellscore.web.model.to_web;

import bc.org.bouncycastle.math.ec.custom.sec.a;
import com.google.gson.annotations.SerializedName;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationOptions {

    @SerializedName("skipHistory")
    public boolean skipHistory;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f27166a;

        public NavigationOptions build() {
            NavigationOptions navigationOptions = new NavigationOptions();
            navigationOptions.skipHistory = this.f27166a;
            return navigationOptions;
        }

        public Builder skipHistory(boolean z10) {
            this.f27166a = z10;
            return this;
        }
    }

    public static NavigationOptions skipHistory(boolean z10) {
        return new Builder().skipHistory(z10).build();
    }

    public String toString() {
        return a.d(new StringBuilder("NavigationOptions{skipHistory="), this.skipHistory, AbstractJsonLexerKt.END_OBJ);
    }
}
