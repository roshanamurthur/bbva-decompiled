package com.veridas.logger;

import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import com.veridas.logger.android.AndroidLogger;
import java.util.Comparator;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ConcurrentLoggerList.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/veridas/logger/ConcurrentLoggerList;", "Ljava/util/concurrent/ConcurrentSkipListSet;", "Lcom/veridas/logger/Logger;", "()V", "LoggerComparator", "common-logger_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ConcurrentLoggerList extends ConcurrentSkipListSet<Logger> {

    /* JADX INFO: compiled from: ConcurrentLoggerList.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/veridas/logger/ConcurrentLoggerList$LoggerComparator;", "Ljava/util/Comparator;", "Lcom/veridas/logger/Logger;", "Lkotlin/Comparator;", Parameters.DIRECTION.LEFT, Parameters.DIRECTION.RIGHT, "", "compare", "<init>", "()V", "common-logger_release"}, k = 1, mv = {1, 9, 0})
    public static final class LoggerComparator implements Comparator<Logger> {
        @Override // java.util.Comparator
        public int compare(@NotNull Logger left, @NotNull Logger right) {
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            return (!(left instanceof AndroidLogger) ? 1 : 0) - (!(right instanceof AndroidLogger) ? 1 : 0);
        }
    }

    public ConcurrentLoggerList() {
        super(new LoggerComparator());
    }

    public /* bridge */ boolean contains(Logger logger) {
        return super.contains((Object) logger);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ boolean remove(Logger logger) {
        return super.remove((Object) logger);
    }

    @Override // java.util.concurrent.ConcurrentSkipListSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.concurrent.ConcurrentSkipListSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof Logger)) {
            return contains((Logger) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.ConcurrentSkipListSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null || (obj instanceof Logger)) {
            return remove((Logger) obj);
        }
        return false;
    }
}
