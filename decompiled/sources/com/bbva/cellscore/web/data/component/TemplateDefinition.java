package com.bbva.cellscore.web.data.component;

import android.os.Parcelable;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class TemplateDefinition implements Parcelable {
    public static TemplateDefinition create(String str) {
        return new AutoValue_TemplateDefinition(str);
    }

    public static TemplateDefinition empty() {
        return new AutoValue_TemplateDefinition("");
    }

    public abstract String tag();
}
