package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes.dex */
public class CLParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18970b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18971c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a ARRAY;
        public static final a KEY;
        public static final a NUMBER;
        public static final a OBJECT;
        public static final a STRING;
        public static final a TOKEN;
        public static final a UNKNOWN;

        static {
            a aVar = new a("UNKNOWN", 0);
            UNKNOWN = aVar;
            a aVar2 = new a("OBJECT", 1);
            OBJECT = aVar2;
            a aVar3 = new a("ARRAY", 2);
            ARRAY = aVar3;
            a aVar4 = new a("NUMBER", 3);
            NUMBER = aVar4;
            a aVar5 = new a("STRING", 4);
            STRING = aVar5;
            a aVar6 = new a("KEY", 5);
            KEY = aVar6;
            a aVar7 = new a("TOKEN", 6);
            TOKEN = aVar7;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public CLParser(String str) {
        this.f18969a = str;
    }

    public static CLObject parse(String str) throws CLParsingException {
        return new CLParser(str).parse();
    }

    public final CLElement a(CLElement cLElement, int i10, a aVar, char[] cArr) {
        CLElement cLElementAllocate;
        switch (aVar.ordinal()) {
            case 1:
                cLElementAllocate = CLObject.allocate(cArr);
                i10++;
                break;
            case 2:
                cLElementAllocate = CLArray.allocate(cArr);
                i10++;
                break;
            case 3:
                cLElementAllocate = CLNumber.allocate(cArr);
                break;
            case 4:
                cLElementAllocate = CLString.allocate(cArr);
                break;
            case 5:
                cLElementAllocate = CLKey.allocate(cArr);
                break;
            case 6:
                cLElementAllocate = CLToken.allocate(cArr);
                break;
            default:
                cLElementAllocate = null;
                break;
        }
        if (cLElementAllocate == null) {
            return null;
        }
        cLElementAllocate.setLine(this.f18971c);
        cLElementAllocate.setStart(i10);
        if (cLElement instanceof CLContainer) {
            cLElementAllocate.setContainer((CLContainer) cLElement);
        }
        return cLElementAllocate;
    }

    public final CLElement b(int i10, char c10, CLElement cLElement, char[] cArr) throws CLParsingException {
        if (c10 == '\t' || c10 == '\n' || c10 == '\r' || c10 == ' ') {
            return cLElement;
        }
        if (c10 == '\"' || c10 == '\'') {
            return cLElement instanceof CLObject ? a(cLElement, i10, a.KEY, cArr) : a(cLElement, i10, a.STRING, cArr);
        }
        if (c10 == '[') {
            return a(cLElement, i10, a.ARRAY, cArr);
        }
        if (c10 != ']') {
            if (c10 == '{') {
                return a(cLElement, i10, a.OBJECT, cArr);
            }
            if (c10 != '}') {
                switch (c10) {
                    case '+':
                    case '-':
                    case '.':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        return a(cLElement, i10, a.NUMBER, cArr);
                    case ',':
                    case ':':
                        return cLElement;
                    case '/':
                        int i11 = i10 + 1;
                        if (i11 >= cArr.length || cArr[i11] != '/') {
                            return cLElement;
                        }
                        this.f18970b = true;
                        return cLElement;
                    default:
                        if (!(cLElement instanceof CLContainer) || (cLElement instanceof CLObject)) {
                            return a(cLElement, i10, a.KEY, cArr);
                        }
                        CLElement cLElementA = a(cLElement, i10, a.TOKEN, cArr);
                        CLToken cLToken = (CLToken) cLElementA;
                        if (cLToken.validate(c10, i10)) {
                            return cLElementA;
                        }
                        throw new CLParsingException("incorrect token <" + c10 + "> at line " + this.f18971c, cLToken);
                }
            }
        }
        cLElement.setEnd(i10 - 1);
        CLElement container = cLElement.getContainer();
        container.setEnd(i10);
        return container;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0149 A[EDGE_INSN: B:103:0x0149->B:113:? BREAK  A[LOOP:1: B:14:0x0036->B:86:0x0143], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX WARN: Code duplicated, block: B:32:0x006f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0092  */
    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00de  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:76:0x0118  */
    /* JADX WARN: Code duplicated, block: B:78:0x0123  */
    public CLObject parse() throws CLParsingException {
        boolean z10;
        long j10;
        char c10;
        long j11;
        CLToken cLToken;
        long j12;
        char[] charArray = this.f18969a.toCharArray();
        int length = charArray.length;
        int i10 = 1;
        this.f18971c = 1;
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            char c11 = charArray[i11];
            if (c11 == '{') {
                break;
            }
            if (c11 == '\n') {
                this.f18971c++;
            }
            i11++;
        }
        if (i11 == -1) {
            throw new CLParsingException("invalid json content", null);
        }
        CLObject cLObjectAllocate = CLObject.allocate(charArray);
        cLObjectAllocate.setLine(this.f18971c);
        cLObjectAllocate.setStart(i11);
        int i12 = i11 + 1;
        CLElement container = cLObjectAllocate;
        while (i12 < length) {
            char c12 = charArray[i12];
            if (c12 == '\n') {
                this.f18971c += i10;
            }
            if (this.f18970b) {
                if (c12 == '\n') {
                    this.f18970b = z11;
                    if (container == null) {
                        break;
                        break;
                    }
                    if (container.isDone()) {
                        container = b(i12, c12, container, charArray);
                    } else if (container instanceof CLObject) {
                        if (c12 == '}') {
                            container.setEnd(i12 - 1);
                        } else {
                            container = b(i12, c12, container, charArray);
                        }
                    } else if (container instanceof CLArray) {
                        z10 = container instanceof CLString;
                        if (z10) {
                            j12 = container.mStart;
                            if (charArray[(int) j12] == c12) {
                                container.setStart(j12 + 1);
                                container.setEnd(i12 - 1);
                            }
                        } else {
                            if (container instanceof CLToken) {
                                cLToken = (CLToken) container;
                                if (!cLToken.validate(c12, i12)) {
                                    throw new CLParsingException("parsing incorrect token " + cLToken.content() + " at line " + this.f18971c, cLToken);
                                }
                            }
                            if (container instanceof CLKey) {
                                j10 = container.mStart;
                                c10 = charArray[(int) j10];
                                if (c10 != '\'') {
                                    container.setStart(j10 + 1);
                                    container.setEnd(i12 - 1);
                                } else {
                                    container.setStart(j10 + 1);
                                    container.setEnd(i12 - 1);
                                }
                            } else {
                                j10 = container.mStart;
                                c10 = charArray[(int) j10];
                                if (c10 != '\'') {
                                    container.setStart(j10 + 1);
                                    container.setEnd(i12 - 1);
                                } else {
                                    container.setStart(j10 + 1);
                                    container.setEnd(i12 - 1);
                                }
                            }
                            if (!container.isDone()) {
                                j11 = i12 - 1;
                                container.setEnd(j11);
                                if (c12 != '}') {
                                    container = container.getContainer();
                                    container.setEnd(j11);
                                    if (container instanceof CLKey) {
                                        container = container.getContainer();
                                        container.setEnd(j11);
                                    }
                                } else {
                                    container = container.getContainer();
                                    container.setEnd(j11);
                                    if (container instanceof CLKey) {
                                        container = container.getContainer();
                                        container.setEnd(j11);
                                    }
                                }
                            }
                        }
                    } else if (c12 == ']') {
                        container.setEnd(i12 - 1);
                    } else {
                        container = b(i12, c12, container, charArray);
                    }
                    if (!container.isDone()) {
                    }
                } else {
                    continue;
                }
            } else {
                if (container == null) {
                    break;
                }
                if (container.isDone()) {
                    container = b(i12, c12, container, charArray);
                } else if (container instanceof CLObject) {
                    if (c12 == '}') {
                        container.setEnd(i12 - 1);
                    } else {
                        container = b(i12, c12, container, charArray);
                    }
                } else if (container instanceof CLArray) {
                    z10 = container instanceof CLString;
                    if (z10) {
                        j12 = container.mStart;
                        if (charArray[(int) j12] == c12) {
                            container.setStart(j12 + 1);
                            container.setEnd(i12 - 1);
                        }
                    } else {
                        if (container instanceof CLToken) {
                            cLToken = (CLToken) container;
                            if (!cLToken.validate(c12, i12)) {
                                throw new CLParsingException("parsing incorrect token " + cLToken.content() + " at line " + this.f18971c, cLToken);
                            }
                        }
                        if ((container instanceof CLKey) || z10) {
                            j10 = container.mStart;
                            c10 = charArray[(int) j10];
                            if ((c10 != '\'' || c10 == '\"') && c10 == c12) {
                                container.setStart(j10 + 1);
                                container.setEnd(i12 - 1);
                            }
                        }
                        if (!container.isDone() && (c12 == '}' || c12 == ']' || c12 == ',' || c12 == ' ' || c12 == '\t' || c12 == '\r' || c12 == '\n' || c12 == ':')) {
                            j11 = i12 - 1;
                            container.setEnd(j11);
                            if (c12 != '}' || c12 == ']') {
                                container = container.getContainer();
                                container.setEnd(j11);
                                if (container instanceof CLKey) {
                                    container = container.getContainer();
                                    container.setEnd(j11);
                                }
                            }
                        }
                    }
                } else if (c12 == ']') {
                    container.setEnd(i12 - 1);
                } else {
                    container = b(i12, c12, container, charArray);
                }
                if (!container.isDone() && (!(container instanceof CLKey) || ((CLKey) container).f18962r0.size() > 0)) {
                    container = container.getContainer();
                }
            }
            i12++;
            i10 = 1;
            z11 = false;
        }
        while (container != null && !container.isDone()) {
            if (container instanceof CLString) {
                container.setStart(((int) container.mStart) + 1);
            }
            container.setEnd(length - 1);
            container = container.getContainer();
        }
        return cLObjectAllocate;
    }
}
