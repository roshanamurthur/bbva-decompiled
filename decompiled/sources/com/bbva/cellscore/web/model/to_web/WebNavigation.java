package com.bbva.cellscore.web.model.to_web;

import android.os.Bundle;
import com.bbva.cellscore.web.navigation.Route;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class WebNavigation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Route f27170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NavigationOptions f27171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f27172d;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f27173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Route f27174b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public NavigationOptions f27175c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Bundle f27176d;

        public WebNavigation build() {
            WebNavigation webNavigation = new WebNavigation();
            webNavigation.f27169a = this.f27173a;
            webNavigation.f27170b = this.f27174b;
            webNavigation.f27171c = this.f27175c;
            webNavigation.f27172d = this.f27176d;
            return webNavigation;
        }

        public Builder nativeContainer(Route route) {
            this.f27174b = route;
            return this;
        }

        public Builder nativePayload(Bundle bundle) {
            this.f27176d = bundle;
            return this;
        }

        public Builder navOptions(NavigationOptions navigationOptions) {
            this.f27175c = navigationOptions;
            return this;
        }

        public Builder route(String str) {
            this.f27173a = str;
            return this;
        }
    }

    public WebNavigation(String str) {
        this.f27169a = str;
    }

    public Route getNativeContainer() {
        return this.f27170b;
    }

    public NavigationOptions getNavOptions() {
        return this.f27171c;
    }

    public Bundle getPayload() {
        Bundle bundle = this.f27172d;
        return bundle == null ? new Bundle() : bundle;
    }

    public String getRoute() {
        return this.f27169a;
    }

    public String toString() {
        return "WebNavigation{route='" + this.f27169a + "', nativeContainer=" + this.f27170b + ", navOptions=" + this.f27171c + ", payload=" + this.f27172d + AbstractJsonLexerKt.END_OBJ;
    }
}
