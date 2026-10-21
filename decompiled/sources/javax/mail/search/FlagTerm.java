package javax.mail.search;

import javax.mail.Flags;
import javax.mail.Message;
import javax.mail.MessagingException;

/* JADX INFO: loaded from: classes12.dex */
public final class FlagTerm extends SearchTerm {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f79041p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Flags f79042q0;

    public FlagTerm(Flags flags, boolean z10) {
        this.f79042q0 = flags;
        this.f79041p0 = z10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FlagTerm)) {
            return false;
        }
        FlagTerm flagTerm = (FlagTerm) obj;
        return flagTerm.f79041p0 == this.f79041p0 && flagTerm.f79042q0.equals(this.f79042q0);
    }

    public Flags getFlags() {
        return (Flags) this.f79042q0.clone();
    }

    public boolean getTestSet() {
        return this.f79041p0;
    }

    public int hashCode() {
        boolean z10 = this.f79041p0;
        Flags flags = this.f79042q0;
        return z10 ? flags.hashCode() : ~flags.hashCode();
    }

    @Override // javax.mail.search.SearchTerm
    public boolean match(Message message) {
        try {
            Flags flags = message.getFlags();
            boolean z10 = this.f79041p0;
            Flags flags2 = this.f79042q0;
            if (z10) {
                return flags.contains(flags2);
            }
            for (Flags.Flag flag : flags2.getSystemFlags()) {
                if (flags.contains(flag)) {
                    return false;
                }
            }
            String[] userFlags = flags2.getUserFlags();
            for (String str : userFlags) {
                if (flags.contains(str)) {
                    return false;
                }
            }
            return true;
        } catch (RuntimeException | MessagingException unused) {
            return false;
        }
    }
}
