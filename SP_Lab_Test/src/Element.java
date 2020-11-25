public interface Element {
    default double getPret() { throw new UnsupportedOperationException(); }
}
