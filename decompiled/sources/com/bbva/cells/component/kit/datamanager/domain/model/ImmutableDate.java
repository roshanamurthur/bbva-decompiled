package com.bbva.cells.component.kit.datamanager.domain.model;

import android.os.Parcelable;
import com.google.auto.value.AutoValue;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class ImmutableDate implements Parcelable {
    public static ImmutableDate create(String str, Date date) {
        return new AutoValue_ImmutableDate(str, date);
    }

    public static ImmutableDate empty() {
        return new AutoValue_ImmutableDate("", new Date());
    }

    public abstract String formatted();

    public abstract Date value();
}
