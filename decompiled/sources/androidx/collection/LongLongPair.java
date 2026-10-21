package androidx.collection;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.noknok.android.client.utils.UIConfigTags;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LongLongPair.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002H\u0086\nJ\t\u0010\u0004\u001a\u00020\u0002H\u0086\nJ\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0016"}, d2 = {"Landroidx/collection/LongLongPair;", "", "", "component1", "component2", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "a", "J", "getFirst", "()J", "first", "b", "getSecond", UIConfigTags.TAG_SECOND, "<init>", "(JJ)V", "collection"}, k = 1, mv = {1, 8, 0})
public final class LongLongPair {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long first;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long second;

    public LongLongPair(long j10, long j11) {
        this.first = j10;
        this.second = j11;
    }

    public final long component1() {
        return getFirst();
    }

    public final long component2() {
        return getSecond();
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof LongLongPair)) {
            return false;
        }
        LongLongPair longLongPair = (LongLongPair) other;
        return longLongPair.first == this.first && longLongPair.second == this.second;
    }

    public final long getFirst() {
        return this.first;
    }

    public final long getSecond() {
        return this.second;
    }

    public int hashCode() {
        long j10 = this.first;
        int i10 = (int) (j10 ^ (j10 >>> 32));
        long j11 = this.second;
        return i10 ^ ((int) ((j11 >>> 32) ^ j11));
    }

    @NotNull
    public String toString() {
        return "(" + this.first + ", " + this.second + RootService.CLOSE_BRACKET;
    }
}
