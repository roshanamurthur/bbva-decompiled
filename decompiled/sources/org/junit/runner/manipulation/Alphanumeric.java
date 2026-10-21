package org.junit.runner.manipulation;

import java.util.Comparator;
import org.junit.runner.Description;

/* JADX INFO: loaded from: classes13.dex */
public final class Alphanumeric extends Sorter implements Ordering.Factory {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final a f91991q0 = new a();

    public static class a implements Comparator<Description> {
        @Override // java.util.Comparator
        public final int compare(Description description, Description description2) {
            return description.getDisplayName().compareTo(description2.getDisplayName());
        }
    }

    public Alphanumeric() {
        super(f91991q0);
    }

    @Override // org.junit.runner.manipulation.Ordering.Factory
    public Ordering create(Ordering.Context context) {
        return this;
    }
}
