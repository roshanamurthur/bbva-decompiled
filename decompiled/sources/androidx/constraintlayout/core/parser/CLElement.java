package androidx.constraintlayout.core.parser;

import androidx.annotation.NonNull;
import androidx.collection.h;
import java.util.Arrays;
import java.util.Objects;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes.dex */
public class CLElement implements Cloneable {
    protected static int sBaseIndent = 2;
    protected static int sMaxLine = 80;
    protected CLContainer mContainer;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final char[] f18963p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f18964q0;
    protected long mStart = -1;
    protected long mEnd = Long.MAX_VALUE;

    public CLElement(char[] cArr) {
        this.f18963p0 = cArr;
    }

    public void addIndent(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(' ');
        }
    }

    public String content() {
        String str = new String(this.f18963p0);
        if (str.length() < 1) {
            return "";
        }
        long j10 = this.mEnd;
        if (j10 != Long.MAX_VALUE) {
            long j11 = this.mStart;
            if (j10 >= j11) {
                return str.substring((int) j11, ((int) j10) + 1);
            }
        }
        long j12 = this.mStart;
        return str.substring((int) j12, ((int) j12) + 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CLElement)) {
            return false;
        }
        CLElement cLElement = (CLElement) obj;
        if (this.mStart == cLElement.mStart && this.mEnd == cLElement.mEnd && this.f18964q0 == cLElement.f18964q0 && Arrays.equals(this.f18963p0, cLElement.f18963p0)) {
            return Objects.equals(this.mContainer, cLElement.mContainer);
        }
        return false;
    }

    public CLElement getContainer() {
        return this.mContainer;
    }

    public String getDebugName() {
        return "";
    }

    public long getEnd() {
        return this.mEnd;
    }

    public float getFloat() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getFloat();
        }
        return Float.NaN;
    }

    public int getInt() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getInt();
        }
        return 0;
    }

    public int getLine() {
        return this.f18964q0;
    }

    public long getStart() {
        return this.mStart;
    }

    public String getStrClass() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    public boolean hasContent() {
        char[] cArr = this.f18963p0;
        return cArr != null && cArr.length >= 1;
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.f18963p0) * 31;
        long j10 = this.mStart;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.mEnd;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        CLContainer cLContainer = this.mContainer;
        return ((i11 + (cLContainer != null ? cLContainer.hashCode() : 0)) * 31) + this.f18964q0;
    }

    public boolean isDone() {
        return this.mEnd != Long.MAX_VALUE;
    }

    public boolean isStarted() {
        return this.mStart > -1;
    }

    public boolean notStarted() {
        return this.mStart == -1;
    }

    public void setContainer(CLContainer cLContainer) {
        this.mContainer = cLContainer;
    }

    public void setEnd(long j10) {
        if (this.mEnd != Long.MAX_VALUE) {
            return;
        }
        this.mEnd = j10;
        CLContainer cLContainer = this.mContainer;
        if (cLContainer != null) {
            cLContainer.add(this);
        }
    }

    public void setLine(int i10) {
        this.f18964q0 = i10;
    }

    public void setStart(long j10) {
        this.mStart = j10;
    }

    public String toFormattedJSON(int i10, int i11) {
        return "";
    }

    public String toJSON() {
        return "";
    }

    public String toString() {
        long j10 = this.mStart;
        long j11 = this.mEnd;
        if (j10 > j11 || j11 == Long.MAX_VALUE) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass());
            sb2.append(" (INVALID, ");
            sb2.append(this.mStart);
            sb2.append(Constant.DASH_STRING);
            return h.d(sb2, this.mEnd, ")");
        }
        return getStrClass() + " (" + this.mStart + " : " + this.mEnd + ") <<" + new String(this.f18963p0).substring((int) this.mStart, ((int) this.mEnd) + 1) + ">>";
    }

    @Override // 
    @NonNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public CLElement mo4633clone() {
        try {
            return (CLElement) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }
}
